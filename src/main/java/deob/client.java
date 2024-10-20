package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class53 implements class294 {

    @ObfuscatedName("client.w")
    public static class172[] field641 = new class172[4];

    @ObfuscatedName("client.af")
    public static boolean field858 = true;

    @ObfuscatedName("client.bf")
    public static int field630 = 1;

    @ObfuscatedName("client.bi")
    public static int field631 = 0;

    @ObfuscatedName("client.bu")
    public static int field679 = 0;

    @ObfuscatedName("client.bj")
    public static boolean field851 = false;

    @ObfuscatedName("client.bm")
    public static boolean field826 = false;

    @ObfuscatedName("client.bv")
    public static int field884 = 0;

    @ObfuscatedName("client.bk")
    public static int field636 = -1;

    @ObfuscatedName("client.bt")
    public static boolean field637 = false;

    @ObfuscatedName("client.bs")
    public static int field638 = 0;

    @ObfuscatedName("client.cu")
    public static boolean field640 = true;

    @ObfuscatedName("client.cr")
    public static int field899 = 0;

    @ObfuscatedName("client.ca")
    public static long field805 = -1L;

    @ObfuscatedName("client.co")
    public static int field696 = -1;

    @ObfuscatedName("client.cz")
    public static int field644 = -1;

    @ObfuscatedName("client.cd")
    public static long field797 = -1L;

    @ObfuscatedName("client.cn")
    public static boolean field646 = true;

    @ObfuscatedName("client.ci")
    public static boolean field647 = false;

    @ObfuscatedName("client.cl")
    public static int field648 = 0;

    @ObfuscatedName("client.cs")
    public static int field649 = 0;

    @ObfuscatedName("client.cp")
    public static int field650 = 0;

    @ObfuscatedName("client.cb")
    public static int field651 = 0;

    @ObfuscatedName("client.cv")
    public static int field825 = 0;

    @ObfuscatedName("client.cj")
    public static int field720 = 0;

    @ObfuscatedName("client.ct")
    public static int field654 = 0;

    @ObfuscatedName("client.cq")
    public static int field803 = 0;

    @ObfuscatedName("client.ck")
    public static int field656 = 0;

    @ObfuscatedName("client.cc")
    public static class84 field657 = class84.field1130;

    @ObfuscatedName("client.dl")
    public static class84 field715 = class84.field1130;

    @ObfuscatedName("client.dh")
    public static int field676 = 0;

    @ObfuscatedName("client.ds")
    public static int field809 = 0;

    @ObfuscatedName("client.dy")
    public static int field661 = 0;

    @ObfuscatedName("client.es")
    public static int field893 = 0;

    @ObfuscatedName("client.em")
    public static int field663 = 0;

    @ObfuscatedName("client.eb")
    public static int field686 = 0;

    @ObfuscatedName("client.ec")
    public static int field665 = 0;

    @ObfuscatedName("client.ea")
    public static int field666 = 0;

    @ObfuscatedName("client.en")
    public static class154 field667 = class154.field1987;

    @ObfuscatedName("client.ey")
    public static boolean field668 = false;

    @ObfuscatedName("client.ei")
    public static class88 field669 = new class88();

    @ObfuscatedName("client.eq")
    public static byte[] field670 = null;

    @ObfuscatedName("client.ek")
    public static class79[] field866 = new class79[32768];

    @ObfuscatedName("client.ex")
    public static int field660 = 0;

    @ObfuscatedName("client.fk")
    public static int[] field763 = new int[32768];

    @ObfuscatedName("client.fz")
    public static int field674 = 0;

    @ObfuscatedName("client.fu")
    public static int[] field675 = new int[250];

    @ObfuscatedName("client.fi")
    public static final class95 field886 = new class95();

    @ObfuscatedName("client.fn")
    public static int field677 = 0;

    @ObfuscatedName("client.fm")
    public static boolean field678 = false;

    @ObfuscatedName("client.fj")
    public static boolean field734 = true;

    @ObfuscatedName("client.fl")
    public static class286 field680 = new class286();

    @ObfuscatedName("client.fa")
    public static HashMap field681 = new HashMap();

    @ObfuscatedName("client.fv")
    public static int field682 = 0;

    @ObfuscatedName("client.fg")
    public static int field775 = 1;

    @ObfuscatedName("client.fs")
    public static int field684 = 0;

    @ObfuscatedName("client.gx")
    public static int field685 = 1;

    @ObfuscatedName("client.ge")
    public static int field882 = 0;

    @ObfuscatedName("client.gk")
    public static boolean field688 = false;

    @ObfuscatedName("client.ga")
    public static int[][][] field689 = new int[4][13][13];

    @ObfuscatedName("client.gr")
    public static final int[] field690 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.gh")
    public static int field691 = 0;

    @ObfuscatedName("client.hr")
    public static int field692 = 2301979;

    @ObfuscatedName("client.hx")
    public static int field782 = 5063219;

    @ObfuscatedName("client.ht")
    public static int field695 = 3353893;

    @ObfuscatedName("client.hv")
    public static int field652 = 7759444;

    @ObfuscatedName("client.hl")
    public static boolean field728 = false;

    @ObfuscatedName("client.hp")
    public static int field698 = 0;

    @ObfuscatedName("client.hg")
    public static int field699 = 128;

    @ObfuscatedName("client.hy")
    public static int field700 = 0;

    @ObfuscatedName("client.hh")
    public static int field906 = 0;

    @ObfuscatedName("client.hd")
    public static int field702 = 0;

    @ObfuscatedName("client.hj")
    public static int field703 = 0;

    @ObfuscatedName("client.hq")
    public static int field793 = 0;

    @ObfuscatedName("client.hc")
    public static int field705 = 0;

    @ObfuscatedName("client.hw")
    public static int field706 = 50;

    @ObfuscatedName("client.hm")
    public static int field707 = 0;

    @ObfuscatedName("client.ho")
    public static int field708 = 0;

    @ObfuscatedName("client.is")
    public static int field709 = 0;

    @ObfuscatedName("client.id")
    public static int field710 = 12;

    @ObfuscatedName("client.iq")
    public static int field711 = 6;

    @ObfuscatedName("client.im")
    public static int field712 = 0;

    @ObfuscatedName("client.ir")
    public static boolean field713 = false;

    @ObfuscatedName("client.ie")
    public static int field714 = 0;

    @ObfuscatedName("client.ic")
    public static boolean field860 = false;

    @ObfuscatedName("client.iv")
    public static int field716 = 0;

    @ObfuscatedName("client.ik")
    public static int field717 = 0;

    @ObfuscatedName("client.iy")
    public static int field718 = 50;

    @ObfuscatedName("client.ih")
    public static int[] field719 = new int[field718];

    @ObfuscatedName("client.ia")
    public static int[] field868 = new int[field718];

    @ObfuscatedName("client.il")
    public static int[] field721 = new int[field718];

    @ObfuscatedName("client.in")
    public static int[] field722 = new int[field718];

    @ObfuscatedName("client.ip")
    public static int[] field658 = new int[field718];

    @ObfuscatedName("client.ib")
    public static int[] field724 = new int[field718];

    @ObfuscatedName("client.ij")
    public static int[] field725 = new int[field718];

    @ObfuscatedName("client.iw")
    public static String[] field726 = new String[field718];

    @ObfuscatedName("client.it")
    public static String field784 = null;

    @ObfuscatedName("client.if")
    public static int[][] field773 = new int[104][104];

    @ObfuscatedName("client.io")
    public static int field772 = 0;

    @ObfuscatedName("client.ig")
    public static int field865 = -1;

    @ObfuscatedName("client.iu")
    public static int field730 = -1;

    @ObfuscatedName("client.jb")
    public static int field731 = 0;

    @ObfuscatedName("client.jy")
    public static int field771 = 0;

    @ObfuscatedName("client.je")
    public static int field659 = 0;

    @ObfuscatedName("client.ja")
    public static int field733 = 0;

    @ObfuscatedName("client.jm")
    public static boolean field735 = true;

    @ObfuscatedName("client.jk")
    public static int field736 = 0;

    @ObfuscatedName("client.ji")
    public static int field737 = 0;

    @ObfuscatedName("client.jv")
    public static int field738 = 0;

    @ObfuscatedName("client.jh")
    public static int field739 = 0;

    @ObfuscatedName("client.jq")
    public static int field830 = 0;

    @ObfuscatedName("client.js")
    public static int field741 = 0;

    @ObfuscatedName("client.jz")
    public static boolean field792 = false;

    @ObfuscatedName("client.jl")
    public static int field743 = 0;

    @ObfuscatedName("client.jx")
    public static int field744 = 0;

    @ObfuscatedName("client.jt")
    public static boolean field745 = true;

    @ObfuscatedName("client.jf")
    public static class67[] field746 = new class67[2048];

    @ObfuscatedName("client.ju")
    public static int field747 = -1;

    @ObfuscatedName("client.jn")
    public static int field789 = 0;

    @ObfuscatedName("client.jp")
    public static boolean field749 = true;

    @ObfuscatedName("client.kg")
    public static int field750 = 0;

    @ObfuscatedName("client.kt")
    public static int field751 = 0;

    @ObfuscatedName("client.kx")
    public static int[] field807 = new int[1000];

    @ObfuscatedName("client.kz")
    public static final int[] field753 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.ky")
    public static String[] field754 = new String[8];

    @ObfuscatedName("client.ku")
    public static boolean[] field755 = new boolean[8];

    @ObfuscatedName("client.kr")
    public static int[] field645 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.kp")
    public static int field757 = -1;

    @ObfuscatedName("client.ka")
    public static class213[][][] field758 = new class213[4][104][104];

    @ObfuscatedName("client.kh")
    public static class213 field759 = new class213();

    @ObfuscatedName("client.kd")
    public static class213 field643 = new class213();

    @ObfuscatedName("client.kc")
    public static class213 field729 = new class213();

    @ObfuscatedName("client.kf")
    public static int[] field762 = new int[25];

    @ObfuscatedName("client.kv")
    public static int[] field632 = new int[25];

    @ObfuscatedName("client.ki")
    public static int[] field764 = new int[25];

    @ObfuscatedName("client.ks")
    public static int field765 = 0;

    @ObfuscatedName("client.kn")
    public static boolean field766 = false;

    @ObfuscatedName("client.lo")
    public static int field774 = 0;

    @ObfuscatedName("client.ls")
    public static int[] field767 = new int[500];

    @ObfuscatedName("client.lq")
    public static int[] field769 = new int[500];

    @ObfuscatedName("client.lx")
    public static int[] field770 = new int[500];

    @ObfuscatedName("client.lg")
    public static int[] field687 = new int[500];

    @ObfuscatedName("client.lb")
    public static String[] field635 = new String[500];

    @ObfuscatedName("client.lm")
    public static String[] field804 = new String[500];

    @ObfuscatedName("client.lr")
    public static boolean[] field879 = new boolean[500];

    @ObfuscatedName("client.le")
    public static boolean field701 = false;

    @ObfuscatedName("client.lt")
    public static boolean field776 = false;

    @ObfuscatedName("client.lw")
    public static boolean field777 = false;

    @ObfuscatedName("client.ll")
    public static boolean field778 = true;

    @ObfuscatedName("client.lu")
    public static int field843 = -1;

    @ObfuscatedName("client.lk")
    public static int field780 = -1;

    @ObfuscatedName("client.lf")
    public static int field781 = 0;

    @ObfuscatedName("client.lj")
    public static int field629 = 50;

    @ObfuscatedName("client.lh")
    public static int field869 = 0;

    @ObfuscatedName("client.lc")
    public static boolean field794 = false;

    @ObfuscatedName("client.li")
    public static int field786 = -1;

    @ObfuscatedName("client.mn")
    public static int field787 = -1;

    @ObfuscatedName("client.md")
    public static String field788 = null;

    @ObfuscatedName("client.mk")
    public static String field694 = null;

    @ObfuscatedName("client.mj")
    public static int field790 = -1;

    @ObfuscatedName("client.mo")
    public static class210 field693 = new class210(8);

    @ObfuscatedName("client.mr")
    public static int field756 = 0;

    @ObfuscatedName("client.mm")
    public static int field662 = -1;

    @ObfuscatedName("client.ma")
    public static int field732 = 0;

    @ObfuscatedName("client.mh")
    public static int field795 = 0;

    @ObfuscatedName("client.mx")
    public static class238 field655 = null;

    @ObfuscatedName("client.mg")
    public static int field760 = 0;

    @ObfuscatedName("client.ml")
    public static int field798 = 0;

    @ObfuscatedName("client.ms")
    public static int field821 = 0;

    @ObfuscatedName("client.mq")
    public static int field800 = -1;

    @ObfuscatedName("client.mv")
    public static boolean field801 = false;

    @ObfuscatedName("client.mp")
    public static class238 field802 = null;

    @ObfuscatedName("client.mw")
    public static class238 field823 = null;

    @ObfuscatedName("client.me")
    public static class238 field836 = null;

    @ObfuscatedName("client.mc")
    public static int field634 = 0;

    @ObfuscatedName("client.mb")
    public static int field806 = 0;

    @ObfuscatedName("client.mf")
    public static class238 field633 = null;

    @ObfuscatedName("client.nq")
    public static boolean field808 = false;

    @ObfuscatedName("client.nc")
    public static int field704 = -1;

    @ObfuscatedName("client.ne")
    public static int field810 = -1;

    @ObfuscatedName("client.nm")
    public static boolean field811 = false;

    @ObfuscatedName("client.na")
    public static int field812 = -1;

    @ObfuscatedName("client.nk")
    public static int field813 = -1;

    @ObfuscatedName("client.nj")
    public static boolean field814 = false;

    @ObfuscatedName("client.nw")
    public static int field740 = 1;

    @ObfuscatedName("client.nv")
    public static int[] field816 = new int[32];

    @ObfuscatedName("client.ng")
    public static int field817 = 0;

    @ObfuscatedName("client.ni")
    public static int[] field818 = new int[32];

    @ObfuscatedName("client.no")
    public static int field819 = 0;

    @ObfuscatedName("client.nu")
    public static int[] field820 = new int[32];

    @ObfuscatedName("client.nt")
    public static int field889 = 0;

    @ObfuscatedName("client.nb")
    public static int field822 = 0;

    @ObfuscatedName("client.ns")
    public static int field642 = 0;

    @ObfuscatedName("client.ny")
    public static int field824 = 0;

    @ObfuscatedName("client.nn")
    public static int field863 = 0;

    @ObfuscatedName("client.nh")
    public static int field752 = 0;

    @ObfuscatedName("client.nl")
    public static int field827 = 0;

    @ObfuscatedName("client.os")
    public static int field672 = 0;

    @ObfuscatedName("client.oi")
    public static class213 field829 = new class213();

    @ObfuscatedName("client.op")
    public static class213 field783 = new class213();

    @ObfuscatedName("client.ow")
    public static class213 field831 = new class213();

    @ObfuscatedName("client.oo")
    public static class210 field832 = new class210(512);

    @ObfuscatedName("client.ou")
    public static int field833 = 0;

    @ObfuscatedName("client.og")
    public static int field834 = -2;

    @ObfuscatedName("client.oa")
    public static boolean[] field835 = new boolean[100];

    @ObfuscatedName("client.oj")
    public static boolean[] field885 = new boolean[100];

    @ObfuscatedName("client.or")
    public static boolean[] field837 = new boolean[100];

    @ObfuscatedName("client.oz")
    public static int[] field838 = new int[100];

    @ObfuscatedName("client.ov")
    public static int[] field839 = new int[100];

    @ObfuscatedName("client.ob")
    public static int[] field840 = new int[100];

    @ObfuscatedName("client.oe")
    public static int[] field841 = new int[100];

    @ObfuscatedName("client.ox")
    public static int field842 = 0;

    @ObfuscatedName("client.om")
    public static long field791 = 0L;

    @ObfuscatedName("client.oy")
    public static boolean field844 = true;

    @ObfuscatedName("client.pg")
    public static int[] field845 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.ph")
    public static int field846 = 0;

    @ObfuscatedName("client.pk")
    public static int field847 = 0;

    @ObfuscatedName("client.pv")
    public static String field859 = "";

    @ObfuscatedName("client.pf")
    public static long[] field849 = new long[100];

    @ObfuscatedName("client.pn")
    public static int field850 = 0;

    @ObfuscatedName("client.po")
    public static int field673 = 0;

    @ObfuscatedName("client.pm")
    public static int[] field852 = new int[128];

    @ObfuscatedName("client.pt")
    public static int[] field853 = new int[128];

    @ObfuscatedName("client.pz")
    public static long field854 = -1L;

    @ObfuscatedName("client.px")
    public static int field855 = -1;

    @ObfuscatedName("client.pi")
    public static int field856 = 0;

    @ObfuscatedName("client.ps")
    public static int[] field723 = new int[1000];

    @ObfuscatedName("client.pq")
    public static int[] field748 = new int[1000];

    @ObfuscatedName("client.py")
    public static class327[] field796 = new class327[1000];

    @ObfuscatedName("client.pc")
    public static int field828 = 0;

    @ObfuscatedName("client.pw")
    public static int field861 = 0;

    @ObfuscatedName("client.qh")
    public static int field862 = 0;

    @ObfuscatedName("client.qc")
    public static int field761 = 255;

    @ObfuscatedName("client.qa")
    public static int field864 = -1;

    @ObfuscatedName("client.qm")
    public static boolean field664 = false;

    @ObfuscatedName("client.qf")
    public static int field857 = 127;

    @ObfuscatedName("client.qw")
    public static int field867 = 127;

    @ObfuscatedName("client.qp")
    public static int field768 = 0;

    @ObfuscatedName("client.qx")
    public static int[] field785 = new int[50];

    @ObfuscatedName("client.qe")
    public static int[] field870 = new int[50];

    @ObfuscatedName("client.qs")
    public static int[] field871 = new int[50];

    @ObfuscatedName("client.qz")
    public static int[] field872 = new int[50];

    @ObfuscatedName("client.qk")
    public static class99[] field873 = new class99[50];

    @ObfuscatedName("client.qt")
    public static boolean field874 = false;

    @ObfuscatedName("client.rn")
    public static boolean[] field875 = new boolean[5];

    @ObfuscatedName("client.rg")
    public static int[] field876 = new int[5];

    @ObfuscatedName("client.ru")
    public static int[] field877 = new int[5];

    @ObfuscatedName("client.rl")
    public static int[] field878 = new int[5];

    @ObfuscatedName("client.re")
    public static int[] field891 = new int[5];

    @ObfuscatedName("client.rm")
    public static short field880 = 256;

    @ObfuscatedName("client.rh")
    public static short field881 = 205;

    @ObfuscatedName("client.rj")
    public static short field779 = 256;

    @ObfuscatedName("client.ro")
    public static short field727 = 320;

    @ObfuscatedName("client.ra")
    public static short field815 = 1;

    @ObfuscatedName("client.rd")
    public static short field848 = 32767;

    @ObfuscatedName("client.ry")
    public static short field683 = 1;

    @ObfuscatedName("client.rt")
    public static short field883 = 32767;

    @ObfuscatedName("client.rf")
    public static int field888 = 0;

    @ObfuscatedName("client.rw")
    public static int field887 = 0;

    @ObfuscatedName("client.rb")
    public static int field890 = 0;

    @ObfuscatedName("client.rx")
    public static int field742 = 0;

    @ObfuscatedName("client.rr")
    public static int field892 = 0;

    @ObfuscatedName("client.rk")
    public static class235 field671 = new class235();

    @ObfuscatedName("client.sl")
    public static int field894 = -1;

    @ObfuscatedName("client.sk")
    public static int field895 = -1;

    @ObfuscatedName("client.sa")
    public static class330 field896 = new class329();

    @ObfuscatedName("client.st")
    public static class10[] field897 = new class10[8];

    @ObfuscatedName("client.sq")
    public static class68 field799 = new class68();

    @ObfuscatedName("client.sw")
    public static int field900 = -1;

    @ObfuscatedName("client.sd")
    public static ArrayList field901 = new ArrayList(10);

    @ObfuscatedName("client.su")
    public static int field902 = 0;

    @ObfuscatedName("client.ts")
    public static final class66 field903 = new class66();

    @ObfuscatedName("client.tt")
    public static int[] field904 = new int[50];

    @ObfuscatedName("client.th")
    public static int[] field905 = new int[50];

    @ObfuscatedName("s.eh(I)Llj;")
    public static class333 method266() {
        return Statics.field533;
    }

    @ObfuscatedName("client.au(I)V")
    public final void method785() {
    }

    public final void init() {
        if (!this.method819()) {
            return;
        }
        class285[] var1 = class285.method503();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class285 var3 = var1[var2];
            String var4 = this.getParameter(var3.field3648);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field3648)) {
                    case 1:
                        field734 = Integer.parseInt(var4) != 0;
                    case 2:
                    case 11:
                    case 13:
                    case 16:
                    default:
                        break;
                    case 3:
                        if (var4.equalsIgnoreCase(class81.field1106)) {
                            field851 = true;
                        } else {
                            field851 = false;
                        }
                        break;
                    case 4:
                        if (field636 == -1) {
                            field636 = Integer.parseInt(var4);
                        }
                        break;
                    case 5:
                        field631 = Integer.parseInt(var4);
                        break;
                    case 6:
                        field884 = Integer.parseInt(var4);
                        break;
                    case 7:
                        int var5 = Integer.parseInt(var4);
                        class250[] var6 = new class250[] { class250.field3196, class250.field3197, class250.field3198, class250.field3201 };
                        class250[] var7 = var6;
                        int var8 = 0;
                        class250 var10;
                        while (true) {
                            if (var8 >= var7.length) {
                                var10 = null;
                                break;
                            }
                            class250 var9 = var7[var8];
                            if (var9.field3202 == var5) {
                                var10 = var9;
                                break;
                            }
                            var8++;
                        }
                        Statics.field3686 = var10;
                        break;
                    case 8:
                        if (var4.equalsIgnoreCase(class81.field1106)) {
                        }
                        break;
                    case 9:
                        Statics.field53 = var4;
                        break;
                    case 10:
                        Statics.field118 = (class251) class185.method3726(class251.method1670(), Integer.parseInt(var4));
                        if (Statics.field118 == class251.field3211) {
                            Statics.field346 = class334.field4007;
                        } else {
                            Statics.field346 = class334.field4011;
                        }
                        break;
                    case 12:
                        field630 = Integer.parseInt(var4);
                        break;
                    case 14:
                        Statics.field1110 = Integer.parseInt(var4);
                        break;
                    case 15:
                        field679 = Integer.parseInt(var4);
                        break;
                    case 17:
                        Statics.field217 = var4;
                }
            }
        }
        method5074();
        Statics.field2445 = this.getCodeBase().getHost();
        String var11 = Statics.field3686.field3200;
        byte var12 = 0;
        try {
            Statics.field2046 = 21;
            Statics.field1496 = var12;
            try {
                Statics.field2342 = System.getProperty("os.name");
            } catch (Exception var63) {
                Statics.field2342 = "Unknown";
            }
            Statics.field1929 = Statics.field2342.toLowerCase();
            try {
                Statics.field2619 = System.getProperty("user.home");
                if (Statics.field2619 != null) {
                    Statics.field2619 = Statics.field2619 + "/";
                }
            } catch (Exception var62) {
            }
            try {
                if (Statics.field1929.startsWith("win")) {
                    if (Statics.field2619 == null) {
                        Statics.field2619 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field2619 == null) {
                    Statics.field2619 = System.getenv("HOME");
                }
                if (Statics.field2619 != null) {
                    Statics.field2619 = Statics.field2619 + "/";
                }
            } catch (Exception var61) {
            }
            if (Statics.field2619 == null) {
                Statics.field2619 = "~/";
            }
            Statics.field1233 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field2619, "/tmp/", "" };
            Statics.field3684 = new String[] { ".jagex_cache_" + Statics.field1496, ".file_store_" + Statics.field1496 };
            int var16 = 0;
            label304: while (var16 < 4) {
                String var17 = var16 == 0 ? "" : "" + var16;
                Statics.field9 = new File(Statics.field2619, "jagex_cl_oldschool_" + var11 + var17 + ".dat");
                String var18 = null;
                String var19 = null;
                boolean var20 = false;
                if (Statics.field9.exists()) {
                    try {
                        class118 var21 = new class118(Statics.field9, "rw", 10000L);
                        class190 var22 = new class190((int) var21.method2523());
                        while (var22.field2423 < var22.field2424.length) {
                            int var23 = var21.method2520(var22.field2424, var22.field2423, var22.field2424.length - var22.field2423);
                            if (var23 == -1) {
                                throw new IOException();
                            }
                            var22.field2423 += var23;
                        }
                        var22.field2423 = 0;
                        int var24 = var22.method3511();
                        if (var24 < 1 || var24 > 3) {
                            throw new IOException("" + var24);
                        }
                        int var25 = 0;
                        if (var24 > 1) {
                            var25 = var22.method3511();
                        }
                        if (var24 <= 2) {
                            var18 = var22.method3659();
                            if (var25 == 1) {
                                var19 = var22.method3659();
                            }
                        } else {
                            var18 = var22.method3714();
                            if (var25 == 1) {
                                var19 = var22.method3714();
                            }
                        }
                        var21.method2518();
                    } catch (IOException var66) {
                        var66.printStackTrace();
                    }
                    if (var18 != null) {
                        File var27 = new File(var18);
                        if (!var27.exists()) {
                            var18 = null;
                        }
                    }
                    if (var18 != null) {
                        File var28 = new File(var18, "test.dat");
                        if (!class163.method1839(var28, true)) {
                            var18 = null;
                        }
                    }
                }
                if (var18 == null && var16 == 0) {
                    label279: for (int var29 = 0; var29 < Statics.field3684.length; var29++) {
                        for (int var30 = 0; var30 < Statics.field1233.length; var30++) {
                            File var31 = new File(Statics.field1233[var30] + Statics.field3684[var29] + File.separatorChar + "oldschool" + File.separatorChar);
                            if (var31.exists() && class163.method1839(new File(var31, "test.dat"), true)) {
                                var18 = var31.toString();
                                var20 = true;
                                break label279;
                            }
                        }
                    }
                }
                if (var18 == null) {
                    var18 = Statics.field2619 + File.separatorChar + "jagexcache" + var17 + File.separatorChar + "oldschool" + File.separatorChar + var11 + File.separatorChar;
                    var20 = true;
                }
                if (var19 != null) {
                    File var32 = new File(var19);
                    File var33 = new File(var18);
                    try {
                        File[] var34 = var32.listFiles();
                        File[] var35 = var34;
                        for (int var36 = 0; var36 < var35.length; var36++) {
                            File var37 = var35[var36];
                            File var38 = new File(var33, var37.getName());
                            boolean var39 = var37.renameTo(var38);
                            if (!var39) {
                                throw new IOException();
                            }
                        }
                    } catch (Exception var65) {
                        var65.printStackTrace();
                    }
                    var20 = true;
                }
                if (var20) {
                    File var41 = new File(var18);
                    Object var42 = null;
                    try {
                        class118 var43 = new class118(Statics.field9, "rw", 10000L);
                        class190 var44 = new class190(500);
                        var44.method3646(3);
                        var44.method3646(var42 == null ? 0 : 1);
                        var44.method3504(var41.getPath());
                        if (var42 != null) {
                            var44.method3504(((File) var42).getPath());
                        }
                        var43.method2522(var44.field2424, 0, var44.field2423);
                        var43.method2518();
                    } catch (IOException var60) {
                        var60.printStackTrace();
                    }
                }
                File var46 = new File(var18);
                Statics.field2045 = var46;
                if (!Statics.field2045.exists()) {
                    Statics.field2045.mkdirs();
                }
                File[] var47 = Statics.field2045.listFiles();
                if (var47 != null) {
                    File[] var48 = var47;
                    for (int var49 = 0; var49 < var48.length; var49++) {
                        File var50 = var48[var49];
                        if (!class163.method1839(var50, false)) {
                            var16++;
                            continue label304;
                        }
                    }
                }
                break;
            }
            class166.method157(Statics.field2045);
            try {
                File var51 = new File(Statics.field2619, "random.dat");
                if (var51.exists()) {
                    class163.field2042 = new class117(new class118(var51, "rw", 25L), 24, 0);
                } else {
                    label230: for (int var52 = 0; var52 < Statics.field3684.length; var52++) {
                        for (int var53 = 0; var53 < Statics.field1233.length; var53++) {
                            File var54 = new File(Statics.field1233[var53] + Statics.field3684[var52] + File.separatorChar + "random.dat");
                            if (var54.exists()) {
                                class163.field2042 = new class117(new class118(var54, "rw", 25L), 24, 0);
                                break label230;
                            }
                        }
                    }
                }
                if (class163.field2042 == null) {
                    RandomAccessFile var55 = new RandomAccessFile(var51, "rw");
                    int var56 = var55.read();
                    var55.seek(0L);
                    var55.write(var56);
                    var55.seek(0L);
                    var55.close();
                    class163.field2042 = new class117(new class118(var51, "rw", 25L), 24, 0);
                }
            } catch (IOException var64) {
            }
            class163.field2052 = new class117(new class118(class166.method2529("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class163.field2055 = new class117(new class118(class166.method2529("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field1490 = new class117[Statics.field2046];
            for (int var58 = 0; var58 < Statics.field2046; var58++) {
                Statics.field1490[var58] = new class117(new class118(class166.method2529("main_file_cache.idx" + var58), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var67) {
            class160.method943((String) null, var67);
        }
        Statics.field3685 = this;
        Statics.field420 = field636;
        this.method775(765, 503, 178);
    }

    @ObfuscatedName("jd.ek(I)V")
    public static final void method5074() {
        class133.field1804 = false;
        field826 = false;
    }

    @ObfuscatedName("client.ac(I)V")
    public final void method776() {
        int[] var1 = new int[] { 20, 260, 10000 };
        int[] var2 = new int[] { 1000, 100, 500 };
        if (var1 == null || var2 == null) {
            Statics.field1877 = null;
            Statics.field1857 = null;
            Statics.field45 = (byte[][][]) null;
        } else {
            Statics.field1877 = var1;
            Statics.field1857 = new int[var1.length];
            Statics.field45 = new byte[var1.length][][];
            for (int var3 = 0; var3 < Statics.field1877.length; var3++) {
                Statics.field45[var3] = new byte[var2[var3]][];
            }
        }
        Statics.field400 = field679 == 0 ? 43594 : field630 + 40000;
        Statics.field3 = field679 == 0 ? 443 : field630 + 50000;
        Statics.field2013 = Statics.field400;
        Statics.field2646 = class236.field2654;
        Statics.field2647 = class236.field2653;
        Statics.field2643 = class236.field2656;
        Statics.field1964 = class236.field2652;
        Statics.field1853 = new class143();
        this.method893();
        this.method811();
        Statics.field1742 = this.method806();
        Statics.field574 = new class170(255, class163.field2052, class163.field2055, 500000);
        class118 var4 = null;
        class73 var5 = new class73();
        try {
            var4 = Statics.method3209("", Statics.field118.field3203, false);
            byte[] var6 = new byte[(int) var4.method2523()];
            int var8;
            for (int var7 = 0; var7 < var6.length; var7 += var8) {
                var8 = var4.method2520(var6, var7, var6.length - var7);
                if (var8 == -1) {
                    throw new IOException();
                }
            }
            var5 = new class73(new class190(var6));
        } catch (Exception var15) {
        }
        try {
            if (var4 != null) {
                var4.method2518();
            }
        } catch (Exception var14) {
        }
        Statics.field2667 = var5;
        this.method755();
        String var13 = Statics.field1400;
        class51.field417 = this;
        if (var13 != null) {
            class51.field418 = var13;
        }
        if (field679 != 0) {
            field647 = true;
        }
        method156(Statics.field2667.field1016);
        Statics.field2434 = new class74(Statics.field346);
    }

    @ObfuscatedName("client.an(I)V")
    public final void method777() {
        field899++;
        this.method1378();
        class255.method52();
        class225.method648();
        Statics.method3425();
        class45.method1571();
        class54 var1 = class54.field463;
        synchronized (class54.field463) {
            class54.field469 = class54.field465;
            class54.field468 = class54.field483;
            class54.field475 = class54.field467 * 2141214921;
            class54.field472 = class54.field461;
            class54.field460 = class54.field473;
            class54.field478 = class54.field474;
            class54.field479 = class54.field470;
            class54.field480 = class54.field476;
            class54.field473 = 0;
        }
        if (Statics.field1742 != null) {
            int var3 = Statics.field1742.method651();
            field672 = var3;
        }
        if (field638 == 0) {
            method732();
            Statics.field1946.method3211();
            for (int var4 = 0; var4 < 32; var4++) {
                field436[var4] = 0L;
            }
            for (int var5 = 0; var5 < 32; var5++) {
                field437[var5] = 0L;
            }
            Statics.field2661 = 0;
        } else if (field638 == 5) {
            class85.method4287(this);
            method732();
            Statics.field1946.method3211();
            for (int var6 = 0; var6 < 32; var6++) {
                field436[var6] = 0L;
            }
            for (int var7 = 0; var7 < 32; var7++) {
                field437[var7] = 0L;
            }
            Statics.field2661 = 0;
        } else if (field638 == 10 || field638 == 11) {
            class85.method4287(this);
        } else if (field638 == 20) {
            class85.method4287(this);
            this.method1172();
        } else if (field638 == 25) {
            method996(false);
            field682 = 0;
            boolean var8 = true;
            for (int var9 = 0; var9 < Statics.field292.length; var9++) {
                if (Statics.field1976[var9] != -1 && Statics.field292[var9] == null) {
                    Statics.field292[var9] = Statics.field1740.method4494(Statics.field1976[var9], 0);
                    if (Statics.field292[var9] == null) {
                        var8 = false;
                        field682++;
                    }
                }
                if (Statics.field591[var9] != -1 && Statics.field1083[var9] == null) {
                    Statics.field1083[var9] = Statics.field1740.method4455(Statics.field591[var9], 0, Statics.field2007[var9]);
                    if (Statics.field1083[var9] == null) {
                        var8 = false;
                        field682++;
                    }
                }
            }
            if (var8) {
                field684 = 0;
                boolean var10 = true;
                for (int var11 = 0; var11 < Statics.field292.length; var11++) {
                    byte[] var12 = Statics.field1083[var11];
                    if (var12 != null) {
                        int var13 = (Statics.field340[var11] >> 8) * 64 - Statics.field512;
                        int var14 = (Statics.field340[var11] & 0xFF) * 64 - Statics.field318;
                        if (field688) {
                            var13 = 10;
                            var14 = 10;
                        }
                        var10 &= class56.method5075(var12, var13, var14);
                    }
                }
                if (var10) {
                    if (field882 != 0) {
                        method13(class245.field2879 + class81.field1105 + class81.field1102 + 100 + "%" + class81.field1100, true);
                    }
                    Statics.method3425();
                    Statics.field185.method2870();
                    for (int var15 = 0; var15 < 4; var15++) {
                        field641[var15].method3343();
                    }
                    for (int var16 = 0; var16 < 4; var16++) {
                        for (int var17 = 0; var17 < 104; var17++) {
                            for (int var18 = 0; var18 < 104; var18++) {
                                class56.field492[var16][var17][var18] = 0;
                            }
                        }
                    }
                    Statics.method3425();
                    class56.field493 = 99;
                    Statics.field509 = new byte[4][104][104];
                    Statics.field495 = new byte[4][104][104];
                    Statics.field504 = new byte[4][104][104];
                    Statics.field497 = new byte[4][104][104];
                    Statics.field503 = new int[4][105][105];
                    Statics.field498 = new byte[4][105][105];
                    Statics.field499 = new int[105][105];
                    Statics.field3298 = new int[104];
                    Statics.field494 = new int[104];
                    Statics.field3677 = new int[104];
                    Statics.field501 = new int[104];
                    Statics.field502 = new int[104];
                    int var19 = Statics.field292.length;
                    for (class75 var20 = (class75) class75.field1034.method3986(); var20 != null; var20 = (class75) class75.field1034.method3988()) {
                        if (var20.field1040 != null) {
                            Statics.field197.method2117(var20.field1040);
                            var20.field1040 = null;
                        }
                        if (var20.field1045 != null) {
                            Statics.field197.method2117(var20.field1045);
                            var20.field1045 = null;
                        }
                    }
                    class75.field1034.method3980();
                    method996(true);
                    if (!field688) {
                        for (int var21 = 0; var21 < var19; var21++) {
                            int var22 = (Statics.field340[var21] >> 8) * 64 - Statics.field512;
                            int var23 = (Statics.field340[var21] & 0xFF) * 64 - Statics.field318;
                            byte[] var24 = Statics.field292[var21];
                            if (var24 != null) {
                                Statics.method3425();
                                class56.method1841(var24, var22, var23, Statics.field341 * 8 - 48, Statics.field40 * 8 - 48, field641);
                            }
                        }
                        for (int var25 = 0; var25 < var19; var25++) {
                            int var26 = (Statics.field340[var25] >> 8) * 64 - Statics.field512;
                            int var27 = (Statics.field340[var25] & 0xFF) * 64 - Statics.field318;
                            byte[] var28 = Statics.field292[var25];
                            if (var28 == null && Statics.field40 < 800) {
                                Statics.method3425();
                                class56.method4907(var26, var27, 64, 64);
                            }
                        }
                        method996(true);
                        for (int var29 = 0; var29 < var19; var29++) {
                            byte[] var30 = Statics.field1083[var29];
                            if (var30 != null) {
                                int var31 = (Statics.field340[var29] >> 8) * 64 - Statics.field512;
                                int var32 = (Statics.field340[var29] & 0xFF) * 64 - Statics.field318;
                                Statics.method3425();
                                class56.method1873(var30, var31, var32, Statics.field185, field641);
                            }
                        }
                    }
                    if (field688) {
                        int var33 = 0;
                        label350: while (true) {
                            if (var33 >= 4) {
                                for (int var44 = 0; var44 < 13; var44++) {
                                    for (int var45 = 0; var45 < 13; var45++) {
                                        int var46 = field689[0][var44][var45];
                                        if (var46 == -1) {
                                            class56.method4907(var44 * 8, var45 * 8, 8, 8);
                                        }
                                    }
                                }
                                method996(true);
                                int var47 = 0;
                                while (true) {
                                    if (var47 >= 4) {
                                        break label350;
                                    }
                                    Statics.method3425();
                                    for (int var48 = 0; var48 < 13; var48++) {
                                        for (int var49 = 0; var49 < 13; var49++) {
                                            int var50 = field689[var47][var48][var49];
                                            if (var50 != -1) {
                                                int var51 = var50 >> 24 & 0x3;
                                                int var52 = var50 >> 1 & 0x3;
                                                int var53 = var50 >> 14 & 0x3FF;
                                                int var54 = var50 >> 3 & 0x7FF;
                                                int var55 = (var53 / 8 << 8) + var54 / 8;
                                                for (int var56 = 0; var56 < Statics.field340.length; var56++) {
                                                    if (Statics.field340[var56] == var55 && Statics.field1083[var56] != null) {
                                                        class56.method2087(Statics.field1083[var56], var47, var48 * 8, var49 * 8, var51, (var53 & 0x7) * 8, (var54 & 0x7) * 8, var52, Statics.field185, field641);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var47++;
                                }
                            }
                            Statics.method3425();
                            for (int var34 = 0; var34 < 13; var34++) {
                                for (int var35 = 0; var35 < 13; var35++) {
                                    boolean var36 = false;
                                    int var37 = field689[var33][var34][var35];
                                    if (var37 != -1) {
                                        int var38 = var37 >> 24 & 0x3;
                                        int var39 = var37 >> 1 & 0x3;
                                        int var40 = var37 >> 14 & 0x3FF;
                                        int var41 = var37 >> 3 & 0x7FF;
                                        int var42 = (var40 / 8 << 8) + var41 / 8;
                                        for (int var43 = 0; var43 < Statics.field340.length; var43++) {
                                            if (Statics.field340[var43] == var42 && Statics.field292[var43] != null) {
                                                class56.method145(Statics.field292[var43], var33, var34 * 8, var35 * 8, var38, (var40 & 0x7) * 8, (var41 & 0x7) * 8, var39, field641);
                                                var36 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!var36) {
                                        class56.method702(var33, var34 * 8, var35 * 8);
                                    }
                                }
                            }
                            var33++;
                        }
                    }
                    method996(true);
                    Statics.method3425();
                    class56.method1633(Statics.field185, field641);
                    method996(true);
                    int var57 = class56.field493;
                    if (var57 > Statics.field66) {
                        var57 = Statics.field66;
                    }
                    if (var57 < Statics.field66 - 1) {
                        int var58 = Statics.field66 - 1;
                    }
                    if (field826) {
                        Statics.field185.method2954(class56.field493);
                    } else {
                        Statics.field185.method2954(0);
                    }
                    for (int var59 = 0; var59 < 104; var59++) {
                        for (int var60 = 0; var60 < 104; var60++) {
                            method483(var59, var60);
                        }
                    }
                    Statics.method3425();
                    for (class69 var61 = (class69) field759.method3986(); var61 != null; var61 = (class69) field759.method3988()) {
                        if (var61.field919 == -1) {
                            var61.field918 = 0;
                            method3185(var61);
                        } else {
                            var61.method3973();
                        }
                    }
                    class274.field3443.method3899();
                    if (Statics.field3685.method770()) {
                        class180 var62 = class180.method1090(class177.field2305, field886.field1271);
                        var62.field2345.method3576(1057001181);
                        field886.method2059(var62);
                    }
                    if (!field688) {
                        int var63 = (Statics.field341 - 6) / 8;
                        int var64 = (Statics.field341 + 6) / 8;
                        int var65 = (Statics.field40 - 6) / 8;
                        int var66 = (Statics.field40 + 6) / 8;
                        for (int var67 = var63 - 1; var67 <= var64 + 1; var67++) {
                            for (int var68 = var65 - 1; var68 <= var66 + 1; var68++) {
                                if (var67 < var63 || var67 > var64 || var68 < var65 || var68 > var66) {
                                    Statics.field1740.method4478("m" + var67 + "_" + var68);
                                    Statics.field1740.method4478("l" + var67 + "_" + var68);
                                }
                            }
                        }
                    }
                    method3117(30);
                    Statics.method3425();
                    Statics.field509 = (byte[][][]) null;
                    Statics.field495 = (byte[][][]) null;
                    Statics.field504 = (byte[][][]) null;
                    Statics.field497 = (byte[][][]) null;
                    Statics.field503 = (int[][][]) null;
                    Statics.field498 = (byte[][][]) null;
                    Statics.field499 = (int[][]) null;
                    Statics.field3298 = null;
                    Statics.field494 = null;
                    Statics.field3677 = null;
                    Statics.field501 = null;
                    Statics.field502 = null;
                    class180 var69 = class180.method1090(class177.field2295, field886.field1271);
                    field886.method2059(var69);
                    Statics.field1946.method3211();
                    for (int var70 = 0; var70 < 32; var70++) {
                        field436[var70] = 0L;
                    }
                    for (int var71 = 0; var71 < 32; var71++) {
                        field437[var71] = 0L;
                    }
                    Statics.field2661 = 0;
                } else {
                    field882 = 2;
                }
            } else {
                field882 = 1;
            }
        }
        if (field638 == 30) {
            this.method1157();
        } else if (field638 == 40 || field638 == 45) {
            this.method1172();
        }
    }

    @ObfuscatedName("client.ak(ZI)V")
    public final void method778(boolean arg0) {
        boolean var2;
        label140: {
            try {
                if (class225.field2539 == 2) {
                    if (Statics.field991 == null) {
                        Statics.field991 = class231.method4301(Statics.field2540, Statics.field1388, Statics.field230);
                        if (Statics.field991 == null) {
                            var2 = false;
                            break label140;
                        }
                    }
                    if (Statics.field423 == null) {
                        Statics.field423 = new class106(Statics.field2538, Statics.field2537);
                    }
                    if (Statics.field2535.method4143(Statics.field991, Statics.field2536, Statics.field423, 22050)) {
                        Statics.field2535.method4112();
                        Statics.field2535.method4109(Statics.field624);
                        Statics.field2535.method4114(Statics.field991, Statics.field1133);
                        class225.field2539 = 0;
                        Statics.field991 = null;
                        Statics.field423 = null;
                        Statics.field2540 = null;
                        var2 = true;
                        break label140;
                    }
                }
            } catch (Exception var10) {
                var10.printStackTrace();
                Statics.field2535.method4115();
                class225.field2539 = 0;
                Statics.field991 = null;
                Statics.field423 = null;
                Statics.field2540 = null;
            }
            var2 = false;
        }
        if (var2 && field664 && Statics.field1730 != null) {
            Statics.field1730.method2230();
        }
        if ((field638 == 10 || field638 == 20 || field638 == 30) && field791 != 0L && class192.method81() > field791) {
            method156(method281());
        }
        if (arg0) {
            for (int var5 = 0; var5 < 100; var5++) {
                field835[var5] = true;
            }
        }
        if (field638 == 0) {
            this.method780(class85.field1149, class85.field1153, arg0);
        } else if (field638 == 5) {
            class85.method4694(Statics.field1502, Statics.field1785, Statics.field2620, arg0);
        } else if (field638 == 10 || field638 == 11) {
            class85.method4694(Statics.field1502, Statics.field1785, Statics.field2620, arg0);
        } else if (field638 == 20) {
            class85.method4694(Statics.field1502, Statics.field1785, Statics.field2620, arg0);
        } else if (field638 == 25) {
            if (field882 == 1) {
                if (field682 > field775) {
                    field775 = field682;
                }
                int var6 = (field775 * 50 - field682 * 50) / field775;
                method13(class245.field2879 + class81.field1105 + class81.field1102 + var6 + "%" + class81.field1100, false);
            } else if (field882 == 2) {
                if (field684 > field685) {
                    field685 = field684;
                }
                int var7 = (field685 * 50 - field684 * 50) / field685 + 50;
                method13(class245.field2879 + class81.field1105 + class81.field1102 + var7 + "%" + class81.field1100, false);
            } else {
                method13(class245.field2879, false);
            }
        } else if (field638 == 30) {
            this.method1159();
        } else if (field638 == 40) {
            method13(class245.field3087 + class81.field1105 + class245.field2881, false);
        } else if (field638 == 45) {
            method13(class245.field3030, false);
        }
        if (field638 == 30 && field842 == 0 && !arg0 && !field844) {
            for (int var8 = 0; var8 < field833; var8++) {
                if (field885[var8]) {
                    Statics.field184.method739(field838[var8], field839[var8], field840[var8], field841[var8]);
                    field885[var8] = false;
                }
            }
        } else if (field638 > 0) {
            Statics.field184.method738(0, 0);
            for (int var9 = 0; var9 < field833; var9++) {
                field885[var9] = false;
            }
        }
    }

    @ObfuscatedName("client.ah(B)V")
    public final void method779() {
        if (Statics.field1514.method1976()) {
            Statics.field1514.method1967();
        }
        if (Statics.field262 != null) {
            Statics.field262.field576 = false;
        }
        Statics.field262 = null;
        field886.method2066();
        if (class45.field368 != null) {
            class45 var1 = class45.field368;
            synchronized (class45.field368) {
                class45.field368 = null;
            }
        }
        if (class54.field463 != null) {
            class54 var3 = class54.field463;
            synchronized (class54.field463) {
                class54.field463 = null;
            }
        }
        Statics.field1742 = null;
        if (Statics.field1730 != null) {
            Statics.field1730.method2261();
        }
        if (Statics.field2376 != null) {
            Statics.field2376.method2261();
        }
        if (Statics.field3267 != null) {
            Statics.field3267.method3287();
        }
        Object var5 = class255.field3245;
        synchronized (class255.field3245) {
            if (class255.field3244 != 0) {
                class255.field3244 = 1;
                try {
                    class255.field3245.wait();
                } catch (InterruptedException var10) {
                }
            }
        }
        if (Statics.field1853 != null) {
            Statics.field1853.method3087();
            Statics.field1853 = null;
        }
        try {
            class163.field2052.method2491();
            for (int var8 = 0; var8 < Statics.field2046; var8++) {
                Statics.field1490[var8].method2491();
            }
            class163.field2055.method2491();
            class163.field2042.method2491();
        } catch (Exception var13) {
        }
    }

    @ObfuscatedName("ef.ex(IB)V")
    public static void method3117(int arg0) {
        if (field638 == arg0) {
            return;
        }
        if (field638 == 0) {
            Statics.field3685.method781();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field663 = 0;
            field686 = 0;
            field665 = 0;
            field680.method5089(arg0);
            if (arg0 != 20) {
                method3297(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field521 != null) {
            Statics.field521.method3287();
            Statics.field521 = null;
        }
        if (field638 == 25) {
            field882 = 0;
            field682 = 0;
            field775 = 1;
            field684 = 0;
            field685 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class85.method1716(Statics.field376, Statics.field549, true, 0);
        } else if (arg0 == 20) {
            class85.method1716(Statics.field376, Statics.field549, true, field638 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class85.method1716(Statics.field376, Statics.field549, false, 4);
        } else {
            class85.method1029();
        }
        field638 = arg0;
    }

    @ObfuscatedName("client.fk(I)V")
    public void method1378() {
        if (field638 != 1000) {
            boolean var1 = class257.method681();
            if (!var1) {
                this.method1154();
            }
        }
    }

    @ObfuscatedName("client.fz(B)V")
    public void method1154() {
        if (class257.field3277 >= 4) {
            this.method782("js5crc");
            field638 = 1000;
            return;
        }
        if (class257.field3273 >= 4) {
            if (field638 <= 5) {
                this.method782("js5io");
                field638 = 1000;
                return;
            }
            field661 = 3000;
            class257.field3273 = 3;
        }
        if (--field661 + 1 > 0) {
            return;
        }
        try {
            if (field809 == 0) {
                Statics.field529 = Statics.field456.method3251(Statics.field2445, Statics.field2013);
                field809++;
            }
            if (field809 == 1) {
                if (Statics.field529.field2026 == 2) {
                    this.method1155(-1);
                    return;
                }
                if (Statics.field529.field2026 == 1) {
                    field809++;
                }
            }
            if (field809 == 2) {
                if (field734) {
                    Socket var1 = (Socket) Statics.field529.field2033;
                    class167 var2 = new class167(var1, 40000, 5000);
                    Statics.field3851 = var2;
                } else {
                    Statics.field3851 = new class169((Socket) Statics.field529.field2033, Statics.field456, 5000);
                }
                class190 var3 = new class190(5);
                var3.method3646(15);
                var3.method3576(178);
                Statics.field3851.method3288(var3.field2424, 0, 5);
                field809++;
                Statics.field2435 = class192.method81();
            }
            if (field809 == 3) {
                if (Statics.field3851.method3270() > 0 || !field734 && field638 <= 5) {
                    int var4 = Statics.field3851.method3271();
                    if (var4 != 0) {
                        this.method1155(var4);
                        return;
                    }
                    field809++;
                } else if (class192.method81() - Statics.field2435 > 30000L) {
                    this.method1155(-2);
                    return;
                }
            }
            if (field809 == 4) {
                class165 var5 = Statics.field3851;
                boolean var6 = field638 > 20;
                if (Statics.field3267 != null) {
                    try {
                        Statics.field3267.method3287();
                    } catch (Exception var21) {
                    }
                    Statics.field3267 = null;
                }
                Statics.field3267 = var5;
                if (Statics.field3267 != null) {
                    try {
                        class190 var8 = new class190(4);
                        var8.method3646(var6 ? 2 : 3);
                        var8.method3497(0);
                        Statics.field3267.method3288(var8.field2424, 0, 4);
                    } catch (IOException var20) {
                        try {
                            Statics.field3267.method3287();
                        } catch (Exception var19) {
                        }
                        class257.field3273++;
                        Statics.field3267 = null;
                    }
                }
                class257.field3272.field2423 = 0;
                Statics.field3269 = null;
                Statics.field2864 = null;
                class257.field3276 = 0;
                while (true) {
                    class253 var11 = (class253) class257.field3264.method3937();
                    if (var11 == null) {
                        while (true) {
                            class253 var12 = (class253) class257.field3268.method3937();
                            if (var12 == null) {
                                if (class257.field3263 != 0) {
                                    try {
                                        class190 var13 = new class190(4);
                                        var13.method3646(4);
                                        var13.method3646(class257.field3263);
                                        var13.method3508(0);
                                        Statics.field3267.method3288(var13.field2424, 0, 4);
                                    } catch (IOException var18) {
                                        try {
                                            Statics.field3267.method3287();
                                        } catch (Exception var17) {
                                        }
                                        class257.field3273++;
                                        Statics.field3267 = null;
                                    }
                                }
                                class257.field3261 = 0;
                                Statics.field276 = class192.method81();
                                Statics.field529 = null;
                                Statics.field3851 = null;
                                field809 = 0;
                                field893 = 0;
                                return;
                            }
                            class257.field3266.method3841(var12);
                            class257.field3274.method3935(var12, var12.field2502);
                            class257.field3260++;
                            class257.field3270--;
                        }
                    }
                    class257.field3262.method3935(var11, var11.field2502);
                    class257.field3271++;
                    class257.field3265--;
                }
            }
        } catch (IOException var22) {
            this.method1155(-3);
        }
    }

    @ObfuscatedName("client.fu(II)V")
    public void method1155(int arg0) {
        Statics.field529 = null;
        Statics.field3851 = null;
        field809 = 0;
        if (Statics.field400 == Statics.field2013) {
            Statics.field2013 = Statics.field3;
        } else {
            Statics.field2013 = Statics.field400;
        }
        field893++;
        if (field893 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field638 <= 5) {
                this.method782("js5connect_full");
                field638 = 1000;
            } else {
                field661 = 3000;
            }
        } else if (field893 >= 2 && arg0 == 6) {
            this.method782("js5connect_outofdate");
            field638 = 1000;
        } else if (field893 >= 4) {
            if (field638 <= 5) {
                this.method782("js5connect");
                field638 = 1000;
            } else {
                field661 = 3000;
            }
        }
    }

    @ObfuscatedName("hd.fx(Lit;Ljava/lang/String;B)V")
    public static void method4084(class256 arg0, String arg1) {
        class59 var2 = new class59(arg0, arg1);
        field901.add(var2);
    }

    @ObfuscatedName("eb.fe(B)Z")
    public static boolean method3069() {
        if (field901 == null || field902 >= field901.size()) {
            return true;
        }
        while (field902 < field901.size()) {
            class59 var0 = (class59) field901.get(field902);
            if (!var0.method1001()) {
                return false;
            }
            field902++;
        }
        return true;
    }

    @ObfuscatedName("em.fi(IB)I")
    public static int method3067(int arg0) {
        return arg0 * 3 + 600;
    }

    @ObfuscatedName("bz.ft(III)V")
    public static void method1835(int arg0, int arg1) {
        int[] var2 = new int[9];
        for (int var3 = 0; var3 < var2.length; var3++) {
            int var4 = var3 * 32 + 128 + 15;
            int var5 = method3067(var4);
            int var6 = class130.field1768[var4];
            int var7 = method568(var5, arg1);
            var2[var3] = var6 * var7 >> 16;
        }
        class133.method2905(var2, 500, 800, arg0 * 334 / arg1, 334);
    }

    @ObfuscatedName("av.fn(I)V")
    public static void method732() {
        if (field676 == 0) {
            Statics.field185 = new class133(4, 104, 104, class56.field511);
            for (int var0 = 0; var0 < 4; var0++) {
                field641[var0] = new class172(104, 104);
            }
            Statics.field988 = new class327(512, 512);
            class85.field1153 = class245.field2882;
            class85.field1149 = 5;
            field676 = 20;
        } else if (field676 == 20) {
            class85.field1153 = class245.field2883;
            class85.field1149 = 10;
            field676 = 30;
        } else if (field676 == 30) {
            Statics.field165 = method62(0, false, true, true);
            Statics.field2569 = method62(1, false, true, true);
            Statics.field255 = method62(2, true, false, true);
            Statics.field195 = method62(3, false, true, true);
            Statics.field530 = method62(4, false, true, true);
            Statics.field1740 = method62(5, true, true, true);
            Statics.field485 = method62(6, true, true, true);
            Statics.field1952 = method62(7, false, true, true);
            Statics.field549 = method62(8, false, true, true);
            Statics.field83 = method62(9, false, true, true);
            Statics.field376 = method62(10, false, true, true);
            Statics.field1930 = method62(11, false, true, true);
            Statics.field1733 = method62(12, false, true, true);
            Statics.field13 = method62(13, true, false, true);
            Statics.field189 = method62(14, false, true, true);
            Statics.field351 = method62(15, false, true, true);
            Statics.field1279 = method62(17, true, true, true);
            Statics.field1956 = method62(18, false, true, true);
            Statics.field229 = method62(19, false, true, true);
            Statics.field569 = method62(20, false, true, true);
            class85.field1153 = class245.field2884;
            class85.field1149 = 20;
            field676 = 40;
        } else if (field676 == 40) {
            byte var1 = 0;
            int var2 = var1 + Statics.field165.method4561() * 4 / 100;
            int var3 = var2 + Statics.field2569.method4561() * 4 / 100;
            int var4 = var3 + Statics.field255.method4561() * 2 / 100;
            int var5 = var4 + Statics.field195.method4561() * 2 / 100;
            int var6 = var5 + Statics.field530.method4561() * 6 / 100;
            int var7 = var6 + Statics.field1740.method4561() * 4 / 100;
            int var8 = var7 + Statics.field485.method4561() * 2 / 100;
            int var9 = var8 + Statics.field1952.method4561() * 56 / 100;
            int var10 = var9 + Statics.field549.method4561() * 2 / 100;
            int var11 = var10 + Statics.field83.method4561() * 2 / 100;
            int var12 = var11 + Statics.field376.method4561() * 2 / 100;
            int var13 = var12 + Statics.field1930.method4561() * 2 / 100;
            int var14 = var13 + Statics.field1733.method4561() * 2 / 100;
            int var15 = var14 + Statics.field13.method4561() * 2 / 100;
            int var16 = var15 + Statics.field189.method4561() * 2 / 100;
            int var17 = var16 + Statics.field351.method4561() * 2 / 100;
            int var18 = var17 + Statics.field229.method4561() / 100;
            int var19 = var18 + Statics.field1956.method4561() / 100;
            int var20 = var19 + Statics.field569.method4561() / 100;
            int var21 = var20 + (Statics.field1279.method4566() && Statics.field1279.method4498() ? 1 : 0);
            if (var21 == 100) {
                method4084(Statics.field165, "Animations");
                method4084(Statics.field2569, "Skeletons");
                method4084(Statics.field530, "Sound FX");
                method4084(Statics.field1740, "Maps");
                method4084(Statics.field485, "Music Tracks");
                method4084(Statics.field1952, "Models");
                method4084(Statics.field549, "Sprites");
                method4084(Statics.field1930, "Music Jingles");
                method4084(Statics.field189, "Music Samples");
                method4084(Statics.field351, "Music Patches");
                method4084(Statics.field229, "World Map");
                method4084(Statics.field1956, "World Map Geography");
                method4084(Statics.field569, "World Map Ground");
                Statics.field1963 = new class315();
                Statics.field1963.method5525(Statics.field1279);
                class85.field1153 = class245.field3062;
                class85.field1149 = 30;
                field676 = 45;
            } else {
                if (var21 != 0) {
                    class85.field1153 = class245.field2885 + var21 + "%";
                }
                class85.field1149 = 30;
            }
        } else if (field676 == 45) {
            boolean var22 = !field826;
            Statics.field1374 = 22050;
            Statics.field1355 = var22;
            Statics.field3354 = 2;
            class226 var23 = new class226();
            var23.method4117(9, 128);
            Statics.field1730 = class103.method2288(Statics.field456, 0, 22050);
            Statics.field1730.method2227(var23);
            class256 var24 = Statics.field351;
            class256 var25 = Statics.field189;
            class256 var26 = Statics.field530;
            Statics.field2536 = var24;
            Statics.field2537 = var25;
            Statics.field2538 = var26;
            Statics.field2535 = var23;
            Statics.field2376 = class103.method2288(Statics.field456, 1, 2048);
            Statics.field197 = new class96();
            Statics.field2376.method2227(Statics.field197);
            Statics.field1394 = new class110(22050, Statics.field1374);
            class85.field1153 = class245.field2887;
            class85.field1149 = 35;
            field676 = 50;
            Statics.field333 = new class302(Statics.field549, Statics.field13);
        } else if (field676 == 50) {
            int var27 = class301.method5306().length;
            field681 = Statics.field333.method5311(class301.method5306());
            if (field681.size() < var27) {
                class85.field1153 = class245.field2888 + field681.size() * 100 / var27 + "%";
                class85.field1149 = 40;
            } else {
                Statics.field1785 = (class304) field681.get(class301.field3734);
                Statics.field2620 = (class304) field681.get(class301.field3731);
                Statics.field1502 = (class304) field681.get(class301.field3737);
                Statics.field587 = field896.method5823();
                class85.field1153 = class245.field2889;
                class85.field1149 = 40;
                field676 = 60;
            }
        } else if (field676 == 60) {
            class256 var28 = Statics.field376;
            class256 var29 = Statics.field549;
            int var30 = 0;
            if (var28.method4528("title.jpg", "")) {
                var30++;
            }
            if (var29.method4528("logo", "")) {
                var30++;
            }
            if (var29.method4528("logo_deadman_mode", "")) {
                var30++;
            }
            if (var29.method4528("titlebox", "")) {
                var30++;
            }
            if (var29.method4528("titlebutton", "")) {
                var30++;
            }
            if (var29.method4528("runes", "")) {
                var30++;
            }
            if (var29.method4528("title_mute", "")) {
                var30++;
            }
            if (var29.method4528("options_radio_buttons,0", "")) {
                var30++;
            }
            if (var29.method4528("options_radio_buttons,2", "")) {
                var30++;
            }
            if (var29.method4528("options_radio_buttons,4", "")) {
                var30++;
            }
            if (var29.method4528("options_radio_buttons,6", "")) {
                var30++;
            }
            var29.method4528("sl_back", "");
            var29.method4528("sl_flags", "");
            var29.method4528("sl_arrows", "");
            var29.method4528("sl_stars", "");
            var29.method4528("sl_button", "");
            byte var33 = 11;
            if (var30 < var33) {
                class85.field1153 = class245.field2900 + var30 * 100 / var33 + "%";
                class85.field1149 = 50;
            } else {
                class85.field1153 = class245.field2972;
                class85.field1149 = 50;
                method3117(5);
                field676 = 70;
            }
        } else if (field676 == 70) {
            if (Statics.field255.method4498()) {
                class256 var35 = Statics.field255;
                Statics.field3595 = var35;
                Statics.method67(Statics.field255);
                class266.method900(Statics.field255, Statics.field1952);
                class274.method173(Statics.field255, Statics.field1952, field826);
                class277.method153(Statics.field255, Statics.field1952);
                class271.method2055(Statics.field255);
                class256 var36 = Statics.field255;
                class256 var37 = Statics.field1952;
                boolean var38 = field851;
                class304 var39 = Statics.field1785;
                Statics.field2088 = var36;
                Statics.field3513 = var37;
                Statics.field2624 = var38;
                Statics.field3493 = Statics.field2088.method4466(10);
                Statics.field2471 = var39;
                class256 var40 = Statics.field255;
                class256 var41 = Statics.field165;
                class256 var42 = Statics.field2569;
                Statics.field3602 = var40;
                Statics.field3599 = var41;
                Statics.field3600 = var42;
                class264.method1018(Statics.field255, Statics.field1952);
                class256 var43 = Statics.field255;
                Statics.field3394 = var43;
                class256 var44 = Statics.field255;
                Statics.field3306 = var44;
                Statics.field3302 = Statics.field3306.method4466(16);
                class256 var45 = Statics.field195;
                class256 var46 = Statics.field1952;
                class256 var47 = Statics.field549;
                class256 var48 = Statics.field13;
                Statics.field1736 = var45;
                Statics.field2665 = var46;
                Statics.field2629 = var47;
                Statics.field2666 = var48;
                Statics.field2357 = new class238[Statics.field1736.method4467()][];
                Statics.field2069 = new boolean[Statics.field1736.method4467()];
                class260.method4595(Statics.field255);
                class272.method25(Statics.field255);
                class263.method3082(Statics.field255);
                class256 var49 = Statics.field255;
                Statics.field2660 = var49;
                Statics.field1514 = new class90();
                class256 var50 = Statics.field255;
                class256 var51 = Statics.field549;
                class256 var52 = Statics.field13;
                Statics.field3437 = var50;
                Statics.field3419 = var51;
                Statics.field1856 = var52;
                class267.method4209(Statics.field255, Statics.field549);
                class256 var53 = Statics.field255;
                class256 var54 = Statics.field549;
                Statics.field3321 = var54;
                if (var53.method4498()) {
                    Statics.field3310 = var53.method4466(35);
                    Statics.field3309 = new class262[Statics.field3310];
                    for (int var55 = 0; var55 < Statics.field3310; var55++) {
                        byte[] var56 = var53.method4494(35, var55);
                        Statics.field3309[var55] = new class262(var55);
                        if (var56 != null) {
                            Statics.field3309[var55].method4653(new class190(var56));
                            Statics.field3309[var55].method4674();
                        }
                    }
                }
                class85.field1153 = class245.field2893;
                class85.field1149 = 60;
                field676 = 80;
            } else {
                class85.field1153 = class245.field2892 + Statics.field255.method4560() + "%";
                class85.field1149 = 60;
            }
        } else if (field676 == 80) {
            int var57 = 0;
            if (Statics.field173 == null) {
                Statics.field173 = class328.method1038(Statics.field549, Statics.field1963.field3807, 0);
            } else {
                var57++;
            }
            if (Statics.field3747 == null) {
                Statics.field3747 = class328.method1038(Statics.field549, Statics.field1963.field3817, 0);
            } else {
                var57++;
            }
            if (Statics.field2350 == null) {
                Statics.field2350 = class328.method3402(Statics.field549, Statics.field1963.field3812, 0);
            } else {
                var57++;
            }
            if (Statics.field100 == null) {
                Statics.field100 = class328.method4364(Statics.field549, Statics.field1963.field3809, 0);
            } else {
                var57++;
            }
            if (Statics.field621 == null) {
                Statics.field621 = class328.method4364(Statics.field549, Statics.field1963.field3810, 0);
            } else {
                var57++;
            }
            if (Statics.field2003 == null) {
                Statics.field2003 = class328.method4364(Statics.field549, Statics.field1963.field3811, 0);
            } else {
                var57++;
            }
            if (Statics.field1861 == null) {
                Statics.field1861 = class328.method4364(Statics.field549, Statics.field1963.field3813, 0);
            } else {
                var57++;
            }
            if (Statics.field404 == null) {
                Statics.field404 = class328.method4364(Statics.field549, Statics.field1963.field3808, 0);
            } else {
                var57++;
            }
            if (Statics.field1737 == null) {
                Statics.field1737 = class328.method4364(Statics.field549, Statics.field1963.field3814, 0);
            } else {
                var57++;
            }
            if (Statics.field697 == null) {
                Statics.field697 = class328.method3402(Statics.field549, Statics.field1963.field3815, 0);
            } else {
                var57++;
            }
            if (Statics.field260 == null) {
                Statics.field260 = class328.method3402(Statics.field549, Statics.field1963.field3816, 0);
            } else {
                var57++;
            }
            if (var57 < 11) {
                class85.field1153 = class245.field2997 + var57 * 100 / 12 + "%";
                class85.field1149 = 70;
            } else {
                Statics.field3761 = Statics.field260;
                Statics.field3747.method5690();
                int var58 = (int) (Math.random() * 21.0D) - 10;
                int var59 = (int) (Math.random() * 21.0D) - 10;
                int var60 = (int) (Math.random() * 21.0D) - 10;
                int var61 = (int) (Math.random() * 41.0D) - 20;
                Statics.field2350[0].method5668(var58 + var61, var59 + var61, var60 + var61);
                class85.field1153 = class245.field2897;
                class85.field1149 = 70;
                field676 = 90;
            }
        } else if (field676 == 90) {
            if (Statics.field83.method4498()) {
                Statics.field3249 = new class119(Statics.field83, Statics.field549, 20, 0.8D, field826 ? 64 : 128);
                class130.method2789(Statics.field3249);
                class130.method2790(0.8D);
                field676 = 100;
            } else {
                class85.field1153 = class245.field2896 + "0%";
                class85.field1149 = 90;
            }
        } else if (field676 == 100) {
            int var62 = Statics.field3249.method2548();
            if (var62 < 100) {
                class85.field1153 = class245.field2896 + var62 + "%";
                class85.field1149 = 90;
            } else {
                class85.field1153 = class245.field3120;
                class85.field1149 = 90;
                field676 = 110;
            }
        } else if (field676 == 110) {
            Statics.field262 = new class64();
            Statics.field456.method3254(Statics.field262, 10);
            class85.field1153 = class245.field2898;
            class85.field1149 = 92;
            field676 = 120;
        } else if (field676 == 120) {
            if (Statics.field376.method4528("huffman", "")) {
                class182 var63 = new class182(Statics.field376.method4475("huffman", ""));
                class306.method4359(var63);
                class85.field1153 = class245.field3160;
                class85.field1149 = 94;
                field676 = 130;
            } else {
                class85.field1153 = class245.field2899 + "%";
                class85.field1149 = 94;
            }
        } else if (field676 == 130) {
            if (!Statics.field195.method4498()) {
                class85.field1153 = class245.field3020 + Statics.field195.method4560() * 4 / 5 + "%";
                class85.field1149 = 96;
            } else if (!Statics.field1733.method4498()) {
                class85.field1153 = class245.field3020 + (80 + Statics.field1733.method4560() / 6) + "%";
                class85.field1149 = 96;
            } else if (Statics.field13.method4498()) {
                class85.field1153 = class245.field2902;
                class85.field1149 = 98;
                field676 = 140;
            } else {
                class85.field1153 = class245.field3020 + (96 + Statics.field13.method4560() / 50) + "%";
                class85.field1149 = 96;
            }
        } else if (field676 == 140) {
            class85.field1149 = 100;
            if (Statics.field229.method4477(class36.field294.field297)) {
                if (Statics.field533 == null) {
                    Statics.field533 = new class333();
                    Statics.field533.method5844(Statics.field229, Statics.field1956, Statics.field569, Statics.field1502, field681, Statics.field2350);
                }
                class85.field1153 = class245.field2955;
                field676 = 150;
            } else {
                class85.field1153 = class245.field3115 + Statics.field229.method4479(class36.field294.field297) / 10 + "%";
            }
        } else if (field676 == 150) {
            method3117(10);
        }
    }

    @ObfuscatedName("z.fm(IZZZB)Lit;")
    public static class256 method62(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class170 var4 = null;
        if (class163.field2052 != null) {
            var4 = new class170(arg0, class163.field2052, Statics.field1490[arg0], 1000000);
        }
        return new class256(var4, Statics.field574, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.fj(I)V")
    public final void method1172() {
        class165 var1 = field886.method2061();
        class197 var2 = field886.field1281;
        try {
            if (field663 == 0) {
                if (Statics.field2819 == null && (field669.method1945() || field686 > 250)) {
                    Statics.field2819 = field669.method1936();
                    field669.method1943();
                    field669 = null;
                }
                if (Statics.field2819 != null) {
                    if (var1 != null) {
                        var1.method3287();
                        var1 = null;
                    }
                    Statics.field57 = null;
                    field678 = false;
                    field686 = 0;
                    field663 = 1;
                }
            }
            if (field663 == 1) {
                if (Statics.field57 == null) {
                    Statics.field57 = Statics.field456.method3251(Statics.field2445, Statics.field2013);
                }
                if (Statics.field57.field2026 == 2) {
                    throw new IOException();
                }
                if (Statics.field57.field2026 == 1) {
                    if (field734) {
                        Socket var3 = (Socket) Statics.field57.field2033;
                        class167 var4 = new class167(var3, 40000, 5000);
                        var1 = var4;
                    } else {
                        var1 = new class169((Socket) Statics.field57.field2033, Statics.field456, 5000);
                    }
                    field886.method2060(var1);
                    Statics.field57 = null;
                    field663 = 2;
                }
            }
            if (field663 == 2) {
                field886.method2057();
                class180 var5 = class180.method5309();
                var5.field2343 = null;
                var5.field2344 = 0;
                var5.field2345 = new class197(5000);
                var5.field2345.method3646(class178.field2323.field2326);
                field886.method2059(var5);
                field886.method2063();
                var2.field2423 = 0;
                field663 = 3;
            }
            if (field663 == 3) {
                if (Statics.field1730 != null) {
                    Statics.field1730.method2251();
                }
                if (Statics.field2376 != null) {
                    Statics.field2376.method2251();
                }
                boolean var8 = true;
                if (field734 && !var1.method3274(1)) {
                    var8 = false;
                }
                if (var8) {
                    int var9 = var1.method3271();
                    if (Statics.field1730 != null) {
                        Statics.field1730.method2251();
                    }
                    if (Statics.field2376 != null) {
                        Statics.field2376.method2251();
                    }
                    if (var9 != 0) {
                        method997(var9);
                        return;
                    }
                    var2.field2423 = 0;
                    field663 = 4;
                }
            }
            if (field663 == 4) {
                if (var2.field2423 < 8) {
                    int var10 = var1.method3270();
                    if (var10 > 8 - var2.field2423) {
                        var10 = 8 - var2.field2423;
                    }
                    if (var10 > 0) {
                        var1.method3272(var2.field2424, var2.field2423, var10);
                        var2.field2423 += var10;
                    }
                }
                if (var2.field2423 == 8) {
                    var2.field2423 = 0;
                    Statics.field97 = var2.method3517();
                    field663 = 5;
                }
            }
            if (field663 == 5) {
                field886.field1281.field2423 = 0;
                field886.method2057();
                class197 var11 = new class197(500);
                int[] var12 = new int[] { Statics.field2819.nextInt(), Statics.field2819.nextInt(), Statics.field2819.nextInt(), Statics.field2819.nextInt() };
                var11.field2423 = 0;
                var11.method3646(1);
                var11.method3576(var12[0]);
                var11.method3576(var12[1]);
                var11.method3576(var12[2]);
                var11.method3576(var12[3]);
                var11.method3530(Statics.field97);
                if (field638 == 40) {
                    var11.method3576(Statics.field364[0]);
                    var11.method3576(Statics.field364[1]);
                    var11.method3576(Statics.field364[2]);
                    var11.method3576(Statics.field364[3]);
                } else {
                    var11.method3646(field667.method29());
                    switch(field667.field1989) {
                        case 0:
                            var11.field2423 += 4;
                            break;
                        case 1:
                            var11.method3576((Integer) Statics.field2667.field1018.get(class311.method4780(class85.field1158)));
                            break;
                        case 2:
                        case 3:
                            var11.method3497(Statics.field273);
                            var11.field2423++;
                    }
                    var11.method3646(class316.field3826.method29());
                    var11.method3669(class85.field1159);
                }
                var11.method3578(class83.field1122, class83.field1123);
                Statics.field364 = var12;
                class180 var13 = class180.method5309();
                var13.field2343 = null;
                var13.field2344 = 0;
                var13.field2345 = new class197(5000);
                var13.field2345.field2423 = 0;
                if (field638 == 40) {
                    var13.field2345.method3646(class178.field2325.field2326);
                } else {
                    var13.field2345.method3646(class178.field2324.field2326);
                }
                var13.field2345.method3508(0);
                int var16 = var13.field2345.field2423;
                var13.field2345.method3576(178);
                var13.field2345.method3576(1);
                var13.field2345.method3646(field636);
                var13.field2345.method3519(var11.field2424, 0, var11.field2423);
                int var17 = var13.field2345.field2423;
                var13.field2345.method3669(class85.field1158);
                var13.field2345.method3646((field844 ? 1 : 0) << 1 | (field826 ? 1 : 0));
                var13.field2345.method3508(Statics.field1878);
                var13.field2345.method3508(Statics.field442);
                method1035(var13.field2345);
                var13.field2345.method3669(Statics.field53);
                var13.field2345.method3576(Statics.field1110);
                class190 var18 = new class190(Statics.field587.method5826());
                Statics.field587.method5825(var18);
                var13.field2345.method3519(var18.field2424, 0, var18.field2424.length);
                var13.field2345.method3646(field636);
                var13.field2345.method3576(0);
                var13.field2345.method3576(Statics.field165.field3240);
                var13.field2345.method3576(Statics.field2569.field3240);
                var13.field2345.method3576(Statics.field255.field3240);
                var13.field2345.method3576(Statics.field195.field3240);
                var13.field2345.method3576(Statics.field530.field3240);
                var13.field2345.method3576(Statics.field1740.field3240);
                var13.field2345.method3576(Statics.field485.field3240);
                var13.field2345.method3576(Statics.field1952.field3240);
                var13.field2345.method3576(Statics.field549.field3240);
                var13.field2345.method3576(Statics.field83.field3240);
                var13.field2345.method3576(Statics.field376.field3240);
                var13.field2345.method3576(Statics.field1930.field3240);
                var13.field2345.method3576(Statics.field1733.field3240);
                var13.field2345.method3576(Statics.field13.field3240);
                var13.field2345.method3576(Statics.field189.field3240);
                var13.field2345.method3576(Statics.field351.field3240);
                var13.field2345.method3576(0);
                var13.field2345.method3576(Statics.field1279.field3240);
                var13.field2345.method3576(Statics.field1956.field3240);
                var13.field2345.method3576(Statics.field229.field3240);
                var13.field2345.method3576(Statics.field569.field3240);
                var13.field2345.method3532(var12, var17, var13.field2345.field2423);
                var13.field2345.method3493(var13.field2345.field2423 - var16);
                field886.method2059(var13);
                field886.method2063();
                field886.field1271 = new class198(var12);
                int[] var19 = new int[4];
                for (int var20 = 0; var20 < 4; var20++) {
                    var19[var20] = var12[var20] + 50;
                }
                var2.method3764(var19);
                field663 = 6;
            }
            if (field663 == 6 && var1.method3270() > 0) {
                int var21 = var1.method3271();
                if (var21 == 21 && field638 == 20) {
                    field663 = 9;
                } else if (var21 == 2) {
                    field663 = 11;
                } else if (var21 == 15 && field638 == 40) {
                    field886.field1278 = -1;
                    field663 = 16;
                } else if (var21 == 64) {
                    field663 = 7;
                } else if (var21 == 23 && field665 < 1) {
                    field665++;
                    field663 = 0;
                } else if (var21 == 29) {
                    field663 = 14;
                } else {
                    method997(var21);
                    return;
                }
            }
            if (field663 == 7 && var1.method3270() > 0) {
                Statics.field339 = var1.method3271();
                field663 = 8;
            }
            if (field663 == 8 && var1.method3270() >= Statics.field339) {
                var1.method3272(var2.field2424, 0, Statics.field339);
                var2.field2423 = 0;
                field663 = 6;
            }
            if (field663 == 9 && var1.method3270() > 0) {
                field666 = (var1.method3271() + 3) * 60;
                field663 = 10;
            }
            if (field663 == 10) {
                field686 = 0;
                class85.method1842(class245.field2935, class245.field2868, field666 / 60 + class245.field3148);
                if (--field666 <= 0) {
                    field663 = 0;
                }
            } else {
                if (field663 == 11 && var1.method3270() >= 1) {
                    Statics.field1516 = var1.method3271();
                    field663 = 12;
                }
                if (field663 == 12 && var1.method3270() >= Statics.field1516) {
                    boolean var22 = var1.method3271() == 1;
                    var1.method3272(var2.field2424, 0, 4);
                    var2.field2423 = 0;
                    boolean var23 = false;
                    if (var22) {
                        int var24 = var2.method3750() << 24;
                        int var25 = var24 | var2.method3750() << 16;
                        int var26 = var25 | var2.method3750() << 8;
                        int var27 = var26 | var2.method3750();
                        int var28 = class311.method4780(class85.field1158);
                        if (Statics.field2667.field1018.size() >= 10 && !Statics.field2667.field1018.containsKey(var28)) {
                            Iterator var29 = Statics.field2667.field1018.entrySet().iterator();
                            var29.next();
                            var29.remove();
                        }
                        Statics.field2667.field1018.put(var28, var27);
                    }
                    if (field668) {
                        Statics.field2667.field1017 = class85.field1158;
                    } else {
                        Statics.field2667.field1017 = null;
                    }
                    class73.method1874();
                    field821 = var1.method3271();
                    field801 = var1.method3271() == 1;
                    field747 = var1.method3271();
                    field747 <<= 0x8;
                    field747 += var1.method3271();
                    field789 = var1.method3271();
                    var1.method3272(var2.field2424, 0, 1);
                    var2.field2423 = 0;
                    class176[] var30 = class176.method3127();
                    int var31 = var2.method3742();
                    if (var31 < 0 || var31 >= var30.length) {
                        throw new IOException(var31 + " " + var2.field2423);
                    }
                    field886.field1277 = var30[var31];
                    field886.field1278 = field886.field1277.field2212;
                    var1.method3272(var2.field2424, 0, 2);
                    var2.field2423 = 0;
                    field886.field1278 = var2.method3513();
                    try {
                        client var32 = Statics.field3685;
                        JSObject.getWindow(var32).call("zap", (Object[]) null);
                    } catch (Throwable var53) {
                    }
                    field663 = 13;
                }
                if (field663 != 13) {
                    if (field663 == 14 && var1.method3270() >= 2) {
                        var2.field2423 = 0;
                        var1.method3272(var2.field2424, 0, 2);
                        var2.field2423 = 0;
                        Statics.field32 = var2.method3513();
                        field663 = 15;
                    }
                    if (field663 == 15 && var1.method3270() >= Statics.field32) {
                        var2.field2423 = 0;
                        var1.method3272(var2.field2424, 0, Statics.field32);
                        var2.field2423 = 0;
                        String var48 = var2.method3520();
                        String var49 = var2.method3520();
                        String var50 = var2.method3520();
                        class85.method1842(var48, var49, var50);
                        method3117(10);
                    }
                    if (field663 == 16) {
                        if (field886.field1278 == -1) {
                            if (var1.method3270() < 2) {
                                return;
                            }
                            var1.method3272(var2.field2424, 0, 2);
                            var2.field2423 = 0;
                            field886.field1278 = var2.method3513();
                        }
                        if (var1.method3270() >= field886.field1278) {
                            var1.method3272(var2.field2424, 0, field886.field1278);
                            var2.field2423 = 0;
                            int var51 = field886.field1278;
                            field680.method5105();
                            method201();
                            class89.method4521(var2);
                            if (var2.field2423 != var51) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field686++;
                        if (field686 > 2000) {
                            if (field665 < 1) {
                                if (Statics.field400 == Statics.field2013) {
                                    Statics.field2013 = Statics.field3;
                                } else {
                                    Statics.field2013 = Statics.field400;
                                }
                                field665++;
                                field663 = 0;
                            } else {
                                method997(-3);
                            }
                        }
                    }
                } else if (var1.method3270() >= field886.field1278) {
                    var2.field2423 = 0;
                    var1.method3272(var2.field2424, 0, field886.field1278);
                    field680.method5083();
                    field805 = -1L;
                    Statics.field262.field571 = 0;
                    Statics.field21 = true;
                    field646 = true;
                    field854 = -1L;
                    class322.method979();
                    field886.method2057();
                    field886.field1281.field2423 = 0;
                    field886.field1277 = null;
                    field886.field1282 = null;
                    field886.field1283 = null;
                    field886.field1284 = null;
                    field886.field1278 = 0;
                    field886.field1280 = 0;
                    field648 = 0;
                    field677 = 0;
                    field649 = 0;
                    method682();
                    class54.method3735(0);
                    class91.field1236.clear();
                    class91.field1235.method3872();
                    class91.field1239.method4061();
                    class91.field1238 = 0;
                    field869 = 0;
                    field794 = false;
                    field768 = 0;
                    field700 = 0;
                    field705 = 0;
                    Statics.field1065 = null;
                    field862 = 0;
                    field855 = -1;
                    field828 = 0;
                    field861 = 0;
                    field657 = class84.field1130;
                    field715 = class84.field1130;
                    field660 = 0;
                    Statics.method272();
                    for (int var34 = 0; var34 < 2048; var34++) {
                        field746[var34] = null;
                    }
                    for (int var35 = 0; var35 < 32768; var35++) {
                        field866[var35] = null;
                    }
                    field757 = -1;
                    field643.method3980();
                    field729.method3980();
                    for (int var36 = 0; var36 < 4; var36++) {
                        for (int var37 = 0; var37 < 104; var37++) {
                            for (int var38 = 0; var38 < 104; var38++) {
                                field758[var36][var37][var38] = null;
                            }
                        }
                    }
                    field759 = new class213();
                    Statics.field2434.method1699();
                    for (int var39 = 0; var39 < Statics.field3302; var39++) {
                        class261 var40 = class261.method3318(var39);
                        if (var40 != null) {
                            class233.field2633[var39] = 0;
                            class233.field2632[var39] = 0;
                        }
                    }
                    Statics.field1514.method1971();
                    field800 = -1;
                    if (field790 != -1) {
                        int var41 = field790;
                        if (var41 != -1 && Statics.field2069[var41]) {
                            Statics.field1736.method4508(var41);
                            if (Statics.field2357[var41] != null) {
                                boolean var42 = true;
                                for (int var43 = 0; var43 < Statics.field2357[var41].length; var43++) {
                                    if (Statics.field2357[var41][var43] != null) {
                                        if (Statics.field2357[var41][var43].field2675 == 2) {
                                            var42 = false;
                                        } else {
                                            Statics.field2357[var41][var43] = null;
                                        }
                                    }
                                }
                                if (var42) {
                                    Statics.field2357[var41] = null;
                                }
                                Statics.field2069[var41] = false;
                            }
                        }
                    }
                    for (class62 var44 = (class62) field693.method3937(); var44 != null; var44 = (class62) field693.method3941()) {
                        method3347(var44, true);
                    }
                    field790 = -1;
                    field693 = new class210(8);
                    field655 = null;
                    method682();
                    field671.method4332((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var45 = 0; var45 < 8; var45++) {
                        field754[var45] = null;
                        field755[var45] = false;
                    }
                    class60.method642();
                    field640 = true;
                    for (int var46 = 0; var46 < 100; var46++) {
                        field835[var46] = true;
                    }
                    Statics.method3148();
                    Statics.field481 = null;
                    for (int var47 = 0; var47 < 8; var47++) {
                        field897[var47] = new class10();
                    }
                    Statics.field898 = null;
                    class89.method4521(var2);
                    Statics.field341 = -1;
                    method2666(false, var2);
                    field886.field1277 = null;
                }
            }
        } catch (IOException var54) {
            if (field665 < 1) {
                if (Statics.field400 == Statics.field2013) {
                    Statics.field2013 = Statics.field3;
                } else {
                    Statics.field2013 = Statics.field400;
                }
                field665++;
                field663 = 0;
            } else {
                method997(-2);
            }
        }
    }

    @ObfuscatedName("p.fl(I)V")
    public static void method201() {
        field886.method2057();
        field886.field1281.field2423 = 0;
        field886.field1277 = null;
        field886.field1282 = null;
        field886.field1283 = null;
        field886.field1284 = null;
        field886.field1278 = 0;
        field886.field1280 = 0;
        field648 = 0;
        method682();
        field862 = 0;
        field828 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field746[var0] = null;
        }
        Statics.field218 = null;
        for (int var1 = 0; var1 < field866.length; var1++) {
            class79 var2 = field866[var1];
            if (var2 != null) {
                var2.field930 = -1;
                var2.field983 = false;
            }
        }
        class60.method642();
        method3117(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field835[var3] = true;
        }
        Statics.method3148();
    }

    @ObfuscatedName("be.fd(II)V")
    public static void method997(int arg0) {
        if (arg0 == -3) {
            class85.method1842(class245.field2913, class245.field3057, class245.field2904);
        } else if (arg0 == -2) {
            class85.method1842(class245.field3128, class245.field3143, class245.field2918);
        } else if (arg0 == -1) {
            class85.method1842(class245.field2919, class245.field2920, class245.field3035);
        } else if (arg0 == 3) {
            class85.field1150 = 3;
            class85.field1152 = 1;
        } else if (arg0 == 4) {
            class85.field1150 = 12;
            class85.field1151 = 0;
        } else if (arg0 == 5) {
            class85.field1152 = 2;
            class85.method1842(class245.field2925, class245.field2926, class245.field2927);
        } else if (arg0 == 68 || !(field637 || arg0 != 6)) {
            class85.method1842(class245.field2886, class245.field2929, class245.field2930);
        } else if (arg0 == 7) {
            class85.method1842(class245.field2931, class245.field2971, class245.field2933);
        } else if (arg0 == 8) {
            class85.method1842(class245.field2934, class245.field3036, class245.field2936);
        } else if (arg0 == 9) {
            class85.method1842(class245.field2937, class245.field3153, class245.field3083);
        } else if (arg0 == 10) {
            class85.method1842(class245.field2940, class245.field2987, class245.field2942);
        } else if (arg0 == 11) {
            class85.method1842(class245.field3085, class245.field2944, class245.field2945);
        } else if (arg0 == 12) {
            class85.method1842(class245.field3016, class245.field2947, class245.field2948);
        } else if (arg0 == 13) {
            class85.method1842(class245.field3132, class245.field2950, class245.field2951);
        } else if (arg0 == 14) {
            class85.method1842(class245.field3116, class245.field2953, class245.field2954);
        } else if (arg0 == 16) {
            class85.method1842(class245.field2917, class245.field3125, class245.field2878);
        } else if (arg0 == 17) {
            class85.method1842(class245.field2958, class245.field2959, class245.field2960);
        } else if (arg0 == 18) {
            class85.field1150 = 12;
            class85.field1151 = 1;
        } else if (arg0 == 19) {
            class85.method1842(class245.field2964, class245.field2965, class245.field2946);
        } else if (arg0 == 20) {
            class85.method1842(class245.field2967, class245.field2968, class245.field2969);
        } else if (arg0 == 22) {
            class85.method1842(class245.field3014, class245.field3029, class245.field3121);
        } else if (arg0 == 23) {
            class85.method1842(class245.field2988, class245.field2974, class245.field2975);
        } else if (arg0 == 24) {
            class85.method1842(class245.field3104, class245.field2977, class245.field2978);
        } else if (arg0 == 25) {
            class85.method1842(class245.field2979, class245.field3124, class245.field2981);
        } else if (arg0 == 26) {
            class85.method1842(class245.field2982, class245.field2983, class245.field2984);
        } else if (arg0 == 27) {
            class85.method1842(class245.field3056, class245.field2986, class245.field2916);
        } else if (arg0 == 31) {
            class85.method1842(class245.field2994, class245.field2995, class245.field3136);
        } else if (arg0 == 32) {
            class85.method1842(class245.field2938, class245.field2998, class245.field2912);
        } else if (arg0 == 37) {
            class85.method1842(class245.field3133, class245.field3001, class245.field3002);
        } else if (arg0 == 38) {
            class85.method1842(class245.field3003, class245.field3089, class245.field3005);
        } else if (arg0 == 55) {
            class85.field1150 = 8;
        } else if (arg0 == 56) {
            class85.method1842(class245.field3010, class245.field3011, class245.field3012);
            method3117(11);
            return;
        } else if (arg0 == 57) {
            class85.method1842(class245.field3149, class245.field3024, class245.field3015);
            method3117(11);
            return;
        } else if (arg0 == 61) {
            class85.field1150 = 7;
        } else {
            class85.method1842(class245.field2976, class245.field3017, class245.field3018);
        }
        method3117(10);
    }

    @ObfuscatedName("ca.fq(I)V")
    public static final void method1932() {
        field886.method2066();
        class278.method4861();
        class265.method4627();
        class266.field3364.method3899();
        class274.field3442.method3899();
        class274.field3443.method3899();
        class274.field3444.method3899();
        class274.field3445.method3899();
        class277.field3552.method3899();
        class277.field3562.method3899();
        class275.field3508.method3899();
        class275.field3495.method3899();
        class275.field3496.method3899();
        class279.method1852();
        class264.method30();
        class269.method4306();
        class261.field3303.method3899();
        class273.method3150();
        Statics.method4600();
        class271.method1946();
        class270.method1866();
        class262.field3311.method3899();
        class235.method4327();
        class238.field2714.method3899();
        class238.field2780.method3899();
        class238.field2669.method3899();
        class238.field2662.method3899();
        ((class119) Statics.field1765).method2552();
        class92.field1252.method3899();
        Statics.field165.method4460();
        Statics.field2569.method4460();
        Statics.field195.method4460();
        Statics.field530.method4460();
        Statics.field1740.method4460();
        Statics.field485.method4460();
        Statics.field1952.method4460();
        Statics.field549.method4460();
        Statics.field83.method4460();
        Statics.field376.method4460();
        Statics.field1930.method4460();
        Statics.field1733.method4460();
        Statics.field185.method2870();
        for (int var0 = 0; var0 < 4; var0++) {
            field641[var0].method3343();
        }
        System.gc();
        class225.method629(2);
        field864 = -1;
        field664 = false;
        for (class75 var1 = (class75) class75.field1034.method3986(); var1 != null; var1 = (class75) class75.field1034.method3988()) {
            if (var1.field1040 != null) {
                Statics.field197.method2117(var1.field1040);
                var1.field1040 = null;
            }
            if (var1.field1045 != null) {
                Statics.field197.method2117(var1.field1045);
                var1.field1045 = null;
            }
        }
        class75.field1034.method3980();
        method3117(10);
    }

    @ObfuscatedName("fl.fr(ZI)V")
    public static final void method3297(boolean arg0) {
        if (arg0) {
            field667 = class85.field1164 ? class154.field1986 : class154.field1988;
        } else {
            field667 = Statics.field2667.field1018.containsKey(class311.method4780(class85.field1158)) ? class154.field1990 : class154.field1987;
        }
    }

    @ObfuscatedName("client.fw(I)V")
    public final void method1157() {
        if (field648 > 1) {
            field648--;
        }
        if (field677 > 0) {
            field677--;
        }
        if (field678) {
            field678 = false;
            Statics.method669();
            return;
        }
        if (!field766) {
            method473();
        }
        for (int var1 = 0; var1 < 100 && this.method1160(field886); var1++) {
        }
        if (field638 != 30) {
            return;
        }
        while (class322.method989()) {
            class180 var2 = class180.method1090(class177.field2310, field886.field1271);
            var2.field2345.method3646(0);
            int var3 = var2.field2345.field2423;
            class322.method3410(var2.field2345);
            var2.field2345.method3506(var2.field2345.field2423 - var3);
            field886.method2059(var2);
        }
        if (field680.field3669) {
            class180 var4 = class180.method1090(class177.field2249, field886.field1271);
            var4.field2345.method3646(0);
            int var5 = var4.field2345.field2423;
            field680.method5086(var4.field2345);
            var4.field2345.method3506(var4.field2345.field2423 - var5);
            field886.method2059(var4);
            field680.method5084();
        }
        Object var6 = Statics.field262.field572;
        synchronized (Statics.field262.field572) {
            if (!field858) {
                Statics.field262.field571 = 0;
            } else if (class54.field460 != 0 || Statics.field262.field571 >= 40) {
                class180 var7 = null;
                int var8 = 0;
                int var9 = 0;
                int var10 = 0;
                int var11 = 0;
                for (int var12 = 0; var12 < Statics.field262.field571 && (var7 == null || var7.field2345.field2423 - var8 < 246); var12++) {
                    var9 = var12;
                    int var13 = Statics.field262.field570[var12];
                    if (var13 < -1) {
                        var13 = -1;
                    } else if (var13 > 65534) {
                        var13 = 65534;
                    }
                    int var14 = Statics.field262.field573[var12];
                    if (var14 < -1) {
                        var14 = -1;
                    } else if (var14 > 65534) {
                        var14 = 65534;
                    }
                    if (field696 != var14 || field644 != var13) {
                        if (var7 == null) {
                            var7 = class180.method1090(class177.field2253, field886.field1271);
                            var7.field2345.method3646(0);
                            var8 = var7.field2345.field2423;
                            var7.field2345.field2423 += 2;
                            var10 = 0;
                            var11 = 0;
                        }
                        int var15;
                        int var16;
                        int var17;
                        if (field797 == -1L) {
                            var15 = var14;
                            var16 = var13;
                            var17 = Integer.MAX_VALUE;
                        } else {
                            var15 = var14 - field696;
                            var16 = var13 - field644;
                            var17 = (int) ((Statics.field262.field575[var12] - field797) / 20L);
                            var10 = (int) ((Statics.field262.field575[var12] - field797) % 20L + (long) var10);
                        }
                        field696 = var14;
                        field644 = var13;
                        if (var17 < 8 && var15 >= -32 && var15 <= 31 && var16 >= -32 && var16 <= 31) {
                            var15 += 32;
                            var16 += 32;
                            var7.field2345.method3508((var15 << 6) + (var17 << 12) + var16);
                        } else if (var17 < 32 && var15 >= -128 && var15 <= 127 && var16 >= -128 && var16 <= 127) {
                            var15 += 128;
                            var16 += 128;
                            var7.field2345.method3646(var17 + 128);
                            var7.field2345.method3508((var15 << 8) + var16);
                        } else if (var17 < 32) {
                            var7.field2345.method3646(var17 + 192);
                            if (var14 == -1 || var13 == -1) {
                                var7.field2345.method3576(Integer.MIN_VALUE);
                            } else {
                                var7.field2345.method3576(var14 | var13 << 16);
                            }
                        } else {
                            var7.field2345.method3508((var17 & 0x1FFF) + 57344);
                            if (var14 == -1 || var13 == -1) {
                                var7.field2345.method3576(Integer.MIN_VALUE);
                            } else {
                                var7.field2345.method3576(var14 | var13 << 16);
                            }
                        }
                        var11++;
                        field797 = Statics.field262.field575[var12];
                    }
                }
                if (var7 != null) {
                    var7.field2345.method3506(var7.field2345.field2423 - var8);
                    int var18 = var7.field2345.field2423;
                    var7.field2345.field2423 = var8;
                    var7.field2345.method3646(var10 / var11);
                    var7.field2345.method3646(var10 % var11);
                    var7.field2345.field2423 = var18;
                    field886.method2059(var7);
                }
                if (var9 >= Statics.field262.field571) {
                    Statics.field262.field571 = 0;
                } else {
                    Statics.field262.field571 -= var9;
                    System.arraycopy(Statics.field262.field573, var9, Statics.field262.field573, 0, Statics.field262.field571);
                    System.arraycopy(Statics.field262.field570, var9, Statics.field262.field570, 0, Statics.field262.field571);
                    System.arraycopy(Statics.field262.field575, var9, Statics.field262.field575, 0, Statics.field262.field571);
                }
            }
        }
        if (class54.field460 == 1 || !Statics.field98 && class54.field460 == 4 || class54.field460 == 2) {
            long var20 = (class54.field480 - field805) / 50L;
            if (var20 > 4095L) {
                var20 = 4095L;
            }
            field805 = class54.field480;
            int var22 = class54.field479;
            if (var22 < 0) {
                var22 = 0;
            } else if (var22 > Statics.field442) {
                var22 = Statics.field442;
            }
            int var23 = class54.field478;
            if (var23 < 0) {
                var23 = 0;
            } else if (var23 > Statics.field1878) {
                var23 = Statics.field1878;
            }
            int var24 = (int) var20;
            class180 var25 = class180.method1090(class177.field2318, field886.field1271);
            var25.field2345.method3508((class54.field460 == 2 ? 1 : 0) + (var24 << 1));
            var25.field2345.method3508(var23);
            var25.field2345.method3508(var22);
            field886.method2059(var25);
        }
        if (class45.field389 > 0) {
            class180 var26 = class180.method1090(class177.field2314, field886.field1271);
            var26.field2345.method3508(0);
            int var27 = var26.field2345.field2423;
            long var28 = class192.method81();
            for (int var30 = 0; var30 < class45.field389; var30++) {
                long var31 = var28 - field854;
                if (var31 > 16777215L) {
                    var31 = 16777215L;
                }
                field854 = var28;
                var26.field2345.method3538(class45.field388[var30]);
                var26.field2345.method3497((int) var31);
            }
            var26.field2345.method3493(var26.field2345.field2423 - var27);
            field886.method2059(var26);
        }
        if (field714 > 0) {
            field714--;
        }
        if (class45.field382[96] || class45.field382[97] || class45.field382[98] || class45.field382[99]) {
            field860 = true;
        }
        if (field860 && field714 <= 0) {
            field714 = 20;
            field860 = false;
            class180 var33 = class180.method1090(class177.field2258, field886.field1271);
            var33.field2345.method3574(field699);
            var33.field2345.method3546(field700);
            field886.method2059(var33);
        }
        if (Statics.field21 && !field646) {
            field646 = true;
            class180 var34 = class180.method1090(class177.field2313, field886.field1271);
            var34.field2345.method3646(1);
            field886.method2059(var34);
        }
        if (!Statics.field21 && field646) {
            field646 = false;
            class180 var35 = class180.method1090(class177.field2313, field886.field1271);
            var35.field2345.method3646(0);
            field886.method2059(var35);
        }
        if (Statics.field533 != null) {
            Statics.field533.method5845();
        }
        if (Statics.field1041) {
            if (Statics.field481 != null) {
                Statics.field481.method5191();
            }
            method229();
            Statics.field1041 = false;
        }
        if (Statics.field66 != field855) {
            field855 = Statics.field66;
            int var36 = Statics.field66;
            int[] var37 = Statics.field988.field3883;
            int var38 = var37.length;
            for (int var39 = 0; var39 < var38; var39++) {
                var37[var39] = 0;
            }
            for (int var40 = 1; var40 < 103; var40++) {
                int var41 = (103 - var40) * 2048 + 24628;
                for (int var42 = 1; var42 < 103; var42++) {
                    if ((class56.field492[var36][var42][var40] & 0x18) == 0) {
                        Statics.field185.method2904(var37, var41, 512, var36, var42, var40);
                    }
                    if (var36 < 3 && (class56.field492[var36 + 1][var42][var40] & 0x8) != 0) {
                        Statics.field185.method2904(var37, var41, 512, var36 + 1, var42, var40);
                    }
                    var41 += 4;
                }
            }
            int var43 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
            int var44 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
            Statics.field988.method5689();
            for (int var45 = 1; var45 < 103; var45++) {
                for (int var46 = 1; var46 < 103; var46++) {
                    if ((class56.field492[var36][var46][var45] & 0x18) == 0) {
                        method3340(var36, var46, var45, var43, var44);
                    }
                    if (var36 < 3 && (class56.field492[var36 + 1][var46][var45] & 0x8) != 0) {
                        method3340(var36 + 1, var46, var45, var43, var44);
                    }
                }
            }
            field856 = 0;
            for (int var47 = 0; var47 < 104; var47++) {
                for (int var48 = 0; var48 < 104; var48++) {
                    long var49 = Statics.field185.method2899(Statics.field66, var47, var48);
                    if (var49 != 0L) {
                        int var51 = class128.method1149(var49);
                        int var52 = class274.method4676(var51).field3440;
                        if (var52 >= 0) {
                            field796[field856] = class262.method106(var52).method4655(false);
                            field723[field856] = var47;
                            field748[field856] = var48;
                            field856++;
                        }
                    }
                }
            }
            Statics.field184.method5663();
        }
        if (field638 != 30) {
            return;
        }
        method708();
        int var10002;
        for (int var53 = 0; var53 < field768; var53++) {
            var10002 = field871[var53]--;
            if (field871[var53] >= -10) {
                class99 var55 = field873[var53];
                if (var55 == null) {
                    class99 var10000 = (class99) null;
                    var55 = class99.method2161(Statics.field530, field785[var53], 0);
                    if (var55 == null) {
                        continue;
                    }
                    field871[var53] += var55.method2150();
                    field873[var53] = var55;
                }
                if (field871[var53] < 0) {
                    int var62;
                    if (field872[var53] == 0) {
                        var62 = field857;
                    } else {
                        int var56 = (field872[var53] & 0xFF) * 128;
                        int var57 = field872[var53] >> 16 & 0xFF;
                        int var58 = var57 * 128 + 64 - Statics.field218.field949;
                        if (var58 < 0) {
                            var58 = -var58;
                        }
                        int var59 = field872[var53] >> 8 & 0xFF;
                        int var60 = var59 * 128 + 64 - Statics.field218.field922;
                        if (var60 < 0) {
                            var60 = -var60;
                        }
                        int var61 = var58 + var60 - 128;
                        if (var61 > var56) {
                            field871[var53] = -100;
                            continue;
                        }
                        if (var61 < 0) {
                            var61 = 0;
                        }
                        var62 = field867 * (var56 - var61) / var56;
                    }
                    if (var62 > 0) {
                        class101 var63 = var55.method2158().method2199(Statics.field1394);
                        class111 var64 = class111.method2326(var63, 100, var62);
                        var64.method2378(field870[var53] - 1);
                        Statics.field197.method2090(var64);
                    }
                    field871[var53] = -100;
                }
            } else {
                field768--;
                for (int var54 = var53; var54 < field768; var54++) {
                    field785[var54] = field785[var54 + 1];
                    field873[var54] = field873[var54 + 1];
                    field870[var54] = field870[var54 + 1];
                    field871[var54] = field871[var54 + 1];
                    field872[var54] = field872[var54 + 1];
                }
                var53--;
            }
        }
        if (field664 && !class225.method3298()) {
            if (field761 != 0 && field864 != -1) {
                class225.method1964(Statics.field485, field864, 0, field761, false);
            }
            field664 = false;
        }
        field886.field1280++;
        if (field886.field1280 > 750) {
            Statics.method669();
            return;
        }
        int var65 = class89.field1213;
        int[] var66 = class89.field1214;
        for (int var67 = 0; var67 < var65; var67++) {
            class67 var68 = field746[var66[var67]];
            if (var68 != null) {
                method202(var68, 1);
            }
        }
        for (int var69 = 0; var69 < field660; var69++) {
            int var70 = field763[var69];
            class79 var71 = field866[var70];
            if (var71 != null) {
                method202(var71, var71.field1086.field3549);
            }
        }
        int[] var72 = class89.field1214;
        for (int var73 = 0; var73 < class89.field1213; var73++) {
            class67 var74 = field746[var72[var73]];
            if (var74 != null && var74.field978 > 0) {
                var74.field978--;
                if (var74.field978 == 0) {
                    var74.field935 = null;
                }
            }
        }
        for (int var75 = 0; var75 < field660; var75++) {
            int var76 = field763[var75];
            class79 var77 = field866[var76];
            if (var77 != null && var77.field978 > 0) {
                var77.field978--;
                if (var77.field978 == 0) {
                    var77.field935 = null;
                }
            }
        }
        field691++;
        if (field733 != 0) {
            field659 += 20;
            if (field659 >= 400) {
                field733 = 0;
            }
        }
        if (Statics.field62 != null) {
            field736++;
            if (field736 >= 15) {
                method649(Statics.field62);
                Statics.field62 = null;
            }
        }
        class238 var78 = Statics.field1777;
        class238 var79 = Statics.field1268;
        Statics.field1777 = null;
        Statics.field1268 = null;
        field633 = null;
        field811 = false;
        field808 = false;
        field673 = 0;
        while (class45.method565() && field673 < 128) {
            if (field821 >= 2 && class45.field382[82] && Statics.field3625 == 66) {
                String var80 = class91.method16();
                Statics.field3685.method756(var80);
            } else if (field705 != 1 || Statics.field2218 <= 0) {
                field853[field673] = Statics.field3625;
                field852[field673] = Statics.field2218;
                field673++;
            }
        }
        if (method364() && class45.field382[82] && class45.field382[81] && field672 != 0) {
            int var81 = Statics.field218.field614 - field672;
            if (var81 < 0) {
                var81 = 0;
            } else if (var81 > 3) {
                var81 = 3;
            }
            if (Statics.field218.field614 != var81) {
                int var82 = Statics.field512 + Statics.field218.field977[0];
                int var83 = Statics.field318 + Statics.field218.field982[0];
                class180 var84 = class180.method1090(class177.field2280, field886.field1271);
                var84.field2345.method3634(0);
                var84.field2345.method3546(var83);
                var84.field2345.method3538(var81);
                var84.field2345.method3508(var82);
                field886.method2059(var84);
            }
            field672 = 0;
        }
        if (field790 != -1) {
            method120(field790, 0, 0, Statics.field1878, Statics.field442, 0, 0);
        }
        field740++;
        while (true) {
            class63 var85;
            class238 var86;
            class238 var87;
            do {
                var85 = (class63) field783.method3984();
                if (var85 == null) {
                    while (true) {
                        class63 var88;
                        class238 var89;
                        class238 var90;
                        do {
                            var88 = (class63) field831.method3984();
                            if (var88 == null) {
                                while (true) {
                                    class63 var91;
                                    class238 var92;
                                    class238 var93;
                                    do {
                                        var91 = (class63) field829.method3984();
                                        if (var91 == null) {
                                            this.method1161();
                                            method3787();
                                            if (field823 != null) {
                                                this.method1166();
                                            }
                                            if (Statics.field409 != null) {
                                                method649(Statics.field409);
                                                field743++;
                                                if (class54.field469 == 0) {
                                                    if (field792) {
                                                        if (Statics.field409 == Statics.field220 && field741 != field738) {
                                                            class238 var94 = Statics.field409;
                                                            byte var95 = 0;
                                                            if (field795 == 1 && var94.field2677 == 206) {
                                                                var95 = 1;
                                                            }
                                                            if (var94.field2798[field741] <= 0) {
                                                                var95 = 0;
                                                            }
                                                            if (class239.method280(method2756(var94))) {
                                                                int var96 = field738;
                                                                int var97 = field741;
                                                                var94.field2798[var97] = var94.field2798[var96];
                                                                var94.field2799[var97] = var94.field2799[var96];
                                                                var94.field2798[var96] = -1;
                                                                var94.field2799[var96] = 0;
                                                            } else if (var95 == 1) {
                                                                int var98 = field738;
                                                                int var99 = field741;
                                                                while (var98 != var99) {
                                                                    if (var98 > var99) {
                                                                        var94.method4378(var98 - 1, var98);
                                                                        var98--;
                                                                    } else if (var98 < var99) {
                                                                        var94.method4378(var98 + 1, var98);
                                                                        var98++;
                                                                    }
                                                                }
                                                            } else {
                                                                var94.method4378(field741, field738);
                                                            }
                                                            class180 var100 = class180.method1090(class177.field2299, field886.field1271);
                                                            var100.field2345.method3508(field741);
                                                            var100.field2345.method3546(field738);
                                                            var100.field2345.method3576(Statics.field409.field2699);
                                                            var100.field2345.method3538(var95);
                                                            field886.method2059(var100);
                                                        }
                                                    } else if (this.method1162()) {
                                                        this.method1163(field739, field830);
                                                    } else if (field774 > 0) {
                                                        method493(field739, field830);
                                                    }
                                                    field736 = 10;
                                                    class54.field460 = 0;
                                                    Statics.field409 = null;
                                                } else if (field743 >= 5 && (class54.field468 > field739 + 5 || class54.field468 < field739 - 5 || class54.field475 * 30622073 > field830 + 5 || class54.field475 * 30622073 < field830 - 5)) {
                                                    field792 = true;
                                                }
                                            }
                                            if (class133.method2909()) {
                                                int var101 = class133.field1837;
                                                int var102 = class133.field1787;
                                                class180 var103 = class180.method1090(class177.field2311, field886.field1271);
                                                var103.field2345.method3646(5);
                                                var103.field2345.method3571(Statics.field318 + var102);
                                                var103.field2345.method3571(Statics.field512 + var101);
                                                var103.field2345.method3591(class45.field382[82] ? (class45.field382[81] ? 2 : 1) : 0);
                                                field886.method2059(var103);
                                                class133.method3026();
                                                field731 = class54.field478;
                                                field771 = class54.field479;
                                                field733 = 1;
                                                field659 = 0;
                                                field828 = var101;
                                                field861 = var102;
                                            }
                                            if (Statics.field1777 != var78) {
                                                if (var78 != null) {
                                                    method649(var78);
                                                }
                                                if (Statics.field1777 != null) {
                                                    method649(Statics.field1777);
                                                }
                                            }
                                            if (Statics.field1268 != var79 && field781 == field629) {
                                                if (var79 != null) {
                                                    method649(var79);
                                                }
                                                if (Statics.field1268 != null) {
                                                    method649(Statics.field1268);
                                                }
                                            }
                                            if (Statics.field1268 == null) {
                                                if (field781 > 0) {
                                                    field781--;
                                                }
                                            } else if (field781 < field629) {
                                                field781++;
                                                if (field781 == field629) {
                                                    method649(Statics.field1268);
                                                }
                                            }
                                            method5479();
                                            if (field874) {
                                                int var104 = Statics.field25 * 128 + 64;
                                                int var105 = Statics.field1208 * 128 + 64;
                                                int var106 = method643(var104, var105, Statics.field66) - Statics.field1525;
                                                if (Statics.field1118 < var104) {
                                                    Statics.field1118 += Statics.field298 * (var104 - Statics.field1118) / 1000 + Statics.field2618;
                                                    if (Statics.field1118 > var104) {
                                                        Statics.field1118 = var104;
                                                    }
                                                }
                                                if (Statics.field1118 > var104) {
                                                    Statics.field1118 -= Statics.field298 * (Statics.field1118 - var104) / 1000 + Statics.field2618;
                                                    if (Statics.field1118 < var104) {
                                                        Statics.field1118 = var104;
                                                    }
                                                }
                                                if (Statics.field2012 < var106) {
                                                    Statics.field2012 += Statics.field298 * (var106 - Statics.field2012) / 1000 + Statics.field2618;
                                                    if (Statics.field2012 > var106) {
                                                        Statics.field2012 = var106;
                                                    }
                                                }
                                                if (Statics.field2012 > var106) {
                                                    Statics.field2012 -= Statics.field298 * (Statics.field2012 - var106) / 1000 + Statics.field2618;
                                                    if (Statics.field2012 < var106) {
                                                        Statics.field2012 = var106;
                                                    }
                                                }
                                                if (Statics.field653 < var105) {
                                                    Statics.field653 += Statics.field298 * (var105 - Statics.field653) / 1000 + Statics.field2618;
                                                    if (Statics.field653 > var105) {
                                                        Statics.field653 = var105;
                                                    }
                                                }
                                                if (Statics.field653 > var105) {
                                                    Statics.field653 -= Statics.field298 * (Statics.field653 - var105) / 1000 + Statics.field2618;
                                                    if (Statics.field653 < var105) {
                                                        Statics.field653 = var105;
                                                    }
                                                }
                                                int var107 = Statics.field8 * 128 + 64;
                                                int var108 = Statics.field1942 * 128 + 64;
                                                int var109 = method643(var107, var108, Statics.field66) - Statics.field59;
                                                int var110 = var107 - Statics.field1118;
                                                int var111 = var109 - Statics.field2012;
                                                int var112 = var108 - Statics.field653;
                                                int var113 = (int) Math.sqrt((double) (var110 * var110 + var112 * var112));
                                                int var114 = (int) (Math.atan2((double) var111, (double) var113) * 325.949D) & 0x7FF;
                                                int var115 = (int) (Math.atan2((double) var110, (double) var112) * -325.949D) & 0x7FF;
                                                if (var114 < 128) {
                                                    var114 = 128;
                                                }
                                                if (var114 > 383) {
                                                    var114 = 383;
                                                }
                                                if (Statics.field3280 < var114) {
                                                    Statics.field3280 += Statics.field3732 * (var114 - Statics.field3280) / 1000 + Statics.field84;
                                                    if (Statics.field3280 > var114) {
                                                        Statics.field3280 = var114;
                                                    }
                                                }
                                                if (Statics.field3280 > var114) {
                                                    Statics.field3280 -= Statics.field3732 * (Statics.field3280 - var114) / 1000 + Statics.field84;
                                                    if (Statics.field3280 < var114) {
                                                        Statics.field3280 = var114;
                                                    }
                                                }
                                                int var116 = var115 - Statics.field407;
                                                if (var116 > 1024) {
                                                    var116 -= 2048;
                                                }
                                                if (var116 < -1024) {
                                                    var116 += 2048;
                                                }
                                                if (var116 > 0) {
                                                    Statics.field407 += Statics.field3732 * var116 / 1000 + Statics.field84;
                                                    Statics.field407 &= 0x7FF;
                                                }
                                                if (var116 < 0) {
                                                    Statics.field407 -= Statics.field3732 * -var116 / 1000 + Statics.field84;
                                                    Statics.field407 &= 0x7FF;
                                                }
                                                int var117 = var115 - Statics.field407;
                                                if (var117 > 1024) {
                                                    var117 -= 2048;
                                                }
                                                if (var117 < -1024) {
                                                    var117 += 2048;
                                                }
                                                if (var117 < 0 && var116 > 0 || var117 > 0 && var116 < 0) {
                                                    Statics.field407 = var115;
                                                }
                                            }
                                            for (int var118 = 0; var118 < 5; var118++) {
                                                var10002 = field891[var118]++;
                                            }
                                            Statics.field1514.method1975();
                                            int var119 = ++class54.field464 - 1;
                                            int var121 = class45.method1819();
                                            if (var119 > 15000 && var121 > 15000) {
                                                field677 = 250;
                                                class54.method3735(14500);
                                                class180 var122 = class180.method1090(class177.field2219, field886.field1271);
                                                field886.method2059(var122);
                                            }
                                            Statics.field2434.method1649();
                                            field886.field1272++;
                                            if (field886.field1272 > 50) {
                                                class180 var123 = class180.method1090(class177.field2241, field886.field1271);
                                                field886.method2059(var123);
                                            }
                                            try {
                                                field886.method2063();
                                            } catch (IOException var125) {
                                                Statics.method669();
                                            }
                                            return;
                                        }
                                        var92 = var91.field559;
                                        if (var92.field2674 < 0) {
                                            break;
                                        }
                                        var93 = class238.method2289(var92.field2812);
                                    } while (var93 == null || var93.field2810 == null || var92.field2674 >= var93.field2810.length || var93.field2810[var92.field2674] != var92);
                                    class76.method990(var91);
                                }
                            }
                            var89 = var88.field559;
                            if (var89.field2674 < 0) {
                                break;
                            }
                            var90 = class238.method2289(var89.field2812);
                        } while (var90 == null || var90.field2810 == null || var89.field2674 >= var90.field2810.length || var90.field2810[var89.field2674] != var89);
                        class76.method990(var88);
                    }
                }
                var86 = var85.field559;
                if (var86.field2674 < 0) {
                    break;
                }
                var87 = class238.method2289(var86.field2812);
            } while (var87 == null || var87.field2810 == null || var86.field2674 >= var87.field2810.length || var87.field2810[var86.field2674] != var86);
            class76.method990(var85);
        }
    }

    @ObfuscatedName("u.fb(Ljt;IIII)V")
    public static void method267(class279 arg0, int arg1, int arg2, int arg3) {
        if (field768 >= 50 || field867 == 0 || arg0.field3605 == null || arg1 >= arg0.field3605.length) {
            return;
        }
        int var4 = arg0.field3605[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field785[field768] = var5;
        field870[field768] = var6;
        field871[field768] = 0;
        field873[field768] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field872[field768] = (var8 << 16) + (var9 << 8) + var7;
        field768++;
    }

    @ObfuscatedName("cg.fp(IIIB)V")
    public static void method2267(int arg0, int arg1, int arg2) {
        if (field857 == 0 || arg1 == 0 || field768 >= 50) {
            return;
        }
        field785[field768] = arg0;
        field870[field768] = arg1;
        field871[field768] = arg2;
        field873[field768] = null;
        field872[field768] = 0;
        field768++;
    }

    @ObfuscatedName("m.fc(II)V")
    public static void method152(int arg0) {
        if (arg0 == -1 && !field664) {
            class225.method184();
        } else if (arg0 != -1 && field864 != arg0 && field761 != 0 && !field664) {
            class256 var1 = Statics.field485;
            int var2 = field761;
            class225.field2539 = 1;
            Statics.field2540 = var1;
            Statics.field1388 = arg0;
            Statics.field230 = 0;
            Statics.field624 = var2;
            Statics.field1133 = false;
            Statics.field3246 = 2;
        }
        field864 = arg0;
    }

    @ObfuscatedName("ft.ff(III)V")
    public static void method3267(int arg0, int arg1) {
        if (field761 != 0 && arg0 != -1) {
            class225.method1964(Statics.field1930, arg0, 0, field761, false);
            field664 = true;
        }
    }

    @ObfuscatedName("c.fo(Liq;III)V")
    public static final void method54(class238 arg0, int arg1, int arg2) {
        if (field862 != 0 && field862 != 3 || field766 || !(class54.field460 == 1 || !Statics.field98 && class54.field460 == 4)) {
            return;
        }
        class232 var3 = arg0.method4393(true);
        if (var3 == null) {
            return;
        }
        int var4 = class54.field478 - arg1;
        int var5 = class54.field479 - arg2;
        if (!var3.method4303(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2628 / 2;
        int var7 = var5 - var3.field2627 / 2;
        int var8 = field700 & 0x7FF;
        int var9 = class130.field1768[var8];
        int var10 = class130.field1769[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field218.field949 + var11 >> 7;
        int var14 = Statics.field218.field922 - var12 >> 7;
        class180 var15 = class180.method1090(class177.field2301, field886.field1271);
        var15.field2345.method3646(18);
        var15.field2345.method3571(Statics.field318 + var14);
        var15.field2345.method3571(Statics.field512 + var13);
        var15.field2345.method3591(class45.field382[82] ? (class45.field382[81] ? 2 : 1) : 0);
        var15.field2345.method3646(var6);
        var15.field2345.method3646(var7);
        var15.field2345.method3508(field700);
        var15.field2345.method3646(57);
        var15.field2345.method3646(0);
        var15.field2345.method3646(0);
        var15.field2345.method3646(89);
        var15.field2345.method3508(Statics.field218.field949);
        var15.field2345.method3508(Statics.field218.field922);
        var15.field2345.method3646(63);
        field886.method2059(var15);
        field828 = var13;
        field861 = var14;
    }

    @ObfuscatedName("gn.fh(Ljava/lang/String;I)V")
    public static final void method3479(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field2667.field1013 = !Statics.field2667.field1013;
            class73.method1874();
            if (Statics.field2667.field1013) {
                class91.method1872(99, "", "Roofs are now all hidden");
            } else {
                class91.method1872(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field647 = !field647;
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            field749 = !field749;
        }
        if (arg0.equalsIgnoreCase("mouseovertext")) {
            field778 = !field778;
        }
        if (field821 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equalsIgnoreCase("showcoord")) {
                Statics.field533.field3997 = !Statics.field533.field3997;
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
                Statics.method669();
            }
        }
        class180 var1 = class180.method1090(class177.field2279, field886.field1271);
        var1.field2345.method3646(arg0.length() + 1);
        var1.field2345.method3669(arg0);
        field886.method2059(var1);
    }

    @ObfuscatedName("kq.fv(B)V")
    public static final void method5479() {
        if (field705 == 0) {
            int var0 = Statics.field218.field949;
            int var1 = Statics.field218.field922;
            if (Statics.field1087 - var0 < -500 || Statics.field1087 - var0 > 500 || Statics.field3751 - var1 < -500 || Statics.field3751 - var1 > 500) {
                Statics.field1087 = var0;
                Statics.field3751 = var1;
            }
            if (Statics.field1087 != var0) {
                Statics.field1087 += (var0 - Statics.field1087) / 16;
            }
            if (Statics.field3751 != var1) {
                Statics.field3751 += (var1 - Statics.field3751) / 16;
            }
            int var2 = Statics.field1087 >> 7;
            int var3 = Statics.field3751 >> 7;
            int var4 = method643(Statics.field1087, Statics.field3751, Statics.field66);
            int var5 = 0;
            if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                        int var8 = Statics.field66;
                        if (var8 < 3 && (class56.field492[1][var6][var7] & 0x2) == 2) {
                            var8++;
                        }
                        int var9 = var4 - class56.field511[var8][var6][var7];
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
            if (var10 > field716) {
                field716 += (var10 - field716) / 24;
            } else if (var10 < field716) {
                field716 += (var10 - field716) / 80;
            }
            Statics.field172 = method643(Statics.field218.field949, Statics.field218.field922, Statics.field66) - field706;
        } else if (field705 == 1) {
            if (field713 && Statics.field218 != null) {
                int var11 = Statics.field218.field977[0];
                int var12 = Statics.field218.field982[0];
                if (var11 >= 0 && var12 >= 0 && var11 < 104 && var12 < 104) {
                    Statics.field1087 = Statics.field218.field949;
                    int var13 = method643(Statics.field218.field949, Statics.field218.field922, Statics.field66) - field706;
                    if (var13 < Statics.field172) {
                        Statics.field172 = var13;
                    }
                    Statics.field3751 = Statics.field218.field922;
                    field713 = false;
                }
            }
            short var14 = -1;
            if (class45.field382[33]) {
                var14 = 0;
            } else if (class45.field382[49]) {
                var14 = 1024;
            }
            if (class45.field382[48]) {
                if (var14 == 0) {
                    var14 = 1792;
                } else if (var14 == 1024) {
                    var14 = 1280;
                } else {
                    var14 = 1536;
                }
            } else if (class45.field382[50]) {
                if (var14 == 0) {
                    var14 = 256;
                } else if (var14 == 1024) {
                    var14 = 768;
                } else {
                    var14 = 512;
                }
            }
            byte var15 = 0;
            if (class45.field382[35]) {
                var15 = -1;
            } else if (class45.field382[51]) {
                var15 = 1;
            }
            int var16 = 0;
            if (var14 >= 0 || var15 != 0) {
                int var17 = class45.field382[81] ? field711 : field710;
                var16 = var17 * 16;
                field708 = var14;
                field709 = var15;
            }
            if (field707 < var16) {
                field707 += var16 / 8;
                if (field707 > var16) {
                    field707 = var16;
                }
            } else if (field707 > var16) {
                field707 = field707 * 9 / 10;
            }
            if (field707 > 0) {
                int var18 = field707 / 16;
                if (field708 >= 0) {
                    int var19 = field708 - Statics.field407 & 0x7FF;
                    int var20 = class130.field1768[var19];
                    int var21 = class130.field1769[var19];
                    Statics.field1087 += var18 * var20 / 65536;
                    Statics.field3751 += var18 * var21 / 65536;
                }
                if (field709 != 0) {
                    Statics.field172 += field709 * var18;
                    if (Statics.field172 > 0) {
                        Statics.field172 = 0;
                    }
                }
            } else {
                field708 = -1;
                field709 = -1;
            }
            if (class45.field382[13]) {
                method3081();
            }
        }
        if (class54.field469 == 4 && Statics.field98) {
            int var22 = class54.field475 * 30622073 - field793;
            field702 = var22 * 2;
            field793 = var22 == -1 || var22 == 1 ? class54.field475 * 30622073 : (field793 + class54.field475 * 30622073) / 2;
            int var23 = field703 - class54.field468;
            field906 = var23 * 2;
            field703 = var23 == -1 || var23 == 1 ? class54.field468 : (field703 + class54.field468) / 2;
        } else {
            if (class45.field382[96]) {
                field906 += (-24 - field906) / 2;
            } else if (class45.field382[97]) {
                field906 += (24 - field906) / 2;
            } else {
                field906 /= 2;
            }
            if (class45.field382[98]) {
                field702 += (12 - field702) / 2;
            } else if (class45.field382[99]) {
                field702 += (-12 - field702) / 2;
            } else {
                field702 /= 2;
            }
            field793 = class54.field475 * 30622073;
            field703 = class54.field468;
        }
        field700 = field906 / 2 + field700 & 0x7FF;
        field699 += field702 / 2;
        if (field699 < 128) {
            field699 = 128;
        }
        if (field699 > 383) {
            field699 = 383;
        }
    }

    @ObfuscatedName("k.fg(Lbw;II)V")
    public static final void method202(class70 arg0, int arg1) {
        if (arg0.field968 > field899) {
            method4442(arg0);
        } else if (arg0.field933 >= field899) {
            if (field899 == arg0.field933 || arg0.field954 == -1 || arg0.field969 != 0 || arg0.field956 + 1 > class279.method2783(arg0.field954).field3603[arg0.field955]) {
                int var2 = arg0.field933 - arg0.field968;
                int var3 = field899 - arg0.field968;
                int var4 = arg0.field964 * 128 + arg0.field950 * 64;
                int var5 = arg0.field950 * 64 + arg0.field943 * 128;
                int var6 = arg0.field965 * 128 + arg0.field950 * 64;
                int var7 = arg0.field967 * 128 + arg0.field950 * 64;
                arg0.field949 = ((var2 - var3) * var4 + var3 * var6) / var2;
                arg0.field922 = ((var2 - var3) * var5 + var3 * var7) / var2;
            }
            arg0.field925 = 0;
            arg0.field973 = arg0.field970;
            arg0.field923 = arg0.field973;
        } else {
            method1030(arg0);
        }
        if (arg0.field949 < 128 || arg0.field922 < 128 || arg0.field949 >= 13184 || arg0.field922 >= 13184) {
            arg0.field954 = -1;
            arg0.field959 = -1;
            arg0.field968 = 0;
            arg0.field933 = 0;
            arg0.field949 = arg0.field977[0] * 128 + arg0.field950 * 64;
            arg0.field922 = arg0.field982[0] * 128 + arg0.field950 * 64;
            arg0.method1574();
        }
        if (Statics.field218 == arg0 && (arg0.field949 < 1536 || arg0.field922 < 1536 || arg0.field949 >= 11776 || arg0.field922 >= 11776)) {
            arg0.field954 = -1;
            arg0.field959 = -1;
            arg0.field968 = 0;
            arg0.field933 = 0;
            arg0.field949 = arg0.field977[0] * 128 + arg0.field950 * 64;
            arg0.field922 = arg0.field982[0] * 128 + arg0.field950 * 64;
            arg0.method1574();
        }
        if (arg0.field975 != 0) {
            if (arg0.field930 != -1) {
                class70 var8 = null;
                if (arg0.field930 < 32768) {
                    var8 = field866[arg0.field930];
                } else if (arg0.field930 >= 32768) {
                    var8 = field746[arg0.field930 - 32768];
                }
                if (var8 != null) {
                    int var9 = arg0.field949 - var8.field949;
                    int var10 = arg0.field922 - var8.field922;
                    if (var9 != 0 || var10 != 0) {
                        arg0.field973 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field983) {
                    arg0.field930 = -1;
                    arg0.field983 = false;
                }
            }
            if (arg0.field932 != -1 && (arg0.field957 == 0 || arg0.field925 > 0)) {
                arg0.field973 = arg0.field932;
                arg0.field932 = -1;
            }
            int var11 = arg0.field973 - arg0.field923 & 0x7FF;
            if (var11 == 0 && arg0.field983) {
                arg0.field930 = -1;
                arg0.field983 = false;
            }
            if (var11 == 0) {
                arg0.field976 = 0;
            } else {
                arg0.field976++;
                if (var11 > 1024) {
                    arg0.field923 -= arg0.field975;
                    boolean var12 = true;
                    if (var11 < arg0.field975 || var11 > 2048 - arg0.field975) {
                        arg0.field923 = arg0.field973;
                        var12 = false;
                    }
                    if (arg0.field951 == arg0.field927 && (arg0.field976 > 25 || var12)) {
                        if (arg0.field928 == -1) {
                            arg0.field951 = arg0.field937;
                        } else {
                            arg0.field951 = arg0.field928;
                        }
                    }
                } else {
                    arg0.field923 += arg0.field975;
                    boolean var13 = true;
                    if (var11 < arg0.field975 || var11 > 2048 - arg0.field975) {
                        arg0.field923 = arg0.field973;
                        var13 = false;
                    }
                    if (arg0.field951 == arg0.field927 && (arg0.field976 > 25 || var13)) {
                        if (arg0.field962 == -1) {
                            arg0.field951 = arg0.field937;
                        } else {
                            arg0.field951 = arg0.field962;
                        }
                    }
                }
                arg0.field923 &= 0x7FF;
            }
        }
        method2287(arg0);
    }

    @ObfuscatedName("ia.fs(Lbw;I)V")
    public static final void method4442(class70 arg0) {
        int var1 = arg0.field968 - field899;
        int var2 = arg0.field964 * 128 + arg0.field950 * 64;
        int var3 = arg0.field950 * 64 + arg0.field943 * 128;
        arg0.field949 += (var2 - arg0.field949) / var1;
        arg0.field922 += (var3 - arg0.field922) / var1;
        arg0.field925 = 0;
        arg0.field973 = arg0.field970;
    }

    @ObfuscatedName("bv.gx(Lbw;I)V")
    public static final void method1030(class70 arg0) {
        arg0.field951 = arg0.field927;
        if (arg0.field957 == 0) {
            arg0.field925 = 0;
            return;
        }
        if (arg0.field954 != -1 && arg0.field969 == 0) {
            class279 var1 = class279.method2783(arg0.field954);
            if (arg0.field921 > 0 && var1.field3604 == 0) {
                arg0.field925++;
                return;
            }
            if (arg0.field921 <= 0 && var1.field3606 == 0) {
                arg0.field925++;
                return;
            }
        }
        int var2 = arg0.field949;
        int var3 = arg0.field922;
        int var4 = arg0.field977[arg0.field957 - 1] * 128 + arg0.field950 * 64;
        int var5 = arg0.field982[arg0.field957 - 1] * 128 + arg0.field950 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field973 = 1280;
            } else if (var3 > var5) {
                arg0.field973 = 1792;
            } else {
                arg0.field973 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field973 = 768;
            } else if (var3 > var5) {
                arg0.field973 = 256;
            } else {
                arg0.field973 = 512;
            }
        } else if (var3 < var5) {
            arg0.field973 = 1024;
        } else if (var3 > var5) {
            arg0.field973 = 0;
        }
        byte var6 = arg0.field979[arg0.field957 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field949 = var4;
            arg0.field922 = var5;
            arg0.field957--;
            if (arg0.field921 > 0) {
                arg0.field921--;
            }
            return;
        }
        int var7 = arg0.field973 - arg0.field923 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field931;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field937;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field980;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field948;
        }
        if (var8 == -1) {
            var8 = arg0.field937;
        }
        arg0.field951 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class79) {
            var10 = ((class79) arg0).field1086.field3583;
        }
        if (var10) {
            if (arg0.field973 != arg0.field923 && arg0.field930 == -1 && arg0.field975 != 0) {
                var9 = 2;
            }
            if (arg0.field957 > 2) {
                var9 = 6;
            }
            if (arg0.field957 > 3) {
                var9 = 8;
            }
            if (arg0.field925 > 0 && arg0.field957 > 1) {
                var9 = 8;
                arg0.field925--;
            }
        } else {
            if (arg0.field957 > 1) {
                var9 = 6;
            }
            if (arg0.field957 > 2) {
                var9 = 8;
            }
            if (arg0.field925 > 0 && arg0.field957 > 1) {
                var9 = 8;
                arg0.field925--;
            }
        }
        if (var6 == 2) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field951 == arg0.field937 && arg0.field934 != -1) {
            arg0.field951 = arg0.field934;
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field949 += var9;
                if (arg0.field949 > var4) {
                    arg0.field949 = var4;
                }
            } else if (var2 > var4) {
                arg0.field949 -= var9;
                if (arg0.field949 < var4) {
                    arg0.field949 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field922 += var9;
                if (arg0.field922 > var5) {
                    arg0.field922 = var5;
                }
            } else if (var3 > var5) {
                arg0.field922 -= var9;
                if (arg0.field922 < var5) {
                    arg0.field922 = var5;
                }
            }
        }
        if (arg0.field949 == var4 && arg0.field922 == var5) {
            arg0.field957--;
            if (arg0.field921 > 0) {
                arg0.field921--;
            }
        }
    }

    @ObfuscatedName("dl.ge(Lbw;I)V")
    public static final void method2287(class70 arg0) {
        arg0.field924 = false;
        if (arg0.field951 != -1) {
            class279 var1 = class279.method2783(arg0.field951);
            if (var1 == null || var1.field3612 == null) {
                arg0.field951 = -1;
            } else {
                arg0.field953++;
                if (arg0.field952 < var1.field3612.length && arg0.field953 > var1.field3603[arg0.field952]) {
                    arg0.field953 = 1;
                    arg0.field952++;
                    method267(var1, arg0.field952, arg0.field949, arg0.field922);
                }
                if (arg0.field952 >= var1.field3612.length) {
                    arg0.field953 = 0;
                    arg0.field952 = 0;
                    method267(var1, arg0.field952, arg0.field949, arg0.field922);
                }
            }
        }
        if (arg0.field959 != -1 && field899 >= arg0.field981) {
            if (arg0.field960 < 0) {
                arg0.field960 = 0;
            }
            int var2 = class264.method2268(arg0.field959).field3345;
            if (var2 == -1) {
                arg0.field959 = -1;
            } else {
                class279 var3 = class279.method2783(var2);
                if (var3 == null || var3.field3612 == null) {
                    arg0.field959 = -1;
                } else {
                    arg0.field961++;
                    if (arg0.field960 < var3.field3612.length && arg0.field961 > var3.field3603[arg0.field960]) {
                        arg0.field961 = 1;
                        arg0.field960++;
                        method267(var3, arg0.field960, arg0.field949, arg0.field922);
                    }
                    if (arg0.field960 >= var3.field3612.length && (arg0.field960 < 0 || arg0.field960 >= var3.field3612.length)) {
                        arg0.field959 = -1;
                    }
                }
            }
        }
        if (arg0.field954 != -1 && arg0.field969 <= 1) {
            class279 var4 = class279.method2783(arg0.field954);
            if (var4.field3604 == 1 && arg0.field921 > 0 && arg0.field968 <= field899 && arg0.field933 < field899) {
                arg0.field969 = 1;
                return;
            }
        }
        if (arg0.field954 != -1 && arg0.field969 == 0) {
            class279 var5 = class279.method2783(arg0.field954);
            if (var5 == null || var5.field3612 == null) {
                arg0.field954 = -1;
            } else {
                arg0.field956++;
                if (arg0.field955 < var5.field3612.length && arg0.field956 > var5.field3603[arg0.field955]) {
                    arg0.field956 = 1;
                    arg0.field955++;
                    method267(var5, arg0.field955, arg0.field949, arg0.field922);
                }
                if (arg0.field955 >= var5.field3612.length) {
                    arg0.field955 -= var5.field3607;
                    arg0.field958++;
                    if (arg0.field958 >= var5.field3613) {
                        arg0.field954 = -1;
                    } else if (arg0.field955 >= 0 && arg0.field955 < var5.field3612.length) {
                        method267(var5, arg0.field955, arg0.field949, arg0.field922);
                    } else {
                        arg0.field954 = -1;
                    }
                }
                arg0.field924 = var5.field3609;
            }
        }
        if (arg0.field969 > 0) {
            arg0.field969--;
        }
    }

    @ObfuscatedName("gb.gl(I)V")
    public static void method3787() {
        if (Statics.field533 != null) {
            Statics.field533.method5932(Statics.field66, (Statics.field218.field949 >> 7) + Statics.field512, (Statics.field218.field922 >> 7) + Statics.field318, false);
            Statics.field533.method5871();
        }
    }

    @ObfuscatedName("bj.gn(Lbs;IIB)V")
    public static void method1007(class67 arg0, int arg1, int arg2) {
        if (arg0.field954 == arg1 && arg1 != -1) {
            int var3 = class279.method2783(arg1).field3616;
            if (var3 == 1) {
                arg0.field955 = 0;
                arg0.field956 = 0;
                arg0.field969 = arg2;
                arg0.field958 = 0;
            }
            if (var3 == 2) {
                arg0.field958 = 0;
            }
        } else if (arg1 == -1 || arg0.field954 == -1 || class279.method2783(arg1).field3610 >= class279.method2783(arg0.field954).field3610) {
            arg0.field954 = arg1;
            arg0.field955 = 0;
            arg0.field956 = 0;
            arg0.field969 = arg2;
            arg0.field958 = 0;
            arg0.field921 = arg0.field957;
        }
    }

    @ObfuscatedName("w.gj(B)I")
    public static int method281() {
        return field844 ? 2 : 1;
    }

    @ObfuscatedName("v.gz(IB)V")
    public static void method156(int arg0) {
        field791 = 0L;
        if (arg0 >= 2) {
            field844 = true;
        } else {
            field844 = false;
        }
        if (method281() == 1) {
            Statics.field3685.method752(765, 503);
        } else {
            Statics.field3685.method752(7680, 2160);
        }
        if (field638 >= 25) {
            Statics.method3148();
        }
    }

    @ObfuscatedName("client.r(B)V")
    public final void method863() {
        field791 = class192.method81() + 500L;
        this.method1150();
        if (field790 != -1) {
            this.method1164(true);
        }
    }

    @ObfuscatedName("client.gc(B)V")
    public void method1150() {
        int var1 = Statics.field1878;
        int var2 = Statics.field442;
        if (this.field438 < var1) {
            int var3 = this.field438;
        }
        if (this.field439 < var2) {
            int var4 = this.field439;
        }
        if (Statics.field2667 == null) {
            return;
        }
        try {
            client var5 = Statics.field3685;
            Object[] var6 = new Object[] { method281() };
            JSObject.getWindow(var5).call("resize", var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("client.gv(B)V")
    public final void method1159() {
        if (field790 != -1) {
            Statics.method1055(field790);
        }
        for (int var1 = 0; var1 < field833; var1++) {
            if (field835[var1]) {
                field885[var1] = true;
            }
            field837[var1] = field835[var1];
            field835[var1] = false;
        }
        field834 = field899;
        field843 = -1;
        field780 = -1;
        Statics.field220 = null;
        if (field790 != -1) {
            field833 = 0;
            method707(field790, 0, 0, Statics.field1878, Statics.field442, 0, 0, -1);
        }
        class323.method5591();
        if (field735) {
            if (field733 == 1) {
                Statics.field404[field659 / 100].method5742(field731 - 8, field771 - 8);
            }
            if (field733 == 2) {
                Statics.field404[field659 / 100 + 4].method5742(field731 - 8, field771 - 8);
            }
        }
        if (field766) {
            int var7 = Statics.field1855;
            int var8 = Statics.field628;
            int var9 = Statics.field625;
            int var10 = Statics.field286;
            int var11 = 6116423;
            class323.method5630(var7, var8, var9, var10, var11);
            class323.method5630(var7 + 1, var8 + 1, var9 - 2, 16, 0);
            class323.method5604(var7 + 1, var8 + 18, var9 - 2, var10 - 19, 0);
            Statics.field1502.method5337(class245.field3025, var7 + 3, var8 + 14, var11, -1);
            int var12 = class54.field468;
            int var13 = class54.field475 * 30622073;
            for (int var14 = 0; var14 < field774; var14++) {
                int var15 = (field774 - 1 - var14) * 15 + var8 + 31;
                int var16 = 16777215;
                if (var12 > var7 && var12 < var7 + var9 && var13 > var15 - 13 && var13 < var15 + 3) {
                    var16 = 16776960;
                }
                class304 var17 = Statics.field1502;
                String var18;
                if (var14 < 0) {
                    var18 = "";
                } else if (field804[var14].length() > 0) {
                    var18 = field635[var14] + class245.field3032 + field804[var14];
                } else {
                    var18 = field635[var14];
                }
                var17.method5337(var18, var7 + 3, var15, var16, 0);
            }
            method3266(Statics.field1855, Statics.field628, Statics.field625, Statics.field286);
        } else if (field843 != -1) {
            int var2 = field843;
            int var3 = field780;
            if ((field774 >= 2 || field869 != 0 || field794) && field778) {
                int var4 = method4450();
                String var5;
                if (field869 == 1 && field774 < 2) {
                    var5 = class245.field2956 + class245.field3032 + field784 + " " + class81.field1104;
                } else if (field794 && field774 < 2) {
                    var5 = field788 + class245.field3032 + field694 + " " + class81.field1104;
                } else {
                    String var6;
                    if (var4 < 0) {
                        var6 = "";
                    } else if (field804[var4].length() > 0) {
                        var6 = field635[var4] + class245.field3032 + field804[var4];
                    } else {
                        var6 = field635[var4];
                    }
                    var5 = var6;
                }
                if (field774 > 2) {
                    var5 = var5 + class81.method268(16777215) + " " + '/' + " " + (field774 - 2) + class245.field3026;
                }
                Statics.field1502.method5349(var5, var2 + 4, var3 + 15, 16777215, 0, field899 / 1000);
            }
        }
        if (field842 == 3) {
            for (int var19 = 0; var19 < field833; var19++) {
                if (field837[var19]) {
                    class323.method5589(field838[var19], field839[var19], field840[var19], field841[var19], 16711935, 128);
                } else if (field885[var19]) {
                    class323.method5589(field838[var19], field839[var19], field840[var19], field841[var19], 16711680, 128);
                }
            }
        }
        int var20 = Statics.field66;
        int var21 = Statics.field218.field949;
        int var22 = Statics.field218.field922;
        int var23 = field691;
        for (class75 var24 = (class75) class75.field1034.method3986(); var24 != null; var24 = (class75) class75.field1034.method3988()) {
            if (var24.field1047 != -1 || var24.field1043 != null) {
                int var25 = 0;
                if (var21 > var24.field1036) {
                    var25 += var21 - var24.field1036;
                } else if (var21 < var24.field1044) {
                    var25 += var24.field1044 - var21;
                }
                if (var22 > var24.field1046) {
                    var25 += var22 - var24.field1046;
                } else if (var22 < var24.field1035) {
                    var25 += var24.field1035 - var22;
                }
                if (var25 - 64 > var24.field1038 || field867 == 0 || var24.field1033 != var20) {
                    if (var24.field1040 != null) {
                        Statics.field197.method2117(var24.field1040);
                        var24.field1040 = null;
                    }
                    if (var24.field1045 != null) {
                        Statics.field197.method2117(var24.field1045);
                        var24.field1045 = null;
                    }
                } else {
                    var25 -= 64;
                    if (var25 < 0) {
                        var25 = 0;
                    }
                    int var26 = field867 * (var24.field1038 - var25) / var24.field1038;
                    class99 var10000;
                    if (var24.field1040 != null) {
                        var24.field1040.method2390(var26);
                    } else if (var24.field1047 >= 0) {
                        var10000 = (class99) null;
                        class99 var27 = class99.method2161(Statics.field530, var24.field1047, 0);
                        if (var27 != null) {
                            class101 var28 = var27.method2158().method2199(Statics.field1394);
                            class111 var29 = class111.method2326(var28, 100, var26);
                            var29.method2378(-1);
                            Statics.field197.method2090(var29);
                            var24.field1040 = var29;
                        }
                    }
                    if (var24.field1045 != null) {
                        var24.field1045.method2390(var26);
                        if (!var24.field1045.method3974()) {
                            var24.field1045 = null;
                        }
                    } else if (var24.field1043 != null && (var24.field1037 -= var23) <= 0) {
                        int var30 = (int) (Math.random() * (double) var24.field1043.length);
                        var10000 = (class99) null;
                        class99 var31 = class99.method2161(Statics.field530, var24.field1043[var30], 0);
                        if (var31 != null) {
                            class101 var32 = var31.method2158().method2199(Statics.field1394);
                            class111 var33 = class111.method2326(var32, 100, var26);
                            var33.method2378(0);
                            Statics.field197.method2090(var33);
                            var24.field1045 = var33;
                            var24.field1037 = var24.field1032 + (int) (Math.random() * (double) (var24.field1042 - var24.field1032));
                        }
                    }
                }
            }
        }
        field691 = 0;
    }

    @ObfuscatedName("h.gk(Ljava/lang/String;ZI)V")
    public static final void method13(String arg0, boolean arg1) {
        if (!field745) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field2620.method5334(arg0, 250);
        int var6 = Statics.field2620.method5335(arg0, 250) * 13;
        class323.method5630(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class323.method5604(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field2620.method5341(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        int var7 = var3 - var2;
        int var8 = var4 - var2;
        int var9 = var2 + var5 + var2;
        int var10 = var2 + var6 + var2;
        for (int var11 = 0; var11 < field833; var11++) {
            if (field840[var11] + field838[var11] > var7 && field838[var11] < var7 + var9 && field841[var11] + field839[var11] > var8 && field839[var11] < var8 + var10) {
                field835[var11] = true;
            }
        }
        if (arg1) {
            Statics.field184.method738(0, 0);
            return;
        }
        int var12 = var3;
        int var13 = var4;
        int var14 = var5;
        int var15 = var6;
        for (int var16 = 0; var16 < field833; var16++) {
            if (field840[var16] + field838[var16] > var12 && field838[var16] < var12 + var14 && field841[var16] + field839[var16] > var13 && field839[var16] < var13 + var15) {
                field885[var16] = true;
            }
        }
    }

    @ObfuscatedName("bw.ga(IIIII)V")
    public static final void method1582(int arg0, int arg1, int arg2, int arg3) {
        field772++;
        method3400();
        method2867();
        if (field757 >= 0 && field746[field757] != null) {
            method361(field746[field757], false);
        }
        method700(true);
        method2014();
        method700(false);
        for (class86 var4 = (class86) field643.method3986(); var4 != null; var4 = (class86) field643.method3988()) {
            if (Statics.field66 != var4.field1175 || field899 > var4.field1181) {
                var4.method3973();
            } else if (field899 >= var4.field1180) {
                if (var4.field1184 > 0) {
                    class79 var5 = field866[var4.field1184 - 1];
                    if (var5 != null && var5.field949 >= 0 && var5.field949 < 13312 && var5.field922 >= 0 && var5.field922 < 13312) {
                        var4.method1923(var5.field949, var5.field922, method643(var5.field949, var5.field922, var4.field1175) - var4.field1189, field899);
                    }
                }
                if (var4.field1184 < 0) {
                    int var6 = -var4.field1184 - 1;
                    class67 var7;
                    if (field747 == var6) {
                        var7 = Statics.field218;
                    } else {
                        var7 = field746[var6];
                    }
                    if (var7 != null && var7.field949 >= 0 && var7.field949 < 13312 && var7.field922 >= 0 && var7.field922 < 13312) {
                        var4.method1923(var7.field949, var7.field922, method643(var7.field949, var7.field922, var4.field1175) - var4.field1189, field899);
                    }
                }
                var4.method1924(field691);
                Statics.field185.method2881(Statics.field66, (int) var4.field1186, (int) var4.field1187, (int) var4.field1188, 60, var4, var4.field1193, -1L, false);
            }
        }
        for (class77 var8 = (class77) field729.method3986(); var8 != null; var8 = (class77) field729.method3988()) {
            if (Statics.field66 != var8.field1073 || var8.field1076) {
                var8.method3973();
            } else if (field899 >= var8.field1068) {
                var8.method1818(field691);
                if (var8.field1076) {
                    var8.method3973();
                } else {
                    Statics.field185.method2881(var8.field1073, var8.field1070, var8.field1071, var8.field1074, 60, var8, 0, -1L, false);
                }
            }
        }
        Statics.method3138(arg0, arg1, arg2, arg3, true);
        int var9 = field888;
        int var10 = field887;
        int var11 = field890;
        int var12 = field742;
        class323.method5632(var9, var10, var9 + var11, var10 + var12);
        class130.method2785();
        if (!field874) {
            int var13 = field699;
            if (field716 / 256 > var13) {
                var13 = field716 / 256;
            }
            if (field875[4] && field877[4] + 128 > var13) {
                var13 = field877[4] + 128;
            }
            int var14 = field700 & 0x7FF;
            method3290(Statics.field1087, Statics.field172, Statics.field3751, var13, var14, method3067(var13), var12);
        }
        int var27;
        if (field874) {
            var27 = method2667();
        } else {
            int var15;
            if (Statics.field2667.field1013) {
                var15 = Statics.field66;
            } else {
                label541: {
                    int var16 = 3;
                    if (Statics.field3280 < 310) {
                        label533: {
                            int var17;
                            int var18;
                            if (field705 == 1) {
                                var17 = Statics.field1087 >> 7;
                                var18 = Statics.field3751 >> 7;
                            } else {
                                var17 = Statics.field218.field949 >> 7;
                                var18 = Statics.field218.field922 >> 7;
                            }
                            int var19 = Statics.field1118 >> 7;
                            int var20 = Statics.field653 >> 7;
                            if (var19 >= 0 && var20 >= 0 && var19 < 104 && var20 < 104) {
                                if (var17 >= 0 && var18 >= 0 && var17 < 104 && var18 < 104) {
                                    if ((class56.field492[Statics.field66][var19][var20] & 0x4) != 0) {
                                        var16 = Statics.field66;
                                    }
                                    int var21;
                                    if (var17 > var19) {
                                        var21 = var17 - var19;
                                    } else {
                                        var21 = var19 - var17;
                                    }
                                    int var22;
                                    if (var18 > var20) {
                                        var22 = var18 - var20;
                                    } else {
                                        var22 = var20 - var18;
                                    }
                                    if (var21 > var22) {
                                        int var23 = var22 * 65536 / var21;
                                        int var24 = 32768;
                                        while (true) {
                                            if (var17 == var19) {
                                                break label533;
                                            }
                                            if (var19 < var17) {
                                                var19++;
                                            } else if (var19 > var17) {
                                                var19--;
                                            }
                                            if ((class56.field492[Statics.field66][var19][var20] & 0x4) != 0) {
                                                var16 = Statics.field66;
                                            }
                                            var24 += var23;
                                            if (var24 >= 65536) {
                                                var24 -= 65536;
                                                if (var20 < var18) {
                                                    var20++;
                                                } else if (var20 > var18) {
                                                    var20--;
                                                }
                                                if ((class56.field492[Statics.field66][var19][var20] & 0x4) != 0) {
                                                    var16 = Statics.field66;
                                                }
                                            }
                                        }
                                    } else {
                                        if (var22 > 0) {
                                            int var25 = var21 * 65536 / var22;
                                            int var26 = 32768;
                                            while (var18 != var20) {
                                                if (var20 < var18) {
                                                    var20++;
                                                } else if (var20 > var18) {
                                                    var20--;
                                                }
                                                if ((class56.field492[Statics.field66][var19][var20] & 0x4) != 0) {
                                                    var16 = Statics.field66;
                                                }
                                                var26 += var25;
                                                if (var26 >= 65536) {
                                                    var26 -= 65536;
                                                    if (var19 < var17) {
                                                        var19++;
                                                    } else if (var19 > var17) {
                                                        var19--;
                                                    }
                                                    if ((class56.field492[Statics.field66][var19][var20] & 0x4) != 0) {
                                                        var16 = Statics.field66;
                                                    }
                                                }
                                            }
                                        }
                                        break label533;
                                    }
                                }
                                var15 = Statics.field66;
                                break label541;
                            }
                            var15 = Statics.field66;
                            break label541;
                        }
                    }
                    if (Statics.field218.field949 >= 0 && Statics.field218.field922 >= 0 && Statics.field218.field949 < 13312 && Statics.field218.field922 < 13312) {
                        if ((class56.field492[Statics.field66][Statics.field218.field949 >> 7][Statics.field218.field922 >> 7] & 0x4) != 0) {
                            var16 = Statics.field66;
                        }
                        var15 = var16;
                    } else {
                        var15 = Statics.field66;
                    }
                }
            }
            var27 = var15;
        }
        int var28 = Statics.field1118;
        int var29 = Statics.field2012;
        int var30 = Statics.field653;
        int var31 = Statics.field3280;
        int var32 = Statics.field407;
        for (int var33 = 0; var33 < 5; var33++) {
            if (field875[var33]) {
                int var34 = (int) (Math.random() * (double) (field876[var33] * 2 + 1) - (double) field876[var33] + Math.sin((double) field878[var33] / 100.0D * (double) field891[var33]) * (double) field877[var33]);
                if (var33 == 0) {
                    Statics.field1118 += var34;
                }
                if (var33 == 1) {
                    Statics.field2012 += var34;
                }
                if (var33 == 2) {
                    Statics.field653 += var34;
                }
                if (var33 == 3) {
                    Statics.field407 = Statics.field407 + var34 & 0x7FF;
                }
                if (var33 == 4) {
                    Statics.field3280 += var34;
                    if (Statics.field3280 < 128) {
                        Statics.field3280 = 128;
                    }
                    if (Statics.field3280 > 383) {
                        Statics.field3280 = 383;
                    }
                }
            }
        }
        int var35 = class54.field468;
        int var36 = class54.field475 * 30622073;
        if (class54.field460 != 0) {
            var35 = class54.field478;
            var36 = class54.field479;
        }
        if (var35 >= var9 && var35 < var9 + var11 && var36 >= var10 && var36 < var10 + var12) {
            int var37 = var35 - var9;
            int var38 = var36 - var10;
            class128.field1723 = var37;
            class128.field1719 = var38;
            class128.field1717 = true;
            class128.field1726 = 0;
            class128.field1720 = false;
        } else {
            class128.method3441();
        }
        Statics.method3425();
        class323.method5630(var9, var10, var11, var12, 0);
        Statics.method3425();
        int var39 = class130.field1750;
        class130.field1750 = field892;
        Statics.field185.method2911(Statics.field1118, Statics.field2012, Statics.field653, Statics.field3280, Statics.field407, var27);
        class130.field1750 = var39;
        Statics.method3425();
        Statics.field185.method3038();
        field717 = 0;
        boolean var40 = false;
        int var41 = -1;
        int var42 = -1;
        int var43 = class89.field1213;
        int[] var44 = class89.field1214;
        for (int var45 = 0; var45 < field660 + var43; var45++) {
            class70 var46;
            if (var45 < var43) {
                var46 = field746[var44[var45]];
                if (field757 == var44[var45]) {
                    var40 = true;
                    var41 = var45;
                    continue;
                }
                if (Statics.field218 == var46) {
                    var42 = var45;
                    continue;
                }
            } else {
                var46 = field866[field763[var45 - var43]];
            }
            method3341(var46, var45, var9, var10, var11, var12);
        }
        if (field749 && var42 != -1) {
            method3341(Statics.field218, var42, var9, var10, var11, var12);
        }
        if (var40) {
            method3341(field746[field757], var41, var9, var10, var11, var12);
        }
        for (int var47 = 0; var47 < field717; var47++) {
            int var48 = field719[var47];
            int var49 = field868[var47];
            int var50 = field722[var47];
            int var51 = field721[var47];
            boolean var52 = true;
            while (var52) {
                var52 = false;
                for (int var53 = 0; var53 < var47; var53++) {
                    if (var49 + 2 > field868[var53] - field721[var53] && var49 - var51 < field868[var53] + 2 && var48 - var50 < field722[var53] + field719[var53] && var48 + var50 > field719[var53] - field722[var53] && field868[var53] - field721[var53] < var49) {
                        var49 = field868[var53] - field721[var53];
                        var52 = true;
                    }
                }
            }
            field865 = field719[var47];
            field730 = field868[var47] = var49;
            String var54 = field726[var47];
            if (field732 == 0) {
                int var55 = 16776960;
                if (field658[var47] < 6) {
                    var55 = field845[field658[var47]];
                }
                if (field658[var47] == 6) {
                    var55 = field772 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field658[var47] == 7) {
                    var55 = field772 % 20 < 10 ? 255 : 65535;
                }
                if (field658[var47] == 8) {
                    var55 = field772 % 20 < 10 ? 45056 : 8454016;
                }
                if (field658[var47] == 9) {
                    int var56 = 150 - field725[var47];
                    if (var56 < 50) {
                        var55 = var56 * 1280 + 16711680;
                    } else if (var56 < 100) {
                        var55 = 16776960 - (var56 - 50) * 327680;
                    } else if (var56 < 150) {
                        var55 = (var56 - 100) * 5 + 65280;
                    }
                }
                if (field658[var47] == 10) {
                    int var57 = 150 - field725[var47];
                    if (var57 < 50) {
                        var55 = var57 * 5 + 16711680;
                    } else if (var57 < 100) {
                        var55 = 16711935 - (var57 - 50) * 327680;
                    } else if (var57 < 150) {
                        var55 = (var57 - 100) * 327680 + 255 - (var57 - 100) * 5;
                    }
                }
                if (field658[var47] == 11) {
                    int var58 = 150 - field725[var47];
                    if (var58 < 50) {
                        var55 = 16777215 - var58 * 327685;
                    } else if (var58 < 100) {
                        var55 = (var58 - 50) * 327685 + 65280;
                    } else if (var58 < 150) {
                        var55 = 16777215 - (var58 - 100) * 327680;
                    }
                }
                if (field724[var47] == 0) {
                    Statics.field1502.method5340(var54, field865 + var9, field730 + var10, var55, 0);
                }
                if (field724[var47] == 1) {
                    Statics.field1502.method5382(var54, field865 + var9, field730 + var10, var55, 0, field772);
                }
                if (field724[var47] == 2) {
                    Statics.field1502.method5343(var54, field865 + var9, field730 + var10, var55, 0, field772);
                }
                if (field724[var47] == 3) {
                    Statics.field1502.method5344(var54, field865 + var9, field730 + var10, var55, 0, field772, 150 - field725[var47]);
                }
                if (field724[var47] == 4) {
                    int var59 = (150 - field725[var47]) * (Statics.field1502.method5345(var54) + 100) / 150;
                    class323.method5593(field865 + var9 - 50, var10, field865 + var9 + 50, var10 + var12);
                    Statics.field1502.method5337(var54, field865 + var9 + 50 - var59, field730 + var10, var55, 0);
                    class323.method5632(var9, var10, var9 + var11, var10 + var12);
                }
                if (field724[var47] == 5) {
                    int var60 = 150 - field725[var47];
                    int var61 = 0;
                    if (var60 < 25) {
                        var61 = var60 - 25;
                    } else if (var60 > 125) {
                        var61 = var60 - 125;
                    }
                    class323.method5593(var9, field730 + var10 - Statics.field1502.field3758 - 1, var9 + var11, field730 + var10 + 5);
                    Statics.field1502.method5340(var54, field865 + var9, field730 + var10 + var61, var55, 0);
                    class323.method5632(var9, var10, var9 + var11, var10 + var12);
                }
            } else {
                Statics.field1502.method5340(var54, field865 + var9, field730 + var10, 16776960, 0);
            }
        }
        if (field649 == 2) {
            method1135((field825 - Statics.field512 << 7) + field803, (field720 - Statics.field318 << 7) + field656, field654 * 2);
            if (field865 > -1 && field899 % 20 < 10) {
                Statics.field2003[0].method5742(field865 + var9 - 12, field730 + var10 - 28);
            }
        }
        ((class119) Statics.field1765).method2553(field691);
        field744 = 0;
        int var62 = (Statics.field218.field949 >> 7) + Statics.field512;
        int var63 = (Statics.field218.field922 >> 7) + Statics.field318;
        if (var62 >= 3053 && var62 <= 3156 && var63 >= 3056 && var63 <= 3136) {
            field744 = 1;
        }
        if (var62 >= 3072 && var62 <= 3118 && var63 >= 9492 && var63 <= 9535) {
            field744 = 1;
        }
        if (field744 == 1 && var62 >= 3139 && var62 <= 3199 && var63 >= 3008 && var63 <= 3062) {
            field744 = 0;
        }
        Statics.field1118 = var28;
        Statics.field2012 = var29;
        Statics.field653 = var30;
        Statics.field3280 = var31;
        Statics.field407 = var32;
        if (field640) {
            byte var64 = 0;
            int var65 = class257.field3271 + class257.field3265 + var64;
            if (var65 == 0) {
                field640 = false;
            }
        }
        if (field640) {
            class323.method5630(var9, var10, var11, var12, 0);
            method13(class245.field2879, false);
        }
    }

    @ObfuscatedName("ff.gd(B)V")
    public static void method3400() {
        if (Statics.field218.field949 >> 7 == field828 && Statics.field218.field922 >> 7 == field861) {
            field828 = 0;
        }
    }

    @ObfuscatedName("ew.gi(I)V")
    public static void method2867() {
        if (field749) {
            method361(Statics.field218, false);
        }
    }

    @ObfuscatedName("cd.gh(I)V")
    public static void method2014() {
        int var0 = class89.field1213;
        int[] var1 = class89.field1214;
        for (int var2 = 0; var2 < var0; var2++) {
            if (field757 != var1[var2] && field747 != var1[var2]) {
                method361(field746[var1[var2]], true);
            }
        }
    }

    @ObfuscatedName("ai.gb(Lbs;ZI)V")
    public static void method361(class67 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method1105() || arg0.field607) {
            return;
        }
        arg0.field598 = false;
        if ((field826 && class89.field1213 > 50 || class89.field1213 > 200) && arg1 && arg0.field951 == arg0.field927) {
            arg0.field598 = true;
        }
        int var2 = arg0.field949 >> 7;
        int var3 = arg0.field922 >> 7;
        if (var2 < 0 || var2 >= 104 || var3 < 0 || var3 >= 104) {
            return;
        }
        long var4 = class128.method1570(0, 0, 0, false, arg0.field615);
        if (arg0.field606 != null && field899 >= arg0.field601 && field899 < arg0.field602) {
            arg0.field598 = false;
            arg0.field600 = method643(arg0.field949, arg0.field922, Statics.field66);
            arg0.field926 = field899;
            Statics.field185.method2882(Statics.field66, arg0.field949, arg0.field922, arg0.field600, 60, arg0, arg0.field923, var4, arg0.field613, arg0.field608, arg0.field609, arg0.field610);
            return;
        }
        if ((arg0.field949 & 0x7F) == 64 && (arg0.field922 & 0x7F) == 64) {
            if (field772 == field773[var2][var3]) {
                return;
            }
            field773[var2][var3] = field772;
        }
        arg0.field600 = method643(arg0.field949, arg0.field922, Statics.field66);
        arg0.field926 = field899;
        Statics.field185.method2881(Statics.field66, arg0.field949, arg0.field922, arg0.field600, 60, arg0, arg0.field923, var4, arg0.field924);
    }

    @ObfuscatedName("ax.gy(ZI)V")
    public static final void method700(boolean arg0) {
        for (int var1 = 0; var1 < field660; var1++) {
            class79 var2 = field866[field763[var1]];
            if (var2 != null && var2.method1105() && var2.field1086.field3567 == arg0 && var2.field1086.method4999()) {
                int var3 = var2.field949 >> 7;
                int var4 = var2.field922 >> 7;
                if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
                    if (var2.field950 == 1 && (var2.field949 & 0x7F) == 64 && (var2.field922 & 0x7F) == 64) {
                        if (field772 == field773[var3][var4]) {
                            continue;
                        }
                        field773[var3][var4] = field772;
                    }
                    long var5 = class128.method1570(0, 0, 1, !var2.field1086.field3582, field763[var1]);
                    var2.field926 = field899;
                    Statics.field185.method2881(Statics.field66, var2.field949, var2.field922, method643(var2.field949 + (var2.field950 * 64 - 64), var2.field922 + (var2.field950 * 64 - 64), Statics.field66), var2.field950 * 64 - 64 + 60, var2, var2.field923, var5, var2.field924);
                }
            }
        }
    }

    @ObfuscatedName("dm.gs(I)I")
    public static final int method2667() {
        if (Statics.field2667.field1013) {
            return Statics.field66;
        } else {
            int var0 = method643(Statics.field1118, Statics.field653, Statics.field66);
            return var0 - Statics.field2012 >= 800 || (class56.field492[Statics.field66][Statics.field1118 >> 7][Statics.field653 >> 7] & 0x4) == 0 ? 3 : Statics.field66;
        }
    }

    @ObfuscatedName("as.gt(B)Z")
    public static boolean method486() {
        return (field750 & 0x4) != 0;
    }

    @ObfuscatedName("hd.go(Lbs;I)Z")
    public static boolean method4102(class67 arg0) {
        if (field750 == 0) {
            return false;
        } else if (Statics.field218 == arg0) {
            return (field750 & 0x8) != 0;
        } else {
            boolean var1 = method486();
            if (!var1) {
                boolean var2 = (field750 & 0x1) != 0;
                var1 = var2 && arg0.method1094();
            }
            boolean var3 = var1;
            if (!var1) {
                boolean var4 = (field750 & 0x2) != 0;
                var3 = var4 && arg0.method1112();
            }
            return var3;
        }
    }

    @ObfuscatedName("fr.gw(Lbw;IIIIII)V")
    public static final void method3341(class70 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method1105()) {
            return;
        }
        if (arg0 instanceof class79) {
            class277 var6 = ((class79) arg0).field1086;
            if (var6.field3574 != null) {
                var6 = var6.method4976();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class89.field1213;
        int[] var8 = class89.field1214;
        byte var9 = 0;
        if (arg1 < var7 && field899 == arg0.field926 && method4102((class67) arg0)) {
            class67 var10 = (class67) arg0;
            if (arg1 < var7) {
                method1722(arg0, arg0.field972 + 15);
                class305 var11 = (class305) field681.get(class301.field3731);
                byte var12 = 9;
                var11.method5340(var10.field595.method5261(), field865 + arg2, field730 + arg3 - var12, 16777215, 0);
                var9 = 18;
            }
        }
        int var13 = -2;
        if (!arg0.field947.method3956()) {
            method1722(arg0, arg0.field972 + 15);
            for (class78 var14 = (class78) arg0.field947.method3953(); var14 != null; var14 = (class78) arg0.field947.method3955()) {
                class71 var15 = var14.method1826(field899);
                if (var15 != null) {
                    class267 var16 = var14.field1080;
                    class327 var17 = var16.method4742();
                    class327 var18 = var16.method4754();
                    int var19 = 0;
                    int var20;
                    if (var17 == null || var18 == null) {
                        var20 = var16.field3387;
                    } else {
                        if (var16.field3385 * 2 < var18.field3878) {
                            var19 = var16.field3385;
                        }
                        var20 = var18.field3878 - var19 * 2;
                    }
                    int var21 = 255;
                    boolean var22 = true;
                    int var23 = field899 - var15.field984;
                    int var24 = var15.field986 * var20 / var16.field3387;
                    int var27;
                    if (var15.field987 > var23) {
                        int var25 = var16.field3383 == 0 ? 0 : var23 / var16.field3383 * var16.field3383;
                        int var26 = var15.field985 * var20 / var16.field3387;
                        var27 = (var24 - var26) * var25 / var15.field987 + var26;
                    } else {
                        var27 = var24;
                        int var28 = var15.field987 + var16.field3384 - var23;
                        if (var16.field3386 >= 0) {
                            var21 = (var28 << 8) / (var16.field3384 - var16.field3386);
                        }
                    }
                    if (var15.field986 > 0 && var27 < 1) {
                        var27 = 1;
                    }
                    if (var17 == null || var18 == null) {
                        var13 += 5;
                        if (field865 > -1) {
                            int var34 = field865 + arg2 - (var20 >> 1);
                            int var35 = field730 + arg3 - var13;
                            class323.method5630(var34, var35, var27, 5, 65280);
                            class323.method5630(var27 + var34, var35, var20 - var27, 5, 16711680);
                        }
                        var13 += 2;
                    } else {
                        int var29;
                        if (var20 == var27) {
                            var29 = var19 * 2 + var27;
                        } else {
                            var29 = var19 + var27;
                        }
                        int var30 = var17.field3880;
                        var13 += var30;
                        int var31 = field865 + arg2 - (var20 >> 1);
                        int var32 = field730 + arg3 - var13;
                        int var33 = var31 - var19;
                        if (var21 >= 0 && var21 < 255) {
                            var17.method5704(var33, var32, var21);
                            class323.method5593(var33, var32, var29 + var33, var30 + var32);
                            var18.method5704(var33, var32, var21);
                        } else {
                            var17.method5742(var33, var32);
                            class323.method5593(var33, var32, var29 + var33, var30 + var32);
                            var18.method5742(var33, var32);
                        }
                        class323.method5632(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var13 += 2;
                    }
                } else if (var14.method1830()) {
                    var14.method3973();
                }
            }
        }
        if (var13 == -2) {
            var13 += 7;
        }
        int var36 = var9 + var13;
        if (arg1 < var7) {
            class67 var37 = (class67) arg0;
            if (var37.field607) {
                return;
            }
            if (var37.field594 != -1 || var37.field612 != -1) {
                method1722(arg0, arg0.field972 + 15);
                if (field865 > -1) {
                    if (var37.field594 != -1) {
                        var36 += 25;
                        Statics.field100[var37.field594].method5742(field865 + arg2 - 12, field730 + arg3 - var36);
                    }
                    if (var37.field612 != -1) {
                        var36 += 25;
                        Statics.field621[var37.field612].method5742(field865 + arg2 - 12, field730 + arg3 - var36);
                    }
                }
            }
            if (arg1 >= 0 && field649 == 10 && field651 == var8[arg1]) {
                method1722(arg0, arg0.field972 + 15);
                if (field865 > -1) {
                    int var38 = Statics.field2003[1].field3880 + var36;
                    Statics.field2003[1].method5742(field865 + arg2 - 12, field730 + arg3 - var38);
                }
            }
        } else {
            class277 var39 = ((class79) arg0).field1086;
            if (var39.field3574 != null) {
                var39 = var39.method4976();
            }
            if (var39.field3577 >= 0 && var39.field3577 < Statics.field621.length) {
                method1722(arg0, arg0.field972 + 15);
                if (field865 > -1) {
                    Statics.field621[var39.field3577].method5742(field865 + arg2 - 12, field730 + arg3 - 30);
                }
            }
            if (field649 == 1 && field650 == field763[arg1 - var7] && field899 % 20 < 10) {
                method1722(arg0, arg0.field972 + 15);
                if (field865 > -1) {
                    Statics.field2003[0].method5742(field865 + arg2 - 12, field730 + arg3 - 28);
                }
            }
        }
        if (arg0.field935 != null && (arg1 >= var7 || !arg0.field938 && (field846 == 4 || !arg0.field936 && (field846 == 0 || field846 == 3 || field846 == 1 && ((class67) arg0).method1094())))) {
            method1722(arg0, arg0.field972);
            if (field865 > -1 && field717 < field718) {
                field722[field717] = Statics.field1502.method5345(arg0.field935) / 2;
                field721[field717] = Statics.field1502.field3758;
                field719[field717] = field865;
                field868[field717] = field730;
                field658[field717] = arg0.field939;
                field724[field717] = arg0.field940;
                field725[field717] = arg0.field978;
                field726[field717] = arg0.field935;
                field717++;
            }
        }
        for (int var40 = 0; var40 < 4; var40++) {
            int var41 = arg0.field944[var40];
            int var42 = arg0.field942[var40];
            class273 var43 = null;
            int var44 = 0;
            if (var42 >= 0) {
                if (var41 <= field899) {
                    continue;
                }
                var43 = class273.method4290(arg0.field942[var40]);
                var44 = var43.field3426;
                if (var43 != null && var43.field3422 != null) {
                    var43 = var43.method4830();
                    if (var43 == null) {
                        arg0.field944[var40] = -1;
                        continue;
                    }
                }
            } else if (var41 < 0) {
                continue;
            }
            int var45 = arg0.field945[var40];
            class273 var46 = null;
            if (var45 >= 0) {
                var46 = class273.method4290(var45);
                if (var46 != null && var46.field3422 != null) {
                    var46 = var46.method4830();
                }
            }
            if (var41 - var44 <= field899) {
                if (var43 == null) {
                    arg0.field944[var40] = -1;
                } else {
                    method1722(arg0, arg0.field972 / 2);
                    if (field865 > -1) {
                        if (var40 == 1) {
                            field730 -= 20;
                        }
                        if (var40 == 2) {
                            field865 -= 15;
                            field730 -= 10;
                        }
                        if (var40 == 3) {
                            field865 += 15;
                            field730 -= 10;
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
                        class327 var59 = null;
                        class327 var60 = null;
                        class327 var61 = null;
                        class327 var62 = null;
                        int var63 = 0;
                        int var64 = 0;
                        int var65 = 0;
                        int var66 = 0;
                        int var67 = 0;
                        int var68 = 0;
                        int var69 = 0;
                        int var70 = 0;
                        int var71 = 0;
                        class327 var72 = var43.method4832();
                        if (var72 != null) {
                            var51 = var72.field3878;
                            int var73 = var72.field3880;
                            if (var73 > var71) {
                                var71 = var73;
                            }
                            var55 = var72.field3879;
                        }
                        class327 var74 = var43.method4848();
                        if (var74 != null) {
                            var52 = var74.field3878;
                            int var75 = var74.field3880;
                            if (var75 > var71) {
                                var71 = var75;
                            }
                            var56 = var74.field3879;
                        }
                        class327 var76 = var43.method4834();
                        if (var76 != null) {
                            var53 = var76.field3878;
                            int var77 = var76.field3880;
                            if (var77 > var71) {
                                var71 = var77;
                            }
                            var57 = var76.field3879;
                        }
                        class327 var78 = var43.method4835();
                        if (var78 != null) {
                            var54 = var78.field3878;
                            int var79 = var78.field3880;
                            if (var79 > var71) {
                                var71 = var79;
                            }
                            var58 = var78.field3879;
                        }
                        if (var46 != null) {
                            var59 = var46.method4832();
                            if (var59 != null) {
                                var63 = var59.field3878;
                                int var80 = var59.field3880;
                                if (var80 > var71) {
                                    var71 = var80;
                                }
                                var67 = var59.field3879;
                            }
                            var60 = var46.method4848();
                            if (var60 != null) {
                                var64 = var60.field3878;
                                int var81 = var60.field3880;
                                if (var81 > var71) {
                                    var71 = var81;
                                }
                                var68 = var60.field3879;
                            }
                            var61 = var46.method4834();
                            if (var61 != null) {
                                var65 = var61.field3878;
                                int var82 = var61.field3880;
                                if (var82 > var71) {
                                    var71 = var82;
                                }
                                var69 = var61.field3879;
                            }
                            var62 = var46.method4835();
                            if (var62 != null) {
                                var66 = var62.field3878;
                                int var83 = var62.field3880;
                                if (var83 > var71) {
                                    var71 = var83;
                                }
                                var70 = var62.field3879;
                            }
                        }
                        class304 var84 = var43.method4836();
                        if (var84 == null) {
                            var84 = Statics.field1785;
                        }
                        class304 var85;
                        if (var46 == null) {
                            var85 = Statics.field1785;
                        } else {
                            var85 = var46.method4836();
                            if (var85 == null) {
                                var85 = Statics.field1785;
                            }
                        }
                        Object var86 = null;
                        String var87 = null;
                        boolean var88 = false;
                        int var89 = 0;
                        String var90 = var43.method4831(arg0.field946[var40]);
                        int var91 = var84.method5345(var90);
                        if (var46 != null) {
                            var87 = var46.method4831(arg0.field963[var40]);
                            var89 = var85.method5345(var87);
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
                        int var108 = arg0.field944[var40] - field899;
                        int var109 = var43.field3431 - var43.field3431 * var108 / var43.field3426;
                        int var110 = var43.field3432 * var108 / var43.field3426 + -var43.field3432;
                        int var111 = field865 + arg2 - (var100 >> 1) + var109;
                        int var112 = field730 + arg3 - 12 + var110;
                        int var113 = var112;
                        int var114 = var71 + var112;
                        int var115 = var43.field3436 + var112 + 15;
                        int var116 = var115 - var84.field3760;
                        int var117 = var84.field3752 + var115;
                        if (var116 < var112) {
                            var113 = var116;
                        }
                        if (var117 > var114) {
                            var114 = var117;
                        }
                        int var118 = 0;
                        if (var46 != null) {
                            var118 = var46.field3436 + var112 + 15;
                            int var119 = var118 - var85.field3760;
                            int var120 = var85.field3752 + var118;
                            if (var119 < var113) {
                                ;
                            }
                            if (var120 > var114) {
                                ;
                            }
                        }
                        int var123 = 255;
                        if (var43.field3433 >= 0) {
                            var123 = (var108 << 8) / (var43.field3426 - var43.field3433);
                        }
                        if (var123 >= 0 && var123 < 255) {
                            if (var72 != null) {
                                var72.method5704(var95 + var111 - var55, var112, var123);
                            }
                            if (var76 != null) {
                                var76.method5704(var96 + var111 - var57, var112, var123);
                            }
                            if (var74 != null) {
                                for (int var124 = 0; var124 < var92; var124++) {
                                    var74.method5704(var52 * var124 + (var97 + var111 - var56), var112, var123);
                                }
                            }
                            if (var78 != null) {
                                var78.method5704(var101 + var111 - var58, var112, var123);
                            }
                            var84.method5338(var90, var98 + var111, var115, var43.field3425, 0, var123);
                            if (var46 != null) {
                                if (var59 != null) {
                                    var59.method5704(var102 + var111 - var67, var112, var123);
                                }
                                if (var61 != null) {
                                    var61.method5704(var103 + var111 - var69, var112, var123);
                                }
                                if (var60 != null) {
                                    for (int var125 = 0; var125 < var93; var125++) {
                                        var60.method5704(var64 * var125 + (var104 + var111 - var68), var112, var123);
                                    }
                                }
                                if (var62 != null) {
                                    var62.method5704(var105 + var111 - var70, var112, var123);
                                }
                                var85.method5338(var87, var106 + var111, var118, var46.field3425, 0, var123);
                            }
                        } else {
                            if (var72 != null) {
                                var72.method5742(var95 + var111 - var55, var112);
                            }
                            if (var76 != null) {
                                var76.method5742(var96 + var111 - var57, var112);
                            }
                            if (var74 != null) {
                                for (int var126 = 0; var126 < var92; var126++) {
                                    var74.method5742(var52 * var126 + (var97 + var111 - var56), var112);
                                }
                            }
                            if (var78 != null) {
                                var78.method5742(var101 + var111 - var58, var112);
                            }
                            var84.method5337(var90, var98 + var111, var115, var43.field3425 | 0xFF000000, 0);
                            if (var46 != null) {
                                if (var59 != null) {
                                    var59.method5742(var102 + var111 - var67, var112);
                                }
                                if (var61 != null) {
                                    var61.method5742(var103 + var111 - var69, var112);
                                }
                                if (var60 != null) {
                                    for (int var127 = 0; var127 < var93; var127++) {
                                        var60.method5742(var64 * var127 + (var104 + var111 - var68), var112);
                                    }
                                }
                                if (var62 != null) {
                                    var62.method5742(var105 + var111 - var70, var112);
                                }
                                var85.method5337(var87, var106 + var111, var118, var46.field3425 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bp.gf(Lbw;IB)V")
    public static final void method1722(class70 arg0, int arg1) {
        method1135(arg0.field949, arg0.field922, arg1);
    }

    @ObfuscatedName("bs.gq(IIII)V")
    public static final void method1135(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field865 = -1;
            field730 = -1;
            return;
        }
        int var3 = method643(arg0, arg1, Statics.field66) - arg2;
        int var4 = arg0 - Statics.field1118;
        int var5 = var3 - Statics.field2012;
        int var6 = arg1 - Statics.field653;
        int var7 = class130.field1768[Statics.field3280];
        int var8 = class130.field1769[Statics.field3280];
        int var9 = class130.field1768[Statics.field407];
        int var10 = class130.field1769[Statics.field407];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field865 = field892 * var11 / var15 + field890 / 2;
            field730 = field892 * var14 / var15 + field742 / 2;
        } else {
            field865 = -1;
            field730 = -1;
        }
    }

    @ObfuscatedName("ae.gu(IIII)I")
    public static final int method643(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class56.field492[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class56.field511[var5][var3][var4] + class56.field511[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class56.field511[var5][var3][var4 + 1] + class56.field511[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("aq.gg(III)I")
    public static int method568(int arg0, int arg1) {
        int var2 = arg1 - 334;
        if (var2 < 0) {
            var2 = 0;
        } else if (var2 > 100) {
            var2 = 100;
        }
        int var3 = (field727 - field779) * var2 / 100 + field779;
        return arg0 * var3 / 256;
    }

    @ObfuscatedName("fm.gp(IIIIIIII)V")
    public static final void method3290(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg6 - 334;
        if (var7 < 0) {
            var7 = 0;
        } else if (var7 > 100) {
            var7 = 100;
        }
        int var8 = (field727 - field779) * var7 / 100 + field779;
        int var9 = arg5 * var8 / 256;
        int var11 = 2048 - arg3 & 0x7FF;
        int var12 = 2048 - arg4 & 0x7FF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var9;
        if (var11 != 0) {
            int var16 = class130.field1768[var11];
            int var17 = class130.field1769[var11];
            int var18 = var14 * var17 - var9 * var16 >> 16;
            var15 = var14 * var16 + var9 * var17 >> 16;
            var14 = var18;
        }
        if (var12 != 0) {
            int var19 = class130.field1768[var12];
            int var20 = class130.field1769[var12];
            int var21 = var13 * var20 + var15 * var19 >> 16;
            var15 = var15 * var20 - var13 * var19 >> 16;
            var13 = var21;
        }
        Statics.field1118 = arg0 - var13;
        Statics.field2012 = arg1 - var14;
        Statics.field653 = arg2 - var15;
        Statics.field3280 = arg3;
        Statics.field407 = arg4;
        if (field705 != 1 || field821 < 2 || field899 % 50 != 0 || !(Statics.field1087 >> 7 != Statics.field218.field949 >> 7 || Statics.field3751 >> 7 != Statics.field218.field922 >> 7)) {
            return;
        }
        int var22 = Statics.field218.field614;
        int var23 = (Statics.field1087 >> 7) + Statics.field512;
        int var24 = (Statics.field3751 >> 7) + Statics.field318;
        class180 var25 = class180.method1090(class177.field2280, field886.field1271);
        var25.field2345.method3634(field712);
        var25.field2345.method3546(var24);
        var25.field2345.method3538(var22);
        var25.field2345.method3508(var23);
        field886.method2059(var25);
    }

    @ObfuscatedName("dm.hr(ZLgh;I)V")
    public static final void method2666(boolean arg0, class197 arg1) {
        field688 = arg0;
        if (!field688) {
            int var2 = arg1.method3662();
            int var3 = arg1.method3550();
            int var4 = arg1.method3513();
            Statics.field2007 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field2007[var5][var6] = arg1.method3562();
                }
            }
            Statics.field340 = new int[var4];
            Statics.field1976 = new int[var4];
            Statics.field591 = new int[var4];
            Statics.field292 = new byte[var4][];
            Statics.field1083 = new byte[var4][];
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
                        Statics.field340[var8] = var11;
                        Statics.field1976[var8] = Statics.field1740.method4472("m" + var9 + "_" + var10);
                        Statics.field591[var8] = Statics.field1740.method4472("l" + var9 + "_" + var10);
                        var8++;
                    }
                }
            }
            method182(var3, var2, true);
            return;
        }
        int var12 = arg1.method3550();
        int var13 = arg1.method3662();
        boolean var14 = arg1.method3511() == 1;
        int var15 = arg1.method3513();
        arg1.method3744();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = arg1.method3745(1);
                    if (var19 == 1) {
                        field689[var16][var17][var18] = arg1.method3745(26);
                    } else {
                        field689[var16][var17][var18] = -1;
                    }
                }
            }
        }
        arg1.method3746();
        Statics.field2007 = new int[var15][4];
        for (int var20 = 0; var20 < var15; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field2007[var20][var21] = arg1.method3562();
            }
        }
        Statics.field340 = new int[var15];
        Statics.field1976 = new int[var15];
        Statics.field591 = new int[var15];
        Statics.field292 = new byte[var15][];
        Statics.field1083 = new byte[var15][];
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
                            if (Statics.field340[var30] == var29) {
                                var29 = -1;
                                break;
                            }
                        }
                        if (var29 != -1) {
                            Statics.field340[var22] = var29;
                            int var31 = var29 >> 8 & 0xFF;
                            int var32 = var29 & 0xFF;
                            Statics.field1976[var22] = Statics.field1740.method4472("m" + var31 + "_" + var32);
                            Statics.field591[var22] = Statics.field1740.method4472("l" + var31 + "_" + var32);
                            var22++;
                        }
                    }
                }
            }
        }
        method182(var13, var12, !var14);
    }

    @ObfuscatedName("y.hx(IIZI)V")
    public static final void method182(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field341 == arg0 && Statics.field40 == arg1) {
            return;
        }
        Statics.field341 = arg0;
        Statics.field40 = arg1;
        method3117(25);
        method13(class245.field2879, true);
        int var3 = Statics.field512;
        int var4 = Statics.field318;
        Statics.field512 = (arg0 - 6) * 8;
        Statics.field318 = (arg1 - 6) * 8;
        int var5 = Statics.field512 - var3;
        int var6 = Statics.field318 - var4;
        int var7 = Statics.field512;
        int var8 = Statics.field318;
        for (int var9 = 0; var9 < 32768; var9++) {
            class79 var10 = field866[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field977[var11] -= var5;
                    var10.field982[var11] -= var6;
                }
                var10.field949 -= var5 * 128;
                var10.field922 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class67 var13 = field746[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field977[var14] -= var5;
                    var13.field982[var14] -= var6;
                }
                var13.field949 -= var5 * 128;
                var13.field922 -= var6 * 128;
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
                        field758[var25][var21][var22] = field758[var25][var23][var24];
                    } else {
                        field758[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class69 var26 = (class69) field759.method3986(); var26 != null; var26 = (class69) field759.method3988()) {
            var26.field910 -= var5;
            var26.field911 -= var6;
            if (var26.field910 < 0 || var26.field911 < 0 || var26.field910 >= 104 || var26.field911 >= 104) {
                var26.method3973();
            }
        }
        if (field828 != 0) {
            field828 -= var5;
            field861 -= var6;
        }
        field768 = 0;
        field874 = false;
        Statics.field1118 -= var5 << 7;
        Statics.field653 -= var6 << 7;
        Statics.field1087 -= var5 << 7;
        Statics.field3751 -= var6 << 7;
        field855 = -1;
        field729.method3980();
        field643.method3980();
        for (int var27 = 0; var27 < 4; var27++) {
            field641[var27].method3343();
        }
    }

    @ObfuscatedName("be.ht(ZI)V")
    public static final void method996(boolean arg0) {
        Statics.method3425();
        field886.field1272++;
        if (field886.field1272 < 50 && !arg0) {
            return;
        }
        field886.field1272 = 0;
        if (field678 || field886.method2061() == null) {
            return;
        }
        class180 var1 = class180.method1090(class177.field2241, field886.field1271);
        field886.method2059(var1);
        try {
            field886.method2063();
        } catch (IOException var3) {
            field678 = true;
        }
    }

    @ObfuscatedName("fr.hv(IIIIII)V")
    public static final void method3340(int arg0, int arg1, int arg2, int arg3, int arg4) {
        long var5 = Statics.field185.method2896(arg0, arg1, arg2);
        if (var5 != 0L) {
            int var7 = Statics.field185.method2900(arg0, arg1, arg2, var5);
            int var8 = var7 >> 6 & 0x3;
            int var9 = var7 & 0x1F;
            int var10 = arg3;
            boolean var11 = var5 != 0L && !class128.method107(var5);
            if (var11) {
                var10 = arg4;
            }
            int[] var12 = Statics.field988.field3883;
            int var13 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var14 = class128.method1149(var5);
            class274 var15 = class274.method4676(var14);
            if (var15.field3460 == -1) {
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
                class326 var16 = Statics.field2350[var15.field3460];
                if (var16 != null) {
                    int var17 = (var15.field3455 * 4 - var16.field3873) / 2;
                    int var18 = (var15.field3482 * 4 - var16.field3874) / 2;
                    var16.method5666(arg1 * 4 + 48 + var17, (104 - arg2 - var15.field3482) * 4 + 48 + var18);
                }
            }
        }
        long var19 = Statics.field185.method2958(arg0, arg1, arg2);
        if (var19 != 0L) {
            int var21 = Statics.field185.method2900(arg0, arg1, arg2, var19);
            int var22 = var21 >> 6 & 0x3;
            int var23 = var21 & 0x1F;
            int var24 = class128.method1149(var19);
            class274 var25 = class274.method4676(var24);
            if (var25.field3460 != -1) {
                class326 var26 = Statics.field2350[var25.field3460];
                if (var26 != null) {
                    int var27 = (var25.field3455 * 4 - var26.field3873) / 2;
                    int var28 = (var25.field3482 * 4 - var26.field3874) / 2;
                    var26.method5666(arg1 * 4 + 48 + var27, (104 - arg2 - var25.field3482) * 4 + 48 + var28);
                }
            } else if (var23 == 9) {
                int var29 = 15658734;
                boolean var30 = var19 != 0L && !class128.method107(var19);
                if (var30) {
                    var29 = 15597568;
                }
                int[] var31 = Statics.field988.field3883;
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
        long var33 = Statics.field185.method2899(arg0, arg1, arg2);
        if (var33 == 0L) {
            return;
        }
        int var35 = class128.method1149(var33);
        class274 var36 = class274.method4676(var35);
        if (var36.field3460 == -1) {
            return;
        }
        class326 var37 = Statics.field2350[var36.field3460];
        if (var37 != null) {
            int var38 = (var36.field3455 * 4 - var37.field3873) / 2;
            int var39 = (var36.field3482 * 4 - var37.field3874) / 2;
            var37.method5666(arg1 * 4 + 48 + var38, (104 - arg2 - var36.field3482) * 4 + 48 + var39);
        }
    }

    @ObfuscatedName("client.hl(Lcs;S)Z")
    public final boolean method1160(class95 arg0) {
        class165 var2 = arg0.method2061();
        class197 var3 = arg0.field1281;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1277 == null) {
                if (arg0.field1288) {
                    if (!var2.method3274(1)) {
                        return false;
                    }
                    var2.method3272(arg0.field1281.field2424, 0, 1);
                    arg0.field1280 = 0;
                    arg0.field1288 = false;
                }
                var3.field2423 = 0;
                if (var3.method3741()) {
                    if (!var2.method3274(1)) {
                        return false;
                    }
                    var2.method3272(arg0.field1281.field2424, 1, 1);
                    arg0.field1280 = 0;
                }
                arg0.field1288 = true;
                class176[] var4 = class176.method3127();
                int var5 = var3.method3742();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field2423);
                }
                arg0.field1277 = var4[var5];
                arg0.field1278 = arg0.field1277.field2212;
            }
            if (arg0.field1278 == -1) {
                if (!var2.method3274(1)) {
                    return false;
                }
                arg0.method2061().method3272(var3.field2424, 0, 1);
                arg0.field1278 = var3.field2424[0] & 0xFF;
            }
            if (arg0.field1278 == -2) {
                if (!var2.method3274(2)) {
                    return false;
                }
                arg0.method2061().method3272(var3.field2424, 0, 2);
                var3.field2423 = 0;
                arg0.field1278 = var3.method3513();
            }
            if (!var2.method3274(arg0.field1278)) {
                return false;
            }
            var3.field2423 = 0;
            var2.method3272(var3.field2424, 0, arg0.field1278);
            arg0.field1280 = 0;
            field680.method5080();
            arg0.field1284 = arg0.field1283;
            arg0.field1283 = arg0.field1282;
            arg0.field1282 = arg0.field1277;
            if (class176.field2183 == arg0.field1277) {
                method2666(false, arg0.field1281);
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2144 == arg0.field1277) {
                method3325(class179.field2336);
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2185 == arg0.field1277) {
                method3325(class179.field2335);
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2159 == arg0.field1277) {
                for (int var6 = 0; var6 < field746.length; var6++) {
                    if (field746[var6] != null) {
                        field746[var6].field954 = -1;
                    }
                }
                for (int var7 = 0; var7 < field866.length; var7++) {
                    if (field866[var7] != null) {
                        field866[var7].field954 = -1;
                    }
                }
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2148 == arg0.field1277) {
                int var8 = var3.method3558();
                int var9 = var3.method3550();
                if (var9 == 65535) {
                    var9 = -1;
                }
                int var10 = var3.method3560();
                int var11 = var3.method3513();
                if (var11 == 65535) {
                    var11 = -1;
                }
                for (int var12 = var11; var12 <= var9; var12++) {
                    long var13 = ((long) var10 << 32) + (long) var12;
                    class212 var15 = field832.method3934(var13);
                    if (var15 != null) {
                        var15.method3973();
                    }
                    field832.method3935(new class219(var8), var13);
                }
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2171 == arg0.field1277) {
                method7(true, var3);
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2198 == arg0.field1277) {
                int var16 = var3.method3662();
                int var17 = var3.method3662();
                int var18 = var3.method3662();
                int var19 = var3.method3560();
                class238 var20 = class238.method2289(var19);
                if (var20.field2730 != var16 || var20.field2725 != var18 || var20.field2727 != var17) {
                    var20.field2730 = var16;
                    var20.field2725 = var18;
                    var20.field2727 = var17;
                    method649(var20);
                }
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2191 == arg0.field1277) {
                String var21 = var3.method3520();
                long var22 = (long) var3.method3513();
                long var24 = (long) var3.method3515();
                class249 var26 = (class249) class185.method3726(class249.method4437(), var3.method3511());
                long var27 = (var22 << 32) + var24;
                boolean var29 = false;
                for (int var30 = 0; var30 < 100; var30++) {
                    if (field849[var30] == var27) {
                        var29 = true;
                        break;
                    }
                }
                if (Statics.field2434.method1694(new class297(var21, Statics.field346))) {
                    var29 = true;
                }
                if (!var29 && field744 == 0) {
                    field849[field850] = var27;
                    field850 = (field850 + 1) % 100;
                    String var31 = class305.method5400(class311.method3802(class306.method83(var3)));
                    byte var32;
                    if (var26.field3188) {
                        var32 = 7;
                    } else {
                        var32 = 3;
                    }
                    if (var26.field3193 == -1) {
                        class91.method1872(var32, var21, var31);
                    } else {
                        class91.method1872(var32, class81.method158(var26.field3193) + var21, var31);
                    }
                }
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2188 == arg0.field1277) {
                var3.field2423 += 28;
                if (var3.method3683()) {
                    method517(var3, var3.field2423 - 28);
                }
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2170 == arg0.field1277) {
                int var33 = arg0.field1278 + var3.field2423;
                int var34 = var3.method3513();
                int var35 = var3.method3513();
                if (field790 != var34) {
                    field790 = var34;
                    this.method1164(false);
                    method4719(field790);
                    class76.method733(field790);
                    for (int var36 = 0; var36 < 100; var36++) {
                        field835[var36] = true;
                    }
                }
                while (var35-- > 0) {
                    int var37 = var3.method3562();
                    int var38 = var3.method3513();
                    int var39 = var3.method3511();
                    class62 var40 = (class62) field693.method3934((long) var37);
                    if (var40 != null && var40.field554 != var38) {
                        method3347(var40, true);
                        var40 = null;
                    }
                    if (var40 == null) {
                        var40 = method227(var37, var38, var39);
                    }
                    var40.field553 = true;
                }
                for (class62 var41 = (class62) field693.method3937(); var41 != null; var41 = (class62) field693.method3941()) {
                    if (var41.field553) {
                        var41.field553 = false;
                    } else {
                        method3347(var41, true);
                    }
                }
                field832 = new class210(512);
                while (var3.field2423 < var33) {
                    int var42 = var3.method3562();
                    int var43 = var3.method3513();
                    int var44 = var3.method3513();
                    int var45 = var3.method3562();
                    for (int var46 = var43; var46 <= var44; var46++) {
                        long var47 = ((long) var42 << 32) + (long) var46;
                        field832.method3935(new class219(var45), var47);
                    }
                }
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2163 == arg0.field1277) {
                field648 = var3.method3513() * 30;
                field827 = field740;
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2158 == arg0.field1277) {
                boolean var49 = var3.method3511() == 1;
                if (var49) {
                    Statics.field1511 = class192.method81() - var3.method3517();
                    Statics.field898 = new class7(var3, true);
                } else {
                    Statics.field898 = null;
                }
                field752 = field740;
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2153 == arg0.field1277) {
                method922();
                int var50 = var3.method3558();
                int var51 = var3.method3621();
                int var52 = var3.method3511();
                field764[var51] = var50;
                field762[var51] = var52;
                field632[var51] = 1;
                for (int var53 = 0; var53 < 98; var53++) {
                    if (var50 >= class242.field2854[var53]) {
                        field632[var51] = var53 + 2;
                    }
                }
                field820[++field889 - 1 & 0x1F] = var51;
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2192 == arg0.field1277) {
                int var54 = var3.method3514();
                int var55 = var3.method3560();
                class238 var56 = class238.method2289(var55);
                if (var56.field2768 != var54 || var54 == -1) {
                    var56.field2768 = var54;
                    var56.field2760 = 0;
                    var56.field2778 = 0;
                    method649(var56);
                }
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2160 == arg0.field1277) {
                field862 = var3.method3511();
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2173 == arg0.field1277) {
                method3325(class179.field2332);
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2175 == arg0.field1277) {
                int var57 = var3.method3562();
                int var58 = var3.method3513();
                if (var57 < -70000) {
                    var58 += 32768;
                }
                class238 var59;
                if (var57 >= 0) {
                    var59 = class238.method2289(var57);
                } else {
                    var59 = null;
                }
                while (var3.field2423 < arg0.field1278) {
                    int var60 = var3.method3566();
                    int var61 = var3.method3513();
                    int var62 = 0;
                    if (var61 != 0) {
                        var62 = var3.method3511();
                        if (var62 == 255) {
                            var62 = var3.method3562();
                        }
                    }
                    if (var59 != null && var60 >= 0 && var60 < var59.field2798.length) {
                        var59.field2798[var60] = var61;
                        var59.field2799[var60] = var62;
                    }
                    class60.method3197(var58, var60, var61 - 1, var62);
                }
                if (var59 != null) {
                    method649(var59);
                }
                method922();
                field818[++field819 - 1 & 0x1F] = var58 & 0x7FFF;
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2146 == arg0.field1277) {
                method3325(class179.field2341);
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2132 == arg0.field1277) {
                method1932();
                arg0.field1277 = null;
                return false;
            }
            if (class176.field2215 == arg0.field1277) {
                int var63 = var3.method3511();
                int var64 = var3.method3511();
                int var65 = var3.method3511();
                int var66 = var3.method3511();
                field875[var63] = true;
                field876[var63] = var64;
                field877[var63] = var65;
                field878[var63] = var66;
                field891[var63] = 0;
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2138 == arg0.field1277) {
                int var67 = var3.method3559();
                class238 var68 = class238.method2289(var67);
                for (int var69 = 0; var69 < var68.field2798.length; var69++) {
                    var68.field2798[var69] = -1;
                    var68.field2798[var69] = 0;
                }
                method649(var68);
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2167 == arg0.field1277) {
                field649 = var3.method3511();
                if (field649 == 1) {
                    field650 = var3.method3513();
                }
                if (field649 >= 2 && field649 <= 6) {
                    if (field649 == 2) {
                        field803 = 64;
                        field656 = 64;
                    }
                    if (field649 == 3) {
                        field803 = 0;
                        field656 = 64;
                    }
                    if (field649 == 4) {
                        field803 = 128;
                        field656 = 64;
                    }
                    if (field649 == 5) {
                        field803 = 64;
                        field656 = 0;
                    }
                    if (field649 == 6) {
                        field803 = 64;
                        field656 = 128;
                    }
                    field649 = 2;
                    field825 = var3.method3513();
                    field720 = var3.method3513();
                    field654 = var3.method3511();
                }
                if (field649 == 10) {
                    field651 = var3.method3513();
                }
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2216 == arg0.field1277) {
                int var70 = var3.method3513();
                int var71 = var3.method3511();
                int var72 = var3.method3513();
                method2267(var70, var71, var72);
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2137 == arg0.field1277) {
                method3325(class179.field2339);
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2184 == arg0.field1277) {
                class322.method484(var3, arg0.field1278);
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2174 == arg0.field1277) {
                if (arg0.field1278 == 0) {
                    Statics.field481 = null;
                } else {
                    if (Statics.field481 == null) {
                        Statics.field481 = new class299(Statics.field346, Statics.field3685);
                    }
                    Statics.field481.method5284(var3);
                }
                method935();
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2190 == arg0.field1277) {
                for (int var73 = 0; var73 < Statics.field3302; var73++) {
                    class261 var74 = class261.method3318(var73);
                    if (var74 != null) {
                        class233.field2633[var73] = 0;
                        class233.field2632[var73] = 0;
                    }
                }
                method922();
                field817 += 32;
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2147 == arg0.field1277) {
                boolean var75 = var3.method3518();
                if (!var75) {
                    Statics.field1065 = null;
                } else if (Statics.field1065 == null) {
                    Statics.field1065 = new class258();
                }
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2166 == arg0.field1277) {
                int var76 = var3.method3662();
                int var77 = var3.method3560();
                class238 var78 = class238.method2289(var77);
                if (var78.field2795 != 2 || var78.field2717 != var76) {
                    var78.field2795 = 2;
                    var78.field2717 = var76;
                    method649(var78);
                }
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2180 == arg0.field1277) {
                method3325(class179.field2334);
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2204 == arg0.field1277) {
                for (int var79 = 0; var79 < class233.field2632.length; var79++) {
                    if (class233.field2633[var79] != class233.field2632[var79]) {
                        class233.field2632[var79] = class233.field2633[var79];
                        method2266(var79);
                        field816[++field817 - 1 & 0x1F] = var79;
                    }
                }
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2199 == arg0.field1277) {
                Statics.field421 = class313.method4746(var3.method3511());
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2214 == arg0.field1277) {
                field874 = true;
                Statics.field8 = var3.method3511();
                Statics.field1942 = var3.method3511();
                Statics.field59 = var3.method3513();
                Statics.field84 = var3.method3511();
                Statics.field3732 = var3.method3511();
                if (Statics.field3732 >= 100) {
                    int var80 = Statics.field8 * 128 + 64;
                    int var81 = Statics.field1942 * 128 + 64;
                    int var82 = method643(var80, var81, Statics.field66) - Statics.field59;
                    int var83 = var80 - Statics.field1118;
                    int var84 = var82 - Statics.field2012;
                    int var85 = var81 - Statics.field653;
                    int var86 = (int) Math.sqrt((double) (var83 * var83 + var85 * var85));
                    Statics.field3280 = (int) (Math.atan2((double) var84, (double) var86) * 325.949D) & 0x7FF;
                    Statics.field407 = (int) (Math.atan2((double) var83, (double) var85) * -325.949D) & 0x7FF;
                    if (Statics.field3280 < 128) {
                        Statics.field3280 = 128;
                    }
                    if (Statics.field3280 > 383) {
                        Statics.field3280 = 383;
                    }
                }
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2207 == arg0.field1277) {
                int var87 = var3.method3560();
                int var88 = var3.method3662();
                class238 var89 = class238.method2289(var87);
                if (var89 != null && var89.field2675 == 0) {
                    if (var88 > var89.field2735 - var89.field2807) {
                        var88 = var89.field2735 - var89.field2807;
                    }
                    if (var88 < 0) {
                        var88 = 0;
                    }
                    if (var89.field2695 != var88) {
                        var89.field2695 = var88;
                        method649(var89);
                    }
                }
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2210 == arg0.field1277) {
                class89.method4438(var3, arg0.field1278);
                method1048();
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2172 == arg0.field1277) {
                int var90 = var3.method3550();
                int var91 = var3.method3668();
                int var92 = var3.method3559();
                class238 var93 = class238.method2289(var92);
                var93.field2756 = (var91 << 16) + var90;
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2134 == arg0.field1277) {
                int var94 = var3.method3566();
                boolean var95 = var3.method3511() == 1;
                String var96 = "";
                boolean var97 = false;
                if (var95) {
                    var96 = var3.method3520();
                    if (Statics.field2434.method1694(new class297(var96, Statics.field346))) {
                        var97 = true;
                    }
                }
                String var98 = var3.method3520();
                if (!var97) {
                    class91.method1872(var94, var96, var98);
                }
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2195 == arg0.field1277) {
                Statics.field1008 = var3.method3621();
                Statics.field2066 = var3.method3542();
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2152 == arg0.field1277) {
                int var99 = var3.method3562();
                boolean var100 = var3.method3511() == 1;
                class238 var101 = class238.method2289(var99);
                if (var101.field2693 != var100) {
                    var101.field2693 = var100;
                    method649(var101);
                }
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2162 == arg0.field1277) {
                int var102 = var3.method3559();
                int var103 = var3.method3553();
                int var104 = var3.method3534();
                class238 var105 = class238.method2289(var102);
                if (var105.field2710 != var104 || var105.field2668 != var103 || var105.field2678 != 0 || var105.field2682 != 0) {
                    var105.field2710 = var104;
                    var105.field2668 = var103;
                    var105.field2678 = 0;
                    var105.field2682 = 0;
                    method649(var105);
                    this.method1165(var105);
                    if (var105.field2675 == 0) {
                        method5028(Statics.field2357[var102 >> 16], var105, false);
                    }
                }
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2213 == arg0.field1277) {
                int var106 = var3.method3562();
                int var107 = var3.method3562();
                class62 var108 = (class62) field693.method3934((long) var107);
                class62 var109 = (class62) field693.method3934((long) var106);
                if (var109 != null) {
                    method3347(var109, var108 == null || var108.field554 != var109.field554);
                }
                if (var108 != null) {
                    var108.method3973();
                    field693.method3935(var108, (long) var106);
                }
                class238 var110 = class238.method2289(var107);
                if (var110 != null) {
                    method649(var110);
                }
                class238 var111 = class238.method2289(var106);
                if (var111 != null) {
                    method649(var111);
                    method5028(Statics.field2357[var111.field2699 >>> 16], var111, true);
                }
                if (field790 != -1) {
                    method487(field790, 1);
                }
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2206 == arg0.field1277) {
                field874 = true;
                Statics.field25 = var3.method3511();
                Statics.field1208 = var3.method3511();
                Statics.field1525 = var3.method3513();
                Statics.field2618 = var3.method3511();
                Statics.field298 = var3.method3511();
                if (Statics.field298 >= 100) {
                    Statics.field1118 = Statics.field25 * 128 + 64;
                    Statics.field653 = Statics.field1208 * 128 + 64;
                    Statics.field2012 = method643(Statics.field1118, Statics.field653, Statics.field66) - Statics.field1525;
                }
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2208 == arg0.field1277) {
                String var112 = var3.method3520();
                String var113 = class305.method5400(class311.method3802(class306.method83(var3)));
                class91.method1872(6, var112, var113);
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2131 == arg0.field1277) {
                field828 = var3.method3511();
                if (field828 == 255) {
                    field828 = 0;
                }
                field861 = var3.method3511();
                if (field861 == 255) {
                    field861 = 0;
                }
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2202 == arg0.field1277) {
                method922();
                field798 = var3.method3514();
                field827 = field740;
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2189 == arg0.field1277) {
                Statics.field2434.method1648(var3, arg0.field1278);
                field642 = field740;
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2186 == arg0.field1277) {
                int var114 = var3.method3511();
                if (var3.method3511() == 0) {
                    field897[var114] = new class10();
                    var3.field2423 += 18;
                } else {
                    var3.field2423--;
                    field897[var114] = new class10(var3, false);
                }
                field863 = field740;
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2205 == arg0.field1277) {
                int var115 = var3.method3562();
                int var116 = var3.method3513();
                if (var115 < -70000) {
                    var116 += 32768;
                }
                class238 var117;
                if (var115 >= 0) {
                    var117 = class238.method2289(var115);
                } else {
                    var117 = null;
                }
                if (var117 != null) {
                    for (int var118 = 0; var118 < var117.field2798.length; var118++) {
                        var117.field2798[var118] = 0;
                        var117.field2799[var118] = 0;
                    }
                }
                class60.method4736(var116);
                int var119 = var3.method3513();
                for (int var120 = 0; var120 < var119; var120++) {
                    int var121 = var3.method3513();
                    int var122 = var3.method3511();
                    if (var122 == 255) {
                        var122 = var3.method3560();
                    }
                    if (var117 != null && var120 < var117.field2798.length) {
                        var117.field2798[var120] = var121;
                        var117.field2799[var120] = var122;
                    }
                    class60.method3197(var116, var120, var121 - 1, var122);
                }
                if (var117 != null) {
                    method649(var117);
                }
                method922();
                field818[++field819 - 1 & 0x1F] = var116 & 0x7FFF;
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2142 == arg0.field1277) {
                method3325(class179.field2330);
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2151 == arg0.field1277) {
                int var123 = var3.method3562();
                int var124 = var3.method3513();
                if (var124 == 65535) {
                    var124 = -1;
                }
                int var125 = var3.method3560();
                class238 var126 = class238.method2289(var123);
                if (var126.field2672) {
                    var126.field2800 = var124;
                    var126.field2801 = var125;
                    class275 var128 = class275.method4283(var124);
                    var126.field2730 = var128.field3505;
                    var126.field2725 = var128.field3506;
                    var126.field2726 = var128.field3507;
                    var126.field2722 = var128.field3525;
                    var126.field2723 = var128.field3494;
                    var126.field2727 = var128.field3504;
                    if (var128.field3510 == 1) {
                        var126.field2724 = 1;
                    } else {
                        var126.field2724 = 2;
                    }
                    if (var126.field2728 > 0) {
                        var126.field2727 = var126.field2727 * 32 / var126.field2728;
                    } else if (var126.field2789 > 0) {
                        var126.field2727 = var126.field2727 * 32 / var126.field2789;
                    }
                    method649(var126);
                } else if (var124 == -1) {
                    var126.field2795 = 0;
                    arg0.field1277 = null;
                    return true;
                } else {
                    class275 var127 = class275.method4283(var124);
                    var126.field2795 = 4;
                    var126.field2717 = var124;
                    var126.field2730 = var127.field3505;
                    var126.field2725 = var127.field3506;
                    var126.field2727 = var127.field3504 * 100 / var125;
                    method649(var126);
                }
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2203 == arg0.field1277) {
                int var129 = var3.method3562();
                String var130 = var3.method3520();
                class238 var131 = class238.method2289(var129);
                if (!var130.equals(var131.field2734)) {
                    var131.field2734 = var130;
                    method649(var131);
                }
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2211 == arg0.field1277) {
                field847 = var3.method3621();
                field846 = var3.method3621();
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2161 == arg0.field1277) {
                int var132 = var3.method3560();
                int var133 = var3.method3662();
                class238 var134 = class238.method2289(var132);
                if (var134.field2795 != 1 || var134.field2717 != var133) {
                    var134.field2795 = 1;
                    var134.field2717 = var133;
                    method649(var134);
                }
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2145 == arg0.field1277) {
                String var135 = var3.method3520();
                long var136 = var3.method3517();
                long var138 = (long) var3.method3513();
                long var140 = (long) var3.method3515();
                class249 var142 = (class249) class185.method3726(class249.method4437(), var3.method3511());
                long var143 = (var138 << 32) + var140;
                boolean var145 = false;
                for (int var146 = 0; var146 < 100; var146++) {
                    if (field849[var146] == var143) {
                        var145 = true;
                        break;
                    }
                }
                if (var142.field3186 && Statics.field2434.method1694(new class297(var135, Statics.field346))) {
                    var145 = true;
                }
                if (!var145 && field744 == 0) {
                    field849[field850] = var143;
                    field850 = (field850 + 1) % 100;
                    String var147 = class305.method5400(class311.method3802(class306.method83(var3)));
                    if (var142.field3193 == -1) {
                        class91.method495(9, var135, var147, class309.method4436(var136));
                    } else {
                        class91.method495(9, class81.method158(var142.field3193) + var135, var147, class309.method4436(var136));
                    }
                }
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2133 == arg0.field1277) {
                field874 = false;
                for (int var148 = 0; var148 < 5; var148++) {
                    field875[var148] = false;
                }
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2141 == arg0.field1277) {
                method7(false, var3);
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2156 == arg0.field1277) {
                Statics.field2066 = var3.method3621();
                Statics.field1008 = var3.method3511();
                for (int var149 = Statics.field1008; var149 < Statics.field1008 + 8; var149++) {
                    for (int var150 = Statics.field2066; var150 < Statics.field2066 + 8; var150++) {
                        if (field758[Statics.field66][var149][var150] != null) {
                            field758[Statics.field66][var149][var150] = null;
                            method483(var149, var150);
                        }
                    }
                }
                for (class69 var151 = (class69) field759.method3986(); var151 != null; var151 = (class69) field759.method3988()) {
                    if (var151.field910 >= Statics.field1008 && var151.field910 < Statics.field1008 + 8 && var151.field911 >= Statics.field2066 && var151.field911 < Statics.field2066 + 8 && Statics.field66 == var151.field908) {
                        var151.field919 = 0;
                    }
                }
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2201 == arg0.field1277) {
                int var152 = var3.method3559();
                int var153 = var3.method3550();
                int var154 = var153 >> 10 & 0x1F;
                int var155 = var153 >> 5 & 0x1F;
                int var156 = var153 & 0x1F;
                int var157 = (var156 << 3) + (var154 << 19) + (var155 << 11);
                class238 var158 = class238.method2289(var152);
                if (var158.field2698 != var157) {
                    var158.field2698 = var157;
                    method649(var158);
                }
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2135 == arg0.field1277) {
                Statics.field2434.method1660();
                field642 = field740;
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2187 == arg0.field1277) {
                method922();
                field760 = var3.method3511();
                field827 = field740;
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2209 == arg0.field1277) {
                Statics.field2066 = var3.method3542();
                Statics.field1008 = var3.method3621();
                while (var3.field2423 < arg0.field1278) {
                    int var159 = var3.method3511();
                    class179 var160 = class179.method3183()[var159];
                    method3325(var160);
                }
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2168 == arg0.field1277) {
                method33(var3.method3520());
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2140 == arg0.field1277) {
                int var161 = var3.method3562();
                class62 var162 = (class62) field693.method3934((long) var161);
                if (var162 != null) {
                    method3347(var162, true);
                }
                if (field655 != null) {
                    method649(field655);
                    field655 = null;
                }
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2139 == arg0.field1277) {
                String var163 = var3.method3520();
                Object[] var164 = new Object[var163.length() + 1];
                for (int var165 = var163.length() - 1; var165 >= 0; var165--) {
                    if (var163.charAt(var165) == 's') {
                        var164[var165 + 1] = var3.method3520();
                    } else {
                        var164[var165 + 1] = Integer.valueOf(var3.method3562());
                    }
                }
                var164[0] = Integer.valueOf(var3.method3562());
                class63 var166 = new class63();
                var166.field560 = var164;
                class76.method990(var166);
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2155 == arg0.field1277) {
                class72 var167 = new class72();
                var167.field993 = var3.method3520();
                var167.field1001 = var3.method3513();
                int var168 = var3.method3562();
                var167.field1002 = var168;
                method3117(45);
                var2.method3287();
                Object var169 = null;
                class85.method5530(var167);
                arg0.field1277 = null;
                return false;
            }
            if (class176.field2169 == arg0.field1277) {
                int var170 = var3.method3513();
                int var171 = var3.method3562();
                class233.field2633[var170] = var171;
                if (class233.field2632[var170] != var171) {
                    class233.field2632[var170] = var171;
                }
                method2266(var170);
                field816[++field817 - 1 & 0x1F] = var170;
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2177 == arg0.field1277) {
                int var172 = var3.method3668();
                class60.method3382(var172);
                field818[++field819 - 1 & 0x1F] = var172 & 0x7FFF;
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2164 == arg0.field1277) {
                method3325(class179.field2337);
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2181 == arg0.field1277) {
                int var173 = var3.method3662();
                field790 = var173;
                this.method1164(false);
                method4719(var173);
                class76.method733(field790);
                for (int var174 = 0; var174 < 100; var174++) {
                    field835[var174] = true;
                }
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2217 == arg0.field1277) {
                if (field790 != -1) {
                    method487(field790, 0);
                }
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2197 == arg0.field1277) {
                int var175 = var3.method3540();
                int var176 = var3.method3540();
                String var177 = var3.method3520();
                if (var176 >= 1 && var176 <= 8) {
                    if (var177.equalsIgnoreCase(class245.field2894)) {
                        var177 = null;
                    }
                    field754[var176 - 1] = var177;
                    field755[var176 - 1] = var175 == 0;
                }
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2178 == arg0.field1277) {
                int var178 = var3.method3560();
                class238 var179 = class238.method2289(var178);
                var179.field2795 = 3;
                var179.field2717 = Statics.field218.field593.method4358();
                method649(var179);
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2200 == arg0.field1277) {
                int var180 = var3.method3562();
                int var181 = var3.method3562();
                int var182 = Statics.method3323();
                class180 var183 = class180.method1090(class177.field2230, field886.field1271);
                var183.field2345.method3538(var182);
                var183.field2345.method3646(field434);
                var183.field2345.method3634(var180);
                var183.field2345.method3672(var181);
                field886.method2059(var183);
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2157 == arg0.field1277) {
                method3325(class179.field2338);
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2136 == arg0.field1277) {
                int var184 = var3.method3562();
                if (field712 != var184) {
                    field712 = var184;
                    method485();
                }
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2182 == arg0.field1277) {
                method2666(true, arg0.field1281);
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2179 == arg0.field1277) {
                Statics.field2434.field1026.method5157(var3, arg0.field1278);
                method5304();
                field642 = field740;
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2154 == arg0.field1277) {
                int var185 = var3.method3662();
                if (var185 == 65535) {
                    var185 = -1;
                }
                method152(var185);
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2196 == arg0.field1277) {
                int var186 = var3.method3554();
                int var187 = var3.method3550();
                if (var187 == 65535) {
                    var187 = -1;
                }
                method3267(var187, var186);
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2150 == arg0.field1277) {
                int var188 = var3.method3540();
                int var189 = var3.method3559();
                int var190 = var3.method3662();
                class62 var191 = (class62) field693.method3934((long) var189);
                if (var191 != null) {
                    method3347(var191, var191.field554 != var190);
                }
                method227(var189, var190, var188);
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2165 == arg0.field1277) {
                int var192 = var3.method3511();
                method492(var192);
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2149 == arg0.field1277) {
                byte[] var193 = new byte[arg0.field1278];
                var3.method3743(var193, 0, var193.length);
                class190 var194 = new class190(var193);
                String var195 = var194.method3520();
                class51.method119(var195, true, false);
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2143 == arg0.field1277) {
                method3325(class179.field2333);
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2194 == arg0.field1277) {
                byte var196 = var3.method3543();
                int var197 = var3.method3550();
                class233.field2633[var197] = var196;
                if (class233.field2632[var197] != var196) {
                    class233.field2632[var197] = var196;
                }
                method2266(var197);
                field816[++field817 - 1 & 0x1F] = var197;
                arg0.field1277 = null;
                return true;
            }
            if (class176.field2176 == arg0.field1277) {
                if (Statics.field481 != null) {
                    Statics.field481.method5285(var3);
                }
                method935();
                arg0.field1277 = null;
                return true;
            }
            class160.method943("" + (arg0.field1277 == null ? -1 : arg0.field1277.field2193) + class81.field1109 + (arg0.field1283 == null ? -1 : arg0.field1283.field2193) + class81.field1109 + (arg0.field1284 == null ? -1 : arg0.field1284.field2193) + class81.field1109 + arg0.field1278, (Throwable) null);
            method1932();
        } catch (IOException var202) {
            Statics.method669();
        } catch (Exception var203) {
            String var200 = "" + (arg0.field1277 == null ? -1 : arg0.field1277.field2193) + class81.field1109 + (arg0.field1283 == null ? -1 : arg0.field1283.field2193) + class81.field1109 + (arg0.field1284 == null ? -1 : arg0.field1284.field2193) + class81.field1109 + arg0.field1278 + class81.field1109 + (Statics.field512 + Statics.field218.field977[0]) + class81.field1109 + (Statics.field318 + Statics.field218.field982[0]) + class81.field1109;
            for (int var201 = 0; var201 < arg0.field1278 && var201 < 50; var201++) {
                var200 = var200 + var3.field2424[var201] + class81.field1109;
            }
            class160.method943(var200, var203);
            method1932();
        }
        return true;
    }

    @ObfuscatedName("fr.hp(Lfh;B)V")
    public static final void method3325(class179 arg0) {
        class197 var1 = field886.field1281;
        if (class179.field2338 == arg0) {
            int var2 = var1.method3550();
            int var3 = var1.method3662();
            int var4 = var1.method3540();
            int var5 = (var4 >> 4 & 0x7) + Statics.field1008;
            int var6 = (var4 & 0x7) + Statics.field2066;
            if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                class87 var7 = new class87();
                var7.field1202 = var3;
                var7.field1201 = var2;
                if (field758[Statics.field66][var5][var6] == null) {
                    field758[Statics.field66][var5][var6] = new class213();
                }
                field758[Statics.field66][var5][var6].method3981(var7);
                method483(var5, var6);
            }
        } else if (class179.field2334 == arg0) {
            int var8 = var1.method3542();
            int var9 = var8 >> 2;
            int var10 = var8 & 0x3;
            int var11 = field690[var9];
            int var12 = var1.method3621();
            int var13 = (var12 >> 4 & 0x7) + Statics.field1008;
            int var14 = (var12 & 0x7) + Statics.field2066;
            int var15 = var1.method3513();
            if (var13 >= 0 && var14 >= 0 && var13 < 103 && var14 < 103) {
                if (var11 == 0) {
                    class136 var16 = Statics.field185.method2892(Statics.field66, var13, var14);
                    if (var16 != null) {
                        int var17 = class128.method1149(var16.field1862);
                        if (var9 == 2) {
                            var16.field1867 = new class93(var17, 2, var10 + 4, Statics.field66, var13, var14, var15, false, var16.field1867);
                            var16.field1868 = new class93(var17, 2, var10 + 1 & 0x3, Statics.field66, var13, var14, var15, false, var16.field1868);
                        } else {
                            var16.field1867 = new class93(var17, var9, var10, Statics.field66, var13, var14, var15, false, var16.field1867);
                        }
                    }
                }
                if (var11 == 1) {
                    class141 var18 = Statics.field185.method2893(Statics.field66, var13, var14);
                    if (var18 != null) {
                        int var19 = class128.method1149(var18.field1911);
                        if (var9 == 4 || var9 == 5) {
                            var18.field1910 = new class93(var19, 4, var10, Statics.field66, var13, var14, var15, false, var18.field1910);
                        } else if (var9 == 6) {
                            var18.field1910 = new class93(var19, 4, var10 + 4, Statics.field66, var13, var14, var15, false, var18.field1910);
                        } else if (var9 == 7) {
                            var18.field1910 = new class93(var19, 4, (var10 + 2 & 0x3) + 4, Statics.field66, var13, var14, var15, false, var18.field1910);
                        } else if (var9 == 8) {
                            var18.field1910 = new class93(var19, 4, var10 + 4, Statics.field66, var13, var14, var15, false, var18.field1910);
                            var18.field1909 = new class93(var19, 4, (var10 + 2 & 0x3) + 4, Statics.field66, var13, var14, var15, false, var18.field1909);
                        }
                    }
                }
                if (var11 == 2) {
                    class142 var20 = Statics.field185.method2987(Statics.field66, var13, var14);
                    if (var9 == 11) {
                        var9 = 10;
                    }
                    if (var20 != null) {
                        var20.field1915 = new class93(class128.method1149(var20.field1927), var9, var10, Statics.field66, var13, var14, var15, false, var20.field1915);
                    }
                }
                if (var11 == 3) {
                    class123 var21 = Statics.field185.method2940(Statics.field66, var13, var14);
                    if (var21 != null) {
                        var21.field1590 = new class93(class128.method1149(var21.field1594), 22, var10, Statics.field66, var13, var14, var15, false, var21.field1590);
                    }
                }
            }
        } else if (class179.field2335 == arg0) {
            int var22 = var1.method3513();
            int var23 = var1.method3540();
            int var24 = var1.method3550();
            int var25 = var1.method3511();
            int var26 = (var25 >> 4 & 0x7) + Statics.field1008;
            int var27 = (var25 & 0x7) + Statics.field2066;
            if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104) {
                int var28 = var26 * 128 + 64;
                int var29 = var27 * 128 + 64;
                class77 var30 = new class77(var22, Statics.field66, var28, var29, method643(var28, var29, Statics.field66) - var23, var24, field899);
                field729.method3981(var30);
            }
        } else if (class179.field2339 == arg0) {
            int var31 = var1.method3540();
            int var32 = (var31 >> 4 & 0x7) + Statics.field1008;
            int var33 = (var31 & 0x7) + Statics.field2066;
            int var34 = var1.method3542();
            int var35 = var34 >> 2;
            int var36 = var34 & 0x3;
            int var37 = field690[var35];
            int var38 = var1.method3550();
            if (var32 >= 0 && var33 >= 0 && var32 < 104 && var33 < 104) {
                method5458(Statics.field66, var32, var33, var37, var38, var35, var36, 0, -1);
            }
        } else if (class179.field2336 == arg0) {
            int var39 = var1.method3542();
            int var40 = var39 >> 2;
            int var41 = var39 & 0x3;
            int var42 = field690[var40];
            int var43 = var1.method3542();
            int var44 = (var43 >> 4 & 0x7) + Statics.field1008;
            int var45 = (var43 & 0x7) + Statics.field2066;
            if (var44 >= 0 && var45 >= 0 && var44 < 104 && var45 < 104) {
                method5458(Statics.field66, var44, var45, var42, -1, var40, var41, 0, -1);
            }
        } else {
            if (class179.field2332 == arg0) {
                byte var46 = var1.method3544();
                int var47 = var1.method3662();
                byte var48 = var1.method3544();
                int var49 = var1.method3550();
                int var50 = var1.method3513();
                int var51 = var1.method3540();
                int var52 = var51 >> 2;
                int var53 = var51 & 0x3;
                int var54 = field690[var52];
                byte var55 = var1.method3543();
                int var56 = var1.method3668();
                byte var57 = var1.method3544();
                int var58 = var1.method3621();
                int var59 = (var58 >> 4 & 0x7) + Statics.field1008;
                int var60 = (var58 & 0x7) + Statics.field2066;
                class67 var61;
                if (field747 == var56) {
                    var61 = Statics.field218;
                } else {
                    var61 = field746[var56];
                }
                if (var61 != null) {
                    class274 var62 = class274.method4676(var49);
                    int var63;
                    int var64;
                    if (var53 == 1 || var53 == 3) {
                        var63 = var62.field3482;
                        var64 = var62.field3455;
                    } else {
                        var63 = var62.field3455;
                        var64 = var62.field3482;
                    }
                    int var65 = (var63 >> 1) + var59;
                    int var66 = (var63 + 1 >> 1) + var59;
                    int var67 = (var64 >> 1) + var60;
                    int var68 = (var64 + 1 >> 1) + var60;
                    int[][] var69 = class56.field511[Statics.field66];
                    int var70 = var69[var65][var67] + var69[var66][var67] + var69[var65][var68] + var69[var66][var68] >> 2;
                    int var71 = (var59 << 7) + (var63 << 6);
                    int var72 = (var60 << 7) + (var64 << 6);
                    class127 var73 = var62.method4866(var52, var53, var69, var71, var70, var72);
                    if (var73 != null) {
                        method5458(Statics.field66, var59, var60, var54, -1, 0, 0, var50 + 1, var47 + 1);
                        var61.field601 = field899 + var50;
                        var61.field602 = field899 + var47;
                        var61.field606 = var73;
                        var61.field603 = var59 * 128 + var63 * 64;
                        var61.field605 = var60 * 128 + var64 * 64;
                        var61.field592 = var70;
                        if (var46 > var57) {
                            byte var74 = var46;
                            var46 = var57;
                            var57 = var74;
                        }
                        if (var55 > var48) {
                            byte var75 = var55;
                            var55 = var48;
                            var48 = var75;
                        }
                        var61.field613 = var46 + var59;
                        var61.field609 = var57 + var59;
                        var61.field608 = var55 + var60;
                        var61.field610 = var48 + var60;
                    }
                }
            }
            if (class179.field2337 == arg0) {
                int var76 = var1.method3540();
                int var77 = (var76 >> 4 & 0x7) + Statics.field1008;
                int var78 = (var76 & 0x7) + Statics.field2066;
                int var79 = var1.method3662();
                if (var77 >= 0 && var78 >= 0 && var77 < 104 && var78 < 104) {
                    class213 var80 = field758[Statics.field66][var77][var78];
                    if (var80 != null) {
                        for (class87 var81 = (class87) var80.method3986(); var81 != null; var81 = (class87) var80.method3988()) {
                            if ((var79 & 0x7FFF) == var81.field1202) {
                                var81.method3973();
                                break;
                            }
                        }
                        if (var80.method3986() == null) {
                            field758[Statics.field66][var77][var78] = null;
                        }
                        method483(var77, var78);
                    }
                }
            } else if (class179.field2341 == arg0) {
                int var82 = var1.method3668();
                int var83 = var1.method3662();
                int var84 = var1.method3668();
                int var85 = var1.method3540();
                int var86 = (var85 >> 4 & 0x7) + Statics.field1008;
                int var87 = (var85 & 0x7) + Statics.field2066;
                if (var86 >= 0 && var87 >= 0 && var86 < 104 && var87 < 104) {
                    class213 var88 = field758[Statics.field66][var86][var87];
                    if (var88 != null) {
                        for (class87 var89 = (class87) var88.method3986(); var89 != null; var89 = (class87) var88.method3988()) {
                            if ((var82 & 0x7FFF) == var89.field1202 && var89.field1201 == var84) {
                                var89.field1201 = var83;
                                break;
                            }
                        }
                        method483(var86, var87);
                    }
                }
            } else {
                if (class179.field2333 == arg0) {
                    int var90 = var1.method3511();
                    int var91 = (var90 >> 4 & 0x7) + Statics.field1008;
                    int var92 = (var90 & 0x7) + Statics.field2066;
                    int var93 = var1.method3542();
                    int var94 = var1.method3540();
                    int var95 = var94 >> 4 & 0xF;
                    int var96 = var94 & 0x7;
                    int var97 = var1.method3662();
                    if (var91 >= 0 && var92 >= 0 && var91 < 104 && var92 < 104) {
                        int var98 = var95 + 1;
                        if (Statics.field218.field977[0] >= var91 - var98 && Statics.field218.field977[0] <= var91 + var98 && Statics.field218.field982[0] >= var92 - var98 && Statics.field218.field982[0] <= var92 + var98 && field867 != 0 && var96 > 0 && field768 < 50) {
                            field785[field768] = var97;
                            field870[field768] = var96;
                            field871[field768] = var93;
                            field873[field768] = null;
                            field872[field768] = (var91 << 16) + (var92 << 8) + var95;
                            field768++;
                        }
                    }
                }
                if (class179.field2330 == arg0) {
                    int var99 = var1.method3542() * 4;
                    int var100 = var1.method3513();
                    int var101 = var1.method3550();
                    int var102 = var1.method3542() * 4;
                    int var103 = var1.method3534();
                    int var104 = var1.method3511();
                    int var105 = var1.method3542();
                    int var106 = var1.method3668();
                    int var107 = var1.method3540();
                    int var108 = (var107 >> 4 & 0x7) + Statics.field1008;
                    int var109 = (var107 & 0x7) + Statics.field2066;
                    byte var110 = var1.method3543();
                    byte var111 = var1.method3544();
                    int var112 = var108 + var111;
                    int var113 = var109 + var110;
                    if (var108 >= 0 && var109 >= 0 && var108 < 104 && var109 < 104 && var112 >= 0 && var113 >= 0 && var112 < 104 && var113 < 104 && var101 != 65535) {
                        int var114 = var108 * 128 + 64;
                        int var115 = var109 * 128 + 64;
                        int var116 = var112 * 128 + 64;
                        int var117 = var113 * 128 + 64;
                        class86 var118 = new class86(var101, Statics.field66, var114, var115, method643(var114, var115, Statics.field66) - var102, field899 + var106, field899 + var100, var104, var105, var103, var99);
                        var118.method1923(var116, var117, method643(var116, var117, Statics.field66) - var99, field899 + var106);
                        field643.method3981(var118);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ks.hi(IIIIIIIIII)V")
    public static final void method5458(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class69 var9 = null;
        for (class69 var10 = (class69) field759.method3986(); var10 != null; var10 = (class69) field759.method3988()) {
            if (var10.field908 == arg0 && var10.field910 == arg1 && var10.field911 == arg2 && var10.field914 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class69();
            var9.field908 = arg0;
            var9.field914 = arg3;
            var9.field910 = arg1;
            var9.field911 = arg2;
            method3185(var9);
            field759.method3981(var9);
        }
        var9.field915 = arg4;
        var9.field917 = arg5;
        var9.field916 = arg6;
        var9.field918 = arg7;
        var9.field919 = arg8;
    }

    @ObfuscatedName("er.hk(Lbr;I)V")
    public static final void method3185(class69 arg0) {
        long var1 = 0L;
        int var3 = -1;
        int var4 = 0;
        int var5 = 0;
        if (arg0.field914 == 0) {
            var1 = Statics.field185.method2896(arg0.field908, arg0.field910, arg0.field911);
        }
        if (arg0.field914 == 1) {
            var1 = Statics.field185.method3007(arg0.field908, arg0.field910, arg0.field911);
        }
        if (arg0.field914 == 2) {
            var1 = Statics.field185.method2958(arg0.field908, arg0.field910, arg0.field911);
        }
        if (arg0.field914 == 3) {
            var1 = Statics.field185.method2899(arg0.field908, arg0.field910, arg0.field911);
        }
        if (var1 != 0L) {
            int var6 = Statics.field185.method2900(arg0.field908, arg0.field910, arg0.field911, var1);
            var3 = class128.method1149(var1);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg0.field920 = var3;
        arg0.field912 = var4;
        arg0.field913 = var5;
    }

    @ObfuscatedName("ax.hf(B)V")
    public static final void method708() {
        for (class69 var0 = (class69) field759.method3986(); var0 != null; var0 = (class69) field759.method3988()) {
            if (var0.field919 > 0) {
                var0.field919--;
            }
            if (var0.field919 == 0) {
                if (var0.field920 >= 0) {
                    int var1 = var0.field920;
                    int var2 = var0.field912;
                    class274 var3 = class274.method4676(var1);
                    if (var2 == 11) {
                        var2 = 10;
                    }
                    if (var2 >= 5 && var2 <= 8) {
                        var2 = 4;
                    }
                    boolean var4 = var3.method4896(var2);
                    if (!var4) {
                        continue;
                    }
                }
                method4216(var0.field908, var0.field914, var0.field910, var0.field911, var0.field920, var0.field913, var0.field912);
                var0.method3973();
            } else {
                if (var0.field918 > 0) {
                    var0.field918--;
                }
                if (var0.field918 == 0 && var0.field910 >= 1 && var0.field911 >= 1 && var0.field910 <= 102 && var0.field911 <= 102) {
                    if (var0.field915 >= 0) {
                        int var5 = var0.field915;
                        int var6 = var0.field917;
                        class274 var7 = class274.method4676(var5);
                        if (var6 == 11) {
                            var6 = 10;
                        }
                        if (var6 >= 5 && var6 <= 8) {
                            var6 = 4;
                        }
                        boolean var8 = var7.method4896(var6);
                        if (!var8) {
                            continue;
                        }
                    }
                    method4216(var0.field908, var0.field914, var0.field910, var0.field911, var0.field915, var0.field916, var0.field917);
                    var0.field918 = -1;
                    if (var0.field920 == var0.field915 && var0.field920 == -1) {
                        var0.method3973();
                    } else if (var0.field920 == var0.field915 && var0.field916 == var0.field913 && var0.field917 == var0.field912) {
                        var0.method3973();
                    }
                }
            }
        }
    }

    @ObfuscatedName("hq.hu(IIIIIIII)V")
    public static final void method4216(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field826 && Statics.field66 != arg0) {
            return;
        }
        long var7 = 0L;
        boolean var9 = true;
        boolean var10 = false;
        boolean var11 = false;
        if (arg1 == 0) {
            var7 = Statics.field185.method2896(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field185.method3007(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field185.method2958(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field185.method2899(arg0, arg2, arg3);
        }
        if (var7 != 0L) {
            int var12 = Statics.field185.method2900(arg0, arg2, arg3, var7);
            int var13 = class128.method1149(var7);
            int var14 = var12 & 0x1F;
            int var15 = var12 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field185.method2887(arg0, arg2, arg3);
                class274 var16 = class274.method4676(var13);
                if (var16.field3457 != 0) {
                    field641[arg0].method3348(arg2, arg3, var14, var15, var16.field3458);
                }
            }
            if (arg1 == 1) {
                Statics.field185.method2888(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field185.method2992(arg0, arg2, arg3);
                class274 var17 = class274.method4676(var13);
                if (var17.field3455 + arg2 > 103 || var17.field3455 + arg3 > 103 || var17.field3482 + arg2 > 103 || var17.field3482 + arg3 > 103) {
                    return;
                }
                if (var17.field3457 != 0) {
                    field641[arg0].method3349(arg2, arg3, var17.field3455, var17.field3482, var15, var17.field3458);
                }
            }
            if (arg1 == 3) {
                Statics.field185.method2890(arg0, arg2, arg3);
                class274 var18 = class274.method4676(var13);
                if (var18.field3457 == 1) {
                    field641[arg0].method3351(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var19 = arg0;
        if (arg0 < 3 && (class56.field492[1][arg2][arg3] & 0x2) == 2) {
            var19 = arg0 + 1;
        }
        class133 var20 = Statics.field185;
        class172 var21 = field641[arg0];
        class274 var22 = class274.method4676(arg4);
        int var23;
        int var24;
        if (arg5 == 1 || arg5 == 3) {
            var23 = var22.field3482;
            var24 = var22.field3455;
        } else {
            var23 = var22.field3455;
            var24 = var22.field3482;
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
        int[][] var29 = class56.field511[var19];
        int var30 = var29[var25][var27] + var29[var26][var27] + var29[var25][var28] + var29[var26][var28] >> 2;
        int var31 = (arg2 << 7) + (var23 << 6);
        int var32 = (arg3 << 7) + (var24 << 6);
        long var33 = class128.method1570(arg2, arg3, 2, var22.field3471 == 0, arg4);
        int var35 = (arg5 << 6) + arg6;
        if (var22.field3449 == 1) {
            var35 += 256;
        }
        if (arg6 == 22) {
            class135 var36;
            if (var22.field3463 == -1 && var22.field3481 == null) {
                var36 = var22.method4866(22, arg5, var29, var31, var30, var32);
            } else {
                var36 = new class93(arg4, 22, arg5, var19, arg2, arg3, var22.field3463, true, (class135) null);
            }
            var20.method2947(arg0, arg2, arg3, var30, var36, var33, var35);
            if (var22.field3457 == 1) {
                var21.method3359(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class135 var62;
            if (var22.field3463 == -1 && var22.field3481 == null) {
                var62 = var22.method4866(10, arg5, var29, var31, var30, var32);
            } else {
                var62 = new class93(arg4, 10, arg5, var19, arg2, arg3, var22.field3463, true, (class135) null);
            }
            if (var62 != null) {
                var20.method2880(arg0, arg2, arg3, var30, var23, var24, var62, arg6 == 11 ? 256 : 0, var33, var35);
            }
            if (var22.field3457 != 0) {
                var21.method3345(arg2, arg3, var23, var24, var22.field3458);
            }
        } else if (arg6 >= 12) {
            class135 var37;
            if (var22.field3463 == -1 && var22.field3481 == null) {
                var37 = var22.method4866(arg6, arg5, var29, var31, var30, var32);
            } else {
                var37 = new class93(arg4, arg6, arg5, var19, arg2, arg3, var22.field3463, true, (class135) null);
            }
            var20.method2880(arg0, arg2, arg3, var30, 1, 1, var37, 0, var33, var35);
            if (var22.field3457 != 0) {
                var21.method3345(arg2, arg3, var23, var24, var22.field3458);
            }
        } else if (arg6 == 0) {
            class135 var38;
            if (var22.field3463 == -1 && var22.field3481 == null) {
                var38 = var22.method4866(0, arg5, var29, var31, var30, var32);
            } else {
                var38 = new class93(arg4, 0, arg5, var19, arg2, arg3, var22.field3463, true, (class135) null);
            }
            var20.method2919(arg0, arg2, arg3, var30, var38, (class135) null, class56.field500[arg5], 0, var33, var35);
            if (var22.field3457 != 0) {
                var21.method3344(arg2, arg3, arg6, arg5, var22.field3458);
            }
        } else if (arg6 == 1) {
            class135 var39;
            if (var22.field3463 == -1 && var22.field3481 == null) {
                var39 = var22.method4866(1, arg5, var29, var31, var30, var32);
            } else {
                var39 = new class93(arg4, 1, arg5, var19, arg2, arg3, var22.field3463, true, (class135) null);
            }
            var20.method2919(arg0, arg2, arg3, var30, var39, (class135) null, class56.field507[arg5], 0, var33, var35);
            if (var22.field3457 != 0) {
                var21.method3344(arg2, arg3, arg6, arg5, var22.field3458);
            }
        } else if (arg6 == 2) {
            int var40 = arg5 + 1 & 0x3;
            class135 var41;
            class135 var42;
            if (var22.field3463 == -1 && var22.field3481 == null) {
                var41 = var22.method4866(2, arg5 + 4, var29, var31, var30, var32);
                var42 = var22.method4866(2, var40, var29, var31, var30, var32);
            } else {
                var41 = new class93(arg4, 2, arg5 + 4, var19, arg2, arg3, var22.field3463, true, (class135) null);
                var42 = new class93(arg4, 2, var40, var19, arg2, arg3, var22.field3463, true, (class135) null);
            }
            var20.method2919(arg0, arg2, arg3, var30, var41, var42, class56.field500[arg5], class56.field500[var40], var33, var35);
            if (var22.field3457 != 0) {
                var21.method3344(arg2, arg3, arg6, arg5, var22.field3458);
            }
        } else if (arg6 == 3) {
            class135 var43;
            if (var22.field3463 == -1 && var22.field3481 == null) {
                var43 = var22.method4866(3, arg5, var29, var31, var30, var32);
            } else {
                var43 = new class93(arg4, 3, arg5, var19, arg2, arg3, var22.field3463, true, (class135) null);
            }
            var20.method2919(arg0, arg2, arg3, var30, var43, (class135) null, class56.field507[arg5], 0, var33, var35);
            if (var22.field3457 != 0) {
                var21.method3344(arg2, arg3, arg6, arg5, var22.field3458);
            }
        } else if (arg6 == 9) {
            class135 var44;
            if (var22.field3463 == -1 && var22.field3481 == null) {
                var44 = var22.method4866(arg6, arg5, var29, var31, var30, var32);
            } else {
                var44 = new class93(arg4, arg6, arg5, var19, arg2, arg3, var22.field3463, true, (class135) null);
            }
            var20.method2880(arg0, arg2, arg3, var30, 1, 1, var44, 0, var33, var35);
            if (var22.field3457 != 0) {
                var21.method3345(arg2, arg3, var23, var24, var22.field3458);
            }
        } else if (arg6 == 4) {
            class135 var45;
            if (var22.field3463 == -1 && var22.field3481 == null) {
                var45 = var22.method4866(4, arg5, var29, var31, var30, var32);
            } else {
                var45 = new class93(arg4, 4, arg5, var19, arg2, arg3, var22.field3463, true, (class135) null);
            }
            var20.method2879(arg0, arg2, arg3, var30, var45, (class135) null, class56.field500[arg5], 0, 0, 0, var33, var35);
        } else if (arg6 == 5) {
            int var46 = 16;
            long var47 = var20.method2896(arg0, arg2, arg3);
            if (var47 != 0L) {
                var46 = class274.method4676(class128.method1149(var47)).field3451;
            }
            class135 var49;
            if (var22.field3463 == -1 && var22.field3481 == null) {
                var49 = var22.method4866(4, arg5, var29, var31, var30, var32);
            } else {
                var49 = new class93(arg4, 4, arg5, var19, arg2, arg3, var22.field3463, true, (class135) null);
            }
            var20.method2879(arg0, arg2, arg3, var30, var49, (class135) null, class56.field500[arg5], 0, class56.field506[arg5] * var46, class56.field508[arg5] * var46, var33, var35);
        } else if (arg6 == 6) {
            int var50 = 8;
            long var51 = var20.method2896(arg0, arg2, arg3);
            if (var51 != 0L) {
                var50 = class274.method4676(class128.method1149(var51)).field3451 / 2;
            }
            class135 var53;
            if (var22.field3463 == -1 && var22.field3481 == null) {
                var53 = var22.method4866(4, arg5 + 4, var29, var31, var30, var32);
            } else {
                var53 = new class93(arg4, 4, arg5 + 4, var19, arg2, arg3, var22.field3463, true, (class135) null);
            }
            var20.method2879(arg0, arg2, arg3, var30, var53, (class135) null, 256, arg5, class56.field496[arg5] * var50, class56.field510[arg5] * var50, var33, var35);
        } else if (arg6 == 7) {
            int var54 = arg5 + 2 & 0x3;
            class135 var55;
            if (var22.field3463 == -1 && var22.field3481 == null) {
                var55 = var22.method4866(4, var54 + 4, var29, var31, var30, var32);
            } else {
                var55 = new class93(arg4, 4, var54 + 4, var19, arg2, arg3, var22.field3463, true, (class135) null);
            }
            var20.method2879(arg0, arg2, arg3, var30, var55, (class135) null, 256, var54, 0, 0, var33, var35);
        } else if (arg6 == 8) {
            int var56 = 8;
            long var57 = var20.method2896(arg0, arg2, arg3);
            if (var57 != 0L) {
                var56 = class274.method4676(class128.method1149(var57)).field3451 / 2;
            }
            int var59 = arg5 + 2 & 0x3;
            class135 var60;
            class135 var61;
            if (var22.field3463 == -1 && var22.field3481 == null) {
                var60 = var22.method4866(4, arg5 + 4, var29, var31, var30, var32);
                var61 = var22.method4866(4, var59 + 4, var29, var31, var30, var32);
            } else {
                var60 = new class93(arg4, 4, arg5 + 4, var19, arg2, arg3, var22.field3463, true, (class135) null);
                var61 = new class93(arg4, 4, var59 + 4, var19, arg2, arg3, var22.field3463, true, (class135) null);
            }
            var20.method2879(arg0, arg2, arg3, var30, var60, var61, 256, arg5, class56.field496[arg5] * var56, class56.field510[arg5] * var56, var33, var35);
        }
    }

    @ObfuscatedName("ad.hb(IIB)V")
    public static final void method483(int arg0, int arg1) {
        class213 var2 = field758[Statics.field66][arg0][arg1];
        if (var2 == null) {
            Statics.field185.method2891(Statics.field66, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class87 var5 = null;
        for (class87 var6 = (class87) var2.method3986(); var6 != null; var6 = (class87) var2.method3988()) {
            class275 var7 = class275.method4283(var6.field1202);
            long var8 = (long) var7.field3532;
            if (var7.field3510 == 1) {
                var8 = (long) (var6.field1201 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field185.method2891(Statics.field66, arg0, arg1);
            return;
        }
        var2.method3982(var5);
        class87 var10 = null;
        class87 var11 = null;
        for (class87 var12 = (class87) var2.method3986(); var12 != null; var12 = (class87) var2.method3988()) {
            if (var5.field1202 != var12.field1202) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1202 != var12.field1202 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        long var13 = class128.method1570(arg0, arg1, 3, false, 0);
        Statics.field185.method2937(Statics.field66, arg0, arg1, method643(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field66), var5, var13, var10, var11);
    }

    @ObfuscatedName("h.hs(ZLgh;I)V")
    public static final void method7(boolean arg0, class197 arg1) {
        field751 = 0;
        field674 = 0;
        method143();
        while (arg1.method3747(field886.field1278) >= 27) {
            int var2 = arg1.method3745(15);
            if (var2 == 32767) {
                break;
            }
            boolean var6 = false;
            if (field866[var2] == null) {
                field866[var2] = new class79();
                var6 = true;
            }
            class79 var7 = field866[var2];
            field763[++field660 - 1] = var2;
            var7.field971 = field899;
            int var8;
            if (arg0) {
                var8 = arg1.method3745(8);
                if (var8 > 127) {
                    var8 -= 256;
                }
            } else {
                var8 = arg1.method3745(5);
                if (var8 > 15) {
                    var8 -= 32;
                }
            }
            int var9 = arg1.method3745(1);
            int var10 = field645[arg1.method3745(3)];
            if (var6) {
                var7.field973 = var7.field923 = var10;
            }
            int var11 = arg1.method3745(1);
            if (var11 == 1) {
                field675[++field674 - 1] = var2;
            }
            int var12;
            if (arg0) {
                var12 = arg1.method3745(8);
                if (var12 > 127) {
                    var12 -= 256;
                }
            } else {
                var12 = arg1.method3745(5);
                if (var12 > 15) {
                    var12 -= 32;
                }
            }
            var7.field1086 = class277.method17(arg1.method3745(14));
            var7.field950 = var7.field1086.field3549;
            var7.field975 = var7.field1086.field3578;
            if (var7.field975 == 0) {
                var7.field923 = 0;
            }
            var7.field937 = var7.field1086.field3555;
            var7.field931 = var7.field1086.field3553;
            var7.field948 = var7.field1086.field3563;
            var7.field980 = var7.field1086.field3568;
            var7.field927 = var7.field1086.field3558;
            var7.field928 = var7.field1086.field3559;
            var7.field962 = var7.field1086.field3564;
            var7.method1850(Statics.field218.field977[0] + var8, Statics.field218.field982[0] + var12, var9 == 1);
        }
        arg1.method3746();
        method3105(arg1);
        for (int var3 = 0; var3 < field751; var3++) {
            int var4 = field807[var3];
            if (field899 != field866[var4].field971) {
                field866[var4].field1086 = null;
                field866[var4] = null;
            }
        }
        if (field886.field1278 != arg1.field2423) {
            throw new RuntimeException(arg1.field2423 + class81.field1109 + field886.field1278);
        }
        for (int var5 = 0; var5 < field660; var5++) {
            if (field866[field763[var5]] == null) {
                throw new RuntimeException(var5 + class81.field1109 + field660);
            }
        }
    }

    @ObfuscatedName("i.ha(I)V")
    public static final void method143() {
        class197 var0 = field886.field1281;
        var0.method3744();
        int var1 = var0.method3745(8);
        if (var1 < field660) {
            for (int var2 = var1; var2 < field660; var2++) {
                field807[++field751 - 1] = field763[var2];
            }
        }
        if (var1 > field660) {
            throw new RuntimeException("");
        }
        field660 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field763[var3];
            class79 var5 = field866[var4];
            int var6 = var0.method3745(1);
            if (var6 == 0) {
                field763[++field660 - 1] = var4;
                var5.field971 = field899;
            } else {
                int var7 = var0.method3745(2);
                if (var7 == 0) {
                    field763[++field660 - 1] = var4;
                    var5.field971 = field899;
                    field675[++field674 - 1] = var4;
                } else if (var7 == 1) {
                    field763[++field660 - 1] = var4;
                    var5.field971 = field899;
                    int var8 = var0.method3745(3);
                    var5.method1845(var8, (byte) 1);
                    int var9 = var0.method3745(1);
                    if (var9 == 1) {
                        field675[++field674 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field763[++field660 - 1] = var4;
                    var5.field971 = field899;
                    int var10 = var0.method3745(3);
                    var5.method1845(var10, (byte) 2);
                    int var11 = var0.method3745(3);
                    var5.method1845(var11, (byte) 2);
                    int var12 = var0.method3745(1);
                    if (var12 == 1) {
                        field675[++field674 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field807[++field751 - 1] = var4;
                }
            }
        }
    }

    @ObfuscatedName("ef.hg(Lgh;B)V")
    public static final void method3105(class197 arg0) {
        for (int var1 = 0; var1 < field674; var1++) {
            int var2 = field675[var1];
            class79 var3 = field866[var2];
            int var4 = arg0.method3511();
            if ((var4 & 0x1) != 0) {
                var3.field930 = arg0.method3668();
                if (var3.field930 == 65535) {
                    var3.field930 = -1;
                }
            }
            if ((var4 & 0x40) != 0) {
                int var5 = arg0.method3662();
                int var6 = arg0.method3662();
                int var7 = var3.field949 - (var5 - Statics.field512 - Statics.field512) * 64;
                int var8 = var3.field922 - (var6 - Statics.field318 - Statics.field318) * 64;
                if (var7 != 0 || var8 != 0) {
                    var3.field932 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
            if ((var4 & 0x20) != 0) {
                int var9 = arg0.method3513();
                if (var9 == 65535) {
                    var9 = -1;
                }
                int var10 = arg0.method3542();
                if (var3.field954 == var9 && var9 != -1) {
                    int var11 = class279.method2783(var9).field3616;
                    if (var11 == 1) {
                        var3.field955 = 0;
                        var3.field956 = 0;
                        var3.field969 = var10;
                        var3.field958 = 0;
                    }
                    if (var11 == 2) {
                        var3.field958 = 0;
                    }
                } else if (var9 == -1 || var3.field954 == -1 || class279.method2783(var9).field3610 >= class279.method2783(var3.field954).field3610) {
                    var3.field954 = var9;
                    var3.field955 = 0;
                    var3.field956 = 0;
                    var3.field969 = var10;
                    var3.field958 = 0;
                    var3.field921 = var3.field957;
                }
            }
            if ((var4 & 0x4) != 0) {
                var3.field1086 = class277.method17(arg0.method3513());
                var3.field950 = var3.field1086.field3549;
                var3.field975 = var3.field1086.field3578;
                var3.field937 = var3.field1086.field3555;
                var3.field931 = var3.field1086.field3553;
                var3.field948 = var3.field1086.field3563;
                var3.field980 = var3.field1086.field3568;
                var3.field927 = var3.field1086.field3558;
                var3.field928 = var3.field1086.field3559;
                var3.field962 = var3.field1086.field3564;
            }
            if ((var4 & 0x10) != 0) {
                int var12 = arg0.method3621();
                if (var12 > 0) {
                    for (int var13 = 0; var13 < var12; var13++) {
                        int var14 = -1;
                        int var15 = -1;
                        int var16 = -1;
                        int var17 = arg0.method3566();
                        if (var17 == 32767) {
                            var17 = arg0.method3566();
                            var15 = arg0.method3566();
                            var14 = arg0.method3566();
                            var16 = arg0.method3566();
                        } else if (var17 == 32766) {
                            var17 = -1;
                        } else {
                            var15 = arg0.method3566();
                        }
                        int var18 = arg0.method3566();
                        var3.method1573(var17, var15, var14, var16, field899, var18);
                    }
                }
                int var19 = arg0.method3540();
                if (var19 > 0) {
                    for (int var20 = 0; var20 < var19; var20++) {
                        int var21 = arg0.method3566();
                        int var22 = arg0.method3566();
                        if (var22 == 32767) {
                            var3.method1577(var21);
                        } else {
                            int var23 = arg0.method3566();
                            int var24 = arg0.method3511();
                            int var25 = var22 > 0 ? arg0.method3542() : var24;
                            var3.method1576(var21, field899, var22, var23, var24, var25);
                        }
                    }
                }
            }
            if ((var4 & 0x8) != 0) {
                var3.field959 = arg0.method3668();
                int var26 = arg0.method3559();
                var3.field966 = var26 >> 16;
                var3.field981 = (var26 & 0xFFFF) + field899;
                var3.field960 = 0;
                var3.field961 = 0;
                if (var3.field981 > field899) {
                    var3.field960 = -1;
                }
                if (var3.field959 == 65535) {
                    var3.field959 = -1;
                }
            }
            if ((var4 & 0x2) != 0) {
                var3.field935 = arg0.method3520();
                var3.field978 = 100;
            }
        }
    }

    @ObfuscatedName("bz.hy(IIB)Lfb;")
    public static class174 method1840(int arg0, int arg1) {
        field903.field2129 = arg0;
        field903.field2127 = arg1;
        field903.field2128 = 1;
        field903.field2130 = 1;
        return field903;
    }

    @ObfuscatedName("az.hh(I)V")
    public static void method682() {
        field774 = 0;
        field766 = false;
    }

    @ObfuscatedName("at.hd(B)V")
    public static void method473() {
        method682();
        field635[0] = class245.field3138;
        field804[0] = "";
        field770[0] = 1006;
        field879[0] = false;
        field774 = 1;
    }

    @ObfuscatedName("ft.hj(IIIII)V")
    public static final void method3266(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field833; var4++) {
            if (field840[var4] + field838[var4] > arg0 && field838[var4] < arg0 + arg2 && field841[var4] + field839[var4] > arg1 && field839[var4] < arg1 + arg3) {
                field885[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.hq(I)V")
    public final void method1161() {
        method174();
        if (Statics.field409 != null || field823 != null) {
            return;
        }
        int var28;
        int var30;
        int var31;
        label227: {
            int var1 = class54.field460;
            if (field766) {
                if (var1 != 1 && (Statics.field98 || var1 != 4)) {
                    int var2 = class54.field468;
                    int var3 = class54.field475 * 30622073;
                    if (var2 < Statics.field1855 - 10 || var2 > Statics.field625 + Statics.field1855 + 10 || var3 < Statics.field628 - 10 || var3 > Statics.field628 + Statics.field286 + 10) {
                        field766 = false;
                        int var4 = Statics.field1855;
                        int var5 = Statics.field628;
                        int var6 = Statics.field625;
                        int var7 = Statics.field286;
                        for (int var8 = 0; var8 < field833; var8++) {
                            if (field840[var8] + field838[var8] > var4 && field838[var8] < var4 + var6 && field841[var8] + field839[var8] > var5 && field839[var8] < var5 + var7) {
                                field835[var8] = true;
                            }
                        }
                    }
                }
                if (var1 == 1 || !Statics.field98 && var1 == 4) {
                    int var9 = Statics.field1855;
                    int var10 = Statics.field628;
                    int var11 = Statics.field625;
                    int var12 = class54.field478;
                    int var13 = class54.field479;
                    int var14 = -1;
                    for (int var15 = 0; var15 < field774; var15++) {
                        int var16 = (field774 - 1 - var15) * 15 + var10 + 31;
                        if (var12 > var9 && var12 < var9 + var11 && var13 > var16 - 13 && var13 < var16 + 3) {
                            var14 = var15;
                        }
                    }
                    if (var14 != -1 && var14 >= 0) {
                        int var17 = field767[var14];
                        int var18 = field769[var14];
                        int var19 = field770[var14];
                        int var20 = field687[var14];
                        String var21 = field635[var14];
                        String var22 = field804[var14];
                        method934(var17, var18, var19, var20, var21, var22, class54.field478, class54.field479);
                    }
                    field766 = false;
                    int var23 = Statics.field1855;
                    int var24 = Statics.field628;
                    int var25 = Statics.field625;
                    int var26 = Statics.field286;
                    for (int var27 = 0; var27 < field833; var27++) {
                        if (field840[var27] + field838[var27] > var23 && field838[var27] < var23 + var25 && field841[var27] + field839[var27] > var24 && field839[var27] < var24 + var26) {
                            field835[var27] = true;
                        }
                    }
                }
            } else {
                var28 = method4450();
                if ((var1 == 1 || !Statics.field98 && var1 == 4) && var28 >= 0) {
                    int var29 = field770[var28];
                    if (var29 == 39 || var29 == 40 || var29 == 41 || var29 == 42 || var29 == 43 || var29 == 33 || var29 == 34 || var29 == 35 || var29 == 36 || var29 == 37 || var29 == 38 || var29 == 1005) {
                        var30 = field767[var28];
                        var31 = field769[var28];
                        class238 var32 = class238.method2289(var31);
                        int var33 = method2756(var32);
                        boolean var34 = (var33 >> 28 & 0x1) != 0;
                        if (var34) {
                            break label227;
                        }
                        class239 var10000 = (class239) null;
                        if (class239.method280(method2756(var32))) {
                            break label227;
                        }
                    }
                }
                if ((var1 == 1 || !Statics.field98 && var1 == 4) && this.method1162()) {
                    var1 = 2;
                }
                if ((var1 == 1 || !Statics.field98 && var1 == 4) && field774 > 0 && var28 >= 0) {
                    int var35 = field767[var28];
                    int var36 = field769[var28];
                    int var37 = field770[var28];
                    int var38 = field687[var28];
                    String var39 = field635[var28];
                    String var40 = field804[var28];
                    method934(var35, var36, var37, var38, var39, var40, class54.field478, class54.field479);
                }
                if (var1 == 2 && field774 > 0) {
                    this.method1163(class54.field478, class54.field479);
                }
            }
            return;
        }
        if (Statics.field409 != null && !field792 && field774 > 0 && !this.method1162()) {
            method493(field739, field830);
        }
        field792 = false;
        field743 = 0;
        if (Statics.field409 != null) {
            method649(Statics.field409);
        }
        Statics.field409 = class238.method2289(var31);
        field738 = var30;
        field739 = class54.field478;
        field830 = class54.field479;
        if (var28 >= 0) {
            method3173(var28);
        }
        method649(Statics.field409);
    }

    @ObfuscatedName("client.hc(B)Z")
    public final boolean method1162() {
        int var1 = method4450();
        boolean var2 = field765 == 1 && field774 > 2;
        if (!var2) {
            boolean var3;
            if (var1 < 0) {
                var3 = false;
            } else {
                int var4 = field770[var1];
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
        return var2 && !field879[var1];
    }

    @ObfuscatedName("client.hw(III)V")
    public final void method1163(int arg0, int arg1) {
        method566(arg0, arg1);
        Statics.field185.method2907(Statics.field66, arg0, arg1, false);
        field766 = true;
    }

    @ObfuscatedName("hw.hn(I)V")
    public static void method4282() {
        method566(Statics.field625 / 2 + Statics.field1855, Statics.field628);
    }

    @ObfuscatedName("ao.hz(IIB)V")
    public static void method566(int arg0, int arg1) {
        int var2 = Statics.field1502.method5345(class245.field3025);
        for (int var3 = 0; var3 < field774; var3++) {
            class304 var4 = Statics.field1502;
            String var5;
            if (var3 < 0) {
                var5 = "";
            } else if (field804[var3].length() > 0) {
                var5 = field635[var3] + class245.field3032 + field804[var3];
            } else {
                var5 = field635[var3];
            }
            int var6 = var4.method5345(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field774 * 15 + 22;
        int var8 = arg0 - var2 / 2;
        if (var2 + var8 > Statics.field1878) {
            var8 = Statics.field1878 - var2;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (var7 + arg1 > Statics.field442) {
            var9 = Statics.field442 - var7;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        Statics.field1855 = var8;
        Statics.field628 = var9;
        Statics.field625 = var2;
        Statics.field286 = field774 * 15 + 22;
    }

    @ObfuscatedName("bi.he(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method934(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 58) {
            class238 var8 = class238.method4106(arg1, arg0);
            if (var8 != null) {
                class180 var9 = class180.method1090(class177.field2221, field886.field1271);
                var9.field2345.method3546(field786);
                var9.field2345.method3557(arg1);
                var9.field2345.method3546(field787);
                var9.field2345.method3574(arg0);
                var9.field2345.method3576(Statics.field2468);
                var9.field2345.method3574(var8.field2800);
                field886.method2059(var9);
            }
        }
        if (arg2 == 47) {
            class67 var10 = field746[arg3];
            if (var10 != null) {
                field731 = arg6;
                field771 = arg7;
                field733 = 2;
                field659 = 0;
                field828 = arg0;
                field861 = arg1;
                class180 var11 = class180.method1090(class177.field2246, field886.field1271);
                var11.field2345.method3574(arg3);
                var11.field2345.method3538(class45.field382[82] ? 1 : 0);
                field886.method2059(var11);
            }
        }
        if (arg2 == 21) {
            field731 = arg6;
            field771 = arg7;
            field733 = 2;
            field659 = 0;
            field828 = arg0;
            field861 = arg1;
            class180 var12 = class180.method1090(class177.field2248, field886.field1271);
            var12.field2345.method3571(Statics.field318 + arg1);
            var12.field2345.method3546(arg3);
            var12.field2345.method3508(Statics.field512 + arg0);
            var12.field2345.method3539(class45.field382[82] ? 1 : 0);
            field886.method2059(var12);
        }
        if (arg2 == 23) {
            if (field766) {
                Statics.field185.method2908();
            } else {
                Statics.field185.method2907(Statics.field66, arg0, arg1, true);
            }
        }
        if (arg2 == 36) {
            class180 var13 = class180.method1090(class177.field2226, field886.field1271);
            var13.field2345.method3574(arg3);
            var13.field2345.method3576(arg1);
            var13.field2345.method3574(arg0);
            field886.method2059(var13);
            field736 = 0;
            Statics.field62 = class238.method2289(arg1);
            field737 = arg0;
        }
        if (arg2 == 15) {
            class67 var14 = field746[arg3];
            if (var14 != null) {
                field731 = arg6;
                field771 = arg7;
                field733 = 2;
                field659 = 0;
                field828 = arg0;
                field861 = arg1;
                class180 var15 = class180.method1090(class177.field2274, field886.field1271);
                var15.field2345.method3557(Statics.field2468);
                var15.field2345.method3539(class45.field382[82] ? 1 : 0);
                var15.field2345.method3571(field786);
                var15.field2345.method3508(arg3);
                field886.method2059(var15);
            }
        }
        if (arg2 == 7) {
            class79 var16 = field866[arg3];
            if (var16 != null) {
                field731 = arg6;
                field771 = arg7;
                field733 = 2;
                field659 = 0;
                field828 = arg0;
                field861 = arg1;
                class180 var17 = class180.method1090(class177.field2242, field886.field1271);
                var17.field2345.method3574(Statics.field974);
                var17.field2345.method3508(Statics.field3219);
                var17.field2345.method3574(arg3);
                var17.field2345.method3538(class45.field382[82] ? 1 : 0);
                var17.field2345.method3576(Statics.field399);
                field886.method2059(var17);
            }
        }
        if (arg2 == 19) {
            field731 = arg6;
            field771 = arg7;
            field733 = 2;
            field659 = 0;
            field828 = arg0;
            field861 = arg1;
            class180 var18 = class180.method1090(class177.field2293, field886.field1271);
            var18.field2345.method3574(arg3);
            var18.field2345.method3571(Statics.field512 + arg0);
            var18.field2345.method3508(Statics.field318 + arg1);
            var18.field2345.method3646(class45.field382[82] ? 1 : 0);
            field886.method2059(var18);
        }
        if (arg2 == 18) {
            field731 = arg6;
            field771 = arg7;
            field733 = 2;
            field659 = 0;
            field828 = arg0;
            field861 = arg1;
            class180 var19 = class180.method1090(class177.field2228, field886.field1271);
            var19.field2345.method3574(Statics.field318 + arg1);
            var19.field2345.method3546(arg3);
            var19.field2345.method3546(Statics.field512 + arg0);
            var19.field2345.method3646(class45.field382[82] ? 1 : 0);
            field886.method2059(var19);
        }
        if (arg2 == 25) {
            class238 var20 = class238.method4106(arg1, arg0);
            if (var20 != null) {
                method3409();
                method148(arg1, arg0, class239.method4292(method2756(var20)), var20.field2800);
                field869 = 0;
                field788 = method933(var20);
                if (field788 == null) {
                    field788 = class245.field2894;
                }
                if (var20.field2672) {
                    field694 = var20.field2753 + class81.method268(16777215);
                } else {
                    field694 = class81.method268(65280) + var20.field2796 + class81.method268(16777215);
                }
            }
            return;
        }
        if (arg2 == 5) {
            field731 = arg6;
            field771 = arg7;
            field733 = 2;
            field659 = 0;
            field828 = arg0;
            field861 = arg1;
            class180 var21 = class180.method1090(class177.field2308, field886.field1271);
            var21.field2345.method3574(Statics.field512 + arg0);
            var21.field2345.method3571(arg3);
            var21.field2345.method3574(Statics.field318 + arg1);
            var21.field2345.method3591(class45.field382[82] ? 1 : 0);
            field886.method2059(var21);
        }
        if (arg2 == 1001) {
            field731 = arg6;
            field771 = arg7;
            field733 = 2;
            field659 = 0;
            field828 = arg0;
            field861 = arg1;
            class180 var22 = class180.method1090(class177.field2227, field886.field1271);
            var22.field2345.method3508(arg3);
            var22.field2345.method3591(class45.field382[82] ? 1 : 0);
            var22.field2345.method3571(Statics.field512 + arg0);
            var22.field2345.method3574(Statics.field318 + arg1);
            field886.method2059(var22);
        }
        if (arg2 == 1004) {
            field731 = arg6;
            field771 = arg7;
            field733 = 2;
            field659 = 0;
            class180 var23 = class180.method1090(class177.field2259, field886.field1271);
            var23.field2345.method3546(arg3);
            field886.method2059(var23);
        }
        if (arg2 == 12) {
            class79 var24 = field866[arg3];
            if (var24 != null) {
                field731 = arg6;
                field771 = arg7;
                field733 = 2;
                field659 = 0;
                field828 = arg0;
                field861 = arg1;
                class180 var25 = class180.method1090(class177.field2292, field886.field1271);
                var25.field2345.method3508(arg3);
                var25.field2345.method3591(class45.field382[82] ? 1 : 0);
                field886.method2059(var25);
            }
        }
        if (arg2 == 28) {
            class180 var26 = class180.method1090(class177.field2288, field886.field1271);
            var26.field2345.method3576(arg1);
            field886.method2059(var26);
            class238 var27 = class238.method2289(arg1);
            if (var27.field2792 != null && var27.field2792[0][0] == 5) {
                int var28 = var27.field2792[0][1];
                class233.field2632[var28] = 1 - class233.field2632[var28];
                method2266(var28);
            }
        }
        if (arg2 == 1003) {
            field731 = arg6;
            field771 = arg7;
            field733 = 2;
            field659 = 0;
            class79 var29 = field866[arg3];
            if (var29 != null) {
                class277 var30 = var29.field1086;
                if (var30.field3574 != null) {
                    var30 = var30.method4976();
                }
                if (var30 != null) {
                    class180 var31 = class180.method1090(class177.field2220, field886.field1271);
                    var31.field2345.method3571(var30.field3573);
                    field886.method2059(var31);
                }
            }
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field533.method5853(arg2, arg3, new class234(arg0), new class234(arg1));
        }
        if (arg2 == 42) {
            class180 var32 = class180.method1090(class177.field2237, field886.field1271);
            var32.field2345.method3576(arg1);
            var32.field2345.method3571(arg0);
            var32.field2345.method3508(arg3);
            field886.method2059(var32);
            field736 = 0;
            Statics.field62 = class238.method2289(arg1);
            field737 = arg0;
        }
        if (arg2 == 34) {
            class180 var33 = class180.method1090(class177.field2317, field886.field1271);
            var33.field2345.method3571(arg3);
            var33.field2345.method3557(arg1);
            var33.field2345.method3574(arg0);
            field886.method2059(var33);
            field736 = 0;
            Statics.field62 = class238.method2289(arg1);
            field737 = arg0;
        }
        if (arg2 == 44) {
            class67 var34 = field746[arg3];
            if (var34 != null) {
                field731 = arg6;
                field771 = arg7;
                field733 = 2;
                field659 = 0;
                field828 = arg0;
                field861 = arg1;
                class180 var35 = class180.method1090(class177.field2266, field886.field1271);
                var35.field2345.method3508(arg3);
                var35.field2345.method3538(class45.field382[82] ? 1 : 0);
                field886.method2059(var35);
            }
        }
        if (arg2 == 9) {
            class79 var36 = field866[arg3];
            if (var36 != null) {
                field731 = arg6;
                field771 = arg7;
                field733 = 2;
                field659 = 0;
                field828 = arg0;
                field861 = arg1;
                class180 var37 = class180.method1090(class177.field2290, field886.field1271);
                var37.field2345.method3538(class45.field382[82] ? 1 : 0);
                var37.field2345.method3546(arg3);
                field886.method2059(var37);
            }
        }
        if (arg2 == 30 && field655 == null) {
            method1005(arg1, arg0);
            field655 = class238.method4106(arg1, arg0);
            method649(field655);
        }
        if (arg2 == 32) {
            class180 var38 = class180.method1090(class177.field2245, field886.field1271);
            var38.field2345.method3634(Statics.field2468);
            var38.field2345.method3576(arg1);
            var38.field2345.method3508(arg0);
            var38.field2345.method3546(arg3);
            var38.field2345.method3546(field786);
            field886.method2059(var38);
            field736 = 0;
            Statics.field62 = class238.method2289(arg1);
            field737 = arg0;
        }
        if (arg2 == 38) {
            method3409();
            class238 var39 = class238.method2289(arg1);
            field869 = 1;
            Statics.field3219 = arg0;
            Statics.field399 = arg1;
            Statics.field974 = arg3;
            method649(var39);
            field784 = class81.method268(16748608) + class275.method4283(arg3).field3523 + class81.method268(16777215);
            if (field784 == null) {
                field784 = class245.field2894;
            }
            return;
        }
        if (arg2 == 26) {
            method147();
        }
        if (arg2 == 31) {
            class180 var40 = class180.method1090(class177.field2282, field886.field1271);
            var40.field2345.method3634(arg1);
            var40.field2345.method3557(Statics.field399);
            var40.field2345.method3574(Statics.field3219);
            var40.field2345.method3546(Statics.field974);
            var40.field2345.method3546(arg0);
            var40.field2345.method3574(arg3);
            field886.method2059(var40);
            field736 = 0;
            Statics.field62 = class238.method2289(arg1);
            field737 = arg0;
        }
        if (arg2 == 41) {
            class180 var41 = class180.method1090(class177.field2284, field886.field1271);
            var41.field2345.method3672(arg1);
            var41.field2345.method3571(arg0);
            var41.field2345.method3508(arg3);
            field886.method2059(var41);
            field736 = 0;
            Statics.field62 = class238.method2289(arg1);
            field737 = arg0;
        }
        if (arg2 == 22) {
            field731 = arg6;
            field771 = arg7;
            field733 = 2;
            field659 = 0;
            field828 = arg0;
            field861 = arg1;
            class180 var42 = class180.method1090(class177.field2270, field886.field1271);
            var42.field2345.method3646(class45.field382[82] ? 1 : 0);
            var42.field2345.method3574(arg3);
            var42.field2345.method3571(Statics.field318 + arg1);
            var42.field2345.method3508(Statics.field512 + arg0);
            field886.method2059(var42);
        }
        if (arg2 == 2) {
            field731 = arg6;
            field771 = arg7;
            field733 = 2;
            field659 = 0;
            field828 = arg0;
            field861 = arg1;
            class180 var43 = class180.method1090(class177.field2294, field886.field1271);
            var43.field2345.method3646(class45.field382[82] ? 1 : 0);
            var43.field2345.method3508(Statics.field512 + arg0);
            var43.field2345.method3571(arg3);
            var43.field2345.method3557(Statics.field2468);
            var43.field2345.method3508(field786);
            var43.field2345.method3546(Statics.field318 + arg1);
            field886.method2059(var43);
        }
        if (arg2 == 16) {
            field731 = arg6;
            field771 = arg7;
            field733 = 2;
            field659 = 0;
            field828 = arg0;
            field861 = arg1;
            class180 var44 = class180.method1090(class177.field2278, field886.field1271);
            var44.field2345.method3634(Statics.field399);
            var44.field2345.method3574(Statics.field974);
            var44.field2345.method3591(class45.field382[82] ? 1 : 0);
            var44.field2345.method3546(Statics.field3219);
            var44.field2345.method3574(arg3);
            var44.field2345.method3574(Statics.field512 + arg0);
            var44.field2345.method3546(Statics.field318 + arg1);
            field886.method2059(var44);
        }
        if (arg2 == 43) {
            class180 var45 = class180.method1090(class177.field2251, field886.field1271);
            var45.field2345.method3508(arg3);
            var45.field2345.method3634(arg1);
            var45.field2345.method3508(arg0);
            field886.method2059(var45);
            field736 = 0;
            Statics.field62 = class238.method2289(arg1);
            field737 = arg0;
        }
        if (arg2 == 51) {
            class67 var46 = field746[arg3];
            if (var46 != null) {
                field731 = arg6;
                field771 = arg7;
                field733 = 2;
                field659 = 0;
                field828 = arg0;
                field861 = arg1;
                class180 var47 = class180.method1090(class177.field2243, field886.field1271);
                var47.field2345.method3538(class45.field382[82] ? 1 : 0);
                var47.field2345.method3574(arg3);
                field886.method2059(var47);
            }
        }
        if (arg2 == 6) {
            field731 = arg6;
            field771 = arg7;
            field733 = 2;
            field659 = 0;
            field828 = arg0;
            field861 = arg1;
            class180 var48 = class180.method1090(class177.field2222, field886.field1271);
            var48.field2345.method3591(class45.field382[82] ? 1 : 0);
            var48.field2345.method3571(Statics.field318 + arg1);
            var48.field2345.method3571(Statics.field512 + arg0);
            var48.field2345.method3546(arg3);
            field886.method2059(var48);
        }
        if (arg2 == 4) {
            field731 = arg6;
            field771 = arg7;
            field733 = 2;
            field659 = 0;
            field828 = arg0;
            field861 = arg1;
            class180 var49 = class180.method1090(class177.field2298, field886.field1271);
            var49.field2345.method3591(class45.field382[82] ? 1 : 0);
            var49.field2345.method3508(arg3);
            var49.field2345.method3508(Statics.field318 + arg1);
            var49.field2345.method3508(Statics.field512 + arg0);
            field886.method2059(var49);
        }
        if (arg2 == 45) {
            class67 var50 = field746[arg3];
            if (var50 != null) {
                field731 = arg6;
                field771 = arg7;
                field733 = 2;
                field659 = 0;
                field828 = arg0;
                field861 = arg1;
                class180 var51 = class180.method1090(class177.field2275, field886.field1271);
                var51.field2345.method3591(class45.field382[82] ? 1 : 0);
                var51.field2345.method3571(arg3);
                field886.method2059(var51);
            }
        }
        if (arg2 == 35) {
            class180 var52 = class180.method1090(class177.field2291, field886.field1271);
            var52.field2345.method3672(arg1);
            var52.field2345.method3574(arg0);
            var52.field2345.method3574(arg3);
            field886.method2059(var52);
            field736 = 0;
            Statics.field62 = class238.method2289(arg1);
            field737 = arg0;
        }
        if (arg2 == 13) {
            class79 var53 = field866[arg3];
            if (var53 != null) {
                field731 = arg6;
                field771 = arg7;
                field733 = 2;
                field659 = 0;
                field828 = arg0;
                field861 = arg1;
                class180 var54 = class180.method1090(class177.field2250, field886.field1271);
                var54.field2345.method3646(class45.field382[82] ? 1 : 0);
                var54.field2345.method3571(arg3);
                field886.method2059(var54);
            }
        }
        if (arg2 == 10) {
            class79 var55 = field866[arg3];
            if (var55 != null) {
                field731 = arg6;
                field771 = arg7;
                field733 = 2;
                field659 = 0;
                field828 = arg0;
                field861 = arg1;
                class180 var56 = class180.method1090(class177.field2255, field886.field1271);
                var56.field2345.method3571(arg3);
                var56.field2345.method3646(class45.field382[82] ? 1 : 0);
                field886.method2059(var56);
            }
        }
        if (arg2 == 48) {
            class67 var57 = field746[arg3];
            if (var57 != null) {
                field731 = arg6;
                field771 = arg7;
                field733 = 2;
                field659 = 0;
                field828 = arg0;
                field861 = arg1;
                class180 var58 = class180.method1090(class177.field2232, field886.field1271);
                var58.field2345.method3591(class45.field382[82] ? 1 : 0);
                var58.field2345.method3571(arg3);
                field886.method2059(var58);
            }
        }
        if (arg2 == 46) {
            class67 var59 = field746[arg3];
            if (var59 != null) {
                field731 = arg6;
                field771 = arg7;
                field733 = 2;
                field659 = 0;
                field828 = arg0;
                field861 = arg1;
                class180 var60 = class180.method1090(class177.field2281, field886.field1271);
                var60.field2345.method3571(arg3);
                var60.field2345.method3646(class45.field382[82] ? 1 : 0);
                field886.method2059(var60);
            }
        }
        if (arg2 == 1) {
            field731 = arg6;
            field771 = arg7;
            field733 = 2;
            field659 = 0;
            field828 = arg0;
            field861 = arg1;
            class180 var61 = class180.method1090(class177.field2263, field886.field1271);
            var61.field2345.method3574(Statics.field318 + arg1);
            var61.field2345.method3546(Statics.field3219);
            var61.field2345.method3591(class45.field382[82] ? 1 : 0);
            var61.field2345.method3672(Statics.field399);
            var61.field2345.method3574(Statics.field512 + arg0);
            var61.field2345.method3508(arg3);
            var61.field2345.method3546(Statics.field974);
            field886.method2059(var61);
        }
        if (arg2 == 49) {
            class67 var62 = field746[arg3];
            if (var62 != null) {
                field731 = arg6;
                field771 = arg7;
                field733 = 2;
                field659 = 0;
                field828 = arg0;
                field861 = arg1;
                class180 var63 = class180.method1090(class177.field2312, field886.field1271);
                var63.field2345.method3571(arg3);
                var63.field2345.method3539(class45.field382[82] ? 1 : 0);
                field886.method2059(var63);
            }
        }
        if (arg2 == 17) {
            field731 = arg6;
            field771 = arg7;
            field733 = 2;
            field659 = 0;
            field828 = arg0;
            field861 = arg1;
            class180 var64 = class180.method1090(class177.field2224, field886.field1271);
            var64.field2345.method3634(Statics.field2468);
            var64.field2345.method3508(field786);
            var64.field2345.method3571(Statics.field318 + arg1);
            var64.field2345.method3571(Statics.field512 + arg0);
            var64.field2345.method3591(class45.field382[82] ? 1 : 0);
            var64.field2345.method3546(arg3);
            field886.method2059(var64);
        }
        if (arg2 == 14) {
            class67 var65 = field746[arg3];
            if (var65 != null) {
                field731 = arg6;
                field771 = arg7;
                field733 = 2;
                field659 = 0;
                field828 = arg0;
                field861 = arg1;
                class180 var66 = class180.method1090(class177.field2300, field886.field1271);
                var66.field2345.method3574(Statics.field3219);
                var66.field2345.method3539(class45.field382[82] ? 1 : 0);
                var66.field2345.method3634(Statics.field399);
                var66.field2345.method3508(arg3);
                var66.field2345.method3508(Statics.field974);
                field886.method2059(var66);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class238 var67 = class238.method4106(arg1, arg0);
            if (var67 != null) {
                method2569(arg3, arg1, arg0, var67.field2800, arg5);
            }
        }
        if (arg2 == 8) {
            class79 var68 = field866[arg3];
            if (var68 != null) {
                field731 = arg6;
                field771 = arg7;
                field733 = 2;
                field659 = 0;
                field828 = arg0;
                field861 = arg1;
                class180 var69 = class180.method1090(class177.field2302, field886.field1271);
                var69.field2345.method3574(arg3);
                var69.field2345.method3538(class45.field382[82] ? 1 : 0);
                var69.field2345.method3672(Statics.field2468);
                var69.field2345.method3571(field786);
                field886.method2059(var69);
            }
        }
        if (arg2 == 40) {
            class180 var70 = class180.method1090(class177.field2223, field886.field1271);
            var70.field2345.method3557(arg1);
            var70.field2345.method3546(arg0);
            var70.field2345.method3571(arg3);
            field886.method2059(var70);
            field736 = 0;
            Statics.field62 = class238.method2289(arg1);
            field737 = arg0;
        }
        if (arg2 == 1005) {
            class238 var71 = class238.method2289(arg1);
            if (var71 == null || var71.field2799[arg0] < 100000) {
                class180 var72 = class180.method1090(class177.field2259, field886.field1271);
                var72.field2345.method3546(arg3);
                field886.method2059(var72);
            } else {
                class91.method1872(27, "", var71.field2799[arg0] + " x " + class275.method4283(arg3).field3523);
            }
            field736 = 0;
            Statics.field62 = class238.method2289(arg1);
            field737 = arg0;
        }
        if (arg2 == 39) {
            class180 var73 = class180.method1090(class177.field2269, field886.field1271);
            var73.field2345.method3574(arg3);
            var73.field2345.method3557(arg1);
            var73.field2345.method3546(arg0);
            field886.method2059(var73);
            field736 = 0;
            Statics.field62 = class238.method2289(arg1);
            field737 = arg0;
        }
        if (arg2 == 33) {
            class180 var74 = class180.method1090(class177.field2286, field886.field1271);
            var74.field2345.method3546(arg3);
            var74.field2345.method3634(arg1);
            var74.field2345.method3508(arg0);
            field886.method2059(var74);
            field736 = 0;
            Statics.field62 = class238.method2289(arg1);
            field737 = arg0;
        }
        if (arg2 == 29) {
            class180 var75 = class180.method1090(class177.field2288, field886.field1271);
            var75.field2345.method3576(arg1);
            field886.method2059(var75);
            class238 var76 = class238.method2289(arg1);
            if (var76.field2792 != null && var76.field2792[0][0] == 5) {
                int var77 = var76.field2792[0][1];
                if (class233.field2632[var77] != var76.field2777[0]) {
                    class233.field2632[var77] = var76.field2777[0];
                    method2266(var77);
                }
            }
        }
        if (arg2 == 24) {
            class238 var78 = class238.method2289(arg1);
            boolean var79 = true;
            if (var78.field2677 > 0) {
                var79 = method2866(var78);
            }
            if (var79) {
                class180 var80 = class180.method1090(class177.field2288, field886.field1271);
                var80.field2345.method3576(arg1);
                field886.method2059(var80);
            }
        }
        if (arg2 == 20) {
            field731 = arg6;
            field771 = arg7;
            field733 = 2;
            field659 = 0;
            field828 = arg0;
            field861 = arg1;
            class180 var81 = class180.method1090(class177.field2225, field886.field1271);
            var81.field2345.method3546(Statics.field318 + arg1);
            var81.field2345.method3539(class45.field382[82] ? 1 : 0);
            var81.field2345.method3546(Statics.field512 + arg0);
            var81.field2345.method3546(arg3);
            field886.method2059(var81);
        }
        if (arg2 == 50) {
            class67 var82 = field746[arg3];
            if (var82 != null) {
                field731 = arg6;
                field771 = arg7;
                field733 = 2;
                field659 = 0;
                field828 = arg0;
                field861 = arg1;
                class180 var83 = class180.method1090(class177.field2283, field886.field1271);
                var83.field2345.method3539(class45.field382[82] ? 1 : 0);
                var83.field2345.method3546(arg3);
                field886.method2059(var83);
            }
        }
        if (arg2 == 37) {
            class180 var84 = class180.method1090(class177.field2315, field886.field1271);
            var84.field2345.method3576(arg1);
            var84.field2345.method3508(arg0);
            var84.field2345.method3508(arg3);
            field886.method2059(var84);
            field736 = 0;
            Statics.field62 = class238.method2289(arg1);
            field737 = arg0;
        }
        if (arg2 == 1002) {
            field731 = arg6;
            field771 = arg7;
            field733 = 2;
            field659 = 0;
            class180 var85 = class180.method1090(class177.field2306, field886.field1271);
            var85.field2345.method3571(arg3);
            field886.method2059(var85);
        }
        if (arg2 == 11) {
            class79 var86 = field866[arg3];
            if (var86 != null) {
                field731 = arg6;
                field771 = arg7;
                field733 = 2;
                field659 = 0;
                field828 = arg0;
                field861 = arg1;
                class180 var87 = class180.method1090(class177.field2252, field886.field1271);
                var87.field2345.method3574(arg3);
                var87.field2345.method3646(class45.field382[82] ? 1 : 0);
                field886.method2059(var87);
            }
        }
        if (arg2 == 3) {
            field731 = arg6;
            field771 = arg7;
            field733 = 2;
            field659 = 0;
            field828 = arg0;
            field861 = arg1;
            class180 var88 = class180.method1090(class177.field2229, field886.field1271);
            var88.field2345.method3508(Statics.field318 + arg1);
            var88.field2345.method3539(class45.field382[82] ? 1 : 0);
            var88.field2345.method3571(arg3);
            var88.field2345.method3574(Statics.field512 + arg0);
            field886.method2059(var88);
        }
        if (field869 != 0) {
            field869 = 0;
            method649(class238.method2289(Statics.field399));
        }
        if (field794) {
            method3409();
        }
        if (Statics.field62 != null && field736 == 0) {
            method649(Statics.field62);
        }
    }

    @ObfuscatedName("ah.hm(ILjava/lang/String;B)V")
    public static void method516(int arg0, String arg1) {
        int var2 = class89.field1213;
        int[] var3 = class89.field1214;
        boolean var4 = false;
        class297 var5 = new class297(arg1, Statics.field346);
        for (int var6 = 0; var6 < var2; var6++) {
            class67 var7 = field746[var3[var6]];
            if (var7 != null && Statics.field218 != var7 && var7.field595 != null && var7.field595.equals(var5)) {
                if (arg0 == 1) {
                    class180 var8 = class180.method1090(class177.field2266, field886.field1271);
                    var8.field2345.method3508(var3[var6]);
                    var8.field2345.method3538(0);
                    field886.method2059(var8);
                } else if (arg0 == 4) {
                    class180 var9 = class180.method1090(class177.field2246, field886.field1271);
                    var9.field2345.method3574(var3[var6]);
                    var9.field2345.method3538(0);
                    field886.method2059(var9);
                } else if (arg0 == 6) {
                    class180 var10 = class180.method1090(class177.field2312, field886.field1271);
                    var10.field2345.method3571(var3[var6]);
                    var10.field2345.method3539(0);
                    field886.method2059(var10);
                } else if (arg0 == 7) {
                    class180 var11 = class180.method1090(class177.field2283, field886.field1271);
                    var11.field2345.method3539(0);
                    var11.field2345.method3546(var3[var6]);
                    field886.method2059(var11);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class91.method1872(4, "", class245.field3021 + arg1);
        }
    }

    @ObfuscatedName("i.ho(IIIII)V")
    public static void method148(int arg0, int arg1, int arg2, int arg3) {
        class238 var4 = class238.method4106(arg0, arg1);
        if (var4 != null && var4.field2771 != null) {
            class63 var5 = new class63();
            var5.field559 = var4;
            var5.field560 = var4.field2771;
            class76.method990(var5);
        }
        field787 = arg3;
        field794 = true;
        Statics.field2468 = arg0;
        field786 = arg1;
        Statics.field532 = arg2;
        method649(var4);
    }

    @ObfuscatedName("fh.is(I)V")
    public static void method3409() {
        if (!field794) {
            return;
        }
        class238 var0 = class238.method4106(Statics.field2468, field786);
        if (var0 != null && var0.field2772 != null) {
            class63 var1 = new class63();
            var1.field559 = var0;
            var1.field560 = var0.field2772;
            class76.method990(var1);
        }
        field794 = false;
        method649(var0);
    }

    @ObfuscatedName("bj.ii(III)V")
    public static void method1005(int arg0, int arg1) {
        class180 var2 = class180.method1090(class177.field2289, field886.field1271);
        var2.field2345.method3557(arg0);
        var2.field2345.method3571(arg1);
        field886.method2059(var2);
    }

    @ObfuscatedName("dp.id(IIIILjava/lang/String;B)V")
    public static void method2569(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class238 var5 = class238.method4106(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2793 != null) {
            class63 var6 = new class63();
            var6.field559 = var5;
            var6.field562 = arg0;
            var6.field557 = arg4;
            var6.field560 = var5.field2793;
            class76.method990(var6);
        }
        boolean var7 = true;
        if (var5.field2677 > 0) {
            var7 = method2866(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = method2756(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            class180 var11 = class180.method1090(class177.field2287, field886.field1271);
            var11.field2345.method3576(arg1);
            var11.field2345.method3508(arg2);
            var11.field2345.method3508(arg3);
            field886.method2059(var11);
        }
        if (arg0 == 2) {
            class180 var12 = class180.method1090(class177.field2240, field886.field1271);
            var12.field2345.method3576(arg1);
            var12.field2345.method3508(arg2);
            var12.field2345.method3508(arg3);
            field886.method2059(var12);
        }
        if (arg0 == 3) {
            class180 var13 = class180.method1090(class177.field2238, field886.field1271);
            var13.field2345.method3576(arg1);
            var13.field2345.method3508(arg2);
            var13.field2345.method3508(arg3);
            field886.method2059(var13);
        }
        if (arg0 == 4) {
            class180 var14 = class180.method1090(class177.field2236, field886.field1271);
            var14.field2345.method3576(arg1);
            var14.field2345.method3508(arg2);
            var14.field2345.method3508(arg3);
            field886.method2059(var14);
        }
        if (arg0 == 5) {
            class180 var15 = class180.method1090(class177.field2303, field886.field1271);
            var15.field2345.method3576(arg1);
            var15.field2345.method3508(arg2);
            var15.field2345.method3508(arg3);
            field886.method2059(var15);
        }
        if (arg0 == 6) {
            class180 var16 = class180.method1090(class177.field2285, field886.field1271);
            var16.field2345.method3576(arg1);
            var16.field2345.method3508(arg2);
            var16.field2345.method3508(arg3);
            field886.method2059(var16);
        }
        if (arg0 == 7) {
            class180 var17 = class180.method1090(class177.field2304, field886.field1271);
            var17.field2345.method3576(arg1);
            var17.field2345.method3508(arg2);
            var17.field2345.method3508(arg3);
            field886.method2059(var17);
        }
        if (arg0 == 8) {
            class180 var18 = class180.method1090(class177.field2233, field886.field1271);
            var18.field2345.method3576(arg1);
            var18.field2345.method3508(arg2);
            var18.field2345.method3508(arg3);
            field886.method2059(var18);
        }
        if (arg0 == 9) {
            class180 var19 = class180.method1090(class177.field2277, field886.field1271);
            var19.field2345.method3576(arg1);
            var19.field2345.method3508(arg2);
            var19.field2345.method3508(arg3);
            field886.method2059(var19);
        }
        if (arg0 != 10) {
            return;
        }
        class180 var20 = class180.method1090(class177.field2260, field886.field1271);
        var20.field2345.method3576(arg1);
        var20.field2345.method3508(arg2);
        var20.field2345.method3508(arg3);
        field886.method2059(var20);
    }

    @ObfuscatedName("r.iq(I)V")
    public static final void method174() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field774 - 1; var1++) {
                if (field770[var1] < 1000 && field770[var1 + 1] > 1000) {
                    String var2 = field804[var1];
                    field804[var1] = field804[var1 + 1];
                    field804[var1 + 1] = var2;
                    String var3 = field635[var1];
                    field635[var1] = field635[var1 + 1];
                    field635[var1 + 1] = var3;
                    int var4 = field770[var1];
                    field770[var1] = field770[var1 + 1];
                    field770[var1 + 1] = var4;
                    int var5 = field767[var1];
                    field767[var1] = field767[var1 + 1];
                    field767[var1 + 1] = var5;
                    int var6 = field769[var1];
                    field769[var1] = field769[var1 + 1];
                    field769[var1 + 1] = var6;
                    int var7 = field687[var1];
                    field687[var1] = field687[var1 + 1];
                    field687[var1 + 1] = var7;
                    boolean var8 = field879[var1];
                    field879[var1] = field879[var1 + 1];
                    field879[var1 + 1] = var8;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("x.im(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method175(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method3398(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("fc.ir(Ljava/lang/String;Ljava/lang/String;IIIIZI)V")
    public static final void method3398(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field766 || field774 >= 500) {
            return;
        }
        field635[field774] = arg0;
        field804[field774] = arg1;
        field770[field774] = arg2;
        field687[field774] = arg3;
        field767[field774] = arg4;
        field769[field774] = arg5;
        field879[field774] = arg6;
        field774++;
    }

    @ObfuscatedName("iz.ie(I)I")
    public static final int method4450() {
        return field774 - 1;
    }

    @ObfuscatedName("i.ic(B)V")
    public static void method146() {
        for (int var0 = 0; var0 < field774; var0++) {
            int var1 = field770[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field774 - 1) {
                    for (int var3 = var0; var3 < field774 - 1; var3++) {
                        field635[var3] = field635[var3 + 1];
                        field804[var3] = field804[var3 + 1];
                        field770[var3] = field770[var3 + 1];
                        field687[var3] = field687[var3 + 1];
                        field767[var3] = field767[var3 + 1];
                        field769[var3] = field769[var3 + 1];
                        field879[var3] = field879[var3 + 1];
                    }
                }
                var0--;
                field774--;
            }
        }
        method4282();
    }

    @ObfuscatedName("fx.iv(IIIIB)V")
    public static final void method3248(int arg0, int arg1, int arg2, int arg3) {
        if (field869 == 0 && !field794) {
            method175(class245.field3027, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        long var4 = -1L;
        long var6 = -1L;
        int var8 = 0;
        while (true) {
            int var10 = class128.field1726;
            if (var8 >= var10) {
                if (var4 != -1L) {
                    int var11 = class128.method4430(var4);
                    int var12 = (int) (var4 >>> 7 & 0x7FL);
                    class67 var14 = field746[field757];
                    method3073(var14, field757, var11, var12);
                }
                return;
            }
            long var15 = class128.method3734(var8);
            if (var6 != var15) {
                label277: {
                    var6 = var15;
                    int var17 = class128.method1942(var8);
                    int var18 = class128.method731(class128.field1731[var8]);
                    int var19 = var18;
                    int var20 = class128.method1929(class128.field1731[var8]);
                    int var22 = class128.method639(var8);
                    if (var20 == 2 && Statics.field185.method2900(Statics.field66, var17, var18, var15) >= 0) {
                        class274 var23 = class274.method4676(var22);
                        if (var23.field3481 != null) {
                            var23 = var23.method4892();
                        }
                        if (var23 == null) {
                            break label277;
                        }
                        if (field869 == 1) {
                            method175(class245.field2956, field784 + " " + class81.field1104 + " " + class81.method268(65535) + var23.field3468, 1, var22, var17, var18);
                        } else if (!field794) {
                            String[] var24 = var23.field3464;
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
                                        method175(var24[var25], class81.method268(65535) + var23.field3468, var26, var22, var17, var19);
                                    }
                                }
                            }
                            method175(class245.field3023, class81.method268(65535) + var23.field3468, 1002, var23.field3447, var17, var19);
                        } else if ((Statics.field532 & 0x4) == 4) {
                            method175(field788, field694 + " " + class81.field1104 + " " + class81.method268(65535) + var23.field3468, 2, var22, var17, var18);
                        }
                    }
                    if (var20 == 1) {
                        class79 var27 = field866[var22];
                        if (var27 == null) {
                            break label277;
                        }
                        if (var27.field1086.field3549 == 1 && (var27.field949 & 0x7F) == 64 && (var27.field922 & 0x7F) == 64) {
                            for (int var28 = 0; var28 < field660; var28++) {
                                class79 var29 = field866[field763[var28]];
                                if (var29 != null && var27 != var29 && var29.field1086.field3549 == 1 && var27.field949 == var29.field949 && var27.field922 == var29.field922) {
                                    method1003(var29.field1086, field763[var28], var17, var19);
                                }
                            }
                            int var30 = class89.field1213;
                            int[] var31 = class89.field1214;
                            for (int var32 = 0; var32 < var30; var32++) {
                                class67 var33 = field746[var31[var32]];
                                if (var33 != null && var27.field949 == var33.field949 && var27.field922 == var33.field922) {
                                    method3073(var33, var31[var32], var17, var19);
                                }
                            }
                        }
                        method1003(var27.field1086, var22, var17, var19);
                    }
                    if (var20 == 0) {
                        class67 var34 = field746[var22];
                        if (var34 == null) {
                            break label277;
                        }
                        if ((var34.field949 & 0x7F) == 64 && (var34.field922 & 0x7F) == 64) {
                            for (int var35 = 0; var35 < field660; var35++) {
                                class79 var36 = field866[field763[var35]];
                                if (var36 != null && var36.field1086.field3549 == 1 && var34.field949 == var36.field949 && var34.field922 == var36.field922) {
                                    method1003(var36.field1086, field763[var35], var17, var19);
                                }
                            }
                            int var37 = class89.field1213;
                            int[] var38 = class89.field1214;
                            for (int var39 = 0; var39 < var37; var39++) {
                                class67 var40 = field746[var38[var39]];
                                if (var40 != null && var34 != var40 && var34.field949 == var40.field949 && var34.field922 == var40.field922) {
                                    method3073(var40, var38[var39], var17, var19);
                                }
                            }
                        }
                        if (field757 == var22) {
                            var4 = var15;
                        } else {
                            method3073(var34, var22, var17, var19);
                        }
                    }
                    if (var20 == 3) {
                        class213 var41 = field758[Statics.field66][var17][var19];
                        if (var41 != null) {
                            for (class87 var42 = (class87) var41.method4003(); var42 != null; var42 = (class87) var41.method3989()) {
                                class275 var43 = class275.method4283(var42.field1202);
                                if (field869 == 1) {
                                    method175(class245.field2956, field784 + " " + class81.field1104 + " " + class81.method268(16748608) + var43.field3523, 16, var42.field1202, var17, var19);
                                } else if (!field794) {
                                    String[] var44 = var43.field3537;
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
                                            method175(var44[var45], class81.method268(16748608) + var43.field3523, var46, var42.field1202, var17, var19);
                                        } else if (var45 == 2) {
                                            method175(class245.field2869, class81.method268(16748608) + var43.field3523, 20, var42.field1202, var17, var19);
                                        }
                                    }
                                    method175(class245.field3023, class81.method268(16748608) + var43.field3523, 1004, var42.field1202, var17, var19);
                                } else if ((Statics.field532 & 0x1) == 1) {
                                    method175(field788, field694 + " " + class81.field1104 + " " + class81.method268(16748608) + var43.field3523, 17, var42.field1202, var17, var19);
                                }
                            }
                        }
                    }
                }
            }
            var8++;
        }
    }

    @ObfuscatedName("bj.ik(Ljx;IIII)V")
    public static final void method1003(class277 arg0, int arg1, int arg2, int arg3) {
        if (field774 >= 400) {
            return;
        }
        if (arg0.field3574 != null) {
            arg0 = arg0.method4976();
        }
        if (arg0 == null || !arg0.field3582 || arg0.field3584 && field800 != arg1) {
            return;
        }
        String var4 = arg0.field3554;
        if (arg0.field3551 != 0) {
            var4 = var4 + method1054(arg0.field3551, Statics.field218.field597) + " " + class81.field1102 + class245.field3013 + arg0.field3551 + class81.field1100;
        }
        if (arg0.field3584 && field701) {
            method175(class245.field3023, class81.method268(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field869 == 1) {
            method175(class245.field2956, field784 + " " + class81.field1104 + " " + class81.method268(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field794) {
            int var5 = arg0.field3584 && field701 ? 2000 : 0;
            String[] var6 = arg0.field3569;
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].equalsIgnoreCase(class245.field3080)) {
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
                        method175(var6[var7], class81.method268(16776960) + var4, var8, arg1, arg2, arg3);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].equalsIgnoreCase(class245.field3080)) {
                        short var10 = 0;
                        if (field715 != class84.field1130) {
                            if (field715 == class84.field1129 || field715 == class84.field1131 && arg0.field3551 > Statics.field218.field597) {
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
                            method175(var6[var9], class81.method268(16776960) + var4, var11, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3584 || !field701) {
                method175(class245.field3023, class81.method268(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field532 & 0x2) == 2) {
            method175(field788, field694 + " " + class81.field1104 + " " + class81.method268(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ec.iy(Lbs;IIII)V")
    public static final void method3073(class67 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field218 == arg0 || field774 >= 400) {
            return;
        }
        String var4;
        if (arg0.field599 == 0) {
            var4 = arg0.field611[0] + arg0.field595 + arg0.field611[1] + method1054(arg0.field597, Statics.field218.field597) + " " + class81.field1102 + class245.field3013 + arg0.field597 + class81.field1100 + arg0.field611[2];
        } else {
            var4 = arg0.field611[0] + arg0.field595 + arg0.field611[1] + " " + class81.field1102 + class245.field3068 + arg0.field599 + class81.field1100 + arg0.field611[2];
        }
        if (field869 == 1) {
            method175(class245.field2956, field784 + " " + class81.field1104 + " " + class81.method268(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field794) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field754[var5] != null) {
                    short var6 = 0;
                    if (field754[var5].equalsIgnoreCase(class245.field3080)) {
                        if (field657 == class84.field1130) {
                            continue;
                        }
                        if (field657 == class84.field1129 || field657 == class84.field1131 && arg0.field597 > Statics.field218.field597) {
                            var6 = 2000;
                        }
                        if (Statics.field218.field616 != 0 && arg0.field616 != 0) {
                            if (Statics.field218.field616 == arg0.field616) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field755[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field753[var5] + var6;
                    method175(field754[var5], class81.method268(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field532 & 0x8) == 8) {
            method175(field788, field694 + " " + class81.field1104 + " " + class81.method268(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field774; var9++) {
            if (field770[var9] == 23) {
                field804[var9] = class81.method268(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("bo.ih(III)Ljava/lang/String;")
    public static final String method1054(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class81.method268(16711680);
        } else if (var2 < -6) {
            return class81.method268(16723968);
        } else if (var2 < -3) {
            return class81.method268(16740352);
        } else if (var2 < 0) {
            return class81.method268(16756736);
        } else if (var2 > 9) {
            return class81.method268(65280);
        } else if (var2 > 6) {
            return class81.method268(4259584);
        } else if (var2 > 3) {
            return class81.method268(8453888);
        } else if (var2 > 0) {
            return class81.method268(12648192);
        } else {
            return class81.method268(16776960);
        }
    }

    @ObfuscatedName("ax.ia(IIIIIIIII)V")
    public static final void method707(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class238.method501(arg0)) {
            Statics.field555 = null;
            method5436(Statics.field2357[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field555 != null) {
                method5436(Statics.field555, -1412584499, arg1, arg2, arg3, arg4, Statics.field1119, Statics.field110, arg7);
                Statics.field555 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field835[var8] = true;
            }
        } else {
            field835[arg7] = true;
        }
    }

    @ObfuscatedName("ki.ix([Liq;IIIIIIIIB)V")
    public static final void method5436(class238[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class323.method5632(arg2, arg3, arg4, arg5);
        class130.method2785();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class238 var10 = arg0[var9];
            if (var10 != null && (var10.field2812 == arg1 || arg1 == -1412584499 && field823 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field838[field833] = var10.field2686 + arg6;
                    field839[field833] = var10.field2787 + arg7;
                    field840[field833] = var10.field2692;
                    field841[field833] = var10.field2807;
                    var11 = ++field833 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2811 = var11;
                var10.field2701 = field899;
                if (!var10.field2672 || !method3725(var10)) {
                    if (var10.field2677 > 0) {
                        method480(var10);
                    }
                    int var12 = var10.field2686 + arg6;
                    int var13 = var10.field2787 + arg7;
                    int var14 = var10.field2704;
                    if (field823 == var10) {
                        if (arg1 != -1412584499 && !var10.field2758) {
                            Statics.field555 = arg0;
                            Statics.field1119 = arg6;
                            Statics.field110 = arg7;
                            continue;
                        }
                        if (field814 && field808) {
                            int var15 = class54.field468;
                            int var16 = class54.field475 * 30622073;
                            int var17 = var15 - field634;
                            int var18 = var16 - field806;
                            if (var17 < field704) {
                                var17 = field704;
                            }
                            if (var10.field2692 + var17 > field704 + field836.field2692) {
                                var17 = field704 + field836.field2692 - var10.field2692;
                            }
                            if (var18 < field810) {
                                var18 = field810;
                            }
                            if (var10.field2807 + var18 > field810 + field836.field2807) {
                                var18 = field810 + field836.field2807 - var10.field2807;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2758) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2675 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2675 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2692 + var12;
                        int var26 = var10.field2807 + var13;
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
                        int var29 = var10.field2692 + var12;
                        int var30 = var10.field2807 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2672 || var19 < var21 && var20 < var22) {
                        if (var10.field2677 != 0) {
                            if (var10.field2677 == 1336) {
                                if (field647) {
                                    var13 += 15;
                                    Statics.field2620.method5339("Fps:" + field434, var10.field2692 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 327680 && !field826) {
                                        var33 = 16711680;
                                    }
                                    Statics.field2620.method5339("Mem:" + var32 + "k", var10.field2692 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2677 == 1337) {
                                field843 = var12;
                                field780 = var13;
                                method1582(var12, var13, var10.field2692, var10.field2807);
                                field835[var10.field2811] = true;
                                class323.method5632(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2677 == 1338) {
                                method706(var10, var12, var13, var11);
                                class323.method5632(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2677 == 1339) {
                                method3423(var10, var12, var13, var11);
                                class323.method5632(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2677 == 1400) {
                                Statics.field533.method5885(var12, var13, var10.field2692, var10.field2807, field899);
                            }
                            if (var10.field2677 == 1401) {
                                Statics.field533.method5866(var12, var13, var10.field2692, var10.field2807);
                            }
                        }
                        if (var10.field2675 == 0) {
                            if (!var10.field2672 && method3725(var10) && Statics.field1777 != var10) {
                                continue;
                            }
                            if (!var10.field2672) {
                                if (var10.field2695 > var10.field2735 - var10.field2807) {
                                    var10.field2695 = var10.field2735 - var10.field2807;
                                }
                                if (var10.field2695 < 0) {
                                    var10.field2695 = 0;
                                }
                            }
                            method5436(arg0, var10.field2699, var19, var20, var21, var22, var12 - var10.field2694, var13 - var10.field2695, var11);
                            if (var10.field2810 != null) {
                                method5436(var10.field2810, var10.field2699, var19, var20, var21, var22, var12 - var10.field2694, var13 - var10.field2695, var11);
                            }
                            class62 var34 = (class62) field693.method3934((long) var10.field2699);
                            if (var34 != null) {
                                method707(var34.field554, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class323.method5632(arg2, arg3, arg4, arg5);
                            class130.method2785();
                        }
                        if (field844 || field837[var11] || field842 > 1) {
                            if (var10.field2675 == 0 && !var10.field2672 && var10.field2735 > var10.field2807) {
                                method228(var10.field2692 + var12, var13, var10.field2695, var10.field2807, var10.field2735);
                            }
                            if (var10.field2675 != 1) {
                                if (var10.field2675 == 2) {
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < var10.field2716; var36++) {
                                        for (int var37 = 0; var37 < var10.field2789; var37++) {
                                            int var38 = (var10.field2740 + 32) * var37 + var12;
                                            int var39 = (var10.field2809 + 32) * var36 + var13;
                                            if (var35 < 20) {
                                                var38 += var10.field2742[var35];
                                                var39 += var10.field2743[var35];
                                            }
                                            if (var10.field2798[var35] > 0) {
                                                boolean var40 = false;
                                                boolean var41 = false;
                                                int var42 = var10.field2798[var35] - 1;
                                                if (var38 + 32 > arg2 && var38 < arg4 && var39 + 32 > arg3 && var39 < arg5 || Statics.field409 == var10 && field738 == var35) {
                                                    class327 var43;
                                                    if (field869 == 1 && Statics.field3219 == var35 && Statics.field399 == var10.field2699) {
                                                        var43 = class275.method55(var42, var10.field2799[var35], 2, 0, 2, false);
                                                    } else {
                                                        var43 = class275.method55(var42, var10.field2799[var35], 1, 3153952, 2, false);
                                                    }
                                                    if (var43 == null) {
                                                        method649(var10);
                                                    } else if (Statics.field409 == var10 && field738 == var35) {
                                                        int var44 = class54.field468 - field739;
                                                        int var45 = class54.field475 * 30622073 - field830;
                                                        if (var44 < 5 && var44 > -5) {
                                                            var44 = 0;
                                                        }
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (field743 < 5) {
                                                            var44 = 0;
                                                            var45 = 0;
                                                        }
                                                        var43.method5704(var38 + var44, var39 + var45, 128);
                                                        if (arg1 != -1) {
                                                            class238 var46 = arg0[arg1 & 0xFFFF];
                                                            if (var39 + var45 < class323.field3857 && var46.field2695 > 0) {
                                                                int var47 = field691 * (class323.field3857 - var39 - var45) / 3;
                                                                if (var47 > field691 * 10) {
                                                                    var47 = field691 * 10;
                                                                }
                                                                if (var47 > var46.field2695) {
                                                                    var47 = var46.field2695;
                                                                }
                                                                var46.field2695 -= var47;
                                                                field830 += var47;
                                                                method649(var46);
                                                            }
                                                            if (var39 + var45 + 32 > class323.field3856 && var46.field2695 < var46.field2735 - var46.field2807) {
                                                                int var48 = field691 * (var39 + var45 + 32 - class323.field3856) / 3;
                                                                if (var48 > field691 * 10) {
                                                                    var48 = field691 * 10;
                                                                }
                                                                if (var48 > var46.field2735 - var46.field2807 - var46.field2695) {
                                                                    var48 = var46.field2735 - var46.field2807 - var46.field2695;
                                                                }
                                                                var46.field2695 += var48;
                                                                field830 -= var48;
                                                                method649(var46);
                                                            }
                                                        }
                                                    } else if (Statics.field62 == var10 && field737 == var35) {
                                                        var43.method5704(var38, var39, 128);
                                                    } else {
                                                        var43.method5742(var38, var39);
                                                    }
                                                }
                                            } else if (var10.field2794 != null && var35 < 20) {
                                                class327 var49 = var10.method4381(var35);
                                                if (var49 != null) {
                                                    var49.method5742(var38, var39);
                                                } else if (class238.field2671) {
                                                    method649(var10);
                                                }
                                            }
                                            var35++;
                                        }
                                    }
                                } else if (var10.field2675 == 3) {
                                    int var50;
                                    if (method3078(var10)) {
                                        var50 = var10.field2802;
                                        if (Statics.field1777 == var10 && var10.field2703 != 0) {
                                            var50 = var10.field2703;
                                        }
                                    } else {
                                        var50 = var10.field2698;
                                        if (Statics.field1777 == var10 && var10.field2700 != 0) {
                                            var50 = var10.field2700;
                                        }
                                    }
                                    if (var10.field2702) {
                                        switch(var10.field2747.field3868) {
                                            case 1:
                                                class323.method5601(var12, var13, var10.field2692, var10.field2807, var10.field2698, var10.field2802);
                                                break;
                                            case 2:
                                                class323.method5615(var12, var13, var10.field2692, var10.field2807, var10.field2698, var10.field2802, 255 - (var10.field2704 & 0xFF), 255 - (var10.field2705 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class323.method5630(var12, var13, var10.field2692, var10.field2807, var50);
                                                } else {
                                                    class323.method5589(var12, var13, var10.field2692, var10.field2807, var50, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class323.method5604(var12, var13, var10.field2692, var10.field2807, var50);
                                    } else {
                                        class323.method5605(var12, var13, var10.field2692, var10.field2807, var50, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2675 == 4) {
                                    class304 var51 = var10.method4380();
                                    if (var51 != null) {
                                        String var52 = var10.field2734;
                                        int var53;
                                        if (method3078(var10)) {
                                            var53 = var10.field2802;
                                            if (Statics.field1777 == var10 && var10.field2703 != 0) {
                                                var53 = var10.field2703;
                                            }
                                            if (var10.field2708.length() > 0) {
                                                var52 = var10.field2708;
                                            }
                                        } else {
                                            var53 = var10.field2698;
                                            if (Statics.field1777 == var10 && var10.field2700 != 0) {
                                                var53 = var10.field2700;
                                            }
                                        }
                                        if (var10.field2672 && var10.field2800 != -1) {
                                            class275 var54 = class275.method4283(var10.field2800);
                                            var52 = var54.field3523;
                                            if (var52 == null) {
                                                var52 = class245.field2894;
                                            }
                                            if ((var54.field3510 == 1 || var10.field2801 != 1) && var10.field2801 != -1) {
                                                var52 = class81.method268(16748608) + var52 + class81.field1099 + " " + 'x' + Statics.method3715(var10.field2801);
                                            }
                                        }
                                        if (field655 == var10) {
                                            var52 = class245.field3030;
                                            var53 = var10.field2698;
                                        }
                                        if (!var10.field2672) {
                                            var52 = method230(var52, var10);
                                        }
                                        var51.method5341(var52, var12, var13, var10.field2692, var10.field2807, var53, var10.field2732 ? 0 : -1, var10.field2737, var10.field2738, var10.field2736);
                                    } else if (class238.field2671) {
                                        method649(var10);
                                    }
                                } else if (var10.field2675 == 5) {
                                    if (var10.field2672) {
                                        class327 var56;
                                        if (var10.field2800 == -1) {
                                            var56 = var10.method4398(false);
                                        } else {
                                            var56 = class275.method55(var10.field2800, var10.field2801, var10.field2712, var10.field2713, var10.field2724, false);
                                        }
                                        if (var56 != null) {
                                            int var57 = var56.field3886;
                                            int var58 = var56.field3884;
                                            if (var10.field2803) {
                                                class323.method5593(var12, var13, var10.field2692 + var12, var10.field2807 + var13);
                                                int var59 = (var10.field2692 + (var57 - 1)) / var57;
                                                int var60 = (var10.field2807 + (var58 - 1)) / var58;
                                                for (int var61 = 0; var61 < var59; var61++) {
                                                    for (int var62 = 0; var62 < var60; var62++) {
                                                        if (var10.field2761 != 0) {
                                                            var56.method5796(var57 / 2 + var57 * var61 + var12, var58 / 2 + var58 * var62 + var13, var10.field2761, 4096);
                                                        } else if (var14 == 0) {
                                                            var56.method5742(var57 * var61 + var12, var58 * var62 + var13);
                                                        } else {
                                                            var56.method5704(var57 * var61 + var12, var58 * var62 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class323.method5632(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var63 = var10.field2692 * 4096 / var57;
                                                if (var10.field2761 != 0) {
                                                    var56.method5796(var10.field2692 / 2 + var12, var10.field2807 / 2 + var13, var10.field2761, var63);
                                                } else if (var14 != 0) {
                                                    var56.method5712(var12, var13, var10.field2692, var10.field2807, 256 - (var14 & 0xFF));
                                                } else if (var10.field2692 == var57 && var10.field2807 == var58) {
                                                    var56.method5742(var12, var13);
                                                } else {
                                                    var56.method5700(var12, var13, var10.field2692, var10.field2807);
                                                }
                                            }
                                        } else if (class238.field2671) {
                                            method649(var10);
                                        }
                                    } else {
                                        class327 var55 = var10.method4398(method3078(var10));
                                        if (var55 != null) {
                                            var55.method5742(var12, var13);
                                        } else if (class238.field2671) {
                                            method649(var10);
                                        }
                                    }
                                } else if (var10.field2675 == 6) {
                                    boolean var64 = method3078(var10);
                                    int var65;
                                    if (var64) {
                                        var65 = var10.field2721;
                                    } else {
                                        var65 = var10.field2768;
                                    }
                                    class127 var66 = null;
                                    int var67 = 0;
                                    if (var10.field2800 != -1) {
                                        class275 var68 = class275.method4283(var10.field2800);
                                        if (var68 != null) {
                                            class275 var69 = var68.method4924(var10.field2801);
                                            var66 = var69.method4928(1);
                                            if (var66 == null) {
                                                method649(var10);
                                            } else {
                                                var66.method2676();
                                                var67 = var66.field1860 / 2;
                                            }
                                        }
                                    } else if (var10.field2795 == 5) {
                                        if (var10.field2717 == 0) {
                                            var66 = field671.method4348((class279) null, -1, (class279) null, -1);
                                        } else {
                                            var66 = Statics.field218.method1101();
                                        }
                                    } else if (var65 == -1) {
                                        var66 = var10.method4382((class279) null, -1, var64, Statics.field218.field593);
                                        if (var66 == null && class238.field2671) {
                                            method649(var10);
                                        }
                                    } else {
                                        class279 var70 = class279.method2783(var65);
                                        var66 = var10.method4382(var70, var10.field2760, var64, Statics.field218.field593);
                                        if (var66 == null && class238.field2671) {
                                            method649(var10);
                                        }
                                    }
                                    class130.method2832(var10.field2692 / 2 + var12, var10.field2807 / 2 + var13);
                                    int var71 = var10.field2727 * class130.field1768[var10.field2730] >> 16;
                                    int var72 = var10.field2727 * class130.field1769[var10.field2730] >> 16;
                                    if (var66 != null) {
                                        if (var10.field2672) {
                                            var66.method2676();
                                            if (var10.field2685) {
                                                var66.method2690(0, var10.field2725, var10.field2726, var10.field2730, var10.field2722, var10.field2723 + var67 + var71, var10.field2723 + var72, var10.field2727);
                                            } else {
                                                var66.method2734(0, var10.field2725, var10.field2726, var10.field2730, var10.field2722, var10.field2723 + var67 + var71, var10.field2723 + var72);
                                            }
                                        } else {
                                            var66.method2734(0, var10.field2725, 0, var10.field2730, 0, var71, var72);
                                        }
                                    }
                                    class130.method2787();
                                } else {
                                    if (var10.field2675 == 7) {
                                        class304 var73 = var10.method4380();
                                        if (var73 == null) {
                                            if (class238.field2671) {
                                                method649(var10);
                                            }
                                            continue;
                                        }
                                        int var74 = 0;
                                        for (int var75 = 0; var75 < var10.field2716; var75++) {
                                            for (int var76 = 0; var76 < var10.field2789; var76++) {
                                                if (var10.field2798[var74] > 0) {
                                                    class275 var77 = class275.method4283(var10.field2798[var74] - 1);
                                                    String var78;
                                                    if (var77.field3510 != 1 && var10.field2799[var74] == 1) {
                                                        var78 = class81.method268(16748608) + var77.field3523 + class81.field1099;
                                                    } else {
                                                        var78 = class81.method268(16748608) + var77.field3523 + class81.field1099 + " " + 'x' + Statics.method3715(var10.field2799[var74]);
                                                    }
                                                    int var79 = (var10.field2740 + 115) * var76 + var12;
                                                    int var80 = (var10.field2809 + 12) * var75 + var13;
                                                    if (var10.field2737 == 0) {
                                                        var73.method5337(var78, var79, var80, var10.field2698, var10.field2732 ? 0 : -1);
                                                    } else if (var10.field2737 == 1) {
                                                        var73.method5340(var78, var10.field2692 / 2 + var79, var80, var10.field2698, var10.field2732 ? 0 : -1);
                                                    } else {
                                                        var73.method5339(var78, var10.field2692 + var79 - 1, var80, var10.field2698, var10.field2732 ? 0 : -1);
                                                    }
                                                }
                                                var74++;
                                            }
                                        }
                                    }
                                    if (var10.field2675 == 8 && Statics.field1268 == var10 && field781 == field629) {
                                        int var81 = 0;
                                        int var82 = 0;
                                        class304 var83 = Statics.field2620;
                                        String var84 = var10.field2734;
                                        String var85 = method230(var84, var10);
                                        while (var85.length() > 0) {
                                            int var86 = var85.indexOf(class81.field1105);
                                            String var87;
                                            if (var86 == -1) {
                                                var87 = var85;
                                                var85 = "";
                                            } else {
                                                var87 = var85.substring(0, var86);
                                                var85 = var85.substring(var86 + 4);
                                            }
                                            int var88 = var83.method5345(var87);
                                            if (var88 > var81) {
                                                var81 = var88;
                                            }
                                            var82 += var83.field3758 + 1;
                                        }
                                        var81 += 6;
                                        var82 += 7;
                                        int var89 = var10.field2692 + var12 - 5 - var81;
                                        int var90 = var10.field2807 + var13 + 5;
                                        if (var89 < var12 + 5) {
                                            var89 = var12 + 5;
                                        }
                                        if (var81 + var89 > arg4) {
                                            var89 = arg4 - var81;
                                        }
                                        if (var82 + var90 > arg5) {
                                            var90 = arg5 - var82;
                                        }
                                        class323.method5630(var89, var90, var81, var82, 16777120);
                                        class323.method5604(var89, var90, var81, var82, 0);
                                        String var91 = var10.field2734;
                                        int var92 = var83.field3758 + var90 + 2;
                                        String var93 = method230(var91, var10);
                                        while (var93.length() > 0) {
                                            int var94 = var93.indexOf(class81.field1105);
                                            String var95;
                                            if (var94 == -1) {
                                                var95 = var93;
                                                var93 = "";
                                            } else {
                                                var95 = var93.substring(0, var94);
                                                var93 = var93.substring(var94 + 4);
                                            }
                                            var83.method5337(var95, var89 + 3, var92, 0, -1);
                                            var92 += var83.field3758 + 1;
                                        }
                                    }
                                    if (var10.field2675 == 9) {
                                        int var96;
                                        int var97;
                                        int var98;
                                        int var99;
                                        if (var10.field2707) {
                                            var96 = var12;
                                            var97 = var10.field2807 + var13;
                                            var98 = var10.field2692 + var12;
                                            var99 = var13;
                                        } else {
                                            var96 = var12;
                                            var97 = var13;
                                            var98 = var10.field2692 + var12;
                                            var99 = var10.field2807 + var13;
                                        }
                                        if (var10.field2706 == 1) {
                                            class323.method5610(var96, var97, var98, var99, var10.field2698);
                                        } else {
                                            method514(var96, var97, var98, var99, var10.field2698, var10.field2706);
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

    @ObfuscatedName("ak.il(IIIIIIB)V")
    public static final void method514(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class323.field3859;
        int var18 = arg1 - class323.field3857;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class130.method2793(var19, var20, var21);
        class130.method2795(var23, var24, var25, var19, var20, var21, arg4);
        class130.method2793(var19, var21, var22);
        class130.method2795(var23, var25, var26, var19, var21, var22, arg4);
    }

    @ObfuscatedName("o.in(Ljava/lang/String;Liq;B)Ljava/lang/String;")
    public static String method230(String arg0, class238 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method1050(method282(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
        }
        return arg0;
    }

    @ObfuscatedName("client.iz(ZI)V")
    public final void method1164(boolean arg0) {
        Statics.method1047(field790, Statics.field1878, Statics.field442, arg0);
    }

    @ObfuscatedName("client.ib(Liq;I)V")
    public void method1165(class238 arg0) {
        class238 var2 = arg0.field2812 == -1 ? null : class238.method2289(arg0.field2812);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field1878;
            var4 = Statics.field442;
        } else {
            var3 = var2.field2692;
            var4 = var2.field2807;
        }
        method1592(arg0, var3, var4, false);
        Statics.method1944(arg0, var3, var4);
    }

    @ObfuscatedName("jj.ij([Liq;Liq;ZI)V")
    public static void method5028(class238[] arg0, class238 arg1, boolean arg2) {
        int var3 = arg1.field2696 == 0 ? arg1.field2692 : arg1.field2696;
        int var4 = arg1.field2735 == 0 ? arg1.field2807 : arg1.field2735;
        method22(arg0, arg1.field2699, var3, var4, arg2);
        if (arg1.field2810 != null) {
            method22(arg1.field2810, arg1.field2699, var3, var4, arg2);
        }
        class62 var5 = (class62) field693.method3934((long) arg1.field2699);
        if (var5 != null) {
            Statics.method1047(var5.field554, var3, var4, arg2);
        }
        if (arg1.field2677 == 1337) {
        }
    }

    @ObfuscatedName("g.it([Liq;IIIZI)V")
    public static void method22(class238[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class238 var6 = arg0[var5];
            if (var6 != null && var6.field2812 == arg1) {
                method1592(var6, arg2, arg3, arg4);
                Statics.method1944(var6, arg2, arg3);
                if (var6.field2694 > var6.field2696 - var6.field2692) {
                    var6.field2694 = var6.field2696 - var6.field2692;
                }
                if (var6.field2694 < 0) {
                    var6.field2694 = 0;
                }
                if (var6.field2695 > var6.field2735 - var6.field2807) {
                    var6.field2695 = var6.field2735 - var6.field2807;
                }
                if (var6.field2695 < 0) {
                    var6.field2695 = 0;
                }
                if (var6.field2675 == 0) {
                    method5028(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("bb.if(Liq;IIZB)V")
    public static void method1592(class238 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2692;
        int var5 = arg0.field2807;
        if (arg0.field2680 == 0) {
            arg0.field2692 = arg0.field2789;
        } else if (arg0.field2680 == 1) {
            arg0.field2692 = arg1 - arg0.field2789;
        } else if (arg0.field2680 == 2) {
            arg0.field2692 = arg0.field2789 * arg1 >> 14;
        }
        if (arg0.field2681 == 0) {
            arg0.field2807 = arg0.field2716;
        } else if (arg0.field2681 == 1) {
            arg0.field2807 = arg2 - arg0.field2716;
        } else if (arg0.field2681 == 2) {
            arg0.field2807 = arg0.field2716 * arg2 >> 14;
        }
        if (arg0.field2680 == 4) {
            arg0.field2692 = arg0.field2807 * arg0.field2687 / arg0.field2673;
        }
        if (arg0.field2681 == 4) {
            arg0.field2807 = arg0.field2692 * arg0.field2673 / arg0.field2687;
        }
        if (arg0.field2677 == 1337) {
            field802 = arg0;
        }
        if (arg3 && arg0.field2670 != null && (arg0.field2692 != var4 || arg0.field2807 != var5)) {
            class63 var6 = new class63();
            var6.field559 = arg0;
            var6.field560 = arg0.field2670;
            field829.method3981(var6);
        }
    }

    @ObfuscatedName("bk.ig(Liq;IIIIIIB)V")
    public static final void method1077(class238 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field728) {
            field698 = 32;
        } else {
            field698 = 0;
        }
        field728 = false;
        if (class54.field469 == 1 || !Statics.field98 && class54.field469 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2695 -= 4;
                method649(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2695 += 4;
                method649(arg0);
            } else if (arg5 >= arg1 - field698 && arg5 < field698 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2695 = (arg4 - arg3) * var8 / var9;
                method649(arg0);
                field728 = true;
            }
        }
        if (field672 == 0) {
            return;
        }
        int var10 = arg0.field2692;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2695 += field672 * 45;
            method649(arg0);
        }
    }

    @ObfuscatedName("o.iu(IIIIII)V")
    public static final void method228(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field697[0].method5666(arg0, arg1);
        Statics.field697[1].method5666(arg0, arg1 + arg3 - 16);
        class323.method5630(arg0, arg1 + 16, 16, arg3 - 32, field692);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class323.method5630(arg0, arg1 + 16 + var6, 16, var5, field782);
        class323.method5599(arg0, arg1 + 16 + var6, var5, field652);
        class323.method5599(arg0 + 1, arg1 + 16 + var6, var5, field652);
        class323.method5652(arg0, arg1 + 16 + var6, 16, field652);
        class323.method5652(arg0, arg1 + 17 + var6, 16, field652);
        class323.method5599(arg0 + 15, arg1 + 16 + var6, var5, field695);
        class323.method5599(arg0 + 14, arg1 + 17 + var6, var5 - 1, field695);
        class323.method5652(arg0, arg1 + 15 + var6 + var5, 16, field695);
        class323.method5652(arg0 + 1, arg1 + 14 + var6 + var5, 15, field695);
    }

    @ObfuscatedName("bo.jb(II)Ljava/lang/String;")
    public static final String method1050(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("ev.jy(Liq;I)Z")
    public static final boolean method3078(class238 arg0) {
        if (arg0.field2785 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2785.length; var1++) {
            int var2 = method282(arg0, var1);
            int var3 = arg0.field2777[var1];
            if (arg0.field2785[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2785[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2785[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("w.je(Liq;II)I")
    public static final int method282(class238 arg0, int arg1) {
        if (arg0.field2792 == null || arg1 >= arg0.field2792.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2792[arg1];
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
                    var7 = field762[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field632[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field764[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class238 var11 = class238.method2289(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class275.method4283(var12).field3512 || field851)) {
                        for (int var13 = 0; var13 < var11.field2798.length; var13++) {
                            if (var12 + 1 == var11.field2798[var13]) {
                                var7 += var11.field2799[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class233.field2632[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class242.field2854[field632[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class233.field2632[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field218.field597;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class242.field2859[var14]) {
                            var7 += field632[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class238 var17 = class238.method2289(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class275.method4283(var18).field3512 || field851)) {
                        for (int var19 = 0; var19 < var17.field2798.length; var19++) {
                            if (var18 + 1 == var17.field2798[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field760;
                }
                if (var6 == 12) {
                    var7 = field798;
                }
                if (var6 == 13) {
                    int var20 = class233.field2632[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class233.method4441(var22);
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
                    var7 = (Statics.field218.field949 >> 7) + Statics.field512;
                }
                if (var6 == 19) {
                    var7 = (Statics.field218.field922 >> 7) + Statics.field318;
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

    @ObfuscatedName("fa.ja(Liq;Ljz;IIZI)V")
    public static final void method3393(class238 arg0, class275 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field3514;
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
            var7 = class245.field2870;
        }
        if (var6 != -1 && var7 != null) {
            method3398(var7, class81.method268(16748608) + arg1.field3523, var6, arg1.field3520, arg2, arg0.field2699, arg4);
        }
    }

    @ObfuscatedName("bv.jm(Liq;IIB)V")
    public static final void method1033(class238 arg0, int arg1, int arg2) {
        if (arg0.field2676 == 1) {
            method175(arg0.field2797, "", 24, 0, 0, arg0.field2699);
        }
        if (arg0.field2676 == 2 && !field794) {
            String var3 = method933(arg0);
            if (var3 != null) {
                method175(var3, class81.method268(65280) + arg0.field2796, 25, 0, -1, arg0.field2699);
            }
        }
        if (arg0.field2676 == 3) {
            method175(class245.field3076, "", 26, 0, 0, arg0.field2699);
        }
        if (arg0.field2676 == 4) {
            method175(arg0.field2797, "", 28, 0, 0, arg0.field2699);
        }
        if (arg0.field2676 == 5) {
            method175(arg0.field2797, "", 29, 0, 0, arg0.field2699);
        }
        if (arg0.field2676 == 6 && field655 == null) {
            method175(arg0.field2797, "", 30, 0, -1, arg0.field2699);
        }
        if (arg0.field2675 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2807; var5++) {
                for (int var6 = 0; var6 < arg0.field2692; var6++) {
                    int var7 = (arg0.field2740 + 32) * var6;
                    int var8 = (arg0.field2809 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2742[var4];
                        var8 += arg0.field2743[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field741 = var4;
                        Statics.field220 = arg0;
                        if (arg0.field2798[var4] > 0) {
                            class275 var9 = class275.method4283(arg0.field2798[var4] - 1);
                            if (field869 == 1 && class239.method3775(method2756(arg0))) {
                                if (Statics.field399 != arg0.field2699 || Statics.field3219 != var4) {
                                    method175(class245.field2956, field784 + " " + class81.field1104 + " " + class81.method268(16748608) + var9.field3523, 31, var9.field3520, var4, arg0.field2699);
                                }
                            } else if (!field794 || !class239.method3775(method2756(arg0))) {
                                String[] var10 = var9.field3514;
                                int var11 = -1;
                                if (field776 && method1643()) {
                                    var11 = var9.method4939();
                                }
                                if (class239.method3775(method2756(arg0))) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != var12) {
                                            method3393(arg0, var9, var4, var12, false);
                                        }
                                    }
                                }
                                if (class239.method999(method2756(arg0))) {
                                    method175(class245.field2956, class81.method268(16748608) + var9.field3523, 38, var9.field3520, var4, arg0.field2699);
                                }
                                if (class239.method3775(method2756(arg0))) {
                                    for (int var13 = 2; var13 >= 0; var13--) {
                                        if (var11 != var13) {
                                            method3393(arg0, var9, var4, var13, false);
                                        }
                                    }
                                    if (var11 >= 0) {
                                        method3393(arg0, var9, var4, var11, true);
                                    }
                                }
                                String[] var14 = arg0.field2689;
                                if (var14 != null) {
                                    for (int var15 = 4; var15 >= 0; var15--) {
                                        if (var14[var15] != null) {
                                            byte var16 = 0;
                                            if (var15 == 0) {
                                                var16 = 39;
                                            }
                                            if (var15 == 1) {
                                                var16 = 40;
                                            }
                                            if (var15 == 2) {
                                                var16 = 41;
                                            }
                                            if (var15 == 3) {
                                                var16 = 42;
                                            }
                                            if (var15 == 4) {
                                                var16 = 43;
                                            }
                                            method175(var14[var15], class81.method268(16748608) + var9.field3523, var16, var9.field3520, var4, arg0.field2699);
                                        }
                                    }
                                }
                                method175(class245.field3023, class81.method268(16748608) + var9.field3523, 1005, var9.field3520, var4, arg0.field2699);
                            } else if ((Statics.field532 & 0x10) == 16) {
                                method175(field788, field694 + " " + class81.field1104 + " " + class81.method268(16748608) + var9.field3523, 32, var9.field3520, var4, arg0.field2699);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2672) {
            return;
        }
        if (!field794) {
            for (int var17 = 9; var17 >= 5; var17--) {
                int var18 = method2756(arg0);
                boolean var19 = (var18 >> var17 + 1 & 0x1) != 0;
                String var20;
                if (!var19 && arg0.field2793 == null) {
                    var20 = null;
                } else if (arg0.field2754 == null || arg0.field2754.length <= var17 || arg0.field2754[var17] == null || arg0.field2754[var17].trim().length() == 0) {
                    var20 = null;
                } else {
                    var20 = arg0.field2754[var17];
                }
                if (var20 != null) {
                    method175(var20, arg0.field2753, 1007, var17 + 1, arg0.field2674, arg0.field2699);
                }
            }
            String var22 = method933(arg0);
            if (var22 != null) {
                method175(var22, arg0.field2753, 25, 0, arg0.field2674, arg0.field2699);
            }
            for (int var23 = 4; var23 >= 0; var23--) {
                int var24 = method2756(arg0);
                boolean var25 = (var24 >> var23 + 1 & 0x1) != 0;
                String var26;
                if (!var25 && arg0.field2793 == null) {
                    var26 = null;
                } else if (arg0.field2754 == null || arg0.field2754.length <= var23 || arg0.field2754[var23] == null || arg0.field2754[var23].trim().length() == 0) {
                    var26 = null;
                } else {
                    var26 = arg0.field2754[var23];
                }
                if (var26 != null) {
                    method3398(var26, arg0.field2753, 57, var23 + 1, arg0.field2674, arg0.field2699, arg0.field2804);
                }
            }
            int var28 = method2756(arg0);
            boolean var29 = (var28 & 0x1) != 0;
            if (var29) {
                method175(class245.field2874, "", 30, 0, arg0.field2674, arg0.field2699);
            }
        } else if (class239.method3439(method2756(arg0)) && (Statics.field532 & 0x20) == 32) {
            method175(field788, field694 + " " + class81.field1104 + " " + arg0.field2753, 58, 0, arg0.field2674, arg0.field2699);
        }
    }

    @ObfuscatedName("dn.jg(ZB)V")
    public static void method2542(boolean arg0) {
        field777 = arg0;
    }

    @ObfuscatedName("q.jk(I)Z")
    public static boolean method284() {
        return field777;
    }

    @ObfuscatedName("bn.ji(I)Z")
    public static boolean method1643() {
        return field777 || class45.field382[81];
    }

    @ObfuscatedName("t.jw(IIIIIIII)V")
    public static final void method120(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class238.method501(arg0)) {
            method105(Statics.field2357[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("d.jc([Liq;IIIIIIIB)V")
    public static final void method105(class238[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class238 var9 = arg0[var8];
            if (var9 != null && var9.field2812 == arg1 && (!var9.field2672 || var9.field2675 == 0 || var9.field2767 || method2756(var9) != 0 || field836 == var9 || var9.field2677 == 1338)) {
                if (var9.field2672) {
                    if (method3725(var9)) {
                        continue;
                    }
                } else if (var9.field2675 == 0 && Statics.field1777 != var9 && method3725(var9)) {
                    continue;
                }
                int var10 = var9.field2686 + arg6;
                int var11 = var9.field2787 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2675 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2675 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2692 + var10;
                    int var19 = var9.field2807 + var11;
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
                    int var22 = var9.field2692 + var10;
                    int var23 = var9.field2807 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field823 == var9) {
                    field811 = true;
                    field812 = var10;
                    field813 = var11;
                }
                boolean var24 = false;
                if (var9.field2720) {
                    switch(field756) {
                        case 0:
                            var24 = true;
                        case 1:
                        default:
                            break;
                        case 2:
                            if (var9.field2699 >>> 16 == field662) {
                                var24 = true;
                            }
                            break;
                        case 3:
                            if (field662 == var9.field2699) {
                                var24 = true;
                            }
                    }
                }
                if (var24 || !var9.field2672 || var12 < var14 && var13 < var15) {
                    if (var9.field2672) {
                        if (var9.field2814) {
                            if (class54.field468 >= var12 && class54.field475 * 30622073 >= var13 && class54.field468 < var14 && class54.field475 * 30622073 < var15) {
                                for (class63 var25 = (class63) field829.method3986(); var25 != null; var25 = (class63) field829.method3988()) {
                                    if (var25.field558) {
                                        var25.method3973();
                                        var25.field559.field2805 = false;
                                    }
                                }
                                if (Statics.field1200 == 0) {
                                    field823 = null;
                                    field836 = null;
                                }
                                if (!field766) {
                                    method473();
                                }
                            }
                        } else if (var9.field2815 && class54.field468 >= var12 && class54.field475 * 30622073 >= var13 && class54.field468 < var14 && class54.field475 * 30622073 < var15) {
                            for (class63 var26 = (class63) field829.method3986(); var26 != null; var26 = (class63) field829.method3988()) {
                                if (var26.field558 && var26.field559.field2751 == var26.field560) {
                                    var26.method3973();
                                }
                            }
                        }
                    }
                    int var27 = class54.field468;
                    int var28 = class54.field475 * 30622073;
                    if (class54.field460 != 0) {
                        var27 = class54.field478;
                        var28 = class54.field479;
                    }
                    boolean var29 = var27 >= var12 && var28 >= var13 && var27 < var14 && var28 < var15;
                    if (var9.field2677 == 1337) {
                        if (!field640 && !field766 && var29) {
                            method3248(var27, var28, var12, var13);
                        }
                    } else if (var9.field2677 == 1338) {
                        method54(var9, var10, var11);
                    } else {
                        if (var9.field2677 == 1400) {
                            Statics.field533.method5908(class54.field468, class54.field475 * 30622073, var29, var10, var11, var9.field2692, var9.field2807);
                        }
                        if (!field766 && var29) {
                            if (var9.field2677 == 1400) {
                                Statics.field533.method5999(var10, var11, var9.field2692, var9.field2807, var27, var28);
                            } else {
                                method1033(var9, var27 - var10, var28 - var11);
                            }
                        }
                        if (var24) {
                            for (int var30 = 0; var30 < var9.field2748.length; var30++) {
                                boolean var31 = false;
                                boolean var32 = false;
                                if (!var31 && var9.field2748[var30] != null) {
                                    for (int var33 = 0; var33 < var9.field2748[var30].length; var33++) {
                                        boolean var34 = false;
                                        if (var9.field2813 != null) {
                                            var34 = class45.field382[var9.field2748[var30][var33]];
                                        }
                                        if (method3084(var9.field2748[var30][var33]) || var34) {
                                            var31 = true;
                                            if (var9.field2813 != null && var9.field2813[var30] > field899) {
                                                break;
                                            }
                                            byte var35 = var9.field2749[var30][var33];
                                            if (var35 == 0 || ((var35 & 0x8) == 0 || !class45.field382[86] && !class45.field382[82] && !class45.field382[81]) && ((var35 & 0x2) == 0 || class45.field382[86]) && ((var35 & 0x1) == 0 || class45.field382[82]) && ((var35 & 0x4) == 0 || class45.field382[81])) {
                                                var32 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (var32) {
                                    if (var30 < 10) {
                                        method2569(var30 + 1, var9.field2699, var9.field2674, var9.field2800, "");
                                    } else if (var30 == 10) {
                                        method3409();
                                        method148(var9.field2699, var9.field2674, class239.method4292(method2756(var9)), var9.field2800);
                                        field788 = method933(var9);
                                        if (field788 == null) {
                                            field788 = class245.field2894;
                                        }
                                        field694 = var9.field2753 + class81.method268(16777215);
                                    }
                                    int var36 = var9.field2750[var30];
                                    if (var9.field2813 == null) {
                                        var9.field2813 = new int[var9.field2748.length];
                                    }
                                    if (var9.field2755 == null) {
                                        var9.field2755 = new int[var9.field2748.length];
                                    }
                                    if (var36 == 0) {
                                        var9.field2813[var30] = Integer.MAX_VALUE;
                                    } else if (var9.field2813[var30] == 0) {
                                        var9.field2813[var30] = field899 + var36 + var9.field2755[var30];
                                    } else {
                                        var9.field2813[var30] = field899 + var36;
                                    }
                                }
                                if (!var31 && var9.field2813 != null) {
                                    var9.field2813[var30] = 0;
                                }
                            }
                        }
                        if (var9.field2672) {
                            boolean var37;
                            if (class54.field468 >= var12 && class54.field475 * 30622073 >= var13 && class54.field468 < var14 && class54.field475 * 30622073 < var15) {
                                var37 = true;
                            } else {
                                var37 = false;
                            }
                            boolean var38 = false;
                            if ((class54.field469 == 1 || !Statics.field98 && class54.field469 == 4) && var37) {
                                var38 = true;
                            }
                            boolean var39 = false;
                            if ((class54.field460 == 1 || !Statics.field98 && class54.field460 == 4) && class54.field478 >= var12 && class54.field479 >= var13 && class54.field478 < var14 && class54.field479 < var15) {
                                var39 = true;
                            }
                            if (var39) {
                                method1928(var9, class54.field478 - var10, class54.field479 - var11);
                            }
                            if (var9.field2677 == 1400) {
                                Statics.field533.method5847(var27, var28, var37 & var38, var37 & var39);
                            }
                            if (field823 != null && field823 != var9 && var37 && class239.method632(method2756(var9))) {
                                field633 = var9;
                            }
                            if (field836 == var9) {
                                field808 = true;
                                field704 = var10;
                                field810 = var11;
                            }
                            if (var9.field2767) {
                                if (var37 && field672 != 0 && var9.field2751 != null) {
                                    class63 var40 = new class63();
                                    var40.field558 = true;
                                    var40.field559 = var9;
                                    var40.field565 = field672;
                                    var40.field560 = var9.field2751;
                                    field829.method3981(var40);
                                }
                                if (field823 != null || Statics.field409 != null || field766) {
                                    var39 = false;
                                    var38 = false;
                                    var37 = false;
                                }
                                if (!var9.field2806 && var39) {
                                    var9.field2806 = true;
                                    if (var9.field2762 != null) {
                                        class63 var41 = new class63();
                                        var41.field558 = true;
                                        var41.field559 = var9;
                                        var41.field568 = class54.field478 - var10;
                                        var41.field565 = class54.field479 - var11;
                                        var41.field560 = var9.field2762;
                                        field829.method3981(var41);
                                    }
                                }
                                if (var9.field2806 && var38 && var9.field2763 != null) {
                                    class63 var42 = new class63();
                                    var42.field558 = true;
                                    var42.field559 = var9;
                                    var42.field568 = class54.field468 - var10;
                                    var42.field565 = class54.field475 * 30622073 - var11;
                                    var42.field560 = var9.field2763;
                                    field829.method3981(var42);
                                }
                                if (var9.field2806 && !var38) {
                                    var9.field2806 = false;
                                    if (var9.field2782 != null) {
                                        class63 var43 = new class63();
                                        var43.field558 = true;
                                        var43.field559 = var9;
                                        var43.field568 = class54.field468 - var10;
                                        var43.field565 = class54.field475 * 30622073 - var11;
                                        var43.field560 = var9.field2782;
                                        field831.method3981(var43);
                                    }
                                }
                                if (var38 && var9.field2765 != null) {
                                    class63 var44 = new class63();
                                    var44.field558 = true;
                                    var44.field559 = var9;
                                    var44.field568 = class54.field468 - var10;
                                    var44.field565 = class54.field475 * 30622073 - var11;
                                    var44.field560 = var9.field2765;
                                    field829.method3981(var44);
                                }
                                if (!var9.field2805 && var37) {
                                    var9.field2805 = true;
                                    if (var9.field2766 != null) {
                                        class63 var45 = new class63();
                                        var45.field558 = true;
                                        var45.field559 = var9;
                                        var45.field568 = class54.field468 - var10;
                                        var45.field565 = class54.field475 * 30622073 - var11;
                                        var45.field560 = var9.field2766;
                                        field829.method3981(var45);
                                    }
                                }
                                if (var9.field2805 && var37 && var9.field2781 != null) {
                                    class63 var46 = new class63();
                                    var46.field558 = true;
                                    var46.field559 = var9;
                                    var46.field568 = class54.field468 - var10;
                                    var46.field565 = class54.field475 * 30622073 - var11;
                                    var46.field560 = var9.field2781;
                                    field829.method3981(var46);
                                }
                                if (var9.field2805 && !var37) {
                                    var9.field2805 = false;
                                    if (var9.field2818 != null) {
                                        class63 var47 = new class63();
                                        var47.field558 = true;
                                        var47.field559 = var9;
                                        var47.field568 = class54.field468 - var10;
                                        var47.field565 = class54.field475 * 30622073 - var11;
                                        var47.field560 = var9.field2818;
                                        field831.method3981(var47);
                                    }
                                }
                                if (var9.field2779 != null) {
                                    class63 var48 = new class63();
                                    var48.field559 = var9;
                                    var48.field560 = var9.field2779;
                                    field783.method3981(var48);
                                }
                                if (var9.field2773 != null && field817 > var9.field2808) {
                                    if (var9.field2774 == null || field817 - var9.field2808 > 32) {
                                        class63 var53 = new class63();
                                        var53.field559 = var9;
                                        var53.field560 = var9.field2773;
                                        field829.method3981(var53);
                                    } else {
                                        label598: for (int var49 = var9.field2808; var49 < field817; var49++) {
                                            int var50 = field816[var49 & 0x1F];
                                            for (int var51 = 0; var51 < var9.field2774.length; var51++) {
                                                if (var9.field2774[var51] == var50) {
                                                    class63 var52 = new class63();
                                                    var52.field559 = var9;
                                                    var52.field560 = var9.field2773;
                                                    field829.method3981(var52);
                                                    break label598;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2808 = field817;
                                }
                                if (var9.field2775 != null && field819 > var9.field2711) {
                                    if (var9.field2776 == null || field819 - var9.field2711 > 32) {
                                        class63 var58 = new class63();
                                        var58.field559 = var9;
                                        var58.field560 = var9.field2775;
                                        field829.method3981(var58);
                                    } else {
                                        label574: for (int var54 = var9.field2711; var54 < field819; var54++) {
                                            int var55 = field818[var54 & 0x1F];
                                            for (int var56 = 0; var56 < var9.field2776.length; var56++) {
                                                if (var9.field2776[var56] == var55) {
                                                    class63 var57 = new class63();
                                                    var57.field559 = var9;
                                                    var57.field560 = var9.field2775;
                                                    field829.method3981(var57);
                                                    break label574;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2711 = field819;
                                }
                                if (var9.field2690 != null && field889 > var9.field2744) {
                                    if (var9.field2684 == null || field889 - var9.field2744 > 32) {
                                        class63 var63 = new class63();
                                        var63.field559 = var9;
                                        var63.field560 = var9.field2690;
                                        field829.method3981(var63);
                                    } else {
                                        label550: for (int var59 = var9.field2744; var59 < field889; var59++) {
                                            int var60 = field820[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var9.field2684.length; var61++) {
                                                if (var9.field2684[var61] == var60) {
                                                    class63 var62 = new class63();
                                                    var62.field559 = var9;
                                                    var62.field560 = var9.field2690;
                                                    field829.method3981(var62);
                                                    break label550;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2744 = field889;
                                }
                                if (field822 > var9.field2764 && var9.field2769 != null) {
                                    class63 var64 = new class63();
                                    var64.field559 = var9;
                                    var64.field560 = var9.field2769;
                                    field829.method3981(var64);
                                }
                                if (field642 > var9.field2764 && var9.field2784 != null) {
                                    class63 var65 = new class63();
                                    var65.field559 = var9;
                                    var65.field560 = var9.field2784;
                                    field829.method3981(var65);
                                }
                                if (field824 > var9.field2764 && var9.field2741 != null) {
                                    class63 var66 = new class63();
                                    var66.field559 = var9;
                                    var66.field560 = var9.field2741;
                                    field829.method3981(var66);
                                }
                                if (field863 > var9.field2764 && var9.field2790 != null) {
                                    class63 var67 = new class63();
                                    var67.field559 = var9;
                                    var67.field560 = var9.field2790;
                                    field829.method3981(var67);
                                }
                                if (field752 > var9.field2764 && var9.field2791 != null) {
                                    class63 var68 = new class63();
                                    var68.field559 = var9;
                                    var68.field560 = var9.field2791;
                                    field829.method3981(var68);
                                }
                                if (field827 > var9.field2764 && var9.field2786 != null) {
                                    class63 var69 = new class63();
                                    var69.field559 = var9;
                                    var69.field560 = var9.field2786;
                                    field829.method3981(var69);
                                }
                                var9.field2764 = field740;
                                if (var9.field2783 != null) {
                                    for (int var70 = 0; var70 < field673; var70++) {
                                        class63 var71 = new class63();
                                        var71.field559 = var9;
                                        var71.field561 = field853[var70];
                                        var71.field566 = field852[var70];
                                        var71.field560 = var9.field2783;
                                        field829.method3981(var71);
                                    }
                                }
                            }
                        }
                        if (!var9.field2672) {
                            if (field823 != null || Statics.field409 != null || field766) {
                                continue;
                            }
                            if ((var9.field2739 >= 0 || var9.field2700 != 0) && class54.field468 >= var12 && class54.field475 * 30622073 >= var13 && class54.field468 < var14 && class54.field475 * 30622073 < var15) {
                                if (var9.field2739 >= 0) {
                                    Statics.field1777 = arg0[var9.field2739];
                                } else {
                                    Statics.field1777 = var9;
                                }
                            }
                            if (var9.field2675 == 8 && class54.field468 >= var12 && class54.field475 * 30622073 >= var13 && class54.field468 < var14 && class54.field475 * 30622073 < var15) {
                                Statics.field1268 = var9;
                            }
                            if (var9.field2735 > var9.field2807) {
                                method1077(var9, var9.field2692 + var10, var11, var9.field2807, var9.field2735, class54.field468, class54.field475 * 30622073);
                            }
                        }
                        if (var9.field2675 == 0) {
                            method105(arg0, var9.field2699, var12, var13, var14, var15, var10 - var9.field2694, var11 - var9.field2695);
                            if (var9.field2810 != null) {
                                method105(var9.field2810, var9.field2699, var12, var13, var14, var15, var10 - var9.field2694, var11 - var9.field2695);
                            }
                            class62 var72 = (class62) field693.method3934((long) var9.field2699);
                            if (var72 != null) {
                                if (var72.field552 == 0 && class54.field468 >= var12 && class54.field475 * 30622073 >= var13 && class54.field468 < var14 && class54.field475 * 30622073 < var15 && !field766) {
                                    for (class63 var73 = (class63) field829.method3986(); var73 != null; var73 = (class63) field829.method3988()) {
                                        if (var73.field558) {
                                            var73.method3973();
                                            var73.field559.field2805 = false;
                                        }
                                    }
                                    if (Statics.field1200 == 0) {
                                        field823 = null;
                                        field836 = null;
                                    }
                                    if (!field766) {
                                        method473();
                                    }
                                }
                                method120(var72.field554, var12, var13, var14, var15, var10, var11);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ed.jv(IS)Z")
    public static boolean method3084(int arg0) {
        for (int var1 = 0; var1 < field673; var1++) {
            if (field853[var1] == arg0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("as.jh(III)V")
    public static final void method487(int arg0, int arg1) {
        if (class238.method501(arg0)) {
            method3411(Statics.field2357[arg0], arg1);
        }
    }

    @ObfuscatedName("fv.jq([Liq;II)V")
    public static final void method3411(class238[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class238 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2675 == 0) {
                    if (var3.field2810 != null) {
                        method3411(var3.field2810, arg1);
                    }
                    class62 var4 = (class62) field693.method3934((long) var3.field2699);
                    if (var4 != null) {
                        method487(var4.field554, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2679 != null) {
                    class63 var5 = new class63();
                    var5.field559 = var3;
                    var5.field560 = var3.field2679;
                    class76.method990(var5);
                }
                if (arg1 == 1 && var3.field2788 != null) {
                    if (var3.field2674 >= 0) {
                        class238 var6 = class238.method2289(var3.field2699);
                        if (var6 == null || var6.field2810 == null || var3.field2674 >= var6.field2810.length || var6.field2810[var3.field2674] != var3) {
                            continue;
                        }
                    }
                    class63 var7 = new class63();
                    var7.field559 = var3;
                    var7.field560 = var3.field2788;
                    class76.method990(var7);
                }
            }
        }
    }

    @ObfuscatedName("cr.js(Liq;IIS)V")
    public static final void method1928(class238 arg0, int arg1, int arg2) {
        if (field823 != null || field766 || arg0 == null || method4352(arg0) == null) {
            return;
        }
        field823 = arg0;
        field836 = method4352(arg0);
        field634 = arg1;
        field806 = arg2;
        Statics.field1200 = 0;
        field814 = false;
        int var3 = method4450();
        if (var3 != -1) {
            method3173(var3);
        }
    }

    @ObfuscatedName("client.jz(I)V")
    public final void method1166() {
        method649(field823);
        Statics.field1200++;
        if (field811 && field808) {
            int var1 = class54.field468;
            int var2 = class54.field475 * 30622073;
            int var3 = var1 - field634;
            int var4 = var2 - field806;
            if (var3 < field704) {
                var3 = field704;
            }
            if (field823.field2692 + var3 > field704 + field836.field2692) {
                var3 = field704 + field836.field2692 - field823.field2692;
            }
            if (var4 < field810) {
                var4 = field810;
            }
            if (field823.field2807 + var4 > field810 + field836.field2807) {
                var4 = field810 + field836.field2807 - field823.field2807;
            }
            int var5 = var3 - field812;
            int var6 = var4 - field813;
            int var7 = field823.field2691;
            if (Statics.field1200 > field823.field2757 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field814 = true;
            }
            int var8 = field836.field2694 + (var3 - field704);
            int var9 = field836.field2695 + (var4 - field810);
            if (field823.field2683 != null && field814) {
                class63 var10 = new class63();
                var10.field559 = field823;
                var10.field568 = var8;
                var10.field565 = var9;
                var10.field560 = field823.field2683;
                class76.method990(var10);
            }
            if (class54.field469 == 0) {
                if (field814) {
                    if (field823.field2770 != null) {
                        class63 var11 = new class63();
                        var11.field559 = field823;
                        var11.field568 = var8;
                        var11.field565 = var9;
                        var11.field564 = field633;
                        var11.field560 = field823.field2770;
                        class76.method990(var11);
                    }
                    if (field633 != null) {
                        class238 var12 = field823;
                        int var13 = method2756(var12);
                        int var14 = var13 >> 17 & 0x7;
                        int var15 = var14;
                        class238 var16;
                        if (var14 == 0) {
                            var16 = null;
                        } else {
                            int var17 = 0;
                            while (true) {
                                if (var17 >= var15) {
                                    var16 = var12;
                                    break;
                                }
                                var12 = class238.method2289(var12.field2812);
                                if (var12 == null) {
                                    var16 = null;
                                    break;
                                }
                                var17++;
                            }
                        }
                        if (var16 != null) {
                            class180 var18 = class180.method1090(class177.field2276, field886.field1271);
                            var18.field2345.method3571(field823.field2674);
                            var18.field2345.method3571(field633.field2800);
                            var18.field2345.method3508(field633.field2674);
                            var18.field2345.method3672(field823.field2699);
                            var18.field2345.method3634(field633.field2699);
                            var18.field2345.method3508(field823.field2800);
                            field886.method2059(var18);
                        }
                    }
                } else if (this.method1162()) {
                    this.method1163(field812 + field634, field813 + field806);
                } else if (field774 > 0) {
                    method493(field812 + field634, field813 + field806);
                }
                field823 = null;
            }
        } else if (Statics.field1200 > 1) {
            field823 = null;
        }
    }

    @ObfuscatedName("el.jl(II)V")
    public static void method3173(int arg0) {
        Statics.field3279 = new class82();
        Statics.field3279.field1111 = field767[arg0];
        Statics.field3279.field1120 = field769[arg0];
        Statics.field3279.field1112 = field770[arg0];
        Statics.field3279.field1114 = field687[arg0];
        Statics.field3279.field1115 = field635[arg0];
    }

    @ObfuscatedName("ac.jx(III)V")
    public static void method493(int arg0, int arg1) {
        class82 var2 = Statics.field3279;
        method934(var2.field1111, var2.field1120, var2.field1112, var2.field1114, var2.field1115, var2.field1115, arg0, arg1);
        Statics.field3279 = null;
    }

    @ObfuscatedName("ae.jj(Liq;I)V")
    public static void method649(class238 arg0) {
        if (field834 == arg0.field2701) {
            field835[arg0.field2811] = true;
        }
    }

    @ObfuscatedName("bi.jt(B)V")
    public static void method922() {
        for (class62 var0 = (class62) field693.method3937(); var0 != null; var0 = (class62) field693.method3941()) {
            int var1 = var0.field554;
            if (class238.method501(var1)) {
                boolean var2 = true;
                class238[] var3 = Statics.field2357[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2672;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2502;
                    class238 var6 = class238.method2289(var5);
                    if (var6 != null) {
                        method649(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("is.jr(Liq;I)Liq;")
    public static class238 method4352(class238 arg0) {
        class238 var1 = arg0;
        int var2 = method2756(arg0);
        int var3 = var2 >> 17 & 0x7;
        int var4 = var3;
        class238 var5;
        if (var3 == 0) {
            var5 = null;
        } else {
            int var6 = 0;
            while (true) {
                if (var6 >= var4) {
                    var5 = var1;
                    break;
                }
                var1 = class238.method2289(var1.field2812);
                if (var1 == null) {
                    var5 = null;
                    break;
                }
                var6++;
            }
        }
        class238 var7 = var5;
        if (var5 == null) {
            var7 = arg0.field2816;
        }
        return var7;
    }

    @ObfuscatedName("jg.jf(IB)V")
    public static final void method4719(int arg0) {
        if (!class238.method501(arg0)) {
            return;
        }
        class238[] var1 = Statics.field2357[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class238 var3 = var1[var2];
            if (var3 != null) {
                var3.field2760 = 0;
                var3.field2778 = 0;
            }
        }
    }

    @ObfuscatedName("do.ju([Liq;II)V")
    public static final void method2654(class238[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class238 var3 = arg0[var2];
            if (var3 != null && var3.field2812 == arg1 && (!var3.field2672 || !method3725(var3))) {
                if (var3.field2675 == 0) {
                    if (!var3.field2672 && method3725(var3) && Statics.field1777 != var3) {
                        continue;
                    }
                    method2654(arg0, var3.field2699);
                    if (var3.field2810 != null) {
                        method2654(var3.field2810, var3.field2699);
                    }
                    class62 var4 = (class62) field693.method3934((long) var3.field2699);
                    if (var4 != null) {
                        Statics.method1055(var4.field554);
                    }
                }
                if (var3.field2675 == 6) {
                    if (var3.field2768 != -1 || var3.field2721 != -1) {
                        boolean var5 = method3078(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2721;
                        } else {
                            var6 = var3.field2768;
                        }
                        if (var6 != -1) {
                            class279 var7 = class279.method2783(var6);
                            var3.field2778 += field691;
                            while (var3.field2778 > var7.field3603[var3.field2760]) {
                                var3.field2778 -= var7.field3603[var3.field2760];
                                var3.field2760++;
                                if (var3.field2760 >= var7.field3612.length) {
                                    var3.field2760 -= var7.field3607;
                                    if (var3.field2760 < 0 || var3.field2760 >= var7.field3612.length) {
                                        var3.field2760 = 0;
                                    }
                                }
                                method649(var3);
                            }
                        }
                    }
                    if (var3.field2756 != 0 && !var3.field2672) {
                        int var8 = var3.field2756 >> 16;
                        int var9 = var3.field2756 << 16 >> 16;
                        int var10 = field691 * var8;
                        int var11 = field691 * var9;
                        var3.field2730 = var3.field2730 + var10 & 0x7FF;
                        var3.field2725 = var3.field2725 + var11 & 0x7FF;
                        method649(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cg.jn(II)V")
    public static final void method2266(int arg0) {
        method922();
        for (class75 var1 = (class75) class75.field1034.method3986(); var1 != null; var1 = (class75) class75.field1034.method3988()) {
            if (var1.field1039 != null) {
                var1.method1721();
            }
        }
        int var2 = class261.method3318(arg0).field3304;
        if (var2 == 0) {
            return;
        }
        int var3 = class233.field2632[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class130.method2790(0.9D);
                ((class119) Statics.field1765).method2547(0.9D);
            }
            if (var3 == 2) {
                class130.method2790(0.8D);
                ((class119) Statics.field1765).method2547(0.8D);
            }
            if (var3 == 3) {
                class130.method2790(0.7D);
                ((class119) Statics.field1765).method2547(0.7D);
            }
            if (var3 == 4) {
                class130.method2790(0.6D);
                ((class119) Statics.field1765).method2547(0.6D);
            }
            class275.method269();
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
            if (field761 != var4) {
                if (field761 == 0 && field864 != -1) {
                    class225.method1964(Statics.field485, field864, 0, var4, false);
                    field664 = false;
                } else if (var4 == 0) {
                    class225.method184();
                    field664 = false;
                } else {
                    class225.method362(var4);
                }
                field761 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field857 = 127;
            }
            if (var3 == 1) {
                field857 = 96;
            }
            if (var3 == 2) {
                field857 = 64;
            }
            if (var3 == 3) {
                field857 = 32;
            }
            if (var3 == 4) {
                field857 = 0;
            }
        }
        if (var2 == 5) {
            field765 = var3;
        }
        if (var2 == 6) {
            field732 = var3;
        }
        if (var2 == 9) {
            field795 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field867 = 127;
            }
            if (var3 == 1) {
                field867 = 96;
            }
            if (var3 == 2) {
                field867 = 64;
            }
            if (var3 == 3) {
                field867 = 32;
            }
            if (var3 == 4) {
                field867 = 0;
            }
        }
        if (var2 == 17) {
            field800 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            field657 = (class84) class185.method3726(class84.method3191(), var3);
            if (field657 == null) {
                field657 = class84.field1131;
            }
        }
        if (var2 == 19) {
            if (var3 == -1) {
                field757 = -1;
            } else {
                field757 = var3 & 0x7FF;
            }
        }
        if (var2 == 22) {
            field715 = (class84) class185.method3726(class84.method3191(), var3);
            if (field715 == null) {
                field715 = class84.field1131;
            }
        }
    }

    @ObfuscatedName("at.jo(Liq;I)V")
    public static final void method480(class238 arg0) {
        int var1 = arg0.field2677;
        if (var1 == 324) {
            if (field894 == -1) {
                field894 = arg0.field2729;
                field895 = arg0.field2709;
            }
            if (field671.field2642) {
                arg0.field2729 = field894;
            } else {
                arg0.field2729 = field895;
            }
        } else if (var1 == 325) {
            if (field894 == -1) {
                field894 = arg0.field2729;
                field895 = arg0.field2709;
            }
            if (field671.field2642) {
                arg0.field2729 = field895;
            } else {
                arg0.field2729 = field894;
            }
        } else if (var1 == 327) {
            arg0.field2730 = 150;
            arg0.field2725 = (int) (Math.sin((double) field899 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2795 = 5;
            arg0.field2717 = 0;
        } else if (var1 == 328) {
            arg0.field2730 = 150;
            arg0.field2725 = (int) (Math.sin((double) field899 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2795 = 5;
            arg0.field2717 = 1;
        }
    }

    @ObfuscatedName("i.jp(B)V")
    public static final void method147() {
        class180 var0 = class180.method1090(class177.field2239, field886.field1271);
        field886.method2059(var0);
        for (class62 var1 = (class62) field693.method3937(); var1 != null; var1 = (class62) field693.method3941()) {
            if (var1.field552 == 0 || var1.field552 == 3) {
                method3347(var1, true);
            }
        }
        if (field655 != null) {
            method649(field655);
            field655 = null;
        }
    }

    @ObfuscatedName("k.kw(IIII)Lbc;")
    public static final class62 method227(int arg0, int arg1, int arg2) {
        class62 var3 = new class62();
        var3.field554 = arg1;
        var3.field552 = arg2;
        field693.method3935(var3, (long) arg0);
        method4719(arg1);
        class238 var4 = class238.method2289(arg0);
        method649(var4);
        if (field655 != null) {
            method649(field655);
            field655 = null;
        }
        method146();
        method5028(Statics.field2357[arg0 >> 16], var4, false);
        class76.method733(arg1);
        if (field790 != -1) {
            method487(field790, 1);
        }
        return var3;
    }

    @ObfuscatedName("fw.ke(Lbc;ZI)V")
    public static final void method3347(class62 arg0, boolean arg1) {
        int var2 = arg0.field554;
        int var3 = (int) arg0.field2502;
        arg0.method3973();
        if (arg1 && var2 != -1 && Statics.field2069[var2]) {
            Statics.field1736.method4508(var2);
            if (Statics.field2357[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2357[var2].length; var5++) {
                    if (Statics.field2357[var2][var5] != null) {
                        if (Statics.field2357[var2][var5].field2675 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2357[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2357[var2] = null;
                }
                Statics.field2069[var2] = false;
            }
        }
        for (class219 var6 = (class219) field832.method3937(); var6 != null; var6 = (class219) field832.method3941()) {
            if ((long) var2 == (var6.field2502 >> 48 & 0xFFFFL)) {
                var6.method3973();
            }
        }
        class238 var7 = class238.method2289(var3);
        if (var7 != null) {
            method649(var7);
        }
        method146();
        if (field790 != -1) {
            method487(field790, 1);
        }
    }

    @ObfuscatedName("ew.kb(Liq;B)Z")
    public static final boolean method2866(class238 arg0) {
        int var1 = arg0.field2677;
        if (var1 == 205) {
            field677 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field671.method4333(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field671.method4338(var4, var5 == 1);
        }
        if (var1 == 324) {
            field671.method4335(false);
        }
        if (var1 == 325) {
            field671.method4335(true);
        }
        if (var1 == 326) {
            class180 var6 = class180.method1090(class177.field2231, field886.field1271);
            field671.method4340(var6.field2345);
            field886.method2059(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ax.kk(Liq;IIII)V")
    public static final void method706(class238 arg0, int arg1, int arg2, int arg3) {
        Statics.method3425();
        class232 var4 = arg0.method4393(false);
        if (var4 == null) {
            return;
        }
        class323.method5632(arg1, arg2, var4.field2628 + arg1, var4.field2627 + arg2);
        if (field862 == 2 || field862 == 5) {
            class323.method5612(arg1, arg2, 0, var4.field2625, var4.field2626);
        } else {
            int var5 = field700 & 0x7FF;
            int var6 = Statics.field218.field949 / 32 + 48;
            int var7 = 464 - Statics.field218.field922 / 32;
            Statics.field988.method5715(arg1, arg2, var4.field2628, var4.field2627, var6, var7, var5, 256, var4.field2625, var4.field2626);
            for (int var8 = 0; var8 < field856; var8++) {
                int var9 = field723[var8] * 4 + 2 - Statics.field218.field949 / 32;
                int var10 = field748[var8] * 4 + 2 - Statics.field218.field922 / 32;
                method557(arg1, arg2, var9, var10, field796[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class213 var13 = field758[Statics.field66][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field218.field949 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field218.field922 / 32;
                        method557(arg1, arg2, var14, var15, Statics.field1737[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field660; var16++) {
                class79 var17 = field866[field763[var16]];
                if (var17 != null && var17.method1105()) {
                    class277 var18 = var17.field1086;
                    if (var18 != null && var18.field3574 != null) {
                        var18 = var18.method4976();
                    }
                    if (var18 != null && var18.field3570 && var18.field3582) {
                        int var19 = var17.field949 / 32 - Statics.field218.field949 / 32;
                        int var20 = var17.field922 / 32 - Statics.field218.field922 / 32;
                        method557(arg1, arg2, var19, var20, Statics.field1737[1], var4);
                    }
                }
            }
            int var21 = class89.field1213;
            int[] var22 = class89.field1214;
            for (int var23 = 0; var23 < var21; var23++) {
                class67 var24 = field746[var22[var23]];
                if (var24 != null && var24.method1105() && !var24.field607 && Statics.field218 != var24) {
                    int var25 = var24.field949 / 32 - Statics.field218.field949 / 32;
                    int var26 = var24.field922 / 32 - Statics.field218.field922 / 32;
                    boolean var27 = false;
                    if (Statics.field218.field616 != 0 && var24.field616 != 0 && Statics.field218.field616 == var24.field616) {
                        var27 = true;
                    }
                    if (var24.method1094()) {
                        method557(arg1, arg2, var25, var26, Statics.field1737[3], var4);
                    } else if (var27) {
                        method557(arg1, arg2, var25, var26, Statics.field1737[4], var4);
                    } else if (var24.method1112()) {
                        method557(arg1, arg2, var25, var26, Statics.field1737[5], var4);
                    } else {
                        method557(arg1, arg2, var25, var26, Statics.field1737[2], var4);
                    }
                }
            }
            if (field649 != 0 && field899 % 20 < 10) {
                if (field649 == 1 && field650 >= 0 && field650 < field866.length) {
                    class79 var28 = field866[field650];
                    if (var28 != null) {
                        int var29 = var28.field949 / 32 - Statics.field218.field949 / 32;
                        int var30 = var28.field922 / 32 - Statics.field218.field922 / 32;
                        method277(arg1, arg2, var29, var30, Statics.field1861[1], var4);
                    }
                }
                if (field649 == 2) {
                    int var31 = field825 * 4 - Statics.field512 * 4 + 2 - Statics.field218.field949 / 32;
                    int var32 = field720 * 4 - Statics.field318 * 4 + 2 - Statics.field218.field922 / 32;
                    method277(arg1, arg2, var31, var32, Statics.field1861[1], var4);
                }
                if (field649 == 10 && field651 >= 0 && field651 < field746.length) {
                    class67 var33 = field746[field651];
                    if (var33 != null) {
                        int var34 = var33.field949 / 32 - Statics.field218.field949 / 32;
                        int var35 = var33.field922 / 32 - Statics.field218.field922 / 32;
                        method277(arg1, arg2, var34, var35, Statics.field1861[1], var4);
                    }
                }
            }
            if (field828 != 0) {
                int var36 = field828 * 4 + 2 - Statics.field218.field949 / 32;
                int var37 = field861 * 4 + 2 - Statics.field218.field922 / 32;
                method557(arg1, arg2, var36, var37, Statics.field1861[0], var4);
            }
            if (!Statics.field218.field607) {
                class323.method5630(var4.field2628 / 2 + arg1 - 1, var4.field2627 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field885[arg3] = true;
    }

    @ObfuscatedName("fv.kg(Liq;IIII)V")
    public static final void method3423(class238 arg0, int arg1, int arg2, int arg3) {
        class232 var4 = arg0.method4393(false);
        if (var4 == null) {
            return;
        }
        if (field862 < 3) {
            Statics.field173.method5715(arg1, arg2, var4.field2628, var4.field2627, 25, 25, field700, 256, var4.field2625, var4.field2626);
        } else {
            class323.method5612(arg1, arg2, 0, var4.field2625, var4.field2626);
        }
    }

    @ObfuscatedName("e.kt(IIIILlu;Lhe;B)V")
    public static final void method277(int arg0, int arg1, int arg2, int arg3, class327 arg4, class232 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method557(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field700 & 0x7FF;
        int var8 = class130.field1768[var7];
        int var9 = class130.field1769[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field2628 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field3747.method5774(arg5.field2628 / 2 + arg0 - var17 / 2 + var15, arg5.field2627 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("ao.kx(IIIILlu;Lhe;I)V")
    public static final void method557(int arg0, int arg1, int arg2, int arg3, class327 arg4, class232 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field700 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class130.field1768[var6];
        int var9 = class130.field1769[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method5714(arg5.field2628 / 2 + var10 - arg4.field3886 / 2, arg5.field2627 / 2 - var11 - arg4.field3884 / 2, arg0, arg1, arg5.field2628, arg5.field2627, arg5.field2625, arg5.field2626);
        } else {
            arg4.method5742(arg5.field2628 / 2 + arg0 + var10 - arg4.field3886 / 2, arg5.field2627 / 2 + arg1 - var11 - arg4.field3884 / 2);
        }
    }

    @ObfuscatedName("kh.km(I)V")
    public static final void method5304() {
        Iterator var0 = class91.field1235.iterator();
        while (var0.hasNext()) {
            class65 var1 = (class65) var0.next();
            var1.method1063();
        }
        if (Statics.field481 != null) {
            Statics.field481.method5287();
        }
    }

    @ObfuscatedName("o.kz(I)V")
    public static final void method229() {
        for (int var0 = 0; var0 < class89.field1213; var0++) {
            class67 var1 = field746[class89.field1214[var0]];
            var1.method1107();
        }
    }

    @ObfuscatedName("bi.ky(I)V")
    public static final void method935() {
        field824 = field740;
        Statics.field1041 = true;
    }

    @ObfuscatedName("ar.ku(Ljava/lang/String;I)V")
    public static final void method697(String arg0) {
        if (Statics.field481 != null) {
            class180 var1 = class180.method1090(class177.field2261, field886.field1271);
            var1.field2345.method3646(class190.method3098(arg0));
            var1.field2345.method3669(arg0);
            field886.method2059(var1);
        }
    }

    @ObfuscatedName("fr.kr(Ljava/lang/String;I)V")
    public static final void method3338(String arg0) {
        if (!arg0.equals("")) {
            class180 var1 = class180.method1090(class177.field2297, field886.field1271);
            var1.field2345.method3646(class190.method3098(arg0));
            var1.field2345.method3669(arg0);
            field886.method2059(var1);
        }
    }

    @ObfuscatedName("ba.kp(I)V")
    public static final void method1136() {
        class180 var0 = class180.method1090(class177.field2297, field886.field1271);
        var0.field2345.method3646(0);
        field886.method2059(var0);
    }

    @ObfuscatedName("dz.ka(Liq;I)I")
    public static int method2756(class238 arg0) {
        class219 var1 = (class219) field832.method3934(((long) arg0.field2699 << 32) + (long) arg0.field2674);
        return var1 == null ? arg0.field2746 : var1.field2517;
    }

    @ObfuscatedName("ga.kh(Liq;I)Z")
    public static boolean method3725(class238 arg0) {
        return arg0.field2693;
    }

    @ObfuscatedName("bi.kd(Liq;I)Ljava/lang/String;")
    public static String method933(class238 arg0) {
        if (class239.method4292(method2756(arg0)) == 0) {
            return null;
        } else if (arg0.field2759 == null || arg0.field2759.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2759;
        }
    }

    @ObfuscatedName("s.kc(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method257(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field679 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field679 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field679 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field679 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field679 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field53 != null) {
            var3 = "/p=" + Statics.field53;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field884 + "/a=" + Statics.field1110 + var3 + "/";
    }

    @ObfuscatedName("b.kf(Ljava/lang/String;S)V")
    public static void method33(String arg0) {
        Statics.field53 = arg0;
        try {
            String var1 = Statics.field3685.getParameter(class285.field3660.field3648);
            String var2 = Statics.field3685.getParameter(class285.field3661.field3648);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class200.method1854(class192.method81() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class47.method690(Statics.field3685, "document.cookie=\"" + var4 + "\"");
        } catch (Throwable var6) {
        }
    }

    @ObfuscatedName("kl.kv(Ljava/lang/String;ZI)V")
    public static void method5477(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field3493; var5++) {
            class275 var6 = class275.method4283(var5);
            if ((!arg1 || var6.field3539) && var6.field3531 == -1 && var6.field3523.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field1931 = -1;
                    Statics.field3700 = null;
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
        Statics.field3700 = var3;
        Statics.field183 = 0;
        Statics.field1931 = var4;
        String[] var9 = new String[Statics.field1931];
        for (int var10 = 0; var10 < Statics.field1931; var10++) {
            var9[var10] = class275.method4283(var3[var10]).field3523;
        }
        short[] var11 = Statics.field3700;
        class187.method3480(var9, var11, 0, var9.length - 1);
    }

    @ObfuscatedName("do.ki([BII)V")
    public static void method2655(byte[] arg0, int arg1) {
        if (field670 == null) {
            field670 = new byte[24];
        }
        class201.method3804(arg0, arg1, field670, 0, 24);
    }

    @ObfuscatedName("ah.ks(Lgc;IB)V")
    public static void method517(class190 arg0, int arg1) {
        method2655(arg0.field2424, arg1);
        if (class163.field2042 == null) {
            return;
        }
        try {
            class163.field2042.method2497(0L);
            class163.field2042.method2494(arg0.field2424, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bc.kn(Lgc;I)V")
    public static void method1035(class190 arg0) {
        if (field670 == null) {
            byte[] var1 = class163.method2864();
            arg0.method3519(var1, 0, var1.length);
        } else {
            arg0.method3519(field670, 0, field670.length);
        }
    }

    @ObfuscatedName("client.ko(I)Lku;")
    public class297 method1167() {
        return Statics.field218 == null ? null : Statics.field218.field595;
    }

    @ObfuscatedName("ag.kl(I)Z")
    public static boolean method364() {
        return field821 >= 2;
    }

    @ObfuscatedName("ac.kq(II)V")
    public static void method492(int arg0) {
        field705 = arg0;
    }

    @ObfuscatedName("ev.kj(B)V")
    public static void method3081() {
        field886.method2059(class180.method1090(class177.field2256, field886.field1271));
        field705 = 0;
    }

    @ObfuscatedName("as.ly(I)V")
    public static void method485() {
        if (field705 == 1) {
            field713 = true;
        }
    }

    @ObfuscatedName("kc.lo(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method5321(String arg0) {
        class249[] var1 = class249.method4437();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class249 var3 = var1[var2];
            if (var3.field3193 != -1 && arg0.startsWith(class81.method158(var3.field3193))) {
                arg0 = arg0.substring(6 + Integer.toString(var3.field3193).length());
                break;
            }
        }
        return arg0;
    }

    @ObfuscatedName("bh.ls(B)V")
    public static void method1048() {
        if (Statics.field1065 == null) {
            return;
        }
        field900 = field899;
        Statics.field1065.method4607();
        for (int var0 = 0; var0 < field746.length; var0++) {
            if (field746[var0] != null) {
                Statics.field1065.method4624((field746[var0].field949 >> 7) + Statics.field512, (field746[var0].field922 >> 7) + Statics.field318);
            }
        }
    }
}

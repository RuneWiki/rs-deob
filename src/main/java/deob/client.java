package deob;

import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class48 implements class291 {

    @ObfuscatedName("client.w")
    public static class167[] field677 = new class167[4];

    @ObfuscatedName("client.al")
    public static boolean field805 = true;

    @ObfuscatedName("client.be")
    public static int field711 = 1;

    @ObfuscatedName("client.br")
    public static int field782 = 0;

    @ObfuscatedName("client.bg")
    public static int field786 = 0;

    @ObfuscatedName("client.bx")
    public static boolean field818 = false;

    @ObfuscatedName("client.bh")
    public static boolean field624 = false;

    @ObfuscatedName("client.bk")
    public static int field625 = 0;

    @ObfuscatedName("client.bj")
    public static int field627 = -1;

    @ObfuscatedName("client.by")
    public static boolean field648 = false;

    @ObfuscatedName("client.bv")
    public static int field629 = 0;

    @ObfuscatedName("client.cx")
    public static boolean field630 = true;

    @ObfuscatedName("client.cp")
    public static int field631 = 0;

    @ObfuscatedName("client.ce")
    public static long field665 = 1L;

    @ObfuscatedName("client.cz")
    public static int field633 = -1;

    @ObfuscatedName("client.cn")
    public static int field716 = -1;

    @ObfuscatedName("client.cg")
    public static long field635 = -1L;

    @ObfuscatedName("client.cl")
    public static boolean field696 = true;

    @ObfuscatedName("client.cr")
    public static boolean field668 = false;

    @ObfuscatedName("client.co")
    public static int field638 = 0;

    @ObfuscatedName("client.cy")
    public static int field683 = 0;

    @ObfuscatedName("client.cq")
    public static int field640 = 0;

    @ObfuscatedName("client.cm")
    public static int field619 = 0;

    @ObfuscatedName("client.ct")
    public static int field642 = 0;

    @ObfuscatedName("client.cv")
    public static int field643 = 0;

    @ObfuscatedName("client.cj")
    public static int field644 = 0;

    @ObfuscatedName("client.cc")
    public static int field645 = 0;

    @ObfuscatedName("client.cf")
    public static int field646 = 0;

    @ObfuscatedName("client.cw")
    public static class79 field647 = class79.field1120;

    @ObfuscatedName("client.dt")
    public static class79 field806 = class79.field1120;

    @ObfuscatedName("client.do")
    public static int field649 = 0;

    @ObfuscatedName("client.ds")
    public static int field737 = 0;

    @ObfuscatedName("client.dg")
    public static int field651 = 0;

    @ObfuscatedName("client.de")
    public static int field652 = 0;

    @ObfuscatedName("client.ep")
    public static int field653 = 0;

    @ObfuscatedName("client.ez")
    public static int field654 = 0;

    @ObfuscatedName("client.ex")
    public static int field655 = 0;

    @ObfuscatedName("client.el")
    public static int field656 = 0;

    @ObfuscatedName("client.eq")
    public static class149 field657 = class149.field1956;

    @ObfuscatedName("client.ee")
    public static class83 field812 = new class83();

    @ObfuscatedName("client.er")
    public static byte[] field659 = null;

    @ObfuscatedName("client.eo")
    public static class74[] field660 = new class74[32768];

    @ObfuscatedName("client.ey")
    public static int field661 = 0;

    @ObfuscatedName("client.ek")
    public static int[] field667 = new int[32768];

    @ObfuscatedName("client.ec")
    public static int field663 = 0;

    @ObfuscatedName("client.ej")
    public static int[] field664 = new int[250];

    @ObfuscatedName("client.fu")
    public static final class90 field830 = new class90();

    @ObfuscatedName("client.fy")
    public static int field666 = 0;

    @ObfuscatedName("client.fh")
    public static boolean field874 = false;

    @ObfuscatedName("client.ff")
    public static boolean field831 = true;

    @ObfuscatedName("client.fl")
    public static class283 field846 = new class283();

    @ObfuscatedName("client.fr")
    public static HashMap field670 = new HashMap();

    @ObfuscatedName("client.fd")
    public static int field763 = 0;

    @ObfuscatedName("client.fb")
    public static int field639 = 1;

    @ObfuscatedName("client.fp")
    public static int field798 = 0;

    @ObfuscatedName("client.fg")
    public static int field674 = 1;

    @ObfuscatedName("client.fi")
    public static int field675 = 0;

    @ObfuscatedName("client.gg")
    public static boolean field678 = false;

    @ObfuscatedName("client.go")
    public static int[][][] field679 = new int[4][13][13];

    @ObfuscatedName("client.gw")
    public static final int[] field676 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.gz")
    public static int field681 = 0;

    @ObfuscatedName("client.gc")
    public static int field889 = 2301979;

    @ObfuscatedName("client.gt")
    public static int field829 = 5063219;

    @ObfuscatedName("client.gq")
    public static int field684 = 3353893;

    @ObfuscatedName("client.gl")
    public static int field685 = 7759444;

    @ObfuscatedName("client.gf")
    public static boolean field632 = false;

    @ObfuscatedName("client.hl")
    public static int field671 = 0;

    @ObfuscatedName("client.hh")
    public static int field688 = 128;

    @ObfuscatedName("client.hb")
    public static int field689 = 0;

    @ObfuscatedName("client.ha")
    public static int field690 = 0;

    @ObfuscatedName("client.hs")
    public static int field691 = 0;

    @ObfuscatedName("client.hz")
    public static int field848 = 0;

    @ObfuscatedName("client.he")
    public static int field693 = 0;

    @ObfuscatedName("client.hr")
    public static int field694 = 0;

    @ObfuscatedName("client.hf")
    public static int field695 = 50;

    @ObfuscatedName("client.ho")
    public static int field814 = 0;

    @ObfuscatedName("client.hv")
    public static int field628 = 0;

    @ObfuscatedName("client.hm")
    public static int field698 = 0;

    @ObfuscatedName("client.hy")
    public static int field803 = 12;

    @ObfuscatedName("client.hg")
    public static int field700 = 6;

    @ObfuscatedName("client.ht")
    public static int field701 = 0;

    @ObfuscatedName("client.ij")
    public static boolean field744 = false;

    @ObfuscatedName("client.il")
    public static int field703 = 0;

    @ObfuscatedName("client.ip")
    public static boolean field704 = false;

    @ObfuscatedName("client.ir")
    public static int field705 = 0;

    @ObfuscatedName("client.ib")
    public static int field706 = 0;

    @ObfuscatedName("client.in")
    public static int field707 = 50;

    @ObfuscatedName("client.io")
    public static int[] field708 = new int[field707];

    @ObfuscatedName("client.ig")
    public static int[] field836 = new int[field707];

    @ObfuscatedName("client.ih")
    public static int[] field710 = new int[field707];

    @ObfuscatedName("client.id")
    public static int[] field723 = new int[field707];

    @ObfuscatedName("client.ik")
    public static int[] field712 = new int[field707];

    @ObfuscatedName("client.iq")
    public static int[] field713 = new int[field707];

    @ObfuscatedName("client.ic")
    public static int[] field864 = new int[field707];

    @ObfuscatedName("client.is")
    public static String[] field637 = new String[field707];

    @ObfuscatedName("client.ia")
    public static int[][] field692 = new int[104][104];

    @ObfuscatedName("client.iy")
    public static int field621 = 0;

    @ObfuscatedName("client.ie")
    public static int field718 = -1;

    @ObfuscatedName("client.iv")
    public static int field719 = -1;

    @ObfuscatedName("client.iw")
    public static int field720 = 0;

    @ObfuscatedName("client.ii")
    public static int field721 = 0;

    @ObfuscatedName("client.im")
    public static int field808 = 0;

    @ObfuscatedName("client.iu")
    public static int field845 = 0;

    @ObfuscatedName("client.it")
    public static String field773 = null;

    @ObfuscatedName("client.if")
    public static boolean field669 = true;

    @ObfuscatedName("client.jc")
    public static int field623 = 0;

    @ObfuscatedName("client.jj")
    public static int field726 = 0;

    @ObfuscatedName("client.jq")
    public static int field727 = 0;

    @ObfuscatedName("client.jv")
    public static int field728 = 0;

    @ObfuscatedName("client.jp")
    public static int field778 = 0;

    @ObfuscatedName("client.jd")
    public static int field730 = 0;

    @ObfuscatedName("client.jh")
    public static boolean field731 = false;

    @ObfuscatedName("client.js")
    public static int field732 = 0;

    @ObfuscatedName("client.jt")
    public static int field753 = 0;

    @ObfuscatedName("client.ju")
    public static boolean field734 = true;

    @ObfuscatedName("client.jb")
    public static class62[] field735 = new class62[2048];

    @ObfuscatedName("client.jn")
    public static int field736 = -1;

    @ObfuscatedName("client.jf")
    public static int field673 = 0;

    @ObfuscatedName("client.jl")
    public static boolean field620 = true;

    @ObfuscatedName("client.jo")
    public static int field739 = 0;

    @ObfuscatedName("client.kz")
    public static int field804 = 0;

    @ObfuscatedName("client.kh")
    public static int[] field741 = new int[1000];

    @ObfuscatedName("client.kx")
    public static final int[] field682 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.kd")
    public static String[] field743 = new String[8];

    @ObfuscatedName("client.kg")
    public static boolean[] field680 = new boolean[8];

    @ObfuscatedName("client.ky")
    public static int[] field794 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.kk")
    public static int field746 = -1;

    @ObfuscatedName("client.kp")
    public static class208[][][] field747 = new class208[4][104][104];

    @ObfuscatedName("client.kn")
    public static class208 field876 = new class208();

    @ObfuscatedName("client.kf")
    public static class208 field749 = new class208();

    @ObfuscatedName("client.ki")
    public static class208 field750 = new class208();

    @ObfuscatedName("client.ke")
    public static int[] field751 = new int[25];

    @ObfuscatedName("client.km")
    public static int[] field752 = new int[25];

    @ObfuscatedName("client.kw")
    public static int[] field768 = new int[25];

    @ObfuscatedName("client.kt")
    public static int field754 = 0;

    @ObfuscatedName("client.kc")
    public static boolean field755 = false;

    @ObfuscatedName("client.ku")
    public static int field756 = 0;

    @ObfuscatedName("client.kq")
    public static int[] field757 = new int[500];

    @ObfuscatedName("client.ks")
    public static int[] field789 = new int[500];

    @ObfuscatedName("client.kl")
    public static int[] field759 = new int[500];

    @ObfuscatedName("client.le")
    public static int[] field760 = new int[500];

    @ObfuscatedName("client.lw")
    public static String[] field761 = new String[500];

    @ObfuscatedName("client.lb")
    public static String[] field762 = new String[500];

    @ObfuscatedName("client.lv")
    public static boolean[] field790 = new boolean[500];

    @ObfuscatedName("client.ln")
    public static boolean field764 = false;

    @ObfuscatedName("client.lt")
    public static boolean field820 = false;

    @ObfuscatedName("client.lj")
    public static boolean field766 = false;

    @ObfuscatedName("client.ld")
    public static boolean field767 = true;

    @ObfuscatedName("client.lh")
    public static int field641 = -1;

    @ObfuscatedName("client.lq")
    public static int field769 = -1;

    @ObfuscatedName("client.lc")
    public static int field770 = 0;

    @ObfuscatedName("client.lu")
    public static int field771 = 50;

    @ObfuscatedName("client.lo")
    public static int field772 = 0;

    @ObfuscatedName("client.la")
    public static boolean field774 = false;

    @ObfuscatedName("client.lf")
    public static int field775 = -1;

    @ObfuscatedName("client.ls")
    public static int field776 = -1;

    @ObfuscatedName("client.lp")
    public static String field777 = null;

    @ObfuscatedName("client.ly")
    public static String field785 = null;

    @ObfuscatedName("client.lm")
    public static int field672 = -1;

    @ObfuscatedName("client.mp")
    public static class205 field780 = new class205(8);

    @ObfuscatedName("client.mg")
    public static int field781 = 0;

    @ObfuscatedName("client.mo")
    public static int field697 = 0;

    @ObfuscatedName("client.mx")
    public static class233 field709 = null;

    @ObfuscatedName("client.mj")
    public static int field784 = 0;

    @ObfuscatedName("client.mq")
    public static int field810 = 0;

    @ObfuscatedName("client.mi")
    public static int field686 = 0;

    @ObfuscatedName("client.ma")
    public static int field787 = -1;

    @ObfuscatedName("client.my")
    public static boolean field788 = false;

    @ObfuscatedName("client.mr")
    public static class233 field863 = null;

    @ObfuscatedName("client.mh")
    public static class233 field858 = null;

    @ObfuscatedName("client.mf")
    public static class233 field791 = null;

    @ObfuscatedName("client.ml")
    public static int field792 = 0;

    @ObfuscatedName("client.mn")
    public static int field745 = 0;

    @ObfuscatedName("client.mc")
    public static class233 field823 = null;

    @ObfuscatedName("client.mb")
    public static boolean field795 = false;

    @ObfuscatedName("client.ms")
    public static int field796 = -1;

    @ObfuscatedName("client.mw")
    public static int field875 = -1;

    @ObfuscatedName("client.me")
    public static boolean field715 = false;

    @ObfuscatedName("client.mk")
    public static int field799 = -1;

    @ObfuscatedName("client.mt")
    public static int field800 = -1;

    @ObfuscatedName("client.mu")
    public static boolean field801 = false;

    @ObfuscatedName("client.nj")
    public static int field765 = 1;

    @ObfuscatedName("client.no")
    public static int[] field748 = new int[32];

    @ObfuscatedName("client.nf")
    public static int field740 = 0;

    @ObfuscatedName("client.nr")
    public static int[] field847 = new int[32];

    @ObfuscatedName("client.nn")
    public static int field880 = 0;

    @ObfuscatedName("client.nw")
    public static int[] field807 = new int[32];

    @ObfuscatedName("client.nd")
    public static int field634 = 0;

    @ObfuscatedName("client.nc")
    public static int field662 = 0;

    @ObfuscatedName("client.nl")
    public static int field758 = 0;

    @ObfuscatedName("client.np")
    public static int field811 = 0;

    @ObfuscatedName("client.nt")
    public static int field650 = 0;

    @ObfuscatedName("client.na")
    public static int field813 = 0;

    @ObfuscatedName("client.ny")
    public static int field862 = 0;

    @ObfuscatedName("client.ng")
    public static int field815 = 0;

    @ObfuscatedName("client.nz")
    public static class208 field816 = new class208();

    @ObfuscatedName("client.nh")
    public static class208 field717 = new class208();

    @ObfuscatedName("client.ns")
    public static class208 field886 = new class208();

    @ObfuscatedName("client.ni")
    public static class205 field819 = new class205(512);

    @ObfuscatedName("client.ne")
    public static int field882 = 0;

    @ObfuscatedName("client.nx")
    public static int field821 = -2;

    @ObfuscatedName("client.nb")
    public static boolean[] field822 = new boolean[100];

    @ObfuscatedName("client.od")
    public static boolean[] field793 = new boolean[100];

    @ObfuscatedName("client.oo")
    public static boolean[] field824 = new boolean[100];

    @ObfuscatedName("client.og")
    public static int[] field825 = new int[100];

    @ObfuscatedName("client.oq")
    public static int[] field826 = new int[100];

    @ObfuscatedName("client.oi")
    public static int[] field827 = new int[100];

    @ObfuscatedName("client.ou")
    public static int[] field828 = new int[100];

    @ObfuscatedName("client.op")
    public static int field783 = 0;

    @ObfuscatedName("client.ox")
    public static long field866 = 0L;

    @ObfuscatedName("client.on")
    public static boolean field852 = true;

    @ObfuscatedName("client.oy")
    public static int[] field699 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.ob")
    public static int field833 = 0;

    @ObfuscatedName("client.ol")
    public static int field626 = 0;

    @ObfuscatedName("client.oe")
    public static String field835 = "";

    @ObfuscatedName("client.oa")
    public static long[] field687 = new long[100];

    @ObfuscatedName("client.ot")
    public static int field714 = 0;

    @ObfuscatedName("client.om")
    public static int field838 = 0;

    @ObfuscatedName("client.oj")
    public static int[] field839 = new int[128];

    @ObfuscatedName("client.pr")
    public static int[] field840 = new int[128];

    @ObfuscatedName("client.pb")
    public static long field841 = -1L;

    @ObfuscatedName("client.pc")
    public static int field842 = -1;

    @ObfuscatedName("client.pz")
    public static int field622 = 0;

    @ObfuscatedName("client.pk")
    public static int[] field844 = new int[1000];

    @ObfuscatedName("client.po")
    public static int[] field849 = new int[1000];

    @ObfuscatedName("client.pe")
    public static class322[] field817 = new class322[1000];

    @ObfuscatedName("client.pq")
    public static int field658 = 0;

    @ObfuscatedName("client.pp")
    public static int field802 = 0;

    @ObfuscatedName("client.pj")
    public static int field738 = 0;

    @ObfuscatedName("client.pl")
    public static int field850 = 255;

    @ObfuscatedName("client.pt")
    public static int field851 = -1;

    @ObfuscatedName("client.pf")
    public static boolean field832 = false;

    @ObfuscatedName("client.pn")
    public static int field853 = 127;

    @ObfuscatedName("client.ph")
    public static int field854 = 127;

    @ObfuscatedName("client.qg")
    public static int field855 = 0;

    @ObfuscatedName("client.qo")
    public static int[] field856 = new int[50];

    @ObfuscatedName("client.qx")
    public static int[] field857 = new int[50];

    @ObfuscatedName("client.qd")
    public static int[] field809 = new int[50];

    @ObfuscatedName("client.qj")
    public static int[] field859 = new int[50];

    @ObfuscatedName("client.qp")
    public static class94[] field860 = new class94[50];

    @ObfuscatedName("client.qh")
    public static boolean field861 = false;

    @ObfuscatedName("client.qk")
    public static boolean[] field779 = new boolean[5];

    @ObfuscatedName("client.qq")
    public static int[] field797 = new int[5];

    @ObfuscatedName("client.qt")
    public static int[] field725 = new int[5];

    @ObfuscatedName("client.qw")
    public static int[] field865 = new int[5];

    @ObfuscatedName("client.qn")
    public static int[] field868 = new int[5];

    @ObfuscatedName("client.ry")
    public static short field867 = 256;

    @ObfuscatedName("client.re")
    public static short field636 = 205;

    @ObfuscatedName("client.rm")
    public static short field869 = 256;

    @ObfuscatedName("client.rj")
    public static short field870 = 320;

    @ObfuscatedName("client.rr")
    public static short field871 = 1;

    @ObfuscatedName("client.ru")
    public static short field872 = 32767;

    @ObfuscatedName("client.rl")
    public static short field873 = 1;

    @ObfuscatedName("client.rh")
    public static short field834 = 32767;

    @ObfuscatedName("client.rz")
    public static int field837 = 0;

    @ObfuscatedName("client.ra")
    public static int field733 = 0;

    @ObfuscatedName("client.rk")
    public static int field877 = 0;

    @ObfuscatedName("client.rg")
    public static int field878 = 0;

    @ObfuscatedName("client.rd")
    public static int field879 = 0;

    @ObfuscatedName("client.rp")
    public static class230 field722 = new class230();

    @ObfuscatedName("client.rw")
    public static int field881 = -1;

    @ObfuscatedName("client.rx")
    public static int field729 = -1;

    @ObfuscatedName("client.rt")
    public static class5[] field883 = new class5[8];

    @ObfuscatedName("client.rb")
    public static class63 field884 = new class63();

    @ObfuscatedName("client.sk")
    public static int field885 = -1;

    @ObfuscatedName("client.se")
    public static ArrayList field702 = new ArrayList(10);

    @ObfuscatedName("client.sz")
    public static int field887 = 0;

    @ObfuscatedName("client.sa")
    public static final class61 field888 = new class61();

    @ObfuscatedName("client.sv")
    public static int[] field724 = new int[50];

    @ObfuscatedName("client.sh")
    public static int[] field890 = new int[50];

    @ObfuscatedName("db.ew(S)Llk;")
    public static class325 method2578() {
        return Statics.field1937;
    }

    @ObfuscatedName("client.ag(I)V")
    public final void method847() {
    }

    public final void init() {
        if (!this.method749()) {
            return;
        }
        class282[] var1 = new class282[] { class282.field3622, class282.field3618, class282.field3630, class282.field3621, class282.field3619, class282.field3629, class282.field3625, class282.field3627, class282.field3626, class282.field3613, class282.field3624, class282.field3616, class282.field3617, class282.field3628, class282.field3612, class282.field3614, class282.field3620, class282.field3615 };
        class282[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class282 var4 = var2[var3];
            String var5 = this.getParameter(var4.field3623);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field3623)) {
                    case 2:
                        Statics.field3345 = var5;
                        break;
                    case 3:
                        field625 = Integer.parseInt(var5);
                        break;
                    case 4:
                        field831 = Integer.parseInt(var5) != 0;
                    case 5:
                    case 12:
                    case 16:
                    case 17:
                    default:
                        break;
                    case 6:
                        field786 = Integer.parseInt(var5);
                        break;
                    case 7:
                        field711 = Integer.parseInt(var5);
                        break;
                    case 8:
                        class247[] var6 = new class247[] { class247.field3178, class247.field3170, class247.field3174, class247.field3172, class247.field3173, class247.field3171 };
                        Statics.field3584 = (class247) class180.method34(var6, Integer.parseInt(var5));
                        if (Statics.field3584 == class247.field3174) {
                            Statics.field2289 = class326.field3912;
                        } else {
                            Statics.field2289 = class326.field3917;
                        }
                        break;
                    case 9:
                        field782 = Integer.parseInt(var5);
                        break;
                    case 10:
                        if (var5.equalsIgnoreCase(class76.field1097)) {
                        }
                        break;
                    case 11:
                        Statics.field559 = class246.method3162(Integer.parseInt(var5));
                        break;
                    case 13:
                        if (field627 == -1) {
                            field627 = Integer.parseInt(var5);
                        }
                        break;
                    case 14:
                        Statics.field843 = var5;
                        break;
                    case 15:
                        Statics.field1945 = Integer.parseInt(var5);
                        break;
                    case 18:
                        if (var5.equalsIgnoreCase(class76.field1097)) {
                            field818 = true;
                        } else {
                            field818 = false;
                        }
                }
            }
        }
        class128.field1765 = false;
        field624 = false;
        Statics.field315 = this.getCodeBase().getHost();
        String var7 = Statics.field559.field3165;
        byte var8 = 0;
        try {
            class158.method1833("oldschool", var7, var8, 17);
        } catch (Exception var10) {
            class155.method2337((String) null, var10);
        }
        Statics.field391 = this;
        Statics.field333 = field627;
        this.method838(765, 503, 172);
    }

    @ObfuscatedName("client.am(I)V")
    public final void method721() {
        class186.method4249(new int[] { 20, 260, 10000 }, new int[] { 1000, 100, 500 });
        Statics.field308 = field786 == 0 ? 43594 : field711 + 40000;
        Statics.field2407 = field786 == 0 ? 443 : field711 + 50000;
        Statics.field166 = Statics.field308;
        Statics.field2613 = class231.field2620;
        Statics.field1923 = class231.field2619;
        Statics.field2614 = class231.field2618;
        Statics.field2617 = class231.field2623;
        Statics.field1490 = new class138();
        this.method726();
        this.method727();
        Statics.field53 = this.method723();
        Statics.field1573 = new class165(255, class158.field2013, class158.field2014, 500000);
        Statics.field580 = class68.method3253();
        this.method840();
        String var2 = Statics.field319;
        class46.field409 = this;
        if (var2 != null) {
            class46.field405 = var2;
        }
        if (field786 != 0) {
            field668 = true;
        }
        method3517(Statics.field580.field999);
        Statics.field1240 = new class69(Statics.field2289);
    }

    @ObfuscatedName("client.aj(I)V")
    public final void method732() {
        field631++;
        this.method1088();
        while (true) {
            class208 var1 = class251.field3209;
            class248 var2;
            synchronized (class251.field3209) {
                var2 = (class248) class251.field3208.method3796();
            }
            if (var2 == null) {
                try {
                    if (class220.field2499 == 1) {
                        int var4 = Statics.field2502.method3970();
                        if (var4 > 0 && Statics.field2502.method3994()) {
                            int var5 = var4 - Statics.field2501;
                            if (var5 < 0) {
                                var5 = 0;
                            }
                            Statics.field2502.method3926(var5);
                        } else {
                            Statics.field2502.method3946();
                            Statics.field2502.method3907();
                            if (Statics.field2599 == null) {
                                class220.field2499 = 0;
                            } else {
                                class220.field2499 = 2;
                            }
                            Statics.field1056 = null;
                            Statics.field399 = null;
                        }
                    }
                } catch (Exception var17) {
                    var17.printStackTrace();
                    Statics.field2502.method3946();
                    class220.field2499 = 0;
                    Statics.field1056 = null;
                    Statics.field399 = null;
                    Statics.field2599 = null;
                }
                method1708();
                class40 var7 = class40.field376;
                synchronized (class40.field376) {
                    class40.field356++;
                    class40.field370 = class40.field350;
                    class40.field369 = 0;
                    if (class40.field365 >= 0) {
                        while (class40.field365 != class40.field364) {
                            int var9 = class40.field363[class40.field364];
                            class40.field364 = class40.field364 + 1 & 0x7F;
                            if (var9 < 0) {
                                class40.field362[~var9] = false;
                            } else {
                                if (!class40.field362[var9] && class40.field369 < class40.field367.length - 1) {
                                    class40.field367[++class40.field369 - 1] = var9;
                                }
                                class40.field362[var9] = true;
                            }
                        }
                    } else {
                        for (int var8 = 0; var8 < 112; var8++) {
                            class40.field362[var8] = false;
                        }
                        class40.field365 = class40.field364;
                    }
                    if (class40.field369 > 0) {
                        class40.field356 = 0;
                    }
                    class40.field350 = class40.field355;
                }
                class49 var11 = class49.field450;
                synchronized (class49.field450) {
                    class49.field466 = class49.field452;
                    class49.field456 = class49.field459;
                    class49.field458 = class49.field454 * -349931817;
                    class49.field449 = class49.field455;
                    class49.field464 = class49.field460;
                    class49.field465 = class49.field451;
                    class49.field447 = class49.field462;
                    class49.field453 = class49.field463;
                    class49.field460 = 0;
                }
                if (Statics.field53 != null) {
                    int var13 = Statics.field53.method632();
                    field815 = var13;
                }
                if (field629 == 0) {
                    method3203();
                    class48.method22();
                } else if (field629 == 5) {
                    class80.method4260(this);
                    method3203();
                    class48.method22();
                } else if (field629 == 10 || field629 == 11) {
                    class80.method4260(this);
                } else if (field629 == 20) {
                    class80.method4260(this);
                    this.method1091();
                } else if (field629 == 25) {
                    method529();
                }
                if (field629 == 30) {
                    this.method1092();
                } else if (field629 == 40 || field629 == 45) {
                    this.method1091();
                }
                return;
            }
            var2.field3182.method4396(var2.field3180, (int) var2.field2464, var2.field3183, false);
        }
    }

    @ObfuscatedName("client.aq(ZB)V")
    public final void method803(boolean arg0) {
        boolean var2;
        label145: {
            try {
                if (class220.field2499 == 2) {
                    if (Statics.field1056 == null) {
                        Statics.field1056 = class226.method4090(Statics.field2599, Statics.field2029, Statics.field91);
                        if (Statics.field1056 == null) {
                            var2 = false;
                            break label145;
                        }
                    }
                    if (Statics.field399 == null) {
                        Statics.field399 = new class101(Statics.field2404, Statics.field2498);
                    }
                    if (Statics.field2502.method3984(Statics.field1056, Statics.field2497, Statics.field399, 22050)) {
                        Statics.field2502.method3906();
                        Statics.field2502.method3926(Statics.field3776);
                        Statics.field2502.method3902(Statics.field1056, Statics.field3187);
                        class220.field2499 = 0;
                        Statics.field1056 = null;
                        Statics.field399 = null;
                        Statics.field2599 = null;
                        var2 = true;
                        break label145;
                    }
                }
            } catch (Exception var11) {
                var11.printStackTrace();
                Statics.field2502.method3946();
                class220.field2499 = 0;
                Statics.field1056 = null;
                Statics.field399 = null;
                Statics.field2599 = null;
            }
            var2 = false;
        }
        if (var2 && field832 && Statics.field26 != null) {
            Statics.field26.method2043();
        }
        if ((field629 == 10 || field629 == 20 || field629 == 30) && field866 != 0L && class187.method3154() > field866) {
            int var5 = field852 ? 2 : 1;
            method3517(var5);
        }
        if (arg0) {
            for (int var6 = 0; var6 < 100; var6++) {
                field822[var6] = true;
            }
        }
        if (field629 == 0) {
            this.method748(class80.field1138, class80.field1139, arg0);
        } else if (field629 == 5) {
            class80.method288(Statics.field120, Statics.field2004, Statics.field1065, arg0);
        } else if (field629 == 10 || field629 == 11) {
            class80.method288(Statics.field120, Statics.field2004, Statics.field1065, arg0);
        } else if (field629 == 20) {
            class80.method288(Statics.field120, Statics.field2004, Statics.field1065, arg0);
        } else if (field629 == 25) {
            if (field675 == 1) {
                if (field763 > field639) {
                    field639 = field763;
                }
                int var7 = (field639 * 50 - field763 * 50) / field639;
                method43(class240.field3027 + class76.field1093 + class76.field1094 + var7 + "%" + class76.field1095, false);
            } else if (field675 == 2) {
                if (field798 > field674) {
                    field674 = field798;
                }
                int var8 = (field674 * 50 - field798 * 50) / field674 + 50;
                method43(class240.field3027 + class76.field1093 + class76.field1094 + var8 + "%" + class76.field1095, false);
            } else {
                method43(class240.field3027, false);
            }
        } else if (field629 == 30) {
            this.method1095();
        } else if (field629 == 40) {
            method43(class240.field2834 + class76.field1093 + class240.field2835, false);
        } else if (field629 == 45) {
            method43(class240.field2982, false);
        }
        if (field629 == 30 && field783 == 0 && !arg0 && !field852) {
            for (int var9 = 0; var9 < field882; var9++) {
                if (field793[var9]) {
                    Statics.field195.method703(field825[var9], field826[var9], field827[var9], field828[var9]);
                    field793[var9] = false;
                }
            }
        } else if (field629 > 0) {
            Statics.field195.method700(0, 0);
            for (int var10 = 0; var10 < field882; var10++) {
                field793[var10] = false;
            }
        }
    }

    @ObfuscatedName("client.ak(I)V")
    public final void method747() {
        if (Statics.field270.method1810()) {
            Statics.field270.method1803();
        }
        if (Statics.field122 != null) {
            Statics.field122.field566 = false;
        }
        Statics.field122 = null;
        field830.method1877();
        if (class40.field376 != null) {
            class40 var1 = class40.field376;
            synchronized (class40.field376) {
                class40.field376 = null;
            }
        }
        class49.method457();
        Statics.field53 = null;
        if (Statics.field26 != null) {
            Statics.field26.method2056();
        }
        if (Statics.field1755 != null) {
            Statics.field1755.method2056();
        }
        class253.method991();
        Object var3 = class251.field3210;
        synchronized (class251.field3210) {
            if (class251.field3207 != 0) {
                class251.field3207 = 1;
                try {
                    class251.field3210.wait();
                } catch (InterruptedException var6) {
                }
            }
        }
        if (Statics.field1490 != null) {
            Statics.field1490.method2867();
            Statics.field1490 = null;
        }
        class158.method4842();
    }

    @ObfuscatedName("fh.ea(II)V")
    public static void method3061(int arg0) {
        if (field629 == arg0) {
            return;
        }
        if (field629 == 0) {
            Statics.field391.method818();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field653 = 0;
            field654 = 0;
            field655 = 0;
            field846.method4900(arg0);
            if (arg0 != 20) {
                method1021(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field194 != null) {
            Statics.field194.method3036();
            Statics.field194 = null;
        }
        if (field629 == 25) {
            field675 = 0;
            field763 = 0;
            field639 = 1;
            field798 = 0;
            field674 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class80.method5356(Statics.field1918, Statics.field1890, true, 0);
        } else if (arg0 == 20) {
            class80.method5356(Statics.field1918, Statics.field1890, true, field629 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class80.method5356(Statics.field1918, Statics.field1890, false, 4);
        } else {
            class80.method5137();
        }
        field629 = arg0;
    }

    @ObfuscatedName("client.eo(I)V")
    public void method1088() {
        if (field629 == 1000) {
            return;
        }
        long var1 = class187.method3154();
        int var3 = (int) (var1 - Statics.field3225);
        Statics.field3225 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class253.field3237 += var3;
        boolean var4;
        if (class253.field3232 == 0 && class253.field3229 == 0 && class253.field3223 == 0 && class253.field3227 == 0) {
            var4 = true;
        } else if (Statics.field3238 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class253.field3237 > 30000) {
                        throw new IOException();
                    }
                    while (class253.field3229 < 200 && class253.field3227 > 0) {
                        class249 var5 = (class249) class253.field3226.method3741();
                        class185 var6 = new class185(4);
                        var6.method3258(1);
                        var6.method3268((int) var5.field2464);
                        Statics.field3238.method3041(var6.field2387, 0, 4);
                        class253.field3228.method3733(var5, var5.field2464);
                        class253.field3227--;
                        class253.field3229++;
                    }
                    while (class253.field3232 < 200 && class253.field3223 > 0) {
                        class249 var7 = (class249) class253.field3230.method3635();
                        class185 var8 = new class185(4);
                        var8.method3258(0);
                        var8.method3268((int) var7.field2464);
                        Statics.field3238.method3041(var8.field2387, 0, 4);
                        var7.method3826();
                        class253.field3233.method3733(var7, var7.field2464);
                        class253.field3223--;
                        class253.field3232++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field3238.method3038();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class253.field3237 = 0;
                        byte var11 = 0;
                        if (Statics.field2532 == null) {
                            var11 = 8;
                        } else if (class253.field3224 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class253.field3235.field2386;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field3238.method3042(class253.field3235.field2387, class253.field3235.field2386, var12);
                            if (class253.field3240 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class253.field3235.field2387[class253.field3235.field2386 + var13] ^= class253.field3240;
                                }
                            }
                            class253.field3235.field2386 += var12;
                            if (class253.field3235.field2386 < var11) {
                                break;
                            }
                            if (Statics.field2532 == null) {
                                class253.field3235.field2386 = 0;
                                int var14 = class253.field3235.method3274();
                                int var15 = class253.field3235.method3276();
                                int var16 = class253.field3235.method3274();
                                int var17 = class253.field3235.method3279();
                                long var18 = (long) ((var14 << 16) + var15);
                                class249 var20 = (class249) class253.field3228.method3735(var18);
                                Statics.field2427 = true;
                                if (var20 == null) {
                                    var20 = (class249) class253.field3233.method3735(var18);
                                    Statics.field2427 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field2532 = var20;
                                Statics.field3236 = new class185(var17 + var21 + Statics.field2532.field3186);
                                Statics.field3236.method3258(var16);
                                Statics.field3236.method3261(var17);
                                class253.field3224 = 8;
                                class253.field3235.field2386 = 0;
                            } else if (class253.field3224 == 0) {
                                if (class253.field3235.field2387[0] == -1) {
                                    class253.field3224 = 1;
                                    class253.field3235.field2386 = 0;
                                } else {
                                    Statics.field2532 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field3236.field2387.length - Statics.field2532.field3186;
                            int var23 = 512 - class253.field3224;
                            if (var23 > var22 - Statics.field3236.field2386) {
                                var23 = var22 - Statics.field3236.field2386;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field3238.method3042(Statics.field3236.field2387, Statics.field3236.field2386, var23);
                            if (class253.field3240 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field3236.field2387[Statics.field3236.field2386 + var24] ^= class253.field3240;
                                }
                            }
                            Statics.field3236.field2386 += var23;
                            class253.field3224 += var23;
                            if (Statics.field3236.field2386 == var22) {
                                if (Statics.field2532.field2464 == 16711935L) {
                                    Statics.field2417 = Statics.field3236;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class252 var26 = class253.field3234[var25];
                                        if (var26 != null) {
                                            Statics.field2417.field2386 = var25 * 8 + 5;
                                            int var27 = Statics.field2417.method3279();
                                            int var28 = Statics.field2417.method3279();
                                            var26.method4381(var27, var28);
                                        }
                                    }
                                } else {
                                    class253.field3239.reset();
                                    class253.field3239.update(Statics.field3236.field2387, 0, var22);
                                    int var29 = (int) class253.field3239.getValue();
                                    if (Statics.field2532.field3184 != var29) {
                                        try {
                                            Statics.field3238.method3036();
                                        } catch (Exception var35) {
                                        }
                                        class253.field3241++;
                                        Statics.field3238 = null;
                                        class253.field3240 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class253.field3241 = 0;
                                    class253.field3242 = 0;
                                    Statics.field2532.field3185.method4375((int) (Statics.field2532.field2464 & 0xFFFFL), Statics.field3236.field2387, (Statics.field2532.field2464 & 0xFF0000L) == 16711680L, Statics.field2427);
                                }
                                Statics.field2532.method3787();
                                if (Statics.field2427) {
                                    class253.field3229--;
                                } else {
                                    class253.field3232--;
                                }
                                class253.field3224 = 0;
                                Statics.field2532 = null;
                                Statics.field3236 = null;
                            } else {
                                if (class253.field3224 != 512) {
                                    break;
                                }
                                class253.field3224 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field3238.method3036();
                } catch (Exception var34) {
                }
                class253.field3242++;
                Statics.field3238 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method1108();
        }
    }

    @ObfuscatedName("client.ey(B)V")
    public void method1108() {
        if (class253.field3241 >= 4) {
            this.method837("js5crc");
            field629 = 1000;
            return;
        }
        if (class253.field3242 >= 4) {
            if (field629 <= 5) {
                this.method837("js5io");
                field629 = 1000;
                return;
            }
            field651 = 3000;
            class253.field3242 = 3;
        }
        if (--field651 + 1 > 0) {
            return;
        }
        try {
            if (field737 == 0) {
                Statics.field31 = Statics.field425.method3003(Statics.field315, Statics.field166);
                field737++;
            }
            if (field737 == 1) {
                if (Statics.field31.field1992 == 2) {
                    this.method1090(-1);
                    return;
                }
                if (Statics.field31.field1992 == 1) {
                    field737++;
                }
            }
            if (field737 == 2) {
                if (field831) {
                    Statics.field1468 = class160.method1527((Socket) Statics.field31.field1988, 40000, 5000);
                } else {
                    Statics.field1468 = new class164((Socket) Statics.field31.field1988, Statics.field425, 5000);
                }
                class185 var1 = new class185(5);
                var1.method3258(15);
                var1.method3261(172);
                Statics.field1468.method3041(var1.field2387, 0, 5);
                field737++;
                Statics.field2336 = class187.method3154();
            }
            if (field737 == 3) {
                if (Statics.field1468.method3038() > 0 || !field831 && field629 <= 5) {
                    int var2 = Statics.field1468.method3051();
                    if (var2 != 0) {
                        this.method1090(var2);
                        return;
                    }
                    field737++;
                } else if (class187.method3154() - Statics.field2336 > 30000L) {
                    this.method1090(-2);
                    return;
                }
            }
            if (field737 == 4) {
                class253.method2107(Statics.field1468, field629 > 20);
                Statics.field31 = null;
                Statics.field1468 = null;
                field737 = 0;
                field652 = 0;
            }
        } catch (IOException var4) {
            this.method1090(-3);
        }
    }

    @ObfuscatedName("client.ek(II)V")
    public void method1090(int arg0) {
        Statics.field31 = null;
        Statics.field1468 = null;
        field737 = 0;
        if (Statics.field308 == Statics.field166) {
            Statics.field166 = Statics.field2407;
        } else {
            Statics.field166 = Statics.field308;
        }
        field652++;
        if (field652 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field629 <= 5) {
                this.method837("js5connect_full");
                field629 = 1000;
            } else {
                field651 = 3000;
            }
        } else if (field652 >= 2 && arg0 == 6) {
            this.method837("js5connect_outofdate");
            field629 = 1000;
        } else if (field652 >= 4) {
            if (field629 <= 5) {
                this.method837("js5connect");
                field629 = 1000;
            } else {
                field651 = 3000;
            }
        }
    }

    @ObfuscatedName("aj.ec(Liy;Ljava/lang/String;B)V")
    public static void method576(class252 arg0, String arg1) {
        class54 var2 = new class54(arg0, arg1);
        field702.add(var2);
    }

    @ObfuscatedName("am.ej(I)Z")
    public static boolean method574() {
        if (field702 == null || field887 >= field702.size()) {
            return true;
        }
        while (field887 < field702.size()) {
            class54 var0 = (class54) field702.get(field887);
            if (!var0.method946()) {
                return false;
            }
            field887++;
        }
        return true;
    }

    @ObfuscatedName("fg.eh(I)V")
    public static void method3203() {
        if (field649 == 0) {
            Statics.field267 = new class128(4, 104, 104, class51.field487);
            for (int var0 = 0; var0 < 4; var0++) {
                field677[var0] = new class167(104, 104);
            }
            Statics.field1356 = new class322(512, 512);
            class80.field1139 = class240.field2822;
            class80.field1138 = 5;
            field649 = 20;
        } else if (field649 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class125.field1731[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class128.method2691(var1, 500, 800, 512, 334);
            class80.field1139 = class240.field3042;
            class80.field1138 = 10;
            field649 = 30;
        } else if (field649 == 30) {
            Statics.field1215 = method4167(0, false, true, true);
            Statics.field1925 = method4167(1, false, true, true);
            Statics.field110 = method4167(2, true, false, true);
            Statics.field321 = method4167(3, false, true, true);
            Statics.field302 = method4167(4, false, true, true);
            Statics.field3177 = method4167(5, true, true, true);
            Statics.field1161 = method4167(6, true, true, true);
            Statics.field1243 = method4167(7, false, true, true);
            Statics.field1890 = method4167(8, false, true, true);
            Statics.field968 = method4167(9, false, true, true);
            Statics.field1918 = method4167(10, false, true, true);
            Statics.field1836 = method4167(11, false, true, true);
            Statics.field1109 = method4167(12, false, true, true);
            Statics.field1581 = method4167(13, true, false, true);
            Statics.field3631 = method4167(14, false, true, true);
            Statics.field555 = method4167(15, false, true, true);
            Statics.field3580 = method4167(16, true, true, true);
            class80.field1139 = class240.field3107;
            class80.field1138 = 20;
            field649 = 40;
        } else if (field649 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field1215.method4387() * 4 / 100;
            int var8 = var7 + Statics.field1925.method4387() * 4 / 100;
            int var9 = var8 + Statics.field110.method4387() * 2 / 100;
            int var10 = var9 + Statics.field321.method4387() * 2 / 100;
            int var11 = var10 + Statics.field302.method4387() * 6 / 100;
            int var12 = var11 + Statics.field3177.method4387() * 4 / 100;
            int var13 = var12 + Statics.field1161.method4387() * 2 / 100;
            int var14 = var13 + Statics.field1243.method4387() * 58 / 100;
            int var15 = var14 + Statics.field1890.method4387() * 2 / 100;
            int var16 = var15 + Statics.field968.method4387() * 2 / 100;
            int var17 = var16 + Statics.field1918.method4387() * 2 / 100;
            int var18 = var17 + Statics.field1836.method4387() * 2 / 100;
            int var19 = var18 + Statics.field1109.method4387() * 2 / 100;
            int var20 = var19 + Statics.field1581.method4387() * 2 / 100;
            int var21 = var20 + Statics.field3631.method4387() * 2 / 100;
            int var22 = var21 + Statics.field555.method4387() * 2 / 100;
            int var23 = var22 + Statics.field3580.method4387() * 2 / 100;
            if (var23 == 100) {
                method576(Statics.field1215, "Animations");
                method576(Statics.field1925, "Skeletons");
                method576(Statics.field302, "Sound FX");
                method576(Statics.field3177, "Maps");
                method576(Statics.field1161, "Music Tracks");
                method576(Statics.field1243, "Models");
                method576(Statics.field1890, "Sprites");
                method576(Statics.field1836, "Music Jingles");
                method576(Statics.field3631, "Music Samples");
                method576(Statics.field555, "Music Patches");
                method576(Statics.field3580, "World Map");
                class80.field1139 = class240.field2840;
                class80.field1138 = 30;
                field649 = 45;
            } else {
                if (var23 != 0) {
                    class80.field1139 = class240.field2839 + var23 + "%";
                }
                class80.field1138 = 30;
            }
        } else if (field649 == 45) {
            class98.method528(22050, !field624, 2);
            class221 var24 = new class221();
            var24.method3910(9, 128);
            Statics.field26 = class98.method29(Statics.field425, 0, 22050);
            Statics.field26.method2040(var24);
            class252 var25 = Statics.field555;
            class252 var26 = Statics.field3631;
            class252 var27 = Statics.field302;
            Statics.field2497 = var25;
            Statics.field2498 = var26;
            Statics.field2404 = var27;
            Statics.field2502 = var24;
            Statics.field1755 = class98.method29(Statics.field425, 1, 2048);
            Statics.field1276 = new class91();
            Statics.field1755.method2040(Statics.field1276);
            Statics.field397 = new class105(22050, Statics.field66);
            class80.field1139 = class240.field2836;
            class80.field1138 = 35;
            field649 = 50;
            Statics.field2036 = new class299(Statics.field1890, Statics.field1581);
        } else if (field649 == 50) {
            class298[] var28 = new class298[] { class298.field3702, class298.field3700, class298.field3701, class298.field3703, class298.field3707, class298.field3698 };
            int var29 = var28.length;
            class299 var30 = Statics.field2036;
            class298[] var31 = new class298[] { class298.field3702, class298.field3700, class298.field3701, class298.field3703, class298.field3707, class298.field3698 };
            field670 = var30.method5139(var31);
            if (field670.size() < var29) {
                class80.field1139 = class240.field2947 + field670.size() * 100 / var29 + "%";
                class80.field1138 = 40;
            } else {
                Statics.field2004 = (class301) field670.get(class298.field3700);
                Statics.field1065 = (class301) field670.get(class298.field3707);
                Statics.field120 = (class301) field670.get(class298.field3698);
                Statics.field1232 = new class328(true);
                class80.field1139 = class240.field2910;
                class80.field1138 = 40;
                field649 = 60;
            }
        } else if (field649 == 60) {
            int var32 = class80.method2930(Statics.field1918, Statics.field1890);
            byte var33 = 11;
            if (var32 < var33) {
                class80.field1139 = class240.field3095 + var32 * 100 / var33 + "%";
                class80.field1138 = 50;
            } else {
                class80.field1139 = class240.field2845;
                class80.field1138 = 50;
                method3061(5);
                field649 = 70;
            }
        } else if (field649 == 70) {
            if (Statics.field110.method4275()) {
                class252 var35 = Statics.field110;
                Statics.field3559 = var35;
                class262.method2947(Statics.field110);
                class252 var36 = Statics.field110;
                class252 var37 = Statics.field1243;
                Statics.field3319 = var36;
                Statics.field3322 = var37;
                Statics.field3320 = Statics.field3319.method4331(3);
                class271.method1517(Statics.field110, Statics.field1243, field624);
                class252 var38 = Statics.field110;
                class252 var39 = Statics.field1243;
                Statics.field3520 = var38;
                Statics.field3536 = var39;
                class268.method209(Statics.field110);
                class252 var40 = Statics.field110;
                class252 var41 = Statics.field1243;
                boolean var42 = field818;
                class301 var43 = Statics.field2004;
                Statics.field3455 = var40;
                Statics.field3456 = var41;
                Statics.field3647 = var42;
                Statics.field1005 = Statics.field3455.method4331(10);
                Statics.field2000 = var43;
                class252 var44 = Statics.field110;
                class252 var45 = Statics.field1215;
                class252 var46 = Statics.field1925;
                Statics.field3565 = var44;
                Statics.field3562 = var45;
                Statics.field3563 = var46;
                class261.method4264(Statics.field110, Statics.field1243);
                class266.method106(Statics.field110);
                class252 var47 = Statics.field110;
                Statics.field3262 = var47;
                Statics.field67 = Statics.field3262.method4331(16);
                class233.method1678(Statics.field321, Statics.field1243, Statics.field1890, Statics.field1581);
                class252 var48 = Statics.field110;
                Statics.field3256 = var48;
                class252 var49 = Statics.field110;
                Statics.field3371 = var49;
                class259.method5107(Statics.field110);
                class252 var50 = Statics.field110;
                Statics.field3292 = var50;
                class267.method4446(Statics.field110);
                Statics.field270 = new class85();
                Statics.method2130(Statics.field110, Statics.field1890, Statics.field1581);
                class264.method4248(Statics.field110, Statics.field1890);
                class252 var51 = Statics.field110;
                class252 var52 = Statics.field1890;
                Statics.field3282 = var52;
                if (var51.method4275()) {
                    Statics.field3264 = var51.method4331(35);
                    Statics.field2412 = new class258[Statics.field3264];
                    for (int var53 = 0; var53 < Statics.field3264; var53++) {
                        byte[] var54 = var51.method4270(35, var53);
                        if (var54 != null) {
                            Statics.field2412[var53] = new class258(var53);
                            Statics.field2412[var53].method4477(new class185(var54));
                            Statics.field2412[var53].method4476();
                        }
                    }
                }
                class80.field1139 = class240.field3008;
                class80.field1138 = 60;
                field649 = 80;
            } else {
                class80.field1139 = class240.field2846 + Statics.field110.method4390() + "%";
                class80.field1138 = 60;
            }
        } else if (field649 == 80) {
            int var55 = 0;
            if (Statics.field150 == null) {
                Statics.field150 = class323.method4483(Statics.field1890, "compass", "");
            } else {
                var55++;
            }
            if (Statics.field2622 == null) {
                Statics.field2622 = class323.method4483(Statics.field1890, "mapedge", "");
            } else {
                var55++;
            }
            if (Statics.field2584 == null) {
                Statics.field2584 = class323.method28(Statics.field1890, "mapscene", "");
            } else {
                var55++;
            }
            if (Statics.field32 == null) {
                Statics.field32 = class323.method3166(Statics.field1890, "headicons_pk", "");
            } else {
                var55++;
            }
            if (Statics.field505 == null) {
                Statics.field505 = class323.method3166(Statics.field1890, "headicons_prayer", "");
            } else {
                var55++;
            }
            if (Statics.field385 == null) {
                Statics.field385 = class323.method3166(Statics.field1890, "headicons_hint", "");
            } else {
                var55++;
            }
            if (Statics.field317 == null) {
                Statics.field317 = class323.method3166(Statics.field1890, "mapmarker", "");
            } else {
                var55++;
            }
            if (Statics.field163 == null) {
                Statics.field163 = class323.method3166(Statics.field1890, "cross", "");
            } else {
                var55++;
            }
            if (Statics.field3706 == null) {
                Statics.field3706 = class323.method3166(Statics.field1890, "mapdots", "");
            } else {
                var55++;
            }
            if (Statics.field162 == null) {
                Statics.field162 = class323.method28(Statics.field1890, "scrollbar", "");
            } else {
                var55++;
            }
            if (Statics.field3708 == null) {
                Statics.field3708 = class323.method28(Statics.field1890, "mod_icons", "");
            } else {
                var55++;
            }
            if (var55 < 11) {
                class80.field1139 = class240.field2848 + var55 * 100 / 12 + "%";
                class80.field1138 = 70;
            } else {
                Statics.field3724 = Statics.field3708;
                Statics.field2622.method5494();
                int var56 = (int) (Math.random() * 21.0D) - 10;
                int var57 = (int) (Math.random() * 21.0D) - 10;
                int var58 = (int) (Math.random() * 21.0D) - 10;
                int var59 = (int) (Math.random() * 41.0D) - 20;
                Statics.field2584[0].method5470(var56 + var59, var57 + var59, var58 + var59);
                class80.field1139 = class240.field2849;
                class80.field1138 = 70;
                field649 = 90;
            }
        } else if (field649 == 90) {
            if (Statics.field968.method4275()) {
                Statics.field1928 = new class114(Statics.field968, Statics.field1890, 20, 0.8D, field624 ? 64 : 128);
                class125.method2618(Statics.field1928);
                class125.method2585(0.8D);
                field649 = 100;
            } else {
                class80.field1139 = class240.field3019 + "0%";
                class80.field1138 = 90;
            }
        } else if (field649 == 100) {
            int var60 = Statics.field1928.method2355();
            if (var60 < 100) {
                class80.field1139 = class240.field3019 + var60 + "%";
                class80.field1138 = 90;
            } else {
                class80.field1139 = class240.field3038;
                class80.field1138 = 90;
                field649 = 110;
            }
        } else if (field649 == 110) {
            Statics.field122 = new class59();
            Statics.field425.method3004(Statics.field122, 10);
            class80.field1139 = class240.field2852;
            class80.field1138 = 92;
            field649 = 120;
        } else if (field649 == 120) {
            if (Statics.field1918.method4344("huffman", "")) {
                class177 var61 = new class177(Statics.field1918.method4291("huffman", ""));
                Statics.field3746 = var61;
                class80.field1139 = class240.field2854;
                class80.field1138 = 94;
                field649 = 130;
            } else {
                class80.field1139 = class240.field2853 + "%";
                class80.field1138 = 94;
            }
        } else if (field649 == 130) {
            if (!Statics.field321.method4275()) {
                class80.field1139 = class240.field2855 + Statics.field321.method4390() * 4 / 5 + "%";
                class80.field1138 = 96;
            } else if (!Statics.field1109.method4275()) {
                class80.field1139 = class240.field2855 + (80 + Statics.field1109.method4390() / 6) + "%";
                class80.field1138 = 96;
            } else if (Statics.field1581.method4275()) {
                class80.field1139 = class240.field2994;
                class80.field1138 = 98;
                field649 = 140;
            } else {
                class80.field1139 = class240.field2855 + (96 + Statics.field1581.method4390() / 50) + "%";
                class80.field1138 = 96;
            }
        } else if (field649 == 140) {
            class80.field1138 = 100;
            if (Statics.field3580.method4337(class30.field272.field265)) {
                if (Statics.field1937 == null) {
                    Statics.field1937 = new class325();
                    Statics.field1937.method5689(Statics.field3580, Statics.field120, field670, Statics.field2584);
                }
                int var62 = Statics.field1937.method5658();
                if (var62 < 100) {
                    class80.field1139 = class240.field2932 + (var62 * 9 / 10 + 10) + "%";
                } else {
                    class80.field1139 = class240.field2973;
                    field649 = 150;
                }
            } else {
                class80.field1139 = class240.field2932 + Statics.field3580.method4334(class30.field272.field265) / 10 + "%";
            }
        } else if (field649 == 150) {
            method3061(10);
        }
    }

    @ObfuscatedName("hq.eg(IZZZB)Liy;")
    public static class252 method4167(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class165 var4 = null;
        if (class158.field2013 != null) {
            var4 = new class165(arg0, class158.field2013, Statics.field197[arg0], 1000000);
        }
        return new class252(var4, Statics.field1573, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.fu(I)V")
    public final void method1091() {
        class160 var1 = field830.method1892();
        class192 var2 = field830.field1267;
        try {
            if (field653 == 0) {
                if (Statics.field612 == null && (field812.method1781() || field654 > 250)) {
                    Statics.field612 = field812.method1776();
                    field812.method1779();
                    field812 = null;
                }
                if (Statics.field612 != null) {
                    if (var1 != null) {
                        var1.method3036();
                        var1 = null;
                    }
                    Statics.field472 = null;
                    field874 = false;
                    field654 = 0;
                    field653 = 1;
                }
            }
            if (field653 == 1) {
                if (Statics.field472 == null) {
                    Statics.field472 = Statics.field425.method3003(Statics.field315, Statics.field166);
                }
                if (Statics.field472.field1992 == 2) {
                    throw new IOException();
                }
                if (Statics.field472.field1992 == 1) {
                    if (field831) {
                        var1 = class160.method1527((Socket) Statics.field472.field1988, 40000, 5000);
                    } else {
                        var1 = new class164((Socket) Statics.field472.field1988, Statics.field425, 5000);
                    }
                    field830.method1876(var1);
                    Statics.field472 = null;
                    field653 = 2;
                }
            }
            if (field653 == 2) {
                field830.method1873();
                class175 var3 = class175.method69();
                var3.field2311.method3258(class173.field2286.field2287);
                field830.method1875(var3);
                field830.method1874();
                var2.field2386 = 0;
                field653 = 3;
            }
            if (field653 == 3) {
                if (Statics.field26 != null) {
                    Statics.field26.method2048();
                }
                if (Statics.field1755 != null) {
                    Statics.field1755.method2048();
                }
                boolean var4 = true;
                if (field831 && !var1.method3037(1)) {
                    var4 = false;
                }
                if (var4) {
                    int var5 = var1.method3051();
                    if (Statics.field26 != null) {
                        Statics.field26.method2048();
                    }
                    if (Statics.field1755 != null) {
                        Statics.field1755.method2048();
                    }
                    if (var5 != 0) {
                        method295(var5);
                        return;
                    }
                    var2.field2386 = 0;
                    field653 = 4;
                }
            }
            if (field653 == 4) {
                if (var2.field2386 < 8) {
                    int var6 = var1.method3038();
                    if (var6 > 8 - var2.field2386) {
                        var6 = 8 - var2.field2386;
                    }
                    if (var6 > 0) {
                        var1.method3042(var2.field2387, var2.field2386, var6);
                        var2.field2386 += var6;
                    }
                }
                if (var2.field2386 == 8) {
                    var2.field2386 = 0;
                    Statics.field1938 = var2.method3280();
                    field653 = 5;
                }
            }
            if (field653 == 5) {
                field830.field1267.field2386 = 0;
                field830.method1873();
                class192 var7 = new class192(500);
                int[] var8 = new int[] { Statics.field612.nextInt(), Statics.field612.nextInt(), Statics.field612.nextInt(), Statics.field612.nextInt() };
                var7.field2386 = 0;
                var7.method3258(1);
                var7.method3261(var8[0]);
                var7.method3261(var8[1]);
                var7.method3261(var8[2]);
                var7.method3261(var8[3]);
                var7.method3415(Statics.field1938);
                if (field629 == 40) {
                    var7.method3261(Statics.field2395[0]);
                    var7.method3261(Statics.field2395[1]);
                    var7.method3261(Statics.field2395[2]);
                    var7.method3261(Statics.field2395[3]);
                } else {
                    var7.method3258(field657.method174());
                    switch(field657.field1958) {
                        case 0:
                        case 2:
                            var7.method3268(Statics.field547);
                            var7.field2386++;
                            break;
                        case 1:
                            var7.field2386 += 4;
                            break;
                        case 3:
                            var7.method3261((Integer) Statics.field580.field1001.get(class308.method5263(class80.field1151)));
                    }
                    var7.method3258(class311.field3775.method174());
                    var7.method3265(class80.field1146);
                }
                var7.method3297(class78.field1113, class78.field1115);
                Statics.field2395 = var8;
                class175 var9 = class175.method1471();
                var9.field2309 = null;
                var9.field2306 = 0;
                var9.field2311 = new class192(5000);
                var9.field2311.field2386 = 0;
                if (field629 == 40) {
                    var9.field2311.method3258(class173.field2284.field2287);
                } else {
                    var9.field2311.method3258(class173.field2285.field2287);
                }
                var9.field2311.method3259(0);
                int var12 = var9.field2311.field2386;
                var9.field2311.method3261(172);
                var9.field2311.method3303(var7.field2387, 0, var7.field2386);
                int var13 = var9.field2311.field2386;
                var9.field2311.method3265(class80.field1151);
                var9.field2311.method3258((field852 ? 1 : 0) << 1 | (field624 ? 1 : 0));
                var9.field2311.method3259(Statics.field2428);
                var9.field2311.method3259(Statics.field117);
                Statics.method3497(var9.field2311);
                var9.field2311.method3265(Statics.field3345);
                var9.field2311.method3261(Statics.field1945);
                class185 var14 = new class185(Statics.field1232.method5873());
                Statics.field1232.method5877(var14);
                var9.field2311.method3303(var14.field2387, 0, var14.field2387.length);
                var9.field2311.method3258(field627);
                var9.field2311.method3261(0);
                var9.field2311.method3261(Statics.field1215.field3202);
                var9.field2311.method3261(Statics.field1925.field3202);
                var9.field2311.method3261(Statics.field110.field3202);
                var9.field2311.method3261(Statics.field321.field3202);
                var9.field2311.method3261(Statics.field302.field3202);
                var9.field2311.method3261(Statics.field3177.field3202);
                var9.field2311.method3261(Statics.field1161.field3202);
                var9.field2311.method3261(Statics.field1243.field3202);
                var9.field2311.method3261(Statics.field1890.field3202);
                var9.field2311.method3261(Statics.field968.field3202);
                var9.field2311.method3261(Statics.field1918.field3202);
                var9.field2311.method3261(Statics.field1836.field3202);
                var9.field2311.method3261(Statics.field1109.field3202);
                var9.field2311.method3261(Statics.field1581.field3202);
                var9.field2311.method3261(Statics.field3631.field3202);
                var9.field2311.method3261(Statics.field555.field3202);
                var9.field2311.method3261(Statics.field3580.field3202);
                var9.field2311.method3295(var8, var13, var9.field2311.field2386);
                var9.field2311.method3270(var9.field2311.field2386 - var12);
                field830.method1875(var9);
                field830.method1874();
                field830.field1266 = new class193(var8);
                int[] var15 = new int[4];
                for (int var16 = 0; var16 < 4; var16++) {
                    var15[var16] = var8[var16] + 50;
                }
                var2.method3541(var15);
                field653 = 6;
            }
            if (field653 == 6 && var1.method3038() > 0) {
                int var17 = var1.method3051();
                if (var17 == 21 && field629 == 20) {
                    field653 = 9;
                } else if (var17 == 2) {
                    field653 = 11;
                } else if (var17 == 15 && field629 == 40) {
                    field830.field1277 = -1;
                    field653 = 16;
                } else if (var17 == 64) {
                    field653 = 7;
                } else if (var17 == 23 && field655 < 1) {
                    field655++;
                    field653 = 0;
                } else if (var17 == 29) {
                    field653 = 14;
                } else {
                    method295(var17);
                    return;
                }
            }
            if (field653 == 7 && var1.method3038() > 0) {
                Statics.field1827 = var1.method3051();
                field653 = 8;
            }
            if (field653 == 8 && var1.method3038() >= Statics.field1827) {
                var1.method3042(var2.field2387, 0, Statics.field1827);
                var2.field2386 = 0;
                field653 = 6;
            }
            if (field653 == 9 && var1.method3038() > 0) {
                field656 = (var1.method3051() + 3) * 60;
                field653 = 10;
            }
            if (field653 == 10) {
                field654 = 0;
                class80.method1882(class240.field2872, class240.field2863, field656 / 60 + class240.field2864);
                if (--field656 <= 0) {
                    field653 = 0;
                }
            } else {
                if (field653 == 11 && var1.method3038() >= 1) {
                    Statics.field80 = var1.method3051();
                    field653 = 12;
                }
                if (field653 == 12 && var1.method3038() >= Statics.field80) {
                    boolean var18 = var1.method3051() == 1;
                    var1.method3042(var2.field2387, 0, 4);
                    var2.field2386 = 0;
                    boolean var19 = false;
                    if (var18) {
                        int var20 = var2.method3542() << 24;
                        int var21 = var20 | var2.method3542() << 16;
                        int var22 = var21 | var2.method3542() << 8;
                        int var23 = var22 | var2.method3542();
                        int var24 = class308.method5263(class80.field1151);
                        if (Statics.field580.field1001.size() >= 10 && !Statics.field580.field1001.containsKey(var24)) {
                            Iterator var25 = Statics.field580.field1001.entrySet().iterator();
                            var25.next();
                            var25.remove();
                        }
                        Statics.field580.field1001.put(var24, var23);
                    }
                    if (class80.field1125) {
                        Statics.field580.field1000 = class80.field1151;
                    } else {
                        Statics.field580.field1000 = null;
                    }
                    class68.method3016();
                    field686 = var1.method3051();
                    field788 = var1.method3051() == 1;
                    field736 = var1.method3051();
                    field736 <<= 0x8;
                    field736 += var1.method3051();
                    field673 = var1.method3051();
                    var1.method3042(var2.field2387, 0, 1);
                    var2.field2386 = 0;
                    class171[] var26 = class171.method214();
                    int var27 = var2.method3562();
                    if (var27 < 0 || var27 >= var26.length) {
                        throw new IOException(var27 + " " + var2.field2386);
                    }
                    field830.field1268 = var26[var27];
                    field830.field1277 = field830.field1268.field2182;
                    var1.method3042(var2.field2387, 0, 2);
                    var2.field2386 = 0;
                    field830.field1277 = var2.method3276();
                    try {
                        client var28 = Statics.field391;
                        JSObject.getWindow(var28).call("zap", (Object[]) null);
                    } catch (Throwable var50) {
                    }
                    field653 = 13;
                }
                if (field653 != 13) {
                    if (field653 == 14 && var1.method3038() >= 2) {
                        var2.field2386 = 0;
                        var1.method3042(var2.field2387, 0, 2);
                        var2.field2386 = 0;
                        Statics.field1851 = var2.method3276();
                        field653 = 15;
                    }
                    if (field653 == 15 && var1.method3038() >= Statics.field1851) {
                        var2.field2386 = 0;
                        var1.method3042(var2.field2387, 0, Statics.field1851);
                        var2.field2386 = 0;
                        String var45 = var2.method3490();
                        String var46 = var2.method3490();
                        String var47 = var2.method3490();
                        class80.method1882(var45, var46, var47);
                        method3061(10);
                    }
                    if (field653 == 16) {
                        if (field830.field1277 == -1) {
                            if (var1.method3038() < 2) {
                                return;
                            }
                            var1.method3042(var2.field2387, 0, 2);
                            var2.field2386 = 0;
                            field830.field1277 = var2.method3276();
                        }
                        if (var1.method3038() >= field830.field1277) {
                            var1.method3042(var2.field2387, 0, field830.field1277);
                            var2.field2386 = 0;
                            int var48 = field830.field1277;
                            field846.method4901();
                            method1693();
                            class84.method3007(var2);
                            if (var2.field2386 != var48) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field654++;
                        if (field654 > 2000) {
                            if (field655 < 1) {
                                if (Statics.field308 == Statics.field166) {
                                    Statics.field166 = Statics.field2407;
                                } else {
                                    Statics.field166 = Statics.field308;
                                }
                                field655++;
                                field653 = 0;
                            } else {
                                method295(-3);
                            }
                        }
                    }
                } else if (var1.method3038() >= field830.field1277) {
                    var2.field2386 = 0;
                    var1.method3042(var2.field2387, 0, field830.field1277);
                    field846.method4899();
                    field665 = 1L;
                    Statics.field122.field561 = 0;
                    Statics.field121 = true;
                    field696 = true;
                    field841 = -1L;
                    class317.field3796 = new class206();
                    field830.method1873();
                    field830.field1267.field2386 = 0;
                    field830.field1268 = null;
                    field830.field1264 = null;
                    field830.field1274 = null;
                    field830.field1275 = null;
                    field830.field1277 = 0;
                    field830.field1262 = 0;
                    field638 = 0;
                    field666 = 0;
                    field683 = 0;
                    method2654();
                    class49.method41(0);
                    class86.method145();
                    field772 = 0;
                    field774 = false;
                    field855 = 0;
                    field689 = 0;
                    field694 = 0;
                    Statics.field196 = null;
                    field738 = 0;
                    field842 = -1;
                    field658 = 0;
                    field802 = 0;
                    field647 = class79.field1120;
                    field806 = class79.field1120;
                    field661 = 0;
                    class84.field1199 = 0;
                    for (int var30 = 0; var30 < 2048; var30++) {
                        class84.field1203[var30] = null;
                        class84.field1202[var30] = 1;
                    }
                    for (int var31 = 0; var31 < 2048; var31++) {
                        field735[var31] = null;
                    }
                    for (int var32 = 0; var32 < 32768; var32++) {
                        field660[var32] = null;
                    }
                    field746 = -1;
                    field749.method3807();
                    field750.method3807();
                    for (int var33 = 0; var33 < 4; var33++) {
                        for (int var34 = 0; var34 < 104; var34++) {
                            for (int var35 = 0; var35 < 104; var35++) {
                                field747[var33][var34][var35] = null;
                            }
                        }
                    }
                    field876 = new class208();
                    Statics.field1240.method1540();
                    for (int var36 = 0; var36 < Statics.field67; var36++) {
                        class257 var37 = class257.method1871(var36);
                        if (var37 != null) {
                            class228.field2597[var36] = 0;
                            class228.field2596[var36] = 0;
                        }
                    }
                    Statics.field270.method1805();
                    field787 = -1;
                    if (field672 != -1) {
                        int var38 = field672;
                        if (var38 != -1 && Statics.field2629[var38]) {
                            Statics.field2723.method4285(var38);
                            if (Statics.field2674[var38] != null) {
                                boolean var39 = true;
                                for (int var40 = 0; var40 < Statics.field2674[var38].length; var40++) {
                                    if (Statics.field2674[var38][var40] != null) {
                                        if (Statics.field2674[var38][var40].field2680 == 2) {
                                            var39 = false;
                                        } else {
                                            Statics.field2674[var38][var40] = null;
                                        }
                                    }
                                }
                                if (var39) {
                                    Statics.field2674[var38] = null;
                                }
                                Statics.field2629[var38] = false;
                            }
                        }
                    }
                    for (class57 var41 = (class57) field780.method3741(); var41 != null; var41 = (class57) field780.method3734()) {
                        method5075(var41, true);
                    }
                    field672 = -1;
                    field780 = new class205(8);
                    field709 = null;
                    method2654();
                    field722.method4131((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var42 = 0; var42 < 8; var42++) {
                        field743[var42] = null;
                        field680[var42] = false;
                    }
                    class55.method4165();
                    field630 = true;
                    for (int var43 = 0; var43 < 100; var43++) {
                        field822[var43] = true;
                    }
                    method1858();
                    Statics.field65 = null;
                    for (int var44 = 0; var44 < 8; var44++) {
                        field883[var44] = new class5();
                    }
                    Statics.field233 = null;
                    class84.method3007(var2);
                    Statics.field1197 = -1;
                    method1853(false, var2);
                    field830.field1268 = null;
                }
            }
        } catch (IOException var51) {
            if (field655 < 1) {
                if (Statics.field308 == Statics.field166) {
                    Statics.field166 = Statics.field2407;
                } else {
                    Statics.field166 = Statics.field308;
                }
                field655++;
                field653 = 0;
            } else {
                method295(-2);
            }
        }
    }

    @ObfuscatedName("bd.fq(I)V")
    public static void method1693() {
        field830.method1873();
        field830.field1267.field2386 = 0;
        field830.field1268 = null;
        field830.field1264 = null;
        field830.field1274 = null;
        field830.field1275 = null;
        field830.field1277 = 0;
        field830.field1262 = 0;
        field638 = 0;
        method2654();
        field738 = 0;
        field658 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field735[var0] = null;
        }
        Statics.field341 = null;
        for (int var1 = 0; var1 < field660.length; var1++) {
            class74 var2 = field660[var1];
            if (var2 != null) {
                var2.field934 = -1;
                var2.field935 = false;
            }
        }
        class55.method4165();
        method3061(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field822[var3] = true;
        }
        method1858();
    }

    @ObfuscatedName("x.fy(II)V")
    public static void method295(int arg0) {
        if (arg0 == -3) {
            class80.method1882(class240.field2865, class240.field2874, class240.field2867);
        } else if (arg0 == -2) {
            class80.method1882(class240.field3108, class240.field2869, class240.field2870);
        } else if (arg0 == -1) {
            class80.method1882(class240.field2871, class240.field2926, class240.field2873);
        } else if (arg0 == 3) {
            class80.field1127 = 3;
        } else if (arg0 == 4) {
            class80.method1882(class240.field3025, class240.field3050, class240.field2876);
        } else if (arg0 == 5) {
            class80.method1882(class240.field2943, class240.field2878, class240.field2879);
        } else if (arg0 == 6) {
            class80.method1882(class240.field2880, class240.field2881, class240.field2882);
        } else if (arg0 == 7) {
            class80.method1882(class240.field2883, class240.field3037, class240.field2885);
        } else if (arg0 == 8) {
            class80.method1882(class240.field2886, class240.field2978, class240.field2888);
        } else if (arg0 == 9) {
            class80.method1882(class240.field3040, class240.field2824, class240.field2891);
        } else if (arg0 == 10) {
            class80.method1882(class240.field2892, class240.field3073, class240.field2894);
        } else if (arg0 == 11) {
            class80.method1882(class240.field3100, class240.field2972, class240.field2897);
        } else if (arg0 == 12) {
            class80.method1882(class240.field2898, class240.field2899, class240.field2900);
        } else if (arg0 == 13) {
            class80.method1882(class240.field3018, class240.field2912, class240.field3093);
        } else if (arg0 == 14) {
            class80.method1882(class240.field2904, class240.field2905, class240.field2906);
        } else if (arg0 == 16) {
            class80.method1882(class240.field2907, class240.field2908, class240.field3015);
        } else if (arg0 == 17) {
            class80.method1882(class240.field3017, class240.field2911, class240.field2896);
        } else if (arg0 == 18) {
            class80.method1882(class240.field2913, class240.field2914, class240.field2915);
        } else if (arg0 == 19) {
            class80.method1882(class240.field2916, class240.field2917, class240.field2954);
        } else if (arg0 == 20) {
            class80.method1882(class240.field2919, class240.field2920, class240.field3082);
        } else if (arg0 == 22) {
            class80.method1882(class240.field2889, class240.field2935, class240.field2924);
        } else if (arg0 == 23) {
            class80.method1882(class240.field2925, class240.field2979, class240.field2927);
        } else if (arg0 == 24) {
            class80.method1882(class240.field3016, class240.field2929, class240.field2930);
        } else if (arg0 == 25) {
            class80.method1882(class240.field2931, class240.field2868, class240.field2933);
        } else if (arg0 == 26) {
            class80.method1882(class240.field2934, class240.field2964, class240.field2936);
        } else if (arg0 == 27) {
            class80.method1882(class240.field2937, class240.field2938, class240.field2939);
        } else if (arg0 == 31) {
            class80.method1882(class240.field2946, class240.field3110, class240.field2948);
        } else if (arg0 == 32) {
            class80.method1882(class240.field2949, class240.field3074, class240.field2951);
        } else if (arg0 == 37) {
            class80.method1882(class240.field2921, class240.field2953, class240.field2981);
        } else if (arg0 == 38) {
            class80.method1882(class240.field2955, class240.field2956, class240.field2957);
        } else if (arg0 == 55) {
            class80.field1127 = 8;
        } else if (arg0 == 56) {
            class80.method1882(class240.field2962, class240.field2963, class240.field2857);
            method3061(11);
            return;
        } else if (arg0 == 57) {
            class80.method1882(class240.field2965, class240.field2966, class240.field2967);
            method3061(11);
            return;
        } else if (arg0 == 61) {
            class80.field1127 = 7;
        } else {
            class80.method1882(class240.field2890, class240.field2969, class240.field2970);
        }
        method3061(10);
    }

    @ObfuscatedName("m.fh(I)V")
    public static final void method221() {
        field830.method1877();
        class275.method42();
        class262.field3309.method3697();
        class263.field3329.method3697();
        class271.method4100();
        class274.method937();
        class272.method2323();
        class276.method2131();
        class261.method3539();
        class266.method2992();
        class257.method307();
        class270.field3400.method3697();
        class270.field3379.method3697();
        class270.field3380.method3697();
        class264.field3332.method3697();
        class264.field3338.method3697();
        class268.field3362.method3697();
        class267.method4445();
        class258.method184();
        class230.field2611.method3697();
        class233.method4161();
        ((class114) Statics.field1741).method2375();
        class87.field1239.method3697();
        Statics.field1215.method4286();
        Statics.field1925.method4286();
        Statics.field321.method4286();
        Statics.field302.method4286();
        Statics.field3177.method4286();
        Statics.field1161.method4286();
        Statics.field1243.method4286();
        Statics.field1890.method4286();
        Statics.field968.method4286();
        Statics.field1918.method4286();
        Statics.field1836.method4286();
        Statics.field1109.method4286();
        Statics.field267.method2656();
        for (int var0 = 0; var0 < 4; var0++) {
            field677[var0].method3109();
        }
        System.gc();
        class220.method3183(2);
        field851 = -1;
        field832 = false;
        class70.method80();
        method3061(10);
    }

    @ObfuscatedName("bj.ff(I)V")
    public static final void method1459() {
        if (field666 > 0) {
            method221();
        } else {
            field846.method4928();
            method3061(40);
            Statics.field194 = field830.method1892();
            field830.method1878();
        }
    }

    @ObfuscatedName("bh.fl(ZB)V")
    public static final void method1021(boolean arg0) {
        if (arg0) {
            field657 = class80.field1150 ? class149.field1954 : class149.field1957;
        } else {
            field657 = Statics.field580.field1001.containsKey(class308.method5263(class80.field1151)) ? class149.field1959 : class149.field1956;
        }
    }

    @ObfuscatedName("client.fx(S)V")
    public final void method1092() {
        if (field638 > 1) {
            field638--;
        }
        if (field666 > 0) {
            field666--;
        }
        if (field874) {
            field874 = false;
            method1459();
            return;
        }
        if (!field755) {
            method92();
        }
        for (int var1 = 0; var1 < 100 && this.method1377(field830); var1++) {
        }
        if (field629 != 30) {
            return;
        }
        while (true) {
            class316 var2 = (class316) class317.field3796.method3757();
            boolean var3;
            if (var2 == null) {
                var3 = false;
            } else {
                var3 = true;
            }
            if (!var3) {
                if (field846.field3632) {
                    class175 var6 = class175.method107(class172.field2235, field830.field1266);
                    var6.field2311.method3258(0);
                    int var7 = var6.field2311.field2386;
                    field846.method4904(var6.field2311);
                    var6.field2311.method3271(var6.field2311.field2386 - var7);
                    field830.method1875(var6);
                    field846.method4914();
                }
                Object var8 = Statics.field122.field564;
                synchronized (Statics.field122.field564) {
                    if (!field805) {
                        Statics.field122.field561 = 0;
                    } else if (class49.field464 != 0 || Statics.field122.field561 >= 40) {
                        class175 var9 = null;
                        int var10 = 0;
                        int var11 = 0;
                        int var12 = 0;
                        int var13 = 0;
                        for (int var14 = 0; var14 < Statics.field122.field561 && (var9 == null || var9.field2311.field2386 - var10 < 246); var14++) {
                            var11 = var14;
                            int var15 = Statics.field122.field563[var14];
                            if (var15 < -1) {
                                var15 = -1;
                            } else if (var15 > 65534) {
                                var15 = 65534;
                            }
                            int var16 = Statics.field122.field562[var14];
                            if (var16 < -1) {
                                var16 = -1;
                            } else if (var16 > 65534) {
                                var16 = 65534;
                            }
                            if (field633 != var16 || field716 != var15) {
                                if (var9 == null) {
                                    var9 = class175.method107(class172.field2271, field830.field1266);
                                    var9.field2311.method3258(0);
                                    var10 = var9.field2311.field2386;
                                    var9.field2311.field2386 += 2;
                                    var12 = 0;
                                    var13 = 0;
                                }
                                int var17;
                                int var18;
                                int var19;
                                if (field635 == -1L) {
                                    var17 = var16;
                                    var18 = var15;
                                    var19 = Integer.MAX_VALUE;
                                } else {
                                    var17 = var16 - field633;
                                    var18 = var15 - field716;
                                    var19 = (int) ((Statics.field122.field560[var14] - field635) / 20L);
                                    var12 = (int) ((Statics.field122.field560[var14] - field635) % 20L + (long) var12);
                                }
                                field633 = var16;
                                field716 = var15;
                                if (var19 < 8 && var17 >= -32 && var17 <= 31 && var18 >= -32 && var18 <= 31) {
                                    var17 += 32;
                                    var18 += 32;
                                    var9.field2311.method3259((var17 << 6) + (var19 << 12) + var18);
                                } else if (var19 < 32 && var17 >= -128 && var17 <= 127 && var18 >= -128 && var18 <= 127) {
                                    var17 += 128;
                                    var18 += 128;
                                    var9.field2311.method3258(var19 + 128);
                                    var9.field2311.method3259((var17 << 8) + var18);
                                } else if (var19 < 32) {
                                    var9.field2311.method3258(var19 + 192);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field2311.method3261(Integer.MIN_VALUE);
                                    } else {
                                        var9.field2311.method3261(var16 | var15 << 16);
                                    }
                                } else {
                                    var9.field2311.method3259((var19 & 0x1FFF) + 57344);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field2311.method3261(Integer.MIN_VALUE);
                                    } else {
                                        var9.field2311.method3261(var16 | var15 << 16);
                                    }
                                }
                                var13++;
                                field635 = Statics.field122.field560[var14];
                            }
                        }
                        if (var9 != null) {
                            var9.field2311.method3271(var9.field2311.field2386 - var10);
                            int var20 = var9.field2311.field2386;
                            var9.field2311.field2386 = var10;
                            var9.field2311.method3258(var12 / var13);
                            var9.field2311.method3258(var12 % var13);
                            var9.field2311.field2386 = var20;
                            field830.method1875(var9);
                        }
                        if (var11 >= Statics.field122.field561) {
                            Statics.field122.field561 = 0;
                        } else {
                            Statics.field122.field561 -= var11;
                            System.arraycopy(Statics.field122.field562, var11, Statics.field122.field562, 0, Statics.field122.field561);
                            System.arraycopy(Statics.field122.field563, var11, Statics.field122.field563, 0, Statics.field122.field561);
                            System.arraycopy(Statics.field122.field560, var11, Statics.field122.field560, 0, Statics.field122.field561);
                        }
                    }
                }
                if (class49.field464 == 1 || !Statics.field2577 && class49.field464 == 4 || class49.field464 == 2) {
                    long var22 = (class49.field453 - field665 * -1L) / 50L;
                    if (var22 > 4095L) {
                        var22 = 4095L;
                    }
                    field665 = class49.field453 * -1L;
                    int var24 = class49.field447;
                    if (var24 < 0) {
                        var24 = 0;
                    } else if (var24 > Statics.field117) {
                        var24 = Statics.field117;
                    }
                    int var25 = class49.field465;
                    if (var25 < 0) {
                        var25 = 0;
                    } else if (var25 > Statics.field2428) {
                        var25 = Statics.field2428;
                    }
                    int var26 = (int) var22;
                    class175 var27 = class175.method107(class172.field2186, field830.field1266);
                    var27.field2311.method3259((class49.field464 == 2 ? 1 : 0) + (var26 << 1));
                    var27.field2311.method3259(var25);
                    var27.field2311.method3259(var24);
                    field830.method1875(var27);
                }
                if (class40.field369 > 0) {
                    class175 var28 = class175.method107(class172.field2233, field830.field1266);
                    var28.field2311.method3259(0);
                    int var29 = var28.field2311.field2386;
                    long var30 = class187.method3154();
                    for (int var32 = 0; var32 < class40.field369; var32++) {
                        long var33 = var30 - field841;
                        if (var33 > 16777215L) {
                            var33 = 16777215L;
                        }
                        field841 = var30;
                        var28.field2311.method3353(class40.field367[var32]);
                        var28.field2311.method3317((int) var33);
                    }
                    var28.field2311.method3270(var28.field2311.field2386 - var29);
                    field830.method1875(var28);
                }
                if (field703 > 0) {
                    field703--;
                }
                if (class40.field362[96] || class40.field362[97] || class40.field362[98] || class40.field362[99]) {
                    field704 = true;
                }
                if (field704 && field703 <= 0) {
                    field703 = 20;
                    field704 = false;
                    class175 var35 = class175.method107(class172.field2280, field830.field1266);
                    var35.field2311.method3311(field689);
                    var35.field2311.method3311(field688);
                    field830.method1875(var35);
                }
                if (Statics.field121 && !field696) {
                    field696 = true;
                    class175 var36 = class175.method107(class172.field2202, field830.field1266);
                    var36.field2311.method3258(1);
                    field830.method1875(var36);
                }
                if (!Statics.field121 && field696) {
                    field696 = false;
                    class175 var37 = class175.method107(class172.field2202, field830.field1266);
                    var37.field2311.method3258(0);
                    field830.method1875(var37);
                }
                if (Statics.field1937 != null) {
                    Statics.field1937.method5851();
                }
                method3599();
                if (Statics.field348 != field842) {
                    field842 = Statics.field348;
                    method939(Statics.field348);
                }
                if (field629 != 30) {
                    return;
                }
                method3238();
                int var10002;
                for (int var38 = 0; var38 < field855; var38++) {
                    var10002 = field809[var38]--;
                    if (field809[var38] >= -10) {
                        class94 var40 = field860[var38];
                        if (var40 == null) {
                            class94 var10000 = (class94) null;
                            var40 = class94.method1960(Statics.field302, field856[var38], 0);
                            if (var40 == null) {
                                continue;
                            }
                            field809[var38] += var40.method1962();
                            field860[var38] = var40;
                        }
                        if (field809[var38] < 0) {
                            int var47;
                            if (field859[var38] == 0) {
                                var47 = field853;
                            } else {
                                int var41 = (field859[var38] & 0xFF) * 128;
                                int var42 = field859[var38] >> 16 & 0xFF;
                                int var43 = var42 * 128 + 64 - Statics.field341.field933;
                                if (var43 < 0) {
                                    var43 = -var43;
                                }
                                int var44 = field859[var38] >> 8 & 0xFF;
                                int var45 = var44 * 128 + 64 - Statics.field341.field964;
                                if (var45 < 0) {
                                    var45 = -var45;
                                }
                                int var46 = var43 + var45 - 128;
                                if (var46 > var41) {
                                    field809[var38] = -100;
                                    continue;
                                }
                                if (var46 < 0) {
                                    var46 = 0;
                                }
                                var47 = field854 * (var41 - var46) / var41;
                            }
                            if (var47 > 0) {
                                class96 var48 = var40.method1961().method2011(Statics.field397);
                                class106 var49 = class106.method2138(var48, 100, var47);
                                var49.method2268(field857[var38] - 1);
                                Statics.field1276.method1894(var49);
                            }
                            field809[var38] = -100;
                        }
                    } else {
                        field855--;
                        for (int var39 = var38; var39 < field855; var39++) {
                            field856[var39] = field856[var39 + 1];
                            field860[var39] = field860[var39 + 1];
                            field857[var39] = field857[var39 + 1];
                            field809[var39] = field809[var39 + 1];
                            field859[var39] = field859[var39 + 1];
                        }
                        var38--;
                    }
                }
                if (field832) {
                    boolean var50;
                    if (class220.field2499 == 0) {
                        var50 = Statics.field2502.method3994();
                    } else {
                        var50 = true;
                    }
                    if (!var50) {
                        if (field850 != 0 && field851 != -1) {
                            class220.method210(Statics.field1161, field851, 0, field850, false);
                        }
                        field832 = false;
                    }
                }
                field830.field1262++;
                if (field830.field1262 > 750) {
                    method1459();
                    return;
                }
                int var51 = class84.field1199;
                int[] var52 = class84.field1205;
                for (int var53 = 0; var53 < var51; var53++) {
                    class62 var54 = field735[var52[var53]];
                    if (var54 != null) {
                        method3515(var54, 1);
                    }
                }
                for (int var55 = 0; var55 < field661; var55++) {
                    int var56 = field667[var55];
                    class74 var57 = field660[var56];
                    if (var57 != null) {
                        method3515(var57, var57.field1077.field3518);
                    }
                }
                method303();
                field681++;
                if (field845 != 0) {
                    field808 += 20;
                    if (field808 >= 400) {
                        field845 = 0;
                    }
                }
                if (Statics.field306 != null) {
                    field623++;
                    if (field623 >= 15) {
                        method3069(Statics.field306);
                        Statics.field306 = null;
                    }
                }
                class233 var58 = Statics.field1579;
                class233 var59 = Statics.field330;
                Statics.field1579 = null;
                Statics.field330 = null;
                field823 = null;
                field715 = false;
                field795 = false;
                field838 = 0;
                while (class40.method2091() && field838 < 128) {
                    if (field686 >= 2 && class40.field362[82] && Statics.field334 == 66) {
                        String var60 = "";
                        Iterator var61 = class86.field1227.iterator();
                        while (var61.hasNext()) {
                            class60 var62 = (class60) var61.next();
                            var60 = var60 + var62.field571 + ':' + var62.field576 + '\n';
                        }
                        Statics.field391.method725(var60);
                    } else if (field694 != 1 || Statics.field1081 <= 0) {
                        field840[field838] = Statics.field334;
                        field839[field838] = Statics.field1081;
                        field838++;
                    }
                }
                boolean var65 = field686 >= 2;
                if (var65 && class40.field362[82] && class40.field362[81] && field815 != 0) {
                    int var66 = Statics.field341.field605 - field815;
                    if (var66 < 0) {
                        var66 = 0;
                    } else if (var66 > 3) {
                        var66 = 3;
                    }
                    if (Statics.field341.field605 != var66) {
                        method894(Statics.field6 + Statics.field341.field927[0], Statics.field72 + Statics.field341.field940[0], var66, false);
                    }
                    field815 = 0;
                }
                if (field672 != -1) {
                    method3593(field672, 0, 0, Statics.field2428, Statics.field117, 0, 0);
                }
                field765++;
                while (true) {
                    class58 var67;
                    class233 var68;
                    class233 var69;
                    do {
                        var67 = (class58) field717.method3796();
                        if (var67 == null) {
                            while (true) {
                                class58 var70;
                                class233 var71;
                                class233 var72;
                                do {
                                    var70 = (class58) field886.method3796();
                                    if (var70 == null) {
                                        while (true) {
                                            class58 var73;
                                            class233 var74;
                                            class233 var75;
                                            do {
                                                var73 = (class58) field816.method3796();
                                                if (var73 == null) {
                                                    this.method1097();
                                                    if (Statics.field1937 != null) {
                                                        Statics.field1937.method5720(Statics.field348, (Statics.field341.field933 >> 7) + Statics.field6, (Statics.field341.field964 >> 7) + Statics.field72, false);
                                                        Statics.field1937.method5737();
                                                    }
                                                    if (field858 != null) {
                                                        this.method1102();
                                                    }
                                                    if (Statics.field1042 != null) {
                                                        method3069(Statics.field1042);
                                                        field732++;
                                                        if (class49.field466 == 0) {
                                                            if (field731) {
                                                                if (Statics.field969 == Statics.field1042 && field730 != field727) {
                                                                    class233 var76 = Statics.field1042;
                                                                    byte var77 = 0;
                                                                    if (field697 == 1 && var76.field2657 == 206) {
                                                                        var77 = 1;
                                                                    }
                                                                    if (var76.field2736[field730] <= 0) {
                                                                        var77 = 0;
                                                                    }
                                                                    int var78 = method3164(var76);
                                                                    boolean var79 = (var78 >> 29 & 0x1) != 0;
                                                                    if (var79) {
                                                                        int var80 = field727;
                                                                        int var81 = field730;
                                                                        var76.field2736[var81] = var76.field2736[var80];
                                                                        var76.field2758[var81] = var76.field2758[var80];
                                                                        var76.field2736[var80] = -1;
                                                                        var76.field2758[var80] = 0;
                                                                    } else if (var77 == 1) {
                                                                        int var82 = field727;
                                                                        int var83 = field730;
                                                                        while (var82 != var83) {
                                                                            if (var82 > var83) {
                                                                                var76.method4173(var82 - 1, var82);
                                                                                var82--;
                                                                            } else if (var82 < var83) {
                                                                                var76.method4173(var82 + 1, var82);
                                                                                var82++;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        var76.method4173(field730, field727);
                                                                    }
                                                                    class175 var84 = class175.method107(class172.field2249, field830.field1266);
                                                                    var84.field2311.method3259(field730);
                                                                    var84.field2311.method3488(Statics.field1042.field2638);
                                                                    var84.field2311.method3258(var77);
                                                                    var84.field2311.method3310(field727);
                                                                    field830.method1875(var84);
                                                                }
                                                            } else if (this.method1098()) {
                                                                this.method1157(field728, field778);
                                                            } else if (field756 > 0) {
                                                                method2858(field728, field778);
                                                            }
                                                            field623 = 10;
                                                            class49.field464 = 0;
                                                            Statics.field1042 = null;
                                                        } else if (field732 >= 5 && (class49.field456 > field728 + 5 || class49.field456 < field728 - 5 || class49.field458 * -53945113 > field778 + 5 || class49.field458 * -53945113 < field778 - 5)) {
                                                            field731 = true;
                                                        }
                                                    }
                                                    if (class128.method2694()) {
                                                        int var85 = class128.field1799;
                                                        int var86 = class128.field1802;
                                                        class175 var87 = class175.method107(class172.field2246, field830.field1266);
                                                        var87.field2311.method3258(5);
                                                        var87.field2311.method3311(Statics.field6 + var85);
                                                        var87.field2311.method3310(Statics.field72 + var86);
                                                        var87.field2311.method3258(class40.field362[82] ? (class40.field362[81] ? 2 : 1) : 0);
                                                        field830.method1875(var87);
                                                        class128.method2695();
                                                        field720 = class49.field465;
                                                        field721 = class49.field447;
                                                        field845 = 1;
                                                        field808 = 0;
                                                        field658 = var85;
                                                        field802 = var86;
                                                    }
                                                    if (Statics.field1579 != var58) {
                                                        if (var58 != null) {
                                                            method3069(var58);
                                                        }
                                                        if (Statics.field1579 != null) {
                                                            method3069(Statics.field1579);
                                                        }
                                                    }
                                                    if (Statics.field330 != var59 && field771 == field770) {
                                                        if (var59 != null) {
                                                            method3069(var59);
                                                        }
                                                        if (Statics.field330 != null) {
                                                            method3069(Statics.field330);
                                                        }
                                                    }
                                                    if (Statics.field330 == null) {
                                                        if (field770 > 0) {
                                                            field770--;
                                                        }
                                                    } else if (field770 < field771) {
                                                        field770++;
                                                        if (field771 == field770) {
                                                            method3069(Statics.field330);
                                                        }
                                                    }
                                                    method1020();
                                                    if (field861) {
                                                        method1680();
                                                    }
                                                    for (int var88 = 0; var88 < 5; var88++) {
                                                        var10002 = field868[var88]++;
                                                    }
                                                    Statics.field270.method1813();
                                                    int var89 = ++class49.field457 - 1;
                                                    int var91 = class40.field356;
                                                    if (var89 > 15000 && var91 > 15000) {
                                                        field666 = 250;
                                                        class49.method41(14500);
                                                        class175 var93 = class175.method107(class172.field2197, field830.field1266);
                                                        field830.method1875(var93);
                                                    }
                                                    Statics.field1240.method1539();
                                                    field830.field1272++;
                                                    if (field830.field1272 > 50) {
                                                        class175 var94 = class175.method107(class172.field2260, field830.field1266);
                                                        field830.method1875(var94);
                                                    }
                                                    try {
                                                        field830.method1874();
                                                    } catch (IOException var96) {
                                                        method1459();
                                                    }
                                                    return;
                                                }
                                                var74 = var73.field544;
                                                if (var74.field2639 < 0) {
                                                    break;
                                                }
                                                var75 = class233.method2957(var74.field2675);
                                            } while (var75 == null || var75.field2763 == null || var74.field2639 >= var75.field2763.length || var75.field2763[var74.field2639] != var74);
                                            class71.method952(var73);
                                        }
                                    }
                                    var71 = var70.field544;
                                    if (var71.field2639 < 0) {
                                        break;
                                    }
                                    var72 = class233.method2957(var71.field2675);
                                } while (var72 == null || var72.field2763 == null || var71.field2639 >= var72.field2763.length || var72.field2763[var71.field2639] != var71);
                                class71.method952(var70);
                            }
                        }
                        var68 = var67.field544;
                        if (var68.field2639 < 0) {
                            break;
                        }
                        var69 = class233.method2957(var68.field2675);
                    } while (var69 == null || var69.field2763 == null || var68.field2639 >= var69.field2763.length || var69.field2763[var68.field2639] != var68);
                    class71.method952(var67);
                }
            }
            class175 var4 = class175.method107(class172.field2226, field830.field1266);
            var4.field2311.method3258(0);
            int var5 = var4.field2311.field2386;
            class317.method2466(var4.field2311);
            var4.field2311.method3271(var4.field2311.field2386 - var5);
            field830.method1875(var4);
        }
    }

    @ObfuscatedName("bs.fw(I)V")
    public static final void method1708() {
        if (Statics.field1755 != null) {
            Statics.field1755.method2041();
        }
        if (Statics.field26 != null) {
            Statics.field26.method2041();
        }
    }

    @ObfuscatedName("az.fm(Ljb;IIII)V")
    public static void method935(class276 arg0, int arg1, int arg2, int arg3) {
        if (field855 >= 50 || field854 == 0 || arg0.field3578 == null || arg1 >= arg0.field3578.length) {
            return;
        }
        int var4 = arg0.field3578[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field856[field855] = var5;
        field857[field855] = var6;
        field809[field855] = 0;
        field860[field855] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field859[field855] = (var8 << 16) + (var9 << 8) + var7;
        field855++;
    }

    @ObfuscatedName("gp.fs(B)V")
    public static final void method3599() {
        if (!Statics.field1866) {
            return;
        }
        if (Statics.field65 != null) {
            Statics.field65.method5001();
        }
        for (int var0 = 0; var0 < class84.field1199; var0++) {
            class62 var1 = field735[class84.field1205[var0]];
            var1.method1034();
        }
        Statics.field1866 = false;
    }

    @ObfuscatedName("x.fn(I)V")
    public static final void method303() {
        int[] var0 = class84.field1205;
        for (int var1 = 0; var1 < class84.field1199; var1++) {
            class62 var2 = field735[var0[var1]];
            if (var2 != null && var2.field924 > 0) {
                var2.field924--;
                if (var2.field924 == 0) {
                    var2.field955 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field661; var3++) {
            int var4 = field667[var3];
            class74 var5 = field660[var4];
            if (var5 != null && var5.field924 > 0) {
                var5.field924--;
                if (var5.field924 == 0) {
                    var5.field955 = null;
                }
            }
        }
    }

    @ObfuscatedName("bz.fr(B)V")
    public static final void method1680() {
        int var0 = Statics.field994 * 128 + 64;
        int var1 = Statics.field254 * 128 + 64;
        int var2 = method3573(var0, var1, Statics.field348) - Statics.field474;
        if (Statics.field81 < var0) {
            Statics.field81 += Statics.field1051 * (var0 - Statics.field81) / 1000 + Statics.field380;
            if (Statics.field81 > var0) {
                Statics.field81 = var0;
            }
        }
        if (Statics.field81 > var0) {
            Statics.field81 -= Statics.field1051 * (Statics.field81 - var0) / 1000 + Statics.field380;
            if (Statics.field81 < var0) {
                Statics.field81 = var0;
            }
        }
        if (Statics.field43 < var2) {
            Statics.field43 += Statics.field1051 * (var2 - Statics.field43) / 1000 + Statics.field380;
            if (Statics.field43 > var2) {
                Statics.field43 = var2;
            }
        }
        if (Statics.field43 > var2) {
            Statics.field43 -= Statics.field1051 * (Statics.field43 - var2) / 1000 + Statics.field380;
            if (Statics.field43 < var2) {
                Statics.field43 = var2;
            }
        }
        if (Statics.field1509 < var1) {
            Statics.field1509 += Statics.field1051 * (var1 - Statics.field1509) / 1000 + Statics.field380;
            if (Statics.field1509 > var1) {
                Statics.field1509 = var1;
            }
        }
        if (Statics.field1509 > var1) {
            Statics.field1509 -= Statics.field1051 * (Statics.field1509 - var1) / 1000 + Statics.field380;
            if (Statics.field1509 < var1) {
                Statics.field1509 = var1;
            }
        }
        int var3 = Statics.field1955 * 128 + 64;
        int var4 = Statics.field2303 * 128 + 64;
        int var5 = method3573(var3, var4, Statics.field348) - Statics.field2049;
        int var6 = var3 - Statics.field81;
        int var7 = var5 - Statics.field43;
        int var8 = var4 - Statics.field1509;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field2504 < var10) {
            Statics.field2504 += Statics.field1868 * (var10 - Statics.field2504) / 1000 + Statics.field2068;
            if (Statics.field2504 > var10) {
                Statics.field2504 = var10;
            }
        }
        if (Statics.field2504 > var10) {
            Statics.field2504 -= Statics.field1868 * (Statics.field2504 - var10) / 1000 + Statics.field2068;
            if (Statics.field2504 < var10) {
                Statics.field2504 = var10;
            }
        }
        int var12 = var11 - Statics.field71;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field71 += Statics.field1868 * var12 / 1000 + Statics.field2068;
            Statics.field71 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field71 -= Statics.field1868 * -var12 / 1000 + Statics.field2068;
            Statics.field71 &= 0x7FF;
        }
        int var13 = var11 - Statics.field71;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field71 = var11;
        }
    }

    @ObfuscatedName("bh.fz(B)V")
    public static final void method1020() {
        if (field694 == 0) {
            int var0 = Statics.field341.field933;
            int var1 = Statics.field341.field964;
            if (Statics.field63 - var0 < -500 || Statics.field63 - var0 > 500 || Statics.field1714 - var1 < -500 || Statics.field1714 - var1 > 500) {
                Statics.field63 = var0;
                Statics.field1714 = var1;
            }
            if (Statics.field63 != var0) {
                Statics.field63 += (var0 - Statics.field63) / 16;
            }
            if (Statics.field1714 != var1) {
                Statics.field1714 += (var1 - Statics.field1714) / 16;
            }
            int var2 = Statics.field63 >> 7;
            int var3 = Statics.field1714 >> 7;
            int var4 = method3573(Statics.field63, Statics.field1714, Statics.field348);
            int var5 = 0;
            if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                        int var8 = Statics.field348;
                        if (var8 < 3 && (class51.field498[1][var6][var7] & 0x2) == 2) {
                            var8++;
                        }
                        int var9 = var4 - class51.field487[var8][var6][var7];
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
            if (var10 > field705) {
                field705 += (var10 - field705) / 24;
            } else if (var10 < field705) {
                field705 += (var10 - field705) / 80;
            }
            Statics.field2017 = method3573(Statics.field341.field933, Statics.field341.field964, Statics.field348) - field695;
        } else if (field694 == 1) {
            method181();
            short var11 = -1;
            if (class40.field362[33]) {
                var11 = 0;
            } else if (class40.field362[49]) {
                var11 = 1024;
            }
            if (class40.field362[48]) {
                if (var11 == 0) {
                    var11 = 1792;
                } else if (var11 == 1024) {
                    var11 = 1280;
                } else {
                    var11 = 1536;
                }
            } else if (class40.field362[50]) {
                if (var11 == 0) {
                    var11 = 256;
                } else if (var11 == 1024) {
                    var11 = 768;
                } else {
                    var11 = 512;
                }
            }
            byte var12 = 0;
            if (class40.field362[35]) {
                var12 = -1;
            } else if (class40.field362[51]) {
                var12 = 1;
            }
            int var13 = 0;
            if (var11 >= 0 || var12 != 0) {
                int var14 = class40.field362[81] ? field700 : field803;
                var13 = var14 * 16;
                field628 = var11;
                field698 = var12;
            }
            if (field814 < var13) {
                field814 += var13 / 8;
                if (field814 > var13) {
                    field814 = var13;
                }
            } else if (field814 > var13) {
                field814 = field814 * 9 / 10;
            }
            if (field814 > 0) {
                int var15 = field814 / 16;
                if (field628 >= 0) {
                    int var16 = field628 - Statics.field71 & 0x7FF;
                    int var17 = class125.field1731[var16];
                    int var18 = class125.field1745[var16];
                    Statics.field63 += var15 * var17 / 65536;
                    Statics.field1714 += var15 * var18 / 65536;
                }
                if (field698 != 0) {
                    Statics.field2017 += field698 * var15;
                    if (Statics.field2017 > 0) {
                        Statics.field2017 = 0;
                    }
                }
            } else {
                field628 = -1;
                field698 = -1;
            }
            if (class40.field362[13]) {
                method2546();
            }
        }
        if (class49.field466 == 4 && Statics.field2577) {
            int var19 = class49.field458 * -53945113 - field693 * -53945113;
            field691 = var19 * 2;
            field693 = (var19 == -1 || var19 == 1 ? class49.field458 * -53945113 : (field693 * -53945113 + class49.field458 * -53945113) / 2) * -349931817;
            int var20 = field848 - class49.field456;
            field690 = var20 * 2;
            field848 = var20 == -1 || var20 == 1 ? class49.field456 : (field848 + class49.field456) / 2;
        } else {
            if (class40.field362[96]) {
                field690 += (-24 - field690) / 2;
            } else if (class40.field362[97]) {
                field690 += (24 - field690) / 2;
            } else {
                field690 /= 2;
            }
            if (class40.field362[98]) {
                field691 += (12 - field691) / 2;
            } else if (class40.field362[99]) {
                field691 += (-12 - field691) / 2;
            } else {
                field691 /= 2;
            }
            field693 = class49.field458;
            field848 = class49.field456;
        }
        field689 = field690 / 2 + field689 & 0x7FF;
        field688 += field691 / 2;
        if (field688 < 128) {
            field688 = 128;
        }
        if (field688 > 383) {
            field688 = 383;
        }
    }

    @ObfuscatedName("go.fj(Lbj;II)V")
    public static final void method3515(class65 arg0, int arg1) {
        if (arg0.field954 > field631) {
            method131(arg0);
        } else if (arg0.field907 >= field631) {
            method4216(arg0);
        } else {
            method625(arg0);
        }
        if (arg0.field933 < 128 || arg0.field964 < 128 || arg0.field933 >= 13184 || arg0.field964 >= 13184) {
            arg0.field944 = -1;
            arg0.field941 = -1;
            arg0.field954 = 0;
            arg0.field907 = 0;
            arg0.field933 = arg0.field927[0] * 128 + arg0.field911 * 64;
            arg0.field964 = arg0.field940[0] * 128 + arg0.field911 * 64;
            arg0.method1452();
        }
        if (Statics.field341 == arg0 && (arg0.field933 < 1536 || arg0.field964 < 1536 || arg0.field933 >= 11776 || arg0.field964 >= 11776)) {
            arg0.field944 = -1;
            arg0.field941 = -1;
            arg0.field954 = 0;
            arg0.field907 = 0;
            arg0.field933 = arg0.field927[0] * 128 + arg0.field911 * 64;
            arg0.field964 = arg0.field940[0] * 128 + arg0.field911 * 64;
            arg0.method1452();
        }
        method1679(arg0);
        arg0.field926 = false;
        if (arg0.field937 != -1) {
            class276 var2 = class276.method115(arg0.field937);
            if (var2 == null || var2.field3566 == null) {
                arg0.field937 = -1;
            } else {
                arg0.field909++;
                if (arg0.field938 < var2.field3566.length && arg0.field909 > var2.field3568[arg0.field938]) {
                    arg0.field909 = 1;
                    arg0.field938++;
                    method935(var2, arg0.field938, arg0.field933, arg0.field964);
                }
                if (arg0.field938 >= var2.field3566.length) {
                    arg0.field909 = 0;
                    arg0.field938 = 0;
                    method935(var2, arg0.field938, arg0.field933, arg0.field964);
                }
            }
        }
        if (arg0.field941 != -1 && field631 >= arg0.field948) {
            if (arg0.field931 < 0) {
                arg0.field931 = 0;
            }
            int var3 = class261.method2850(arg0.field941).field3301;
            if (var3 == -1) {
                arg0.field941 = -1;
            } else {
                class276 var4 = class276.method115(var3);
                if (var4 == null || var4.field3566 == null) {
                    arg0.field941 = -1;
                } else {
                    arg0.field947++;
                    if (arg0.field931 < var4.field3566.length && arg0.field947 > var4.field3568[arg0.field931]) {
                        arg0.field947 = 1;
                        arg0.field931++;
                        method935(var4, arg0.field931, arg0.field933, arg0.field964);
                    }
                    if (arg0.field931 >= var4.field3566.length && (arg0.field931 < 0 || arg0.field931 >= var4.field3566.length)) {
                        arg0.field941 = -1;
                    }
                }
            }
        }
        if (arg0.field944 != -1 && arg0.field943 <= 1) {
            class276 var5 = class276.method115(arg0.field944);
            if (var5.field3576 == 1 && arg0.field967 > 0 && arg0.field954 <= field631 && arg0.field907 < field631) {
                arg0.field943 = 1;
                return;
            }
        }
        if (arg0.field944 != -1 && arg0.field943 == 0) {
            class276 var6 = class276.method115(arg0.field944);
            if (var6 == null || var6.field3566 == null) {
                arg0.field944 = -1;
            } else {
                arg0.field942++;
                if (arg0.field932 < var6.field3566.length && arg0.field942 > var6.field3568[arg0.field932]) {
                    arg0.field942 = 1;
                    arg0.field932++;
                    method935(var6, arg0.field932, arg0.field933, arg0.field964);
                }
                if (arg0.field932 >= var6.field3566.length) {
                    arg0.field932 -= var6.field3570;
                    arg0.field951++;
                    if (arg0.field951 >= var6.field3573) {
                        arg0.field944 = -1;
                    } else if (arg0.field932 >= 0 && arg0.field932 < var6.field3566.length) {
                        method935(var6, arg0.field932, arg0.field933, arg0.field964);
                    } else {
                        arg0.field944 = -1;
                    }
                }
                arg0.field926 = var6.field3572;
            }
        }
        if (arg0.field943 > 0) {
            arg0.field943--;
        }
    }

    @ObfuscatedName("d.fk(Lbj;I)V")
    public static final void method131(class65 arg0) {
        int var1 = arg0.field954 - field631;
        int var2 = arg0.field950 * 128 + arg0.field911 * 64;
        int var3 = arg0.field952 * 128 + arg0.field911 * 64;
        arg0.field933 += (var2 - arg0.field933) / var1;
        arg0.field964 += (var3 - arg0.field964) / var1;
        arg0.field966 = 0;
        arg0.field961 = arg0.field956;
    }

    @ObfuscatedName("hg.fo(Lbj;I)V")
    public static final void method4216(class65 arg0) {
        if (field631 == arg0.field907 || arg0.field944 == -1 || arg0.field943 != 0 || arg0.field942 + 1 > class276.method115(arg0.field944).field3568[arg0.field932]) {
            int var1 = arg0.field907 - arg0.field954;
            int var2 = field631 - arg0.field954;
            int var3 = arg0.field950 * 128 + arg0.field911 * 64;
            int var4 = arg0.field952 * 128 + arg0.field911 * 64;
            int var5 = arg0.field918 * 128 + arg0.field911 * 64;
            int var6 = arg0.field953 * 128 + arg0.field911 * 64;
            arg0.field933 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field964 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field966 = 0;
        arg0.field961 = arg0.field956;
        arg0.field921 = arg0.field961;
    }

    @ObfuscatedName("ak.fa(Lbj;I)V")
    public static final void method625(class65 arg0) {
        arg0.field937 = arg0.field913;
        if (arg0.field962 == 0) {
            arg0.field966 = 0;
            return;
        }
        if (arg0.field944 != -1 && arg0.field943 == 0) {
            class276 var1 = class276.method115(arg0.field944);
            if (arg0.field967 > 0 && var1.field3576 == 0) {
                arg0.field966++;
                return;
            }
            if (arg0.field967 <= 0 && var1.field3579 == 0) {
                arg0.field966++;
                return;
            }
        }
        int var2 = arg0.field933;
        int var3 = arg0.field964;
        int var4 = arg0.field927[arg0.field962 - 1] * 128 + arg0.field911 * 64;
        int var5 = arg0.field940[arg0.field962 - 1] * 128 + arg0.field911 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field961 = 1280;
            } else if (var3 > var5) {
                arg0.field961 = 1792;
            } else {
                arg0.field961 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field961 = 768;
            } else if (var3 > var5) {
                arg0.field961 = 256;
            } else {
                arg0.field961 = 512;
            }
        } else if (var3 < var5) {
            arg0.field961 = 1024;
        } else if (var3 > var5) {
            arg0.field961 = 0;
        }
        byte var6 = arg0.field965[arg0.field962 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field933 = var4;
            arg0.field964 = var5;
            arg0.field962--;
            if (arg0.field967 > 0) {
                arg0.field967--;
            }
            return;
        }
        int var7 = arg0.field961 - arg0.field921 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field917;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field916;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field919;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field945;
        }
        if (var8 == -1) {
            var8 = arg0.field916;
        }
        arg0.field937 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class74) {
            var10 = ((class74) arg0).field1077.field3546;
        }
        if (var10) {
            if (arg0.field961 != arg0.field921 && arg0.field934 == -1 && arg0.field959 != 0) {
                var9 = 2;
            }
            if (arg0.field962 > 2) {
                var9 = 6;
            }
            if (arg0.field962 > 3) {
                var9 = 8;
            }
            if (arg0.field966 > 0 && arg0.field962 > 1) {
                var9 = 8;
                arg0.field966--;
            }
        } else {
            if (arg0.field962 > 1) {
                var9 = 6;
            }
            if (arg0.field962 > 2) {
                var9 = 8;
            }
            if (arg0.field966 > 0 && arg0.field962 > 1) {
                var9 = 8;
                arg0.field966--;
            }
        }
        if (var6 == 2) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field937 == arg0.field916 && arg0.field920 != -1) {
            arg0.field937 = arg0.field920;
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field933 += var9;
                if (arg0.field933 > var4) {
                    arg0.field933 = var4;
                }
            } else if (var2 > var4) {
                arg0.field933 -= var9;
                if (arg0.field933 < var4) {
                    arg0.field933 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field964 += var9;
                if (arg0.field964 > var5) {
                    arg0.field964 = var5;
                }
            } else if (var3 > var5) {
                arg0.field964 -= var9;
                if (arg0.field964 < var5) {
                    arg0.field964 = var5;
                }
            }
        }
        if (arg0.field933 == var4 && arg0.field964 == var5) {
            arg0.field962--;
            if (arg0.field967 > 0) {
                arg0.field967--;
            }
        }
    }

    @ObfuscatedName("bz.fv(Lbj;I)V")
    public static final void method1679(class65 arg0) {
        if (arg0.field959 == 0) {
            return;
        }
        if (arg0.field934 != -1) {
            class65 var1 = null;
            if (arg0.field934 < 32768) {
                var1 = field660[arg0.field934];
            } else if (arg0.field934 >= 32768) {
                var1 = field735[arg0.field934 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field933 - var1.field933;
                int var3 = arg0.field964 - var1.field964;
                if (var2 != 0 || var3 != 0) {
                    arg0.field961 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field935) {
                arg0.field934 = -1;
                arg0.field935 = false;
            }
        }
        if (arg0.field936 != -1 && (arg0.field962 == 0 || arg0.field966 > 0)) {
            arg0.field961 = arg0.field936;
            arg0.field936 = -1;
        }
        int var4 = arg0.field961 - arg0.field921 & 0x7FF;
        if (var4 == 0 && arg0.field935) {
            arg0.field934 = -1;
            arg0.field935 = false;
        }
        if (var4 == 0) {
            arg0.field910 = 0;
            return;
        }
        arg0.field910++;
        if (var4 > 1024) {
            arg0.field921 -= arg0.field959;
            boolean var5 = true;
            if (var4 < arg0.field959 || var4 > 2048 - arg0.field959) {
                arg0.field921 = arg0.field961;
                var5 = false;
            }
            if (arg0.field937 == arg0.field913 && (arg0.field910 > 25 || var5)) {
                if (arg0.field914 == -1) {
                    arg0.field937 = arg0.field916;
                } else {
                    arg0.field937 = arg0.field914;
                }
            }
        } else {
            arg0.field921 += arg0.field959;
            boolean var6 = true;
            if (var4 < arg0.field959 || var4 > 2048 - arg0.field959) {
                arg0.field921 = arg0.field961;
                var6 = false;
            }
            if (arg0.field937 == arg0.field913 && (arg0.field910 > 25 || var6)) {
                if (arg0.field915 == -1) {
                    arg0.field937 = arg0.field916;
                } else {
                    arg0.field937 = arg0.field915;
                }
            }
        }
        arg0.field921 &= 0x7FF;
    }

    @ObfuscatedName("ed.fd(Lbp;III)V")
    public static void method2885(class62 arg0, int arg1, int arg2) {
        if (arg0.field944 == arg1 && arg1 != -1) {
            int var3 = class276.method115(arg1).field3569;
            if (var3 == 1) {
                arg0.field932 = 0;
                arg0.field942 = 0;
                arg0.field943 = arg2;
                arg0.field951 = 0;
            }
            if (var3 == 2) {
                arg0.field951 = 0;
            }
        } else if (arg1 == -1 || arg0.field944 == -1 || class276.method115(arg1).field3564 >= class276.method115(arg0.field944).field3564) {
            arg0.field944 = arg1;
            arg0.field932 = 0;
            arg0.field942 = 0;
            arg0.field943 = arg2;
            arg0.field951 = 0;
            arg0.field967 = arg0.field962;
        }
    }

    @ObfuscatedName("go.fb(II)V")
    public static void method3517(int arg0) {
        field866 = 0L;
        if (arg0 >= 2) {
            field852 = true;
        } else {
            field852 = false;
        }
        int var1 = field852 ? 2 : 1;
        if (var1 == 1) {
            Statics.field391.method731(765, 503);
        } else {
            Statics.field391.method731(7680, 2160);
        }
        if (field629 >= 25) {
            method1858();
        }
    }

    @ObfuscatedName("cb.fp(I)V")
    public static void method1858() {
        class175 var0 = class175.method107(class172.field2216, field830.field1266);
        class192 var1 = var0.field2311;
        int var2 = field852 ? 2 : 1;
        var1.method3258(var2);
        var0.field2311.method3259(Statics.field2428);
        var0.field2311.method3259(Statics.field117);
        field830.method1875(var0);
    }

    @ObfuscatedName("client.j(S)V")
    public final void method729() {
        field866 = class187.method3154() + 500L;
        this.method1094();
        if (field672 != -1) {
            this.method1401(true);
        }
    }

    @ObfuscatedName("client.fg(I)V")
    public void method1094() {
        int var1 = Statics.field2428;
        int var2 = Statics.field117;
        if (this.field435 < var1) {
            int var3 = this.field435;
        }
        if (this.field427 < var2) {
            int var4 = this.field427;
        }
        if (Statics.field580 == null) {
            return;
        }
        try {
            client var5 = Statics.field391;
            int var6 = field852 ? 2 : 1;
            Object[] var7 = new Object[] { var6 };
            JSObject.getWindow(var5).call("resize", var7);
        } catch (Throwable var9) {
        }
    }

    @ObfuscatedName("client.fi(I)V")
    public final void method1095() {
        if (field672 != -1) {
            method1672(field672);
        }
        for (int var1 = 0; var1 < field882; var1++) {
            if (field822[var1]) {
                field793[var1] = true;
            }
            field824[var1] = field822[var1];
            field822[var1] = false;
        }
        field821 = field631;
        field641 = -1;
        field769 = -1;
        Statics.field969 = null;
        if (field672 != -1) {
            field882 = 0;
            method4397(field672, 0, 0, Statics.field2428, Statics.field117, 0, 0, -1);
        }
        class318.method5367();
        if (field669) {
            if (field845 == 1) {
                Statics.field163[field808 / 100].method5502(field720 - 8, field721 - 8);
            }
            if (field845 == 2) {
                Statics.field163[field808 / 100 + 4].method5502(field720 - 8, field721 - 8);
            }
        }
        if (field755) {
            int var6 = Statics.field129;
            int var7 = Statics.field184;
            int var8 = Statics.field1489;
            int var9 = Statics.field532;
            int var10 = 6116423;
            class318.method5408(var6, var7, var8, var9, var10);
            class318.method5408(var6 + 1, var7 + 1, var8 - 2, 16, 0);
            class318.method5412(var6 + 1, var7 + 18, var8 - 2, var9 - 19, 0);
            Statics.field120.method5159(class240.field2977, var6 + 3, var7 + 14, var10, -1);
            int var11 = class49.field456;
            int var12 = class49.field458 * -53945113;
            for (int var13 = 0; var13 < field756; var13++) {
                int var14 = (field756 - 1 - var13) * 15 + var7 + 31;
                int var15 = 16777215;
                if (var11 > var6 && var11 < var6 + var8 && var12 > var14 - 13 && var12 < var14 + 3) {
                    var15 = 16776960;
                }
                Statics.field120.method5159(method4247(var13), var6 + 3, var14, var15, 0);
            }
            method1692(Statics.field129, Statics.field184, Statics.field1489, Statics.field532);
        } else if (field641 != -1) {
            int var2 = field641;
            int var3 = field769;
            if ((field756 >= 2 || field772 != 0 || field774) && field767) {
                int var4 = method2086();
                String var5;
                if (field772 == 1 && field756 < 2) {
                    var5 = class240.field3088 + class240.field2984 + field773 + " " + class76.field1096;
                } else if (field774 && field756 < 2) {
                    var5 = field777 + class240.field2984 + field785 + " " + class76.field1096;
                } else {
                    var5 = method4247(var4);
                }
                if (field756 > 2) {
                    var5 = var5 + class76.method2125(16777215) + " " + '/' + " " + (field756 - 2) + class240.field3006;
                }
                Statics.field120.method5167(var5, var2 + 4, var3 + 15, 16777215, 0, field631 / 1000);
            }
        }
        if (field783 == 3) {
            for (int var16 = 0; var16 < field882; var16++) {
                if (field824[var16]) {
                    class318.method5375(field825[var16], field826[var16], field827[var16], field828[var16], 16711935, 128);
                } else if (field793[var16]) {
                    class318.method5375(field825[var16], field826[var16], field827[var16], field828[var16], 16711680, 128);
                }
            }
        }
        Statics.method306(Statics.field348, Statics.field341.field933, Statics.field341.field964, field681);
        field681 = 0;
    }

    @ObfuscatedName("k.ft(Ljava/lang/String;ZB)V")
    public static final void method43(String arg0, boolean arg1) {
        if (!field734) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field1065.method5156(arg0, 250);
        int var6 = Statics.field1065.method5157(arg0, 250) * 13;
        class318.method5408(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class318.method5412(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field1065.method5209(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method463(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field195.method700(0, 0);
        } else {
            method1692(var3, var4, var5, var6);
        }
    }

    @ObfuscatedName("an.fe(IIIIZB)V")
    public static final void method487(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field636 - field867) * var5 / 100 + field867;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field873) {
            short var8 = field873;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field872) {
                var6 = field872;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class318.method5367();
                    class318.method5408(arg0, arg1, var10, arg3, -16777216);
                    class318.method5408(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field834) {
            short var11 = field834;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field871) {
                var6 = field871;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class318.method5367();
                    class318.method5408(arg0, arg1, arg2, var13, -16777216);
                    class318.method5408(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field870 - field869) * var5 / 100 + field869;
        field879 = arg3 * var6 * var14 / 85504 << 1;
        if (field877 != arg2 || field878 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class125.field1731[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class128.method2691(var15, 500, 800, arg2, arg3);
        }
        field837 = arg0;
        field733 = arg1;
        field877 = arg2;
        field878 = arg3;
    }

    @ObfuscatedName("ap.fc(Lbp;ZB)V")
    public static void method745(class62 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method1040() || arg0.field603) {
            return;
        }
        arg0.field592 = false;
        if ((field624 && class84.field1199 > 50 || class84.field1199 > 200) && arg1 && arg0.field937 == arg0.field913) {
            arg0.field592 = true;
        }
        int var2 = arg0.field933 >> 7;
        int var3 = arg0.field964 >> 7;
        if (var2 < 0 || var2 >= 104 || var3 < 0 || var3 >= 104) {
            return;
        }
        long var4 = class123.method3900(0, 0, 0, false, arg0.field606);
        if (arg0.field597 != null && field631 >= arg0.field586 && field631 < arg0.field596) {
            arg0.field592 = false;
            arg0.field591 = method3573(arg0.field933, arg0.field964, Statics.field348);
            arg0.field912 = field631;
            Statics.field267.method2763(Statics.field348, arg0.field933, arg0.field964, arg0.field591, 60, arg0, arg0.field921, var4, arg0.field598, arg0.field601, arg0.field600, arg0.field588);
            return;
        }
        if ((arg0.field933 & 0x7F) == 64 && (arg0.field964 & 0x7F) == 64) {
            if (field621 == field692[var2][var3]) {
                return;
            }
            field692[var2][var3] = field621;
        }
        arg0.field591 = method3573(arg0.field933, arg0.field964, Statics.field348);
        arg0.field912 = field631;
        Statics.field267.method2715(Statics.field348, arg0.field933, arg0.field964, arg0.field591, 60, arg0, arg0.field921, var4, arg0.field926);
    }

    @ObfuscatedName("hs.gs(ZI)V")
    public static final void method3898(boolean arg0) {
        for (int var1 = 0; var1 < field661; var1++) {
            class74 var2 = field660[field667[var1]];
            if (var2 != null && var2.method1040() && var2.field1077.field3537 == arg0 && var2.field1077.method4815()) {
                int var3 = var2.field933 >> 7;
                int var4 = var2.field964 >> 7;
                if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
                    if (var2.field911 == 1 && (var2.field933 & 0x7F) == 64 && (var2.field964 & 0x7F) == 64) {
                        if (field621 == field692[var3][var4]) {
                            continue;
                        }
                        field692[var3][var4] = field621;
                    }
                    long var5 = class123.method3900(0, 0, 1, !var2.field1077.field3512, field667[var1]);
                    var2.field912 = field631;
                    Statics.field267.method2715(Statics.field348, var2.field933, var2.field964, method3573(var2.field933 + (var2.field911 * 64 - 64), var2.field964 + (var2.field911 * 64 - 64), Statics.field348), var2.field911 * 64 - 64 + 60, var2, var2.field921, var5, var2.field926);
                }
            }
        }
    }

    @ObfuscatedName("bm.gv(B)V")
    public static final void method1673() {
        for (class72 var0 = (class72) field750.method3792(); var0 != null; var0 = (class72) field750.method3800()) {
            if (Statics.field348 != var0.field1066 || var0.field1064) {
                var0.method3787();
            } else if (field631 >= var0.field1057) {
                var0.method1675(field681);
                if (var0.field1064) {
                    var0.method3787();
                } else {
                    Statics.field267.method2715(var0.field1066, var0.field1058, var0.field1059, var0.field1062, 60, var0, 0, -1L, false);
                }
            }
        }
    }

    @ObfuscatedName("at.gx(I)I")
    public static final int method695() {
        if (Statics.field580.field997) {
            return Statics.field348;
        } else {
            int var0 = method3573(Statics.field81, Statics.field1509, Statics.field348);
            return var0 - Statics.field43 >= 800 || (class51.field498[Statics.field348][Statics.field81 >> 7][Statics.field1509 >> 7] & 0x4) == 0 ? 3 : Statics.field348;
        }
    }

    @ObfuscatedName("aa.gk(III)V")
    public static final void method899(int arg0, int arg1) {
        if (field683 == 2) {
            method1796((field642 - Statics.field6 << 7) + field645, (field643 - Statics.field72 << 7) + field646, field644 * 2);
            if (field718 > -1 && field631 % 20 < 10) {
                Statics.field385[0].method5502(field718 + arg0 - 12, field719 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("dp.gg(B)Z")
    public static boolean method2299() {
        return (field739 & 0x1) != 0;
    }

    @ObfuscatedName("k.go(I)Z")
    public static boolean method32() {
        return (field739 & 0x2) != 0;
    }

    @ObfuscatedName("p.gw(I)Z")
    public static boolean method104() {
        return (field739 & 0x8) != 0;
    }

    @ObfuscatedName("ba.gr(Lbp;I)Z")
    public static boolean method974(class62 arg0) {
        if (field739 == 0) {
            return false;
        } else if (Statics.field341 == arg0) {
            return method104();
        } else {
            boolean var1 = (field739 & 0x4) != 0;
            return var1 || method2299() && arg0.method1065() || method32() && arg0.method1063();
        }
    }

    @ObfuscatedName("fc.gh(Lbj;IIIIII)V")
    public static final void method3242(class65 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method1040()) {
            return;
        }
        if (arg0 instanceof class74) {
            class274 var6 = ((class74) arg0).field1077;
            if (var6.field3542 != null) {
                var6 = var6.method4814();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class84.field1199;
        int[] var8 = class84.field1205;
        byte var9 = 0;
        if (arg1 < var7 && field631 == arg0.field912 && method974((class62) arg0)) {
            class62 var10 = (class62) arg0;
            if (arg1 < var7) {
                Statics.method2968(arg0, arg0.field958 + 15);
                class302 var11 = (class302) field670.get(class298.field3707);
                byte var12 = 9;
                var11.method5162(var10.field593.method5082(), field718 + arg2, field719 + arg3 - var12, 16777215, 0);
                var9 = 18;
            }
        }
        int var13 = -2;
        if (!arg0.field908.method3760()) {
            Statics.method2968(arg0, arg0.field958 + 15);
            for (class73 var14 = (class73) arg0.field908.method3757(); var14 != null; var14 = (class73) arg0.field908.method3779()) {
                class66 var15 = var14.method1684(field631);
                if (var15 != null) {
                    class264 var16 = var14.field1069;
                    class322 var17 = var16.method4590();
                    class322 var18 = var16.method4579();
                    int var19 = 0;
                    int var20;
                    if (var17 == null || var18 == null) {
                        var20 = var16.field3343;
                    } else {
                        if (var16.field3342 * 2 < var18.field3823) {
                            var19 = var16.field3342;
                        }
                        var20 = var18.field3823 - var19 * 2;
                    }
                    int var21 = 255;
                    boolean var22 = true;
                    int var23 = field631 - var15.field971;
                    int var24 = var15.field972 * var20 / var16.field3343;
                    int var27;
                    if (var15.field973 > var23) {
                        int var25 = var16.field3341 == 0 ? 0 : var23 / var16.field3341 * var16.field3341;
                        int var26 = var15.field976 * var20 / var16.field3343;
                        var27 = (var24 - var26) * var25 / var15.field973 + var26;
                    } else {
                        var27 = var24;
                        int var28 = var15.field973 + var16.field3339 - var23;
                        if (var16.field3337 >= 0) {
                            var21 = (var28 << 8) / (var16.field3339 - var16.field3337);
                        }
                    }
                    if (var15.field972 > 0 && var27 < 1) {
                        var27 = 1;
                    }
                    if (var17 == null || var18 == null) {
                        var13 += 5;
                        if (field718 > -1) {
                            int var34 = field718 + arg2 - (var20 >> 1);
                            int var35 = field719 + arg3 - var13;
                            class318.method5408(var34, var35, var27, 5, 65280);
                            class318.method5408(var27 + var34, var35, var20 - var27, 5, 16711680);
                        }
                        var13 += 2;
                    } else {
                        int var29;
                        if (var20 == var27) {
                            var29 = var19 * 2 + var27;
                        } else {
                            var29 = var19 + var27;
                        }
                        int var30 = var17.field3825;
                        var13 += var30;
                        int var31 = field718 + arg2 - (var20 >> 1);
                        int var32 = field719 + arg3 - var13;
                        int var33 = var31 - var19;
                        if (var21 >= 0 && var21 < 255) {
                            var17.method5508(var33, var32, var21);
                            class318.method5369(var33, var32, var29 + var33, var30 + var32);
                            var18.method5508(var33, var32, var21);
                        } else {
                            var17.method5502(var33, var32);
                            class318.method5369(var33, var32, var29 + var33, var30 + var32);
                            var18.method5502(var33, var32);
                        }
                        class318.method5394(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var13 += 2;
                    }
                } else if (var14.method1687()) {
                    var14.method3787();
                }
            }
        }
        if (var13 == -2) {
            var13 += 7;
        }
        int var36 = var9 + var13;
        if (arg1 < var7) {
            class62 var37 = (class62) arg0;
            if (var37.field603) {
                return;
            }
            if (var37.field585 != -1 || var37.field583 != -1) {
                Statics.method2968(arg0, arg0.field958 + 15);
                if (field718 > -1) {
                    if (var37.field585 != -1) {
                        var36 += 25;
                        Statics.field32[var37.field585].method5502(field718 + arg2 - 12, field719 + arg3 - var36);
                    }
                    if (var37.field583 != -1) {
                        var36 += 25;
                        Statics.field505[var37.field583].method5502(field718 + arg2 - 12, field719 + arg3 - var36);
                    }
                }
            }
            if (arg1 >= 0 && field683 == 10 && field619 == var8[arg1]) {
                Statics.method2968(arg0, arg0.field958 + 15);
                if (field718 > -1) {
                    int var38 = Statics.field385[1].field3825 + var36;
                    Statics.field385[1].method5502(field718 + arg2 - 12, field719 + arg3 - var38);
                }
            }
        } else {
            class274 var39 = ((class74) arg0).field1077;
            if (var39.field3542 != null) {
                var39 = var39.method4814();
            }
            if (var39.field3545 >= 0 && var39.field3545 < Statics.field505.length) {
                Statics.method2968(arg0, arg0.field958 + 15);
                if (field718 > -1) {
                    Statics.field505[var39.field3545].method5502(field718 + arg2 - 12, field719 + arg3 - 30);
                }
            }
            if (field683 == 1 && field640 == field667[arg1 - var7] && field631 % 20 < 10) {
                Statics.method2968(arg0, arg0.field958 + 15);
                if (field718 > -1) {
                    Statics.field385[0].method5502(field718 + arg2 - 12, field719 + arg3 - 28);
                }
            }
        }
        if (arg0.field955 != null && (arg1 >= var7 || !arg0.field923 && (field833 == 4 || !arg0.field922 && (field833 == 0 || field833 == 3 || field833 == 1 && ((class62) arg0).method1065())))) {
            Statics.method2968(arg0, arg0.field958);
            if (field718 > -1 && field706 < field707) {
                field723[field706] = Statics.field120.method5154(arg0.field955) / 2;
                field710[field706] = Statics.field120.field3728;
                field708[field706] = field718;
                field836[field706] = field719;
                field712[field706] = arg0.field925;
                field713[field706] = arg0.field939;
                field864[field706] = arg0.field924;
                field637[field706] = arg0.field955;
                field706++;
            }
        }
        for (int var40 = 0; var40 < 4; var40++) {
            int var41 = arg0.field930[var40];
            int var42 = arg0.field928[var40];
            class270 var43 = null;
            int var44 = 0;
            if (var42 >= 0) {
                if (var41 <= field631) {
                    continue;
                }
                var43 = class270.method938(arg0.field928[var40]);
                var44 = var43.field3385;
                if (var43 != null && var43.field3395 != null) {
                    var43 = var43.method4674();
                    if (var43 == null) {
                        arg0.field930[var40] = -1;
                        continue;
                    }
                }
            } else if (var41 < 0) {
                continue;
            }
            int var45 = arg0.field963[var40];
            class270 var46 = null;
            if (var45 >= 0) {
                var46 = class270.method938(var45);
                if (var46 != null && var46.field3395 != null) {
                    var46 = var46.method4674();
                }
            }
            if (var41 - var44 <= field631) {
                if (var43 == null) {
                    arg0.field930[var40] = -1;
                } else {
                    Statics.method2968(arg0, arg0.field958 / 2);
                    if (field718 > -1) {
                        if (var40 == 1) {
                            field719 -= 20;
                        }
                        if (var40 == 2) {
                            field718 -= 15;
                            field719 -= 10;
                        }
                        if (var40 == 3) {
                            field718 += 15;
                            field719 -= 10;
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
                        class322 var59 = null;
                        class322 var60 = null;
                        class322 var61 = null;
                        class322 var62 = null;
                        int var63 = 0;
                        int var64 = 0;
                        int var65 = 0;
                        int var66 = 0;
                        int var67 = 0;
                        int var68 = 0;
                        int var69 = 0;
                        int var70 = 0;
                        int var71 = 0;
                        class322 var72 = var43.method4677();
                        if (var72 != null) {
                            var51 = var72.field3823;
                            int var73 = var72.field3825;
                            if (var73 > var71) {
                                var71 = var73;
                            }
                            var55 = var72.field3827;
                        }
                        class322 var74 = var43.method4681();
                        if (var74 != null) {
                            var52 = var74.field3823;
                            int var75 = var74.field3825;
                            if (var75 > var71) {
                                var71 = var75;
                            }
                            var56 = var74.field3827;
                        }
                        class322 var76 = var43.method4672();
                        if (var76 != null) {
                            var53 = var76.field3823;
                            int var77 = var76.field3825;
                            if (var77 > var71) {
                                var71 = var77;
                            }
                            var57 = var76.field3827;
                        }
                        class322 var78 = var43.method4684();
                        if (var78 != null) {
                            var54 = var78.field3823;
                            int var79 = var78.field3825;
                            if (var79 > var71) {
                                var71 = var79;
                            }
                            var58 = var78.field3827;
                        }
                        if (var46 != null) {
                            var59 = var46.method4677();
                            if (var59 != null) {
                                var63 = var59.field3823;
                                int var80 = var59.field3825;
                                if (var80 > var71) {
                                    var71 = var80;
                                }
                                var67 = var59.field3827;
                            }
                            var60 = var46.method4681();
                            if (var60 != null) {
                                var64 = var60.field3823;
                                int var81 = var60.field3825;
                                if (var81 > var71) {
                                    var71 = var81;
                                }
                                var68 = var60.field3827;
                            }
                            var61 = var46.method4672();
                            if (var61 != null) {
                                var65 = var61.field3823;
                                int var82 = var61.field3825;
                                if (var82 > var71) {
                                    var71 = var82;
                                }
                                var69 = var61.field3827;
                            }
                            var62 = var46.method4684();
                            if (var62 != null) {
                                var66 = var62.field3823;
                                int var83 = var62.field3825;
                                if (var83 > var71) {
                                    var71 = var83;
                                }
                                var70 = var62.field3827;
                            }
                        }
                        class301 var84 = var43.method4687();
                        if (var84 == null) {
                            var84 = Statics.field2004;
                        }
                        class301 var85;
                        if (var46 == null) {
                            var85 = Statics.field2004;
                        } else {
                            var85 = var46.method4687();
                            if (var85 == null) {
                                var85 = Statics.field2004;
                            }
                        }
                        Object var86 = null;
                        String var87 = null;
                        boolean var88 = false;
                        int var89 = 0;
                        String var90 = var43.method4671(arg0.field929[var40]);
                        int var91 = var84.method5154(var90);
                        if (var46 != null) {
                            var87 = var46.method4671(arg0.field960[var40]);
                            var89 = var85.method5154(var87);
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
                        int var108 = arg0.field930[var40] - field631;
                        int var109 = var43.field3389 - var43.field3389 * var108 / var43.field3385;
                        int var110 = var43.field3391 * var108 / var43.field3385 + -var43.field3391;
                        int var111 = field718 + arg2 - (var100 >> 1) + var109;
                        int var112 = field719 + arg3 - 12 + var110;
                        int var113 = var112;
                        int var114 = var71 + var112;
                        int var115 = var43.field3377 + var112 + 15;
                        int var116 = var115 - var84.field3729;
                        int var117 = var84.field3730 + var115;
                        if (var116 < var112) {
                            var113 = var116;
                        }
                        if (var117 > var114) {
                            var114 = var117;
                        }
                        int var118 = 0;
                        if (var46 != null) {
                            var118 = var46.field3377 + var112 + 15;
                            int var119 = var118 - var85.field3729;
                            int var120 = var85.field3730 + var118;
                            if (var119 < var113) {
                                ;
                            }
                            if (var120 > var114) {
                                ;
                            }
                        }
                        int var123 = 255;
                        if (var43.field3392 >= 0) {
                            var123 = (var108 << 8) / (var43.field3385 - var43.field3392);
                        }
                        if (var123 >= 0 && var123 < 255) {
                            if (var72 != null) {
                                var72.method5508(var95 + var111 - var55, var112, var123);
                            }
                            if (var76 != null) {
                                var76.method5508(var96 + var111 - var57, var112, var123);
                            }
                            if (var74 != null) {
                                for (int var124 = 0; var124 < var92; var124++) {
                                    var74.method5508(var52 * var124 + (var97 + var111 - var56), var112, var123);
                                }
                            }
                            if (var78 != null) {
                                var78.method5508(var101 + var111 - var58, var112, var123);
                            }
                            var84.method5160(var90, var98 + var111, var115, var43.field3384, 0, var123);
                            if (var46 != null) {
                                if (var59 != null) {
                                    var59.method5508(var102 + var111 - var67, var112, var123);
                                }
                                if (var61 != null) {
                                    var61.method5508(var103 + var111 - var69, var112, var123);
                                }
                                if (var60 != null) {
                                    for (int var125 = 0; var125 < var93; var125++) {
                                        var60.method5508(var64 * var125 + (var104 + var111 - var68), var112, var123);
                                    }
                                }
                                if (var62 != null) {
                                    var62.method5508(var105 + var111 - var70, var112, var123);
                                }
                                var85.method5160(var87, var106 + var111, var118, var46.field3384, 0, var123);
                            }
                        } else {
                            if (var72 != null) {
                                var72.method5502(var95 + var111 - var55, var112);
                            }
                            if (var76 != null) {
                                var76.method5502(var96 + var111 - var57, var112);
                            }
                            if (var74 != null) {
                                for (int var126 = 0; var126 < var92; var126++) {
                                    var74.method5502(var52 * var126 + (var97 + var111 - var56), var112);
                                }
                            }
                            if (var78 != null) {
                                var78.method5502(var101 + var111 - var58, var112);
                            }
                            var84.method5159(var90, var98 + var111, var115, var43.field3384 | 0xFF000000, 0);
                            if (var46 != null) {
                                if (var59 != null) {
                                    var59.method5502(var102 + var111 - var67, var112);
                                }
                                if (var61 != null) {
                                    var61.method5502(var103 + var111 - var69, var112);
                                }
                                if (var60 != null) {
                                    for (int var127 = 0; var127 < var93; var127++) {
                                        var60.method5502(var64 * var127 + (var104 + var111 - var68), var112);
                                    }
                                }
                                if (var62 != null) {
                                    var62.method5502(var105 + var111 - var70, var112);
                                }
                                var85.method5159(var87, var106 + var111, var118, var46.field3384 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("cs.gu(IIIB)V")
    public static final void method1796(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field718 = -1;
            field719 = -1;
            return;
        }
        int var3 = method3573(arg0, arg1, Statics.field348) - arg2;
        int var4 = arg0 - Statics.field81;
        int var5 = var3 - Statics.field43;
        int var6 = arg1 - Statics.field1509;
        int var7 = class125.field1731[Statics.field2504];
        int var8 = class125.field1745[Statics.field2504];
        int var9 = class125.field1731[Statics.field71];
        int var10 = class125.field1745[Statics.field71];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field718 = field879 * var11 / var15 + field877 / 2;
            field719 = field879 * var14 / var15 + field878 / 2;
        } else {
            field718 = -1;
            field719 = -1;
        }
    }

    @ObfuscatedName("gz.gp(IIII)I")
    public static final int method3573(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class51.field498[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class51.field487[var5][var3][var4] + class51.field487[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class51.field487[var5][var3][var4 + 1] + class51.field487[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("q.gi(IIIIIIB)V")
    public static final void method205(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class125.field1731[var6];
            int var12 = class125.field1745[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class125.field1731[var7];
            int var15 = class125.field1745[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field81 = arg0 - var8;
        Statics.field43 = arg1 - var9;
        Statics.field1509 = arg2 - var10;
        Statics.field2504 = arg3;
        Statics.field71 = arg4;
        if (field694 == 1 && field686 >= 2 && field631 % 50 == 0 && (Statics.field63 >> 7 != Statics.field341.field933 >> 7 || Statics.field1714 >> 7 != Statics.field341.field964 >> 7)) {
            int var17 = Statics.field341.field605;
            int var18 = (Statics.field63 >> 7) + Statics.field6;
            int var19 = (Statics.field1714 >> 7) + Statics.field72;
            method894(var18, var19, var17, true);
        }
    }

    @ObfuscatedName("ce.gn(ZLgz;B)V")
    public static final void method1853(boolean arg0, class192 arg1) {
        field678 = arg0;
        if (!field678) {
            int var2 = arg1.method3313();
            int var3 = arg1.method3276();
            int var4 = arg1.method3276();
            Statics.field1505 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field1505[var5][var6] = arg1.method3279();
                }
            }
            Statics.field742 = new int[var4];
            Statics.field1072 = new int[var4];
            Statics.field3699 = new int[var4];
            Statics.field46 = new byte[var4][];
            Statics.field145 = new byte[var4][];
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
                        Statics.field742[var8] = var11;
                        Statics.field1072[var8] = Statics.field3177.method4288("m" + var9 + "_" + var10);
                        Statics.field3699[var8] = Statics.field3177.method4288("l" + var9 + "_" + var10);
                        var8++;
                    }
                }
            }
            method2893(var3, var2, true);
            return;
        }
        boolean var12 = arg1.method3305() == 1;
        int var13 = arg1.method3314();
        int var14 = arg1.method3314();
        int var15 = arg1.method3276();
        arg1.method3547();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = arg1.method3548(1);
                    if (var19 == 1) {
                        field679[var16][var17][var18] = arg1.method3548(26);
                    } else {
                        field679[var16][var17][var18] = -1;
                    }
                }
            }
        }
        arg1.method3549();
        Statics.field1505 = new int[var15][4];
        for (int var20 = 0; var20 < var15; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field1505[var20][var21] = arg1.method3279();
            }
        }
        Statics.field742 = new int[var15];
        Statics.field1072 = new int[var15];
        Statics.field3699 = new int[var15];
        Statics.field46 = new byte[var15][];
        Statics.field145 = new byte[var15][];
        int var22 = 0;
        for (int var23 = 0; var23 < 4; var23++) {
            for (int var24 = 0; var24 < 13; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    int var26 = field679[var23][var24][var25];
                    if (var26 != -1) {
                        int var27 = var26 >> 14 & 0x3FF;
                        int var28 = var26 >> 3 & 0x7FF;
                        int var29 = (var27 / 8 << 8) + var28 / 8;
                        for (int var30 = 0; var30 < var22; var30++) {
                            if (Statics.field742[var30] == var29) {
                                var29 = -1;
                                break;
                            }
                        }
                        if (var29 != -1) {
                            Statics.field742[var22] = var29;
                            int var31 = var29 >> 8 & 0xFF;
                            int var32 = var29 & 0xFF;
                            Statics.field1072[var22] = Statics.field3177.method4288("m" + var31 + "_" + var32);
                            Statics.field3699[var22] = Statics.field3177.method4288("l" + var31 + "_" + var32);
                            var22++;
                        }
                    }
                }
            }
        }
        method2893(var13, var14, !var12);
    }

    @ObfuscatedName("ed.gm(IIZS)V")
    public static final void method2893(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field1197 == arg0 && Statics.field615 == arg1) {
            return;
        }
        Statics.field1197 = arg0;
        Statics.field615 = arg1;
        method3061(25);
        method43(class240.field3027, true);
        int var3 = Statics.field6;
        int var4 = Statics.field72;
        Statics.field6 = (arg0 - 6) * 8;
        Statics.field72 = (arg1 - 6) * 8;
        int var5 = Statics.field6 - var3;
        int var6 = Statics.field72 - var4;
        int var7 = Statics.field6;
        int var8 = Statics.field72;
        for (int var9 = 0; var9 < 32768; var9++) {
            class74 var10 = field660[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field927[var11] -= var5;
                    var10.field940[var11] -= var6;
                }
                var10.field933 -= var5 * 128;
                var10.field964 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class62 var13 = field735[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field927[var14] -= var5;
                    var13.field940[var14] -= var6;
                }
                var13.field933 -= var5 * 128;
                var13.field964 -= var6 * 128;
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
                        field747[var25][var21][var22] = field747[var25][var23][var24];
                    } else {
                        field747[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class64 var26 = (class64) field876.method3792(); var26 != null; var26 = (class64) field876.method3800()) {
            var26.field895 -= var5;
            var26.field896 -= var6;
            if (var26.field895 < 0 || var26.field896 < 0 || var26.field895 >= 104 || var26.field896 >= 104) {
                var26.method3787();
            }
        }
        if (field658 != 0) {
            field658 -= var5;
            field802 -= var6;
        }
        field855 = 0;
        field861 = false;
        Statics.field81 -= var5 << 7;
        Statics.field1509 -= var6 << 7;
        Statics.field63 -= var5 << 7;
        Statics.field1714 -= var6 << 7;
        field842 = -1;
        field750.method3807();
        field749.method3807();
        for (int var27 = 0; var27 < 4; var27++) {
            field677[var27].method3109();
        }
    }

    @ObfuscatedName("u.gb(ZI)V")
    public static final void method66(boolean arg0) {
        method1708();
        field830.field1272++;
        if (field830.field1272 < 50 && !arg0) {
            return;
        }
        field830.field1272 = 0;
        if (field874 || field830.method1892() == null) {
            return;
        }
        class175 var1 = class175.method107(class172.field2260, field830.field1266);
        field830.method1875(var1);
        try {
            field830.method1874();
        } catch (IOException var3) {
            field874 = true;
        }
    }

    @ObfuscatedName("af.gj(I)V")
    public static final void method529() {
        method66(false);
        field763 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field46.length; var1++) {
            if (Statics.field1072[var1] != -1 && Statics.field46[var1] == null) {
                Statics.field46[var1] = Statics.field3177.method4270(Statics.field1072[var1], 0);
                if (Statics.field46[var1] == null) {
                    var0 = false;
                    field763++;
                }
            }
            if (Statics.field3699[var1] != -1 && Statics.field145[var1] == null) {
                Statics.field145[var1] = Statics.field3177.method4303(Statics.field3699[var1], 0, Statics.field1505[var1]);
                if (Statics.field145[var1] == null) {
                    var0 = false;
                    field763++;
                }
            }
        }
        if (!var0) {
            field675 = 1;
            return;
        }
        field798 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field46.length; var3++) {
            byte[] var4 = Statics.field145[var3];
            if (var4 != null) {
                int var5 = (Statics.field742[var3] >> 8) * 64 - Statics.field6;
                int var6 = (Statics.field742[var3] & 0xFF) * 64 - Statics.field72;
                if (field678) {
                    var5 = 10;
                    var6 = 10;
                }
                boolean var8 = true;
                class185 var9 = new class185(var4);
                int var10 = -1;
                label1037: while (true) {
                    int var11 = var9.method3289();
                    if (var11 == 0) {
                        var2 &= var8;
                        break;
                    }
                    var10 += var11;
                    int var13 = 0;
                    boolean var14 = false;
                    while (true) {
                        while (!var14) {
                            int var16 = var9.method3288();
                            if (var16 == 0) {
                                continue label1037;
                            }
                            var13 += var16 - 1;
                            int var17 = var13 & 0x3F;
                            int var18 = var13 >> 6 & 0x3F;
                            int var19 = var9.method3274() >> 2;
                            int var20 = var5 + var18;
                            int var21 = var6 + var17;
                            if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                                class271 var22 = class271.method4255(var10);
                                if (var19 != 22 || !field624 || var22.field3421 != 0 || var22.field3403 == 1 || var22.field3425) {
                                    if (!var22.method4723()) {
                                        field798++;
                                        var8 = false;
                                    }
                                    var14 = true;
                                }
                            }
                        }
                        int var15 = var9.method3288();
                        if (var15 == 0) {
                            break;
                        }
                        var9.method3274();
                    }
                }
            }
        }
        if (!var2) {
            field675 = 2;
            return;
        }
        if (field675 != 0) {
            method43(class240.field3027 + class76.field1093 + class76.field1094 + 100 + "%" + class76.field1095, true);
        }
        method1708();
        Statics.field267.method2656();
        for (int var23 = 0; var23 < 4; var23++) {
            field677[var23].method3109();
        }
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class51.field498[var24][var25][var26] = 0;
                }
            }
        }
        method1708();
        class51.field478 = 99;
        Statics.field477 = new byte[4][104][104];
        Statics.field492 = new byte[4][104][104];
        Statics.field481 = new byte[4][104][104];
        Statics.field496 = new byte[4][104][104];
        Statics.field476 = new int[4][105][105];
        Statics.field483 = new byte[4][105][105];
        Statics.field484 = new int[105][105];
        Statics.field493 = new int[104];
        Statics.field486 = new int[104];
        Statics.field3711 = new int[104];
        Statics.field101 = new int[104];
        Statics.field1190 = new int[104];
        int var27 = Statics.field46.length;
        class70.method80();
        method66(true);
        if (!field678) {
            for (int var28 = 0; var28 < var27; var28++) {
                int var29 = (Statics.field742[var28] >> 8) * 64 - Statics.field6;
                int var30 = (Statics.field742[var28] & 0xFF) * 64 - Statics.field72;
                byte[] var31 = Statics.field46[var28];
                if (var31 != null) {
                    method1708();
                    class51.method4258(var31, var29, var30, Statics.field1197 * 8 - 48, Statics.field615 * 8 - 48, field677);
                }
            }
            for (int var32 = 0; var32 < var27; var32++) {
                int var33 = (Statics.field742[var32] >> 8) * 64 - Statics.field6;
                int var34 = (Statics.field742[var32] & 0xFF) * 64 - Statics.field72;
                byte[] var35 = Statics.field46[var32];
                if (var35 == null && Statics.field615 < 800) {
                    method1708();
                    class51.method2916(var33, var34, 64, 64);
                }
            }
            method66(true);
            for (int var36 = 0; var36 < var27; var36++) {
                byte[] var37 = Statics.field145[var36];
                if (var37 != null) {
                    int var38 = (Statics.field742[var36] >> 8) * 64 - Statics.field6;
                    int var39 = (Statics.field742[var36] & 0xFF) * 64 - Statics.field72;
                    method1708();
                    class128 var40 = Statics.field267;
                    class167[] var41 = field677;
                    class185 var42 = new class185(var37);
                    int var43 = -1;
                    while (true) {
                        int var44 = var42.method3289();
                        if (var44 == 0) {
                            break;
                        }
                        var43 += var44;
                        int var45 = 0;
                        while (true) {
                            int var46 = var42.method3288();
                            if (var46 == 0) {
                                break;
                            }
                            var45 += var46 - 1;
                            int var47 = var45 & 0x3F;
                            int var48 = var45 >> 6 & 0x3F;
                            int var49 = var45 >> 12;
                            int var50 = var42.method3274();
                            int var51 = var50 >> 2;
                            int var52 = var50 & 0x3;
                            int var53 = var38 + var48;
                            int var54 = var39 + var47;
                            if (var53 > 0 && var54 > 0 && var53 < 103 && var54 < 103) {
                                int var55 = var49;
                                if ((class51.field498[1][var53][var54] & 0x2) == 2) {
                                    var55 = var49 - 1;
                                }
                                class167 var56 = null;
                                if (var55 >= 0) {
                                    var56 = var41[var55];
                                }
                                class51.method1714(var49, var53, var54, var43, var52, var51, var40, var56);
                            }
                        }
                    }
                }
            }
        }
        if (field678) {
            for (int var57 = 0; var57 < 4; var57++) {
                method1708();
                for (int var58 = 0; var58 < 13; var58++) {
                    for (int var59 = 0; var59 < 13; var59++) {
                        boolean var60 = false;
                        int var61 = field679[var57][var58][var59];
                        if (var61 != -1) {
                            int var62 = var61 >> 24 & 0x3;
                            int var63 = var61 >> 1 & 0x3;
                            int var64 = var61 >> 14 & 0x3FF;
                            int var65 = var61 >> 3 & 0x7FF;
                            int var66 = (var64 / 8 << 8) + var65 / 8;
                            for (int var67 = 0; var67 < Statics.field742.length; var67++) {
                                if (Statics.field742[var67] == var66 && Statics.field46[var67] != null) {
                                    class51.method3104(Statics.field46[var67], var57, var58 * 8, var59 * 8, var62, (var64 & 0x7) * 8, (var65 & 0x7) * 8, var63, field677);
                                    var60 = true;
                                    break;
                                }
                            }
                        }
                        if (!var60) {
                            int var68 = var57;
                            int var69 = var58 * 8;
                            int var70 = var59 * 8;
                            for (int var71 = 0; var71 < 8; var71++) {
                                for (int var72 = 0; var72 < 8; var72++) {
                                    class51.field487[var68][var69 + var71][var70 + var72] = 0;
                                }
                            }
                            if (var69 > 0) {
                                for (int var73 = 1; var73 < 8; var73++) {
                                    class51.field487[var68][var69][var70 + var73] = class51.field487[var68][var69 - 1][var70 + var73];
                                }
                            }
                            if (var70 > 0) {
                                for (int var74 = 1; var74 < 8; var74++) {
                                    class51.field487[var68][var69 + var74][var70] = class51.field487[var68][var69 + var74][var70 - 1];
                                }
                            }
                            if (var69 > 0 && class51.field487[var68][var69 - 1][var70] != 0) {
                                class51.field487[var68][var69][var70] = class51.field487[var68][var69 - 1][var70];
                            } else if (var70 > 0 && class51.field487[var68][var69][var70 - 1] != 0) {
                                class51.field487[var68][var69][var70] = class51.field487[var68][var69][var70 - 1];
                            } else if (var69 > 0 && var70 > 0 && class51.field487[var68][var69 - 1][var70 - 1] != 0) {
                                class51.field487[var68][var69][var70] = class51.field487[var68][var69 - 1][var70 - 1];
                            }
                        }
                    }
                }
            }
            for (int var75 = 0; var75 < 13; var75++) {
                for (int var76 = 0; var76 < 13; var76++) {
                    int var77 = field679[0][var75][var76];
                    if (var77 == -1) {
                        class51.method2916(var75 * 8, var76 * 8, 8, 8);
                    }
                }
            }
            method66(true);
            for (int var78 = 0; var78 < 4; var78++) {
                method1708();
                for (int var79 = 0; var79 < 13; var79++) {
                    for (int var80 = 0; var80 < 13; var80++) {
                        int var81 = field679[var78][var79][var80];
                        if (var81 != -1) {
                            int var82 = var81 >> 24 & 0x3;
                            int var83 = var81 >> 1 & 0x3;
                            int var84 = var81 >> 14 & 0x3FF;
                            int var85 = var81 >> 3 & 0x7FF;
                            int var86 = (var84 / 8 << 8) + var85 / 8;
                            for (int var87 = 0; var87 < Statics.field742.length; var87++) {
                                if (Statics.field742[var87] == var86 && Statics.field145[var87] != null) {
                                    class51.method612(Statics.field145[var87], var78, var79 * 8, var80 * 8, var82, (var84 & 0x7) * 8, (var85 & 0x7) * 8, var83, Statics.field267, field677);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method66(true);
        method1708();
        class128 var88 = Statics.field267;
        class167[] var89 = field677;
        for (int var90 = 0; var90 < 4; var90++) {
            for (int var91 = 0; var91 < 104; var91++) {
                for (int var92 = 0; var92 < 104; var92++) {
                    if ((class51.field498[var90][var91][var92] & 0x1) == 1) {
                        int var93 = var90;
                        if ((class51.field498[1][var91][var92] & 0x2) == 2) {
                            var93 = var90 - 1;
                        }
                        if (var93 >= 0) {
                            var89[var93].method3121(var91, var92);
                        }
                    }
                }
            }
        }
        class51.field495 += (int) (Math.random() * 5.0D) - 2;
        if (class51.field495 < -8) {
            class51.field495 = -8;
        }
        if (class51.field495 > 8) {
            class51.field495 = 8;
        }
        class51.field485 += (int) (Math.random() * 5.0D) - 2;
        if (class51.field485 < -16) {
            class51.field485 = -16;
        }
        if (class51.field485 > 16) {
            class51.field485 = 16;
        }
        for (int var94 = 0; var94 < 4; var94++) {
            byte[][] var95 = Statics.field483[var94];
            int var96 = (int) Math.sqrt(5100.0D);
            int var97 = var96 * 768 >> 8;
            for (int var98 = 1; var98 < 103; var98++) {
                for (int var99 = 1; var99 < 103; var99++) {
                    int var100 = class51.field487[var94][var99 + 1][var98] - class51.field487[var94][var99 - 1][var98];
                    int var101 = class51.field487[var94][var99][var98 + 1] - class51.field487[var94][var99][var98 - 1];
                    int var102 = (int) Math.sqrt((double) (var101 * var101 + var100 * var100 + 65536));
                    int var103 = (var100 << 8) / var102;
                    int var104 = 65536 / var102;
                    int var105 = (var101 << 8) / var102;
                    int var106 = (var105 * -50 + var103 * -50 + var104 * -10) / var97 + 96;
                    int var107 = (var95[var99][var98] >> 1) + (var95[var99][var98 + 1] >> 3) + (var95[var99][var98 - 1] >> 2) + (var95[var99 - 1][var98] >> 2) + (var95[var99 + 1][var98] >> 3);
                    Statics.field484[var99][var98] = var106 - var107;
                }
            }
            for (int var108 = 0; var108 < 104; var108++) {
                Statics.field493[var108] = 0;
                Statics.field486[var108] = 0;
                Statics.field3711[var108] = 0;
                Statics.field101[var108] = 0;
                Statics.field1190[var108] = 0;
            }
            for (int var109 = -5; var109 < 109; var109++) {
                for (int var110 = 0; var110 < 104; var110++) {
                    int var111 = var109 + 5;
                    int var10002;
                    if (var111 >= 0 && var111 < 104) {
                        int var112 = Statics.field477[var94][var111][var110] & 0xFF;
                        if (var112 > 0) {
                            class262 var113 = class262.method4013(var112 - 1);
                            Statics.field493[var110] += var113.field3315;
                            Statics.field486[var110] += var113.field3313;
                            Statics.field3711[var110] += var113.field3314;
                            Statics.field101[var110] += var113.field3318;
                            var10002 = Statics.field1190[var110]++;
                        }
                    }
                    int var114 = var109 - 5;
                    if (var114 >= 0 && var114 < 104) {
                        int var115 = Statics.field477[var94][var114][var110] & 0xFF;
                        if (var115 > 0) {
                            class262 var116 = class262.method4013(var115 - 1);
                            Statics.field493[var110] -= var116.field3315;
                            Statics.field486[var110] -= var116.field3313;
                            Statics.field3711[var110] -= var116.field3314;
                            Statics.field101[var110] -= var116.field3318;
                            var10002 = Statics.field1190[var110]--;
                        }
                    }
                }
                if (var109 >= 1 && var109 < 103) {
                    int var117 = 0;
                    int var118 = 0;
                    int var119 = 0;
                    int var120 = 0;
                    int var121 = 0;
                    for (int var122 = -5; var122 < 109; var122++) {
                        int var123 = var122 + 5;
                        if (var123 >= 0 && var123 < 104) {
                            var117 += Statics.field493[var123];
                            var118 += Statics.field486[var123];
                            var119 += Statics.field3711[var123];
                            var120 += Statics.field101[var123];
                            var121 += Statics.field1190[var123];
                        }
                        int var124 = var122 - 5;
                        if (var124 >= 0 && var124 < 104) {
                            var117 -= Statics.field493[var124];
                            var118 -= Statics.field486[var124];
                            var119 -= Statics.field3711[var124];
                            var120 -= Statics.field101[var124];
                            var121 -= Statics.field1190[var124];
                        }
                        if (var122 >= 1 && var122 < 103 && (!field624 || (class51.field498[0][var109][var122] & 0x2) != 0 || (class51.field498[var94][var109][var122] & 0x10) == 0)) {
                            if (var94 < class51.field478) {
                                class51.field478 = var94;
                            }
                            int var125 = Statics.field477[var94][var109][var122] & 0xFF;
                            int var126 = Statics.field492[var94][var109][var122] & 0xFF;
                            if (var125 > 0 || var126 > 0) {
                                int var127 = class51.field487[var94][var109][var122];
                                int var128 = class51.field487[var94][var109 + 1][var122];
                                int var129 = class51.field487[var94][var109 + 1][var122 + 1];
                                int var130 = class51.field487[var94][var109][var122 + 1];
                                int var131 = Statics.field484[var109][var122];
                                int var132 = Statics.field484[var109 + 1][var122];
                                int var133 = Statics.field484[var109 + 1][var122 + 1];
                                int var134 = Statics.field484[var109][var122 + 1];
                                int var135 = -1;
                                int var136 = -1;
                                if (var125 > 0) {
                                    int var137 = var117 * 256 / var120;
                                    int var138 = var118 / var121;
                                    int var139 = var119 / var121;
                                    var135 = class51.method3165(var137, var138, var139);
                                    int var140 = class51.field495 + var137 & 0xFF;
                                    int var141 = class51.field485 + var139;
                                    if (var141 < 0) {
                                        var141 = 0;
                                    } else if (var141 > 255) {
                                        var141 = 255;
                                    }
                                    var136 = class51.method3165(var140, var138, var141);
                                }
                                if (var94 > 0) {
                                    boolean var142 = true;
                                    if (var125 == 0 && Statics.field481[var94][var109][var122] != 0) {
                                        var142 = false;
                                    }
                                    if (var126 > 0 && !class275.method3574(var126 - 1).field3553) {
                                        var142 = false;
                                    }
                                    if (var142 && var127 == var128 && var127 == var129 && var127 == var130) {
                                        Statics.field476[var94][var109][var122] |= 0x924;
                                    }
                                }
                                int var143 = 0;
                                if (var136 != -1) {
                                    var143 = class125.field1738[class51.method616(var136, 96)];
                                }
                                if (var126 == 0) {
                                    var88.method2661(var94, var109, var122, 0, 0, -1, var127, var128, var129, var130, class51.method616(var135, var131), class51.method616(var135, var132), class51.method616(var135, var133), class51.method616(var135, var134), 0, 0, 0, 0, var143, 0);
                                } else {
                                    int var144 = Statics.field481[var94][var109][var122] + 1;
                                    byte var145 = Statics.field496[var94][var109][var122];
                                    class275 var146 = class275.method3574(var126 - 1);
                                    int var147 = var146.field3556;
                                    int var148;
                                    int var149;
                                    if (var147 >= 0) {
                                        var148 = Statics.field1741.method2358(var147);
                                        var149 = -1;
                                    } else if (var146.field3551 == 16711935) {
                                        var149 = -2;
                                        var147 = -1;
                                        var148 = -2;
                                    } else {
                                        var149 = class51.method3165(var146.field3555, var146.field3552, var146.field3549);
                                        int var150 = class51.field495 + var146.field3555 & 0xFF;
                                        int var151 = class51.field485 + var146.field3549;
                                        if (var151 < 0) {
                                            var151 = 0;
                                        } else if (var151 > 255) {
                                            var151 = 255;
                                        }
                                        var148 = class51.method3165(var150, var146.field3552, var151);
                                    }
                                    int var152 = 0;
                                    if (var148 != -2) {
                                        var152 = class125.field1738[class51.method2849(var148, 96)];
                                    }
                                    if (var146.field3554 != -1) {
                                        int var153 = class51.field495 + var146.field3558 & 0xFF;
                                        int var154 = class51.field485 + var146.field3560;
                                        if (var154 < 0) {
                                            var154 = 0;
                                        } else if (var154 > 255) {
                                            var154 = 255;
                                        }
                                        int var155 = class51.method3165(var153, var146.field3557, var154);
                                        var152 = class125.field1738[class51.method2849(var155, 96)];
                                    }
                                    var88.method2661(var94, var109, var122, var144, var145, var147, var127, var128, var129, var130, class51.method616(var135, var131), class51.method616(var135, var132), class51.method616(var135, var133), class51.method616(var135, var134), class51.method2849(var149, var131), class51.method2849(var149, var132), class51.method2849(var149, var133), class51.method2849(var149, var134), var143, var152);
                                }
                            }
                        }
                    }
                }
            }
            for (int var156 = 1; var156 < 103; var156++) {
                for (int var157 = 1; var157 < 103; var157++) {
                    int var162;
                    if ((class51.field498[var94][var157][var156] & 0x8) != 0) {
                        var162 = 0;
                    } else if (var94 <= 0 || (class51.field498[1][var157][var156] & 0x2) == 0) {
                        var162 = var94;
                    } else {
                        var162 = var94 - 1;
                    }
                    var88.method2660(var94, var157, var156, var162);
                }
            }
            Statics.field477[var94] = (byte[][]) null;
            Statics.field492[var94] = (byte[][]) null;
            Statics.field481[var94] = (byte[][]) null;
            Statics.field496[var94] = (byte[][]) null;
            Statics.field483[var94] = (byte[][]) null;
        }
        var88.method2837(-50, -10, -50);
        for (int var163 = 0; var163 < 104; var163++) {
            for (int var164 = 0; var164 < 104; var164++) {
                if ((class51.field498[1][var163][var164] & 0x2) == 2) {
                    var88.method2716(var163, var164);
                }
            }
        }
        int var165 = 1;
        int var166 = 2;
        int var167 = 4;
        for (int var168 = 0; var168 < 4; var168++) {
            if (var168 > 0) {
                var165 <<= 0x3;
                var166 <<= 0x3;
                var167 <<= 0x3;
            }
            for (int var169 = 0; var169 <= var168; var169++) {
                for (int var170 = 0; var170 <= 104; var170++) {
                    for (int var171 = 0; var171 <= 104; var171++) {
                        if ((Statics.field476[var169][var171][var170] & var165) != 0) {
                            int var172 = var170;
                            int var173 = var170;
                            int var174 = var169;
                            int var175 = var169;
                            while (var172 > 0 && (Statics.field476[var169][var171][var172 - 1] & var165) != 0) {
                                var172--;
                            }
                            while (var173 < 104 && (Statics.field476[var169][var171][var173 + 1] & var165) != 0) {
                                var173++;
                            }
                            label602: while (var174 > 0) {
                                for (int var176 = var172; var176 <= var173; var176++) {
                                    if ((Statics.field476[var174 - 1][var171][var176] & var165) == 0) {
                                        break label602;
                                    }
                                }
                                var174--;
                            }
                            label591: while (var175 < var168) {
                                for (int var177 = var172; var177 <= var173; var177++) {
                                    if ((Statics.field476[var175 + 1][var171][var177] & var165) == 0) {
                                        break label591;
                                    }
                                }
                                var175++;
                            }
                            int var178 = (var175 + 1 - var174) * (var173 - var172 + 1);
                            if (var178 >= 8) {
                                short var179 = 240;
                                int var180 = class51.field487[var175][var171][var172] - var179;
                                int var181 = class51.field487[var174][var171][var172];
                                class128.method2659(var168, 1, var171 * 128, var171 * 128, var172 * 128, var173 * 128 + 128, var180, var181);
                                for (int var182 = var174; var182 <= var175; var182++) {
                                    for (int var183 = var172; var183 <= var173; var183++) {
                                        Statics.field476[var182][var171][var183] &= ~var165;
                                    }
                                }
                            }
                        }
                        if ((Statics.field476[var169][var171][var170] & var166) != 0) {
                            int var184 = var171;
                            int var185 = var171;
                            int var186 = var169;
                            int var187 = var169;
                            while (var184 > 0 && (Statics.field476[var169][var184 - 1][var170] & var166) != 0) {
                                var184--;
                            }
                            while (var185 < 104 && (Statics.field476[var169][var185 + 1][var170] & var166) != 0) {
                                var185++;
                            }
                            label655: while (var186 > 0) {
                                for (int var188 = var184; var188 <= var185; var188++) {
                                    if ((Statics.field476[var186 - 1][var188][var170] & var166) == 0) {
                                        break label655;
                                    }
                                }
                                var186--;
                            }
                            label644: while (var187 < var168) {
                                for (int var189 = var184; var189 <= var185; var189++) {
                                    if ((Statics.field476[var187 + 1][var189][var170] & var166) == 0) {
                                        break label644;
                                    }
                                }
                                var187++;
                            }
                            int var190 = (var187 + 1 - var186) * (var185 - var184 + 1);
                            if (var190 >= 8) {
                                short var191 = 240;
                                int var192 = class51.field487[var187][var184][var170] - var191;
                                int var193 = class51.field487[var186][var184][var170];
                                class128.method2659(var168, 2, var184 * 128, var185 * 128 + 128, var170 * 128, var170 * 128, var192, var193);
                                for (int var194 = var186; var194 <= var187; var194++) {
                                    for (int var195 = var184; var195 <= var185; var195++) {
                                        Statics.field476[var194][var195][var170] &= ~var166;
                                    }
                                }
                            }
                        }
                        if ((Statics.field476[var169][var171][var170] & var167) != 0) {
                            int var196 = var171;
                            int var197 = var171;
                            int var198 = var170;
                            int var199 = var170;
                            while (var198 > 0 && (Statics.field476[var169][var171][var198 - 1] & var167) != 0) {
                                var198--;
                            }
                            while (var199 < 104 && (Statics.field476[var169][var171][var199 + 1] & var167) != 0) {
                                var199++;
                            }
                            label708: while (var196 > 0) {
                                for (int var200 = var198; var200 <= var199; var200++) {
                                    if ((Statics.field476[var169][var196 - 1][var200] & var167) == 0) {
                                        break label708;
                                    }
                                }
                                var196--;
                            }
                            label697: while (var197 < 104) {
                                for (int var201 = var198; var201 <= var199; var201++) {
                                    if ((Statics.field476[var169][var197 + 1][var201] & var167) == 0) {
                                        break label697;
                                    }
                                }
                                var197++;
                            }
                            if ((var197 - var196 + 1) * (var199 - var198 + 1) >= 4) {
                                int var202 = class51.field487[var169][var196][var198];
                                class128.method2659(var168, 4, var196 * 128, var197 * 128 + 128, var198 * 128, var199 * 128 + 128, var202, var202);
                                for (int var203 = var196; var203 <= var197; var203++) {
                                    for (int var204 = var198; var204 <= var199; var204++) {
                                        Statics.field476[var169][var203][var204] &= ~var167;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        method66(true);
        int var205 = class51.field478;
        if (var205 > Statics.field348) {
            var205 = Statics.field348;
        }
        if (var205 < Statics.field348 - 1) {
            int var206 = Statics.field348 - 1;
        }
        if (field624) {
            Statics.field267.method2743(class51.field478);
        } else {
            Statics.field267.method2743(0);
        }
        for (int var207 = 0; var207 < 104; var207++) {
            for (int var208 = 0; var208 < 104; var208++) {
                method5136(var207, var208);
            }
        }
        method1708();
        method973();
        class271.field3405.method3697();
        if (Statics.field391.method753()) {
            class175 var209 = class175.method107(class172.field2262, field830.field1266);
            var209.field2311.method3261(1057001181);
            field830.method1875(var209);
        }
        if (!field678) {
            int var210 = (Statics.field1197 - 6) / 8;
            int var211 = (Statics.field1197 + 6) / 8;
            int var212 = (Statics.field615 - 6) / 8;
            int var213 = (Statics.field615 + 6) / 8;
            for (int var214 = var210 - 1; var214 <= var211 + 1; var214++) {
                for (int var215 = var212 - 1; var215 <= var213 + 1; var215++) {
                    if (var214 < var210 || var214 > var211 || var215 < var212 || var215 > var213) {
                        Statics.field3177.method4294("m" + var214 + "_" + var215);
                        Statics.field3177.method4294("l" + var214 + "_" + var215);
                    }
                }
            }
        }
        method3061(30);
        method1708();
        Statics.field477 = (byte[][][]) null;
        Statics.field492 = (byte[][][]) null;
        Statics.field481 = (byte[][][]) null;
        Statics.field496 = (byte[][][]) null;
        Statics.field476 = (int[][][]) null;
        Statics.field483 = (byte[][][]) null;
        Statics.field484 = (int[][]) null;
        Statics.field493 = null;
        Statics.field486 = null;
        Statics.field3711 = null;
        Statics.field101 = null;
        Statics.field1190 = null;
        class175 var216 = class175.method107(class172.field2198, field830.field1266);
        field830.method1875(var216);
        class48.method22();
    }

    @ObfuscatedName("al.ga(II)V")
    public static final void method939(int arg0) {
        int[] var1 = Statics.field1356.field3826;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class51.field498[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field267.method2690(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class51.field498[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field267.method2690(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field1356.method5493();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class51.field498[arg0][var10][var9] & 0x18) == 0) {
                    Statics.method304(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class51.field498[arg0 + 1][var10][var9] & 0x8) != 0) {
                    Statics.method304(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field622 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                long var13 = Statics.field267.method2685(Statics.field348, var11, var12);
                if (var13 != 0L) {
                    int var15 = class123.method936(var13);
                    int var16 = class271.method4255(var15).field3430;
                    if (var16 >= 0) {
                        field817[field622] = Statics.field2412[var16].method4480(false);
                        field844[field622] = var11;
                        field849[field622] = var12;
                        field622++;
                    }
                }
            }
        }
        Statics.field195.method5461();
    }

    @ObfuscatedName("client.gd(Lcn;S)Z")
    public final boolean method1377(class90 arg0) {
        class160 var2 = arg0.method1892();
        class192 var3 = arg0.field1267;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1268 == null) {
                if (arg0.field1270) {
                    if (!var2.method3037(1)) {
                        return false;
                    }
                    var2.method3042(arg0.field1267.field2387, 0, 1);
                    arg0.field1262 = 0;
                    arg0.field1270 = false;
                }
                var3.field2386 = 0;
                if (var3.method3545()) {
                    if (!var2.method3037(1)) {
                        return false;
                    }
                    var2.method3042(arg0.field1267.field2387, 1, 1);
                    arg0.field1262 = 0;
                }
                arg0.field1270 = true;
                class171[] var4 = class171.method214();
                int var5 = var3.method3562();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field2386);
                }
                arg0.field1268 = var4[var5];
                arg0.field1277 = arg0.field1268.field2182;
            }
            if (arg0.field1277 == -1) {
                if (!var2.method3037(1)) {
                    return false;
                }
                arg0.method1892().method3042(var3.field2387, 0, 1);
                arg0.field1277 = var3.field2387[0] & 0xFF;
            }
            if (arg0.field1277 == -2) {
                if (!var2.method3037(2)) {
                    return false;
                }
                arg0.method1892().method3042(var3.field2387, 0, 2);
                var3.field2386 = 0;
                arg0.field1277 = var3.method3276();
            }
            if (!var2.method3037(arg0.field1277)) {
                return false;
            }
            var3.field2386 = 0;
            var2.method3042(var3.field2387, 0, arg0.field1277);
            arg0.field1262 = 0;
            field846.method4906();
            arg0.field1275 = arg0.field1274;
            arg0.field1274 = arg0.field1264;
            arg0.field1264 = arg0.field1268;
            if (class171.field2098 == arg0.field1268) {
                int var6 = var3.method3276();
                if (var6 == 65535) {
                    var6 = -1;
                }
                if (var6 == -1 && !field832) {
                    class220.method3158();
                } else if (var6 != -1 && field851 != var6 && field850 != 0 && !field832) {
                    class220.method3513(2, Statics.field1161, var6, 0, field850, false);
                }
                field851 = var6;
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2119 == arg0.field1268) {
                int var7 = var3.method3313();
                if (var7 == 65535) {
                    var7 = -1;
                }
                int var8 = var3.method3494();
                if (field850 != 0 && var7 != -1) {
                    class220.method210(Statics.field1836, var7, 0, field850, false);
                    field832 = true;
                }
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2132 == arg0.field1268) {
                int var9 = var3.method3279();
                class57 var10 = (class57) field780.method3735((long) var9);
                if (var10 != null) {
                    method5075(var10, true);
                }
                if (field709 != null) {
                    method3069(field709);
                    field709 = null;
                }
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2122 == arg0.field1268) {
                int var11 = var3.method3312();
                if (var11 == 65535) {
                    var11 = -1;
                }
                int var12 = var3.method3456();
                int var13 = var3.method3456();
                int var14 = var3.method3276();
                if (var14 == 65535) {
                    var14 = -1;
                }
                for (int var15 = var11; var15 <= var14; var15++) {
                    long var16 = ((long) var13 << 32) + (long) var15;
                    class207 var18 = field819.method3735(var16);
                    if (var18 != null) {
                        var18.method3787();
                    }
                    field819.method3733(new class214(var12), var16);
                }
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2155 == arg0.field1268) {
                field738 = var3.method3274();
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2159 == arg0.field1268) {
                int var19 = var3.method3456();
                int var20 = var3.method3314();
                class228.field2597[var20] = var19;
                if (class228.field2596[var20] != var19) {
                    class228.field2596[var20] = var19;
                }
                method143(var20);
                field748[++field740 - 1 & 0x1F] = var20;
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2171 == arg0.field1268) {
                int var21 = var3.method3312();
                int var22 = var3.method3358();
                int var23 = var21 >> 10 & 0x1F;
                int var24 = var21 >> 5 & 0x1F;
                int var25 = var21 & 0x1F;
                int var26 = (var25 << 3) + (var23 << 19) + (var24 << 11);
                class233 var27 = class233.method2957(var22);
                if (var27.field2635 != var26) {
                    var27.field2635 = var26;
                    method3069(var27);
                }
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2167 == arg0.field1268) {
                String var28 = var3.method3490();
                String var32;
                try {
                    int var29 = var3.method3288();
                    if (var29 > 32767) {
                        var29 = 32767;
                    }
                    byte[] var30 = new byte[var29];
                    var3.field2386 += Statics.field3746.method3195(var3.field2387, var3.field2386, var30, 0, var29);
                    String var31 = class304.method5090(var30, 0, var29);
                    var32 = var31;
                } catch (Exception var297) {
                    var32 = "Cabbage";
                }
                String var35 = class302.method5237(class308.method1711(var32));
                class86.method1515(6, var28, var35);
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2143 == arg0.field1268) {
                Statics.method2088();
                field810 = var3.method3277();
                field862 = field765;
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2100 == arg0.field1268) {
                method221();
                arg0.field1268 = null;
                return false;
            }
            if (class171.field2161 == arg0.field1268) {
                int var36 = var3.method3323();
                boolean var37 = var3.method3389() == 1;
                class233 var38 = class233.method2957(var36);
                if (var38.field2658 != var37) {
                    var38.field2658 = var37;
                    method3069(var38);
                }
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2103 == arg0.field1268) {
                int var39 = var3.method3323();
                int var40 = var3.method3279();
                class57 var41 = (class57) field780.method3735((long) var39);
                class57 var42 = (class57) field780.method3735((long) var40);
                if (var42 != null) {
                    method5075(var42, var41 == null || var41.field535 != var42.field535);
                }
                if (var41 != null) {
                    var41.method3787();
                    field780.method3733(var41, (long) var40);
                }
                class233 var43 = class233.method2957(var39);
                if (var43 != null) {
                    method3069(var43);
                }
                class233 var44 = class233.method2957(var40);
                if (var44 != null) {
                    method3069(var44);
                    method1514(Statics.field2674[var44.field2638 >>> 16], var44, true);
                }
                if (field672 != -1) {
                    method934(field672, 1);
                }
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2115 == arg0.field1268) {
                class317.method4104(var3, arg0.field1277);
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2102 == arg0.field1268) {
                int var45 = var3.method3315();
                int var46 = var3.method3358();
                int var47 = var3.method3316();
                class233 var48 = class233.method2957(var46);
                if (var48.field2647 != var45 || var48.field2705 != var47 || var48.field2636 != 0 || var48.field2628 != 0) {
                    var48.field2647 = var45;
                    var48.field2705 = var47;
                    var48.field2636 = 0;
                    var48.field2628 = 0;
                    method3069(var48);
                    this.method1101(var48);
                    if (var48.field2680 == 0) {
                        method1514(Statics.field2674[var46 >> 16], var48, false);
                    }
                }
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2121 == arg0.field1268) {
                int var49 = var3.method3276();
                field672 = var49;
                this.method1401(false);
                method16(var49);
                class71.method220(field672);
                for (int var50 = 0; var50 < 100; var50++) {
                    field822[var50] = true;
                }
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2127 == arg0.field1268) {
                field861 = false;
                for (int var51 = 0; var51 < 5; var51++) {
                    field779[var51] = false;
                }
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2138 == arg0.field1268) {
                method130(class174.field2296);
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2163 == arg0.field1268) {
                field861 = true;
                Statics.field1955 = var3.method3274();
                Statics.field2303 = var3.method3274();
                Statics.field2049 = var3.method3276();
                Statics.field2068 = var3.method3274();
                Statics.field1868 = var3.method3274();
                if (Statics.field1868 >= 100) {
                    int var52 = Statics.field1955 * 128 + 64;
                    int var53 = Statics.field2303 * 128 + 64;
                    int var54 = method3573(var52, var53, Statics.field348) - Statics.field2049;
                    int var55 = var52 - Statics.field81;
                    int var56 = var54 - Statics.field43;
                    int var57 = var53 - Statics.field1509;
                    int var58 = (int) Math.sqrt((double) (var55 * var55 + var57 * var57));
                    Statics.field2504 = (int) (Math.atan2((double) var56, (double) var58) * 325.949D) & 0x7FF;
                    Statics.field71 = (int) (Math.atan2((double) var55, (double) var57) * -325.949D) & 0x7FF;
                    if (Statics.field2504 < 128) {
                        Statics.field2504 = 128;
                    }
                    if (Statics.field2504 > 383) {
                        Statics.field2504 = 383;
                    }
                }
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2140 == arg0.field1268) {
                field861 = true;
                Statics.field994 = var3.method3274();
                Statics.field254 = var3.method3274();
                Statics.field474 = var3.method3276();
                Statics.field380 = var3.method3274();
                Statics.field1051 = var3.method3274();
                if (Statics.field1051 >= 100) {
                    Statics.field81 = Statics.field994 * 128 + 64;
                    Statics.field1509 = Statics.field254 * 128 + 64;
                    Statics.field43 = method3573(Statics.field81, Statics.field1509, Statics.field348) - Statics.field474;
                }
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2137 == arg0.field1268) {
                int var59 = var3.method3279();
                class233 var60 = class233.method2957(var59);
                for (int var61 = 0; var61 < var60.field2736.length; var61++) {
                    var60.field2736[var61] = -1;
                    var60.field2736[var61] = 0;
                }
                method3069(var60);
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2136 == arg0.field1268) {
                Statics.field1240.field1010.method4977(var3, arg0.field1277);
                Iterator var62 = class86.field1227.iterator();
                while (var62.hasNext()) {
                    class60 var63 = (class60) var62.next();
                    var63.method996();
                }
                if (Statics.field65 != null) {
                    Statics.field65.method5116();
                }
                field758 = field765;
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2105 == arg0.field1268) {
                int var64 = var3.method3279();
                if (field701 != var64) {
                    field701 = var64;
                    if (field694 == 1) {
                        field744 = true;
                    }
                }
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2165 == arg0.field1268) {
                for (int var65 = 0; var65 < class228.field2596.length; var65++) {
                    if (class228.field2597[var65] != class228.field2596[var65]) {
                        class228.field2596[var65] = class228.field2597[var65];
                        method143(var65);
                        field748[++field740 - 1 & 0x1F] = var65;
                    }
                }
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2139 == arg0.field1268) {
                Statics.field1240.method1537();
                field758 = field765;
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2106 == arg0.field1268) {
                method130(class174.field2297);
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2151 == arg0.field1268) {
                class67 var66 = new class67();
                var66.field986 = var3.method3490();
                var66.field992 = var3.method3276();
                int var67 = var3.method3279();
                var66.field979 = var67;
                method3061(45);
                var2.method3036();
                Object var68 = null;
                class80.method3017(var66);
                arg0.field1268 = null;
                return false;
            }
            if (class171.field2173 == arg0.field1268) {
                int var69 = var3.method3279();
                int var70 = var3.method3316();
                class233 var71 = class233.method2957(var69);
                if (var71.field2644 != var70 || var70 == -1) {
                    var71.field2644 = var70;
                    var71.field2761 = 0;
                    var71.field2762 = 0;
                    method3069(var71);
                }
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2168 == arg0.field1268) {
                String var72 = var3.method3490();
                Statics.field3345 = var72;
                try {
                    String var73 = Statics.field391.getParameter(class282.field3612.field3623);
                    String var74 = Statics.field391.getParameter(class282.field3620.field3623);
                    String var75 = var73 + "settings=" + var72 + "; version=1; path=/; domain=" + var74;
                    String var76;
                    if (var72.length() == 0) {
                        var76 = var75 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    } else {
                        String var77 = var75 + "; Expires=";
                        long var78 = class187.method3154() + 94608000000L;
                        class195.field2431.setTime(new Date(var78));
                        int var80 = class195.field2431.get(7);
                        int var81 = class195.field2431.get(5);
                        int var82 = class195.field2431.get(2);
                        int var83 = class195.field2431.get(1);
                        int var84 = class195.field2431.get(11);
                        int var85 = class195.field2431.get(12);
                        int var86 = class195.field2431.get(13);
                        String var87 = class195.field2432[var80 - 1] + ", " + var81 / 10 + var81 % 10 + "-" + class195.field2434[0][var82] + "-" + var83 + " " + var84 / 10 + var84 % 10 + ":" + var85 / 10 + var85 % 10 + ":" + var86 / 10 + var86 % 10 + " GMT";
                        var76 = var77 + var87 + "; Max-Age=" + 94608000L;
                    }
                    client var88 = Statics.field391;
                    String var89 = "document.cookie=\"" + var76 + "\"";
                    JSObject.getWindow(var88).eval(var89);
                } catch (Throwable var296) {
                }
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2179 == arg0.field1268) {
                Statics.field1240.method1538(var3, arg0.field1277);
                field758 = field765;
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2170 == arg0.field1268) {
                int var91 = var3.method3279();
                int var92 = var3.method3276();
                if (var91 < -70000) {
                    var92 += 32768;
                }
                class233 var93;
                if (var91 >= 0) {
                    var93 = class233.method2957(var91);
                } else {
                    var93 = null;
                }
                if (var93 != null) {
                    for (int var94 = 0; var94 < var93.field2736.length; var94++) {
                        var93.field2736[var94] = 0;
                        var93.field2758[var94] = 0;
                    }
                }
                class55 var95 = (class55) class55.field518.method3735((long) var92);
                if (var95 != null) {
                    for (int var96 = 0; var96 < var95.field517.length; var96++) {
                        var95.field517[var96] = -1;
                        var95.field521[var96] = 0;
                    }
                }
                int var97 = var3.method3276();
                for (int var98 = 0; var98 < var97; var98++) {
                    int var99 = var3.method3389();
                    if (var99 == 255) {
                        var99 = var3.method3279();
                    }
                    int var100 = var3.method3312();
                    if (var93 != null && var98 < var93.field2736.length) {
                        var93.field2736[var98] = var100;
                        var93.field2758[var98] = var99;
                    }
                    class55.method117(var92, var98, var100 - 1, var99);
                }
                if (var93 != null) {
                    method3069(var93);
                }
                Statics.method2088();
                field847[++field880 - 1 & 0x1F] = var92 & 0x7FFF;
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2129 == arg0.field1268) {
                String var101 = var3.method3490();
                Object[] var102 = new Object[var101.length() + 1];
                for (int var103 = var101.length() - 1; var103 >= 0; var103--) {
                    if (var101.charAt(var103) == 's') {
                        var102[var103 + 1] = var3.method3490();
                    } else {
                        var102[var103 + 1] = Integer.valueOf(var3.method3279());
                    }
                }
                var102[0] = Integer.valueOf(var3.method3279());
                class58 var104 = new class58();
                var104.field551 = var102;
                class71.method952(var104);
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2125 == arg0.field1268) {
                int var105 = var3.method3312();
                int var106 = var3.method3312();
                int var107 = var3.method3276();
                int var108 = var3.method3456();
                class233 var109 = class233.method2957(var108);
                if (var109.field2689 != var105 || var109.field2742 != var107 || var109.field2655 != var106) {
                    var109.field2689 = var105;
                    var109.field2742 = var107;
                    var109.field2655 = var106;
                    method3069(var109);
                }
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2176 == arg0.field1268) {
                method4265(true, var3);
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2126 == arg0.field1268) {
                int var110 = var3.method3274();
                if (var3.method3274() == 0) {
                    field883[var110] = new class5();
                    var3.field2386 += 18;
                } else {
                    var3.field2386--;
                    field883[var110] = new class5(var3, false);
                }
                field650 = field765;
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2111 == arg0.field1268) {
                int var111 = arg0.field1277;
                int var112 = var3.field2386;
                class84.field1211 = 0;
                int var113 = 0;
                var3.method3547();
                for (int var114 = 0; var114 < class84.field1199; var114++) {
                    int var115 = class84.field1205[var114];
                    if ((class84.field1201[var115] & 0x1) == 0) {
                        if (var113 > 0) {
                            var113--;
                            class84.field1201[var115] = (byte) (class84.field1201[var115] | 0x2);
                        } else {
                            int var116 = var3.method3548(1);
                            if (var116 == 0) {
                                var113 = class84.method144(var3);
                                class84.field1201[var115] = (byte) (class84.field1201[var115] | 0x2);
                            } else {
                                class84.method652(var3, var115);
                            }
                        }
                    }
                }
                var3.method3549();
                if (var113 != 0) {
                    throw new RuntimeException();
                }
                var3.method3547();
                for (int var117 = 0; var117 < class84.field1199; var117++) {
                    int var118 = class84.field1205[var117];
                    if ((class84.field1201[var118] & 0x1) != 0) {
                        if (var113 > 0) {
                            var113--;
                            class84.field1201[var118] = (byte) (class84.field1201[var118] | 0x2);
                        } else {
                            int var119 = var3.method3548(1);
                            if (var119 == 0) {
                                var113 = class84.method144(var3);
                                class84.field1201[var118] = (byte) (class84.field1201[var118] | 0x2);
                            } else {
                                class84.method652(var3, var118);
                            }
                        }
                    }
                }
                var3.method3549();
                if (var113 != 0) {
                    throw new RuntimeException();
                }
                var3.method3547();
                for (int var120 = 0; var120 < class84.field1206; var120++) {
                    int var121 = class84.field1207[var120];
                    if ((class84.field1201[var121] & 0x1) != 0) {
                        if (var113 > 0) {
                            var113--;
                            class84.field1201[var121] = (byte) (class84.field1201[var121] | 0x2);
                        } else {
                            int var122 = var3.method3548(1);
                            if (var122 == 0) {
                                var113 = class84.method144(var3);
                                class84.field1201[var121] = (byte) (class84.field1201[var121] | 0x2);
                            } else if (class84.method1771(var3, var121)) {
                                class84.field1201[var121] = (byte) (class84.field1201[var121] | 0x2);
                            }
                        }
                    }
                }
                var3.method3549();
                if (var113 != 0) {
                    throw new RuntimeException();
                }
                var3.method3547();
                for (int var123 = 0; var123 < class84.field1206; var123++) {
                    int var124 = class84.field1207[var123];
                    if ((class84.field1201[var124] & 0x1) == 0) {
                        if (var113 > 0) {
                            var113--;
                            class84.field1201[var124] = (byte) (class84.field1201[var124] | 0x2);
                        } else {
                            int var125 = var3.method3548(1);
                            if (var125 == 0) {
                                var113 = class84.method144(var3);
                                class84.field1201[var124] = (byte) (class84.field1201[var124] | 0x2);
                            } else if (class84.method1771(var3, var124)) {
                                class84.field1201[var124] = (byte) (class84.field1201[var124] | 0x2);
                            }
                        }
                    }
                }
                var3.method3549();
                if (var113 != 0) {
                    throw new RuntimeException();
                }
                class84.field1199 = 0;
                class84.field1206 = 0;
                for (int var126 = 1; var126 < 2048; var126++) {
                    class84.field1201[var126] = (byte) (class84.field1201[var126] >> 1);
                    class62 var127 = field735[var126];
                    if (var127 == null) {
                        class84.field1207[++class84.field1206 - 1] = var126;
                    } else {
                        class84.field1205[++class84.field1199 - 1] = var126;
                    }
                }
                for (int var128 = 0; var128 < class84.field1211; var128++) {
                    int var129 = class84.field1213[var128];
                    class62 var130 = field735[var129];
                    int var131 = var3.method3274();
                    if ((var131 & 0x20) != 0) {
                        var131 += var3.method3274() << 8;
                    }
                    class84.method984(var3, var129, var130, var131);
                }
                if (var3.field2386 - var112 != var111) {
                    throw new RuntimeException(var3.field2386 - var112 + " " + var111);
                }
                method639();
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2128 == arg0.field1268) {
                Statics.field1078 = class310.method3081(var3.method3274());
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2162 == arg0.field1268) {
                Statics.field3718 = var3.method3389();
                Statics.field2598 = var3.method3305();
                for (int var132 = Statics.field3718; var132 < Statics.field3718 + 8; var132++) {
                    for (int var133 = Statics.field2598; var133 < Statics.field2598 + 8; var133++) {
                        if (field747[Statics.field348][var132][var133] != null) {
                            field747[Statics.field348][var132][var133] = null;
                            method5136(var132, var133);
                        }
                    }
                }
                for (class64 var134 = (class64) field876.method3792(); var134 != null; var134 = (class64) field876.method3800()) {
                    if (var134.field895 >= Statics.field3718 && var134.field895 < Statics.field3718 + 8 && var134.field896 >= Statics.field2598 && var134.field896 < Statics.field2598 + 8 && Statics.field348 == var134.field906) {
                        var134.field893 = 0;
                    }
                }
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2124 == arg0.field1268) {
                int var135 = var3.method3389();
                String var136 = var3.method3490();
                int var137 = var3.method3304();
                if (var137 >= 1 && var137 <= 8) {
                    if (var136.equalsIgnoreCase(class240.field2830)) {
                        var136 = null;
                    }
                    field743[var137 - 1] = var136;
                    field680[var137 - 1] = var135 == 0;
                }
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2109 == arg0.field1268) {
                byte var138 = var3.method3275();
                int var139 = var3.method3276();
                class228.field2597[var139] = var138;
                if (class228.field2596[var139] != var138) {
                    class228.field2596[var139] = var138;
                }
                method143(var139);
                field748[++field740 - 1 & 0x1F] = var139;
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2153 == arg0.field1268) {
                method130(class174.field2298);
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2160 == arg0.field1268) {
                field683 = var3.method3274();
                if (field683 == 1) {
                    field640 = var3.method3276();
                }
                if (field683 >= 2 && field683 <= 6) {
                    if (field683 == 2) {
                        field645 = 64;
                        field646 = 64;
                    }
                    if (field683 == 3) {
                        field645 = 0;
                        field646 = 64;
                    }
                    if (field683 == 4) {
                        field645 = 128;
                        field646 = 64;
                    }
                    if (field683 == 5) {
                        field645 = 64;
                        field646 = 0;
                    }
                    if (field683 == 6) {
                        field645 = 64;
                        field646 = 128;
                    }
                    field683 = 2;
                    field642 = var3.method3276();
                    field643 = var3.method3276();
                    field644 = var3.method3274();
                }
                if (field683 == 10) {
                    field619 = var3.method3276();
                }
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2144 == arg0.field1268) {
                Statics.field3718 = var3.method3274();
                Statics.field2598 = var3.method3274();
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2172 == arg0.field1268) {
                Statics.method2088();
                field784 = var3.method3274();
                field862 = field765;
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2154 == arg0.field1268) {
                int var140 = var3.method3276();
                if (var140 == 65535) {
                    var140 = -1;
                }
                int var141 = var3.method3456();
                int var142 = var3.method3358();
                class233 var143 = class233.method2957(var142);
                if (var143.field2637) {
                    var143.field2759 = var140;
                    var143.field2670 = var141;
                    class272 var145 = Statics.method945(var140);
                    var143.field2689 = var145.field3468;
                    var143.field2742 = var145.field3469;
                    var143.field2691 = var145.field3470;
                    var143.field2642 = var145.field3495;
                    var143.field2627 = var145.field3472;
                    var143.field2655 = var145.field3452;
                    if (var145.field3473 == 1) {
                        var143.field2697 = 1;
                    } else {
                        var143.field2697 = 2;
                    }
                    if (var143.field2746 > 0) {
                        var143.field2655 = var143.field2655 * 32 / var143.field2746;
                    } else if (var143.field2649 > 0) {
                        var143.field2655 = var143.field2655 * 32 / var143.field2649;
                    }
                    method3069(var143);
                } else if (var140 == -1) {
                    var143.field2681 = 0;
                    arg0.field1268 = null;
                    return true;
                } else {
                    class272 var144 = Statics.method945(var140);
                    var143.field2681 = 4;
                    var143.field2682 = var140;
                    var143.field2689 = var144.field3468;
                    var143.field2742 = var144.field3469;
                    var143.field2655 = var144.field3452 * 100 / var141;
                    method3069(var143);
                }
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2146 == arg0.field1268) {
                int var146 = var3.method3314();
                int var147 = var3.method3456();
                int var148 = var3.method3314();
                class233 var149 = class233.method2957(var147);
                var149.field2694 = (var148 << 16) + var146;
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2148 == arg0.field1268) {
                int var150 = var3.method3323();
                int var151 = var3.method3314();
                class233 var152 = class233.method2957(var150);
                if (var152.field2681 != 1 || var152.field2682 != var151) {
                    var152.field2681 = 1;
                    var152.field2682 = var151;
                    method3069(var152);
                }
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2120 == arg0.field1268) {
                var3.field2386 += 28;
                if (var3.method3273()) {
                    int var153 = var3.field2386 - 28;
                    byte[] var154 = var3.field2387;
                    if (field659 == null) {
                        field659 = new byte[24];
                    }
                    class196.method3602(var154, var153, field659, 0, 24);
                    if (class158.field2012 != null) {
                        try {
                            class158.field2012.method2308(0L);
                            class158.field2012.method2314(var3.field2387, var153, 24);
                        } catch (Exception var295) {
                        }
                    }
                }
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2142 == arg0.field1268) {
                field658 = var3.method3274();
                if (field658 == 255) {
                    field658 = 0;
                }
                field802 = var3.method3274();
                if (field802 == 255) {
                    field802 = 0;
                }
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2149 == arg0.field1268) {
                method130(class174.field2292);
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2141 == arg0.field1268) {
                for (int var156 = 0; var156 < field735.length; var156++) {
                    if (field735[var156] != null) {
                        field735[var156].field944 = -1;
                    }
                }
                for (int var157 = 0; var157 < field660.length; var157++) {
                    if (field660[var157] != null) {
                        field660[var157].field944 = -1;
                    }
                }
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2104 == arg0.field1268) {
                field833 = var3.method3305();
                field626 = var3.method3305();
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2152 == arg0.field1268) {
                int var158 = arg0.field1277 + var3.field2386;
                int var159 = var3.method3276();
                int var160 = var3.method3276();
                if (field672 != var159) {
                    field672 = var159;
                    this.method1401(false);
                    method16(field672);
                    class71.method220(field672);
                    for (int var161 = 0; var161 < 100; var161++) {
                        field822[var161] = true;
                    }
                }
                while (var160-- > 0) {
                    int var162 = var3.method3279();
                    int var163 = var3.method3276();
                    int var164 = var3.method3274();
                    class57 var165 = (class57) field780.method3735((long) var162);
                    if (var165 != null && var165.field535 != var163) {
                        method5075(var165, true);
                        var165 = null;
                    }
                    if (var165 == null) {
                        class57 var166 = new class57();
                        var166.field535 = var163;
                        var166.field536 = var164;
                        field780.method3733(var166, (long) var162);
                        method16(var163);
                        class233 var167 = class233.method2957(var162);
                        method3069(var167);
                        if (field709 != null) {
                            method3069(field709);
                            field709 = null;
                        }
                        method1003();
                        method1514(Statics.field2674[var162 >> 16], var167, false);
                        class71.method220(var163);
                        if (field672 != -1) {
                            method934(field672, 1);
                        }
                        var165 = var166;
                    }
                    var165.field539 = true;
                }
                for (class57 var169 = (class57) field780.method3741(); var169 != null; var169 = (class57) field780.method3734()) {
                    if (var169.field539) {
                        var169.field539 = false;
                    } else {
                        method5075(var169, true);
                    }
                }
                field819 = new class205(512);
                while (var3.field2386 < var158) {
                    int var170 = var3.method3279();
                    int var171 = var3.method3276();
                    int var172 = var3.method3276();
                    int var173 = var3.method3279();
                    for (int var174 = var171; var174 <= var172; var174++) {
                        long var175 = ((long) var170 << 32) + (long) var174;
                        field819.method3733(new class214(var173), var175);
                    }
                }
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2164 == arg0.field1268) {
                method130(class174.field2295);
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2158 == arg0.field1268) {
                int var177 = var3.method3323();
                String var178 = var3.method3490();
                class233 var179 = class233.method2957(var177);
                if (!var178.equals(var179.field2660)) {
                    var179.field2660 = var178;
                    method3069(var179);
                }
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2150 == arg0.field1268) {
                boolean var180 = var3.method3274() == 1;
                if (var180) {
                    Statics.field3672 = class187.method3154() - var3.method3280();
                    Statics.field233 = new class2(var3, true);
                } else {
                    Statics.field233 = null;
                }
                field813 = field765;
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2107 == arg0.field1268) {
                int var181 = var3.method3456();
                int var182 = var3.method3312();
                class233 var183 = class233.method2957(var181);
                if (var183.field2681 != 2 || var183.field2682 != var182) {
                    var183.field2681 = 2;
                    var183.field2682 = var182;
                    method3069(var183);
                }
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2180 == arg0.field1268) {
                boolean var184 = var3.method3281();
                if (!var184) {
                    Statics.field196 = null;
                } else if (Statics.field196 == null) {
                    Statics.field196 = new class254();
                }
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2097 == arg0.field1268) {
                int var185 = var3.method3313();
                int var186 = var3.method3358();
                int var187 = var3.method3305();
                class57 var188 = (class57) field780.method3735((long) var186);
                if (var188 != null) {
                    method5075(var188, var188.field535 != var185);
                }
                class57 var189 = new class57();
                var189.field535 = var185;
                var189.field536 = var187;
                field780.method3733(var189, (long) var186);
                method16(var185);
                class233 var190 = class233.method2957(var186);
                method3069(var190);
                if (field709 != null) {
                    method3069(field709);
                    field709 = null;
                }
                method1003();
                method1514(Statics.field2674[var186 >> 16], var190, false);
                class71.method220(var185);
                if (field672 != -1) {
                    method934(field672, 1);
                }
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2133 == arg0.field1268) {
                method130(class174.field2301);
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2175 == arg0.field1268) {
                int var191 = var3.method3274();
                method207(var191);
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2114 == arg0.field1268) {
                int var192 = var3.method3323();
                int var193 = var3.method3312();
                class233 var194 = class233.method2957(var192);
                if (var194 != null && var194.field2680 == 0) {
                    if (var193 > var194.field2662 - var194.field2654) {
                        var193 = var194.field2662 - var194.field2654;
                    }
                    if (var193 < 0) {
                        var193 = 0;
                    }
                    if (var194.field2692 != var193) {
                        var194.field2692 = var193;
                        method3069(var194);
                    }
                }
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2145 == arg0.field1268) {
                method130(class174.field2299);
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2099 == arg0.field1268) {
                if (arg0.field1277 == 0) {
                    Statics.field65 = null;
                } else {
                    if (Statics.field65 == null) {
                        Statics.field65 = new class296(Statics.field2289, Statics.field391);
                    }
                    Statics.field65.method5113(var3);
                }
                method137();
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2101 == arg0.field1268) {
                field638 = var3.method3313() * 30;
                field862 = field765;
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2110 == arg0.field1268) {
                String var195 = var3.method3490();
                long var196 = (long) var3.method3276();
                long var198 = (long) var3.method3494();
                class245[] var200 = new class245[] { class245.field3158, class245.field3156, class245.field3154, class245.field3157, class245.field3159, class245.field3155 };
                class245 var201 = (class245) class180.method34(var200, var3.method3274());
                long var202 = (var196 << 32) + var198;
                boolean var204 = false;
                for (int var205 = 0; var205 < 100; var205++) {
                    if (field687[var205] == var202) {
                        var204 = true;
                        break;
                    }
                }
                if (Statics.field1240.method1588(new class294(var195, Statics.field2289))) {
                    var204 = true;
                }
                if (!var204 && field753 == 0) {
                    field687[field714] = var202;
                    field714 = (field714 + 1) % 100;
                    String var209;
                    try {
                        int var206 = var3.method3288();
                        if (var206 > 32767) {
                            var206 = 32767;
                        }
                        byte[] var207 = new byte[var206];
                        var3.field2386 += Statics.field3746.method3195(var3.field2387, var3.field2386, var207, 0, var206);
                        String var208 = class304.method5090(var207, 0, var206);
                        var209 = var208;
                    } catch (Exception var294) {
                        var209 = "Cabbage";
                    }
                    String var212 = class302.method5237(class308.method1711(var209));
                    byte var213;
                    if (var201.field3161) {
                        var213 = 7;
                    } else {
                        var213 = 3;
                    }
                    if (var201.field3160 == -1) {
                        class86.method1515(var213, var195, var212);
                    } else {
                        int var215 = var201.field3160;
                        String var216 = "<img=" + var215 + ">";
                        class86.method1515(var213, var216 + var195, var212);
                    }
                }
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2169 == arg0.field1268) {
                method4265(false, var3);
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2177 == arg0.field1268) {
                int var217 = var3.method3279();
                int var218 = var3.method3276();
                if (var217 < -70000) {
                    var218 += 32768;
                }
                class233 var219;
                if (var217 >= 0) {
                    var219 = class233.method2957(var217);
                } else {
                    var219 = null;
                }
                while (var3.field2386 < arg0.field1277) {
                    int var220 = var3.method3288();
                    int var221 = var3.method3276();
                    int var222 = 0;
                    if (var221 != 0) {
                        var222 = var3.method3274();
                        if (var222 == 255) {
                            var222 = var3.method3279();
                        }
                    }
                    if (var219 != null && var220 >= 0 && var220 < var219.field2736.length) {
                        var219.field2736[var220] = var221;
                        var219.field2758[var220] = var222;
                    }
                    class55.method117(var218, var220, var221 - 1, var222);
                }
                if (var219 != null) {
                    method3069(var219);
                }
                Statics.method2088();
                field847[++field880 - 1 & 0x1F] = var218 & 0x7FFF;
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2117 == arg0.field1268) {
                for (int var223 = 0; var223 < Statics.field67; var223++) {
                    class257 var224 = class257.method1871(var223);
                    if (var224 != null) {
                        class228.field2597[var223] = 0;
                        class228.field2596[var223] = 0;
                    }
                }
                Statics.method2088();
                field740 += 32;
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2118 == arg0.field1268) {
                String var225 = var3.method3490();
                long var226 = var3.method3280();
                long var228 = (long) var3.method3276();
                long var230 = (long) var3.method3494();
                class245[] var232 = new class245[] { class245.field3158, class245.field3156, class245.field3154, class245.field3157, class245.field3159, class245.field3155 };
                class245 var233 = (class245) class180.method34(var232, var3.method3274());
                long var234 = (var228 << 32) + var230;
                boolean var236 = false;
                for (int var237 = 0; var237 < 100; var237++) {
                    if (field687[var237] == var234) {
                        var236 = true;
                        break;
                    }
                }
                if (var233.field3153 && Statics.field1240.method1588(new class294(var225, Statics.field2289))) {
                    var236 = true;
                }
                if (!var236 && field753 == 0) {
                    field687[field714] = var234;
                    field714 = (field714 + 1) % 100;
                    String var241;
                    try {
                        int var238 = var3.method3288();
                        if (var238 > 32767) {
                            var238 = 32767;
                        }
                        byte[] var239 = new byte[var238];
                        var3.field2386 += Statics.field3746.method3195(var3.field2387, var3.field2386, var239, 0, var238);
                        String var240 = class304.method5090(var239, 0, var238);
                        var241 = var240;
                    } catch (Exception var293) {
                        var241 = "Cabbage";
                    }
                    String var244 = class302.method5237(class308.method1711(var241));
                    if (var233.field3160 == -1) {
                        class86.method485(9, var225, var244, class306.method1772(var226));
                    } else {
                        int var245 = var233.field3160;
                        String var246 = "<img=" + var245 + ">";
                        class86.method485(9, var246 + var225, var244, class306.method1772(var226));
                    }
                }
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2134 == arg0.field1268) {
                Statics.method2088();
                int var247 = var3.method3304();
                int var248 = var3.method3456();
                int var249 = var3.method3305();
                field768[var249] = var248;
                field751[var249] = var247;
                field752[var249] = 1;
                for (int var250 = 0; var250 < 98; var250++) {
                    if (var248 >= class237.field2812[var250]) {
                        field752[var249] = var250 + 2;
                    }
                }
                field807[++field634 - 1 & 0x1F] = var249;
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2166 == arg0.field1268) {
                method130(class174.field2294);
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2130 == arg0.field1268) {
                method130(class174.field2300);
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2131 == arg0.field1268) {
                int var251 = var3.method3279();
                int var252 = var3.method3279();
                int var253 = 0;
                if (Statics.field1746 == null || !Statics.field1746.isValid()) {
                    try {
                        Iterator var254 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                        while (var254.hasNext()) {
                            GarbageCollectorMXBean var255 = (GarbageCollectorMXBean) var254.next();
                            if (var255.isValid()) {
                                Statics.field1746 = var255;
                                field433 = -1L;
                                field445 = -1L;
                            }
                        }
                    } catch (Throwable var298) {
                    }
                }
                if (Statics.field1746 != null) {
                    long var257 = class187.method3154();
                    long var259 = Statics.field1746.getCollectionTime();
                    if (field445 != -1L) {
                        long var261 = var259 - field445;
                        long var263 = var257 - field433;
                        if (var263 != 0L) {
                            var253 = (int) (var261 * 100L / var263);
                        }
                    }
                    field445 = var259;
                    field433 = var257;
                }
                class175 var267 = class175.method107(class172.field2192, field830.field1266);
                var267.field2311.method3353(field422);
                var267.field2311.method3301(var253);
                var267.field2311.method3386(var251);
                var267.field2311.method3386(var252);
                field830.method1875(var267);
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2135 == arg0.field1268) {
                int var268 = var3.method3288();
                boolean var269 = var3.method3274() == 1;
                String var270 = "";
                boolean var271 = false;
                if (var269) {
                    var270 = var3.method3490();
                    if (Statics.field1240.method1588(new class294(var270, Statics.field2289))) {
                        var271 = true;
                    }
                }
                String var272 = var3.method3490();
                if (!var271) {
                    class86.method1515(var268, var270, var272);
                }
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2157 == arg0.field1268) {
                int var273 = var3.method3274();
                int var274 = var3.method3274();
                int var275 = var3.method3274();
                int var276 = var3.method3274();
                field779[var273] = true;
                field797[var273] = var274;
                field725[var273] = var275;
                field865[var273] = var276;
                field868[var273] = 0;
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2113 == arg0.field1268) {
                if (field672 != -1) {
                    method934(field672, 0);
                }
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2123 == arg0.field1268) {
                if (Statics.field65 != null) {
                    Statics.field65.method5114(var3);
                }
                method137();
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2147 == arg0.field1268) {
                int var277 = var3.method3312();
                class55.method4263(var277);
                field847[++field880 - 1 & 0x1F] = var277 & 0x7FFF;
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2116 == arg0.field1268) {
                int var278 = var3.method3276();
                int var279 = var3.method3274();
                int var280 = var3.method3276();
                if (field853 != 0 && var279 != 0 && field855 < 50) {
                    field856[field855] = var278;
                    field857[field855] = var279;
                    field809[field855] = var280;
                    field860[field855] = null;
                    field859[field855] = 0;
                    field855++;
                }
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2174 == arg0.field1268) {
                method1853(true, arg0.field1267);
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2156 == arg0.field1268) {
                int var284 = var3.method3358();
                class233 var285 = class233.method2957(var284);
                var285.field2681 = 3;
                var285.field2682 = Statics.field341.field599.method4144();
                method3069(var285);
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2178 == arg0.field1268) {
                method130(class174.field2293);
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2112 == arg0.field1268) {
                method1853(false, arg0.field1267);
                arg0.field1268 = null;
                return true;
            }
            if (class171.field2108 == arg0.field1268) {
                Statics.field2598 = var3.method3389();
                Statics.field3718 = var3.method3389();
                while (var3.field2386 < arg0.field1277) {
                    int var286 = var3.method3274();
                    class174[] var287 = new class174[] { class174.field2296, class174.field2301, class174.field2294, class174.field2295, class174.field2293, class174.field2292, class174.field2298, class174.field2300, class174.field2297, class174.field2299 };
                    class174 var288 = var287[var286];
                    method130(var288);
                }
                arg0.field1268 = null;
                return true;
            }
            class155.method2337("" + (arg0.field1268 == null ? -1 : arg0.field1268.field2181) + class76.field1098 + (arg0.field1274 == null ? -1 : arg0.field1274.field2181) + class76.field1098 + (arg0.field1275 == null ? -1 : arg0.field1275.field2181) + class76.field1098 + arg0.field1277, (Throwable) null);
            method221();
        } catch (IOException var299) {
            method1459();
        } catch (Exception var300) {
            String var291 = "" + (arg0.field1268 == null ? -1 : arg0.field1268.field2181) + class76.field1098 + (arg0.field1274 == null ? -1 : arg0.field1274.field2181) + class76.field1098 + (arg0.field1275 == null ? -1 : arg0.field1275.field2181) + class76.field1098 + arg0.field1277 + class76.field1098 + (Statics.field6 + Statics.field341.field927[0]) + class76.field1098 + (Statics.field72 + Statics.field341.field940[0]) + class76.field1098;
            for (int var292 = 0; var292 < arg0.field1277 && var292 < 50; var292++) {
                var291 = var291 + var3.field2387[var292] + class76.field1098;
            }
            class155.method2337(var291, var300);
            method221();
        }
        return true;
    }

    @ObfuscatedName("d.gy(Lfv;I)V")
    public static final void method130(class174 arg0) {
        class192 var1 = field830.field1267;
        if (class174.field2297 == arg0) {
            int var2 = var1.method3304();
            int var3 = (var2 >> 4 & 0x7) + Statics.field3718;
            int var4 = (var2 & 0x7) + Statics.field2598;
            int var5 = var1.method3274();
            int var6 = var5 >> 2;
            int var7 = var5 & 0x3;
            int var8 = field676[var6];
            int var9 = var1.method3314();
            if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
                method5301(Statics.field348, var3, var4, var8, var9, var6, var7, 0, -1);
            }
        } else if (class174.field2300 == arg0) {
            int var10 = var1.method3313();
            int var11 = var1.method3276();
            int var12 = var1.method3313();
            int var13 = var1.method3389();
            int var14 = (var13 >> 4 & 0x7) + Statics.field3718;
            int var15 = (var13 & 0x7) + Statics.field2598;
            if (var14 >= 0 && var15 >= 0 && var14 < 104 && var15 < 104) {
                class208 var16 = field747[Statics.field348][var14][var15];
                if (var16 != null) {
                    for (class82 var17 = (class82) var16.method3792(); var17 != null; var17 = (class82) var16.method3800()) {
                        if ((var10 & 0x7FFF) == var17.field1193 && var17.field1189 == var11) {
                            var17.field1189 = var12;
                            break;
                        }
                    }
                    method5136(var14, var15);
                }
            }
        } else if (class174.field2295 == arg0) {
            int var18 = var1.method3276();
            int var19 = var1.method3305();
            int var20 = (var19 >> 4 & 0x7) + Statics.field3718;
            int var21 = (var19 & 0x7) + Statics.field2598;
            int var22 = var1.method3314();
            if (var20 >= 0 && var21 >= 0 && var20 < 104 && var21 < 104) {
                class82 var23 = new class82();
                var23.field1193 = var18;
                var23.field1189 = var22;
                if (field747[Statics.field348][var20][var21] == null) {
                    field747[Statics.field348][var20][var21] = new class208();
                }
                field747[Statics.field348][var20][var21].method3793(var23);
                method5136(var20, var21);
            }
        } else if (class174.field2299 == arg0) {
            int var24 = var1.method3389();
            int var25 = (var24 >> 4 & 0x7) + Statics.field3718;
            int var26 = (var24 & 0x7) + Statics.field2598;
            int var27 = var1.method3304();
            int var28 = var27 >> 2;
            int var29 = var27 & 0x3;
            int var30 = field676[var28];
            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104) {
                method5301(Statics.field348, var25, var26, var30, -1, var28, var29, 0, -1);
            }
        } else {
            if (class174.field2296 == arg0) {
                int var31 = var1.method3274();
                int var32 = (var31 >> 4 & 0x7) + Statics.field3718;
                int var33 = (var31 & 0x7) + Statics.field2598;
                int var34 = var1.method3304();
                int var35 = var34 >> 4 & 0xF;
                int var36 = var34 & 0x7;
                int var37 = var1.method3305();
                int var38 = var1.method3276();
                if (var32 >= 0 && var33 >= 0 && var32 < 104 && var33 < 104) {
                    int var39 = var35 + 1;
                    if (Statics.field341.field927[0] >= var32 - var39 && Statics.field341.field927[0] <= var32 + var39 && Statics.field341.field940[0] >= var33 - var39 && Statics.field341.field940[0] <= var33 + var39 && field854 != 0 && var36 > 0 && field855 < 50) {
                        field856[field855] = var38;
                        field857[field855] = var36;
                        field809[field855] = var37;
                        field860[field855] = null;
                        field859[field855] = (var32 << 16) + (var33 << 8) + var35;
                        field855++;
                    }
                }
            }
            if (class174.field2292 == arg0) {
                int var40 = var1.method3312();
                byte var41 = var1.method3275();
                int var42 = var1.method3389();
                int var43 = (var42 >> 4 & 0x7) + Statics.field3718;
                int var44 = (var42 & 0x7) + Statics.field2598;
                byte var45 = var1.method3275();
                byte var46 = var1.method3479();
                int var47 = var1.method3274();
                int var48 = var47 >> 2;
                int var49 = var47 & 0x3;
                int var50 = field676[var48];
                int var51 = var1.method3313();
                int var52 = var1.method3312();
                byte var53 = var1.method3308();
                int var54 = var1.method3312();
                class62 var55;
                if (field736 == var52) {
                    var55 = Statics.field341;
                } else {
                    var55 = field735[var52];
                }
                if (var55 != null) {
                    class271 var56 = class271.method4255(var54);
                    int var57;
                    int var58;
                    if (var49 == 1 || var49 == 3) {
                        var57 = var56.field3418;
                        var58 = var56.field3417;
                    } else {
                        var57 = var56.field3417;
                        var58 = var56.field3418;
                    }
                    int var59 = (var57 >> 1) + var43;
                    int var60 = (var57 + 1 >> 1) + var43;
                    int var61 = (var58 >> 1) + var44;
                    int var62 = (var58 + 1 >> 1) + var44;
                    int[][] var63 = class51.field487[Statics.field348];
                    int var64 = var63[var59][var61] + var63[var60][var61] + var63[var59][var62] + var63[var60][var62] >> 2;
                    int var65 = (var43 << 7) + (var57 << 6);
                    int var66 = (var44 << 7) + (var58 << 6);
                    class122 var67 = var56.method4701(var48, var49, var63, var65, var64, var66);
                    if (var67 != null) {
                        method5301(Statics.field348, var43, var44, var50, -1, 0, 0, var40 + 1, var51 + 1);
                        var55.field586 = field631 + var40;
                        var55.field596 = field631 + var51;
                        var55.field597 = var67;
                        var55.field584 = var43 * 128 + var57 * 64;
                        var55.field608 = var44 * 128 + var58 * 64;
                        var55.field595 = var64;
                        if (var46 > var45) {
                            byte var68 = var46;
                            var46 = var45;
                            var45 = var68;
                        }
                        if (var53 > var41) {
                            byte var69 = var53;
                            var53 = var41;
                            var41 = var69;
                        }
                        var55.field598 = var43 + var46;
                        var55.field600 = var43 + var45;
                        var55.field601 = var44 + var53;
                        var55.field588 = var41 + var44;
                    }
                }
            }
            if (class174.field2301 == arg0) {
                byte var70 = var1.method3308();
                int var71 = var1.method3389();
                int var72 = (var71 >> 4 & 0x7) + Statics.field3718;
                int var73 = (var71 & 0x7) + Statics.field2598;
                byte var74 = var1.method3275();
                int var75 = var1.method3313();
                int var76 = var1.method3274() * 4;
                int var77 = var1.method3304() * 4;
                int var78 = var1.method3389();
                int var79 = var1.method3314();
                int var80 = var1.method3389();
                int var81 = var1.method3313();
                int var82 = var1.method3316();
                int var83 = var72 + var74;
                int var84 = var70 + var73;
                if (var72 >= 0 && var73 >= 0 && var72 < 104 && var73 < 104 && var83 >= 0 && var84 >= 0 && var83 < 104 && var84 < 104 && var75 != 65535) {
                    int var85 = var72 * 128 + 64;
                    int var86 = var73 * 128 + 64;
                    int var87 = var83 * 128 + 64;
                    int var88 = var84 * 128 + 64;
                    class81 var89 = new class81(var75, Statics.field348, var85, var86, method3573(var85, var86, Statics.field348) - var77, field631 + var79, field631 + var81, var80, var78, var82, var76);
                    var89.method1765(var87, var88, method3573(var87, var88, Statics.field348) - var76, field631 + var79);
                    field749.method3793(var89);
                }
            } else if (class174.field2293 == arg0) {
                int var90 = var1.method3305();
                int var91 = (var90 >> 4 & 0x7) + Statics.field3718;
                int var92 = (var90 & 0x7) + Statics.field2598;
                int var93 = var1.method3313();
                if (var91 >= 0 && var92 >= 0 && var91 < 104 && var92 < 104) {
                    class208 var94 = field747[Statics.field348][var91][var92];
                    if (var94 != null) {
                        for (class82 var95 = (class82) var94.method3792(); var95 != null; var95 = (class82) var94.method3800()) {
                            if ((var93 & 0x7FFF) == var95.field1193) {
                                var95.method3787();
                                break;
                            }
                        }
                        if (var94.method3792() == null) {
                            field747[Statics.field348][var91][var92] = null;
                        }
                        method5136(var91, var92);
                    }
                }
            } else if (class174.field2294 == arg0) {
                int var96 = var1.method3276();
                int var97 = var1.method3274();
                int var98 = (var97 >> 4 & 0x7) + Statics.field3718;
                int var99 = (var97 & 0x7) + Statics.field2598;
                int var100 = var1.method3313();
                int var101 = var1.method3274();
                if (var98 >= 0 && var99 >= 0 && var98 < 104 && var99 < 104) {
                    int var102 = var98 * 128 + 64;
                    int var103 = var99 * 128 + 64;
                    class72 var104 = new class72(var96, Statics.field348, var102, var103, method3573(var102, var103, Statics.field348) - var101, var100, field631);
                    field750.method3793(var104);
                }
            } else if (class174.field2298 == arg0) {
                int var105 = var1.method3305();
                int var106 = (var105 >> 4 & 0x7) + Statics.field3718;
                int var107 = (var105 & 0x7) + Statics.field2598;
                int var108 = var1.method3314();
                int var109 = var1.method3305();
                int var110 = var109 >> 2;
                int var111 = var109 & 0x3;
                int var112 = field676[var110];
                if (var106 >= 0 && var107 >= 0 && var106 < 103 && var107 < 103) {
                    if (var112 == 0) {
                        class131 var113 = Statics.field267.method2668(Statics.field348, var106, var107);
                        if (var113 != null) {
                            int var114 = class123.method936(var113.field1841);
                            if (var110 == 2) {
                                var113.field1839 = new class88(var114, 2, var111 + 4, Statics.field348, var106, var107, var108, false, var113.field1839);
                                var113.field1844 = new class88(var114, 2, var111 + 1 & 0x3, Statics.field348, var106, var107, var108, false, var113.field1844);
                            } else {
                                var113.field1839 = new class88(var114, var110, var111, Statics.field348, var106, var107, var108, false, var113.field1839);
                            }
                        }
                    }
                    if (var112 == 1) {
                        class136 var115 = Statics.field267.method2679(Statics.field348, var106, var107);
                        if (var115 != null) {
                            int var116 = class123.method936(var115.field1886);
                            if (var110 == 4 || var110 == 5) {
                                var115.field1878 = new class88(var116, 4, var111, Statics.field348, var106, var107, var108, false, var115.field1878);
                            } else if (var110 == 6) {
                                var115.field1878 = new class88(var116, 4, var111 + 4, Statics.field348, var106, var107, var108, false, var115.field1878);
                            } else if (var110 == 7) {
                                var115.field1878 = new class88(var116, 4, (var111 + 2 & 0x3) + 4, Statics.field348, var106, var107, var108, false, var115.field1878);
                            } else if (var110 == 8) {
                                var115.field1878 = new class88(var116, 4, var111 + 4, Statics.field348, var106, var107, var108, false, var115.field1878);
                                var115.field1885 = new class88(var116, 4, (var111 + 2 & 0x3) + 4, Statics.field348, var106, var107, var108, false, var115.field1885);
                            }
                        }
                    }
                    if (var112 == 2) {
                        class137 var117 = Statics.field267.method2680(Statics.field348, var106, var107);
                        if (var110 == 11) {
                            var110 = 10;
                        }
                        if (var117 != null) {
                            var117.field1895 = new class88(class123.method936(var117.field1903), var110, var111, Statics.field348, var106, var107, var108, false, var117.field1895);
                        }
                    }
                    if (var112 == 3) {
                        class118 var118 = Statics.field267.method2681(Statics.field348, var106, var107);
                        if (var118 != null) {
                            var118.field1576 = new class88(class123.method936(var118.field1577), 22, var111, Statics.field348, var106, var107, var108, false, var118.field1576);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("kq.gc(IIIIIIIIII)V")
    public static final void method5301(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class64 var9 = null;
        for (class64 var10 = (class64) field876.method3792(); var10 != null; var10 = (class64) field876.method3800()) {
            if (var10.field906 == arg0 && var10.field895 == arg1 && var10.field896 == arg2 && var10.field894 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class64();
            var9.field906 = arg0;
            var9.field894 = arg3;
            var9.field895 = arg1;
            var9.field896 = arg2;
            method4218(var9);
            field876.method3793(var9);
        }
        var9.field900 = arg4;
        var9.field902 = arg5;
        var9.field904 = arg6;
        var9.field903 = arg7;
        var9.field893 = arg8;
    }

    @ObfuscatedName("bg.gt(I)V")
    public static final void method973() {
        for (class64 var0 = (class64) field876.method3792(); var0 != null; var0 = (class64) field876.method3800()) {
            if (var0.field893 == -1) {
                var0.field903 = 0;
                method4218(var0);
            } else {
                var0.method3787();
            }
        }
    }

    @ObfuscatedName("hg.gq(Lbb;I)V")
    public static final void method4218(class64 arg0) {
        long var1 = 0L;
        int var3 = -1;
        int var4 = 0;
        int var5 = 0;
        if (arg0.field894 == 0) {
            var1 = Statics.field267.method2682(arg0.field906, arg0.field895, arg0.field896);
        }
        if (arg0.field894 == 1) {
            var1 = Statics.field267.method2794(arg0.field906, arg0.field895, arg0.field896);
        }
        if (arg0.field894 == 2) {
            var1 = Statics.field267.method2684(arg0.field906, arg0.field895, arg0.field896);
        }
        if (arg0.field894 == 3) {
            var1 = Statics.field267.method2685(arg0.field906, arg0.field895, arg0.field896);
        }
        if (var1 != 0L) {
            int var6 = Statics.field267.method2686(arg0.field906, arg0.field895, arg0.field896, var1);
            var3 = class123.method936(var1);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg0.field899 = var3;
        arg0.field897 = var4;
        arg0.field898 = var5;
    }

    @ObfuscatedName("fe.gl(B)V")
    public static final void method3238() {
        for (class64 var0 = (class64) field876.method3792(); var0 != null; var0 = (class64) field876.method3800()) {
            if (var0.field893 > 0) {
                var0.field893--;
            }
            if (var0.field893 != 0) {
                if (var0.field903 > 0) {
                    var0.field903--;
                }
                if (var0.field903 == 0 && var0.field895 >= 1 && var0.field896 >= 1 && var0.field895 <= 102 && var0.field896 <= 102 && (var0.field900 < 0 || class51.method128(var0.field900, var0.field902))) {
                    method3235(var0.field906, var0.field894, var0.field895, var0.field896, var0.field900, var0.field904, var0.field902);
                    var0.field903 = -1;
                    if (var0.field900 == var0.field899 && var0.field899 == -1) {
                        var0.method3787();
                    } else if (var0.field900 == var0.field899 && var0.field904 == var0.field898 && var0.field902 == var0.field897) {
                        var0.method3787();
                    }
                }
            } else if (var0.field899 < 0 || class51.method128(var0.field899, var0.field897)) {
                method3235(var0.field906, var0.field894, var0.field895, var0.field896, var0.field899, var0.field898, var0.field897);
                var0.method3787();
            }
        }
    }

    @ObfuscatedName("ft.gf(IIIIIIIB)V")
    public static final void method3235(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field624 && Statics.field348 != arg0) {
            return;
        }
        long var7 = 0L;
        boolean var9 = true;
        boolean var10 = false;
        boolean var11 = false;
        if (arg1 == 0) {
            var7 = Statics.field267.method2682(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field267.method2794(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field267.method2684(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field267.method2685(arg0, arg2, arg3);
        }
        if (var7 != 0L) {
            int var12 = Statics.field267.method2686(arg0, arg2, arg3, var7);
            int var13 = class123.method936(var7);
            int var14 = var12 & 0x1F;
            int var15 = var12 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field267.method2683(arg0, arg2, arg3);
                class271 var16 = class271.method4255(var13);
                if (var16.field3403 != 0) {
                    field677[arg0].method3115(arg2, arg3, var14, var15, var16.field3428);
                }
            }
            if (arg1 == 1) {
                Statics.field267.method2737(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field267.method2746(arg0, arg2, arg3);
                class271 var17 = class271.method4255(var13);
                if (var17.field3417 + arg2 > 103 || var17.field3417 + arg3 > 103 || var17.field3418 + arg2 > 103 || var17.field3418 + arg3 > 103) {
                    return;
                }
                if (var17.field3403 != 0) {
                    field677[arg0].method3112(arg2, arg3, var17.field3417, var17.field3418, var15, var17.field3428);
                }
            }
            if (arg1 == 3) {
                Statics.field267.method2676(arg0, arg2, arg3);
                class271 var18 = class271.method4255(var13);
                if (var18.field3403 == 1) {
                    field677[arg0].method3116(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var19 = arg0;
        if (arg0 < 3 && (class51.field498[1][arg2][arg3] & 0x2) == 2) {
            var19 = arg0 + 1;
        }
        Statics.method387(arg0, var19, arg2, arg3, arg4, arg5, arg6, Statics.field267, field677[arg0]);
    }

    @ObfuscatedName("ki.hl(III)V")
    public static final void method5136(int arg0, int arg1) {
        class208 var2 = field747[Statics.field348][arg0][arg1];
        if (var2 == null) {
            Statics.field267.method2677(Statics.field348, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class82 var5 = null;
        for (class82 var6 = (class82) var2.method3792(); var6 != null; var6 = (class82) var2.method3800()) {
            class272 var7 = Statics.method945(var6.field1193);
            long var8 = (long) var7.field3506;
            if (var7.field3473 == 1) {
                var8 = (long) (var6.field1189 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field267.method2677(Statics.field348, arg0, arg1);
            return;
        }
        var2.method3824(var5);
        class82 var10 = null;
        class82 var11 = null;
        for (class82 var12 = (class82) var2.method3792(); var12 != null; var12 = (class82) var2.method3800()) {
            if (var5.field1193 != var12.field1193) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1193 != var12.field1193 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        long var13 = class123.method3900(arg0, arg1, 3, false, 0);
        Statics.field267.method2688(Statics.field348, arg0, arg1, method3573(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field348), var5, var13, var10, var11);
    }

    @ObfuscatedName("ik.hc(ZLgz;I)V")
    public static final void method4265(boolean arg0, class192 arg1) {
        field804 = 0;
        field663 = 0;
        class192 var2 = field830.field1267;
        var2.method3547();
        int var3 = var2.method3548(8);
        if (var3 < field661) {
            for (int var4 = var3; var4 < field661; var4++) {
                field741[++field804 - 1] = field667[var4];
            }
        }
        if (var3 > field661) {
            throw new RuntimeException("");
        }
        field661 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = field667[var5];
            class74 var7 = field660[var6];
            int var8 = var2.method3548(1);
            if (var8 == 0) {
                field667[++field661 - 1] = var6;
                var7.field957 = field631;
            } else {
                int var9 = var2.method3548(2);
                if (var9 == 0) {
                    field667[++field661 - 1] = var6;
                    var7.field957 = field631;
                    field664[++field663 - 1] = var6;
                } else if (var9 == 1) {
                    field667[++field661 - 1] = var6;
                    var7.field957 = field631;
                    int var10 = var2.method3548(3);
                    var7.method1700(var10, (byte) 1);
                    int var11 = var2.method3548(1);
                    if (var11 == 1) {
                        field664[++field663 - 1] = var6;
                    }
                } else if (var9 == 2) {
                    field667[++field661 - 1] = var6;
                    var7.field957 = field631;
                    int var12 = var2.method3548(3);
                    var7.method1700(var12, (byte) 2);
                    int var13 = var2.method3548(3);
                    var7.method1700(var13, (byte) 2);
                    int var14 = var2.method3548(1);
                    if (var14 == 1) {
                        field664[++field663 - 1] = var6;
                    }
                } else if (var9 == 3) {
                    field741[++field804 - 1] = var6;
                }
            }
        }
        method25(arg0, arg1);
        method218(arg1);
        for (int var15 = 0; var15 < field804; var15++) {
            int var16 = field741[var15];
            if (field631 != field660[var16].field957) {
                field660[var16].field1077 = null;
                field660[var16] = null;
            }
        }
        if (field830.field1277 != arg1.field2386) {
            throw new RuntimeException(arg1.field2386 + class76.field1098 + field830.field1277);
        }
        for (int var17 = 0; var17 < field661; var17++) {
            if (field660[field667[var17]] == null) {
                throw new RuntimeException(var17 + class76.field1098 + field661);
            }
        }
    }

    @ObfuscatedName("o.hu(ZLgz;I)V")
    public static final void method25(boolean arg0, class192 arg1) {
        while (true) {
            if (arg1.method3550(field830.field1277) >= 27) {
                int var2 = arg1.method3548(15);
                if (var2 != 32767) {
                    boolean var3 = false;
                    if (field660[var2] == null) {
                        field660[var2] = new class74();
                        var3 = true;
                    }
                    class74 var4 = field660[var2];
                    field667[++field661 - 1] = var2;
                    var4.field957 = field631;
                    int var5;
                    if (arg0) {
                        var5 = arg1.method3548(8);
                        if (var5 > 127) {
                            var5 -= 256;
                        }
                    } else {
                        var5 = arg1.method3548(5);
                        if (var5 > 15) {
                            var5 -= 32;
                        }
                    }
                    var4.field1077 = class274.method1807(arg1.method3548(14));
                    int var6 = arg1.method3548(1);
                    if (var6 == 1) {
                        field664[++field663 - 1] = var2;
                    }
                    int var7;
                    if (arg0) {
                        var7 = arg1.method3548(8);
                        if (var7 > 127) {
                            var7 -= 256;
                        }
                    } else {
                        var7 = arg1.method3548(5);
                        if (var7 > 15) {
                            var7 -= 32;
                        }
                    }
                    int var8 = field794[arg1.method3548(3)];
                    if (var3) {
                        var4.field961 = var4.field921 = var8;
                    }
                    int var9 = arg1.method3548(1);
                    var4.field911 = var4.field1077.field3518;
                    var4.field959 = var4.field1077.field3541;
                    if (var4.field959 == 0) {
                        var4.field921 = 0;
                    }
                    var4.field916 = var4.field1077.field3524;
                    var4.field917 = var4.field1077.field3525;
                    var4.field945 = var4.field1077.field3526;
                    var4.field919 = var4.field1077.field3527;
                    var4.field913 = var4.field1077.field3521;
                    var4.field914 = var4.field1077.field3522;
                    var4.field915 = var4.field1077.field3523;
                    var4.method1697(Statics.field341.field927[0] + var5, Statics.field341.field940[0] + var7, var9 == 1);
                    continue;
                }
            }
            arg1.method3549();
            return;
        }
    }

    @ObfuscatedName("y.hi(Lgz;I)V")
    public static final void method218(class192 arg0) {
        for (int var1 = 0; var1 < field663; var1++) {
            int var2 = field664[var1];
            class74 var3 = field660[var2];
            int var4 = arg0.method3274();
            if ((var4 & 0x10) != 0) {
                int var5 = arg0.method3276();
                int var6 = arg0.method3313();
                int var7 = var3.field933 - (var5 - Statics.field6 - Statics.field6) * 64;
                int var8 = var3.field964 - (var6 - Statics.field72 - Statics.field72) * 64;
                if (var7 != 0 || var8 != 0) {
                    var3.field936 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
            if ((var4 & 0x40) != 0) {
                var3.field941 = arg0.method3314();
                int var9 = arg0.method3358();
                var3.field949 = var9 >> 16;
                var3.field948 = (var9 & 0xFFFF) + field631;
                var3.field931 = 0;
                var3.field947 = 0;
                if (var3.field948 > field631) {
                    var3.field931 = -1;
                }
                if (var3.field941 == 65535) {
                    var3.field941 = -1;
                }
            }
            if ((var4 & 0x20) != 0) {
                var3.field934 = arg0.method3313();
                if (var3.field934 == 65535) {
                    var3.field934 = -1;
                }
            }
            if ((var4 & 0x4) != 0) {
                int var10 = arg0.method3314();
                if (var10 == 65535) {
                    var10 = -1;
                }
                int var11 = arg0.method3305();
                if (var3.field944 == var10 && var10 != -1) {
                    int var12 = class276.method115(var10).field3569;
                    if (var12 == 1) {
                        var3.field932 = 0;
                        var3.field942 = 0;
                        var3.field943 = var11;
                        var3.field951 = 0;
                    }
                    if (var12 == 2) {
                        var3.field951 = 0;
                    }
                } else if (var10 == -1 || var3.field944 == -1 || class276.method115(var10).field3564 >= class276.method115(var3.field944).field3564) {
                    var3.field944 = var10;
                    var3.field932 = 0;
                    var3.field942 = 0;
                    var3.field943 = var11;
                    var3.field951 = 0;
                    var3.field967 = var3.field962;
                }
            }
            if ((var4 & 0x1) != 0) {
                int var13 = arg0.method3389();
                if (var13 > 0) {
                    for (int var14 = 0; var14 < var13; var14++) {
                        int var15 = -1;
                        int var16 = -1;
                        int var17 = -1;
                        int var18 = arg0.method3288();
                        if (var18 == 32767) {
                            var18 = arg0.method3288();
                            var16 = arg0.method3288();
                            var15 = arg0.method3288();
                            var17 = arg0.method3288();
                        } else if (var18 == 32766) {
                            var18 = -1;
                        } else {
                            var16 = arg0.method3288();
                        }
                        int var19 = arg0.method3288();
                        var3.method1453(var18, var16, var15, var17, field631, var19);
                    }
                }
                int var20 = arg0.method3305();
                if (var20 > 0) {
                    for (int var21 = 0; var21 < var20; var21++) {
                        int var22 = arg0.method3288();
                        int var23 = arg0.method3288();
                        if (var23 == 32767) {
                            var3.method1455(var22);
                        } else {
                            int var24 = arg0.method3288();
                            int var25 = arg0.method3389();
                            int var26 = var23 > 0 ? arg0.method3305() : var25;
                            var3.method1454(var22, field631, var23, var24, var25, var26);
                        }
                    }
                }
            }
            if ((var4 & 0x2) != 0) {
                var3.field955 = arg0.method3490();
                var3.field924 = 100;
            }
            if ((var4 & 0x8) != 0) {
                var3.field1077 = class274.method1807(arg0.method3314());
                var3.field911 = var3.field1077.field3518;
                var3.field959 = var3.field1077.field3541;
                var3.field916 = var3.field1077.field3524;
                var3.field917 = var3.field1077.field3525;
                var3.field945 = var3.field1077.field3526;
                var3.field919 = var3.field1077.field3527;
                var3.field913 = var3.field1077.field3521;
                var3.field914 = var3.field1077.field3522;
                var3.field915 = var3.field1077.field3523;
            }
        }
    }

    @ObfuscatedName("db.hx(Lbp;IIBI)V")
    public static final void method2550(class62 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field927[0];
        int var5 = arg0.field940[0];
        int var6 = arg0.method1036();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var9 = arg0.method1036();
        field888.field2094 = arg1;
        field888.field2093 = arg2;
        field888.field2095 = 1;
        field888.field2096 = 1;
        class61 var10 = field888;
        int var11 = class168.method2953(var4, var5, var9, var10, field677[arg0.field605], true, field724, field890);
        if (var11 >= 1) {
            for (int var12 = 0; var12 < var11 - 1; var12++) {
                arg0.method1039(field724[var12], field890[var12], arg3);
            }
        }
    }

    @ObfuscatedName("dq.hn(I)V")
    public static void method2654() {
        field756 = 0;
        field755 = false;
    }

    @ObfuscatedName("t.hp(I)V")
    public static void method92() {
        method2654();
        field761[0] = class240.field3063;
        field762[0] = "";
        field759[0] = 1006;
        field790[0] = false;
        field756 = 1;
    }

    @ObfuscatedName("g.hw(IIIIB)V")
    public static final void method463(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field882; var4++) {
            if (field827[var4] + field825[var4] > arg0 && field825[var4] < arg0 + arg2 && field828[var4] + field826[var4] > arg1 && field826[var4] < arg1 + arg3) {
                field822[var4] = true;
            }
        }
    }

    @ObfuscatedName("bd.hh(IIIII)V")
    public static final void method1692(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field882; var4++) {
            if (field827[var4] + field825[var4] > arg0 && field825[var4] < arg0 + arg2 && field828[var4] + field826[var4] > arg1 && field826[var4] < arg1 + arg3) {
                field793[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.hb(S)V")
    public final void method1097() {
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < field756 - 1; var2++) {
                if (field759[var2] < 1000 && field759[var2 + 1] > 1000) {
                    String var3 = field762[var2];
                    field762[var2] = field762[var2 + 1];
                    field762[var2 + 1] = var3;
                    String var4 = field761[var2];
                    field761[var2] = field761[var2 + 1];
                    field761[var2 + 1] = var4;
                    int var5 = field759[var2];
                    field759[var2] = field759[var2 + 1];
                    field759[var2 + 1] = var5;
                    int var6 = field757[var2];
                    field757[var2] = field757[var2 + 1];
                    field757[var2 + 1] = var6;
                    int var7 = field789[var2];
                    field789[var2] = field789[var2 + 1];
                    field789[var2 + 1] = var7;
                    int var8 = field760[var2];
                    field760[var2] = field760[var2 + 1];
                    field760[var2 + 1] = var8;
                    boolean var9 = field790[var2];
                    field790[var2] = field790[var2 + 1];
                    field790[var2 + 1] = var9;
                    var1 = false;
                }
            }
        }
        if (Statics.field1042 != null || field858 != null) {
            return;
        }
        int var27;
        int var29;
        int var30;
        label213: {
            int var10 = class49.field464;
            if (field755) {
                if (var10 != 1 && (Statics.field2577 || var10 != 4)) {
                    int var11 = class49.field456;
                    int var12 = class49.field458 * -53945113;
                    if (var11 < Statics.field129 - 10 || var11 > Statics.field1489 + Statics.field129 + 10 || var12 < Statics.field184 - 10 || var12 > Statics.field532 + Statics.field184 + 10) {
                        field755 = false;
                        method463(Statics.field129, Statics.field184, Statics.field1489, Statics.field532);
                    }
                }
                if (var10 == 1 || !Statics.field2577 && var10 == 4) {
                    int var13 = Statics.field129;
                    int var14 = Statics.field184;
                    int var15 = Statics.field1489;
                    int var16 = class49.field465;
                    int var17 = class49.field447;
                    int var18 = -1;
                    for (int var19 = 0; var19 < field756; var19++) {
                        int var20 = (field756 - 1 - var19) * 15 + var14 + 31;
                        if (var16 > var13 && var16 < var13 + var15 && var17 > var20 - 13 && var17 < var20 + 3) {
                            var18 = var19;
                        }
                    }
                    if (var18 != -1 && var18 >= 0) {
                        int var21 = field757[var18];
                        int var22 = field789[var18];
                        int var23 = field759[var18];
                        int var24 = field760[var18];
                        String var25 = field761[var18];
                        String var26 = field762[var18];
                        method897(var21, var22, var23, var24, var25, var26, class49.field465, class49.field447);
                    }
                    field755 = false;
                    method463(Statics.field129, Statics.field184, Statics.field1489, Statics.field532);
                }
            } else {
                var27 = method2086();
                if ((var10 == 1 || !Statics.field2577 && var10 == 4) && var27 >= 0) {
                    int var28 = field759[var27];
                    if (var28 == 39 || var28 == 40 || var28 == 41 || var28 == 42 || var28 == 43 || var28 == 33 || var28 == 34 || var28 == 35 || var28 == 36 || var28 == 37 || var28 == 38 || var28 == 1005) {
                        var29 = field757[var27];
                        var30 = field789[var27];
                        class233 var31 = class233.method2957(var30);
                        if (class234.method3167(method3164(var31))) {
                            break label213;
                        }
                        int var32 = method3164(var31);
                        boolean var33 = (var32 >> 29 & 0x1) != 0;
                        if (var33) {
                            break label213;
                        }
                    }
                }
                if ((var10 == 1 || !Statics.field2577 && var10 == 4) && this.method1098()) {
                    var10 = 2;
                }
                if ((var10 == 1 || !Statics.field2577 && var10 == 4) && field756 > 0 && var27 >= 0) {
                    int var34 = field757[var27];
                    int var35 = field789[var27];
                    int var36 = field759[var27];
                    int var37 = field760[var27];
                    String var38 = field761[var27];
                    String var39 = field762[var27];
                    method897(var34, var35, var36, var37, var38, var39, class49.field465, class49.field447);
                }
                if (var10 == 2 && field756 > 0) {
                    this.method1157(class49.field465, class49.field447);
                }
            }
            return;
        }
        if (Statics.field1042 != null && !field731 && field756 > 0 && !this.method1098()) {
            method2858(field728, field778);
        }
        field731 = false;
        field732 = 0;
        if (Statics.field1042 != null) {
            method3069(Statics.field1042);
        }
        Statics.field1042 = class233.method2957(var30);
        field727 = var29;
        field728 = class49.field465;
        field778 = class49.field447;
        if (var27 >= 0) {
            method1716(var27);
        }
        method3069(Statics.field1042);
    }

    @ObfuscatedName("client.ha(I)Z")
    public final boolean method1098() {
        int var1 = method2086();
        return (field754 == 1 && field756 > 2 || Statics.method3155(var1)) && !field790[var1];
    }

    @ObfuscatedName("client.hs(IIB)V")
    public final void method1157(int arg0, int arg1) {
        method2084(arg0, arg1);
        Statics.field267.method2693(Statics.field348, arg0, arg1, false);
        field755 = true;
    }

    @ObfuscatedName("fs.hz(I)V")
    public static void method3105() {
        method2084(Statics.field1489 / 2 + Statics.field129, Statics.field184);
    }

    @ObfuscatedName("cj.he(IIB)V")
    public static void method2084(int arg0, int arg1) {
        int var2 = Statics.field120.method5154(class240.field2977);
        for (int var3 = 0; var3 < field756; var3++) {
            int var4 = Statics.field120.method5154(method4247(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field756 * 15 + 22;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > Statics.field2428) {
            var6 = Statics.field2428 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > Statics.field117) {
            var7 = Statics.field117 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        Statics.field129 = var6;
        Statics.field184 = var7;
        Statics.field1489 = var2;
        Statics.field532 = field756 * 15 + 22;
    }

    @ObfuscatedName("fl.hf(Lbc;III)V")
    public static final void method3067(class77 arg0, int arg1, int arg2) {
        method897(arg0.field1102, arg0.field1103, arg0.field1104, arg0.field1108, arg0.field1106, arg0.field1106, arg1, arg2);
    }

    @ObfuscatedName("aa.hj(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method897(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 45) {
            class62 var8 = field735[arg3];
            if (var8 != null) {
                field720 = arg6;
                field721 = arg7;
                field845 = 2;
                field808 = 0;
                field658 = arg0;
                field802 = arg1;
                class175 var9 = class175.method107(class172.field2243, field830.field1266);
                var9.field2311.method3310(arg3);
                var9.field2311.method3300(class40.field362[82] ? 1 : 0);
                field830.method1875(var9);
            }
        }
        if (arg2 == 16) {
            field720 = arg6;
            field721 = arg7;
            field845 = 2;
            field808 = 0;
            field658 = arg0;
            field802 = arg1;
            class175 var10 = class175.method107(class172.field2241, field830.field1266);
            var10.field2311.method3310(Statics.field1111);
            var10.field2311.method3309(Statics.field6 + arg0);
            var10.field2311.method3353(class40.field362[82] ? 1 : 0);
            var10.field2311.method3311(arg3);
            var10.field2311.method3311(Statics.field3585);
            var10.field2311.method3309(Statics.field72 + arg1);
            var10.field2311.method3488(Statics.field1260);
            field830.method1875(var10);
        }
        if (arg2 == 8) {
            class74 var11 = field660[arg3];
            if (var11 != null) {
                field720 = arg6;
                field721 = arg7;
                field845 = 2;
                field808 = 0;
                field658 = arg0;
                field802 = arg1;
                class175 var12 = class175.method107(class172.field2272, field830.field1266);
                var12.field2311.method3300(class40.field362[82] ? 1 : 0);
                var12.field2311.method3311(field775);
                var12.field2311.method3386(Statics.field2002);
                var12.field2311.method3259(arg3);
                field830.method1875(var12);
            }
        }
        if (arg2 == 19) {
            field720 = arg6;
            field721 = arg7;
            field845 = 2;
            field808 = 0;
            field658 = arg0;
            field802 = arg1;
            class175 var13 = class175.method107(class172.field2261, field830.field1266);
            var13.field2311.method3310(Statics.field6 + arg0);
            var13.field2311.method3259(arg3);
            var13.field2311.method3259(Statics.field72 + arg1);
            var13.field2311.method3300(class40.field362[82] ? 1 : 0);
            field830.method1875(var13);
        }
        if (arg2 == 10) {
            class74 var14 = field660[arg3];
            if (var14 != null) {
                field720 = arg6;
                field721 = arg7;
                field845 = 2;
                field808 = 0;
                field658 = arg0;
                field802 = arg1;
                class175 var15 = class175.method107(class172.field2190, field830.field1266);
                var15.field2311.method3301(class40.field362[82] ? 1 : 0);
                var15.field2311.method3309(arg3);
                field830.method1875(var15);
            }
        }
        if (arg2 == 2) {
            field720 = arg6;
            field721 = arg7;
            field845 = 2;
            field808 = 0;
            field658 = arg0;
            field802 = arg1;
            class175 var16 = class175.method107(class172.field2273, field830.field1266);
            var16.field2311.method3300(class40.field362[82] ? 1 : 0);
            var16.field2311.method3309(arg3);
            var16.field2311.method3259(Statics.field72 + arg1);
            var16.field2311.method3318(Statics.field2002);
            var16.field2311.method3259(field775);
            var16.field2311.method3259(Statics.field6 + arg0);
            field830.method1875(var16);
        }
        if (arg2 == 58) {
            class233 var17 = class233.method976(arg1, arg0);
            if (var17 != null) {
                class175 var18 = class175.method107(class172.field2252, field830.field1266);
                var18.field2311.method3311(field775);
                var18.field2311.method3318(arg1);
                var18.field2311.method3310(field776);
                var18.field2311.method3386(Statics.field2002);
                var18.field2311.method3310(var17.field2759);
                var18.field2311.method3259(arg0);
                field830.method1875(var18);
            }
        }
        if (arg2 == 14) {
            class62 var19 = field735[arg3];
            if (var19 != null) {
                field720 = arg6;
                field721 = arg7;
                field845 = 2;
                field808 = 0;
                field658 = arg0;
                field802 = arg1;
                class175 var20 = class175.method107(class172.field2237, field830.field1266);
                var20.field2311.method3259(Statics.field3585);
                var20.field2311.method3353(class40.field362[82] ? 1 : 0);
                var20.field2311.method3311(Statics.field1111);
                var20.field2311.method3488(Statics.field1260);
                var20.field2311.method3311(arg3);
                field830.method1875(var20);
            }
        }
        if (arg2 == 24) {
            class233 var21 = class233.method2957(arg1);
            boolean var22 = true;
            if (var21.field2657 > 0) {
                var22 = method2577(var21);
            }
            if (var22) {
                class175 var23 = class175.method107(class172.field2201, field830.field1266);
                var23.field2311.method3261(arg1);
                field830.method1875(var23);
            }
        }
        if (arg2 == 46) {
            class62 var24 = field735[arg3];
            if (var24 != null) {
                field720 = arg6;
                field721 = arg7;
                field845 = 2;
                field808 = 0;
                field658 = arg0;
                field802 = arg1;
                class175 var25 = class175.method107(class172.field2204, field830.field1266);
                var25.field2311.method3258(class40.field362[82] ? 1 : 0);
                var25.field2311.method3311(arg3);
                field830.method1875(var25);
            }
        }
        if (arg2 == 35) {
            class175 var26 = class175.method107(class172.field2212, field830.field1266);
            var26.field2311.method3259(arg0);
            var26.field2311.method3311(arg3);
            var26.field2311.method3386(arg1);
            field830.method1875(var26);
            field623 = 0;
            Statics.field306 = class233.method2957(arg1);
            field726 = arg0;
        }
        if (arg2 == 1004) {
            field720 = arg6;
            field721 = arg7;
            field845 = 2;
            field808 = 0;
            class175 var27 = class175.method107(class172.field2191, field830.field1266);
            var27.field2311.method3311(arg3);
            field830.method1875(var27);
        }
        if (arg2 == 5) {
            field720 = arg6;
            field721 = arg7;
            field845 = 2;
            field808 = 0;
            field658 = arg0;
            field802 = arg1;
            class175 var28 = class175.method107(class172.field2188, field830.field1266);
            var28.field2311.method3310(Statics.field72 + arg1);
            var28.field2311.method3259(arg3);
            var28.field2311.method3258(class40.field362[82] ? 1 : 0);
            var28.field2311.method3310(Statics.field6 + arg0);
            field830.method1875(var28);
        }
        if (arg2 == 9) {
            class74 var29 = field660[arg3];
            if (var29 != null) {
                field720 = arg6;
                field721 = arg7;
                field845 = 2;
                field808 = 0;
                field658 = arg0;
                field802 = arg1;
                class175 var30 = class175.method107(class172.field2265, field830.field1266);
                var30.field2311.method3310(arg3);
                var30.field2311.method3353(class40.field362[82] ? 1 : 0);
                field830.method1875(var30);
            }
        }
        if (arg2 == 3) {
            field720 = arg6;
            field721 = arg7;
            field845 = 2;
            field808 = 0;
            field658 = arg0;
            field802 = arg1;
            class175 var31 = class175.method107(class172.field2250, field830.field1266);
            var31.field2311.method3310(Statics.field72 + arg1);
            var31.field2311.method3310(Statics.field6 + arg0);
            var31.field2311.method3353(class40.field362[82] ? 1 : 0);
            var31.field2311.method3310(arg3);
            field830.method1875(var31);
        }
        if (arg2 == 1002) {
            field720 = arg6;
            field721 = arg7;
            field845 = 2;
            field808 = 0;
            class175 var32 = class175.method107(class172.field2217, field830.field1266);
            var32.field2311.method3259(arg3);
            field830.method1875(var32);
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field1937.method5713(arg2, arg3, new class229(arg0), new class229(arg1));
        }
        if (arg2 == 23) {
            if (field755) {
                Statics.field267.method2761();
            } else {
                Statics.field267.method2693(Statics.field348, arg0, arg1, true);
            }
        }
        if (arg2 == 11) {
            class74 var33 = field660[arg3];
            if (var33 != null) {
                field720 = arg6;
                field721 = arg7;
                field845 = 2;
                field808 = 0;
                field658 = arg0;
                field802 = arg1;
                class175 var34 = class175.method107(class172.field2267, field830.field1266);
                var34.field2311.method3301(class40.field362[82] ? 1 : 0);
                var34.field2311.method3310(arg3);
                field830.method1875(var34);
            }
        }
        if (arg2 == 22) {
            field720 = arg6;
            field721 = arg7;
            field845 = 2;
            field808 = 0;
            field658 = arg0;
            field802 = arg1;
            class175 var35 = class175.method107(class172.field2211, field830.field1266);
            var35.field2311.method3311(Statics.field6 + arg0);
            var35.field2311.method3311(Statics.field72 + arg1);
            var35.field2311.method3310(arg3);
            var35.field2311.method3258(class40.field362[82] ? 1 : 0);
            field830.method1875(var35);
        }
        if (arg2 == 6) {
            field720 = arg6;
            field721 = arg7;
            field845 = 2;
            field808 = 0;
            field658 = arg0;
            field802 = arg1;
            class175 var36 = class175.method107(class172.field2231, field830.field1266);
            var36.field2311.method3259(Statics.field72 + arg1);
            var36.field2311.method3311(arg3);
            var36.field2311.method3258(class40.field362[82] ? 1 : 0);
            var36.field2311.method3309(Statics.field6 + arg0);
            field830.method1875(var36);
        }
        if (arg2 == 20) {
            field720 = arg6;
            field721 = arg7;
            field845 = 2;
            field808 = 0;
            field658 = arg0;
            field802 = arg1;
            class175 var37 = class175.method107(class172.field2230, field830.field1266);
            var37.field2311.method3310(arg3);
            var37.field2311.method3353(class40.field362[82] ? 1 : 0);
            var37.field2311.method3309(Statics.field72 + arg1);
            var37.field2311.method3310(Statics.field6 + arg0);
            field830.method1875(var37);
        }
        if (arg2 == 1) {
            field720 = arg6;
            field721 = arg7;
            field845 = 2;
            field808 = 0;
            field658 = arg0;
            field802 = arg1;
            class175 var38 = class175.method107(class172.field2270, field830.field1266);
            var38.field2311.method3311(Statics.field3585);
            var38.field2311.method3311(Statics.field6 + arg0);
            var38.field2311.method3300(class40.field362[82] ? 1 : 0);
            var38.field2311.method3318(Statics.field1260);
            var38.field2311.method3311(arg3);
            var38.field2311.method3310(Statics.field1111);
            var38.field2311.method3310(Statics.field72 + arg1);
            field830.method1875(var38);
        }
        if (arg2 == 38) {
            method90();
            class233 var39 = class233.method2957(arg1);
            field772 = 1;
            Statics.field1111 = arg0;
            Statics.field1260 = arg1;
            Statics.field3585 = arg3;
            method3069(var39);
            field773 = class76.method2125(16748608) + Statics.method945(arg3).field3462 + class76.method2125(16777215);
            if (field773 == null) {
                field773 = class240.field2830;
            }
            return;
        }
        if (arg2 == 29) {
            class175 var40 = class175.method107(class172.field2201, field830.field1266);
            var40.field2311.method3261(arg1);
            field830.method1875(var40);
            class233 var41 = class233.method2957(arg1);
            if (var41.field2751 != null && var41.field2751[0][0] == 5) {
                int var42 = var41.field2751[0][1];
                if (class228.field2596[var42] != var41.field2753[0]) {
                    class228.field2596[var42] = var41.field2753[0];
                    method143(var42);
                }
            }
        }
        if (arg2 == 28) {
            class175 var43 = class175.method107(class172.field2201, field830.field1266);
            var43.field2311.method3261(arg1);
            field830.method1875(var43);
            class233 var44 = class233.method2957(arg1);
            if (var44.field2751 != null && var44.field2751[0][0] == 5) {
                int var45 = var44.field2751[0][1];
                class228.field2596[var45] = 1 - class228.field2596[var45];
                method143(var45);
            }
        }
        if (arg2 == 42) {
            class175 var46 = class175.method107(class172.field2200, field830.field1266);
            var46.field2311.method3310(arg3);
            var46.field2311.method3318(arg1);
            var46.field2311.method3309(arg0);
            field830.method1875(var46);
            field623 = 0;
            Statics.field306 = class233.method2957(arg1);
            field726 = arg0;
        }
        if (arg2 == 33) {
            class175 var47 = class175.method107(class172.field2238, field830.field1266);
            var47.field2311.method3310(arg0);
            var47.field2311.method3310(arg3);
            var47.field2311.method3318(arg1);
            field830.method1875(var47);
            field623 = 0;
            Statics.field306 = class233.method2957(arg1);
            field726 = arg0;
        }
        if (arg2 == 47) {
            class62 var48 = field735[arg3];
            if (var48 != null) {
                field720 = arg6;
                field721 = arg7;
                field845 = 2;
                field808 = 0;
                field658 = arg0;
                field802 = arg1;
                class175 var49 = class175.method107(class172.field2266, field830.field1266);
                var49.field2311.method3311(arg3);
                var49.field2311.method3301(class40.field362[82] ? 1 : 0);
                field830.method1875(var49);
            }
        }
        if (arg2 == 34) {
            class175 var50 = class175.method107(class172.field2269, field830.field1266);
            var50.field2311.method3259(arg3);
            var50.field2311.method3488(arg1);
            var50.field2311.method3309(arg0);
            field830.method1875(var50);
            field623 = 0;
            Statics.field306 = class233.method2957(arg1);
            field726 = arg0;
        }
        if (arg2 == 21) {
            field720 = arg6;
            field721 = arg7;
            field845 = 2;
            field808 = 0;
            field658 = arg0;
            field802 = arg1;
            class175 var51 = class175.method107(class172.field2214, field830.field1266);
            var51.field2311.method3301(class40.field362[82] ? 1 : 0);
            var51.field2311.method3309(Statics.field72 + arg1);
            var51.field2311.method3310(Statics.field6 + arg0);
            var51.field2311.method3311(arg3);
            field830.method1875(var51);
        }
        if (arg2 == 49) {
            class62 var52 = field735[arg3];
            if (var52 != null) {
                field720 = arg6;
                field721 = arg7;
                field845 = 2;
                field808 = 0;
                field658 = arg0;
                field802 = arg1;
                class175 var53 = class175.method107(class172.field2264, field830.field1266);
                var53.field2311.method3311(arg3);
                var53.field2311.method3300(class40.field362[82] ? 1 : 0);
                field830.method1875(var53);
            }
        }
        if (arg2 == 1005) {
            class233 var54 = class233.method2957(arg1);
            if (var54 == null || var54.field2758[arg0] < 100000) {
                class175 var55 = class175.method107(class172.field2191, field830.field1266);
                var55.field2311.method3311(arg3);
                field830.method1875(var55);
            } else {
                class86.method1515(27, "", var54.field2758[arg0] + " x " + Statics.method945(arg3).field3462);
            }
            field623 = 0;
            Statics.field306 = class233.method2957(arg1);
            field726 = arg0;
        }
        if (arg2 == 51) {
            class62 var56 = field735[arg3];
            if (var56 != null) {
                field720 = arg6;
                field721 = arg7;
                field845 = 2;
                field808 = 0;
                field658 = arg0;
                field802 = arg1;
                class175 var57 = class175.method107(class172.field2185, field830.field1266);
                var57.field2311.method3258(class40.field362[82] ? 1 : 0);
                var57.field2311.method3309(arg3);
                field830.method1875(var57);
            }
        }
        if (arg2 == 43) {
            class175 var58 = class175.method107(class172.field2203, field830.field1266);
            var58.field2311.method3259(arg3);
            var58.field2311.method3488(arg1);
            var58.field2311.method3309(arg0);
            field830.method1875(var58);
            field623 = 0;
            Statics.field306 = class233.method2957(arg1);
            field726 = arg0;
        }
        if (arg2 == 26) {
            class175 var59 = class175.method107(class172.field2257, field830.field1266);
            field830.method1875(var59);
            for (class57 var60 = (class57) field780.method3741(); var60 != null; var60 = (class57) field780.method3734()) {
                if (var60.field536 == 0 || var60.field536 == 3) {
                    method5075(var60, true);
                }
            }
            if (field709 != null) {
                method3069(field709);
                field709 = null;
            }
        }
        if (arg2 == 4) {
            field720 = arg6;
            field721 = arg7;
            field845 = 2;
            field808 = 0;
            field658 = arg0;
            field802 = arg1;
            class175 var61 = class175.method107(class172.field2205, field830.field1266);
            var61.field2311.method3301(class40.field362[82] ? 1 : 0);
            var61.field2311.method3310(Statics.field72 + arg1);
            var61.field2311.method3310(arg3);
            var61.field2311.method3259(Statics.field6 + arg0);
            field830.method1875(var61);
        }
        if (arg2 == 12) {
            class74 var62 = field660[arg3];
            if (var62 != null) {
                field720 = arg6;
                field721 = arg7;
                field845 = 2;
                field808 = 0;
                field658 = arg0;
                field802 = arg1;
                class175 var63 = class175.method107(class172.field2219, field830.field1266);
                var63.field2311.method3311(arg3);
                var63.field2311.method3300(class40.field362[82] ? 1 : 0);
                field830.method1875(var63);
            }
        }
        if (arg2 == 31) {
            class175 var64 = class175.method107(class172.field2258, field830.field1266);
            var64.field2311.method3311(Statics.field3585);
            var64.field2311.method3309(arg0);
            var64.field2311.method3318(Statics.field1260);
            var64.field2311.method3259(arg3);
            var64.field2311.method3386(arg1);
            var64.field2311.method3309(Statics.field1111);
            field830.method1875(var64);
            field623 = 0;
            Statics.field306 = class233.method2957(arg1);
            field726 = arg0;
        }
        if (arg2 == 1001) {
            field720 = arg6;
            field721 = arg7;
            field845 = 2;
            field808 = 0;
            field658 = arg0;
            field802 = arg1;
            class175 var65 = class175.method107(class172.field2199, field830.field1266);
            var65.field2311.method3353(class40.field362[82] ? 1 : 0);
            var65.field2311.method3259(arg3);
            var65.field2311.method3311(Statics.field72 + arg1);
            var65.field2311.method3310(Statics.field6 + arg0);
            field830.method1875(var65);
        }
        if (arg2 == 32) {
            class175 var66 = class175.method107(class172.field2213, field830.field1266);
            var66.field2311.method3309(arg3);
            var66.field2311.method3261(Statics.field2002);
            var66.field2311.method3309(field775);
            var66.field2311.method3310(arg0);
            var66.field2311.method3261(arg1);
            field830.method1875(var66);
            field623 = 0;
            Statics.field306 = class233.method2957(arg1);
            field726 = arg0;
        }
        if (arg2 == 30 && field709 == null) {
            method615(arg1, arg0);
            field709 = class233.method976(arg1, arg0);
            method3069(field709);
        }
        if (arg2 == 50) {
            class62 var67 = field735[arg3];
            if (var67 != null) {
                field720 = arg6;
                field721 = arg7;
                field845 = 2;
                field808 = 0;
                field658 = arg0;
                field802 = arg1;
                class175 var68 = class175.method107(class172.field2256, field830.field1266);
                var68.field2311.method3258(class40.field362[82] ? 1 : 0);
                var68.field2311.method3310(arg3);
                field830.method1875(var68);
            }
        }
        if (arg2 == 18) {
            field720 = arg6;
            field721 = arg7;
            field845 = 2;
            field808 = 0;
            field658 = arg0;
            field802 = arg1;
            class175 var69 = class175.method107(class172.field2220, field830.field1266);
            var69.field2311.method3310(Statics.field6 + arg0);
            var69.field2311.method3310(arg3);
            var69.field2311.method3301(class40.field362[82] ? 1 : 0);
            var69.field2311.method3309(Statics.field72 + arg1);
            field830.method1875(var69);
        }
        if (arg2 == 7) {
            class74 var70 = field660[arg3];
            if (var70 != null) {
                field720 = arg6;
                field721 = arg7;
                field845 = 2;
                field808 = 0;
                field658 = arg0;
                field802 = arg1;
                class175 var71 = class175.method107(class172.field2240, field830.field1266);
                var71.field2311.method3261(Statics.field1260);
                var71.field2311.method3310(arg3);
                var71.field2311.method3311(Statics.field3585);
                var71.field2311.method3258(class40.field362[82] ? 1 : 0);
                var71.field2311.method3310(Statics.field1111);
                field830.method1875(var71);
            }
        }
        if (arg2 == 40) {
            class175 var72 = class175.method107(class172.field2195, field830.field1266);
            var72.field2311.method3488(arg1);
            var72.field2311.method3309(arg0);
            var72.field2311.method3309(arg3);
            field830.method1875(var72);
            field623 = 0;
            Statics.field306 = class233.method2957(arg1);
            field726 = arg0;
        }
        if (arg2 == 15) {
            class62 var73 = field735[arg3];
            if (var73 != null) {
                field720 = arg6;
                field721 = arg7;
                field845 = 2;
                field808 = 0;
                field658 = arg0;
                field802 = arg1;
                class175 var74 = class175.method107(class172.field2196, field830.field1266);
                var74.field2311.method3353(class40.field362[82] ? 1 : 0);
                var74.field2311.method3309(field775);
                var74.field2311.method3309(arg3);
                var74.field2311.method3386(Statics.field2002);
                field830.method1875(var74);
            }
        }
        if (arg2 == 17) {
            field720 = arg6;
            field721 = arg7;
            field845 = 2;
            field808 = 0;
            field658 = arg0;
            field802 = arg1;
            class175 var75 = class175.method107(class172.field2209, field830.field1266);
            var75.field2311.method3311(arg3);
            var75.field2311.method3259(Statics.field72 + arg1);
            var75.field2311.method3310(Statics.field6 + arg0);
            var75.field2311.method3310(field775);
            var75.field2311.method3261(Statics.field2002);
            var75.field2311.method3258(class40.field362[82] ? 1 : 0);
            field830.method1875(var75);
        }
        if (arg2 == 36) {
            class175 var76 = class175.method107(class172.field2282, field830.field1266);
            var76.field2311.method3261(arg1);
            var76.field2311.method3259(arg3);
            var76.field2311.method3311(arg0);
            field830.method1875(var76);
            field623 = 0;
            Statics.field306 = class233.method2957(arg1);
            field726 = arg0;
        }
        if (arg2 == 13) {
            class74 var77 = field660[arg3];
            if (var77 != null) {
                field720 = arg6;
                field721 = arg7;
                field845 = 2;
                field808 = 0;
                field658 = arg0;
                field802 = arg1;
                class175 var78 = class175.method107(class172.field2281, field830.field1266);
                var78.field2311.method3259(arg3);
                var78.field2311.method3300(class40.field362[82] ? 1 : 0);
                field830.method1875(var78);
            }
        }
        if (arg2 == 48) {
            class62 var79 = field735[arg3];
            if (var79 != null) {
                field720 = arg6;
                field721 = arg7;
                field845 = 2;
                field808 = 0;
                field658 = arg0;
                field802 = arg1;
                class175 var80 = class175.method107(class172.field2255, field830.field1266);
                var80.field2311.method3311(arg3);
                var80.field2311.method3300(class40.field362[82] ? 1 : 0);
                field830.method1875(var80);
            }
        }
        if (arg2 == 41) {
            class175 var81 = class175.method107(class172.field2218, field830.field1266);
            var81.field2311.method3310(arg3);
            var81.field2311.method3259(arg0);
            var81.field2311.method3386(arg1);
            field830.method1875(var81);
            field623 = 0;
            Statics.field306 = class233.method2957(arg1);
            field726 = arg0;
        }
        if (arg2 == 44) {
            class62 var82 = field735[arg3];
            if (var82 != null) {
                field720 = arg6;
                field721 = arg7;
                field845 = 2;
                field808 = 0;
                field658 = arg0;
                field802 = arg1;
                class175 var83 = class175.method107(class172.field2228, field830.field1266);
                var83.field2311.method3311(arg3);
                var83.field2311.method3300(class40.field362[82] ? 1 : 0);
                field830.method1875(var83);
            }
        }
        if (arg2 == 37) {
            class175 var84 = class175.method107(class172.field2224, field830.field1266);
            var84.field2311.method3261(arg1);
            var84.field2311.method3309(arg0);
            var84.field2311.method3309(arg3);
            field830.method1875(var84);
            field623 = 0;
            Statics.field306 = class233.method2957(arg1);
            field726 = arg0;
        }
        if (arg2 == 25) {
            class233 var85 = class233.method976(arg1, arg0);
            if (var85 != null) {
                method90();
                int var86 = method3164(var85);
                int var87 = var86 >> 11 & 0x3F;
                int var89 = var85.field2759;
                class233 var90 = class233.method976(arg1, arg0);
                if (var90 != null && var90.field2730 != null) {
                    class58 var91 = new class58();
                    var91.field544 = var90;
                    var91.field551 = var90.field2730;
                    class71.method952(var91);
                }
                field776 = var89;
                field774 = true;
                Statics.field2002 = arg1;
                field775 = arg0;
                Statics.field2433 = var87;
                method3069(var90);
                field772 = 0;
                int var92 = method3164(var85);
                int var93 = var92 >> 11 & 0x3F;
                String var94;
                if (var93 == 0) {
                    var94 = null;
                } else if (var85.field2718 == null || var85.field2718.trim().length() == 0) {
                    var94 = null;
                } else {
                    var94 = var85.field2718;
                }
                field777 = var94;
                if (field777 == null) {
                    field777 = "Null";
                }
                if (var85.field2637) {
                    field785 = var85.field2712 + class76.method2125(16777215);
                } else {
                    field785 = class76.method2125(65280) + var85.field2645 + class76.method2125(16777215);
                }
            }
            return;
        }
        if (arg2 == 1003) {
            field720 = arg6;
            field721 = arg7;
            field845 = 2;
            field808 = 0;
            class74 var95 = field660[arg3];
            if (var95 != null) {
                class274 var96 = var95.field1077;
                if (var96.field3542 != null) {
                    var96 = var96.method4814();
                }
                if (var96 != null) {
                    class175 var97 = class175.method107(class172.field2278, field830.field1266);
                    var97.field2311.method3309(var96.field3532);
                    field830.method1875(var97);
                }
            }
        }
        if (arg2 == 39) {
            class175 var98 = class175.method107(class172.field2263, field830.field1266);
            var98.field2311.method3309(arg3);
            var98.field2311.method3309(arg0);
            var98.field2311.method3261(arg1);
            field830.method1875(var98);
            field623 = 0;
            Statics.field306 = class233.method2957(arg1);
            field726 = arg0;
        }
        if (arg2 == 57 || arg2 == 1007) {
            class233 var99 = class233.method976(arg1, arg0);
            if (var99 != null) {
                method3106(arg3, arg1, arg0, var99.field2759, arg5);
            }
        }
        if (field772 != 0) {
            field772 = 0;
            method3069(class233.method2957(Statics.field1260));
        }
        if (field774) {
            method90();
        }
        if (Statics.field306 != null && field623 == 0) {
            method3069(Statics.field306);
        }
    }

    @ObfuscatedName("t.hd(I)V")
    public static void method90() {
        if (!field774) {
            return;
        }
        class233 var0 = class233.method976(Statics.field2002, field775);
        if (var0 != null && var0.field2731 != null) {
            class58 var1 = new class58();
            var1.field544 = var0;
            var1.field551 = var0.field2731;
            class71.method952(var1);
        }
        field774 = false;
        method3069(var0);
    }

    @ObfuscatedName("aj.hk(III)V")
    public static void method615(int arg0, int arg1) {
        class175 var2 = class175.method107(class172.field2276, field830.field1266);
        var2.field2311.method3261(arg0);
        var2.field2311.method3259(arg1);
        field830.method1875(var2);
    }

    @ObfuscatedName("fs.ho(IIIILjava/lang/String;I)V")
    public static void method3106(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class233 var5 = class233.method976(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2739 != null) {
            class58 var6 = new class58();
            var6.field544 = var5;
            var6.field546 = arg0;
            var6.field550 = arg4;
            var6.field551 = var5.field2739;
            class71.method952(var6);
        }
        boolean var7 = true;
        if (var5.field2657 > 0) {
            var7 = method2577(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = method3164(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            class175 var11 = class175.method107(class172.field2221, field830.field1266);
            var11.field2311.method3261(arg1);
            var11.field2311.method3259(arg2);
            var11.field2311.method3259(arg3);
            field830.method1875(var11);
        }
        if (arg0 == 2) {
            class175 var12 = class175.method107(class172.field2194, field830.field1266);
            var12.field2311.method3261(arg1);
            var12.field2311.method3259(arg2);
            var12.field2311.method3259(arg3);
            field830.method1875(var12);
        }
        if (arg0 == 3) {
            class175 var13 = class175.method107(class172.field2184, field830.field1266);
            var13.field2311.method3261(arg1);
            var13.field2311.method3259(arg2);
            var13.field2311.method3259(arg3);
            field830.method1875(var13);
        }
        if (arg0 == 4) {
            class175 var14 = class175.method107(class172.field2227, field830.field1266);
            var14.field2311.method3261(arg1);
            var14.field2311.method3259(arg2);
            var14.field2311.method3259(arg3);
            field830.method1875(var14);
        }
        if (arg0 == 5) {
            class175 var15 = class175.method107(class172.field2208, field830.field1266);
            var15.field2311.method3261(arg1);
            var15.field2311.method3259(arg2);
            var15.field2311.method3259(arg3);
            field830.method1875(var15);
        }
        if (arg0 == 6) {
            class175 var16 = class175.method107(class172.field2207, field830.field1266);
            var16.field2311.method3261(arg1);
            var16.field2311.method3259(arg2);
            var16.field2311.method3259(arg3);
            field830.method1875(var16);
        }
        if (arg0 == 7) {
            class175 var17 = class175.method107(class172.field2183, field830.field1266);
            var17.field2311.method3261(arg1);
            var17.field2311.method3259(arg2);
            var17.field2311.method3259(arg3);
            field830.method1875(var17);
        }
        if (arg0 == 8) {
            class175 var18 = class175.method107(class172.field2275, field830.field1266);
            var18.field2311.method3261(arg1);
            var18.field2311.method3259(arg2);
            var18.field2311.method3259(arg3);
            field830.method1875(var18);
        }
        if (arg0 == 9) {
            class175 var19 = class175.method107(class172.field2234, field830.field1266);
            var19.field2311.method3261(arg1);
            var19.field2311.method3259(arg2);
            var19.field2311.method3259(arg3);
            field830.method1875(var19);
        }
        if (arg0 != 10) {
            return;
        }
        class175 var20 = class175.method107(class172.field2222, field830.field1266);
        var20.field2311.method3261(arg1);
        var20.field2311.method3259(arg2);
        var20.field2311.method3259(arg3);
        field830.method1875(var20);
    }

    @ObfuscatedName("e.hv(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method180(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method484(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("an.hm(Ljava/lang/String;Ljava/lang/String;IIIIZI)V")
    public static final void method484(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field755 || field756 >= 500) {
            return;
        }
        field761[field756] = arg0;
        field762[field756] = arg1;
        field759[field756] = arg2;
        field760[field756] = arg3;
        field757[field756] = arg4;
        field789[field756] = arg5;
        field790[field756] = arg6;
        field756++;
    }

    @ObfuscatedName("cj.hq(I)I")
    public static final int method2086() {
        return field756 - 1;
    }

    @ObfuscatedName("bh.hy(I)V")
    public static void method1003() {
        for (int var0 = 0; var0 < field756; var0++) {
            int var1 = field759[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field756 - 1) {
                    for (int var3 = var0; var3 < field756 - 1; var3++) {
                        field761[var3] = field761[var3 + 1];
                        field762[var3] = field762[var3 + 1];
                        field759[var3] = field759[var3 + 1];
                        field760[var3] = field760[var3 + 1];
                        field757[var3] = field757[var3 + 1];
                        field789[var3] = field789[var3 + 1];
                        field790[var3] = field790[var3 + 1];
                    }
                }
                var0--;
                field756--;
            }
        }
        method3105();
    }

    @ObfuscatedName("ip.hg(IB)Ljava/lang/String;")
    public static String method4247(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (field762[arg0].length() > 0) {
            return field761[arg0] + class240.field2984 + field762[arg0];
        } else {
            return field761[arg0];
        }
    }

    @ObfuscatedName("aq.ht(Lju;IIIS)V")
    public static final void method619(class274 arg0, int arg1, int arg2, int arg3) {
        if (field756 >= 400) {
            return;
        }
        if (arg0.field3542 != null) {
            arg0 = arg0.method4814();
        }
        if (arg0 == null || !arg0.field3512 || arg0.field3547 && field787 != arg1) {
            return;
        }
        String var4 = arg0.field3517;
        if (arg0.field3528 != 0) {
            var4 = var4 + Statics.method2548(arg0.field3528, Statics.field341.field589) + " " + class76.field1094 + class240.field2980 + arg0.field3528 + class76.field1095;
        }
        if (arg0.field3547 && field764) {
            method180(class240.field3061, class76.method2125(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field772 == 1) {
            method180(class240.field3088, field773 + " " + class76.field1096 + " " + class76.method2125(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field774) {
            int var5 = arg0.field3547 && field764 ? 2000 : 0;
            String[] var6 = arg0.field3534;
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].equalsIgnoreCase(class240.field3111)) {
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
                        method180(var6[var7], class76.method2125(16776960) + var4, var8, arg1, arg2, arg3);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].equalsIgnoreCase(class240.field3111)) {
                        short var10 = 0;
                        if (field806 != class79.field1120) {
                            if (field806 == class79.field1118 || field806 == class79.field1124 && arg0.field3528 > Statics.field341.field589) {
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
                            method180(var6[var9], class76.method2125(16776960) + var4, var11, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3547 || !field764) {
                method180(class240.field3061, class76.method2125(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field2433 & 0x2) == 2) {
            method180(field777, field785 + " " + class76.field1096 + " " + class76.method2125(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("gz.ij(Lbp;IIII)V")
    public static final void method3576(class62 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field341 == arg0 || field756 >= 400) {
            return;
        }
        String var4;
        if (arg0.field594 == 0) {
            var4 = arg0.field604[0] + arg0.field593 + arg0.field604[1] + Statics.method2548(arg0.field589, Statics.field341.field589) + " " + class76.field1094 + class240.field2980 + arg0.field589 + class76.field1095 + arg0.field604[2];
        } else {
            var4 = arg0.field604[0] + arg0.field593 + arg0.field604[1] + " " + class76.field1094 + class240.field2850 + arg0.field594 + class76.field1095 + arg0.field604[2];
        }
        if (field772 == 1) {
            method180(class240.field3088, field773 + " " + class76.field1096 + " " + class76.method2125(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field774) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field743[var5] != null) {
                    short var6 = 0;
                    if (field743[var5].equalsIgnoreCase(class240.field3111)) {
                        if (field647 == class79.field1120) {
                            continue;
                        }
                        if (field647 == class79.field1118 || field647 == class79.field1124 && arg0.field589 > Statics.field341.field589) {
                            var6 = 2000;
                        }
                        if (Statics.field341.field602 != 0 && arg0.field602 != 0) {
                            if (Statics.field341.field602 == arg0.field602) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field680[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field682[var5] + var6;
                    method180(field743[var5], class76.method2125(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field2433 & 0x8) == 8) {
            method180(field777, field785 + " " + class76.field1096 + " " + class76.method2125(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field756; var9++) {
            if (field759[var9] == 23) {
                field762[var9] = class76.method2125(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("iy.ip(IIIIIIIII)V")
    public static final void method4397(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class233.method2911(arg0)) {
            Statics.field49 = null;
            Statics.method2378(Statics.field2674[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field49 != null) {
                Statics.method2378(Statics.field49, -1412584499, arg1, arg2, arg3, arg4, Statics.field471, Statics.field359, arg7);
                Statics.field49 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field822[var8] = true;
            }
        } else {
            field822[arg7] = true;
        }
    }

    @ObfuscatedName("bh.ib(IB)Ljava/lang/String;")
    public static final String method1004(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class76.field1098 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class76.method2125(65408) + var1.substring(0, var1.length() - 8) + class240.field2985 + " " + class76.field1094 + var1 + class76.field1095 + class76.field1092;
        } else if (var1.length() > 6) {
            return " " + class76.method2125(16777215) + var1.substring(0, var1.length() - 4) + class240.field2987 + " " + class76.field1094 + var1 + class76.field1095 + class76.field1092;
        } else {
            return " " + class76.method2125(16776960) + var1 + class76.field1092;
        }
    }

    @ObfuscatedName("client.in(ZB)V")
    public final void method1401(boolean arg0) {
        int var2 = field672;
        int var3 = Statics.field2428;
        int var4 = Statics.field117;
        if (class233.method2911(var2)) {
            method2132(Statics.field2674[var2], -1, var3, var4, arg0);
        }
    }

    @ObfuscatedName("client.io(Lhg;I)V")
    public void method1101(class233 arg0) {
        class233 var2 = arg0.field2675 == -1 ? null : class233.method2957(arg0.field2675);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field2428;
            var4 = Statics.field117;
        } else {
            var3 = var2.field2653;
            var4 = var2.field2654;
        }
        method3254(arg0, var3, var4, false);
        method656(arg0, var3, var4);
    }

    @ObfuscatedName("bv.iz([Lhg;Lhg;ZI)V")
    public static void method1514(class233[] arg0, class233 arg1, boolean arg2) {
        int var3 = arg1.field2661 == 0 ? arg1.field2653 : arg1.field2661;
        int var4 = arg1.field2662 == 0 ? arg1.field2654 : arg1.field2662;
        method2132(arg0, arg1.field2638, var3, var4, arg2);
        if (arg1.field2763 != null) {
            method2132(arg1.field2763, arg1.field2638, var3, var4, arg2);
        }
        class57 var5 = (class57) field780.method3735((long) arg1.field2638);
        if (var5 != null) {
            int var6 = var5.field535;
            if (class233.method2911(var6)) {
                method2132(Statics.field2674[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2657 == 1337) {
        }
    }

    @ObfuscatedName("dt.ig([Lhg;IIIZI)V")
    public static void method2132(class233[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class233 var6 = arg0[var5];
            if (var6 != null && var6.field2675 == arg1) {
                method3254(var6, arg2, arg3, arg4);
                method656(var6, arg2, arg3);
                if (var6.field2659 > var6.field2661 - var6.field2653) {
                    var6.field2659 = var6.field2661 - var6.field2653;
                }
                if (var6.field2659 < 0) {
                    var6.field2659 = 0;
                }
                if (var6.field2692 > var6.field2662 - var6.field2654) {
                    var6.field2692 = var6.field2662 - var6.field2654;
                }
                if (var6.field2692 < 0) {
                    var6.field2692 = 0;
                }
                if (var6.field2680 == 0) {
                    method1514(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("gv.ih(Lhg;IIZB)V")
    public static void method3254(class233 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2653;
        int var5 = arg0.field2654;
        if (arg0.field2693 == 0) {
            arg0.field2653 = arg0.field2649;
        } else if (arg0.field2693 == 1) {
            arg0.field2653 = arg1 - arg0.field2649;
        } else if (arg0.field2693 == 2) {
            arg0.field2653 = arg0.field2649 * arg1 >> 14;
        }
        if (arg0.field2646 == 0) {
            arg0.field2654 = arg0.field2650;
        } else if (arg0.field2646 == 1) {
            arg0.field2654 = arg2 - arg0.field2650;
        } else if (arg0.field2646 == 2) {
            arg0.field2654 = arg0.field2650 * arg2 >> 14;
        }
        if (arg0.field2693 == 4) {
            arg0.field2653 = arg0.field2715 * arg0.field2654 / arg0.field2656;
        }
        if (arg0.field2646 == 4) {
            arg0.field2654 = arg0.field2656 * arg0.field2653 / arg0.field2715;
        }
        if (arg0.field2657 == 1337) {
            field863 = arg0;
        }
        if (arg3 && arg0.field2687 != null && (arg0.field2653 != var4 || arg0.field2654 != var5)) {
            class58 var6 = new class58();
            var6.field544 = arg0;
            var6.field551 = arg0.field2687;
            field816.method3793(var6);
        }
    }

    @ObfuscatedName("au.id(Lhg;III)V")
    public static void method656(class233 arg0, int arg1, int arg2) {
        if (arg0.field2636 == 0) {
            arg0.field2651 = arg0.field2647;
        } else if (arg0.field2636 == 1) {
            arg0.field2651 = (arg1 - arg0.field2653) / 2 + arg0.field2647;
        } else if (arg0.field2636 == 2) {
            arg0.field2651 = arg1 - arg0.field2653 - arg0.field2647;
        } else if (arg0.field2636 == 3) {
            arg0.field2651 = arg0.field2647 * arg1 >> 14;
        } else if (arg0.field2636 == 4) {
            arg0.field2651 = (arg0.field2647 * arg1 >> 14) + (arg1 - arg0.field2653) / 2;
        } else {
            arg0.field2651 = arg1 - arg0.field2653 - (arg0.field2647 * arg1 >> 14);
        }
        if (arg0.field2628 == 0) {
            arg0.field2652 = arg0.field2705;
        } else if (arg0.field2628 == 1) {
            arg0.field2652 = (arg2 - arg0.field2654) / 2 + arg0.field2705;
        } else if (arg0.field2628 == 2) {
            arg0.field2652 = arg2 - arg0.field2654 - arg0.field2705;
        } else if (arg0.field2628 == 3) {
            arg0.field2652 = arg0.field2705 * arg2 >> 14;
        } else if (arg0.field2628 == 4) {
            arg0.field2652 = (arg0.field2705 * arg2 >> 14) + (arg2 - arg0.field2654) / 2;
        } else {
            arg0.field2652 = arg2 - arg0.field2654 - (arg0.field2705 * arg2 >> 14);
        }
    }

    @ObfuscatedName("bg.ik(IB)Ljava/lang/String;")
    public static final String method971(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("iz.iq(Lhg;I)Z")
    public static final boolean method4257(class233 arg0) {
        if (arg0.field2752 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2752.length; var1++) {
            int var2 = method1855(arg0, var1);
            int var3 = arg0.field2753[var1];
            if (arg0.field2752[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2752[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2752[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("cb.ic(Lhg;IS)I")
    public static final int method1855(class233 arg0, int arg1) {
        if (arg0.field2751 == null || arg1 >= arg0.field2751.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2751[arg1];
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
                    var7 = field751[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field752[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field768[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class233 var11 = class233.method2957(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!Statics.method945(var12).field3490 || field818)) {
                        for (int var13 = 0; var13 < var11.field2736.length; var13++) {
                            if (var12 + 1 == var11.field2736[var13]) {
                                var7 += var11.field2758[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class228.field2596[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class237.field2812[field752[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class228.field2596[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field341.field589;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class237.field2810[var14]) {
                            var7 += field752[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class233 var17 = class233.method2957(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!Statics.method945(var18).field3490 || field818)) {
                        for (int var19 = 0; var19 < var17.field2736.length; var19++) {
                            if (var18 + 1 == var17.field2736[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field784;
                }
                if (var6 == 12) {
                    var7 = field810;
                }
                if (var6 == 13) {
                    int var20 = class228.field2596[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class228.method3899(var22);
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
                    var7 = (Statics.field341.field933 >> 7) + Statics.field6;
                }
                if (var6 == 19) {
                    var7 = (Statics.field341.field964 >> 7) + Statics.field72;
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

    @ObfuscatedName("az.is(Lhg;Ljt;IIZI)V")
    public static final void method931(class233 arg0, class272 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field3478;
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
            var7 = class240.field2833;
        }
        if (var6 != -1 && var7 != null) {
            method484(var7, class76.method2125(16748608) + arg1.field3462, var6, arg1.field3460, arg2, arg0.field2638, arg4);
        }
    }

    @ObfuscatedName("ac.ia(Lhg;IIB)V")
    public static final void method468(class233 arg0, int arg1, int arg2) {
        if (arg0.field2683 == 1) {
            method180(arg0.field2749, "", 24, 0, 0, arg0.field2638);
        }
        if (arg0.field2683 == 2 && !field774) {
            int var3 = method3164(arg0);
            int var4 = var3 >> 11 & 0x3F;
            String var5;
            if (var4 == 0) {
                var5 = null;
            } else if (arg0.field2718 == null || arg0.field2718.trim().length() == 0) {
                var5 = null;
            } else {
                var5 = arg0.field2718;
            }
            if (var5 != null) {
                method180(var5, class76.method2125(65280) + arg0.field2645, 25, 0, -1, arg0.field2638);
            }
        }
        if (arg0.field2683 == 3) {
            method180(class240.field2838, "", 26, 0, 0, arg0.field2638);
        }
        if (arg0.field2683 == 4) {
            method180(arg0.field2749, "", 28, 0, 0, arg0.field2638);
        }
        if (arg0.field2683 == 5) {
            method180(arg0.field2749, "", 29, 0, 0, arg0.field2638);
        }
        if (arg0.field2683 == 6 && field709 == null) {
            method180(arg0.field2749, "", 30, 0, -1, arg0.field2638);
        }
        if (arg0.field2680 == 2) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg0.field2654; var8++) {
                for (int var9 = 0; var9 < arg0.field2653; var9++) {
                    int var10 = (arg0.field2648 + 32) * var9;
                    int var11 = (arg0.field2706 + 32) * var8;
                    if (var7 < 20) {
                        var10 += arg0.field2707[var7];
                        var11 += arg0.field2708[var7];
                    }
                    if (arg1 >= var10 && arg2 >= var11 && arg1 < var10 + 32 && arg2 < var11 + 32) {
                        field730 = var7;
                        Statics.field969 = arg0;
                        if (arg0.field2736[var7] > 0) {
                            class272 var12 = Statics.method945(arg0.field2736[var7] - 1);
                            if (field772 == 1 && class234.method944(method3164(arg0))) {
                                if (Statics.field1260 != arg0.field2638 || Statics.field1111 != var7) {
                                    method180(class240.field3088, field773 + " " + class76.field1096 + " " + class76.method2125(16748608) + var12.field3462, 31, var12.field3460, var7, arg0.field2638);
                                }
                            } else if (!field774 || !class234.method944(method3164(arg0))) {
                                String[] var13 = var12.field3478;
                                int var14 = -1;
                                if (field820 && method129()) {
                                    var14 = var12.method4756();
                                }
                                int var15 = method3164(arg0);
                                boolean var16 = (var15 >> 30 & 0x1) != 0;
                                if (var16) {
                                    for (int var17 = 4; var17 >= 3; var17--) {
                                        if (var14 != var17) {
                                            method931(arg0, var12, var7, var17, false);
                                        }
                                    }
                                }
                                class234 var10000 = (class234) null;
                                if (class234.method26(method3164(arg0))) {
                                    method180(class240.field3088, class76.method2125(16748608) + var12.field3462, 38, var12.field3460, var7, arg0.field2638);
                                }
                                int var18 = method3164(arg0);
                                boolean var19 = (var18 >> 30 & 0x1) != 0;
                                if (var19) {
                                    for (int var20 = 2; var20 >= 0; var20--) {
                                        if (var14 != var20) {
                                            method931(arg0, var12, var7, var20, false);
                                        }
                                    }
                                    if (var14 >= 0) {
                                        method931(arg0, var12, var7, var14, true);
                                    }
                                }
                                String[] var21 = arg0.field2755;
                                if (var21 != null) {
                                    for (int var22 = 4; var22 >= 0; var22--) {
                                        if (var21[var22] != null) {
                                            byte var23 = 0;
                                            if (var22 == 0) {
                                                var23 = 39;
                                            }
                                            if (var22 == 1) {
                                                var23 = 40;
                                            }
                                            if (var22 == 2) {
                                                var23 = 41;
                                            }
                                            if (var22 == 3) {
                                                var23 = 42;
                                            }
                                            if (var22 == 4) {
                                                var23 = 43;
                                            }
                                            method180(var21[var22], class76.method2125(16748608) + var12.field3462, var23, var12.field3460, var7, arg0.field2638);
                                        }
                                    }
                                }
                                method180(class240.field3061, class76.method2125(16748608) + var12.field3462, 1005, var12.field3460, var7, arg0.field2638);
                            } else if ((Statics.field2433 & 0x10) == 16) {
                                method180(field777, field785 + " " + class76.field1096 + " " + class76.method2125(16748608) + var12.field3462, 32, var12.field3460, var7, arg0.field2638);
                            }
                        }
                    }
                    var7++;
                }
            }
        }
        if (!arg0.field2637) {
            return;
        }
        if (!field774) {
            for (int var24 = 9; var24 >= 5; var24--) {
                String var25 = method932(arg0, var24);
                if (var25 != null) {
                    method180(var25, arg0.field2712, 1007, var24 + 1, arg0.field2639, arg0.field2638);
                }
            }
            int var26 = method3164(arg0);
            int var27 = var26 >> 11 & 0x3F;
            String var28;
            if (var27 == 0) {
                var28 = null;
            } else if (arg0.field2718 == null || arg0.field2718.trim().length() == 0) {
                var28 = null;
            } else {
                var28 = arg0.field2718;
            }
            if (var28 != null) {
                method180(var28, arg0.field2712, 25, 0, arg0.field2639, arg0.field2638);
            }
            for (int var30 = 4; var30 >= 0; var30--) {
                int var31 = method3164(arg0);
                boolean var32 = (var31 >> var30 + 1 & 0x1) != 0;
                String var33;
                if (!var32 && arg0.field2739 == null) {
                    var33 = null;
                } else if (arg0.field2729 == null || arg0.field2729.length <= var30 || arg0.field2729[var30] == null || arg0.field2729[var30].trim().length() == 0) {
                    var33 = null;
                } else {
                    var33 = arg0.field2729[var30];
                }
                if (var33 != null) {
                    method180(var33, arg0.field2712, 57, var30 + 1, arg0.field2639, arg0.field2638);
                }
            }
            if (class234.method1682(method3164(arg0))) {
                method180(class240.field2923, "", 30, 0, arg0.field2639, arg0.field2638);
            }
        } else if (class234.method1763(method3164(arg0)) && (Statics.field2433 & 0x20) == 32) {
            method180(field777, field785 + " " + class76.field1096 + " " + arg0.field2712, 58, 0, arg0.field2639, arg0.field2638);
        }
    }

    @ObfuscatedName("ar.iy(ZI)V")
    public static void method536(boolean arg0) {
        field766 = arg0;
    }

    @ObfuscatedName("go.ie(B)Z")
    public static boolean method3516() {
        return field766;
    }

    @ObfuscatedName("d.iv(I)Z")
    public static boolean method129() {
        return field766 || class40.field362[81];
    }

    @ObfuscatedName("gu.iw(IIIIIIII)V")
    public static final void method3593(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class233.method2911(arg0)) {
            method1859(Statics.field2674[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("cb.ii([Lhg;IIIIIIII)V")
    public static final void method1859(class233[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class233 var9 = arg0[var8];
            if (var9 != null && (!var9.field2637 || var9.field2680 == 0 || var9.field2719 || method3164(var9) != 0 || field791 == var9 || var9.field2657 == 1338) && var9.field2675 == arg1) {
                if (var9.field2637) {
                    boolean var10 = var9.field2658;
                    if (var10) {
                        continue;
                    }
                }
                int var11 = var9.field2651 + arg6;
                int var12 = var9.field2652 + arg7;
                int var13;
                int var14;
                int var15;
                int var16;
                if (var9.field2680 == 2) {
                    var13 = arg2;
                    var14 = arg3;
                    var15 = arg4;
                    var16 = arg5;
                } else if (var9.field2680 == 9) {
                    int var17 = var11;
                    int var18 = var12;
                    int var19 = var9.field2653 + var11;
                    int var20 = var9.field2654 + var12;
                    if (var19 < var11) {
                        var17 = var19;
                        var19 = var11;
                    }
                    if (var20 < var12) {
                        var18 = var20;
                        var20 = var12;
                    }
                    var19++;
                    var20++;
                    var13 = var17 > arg2 ? var17 : arg2;
                    var14 = var18 > arg3 ? var18 : arg3;
                    var15 = var19 < arg4 ? var19 : arg4;
                    var16 = var20 < arg5 ? var20 : arg5;
                } else {
                    int var23 = var9.field2653 + var11;
                    int var24 = var9.field2654 + var12;
                    var13 = var11 > arg2 ? var11 : arg2;
                    var14 = var12 > arg3 ? var12 : arg3;
                    var15 = var23 < arg4 ? var23 : arg4;
                    var16 = var24 < arg5 ? var24 : arg5;
                }
                if (field858 == var9) {
                    field715 = true;
                    field799 = var11;
                    field800 = var12;
                }
                if (!var9.field2637 || var13 < var15 && var14 < var16) {
                    int var25 = class49.field456;
                    int var26 = class49.field458 * -53945113;
                    if (class49.field464 != 0) {
                        var25 = class49.field465;
                        var26 = class49.field447;
                    }
                    boolean var27 = var25 >= var13 && var26 >= var14 && var25 < var15 && var26 < var16;
                    if (var9.field2657 == 1337) {
                        if (!field630 && !field755 && var27) {
                            if (field772 == 0 && !field774) {
                                method180(class240.field2960, "", 23, 0, var25 - var13, var26 - var14);
                            }
                            long var28 = -1L;
                            long var30 = -1L;
                            for (int var32 = 0; var32 < class123.method2321(); var32++) {
                                long var33 = class123.field1710[var32];
                                if (var30 != var33) {
                                    var30 = var33;
                                    int var37 = class123.method910(var32);
                                    long var38 = class123.field1710[var32];
                                    int var40 = (int) (var38 >>> 7 & 0x7FL);
                                    int var42 = var40;
                                    int var43 = class123.method1846(class123.field1710[var32]);
                                    int var45 = class123.method533(var32);
                                    if (var43 == 2 && Statics.field267.method2686(Statics.field348, var37, var40, var33) >= 0) {
                                        class271 var46 = class271.method4255(var45);
                                        if (var46.field3412 != null) {
                                            var46 = var46.method4707();
                                        }
                                        if (var46 == null) {
                                            continue;
                                        }
                                        if (field772 == 1) {
                                            method180(class240.field3088, field773 + " " + class76.field1096 + " " + class76.method2125(65535) + var46.field3439, 1, var45, var37, var40);
                                        } else if (!field774) {
                                            String[] var47 = var46.field3429;
                                            if (var47 != null) {
                                                for (int var48 = 4; var48 >= 0; var48--) {
                                                    if (var47[var48] != null) {
                                                        short var49 = 0;
                                                        if (var48 == 0) {
                                                            var49 = 3;
                                                        }
                                                        if (var48 == 1) {
                                                            var49 = 4;
                                                        }
                                                        if (var48 == 2) {
                                                            var49 = 5;
                                                        }
                                                        if (var48 == 3) {
                                                            var49 = 6;
                                                        }
                                                        if (var48 == 4) {
                                                            var49 = 1001;
                                                        }
                                                        method180(var47[var48], class76.method2125(65535) + var46.field3439, var49, var45, var37, var42);
                                                    }
                                                }
                                            }
                                            method180(class240.field3061, class76.method2125(65535) + var46.field3439, 1002, var46.field3409, var37, var42);
                                        } else if ((Statics.field2433 & 0x4) == 4) {
                                            method180(field777, field785 + " " + class76.field1096 + " " + class76.method2125(65535) + var46.field3439, 2, var45, var37, var40);
                                        }
                                    }
                                    if (var43 == 1) {
                                        class74 var50 = field660[var45];
                                        if (var50 == null) {
                                            continue;
                                        }
                                        if (var50.field1077.field3518 == 1 && (var50.field933 & 0x7F) == 64 && (var50.field964 & 0x7F) == 64) {
                                            for (int var51 = 0; var51 < field661; var51++) {
                                                class74 var52 = field660[field667[var51]];
                                                if (var52 != null && var50 != var52 && var52.field1077.field3518 == 1 && var50.field933 == var52.field933 && var50.field964 == var52.field964) {
                                                    method619(var52.field1077, field667[var51], var37, var42);
                                                }
                                            }
                                            int var53 = class84.field1199;
                                            int[] var54 = class84.field1205;
                                            for (int var55 = 0; var55 < var53; var55++) {
                                                class62 var56 = field735[var54[var55]];
                                                if (var56 != null && var50.field933 == var56.field933 && var50.field964 == var56.field964) {
                                                    method3576(var56, var54[var55], var37, var42);
                                                }
                                            }
                                        }
                                        method619(var50.field1077, var45, var37, var42);
                                    }
                                    if (var43 == 0) {
                                        class62 var57 = field735[var45];
                                        if (var57 == null) {
                                            continue;
                                        }
                                        if ((var57.field933 & 0x7F) == 64 && (var57.field964 & 0x7F) == 64) {
                                            for (int var58 = 0; var58 < field661; var58++) {
                                                class74 var59 = field660[field667[var58]];
                                                if (var59 != null && var59.field1077.field3518 == 1 && var57.field933 == var59.field933 && var57.field964 == var59.field964) {
                                                    method619(var59.field1077, field667[var58], var37, var42);
                                                }
                                            }
                                            int var60 = class84.field1199;
                                            int[] var61 = class84.field1205;
                                            for (int var62 = 0; var62 < var60; var62++) {
                                                class62 var63 = field735[var61[var62]];
                                                if (var63 != null && var57 != var63 && var57.field933 == var63.field933 && var57.field964 == var63.field964) {
                                                    method3576(var63, var61[var62], var37, var42);
                                                }
                                            }
                                        }
                                        if (field746 == var45) {
                                            var28 = var33;
                                        } else {
                                            method3576(var57, var45, var37, var42);
                                        }
                                    }
                                    if (var43 == 3) {
                                        class208 var64 = field747[Statics.field348][var37][var42];
                                        if (var64 != null) {
                                            for (class82 var65 = (class82) var64.method3799(); var65 != null; var65 = (class82) var64.method3801()) {
                                                class272 var66 = Statics.method945(var65.field1193);
                                                if (field772 == 1) {
                                                    method180(class240.field3088, field773 + " " + class76.field1096 + " " + class76.method2125(16748608) + var66.field3462, 16, var65.field1193, var37, var42);
                                                } else if (!field774) {
                                                    String[] var67 = var66.field3476;
                                                    for (int var68 = 4; var68 >= 0; var68--) {
                                                        if (var67 != null && var67[var68] != null) {
                                                            byte var69 = 0;
                                                            if (var68 == 0) {
                                                                var69 = 18;
                                                            }
                                                            if (var68 == 1) {
                                                                var69 = 19;
                                                            }
                                                            if (var68 == 2) {
                                                                var69 = 20;
                                                            }
                                                            if (var68 == 3) {
                                                                var69 = 21;
                                                            }
                                                            if (var68 == 4) {
                                                                var69 = 22;
                                                            }
                                                            method180(var67[var68], class76.method2125(16748608) + var66.field3462, var69, var65.field1193, var37, var42);
                                                        } else if (var68 == 2) {
                                                            method180(class240.field2823, class76.method2125(16748608) + var66.field3462, 20, var65.field1193, var37, var42);
                                                        }
                                                    }
                                                    method180(class240.field3061, class76.method2125(16748608) + var66.field3462, 1004, var65.field1193, var37, var42);
                                                } else if ((Statics.field2433 & 0x1) == 1) {
                                                    method180(field777, field785 + " " + class76.field1096 + " " + class76.method2125(16748608) + var66.field3462, 17, var65.field1193, var37, var42);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var28 != -1L) {
                                int var70 = (int) (var28 >>> 0 & 0x7FL);
                                int var72 = (int) (var28 >>> 7 & 0x7FL);
                                class62 var74 = field735[field746];
                                method3576(var74, field746, var70, var72);
                            }
                        }
                    } else if (var9.field2657 != 1338) {
                        if (var9.field2657 == 1400) {
                            Statics.field1937.method5660(class49.field456, class49.field458 * -53945113, var27, var11, var12, var9.field2653, var9.field2654);
                        }
                        if (!field755 && var27) {
                            if (var9.field2657 == 1400) {
                                Statics.field1937.method5711(var11, var12, var9.field2653, var9.field2654, var25, var26);
                            } else {
                                method468(var9, var25 - var11, var26 - var12);
                            }
                        }
                        if (var9.field2680 == 0) {
                            if (!var9.field2637) {
                                boolean var88 = var9.field2658;
                                if (var88 && Statics.field1579 != var9) {
                                    continue;
                                }
                            }
                            method1859(arg0, var9.field2638, var13, var14, var15, var16, var11 - var9.field2659, var12 - var9.field2692);
                            if (var9.field2763 != null) {
                                method1859(var9.field2763, var9.field2638, var13, var14, var15, var16, var11 - var9.field2659, var12 - var9.field2692);
                            }
                            class57 var89 = (class57) field780.method3735((long) var9.field2638);
                            if (var89 != null) {
                                if (var89.field536 == 0 && class49.field456 >= var13 && class49.field458 * -53945113 >= var14 && class49.field456 < var15 && class49.field458 * -53945113 < var16 && !field755) {
                                    for (class58 var90 = (class58) field816.method3792(); var90 != null; var90 = (class58) field816.method3800()) {
                                        if (var90.field542) {
                                            var90.method3787();
                                            var90.field544.field2764 = false;
                                        }
                                    }
                                    if (Statics.field616 == 0) {
                                        field858 = null;
                                        field791 = null;
                                    }
                                    if (!field755) {
                                        method92();
                                    }
                                }
                                method3593(var89.field535, var13, var14, var15, var16, var11, var12);
                            }
                        }
                        if (var9.field2637) {
                            if (var9.field2772) {
                                if (class49.field456 >= var13 && class49.field458 * -53945113 >= var14 && class49.field456 < var15 && class49.field458 * -53945113 < var16) {
                                    for (class58 var91 = (class58) field816.method3792(); var91 != null; var91 = (class58) field816.method3800()) {
                                        if (var91.field542) {
                                            var91.method3787();
                                            var91.field544.field2764 = false;
                                        }
                                    }
                                    if (Statics.field616 == 0) {
                                        field858 = null;
                                        field791 = null;
                                    }
                                    if (!field755) {
                                        method92();
                                    }
                                }
                            } else if (var9.field2773 && class49.field456 >= var13 && class49.field458 * -53945113 >= var14 && class49.field456 < var15 && class49.field458 * -53945113 < var16) {
                                for (class58 var92 = (class58) field816.method3792(); var92 != null; var92 = (class58) field816.method3800()) {
                                    if (var92.field542 && var92.field544.field2740 == var92.field551) {
                                        var92.method3787();
                                    }
                                }
                            }
                            boolean var93;
                            if (class49.field456 >= var13 && class49.field458 * -53945113 >= var14 && class49.field456 < var15 && class49.field458 * -53945113 < var16) {
                                var93 = true;
                            } else {
                                var93 = false;
                            }
                            boolean var94 = false;
                            if ((class49.field466 == 1 || !Statics.field2577 && class49.field466 == 4) && var93) {
                                var94 = true;
                            }
                            boolean var95 = false;
                            if ((class49.field464 == 1 || !Statics.field2577 && class49.field464 == 4) && class49.field465 >= var13 && class49.field447 >= var14 && class49.field465 < var15 && class49.field447 < var16) {
                                var95 = true;
                            }
                            if (var95) {
                                method977(var9, class49.field465 - var11, class49.field447 - var12);
                            }
                            if (var9.field2657 == 1400) {
                                Statics.field1937.method5661(var25, var26, var93 & var94, var93 & var95);
                            }
                            if (field858 != null && field858 != var9 && var93 && class234.method3062(method3164(var9))) {
                                field823 = var9;
                            }
                            if (field791 == var9) {
                                field795 = true;
                                field796 = var11;
                                field875 = var12;
                            }
                            if (var9.field2719) {
                                if (var93 && field815 != 0 && var9.field2740 != null) {
                                    class58 var96 = new class58();
                                    var96.field542 = true;
                                    var96.field544 = var9;
                                    var96.field545 = field815;
                                    var96.field551 = var9.field2740;
                                    field816.method3793(var96);
                                }
                                if (field858 != null || Statics.field1042 != null || field755) {
                                    var95 = false;
                                    var94 = false;
                                    var93 = false;
                                }
                                if (!var9.field2765 && var95) {
                                    var9.field2765 = true;
                                    if (var9.field2721 != null) {
                                        class58 var97 = new class58();
                                        var97.field542 = true;
                                        var97.field544 = var9;
                                        var97.field554 = class49.field465 - var11;
                                        var97.field545 = class49.field447 - var12;
                                        var97.field551 = var9.field2721;
                                        field816.method3793(var97);
                                    }
                                }
                                if (var9.field2765 && var94 && var9.field2722 != null) {
                                    class58 var98 = new class58();
                                    var98.field542 = true;
                                    var98.field544 = var9;
                                    var98.field554 = class49.field456 - var11;
                                    var98.field545 = class49.field458 * -53945113 - var12;
                                    var98.field551 = var9.field2722;
                                    field816.method3793(var98);
                                }
                                if (var9.field2765 && !var94) {
                                    var9.field2765 = false;
                                    if (var9.field2663 != null) {
                                        class58 var99 = new class58();
                                        var99.field542 = true;
                                        var99.field544 = var9;
                                        var99.field554 = class49.field456 - var11;
                                        var99.field545 = class49.field458 * -53945113 - var12;
                                        var99.field551 = var9.field2663;
                                        field886.method3793(var99);
                                    }
                                }
                                if (var94 && var9.field2724 != null) {
                                    class58 var100 = new class58();
                                    var100.field542 = true;
                                    var100.field544 = var9;
                                    var100.field554 = class49.field456 - var11;
                                    var100.field545 = class49.field458 * -53945113 - var12;
                                    var100.field551 = var9.field2724;
                                    field816.method3793(var100);
                                }
                                if (!var9.field2764 && var93) {
                                    var9.field2764 = true;
                                    if (var9.field2760 != null) {
                                        class58 var101 = new class58();
                                        var101.field542 = true;
                                        var101.field544 = var9;
                                        var101.field554 = class49.field456 - var11;
                                        var101.field545 = class49.field458 * -53945113 - var12;
                                        var101.field551 = var9.field2760;
                                        field816.method3793(var101);
                                    }
                                }
                                if (var9.field2764 && var93 && var9.field2726 != null) {
                                    class58 var102 = new class58();
                                    var102.field542 = true;
                                    var102.field544 = var9;
                                    var102.field554 = class49.field456 - var11;
                                    var102.field545 = class49.field458 * -53945113 - var12;
                                    var102.field551 = var9.field2726;
                                    field816.method3793(var102);
                                }
                                if (var9.field2764 && !var93) {
                                    var9.field2764 = false;
                                    if (var9.field2727 != null) {
                                        class58 var103 = new class58();
                                        var103.field542 = true;
                                        var103.field544 = var9;
                                        var103.field554 = class49.field456 - var11;
                                        var103.field545 = class49.field458 * -53945113 - var12;
                                        var103.field551 = var9.field2727;
                                        field886.method3793(var103);
                                    }
                                }
                                if (var9.field2738 != null) {
                                    class58 var104 = new class58();
                                    var104.field544 = var9;
                                    var104.field551 = var9.field2738;
                                    field717.method3793(var104);
                                }
                                if (var9.field2732 != null && field740 > var9.field2767) {
                                    if (var9.field2733 == null || field740 - var9.field2767 > 32) {
                                        class58 var109 = new class58();
                                        var109.field544 = var9;
                                        var109.field551 = var9.field2732;
                                        field816.method3793(var109);
                                    } else {
                                        label840: for (int var105 = var9.field2767; var105 < field740; var105++) {
                                            int var106 = field748[var105 & 0x1F];
                                            for (int var107 = 0; var107 < var9.field2733.length; var107++) {
                                                if (var9.field2733[var107] == var106) {
                                                    class58 var108 = new class58();
                                                    var108.field544 = var9;
                                                    var108.field551 = var9.field2732;
                                                    field816.method3793(var108);
                                                    break label840;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2767 = field740;
                                }
                                if (var9.field2690 != null && field880 > var9.field2768) {
                                    if (var9.field2735 == null || field880 - var9.field2768 > 32) {
                                        class58 var114 = new class58();
                                        var114.field544 = var9;
                                        var114.field551 = var9.field2690;
                                        field816.method3793(var114);
                                    } else {
                                        label816: for (int var110 = var9.field2768; var110 < field880; var110++) {
                                            int var111 = field847[var110 & 0x1F];
                                            for (int var112 = 0; var112 < var9.field2735.length; var112++) {
                                                if (var9.field2735[var112] == var111) {
                                                    class58 var113 = new class58();
                                                    var113.field544 = var9;
                                                    var113.field551 = var9.field2690;
                                                    field816.method3793(var113);
                                                    break label816;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2768 = field880;
                                }
                                if (var9.field2748 != null && field634 > var9.field2769) {
                                    if (var9.field2737 == null || field634 - var9.field2769 > 32) {
                                        class58 var119 = new class58();
                                        var119.field544 = var9;
                                        var119.field551 = var9.field2748;
                                        field816.method3793(var119);
                                    } else {
                                        label792: for (int var115 = var9.field2769; var115 < field634; var115++) {
                                            int var116 = field807[var115 & 0x1F];
                                            for (int var117 = 0; var117 < var9.field2737.length; var117++) {
                                                if (var9.field2737[var117] == var116) {
                                                    class58 var118 = new class58();
                                                    var118.field544 = var9;
                                                    var118.field551 = var9.field2748;
                                                    field816.method3793(var118);
                                                    break label792;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2769 = field634;
                                }
                                if (field662 > var9.field2766 && var9.field2741 != null) {
                                    class58 var120 = new class58();
                                    var120.field544 = var9;
                                    var120.field551 = var9.field2741;
                                    field816.method3793(var120);
                                }
                                if (field758 > var9.field2766 && var9.field2743 != null) {
                                    class58 var121 = new class58();
                                    var121.field544 = var9;
                                    var121.field551 = var9.field2743;
                                    field816.method3793(var121);
                                }
                                if (field811 > var9.field2766 && var9.field2699 != null) {
                                    class58 var122 = new class58();
                                    var122.field544 = var9;
                                    var122.field551 = var9.field2699;
                                    field816.method3793(var122);
                                }
                                if (field650 > var9.field2766 && var9.field2671 != null) {
                                    class58 var123 = new class58();
                                    var123.field544 = var9;
                                    var123.field551 = var9.field2671;
                                    field816.method3793(var123);
                                }
                                if (field813 > var9.field2766 && var9.field2750 != null) {
                                    class58 var124 = new class58();
                                    var124.field544 = var9;
                                    var124.field551 = var9.field2750;
                                    field816.method3793(var124);
                                }
                                if (field862 > var9.field2766 && var9.field2745 != null) {
                                    class58 var125 = new class58();
                                    var125.field544 = var9;
                                    var125.field551 = var9.field2745;
                                    field816.method3793(var125);
                                }
                                var9.field2766 = field765;
                                if (var9.field2685 != null) {
                                    for (int var126 = 0; var126 < field838; var126++) {
                                        class58 var127 = new class58();
                                        var127.field544 = var9;
                                        var127.field548 = field840[var126];
                                        var127.field549 = field839[var126];
                                        var127.field551 = var9.field2685;
                                        field816.method3793(var127);
                                    }
                                }
                            }
                        }
                        if (!var9.field2637 && field858 == null && Statics.field1042 == null && !field755) {
                            if ((var9.field2754 >= 0 || var9.field2632 != 0) && class49.field456 >= var13 && class49.field458 * -53945113 >= var14 && class49.field456 < var15 && class49.field458 * -53945113 < var16) {
                                if (var9.field2754 >= 0) {
                                    Statics.field1579 = arg0[var9.field2754];
                                } else {
                                    Statics.field1579 = var9;
                                }
                            }
                            if (var9.field2680 == 8 && class49.field456 >= var13 && class49.field458 * -53945113 >= var14 && class49.field456 < var15 && class49.field458 * -53945113 < var16) {
                                Statics.field330 = var9;
                            }
                            if (var9.field2662 > var9.field2654) {
                                int var128 = var9.field2653 + var11;
                                int var129 = var9.field2654;
                                int var130 = var9.field2662;
                                int var131 = class49.field456;
                                int var132 = class49.field458 * -53945113;
                                if (field632) {
                                    field671 = 32;
                                } else {
                                    field671 = 0;
                                }
                                field632 = false;
                                if (class49.field466 == 1 || !Statics.field2577 && class49.field466 == 4) {
                                    if (var131 >= var128 && var131 < var128 + 16 && var132 >= var12 && var132 < var12 + 16) {
                                        var9.field2692 -= 4;
                                        method3069(var9);
                                    } else if (var131 >= var128 && var131 < var128 + 16 && var132 >= var12 + var129 - 16 && var132 < var12 + var129) {
                                        var9.field2692 += 4;
                                        method3069(var9);
                                    } else if (var131 >= var128 - field671 && var131 < field671 + var128 + 16 && var132 >= var12 + 16 && var132 < var12 + var129 - 16) {
                                        int var133 = (var129 - 32) * var129 / var130;
                                        if (var133 < 8) {
                                            var133 = 8;
                                        }
                                        int var134 = var132 - var12 - 16 - var133 / 2;
                                        int var135 = var129 - 32 - var133;
                                        var9.field2692 = (var130 - var129) * var134 / var135;
                                        method3069(var9);
                                        field632 = true;
                                    }
                                }
                                if (field815 != 0) {
                                    int var136 = var9.field2653;
                                    if (var131 >= var128 - var136 && var132 >= var12 && var131 < var128 + 16 && var132 <= var12 + var129) {
                                        var9.field2692 += field815 * 45;
                                        method3069(var9);
                                    }
                                }
                            }
                        }
                    } else if ((field738 == 0 || field738 == 3) && (class49.field464 == 1 || !Statics.field2577 && class49.field464 == 4)) {
                        class227 var75 = var9.method4219(true);
                        if (var75 != null) {
                            int var76 = class49.field465 - var11;
                            int var77 = class49.field447 - var12;
                            if (var75.method4098(var76, var77)) {
                                int var78 = var76 - var75.field2590 / 2;
                                int var79 = var77 - var75.field2588 / 2;
                                int var80 = field689 & 0x7FF;
                                int var81 = class125.field1731[var80];
                                int var82 = class125.field1745[var80];
                                int var83 = var78 * var82 + var79 * var81 >> 11;
                                int var84 = var79 * var82 - var78 * var81 >> 11;
                                int var85 = Statics.field341.field933 + var83 >> 7;
                                int var86 = Statics.field341.field964 - var84 >> 7;
                                class175 var87 = class175.method107(class172.field2247, field830.field1266);
                                var87.field2311.method3258(18);
                                var87.field2311.method3311(Statics.field6 + var85);
                                var87.field2311.method3310(Statics.field72 + var86);
                                var87.field2311.method3258(class40.field362[82] ? (class40.field362[81] ? 2 : 1) : 0);
                                var87.field2311.method3258(var78);
                                var87.field2311.method3258(var79);
                                var87.field2311.method3259(field689);
                                var87.field2311.method3258(57);
                                var87.field2311.method3258(0);
                                var87.field2311.method3258(0);
                                var87.field2311.method3258(89);
                                var87.field2311.method3259(Statics.field341.field933);
                                var87.field2311.method3259(Statics.field341.field964);
                                var87.field2311.method3258(63);
                                field830.method1875(var87);
                                field658 = var85;
                                field802 = var86;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("az.im(III)V")
    public static final void method934(int arg0, int arg1) {
        if (class233.method2911(arg0)) {
            method3514(Statics.field2674[arg0], arg1);
        }
    }

    @ObfuscatedName("go.iu([Lhg;II)V")
    public static final void method3514(class233[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class233 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2680 == 0) {
                    if (var3.field2763 != null) {
                        method3514(var3.field2763, arg1);
                    }
                    class57 var4 = (class57) field780.method3735((long) var3.field2638);
                    if (var4 != null) {
                        method934(var4.field535, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2676 != null) {
                    class58 var5 = new class58();
                    var5.field544 = var3;
                    var5.field551 = var3.field2676;
                    class71.method952(var5);
                }
                if (arg1 == 1 && var3.field2747 != null) {
                    if (var3.field2639 >= 0) {
                        class233 var6 = class233.method2957(var3.field2638);
                        if (var6 == null || var6.field2763 == null || var3.field2639 >= var6.field2763.length || var6.field2763[var3.field2639] != var3) {
                            continue;
                        }
                    }
                    class58 var7 = new class58();
                    var7.field544 = var3;
                    var7.field551 = var3.field2747;
                    class71.method952(var7);
                }
            }
        }
    }

    @ObfuscatedName("ba.it(Lhg;III)V")
    public static final void method977(class233 arg0, int arg1, int arg2) {
        if (field858 != null || field755 || arg0 == null || method86(arg0) == null) {
            return;
        }
        field858 = arg0;
        field791 = method86(arg0);
        field792 = arg1;
        field745 = arg2;
        Statics.field616 = 0;
        field801 = false;
        int var3 = method2086();
        if (var3 != -1) {
            method1716(var3);
        }
    }

    @ObfuscatedName("client.if(I)V")
    public final void method1102() {
        method3069(field858);
        Statics.field616++;
        if (field715 && field795) {
            int var1 = class49.field456;
            int var2 = class49.field458 * -53945113;
            int var3 = var1 - field792;
            int var4 = var2 - field745;
            if (var3 < field796) {
                var3 = field796;
            }
            if (field858.field2653 + var3 > field796 + field791.field2653) {
                var3 = field796 + field791.field2653 - field858.field2653;
            }
            if (var4 < field875) {
                var4 = field875;
            }
            if (field858.field2654 + var4 > field875 + field791.field2654) {
                var4 = field875 + field791.field2654 - field858.field2654;
            }
            int var5 = var3 - field799;
            int var6 = var4 - field800;
            int var7 = field858.field2678;
            if (Statics.field616 > field858.field2716 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field801 = true;
            }
            int var8 = field791.field2659 + (var3 - field796);
            int var9 = field791.field2692 + (var4 - field875);
            if (field858.field2728 != null && field801) {
                class58 var10 = new class58();
                var10.field544 = field858;
                var10.field554 = var8;
                var10.field545 = var9;
                var10.field551 = field858.field2728;
                class71.method952(var10);
            }
            if (class49.field466 == 0) {
                if (field801) {
                    if (field858.field2698 != null) {
                        class58 var11 = new class58();
                        var11.field544 = field858;
                        var11.field554 = var8;
                        var11.field545 = var9;
                        var11.field553 = field823;
                        var11.field551 = field858.field2698;
                        class71.method952(var11);
                    }
                    if (field823 != null && method968(field858) != null) {
                        class175 var12 = class175.method107(class172.field2236, field830.field1266);
                        var12.field2311.method3261(field858.field2638);
                        var12.field2311.method3311(field858.field2759);
                        var12.field2311.method3488(field823.field2638);
                        var12.field2311.method3309(field823.field2639);
                        var12.field2311.method3309(field823.field2759);
                        var12.field2311.method3259(field858.field2639);
                        field830.method1875(var12);
                    }
                } else if (this.method1098()) {
                    this.method1157(field799 + field792, field800 + field745);
                } else if (field756 > 0) {
                    method2858(field799 + field792, field800 + field745);
                }
                field858 = null;
            }
        } else if (Statics.field616 > 1) {
            field858 = null;
        }
    }

    @ObfuscatedName("bu.je(II)V")
    public static void method1716(int arg0) {
        Statics.field310 = new class77();
        Statics.field310.field1102 = field757[arg0];
        Statics.field310.field1103 = field789[arg0];
        Statics.field310.field1104 = field759[arg0];
        Statics.field310.field1108 = field760[arg0];
        Statics.field310.field1106 = field761[arg0];
    }

    @ObfuscatedName("ei.jc(IIB)V")
    public static void method2858(int arg0, int arg1) {
        method3067(Statics.field310, arg0, arg1);
        Statics.field310 = null;
    }

    @ObfuscatedName("fx.jj(Lhg;I)V")
    public static void method3069(class233 arg0) {
        if (field821 == arg0.field2771) {
            field822[arg0.field2770] = true;
        }
    }

    @ObfuscatedName("t.jg(Lhg;I)Lhg;")
    public static class233 method86(class233 arg0) {
        class233 var1 = method968(arg0);
        if (var1 == null) {
            var1 = arg0.field2714;
        }
        return var1;
    }

    @ObfuscatedName("s.jq(II)V")
    public static final void method16(int arg0) {
        if (!class233.method2911(arg0)) {
            return;
        }
        class233[] var1 = Statics.field2674[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class233 var3 = var1[var2];
            if (var3 != null) {
                var3.field2761 = 0;
                var3.field2762 = 0;
            }
        }
    }

    @ObfuscatedName("bm.jv(IS)V")
    public static final void method1672(int arg0) {
        if (class233.method2911(arg0)) {
            method4166(Statics.field2674[arg0], -1);
        }
    }

    @ObfuscatedName("hm.jp([Lhg;II)V")
    public static final void method4166(class233[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class233 var3 = arg0[var2];
            if (var3 != null && var3.field2675 == arg1) {
                if (var3.field2637) {
                    boolean var4 = var3.field2658;
                    if (var4) {
                        continue;
                    }
                }
                if (var3.field2680 == 0) {
                    if (!var3.field2637) {
                        boolean var5 = var3.field2658;
                        if (var5 && Statics.field1579 != var3) {
                            continue;
                        }
                    }
                    method4166(arg0, var3.field2638);
                    if (var3.field2763 != null) {
                        method4166(var3.field2763, var3.field2638);
                    }
                    class57 var6 = (class57) field780.method3735((long) var3.field2638);
                    if (var6 != null) {
                        method1672(var6.field535);
                    }
                }
                if (var3.field2680 == 6) {
                    if (var3.field2644 != -1 || var3.field2686 != -1) {
                        boolean var7 = method4257(var3);
                        int var8;
                        if (var7) {
                            var8 = var3.field2686;
                        } else {
                            var8 = var3.field2644;
                        }
                        if (var8 != -1) {
                            class276 var9 = class276.method115(var8);
                            var3.field2762 += field681;
                            while (var3.field2762 > var9.field3568[var3.field2761]) {
                                var3.field2762 -= var9.field3568[var3.field2761];
                                var3.field2761++;
                                if (var3.field2761 >= var9.field3566.length) {
                                    var3.field2761 -= var9.field3570;
                                    if (var3.field2761 < 0 || var3.field2761 >= var9.field3566.length) {
                                        var3.field2761 = 0;
                                    }
                                }
                                method3069(var3);
                            }
                        }
                    }
                    if (var3.field2694 != 0 && !var3.field2637) {
                        int var10 = var3.field2694 >> 16;
                        int var11 = var3.field2694 << 16 >> 16;
                        int var12 = field681 * var10;
                        int var13 = field681 * var11;
                        var3.field2689 = var3.field2689 + var12 & 0x7FF;
                        var3.field2742 = var3.field2742 + var13 & 0x7FF;
                        method3069(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("a.jd(II)V")
    public static final void method143(int arg0) {
        Statics.method2088();
        class70.method4266();
        int var1 = class257.method1871(arg0).field3261;
        if (var1 == 0) {
            return;
        }
        int var2 = class228.field2596[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class125.method2585(0.9D);
                ((class114) Statics.field1741).method2356(0.9D);
            }
            if (var2 == 2) {
                class125.method2585(0.8D);
                ((class114) Statics.field1741).method2356(0.8D);
            }
            if (var2 == 3) {
                class125.method2585(0.7D);
                ((class114) Statics.field1741).method2356(0.7D);
            }
            if (var2 == 4) {
                class125.method2585(0.6D);
                ((class114) Statics.field1741).method2356(0.6D);
            }
            class272.field3504.method3697();
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
            if (field850 != var3) {
                if (field850 == 0 && field851 != -1) {
                    class220.method210(Statics.field1161, field851, 0, var3, false);
                    field832 = false;
                } else if (var3 == 0) {
                    class220.method3158();
                    field832 = false;
                } else if (class220.field2499 == 0) {
                    Statics.field2502.method3926(var3);
                } else {
                    Statics.field3776 = var3;
                }
                field850 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field853 = 127;
            }
            if (var2 == 1) {
                field853 = 96;
            }
            if (var2 == 2) {
                field853 = 64;
            }
            if (var2 == 3) {
                field853 = 32;
            }
            if (var2 == 4) {
                field853 = 0;
            }
        }
        if (var1 == 5) {
            field754 = var2;
        }
        if (var1 == 6) {
            field781 = var2;
        }
        if (var1 == 9) {
            field697 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                field854 = 127;
            }
            if (var2 == 1) {
                field854 = 96;
            }
            if (var2 == 2) {
                field854 = 64;
            }
            if (var2 == 3) {
                field854 = 32;
            }
            if (var2 == 4) {
                field854 = 0;
            }
        }
        if (var1 == 17) {
            field787 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            field647 = (class79) class180.method34(class79.method142(), var2);
            if (field647 == null) {
                field647 = class79.field1124;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field746 = -1;
            } else {
                field746 = var2 & 0x7FF;
            }
        }
        if (var1 == 22) {
            field806 = (class79) class180.method34(class79.method142(), var2);
            if (field806 == null) {
                field806 = class79.field1124;
            }
        }
    }

    @ObfuscatedName("aj.jh(Lhg;I)V")
    public static final void method611(class233 arg0) {
        int var1 = arg0.field2657;
        if (var1 == 324) {
            if (field881 == -1) {
                field881 = arg0.field2673;
                field729 = arg0.field2756;
            }
            if (field722.field2609) {
                arg0.field2673 = field881;
            } else {
                arg0.field2673 = field729;
            }
        } else if (var1 == 325) {
            if (field881 == -1) {
                field881 = arg0.field2673;
                field729 = arg0.field2756;
            }
            if (field722.field2609) {
                arg0.field2673 = field729;
            } else {
                arg0.field2673 = field881;
            }
        } else if (var1 == 327) {
            arg0.field2689 = 150;
            arg0.field2742 = (int) (Math.sin((double) field631 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2681 = 5;
            arg0.field2682 = 0;
        } else if (var1 == 328) {
            arg0.field2689 = 150;
            arg0.field2742 = (int) (Math.sin((double) field631 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2681 = 5;
            arg0.field2682 = 1;
        }
    }

    @ObfuscatedName("kg.js(Lba;ZI)V")
    public static final void method5075(class57 arg0, boolean arg1) {
        int var2 = arg0.field535;
        int var3 = (int) arg0.field2464;
        arg0.method3787();
        if (arg1 && var2 != -1 && Statics.field2629[var2]) {
            Statics.field2723.method4285(var2);
            if (Statics.field2674[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2674[var2].length; var5++) {
                    if (Statics.field2674[var2][var5] != null) {
                        if (Statics.field2674[var2][var5].field2680 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2674[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2674[var2] = null;
                }
                Statics.field2629[var2] = false;
            }
        }
        for (class214 var6 = (class214) field819.method3741(); var6 != null; var6 = (class214) field819.method3734()) {
            if ((long) var2 == (var6.field2464 >> 48 & 0xFFFFL)) {
                var6.method3787();
            }
        }
        class233 var7 = class233.method2957(var3);
        if (var7 != null) {
            method3069(var7);
        }
        method1003();
        if (field672 != -1) {
            method934(field672, 1);
        }
    }

    @ObfuscatedName("db.jt(Lhg;I)Z")
    public static final boolean method2577(class233 arg0) {
        int var1 = arg0.field2657;
        if (var1 == 205) {
            field666 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field722.method4148(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field722.method4133(var4, var5 == 1);
        }
        if (var1 == 324) {
            field722.method4147(false);
        }
        if (var1 == 325) {
            field722.method4147(true);
        }
        if (var1 == 326) {
            class175 var6 = class175.method107(class172.field2254, field830.field1266);
            field722.method4135(var6.field2311);
            field830.method1875(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("hj.jw(Lhg;IIII)V")
    public static final void method4082(class233 arg0, int arg1, int arg2, int arg3) {
        method1708();
        class227 var4 = arg0.method4219(false);
        if (var4 == null) {
            return;
        }
        class318.method5394(arg1, arg2, var4.field2590 + arg1, var4.field2588 + arg2);
        if (field738 == 2 || field738 == 5) {
            class318.method5391(arg1, arg2, 0, var4.field2589, var4.field2587);
        } else {
            int var5 = field689 & 0x7FF;
            int var6 = Statics.field341.field933 / 32 + 48;
            int var7 = 464 - Statics.field341.field964 / 32;
            Statics.field1356.method5490(arg1, arg2, var4.field2590, var4.field2588, var6, var7, var5, 256, var4.field2589, var4.field2587);
            for (int var8 = 0; var8 < field622; var8++) {
                int var9 = field844[var8] * 4 + 2 - Statics.field341.field933 / 32;
                int var10 = field849[var8] * 4 + 2 - Statics.field341.field964 / 32;
                method4105(arg1, arg2, var9, var10, field817[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class208 var13 = field747[Statics.field348][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field341.field933 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field341.field964 / 32;
                        method4105(arg1, arg2, var14, var15, Statics.field3706[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field661; var16++) {
                class74 var17 = field660[field667[var16]];
                if (var17 != null && var17.method1040()) {
                    class274 var18 = var17.field1077;
                    if (var18 != null && var18.field3542 != null) {
                        var18 = var18.method4814();
                    }
                    if (var18 != null && var18.field3533 && var18.field3512) {
                        int var19 = var17.field933 / 32 - Statics.field341.field933 / 32;
                        int var20 = var17.field964 / 32 - Statics.field341.field964 / 32;
                        method4105(arg1, arg2, var19, var20, Statics.field3706[1], var4);
                    }
                }
            }
            int var21 = class84.field1199;
            int[] var22 = class84.field1205;
            for (int var23 = 0; var23 < var21; var23++) {
                class62 var24 = field735[var22[var23]];
                if (var24 != null && var24.method1040() && !var24.field603 && Statics.field341 != var24) {
                    int var25 = var24.field933 / 32 - Statics.field341.field933 / 32;
                    int var26 = var24.field964 / 32 - Statics.field341.field964 / 32;
                    boolean var27 = false;
                    if (Statics.field341.field602 != 0 && var24.field602 != 0 && Statics.field341.field602 == var24.field602) {
                        var27 = true;
                    }
                    if (var24.method1065()) {
                        method4105(arg1, arg2, var25, var26, Statics.field3706[3], var4);
                    } else if (var27) {
                        method4105(arg1, arg2, var25, var26, Statics.field3706[4], var4);
                    } else if (var24.method1063()) {
                        method4105(arg1, arg2, var25, var26, Statics.field3706[5], var4);
                    } else {
                        method4105(arg1, arg2, var25, var26, Statics.field3706[2], var4);
                    }
                }
            }
            if (field683 != 0 && field631 % 20 < 10) {
                if (field683 == 1 && field640 >= 0 && field640 < field660.length) {
                    class74 var28 = field660[field640];
                    if (var28 != null) {
                        int var29 = var28.field933 / 32 - Statics.field341.field933 / 32;
                        int var30 = var28.field964 / 32 - Statics.field341.field964 / 32;
                        method1705(arg1, arg2, var29, var30, Statics.field317[1], var4);
                    }
                }
                if (field683 == 2) {
                    int var31 = field642 * 4 - Statics.field6 * 4 + 2 - Statics.field341.field933 / 32;
                    int var32 = field643 * 4 - Statics.field72 * 4 + 2 - Statics.field341.field964 / 32;
                    method1705(arg1, arg2, var31, var32, Statics.field317[1], var4);
                }
                if (field683 == 10 && field619 >= 0 && field619 < field735.length) {
                    class62 var33 = field735[field619];
                    if (var33 != null) {
                        int var34 = var33.field933 / 32 - Statics.field341.field933 / 32;
                        int var35 = var33.field964 / 32 - Statics.field341.field964 / 32;
                        method1705(arg1, arg2, var34, var35, Statics.field317[1], var4);
                    }
                }
            }
            if (field658 != 0) {
                int var36 = field658 * 4 + 2 - Statics.field341.field933 / 32;
                int var37 = field802 * 4 + 2 - Statics.field341.field964 / 32;
                method4105(arg1, arg2, var36, var37, Statics.field317[0], var4);
            }
            if (!Statics.field341.field603) {
                class318.method5408(var4.field2590 / 2 + arg1 - 1, var4.field2588 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field793[arg3] = true;
    }

    @ObfuscatedName("ef.ju(Lhg;IIII)V")
    public static final void method2873(class233 arg0, int arg1, int arg2, int arg3) {
        class227 var4 = arg0.method4219(false);
        if (var4 == null) {
            return;
        }
        if (field738 < 3) {
            Statics.field150.method5490(arg1, arg2, var4.field2590, var4.field2588, 25, 25, field689, 256, var4.field2589, var4.field2587);
        } else {
            class318.method5391(arg1, arg2, 0, var4.field2589, var4.field2587);
        }
    }

    @ObfuscatedName("bl.jm(IIIILlh;Lhk;I)V")
    public static final void method1705(int arg0, int arg1, int arg2, int arg3, class322 arg4, class227 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method4105(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field689 & 0x7FF;
        int var8 = class125.field1731[var7];
        int var9 = class125.field1745[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field2590 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field2622.method5520(arg5.field2590 / 2 + arg0 - var17 / 2 + var15, arg5.field2588 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("ho.jb(IIIILlh;Lhk;B)V")
    public static final void method4105(int arg0, int arg1, int arg2, int arg3, class322 arg4, class227 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field689 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class125.field1731[var6];
        int var9 = class125.field1745[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method5518(arg5.field2590 / 2 + var10 - arg4.field3829 / 2, arg5.field2588 / 2 - var11 - arg4.field3824 / 2, arg0, arg1, arg5.field2590, arg5.field2588, arg5.field2589, arg5.field2587);
        } else {
            arg4.method5502(arg5.field2590 / 2 + arg0 + var10 - arg4.field3829 / 2, arg5.field2588 / 2 + arg1 - var11 - arg4.field3824 / 2);
        }
    }

    @ObfuscatedName("w.ja(I)V")
    public static final void method137() {
        field811 = field765;
        Statics.field1866 = true;
    }

    @ObfuscatedName("ef.jn(Ljava/lang/String;I)V")
    public static final void method2872(String arg0) {
        if (!arg0.equals("")) {
            class175 var1 = class175.method107(class172.field2189, field830.field1266);
            var1.field2311.method3258(class185.method3230(arg0));
            var1.field2311.method3265(arg0);
            field830.method1875(var1);
        }
    }

    @ObfuscatedName("fa.jf(Lhg;B)I")
    public static int method3164(class233 arg0) {
        class214 var1 = (class214) field819.method3735(((long) arg0.field2638 << 32) + (long) arg0.field2639);
        return var1 == null ? arg0.field2711 : var1.field2480;
    }

    @ObfuscatedName("bi.jk(Lhg;I)Lhg;")
    public static class233 method968(class233 arg0) {
        int var1 = class234.method896(method3164(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class233.method2957(arg0.field2675);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("az.jl(Lhg;II)Ljava/lang/String;")
    public static String method932(class233 arg0, int arg1) {
        int var2 = method3164(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2739 == null) {
            return null;
        } else if (arg0.field2729 == null || arg0.field2729.length <= arg1 || arg0.field2729[arg1] == null || arg0.field2729[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2729[arg1];
        }
    }

    @ObfuscatedName("et.ji(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method2878(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field786 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field786 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field786 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field786 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field786 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field3345 != null) {
            var3 = "/p=" + Statics.field3345;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field625 + "/a=" + Statics.field1945 + var3 + "/";
    }

    @ObfuscatedName("client.jz(I)Lkk;")
    public class294 method1103() {
        return Statics.field341 == null ? null : Statics.field341.field593;
    }

    @ObfuscatedName("ai.jx(IIIZS)V")
    public static void method894(int arg0, int arg1, int arg2, boolean arg3) {
        class175 var4 = class175.method107(class172.field2248, field830.field1266);
        var4.field2311.method3261(arg3 ? field701 : 0);
        var4.field2311.method3309(arg0);
        var4.field2311.method3300(arg2);
        var4.field2311.method3259(arg1);
        field830.method1875(var4);
    }

    @ObfuscatedName("q.jo(IB)V")
    public static void method207(int arg0) {
        field694 = arg0;
    }

    @ObfuscatedName("db.kz(I)V")
    public static void method2546() {
        field830.method1875(class175.method107(class172.field2215, field830.field1266));
        field694 = 0;
    }

    @ObfuscatedName("e.kh(I)V")
    public static void method181() {
        if (!field744 || Statics.field341 == null) {
            return;
        }
        int var0 = Statics.field341.field927[0];
        int var1 = Statics.field341.field940[0];
        if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) {
            return;
        }
        Statics.field63 = Statics.field341.field933;
        int var2 = method3573(Statics.field341.field933, Statics.field341.field964, Statics.field348) - field695;
        if (var2 < Statics.field2017) {
            Statics.field2017 = var2;
        }
        Statics.field1714 = Statics.field341.field964;
        field744 = false;
    }

    @ObfuscatedName("il.kv(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method4246(String arg0) {
        class245[] var1 = new class245[] { class245.field3158, class245.field3156, class245.field3154, class245.field3157, class245.field3159, class245.field3155 };
        class245[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class245 var4 = var2[var3];
            if (var4.field3160 != -1) {
                int var6 = var4.field3160;
                String var7 = "<img=" + var6 + ">";
                if (arg0.startsWith(var7)) {
                    arg0 = arg0.substring(6 + Integer.toString(var4.field3160).length());
                    break;
                }
            }
        }
        return arg0;
    }

    @ObfuscatedName("aw.kx(B)V")
    public static void method639() {
        if (Statics.field196 == null) {
            return;
        }
        field885 = field631;
        Statics.field196.method4425();
        for (int var0 = 0; var0 < field735.length; var0++) {
            if (field735[var0] != null) {
                Statics.field196.method4424((field735[var0].field933 >> 7) + Statics.field6, (field735[var0].field964 >> 7) + Statics.field72);
            }
        }
    }
}

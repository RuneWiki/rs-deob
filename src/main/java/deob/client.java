package deob;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class48 implements class291 {

    @ObfuscatedName("client.w")
    public static class167[] field688 = new class167[4];

    @ObfuscatedName("client.ak")
    public static boolean field629 = true;

    @ObfuscatedName("client.be")
    public static int field683 = 1;

    @ObfuscatedName("client.bo")
    public static int field631 = 0;

    @ObfuscatedName("client.bf")
    public static int field632 = 0;

    @ObfuscatedName("client.ba")
    public static boolean field633 = false;

    @ObfuscatedName("client.bm")
    public static boolean field634 = false;

    @ObfuscatedName("client.bg")
    public static int field635 = 0;

    @ObfuscatedName("client.bn")
    public static int field865 = -1;

    @ObfuscatedName("client.bv")
    public static boolean field637 = false;

    @ObfuscatedName("client.bu")
    public static int field638 = 0;

    @ObfuscatedName("client.cg")
    public static boolean field692 = true;

    @ObfuscatedName("client.cv")
    public static int field642 = 0;

    @ObfuscatedName("client.cz")
    public static long field643 = 1L;

    @ObfuscatedName("client.co")
    public static int field644 = -1;

    @ObfuscatedName("client.cq")
    public static int field628 = -1;

    @ObfuscatedName("client.cw")
    public static long field646 = -1L;

    @ObfuscatedName("client.ck")
    public static boolean field655 = true;

    @ObfuscatedName("client.cb")
    public static boolean field648 = false;

    @ObfuscatedName("client.cs")
    public static int field649 = 0;

    @ObfuscatedName("client.ce")
    public static int field650 = 0;

    @ObfuscatedName("client.cr")
    public static int field757 = 0;

    @ObfuscatedName("client.cd")
    public static int field697 = 0;

    @ObfuscatedName("client.ch")
    public static int field653 = 0;

    @ObfuscatedName("client.cl")
    public static int field797 = 0;

    @ObfuscatedName("client.cn")
    public static int field900 = 0;

    @ObfuscatedName("client.ct")
    public static int field656 = 0;

    @ObfuscatedName("client.cx")
    public static int field657 = 0;

    @ObfuscatedName("client.ca")
    public static class79 field658 = class79.field1130;

    @ObfuscatedName("client.dt")
    public static class79 field651 = class79.field1130;

    @ObfuscatedName("client.dd")
    public static int field660 = 0;

    @ObfuscatedName("client.dv")
    public static int field661 = 0;

    @ObfuscatedName("client.dn")
    public static int field662 = 0;

    @ObfuscatedName("client.eg")
    public static int field782 = 0;

    @ObfuscatedName("client.et")
    public static int field664 = 0;

    @ObfuscatedName("client.ej")
    public static int field774 = 0;

    @ObfuscatedName("client.el")
    public static int field666 = 0;

    @ObfuscatedName("client.eo")
    public static int field869 = 0;

    @ObfuscatedName("client.ef")
    public static class149 field668 = class149.field1968;

    @ObfuscatedName("client.er")
    public static boolean field669 = false;

    @ObfuscatedName("client.eq")
    public static class83 field801 = new class83();

    @ObfuscatedName("client.ew")
    public static byte[] field731 = null;

    @ObfuscatedName("client.eh")
    public static class74[] field672 = new class74[32768];

    @ObfuscatedName("client.en")
    public static int field673 = 0;

    @ObfuscatedName("client.ep")
    public static int[] field674 = new int[32768];

    @ObfuscatedName("client.ed")
    public static int field675 = 0;

    @ObfuscatedName("client.fd")
    public static int[] field676 = new int[250];

    @ObfuscatedName("client.fo")
    public static final class90 field861 = new class90();

    @ObfuscatedName("client.fj")
    public static int field775 = 0;

    @ObfuscatedName("client.fb")
    public static boolean field898 = false;

    @ObfuscatedName("client.fy")
    public static boolean field680 = true;

    @ObfuscatedName("client.fi")
    public static class283 field875 = new class283();

    @ObfuscatedName("client.fw")
    public static HashMap field682 = new HashMap();

    @ObfuscatedName("client.fv")
    public static int field821 = 0;

    @ObfuscatedName("client.fp")
    public static int field684 = 1;

    @ObfuscatedName("client.fa")
    public static int field679 = 0;

    @ObfuscatedName("client.fc")
    public static int field686 = 1;

    @ObfuscatedName("client.fs")
    public static int field687 = 0;

    @ObfuscatedName("client.gn")
    public static boolean field689 = false;

    @ObfuscatedName("client.go")
    public static int[][][] field690 = new int[4][13][13];

    @ObfuscatedName("client.gl")
    public static final int[] field876 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.gj")
    public static int field887 = 0;

    @ObfuscatedName("client.gu")
    public static int field636 = 2301979;

    @ObfuscatedName("client.gs")
    public static int field694 = 5063219;

    @ObfuscatedName("client.he")
    public static int field762 = 3353893;

    @ObfuscatedName("client.hd")
    public static int field696 = 7759444;

    @ObfuscatedName("client.hq")
    public static boolean field777 = false;

    @ObfuscatedName("client.hu")
    public static int field698 = 0;

    @ObfuscatedName("client.hs")
    public static int field699 = 128;

    @ObfuscatedName("client.hc")
    public static int field700 = 0;

    @ObfuscatedName("client.hz")
    public static int field701 = 0;

    @ObfuscatedName("client.hm")
    public static int field641 = 0;

    @ObfuscatedName("client.hy")
    public static int field716 = 0;

    @ObfuscatedName("client.hp")
    public static int field704 = 0;

    @ObfuscatedName("client.hg")
    public static int field705 = 0;

    @ObfuscatedName("client.ht")
    public static int field706 = 50;

    @ObfuscatedName("client.hk")
    public static int field880 = 0;

    @ObfuscatedName("client.hr")
    public static int field708 = 0;

    @ObfuscatedName("client.hw")
    public static int field670 = 0;

    @ObfuscatedName("client.ig")
    public static int field710 = 12;

    @ObfuscatedName("client.iv")
    public static int field711 = 6;

    @ObfuscatedName("client.id")
    public static int field712 = 0;

    @ObfuscatedName("client.ii")
    public static boolean field713 = false;

    @ObfuscatedName("client.it")
    public static String field733 = null;

    @ObfuscatedName("client.in")
    public static int field691 = 0;

    @ObfuscatedName("client.ie")
    public static boolean field715 = false;

    @ObfuscatedName("client.ib")
    public static int field744 = 0;

    @ObfuscatedName("client.ia")
    public static int field717 = 0;

    @ObfuscatedName("client.is")
    public static int field718 = 50;

    @ObfuscatedName("client.io")
    public static int[] field719 = new int[field718];

    @ObfuscatedName("client.ih")
    public static int[] field750 = new int[field718];

    @ObfuscatedName("client.iu")
    public static int[] field862 = new int[field718];

    @ObfuscatedName("client.iw")
    public static int[] field652 = new int[field718];

    @ObfuscatedName("client.ik")
    public static int[] field723 = new int[field718];

    @ObfuscatedName("client.ir")
    public static int[] field724 = new int[field718];

    @ObfuscatedName("client.im")
    public static int[] field823 = new int[field718];

    @ObfuscatedName("client.ij")
    public static String[] field726 = new String[field718];

    @ObfuscatedName("client.ip")
    public static int[][] field791 = new int[104][104];

    @ObfuscatedName("client.iq")
    public static int field728 = 0;

    @ObfuscatedName("client.iy")
    public static int field729 = -1;

    @ObfuscatedName("client.if")
    public static int field730 = -1;

    @ObfuscatedName("client.ic")
    public static int field847 = 0;

    @ObfuscatedName("client.il")
    public static int field732 = 0;

    @ObfuscatedName("client.jd")
    public static int field722 = 0;

    @ObfuscatedName("client.jv")
    public static int field734 = 0;

    @ObfuscatedName("client.jn")
    public static boolean field735 = true;

    @ObfuscatedName("client.jk")
    public static int field908 = 0;

    @ObfuscatedName("client.jg")
    public static int field737 = 0;

    @ObfuscatedName("client.jl")
    public static int field738 = 0;

    @ObfuscatedName("client.jz")
    public static int field739 = 0;

    @ObfuscatedName("client.jq")
    public static int field829 = 0;

    @ObfuscatedName("client.js")
    public static int field741 = 0;

    @ObfuscatedName("client.jp")
    public static boolean field742 = false;

    @ObfuscatedName("client.ji")
    public static int field743 = 0;

    @ObfuscatedName("client.jy")
    public static int field806 = 0;

    @ObfuscatedName("client.ju")
    public static boolean field745 = true;

    @ObfuscatedName("client.jt")
    public static class62[] field746 = new class62[2048];

    @ObfuscatedName("client.jr")
    public static int field663 = -1;

    @ObfuscatedName("client.jh")
    public static int field748 = 0;

    @ObfuscatedName("client.ja")
    public static boolean field749 = true;

    @ObfuscatedName("client.kl")
    public static int field860 = 0;

    @ObfuscatedName("client.kj")
    public static int field751 = 0;

    @ObfuscatedName("client.kt")
    public static int[] field703 = new int[1000];

    @ObfuscatedName("client.kc")
    public static final int[] field753 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.ka")
    public static String[] field754 = new String[8];

    @ObfuscatedName("client.kk")
    public static boolean[] field755 = new boolean[8];

    @ObfuscatedName("client.ki")
    public static int[] field756 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.ky")
    public static int field820 = -1;

    @ObfuscatedName("client.kq")
    public static class208[][][] field659 = new class208[4][104][104];

    @ObfuscatedName("client.km")
    public static class208 field759 = new class208();

    @ObfuscatedName("client.ko")
    public static class208 field760 = new class208();

    @ObfuscatedName("client.kn")
    public static class208 field761 = new class208();

    @ObfuscatedName("client.kd")
    public static int[] field838 = new int[25];

    @ObfuscatedName("client.kb")
    public static int[] field763 = new int[25];

    @ObfuscatedName("client.kx")
    public static int[] field695 = new int[25];

    @ObfuscatedName("client.ke")
    public static int field765 = 0;

    @ObfuscatedName("client.kz")
    public static boolean field837 = false;

    @ObfuscatedName("client.kw")
    public static int field767 = 0;

    @ObfuscatedName("client.lj")
    public static int[] field768 = new int[500];

    @ObfuscatedName("client.ll")
    public static int[] field769 = new int[500];

    @ObfuscatedName("client.lq")
    public static int[] field770 = new int[500];

    @ObfuscatedName("client.lo")
    public static int[] field845 = new int[500];

    @ObfuscatedName("client.lc")
    public static String[] field772 = new String[500];

    @ObfuscatedName("client.lx")
    public static String[] field773 = new String[500];

    @ObfuscatedName("client.lh")
    public static boolean[] field804 = new boolean[500];

    @ObfuscatedName("client.lz")
    public static boolean field864 = false;

    @ObfuscatedName("client.ln")
    public static boolean field776 = false;

    @ObfuscatedName("client.le")
    public static boolean field630 = false;

    @ObfuscatedName("client.lp")
    public static boolean field778 = true;

    @ObfuscatedName("client.li")
    public static int field779 = -1;

    @ObfuscatedName("client.lk")
    public static int field780 = -1;

    @ObfuscatedName("client.la")
    public static int field851 = 0;

    @ObfuscatedName("client.ly")
    public static int field809 = 50;

    @ObfuscatedName("client.lf")
    public static int field783 = 0;

    @ObfuscatedName("client.lv")
    public static boolean field785 = false;

    @ObfuscatedName("client.lw")
    public static int field786 = -1;

    @ObfuscatedName("client.lt")
    public static int field787 = -1;

    @ObfuscatedName("client.me")
    public static String field788 = null;

    @ObfuscatedName("client.ml")
    public static String field789 = null;

    @ObfuscatedName("client.mc")
    public static int field790 = -1;

    @ObfuscatedName("client.mw")
    public static class205 field889 = new class205(8);

    @ObfuscatedName("client.mb")
    public static int field813 = 0;

    @ObfuscatedName("client.mh")
    public static int field793 = -1;

    @ObfuscatedName("client.mz")
    public static int field794 = 0;

    @ObfuscatedName("client.my")
    public static int field795 = 0;

    @ObfuscatedName("client.mf")
    public static class233 field796 = null;

    @ObfuscatedName("client.mj")
    public static int field640 = 0;

    @ObfuscatedName("client.mi")
    public static int field798 = 0;

    @ObfuscatedName("client.mo")
    public static int field740 = 0;

    @ObfuscatedName("client.mg")
    public static int field800 = -1;

    @ObfuscatedName("client.mn")
    public static boolean field727 = false;

    @ObfuscatedName("client.mv")
    public static class233 field802 = null;

    @ObfuscatedName("client.mu")
    public static class233 field803 = null;

    @ObfuscatedName("client.mm")
    public static class233 field812 = null;

    @ObfuscatedName("client.mr")
    public static int field781 = 0;

    @ObfuscatedName("client.md")
    public static int field784 = 0;

    @ObfuscatedName("client.ms")
    public static class233 field807 = null;

    @ObfuscatedName("client.mq")
    public static boolean field808 = false;

    @ObfuscatedName("client.ma")
    public static int field725 = -1;

    @ObfuscatedName("client.nq")
    public static int field810 = -1;

    @ObfuscatedName("client.nn")
    public static boolean field811 = false;

    @ObfuscatedName("client.ni")
    public static int field681 = -1;

    @ObfuscatedName("client.nk")
    public static int field758 = -1;

    @ObfuscatedName("client.nc")
    public static boolean field814 = false;

    @ObfuscatedName("client.ng")
    public static int field815 = 1;

    @ObfuscatedName("client.ne")
    public static int[] field816 = new int[32];

    @ObfuscatedName("client.nb")
    public static int field817 = 0;

    @ObfuscatedName("client.nv")
    public static int[] field654 = new int[32];

    @ObfuscatedName("client.ny")
    public static int field819 = 0;

    @ObfuscatedName("client.nd")
    public static int[] field766 = new int[32];

    @ObfuscatedName("client.nz")
    public static int field893 = 0;

    @ObfuscatedName("client.nl")
    public static int field792 = 0;

    @ObfuscatedName("client.no")
    public static int field881 = 0;

    @ObfuscatedName("client.ns")
    public static int field824 = 0;

    @ObfuscatedName("client.nx")
    public static int field825 = 0;

    @ObfuscatedName("client.nh")
    public static int field826 = 0;

    @ObfuscatedName("client.na")
    public static int field827 = 0;

    @ObfuscatedName("client.oc")
    public static int field872 = 0;

    @ObfuscatedName("client.om")
    public static class208 field709 = new class208();

    @ObfuscatedName("client.oh")
    public static class208 field830 = new class208();

    @ObfuscatedName("client.og")
    public static class208 field831 = new class208();

    @ObfuscatedName("client.oe")
    public static class205 field832 = new class205(512);

    @ObfuscatedName("client.ot")
    public static int field833 = 0;

    @ObfuscatedName("client.or")
    public static int field857 = -2;

    @ObfuscatedName("client.oq")
    public static boolean[] field828 = new boolean[100];

    @ObfuscatedName("client.oo")
    public static boolean[] field764 = new boolean[100];

    @ObfuscatedName("client.oy")
    public static boolean[] field645 = new boolean[100];

    @ObfuscatedName("client.oj")
    public static int[] field799 = new int[100];

    @ObfuscatedName("client.ov")
    public static int[] field839 = new int[100];

    @ObfuscatedName("client.od")
    public static int[] field840 = new int[100];

    @ObfuscatedName("client.os")
    public static int[] field841 = new int[100];

    @ObfuscatedName("client.oz")
    public static int field842 = 0;

    @ObfuscatedName("client.oi")
    public static long field843 = 0L;

    @ObfuscatedName("client.ok")
    public static boolean field844 = true;

    @ObfuscatedName("client.on")
    public static int[] field720 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.ol")
    public static int field846 = 0;

    @ObfuscatedName("client.pl")
    public static int field835 = 0;

    @ObfuscatedName("client.pd")
    public static String field848 = "";

    @ObfuscatedName("client.py")
    public static long[] field849 = new long[100];

    @ObfuscatedName("client.pb")
    public static int field850 = 0;

    @ObfuscatedName("client.pv")
    public static int field892 = 0;

    @ObfuscatedName("client.ps")
    public static int[] field852 = new int[128];

    @ObfuscatedName("client.pw")
    public static int[] field853 = new int[128];

    @ObfuscatedName("client.px")
    public static long field854 = -1L;

    @ObfuscatedName("client.pj")
    public static int field671 = -1;

    @ObfuscatedName("client.pq")
    public static int field856 = 0;

    @ObfuscatedName("client.pr")
    public static int[] field667 = new int[1000];

    @ObfuscatedName("client.pn")
    public static int[] field858 = new int[1000];

    @ObfuscatedName("client.pi")
    public static class324[] field859 = new class324[1000];

    @ObfuscatedName("client.pe")
    public static int field693 = 0;

    @ObfuscatedName("client.pm")
    public static int field891 = 0;

    @ObfuscatedName("client.qi")
    public static int field888 = 0;

    @ObfuscatedName("client.qz")
    public static int field863 = 255;

    @ObfuscatedName("client.qn")
    public static int field805 = -1;

    @ObfuscatedName("client.qu")
    public static boolean field870 = false;

    @ObfuscatedName("client.qk")
    public static int field866 = 127;

    @ObfuscatedName("client.qj")
    public static int field867 = 127;

    @ObfuscatedName("client.qx")
    public static int field868 = 0;

    @ObfuscatedName("client.qg")
    public static int[] field771 = new int[50];

    @ObfuscatedName("client.qy")
    public static int[] field822 = new int[50];

    @ObfuscatedName("client.qv")
    public static int[] field871 = new int[50];

    @ObfuscatedName("client.qo")
    public static int[] field906 = new int[50];

    @ObfuscatedName("client.qs")
    public static class94[] field665 = new class94[50];

    @ObfuscatedName("client.qd")
    public static boolean field874 = false;

    @ObfuscatedName("client.ru")
    public static boolean[] field685 = new boolean[5];

    @ObfuscatedName("client.rt")
    public static int[] field678 = new int[5];

    @ObfuscatedName("client.rs")
    public static int[] field877 = new int[5];

    @ObfuscatedName("client.rp")
    public static int[] field878 = new int[5];

    @ObfuscatedName("client.rz")
    public static int[] field879 = new int[5];

    @ObfuscatedName("client.rk")
    public static short field873 = 256;

    @ObfuscatedName("client.rv")
    public static short field882 = 205;

    @ObfuscatedName("client.ri")
    public static short field736 = 256;

    @ObfuscatedName("client.rb")
    public static short field883 = 320;

    @ObfuscatedName("client.rq")
    public static short field884 = 1;

    @ObfuscatedName("client.rc")
    public static short field885 = 32767;

    @ObfuscatedName("client.rm")
    public static short field886 = 1;

    @ObfuscatedName("client.rn")
    public static short field818 = 32767;

    @ObfuscatedName("client.rr")
    public static int field721 = 0;

    @ObfuscatedName("client.rh")
    public static int field714 = 0;

    @ObfuscatedName("client.re")
    public static int field890 = 0;

    @ObfuscatedName("client.rj")
    public static int field836 = 0;

    @ObfuscatedName("client.ra")
    public static int field707 = 0;

    @ObfuscatedName("client.rw")
    public static class230 field752 = new class230();

    @ObfuscatedName("client.rg")
    public static int field894 = -1;

    @ObfuscatedName("client.rx")
    public static int field895 = -1;

    @ObfuscatedName("client.sq")
    public static class327 field896 = new class326();

    @ObfuscatedName("client.sw")
    public static class5[] field897 = new class5[8];

    @ObfuscatedName("client.sc")
    public static class63 field834 = new class63();

    @ObfuscatedName("client.sb")
    public static int field899 = -1;

    @ObfuscatedName("client.st")
    public static ArrayList field747 = new ArrayList(10);

    @ObfuscatedName("client.su")
    public static int field901 = 0;

    @ObfuscatedName("client.so")
    public static final class61 field902 = new class61();

    @ObfuscatedName("client.sy")
    public static int[] field903 = new int[50];

    @ObfuscatedName("client.to")
    public static int[] field904 = new int[50];

    @ObfuscatedName("ab.ex(I)Lla;")
    public static class330 method675() {
        return Statics.field607;
    }

    @ObfuscatedName("client.ah(I)V")
    public final void method758() {
    }

    public final void init() {
        if (!this.method733()) {
            return;
        }
        class282[] var1 = new class282[] { class282.field3652, class282.field3656, class282.field3662, class282.field3650, class282.field3651, class282.field3659, class282.field3655, class282.field3660, class282.field3664, class282.field3653, class282.field3658, class282.field3665, class282.field3663, class282.field3657, class282.field3654, class282.field3661, class282.field3667, class282.field3666 };
        class282[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class282 var4 = var2[var3];
            String var5 = this.getParameter(var4.field3668);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field3668)) {
                    case 1:
                        field680 = Integer.parseInt(var5) != 0;
                    case 2:
                    case 11:
                    case 13:
                    case 16:
                    default:
                        break;
                    case 3:
                        if (var5.equalsIgnoreCase(class76.field1103)) {
                            field633 = true;
                        } else {
                            field633 = false;
                        }
                        break;
                    case 4:
                        if (field865 == -1) {
                            field865 = Integer.parseInt(var5);
                        }
                        break;
                    case 5:
                        field631 = Integer.parseInt(var5);
                        break;
                    case 6:
                        field635 = Integer.parseInt(var5);
                        break;
                    case 7:
                        Statics.field3795 = class246.method4272(Integer.parseInt(var5));
                        break;
                    case 8:
                        if (var5.equalsIgnoreCase(class76.field1103)) {
                        }
                        break;
                    case 9:
                        Statics.field257 = var5;
                        break;
                    case 10:
                        class247[] var6 = new class247[] { class247.field3209, class247.field3207, class247.field3208, class247.field3205, class247.field3206, class247.field3210 };
                        Statics.field334 = (class247) Statics.method1912(var6, Integer.parseInt(var5));
                        if (Statics.field334 == class247.field3210) {
                            Statics.field3846 = class331.field4005;
                        } else {
                            Statics.field3846 = class331.field4004;
                        }
                        break;
                    case 12:
                        field683 = Integer.parseInt(var5);
                        break;
                    case 14:
                        Statics.field278 = Integer.parseInt(var5);
                        break;
                    case 15:
                        field632 = Integer.parseInt(var5);
                        break;
                    case 17:
                        Statics.field3156 = var5;
                }
            }
        }
        class128.field1801 = false;
        field634 = false;
        Statics.field2440 = this.getCodeBase().getHost();
        String var7 = Statics.field3795.field3201;
        byte var8 = 0;
        try {
            class158.method531("oldschool", var7, var8, 18);
        } catch (Exception var10) {
            class155.method2919((String) null, var10);
        }
        Statics.field1133 = this;
        Statics.field1994 = field865;
        this.method738(765, 503, 176);
    }

    @ObfuscatedName("client.al(I)V")
    public final void method749() {
        int[] var1 = new int[] { 20, 260, 10000 };
        int[] var2 = new int[] { 1000, 100, 500 };
        if (var1 == null || var2 == null) {
            Statics.field2427 = null;
            Statics.field2425 = null;
            Statics.field1982 = (byte[][][]) null;
        } else {
            Statics.field2427 = var1;
            Statics.field2425 = new int[var1.length];
            Statics.field1982 = new byte[var1.length][][];
            for (int var3 = 0; var3 < Statics.field2427.length; var3++) {
                Statics.field1982[var3] = new byte[var2[var3]][];
            }
        }
        Statics.field3844 = field632 == 0 ? 43594 : field683 + 40000;
        Statics.field508 = field632 == 0 ? 443 : field683 + 50000;
        Statics.field2587 = Statics.field3844;
        Statics.field2636 = class231.field2648;
        Statics.field2643 = class231.field2647;
        Statics.field2641 = class231.field2649;
        Statics.field56 = class231.field2650;
        Statics.field507 = new class138();
        this.method818();
        this.method775();
        Statics.field3600 = this.method774();
        Statics.field68 = new class165(255, class158.field2033, class158.field2037, 500000);
        class113 var4 = null;
        class68 var5 = new class68();
        try {
            var4 = class158.method942("", Statics.field334.field3211, false);
            byte[] var6 = new byte[(int) var4.method2384()];
            int var8;
            for (int var7 = 0; var7 < var6.length; var7 += var8) {
                var8 = var4.method2385(var6, var7, var6.length - var7);
                if (var8 == -1) {
                    throw new IOException();
                }
            }
            var5 = new class68(new class185(var6));
        } catch (Exception var13) {
        }
        try {
            if (var4 != null) {
                var4.method2393();
            }
        } catch (Exception var12) {
        }
        Statics.field141 = var5;
        this.method730();
        class46.method459(this, Statics.field531);
        if (field632 != 0) {
            field648 = true;
        }
        method972(Statics.field141.field1020);
        Statics.field1863 = new class69(Statics.field3846);
    }

    @ObfuscatedName("client.ad(I)V")
    public final void method750() {
        field642++;
        this.method1095();
        class251.method1017();
        class220.method77();
        method928();
        class40 var1 = class40.field390;
        synchronized (class40.field390) {
            class40.field384++;
            class40.field388 = class40.field370;
            class40.field380 = 0;
            if (class40.field363 >= 0) {
                while (class40.field375 != class40.field363) {
                    int var3 = class40.field386[class40.field375];
                    class40.field375 = class40.field375 + 1 & 0x7F;
                    if (var3 < 0) {
                        class40.field373[~var3] = false;
                    } else {
                        if (!class40.field373[var3] && class40.field380 < class40.field379.length - 1) {
                            class40.field379[++class40.field380 - 1] = var3;
                        }
                        class40.field373[var3] = true;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class40.field373[var2] = false;
                }
                class40.field363 = class40.field375;
            }
            if (class40.field380 > 0) {
                class40.field384 = 0;
            }
            class40.field370 = class40.field382;
        }
        class49 var5 = class49.field454;
        synchronized (class49.field454) {
            class49.field469 = class49.field456;
            class49.field461 = class49.field457;
            class49.field462 = class49.field458;
            class49.field460 = class49.field459;
            class49.field468 = class49.field453;
            class49.field466 = class49.field465;
            class49.field470 = class49.field452;
            class49.field471 = class49.field467;
            class49.field453 = 0;
        }
        if (Statics.field3600 != null) {
            int var7 = Statics.field3600.method621();
            field872 = var7;
        }
        if (field638 == 0) {
            method174();
            Statics.field1200.method3030();
            for (int var8 = 0; var8 < 32; var8++) {
                field428[var8] = 0L;
            }
            for (int var9 = 0; var9 < 32; var9++) {
                field442[var9] = 0L;
            }
            Statics.field424 = 0;
        } else if (field638 == 5) {
            class80.method3307(this);
            method174();
            Statics.field1200.method3030();
            for (int var10 = 0; var10 < 32; var10++) {
                field428[var10] = 0L;
            }
            for (int var11 = 0; var11 < 32; var11++) {
                field442[var11] = 0L;
            }
            Statics.field424 = 0;
        } else if (field638 == 10 || field638 == 11) {
            class80.method3307(this);
        } else if (field638 == 20) {
            class80.method3307(this);
            this.method1098();
        } else if (field638 == 25) {
            method2905(false);
            field821 = 0;
            boolean var12 = true;
            for (int var13 = 0; var13 < Statics.field1126.length; var13++) {
                if (Statics.field2412[var13] != -1 && Statics.field1126[var13] == null) {
                    Statics.field1126[var13] = Statics.field1211.method4289(Statics.field2412[var13], 0);
                    if (Statics.field1126[var13] == null) {
                        var12 = false;
                        field821++;
                    }
                }
                if (Statics.field1839[var13] != -1 && Statics.field268[var13] == null) {
                    Statics.field268[var13] = Statics.field1211.method4290(Statics.field1839[var13], 0, Statics.field239[var13]);
                    if (Statics.field268[var13] == null) {
                        var12 = false;
                        field821++;
                    }
                }
            }
            if (var12) {
                field679 = 0;
                boolean var14 = true;
                for (int var15 = 0; var15 < Statics.field1126.length; var15++) {
                    byte[] var16 = Statics.field268[var15];
                    if (var16 != null) {
                        int var17 = (Statics.field279[var15] >> 8) * 64 - Statics.field321;
                        int var18 = (Statics.field279[var15] & 0xFF) * 64 - Statics.field2611;
                        if (field689) {
                            var17 = 10;
                            var18 = 10;
                        }
                        boolean var20 = true;
                        class185 var21 = new class185(var16);
                        int var22 = -1;
                        label626: while (true) {
                            int var23 = var21.method3403();
                            if (var23 == 0) {
                                var14 &= var20;
                                break;
                            }
                            var22 += var23;
                            int var24 = 0;
                            boolean var25 = false;
                            while (true) {
                                while (!var25) {
                                    int var27 = var21.method3358();
                                    if (var27 == 0) {
                                        continue label626;
                                    }
                                    var24 += var27 - 1;
                                    int var28 = var24 & 0x3F;
                                    int var29 = var24 >> 6 & 0x3F;
                                    int var30 = var21.method3344() >> 2;
                                    int var31 = var17 + var29;
                                    int var32 = var18 + var28;
                                    if (var31 > 0 && var32 > 0 && var31 < 103 && var32 < 103) {
                                        class271 var33 = class271.method1776(var22);
                                        if (var30 != 22 || !field634 || var33.field3466 != 0 || var33.field3472 == 1 || var33.field3485) {
                                            if (!var33.method4725()) {
                                                field679++;
                                                var20 = false;
                                            }
                                            var25 = true;
                                        }
                                    }
                                }
                                int var26 = var21.method3358();
                                if (var26 == 0) {
                                    break;
                                }
                                var21.method3344();
                            }
                        }
                    }
                }
                if (var14) {
                    if (field687 != 0) {
                        method96(class240.field2980 + class76.field1107 + class76.field1104 + 100 + "%" + class76.field1105, true);
                    }
                    method928();
                    Statics.field3406.method2723();
                    for (int var35 = 0; var35 < 4; var35++) {
                        field688[var35].method3192();
                    }
                    for (int var36 = 0; var36 < 4; var36++) {
                        for (int var37 = 0; var37 < 104; var37++) {
                            for (int var38 = 0; var38 < 104; var38++) {
                                class51.field482[var36][var37][var38] = 0;
                            }
                        }
                    }
                    method928();
                    class51.method282();
                    int var39 = Statics.field1126.length;
                    for (class70 var40 = (class70) class70.field1044.method3827(); var40 != null; var40 = (class70) class70.field1044.method3829()) {
                        if (var40.field1040 != null) {
                            Statics.field3384.method1969(var40.field1040);
                            var40.field1040 = null;
                        }
                        if (var40.field1045 != null) {
                            Statics.field3384.method1969(var40.field1045);
                            var40.field1045 = null;
                        }
                    }
                    class70.field1044.method3844();
                    method2905(true);
                    if (!field689) {
                        int var41 = 0;
                        label558: while (true) {
                            if (var41 >= var39) {
                                for (int var55 = 0; var55 < var39; var55++) {
                                    int var56 = (Statics.field279[var55] >> 8) * 64 - Statics.field321;
                                    int var57 = (Statics.field279[var55] & 0xFF) * 64 - Statics.field2611;
                                    byte[] var58 = Statics.field1126[var55];
                                    if (var58 == null && Statics.field2025 < 800) {
                                        method928();
                                        class51.method428(var56, var57, 64, 64);
                                    }
                                }
                                method2905(true);
                                int var59 = 0;
                                while (true) {
                                    if (var59 >= var39) {
                                        break label558;
                                    }
                                    byte[] var60 = Statics.field268[var59];
                                    if (var60 != null) {
                                        int var61 = (Statics.field279[var59] >> 8) * 64 - Statics.field321;
                                        int var62 = (Statics.field279[var59] & 0xFF) * 64 - Statics.field2611;
                                        method928();
                                        class128 var63 = Statics.field3406;
                                        class167[] var64 = field688;
                                        class185 var65 = new class185(var60);
                                        int var66 = -1;
                                        while (true) {
                                            int var67 = var65.method3403();
                                            if (var67 == 0) {
                                                break;
                                            }
                                            var66 += var67;
                                            int var68 = 0;
                                            while (true) {
                                                int var69 = var65.method3358();
                                                if (var69 == 0) {
                                                    break;
                                                }
                                                var68 += var69 - 1;
                                                int var70 = var68 & 0x3F;
                                                int var71 = var68 >> 6 & 0x3F;
                                                int var72 = var68 >> 12;
                                                int var73 = var65.method3344();
                                                int var74 = var73 >> 2;
                                                int var75 = var73 & 0x3;
                                                int var76 = var61 + var71;
                                                int var77 = var62 + var70;
                                                if (var76 > 0 && var77 > 0 && var76 < 103 && var77 < 103) {
                                                    int var78 = var72;
                                                    if ((class51.field482[1][var76][var77] & 0x2) == 2) {
                                                        var78 = var72 - 1;
                                                    }
                                                    class167 var79 = null;
                                                    if (var78 >= 0) {
                                                        var79 = var64[var78];
                                                    }
                                                    class51.method4095(var72, var76, var77, var66, var75, var74, var63, var79);
                                                }
                                            }
                                        }
                                    }
                                    var59++;
                                }
                            }
                            int var42 = (Statics.field279[var41] >> 8) * 64 - Statics.field321;
                            int var43 = (Statics.field279[var41] & 0xFF) * 64 - Statics.field2611;
                            byte[] var44 = Statics.field1126[var41];
                            if (var44 != null) {
                                method928();
                                int var45 = Statics.field557 * 8 - 48;
                                int var46 = Statics.field2025 * 8 - 48;
                                class167[] var47 = field688;
                                int var48 = 0;
                                label555: while (true) {
                                    if (var48 >= 4) {
                                        class185 var51 = new class185(var44);
                                        int var52 = 0;
                                        while (true) {
                                            if (var52 >= 4) {
                                                break label555;
                                            }
                                            for (int var53 = 0; var53 < 64; var53++) {
                                                for (int var54 = 0; var54 < 64; var54++) {
                                                    class51.method3636(var51, var52, var42 + var53, var43 + var54, var45, var46, 0);
                                                }
                                            }
                                            var52++;
                                        }
                                    }
                                    for (int var49 = 0; var49 < 64; var49++) {
                                        for (int var50 = 0; var50 < 64; var50++) {
                                            if (var42 + var49 > 0 && var42 + var49 < 103 && var43 + var50 > 0 && var43 + var50 < 103) {
                                                var47[var48].field2105[var42 + var49][var43 + var50] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    var48++;
                                }
                            }
                            var41++;
                        }
                    }
                    if (field689) {
                        int var80 = 0;
                        label491: while (true) {
                            if (var80 >= 4) {
                                for (int var98 = 0; var98 < 13; var98++) {
                                    for (int var99 = 0; var99 < 13; var99++) {
                                        int var100 = field690[0][var98][var99];
                                        if (var100 == -1) {
                                            class51.method428(var98 * 8, var99 * 8, 8, 8);
                                        }
                                    }
                                }
                                method2905(true);
                                int var101 = 0;
                                while (true) {
                                    if (var101 >= 4) {
                                        break label491;
                                    }
                                    method928();
                                    for (int var102 = 0; var102 < 13; var102++) {
                                        for (int var103 = 0; var103 < 13; var103++) {
                                            int var104 = field690[var101][var102][var103];
                                            if (var104 != -1) {
                                                int var105 = var104 >> 24 & 0x3;
                                                int var106 = var104 >> 1 & 0x3;
                                                int var107 = var104 >> 14 & 0x3FF;
                                                int var108 = var104 >> 3 & 0x7FF;
                                                int var109 = (var107 / 8 << 8) + var108 / 8;
                                                for (int var110 = 0; var110 < Statics.field279.length; var110++) {
                                                    if (Statics.field279[var110] == var109 && Statics.field268[var110] != null) {
                                                        class51.method3572(Statics.field268[var110], var101, var102 * 8, var103 * 8, var105, (var107 & 0x7) * 8, (var108 & 0x7) * 8, var106, Statics.field3406, field688);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var101++;
                                }
                            }
                            method928();
                            for (int var81 = 0; var81 < 13; var81++) {
                                for (int var82 = 0; var82 < 13; var82++) {
                                    boolean var83 = false;
                                    int var84 = field690[var80][var81][var82];
                                    if (var84 != -1) {
                                        int var85 = var84 >> 24 & 0x3;
                                        int var86 = var84 >> 1 & 0x3;
                                        int var87 = var84 >> 14 & 0x3FF;
                                        int var88 = var84 >> 3 & 0x7FF;
                                        int var89 = (var87 / 8 << 8) + var88 / 8;
                                        for (int var90 = 0; var90 < Statics.field279.length; var90++) {
                                            if (Statics.field279[var90] == var89 && Statics.field1126[var90] != null) {
                                                class51.method2974(Statics.field1126[var90], var80, var81 * 8, var82 * 8, var85, (var87 & 0x7) * 8, (var88 & 0x7) * 8, var86, field688);
                                                var83 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!var83) {
                                        int var91 = var80;
                                        int var92 = var81 * 8;
                                        int var93 = var82 * 8;
                                        for (int var94 = 0; var94 < 8; var94++) {
                                            for (int var95 = 0; var95 < 8; var95++) {
                                                class51.field492[var91][var92 + var94][var93 + var95] = 0;
                                            }
                                        }
                                        if (var92 > 0) {
                                            for (int var96 = 1; var96 < 8; var96++) {
                                                class51.field492[var91][var92][var93 + var96] = class51.field492[var91][var92 - 1][var93 + var96];
                                            }
                                        }
                                        if (var93 > 0) {
                                            for (int var97 = 1; var97 < 8; var97++) {
                                                class51.field492[var91][var92 + var97][var93] = class51.field492[var91][var92 + var97][var93 - 1];
                                            }
                                        }
                                        if (var92 > 0 && class51.field492[var91][var92 - 1][var93] != 0) {
                                            class51.field492[var91][var92][var93] = class51.field492[var91][var92 - 1][var93];
                                        } else if (var93 > 0 && class51.field492[var91][var92][var93 - 1] != 0) {
                                            class51.field492[var91][var92][var93] = class51.field492[var91][var92][var93 - 1];
                                        } else if (var92 > 0 && var93 > 0 && class51.field492[var91][var92 - 1][var93 - 1] != 0) {
                                            class51.field492[var91][var92][var93] = class51.field492[var91][var92 - 1][var93 - 1];
                                        }
                                    }
                                }
                            }
                            var80++;
                        }
                    }
                    method2905(true);
                    method928();
                    class51.method1089(Statics.field3406, field688);
                    method2905(true);
                    int var111 = class51.field489;
                    if (var111 > Statics.field1983) {
                        var111 = Statics.field1983;
                    }
                    if (var111 < Statics.field1983 - 1) {
                        int var112 = Statics.field1983 - 1;
                    }
                    if (field634) {
                        Statics.field3406.method2873(class51.field489);
                    } else {
                        Statics.field3406.method2873(0);
                    }
                    for (int var113 = 0; var113 < 104; var113++) {
                        for (int var114 = 0; var114 < 104; var114++) {
                            method617(var113, var114);
                        }
                    }
                    method928();
                    method3002();
                    class271.field3456.method3740();
                    if (Statics.field1133.method828()) {
                        class175 var115 = class175.method85(class172.field2217, field861.field1287);
                        var115.field2335.method3422(1057001181);
                        field861.method1944(var115);
                    }
                    if (!field689) {
                        int var116 = (Statics.field557 - 6) / 8;
                        int var117 = (Statics.field557 + 6) / 8;
                        int var118 = (Statics.field2025 - 6) / 8;
                        int var119 = (Statics.field2025 + 6) / 8;
                        for (int var120 = var116 - 1; var120 <= var117 + 1; var120++) {
                            for (int var121 = var118 - 1; var121 <= var119 + 1; var121++) {
                                if (var120 < var116 || var120 > var117 || var121 < var118 || var121 > var119) {
                                    Statics.field1211.method4368("m" + var120 + "_" + var121);
                                    Statics.field1211.method4368("l" + var120 + "_" + var121);
                                }
                            }
                        }
                    }
                    method34(30);
                    method928();
                    class51.method2636();
                    class175 var122 = class175.method85(class172.field2284, field861.field1287);
                    field861.method1944(var122);
                    Statics.field1200.method3030();
                    for (int var123 = 0; var123 < 32; var123++) {
                        field428[var123] = 0L;
                    }
                    for (int var124 = 0; var124 < 32; var124++) {
                        field442[var124] = 0L;
                    }
                    Statics.field424 = 0;
                } else {
                    field687 = 2;
                }
            } else {
                field687 = 1;
            }
        }
        if (field638 == 30) {
            this.method1099();
        } else if (field638 == 40 || field638 == 45) {
            this.method1098();
        }
    }

    @ObfuscatedName("client.ax(ZI)V")
    public final void method751(boolean arg0) {
        boolean var2 = class220.method1841();
        if (var2 && field870 && Statics.field154 != null) {
            Statics.field154.method2090();
        }
        if ((field638 == 10 || field638 == 20 || field638 == 30) && field843 != 0L && Statics.method1926() > field843) {
            method972(method106());
        }
        if (arg0) {
            for (int var3 = 0; var3 < 100; var3++) {
                field828[var3] = true;
            }
        }
        if (field638 == 0) {
            this.method756(class80.field1139, class80.field1151, arg0);
        } else if (field638 == 5) {
            class80.method109(Statics.field2818, Statics.field479, Statics.field576, arg0);
        } else if (field638 == 10 || field638 == 11) {
            class80.method109(Statics.field2818, Statics.field479, Statics.field576, arg0);
        } else if (field638 == 20) {
            class80.method109(Statics.field2818, Statics.field479, Statics.field576, arg0);
        } else if (field638 == 25) {
            if (field687 == 1) {
                if (field821 > field684) {
                    field684 = field821;
                }
                int var4 = (field684 * 50 - field821 * 50) / field684;
                method96(class240.field2980 + class76.field1107 + class76.field1104 + var4 + "%" + class76.field1105, false);
            } else if (field687 == 2) {
                if (field679 > field686) {
                    field686 = field679;
                }
                int var5 = (field686 * 50 - field679 * 50) / field686 + 50;
                method96(class240.field2980 + class76.field1107 + class76.field1104 + var5 + "%" + class76.field1105, false);
            } else {
                method96(class240.field2980, false);
            }
        } else if (field638 == 30) {
            this.method1147();
        } else if (field638 == 40) {
            method96(class240.field2966 + class76.field1107 + class240.field2870, false);
        } else if (field638 == 45) {
            method96(class240.field3019, false);
        }
        if (field638 == 30 && field842 == 0 && !arg0 && !field844) {
            for (int var6 = 0; var6 < field833; var6++) {
                if (field764[var6]) {
                    Statics.field1916.method712(field799[var6], field839[var6], field840[var6], field841[var6]);
                    field764[var6] = false;
                }
            }
        } else if (field638 > 0) {
            Statics.field1916.method711(0, 0);
            for (int var7 = 0; var7 < field833; var7++) {
                field764[var7] = false;
            }
        }
    }

    @ObfuscatedName("client.ao(I)V")
    public final void method748() {
        if (Statics.field594.method1872()) {
            Statics.field594.method1869();
        }
        if (Statics.field306 != null) {
            Statics.field306.field582 = false;
        }
        Statics.field306 = null;
        field861.method1963();
        if (class40.field390 != null) {
            class40 var1 = class40.field390;
            synchronized (class40.field390) {
                class40.field390 = null;
            }
        }
        if (class49.field454 != null) {
            class49 var3 = class49.field454;
            synchronized (class49.field454) {
                class49.field454 = null;
            }
        }
        Statics.field3600 = null;
        if (Statics.field154 != null) {
            Statics.field154.method2093();
        }
        if (Statics.field3164 != null) {
            Statics.field3164.method2093();
        }
        class253.method1735();
        Object var5 = class251.field3242;
        synchronized (class251.field3242) {
            if (class251.field3244 != 0) {
                class251.field3244 = 1;
                try {
                    class251.field3242.wait();
                } catch (InterruptedException var10) {
                }
            }
        }
        if (Statics.field507 != null) {
            Statics.field507.method2928();
            Statics.field507 = null;
        }
        try {
            class158.field2033.method2351();
            for (int var8 = 0; var8 < Statics.field2031; var8++) {
                Statics.field55[var8].method2351();
            }
            class158.field2037.method2351();
            class158.field2035.method2351();
        } catch (Exception var13) {
        }
    }

    @ObfuscatedName("s.eb(II)V")
    public static void method34(int arg0) {
        if (field638 == arg0) {
            return;
        }
        if (field638 == 0) {
            Statics.field1133.method753();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field664 = 0;
            field774 = 0;
            field666 = 0;
            field875.method4944(arg0);
            if (arg0 != 20) {
                method4990(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field2311 != null) {
            Statics.field2311.method3113();
            Statics.field2311 = null;
        }
        if (field638 == 25) {
            field687 = 0;
            field821 = 0;
            field684 = 1;
            field679 = 0;
            field686 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class80.method2952(Statics.field1108, Statics.field13, true, 0);
        } else if (arg0 == 20) {
            class80.method2952(Statics.field1108, Statics.field13, true, field638 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class80.method2952(Statics.field1108, Statics.field13, false, 4);
        } else if (Statics.field1159) {
            Statics.field1145 = null;
            Statics.field1138 = null;
            Statics.field24 = null;
            Statics.field1170 = null;
            Statics.field212 = null;
            Statics.field1081 = null;
            Statics.field3843 = null;
            Statics.field1140 = null;
            Statics.field517 = null;
            Statics.field255 = null;
            Statics.field281 = null;
            Statics.field1515 = null;
            Statics.field1920 = null;
            Statics.field337 = null;
            Statics.field273 = null;
            Statics.field477 = null;
            Statics.field1132 = null;
            Statics.field515 = null;
            Statics.field1109 = null;
            Statics.field401 = null;
            Statics.field2120 = null;
            Statics.field472 = null;
            class220.method2909(2);
            Statics.method5182(true);
            Statics.field1159 = false;
        }
        field638 = arg0;
    }

    @ObfuscatedName("client.ee(I)V")
    public void method1095() {
        if (field638 == 1000) {
            return;
        }
        long var1 = Statics.method1926();
        int var3 = (int) (var1 - Statics.field1210);
        Statics.field1210 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class253.field3264 += var3;
        boolean var4;
        if (class253.field3257 == 0 && class253.field3256 == 0 && class253.field3267 == 0 && class253.field3258 == 0) {
            var4 = true;
        } else if (Statics.field3269 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class253.field3264 > 30000) {
                        throw new IOException();
                    }
                    while (class253.field3256 < 200 && class253.field3258 > 0) {
                        class249 var5 = (class249) class253.field3266.method3781();
                        class185 var6 = new class185(4);
                        var6.method3376(1);
                        var6.method3500((int) var5.field2497);
                        Statics.field3269.method3112(var6.field2415, 0, 4);
                        class253.field3260.method3773(var5, var5.field2497);
                        class253.field3258--;
                        class253.field3256++;
                    }
                    while (class253.field3257 < 200 && class253.field3267 > 0) {
                        class249 var7 = (class249) class253.field3262.method3689();
                        class185 var8 = new class185(4);
                        var8.method3376(0);
                        var8.method3500((int) var7.field2497);
                        Statics.field3269.method3112(var8.field2415, 0, 4);
                        var7.method3851();
                        class253.field3265.method3773(var7, var7.field2497);
                        class253.field3267--;
                        class253.field3257++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field3269.method3108();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class253.field3264 = 0;
                        byte var11 = 0;
                        if (Statics.field3268 == null) {
                            var11 = 8;
                        } else if (class253.field3270 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class253.field3259.field2414;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field3269.method3111(class253.field3259.field2415, class253.field3259.field2414, var12);
                            if (class253.field3273 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class253.field3259.field2415[class253.field3259.field2414 + var13] ^= class253.field3273;
                                }
                            }
                            class253.field3259.field2414 += var12;
                            if (class253.field3259.field2414 < var11) {
                                break;
                            }
                            if (Statics.field3268 == null) {
                                class253.field3259.field2414 = 0;
                                int var14 = class253.field3259.method3344();
                                int var15 = class253.field3259.method3346();
                                int var16 = class253.field3259.method3344();
                                int var17 = class253.field3259.method3432();
                                long var18 = (long) ((var14 << 16) + var15);
                                class249 var20 = (class249) class253.field3260.method3774(var18);
                                Statics.field3274 = true;
                                if (var20 == null) {
                                    var20 = (class249) class253.field3265.method3774(var18);
                                    Statics.field3274 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field3268 = var20;
                                Statics.field359 = new class185(var17 + var21 + Statics.field3268.field3220);
                                Statics.field359.method3376(var16);
                                Statics.field359.method3422(var17);
                                class253.field3270 = 8;
                                class253.field3259.field2414 = 0;
                            } else if (class253.field3270 == 0) {
                                if (class253.field3259.field2415[0] == -1) {
                                    class253.field3270 = 1;
                                    class253.field3259.field2414 = 0;
                                } else {
                                    Statics.field3268 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field359.field2415.length - Statics.field3268.field3220;
                            int var23 = 512 - class253.field3270;
                            if (var23 > var22 - Statics.field359.field2414) {
                                var23 = var22 - Statics.field359.field2414;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field3269.method3111(Statics.field359.field2415, Statics.field359.field2414, var23);
                            if (class253.field3273 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field359.field2415[Statics.field359.field2414 + var24] ^= class253.field3273;
                                }
                            }
                            Statics.field359.field2414 += var23;
                            class253.field3270 += var23;
                            if (Statics.field359.field2414 == var22) {
                                if (Statics.field3268.field2497 == 16711935L) {
                                    Statics.field2003 = Statics.field359;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class252 var26 = class253.field3272[var25];
                                        if (var26 != null) {
                                            Statics.field2003.field2414 = var25 * 8 + 5;
                                            int var27 = Statics.field2003.method3432();
                                            int var28 = Statics.field2003.method3432();
                                            var26.method4417(var27, var28);
                                        }
                                    }
                                } else {
                                    class253.field3271.reset();
                                    class253.field3271.update(Statics.field359.field2415, 0, var22);
                                    int var29 = (int) class253.field3271.getValue();
                                    if (Statics.field3268.field3218 != var29) {
                                        try {
                                            Statics.field3269.method3113();
                                        } catch (Exception var35) {
                                        }
                                        class253.field3263++;
                                        Statics.field3269 = null;
                                        class253.field3273 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class253.field3263 = 0;
                                    class253.field3275 = 0;
                                    Statics.field3268.field3219.method4398((int) (Statics.field3268.field2497 & 0xFFFFL), Statics.field359.field2415, (Statics.field3268.field2497 & 0xFF0000L) == 16711680L, Statics.field3274);
                                }
                                Statics.field3268.method3818();
                                if (Statics.field3274) {
                                    class253.field3256--;
                                } else {
                                    class253.field3257--;
                                }
                                class253.field3270 = 0;
                                Statics.field3268 = null;
                                Statics.field359 = null;
                            } else {
                                if (class253.field3270 != 512) {
                                    break;
                                }
                                class253.field3270 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field3269.method3113();
                } catch (Exception var34) {
                }
                class253.field3275++;
                Statics.field3269 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method1096();
        }
    }

    @ObfuscatedName("client.er(I)V")
    public void method1096() {
        if (class253.field3263 >= 4) {
            this.method754("js5crc");
            field638 = 1000;
            return;
        }
        if (class253.field3275 >= 4) {
            if (field638 <= 5) {
                this.method754("js5io");
                field638 = 1000;
                return;
            }
            field662 = 3000;
            class253.field3275 = 3;
        }
        if (--field662 + 1 > 0) {
            return;
        }
        try {
            if (field661 == 0) {
                Statics.field105 = Statics.field445.method3086(Statics.field2440, Statics.field2587);
                field661++;
            }
            if (field661 == 1) {
                if (Statics.field105.field2010 == 2) {
                    this.method1111(-1);
                    return;
                }
                if (Statics.field105.field2010 == 1) {
                    field661++;
                }
            }
            if (field661 == 2) {
                if (field680) {
                    Statics.field109 = class160.method444((Socket) Statics.field105.field2012, 40000, 5000);
                } else {
                    Statics.field109 = new class164((Socket) Statics.field105.field2012, Statics.field445, 5000);
                }
                class185 var1 = new class185(5);
                var1.method3376(15);
                var1.method3422(176);
                Statics.field109.method3112(var1.field2415, 0, 5);
                field661++;
                Statics.field2357 = Statics.method1926();
            }
            if (field661 == 3) {
                if (Statics.field109.method3108() > 0 || !field680 && field638 <= 5) {
                    int var2 = Statics.field109.method3110();
                    if (var2 != 0) {
                        this.method1111(var2);
                        return;
                    }
                    field661++;
                } else if (Statics.method1926() - Statics.field2357 > 30000L) {
                    this.method1111(-2);
                    return;
                }
            }
            if (field661 == 4) {
                class160 var3 = Statics.field109;
                boolean var4 = field638 > 20;
                if (Statics.field3269 != null) {
                    try {
                        Statics.field3269.method3113();
                    } catch (Exception var14) {
                    }
                    Statics.field3269 = null;
                }
                Statics.field3269 = var3;
                Statics.method5182(var4);
                class253.field3259.field2414 = 0;
                Statics.field3268 = null;
                Statics.field359 = null;
                class253.field3270 = 0;
                while (true) {
                    class249 var6 = (class249) class253.field3260.method3781();
                    if (var6 == null) {
                        while (true) {
                            class249 var7 = (class249) class253.field3265.method3781();
                            if (var7 == null) {
                                if (class253.field3273 != 0) {
                                    try {
                                        class185 var8 = new class185(4);
                                        var8.method3376(4);
                                        var8.method3376(class253.field3273);
                                        var8.method3330(0);
                                        Statics.field3269.method3112(var8.field2415, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field3269.method3113();
                                        } catch (Exception var12) {
                                        }
                                        class253.field3275++;
                                        Statics.field3269 = null;
                                    }
                                }
                                class253.field3264 = 0;
                                Statics.field1210 = Statics.method1926();
                                Statics.field105 = null;
                                Statics.field109 = null;
                                field661 = 0;
                                field782 = 0;
                                return;
                            }
                            class253.field3262.method3684(var7);
                            class253.field3261.method3773(var7, var7.field2497);
                            class253.field3267++;
                            class253.field3257--;
                        }
                    }
                    class253.field3266.method3773(var6, var6.field2497);
                    class253.field3258++;
                    class253.field3256--;
                }
            }
        } catch (IOException var15) {
            this.method1111(-3);
        }
    }

    @ObfuscatedName("client.eq(IB)V")
    public void method1111(int arg0) {
        Statics.field105 = null;
        Statics.field109 = null;
        field661 = 0;
        if (Statics.field3844 == Statics.field2587) {
            Statics.field2587 = Statics.field508;
        } else {
            Statics.field2587 = Statics.field3844;
        }
        field782++;
        if (field782 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field638 <= 5) {
                this.method754("js5connect_full");
                field638 = 1000;
            } else {
                field662 = 3000;
            }
        } else if (field782 >= 2 && arg0 == 6) {
            this.method754("js5connect_outofdate");
            field638 = 1000;
        } else if (field782 >= 4) {
            if (field638 <= 5) {
                this.method754("js5connect");
                field638 = 1000;
            } else {
                field662 = 3000;
            }
        }
    }

    @ObfuscatedName("ei.ev(Lim;Ljava/lang/String;I)V")
    public static void method3028(class252 arg0, String arg1) {
        class54 var2 = new class54(arg0, arg1);
        field747.add(var2);
    }

    @ObfuscatedName("ay.ew(III)V")
    public static void method935(int arg0, int arg1) {
        int[] var2 = new int[9];
        for (int var3 = 0; var3 < var2.length; var3++) {
            int var4 = var3 * 32 + 128 + 15;
            int var5 = Statics.method245(var4);
            int var6 = class125.field1749[var4];
            int var7 = arg1 - 334;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 100) {
                var7 = 100;
            }
            int var8 = (field883 - field736) * var7 / 100 + field736;
            int var9 = var5 * var8 / 256;
            var2[var3] = var6 * var9 >> 16;
        }
        class128.method2770(var2, 500, 800, arg0 * 334 / arg1, 334);
    }

    @ObfuscatedName("u.ek(B)V")
    public static void method174() {
        if (field660 == 0) {
            Statics.field3406 = new class128(4, 104, 104, class51.field492);
            for (int var0 = 0; var0 < 4; var0++) {
                field688[var0] = new class167(104, 104);
            }
            Statics.field139 = new class324(512, 512);
            class80.field1151 = class240.field2991;
            class80.field1139 = 5;
            field660 = 20;
        } else if (field660 == 20) {
            class80.field1151 = class240.field3065;
            class80.field1139 = 10;
            field660 = 30;
        } else if (field660 == 30) {
            Statics.field233 = method1039(0, false, true, true);
            Statics.field254 = method1039(1, false, true, true);
            Statics.field1858 = method1039(2, true, false, true);
            Statics.field113 = method1039(3, false, true, true);
            Statics.field1940 = method1039(4, false, true, true);
            Statics.field1211 = method1039(5, true, true, true);
            Statics.field905 = method1039(6, true, true, true);
            Statics.field199 = method1039(7, false, true, true);
            Statics.field13 = method1039(8, false, true, true);
            Statics.field3198 = method1039(9, false, true, true);
            Statics.field1108 = method1039(10, false, true, true);
            Statics.field1835 = method1039(11, false, true, true);
            Statics.field1004 = method1039(12, false, true, true);
            Statics.field3405 = method1039(13, true, false, true);
            Statics.field227 = method1039(14, false, true, true);
            Statics.field1414 = method1039(15, false, true, true);
            Statics.field243 = method1039(16, true, true, true);
            Statics.field985 = method1039(17, true, true, true);
            class80.field1151 = class240.field2940;
            class80.field1139 = 20;
            field660 = 40;
        } else if (field660 == 40) {
            byte var1 = 0;
            int var2 = var1 + Statics.field233.method4405() * 4 / 100;
            int var3 = var2 + Statics.field254.method4405() * 4 / 100;
            int var4 = var3 + Statics.field1858.method4405() * 2 / 100;
            int var5 = var4 + Statics.field113.method4405() * 2 / 100;
            int var6 = var5 + Statics.field1940.method4405() * 6 / 100;
            int var7 = var6 + Statics.field1211.method4405() * 4 / 100;
            int var8 = var7 + Statics.field905.method4405() * 2 / 100;
            int var9 = var8 + Statics.field199.method4405() * 57 / 100;
            int var10 = var9 + Statics.field13.method4405() * 2 / 100;
            int var11 = var10 + Statics.field3198.method4405() * 2 / 100;
            int var12 = var11 + Statics.field1108.method4405() * 2 / 100;
            int var13 = var12 + Statics.field1835.method4405() * 2 / 100;
            int var14 = var13 + Statics.field1004.method4405() * 2 / 100;
            int var15 = var14 + Statics.field3405.method4405() * 2 / 100;
            int var16 = var15 + Statics.field227.method4405() * 2 / 100;
            int var17 = var16 + Statics.field1414.method4405() * 2 / 100;
            int var18 = var17 + Statics.field243.method4405() * 2 / 100;
            int var19 = var18 + (Statics.field985.method4396() && Statics.field985.method4294() ? 1 : 0);
            if (var19 == 100) {
                method3028(Statics.field233, "Animations");
                method3028(Statics.field254, "Skeletons");
                method3028(Statics.field1940, "Sound FX");
                method3028(Statics.field1211, "Maps");
                method3028(Statics.field905, "Music Tracks");
                method3028(Statics.field199, "Models");
                method3028(Statics.field13, "Sprites");
                method3028(Statics.field1835, "Music Jingles");
                method3028(Statics.field227, "Music Samples");
                method3028(Statics.field1414, "Music Patches");
                method3028(Statics.field243, "World Map");
                Statics.field2054 = new class312();
                Statics.field2054.method5385(Statics.field985);
                class80.field1151 = class240.field2875;
                class80.field1139 = 30;
                field660 = 45;
            } else {
                if (var19 != 0) {
                    class80.field1151 = class240.field2874 + var19 + "%";
                }
                class80.field1139 = 30;
            }
        } else if (field660 == 45) {
            class98.method1840(22050, !field634, 2);
            class221 var20 = new class221();
            var20.method3947(9, 128);
            Statics.field154 = class98.method1738(Statics.field445, 0, 22050);
            Statics.field154.method2091(var20);
            class220.method979(Statics.field1414, Statics.field227, Statics.field1940, var20);
            Statics.field3164 = class98.method1738(Statics.field445, 1, 2048);
            Statics.field3384 = new class91();
            Statics.field3164.method2091(Statics.field3384);
            Statics.field3354 = new class105(22050, Statics.field1356);
            class80.field1151 = class240.field2910;
            class80.field1139 = 35;
            field660 = 50;
            Statics.field49 = new class299(Statics.field13, Statics.field3405);
        } else if (field660 == 50) {
            class298[] var21 = new class298[] { class298.field3736, class298.field3735, class298.field3732, class298.field3731, class298.field3739, class298.field3734 };
            int var22 = var21.length;
            class299 var23 = Statics.field49;
            class298[] var24 = new class298[] { class298.field3736, class298.field3735, class298.field3732, class298.field3731, class298.field3739, class298.field3734 };
            field682 = var23.method5186(var24);
            if (field682.size() < var22) {
                class80.field1151 = class240.field2877 + field682.size() * 100 / var22 + "%";
                class80.field1139 = 40;
            } else {
                Statics.field479 = (class301) field682.get(class298.field3739);
                Statics.field576 = (class301) field682.get(class298.field3731);
                Statics.field2818 = (class301) field682.get(class298.field3732);
                Statics.field315 = field896.method5702();
                class80.field1151 = class240.field2878;
                class80.field1139 = 40;
                field660 = 60;
            }
        } else if (field660 == 60) {
            int var25 = class80.method462(Statics.field1108, Statics.field13);
            byte var26 = 11;
            if (var25 < var26) {
                class80.field1151 = class240.field2879 + var25 * 100 / var26 + "%";
                class80.field1139 = 50;
            } else {
                class80.field1151 = class240.field2880;
                class80.field1139 = 50;
                method34(5);
                field660 = 70;
            }
        } else if (field660 == 70) {
            if (Statics.field1858.method4294()) {
                class252 var28 = Statics.field1858;
                Statics.field3609 = var28;
                class252 var29 = Statics.field1858;
                Statics.field3356 = var29;
                class263.method435(Statics.field1858, Statics.field199);
                class271.method154(Statics.field1858, Statics.field199, field634);
                class274.method4274(Statics.field1858, Statics.field199);
                class252 var30 = Statics.field1858;
                Statics.field3402 = var30;
                class272.method2516(Statics.field1858, Statics.field199, field633, Statics.field479);
                class252 var31 = Statics.field1858;
                class252 var32 = Statics.field233;
                class252 var33 = Statics.field254;
                Statics.field3615 = var31;
                Statics.field3620 = var32;
                Statics.field3612 = var33;
                class252 var34 = Statics.field1858;
                class252 var35 = Statics.field199;
                Statics.field3346 = var34;
                Statics.field58 = var35;
                class252 var36 = Statics.field1858;
                Statics.field3393 = var36;
                class257.method1766(Statics.field1858);
                class233.method4192(Statics.field113, Statics.field199, Statics.field13, Statics.field3405);
                class256.method1510(Statics.field1858);
                class252 var37 = Statics.field1858;
                Statics.field3411 = var37;
                class252 var38 = Statics.field1858;
                Statics.field3323 = var38;
                class252 var39 = Statics.field1858;
                Statics.field3834 = var39;
                class252 var40 = Statics.field1858;
                Statics.field3399 = var40;
                Statics.field594 = new class85();
                class252 var41 = Statics.field1858;
                class252 var42 = Statics.field13;
                class252 var43 = Statics.field3405;
                Statics.field3425 = var41;
                Statics.field3442 = var42;
                Statics.field3420 = var43;
                class264.method2363(Statics.field1858, Statics.field13);
                class258.method3259(Statics.field1858, Statics.field13);
                class80.field1151 = class240.field2882;
                class80.field1139 = 60;
                field660 = 80;
            } else {
                class80.field1151 = class240.field2953 + Statics.field1858.method4395() + "%";
                class80.field1139 = 60;
            }
        } else if (field660 == 80) {
            int var44 = 0;
            if (Statics.field36 == null) {
                Statics.field36 = class325.method2923(Statics.field13, Statics.field2054.field3813, 0);
            } else {
                var44++;
            }
            if (Statics.field91 == null) {
                Statics.field91 = class325.method2923(Statics.field13, Statics.field2054.field3809, 0);
            } else {
                var44++;
            }
            if (Statics.field1856 == null) {
                Statics.field1856 = class325.method1631(Statics.field13, Statics.field2054.field3810, 0);
            } else {
                var44++;
            }
            if (Statics.field1933 == null) {
                Statics.field1933 = class325.method900(Statics.field13, Statics.field2054.field3816, 0);
            } else {
                var44++;
            }
            if (Statics.field1012 == null) {
                Statics.field1012 = class325.method900(Statics.field13, Statics.field2054.field3812, 0);
            } else {
                var44++;
            }
            if (Statics.field3833 == null) {
                Statics.field3833 = class325.method900(Statics.field13, Statics.field2054.field3808, 0);
            } else {
                var44++;
            }
            if (Statics.field3194 == null) {
                Statics.field3194 = class325.method900(Statics.field13, Statics.field2054.field3814, 0);
            } else {
                var44++;
            }
            if (Statics.field107 == null) {
                Statics.field107 = class325.method900(Statics.field13, Statics.field2054.field3815, 0);
            } else {
                var44++;
            }
            if (Statics.field3681 == null) {
                Statics.field3681 = class325.method900(Statics.field13, Statics.field2054.field3811, 0);
            } else {
                var44++;
            }
            if (Statics.field2354 == null) {
                Statics.field2354 = class325.method1631(Statics.field13, Statics.field2054.field3817, 0);
            } else {
                var44++;
            }
            if (Statics.field2319 == null) {
                Statics.field2319 = class325.method1631(Statics.field13, Statics.field2054.field3818, 0);
            } else {
                var44++;
            }
            if (var44 < 11) {
                class80.field1151 = class240.field2948 + var44 * 100 / 12 + "%";
                class80.field1139 = 70;
            } else {
                Statics.field3772 = Statics.field2319;
                Statics.field91.method5559();
                int var45 = (int) (Math.random() * 21.0D) - 10;
                int var46 = (int) (Math.random() * 21.0D) - 10;
                int var47 = (int) (Math.random() * 21.0D) - 10;
                int var48 = (int) (Math.random() * 41.0D) - 20;
                Statics.field1856[0].method5541(var45 + var48, var46 + var48, var47 + var48);
                class80.field1151 = class240.field2884;
                class80.field1139 = 70;
                field660 = 90;
            }
        } else if (field660 == 90) {
            if (Statics.field3198.method4294()) {
                Statics.field1087 = new class114(Statics.field3198, Statics.field13, 20, 0.8D, field634 ? 64 : 128);
                class125.method2644(Statics.field1087);
                class125.method2645(0.8D);
                field660 = 100;
            } else {
                class80.field1151 = class240.field2873 + "0%";
                class80.field1139 = 90;
            }
        } else if (field660 == 100) {
            int var49 = Statics.field1087.method2409();
            if (var49 < 100) {
                class80.field1151 = class240.field2873 + var49 + "%";
                class80.field1139 = 90;
            } else {
                class80.field1151 = class240.field3008;
                class80.field1139 = 90;
                field660 = 110;
            }
        } else if (field660 == 110) {
            Statics.field306 = new class59();
            Statics.field445.method3077(Statics.field306, 10);
            class80.field1151 = class240.field2887;
            class80.field1139 = 92;
            field660 = 120;
        } else if (field660 == 120) {
            if (Statics.field1108.method4310("huffman", "")) {
                class177 var50 = new class177(Statics.field1108.method4309("huffman", ""));
                class303.method3253(var50);
                class80.field1151 = class240.field2889;
                class80.field1139 = 94;
                field660 = 130;
            } else {
                class80.field1151 = class240.field2888 + "%";
                class80.field1139 = 94;
            }
        } else if (field660 == 130) {
            if (!Statics.field113.method4294()) {
                class80.field1151 = class240.field2890 + Statics.field113.method4395() * 4 / 5 + "%";
                class80.field1139 = 96;
            } else if (!Statics.field1004.method4294()) {
                class80.field1151 = class240.field2890 + (80 + Statics.field1004.method4395() / 6) + "%";
                class80.field1139 = 96;
            } else if (Statics.field3405.method4294()) {
                class80.field1151 = class240.field2891;
                class80.field1139 = 98;
                field660 = 140;
            } else {
                class80.field1151 = class240.field2890 + (96 + Statics.field3405.method4395() / 50) + "%";
                class80.field1139 = 96;
            }
        } else if (field660 == 140) {
            class80.field1139 = 100;
            if (Statics.field243.method4311(class30.field289.field290)) {
                if (Statics.field607 == null) {
                    Statics.field607 = new class330();
                    Statics.field607.method5725(Statics.field243, Statics.field2818, field682, Statics.field1856);
                }
                int var51 = Statics.field607.method5726();
                if (var51 < 100) {
                    class80.field1151 = class240.field2892 + (var51 * 9 / 10 + 10) + "%";
                } else {
                    class80.field1151 = class240.field2893;
                    field660 = 150;
                }
            } else {
                class80.field1151 = class240.field2892 + Statics.field243.method4304(class30.field289.field290) / 10 + "%";
            }
        } else if (field660 == 150) {
            method34(10);
        }
    }

    @ObfuscatedName("bw.ei(IZZZI)Lim;")
    public static class252 method1039(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class165 var4 = null;
        if (class158.field2033 != null) {
            var4 = new class165(arg0, class158.field2033, Statics.field55[arg0], 1000000);
        }
        return new class252(var4, Statics.field68, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.ez(B)V")
    public final void method1098() {
        class160 var1 = field861.method1957();
        class192 var2 = field861.field1281;
        try {
            if (field664 == 0) {
                if (Statics.field10 == null && (field801.method1832() || field774 > 250)) {
                    Statics.field10 = field801.method1836();
                    field801.method1831();
                    field801 = null;
                }
                if (Statics.field10 != null) {
                    if (var1 != null) {
                        var1.method3113();
                        var1 = null;
                    }
                    Statics.field702 = null;
                    field898 = false;
                    field774 = 0;
                    field664 = 1;
                }
            }
            if (field664 == 1) {
                if (Statics.field702 == null) {
                    Statics.field702 = Statics.field445.method3086(Statics.field2440, Statics.field2587);
                }
                if (Statics.field702.field2010 == 2) {
                    throw new IOException();
                }
                if (Statics.field702.field2010 == 1) {
                    if (field680) {
                        var1 = class160.method444((Socket) Statics.field702.field2012, 40000, 5000);
                    } else {
                        var1 = new class164((Socket) Statics.field702.field2012, Statics.field445, 5000);
                    }
                    field861.method1945(var1);
                    Statics.field702 = null;
                    field664 = 2;
                }
            }
            if (field664 == 2) {
                field861.method1942();
                class175 var3 = class175.method446();
                var3.field2335.method3376(class173.field2320.field2316);
                field861.method1944(var3);
                field861.method1962();
                var2.field2414 = 0;
                field664 = 3;
            }
            if (field664 == 3) {
                if (Statics.field154 != null) {
                    Statics.field154.method2092();
                }
                if (Statics.field3164 != null) {
                    Statics.field3164.method2092();
                }
                boolean var4 = true;
                if (field680 && !var1.method3119(1)) {
                    var4 = false;
                }
                if (var4) {
                    int var5 = var1.method3110();
                    if (Statics.field154 != null) {
                        Statics.field154.method2092();
                    }
                    if (Statics.field3164 != null) {
                        Statics.field3164.method2092();
                    }
                    if (var5 != 0) {
                        method111(var5);
                        return;
                    }
                    var2.field2414 = 0;
                    field664 = 4;
                }
            }
            if (field664 == 4) {
                if (var2.field2414 < 8) {
                    int var6 = var1.method3108();
                    if (var6 > 8 - var2.field2414) {
                        var6 = 8 - var2.field2414;
                    }
                    if (var6 > 0) {
                        var1.method3111(var2.field2415, var2.field2414, var6);
                        var2.field2414 += var6;
                    }
                }
                if (var2.field2414 == 8) {
                    var2.field2414 = 0;
                    Statics.field1498 = var2.method3437();
                    field664 = 5;
                }
            }
            if (field664 == 5) {
                field861.field1281.field2414 = 0;
                field861.method1942();
                class192 var7 = new class192(500);
                int[] var8 = new int[] { Statics.field10.nextInt(), Statics.field10.nextInt(), Statics.field10.nextInt(), Statics.field10.nextInt() };
                var7.field2414 = 0;
                var7.method3376(1);
                var7.method3422(var8[0]);
                var7.method3422(var8[1]);
                var7.method3422(var8[2]);
                var7.method3422(var8[3]);
                var7.method3334(Statics.field1498);
                if (field638 == 40) {
                    var7.method3422(Statics.field1840[0]);
                    var7.method3422(Statics.field1840[1]);
                    var7.method3422(Statics.field1840[2]);
                    var7.method3422(Statics.field1840[3]);
                } else {
                    var7.method3376(field668.method148());
                    switch(field668.field1967) {
                        case 0:
                            var7.field2414 += 4;
                            break;
                        case 1:
                            var7.method3422((Integer) Statics.field141.field1014.get(Statics.method5188(class80.field1150)));
                            break;
                        case 2:
                        case 3:
                            var7.method3500(Statics.field2344);
                            var7.field2414++;
                    }
                    var7.method3376(class313.field3821.method148());
                    var7.method3446(class80.field1160);
                }
                var7.method3367(class78.field1123, class78.field1121);
                Statics.field1840 = var8;
                class175 var9 = class175.method446();
                var9.field2335.field2414 = 0;
                if (field638 == 40) {
                    var9.field2335.method3376(class173.field2315.field2316);
                } else {
                    var9.field2335.method3376(class173.field2314.field2316);
                }
                var9.field2335.method3330(0);
                int var10 = var9.field2335.field2414;
                var9.field2335.method3422(176);
                var9.field2335.method3339(var7.field2415, 0, var7.field2414);
                int var11 = var9.field2335.field2414;
                var9.field2335.method3446(class80.field1150);
                var9.field2335.method3376((field844 ? 1 : 0) << 1 | (field634 ? 1 : 0));
                var9.field2335.method3330(Statics.field2652);
                var9.field2335.method3330(Statics.field253);
                class192 var12 = var9.field2335;
                if (field731 == null) {
                    byte[] var13 = new byte[24];
                    try {
                        class158.field2035.method2368(0L);
                        class158.field2035.method2354(var13);
                        int var14;
                        for (var14 = 0; var14 < 24 && var13[var14] == 0; var14++) {
                        }
                        if (var14 >= 24) {
                            throw new IOException();
                        }
                    } catch (Exception var52) {
                        for (int var16 = 0; var16 < 24; var16++) {
                            var13[var16] = -1;
                        }
                    }
                    var12.method3339(var13, 0, var13.length);
                } else {
                    var12.method3339(field731, 0, field731.length);
                }
                var9.field2335.method3446(Statics.field257);
                var9.field2335.method3422(Statics.field278);
                class185 var19 = new class185(Statics.field315.method5707());
                Statics.field315.method5705(var19);
                var9.field2335.method3339(var19.field2415, 0, var19.field2415.length);
                var9.field2335.method3376(field865);
                var9.field2335.method3422(0);
                var9.field2335.method3422(Statics.field233.field3223);
                var9.field2335.method3422(Statics.field254.field3223);
                var9.field2335.method3422(Statics.field1858.field3223);
                var9.field2335.method3422(Statics.field113.field3223);
                var9.field2335.method3422(Statics.field1940.field3223);
                var9.field2335.method3422(Statics.field1211.field3223);
                var9.field2335.method3422(Statics.field905.field3223);
                var9.field2335.method3422(Statics.field199.field3223);
                var9.field2335.method3422(Statics.field13.field3223);
                var9.field2335.method3422(Statics.field3198.field3223);
                var9.field2335.method3422(Statics.field1108.field3223);
                var9.field2335.method3422(Statics.field1835.field3223);
                var9.field2335.method3422(Statics.field1004.field3223);
                var9.field2335.method3422(Statics.field3405.field3223);
                var9.field2335.method3422(Statics.field227.field3223);
                var9.field2335.method3422(Statics.field1414.field3223);
                var9.field2335.method3422(Statics.field243.field3223);
                var9.field2335.method3422(Statics.field985.field3223);
                var9.field2335.method3365(var8, var11, var9.field2335.field2414);
                var9.field2335.method3341(var9.field2335.field2414 - var10);
                field861.method1944(var9);
                field861.method1962();
                field861.field1287 = new class193(var8);
                int[] var20 = new int[4];
                for (int var21 = 0; var21 < 4; var21++) {
                    var20[var21] = var8[var21] + 50;
                }
                var2.method3593(var20);
                field664 = 6;
            }
            if (field664 == 6 && var1.method3108() > 0) {
                int var22 = var1.method3110();
                if (var22 == 21 && field638 == 20) {
                    field664 = 9;
                } else if (var22 == 2) {
                    field664 = 11;
                } else if (var22 == 15 && field638 == 40) {
                    field861.field1285 = -1;
                    field664 = 16;
                } else if (var22 == 64) {
                    field664 = 7;
                } else if (var22 == 23 && field666 < 1) {
                    field666++;
                    field664 = 0;
                } else if (var22 == 29) {
                    field664 = 14;
                } else {
                    method111(var22);
                    return;
                }
            }
            if (field664 == 7 && var1.method3108() > 0) {
                Statics.field1919 = var1.method3110();
                field664 = 8;
            }
            if (field664 == 8 && var1.method3108() >= Statics.field1919) {
                var1.method3111(var2.field2415, 0, Statics.field1919);
                var2.field2414 = 0;
                field664 = 6;
            }
            if (field664 == 9 && var1.method3108() > 0) {
                field869 = (var1.method3110() + 3) * 60;
                field664 = 10;
            }
            if (field664 == 10) {
                field774 = 0;
                class80.method898(class240.field2963, class240.field2900, field869 / 60 + class240.field2901);
                if (--field869 <= 0) {
                    field664 = 0;
                }
            } else {
                if (field664 == 11 && var1.method3108() >= 1) {
                    Statics.field67 = var1.method3110();
                    field664 = 12;
                }
                if (field664 == 12 && var1.method3108() >= Statics.field67) {
                    boolean var23 = var1.method3110() == 1;
                    var1.method3111(var2.field2415, 0, 4);
                    var2.field2414 = 0;
                    boolean var24 = false;
                    if (var23) {
                        int var25 = var2.method3603() << 24;
                        int var26 = var25 | var2.method3603() << 16;
                        int var27 = var26 | var2.method3603() << 8;
                        int var28 = var27 | var2.method3603();
                        int var29 = Statics.method5188(class80.field1150);
                        if (Statics.field141.field1014.size() >= 10 && !Statics.field141.field1014.containsKey(var29)) {
                            Iterator var30 = Statics.field141.field1014.entrySet().iterator();
                            var30.next();
                            var30.remove();
                        }
                        Statics.field141.field1014.put(var29, var28);
                    }
                    if (field669) {
                        Statics.field141.field1019 = class80.field1150;
                    } else {
                        Statics.field141.field1019 = null;
                    }
                    class68.method614();
                    field740 = var1.method3110();
                    field727 = var1.method3110() == 1;
                    field663 = var1.method3110();
                    field663 <<= 0x8;
                    field663 += var1.method3110();
                    field748 = var1.method3110();
                    var1.method3111(var2.field2415, 0, 1);
                    var2.field2414 = 0;
                    class171[] var31 = class171.method658();
                    int var32 = var2.method3608();
                    if (var32 < 0 || var32 >= var31.length) {
                        throw new IOException(var32 + " " + var2.field2414);
                    }
                    field861.field1276 = var31[var32];
                    field861.field1285 = field861.field1276.field2147;
                    var1.method3111(var2.field2415, 0, 2);
                    var2.field2414 = 0;
                    field861.field1285 = var2.method3346();
                    try {
                        client var33 = Statics.field1133;
                        JSObject.getWindow(var33).call("zap", (Object[]) null);
                    } catch (Throwable var51) {
                    }
                    field664 = 13;
                }
                if (field664 != 13) {
                    if (field664 == 14 && var1.method3108() >= 2) {
                        var2.field2414 = 0;
                        var1.method3111(var2.field2415, 0, 2);
                        var2.field2414 = 0;
                        Statics.field398 = var2.method3346();
                        field664 = 15;
                    }
                    if (field664 == 15 && var1.method3108() >= Statics.field398) {
                        var2.field2414 = 0;
                        var1.method3111(var2.field2415, 0, Statics.field398);
                        var2.field2414 = 0;
                        String var46 = var2.method3353();
                        String var47 = var2.method3353();
                        String var48 = var2.method3353();
                        class80.method898(var46, var47, var48);
                        method34(10);
                    }
                    if (field664 == 16) {
                        if (field861.field1285 == -1) {
                            if (var1.method3108() < 2) {
                                return;
                            }
                            var1.method3111(var2.field2415, 0, 2);
                            var2.field2414 = 0;
                            field861.field1285 = var2.method3346();
                        }
                        if (var1.method3108() >= field861.field1285) {
                            var1.method3111(var2.field2415, 0, field861.field1285);
                            var2.field2414 = 0;
                            int var49 = field861.field1285;
                            field875.method4963();
                            method993();
                            class84.method478(var2);
                            if (var2.field2414 != var49) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field774++;
                        if (field774 > 2000) {
                            if (field666 < 1) {
                                if (Statics.field3844 == Statics.field2587) {
                                    Statics.field2587 = Statics.field508;
                                } else {
                                    Statics.field2587 = Statics.field3844;
                                }
                                field666++;
                                field664 = 0;
                            } else {
                                method111(-3);
                            }
                        }
                    }
                } else if (var1.method3108() >= field861.field1285) {
                    var2.field2414 = 0;
                    var1.method3111(var2.field2415, 0, field861.field1285);
                    field875.method4950();
                    field643 = 1L;
                    Statics.field306.field579 = 0;
                    Statics.field2088 = true;
                    field655 = true;
                    field854 = -1L;
                    class319.field3845 = new class206();
                    field861.method1942();
                    field861.field1281.field2414 = 0;
                    field861.field1276 = null;
                    field861.field1286 = null;
                    field861.field1275 = null;
                    field861.field1288 = null;
                    field861.field1285 = 0;
                    field861.field1284 = 0;
                    field649 = 0;
                    field775 = 0;
                    field650 = 0;
                    field767 = 0;
                    field837 = false;
                    class49.method2945(0);
                    class86.field1241.clear();
                    class86.field1240.method3709();
                    class86.field1242.method3897();
                    class86.field1243 = 0;
                    field783 = 0;
                    field785 = false;
                    field868 = 0;
                    field700 = 0;
                    field705 = 0;
                    Statics.field505 = null;
                    field888 = 0;
                    field671 = -1;
                    field693 = 0;
                    field891 = 0;
                    field658 = class79.field1130;
                    field651 = class79.field1130;
                    field673 = 0;
                    class84.method91();
                    for (int var35 = 0; var35 < 2048; var35++) {
                        field746[var35] = null;
                    }
                    for (int var36 = 0; var36 < 32768; var36++) {
                        field672[var36] = null;
                    }
                    field820 = -1;
                    field760.method3844();
                    field761.method3844();
                    for (int var37 = 0; var37 < 4; var37++) {
                        for (int var38 = 0; var38 < 104; var38++) {
                            for (int var39 = 0; var39 < 104; var39++) {
                                field659[var37][var38][var39] = null;
                            }
                        }
                    }
                    field759 = new class208();
                    Statics.field1863.method1570();
                    for (int var40 = 0; var40 < Statics.field3300; var40++) {
                        class257 var41 = class257.method3019(var40);
                        if (var41 != null) {
                            class228.field2626[var40] = 0;
                            class228.field2628[var40] = 0;
                        }
                    }
                    Statics.field594.method1891();
                    field800 = -1;
                    if (field790 != -1) {
                        class233.method191(field790);
                    }
                    for (class57 var42 = (class57) field889.method3781(); var42 != null; var42 = (class57) field889.method3777()) {
                        method4843(var42, true);
                    }
                    field790 = -1;
                    field889 = new class205(8);
                    field796 = null;
                    field767 = 0;
                    field837 = false;
                    field752.method4175((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var43 = 0; var43 < 8; var43++) {
                        field754[var43] = null;
                        field755[var43] = false;
                    }
                    class55.field529 = new class205(32);
                    field692 = true;
                    for (int var44 = 0; var44 < 100; var44++) {
                        field828[var44] = true;
                    }
                    method4127();
                    Statics.field2353 = null;
                    for (int var45 = 0; var45 < 8; var45++) {
                        field897[var45] = new class5();
                    }
                    Statics.field1764 = null;
                    class84.method478(var2);
                    Statics.field557 = -1;
                    method4520(false, var2);
                    field861.field1276 = null;
                }
            }
        } catch (IOException var53) {
            if (field666 < 1) {
                if (Statics.field3844 == Statics.field2587) {
                    Statics.field2587 = Statics.field508;
                } else {
                    Statics.field2587 = Statics.field3844;
                }
                field666++;
                field664 = 0;
            } else {
                method111(-2);
            }
        }
    }

    @ObfuscatedName("bs.eh(I)V")
    public static void method993() {
        field861.method1942();
        field861.field1281.field2414 = 0;
        field861.field1276 = null;
        field861.field1286 = null;
        field861.field1275 = null;
        field861.field1288 = null;
        field861.field1285 = 0;
        field861.field1284 = 0;
        field649 = 0;
        field767 = 0;
        field837 = false;
        field888 = 0;
        field693 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field746[var0] = null;
        }
        Statics.field138 = null;
        for (int var1 = 0; var1 < field672.length; var1++) {
            class74 var2 = field672[var1];
            if (var2 != null) {
                var2.field951 = -1;
                var2.field949 = false;
            }
        }
        class55.field529 = new class205(32);
        method34(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field828[var3] = true;
        }
        method4127();
    }

    @ObfuscatedName("x.en(II)V")
    public static void method111(int arg0) {
        if (arg0 == -3) {
            class80.method898(class240.field3073, class240.field2903, class240.field2904);
        } else if (arg0 == -2) {
            class80.method898(class240.field2937, class240.field2906, class240.field2979);
        } else if (arg0 == -1) {
            class80.method898(class240.field2908, class240.field2909, class240.field3011);
        } else if (arg0 == 3) {
            class80.field1162 = 3;
            class80.field1153 = 1;
        } else if (arg0 == 4) {
            class80.field1162 = 12;
            class80.field1135 = 0;
        } else if (arg0 == 5) {
            class80.field1153 = 2;
            class80.method898(class240.field2965, class240.field2915, class240.field3080);
        } else if (arg0 == 6) {
            class80.method898(class240.field2917, class240.field2918, class240.field2919);
        } else if (arg0 == 7) {
            class80.method898(class240.field2872, class240.field2921, class240.field2914);
        } else if (arg0 == 8) {
            class80.method898(class240.field2923, class240.field2924, class240.field2942);
        } else if (arg0 == 9) {
            class80.method898(class240.field2926, class240.field2989, class240.field2934);
        } else if (arg0 == 10) {
            class80.method898(class240.field2929, class240.field2930, class240.field3152);
        } else if (arg0 == 11) {
            class80.method898(class240.field2932, class240.field2933, class240.field3023);
        } else if (arg0 == 12) {
            class80.method898(class240.field2935, class240.field2936, class240.field2968);
        } else if (arg0 == 13) {
            class80.method898(class240.field2938, class240.field3137, class240.field2869);
        } else if (arg0 == 14) {
            class80.method898(class240.field2941, class240.field3140, class240.field3078);
        } else if (arg0 == 16) {
            class80.method898(class240.field2944, class240.field2945, class240.field3117);
        } else if (arg0 == 17) {
            class80.method898(class240.field2947, class240.field3135, class240.field2949);
        } else if (arg0 == 18) {
            class80.field1162 = 12;
            class80.field1135 = 1;
        } else if (arg0 == 19) {
            class80.method898(class240.field3062, class240.field3046, class240.field2955);
        } else if (arg0 == 20) {
            class80.method898(class240.field2956, class240.field2957, class240.field2958);
        } else if (arg0 == 22) {
            class80.method898(class240.field2959, class240.field2960, class240.field2961);
        } else if (arg0 == 23) {
            class80.method898(class240.field2962, class240.field3104, class240.field3125);
        } else if (arg0 == 24) {
            class80.method898(class240.field2907, class240.field2988, class240.field2967);
        } else if (arg0 == 25) {
            class80.method898(class240.field3147, class240.field2969, class240.field2970);
        } else if (arg0 == 26) {
            class80.method898(class240.field3013, class240.field2972, class240.field2922);
        } else if (arg0 == 27) {
            class80.method898(class240.field3043, class240.field2975, class240.field2899);
        } else if (arg0 == 31) {
            class80.method898(class240.field2983, class240.field3081, class240.field3111);
        } else if (arg0 == 32) {
            class80.method898(class240.field2986, class240.field2987, class240.field3024);
        } else if (arg0 == 37) {
            class80.method898(class240.field3121, class240.field2990, class240.field2977);
        } else if (arg0 == 38) {
            class80.method898(class240.field2992, class240.field3142, class240.field2881);
        } else if (arg0 == 55) {
            class80.field1162 = 8;
        } else if (arg0 == 56) {
            class80.method898(class240.field2999, class240.field3000, class240.field3001);
            method34(11);
            return;
        } else if (arg0 == 57) {
            class80.method898(class240.field3089, class240.field3003, class240.field3004);
            method34(11);
            return;
        } else if (arg0 == 61) {
            class80.field1162 = 7;
        } else {
            class80.method898(class240.field3005, class240.field3036, class240.field3007);
        }
        method34(10);
    }

    @ObfuscatedName("er.ep(I)V")
    public static final void method3000() {
        field861.method1963();
        class275.method4101();
        class262.method5185();
        class263.method1781();
        class271.field3469.method3740();
        class271.field3456.method3740();
        class271.field3451.method3740();
        class271.field3452.method3740();
        class274.method4511();
        class272.field3518.method3740();
        class272.field3498.method3740();
        class272.field3526.method3740();
        class276.method93();
        class261.method2378();
        class266.field3388.method3740();
        class257.field3296.method3740();
        class270.method2968();
        class264.method4037();
        class268.field3404.method3740();
        Statics.method2904();
        class258.field3304.method3740();
        class230.field2646.method3740();
        class233.method3309();
        ((class114) Statics.field1724).method2414();
        class87.field1256.method3740();
        Statics.field233.method4305();
        Statics.field254.method4305();
        Statics.field113.method4305();
        Statics.field1940.method4305();
        Statics.field1211.method4305();
        Statics.field905.method4305();
        Statics.field199.method4305();
        Statics.field13.method4305();
        Statics.field3198.method4305();
        Statics.field1108.method4305();
        Statics.field1835.method4305();
        Statics.field1004.method4305();
        Statics.field3406.method2723();
        for (int var0 = 0; var0 < 4; var0++) {
            field688[var0].method3192();
        }
        System.gc();
        class220.method2909(2);
        field805 = -1;
        field870 = false;
        for (class70 var1 = (class70) class70.field1044.method3827(); var1 != null; var1 = (class70) class70.field1044.method3829()) {
            if (var1.field1040 != null) {
                Statics.field3384.method1969(var1.field1040);
                var1.field1040 = null;
            }
            if (var1.field1045 != null) {
                Statics.field3384.method1969(var1.field1045);
                var1.field1045 = null;
            }
        }
        class70.field1044.method3844();
        method34(10);
    }

    @ObfuscatedName("jn.ed(I)V")
    public static final void method4575() {
        if (field775 > 0) {
            method3000();
        } else {
            field875.method4959();
            method34(40);
            Statics.field2311 = field861.method1957();
            field861.method1947();
        }
    }

    @ObfuscatedName("ja.fd(ZI)V")
    public static final void method4990(boolean arg0) {
        if (arg0) {
            field668 = class80.field1163 ? class149.field1966 : class149.field1969;
        } else {
            field668 = Statics.field141.field1014.containsKey(Statics.method5188(class80.field1150)) ? class149.field1971 : class149.field1968;
        }
    }

    @ObfuscatedName("client.fk(B)V")
    public final void method1099() {
        if (field649 > 1) {
            field649--;
        }
        if (field775 > 0) {
            field775--;
        }
        if (field898) {
            field898 = false;
            method4575();
            return;
        }
        if (!field837) {
            method149();
        }
        for (int var1 = 0; var1 < 100 && this.method1102(field861); var1++) {
        }
        if (field638 != 30) {
            return;
        }
        while (class319.method3225()) {
            class175 var2 = class175.method85(class172.field2299, field861.field1287);
            var2.field2335.method3376(0);
            int var3 = var2.field2335.field2414;
            class319.method436(var2.field2335);
            var2.field2335.method3342(var2.field2335.field2414 - var3);
            field861.method1944(var2);
        }
        if (field875.field3675) {
            class175 var4 = class175.method85(class172.field2212, field861.field1287);
            var4.field2335.method3376(0);
            int var5 = var4.field2335.field2414;
            field875.method4949(var4.field2335);
            var4.field2335.method3342(var4.field2335.field2414 - var5);
            field861.method1944(var4);
            field875.method4947();
        }
        Object var6 = Statics.field306.field581;
        synchronized (Statics.field306.field581) {
            if (!field629) {
                Statics.field306.field579 = 0;
            } else if (class49.field468 != 0 || Statics.field306.field579 >= 40) {
                class175 var7 = null;
                int var8 = 0;
                int var9 = 0;
                int var10 = 0;
                int var11 = 0;
                for (int var12 = 0; var12 < Statics.field306.field579 && (var7 == null || var7.field2335.field2414 - var8 < 246); var12++) {
                    var9 = var12;
                    int var13 = Statics.field306.field577[var12];
                    if (var13 < -1) {
                        var13 = -1;
                    } else if (var13 > 65534) {
                        var13 = 65534;
                    }
                    int var14 = Statics.field306.field580[var12];
                    if (var14 < -1) {
                        var14 = -1;
                    } else if (var14 > 65534) {
                        var14 = 65534;
                    }
                    if (field644 != var14 || field628 != var13) {
                        if (var7 == null) {
                            var7 = class175.method85(class172.field2242, field861.field1287);
                            var7.field2335.method3376(0);
                            var8 = var7.field2335.field2414;
                            var7.field2335.field2414 += 2;
                            var10 = 0;
                            var11 = 0;
                        }
                        int var15;
                        int var16;
                        int var17;
                        if (field646 == -1L) {
                            var15 = var14;
                            var16 = var13;
                            var17 = Integer.MAX_VALUE;
                        } else {
                            var15 = var14 - field644;
                            var16 = var13 - field628;
                            var17 = (int) ((Statics.field306.field578[var12] - field646) / 20L);
                            var10 = (int) ((Statics.field306.field578[var12] - field646) % 20L + (long) var10);
                        }
                        field644 = var14;
                        field628 = var13;
                        if (var17 < 8 && var15 >= -32 && var15 <= 31 && var16 >= -32 && var16 <= 31) {
                            var15 += 32;
                            var16 += 32;
                            var7.field2335.method3330((var15 << 6) + (var17 << 12) + var16);
                        } else if (var17 < 32 && var15 >= -128 && var15 <= 127 && var16 >= -128 && var16 <= 127) {
                            var15 += 128;
                            var16 += 128;
                            var7.field2335.method3376(var17 + 128);
                            var7.field2335.method3330((var15 << 8) + var16);
                        } else if (var17 < 32) {
                            var7.field2335.method3376(var17 + 192);
                            if (var14 == -1 || var13 == -1) {
                                var7.field2335.method3422(Integer.MIN_VALUE);
                            } else {
                                var7.field2335.method3422(var14 | var13 << 16);
                            }
                        } else {
                            var7.field2335.method3330((var17 & 0x1FFF) + 57344);
                            if (var14 == -1 || var13 == -1) {
                                var7.field2335.method3422(Integer.MIN_VALUE);
                            } else {
                                var7.field2335.method3422(var14 | var13 << 16);
                            }
                        }
                        var11++;
                        field646 = Statics.field306.field578[var12];
                    }
                }
                if (var7 != null) {
                    var7.field2335.method3342(var7.field2335.field2414 - var8);
                    int var18 = var7.field2335.field2414;
                    var7.field2335.field2414 = var8;
                    var7.field2335.method3376(var10 / var11);
                    var7.field2335.method3376(var10 % var11);
                    var7.field2335.field2414 = var18;
                    field861.method1944(var7);
                }
                if (var9 >= Statics.field306.field579) {
                    Statics.field306.field579 = 0;
                } else {
                    Statics.field306.field579 -= var9;
                    System.arraycopy(Statics.field306.field580, var9, Statics.field306.field580, 0, Statics.field306.field579);
                    System.arraycopy(Statics.field306.field577, var9, Statics.field306.field577, 0, Statics.field306.field579);
                    System.arraycopy(Statics.field306.field578, var9, Statics.field306.field578, 0, Statics.field306.field579);
                }
            }
        }
        if (class49.field468 == 1 || !Statics.field43 && class49.field468 == 4 || class49.field468 == 2) {
            long var20 = (class49.field471 - field643 * -1L) / 50L;
            if (var20 > 4095L) {
                var20 = 4095L;
            }
            field643 = class49.field471 * -1L;
            int var22 = class49.field470;
            if (var22 < 0) {
                var22 = 0;
            } else if (var22 > Statics.field253) {
                var22 = Statics.field253;
            }
            int var23 = class49.field466;
            if (var23 < 0) {
                var23 = 0;
            } else if (var23 > Statics.field2652) {
                var23 = Statics.field2652;
            }
            int var24 = (int) var20;
            class175 var25 = class175.method85(class172.field2271, field861.field1287);
            var25.field2335.method3330((var24 << 1) + (class49.field468 == 2 ? 1 : 0));
            var25.field2335.method3330(var23);
            var25.field2335.method3330(var22);
            field861.method1944(var25);
        }
        if (class40.field380 > 0) {
            class175 var26 = class175.method85(class172.field2263, field861.field1287);
            var26.field2335.method3330(0);
            int var27 = var26.field2335.field2414;
            long var28 = Statics.method1926();
            for (int var30 = 0; var30 < class40.field380; var30++) {
                long var31 = var28 - field854;
                if (var31 > 16777215L) {
                    var31 = 16777215L;
                }
                field854 = var28;
                var26.field2335.method3371(class40.field379[var30]);
                var26.field2335.method3500((int) var31);
            }
            var26.field2335.method3341(var26.field2335.field2414 - var27);
            field861.method1944(var26);
        }
        if (field691 > 0) {
            field691--;
        }
        if (class40.field373[96] || class40.field373[97] || class40.field373[98] || class40.field373[99]) {
            field715 = true;
        }
        if (field715 && field691 <= 0) {
            field691 = 20;
            field715 = false;
            class175 var33 = class175.method85(class172.field2247, field861.field1287);
            var33.field2335.method3457(field699);
            var33.field2335.method3343(field700);
            field861.method1944(var33);
        }
        if (Statics.field2088 && !field655) {
            field655 = true;
            class175 var34 = class175.method85(class172.field2260, field861.field1287);
            var34.field2335.method3376(1);
            field861.method1944(var34);
        }
        if (!Statics.field2088 && field655) {
            field655 = false;
            class175 var35 = class175.method85(class172.field2260, field861.field1287);
            var35.field2335.method3376(0);
            field861.method1944(var35);
        }
        if (Statics.field607 != null) {
            Statics.field607.method5727();
        }
        if (Statics.field2811) {
            if (Statics.field2353 != null) {
                Statics.field2353.method5047();
            }
            for (int var36 = 0; var36 < class84.field1216; var36++) {
                class62 var37 = field746[class84.field1217[var36]];
                var37.method1044();
            }
            Statics.field2811 = false;
        }
        if (Statics.field1983 != field671) {
            field671 = Statics.field1983;
            int var38 = Statics.field1983;
            int[] var39 = Statics.field139.field3873;
            int var40 = var39.length;
            for (int var41 = 0; var41 < var40; var41++) {
                var39[var41] = 0;
            }
            for (int var42 = 1; var42 < 103; var42++) {
                int var43 = (103 - var42) * 2048 + 24628;
                for (int var44 = 1; var44 < 103; var44++) {
                    if ((class51.field482[var38][var44][var42] & 0x18) == 0) {
                        Statics.field3406.method2757(var39, var43, 512, var38, var44, var42);
                    }
                    if (var38 < 3 && (class51.field482[var38 + 1][var44][var42] & 0x8) != 0) {
                        Statics.field3406.method2757(var39, var43, 512, var38 + 1, var44, var42);
                    }
                    var43 += 4;
                }
            }
            int var45 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
            int var46 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
            Statics.field139.method5656();
            for (int var47 = 1; var47 < 103; var47++) {
                for (int var48 = 1; var48 < 103; var48++) {
                    if ((class51.field482[var38][var48][var47] & 0x18) == 0) {
                        method4254(var38, var48, var47, var45, var46);
                    }
                    if (var38 < 3 && (class51.field482[var38 + 1][var48][var47] & 0x8) != 0) {
                        method4254(var38 + 1, var48, var47, var45, var46);
                    }
                }
            }
            field856 = 0;
            for (int var49 = 0; var49 < 104; var49++) {
                for (int var50 = 0; var50 < 104; var50++) {
                    long var51 = Statics.field3406.method2790(Statics.field1983, var49, var50);
                    if (var51 != 0L) {
                        int var53 = class123.method1777(var51);
                        int var54 = class271.method1776(var53).field3447;
                        if (var54 >= 0) {
                            field859[field856] = class258.method3139(var54).method4489(false);
                            field667[field856] = var49;
                            field858[field856] = var50;
                            field856++;
                        }
                    }
                }
            }
            Statics.field1916.method5535();
        }
        if (field638 != 30) {
            return;
        }
        method4677();
        Statics.method4186();
        field861.field1284++;
        if (field861.field1284 > 750) {
            method4575();
            return;
        }
        method659();
        for (int var55 = 0; var55 < field673; var55++) {
            int var56 = field674[var55];
            class74 var57 = field672[var56];
            if (var57 != null) {
                method58(var57, var57.field1091.field3565);
            }
        }
        int[] var58 = class84.field1217;
        for (int var59 = 0; var59 < class84.field1216; var59++) {
            class62 var60 = field746[var58[var59]];
            if (var60 != null && var60.field934 > 0) {
                var60.field934--;
                if (var60.field934 == 0) {
                    var60.field938 = null;
                }
            }
        }
        for (int var61 = 0; var61 < field673; var61++) {
            int var62 = field674[var61];
            class74 var63 = field672[var62];
            if (var63 != null && var63.field934 > 0) {
                var63.field934--;
                if (var63.field934 == 0) {
                    var63.field938 = null;
                }
            }
        }
        field887++;
        if (field734 != 0) {
            field722 += 20;
            if (field722 >= 400) {
                field734 = 0;
            }
        }
        if (Statics.field179 != null) {
            field908++;
            if (field908 >= 15) {
                method272(Statics.field179);
                Statics.field179 = null;
            }
        }
        class233 var64 = Statics.field2077;
        class233 var65 = Statics.field2042;
        Statics.field2077 = null;
        Statics.field2042 = null;
        field807 = null;
        field811 = false;
        field808 = false;
        field892 = 0;
        while (class40.method3233() && field892 < 128) {
            if (field740 >= 2 && class40.field373[82] && Statics.field241 == 66) {
                String var66 = "";
                Iterator var67 = class86.field1240.iterator();
                while (var67.hasNext()) {
                    class60 var68 = (class60) var67.next();
                    var66 = var66 + var68.field588 + ':' + var68.field586 + '\n';
                }
                Statics.field1133.method731(var66);
            } else if (field705 != 1 || Statics.field3345 <= 0) {
                field853[field892] = Statics.field241;
                field852[field892] = Statics.field3345;
                field892++;
            }
        }
        if (method4426() && class40.field373[82] && class40.field373[81] && field872 != 0) {
            int var71 = Statics.field138.field600 - field872;
            if (var71 < 0) {
                var71 = 0;
            } else if (var71 > 3) {
                var71 = 3;
            }
            if (Statics.field138.field600 != var71) {
                int var72 = Statics.field321 + Statics.field138.field954[0];
                int var73 = Statics.field2611 + Statics.field138.field981[0];
                class175 var74 = class175.method85(class172.field2269, field861.field1287);
                var74.field2335.method3389(0);
                var74.field2335.method3343(var73);
                var74.field2335.method3371(var71);
                var74.field2335.method3330(var72);
                field861.method1944(var74);
            }
            field872 = 0;
        }
        if (field790 != -1) {
            method118(field790, 0, 0, Statics.field2652, Statics.field253, 0, 0);
        }
        field815++;
        while (true) {
            class58 var75;
            class233 var76;
            class233 var77;
            do {
                var75 = (class58) field830.method3822();
                if (var75 == null) {
                    while (true) {
                        class58 var78;
                        class233 var79;
                        class233 var80;
                        do {
                            var78 = (class58) field831.method3822();
                            if (var78 == null) {
                                while (true) {
                                    class58 var81;
                                    class233 var82;
                                    class233 var83;
                                    do {
                                        var81 = (class58) field709.method3822();
                                        if (var81 == null) {
                                            this.method1103();
                                            if (Statics.field607 != null) {
                                                Statics.field607.method5737(Statics.field1983, (Statics.field138.field943 >> 7) + Statics.field321, (Statics.field138.field925 >> 7) + Statics.field2611, false);
                                                Statics.field607.method5770();
                                            }
                                            if (field803 != null) {
                                                this.method1108();
                                            }
                                            if (Statics.field1497 != null) {
                                                method272(Statics.field1497);
                                                field743++;
                                                if (class49.field469 == 0) {
                                                    if (field742) {
                                                        if (Statics.field2310 == Statics.field1497 && field741 != field738) {
                                                            class233 var84 = Statics.field1497;
                                                            byte var85 = 0;
                                                            if (field795 == 1 && var84.field2672 == 206) {
                                                                var85 = 1;
                                                            }
                                                            if (var84.field2792[field741] <= 0) {
                                                                var85 = 0;
                                                            }
                                                            int var86 = method2995(var84);
                                                            boolean var87 = (var86 >> 29 & 0x1) != 0;
                                                            if (var87) {
                                                                int var88 = field738;
                                                                int var89 = field741;
                                                                var84.field2792[var89] = var84.field2792[var88];
                                                                var84.field2806[var89] = var84.field2806[var88];
                                                                var84.field2792[var88] = -1;
                                                                var84.field2806[var88] = 0;
                                                            } else if (var85 == 1) {
                                                                int var90 = field738;
                                                                int var91 = field741;
                                                                while (var90 != var91) {
                                                                    if (var90 > var91) {
                                                                        var84.method4204(var90 - 1, var90);
                                                                        var90--;
                                                                    } else if (var90 < var91) {
                                                                        var84.method4204(var90 + 1, var90);
                                                                        var90++;
                                                                    }
                                                                }
                                                            } else {
                                                                var84.method4204(field741, field738);
                                                            }
                                                            class175 var92 = class175.method85(class172.field2288, field861.field1287);
                                                            var92.field2335.method3330(field741);
                                                            var92.field2335.method3343(field738);
                                                            var92.field2335.method3422(Statics.field1497.field2731);
                                                            var92.field2335.method3371(var85);
                                                            field861.method1944(var92);
                                                        }
                                                    } else if (this.method1104()) {
                                                        this.method1154(field739, field829);
                                                    } else if (field767 > 0) {
                                                        int var93 = field739;
                                                        int var94 = field829;
                                                        method937(Statics.field560, var93, var94);
                                                        Statics.field560 = null;
                                                    }
                                                    field908 = 10;
                                                    class49.field468 = 0;
                                                    Statics.field1497 = null;
                                                } else if (field743 >= 5 && (class49.field461 > field739 + 5 || class49.field461 < field739 - 5 || class49.field462 > field829 + 5 || class49.field462 < field829 - 5)) {
                                                    field742 = true;
                                                }
                                            }
                                            if (class128.method2762()) {
                                                int var95 = class128.field1780;
                                                int var96 = class128.field1802;
                                                class175 var97 = class175.method85(class172.field2304, field861.field1287);
                                                var97.field2335.method3376(5);
                                                var97.field2335.method3380(Statics.field2611 + var96);
                                                var97.field2335.method3380(Statics.field321 + var95);
                                                var97.field2335.method3370(class40.field373[82] ? (class40.field373[81] ? 2 : 1) : 0);
                                                field861.method1944(var97);
                                                class128.method2835();
                                                field847 = class49.field466;
                                                field732 = class49.field470;
                                                field734 = 1;
                                                field722 = 0;
                                                field693 = var95;
                                                field891 = var96;
                                            }
                                            if (Statics.field2077 != var64) {
                                                if (var64 != null) {
                                                    method272(var64);
                                                }
                                                if (Statics.field2077 != null) {
                                                    method272(Statics.field2077);
                                                }
                                            }
                                            if (Statics.field2042 != var65 && field851 == field809) {
                                                if (var65 != null) {
                                                    method272(var65);
                                                }
                                                if (Statics.field2042 != null) {
                                                    method272(Statics.field2042);
                                                }
                                            }
                                            if (Statics.field2042 == null) {
                                                if (field851 > 0) {
                                                    field851--;
                                                }
                                            } else if (field851 < field809) {
                                                field851++;
                                                if (field851 == field809) {
                                                    method272(Statics.field2042);
                                                }
                                            }
                                            if (field705 == 0) {
                                                int var98 = Statics.field138.field943;
                                                int var99 = Statics.field138.field925;
                                                if (Statics.field592 - var98 < -500 || Statics.field592 - var98 > 500 || Statics.field2056 - var99 < -500 || Statics.field2056 - var99 > 500) {
                                                    Statics.field592 = var98;
                                                    Statics.field2056 = var99;
                                                }
                                                if (Statics.field592 != var98) {
                                                    Statics.field592 += (var98 - Statics.field592) / 16;
                                                }
                                                if (Statics.field2056 != var99) {
                                                    Statics.field2056 += (var99 - Statics.field2056) / 16;
                                                }
                                                int var100 = Statics.field592 >> 7;
                                                int var101 = Statics.field2056 >> 7;
                                                int var102 = method701(Statics.field592, Statics.field2056, Statics.field1983);
                                                int var103 = 0;
                                                if (var100 > 3 && var101 > 3 && var100 < 100 && var101 < 100) {
                                                    for (int var104 = var100 - 4; var104 <= var100 + 4; var104++) {
                                                        for (int var105 = var101 - 4; var105 <= var101 + 4; var105++) {
                                                            int var106 = Statics.field1983;
                                                            if (var106 < 3 && (class51.field482[1][var104][var105] & 0x2) == 2) {
                                                                var106++;
                                                            }
                                                            int var107 = var102 - class51.field492[var106][var104][var105];
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
                                                if (var108 > field744) {
                                                    field744 += (var108 - field744) / 24;
                                                } else if (var108 < field744) {
                                                    field744 += (var108 - field744) / 80;
                                                }
                                                Statics.field2026 = method701(Statics.field138.field943, Statics.field138.field925, Statics.field1983) - field706;
                                            } else if (field705 == 1) {
                                                if (field713 && Statics.field138 != null) {
                                                    int var109 = Statics.field138.field954[0];
                                                    int var110 = Statics.field138.field981[0];
                                                    if (var109 >= 0 && var110 >= 0 && var109 < 104 && var110 < 104) {
                                                        Statics.field592 = Statics.field138.field943;
                                                        int var111 = method701(Statics.field138.field943, Statics.field138.field925, Statics.field1983) - field706;
                                                        if (var111 < Statics.field2026) {
                                                            Statics.field2026 = var111;
                                                        }
                                                        Statics.field2056 = Statics.field138.field925;
                                                        field713 = false;
                                                    }
                                                }
                                                short var112 = -1;
                                                if (class40.field373[33]) {
                                                    var112 = 0;
                                                } else if (class40.field373[49]) {
                                                    var112 = 1024;
                                                }
                                                if (class40.field373[48]) {
                                                    if (var112 == 0) {
                                                        var112 = 1792;
                                                    } else if (var112 == 1024) {
                                                        var112 = 1280;
                                                    } else {
                                                        var112 = 1536;
                                                    }
                                                } else if (class40.field373[50]) {
                                                    if (var112 == 0) {
                                                        var112 = 256;
                                                    } else if (var112 == 1024) {
                                                        var112 = 768;
                                                    } else {
                                                        var112 = 512;
                                                    }
                                                }
                                                byte var113 = 0;
                                                if (class40.field373[35]) {
                                                    var113 = -1;
                                                } else if (class40.field373[51]) {
                                                    var113 = 1;
                                                }
                                                int var114 = 0;
                                                if (var112 >= 0 || var113 != 0) {
                                                    int var115 = class40.field373[81] ? field711 : field710;
                                                    var114 = var115 * 16;
                                                    field708 = var112;
                                                    field670 = var113;
                                                }
                                                if (field880 < var114) {
                                                    field880 += var114 / 8;
                                                    if (field880 > var114) {
                                                        field880 = var114;
                                                    }
                                                } else if (field880 > var114) {
                                                    field880 = field880 * 9 / 10;
                                                }
                                                if (field880 > 0) {
                                                    int var116 = field880 / 16;
                                                    if (field708 >= 0) {
                                                        int var117 = field708 - Statics.field3385 & 0x7FF;
                                                        int var118 = class125.field1749[var117];
                                                        int var119 = class125.field1743[var117];
                                                        Statics.field592 += var116 * var118 / 65536;
                                                        Statics.field2056 += var116 * var119 / 65536;
                                                    }
                                                    if (field670 != 0) {
                                                        Statics.field2026 += field670 * var116;
                                                        if (Statics.field2026 > 0) {
                                                            Statics.field2026 = 0;
                                                        }
                                                    }
                                                } else {
                                                    field708 = -1;
                                                    field670 = -1;
                                                }
                                                if (class40.field373[13]) {
                                                    field861.method1944(class175.method85(class172.field2227, field861.field1287));
                                                    field705 = 0;
                                                }
                                            }
                                            if (class49.field469 == 4 && Statics.field43) {
                                                int var120 = class49.field462 - field704;
                                                field641 = var120 * 2;
                                                field704 = var120 == -1 || var120 == 1 ? class49.field462 : (field704 + class49.field462) / 2;
                                                int var121 = field716 - class49.field461;
                                                field701 = var121 * 2;
                                                field716 = var121 == -1 || var121 == 1 ? class49.field461 : (field716 + class49.field461) / 2;
                                            } else {
                                                if (class40.field373[96]) {
                                                    field701 += (-24 - field701) / 2;
                                                } else if (class40.field373[97]) {
                                                    field701 += (24 - field701) / 2;
                                                } else {
                                                    field701 /= 2;
                                                }
                                                if (class40.field373[98]) {
                                                    field641 += (12 - field641) / 2;
                                                } else if (class40.field373[99]) {
                                                    field641 += (-12 - field641) / 2;
                                                } else {
                                                    field641 /= 2;
                                                }
                                                field704 = class49.field462;
                                                field716 = class49.field461;
                                            }
                                            field700 = field701 / 2 + field700 & 0x7FF;
                                            field699 += field641 / 2;
                                            if (field699 < 128) {
                                                field699 = 128;
                                            }
                                            if (field699 > 383) {
                                                field699 = 383;
                                            }
                                            if (field874) {
                                                method3176();
                                            }
                                            for (int var122 = 0; var122 < 5; var122++) {
                                                int var10002 = field879[var122]++;
                                            }
                                            Statics.field594.method1871();
                                            int var123 = ++class49.field455 - 1;
                                            int var125 = class40.method4036();
                                            if (var123 > 15000 && var125 > 15000) {
                                                field775 = 250;
                                                class49.method2945(14500);
                                                class175 var126 = class175.method85(class172.field2257, field861.field1287);
                                                field861.method1944(var126);
                                            }
                                            Statics.field1863.method1576();
                                            field861.field1279++;
                                            if (field861.field1279 > 50) {
                                                class175 var127 = class175.method85(class172.field2230, field861.field1287);
                                                field861.method1944(var127);
                                            }
                                            try {
                                                field861.method1962();
                                            } catch (IOException var129) {
                                                method4575();
                                            }
                                            return;
                                        }
                                        var82 = var81.field563;
                                        if (var82.field2730 < 0) {
                                            break;
                                        }
                                        var83 = class233.method1754(var82.field2687);
                                    } while (var83 == null || var83.field2798 == null || var82.field2730 >= var83.field2798.length || var83.field2798[var82.field2730] != var82);
                                    class71.method5372(var81);
                                }
                            }
                            var79 = var78.field563;
                            if (var79.field2730 < 0) {
                                break;
                            }
                            var80 = class233.method1754(var79.field2687);
                        } while (var80 == null || var80.field2798 == null || var79.field2730 >= var80.field2798.length || var80.field2798[var79.field2730] != var79);
                        class71.method5372(var78);
                    }
                }
                var76 = var75.field563;
                if (var76.field2730 < 0) {
                    break;
                }
                var77 = class233.method1754(var76.field2687);
            } while (var77 == null || var77.field2798 == null || var76.field2730 >= var77.field2798.length || var77.field2798[var76.field2730] != var76);
            class71.method5372(var75);
        }
    }

    @ObfuscatedName("ay.fm(I)V")
    public static final void method928() {
        if (Statics.field3164 != null) {
            Statics.field3164.method2094();
        }
        if (Statics.field154 != null) {
            Statics.field154.method2094();
        }
    }

    @ObfuscatedName("ib.fz(Ljw;IIIS)V")
    public static void method4278(class276 arg0, int arg1, int arg2, int arg3) {
        if (field868 >= 50 || field867 == 0 || arg0.field3618 == null || arg1 >= arg0.field3618.length) {
            return;
        }
        int var4 = arg0.field3618[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field771[field868] = var5;
        field822[field868] = var6;
        field871[field868] = 0;
        field665[field868] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field906[field868] = (var8 << 16) + (var9 << 8) + var7;
        field868++;
    }

    @ObfuscatedName("a.fj(IIII)V")
    public static void method52(int arg0, int arg1, int arg2) {
        if (field866 == 0 || arg1 == 0 || field868 >= 50) {
            return;
        }
        field771[field868] = arg0;
        field822[field868] = arg1;
        field871[field868] = arg2;
        field665[field868] = null;
        field906[field868] = 0;
        field868++;
    }

    @ObfuscatedName("o.fb(II)V")
    public static void method274(int arg0) {
        if (arg0 == -1 && !field870) {
            Statics.field2536.method3945();
            class220.field2534 = 1;
            Statics.field2358 = null;
        } else if (arg0 != -1 && field805 != arg0 && field863 != 0 && !field870) {
            class220.method606(2, Statics.field905, arg0, 0, field863, false);
        }
        field805 = arg0;
    }

    @ObfuscatedName("ao.fy(IIB)V")
    public static void method642(int arg0, int arg1) {
        if (field863 != 0 && arg0 != -1) {
            class220.method3920(Statics.field1835, arg0, 0, field863, false);
            field870 = true;
        }
    }

    @ObfuscatedName("o.fi(Lhw;III)V")
    public static final void method276(class233 arg0, int arg1, int arg2) {
        if (field888 != 0 && field888 != 3 || field837 || !(class49.field468 == 1 || !Statics.field43 && class49.field468 == 4)) {
            return;
        }
        class227 var3 = arg0.method4209(true);
        if (var3 == null) {
            return;
        }
        int var4 = class49.field466 - arg1;
        int var5 = class49.field470 - arg2;
        if (!var3.method4122(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2624 / 2;
        int var7 = var5 - var3.field2621 / 2;
        int var8 = field700 & 0x7FF;
        int var9 = class125.field1749[var8];
        int var10 = class125.field1743[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field138.field943 + var11 >> 7;
        int var14 = Statics.field138.field925 - var12 >> 7;
        class175 var15 = class175.method85(class172.field2283, field861.field1287);
        var15.field2335.method3376(18);
        var15.field2335.method3380(Statics.field2611 + var14);
        var15.field2335.method3380(Statics.field321 + var13);
        var15.field2335.method3370(class40.field373[82] ? (class40.field373[81] ? 2 : 1) : 0);
        var15.field2335.method3376(var6);
        var15.field2335.method3376(var7);
        var15.field2335.method3330(field700);
        var15.field2335.method3376(57);
        var15.field2335.method3376(0);
        var15.field2335.method3376(0);
        var15.field2335.method3376(89);
        var15.field2335.method3330(Statics.field138.field943);
        var15.field2335.method3330(Statics.field138.field925);
        var15.field2335.method3376(63);
        field861.method1944(var15);
        field693 = var13;
        field891 = var14;
    }

    @ObfuscatedName("fs.fe(Ljava/lang/String;B)V")
    public static final void method3315(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field141.field1015 = !Statics.field141.field1015;
            class68.method614();
            if (Statics.field141.field1015) {
                class86.method3230(99, "", "Roofs are now all hidden");
            } else {
                class86.method3230(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field648 = !field648;
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            field749 = !field749;
        }
        if (arg0.equalsIgnoreCase("mouseovertext")) {
            field778 = !field778;
        }
        if (field740 >= 2) {
            if (arg0.equalsIgnoreCase("showcoord")) {
                Statics.field607.field3990 = !Statics.field607.field3990;
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                field648 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field648 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method4575();
            }
        }
        class175 var1 = class175.method85(class172.field2268, field861.field1287);
        var1.field2335.method3376(arg0.length() + 1);
        var1.field2335.method3446(arg0);
        field861.method1944(var1);
    }

    @ObfuscatedName("fe.fr(I)V")
    public static final void method3176() {
        int var0 = Statics.field198 * 128 + 64;
        int var1 = Statics.field2043 * 128 + 64;
        int var2 = method701(var0, var1, Statics.field1983) - Statics.field625;
        if (Statics.field81 < var0) {
            Statics.field81 += Statics.field311 * (var0 - Statics.field81) / 1000 + Statics.field142;
            if (Statics.field81 > var0) {
                Statics.field81 = var0;
            }
        }
        if (Statics.field81 > var0) {
            Statics.field81 -= Statics.field311 * (Statics.field81 - var0) / 1000 + Statics.field142;
            if (Statics.field81 < var0) {
                Statics.field81 = var0;
            }
        }
        if (Statics.field322 < var2) {
            Statics.field322 += Statics.field311 * (var2 - Statics.field322) / 1000 + Statics.field142;
            if (Statics.field322 > var2) {
                Statics.field322 = var2;
            }
        }
        if (Statics.field322 > var2) {
            Statics.field322 -= Statics.field311 * (Statics.field322 - var2) / 1000 + Statics.field142;
            if (Statics.field322 < var2) {
                Statics.field322 = var2;
            }
        }
        if (Statics.field2853 < var1) {
            Statics.field2853 += Statics.field311 * (var1 - Statics.field2853) / 1000 + Statics.field142;
            if (Statics.field2853 > var1) {
                Statics.field2853 = var1;
            }
        }
        if (Statics.field2853 > var1) {
            Statics.field2853 -= Statics.field311 * (Statics.field2853 - var1) / 1000 + Statics.field142;
            if (Statics.field2853 < var1) {
                Statics.field2853 = var1;
            }
        }
        int var3 = Statics.field1031 * 128 + 64;
        int var4 = Statics.field178 * 128 + 64;
        int var5 = method701(var3, var4, Statics.field1983) - Statics.field2537;
        int var6 = var3 - Statics.field81;
        int var7 = var5 - Statics.field322;
        int var8 = var4 - Statics.field2853;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field907 < var10) {
            Statics.field907 += Statics.field42 * (var10 - Statics.field907) / 1000 + Statics.field2343;
            if (Statics.field907 > var10) {
                Statics.field907 = var10;
            }
        }
        if (Statics.field907 > var10) {
            Statics.field907 -= Statics.field42 * (Statics.field907 - var10) / 1000 + Statics.field2343;
            if (Statics.field907 < var10) {
                Statics.field907 = var10;
            }
        }
        int var12 = var11 - Statics.field3385;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field3385 += Statics.field42 * var12 / 1000 + Statics.field2343;
            Statics.field3385 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field3385 -= Statics.field42 * -var12 / 1000 + Statics.field2343;
            Statics.field3385 &= 0x7FF;
        }
        int var13 = var11 - Statics.field3385;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field3385 = var11;
        }
    }

    @ObfuscatedName("ae.ff(S)V")
    public static final void method659() {
        int var0 = class84.field1216;
        int[] var1 = class84.field1217;
        for (int var2 = 0; var2 < var0; var2++) {
            class62 var3 = field746[var1[var2]];
            if (var3 != null) {
                method58(var3, 1);
            }
        }
    }

    @ObfuscatedName("a.fh(Lbn;IS)V")
    public static final void method58(class65 arg0, int arg1) {
        if (arg0.field971 > field642) {
            method2918(arg0);
        } else if (arg0.field972 >= field642) {
            if (field642 == arg0.field972 || arg0.field939 == -1 || arg0.field960 != 0 || arg0.field983 + 1 > class276.method3224(arg0.field939).field3617[arg0.field958]) {
                int var2 = arg0.field972 - arg0.field971;
                int var3 = field642 - arg0.field971;
                int var4 = arg0.field979 * 128 + arg0.field928 * 64;
                int var5 = arg0.field969 * 128 + arg0.field928 * 64;
                int var6 = arg0.field968 * 128 + arg0.field928 * 64;
                int var7 = arg0.field970 * 128 + arg0.field928 * 64;
                arg0.field943 = ((var2 - var3) * var4 + var3 * var6) / var2;
                arg0.field925 = ((var2 - var3) * var5 + var3 * var7) / var2;
            }
            arg0.field973 = 0;
            arg0.field976 = arg0.field966;
            arg0.field926 = arg0.field976;
        } else {
            arg0.field931 = arg0.field942;
            if (arg0.field945 == 0) {
                arg0.field973 = 0;
            } else {
                label430: {
                    if (arg0.field939 != -1 && arg0.field960 == 0) {
                        class276 var8 = class276.method3224(arg0.field939);
                        if (arg0.field984 > 0 && var8.field3626 == 0) {
                            arg0.field973++;
                            break label430;
                        }
                        if (arg0.field984 <= 0 && var8.field3610 == 0) {
                            arg0.field973++;
                            break label430;
                        }
                    }
                    int var9 = arg0.field943;
                    int var10 = arg0.field925;
                    int var11 = arg0.field954[arg0.field945 - 1] * 128 + arg0.field928 * 64;
                    int var12 = arg0.field981[arg0.field945 - 1] * 128 + arg0.field928 * 64;
                    if (var9 < var11) {
                        if (var10 < var12) {
                            arg0.field976 = 1280;
                        } else if (var10 > var12) {
                            arg0.field976 = 1792;
                        } else {
                            arg0.field976 = 1536;
                        }
                    } else if (var9 > var11) {
                        if (var10 < var12) {
                            arg0.field976 = 768;
                        } else if (var10 > var12) {
                            arg0.field976 = 256;
                        } else {
                            arg0.field976 = 512;
                        }
                    } else if (var10 < var12) {
                        arg0.field976 = 1024;
                    } else if (var10 > var12) {
                        arg0.field976 = 0;
                    }
                    byte var13 = arg0.field982[arg0.field945 - 1];
                    if (var11 - var9 <= 256 && var11 - var9 >= -256 && var12 - var10 <= 256 && var12 - var10 >= -256) {
                        int var14 = arg0.field976 - arg0.field926 & 0x7FF;
                        if (var14 > 1024) {
                            var14 -= 2048;
                        }
                        int var15 = arg0.field933;
                        if (var14 >= -256 && var14 <= 256) {
                            var15 = arg0.field956;
                        } else if (var14 >= 256 && var14 < 768) {
                            var15 = arg0.field936;
                        } else if (var14 >= -768 && var14 <= -256) {
                            var15 = arg0.field930;
                        }
                        if (var15 == -1) {
                            var15 = arg0.field956;
                        }
                        arg0.field931 = var15;
                        int var16 = 4;
                        boolean var17 = true;
                        if (arg0 instanceof class74) {
                            var17 = ((class74) arg0).field1091.field3570;
                        }
                        if (var17) {
                            if (arg0.field976 != arg0.field926 && arg0.field951 == -1 && arg0.field978 != 0) {
                                var16 = 2;
                            }
                            if (arg0.field945 > 2) {
                                var16 = 6;
                            }
                            if (arg0.field945 > 3) {
                                var16 = 8;
                            }
                            if (arg0.field973 > 0 && arg0.field945 > 1) {
                                var16 = 8;
                                arg0.field973--;
                            }
                        } else {
                            if (arg0.field945 > 1) {
                                var16 = 6;
                            }
                            if (arg0.field945 > 2) {
                                var16 = 8;
                            }
                            if (arg0.field973 > 0 && arg0.field945 > 1) {
                                var16 = 8;
                                arg0.field973--;
                            }
                        }
                        if (var13 == 2) {
                            var16 <<= 0x1;
                        }
                        if (var16 >= 8 && arg0.field956 == arg0.field931 && arg0.field937 != -1) {
                            arg0.field931 = arg0.field937;
                        }
                        if (var9 != var11 || var10 != var12) {
                            if (var9 < var11) {
                                arg0.field943 += var16;
                                if (arg0.field943 > var11) {
                                    arg0.field943 = var11;
                                }
                            } else if (var9 > var11) {
                                arg0.field943 -= var16;
                                if (arg0.field943 < var11) {
                                    arg0.field943 = var11;
                                }
                            }
                            if (var10 < var12) {
                                arg0.field925 += var16;
                                if (arg0.field925 > var12) {
                                    arg0.field925 = var12;
                                }
                            } else if (var10 > var12) {
                                arg0.field925 -= var16;
                                if (arg0.field925 < var12) {
                                    arg0.field925 = var12;
                                }
                            }
                        }
                        if (arg0.field943 == var11 && arg0.field925 == var12) {
                            arg0.field945--;
                            if (arg0.field984 > 0) {
                                arg0.field984--;
                            }
                        }
                    } else {
                        arg0.field943 = var11;
                        arg0.field925 = var12;
                        arg0.field945--;
                        if (arg0.field984 > 0) {
                            arg0.field984--;
                        }
                    }
                }
            }
        }
        if (arg0.field943 < 128 || arg0.field925 < 128 || arg0.field943 >= 13184 || arg0.field925 >= 13184) {
            arg0.field939 = -1;
            arg0.field962 = -1;
            arg0.field971 = 0;
            arg0.field972 = 0;
            arg0.field943 = arg0.field954[0] * 128 + arg0.field928 * 64;
            arg0.field925 = arg0.field981[0] * 128 + arg0.field928 * 64;
            arg0.method1498();
        }
        if (Statics.field138 == arg0 && (arg0.field943 < 1536 || arg0.field925 < 1536 || arg0.field943 >= 11776 || arg0.field925 >= 11776)) {
            arg0.field939 = -1;
            arg0.field962 = -1;
            arg0.field971 = 0;
            arg0.field972 = 0;
            arg0.field943 = arg0.field954[0] * 128 + arg0.field928 * 64;
            arg0.field925 = arg0.field981[0] * 128 + arg0.field928 * 64;
            arg0.method1498();
        }
        if (arg0.field978 != 0) {
            if (arg0.field951 != -1) {
                class65 var18 = null;
                if (arg0.field951 < 32768) {
                    var18 = field672[arg0.field951];
                } else if (arg0.field951 >= 32768) {
                    var18 = field746[arg0.field951 - 32768];
                }
                if (var18 != null) {
                    int var19 = arg0.field943 - var18.field943;
                    int var20 = arg0.field925 - var18.field925;
                    if (var19 != 0 || var20 != 0) {
                        arg0.field976 = (int) (Math.atan2((double) var19, (double) var20) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field949) {
                    arg0.field951 = -1;
                    arg0.field949 = false;
                }
            }
            if (arg0.field967 != -1 && (arg0.field945 == 0 || arg0.field973 > 0)) {
                arg0.field976 = arg0.field967;
                arg0.field967 = -1;
            }
            int var21 = arg0.field976 - arg0.field926 & 0x7FF;
            if (var21 == 0 && arg0.field949) {
                arg0.field951 = -1;
                arg0.field949 = false;
            }
            if (var21 == 0) {
                arg0.field977 = 0;
            } else {
                arg0.field977++;
                if (var21 > 1024) {
                    arg0.field926 -= arg0.field978;
                    boolean var22 = true;
                    if (var21 < arg0.field978 || var21 > 2048 - arg0.field978) {
                        arg0.field926 = arg0.field976;
                        var22 = false;
                    }
                    if (arg0.field942 == arg0.field931 && (arg0.field977 > 25 || var22)) {
                        if (arg0.field980 == -1) {
                            arg0.field931 = arg0.field956;
                        } else {
                            arg0.field931 = arg0.field980;
                        }
                    }
                } else {
                    arg0.field926 += arg0.field978;
                    boolean var23 = true;
                    if (var21 < arg0.field978 || var21 > 2048 - arg0.field978) {
                        arg0.field926 = arg0.field976;
                        var23 = false;
                    }
                    if (arg0.field942 == arg0.field931 && (arg0.field977 > 25 || var23)) {
                        if (arg0.field975 == -1) {
                            arg0.field931 = arg0.field956;
                        } else {
                            arg0.field931 = arg0.field975;
                        }
                    }
                }
                arg0.field926 &= 0x7FF;
            }
        }
        arg0.field927 = false;
        if (arg0.field931 != -1) {
            class276 var25 = class276.method3224(arg0.field931);
            if (var25 == null || var25.field3625 == null) {
                arg0.field931 = -1;
            } else {
                arg0.field946++;
                if (arg0.field955 < var25.field3625.length && arg0.field946 > var25.field3617[arg0.field955]) {
                    arg0.field946 = 1;
                    arg0.field955++;
                    method4278(var25, arg0.field955, arg0.field943, arg0.field925);
                }
                if (arg0.field955 >= var25.field3625.length) {
                    arg0.field946 = 0;
                    arg0.field955 = 0;
                    method4278(var25, arg0.field955, arg0.field943, arg0.field925);
                }
            }
        }
        if (arg0.field962 != -1 && field642 >= arg0.field965) {
            if (arg0.field963 < 0) {
                arg0.field963 = 0;
            }
            int var26 = class261.method2403(arg0.field962).field3334;
            if (var26 == -1) {
                arg0.field962 = -1;
            } else {
                class276 var27 = class276.method3224(var26);
                if (var27 == null || var27.field3625 == null) {
                    arg0.field962 = -1;
                } else {
                    arg0.field964++;
                    if (arg0.field963 < var27.field3625.length && arg0.field964 > var27.field3617[arg0.field963]) {
                        arg0.field964 = 1;
                        arg0.field963++;
                        method4278(var27, arg0.field963, arg0.field943, arg0.field925);
                    }
                    if (arg0.field963 >= var27.field3625.length && (arg0.field963 < 0 || arg0.field963 >= var27.field3625.length)) {
                        arg0.field962 = -1;
                    }
                }
            }
        }
        if (arg0.field939 != -1 && arg0.field960 <= 1) {
            class276 var28 = class276.method3224(arg0.field939);
            if (var28.field3626 == 1 && arg0.field984 > 0 && arg0.field971 <= field642 && arg0.field972 < field642) {
                arg0.field960 = 1;
                return;
            }
        }
        if (arg0.field939 != -1 && arg0.field960 == 0) {
            class276 var29 = class276.method3224(arg0.field939);
            if (var29 == null || var29.field3625 == null) {
                arg0.field939 = -1;
            } else {
                arg0.field983++;
                if (arg0.field958 < var29.field3625.length && arg0.field983 > var29.field3617[arg0.field958]) {
                    arg0.field983 = 1;
                    arg0.field958++;
                    method4278(var29, arg0.field958, arg0.field943, arg0.field925);
                }
                if (arg0.field958 >= var29.field3625.length) {
                    arg0.field958 -= var29.field3619;
                    arg0.field961++;
                    if (arg0.field961 >= var29.field3621) {
                        arg0.field939 = -1;
                    } else if (arg0.field958 >= 0 && arg0.field958 < var29.field3625.length) {
                        method4278(var29, arg0.field958, arg0.field943, arg0.field925);
                    } else {
                        arg0.field939 = -1;
                    }
                }
                arg0.field927 = var29.field3623;
            }
        }
        if (arg0.field960 > 0) {
            arg0.field960--;
        }
    }

    @ObfuscatedName("et.fx(Lbn;I)V")
    public static final void method2918(class65 arg0) {
        int var1 = arg0.field971 - field642;
        int var2 = arg0.field979 * 128 + arg0.field928 * 64;
        int var3 = arg0.field969 * 128 + arg0.field928 * 64;
        arg0.field943 += (var2 - arg0.field943) / var1;
        arg0.field925 += (var3 - arg0.field925) / var1;
        arg0.field973 = 0;
        arg0.field976 = arg0.field966;
    }

    @ObfuscatedName("f.fw(Lbw;III)V")
    public static void method7(class62 arg0, int arg1, int arg2) {
        if (arg0.field939 == arg1 && arg1 != -1) {
            int var3 = class276.method3224(arg1).field3611;
            if (var3 == 1) {
                arg0.field958 = 0;
                arg0.field983 = 0;
                arg0.field960 = arg2;
                arg0.field961 = 0;
            }
            if (var3 == 2) {
                arg0.field961 = 0;
            }
        } else if (arg1 == -1 || arg0.field939 == -1 || class276.method3224(arg1).field3622 >= class276.method3224(arg0.field939).field3622) {
            arg0.field939 = arg1;
            arg0.field958 = 0;
            arg0.field983 = 0;
            arg0.field960 = arg2;
            arg0.field961 = 0;
            arg0.field984 = arg0.field945;
        }
    }

    @ObfuscatedName("d.fg(I)I")
    public static int method106() {
        return field844 ? 2 : 1;
    }

    @ObfuscatedName("bf.fn(II)V")
    public static void method972(int arg0) {
        field843 = 0L;
        if (arg0 >= 2) {
            field844 = true;
        } else {
            field844 = false;
        }
        if (method106() == 1) {
            Statics.field1133.method727(765, 503);
        } else {
            Statics.field1133.method727(7680, 2160);
        }
        if (field638 >= 25) {
            method4127();
        }
    }

    @ObfuscatedName("ht.fu(I)V")
    public static void method4127() {
        class175 var0 = class175.method85(class172.field2210, field861.field1287);
        var0.field2335.method3376(method106());
        var0.field2335.method3330(Statics.field2652);
        var0.field2335.method3330(Statics.field253);
        field861.method1944(var0);
    }

    @ObfuscatedName("client.u(I)V")
    public final void method752() {
        field843 = Statics.method1926() + 500L;
        this.method1100();
        if (field790 != -1) {
            this.method1106(true);
        }
    }

    @ObfuscatedName("client.fl(I)V")
    public void method1100() {
        int var1 = Statics.field2652;
        int var2 = Statics.field253;
        if (this.field440 < var1) {
            int var3 = this.field440;
        }
        if (this.field429 < var2) {
            int var4 = this.field429;
        }
        if (Statics.field141 != null) {
            try {
                class42.method662(Statics.field1133, "resize", new Object[] { method106() });
            } catch (Throwable var6) {
            }
        }
    }

    @ObfuscatedName("client.ft(I)V")
    public final void method1147() {
        if (field790 != -1) {
            int var1 = field790;
            if (class233.method1506(var1)) {
                method5184(Statics.field2657[var1], -1);
            }
        }
        for (int var2 = 0; var2 < field833; var2++) {
            if (field828[var2]) {
                field764[var2] = true;
            }
            field645[var2] = field828[var2];
            field828[var2] = false;
        }
        field857 = field642;
        field779 = -1;
        field780 = -1;
        Statics.field2310 = null;
        if (field790 != -1) {
            field833 = 0;
            method1554(field790, 0, 0, Statics.field2652, Statics.field253, 0, 0, -1);
        }
        class320.method5467();
        if (field735) {
            if (field734 == 1) {
                Statics.field107[field722 / 100].method5567(field847 - 8, field732 - 8);
            }
            if (field734 == 2) {
                Statics.field107[field722 / 100 + 4].method5567(field847 - 8, field732 - 8);
            }
        }
        if (field837) {
            int var8 = Statics.field7;
            int var9 = Statics.field78;
            int var10 = Statics.field677;
            int var11 = Statics.field2460;
            int var12 = 6116423;
            class320.method5483(var8, var9, var10, var11, var12);
            class320.method5483(var8 + 1, var9 + 1, var10 - 2, 16, 0);
            class320.method5465(var8 + 1, var9 + 18, var10 - 2, var11 - 19, 0);
            Statics.field2818.method5225(class240.field3014, var8 + 3, var9 + 14, var12, -1);
            int var13 = class49.field461;
            int var14 = class49.field462;
            for (int var15 = 0; var15 < field767; var15++) {
                int var16 = (field767 - 1 - var15) * 15 + var9 + 31;
                int var17 = 16777215;
                if (var13 > var8 && var13 < var8 + var10 && var14 > var16 - 13 && var14 < var16 + 3) {
                    var17 = 16776960;
                }
                Statics.field2818.method5225(method1736(var15), var8 + 3, var16, var17, 0);
            }
            method1001(Statics.field7, Statics.field78, Statics.field677, Statics.field2460);
        } else if (field779 != -1) {
            int var3 = field779;
            int var4 = field780;
            if ((field767 >= 2 || field783 != 0 || field785) && field778) {
                int var5 = field767 - 1;
                String var7;
                if (field783 == 1 && field767 < 2) {
                    var7 = class240.field3038 + class240.field3021 + field733 + " " + class76.field1101;
                } else if (field785 && field767 < 2) {
                    var7 = field788 + class240.field3021 + field789 + " " + class76.field1101;
                } else {
                    var7 = method1736(var5);
                }
                if (field767 > 2) {
                    var7 = var7 + class76.method2910(16777215) + " " + '/' + " " + (field767 - 2) + class240.field3015;
                }
                Statics.field2818.method5217(var7, var3 + 4, var4 + 15, 16777215, 0, field642 / 1000);
            }
        }
        if (field842 == 3) {
            for (int var18 = 0; var18 < field833; var18++) {
                if (field645[var18]) {
                    class320.method5461(field799[var18], field839[var18], field840[var18], field841[var18], 16711935, 128);
                } else if (field764[var18]) {
                    class320.method5461(field799[var18], field839[var18], field840[var18], field841[var18], 16711680, 128);
                }
            }
        }
        class70.method460(Statics.field1983, Statics.field138.field943, Statics.field138.field925, field887);
        field887 = 0;
    }

    @ObfuscatedName("d.fq(Ljava/lang/String;ZB)V")
    public static final void method96(String arg0, boolean arg1) {
        if (!field745) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field576.method5247(arg0, 250);
        int var6 = Statics.field576.method5207(arg0, 250) * 13;
        class320.method5483(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class320.method5465(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field576.method5257(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        int var7 = var3 - var2;
        int var8 = var4 - var2;
        int var9 = var2 + var5 + var2;
        int var10 = var2 + var6 + var2;
        for (int var11 = 0; var11 < field833; var11++) {
            if (field840[var11] + field799[var11] > var7 && field799[var11] < var7 + var9 && field841[var11] + field839[var11] > var8 && field839[var11] < var8 + var10) {
                field828[var11] = true;
            }
        }
        if (arg1) {
            Statics.field1916.method711(0, 0);
        } else {
            method1001(var3, var4, var5, var6);
        }
    }

    @ObfuscatedName("m.fv(IIIII)V")
    public static final void method90(int arg0, int arg1, int arg2, int arg3) {
        field728++;
        if (Statics.field138.field943 >> 7 == field693 && Statics.field138.field925 >> 7 == field891) {
            field693 = 0;
        }
        if (field749) {
            method652(Statics.field138, false);
        }
        if (field820 >= 0 && field746[field820] != null) {
            method652(field746[field820], false);
        }
        method518(true);
        method186();
        method518(false);
        method610();
        for (class72 var4 = (class72) field761.method3827(); var4 != null; var4 = (class72) field761.method3829()) {
            if (Statics.field1983 != var4.field1075 || var4.field1073) {
                var4.method3818();
            } else if (field642 >= var4.field1063) {
                var4.method1737(field887);
                if (var4.field1073) {
                    var4.method3818();
                } else {
                    Statics.field3406.method2734(var4.field1075, var4.field1065, var4.field1066, var4.field1067, 60, var4, 0, -1L, false);
                }
            }
        }
        method2907(arg0, arg1, arg2, arg3, true);
        int var5 = field721;
        int var6 = field714;
        int var7 = field890;
        int var8 = field836;
        class320.method5454(var5, var6, var5 + var7, var6 + var8);
        class125.method2640();
        if (!field874) {
            int var9 = field699;
            if (field744 / 256 > var9) {
                var9 = field744 / 256;
            }
            if (field685[4] && field877[4] + 128 > var9) {
                var9 = field877[4] + 128;
            }
            int var10 = field700 & 0x7FF;
            method2971(Statics.field592, Statics.field2026, Statics.field2056, var9, var10, Statics.method245(var9), var8);
        }
        int var23;
        if (field874) {
            var23 = method107();
        } else {
            int var11;
            if (Statics.field141.field1015) {
                var11 = Statics.field1983;
            } else {
                label472: {
                    int var12 = 3;
                    if (Statics.field907 < 310) {
                        int var13;
                        int var14;
                        if (field705 == 1) {
                            var13 = Statics.field592 >> 7;
                            var14 = Statics.field2056 >> 7;
                        } else {
                            var13 = Statics.field138.field943 >> 7;
                            var14 = Statics.field138.field925 >> 7;
                        }
                        int var15 = Statics.field81 >> 7;
                        int var16 = Statics.field2853 >> 7;
                        if (var15 < 0 || var16 < 0 || var15 >= 104 || var16 >= 104) {
                            var11 = Statics.field1983;
                            break label472;
                        }
                        if (var13 < 0 || var14 < 0 || var13 >= 104 || var14 >= 104) {
                            var11 = Statics.field1983;
                            break label472;
                        }
                        if ((class51.field482[Statics.field1983][var15][var16] & 0x4) != 0) {
                            var12 = Statics.field1983;
                        }
                        int var17;
                        if (var13 > var15) {
                            var17 = var13 - var15;
                        } else {
                            var17 = var15 - var13;
                        }
                        int var18;
                        if (var14 > var16) {
                            var18 = var14 - var16;
                        } else {
                            var18 = var16 - var14;
                        }
                        if (var17 > var18) {
                            int var19 = var18 * 65536 / var17;
                            int var20 = 32768;
                            while (var13 != var15) {
                                if (var15 < var13) {
                                    var15++;
                                } else if (var15 > var13) {
                                    var15--;
                                }
                                if ((class51.field482[Statics.field1983][var15][var16] & 0x4) != 0) {
                                    var12 = Statics.field1983;
                                }
                                var20 += var19;
                                if (var20 >= 65536) {
                                    var20 -= 65536;
                                    if (var16 < var14) {
                                        var16++;
                                    } else if (var16 > var14) {
                                        var16--;
                                    }
                                    if ((class51.field482[Statics.field1983][var15][var16] & 0x4) != 0) {
                                        var12 = Statics.field1983;
                                    }
                                }
                            }
                        } else if (var18 > 0) {
                            int var21 = var17 * 65536 / var18;
                            int var22 = 32768;
                            while (var14 != var16) {
                                if (var16 < var14) {
                                    var16++;
                                } else if (var16 > var14) {
                                    var16--;
                                }
                                if ((class51.field482[Statics.field1983][var15][var16] & 0x4) != 0) {
                                    var12 = Statics.field1983;
                                }
                                var22 += var21;
                                if (var22 >= 65536) {
                                    var22 -= 65536;
                                    if (var15 < var13) {
                                        var15++;
                                    } else if (var15 > var13) {
                                        var15--;
                                    }
                                    if ((class51.field482[Statics.field1983][var15][var16] & 0x4) != 0) {
                                        var12 = Statics.field1983;
                                    }
                                }
                            }
                        }
                    }
                    if (Statics.field138.field943 >= 0 && Statics.field138.field925 >= 0 && Statics.field138.field943 < 13312 && Statics.field138.field925 < 13312) {
                        if ((class51.field482[Statics.field1983][Statics.field138.field943 >> 7][Statics.field138.field925 >> 7] & 0x4) != 0) {
                            var12 = Statics.field1983;
                        }
                        var11 = var12;
                    } else {
                        var11 = Statics.field1983;
                    }
                }
            }
            var23 = var11;
        }
        int var24 = Statics.field81;
        int var25 = Statics.field322;
        int var26 = Statics.field2853;
        int var27 = Statics.field907;
        int var28 = Statics.field3385;
        for (int var29 = 0; var29 < 5; var29++) {
            if (field685[var29]) {
                int var30 = (int) (Math.random() * (double) (field678[var29] * 2 + 1) - (double) field678[var29] + Math.sin((double) field878[var29] / 100.0D * (double) field879[var29]) * (double) field877[var29]);
                if (var29 == 0) {
                    Statics.field81 += var30;
                }
                if (var29 == 1) {
                    Statics.field322 += var30;
                }
                if (var29 == 2) {
                    Statics.field2853 += var30;
                }
                if (var29 == 3) {
                    Statics.field3385 = Statics.field3385 + var30 & 0x7FF;
                }
                if (var29 == 4) {
                    Statics.field907 += var30;
                    if (Statics.field907 < 128) {
                        Statics.field907 = 128;
                    }
                    if (Statics.field907 > 383) {
                        Statics.field907 = 383;
                    }
                }
            }
        }
        int var31 = class49.field461;
        int var32 = class49.field462;
        if (class49.field468 != 0) {
            var31 = class49.field466;
            var32 = class49.field470;
        }
        if (var31 >= var5 && var31 < var5 + var7 && var32 >= var6 && var32 < var6 + var8) {
            class123.method1827(var31 - var5, var32 - var6);
        } else {
            class123.field1717 = false;
            class123.field1707 = 0;
        }
        method928();
        class320.method5483(var5, var6, var7, var8, 0);
        method928();
        int var33 = class125.field1735;
        class125.field1735 = field707;
        Statics.field3406.method2747(Statics.field81, Statics.field322, Statics.field2853, Statics.field907, Statics.field3385, var23);
        class125.field1735 = var33;
        method928();
        Statics.field3406.method2737();
        field717 = 0;
        boolean var34 = false;
        int var35 = -1;
        int var36 = -1;
        int var37 = class84.field1216;
        int[] var38 = class84.field1217;
        for (int var39 = 0; var39 < field673 + var37; var39++) {
            class65 var40;
            if (var39 < var37) {
                var40 = field746[var38[var39]];
                if (field820 == var38[var39]) {
                    var34 = true;
                    var35 = var39;
                    continue;
                }
                if (Statics.field138 == var40) {
                    var36 = var39;
                    continue;
                }
            } else {
                var40 = field672[field674[var39 - var37]];
            }
            method4385(var40, var39, var5, var6, var7, var8);
        }
        if (field749 && var36 != -1) {
            method4385(Statics.field138, var36, var5, var6, var7, var8);
        }
        if (var34) {
            method4385(field746[field820], var35, var5, var6, var7, var8);
        }
        for (int var41 = 0; var41 < field717; var41++) {
            int var42 = field719[var41];
            int var43 = field750[var41];
            int var44 = field652[var41];
            int var45 = field862[var41];
            boolean var46 = true;
            while (var46) {
                var46 = false;
                for (int var47 = 0; var47 < var41; var47++) {
                    if (var43 + 2 > field750[var47] - field862[var47] && var43 - var45 < field750[var47] + 2 && var42 - var44 < field719[var47] + field652[var47] && var42 + var44 > field719[var47] - field652[var47] && field750[var47] - field862[var47] < var43) {
                        var43 = field750[var47] - field862[var47];
                        var46 = true;
                    }
                }
            }
            field729 = field719[var41];
            field730 = field750[var41] = var43;
            String var48 = field726[var41];
            if (field794 == 0) {
                int var49 = 16776960;
                if (field723[var41] < 6) {
                    var49 = field720[field723[var41]];
                }
                if (field723[var41] == 6) {
                    var49 = field728 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field723[var41] == 7) {
                    var49 = field728 % 20 < 10 ? 255 : 65535;
                }
                if (field723[var41] == 8) {
                    var49 = field728 % 20 < 10 ? 45056 : 8454016;
                }
                if (field723[var41] == 9) {
                    int var50 = 150 - field823[var41];
                    if (var50 < 50) {
                        var49 = var50 * 1280 + 16711680;
                    } else if (var50 < 100) {
                        var49 = 16776960 - (var50 - 50) * 327680;
                    } else if (var50 < 150) {
                        var49 = (var50 - 100) * 5 + 65280;
                    }
                }
                if (field723[var41] == 10) {
                    int var51 = 150 - field823[var41];
                    if (var51 < 50) {
                        var49 = var51 * 5 + 16711680;
                    } else if (var51 < 100) {
                        var49 = 16711935 - (var51 - 50) * 327680;
                    } else if (var51 < 150) {
                        var49 = (var51 - 100) * 327680 + 255 - (var51 - 100) * 5;
                    }
                }
                if (field723[var41] == 11) {
                    int var52 = 150 - field823[var41];
                    if (var52 < 50) {
                        var49 = 16777215 - var52 * 327685;
                    } else if (var52 < 100) {
                        var49 = (var52 - 50) * 327685 + 65280;
                    } else if (var52 < 150) {
                        var49 = 16777215 - (var52 - 100) * 327680;
                    }
                }
                if (field724[var41] == 0) {
                    Statics.field2818.method5267(var48, field729 + var5, field730 + var6, var49, 0);
                }
                if (field724[var41] == 1) {
                    Statics.field2818.method5214(var48, field729 + var5, field730 + var6, var49, 0, field728);
                }
                if (field724[var41] == 2) {
                    Statics.field2818.method5215(var48, field729 + var5, field730 + var6, var49, 0, field728);
                }
                if (field724[var41] == 3) {
                    Statics.field2818.method5206(var48, field729 + var5, field730 + var6, var49, 0, field728, 150 - field823[var41]);
                }
                if (field724[var41] == 4) {
                    int var53 = (150 - field823[var41]) * (Statics.field2818.method5278(var48) + 100) / 150;
                    class320.method5474(field729 + var5 - 50, var6, field729 + var5 + 50, var6 + var8);
                    Statics.field2818.method5225(var48, field729 + var5 + 50 - var53, field730 + var6, var49, 0);
                    class320.method5454(var5, var6, var5 + var7, var6 + var8);
                }
                if (field724[var41] == 5) {
                    int var54 = 150 - field823[var41];
                    int var55 = 0;
                    if (var54 < 25) {
                        var55 = var54 - 25;
                    } else if (var54 > 125) {
                        var55 = var54 - 125;
                    }
                    class320.method5474(var5, field730 + var6 - Statics.field2818.field3762 - 1, var5 + var7, field730 + var6 + 5);
                    Statics.field2818.method5267(var48, field729 + var5, field730 + var6 + var55, var49, 0);
                    class320.method5454(var5, var6, var5 + var7, var6 + var8);
                }
            } else {
                Statics.field2818.method5267(var48, field729 + var5, field730 + var6, 16776960, 0);
            }
        }
        method188(var5, var6);
        ((class114) Statics.field1724).method2415(field887);
        method1774(var5, var6, var7, var8);
        Statics.field81 = var24;
        Statics.field322 = var25;
        Statics.field2853 = var26;
        Statics.field907 = var27;
        Statics.field3385 = var28;
        if (field692) {
            byte var56 = 0;
            int var57 = class253.field3258 + class253.field3256 + var56;
            if (var57 == 0) {
                field692 = false;
            }
        }
        if (field692) {
            class320.method5483(var5, var6, var7, var8, 0);
            method96(class240.field2980, false);
        }
    }

    @ObfuscatedName("eg.fp(IIIIZB)V")
    public static final void method2907(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var5 = arg3 - 334;
        int var6;
        if (var5 < 0) {
            var6 = field873;
        } else if (var5 >= 100) {
            var6 = field882;
        } else {
            var6 = (field882 - field873) * var5 / 100 + field873;
        }
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field886) {
            short var8 = field886;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field885) {
                var6 = field885;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class320.method5467();
                    class320.method5483(arg0, arg1, var10, arg3, -16777216);
                    class320.method5483(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field818) {
            short var11 = field818;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field884) {
                var6 = field884;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class320.method5467();
                    class320.method5483(arg0, arg1, arg2, var13, -16777216);
                    class320.method5483(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field707 = arg3 * var6 / 334;
        if (field890 != arg2 || field836 != arg3) {
            method935(arg2, arg3);
        }
        field721 = arg0;
        field714 = arg1;
        field890 = arg2;
        field836 = arg3;
    }

    @ObfuscatedName("t.fa(I)V")
    public static void method186() {
        int var0 = class84.field1216;
        int[] var1 = class84.field1217;
        for (int var2 = 0; var2 < var0; var2++) {
            if (field820 != var1[var2] && field663 != var1[var2]) {
                method652(field746[var1[var2]], true);
            }
        }
    }

    @ObfuscatedName("ae.fc(Lbw;ZB)V")
    public static void method652(class62 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method1043() || arg0.field595) {
            return;
        }
        arg0.field599 = false;
        if ((field634 && class84.field1216 > 50 || class84.field1216 > 200) && arg1 && arg0.field942 == arg0.field931) {
            arg0.field599 = true;
        }
        int var2 = arg0.field943 >> 7;
        int var3 = arg0.field925 >> 7;
        if (var2 < 0 || var2 >= 104 || var3 < 0 || var3 >= 104) {
            return;
        }
        long var4 = class123.method3065(0, 0, 0, false, arg0.field618);
        if (arg0.field609 != null && field642 >= arg0.field604 && field642 < arg0.field605) {
            arg0.field599 = false;
            arg0.field603 = method701(arg0.field943, arg0.field925, Statics.field1983);
            arg0.field929 = field642;
            Statics.field3406.method2735(Statics.field1983, arg0.field943, arg0.field925, arg0.field603, 60, arg0, arg0.field926, var4, arg0.field610, arg0.field623, arg0.field612, arg0.field613);
            return;
        }
        if ((arg0.field943 & 0x7F) == 64 && (arg0.field925 & 0x7F) == 64) {
            if (field728 == field791[var2][var3]) {
                return;
            }
            field791[var2][var3] = field728;
        }
        arg0.field603 = method701(arg0.field943, arg0.field925, Statics.field1983);
        arg0.field929 = field642;
        Statics.field3406.method2734(Statics.field1983, arg0.field943, arg0.field925, arg0.field603, 60, arg0, arg0.field926, var4, arg0.field927);
    }

    @ObfuscatedName("am.fs(ZI)V")
    public static final void method518(boolean arg0) {
        for (int var1 = 0; var1 < field673; var1++) {
            class74 var2 = field672[field674[var1]];
            if (var2 != null && var2.method1043() && var2.field1091.field3584 == arg0 && var2.field1091.method4854()) {
                int var3 = var2.field943 >> 7;
                int var4 = var2.field925 >> 7;
                if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
                    if (var2.field928 == 1 && (var2.field943 & 0x7F) == 64 && (var2.field925 & 0x7F) == 64) {
                        if (field728 == field791[var3][var4]) {
                            continue;
                        }
                        field791[var3][var4] = field728;
                    }
                    long var5 = class123.method3065(0, 0, 1, !var2.field1091.field3592, field674[var1]);
                    var2.field929 = field642;
                    Statics.field3406.method2734(Statics.field1983, var2.field943, var2.field925, method701(var2.field943 + (var2.field928 * 64 - 64), var2.field925 + (var2.field928 * 64 - 64), Statics.field1983), var2.field928 * 64 - 64 + 60, var2, var2.field926, var5, var2.field927);
                }
            }
        }
    }

    @ObfuscatedName("al.gv(B)V")
    public static final void method610() {
        for (class81 var0 = (class81) field760.method3827(); var0 != null; var0 = (class81) field760.method3829()) {
            if (Statics.field1983 != var0.field1174 || field642 > var0.field1194) {
                var0.method3818();
            } else if (field642 >= var0.field1179) {
                if (var0.field1183 > 0) {
                    class74 var1 = field672[var0.field1183 - 1];
                    if (var1 != null && var1.field943 >= 0 && var1.field943 < 13312 && var1.field925 >= 0 && var1.field925 < 13312) {
                        var0.method1823(var1.field943, var1.field925, method701(var1.field943, var1.field925, var0.field1174) - var0.field1178, field642);
                    }
                }
                if (var0.field1183 < 0) {
                    int var2 = -var0.field1183 - 1;
                    class62 var3;
                    if (field663 == var2) {
                        var3 = Statics.field138;
                    } else {
                        var3 = field746[var2];
                    }
                    if (var3 != null && var3.field943 >= 0 && var3.field943 < 13312 && var3.field925 >= 0 && var3.field925 < 13312) {
                        var0.method1823(var3.field943, var3.field925, method701(var3.field943, var3.field925, var0.field1174) - var0.field1178, field642);
                    }
                }
                var0.method1820(field887);
                Statics.field3406.method2734(Statics.field1983, (int) var0.field1193, (int) var0.field1186, (int) var0.field1187, 60, var0, var0.field1197, -1L, false);
            }
        }
    }

    @ObfuscatedName("z.gr(I)I")
    public static final int method107() {
        if (Statics.field141.field1015) {
            return Statics.field1983;
        } else {
            int var0 = method701(Statics.field81, Statics.field2853, Statics.field1983);
            return var0 - Statics.field322 >= 800 || (class51.field482[Statics.field1983][Statics.field81 >> 7][Statics.field2853 >> 7] & 0x4) == 0 ? 3 : Statics.field1983;
        }
    }

    @ObfuscatedName("n.gm(III)V")
    public static final void method188(int arg0, int arg1) {
        if (field650 == 2) {
            method904((field653 - Statics.field321 << 7) + field656, (field797 - Statics.field2611 << 7) + field657, field900 * 2);
            if (field729 > -1 && field642 % 20 < 10) {
                Statics.field3833[0].method5567(field729 + arg0 - 12, field730 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("g.gw(I)Z")
    public static boolean method147() {
        return (field860 & 0x8) != 0;
    }

    @ObfuscatedName("ec.gi(Lbw;B)Z")
    public static boolean method2963(class62 arg0) {
        if (field860 == 0) {
            return false;
        } else if (Statics.field138 == arg0) {
            return method147();
        } else {
            boolean var1 = (field860 & 0x4) != 0;
            boolean var2 = var1;
            if (!var1) {
                boolean var3 = (field860 & 0x1) != 0;
                var2 = var3 && arg0.method1046();
            }
            boolean var4 = var2;
            if (!var2) {
                boolean var5 = (field860 & 0x2) != 0;
                var4 = var5 && arg0.method1038();
            }
            return var4;
        }
    }

    @ObfuscatedName("ik.gx(Lbn;IIIIII)V")
    public static final void method4385(class65 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method1043()) {
            return;
        }
        if (arg0 instanceof class74) {
            class274 var6 = ((class74) arg0).field1091;
            if (var6.field3589 != null) {
                var6 = var6.method4868();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class84.field1216;
        int[] var8 = class84.field1217;
        byte var9 = 0;
        if (arg1 < var7 && field642 == arg0.field929 && method2963((class62) arg0)) {
            class62 var10 = (class62) arg0;
            if (arg1 < var7) {
                method3106(arg0, arg0.field924 + 15);
                class302 var11 = (class302) field682.get(class298.field3731);
                byte var12 = 9;
                var11.method5267(var10.field597.method5130(), field729 + arg2, field730 + arg3 - var12, 16777215, 0);
                var9 = 18;
            }
        }
        int var13 = -2;
        if (!arg0.field950.method3805()) {
            method3106(arg0, arg0.field924 + 15);
            for (class73 var14 = (class73) arg0.field950.method3793(); var14 != null; var14 = (class73) arg0.field950.method3795()) {
                class66 var15 = var14.method1745(field642);
                if (var15 != null) {
                    class264 var16 = var14.field1079;
                    class324 var17 = var16.method4608();
                    class324 var18 = var16.method4599();
                    int var19 = 0;
                    int var20;
                    if (var17 == null || var18 == null) {
                        var20 = var16.field3373;
                    } else {
                        if (var16.field3371 * 2 < var18.field3872) {
                            var19 = var16.field3371;
                        }
                        var20 = var18.field3872 - var19 * 2;
                    }
                    int var21 = 255;
                    boolean var22 = true;
                    int var23 = field642 - var15.field987;
                    int var24 = var15.field986 * var20 / var16.field3373;
                    int var27;
                    if (var15.field989 > var23) {
                        int var25 = var16.field3383 == 0 ? 0 : var23 / var16.field3383 * var16.field3383;
                        int var26 = var15.field988 * var20 / var16.field3373;
                        var27 = (var24 - var26) * var25 / var15.field989 + var26;
                    } else {
                        var27 = var24;
                        int var28 = var15.field989 + var16.field3379 - var23;
                        if (var16.field3377 >= 0) {
                            var21 = (var28 << 8) / (var16.field3379 - var16.field3377);
                        }
                    }
                    if (var15.field986 > 0 && var27 < 1) {
                        var27 = 1;
                    }
                    if (var17 == null || var18 == null) {
                        var13 += 5;
                        if (field729 > -1) {
                            int var34 = field729 + arg2 - (var20 >> 1);
                            int var35 = field730 + arg3 - var13;
                            class320.method5483(var34, var35, var27, 5, 65280);
                            class320.method5483(var27 + var34, var35, var20 - var27, 5, 16711680);
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
                        int var31 = field729 + arg2 - (var20 >> 1);
                        int var32 = field730 + arg3 - var13;
                        int var33 = var31 - var19;
                        if (var21 >= 0 && var21 < 255) {
                            var17.method5573(var33, var32, var21);
                            class320.method5474(var33, var32, var29 + var33, var30 + var32);
                            var18.method5573(var33, var32, var21);
                        } else {
                            var17.method5567(var33, var32);
                            class320.method5474(var33, var32, var29 + var33, var30 + var32);
                            var18.method5567(var33, var32);
                        }
                        class320.method5454(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var13 += 2;
                    }
                } else if (var14.method1746()) {
                    var14.method3818();
                }
            }
        }
        if (var13 == -2) {
            var13 += 7;
        }
        int var36 = var9 + var13;
        if (arg1 < var7) {
            class62 var37 = (class62) arg0;
            if (var37.field595) {
                return;
            }
            if (var37.field624 != -1 || var37.field598 != -1) {
                method3106(arg0, arg0.field924 + 15);
                if (field729 > -1) {
                    if (var37.field624 != -1) {
                        var36 += 25;
                        Statics.field1933[var37.field624].method5567(field729 + arg2 - 12, field730 + arg3 - var36);
                    }
                    if (var37.field598 != -1) {
                        var36 += 25;
                        Statics.field1012[var37.field598].method5567(field729 + arg2 - 12, field730 + arg3 - var36);
                    }
                }
            }
            if (arg1 >= 0 && field650 == 10 && field697 == var8[arg1]) {
                method3106(arg0, arg0.field924 + 15);
                if (field729 > -1) {
                    int var38 = Statics.field3833[1].field3871 + var36;
                    Statics.field3833[1].method5567(field729 + arg2 - 12, field730 + arg3 - var38);
                }
            }
        } else {
            class274 var39 = ((class74) arg0).field1091;
            if (var39.field3589 != null) {
                var39 = var39.method4868();
            }
            if (var39.field3587 >= 0 && var39.field3587 < Statics.field1012.length) {
                method3106(arg0, arg0.field924 + 15);
                if (field729 > -1) {
                    Statics.field1012[var39.field3587].method5567(field729 + arg2 - 12, field730 + arg3 - 30);
                }
            }
            if (field650 == 1 && field757 == field674[arg1 - var7] && field642 % 20 < 10) {
                method3106(arg0, arg0.field924 + 15);
                if (field729 > -1) {
                    Statics.field3833[0].method5567(field729 + arg2 - 12, field730 + arg3 - 28);
                }
            }
        }
        if (arg0.field938 != null && (arg1 >= var7 || !arg0.field940 && (field846 == 4 || !arg0.field935 && (field846 == 0 || field846 == 3 || field846 == 1 && ((class62) arg0).method1046())))) {
            method3106(arg0, arg0.field924);
            if (field729 > -1 && field717 < field718) {
                field652[field717] = Statics.field2818.method5278(arg0.field938) / 2;
                field862[field717] = Statics.field2818.field3762;
                field719[field717] = field729;
                field750[field717] = field730;
                field723[field717] = arg0.field932;
                field724[field717] = arg0.field941;
                field823[field717] = arg0.field934;
                field726[field717] = arg0.field938;
                field717++;
            }
        }
        for (int var40 = 0; var40 < 4; var40++) {
            int var41 = arg0.field947[var40];
            int var42 = arg0.field953[var40];
            class270 var43 = null;
            int var44 = 0;
            if (var42 >= 0) {
                if (var41 <= field642) {
                    continue;
                }
                var43 = class270.method521(arg0.field953[var40]);
                var44 = var43.field3430;
                if (var43 != null && var43.field3434 != null) {
                    var43 = var43.method4709();
                    if (var43 == null) {
                        arg0.field947[var40] = -1;
                        continue;
                    }
                }
            } else if (var41 < 0) {
                continue;
            }
            int var45 = arg0.field948[var40];
            class270 var46 = null;
            if (var45 >= 0) {
                var46 = class270.method521(var45);
                if (var46 != null && var46.field3434 != null) {
                    var46 = var46.method4709();
                }
            }
            if (var41 - var44 <= field642) {
                if (var43 == null) {
                    arg0.field947[var40] = -1;
                } else {
                    method3106(arg0, arg0.field924 / 2);
                    if (field729 > -1) {
                        if (var40 == 1) {
                            field730 -= 20;
                        }
                        if (var40 == 2) {
                            field729 -= 15;
                            field730 -= 10;
                        }
                        if (var40 == 3) {
                            field729 += 15;
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
                        class324 var72 = var43.method4690();
                        if (var72 != null) {
                            var51 = var72.field3872;
                            int var73 = var72.field3871;
                            if (var73 > var71) {
                                var71 = var73;
                            }
                            var55 = var72.field3874;
                        }
                        class324 var74 = var43.method4685();
                        if (var74 != null) {
                            var52 = var74.field3872;
                            int var75 = var74.field3871;
                            if (var75 > var71) {
                                var71 = var75;
                            }
                            var56 = var74.field3874;
                        }
                        class324 var76 = var43.method4686();
                        if (var76 != null) {
                            var53 = var76.field3872;
                            int var77 = var76.field3871;
                            if (var77 > var71) {
                                var71 = var77;
                            }
                            var57 = var76.field3874;
                        }
                        class324 var78 = var43.method4684();
                        if (var78 != null) {
                            var54 = var78.field3872;
                            int var79 = var78.field3871;
                            if (var79 > var71) {
                                var71 = var79;
                            }
                            var58 = var78.field3874;
                        }
                        if (var46 != null) {
                            var59 = var46.method4690();
                            if (var59 != null) {
                                var63 = var59.field3872;
                                int var80 = var59.field3871;
                                if (var80 > var71) {
                                    var71 = var80;
                                }
                                var67 = var59.field3874;
                            }
                            var60 = var46.method4685();
                            if (var60 != null) {
                                var64 = var60.field3872;
                                int var81 = var60.field3871;
                                if (var81 > var71) {
                                    var71 = var81;
                                }
                                var68 = var60.field3874;
                            }
                            var61 = var46.method4686();
                            if (var61 != null) {
                                var65 = var61.field3872;
                                int var82 = var61.field3871;
                                if (var82 > var71) {
                                    var71 = var82;
                                }
                                var69 = var61.field3874;
                            }
                            var62 = var46.method4684();
                            if (var62 != null) {
                                var66 = var62.field3872;
                                int var83 = var62.field3871;
                                if (var83 > var71) {
                                    var71 = var83;
                                }
                                var70 = var62.field3874;
                            }
                        }
                        class301 var84 = var43.method4696();
                        if (var84 == null) {
                            var84 = Statics.field479;
                        }
                        class301 var85;
                        if (var46 == null) {
                            var85 = Statics.field479;
                        } else {
                            var85 = var46.method4696();
                            if (var85 == null) {
                                var85 = Statics.field479;
                            }
                        }
                        Object var86 = null;
                        String var87 = null;
                        boolean var88 = false;
                        int var89 = 0;
                        String var90 = var43.method4683(arg0.field957[var40]);
                        int var91 = var84.method5278(var90);
                        if (var46 != null) {
                            var87 = var46.method4683(arg0.field944[var40]);
                            var89 = var85.method5278(var87);
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
                        int var108 = arg0.field947[var40] - field642;
                        int var109 = var43.field3419 - var43.field3419 * var108 / var43.field3430;
                        int var110 = var43.field3436 * var108 / var43.field3430 + -var43.field3436;
                        int var111 = field729 + arg2 - (var100 >> 1) + var109;
                        int var112 = field730 + arg3 - 12 + var110;
                        int var113 = var112;
                        int var114 = var71 + var112;
                        int var115 = var43.field3440 + var112 + 15;
                        int var116 = var115 - var84.field3763;
                        int var117 = var84.field3764 + var115;
                        if (var116 < var112) {
                            var113 = var116;
                        }
                        if (var117 > var114) {
                            var114 = var117;
                        }
                        int var118 = 0;
                        if (var46 != null) {
                            var118 = var46.field3440 + var112 + 15;
                            int var119 = var118 - var85.field3763;
                            int var120 = var85.field3764 + var118;
                            if (var119 < var113) {
                                ;
                            }
                            if (var120 > var114) {
                                ;
                            }
                        }
                        int var123 = 255;
                        if (var43.field3437 >= 0) {
                            var123 = (var108 << 8) / (var43.field3430 - var43.field3437);
                        }
                        if (var123 >= 0 && var123 < 255) {
                            if (var72 != null) {
                                var72.method5573(var95 + var111 - var55, var112, var123);
                            }
                            if (var76 != null) {
                                var76.method5573(var96 + var111 - var57, var112, var123);
                            }
                            if (var74 != null) {
                                for (int var124 = 0; var124 < var92; var124++) {
                                    var74.method5573(var52 * var124 + (var97 + var111 - var56), var112, var123);
                                }
                            }
                            if (var78 != null) {
                                var78.method5573(var101 + var111 - var58, var112, var123);
                            }
                            var84.method5210(var90, var98 + var111, var115, var43.field3435, 0, var123);
                            if (var46 != null) {
                                if (var59 != null) {
                                    var59.method5573(var102 + var111 - var67, var112, var123);
                                }
                                if (var61 != null) {
                                    var61.method5573(var103 + var111 - var69, var112, var123);
                                }
                                if (var60 != null) {
                                    for (int var125 = 0; var125 < var93; var125++) {
                                        var60.method5573(var64 * var125 + (var104 + var111 - var68), var112, var123);
                                    }
                                }
                                if (var62 != null) {
                                    var62.method5573(var105 + var111 - var70, var112, var123);
                                }
                                var85.method5210(var87, var106 + var111, var118, var46.field3435, 0, var123);
                            }
                        } else {
                            if (var72 != null) {
                                var72.method5567(var95 + var111 - var55, var112);
                            }
                            if (var76 != null) {
                                var76.method5567(var96 + var111 - var57, var112);
                            }
                            if (var74 != null) {
                                for (int var126 = 0; var126 < var92; var126++) {
                                    var74.method5567(var52 * var126 + (var97 + var111 - var56), var112);
                                }
                            }
                            if (var78 != null) {
                                var78.method5567(var101 + var111 - var58, var112);
                            }
                            var84.method5225(var90, var98 + var111, var115, var43.field3435 | 0xFF000000, 0);
                            if (var46 != null) {
                                if (var59 != null) {
                                    var59.method5567(var102 + var111 - var67, var112);
                                }
                                if (var61 != null) {
                                    var61.method5567(var103 + var111 - var69, var112);
                                }
                                if (var60 != null) {
                                    for (int var127 = 0; var127 < var93; var127++) {
                                        var60.method5567(var64 * var127 + (var104 + var111 - var68), var112);
                                    }
                                }
                                if (var62 != null) {
                                    var62.method5567(var105 + var111 - var70, var112);
                                }
                                var85.method5225(var87, var106 + var111, var118, var46.field3435 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("p.gf(I)V")
    public static final void method82() {
        field806 = 0;
        int var0 = (Statics.field138.field943 >> 7) + Statics.field321;
        int var1 = (Statics.field138.field925 >> 7) + Statics.field2611;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field806 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field806 = 1;
        }
        if (field806 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field806 = 0;
        }
    }

    @ObfuscatedName("br.gn(IIIIS)V")
    public static final void method1774(int arg0, int arg1, int arg2, int arg3) {
        method82();
    }

    @ObfuscatedName("fk.go(Lbn;II)V")
    public static final void method3106(class65 arg0, int arg1) {
        method904(arg0.field943, arg0.field925, arg1);
    }

    @ObfuscatedName("an.gl(IIII)V")
    public static final void method904(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field729 = -1;
            field730 = -1;
            return;
        }
        int var3 = method701(arg0, arg1, Statics.field1983) - arg2;
        int var4 = arg0 - Statics.field81;
        int var5 = var3 - Statics.field322;
        int var6 = arg1 - Statics.field2853;
        int var7 = class125.field1749[Statics.field907];
        int var8 = class125.field1743[Statics.field907];
        int var9 = class125.field1749[Statics.field3385];
        int var10 = class125.field1743[Statics.field3385];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field729 = field707 * var11 / var15 + field890 / 2;
            field730 = field707 * var14 / var15 + field836 / 2;
        } else {
            field729 = -1;
            field730 = -1;
        }
    }

    @ObfuscatedName("au.gy(IIIB)I")
    public static final int method701(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class51.field482[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class51.field492[var5][var3][var4] + class51.field492[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class51.field492[var5][var3][var4 + 1] + class51.field492[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("ex.gh(IIIIIIII)V")
    public static final void method2971(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg6 - 334;
        if (var7 < 0) {
            var7 = 0;
        } else if (var7 > 100) {
            var7 = 100;
        }
        int var8 = (field883 - field736) * var7 / 100 + field736;
        int var9 = arg5 * var8 / 256;
        int var11 = 2048 - arg3 & 0x7FF;
        int var12 = 2048 - arg4 & 0x7FF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var9;
        if (var11 != 0) {
            int var16 = class125.field1749[var11];
            int var17 = class125.field1743[var11];
            int var18 = var14 * var17 - var9 * var16 >> 16;
            var15 = var14 * var16 + var9 * var17 >> 16;
            var14 = var18;
        }
        if (var12 != 0) {
            int var19 = class125.field1749[var12];
            int var20 = class125.field1743[var12];
            int var21 = var13 * var20 + var15 * var19 >> 16;
            var15 = var15 * var20 - var13 * var19 >> 16;
            var13 = var21;
        }
        Statics.field81 = arg0 - var13;
        Statics.field322 = arg1 - var14;
        Statics.field2853 = arg2 - var15;
        Statics.field907 = arg3;
        Statics.field3385 = arg4;
        if (field705 != 1 || field740 < 2 || field642 % 50 != 0 || !(Statics.field592 >> 7 != Statics.field138.field943 >> 7 || Statics.field2056 >> 7 != Statics.field138.field925 >> 7)) {
            return;
        }
        int var22 = Statics.field138.field600;
        int var23 = (Statics.field592 >> 7) + Statics.field321;
        int var24 = (Statics.field2056 >> 7) + Statics.field2611;
        class175 var25 = class175.method85(class172.field2269, field861.field1287);
        var25.field2335.method3389(field712);
        var25.field2335.method3343(var24);
        var25.field2335.method3371(var22);
        var25.field2335.method3330(var23);
        field861.method1944(var25);
    }

    @ObfuscatedName("il.gj(ZLgl;B)V")
    public static final void method4520(boolean arg0, class192 arg1) {
        field689 = arg0;
        if (!field689) {
            int var2 = arg1.method3420();
            int var3 = arg1.method3548();
            int var4 = arg1.method3346();
            Statics.field239 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field239[var5][var6] = arg1.method3432();
                }
            }
            Statics.field279 = new int[var4];
            Statics.field2412 = new int[var4];
            Statics.field1839 = new int[var4];
            Statics.field1126 = new byte[var4][];
            Statics.field268 = new byte[var4][];
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
                        Statics.field279[var8] = var11;
                        Statics.field2412[var8] = Statics.field1211.method4312("m" + var9 + "_" + var10);
                        Statics.field1839[var8] = Statics.field1211.method4312("l" + var9 + "_" + var10);
                        var8++;
                    }
                }
            }
            method33(var3, var2, true);
            return;
        }
        int var12 = arg1.method3548();
        int var13 = arg1.method3420();
        boolean var14 = arg1.method3344() == 1;
        int var15 = arg1.method3346();
        arg1.method3598();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = arg1.method3599(1);
                    if (var19 == 1) {
                        field690[var16][var17][var18] = arg1.method3599(26);
                    } else {
                        field690[var16][var17][var18] = -1;
                    }
                }
            }
        }
        arg1.method3597();
        Statics.field239 = new int[var15][4];
        for (int var20 = 0; var20 < var15; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field239[var20][var21] = arg1.method3432();
            }
        }
        Statics.field279 = new int[var15];
        Statics.field2412 = new int[var15];
        Statics.field1839 = new int[var15];
        Statics.field1126 = new byte[var15][];
        Statics.field268 = new byte[var15][];
        int var22 = 0;
        for (int var23 = 0; var23 < 4; var23++) {
            for (int var24 = 0; var24 < 13; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    int var26 = field690[var23][var24][var25];
                    if (var26 != -1) {
                        int var27 = var26 >> 14 & 0x3FF;
                        int var28 = var26 >> 3 & 0x7FF;
                        int var29 = (var27 / 8 << 8) + var28 / 8;
                        for (int var30 = 0; var30 < var22; var30++) {
                            if (Statics.field279[var30] == var29) {
                                var29 = -1;
                                break;
                            }
                        }
                        if (var29 != -1) {
                            Statics.field279[var22] = var29;
                            int var31 = var29 >> 8 & 0xFF;
                            int var32 = var29 & 0xFF;
                            Statics.field2412[var22] = Statics.field1211.method4312("m" + var31 + "_" + var32);
                            Statics.field1839[var22] = Statics.field1211.method4312("l" + var31 + "_" + var32);
                            var22++;
                        }
                    }
                }
            }
        }
        method33(var13, var12, !var14);
    }

    @ObfuscatedName("s.ge(IIZI)V")
    public static final void method33(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field557 == arg0 && Statics.field2025 == arg1) {
            return;
        }
        Statics.field557 = arg0;
        Statics.field2025 = arg1;
        method34(25);
        method96(class240.field2980, true);
        int var3 = Statics.field321;
        int var4 = Statics.field2611;
        Statics.field321 = (arg0 - 6) * 8;
        Statics.field2611 = (arg1 - 6) * 8;
        int var5 = Statics.field321 - var3;
        int var6 = Statics.field2611 - var4;
        int var7 = Statics.field321;
        int var8 = Statics.field2611;
        for (int var9 = 0; var9 < 32768; var9++) {
            class74 var10 = field672[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field954[var11] -= var5;
                    var10.field981[var11] -= var6;
                }
                var10.field943 -= var5 * 128;
                var10.field925 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class62 var13 = field746[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field954[var14] -= var5;
                    var13.field981[var14] -= var6;
                }
                var13.field943 -= var5 * 128;
                var13.field925 -= var6 * 128;
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
                        field659[var25][var21][var22] = field659[var25][var23][var24];
                    } else {
                        field659[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class64 var26 = (class64) field759.method3827(); var26 != null; var26 = (class64) field759.method3829()) {
            var26.field912 -= var5;
            var26.field913 -= var6;
            if (var26.field912 < 0 || var26.field913 < 0 || var26.field912 >= 104 || var26.field913 >= 104) {
                var26.method3818();
            }
        }
        if (field693 != 0) {
            field693 -= var5;
            field891 -= var6;
        }
        field868 = 0;
        field874 = false;
        Statics.field81 -= var5 << 7;
        Statics.field2853 -= var6 << 7;
        Statics.field592 -= var5 << 7;
        Statics.field2056 -= var6 << 7;
        field671 = -1;
        field761.method3844();
        field760.method3844();
        for (int var27 = 0; var27 < 4; var27++) {
            field688[var27].method3192();
        }
    }

    @ObfuscatedName("df.gt(ZB)V")
    public static final void method2905(boolean arg0) {
        method928();
        field861.field1279++;
        if (field861.field1279 < 50 && !arg0) {
            return;
        }
        field861.field1279 = 0;
        if (field898 || field861.method1957() == null) {
            return;
        }
        class175 var1 = class175.method85(class172.field2230, field861.field1287);
        field861.method1944(var1);
        try {
            field861.method1962();
        } catch (IOException var3) {
            field898 = true;
        }
    }

    @ObfuscatedName("ha.gb(IIIIIB)V")
    public static final void method4254(int arg0, int arg1, int arg2, int arg3, int arg4) {
        long var5 = Statics.field3406.method2749(arg0, arg1, arg2);
        if (var5 != 0L) {
            int var7 = Statics.field3406.method2753(arg0, arg1, arg2, var5);
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
            int[] var14 = Statics.field139.field3873;
            int var15 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var16 = class123.method1777(var5);
            class271 var17 = class271.method1776(var16);
            if (var17.field3457 == -1) {
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
                class323 var18 = Statics.field1856[var17.field3457];
                if (var18 != null) {
                    int var19 = (var17.field3449 * 4 - var18.field3865) / 2;
                    int var20 = (var17.field3492 * 4 - var18.field3868) / 2;
                    var18.method5539(arg1 * 4 + 48 + var19, (104 - arg2 - var17.field3492) * 4 + 48 + var20);
                }
            }
        }
        long var21 = Statics.field3406.method2779(arg0, arg1, arg2);
        if (var21 != 0L) {
            int var23 = Statics.field3406.method2753(arg0, arg1, arg2, var21);
            int var24 = var23 >> 6 & 0x3;
            int var25 = var23 & 0x1F;
            int var26 = class123.method1777(var21);
            class271 var27 = class271.method1776(var26);
            if (var27.field3457 != -1) {
                class323 var28 = Statics.field1856[var27.field3457];
                if (var28 != null) {
                    int var29 = (var27.field3449 * 4 - var28.field3865) / 2;
                    int var30 = (var27.field3492 * 4 - var28.field3868) / 2;
                    var28.method5539(arg1 * 4 + 48 + var29, (104 - arg2 - var27.field3492) * 4 + 48 + var30);
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
                int[] var35 = Statics.field139.field3873;
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
        long var37 = Statics.field3406.method2790(arg0, arg1, arg2);
        if (var37 == 0L) {
            return;
        }
        int var39 = class123.method1777(var37);
        class271 var40 = class271.method1776(var39);
        if (var40.field3457 == -1) {
            return;
        }
        class323 var41 = Statics.field1856[var40.field3457];
        if (var41 != null) {
            int var42 = (var40.field3449 * 4 - var41.field3865) / 2;
            int var43 = (var40.field3492 * 4 - var41.field3868) / 2;
            var41.method5539(arg1 * 4 + 48 + var42, (104 - arg2 - var40.field3492) * 4 + 48 + var43);
        }
    }

    @ObfuscatedName("client.gz(Lcq;I)Z")
    public final boolean method1102(class90 arg0) {
        class160 var2 = arg0.method1957();
        class192 var3 = arg0.field1281;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1276 == null) {
                if (arg0.field1283) {
                    if (!var2.method3119(1)) {
                        return false;
                    }
                    var2.method3111(arg0.field1281.field2415, 0, 1);
                    arg0.field1284 = 0;
                    arg0.field1283 = false;
                }
                var3.field2414 = 0;
                if (var3.method3629()) {
                    if (!var2.method3119(1)) {
                        return false;
                    }
                    var2.method3111(arg0.field1281.field2415, 1, 1);
                    arg0.field1284 = 0;
                }
                arg0.field1283 = true;
                class171[] var4 = class171.method658();
                int var5 = var3.method3608();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field2414);
                }
                arg0.field1276 = var4[var5];
                arg0.field1285 = arg0.field1276.field2147;
            }
            if (arg0.field1285 == -1) {
                if (!var2.method3119(1)) {
                    return false;
                }
                arg0.method1957().method3111(var3.field2415, 0, 1);
                arg0.field1285 = var3.field2415[0] & 0xFF;
            }
            if (arg0.field1285 == -2) {
                if (!var2.method3119(2)) {
                    return false;
                }
                arg0.method1957().method3111(var3.field2415, 0, 2);
                var3.field2414 = 0;
                arg0.field1285 = var3.method3346();
            }
            if (!var2.method3119(arg0.field1285)) {
                return false;
            }
            var3.field2414 = 0;
            var2.method3111(var3.field2415, 0, arg0.field1285);
            arg0.field1284 = 0;
            field875.method4943();
            arg0.field1288 = arg0.field1275;
            arg0.field1275 = arg0.field1286;
            arg0.field1286 = arg0.field1276;
            if (class171.field2177 == arg0.field1276) {
                int var6 = var3.method3344();
                int var7 = var3.method3344();
                int var8 = var3.method3344();
                int var9 = var3.method3344();
                field685[var6] = true;
                field678[var6] = var7;
                field877[var6] = var8;
                field878[var6] = var9;
                field879[var6] = 0;
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2175 == arg0.field1276) {
                String var10 = var3.method3353();
                long var11 = var3.method3437();
                long var13 = (long) var3.method3346();
                long var15 = (long) var3.method3348();
                class245 var17 = (class245) Statics.method1912(class245.method4128(), var3.method3344());
                long var18 = (var13 << 32) + var15;
                boolean var20 = false;
                for (int var21 = 0; var21 < 100; var21++) {
                    if (field849[var21] == var18) {
                        var20 = true;
                        break;
                    }
                }
                if (var17.field3193 && Statics.field1863.method1572(new class294(var10, Statics.field3846))) {
                    var20 = true;
                }
                if (!var20 && field806 == 0) {
                    field849[field850] = var18;
                    field850 = (field850 + 1) % 100;
                    String var22 = class302.method5208(class308.method4258(class303.method4323(var3)));
                    if (var17.field3186 == -1) {
                        Statics.method630(9, var10, var22, class306.method2933(var11));
                    } else {
                        Statics.method630(9, class76.method87(var17.field3186) + var10, var22, class306.method2933(var11));
                    }
                }
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2131 == arg0.field1276) {
                String var23 = var3.method3353();
                long var24 = (long) var3.method3346();
                long var26 = (long) var3.method3348();
                class245 var28 = (class245) Statics.method1912(class245.method4128(), var3.method3344());
                long var29 = (var24 << 32) + var26;
                boolean var31 = false;
                for (int var32 = 0; var32 < 100; var32++) {
                    if (field849[var32] == var29) {
                        var31 = true;
                        break;
                    }
                }
                if (Statics.field1863.method1572(new class294(var23, Statics.field3846))) {
                    var31 = true;
                }
                if (!var31 && field806 == 0) {
                    field849[field850] = var29;
                    field850 = (field850 + 1) % 100;
                    String var33 = class302.method5208(class308.method4258(class303.method4323(var3)));
                    byte var34;
                    if (var28.field3192) {
                        var34 = 7;
                    } else {
                        var34 = 3;
                    }
                    if (var28.field3186 == -1) {
                        class86.method3230(var34, var23, var33);
                    } else {
                        class86.method3230(var34, class76.method87(var28.field3186) + var23, var33);
                    }
                }
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2163 == arg0.field1276) {
                method437(class174.field2322);
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2205 == arg0.field1276) {
                int var35 = var3.method3420();
                field790 = var35;
                this.method1106(false);
                method3157(var35);
                class71.method3326(field790);
                for (int var36 = 0; var36 < 100; var36++) {
                    field828[var36] = true;
                }
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2200 == arg0.field1276) {
                class84.method4277(var3, arg0.field1285);
                method3143();
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2178 == arg0.field1276) {
                int var37 = var3.method3420();
                int var38 = var3.method3420();
                int var39 = var3.method3420();
                int var40 = var3.method3393();
                class233 var41 = class233.method1754(var40);
                if (var41.field2797 != var37 || var41.field2720 != var39 || var41.field2722 != var38) {
                    var41.field2797 = var37;
                    var41.field2720 = var39;
                    var41.field2722 = var38;
                    method272(var41);
                }
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2172 == arg0.field1276) {
                method4520(true, arg0.field1281);
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2129 == arg0.field1276) {
                method437(class174.field2325);
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2150 == arg0.field1276) {
                Statics.field1863.method1567();
                field881 = field815;
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2192 == arg0.field1276) {
                method1893();
                field798 = var3.method3544();
                field827 = field815;
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2151 == arg0.field1276) {
                method4098(true, var3);
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2196 == arg0.field1276) {
                field874 = true;
                Statics.field198 = var3.method3344();
                Statics.field2043 = var3.method3344();
                Statics.field625 = var3.method3346();
                Statics.field142 = var3.method3344();
                Statics.field311 = var3.method3344();
                if (Statics.field311 >= 100) {
                    Statics.field81 = Statics.field198 * 128 + 64;
                    Statics.field2853 = Statics.field2043 * 128 + 64;
                    Statics.field322 = method701(Statics.field81, Statics.field2853, Statics.field1983) - Statics.field625;
                }
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2127 == arg0.field1276) {
                method437(class174.field2331);
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2141 == arg0.field1276) {
                int var42 = var3.method3432();
                int var43 = var3.method3346();
                if (var43 == 65535) {
                    var43 = -1;
                }
                int var44 = var3.method3393();
                class233 var45 = class233.method1754(var42);
                if (var45.field2667) {
                    var45.field2786 = var43;
                    var45.field2795 = var44;
                    class272 var47 = class272.method92(var43);
                    var45.field2797 = var47.field3536;
                    var45.field2720 = var47.field3522;
                    var45.field2781 = var47.field3516;
                    var45.field2717 = var47.field3503;
                    var45.field2718 = var47.field3515;
                    var45.field2722 = var47.field3513;
                    if (var47.field3512 == 1) {
                        var45.field2727 = 1;
                    } else {
                        var45.field2727 = 2;
                    }
                    if (var45.field2723 > 0) {
                        var45.field2722 = var45.field2722 * 32 / var45.field2723;
                    } else if (var45.field2679 > 0) {
                        var45.field2722 = var45.field2722 * 32 / var45.field2679;
                    }
                    method272(var45);
                } else if (var43 == -1) {
                    var45.field2676 = 0;
                    arg0.field1276 = null;
                    return true;
                } else {
                    class272 var46 = class272.method92(var43);
                    var45.field2676 = 4;
                    var45.field2712 = var43;
                    var45.field2797 = var46.field3536;
                    var45.field2720 = var46.field3522;
                    var45.field2722 = var46.field3513 * 100 / var44;
                    method272(var45);
                }
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2122 == arg0.field1276) {
                method3000();
                arg0.field1276 = null;
                return false;
            }
            if (class171.field2180 == arg0.field1276) {
                int var48 = var3.method3392();
                int var49 = var3.method3386();
                int var50 = var3.method3385();
                class233 var51 = class233.method1754(var48);
                if (var51.field2735 != var50 || var51.field2678 != var49 || var51.field2695 != 0 || var51.field2669 != 0) {
                    var51.field2735 = var50;
                    var51.field2678 = var49;
                    var51.field2695 = 0;
                    var51.field2669 = 0;
                    method272(var51);
                    this.method1443(var51);
                    if (var51.field2670 == 0) {
                        method1742(Statics.field2657[var48 >> 16], var51, false);
                    }
                }
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2189 == arg0.field1276) {
                Statics.field93 = class310.method4284(var3.method3344());
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2198 == arg0.field1276) {
                int var52 = var3.method3373();
                int var53 = var3.method3392();
                int var54 = var3.method3420();
                class57 var55 = (class57) field889.method3774((long) var53);
                if (var55 != null) {
                    method4843(var55, var55.field558 != var54);
                }
                method273(var53, var54, var52);
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2143 == arg0.field1276) {
                int var56 = var3.method3392();
                int var57 = var3.method3548();
                int var58 = var57 >> 10 & 0x1F;
                int var59 = var57 >> 5 & 0x1F;
                int var60 = var57 & 0x1F;
                int var61 = (var60 << 3) + (var58 << 19) + (var59 << 11);
                class233 var62 = class233.method1754(var56);
                if (var62.field2743 != var61) {
                    var62.field2743 = var61;
                    method272(var62);
                }
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2195 == arg0.field1276) {
                field888 = var3.method3344();
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2169 == arg0.field1276) {
                int var63 = var3.method3391();
                int var64 = var3.method3548();
                if (var64 == 65535) {
                    var64 = -1;
                }
                int var65 = var3.method3393();
                int var66 = var3.method3346();
                if (var66 == 65535) {
                    var66 = -1;
                }
                for (int var67 = var66; var67 <= var64; var67++) {
                    long var68 = ((long) var65 << 32) + (long) var67;
                    class207 var70 = field832.method3774(var68);
                    if (var70 != null) {
                        var70.method3818();
                    }
                    field832.method3773(new class214(var63), var68);
                }
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2138 == arg0.field1276) {
                Statics.field2428 = var3.method3375();
                Statics.field2466 = var3.method3374();
                while (var3.field2414 < arg0.field1285) {
                    int var71 = var3.method3344();
                    class174 var72 = class174.method461()[var71];
                    method437(var72);
                }
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2128 == arg0.field1276) {
                int var73 = var3.method3392();
                class233 var74 = class233.method1754(var73);
                for (int var75 = 0; var75 < var74.field2792.length; var75++) {
                    var74.field2792[var75] = -1;
                    var74.field2792[var75] = 0;
                }
                method272(var74);
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2171 == arg0.field1276) {
                method1893();
                field640 = var3.method3344();
                field827 = field815;
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2121 == arg0.field1276) {
                int var76 = var3.method3432();
                int var77 = var3.method3346();
                if (var76 < -70000) {
                    var77 += 32768;
                }
                class233 var78;
                if (var76 >= 0) {
                    var78 = class233.method1754(var76);
                } else {
                    var78 = null;
                }
                while (var3.field2414 < arg0.field1285) {
                    int var79 = var3.method3358();
                    int var80 = var3.method3346();
                    int var81 = 0;
                    if (var80 != 0) {
                        var81 = var3.method3344();
                        if (var81 == 255) {
                            var81 = var3.method3432();
                        }
                    }
                    if (var78 != null && var79 >= 0 && var79 < var78.field2792.length) {
                        var78.field2792[var79] = var80;
                        var78.field2806[var79] = var81;
                    }
                    class55.method504(var77, var79, var80 - 1, var81);
                }
                if (var78 != null) {
                    method272(var78);
                }
                method1893();
                field654[++field819 - 1 & 0x1F] = var77 & 0x7FFF;
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2188 == arg0.field1276) {
                field874 = false;
                for (int var82 = 0; var82 < 5; var82++) {
                    field685[var82] = false;
                }
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2135 == arg0.field1276) {
                if (Statics.field2353 != null) {
                    Statics.field2353.method5159(var3);
                }
                method2514();
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2207 == arg0.field1276) {
                int var83 = var3.method3358();
                boolean var84 = var3.method3344() == 1;
                String var85 = "";
                boolean var86 = false;
                if (var84) {
                    var85 = var3.method3353();
                    if (Statics.field1863.method1572(new class294(var85, Statics.field3846))) {
                        var86 = true;
                    }
                }
                String var87 = var3.method3353();
                if (!var86) {
                    class86.method3230(var83, var85, var87);
                }
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2187 == arg0.field1276) {
                int var88 = var3.method3373();
                int var89 = var3.method3373();
                String var90 = var3.method3353();
                if (var89 >= 1 && var89 <= 8) {
                    if (var90.equalsIgnoreCase(class240.field2865)) {
                        var90 = null;
                    }
                    field754[var89 - 1] = var90;
                    field755[var89 - 1] = var88 == 0;
                }
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2179 == arg0.field1276) {
                Statics.field1863.method1568(var3, arg0.field1285);
                field881 = field815;
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2199 == arg0.field1276) {
                method1921(var3.method3353());
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2191 == arg0.field1276) {
                int var91 = var3.method3432();
                int var92 = var3.method3346();
                if (var91 < -70000) {
                    var92 += 32768;
                }
                class233 var93;
                if (var91 >= 0) {
                    var93 = class233.method1754(var91);
                } else {
                    var93 = null;
                }
                if (var93 != null) {
                    for (int var94 = 0; var94 < var93.field2792.length; var94++) {
                        var93.field2792[var94] = 0;
                        var93.field2806[var94] = 0;
                    }
                }
                class55.method105(var92);
                int var95 = var3.method3346();
                for (int var96 = 0; var96 < var95; var96++) {
                    int var97 = var3.method3346();
                    int var98 = var3.method3344();
                    if (var98 == 255) {
                        var98 = var3.method3393();
                    }
                    if (var93 != null && var96 < var93.field2792.length) {
                        var93.field2792[var96] = var97;
                        var93.field2806[var96] = var98;
                    }
                    class55.method504(var92, var96, var97 - 1, var98);
                }
                if (var93 != null) {
                    method272(var93);
                }
                method1893();
                field654[++field819 - 1 & 0x1F] = var92 & 0x7FFF;
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2132 == arg0.field1276) {
                method437(class174.field2323);
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2162 == arg0.field1276) {
                int var99 = var3.method3548();
                int var100 = var3.method3356();
                int var101 = var3.method3392();
                class233 var102 = class233.method1754(var101);
                var102.field2724 = (var100 << 16) + var99;
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2158 == arg0.field1276) {
                for (int var103 = 0; var103 < Statics.field3300; var103++) {
                    class257 var104 = class257.method3019(var103);
                    if (var104 != null) {
                        class228.field2626[var103] = 0;
                        class228.field2628[var103] = 0;
                    }
                }
                method1893();
                field817 += 32;
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2202 == arg0.field1276) {
                method437(class174.field2329);
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2125 == arg0.field1276) {
                int var105 = var3.method3346();
                int var106 = var3.method3432();
                class228.field2626[var105] = var106;
                if (class228.field2628[var105] != var106) {
                    class228.field2628[var105] = var106;
                }
                method290(var105);
                field816[++field817 - 1 & 0x1F] = var105;
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2136 == arg0.field1276) {
                int var107 = var3.method3544();
                int var108 = var3.method3393();
                class233 var109 = class233.method1754(var108);
                if (var109.field2715 != var107 || var107 == -1) {
                    var109.field2715 = var107;
                    var109.field2796 = 0;
                    var109.field2773 = 0;
                    method272(var109);
                }
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2170 == arg0.field1276) {
                int var110 = arg0.field1285 + var3.field2414;
                int var111 = var3.method3346();
                int var112 = var3.method3346();
                if (field790 != var111) {
                    field790 = var111;
                    this.method1106(false);
                    method3157(field790);
                    class71.method3326(field790);
                    for (int var113 = 0; var113 < 100; var113++) {
                        field828[var113] = true;
                    }
                }
                while (var112-- > 0) {
                    int var114 = var3.method3432();
                    int var115 = var3.method3346();
                    int var116 = var3.method3344();
                    class57 var117 = (class57) field889.method3774((long) var114);
                    if (var117 != null && var117.field558 != var115) {
                        method4843(var117, true);
                        var117 = null;
                    }
                    if (var117 == null) {
                        var117 = method273(var114, var115, var116);
                    }
                    var117.field556 = true;
                }
                for (class57 var118 = (class57) field889.method3781(); var118 != null; var118 = (class57) field889.method3777()) {
                    if (var118.field556) {
                        var118.field556 = false;
                    } else {
                        method4843(var118, true);
                    }
                }
                field832 = new class205(512);
                while (var3.field2414 < var110) {
                    int var119 = var3.method3432();
                    int var120 = var3.method3346();
                    int var121 = var3.method3346();
                    int var122 = var3.method3432();
                    for (int var123 = var120; var123 <= var121; var123++) {
                        long var124 = ((long) var119 << 32) + (long) var123;
                        field832.method3773(new class214(var122), var124);
                    }
                }
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2181 == arg0.field1276) {
                int var126 = var3.method3432();
                class57 var127 = (class57) field889.method3774((long) var126);
                if (var127 != null) {
                    method4843(var127, true);
                }
                if (field796 != null) {
                    method272(field796);
                    field796 = null;
                }
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2176 == arg0.field1276) {
                int var128 = var3.method3344();
                method3240(var128);
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2204 == arg0.field1276) {
                field874 = true;
                Statics.field1031 = var3.method3344();
                Statics.field178 = var3.method3344();
                Statics.field2537 = var3.method3346();
                Statics.field2343 = var3.method3344();
                Statics.field42 = var3.method3344();
                if (Statics.field42 >= 100) {
                    int var129 = Statics.field1031 * 128 + 64;
                    int var130 = Statics.field178 * 128 + 64;
                    int var131 = method701(var129, var130, Statics.field1983) - Statics.field2537;
                    int var132 = var129 - Statics.field81;
                    int var133 = var131 - Statics.field322;
                    int var134 = var130 - Statics.field2853;
                    int var135 = (int) Math.sqrt((double) (var132 * var132 + var134 * var134));
                    Statics.field907 = (int) (Math.atan2((double) var133, (double) var135) * 325.949D) & 0x7FF;
                    Statics.field3385 = (int) (Math.atan2((double) var132, (double) var134) * -325.949D) & 0x7FF;
                    if (Statics.field907 < 128) {
                        Statics.field907 = 128;
                    }
                    if (Statics.field907 > 383) {
                        Statics.field907 = 383;
                    }
                }
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2123 == arg0.field1276) {
                method437(class174.field2327);
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2173 == arg0.field1276) {
                if (field790 != -1) {
                    method1829(field790, 0);
                }
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2142 == arg0.field1276) {
                int var136 = var3.method3432();
                boolean var137 = var3.method3344() == 1;
                class233 var138 = class233.method1754(var136);
                if (var138.field2693 != var137) {
                    var138.field2693 = var137;
                    method272(var138);
                }
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2185 == arg0.field1276) {
                Statics.field2466 = var3.method3374();
                Statics.field2428 = var3.method3375();
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2197 == arg0.field1276) {
                var3.field2414 += 28;
                if (var3.method3369()) {
                    method51(var3, var3.field2414 - 28);
                }
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2167 == arg0.field1276) {
                int var139 = var3.method3356();
                class55.method279(var139);
                field654[++field819 - 1 & 0x1F] = var139 & 0x7FFF;
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2148 == arg0.field1276) {
                boolean var140 = var3.method3344() == 1;
                if (var140) {
                    Statics.field1226 = Statics.method1926() - var3.method3437();
                    Statics.field1764 = new class2(var3, true);
                } else {
                    Statics.field1764 = null;
                }
                field826 = field815;
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2203 == arg0.field1276) {
                int var141 = var3.method3432();
                int var142 = var3.method3432();
                class57 var143 = (class57) field889.method3774((long) var142);
                class57 var144 = (class57) field889.method3774((long) var141);
                if (var144 != null) {
                    method4843(var144, var143 == null || var143.field558 != var144.field558);
                }
                if (var143 != null) {
                    var143.method3818();
                    field889.method3773(var143, (long) var141);
                }
                class233 var145 = class233.method1754(var142);
                if (var145 != null) {
                    method272(var145);
                }
                class233 var146 = class233.method1754(var141);
                if (var146 != null) {
                    method272(var146);
                    method1742(Statics.field2657[var146.field2731 >>> 16], var146, true);
                }
                if (field790 != -1) {
                    method1829(field790, 1);
                }
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2152 == arg0.field1276) {
                int var147 = var3.method3393();
                int var148 = var3.method3420();
                class233 var149 = class233.method1754(var147);
                if (var149.field2676 != 1 || var149.field2712 != var148) {
                    var149.field2676 = 1;
                    var149.field2712 = var148;
                    method272(var149);
                }
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2154 == arg0.field1276) {
                method4098(false, var3);
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2184 == arg0.field1276) {
                field650 = var3.method3344();
                if (field650 == 1) {
                    field757 = var3.method3346();
                }
                if (field650 >= 2 && field650 <= 6) {
                    if (field650 == 2) {
                        field656 = 64;
                        field657 = 64;
                    }
                    if (field650 == 3) {
                        field656 = 0;
                        field657 = 64;
                    }
                    if (field650 == 4) {
                        field656 = 128;
                        field657 = 64;
                    }
                    if (field650 == 5) {
                        field656 = 64;
                        field657 = 0;
                    }
                    if (field650 == 6) {
                        field656 = 64;
                        field657 = 128;
                    }
                    field650 = 2;
                    field653 = var3.method3346();
                    field797 = var3.method3346();
                    field900 = var3.method3344();
                }
                if (field650 == 10) {
                    field697 = var3.method3346();
                }
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2153 == arg0.field1276) {
                Statics.field1863.field1025.method5025(var3, arg0.field1285);
                method2951();
                field881 = field815;
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2155 == arg0.field1276) {
                method437(class174.field2324);
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2165 == arg0.field1276) {
                int var150 = var3.method3393();
                int var151 = var3.method3420();
                class233 var152 = class233.method1754(var150);
                if (var152 != null && var152.field2670 == 0) {
                    if (var151 > var152.field2692 - var152.field2684) {
                        var151 = var152.field2692 - var152.field2684;
                    }
                    if (var151 < 0) {
                        var151 = 0;
                    }
                    if (var152.field2690 != var151) {
                        var152.field2690 = var151;
                        method272(var152);
                    }
                }
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2145 == arg0.field1276) {
                String var153 = var3.method3353();
                String var154 = class302.method5208(class308.method4258(class303.method4323(var3)));
                class86.method3230(6, var153, var154);
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2144 == arg0.field1276) {
                int var155 = var3.method3420();
                if (var155 == 65535) {
                    var155 = -1;
                }
                method274(var155);
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2161 == arg0.field1276) {
                int var156 = var3.method3387();
                int var157 = var3.method3548();
                if (var157 == 65535) {
                    var157 = -1;
                }
                method642(var157, var156);
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2182 == arg0.field1276) {
                int var158 = var3.method3432();
                if (field712 != var158) {
                    field712 = var158;
                    method86();
                }
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2174 == arg0.field1276) {
                method437(class174.field2330);
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2137 == arg0.field1276) {
                method4520(false, arg0.field1281);
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2133 == arg0.field1276) {
                method437(class174.field2326);
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2156 == arg0.field1276) {
                int var159 = var3.method3420();
                int var160 = var3.method3393();
                class233 var161 = class233.method1754(var160);
                if (var161.field2676 != 2 || var161.field2712 != var159) {
                    var161.field2676 = 2;
                    var161.field2712 = var159;
                    method272(var161);
                }
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2194 == arg0.field1276) {
                for (int var162 = 0; var162 < class228.field2628.length; var162++) {
                    if (class228.field2628[var162] != class228.field2626[var162]) {
                        class228.field2628[var162] = class228.field2626[var162];
                        method290(var162);
                        field816[++field817 - 1 & 0x1F] = var162;
                    }
                }
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2124 == arg0.field1276) {
                boolean var163 = var3.method3527();
                if (!var163) {
                    Statics.field505 = null;
                } else if (Statics.field505 == null) {
                    Statics.field505 = new class254();
                }
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2183 == arg0.field1276) {
                String var164 = var3.method3353();
                Object[] var165 = new Object[var164.length() + 1];
                for (int var166 = var164.length() - 1; var166 >= 0; var166--) {
                    if (var164.charAt(var166) == 's') {
                        var165[var166 + 1] = var3.method3353();
                    } else {
                        var165[var166 + 1] = Integer.valueOf(var3.method3432());
                    }
                }
                var165[0] = Integer.valueOf(var3.method3432());
                class58 var167 = new class58();
                var167.field569 = var165;
                class71.method5372(var167);
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2190 == arg0.field1276) {
                int var168 = var3.method3432();
                int var169 = var3.method3432();
                int var170 = class48.method3038();
                class175 var171 = class175.method85(class172.field2219, field861.field1287);
                var171.field2335.method3371(var170);
                var171.field2335.method3376(field427);
                var171.field2335.method3389(var168);
                var171.field2335.method3388(var169);
                field861.method1944(var171);
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2201 == arg0.field1276) {
                field835 = var3.method3374();
                field846 = var3.method3374();
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2160 == arg0.field1276) {
                method1893();
                int var172 = var3.method3391();
                int var173 = var3.method3374();
                int var174 = var3.method3344();
                field695[var173] = var172;
                field838[var173] = var174;
                field763[var173] = 1;
                for (int var175 = 0; var175 < 98; var175++) {
                    if (var172 >= class237.field2846[var175]) {
                        field763[var173] = var175 + 2;
                    }
                }
                field766[++field893 - 1 & 0x1F] = var173;
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2186 == arg0.field1276) {
                int var176 = var3.method3346();
                int var177 = var3.method3344();
                int var178 = var3.method3346();
                method52(var176, var177, var178);
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2157 == arg0.field1276) {
                int var179 = var3.method3393();
                class233 var180 = class233.method1754(var179);
                var180.field2676 = 3;
                var180.field2712 = Statics.field138.field596.method4169();
                method272(var180);
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2139 == arg0.field1276) {
                byte[] var181 = new byte[arg0.field1285];
                var3.method3591(var181, 0, var181.length);
                class185 var182 = new class185(var181);
                String var183 = var182.method3353();
                class46.method5698(var183, true, false);
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2149 == arg0.field1276) {
                for (int var184 = 0; var184 < field746.length; var184++) {
                    if (field746[var184] != null) {
                        field746[var184].field939 = -1;
                    }
                }
                for (int var185 = 0; var185 < field672.length; var185++) {
                    if (field672[var185] != null) {
                        field672[var185].field939 = -1;
                    }
                }
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2164 == arg0.field1276) {
                if (arg0.field1285 == 0) {
                    Statics.field2353 = null;
                } else {
                    if (Statics.field2353 == null) {
                        Statics.field2353 = new class296(Statics.field3846, Statics.field1133);
                    }
                    Statics.field2353.method5158(var3);
                }
                method2514();
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2166 == arg0.field1276) {
                int var186 = var3.method3344();
                if (var3.method3344() == 0) {
                    field897[var186] = new class5();
                    var3.field2414 += 18;
                } else {
                    var3.field2414--;
                    field897[var186] = new class5(var3, false);
                }
                field825 = field815;
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2126 == arg0.field1276) {
                field693 = var3.method3344();
                if (field693 == 255) {
                    field693 = 0;
                }
                field891 = var3.method3344();
                if (field891 == 255) {
                    field891 = 0;
                }
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2130 == arg0.field1276) {
                class319.method35(var3, arg0.field1285);
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2140 == arg0.field1276) {
                int var187 = var3.method3432();
                String var188 = var3.method3353();
                class233 var189 = class233.method1754(var187);
                if (!var188.equals(var189.field2729)) {
                    var189.field2729 = var188;
                    method272(var189);
                }
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2134 == arg0.field1276) {
                method437(class174.field2328);
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2146 == arg0.field1276) {
                Statics.field2428 = var3.method3374();
                Statics.field2466 = var3.method3344();
                for (int var190 = Statics.field2466; var190 < Statics.field2466 + 8; var190++) {
                    for (int var191 = Statics.field2428; var191 < Statics.field2428 + 8; var191++) {
                        if (field659[Statics.field1983][var190][var191] != null) {
                            field659[Statics.field1983][var190][var191] = null;
                            method617(var190, var191);
                        }
                    }
                }
                for (class64 var192 = (class64) field759.method3827(); var192 != null; var192 = (class64) field759.method3829()) {
                    if (var192.field912 >= Statics.field2466 && var192.field912 < Statics.field2466 + 8 && var192.field913 >= Statics.field2428 && var192.field913 < Statics.field2428 + 8 && Statics.field1983 == var192.field918) {
                        var192.field919 = 0;
                    }
                }
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2168 == arg0.field1276) {
                class67 var193 = new class67();
                var193.field1005 = var3.method3353();
                var193.field1008 = var3.method3346();
                int var194 = var3.method3432();
                var193.field1003 = var194;
                method34(45);
                var2.method3113();
                Object var195 = null;
                Statics.method5183(var193);
                arg0.field1276 = null;
                return false;
            }
            if (class171.field2193 == arg0.field1276) {
                field649 = var3.method3346() * 30;
                field827 = field815;
                arg0.field1276 = null;
                return true;
            }
            if (class171.field2159 == arg0.field1276) {
                byte var196 = var3.method3522();
                int var197 = var3.method3548();
                class228.field2626[var197] = var196;
                if (class228.field2628[var197] != var196) {
                    class228.field2628[var197] = var196;
                }
                method290(var197);
                field816[++field817 - 1 & 0x1F] = var197;
                arg0.field1276 = null;
                return true;
            }
            class155.method2919("" + (arg0.field1276 == null ? -1 : arg0.field1276.field2206) + class76.field1102 + (arg0.field1275 == null ? -1 : arg0.field1275.field2206) + class76.field1102 + (arg0.field1288 == null ? -1 : arg0.field1288.field2206) + class76.field1102 + arg0.field1285, (Throwable) null);
            method3000();
        } catch (IOException var202) {
            method4575();
        } catch (Exception var203) {
            String var200 = "" + (arg0.field1276 == null ? -1 : arg0.field1276.field2206) + class76.field1102 + (arg0.field1275 == null ? -1 : arg0.field1275.field2206) + class76.field1102 + (arg0.field1288 == null ? -1 : arg0.field1288.field2206) + class76.field1102 + arg0.field1285 + class76.field1102 + (Statics.field321 + Statics.field138.field954[0]) + class76.field1102 + (Statics.field2611 + Statics.field138.field981[0]) + class76.field1102;
            for (int var201 = 0; var201 < arg0.field1285 && var201 < 50; var201++) {
                var200 = var200 + var3.field2415[var201] + class76.field1102;
            }
            class155.method2919(var200, var203);
            method3000();
        }
        return true;
    }

    @ObfuscatedName("av.ga(Lfu;B)V")
    public static final void method437(class174 arg0) {
        class192 var1 = field861.field1281;
        if (class174.field2328 == arg0) {
            int var2 = var1.method3375();
            int var3 = var2 >> 2;
            int var4 = var2 & 0x3;
            int var5 = field876[var3];
            int var6 = var1.method3375();
            int var7 = (var6 >> 4 & 0x7) + Statics.field2466;
            int var8 = (var6 & 0x7) + Statics.field2428;
            if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
                method599(Statics.field1983, var7, var8, var5, -1, var3, var4, 0, -1);
            }
            return;
        }
        if (class174.field2322 == arg0) {
            byte var9 = var1.method3384();
            int var10 = var1.method3420();
            byte var11 = var1.method3384();
            int var12 = var1.method3548();
            int var13 = var1.method3346();
            int var14 = var1.method3373();
            int var15 = var14 >> 2;
            int var16 = var14 & 0x3;
            int var17 = field876[var15];
            byte var18 = var1.method3522();
            int var19 = var1.method3356();
            byte var20 = var1.method3384();
            int var21 = var1.method3374();
            int var22 = (var21 >> 4 & 0x7) + Statics.field2466;
            int var23 = (var21 & 0x7) + Statics.field2428;
            class62 var24;
            if (field663 == var19) {
                var24 = Statics.field138;
            } else {
                var24 = field746[var19];
            }
            if (var24 != null) {
                class271 var25 = class271.method1776(var12);
                int var26;
                int var27;
                if (var16 == 1 || var16 == 3) {
                    var26 = var25.field3492;
                    var27 = var25.field3449;
                } else {
                    var26 = var25.field3449;
                    var27 = var25.field3492;
                }
                int var28 = (var26 >> 1) + var22;
                int var29 = (var26 + 1 >> 1) + var22;
                int var30 = (var27 >> 1) + var23;
                int var31 = (var27 + 1 >> 1) + var23;
                int[][] var32 = class51.field492[Statics.field1983];
                int var33 = var32[var28][var30] + var32[var29][var30] + var32[var28][var31] + var32[var29][var31] >> 2;
                int var34 = (var22 << 7) + (var26 << 6);
                int var35 = (var23 << 7) + (var27 << 6);
                class122 var36 = var25.method4718(var15, var16, var32, var34, var33, var35);
                if (var36 != null) {
                    method599(Statics.field1983, var22, var23, var17, -1, 0, 0, var13 + 1, var10 + 1);
                    var24.field604 = field642 + var13;
                    var24.field605 = field642 + var10;
                    var24.field609 = var36;
                    var24.field606 = var22 * 128 + var26 * 64;
                    var24.field616 = var23 * 128 + var27 * 64;
                    var24.field614 = var33;
                    if (var9 > var20) {
                        byte var37 = var9;
                        var9 = var20;
                        var20 = var37;
                    }
                    if (var18 > var11) {
                        byte var38 = var18;
                        var18 = var11;
                        var11 = var38;
                    }
                    var24.field610 = var9 + var22;
                    var24.field612 = var20 + var22;
                    var24.field623 = var18 + var23;
                    var24.field613 = var11 + var23;
                }
            }
        }
        if (class174.field2330 == arg0) {
            int var39 = var1.method3356();
            int var40 = var1.method3420();
            int var41 = var1.method3356();
            int var42 = var1.method3373();
            int var43 = (var42 >> 4 & 0x7) + Statics.field2466;
            int var44 = (var42 & 0x7) + Statics.field2428;
            if (var43 >= 0 && var44 >= 0 && var43 < 104 && var44 < 104) {
                class208 var45 = field659[Statics.field1983][var43][var44];
                if (var45 != null) {
                    for (class82 var46 = (class82) var45.method3827(); var46 != null; var46 = (class82) var45.method3829()) {
                        if ((var39 & 0x7FFF) == var46.field1202 && var46.field1201 == var41) {
                            var46.field1201 = var40;
                            break;
                        }
                    }
                    method617(var43, var44);
                }
            }
        } else if (class174.field2323 == arg0) {
            int var47 = var1.method3375() * 4;
            int var48 = var1.method3346();
            int var49 = var1.method3548();
            int var50 = var1.method3375() * 4;
            int var51 = var1.method3385();
            int var52 = var1.method3344();
            int var53 = var1.method3375();
            int var54 = var1.method3356();
            int var55 = var1.method3373();
            int var56 = (var55 >> 4 & 0x7) + Statics.field2466;
            int var57 = (var55 & 0x7) + Statics.field2428;
            byte var58 = var1.method3522();
            byte var59 = var1.method3384();
            int var60 = var56 + var59;
            int var61 = var57 + var58;
            if (var56 >= 0 && var57 >= 0 && var56 < 104 && var57 < 104 && var60 >= 0 && var61 >= 0 && var60 < 104 && var61 < 104 && var49 != 65535) {
                int var62 = var56 * 128 + 64;
                int var63 = var57 * 128 + 64;
                int var64 = var60 * 128 + 64;
                int var65 = var61 * 128 + 64;
                class81 var66 = new class81(var49, Statics.field1983, var62, var63, method701(var62, var63, Statics.field1983) - var50, field642 + var54, field642 + var48, var52, var53, var51, var47);
                var66.method1823(var64, var65, method701(var64, var65, Statics.field1983) - var47, field642 + var54);
                field760.method3823(var66);
            }
        } else {
            if (class174.field2327 == arg0) {
                int var67 = var1.method3344();
                int var68 = (var67 >> 4 & 0x7) + Statics.field2466;
                int var69 = (var67 & 0x7) + Statics.field2428;
                int var70 = var1.method3375();
                int var71 = var1.method3373();
                int var72 = var71 >> 4 & 0xF;
                int var73 = var71 & 0x7;
                int var74 = var1.method3420();
                if (var68 >= 0 && var69 >= 0 && var68 < 104 && var69 < 104) {
                    int var75 = var72 + 1;
                    if (Statics.field138.field954[0] >= var68 - var75 && Statics.field138.field954[0] <= var68 + var75 && Statics.field138.field981[0] >= var69 - var75 && Statics.field138.field981[0] <= var69 + var75 && field867 != 0 && var73 > 0 && field868 < 50) {
                        field771[field868] = var74;
                        field822[field868] = var73;
                        field871[field868] = var70;
                        field665[field868] = null;
                        field906[field868] = (var68 << 16) + (var69 << 8) + var72;
                        field868++;
                    }
                }
            }
            if (class174.field2326 == arg0) {
                int var76 = var1.method3375();
                int var77 = var76 >> 2;
                int var78 = var76 & 0x3;
                int var79 = field876[var77];
                int var80 = var1.method3374();
                int var81 = (var80 >> 4 & 0x7) + Statics.field2466;
                int var82 = (var80 & 0x7) + Statics.field2428;
                int var83 = var1.method3346();
                if (var81 >= 0 && var82 >= 0 && var81 < 103 && var82 < 103) {
                    if (var79 == 0) {
                        class131 var84 = Statics.field3406.method2745(Statics.field1983, var81, var82);
                        if (var84 != null) {
                            int var85 = class123.method1777(var84.field1842);
                            if (var77 == 2) {
                                var84.field1846 = new class88(var85, 2, var78 + 4, Statics.field1983, var81, var82, var83, false, var84.field1846);
                                var84.field1848 = new class88(var85, 2, var78 + 1 & 0x3, Statics.field1983, var81, var82, var83, false, var84.field1848);
                            } else {
                                var84.field1846 = new class88(var85, var77, var78, Statics.field1983, var81, var82, var83, false, var84.field1846);
                            }
                        }
                    }
                    if (var79 == 1) {
                        class136 var86 = Statics.field3406.method2746(Statics.field1983, var81, var82);
                        if (var86 != null) {
                            int var87 = class123.method1777(var86.field1892);
                            if (var77 == 4 || var77 == 5) {
                                var86.field1890 = new class88(var87, 4, var78, Statics.field1983, var81, var82, var83, false, var86.field1890);
                            } else if (var77 == 6) {
                                var86.field1890 = new class88(var87, 4, var78 + 4, Statics.field1983, var81, var82, var83, false, var86.field1890);
                            } else if (var77 == 7) {
                                var86.field1890 = new class88(var87, 4, (var78 + 2 & 0x3) + 4, Statics.field1983, var81, var82, var83, false, var86.field1890);
                            } else if (var77 == 8) {
                                var86.field1890 = new class88(var87, 4, var78 + 4, Statics.field1983, var81, var82, var83, false, var86.field1890);
                                var86.field1883 = new class88(var87, 4, (var78 + 2 & 0x3) + 4, Statics.field1983, var81, var82, var83, false, var86.field1883);
                            }
                        }
                    }
                    if (var79 == 2) {
                        class137 var88 = Statics.field3406.method2868(Statics.field1983, var81, var82);
                        if (var77 == 11) {
                            var77 = 10;
                        }
                        if (var88 != null) {
                            var88.field1909 = new class88(class123.method1777(var88.field1908), var77, var78, Statics.field1983, var81, var82, var83, false, var88.field1909);
                        }
                    }
                    if (var79 == 3) {
                        class118 var89 = Statics.field3406.method2748(Statics.field1983, var81, var82);
                        if (var89 != null) {
                            var89.field1580 = new class88(class123.method1777(var89.field1585), 22, var78, Statics.field1983, var81, var82, var83, false, var89.field1580);
                        }
                    }
                }
            } else if (class174.field2325 == arg0) {
                int var90 = var1.method3346();
                int var91 = var1.method3373();
                int var92 = var1.method3548();
                int var93 = var1.method3344();
                int var94 = (var93 >> 4 & 0x7) + Statics.field2466;
                int var95 = (var93 & 0x7) + Statics.field2428;
                if (var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104) {
                    int var96 = var94 * 128 + 64;
                    int var97 = var95 * 128 + 64;
                    class72 var98 = new class72(var90, Statics.field1983, var96, var97, method701(var96, var97, Statics.field1983) - var91, var92, field642);
                    field761.method3823(var98);
                }
            } else if (class174.field2324 == arg0) {
                int var99 = var1.method3373();
                int var100 = (var99 >> 4 & 0x7) + Statics.field2466;
                int var101 = (var99 & 0x7) + Statics.field2428;
                int var102 = var1.method3420();
                if (var100 >= 0 && var101 >= 0 && var100 < 104 && var101 < 104) {
                    class208 var103 = field659[Statics.field1983][var100][var101];
                    if (var103 != null) {
                        for (class82 var104 = (class82) var103.method3827(); var104 != null; var104 = (class82) var103.method3829()) {
                            if ((var102 & 0x7FFF) == var104.field1202) {
                                var104.method3818();
                                break;
                            }
                        }
                        if (var103.method3827() == null) {
                            field659[Statics.field1983][var100][var101] = null;
                        }
                        method617(var100, var101);
                    }
                }
            } else if (class174.field2329 == arg0) {
                int var105 = var1.method3548();
                int var106 = var1.method3420();
                int var107 = var1.method3373();
                int var108 = (var107 >> 4 & 0x7) + Statics.field2466;
                int var109 = (var107 & 0x7) + Statics.field2428;
                if (var108 >= 0 && var109 >= 0 && var108 < 104 && var109 < 104) {
                    class82 var110 = new class82();
                    var110.field1202 = var106;
                    var110.field1201 = var105;
                    if (field659[Statics.field1983][var108][var109] == null) {
                        field659[Statics.field1983][var108][var109] = new class208();
                    }
                    field659[Statics.field1983][var108][var109].method3823(var110);
                    method617(var108, var109);
                }
            } else if (class174.field2331 == arg0) {
                int var111 = var1.method3373();
                int var112 = (var111 >> 4 & 0x7) + Statics.field2466;
                int var113 = (var111 & 0x7) + Statics.field2428;
                int var114 = var1.method3375();
                int var115 = var114 >> 2;
                int var116 = var114 & 0x3;
                int var117 = field876[var115];
                int var118 = var1.method3548();
                if (var112 >= 0 && var113 >= 0 && var112 < 104 && var113 < 104) {
                    method599(Statics.field1983, var112, var113, var117, var118, var115, var116, 0, -1);
                }
            }
        }
    }

    @ObfuscatedName("as.gc(IIIIIIIIII)V")
    public static final void method599(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class64 var9 = null;
        for (class64 var10 = (class64) field759.method3827(); var10 != null; var10 = (class64) field759.method3829()) {
            if (var10.field918 == arg0 && var10.field912 == arg1 && var10.field913 == arg2 && var10.field911 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class64();
            var9.field918 = arg0;
            var9.field911 = arg3;
            var9.field912 = arg1;
            var9.field913 = arg2;
            method650(var9);
            field759.method3823(var9);
        }
        var9.field917 = arg4;
        var9.field914 = arg5;
        var9.field910 = arg6;
        var9.field920 = arg7;
        var9.field919 = arg8;
    }

    @ObfuscatedName("er.gg(B)V")
    public static final void method3002() {
        for (class64 var0 = (class64) field759.method3827(); var0 != null; var0 = (class64) field759.method3829()) {
            if (var0.field919 == -1) {
                var0.field920 = 0;
                method650(var0);
            } else {
                var0.method3818();
            }
        }
    }

    @ObfuscatedName("ao.gd(Lbi;I)V")
    public static final void method650(class64 arg0) {
        long var1 = 0L;
        int var3 = -1;
        int var4 = 0;
        int var5 = 0;
        if (arg0.field911 == 0) {
            var1 = Statics.field3406.method2749(arg0.field918, arg0.field912, arg0.field913);
        }
        if (arg0.field911 == 1) {
            var1 = Statics.field3406.method2750(arg0.field918, arg0.field912, arg0.field913);
        }
        if (arg0.field911 == 2) {
            var1 = Statics.field3406.method2779(arg0.field918, arg0.field912, arg0.field913);
        }
        if (arg0.field911 == 3) {
            var1 = Statics.field3406.method2790(arg0.field918, arg0.field912, arg0.field913);
        }
        if (var1 != 0L) {
            int var6 = Statics.field3406.method2753(arg0.field918, arg0.field912, arg0.field913, var1);
            var3 = class123.method1777(var1);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg0.field923 = var3;
        arg0.field916 = var4;
        arg0.field915 = var5;
    }

    @ObfuscatedName("jl.gq(I)V")
    public static final void method4677() {
        for (class64 var0 = (class64) field759.method3827(); var0 != null; var0 = (class64) field759.method3829()) {
            if (var0.field919 > 0) {
                var0.field919--;
            }
            if (var0.field919 != 0) {
                if (var0.field920 > 0) {
                    var0.field920--;
                }
                if (var0.field920 == 0 && var0.field912 >= 1 && var0.field913 >= 1 && var0.field912 <= 102 && var0.field913 <= 102 && (var0.field917 < 0 || Statics.method3318(var0.field917, var0.field914))) {
                    method3163(var0.field918, var0.field911, var0.field912, var0.field913, var0.field917, var0.field910, var0.field914);
                    var0.field920 = -1;
                    if (var0.field923 == var0.field917 && var0.field923 == -1) {
                        var0.method3818();
                    } else if (var0.field923 == var0.field917 && var0.field915 == var0.field910 && var0.field916 == var0.field914) {
                        var0.method3818();
                    }
                }
            } else if (var0.field923 < 0 || Statics.method3318(var0.field923, var0.field916)) {
                method3163(var0.field918, var0.field911, var0.field912, var0.field913, var0.field923, var0.field915, var0.field916);
                var0.method3818();
            }
        }
    }

    @ObfuscatedName("fi.gp(IIIIIIIB)V")
    public static final void method3163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field634 && Statics.field1983 != arg0) {
            return;
        }
        long var7 = 0L;
        boolean var9 = true;
        boolean var10 = false;
        boolean var11 = false;
        if (arg1 == 0) {
            var7 = Statics.field3406.method2749(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field3406.method2750(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field3406.method2779(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field3406.method2790(arg0, arg2, arg3);
        }
        if (var7 != 0L) {
            int var12 = Statics.field3406.method2753(arg0, arg2, arg3, var7);
            int var13 = class123.method1777(var7);
            int var14 = var12 & 0x1F;
            int var15 = var12 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field3406.method2740(arg0, arg2, arg3);
                class271 var16 = class271.method1776(var13);
                if (var16.field3472 != 0) {
                    field688[arg0].method3200(arg2, arg3, var14, var15, var16.field3465);
                }
            }
            if (arg1 == 1) {
                Statics.field3406.method2760(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field3406.method2742(arg0, arg2, arg3);
                class271 var17 = class271.method1776(var13);
                if (var17.field3449 + arg2 > 103 || var17.field3449 + arg3 > 103 || var17.field3492 + arg2 > 103 || var17.field3492 + arg3 > 103) {
                    return;
                }
                if (var17.field3472 != 0) {
                    field688[arg0].method3207(arg2, arg3, var17.field3449, var17.field3492, var15, var17.field3465);
                }
            }
            if (arg1 == 3) {
                Statics.field3406.method2743(arg0, arg2, arg3);
                class271 var18 = class271.method1776(var13);
                if (var18.field3472 == 1) {
                    field688[arg0].method3202(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var19 = arg0;
        if (arg0 < 3 && (class51.field482[1][arg2][arg3] & 0x2) == 2) {
            var19 = arg0 + 1;
        }
        class128 var20 = Statics.field3406;
        class167 var21 = field688[arg0];
        class271 var22 = class271.method1776(arg4);
        int var23;
        int var24;
        if (arg5 == 1 || arg5 == 3) {
            var23 = var22.field3492;
            var24 = var22.field3449;
        } else {
            var23 = var22.field3449;
            var24 = var22.field3492;
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
        int[][] var29 = class51.field492[var19];
        int var30 = var29[var25][var27] + var29[var26][var27] + var29[var25][var28] + var29[var26][var28] >> 2;
        int var31 = (arg2 << 7) + (var23 << 6);
        int var32 = (arg3 << 7) + (var24 << 6);
        long var33 = class123.method3065(arg2, arg3, 2, var22.field3466 == 0, arg4);
        int var35 = (arg5 << 6) + arg6;
        if (var22.field3487 == 1) {
            var35 += 256;
        }
        if (arg6 == 22) {
            class130 var36;
            if (var22.field3470 == -1 && var22.field3488 == null) {
                var36 = var22.method4718(22, arg5, var29, var31, var30, var32);
            } else {
                var36 = new class88(arg4, 22, arg5, var19, arg2, arg3, var22.field3470, true, (class130) null);
            }
            var20.method2799(arg0, arg2, arg3, var30, var36, var33, var35);
            if (var22.field3472 == 1) {
                var21.method3197(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class130 var62;
            if (var22.field3470 == -1 && var22.field3488 == null) {
                var62 = var22.method4718(10, arg5, var29, var31, var30, var32);
            } else {
                var62 = new class88(arg4, 10, arg5, var19, arg2, arg3, var22.field3470, true, (class130) null);
            }
            if (var62 != null) {
                var20.method2733(arg0, arg2, arg3, var30, var23, var24, var62, arg6 == 11 ? 256 : 0, var33, var35);
            }
            if (var22.field3472 != 0) {
                var21.method3195(arg2, arg3, var23, var24, var22.field3465);
            }
        } else if (arg6 >= 12) {
            class130 var37;
            if (var22.field3470 == -1 && var22.field3488 == null) {
                var37 = var22.method4718(arg6, arg5, var29, var31, var30, var32);
            } else {
                var37 = new class88(arg4, arg6, arg5, var19, arg2, arg3, var22.field3470, true, (class130) null);
            }
            var20.method2733(arg0, arg2, arg3, var30, 1, 1, var37, 0, var33, var35);
            if (var22.field3472 != 0) {
                var21.method3195(arg2, arg3, var23, var24, var22.field3465);
            }
        } else if (arg6 == 0) {
            class130 var38;
            if (var22.field3470 == -1 && var22.field3488 == null) {
                var38 = var22.method4718(0, arg5, var29, var31, var30, var32);
            } else {
                var38 = new class88(arg4, 0, arg5, var19, arg2, arg3, var22.field3470, true, (class130) null);
            }
            var20.method2731(arg0, arg2, arg3, var30, var38, (class130) null, class51.field488[arg5], 0, var33, var35);
            if (var22.field3472 != 0) {
                var21.method3194(arg2, arg3, arg6, arg5, var22.field3465);
            }
        } else if (arg6 == 1) {
            class130 var39;
            if (var22.field3470 == -1 && var22.field3488 == null) {
                var39 = var22.method4718(1, arg5, var29, var31, var30, var32);
            } else {
                var39 = new class88(arg4, 1, arg5, var19, arg2, arg3, var22.field3470, true, (class130) null);
            }
            var20.method2731(arg0, arg2, arg3, var30, var39, (class130) null, class51.field481[arg5], 0, var33, var35);
            if (var22.field3472 != 0) {
                var21.method3194(arg2, arg3, arg6, arg5, var22.field3465);
            }
        } else if (arg6 == 2) {
            int var40 = arg5 + 1 & 0x3;
            class130 var41;
            class130 var42;
            if (var22.field3470 == -1 && var22.field3488 == null) {
                var41 = var22.method4718(2, arg5 + 4, var29, var31, var30, var32);
                var42 = var22.method4718(2, var40, var29, var31, var30, var32);
            } else {
                var41 = new class88(arg4, 2, arg5 + 4, var19, arg2, arg3, var22.field3470, true, (class130) null);
                var42 = new class88(arg4, 2, var40, var19, arg2, arg3, var22.field3470, true, (class130) null);
            }
            var20.method2731(arg0, arg2, arg3, var30, var41, var42, class51.field488[arg5], class51.field488[var40], var33, var35);
            if (var22.field3472 != 0) {
                var21.method3194(arg2, arg3, arg6, arg5, var22.field3465);
            }
        } else if (arg6 == 3) {
            class130 var43;
            if (var22.field3470 == -1 && var22.field3488 == null) {
                var43 = var22.method4718(3, arg5, var29, var31, var30, var32);
            } else {
                var43 = new class88(arg4, 3, arg5, var19, arg2, arg3, var22.field3470, true, (class130) null);
            }
            var20.method2731(arg0, arg2, arg3, var30, var43, (class130) null, class51.field481[arg5], 0, var33, var35);
            if (var22.field3472 != 0) {
                var21.method3194(arg2, arg3, arg6, arg5, var22.field3465);
            }
        } else if (arg6 == 9) {
            class130 var44;
            if (var22.field3470 == -1 && var22.field3488 == null) {
                var44 = var22.method4718(arg6, arg5, var29, var31, var30, var32);
            } else {
                var44 = new class88(arg4, arg6, arg5, var19, arg2, arg3, var22.field3470, true, (class130) null);
            }
            var20.method2733(arg0, arg2, arg3, var30, 1, 1, var44, 0, var33, var35);
            if (var22.field3472 != 0) {
                var21.method3195(arg2, arg3, var23, var24, var22.field3465);
            }
        } else if (arg6 == 4) {
            class130 var45;
            if (var22.field3470 == -1 && var22.field3488 == null) {
                var45 = var22.method4718(4, arg5, var29, var31, var30, var32);
            } else {
                var45 = new class88(arg4, 4, arg5, var19, arg2, arg3, var22.field3470, true, (class130) null);
            }
            var20.method2732(arg0, arg2, arg3, var30, var45, (class130) null, class51.field488[arg5], 0, 0, 0, var33, var35);
        } else if (arg6 == 5) {
            int var46 = 16;
            long var47 = var20.method2749(arg0, arg2, arg3);
            if (var47 != 0L) {
                var46 = class271.method1776(class123.method1777(var47)).field3471;
            }
            class130 var49;
            if (var22.field3470 == -1 && var22.field3488 == null) {
                var49 = var22.method4718(4, arg5, var29, var31, var30, var32);
            } else {
                var49 = new class88(arg4, 4, arg5, var19, arg2, arg3, var22.field3470, true, (class130) null);
            }
            var20.method2732(arg0, arg2, arg3, var30, var49, (class130) null, class51.field488[arg5], 0, class51.field483[arg5] * var46, class51.field491[arg5] * var46, var33, var35);
        } else if (arg6 == 6) {
            int var50 = 8;
            long var51 = var20.method2749(arg0, arg2, arg3);
            if (var51 != 0L) {
                var50 = class271.method1776(class123.method1777(var51)).field3471 / 2;
            }
            class130 var53;
            if (var22.field3470 == -1 && var22.field3488 == null) {
                var53 = var22.method4718(4, arg5 + 4, var29, var31, var30, var32);
            } else {
                var53 = new class88(arg4, 4, arg5 + 4, var19, arg2, arg3, var22.field3470, true, (class130) null);
            }
            var20.method2732(arg0, arg2, arg3, var30, var53, (class130) null, 256, arg5, class51.field496[arg5] * var50, class51.field493[arg5] * var50, var33, var35);
        } else if (arg6 == 7) {
            int var54 = arg5 + 2 & 0x3;
            class130 var55;
            if (var22.field3470 == -1 && var22.field3488 == null) {
                var55 = var22.method4718(4, var54 + 4, var29, var31, var30, var32);
            } else {
                var55 = new class88(arg4, 4, var54 + 4, var19, arg2, arg3, var22.field3470, true, (class130) null);
            }
            var20.method2732(arg0, arg2, arg3, var30, var55, (class130) null, 256, var54, 0, 0, var33, var35);
        } else if (arg6 == 8) {
            int var56 = 8;
            long var57 = var20.method2749(arg0, arg2, arg3);
            if (var57 != 0L) {
                var56 = class271.method1776(class123.method1777(var57)).field3471 / 2;
            }
            int var59 = arg5 + 2 & 0x3;
            class130 var60;
            class130 var61;
            if (var22.field3470 == -1 && var22.field3488 == null) {
                var60 = var22.method4718(4, arg5 + 4, var29, var31, var30, var32);
                var61 = var22.method4718(4, var59 + 4, var29, var31, var30, var32);
            } else {
                var60 = new class88(arg4, 4, arg5 + 4, var19, arg2, arg3, var22.field3470, true, (class130) null);
                var61 = new class88(arg4, 4, var59 + 4, var19, arg2, arg3, var22.field3470, true, (class130) null);
            }
            var20.method2732(arg0, arg2, arg3, var30, var60, var61, 256, arg5, class51.field496[arg5] * var56, class51.field493[arg5] * var56, var33, var35);
        }
    }

    @ObfuscatedName("ad.gk(IIB)V")
    public static final void method617(int arg0, int arg1) {
        class208 var2 = field659[Statics.field1983][arg0][arg1];
        if (var2 == null) {
            Statics.field3406.method2801(Statics.field1983, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class82 var5 = null;
        for (class82 var6 = (class82) var2.method3827(); var6 != null; var6 = (class82) var2.method3829()) {
            class272 var7 = class272.method92(var6.field1202);
            long var8 = (long) var7.field3520;
            if (var7.field3512 == 1) {
                var8 = (long) (var6.field1201 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field3406.method2801(Statics.field1983, arg0, arg1);
            return;
        }
        var2.method3824(var5);
        class82 var10 = null;
        class82 var11 = null;
        for (class82 var12 = (class82) var2.method3827(); var12 != null; var12 = (class82) var2.method3829()) {
            if (var5.field1202 != var12.field1202) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1202 != var12.field1202 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        long var13 = class123.method3065(arg0, arg1, 3, false, 0);
        Statics.field3406.method2756(Statics.field1983, arg0, arg1, method701(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1983), var5, var13, var10, var11);
    }

    @ObfuscatedName("hy.gu(ZLgl;I)V")
    public static final void method4098(boolean arg0, class192 arg1) {
        field751 = 0;
        field675 = 0;
        class192 var2 = field861.field1281;
        var2.method3598();
        int var3 = var2.method3599(8);
        if (var3 < field673) {
            for (int var4 = var3; var4 < field673; var4++) {
                field703[++field751 - 1] = field674[var4];
            }
        }
        if (var3 > field673) {
            throw new RuntimeException("");
        }
        field673 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = field674[var5];
            class74 var7 = field672[var6];
            int var8 = var2.method3599(1);
            if (var8 == 0) {
                field674[++field673 - 1] = var6;
                var7.field974 = field642;
            } else {
                int var9 = var2.method3599(2);
                if (var9 == 0) {
                    field674[++field673 - 1] = var6;
                    var7.field974 = field642;
                    field676[++field675 - 1] = var6;
                } else if (var9 == 1) {
                    field674[++field673 - 1] = var6;
                    var7.field974 = field642;
                    int var10 = var2.method3599(3);
                    var7.method1758(var10, (byte) 1);
                    int var11 = var2.method3599(1);
                    if (var11 == 1) {
                        field676[++field675 - 1] = var6;
                    }
                } else if (var9 == 2) {
                    field674[++field673 - 1] = var6;
                    var7.field974 = field642;
                    int var12 = var2.method3599(3);
                    var7.method1758(var12, (byte) 2);
                    int var13 = var2.method3599(3);
                    var7.method1758(var13, (byte) 2);
                    int var14 = var2.method3599(1);
                    if (var14 == 1) {
                        field676[++field675 - 1] = var6;
                    }
                } else if (var9 == 3) {
                    field703[++field751 - 1] = var6;
                }
            }
        }
        method2120(arg0, arg1);
        for (int var15 = 0; var15 < field675; var15++) {
            int var16 = field676[var15];
            class74 var17 = field672[var16];
            int var18 = arg1.method3344();
            if ((var18 & 0x1) != 0) {
                var17.field951 = arg1.method3356();
                if (var17.field951 == 65535) {
                    var17.field951 = -1;
                }
            }
            if ((var18 & 0x40) != 0) {
                int var19 = arg1.method3420();
                int var20 = arg1.method3420();
                int var21 = var17.field943 - (var19 - Statics.field321 - Statics.field321) * 64;
                int var22 = var17.field925 - (var20 - Statics.field2611 - Statics.field2611) * 64;
                if (var21 != 0 || var22 != 0) {
                    var17.field967 = (int) (Math.atan2((double) var21, (double) var22) * 325.949D) & 0x7FF;
                }
            }
            if ((var18 & 0x20) != 0) {
                int var23 = arg1.method3346();
                if (var23 == 65535) {
                    var23 = -1;
                }
                int var24 = arg1.method3375();
                if (var17.field939 == var23 && var23 != -1) {
                    int var25 = class276.method3224(var23).field3611;
                    if (var25 == 1) {
                        var17.field958 = 0;
                        var17.field983 = 0;
                        var17.field960 = var24;
                        var17.field961 = 0;
                    }
                    if (var25 == 2) {
                        var17.field961 = 0;
                    }
                } else if (var23 == -1 || var17.field939 == -1 || class276.method3224(var23).field3622 >= class276.method3224(var17.field939).field3622) {
                    var17.field939 = var23;
                    var17.field958 = 0;
                    var17.field983 = 0;
                    var17.field960 = var24;
                    var17.field961 = 0;
                    var17.field984 = var17.field945;
                }
            }
            if ((var18 & 0x4) != 0) {
                var17.field1091 = class274.method187(arg1.method3346());
                var17.field928 = var17.field1091.field3565;
                var17.field978 = var17.field1091.field3563;
                var17.field956 = var17.field1091.field3571;
                var17.field933 = var17.field1091.field3572;
                var17.field930 = var17.field1091.field3573;
                var17.field936 = var17.field1091.field3593;
                var17.field942 = var17.field1091.field3568;
                var17.field980 = var17.field1091.field3569;
                var17.field975 = var17.field1091.field3581;
            }
            if ((var18 & 0x10) != 0) {
                int var26 = arg1.method3374();
                if (var26 > 0) {
                    for (int var27 = 0; var27 < var26; var27++) {
                        int var28 = -1;
                        int var29 = -1;
                        int var30 = -1;
                        int var31 = arg1.method3358();
                        if (var31 == 32767) {
                            var31 = arg1.method3358();
                            var29 = arg1.method3358();
                            var28 = arg1.method3358();
                            var30 = arg1.method3358();
                        } else if (var31 == 32766) {
                            var31 = -1;
                        } else {
                            var29 = arg1.method3358();
                        }
                        int var32 = arg1.method3358();
                        var17.method1491(var31, var29, var28, var30, field642, var32);
                    }
                }
                int var33 = arg1.method3373();
                if (var33 > 0) {
                    for (int var34 = 0; var34 < var33; var34++) {
                        int var35 = arg1.method3358();
                        int var36 = arg1.method3358();
                        if (var36 == 32767) {
                            var17.method1488(var35);
                        } else {
                            int var37 = arg1.method3358();
                            int var38 = arg1.method3344();
                            int var39 = var36 > 0 ? arg1.method3375() : var38;
                            var17.method1499(var35, field642, var36, var37, var38, var39);
                        }
                    }
                }
            }
            if ((var18 & 0x8) != 0) {
                var17.field962 = arg1.method3356();
                int var40 = arg1.method3392();
                var17.field952 = var40 >> 16;
                var17.field965 = (var40 & 0xFFFF) + field642;
                var17.field963 = 0;
                var17.field964 = 0;
                if (var17.field965 > field642) {
                    var17.field963 = -1;
                }
                if (var17.field962 == 65535) {
                    var17.field962 = -1;
                }
            }
            if ((var18 & 0x2) != 0) {
                var17.field938 = arg1.method3353();
                var17.field934 = 100;
            }
        }
        for (int var41 = 0; var41 < field751; var41++) {
            int var42 = field703[var41];
            if (field642 != field672[var42].field974) {
                field672[var42].field1091 = null;
                field672[var42] = null;
            }
        }
        if (field861.field1285 != arg1.field2414) {
            throw new RuntimeException(arg1.field2414 + class76.field1102 + field861.field1285);
        }
        for (int var43 = 0; var43 < field673; var43++) {
            if (field672[field674[var43]] == null) {
                throw new RuntimeException(var43 + class76.field1102 + field673);
            }
        }
    }

    @ObfuscatedName("ch.gs(ZLgl;I)V")
    public static final void method2120(boolean arg0, class192 arg1) {
        while (true) {
            if (arg1.method3601(field861.field1285) >= 27) {
                int var2 = arg1.method3599(15);
                if (var2 != 32767) {
                    boolean var3 = false;
                    if (field672[var2] == null) {
                        field672[var2] = new class74();
                        var3 = true;
                    }
                    class74 var4 = field672[var2];
                    field674[++field673 - 1] = var2;
                    var4.field974 = field642;
                    int var5;
                    if (arg0) {
                        var5 = arg1.method3599(8);
                        if (var5 > 127) {
                            var5 -= 256;
                        }
                    } else {
                        var5 = arg1.method3599(5);
                        if (var5 > 15) {
                            var5 -= 32;
                        }
                    }
                    int var6 = arg1.method3599(1);
                    int var7 = field756[arg1.method3599(3)];
                    if (var3) {
                        var4.field976 = var4.field926 = var7;
                    }
                    int var8 = arg1.method3599(1);
                    if (var8 == 1) {
                        field676[++field675 - 1] = var2;
                    }
                    int var9;
                    if (arg0) {
                        var9 = arg1.method3599(8);
                        if (var9 > 127) {
                            var9 -= 256;
                        }
                    } else {
                        var9 = arg1.method3599(5);
                        if (var9 > 15) {
                            var9 -= 32;
                        }
                    }
                    var4.field1091 = class274.method187(arg1.method3599(14));
                    var4.field928 = var4.field1091.field3565;
                    var4.field978 = var4.field1091.field3563;
                    if (var4.field978 == 0) {
                        var4.field926 = 0;
                    }
                    var4.field956 = var4.field1091.field3571;
                    var4.field933 = var4.field1091.field3572;
                    var4.field930 = var4.field1091.field3573;
                    var4.field936 = var4.field1091.field3593;
                    var4.field942 = var4.field1091.field3568;
                    var4.field980 = var4.field1091.field3569;
                    var4.field975 = var4.field1091.field3581;
                    var4.method1759(Statics.field138.field954[0] + var5, Statics.field138.field981[0] + var9, var6 == 1);
                    continue;
                }
            }
            arg1.method3597();
            return;
        }
    }

    @ObfuscatedName("ch.he(Lbw;IIBI)V")
    public static final void method2099(class62 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field954[0];
        int var5 = arg0.field981[0];
        int var6 = arg0.method1041();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var7 = arg0.method1041();
        class169 var8 = method1764(arg1, arg2);
        class167 var9 = field688[arg0.field600];
        int[] var10 = field903;
        int[] var11 = field904;
        for (int var12 = 0; var12 < 128; var12++) {
            for (int var13 = 0; var13 < 128; var13++) {
                class168.field2109[var12][var13] = 0;
                class168.field2112[var12][var13] = 99999999;
            }
        }
        boolean var14;
        if (var7 == 1) {
            var14 = class168.method3068(var4, var5, var8, var9);
        } else if (var7 == 2) {
            int var15 = var4;
            int var16 = var5;
            byte var17 = 64;
            byte var18 = 64;
            int var19 = var4 - var17;
            int var20 = var5 - var18;
            class168.field2109[var17][var18] = 99;
            class168.field2112[var17][var18] = 0;
            byte var21 = 0;
            int var22 = 0;
            class168.field2111[var21] = var4;
            int var78 = var21 + 1;
            class168.field2107[var21] = var5;
            int[][] var23 = var9.field2105;
            boolean var28;
            while (true) {
                if (var78 == var22) {
                    Statics.field3799 = var15;
                    Statics.field2049 = var16;
                    var28 = false;
                    break;
                }
                var15 = class168.field2111[var22];
                var16 = class168.field2107[var22];
                var22 = var22 + 1 & 0xFFF;
                int var24 = var15 - var19;
                int var25 = var16 - var20;
                int var26 = var15 - var9.field2101;
                int var27 = var16 - var9.field2102;
                if (var8.method1030(2, var15, var16, var9)) {
                    Statics.field3799 = var15;
                    Statics.field2049 = var16;
                    var28 = true;
                    break;
                }
                int var29 = class168.field2112[var24][var25] + 1;
                if (var24 > 0 && class168.field2109[var24 - 1][var25] == 0 && (var23[var26 - 1][var27] & 0x124010E) == 0 && (var23[var26 - 1][var27 + 1] & 0x1240138) == 0) {
                    class168.field2111[var78] = var15 - 1;
                    class168.field2107[var78] = var16;
                    var78 = var78 + 1 & 0xFFF;
                    class168.field2109[var24 - 1][var25] = 2;
                    class168.field2112[var24 - 1][var25] = var29;
                }
                if (var24 < 126 && class168.field2109[var24 + 1][var25] == 0 && (var23[var26 + 2][var27] & 0x1240183) == 0 && (var23[var26 + 2][var27 + 1] & 0x12401E0) == 0) {
                    class168.field2111[var78] = var15 + 1;
                    class168.field2107[var78] = var16;
                    var78 = var78 + 1 & 0xFFF;
                    class168.field2109[var24 + 1][var25] = 8;
                    class168.field2112[var24 + 1][var25] = var29;
                }
                if (var25 > 0 && class168.field2109[var24][var25 - 1] == 0 && (var23[var26][var27 - 1] & 0x124010E) == 0 && (var23[var26 + 1][var27 - 1] & 0x1240183) == 0) {
                    class168.field2111[var78] = var15;
                    class168.field2107[var78] = var16 - 1;
                    var78 = var78 + 1 & 0xFFF;
                    class168.field2109[var24][var25 - 1] = 1;
                    class168.field2112[var24][var25 - 1] = var29;
                }
                if (var25 < 126 && class168.field2109[var24][var25 + 1] == 0 && (var23[var26][var27 + 2] & 0x1240138) == 0 && (var23[var26 + 1][var27 + 2] & 0x12401E0) == 0) {
                    class168.field2111[var78] = var15;
                    class168.field2107[var78] = var16 + 1;
                    var78 = var78 + 1 & 0xFFF;
                    class168.field2109[var24][var25 + 1] = 4;
                    class168.field2112[var24][var25 + 1] = var29;
                }
                if (var24 > 0 && var25 > 0 && class168.field2109[var24 - 1][var25 - 1] == 0 && (var23[var26 - 1][var27] & 0x124013E) == 0 && (var23[var26 - 1][var27 - 1] & 0x124010E) == 0 && (var23[var26][var27 - 1] & 0x124018F) == 0) {
                    class168.field2111[var78] = var15 - 1;
                    class168.field2107[var78] = var16 - 1;
                    var78 = var78 + 1 & 0xFFF;
                    class168.field2109[var24 - 1][var25 - 1] = 3;
                    class168.field2112[var24 - 1][var25 - 1] = var29;
                }
                if (var24 < 126 && var25 > 0 && class168.field2109[var24 + 1][var25 - 1] == 0 && (var23[var26 + 1][var27 - 1] & 0x124018F) == 0 && (var23[var26 + 2][var27 - 1] & 0x1240183) == 0 && (var23[var26 + 2][var27] & 0x12401E3) == 0) {
                    class168.field2111[var78] = var15 + 1;
                    class168.field2107[var78] = var16 - 1;
                    var78 = var78 + 1 & 0xFFF;
                    class168.field2109[var24 + 1][var25 - 1] = 9;
                    class168.field2112[var24 + 1][var25 - 1] = var29;
                }
                if (var24 > 0 && var25 < 126 && class168.field2109[var24 - 1][var25 + 1] == 0 && (var23[var26 - 1][var27 + 1] & 0x124013E) == 0 && (var23[var26 - 1][var27 + 2] & 0x1240138) == 0 && (var23[var26][var27 + 2] & 0x12401F8) == 0) {
                    class168.field2111[var78] = var15 - 1;
                    class168.field2107[var78] = var16 + 1;
                    var78 = var78 + 1 & 0xFFF;
                    class168.field2109[var24 - 1][var25 + 1] = 6;
                    class168.field2112[var24 - 1][var25 + 1] = var29;
                }
                if (var24 < 126 && var25 < 126 && class168.field2109[var24 + 1][var25 + 1] == 0 && (var23[var26 + 1][var27 + 2] & 0x12401F8) == 0 && (var23[var26 + 2][var27 + 2] & 0x12401E0) == 0 && (var23[var26 + 2][var27 + 1] & 0x12401E3) == 0) {
                    class168.field2111[var78] = var15 + 1;
                    class168.field2107[var78] = var16 + 1;
                    var78 = var78 + 1 & 0xFFF;
                    class168.field2109[var24 + 1][var25 + 1] = 12;
                    class168.field2112[var24 + 1][var25 + 1] = var29;
                }
            }
            var14 = var28;
        } else {
            int var30 = var4;
            int var31 = var5;
            byte var32 = 64;
            byte var33 = 64;
            int var34 = var4 - var32;
            int var35 = var5 - var33;
            class168.field2109[var32][var33] = 99;
            class168.field2112[var32][var33] = 0;
            byte var36 = 0;
            int var37 = 0;
            class168.field2111[var36] = var4;
            int var79 = var36 + 1;
            class168.field2107[var36] = var5;
            int[][] var38 = var9.field2105;
            boolean var43;
            label550: while (true) {
                label548: while (true) {
                    int var39;
                    int var40;
                    int var41;
                    int var42;
                    int var44;
                    do {
                        do {
                            do {
                                label525: do {
                                    if (var79 == var37) {
                                        Statics.field3799 = var30;
                                        Statics.field2049 = var31;
                                        var43 = false;
                                        break label550;
                                    }
                                    var30 = class168.field2111[var37];
                                    var31 = class168.field2107[var37];
                                    var37 = var37 + 1 & 0xFFF;
                                    var39 = var30 - var34;
                                    var40 = var31 - var35;
                                    var41 = var30 - var9.field2101;
                                    var42 = var31 - var9.field2102;
                                    if (var8.method1030(var7, var30, var31, var9)) {
                                        Statics.field3799 = var30;
                                        Statics.field2049 = var31;
                                        var43 = true;
                                        break label550;
                                    }
                                    var44 = class168.field2112[var39][var40] + 1;
                                    if (var39 > 0 && class168.field2109[var39 - 1][var40] == 0 && (var38[var41 - 1][var42] & 0x124010E) == 0 && (var38[var41 - 1][var7 + var42 - 1] & 0x1240138) == 0) {
                                        int var45 = 1;
                                        while (true) {
                                            if (var45 >= var7 - 1) {
                                                class168.field2111[var79] = var30 - 1;
                                                class168.field2107[var79] = var31;
                                                var79 = var79 + 1 & 0xFFF;
                                                class168.field2109[var39 - 1][var40] = 2;
                                                class168.field2112[var39 - 1][var40] = var44;
                                                break;
                                            }
                                            if ((var38[var41 - 1][var42 + var45] & 0x124013E) != 0) {
                                                break;
                                            }
                                            var45++;
                                        }
                                    }
                                    if (var39 < 128 - var7 && class168.field2109[var39 + 1][var40] == 0 && (var38[var7 + var41][var42] & 0x1240183) == 0 && (var38[var7 + var41][var7 + var42 - 1] & 0x12401E0) == 0) {
                                        int var46 = 1;
                                        while (true) {
                                            if (var46 >= var7 - 1) {
                                                class168.field2111[var79] = var30 + 1;
                                                class168.field2107[var79] = var31;
                                                var79 = var79 + 1 & 0xFFF;
                                                class168.field2109[var39 + 1][var40] = 8;
                                                class168.field2112[var39 + 1][var40] = var44;
                                                break;
                                            }
                                            if ((var38[var7 + var41][var42 + var46] & 0x12401E3) != 0) {
                                                break;
                                            }
                                            var46++;
                                        }
                                    }
                                    if (var40 > 0 && class168.field2109[var39][var40 - 1] == 0 && (var38[var41][var42 - 1] & 0x124010E) == 0 && (var38[var7 + var41 - 1][var42 - 1] & 0x1240183) == 0) {
                                        int var47 = 1;
                                        while (true) {
                                            if (var47 >= var7 - 1) {
                                                class168.field2111[var79] = var30;
                                                class168.field2107[var79] = var31 - 1;
                                                var79 = var79 + 1 & 0xFFF;
                                                class168.field2109[var39][var40 - 1] = 1;
                                                class168.field2112[var39][var40 - 1] = var44;
                                                break;
                                            }
                                            if ((var38[var41 + var47][var42 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var47++;
                                        }
                                    }
                                    if (var40 < 128 - var7 && class168.field2109[var39][var40 + 1] == 0 && (var38[var41][var7 + var42] & 0x1240138) == 0 && (var38[var7 + var41 - 1][var7 + var42] & 0x12401E0) == 0) {
                                        int var48 = 1;
                                        while (true) {
                                            if (var48 >= var7 - 1) {
                                                class168.field2111[var79] = var30;
                                                class168.field2107[var79] = var31 + 1;
                                                var79 = var79 + 1 & 0xFFF;
                                                class168.field2109[var39][var40 + 1] = 4;
                                                class168.field2112[var39][var40 + 1] = var44;
                                                break;
                                            }
                                            if ((var38[var41 + var48][var7 + var42] & 0x12401F8) != 0) {
                                                break;
                                            }
                                            var48++;
                                        }
                                    }
                                    if (var39 > 0 && var40 > 0 && class168.field2109[var39 - 1][var40 - 1] == 0 && (var38[var41 - 1][var42 - 1] & 0x124010E) == 0) {
                                        int var49 = 1;
                                        while (true) {
                                            if (var49 >= var7) {
                                                class168.field2111[var79] = var30 - 1;
                                                class168.field2107[var79] = var31 - 1;
                                                var79 = var79 + 1 & 0xFFF;
                                                class168.field2109[var39 - 1][var40 - 1] = 3;
                                                class168.field2112[var39 - 1][var40 - 1] = var44;
                                                break;
                                            }
                                            if ((var38[var41 - 1][var42 - 1 + var49] & 0x124013E) != 0 || (var38[var41 - 1 + var49][var42 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var49++;
                                        }
                                    }
                                    if (var39 < 128 - var7 && var40 > 0 && class168.field2109[var39 + 1][var40 - 1] == 0 && (var38[var7 + var41][var42 - 1] & 0x1240183) == 0) {
                                        int var50 = 1;
                                        while (true) {
                                            if (var50 >= var7) {
                                                class168.field2111[var79] = var30 + 1;
                                                class168.field2107[var79] = var31 - 1;
                                                var79 = var79 + 1 & 0xFFF;
                                                class168.field2109[var39 + 1][var40 - 1] = 9;
                                                class168.field2112[var39 + 1][var40 - 1] = var44;
                                                break;
                                            }
                                            if ((var38[var7 + var41][var42 - 1 + var50] & 0x12401E3) != 0 || (var38[var41 + var50][var42 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var50++;
                                        }
                                    }
                                    if (var39 > 0 && var40 < 128 - var7 && class168.field2109[var39 - 1][var40 + 1] == 0 && (var38[var41 - 1][var7 + var42] & 0x1240138) == 0) {
                                        for (int var51 = 1; var51 < var7; var51++) {
                                            if ((var38[var41 - 1][var42 + var51] & 0x124013E) != 0 || (var38[var41 - 1 + var51][var7 + var42] & 0x12401F8) != 0) {
                                                continue label525;
                                            }
                                        }
                                        class168.field2111[var79] = var30 - 1;
                                        class168.field2107[var79] = var31 + 1;
                                        var79 = var79 + 1 & 0xFFF;
                                        class168.field2109[var39 - 1][var40 + 1] = 6;
                                        class168.field2112[var39 - 1][var40 + 1] = var44;
                                    }
                                } while (var39 >= 128 - var7);
                            } while (var40 >= 128 - var7);
                        } while (class168.field2109[var39 + 1][var40 + 1] != 0);
                    } while ((var38[var7 + var41][var7 + var42] & 0x12401E0) != 0);
                    for (int var52 = 1; var52 < var7; var52++) {
                        if ((var38[var41 + var52][var7 + var42] & 0x12401F8) != 0 || (var38[var7 + var41][var42 + var52] & 0x12401E3) != 0) {
                            continue label548;
                        }
                    }
                    class168.field2111[var79] = var30 + 1;
                    class168.field2107[var79] = var31 + 1;
                    var79 = var79 + 1 & 0xFFF;
                    class168.field2109[var39 + 1][var40 + 1] = 12;
                    class168.field2112[var39 + 1][var40 + 1] = var44;
                }
            }
            var14 = var43;
        }
        int var71;
        label606: {
            int var53 = var4 - 64;
            int var54 = var5 - 64;
            int var55 = Statics.field3799;
            int var56 = Statics.field2049;
            if (!var14) {
                int var57 = Integer.MAX_VALUE;
                int var58 = Integer.MAX_VALUE;
                byte var59 = 10;
                int var60 = var8.field2117;
                int var61 = var8.field2116;
                int var62 = var8.field2115;
                int var63 = var8.field2118;
                for (int var64 = var60 - var59; var64 <= var59 + var60; var64++) {
                    for (int var65 = var61 - var59; var65 <= var59 + var61; var65++) {
                        int var66 = var64 - var53;
                        int var67 = var65 - var54;
                        if (var66 >= 0 && var67 >= 0 && var66 < 128 && var67 < 128 && class168.field2112[var66][var67] < 100) {
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
                            if (var70 < var57 || var57 == var70 && class168.field2112[var66][var67] < var58) {
                                var57 = var70;
                                var58 = class168.field2112[var66][var67];
                                var55 = var64;
                                var56 = var65;
                            }
                        }
                    }
                }
                if (var57 == Integer.MAX_VALUE) {
                    var71 = -1;
                    break label606;
                }
            }
            if (var4 == var55 && var5 == var56) {
                var71 = 0;
            } else {
                byte var72 = 0;
                class168.field2111[var72] = var55;
                int var80 = var72 + 1;
                class168.field2107[var72] = var56;
                int var73;
                int var74 = var73 = class168.field2109[var55 - var53][var56 - var54];
                while (var4 != var55 || var5 != var56) {
                    if (var73 != var74) {
                        var73 = var74;
                        class168.field2111[var80] = var55;
                        class168.field2107[var80++] = var56;
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
                    var74 = class168.field2109[var55 - var53][var56 - var54];
                }
                int var75 = 0;
                while (var80-- > 0) {
                    var10[var75] = class168.field2111[var80];
                    var11[var75++] = class168.field2107[var80];
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
                arg0.method1080(field903[var77], field904[var77], arg3);
            }
        }
    }

    @ObfuscatedName("bd.hd(III)Lfh;")
    public static class169 method1764(int arg0, int arg1) {
        field902.field2117 = arg0;
        field902.field2116 = arg1;
        field902.field2115 = 1;
        field902.field2118 = 1;
        return field902;
    }

    @ObfuscatedName("j.hq(S)V")
    public static void method149() {
        field767 = 0;
        field837 = false;
        field772[0] = class240.field3100;
        field773[0] = "";
        field770[0] = 1006;
        field804[0] = false;
        field767 = 1;
    }

    @ObfuscatedName("ba.hu(IIIII)V")
    public static final void method1001(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field833; var4++) {
            if (field840[var4] + field799[var4] > arg0 && field799[var4] < arg0 + arg2 && field841[var4] + field839[var4] > arg1 && field839[var4] < arg1 + arg3) {
                field764[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.hn(I)V")
    public final void method1103() {
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < field767 - 1; var2++) {
                if (field770[var2] < 1000 && field770[var2 + 1] > 1000) {
                    String var3 = field773[var2];
                    field773[var2] = field773[var2 + 1];
                    field773[var2 + 1] = var3;
                    String var4 = field772[var2];
                    field772[var2] = field772[var2 + 1];
                    field772[var2 + 1] = var4;
                    int var5 = field770[var2];
                    field770[var2] = field770[var2 + 1];
                    field770[var2 + 1] = var5;
                    int var6 = field768[var2];
                    field768[var2] = field768[var2 + 1];
                    field768[var2 + 1] = var6;
                    int var7 = field769[var2];
                    field769[var2] = field769[var2 + 1];
                    field769[var2 + 1] = var7;
                    int var8 = field845[var2];
                    field845[var2] = field845[var2 + 1];
                    field845[var2 + 1] = var8;
                    boolean var9 = field804[var2];
                    field804[var2] = field804[var2 + 1];
                    field804[var2 + 1] = var9;
                    var1 = false;
                }
            }
        }
        if (Statics.field1497 != null || field803 != null) {
            return;
        }
        int var10 = class49.field468;
        if (field837) {
            if (var10 != 1 && (Statics.field43 || var10 != 4)) {
                int var11 = class49.field461;
                int var12 = class49.field462;
                if (var11 < Statics.field7 - 10 || var11 > Statics.field7 + Statics.field677 + 10 || var12 < Statics.field78 - 10 || var12 > Statics.field78 + Statics.field2460 + 10) {
                    field837 = false;
                    int var13 = Statics.field7;
                    int var14 = Statics.field78;
                    int var15 = Statics.field677;
                    int var16 = Statics.field2460;
                    for (int var17 = 0; var17 < field833; var17++) {
                        if (field840[var17] + field799[var17] > var13 && field799[var17] < var13 + var15 && field841[var17] + field839[var17] > var14 && field839[var17] < var14 + var16) {
                            field828[var17] = true;
                        }
                    }
                }
            }
            if (var10 == 1 || !Statics.field43 && var10 == 4) {
                int var18 = Statics.field7;
                int var19 = Statics.field78;
                int var20 = Statics.field677;
                int var21 = class49.field466;
                int var22 = class49.field470;
                int var23 = -1;
                for (int var24 = 0; var24 < field767; var24++) {
                    int var25 = (field767 - 1 - var24) * 15 + var19 + 31;
                    if (var21 > var18 && var21 < var18 + var20 && var22 > var25 - 13 && var22 < var25 + 3) {
                        var23 = var24;
                    }
                }
                if (var23 != -1) {
                    method4678(var23);
                }
                field837 = false;
                int var26 = Statics.field7;
                int var27 = Statics.field78;
                int var28 = Statics.field677;
                int var29 = Statics.field2460;
                for (int var30 = 0; var30 < field833; var30++) {
                    if (field840[var30] + field799[var30] > var26 && field799[var30] < var26 + var28 && field841[var30] + field839[var30] > var27 && field839[var30] < var27 + var29) {
                        field828[var30] = true;
                    }
                }
            }
            return;
        }
        int var31 = field767 - 1;
        if ((var10 == 1 || !Statics.field43 && var10 == 4) && var31 >= 0) {
            int var33 = field770[var31];
            if (var33 == 39 || var33 == 40 || var33 == 41 || var33 == 42 || var33 == 43 || var33 == 33 || var33 == 34 || var33 == 35 || var33 == 36 || var33 == 37 || var33 == 38 || var33 == 1005) {
                label245: {
                    int var34 = field768[var31];
                    int var35 = field769[var31];
                    class233 var36 = class233.method1754(var35);
                    if (!class234.method78(method2995(var36))) {
                        int var37 = method2995(var36);
                        boolean var38 = (var37 >> 29 & 0x1) != 0;
                        if (!var38) {
                            break label245;
                        }
                    }
                    if (Statics.field1497 != null && !field742 && field767 > 0 && !this.method1104()) {
                        int var39 = field739;
                        int var40 = field829;
                        method937(Statics.field560, var39, var40);
                        Statics.field560 = null;
                    }
                    field742 = false;
                    field743 = 0;
                    if (Statics.field1497 != null) {
                        method272(Statics.field1497);
                    }
                    Statics.field1497 = class233.method1754(var35);
                    field738 = var34;
                    field739 = class49.field466;
                    field829 = class49.field470;
                    if (var31 >= 0) {
                        Statics.field560 = new class77();
                        Statics.field560.field1111 = field768[var31];
                        Statics.field560.field1118 = field769[var31];
                        Statics.field560.field1113 = field770[var31];
                        Statics.field560.field1114 = field845[var31];
                        Statics.field560.field1116 = field772[var31];
                    }
                    method272(Statics.field1497);
                    return;
                }
            }
        }
        if ((var10 == 1 || !Statics.field43 && var10 == 4) && this.method1104()) {
            var10 = 2;
        }
        if ((var10 == 1 || !Statics.field43 && var10 == 4) && field767 > 0) {
            method4678(var31);
        }
        if (var10 == 2 && field767 > 0) {
            this.method1154(class49.field466, class49.field470);
        }
    }

    @ObfuscatedName("client.hl(I)Z")
    public final boolean method1104() {
        int var1 = field767 - 1;
        return (field765 == 1 && field767 > 2 || method144(var1)) && !field804[var1];
    }

    @ObfuscatedName("client.hv(IIB)V")
    public final void method1154(int arg0, int arg1) {
        method1768(arg0, arg1);
        Statics.field3406.method2894(Statics.field1983, arg0, arg1, false);
        field837 = true;
    }

    @ObfuscatedName("ak.hh(I)V")
    public static void method941() {
        method1768(Statics.field677 / 2 + Statics.field7, Statics.field78);
    }

    @ObfuscatedName("bc.hb(III)V")
    public static void method1768(int arg0, int arg1) {
        int var2 = Statics.field2818.method5278(class240.field3014);
        for (int var3 = 0; var3 < field767; var3++) {
            int var4 = Statics.field2818.method5278(method1736(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field767 * 15 + 22;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > Statics.field2652) {
            var6 = Statics.field2652 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > Statics.field253) {
            var7 = Statics.field253 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        Statics.field7 = var6;
        Statics.field78 = var7;
        Statics.field677 = var2;
        Statics.field2460 = field767 * 15 + 22;
    }

    @ObfuscatedName("g.hf(IB)Z")
    public static final boolean method144(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field770[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("jl.hi(IB)V")
    public static final void method4678(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field768[arg0];
        int var2 = field769[arg0];
        int var3 = field770[arg0];
        int var4 = field845[arg0];
        String var5 = field772[arg0];
        String var6 = field773[arg0];
        method4937(var1, var2, var3, var4, var5, var6, class49.field466, class49.field470);
    }

    @ObfuscatedName("ay.hs(Lbh;IIB)V")
    public static final void method937(class77 arg0, int arg1, int arg2) {
        method4937(arg0.field1111, arg0.field1118, arg0.field1113, arg0.field1114, arg0.field1116, arg0.field1116, arg1, arg2);
    }

    @ObfuscatedName("ju.hc(IIIILjava/lang/String;Ljava/lang/String;IIB)V")
    public static final void method4937(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 1001) {
            field847 = arg6;
            field732 = arg7;
            field734 = 2;
            field722 = 0;
            field693 = arg0;
            field891 = arg1;
            class175 var8 = class175.method85(class172.field2302, field861.field1287);
            var8.field2335.method3330(arg3);
            var8.field2335.method3370(class40.field373[82] ? 1 : 0);
            var8.field2335.method3380(Statics.field321 + arg0);
            var8.field2335.method3457(Statics.field2611 + arg1);
            field861.method1944(var8);
        }
        if (arg2 == 8) {
            class74 var9 = field672[arg3];
            if (var9 != null) {
                field847 = arg6;
                field732 = arg7;
                field734 = 2;
                field722 = 0;
                field693 = arg0;
                field891 = arg1;
                class175 var10 = class175.method85(class172.field2294, field861.field1287);
                var10.field2335.method3457(arg3);
                var10.field2335.method3371(class40.field373[82] ? 1 : 0);
                var10.field2335.method3388(Statics.field3631);
                var10.field2335.method3380(field786);
                field861.method1944(var10);
            }
        }
        if (arg2 == 49) {
            class62 var11 = field746[arg3];
            if (var11 != null) {
                field847 = arg6;
                field732 = arg7;
                field734 = 2;
                field722 = 0;
                field693 = arg0;
                field891 = arg1;
                class175 var12 = class175.method85(class172.field2261, field861.field1287);
                var12.field2335.method3380(arg3);
                var12.field2335.method3372(class40.field373[82] ? 1 : 0);
                field861.method1944(var12);
            }
        }
        if (arg2 == 16) {
            field847 = arg6;
            field732 = arg7;
            field734 = 2;
            field722 = 0;
            field693 = arg0;
            field891 = arg1;
            class175 var13 = class175.method85(class172.field2285, field861.field1287);
            var13.field2335.method3389(Statics.field412);
            var13.field2335.method3457(Statics.field3679);
            var13.field2335.method3370(class40.field373[82] ? 1 : 0);
            var13.field2335.method3343(Statics.field3387);
            var13.field2335.method3457(arg3);
            var13.field2335.method3457(Statics.field321 + arg0);
            var13.field2335.method3343(Statics.field2611 + arg1);
            field861.method1944(var13);
        }
        if (arg2 == 46) {
            class62 var14 = field746[arg3];
            if (var14 != null) {
                field847 = arg6;
                field732 = arg7;
                field734 = 2;
                field722 = 0;
                field693 = arg0;
                field891 = arg1;
                class175 var15 = class175.method85(class172.field2270, field861.field1287);
                var15.field2335.method3380(arg3);
                var15.field2335.method3376(class40.field373[82] ? 1 : 0);
                field861.method1944(var15);
            }
        }
        if (arg2 == 34) {
            class175 var16 = class175.method85(class172.field2264, field861.field1287);
            var16.field2335.method3380(arg3);
            var16.field2335.method3390(arg1);
            var16.field2335.method3457(arg0);
            field861.method1944(var16);
            field908 = 0;
            Statics.field179 = class233.method1754(arg1);
            field737 = arg0;
        }
        if (arg2 == 1) {
            field847 = arg6;
            field732 = arg7;
            field734 = 2;
            field722 = 0;
            field693 = arg0;
            field891 = arg1;
            class175 var17 = class175.method85(class172.field2298, field861.field1287);
            var17.field2335.method3457(Statics.field2611 + arg1);
            var17.field2335.method3343(Statics.field3387);
            var17.field2335.method3370(class40.field373[82] ? 1 : 0);
            var17.field2335.method3388(Statics.field412);
            var17.field2335.method3457(Statics.field321 + arg0);
            var17.field2335.method3330(arg3);
            var17.field2335.method3343(Statics.field3679);
            field861.method1944(var17);
        }
        if (arg2 == 33) {
            class175 var18 = class175.method85(class172.field2295, field861.field1287);
            var18.field2335.method3343(arg3);
            var18.field2335.method3389(arg1);
            var18.field2335.method3330(arg0);
            field861.method1944(var18);
            field908 = 0;
            Statics.field179 = class233.method1754(arg1);
            field737 = arg0;
        }
        if (arg2 == 31) {
            class175 var19 = class175.method85(class172.field2301, field861.field1287);
            var19.field2335.method3389(arg1);
            var19.field2335.method3390(Statics.field412);
            var19.field2335.method3457(Statics.field3387);
            var19.field2335.method3343(Statics.field3679);
            var19.field2335.method3343(arg0);
            var19.field2335.method3457(arg3);
            field861.method1944(var19);
            field908 = 0;
            Statics.field179 = class233.method1754(arg1);
            field737 = arg0;
        }
        if (arg2 == 37) {
            class175 var20 = class175.method85(class172.field2275, field861.field1287);
            var20.field2335.method3422(arg1);
            var20.field2335.method3330(arg0);
            var20.field2335.method3330(arg3);
            field861.method1944(var20);
            field908 = 0;
            Statics.field179 = class233.method1754(arg1);
            field737 = arg0;
        }
        if (arg2 == 51) {
            class62 var21 = field746[arg3];
            if (var21 != null) {
                field847 = arg6;
                field732 = arg7;
                field734 = 2;
                field722 = 0;
                field693 = arg0;
                field891 = arg1;
                class175 var22 = class175.method85(class172.field2258, field861.field1287);
                var22.field2335.method3371(class40.field373[82] ? 1 : 0);
                var22.field2335.method3457(arg3);
                field861.method1944(var22);
            }
        }
        if (arg2 == 3) {
            field847 = arg6;
            field732 = arg7;
            field734 = 2;
            field722 = 0;
            field693 = arg0;
            field891 = arg1;
            class175 var23 = class175.method85(class172.field2218, field861.field1287);
            var23.field2335.method3330(Statics.field2611 + arg1);
            var23.field2335.method3372(class40.field373[82] ? 1 : 0);
            var23.field2335.method3380(arg3);
            var23.field2335.method3457(Statics.field321 + arg0);
            field861.method1944(var23);
        }
        if (arg2 == 41) {
            class175 var24 = class175.method85(class172.field2273, field861.field1287);
            var24.field2335.method3388(arg1);
            var24.field2335.method3380(arg0);
            var24.field2335.method3330(arg3);
            field861.method1944(var24);
            field908 = 0;
            Statics.field179 = class233.method1754(arg1);
            field737 = arg0;
        }
        if (arg2 == 10) {
            class74 var25 = field672[arg3];
            if (var25 != null) {
                field847 = arg6;
                field732 = arg7;
                field734 = 2;
                field722 = 0;
                field693 = arg0;
                field891 = arg1;
                class175 var26 = class175.method85(class172.field2209, field861.field1287);
                var26.field2335.method3380(arg3);
                var26.field2335.method3376(class40.field373[82] ? 1 : 0);
                field861.method1944(var26);
            }
        }
        if (arg2 == 24) {
            class233 var27 = class233.method1754(arg1);
            boolean var28 = true;
            if (var27.field2672 > 0) {
                var28 = method280(var27);
            }
            if (var28) {
                class175 var29 = class175.method85(class172.field2277, field861.field1287);
                var29.field2335.method3422(arg1);
                field861.method1944(var29);
            }
        }
        if (arg2 == 15) {
            class62 var30 = field746[arg3];
            if (var30 != null) {
                field847 = arg6;
                field732 = arg7;
                field734 = 2;
                field722 = 0;
                field693 = arg0;
                field891 = arg1;
                class175 var31 = class175.method85(class172.field2208, field861.field1287);
                var31.field2335.method3390(Statics.field3631);
                var31.field2335.method3372(class40.field373[82] ? 1 : 0);
                var31.field2335.method3380(field786);
                var31.field2335.method3330(arg3);
                field861.method1944(var31);
            }
        }
        if (arg2 == 39) {
            class175 var32 = class175.method85(class172.field2254, field861.field1287);
            var32.field2335.method3457(arg3);
            var32.field2335.method3390(arg1);
            var32.field2335.method3343(arg0);
            field861.method1944(var32);
            field908 = 0;
            Statics.field179 = class233.method1754(arg1);
            field737 = arg0;
        }
        if (arg2 == 50) {
            class62 var33 = field746[arg3];
            if (var33 != null) {
                field847 = arg6;
                field732 = arg7;
                field734 = 2;
                field722 = 0;
                field693 = arg0;
                field891 = arg1;
                class175 var34 = class175.method85(class172.field2290, field861.field1287);
                var34.field2335.method3372(class40.field373[82] ? 1 : 0);
                var34.field2335.method3343(arg3);
                field861.method1944(var34);
            }
        }
        if (arg2 == 7) {
            class74 var35 = field672[arg3];
            if (var35 != null) {
                field847 = arg6;
                field732 = arg7;
                field734 = 2;
                field722 = 0;
                field693 = arg0;
                field891 = arg1;
                class175 var36 = class175.method85(class172.field2231, field861.field1287);
                var36.field2335.method3457(Statics.field3679);
                var36.field2335.method3330(Statics.field3387);
                var36.field2335.method3457(arg3);
                var36.field2335.method3371(class40.field373[82] ? 1 : 0);
                var36.field2335.method3422(Statics.field412);
                field861.method1944(var36);
            }
        }
        if (arg2 == 9) {
            class74 var37 = field672[arg3];
            if (var37 != null) {
                field847 = arg6;
                field732 = arg7;
                field734 = 2;
                field722 = 0;
                field693 = arg0;
                field891 = arg1;
                class175 var38 = class175.method85(class172.field2279, field861.field1287);
                var38.field2335.method3371(class40.field373[82] ? 1 : 0);
                var38.field2335.method3343(arg3);
                field861.method1944(var38);
            }
        }
        if (arg2 == 5) {
            field847 = arg6;
            field732 = arg7;
            field734 = 2;
            field722 = 0;
            field693 = arg0;
            field891 = arg1;
            class175 var39 = class175.method85(class172.field2297, field861.field1287);
            var39.field2335.method3457(Statics.field321 + arg0);
            var39.field2335.method3380(arg3);
            var39.field2335.method3457(Statics.field2611 + arg1);
            var39.field2335.method3370(class40.field373[82] ? 1 : 0);
            field861.method1944(var39);
        }
        if (arg2 == 40) {
            class175 var40 = class175.method85(class172.field2234, field861.field1287);
            var40.field2335.method3390(arg1);
            var40.field2335.method3343(arg0);
            var40.field2335.method3380(arg3);
            field861.method1944(var40);
            field908 = 0;
            Statics.field179 = class233.method1754(arg1);
            field737 = arg0;
        }
        if (arg2 == 25) {
            class233 var41 = class233.method434(arg1, arg0);
            if (var41 != null) {
                method902();
                method433(arg1, arg0, class234.method4384(method2995(var41)), var41.field2786);
                field783 = 0;
                field788 = method175(var41);
                if (field788 == null) {
                    field788 = class240.field2865;
                }
                if (var41.field2667) {
                    field789 = var41.field2793 + class76.method2910(16777215);
                } else {
                    field789 = class76.method2910(65280) + var41.field2674 + class76.method2910(16777215);
                }
            }
            return;
        }
        if (arg2 == 35) {
            class175 var42 = class175.method85(class172.field2296, field861.field1287);
            var42.field2335.method3388(arg1);
            var42.field2335.method3457(arg0);
            var42.field2335.method3457(arg3);
            field861.method1944(var42);
            field908 = 0;
            Statics.field179 = class233.method1754(arg1);
            field737 = arg0;
        }
        if (arg2 == 20) {
            field847 = arg6;
            field732 = arg7;
            field734 = 2;
            field722 = 0;
            field693 = arg0;
            field891 = arg1;
            class175 var43 = class175.method85(class172.field2214, field861.field1287);
            var43.field2335.method3343(Statics.field2611 + arg1);
            var43.field2335.method3372(class40.field373[82] ? 1 : 0);
            var43.field2335.method3343(Statics.field321 + arg0);
            var43.field2335.method3343(arg3);
            field861.method1944(var43);
        }
        if (arg2 == 22) {
            field847 = arg6;
            field732 = arg7;
            field734 = 2;
            field722 = 0;
            field693 = arg0;
            field891 = arg1;
            class175 var44 = class175.method85(class172.field2252, field861.field1287);
            var44.field2335.method3376(class40.field373[82] ? 1 : 0);
            var44.field2335.method3457(arg3);
            var44.field2335.method3380(Statics.field2611 + arg1);
            var44.field2335.method3330(Statics.field321 + arg0);
            field861.method1944(var44);
        }
        if (arg2 == 45) {
            class62 var45 = field746[arg3];
            if (var45 != null) {
                field847 = arg6;
                field732 = arg7;
                field734 = 2;
                field722 = 0;
                field693 = arg0;
                field891 = arg1;
                class175 var46 = class175.method85(class172.field2274, field861.field1287);
                var46.field2335.method3370(class40.field373[82] ? 1 : 0);
                var46.field2335.method3380(arg3);
                field861.method1944(var46);
            }
        }
        if (arg2 == 21) {
            field847 = arg6;
            field732 = arg7;
            field734 = 2;
            field722 = 0;
            field693 = arg0;
            field891 = arg1;
            class175 var47 = class175.method85(class172.field2235, field861.field1287);
            var47.field2335.method3380(Statics.field2611 + arg1);
            var47.field2335.method3343(arg3);
            var47.field2335.method3330(Statics.field321 + arg0);
            var47.field2335.method3372(class40.field373[82] ? 1 : 0);
            field861.method1944(var47);
        }
        if (arg2 == 47) {
            class62 var48 = field746[arg3];
            if (var48 != null) {
                field847 = arg6;
                field732 = arg7;
                field734 = 2;
                field722 = 0;
                field693 = arg0;
                field891 = arg1;
                class175 var49 = class175.method85(class172.field2259, field861.field1287);
                var49.field2335.method3457(arg3);
                var49.field2335.method3371(class40.field373[82] ? 1 : 0);
                field861.method1944(var49);
            }
        }
        if (arg2 == 1004) {
            field847 = arg6;
            field732 = arg7;
            field734 = 2;
            field722 = 0;
            class175 var50 = class175.method85(class172.field2232, field861.field1287);
            var50.field2335.method3343(arg3);
            field861.method1944(var50);
        }
        if (arg2 == 44) {
            class62 var51 = field746[arg3];
            if (var51 != null) {
                field847 = arg6;
                field732 = arg7;
                field734 = 2;
                field722 = 0;
                field693 = arg0;
                field891 = arg1;
                class175 var52 = class175.method85(class172.field2255, field861.field1287);
                var52.field2335.method3330(arg3);
                var52.field2335.method3371(class40.field373[82] ? 1 : 0);
                field861.method1944(var52);
            }
        }
        if (arg2 == 11) {
            class74 var53 = field672[arg3];
            if (var53 != null) {
                field847 = arg6;
                field732 = arg7;
                field734 = 2;
                field722 = 0;
                field693 = arg0;
                field891 = arg1;
                class175 var54 = class175.method85(class172.field2241, field861.field1287);
                var54.field2335.method3457(arg3);
                var54.field2335.method3376(class40.field373[82] ? 1 : 0);
                field861.method1944(var54);
            }
        }
        if (arg2 == 48) {
            class62 var55 = field746[arg3];
            if (var55 != null) {
                field847 = arg6;
                field732 = arg7;
                field734 = 2;
                field722 = 0;
                field693 = arg0;
                field891 = arg1;
                class175 var56 = class175.method85(class172.field2291, field861.field1287);
                var56.field2335.method3370(class40.field373[82] ? 1 : 0);
                var56.field2335.method3380(arg3);
                field861.method1944(var56);
            }
        }
        if (arg2 == 30 && field796 == null) {
            method903(arg1, arg0);
            field796 = class233.method434(arg1, arg0);
            method272(field796);
        }
        if (arg2 == 19) {
            field847 = arg6;
            field732 = arg7;
            field734 = 2;
            field722 = 0;
            field693 = arg0;
            field891 = arg1;
            class175 var57 = class175.method85(class172.field2282, field861.field1287);
            var57.field2335.method3457(arg3);
            var57.field2335.method3380(Statics.field321 + arg0);
            var57.field2335.method3330(Statics.field2611 + arg1);
            var57.field2335.method3376(class40.field373[82] ? 1 : 0);
            field861.method1944(var57);
        }
        if (arg2 == 28) {
            class175 var58 = class175.method85(class172.field2277, field861.field1287);
            var58.field2335.method3422(arg1);
            field861.method1944(var58);
            class233 var59 = class233.method1754(arg1);
            if (var59.field2755 != null && var59.field2755[0][0] == 5) {
                int var60 = var59.field2755[0][1];
                class228.field2628[var60] = 1 - class228.field2628[var60];
                method290(var60);
            }
        }
        if (arg2 == 29) {
            class175 var61 = class175.method85(class172.field2277, field861.field1287);
            var61.field2335.method3422(arg1);
            field861.method1944(var61);
            class233 var62 = class233.method1754(arg1);
            if (var62.field2755 != null && var62.field2755[0][0] == 5) {
                int var63 = var62.field2755[0][1];
                if (class228.field2628[var63] != var62.field2788[0]) {
                    class228.field2628[var63] = var62.field2788[0];
                    method290(var63);
                }
            }
        }
        if (arg2 == 58) {
            class233 var64 = class233.method434(arg1, arg0);
            if (var64 != null) {
                class175 var65 = class175.method85(class172.field2222, field861.field1287);
                var65.field2335.method3343(field786);
                var65.field2335.method3390(arg1);
                var65.field2335.method3343(field787);
                var65.field2335.method3457(arg0);
                var65.field2335.method3422(Statics.field3631);
                var65.field2335.method3457(var64.field2786);
                field861.method1944(var65);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class233 var66 = class233.method434(arg1, arg0);
            if (var66 != null) {
                method2970(arg3, arg1, arg0, var66.field2786, arg5);
            }
        }
        if (arg2 == 4) {
            field847 = arg6;
            field732 = arg7;
            field734 = 2;
            field722 = 0;
            field693 = arg0;
            field891 = arg1;
            class175 var67 = class175.method85(class172.field2287, field861.field1287);
            var67.field2335.method3370(class40.field373[82] ? 1 : 0);
            var67.field2335.method3330(arg3);
            var67.field2335.method3330(Statics.field2611 + arg1);
            var67.field2335.method3330(Statics.field321 + arg0);
            field861.method1944(var67);
        }
        if (arg2 == 6) {
            field847 = arg6;
            field732 = arg7;
            field734 = 2;
            field722 = 0;
            field693 = arg0;
            field891 = arg1;
            class175 var68 = class175.method85(class172.field2211, field861.field1287);
            var68.field2335.method3370(class40.field373[82] ? 1 : 0);
            var68.field2335.method3380(Statics.field2611 + arg1);
            var68.field2335.method3380(Statics.field321 + arg0);
            var68.field2335.method3343(arg3);
            field861.method1944(var68);
        }
        if (arg2 == 23) {
            if (field837) {
                Statics.field3406.method2761();
            } else {
                Statics.field3406.method2894(Statics.field1983, arg0, arg1, true);
            }
        }
        if (arg2 == 1003) {
            field847 = arg6;
            field732 = arg7;
            field734 = 2;
            field722 = 0;
            class74 var69 = field672[arg3];
            if (var69 != null) {
                class274 var70 = var69.field1091;
                if (var70.field3589 != null) {
                    var70 = var70.method4868();
                }
                if (var70 != null) {
                    class175 var71 = class175.method85(class172.field2238, field861.field1287);
                    var71.field2335.method3380(var70.field3578);
                    field861.method1944(var71);
                }
            }
        }
        if (arg2 == 38) {
            method902();
            class233 var72 = class233.method1754(arg1);
            field783 = 1;
            Statics.field3387 = arg0;
            Statics.field412 = arg1;
            Statics.field3679 = arg3;
            method272(var72);
            field733 = class76.method2910(16748608) + class272.method92(arg3).field3523 + class76.method2910(16777215);
            if (field733 == null) {
                field733 = class240.field2865;
            }
            return;
        }
        if (arg2 == 1002) {
            field847 = arg6;
            field732 = arg7;
            field734 = 2;
            field722 = 0;
            class175 var73 = class175.method85(class172.field2308, field861.field1287);
            var73.field2335.method3380(arg3);
            field861.method1944(var73);
        }
        if (arg2 == 13) {
            class74 var74 = field672[arg3];
            if (var74 != null) {
                field847 = arg6;
                field732 = arg7;
                field734 = 2;
                field722 = 0;
                field693 = arg0;
                field891 = arg1;
                class175 var75 = class175.method85(class172.field2239, field861.field1287);
                var75.field2335.method3376(class40.field373[82] ? 1 : 0);
                var75.field2335.method3380(arg3);
                field861.method1944(var75);
            }
        }
        if (arg2 == 2) {
            field847 = arg6;
            field732 = arg7;
            field734 = 2;
            field722 = 0;
            field693 = arg0;
            field891 = arg1;
            class175 var76 = class175.method85(class172.field2281, field861.field1287);
            var76.field2335.method3376(class40.field373[82] ? 1 : 0);
            var76.field2335.method3330(Statics.field321 + arg0);
            var76.field2335.method3380(arg3);
            var76.field2335.method3390(Statics.field3631);
            var76.field2335.method3330(field786);
            var76.field2335.method3343(Statics.field2611 + arg1);
            field861.method1944(var76);
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field607.method5901(arg2, arg3, new class229(arg0), new class229(arg1));
        }
        if (arg2 == 12) {
            class74 var77 = field672[arg3];
            if (var77 != null) {
                field847 = arg6;
                field732 = arg7;
                field734 = 2;
                field722 = 0;
                field693 = arg0;
                field891 = arg1;
                class175 var78 = class175.method85(class172.field2267, field861.field1287);
                var78.field2335.method3330(arg3);
                var78.field2335.method3370(class40.field373[82] ? 1 : 0);
                field861.method1944(var78);
            }
        }
        if (arg2 == 17) {
            field847 = arg6;
            field732 = arg7;
            field734 = 2;
            field722 = 0;
            field693 = arg0;
            field891 = arg1;
            class175 var79 = class175.method85(class172.field2253, field861.field1287);
            var79.field2335.method3389(Statics.field3631);
            var79.field2335.method3330(field786);
            var79.field2335.method3380(Statics.field2611 + arg1);
            var79.field2335.method3380(Statics.field321 + arg0);
            var79.field2335.method3370(class40.field373[82] ? 1 : 0);
            var79.field2335.method3343(arg3);
            field861.method1944(var79);
        }
        if (arg2 == 43) {
            class175 var80 = class175.method85(class172.field2251, field861.field1287);
            var80.field2335.method3330(arg3);
            var80.field2335.method3389(arg1);
            var80.field2335.method3330(arg0);
            field861.method1944(var80);
            field908 = 0;
            Statics.field179 = class233.method1754(arg1);
            field737 = arg0;
        }
        if (arg2 == 32) {
            class175 var81 = class175.method85(class172.field2226, field861.field1287);
            var81.field2335.method3389(Statics.field3631);
            var81.field2335.method3422(arg1);
            var81.field2335.method3330(arg0);
            var81.field2335.method3343(arg3);
            var81.field2335.method3343(field786);
            field861.method1944(var81);
            field908 = 0;
            Statics.field179 = class233.method1754(arg1);
            field737 = arg0;
        }
        if (arg2 == 26) {
            method3133();
        }
        if (arg2 == 42) {
            class175 var82 = class175.method85(class172.field2272, field861.field1287);
            var82.field2335.method3422(arg1);
            var82.field2335.method3380(arg0);
            var82.field2335.method3330(arg3);
            field861.method1944(var82);
            field908 = 0;
            Statics.field179 = class233.method1754(arg1);
            field737 = arg0;
        }
        if (arg2 == 14) {
            class62 var83 = field746[arg3];
            if (var83 != null) {
                field847 = arg6;
                field732 = arg7;
                field734 = 2;
                field722 = 0;
                field693 = arg0;
                field891 = arg1;
                class175 var84 = class175.method85(class172.field2289, field861.field1287);
                var84.field2335.method3457(Statics.field3387);
                var84.field2335.method3372(class40.field373[82] ? 1 : 0);
                var84.field2335.method3389(Statics.field412);
                var84.field2335.method3330(arg3);
                var84.field2335.method3330(Statics.field3679);
                field861.method1944(var84);
            }
        }
        if (arg2 == 1005) {
            class233 var85 = class233.method1754(arg1);
            if (var85 == null || var85.field2806[arg0] < 100000) {
                class175 var86 = class175.method85(class172.field2232, field861.field1287);
                var86.field2335.method3343(arg3);
                field861.method1944(var86);
            } else {
                class86.method3230(27, "", var85.field2806[arg0] + " x " + class272.method92(arg3).field3523);
            }
            field908 = 0;
            Statics.field179 = class233.method1754(arg1);
            field737 = arg0;
        }
        if (arg2 == 36) {
            class175 var87 = class175.method85(class172.field2215, field861.field1287);
            var87.field2335.method3457(arg3);
            var87.field2335.method3422(arg1);
            var87.field2335.method3457(arg0);
            field861.method1944(var87);
            field908 = 0;
            Statics.field179 = class233.method1754(arg1);
            field737 = arg0;
        }
        if (arg2 == 18) {
            field847 = arg6;
            field732 = arg7;
            field734 = 2;
            field722 = 0;
            field693 = arg0;
            field891 = arg1;
            class175 var88 = class175.method85(class172.field2213, field861.field1287);
            var88.field2335.method3457(Statics.field2611 + arg1);
            var88.field2335.method3343(arg3);
            var88.field2335.method3343(Statics.field321 + arg0);
            var88.field2335.method3376(class40.field373[82] ? 1 : 0);
            field861.method1944(var88);
        }
        if (field783 != 0) {
            field783 = 0;
            method272(class233.method1754(Statics.field412));
        }
        if (field785) {
            method902();
        }
        if (Statics.field179 != null && field908 == 0) {
            method272(Statics.field179);
        }
    }

    @ObfuscatedName("y.hm(IIIII)V")
    public static void method433(int arg0, int arg1, int arg2, int arg3) {
        class233 var4 = class233.method434(arg0, arg1);
        if (var4 != null && var4.field2790 != null) {
            class58 var5 = new class58();
            var5.field563 = var4;
            var5.field569 = var4.field2790;
            class71.method5372(var5);
        }
        field787 = arg3;
        field785 = true;
        Statics.field3631 = arg0;
        field786 = arg1;
        Statics.field204 = arg2;
        method272(var4);
    }

    @ObfuscatedName("an.hy(I)V")
    public static void method902() {
        if (!field785) {
            return;
        }
        class233 var0 = class233.method434(Statics.field3631, field786);
        if (var0 != null && var0.field2766 != null) {
            class58 var1 = new class58();
            var1.field563 = var0;
            var1.field569 = var0.field2766;
            class71.method5372(var1);
        }
        field785 = false;
        method272(var0);
    }

    @ObfuscatedName("an.hp(IIB)V")
    public static void method903(int arg0, int arg1) {
        class175 var2 = class175.method85(class172.field2278, field861.field1287);
        var2.field2335.method3390(arg0);
        var2.field2335.method3380(arg1);
        field861.method1944(var2);
    }

    @ObfuscatedName("ex.hg(IIIILjava/lang/String;B)V")
    public static void method2970(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class233 var5 = class233.method434(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2774 != null) {
            class58 var6 = new class58();
            var6.field563 = var5;
            var6.field566 = arg0;
            var6.field570 = arg4;
            var6.field569 = var5.field2774;
            class71.method5372(var6);
        }
        boolean var7 = true;
        if (var5.field2672 > 0) {
            var7 = method280(var5);
        }
        if (!var7 || !class234.method183(method2995(var5), arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            class175 var8 = class175.method85(class172.field2276, field861.field1287);
            var8.field2335.method3422(arg1);
            var8.field2335.method3330(arg2);
            var8.field2335.method3330(arg3);
            field861.method1944(var8);
        }
        if (arg0 == 2) {
            class175 var9 = class175.method85(class172.field2229, field861.field1287);
            var9.field2335.method3422(arg1);
            var9.field2335.method3330(arg2);
            var9.field2335.method3330(arg3);
            field861.method1944(var9);
        }
        if (arg0 == 3) {
            class175 var10 = class175.method85(class172.field2256, field861.field1287);
            var10.field2335.method3422(arg1);
            var10.field2335.method3330(arg2);
            var10.field2335.method3330(arg3);
            field861.method1944(var10);
        }
        if (arg0 == 4) {
            class175 var11 = class175.method85(class172.field2244, field861.field1287);
            var11.field2335.method3422(arg1);
            var11.field2335.method3330(arg2);
            var11.field2335.method3330(arg3);
            field861.method1944(var11);
        }
        if (arg0 == 5) {
            class175 var12 = class175.method85(class172.field2248, field861.field1287);
            var12.field2335.method3422(arg1);
            var12.field2335.method3330(arg2);
            var12.field2335.method3330(arg3);
            field861.method1944(var12);
        }
        if (arg0 == 6) {
            class175 var13 = class175.method85(class172.field2243, field861.field1287);
            var13.field2335.method3422(arg1);
            var13.field2335.method3330(arg2);
            var13.field2335.method3330(arg3);
            field861.method1944(var13);
        }
        if (arg0 == 7) {
            class175 var14 = class175.method85(class172.field2293, field861.field1287);
            var14.field2335.method3422(arg1);
            var14.field2335.method3330(arg2);
            var14.field2335.method3330(arg3);
            field861.method1944(var14);
        }
        if (arg0 == 8) {
            class175 var15 = class175.method85(class172.field2224, field861.field1287);
            var15.field2335.method3422(arg1);
            var15.field2335.method3330(arg2);
            var15.field2335.method3330(arg3);
            field861.method1944(var15);
        }
        if (arg0 == 9) {
            class175 var16 = class175.method85(class172.field2292, field861.field1287);
            var16.field2335.method3422(arg1);
            var16.field2335.method3330(arg2);
            var16.field2335.method3330(arg3);
            field861.method1944(var16);
        }
        if (arg0 != 10) {
            return;
        }
        class175 var17 = class175.method85(class172.field2300, field861.field1287);
        var17.field2335.method3422(arg1);
        var17.field2335.method3330(arg2);
        var17.field2335.method3330(arg3);
        field861.method1944(var17);
    }

    @ObfuscatedName("ju.ht(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method4938(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method505(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("at.hj(Ljava/lang/String;Ljava/lang/String;IIIIZI)V")
    public static final void method505(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field837 || field767 >= 500) {
            return;
        }
        field772[field767] = arg0;
        field773[field767] = arg1;
        field770[field767] = arg2;
        field845[field767] = arg3;
        field768[field767] = arg4;
        field769[field767] = arg5;
        field804[field767] = arg6;
        field767++;
    }

    @ObfuscatedName("ef.hx(B)I")
    public static final int method2924() {
        return field767 - 1;
    }

    @ObfuscatedName("bj.ho(II)Ljava/lang/String;")
    public static String method1736(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (field773[arg0].length() > 0) {
            return field772[arg0] + class240.field3021 + field773[arg0];
        } else {
            return field772[arg0];
        }
    }

    @ObfuscatedName("fh.hk(IIIII)V")
    public static final void method3228(int arg0, int arg1, int arg2, int arg3) {
        if (field783 == 0 && !field785) {
            method4938(class240.field3016, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        long var4 = -1L;
        long var6 = -1L;
        int var8 = 0;
        while (true) {
            int var10 = class123.field1707;
            if (var8 >= var10) {
                if (var4 != -1L) {
                    int var11 = (int) (var4 >>> 0 & 0x7FL);
                    int var13 = class123.method860(var4);
                    class62 var14 = field746[field820];
                    method173(var14, field820, var11, var13);
                }
                return;
            }
            long var15 = class123.field1714[var8];
            if (var6 != var15) {
                label277: {
                    var6 = var15;
                    int var19 = class123.method1925(var8);
                    int var20 = class123.method860(class123.field1714[var8]);
                    int var21 = var20;
                    long var22 = class123.field1714[var8];
                    int var24 = (int) (var22 >>> 14 & 0x3L);
                    int var27 = class123.method1777(class123.field1714[var8]);
                    int var28 = var27;
                    if (var24 == 2 && Statics.field3406.method2753(Statics.field1983, var19, var20, var15) >= 0) {
                        class271 var29 = class271.method1776(var27);
                        if (var29.field3488 != null) {
                            var29 = var29.method4721();
                        }
                        if (var29 == null) {
                            break label277;
                        }
                        if (field783 == 1) {
                            method4938(class240.field3038, field733 + " " + class76.field1101 + " " + class76.method2910(65535) + var29.field3446, 1, var27, var19, var20);
                        } else if (!field785) {
                            String[] var30 = var29.field3477;
                            if (var30 != null) {
                                for (int var31 = 4; var31 >= 0; var31--) {
                                    if (var30[var31] != null) {
                                        short var32 = 0;
                                        if (var31 == 0) {
                                            var32 = 3;
                                        }
                                        if (var31 == 1) {
                                            var32 = 4;
                                        }
                                        if (var31 == 2) {
                                            var32 = 5;
                                        }
                                        if (var31 == 3) {
                                            var32 = 6;
                                        }
                                        if (var31 == 4) {
                                            var32 = 1001;
                                        }
                                        method4938(var30[var31], class76.method2910(65535) + var29.field3446, var32, var28, var19, var21);
                                    }
                                }
                            }
                            method4938(class240.field3012, class76.method2910(65535) + var29.field3446, 1002, var29.field3454, var19, var21);
                        } else if ((Statics.field204 & 0x4) == 4) {
                            method4938(field788, field789 + " " + class76.field1101 + " " + class76.method2910(65535) + var29.field3446, 2, var27, var19, var20);
                        }
                    }
                    if (var24 == 1) {
                        class74 var33 = field672[var28];
                        if (var33 == null) {
                            break label277;
                        }
                        if (var33.field1091.field3565 == 1 && (var33.field943 & 0x7F) == 64 && (var33.field925 & 0x7F) == 64) {
                            for (int var34 = 0; var34 < field673; var34++) {
                                class74 var35 = field672[field674[var34]];
                                if (var35 != null && var33 != var35 && var35.field1091.field3565 == 1 && var33.field943 == var35.field943 && var33.field925 == var35.field925) {
                                    method3919(var35.field1091, field674[var34], var19, var21);
                                }
                            }
                            int var36 = class84.field1216;
                            int[] var37 = class84.field1217;
                            for (int var38 = 0; var38 < var36; var38++) {
                                class62 var39 = field746[var37[var38]];
                                if (var39 != null && var33.field943 == var39.field943 && var33.field925 == var39.field925) {
                                    method173(var39, var37[var38], var19, var21);
                                }
                            }
                        }
                        method3919(var33.field1091, var28, var19, var21);
                    }
                    if (var24 == 0) {
                        class62 var40 = field746[var28];
                        if (var40 == null) {
                            break label277;
                        }
                        if ((var40.field943 & 0x7F) == 64 && (var40.field925 & 0x7F) == 64) {
                            for (int var41 = 0; var41 < field673; var41++) {
                                class74 var42 = field672[field674[var41]];
                                if (var42 != null && var42.field1091.field3565 == 1 && var40.field943 == var42.field943 && var40.field925 == var42.field925) {
                                    method3919(var42.field1091, field674[var41], var19, var21);
                                }
                            }
                            int var43 = class84.field1216;
                            int[] var44 = class84.field1217;
                            for (int var45 = 0; var45 < var43; var45++) {
                                class62 var46 = field746[var44[var45]];
                                if (var46 != null && var40 != var46 && var40.field943 == var46.field943 && var40.field925 == var46.field925) {
                                    method173(var46, var44[var45], var19, var21);
                                }
                            }
                        }
                        if (field820 == var28) {
                            var4 = var15;
                        } else {
                            method173(var40, var28, var19, var21);
                        }
                    }
                    if (var24 == 3) {
                        class208 var47 = field659[Statics.field1983][var19][var21];
                        if (var47 != null) {
                            for (class82 var48 = (class82) var47.method3828(); var48 != null; var48 = (class82) var47.method3830()) {
                                class272 var49 = class272.method92(var48.field1202);
                                if (field783 == 1) {
                                    method4938(class240.field3038, field733 + " " + class76.field1101 + " " + class76.method2910(16748608) + var49.field3523, 16, var48.field1202, var19, var21);
                                } else if (!field785) {
                                    String[] var50 = var49.field3546;
                                    for (int var51 = 4; var51 >= 0; var51--) {
                                        if (var50 != null && var50[var51] != null) {
                                            byte var52 = 0;
                                            if (var51 == 0) {
                                                var52 = 18;
                                            }
                                            if (var51 == 1) {
                                                var52 = 19;
                                            }
                                            if (var51 == 2) {
                                                var52 = 20;
                                            }
                                            if (var51 == 3) {
                                                var52 = 21;
                                            }
                                            if (var51 == 4) {
                                                var52 = 22;
                                            }
                                            method4938(var50[var51], class76.method2910(16748608) + var49.field3523, var52, var48.field1202, var19, var21);
                                        } else if (var51 == 2) {
                                            method4938(class240.field3002, class76.method2910(16748608) + var49.field3523, 20, var48.field1202, var19, var21);
                                        }
                                    }
                                    method4938(class240.field3012, class76.method2910(16748608) + var49.field3523, 1004, var48.field1202, var19, var21);
                                } else if ((Statics.field204 & 0x1) == 1) {
                                    method4938(field788, field789 + " " + class76.field1101 + " " + class76.method2910(16748608) + var49.field3523, 17, var48.field1202, var19, var21);
                                }
                            }
                        }
                    }
                }
            }
            var8++;
        }
    }

    @ObfuscatedName("hi.hr(Lji;IIII)V")
    public static final void method3919(class274 arg0, int arg1, int arg2, int arg3) {
        if (field767 >= 400) {
            return;
        }
        if (arg0.field3589 != null) {
            arg0 = arg0.method4868();
        }
        if (arg0 == null || !arg0.field3592 || arg0.field3582 && field800 != arg1) {
            return;
        }
        String var4 = arg0.field3564;
        if (arg0.field3580 != 0) {
            int var6 = arg0.field3580;
            int var7 = Statics.field138.field602;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class76.method2910(16711680);
            } else if (var8 < -6) {
                var9 = class76.method2910(16723968);
            } else if (var8 < -3) {
                var9 = class76.method2910(16740352);
            } else if (var8 < 0) {
                var9 = class76.method2910(16756736);
            } else if (var8 > 9) {
                var9 = class76.method2910(65280);
            } else if (var8 > 6) {
                var9 = class76.method2910(4259584);
            } else if (var8 > 3) {
                var9 = class76.method2910(8453888);
            } else if (var8 > 0) {
                var9 = class76.method2910(12648192);
            } else {
                var9 = class76.method2910(16776960);
            }
            var4 = var4 + var9 + " " + class76.field1104 + class240.field3017 + arg0.field3580 + class76.field1105;
        }
        if (arg0.field3582 && field864) {
            method4938(class240.field3012, class76.method2910(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field783 == 1) {
            method4938(class240.field3038, field733 + " " + class76.field1101 + " " + class76.method2910(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field785) {
            int var10 = arg0.field3582 && field864 ? 2000 : 0;
            String[] var11 = arg0.field3579;
            if (var11 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var11[var12] != null && !var11[var12].equalsIgnoreCase(class240.field3101)) {
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
                        method4938(var11[var12], class76.method2910(16776960) + var4, var13, arg1, arg2, arg3);
                    }
                }
            }
            if (var11 != null) {
                for (int var14 = 4; var14 >= 0; var14--) {
                    if (var11[var14] != null && var11[var14].equalsIgnoreCase(class240.field3101)) {
                        short var15 = 0;
                        if (field651 != class79.field1130) {
                            if (field651 == class79.field1134 || field651 == class79.field1128 && arg0.field3580 > Statics.field138.field602) {
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
                            method4938(var11[var14], class76.method2910(16776960) + var4, var16, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3582 || !field864) {
                method4938(class240.field3012, class76.method2910(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field204 & 0x2) == 2) {
            method4938(field788, field789 + " " + class76.field1101 + " " + class76.method2910(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("b.hw(Lbw;IIII)V")
    public static final void method173(class62 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field138 == arg0 || field767 >= 400) {
            return;
        }
        String var9;
        if (arg0.field617 == 0) {
            String var4 = arg0.field608[0] + arg0.field597 + arg0.field608[1];
            int var5 = arg0.field602;
            int var6 = Statics.field138.field602;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class76.method2910(16711680);
            } else if (var7 < -6) {
                var8 = class76.method2910(16723968);
            } else if (var7 < -3) {
                var8 = class76.method2910(16740352);
            } else if (var7 < 0) {
                var8 = class76.method2910(16756736);
            } else if (var7 > 9) {
                var8 = class76.method2910(65280);
            } else if (var7 > 6) {
                var8 = class76.method2910(4259584);
            } else if (var7 > 3) {
                var8 = class76.method2910(8453888);
            } else if (var7 > 0) {
                var8 = class76.method2910(12648192);
            } else {
                var8 = class76.method2910(16776960);
            }
            var9 = var4 + var8 + " " + class76.field1104 + class240.field3017 + arg0.field602 + class76.field1105 + arg0.field608[2];
        } else {
            var9 = arg0.field608[0] + arg0.field597 + arg0.field608[1] + " " + class76.field1104 + class240.field3018 + arg0.field617 + class76.field1105 + arg0.field608[2];
        }
        if (field783 == 1) {
            method4938(class240.field3038, field733 + " " + class76.field1101 + " " + class76.method2910(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field785) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field754[var10] != null) {
                    short var11 = 0;
                    if (field754[var10].equalsIgnoreCase(class240.field3101)) {
                        if (field658 == class79.field1130) {
                            continue;
                        }
                        if (field658 == class79.field1134 || field658 == class79.field1128 && arg0.field602 > Statics.field138.field602) {
                            var11 = 2000;
                        }
                        if (Statics.field138.field615 != 0 && arg0.field615 != 0) {
                            if (Statics.field138.field615 == arg0.field615) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field755[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field753[var10] + var11;
                    method4938(field754[var10], class76.method2910(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field204 & 0x8) == 8) {
            method4938(field788, field789 + " " + class76.field1101 + " " + class76.method2910(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field767; var14++) {
            if (field770[var14] == 23) {
                field773[var14] = class76.method2910(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("bu.ha(IIIIIIIII)V")
    public static final void method1554(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class233.method1506(arg0)) {
            Statics.field402 = null;
            method2638(Statics.field2657[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field402 != null) {
                method2638(Statics.field402, -1412584499, arg1, arg2, arg3, arg4, Statics.field197, Statics.field2376, arg7);
                Statics.field402 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field828[var8] = true;
            }
        } else {
            field828[arg7] = true;
        }
    }

    @ObfuscatedName("di.ig([Lhw;IIIIIIIII)V")
    public static final void method2638(class233[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class320.method5454(arg2, arg3, arg4, arg5);
        class125.method2640();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class233 var10 = arg0[var9];
            if (var10 != null && (var10.field2687 == arg1 || arg1 == -1412584499 && field803 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field799[field833] = var10.field2744 + arg6;
                    field839[field833] = var10.field2682 + arg7;
                    field840[field833] = var10.field2683;
                    field841[field833] = var10.field2684;
                    var11 = ++field833 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2805 = var11;
                var10.field2777 = field642;
                if (!var10.field2667 || !method1031(var10)) {
                    if (var10.field2672 > 0) {
                        method447(var10);
                    }
                    int var12 = var10.field2744 + arg6;
                    int var13 = var10.field2682 + arg7;
                    int var14 = var10.field2762;
                    if (field803 == var10) {
                        if (arg1 != -1412584499 && !var10.field2756) {
                            Statics.field402 = arg0;
                            Statics.field197 = arg6;
                            Statics.field2376 = arg7;
                            continue;
                        }
                        if (field814 && field808) {
                            int var15 = class49.field461;
                            int var16 = class49.field462;
                            int var17 = var15 - field781;
                            int var18 = var16 - field784;
                            if (var17 < field725) {
                                var17 = field725;
                            }
                            if (var10.field2683 + var17 > field725 + field812.field2683) {
                                var17 = field725 + field812.field2683 - var10.field2683;
                            }
                            if (var18 < field810) {
                                var18 = field810;
                            }
                            if (var10.field2684 + var18 > field810 + field812.field2684) {
                                var18 = field810 + field812.field2684 - var10.field2684;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2756) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2670 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2670 == 9) {
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
                    if (!var10.field2667 || var19 < var21 && var20 < var22) {
                        if (var10.field2672 != 0) {
                            if (var10.field2672 == 1336) {
                                if (field648) {
                                    var13 += 15;
                                    Statics.field576.method5211("Fps:" + field427, var10.field2683 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 327680 && !field634) {
                                        var33 = 16711680;
                                    }
                                    Statics.field576.method5211("Mem:" + var32 + "k", var10.field2683 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2672 == 1337) {
                                field779 = var12;
                                field780 = var13;
                                method90(var12, var13, var10.field2683, var10.field2684);
                                field828[var10.field2805] = true;
                                class320.method5454(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2672 == 1338) {
                                method21(var10, var12, var13, var11);
                                class320.method5454(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2672 == 1339) {
                                method2950(var10, var12, var13, var11);
                                class320.method5454(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2672 == 1400) {
                                Statics.field607.method5797(var12, var13, var10.field2683, var10.field2684, field642);
                            }
                            if (var10.field2672 == 1401) {
                                Statics.field607.method5748(var12, var13, var10.field2683, var10.field2684);
                            }
                        }
                        if (var10.field2670 == 0) {
                            if (!var10.field2667 && method1031(var10) && Statics.field2077 != var10) {
                                continue;
                            }
                            if (!var10.field2667) {
                                if (var10.field2690 > var10.field2692 - var10.field2684) {
                                    var10.field2690 = var10.field2692 - var10.field2684;
                                }
                                if (var10.field2690 < 0) {
                                    var10.field2690 = 0;
                                }
                            }
                            method2638(arg0, var10.field2731, var19, var20, var21, var22, var12 - var10.field2689, var13 - var10.field2690, var11);
                            if (var10.field2798 != null) {
                                method2638(var10.field2798, var10.field2731, var19, var20, var21, var22, var12 - var10.field2689, var13 - var10.field2690, var11);
                            }
                            class57 var34 = (class57) field889.method3774((long) var10.field2731);
                            if (var34 != null) {
                                method1554(var34.field558, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class320.method5454(arg2, arg3, arg4, arg5);
                            class125.method2640();
                        }
                        if (field844 || field645[var11] || field842 > 1) {
                            if (var10.field2670 == 0 && !var10.field2667 && var10.field2692 > var10.field2684) {
                                method671(var10.field2683 + var12, var13, var10.field2690, var10.field2684, var10.field2692);
                            }
                            if (var10.field2670 != 1) {
                                if (var10.field2670 == 2) {
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < var10.field2680; var36++) {
                                        for (int var37 = 0; var37 < var10.field2679; var37++) {
                                            int var38 = (var10.field2665 + 32) * var37 + var12;
                                            int var39 = (var10.field2765 + 32) * var36 + var13;
                                            if (var35 < 20) {
                                                var38 += var10.field2737[var35];
                                                var39 += var10.field2738[var35];
                                            }
                                            if (var10.field2792[var35] > 0) {
                                                boolean var40 = false;
                                                boolean var41 = false;
                                                int var42 = var10.field2792[var35] - 1;
                                                if (var38 + 32 > arg2 && var38 < arg4 && var39 + 32 > arg3 && var39 < arg5 || Statics.field1497 == var10 && field738 == var35) {
                                                    class324 var43;
                                                    if (field783 == 1 && Statics.field3387 == var35 && Statics.field412 == var10.field2731) {
                                                        var43 = class272.method2912(var42, var10.field2806[var35], 2, 0, 2, false);
                                                    } else {
                                                        var43 = class272.method2912(var42, var10.field2806[var35], 1, 3153952, 2, false);
                                                    }
                                                    if (var43 == null) {
                                                        method272(var10);
                                                    } else if (Statics.field1497 == var10 && field738 == var35) {
                                                        int var44 = class49.field461 - field739;
                                                        int var45 = class49.field462 - field829;
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
                                                        var43.method5573(var38 + var44, var39 + var45, 128);
                                                        if (arg1 != -1) {
                                                            class233 var46 = arg0[arg1 & 0xFFFF];
                                                            if (var39 + var45 < class320.field3851 && var46.field2690 > 0) {
                                                                int var47 = field887 * (class320.field3851 - var39 - var45) / 3;
                                                                if (var47 > field887 * 10) {
                                                                    var47 = field887 * 10;
                                                                }
                                                                if (var47 > var46.field2690) {
                                                                    var47 = var46.field2690;
                                                                }
                                                                var46.field2690 -= var47;
                                                                field829 += var47;
                                                                method272(var46);
                                                            }
                                                            if (var39 + var45 + 32 > class320.field3852 && var46.field2690 < var46.field2692 - var46.field2684) {
                                                                int var48 = field887 * (var39 + var45 + 32 - class320.field3852) / 3;
                                                                if (var48 > field887 * 10) {
                                                                    var48 = field887 * 10;
                                                                }
                                                                if (var48 > var46.field2692 - var46.field2684 - var46.field2690) {
                                                                    var48 = var46.field2692 - var46.field2684 - var46.field2690;
                                                                }
                                                                var46.field2690 += var48;
                                                                field829 -= var48;
                                                                method272(var46);
                                                            }
                                                        }
                                                    } else if (Statics.field179 == var10 && field737 == var35) {
                                                        var43.method5573(var38, var39, 128);
                                                    } else {
                                                        var43.method5567(var38, var39);
                                                    }
                                                }
                                            } else if (var10.field2739 != null && var35 < 20) {
                                                class324 var49 = var10.method4207(var35);
                                                if (var49 != null) {
                                                    var49.method5567(var38, var39);
                                                } else if (class233.field2688) {
                                                    method272(var10);
                                                }
                                            }
                                            var35++;
                                        }
                                    }
                                } else if (var10.field2670 == 3) {
                                    int var50;
                                    if (method5381(var10)) {
                                        var50 = var10.field2694;
                                        if (Statics.field2077 == var10 && var10.field2664 != 0) {
                                            var50 = var10.field2664;
                                        }
                                    } else {
                                        var50 = var10.field2743;
                                        if (Statics.field2077 == var10 && var10.field2807 != 0) {
                                            var50 = var10.field2807;
                                        }
                                    }
                                    if (var10.field2697) {
                                        switch(var10.field2698.field3861) {
                                            case 1:
                                                class320.method5458(var12, var13, var10.field2683, var10.field2684, var10.field2743, var10.field2694);
                                                break;
                                            case 2:
                                                class320.method5463(var12, var13, var10.field2683, var10.field2684, var10.field2743, var10.field2694, 255 - (var10.field2762 & 0xFF), 255 - (var10.field2668 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class320.method5483(var12, var13, var10.field2683, var10.field2684, var50);
                                                } else {
                                                    class320.method5461(var12, var13, var10.field2683, var10.field2684, var50, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class320.method5465(var12, var13, var10.field2683, var10.field2684, var50);
                                    } else {
                                        class320.method5466(var12, var13, var10.field2683, var10.field2684, var50, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2670 == 4) {
                                    class301 var51 = var10.method4206();
                                    if (var51 != null) {
                                        String var52 = var10.field2729;
                                        int var53;
                                        if (method5381(var10)) {
                                            var53 = var10.field2694;
                                            if (Statics.field2077 == var10 && var10.field2664 != 0) {
                                                var53 = var10.field2664;
                                            }
                                            if (var10.field2779.length() > 0) {
                                                var52 = var10.field2779;
                                            }
                                        } else {
                                            var53 = var10.field2743;
                                            if (Statics.field2077 == var10 && var10.field2807 != 0) {
                                                var53 = var10.field2807;
                                            }
                                        }
                                        if (var10.field2667 && var10.field2786 != -1) {
                                            class272 var54 = class272.method92(var10.field2786);
                                            var52 = var54.field3523;
                                            if (var52 == null) {
                                                var52 = class240.field2865;
                                            }
                                            if ((var54.field3512 == 1 || var10.field2795 != 1) && var10.field2795 != -1) {
                                                var52 = class76.method2910(16748608) + var52 + class76.field1106 + " " + 'x' + method940(var10.field2795);
                                            }
                                        }
                                        if (field796 == var10) {
                                            var52 = class240.field3019;
                                            var53 = var10.field2743;
                                        }
                                        if (!var10.field2667) {
                                            var52 = method974(var52, var10);
                                        }
                                        var51.method5257(var52, var12, var13, var10.field2683, var10.field2684, var53, var10.field2734 ? 0 : -1, var10.field2711, var10.field2733, var10.field2707);
                                    } else if (class233.field2688) {
                                        method272(var10);
                                    }
                                } else if (var10.field2670 == 5) {
                                    if (var10.field2667) {
                                        class324 var56;
                                        if (var10.field2786 == -1) {
                                            var56 = var10.method4205(false);
                                        } else {
                                            var56 = class272.method2912(var10.field2786, var10.field2795, var10.field2704, var10.field2708, var10.field2727, false);
                                        }
                                        if (var56 != null) {
                                            int var57 = var56.field3877;
                                            int var58 = var56.field3880;
                                            if (var10.field2747) {
                                                class320.method5474(var12, var13, var10.field2683 + var12, var10.field2684 + var13);
                                                int var59 = (var10.field2683 + (var57 - 1)) / var57;
                                                int var60 = (var10.field2684 + (var58 - 1)) / var58;
                                                for (int var61 = 0; var61 < var59; var61++) {
                                                    for (int var62 = 0; var62 < var60; var62++) {
                                                        if (var10.field2702 != 0) {
                                                            var56.method5585(var57 / 2 + var57 * var61 + var12, var58 / 2 + var58 * var62 + var13, var10.field2702, 4096);
                                                        } else if (var14 == 0) {
                                                            var56.method5567(var57 * var61 + var12, var58 * var62 + var13);
                                                        } else {
                                                            var56.method5573(var57 * var61 + var12, var58 * var62 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class320.method5454(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var63 = var10.field2683 * 4096 / var57;
                                                if (var10.field2702 != 0) {
                                                    var56.method5585(var10.field2683 / 2 + var12, var10.field2684 / 2 + var13, var10.field2702, var63);
                                                } else if (var14 != 0) {
                                                    var56.method5652(var12, var13, var10.field2683, var10.field2684, 256 - (var14 & 0xFF));
                                                } else if (var10.field2683 == var57 && var10.field2684 == var58) {
                                                    var56.method5567(var12, var13);
                                                } else {
                                                    var56.method5646(var12, var13, var10.field2683, var10.field2684);
                                                }
                                            }
                                        } else if (class233.field2688) {
                                            method272(var10);
                                        }
                                    } else {
                                        class324 var55 = var10.method4205(method5381(var10));
                                        if (var55 != null) {
                                            var55.method5567(var12, var13);
                                        } else if (class233.field2688) {
                                            method272(var10);
                                        }
                                    }
                                } else if (var10.field2670 == 6) {
                                    boolean var64 = method5381(var10);
                                    int var65;
                                    if (var64) {
                                        var65 = var10.field2716;
                                    } else {
                                        var65 = var10.field2715;
                                    }
                                    class122 var66 = null;
                                    int var67 = 0;
                                    if (var10.field2786 != -1) {
                                        class272 var68 = class272.method92(var10.field2786);
                                        if (var68 != null) {
                                            class272 var69 = var68.method4771(var10.field2795);
                                            var66 = var69.method4770(1);
                                            if (var66 == null) {
                                                method272(var10);
                                            } else {
                                                var66.method2535();
                                                var67 = var66.field1841 / 2;
                                            }
                                        }
                                    } else if (var10.field2676 == 5) {
                                        if (var10.field2712 == 0) {
                                            var66 = field752.method4160((class276) null, -1, (class276) null, -1);
                                        } else {
                                            var66 = Statics.field138.method1042();
                                        }
                                    } else if (var65 == -1) {
                                        var66 = var10.method4208((class276) null, -1, var64, Statics.field138.field596);
                                        if (var66 == null && class233.field2688) {
                                            method272(var10);
                                        }
                                    } else {
                                        class276 var70 = class276.method3224(var65);
                                        var66 = var10.method4208(var70, var10.field2796, var64, Statics.field138.field596);
                                        if (var66 == null && class233.field2688) {
                                            method272(var10);
                                        }
                                    }
                                    class125.method2643(var10.field2683 / 2 + var12, var10.field2684 / 2 + var13);
                                    int var71 = var10.field2722 * class125.field1749[var10.field2797] >> 16;
                                    int var72 = var10.field2722 * class125.field1743[var10.field2797] >> 16;
                                    if (var66 != null) {
                                        if (var10.field2667) {
                                            var66.method2535();
                                            if (var10.field2725) {
                                                var66.method2549(0, var10.field2720, var10.field2781, var10.field2797, var10.field2717, var10.field2718 + var67 + var71, var10.field2718 + var72, var10.field2722);
                                            } else {
                                                var66.method2548(0, var10.field2720, var10.field2781, var10.field2797, var10.field2717, var10.field2718 + var67 + var71, var10.field2718 + var72);
                                            }
                                        } else {
                                            var66.method2548(0, var10.field2720, 0, var10.field2797, 0, var71, var72);
                                        }
                                    }
                                    class125.method2719();
                                } else {
                                    if (var10.field2670 == 7) {
                                        class301 var73 = var10.method4206();
                                        if (var73 == null) {
                                            if (class233.field2688) {
                                                method272(var10);
                                            }
                                            continue;
                                        }
                                        int var74 = 0;
                                        for (int var75 = 0; var75 < var10.field2680; var75++) {
                                            for (int var76 = 0; var76 < var10.field2679; var76++) {
                                                if (var10.field2792[var74] > 0) {
                                                    class272 var77 = class272.method92(var10.field2792[var74] - 1);
                                                    String var78;
                                                    if (var77.field3512 != 1 && var10.field2806[var74] == 1) {
                                                        var78 = class76.method2910(16748608) + var77.field3523 + class76.field1106;
                                                    } else {
                                                        var78 = class76.method2910(16748608) + var77.field3523 + class76.field1106 + " " + 'x' + method940(var10.field2806[var74]);
                                                    }
                                                    int var79 = (var10.field2665 + 115) * var76 + var12;
                                                    int var80 = (var10.field2765 + 12) * var75 + var13;
                                                    if (var10.field2711 == 0) {
                                                        var73.method5225(var78, var79, var80, var10.field2743, var10.field2734 ? 0 : -1);
                                                    } else if (var10.field2711 == 1) {
                                                        var73.method5267(var78, var10.field2683 / 2 + var79, var80, var10.field2743, var10.field2734 ? 0 : -1);
                                                    } else {
                                                        var73.method5211(var78, var10.field2683 + var79 - 1, var80, var10.field2743, var10.field2734 ? 0 : -1);
                                                    }
                                                }
                                                var74++;
                                            }
                                        }
                                    }
                                    if (var10.field2670 == 8 && Statics.field2042 == var10 && field851 == field809) {
                                        int var81 = 0;
                                        int var82 = 0;
                                        class301 var83 = Statics.field576;
                                        String var84 = var10.field2729;
                                        String var85 = method974(var84, var10);
                                        while (var85.length() > 0) {
                                            int var86 = var85.indexOf(class76.field1107);
                                            String var87;
                                            if (var86 == -1) {
                                                var87 = var85;
                                                var85 = "";
                                            } else {
                                                var87 = var85.substring(0, var86);
                                                var85 = var85.substring(var86 + 4);
                                            }
                                            int var88 = var83.method5278(var87);
                                            if (var88 > var81) {
                                                var81 = var88;
                                            }
                                            var82 += var83.field3762 + 1;
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
                                        class320.method5483(var89, var90, var81, var82, 16777120);
                                        class320.method5465(var89, var90, var81, var82, 0);
                                        String var91 = var10.field2729;
                                        int var92 = var83.field3762 + var90 + 2;
                                        String var93 = method974(var91, var10);
                                        while (var93.length() > 0) {
                                            int var94 = var93.indexOf(class76.field1107);
                                            String var95;
                                            if (var94 == -1) {
                                                var95 = var93;
                                                var93 = "";
                                            } else {
                                                var95 = var93.substring(0, var94);
                                                var93 = var93.substring(var94 + 4);
                                            }
                                            var83.method5225(var95, var89 + 3, var92, 0, -1);
                                            var92 += var83.field3762 + 1;
                                        }
                                    }
                                    if (var10.field2670 == 9) {
                                        int var96;
                                        int var97;
                                        int var98;
                                        int var99;
                                        if (var10.field2728) {
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
                                        if (var10.field2701 == 1) {
                                            class320.method5469(var96, var97, var98, var99, var10.field2743);
                                        } else {
                                            method995(var96, var97, var98, var99, var10.field2743, var10.field2701);
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

    @ObfuscatedName("ba.iv(IIIIIIB)V")
    public static final void method995(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class320.field3853;
        int var18 = arg1 - class320.field3851;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class125.method2655(var19, var20, var21);
        class125.method2718(var23, var24, var25, var19, var20, var21, arg4);
        class125.method2655(var19, var21, var22);
        class125.method2718(var23, var25, var26, var19, var21, var22, arg4);
    }

    @ObfuscatedName("bf.id(Ljava/lang/String;Lhw;I)Ljava/lang/String;")
    public static String method974(String arg0, class233 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method2969(arg1, var2 - 1);
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

    @ObfuscatedName("ak.ix(II)Ljava/lang/String;")
    public static final String method940(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class76.field1102 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class76.method2910(65408) + var1.substring(0, var1.length() - 8) + class240.field3022 + " " + class76.field1104 + var1 + class76.field1105 + class76.field1106;
        } else if (var1.length() > 6) {
            return " " + class76.method2910(16777215) + var1.substring(0, var1.length() - 4) + class240.field2994 + " " + class76.field1104 + var1 + class76.field1105 + class76.field1106;
        } else {
            return " " + class76.method2910(16776960) + var1 + class76.field1106;
        }
    }

    @ObfuscatedName("client.ii(ZI)V")
    public final void method1106(boolean arg0) {
        method108(field790, Statics.field2652, Statics.field253, arg0);
    }

    @ObfuscatedName("client.it(Lhw;B)V")
    public void method1443(class233 arg0) {
        class233 var2 = arg0.field2687 == -1 ? null : class233.method1754(arg0.field2687);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field2652;
            var4 = Statics.field253;
        } else {
            var3 = var2.field2683;
            var4 = var2.field2684;
        }
        method432(arg0, var3, var4, false);
        method5300(arg0, var3, var4);
    }

    @ObfuscatedName("by.in([Lhw;Lhw;ZI)V")
    public static void method1742(class233[] arg0, class233 arg1, boolean arg2) {
        int var3 = arg1.field2691 == 0 ? arg1.field2683 : arg1.field2691;
        int var4 = arg1.field2692 == 0 ? arg1.field2684 : arg1.field2692;
        method3634(arg0, arg1.field2731, var3, var4, arg2);
        if (arg1.field2798 != null) {
            method3634(arg1.field2798, arg1.field2731, var3, var4, arg2);
        }
        class57 var5 = (class57) field889.method3774((long) arg1.field2731);
        if (var5 != null) {
            method108(var5.field558, var3, var4, arg2);
        }
        if (arg1.field2672 == 1337) {
        }
    }

    @ObfuscatedName("z.ie(IIIZB)V")
    public static final void method108(int arg0, int arg1, int arg2, boolean arg3) {
        if (class233.method1506(arg0)) {
            method3634(Statics.field2657[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("gy.ib([Lhw;IIIZB)V")
    public static void method3634(class233[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class233 var6 = arg0[var5];
            if (var6 != null && var6.field2687 == arg1) {
                method432(var6, arg2, arg3, arg4);
                method5300(var6, arg2, arg3);
                if (var6.field2689 > var6.field2691 - var6.field2683) {
                    var6.field2689 = var6.field2691 - var6.field2683;
                }
                if (var6.field2689 < 0) {
                    var6.field2689 = 0;
                }
                if (var6.field2690 > var6.field2692 - var6.field2684) {
                    var6.field2690 = var6.field2692 - var6.field2684;
                }
                if (var6.field2690 < 0) {
                    var6.field2690 = 0;
                }
                if (var6.field2670 == 0) {
                    method1742(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("q.ia(Lhw;IIZI)V")
    public static void method432(class233 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2683;
        int var5 = arg0.field2684;
        if (arg0.field2675 == 0) {
            arg0.field2683 = arg0.field2679;
        } else if (arg0.field2675 == 1) {
            arg0.field2683 = arg1 - arg0.field2679;
        } else if (arg0.field2675 == 2) {
            arg0.field2683 = arg0.field2679 * arg1 >> 14;
        }
        if (arg0.field2802 == 0) {
            arg0.field2684 = arg0.field2680;
        } else if (arg0.field2802 == 1) {
            arg0.field2684 = arg2 - arg0.field2680;
        } else if (arg0.field2802 == 2) {
            arg0.field2684 = arg0.field2680 * arg2 >> 14;
        }
        if (arg0.field2675 == 4) {
            arg0.field2683 = arg0.field2685 * arg0.field2684 / arg0.field2673;
        }
        if (arg0.field2802 == 4) {
            arg0.field2684 = arg0.field2683 * arg0.field2673 / arg0.field2685;
        }
        if (arg0.field2672 == 1337) {
            field802 = arg0;
        }
        if (arg3 && arg0.field2783 != null && (arg0.field2683 != var4 || arg0.field2684 != var5)) {
            class58 var6 = new class58();
            var6.field563 = arg0;
            var6.field569 = arg0.field2783;
            field709.method3823(var6);
        }
    }

    @ObfuscatedName("kb.is(Lhw;III)V")
    public static void method5300(class233 arg0, int arg1, int arg2) {
        if (arg0.field2695 == 0) {
            arg0.field2744 = arg0.field2735;
        } else if (arg0.field2695 == 1) {
            arg0.field2744 = (arg1 - arg0.field2683) / 2 + arg0.field2735;
        } else if (arg0.field2695 == 2) {
            arg0.field2744 = arg1 - arg0.field2683 - arg0.field2735;
        } else if (arg0.field2695 == 3) {
            arg0.field2744 = arg0.field2735 * arg1 >> 14;
        } else if (arg0.field2695 == 4) {
            arg0.field2744 = (arg0.field2735 * arg1 >> 14) + (arg1 - arg0.field2683) / 2;
        } else {
            arg0.field2744 = arg1 - arg0.field2683 - (arg0.field2735 * arg1 >> 14);
        }
        if (arg0.field2669 == 0) {
            arg0.field2682 = arg0.field2678;
        } else if (arg0.field2669 == 1) {
            arg0.field2682 = (arg2 - arg0.field2684) / 2 + arg0.field2678;
        } else if (arg0.field2669 == 2) {
            arg0.field2682 = arg2 - arg0.field2684 - arg0.field2678;
        } else if (arg0.field2669 == 3) {
            arg0.field2682 = arg0.field2678 * arg2 >> 14;
        } else if (arg0.field2669 == 4) {
            arg0.field2682 = (arg0.field2678 * arg2 >> 14) + (arg2 - arg0.field2684) / 2;
        } else {
            arg0.field2682 = arg2 - arg0.field2684 - (arg0.field2678 * arg2 >> 14);
        }
    }

    @ObfuscatedName("af.io(Lhw;IIIIIII)V")
    public static final void method458(class233 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field777) {
            field698 = 32;
        } else {
            field698 = 0;
        }
        field777 = false;
        if (class49.field469 == 1 || !Statics.field43 && class49.field469 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2690 -= 4;
                method272(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2690 += 4;
                method272(arg0);
            } else if (arg5 >= arg1 - field698 && arg5 < field698 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2690 = (arg4 - arg3) * var8 / var9;
                method272(arg0);
                field777 = true;
            }
        }
        if (field872 == 0) {
            return;
        }
        int var10 = arg0.field2683;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2690 += field872 * 45;
            method272(arg0);
        }
    }

    @ObfuscatedName("ab.ih(IIIIII)V")
    public static final void method671(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field2354[0].method5539(arg0, arg1);
        Statics.field2354[1].method5539(arg0, arg1 + arg3 - 16);
        class320.method5483(arg0, arg1 + 16, 16, arg3 - 32, field636);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class320.method5483(arg0, arg1 + 16 + var6, 16, var5, field694);
        class320.method5522(arg0, arg1 + 16 + var6, var5, field696);
        class320.method5522(arg0 + 1, arg1 + 16 + var6, var5, field696);
        class320.method5529(arg0, arg1 + 16 + var6, 16, field696);
        class320.method5529(arg0, arg1 + 17 + var6, 16, field696);
        class320.method5522(arg0 + 15, arg1 + 16 + var6, var5, field762);
        class320.method5522(arg0 + 14, arg1 + 17 + var6, var5 - 1, field762);
        class320.method5529(arg0, arg1 + 15 + var6 + var5, 16, field762);
        class320.method5529(arg0 + 1, arg1 + 14 + var6 + var5, 15, field762);
    }

    @ObfuscatedName("kf.iu(Lhw;I)Z")
    public static final boolean method5381(class233 arg0) {
        if (arg0.field2787 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2787.length; var1++) {
            int var2 = method2969(arg0, var1);
            int var3 = arg0.field2788[var1];
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

    @ObfuscatedName("ex.iw(Lhw;IB)I")
    public static final int method2969(class233 arg0, int arg1) {
        if (arg0.field2755 == null || arg1 >= arg0.field2755.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2755[arg1];
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
                    var7 = field838[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field763[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field695[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class233 var11 = class233.method1754(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class272.method92(var12).field3521 || field633)) {
                        for (int var13 = 0; var13 < var11.field2792.length; var13++) {
                            if (var12 + 1 == var11.field2792[var13]) {
                                var7 += var11.field2806[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class228.field2628[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class237.field2846[field763[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class228.field2628[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field138.field602;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class237.field2848[var14]) {
                            var7 += field763[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class233 var17 = class233.method1754(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class272.method92(var18).field3521 || field633)) {
                        for (int var19 = 0; var19 < var17.field2792.length; var19++) {
                            if (var18 + 1 == var17.field2792[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field640;
                }
                if (var6 == 12) {
                    var7 = field798;
                }
                if (var6 == 13) {
                    int var20 = class228.field2628[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class228.method2155(var22);
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
                    var7 = (Statics.field138.field943 >> 7) + Statics.field321;
                }
                if (var6 == 19) {
                    var7 = (Statics.field138.field925 >> 7) + Statics.field2611;
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

    @ObfuscatedName("j.ik(Lhw;Ljs;IIZI)V")
    public static final void method153(class233 arg0, class272 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field3532;
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
            var7 = class240.field2859;
        }
        if (var6 != -1 && var7 != null) {
            method505(var7, class76.method2910(16748608) + arg1.field3523, var6, arg1.field3506, arg2, arg0.field2731, arg4);
        }
    }

    @ObfuscatedName("aa.ir(Lhw;IIB)V")
    public static final void method547(class233 arg0, int arg1, int arg2) {
        if (arg0.field2671 == 1) {
            method4938(arg0.field2791, "", 24, 0, 0, arg0.field2731);
        }
        if (arg0.field2671 == 2 && !field785) {
            String var3 = method175(arg0);
            if (var3 != null) {
                method4938(var3, class76.method2910(65280) + arg0.field2674, 25, 0, -1, arg0.field2731);
            }
        }
        if (arg0.field2671 == 3) {
            method4938(class240.field3020, "", 26, 0, 0, arg0.field2731);
        }
        if (arg0.field2671 == 4) {
            method4938(arg0.field2791, "", 28, 0, 0, arg0.field2731);
        }
        if (arg0.field2671 == 5) {
            method4938(arg0.field2791, "", 29, 0, 0, arg0.field2731);
        }
        if (arg0.field2671 == 6 && field796 == null) {
            method4938(arg0.field2791, "", 30, 0, -1, arg0.field2731);
        }
        if (arg0.field2670 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2684; var5++) {
                for (int var6 = 0; var6 < arg0.field2683; var6++) {
                    int var7 = (arg0.field2665 + 32) * var6;
                    int var8 = (arg0.field2765 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2737[var4];
                        var8 += arg0.field2738[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field741 = var4;
                        Statics.field2310 = arg0;
                        if (arg0.field2792[var4] > 0) {
                            label323: {
                                class272 var9 = class272.method92(arg0.field2792[var4] - 1);
                                if (field783 == 1) {
                                    int var10 = method2995(arg0);
                                    boolean var11 = (var10 >> 30 & 0x1) != 0;
                                    if (var11) {
                                        if (Statics.field412 != arg0.field2731 || Statics.field3387 != var4) {
                                            method4938(class240.field3038, field733 + " " + class76.field1101 + " " + class76.method2910(16748608) + var9.field3523, 31, var9.field3506, var4, arg0.field2731);
                                        }
                                        break label323;
                                    }
                                }
                                if (field785) {
                                    int var12 = method2995(arg0);
                                    boolean var13 = (var12 >> 30 & 0x1) != 0;
                                    if (var13) {
                                        if ((Statics.field204 & 0x10) == 16) {
                                            method4938(field788, field789 + " " + class76.field1101 + " " + class76.method2910(16748608) + var9.field3523, 32, var9.field3506, var4, arg0.field2731);
                                        }
                                        break label323;
                                    }
                                }
                                String[] var14 = var9.field3532;
                                int var15 = -1;
                                if (field776 && method4123()) {
                                    var15 = var9.method4782();
                                }
                                int var16 = method2995(arg0);
                                boolean var17 = (var16 >> 30 & 0x1) != 0;
                                if (var17) {
                                    for (int var18 = 4; var18 >= 3; var18--) {
                                        if (var15 != var18) {
                                            method153(arg0, var9, var4, var18, false);
                                        }
                                    }
                                }
                                int var19 = method2995(arg0);
                                boolean var20 = (var19 >> 31 & 0x1) != 0;
                                if (var20) {
                                    method4938(class240.field3038, class76.method2910(16748608) + var9.field3523, 38, var9.field3506, var4, arg0.field2731);
                                }
                                int var21 = method2995(arg0);
                                boolean var22 = (var21 >> 30 & 0x1) != 0;
                                if (var22) {
                                    for (int var23 = 2; var23 >= 0; var23--) {
                                        if (var15 != var23) {
                                            method153(arg0, var9, var4, var23, false);
                                        }
                                    }
                                    if (var15 >= 0) {
                                        method153(arg0, var9, var4, var15, true);
                                    }
                                }
                                String[] var24 = arg0.field2677;
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
                                            method4938(var24[var25], class76.method2910(16748608) + var9.field3523, var26, var9.field3506, var4, arg0.field2731);
                                        }
                                    }
                                }
                                method4938(class240.field3012, class76.method2910(16748608) + var9.field3523, 1005, var9.field3506, var4, arg0.field2731);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2667) {
            return;
        }
        if (field785) {
            int var27 = method2995(arg0);
            boolean var28 = (var27 >> 21 & 0x1) != 0;
            if (var28 && (Statics.field204 & 0x20) == 32) {
                method4938(field788, field789 + " " + class76.field1101 + " " + arg0.field2793, 58, 0, arg0.field2730, arg0.field2731);
            }
            return;
        }
        for (int var29 = 9; var29 >= 5; var29--) {
            int var30 = method2995(arg0);
            boolean var31 = (var30 >> var29 + 1 & 0x1) != 0;
            String var32;
            if (!var31 && arg0.field2774 == null) {
                var32 = null;
            } else if (arg0.field2740 == null || arg0.field2740.length <= var29 || arg0.field2740[var29] == null || arg0.field2740[var29].trim().length() == 0) {
                var32 = null;
            } else {
                var32 = arg0.field2740[var29];
            }
            if (var32 != null) {
                method4938(var32, arg0.field2793, 1007, var29 + 1, arg0.field2730, arg0.field2731);
            }
        }
        String var34 = method175(arg0);
        if (var34 != null) {
            method4938(var34, arg0.field2793, 25, 0, arg0.field2730, arg0.field2731);
        }
        for (int var35 = 4; var35 >= 0; var35--) {
            int var36 = method2995(arg0);
            boolean var37 = (var36 >> var35 + 1 & 0x1) != 0;
            String var38;
            if (!var37 && arg0.field2774 == null) {
                var38 = null;
            } else if (arg0.field2740 == null || arg0.field2740.length <= var35 || arg0.field2740[var35] == null || arg0.field2740[var35].trim().length() == 0) {
                var38 = null;
            } else {
                var38 = arg0.field2740[var35];
            }
            if (var38 != null) {
                method4938(var38, arg0.field2793, 57, var35 + 1, arg0.field2730, arg0.field2731);
            }
        }
        int var40 = method2995(arg0);
        boolean var41 = (var40 & 0x1) != 0;
        if (var41) {
            method4938(class240.field2973, "", 30, 0, arg0.field2730, arg0.field2731);
        }
    }

    @ObfuscatedName("az.im(ZI)V")
    public static void method463(boolean arg0) {
        field630 = arg0;
    }

    @ObfuscatedName("p.ij(I)Z")
    public static boolean method76() {
        return field630;
    }

    @ObfuscatedName("ht.ip(I)Z")
    public static boolean method4123() {
        return field630 || class40.field373[81];
    }

    @ObfuscatedName("v.iz(IIIIIIII)V")
    public static final void method118(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class233.method1506(arg0)) {
            method4265(Statics.field2657[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("iv.iq([Lhw;IIIIIIIS)V")
    public static final void method4265(class233[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class233 var9 = arg0[var8];
            if (var9 != null && var9.field2687 == arg1 && (!var9.field2667 || var9.field2670 == 0 || var9.field2754 || method2995(var9) != 0 || field812 == var9 || var9.field2672 == 1338)) {
                if (var9.field2667) {
                    if (method1031(var9)) {
                        continue;
                    }
                } else if (var9.field2670 == 0 && Statics.field2077 != var9 && method1031(var9)) {
                    continue;
                }
                int var10 = var9.field2744 + arg6;
                int var11 = var9.field2682 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2670 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2670 == 9) {
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
                if (field803 == var9) {
                    field811 = true;
                    field681 = var10;
                    field758 = var11;
                }
                boolean var24 = false;
                if (var9.field2742) {
                    switch(field813) {
                        case 0:
                            var24 = true;
                        case 1:
                        default:
                            break;
                        case 2:
                            if (var9.field2731 >>> 16 == field793) {
                                var24 = true;
                            }
                            break;
                        case 3:
                            if (field793 == var9.field2731) {
                                var24 = true;
                            }
                    }
                }
                if (var24 || !var9.field2667 || var12 < var14 && var13 < var15) {
                    if (var9.field2667) {
                        if (var9.field2808) {
                            if (class49.field461 >= var12 && class49.field462 >= var13 && class49.field461 < var14 && class49.field462 < var15) {
                                for (class58 var25 = (class58) field709.method3827(); var25 != null; var25 = (class58) field709.method3829()) {
                                    if (var25.field562) {
                                        var25.method3818();
                                        var25.field563.field2799 = false;
                                    }
                                }
                                if (Statics.field3715 == 0) {
                                    field803 = null;
                                    field812 = null;
                                }
                                if (!field837) {
                                    method149();
                                }
                            }
                        } else if (var9.field2809 && class49.field461 >= var12 && class49.field462 >= var13 && class49.field461 < var14 && class49.field462 < var15) {
                            for (class58 var26 = (class58) field709.method3827(); var26 != null; var26 = (class58) field709.method3829()) {
                                if (var26.field562 && var26.field563.field2775 == var26.field569) {
                                    var26.method3818();
                                }
                            }
                        }
                    }
                    int var27 = class49.field461;
                    int var28 = class49.field462;
                    if (class49.field468 != 0) {
                        var27 = class49.field466;
                        var28 = class49.field470;
                    }
                    boolean var29 = var27 >= var12 && var28 >= var13 && var27 < var14 && var28 < var15;
                    if (var9.field2672 == 1337) {
                        if (!field692 && !field837 && var29) {
                            method3228(var27, var28, var12, var13);
                        }
                    } else if (var9.field2672 == 1338) {
                        method276(var9, var10, var11);
                    } else {
                        if (var9.field2672 == 1400) {
                            Statics.field607.method5728(class49.field461, class49.field462, var29, var10, var11, var9.field2683, var9.field2684);
                        }
                        if (!field837 && var29) {
                            if (var9.field2672 == 1400) {
                                Statics.field607.method5890(var10, var11, var9.field2683, var9.field2684, var27, var28);
                            } else {
                                method547(var9, var27 - var10, var28 - var11);
                            }
                        }
                        if (var24) {
                            for (int var30 = 0; var30 < var9.field2653.length; var30++) {
                                boolean var31 = false;
                                boolean var32 = false;
                                if (!var31 && var9.field2653[var30] != null) {
                                    for (int var33 = 0; var33 < var9.field2653[var30].length; var33++) {
                                        boolean var34 = false;
                                        if (var9.field2681 != null) {
                                            var34 = class40.field373[var9.field2653[var30][var33]];
                                        }
                                        if (method907(var9.field2653[var30][var33]) || var34) {
                                            var31 = true;
                                            if (var9.field2681 != null && var9.field2681[var30] > field642) {
                                                break;
                                            }
                                            byte var35 = var9.field2772[var30][var33];
                                            if (var35 == 0 || ((var35 & 0x8) == 0 || !class40.field373[86] && !class40.field373[82] && !class40.field373[81]) && ((var35 & 0x2) == 0 || class40.field373[86]) && ((var35 & 0x1) == 0 || class40.field373[82]) && ((var35 & 0x4) == 0 || class40.field373[81])) {
                                                var32 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (var32) {
                                    if (var30 < 10) {
                                        method2970(var30 + 1, var9.field2731, var9.field2730, var9.field2786, "");
                                    } else if (var30 == 10) {
                                        method902();
                                        method433(var9.field2731, var9.field2730, class234.method4384(method2995(var9)), var9.field2786);
                                        field788 = method175(var9);
                                        if (field788 == null) {
                                            field788 = class240.field2865;
                                        }
                                        field789 = var9.field2793 + class76.method2910(16777215);
                                    }
                                    int var36 = var9.field2745[var30];
                                    if (var9.field2681 == null) {
                                        var9.field2681 = new int[var9.field2653.length];
                                    }
                                    if (var9.field2746 == null) {
                                        var9.field2746 = new int[var9.field2653.length];
                                    }
                                    if (var36 == 0) {
                                        var9.field2681[var30] = Integer.MAX_VALUE;
                                    } else if (var9.field2681[var30] == 0) {
                                        var9.field2681[var30] = field642 + var36 + var9.field2746[var30];
                                    } else {
                                        var9.field2681[var30] = field642 + var36;
                                    }
                                }
                                if (!var31 && var9.field2681 != null) {
                                    var9.field2681[var30] = 0;
                                }
                            }
                        }
                        if (var9.field2667) {
                            boolean var37;
                            if (class49.field461 >= var12 && class49.field462 >= var13 && class49.field461 < var14 && class49.field462 < var15) {
                                var37 = true;
                            } else {
                                var37 = false;
                            }
                            boolean var38 = false;
                            if ((class49.field469 == 1 || !Statics.field43 && class49.field469 == 4) && var37) {
                                var38 = true;
                            }
                            boolean var39 = false;
                            if ((class49.field468 == 1 || !Statics.field43 && class49.field468 == 4) && class49.field466 >= var12 && class49.field470 >= var13 && class49.field466 < var14 && class49.field470 < var15) {
                                var39 = true;
                            }
                            if (var39) {
                                method2405(var9, class49.field466 - var10, class49.field470 - var11);
                            }
                            if (var9.field2672 == 1400) {
                                Statics.field607.method5821(var27, var28, var37 & var38, var37 & var39);
                            }
                            if (field803 != null && field803 != var9 && var37 && class234.method2987(method2995(var9))) {
                                field807 = var9;
                            }
                            if (field812 == var9) {
                                field808 = true;
                                field725 = var10;
                                field810 = var11;
                            }
                            if (var9.field2754) {
                                if (var37 && field872 != 0 && var9.field2775 != null) {
                                    class58 var40 = new class58();
                                    var40.field562 = true;
                                    var40.field563 = var9;
                                    var40.field565 = field872;
                                    var40.field569 = var9.field2775;
                                    field709.method3823(var40);
                                }
                                if (field803 != null || Statics.field1497 != null || field837) {
                                    var39 = false;
                                    var38 = false;
                                    var37 = false;
                                }
                                if (!var9.field2800 && var39) {
                                    var9.field2800 = true;
                                    if (var9.field2753 != null) {
                                        class58 var41 = new class58();
                                        var41.field562 = true;
                                        var41.field563 = var9;
                                        var41.field568 = class49.field466 - var10;
                                        var41.field565 = class49.field470 - var11;
                                        var41.field569 = var9.field2753;
                                        field709.method3823(var41);
                                    }
                                }
                                if (var9.field2800 && var38 && var9.field2778 != null) {
                                    class58 var42 = new class58();
                                    var42.field562 = true;
                                    var42.field563 = var9;
                                    var42.field568 = class49.field461 - var10;
                                    var42.field565 = class49.field462 - var11;
                                    var42.field569 = var9.field2778;
                                    field709.method3823(var42);
                                }
                                if (var9.field2800 && !var38) {
                                    var9.field2800 = false;
                                    if (var9.field2666 != null) {
                                        class58 var43 = new class58();
                                        var43.field562 = true;
                                        var43.field563 = var9;
                                        var43.field568 = class49.field461 - var10;
                                        var43.field565 = class49.field462 - var11;
                                        var43.field569 = var9.field2666;
                                        field831.method3823(var43);
                                    }
                                }
                                if (var38 && var9.field2759 != null) {
                                    class58 var44 = new class58();
                                    var44.field562 = true;
                                    var44.field563 = var9;
                                    var44.field568 = class49.field461 - var10;
                                    var44.field565 = class49.field462 - var11;
                                    var44.field569 = var9.field2759;
                                    field709.method3823(var44);
                                }
                                if (!var9.field2799 && var37) {
                                    var9.field2799 = true;
                                    if (var9.field2760 != null) {
                                        class58 var45 = new class58();
                                        var45.field562 = true;
                                        var45.field563 = var9;
                                        var45.field568 = class49.field461 - var10;
                                        var45.field565 = class49.field462 - var11;
                                        var45.field569 = var9.field2760;
                                        field709.method3823(var45);
                                    }
                                }
                                if (var9.field2799 && var37 && var9.field2732 != null) {
                                    class58 var46 = new class58();
                                    var46.field562 = true;
                                    var46.field563 = var9;
                                    var46.field568 = class49.field461 - var10;
                                    var46.field565 = class49.field462 - var11;
                                    var46.field569 = var9.field2732;
                                    field709.method3823(var46);
                                }
                                if (var9.field2799 && !var37) {
                                    var9.field2799 = false;
                                    if (var9.field2758 != null) {
                                        class58 var47 = new class58();
                                        var47.field562 = true;
                                        var47.field563 = var9;
                                        var47.field568 = class49.field461 - var10;
                                        var47.field565 = class49.field462 - var11;
                                        var47.field569 = var9.field2758;
                                        field831.method3823(var47);
                                    }
                                }
                                if (var9.field2794 != null) {
                                    class58 var48 = new class58();
                                    var48.field563 = var9;
                                    var48.field569 = var9.field2794;
                                    field830.method3823(var48);
                                }
                                if (var9.field2767 != null && field817 > var9.field2736) {
                                    if (var9.field2768 == null || field817 - var9.field2736 > 32) {
                                        class58 var53 = new class58();
                                        var53.field563 = var9;
                                        var53.field569 = var9.field2767;
                                        field709.method3823(var53);
                                    } else {
                                        label598: for (int var49 = var9.field2736; var49 < field817; var49++) {
                                            int var50 = field816[var49 & 0x1F];
                                            for (int var51 = 0; var51 < var9.field2768.length; var51++) {
                                                if (var9.field2768[var51] == var50) {
                                                    class58 var52 = new class58();
                                                    var52.field563 = var9;
                                                    var52.field569 = var9.field2767;
                                                    field709.method3823(var52);
                                                    break label598;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2736 = field817;
                                }
                                if (var9.field2769 != null && field819 > var9.field2803) {
                                    if (var9.field2770 == null || field819 - var9.field2803 > 32) {
                                        class58 var58 = new class58();
                                        var58.field563 = var9;
                                        var58.field569 = var9.field2769;
                                        field709.method3823(var58);
                                    } else {
                                        label574: for (int var54 = var9.field2803; var54 < field819; var54++) {
                                            int var55 = field654[var54 & 0x1F];
                                            for (int var56 = 0; var56 < var9.field2770.length; var56++) {
                                                if (var9.field2770[var56] == var55) {
                                                    class58 var57 = new class58();
                                                    var57.field563 = var9;
                                                    var57.field569 = var9.field2769;
                                                    field709.method3823(var57);
                                                    break label574;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2803 = field819;
                                }
                                if (var9.field2771 != null && field893 > var9.field2804) {
                                    if (var9.field2748 == null || field893 - var9.field2804 > 32) {
                                        class58 var63 = new class58();
                                        var63.field563 = var9;
                                        var63.field569 = var9.field2771;
                                        field709.method3823(var63);
                                    } else {
                                        label550: for (int var59 = var9.field2804; var59 < field893; var59++) {
                                            int var60 = field766[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var9.field2748.length; var61++) {
                                                if (var9.field2748[var61] == var60) {
                                                    class58 var62 = new class58();
                                                    var62.field563 = var9;
                                                    var62.field569 = var9.field2771;
                                                    field709.method3823(var62);
                                                    break label550;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2804 = field893;
                                }
                                if (field792 > var9.field2801 && var9.field2776 != null) {
                                    class58 var64 = new class58();
                                    var64.field563 = var9;
                                    var64.field569 = var9.field2776;
                                    field709.method3823(var64);
                                }
                                if (field881 > var9.field2801 && var9.field2713 != null) {
                                    class58 var65 = new class58();
                                    var65.field563 = var9;
                                    var65.field569 = var9.field2713;
                                    field709.method3823(var65);
                                }
                                if (field824 > var9.field2801 && var9.field2700 != null) {
                                    class58 var66 = new class58();
                                    var66.field563 = var9;
                                    var66.field569 = var9.field2700;
                                    field709.method3823(var66);
                                }
                                if (field825 > var9.field2801 && var9.field2784 != null) {
                                    class58 var67 = new class58();
                                    var67.field563 = var9;
                                    var67.field569 = var9.field2784;
                                    field709.method3823(var67);
                                }
                                if (field826 > var9.field2801 && var9.field2785 != null) {
                                    class58 var68 = new class58();
                                    var68.field563 = var9;
                                    var68.field569 = var9.field2785;
                                    field709.method3823(var68);
                                }
                                if (field827 > var9.field2801 && var9.field2761 != null) {
                                    class58 var69 = new class58();
                                    var69.field563 = var9;
                                    var69.field569 = var9.field2761;
                                    field709.method3823(var69);
                                }
                                var9.field2801 = field815;
                                if (var9.field2699 != null) {
                                    for (int var70 = 0; var70 < field892; var70++) {
                                        class58 var71 = new class58();
                                        var71.field563 = var9;
                                        var71.field564 = field853[var70];
                                        var71.field575 = field852[var70];
                                        var71.field569 = var9.field2699;
                                        field709.method3823(var71);
                                    }
                                }
                            }
                        }
                        if (!var9.field2667) {
                            if (field803 != null || Statics.field1497 != null || field837) {
                                continue;
                            }
                            if ((var9.field2789 >= 0 || var9.field2807 != 0) && class49.field461 >= var12 && class49.field462 >= var13 && class49.field461 < var14 && class49.field462 < var15) {
                                if (var9.field2789 >= 0) {
                                    Statics.field2077 = arg0[var9.field2789];
                                } else {
                                    Statics.field2077 = var9;
                                }
                            }
                            if (var9.field2670 == 8 && class49.field461 >= var12 && class49.field462 >= var13 && class49.field461 < var14 && class49.field462 < var15) {
                                Statics.field2042 = var9;
                            }
                            if (var9.field2692 > var9.field2684) {
                                method458(var9, var9.field2683 + var10, var11, var9.field2684, var9.field2692, class49.field461, class49.field462);
                            }
                        }
                        if (var9.field2670 == 0) {
                            method4265(arg0, var9.field2731, var12, var13, var14, var15, var10 - var9.field2689, var11 - var9.field2690);
                            if (var9.field2798 != null) {
                                method4265(var9.field2798, var9.field2731, var12, var13, var14, var15, var10 - var9.field2689, var11 - var9.field2690);
                            }
                            class57 var72 = (class57) field889.method3774((long) var9.field2731);
                            if (var72 != null) {
                                if (var72.field555 == 0 && class49.field461 >= var12 && class49.field462 >= var13 && class49.field461 < var14 && class49.field462 < var15 && !field837) {
                                    for (class58 var73 = (class58) field709.method3827(); var73 != null; var73 = (class58) field709.method3829()) {
                                        if (var73.field562) {
                                            var73.method3818();
                                            var73.field563.field2799 = false;
                                        }
                                    }
                                    if (Statics.field3715 == 0) {
                                        field803 = null;
                                        field812 = null;
                                    }
                                    if (!field837) {
                                        method149();
                                    }
                                }
                                method118(var72.field558, var12, var13, var14, var15, var10, var11);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ay.iy(II)Z")
    public static boolean method907(int arg0) {
        for (int var1 = 0; var1 < field892; var1++) {
            if (field853[var1] == arg0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("cm.if(III)V")
    public static final void method1829(int arg0, int arg1) {
        if (class233.method1506(arg0)) {
            method3142(Statics.field2657[arg0], arg1);
        }
    }

    @ObfuscatedName("fb.ic([Lhw;IB)V")
    public static final void method3142(class233[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class233 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2670 == 0) {
                    if (var3.field2798 != null) {
                        method3142(var3.field2798, arg1);
                    }
                    class57 var4 = (class57) field889.method3774((long) var3.field2731);
                    if (var4 != null) {
                        method1829(var4.field558, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2719 != null) {
                    class58 var5 = new class58();
                    var5.field563 = var3;
                    var5.field569 = var3.field2719;
                    class71.method5372(var5);
                }
                if (arg1 == 1 && var3.field2782 != null) {
                    if (var3.field2730 >= 0) {
                        class233 var6 = class233.method1754(var3.field2731);
                        if (var6 == null || var6.field2798 == null || var3.field2730 >= var6.field2798.length || var6.field2798[var3.field2730] != var3) {
                            continue;
                        }
                    }
                    class58 var7 = new class58();
                    var7.field563 = var3;
                    var7.field569 = var3.field2782;
                    class71.method5372(var7);
                }
            }
        }
    }

    @ObfuscatedName("da.il(Lhw;III)V")
    public static final void method2405(class233 arg0, int arg1, int arg2) {
        if (field803 != null || field837 || arg0 == null) {
            return;
        }
        class233 var3 = arg0;
        int var4 = method2995(arg0);
        int var5 = var4 >> 17 & 0x7;
        int var6 = var5;
        class233 var7;
        if (var5 == 0) {
            var7 = null;
        } else {
            int var8 = 0;
            while (true) {
                if (var8 >= var6) {
                    var7 = var3;
                    break;
                }
                var3 = class233.method1754(var3.field2687);
                if (var3 == null) {
                    var7 = null;
                    break;
                }
                var8++;
            }
        }
        class233 var9 = var7;
        if (var7 == null) {
            var9 = arg0.field2749;
        }
        if (var9 == null) {
            return;
        }
        field803 = arg0;
        class233 var11 = arg0;
        int var12 = method2995(arg0);
        int var13 = var12 >> 17 & 0x7;
        int var14 = var13;
        class233 var15;
        if (var13 == 0) {
            var15 = null;
        } else {
            int var16 = 0;
            while (true) {
                if (var16 >= var14) {
                    var15 = var11;
                    break;
                }
                var11 = class233.method1754(var11.field2687);
                if (var11 == null) {
                    var15 = null;
                    break;
                }
                var16++;
            }
        }
        class233 var17 = var15;
        if (var15 == null) {
            var17 = arg0.field2749;
        }
        field812 = var17;
        field781 = arg1;
        field784 = arg2;
        Statics.field3715 = 0;
        field814 = false;
        int var19 = method2924();
        if (var19 != -1) {
            Statics.field560 = new class77();
            Statics.field560.field1111 = field768[var19];
            Statics.field560.field1118 = field769[var19];
            Statics.field560.field1113 = field770[var19];
            Statics.field560.field1114 = field845[var19];
            Statics.field560.field1116 = field772[var19];
        }
        return;
    }

    @ObfuscatedName("client.jd(I)V")
    public final void method1108() {
        method272(field803);
        Statics.field3715++;
        if (field811 && field808) {
            int var1 = class49.field461;
            int var2 = class49.field462;
            int var3 = var1 - field781;
            int var4 = var2 - field784;
            if (var3 < field725) {
                var3 = field725;
            }
            if (field803.field2683 + var3 > field725 + field812.field2683) {
                var3 = field725 + field812.field2683 - field803.field2683;
            }
            if (var4 < field810) {
                var4 = field810;
            }
            if (field803.field2684 + var4 > field810 + field812.field2684) {
                var4 = field810 + field812.field2684 - field803.field2684;
            }
            int var5 = var3 - field681;
            int var6 = var4 - field758;
            int var7 = field803.field2780;
            if (Statics.field3715 > field803.field2751 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field814 = true;
            }
            int var8 = field812.field2689 + (var3 - field725);
            int var9 = field812.field2690 + (var4 - field810);
            if (field803.field2763 != null && field814) {
                class58 var10 = new class58();
                var10.field563 = field803;
                var10.field568 = var8;
                var10.field565 = var9;
                var10.field569 = field803.field2763;
                class71.method5372(var10);
            }
            if (class49.field469 == 0) {
                if (field814) {
                    if (field803.field2764 != null) {
                        class58 var11 = new class58();
                        var11.field563 = field803;
                        var11.field568 = var8;
                        var11.field565 = var9;
                        var11.field571 = field807;
                        var11.field569 = field803.field2764;
                        class71.method5372(var11);
                    }
                    if (field807 != null) {
                        class233 var12 = field803;
                        int var13 = method2995(var12);
                        int var14 = var13 >> 17 & 0x7;
                        int var15 = var14;
                        class233 var16;
                        if (var14 == 0) {
                            var16 = null;
                        } else {
                            int var17 = 0;
                            while (true) {
                                if (var17 >= var15) {
                                    var16 = var12;
                                    break;
                                }
                                var12 = class233.method1754(var12.field2687);
                                if (var12 == null) {
                                    var16 = null;
                                    break;
                                }
                                var17++;
                            }
                        }
                        if (var16 != null) {
                            class175 var18 = class175.method85(class172.field2265, field861.field1287);
                            var18.field2335.method3380(field803.field2730);
                            var18.field2335.method3380(field807.field2786);
                            var18.field2335.method3330(field807.field2730);
                            var18.field2335.method3388(field803.field2731);
                            var18.field2335.method3389(field807.field2731);
                            var18.field2335.method3330(field803.field2786);
                            field861.method1944(var18);
                        }
                    }
                } else if (this.method1104()) {
                    this.method1154(field781 + field681, field784 + field758);
                } else if (field767 > 0) {
                    int var19 = field781 + field681;
                    int var20 = field784 + field758;
                    method937(Statics.field560, var19, var20);
                    Statics.field560 = null;
                }
                field803 = null;
            }
        } else if (Statics.field3715 > 1) {
            field803 = null;
        }
    }

    @ObfuscatedName("o.jv(Lhw;I)V")
    public static void method272(class233 arg0) {
        if (field857 == arg0.field2777) {
            field828[arg0.field2805] = true;
        }
    }

    @ObfuscatedName("cg.jn(I)V")
    public static void method1893() {
        for (class57 var0 = (class57) field889.method3781(); var0 != null; var0 = (class57) field889.method3777()) {
            int var1 = var0.field558;
            if (class233.method1506(var1)) {
                boolean var2 = true;
                class233[] var3 = Statics.field2657[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2667;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2497;
                    class233 var6 = class233.method1754(var5);
                    if (var6 != null) {
                        method272(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fy.jc(IB)V")
    public static final void method3157(int arg0) {
        if (!class233.method1506(arg0)) {
            return;
        }
        class233[] var1 = Statics.field2657[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class233 var3 = var1[var2];
            if (var3 != null) {
                var3.field2796 = 0;
                var3.field2773 = 0;
            }
        }
    }

    @ObfuscatedName("kq.jk([Lhw;II)V")
    public static final void method5184(class233[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class233 var3 = arg0[var2];
            if (var3 != null && var3.field2687 == arg1 && (!var3.field2667 || !method1031(var3))) {
                if (var3.field2670 == 0) {
                    if (!var3.field2667 && method1031(var3) && Statics.field2077 != var3) {
                        continue;
                    }
                    method5184(arg0, var3.field2731);
                    if (var3.field2798 != null) {
                        method5184(var3.field2798, var3.field2731);
                    }
                    class57 var4 = (class57) field889.method3774((long) var3.field2731);
                    if (var4 != null) {
                        int var5 = var4.field558;
                        if (class233.method1506(var5)) {
                            method5184(Statics.field2657[var5], -1);
                        }
                    }
                }
                if (var3.field2670 == 6) {
                    if (var3.field2715 != -1 || var3.field2716 != -1) {
                        boolean var6 = method5381(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2716;
                        } else {
                            var7 = var3.field2715;
                        }
                        if (var7 != -1) {
                            class276 var8 = class276.method3224(var7);
                            var3.field2773 += field887;
                            while (var3.field2773 > var8.field3617[var3.field2796]) {
                                var3.field2773 -= var8.field3617[var3.field2796];
                                var3.field2796++;
                                if (var3.field2796 >= var8.field3625.length) {
                                    var3.field2796 -= var8.field3619;
                                    if (var3.field2796 < 0 || var3.field2796 >= var8.field3625.length) {
                                        var3.field2796 = 0;
                                    }
                                }
                                method272(var3);
                            }
                        }
                    }
                    if (var3.field2724 != 0 && !var3.field2667) {
                        int var9 = var3.field2724 >> 16;
                        int var10 = var3.field2724 << 16 >> 16;
                        int var11 = field887 * var9;
                        int var12 = field887 * var10;
                        var3.field2797 = var3.field2797 + var11 & 0x7FF;
                        var3.field2720 = var3.field2720 + var12 & 0x7FF;
                        method272(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("k.jg(IB)V")
    public static final void method290(int arg0) {
        method1893();
        class70.method1061();
        int var1 = class257.method3019(arg0).field3294;
        if (var1 == 0) {
            return;
        }
        int var2 = class228.field2628[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class125.method2645(0.9D);
                ((class114) Statics.field1724).method2423(0.9D);
            }
            if (var2 == 2) {
                class125.method2645(0.8D);
                ((class114) Statics.field1724).method2423(0.8D);
            }
            if (var2 == 3) {
                class125.method2645(0.7D);
                ((class114) Statics.field1724).method2423(0.7D);
            }
            if (var2 == 4) {
                class125.method2645(0.6D);
                ((class114) Statics.field1724).method2423(0.6D);
            }
            class272.method2920();
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
            if (field863 != var3) {
                if (field863 == 0 && field805 != -1) {
                    class220.method3920(Statics.field905, field805, 0, var3, false);
                    field870 = false;
                } else if (var3 == 0) {
                    Statics.field2536.method3945();
                    class220.field2534 = 1;
                    Statics.field2358 = null;
                    field870 = false;
                } else if (class220.field2534 == 0) {
                    Statics.field2536.method3941(var3);
                } else {
                    Statics.field1838 = var3;
                }
                field863 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field866 = 127;
            }
            if (var2 == 1) {
                field866 = 96;
            }
            if (var2 == 2) {
                field866 = 64;
            }
            if (var2 == 3) {
                field866 = 32;
            }
            if (var2 == 4) {
                field866 = 0;
            }
        }
        if (var1 == 5) {
            field765 = var2;
        }
        if (var1 == 6) {
            field794 = var2;
        }
        if (var1 == 9) {
            field795 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                field867 = 127;
            }
            if (var2 == 1) {
                field867 = 96;
            }
            if (var2 == 2) {
                field867 = 64;
            }
            if (var2 == 3) {
                field867 = 32;
            }
            if (var2 == 4) {
                field867 = 0;
            }
        }
        if (var1 == 17) {
            field800 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            class79[] var4 = new class79[] { class79.field1130, class79.field1129, class79.field1128, class79.field1134 };
            field658 = (class79) Statics.method1912(var4, var2);
            if (field658 == null) {
                field658 = class79.field1128;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field820 = -1;
            } else {
                field820 = var2 & 0x7FF;
            }
        }
        if (var1 != 22) {
            return;
        }
        class79[] var5 = new class79[] { class79.field1130, class79.field1129, class79.field1128, class79.field1134 };
        field651 = (class79) Statics.method1912(var5, var2);
        if (field651 == null) {
            field651 = class79.field1128;
        }
    }

    @ObfuscatedName("ag.jx(Lhw;I)V")
    public static final void method447(class233 arg0) {
        int var1 = arg0.field2672;
        if (var1 == 324) {
            if (field894 == -1) {
                field894 = arg0.field2703;
                field895 = arg0.field2750;
            }
            if (field752.field2644) {
                arg0.field2703 = field894;
            } else {
                arg0.field2703 = field895;
            }
        } else if (var1 == 325) {
            if (field894 == -1) {
                field894 = arg0.field2703;
                field895 = arg0.field2750;
            }
            if (field752.field2644) {
                arg0.field2703 = field895;
            } else {
                arg0.field2703 = field894;
            }
        } else if (var1 == 327) {
            arg0.field2797 = 150;
            arg0.field2720 = (int) (Math.sin((double) field642 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2676 = 5;
            arg0.field2712 = 0;
        } else if (var1 == 328) {
            arg0.field2797 = 150;
            arg0.field2720 = (int) (Math.sin((double) field642 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2676 = 5;
            arg0.field2712 = 1;
        }
    }

    @ObfuscatedName("fo.jf(I)V")
    public static final void method3133() {
        class175 var0 = class175.method85(class172.field2228, field861.field1287);
        field861.method1944(var0);
        for (class57 var1 = (class57) field889.method3781(); var1 != null; var1 = (class57) field889.method3777()) {
            if (var1.field555 == 0 || var1.field555 == 3) {
                method4843(var1, true);
            }
        }
        if (field796 != null) {
            method272(field796);
            field796 = null;
        }
    }

    @ObfuscatedName("o.jl(IIII)Lbl;")
    public static final class57 method273(int arg0, int arg1, int arg2) {
        class57 var3 = new class57();
        var3.field558 = arg1;
        var3.field555 = arg2;
        field889.method3773(var3, (long) arg0);
        method3157(arg1);
        class233 var4 = class233.method1754(arg0);
        method272(var4);
        if (field796 != null) {
            method272(field796);
            field796 = null;
        }
        for (int var5 = 0; var5 < field767; var5++) {
            int var6 = field770[var5];
            boolean var7 = var6 == 57 || var6 == 58 || var6 == 1007 || var6 == 25 || var6 == 30;
            if (var7) {
                if (var5 < field767 - 1) {
                    for (int var8 = var5; var8 < field767 - 1; var8++) {
                        field772[var8] = field772[var8 + 1];
                        field773[var8] = field773[var8 + 1];
                        field770[var8] = field770[var8 + 1];
                        field845[var8] = field845[var8 + 1];
                        field768[var8] = field768[var8 + 1];
                        field769[var8] = field769[var8 + 1];
                        field804[var8] = field804[var8 + 1];
                    }
                }
                var5--;
                field767--;
            }
        }
        method941();
        method1742(Statics.field2657[arg0 >> 16], var4, false);
        class71.method3326(arg1);
        if (field790 != -1) {
            method1829(field790, 1);
        }
        return var3;
    }

    @ObfuscatedName("jp.jz(Lbl;ZI)V")
    public static final void method4843(class57 arg0, boolean arg1) {
        int var2 = arg0.field558;
        int var3 = (int) arg0.field2497;
        arg0.method3818();
        if (arg1) {
            class233.method191(var2);
        }
        for (class214 var4 = (class214) field832.method3781(); var4 != null; var4 = (class214) field832.method3777()) {
            if ((var4.field2497 >> 48 & 0xFFFFL) == (long) var2) {
                var4.method3818();
            }
        }
        class233 var5 = class233.method1754(var3);
        if (var5 != null) {
            method272(var5);
        }
        for (int var6 = 0; var6 < field767; var6++) {
            int var7 = field770[var6];
            boolean var8 = var7 == 57 || var7 == 58 || var7 == 1007 || var7 == 25 || var7 == 30;
            if (var8) {
                if (var6 < field767 - 1) {
                    for (int var9 = var6; var9 < field767 - 1; var9++) {
                        field772[var9] = field772[var9 + 1];
                        field773[var9] = field773[var9 + 1];
                        field770[var9] = field770[var9 + 1];
                        field845[var9] = field845[var9 + 1];
                        field768[var9] = field768[var9 + 1];
                        field769[var9] = field769[var9 + 1];
                        field804[var9] = field804[var9 + 1];
                    }
                }
                var6--;
                field767--;
            }
        }
        method941();
        if (field790 != -1) {
            method1829(field790, 1);
        }
    }

    @ObfuscatedName("i.jq(Lhw;I)Z")
    public static final boolean method280(class233 arg0) {
        int var1 = arg0.field2672;
        if (var1 == 205) {
            field775 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field752.method4185(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field752.method4154(var4, var5 == 1);
        }
        if (var1 == 324) {
            field752.method4157(false);
        }
        if (var1 == 325) {
            field752.method4157(true);
        }
        if (var1 == 326) {
            class175 var6 = class175.method85(class172.field2220, field861.field1287);
            field752.method4159(var6.field2335);
            field861.method1944(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("w.js(Lhw;IIIB)V")
    public static final void method21(class233 arg0, int arg1, int arg2, int arg3) {
        method928();
        class227 var4 = arg0.method4209(false);
        if (var4 == null) {
            return;
        }
        class320.method5454(arg1, arg2, var4.field2624 + arg1, var4.field2621 + arg2);
        if (field888 == 2 || field888 == 5) {
            class320.method5473(arg1, arg2, 0, var4.field2622, var4.field2619);
        } else {
            int var5 = field700 & 0x7FF;
            int var6 = Statics.field138.field943 / 32 + 48;
            int var7 = 464 - Statics.field138.field925 / 32;
            Statics.field139.method5583(arg1, arg2, var4.field2624, var4.field2621, var6, var7, var5, 256, var4.field2622, var4.field2619);
            for (int var8 = 0; var8 < field856; var8++) {
                int var9 = field667[var8] * 4 + 2 - Statics.field138.field943 / 32;
                int var10 = field858[var8] * 4 + 2 - Statics.field138.field925 / 32;
                method998(arg1, arg2, var9, var10, field859[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class208 var13 = field659[Statics.field1983][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field138.field943 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field138.field925 / 32;
                        method998(arg1, arg2, var14, var15, Statics.field3681[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field673; var16++) {
                class74 var17 = field672[field674[var16]];
                if (var17 != null && var17.method1043()) {
                    class274 var18 = var17.field1091;
                    if (var18 != null && var18.field3589 != null) {
                        var18 = var18.method4868();
                    }
                    if (var18 != null && var18.field3576 && var18.field3592) {
                        int var19 = var17.field943 / 32 - Statics.field138.field943 / 32;
                        int var20 = var17.field925 / 32 - Statics.field138.field925 / 32;
                        method998(arg1, arg2, var19, var20, Statics.field3681[1], var4);
                    }
                }
            }
            int var21 = class84.field1216;
            int[] var22 = class84.field1217;
            for (int var23 = 0; var23 < var21; var23++) {
                class62 var24 = field746[var22[var23]];
                if (var24 != null && var24.method1043() && !var24.field595 && Statics.field138 != var24) {
                    int var25 = var24.field943 / 32 - Statics.field138.field943 / 32;
                    int var26 = var24.field925 / 32 - Statics.field138.field925 / 32;
                    boolean var27 = false;
                    if (Statics.field138.field615 != 0 && var24.field615 != 0 && Statics.field138.field615 == var24.field615) {
                        var27 = true;
                    }
                    if (var24.method1046()) {
                        method998(arg1, arg2, var25, var26, Statics.field3681[3], var4);
                    } else if (var27) {
                        method998(arg1, arg2, var25, var26, Statics.field3681[4], var4);
                    } else if (var24.method1038()) {
                        method998(arg1, arg2, var25, var26, Statics.field3681[5], var4);
                    } else {
                        method998(arg1, arg2, var25, var26, Statics.field3681[2], var4);
                    }
                }
            }
            if (field650 != 0 && field642 % 20 < 10) {
                if (field650 == 1 && field757 >= 0 && field757 < field672.length) {
                    class74 var28 = field672[field757];
                    if (var28 != null) {
                        int var29 = var28.field943 / 32 - Statics.field138.field943 / 32;
                        int var30 = var28.field925 / 32 - Statics.field138.field925 / 32;
                        method115(arg1, arg2, var29, var30, Statics.field3194[1], var4);
                    }
                }
                if (field650 == 2) {
                    int var31 = field653 * 4 - Statics.field321 * 4 + 2 - Statics.field138.field943 / 32;
                    int var32 = field797 * 4 - Statics.field2611 * 4 + 2 - Statics.field138.field925 / 32;
                    method115(arg1, arg2, var31, var32, Statics.field3194[1], var4);
                }
                if (field650 == 10 && field697 >= 0 && field697 < field746.length) {
                    class62 var33 = field746[field697];
                    if (var33 != null) {
                        int var34 = var33.field943 / 32 - Statics.field138.field943 / 32;
                        int var35 = var33.field925 / 32 - Statics.field138.field925 / 32;
                        method115(arg1, arg2, var34, var35, Statics.field3194[1], var4);
                    }
                }
            }
            if (field693 != 0) {
                int var36 = field693 * 4 + 2 - Statics.field138.field943 / 32;
                int var37 = field891 * 4 + 2 - Statics.field138.field925 / 32;
                method998(arg1, arg2, var36, var37, Statics.field3194[0], var4);
            }
            if (!Statics.field138.field595) {
                class320.method5483(var4.field2624 / 2 + arg1 - 1, var4.field2621 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field764[arg3] = true;
    }

    @ObfuscatedName("ea.jp(Lhw;IIII)V")
    public static final void method2950(class233 arg0, int arg1, int arg2, int arg3) {
        class227 var4 = arg0.method4209(false);
        if (var4 == null) {
            return;
        }
        if (field888 < 3) {
            Statics.field36.method5583(arg1, arg2, var4.field2624, var4.field2621, 25, 25, field700, 256, var4.field2622, var4.field2619);
        } else {
            class320.method5473(arg1, arg2, 0, var4.field2622, var4.field2619);
        }
    }

    @ObfuscatedName("x.ji(IIIILlp;Lht;I)V")
    public static final void method115(int arg0, int arg1, int arg2, int arg3, class324 arg4, class227 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method998(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field700 & 0x7FF;
        int var8 = class125.field1749[var7];
        int var9 = class125.field1743[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field2624 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field91.method5631(arg5.field2624 / 2 + arg0 - var17 / 2 + var15, arg5.field2621 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("ba.jy(IIIILlp;Lht;I)V")
    public static final void method998(int arg0, int arg1, int arg2, int arg3, class324 arg4, class227 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field700 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class125.field1749[var6];
        int var9 = class125.field1743[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method5587(arg5.field2624 / 2 + var10 - arg4.field3877 / 2, arg5.field2621 / 2 - var11 - arg4.field3880 / 2, arg0, arg1, arg5.field2624, arg5.field2621, arg5.field2622, arg5.field2619);
        } else {
            arg4.method5567(arg5.field2624 / 2 + arg0 + var10 - arg4.field3877 / 2, arg5.field2621 / 2 + arg1 - var11 - arg4.field3880 / 2);
        }
    }

    @ObfuscatedName("ak.jw(I)V")
    public static final void method943() {
        for (int var0 = 0; var0 < class84.field1216; var0++) {
            class62 var1 = field746[class84.field1217[var0]];
            var1.method1059();
        }
        Iterator var2 = class86.field1240.iterator();
        while (var2.hasNext()) {
            class60 var3 = (class60) var2.next();
            var3.method1028();
        }
        if (Statics.field2353 != null) {
            Statics.field2353.method5160();
        }
    }

    @ObfuscatedName("ea.ju(I)V")
    public static final void method2951() {
        class86.method145();
        if (Statics.field2353 != null) {
            Statics.field2353.method5161();
        }
    }

    @ObfuscatedName("dw.jo(I)V")
    public static final void method2514() {
        field824 = field815;
        Statics.field2811 = true;
    }

    @ObfuscatedName("df.jj(Ljava/lang/String;I)V")
    public static final void method2903(String arg0) {
        if (!arg0.equals("")) {
            class175 var1 = class175.method85(class172.field2286, field861.field1287);
            var1.field2335.method3376(class185.method3075(arg0));
            var1.field2335.method3446(arg0);
            field861.method1944(var1);
        }
    }

    @ObfuscatedName("je.jr(B)V")
    public static final void method4967() {
        class175 var0 = class175.method85(class172.field2286, field861.field1287);
        var0.field2335.method3376(0);
        field861.method1944(var0);
    }

    @ObfuscatedName("ee.jh(Lhw;I)I")
    public static int method2995(class233 arg0) {
        class214 var1 = (class214) field832.method3774(((long) arg0.field2731 << 32) + (long) arg0.field2730);
        return var1 == null ? arg0.field2741 : var1.field2512;
    }

    @ObfuscatedName("bg.je(Lhw;I)Z")
    public static boolean method1031(class233 arg0) {
        return arg0.field2693;
    }

    @ObfuscatedName("u.ja(Lhw;I)Ljava/lang/String;")
    public static String method175(class233 arg0) {
        if (class234.method4384(method2995(arg0)) == 0) {
            return null;
        } else if (arg0.field2757 == null || arg0.field2757.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2757;
        }
    }

    @ObfuscatedName("hp.jb(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method4110(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field632 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field632 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field632 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field632 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field632 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field257 != null) {
            var3 = "/p=" + Statics.field257;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field635 + "/a=" + Statics.field278 + var3 + "/";
    }

    @ObfuscatedName("cz.jm(Ljava/lang/String;B)V")
    public static void method1921(String arg0) {
        Statics.field257 = arg0;
        try {
            String var1 = Statics.field1133.getParameter(class282.field3666.field3668);
            String var2 = Statics.field1133.getParameter(class282.field3663.field3668);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class195.method670(Statics.method1926() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            client var5 = Statics.field1133;
            String var6 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var5).eval(var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("e.ks(Lgm;II)V")
    public static void method51(class185 arg0, int arg1) {
        byte[] var2 = arg0.field2415;
        if (field731 == null) {
            field731 = new byte[24];
        }
        class196.method3650(var2, arg1, field731, 0, 24);
        class158.method22(arg0, arg1);
    }

    @ObfuscatedName("client.kl(I)Lka;")
    public class294 method1109() {
        return Statics.field138 == null ? null : Statics.field138.field597;
    }

    @ObfuscatedName("ij.kj(B)Z")
    public static boolean method4426() {
        return field740 >= 2;
    }

    @ObfuscatedName("fu.kt(II)V")
    public static void method3240(int arg0) {
        field705 = arg0;
    }

    @ObfuscatedName("m.kg(I)V")
    public static void method86() {
        if (field705 == 1) {
            field713 = true;
        }
    }

    @ObfuscatedName("gy.kc(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method3641(String arg0) {
        class245[] var1 = class245.method4128();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class245 var3 = var1[var2];
            if (var3.field3186 != -1 && arg0.startsWith(class76.method87(var3.field3186))) {
                arg0 = arg0.substring(6 + Integer.toString(var3.field3186).length());
                break;
            }
        }
        return arg0;
    }

    @ObfuscatedName("fb.ka(I)V")
    public static void method3143() {
        if (Statics.field505 == null) {
            return;
        }
        field899 = field642;
        Statics.field505.method4434();
        for (int var0 = 0; var0 < field746.length; var0++) {
            if (field746[var0] != null) {
                Statics.field505.method4454((field746[var0].field943 >> 7) + Statics.field321, (field746[var0].field925 >> 7) + Statics.field2611);
            }
        }
    }
}

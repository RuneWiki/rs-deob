package deob;

import java.io.File;
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class48 implements class289 {

    @ObfuscatedName("client.w")
    public static class165[] field667 = new class165[4];

    @ObfuscatedName("client.ak")
    public static boolean field781 = true;

    @ObfuscatedName("client.bc")
    public static int field677 = 1;

    @ObfuscatedName("client.bo")
    public static int field727 = 0;

    @ObfuscatedName("client.be")
    public static int field597 = 0;

    @ObfuscatedName("client.bn")
    public static boolean field629 = false;

    @ObfuscatedName("client.bp")
    public static boolean field709 = false;

    @ObfuscatedName("client.bu")
    public static int field600 = 0;

    @ObfuscatedName("client.bi")
    public static int field601 = -1;

    @ObfuscatedName("client.bb")
    public static boolean field602 = false;

    @ObfuscatedName("client.bt")
    public static int field612 = 0;

    @ObfuscatedName("client.bm")
    public static boolean field604 = true;

    @ObfuscatedName("client.bw")
    public static int field680 = 0;

    @ObfuscatedName("client.bv")
    public static long field606 = 1L;

    @ObfuscatedName("client.bj")
    public static int field607 = -1;

    @ObfuscatedName("client.ba")
    public static int field608 = -1;

    @ObfuscatedName("client.bg")
    public static int field609 = -1;

    @ObfuscatedName("client.bh")
    public static boolean field610 = true;

    @ObfuscatedName("client.bd")
    public static boolean field611 = false;

    @ObfuscatedName("client.bz")
    public static int field644 = 0;

    @ObfuscatedName("client.bq")
    public static int field859 = 0;

    @ObfuscatedName("client.cq")
    public static int field614 = 0;

    @ObfuscatedName("client.ci")
    public static int field615 = 0;

    @ObfuscatedName("client.cn")
    public static int field613 = 0;

    @ObfuscatedName("client.ct")
    public static int field617 = 0;

    @ObfuscatedName("client.cw")
    public static int field618 = 0;

    @ObfuscatedName("client.cf")
    public static int field619 = 0;

    @ObfuscatedName("client.cs")
    public static int field671 = 0;

    @ObfuscatedName("client.co")
    public static class78 field621 = class78.field1095;

    @ObfuscatedName("client.cj")
    public static class78 field622 = class78.field1095;

    @ObfuscatedName("client.ck")
    public static int field824 = 0;

    @ObfuscatedName("client.cb")
    public static int field625 = 0;

    @ObfuscatedName("client.cg")
    public static int field626 = 0;

    @ObfuscatedName("client.dp")
    public static int field596 = 0;

    @ObfuscatedName("client.do")
    public static int field839 = 0;

    @ObfuscatedName("client.de")
    public static int field646 = 0;

    @ObfuscatedName("client.dj")
    public static int field631 = 0;

    @ObfuscatedName("client.ds")
    public static int field632 = 0;

    @ObfuscatedName("client.dc")
    public static class147 field717 = class147.field1930;

    @ObfuscatedName("client.di")
    public static byte[] field719 = null;

    @ObfuscatedName("client.dz")
    public static class73[] field808 = new class73[32768];

    @ObfuscatedName("client.dq")
    public static int field636 = 0;

    @ObfuscatedName("client.dy")
    public static int[] field637 = new int[32768];

    @ObfuscatedName("client.ec")
    public static int field638 = 0;

    @ObfuscatedName("client.ey")
    public static int[] field639 = new int[250];

    @ObfuscatedName("client.eg")
    public static final class88 field740 = new class88();

    @ObfuscatedName("client.er")
    public static int field689 = 0;

    @ObfuscatedName("client.ej")
    public static boolean field642 = false;

    @ObfuscatedName("client.ek")
    public static boolean field643 = true;

    @ObfuscatedName("client.eb")
    public static class281 field841 = new class281();

    @ObfuscatedName("client.eq")
    public static HashMap field645 = new HashMap();

    @ObfuscatedName("client.ez")
    public static int field793 = 0;

    @ObfuscatedName("client.ed")
    public static int field698 = 1;

    @ObfuscatedName("client.ea")
    public static int field648 = 0;

    @ObfuscatedName("client.ew")
    public static int field649 = 1;

    @ObfuscatedName("client.fp")
    public static int field650 = 0;

    @ObfuscatedName("client.fm")
    public static boolean field647 = false;

    @ObfuscatedName("client.fs")
    public static int[][][] field653 = new int[4][13][13];

    @ObfuscatedName("client.fu")
    public static final int[] field654 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.fy")
    public static int field655 = 0;

    @ObfuscatedName("client.fb")
    public static int field656 = 2301979;

    @ObfuscatedName("client.gy")
    public static int field657 = 5063219;

    @ObfuscatedName("client.gn")
    public static int field732 = 3353893;

    @ObfuscatedName("client.gb")
    public static int field659 = 7759444;

    @ObfuscatedName("client.go")
    public static boolean field660 = false;

    @ObfuscatedName("client.gi")
    public static int field737 = 0;

    @ObfuscatedName("client.gm")
    public static int field633 = 128;

    @ObfuscatedName("client.gg")
    public static int field663 = 0;

    @ObfuscatedName("client.gf")
    public static int field664 = 0;

    @ObfuscatedName("client.gx")
    public static int field768 = 0;

    @ObfuscatedName("client.gw")
    public static int field718 = 0;

    @ObfuscatedName("client.ga")
    public static int field628 = 0;

    @ObfuscatedName("client.gj")
    public static int field679 = 0;

    @ObfuscatedName("client.gv")
    public static int field669 = 50;

    @ObfuscatedName("client.gz")
    public static int field603 = 0;

    @ObfuscatedName("client.gc")
    public static int field805 = 0;

    @ObfuscatedName("client.gr")
    public static int field672 = 0;

    @ObfuscatedName("client.hm")
    public static int field673 = 12;

    @ObfuscatedName("client.hj")
    public static int field674 = 6;

    @ObfuscatedName("client.hp")
    public static int field675 = 0;

    @ObfuscatedName("client.hd")
    public static boolean field623 = false;

    @ObfuscatedName("client.hv")
    public static int field802 = 0;

    @ObfuscatedName("client.hx")
    public static boolean field678 = false;

    @ObfuscatedName("client.hq")
    public static int field724 = 0;

    @ObfuscatedName("client.he")
    public static int field829 = 0;

    @ObfuscatedName("client.hn")
    public static int field635 = 50;

    @ObfuscatedName("client.ho")
    public static int[] field682 = new int[field635];

    @ObfuscatedName("client.hy")
    public static int[] field683 = new int[field635];

    @ObfuscatedName("client.hk")
    public static int[] field684 = new int[field635];

    @ObfuscatedName("client.ht")
    public static int[] field685 = new int[field635];

    @ObfuscatedName("client.hg")
    public static int[] field812 = new int[field635];

    @ObfuscatedName("client.hc")
    public static int[] field687 = new int[field635];

    @ObfuscatedName("client.hr")
    public static int[] field688 = new int[field635];

    @ObfuscatedName("client.ha")
    public static String[] field733 = new String[field635];

    @ObfuscatedName("client.hh")
    public static int[][] field690 = new int[104][104];

    @ObfuscatedName("client.hu")
    public static int field691 = 0;

    @ObfuscatedName("client.hs")
    public static int field692 = -1;

    @ObfuscatedName("client.hz")
    public static int field693 = -1;

    @ObfuscatedName("client.hl")
    public static int field744 = 0;

    @ObfuscatedName("client.hb")
    public static int field840 = 0;

    @ObfuscatedName("client.hw")
    public static int field844 = 0;

    @ObfuscatedName("client.hf")
    public static int field697 = 0;

    @ObfuscatedName("client.ii")
    public static boolean field665 = true;

    @ObfuscatedName("client.im")
    public static int field699 = 0;

    @ObfuscatedName("client.ia")
    public static int field700 = 0;

    @ObfuscatedName("client.io")
    public static int field598 = 0;

    @ObfuscatedName("client.ib")
    public static int field702 = 0;

    @ObfuscatedName("client.ik")
    public static int field641 = 0;

    @ObfuscatedName("client.ip")
    public static int field704 = 0;

    @ObfuscatedName("client.iu")
    public static boolean field705 = false;

    @ObfuscatedName("client.il")
    public static int field706 = 0;

    @ObfuscatedName("client.iv")
    public static int field707 = 0;

    @ObfuscatedName("client.ic")
    public static boolean field716 = true;

    @ObfuscatedName("client.ir")
    public static class61[] field807 = new class61[2048];

    @ObfuscatedName("client.it")
    public static String field760 = null;

    @ObfuscatedName("client.iw")
    public static int field710 = -1;

    @ObfuscatedName("client.in")
    public static int field711 = 0;

    @ObfuscatedName("client.ie")
    public static boolean field712 = true;

    @ObfuscatedName("client.jx")
    public static int field713 = 0;

    @ObfuscatedName("client.jb")
    public static int field714 = 0;

    @ObfuscatedName("client.je")
    public static int[] field715 = new int[1000];

    @ObfuscatedName("client.jq")
    public static final int[] field834 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.jp")
    public static String[] field651 = new String[8];

    @ObfuscatedName("client.jm")
    public static boolean[] field851 = new boolean[8];

    @ObfuscatedName("client.ja")
    public static int[] field666 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.jj")
    public static int field720 = -1;

    @ObfuscatedName("client.jf")
    public static class206[][][] field721 = new class206[4][104][104];

    @ObfuscatedName("client.jh")
    public static class206 field722 = new class206();

    @ObfuscatedName("client.ju")
    public static class206 field723 = new class206();

    @ObfuscatedName("client.jr")
    public static class206 field661 = new class206();

    @ObfuscatedName("client.jt")
    public static int[] field725 = new int[25];

    @ObfuscatedName("client.jo")
    public static int[] field726 = new int[25];

    @ObfuscatedName("client.jd")
    public static int[] field765 = new int[25];

    @ObfuscatedName("client.ji")
    public static int field728 = 0;

    @ObfuscatedName("client.jg")
    public static boolean field847 = false;

    @ObfuscatedName("client.kj")
    public static int field658 = 0;

    @ObfuscatedName("client.kd")
    public static int[] field731 = new int[500];

    @ObfuscatedName("client.ki")
    public static int[] field738 = new int[500];

    @ObfuscatedName("client.ke")
    public static int[] field703 = new int[500];

    @ObfuscatedName("client.kn")
    public static int[] field620 = new int[500];

    @ObfuscatedName("client.km")
    public static String[] field735 = new String[500];

    @ObfuscatedName("client.kf")
    public static String[] field736 = new String[500];

    @ObfuscatedName("client.kb")
    public static boolean[] field729 = new boolean[500];

    @ObfuscatedName("client.ks")
    public static boolean field754 = false;

    @ObfuscatedName("client.kl")
    public static boolean field734 = false;

    @ObfuscatedName("client.kg")
    public static boolean field670 = false;

    @ObfuscatedName("client.kr")
    public static boolean field741 = true;

    @ObfuscatedName("client.kp")
    public static int field742 = -1;

    @ObfuscatedName("client.ku")
    public static int field668 = -1;

    @ObfuscatedName("client.kq")
    public static int field748 = 0;

    @ObfuscatedName("client.kx")
    public static int field745 = 50;

    @ObfuscatedName("client.ko")
    public static int field772 = 0;

    @ObfuscatedName("client.kz")
    public static boolean field814 = false;

    @ObfuscatedName("client.ka")
    public static int field749 = -1;

    @ObfuscatedName("client.kh")
    public static int field750 = -1;

    @ObfuscatedName("client.lg")
    public static String field751 = null;

    @ObfuscatedName("client.lw")
    public static String field752 = null;

    @ObfuscatedName("client.lj")
    public static int field753 = -1;

    @ObfuscatedName("client.ly")
    public static class203 field827 = new class203(8);

    @ObfuscatedName("client.lh")
    public static int field755 = 0;

    @ObfuscatedName("client.lc")
    public static int field815 = 0;

    @ObfuscatedName("client.lr")
    public static class231 field757 = null;

    @ObfuscatedName("client.lq")
    public static int field758 = 0;

    @ObfuscatedName("client.lz")
    public static int field759 = 0;

    @ObfuscatedName("client.la")
    public static int field730 = 0;

    @ObfuscatedName("client.lb")
    public static int field761 = -1;

    @ObfuscatedName("client.ll")
    public static boolean field762 = false;

    @ObfuscatedName("client.lp")
    public static class231 field777 = null;

    @ObfuscatedName("client.lk")
    public static class231 field764 = null;

    @ObfuscatedName("client.li")
    public static class231 field640 = null;

    @ObfuscatedName("client.le")
    public static int field686 = 0;

    @ObfuscatedName("client.lv")
    public static int field767 = 0;

    @ObfuscatedName("client.lm")
    public static class231 field701 = null;

    @ObfuscatedName("client.lx")
    public static boolean field595 = false;

    @ObfuscatedName("client.ln")
    public static int field770 = -1;

    @ObfuscatedName("client.ls")
    public static int field771 = -1;

    @ObfuscatedName("client.lo")
    public static boolean field861 = false;

    @ObfuscatedName("client.lu")
    public static int field773 = -1;

    @ObfuscatedName("client.lf")
    public static int field774 = -1;

    @ObfuscatedName("client.ld")
    public static boolean field775 = false;

    @ObfuscatedName("client.mh")
    public static int field776 = 1;

    @ObfuscatedName("client.mu")
    public static int[] field594 = new int[32];

    @ObfuscatedName("client.md")
    public static int field778 = 0;

    @ObfuscatedName("client.mw")
    public static int[] field779 = new int[32];

    @ObfuscatedName("client.mq")
    public static int field780 = 0;

    @ObfuscatedName("client.mj")
    public static int[] field811 = new int[32];

    @ObfuscatedName("client.mb")
    public static int field782 = 0;

    @ObfuscatedName("client.mm")
    public static int field634 = 0;

    @ObfuscatedName("client.mp")
    public static int field743 = 0;

    @ObfuscatedName("client.ml")
    public static int field785 = 0;

    @ObfuscatedName("client.mn")
    public static int field786 = 0;

    @ObfuscatedName("client.mc")
    public static int field790 = 0;

    @ObfuscatedName("client.mr")
    public static int field788 = 0;

    @ObfuscatedName("client.mx")
    public static int field789 = 0;

    @ObfuscatedName("client.mv")
    public static class206 field756 = new class206();

    @ObfuscatedName("client.mk")
    public static class206 field791 = new class206();

    @ObfuscatedName("client.mo")
    public static class206 field792 = new class206();

    @ObfuscatedName("client.mg")
    public static class203 field817 = new class203(512);

    @ObfuscatedName("client.nc")
    public static int field794 = 0;

    @ObfuscatedName("client.nd")
    public static int field795 = -2;

    @ObfuscatedName("client.ng")
    public static boolean[] field796 = new boolean[100];

    @ObfuscatedName("client.no")
    public static boolean[] field797 = new boolean[100];

    @ObfuscatedName("client.nt")
    public static boolean[] field798 = new boolean[100];

    @ObfuscatedName("client.ny")
    public static int[] field799 = new int[100];

    @ObfuscatedName("client.nj")
    public static int[] field800 = new int[100];

    @ObfuscatedName("client.nk")
    public static int[] field801 = new int[100];

    @ObfuscatedName("client.ni")
    public static int[] field605 = new int[100];

    @ObfuscatedName("client.nu")
    public static int field803 = 0;

    @ObfuscatedName("client.nb")
    public static long field804 = 0L;

    @ObfuscatedName("client.nh")
    public static boolean field676 = true;

    @ObfuscatedName("client.nx")
    public static int[] field806 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.np")
    public static int field852 = 0;

    @ObfuscatedName("client.nf")
    public static int field695 = 0;

    @ObfuscatedName("client.nr")
    public static String field809 = "";

    @ObfuscatedName("client.ne")
    public static long[] field810 = new long[100];

    @ObfuscatedName("client.oh")
    public static int field831 = 0;

    @ObfuscatedName("client.ow")
    public static int field846 = 0;

    @ObfuscatedName("client.oa")
    public static int[] field813 = new int[128];

    @ObfuscatedName("client.op")
    public static int[] field866 = new int[128];

    @ObfuscatedName("client.ot")
    public static long field783 = -1L;

    @ObfuscatedName("client.on")
    public static int field816 = -1;

    @ObfuscatedName("client.og")
    public static int field652 = 0;

    @ObfuscatedName("client.ol")
    public static int[] field818 = new int[1000];

    @ObfuscatedName("client.ox")
    public static int[] field819 = new int[1000];

    @ObfuscatedName("client.ou")
    public static class319[] field820 = new class319[1000];

    @ObfuscatedName("client.of")
    public static int field821 = 0;

    @ObfuscatedName("client.ok")
    public static int field822 = 0;

    @ObfuscatedName("client.oq")
    public static int field823 = 0;

    @ObfuscatedName("client.oi")
    public static int field694 = 255;

    @ObfuscatedName("client.oj")
    public static int field825 = -1;

    @ObfuscatedName("client.ob")
    public static boolean field826 = false;

    @ObfuscatedName("client.pb")
    public static int field769 = 127;

    @ObfuscatedName("client.pe")
    public static int field828 = 127;

    @ObfuscatedName("client.po")
    public static int field599 = 0;

    @ObfuscatedName("client.px")
    public static int[] field830 = new int[50];

    @ObfuscatedName("client.pc")
    public static int[] field696 = new int[50];

    @ObfuscatedName("client.pg")
    public static int[] field832 = new int[50];

    @ObfuscatedName("client.pj")
    public static int[] field833 = new int[50];

    @ObfuscatedName("client.ps")
    public static class92[] field763 = new class92[50];

    @ObfuscatedName("client.pu")
    public static boolean field747 = false;

    @ObfuscatedName("client.pm")
    public static boolean[] field836 = new boolean[5];

    @ObfuscatedName("client.qd")
    public static int[] field837 = new int[5];

    @ObfuscatedName("client.qe")
    public static int[] field838 = new int[5];

    @ObfuscatedName("client.qb")
    public static int[] field856 = new int[5];

    @ObfuscatedName("client.qq")
    public static int[] field766 = new int[5];

    @ObfuscatedName("client.qx")
    public static short field746 = 256;

    @ObfuscatedName("client.qo")
    public static short field842 = 205;

    @ObfuscatedName("client.qn")
    public static short field843 = 256;

    @ObfuscatedName("client.qg")
    public static short field616 = 320;

    @ObfuscatedName("client.qw")
    public static short field845 = 1;

    @ObfuscatedName("client.qh")
    public static short field864 = 32767;

    @ObfuscatedName("client.qs")
    public static short field708 = 1;

    @ObfuscatedName("client.qu")
    public static short field848 = 32767;

    @ObfuscatedName("client.qt")
    public static int field849 = 0;

    @ObfuscatedName("client.qa")
    public static int field850 = 0;

    @ObfuscatedName("client.qy")
    public static int field835 = 0;

    @ObfuscatedName("client.qj")
    public static int field662 = 0;

    @ObfuscatedName("client.qm")
    public static int field853 = 0;

    @ObfuscatedName("client.qf")
    public static class228 field854 = new class228();

    @ObfuscatedName("client.qc")
    public static int field784 = -1;

    @ObfuscatedName("client.qz")
    public static int field855 = -1;

    @ObfuscatedName("client.qk")
    public static class5[] field857 = new class5[8];

    @ObfuscatedName("client.ro")
    public static class62 field739 = new class62();

    @ObfuscatedName("client.rq")
    public static int field860 = -1;

    @ObfuscatedName("client.rm")
    public static ArrayList field787 = new ArrayList(10);

    @ObfuscatedName("client.ri")
    public static int field862 = 0;

    @ObfuscatedName("client.rh")
    public static final class60 field863 = new class60();

    @ObfuscatedName("client.rw")
    public static int[] field681 = new int[50];

    @ObfuscatedName("client.rr")
    public static int[] field865 = new int[50];

    @ObfuscatedName("bj.ea(B)Llz;")
    public static class322 method1700() {
        return Statics.field988;
    }

    @ObfuscatedName("client.ab(I)V")
    public final void method780() {
    }

    public final void init() {
        if (!this.method758()) {
            return;
        }
        class280[] var1 = new class280[] { class280.field3605, class280.field3606, class280.field3609, class280.field3611, class280.field3600, class280.field3608, class280.field3613, class280.field3607, class280.field3612, class280.field3601, class280.field3598, class280.field3610, class280.field3604, class280.field3599, class280.field3602, class280.field3603 };
        class280[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class280 var4 = var2[var3];
            String var5 = this.getParameter(var4.field3614);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field3614)) {
                    case 1:
                        if (var5.equalsIgnoreCase(class75.field1075)) {
                            field629 = true;
                        } else {
                            field629 = false;
                        }
                    case 2:
                    case 3:
                    case 7:
                    default:
                        break;
                    case 4:
                        Statics.field522 = var5;
                        break;
                    case 5:
                        field597 = Integer.parseInt(var5);
                        break;
                    case 6:
                        Statics.field2266 = (class245) class178.method90(class245.method2879(), Integer.parseInt(var5));
                        if (Statics.field2266 == class245.field3159) {
                            Statics.field169 = class323.field3879;
                        } else {
                            Statics.field169 = class323.field3884;
                        }
                        break;
                    case 8:
                        field643 = Integer.parseInt(var5) != 0;
                        break;
                    case 9:
                        int var6 = Integer.parseInt(var5);
                        class244[] var7 = class244.method2916();
                        int var8 = 0;
                        class244 var10;
                        while (true) {
                            if (var8 >= var7.length) {
                                var10 = null;
                                break;
                            }
                            class244 var9 = var7[var8];
                            if (var9.field3150 == var6) {
                                var10 = var9;
                                break;
                            }
                            var8++;
                        }
                        Statics.field1043 = var10;
                        break;
                    case 10:
                        if (field601 == -1) {
                            field601 = Integer.parseInt(var5);
                        }
                        break;
                    case 11:
                        Statics.field232 = Integer.parseInt(var5);
                        break;
                    case 12:
                        if (var5.equalsIgnoreCase(class75.field1075)) {
                        }
                        break;
                    case 13:
                        field727 = Integer.parseInt(var5);
                        break;
                    case 14:
                        field600 = Integer.parseInt(var5);
                        break;
                    case 15:
                        field677 = Integer.parseInt(var5);
                        break;
                    case 16:
                        Statics.field358 = var5;
                }
            }
        }
        method2081();
        Statics.field2 = this.getCodeBase().getHost();
        String var11 = Statics.field1043.field3151;
        byte var12 = 0;
        try {
            Statics.field1991 = 17;
            Statics.field3766 = var12;
            try {
                Statics.field1876 = System.getProperty("os.name");
            } catch (Exception var51) {
                Statics.field1876 = "Unknown";
            }
            Statics.field1824 = Statics.field1876.toLowerCase();
            try {
                Statics.field1823 = System.getProperty("user.home");
                if (Statics.field1823 != null) {
                    Statics.field1823 = Statics.field1823 + "/";
                }
            } catch (Exception var50) {
            }
            try {
                if (Statics.field1824.startsWith("win")) {
                    if (Statics.field1823 == null) {
                        Statics.field1823 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field1823 == null) {
                    Statics.field1823 = System.getenv("HOME");
                }
                if (Statics.field1823 != null) {
                    Statics.field1823 = Statics.field1823 + "/";
                }
            } catch (Exception var49) {
            }
            if (Statics.field1823 == null) {
                Statics.field1823 = "~/";
            }
            Statics.field1982 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1823, "/tmp/", "" };
            Statics.field1996 = new String[] { ".jagex_cache_" + Statics.field3766, ".file_store_" + Statics.field3766 };
            int var16 = 0;
            label257: while (var16 < 4) {
                String var17 = var16 == 0 ? "" : "" + var16;
                Statics.field1985 = new File(Statics.field1823, "jagex_cl_oldschool_" + var11 + var17 + ".dat");
                String var18 = null;
                String var19 = null;
                boolean var20 = false;
                if (Statics.field1985.exists()) {
                    try {
                        class111 var21 = new class111(Statics.field1985, "rw", 10000L);
                        class183 var22 = new class183((int) var21.method2361());
                        while (var22.field2360 < var22.field2366.length) {
                            int var23 = var21.method2347(var22.field2366, var22.field2360, var22.field2366.length - var22.field2360);
                            if (var23 == -1) {
                                throw new IOException();
                            }
                            var22.field2360 += var23;
                        }
                        var22.field2360 = 0;
                        int var24 = var22.method3436();
                        if (var24 < 1 || var24 > 3) {
                            throw new IOException("" + var24);
                        }
                        int var25 = 0;
                        if (var24 > 1) {
                            var25 = var22.method3436();
                        }
                        if (var24 <= 2) {
                            var18 = var22.method3360();
                            if (var25 == 1) {
                                var19 = var22.method3360();
                            }
                        } else {
                            var18 = var22.method3265();
                            if (var25 == 1) {
                                var19 = var22.method3265();
                            }
                        }
                        var21.method2351();
                    } catch (IOException var53) {
                        var53.printStackTrace();
                    }
                    if (var18 != null) {
                        File var27 = new File(var18);
                        if (!var27.exists()) {
                            var18 = null;
                        }
                    }
                    if (var18 != null) {
                        File var28 = new File(var18, "test.dat");
                        if (!class156.method272(var28, true)) {
                            var18 = null;
                        }
                    }
                }
                if (var18 == null && var16 == 0) {
                    label232: for (int var29 = 0; var29 < Statics.field1996.length; var29++) {
                        for (int var30 = 0; var30 < Statics.field1982.length; var30++) {
                            File var31 = new File(Statics.field1982[var30] + Statics.field1996[var29] + File.separatorChar + "oldschool" + File.separatorChar);
                            if (var31.exists() && class156.method272(new File(var31, "test.dat"), true)) {
                                var18 = var31.toString();
                                var20 = true;
                                break label232;
                            }
                        }
                    }
                }
                if (var18 == null) {
                    var18 = Statics.field1823 + File.separatorChar + "jagexcache" + var17 + File.separatorChar + "oldschool" + File.separatorChar + var11 + File.separatorChar;
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
                    } catch (Exception var52) {
                        var52.printStackTrace();
                    }
                    var20 = true;
                }
                if (var20) {
                    class156.method1780(new File(var18), (File) null);
                }
                File var41 = new File(var18);
                Statics.field1986 = var41;
                if (!Statics.field1986.exists()) {
                    Statics.field1986.mkdirs();
                }
                File[] var42 = Statics.field1986.listFiles();
                if (var42 != null) {
                    File[] var43 = var42;
                    for (int var44 = 0; var44 < var43.length; var44++) {
                        File var45 = var43[var44];
                        if (!class156.method272(var45, false)) {
                            var16++;
                            continue label257;
                        }
                    }
                }
                break;
            }
            File var46 = Statics.field1986;
            Statics.field2001 = var46;
            if (!Statics.field2001.exists()) {
                throw new RuntimeException("");
            }
            class159.field2002 = true;
            class156.method5029();
            class156.field1990 = new class110(new class111(class159.method4090("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class156.field1994 = new class110(new class111(class159.method4090("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field1984 = new class110[Statics.field1991];
            for (int var47 = 0; var47 < Statics.field1991; var47++) {
                Statics.field1984[var47] = new class110(new class111(class159.method4090("main_file_cache.idx" + var47), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var54) {
            class153.method695((String) null, var54);
        }
        Statics.field322 = this;
        Statics.field1960 = field601;
        this.method756(765, 503, 170);
    }

    @ObfuscatedName("cc.fp(I)V")
    public static final void method2081() {
        class126.field1761 = false;
        field709 = false;
    }

    @ObfuscatedName("client.az(I)V")
    public final void method770() {
        class184.method2684(new int[] { 20, 260, 10000 }, new int[] { 1000, 100, 500 });
        Statics.field2112 = field597 == 0 ? 43594 : field677 + 40000;
        Statics.field102 = field597 == 0 ? 443 : field677 + 50000;
        Statics.field92 = Statics.field2112;
        Statics.field314 = class229.field2603;
        Statics.field2391 = class229.field2600;
        Statics.field1948 = class229.field2601;
        Statics.field1092 = class229.field2602;
        Statics.field553 = new class136();
        this.method882();
        this.method746();
        Statics.field2290 = this.method747();
        Statics.field969 = new class163(255, class156.field1990, class156.field1994, 500000);
        class111 var1 = null;
        class67 var2 = new class67();
        try {
            var1 = class156.method4229("", Statics.field2266.field3161, false);
            byte[] var3 = new byte[(int) var1.method2361()];
            int var5;
            for (int var4 = 0; var4 < var3.length; var4 += var5) {
                var5 = var1.method2347(var3, var4, var3.length - var4);
                if (var5 == -1) {
                    throw new IOException();
                }
            }
            var2 = new class67(new class183(var3));
        } catch (Exception var12) {
        }
        try {
            if (var1 != null) {
                var1.method2351();
            }
        } catch (Exception var11) {
        }
        Statics.field469 = var2;
        this.method748();
        String var10 = Statics.field1556;
        class46.field375 = this;
        if (var10 != null) {
            class46.field369 = var10;
        }
        if (field597 != 0) {
            field611 = true;
        }
        method3164(Statics.field469.field980);
        Statics.field1454 = new class68(Statics.field169);
    }

    @ObfuscatedName("client.ao(I)V")
    public final void method771() {
        field680++;
        this.method1103();
        while (true) {
            class206 var1 = class249.field3197;
            class246 var2;
            synchronized (class249.field3197) {
                var2 = (class246) class249.field3194.method3793();
            }
            if (var2 == null) {
                class218.method3224();
                method4564();
                class40 var4 = class40.field351;
                synchronized (class40.field351) {
                    class40.field332++;
                    class40.field343 = class40.field349;
                    class40.field348 = 0;
                    if (class40.field350 >= 0) {
                        while (class40.field350 != class40.field344) {
                            int var6 = class40.field342[class40.field344];
                            class40.field344 = class40.field344 + 1 & 0x7F;
                            if (var6 < 0) {
                                class40.field341[~var6] = false;
                            } else {
                                if (!class40.field341[var6] && class40.field348 < class40.field347.length - 1) {
                                    class40.field347[++class40.field348 - 1] = var6;
                                }
                                class40.field341[var6] = true;
                            }
                        }
                    } else {
                        for (int var5 = 0; var5 < 112; var5++) {
                            class40.field341[var5] = false;
                        }
                        class40.field350 = class40.field344;
                    }
                    if (class40.field348 > 0) {
                        class40.field332 = 0;
                    }
                    class40.field349 = class40.field356;
                }
                class49 var8 = class49.field420;
                synchronized (class49.field420) {
                    class49.field425 = class49.field421;
                    class49.field426 = class49.field422;
                    class49.field418 = class49.field424;
                    class49.field432 = class49.field428;
                    class49.field433 = class49.field429;
                    class49.field438 = class49.field434;
                    class49.field435 = class49.field431;
                    class49.field428 = 0;
                }
                if (Statics.field2290 != null) {
                    int var10 = Statics.field2290.method636();
                    field789 = var10;
                }
                if (field612 == 0) {
                    method693();
                    class48.method2366();
                } else if (field612 == 5) {
                    class79.method728(this);
                    method693();
                    class48.method2366();
                } else if (field612 == 10 || field612 == 11) {
                    class79.method728(this);
                } else if (field612 == 20) {
                    class79.method728(this);
                    this.method1106();
                } else if (field612 == 25) {
                    method981(false);
                    field793 = 0;
                    boolean var11 = true;
                    for (int var12 = 0; var12 < Statics.field59.length; var12++) {
                        if (Statics.field1902[var12] != -1 && Statics.field59[var12] == null) {
                            Statics.field59[var12] = Statics.field2797.method4250(Statics.field1902[var12], 0);
                            if (Statics.field59[var12] == null) {
                                var11 = false;
                                field793++;
                            }
                        }
                        if (Statics.field485[var12] != -1 && Statics.field1476[var12] == null) {
                            Statics.field1476[var12] = Statics.field2797.method4251(Statics.field485[var12], 0, Statics.field405[var12]);
                            if (Statics.field1476[var12] == null) {
                                var11 = false;
                                field793++;
                            }
                        }
                    }
                    if (var11) {
                        field648 = 0;
                        boolean var13 = true;
                        for (int var14 = 0; var14 < Statics.field59.length; var14++) {
                            byte[] var15 = Statics.field1476[var14];
                            if (var15 != null) {
                                int var16 = (Statics.field593[var14] >> 8) * 64 - Statics.field2316;
                                int var17 = (Statics.field593[var14] & 0xFF) * 64 - Statics.field1052;
                                if (field647) {
                                    var16 = 10;
                                    var17 = 10;
                                }
                                var13 &= class51.method531(var15, var16, var17);
                            }
                        }
                        if (var13) {
                            if (field650 != 0) {
                                method188(class238.field2918 + class75.field1074 + class75.field1072 + 100 + "%" + class75.field1073, true);
                            }
                            method4564();
                            Statics.field524.method2688();
                            for (int var18 = 0; var18 < 4; var18++) {
                                field667[var18].method3110();
                            }
                            for (int var19 = 0; var19 < 4; var19++) {
                                for (int var20 = 0; var20 < 104; var20++) {
                                    for (int var21 = 0; var21 < 104; var21++) {
                                        class51.field446[var19][var20][var21] = 0;
                                    }
                                }
                            }
                            method4564();
                            class51.method3184();
                            int var22 = Statics.field59.length;
                            class69.method1035();
                            method981(true);
                            if (!field647) {
                                int var23 = 0;
                                label640: while (true) {
                                    if (var23 >= var22) {
                                        for (int var37 = 0; var37 < var22; var37++) {
                                            int var38 = (Statics.field593[var37] >> 8) * 64 - Statics.field2316;
                                            int var39 = (Statics.field593[var37] & 0xFF) * 64 - Statics.field1052;
                                            byte[] var40 = Statics.field59[var37];
                                            if (var40 == null && Statics.field496 < 800) {
                                                method4564();
                                                class51.method1485(var38, var39, 64, 64);
                                            }
                                        }
                                        method981(true);
                                        int var41 = 0;
                                        while (true) {
                                            if (var41 >= var22) {
                                                break label640;
                                            }
                                            byte[] var42 = Statics.field1476[var41];
                                            if (var42 != null) {
                                                int var43 = (Statics.field593[var41] >> 8) * 64 - Statics.field2316;
                                                int var44 = (Statics.field593[var41] & 0xFF) * 64 - Statics.field1052;
                                                method4564();
                                                class126 var45 = Statics.field524;
                                                class165[] var46 = field667;
                                                class183 var47 = new class183(var42);
                                                int var48 = -1;
                                                while (true) {
                                                    int var49 = var47.method3277();
                                                    if (var49 == 0) {
                                                        break;
                                                    }
                                                    var48 += var49;
                                                    int var50 = 0;
                                                    while (true) {
                                                        int var51 = var47.method3293();
                                                        if (var51 == 0) {
                                                            break;
                                                        }
                                                        var50 += var51 - 1;
                                                        int var52 = var50 & 0x3F;
                                                        int var53 = var50 >> 6 & 0x3F;
                                                        int var54 = var50 >> 12;
                                                        int var55 = var47.method3436();
                                                        int var56 = var55 >> 2;
                                                        int var57 = var55 & 0x3;
                                                        int var58 = var43 + var53;
                                                        int var59 = var44 + var52;
                                                        if (var58 > 0 && var59 > 0 && var58 < 103 && var59 < 103) {
                                                            int var60 = var54;
                                                            if ((class51.field446[1][var58][var59] & 0x2) == 2) {
                                                                var60 = var54 - 1;
                                                            }
                                                            class165 var61 = null;
                                                            if (var60 >= 0) {
                                                                var61 = var46[var60];
                                                            }
                                                            class51.method3586(var54, var58, var59, var48, var57, var56, var45, var61);
                                                        }
                                                    }
                                                }
                                            }
                                            var41++;
                                        }
                                    }
                                    int var24 = (Statics.field593[var23] >> 8) * 64 - Statics.field2316;
                                    int var25 = (Statics.field593[var23] & 0xFF) * 64 - Statics.field1052;
                                    byte[] var26 = Statics.field59[var23];
                                    if (var26 != null) {
                                        method4564();
                                        int var27 = Statics.field83 * 8 - 48;
                                        int var28 = Statics.field496 * 8 - 48;
                                        class165[] var29 = field667;
                                        int var30 = 0;
                                        label637: while (true) {
                                            if (var30 >= 4) {
                                                class183 var33 = new class183(var26);
                                                int var34 = 0;
                                                while (true) {
                                                    if (var34 >= 4) {
                                                        break label637;
                                                    }
                                                    for (int var35 = 0; var35 < 64; var35++) {
                                                        for (int var36 = 0; var36 < 64; var36++) {
                                                            class51.method677(var33, var34, var24 + var35, var25 + var36, var27, var28, 0);
                                                        }
                                                    }
                                                    var34++;
                                                }
                                            }
                                            for (int var31 = 0; var31 < 64; var31++) {
                                                for (int var32 = 0; var32 < 64; var32++) {
                                                    if (var24 + var31 > 0 && var24 + var31 < 103 && var25 + var32 > 0 && var25 + var32 < 103) {
                                                        var29[var30].field2056[var24 + var31][var25 + var32] &= 0xFEFFFFFF;
                                                    }
                                                }
                                            }
                                            var30++;
                                        }
                                    }
                                    var23++;
                                }
                            }
                            if (field647) {
                                int var62 = 0;
                                label573: while (true) {
                                    if (var62 >= 4) {
                                        for (int var101 = 0; var101 < 13; var101++) {
                                            for (int var102 = 0; var102 < 13; var102++) {
                                                int var103 = field653[0][var101][var102];
                                                if (var103 == -1) {
                                                    class51.method1485(var101 * 8, var102 * 8, 8, 8);
                                                }
                                            }
                                        }
                                        method981(true);
                                        int var104 = 0;
                                        while (true) {
                                            if (var104 >= 4) {
                                                break label573;
                                            }
                                            method4564();
                                            for (int var105 = 0; var105 < 13; var105++) {
                                                label462: for (int var106 = 0; var106 < 13; var106++) {
                                                    int var107 = field653[var104][var105][var106];
                                                    if (var107 != -1) {
                                                        int var108 = var107 >> 24 & 0x3;
                                                        int var109 = var107 >> 1 & 0x3;
                                                        int var110 = var107 >> 14 & 0x3FF;
                                                        int var111 = var107 >> 3 & 0x7FF;
                                                        int var112 = (var110 / 8 << 8) + var111 / 8;
                                                        for (int var113 = 0; var113 < Statics.field593.length; var113++) {
                                                            if (Statics.field593[var113] == var112 && Statics.field1476[var113] != null) {
                                                                byte[] var114 = Statics.field1476[var113];
                                                                int var115 = var105 * 8;
                                                                int var116 = var106 * 8;
                                                                int var117 = (var110 & 0x7) * 8;
                                                                int var118 = (var111 & 0x7) * 8;
                                                                class126 var119 = Statics.field524;
                                                                class165[] var120 = field667;
                                                                class183 var121 = new class183(var114);
                                                                int var122 = -1;
                                                                while (true) {
                                                                    int var123 = var121.method3277();
                                                                    if (var123 == 0) {
                                                                        continue label462;
                                                                    }
                                                                    var122 += var123;
                                                                    int var124 = 0;
                                                                    while (true) {
                                                                        int var125 = var121.method3293();
                                                                        if (var125 == 0) {
                                                                            break;
                                                                        }
                                                                        var124 += var125 - 1;
                                                                        int var126 = var124 & 0x3F;
                                                                        int var127 = var124 >> 6 & 0x3F;
                                                                        int var128 = var124 >> 12;
                                                                        int var129 = var121.method3436();
                                                                        int var130 = var129 >> 2;
                                                                        int var131 = var129 & 0x3;
                                                                        if (var108 == var128 && var127 >= var117 && var127 < var117 + 8 && var126 >= var118 && var126 < var118 + 8) {
                                                                            class269 var132 = class269.method675(var122);
                                                                            int var134 = var127 & 0x7;
                                                                            int var135 = var126 & 0x7;
                                                                            int var137 = var132.field3405;
                                                                            int var138 = var132.field3421;
                                                                            if ((var131 & 0x1) == 1) {
                                                                                int var139 = var137;
                                                                                var137 = var138;
                                                                                var138 = var139;
                                                                            }
                                                                            int var140 = var109 & 0x3;
                                                                            int var141;
                                                                            if (var140 == 0) {
                                                                                var141 = var134;
                                                                            } else if (var140 == 1) {
                                                                                var141 = var135;
                                                                            } else if (var140 == 2) {
                                                                                var141 = 7 - var134 - (var137 - 1);
                                                                            } else {
                                                                                var141 = 7 - var135 - (var138 - 1);
                                                                            }
                                                                            int var142 = var115 + var141;
                                                                            int var143 = var116 + class230.method57(var127 & 0x7, var126 & 0x7, var109, var132.field3405, var132.field3421, var131);
                                                                            if (var142 > 0 && var143 > 0 && var142 < 103 && var143 < 103) {
                                                                                int var144 = var104;
                                                                                if ((class51.field446[1][var142][var143] & 0x2) == 2) {
                                                                                    var144 = var104 - 1;
                                                                                }
                                                                                class165 var145 = null;
                                                                                if (var144 >= 0) {
                                                                                    var145 = var120[var144];
                                                                                }
                                                                                class51.method3586(var104, var142, var143, var122, var109 + var131 & 0x3, var130, var119, var145);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            var104++;
                                        }
                                    }
                                    method4564();
                                    for (int var63 = 0; var63 < 13; var63++) {
                                        for (int var64 = 0; var64 < 13; var64++) {
                                            boolean var65 = false;
                                            int var66 = field653[var62][var63][var64];
                                            if (var66 != -1) {
                                                int var67 = var66 >> 24 & 0x3;
                                                int var68 = var66 >> 1 & 0x3;
                                                int var69 = var66 >> 14 & 0x3FF;
                                                int var70 = var66 >> 3 & 0x7FF;
                                                int var71 = (var69 / 8 << 8) + var70 / 8;
                                                for (int var72 = 0; var72 < Statics.field593.length; var72++) {
                                                    if (Statics.field593[var72] == var71 && Statics.field59[var72] != null) {
                                                        byte[] var73 = Statics.field59[var72];
                                                        int var74 = var63 * 8;
                                                        int var75 = var64 * 8;
                                                        int var76 = (var69 & 0x7) * 8;
                                                        int var77 = (var70 & 0x7) * 8;
                                                        class165[] var78 = field667;
                                                        for (int var79 = 0; var79 < 8; var79++) {
                                                            for (int var80 = 0; var80 < 8; var80++) {
                                                                if (var74 + var79 > 0 && var74 + var79 < 103 && var75 + var80 > 0 && var75 + var80 < 103) {
                                                                    var78[var62].field2056[var74 + var79][var75 + var80] &= 0xFEFFFFFF;
                                                                }
                                                            }
                                                        }
                                                        class183 var81 = new class183(var73);
                                                        for (int var82 = 0; var82 < 4; var82++) {
                                                            for (int var83 = 0; var83 < 64; var83++) {
                                                                for (int var84 = 0; var84 < 64; var84++) {
                                                                    if (var67 == var82 && var83 >= var76 && var83 < var76 + 8 && var84 >= var77 && var84 < var77 + 8) {
                                                                        int var87 = var74 + class230.method2340(var83 & 0x7, var84 & 0x7, var68);
                                                                        int var89 = var83 & 0x7;
                                                                        int var90 = var84 & 0x7;
                                                                        int var92 = var68 & 0x3;
                                                                        int var93;
                                                                        if (var92 == 0) {
                                                                            var93 = var90;
                                                                        } else if (var92 == 1) {
                                                                            var93 = 7 - var89;
                                                                        } else if (var92 == 2) {
                                                                            var93 = 7 - var90;
                                                                        } else {
                                                                            var93 = var89;
                                                                        }
                                                                        class51.method677(var81, var62, var87, var75 + var93, 0, 0, var68);
                                                                    } else {
                                                                        class51.method677(var81, 0, -1, -1, 0, 0, 0);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        var65 = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            if (!var65) {
                                                int var94 = var62;
                                                int var95 = var63 * 8;
                                                int var96 = var64 * 8;
                                                for (int var97 = 0; var97 < 8; var97++) {
                                                    for (int var98 = 0; var98 < 8; var98++) {
                                                        class51.field448[var94][var95 + var97][var96 + var98] = 0;
                                                    }
                                                }
                                                if (var95 > 0) {
                                                    for (int var99 = 1; var99 < 8; var99++) {
                                                        class51.field448[var94][var95][var96 + var99] = class51.field448[var94][var95 - 1][var96 + var99];
                                                    }
                                                }
                                                if (var96 > 0) {
                                                    for (int var100 = 1; var100 < 8; var100++) {
                                                        class51.field448[var94][var95 + var100][var96] = class51.field448[var94][var95 + var100][var96 - 1];
                                                    }
                                                }
                                                if (var95 > 0 && class51.field448[var94][var95 - 1][var96] != 0) {
                                                    class51.field448[var94][var95][var96] = class51.field448[var94][var95 - 1][var96];
                                                } else if (var96 > 0 && class51.field448[var94][var95][var96 - 1] != 0) {
                                                    class51.field448[var94][var95][var96] = class51.field448[var94][var95][var96 - 1];
                                                } else if (var95 > 0 && var96 > 0 && class51.field448[var94][var95 - 1][var96 - 1] != 0) {
                                                    class51.field448[var94][var95][var96] = class51.field448[var94][var95 - 1][var96 - 1];
                                                }
                                            }
                                        }
                                    }
                                    var62++;
                                }
                            }
                            method981(true);
                            method4564();
                            class51.method435(Statics.field524, field667);
                            method981(true);
                            int var146 = class51.field447;
                            if (var146 > Statics.field2416) {
                                var146 = Statics.field2416;
                            }
                            if (var146 < Statics.field2416 - 1) {
                                int var147 = Statics.field2416 - 1;
                            }
                            if (field709) {
                                Statics.field524.method2689(class51.field447);
                            } else {
                                Statics.field524.method2689(0);
                            }
                            for (int var148 = 0; var148 < 104; var148++) {
                                for (int var149 = 0; var149 < 104; var149++) {
                                    method3166(var148, var149);
                                }
                            }
                            method4564();
                            Statics.method620();
                            class269.field3427.method3708();
                            if (Statics.field322.method888()) {
                                class173 var150 = class173.method2882(class170.field2166, field740.field1251);
                                var150.field2280.method3249(1057001181);
                                field740.method1873(var150);
                            }
                            if (!field647) {
                                int var151 = (Statics.field83 - 6) / 8;
                                int var152 = (Statics.field83 + 6) / 8;
                                int var153 = (Statics.field496 - 6) / 8;
                                int var154 = (Statics.field496 + 6) / 8;
                                for (int var155 = var151 - 1; var155 <= var152 + 1; var155++) {
                                    for (int var156 = var153 - 1; var156 <= var154 + 1; var156++) {
                                        if (var155 < var151 || var155 > var152 || var156 < var153 || var156 > var154) {
                                            Statics.field2797.method4274("m" + var155 + "_" + var156);
                                            Statics.field2797.method4274("l" + var155 + "_" + var156);
                                        }
                                    }
                                }
                            }
                            Statics.method2138(30);
                            method4564();
                            class51.method3168();
                            class173 var157 = class173.method2882(class170.field2241, field740.field1251);
                            field740.method1873(var157);
                            class48.method2366();
                        } else {
                            field650 = 2;
                        }
                    } else {
                        field650 = 1;
                    }
                }
                if (field612 == 30) {
                    this.method1107();
                } else if (field612 == 40 || field612 == 45) {
                    this.method1106();
                }
                return;
            }
            var2.field3163.method4381(var2.field3165, (int) var2.field2450, var2.field3166, false);
        }
    }

    @ObfuscatedName("client.ap(ZI)V")
    public final void method772(boolean arg0) {
        boolean var2 = class218.method1();
        if (var2 && field826 && Statics.field12 != null) {
            Statics.field12.method2079();
        }
        if ((field612 == 10 || field612 == 20 || field612 == 30) && field804 != 0L && class185.method3151() > field804) {
            int var3 = field676 ? 2 : 1;
            field804 = 0L;
            if (var3 >= 2) {
                field676 = true;
            } else {
                field676 = false;
            }
            int var4 = field676 ? 2 : 1;
            if (var4 == 1) {
                Statics.field322.method805(765, 503);
            } else {
                Statics.field322.method805(7680, 2160);
            }
            if (field612 >= 25) {
                class173 var5 = class173.method2882(class170.field2207, field740.field1251);
                class190 var6 = var5.field2280;
                int var7 = field676 ? 2 : 1;
                var6.method3246(var7);
                var5.field2280.method3296(Statics.field71);
                var5.field2280.method3296(Statics.field327);
                field740.method1873(var5);
            }
        }
        if (arg0) {
            for (int var8 = 0; var8 < 100; var8++) {
                field796[var8] = true;
            }
        }
        if (field612 == 0) {
            this.method807(class79.field1121, class79.field1122, arg0);
        } else if (field612 == 5) {
            class79.method529(Statics.field500, Statics.field2265, Statics.field525, arg0);
        } else if (field612 == 10 || field612 == 11) {
            class79.method529(Statics.field500, Statics.field2265, Statics.field525, arg0);
        } else if (field612 == 20) {
            class79.method529(Statics.field500, Statics.field2265, Statics.field525, arg0);
        } else if (field612 == 25) {
            if (field650 == 1) {
                if (field793 > field698) {
                    field698 = field793;
                }
                int var9 = (field698 * 50 - field793 * 50) / field698;
                method188(class238.field2918 + class75.field1074 + class75.field1072 + var9 + "%" + class75.field1073, false);
            } else if (field650 == 2) {
                if (field648 > field649) {
                    field649 = field648;
                }
                int var10 = (field649 * 50 - field648 * 50) / field649 + 50;
                method188(class238.field2918 + class75.field1074 + class75.field1072 + var10 + "%" + class75.field1073, false);
            } else {
                method188(class238.field2918, false);
            }
        } else if (field612 == 30) {
            this.method1162();
        } else if (field612 == 40) {
            method188(class238.field2825 + class75.field1074 + class238.field2826, false);
        } else if (field612 == 45) {
            method188(class238.field2973, false);
        }
        if (field612 == 30 && field803 == 0 && !arg0 && !field676) {
            for (int var11 = 0; var11 < field794; var11++) {
                if (field797[var11]) {
                    Statics.field456.method732(field799[var11], field800[var11], field801[var11], field605[var11]);
                    field797[var11] = false;
                }
            }
        } else if (field612 > 0) {
            Statics.field456.method731(0, 0);
            for (int var12 = 0; var12 < field794; var12++) {
                field797[var12] = false;
            }
        }
    }

    @ObfuscatedName("client.af(I)V")
    public final void method773() {
        if (Statics.field3145.method1785()) {
            Statics.field3145.method1790();
        }
        if (Statics.field3283 != null) {
            Statics.field3283.field532 = false;
        }
        Statics.field3283 = null;
        field740.method1877();
        if (class40.field351 != null) {
            class40 var1 = class40.field351;
            synchronized (class40.field351) {
                class40.field351 = null;
            }
        }
        if (class49.field420 != null) {
            class49 var3 = class49.field420;
            synchronized (class49.field420) {
                class49.field420 = null;
            }
        }
        Statics.field2290 = null;
        if (Statics.field12 != null) {
            Statics.field12.method2044();
        }
        if (Statics.field2412 != null) {
            Statics.field2412.method2044();
        }
        if (Statics.field3218 != null) {
            Statics.field3218.method3043();
        }
        Object var5 = class249.field3195;
        synchronized (class249.field3195) {
            if (class249.field3192 != 0) {
                class249.field3192 = 1;
                try {
                    class249.field3195.wait();
                } catch (InterruptedException var8) {
                }
            }
        }
        if (Statics.field553 != null) {
            Statics.field553.method2887();
            Statics.field553 = null;
        }
        class156.method1722();
    }

    @ObfuscatedName("client.fz(I)V")
    public void method1103() {
        if (field612 != 1000) {
            boolean var1 = Statics.method2908();
            if (!var1) {
                this.method1104();
            }
        }
    }

    @ObfuscatedName("client.fo(I)V")
    public void method1104() {
        if (class251.field3227 >= 4) {
            this.method776("js5crc");
            field612 = 1000;
            return;
        }
        if (class251.field3228 >= 4) {
            if (field612 <= 5) {
                this.method776("js5io");
                field612 = 1000;
                return;
            }
            field626 = 3000;
            class251.field3228 = 3;
        }
        if (--field626 + 1 > 0) {
            return;
        }
        try {
            if (field625 == 0) {
                Statics.field95 = Statics.field410.method3004(Statics.field2, Statics.field92);
                field625++;
            }
            if (field625 == 1) {
                if (Statics.field95.field1967 == 2) {
                    this.method1105(-1);
                    return;
                }
                if (Statics.field95.field1967 == 1) {
                    field625++;
                }
            }
            if (field625 == 2) {
                if (field643) {
                    Statics.field624 = class158.method155((Socket) Statics.field95.field1971, 40000, 5000);
                } else {
                    Statics.field624 = new class162((Socket) Statics.field95.field1971, Statics.field410, 5000);
                }
                class183 var1 = new class183(5);
                var1.method3246(15);
                var1.method3249(170);
                Statics.field624.method3042(var1.field2366, 0, 5);
                field625++;
                Statics.field363 = class185.method3151();
            }
            if (field625 == 3) {
                if (Statics.field624.method3037() > 0 || !field643 && field612 <= 5) {
                    int var2 = Statics.field624.method3040();
                    if (var2 != 0) {
                        this.method1105(var2);
                        return;
                    }
                    field625++;
                } else if (class185.method3151() - Statics.field363 > 30000L) {
                    this.method1105(-2);
                    return;
                }
            }
            if (field625 == 4) {
                class158 var3 = Statics.field624;
                boolean var4 = field612 > 20;
                if (Statics.field3218 != null) {
                    try {
                        Statics.field3218.method3043();
                    } catch (Exception var14) {
                    }
                    Statics.field3218 = null;
                }
                Statics.field3218 = var3;
                class251.method140(var4);
                class251.field3209.field2360 = 0;
                Statics.field3817 = null;
                Statics.field2772 = null;
                class251.field3222 = 0;
                while (true) {
                    class247 var6 = (class247) class251.field3214.method3739();
                    if (var6 == null) {
                        while (true) {
                            class247 var7 = (class247) class251.field3223.method3739();
                            if (var7 == null) {
                                if (class251.field3226 != 0) {
                                    try {
                                        class183 var8 = new class183(4);
                                        var8.method3246(4);
                                        var8.method3246(class251.field3226);
                                        var8.method3296(0);
                                        Statics.field3218.method3042(var8.field2366, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field3218.method3043();
                                        } catch (Exception var12) {
                                        }
                                        class251.field3228++;
                                        Statics.field3218 = null;
                                    }
                                }
                                class251.field3210 = 0;
                                Statics.field3224 = class185.method3151();
                                Statics.field95 = null;
                                Statics.field624 = null;
                                field625 = 0;
                                field596 = 0;
                                return;
                            }
                            class251.field3216.method3649(var7);
                            class251.field3217.method3747(var7, var7.field2450);
                            class251.field3220++;
                            class251.field3211--;
                        }
                    }
                    class251.field3212.method3747(var6, var6.field2450);
                    class251.field3213++;
                    class251.field3215--;
                }
            }
        } catch (IOException var15) {
            this.method1105(-3);
        }
    }

    @ObfuscatedName("client.fg(II)V")
    public void method1105(int arg0) {
        Statics.field95 = null;
        Statics.field624 = null;
        field625 = 0;
        if (Statics.field92 == Statics.field2112) {
            Statics.field92 = Statics.field102;
        } else {
            Statics.field92 = Statics.field2112;
        }
        field596++;
        if (field596 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field612 <= 5) {
                this.method776("js5connect_full");
                field612 = 1000;
            } else {
                field626 = 3000;
            }
        } else if (field596 >= 2 && arg0 == 6) {
            this.method776("js5connect_outofdate");
            field612 = 1000;
        } else if (field596 >= 4) {
            if (field612 <= 5) {
                this.method776("js5connect");
                field612 = 1000;
            } else {
                field626 = 3000;
            }
        }
    }

    @ObfuscatedName("aj.fh(Lic;Ljava/lang/String;B)V")
    public static void method684(class250 arg0, String arg1) {
        class53 var2 = new class53(arg0, arg1);
        field787.add(var2);
    }

    @ObfuscatedName("aj.ff(I)V")
    public static void method693() {
        if (field824 == 0) {
            Statics.field524 = new class126(4, 104, 104, class51.field448);
            for (int var0 = 0; var0 < 4; var0++) {
                field667[var0] = new class165(104, 104);
            }
            Statics.field3634 = new class319(512, 512);
            class79.field1122 = class238.field2967;
            class79.field1121 = 5;
            field824 = 20;
        } else if (field824 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class123.field1703[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class126.method2723(var1, 500, 800, 512, 334);
            class79.field1122 = class238.field2828;
            class79.field1121 = 10;
            field824 = 30;
        } else if (field824 == 30) {
            Statics.field3162 = method439(0, false, true, true);
            Statics.field627 = method439(1, false, true, true);
            Statics.field63 = method439(2, true, false, true);
            Statics.field170 = method439(3, false, true, true);
            Statics.field1460 = method439(4, false, true, true);
            Statics.field2797 = method439(5, true, true, true);
            Statics.field437 = method439(6, true, true, true);
            Statics.field2478 = method439(7, false, true, true);
            Statics.field554 = method439(8, false, true, true);
            Statics.field2375 = method439(9, false, true, true);
            Statics.field197 = method439(10, false, true, true);
            Statics.field509 = method439(11, false, true, true);
            Statics.field22 = method439(12, false, true, true);
            Statics.field25 = method439(13, true, false, true);
            Statics.field78 = method439(14, false, true, true);
            Statics.field41 = method439(15, false, true, true);
            Statics.field436 = method439(16, true, true, true);
            class79.field1122 = class238.field2829;
            class79.field1121 = 20;
            field824 = 40;
        } else if (field824 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field3162.method4363() * 4 / 100;
            int var8 = var7 + Statics.field627.method4363() * 4 / 100;
            int var9 = var8 + Statics.field63.method4363() * 2 / 100;
            int var10 = var9 + Statics.field170.method4363() * 2 / 100;
            int var11 = var10 + Statics.field1460.method4363() * 6 / 100;
            int var12 = var11 + Statics.field2797.method4363() * 4 / 100;
            int var13 = var12 + Statics.field437.method4363() * 2 / 100;
            int var14 = var13 + Statics.field2478.method4363() * 58 / 100;
            int var15 = var14 + Statics.field554.method4363() * 2 / 100;
            int var16 = var15 + Statics.field2375.method4363() * 2 / 100;
            int var17 = var16 + Statics.field197.method4363() * 2 / 100;
            int var18 = var17 + Statics.field509.method4363() * 2 / 100;
            int var19 = var18 + Statics.field22.method4363() * 2 / 100;
            int var20 = var19 + Statics.field25.method4363() * 2 / 100;
            int var21 = var20 + Statics.field78.method4363() * 2 / 100;
            int var22 = var21 + Statics.field41.method4363() * 2 / 100;
            int var23 = var22 + Statics.field436.method4363() * 2 / 100;
            if (var23 == 100) {
                method684(Statics.field3162, "Animations");
                method684(Statics.field627, "Skeletons");
                method684(Statics.field1460, "Sound FX");
                method684(Statics.field2797, "Maps");
                method684(Statics.field437, "Music Tracks");
                method684(Statics.field2478, "Models");
                method684(Statics.field554, "Sprites");
                method684(Statics.field509, "Music Jingles");
                method684(Statics.field78, "Music Samples");
                method684(Statics.field41, "Music Patches");
                method684(Statics.field436, "World Map");
                class79.field1122 = class238.field2831;
                class79.field1121 = 30;
                field824 = 45;
            } else {
                if (var23 != 0) {
                    class79.field1122 = class238.field2830 + var23 + "%";
                }
                class79.field1121 = 30;
            }
        } else if (field824 == 45) {
            class96.method3522(22050, !field709, 2);
            class219 var24 = new class219();
            var24.method3902(9, 128);
            Statics.field12 = class96.method3512(Statics.field410, 0, 22050);
            Statics.field12.method2057(var24);
            class250 var25 = Statics.field41;
            class250 var26 = Statics.field78;
            class250 var27 = Statics.field1460;
            Statics.field2485 = var25;
            Statics.field2483 = var26;
            Statics.field2491 = var27;
            Statics.field2486 = var24;
            Statics.field2412 = class96.method3512(Statics.field410, 1, 2048);
            Statics.field1907 = new class89();
            Statics.field2412.method2057(Statics.field1907);
            Statics.field3167 = new class103(22050, Statics.field1331);
            class79.field1122 = class238.field2893;
            class79.field1121 = 35;
            field824 = 50;
            Statics.field2057 = new class297(Statics.field554, Statics.field25);
        } else if (field824 == 50) {
            class296[] var28 = new class296[] { class296.field3682, class296.field3683, class296.field3681, class296.field3686, class296.field3684, class296.field3685 };
            int var29 = var28.length;
            class297 var30 = Statics.field2057;
            class296[] var31 = new class296[] { class296.field3682, class296.field3683, class296.field3681, class296.field3686, class296.field3684, class296.field3685 };
            field645 = var30.method5095(var31);
            if (field645.size() < var29) {
                class79.field1122 = class238.field2899 + field645.size() * 100 / var29 + "%";
                class79.field1121 = 40;
            } else {
                Statics.field2265 = (class299) field645.get(class296.field3681);
                Statics.field525 = (class299) field645.get(class296.field3682);
                Statics.field500 = (class299) field645.get(class296.field3686);
                Statics.field1101 = new class325(true);
                class79.field1122 = class238.field2843;
                class79.field1121 = 40;
                field824 = 60;
            }
        } else if (field824 == 60) {
            class250 var32 = Statics.field197;
            class250 var33 = Statics.field554;
            int var34 = 0;
            if (var32.method4312("title.jpg", "")) {
                var34++;
            }
            if (var33.method4312("logo", "")) {
                var34++;
            }
            if (var33.method4312("logo_deadman_mode", "")) {
                var34++;
            }
            if (var33.method4312("titlebox", "")) {
                var34++;
            }
            if (var33.method4312("titlebutton", "")) {
                var34++;
            }
            if (var33.method4312("runes", "")) {
                var34++;
            }
            if (var33.method4312("title_mute", "")) {
                var34++;
            }
            if (var33.method4312("options_radio_buttons,0", "")) {
                var34++;
            }
            if (var33.method4312("options_radio_buttons,2", "")) {
                var34++;
            }
            if (var33.method4312("options_radio_buttons,4", "")) {
                var34++;
            }
            if (var33.method4312("options_radio_buttons,6", "")) {
                var34++;
            }
            var33.method4312("sl_back", "");
            var33.method4312("sl_flags", "");
            var33.method4312("sl_arrows", "");
            var33.method4312("sl_stars", "");
            var33.method4312("sl_button", "");
            byte var37 = 11;
            if (var34 < var37) {
                class79.field1122 = class238.field2835 + var34 * 100 / var37 + "%";
                class79.field1121 = 50;
            } else {
                class79.field1122 = class238.field2839;
                class79.field1121 = 50;
                Statics.method2138(5);
                field824 = 70;
            }
        } else if (field824 == 70) {
            if (Statics.field63.method4255()) {
                class250 var39 = Statics.field63;
                Statics.field3540 = var39;
                class260.method4473(Statics.field63);
                class261.method1845(Statics.field63, Statics.field2478);
                class269.method4537(Statics.field63, Statics.field2478, field709);
                class250 var40 = Statics.field63;
                class250 var41 = Statics.field2478;
                Statics.field3533 = var40;
                Statics.field3523 = var41;
                class266.method5317(Statics.field63);
                class250 var42 = Statics.field63;
                class250 var43 = Statics.field2478;
                boolean var44 = field629;
                class299 var45 = Statics.field2265;
                Statics.field3444 = var42;
                Statics.field3282 = var43;
                Statics.field32 = var44;
                Statics.field444 = Statics.field3444.method4262(10);
                Statics.field2037 = var45;
                class250 var46 = Statics.field63;
                class250 var47 = Statics.field3162;
                class250 var48 = Statics.field627;
                Statics.field3549 = var46;
                Statics.field3550 = var47;
                Statics.field3551 = var48;
                class259.method1463(Statics.field63, Statics.field2478);
                class264.method1861(Statics.field63);
                class250 var49 = Statics.field63;
                Statics.field3255 = var49;
                Statics.field3252 = Statics.field3255.method4262(16);
                Statics.method3065(Statics.field170, Statics.field2478, Statics.field554, Statics.field25);
                class250 var50 = Statics.field63;
                Statics.field3248 = var50;
                class267.method125(Statics.field63);
                class250 var51 = Statics.field63;
                Statics.field3279 = var51;
                class250 var52 = Statics.field63;
                Statics.field3284 = var52;
                class265.method4465(Statics.field63);
                Statics.field3145 = new class83();
                class268.method1782(Statics.field63, Statics.field554, Statics.field25);
                class250 var53 = Statics.field63;
                class250 var54 = Statics.field554;
                Statics.field3330 = var53;
                Statics.field3323 = var54;
                class250 var55 = Statics.field63;
                class250 var56 = Statics.field554;
                Statics.field3257 = var56;
                if (var55.method4255()) {
                    Statics.field3258 = var55.method4262(35);
                    Statics.field3275 = new class256[Statics.field3258];
                    for (int var57 = 0; var57 < Statics.field3258; var57++) {
                        byte[] var58 = var55.method4250(35, var57);
                        if (var58 != null) {
                            Statics.field3275[var57] = new class256(var57);
                            Statics.field3275[var57].method4439(new class183(var58));
                            Statics.field3275[var57].method4440();
                        }
                    }
                }
                class79.field1122 = class238.field3094;
                class79.field1121 = 60;
                field824 = 80;
            } else {
                class79.field1122 = class238.field2837 + Statics.field63.method4368() + "%";
                class79.field1121 = 60;
            }
        } else if (field824 == 80) {
            int var59 = 0;
            if (Statics.field303 == null) {
                Statics.field303 = class320.method4862(Statics.field554, "compass", "");
            } else {
                var59++;
            }
            if (Statics.field1805 == null) {
                Statics.field1805 = class320.method4862(Statics.field554, "mapedge", "");
            } else {
                var59++;
            }
            if (Statics.field1 == null) {
                Statics.field1 = class320.method4864(Statics.field554, "mapscene", "");
            } else {
                var59++;
            }
            if (Statics.field887 == null) {
                Statics.field887 = class320.method621(Statics.field554, "headicons_pk", "");
            } else {
                var59++;
            }
            if (Statics.field336 == null) {
                Statics.field336 = class320.method621(Statics.field554, "headicons_prayer", "");
            } else {
                var59++;
            }
            if (Statics.field3336 == null) {
                Statics.field3336 = class320.method621(Statics.field554, "headicons_hint", "");
            } else {
                var59++;
            }
            if (Statics.field2489 == null) {
                Statics.field2489 = class320.method621(Statics.field554, "mapmarker", "");
            } else {
                var59++;
            }
            if (Statics.field1461 == null) {
                Statics.field1461 = class320.method621(Statics.field554, "cross", "");
            } else {
                var59++;
            }
            if (Statics.field1191 == null) {
                Statics.field1191 = class320.method621(Statics.field554, "mapdots", "");
            } else {
                var59++;
            }
            if (Statics.field1050 == null) {
                Statics.field1050 = class320.method4864(Statics.field554, "scrollbar", "");
            } else {
                var59++;
            }
            if (Statics.field1116 == null) {
                Statics.field1116 = class320.method4864(Statics.field554, "mod_icons", "");
            } else {
                var59++;
            }
            if (var59 < 11) {
                class79.field1122 = class238.field2886 + var59 * 100 / 12 + "%";
                class79.field1121 = 70;
            } else {
                Statics.field3712 = Statics.field1116;
                Statics.field1805.method5515();
                int var60 = (int) (Math.random() * 21.0D) - 10;
                int var61 = (int) (Math.random() * 21.0D) - 10;
                int var62 = (int) (Math.random() * 21.0D) - 10;
                int var63 = (int) (Math.random() * 41.0D) - 20;
                Statics.field1[0].method5421(var60 + var63, var61 + var63, var62 + var63);
                class79.field1122 = class238.field2861;
                class79.field1121 = 70;
                field824 = 90;
            }
        } else if (field824 == 90) {
            if (Statics.field2375.method4255()) {
                Statics.field73 = new class112(Statics.field2375, Statics.field554, 20, 0.8D, field709 ? 64 : 128);
                class123.method2677(Statics.field73);
                class123.method2610(0.8D);
                field824 = 100;
            } else {
                class79.field1122 = class238.field3073 + "0%";
                class79.field1121 = 90;
            }
        } else if (field824 == 100) {
            int var64 = Statics.field73.method2403();
            if (var64 < 100) {
                class79.field1122 = class238.field3073 + var64 + "%";
                class79.field1121 = 90;
            } else {
                class79.field1122 = class238.field3086;
                class79.field1121 = 90;
                field824 = 110;
            }
        } else if (field824 == 110) {
            Statics.field3283 = new class58();
            Statics.field410.method3011(Statics.field3283, 10);
            class79.field1122 = class238.field3040;
            class79.field1121 = 92;
            field824 = 120;
        } else if (field824 == 120) {
            if (Statics.field197.method4312("huffman", "")) {
                class175 var65 = new class175(Statics.field197.method4271("huffman", ""));
                Statics.field3725 = var65;
                class79.field1122 = class238.field2838;
                class79.field1121 = 94;
                field824 = 130;
            } else {
                class79.field1122 = class238.field2844 + "%";
                class79.field1121 = 94;
            }
        } else if (field824 == 130) {
            if (!Statics.field170.method4255()) {
                class79.field1122 = class238.field2846 + Statics.field170.method4368() * 4 / 5 + "%";
                class79.field1121 = 96;
            } else if (!Statics.field22.method4255()) {
                class79.field1122 = class238.field2846 + (80 + Statics.field22.method4368() / 6) + "%";
                class79.field1121 = 96;
            } else if (Statics.field25.method4255()) {
                class79.field1122 = class238.field2847;
                class79.field1121 = 98;
                field824 = 140;
            } else {
                class79.field1122 = class238.field2846 + (96 + Statics.field25.method4368() / 50) + "%";
                class79.field1121 = 96;
            }
        } else if (field824 == 140) {
            class79.field1121 = 100;
            if (Statics.field436.method4337(class30.field258.field263)) {
                if (Statics.field988 == null) {
                    Statics.field988 = new class322();
                    Statics.field988.method5604(Statics.field436, Statics.field500, field645, Statics.field1);
                }
                int var66 = Statics.field988.method5605();
                if (var66 < 100) {
                    class79.field1122 = class238.field2845 + (var66 * 9 / 10 + 10) + "%";
                } else {
                    class79.field1122 = class238.field2849;
                    field824 = 150;
                }
            } else {
                class79.field1122 = class238.field2845 + Statics.field436.method4275(class30.field258.field263) / 10 + "%";
            }
        } else if (field824 == 150) {
            Statics.method2138(10);
        }
    }

    @ObfuscatedName("v.fi(IZZZI)Lic;")
    public static class250 method439(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class163 var4 = null;
        if (class156.field1990 != null) {
            var4 = new class163(arg0, class156.field1990, Statics.field1984[arg0], 1000000);
        }
        return new class250(var4, Statics.field969, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.fm(I)V")
    public final void method1106() {
        class158 var1 = field740.method1899();
        class190 var2 = field740.field1255;
        try {
            if (field839 == 0) {
                if (var1 != null) {
                    var1.method3043();
                    var1 = null;
                }
                Statics.field1585 = null;
                field642 = false;
                field646 = 0;
                field839 = 1;
            }
            if (field839 == 1) {
                if (Statics.field1585 == null) {
                    Statics.field1585 = Statics.field410.method3004(Statics.field2, Statics.field92);
                }
                if (Statics.field1585.field1967 == 2) {
                    throw new IOException();
                }
                if (Statics.field1585.field1967 == 1) {
                    if (field643) {
                        var1 = class158.method155((Socket) Statics.field1585.field1971, 40000, 5000);
                    } else {
                        var1 = new class162((Socket) Statics.field1585.field1971, Statics.field410, 5000);
                    }
                    field740.method1876(var1);
                    Statics.field1585 = null;
                    field839 = 2;
                }
            }
            if (field839 == 2) {
                field740.method1874();
                class173 var3 = class173.method3152();
                var3.field2280.method3246(class171.field2262.field2263);
                field740.method1873(var3);
                field740.method1888();
                var2.field2360 = 0;
                field839 = 3;
            }
            if (field839 == 3) {
                if (Statics.field12 != null) {
                    Statics.field12.method2042();
                }
                if (Statics.field2412 != null) {
                    Statics.field2412.method2042();
                }
                boolean var4 = true;
                if (field643 && !var1.method3038(1)) {
                    var4 = false;
                }
                if (var4) {
                    int var5 = var1.method3040();
                    if (Statics.field12 != null) {
                        Statics.field12.method2042();
                    }
                    if (Statics.field2412 != null) {
                        Statics.field2412.method2042();
                    }
                    if (var5 != 0) {
                        method199(var5);
                        return;
                    }
                    var2.field2360 = 0;
                    field839 = 4;
                }
            }
            if (field839 == 4) {
                if (var2.field2360 < 8) {
                    int var6 = var1.method3037();
                    if (var6 > 8 - var2.field2360) {
                        var6 = 8 - var2.field2360;
                    }
                    if (var6 > 0) {
                        var1.method3041(var2.field2366, var2.field2360, var6);
                        var2.field2360 += var6;
                    }
                }
                if (var2.field2360 == 8) {
                    var2.field2360 = 0;
                    Statics.field2066 = var2.method3486();
                    field839 = 5;
                }
            }
            if (field839 == 5) {
                field740.field1255.field2360 = 0;
                field740.method1874();
                class190 var7 = new class190(500);
                int[] var8 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Statics.field2066 >> 32), (int) (Statics.field2066 & 0xFFFFFFFFFFFFFFFFL) };
                var7.field2360 = 0;
                var7.method3246(1);
                var7.method3246(field717.method159());
                var7.method3249(var8[0]);
                var7.method3249(var8[1]);
                var7.method3249(var8[2]);
                var7.method3249(var8[3]);
                switch(field717.field1929) {
                    case 0:
                    case 2:
                        var7.method3248(Statics.field550);
                        var7.field2360 += 5;
                        break;
                    case 1:
                        var7.method3249((Integer) Statics.field469.field976.get(class306.method1464(class79.field1128)));
                        var7.field2360 += 4;
                        break;
                    case 3:
                        var7.field2360 += 8;
                }
                var7.method3243(class79.field1144);
                var7.method3295(class77.field1094, class77.field1088);
                class173 var9 = class173.method3152();
                var9.field2280.field2360 = 0;
                if (field612 == 40) {
                    var9.field2280.method3246(class171.field2259.field2263);
                } else {
                    var9.field2280.method3246(class171.field2261.field2263);
                }
                var9.field2280.method3296(0);
                int var10 = var9.field2280.field2360;
                var9.field2280.method3249(170);
                var9.field2280.method3322(var7.field2366, 0, var7.field2360);
                int var11 = var9.field2280.field2360;
                var9.field2280.method3243(class79.field1128);
                var9.field2280.method3246((field676 ? 1 : 0) << 1 | (field709 ? 1 : 0));
                var9.field2280.method3296(Statics.field71);
                var9.field2280.method3296(Statics.field327);
                class190 var12 = var9.field2280;
                if (field719 == null) {
                    byte[] var13 = class156.method4147();
                    var12.method3322(var13, 0, var13.length);
                } else {
                    var12.method3322(field719, 0, field719.length);
                }
                var9.field2280.method3243(Statics.field358);
                var9.field2280.method3249(Statics.field232);
                class183 var14 = new class183(Statics.field1101.method5807());
                Statics.field1101.method5806(var14);
                var9.field2280.method3322(var14.field2366, 0, var14.field2366.length);
                var9.field2280.method3246(field601);
                var9.field2280.method3249(0);
                var9.field2280.method3249(Statics.field3162.field3181);
                var9.field2280.method3249(Statics.field627.field3181);
                var9.field2280.method3249(Statics.field63.field3181);
                var9.field2280.method3249(Statics.field170.field3181);
                var9.field2280.method3249(Statics.field1460.field3181);
                var9.field2280.method3249(Statics.field2797.field3181);
                var9.field2280.method3249(Statics.field437.field3181);
                var9.field2280.method3249(Statics.field2478.field3181);
                var9.field2280.method3249(Statics.field554.field3181);
                var9.field2280.method3249(Statics.field2375.field3181);
                var9.field2280.method3249(Statics.field197.field3181);
                var9.field2280.method3249(Statics.field509.field3181);
                var9.field2280.method3249(Statics.field22.field3181);
                var9.field2280.method3249(Statics.field25.field3181);
                var9.field2280.method3249(Statics.field78.field3181);
                var9.field2280.method3249(Statics.field41.field3181);
                var9.field2280.method3249(Statics.field436.field3181);
                var9.field2280.method3283(var8, var11, var9.field2280.field2360);
                var9.field2280.method3428(var9.field2280.field2360 - var10);
                field740.method1873(var9);
                field740.method1888();
                field740.field1251 = new class191(var8);
                for (int var15 = 0; var15 < 4; var15++) {
                    var8[var15] += 50;
                }
                var2.method3566(var8);
                field839 = 6;
            }
            if (field839 == 6 && var1.method3037() > 0) {
                int var16 = var1.method3040();
                if (var16 == 21 && field612 == 20) {
                    field839 = 7;
                } else if (var16 == 2) {
                    field839 = 9;
                } else if (var16 == 15 && field612 == 40) {
                    field740.field1248 = -1;
                    field839 = 13;
                } else if (var16 == 23 && field631 < 1) {
                    field631++;
                    field839 = 0;
                } else if (var16 == 29) {
                    field839 = 11;
                } else {
                    method199(var16);
                    return;
                }
            }
            if (field839 == 7 && var1.method3037() > 0) {
                field632 = (var1.method3040() + 3) * 60;
                field839 = 8;
            }
            if (field839 == 8) {
                field646 = 0;
                class79.method2135(class238.field2853, class238.field2854, field632 / 60 + class238.field3093);
                if (--field632 <= 0) {
                    field839 = 0;
                }
            } else {
                if (field839 == 9 && var1.method3037() >= 13) {
                    boolean var17 = var1.method3040() == 1;
                    var1.method3041(var2.field2366, 0, 4);
                    var2.field2360 = 0;
                    boolean var18 = false;
                    if (var17) {
                        int var19 = var2.method3552() << 24;
                        int var20 = var19 | var2.method3552() << 16;
                        int var21 = var20 | var2.method3552() << 8;
                        int var22 = var21 | var2.method3552();
                        int var23 = class306.method1464(class79.field1128);
                        if (Statics.field469.field976.size() >= 10 && !Statics.field469.field976.containsKey(var23)) {
                            Iterator var24 = Statics.field469.field976.entrySet().iterator();
                            var24.next();
                            var24.remove();
                        }
                        Statics.field469.field976.put(var23, var22);
                    }
                    if (class79.field1130) {
                        Statics.field469.field981 = class79.field1128;
                    } else {
                        Statics.field469.field981 = null;
                    }
                    class67.method4621();
                    field730 = var1.method3040();
                    field762 = var1.method3040() == 1;
                    field710 = var1.method3040();
                    field710 <<= 0x8;
                    field710 += var1.method3040();
                    field711 = var1.method3040();
                    var1.method3041(var2.field2366, 0, 1);
                    var2.field2360 = 0;
                    class169[] var25 = new class169[] { class169.field2093, class169.field2128, class169.field2083, class169.field2150, class169.field2080, class169.field2077, class169.field2078, class169.field2120, class169.field2075, class169.field2081, class169.field2135, class169.field2072, class169.field2084, class169.field2085, class169.field2086, class169.field2087, class169.field2123, class169.field2089, class169.field2090, class169.field2100, class169.field2092, class169.field2097, class169.field2094, class169.field2095, class169.field2082, class169.field2088, class169.field2098, class169.field2099, class169.field2129, class169.field2101, class169.field2102, class169.field2103, class169.field2104, class169.field2105, class169.field2106, class169.field2107, class169.field2108, class169.field2109, class169.field2110, class169.field2111, class169.field2073, class169.field2113, class169.field2114, class169.field2115, class169.field2116, class169.field2117, class169.field2118, class169.field2119, class169.field2096, class169.field2121, class169.field2152, class169.field2091, class169.field2124, class169.field2125, class169.field2126, class169.field2127, class169.field2074, class169.field2157, class169.field2158, class169.field2131, class169.field2132, class169.field2133, class169.field2134, class169.field2139, class169.field2136, class169.field2137, class169.field2138, class169.field2153, class169.field2140, class169.field2141, class169.field2122, class169.field2143, class169.field2144, class169.field2130, class169.field2146, class169.field2147, class169.field2145, class169.field2079, class169.field2155, class169.field2151, class169.field2076, class169.field2148, class169.field2154, class169.field2149 };
                    int var27 = var2.method3567();
                    if (var27 < 0 || var27 >= var25.length) {
                        throw new IOException(var27 + " " + var2.field2360);
                    }
                    field740.field1247 = var25[var27];
                    field740.field1248 = field740.field1247.field2142;
                    var1.method3041(var2.field2366, 0, 2);
                    var2.field2360 = 0;
                    field740.field1248 = var2.method3268();
                    try {
                        class42.method678(Statics.field322, "zap");
                    } catch (Throwable var34) {
                    }
                    field839 = 10;
                }
                if (field839 != 10) {
                    if (field839 == 11 && var1.method3037() >= 2) {
                        var2.field2360 = 0;
                        var1.method3041(var2.field2366, 0, 2);
                        var2.field2360 = 0;
                        Statics.field1193 = var2.method3268();
                        field839 = 12;
                    }
                    if (field839 == 12 && var1.method3037() >= Statics.field1193) {
                        var2.field2360 = 0;
                        var1.method3041(var2.field2366, 0, Statics.field1193);
                        var2.field2360 = 0;
                        String var29 = var2.method3271();
                        String var30 = var2.method3271();
                        String var31 = var2.method3271();
                        class79.method2135(var29, var30, var31);
                        Statics.method2138(10);
                    }
                    if (field839 == 13) {
                        if (field740.field1248 == -1) {
                            if (var1.method3037() < 2) {
                                return;
                            }
                            var1.method3041(var2.field2366, 0, 2);
                            var2.field2360 = 0;
                            field740.field1248 = var2.method3268();
                        }
                        if (var1.method3037() >= field740.field1248) {
                            var1.method3041(var2.field2366, 0, field740.field1248);
                            var2.field2360 = 0;
                            int var32 = field740.field1248;
                            field841.method4871();
                            method2336();
                            class82.method1846(var2);
                            if (var2.field2360 != var32) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field646++;
                        if (field646 > 2000) {
                            if (field631 < 1) {
                                if (Statics.field92 == Statics.field2112) {
                                    Statics.field92 = Statics.field102;
                                } else {
                                    Statics.field92 = Statics.field2112;
                                }
                                field631++;
                                field839 = 0;
                            } else {
                                method199(-3);
                            }
                        }
                    }
                } else if (var1.method3037() >= field740.field1248) {
                    var2.field2360 = 0;
                    var1.method3041(var2.field2366, 0, field740.field1248);
                    field841.method4870();
                    method187();
                    class82.method1846(var2);
                    Statics.field83 = -1;
                    method992(false, var2);
                    field740.field1247 = null;
                }
            }
        } catch (IOException var35) {
            if (field631 < 1) {
                if (Statics.field92 == Statics.field2112) {
                    Statics.field92 = Statics.field102;
                } else {
                    Statics.field92 = Statics.field2112;
                }
                field631++;
                field839 = 0;
            } else {
                method199(-2);
            }
        }
    }

    @ObfuscatedName("c.fs(I)V")
    public static void method187() {
        field606 = 1L;
        field609 = -1;
        Statics.field3283.field534 = 0;
        Statics.field979 = true;
        field610 = true;
        field783 = -1L;
        class314.field3763 = new class204();
        field740.method1874();
        field740.field1255.field2360 = 0;
        field740.field1247 = null;
        field740.field1252 = null;
        field740.field1246 = null;
        field740.field1254 = null;
        field740.field1248 = 0;
        field740.field1250 = 0;
        field644 = 0;
        field689 = 0;
        field859 = 0;
        field658 = 0;
        field847 = false;
        class49.method1029(0);
        class84.method1724();
        field772 = 0;
        field814 = false;
        field599 = 0;
        field663 = 0;
        field679 = 0;
        Statics.field54 = null;
        field823 = 0;
        field816 = -1;
        field821 = 0;
        field822 = 0;
        field621 = class78.field1095;
        field622 = class78.field1095;
        field636 = 0;
        class82.method1413();
        for (int var0 = 0; var0 < 2048; var0++) {
            field807[var0] = null;
        }
        for (int var1 = 0; var1 < 32768; var1++) {
            field808[var1] = null;
        }
        field720 = -1;
        field723.method3789();
        field661.method3789();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    field721[var2][var3][var4] = null;
                }
            }
        }
        field722 = new class206();
        Statics.field1454.method1551();
        for (int var5 = 0; var5 < Statics.field3252; var5++) {
            class255 var6 = (class255) class255.field3253.method3707((long) var5);
            class255 var7;
            if (var6 == null) {
                byte[] var8 = Statics.field3255.method4250(16, var5);
                class255 var9 = new class255();
                if (var8 != null) {
                    var9.method4434(new class183(var8));
                }
                class255.field3253.method3712(var9, (long) var5);
                var7 = var9;
            } else {
                var7 = var6;
            }
            if (var7 != null) {
                class226.field2577[var5] = 0;
                class226.field2579[var5] = 0;
            }
        }
        Statics.field3145.method1822();
        field761 = -1;
        if (field753 != -1) {
            class231.method191(field753);
        }
        for (class56 var11 = (class56) field827.method3739(); var11 != null; var11 = (class56) field827.method3740()) {
            method278(var11, true);
        }
        field753 = -1;
        field827 = new class203(8);
        field757 = null;
        field658 = 0;
        field847 = false;
        field854.method4117((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var12 = 0; var12 < 8; var12++) {
            field651[var12] = null;
            field851[var12] = false;
        }
        class54.field479 = new class203(32);
        field604 = true;
        for (int var13 = 0; var13 < 100; var13++) {
            field796[var13] = true;
        }
        class173 var14 = class173.method2882(class170.field2207, field740.field1251);
        class190 var15 = var14.field2280;
        int var16 = field676 ? 2 : 1;
        var15.method3246(var16);
        var14.field2280.method3296(Statics.field71);
        var14.field2280.method3296(Statics.field327);
        field740.method1873(var14);
        Statics.field3 = null;
        for (int var17 = 0; var17 < 8; var17++) {
            field857[var17] = new class5();
        }
        Statics.field2292 = null;
    }

    @ObfuscatedName("dd.fu(I)V")
    public static void method2336() {
        field740.method1874();
        field740.field1255.field2360 = 0;
        field740.field1247 = null;
        field740.field1252 = null;
        field740.field1246 = null;
        field740.field1254 = null;
        field740.field1248 = 0;
        field740.field1250 = 0;
        field644 = 0;
        field658 = 0;
        field847 = false;
        field823 = 0;
        field821 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field807[var0] = null;
        }
        Statics.field1949 = null;
        for (int var1 = 0; var1 < field808.length; var1++) {
            class73 var2 = field808[var1];
            if (var2 != null) {
                var2.field936 = -1;
                var2.field911 = false;
            }
        }
        class54.field479 = new class203(32);
        Statics.method2138(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field796[var3] = true;
        }
        class173 var4 = class173.method2882(class170.field2207, field740.field1251);
        class190 var5 = var4.field2280;
        int var6 = field676 ? 2 : 1;
        var5.method3246(var6);
        var4.field2280.method3296(Statics.field71);
        var4.field2280.method3296(Statics.field327);
        field740.method1873(var4);
    }

    @ObfuscatedName("u.fa(II)V")
    public static void method199(int arg0) {
        if (arg0 == -3) {
            class79.method2135(class238.field2856, class238.field2857, class238.field2858);
        } else if (arg0 == -2) {
            class79.method2135(class238.field2859, class238.field2860, class238.field2842);
        } else if (arg0 == -1) {
            class79.method2135(class238.field2862, class238.field2863, class238.field2864);
        } else if (arg0 == 3) {
            class79.field1136 = 3;
        } else if (arg0 == 4) {
            class79.method2135(class238.field3008, class238.field2866, class238.field2867);
        } else if (arg0 == 5) {
            class79.method2135(class238.field2868, class238.field3000, class238.field3054);
        } else if (arg0 == 6) {
            class79.method2135(class238.field2871, class238.field2870, class238.field2873);
        } else if (arg0 == 7) {
            class79.method2135(class238.field2874, class238.field2875, class238.field2876);
        } else if (arg0 == 8) {
            class79.method2135(class238.field2877, class238.field2878, class238.field2898);
        } else if (arg0 == 9) {
            class79.method2135(class238.field2880, class238.field2881, class238.field2890);
        } else if (arg0 == 10) {
            class79.method2135(class238.field2883, class238.field3072, class238.field2889);
        } else if (arg0 == 11) {
            class79.method2135(class238.field2879, class238.field2832, class238.field3075);
        } else if (arg0 == 12) {
            class79.method2135(class238.field2942, class238.field3098, class238.field2869);
        } else if (arg0 == 13) {
            class79.method2135(class238.field2892, class238.field2924, class238.field3082);
        } else if (arg0 == 14) {
            class79.method2135(class238.field3045, class238.field2896, class238.field2999);
        } else if (arg0 == 16) {
            class79.method2135(class238.field2848, class238.field2989, class238.field2900);
        } else if (arg0 == 17) {
            class79.method2135(class238.field2901, class238.field2902, class238.field2958);
        } else if (arg0 == 18) {
            class79.method2135(class238.field2919, class238.field2905, class238.field2823);
        } else if (arg0 == 19) {
            class79.method2135(class238.field2907, class238.field2908, class238.field2909);
        } else if (arg0 == 20) {
            class79.method2135(class238.field2910, class238.field2911, class238.field3053);
        } else if (arg0 == 22) {
            class79.method2135(class238.field2913, class238.field2914, class238.field2915);
        } else if (arg0 == 23) {
            class79.method2135(class238.field2916, class238.field2917, class238.field2976);
        } else if (arg0 == 24) {
            class79.method2135(class238.field3042, class238.field2920, class238.field2921);
        } else if (arg0 == 25) {
            class79.method2135(class238.field2922, class238.field2923, class238.field2932);
        } else if (arg0 == 26) {
            class79.method2135(class238.field2894, class238.field2926, class238.field2827);
        } else if (arg0 == 27) {
            class79.method2135(class238.field2928, class238.field2891, class238.field2930);
        } else if (arg0 == 31) {
            class79.method2135(class238.field2937, class238.field2938, class238.field3041);
        } else if (arg0 == 32) {
            class79.method2135(class238.field2940, class238.field2991, class238.field3104);
        } else if (arg0 == 37) {
            class79.method2135(class238.field2943, class238.field2944, class238.field2945);
        } else if (arg0 == 38) {
            class79.method2135(class238.field2946, class238.field2947, class238.field2948);
        } else if (arg0 == 55) {
            class79.field1136 = 8;
        } else if (arg0 == 56) {
            class79.method2135(class238.field3065, class238.field2822, class238.field2955);
            Statics.method2138(11);
            return;
        } else if (arg0 == 57) {
            class79.method2135(class238.field2956, class238.field2957, class238.field2895);
            Statics.method2138(11);
            return;
        } else if (arg0 == 61) {
            class79.field1136 = 7;
        } else {
            class79.method2135(class238.field2836, class238.field2960, class238.field2952);
        }
        Statics.method2138(10);
    }

    @ObfuscatedName("cw.fk(I)V")
    public static final void method1818() {
        field740.method1877();
        method983();
        Statics.field524.method2688();
        for (int var0 = 0; var0 < 4; var0++) {
            field667[var0].method3110();
        }
        System.gc();
        class218.method3595(2);
        field825 = -1;
        field826 = false;
        class69.method1035();
        Statics.method2138(10);
    }

    @ObfuscatedName("be.fy(B)V")
    public static final void method983() {
        Statics.method1039();
        Statics.method3144();
        class261.field3313.method3708();
        class269.field3393.method3708();
        class269.field3427.method3708();
        class269.field3411.method3708();
        class269.field3395.method3708();
        Statics.method567();
        class270.method281();
        class274.method440();
        class259.method2872();
        class264.field3339.method3708();
        Statics.method3062();
        class268.method4657();
        class262.field3324.method3708();
        class262.field3325.method3708();
        class266.field3353.method3708();
        class265.field3346.method3708();
        class256.field3259.method3708();
        class228.field2598.method3708();
        class231.field2618.method3708();
        class231.field2619.method3708();
        class231.field2620.method3708();
        class231.field2621.method3708();
        ((class112) Statics.field1713).method2376();
        class85.field1215.method3708();
        Statics.field3162.method4266();
        Statics.field627.method4266();
        Statics.field170.method4266();
        Statics.field1460.method4266();
        Statics.field2797.method4266();
        Statics.field437.method4266();
        Statics.field2478.method4266();
        Statics.field554.method4266();
        Statics.field2375.method4266();
        Statics.field197.method4266();
        Statics.field509.method4266();
        Statics.field22.method4266();
    }

    @ObfuscatedName("co.fq(B)V")
    public static final void method1872() {
        if (field689 > 0) {
            method1818();
        } else {
            field841.method4867();
            Statics.method2138(40);
            Statics.field1698 = field740.method1899();
            field740.method1878();
        }
    }

    @ObfuscatedName("af.fr(ZI)V")
    public static final void method670(boolean arg0) {
        if (arg0) {
            field717 = class79.field1133 ? class147.field1928 : class147.field1934;
        } else {
            field717 = Statics.field469.field976.containsKey(class306.method1464(class79.field1128)) ? class147.field1931 : class147.field1930;
        }
    }

    @ObfuscatedName("client.fe(I)V")
    public final void method1107() {
        if (field644 > 1) {
            field644--;
        }
        if (field689 > 0) {
            field689--;
        }
        if (field642) {
            field642 = false;
            method1872();
            return;
        }
        if (!field847) {
            method1481();
        }
        for (int var1 = 0; var1 < 100 && this.method1460(field740); var1++) {
        }
        if (field612 != 30) {
            return;
        }
        while (class314.method517()) {
            class173 var2 = class173.method2882(class170.field2183, field740.field1251);
            var2.field2280.method3246(0);
            int var3 = var2.field2280.field2360;
            class314.method284(var2.field2280);
            var2.field2280.method3259(var2.field2280.field2360 - var3);
            field740.method1873(var2);
        }
        if (field841.field3617) {
            class173 var4 = class173.method2882(class170.field2191, field740.field1251);
            var4.field2280.method3246(0);
            int var5 = var4.field2280.field2360;
            field841.method4872(var4.field2280);
            var4.field2280.method3259(var4.field2280.field2360 - var5);
            field740.method1873(var4);
            field841.method4865();
        }
        Object var6 = Statics.field3283.field529;
        synchronized (Statics.field3283.field529) {
            if (!field781) {
                Statics.field3283.field534 = 0;
            } else if (class49.field432 != 0 || Statics.field3283.field534 >= 40) {
                class173 var7 = class173.method2882(class170.field2252, field740.field1251);
                var7.field2280.method3246(0);
                int var8 = var7.field2280.field2360;
                int var9 = 0;
                for (int var10 = 0; var10 < Statics.field3283.field534 && var7.field2280.field2360 - var8 < 240; var10++) {
                    var9++;
                    int var11 = Statics.field3283.field530[var10];
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 502) {
                        var11 = 502;
                    }
                    int var12 = Statics.field3283.field531[var10];
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 764) {
                        var12 = 764;
                    }
                    int var13 = var11 * 765 + var12;
                    if (Statics.field3283.field530[var10] == -1 && Statics.field3283.field531[var10] == -1) {
                        var12 = -1;
                        var11 = -1;
                        var13 = 524287;
                    }
                    if (field607 != var12 || field608 != var11) {
                        int var14 = var12 - field607;
                        field607 = var12;
                        int var15 = var11 - field608;
                        field608 = var11;
                        if (field609 < 8 && var14 >= -32 && var14 <= 31 && var15 >= -32 && var15 <= 31) {
                            var14 += 32;
                            var15 += 32;
                            var7.field2280.method3296((field609 << 12) + (var14 << 6) + var15);
                            field609 = 0;
                        } else if (field609 < 8) {
                            var7.field2280.method3248((field609 << 19) + 8388608 + var13);
                            field609 = 0;
                        } else {
                            var7.field2280.method3249((field609 << 19) + -1073741824 + var13);
                            field609 = 0;
                        }
                    } else if (field609 < 2047) {
                        field609++;
                    }
                }
                var7.field2280.method3259(var7.field2280.field2360 - var8);
                field740.method1873(var7);
                if (var9 >= Statics.field3283.field534) {
                    Statics.field3283.field534 = 0;
                } else {
                    Statics.field3283.field534 -= var9;
                    for (int var16 = 0; var16 < Statics.field3283.field534; var16++) {
                        Statics.field3283.field531[var16] = Statics.field3283.field531[var9 + var16];
                        Statics.field3283.field530[var16] = Statics.field3283.field530[var9 + var16];
                    }
                }
            }
        }
        if (class49.field432 == 1 || !Statics.field58 && class49.field432 == 4 || class49.field432 == 2) {
            long var18 = (class49.field435 - field606 * -1L) / 50L;
            if (var18 > 4095L) {
                var18 = 4095L;
            }
            field606 = class49.field435 * -1L;
            int var20 = class49.field438;
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > Statics.field327) {
                var20 = Statics.field327;
            }
            int var21 = class49.field433;
            if (var21 < 0) {
                var21 = 0;
            } else if (var21 > Statics.field71) {
                var21 = Statics.field71;
            }
            int var22 = (int) var18;
            class173 var23 = class173.method2882(class170.field2194, field740.field1251);
            var23.field2280.method3296((var22 << 1) + (class49.field432 == 2 ? 1 : 0));
            var23.field2280.method3296(var21);
            var23.field2280.method3296(var20);
            field740.method1873(var23);
        }
        if (class40.field348 > 0) {
            class173 var24 = class173.method2882(class170.field2209, field740.field1251);
            var24.field2280.method3296(0);
            int var25 = var24.field2280.field2360;
            long var26 = class185.method3151();
            for (int var28 = 0; var28 < class40.field348; var28++) {
                long var29 = var26 - field783;
                if (var29 > 16777215L) {
                    var29 = 16777215L;
                }
                field783 = var26;
                var24.field2280.method3327((int) var29);
                var24.field2280.method3246(class40.field347[var28]);
            }
            var24.field2280.method3428(var24.field2280.field2360 - var25);
            field740.method1873(var24);
        }
        if (field802 > 0) {
            field802--;
        }
        if (class40.field341[96] || class40.field341[97] || class40.field341[98] || class40.field341[99]) {
            field678 = true;
        }
        if (field678 && field802 <= 0) {
            field802 = 20;
            field678 = false;
            class173 var31 = class173.method2882(class170.field2163, field740.field1251);
            var31.field2280.method3299(field633);
            var31.field2280.method3401(field663);
            field740.method1873(var31);
        }
        if (Statics.field979 && !field610) {
            field610 = true;
            class173 var32 = class173.method2882(class170.field2247, field740.field1251);
            var32.field2280.method3246(1);
            field740.method1873(var32);
        }
        if (!Statics.field979 && field610) {
            field610 = false;
            class173 var33 = class173.method2882(class170.field2247, field740.field1251);
            var33.field2280.method3246(0);
            field740.method1873(var33);
        }
        if (Statics.field988 != null) {
            Statics.field988.method5606();
        }
        method2871();
        method984();
        if (field612 != 30) {
            return;
        }
        for (class63 var34 = (class63) field722.method3797(); var34 != null; var34 = (class63) field722.method3788()) {
            if (var34.field878 > 0) {
                var34.field878--;
            }
            if (var34.field878 != 0) {
                if (var34.field868 > 0) {
                    var34.field868--;
                }
                if (var34.field868 == 0 && var34.field869 >= 1 && var34.field881 >= 1 && var34.field869 <= 102 && var34.field881 <= 102 && (var34.field867 < 0 || class51.method448(var34.field867, var34.field876))) {
                    method437(var34.field874, var34.field870, var34.field869, var34.field881, var34.field867, var34.field875, var34.field876);
                    var34.field868 = -1;
                    if (var34.field871 == var34.field867 && var34.field871 == -1) {
                        var34.method3782();
                    } else if (var34.field871 == var34.field867 && var34.field875 == var34.field872 && var34.field876 == var34.field873) {
                        var34.method3782();
                    }
                }
            } else if (var34.field871 < 0 || class51.method448(var34.field871, var34.field873)) {
                method437(var34.field874, var34.field870, var34.field869, var34.field881, var34.field871, var34.field872, var34.field873);
                var34.method3782();
            }
        }
        method683();
        field740.field1250++;
        if (field740.field1250 > 750) {
            method1872();
            return;
        }
        method436();
        for (int var35 = 0; var35 < field636; var35++) {
            int var36 = field637[var35];
            class73 var37 = field808[var36];
            if (var37 != null) {
                method1631(var37, var37.field1059.field3520);
            }
        }
        method1630();
        field655++;
        if (field697 != 0) {
            field844 += 20;
            if (field844 >= 400) {
                field697 = 0;
            }
        }
        if (Statics.field1922 != null) {
            field699++;
            if (field699 >= 15) {
                method3242(Statics.field1922);
                Statics.field1922 = null;
            }
        }
        class231 var38 = Statics.field330;
        class231 var39 = Statics.field43;
        Statics.field330 = null;
        Statics.field43 = null;
        field701 = null;
        field861 = false;
        field595 = false;
        field846 = 0;
        while (class40.method2047() && field846 < 128) {
            if (field730 >= 2 && class40.field341[82] && Statics.field1814 == 66) {
                String var40 = class84.method102();
                Statics.field322.method838(var40);
            } else if (field679 != 1 || Statics.field1847 <= 0) {
                field866[field846] = Statics.field1814;
                field813[field846] = Statics.field1847;
                field846++;
            }
        }
        if (method2928() && class40.field341[82] && class40.field341[81] && field789 != 0) {
            int var41 = Statics.field1949.field582 - field789;
            if (var41 < 0) {
                var41 = 0;
            } else if (var41 > 3) {
                var41 = 3;
            }
            if (Statics.field1949.field582 != var41) {
                method2961(Statics.field2316 + Statics.field1949.field929[0], Statics.field1052 + Statics.field1949.field940[0], var41, false);
            }
            field789 = 0;
        }
        if (field753 != -1) {
            int var42 = field753;
            int var43 = Statics.field71;
            int var44 = Statics.field327;
            if (class231.method694(var42)) {
                method26(Statics.field2616[var42], -1, 0, 0, var43, var44, 0, 0);
            }
        }
        field776++;
        while (true) {
            class57 var45;
            class231 var46;
            class231 var47;
            do {
                var45 = (class57) field791.method3793();
                if (var45 == null) {
                    while (true) {
                        class57 var48;
                        class231 var49;
                        class231 var50;
                        do {
                            var48 = (class57) field792.method3793();
                            if (var48 == null) {
                                while (true) {
                                    class57 var51;
                                    class231 var52;
                                    class231 var53;
                                    do {
                                        var51 = (class57) field756.method3793();
                                        if (var51 == null) {
                                            this.method1111();
                                            if (Statics.field988 != null) {
                                                Statics.field988.method5779(Statics.field2416, (Statics.field1949.field901 >> 7) + Statics.field2316, (Statics.field1949.field919 >> 7) + Statics.field1052, false);
                                                Statics.field988.method5631();
                                            }
                                            if (field764 != null) {
                                                this.method1132();
                                            }
                                            if (Statics.field443 != null) {
                                                method3242(Statics.field443);
                                                field706++;
                                                if (class49.field425 == 0) {
                                                    if (field705) {
                                                        if (Statics.field443 == Statics.field3689 && field704 != field598) {
                                                            class231 var54 = Statics.field443;
                                                            byte var55 = 0;
                                                            if (field815 == 1 && var54.field2712 == 206) {
                                                                var55 = 1;
                                                            }
                                                            if (var54.field2759[field704] <= 0) {
                                                                var55 = 0;
                                                            }
                                                            int var56 = method2080(var54);
                                                            boolean var57 = (var56 >> 29 & 0x1) != 0;
                                                            if (var57) {
                                                                int var58 = field598;
                                                                int var59 = field704;
                                                                var54.field2759[var59] = var54.field2759[var58];
                                                                var54.field2744[var59] = var54.field2744[var58];
                                                                var54.field2759[var58] = -1;
                                                                var54.field2744[var58] = 0;
                                                            } else if (var55 == 1) {
                                                                int var60 = field598;
                                                                int var61 = field704;
                                                                while (var60 != var61) {
                                                                    if (var60 > var61) {
                                                                        var54.method4157(var60 - 1, var60);
                                                                        var60--;
                                                                    } else if (var60 < var61) {
                                                                        var54.method4157(var60 + 1, var60);
                                                                        var60++;
                                                                    }
                                                                }
                                                            } else {
                                                                var54.method4157(field704, field598);
                                                            }
                                                            class173 var62 = class173.method2882(class170.field2245, field740.field1251);
                                                            var62.field2280.method3299(field704);
                                                            var62.field2280.method3364(Statics.field443.field2624);
                                                            var62.field2280.method3401(field598);
                                                            var62.field2280.method3290(var55);
                                                            field740.method1873(var62);
                                                        }
                                                    } else if (this.method1112()) {
                                                        this.method1342(field702, field641);
                                                    } else if (field658 > 0) {
                                                        int var63 = field702;
                                                        int var64 = field641;
                                                        method433(Statics.field2377, var63, var64);
                                                        Statics.field2377 = null;
                                                    }
                                                    field699 = 10;
                                                    class49.field432 = 0;
                                                    Statics.field443 = null;
                                                } else if (field706 >= 5 && (class49.field426 > field702 + 5 || class49.field426 < field702 - 5 || class49.field418 > field641 + 5 || class49.field418 < field641 - 5)) {
                                                    field705 = true;
                                                }
                                            }
                                            if (class126.method2727()) {
                                                int var65 = class126.field1777;
                                                int var66 = class126.field1749;
                                                class173 var67 = class173.method2882(class170.field2211, field740.field1251);
                                                var67.field2280.method3246(5);
                                                var67.field2280.method3299(Statics.field2316 + var65);
                                                var67.field2280.method3401(Statics.field1052 + var66);
                                                var67.field2280.method3290(class40.field341[82] ? (class40.field341[81] ? 2 : 1) : 0);
                                                field740.method1873(var67);
                                                class126.method2728();
                                                field744 = class49.field433;
                                                field840 = class49.field438;
                                                field697 = 1;
                                                field844 = 0;
                                                field821 = var65;
                                                field822 = var66;
                                            }
                                            if (Statics.field330 != var38) {
                                                if (var38 != null) {
                                                    method3242(var38);
                                                }
                                                if (Statics.field330 != null) {
                                                    method3242(Statics.field330);
                                                }
                                            }
                                            if (Statics.field43 != var39 && field748 == field745) {
                                                if (var39 != null) {
                                                    method3242(var39);
                                                }
                                                if (Statics.field43 != null) {
                                                    method3242(Statics.field43);
                                                }
                                            }
                                            if (Statics.field43 == null) {
                                                if (field748 > 0) {
                                                    field748--;
                                                }
                                            } else if (field748 < field745) {
                                                field748++;
                                                if (field748 == field745) {
                                                    method3242(Statics.field43);
                                                }
                                            }
                                            method1884();
                                            if (field747) {
                                                int var68 = Statics.field100 * 128 + 64;
                                                int var69 = Statics.field306 * 128 + 64;
                                                int var70 = method4568(var68, var69, Statics.field2416) - Statics.field2069;
                                                if (Statics.field119 < var68) {
                                                    Statics.field119 += Statics.field2802 * (var68 - Statics.field119) / 1000 + Statics.field2000;
                                                    if (Statics.field119 > var68) {
                                                        Statics.field119 = var68;
                                                    }
                                                }
                                                if (Statics.field119 > var68) {
                                                    Statics.field119 -= Statics.field2802 * (Statics.field119 - var68) / 1000 + Statics.field2000;
                                                    if (Statics.field119 < var68) {
                                                        Statics.field119 = var68;
                                                    }
                                                }
                                                if (Statics.field97 < var70) {
                                                    Statics.field97 += Statics.field2802 * (var70 - Statics.field97) / 1000 + Statics.field2000;
                                                    if (Statics.field97 > var70) {
                                                        Statics.field97 = var70;
                                                    }
                                                }
                                                if (Statics.field97 > var70) {
                                                    Statics.field97 -= Statics.field2802 * (Statics.field97 - var70) / 1000 + Statics.field2000;
                                                    if (Statics.field97 < var70) {
                                                        Statics.field97 = var70;
                                                    }
                                                }
                                                if (Statics.field103 < var69) {
                                                    Statics.field103 += Statics.field2802 * (var69 - Statics.field103) / 1000 + Statics.field2000;
                                                    if (Statics.field103 > var69) {
                                                        Statics.field103 = var69;
                                                    }
                                                }
                                                if (Statics.field103 > var69) {
                                                    Statics.field103 -= Statics.field2802 * (Statics.field103 - var69) / 1000 + Statics.field2000;
                                                    if (Statics.field103 < var69) {
                                                        Statics.field103 = var69;
                                                    }
                                                }
                                                int var71 = Statics.field1015 * 128 + 64;
                                                int var72 = Statics.field20 * 128 + 64;
                                                int var73 = method4568(var71, var72, Statics.field2416) - Statics.field477;
                                                int var74 = var71 - Statics.field119;
                                                int var75 = var73 - Statics.field97;
                                                int var76 = var72 - Statics.field103;
                                                int var77 = (int) Math.sqrt((double) (var74 * var74 + var76 * var76));
                                                int var78 = (int) (Math.atan2((double) var75, (double) var77) * 325.949D) & 0x7FF;
                                                int var79 = (int) (Math.atan2((double) var74, (double) var76) * -325.949D) & 0x7FF;
                                                if (var78 < 128) {
                                                    var78 = 128;
                                                }
                                                if (var78 > 383) {
                                                    var78 = 383;
                                                }
                                                if (Statics.field1936 < var78) {
                                                    Statics.field1936 += Statics.field1590 * (var78 - Statics.field1936) / 1000 + Statics.field1361;
                                                    if (Statics.field1936 > var78) {
                                                        Statics.field1936 = var78;
                                                    }
                                                }
                                                if (Statics.field1936 > var78) {
                                                    Statics.field1936 -= Statics.field1590 * (Statics.field1936 - var78) / 1000 + Statics.field1361;
                                                    if (Statics.field1936 < var78) {
                                                        Statics.field1936 = var78;
                                                    }
                                                }
                                                int var80 = var79 - Statics.field508;
                                                if (var80 > 1024) {
                                                    var80 -= 2048;
                                                }
                                                if (var80 < -1024) {
                                                    var80 += 2048;
                                                }
                                                if (var80 > 0) {
                                                    Statics.field508 += Statics.field1590 * var80 / 1000 + Statics.field1361;
                                                    Statics.field508 &= 0x7FF;
                                                }
                                                if (var80 < 0) {
                                                    Statics.field508 -= Statics.field1590 * -var80 / 1000 + Statics.field1361;
                                                    Statics.field508 &= 0x7FF;
                                                }
                                                int var81 = var79 - Statics.field508;
                                                if (var81 > 1024) {
                                                    var81 -= 2048;
                                                }
                                                if (var81 < -1024) {
                                                    var81 += 2048;
                                                }
                                                if (var81 < 0 && var80 > 0 || var81 > 0 && var80 < 0) {
                                                    Statics.field508 = var79;
                                                }
                                            }
                                            for (int var82 = 0; var82 < 5; var82++) {
                                                int var10002 = field766[var82]++;
                                            }
                                            Statics.field3145.method1792();
                                            int var83 = class49.method2883();
                                            int var84 = class40.method985();
                                            if (var83 > 15000 && var84 > 15000) {
                                                field689 = 250;
                                                class49.method1029(14500);
                                                class173 var85 = class173.method2882(class170.field2160, field740.field1251);
                                                field740.method1873(var85);
                                            }
                                            Statics.field1454.method1582();
                                            field740.field1253++;
                                            if (field740.field1253 > 50) {
                                                class173 var86 = class173.method2882(class170.field2218, field740.field1251);
                                                field740.method1873(var86);
                                            }
                                            try {
                                                field740.method1888();
                                            } catch (IOException var88) {
                                                method1872();
                                            }
                                            return;
                                        }
                                        var52 = var51.field512;
                                        if (var52.field2634 < 0) {
                                            break;
                                        }
                                        var53 = class231.method1097(var52.field2643);
                                    } while (var53 == null || var53.field2627 == null || var52.field2634 >= var53.field2627.length || var53.field2627[var52.field2634] != var52);
                                    class70.method1612(var51);
                                }
                            }
                            var49 = var48.field512;
                            if (var49.field2634 < 0) {
                                break;
                            }
                            var50 = class231.method1097(var49.field2643);
                        } while (var50 == null || var50.field2627 == null || var49.field2634 >= var50.field2627.length || var50.field2627[var49.field2634] != var49);
                        class70.method1612(var48);
                    }
                }
                var46 = var45.field512;
                if (var46.field2634 < 0) {
                    break;
                }
                var47 = class231.method1097(var46.field2643);
            } while (var47 == null || var47.field2627 == null || var46.field2634 >= var47.field2627.length || var47.field2627[var46.field2634] != var46);
            class70.method1612(var45);
        }
    }

    @ObfuscatedName("jx.fc(I)V")
    public static final void method4564() {
        if (Statics.field2412 != null) {
            Statics.field2412.method2041();
        }
        if (Statics.field12 != null) {
            Statics.field12.method2041();
        }
    }

    @ObfuscatedName("aj.fv(B)V")
    public static final void method683() {
        for (int var0 = 0; var0 < field599; var0++) {
            int var10002 = field832[var0]--;
            if (field832[var0] >= -10) {
                class92 var2 = field763[var0];
                if (var2 == null) {
                    class92 var10000 = (class92) null;
                    var2 = class92.method1964(Statics.field1460, field830[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field832[var0] += var2.method1963();
                    field763[var0] = var2;
                }
                if (field832[var0] < 0) {
                    int var9;
                    if (field833[var0] == 0) {
                        var9 = field769;
                    } else {
                        int var3 = (field833[var0] & 0xFF) * 128;
                        int var4 = field833[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field1949.field901;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field833[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field1949.field919;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field832[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field828 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class94 var10 = var2.method1960().method2008(Statics.field3167);
                        class104 var11 = class104.method2185(var10, 100, var9);
                        var11.method2144(field696[var0] - 1);
                        Statics.field1907.method1903(var11);
                    }
                    field832[var0] = -100;
                }
            } else {
                field599--;
                for (int var1 = var0; var1 < field599; var1++) {
                    field830[var1] = field830[var1 + 1];
                    field763[var1] = field763[var1 + 1];
                    field696[var1] = field696[var1 + 1];
                    field832[var1] = field832[var1 + 1];
                    field833[var1] = field833[var1 + 1];
                }
                var0--;
            }
        }
        if (field826 && !class218.method3069()) {
            if (field694 != 0 && field825 != -1) {
                class218.method3231(Statics.field437, field825, 0, field694, false);
            }
            field826 = false;
        }
    }

    @ObfuscatedName("fc.fl(Ljh;IIII)V")
    public static void method3185(class274 arg0, int arg1, int arg2, int arg3) {
        if (field599 >= 50 || field828 == 0 || arg0.field3557 == null || arg1 >= arg0.field3557.length) {
            return;
        }
        int var4 = arg0.field3557[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field830[field599] = var5;
        field696[field599] = var6;
        field832[field599] = 0;
        field763[field599] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field833[field599] = (var8 << 16) + (var9 << 8) + var7;
        field599++;
    }

    @ObfuscatedName("ec.fw(I)V")
    public static final void method2871() {
        if (!Statics.field246) {
            return;
        }
        if (Statics.field3 != null) {
            Statics.field3.method4988();
        }
        Statics.method162();
        Statics.field246 = false;
    }

    @ObfuscatedName("be.fx(I)V")
    public static final void method984() {
        if (Statics.field2416 != field816) {
            field816 = Statics.field2416;
            method892(Statics.field2416);
        }
    }

    @ObfuscatedName("bw.fj(I)V")
    public static final void method1630() {
        int[] var0 = class82.field1182;
        for (int var1 = 0; var1 < class82.field1181; var1++) {
            class61 var2 = field807[var0[var1]];
            if (var2 != null && var2.field899 > 0) {
                var2.field899--;
                if (var2.field899 == 0) {
                    var2.field896 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field636; var3++) {
            int var4 = field637[var3];
            class73 var5 = field808[var4];
            if (var5 != null && var5.field899 > 0) {
                var5.field899--;
                if (var5.field899 == 0) {
                    var5.field896 = null;
                }
            }
        }
    }

    @ObfuscatedName("ee.fn(Ljava/lang/String;B)V")
    public static final void method2993(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field469.field982 = !Statics.field469.field982;
            class67.method4621();
            if (Statics.field469.field982) {
                class84.method1098(99, "", "Roofs are now all hidden");
            } else {
                class84.method1098(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field611 = !field611;
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            field712 = !field712;
        }
        if (arg0.equalsIgnoreCase("mouseovertext")) {
            field741 = !field741;
        }
        if (field730 >= 2) {
            if (arg0.equalsIgnoreCase("showcoord")) {
                Statics.field988.field3847 = !Statics.field988.field3847;
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                field611 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field611 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method1872();
            }
        }
        class173 var1 = class173.method2882(class170.field2202, field740.field1251);
        var1.field2280.method3246(arg0.length() + 1);
        var1.field2280.method3243(arg0);
        field740.method1873(var1);
    }

    @ObfuscatedName("cj.fb(I)V")
    public static final void method1884() {
        if (field679 == 0) {
            int var0 = Statics.field1949.field901;
            int var1 = Statics.field1949.field919;
            if (Statics.field1980 - var0 < -500 || Statics.field1980 - var0 > 500 || Statics.field482 - var1 < -500 || Statics.field482 - var1 > 500) {
                Statics.field1980 = var0;
                Statics.field482 = var1;
            }
            if (Statics.field1980 != var0) {
                Statics.field1980 += (var0 - Statics.field1980) / 16;
            }
            if (Statics.field482 != var1) {
                Statics.field482 += (var1 - Statics.field482) / 16;
            }
            int var2 = Statics.field1980 >> 7;
            int var3 = Statics.field482 >> 7;
            int var4 = method4568(Statics.field1980, Statics.field482, Statics.field2416);
            int var5 = 0;
            if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                        int var8 = Statics.field2416;
                        if (var8 < 3 && (class51.field446[1][var6][var7] & 0x2) == 2) {
                            var8++;
                        }
                        int var9 = var4 - class51.field448[var8][var6][var7];
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
            if (var10 > field724) {
                field724 += (var10 - field724) / 24;
            } else if (var10 < field724) {
                field724 += (var10 - field724) / 80;
            }
            Statics.field858 = method4568(Statics.field1949.field901, Statics.field1949.field919, Statics.field2416) - field669;
        } else if (field679 == 1) {
            method970();
            short var11 = -1;
            if (class40.field341[33]) {
                var11 = 0;
            } else if (class40.field341[49]) {
                var11 = 1024;
            }
            if (class40.field341[48]) {
                if (var11 == 0) {
                    var11 = 1792;
                } else if (var11 == 1024) {
                    var11 = 1280;
                } else {
                    var11 = 1536;
                }
            } else if (class40.field341[50]) {
                if (var11 == 0) {
                    var11 = 256;
                } else if (var11 == 1024) {
                    var11 = 768;
                } else {
                    var11 = 512;
                }
            }
            byte var12 = 0;
            if (class40.field341[35]) {
                var12 = -1;
            } else if (class40.field341[51]) {
                var12 = 1;
            }
            int var13 = 0;
            if (var11 >= 0 || var12 != 0) {
                int var14 = class40.field341[81] ? field674 : field673;
                var13 = var14 * 16;
                field805 = var11;
                field672 = var12;
            }
            if (field603 < var13) {
                field603 += var13 / 8;
                if (field603 > var13) {
                    field603 = var13;
                }
            } else if (field603 > var13) {
                field603 = field603 * 9 / 10;
            }
            if (field603 > 0) {
                int var15 = field603 / 16;
                if (field805 >= 0) {
                    int var16 = field805 - Statics.field508 & 0x7FF;
                    int var17 = class123.field1703[var16];
                    int var18 = class123.field1709[var16];
                    Statics.field1980 += var15 * var17 / 65536;
                    Statics.field482 += var15 * var18 / 65536;
                }
                if (field672 != 0) {
                    Statics.field858 += field672 * var15;
                    if (Statics.field858 > 0) {
                        Statics.field858 = 0;
                    }
                }
            } else {
                field805 = -1;
                field672 = -1;
            }
            if (class40.field341[13]) {
                field740.method1873(class173.method2882(class170.field2184, field740.field1251));
                field679 = 0;
            }
        }
        if (class49.field425 == 4 && Statics.field58) {
            int var19 = class49.field418 - field628;
            field768 = var19 * 2;
            field628 = var19 == -1 || var19 == 1 ? class49.field418 : (field628 + class49.field418) / 2;
            int var20 = field718 - class49.field426;
            field664 = var20 * 2;
            field718 = var20 == -1 || var20 == 1 ? class49.field426 : (field718 + class49.field426) / 2;
        } else {
            if (class40.field341[96]) {
                field664 += (-24 - field664) / 2;
            } else if (class40.field341[97]) {
                field664 += (24 - field664) / 2;
            } else {
                field664 /= 2;
            }
            if (class40.field341[98]) {
                field768 += (12 - field768) / 2;
            } else if (class40.field341[99]) {
                field768 += (-12 - field768) / 2;
            } else {
                field768 /= 2;
            }
            field628 = class49.field418;
            field718 = class49.field426;
        }
        field663 = field664 / 2 + field663 & 0x7FF;
        field633 += field768 / 2;
        if (field633 < 128) {
            field633 = 128;
        }
        if (field633 > 383) {
            field633 = 383;
        }
    }

    @ObfuscatedName("v.gy(B)V")
    public static final void method436() {
        int var0 = class82.field1181;
        int[] var1 = class82.field1182;
        for (int var2 = 0; var2 < var0; var2++) {
            class61 var3 = field807[var1[var2]];
            if (var3 != null) {
                method1631(var3, 1);
            }
        }
    }

    @ObfuscatedName("bw.gn(Lbs;II)V")
    public static final void method1631(class64 arg0, int arg1) {
        if (arg0.field897 > field680) {
            method1853(arg0);
        } else if (arg0.field902 >= field680) {
            if (field680 == arg0.field902 || arg0.field916 == -1 || arg0.field914 != 0 || arg0.field918 + 1 > class274.method2918(arg0.field916).field3563[arg0.field917]) {
                int var2 = arg0.field902 - arg0.field897;
                int var3 = field680 - arg0.field897;
                int var4 = arg0.field926 * 128 + arg0.field886 * 64;
                int var5 = arg0.field928 * 128 + arg0.field886 * 64;
                int var6 = arg0.field927 * 128 + arg0.field886 * 64;
                int var7 = arg0.field889 * 128 + arg0.field886 * 64;
                arg0.field901 = ((var2 - var3) * var4 + var3 * var6) / var2;
                arg0.field919 = ((var2 - var3) * var5 + var3 * var7) / var2;
            }
            arg0.field937 = 0;
            arg0.field935 = arg0.field932;
            arg0.field884 = arg0.field935;
        } else {
            arg0.field913 = arg0.field910;
            if (arg0.field938 == 0) {
                arg0.field937 = 0;
            } else {
                label225: {
                    if (arg0.field916 != -1 && arg0.field914 == 0) {
                        class274 var8 = class274.method2918(arg0.field916);
                        if (arg0.field943 > 0 && var8.field3565 == 0) {
                            arg0.field937++;
                            break label225;
                        }
                        if (arg0.field943 <= 0 && var8.field3564 == 0) {
                            arg0.field937++;
                            break label225;
                        }
                    }
                    int var9 = arg0.field901;
                    int var10 = arg0.field919;
                    int var11 = arg0.field929[arg0.field938 - 1] * 128 + arg0.field886 * 64;
                    int var12 = arg0.field940[arg0.field938 - 1] * 128 + arg0.field886 * 64;
                    if (var9 < var11) {
                        if (var10 < var12) {
                            arg0.field935 = 1280;
                        } else if (var10 > var12) {
                            arg0.field935 = 1792;
                        } else {
                            arg0.field935 = 1536;
                        }
                    } else if (var9 > var11) {
                        if (var10 < var12) {
                            arg0.field935 = 768;
                        } else if (var10 > var12) {
                            arg0.field935 = 256;
                        } else {
                            arg0.field935 = 512;
                        }
                    } else if (var10 < var12) {
                        arg0.field935 = 1024;
                    } else if (var10 > var12) {
                        arg0.field935 = 0;
                    }
                    byte var13 = arg0.field941[arg0.field938 - 1];
                    if (var11 - var9 <= 256 && var11 - var9 >= -256 && var12 - var10 <= 256 && var12 - var10 >= -256) {
                        int var14 = arg0.field935 - arg0.field884 & 0x7FF;
                        if (var14 > 1024) {
                            var14 -= 2048;
                        }
                        int var15 = arg0.field892;
                        if (var14 >= -256 && var14 <= 256) {
                            var15 = arg0.field891;
                        } else if (var14 >= 256 && var14 < 768) {
                            var15 = arg0.field894;
                        } else if (var14 >= -768 && var14 <= -256) {
                            var15 = arg0.field883;
                        }
                        if (var15 == -1) {
                            var15 = arg0.field891;
                        }
                        arg0.field913 = var15;
                        int var16 = 4;
                        boolean var17 = true;
                        if (arg0 instanceof class73) {
                            var17 = ((class73) arg0).field1059.field3534;
                        }
                        if (var17) {
                            if (arg0.field935 != arg0.field884 && arg0.field936 == -1 && arg0.field930 != 0) {
                                var16 = 2;
                            }
                            if (arg0.field938 > 2) {
                                var16 = 6;
                            }
                            if (arg0.field938 > 3) {
                                var16 = 8;
                            }
                            if (arg0.field937 > 0 && arg0.field938 > 1) {
                                var16 = 8;
                                arg0.field937--;
                            }
                        } else {
                            if (arg0.field938 > 1) {
                                var16 = 6;
                            }
                            if (arg0.field938 > 2) {
                                var16 = 8;
                            }
                            if (arg0.field937 > 0 && arg0.field938 > 1) {
                                var16 = 8;
                                arg0.field937--;
                            }
                        }
                        if (var13 == 2) {
                            var16 <<= 0x1;
                        }
                        if (var16 >= 8 && arg0.field913 == arg0.field891 && arg0.field895 != -1) {
                            arg0.field913 = arg0.field895;
                        }
                        if (var9 != var11 || var10 != var12) {
                            if (var9 < var11) {
                                arg0.field901 += var16;
                                if (arg0.field901 > var11) {
                                    arg0.field901 = var11;
                                }
                            } else if (var9 > var11) {
                                arg0.field901 -= var16;
                                if (arg0.field901 < var11) {
                                    arg0.field901 = var11;
                                }
                            }
                            if (var10 < var12) {
                                arg0.field919 += var16;
                                if (arg0.field919 > var12) {
                                    arg0.field919 = var12;
                                }
                            } else if (var10 > var12) {
                                arg0.field919 -= var16;
                                if (arg0.field919 < var12) {
                                    arg0.field919 = var12;
                                }
                            }
                        }
                        if (arg0.field901 == var11 && arg0.field919 == var12) {
                            arg0.field938--;
                            if (arg0.field943 > 0) {
                                arg0.field943--;
                            }
                        }
                    } else {
                        arg0.field901 = var11;
                        arg0.field919 = var12;
                        arg0.field938--;
                        if (arg0.field943 > 0) {
                            arg0.field943--;
                        }
                    }
                }
            }
        }
        if (arg0.field901 < 128 || arg0.field919 < 128 || arg0.field901 >= 13184 || arg0.field919 >= 13184) {
            arg0.field916 = -1;
            arg0.field921 = -1;
            arg0.field897 = 0;
            arg0.field902 = 0;
            arg0.field901 = arg0.field929[0] * 128 + arg0.field886 * 64;
            arg0.field919 = arg0.field940[0] * 128 + arg0.field886 * 64;
            arg0.method1475();
        }
        if (Statics.field1949 == arg0 && (arg0.field901 < 1536 || arg0.field919 < 1536 || arg0.field901 >= 11776 || arg0.field919 >= 11776)) {
            arg0.field916 = -1;
            arg0.field921 = -1;
            arg0.field897 = 0;
            arg0.field902 = 0;
            arg0.field901 = arg0.field929[0] * 128 + arg0.field886 * 64;
            arg0.field919 = arg0.field940[0] * 128 + arg0.field886 * 64;
            arg0.method1475();
        }
        method2863(arg0);
        method537(arg0);
    }

    @ObfuscatedName("cs.gb(Lbs;I)V")
    public static final void method1853(class64 arg0) {
        int var1 = arg0.field897 - field680;
        int var2 = arg0.field926 * 128 + arg0.field886 * 64;
        int var3 = arg0.field928 * 128 + arg0.field886 * 64;
        arg0.field901 += (var2 - arg0.field901) / var1;
        arg0.field919 += (var3 - arg0.field919) / var1;
        arg0.field937 = 0;
        arg0.field935 = arg0.field932;
    }

    @ObfuscatedName("dy.go(Lbs;I)V")
    public static final void method2863(class64 arg0) {
        if (arg0.field930 == 0) {
            return;
        }
        if (arg0.field936 != -1) {
            class64 var1 = null;
            if (arg0.field936 < 32768) {
                var1 = field808[arg0.field936];
            } else if (arg0.field936 >= 32768) {
                var1 = field807[arg0.field936 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field901 - var1.field901;
                int var3 = arg0.field919 - var1.field919;
                if (var2 != 0 || var3 != 0) {
                    arg0.field935 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field911) {
                arg0.field936 = -1;
                arg0.field911 = false;
            }
        }
        if (arg0.field898 != -1 && (arg0.field938 == 0 || arg0.field937 > 0)) {
            arg0.field935 = arg0.field898;
            arg0.field898 = -1;
        }
        int var4 = arg0.field935 - arg0.field884 & 0x7FF;
        if (var4 == 0 && arg0.field911) {
            arg0.field936 = -1;
            arg0.field911 = false;
        }
        if (var4 == 0) {
            arg0.field931 = 0;
            return;
        }
        arg0.field931++;
        if (var4 > 1024) {
            arg0.field884 -= arg0.field930;
            boolean var5 = true;
            if (var4 < arg0.field930 || var4 > 2048 - arg0.field930) {
                arg0.field884 = arg0.field935;
                var5 = false;
            }
            if (arg0.field913 == arg0.field910 && (arg0.field931 > 25 || var5)) {
                if (arg0.field893 == -1) {
                    arg0.field913 = arg0.field891;
                } else {
                    arg0.field913 = arg0.field893;
                }
            }
        } else {
            arg0.field884 += arg0.field930;
            boolean var6 = true;
            if (var4 < arg0.field930 || var4 > 2048 - arg0.field930) {
                arg0.field884 = arg0.field935;
                var6 = false;
            }
            if (arg0.field913 == arg0.field910 && (arg0.field931 > 25 || var6)) {
                if (arg0.field890 == -1) {
                    arg0.field913 = arg0.field891;
                } else {
                    arg0.field913 = arg0.field890;
                }
            }
        }
        arg0.field884 &= 0x7FF;
    }

    @ObfuscatedName("aw.gi(Lbs;I)V")
    public static final void method537(class64 arg0) {
        arg0.field885 = false;
        if (arg0.field913 != -1) {
            class274 var1 = class274.method2918(arg0.field913);
            if (var1 == null || var1.field3554 == null) {
                arg0.field913 = -1;
            } else {
                arg0.field915++;
                if (arg0.field912 < var1.field3554.length && arg0.field915 > var1.field3563[arg0.field912]) {
                    arg0.field915 = 1;
                    arg0.field912++;
                    method3185(var1, arg0.field912, arg0.field901, arg0.field919);
                }
                if (arg0.field912 >= var1.field3554.length) {
                    arg0.field915 = 0;
                    arg0.field912 = 0;
                    method3185(var1, arg0.field912, arg0.field901, arg0.field919);
                }
            }
        }
        if (arg0.field921 != -1 && field680 >= arg0.field924) {
            if (arg0.field922 < 0) {
                arg0.field922 = 0;
            }
            int var2 = class259.method973(arg0.field921).field3293;
            if (var2 == -1) {
                arg0.field921 = -1;
            } else {
                class274 var3 = class274.method2918(var2);
                if (var3 == null || var3.field3554 == null) {
                    arg0.field921 = -1;
                } else {
                    arg0.field904++;
                    if (arg0.field922 < var3.field3554.length && arg0.field904 > var3.field3563[arg0.field922]) {
                        arg0.field904 = 1;
                        arg0.field922++;
                        method3185(var3, arg0.field922, arg0.field901, arg0.field919);
                    }
                    if (arg0.field922 >= var3.field3554.length && (arg0.field922 < 0 || arg0.field922 >= var3.field3554.length)) {
                        arg0.field921 = -1;
                    }
                }
            }
        }
        if (arg0.field916 != -1 && arg0.field914 <= 1) {
            class274 var4 = class274.method2918(arg0.field916);
            if (var4.field3565 == 1 && arg0.field943 > 0 && arg0.field897 <= field680 && arg0.field902 < field680) {
                arg0.field914 = 1;
                return;
            }
        }
        if (arg0.field916 != -1 && arg0.field914 == 0) {
            class274 var5 = class274.method2918(arg0.field916);
            if (var5 == null || var5.field3554 == null) {
                arg0.field916 = -1;
            } else {
                arg0.field918++;
                if (arg0.field917 < var5.field3554.length && arg0.field918 > var5.field3563[arg0.field917]) {
                    arg0.field918 = 1;
                    arg0.field917++;
                    method3185(var5, arg0.field917, arg0.field901, arg0.field919);
                }
                if (arg0.field917 >= var5.field3554.length) {
                    arg0.field917 -= var5.field3558;
                    arg0.field920++;
                    if (arg0.field920 >= var5.field3553) {
                        arg0.field916 = -1;
                    } else if (arg0.field917 >= 0 && arg0.field917 < var5.field3554.length) {
                        method3185(var5, arg0.field917, arg0.field901, arg0.field919);
                    } else {
                        arg0.field916 = -1;
                    }
                }
                arg0.field885 = var5.field3560;
            }
        }
        if (arg0.field914 > 0) {
            arg0.field914--;
        }
    }

    @ObfuscatedName("et.gu(Lbu;IIB)V")
    public static void method2960(class61 arg0, int arg1, int arg2) {
        if (arg0.field916 == arg1 && arg1 != -1) {
            int var3 = class274.method2918(arg1).field3567;
            if (var3 == 1) {
                arg0.field917 = 0;
                arg0.field918 = 0;
                arg0.field914 = arg2;
                arg0.field920 = 0;
            }
            if (var3 == 2) {
                arg0.field920 = 0;
            }
        } else if (arg1 == -1 || arg0.field916 == -1 || class274.method2918(arg1).field3561 >= class274.method2918(arg0.field916).field3561) {
            arg0.field916 = arg1;
            arg0.field917 = 0;
            arg0.field918 = 0;
            arg0.field914 = arg2;
            arg0.field920 = 0;
            arg0.field943 = arg0.field938;
        }
    }

    @ObfuscatedName("fr.gk(II)V")
    public static void method3164(int arg0) {
        field804 = 0L;
        if (arg0 >= 2) {
            field676 = true;
        } else {
            field676 = false;
        }
        int var1 = field676 ? 2 : 1;
        if (var1 == 1) {
            Statics.field322.method805(765, 503);
        } else {
            Statics.field322.method805(7680, 2160);
        }
        if (field612 < 25) {
            return;
        }
        class173 var2 = class173.method2882(class170.field2207, field740.field1251);
        class190 var3 = var2.field2280;
        int var4 = field676 ? 2 : 1;
        var3.method3246(var4);
        var2.field2280.method3296(Statics.field71);
        var2.field2280.method3296(Statics.field327);
        field740.method1873(var2);
    }

    @ObfuscatedName("client.u(B)V")
    public final void method781() {
        field804 = class185.method3151() + 500L;
        this.method1354();
        if (field753 != -1) {
            this.method1114(true);
        }
    }

    @ObfuscatedName("client.ge(B)V")
    public void method1354() {
        int var1 = Statics.field71;
        int var2 = Statics.field327;
        if (this.field394 < var1) {
            int var3 = this.field394;
        }
        if (this.field416 < var2) {
            int var4 = this.field416;
        }
        if (Statics.field469 == null) {
            return;
        }
        try {
            client var5 = Statics.field322;
            int var6 = field676 ? 2 : 1;
            Object[] var7 = new Object[] { var6 };
            JSObject.getWindow(var5).call("resize", var7);
        } catch (Throwable var9) {
        }
    }

    @ObfuscatedName("client.gh(I)V")
    public final void method1162() {
        if (field753 != -1) {
            method455(field753);
        }
        for (int var1 = 0; var1 < field794; var1++) {
            if (field796[var1]) {
                field797[var1] = true;
            }
            field798[var1] = field796[var1];
            field796[var1] = false;
        }
        field795 = field680;
        field742 = -1;
        field668 = -1;
        Statics.field3689 = null;
        if (field753 != -1) {
            field794 = 0;
            method4009(field753, 0, 0, Statics.field71, Statics.field327, 0, 0, -1);
        }
        class315.method5327();
        if (field847) {
            int var2 = Statics.field304;
            int var3 = Statics.field559;
            int var4 = Statics.field1898;
            int var5 = Statics.field1889;
            int var6 = 6116423;
            class315.method5400(var2, var3, var4, var5, var6);
            class315.method5400(var2 + 1, var3 + 1, var4 - 2, 16, 0);
            class315.method5343(var2 + 1, var3 + 18, var4 - 2, var5 - 19, 0);
            Statics.field500.method5114(class238.field2968, var2 + 3, var3 + 14, var6, -1);
            int var7 = class49.field426;
            int var8 = class49.field418;
            for (int var9 = 0; var9 < field658; var9++) {
                int var10 = (field658 - 1 - var9) * 15 + var3 + 31;
                int var11 = 16777215;
                if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                    var11 = 16776960;
                }
                Statics.field500.method5114(method4225(var9), var2 + 3, var10, var11, 0);
            }
            int var12 = Statics.field304;
            int var13 = Statics.field559;
            int var14 = Statics.field1898;
            int var15 = Statics.field1889;
            for (int var16 = 0; var16 < field794; var16++) {
                if (field801[var16] + field799[var16] > var12 && field799[var16] < var12 + var14 && field800[var16] + field605[var16] > var13 && field800[var16] < var13 + var15) {
                    field797[var16] = true;
                }
            }
        } else if (field742 != -1) {
            method1087(field742, field668);
        }
        if (field803 == 3) {
            for (int var17 = 0; var17 < field794; var17++) {
                if (field798[var17]) {
                    class315.method5399(field799[var17], field800[var17], field801[var17], field605[var17], 16711935, 128);
                } else if (field797[var17]) {
                    class315.method5399(field799[var17], field800[var17], field801[var17], field605[var17], 16711680, 128);
                }
            }
        }
        int var18 = Statics.field2416;
        int var19 = Statics.field1949.field901;
        int var20 = Statics.field1949.field919;
        int var21 = field655;
        for (class69 var22 = (class69) class69.field1003.method3797(); var22 != null; var22 = (class69) class69.field1003.method3788()) {
            if (var22.field1005 != -1 || var22.field1009 != null) {
                int var23 = 0;
                if (var19 > var22.field1002) {
                    var23 += var19 - var22.field1002;
                } else if (var19 < var22.field1001) {
                    var23 += var22.field1001 - var19;
                }
                if (var20 > var22.field1006) {
                    var23 += var20 - var22.field1006;
                } else if (var20 < var22.field1008) {
                    var23 += var22.field1008 - var20;
                }
                if (var23 - 64 > var22.field1012 || field828 == 0 || var22.field999 != var18) {
                    if (var22.field1007 != null) {
                        Statics.field1907.method1904(var22.field1007);
                        var22.field1007 = null;
                    }
                    if (var22.field1011 != null) {
                        Statics.field1907.method1904(var22.field1011);
                        var22.field1011 = null;
                    }
                } else {
                    var23 -= 64;
                    if (var23 < 0) {
                        var23 = 0;
                    }
                    int var24 = field828 * (var22.field1012 - var23) / var22.field1012;
                    class92 var10000;
                    if (var22.field1007 != null) {
                        var22.field1007.method2145(var24);
                    } else if (var22.field1005 >= 0) {
                        var10000 = (class92) null;
                        class92 var25 = class92.method1964(Statics.field1460, var22.field1005, 0);
                        if (var25 != null) {
                            class94 var26 = var25.method1960().method2008(Statics.field3167);
                            class104 var27 = class104.method2185(var26, 100, var24);
                            var27.method2144(-1);
                            Statics.field1907.method1903(var27);
                            var22.field1007 = var27;
                        }
                    }
                    if (var22.field1011 != null) {
                        var22.field1011.method2145(var24);
                        if (!var22.field1011.method3783()) {
                            var22.field1011 = null;
                        }
                    } else if (var22.field1009 != null && (var22.field1010 -= var21) <= 0) {
                        int var28 = (int) (Math.random() * (double) var22.field1009.length);
                        var10000 = (class92) null;
                        class92 var29 = class92.method1964(Statics.field1460, var22.field1009[var28], 0);
                        if (var29 != null) {
                            class94 var30 = var29.method1960().method2008(Statics.field3167);
                            class104 var31 = class104.method2185(var30, 100, var24);
                            var31.method2144(0);
                            Statics.field1907.method1903(var31);
                            var22.field1011 = var31;
                            var22.field1010 = var22.field998 + (int) (Math.random() * (double) (var22.field1004 - var22.field998));
                        }
                    }
                }
            }
        }
        field655 = 0;
    }

    @ObfuscatedName("c.gq(Ljava/lang/String;ZS)V")
    public static final void method188(String arg0, boolean arg1) {
        if (!field716) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field525.method5111(arg0, 250);
        int var6 = Statics.field525.method5112(arg0, 250) * 13;
        class315.method5400(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class315.method5343(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field525.method5162(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method558(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field456.method731(0, 0);
        } else {
            method4234(var3, var4, var5, var6);
        }
    }

    @ObfuscatedName("ah.gp(IIIII)V")
    public static final void method614(int arg0, int arg1, int arg2, int arg3) {
        field691++;
        if (Statics.field1949.field901 >> 7 == field821 && Statics.field1949.field919 >> 7 == field822) {
            field821 = 0;
        }
        method2967();
        method15();
        method2600(true);
        int var4 = class82.field1181;
        int[] var5 = class82.field1182;
        for (int var6 = 0; var6 < var4; var6++) {
            if (field720 != var5[var6] && field710 != var5[var6]) {
                method518(field807[var5[var6]], true);
            }
        }
        method2600(false);
        method1791();
        method527();
        method2880(arg0, arg1, arg2, arg3, true);
        int var7 = field849;
        int var8 = field850;
        int var9 = field835;
        int var10 = field662;
        class315.method5328(var7, var8, var7 + var9, var8 + var10);
        class123.method2637();
        if (!field747) {
            int var11 = field633;
            if (field724 / 256 > var11) {
                var11 = field724 / 256;
            }
            if (field836[4] && field838[4] + 128 > var11) {
                var11 = field838[4] + 128;
            }
            int var12 = field663 & 0x7FF;
            method2878(Statics.field1980, Statics.field858, Statics.field482, var11, var12, var11 * 3 + 600);
        }
        int var13;
        if (field747) {
            var13 = method3546();
        } else {
            var13 = method3108();
        }
        int var14 = Statics.field119;
        int var15 = Statics.field97;
        int var16 = Statics.field103;
        int var17 = Statics.field1936;
        int var18 = Statics.field508;
        for (int var19 = 0; var19 < 5; var19++) {
            if (field836[var19]) {
                int var20 = (int) (Math.random() * (double) (field837[var19] * 2 + 1) - (double) field837[var19] + Math.sin((double) field856[var19] / 100.0D * (double) field766[var19]) * (double) field838[var19]);
                if (var19 == 0) {
                    Statics.field119 += var20;
                }
                if (var19 == 1) {
                    Statics.field97 += var20;
                }
                if (var19 == 2) {
                    Statics.field103 += var20;
                }
                if (var19 == 3) {
                    Statics.field508 = Statics.field508 + var20 & 0x7FF;
                }
                if (var19 == 4) {
                    Statics.field1936 += var20;
                    if (Statics.field1936 < 128) {
                        Statics.field1936 = 128;
                    }
                    if (Statics.field1936 > 383) {
                        Statics.field1936 = 383;
                    }
                }
            }
        }
        int var21 = class49.field426;
        int var22 = class49.field418;
        if (class49.field432 != 0) {
            var21 = class49.field433;
            var22 = class49.field438;
        }
        if (var21 >= var7 && var21 < var7 + var9 && var22 >= var8 && var22 < var8 + var10) {
            class121.method438(var21 - var7, var22 - var8);
        } else {
            class121.method4012();
        }
        method4564();
        class315.method5400(var7, var8, var9, var10, 0);
        method4564();
        int var23 = class123.field1712;
        class123.field1712 = field853;
        Statics.field524.method2743(Statics.field119, Statics.field97, Statics.field103, Statics.field1936, Statics.field508, var13);
        class123.field1712 = var23;
        method4564();
        Statics.field524.method2693();
        field829 = 0;
        boolean var24 = false;
        int var25 = -1;
        int var26 = -1;
        int var27 = class82.field1181;
        int[] var28 = class82.field1182;
        for (int var29 = 0; var29 < field636 + var27; var29++) {
            class64 var30;
            if (var29 < var27) {
                var30 = field807[var28[var29]];
                if (field720 == var28[var29]) {
                    var24 = true;
                    var25 = var29;
                    continue;
                }
                if (Statics.field1949 == var30) {
                    var26 = var29;
                    continue;
                }
            } else {
                var30 = field808[field637[var29 - var27]];
            }
            method4201(var30, var29, var7, var8, var9, var10);
        }
        if (field712 && var26 != -1) {
            method4201(Statics.field1949, var26, var7, var8, var9, var10);
        }
        if (var24) {
            method4201(field807[field720], var25, var7, var8, var9, var10);
        }
        for (int var31 = 0; var31 < field829; var31++) {
            int var32 = field682[var31];
            int var33 = field683[var31];
            int var34 = field685[var31];
            int var35 = field684[var31];
            boolean var36 = true;
            while (var36) {
                var36 = false;
                for (int var37 = 0; var37 < var31; var37++) {
                    if (var33 + 2 > field683[var37] - field684[var37] && var33 - var35 < field683[var37] + 2 && var32 - var34 < field685[var37] + field682[var37] && var32 + var34 > field682[var37] - field685[var37] && field683[var37] - field684[var37] < var33) {
                        var33 = field683[var37] - field684[var37];
                        var36 = true;
                    }
                }
            }
            field692 = field682[var31];
            field693 = field683[var31] = var33;
            String var38 = field733[var31];
            if (field755 == 0) {
                int var39 = 16776960;
                if (field812[var31] < 6) {
                    var39 = field806[field812[var31]];
                }
                if (field812[var31] == 6) {
                    var39 = field691 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field812[var31] == 7) {
                    var39 = field691 % 20 < 10 ? 255 : 65535;
                }
                if (field812[var31] == 8) {
                    var39 = field691 % 20 < 10 ? 45056 : 8454016;
                }
                if (field812[var31] == 9) {
                    int var40 = 150 - field688[var31];
                    if (var40 < 50) {
                        var39 = var40 * 1280 + 16711680;
                    } else if (var40 < 100) {
                        var39 = 16776960 - (var40 - 50) * 327680;
                    } else if (var40 < 150) {
                        var39 = (var40 - 100) * 5 + 65280;
                    }
                }
                if (field812[var31] == 10) {
                    int var41 = 150 - field688[var31];
                    if (var41 < 50) {
                        var39 = var41 * 5 + 16711680;
                    } else if (var41 < 100) {
                        var39 = 16711935 - (var41 - 50) * 327680;
                    } else if (var41 < 150) {
                        var39 = (var41 - 100) * 327680 + 255 - (var41 - 100) * 5;
                    }
                }
                if (field812[var31] == 11) {
                    int var42 = 150 - field688[var31];
                    if (var42 < 50) {
                        var39 = 16777215 - var42 * 327685;
                    } else if (var42 < 100) {
                        var39 = (var42 - 50) * 327685 + 65280;
                    } else if (var42 < 150) {
                        var39 = 16777215 - (var42 - 100) * 327680;
                    }
                }
                if (field687[var31] == 0) {
                    Statics.field500.method5134(var38, field692 + var7, field693 + var8, var39, 0);
                }
                if (field687[var31] == 1) {
                    Statics.field500.method5119(var38, field692 + var7, field693 + var8, var39, 0, field691);
                }
                if (field687[var31] == 2) {
                    Statics.field500.method5120(var38, field692 + var7, field693 + var8, var39, 0, field691);
                }
                if (field687[var31] == 3) {
                    Statics.field500.method5121(var38, field692 + var7, field693 + var8, var39, 0, field691, 150 - field688[var31]);
                }
                if (field687[var31] == 4) {
                    int var43 = (150 - field688[var31]) * (Statics.field500.method5109(var38) + 100) / 150;
                    class315.method5395(field692 + var7 - 50, var8, field692 + var7 + 50, var8 + var10);
                    Statics.field500.method5114(var38, field692 + var7 + 50 - var43, field693 + var8, var39, 0);
                    class315.method5328(var7, var8, var7 + var9, var8 + var10);
                }
                if (field687[var31] == 5) {
                    int var44 = 150 - field688[var31];
                    int var45 = 0;
                    if (var44 < 25) {
                        var45 = var44 - 25;
                    } else if (var44 > 125) {
                        var45 = var44 - 125;
                    }
                    class315.method5395(var7, field693 + var8 - Statics.field500.field3714 - 1, var7 + var9, field693 + var8 + 5);
                    Statics.field500.method5134(var38, field692 + var7, field693 + var8 + var45, var39, 0);
                    class315.method5328(var7, var8, var7 + var9, var8 + var10);
                }
            } else {
                Statics.field500.method5134(var38, field692 + var7, field693 + var8, 16776960, 0);
            }
        }
        method1531(var7, var8);
        ((class112) Statics.field1713).method2377(field655);
        if (field665) {
            if (field697 == 1) {
                Statics.field1461[field844 / 100].method5448(field744 - 8, field840 - 8);
            }
            if (field697 == 2) {
                Statics.field1461[field844 / 100 + 4].method5448(field744 - 8, field840 - 8);
            }
        }
        field707 = 0;
        int var46 = (Statics.field1949.field901 >> 7) + Statics.field2316;
        int var47 = (Statics.field1949.field919 >> 7) + Statics.field1052;
        if (var46 >= 3053 && var46 <= 3156 && var47 >= 3056 && var47 <= 3136) {
            field707 = 1;
        }
        if (var46 >= 3072 && var46 <= 3118 && var47 >= 9492 && var47 <= 9535) {
            field707 = 1;
        }
        if (field707 == 1 && var46 >= 3139 && var46 <= 3199 && var47 >= 3008 && var47 <= 3062) {
            field707 = 0;
        }
        Statics.field119 = var14;
        Statics.field97 = var15;
        Statics.field103 = var16;
        Statics.field1936 = var17;
        Statics.field508 = var18;
        if (field604 && class251.method2367(true, false) == 0) {
            field604 = false;
        }
        if (field604) {
            class315.method5400(var7, var8, var9, var10, 0);
            method188(class238.field2918, false);
        }
    }

    @ObfuscatedName("ef.gs(IIIIZI)V")
    public static final void method2880(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field842 - field746) * var5 / 100 + field746;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field708) {
            short var8 = field708;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field864) {
                var6 = field864;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class315.method5327();
                    class315.method5400(arg0, arg1, var10, arg3, -16777216);
                    class315.method5400(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field848) {
            short var11 = field848;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field845) {
                var6 = field845;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class315.method5327();
                    class315.method5400(arg0, arg1, arg2, var13, -16777216);
                    class315.method5400(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field616 - field843) * var5 / 100 + field843;
        field853 = arg3 * var6 * var14 / 85504 << 1;
        if (field835 != arg2 || field662 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class123.field1703[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class126.method2723(var15, 500, 800, arg2, arg3);
        }
        field849 = arg0;
        field850 = arg1;
        field835 = arg2;
        field662 = arg3;
    }

    @ObfuscatedName("eq.gm(B)V")
    public static void method2967() {
        if (field712) {
            method518(Statics.field1949, false);
        }
    }

    @ObfuscatedName("m.gg(I)V")
    public static void method15() {
        if (field720 >= 0 && field807[field720] != null) {
            method518(field807[field720], false);
        }
    }

    @ObfuscatedName("as.gf(Lbu;ZI)V")
    public static void method518(class61 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method1052() || arg0.field568) {
            return;
        }
        arg0.field580 = false;
        if ((field709 && class82.field1181 > 50 || class82.field1181 > 200) && arg1 && arg0.field913 == arg0.field910) {
            arg0.field580 = true;
        }
        int var2 = arg0.field901 >> 7;
        int var3 = arg0.field919 >> 7;
        if (var2 < 0 || var2 >= 104 || var3 < 0 || var3 >= 104) {
            return;
        }
        long var4 = Statics.method1038(0, 0, 0, false, arg0.field584);
        if (arg0.field575 != null && field680 >= arg0.field576 && field680 < arg0.field571) {
            arg0.field580 = false;
            arg0.field573 = method4568(arg0.field901, arg0.field919, Statics.field2416);
            arg0.field906 = field680;
            Statics.field524.method2758(Statics.field2416, arg0.field901, arg0.field919, arg0.field573, 60, arg0, arg0.field884, var4, arg0.field569, arg0.field574, arg0.field578, arg0.field579);
            return;
        }
        if ((arg0.field901 & 0x7F) == 64 && (arg0.field919 & 0x7F) == 64) {
            if (field691 == field690[var2][var3]) {
                return;
            }
            field690[var2][var3] = field691;
        }
        arg0.field573 = method4568(arg0.field901, arg0.field919, Statics.field2416);
        arg0.field906 = field680;
        Statics.field524.method2732(Statics.field2416, arg0.field901, arg0.field919, arg0.field573, 60, arg0, arg0.field884, var4, arg0.field885);
    }

    @ObfuscatedName("dn.gx(ZI)V")
    public static final void method2600(boolean arg0) {
        for (int var1 = 0; var1 < field636; var1++) {
            class73 var2 = field808[field637[var1]];
            if (var2 != null && var2.method1052() && var2.field1059.field3525 == arg0 && var2.field1059.method4805()) {
                int var3 = var2.field901 >> 7;
                int var4 = var2.field919 >> 7;
                if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
                    if (var2.field886 == 1 && (var2.field901 & 0x7F) == 64 && (var2.field919 & 0x7F) == 64) {
                        if (field691 == field690[var3][var4]) {
                            continue;
                        }
                        field690[var3][var4] = field691;
                    }
                    long var5 = Statics.method1038(0, 0, 1, !var2.field1059.field3536, field637[var1]);
                    var2.field906 = field680;
                    Statics.field524.method2732(Statics.field2416, var2.field901, var2.field919, method4568(var2.field901 + (var2.field886 * 64 - 64), var2.field919 + (var2.field886 * 64 - 64), Statics.field2416), var2.field886 * 64 - 64 + 60, var2, var2.field884, var5, var2.field885);
                }
            }
        }
    }

    @ObfuscatedName("cw.gw(I)V")
    public static final void method1791() {
        for (class80 var0 = (class80) field723.method3797(); var0 != null; var0 = (class80) field723.method3788()) {
            if (Statics.field2416 != var0.field1145 || field680 > var0.field1159) {
                var0.method3782();
            } else if (field680 >= var0.field1151) {
                if (var0.field1155 > 0) {
                    class73 var1 = field808[var0.field1155 - 1];
                    if (var1 != null && var1.field901 >= 0 && var1.field901 < 13312 && var1.field919 >= 0 && var1.field919 < 13312) {
                        var0.method1759(var1.field901, var1.field919, method4568(var1.field901, var1.field919, var0.field1145) - var0.field1157, field680);
                    }
                }
                if (var0.field1155 < 0) {
                    int var2 = -var0.field1155 - 1;
                    class61 var3;
                    if (field710 == var2) {
                        var3 = Statics.field1949;
                    } else {
                        var3 = field807[var2];
                    }
                    if (var3 != null && var3.field901 >= 0 && var3.field901 < 13312 && var3.field919 >= 0 && var3.field919 < 13312) {
                        var0.method1759(var3.field901, var3.field919, method4568(var3.field901, var3.field919, var0.field1145) - var0.field1157, field680);
                    }
                }
                var0.method1761(field655);
                Statics.field524.method2732(Statics.field2416, (int) var0.field1152, (int) var0.field1170, (int) var0.field1156, 60, var0, var0.field1165, -1L, false);
            }
        }
    }

    @ObfuscatedName("as.ga(I)V")
    public static final void method527() {
        for (class71 var0 = (class71) field661.method3797(); var0 != null; var0 = (class71) field661.method3788()) {
            if (Statics.field2416 != var0.field1035 || var0.field1042) {
                var0.method3782();
            } else if (field680 >= var0.field1034) {
                var0.method1691(field655);
                if (var0.field1042) {
                    var0.method3782();
                } else {
                    Statics.field524.method2732(var0.field1035, var0.field1036, var0.field1045, var0.field1038, 60, var0, 0, -1L, false);
                }
            }
        }
    }

    @ObfuscatedName("fi.gj(I)I")
    public static final int method3108() {
        if (Statics.field469.field982) {
            return Statics.field2416;
        }
        int var0 = 3;
        if (Statics.field1936 < 310) {
            int var1;
            int var2;
            if (field679 == 1) {
                var1 = Statics.field1980 >> 7;
                var2 = Statics.field482 >> 7;
            } else {
                var1 = Statics.field1949.field901 >> 7;
                var2 = Statics.field1949.field919 >> 7;
            }
            int var3 = Statics.field119 >> 7;
            int var4 = Statics.field103 >> 7;
            if (var3 < 0 || var4 < 0 || var3 >= 104 || var4 >= 104) {
                return Statics.field2416;
            }
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field2416;
            }
            if ((class51.field446[Statics.field2416][var3][var4] & 0x4) != 0) {
                var0 = Statics.field2416;
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
                    if ((class51.field446[Statics.field2416][var3][var4] & 0x4) != 0) {
                        var0 = Statics.field2416;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var4 < var2) {
                            var4++;
                        } else if (var4 > var2) {
                            var4--;
                        }
                        if ((class51.field446[Statics.field2416][var3][var4] & 0x4) != 0) {
                            var0 = Statics.field2416;
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
                    if ((class51.field446[Statics.field2416][var3][var4] & 0x4) != 0) {
                        var0 = Statics.field2416;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var3 < var1) {
                            var3++;
                        } else if (var3 > var1) {
                            var3--;
                        }
                        if ((class51.field446[Statics.field2416][var3][var4] & 0x4) != 0) {
                            var0 = Statics.field2416;
                        }
                    }
                }
            }
        }
        if (Statics.field1949.field901 >= 0 && Statics.field1949.field919 >= 0 && Statics.field1949.field901 < 13312 && Statics.field1949.field919 < 13312) {
            if ((class51.field446[Statics.field2416][Statics.field1949.field901 >> 7][Statics.field1949.field919 >> 7] & 0x4) != 0) {
                var0 = Statics.field2416;
            }
            return var0;
        } else {
            return Statics.field2416;
        }
    }

    @ObfuscatedName("gu.gv(B)I")
    public static final int method3546() {
        if (Statics.field469.field982) {
            return Statics.field2416;
        } else {
            int var0 = method4568(Statics.field119, Statics.field103, Statics.field2416);
            return var0 - Statics.field97 >= 800 || (class51.field446[Statics.field2416][Statics.field119 >> 7][Statics.field103 >> 7] & 0x4) == 0 ? 3 : Statics.field2416;
        }
    }

    @ObfuscatedName("bb.gd(IIS)V")
    public static final void method1531(int arg0, int arg1) {
        if (field859 == 2) {
            method654((field613 - Statics.field2316 << 7) + field619, (field617 - Statics.field1052 << 7) + field671, field618 * 2);
            if (field692 > -1 && field680 % 20 < 10) {
                Statics.field3336[0].method5448(field692 + arg0 - 12, field693 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("c.gt(B)Z")
    public static boolean method189() {
        return (field713 & 0x4) != 0;
    }

    @ObfuscatedName("fr.gl(Lbu;I)Z")
    public static boolean method3163(class61 arg0) {
        if (field713 == 0) {
            return false;
        } else if (Statics.field1949 == arg0) {
            return (field713 & 0x8) != 0;
        } else {
            boolean var1 = method189();
            if (!var1) {
                boolean var2 = (field713 & 0x1) != 0;
                var1 = var2 && arg0.method1042();
            }
            boolean var3 = var1;
            if (!var1) {
                boolean var4 = (field713 & 0x2) != 0;
                var3 = var4 && arg0.method1045();
            }
            return var3;
        }
    }

    @ObfuscatedName("hl.gz(Lbs;IIIIII)V")
    public static final void method4201(class64 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method1052()) {
            return;
        }
        if (arg0 instanceof class73) {
            class272 var6 = ((class73) arg0).field1059;
            if (var6.field3530 != null) {
                var6 = var6.method4797();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class82.field1181;
        int[] var8 = class82.field1182;
        byte var9 = 0;
        if (arg1 < var7 && field680 == arg0.field906 && method3163((class61) arg0)) {
            class61 var10 = (class61) arg0;
            if (arg1 < var7) {
                method111(arg0, arg0.field923 + 15);
                class300 var11 = (class300) field645.get(class296.field3682);
                byte var12 = 9;
                var11.method5134(var10.field588.method5048(), field692 + arg2, field693 + arg3 - var12, 16777215, 0);
                var9 = 18;
            }
        }
        int var13 = -2;
        if (!arg0.field909.method3759()) {
            method111(arg0, arg0.field923 + 15);
            for (class72 var14 = (class72) arg0.field909.method3756(); var14 != null; var14 = (class72) arg0.field909.method3758()) {
                class65 var15 = var14.method1695(field680);
                if (var15 != null) {
                    class262 var16 = var14.field1047;
                    class319 var17 = var16.method4542();
                    class319 var18 = var16.method4541();
                    int var19 = 0;
                    int var20;
                    if (var17 == null || var18 == null) {
                        var20 = var16.field3334;
                    } else {
                        if (var16.field3335 * 2 < var18.field3795) {
                            var19 = var16.field3335;
                        }
                        var20 = var18.field3795 - var19 * 2;
                    }
                    int var21 = 255;
                    boolean var22 = true;
                    int var23 = field680 - var15.field946;
                    int var24 = var15.field947 * var20 / var16.field3334;
                    int var27;
                    if (var15.field948 > var23) {
                        int var25 = var16.field3322 == 0 ? 0 : var23 / var16.field3322 * var16.field3322;
                        int var26 = var15.field949 * var20 / var16.field3334;
                        var27 = (var24 - var26) * var25 / var15.field948 + var26;
                    } else {
                        var27 = var24;
                        int var28 = var15.field948 + var16.field3331 - var23;
                        if (var16.field3329 >= 0) {
                            var21 = (var28 << 8) / (var16.field3331 - var16.field3329);
                        }
                    }
                    if (var15.field947 > 0 && var27 < 1) {
                        var27 = 1;
                    }
                    if (var17 == null || var18 == null) {
                        var13 += 5;
                        if (field692 > -1) {
                            int var34 = field692 + arg2 - (var20 >> 1);
                            int var35 = field693 + arg3 - var13;
                            class315.method5400(var34, var35, var27, 5, 65280);
                            class315.method5400(var27 + var34, var35, var20 - var27, 5, 16711680);
                        }
                        var13 += 2;
                    } else {
                        int var29;
                        if (var20 == var27) {
                            var29 = var19 * 2 + var27;
                        } else {
                            var29 = var19 + var27;
                        }
                        int var30 = var17.field3802;
                        var13 += var30;
                        int var31 = field692 + arg2 - (var20 >> 1);
                        int var32 = field693 + arg3 - var13;
                        int var33 = var31 - var19;
                        if (var21 >= 0 && var21 < 255) {
                            var17.method5458(var33, var32, var21);
                            class315.method5395(var33, var32, var29 + var33, var30 + var32);
                            var18.method5458(var33, var32, var21);
                        } else {
                            var17.method5448(var33, var32);
                            class315.method5395(var33, var32, var29 + var33, var30 + var32);
                            var18.method5448(var33, var32);
                        }
                        class315.method5328(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var13 += 2;
                    }
                } else if (var14.method1696()) {
                    var14.method3782();
                }
            }
        }
        if (var13 == -2) {
            var13 += 7;
        }
        int var36 = var9 + var13;
        if (arg1 < var7) {
            class61 var37 = (class61) arg0;
            if (var37.field568) {
                return;
            }
            if (var37.field564 != -1 || var37.field565 != -1) {
                method111(arg0, arg0.field923 + 15);
                if (field692 > -1) {
                    if (var37.field564 != -1) {
                        var36 += 25;
                        Statics.field887[var37.field564].method5448(field692 + arg2 - 12, field693 + arg3 - var36);
                    }
                    if (var37.field565 != -1) {
                        var36 += 25;
                        Statics.field336[var37.field565].method5448(field692 + arg2 - 12, field693 + arg3 - var36);
                    }
                }
            }
            if (arg1 >= 0 && field859 == 10 && field615 == var8[arg1]) {
                method111(arg0, arg0.field923 + 15);
                if (field692 > -1) {
                    int var38 = Statics.field3336[1].field3802 + var36;
                    Statics.field3336[1].method5448(field692 + arg2 - 12, field693 + arg3 - var38);
                }
            }
        } else {
            class272 var39 = ((class73) arg0).field1059;
            if (var39.field3530 != null) {
                var39 = var39.method4797();
            }
            if (var39.field3528 >= 0 && var39.field3528 < Statics.field336.length) {
                method111(arg0, arg0.field923 + 15);
                if (field692 > -1) {
                    Statics.field336[var39.field3528].method5448(field692 + arg2 - 12, field693 + arg3 - 30);
                }
            }
            if (field859 == 1 && field614 == field637[arg1 - var7] && field680 % 20 < 10) {
                method111(arg0, arg0.field923 + 15);
                if (field692 > -1) {
                    Statics.field3336[0].method5448(field692 + arg2 - 12, field693 + arg3 - 28);
                }
            }
        }
        if (arg0.field896 != null && (arg1 >= var7 || !arg0.field942 && (field852 == 4 || !arg0.field939 && (field852 == 0 || field852 == 3 || field852 == 1 && ((class61) arg0).method1042())))) {
            method111(arg0, arg0.field923);
            if (field692 > -1 && field829 < field635) {
                field685[field829] = Statics.field500.method5109(arg0.field896) / 2;
                field684[field829] = Statics.field500.field3714;
                field682[field829] = field692;
                field683[field829] = field693;
                field812[field829] = arg0.field900;
                field687[field829] = arg0.field888;
                field688[field829] = arg0.field899;
                field733[field829] = arg0.field896;
                field829++;
            }
        }
        for (int var40 = 0; var40 < 4; var40++) {
            int var41 = arg0.field882[var40];
            int var42 = arg0.field944[var40];
            class268 var43 = null;
            int var44 = 0;
            if (var42 >= 0) {
                if (var41 <= field680) {
                    continue;
                }
                var43 = class268.method93(arg0.field944[var40]);
                var44 = var43.field3376;
                if (var43 != null && var43.field3384 != null) {
                    var43 = var43.method4629();
                    if (var43 == null) {
                        arg0.field882[var40] = -1;
                        continue;
                    }
                }
            } else if (var41 < 0) {
                continue;
            }
            int var45 = arg0.field907[var40];
            class268 var46 = null;
            if (var45 >= 0) {
                var46 = class268.method93(var45);
                if (var46 != null && var46.field3384 != null) {
                    var46 = var46.method4629();
                }
            }
            if (var41 - var44 <= field680) {
                if (var43 == null) {
                    arg0.field882[var40] = -1;
                } else {
                    method111(arg0, arg0.field923 / 2);
                    if (field692 > -1) {
                        if (var40 == 1) {
                            field693 -= 20;
                        }
                        if (var40 == 2) {
                            field692 -= 15;
                            field693 -= 10;
                        }
                        if (var40 == 3) {
                            field692 += 15;
                            field693 -= 10;
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
                        class319 var59 = null;
                        class319 var60 = null;
                        class319 var61 = null;
                        class319 var62 = null;
                        int var63 = 0;
                        int var64 = 0;
                        int var65 = 0;
                        int var66 = 0;
                        int var67 = 0;
                        int var68 = 0;
                        int var69 = 0;
                        int var70 = 0;
                        int var71 = 0;
                        class319 var72 = var43.method4632();
                        if (var72 != null) {
                            var51 = var72.field3795;
                            int var73 = var72.field3802;
                            if (var73 > var71) {
                                var71 = var73;
                            }
                            var55 = var72.field3796;
                        }
                        class319 var74 = var43.method4624();
                        if (var74 != null) {
                            var52 = var74.field3795;
                            int var75 = var74.field3802;
                            if (var75 > var71) {
                                var71 = var75;
                            }
                            var56 = var74.field3796;
                        }
                        class319 var76 = var43.method4628();
                        if (var76 != null) {
                            var53 = var76.field3795;
                            int var77 = var76.field3802;
                            if (var77 > var71) {
                                var71 = var77;
                            }
                            var57 = var76.field3796;
                        }
                        class319 var78 = var43.method4655();
                        if (var78 != null) {
                            var54 = var78.field3795;
                            int var79 = var78.field3802;
                            if (var79 > var71) {
                                var71 = var79;
                            }
                            var58 = var78.field3796;
                        }
                        if (var46 != null) {
                            var59 = var46.method4632();
                            if (var59 != null) {
                                var63 = var59.field3795;
                                int var80 = var59.field3802;
                                if (var80 > var71) {
                                    var71 = var80;
                                }
                                var67 = var59.field3796;
                            }
                            var60 = var46.method4624();
                            if (var60 != null) {
                                var64 = var60.field3795;
                                int var81 = var60.field3802;
                                if (var81 > var71) {
                                    var71 = var81;
                                }
                                var68 = var60.field3796;
                            }
                            var61 = var46.method4628();
                            if (var61 != null) {
                                var65 = var61.field3795;
                                int var82 = var61.field3802;
                                if (var82 > var71) {
                                    var71 = var82;
                                }
                                var69 = var61.field3796;
                            }
                            var62 = var46.method4655();
                            if (var62 != null) {
                                var66 = var62.field3795;
                                int var83 = var62.field3802;
                                if (var83 > var71) {
                                    var71 = var83;
                                }
                                var70 = var62.field3796;
                            }
                        }
                        class299 var84 = var43.method4630();
                        if (var84 == null) {
                            var84 = Statics.field2265;
                        }
                        class299 var85;
                        if (var46 == null) {
                            var85 = Statics.field2265;
                        } else {
                            var85 = var46.method4630();
                            if (var85 == null) {
                                var85 = Statics.field2265;
                            }
                        }
                        Object var86 = null;
                        String var87 = null;
                        boolean var88 = false;
                        int var89 = 0;
                        String var90 = var43.method4626(arg0.field905[var40]);
                        int var91 = var84.method5109(var90);
                        if (var46 != null) {
                            var87 = var46.method4626(arg0.field908[var40]);
                            var89 = var85.method5109(var87);
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
                        int var108 = arg0.field882[var40] - field680;
                        int var109 = var43.field3372 - var43.field3372 * var108 / var43.field3376;
                        int var110 = var43.field3382 * var108 / var43.field3376 + -var43.field3382;
                        int var111 = field692 + arg2 - (var100 >> 1) + var109;
                        int var112 = field693 + arg3 - 12 + var110;
                        int var113 = var112;
                        int var114 = var71 + var112;
                        int var115 = var43.field3386 + var112 + 15;
                        int var116 = var115 - var84.field3710;
                        int var117 = var84.field3711 + var115;
                        if (var116 < var112) {
                            var113 = var116;
                        }
                        if (var117 > var114) {
                            var114 = var117;
                        }
                        int var118 = 0;
                        if (var46 != null) {
                            var118 = var46.field3386 + var112 + 15;
                            int var119 = var118 - var85.field3710;
                            int var120 = var85.field3711 + var118;
                            if (var119 < var113) {
                                ;
                            }
                            if (var120 > var114) {
                                ;
                            }
                        }
                        int var123 = 255;
                        if (var43.field3371 >= 0) {
                            var123 = (var108 << 8) / (var43.field3376 - var43.field3371);
                        }
                        if (var123 >= 0 && var123 < 255) {
                            if (var72 != null) {
                                var72.method5458(var95 + var111 - var55, var112, var123);
                            }
                            if (var76 != null) {
                                var76.method5458(var96 + var111 - var57, var112, var123);
                            }
                            if (var74 != null) {
                                for (int var124 = 0; var124 < var92; var124++) {
                                    var74.method5458(var52 * var124 + (var97 + var111 - var56), var112, var123);
                                }
                            }
                            if (var78 != null) {
                                var78.method5458(var101 + var111 - var58, var112, var123);
                            }
                            var84.method5115(var90, var98 + var111, var115, var43.field3375, 0, var123);
                            if (var46 != null) {
                                if (var59 != null) {
                                    var59.method5458(var102 + var111 - var67, var112, var123);
                                }
                                if (var61 != null) {
                                    var61.method5458(var103 + var111 - var69, var112, var123);
                                }
                                if (var60 != null) {
                                    for (int var125 = 0; var125 < var93; var125++) {
                                        var60.method5458(var64 * var125 + (var104 + var111 - var68), var112, var123);
                                    }
                                }
                                if (var62 != null) {
                                    var62.method5458(var105 + var111 - var70, var112, var123);
                                }
                                var85.method5115(var87, var106 + var111, var118, var46.field3375, 0, var123);
                            }
                        } else {
                            if (var72 != null) {
                                var72.method5448(var95 + var111 - var55, var112);
                            }
                            if (var76 != null) {
                                var76.method5448(var96 + var111 - var57, var112);
                            }
                            if (var74 != null) {
                                for (int var126 = 0; var126 < var92; var126++) {
                                    var74.method5448(var52 * var126 + (var97 + var111 - var56), var112);
                                }
                            }
                            if (var78 != null) {
                                var78.method5448(var101 + var111 - var58, var112);
                            }
                            var84.method5114(var90, var98 + var111, var115, var43.field3375 | 0xFF000000, 0);
                            if (var46 != null) {
                                if (var59 != null) {
                                    var59.method5448(var102 + var111 - var67, var112);
                                }
                                if (var61 != null) {
                                    var61.method5448(var103 + var111 - var69, var112);
                                }
                                if (var60 != null) {
                                    for (int var127 = 0; var127 < var93; var127++) {
                                        var60.method5448(var64 * var127 + (var104 + var111 - var68), var112);
                                    }
                                }
                                if (var62 != null) {
                                    var62.method5448(var105 + var111 - var70, var112);
                                }
                                var85.method5114(var87, var106 + var111, var118, var46.field3375 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("d.gc(Lbs;II)V")
    public static final void method111(class64 arg0, int arg1) {
        method654(arg0.field901, arg0.field919, arg1);
    }

    @ObfuscatedName("af.gr(IIIB)V")
    public static final void method654(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field692 = -1;
            field693 = -1;
            return;
        }
        int var3 = method4568(arg0, arg1, Statics.field2416) - arg2;
        int var4 = arg0 - Statics.field119;
        int var5 = var3 - Statics.field97;
        int var6 = arg1 - Statics.field103;
        int var7 = class123.field1703[Statics.field1936];
        int var8 = class123.field1709[Statics.field1936];
        int var9 = class123.field1703[Statics.field508];
        int var10 = class123.field1709[Statics.field508];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field692 = field853 * var11 / var15 + field835 / 2;
            field693 = field853 * var14 / var15 + field662 / 2;
        } else {
            field692 = -1;
            field693 = -1;
        }
    }

    @ObfuscatedName("jb.hi(IIIB)I")
    public static final int method4568(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class51.field446[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class51.field448[var5][var3][var4] + class51.field448[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class51.field448[var5][var3][var4 + 1] + class51.field448[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("ef.hm(IIIIIII)V")
    public static final void method2878(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class123.field1703[var6];
            int var12 = class123.field1709[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class123.field1703[var7];
            int var15 = class123.field1709[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field119 = arg0 - var8;
        Statics.field97 = arg1 - var9;
        Statics.field103 = arg2 - var10;
        Statics.field1936 = arg3;
        Statics.field508 = arg4;
        if (field679 == 1 && field730 >= 2 && field680 % 50 == 0 && (Statics.field1980 >> 7 != Statics.field1949.field901 >> 7 || Statics.field482 >> 7 != Statics.field1949.field919 >> 7)) {
            int var17 = Statics.field1949.field582;
            int var18 = (Statics.field1980 >> 7) + Statics.field2316;
            int var19 = (Statics.field482 >> 7) + Statics.field1052;
            method2961(var18, var19, var17, true);
        }
    }

    @ObfuscatedName("br.hj(ZLge;I)V")
    public static final void method992(boolean arg0, class190 arg1) {
        field647 = arg0;
        if (!field647) {
            int var2 = arg1.method3268();
            int var3 = arg1.method3268();
            int var4 = arg1.method3268();
            Statics.field405 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field405[var5][var6] = arg1.method3267();
                }
            }
            Statics.field593 = new int[var4];
            Statics.field1902 = new int[var4];
            Statics.field485 = new int[var4];
            Statics.field59 = new byte[var4][];
            Statics.field1476 = new byte[var4][];
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
                        Statics.field593[var8] = var11;
                        Statics.field1902[var8] = Statics.field2797.method4268("m" + var9 + "_" + var10);
                        Statics.field485[var8] = Statics.field2797.method4268("l" + var9 + "_" + var10);
                        var8++;
                    }
                }
            }
            method5076(var2, var3, true);
            return;
        }
        int var12 = arg1.method3256();
        int var13 = arg1.method3370();
        boolean var14 = arg1.method3247() == 1;
        int var15 = arg1.method3268();
        arg1.method3582();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = arg1.method3555(1);
                    if (var19 == 1) {
                        field653[var16][var17][var18] = arg1.method3555(26);
                    } else {
                        field653[var16][var17][var18] = -1;
                    }
                }
            }
        }
        arg1.method3556();
        Statics.field405 = new int[var15][4];
        for (int var20 = 0; var20 < var15; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field405[var20][var21] = arg1.method3267();
            }
        }
        Statics.field593 = new int[var15];
        Statics.field1902 = new int[var15];
        Statics.field485 = new int[var15];
        Statics.field59 = new byte[var15][];
        Statics.field1476 = new byte[var15][];
        int var22 = 0;
        for (int var23 = 0; var23 < 4; var23++) {
            for (int var24 = 0; var24 < 13; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    int var26 = field653[var23][var24][var25];
                    if (var26 != -1) {
                        int var27 = var26 >> 14 & 0x3FF;
                        int var28 = var26 >> 3 & 0x7FF;
                        int var29 = (var27 / 8 << 8) + var28 / 8;
                        for (int var30 = 0; var30 < var22; var30++) {
                            if (Statics.field593[var30] == var29) {
                                var29 = -1;
                                break;
                            }
                        }
                        if (var29 != -1) {
                            Statics.field593[var22] = var29;
                            int var31 = var29 >> 8 & 0xFF;
                            int var32 = var29 & 0xFF;
                            Statics.field1902[var22] = Statics.field2797.method4268("m" + var31 + "_" + var32);
                            Statics.field485[var22] = Statics.field2797.method4268("l" + var31 + "_" + var32);
                            var22++;
                        }
                    }
                }
            }
        }
        method5076(var12, var13, !var14);
    }

    @ObfuscatedName("kb.hp(IIZB)V")
    public static final void method5076(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field83 == arg0 && Statics.field496 == arg1) {
            return;
        }
        Statics.field83 = arg0;
        Statics.field496 = arg1;
        Statics.method2138(25);
        method188(class238.field2918, true);
        int var3 = Statics.field2316;
        int var4 = Statics.field1052;
        Statics.field2316 = (arg0 - 6) * 8;
        Statics.field1052 = (arg1 - 6) * 8;
        int var5 = Statics.field2316 - var3;
        int var6 = Statics.field1052 - var4;
        int var7 = Statics.field2316;
        int var8 = Statics.field1052;
        for (int var9 = 0; var9 < 32768; var9++) {
            class73 var10 = field808[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field929[var11] -= var5;
                    var10.field940[var11] -= var6;
                }
                var10.field901 -= var5 * 128;
                var10.field919 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class61 var13 = field807[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field929[var14] -= var5;
                    var13.field940[var14] -= var6;
                }
                var13.field901 -= var5 * 128;
                var13.field919 -= var6 * 128;
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
                        field721[var25][var21][var22] = field721[var25][var23][var24];
                    } else {
                        field721[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class63 var26 = (class63) field722.method3797(); var26 != null; var26 = (class63) field722.method3788()) {
            var26.field869 -= var5;
            var26.field881 -= var6;
            if (var26.field869 < 0 || var26.field881 < 0 || var26.field869 >= 104 || var26.field881 >= 104) {
                var26.method3782();
            }
        }
        if (field821 != 0) {
            field821 -= var5;
            field822 -= var6;
        }
        field599 = 0;
        field747 = false;
        Statics.field119 -= var5 << 7;
        Statics.field103 -= var6 << 7;
        Statics.field1980 -= var5 << 7;
        Statics.field482 -= var6 << 7;
        field816 = -1;
        field661.method3789();
        field723.method3789();
        for (int var27 = 0; var27 < 4; var27++) {
            field667[var27].method3110();
        }
    }

    @ObfuscatedName("bo.hd(ZI)V")
    public static final void method981(boolean arg0) {
        method4564();
        field740.field1253++;
        if (field740.field1253 < 50 && !arg0) {
            return;
        }
        field740.field1253 = 0;
        if (field642 || field740.method1899() == null) {
            return;
        }
        class173 var1 = class173.method2882(class170.field2218, field740.field1251);
        field740.method1873(var1);
        try {
            field740.method1888();
        } catch (IOException var3) {
            field642 = true;
        }
    }

    @ObfuscatedName("aa.hv(II)V")
    public static final void method892(int arg0) {
        int[] var1 = Statics.field3634.field3799;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class51.field446[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field524.method2813(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class51.field446[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field524.method2813(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field3634.method5443();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class51.field446[arg0][var10][var9] & 0x18) == 0) {
                    method1480(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class51.field446[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method1480(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field652 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                long var13 = Statics.field524.method2717(Statics.field2416, var11, var12);
                if (var13 != 0L) {
                    int var15 = class121.method94(var13);
                    int var16 = class269.method675(var15).field3418;
                    if (var16 >= 0) {
                        field820[field652] = Statics.field3275[var16].method4442(false);
                        field818[field652] = var11;
                        field819[field652] = var12;
                        field652++;
                    }
                }
            }
        }
        Statics.field456.method5416();
    }

    @ObfuscatedName("bs.hx(IIIIII)V")
    public static final void method1480(int arg0, int arg1, int arg2, int arg3, int arg4) {
        long var5 = Statics.field524.method2714(arg0, arg1, arg2);
        if (var5 != 0L) {
            int var7 = Statics.field524.method2718(arg0, arg1, arg2, var5);
            int var8 = var7 >> 6 & 0x3;
            int var9 = var7 & 0x1F;
            int var10 = arg3;
            if (class121.method456(var5)) {
                var10 = arg4;
            }
            int[] var11 = Statics.field3634.field3799;
            int var12 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var13 = class121.method94(var5);
            class269 var14 = class269.method675(var13);
            if (var14.field3419 == -1) {
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
                class318 var15 = Statics.field1[var14.field3419];
                if (var15 != null) {
                    int var16 = (var14.field3405 * 4 - var15.field3787) / 2;
                    int var17 = (var14.field3421 * 4 - var15.field3788) / 2;
                    var15.method5430(arg1 * 4 + 48 + var16, (104 - arg2 - var14.field3421) * 4 + 48 + var17);
                }
            }
        }
        long var18 = Statics.field524.method2832(arg0, arg1, arg2);
        if (var18 != 0L) {
            int var20 = Statics.field524.method2718(arg0, arg1, arg2, var18);
            int var21 = var20 >> 6 & 0x3;
            int var22 = var20 & 0x1F;
            int var23 = class121.method94(var18);
            class269 var24 = class269.method675(var23);
            if (var24.field3419 != -1) {
                class318 var25 = Statics.field1[var24.field3419];
                if (var25 != null) {
                    int var26 = (var24.field3405 * 4 - var25.field3787) / 2;
                    int var27 = (var24.field3421 * 4 - var25.field3788) / 2;
                    var25.method5430(arg1 * 4 + 48 + var26, (104 - arg2 - var24.field3421) * 4 + 48 + var27);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (class121.method456(var18)) {
                    var28 = 15597568;
                }
                int[] var29 = Statics.field3634.field3799;
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
        long var31 = Statics.field524.method2717(arg0, arg1, arg2);
        if (var31 == 0L) {
            return;
        }
        int var33 = class121.method94(var31);
        class269 var34 = class269.method675(var33);
        if (var34.field3419 == -1) {
            return;
        }
        class318 var35 = Statics.field1[var34.field3419];
        if (var35 != null) {
            int var36 = (var34.field3405 * 4 - var35.field3787) / 2;
            int var37 = (var34.field3421 * 4 - var35.field3788) / 2;
            var35.method5430(arg1 * 4 + 48 + var36, (104 - arg2 - var34.field3421) * 4 + 48 + var37);
        }
    }

    @ObfuscatedName("client.hq(Lcj;I)Z")
    public final boolean method1460(class88 arg0) {
        class158 var2 = arg0.method1899();
        class190 var3 = arg0.field1255;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1247 == null) {
                if (arg0.field1249) {
                    if (!var2.method3038(1)) {
                        return false;
                    }
                    var2.method3041(arg0.field1255.field2366, 0, 1);
                    arg0.field1250 = 0;
                    arg0.field1249 = false;
                }
                var3.field2360 = 0;
                if (var3.method3553()) {
                    if (!var2.method3038(1)) {
                        return false;
                    }
                    var2.method3041(arg0.field1255.field2366, 1, 1);
                    arg0.field1250 = 0;
                }
                arg0.field1249 = true;
                class169[] var4 = new class169[] { class169.field2093, class169.field2128, class169.field2083, class169.field2150, class169.field2080, class169.field2077, class169.field2078, class169.field2120, class169.field2075, class169.field2081, class169.field2135, class169.field2072, class169.field2084, class169.field2085, class169.field2086, class169.field2087, class169.field2123, class169.field2089, class169.field2090, class169.field2100, class169.field2092, class169.field2097, class169.field2094, class169.field2095, class169.field2082, class169.field2088, class169.field2098, class169.field2099, class169.field2129, class169.field2101, class169.field2102, class169.field2103, class169.field2104, class169.field2105, class169.field2106, class169.field2107, class169.field2108, class169.field2109, class169.field2110, class169.field2111, class169.field2073, class169.field2113, class169.field2114, class169.field2115, class169.field2116, class169.field2117, class169.field2118, class169.field2119, class169.field2096, class169.field2121, class169.field2152, class169.field2091, class169.field2124, class169.field2125, class169.field2126, class169.field2127, class169.field2074, class169.field2157, class169.field2158, class169.field2131, class169.field2132, class169.field2133, class169.field2134, class169.field2139, class169.field2136, class169.field2137, class169.field2138, class169.field2153, class169.field2140, class169.field2141, class169.field2122, class169.field2143, class169.field2144, class169.field2130, class169.field2146, class169.field2147, class169.field2145, class169.field2079, class169.field2155, class169.field2151, class169.field2076, class169.field2148, class169.field2154, class169.field2149 };
                int var6 = var3.method3567();
                if (var6 < 0 || var6 >= var4.length) {
                    throw new IOException(var6 + " " + var3.field2360);
                }
                arg0.field1247 = var4[var6];
                arg0.field1248 = arg0.field1247.field2142;
            }
            if (arg0.field1248 == -1) {
                if (!var2.method3038(1)) {
                    return false;
                }
                arg0.method1899().method3041(var3.field2366, 0, 1);
                arg0.field1248 = var3.field2366[0] & 0xFF;
            }
            if (arg0.field1248 == -2) {
                if (!var2.method3038(2)) {
                    return false;
                }
                arg0.method1899().method3041(var3.field2366, 0, 2);
                var3.field2360 = 0;
                arg0.field1248 = var3.method3268();
            }
            if (!var2.method3038(arg0.field1248)) {
                return false;
            }
            var3.field2360 = 0;
            var2.method3041(var3.field2366, 0, arg0.field1248);
            arg0.field1250 = 0;
            field841.method4866();
            arg0.field1254 = arg0.field1246;
            arg0.field1246 = arg0.field1252;
            arg0.field1252 = arg0.field1247;
            if (class169.field2120 == arg0.field1247) {
                method1026(class172.field2274);
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2118 == arg0.field1247) {
                method1026(class172.field2268);
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2158 == arg0.field1247) {
                int var7 = var3.method3307();
                int var8 = var3.method3256();
                if (var8 == 65535) {
                    var8 = -1;
                }
                int var9 = var3.method3478();
                if (var9 == 65535) {
                    var9 = -1;
                }
                int var10 = var3.method3312();
                for (int var11 = var9; var11 <= var8; var11++) {
                    long var12 = ((long) var10 << 32) + (long) var11;
                    class205 var14 = field817.method3748(var12);
                    if (var14 != null) {
                        var14.method3782();
                    }
                    field817.method3747(new class212(var7), var12);
                }
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2122 == arg0.field1247) {
                if (field753 != -1) {
                    method1720(field753, 0);
                }
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2147 == arg0.field1247) {
                int var15 = var3.method3436();
                method4247(var15);
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2083 == arg0.field1247) {
                class66 var16 = new class66();
                var16.field964 = var3.method3271();
                var16.field961 = var3.method3268();
                int var17 = var3.method3267();
                var16.field962 = var17;
                Statics.method2138(45);
                var2.method3043();
                Object var18 = null;
                class79.method5066(var16);
                arg0.field1247 = null;
                return false;
            }
            if (class169.field2137 == arg0.field1247) {
                method1026(class172.field2270);
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2101 == arg0.field1247) {
                Statics.field1454.field994.method4944(var3, arg0.field1248);
                class84.method3154();
                if (Statics.field3 != null) {
                    Statics.field3.method5074();
                }
                field743 = field776;
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2104 == arg0.field1247) {
                method1026(class172.field2273);
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2148 == arg0.field1247) {
                field644 = var3.method3478() * 30;
                field788 = field776;
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2073 == arg0.field1247) {
                String var19 = var3.method3271();
                Object[] var20 = new Object[var19.length() + 1];
                for (int var21 = var19.length() - 1; var21 >= 0; var21--) {
                    if (var19.charAt(var21) == 's') {
                        var20[var21 + 1] = var3.method3271();
                    } else {
                        var20[var21 + 1] = Integer.valueOf(var3.method3267());
                    }
                }
                var20[0] = Integer.valueOf(var3.method3267());
                class57 var22 = new class57();
                var22.field526 = var20;
                class70.method1612(var22);
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2110 == arg0.field1247) {
                Statics.field1454.method1549(var3, arg0.field1248);
                field743 = field776;
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2091 == arg0.field1247) {
                method992(false, arg0.field1255);
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2115 == arg0.field1247) {
                method25(false, var3);
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2081 == arg0.field1247) {
                int var23 = arg0.field1248;
                class313 var24 = new class313();
                var24.field3756 = var3.method3436();
                var24.field3759 = var3.method3267();
                var24.field3757 = new int[var24.field3756];
                var24.field3760 = new int[var24.field3756];
                var24.field3755 = new Field[var24.field3756];
                var24.field3758 = new int[var24.field3756];
                var24.field3761 = new Method[var24.field3756];
                var24.field3762 = new byte[var24.field3756][][];
                for (int var25 = 0; var25 < var24.field3756; var25++) {
                    try {
                        int var26 = var3.method3436();
                        if (var26 == 0 || var26 == 1 || var26 == 2) {
                            String var27 = var3.method3271();
                            String var28 = var3.method3271();
                            int var29 = 0;
                            if (var26 == 1) {
                                var29 = var3.method3267();
                            }
                            var24.field3757[var25] = var26;
                            var24.field3758[var25] = var29;
                            if (class314.method1719(var27).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            var24.field3755[var25] = class314.method1719(var27).getDeclaredField(var28);
                        } else if (var26 == 3 || var26 == 4) {
                            String var30 = var3.method3271();
                            String var31 = var3.method3271();
                            int var32 = var3.method3436();
                            String[] var33 = new String[var32];
                            for (int var34 = 0; var34 < var32; var34++) {
                                var33[var34] = var3.method3271();
                            }
                            String var35 = var3.method3271();
                            byte[][] var36 = new byte[var32][];
                            if (var26 == 3) {
                                for (int var37 = 0; var37 < var32; var37++) {
                                    int var38 = var3.method3267();
                                    var36[var37] = new byte[var38];
                                    var3.method3274(var36[var37], 0, var38);
                                }
                            }
                            var24.field3757[var25] = var26;
                            Class[] var39 = new Class[var32];
                            for (int var40 = 0; var40 < var32; var40++) {
                                var39[var40] = class314.method1719(var33[var40]);
                            }
                            Class var41 = class314.method1719(var35);
                            if (class314.method1719(var30).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            Method[] var42 = class314.method1719(var30).getDeclaredMethods();
                            Method[] var43 = var42;
                            for (int var44 = 0; var44 < var43.length; var44++) {
                                Method var45 = var43[var44];
                                if (var45.getName().equals(var31)) {
                                    Class[] var46 = var45.getParameterTypes();
                                    if (var39.length == var46.length) {
                                        boolean var47 = true;
                                        for (int var48 = 0; var48 < var39.length; var48++) {
                                            if (var39[var48] != var46[var48]) {
                                                var47 = false;
                                                break;
                                            }
                                        }
                                        if (var47 && var41 == var45.getReturnType()) {
                                            var24.field3761[var25] = var45;
                                        }
                                    }
                                }
                            }
                            var24.field3762[var25] = var36;
                        }
                    } catch (ClassNotFoundException var280) {
                        var24.field3760[var25] = -1;
                    } catch (SecurityException var281) {
                        var24.field3760[var25] = -2;
                    } catch (NullPointerException var282) {
                        var24.field3760[var25] = -3;
                    } catch (Exception var283) {
                        var24.field3760[var25] = -4;
                    } catch (Throwable var284) {
                        var24.field3760[var25] = -5;
                    }
                }
                class314.field3763.method3753(var24);
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2082 == arg0.field1247) {
                method992(true, arg0.field1255);
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2080 == arg0.field1247) {
                String var54 = var3.method3271();
                String var55 = class300.method5208(class306.method998(class301.method1037(var3)));
                class84.method1098(6, var54, var55);
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2130 == arg0.field1247) {
                method1026(class172.field2276);
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2084 == arg0.field1247) {
                method1026(class172.field2271);
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2144 == arg0.field1247) {
                Statics.field546 = var3.method3291();
                Statics.field1220 = var3.method3291();
                while (var3.field2360 < arg0.field1248) {
                    int var56 = var3.method3436();
                    class172 var57 = class172.method91()[var56];
                    method1026(var57);
                }
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2134 == arg0.field1247) {
                int var58 = arg0.field1248 + var3.field2360;
                int var59 = var3.method3268();
                int var60 = var3.method3268();
                if (field753 != var59) {
                    field753 = var59;
                    this.method1114(false);
                    method443(field753);
                    class70.method56(field753);
                    for (int var61 = 0; var61 < 100; var61++) {
                        field796[var61] = true;
                    }
                }
                while (var60-- > 0) {
                    int var62 = var3.method3267();
                    int var63 = var3.method3268();
                    int var64 = var3.method3436();
                    class56 var65 = (class56) field827.method3748((long) var62);
                    if (var65 != null && var65.field507 != var63) {
                        method278(var65, true);
                        var65 = null;
                    }
                    if (var65 == null) {
                        var65 = method4607(var62, var63, var64);
                    }
                    var65.field501 = true;
                }
                for (class56 var66 = (class56) field827.method3739(); var66 != null; var66 = (class56) field827.method3740()) {
                    if (var66.field501) {
                        var66.field501 = false;
                    } else {
                        method278(var66, true);
                    }
                }
                field817 = new class203(512);
                while (var3.field2360 < var58) {
                    int var67 = var3.method3267();
                    int var68 = var3.method3268();
                    int var69 = var3.method3268();
                    int var70 = var3.method3267();
                    for (int var71 = var68; var71 <= var69; var71++) {
                        long var72 = ((long) var67 << 32) + (long) var71;
                        field817.method3747(new class212(var70), var72);
                    }
                }
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2111 == arg0.field1247) {
                method1818();
                arg0.field1247 = null;
                return false;
            }
            if (class169.field2077 == arg0.field1247) {
                int var74 = var3.method3267();
                int var75 = var3.method3267();
                int var76 = 0;
                if (Statics.field1093 == null || !Statics.field1093.isValid()) {
                    try {
                        Iterator var77 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                        while (var77.hasNext()) {
                            GarbageCollectorMXBean var78 = (GarbageCollectorMXBean) var77.next();
                            if (var78.isValid()) {
                                Statics.field1093 = var78;
                                field381 = -1L;
                                field413 = -1L;
                            }
                        }
                    } catch (Throwable var279) {
                    }
                }
                if (Statics.field1093 != null) {
                    long var80 = class185.method3151();
                    long var82 = Statics.field1093.getCollectionTime();
                    if (field413 != -1L) {
                        long var84 = var82 - field413;
                        long var86 = var80 - field381;
                        if (var86 != 0L) {
                            var76 = (int) (var84 * 100L / var86);
                        }
                    }
                    field413 = var82;
                    field381 = var80;
                }
                class173 var90 = class173.method2882(class170.field2170, field740.field1251);
                var90.field2280.method3290(var76);
                var90.field2280.method3335(var74);
                var90.field2280.method3444(var75);
                var90.field2280.method3289(field389);
                field740.method1873(var90);
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2099 == arg0.field1247) {
                int var91 = var3.method3267();
                if (field675 != var91) {
                    field675 = var91;
                    if (field679 == 1) {
                        field623 = true;
                    }
                }
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2131 == arg0.field1247) {
                int var92 = var3.method3436();
                class308[] var93 = class308.method2994();
                int var94 = 0;
                class308 var96;
                while (true) {
                    if (var94 >= var93.length) {
                        var96 = null;
                        break;
                    }
                    class308 var95 = var93[var94];
                    if (var95.field3742 == var92) {
                        var96 = var95;
                        break;
                    }
                    var94++;
                }
                Statics.field171 = var96;
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2092 == arg0.field1247) {
                int var97 = var3.method3267();
                class231 var98 = class231.method1097(var97);
                for (int var99 = 0; var99 < var98.field2759.length; var99++) {
                    var98.field2759[var99] = -1;
                    var98.field2759[var99] = 0;
                }
                method3242(var98);
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2151 == arg0.field1247) {
                boolean var100 = var3.method3424() == 1;
                int var101 = var3.method3310();
                class231 var102 = class231.method1097(var101);
                if (var102.field2644 != var100) {
                    var102.field2644 = var100;
                    method3242(var102);
                }
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2121 == arg0.field1247) {
                String var103 = var3.method3271();
                long var104 = var3.method3486();
                long var106 = (long) var3.method3268();
                long var108 = (long) var3.method3266();
                class243 var110 = (class243) class178.method90(class243.method4860(), var3.method3436());
                long var111 = (var106 << 32) + var108;
                boolean var113 = false;
                for (int var114 = 0; var114 < 100; var114++) {
                    if (field810[var114] == var111) {
                        var113 = true;
                        break;
                    }
                }
                if (var110.field3137 && Statics.field1454.method1553(new class292(var103, Statics.field169))) {
                    var113 = true;
                }
                if (!var113 && field707 == 0) {
                    field810[field831] = var111;
                    field831 = (field831 + 1) % 100;
                    String var115 = class300.method5208(class306.method998(class301.method1037(var3)));
                    if (var110.field3143 == -1) {
                        class84.method3018(9, var103, var115, class304.method5224(var104));
                    } else {
                        class84.method3018(9, class75.method619(var110.field3143) + var103, var115, class304.method5224(var104));
                    }
                }
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2123 == arg0.field1247) {
                Statics.field1220 = var3.method3291();
                Statics.field546 = var3.method3291();
                for (int var116 = Statics.field546; var116 < Statics.field546 + 8; var116++) {
                    for (int var117 = Statics.field1220; var117 < Statics.field1220 + 8; var117++) {
                        if (field721[Statics.field2416][var116][var117] != null) {
                            field721[Statics.field2416][var116][var117] = null;
                            method3166(var116, var117);
                        }
                    }
                }
                for (class63 var118 = (class63) field722.method3797(); var118 != null; var118 = (class63) field722.method3788()) {
                    if (var118.field869 >= Statics.field546 && var118.field869 < Statics.field546 + 8 && var118.field881 >= Statics.field1220 && var118.field881 < Statics.field1220 + 8 && Statics.field2416 == var118.field874) {
                        var118.field878 = 0;
                    }
                }
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2087 == arg0.field1247) {
                int var119 = var3.method3268();
                int var120 = var3.method3436();
                int var121 = var3.method3268();
                if (field769 != 0 && var120 != 0 && field599 < 50) {
                    field830[field599] = var119;
                    field696[field599] = var120;
                    field832[field599] = var121;
                    field763[field599] = null;
                    field833[field599] = 0;
                    field599++;
                }
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2128 == arg0.field1247) {
                int var125 = var3.method3370();
                int var126 = var3.method3267();
                class226.field2577[var125] = var126;
                if (class226.field2579[var125] != var126) {
                    class226.field2579[var125] = var126;
                }
                method4169(var125);
                field594[++field778 - 1 & 0x1F] = var125;
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2136 == arg0.field1247) {
                field747 = false;
                for (int var127 = 0; var127 < 5; var127++) {
                    field836[var127] = false;
                }
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2117 == arg0.field1247) {
                int var128 = var3.method3293();
                boolean var129 = var3.method3436() == 1;
                String var130 = "";
                boolean var131 = false;
                if (var129) {
                    var130 = var3.method3271();
                    if (Statics.field1454.method1553(new class292(var130, Statics.field169))) {
                        var131 = true;
                    }
                }
                String var132 = var3.method3271();
                if (!var131) {
                    class84.method1098(var128, var130, var132);
                }
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2125 == arg0.field1247) {
                method1633();
                int var133 = var3.method3424();
                int var134 = var3.method3436();
                int var135 = var3.method3307();
                field765[var133] = var135;
                field725[var133] = var134;
                field726[var133] = 1;
                for (int var136 = 0; var136 < 98; var136++) {
                    if (var135 >= class235.field2799[var136]) {
                        field726[var133] = var136 + 2;
                    }
                }
                field811[++field782 - 1 & 0x1F] = var133;
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2090 == arg0.field1247) {
                class82.method126(var3, arg0.field1248);
                if (Statics.field54 != null) {
                    field860 = field680;
                    Statics.field54.method4408();
                    for (int var137 = 0; var137 < field807.length; var137++) {
                        if (field807[var137] != null) {
                            Statics.field54.method4411((field807[var137].field901 >> 7) + Statics.field2316, (field807[var137].field919 >> 7) + Statics.field1052);
                        }
                    }
                }
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2129 == arg0.field1247) {
                boolean var138 = var3.method3350();
                if (!var138) {
                    Statics.field54 = null;
                } else if (Statics.field54 == null) {
                    Statics.field54 = new class252();
                }
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2086 == arg0.field1247) {
                int var139 = var3.method3268();
                if (var139 == 65535) {
                    var139 = -1;
                }
                if (var139 == -1 && !field826) {
                    class218.method630();
                } else if (var139 != -1 && field825 != var139 && field694 != 0 && !field826) {
                    class218.method3153(2, Statics.field437, var139, 0, field694, false);
                }
                field825 = var139;
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2146 == arg0.field1247) {
                int var140 = var3.method3306();
                int var141 = var3.method3478();
                if (var141 == 65535) {
                    var141 = -1;
                }
                Statics.method4492(var141, var140);
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2096 == arg0.field1247) {
                int var142 = var3.method3436();
                if (var3.method3436() == 0) {
                    field857[var142] = new class5();
                    var3.field2360 += 18;
                } else {
                    var3.field2360--;
                    field857[var142] = new class5(var3, false);
                }
                field786 = field776;
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2139 == arg0.field1247) {
                var3.field2360 += 28;
                if (var3.method3285()) {
                    method1723(var3, var3.field2360 - 28);
                }
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2105 == arg0.field1247) {
                field747 = true;
                Statics.field1015 = var3.method3436();
                Statics.field20 = var3.method3436();
                Statics.field477 = var3.method3268();
                Statics.field1361 = var3.method3436();
                Statics.field1590 = var3.method3436();
                if (Statics.field1590 >= 100) {
                    int var143 = Statics.field1015 * 128 + 64;
                    int var144 = Statics.field20 * 128 + 64;
                    int var145 = method4568(var143, var144, Statics.field2416) - Statics.field477;
                    int var146 = var143 - Statics.field119;
                    int var147 = var145 - Statics.field97;
                    int var148 = var144 - Statics.field103;
                    int var149 = (int) Math.sqrt((double) (var146 * var146 + var148 * var148));
                    Statics.field1936 = (int) (Math.atan2((double) var147, (double) var149) * 325.949D) & 0x7FF;
                    Statics.field508 = (int) (Math.atan2((double) var146, (double) var148) * -325.949D) & 0x7FF;
                    if (Statics.field1936 < 128) {
                        Statics.field1936 = 128;
                    }
                    if (Statics.field1936 > 383) {
                        Statics.field1936 = 383;
                    }
                }
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2094 == arg0.field1247) {
                Statics.field1454.method1548();
                field743 = field776;
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2078 == arg0.field1247) {
                method1026(class172.field2272);
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2113 == arg0.field1247) {
                method1026(class172.field2269);
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2116 == arg0.field1247) {
                int var150 = var3.method3310();
                int var151 = var3.method3298();
                class231 var152 = class231.method1097(var150);
                if (var152.field2671 != var151 || var151 == -1) {
                    var152.field2671 = var151;
                    var152.field2747 = 0;
                    var152.field2719 = 0;
                    method3242(var152);
                }
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2133 == arg0.field1247) {
                int var153 = var3.method3268();
                int var154 = var3.method3312();
                int var155 = var3.method3268();
                class231 var156 = class231.method1097(var154);
                var156.field2662 = (var153 << 16) + var155;
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2150 == arg0.field1247) {
                int var157 = var3.method3307();
                int var158 = var3.method3267();
                class56 var159 = (class56) field827.method3748((long) var157);
                class56 var160 = (class56) field827.method3748((long) var158);
                if (var160 != null) {
                    method278(var160, var159 == null || var159.field507 != var160.field507);
                }
                if (var159 != null) {
                    var159.method3782();
                    field827.method3747(var159, (long) var158);
                }
                class231 var161 = class231.method1097(var157);
                if (var161 != null) {
                    method3242(var161);
                }
                class231 var162 = class231.method1097(var158);
                if (var162 != null) {
                    method3242(var162);
                    method727(Statics.field2616[var162.field2624 >>> 16], var162, true);
                }
                if (field753 != -1) {
                    method1720(field753, 1);
                }
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2106 == arg0.field1247) {
                Statics.field1220 = var3.method3436();
                Statics.field546 = var3.method3424();
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2153 == arg0.field1247) {
                for (int var163 = 0; var163 < class226.field2579.length; var163++) {
                    if (class226.field2579[var163] != class226.field2577[var163]) {
                        class226.field2579[var163] = class226.field2577[var163];
                        method4169(var163);
                        field594[++field778 - 1 & 0x1F] = var163;
                    }
                }
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2072 == arg0.field1247) {
                field747 = true;
                Statics.field100 = var3.method3436();
                Statics.field306 = var3.method3436();
                Statics.field2069 = var3.method3268();
                Statics.field2000 = var3.method3436();
                Statics.field2802 = var3.method3436();
                if (Statics.field2802 >= 100) {
                    Statics.field119 = Statics.field100 * 128 + 64;
                    Statics.field103 = Statics.field306 * 128 + 64;
                    Statics.field97 = method4568(Statics.field119, Statics.field103, Statics.field2416) - Statics.field2069;
                }
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2119 == arg0.field1247) {
                int var164 = var3.method3370();
                field753 = var164;
                this.method1114(false);
                method443(var164);
                class70.method56(field753);
                for (int var165 = 0; var165 < 100; var165++) {
                    field796[var165] = true;
                }
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2157 == arg0.field1247) {
                int var166 = var3.method3307();
                int var167 = var3.method3478();
                int var168 = var167 >> 10 & 0x1F;
                int var169 = var167 >> 5 & 0x1F;
                int var170 = var167 & 0x1F;
                int var171 = (var170 << 3) + (var168 << 19) + (var169 << 11);
                class231 var172 = class231.method1097(var166);
                if (var172.field2649 != var171) {
                    var172.field2649 = var171;
                    method3242(var172);
                }
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2143 == arg0.field1247) {
                int var173 = var3.method3478();
                class54.method2915(var173);
                field779[++field780 - 1 & 0x1F] = var173 & 0x7FFF;
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2085 == arg0.field1247) {
                int var174 = var3.method3436();
                int var175 = var3.method3436();
                int var176 = var3.method3436();
                int var177 = var3.method3436();
                field836[var174] = true;
                field837[var174] = var175;
                field838[var174] = var176;
                field856[var174] = var177;
                field766[var174] = 0;
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2109 == arg0.field1247) {
                int var178 = var3.method3370();
                int var179 = var3.method3310();
                int var180 = var3.method3370();
                int var181 = var3.method3478();
                class231 var182 = class231.method1097(var179);
                if (var182.field2676 != var181 || var182.field2708 != var178 || var182.field2702 != var180) {
                    var182.field2676 = var181;
                    var182.field2708 = var178;
                    var182.field2702 = var180;
                    method3242(var182);
                }
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2102 == arg0.field1247) {
                int var183 = var3.method3268();
                int var184 = var3.method3312();
                class231 var185 = class231.method1097(var184);
                if (var185.field2667 != 1 || var185.field2758 != var183) {
                    var185.field2667 = 1;
                    var185.field2758 = var183;
                    method3242(var185);
                }
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2100 == arg0.field1247) {
                boolean var186 = var3.method3436() == 1;
                if (var186) {
                    Statics.field630 = class185.method3151() - var3.method3486();
                    Statics.field2292 = new class2(var3, true);
                } else {
                    Statics.field2292 = null;
                }
                field790 = field776;
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2126 == arg0.field1247) {
                method25(true, var3);
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2108 == arg0.field1247) {
                if (arg0.field1248 == 0) {
                    Statics.field3 = null;
                } else {
                    if (Statics.field3 == null) {
                        Statics.field3 = new class294(Statics.field169, Statics.field322);
                    }
                    Statics.field3.method5080(var3);
                }
                field785 = field776;
                Statics.field246 = true;
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2089 == arg0.field1247) {
                method1633();
                field759 = var3.method3498();
                field788 = field776;
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2093 == arg0.field1247) {
                int var187 = var3.method3268();
                int var188 = var3.method3312();
                class231 var189 = class231.method1097(var188);
                if (var189 != null && var189.field2626 == 0) {
                    if (var187 > var189.field2648 - var189.field2640) {
                        var187 = var189.field2648 - var189.field2640;
                    }
                    if (var187 < 0) {
                        var187 = 0;
                    }
                    if (var189.field2612 != var187) {
                        var189.field2612 = var187;
                        method3242(var189);
                    }
                }
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2155 == arg0.field1247) {
                method1633();
                field758 = var3.method3436();
                field788 = field776;
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2107 == arg0.field1247) {
                method1026(class172.field2277);
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2135 == arg0.field1247) {
                int var190 = var3.method3267();
                class56 var191 = (class56) field827.method3748((long) var190);
                if (var191 != null) {
                    method278(var191, true);
                }
                if (field757 != null) {
                    method3242(field757);
                    field757 = null;
                }
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2103 == arg0.field1247) {
                int var192 = var3.method3312();
                String var193 = var3.method3271();
                class231 var194 = class231.method1097(var192);
                if (!var193.equals(var194.field2685)) {
                    var194.field2685 = var193;
                    method3242(var194);
                }
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2076 == arg0.field1247) {
                int var195 = var3.method3307();
                class231 var196 = class231.method1097(var195);
                var196.field2667 = 3;
                var196.field2758 = Statics.field1949.field562.method4125();
                method3242(var196);
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2152 == arg0.field1247) {
                String var197 = var3.method3271();
                long var198 = (long) var3.method3268();
                long var200 = (long) var3.method3266();
                class243 var202 = (class243) class178.method90(class243.method4860(), var3.method3436());
                long var203 = (var198 << 32) + var200;
                boolean var205 = false;
                for (int var206 = 0; var206 < 100; var206++) {
                    if (field810[var206] == var203) {
                        var205 = true;
                        break;
                    }
                }
                if (Statics.field1454.method1553(new class292(var197, Statics.field169))) {
                    var205 = true;
                }
                if (!var205 && field707 == 0) {
                    field810[field831] = var203;
                    field831 = (field831 + 1) % 100;
                    String var207 = class300.method5208(class306.method998(class301.method1037(var3)));
                    byte var208;
                    if (var202.field3144) {
                        var208 = 7;
                    } else {
                        var208 = 3;
                    }
                    if (var202.field3143 == -1) {
                        class84.method1098(var208, var197, var207);
                    } else {
                        class84.method1098(var208, class75.method619(var202.field3143) + var197, var207);
                    }
                }
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2145 == arg0.field1247) {
                String var209 = var3.method3271();
                int var210 = var3.method3291();
                int var211 = var3.method3291();
                if (var210 >= 1 && var210 <= 8) {
                    if (var209.equalsIgnoreCase(class238.field2821)) {
                        var209 = null;
                    }
                    field651[var210 - 1] = var209;
                    field851[var210 - 1] = var211 == 0;
                }
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2154 == arg0.field1247) {
                field821 = var3.method3436();
                if (field821 == 255) {
                    field821 = 0;
                }
                field822 = var3.method3436();
                if (field822 == 255) {
                    field822 = 0;
                }
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2141 == arg0.field1247) {
                byte var212 = var3.method3263();
                int var213 = var3.method3268();
                class226.field2577[var213] = var212;
                if (class226.field2579[var213] != var212) {
                    class226.field2579[var213] = var212;
                }
                method4169(var213);
                field594[++field778 - 1 & 0x1F] = var213;
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2114 == arg0.field1247) {
                for (int var214 = 0; var214 < field807.length; var214++) {
                    if (field807[var214] != null) {
                        field807[var214].field916 = -1;
                    }
                }
                for (int var215 = 0; var215 < field808.length; var215++) {
                    if (field808[var215] != null) {
                        field808[var215].field916 = -1;
                    }
                }
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2075 == arg0.field1247) {
                int var216 = var3.method3310();
                int var217 = var3.method3256();
                int var218 = var3.method3247();
                class56 var219 = (class56) field827.method3748((long) var216);
                if (var219 != null) {
                    method278(var219, var219.field507 != var217);
                }
                method4607(var216, var217, var218);
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2098 == arg0.field1247) {
                field859 = var3.method3436();
                if (field859 == 1) {
                    field614 = var3.method3268();
                }
                if (field859 >= 2 && field859 <= 6) {
                    if (field859 == 2) {
                        field619 = 64;
                        field671 = 64;
                    }
                    if (field859 == 3) {
                        field619 = 0;
                        field671 = 64;
                    }
                    if (field859 == 4) {
                        field619 = 128;
                        field671 = 64;
                    }
                    if (field859 == 5) {
                        field619 = 64;
                        field671 = 0;
                    }
                    if (field859 == 6) {
                        field619 = 64;
                        field671 = 128;
                    }
                    field859 = 2;
                    field613 = var3.method3268();
                    field617 = var3.method3268();
                    field618 = var3.method3436();
                }
                if (field859 == 10) {
                    field615 = var3.method3268();
                }
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2097 == arg0.field1247) {
                int var220 = var3.method3267();
                int var221 = var3.method3498();
                int var222 = var3.method3303();
                class231 var223 = class231.method1097(var220);
                if (var223.field2633 != var222 || var223.field2654 != var221 || var223.field2629 != 0 || var223.field2630 != 0) {
                    var223.field2633 = var222;
                    var223.field2654 = var221;
                    var223.field2629 = 0;
                    var223.field2630 = 0;
                    method3242(var223);
                    this.method1115(var223);
                    if (var223.field2626 == 0) {
                        method727(Statics.field2616[var220 >> 16], var223, false);
                    }
                }
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2132 == arg0.field1247) {
                String var224 = var3.method3271();
                Statics.field358 = var224;
                try {
                    String var225 = Statics.field322.getParameter(class280.field3610.field3614);
                    String var226 = Statics.field322.getParameter(class280.field3611.field3614);
                    String var227 = var225 + "settings=" + var224 + "; version=1; path=/; domain=" + var226;
                    String var228;
                    if (var224.length() == 0) {
                        var228 = var227 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    } else {
                        String var229 = var227 + "; Expires=";
                        long var230 = class185.method3151() + 94608000000L;
                        class193.field2419.setTime(new Date(var230));
                        int var232 = class193.field2419.get(7);
                        int var233 = class193.field2419.get(5);
                        int var234 = class193.field2419.get(2);
                        int var235 = class193.field2419.get(1);
                        int var236 = class193.field2419.get(11);
                        int var237 = class193.field2419.get(12);
                        int var238 = class193.field2419.get(13);
                        String var239 = class193.field2415[var232 - 1] + ", " + var233 / 10 + var233 % 10 + "-" + class193.field2418[0][var234] + "-" + var235 + " " + var236 / 10 + var236 % 10 + ":" + var237 / 10 + var237 % 10 + ":" + var238 / 10 + var238 % 10 + " GMT";
                        var228 = var229 + var239 + "; Max-Age=" + 94608000L;
                    }
                    client var240 = Statics.field322;
                    String var241 = "document.cookie=\"" + var228 + "\"";
                    JSObject.getWindow(var240).eval(var241);
                } catch (Throwable var278) {
                }
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2124 == arg0.field1247) {
                method1026(class172.field2275);
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2088 == arg0.field1247) {
                int var243 = var3.method3312();
                int var244 = var3.method3256();
                class231 var245 = class231.method1097(var243);
                if (var245.field2667 != 2 || var245.field2758 != var244) {
                    var245.field2667 = 2;
                    var245.field2758 = var244;
                    method3242(var245);
                }
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2095 == arg0.field1247) {
                for (int var246 = 0; var246 < Statics.field3252; var246++) {
                    class255 var247 = (class255) class255.field3253.method3707((long) var246);
                    class255 var248;
                    if (var247 == null) {
                        byte[] var249 = Statics.field3255.method4250(16, var246);
                        class255 var250 = new class255();
                        if (var249 != null) {
                            var250.method4434(new class183(var249));
                        }
                        class255.field3253.method3712(var250, (long) var246);
                        var248 = var250;
                    } else {
                        var248 = var247;
                    }
                    if (var248 != null) {
                        class226.field2577[var246] = 0;
                        class226.field2579[var246] = 0;
                    }
                }
                method1633();
                field778 += 32;
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2127 == arg0.field1247) {
                if (Statics.field3 != null) {
                    Statics.field3.method5072(var3);
                }
                field785 = field776;
                Statics.field246 = true;
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2138 == arg0.field1247) {
                field823 = var3.method3436();
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2074 == arg0.field1247) {
                int var252 = var3.method3267();
                int var253 = var3.method3268();
                if (var252 < -70000) {
                    var253 += 32768;
                }
                class231 var254;
                if (var252 >= 0) {
                    var254 = class231.method1097(var252);
                } else {
                    var254 = null;
                }
                if (var254 != null) {
                    for (int var255 = 0; var255 < var254.field2759.length; var255++) {
                        var254.field2759[var255] = 0;
                        var254.field2744[var255] = 0;
                    }
                }
                class54 var256 = (class54) class54.field479.method3748((long) var253);
                if (var256 != null) {
                    for (int var257 = 0; var257 < var256.field483.length; var257++) {
                        var256.field483[var257] = -1;
                        var256.field481[var257] = 0;
                    }
                }
                int var258 = var3.method3268();
                for (int var259 = 0; var259 < var258; var259++) {
                    int var260 = var3.method3247();
                    if (var260 == 255) {
                        var260 = var3.method3267();
                    }
                    int var261 = var3.method3478();
                    if (var254 != null && var259 < var254.field2759.length) {
                        var254.field2759[var259] = var261;
                        var254.field2744[var259] = var260;
                    }
                    class54.method3074(var253, var259, var261 - 1, var260);
                }
                if (var254 != null) {
                    method3242(var254);
                }
                method1633();
                field779[++field780 - 1 & 0x1F] = var253 & 0x7FFF;
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2079 == arg0.field1247) {
                field852 = var3.method3436();
                field695 = var3.method3247();
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2140 == arg0.field1247) {
                int var262 = var3.method3267();
                int var263 = var3.method3268();
                if (var262 < -70000) {
                    var263 += 32768;
                }
                class231 var264;
                if (var262 >= 0) {
                    var264 = class231.method1097(var262);
                } else {
                    var264 = null;
                }
                while (var3.field2360 < arg0.field1248) {
                    int var265 = var3.method3293();
                    int var266 = var3.method3268();
                    int var267 = 0;
                    if (var266 != 0) {
                        var267 = var3.method3436();
                        if (var267 == 255) {
                            var267 = var3.method3267();
                        }
                    }
                    if (var264 != null && var265 >= 0 && var265 < var264.field2759.length) {
                        var264.field2759[var265] = var266;
                        var264.field2744[var265] = var267;
                    }
                    class54.method3074(var263, var265, var266 - 1, var267);
                }
                if (var264 != null) {
                    method3242(var264);
                }
                method1633();
                field779[++field780 - 1 & 0x1F] = var263 & 0x7FFF;
                arg0.field1247 = null;
                return true;
            }
            if (class169.field2149 == arg0.field1247) {
                int var268 = var3.method3312();
                int var269 = var3.method3307();
                int var270 = var3.method3256();
                if (var270 == 65535) {
                    var270 = -1;
                }
                class231 var271 = class231.method1097(var269);
                if (var271.field2623) {
                    var271.field2755 = var270;
                    var271.field2678 = var268;
                    class270 var273 = class270.method2571(var270);
                    var271.field2676 = var273.field3471;
                    var271.field2708 = var273.field3457;
                    var271.field2677 = var273.field3458;
                    var271.field2673 = var273.field3459;
                    var271.field2674 = var273.field3487;
                    var271.field2702 = var273.field3455;
                    if (var273.field3483 == 1) {
                        var271.field2646 = 1;
                    } else {
                        var271.field2646 = 2;
                    }
                    if (var271.field2679 > 0) {
                        var271.field2702 = var271.field2702 * 32 / var271.field2679;
                    } else if (var271.field2635 > 0) {
                        var271.field2702 = var271.field2702 * 32 / var271.field2635;
                    }
                    method3242(var271);
                } else if (var270 == -1) {
                    var271.field2667 = 0;
                    arg0.field1247 = null;
                    return true;
                } else {
                    class270 var272 = class270.method2571(var270);
                    var271.field2667 = 4;
                    var271.field2758 = var270;
                    var271.field2676 = var272.field3471;
                    var271.field2708 = var272.field3457;
                    var271.field2702 = var272.field3455 * 100 / var268;
                    method3242(var271);
                }
                arg0.field1247 = null;
                return true;
            }
            class153.method695("" + (arg0.field1247 == null ? -1 : arg0.field1247.field2156) + class75.field1069 + (arg0.field1246 == null ? -1 : arg0.field1246.field2156) + class75.field1069 + (arg0.field1254 == null ? -1 : arg0.field1254.field2156) + class75.field1069 + arg0.field1248, (Throwable) null);
            method1818();
        } catch (IOException var285) {
            method1872();
        } catch (Exception var286) {
            String var276 = "" + (arg0.field1247 == null ? -1 : arg0.field1247.field2156) + class75.field1069 + (arg0.field1246 == null ? -1 : arg0.field1246.field2156) + class75.field1069 + (arg0.field1254 == null ? -1 : arg0.field1254.field2156) + class75.field1069 + arg0.field1248 + class75.field1069 + (Statics.field2316 + Statics.field1949.field929[0]) + class75.field1069 + (Statics.field1052 + Statics.field1949.field940[0]) + class75.field1069;
            for (int var277 = 0; var277 < arg0.field1248 && var277 < 50; var277++) {
                var276 = var276 + var3.field2366[var277] + class75.field1069;
            }
            class153.method695(var276, var286);
            method1818();
        }
        return true;
    }

    @ObfuscatedName("bn.he(Lfr;I)V")
    public static final void method1026(class172 arg0) {
        class190 var1 = field740.field1255;
        if (class172.field2268 == arg0) {
            int var2 = var1.method3268();
            int var3 = var1.method3424();
            int var4 = (var3 >> 4 & 0x7) + Statics.field546;
            int var5 = (var3 & 0x7) + Statics.field1220;
            int var6 = var1.method3268();
            if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
                class81 var7 = new class81();
                var7.field1175 = var2;
                var7.field1173 = var6;
                if (field721[Statics.field2416][var4][var5] == null) {
                    field721[Statics.field2416][var4][var5] = new class206();
                }
                field721[Statics.field2416][var4][var5].method3810(var7);
                method3166(var4, var5);
            }
            return;
        }
        if (class172.field2275 == arg0) {
            byte var8 = var1.method3396();
            int var9 = var1.method3268();
            byte var10 = var1.method3263();
            int var11 = var1.method3247();
            int var12 = (var11 >> 4 & 0x7) + Statics.field546;
            int var13 = (var11 & 0x7) + Statics.field1220;
            int var14 = var1.method3478();
            int var15 = var1.method3256();
            byte var16 = var1.method3459();
            int var17 = var1.method3268();
            byte var18 = var1.method3294();
            int var19 = var1.method3436();
            int var20 = var19 >> 2;
            int var21 = var19 & 0x3;
            int var22 = field654[var20];
            class61 var23;
            if (field710 == var15) {
                var23 = Statics.field1949;
            } else {
                var23 = field807[var15];
            }
            if (var23 != null) {
                class269 var24 = class269.method675(var14);
                int var25;
                int var26;
                if (var21 == 1 || var21 == 3) {
                    var25 = var24.field3421;
                    var26 = var24.field3405;
                } else {
                    var25 = var24.field3405;
                    var26 = var24.field3421;
                }
                int var27 = (var25 >> 1) + var12;
                int var28 = (var25 + 1 >> 1) + var12;
                int var29 = (var26 >> 1) + var13;
                int var30 = (var26 + 1 >> 1) + var13;
                int[][] var31 = class51.field448[Statics.field2416];
                int var32 = var31[var27][var29] + var31[var28][var29] + var31[var27][var30] + var31[var28][var30] >> 2;
                int var33 = (var12 << 7) + (var25 << 6);
                int var34 = (var13 << 7) + (var26 << 6);
                class120 var35 = var24.method4665(var20, var21, var31, var33, var32, var34);
                if (var35 != null) {
                    method4079(Statics.field2416, var12, var13, var22, -1, 0, 0, var17 + 1, var9 + 1);
                    var23.field576 = field680 + var17;
                    var23.field571 = field680 + var9;
                    var23.field575 = var35;
                    var23.field572 = var12 * 128 + var25 * 64;
                    var23.field583 = var13 * 128 + var26 * 64;
                    var23.field563 = var32;
                    if (var16 > var18) {
                        byte var36 = var16;
                        var16 = var18;
                        var18 = var36;
                    }
                    if (var8 > var10) {
                        byte var37 = var8;
                        var8 = var10;
                        var10 = var37;
                    }
                    var23.field569 = var12 + var16;
                    var23.field578 = var12 + var18;
                    var23.field574 = var8 + var13;
                    var23.field579 = var10 + var13;
                }
            }
        }
        if (class172.field2270 == arg0) {
            int var38 = var1.method3436();
            int var39 = (var38 >> 4 & 0x7) + Statics.field546;
            int var40 = (var38 & 0x7) + Statics.field1220;
            int var41 = var1.method3247();
            int var42 = var41 >> 2;
            int var43 = var41 & 0x3;
            int var44 = field654[var42];
            if (var39 >= 0 && var40 >= 0 && var39 < 104 && var40 < 104) {
                method4079(Statics.field2416, var39, var40, var44, -1, var42, var43, 0, -1);
            }
        } else if (class172.field2273 == arg0) {
            int var45 = var1.method3478();
            int var46 = var1.method3291();
            int var47 = (var46 >> 4 & 0x7) + Statics.field546;
            int var48 = (var46 & 0x7) + Statics.field1220;
            if (var47 >= 0 && var48 >= 0 && var47 < 104 && var48 < 104) {
                class206 var49 = field721[Statics.field2416][var47][var48];
                if (var49 != null) {
                    for (class81 var50 = (class81) var49.method3797(); var50 != null; var50 = (class81) var49.method3788()) {
                        if ((var45 & 0x7FFF) == var50.field1175) {
                            var50.method3782();
                            break;
                        }
                    }
                    if (var49.method3797() == null) {
                        field721[Statics.field2416][var47][var48] = null;
                    }
                    method3166(var47, var48);
                }
            }
        } else {
            if (class172.field2277 == arg0) {
                int var51 = var1.method3291();
                int var52 = var1.method3291();
                int var53 = var52 >> 4 & 0xF;
                int var54 = var52 & 0x7;
                int var55 = var1.method3268();
                int var56 = var1.method3247();
                int var57 = (var56 >> 4 & 0x7) + Statics.field546;
                int var58 = (var56 & 0x7) + Statics.field1220;
                if (var57 >= 0 && var58 >= 0 && var57 < 104 && var58 < 104) {
                    int var59 = var53 + 1;
                    if (Statics.field1949.field929[0] >= var57 - var59 && Statics.field1949.field929[0] <= var57 + var59 && Statics.field1949.field940[0] >= var58 - var59 && Statics.field1949.field940[0] <= var58 + var59 && field828 != 0 && var54 > 0 && field599 < 50) {
                        field830[field599] = var55;
                        field696[field599] = var54;
                        field832[field599] = var51;
                        field763[field599] = null;
                        field833[field599] = (var57 << 16) + (var58 << 8) + var53;
                        field599++;
                    }
                }
            }
            if (class172.field2272 == arg0) {
                byte var60 = var1.method3459();
                int var61 = var1.method3436();
                int var62 = var1.method3303();
                int var63 = var1.method3370();
                int var64 = var1.method3436() * 4;
                int var65 = var1.method3370();
                int var66 = var1.method3247() * 4;
                int var67 = var1.method3291();
                int var68 = (var67 >> 4 & 0x7) + Statics.field546;
                int var69 = (var67 & 0x7) + Statics.field1220;
                int var70 = var1.method3247();
                byte var71 = var1.method3459();
                int var72 = var1.method3268();
                int var73 = var68 + var71;
                int var74 = var60 + var69;
                if (var68 >= 0 && var69 >= 0 && var68 < 104 && var69 < 104 && var73 >= 0 && var74 >= 0 && var73 < 104 && var74 < 104 && var72 != 65535) {
                    int var75 = var68 * 128 + 64;
                    int var76 = var69 * 128 + 64;
                    int var77 = var73 * 128 + 64;
                    int var78 = var74 * 128 + 64;
                    class80 var79 = new class80(var72, Statics.field2416, var75, var76, method4568(var75, var76, Statics.field2416) - var66, field680 + var65, field680 + var63, var70, var61, var62, var64);
                    var79.method1759(var77, var78, method4568(var77, var78, Statics.field2416) - var64, field680 + var65);
                    field723.method3810(var79);
                }
            } else if (class172.field2276 == arg0) {
                int var80 = var1.method3436();
                int var81 = (var80 >> 4 & 0x7) + Statics.field546;
                int var82 = (var80 & 0x7) + Statics.field1220;
                int var83 = var1.method3268();
                int var84 = var1.method3247();
                int var85 = var84 >> 2;
                int var86 = var84 & 0x3;
                int var87 = field654[var85];
                if (var81 >= 0 && var82 >= 0 && var81 < 104 && var82 < 104) {
                    method4079(Statics.field2416, var81, var82, var87, var83, var85, var86, 0, -1);
                }
            } else if (class172.field2271 == arg0) {
                int var88 = var1.method3424();
                int var89 = (var88 >> 4 & 0x7) + Statics.field546;
                int var90 = (var88 & 0x7) + Statics.field1220;
                int var91 = var1.method3478();
                int var92 = var1.method3424();
                int var93 = var92 >> 2;
                int var94 = var92 & 0x3;
                int var95 = field654[var93];
                if (var89 >= 0 && var90 >= 0 && var89 < 103 && var90 < 103) {
                    if (var95 == 0) {
                        class129 var96 = Statics.field524.method2836(Statics.field2416, var89, var90);
                        if (var96 != null) {
                            int var97 = class121.method94(var96.field1819);
                            if (var93 == 2) {
                                var96.field1812 = new class86(var97, 2, var94 + 4, Statics.field2416, var89, var90, var91, false, var96.field1812);
                                var96.field1813 = new class86(var97, 2, var94 + 1 & 0x3, Statics.field2416, var89, var90, var91, false, var96.field1813);
                            } else {
                                var96.field1812 = new class86(var97, var93, var94, Statics.field2416, var89, var90, var91, false, var96.field1812);
                            }
                        }
                    }
                    if (var95 == 1) {
                        class134 var98 = Statics.field524.method2711(Statics.field2416, var89, var90);
                        if (var98 != null) {
                            int var99 = class121.method94(var98.field1852);
                            if (var93 == 4 || var93 == 5) {
                                var98.field1855 = new class86(var99, 4, var94, Statics.field2416, var89, var90, var91, false, var98.field1855);
                            } else if (var93 == 6) {
                                var98.field1855 = new class86(var99, 4, var94 + 4, Statics.field2416, var89, var90, var91, false, var98.field1855);
                            } else if (var93 == 7) {
                                var98.field1855 = new class86(var99, 4, (var94 + 2 & 0x3) + 4, Statics.field2416, var89, var90, var91, false, var98.field1855);
                            } else if (var93 == 8) {
                                var98.field1855 = new class86(var99, 4, var94 + 4, Statics.field2416, var89, var90, var91, false, var98.field1855);
                                var98.field1856 = new class86(var99, 4, (var94 + 2 & 0x3) + 4, Statics.field2416, var89, var90, var91, false, var98.field1856);
                            }
                        }
                    }
                    if (var95 == 2) {
                        class135 var100 = Statics.field524.method2712(Statics.field2416, var89, var90);
                        if (var93 == 11) {
                            var93 = 10;
                        }
                        if (var100 != null) {
                            var100.field1862 = new class86(class121.method94(var100.field1864), var93, var94, Statics.field2416, var89, var90, var91, false, var100.field1862);
                        }
                    }
                    if (var95 == 3) {
                        class116 var101 = Statics.field524.method2713(Statics.field2416, var89, var90);
                        if (var101 != null) {
                            var101.field1554 = new class86(class121.method94(var101.field1551), 22, var94, Statics.field2416, var89, var90, var91, false, var101.field1554);
                        }
                    }
                }
            } else if (class172.field2269 == arg0) {
                int var102 = var1.method3291();
                int var103 = (var102 >> 4 & 0x7) + Statics.field546;
                int var104 = (var102 & 0x7) + Statics.field1220;
                int var105 = var1.method3370();
                int var106 = var1.method3268();
                int var107 = var1.method3424();
                if (var103 >= 0 && var104 >= 0 && var103 < 104 && var104 < 104) {
                    int var108 = var103 * 128 + 64;
                    int var109 = var104 * 128 + 64;
                    class71 var110 = new class71(var105, Statics.field2416, var108, var109, method4568(var108, var109, Statics.field2416) - var107, var106, field680);
                    field661.method3810(var110);
                }
            } else if (class172.field2274 == arg0) {
                int var111 = var1.method3478();
                int var112 = var1.method3256();
                int var113 = var1.method3436();
                int var114 = (var113 >> 4 & 0x7) + Statics.field546;
                int var115 = (var113 & 0x7) + Statics.field1220;
                int var116 = var1.method3268();
                if (var114 >= 0 && var115 >= 0 && var114 < 104 && var115 < 104) {
                    class206 var117 = field721[Statics.field2416][var114][var115];
                    if (var117 != null) {
                        for (class81 var118 = (class81) var117.method3797(); var118 != null; var118 = (class81) var117.method3788()) {
                            if ((var112 & 0x7FFF) == var118.field1175 && var118.field1173 == var116) {
                                var118.field1173 = var111;
                                break;
                            }
                        }
                        method3166(var114, var115);
                    }
                }
            }
        }
    }

    @ObfuscatedName("hg.hn(IIIIIIIIIB)V")
    public static final void method4079(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class63 var9 = null;
        for (class63 var10 = (class63) field722.method3797(); var10 != null; var10 = (class63) field722.method3788()) {
            if (var10.field874 == arg0 && var10.field869 == arg1 && var10.field881 == arg2 && var10.field870 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class63();
            var9.field874 = arg0;
            var9.field870 = arg3;
            var9.field869 = arg1;
            var9.field881 = arg2;
            method86(var9);
            field722.method3810(var9);
        }
        var9.field867 = arg4;
        var9.field876 = arg5;
        var9.field875 = arg6;
        var9.field868 = arg7;
        var9.field878 = arg8;
    }

    @ObfuscatedName("x.hy(Lbl;B)V")
    public static final void method86(class63 arg0) {
        long var1 = 0L;
        int var3 = -1;
        int var4 = 0;
        int var5 = 0;
        if (arg0.field870 == 0) {
            var1 = Statics.field524.method2714(arg0.field874, arg0.field869, arg0.field881);
        }
        if (arg0.field870 == 1) {
            var1 = Statics.field524.method2715(arg0.field874, arg0.field869, arg0.field881);
        }
        if (arg0.field870 == 2) {
            var1 = Statics.field524.method2832(arg0.field874, arg0.field869, arg0.field881);
        }
        if (arg0.field870 == 3) {
            var1 = Statics.field524.method2717(arg0.field874, arg0.field869, arg0.field881);
        }
        if (var1 != 0L) {
            int var6 = Statics.field524.method2718(arg0.field874, arg0.field869, arg0.field881, var1);
            var3 = class121.method94(var1);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg0.field871 = var3;
        arg0.field873 = var4;
        arg0.field872 = var5;
    }

    @ObfuscatedName("v.hk(IIIIIIII)V")
    public static final void method437(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field709 && Statics.field2416 != arg0) {
            return;
        }
        long var7 = 0L;
        boolean var9 = true;
        boolean var10 = false;
        boolean var11 = false;
        if (arg1 == 0) {
            var7 = Statics.field524.method2714(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field524.method2715(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field524.method2832(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field524.method2717(arg0, arg2, arg3);
        }
        if (var7 != 0L) {
            int var12 = Statics.field524.method2718(arg0, arg2, arg3, var7);
            int var13 = class121.method94(var7);
            int var14 = var12 & 0x1F;
            int var15 = var12 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field524.method2741(arg0, arg2, arg3);
                class269 var16 = class269.method675(var13);
                if (var16.field3407 != 0) {
                    field667[arg0].method3116(arg2, arg3, var14, var15, var16.field3408);
                }
            }
            if (arg1 == 1) {
                Statics.field524.method2706(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field524.method2800(arg0, arg2, arg3);
                class269 var17 = class269.method675(var13);
                if (var17.field3405 + arg2 > 103 || var17.field3405 + arg3 > 103 || var17.field3421 + arg2 > 103 || var17.field3421 + arg3 > 103) {
                    return;
                }
                if (var17.field3407 != 0) {
                    field667[arg0].method3132(arg2, arg3, var17.field3405, var17.field3421, var15, var17.field3408);
                }
            }
            if (arg1 == 3) {
                Statics.field524.method2708(arg0, arg2, arg3);
                class269 var18 = class269.method675(var13);
                if (var18.field3407 == 1) {
                    field667[arg0].method3131(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var19 = arg0;
        if (arg0 < 3 && (class51.field446[1][arg2][arg3] & 0x2) == 2) {
            var19 = arg0 + 1;
        }
        class126 var20 = Statics.field524;
        class165 var21 = field667[arg0];
        class269 var22 = class269.method675(arg4);
        int var23;
        int var24;
        if (arg5 == 1 || arg5 == 3) {
            var23 = var22.field3421;
            var24 = var22.field3405;
        } else {
            var23 = var22.field3405;
            var24 = var22.field3421;
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
        int[][] var29 = class51.field448[var19];
        int var30 = var29[var25][var27] + var29[var26][var27] + var29[var25][var28] + var29[var26][var28] >> 2;
        int var31 = (arg2 << 7) + (var23 << 6);
        int var32 = (arg3 << 7) + (var24 << 6);
        long var33 = Statics.method1038(arg2, arg3, 2, var22.field3409 == 0, arg4);
        int var35 = (arg5 << 6) + arg6;
        if (var22.field3430 == 1) {
            var35 += 256;
        }
        if (arg6 == 22) {
            class128 var36;
            if (var22.field3413 == -1 && var22.field3431 == null) {
                var36 = var22.method4665(22, arg5, var29, var31, var30, var32);
            } else {
                var36 = new class86(arg4, 22, arg5, var19, arg2, arg3, var22.field3413, true, (class128) null);
            }
            var20.method2694(arg0, arg2, arg3, var30, var36, var33, var35);
            if (var22.field3407 == 1) {
                var21.method3121(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class128 var62;
            if (var22.field3413 == -1 && var22.field3431 == null) {
                var62 = var22.method4665(10, arg5, var29, var31, var30, var32);
            } else {
                var62 = new class86(arg4, 10, arg5, var19, arg2, arg3, var22.field3413, true, (class128) null);
            }
            if (var62 != null) {
                var20.method2698(arg0, arg2, arg3, var30, var23, var24, var62, arg6 == 11 ? 256 : 0, var33, var35);
            }
            if (var22.field3407 != 0) {
                var21.method3112(arg2, arg3, var23, var24, var22.field3408);
            }
        } else if (arg6 >= 12) {
            class128 var37;
            if (var22.field3413 == -1 && var22.field3431 == null) {
                var37 = var22.method4665(arg6, arg5, var29, var31, var30, var32);
            } else {
                var37 = new class86(arg4, arg6, arg5, var19, arg2, arg3, var22.field3413, true, (class128) null);
            }
            var20.method2698(arg0, arg2, arg3, var30, 1, 1, var37, 0, var33, var35);
            if (var22.field3407 != 0) {
                var21.method3112(arg2, arg3, var23, var24, var22.field3408);
            }
        } else if (arg6 == 0) {
            class128 var38;
            if (var22.field3413 == -1 && var22.field3431 == null) {
                var38 = var22.method4665(0, arg5, var29, var31, var30, var32);
            } else {
                var38 = new class86(arg4, 0, arg5, var19, arg2, arg3, var22.field3413, true, (class128) null);
            }
            var20.method2696(arg0, arg2, arg3, var30, var38, (class128) null, class51.field455[arg5], 0, var33, var35);
            if (var22.field3407 != 0) {
                var21.method3111(arg2, arg3, arg6, arg5, var22.field3408);
            }
        } else if (arg6 == 1) {
            class128 var39;
            if (var22.field3413 == -1 && var22.field3431 == null) {
                var39 = var22.method4665(1, arg5, var29, var31, var30, var32);
            } else {
                var39 = new class86(arg4, 1, arg5, var19, arg2, arg3, var22.field3413, true, (class128) null);
            }
            var20.method2696(arg0, arg2, arg3, var30, var39, (class128) null, class51.field454[arg5], 0, var33, var35);
            if (var22.field3407 != 0) {
                var21.method3111(arg2, arg3, arg6, arg5, var22.field3408);
            }
        } else if (arg6 == 2) {
            int var40 = arg5 + 1 & 0x3;
            class128 var41;
            class128 var42;
            if (var22.field3413 == -1 && var22.field3431 == null) {
                var41 = var22.method4665(2, arg5 + 4, var29, var31, var30, var32);
                var42 = var22.method4665(2, var40, var29, var31, var30, var32);
            } else {
                var41 = new class86(arg4, 2, arg5 + 4, var19, arg2, arg3, var22.field3413, true, (class128) null);
                var42 = new class86(arg4, 2, var40, var19, arg2, arg3, var22.field3413, true, (class128) null);
            }
            var20.method2696(arg0, arg2, arg3, var30, var41, var42, class51.field455[arg5], class51.field455[var40], var33, var35);
            if (var22.field3407 != 0) {
                var21.method3111(arg2, arg3, arg6, arg5, var22.field3408);
            }
        } else if (arg6 == 3) {
            class128 var43;
            if (var22.field3413 == -1 && var22.field3431 == null) {
                var43 = var22.method4665(3, arg5, var29, var31, var30, var32);
            } else {
                var43 = new class86(arg4, 3, arg5, var19, arg2, arg3, var22.field3413, true, (class128) null);
            }
            var20.method2696(arg0, arg2, arg3, var30, var43, (class128) null, class51.field454[arg5], 0, var33, var35);
            if (var22.field3407 != 0) {
                var21.method3111(arg2, arg3, arg6, arg5, var22.field3408);
            }
        } else if (arg6 == 9) {
            class128 var44;
            if (var22.field3413 == -1 && var22.field3431 == null) {
                var44 = var22.method4665(arg6, arg5, var29, var31, var30, var32);
            } else {
                var44 = new class86(arg4, arg6, arg5, var19, arg2, arg3, var22.field3413, true, (class128) null);
            }
            var20.method2698(arg0, arg2, arg3, var30, 1, 1, var44, 0, var33, var35);
            if (var22.field3407 != 0) {
                var21.method3112(arg2, arg3, var23, var24, var22.field3408);
            }
        } else if (arg6 == 4) {
            class128 var45;
            if (var22.field3413 == -1 && var22.field3431 == null) {
                var45 = var22.method4665(4, arg5, var29, var31, var30, var32);
            } else {
                var45 = new class86(arg4, 4, arg5, var19, arg2, arg3, var22.field3413, true, (class128) null);
            }
            var20.method2697(arg0, arg2, arg3, var30, var45, (class128) null, class51.field455[arg5], 0, 0, 0, var33, var35);
        } else if (arg6 == 5) {
            int var46 = 16;
            long var47 = var20.method2714(arg0, arg2, arg3);
            if (var47 != 0L) {
                var46 = class269.method675(class121.method94(var47)).field3414;
            }
            class128 var49;
            if (var22.field3413 == -1 && var22.field3431 == null) {
                var49 = var22.method4665(4, arg5, var29, var31, var30, var32);
            } else {
                var49 = new class86(arg4, 4, arg5, var19, arg2, arg3, var22.field3413, true, (class128) null);
            }
            var20.method2697(arg0, arg2, arg3, var30, var49, (class128) null, class51.field455[arg5], 0, class51.field457[arg5] * var46, class51.field458[arg5] * var46, var33, var35);
        } else if (arg6 == 6) {
            int var50 = 8;
            long var51 = var20.method2714(arg0, arg2, arg3);
            if (var51 != 0L) {
                var50 = class269.method675(class121.method94(var51)).field3414 / 2;
            }
            class128 var53;
            if (var22.field3413 == -1 && var22.field3431 == null) {
                var53 = var22.method4665(4, arg5 + 4, var29, var31, var30, var32);
            } else {
                var53 = new class86(arg4, 4, arg5 + 4, var19, arg2, arg3, var22.field3413, true, (class128) null);
            }
            var20.method2697(arg0, arg2, arg3, var30, var53, (class128) null, 256, arg5, class51.field459[arg5] * var50, class51.field460[arg5] * var50, var33, var35);
        } else if (arg6 == 7) {
            int var54 = arg5 + 2 & 0x3;
            class128 var55;
            if (var22.field3413 == -1 && var22.field3431 == null) {
                var55 = var22.method4665(4, var54 + 4, var29, var31, var30, var32);
            } else {
                var55 = new class86(arg4, 4, var54 + 4, var19, arg2, arg3, var22.field3413, true, (class128) null);
            }
            var20.method2697(arg0, arg2, arg3, var30, var55, (class128) null, 256, var54, 0, 0, var33, var35);
        } else if (arg6 == 8) {
            int var56 = 8;
            long var57 = var20.method2714(arg0, arg2, arg3);
            if (var57 != 0L) {
                var56 = class269.method675(class121.method94(var57)).field3414 / 2;
            }
            int var59 = arg5 + 2 & 0x3;
            class128 var60;
            class128 var61;
            if (var22.field3413 == -1 && var22.field3431 == null) {
                var60 = var22.method4665(4, arg5 + 4, var29, var31, var30, var32);
                var61 = var22.method4665(4, var59 + 4, var29, var31, var30, var32);
            } else {
                var60 = new class86(arg4, 4, arg5 + 4, var19, arg2, arg3, var22.field3413, true, (class128) null);
                var61 = new class86(arg4, 4, var59 + 4, var19, arg2, arg3, var22.field3413, true, (class128) null);
            }
            var20.method2697(arg0, arg2, arg3, var30, var60, var61, 256, arg5, class51.field459[arg5] * var56, class51.field460[arg5] * var56, var33, var35);
        }
    }

    @ObfuscatedName("fr.ht(IIS)V")
    public static final void method3166(int arg0, int arg1) {
        class206 var2 = field721[Statics.field2416][arg0][arg1];
        if (var2 == null) {
            Statics.field524.method2709(Statics.field2416, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class81 var5 = null;
        for (class81 var6 = (class81) var2.method3797(); var6 != null; var6 = (class81) var2.method3788()) {
            class270 var7 = class270.method2571(var6.field1175);
            long var8 = (long) var7.field3488;
            if (var7.field3483 == 1) {
                var8 = (long) (var6.field1173 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field524.method2709(Statics.field2416, arg0, arg1);
            return;
        }
        var2.method3791(var5);
        class81 var10 = null;
        class81 var11 = null;
        for (class81 var12 = (class81) var2.method3797(); var12 != null; var12 = (class81) var2.method3788()) {
            if (var5.field1175 != var12.field1175) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1175 != var12.field1175 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        long var13 = Statics.method1038(arg0, arg1, 3, false, 0);
        Statics.field524.method2695(Statics.field2416, arg0, arg1, method4568(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field2416), var5, var13, var10, var11);
    }

    @ObfuscatedName("q.hg(ZLge;B)V")
    public static final void method25(boolean arg0, class190 arg1) {
        field714 = 0;
        field638 = 0;
        class190 var2 = field740.field1255;
        var2.method3582();
        int var3 = var2.method3555(8);
        if (var3 < field636) {
            for (int var4 = var3; var4 < field636; var4++) {
                field715[++field714 - 1] = field637[var4];
            }
        }
        if (var3 > field636) {
            throw new RuntimeException("");
        }
        field636 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = field637[var5];
            class73 var7 = field808[var6];
            int var8 = var2.method3555(1);
            if (var8 == 0) {
                field637[++field636 - 1] = var6;
                var7.field933 = field680;
            } else {
                int var9 = var2.method3555(2);
                if (var9 == 0) {
                    field637[++field636 - 1] = var6;
                    var7.field933 = field680;
                    field639[++field638 - 1] = var6;
                } else if (var9 == 1) {
                    field637[++field636 - 1] = var6;
                    var7.field933 = field680;
                    int var10 = var2.method3555(3);
                    var7.method1703(var10, (byte) 1);
                    int var11 = var2.method3555(1);
                    if (var11 == 1) {
                        field639[++field638 - 1] = var6;
                    }
                } else if (var9 == 2) {
                    field637[++field636 - 1] = var6;
                    var7.field933 = field680;
                    int var12 = var2.method3555(3);
                    var7.method1703(var12, (byte) 2);
                    int var13 = var2.method3555(3);
                    var7.method1703(var13, (byte) 2);
                    int var14 = var2.method3555(1);
                    if (var14 == 1) {
                        field639[++field638 - 1] = var6;
                    }
                } else if (var9 == 3) {
                    field715[++field714 - 1] = var6;
                }
            }
        }
        method2876(arg0, arg1);
        for (int var15 = 0; var15 < field638; var15++) {
            int var16 = field639[var15];
            class73 var17 = field808[var16];
            int var18 = arg1.method3436();
            if ((var18 & 0x2) != 0) {
                var17.field936 = arg1.method3478();
                if (var17.field936 == 65535) {
                    var17.field936 = -1;
                }
            }
            if ((var18 & 0x20) != 0) {
                int var19 = arg1.method3291();
                if (var19 > 0) {
                    for (int var20 = 0; var20 < var19; var20++) {
                        int var21 = -1;
                        int var22 = -1;
                        int var23 = -1;
                        int var24 = arg1.method3293();
                        if (var24 == 32767) {
                            var24 = arg1.method3293();
                            var22 = arg1.method3293();
                            var21 = arg1.method3293();
                            var23 = arg1.method3293();
                        } else if (var24 == 32766) {
                            var24 = -1;
                        } else {
                            var22 = arg1.method3293();
                        }
                        int var25 = arg1.method3293();
                        var17.method1469(var24, var22, var21, var23, field680, var25);
                    }
                }
                int var26 = arg1.method3247();
                if (var26 > 0) {
                    for (int var27 = 0; var27 < var26; var27++) {
                        int var28 = arg1.method3293();
                        int var29 = arg1.method3293();
                        if (var29 == 32767) {
                            var17.method1466(var28);
                        } else {
                            int var30 = arg1.method3293();
                            int var31 = arg1.method3247();
                            int var32 = var29 > 0 ? arg1.method3247() : var31;
                            var17.method1470(var28, field680, var29, var30, var31, var32);
                        }
                    }
                }
            }
            if ((var18 & 0x8) != 0) {
                int var33 = arg1.method3268();
                int var34 = arg1.method3478();
                int var35 = var17.field901 - (var33 - Statics.field2316 - Statics.field2316) * 64;
                int var36 = var17.field919 - (var34 - Statics.field1052 - Statics.field1052) * 64;
                if (var35 != 0 || var36 != 0) {
                    var17.field898 = (int) (Math.atan2((double) var35, (double) var36) * 325.949D) & 0x7FF;
                }
            }
            if ((var18 & 0x10) != 0) {
                var17.field921 = arg1.method3268();
                int var37 = arg1.method3312();
                var17.field925 = var37 >> 16;
                var17.field924 = (var37 & 0xFFFF) + field680;
                var17.field922 = 0;
                var17.field904 = 0;
                if (var17.field924 > field680) {
                    var17.field922 = -1;
                }
                if (var17.field921 == 65535) {
                    var17.field921 = -1;
                }
            }
            if ((var18 & 0x4) != 0) {
                int var38 = arg1.method3370();
                if (var38 == 65535) {
                    var38 = -1;
                }
                int var39 = arg1.method3291();
                if (var17.field916 == var38 && var38 != -1) {
                    int var40 = class274.method2918(var38).field3567;
                    if (var40 == 1) {
                        var17.field917 = 0;
                        var17.field918 = 0;
                        var17.field914 = var39;
                        var17.field920 = 0;
                    }
                    if (var40 == 2) {
                        var17.field920 = 0;
                    }
                } else if (var38 == -1 || var17.field916 == -1 || class274.method2918(var38).field3561 >= class274.method2918(var17.field916).field3561) {
                    var17.field916 = var38;
                    var17.field917 = 0;
                    var17.field918 = 0;
                    var17.field914 = var39;
                    var17.field920 = 0;
                    var17.field943 = var17.field938;
                }
            }
            if ((var18 & 0x40) != 0) {
                var17.field1059 = class272.method1034(arg1.method3268());
                var17.field886 = var17.field1059.field3520;
                var17.field930 = var17.field1059.field3529;
                var17.field891 = var17.field1059.field3512;
                var17.field892 = var17.field1059.field3513;
                var17.field883 = var17.field1059.field3519;
                var17.field894 = var17.field1059.field3515;
                var17.field910 = var17.field1059.field3518;
                var17.field893 = var17.field1059.field3510;
                var17.field890 = var17.field1059.field3500;
            }
            if ((var18 & 0x1) != 0) {
                var17.field896 = arg1.method3271();
                var17.field899 = 100;
            }
        }
        for (int var41 = 0; var41 < field714; var41++) {
            int var42 = field715[var41];
            if (field680 != field808[var42].field933) {
                field808[var42].field1059 = null;
                field808[var42] = null;
            }
        }
        if (field740.field1248 != arg1.field2360) {
            throw new RuntimeException(arg1.field2360 + class75.field1069 + field740.field1248);
        }
        for (int var43 = 0; var43 < field636; var43++) {
            if (field808[field637[var43]] == null) {
                throw new RuntimeException(var43 + class75.field1069 + field636);
            }
        }
    }

    @ObfuscatedName("ec.hc(ZLge;I)V")
    public static final void method2876(boolean arg0, class190 arg1) {
        while (true) {
            if (arg1.method3557(field740.field1248) >= 27) {
                int var2 = arg1.method3555(15);
                if (var2 != 32767) {
                    boolean var3 = false;
                    if (field808[var2] == null) {
                        field808[var2] = new class73();
                        var3 = true;
                    }
                    class73 var4 = field808[var2];
                    field637[++field636 - 1] = var2;
                    var4.field933 = field680;
                    int var5;
                    if (arg0) {
                        var5 = arg1.method3555(8);
                        if (var5 > 127) {
                            var5 -= 256;
                        }
                    } else {
                        var5 = arg1.method3555(5);
                        if (var5 > 15) {
                            var5 -= 32;
                        }
                    }
                    int var6 = arg1.method3555(1);
                    if (var6 == 1) {
                        field639[++field638 - 1] = var2;
                    }
                    int var7 = field666[arg1.method3555(3)];
                    if (var3) {
                        var4.field935 = var4.field884 = var7;
                    }
                    int var8 = arg1.method3555(1);
                    int var9;
                    if (arg0) {
                        var9 = arg1.method3555(8);
                        if (var9 > 127) {
                            var9 -= 256;
                        }
                    } else {
                        var9 = arg1.method3555(5);
                        if (var9 > 15) {
                            var9 -= 32;
                        }
                    }
                    var4.field1059 = class272.method1034(arg1.method3555(14));
                    var4.field886 = var4.field1059.field3520;
                    var4.field930 = var4.field1059.field3529;
                    if (var4.field930 == 0) {
                        var4.field884 = 0;
                    }
                    var4.field891 = var4.field1059.field3512;
                    var4.field892 = var4.field1059.field3513;
                    var4.field883 = var4.field1059.field3519;
                    var4.field894 = var4.field1059.field3515;
                    var4.field910 = var4.field1059.field3518;
                    var4.field893 = var4.field1059.field3510;
                    var4.field890 = var4.field1059.field3500;
                    var4.method1702(Statics.field1949.field929[0] + var5, Statics.field1949.field940[0] + var9, var8 == 1);
                    continue;
                }
            }
            arg1.method3556();
            return;
        }
    }

    @ObfuscatedName("fy.ha(IIB)Lfu;")
    public static class167 method3155(int arg0, int arg1) {
        field863.field2067 = arg0;
        field863.field2068 = arg1;
        field863.field2071 = 1;
        field863.field2070 = 1;
        return field863;
    }

    @ObfuscatedName("bs.hh(I)V")
    public static void method1481() {
        field658 = 0;
        field847 = false;
        field735[0] = class238.field3051;
        field736[0] = "";
        field703[0] = 1006;
        field729[0] = false;
        field658 = 1;
    }

    @ObfuscatedName("bu.hu(III)V")
    public static final void method1087(int arg0, int arg1) {
        if (field658 < 2 && field772 == 0 && !field814 || !field741) {
            return;
        }
        int var2 = field658 - 1;
        String var4;
        if (field772 == 1 && field658 < 2) {
            var4 = class238.field2965 + class238.field2975 + field760 + " " + class75.field1077;
        } else if (field814 && field658 < 2) {
            var4 = field751 + class238.field2975 + field752 + " " + class75.field1077;
        } else {
            var4 = method4225(var2);
        }
        if (field658 > 2) {
            var4 = var4 + class75.method969(16777215) + " " + '/' + " " + (field658 - 2) + class238.field2969;
        }
        Statics.field500.method5122(var4, arg0 + 4, arg1 + 15, 16777215, 0, field680 / 1000);
    }

    @ObfuscatedName("ag.hs(IIIIB)V")
    public static final void method558(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field794; var4++) {
            if (field801[var4] + field799[var4] > arg0 && field799[var4] < arg0 + arg2 && field800[var4] + field605[var4] > arg1 && field800[var4] < arg1 + arg3) {
                field796[var4] = true;
            }
        }
    }

    @ObfuscatedName("ip.hz(IIIII)V")
    public static final void method4234(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field794; var4++) {
            if (field801[var4] + field799[var4] > arg0 && field799[var4] < arg0 + arg2 && field800[var4] + field605[var4] > arg1 && field800[var4] < arg1 + arg3) {
                field797[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.hl(I)V")
    public final void method1111() {
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < field658 - 1; var2++) {
                if (field703[var2] < 1000 && field703[var2 + 1] > 1000) {
                    String var3 = field736[var2];
                    field736[var2] = field736[var2 + 1];
                    field736[var2 + 1] = var3;
                    String var4 = field735[var2];
                    field735[var2] = field735[var2 + 1];
                    field735[var2 + 1] = var4;
                    int var5 = field703[var2];
                    field703[var2] = field703[var2 + 1];
                    field703[var2 + 1] = var5;
                    int var6 = field731[var2];
                    field731[var2] = field731[var2 + 1];
                    field731[var2 + 1] = var6;
                    int var7 = field738[var2];
                    field738[var2] = field738[var2 + 1];
                    field738[var2 + 1] = var7;
                    int var8 = field620[var2];
                    field620[var2] = field620[var2 + 1];
                    field620[var2 + 1] = var8;
                    boolean var9 = field729[var2];
                    field729[var2] = field729[var2 + 1];
                    field729[var2 + 1] = var9;
                    var1 = false;
                }
            }
        }
        if (Statics.field443 != null || field764 != null) {
            return;
        }
        int var27;
        int var30;
        int var31;
        label213: {
            int var10 = class49.field432;
            if (field847) {
                if (var10 != 1 && (Statics.field58 || var10 != 4)) {
                    int var11 = class49.field426;
                    int var12 = class49.field418;
                    if (var11 < Statics.field304 - 10 || var11 > Statics.field304 + Statics.field1898 + 10 || var12 < Statics.field559 - 10 || var12 > Statics.field559 + Statics.field1889 + 10) {
                        field847 = false;
                        method558(Statics.field304, Statics.field559, Statics.field1898, Statics.field1889);
                    }
                }
                if (var10 == 1 || !Statics.field58 && var10 == 4) {
                    int var13 = Statics.field304;
                    int var14 = Statics.field559;
                    int var15 = Statics.field1898;
                    int var16 = class49.field433;
                    int var17 = class49.field438;
                    int var18 = -1;
                    for (int var19 = 0; var19 < field658; var19++) {
                        int var20 = (field658 - 1 - var19) * 15 + var14 + 31;
                        if (var16 > var13 && var16 < var13 + var15 && var17 > var20 - 13 && var17 < var20 + 3) {
                            var18 = var19;
                        }
                    }
                    if (var18 != -1 && var18 >= 0) {
                        int var21 = field731[var18];
                        int var22 = field738[var18];
                        int var23 = field703[var18];
                        int var24 = field620[var18];
                        String var25 = field735[var18];
                        String var26 = field736[var18];
                        method2348(var21, var22, var23, var24, var25, var26, class49.field433, class49.field438);
                    }
                    field847 = false;
                    method558(Statics.field304, Statics.field559, Statics.field1898, Statics.field1889);
                }
            } else {
                var27 = field658 - 1;
                if ((var10 == 1 || !Statics.field58 && var10 == 4) && var27 >= 0) {
                    int var29 = field703[var27];
                    if (var29 == 39 || var29 == 40 || var29 == 41 || var29 == 42 || var29 == 43 || var29 == 33 || var29 == 34 || var29 == 35 || var29 == 36 || var29 == 37 || var29 == 38 || var29 == 1005) {
                        var30 = field731[var27];
                        var31 = field738[var27];
                        class231 var32 = class231.method1097(var31);
                        if (class232.method4114(method2080(var32))) {
                            break label213;
                        }
                        int var33 = method2080(var32);
                        boolean var34 = (var33 >> 29 & 0x1) != 0;
                        if (var34) {
                            break label213;
                        }
                    }
                }
                if ((var10 == 1 || !Statics.field58 && var10 == 4) && this.method1112()) {
                    var10 = 2;
                }
                if ((var10 == 1 || !Statics.field58 && var10 == 4) && field658 > 0 && var27 >= 0) {
                    int var37 = field731[var27];
                    int var38 = field738[var27];
                    int var39 = field703[var27];
                    int var40 = field620[var27];
                    String var41 = field735[var27];
                    String var42 = field736[var27];
                    method2348(var37, var38, var39, var40, var41, var42, class49.field433, class49.field438);
                }
                if (var10 == 2 && field658 > 0) {
                    this.method1342(class49.field433, class49.field438);
                }
            }
            return;
        }
        if (Statics.field443 != null && !field705 && field658 > 0 && !this.method1112()) {
            int var35 = field702;
            int var36 = field641;
            method433(Statics.field2377, var35, var36);
            Statics.field2377 = null;
        }
        field705 = false;
        field706 = 0;
        if (Statics.field443 != null) {
            method3242(Statics.field443);
        }
        Statics.field443 = class231.method1097(var31);
        field598 = var30;
        field702 = class49.field433;
        field641 = class49.field438;
        if (var27 >= 0) {
            Statics.field2377 = new class76();
            Statics.field2377.field1083 = field731[var27];
            Statics.field2377.field1078 = field738[var27];
            Statics.field2377.field1084 = field703[var27];
            Statics.field2377.field1081 = field620[var27];
            Statics.field2377.field1082 = field735[var27];
        }
        method3242(Statics.field443);
    }

    @ObfuscatedName("client.hb(I)Z")
    public final boolean method1112() {
        int var1 = field658 - 1;
        boolean var3 = field728 == 1 && field658 > 2;
        if (!var3) {
            boolean var4;
            if (var1 < 0) {
                var4 = false;
            } else {
                int var5 = field703[var1];
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
        return var3 && !field729[var1];
    }

    @ObfuscatedName("client.hw(III)V")
    public final void method1342(int arg0, int arg1) {
        method441(arg0, arg1);
        Statics.field524.method2725(Statics.field2416, arg0, arg1, false);
        field847 = true;
    }

    @ObfuscatedName("v.hf(IIB)V")
    public static void method441(int arg0, int arg1) {
        int var2 = Statics.field500.method5109(class238.field2968);
        for (int var3 = 0; var3 < field658; var3++) {
            int var4 = Statics.field500.method5109(method4225(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field658 * 15 + 22;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > Statics.field71) {
            var6 = Statics.field71 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > Statics.field327) {
            var7 = Statics.field327 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        Statics.field304 = var6;
        Statics.field559 = var7;
        Statics.field1898 = var2;
        Statics.field1889 = field658 * 15 + 22;
    }

    @ObfuscatedName("r.ii(Lbd;III)V")
    public static final void method433(class76 arg0, int arg1, int arg2) {
        method2348(arg0.field1083, arg0.field1078, arg0.field1084, arg0.field1081, arg0.field1082, arg0.field1082, arg1, arg2);
    }

    @ObfuscatedName("dw.if(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method2348(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 9) {
            class73 var8 = field808[arg3];
            if (var8 != null) {
                field744 = arg6;
                field840 = arg7;
                field697 = 2;
                field844 = 0;
                field821 = arg0;
                field822 = arg1;
                class173 var9 = class173.method2882(class170.field2180, field740.field1251);
                var9.field2280.method3419(arg3);
                var9.field2280.method3290(class40.field341[82] ? 1 : 0);
                field740.method1873(var9);
            }
        }
        if (arg2 == 24) {
            class231 var10 = class231.method1097(arg1);
            boolean var11 = true;
            if (var10.field2712 > 0) {
                var11 = method164(var10);
            }
            if (var11) {
                class173 var12 = class173.method2882(class170.field2232, field740.field1251);
                var12.field2280.method3249(arg1);
                field740.method1873(var12);
            }
        }
        if (arg2 == 36) {
            class173 var13 = class173.method2882(class170.field2200, field740.field1251);
            var13.field2280.method3401(arg0);
            var13.field2280.method3335(arg1);
            var13.field2280.method3401(arg3);
            field740.method1873(var13);
            field699 = 0;
            Statics.field1922 = class231.method1097(arg1);
            field700 = arg0;
        }
        if (arg2 == 30 && field757 == null) {
            class173 var14 = class173.method2882(class170.field2226, field740.field1251);
            var14.field2280.method3364(arg1);
            var14.field2280.method3299(arg0);
            field740.method1873(var14);
            field757 = class231.method282(arg1, arg0);
            method3242(field757);
        }
        if (arg2 == 17) {
            field744 = arg6;
            field840 = arg7;
            field697 = 2;
            field844 = 0;
            field821 = arg0;
            field822 = arg1;
            class173 var15 = class173.method2882(class170.field2255, field740.field1251);
            var15.field2280.method3401(Statics.field1052 + arg1);
            var15.field2280.method3299(field749);
            var15.field2280.method3419(Statics.field2316 + arg0);
            var15.field2280.method3290(class40.field341[82] ? 1 : 0);
            var15.field2280.method3335(Statics.field1912);
            var15.field2280.method3299(arg3);
            field740.method1873(var15);
        }
        if (arg2 == 31) {
            class173 var16 = class173.method2882(class170.field2210, field740.field1251);
            var16.field2280.method3296(Statics.field555);
            var16.field2280.method3249(Statics.field2297);
            var16.field2280.method3419(arg3);
            var16.field2280.method3419(arg0);
            var16.field2280.method3335(arg1);
            var16.field2280.method3419(Statics.field221);
            field740.method1873(var16);
            field699 = 0;
            Statics.field1922 = class231.method1097(arg1);
            field700 = arg0;
        }
        if (arg2 == 1004) {
            field744 = arg6;
            field840 = arg7;
            field697 = 2;
            field844 = 0;
            class173 var17 = class173.method2882(class170.field2253, field740.field1251);
            var17.field2280.method3401(arg3);
            field740.method1873(var17);
        }
        if (arg2 == 5) {
            field744 = arg6;
            field840 = arg7;
            field697 = 2;
            field844 = 0;
            field821 = arg0;
            field822 = arg1;
            class173 var18 = class173.method2882(class170.field2171, field740.field1251);
            var18.field2280.method3299(Statics.field1052 + arg1);
            var18.field2280.method3296(arg3);
            var18.field2280.method3289(class40.field341[82] ? 1 : 0);
            var18.field2280.method3296(Statics.field2316 + arg0);
            field740.method1873(var18);
        }
        if (arg2 == 20) {
            field744 = arg6;
            field840 = arg7;
            field697 = 2;
            field844 = 0;
            field821 = arg0;
            field822 = arg1;
            class173 var19 = class173.method2882(class170.field2212, field740.field1251);
            var19.field2280.method3296(arg3);
            var19.field2280.method3288(class40.field341[82] ? 1 : 0);
            var19.field2280.method3419(Statics.field2316 + arg0);
            var19.field2280.method3419(Statics.field1052 + arg1);
            field740.method1873(var19);
        }
        if (arg2 == 34) {
            class173 var20 = class173.method2882(class170.field2185, field740.field1251);
            var20.field2280.method3364(arg1);
            var20.field2280.method3299(arg0);
            var20.field2280.method3296(arg3);
            field740.method1873(var20);
            field699 = 0;
            Statics.field1922 = class231.method1097(arg1);
            field700 = arg0;
        }
        if (arg2 == 40) {
            class173 var21 = class173.method2882(class170.field2173, field740.field1251);
            var21.field2280.method3296(arg0);
            var21.field2280.method3335(arg1);
            var21.field2280.method3401(arg3);
            field740.method1873(var21);
            field699 = 0;
            Statics.field1922 = class231.method1097(arg1);
            field700 = arg0;
        }
        if (arg2 == 1001) {
            field744 = arg6;
            field840 = arg7;
            field697 = 2;
            field844 = 0;
            field821 = arg0;
            field822 = arg1;
            class173 var22 = class173.method2882(class170.field2176, field740.field1251);
            var22.field2280.method3299(Statics.field1052 + arg1);
            var22.field2280.method3289(class40.field341[82] ? 1 : 0);
            var22.field2280.method3419(Statics.field2316 + arg0);
            var22.field2280.method3419(arg3);
            field740.method1873(var22);
        }
        if (arg2 == 8) {
            class73 var23 = field808[arg3];
            if (var23 != null) {
                field744 = arg6;
                field840 = arg7;
                field697 = 2;
                field844 = 0;
                field821 = arg0;
                field822 = arg1;
                class173 var24 = class173.method2882(class170.field2213, field740.field1251);
                var24.field2280.method3335(Statics.field1912);
                var24.field2280.method3296(arg3);
                var24.field2280.method3290(class40.field341[82] ? 1 : 0);
                var24.field2280.method3419(field749);
                field740.method1873(var24);
            }
        }
        if (arg2 == 1005) {
            class231 var25 = class231.method1097(arg1);
            if (var25 == null || var25.field2744[arg0] < 100000) {
                class173 var26 = class173.method2882(class170.field2253, field740.field1251);
                var26.field2280.method3401(arg3);
                field740.method1873(var26);
            } else {
                class84.method1098(27, "", var25.field2744[arg0] + " x " + class270.method2571(arg3).field3450);
            }
            field699 = 0;
            Statics.field1922 = class231.method1097(arg1);
            field700 = arg0;
        }
        if (arg2 == 15) {
            class61 var27 = field807[arg3];
            if (var27 != null) {
                field744 = arg6;
                field840 = arg7;
                field697 = 2;
                field844 = 0;
                field821 = arg0;
                field822 = arg1;
                class173 var28 = class173.method2882(class170.field2235, field740.field1251);
                var28.field2280.method3419(field749);
                var28.field2280.method3335(Statics.field1912);
                var28.field2280.method3288(class40.field341[82] ? 1 : 0);
                var28.field2280.method3401(arg3);
                field740.method1873(var28);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class231 var29 = class231.method282(arg1, arg0);
            if (var29 != null) {
                int var30 = var29.field2755;
                class231 var31 = class231.method282(arg1, arg0);
                if (var31 != null) {
                    if (var31.field2611 != null) {
                        class57 var32 = new class57();
                        var32.field512 = var31;
                        var32.field515 = arg3;
                        var32.field510 = arg5;
                        var32.field526 = var31.field2611;
                        class70.method1612(var32);
                    }
                    boolean var33 = true;
                    if (var31.field2712 > 0) {
                        var33 = method164(var31);
                    }
                    if (var33 && class232.method2978(method2080(var31), arg3 - 1)) {
                        if (arg3 == 1) {
                            class173 var34 = class173.method2882(class170.field2225, field740.field1251);
                            var34.field2280.method3249(arg1);
                            var34.field2280.method3296(arg0);
                            var34.field2280.method3296(var30);
                            field740.method1873(var34);
                        }
                        if (arg3 == 2) {
                            class173 var35 = class173.method2882(class170.field2175, field740.field1251);
                            var35.field2280.method3249(arg1);
                            var35.field2280.method3296(arg0);
                            var35.field2280.method3296(var30);
                            field740.method1873(var35);
                        }
                        if (arg3 == 3) {
                            class173 var36 = class173.method2882(class170.field2159, field740.field1251);
                            var36.field2280.method3249(arg1);
                            var36.field2280.method3296(arg0);
                            var36.field2280.method3296(var30);
                            field740.method1873(var36);
                        }
                        if (arg3 == 4) {
                            class173 var37 = class173.method2882(class170.field2172, field740.field1251);
                            var37.field2280.method3249(arg1);
                            var37.field2280.method3296(arg0);
                            var37.field2280.method3296(var30);
                            field740.method1873(var37);
                        }
                        if (arg3 == 5) {
                            class173 var38 = class173.method2882(class170.field2227, field740.field1251);
                            var38.field2280.method3249(arg1);
                            var38.field2280.method3296(arg0);
                            var38.field2280.method3296(var30);
                            field740.method1873(var38);
                        }
                        if (arg3 == 6) {
                            class173 var39 = class173.method2882(class170.field2178, field740.field1251);
                            var39.field2280.method3249(arg1);
                            var39.field2280.method3296(arg0);
                            var39.field2280.method3296(var30);
                            field740.method1873(var39);
                        }
                        if (arg3 == 7) {
                            class173 var40 = class173.method2882(class170.field2179, field740.field1251);
                            var40.field2280.method3249(arg1);
                            var40.field2280.method3296(arg0);
                            var40.field2280.method3296(var30);
                            field740.method1873(var40);
                        }
                        if (arg3 == 8) {
                            class173 var41 = class173.method2882(class170.field2230, field740.field1251);
                            var41.field2280.method3249(arg1);
                            var41.field2280.method3296(arg0);
                            var41.field2280.method3296(var30);
                            field740.method1873(var41);
                        }
                        if (arg3 == 9) {
                            class173 var42 = class173.method2882(class170.field2216, field740.field1251);
                            var42.field2280.method3249(arg1);
                            var42.field2280.method3296(arg0);
                            var42.field2280.method3296(var30);
                            field740.method1873(var42);
                        }
                        if (arg3 == 10) {
                            class173 var43 = class173.method2882(class170.field2246, field740.field1251);
                            var43.field2280.method3249(arg1);
                            var43.field2280.method3296(arg0);
                            var43.field2280.method3296(var30);
                            field740.method1873(var43);
                        }
                    }
                }
            }
        }
        if (arg2 == 1003) {
            field744 = arg6;
            field840 = arg7;
            field697 = 2;
            field844 = 0;
            class73 var44 = field808[arg3];
            if (var44 != null) {
                class272 var45 = var44.field1059;
                if (var45.field3530 != null) {
                    var45 = var45.method4797();
                }
                if (var45 != null) {
                    class173 var46 = class173.method2882(class170.field2237, field740.field1251);
                    var46.field2280.method3299(var45.field3504);
                    field740.method1873(var46);
                }
            }
        }
        if (arg2 == 13) {
            class73 var47 = field808[arg3];
            if (var47 != null) {
                field744 = arg6;
                field840 = arg7;
                field697 = 2;
                field844 = 0;
                field821 = arg0;
                field822 = arg1;
                class173 var48 = class173.method2882(class170.field2190, field740.field1251);
                var48.field2280.method3401(arg3);
                var48.field2280.method3246(class40.field341[82] ? 1 : 0);
                field740.method1873(var48);
            }
        }
        if (arg2 == 10) {
            class73 var49 = field808[arg3];
            if (var49 != null) {
                field744 = arg6;
                field840 = arg7;
                field697 = 2;
                field844 = 0;
                field821 = arg0;
                field822 = arg1;
                class173 var50 = class173.method2882(class170.field2236, field740.field1251);
                var50.field2280.method3296(arg3);
                var50.field2280.method3246(class40.field341[82] ? 1 : 0);
                field740.method1873(var50);
            }
        }
        if (arg2 == 35) {
            class173 var51 = class173.method2882(class170.field2239, field740.field1251);
            var51.field2280.method3299(arg0);
            var51.field2280.method3249(arg1);
            var51.field2280.method3401(arg3);
            field740.method1873(var51);
            field699 = 0;
            Statics.field1922 = class231.method1097(arg1);
            field700 = arg0;
        }
        if (arg2 == 3) {
            field744 = arg6;
            field840 = arg7;
            field697 = 2;
            field844 = 0;
            field821 = arg0;
            field822 = arg1;
            class173 var52 = class173.method2882(class170.field2192, field740.field1251);
            var52.field2280.method3419(arg3);
            var52.field2280.method3299(Statics.field1052 + arg1);
            var52.field2280.method3299(Statics.field2316 + arg0);
            var52.field2280.method3290(class40.field341[82] ? 1 : 0);
            field740.method1873(var52);
        }
        if (arg2 == 48) {
            class61 var53 = field807[arg3];
            if (var53 != null) {
                field744 = arg6;
                field840 = arg7;
                field697 = 2;
                field844 = 0;
                field821 = arg0;
                field822 = arg1;
                class173 var54 = class173.method2882(class170.field2234, field740.field1251);
                var54.field2280.method3290(class40.field341[82] ? 1 : 0);
                var54.field2280.method3401(arg3);
                field740.method1873(var54);
            }
        }
        if (arg2 == 50) {
            class61 var55 = field807[arg3];
            if (var55 != null) {
                field744 = arg6;
                field840 = arg7;
                field697 = 2;
                field844 = 0;
                field821 = arg0;
                field822 = arg1;
                class173 var56 = class173.method2882(class170.field2181, field740.field1251);
                var56.field2280.method3419(arg3);
                var56.field2280.method3288(class40.field341[82] ? 1 : 0);
                field740.method1873(var56);
            }
        }
        if (arg2 == 16) {
            field744 = arg6;
            field840 = arg7;
            field697 = 2;
            field844 = 0;
            field821 = arg0;
            field822 = arg1;
            class173 var57 = class173.method2882(class170.field2243, field740.field1251);
            var57.field2280.method3299(arg3);
            var57.field2280.method3299(Statics.field2316 + arg0);
            var57.field2280.method3335(Statics.field2297);
            var57.field2280.method3288(class40.field341[82] ? 1 : 0);
            var57.field2280.method3296(Statics.field555);
            var57.field2280.method3419(Statics.field1052 + arg1);
            var57.field2280.method3296(Statics.field221);
            field740.method1873(var57);
        }
        if (arg2 == 43) {
            class173 var58 = class173.method2882(class170.field2221, field740.field1251);
            var58.field2280.method3296(arg3);
            var58.field2280.method3401(arg0);
            var58.field2280.method3249(arg1);
            field740.method1873(var58);
            field699 = 0;
            Statics.field1922 = class231.method1097(arg1);
            field700 = arg0;
        }
        if (arg2 == 28) {
            class173 var59 = class173.method2882(class170.field2232, field740.field1251);
            var59.field2280.method3249(arg1);
            field740.method1873(var59);
            class231 var60 = class231.method1097(arg1);
            if (var60.field2737 != null && var60.field2737[0][0] == 5) {
                int var61 = var60.field2737[0][1];
                class226.field2579[var61] = 1 - class226.field2579[var61];
                method4169(var61);
            }
        }
        if (arg2 == 18) {
            field744 = arg6;
            field840 = arg7;
            field697 = 2;
            field844 = 0;
            field821 = arg0;
            field822 = arg1;
            class173 var62 = class173.method2882(class170.field2233, field740.field1251);
            var62.field2280.method3296(arg3);
            var62.field2280.method3246(class40.field341[82] ? 1 : 0);
            var62.field2280.method3296(Statics.field1052 + arg1);
            var62.field2280.method3401(Statics.field2316 + arg0);
            field740.method1873(var62);
        }
        if (arg2 == 7) {
            class73 var63 = field808[arg3];
            if (var63 != null) {
                field744 = arg6;
                field840 = arg7;
                field697 = 2;
                field844 = 0;
                field821 = arg0;
                field822 = arg1;
                class173 var64 = class173.method2882(class170.field2182, field740.field1251);
                var64.field2280.method3288(class40.field341[82] ? 1 : 0);
                var64.field2280.method3364(Statics.field2297);
                var64.field2280.method3401(Statics.field555);
                var64.field2280.method3299(Statics.field221);
                var64.field2280.method3296(arg3);
                field740.method1873(var64);
            }
        }
        if (arg2 == 37) {
            class173 var65 = class173.method2882(class170.field2199, field740.field1251);
            var65.field2280.method3299(arg0);
            var65.field2280.method3296(arg3);
            var65.field2280.method3364(arg1);
            field740.method1873(var65);
            field699 = 0;
            Statics.field1922 = class231.method1097(arg1);
            field700 = arg0;
        }
        if (arg2 == 6) {
            field744 = arg6;
            field840 = arg7;
            field697 = 2;
            field844 = 0;
            field821 = arg0;
            field822 = arg1;
            class173 var66 = class173.method2882(class170.field2189, field740.field1251);
            var66.field2280.method3290(class40.field341[82] ? 1 : 0);
            var66.field2280.method3401(Statics.field2316 + arg0);
            var66.field2280.method3296(arg3);
            var66.field2280.method3419(Statics.field1052 + arg1);
            field740.method1873(var66);
        }
        if (arg2 == 49) {
            class61 var67 = field807[arg3];
            if (var67 != null) {
                field744 = arg6;
                field840 = arg7;
                field697 = 2;
                field844 = 0;
                field821 = arg0;
                field822 = arg1;
                class173 var68 = class173.method2882(class170.field2165, field740.field1251);
                var68.field2280.method3401(arg3);
                var68.field2280.method3288(class40.field341[82] ? 1 : 0);
                field740.method1873(var68);
            }
        }
        if (arg2 == 39) {
            class173 var69 = class173.method2882(class170.field2197, field740.field1251);
            var69.field2280.method3401(arg3);
            var69.field2280.method3296(arg0);
            var69.field2280.method3335(arg1);
            field740.method1873(var69);
            field699 = 0;
            Statics.field1922 = class231.method1097(arg1);
            field700 = arg0;
        }
        if (arg2 == 42) {
            class173 var70 = class173.method2882(class170.field2231, field740.field1251);
            var70.field2280.method3299(arg3);
            var70.field2280.method3419(arg0);
            var70.field2280.method3364(arg1);
            field740.method1873(var70);
            field699 = 0;
            Statics.field1922 = class231.method1097(arg1);
            field700 = arg0;
        }
        if (arg2 == 1) {
            field744 = arg6;
            field840 = arg7;
            field697 = 2;
            field844 = 0;
            field821 = arg0;
            field822 = arg1;
            class173 var71 = class173.method2882(class170.field2203, field740.field1251);
            var71.field2280.method3401(Statics.field2316 + arg0);
            var71.field2280.method3299(Statics.field555);
            var71.field2280.method3289(class40.field341[82] ? 1 : 0);
            var71.field2280.method3419(Statics.field1052 + arg1);
            var71.field2280.method3296(Statics.field221);
            var71.field2280.method3419(arg3);
            var71.field2280.method3335(Statics.field2297);
            field740.method1873(var71);
        }
        if (arg2 == 44) {
            class61 var72 = field807[arg3];
            if (var72 != null) {
                field744 = arg6;
                field840 = arg7;
                field697 = 2;
                field844 = 0;
                field821 = arg0;
                field822 = arg1;
                class173 var73 = class173.method2882(class170.field2214, field740.field1251);
                var73.field2280.method3299(arg3);
                var73.field2280.method3288(class40.field341[82] ? 1 : 0);
                field740.method1873(var73);
            }
        }
        if (arg2 == 47) {
            class61 var74 = field807[arg3];
            if (var74 != null) {
                field744 = arg6;
                field840 = arg7;
                field697 = 2;
                field844 = 0;
                field821 = arg0;
                field822 = arg1;
                class173 var75 = class173.method2882(class170.field2219, field740.field1251);
                var75.field2280.method3246(class40.field341[82] ? 1 : 0);
                var75.field2280.method3419(arg3);
                field740.method1873(var75);
            }
        }
        if (arg2 == 4) {
            field744 = arg6;
            field840 = arg7;
            field697 = 2;
            field844 = 0;
            field821 = arg0;
            field822 = arg1;
            class173 var76 = class173.method2882(class170.field2169, field740.field1251);
            var76.field2280.method3401(Statics.field2316 + arg0);
            var76.field2280.method3289(class40.field341[82] ? 1 : 0);
            var76.field2280.method3296(Statics.field1052 + arg1);
            var76.field2280.method3299(arg3);
            field740.method1873(var76);
        }
        if (arg2 == 46) {
            class61 var77 = field807[arg3];
            if (var77 != null) {
                field744 = arg6;
                field840 = arg7;
                field697 = 2;
                field844 = 0;
                field821 = arg0;
                field822 = arg1;
                class173 var78 = class173.method2882(class170.field2161, field740.field1251);
                var78.field2280.method3246(class40.field341[82] ? 1 : 0);
                var78.field2280.method3401(arg3);
                field740.method1873(var78);
            }
        }
        if (arg2 == 19) {
            field744 = arg6;
            field840 = arg7;
            field697 = 2;
            field844 = 0;
            field821 = arg0;
            field822 = arg1;
            class173 var79 = class173.method2882(class170.field2258, field740.field1251);
            var79.field2280.method3401(Statics.field2316 + arg0);
            var79.field2280.method3296(Statics.field1052 + arg1);
            var79.field2280.method3401(arg3);
            var79.field2280.method3289(class40.field341[82] ? 1 : 0);
            field740.method1873(var79);
        }
        if (arg2 == 38) {
            method434();
            class231 var80 = class231.method1097(arg1);
            field772 = 1;
            Statics.field555 = arg0;
            Statics.field2297 = arg1;
            Statics.field221 = arg3;
            method3242(var80);
            field760 = class75.method969(16748608) + class270.method2571(arg3).field3450 + class75.method969(16777215);
            if (field760 == null) {
                field760 = class238.field2821;
            }
            return;
        }
        if (arg2 == 41) {
            class173 var81 = class173.method2882(class170.field2222, field740.field1251);
            var81.field2280.method3249(arg1);
            var81.field2280.method3296(arg3);
            var81.field2280.method3401(arg0);
            field740.method1873(var81);
            field699 = 0;
            Statics.field1922 = class231.method1097(arg1);
            field700 = arg0;
        }
        if (arg2 == 11) {
            class73 var82 = field808[arg3];
            if (var82 != null) {
                field744 = arg6;
                field840 = arg7;
                field697 = 2;
                field844 = 0;
                field821 = arg0;
                field822 = arg1;
                class173 var83 = class173.method2882(class170.field2186, field740.field1251);
                var83.field2280.method3289(class40.field341[82] ? 1 : 0);
                var83.field2280.method3401(arg3);
                field740.method1873(var83);
            }
        }
        if (arg2 == 26) {
            method100();
        }
        if (arg2 == 29) {
            class173 var84 = class173.method2882(class170.field2232, field740.field1251);
            var84.field2280.method3249(arg1);
            field740.method1873(var84);
            class231 var85 = class231.method1097(arg1);
            if (var85.field2737 != null && var85.field2737[0][0] == 5) {
                int var86 = var85.field2737[0][1];
                if (class226.field2579[var86] != var85.field2739[0]) {
                    class226.field2579[var86] = var85.field2739[0];
                    method4169(var86);
                }
            }
        }
        if (arg2 == 32) {
            class173 var87 = class173.method2882(class170.field2205, field740.field1251);
            var87.field2280.method3335(arg1);
            var87.field2280.method3419(arg3);
            var87.field2280.method3401(field749);
            var87.field2280.method3419(arg0);
            var87.field2280.method3444(Statics.field1912);
            field740.method1873(var87);
            field699 = 0;
            Statics.field1922 = class231.method1097(arg1);
            field700 = arg0;
        }
        if (arg2 == 51) {
            class61 var88 = field807[arg3];
            if (var88 != null) {
                field744 = arg6;
                field840 = arg7;
                field697 = 2;
                field844 = 0;
                field821 = arg0;
                field822 = arg1;
                class173 var89 = class173.method2882(class170.field2204, field740.field1251);
                var89.field2280.method3289(class40.field341[82] ? 1 : 0);
                var89.field2280.method3296(arg3);
                field740.method1873(var89);
            }
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field988.method5660(arg2, arg3, new class227(arg0), new class227(arg1));
        }
        if (arg2 == 21) {
            field744 = arg6;
            field840 = arg7;
            field697 = 2;
            field844 = 0;
            field821 = arg0;
            field822 = arg1;
            class173 var90 = class173.method2882(class170.field2174, field740.field1251);
            var90.field2280.method3401(arg3);
            var90.field2280.method3299(Statics.field2316 + arg0);
            var90.field2280.method3288(class40.field341[82] ? 1 : 0);
            var90.field2280.method3299(Statics.field1052 + arg1);
            field740.method1873(var90);
        }
        if (arg2 == 58) {
            class231 var91 = class231.method282(arg1, arg0);
            if (var91 != null) {
                class173 var92 = class173.method2882(class170.field2195, field740.field1251);
                var92.field2280.method3444(arg1);
                var92.field2280.method3364(Statics.field1912);
                var92.field2280.method3419(arg0);
                var92.field2280.method3299(field749);
                var92.field2280.method3299(var91.field2755);
                var92.field2280.method3299(field750);
                field740.method1873(var92);
            }
        }
        if (arg2 == 2) {
            field744 = arg6;
            field840 = arg7;
            field697 = 2;
            field844 = 0;
            field821 = arg0;
            field822 = arg1;
            class173 var93 = class173.method2882(class170.field2223, field740.field1251);
            var93.field2280.method3289(class40.field341[82] ? 1 : 0);
            var93.field2280.method3419(Statics.field2316 + arg0);
            var93.field2280.method3299(arg3);
            var93.field2280.method3296(field749);
            var93.field2280.method3249(Statics.field1912);
            var93.field2280.method3299(Statics.field1052 + arg1);
            field740.method1873(var93);
        }
        if (arg2 == 45) {
            class61 var94 = field807[arg3];
            if (var94 != null) {
                field744 = arg6;
                field840 = arg7;
                field697 = 2;
                field844 = 0;
                field821 = arg0;
                field822 = arg1;
                class173 var95 = class173.method2882(class170.field2217, field740.field1251);
                var95.field2280.method3289(class40.field341[82] ? 1 : 0);
                var95.field2280.method3299(arg3);
                field740.method1873(var95);
            }
        }
        if (arg2 == 12) {
            class73 var96 = field808[arg3];
            if (var96 != null) {
                field744 = arg6;
                field840 = arg7;
                field697 = 2;
                field844 = 0;
                field821 = arg0;
                field822 = arg1;
                class173 var97 = class173.method2882(class170.field2193, field740.field1251);
                var97.field2280.method3288(class40.field341[82] ? 1 : 0);
                var97.field2280.method3299(arg3);
                field740.method1873(var97);
            }
        }
        if (arg2 == 14) {
            class61 var98 = field807[arg3];
            if (var98 != null) {
                field744 = arg6;
                field840 = arg7;
                field697 = 2;
                field844 = 0;
                field821 = arg0;
                field822 = arg1;
                class173 var99 = class173.method2882(class170.field2224, field740.field1251);
                var99.field2280.method3364(Statics.field2297);
                var99.field2280.method3296(Statics.field555);
                var99.field2280.method3299(arg3);
                var99.field2280.method3299(Statics.field221);
                var99.field2280.method3246(class40.field341[82] ? 1 : 0);
                field740.method1873(var99);
            }
        }
        if (arg2 == 23) {
            if (field847) {
                Statics.field524.method2726();
            } else {
                Statics.field524.method2725(Statics.field2416, arg0, arg1, true);
            }
        }
        if (arg2 == 22) {
            field744 = arg6;
            field840 = arg7;
            field697 = 2;
            field844 = 0;
            field821 = arg0;
            field822 = arg1;
            class173 var100 = class173.method2882(class170.field2196, field740.field1251);
            var100.field2280.method3419(Statics.field1052 + arg1);
            var100.field2280.method3299(arg3);
            var100.field2280.method3288(class40.field341[82] ? 1 : 0);
            var100.field2280.method3299(Statics.field2316 + arg0);
            field740.method1873(var100);
        }
        if (arg2 == 33) {
            class173 var101 = class173.method2882(class170.field2188, field740.field1251);
            var101.field2280.method3299(arg3);
            var101.field2280.method3296(arg0);
            var101.field2280.method3335(arg1);
            field740.method1873(var101);
            field699 = 0;
            Statics.field1922 = class231.method1097(arg1);
            field700 = arg0;
        }
        if (arg2 != 25) {
            if (arg2 == 1002) {
                field744 = arg6;
                field840 = arg7;
                field697 = 2;
                field844 = 0;
                class173 var109 = class173.method2882(class170.field2242, field740.field1251);
                var109.field2280.method3299(arg3);
                field740.method1873(var109);
            }
            if (field772 != 0) {
                field772 = 0;
                method3242(class231.method1097(Statics.field2297));
            }
            if (field814) {
                method434();
            }
            if (Statics.field1922 != null && field699 == 0) {
                method3242(Statics.field1922);
            }
            return;
        }
        class231 var102 = class231.method282(arg1, arg0);
        if (var102 == null) {
            return;
        }
        method434();
        int var103 = method2080(var102);
        int var104 = var103 >> 11 & 0x3F;
        int var106 = var102.field2755;
        class231 var107 = class231.method282(arg1, arg0);
        if (var107 != null && var107.field2716 != null) {
            class57 var108 = new class57();
            var108.field512 = var107;
            var108.field526 = var107.field2716;
            class70.method1612(var108);
        }
        field750 = var106;
        field814 = true;
        Statics.field1912 = arg1;
        field749 = arg0;
        Statics.field374 = var104;
        method3242(var107);
        field772 = 0;
        field751 = method112(var102);
        if (field751 == null) {
            field751 = "Null";
        }
        if (var102.field2623) {
            field752 = var102.field2698 + class75.method969(16777215);
        } else {
            field752 = class75.method969(65280) + var102.field2711 + class75.method969(16777215);
        }
    }

    @ObfuscatedName("r.im(B)V")
    public static void method434() {
        if (!field814) {
            return;
        }
        class231 var0 = class231.method282(Statics.field1912, field749);
        if (var0 != null && var0.field2717 != null) {
            class57 var1 = new class57();
            var1.field512 = var0;
            var1.field526 = var0.field2717;
            class70.method1612(var1);
        }
        field814 = false;
        method3242(var0);
    }

    @ObfuscatedName("dv.ia(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method2603(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method2117(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("cv.id(Ljava/lang/String;Ljava/lang/String;IIIIZB)V")
    public static final void method2117(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field847 || field658 >= 500) {
            return;
        }
        field735[field658] = arg0;
        field736[field658] = arg1;
        field703[field658] = arg2;
        field620[field658] = arg3;
        field731[field658] = arg4;
        field738[field658] = arg5;
        field729[field658] = arg6;
        field658++;
    }

    @ObfuscatedName("w.ig(I)V")
    public static void method10() {
        for (int var0 = 0; var0 < field658; var0++) {
            int var1 = field703[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field658 - 1) {
                    for (int var3 = var0; var3 < field658 - 1; var3++) {
                        field735[var3] = field735[var3 + 1];
                        field736[var3] = field736[var3 + 1];
                        field703[var3] = field703[var3 + 1];
                        field620[var3] = field620[var3 + 1];
                        field731[var3] = field731[var3 + 1];
                        field738[var3] = field738[var3 + 1];
                        field729[var3] = field729[var3 + 1];
                    }
                }
                var0--;
                field658--;
            }
        }
        method441(Statics.field1898 / 2 + Statics.field304, Statics.field559);
    }

    @ObfuscatedName("ii.io(IB)Ljava/lang/String;")
    public static String method4225(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (field736[arg0].length() > 0) {
            return field735[arg0] + class238.field2975 + field736[arg0];
        } else {
            return field735[arg0];
        }
    }

    @ObfuscatedName("ip.ib(IIIII)V")
    public static final void method4235(int arg0, int arg1, int arg2, int arg3) {
        if (field772 == 0 && !field814) {
            method2603(class238.field2970, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        long var4 = -1L;
        long var6 = -1L;
        int var8 = 0;
        while (true) {
            int var10 = class121.field1687;
            if (var8 >= var10) {
                if (var4 != -1L) {
                    int var11 = (int) (var4 >>> 0 & 0x7FL);
                    int var13 = class121.method60(var4);
                    class61 var14 = field807[field720];
                    method1801(var14, field720, var11, var13);
                }
                return;
            }
            long var15 = class121.method2309(var8);
            if (var6 != var15) {
                label277: {
                    var6 = var15;
                    long var17 = class121.field1689[var8];
                    int var19 = (int) (var17 >>> 0 & 0x7FL);
                    int var21 = var19;
                    int var22 = class121.method3227(var8);
                    int var23 = class121.method1031(var8);
                    int var24 = class121.method94(class121.field1689[var8]);
                    int var25 = var24;
                    if (var23 == 2 && Statics.field524.method2718(Statics.field2416, var19, var22, var15) >= 0) {
                        class269 var26 = class269.method675(var24);
                        if (var26.field3431 != null) {
                            var26 = var26.method4689();
                        }
                        if (var26 == null) {
                            break label277;
                        }
                        if (field772 == 1) {
                            method2603(class238.field2965, field760 + " " + class75.field1077 + " " + class75.method969(65535) + var26.field3417, 1, var24, var19, var22);
                        } else if (!field814) {
                            String[] var27 = var26.field3391;
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
                                        method2603(var27[var28], class75.method969(65535) + var26.field3417, var29, var25, var21, var22);
                                    }
                                }
                            }
                            method2603(class238.field2966, class75.method969(65535) + var26.field3417, 1002, var26.field3397, var21, var22);
                        } else if ((Statics.field374 & 0x4) == 4) {
                            method2603(field751, field752 + " " + class75.field1077 + " " + class75.method969(65535) + var26.field3417, 2, var24, var19, var22);
                        }
                    }
                    if (var23 == 1) {
                        class73 var30 = field808[var25];
                        if (var30 == null) {
                            break label277;
                        }
                        if (var30.field1059.field3520 == 1 && (var30.field901 & 0x7F) == 64 && (var30.field919 & 0x7F) == 64) {
                            for (int var31 = 0; var31 < field636; var31++) {
                                class73 var32 = field808[field637[var31]];
                                if (var32 != null && var30 != var32 && var32.field1059.field3520 == 1 && var30.field901 == var32.field901 && var30.field919 == var32.field919) {
                                    method3523(var32.field1059, field637[var31], var21, var22);
                                }
                            }
                            int var33 = class82.field1181;
                            int[] var34 = class82.field1182;
                            for (int var35 = 0; var35 < var33; var35++) {
                                class61 var36 = field807[var34[var35]];
                                if (var36 != null && var30.field901 == var36.field901 && var30.field919 == var36.field919) {
                                    method1801(var36, var34[var35], var21, var22);
                                }
                            }
                        }
                        method3523(var30.field1059, var25, var21, var22);
                    }
                    if (var23 == 0) {
                        class61 var37 = field807[var25];
                        if (var37 == null) {
                            break label277;
                        }
                        if ((var37.field901 & 0x7F) == 64 && (var37.field919 & 0x7F) == 64) {
                            for (int var38 = 0; var38 < field636; var38++) {
                                class73 var39 = field808[field637[var38]];
                                if (var39 != null && var39.field1059.field3520 == 1 && var37.field901 == var39.field901 && var37.field919 == var39.field919) {
                                    method3523(var39.field1059, field637[var38], var21, var22);
                                }
                            }
                            int var40 = class82.field1181;
                            int[] var41 = class82.field1182;
                            for (int var42 = 0; var42 < var40; var42++) {
                                class61 var43 = field807[var41[var42]];
                                if (var43 != null && var37 != var43 && var37.field901 == var43.field901 && var37.field919 == var43.field919) {
                                    method1801(var43, var41[var42], var21, var22);
                                }
                            }
                        }
                        if (field720 == var25) {
                            var4 = var15;
                        } else {
                            method1801(var37, var25, var21, var22);
                        }
                    }
                    if (var23 == 3) {
                        class206 var44 = field721[Statics.field2416][var21][var22];
                        if (var44 != null) {
                            for (class81 var45 = (class81) var44.method3796(); var45 != null; var45 = (class81) var44.method3798()) {
                                class270 var46 = class270.method2571(var45.field1175);
                                if (field772 == 1) {
                                    method2603(class238.field2965, field760 + " " + class75.field1077 + " " + class75.method969(16748608) + var46.field3450, 16, var45.field1175, var21, var22);
                                } else if (!field814) {
                                    String[] var47 = var46.field3464;
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
                                            method2603(var47[var48], class75.method969(16748608) + var46.field3450, var49, var45.field1175, var21, var22);
                                        } else if (var48 == 2) {
                                            method2603(class238.field2814, class75.method969(16748608) + var46.field3450, 20, var45.field1175, var21, var22);
                                        }
                                    }
                                    method2603(class238.field2966, class75.method969(16748608) + var46.field3450, 1004, var45.field1175, var21, var22);
                                } else if ((Statics.field374 & 0x1) == 1) {
                                    method2603(field751, field752 + " " + class75.field1077 + " " + class75.method969(16748608) + var46.field3450, 17, var45.field1175, var21, var22);
                                }
                            }
                        }
                    }
                }
            }
            var8++;
        }
    }

    @ObfuscatedName("gb.ik(Ljj;IIII)V")
    public static final void method3523(class272 arg0, int arg1, int arg2, int arg3) {
        if (field658 >= 400) {
            return;
        }
        if (arg0.field3530 != null) {
            arg0 = arg0.method4797();
        }
        if (arg0 == null || !arg0.field3536 || arg0.field3535 && field761 != arg1) {
            return;
        }
        String var4 = arg0.field3505;
        if (arg0.field3522 != 0) {
            var4 = var4 + method530(arg0.field3522, Statics.field1949.field567) + " " + class75.field1072 + class238.field2971 + arg0.field3522 + class75.field1073;
        }
        if (arg0.field3535 && field754) {
            method2603(class238.field2966, class75.method969(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field772 == 1) {
            method2603(class238.field2965, field760 + " " + class75.field1077 + " " + class75.method969(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field814) {
            int var5 = arg0.field3535 && field754 ? 2000 : 0;
            String[] var6 = arg0.field3507;
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].equalsIgnoreCase(class238.field2872)) {
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
                        method2603(var6[var7], class75.method969(16776960) + var4, var8, arg1, arg2, arg3);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].equalsIgnoreCase(class238.field2872)) {
                        short var10 = 0;
                        if (field622 != class78.field1095) {
                            if (field622 == class78.field1098 || field622 == class78.field1099 && arg0.field3522 > Statics.field1949.field567) {
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
                            method2603(var6[var9], class75.method969(16776960) + var4, var11, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3535 || !field754) {
                method2603(class238.field2966, class75.method969(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field374 & 0x2) == 2) {
            method2603(field751, field752 + " " + class75.field1077 + " " + class75.method969(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("cw.ip(Lbu;IIIB)V")
    public static final void method1801(class61 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field1949 == arg0 || field658 >= 400) {
            return;
        }
        String var4;
        if (arg0.field577 == 0) {
            var4 = arg0.field566[0] + arg0.field588 + arg0.field566[1] + method530(arg0.field567, Statics.field1949.field567) + " " + class75.field1072 + class238.field2971 + arg0.field567 + class75.field1073 + arg0.field566[2];
        } else {
            var4 = arg0.field566[0] + arg0.field588 + arg0.field566[1] + " " + class75.field1072 + class238.field3036 + arg0.field577 + class75.field1073 + arg0.field566[2];
        }
        if (field772 == 1) {
            method2603(class238.field2965, field760 + " " + class75.field1077 + " " + class75.method969(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field814) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field651[var5] != null) {
                    short var6 = 0;
                    if (field651[var5].equalsIgnoreCase(class238.field2872)) {
                        if (field621 == class78.field1095) {
                            continue;
                        }
                        if (field621 == class78.field1098 || field621 == class78.field1099 && arg0.field567 > Statics.field1949.field567) {
                            var6 = 2000;
                        }
                        if (Statics.field1949.field570 != 0 && arg0.field570 != 0) {
                            if (Statics.field1949.field570 == arg0.field570) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field851[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field834[var5] + var6;
                    method2603(field651[var5], class75.method969(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field374 & 0x8) == 8) {
            method2603(field751, field752 + " " + class75.field1077 + " " + class75.method969(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field658; var9++) {
            if (field703[var9] == 23) {
                field736[var9] = class75.method969(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("as.ix(III)Ljava/lang/String;")
    public static final String method530(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class75.method969(16711680);
        } else if (var2 < -6) {
            return class75.method969(16723968);
        } else if (var2 < -3) {
            return class75.method969(16740352);
        } else if (var2 < 0) {
            return class75.method969(16756736);
        } else if (var2 > 9) {
            return class75.method969(65280);
        } else if (var2 > 6) {
            return class75.method969(4259584);
        } else if (var2 > 3) {
            return class75.method969(8453888);
        } else if (var2 > 0) {
            return class75.method969(12648192);
        } else {
            return class75.method969(16776960);
        }
    }

    @ObfuscatedName("ho.iu(IIIIIIIII)V")
    public static final void method4009(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class231.method694(arg0)) {
            Statics.field227 = null;
            method149(Statics.field2616[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field227 != null) {
                method149(Statics.field227, -1412584499, arg1, arg2, arg3, arg4, Statics.field2379, Statics.field269, arg7);
                Statics.field227 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field796[var8] = true;
            }
        } else {
            field796[arg7] = true;
        }
    }

    @ObfuscatedName("g.il([Lhl;IIIIIIIII)V")
    public static final void method149(class231[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class315.method5328(arg2, arg3, arg4, arg5);
        class123.method2637();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class231 var10 = arg0[var9];
            if (var10 != null && (var10.field2643 == arg1 || arg1 == -1412584499 && field764 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field799[field794] = var10.field2637 + arg6;
                    field800[field794] = var10.field2638 + arg7;
                    field801[field794] = var10.field2628;
                    field605[field794] = var10.field2640;
                    var11 = ++field794 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2756 = var11;
                var10.field2757 = field680;
                if (var10.field2623) {
                    boolean var12 = var10.field2644;
                    if (var12) {
                        continue;
                    }
                }
                if (var10.field2712 > 0) {
                    int var13 = var10.field2712;
                    if (var13 == 324) {
                        if (field784 == -1) {
                            field784 = var10.field2659;
                            field855 = var10.field2617;
                        }
                        if (field854.field2596) {
                            var10.field2659 = field784;
                        } else {
                            var10.field2659 = field855;
                        }
                    } else if (var13 == 325) {
                        if (field784 == -1) {
                            field784 = var10.field2659;
                            field855 = var10.field2617;
                        }
                        if (field854.field2596) {
                            var10.field2659 = field855;
                        } else {
                            var10.field2659 = field784;
                        }
                    } else if (var13 == 327) {
                        var10.field2676 = 150;
                        var10.field2708 = (int) (Math.sin((double) field680 / 40.0D) * 256.0D) & 0x7FF;
                        var10.field2667 = 5;
                        var10.field2758 = 0;
                    } else if (var13 == 328) {
                        var10.field2676 = 150;
                        var10.field2708 = (int) (Math.sin((double) field680 / 40.0D) * 256.0D) & 0x7FF;
                        var10.field2667 = 5;
                        var10.field2758 = 1;
                    }
                }
                int var14 = var10.field2637 + arg6;
                int var15 = var10.field2638 + arg7;
                int var16 = var10.field2639;
                if (field764 == var10) {
                    if (arg1 != -1412584499 && !var10.field2703) {
                        Statics.field227 = arg0;
                        Statics.field2379 = arg6;
                        Statics.field269 = arg7;
                        continue;
                    }
                    if (field775 && field595) {
                        int var17 = class49.field426;
                        int var18 = class49.field418;
                        int var19 = var17 - field686;
                        int var20 = var18 - field767;
                        if (var19 < field770) {
                            var19 = field770;
                        }
                        if (var10.field2628 + var19 > field770 + field640.field2628) {
                            var19 = field770 + field640.field2628 - var10.field2628;
                        }
                        if (var20 < field771) {
                            var20 = field771;
                        }
                        if (var10.field2640 + var20 > field771 + field640.field2640) {
                            var20 = field771 + field640.field2640 - var10.field2640;
                        }
                        var14 = var19;
                        var15 = var20;
                    }
                    if (!var10.field2703) {
                        var16 = 128;
                    }
                }
                int var21;
                int var22;
                int var23;
                int var24;
                if (var10.field2626 == 2) {
                    var21 = arg2;
                    var22 = arg3;
                    var23 = arg4;
                    var24 = arg5;
                } else if (var10.field2626 == 9) {
                    int var25 = var14;
                    int var26 = var15;
                    int var27 = var10.field2628 + var14;
                    int var28 = var10.field2640 + var15;
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
                    int var31 = var10.field2628 + var14;
                    int var32 = var10.field2640 + var15;
                    var21 = var14 > arg2 ? var14 : arg2;
                    var22 = var15 > arg3 ? var15 : arg3;
                    var23 = var31 < arg4 ? var31 : arg4;
                    var24 = var32 < arg5 ? var32 : arg5;
                }
                if (!var10.field2623 || var21 < var23 && var22 < var24) {
                    if (var10.field2712 != 0) {
                        if (var10.field2712 == 1336) {
                            if (field611) {
                                var15 += 15;
                                Statics.field525.method5116("Fps:" + field389, var10.field2628 + var14, var15, 16776960, -1);
                                var15 += 15;
                                Runtime var33 = Runtime.getRuntime();
                                int var34 = (int) ((var33.totalMemory() - var33.freeMemory()) / 1024L);
                                int var35 = 16776960;
                                if (var34 > 327680 && !field709) {
                                    var35 = 16711680;
                                }
                                Statics.field525.method5116("Mem:" + var34 + "k", var10.field2628 + var14, var15, var35, -1);
                                var15 += 15;
                            }
                            continue;
                        }
                        if (var10.field2712 == 1337) {
                            field742 = var14;
                            field668 = var15;
                            method614(var14, var15, var10.field2628, var10.field2640);
                            field796[var10.field2756] = true;
                            class315.method5328(arg2, arg3, arg4, arg5);
                            continue;
                        }
                        if (var10.field2712 == 1338) {
                            method4564();
                            class225 var36 = var10.method4193(false);
                            if (var36 != null) {
                                class315.method5328(var14, var15, var36.field2571 + var14, var36.field2576 + var15);
                                if (field823 == 2 || field823 == 5) {
                                    class315.method5351(var14, var15, 0, var36.field2574, var36.field2573);
                                } else {
                                    int var37 = field663 & 0x7FF;
                                    int var38 = Statics.field1949.field901 / 32 + 48;
                                    int var39 = 464 - Statics.field1949.field919 / 32;
                                    Statics.field3634.method5505(var14, var15, var36.field2571, var36.field2576, var38, var39, var37, 256, var36.field2574, var36.field2573);
                                    for (int var40 = 0; var40 < field652; var40++) {
                                        int var41 = field818[var40] * 4 + 2 - Statics.field1949.field901 / 32;
                                        int var42 = field819[var40] * 4 + 2 - Statics.field1949.field919 / 32;
                                        method4425(var14, var15, var41, var42, field820[var40], var36);
                                    }
                                    int var43 = 0;
                                    while (true) {
                                        if (var43 >= 104) {
                                            for (int var48 = 0; var48 < field636; var48++) {
                                                class73 var49 = field808[field637[var48]];
                                                if (var49 != null && var49.method1052()) {
                                                    class272 var50 = var49.field1059;
                                                    if (var50 != null && var50.field3530 != null) {
                                                        var50 = var50.method4797();
                                                    }
                                                    if (var50 != null && var50.field3521 && var50.field3536) {
                                                        int var51 = var49.field901 / 32 - Statics.field1949.field901 / 32;
                                                        int var52 = var49.field919 / 32 - Statics.field1949.field919 / 32;
                                                        method4425(var14, var15, var51, var52, Statics.field1191[1], var36);
                                                    }
                                                }
                                            }
                                            int var53 = class82.field1181;
                                            int[] var54 = class82.field1182;
                                            for (int var55 = 0; var55 < var53; var55++) {
                                                class61 var56 = field807[var54[var55]];
                                                if (var56 != null && var56.method1052() && !var56.field568 && Statics.field1949 != var56) {
                                                    int var57 = var56.field901 / 32 - Statics.field1949.field901 / 32;
                                                    int var58 = var56.field919 / 32 - Statics.field1949.field919 / 32;
                                                    boolean var59 = false;
                                                    if (Statics.field1949.field570 != 0 && var56.field570 != 0 && Statics.field1949.field570 == var56.field570) {
                                                        var59 = true;
                                                    }
                                                    if (var56.method1042()) {
                                                        method4425(var14, var15, var57, var58, Statics.field1191[3], var36);
                                                    } else if (var59) {
                                                        method4425(var14, var15, var57, var58, Statics.field1191[4], var36);
                                                    } else if (var56.method1045()) {
                                                        method4425(var14, var15, var57, var58, Statics.field1191[5], var36);
                                                    } else {
                                                        method4425(var14, var15, var57, var58, Statics.field1191[2], var36);
                                                    }
                                                }
                                            }
                                            if (field859 != 0 && field680 % 20 < 10) {
                                                if (field859 == 1 && field614 >= 0 && field614 < field808.length) {
                                                    class73 var60 = field808[field614];
                                                    if (var60 != null) {
                                                        int var61 = var60.field901 / 32 - Statics.field1949.field901 / 32;
                                                        int var62 = var60.field919 / 32 - Statics.field1949.field919 / 32;
                                                        method460(var14, var15, var61, var62, Statics.field2489[1], var36);
                                                    }
                                                }
                                                if (field859 == 2) {
                                                    int var63 = field613 * 4 - Statics.field2316 * 4 + 2 - Statics.field1949.field901 / 32;
                                                    int var64 = field617 * 4 - Statics.field1052 * 4 + 2 - Statics.field1949.field919 / 32;
                                                    method460(var14, var15, var63, var64, Statics.field2489[1], var36);
                                                }
                                                if (field859 == 10 && field615 >= 0 && field615 < field807.length) {
                                                    class61 var65 = field807[field615];
                                                    if (var65 != null) {
                                                        int var66 = var65.field901 / 32 - Statics.field1949.field901 / 32;
                                                        int var67 = var65.field919 / 32 - Statics.field1949.field919 / 32;
                                                        method460(var14, var15, var66, var67, Statics.field2489[1], var36);
                                                    }
                                                }
                                            }
                                            if (field821 != 0) {
                                                int var68 = field821 * 4 + 2 - Statics.field1949.field901 / 32;
                                                int var69 = field822 * 4 + 2 - Statics.field1949.field919 / 32;
                                                method4425(var14, var15, var68, var69, Statics.field2489[0], var36);
                                            }
                                            if (!Statics.field1949.field568) {
                                                class315.method5400(var36.field2571 / 2 + var14 - 1, var36.field2576 / 2 + var15 - 1, 3, 3, 16777215);
                                            }
                                            break;
                                        }
                                        for (int var44 = 0; var44 < 104; var44++) {
                                            class206 var45 = field721[Statics.field2416][var43][var44];
                                            if (var45 != null) {
                                                int var46 = var43 * 4 + 2 - Statics.field1949.field901 / 32;
                                                int var47 = var44 * 4 + 2 - Statics.field1949.field919 / 32;
                                                method4425(var14, var15, var46, var47, Statics.field1191[0], var36);
                                            }
                                        }
                                        var43++;
                                    }
                                }
                                field797[var11] = true;
                            }
                            class315.method5328(arg2, arg3, arg4, arg5);
                            continue;
                        }
                        if (var10.field2712 == 1339) {
                            method58(var10, var14, var15, var11);
                            class315.method5328(arg2, arg3, arg4, arg5);
                            continue;
                        }
                        if (var10.field2712 == 1400) {
                            Statics.field988.method5623(var14, var15, var10.field2628, var10.field2640, field680);
                        }
                        if (var10.field2712 == 1401) {
                            Statics.field988.method5691(var14, var15, var10.field2628, var10.field2640);
                        }
                    }
                    if (var10.field2626 == 0) {
                        if (!var10.field2623) {
                            boolean var70 = var10.field2644;
                            if (var70 && Statics.field330 != var10) {
                                continue;
                            }
                        }
                        if (!var10.field2623) {
                            if (var10.field2612 > var10.field2648 - var10.field2640) {
                                var10.field2612 = var10.field2648 - var10.field2640;
                            }
                            if (var10.field2612 < 0) {
                                var10.field2612 = 0;
                            }
                        }
                        method149(arg0, var10.field2624, var21, var22, var23, var24, var14 - var10.field2645, var15 - var10.field2612, var11);
                        if (var10.field2627 != null) {
                            method149(var10.field2627, var10.field2624, var21, var22, var23, var24, var14 - var10.field2645, var15 - var10.field2612, var11);
                        }
                        class56 var71 = (class56) field827.method3748((long) var10.field2624);
                        if (var71 != null) {
                            method4009(var71.field507, var21, var22, var23, var24, var14, var15, var11);
                        }
                        class315.method5328(arg2, arg3, arg4, arg5);
                        class123.method2637();
                    }
                    if (field676 || field798[var11] || field803 > 1) {
                        if (var10.field2626 == 0 && !var10.field2623 && var10.field2648 > var10.field2640) {
                            int var72 = var10.field2628 + var14;
                            int var73 = var10.field2612;
                            int var74 = var10.field2640;
                            int var75 = var10.field2648;
                            Statics.field1050[0].method5430(var72, var15);
                            Statics.field1050[1].method5430(var72, var15 + var74 - 16);
                            class315.method5400(var72, var15 + 16, 16, var74 - 32, field656);
                            int var76 = (var74 - 32) * var74 / var75;
                            if (var76 < 8) {
                                var76 = 8;
                            }
                            int var77 = (var74 - 32 - var76) * var73 / (var75 - var74);
                            class315.method5400(var72, var15 + 16 + var77, 16, var76, field657);
                            class315.method5407(var72, var15 + 16 + var77, var76, field659);
                            class315.method5407(var72 + 1, var15 + 16 + var77, var76, field659);
                            class315.method5345(var72, var15 + 16 + var77, 16, field659);
                            class315.method5345(var72, var15 + 17 + var77, 16, field659);
                            class315.method5407(var72 + 15, var15 + 16 + var77, var76, field732);
                            class315.method5407(var72 + 14, var15 + 17 + var77, var76 - 1, field732);
                            class315.method5345(var72, var15 + 15 + var77 + var76, 16, field732);
                            class315.method5345(var72 + 1, var15 + 14 + var77 + var76, 15, field732);
                        }
                        if (var10.field2626 != 1) {
                            if (var10.field2626 == 2) {
                                int var78 = 0;
                                for (int var79 = 0; var79 < var10.field2636; var79++) {
                                    for (int var80 = 0; var80 < var10.field2635; var80++) {
                                        int var81 = (var10.field2691 + 32) * var80 + var14;
                                        int var82 = (var10.field2692 + 32) * var79 + var15;
                                        if (var78 < 20) {
                                            var81 += var10.field2693[var78];
                                            var82 += var10.field2694[var78];
                                        }
                                        if (var10.field2759[var78] > 0) {
                                            boolean var83 = false;
                                            boolean var84 = false;
                                            int var85 = var10.field2759[var78] - 1;
                                            if (var81 + 32 > arg2 && var81 < arg4 && var82 + 32 > arg3 && var82 < arg5 || Statics.field443 == var10 && field598 == var78) {
                                                class319 var86;
                                                if (field772 == 1 && Statics.field555 == var78 && Statics.field2297 == var10.field2624) {
                                                    var86 = class270.method3161(var85, var10.field2744[var78], 2, 0, 2, false);
                                                } else {
                                                    var86 = class270.method3161(var85, var10.field2744[var78], 1, 3153952, 2, false);
                                                }
                                                if (var86 == null) {
                                                    method3242(var10);
                                                } else if (Statics.field443 == var10 && field598 == var78) {
                                                    int var87 = class49.field426 - field702;
                                                    int var88 = class49.field418 - field641;
                                                    if (var87 < 5 && var87 > -5) {
                                                        var87 = 0;
                                                    }
                                                    if (var88 < 5 && var88 > -5) {
                                                        var88 = 0;
                                                    }
                                                    if (field706 < 5) {
                                                        var87 = 0;
                                                        var88 = 0;
                                                    }
                                                    var86.method5458(var81 + var87, var82 + var88, 128);
                                                    if (arg1 != -1) {
                                                        class231 var89 = arg0[arg1 & 0xFFFF];
                                                        if (var82 + var88 < class315.field3770 && var89.field2612 > 0) {
                                                            int var90 = field655 * (class315.field3770 - var82 - var88) / 3;
                                                            if (var90 > field655 * 10) {
                                                                var90 = field655 * 10;
                                                            }
                                                            if (var90 > var89.field2612) {
                                                                var90 = var89.field2612;
                                                            }
                                                            var89.field2612 -= var90;
                                                            field641 += var90;
                                                            method3242(var89);
                                                        }
                                                        if (var82 + var88 + 32 > class315.field3769 && var89.field2612 < var89.field2648 - var89.field2640) {
                                                            int var91 = field655 * (var82 + var88 + 32 - class315.field3769) / 3;
                                                            if (var91 > field655 * 10) {
                                                                var91 = field655 * 10;
                                                            }
                                                            if (var91 > var89.field2648 - var89.field2640 - var89.field2612) {
                                                                var91 = var89.field2648 - var89.field2640 - var89.field2612;
                                                            }
                                                            var89.field2612 += var91;
                                                            field641 -= var91;
                                                            method3242(var89);
                                                        }
                                                    }
                                                } else if (Statics.field1922 == var10 && field700 == var78) {
                                                    var86.method5458(var81, var82, 128);
                                                } else {
                                                    var86.method5448(var81, var82);
                                                }
                                            }
                                        } else if (var10.field2751 != null && var78 < 20) {
                                            class319 var92 = var10.method4160(var78);
                                            if (var92 != null) {
                                                var92.method5448(var81, var82);
                                            } else if (class231.field2622) {
                                                method3242(var10);
                                            }
                                        }
                                        var78++;
                                    }
                                }
                            } else if (var10.field2626 == 3) {
                                int var93;
                                if (method97(var10)) {
                                    var93 = var10.field2641;
                                    if (Statics.field330 == var10 && var10.field2652 != 0) {
                                        var93 = var10.field2652;
                                    }
                                } else {
                                    var93 = var10.field2649;
                                    if (Statics.field330 == var10 && var10.field2651 != 0) {
                                        var93 = var10.field2651;
                                    }
                                }
                                if (var10.field2653) {
                                    switch(var10.field2701.field3777) {
                                        case 1:
                                            class315.method5337(var14, var15, var10.field2628, var10.field2640, var10.field2649, var10.field2641, 256 - (var10.field2639 & 0xFF), 256 - (var10.field2650 & 0xFF));
                                            break;
                                        case 2:
                                            class315.method5338(var14, var15, var10.field2628, var10.field2640, var10.field2649, var10.field2641, 256 - (var10.field2639 & 0xFF), 256 - (var10.field2650 & 0xFF));
                                            break;
                                        case 3:
                                            class315.method5339(var14, var15, var10.field2628, var10.field2640, var10.field2649, var10.field2641, 256 - (var10.field2639 & 0xFF), 256 - (var10.field2650 & 0xFF));
                                            break;
                                        case 4:
                                            class315.method5403(var14, var15, var10.field2628, var10.field2640, var10.field2649, var10.field2641, 256 - (var10.field2639 & 0xFF), 256 - (var10.field2650 & 0xFF));
                                            break;
                                        default:
                                            if (var16 == 0) {
                                                class315.method5400(var14, var15, var10.field2628, var10.field2640, var93);
                                            } else {
                                                class315.method5399(var14, var15, var10.field2628, var10.field2640, var93, 256 - (var16 & 0xFF));
                                            }
                                    }
                                } else if (var16 == 0) {
                                    class315.method5343(var14, var15, var10.field2628, var10.field2640, var93);
                                } else {
                                    class315.method5344(var14, var15, var10.field2628, var10.field2640, var93, 256 - (var16 & 0xFF));
                                }
                            } else if (var10.field2626 == 4) {
                                class299 var94 = var10.method4159();
                                if (var94 != null) {
                                    String var95 = var10.field2685;
                                    int var96;
                                    if (method97(var10)) {
                                        var96 = var10.field2641;
                                        if (Statics.field330 == var10 && var10.field2652 != 0) {
                                            var96 = var10.field2652;
                                        }
                                        if (var10.field2686.length() > 0) {
                                            var95 = var10.field2686;
                                        }
                                    } else {
                                        var96 = var10.field2649;
                                        if (Statics.field330 == var10 && var10.field2651 != 0) {
                                            var96 = var10.field2651;
                                        }
                                    }
                                    if (var10.field2623 && var10.field2755 != -1) {
                                        class270 var97 = class270.method2571(var10.field2755);
                                        var95 = var97.field3450;
                                        if (var95 == null) {
                                            var95 = class238.field2821;
                                        }
                                        if ((var97.field3483 == 1 || var10.field2678 != 1) && var10.field2678 != -1) {
                                            var95 = class75.method969(16748608) + var95 + class75.field1076 + " " + 'x' + method925(var10.field2678);
                                        }
                                    }
                                    if (field757 == var10) {
                                        var95 = class238.field2973;
                                        var96 = var10.field2649;
                                    }
                                    if (!var10.field2623) {
                                        var95 = method4245(var95, var10);
                                    }
                                    var94.method5162(var95, var14, var15, var10.field2628, var10.field2640, var96, var10.field2690 ? 0 : -1, var10.field2748, var10.field2689, var10.field2687);
                                } else if (class231.field2622) {
                                    method3242(var10);
                                }
                            } else if (var10.field2626 == 5) {
                                if (var10.field2623) {
                                    class319 var99;
                                    if (var10.field2755 == -1) {
                                        var99 = var10.method4194(false);
                                    } else {
                                        var99 = class270.method3161(var10.field2755, var10.field2678, var10.field2663, var10.field2743, var10.field2646, false);
                                    }
                                    if (var99 != null) {
                                        int var100 = var99.field3797;
                                        int var101 = var99.field3793;
                                        if (var10.field2730) {
                                            class315.method5395(var14, var15, var10.field2628 + var14, var10.field2640 + var15);
                                            int var102 = (var10.field2628 + (var100 - 1)) / var100;
                                            int var103 = (var10.field2640 + (var101 - 1)) / var101;
                                            for (int var104 = 0; var104 < var102; var104++) {
                                                for (int var105 = 0; var105 < var103; var105++) {
                                                    if (var10.field2661 != 0) {
                                                        var99.method5555(var100 / 2 + var100 * var104 + var14, var101 / 2 + var101 * var105 + var15, var10.field2661, 4096);
                                                    } else if (var16 == 0) {
                                                        var99.method5448(var100 * var104 + var14, var101 * var105 + var15);
                                                    } else {
                                                        var99.method5458(var100 * var104 + var14, var101 * var105 + var15, 256 - (var16 & 0xFF));
                                                    }
                                                }
                                            }
                                            class315.method5328(arg2, arg3, arg4, arg5);
                                        } else {
                                            int var106 = var10.field2628 * 4096 / var100;
                                            if (var10.field2661 != 0) {
                                                var99.method5555(var10.field2628 / 2 + var14, var10.field2640 / 2 + var15, var10.field2661, var106);
                                            } else if (var16 != 0) {
                                                var99.method5460(var14, var15, var10.field2628, var10.field2640, 256 - (var16 & 0xFF));
                                            } else if (var10.field2628 == var100 && var10.field2640 == var101) {
                                                var99.method5448(var14, var15);
                                            } else {
                                                var99.method5454(var14, var15, var10.field2628, var10.field2640);
                                            }
                                        }
                                    } else if (class231.field2622) {
                                        method3242(var10);
                                    }
                                } else {
                                    class319 var98 = var10.method4194(method97(var10));
                                    if (var98 != null) {
                                        var98.method5448(var14, var15);
                                    } else if (class231.field2622) {
                                        method3242(var10);
                                    }
                                }
                            } else if (var10.field2626 == 6) {
                                boolean var107 = method97(var10);
                                int var108;
                                if (var107) {
                                    var108 = var10.field2672;
                                } else {
                                    var108 = var10.field2671;
                                }
                                class120 var109 = null;
                                int var110 = 0;
                                if (var10.field2755 != -1) {
                                    class270 var111 = class270.method2571(var10.field2755);
                                    if (var111 != null) {
                                        class270 var112 = var111.method4718(var10.field2678);
                                        var109 = var112.method4717(1);
                                        if (var109 == null) {
                                            method3242(var10);
                                        } else {
                                            var109.method2512();
                                            var110 = var109.field1806 / 2;
                                        }
                                    }
                                } else if (var10.field2667 == 5) {
                                    if (var10.field2758 == 0) {
                                        var109 = field854.method4138((class274) null, -1, (class274) null, -1);
                                    } else {
                                        var109 = Statics.field1949.method1048();
                                    }
                                } else if (var108 == -1) {
                                    var109 = var10.method4161((class274) null, -1, var107, Statics.field1949.field562);
                                    if (var109 == null && class231.field2622) {
                                        method3242(var10);
                                    }
                                } else {
                                    class274 var113 = class274.method2918(var108);
                                    var109 = var10.method4161(var113, var10.field2747, var107, Statics.field1949.field562);
                                    if (var109 == null && class231.field2622) {
                                        method3242(var10);
                                    }
                                }
                                class123.method2608(var10.field2628 / 2 + var14, var10.field2640 / 2 + var15);
                                int var114 = var10.field2702 * class123.field1703[var10.field2676] >> 16;
                                int var115 = var10.field2702 * class123.field1709[var10.field2676] >> 16;
                                if (var109 != null) {
                                    if (var10.field2623) {
                                        var109.method2512();
                                        if (var10.field2700) {
                                            var109.method2533(0, var10.field2708, var10.field2677, var10.field2676, var10.field2673, var10.field2674 + var110 + var114, var10.field2674 + var115, var10.field2702);
                                        } else {
                                            var109.method2525(0, var10.field2708, var10.field2677, var10.field2676, var10.field2673, var10.field2674 + var110 + var114, var10.field2674 + var115);
                                        }
                                    } else {
                                        var109.method2525(0, var10.field2708, 0, var10.field2676, 0, var114, var115);
                                    }
                                }
                                class123.method2605();
                            } else {
                                if (var10.field2626 == 7) {
                                    class299 var116 = var10.method4159();
                                    if (var116 == null) {
                                        if (class231.field2622) {
                                            method3242(var10);
                                        }
                                        continue;
                                    }
                                    int var117 = 0;
                                    for (int var118 = 0; var118 < var10.field2636; var118++) {
                                        for (int var119 = 0; var119 < var10.field2635; var119++) {
                                            if (var10.field2759[var117] > 0) {
                                                class270 var120 = class270.method2571(var10.field2759[var117] - 1);
                                                String var121;
                                                if (var120.field3483 != 1 && var10.field2744[var117] == 1) {
                                                    var121 = class75.method969(16748608) + var120.field3450 + class75.field1076;
                                                } else {
                                                    var121 = class75.method969(16748608) + var120.field3450 + class75.field1076 + " " + 'x' + method925(var10.field2744[var117]);
                                                }
                                                int var122 = (var10.field2691 + 115) * var119 + var14;
                                                int var123 = (var10.field2692 + 12) * var118 + var15;
                                                if (var10.field2748 == 0) {
                                                    var116.method5114(var121, var122, var123, var10.field2649, var10.field2690 ? 0 : -1);
                                                } else if (var10.field2748 == 1) {
                                                    var116.method5134(var121, var10.field2628 / 2 + var122, var123, var10.field2649, var10.field2690 ? 0 : -1);
                                                } else {
                                                    var116.method5116(var121, var10.field2628 + var122 - 1, var123, var10.field2649, var10.field2690 ? 0 : -1);
                                                }
                                            }
                                            var117++;
                                        }
                                    }
                                }
                                if (var10.field2626 == 8 && Statics.field43 == var10 && field748 == field745) {
                                    int var124 = 0;
                                    int var125 = 0;
                                    class299 var126 = Statics.field525;
                                    String var127 = var10.field2685;
                                    String var128 = method4245(var127, var10);
                                    while (var128.length() > 0) {
                                        int var129 = var128.indexOf(class75.field1074);
                                        String var130;
                                        if (var129 == -1) {
                                            var130 = var128;
                                            var128 = "";
                                        } else {
                                            var130 = var128.substring(0, var129);
                                            var128 = var128.substring(var129 + 4);
                                        }
                                        int var131 = var126.method5109(var130);
                                        if (var131 > var124) {
                                            var124 = var131;
                                        }
                                        var125 += var126.field3714 + 1;
                                    }
                                    var124 += 6;
                                    var125 += 7;
                                    int var132 = var10.field2628 + var14 - 5 - var124;
                                    int var133 = var10.field2640 + var15 + 5;
                                    if (var132 < var14 + 5) {
                                        var132 = var14 + 5;
                                    }
                                    if (var124 + var132 > arg4) {
                                        var132 = arg4 - var124;
                                    }
                                    if (var125 + var133 > arg5) {
                                        var133 = arg5 - var125;
                                    }
                                    class315.method5400(var132, var133, var124, var125, 16777120);
                                    class315.method5343(var132, var133, var124, var125, 0);
                                    String var134 = var10.field2685;
                                    int var135 = var126.field3714 + var133 + 2;
                                    String var136 = method4245(var134, var10);
                                    while (var136.length() > 0) {
                                        int var137 = var136.indexOf(class75.field1074);
                                        String var138;
                                        if (var137 == -1) {
                                            var138 = var136;
                                            var136 = "";
                                        } else {
                                            var138 = var136.substring(0, var137);
                                            var136 = var136.substring(var137 + 4);
                                        }
                                        var126.method5114(var138, var132 + 3, var135, 0, -1);
                                        var135 += var126.field3714 + 1;
                                    }
                                }
                                if (var10.field2626 == 9) {
                                    int var139;
                                    int var140;
                                    int var141;
                                    int var142;
                                    if (var10.field2658) {
                                        var139 = var14;
                                        var140 = var10.field2640 + var15;
                                        var141 = var10.field2628 + var14;
                                        var142 = var15;
                                    } else {
                                        var139 = var14;
                                        var140 = var15;
                                        var141 = var10.field2628 + var14;
                                        var142 = var10.field2640 + var15;
                                    }
                                    if (var10.field2657 == 1) {
                                        class315.method5349(var139, var140, var141, var142, var10.field2649);
                                    } else {
                                        int var145 = var10.field2649;
                                        int var146 = var10.field2657;
                                        int var147 = var141 - var139;
                                        int var148 = var142 - var140;
                                        int var149 = var147 >= 0 ? var147 : -var147;
                                        int var150 = var148 >= 0 ? var148 : -var148;
                                        int var151 = var149;
                                        if (var149 < var150) {
                                            var151 = var150;
                                        }
                                        if (var151 != 0) {
                                            int var152 = (var147 << 16) / var151;
                                            int var153 = (var148 << 16) / var151;
                                            if (var153 <= var152) {
                                                var152 = -var152;
                                            } else {
                                                var153 = -var153;
                                            }
                                            int var154 = var146 * var153 >> 17;
                                            int var155 = var146 * var153 + 1 >> 17;
                                            int var156 = var146 * var152 >> 17;
                                            int var157 = var146 * var152 + 1 >> 17;
                                            int var158 = var139 - class315.field3772;
                                            int var159 = var140 - class315.field3770;
                                            int var160 = var154 + var158;
                                            int var161 = var158 - var155;
                                            int var162 = var147 + var158 - var155;
                                            int var163 = var147 + var158 + var154;
                                            int var164 = var156 + var159;
                                            int var165 = var159 - var157;
                                            int var166 = var148 + var159 - var157;
                                            int var167 = var148 + var159 + var156;
                                            class123.method2613(var160, var161, var162);
                                            class123.method2649(var164, var165, var166, var160, var161, var162, var145);
                                            class123.method2613(var160, var162, var163);
                                            class123.method2649(var164, var166, var167, var160, var162, var163, var145);
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

    @ObfuscatedName("il.iv(Ljava/lang/String;Lhl;I)Ljava/lang/String;")
    public static String method4245(String arg0, class231 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method452(method115(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
        }
        return arg0;
    }

    @ObfuscatedName("ax.ih(II)Ljava/lang/String;")
    public static final String method925(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class75.field1069 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class75.method969(65408) + var1.substring(0, var1.length() - 8) + class238.field3060 + " " + class75.field1072 + var1 + class75.field1073 + class75.field1076;
        } else if (var1.length() > 6) {
            return " " + class75.method969(16777215) + var1.substring(0, var1.length() - 4) + class238.field2978 + " " + class75.field1072 + var1 + class75.field1073 + class75.field1076;
        } else {
            return " " + class75.method969(16776960) + var1 + class75.field1076;
        }
    }

    @ObfuscatedName("client.ic(ZB)V")
    public final void method1114(boolean arg0) {
        method470(field753, Statics.field71, Statics.field327, arg0);
    }

    @ObfuscatedName("client.iq(Lhl;I)V")
    public void method1115(class231 arg0) {
        class231 var2 = arg0.field2643 == -1 ? null : class231.method1097(arg0.field2643);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field71;
            var4 = Statics.field327;
        } else {
            var3 = var2.field2628;
            var4 = var2.field2640;
        }
        method2922(arg0, var3, var4, false);
        method729(arg0, var3, var4);
    }

    @ObfuscatedName("av.ir([Lhl;Lhl;ZI)V")
    public static void method727(class231[] arg0, class231 arg1, boolean arg2) {
        int var3 = arg1.field2675 == 0 ? arg1.field2628 : arg1.field2675;
        int var4 = arg1.field2648 == 0 ? arg1.field2640 : arg1.field2648;
        method101(arg0, arg1.field2624, var3, var4, arg2);
        if (arg1.field2627 != null) {
            method101(arg1.field2627, arg1.field2624, var3, var4, arg2);
        }
        class56 var5 = (class56) field827.method3748((long) arg1.field2624);
        if (var5 != null) {
            method470(var5.field507, var3, var4, arg2);
        }
        if (arg1.field2712 == 1337) {
        }
    }

    @ObfuscatedName("ad.is(IIIZI)V")
    public static final void method470(int arg0, int arg1, int arg2, boolean arg3) {
        if (class231.method694(arg0)) {
            method101(Statics.field2616[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("a.it([Lhl;IIIZB)V")
    public static void method101(class231[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class231 var6 = arg0[var5];
            if (var6 != null && var6.field2643 == arg1) {
                method2922(var6, arg2, arg3, arg4);
                method729(var6, arg2, arg3);
                if (var6.field2645 > var6.field2675 - var6.field2628) {
                    var6.field2645 = var6.field2675 - var6.field2628;
                }
                if (var6.field2645 < 0) {
                    var6.field2645 = 0;
                }
                if (var6.field2612 > var6.field2648 - var6.field2640) {
                    var6.field2612 = var6.field2648 - var6.field2640;
                }
                if (var6.field2612 < 0) {
                    var6.field2612 = 0;
                }
                if (var6.field2626 == 0) {
                    method727(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("ek.iw(Lhl;IIZI)V")
    public static void method2922(class231 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2628;
        int var5 = arg0.field2640;
        if (arg0.field2668 == 0) {
            arg0.field2628 = arg0.field2635;
        } else if (arg0.field2668 == 1) {
            arg0.field2628 = arg1 - arg0.field2635;
        } else if (arg0.field2668 == 2) {
            arg0.field2628 = arg0.field2635 * arg1 >> 14;
        }
        if (arg0.field2632 == 0) {
            arg0.field2640 = arg0.field2636;
        } else if (arg0.field2632 == 1) {
            arg0.field2640 = arg2 - arg0.field2636;
        } else if (arg0.field2632 == 2) {
            arg0.field2640 = arg0.field2636 * arg2 >> 14;
        }
        if (arg0.field2668 == 4) {
            arg0.field2628 = arg0.field2741 * arg0.field2640 / arg0.field2642;
        }
        if (arg0.field2632 == 4) {
            arg0.field2640 = arg0.field2642 * arg0.field2628 / arg0.field2741;
        }
        if (arg0.field2712 == 1337) {
            field777 = arg0;
        }
        if (arg3 && arg0.field2746 != null && (arg0.field2628 != var4 || arg0.field2640 != var5)) {
            class57 var6 = new class57();
            var6.field512 = arg0;
            var6.field526 = arg0.field2746;
            field756.method3810(var6);
        }
    }

    @ObfuscatedName("av.in(Lhl;III)V")
    public static void method729(class231 arg0, int arg1, int arg2) {
        if (arg0.field2629 == 0) {
            arg0.field2637 = arg0.field2633;
        } else if (arg0.field2629 == 1) {
            arg0.field2637 = (arg1 - arg0.field2628) / 2 + arg0.field2633;
        } else if (arg0.field2629 == 2) {
            arg0.field2637 = arg1 - arg0.field2628 - arg0.field2633;
        } else if (arg0.field2629 == 3) {
            arg0.field2637 = arg0.field2633 * arg1 >> 14;
        } else if (arg0.field2629 == 4) {
            arg0.field2637 = (arg0.field2633 * arg1 >> 14) + (arg1 - arg0.field2628) / 2;
        } else {
            arg0.field2637 = arg1 - arg0.field2628 - (arg0.field2633 * arg1 >> 14);
        }
        if (arg0.field2630 == 0) {
            arg0.field2638 = arg0.field2654;
        } else if (arg0.field2630 == 1) {
            arg0.field2638 = (arg2 - arg0.field2640) / 2 + arg0.field2654;
        } else if (arg0.field2630 == 2) {
            arg0.field2638 = arg2 - arg0.field2640 - arg0.field2654;
        } else if (arg0.field2630 == 3) {
            arg0.field2638 = arg0.field2654 * arg2 >> 14;
        } else if (arg0.field2630 == 4) {
            arg0.field2638 = (arg0.field2654 * arg2 >> 14) + (arg2 - arg0.field2640) / 2;
        } else {
            arg0.field2638 = arg2 - arg0.field2640 - (arg0.field2654 * arg2 >> 14);
        }
    }

    @ObfuscatedName("iu.iy(Lhl;IIIIIII)V")
    public static final void method4242(class231 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field660) {
            field737 = 32;
        } else {
            field737 = 0;
        }
        field660 = false;
        if (class49.field425 == 1 || !Statics.field58 && class49.field425 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2612 -= 4;
                method3242(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2612 += 4;
                method3242(arg0);
            } else if (arg5 >= arg1 - field737 && arg5 < field737 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2612 = (arg4 - arg3) * var8 / var9;
                method3242(arg0);
                field660 = true;
            }
        }
        if (field789 == 0) {
            return;
        }
        int var10 = arg0.field2628;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2612 += field789 * 45;
            method3242(arg0);
        }
    }

    @ObfuscatedName("at.ie(IB)Ljava/lang/String;")
    public static final String method452(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("a.iz(Lhl;I)Z")
    public static final boolean method97(class231 arg0) {
        if (arg0.field2738 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2738.length; var1++) {
            int var2 = method115(arg0, var1);
            int var3 = arg0.field2739[var1];
            if (arg0.field2738[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2738[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2738[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("d.ij(Lhl;II)I")
    public static final int method115(class231 arg0, int arg1) {
        if (arg0.field2737 == null || arg1 >= arg0.field2737.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2737[arg1];
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
                    var7 = field725[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field726[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field765[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class231 var11 = class231.method1097(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class270.method2571(var12).field3463 || field629)) {
                        for (int var13 = 0; var13 < var11.field2759.length; var13++) {
                            if (var12 + 1 == var11.field2759[var13]) {
                                var7 += var11.field2744[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class226.field2579[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class235.field2799[field726[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class226.field2579[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field1949.field567;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class235.field2798[var14]) {
                            var7 += field726[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class231 var17 = class231.method1097(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class270.method2571(var18).field3463 || field629)) {
                        for (int var19 = 0; var19 < var17.field2759.length; var19++) {
                            if (var18 + 1 == var17.field2759[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field758;
                }
                if (var6 == 12) {
                    var7 = field759;
                }
                if (var6 == 13) {
                    int var20 = class226.field2579[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class226.method2926(var22);
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
                    var7 = (Statics.field1949.field901 >> 7) + Statics.field2316;
                }
                if (var6 == 19) {
                    var7 = (Statics.field1949.field919 >> 7) + Statics.field1052;
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

    @ObfuscatedName("ar.jk(Lhl;Ljm;IIZI)V")
    public static final void method910(class231 arg0, class270 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field3465;
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
            var7 = class238.field2815;
        }
        if (var6 != -1 && var7 != null) {
            method2117(var7, class75.method969(16748608) + arg1.field3450, var6, arg1.field3485, arg2, arg0.field2624, arg4);
        }
    }

    @ObfuscatedName("ar.jv(Lhl;III)V")
    public static final void method923(class231 arg0, int arg1, int arg2) {
        if (arg0.field2655 == 1) {
            method2603(arg0.field2742, "", 24, 0, 0, arg0.field2624);
        }
        if (arg0.field2655 == 2 && !field814) {
            String var3 = method112(arg0);
            if (var3 != null) {
                method2603(var3, class75.method969(65280) + arg0.field2711, 25, 0, -1, arg0.field2624);
            }
        }
        if (arg0.field2655 == 3) {
            method2603(class238.field2974, "", 26, 0, 0, arg0.field2624);
        }
        if (arg0.field2655 == 4) {
            method2603(arg0.field2742, "", 28, 0, 0, arg0.field2624);
        }
        if (arg0.field2655 == 5) {
            method2603(arg0.field2742, "", 29, 0, 0, arg0.field2624);
        }
        if (arg0.field2655 == 6 && field757 == null) {
            method2603(arg0.field2742, "", 30, 0, -1, arg0.field2624);
        }
        if (arg0.field2626 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2640; var5++) {
                for (int var6 = 0; var6 < arg0.field2628; var6++) {
                    int var7 = (arg0.field2691 + 32) * var6;
                    int var8 = (arg0.field2692 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2693[var4];
                        var8 += arg0.field2694[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field704 = var4;
                        Statics.field3689 = arg0;
                        if (arg0.field2759[var4] > 0) {
                            class270 var9 = class270.method2571(arg0.field2759[var4] - 1);
                            if (field772 == 1 && class232.method2100(method2080(arg0))) {
                                if (Statics.field2297 != arg0.field2624 || Statics.field555 != var4) {
                                    method2603(class238.field2965, field760 + " " + class75.field1077 + " " + class75.method969(16748608) + var9.field3450, 31, var9.field3485, var4, arg0.field2624);
                                }
                            } else if (!field814 || !class232.method2100(method2080(arg0))) {
                                String[] var10 = var9.field3465;
                                int var11 = -1;
                                if (field734 && method198()) {
                                    var11 = var9.method4725();
                                }
                                if (class232.method2100(method2080(arg0))) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != var12) {
                                            method910(arg0, var9, var4, var12, false);
                                        }
                                    }
                                }
                                int var13 = method2080(arg0);
                                boolean var14 = (var13 >> 31 & 0x1) != 0;
                                if (var14) {
                                    method2603(class238.field2965, class75.method969(16748608) + var9.field3450, 38, var9.field3485, var4, arg0.field2624);
                                }
                                class232 var10000 = (class232) null;
                                if (class232.method2100(method2080(arg0))) {
                                    for (int var15 = 2; var15 >= 0; var15--) {
                                        if (var11 != var15) {
                                            method910(arg0, var9, var4, var15, false);
                                        }
                                    }
                                    if (var11 >= 0) {
                                        method910(arg0, var9, var4, var11, true);
                                    }
                                }
                                String[] var16 = arg0.field2696;
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 39;
                                            }
                                            if (var17 == 1) {
                                                var18 = 40;
                                            }
                                            if (var17 == 2) {
                                                var18 = 41;
                                            }
                                            if (var17 == 3) {
                                                var18 = 42;
                                            }
                                            if (var17 == 4) {
                                                var18 = 43;
                                            }
                                            method2603(var16[var17], class75.method969(16748608) + var9.field3450, var18, var9.field3485, var4, arg0.field2624);
                                        }
                                    }
                                }
                                method2603(class238.field2966, class75.method969(16748608) + var9.field3450, 1005, var9.field3485, var4, arg0.field2624);
                            } else if ((Statics.field374 & 0x10) == 16) {
                                method2603(field751, field752 + " " + class75.field1077 + " " + class75.method969(16748608) + var9.field3450, 32, var9.field3485, var4, arg0.field2624);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2623) {
            return;
        }
        if (field814) {
            int var19 = method2080(arg0);
            boolean var20 = (var19 >> 21 & 0x1) != 0;
            if (var20 && (Statics.field374 & 0x20) == 32) {
                method2603(field751, field752 + " " + class75.field1077 + " " + arg0.field2698, 58, 0, arg0.field2634, arg0.field2624);
            }
            return;
        }
        for (int var21 = 9; var21 >= 5; var21--) {
            String var22;
            if (!class232.method2978(method2080(arg0), var21) && arg0.field2611 == null) {
                var22 = null;
            } else if (arg0.field2699 == null || arg0.field2699.length <= var21 || arg0.field2699[var21] == null || arg0.field2699[var21].trim().length() == 0) {
                var22 = null;
            } else {
                var22 = arg0.field2699[var21];
            }
            if (var22 != null) {
                method2603(var22, arg0.field2698, 1007, var21 + 1, arg0.field2634, arg0.field2624);
            }
        }
        String var24 = method112(arg0);
        if (var24 != null) {
            method2603(var24, arg0.field2698, 25, 0, arg0.field2634, arg0.field2624);
        }
        for (int var25 = 4; var25 >= 0; var25--) {
            String var26;
            if (!class232.method2978(method2080(arg0), var25) && arg0.field2611 == null) {
                var26 = null;
            } else if (arg0.field2699 == null || arg0.field2699.length <= var25 || arg0.field2699[var25] == null || arg0.field2699[var25].trim().length() == 0) {
                var26 = null;
            } else {
                var26 = arg0.field2699[var25];
            }
            if (var26 != null) {
                method2603(var26, arg0.field2698, 57, var25 + 1, arg0.field2634, arg0.field2624);
            }
        }
        int var28 = method2080(arg0);
        boolean var29 = (var28 & 0x1) != 0;
        if (var29) {
            method2603(class238.field2819, "", 30, 0, arg0.field2634, arg0.field2624);
        }
    }

    @ObfuscatedName("jr.jc(I)Z")
    public static boolean method4861() {
        return field670;
    }

    @ObfuscatedName("u.jx(I)Z")
    public static boolean method198() {
        return field670 || class40.field341[81];
    }

    @ObfuscatedName("q.jb([Lhl;IIIIIIII)V")
    public static final void method26(class231[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class231 var9 = arg0[var8];
            if (var9 != null && (!var9.field2623 || var9.field2626 == 0 || var9.field2705 || method2080(var9) != 0 || field640 == var9 || var9.field2712 == 1338) && var9.field2643 == arg1) {
                if (var9.field2623) {
                    boolean var10 = var9.field2644;
                    if (var10) {
                        continue;
                    }
                }
                int var11 = var9.field2637 + arg6;
                int var12 = var9.field2638 + arg7;
                int var13;
                int var14;
                int var15;
                int var16;
                if (var9.field2626 == 2) {
                    var13 = arg2;
                    var14 = arg3;
                    var15 = arg4;
                    var16 = arg5;
                } else if (var9.field2626 == 9) {
                    int var17 = var11;
                    int var18 = var12;
                    int var19 = var9.field2628 + var11;
                    int var20 = var9.field2640 + var12;
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
                    int var23 = var9.field2628 + var11;
                    int var24 = var9.field2640 + var12;
                    var13 = var11 > arg2 ? var11 : arg2;
                    var14 = var12 > arg3 ? var12 : arg3;
                    var15 = var23 < arg4 ? var23 : arg4;
                    var16 = var24 < arg5 ? var24 : arg5;
                }
                if (field764 == var9) {
                    field861 = true;
                    field773 = var11;
                    field774 = var12;
                }
                if (!var9.field2623 || var13 < var15 && var14 < var16) {
                    int var25 = class49.field426;
                    int var26 = class49.field418;
                    if (class49.field432 != 0) {
                        var25 = class49.field433;
                        var26 = class49.field438;
                    }
                    boolean var27 = var25 >= var13 && var26 >= var14 && var25 < var15 && var26 < var16;
                    if (var9.field2712 == 1337) {
                        if (!field604 && !field847 && var27) {
                            method4235(var25, var26, var13, var14);
                        }
                    } else if (var9.field2712 != 1338) {
                        if (var9.field2712 == 1400) {
                            Statics.field988.method5719(class49.field426, class49.field418, var27, var11, var12, var9.field2628, var9.field2640);
                        }
                        if (!field847 && var27) {
                            if (var9.field2712 == 1400) {
                                Statics.field988.method5773(var11, var12, var9.field2628, var9.field2640, var25, var26);
                            } else {
                                method923(var9, var25 - var11, var26 - var12);
                            }
                        }
                        if (var9.field2626 == 0) {
                            if (!var9.field2623) {
                                boolean var41 = var9.field2644;
                                if (var41 && Statics.field330 != var9) {
                                    continue;
                                }
                            }
                            method26(arg0, var9.field2624, var13, var14, var15, var16, var11 - var9.field2645, var12 - var9.field2612);
                            if (var9.field2627 != null) {
                                method26(var9.field2627, var9.field2624, var13, var14, var15, var16, var11 - var9.field2645, var12 - var9.field2612);
                            }
                            class56 var42 = (class56) field827.method3748((long) var9.field2624);
                            if (var42 != null) {
                                if (var42.field504 == 0 && class49.field426 >= var13 && class49.field418 >= var14 && class49.field426 < var15 && class49.field418 < var16 && !field847) {
                                    for (class57 var43 = (class57) field756.method3797(); var43 != null; var43 = (class57) field756.method3788()) {
                                        if (var43.field527) {
                                            var43.method3782();
                                            var43.field512.field2750 = false;
                                        }
                                    }
                                    if (Statics.field1861 == 0) {
                                        field764 = null;
                                        field640 = null;
                                    }
                                    if (!field847) {
                                        method1481();
                                    }
                                }
                                int var44 = var42.field507;
                                if (class231.method694(var44)) {
                                    method26(Statics.field2616[var44], -1, var13, var14, var15, var16, var11, var12);
                                }
                            }
                        }
                        if (var9.field2623) {
                            if (var9.field2732) {
                                if (class49.field426 >= var13 && class49.field418 >= var14 && class49.field426 < var15 && class49.field418 < var16) {
                                    for (class57 var45 = (class57) field756.method3797(); var45 != null; var45 = (class57) field756.method3788()) {
                                        if (var45.field527) {
                                            var45.method3782();
                                            var45.field512.field2750 = false;
                                        }
                                    }
                                    if (Statics.field1861 == 0) {
                                        field764 = null;
                                        field640 = null;
                                    }
                                    if (!field847) {
                                        method1481();
                                    }
                                }
                            } else if (var9.field2664 && class49.field426 >= var13 && class49.field418 >= var14 && class49.field426 < var15 && class49.field418 < var16) {
                                for (class57 var46 = (class57) field756.method3797(); var46 != null; var46 = (class57) field756.method3788()) {
                                    if (var46.field527 && var46.field512.field2631 == var46.field526) {
                                        var46.method3782();
                                    }
                                }
                            }
                            boolean var47;
                            if (class49.field426 >= var13 && class49.field418 >= var14 && class49.field426 < var15 && class49.field418 < var16) {
                                var47 = true;
                            } else {
                                var47 = false;
                            }
                            boolean var48 = false;
                            if ((class49.field425 == 1 || !Statics.field58 && class49.field425 == 4) && var47) {
                                var48 = true;
                            }
                            boolean var49 = false;
                            if ((class49.field432 == 1 || !Statics.field58 && class49.field432 == 4) && class49.field433 >= var13 && class49.field438 >= var14 && class49.field433 < var15 && class49.field438 < var16) {
                                var49 = true;
                            }
                            if (var49) {
                                method617(var9, class49.field433 - var11, class49.field438 - var12);
                            }
                            if (var9.field2712 == 1400) {
                                Statics.field988.method5608(var25, var26, var47 & var48, var47 & var49);
                            }
                            if (field764 != null && field764 != var9 && var47 && class232.method2881(method2080(var9))) {
                                field701 = var9;
                            }
                            if (field640 == var9) {
                                field595 = true;
                                field770 = var11;
                                field771 = var12;
                            }
                            if (var9.field2705) {
                                if (var47 && field789 != 0 && var9.field2631 != null) {
                                    class57 var50 = new class57();
                                    var50.field527 = true;
                                    var50.field512 = var9;
                                    var50.field514 = field789;
                                    var50.field526 = var9.field2631;
                                    field756.method3810(var50);
                                }
                                if (field764 != null || Statics.field443 != null || field847) {
                                    var49 = false;
                                    var48 = false;
                                    var47 = false;
                                }
                                if (!var9.field2683 && var49) {
                                    var9.field2683 = true;
                                    if (var9.field2707 != null) {
                                        class57 var51 = new class57();
                                        var51.field527 = true;
                                        var51.field512 = var9;
                                        var51.field513 = class49.field433 - var11;
                                        var51.field514 = class49.field438 - var12;
                                        var51.field526 = var9.field2707;
                                        field756.method3810(var51);
                                    }
                                }
                                if (var9.field2683 && var48 && var9.field2660 != null) {
                                    class57 var52 = new class57();
                                    var52.field527 = true;
                                    var52.field512 = var9;
                                    var52.field513 = class49.field426 - var11;
                                    var52.field514 = class49.field418 - var12;
                                    var52.field526 = var9.field2660;
                                    field756.method3810(var52);
                                }
                                if (var9.field2683 && !var48) {
                                    var9.field2683 = false;
                                    if (var9.field2709 != null) {
                                        class57 var53 = new class57();
                                        var53.field527 = true;
                                        var53.field512 = var9;
                                        var53.field513 = class49.field426 - var11;
                                        var53.field514 = class49.field418 - var12;
                                        var53.field526 = var9.field2709;
                                        field792.method3810(var53);
                                    }
                                }
                                if (var48 && var9.field2710 != null) {
                                    class57 var54 = new class57();
                                    var54.field527 = true;
                                    var54.field512 = var9;
                                    var54.field513 = class49.field426 - var11;
                                    var54.field514 = class49.field418 - var12;
                                    var54.field526 = var9.field2710;
                                    field756.method3810(var54);
                                }
                                if (!var9.field2750 && var47) {
                                    var9.field2750 = true;
                                    if (var9.field2706 != null) {
                                        class57 var55 = new class57();
                                        var55.field527 = true;
                                        var55.field512 = var9;
                                        var55.field513 = class49.field426 - var11;
                                        var55.field514 = class49.field418 - var12;
                                        var55.field526 = var9.field2706;
                                        field756.method3810(var55);
                                    }
                                }
                                if (var9.field2750 && var47 && var9.field2725 != null) {
                                    class57 var56 = new class57();
                                    var56.field527 = true;
                                    var56.field512 = var9;
                                    var56.field513 = class49.field426 - var11;
                                    var56.field514 = class49.field418 - var12;
                                    var56.field526 = var9.field2725;
                                    field756.method3810(var56);
                                }
                                if (var9.field2750 && !var47) {
                                    var9.field2750 = false;
                                    if (var9.field2713 != null) {
                                        class57 var57 = new class57();
                                        var57.field527 = true;
                                        var57.field512 = var9;
                                        var57.field513 = class49.field426 - var11;
                                        var57.field514 = class49.field418 - var12;
                                        var57.field526 = var9.field2713;
                                        field792.method3810(var57);
                                    }
                                }
                                if (var9.field2724 != null) {
                                    class57 var58 = new class57();
                                    var58.field512 = var9;
                                    var58.field526 = var9.field2724;
                                    field791.method3810(var58);
                                }
                                if (var9.field2727 != null && field778 > var9.field2753) {
                                    if (var9.field2749 == null || field778 - var9.field2753 > 32) {
                                        class57 var63 = new class57();
                                        var63.field512 = var9;
                                        var63.field526 = var9.field2727;
                                        field756.method3810(var63);
                                    } else {
                                        label525: for (int var59 = var9.field2753; var59 < field778; var59++) {
                                            int var60 = field594[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var9.field2749.length; var61++) {
                                                if (var9.field2749[var61] == var60) {
                                                    class57 var62 = new class57();
                                                    var62.field512 = var9;
                                                    var62.field526 = var9.field2727;
                                                    field756.method3810(var62);
                                                    break label525;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2753 = field778;
                                }
                                if (var9.field2720 != null && field780 > var9.field2754) {
                                    if (var9.field2721 == null || field780 - var9.field2754 > 32) {
                                        class57 var68 = new class57();
                                        var68.field512 = var9;
                                        var68.field526 = var9.field2720;
                                        field756.method3810(var68);
                                    } else {
                                        label501: for (int var64 = var9.field2754; var64 < field780; var64++) {
                                            int var65 = field779[var64 & 0x1F];
                                            for (int var66 = 0; var66 < var9.field2721.length; var66++) {
                                                if (var9.field2721[var66] == var65) {
                                                    class57 var67 = new class57();
                                                    var67.field512 = var9;
                                                    var67.field526 = var9.field2720;
                                                    field756.method3810(var67);
                                                    break label501;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2754 = field780;
                                }
                                if (var9.field2722 != null && field782 > var9.field2726) {
                                    if (var9.field2723 == null || field782 - var9.field2726 > 32) {
                                        class57 var73 = new class57();
                                        var73.field512 = var9;
                                        var73.field526 = var9.field2722;
                                        field756.method3810(var73);
                                    } else {
                                        label477: for (int var69 = var9.field2726; var69 < field782; var69++) {
                                            int var70 = field811[var69 & 0x1F];
                                            for (int var71 = 0; var71 < var9.field2723.length; var71++) {
                                                if (var9.field2723[var71] == var70) {
                                                    class57 var72 = new class57();
                                                    var72.field512 = var9;
                                                    var72.field526 = var9.field2722;
                                                    field756.method3810(var72);
                                                    break label477;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2726 = field782;
                                }
                                if (field634 > var9.field2734 && var9.field2681 != null) {
                                    class57 var74 = new class57();
                                    var74.field512 = var9;
                                    var74.field526 = var9.field2681;
                                    field756.method3810(var74);
                                }
                                if (field743 > var9.field2734 && var9.field2729 != null) {
                                    class57 var75 = new class57();
                                    var75.field512 = var9;
                                    var75.field526 = var9.field2729;
                                    field756.method3810(var75);
                                }
                                if (field785 > var9.field2734 && var9.field2752 != null) {
                                    class57 var76 = new class57();
                                    var76.field512 = var9;
                                    var76.field526 = var9.field2752;
                                    field756.method3810(var76);
                                }
                                if (field786 > var9.field2734 && var9.field2735 != null) {
                                    class57 var77 = new class57();
                                    var77.field512 = var9;
                                    var77.field526 = var9.field2735;
                                    field756.method3810(var77);
                                }
                                if (field790 > var9.field2734 && var9.field2736 != null) {
                                    class57 var78 = new class57();
                                    var78.field512 = var9;
                                    var78.field526 = var9.field2736;
                                    field756.method3810(var78);
                                }
                                if (field788 > var9.field2734 && var9.field2731 != null) {
                                    class57 var79 = new class57();
                                    var79.field512 = var9;
                                    var79.field526 = var9.field2731;
                                    field756.method3810(var79);
                                }
                                var9.field2734 = field776;
                                if (var9.field2728 != null) {
                                    for (int var80 = 0; var80 < field846; var80++) {
                                        class57 var81 = new class57();
                                        var81.field512 = var9;
                                        var81.field521 = field866[var80];
                                        var81.field511 = field813[var80];
                                        var81.field526 = var9.field2728;
                                        field756.method3810(var81);
                                    }
                                }
                            }
                        }
                        if (!var9.field2623 && field764 == null && Statics.field443 == null && !field847) {
                            if ((var9.field2740 >= 0 || var9.field2651 != 0) && class49.field426 >= var13 && class49.field418 >= var14 && class49.field426 < var15 && class49.field418 < var16) {
                                if (var9.field2740 >= 0) {
                                    Statics.field330 = arg0[var9.field2740];
                                } else {
                                    Statics.field330 = var9;
                                }
                            }
                            if (var9.field2626 == 8 && class49.field426 >= var13 && class49.field418 >= var14 && class49.field426 < var15 && class49.field418 < var16) {
                                Statics.field43 = var9;
                            }
                            if (var9.field2648 > var9.field2640) {
                                method4242(var9, var9.field2628 + var11, var12, var9.field2640, var9.field2648, class49.field426, class49.field418);
                            }
                        }
                    } else if ((field823 == 0 || field823 == 3) && (class49.field432 == 1 || !Statics.field58 && class49.field432 == 4)) {
                        class225 var28 = var9.method4193(true);
                        if (var28 != null) {
                            int var29 = class49.field433 - var11;
                            int var30 = class49.field438 - var12;
                            if (var28.method4091(var29, var30)) {
                                int var31 = var29 - var28.field2571 / 2;
                                int var32 = var30 - var28.field2576 / 2;
                                int var33 = field663 & 0x7FF;
                                int var34 = class123.field1703[var33];
                                int var35 = class123.field1709[var33];
                                int var36 = var31 * var35 + var32 * var34 >> 11;
                                int var37 = var32 * var35 - var31 * var34 >> 11;
                                int var38 = Statics.field1949.field901 + var36 >> 7;
                                int var39 = Statics.field1949.field919 - var37 >> 7;
                                class173 var40 = class173.method2882(class170.field2244, field740.field1251);
                                var40.field2280.method3246(18);
                                var40.field2280.method3299(Statics.field2316 + var38);
                                var40.field2280.method3401(Statics.field1052 + var39);
                                var40.field2280.method3290(class40.field341[82] ? (class40.field341[81] ? 2 : 1) : 0);
                                var40.field2280.method3246(var31);
                                var40.field2280.method3246(var32);
                                var40.field2280.method3296(field663);
                                var40.field2280.method3246(57);
                                var40.field2280.method3246(0);
                                var40.field2280.method3246(0);
                                var40.field2280.method3246(89);
                                var40.field2280.method3296(Statics.field1949.field901);
                                var40.field2280.method3296(Statics.field1949.field919);
                                var40.field2280.method3246(63);
                                field740.method1873(var40);
                                field821 = var38;
                                field822 = var39;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bz.je(III)V")
    public static final void method1720(int arg0, int arg1) {
        if (class231.method694(arg0)) {
            method3(Statics.field2616[arg0], arg1);
        }
    }

    @ObfuscatedName("w.jy([Lhl;IS)V")
    public static final void method3(class231[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class231 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2626 == 0) {
                    if (var3.field2627 != null) {
                        method3(var3.field2627, arg1);
                    }
                    class56 var4 = (class56) field827.method3748((long) var3.field2624);
                    if (var4 != null) {
                        method1720(var4.field507, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2714 != null) {
                    class57 var5 = new class57();
                    var5.field512 = var3;
                    var5.field526 = var3.field2714;
                    class70.method1612(var5);
                }
                if (arg1 == 1 && var3.field2733 != null) {
                    if (var3.field2634 >= 0) {
                        class231 var6 = class231.method1097(var3.field2624);
                        if (var6 == null || var6.field2627 == null || var3.field2634 >= var6.field2627.length || var6.field2627[var3.field2634] != var3) {
                            continue;
                        }
                    }
                    class57 var7 = new class57();
                    var7.field512 = var3;
                    var7.field526 = var3.field2733;
                    class70.method1612(var7);
                }
            }
        }
    }

    @ObfuscatedName("ah.jq(Lhl;IIB)V")
    public static final void method617(class231 arg0, int arg1, int arg2) {
        if (field764 != null || field847 || arg0 == null || method3084(arg0) == null) {
            return;
        }
        field764 = arg0;
        field640 = method3084(arg0);
        field686 = arg1;
        field767 = arg2;
        Statics.field1861 = 0;
        field775 = false;
        int var3 = field658 - 1;
        if (var3 == -1) {
            return;
        }
        Statics.field2377 = new class76();
        Statics.field2377.field1083 = field731[var3];
        Statics.field2377.field1078 = field738[var3];
        Statics.field2377.field1084 = field703[var3];
        Statics.field2377.field1081 = field620[var3];
        Statics.field2377.field1082 = field735[var3];
    }

    @ObfuscatedName("client.jp(B)V")
    public final void method1132() {
        method3242(field764);
        Statics.field1861++;
        if (field861 && field595) {
            int var1 = class49.field426;
            int var2 = class49.field418;
            int var3 = var1 - field686;
            int var4 = var2 - field767;
            if (var3 < field770) {
                var3 = field770;
            }
            if (field764.field2628 + var3 > field770 + field640.field2628) {
                var3 = field770 + field640.field2628 - field764.field2628;
            }
            if (var4 < field771) {
                var4 = field771;
            }
            if (field764.field2640 + var4 > field771 + field640.field2640) {
                var4 = field771 + field640.field2640 - field764.field2640;
            }
            int var5 = var3 - field773;
            int var6 = var4 - field774;
            int var7 = field764.field2688;
            if (Statics.field1861 > field764.field2695 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field775 = true;
            }
            int var8 = field640.field2645 + (var3 - field770);
            int var9 = field640.field2612 + (var4 - field771);
            if (field764.field2718 != null && field775) {
                class57 var10 = new class57();
                var10.field512 = field764;
                var10.field513 = var8;
                var10.field514 = var9;
                var10.field526 = field764.field2718;
                class70.method1612(var10);
            }
            if (class49.field425 == 0) {
                if (field775) {
                    if (field764.field2715 != null) {
                        class57 var11 = new class57();
                        var11.field512 = field764;
                        var11.field513 = var8;
                        var11.field514 = var9;
                        var11.field516 = field701;
                        var11.field526 = field764.field2715;
                        class70.method1612(var11);
                    }
                    if (field701 != null) {
                        class231 var12 = field764;
                        int var13 = class232.method4146(method2080(var12));
                        class231 var14;
                        if (var13 == 0) {
                            var14 = null;
                        } else {
                            int var15 = 0;
                            while (true) {
                                if (var15 >= var13) {
                                    var14 = var12;
                                    break;
                                }
                                var12 = class231.method1097(var12.field2643);
                                if (var12 == null) {
                                    var14 = null;
                                    break;
                                }
                                var15++;
                            }
                        }
                        if (var14 != null) {
                            class173 var16 = class173.method2882(class170.field2228, field740.field1251);
                            var16.field2280.method3401(field764.field2755);
                            var16.field2280.method3299(field701.field2755);
                            var16.field2280.method3335(field764.field2624);
                            var16.field2280.method3364(field701.field2624);
                            var16.field2280.method3296(field701.field2634);
                            var16.field2280.method3419(field764.field2634);
                            field740.method1873(var16);
                        }
                    }
                } else if (this.method1112()) {
                    this.method1342(field773 + field686, field774 + field767);
                } else if (field658 > 0) {
                    int var17 = field773 + field686;
                    int var18 = field774 + field767;
                    method433(Statics.field2377, var17, var18);
                    Statics.field2377 = null;
                }
                field764 = null;
            }
        } else if (Statics.field1861 > 1) {
            field764 = null;
        }
    }

    @ObfuscatedName("fb.jm(Lhl;I)V")
    public static void method3242(class231 arg0) {
        if (field795 == arg0.field2757) {
            field796[arg0.field2756] = true;
        }
    }

    @ObfuscatedName("bv.ja(I)V")
    public static void method1633() {
        for (class56 var0 = (class56) field827.method3739(); var0 != null; var0 = (class56) field827.method3740()) {
            int var1 = var0.field507;
            if (class231.method694(var1)) {
                boolean var2 = true;
                class231[] var3 = Statics.field2616[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2623;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2450;
                    class231 var6 = class231.method1097(var5);
                    if (var6 != null) {
                        method3242(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ff.jj(Lhl;B)Lhl;")
    public static class231 method3084(class231 arg0) {
        class231 var1 = arg0;
        int var2 = class232.method4146(method2080(arg0));
        class231 var3;
        if (var2 == 0) {
            var3 = null;
        } else {
            int var4 = 0;
            while (true) {
                if (var4 >= var2) {
                    var3 = var1;
                    break;
                }
                var1 = class231.method1097(var1.field2643);
                if (var1 == null) {
                    var3 = null;
                    break;
                }
                var4++;
            }
        }
        class231 var5 = var3;
        if (var3 == null) {
            var5 = arg0.field2625;
        }
        return var5;
    }

    @ObfuscatedName("o.jf(IB)V")
    public static final void method443(int arg0) {
        if (!class231.method694(arg0)) {
            return;
        }
        class231[] var1 = Statics.field2616[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class231 var3 = var1[var2];
            if (var3 != null) {
                var3.field2747 = 0;
                var3.field2719 = 0;
            }
        }
    }

    @ObfuscatedName("at.jh(II)V")
    public static final void method455(int arg0) {
        if (class231.method694(arg0)) {
            method4738(Statics.field2616[arg0], -1);
        }
    }

    @ObfuscatedName("jm.ju([Lhl;II)V")
    public static final void method4738(class231[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class231 var3 = arg0[var2];
            if (var3 != null && var3.field2643 == arg1) {
                if (var3.field2623) {
                    boolean var4 = var3.field2644;
                    if (var4) {
                        continue;
                    }
                }
                if (var3.field2626 == 0) {
                    if (!var3.field2623) {
                        boolean var5 = var3.field2644;
                        if (var5 && Statics.field330 != var3) {
                            continue;
                        }
                    }
                    method4738(arg0, var3.field2624);
                    if (var3.field2627 != null) {
                        method4738(var3.field2627, var3.field2624);
                    }
                    class56 var6 = (class56) field827.method3748((long) var3.field2624);
                    if (var6 != null) {
                        method455(var6.field507);
                    }
                }
                if (var3.field2626 == 6) {
                    if (var3.field2671 != -1 || var3.field2672 != -1) {
                        boolean var7 = method97(var3);
                        int var8;
                        if (var7) {
                            var8 = var3.field2672;
                        } else {
                            var8 = var3.field2671;
                        }
                        if (var8 != -1) {
                            class274 var9 = class274.method2918(var8);
                            var3.field2719 += field655;
                            while (var3.field2719 > var9.field3563[var3.field2747]) {
                                var3.field2719 -= var9.field3563[var3.field2747];
                                var3.field2747++;
                                if (var3.field2747 >= var9.field3554.length) {
                                    var3.field2747 -= var9.field3558;
                                    if (var3.field2747 < 0 || var3.field2747 >= var9.field3554.length) {
                                        var3.field2747 = 0;
                                    }
                                }
                                method3242(var3);
                            }
                        }
                    }
                    if (var3.field2662 != 0 && !var3.field2623) {
                        int var10 = var3.field2662 >> 16;
                        int var11 = var3.field2662 << 16 >> 16;
                        int var12 = field655 * var10;
                        int var13 = field655 * var11;
                        var3.field2676 = var3.field2676 + var12 & 0x7FF;
                        var3.field2708 = var3.field2708 + var13 & 0x7FF;
                        method3242(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("hl.jr(IB)V")
    public static final void method4169(int arg0) {
        method1633();
        class69.method3156();
        class255 var1 = (class255) class255.field3253.method3707((long) arg0);
        class255 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field3255.method4250(16, arg0);
            class255 var4 = new class255();
            if (var3 != null) {
                var4.method4434(new class183(var3));
            }
            class255.field3253.method3712(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var5 = var2.field3254;
        if (var5 == 0) {
            return;
        }
        int var6 = class226.field2579[arg0];
        if (var5 == 1) {
            if (var6 == 1) {
                class123.method2610(0.9D);
                ((class112) Statics.field1713).method2371(0.9D);
            }
            if (var6 == 2) {
                class123.method2610(0.8D);
                ((class112) Statics.field1713).method2371(0.8D);
            }
            if (var6 == 3) {
                class123.method2610(0.7D);
                ((class112) Statics.field1713).method2371(0.7D);
            }
            if (var6 == 4) {
                class123.method2610(0.6D);
                ((class112) Statics.field1713).method2371(0.6D);
            }
            class270.method2602();
        }
        if (var5 == 3) {
            short var7 = 0;
            if (var6 == 0) {
                var7 = 255;
            }
            if (var6 == 1) {
                var7 = 192;
            }
            if (var6 == 2) {
                var7 = 128;
            }
            if (var6 == 3) {
                var7 = 64;
            }
            if (var6 == 4) {
                var7 = 0;
            }
            if (field694 != var7) {
                if (field694 == 0 && field825 != -1) {
                    class218.method3231(Statics.field437, field825, 0, var7, false);
                    field826 = false;
                } else if (var7 == 0) {
                    class218.method630();
                    field826 = false;
                } else {
                    class218.method1465(var7);
                }
                field694 = var7;
            }
        }
        if (var5 == 4) {
            if (var6 == 0) {
                field769 = 127;
            }
            if (var6 == 1) {
                field769 = 96;
            }
            if (var6 == 2) {
                field769 = 64;
            }
            if (var6 == 3) {
                field769 = 32;
            }
            if (var6 == 4) {
                field769 = 0;
            }
        }
        if (var5 == 5) {
            field728 = var6;
        }
        if (var5 == 6) {
            field755 = var6;
        }
        if (var5 == 9) {
            field815 = var6;
        }
        if (var5 == 10) {
            if (var6 == 0) {
                field828 = 127;
            }
            if (var6 == 1) {
                field828 = 96;
            }
            if (var6 == 2) {
                field828 = 64;
            }
            if (var6 == 3) {
                field828 = 32;
            }
            if (var6 == 4) {
                field828 = 0;
            }
        }
        if (var5 == 17) {
            field761 = var6 & 0xFFFF;
        }
        if (var5 == 18) {
            field621 = (class78) class178.method90(Statics.method449(), var6);
            if (field621 == null) {
                field621 = class78.field1099;
            }
        }
        if (var5 == 19) {
            if (var6 == -1) {
                field720 = -1;
            } else {
                field720 = var6 & 0x7FF;
            }
        }
        if (var5 == 22) {
            field622 = (class78) class178.method90(Statics.method449(), var6);
            if (field622 == null) {
                field622 = class78.field1099;
            }
        }
    }

    @ObfuscatedName("a.jt(I)V")
    public static final void method100() {
        class173 var0 = class173.method2882(class170.field2187, field740.field1251);
        field740.method1873(var0);
        for (class56 var1 = (class56) field827.method3739(); var1 != null; var1 = (class56) field827.method3740()) {
            if (var1.field504 == 0 || var1.field504 == 3) {
                method278(var1, true);
            }
        }
        if (field757 != null) {
            method3242(field757);
            field757 = null;
        }
    }

    @ObfuscatedName("je.jo(IIII)Lbe;")
    public static final class56 method4607(int arg0, int arg1, int arg2) {
        class56 var3 = new class56();
        var3.field507 = arg1;
        var3.field504 = arg2;
        field827.method3747(var3, (long) arg0);
        method443(arg1);
        class231 var4 = class231.method1097(arg0);
        method3242(var4);
        if (field757 != null) {
            method3242(field757);
            field757 = null;
        }
        method10();
        method727(Statics.field2616[arg0 >> 16], var4, false);
        class70.method56(arg1);
        if (field753 != -1) {
            method1720(field753, 1);
        }
        return var3;
    }

    @ObfuscatedName("z.jd(Lbe;ZI)V")
    public static final void method278(class56 arg0, boolean arg1) {
        int var2 = arg0.field507;
        int var3 = (int) arg0.field2450;
        arg0.method3782();
        if (arg1) {
            class231.method191(var2);
        }
        for (class212 var4 = (class212) field817.method3739(); var4 != null; var4 = (class212) field817.method3740()) {
            if ((var4.field2450 >> 48 & 0xFFFFL) == (long) var2) {
                var4.method3782();
            }
        }
        class231 var5 = class231.method1097(var3);
        if (var5 != null) {
            method3242(var5);
        }
        method10();
        if (field753 != -1) {
            method1720(field753, 1);
        }
    }

    @ObfuscatedName("y.ji(Lhl;B)Z")
    public static final boolean method164(class231 arg0) {
        int var1 = arg0.field2712;
        if (var1 == 205) {
            field689 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field854.method4118(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field854.method4119(var4, var5 == 1);
        }
        if (var1 == 324) {
            field854.method4120(false);
        }
        if (var1 == 325) {
            field854.method4120(true);
        }
        if (var1 == 326) {
            class173 var6 = class173.method2882(class170.field2248, field740.field1251);
            field854.method4133(var6.field2280);
            field740.method1873(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("f.jg(Lhl;IIIB)V")
    public static final void method58(class231 arg0, int arg1, int arg2, int arg3) {
        class225 var4 = arg0.method4193(false);
        if (var4 == null) {
            return;
        }
        if (field823 < 3) {
            Statics.field303.method5505(arg1, arg2, var4.field2571, var4.field2576, 25, 25, field663, 256, var4.field2574, var4.field2573);
        } else {
            class315.method5351(arg1, arg2, 0, var4.field2574, var4.field2573);
        }
    }

    @ObfuscatedName("ad.jw(IIIILlc;Lhr;S)V")
    public static final void method460(int arg0, int arg1, int arg2, int arg3, class319 arg4, class225 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method4425(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field663 & 0x7FF;
        int var8 = class123.field1703[var7];
        int var9 = class123.field1709[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field2571 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field1805.method5470(arg5.field2571 / 2 + arg0 - var17 / 2 + var15, arg5.field2576 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("it.jn(IIIILlc;Lhr;I)V")
    public static final void method4425(int arg0, int arg1, int arg2, int arg3, class319 arg4, class225 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field663 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class123.field1703[var6];
        int var9 = class123.field1709[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method5468(arg5.field2571 / 2 + var10 - arg4.field3797 / 2, arg5.field2576 / 2 - var11 - arg4.field3793 / 2, arg0, arg1, arg5.field2571, arg5.field2576, arg5.field2574, arg5.field2573);
        } else {
            arg4.method5448(arg5.field2571 / 2 + arg0 + var10 - arg4.field3797 / 2, arg5.field2576 / 2 + arg1 - var11 - arg4.field3793 / 2);
        }
    }

    @ObfuscatedName("ag.jz(Ljava/lang/String;I)V")
    public static final void method565(String arg0) {
        if (!arg0.equals("")) {
            class173 var1 = class173.method2882(class170.field2177, field740.field1251);
            var1.field2280.method3246(class183.method124(arg0));
            var1.field2280.method3243(arg0);
            field740.method1873(var1);
        }
    }

    @ObfuscatedName("cc.js(Lhl;B)I")
    public static int method2080(class231 arg0) {
        class212 var1 = (class212) field817.method3748(((long) arg0.field2624 << 32) + (long) arg0.field2634);
        return var1 == null ? arg0.field2697 : var1.field2465;
    }

    @ObfuscatedName("d.kj(Lhl;I)Ljava/lang/String;")
    public static String method112(class231 arg0) {
        int var1 = method2080(arg0);
        int var2 = var1 >> 11 & 0x3F;
        if (var2 == 0) {
            return null;
        } else if (arg0.field2704 == null || arg0.field2704.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2704;
        }
    }

    @ObfuscatedName("dd.kd(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method2338(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field597 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field597 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field597 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field597 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field597 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field358 != null) {
            var3 = "/p=" + Statics.field358;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field600 + "/a=" + Statics.field232 + var3 + "/";
    }

    @ObfuscatedName("c.ki(Ljava/lang/String;ZB)V")
    public static void method190(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field444; var5++) {
            class270 var6 = class270.method2571(var5);
            if ((!arg1 || var6.field3490) && var6.field3461 == -1 && var6.field3450.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field257 = -1;
                    Statics.field1890 = null;
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
        Statics.field1890 = var3;
        Statics.field523 = 0;
        Statics.field257 = var4;
        String[] var9 = new String[Statics.field257];
        for (int var10 = 0; var10 < Statics.field257; var10++) {
            var9[var10] = class270.method2571(var3[var10]).field3450;
        }
        class180.method2940(var9, Statics.field1890);
    }

    @ObfuscatedName("bz.ke(Lgy;II)V")
    public static void method1723(class183 arg0, int arg1) {
        byte[] var2 = arg0.field2366;
        if (field719 == null) {
            field719 = new byte[24];
        }
        class194.method3635(var2, arg1, field719, 0, 24);
        class156.method3541(arg0, arg1);
    }

    @ObfuscatedName("client.kn(I)Lkm;")
    public class292 method1117() {
        return Statics.field1949 == null ? null : Statics.field1949.field588;
    }

    @ObfuscatedName("eq.km(IIIZI)V")
    public static void method2961(int arg0, int arg1, int arg2, boolean arg3) {
        class173 var4 = class173.method2882(class170.field2162, field740.field1251);
        var4.field2280.method3289(arg2);
        var4.field2280.method3299(arg0);
        var4.field2280.method3299(arg1);
        var4.field2280.method3364(arg3 ? field675 : 0);
        field740.method1873(var4);
    }

    @ObfuscatedName("eb.kf(I)Z")
    public static boolean method2928() {
        return field730 >= 2;
    }

    @ObfuscatedName("il.kb(II)V")
    public static void method4247(int arg0) {
        field679 = arg0;
    }

    @ObfuscatedName("ak.ks(B)V")
    public static void method970() {
        if (!field623 || Statics.field1949 == null) {
            return;
        }
        int var0 = Statics.field1949.field929[0];
        int var1 = Statics.field1949.field940[0];
        if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) {
            return;
        }
        Statics.field1980 = Statics.field1949.field901;
        int var2 = method4568(Statics.field1949.field901, Statics.field1949.field919, Statics.field2416) - field669;
        if (var2 < Statics.field858) {
            Statics.field858 = var2;
        }
        Statics.field482 = Statics.field1949.field919;
        field623 = false;
    }

    @ObfuscatedName("a.kt(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method98(String arg0) {
        class243[] var1 = class243.method4860();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class243 var3 = var1[var2];
            if (var3.field3143 != -1 && arg0.startsWith(class75.method619(var3.field3143))) {
                arg0 = arg0.substring(6 + Integer.toString(var3.field3143).length());
                break;
            }
        }
        return arg0;
    }
}

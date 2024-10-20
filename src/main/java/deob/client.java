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
    public static class167[] field767 = new class167[4];

    @ObfuscatedName("client.aw")
    public static boolean field737 = true;

    @ObfuscatedName("client.bv")
    public static int field610 = 1;

    @ObfuscatedName("client.bh")
    public static int field611 = 0;

    @ObfuscatedName("client.bm")
    public static int field612 = 0;

    @ObfuscatedName("client.bb")
    public static boolean field751 = false;

    @ObfuscatedName("client.bd")
    public static boolean field614 = false;

    @ObfuscatedName("client.bu")
    public static int field642 = 0;

    @ObfuscatedName("client.bn")
    public static int field617 = -1;

    @ObfuscatedName("client.be")
    public static boolean field618 = false;

    @ObfuscatedName("client.bs")
    public static int field827 = 0;

    @ObfuscatedName("client.cp")
    public static boolean field620 = true;

    @ObfuscatedName("client.cq")
    public static int field633 = 0;

    @ObfuscatedName("client.cw")
    public static long field622 = 1L;

    @ObfuscatedName("client.cg")
    public static int field623 = -1;

    @ObfuscatedName("client.cu")
    public static int field624 = -1;

    @ObfuscatedName("client.cz")
    public static long field822 = -1L;

    @ObfuscatedName("client.ci")
    public static boolean field626 = true;

    @ObfuscatedName("client.cj")
    public static boolean field627 = false;

    @ObfuscatedName("client.cd")
    public static int field628 = 0;

    @ObfuscatedName("client.cr")
    public static int field629 = 0;

    @ObfuscatedName("client.cb")
    public static int field873 = 0;

    @ObfuscatedName("client.ct")
    public static int field631 = 0;

    @ObfuscatedName("client.ca")
    public static int field632 = 0;

    @ObfuscatedName("client.cx")
    public static int field786 = 0;

    @ObfuscatedName("client.ce")
    public static int field719 = 0;

    @ObfuscatedName("client.cv")
    public static int field635 = 0;

    @ObfuscatedName("client.cm")
    public static int field636 = 0;

    @ObfuscatedName("client.cs")
    public static class79 field637 = class79.field1112;

    @ObfuscatedName("client.dl")
    public static class79 field638 = class79.field1112;

    @ObfuscatedName("client.dq")
    public static int field639 = 0;

    @ObfuscatedName("client.da")
    public static int field656 = 0;

    @ObfuscatedName("client.dm")
    public static int field641 = 0;

    @ObfuscatedName("client.ec")
    public static int field707 = 0;

    @ObfuscatedName("client.ev")
    public static int field643 = 0;

    @ObfuscatedName("client.eg")
    public static int field644 = 0;

    @ObfuscatedName("client.ei")
    public static int field645 = 0;

    @ObfuscatedName("client.en")
    public static int field646 = 0;

    @ObfuscatedName("client.el")
    public static class149 field647 = class149.field1949;

    @ObfuscatedName("client.ep")
    public static boolean field648 = false;

    @ObfuscatedName("client.eu")
    public static class83 field649 = new class83();

    @ObfuscatedName("client.eq")
    public static byte[] field650 = null;

    @ObfuscatedName("client.ez")
    public static class74[] field651 = new class74[32768];

    @ObfuscatedName("client.ew")
    public static int field652 = 0;

    @ObfuscatedName("client.ea")
    public static int[] field868 = new int[32768];

    @ObfuscatedName("client.es")
    public static int field654 = 0;

    @ObfuscatedName("client.fc")
    public static int[] field655 = new int[250];

    @ObfuscatedName("client.fx")
    public static final class90 field798 = new class90();

    @ObfuscatedName("client.fu")
    public static int field657 = 0;

    @ObfuscatedName("client.fz")
    public static boolean field658 = false;

    @ObfuscatedName("client.fy")
    public static boolean field740 = true;

    @ObfuscatedName("client.fh")
    public static class283 field660 = new class283();

    @ObfuscatedName("client.fq")
    public static HashMap field869 = new HashMap();

    @ObfuscatedName("client.fl")
    public static int field683 = 0;

    @ObfuscatedName("client.fe")
    public static int field663 = 1;

    @ObfuscatedName("client.fr")
    public static int field615 = 0;

    @ObfuscatedName("client.fo")
    public static int field665 = 1;

    @ObfuscatedName("client.ft")
    public static int field666 = 0;

    @ObfuscatedName("client.gw")
    public static boolean field689 = false;

    @ObfuscatedName("client.gr")
    public static int[][][] field669 = new int[4][13][13];

    @ObfuscatedName("client.gh")
    public static final int[] field670 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.gg")
    public static int field671 = 0;

    @ObfuscatedName("client.gf")
    public static int field672 = 2301979;

    @ObfuscatedName("client.gd")
    public static int field673 = 5063219;

    @ObfuscatedName("client.hp")
    public static int field662 = 3353893;

    @ObfuscatedName("client.ha")
    public static int field872 = 7759444;

    @ObfuscatedName("client.hi")
    public static boolean field769 = false;

    @ObfuscatedName("client.hy")
    public static int field677 = 0;

    @ObfuscatedName("client.hd")
    public static int field679 = 128;

    @ObfuscatedName("client.hb")
    public static int field680 = 0;

    @ObfuscatedName("client.he")
    public static int field681 = 0;

    @ObfuscatedName("client.hu")
    public static int field697 = 0;

    @ObfuscatedName("client.ht")
    public static int field685 = 0;

    @ObfuscatedName("client.hs")
    public static int field684 = 0;

    @ObfuscatedName("client.hv")
    public static int field876 = 0;

    @ObfuscatedName("client.hh")
    public static int field686 = 50;

    @ObfuscatedName("client.hl")
    public static int field687 = 0;

    @ObfuscatedName("client.ho")
    public static int field688 = 0;

    @ObfuscatedName("client.hk")
    public static int field775 = 0;

    @ObfuscatedName("client.ia")
    public static int field690 = 12;

    @ObfuscatedName("client.il")
    public static int field691 = 6;

    @ObfuscatedName("client.ij")
    public static int field764 = 0;

    @ObfuscatedName("client.ik")
    public static boolean field866 = false;

    @ObfuscatedName("client.ii")
    public static int field694 = 0;

    @ObfuscatedName("client.im")
    public static boolean field695 = false;

    @ObfuscatedName("client.iw")
    public static int field728 = 0;

    @ObfuscatedName("client.ig")
    public static int field732 = 0;

    @ObfuscatedName("client.in")
    public static int field698 = 50;

    @ObfuscatedName("client.iv")
    public static int[] field699 = new int[field698];

    @ObfuscatedName("client.if")
    public static int[] field700 = new int[field698];

    @ObfuscatedName("client.iu")
    public static int[] field701 = new int[field698];

    @ObfuscatedName("client.ir")
    public static int[] field785 = new int[field698];

    @ObfuscatedName("client.iy")
    public static int[] field703 = new int[field698];

    @ObfuscatedName("client.ih")
    public static int[] field668 = new int[field698];

    @ObfuscatedName("client.ie")
    public static int[] field743 = new int[field698];

    @ObfuscatedName("client.iq")
    public static String[] field706 = new String[field698];

    @ObfuscatedName("client.is")
    public static int[][] field676 = new int[104][104];

    @ObfuscatedName("client.ip")
    public static int field708 = 0;

    @ObfuscatedName("client.it")
    public static String field765 = null;

    @ObfuscatedName("client.ib")
    public static int field709 = -1;

    @ObfuscatedName("client.id")
    public static int field830 = -1;

    @ObfuscatedName("client.ic")
    public static int field711 = 0;

    @ObfuscatedName("client.io")
    public static int field832 = 0;

    @ObfuscatedName("client.jr")
    public static int field810 = 0;

    @ObfuscatedName("client.jz")
    public static int field664 = 0;

    @ObfuscatedName("client.ja")
    public static boolean field621 = true;

    @ObfuscatedName("client.jb")
    public static int field712 = 0;

    @ObfuscatedName("client.jf")
    public static int field717 = 0;

    @ObfuscatedName("client.jj")
    public static int field718 = 0;

    @ObfuscatedName("client.ji")
    public static int field640 = 0;

    @ObfuscatedName("client.ju")
    public static int field747 = 0;

    @ObfuscatedName("client.jn")
    public static int field789 = 0;

    @ObfuscatedName("client.jd")
    public static boolean field722 = false;

    @ObfuscatedName("client.jo")
    public static int field723 = 0;

    @ObfuscatedName("client.jy")
    public static int field885 = 0;

    @ObfuscatedName("client.jc")
    public static boolean field725 = true;

    @ObfuscatedName("client.jt")
    public static class62[] field727 = new class62[2048];

    @ObfuscatedName("client.jx")
    public static int field781 = -1;

    @ObfuscatedName("client.jq")
    public static int field729 = 0;

    @ObfuscatedName("client.jp")
    public static boolean field804 = true;

    @ObfuscatedName("client.kp")
    public static int field731 = 0;

    @ObfuscatedName("client.kd")
    public static int field808 = 0;

    @ObfuscatedName("client.kv")
    public static int[] field733 = new int[1000];

    @ObfuscatedName("client.kj")
    public static final int[] field734 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.kh")
    public static String[] field735 = new String[8];

    @ObfuscatedName("client.kr")
    public static boolean[] field736 = new boolean[8];

    @ObfuscatedName("client.kq")
    public static int[] field720 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.ko")
    public static int field738 = -1;

    @ObfuscatedName("client.kn")
    public static class208[][][] field739 = new class208[4][104][104];

    @ObfuscatedName("client.ks")
    public static class208 field821 = new class208();

    @ObfuscatedName("client.ke")
    public static class208 field741 = new class208();

    @ObfuscatedName("client.ka")
    public static class208 field742 = new class208();

    @ObfuscatedName("client.kt")
    public static int[] field756 = new int[25];

    @ObfuscatedName("client.kc")
    public static int[] field744 = new int[25];

    @ObfuscatedName("client.kg")
    public static int[] field745 = new int[25];

    @ObfuscatedName("client.ky")
    public static int field746 = 0;

    @ObfuscatedName("client.km")
    public static boolean field692 = false;

    @ObfuscatedName("client.kw")
    public static int field748 = 0;

    @ObfuscatedName("client.lr")
    public static int[] field749 = new int[500];

    @ObfuscatedName("client.ls")
    public static int[] field750 = new int[500];

    @ObfuscatedName("client.lb")
    public static int[] field870 = new int[500];

    @ObfuscatedName("client.lo")
    public static int[] field752 = new int[500];

    @ObfuscatedName("client.ll")
    public static String[] field730 = new String[500];

    @ObfuscatedName("client.lh")
    public static String[] field754 = new String[500];

    @ObfuscatedName("client.lx")
    public static boolean[] field613 = new boolean[500];

    @ObfuscatedName("client.lz")
    public static boolean field773 = false;

    @ObfuscatedName("client.le")
    public static boolean field759 = false;

    @ObfuscatedName("client.lk")
    public static boolean field758 = false;

    @ObfuscatedName("client.ly")
    public static boolean field715 = true;

    @ObfuscatedName("client.ld")
    public static int field760 = -1;

    @ObfuscatedName("client.lg")
    public static int field761 = -1;

    @ObfuscatedName("client.lv")
    public static int field762 = 0;

    @ObfuscatedName("client.lp")
    public static int field763 = 50;

    @ObfuscatedName("client.lt")
    public static int field839 = 0;

    @ObfuscatedName("client.lq")
    public static boolean field766 = false;

    @ObfuscatedName("client.lm")
    public static int field678 = -1;

    @ObfuscatedName("client.lj")
    public static int field768 = -1;

    @ObfuscatedName("client.mn")
    public static String field799 = null;

    @ObfuscatedName("client.mk")
    public static String field721 = null;

    @ObfuscatedName("client.me")
    public static int field816 = -1;

    @ObfuscatedName("client.mr")
    public static class205 field771 = new class205(8);

    @ObfuscatedName("client.ma")
    public static int field772 = 0;

    @ObfuscatedName("client.mi")
    public static int field774 = -1;

    @ObfuscatedName("client.mg")
    public static int field854 = 0;

    @ObfuscatedName("client.mc")
    public static int field776 = 0;

    @ObfuscatedName("client.md")
    public static class233 field710 = null;

    @ObfuscatedName("client.mh")
    public static int field778 = 0;

    @ObfuscatedName("client.mq")
    public static int field779 = 0;

    @ObfuscatedName("client.mm")
    public static int field780 = 0;

    @ObfuscatedName("client.ml")
    public static int field714 = -1;

    @ObfuscatedName("client.mx")
    public static boolean field782 = false;

    @ObfuscatedName("client.mw")
    public static class233 field783 = null;

    @ObfuscatedName("client.mf")
    public static class233 field784 = null;

    @ObfuscatedName("client.mo")
    public static class233 field777 = null;

    @ObfuscatedName("client.mv")
    public static int field801 = 0;

    @ObfuscatedName("client.mt")
    public static int field787 = 0;

    @ObfuscatedName("client.mz")
    public static class233 field788 = null;

    @ObfuscatedName("client.mp")
    public static boolean field716 = false;

    @ObfuscatedName("client.ms")
    public static int field790 = -1;

    @ObfuscatedName("client.nz")
    public static int field791 = -1;

    @ObfuscatedName("client.nd")
    public static boolean field693 = false;

    @ObfuscatedName("client.nc")
    public static int field793 = -1;

    @ObfuscatedName("client.nb")
    public static int field794 = -1;

    @ObfuscatedName("client.ni")
    public static boolean field795 = false;

    @ObfuscatedName("client.na")
    public static int field796 = 1;

    @ObfuscatedName("client.nq")
    public static int[] field797 = new int[32];

    @ObfuscatedName("client.nh")
    public static int field757 = 0;

    @ObfuscatedName("client.nj")
    public static int[] field792 = new int[32];

    @ObfuscatedName("client.nr")
    public static int field800 = 0;

    @ObfuscatedName("client.nt")
    public static int[] field704 = new int[32];

    @ObfuscatedName("client.ng")
    public static int field802 = 0;

    @ObfuscatedName("client.nl")
    public static int field803 = 0;

    @ObfuscatedName("client.nu")
    public static int field667 = 0;

    @ObfuscatedName("client.nw")
    public static int field805 = 0;

    @ObfuscatedName("client.nx")
    public static int field806 = 0;

    @ObfuscatedName("client.nk")
    public static int field807 = 0;

    @ObfuscatedName("client.ny")
    public static int field848 = 0;

    @ObfuscatedName("client.oh")
    public static int field634 = 0;

    @ObfuscatedName("client.oy")
    public static class208 field770 = new class208();

    @ObfuscatedName("client.oa")
    public static class208 field811 = new class208();

    @ObfuscatedName("client.of")
    public static class208 field812 = new class208();

    @ObfuscatedName("client.ox")
    public static class205 field813 = new class205(512);

    @ObfuscatedName("client.on")
    public static int field814 = 0;

    @ObfuscatedName("client.ok")
    public static int field815 = -2;

    @ObfuscatedName("client.oq")
    public static boolean[] field875 = new boolean[100];

    @ObfuscatedName("client.og")
    public static boolean[] field817 = new boolean[100];

    @ObfuscatedName("client.op")
    public static boolean[] field818 = new boolean[100];

    @ObfuscatedName("client.ov")
    public static int[] field819 = new int[100];

    @ObfuscatedName("client.oc")
    public static int[] field820 = new int[100];

    @ObfuscatedName("client.or")
    public static int[] field661 = new int[100];

    @ObfuscatedName("client.ot")
    public static int[] field834 = new int[100];

    @ObfuscatedName("client.od")
    public static int field609 = 0;

    @ObfuscatedName("client.oz")
    public static long field824 = 0L;

    @ObfuscatedName("client.om")
    public static boolean field809 = true;

    @ObfuscatedName("client.ou")
    public static int[] field826 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.oj")
    public static int field630 = 0;

    @ObfuscatedName("client.pl")
    public static int field828 = 0;

    @ObfuscatedName("client.pe")
    public static String field829 = "";

    @ObfuscatedName("client.pt")
    public static long[] field619 = new long[100];

    @ObfuscatedName("client.pc")
    public static int field831 = 0;

    @ObfuscatedName("client.pj")
    public static int field841 = 0;

    @ObfuscatedName("client.py")
    public static int[] field833 = new int[128];

    @ObfuscatedName("client.pi")
    public static int[] field823 = new int[128];

    @ObfuscatedName("client.pr")
    public static long field835 = -1L;

    @ObfuscatedName("client.pa")
    public static int field836 = -1;

    @ObfuscatedName("client.pk")
    public static int field853 = 0;

    @ObfuscatedName("client.pq")
    public static int[] field838 = new int[1000];

    @ObfuscatedName("client.pv")
    public static int[] field855 = new int[1000];

    @ObfuscatedName("client.pw")
    public static class324[] field847 = new class324[1000];

    @ObfuscatedName("client.pz")
    public static int field825 = 0;

    @ObfuscatedName("client.pb")
    public static int field842 = 0;

    @ObfuscatedName("client.qo")
    public static int field843 = 0;

    @ObfuscatedName("client.qf")
    public static int field705 = 255;

    @ObfuscatedName("client.qg")
    public static int field845 = -1;

    @ObfuscatedName("client.qx")
    public static boolean field846 = false;

    @ObfuscatedName("client.qh")
    public static int field840 = 127;

    @ObfuscatedName("client.qk")
    public static int field755 = 127;

    @ObfuscatedName("client.qb")
    public static int field849 = 0;

    @ObfuscatedName("client.qs")
    public static int[] field850 = new int[50];

    @ObfuscatedName("client.qm")
    public static int[] field871 = new int[50];

    @ObfuscatedName("client.qy")
    public static int[] field852 = new int[50];

    @ObfuscatedName("client.qr")
    public static int[] field880 = new int[50];

    @ObfuscatedName("client.qc")
    public static class94[] field653 = new class94[50];

    @ObfuscatedName("client.qq")
    public static boolean field702 = false;

    @ObfuscatedName("client.rr")
    public static boolean[] field856 = new boolean[5];

    @ObfuscatedName("client.rd")
    public static int[] field857 = new int[5];

    @ObfuscatedName("client.rk")
    public static int[] field858 = new int[5];

    @ObfuscatedName("client.rx")
    public static int[] field859 = new int[5];

    @ObfuscatedName("client.rg")
    public static int[] field860 = new int[5];

    @ObfuscatedName("client.rp")
    public static short field724 = 256;

    @ObfuscatedName("client.rm")
    public static short field862 = 205;

    @ObfuscatedName("client.rw")
    public static short field863 = 256;

    @ObfuscatedName("client.rs")
    public static short field864 = 320;

    @ObfuscatedName("client.ru")
    public static short field865 = 1;

    @ObfuscatedName("client.rt")
    public static short field879 = 32767;

    @ObfuscatedName("client.rv")
    public static short field867 = 1;

    @ObfuscatedName("client.rc")
    public static short field881 = 32767;

    @ObfuscatedName("client.re")
    public static int field659 = 0;

    @ObfuscatedName("client.ra")
    public static int field713 = 0;

    @ObfuscatedName("client.rf")
    public static int field861 = 0;

    @ObfuscatedName("client.ry")
    public static int field753 = 0;

    @ObfuscatedName("client.rj")
    public static int field837 = 0;

    @ObfuscatedName("client.rb")
    public static class230 field851 = new class230();

    @ObfuscatedName("client.rn")
    public static int field625 = -1;

    @ObfuscatedName("client.rq")
    public static int field696 = -1;

    @ObfuscatedName("client.sq")
    public static class327 field877 = new class326();

    @ObfuscatedName("client.sp")
    public static class5[] field878 = new class5[8];

    @ObfuscatedName("client.sy")
    public static class63 field844 = new class63();

    @ObfuscatedName("client.sl")
    public static int field682 = -1;

    @ObfuscatedName("client.si")
    public static ArrayList field874 = new ArrayList(10);

    @ObfuscatedName("client.st")
    public static int field882 = 0;

    @ObfuscatedName("client.su")
    public static final class61 field883 = new class61();

    @ObfuscatedName("client.sb")
    public static int[] field884 = new int[50];

    @ObfuscatedName("client.sw")
    public static int[] field674 = new int[50];

    @ObfuscatedName("bd.eb(B)Llv;")
    public static class330 method990() {
        return Statics.field2074;
    }

    @ObfuscatedName("client.ao(I)V")
    public final void method736() {
    }

    public final void init() {
        if (!this.method716()) {
            return;
        }
        class282[] var1 = new class282[] { class282.field3645, class282.field3659, class282.field3657, class282.field3647, class282.field3644, class282.field3656, class282.field3643, class282.field3651, class282.field3658, class282.field3655, class282.field3646, class282.field3660, class282.field3649, class282.field3642, class282.field3650, class282.field3654, class282.field3648, class282.field3652 };
        class282[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class282 var4 = var2[var3];
            String var5 = this.getParameter(var4.field3653);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field3653)) {
                    case 2:
                        field611 = Integer.parseInt(var5);
                        break;
                    case 3:
                        int var6 = Integer.parseInt(var5);
                        class246[] var7 = class246.method2876();
                        int var8 = 0;
                        class246 var10;
                        while (true) {
                            if (var8 >= var7.length) {
                                var10 = null;
                                break;
                            }
                            class246 var9 = var7[var8];
                            if (var9.field3186 == var6) {
                                var10 = var9;
                                break;
                            }
                            var8++;
                        }
                        Statics.field14 = var10;
                        break;
                    case 4:
                        Statics.field553 = (class247) class180.method3213(class247.method1536(), Integer.parseInt(var5));
                        if (Statics.field553 == class247.field3191) {
                            Statics.field459 = class331.field3999;
                        } else {
                            Statics.field459 = class331.field3995;
                        }
                        break;
                    case 5:
                        Statics.field616 = var5;
                        break;
                    case 6:
                        field642 = Integer.parseInt(var5);
                        break;
                    case 7:
                        field740 = Integer.parseInt(var5) != 0;
                        break;
                    case 8:
                        if (var5.equalsIgnoreCase(class76.field1096)) {
                            field751 = true;
                        } else {
                            field751 = false;
                        }
                    case 9:
                    case 10:
                    case 11:
                    default:
                        break;
                    case 12:
                        Statics.field520 = var5;
                        break;
                    case 13:
                        if (field617 == -1) {
                            field617 = Integer.parseInt(var5);
                        }
                        break;
                    case 14:
                        if (var5.equalsIgnoreCase(class76.field1096)) {
                        }
                        break;
                    case 15:
                        field612 = Integer.parseInt(var5);
                        break;
                    case 16:
                        Statics.field2831 = Integer.parseInt(var5);
                        break;
                    case 17:
                        field610 = Integer.parseInt(var5);
                }
            }
        }
        method147();
        Statics.field398 = this.getCodeBase().getHost();
        String var11 = Statics.field14.field3188;
        byte var12 = 0;
        try {
            class158.method4236("oldschool", var11, var12, 18);
        } catch (Exception var14) {
            class155.method1834((String) null, var14);
        }
        Statics.field3284 = this;
        Statics.field1984 = field617;
        this.method820(765, 503, 175);
    }

    @ObfuscatedName("m.ew(B)V")
    public static final void method147() {
        class128.field1785 = false;
        field614 = false;
    }

    @ObfuscatedName("client.an(I)V")
    public final void method767() {
        int[] var1 = new int[] { 20, 260, 10000 };
        int[] var2 = new int[] { 1000, 100, 500 };
        if (var1 == null || var2 == null) {
            Statics.field2411 = null;
            Statics.field178 = null;
            Statics.field2412 = (byte[][][]) null;
        } else {
            Statics.field2411 = var1;
            Statics.field178 = new int[var1.length];
            Statics.field2412 = new byte[var1.length][][];
            for (int var3 = 0; var3 < Statics.field2411.length; var3++) {
                Statics.field2412[var3] = new byte[var2[var3]][];
            }
        }
        Statics.field132 = field612 == 0 ? 43594 : field610 + 40000;
        Statics.field604 = field612 == 0 ? 443 : field610 + 50000;
        Statics.field2089 = Statics.field132;
        Statics.field2630 = class231.field2638;
        Statics.field2631 = class231.field2637;
        Statics.field2624 = class231.field2639;
        Statics.field1072 = class231.field2640;
        Statics.field543 = new class138();
        this.method708();
        this.method809();
        Statics.field28 = this.method706();
        Statics.field1913 = new class165(255, class158.field2014, class158.field2008, 500000);
        Statics.field1159 = Statics.method4131();
        this.method778();
        String var5 = Statics.field3277;
        class46.field382 = this;
        if (var5 != null) {
            class46.field377 = var5;
        }
        if (field612 != 0) {
            field627 = true;
        }
        int var6 = Statics.field1159.field995;
        field824 = 0L;
        if (var6 >= 2) {
            field809 = true;
        } else {
            field809 = false;
        }
        if (method602() == 1) {
            Statics.field3284.method704(765, 503);
        } else {
            Statics.field3284.method704(7680, 2160);
        }
        if (field827 >= 25) {
            method1775();
        }
        Statics.field191 = new class69(Statics.field459);
    }

    @ObfuscatedName("client.ap(B)V")
    public final void method720() {
        field633++;
        this.method1295();
        while (true) {
            class208 var1 = class251.field3232;
            class248 var2;
            synchronized (class251.field3232) {
                var2 = (class248) class251.field3236.method3818();
            }
            if (var2 == null) {
                try {
                    if (class220.field2525 == 1) {
                        int var4 = Statics.field2522.method3911();
                        if (var4 > 0 && Statics.field2522.method3916()) {
                            int var5 = var4 - Statics.field9;
                            if (var5 < 0) {
                                var5 = 0;
                            }
                            Statics.field2522.method3910(var5);
                        } else {
                            Statics.field2522.method3925();
                            Statics.field2522.method3992();
                            if (Statics.field3278 == null) {
                                class220.field2525 = 0;
                            } else {
                                class220.field2525 = 2;
                            }
                            Statics.field2520 = null;
                            Statics.field1102 = null;
                        }
                    }
                } catch (Exception var17) {
                    var17.printStackTrace();
                    Statics.field2522.method3925();
                    class220.field2525 = 0;
                    Statics.field2520 = null;
                    Statics.field1102 = null;
                    Statics.field3278 = null;
                }
                method450();
                class40 var7 = class40.field340;
                synchronized (class40.field340) {
                    class40.field348++;
                    class40.field345 = class40.field347;
                    class40.field344 = 0;
                    if (class40.field351 >= 0) {
                        while (class40.field351 != class40.field339) {
                            int var9 = class40.field338[class40.field339];
                            class40.field339 = class40.field339 + 1 & 0x7F;
                            if (var9 < 0) {
                                class40.field328[~var9] = false;
                            } else {
                                if (!class40.field328[var9] && class40.field344 < class40.field343.length - 1) {
                                    class40.field343[++class40.field344 - 1] = var9;
                                }
                                class40.field328[var9] = true;
                            }
                        }
                    } else {
                        for (int var8 = 0; var8 < 112; var8++) {
                            class40.field328[var8] = false;
                        }
                        class40.field351 = class40.field339;
                    }
                    if (class40.field344 > 0) {
                        class40.field348 = 0;
                    }
                    class40.field347 = class40.field346;
                }
                class49 var11 = class49.field428;
                synchronized (class49.field428) {
                    class49.field434 = class49.field430;
                    class49.field437 = class49.field431;
                    class49.field439 = class49.field432;
                    class49.field438 = class49.field433;
                    class49.field426 = class49.field441;
                    class49.field443 = class49.field442;
                    class49.field444 = class49.field440;
                    class49.field445 = class49.field425;
                    class49.field441 = 0;
                }
                if (Statics.field28 != null) {
                    int var13 = Statics.field28.method615();
                    field634 = var13;
                }
                if (field827 == 0) {
                    method2322();
                    class48.method1390();
                } else if (field827 == 5) {
                    class80.method1463(this);
                    method2322();
                    class48.method1390();
                } else if (field827 == 10 || field827 == 11) {
                    class80.method1463(this);
                } else if (field827 == 20) {
                    class80.method1463(this);
                    this.method1088();
                } else if (field827 == 25) {
                    method5102();
                }
                if (field827 == 30) {
                    this.method1089();
                } else if (field827 == 40 || field827 == 45) {
                    this.method1088();
                }
                return;
            }
            var2.field3203.method4371(var2.field3205, (int) var2.field2486, var2.field3201, false);
        }
    }

    @ObfuscatedName("client.am(ZI)V")
    public final void method810(boolean arg0) {
        boolean var2;
        label152: {
            try {
                if (class220.field2525 == 2) {
                    if (Statics.field2520 == null) {
                        Statics.field2520 = class226.method4090(Statics.field3278, Statics.field2524, Statics.field522);
                        if (Statics.field2520 == null) {
                            var2 = false;
                            break label152;
                        }
                    }
                    if (Statics.field1102 == null) {
                        Statics.field1102 = new class101(Statics.field353, Statics.field2521);
                    }
                    if (Statics.field2522.method3928(Statics.field2520, Statics.field2526, Statics.field1102, 22050)) {
                        Statics.field2522.method3932();
                        Statics.field2522.method3910(Statics.field312);
                        Statics.field2522.method3934(Statics.field2520, Statics.field605);
                        class220.field2525 = 0;
                        Statics.field2520 = null;
                        Statics.field1102 = null;
                        Statics.field3278 = null;
                        var2 = true;
                        break label152;
                    }
                }
            } catch (Exception var11) {
                var11.printStackTrace();
                Statics.field2522.method3925();
                class220.field2525 = 0;
                Statics.field2520 = null;
                Statics.field1102 = null;
                Statics.field3278 = null;
            }
            var2 = false;
        }
        if (var2 && field846 && Statics.field300 != null) {
            Statics.field300.method2042();
        }
        if ((field827 == 10 || field827 == 20 || field827 == 30) && field824 != 0L && class187.method2864() > field824) {
            int var5 = method602();
            field824 = 0L;
            if (var5 >= 2) {
                field809 = true;
            } else {
                field809 = false;
            }
            if (method602() == 1) {
                Statics.field3284.method704(765, 503);
            } else {
                Statics.field3284.method704(7680, 2160);
            }
            if (field827 >= 25) {
                method1775();
            }
        }
        if (arg0) {
            for (int var6 = 0; var6 < 100; var6++) {
                field875[var6] = true;
            }
        }
        if (field827 == 0) {
            this.method780(class80.field1156, class80.field1148, arg0);
        } else if (field827 == 5) {
            class80.method3162(Statics.field66, Statics.field447, Statics.field1941, arg0);
        } else if (field827 == 10 || field827 == 11) {
            class80.method3162(Statics.field66, Statics.field447, Statics.field1941, arg0);
        } else if (field827 == 20) {
            class80.method3162(Statics.field66, Statics.field447, Statics.field1941, arg0);
        } else if (field827 == 25) {
            if (field666 == 1) {
                if (field683 > field663) {
                    field663 = field683;
                }
                int var7 = (field663 * 50 - field683 * 50) / field663;
                method1066(class240.field3122 + class76.field1093 + class76.field1089 + var7 + "%" + class76.field1090, false);
            } else if (field666 == 2) {
                if (field615 > field665) {
                    field665 = field615;
                }
                int var8 = (field665 * 50 - field615 * 50) / field665 + 50;
                method1066(class240.field3122 + class76.field1093 + class76.field1089 + var8 + "%" + class76.field1090, false);
            } else {
                method1066(class240.field3122, false);
            }
        } else if (field827 == 30) {
            this.method1092();
        } else if (field827 == 40) {
            method1066(class240.field3116 + class76.field1093 + class240.field2855, false);
        } else if (field827 == 45) {
            method1066(class240.field3004, false);
        }
        if (field827 == 30 && field609 == 0 && !arg0 && !field809) {
            for (int var9 = 0; var9 < field814; var9++) {
                if (field817[var9]) {
                    Statics.field3231.method698(field819[var9], field820[var9], field661[var9], field834[var9]);
                    field817[var9] = false;
                }
            }
        } else if (field827 > 0) {
            Statics.field3231.method688(0, 0);
            for (int var10 = 0; var10 < field814; var10++) {
                field817[var10] = false;
            }
        }
    }

    @ObfuscatedName("client.ae(I)V")
    public final void method731() {
        if (Statics.field3612.method1811()) {
            Statics.field3612.method1823();
        }
        if (Statics.field1933 != null) {
            Statics.field1933.field557 = false;
        }
        Statics.field1933 = null;
        field798.method1900();
        if (class40.field340 != null) {
            class40 var1 = class40.field340;
            synchronized (class40.field340) {
                class40.field340 = null;
            }
        }
        class49.method438();
        Statics.field28 = null;
        if (Statics.field300 != null) {
            Statics.field300.method2043();
        }
        if (Statics.field352 != null) {
            Statics.field352.method2043();
        }
        class253.method881();
        class251.method77();
        if (Statics.field543 != null) {
            Statics.field543.method2880();
            Statics.field543 = null;
        }
        class158.method299();
    }

    @ObfuscatedName("cf.ea(II)V")
    public static void method1776(int arg0) {
        if (field827 == arg0) {
            return;
        }
        if (field827 == 0) {
            Statics.field3284.method729();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field643 = 0;
            field644 = 0;
            field645 = 0;
            field660.method4883(arg0);
            if (arg0 != 20) {
                method1013(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field523 != null) {
            Statics.field523.method3098();
            Statics.field523 = null;
        }
        if (field827 == 25) {
            field666 = 0;
            field683 = 0;
            field663 = 1;
            field615 = 0;
            field665 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            Statics.method3902(Statics.field963, Statics.field366, true, 0);
        } else if (arg0 == 20) {
            Statics.method3902(Statics.field963, Statics.field366, true, field827 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            Statics.method3902(Statics.field963, Statics.field366, false, 4);
        } else if (Statics.field1130) {
            Statics.field94 = null;
            Statics.field1123 = null;
            Statics.field3712 = null;
            Statics.field1124 = null;
            Statics.field2296 = null;
            Statics.field364 = null;
            Statics.field1125 = null;
            Statics.field1126 = null;
            Statics.field485 = null;
            Statics.field298 = null;
            Statics.field3353 = null;
            Statics.field2029 = null;
            Statics.field135 = null;
            Statics.field888 = null;
            Statics.field2450 = null;
            Statics.field1147 = null;
            Statics.field2447 = null;
            Statics.field3698 = null;
            Statics.field3199 = null;
            Statics.field1128 = null;
            Statics.field2619 = null;
            Statics.field3674 = null;
            class220.method3122(2);
            class253.method300(true);
            Statics.field1130 = false;
        }
        field827 = arg0;
    }

    @ObfuscatedName("client.es(I)V")
    public void method1295() {
        if (field827 != 1000) {
            boolean var1 = class253.method5082();
            if (!var1) {
                this.method1086();
            }
        }
    }

    @ObfuscatedName("client.fc(I)V")
    public void method1086() {
        if (class253.field3253 >= 4) {
            this.method744("js5crc");
            field827 = 1000;
            return;
        }
        if (class253.field3265 >= 4) {
            if (field827 <= 5) {
                this.method744("js5io");
                field827 = 1000;
                return;
            }
            field641 = 3000;
            class253.field3265 = 3;
        }
        if (--field641 + 1 > 0) {
            return;
        }
        try {
            if (field656 == 0) {
                Statics.field3184 = Statics.field392.method3057(Statics.field398, Statics.field2089);
                field656++;
            }
            if (field656 == 1) {
                if (Statics.field3184.field1992 == 2) {
                    this.method1087(-1);
                    return;
                }
                if (Statics.field3184.field1992 == 1) {
                    field656++;
                }
            }
            if (field656 == 2) {
                if (field740) {
                    Statics.field506 = class160.method1003((Socket) Statics.field3184.field1989, 40000, 5000);
                } else {
                    Statics.field506 = new class164((Socket) Statics.field3184.field1989, Statics.field392, 5000);
                }
                class185 var1 = new class185(5);
                var1.method3531(15);
                var1.method3528(175);
                Statics.field506.method3094(var1.field2399, 0, 5);
                field656++;
                Statics.field23 = class187.method2864();
            }
            if (field656 == 3) {
                if (Statics.field506.method3087() > 0 || !field740 && field827 <= 5) {
                    int var2 = Statics.field506.method3088();
                    if (var2 != 0) {
                        this.method1087(var2);
                        return;
                    }
                    field656++;
                } else if (class187.method2864() - Statics.field23 > 30000L) {
                    this.method1087(-2);
                    return;
                }
            }
            if (field656 == 4) {
                class160 var3 = Statics.field506;
                boolean var4 = field827 > 20;
                if (Statics.field3255 != null) {
                    try {
                        Statics.field3255.method3098();
                    } catch (Exception var14) {
                    }
                    Statics.field3255 = null;
                }
                Statics.field3255 = var3;
                class253.method300(var4);
                class253.field3259.field2397 = 0;
                Statics.field1762 = null;
                Statics.field78 = null;
                class253.field3260 = 0;
                while (true) {
                    class249 var6 = (class249) class253.field3252.method3766();
                    if (var6 == null) {
                        while (true) {
                            class249 var7 = (class249) class253.field3257.method3766();
                            if (var7 == null) {
                                if (class253.field3263 != 0) {
                                    try {
                                        class185 var8 = new class185(4);
                                        var8.method3531(4);
                                        var8.method3531(class253.field3263);
                                        var8.method3449(0);
                                        Statics.field3255.method3094(var8.field2399, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field3255.method3098();
                                        } catch (Exception var12) {
                                        }
                                        class253.field3265++;
                                        Statics.field3255 = null;
                                    }
                                }
                                class253.field3258 = 0;
                                Statics.field3249 = class187.method2864();
                                Statics.field3184 = null;
                                Statics.field506 = null;
                                field656 = 0;
                                field707 = 0;
                                return;
                            }
                            class253.field3262.method3682(var7);
                            class253.field3261.method3761(var7, var7.field2486);
                            class253.field3256++;
                            class253.field3248--;
                        }
                    }
                    class253.field3250.method3761(var6, var6.field2486);
                    class253.field3251++;
                    class253.field3247--;
                }
            }
        } catch (IOException var15) {
            this.method1087(-3);
        }
    }

    @ObfuscatedName("client.fk(II)V")
    public void method1087(int arg0) {
        Statics.field3184 = null;
        Statics.field506 = null;
        field656 = 0;
        if (Statics.field2089 == Statics.field132) {
            Statics.field2089 = Statics.field604;
        } else {
            Statics.field2089 = Statics.field132;
        }
        field707++;
        if (field707 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field827 <= 5) {
                this.method744("js5connect_full");
                field827 = 1000;
            } else {
                field641 = 3000;
            }
        } else if (field707 >= 2 && arg0 == 6) {
            this.method744("js5connect_outofdate");
            field827 = 1000;
        } else if (field707 >= 4) {
            if (field827 <= 5) {
                this.method744("js5connect");
                field827 = 1000;
            } else {
                field641 = 3000;
            }
        }
    }

    @ObfuscatedName("cu.fi(Lis;Ljava/lang/String;I)V")
    public static void method1899(class252 arg0, String arg1) {
        class54 var2 = new class54(arg0, arg1);
        field874.add(var2);
    }

    @ObfuscatedName("br.fx(I)Z")
    public static boolean method1724() {
        if (field874 == null || field882 >= field874.size()) {
            return true;
        }
        while (field882 < field874.size()) {
            class54 var0 = (class54) field874.get(field882);
            if (!var0.method940()) {
                return false;
            }
            field882++;
        }
        return true;
    }

    @ObfuscatedName("dc.fa(I)V")
    public static void method2322() {
        if (field639 == 0) {
            Statics.field186 = new class128(4, 104, 104, class51.field460);
            for (int var0 = 0; var0 < 4; var0++) {
                field767[var0] = new class167(104, 104);
            }
            Statics.field163 = new class324(512, 512);
            class80.field1148 = class240.field3065;
            class80.field1156 = 5;
            field639 = 20;
        } else if (field639 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class125.field1742[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class128.method2716(var1, 500, 800, 512, 334);
            class80.field1148 = class240.field2857;
            class80.field1156 = 10;
            field639 = 30;
        } else if (field639 == 30) {
            Statics.field449 = method761(0, false, true, true);
            Statics.field304 = method761(1, false, true, true);
            Statics.field1917 = method761(2, true, false, true);
            Statics.field2345 = method761(3, false, true, true);
            Statics.field38 = method761(4, false, true, true);
            Statics.field3315 = method761(5, true, true, true);
            Statics.field2612 = method761(6, true, true, true);
            Statics.field2512 = method761(7, false, true, true);
            Statics.field366 = method761(8, false, true, true);
            Statics.field2030 = method761(9, false, true, true);
            Statics.field963 = method761(10, false, true, true);
            Statics.field1500 = method761(11, false, true, true);
            Statics.field568 = method761(12, false, true, true);
            Statics.field112 = method761(13, true, false, true);
            Statics.field238 = method761(14, false, true, true);
            Statics.field1241 = method761(15, false, true, true);
            Statics.field306 = method761(16, true, true, true);
            Statics.field1025 = method761(17, true, true, true);
            class80.field1148 = class240.field2858;
            class80.field1156 = 20;
            field639 = 40;
        } else if (field639 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field449.method4367() * 4 / 100;
            int var8 = var7 + Statics.field304.method4367() * 4 / 100;
            int var9 = var8 + Statics.field1917.method4367() * 2 / 100;
            int var10 = var9 + Statics.field2345.method4367() * 2 / 100;
            int var11 = var10 + Statics.field38.method4367() * 6 / 100;
            int var12 = var11 + Statics.field3315.method4367() * 4 / 100;
            int var13 = var12 + Statics.field2612.method4367() * 2 / 100;
            int var14 = var13 + Statics.field2512.method4367() * 57 / 100;
            int var15 = var14 + Statics.field366.method4367() * 2 / 100;
            int var16 = var15 + Statics.field2030.method4367() * 2 / 100;
            int var17 = var16 + Statics.field963.method4367() * 2 / 100;
            int var18 = var17 + Statics.field1500.method4367() * 2 / 100;
            int var19 = var18 + Statics.field568.method4367() * 2 / 100;
            int var20 = var19 + Statics.field112.method4367() * 2 / 100;
            int var21 = var20 + Statics.field238.method4367() * 2 / 100;
            int var22 = var21 + Statics.field1241.method4367() * 2 / 100;
            int var23 = var22 + Statics.field306.method4367() * 2 / 100;
            int var24 = var23 + (Statics.field1025.method4366() && Statics.field1025.method4287() ? 1 : 0);
            if (var24 == 100) {
                method1899(Statics.field449, "Animations");
                method1899(Statics.field304, "Skeletons");
                method1899(Statics.field38, "Sound FX");
                method1899(Statics.field3315, "Maps");
                method1899(Statics.field2612, "Music Tracks");
                method1899(Statics.field2512, "Models");
                method1899(Statics.field366, "Sprites");
                method1899(Statics.field1500, "Music Jingles");
                method1899(Statics.field238, "Music Samples");
                method1899(Statics.field1241, "Music Patches");
                method1899(Statics.field306, "World Map");
                Statics.field1936 = new class312();
                Statics.field1936.method5266(Statics.field1025);
                class80.field1148 = class240.field2860;
                class80.field1156 = 30;
                field639 = 45;
            } else {
                if (var24 != 0) {
                    class80.field1148 = class240.field2859 + var24 + "%";
                }
                class80.field1156 = 30;
            }
        } else if (field639 == 45) {
            class98.method211(22050, !field614, 2);
            class221 var25 = new class221();
            var25.method3913(9, 128);
            Statics.field300 = class98.method1717(Statics.field392, 0, 22050);
            Statics.field300.method2039(var25);
            class252 var26 = Statics.field1241;
            class252 var27 = Statics.field238;
            class252 var28 = Statics.field38;
            Statics.field2526 = var26;
            Statics.field2521 = var27;
            Statics.field353 = var28;
            Statics.field2522 = var25;
            Statics.field352 = class98.method1717(Statics.field392, 1, 2048);
            Statics.field2095 = new class91();
            Statics.field352.method2039(Statics.field2095);
            Statics.field1053 = new class105(22050, Statics.field3801);
            class80.field1148 = class240.field3045;
            class80.field1156 = 35;
            field639 = 50;
            Statics.field1044 = new class299(Statics.field366, Statics.field112);
        } else if (field639 == 50) {
            class298[] var29 = new class298[] { class298.field3736, class298.field3733, class298.field3735, class298.field3731, class298.field3739, class298.field3730 };
            int var30 = var29.length;
            class299 var31 = Statics.field1044;
            class298[] var32 = new class298[] { class298.field3736, class298.field3733, class298.field3735, class298.field3731, class298.field3739, class298.field3730 };
            field869 = var31.method5105(var32);
            if (field869.size() < var30) {
                class80.field1148 = class240.field2862 + field869.size() * 100 / var30 + "%";
                class80.field1156 = 40;
            } else {
                Statics.field447 = (class301) field869.get(class298.field3730);
                Statics.field1941 = (class301) field869.get(class298.field3731);
                Statics.field66 = (class301) field869.get(class298.field3739);
                Statics.field261 = field877.method5607();
                class80.field1148 = class240.field3093;
                class80.field1156 = 40;
                field639 = 60;
            }
        } else if (field639 == 60) {
            int var33 = class80.method3068(Statics.field963, Statics.field366);
            byte var34 = 11;
            if (var33 < var34) {
                class80.field1148 = class240.field2864 + var33 * 100 / var34 + "%";
                class80.field1156 = 50;
            } else {
                class80.field1148 = class240.field2865;
                class80.field1156 = 50;
                method1776(5);
                field639 = 70;
            }
        } else if (field639 == 70) {
            if (Statics.field1917.method4287()) {
                class275.method14(Statics.field1917);
                class252 var36 = Statics.field1917;
                Statics.field3337 = var36;
                class252 var37 = Statics.field1917;
                class252 var38 = Statics.field2512;
                Statics.field3350 = var37;
                Statics.field3346 = var38;
                Statics.field3347 = Statics.field3350.method4279(3);
                class252 var39 = Statics.field1917;
                class252 var40 = Statics.field2512;
                boolean var41 = field614;
                Statics.field3432 = var39;
                Statics.field60 = var40;
                class271.field3442 = var41;
                class274.method4248(Statics.field1917, Statics.field2512);
                class252 var42 = Statics.field1917;
                Statics.field3390 = var42;
                class252 var43 = Statics.field1917;
                class252 var44 = Statics.field2512;
                boolean var45 = field751;
                class301 var46 = Statics.field447;
                Statics.field2454 = var43;
                Statics.field3484 = var44;
                Statics.field1231 = var45;
                Statics.field3500 = Statics.field2454.method4279(10);
                Statics.field3489 = var46;
                class252 var47 = Statics.field1917;
                class252 var48 = Statics.field449;
                class252 var49 = Statics.field304;
                Statics.field3611 = var47;
                Statics.field3593 = var48;
                Statics.field3594 = var49;
                class261.method4247(Statics.field1917, Statics.field2512);
                class252 var50 = Statics.field1917;
                Statics.field4 = var50;
                class252 var51 = Statics.field1917;
                Statics.field3288 = var51;
                Statics.field3286 = Statics.field3288.method4279(16);
                class252 var52 = Statics.field2345;
                class252 var53 = Statics.field2512;
                class252 var54 = Statics.field366;
                class252 var55 = Statics.field112;
                Statics.field3793 = var52;
                Statics.field489 = var53;
                Statics.field2096 = var54;
                Statics.field3782 = var55;
                Statics.field2763 = new class233[Statics.field3793.method4280()][];
                Statics.field3614 = new boolean[Statics.field3793.method4280()];
                class256.method3288(Statics.field1917);
                class269.method1723(Statics.field1917);
                class252 var56 = Statics.field1917;
                Statics.field3312 = var56;
                class252 var57 = Statics.field1917;
                Statics.field3319 = var57;
                class267.method2878(Statics.field1917);
                Statics.field3612 = new class85();
                Statics.method4130(Statics.field1917, Statics.field366, Statics.field112);
                class252 var58 = Statics.field1917;
                class252 var59 = Statics.field366;
                Statics.field2354 = var58;
                Statics.field3367 = var59;
                class252 var60 = Statics.field1917;
                class252 var61 = Statics.field366;
                Statics.field3304 = var61;
                if (var60.method4287()) {
                    Statics.field3291 = var60.method4279(35);
                    Statics.field368 = new class258[Statics.field3291];
                    for (int var62 = 0; var62 < Statics.field3291; var62++) {
                        byte[] var63 = var60.method4267(35, var62);
                        Statics.field368[var62] = new class258(var62);
                        if (var63 != null) {
                            Statics.field368[var62].method4449(new class185(var63));
                            Statics.field368[var62].method4451();
                        }
                    }
                }
                class80.field1148 = class240.field2867;
                class80.field1156 = 60;
                field639 = 80;
            } else {
                class80.field1148 = class240.field2866 + Statics.field1917.method4375() + "%";
                class80.field1156 = 60;
            }
        } else if (field639 == 80) {
            int var64 = 0;
            if (Statics.field22 == null) {
                Statics.field22 = class325.method149(Statics.field366, Statics.field1936.field3807, 0);
            } else {
                var64++;
            }
            if (Statics.field18 == null) {
                Statics.field18 = class325.method149(Statics.field366, Statics.field1936.field3817, 0);
            } else {
                var64++;
            }
            if (Statics.field1931 == null) {
                Statics.field1931 = class325.method4261(Statics.field366, Statics.field1936.field3809, 0);
            } else {
                var64++;
            }
            if (Statics.field123 == null) {
                Statics.field123 = class325.method2896(Statics.field366, Statics.field1936.field3810, 0);
            } else {
                var64++;
            }
            if (Statics.field903 == null) {
                Statics.field903 = class325.method2896(Statics.field366, Statics.field1936.field3811, 0);
            } else {
                var64++;
            }
            if (Statics.field1914 == null) {
                Statics.field1914 = class325.method2896(Statics.field366, Statics.field1936.field3812, 0);
            } else {
                var64++;
            }
            if (Statics.field1022 == null) {
                Statics.field1022 = class325.method2896(Statics.field366, Statics.field1936.field3808, 0);
            } else {
                var64++;
            }
            if (Statics.field2645 == null) {
                Statics.field2645 = class325.method2896(Statics.field366, Statics.field1936.field3814, 0);
            } else {
                var64++;
            }
            if (Statics.field41 == null) {
                Statics.field41 = class325.method2896(Statics.field366, Statics.field1936.field3815, 0);
            } else {
                var64++;
            }
            if (Statics.field1012 == null) {
                Statics.field1012 = class325.method4261(Statics.field366, Statics.field1936.field3816, 0);
            } else {
                var64++;
            }
            if (Statics.field251 == null) {
                Statics.field251 = class325.method4261(Statics.field366, Statics.field1936.field3813, 0);
            } else {
                var64++;
            }
            if (var64 < 11) {
                class80.field1148 = class240.field2868 + var64 * 100 / 12 + "%";
                class80.field1156 = 70;
            } else {
                Statics.field3759 = Statics.field251;
                Statics.field18.method5452();
                int var65 = (int) (Math.random() * 21.0D) - 10;
                int var66 = (int) (Math.random() * 21.0D) - 10;
                int var67 = (int) (Math.random() * 21.0D) - 10;
                int var68 = (int) (Math.random() * 41.0D) - 20;
                Statics.field1931[0].method5428(var65 + var68, var66 + var68, var67 + var68);
                class80.field1148 = class240.field2869;
                class80.field1156 = 70;
                field639 = 90;
            }
        } else if (field639 == 90) {
            if (Statics.field2030.method4287()) {
                Statics.field118 = new class114(Statics.field2030, Statics.field366, 20, 0.8D, field614 ? 64 : 128);
                class125.method2600(Statics.field118);
                class125.method2606(0.8D);
                field639 = 100;
            } else {
                class80.field1148 = class240.field2940 + "0%";
                class80.field1156 = 90;
            }
        } else if (field639 == 100) {
            int var69 = Statics.field118.method2353();
            if (var69 < 100) {
                class80.field1148 = class240.field2940 + var69 + "%";
                class80.field1156 = 90;
            } else {
                class80.field1148 = class240.field3052;
                class80.field1156 = 90;
                field639 = 110;
            }
        } else if (field639 == 110) {
            Statics.field1933 = new class59();
            Statics.field392.method3052(Statics.field1933, 10);
            class80.field1148 = class240.field2959;
            class80.field1156 = 92;
            field639 = 120;
        } else if (field639 == 120) {
            if (Statics.field963.method4289("huffman", "")) {
                class177 var70 = new class177(Statics.field963.method4317("huffman", ""));
                Statics.field3773 = var70;
                class80.field1148 = class240.field2874;
                class80.field1156 = 94;
                field639 = 130;
            } else {
                class80.field1148 = class240.field2873 + "%";
                class80.field1156 = 94;
            }
        } else if (field639 == 130) {
            if (!Statics.field2345.method4287()) {
                class80.field1148 = class240.field2999 + Statics.field2345.method4375() * 4 / 5 + "%";
                class80.field1156 = 96;
            } else if (!Statics.field568.method4287()) {
                class80.field1148 = class240.field2999 + (80 + Statics.field568.method4375() / 6) + "%";
                class80.field1156 = 96;
            } else if (Statics.field112.method4287()) {
                class80.field1148 = class240.field2920;
                class80.field1156 = 98;
                field639 = 140;
            } else {
                class80.field1148 = class240.field2999 + (96 + Statics.field112.method4375() / 50) + "%";
                class80.field1156 = 96;
            }
        } else if (field639 == 140) {
            class80.field1156 = 100;
            if (Statics.field306.method4269(class30.field254.field257)) {
                if (Statics.field2074 == null) {
                    Statics.field2074 = new class330();
                    Statics.field2074.method5628(Statics.field306, Statics.field66, field869, Statics.field1931);
                }
                int var71 = Statics.field2074.method5629();
                if (var71 < 100) {
                    class80.field1148 = class240.field2877 + (var71 * 9 / 10 + 10) + "%";
                } else {
                    class80.field1148 = class240.field3135;
                    field639 = 150;
                }
            } else {
                class80.field1148 = class240.field2877 + Statics.field306.method4292(class30.field254.field257) / 10 + "%";
            }
        } else if (field639 == 150) {
            method1776(10);
        }
    }

    @ObfuscatedName("ai.fu(IZZZI)Lis;")
    public static class252 method761(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class165 var4 = null;
        if (class158.field2014 != null) {
            var4 = new class165(arg0, class158.field2014, Statics.field1060[arg0], 1000000);
        }
        return new class252(var4, Statics.field1913, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.fz(I)V")
    public final void method1088() {
        class160 var1 = field798.method1888();
        class192 var2 = field798.field1266;
        try {
            if (field643 == 0) {
                if (Statics.field1166 == null && (field649.method1778() || field644 > 250)) {
                    Statics.field1166 = field649.method1779();
                    field649.method1777();
                    field649 = null;
                }
                if (Statics.field1166 != null) {
                    if (var1 != null) {
                        var1.method3098();
                        var1 = null;
                    }
                    Statics.field2353 = null;
                    field658 = false;
                    field644 = 0;
                    field643 = 1;
                }
            }
            if (field643 == 1) {
                if (Statics.field2353 == null) {
                    Statics.field2353 = Statics.field392.method3057(Statics.field398, Statics.field2089);
                }
                if (Statics.field2353.field1992 == 2) {
                    throw new IOException();
                }
                if (Statics.field2353.field1992 == 1) {
                    if (field740) {
                        var1 = class160.method1003((Socket) Statics.field2353.field1989, 40000, 5000);
                    } else {
                        var1 = new class164((Socket) Statics.field2353.field1989, Statics.field392, 5000);
                    }
                    field798.method1885(var1);
                    Statics.field2353 = null;
                    field643 = 2;
                }
            }
            if (field643 == 2) {
                field798.method1882();
                class175 var3;
                if (class175.field2319 == 0) {
                    var3 = new class175();
                } else {
                    var3 = class175.field2322[--class175.field2319];
                }
                var3.field2318 = null;
                var3.field2315 = 0;
                var3.field2323 = new class192(5000);
                var3.field2323.method3531(class173.field2297.field2294);
                field798.method1884(var3);
                field798.method1883();
                var2.field2397 = 0;
                field643 = 3;
            }
            if (field643 == 3) {
                if (Statics.field300 != null) {
                    Statics.field300.method2041();
                }
                if (Statics.field352 != null) {
                    Statics.field352.method2041();
                }
                boolean var7 = true;
                if (field740 && !var1.method3085(1)) {
                    var7 = false;
                }
                if (var7) {
                    int var8 = var1.method3088();
                    if (Statics.field300 != null) {
                        Statics.field300.method2041();
                    }
                    if (Statics.field352 != null) {
                        Statics.field352.method2041();
                    }
                    if (var8 != 0) {
                        method144(var8);
                        return;
                    }
                    var2.field2397 = 0;
                    field643 = 4;
                }
            }
            if (field643 == 4) {
                if (var2.field2397 < 8) {
                    int var9 = var1.method3087();
                    if (var9 > 8 - var2.field2397) {
                        var9 = 8 - var2.field2397;
                    }
                    if (var9 > 0) {
                        var1.method3089(var2.field2399, var2.field2397, var9);
                        var2.field2397 += var9;
                    }
                }
                if (var2.field2397 == 8) {
                    var2.field2397 = 0;
                    Statics.field126 = var2.method3505();
                    field643 = 5;
                }
            }
            if (field643 == 5) {
                field798.field1266.field2397 = 0;
                field798.method1882();
                class192 var10 = new class192(500);
                int[] var11 = new int[] { Statics.field1166.nextInt(), Statics.field1166.nextInt(), Statics.field1166.nextInt(), Statics.field1166.nextInt() };
                var10.field2397 = 0;
                var10.method3531(1);
                var10.method3528(var11[0]);
                var10.method3528(var11[1]);
                var10.method3528(var11[2]);
                var10.method3528(var11[3]);
                var10.method3312(Statics.field126);
                if (field827 == 40) {
                    var10.method3528(Statics.field1716[0]);
                    var10.method3528(Statics.field1716[1]);
                    var10.method3528(Statics.field1716[2]);
                    var10.method3528(Statics.field1716[3]);
                } else {
                    var10.method3531(field647.method179());
                    switch(field647.field1948) {
                        case 0:
                        case 1:
                            var10.method3321(Statics.field1129);
                            var10.field2397++;
                            break;
                        case 2:
                            var10.method3528((Integer) Statics.field1159.field994.get(class308.method2961(class80.field1146)));
                            break;
                        case 3:
                            var10.field2397 += 4;
                    }
                    var10.method3531(class313.field3820.method179());
                    var10.method3314(class80.field1149);
                }
                var10.method3447(class78.field1108, class78.field1104);
                Statics.field1716 = var11;
                class175 var12;
                if (class175.field2319 == 0) {
                    var12 = new class175();
                } else {
                    var12 = class175.field2322[--class175.field2319];
                }
                var12.field2318 = null;
                var12.field2315 = 0;
                var12.field2323 = new class192(5000);
                var12.field2323.field2397 = 0;
                if (field827 == 40) {
                    var12.field2323.method3531(class173.field2293.field2294);
                } else {
                    var12.field2323.method3531(class173.field2292.field2294);
                }
                var12.field2323.method3449(0);
                int var16 = var12.field2323.field2397;
                var12.field2323.method3528(175);
                var12.field2323.method3396(var10.field2399, 0, var10.field2397);
                int var17 = var12.field2323.field2397;
                var12.field2323.method3314(class80.field1146);
                var12.field2323.method3531((field809 ? 1 : 0) << 1 | (field614 ? 1 : 0));
                var12.field2323.method3449(Statics.field2097);
                var12.field2323.method3449(Statics.field3800);
                class192 var18 = var12.field2323;
                if (field650 == null) {
                    byte[] var19 = class158.method133();
                    var18.method3396(var19, 0, var19.length);
                } else {
                    var18.method3396(field650, 0, field650.length);
                }
                var12.field2323.method3314(Statics.field616);
                var12.field2323.method3528(Statics.field2831);
                class185 var20 = new class185(Statics.field261.method5611());
                Statics.field261.method5610(var20);
                var12.field2323.method3396(var20.field2399, 0, var20.field2399.length);
                var12.field2323.method3531(field617);
                var12.field2323.method3528(0);
                var12.field2323.method3528(Statics.field449.field3230);
                var12.field2323.method3528(Statics.field304.field3230);
                var12.field2323.method3528(Statics.field1917.field3230);
                var12.field2323.method3528(Statics.field2345.field3230);
                var12.field2323.method3528(Statics.field38.field3230);
                var12.field2323.method3528(Statics.field3315.field3230);
                var12.field2323.method3528(Statics.field2612.field3230);
                var12.field2323.method3528(Statics.field2512.field3230);
                var12.field2323.method3528(Statics.field366.field3230);
                var12.field2323.method3528(Statics.field2030.field3230);
                var12.field2323.method3528(Statics.field963.field3230);
                var12.field2323.method3528(Statics.field1500.field3230);
                var12.field2323.method3528(Statics.field568.field3230);
                var12.field2323.method3528(Statics.field112.field3230);
                var12.field2323.method3528(Statics.field238.field3230);
                var12.field2323.method3528(Statics.field1241.field3230);
                var12.field2323.method3528(Statics.field306.field3230);
                var12.field2323.method3528(Statics.field1025.field3230);
                var12.field2323.method3344(var11, var17, var12.field2323.field2397);
                var12.field2323.method3494(var12.field2323.field2397 - var16);
                field798.method1884(var12);
                field798.method1883();
                field798.field1265 = new class193(var11);
                int[] var21 = new int[4];
                for (int var22 = 0; var22 < 4; var22++) {
                    var21[var22] = var11[var22] + 50;
                }
                var2.method3588(var21);
                field643 = 6;
            }
            if (field643 == 6 && var1.method3087() > 0) {
                int var23 = var1.method3088();
                if (var23 == 21 && field827 == 20) {
                    field643 = 9;
                } else if (var23 == 2) {
                    field643 = 11;
                } else if (var23 == 15 && field827 == 40) {
                    field798.field1268 = -1;
                    field643 = 16;
                } else if (var23 == 64) {
                    field643 = 7;
                } else if (var23 == 23 && field645 < 1) {
                    field645++;
                    field643 = 0;
                } else if (var23 == 29) {
                    field643 = 14;
                } else {
                    method144(var23);
                    return;
                }
            }
            if (field643 == 7 && var1.method3087() > 0) {
                Statics.field601 = var1.method3088();
                field643 = 8;
            }
            if (field643 == 8 && var1.method3087() >= Statics.field601) {
                var1.method3089(var2.field2399, 0, Statics.field601);
                var2.field2397 = 0;
                field643 = 6;
            }
            if (field643 == 9 && var1.method3087() > 0) {
                field646 = (var1.method3088() + 3) * 60;
                field643 = 10;
            }
            if (field643 == 10) {
                field644 = 0;
                class80.method1005(class240.field2884, class240.field2885, field646 / 60 + class240.field2886);
                if (--field646 <= 0) {
                    field643 = 0;
                }
            } else {
                if (field643 == 11 && var1.method3087() >= 1) {
                    Statics.field92 = var1.method3088();
                    field643 = 12;
                }
                if (field643 == 12 && var1.method3087() >= Statics.field92) {
                    boolean var24 = var1.method3088() == 1;
                    var1.method3089(var2.field2399, 0, 4);
                    var2.field2397 = 0;
                    boolean var25 = false;
                    if (var24) {
                        int var26 = var2.method3589() << 24;
                        int var27 = var26 | var2.method3589() << 16;
                        int var28 = var27 | var2.method3589() << 8;
                        int var29 = var28 | var2.method3589();
                        int var30 = class308.method2961(class80.field1146);
                        if (Statics.field1159.field994.size() >= 10 && !Statics.field1159.field994.containsKey(var30)) {
                            Iterator var31 = Statics.field1159.field994.entrySet().iterator();
                            var31.next();
                            var31.remove();
                        }
                        Statics.field1159.field994.put(var30, var29);
                    }
                    if (field648) {
                        Statics.field1159.field992 = class80.field1146;
                    } else {
                        Statics.field1159.field992 = null;
                    }
                    class68.method601();
                    field780 = var1.method3088();
                    field782 = var1.method3088() == 1;
                    field781 = var1.method3088();
                    field781 <<= 0x8;
                    field781 += var1.method3088();
                    field729 = var1.method3088();
                    var1.method3089(var2.field2399, 0, 1);
                    var2.field2397 = 0;
                    class171[] var32 = new class171[] { class171.field2169, class171.field2161, class171.field2148, class171.field2103, class171.field2104, class171.field2147, class171.field2106, class171.field2149, class171.field2176, class171.field2183, class171.field2130, class171.field2111, class171.field2121, class171.field2113, class171.field2114, class171.field2115, class171.field2116, class171.field2117, class171.field2118, class171.field2139, class171.field2178, class171.field2112, class171.field2122, class171.field2123, class171.field2124, class171.field2125, class171.field2126, class171.field2127, class171.field2136, class171.field2129, class171.field2140, class171.field2109, class171.field2132, class171.field2133, class171.field2101, class171.field2135, class171.field2100, class171.field2171, class171.field2138, class171.field2143, class171.field2180, class171.field2141, class171.field2142, class171.field2120, class171.field2144, class171.field2145, class171.field2146, class171.field2119, class171.field2158, class171.field2134, class171.field2150, class171.field2151, class171.field2152, class171.field2153, class171.field2154, class171.field2128, class171.field2156, class171.field2131, class171.field2108, class171.field2159, class171.field2160, class171.field2137, class171.field2162, class171.field2163, class171.field2164, class171.field2165, class171.field2166, class171.field2167, class171.field2105, class171.field2102, class171.field2170, class171.field2173, class171.field2172, class171.field2110, class171.field2174, class171.field2175, class171.field2181, class171.field2177, class171.field2168, class171.field2179, class171.field2107, class171.field2157, class171.field2182, class171.field2155, class171.field2184 };
                    int var34 = var2.method3607();
                    if (var34 < 0 || var34 >= var32.length) {
                        throw new IOException(var34 + " " + var2.field2397);
                    }
                    field798.field1267 = var32[var34];
                    field798.field1268 = field798.field1267.field2186;
                    var1.method3089(var2.field2399, 0, 2);
                    var2.field2397 = 0;
                    field798.field1268 = var2.method3325();
                    try {
                        client var35 = Statics.field3284;
                        JSObject.getWindow(var35).call("zap", (Object[]) null);
                    } catch (Throwable var42) {
                    }
                    field643 = 13;
                }
                if (field643 != 13) {
                    if (field643 == 14 && var1.method3087() >= 2) {
                        var2.field2397 = 0;
                        var1.method3089(var2.field2399, 0, 2);
                        var2.field2397 = 0;
                        Statics.field3726 = var2.method3325();
                        field643 = 15;
                    }
                    if (field643 == 15 && var1.method3087() >= Statics.field3726) {
                        var2.field2397 = 0;
                        var1.method3089(var2.field2399, 0, Statics.field3726);
                        var2.field2397 = 0;
                        String var37 = var2.method3435();
                        String var38 = var2.method3435();
                        String var39 = var2.method3435();
                        class80.method1005(var37, var38, var39);
                        method1776(10);
                    }
                    if (field643 == 16) {
                        if (field798.field1268 == -1) {
                            if (var1.method3087() < 2) {
                                return;
                            }
                            var1.method3089(var2.field2399, 0, 2);
                            var2.field2397 = 0;
                            field798.field1268 = var2.method3325();
                        }
                        if (var1.method3087() >= field798.field1268) {
                            var1.method3089(var2.field2399, 0, field798.field1268);
                            var2.field2397 = 0;
                            int var40 = field798.field1268;
                            field660.method4888();
                            method635();
                            class84.method3580(var2);
                            if (var2.field2397 != var40) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field644++;
                        if (field644 > 2000) {
                            if (field645 < 1) {
                                if (Statics.field2089 == Statics.field132) {
                                    Statics.field2089 = Statics.field604;
                                } else {
                                    Statics.field2089 = Statics.field132;
                                }
                                field645++;
                                field643 = 0;
                            } else {
                                method144(-3);
                            }
                        }
                    }
                } else if (var1.method3087() >= field798.field1268) {
                    var2.field2397 = 0;
                    var1.method3089(var2.field2399, 0, field798.field1268);
                    field660.method4899();
                    method963();
                    class84.method3580(var2);
                    Statics.field455 = -1;
                    method302(false, var2);
                    field798.field1267 = null;
                }
            }
        } catch (IOException var43) {
            if (field645 < 1) {
                if (Statics.field2089 == Statics.field132) {
                    Statics.field2089 = Statics.field604;
                } else {
                    Statics.field2089 = Statics.field132;
                }
                field645++;
                field643 = 0;
            } else {
                method144(-2);
            }
        }
    }

    @ObfuscatedName("bi.fy(I)V")
    public static void method963() {
        field622 = 1L;
        Statics.field1933.field548 = 0;
        Statics.field1501 = true;
        field626 = true;
        field835 = -1L;
        class319.method2086();
        field798.method1882();
        field798.field1266.field2397 = 0;
        field798.field1267 = null;
        field798.field1264 = null;
        field798.field1273 = null;
        field798.field1274 = null;
        field798.field1268 = 0;
        field798.field1270 = 0;
        field628 = 0;
        field657 = 0;
        field629 = 0;
        field748 = 0;
        field692 = false;
        Statics.method3109(0);
        class86.method2382();
        field839 = 0;
        field766 = false;
        field849 = 0;
        field680 = 0;
        field876 = 0;
        Statics.field3774 = null;
        field843 = 0;
        field836 = -1;
        field825 = 0;
        field842 = 0;
        field637 = class79.field1112;
        field638 = class79.field1112;
        field652 = 0;
        class84.field1204 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            class84.field1213[var0] = null;
            class84.field1202[var0] = 1;
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            field727[var1] = null;
        }
        for (int var2 = 0; var2 < 32768; var2++) {
            field651[var2] = null;
        }
        field738 = -1;
        field741.method3815();
        field742.method3815();
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    field739[var3][var4][var5] = null;
                }
            }
        }
        field821 = new class208();
        Statics.field191.method1549();
        for (int var6 = 0; var6 < Statics.field3286; var6++) {
            class257 var7 = class257.method3120(var6);
            if (var7 != null) {
                class228.field2615[var6] = 0;
                class228.field2617[var6] = 0;
            }
        }
        Statics.field3612.method1808();
        field714 = -1;
        if (field816 != -1) {
            class233.method2324(field816);
        }
        for (class57 var8 = (class57) field771.method3766(); var8 != null; var8 = (class57) field771.method3764()) {
            method937(var8, true);
        }
        field816 = -1;
        field771 = new class205(8);
        field710 = null;
        field748 = 0;
        field692 = false;
        field851.method4137((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var9 = 0; var9 < 8; var9++) {
            field735[var9] = null;
            field736[var9] = false;
        }
        class55.field499 = new class205(32);
        field620 = true;
        for (int var10 = 0; var10 < 100; var10++) {
            field875[var10] = true;
        }
        method1775();
        Statics.field1960 = null;
        for (int var11 = 0; var11 < 8; var11++) {
            field878[var11] = new class5();
        }
        Statics.field483 = null;
    }

    @ObfuscatedName("ah.fh(I)V")
    public static void method635() {
        field798.method1882();
        field798.field1266.field2397 = 0;
        field798.field1267 = null;
        field798.field1264 = null;
        field798.field1273 = null;
        field798.field1274 = null;
        field798.field1268 = 0;
        field798.field1270 = 0;
        field628 = 0;
        field748 = 0;
        field692 = false;
        field843 = 0;
        field825 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field727[var0] = null;
        }
        Statics.field502 = null;
        for (int var1 = 0; var1 < field651.length; var1++) {
            class74 var2 = field651[var1];
            if (var2 != null) {
                var2.field929 = -1;
                var2.field905 = false;
            }
        }
        class55.field499 = new class205(32);
        method1776(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field875[var3] = true;
        }
        method1775();
    }

    @ObfuscatedName("m.fp(II)V")
    public static void method144(int arg0) {
        if (arg0 == -3) {
            class80.method1005(class240.field2887, class240.field2888, class240.field2948);
        } else if (arg0 == -2) {
            class80.method1005(class240.field2890, class240.field2891, class240.field2892);
        } else if (arg0 == -1) {
            class80.method1005(class240.field2893, class240.field2894, class240.field2895);
        } else if (arg0 == 3) {
            class80.field1141 = 3;
            class80.field1140 = 1;
        } else if (arg0 == 4) {
            class80.method28(0);
        } else if (arg0 == 5) {
            class80.field1140 = 2;
            class80.method1005(class240.field2899, class240.field2848, class240.field2901);
        } else if (arg0 == 6) {
            class80.method1005(class240.field2902, class240.field2928, class240.field2936);
        } else if (arg0 == 7) {
            class80.method1005(class240.field3003, class240.field2906, class240.field3067);
        } else if (arg0 == 8) {
            class80.method1005(class240.field2908, class240.field2909, class240.field2910);
        } else if (arg0 == 9) {
            class80.method1005(class240.field2911, class240.field3087, class240.field3114);
        } else if (arg0 == 10) {
            class80.method1005(class240.field2914, class240.field3032, class240.field2872);
        } else if (arg0 == 11) {
            class80.method1005(class240.field2917, class240.field3099, class240.field2966);
        } else if (arg0 == 12) {
            class80.method1005(class240.field3055, class240.field2921, class240.field2922);
        } else if (arg0 == 13) {
            class80.method1005(class240.field2923, class240.field3107, class240.field2925);
        } else if (arg0 == 14) {
            class80.method1005(class240.field2900, class240.field2927, class240.field2844);
        } else if (arg0 == 16) {
            class80.method1005(class240.field3074, class240.field3098, class240.field2931);
        } else if (arg0 == 17) {
            class80.method1005(class240.field2932, class240.field2972, class240.field2934);
        } else if (arg0 == 18) {
            class80.method28(1);
        } else if (arg0 == 19) {
            class80.method1005(class240.field2938, class240.field2968, class240.field3102);
        } else if (arg0 == 20) {
            class80.method1005(class240.field3040, class240.field2942, class240.field2943);
        } else if (arg0 == 22) {
            class80.method1005(class240.field2944, class240.field2945, class240.field2946);
        } else if (arg0 == 23) {
            class80.method1005(class240.field2947, class240.field3044, class240.field2949);
        } else if (arg0 == 24) {
            class80.method1005(class240.field3020, class240.field3081, class240.field2952);
        } else if (arg0 == 25) {
            class80.method1005(class240.field3119, class240.field2954, class240.field2903);
        } else if (arg0 == 26) {
            class80.method1005(class240.field2956, class240.field2957, class240.field2958);
        } else if (arg0 == 27) {
            class80.method1005(class240.field2981, class240.field2960, class240.field2961);
        } else if (arg0 == 31) {
            class80.method1005(class240.field2882, class240.field2969, class240.field2970);
        } else if (arg0 == 32) {
            class80.method1005(class240.field3110, class240.field3085, class240.field2973);
        } else if (arg0 == 37) {
            class80.method1005(class240.field2974, class240.field2975, class240.field2976);
        } else if (arg0 == 38) {
            class80.method1005(class240.field2977, class240.field2978, class240.field2979);
        } else if (arg0 == 55) {
            class80.field1141 = 8;
        } else if (arg0 == 56) {
            class80.method1005(class240.field2984, class240.field2930, class240.field2986);
            method1776(11);
            return;
        } else if (arg0 == 57) {
            class80.method1005(class240.field2987, class240.field2988, class240.field2989);
            method1776(11);
            return;
        } else if (arg0 == 61) {
            class80.field1141 = 7;
        } else {
            class80.method1005(class240.field3100, class240.field2991, class240.field2992);
        }
        method1776(10);
    }

    @ObfuscatedName("ce.fw(I)V")
    public static final void method2090() {
        field798.method1900();
        method2596();
        Statics.field186.method2681();
        for (int var0 = 0; var0 < 4; var0++) {
            field767[var0].method3167();
        }
        System.gc();
        class220.method3122(2);
        field845 = -1;
        field846 = false;
        for (class70 var1 = (class70) class70.field1018.method3823(); var1 != null; var1 = (class70) class70.field1018.method3822()) {
            if (var1.field1014 != null) {
                Statics.field2095.method1910(var1.field1014);
                var1.field1014 = null;
            }
            if (var1.field1021 != null) {
                Statics.field2095.method1910(var1.field1021);
                var1.field1021 = null;
            }
        }
        class70.field1018.method3815();
        method1776(10);
    }

    @ObfuscatedName("dh.fg(I)V")
    public static final void method2596() {
        class275.method13();
        class262.method654();
        class263.method4431();
        class271.method4553();
        class274.method4447();
        class272.method4246();
        class276.method1707();
        class261.method5606();
        class266.field3377.method3725();
        class257.field3285.method3725();
        class270.method4557();
        class264.field3359.method3725();
        class264.field3360.method3725();
        class268.method2989();
        class267.field3383.method3725();
        class258.field3292.method3725();
        class230.method4013();
        class233.field2650.method3725();
        class233.field2651.method3725();
        class233.field2652.method3725();
        class233.field2653.method3725();
        ((class114) Statics.field1739).method2360();
        class87.field1232.method3725();
        Statics.field449.method4283();
        Statics.field304.method4283();
        Statics.field2345.method4283();
        Statics.field38.method4283();
        Statics.field3315.method4283();
        Statics.field2612.method4283();
        Statics.field2512.method4283();
        Statics.field366.method4283();
        Statics.field2030.method4283();
        Statics.field963.method4283();
        Statics.field1500.method4283();
        Statics.field568.method4283();
    }

    @ObfuscatedName("h.ff(B)V")
    public static final void method19() {
        if (field657 > 0) {
            method2090();
        } else {
            field660.method4884();
            method1776(40);
            Statics.field523 = field798.method1888();
            field798.method1887();
        }
    }

    @ObfuscatedName("bu.fn(ZI)V")
    public static final void method1013(boolean arg0) {
        if (arg0) {
            field647 = class80.field1138 ? class149.field1947 : class149.field1950;
        } else {
            field647 = Statics.field1159.field994.containsKey(class308.method2961(class80.field1146)) ? class149.field1951 : class149.field1949;
        }
    }

    @ObfuscatedName("client.fq(I)V")
    public final void method1089() {
        if (field628 > 1) {
            field628--;
        }
        if (field657 > 0) {
            field657--;
        }
        if (field658) {
            field658 = false;
            method19();
            return;
        }
        if (!field692) {
            field748 = 0;
            field692 = false;
            field730[0] = class240.field3121;
            field754[0] = "";
            field870[0] = 1006;
            field613[0] = false;
            field748 = 1;
        }
        for (int var1 = 0; var1 < 100 && this.method1093(field798); var1++) {
        }
        if (field827 != 30) {
            return;
        }
        while (class319.method4083()) {
            class175 var2 = class175.method3561(class172.field2266, field798.field1265);
            var2.field2323.method3531(0);
            int var3 = var2.field2323.field2397;
            class319.method5223(var2.field2323);
            var2.field2323.method3320(var2.field2323.field2397 - var3);
            field798.method1884(var2);
        }
        if (field660.field3668) {
            class175 var4 = class175.method3561(class172.field2189, field798.field1265);
            var4.field2323.method3531(0);
            int var5 = var4.field2323.field2397;
            field660.method4890(var4.field2323);
            var4.field2323.method3320(var4.field2323.field2397 - var5);
            field798.method1884(var4);
            field660.method4885();
        }
        Object var6 = Statics.field1933.field547;
        synchronized (Statics.field1933.field547) {
            if (!field737) {
                Statics.field1933.field548 = 0;
            } else if (class49.field426 != 0 || Statics.field1933.field548 >= 40) {
                class175 var7 = null;
                int var8 = 0;
                int var9 = 0;
                int var10 = 0;
                int var11 = 0;
                for (int var12 = 0; var12 < Statics.field1933.field548 && (var7 == null || var7.field2323.field2397 - var8 < 246); var12++) {
                    var9 = var12;
                    int var13 = Statics.field1933.field550[var12];
                    if (var13 < -1) {
                        var13 = -1;
                    } else if (var13 > 65534) {
                        var13 = 65534;
                    }
                    int var14 = Statics.field1933.field549[var12];
                    if (var14 < -1) {
                        var14 = -1;
                    } else if (var14 > 65534) {
                        var14 = 65534;
                    }
                    if (field623 != var14 || field624 != var13) {
                        if (var7 == null) {
                            var7 = class175.method3561(class172.field2200, field798.field1265);
                            var7.field2323.method3531(0);
                            var8 = var7.field2323.field2397;
                            var7.field2323.field2397 += 2;
                            var10 = 0;
                            var11 = 0;
                        }
                        int var15;
                        int var16;
                        int var17;
                        if (field822 == -1L) {
                            var15 = var14;
                            var16 = var13;
                            var17 = Integer.MAX_VALUE;
                        } else {
                            var15 = var14 - field623;
                            var16 = var13 - field624;
                            var17 = (int) ((Statics.field1933.field554[var12] - field822) / 20L);
                            var10 = (int) ((Statics.field1933.field554[var12] - field822) % 20L + (long) var10);
                        }
                        field623 = var14;
                        field624 = var13;
                        if (var17 < 8 && var15 >= -32 && var15 <= 31 && var16 >= -32 && var16 <= 31) {
                            var15 += 32;
                            var16 += 32;
                            var7.field2323.method3449((var15 << 6) + (var17 << 12) + var16);
                        } else if (var17 < 32 && var15 >= -128 && var15 <= 127 && var16 >= -128 && var16 <= 127) {
                            var15 += 128;
                            var16 += 128;
                            var7.field2323.method3531(var17 + 128);
                            var7.field2323.method3449((var15 << 8) + var16);
                        } else if (var17 < 32) {
                            var7.field2323.method3531(var17 + 192);
                            if (var14 == -1 || var13 == -1) {
                                var7.field2323.method3528(Integer.MIN_VALUE);
                            } else {
                                var7.field2323.method3528(var14 | var13 << 16);
                            }
                        } else {
                            var7.field2323.method3449((var17 & 0x1FFF) + 57344);
                            if (var14 == -1 || var13 == -1) {
                                var7.field2323.method3528(Integer.MIN_VALUE);
                            } else {
                                var7.field2323.method3528(var14 | var13 << 16);
                            }
                        }
                        var11++;
                        field822 = Statics.field1933.field554[var12];
                    }
                }
                if (var7 != null) {
                    var7.field2323.method3320(var7.field2323.field2397 - var8);
                    int var18 = var7.field2323.field2397;
                    var7.field2323.field2397 = var8;
                    var7.field2323.method3531(var10 / var11);
                    var7.field2323.method3531(var10 % var11);
                    var7.field2323.field2397 = var18;
                    field798.method1884(var7);
                }
                if (var9 >= Statics.field1933.field548) {
                    Statics.field1933.field548 = 0;
                } else {
                    Statics.field1933.field548 -= var9;
                    System.arraycopy(Statics.field1933.field549, var9, Statics.field1933.field549, 0, Statics.field1933.field548);
                    System.arraycopy(Statics.field1933.field550, var9, Statics.field1933.field550, 0, Statics.field1933.field548);
                    System.arraycopy(Statics.field1933.field554, var9, Statics.field1933.field554, 0, Statics.field1933.field548);
                }
            }
        }
        if (class49.field426 == 1 || !Statics.field1754 && class49.field426 == 4 || class49.field426 == 2) {
            long var20 = (class49.field445 - field622 * -1L) / 50L;
            if (var20 > 4095L) {
                var20 = 4095L;
            }
            field622 = class49.field445 * -1L;
            int var22 = class49.field444;
            if (var22 < 0) {
                var22 = 0;
            } else if (var22 > Statics.field3800) {
                var22 = Statics.field3800;
            }
            int var23 = class49.field443;
            if (var23 < 0) {
                var23 = 0;
            } else if (var23 > Statics.field2097) {
                var23 = Statics.field2097;
            }
            int var24 = (int) var20;
            class175 var25 = class175.method3561(class172.field2252, field798.field1265);
            var25.field2323.method3449((var24 << 1) + (class49.field426 == 2 ? 1 : 0));
            var25.field2323.method3449(var23);
            var25.field2323.method3449(var22);
            field798.method1884(var25);
        }
        if (class40.field344 > 0) {
            class175 var26 = class175.method3561(class172.field2233, field798.field1265);
            var26.field2323.method3449(0);
            int var27 = var26.field2323.field2397;
            long var28 = class187.method2864();
            for (int var30 = 0; var30 < class40.field344; var30++) {
                long var31 = var28 - field835;
                if (var31 > 16777215L) {
                    var31 = 16777215L;
                }
                field835 = var28;
                var26.field2323.method3318(class40.field343[var30]);
                var26.field2323.method3405((int) var31);
            }
            var26.field2323.method3494(var26.field2323.field2397 - var27);
            field798.method1884(var26);
        }
        if (field694 > 0) {
            field694--;
        }
        if (class40.field328[96] || class40.field328[97] || class40.field328[98] || class40.field328[99]) {
            field695 = true;
        }
        if (field695 && field694 <= 0) {
            field694 = 20;
            field695 = false;
            class175 var33 = class175.method3561(class172.field2277, field798.field1265);
            var33.field2323.method3359(field680);
            var33.field2323.method3401(field679);
            field798.method1884(var33);
        }
        if (Statics.field1501 && !field626) {
            field626 = true;
            class175 var34 = class175.method3561(class172.field2268, field798.field1265);
            var34.field2323.method3531(1);
            field798.method1884(var34);
        }
        if (!Statics.field1501 && field626) {
            field626 = false;
            class175 var35 = class175.method3561(class172.field2268, field798.field1265);
            var35.field2323.method3531(0);
            field798.method1884(var35);
        }
        if (Statics.field2074 != null) {
            Statics.field2074.method5740();
        }
        method1017();
        Statics.method5077();
        if (field827 != 30) {
            return;
        }
        for (class64 var36 = (class64) field821.method3823(); var36 != null; var36 = (class64) field821.method3822()) {
            if (var36.field899 > 0) {
                var36.field899--;
            }
            if (var36.field899 != 0) {
                if (var36.field901 > 0) {
                    var36.field901--;
                }
                if (var36.field901 == 0 && var36.field890 >= 1 && var36.field891 >= 1 && var36.field890 <= 102 && var36.field891 <= 102 && (var36.field896 < 0 || class51.method4433(var36.field896, var36.field897))) {
                    method131(var36.field895, var36.field889, var36.field890, var36.field891, var36.field896, var36.field893, var36.field897);
                    var36.field901 = -1;
                    if (var36.field896 == var36.field892 && var36.field892 == -1) {
                        var36.method3812();
                    } else if (var36.field896 == var36.field892 && var36.field898 == var36.field893 && var36.field897 == var36.field894) {
                        var36.method3812();
                    }
                }
            } else if (var36.field892 < 0 || class51.method4433(var36.field892, var36.field894)) {
                method131(var36.field895, var36.field889, var36.field890, var36.field891, var36.field892, var36.field898, var36.field894);
                var36.method3812();
            }
        }
        method1004();
        field798.field1270++;
        if (field798.field1270 > 750) {
            method19();
            return;
        }
        method1730();
        method2472();
        int[] var37 = class84.field1209;
        for (int var38 = 0; var38 < class84.field1204; var38++) {
            class62 var39 = field727[var37[var38]];
            if (var39 != null && var39.field933 > 0) {
                var39.field933--;
                if (var39.field933 == 0) {
                    var39.field959 = null;
                }
            }
        }
        for (int var40 = 0; var40 < field652; var40++) {
            int var41 = field868[var40];
            class74 var42 = field651[var41];
            if (var42 != null && var42.field933 > 0) {
                var42.field933--;
                if (var42.field933 == 0) {
                    var42.field959 = null;
                }
            }
        }
        field671++;
        if (field664 != 0) {
            field810 += 20;
            if (field810 >= 400) {
                field664 = 0;
            }
        }
        if (Statics.field1392 != null) {
            field712++;
            if (field712 >= 15) {
                method956(Statics.field1392);
                Statics.field1392 = null;
            }
        }
        class233 var43 = Statics.field3738;
        class233 var44 = Statics.field997;
        Statics.field3738 = null;
        Statics.field997 = null;
        field788 = null;
        field693 = false;
        field716 = false;
        field841 = 0;
        while (class40.method3304() && field841 < 128) {
            if (field780 >= 2 && class40.field328[82] && Statics.field30 == 66) {
                String var45 = class86.method526();
                Statics.field3284.method707(var45);
            } else if (field876 != 1 || Statics.field1062 <= 0) {
                field823[field841] = Statics.field30;
                field833[field841] = Statics.field1062;
                field841++;
            }
        }
        boolean var46 = field780 >= 2;
        if (var46 && class40.field328[82] && class40.field328[81] && field634 != 0) {
            int var47 = Statics.field502.field592 - field634;
            if (var47 < 0) {
                var47 = 0;
            } else if (var47 > 3) {
                var47 = 3;
            }
            if (Statics.field502.field592 != var47) {
                Statics.method439(Statics.field1225 + Statics.field502.field958[0], Statics.field64 + Statics.field502.field944[0], var47, false);
            }
            field634 = 0;
        }
        if (field816 != -1) {
            int var48 = field816;
            int var49 = Statics.field2097;
            int var50 = Statics.field3800;
            if (class233.method627(var48)) {
                method220(Statics.field2763[var48], -1, 0, 0, var49, var50, 0, 0);
            }
        }
        field796++;
        while (true) {
            class58 var51;
            class233 var52;
            class233 var53;
            do {
                var51 = (class58) field811.method3818();
                if (var51 == null) {
                    while (true) {
                        class58 var54;
                        class233 var55;
                        class233 var56;
                        do {
                            var54 = (class58) field812.method3818();
                            if (var54 == null) {
                                while (true) {
                                    class58 var57;
                                    class233 var58;
                                    class233 var59;
                                    do {
                                        var57 = (class58) field770.method3818();
                                        if (var57 == null) {
                                            this.method1094();
                                            if (Statics.field2074 != null) {
                                                Statics.field2074.method5640(Statics.field517, (Statics.field502.field953 >> 7) + Statics.field1225, (Statics.field502.field919 >> 7) + Statics.field64, false);
                                                Statics.field2074.method5656();
                                            }
                                            if (field784 != null) {
                                                this.method1099();
                                            }
                                            if (Statics.field228 != null) {
                                                method956(Statics.field228);
                                                field723++;
                                                if (class49.field434 == 0) {
                                                    if (field722) {
                                                        if (Statics.field230 == Statics.field228 && field789 != field718) {
                                                            class233 var60 = Statics.field228;
                                                            byte var61 = 0;
                                                            if (field776 == 1 && var60.field2660 == 206) {
                                                                var61 = 1;
                                                            }
                                                            if (var60.field2775[field789] <= 0) {
                                                                var61 = 0;
                                                            }
                                                            int var62 = method2323(var60);
                                                            boolean var63 = (var62 >> 29 & 0x1) != 0;
                                                            if (var63) {
                                                                int var64 = field718;
                                                                int var65 = field789;
                                                                var60.field2775[var65] = var60.field2775[var64];
                                                                var60.field2646[var65] = var60.field2646[var64];
                                                                var60.field2775[var64] = -1;
                                                                var60.field2646[var64] = 0;
                                                            } else if (var61 == 1) {
                                                                int var66 = field718;
                                                                int var67 = field789;
                                                                while (var66 != var67) {
                                                                    if (var66 > var67) {
                                                                        var60.method4185(var66 - 1, var66);
                                                                        var66--;
                                                                    } else if (var66 < var67) {
                                                                        var60.method4185(var66 + 1, var66);
                                                                        var66++;
                                                                    }
                                                                }
                                                            } else {
                                                                var60.method4185(field789, field718);
                                                            }
                                                            class175 var68 = class175.method3561(class172.field2232, field798.field1265);
                                                            var68.field2323.method3528(Statics.field228.field2656);
                                                            var68.field2323.method3401(field718);
                                                            var68.field2323.method3318(var61);
                                                            var68.field2323.method3359(field789);
                                                            field798.method1884(var68);
                                                        }
                                                    } else if (this.method1084()) {
                                                        this.method1096(field640, field747);
                                                    } else if (field748 > 0) {
                                                        int var69 = field640;
                                                        int var70 = field747;
                                                        class77 var71 = Statics.field1467;
                                                        method2972(var71.field1101, var71.field1098, var71.field1097, var71.field1100, var71.field1099, var71.field1099, var69, var70);
                                                        Statics.field1467 = null;
                                                    }
                                                    field712 = 10;
                                                    class49.field426 = 0;
                                                    Statics.field228 = null;
                                                } else if (field723 >= 5 && (class49.field437 > field640 + 5 || class49.field437 < field640 - 5 || class49.field439 > field747 + 5 || class49.field439 < field747 - 5)) {
                                                    field722 = true;
                                                }
                                            }
                                            if (class128.method2848()) {
                                                int var72 = class128.field1802;
                                                int var73 = class128.field1799;
                                                class175 var74 = class175.method3561(class172.field2250, field798.field1265);
                                                var74.field2323.method3531(5);
                                                var74.field2323.method3449(Statics.field64 + var73);
                                                var74.field2323.method3449(Statics.field1225 + var72);
                                                var74.field2323.method3351(class40.field328[82] ? (class40.field328[81] ? 2 : 1) : 0);
                                                field798.method1884(var74);
                                                class128.method2721();
                                                field711 = class49.field443;
                                                field832 = class49.field444;
                                                field664 = 1;
                                                field810 = 0;
                                                field825 = var72;
                                                field842 = var73;
                                            }
                                            if (Statics.field3738 != var43) {
                                                if (var43 != null) {
                                                    method956(var43);
                                                }
                                                if (Statics.field3738 != null) {
                                                    method956(Statics.field3738);
                                                }
                                            }
                                            if (Statics.field997 != var44 && field763 == field762) {
                                                if (var44 != null) {
                                                    method956(var44);
                                                }
                                                if (Statics.field997 != null) {
                                                    method956(Statics.field997);
                                                }
                                            }
                                            if (Statics.field997 == null) {
                                                if (field762 > 0) {
                                                    field762--;
                                                }
                                            } else if (field762 < field763) {
                                                field762++;
                                                if (field763 == field762) {
                                                    method956(Statics.field997);
                                                }
                                            }
                                            method76();
                                            if (field702) {
                                                int var75 = Statics.field1980 * 128 + 64;
                                                int var76 = Statics.field2187 * 128 + 64;
                                                int var77 = method953(var75, var76, Statics.field517) - Statics.field538;
                                                if (Statics.field2602 < var75) {
                                                    Statics.field2602 += Statics.field208 * (var75 - Statics.field2602) / 1000 + Statics.field82;
                                                    if (Statics.field2602 > var75) {
                                                        Statics.field2602 = var75;
                                                    }
                                                }
                                                if (Statics.field2602 > var75) {
                                                    Statics.field2602 -= Statics.field208 * (Statics.field2602 - var75) / 1000 + Statics.field82;
                                                    if (Statics.field2602 < var75) {
                                                        Statics.field2602 = var75;
                                                    }
                                                }
                                                if (Statics.field2413 < var77) {
                                                    Statics.field2413 += Statics.field208 * (var77 - Statics.field2413) / 1000 + Statics.field82;
                                                    if (Statics.field2413 > var77) {
                                                        Statics.field2413 = var77;
                                                    }
                                                }
                                                if (Statics.field2413 > var77) {
                                                    Statics.field2413 -= Statics.field208 * (Statics.field2413 - var77) / 1000 + Statics.field82;
                                                    if (Statics.field2413 < var77) {
                                                        Statics.field2413 = var77;
                                                    }
                                                }
                                                if (Statics.field675 < var76) {
                                                    Statics.field675 += Statics.field208 * (var76 - Statics.field675) / 1000 + Statics.field82;
                                                    if (Statics.field675 > var76) {
                                                        Statics.field675 = var76;
                                                    }
                                                }
                                                if (Statics.field675 > var76) {
                                                    Statics.field675 -= Statics.field208 * (Statics.field675 - var76) / 1000 + Statics.field82;
                                                    if (Statics.field675 < var76) {
                                                        Statics.field675 = var76;
                                                    }
                                                }
                                                int var78 = Statics.field2098 * 128 + 64;
                                                int var79 = Statics.field1391 * 128 + 64;
                                                int var80 = method953(var78, var79, Statics.field517) - Statics.field48;
                                                int var81 = var78 - Statics.field2602;
                                                int var82 = var80 - Statics.field2413;
                                                int var83 = var79 - Statics.field675;
                                                int var84 = (int) Math.sqrt((double) (var81 * var81 + var83 * var83));
                                                int var85 = (int) (Math.atan2((double) var82, (double) var84) * 325.949D) & 0x7FF;
                                                int var86 = (int) (Math.atan2((double) var81, (double) var83) * -325.949D) & 0x7FF;
                                                if (var85 < 128) {
                                                    var85 = 128;
                                                }
                                                if (var85 > 383) {
                                                    var85 = 383;
                                                }
                                                if (Statics.field61 < var85) {
                                                    Statics.field61 += Statics.field1492 * (var85 - Statics.field61) / 1000 + Statics.field222;
                                                    if (Statics.field61 > var85) {
                                                        Statics.field61 = var85;
                                                    }
                                                }
                                                if (Statics.field61 > var85) {
                                                    Statics.field61 -= Statics.field1492 * (Statics.field61 - var85) / 1000 + Statics.field222;
                                                    if (Statics.field61 < var85) {
                                                        Statics.field61 = var85;
                                                    }
                                                }
                                                int var87 = var86 - Statics.field96;
                                                if (var87 > 1024) {
                                                    var87 -= 2048;
                                                }
                                                if (var87 < -1024) {
                                                    var87 += 2048;
                                                }
                                                if (var87 > 0) {
                                                    Statics.field96 += Statics.field1492 * var87 / 1000 + Statics.field222;
                                                    Statics.field96 &= 0x7FF;
                                                }
                                                if (var87 < 0) {
                                                    Statics.field96 -= Statics.field1492 * -var87 / 1000 + Statics.field222;
                                                    Statics.field96 &= 0x7FF;
                                                }
                                                int var88 = var86 - Statics.field96;
                                                if (var88 > 1024) {
                                                    var88 -= 2048;
                                                }
                                                if (var88 < -1024) {
                                                    var88 += 2048;
                                                }
                                                if (var88 < 0 && var87 > 0 || var88 > 0 && var87 < 0) {
                                                    Statics.field96 = var86;
                                                }
                                            }
                                            for (int var89 = 0; var89 < 5; var89++) {
                                                int var10002 = field860[var89]++;
                                            }
                                            Statics.field3612.method1812();
                                            int var90 = ++class49.field429 - 1;
                                            int var92 = class40.method1014();
                                            if (var90 > 15000 && var92 > 15000) {
                                                field657 = 250;
                                                Statics.method3109(14500);
                                                class175 var93 = class175.method3561(class172.field2272, field798.field1265);
                                                field798.method1884(var93);
                                            }
                                            Statics.field191.method1548();
                                            field798.field1261++;
                                            if (field798.field1261 > 50) {
                                                class175 var94 = class175.method3561(class172.field2204, field798.field1265);
                                                field798.method1884(var94);
                                            }
                                            try {
                                                field798.method1883();
                                            } catch (IOException var96) {
                                                method19();
                                            }
                                            return;
                                        }
                                        var58 = var57.field531;
                                        if (var58.field2657 < 0) {
                                            break;
                                        }
                                        var59 = class233.method130(var58.field2672);
                                    } while (var59 == null || var59.field2765 == null || var58.field2657 >= var59.field2765.length || var59.field2765[var58.field2657] != var58);
                                    class71.method1800(var57);
                                }
                            }
                            var55 = var54.field531;
                            if (var55.field2657 < 0) {
                                break;
                            }
                            var56 = class233.method130(var55.field2672);
                        } while (var56 == null || var56.field2765 == null || var55.field2657 >= var56.field2765.length || var56.field2765[var55.field2657] != var55);
                        class71.method1800(var54);
                    }
                }
                var52 = var51.field531;
                if (var52.field2657 < 0) {
                    break;
                }
                var53 = class233.method130(var52.field2672);
            } while (var53 == null || var53.field2765 == null || var52.field2657 >= var53.field2765.length || var53.field2765[var52.field2657] != var52);
            class71.method1800(var51);
        }
    }

    @ObfuscatedName("av.fs(I)V")
    public static final void method450() {
        if (Statics.field352 != null) {
            Statics.field352.method2040();
        }
        if (Statics.field300 != null) {
            Statics.field300.method2040();
        }
    }

    @ObfuscatedName("bd.fj(B)V")
    public static final void method1004() {
        for (int var0 = 0; var0 < field849; var0++) {
            int var10002 = field852[var0]--;
            if (field852[var0] >= -10) {
                class94 var2 = field653[var0];
                if (var2 == null) {
                    class94 var10000 = (class94) null;
                    var2 = class94.method1971(Statics.field38, field850[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field852[var0] += var2.method1960();
                    field653[var0] = var2;
                }
                if (field852[var0] < 0) {
                    int var9;
                    if (field880[var0] == 0) {
                        var9 = field840;
                    } else {
                        int var3 = (field880[var0] & 0xFF) * 128;
                        int var4 = field880[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field502.field953;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field880[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field502.field919;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field852[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field755 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class96 var10 = var2.method1959().method2010(Statics.field1053);
                        class106 var11 = class106.method2134(var10, 100, var9);
                        var11.method2252(field871[var0] - 1);
                        Statics.field2095.method1916(var11);
                    }
                    field852[var0] = -100;
                }
            } else {
                field849--;
                for (int var1 = var0; var1 < field849; var1++) {
                    field850[var1] = field850[var1 + 1];
                    field653[var1] = field653[var1 + 1];
                    field871[var1] = field871[var1 + 1];
                    field852[var1] = field852[var1 + 1];
                    field880[var1] = field880[var1 + 1];
                }
                var0--;
            }
        }
        if (field846 && !Statics.method3123()) {
            if (field705 != 0 && field845 != -1) {
                class220.method3559(Statics.field2612, field845, 0, field705, false);
            }
            field846 = false;
        }
    }

    @ObfuscatedName("kg.fd(Ljv;IIIB)V")
    public static void method5217(class276 arg0, int arg1, int arg2, int arg3) {
        if (field849 >= 50 || field755 == 0 || arg0.field3595 == null || arg1 >= arg0.field3595.length) {
            return;
        }
        int var4 = arg0.field3595[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field850[field849] = var5;
        field871[field849] = var6;
        field852[field849] = 0;
        field653[field849] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field880[field849] = (var8 << 16) + (var9 << 8) + var7;
        field849++;
    }

    @ObfuscatedName("au.fv(IIII)V")
    public static void method880(int arg0, int arg1, int arg2) {
        if (field840 == 0 || arg1 == 0 || field849 >= 50) {
            return;
        }
        field850[field849] = arg0;
        field871[field849] = arg1;
        field852[field849] = arg2;
        field653[field849] = null;
        field880[field849] = 0;
        field849++;
    }

    @ObfuscatedName("ap.fm(II)V")
    public static void method568(int arg0) {
        if (arg0 == -1 && !field846) {
            Statics.field2522.method3925();
            class220.field2525 = 1;
            Statics.field3278 = null;
        } else if (arg0 != -1 && field845 != arg0 && field705 != 0 && !field846) {
            class252 var1 = Statics.field2612;
            int var2 = field705;
            class220.field2525 = 1;
            Statics.field3278 = var1;
            Statics.field2524 = arg0;
            Statics.field522 = 0;
            Statics.field312 = var2;
            Statics.field605 = false;
            Statics.field9 = 2;
        }
        field845 = arg0;
    }

    @ObfuscatedName("bu.fb(I)V")
    public static final void method1017() {
        if (!Statics.field180) {
            return;
        }
        if (Statics.field1960 != null) {
            Statics.field1960.method4977();
        }
        method535();
        Statics.field180 = false;
    }

    @ObfuscatedName("bm.fe(Ljava/lang/String;S)V")
    public static final void method951(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field1159.field989 = !Statics.field1159.field989;
            class68.method601();
            if (Statics.field1159.field989) {
                class86.method1011(99, "", "Roofs are now all hidden");
            } else {
                class86.method1011(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field627 = !field627;
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            field804 = !field804;
        }
        if (arg0.equalsIgnoreCase("mouseovertext")) {
            field715 = !field715;
        }
        if (field780 >= 2) {
            if (arg0.equalsIgnoreCase("showcoord")) {
                Statics.field2074.field3950 = !Statics.field2074.field3950;
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                field627 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field627 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method19();
            }
        }
        class175 var1 = class175.method3561(class172.field2206, field798.field1265);
        var1.field2323.method3531(arg0.length() + 1);
        var1.field2323.method3314(arg0);
        field798.method1884(var1);
    }

    @ObfuscatedName("w.fr(I)V")
    public static final void method76() {
        if (field876 == 0) {
            int var0 = Statics.field502.field953;
            int var1 = Statics.field502.field919;
            if (Statics.field1491 - var0 < -500 || Statics.field1491 - var0 > 500 || Statics.field1260 - var1 < -500 || Statics.field1260 - var1 > 500) {
                Statics.field1491 = var0;
                Statics.field1260 = var1;
            }
            if (Statics.field1491 != var0) {
                Statics.field1491 += (var0 - Statics.field1491) / 16;
            }
            if (Statics.field1260 != var1) {
                Statics.field1260 += (var1 - Statics.field1260) / 16;
            }
            int var2 = Statics.field1491 >> 7;
            int var3 = Statics.field1260 >> 7;
            int var4 = method953(Statics.field1491, Statics.field1260, Statics.field517);
            int var5 = 0;
            if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                        int var8 = Statics.field517;
                        if (var8 < 3 && (class51.field457[1][var6][var7] & 0x2) == 2) {
                            var8++;
                        }
                        int var9 = var4 - class51.field460[var8][var6][var7];
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
            if (var10 > field728) {
                field728 += (var10 - field728) / 24;
            } else if (var10 < field728) {
                field728 += (var10 - field728) / 80;
            }
            Statics.field608 = method953(Statics.field502.field953, Statics.field502.field919, Statics.field517) - field686;
        } else if (field876 == 1) {
            method1615();
            short var11 = -1;
            if (class40.field328[33]) {
                var11 = 0;
            } else if (class40.field328[49]) {
                var11 = 1024;
            }
            if (class40.field328[48]) {
                if (var11 == 0) {
                    var11 = 1792;
                } else if (var11 == 1024) {
                    var11 = 1280;
                } else {
                    var11 = 1536;
                }
            } else if (class40.field328[50]) {
                if (var11 == 0) {
                    var11 = 256;
                } else if (var11 == 1024) {
                    var11 = 768;
                } else {
                    var11 = 512;
                }
            }
            byte var12 = 0;
            if (class40.field328[35]) {
                var12 = -1;
            } else if (class40.field328[51]) {
                var12 = 1;
            }
            int var13 = 0;
            if (var11 >= 0 || var12 != 0) {
                int var14 = class40.field328[81] ? field691 : field690;
                var13 = var14 * 16;
                field688 = var11;
                field775 = var12;
            }
            if (field687 < var13) {
                field687 += var13 / 8;
                if (field687 > var13) {
                    field687 = var13;
                }
            } else if (field687 > var13) {
                field687 = field687 * 9 / 10;
            }
            if (field687 > 0) {
                int var15 = field687 / 16;
                if (field688 >= 0) {
                    int var16 = field688 - Statics.field96 & 0x7FF;
                    int var17 = class125.field1742[var16];
                    int var18 = class125.field1743[var16];
                    Statics.field1491 += var15 * var17 / 65536;
                    Statics.field1260 += var15 * var18 / 65536;
                }
                if (field775 != 0) {
                    Statics.field608 += field775 * var15;
                    if (Statics.field608 > 0) {
                        Statics.field608 = 0;
                    }
                }
            } else {
                field688 = -1;
                field775 = -1;
            }
            if (class40.field328[13]) {
                method930();
            }
        }
        if (class49.field434 == 4 && Statics.field1754) {
            int var19 = class49.field439 - field684;
            field697 = var19 * 2;
            field684 = var19 == -1 || var19 == 1 ? class49.field439 : (field684 + class49.field439) / 2;
            int var20 = field685 - class49.field437;
            field681 = var20 * 2;
            field685 = var20 == -1 || var20 == 1 ? class49.field437 : (field685 + class49.field437) / 2;
        } else {
            if (class40.field328[96]) {
                field681 += (-24 - field681) / 2;
            } else if (class40.field328[97]) {
                field681 += (24 - field681) / 2;
            } else {
                field681 /= 2;
            }
            if (class40.field328[98]) {
                field697 += (12 - field697) / 2;
            } else if (class40.field328[99]) {
                field697 += (-12 - field697) / 2;
            } else {
                field697 /= 2;
            }
            field684 = class49.field439;
            field685 = class49.field437;
        }
        field680 = field681 / 2 + field680 & 0x7FF;
        field679 += field697 / 2;
        if (field679 < 128) {
            field679 = 128;
        }
        if (field679 > 383) {
            field679 = 383;
        }
    }

    @ObfuscatedName("bl.fo(B)V")
    public static final void method1730() {
        int var0 = class84.field1204;
        int[] var1 = class84.field1209;
        for (int var2 = 0; var2 < var0; var2++) {
            class62 var3 = field727[var1[var2]];
            if (var3 != null) {
                method298(var3, 1);
            }
        }
    }

    @ObfuscatedName("dg.ft(I)V")
    public static final void method2472() {
        for (int var0 = 0; var0 < field652; var0++) {
            int var1 = field868[var0];
            class74 var2 = field651[var1];
            if (var2 != null) {
                method298(var2, var2.field1071.field3548);
            }
        }
    }

    @ObfuscatedName("j.gk(Lbn;II)V")
    public static final void method298(class65 arg0, int arg1) {
        if (arg0.field930 > field633) {
            int var2 = arg0.field930 - field633;
            int var3 = arg0.field964 * 64 + arg0.field945 * 128;
            int var4 = arg0.field964 * 64 + arg0.field912 * 128;
            arg0.field953 += (var3 - arg0.field953) / var2;
            arg0.field919 += (var4 - arg0.field919) / var2;
            arg0.field961 = 0;
            arg0.field954 = arg0.field924;
        } else if (arg0.field948 >= field633) {
            Statics.method4250(arg0);
        } else {
            method959(arg0);
        }
        if (arg0.field953 < 128 || arg0.field919 < 128 || arg0.field953 >= 13184 || arg0.field919 >= 13184) {
            arg0.field935 = -1;
            arg0.field940 = -1;
            arg0.field930 = 0;
            arg0.field948 = 0;
            arg0.field953 = arg0.field958[0] * 128 + arg0.field964 * 64;
            arg0.field919 = arg0.field944[0] * 128 + arg0.field964 * 64;
            arg0.method1465();
        }
        if (Statics.field502 == arg0 && (arg0.field953 < 1536 || arg0.field919 < 1536 || arg0.field953 >= 11776 || arg0.field919 >= 11776)) {
            arg0.field935 = -1;
            arg0.field940 = -1;
            arg0.field930 = 0;
            arg0.field948 = 0;
            arg0.field953 = arg0.field958[0] * 128 + arg0.field964 * 64;
            arg0.field919 = arg0.field944[0] * 128 + arg0.field964 * 64;
            arg0.method1465();
        }
        if (arg0.field956 != 0) {
            if (arg0.field929 != -1) {
                class65 var5 = null;
                if (arg0.field929 < 32768) {
                    var5 = field651[arg0.field929];
                } else if (arg0.field929 >= 32768) {
                    var5 = field727[arg0.field929 - 32768];
                }
                if (var5 != null) {
                    int var6 = arg0.field953 - var5.field953;
                    int var7 = arg0.field919 - var5.field919;
                    if (var6 != 0 || var7 != 0) {
                        arg0.field954 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field905) {
                    arg0.field929 = -1;
                    arg0.field905 = false;
                }
            }
            if (arg0.field931 != -1 && (arg0.field957 == 0 || arg0.field961 > 0)) {
                arg0.field954 = arg0.field931;
                arg0.field931 = -1;
            }
            int var8 = arg0.field954 - arg0.field904 & 0x7FF;
            if (var8 == 0 && arg0.field905) {
                arg0.field929 = -1;
                arg0.field905 = false;
            }
            if (var8 == 0) {
                arg0.field949 = 0;
            } else {
                arg0.field949++;
                if (var8 > 1024) {
                    arg0.field904 -= arg0.field956;
                    boolean var9 = true;
                    if (var8 < arg0.field956 || var8 > 2048 - arg0.field956) {
                        arg0.field904 = arg0.field954;
                        var9 = false;
                    }
                    if (arg0.field908 == arg0.field906 && (arg0.field949 > 25 || var9)) {
                        if (arg0.field909 == -1) {
                            arg0.field906 = arg0.field911;
                        } else {
                            arg0.field906 = arg0.field909;
                        }
                    }
                } else {
                    arg0.field904 += arg0.field956;
                    boolean var10 = true;
                    if (var8 < arg0.field956 || var8 > 2048 - arg0.field956) {
                        arg0.field904 = arg0.field954;
                        var10 = false;
                    }
                    if (arg0.field908 == arg0.field906 && (arg0.field949 > 25 || var10)) {
                        if (arg0.field916 == -1) {
                            arg0.field906 = arg0.field911;
                        } else {
                            arg0.field906 = arg0.field916;
                        }
                    }
                }
                arg0.field904 &= 0x7FF;
            }
        }
        method297(arg0);
    }

    @ObfuscatedName("bi.gx(Lbn;B)V")
    public static final void method959(class65 arg0) {
        arg0.field906 = arg0.field908;
        if (arg0.field957 == 0) {
            arg0.field961 = 0;
            return;
        }
        if (arg0.field935 != -1 && arg0.field938 == 0) {
            class276 var1 = class276.method2865(arg0.field935);
            if (arg0.field962 > 0 && var1.field3592 == 0) {
                arg0.field961++;
                return;
            }
            if (arg0.field962 <= 0 && var1.field3598 == 0) {
                arg0.field961++;
                return;
            }
        }
        int var2 = arg0.field953;
        int var3 = arg0.field919;
        int var4 = arg0.field958[arg0.field957 - 1] * 128 + arg0.field964 * 64;
        int var5 = arg0.field944[arg0.field957 - 1] * 128 + arg0.field964 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field954 = 1280;
            } else if (var3 > var5) {
                arg0.field954 = 1792;
            } else {
                arg0.field954 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field954 = 768;
            } else if (var3 > var5) {
                arg0.field954 = 256;
            } else {
                arg0.field954 = 512;
            }
        } else if (var3 < var5) {
            arg0.field954 = 1024;
        } else if (var3 > var5) {
            arg0.field954 = 0;
        }
        byte var6 = arg0.field960[arg0.field957 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field953 = var4;
            arg0.field919 = var5;
            arg0.field957--;
            if (arg0.field962 > 0) {
                arg0.field962--;
            }
            return;
        }
        int var7 = arg0.field954 - arg0.field904 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field910;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field911;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field914;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field913;
        }
        if (var8 == -1) {
            var8 = arg0.field911;
        }
        arg0.field906 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class74) {
            var10 = ((class74) arg0).field1071.field3565;
        }
        if (var10) {
            if (arg0.field954 != arg0.field904 && arg0.field929 == -1 && arg0.field956 != 0) {
                var9 = 2;
            }
            if (arg0.field957 > 2) {
                var9 = 6;
            }
            if (arg0.field957 > 3) {
                var9 = 8;
            }
            if (arg0.field961 > 0 && arg0.field957 > 1) {
                var9 = 8;
                arg0.field961--;
            }
        } else {
            if (arg0.field957 > 1) {
                var9 = 6;
            }
            if (arg0.field957 > 2) {
                var9 = 8;
            }
            if (arg0.field961 > 0 && arg0.field957 > 1) {
                var9 = 8;
                arg0.field961--;
            }
        }
        if (var6 == 2) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field911 == arg0.field906 && arg0.field915 != -1) {
            arg0.field906 = arg0.field915;
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field953 += var9;
                if (arg0.field953 > var4) {
                    arg0.field953 = var4;
                }
            } else if (var2 > var4) {
                arg0.field953 -= var9;
                if (arg0.field953 < var4) {
                    arg0.field953 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field919 += var9;
                if (arg0.field919 > var5) {
                    arg0.field919 = var5;
                }
            } else if (var3 > var5) {
                arg0.field919 -= var9;
                if (arg0.field919 < var5) {
                    arg0.field919 = var5;
                }
            }
        }
        if (arg0.field953 == var4 && arg0.field919 == var5) {
            arg0.field957--;
            if (arg0.field962 > 0) {
                arg0.field962--;
            }
        }
    }

    @ObfuscatedName("j.gb(Lbn;I)V")
    public static final void method297(class65 arg0) {
        arg0.field955 = false;
        if (arg0.field906 != -1) {
            class276 var1 = class276.method2865(arg0.field906);
            if (var1 == null || var1.field3597 == null) {
                arg0.field906 = -1;
            } else {
                arg0.field934++;
                if (arg0.field951 < var1.field3597.length && arg0.field934 > var1.field3599[arg0.field951]) {
                    arg0.field934 = 1;
                    arg0.field951++;
                    method5217(var1, arg0.field951, arg0.field953, arg0.field919);
                }
                if (arg0.field951 >= var1.field3597.length) {
                    arg0.field934 = 0;
                    arg0.field951 = 0;
                    method5217(var1, arg0.field951, arg0.field953, arg0.field919);
                }
            }
        }
        if (arg0.field940 != -1 && field633 >= arg0.field943) {
            if (arg0.field946 < 0) {
                arg0.field946 = 0;
            }
            int var2 = class261.method2874(arg0.field940).field3321;
            if (var2 == -1) {
                arg0.field940 = -1;
            } else {
                class276 var3 = class276.method2865(var2);
                if (var3 == null || var3.field3597 == null) {
                    arg0.field940 = -1;
                } else {
                    arg0.field950++;
                    if (arg0.field946 < var3.field3597.length && arg0.field950 > var3.field3599[arg0.field946]) {
                        arg0.field950 = 1;
                        arg0.field946++;
                        method5217(var3, arg0.field946, arg0.field953, arg0.field919);
                    }
                    if (arg0.field946 >= var3.field3597.length && (arg0.field946 < 0 || arg0.field946 >= var3.field3597.length)) {
                        arg0.field940 = -1;
                    }
                }
            }
        }
        if (arg0.field935 != -1 && arg0.field938 <= 1) {
            class276 var4 = class276.method2865(arg0.field935);
            if (var4.field3592 == 1 && arg0.field962 > 0 && arg0.field930 <= field633 && arg0.field948 < field633) {
                arg0.field938 = 1;
                return;
            }
        }
        if (arg0.field935 != -1 && arg0.field938 == 0) {
            class276 var5 = class276.method2865(arg0.field935);
            if (var5 == null || var5.field3597 == null) {
                arg0.field935 = -1;
            } else {
                arg0.field937++;
                if (arg0.field936 < var5.field3597.length && arg0.field937 > var5.field3599[arg0.field936]) {
                    arg0.field937 = 1;
                    arg0.field936++;
                    method5217(var5, arg0.field936, arg0.field953, arg0.field919);
                }
                if (arg0.field936 >= var5.field3597.length) {
                    arg0.field936 -= var5.field3601;
                    arg0.field939++;
                    if (arg0.field939 >= var5.field3609) {
                        arg0.field935 = -1;
                    } else if (arg0.field936 >= 0 && arg0.field936 < var5.field3597.length) {
                        method5217(var5, arg0.field936, arg0.field953, arg0.field919);
                    } else {
                        arg0.field935 = -1;
                    }
                }
                arg0.field955 = var5.field3603;
            }
        }
        if (arg0.field938 > 0) {
            arg0.field938--;
        }
    }

    @ObfuscatedName("iq.ga(Lbo;III)V")
    public static void method4364(class62 arg0, int arg1, int arg2) {
        if (arg0.field935 == arg1 && arg1 != -1) {
            int var3 = class276.method2865(arg1).field3610;
            if (var3 == 1) {
                arg0.field936 = 0;
                arg0.field937 = 0;
                arg0.field938 = arg2;
                arg0.field939 = 0;
            }
            if (var3 == 2) {
                arg0.field939 = 0;
            }
        } else if (arg1 == -1 || arg0.field935 == -1 || class276.method2865(arg1).field3604 >= class276.method2865(arg0.field935).field3604) {
            arg0.field935 = arg1;
            arg0.field936 = 0;
            arg0.field937 = 0;
            arg0.field938 = arg2;
            arg0.field939 = 0;
            arg0.field962 = arg0.field957;
        }
    }

    @ObfuscatedName("ap.gs(B)I")
    public static int method602() {
        return field809 ? 2 : 1;
    }

    @ObfuscatedName("cf.gz(I)V")
    public static void method1775() {
        class175 var0 = class175.method3561(class172.field2259, field798.field1265);
        var0.field2323.method3531(method602());
        var0.field2323.method3449(Statics.field2097);
        var0.field2323.method3449(Statics.field3800);
        field798.method1884(var0);
    }

    @ObfuscatedName("client.m(I)V")
    public final void method805() {
        field824 = class187.method2864() + 500L;
        this.method1091();
        if (field816 != -1) {
            this.method1085(true);
        }
    }

    @ObfuscatedName("client.gw(I)V")
    public void method1091() {
        int var1 = Statics.field2097;
        int var2 = Statics.field3800;
        if (this.field391 < var1) {
            int var3 = this.field391;
        }
        if (this.field422 < var2) {
            int var4 = this.field422;
        }
        if (Statics.field1159 == null) {
            return;
        }
        try {
            client var5 = Statics.field3284;
            Object[] var6 = new Object[] { method602() };
            JSObject.getWindow(var5).call("resize", var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("client.gr(I)V")
    public final void method1092() {
        if (field816 != -1) {
            method939(field816);
        }
        for (int var1 = 0; var1 < field814; var1++) {
            if (field875[var1]) {
                field817[var1] = true;
            }
            field818[var1] = field875[var1];
            field875[var1] = false;
        }
        field815 = field633;
        field760 = -1;
        field761 = -1;
        Statics.field230 = null;
        if (field816 != -1) {
            field814 = 0;
            method1079(field816, 0, 0, Statics.field2097, Statics.field3800, 0, 0, -1);
        }
        class320.method5386();
        if (field621) {
            if (field664 == 1) {
                Statics.field2645[field810 / 100].method5460(field711 - 8, field832 - 8);
            }
            if (field664 == 2) {
                Statics.field2645[field810 / 100 + 4].method5460(field711 - 8, field832 - 8);
            }
        }
        if (field692) {
            method108();
        } else if (field760 != -1) {
            method4234(field760, field761);
        }
        if (field609 == 3) {
            for (int var2 = 0; var2 < field814; var2++) {
                if (field818[var2]) {
                    class320.method5339(field819[var2], field820[var2], field661[var2], field834[var2], 16711935, 128);
                } else if (field817[var2]) {
                    class320.method5339(field819[var2], field820[var2], field661[var2], field834[var2], 16711680, 128);
                }
            }
        }
        class70.method214(Statics.field517, Statics.field502.field953, Statics.field502.field919, field671);
        field671 = 0;
    }

    @ObfuscatedName("bo.gh(Ljava/lang/String;ZB)V")
    public static final void method1066(String arg0, boolean arg1) {
        if (!field725) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field1941.method5124(arg0, 250);
        int var6 = Statics.field1941.method5125(arg0, 250) * 13;
        class320.method5348(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class320.method5352(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field1941.method5127(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method1774(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field3231.method688(0, 0);
            return;
        }
        int var7 = var3;
        int var8 = var4;
        int var9 = var5;
        int var10 = var6;
        for (int var11 = 0; var11 < field814; var11++) {
            if (field819[var11] + field661[var11] > var7 && field819[var11] < var7 + var9 && field834[var11] + field820[var11] > var8 && field820[var11] < var8 + var10) {
                field817[var11] = true;
            }
        }
    }

    @ObfuscatedName("hh.go(IIIII)V")
    public static final void method4104(int arg0, int arg1, int arg2, int arg3) {
        field708++;
        if (Statics.field502.field953 >> 7 == field825 && Statics.field502.field919 >> 7 == field842) {
            field825 = 0;
        }
        method3198();
        method107();
        method301(true);
        int var4 = class84.field1204;
        int[] var5 = class84.field1209;
        for (int var6 = 0; var6 < var4; var6++) {
            if (field738 != var5[var6] && field781 != var5[var6]) {
                method878(field727[var5[var6]], true);
            }
        }
        method301(false);
        for (class81 var7 = (class81) field741.method3823(); var7 != null; var7 = (class81) field741.method3822()) {
            if (Statics.field517 != var7.field1163 || field633 > var7.field1167) {
                var7.method3812();
            } else if (field633 >= var7.field1162) {
                if (var7.field1187 > 0) {
                    class74 var8 = field651[var7.field1187 - 1];
                    if (var8 != null && var8.field953 >= 0 && var8.field953 < 13312 && var8.field919 >= 0 && var8.field919 < 13312) {
                        var7.method1767(var8.field953, var8.field919, method953(var8.field953, var8.field919, var7.field1163) - var7.field1176, field633);
                    }
                }
                if (var7.field1187 < 0) {
                    int var9 = -var7.field1187 - 1;
                    class62 var10;
                    if (field781 == var9) {
                        var10 = Statics.field502;
                    } else {
                        var10 = field727[var9];
                    }
                    if (var10 != null && var10.field953 >= 0 && var10.field953 < 13312 && var10.field919 >= 0 && var10.field919 < 13312) {
                        var7.method1767(var10.field953, var10.field919, method953(var10.field953, var10.field919, var7.field1163) - var7.field1176, field633);
                    }
                }
                var7.method1773(field671);
                Statics.field186.method2691(Statics.field517, (int) var7.field1174, (int) var7.field1175, (int) var7.field1182, 60, var7, var7.field1177, -1L, false);
            }
        }
        for (class72 var11 = (class72) field742.method3823(); var11 != null; var11 = (class72) field742.method3822()) {
            if (Statics.field517 != var11.field1050 || var11.field1057) {
                var11.method3812();
            } else if (field633 >= var11.field1049) {
                var11.method1688(field671);
                if (var11.field1057) {
                    var11.method3812();
                } else {
                    Statics.field186.method2691(var11.field1050, var11.field1051, var11.field1052, var11.field1058, 60, var11, 0, -1L, false);
                }
            }
        }
        method1731(arg0, arg1, arg2, arg3, true);
        int var12 = field659;
        int var13 = field713;
        int var14 = field861;
        int var15 = field753;
        class320.method5408(var12, var13, var12 + var14, var13 + var15);
        class125.method2601();
        if (!field702) {
            int var16 = field679;
            if (field728 / 256 > var16) {
                var16 = field728 / 256;
            }
            if (field856[4] && field858[4] + 128 > var16) {
                var16 = field858[4] + 128;
            }
            int var17 = field680 & 0x7FF;
            int var18 = Statics.field1491;
            int var19 = Statics.field608;
            int var20 = Statics.field1260;
            int var21 = var16 * 3 + 600;
            int var22 = 2048 - var16 & 0x7FF;
            int var23 = 2048 - var17 & 0x7FF;
            int var24 = 0;
            int var25 = 0;
            int var26 = var21;
            if (var22 != 0) {
                int var27 = class125.field1742[var22];
                int var28 = class125.field1743[var22];
                int var29 = var25 * var28 - var21 * var27 >> 16;
                var26 = var25 * var27 + var21 * var28 >> 16;
                var25 = var29;
            }
            if (var23 != 0) {
                int var30 = class125.field1742[var23];
                int var31 = class125.field1743[var23];
                int var32 = var24 * var31 + var26 * var30 >> 16;
                var26 = var26 * var31 - var24 * var30 >> 16;
                var24 = var32;
            }
            Statics.field2602 = var18 - var24;
            Statics.field2413 = var19 - var25;
            Statics.field675 = var20 - var26;
            Statics.field61 = var16;
            Statics.field96 = var17;
            if (field876 == 1 && field780 >= 2 && field633 % 50 == 0 && (Statics.field1491 >> 7 != Statics.field502.field953 >> 7 || Statics.field1260 >> 7 != Statics.field502.field919 >> 7)) {
                int var33 = Statics.field502.field592;
                int var34 = (Statics.field1491 >> 7) + Statics.field1225;
                int var35 = (Statics.field1260 >> 7) + Statics.field64;
                Statics.method439(var34, var35, var33, true);
            }
        }
        int var48;
        if (field702) {
            int var49;
            if (Statics.field1159.field989) {
                var49 = Statics.field517;
            } else {
                int var50 = method953(Statics.field2602, Statics.field675, Statics.field517);
                if (var50 - Statics.field2413 >= 800 || (class51.field457[Statics.field517][Statics.field2602 >> 7][Statics.field675 >> 7] & 0x4) == 0) {
                    var49 = 3;
                } else {
                    var49 = Statics.field517;
                }
            }
            var48 = var49;
        } else {
            int var36;
            if (Statics.field1159.field989) {
                var36 = Statics.field517;
            } else {
                label561: {
                    int var37 = 3;
                    if (Statics.field61 < 310) {
                        label552: {
                            int var38;
                            int var39;
                            if (field876 == 1) {
                                var38 = Statics.field1491 >> 7;
                                var39 = Statics.field1260 >> 7;
                            } else {
                                var38 = Statics.field502.field953 >> 7;
                                var39 = Statics.field502.field919 >> 7;
                            }
                            int var40 = Statics.field2602 >> 7;
                            int var41 = Statics.field675 >> 7;
                            if (var40 >= 0 && var41 >= 0 && var40 < 104 && var41 < 104) {
                                if (var38 >= 0 && var39 >= 0 && var38 < 104 && var39 < 104) {
                                    if ((class51.field457[Statics.field517][var40][var41] & 0x4) != 0) {
                                        var37 = Statics.field517;
                                    }
                                    int var42;
                                    if (var38 > var40) {
                                        var42 = var38 - var40;
                                    } else {
                                        var42 = var40 - var38;
                                    }
                                    int var43;
                                    if (var39 > var41) {
                                        var43 = var39 - var41;
                                    } else {
                                        var43 = var41 - var39;
                                    }
                                    if (var42 > var43) {
                                        int var44 = var43 * 65536 / var42;
                                        int var45 = 32768;
                                        while (true) {
                                            if (var38 == var40) {
                                                break label552;
                                            }
                                            if (var40 < var38) {
                                                var40++;
                                            } else if (var40 > var38) {
                                                var40--;
                                            }
                                            if ((class51.field457[Statics.field517][var40][var41] & 0x4) != 0) {
                                                var37 = Statics.field517;
                                            }
                                            var45 += var44;
                                            if (var45 >= 65536) {
                                                var45 -= 65536;
                                                if (var41 < var39) {
                                                    var41++;
                                                } else if (var41 > var39) {
                                                    var41--;
                                                }
                                                if ((class51.field457[Statics.field517][var40][var41] & 0x4) != 0) {
                                                    var37 = Statics.field517;
                                                }
                                            }
                                        }
                                    } else {
                                        if (var43 > 0) {
                                            int var46 = var42 * 65536 / var43;
                                            int var47 = 32768;
                                            while (var39 != var41) {
                                                if (var41 < var39) {
                                                    var41++;
                                                } else if (var41 > var39) {
                                                    var41--;
                                                }
                                                if ((class51.field457[Statics.field517][var40][var41] & 0x4) != 0) {
                                                    var37 = Statics.field517;
                                                }
                                                var47 += var46;
                                                if (var47 >= 65536) {
                                                    var47 -= 65536;
                                                    if (var40 < var38) {
                                                        var40++;
                                                    } else if (var40 > var38) {
                                                        var40--;
                                                    }
                                                    if ((class51.field457[Statics.field517][var40][var41] & 0x4) != 0) {
                                                        var37 = Statics.field517;
                                                    }
                                                }
                                            }
                                        }
                                        break label552;
                                    }
                                }
                                var36 = Statics.field517;
                                break label561;
                            }
                            var36 = Statics.field517;
                            break label561;
                        }
                    }
                    if (Statics.field502.field953 >= 0 && Statics.field502.field919 >= 0 && Statics.field502.field953 < 13312 && Statics.field502.field919 < 13312) {
                        if ((class51.field457[Statics.field517][Statics.field502.field953 >> 7][Statics.field502.field919 >> 7] & 0x4) != 0) {
                            var37 = Statics.field517;
                        }
                        var36 = var37;
                    } else {
                        var36 = Statics.field517;
                    }
                }
            }
            var48 = var36;
        }
        int var51 = Statics.field2602;
        int var52 = Statics.field2413;
        int var53 = Statics.field675;
        int var54 = Statics.field61;
        int var55 = Statics.field96;
        for (int var56 = 0; var56 < 5; var56++) {
            if (field856[var56]) {
                int var57 = (int) (Math.random() * (double) (field857[var56] * 2 + 1) - (double) field857[var56] + Math.sin((double) field859[var56] / 100.0D * (double) field860[var56]) * (double) field858[var56]);
                if (var56 == 0) {
                    Statics.field2602 += var57;
                }
                if (var56 == 1) {
                    Statics.field2413 += var57;
                }
                if (var56 == 2) {
                    Statics.field675 += var57;
                }
                if (var56 == 3) {
                    Statics.field96 = Statics.field96 + var57 & 0x7FF;
                }
                if (var56 == 4) {
                    Statics.field61 += var57;
                    if (Statics.field61 < 128) {
                        Statics.field61 = 128;
                    }
                    if (Statics.field61 > 383) {
                        Statics.field61 = 383;
                    }
                }
            }
        }
        int var58 = class49.field437;
        int var59 = class49.field439;
        if (class49.field426 != 0) {
            var58 = class49.field443;
            var59 = class49.field444;
        }
        if (var58 >= var12 && var58 < var12 + var14 && var59 >= var13 && var59 < var13 + var15) {
            int var60 = var58 - var12;
            int var61 = var59 - var13;
            class123.field1693 = var60;
            class123.field1708 = var61;
            class123.field1702 = true;
            class123.field1710 = 0;
            class123.field1695 = false;
        } else {
            class123.field1702 = false;
            class123.field1710 = 0;
        }
        method450();
        class320.method5348(var12, var13, var14, var15, 0);
        method450();
        int var62 = class125.field1717;
        class125.field1717 = field837;
        Statics.field186.method2722(Statics.field2602, Statics.field2413, Statics.field675, Statics.field61, Statics.field96, var48);
        class125.field1717 = var62;
        method450();
        Statics.field186.method2695();
        field732 = 0;
        boolean var63 = false;
        int var64 = -1;
        int var65 = -1;
        int var66 = class84.field1204;
        int[] var67 = class84.field1209;
        for (int var68 = 0; var68 < field652 + var66; var68++) {
            class65 var69;
            if (var68 < var66) {
                var69 = field727[var67[var68]];
                if (field738 == var67[var68]) {
                    var63 = true;
                    var64 = var68;
                    continue;
                }
                if (Statics.field502 == var69) {
                    var65 = var68;
                    continue;
                }
            } else {
                var69 = field651[field868[var68 - var66]];
            }
            method139(var69, var68, var12, var13, var14, var15);
        }
        if (field804 && var65 != -1) {
            method139(Statics.field502, var65, var12, var13, var14, var15);
        }
        if (var63) {
            method139(field727[field738], var64, var12, var13, var14, var15);
        }
        for (int var70 = 0; var70 < field732; var70++) {
            int var71 = field699[var70];
            int var72 = field700[var70];
            int var73 = field785[var70];
            int var74 = field701[var70];
            boolean var75 = true;
            while (var75) {
                var75 = false;
                for (int var76 = 0; var76 < var70; var76++) {
                    if (var72 + 2 > field700[var76] - field701[var76] && var72 - var74 < field700[var76] + 2 && var71 - var73 < field785[var76] + field699[var76] && var71 + var73 > field699[var76] - field785[var76] && field700[var76] - field701[var76] < var72) {
                        var72 = field700[var76] - field701[var76];
                        var75 = true;
                    }
                }
            }
            field709 = field699[var70];
            field830 = field700[var70] = var72;
            String var77 = field706[var70];
            if (field854 == 0) {
                int var78 = 16776960;
                if (field703[var70] < 6) {
                    var78 = field826[field703[var70]];
                }
                if (field703[var70] == 6) {
                    var78 = field708 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field703[var70] == 7) {
                    var78 = field708 % 20 < 10 ? 255 : 65535;
                }
                if (field703[var70] == 8) {
                    var78 = field708 % 20 < 10 ? 45056 : 8454016;
                }
                if (field703[var70] == 9) {
                    int var79 = 150 - field743[var70];
                    if (var79 < 50) {
                        var78 = var79 * 1280 + 16711680;
                    } else if (var79 < 100) {
                        var78 = 16776960 - (var79 - 50) * 327680;
                    } else if (var79 < 150) {
                        var78 = (var79 - 100) * 5 + 65280;
                    }
                }
                if (field703[var70] == 10) {
                    int var80 = 150 - field743[var70];
                    if (var80 < 50) {
                        var78 = var80 * 5 + 16711680;
                    } else if (var80 < 100) {
                        var78 = 16711935 - (var80 - 50) * 327680;
                    } else if (var80 < 150) {
                        var78 = (var80 - 100) * 327680 + 255 - (var80 - 100) * 5;
                    }
                }
                if (field703[var70] == 11) {
                    int var81 = 150 - field743[var70];
                    if (var81 < 50) {
                        var78 = 16777215 - var81 * 327685;
                    } else if (var81 < 100) {
                        var78 = (var81 - 50) * 327685 + 65280;
                    } else if (var81 < 150) {
                        var78 = 16777215 - (var81 - 100) * 327680;
                    }
                }
                if (field668[var70] == 0) {
                    Statics.field66.method5130(var77, field709 + var12, field830 + var13, var78, 0);
                }
                if (field668[var70] == 1) {
                    Statics.field66.method5132(var77, field709 + var12, field830 + var13, var78, 0, field708);
                }
                if (field668[var70] == 2) {
                    Statics.field66.method5133(var77, field709 + var12, field830 + var13, var78, 0, field708);
                }
                if (field668[var70] == 3) {
                    Statics.field66.method5119(var77, field709 + var12, field830 + var13, var78, 0, field708, 150 - field743[var70]);
                }
                if (field668[var70] == 4) {
                    int var82 = (150 - field743[var70]) * (Statics.field66.method5122(var77) + 100) / 150;
                    class320.method5341(field709 + var12 - 50, var13, field709 + var12 + 50, var13 + var15);
                    Statics.field66.method5134(var77, field709 + var12 + 50 - var82, field830 + var13, var78, 0);
                    class320.method5408(var12, var13, var12 + var14, var13 + var15);
                }
                if (field668[var70] == 5) {
                    int var83 = 150 - field743[var70];
                    int var84 = 0;
                    if (var83 < 25) {
                        var84 = var83 - 25;
                    } else if (var83 > 125) {
                        var84 = var83 - 125;
                    }
                    class320.method5341(var12, field830 + var13 - Statics.field66.field3756 - 1, var12 + var14, field830 + var13 + 5);
                    Statics.field66.method5130(var77, field709 + var12, field830 + var13 + var84, var78, 0);
                    class320.method5408(var12, var13, var12 + var14, var13 + var15);
                }
            } else {
                Statics.field66.method5130(var77, field709 + var12, field830 + var13, 16776960, 0);
            }
        }
        if (field629 == 2) {
            method3124((field632 - Statics.field1225 << 7) + field635, (field786 - Statics.field64 << 7) + field636, field719 * 2);
            if (field709 > -1 && field633 % 20 < 10) {
                Statics.field1914[0].method5460(field709 + var12 - 12, field830 + var13 - 28);
            }
        }
        ((class114) Statics.field1739).method2361(field671);
        method444();
        Statics.field2602 = var51;
        Statics.field2413 = var52;
        Statics.field675 = var53;
        Statics.field61 = var54;
        Statics.field96 = var55;
        if (field620 && class253.method3039(true, false) == 0) {
            field620 = false;
        }
        if (field620) {
            class320.method5348(var12, var13, var14, var15, 0);
            method1066(class240.field3122, false);
        }
    }

    @ObfuscatedName("bk.gc(IIIIZB)V")
    public static final void method1731(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field862 - field724) * var5 / 100 + field724;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field867) {
            short var8 = field867;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field879) {
                var6 = field879;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class320.method5386();
                    class320.method5348(arg0, arg1, var10, arg3, -16777216);
                    class320.method5348(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field881) {
            short var11 = field881;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field865) {
                var6 = field865;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class320.method5386();
                    class320.method5348(arg0, arg1, arg2, var13, -16777216);
                    class320.method5348(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field864 - field863) * var5 / 100 + field863;
        field837 = arg3 * var6 * var14 / 85504 << 1;
        if (field861 != arg2 || field753 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class125.field1742[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class128.method2716(var15, 500, 800, arg2, arg3);
        }
        field659 = arg0;
        field713 = arg1;
        field861 = arg2;
        field753 = arg3;
    }

    @ObfuscatedName("fw.gg(I)V")
    public static void method3198() {
        if (field804) {
            method878(Statics.field502, false);
        }
    }

    @ObfuscatedName("s.gi(B)V")
    public static void method107() {
        if (field738 >= 0 && field727[field738] != null) {
            method878(field727[field738], false);
        }
    }

    @ObfuscatedName("au.gl(Lbo;ZI)V")
    public static void method878(class62 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method1030() || arg0.field572) {
            return;
        }
        arg0.field589 = false;
        if ((field614 && class84.field1204 > 50 || class84.field1204 > 200) && arg1 && arg0.field908 == arg0.field906) {
            arg0.field589 = true;
        }
        int var2 = arg0.field953 >> 7;
        int var3 = arg0.field919 >> 7;
        if (var2 < 0 || var2 >= 104 || var3 < 0 || var3 >= 104) {
            return;
        }
        long var4 = class123.method649(0, 0, 0, false, arg0.field588);
        if (arg0.field584 != null && field633 >= arg0.field595 && field633 < arg0.field580) {
            arg0.field589 = false;
            arg0.field570 = method953(arg0.field953, arg0.field919, Statics.field517);
            arg0.field907 = field633;
            Statics.field186.method2693(Statics.field517, arg0.field953, arg0.field919, arg0.field570, 60, arg0, arg0.field904, var4, arg0.field585, arg0.field586, arg0.field587, arg0.field593);
            return;
        }
        if ((arg0.field953 & 0x7F) == 64 && (arg0.field919 & 0x7F) == 64) {
            if (field708 == field676[var2][var3]) {
                return;
            }
            field676[var2][var3] = field708;
        }
        arg0.field570 = method953(arg0.field953, arg0.field919, Statics.field517);
        arg0.field907 = field633;
        Statics.field186.method2691(Statics.field517, arg0.field953, arg0.field919, arg0.field570, 60, arg0, arg0.field904, var4, arg0.field955);
    }

    @ObfuscatedName("j.gq(ZI)V")
    public static final void method301(boolean arg0) {
        for (int var1 = 0; var1 < field652; var1++) {
            class74 var2 = field651[field868[var1]];
            if (var2 != null && var2.method1030() && var2.field1071.field3552 == arg0 && var2.field1071.method4785()) {
                int var3 = var2.field953 >> 7;
                int var4 = var2.field919 >> 7;
                if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
                    if (var2.field964 == 1 && (var2.field953 & 0x7F) == 64 && (var2.field919 & 0x7F) == 64) {
                        if (field708 == field676[var3][var4]) {
                            continue;
                        }
                        field676[var3][var4] = field708;
                    }
                    long var5 = class123.method649(0, 0, 1, !var2.field1071.field3575, field868[var1]);
                    var2.field907 = field633;
                    Statics.field186.method2691(Statics.field517, var2.field953, var2.field919, method953(var2.field953 + (var2.field964 * 64 - 64), var2.field919 + (var2.field964 * 64 - 64), Statics.field517), var2.field964 * 64 - 64 + 60, var2, var2.field904, var5, var2.field955);
                }
            }
        }
    }

    @ObfuscatedName("bz.gv(I)Z")
    public static boolean method1728() {
        return (field731 & 0x1) != 0;
    }

    @ObfuscatedName("h.gt(B)Z")
    public static boolean method20() {
        return (field731 & 0x8) != 0;
    }

    @ObfuscatedName("dd.gm(Lbo;S)Z")
    public static boolean method2599(class62 arg0) {
        if (field731 == 0) {
            return false;
        } else if (Statics.field502 == arg0) {
            return method20();
        } else {
            boolean var1 = (field731 & 0x4) != 0;
            boolean var2 = var1 || method1728() && arg0.method1020();
            if (!var2) {
                boolean var3 = (field731 & 0x2) != 0;
                var2 = var3 && arg0.method1023();
            }
            return var2;
        }
    }

    @ObfuscatedName("k.gp(Lbn;IIIIII)V")
    public static final void method139(class65 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method1030()) {
            return;
        }
        if (arg0 instanceof class74) {
            class274 var6 = ((class74) arg0).field1071;
            if (var6.field3572 != null) {
                var6 = var6.method4802();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class84.field1204;
        int[] var8 = class84.field1209;
        byte var9 = 0;
        if (arg1 < var7 && field633 == arg0.field907 && method2599((class62) arg0)) {
            class62 var10 = (class62) arg0;
            if (arg1 < var7) {
                method1577(arg0, arg0.field902 + 15);
                class302 var11 = (class302) field869.get(class298.field3731);
                byte var12 = 9;
                var11.method5130(var10.field573.method5059(), field709 + arg2, field830 + arg3 - var12, 16777215, 0);
                var9 = 18;
            }
        }
        int var13 = -2;
        if (!arg0.field942.method3781()) {
            method1577(arg0, arg0.field902 + 15);
            for (class73 var14 = (class73) arg0.field942.method3779(); var14 != null; var14 = (class73) arg0.field942.method3780()) {
                class66 var15 = var14.method1692(field633);
                if (var15 != null) {
                    class264 var16 = var14.field1064;
                    class324 var17 = var16.method4559();
                    class324 var18 = var16.method4555();
                    int var19 = 0;
                    int var20;
                    if (var17 == null || var18 == null) {
                        var20 = var16.field3369;
                    } else {
                        if (var16.field3358 * 2 < var18.field3870) {
                            var19 = var16.field3358;
                        }
                        var20 = var18.field3870 - var19 * 2;
                    }
                    int var21 = 255;
                    boolean var22 = true;
                    int var23 = field633 - var15.field966;
                    int var24 = var15.field965 * var20 / var16.field3369;
                    int var27;
                    if (var15.field968 > var23) {
                        int var25 = var16.field3365 == 0 ? 0 : var23 / var16.field3365 * var16.field3365;
                        int var26 = var15.field967 * var20 / var16.field3369;
                        var27 = (var24 - var26) * var25 / var15.field968 + var26;
                    } else {
                        var27 = var24;
                        int var28 = var15.field968 + var16.field3366 - var23;
                        if (var16.field3363 >= 0) {
                            var21 = (var28 << 8) / (var16.field3366 - var16.field3363);
                        }
                    }
                    if (var15.field965 > 0 && var27 < 1) {
                        var27 = 1;
                    }
                    if (var17 == null || var18 == null) {
                        var13 += 5;
                        if (field709 > -1) {
                            int var34 = field709 + arg2 - (var20 >> 1);
                            int var35 = field830 + arg3 - var13;
                            class320.method5348(var34, var35, var27, 5, 65280);
                            class320.method5348(var27 + var34, var35, var20 - var27, 5, 16711680);
                        }
                        var13 += 2;
                    } else {
                        int var29;
                        if (var20 == var27) {
                            var29 = var19 * 2 + var27;
                        } else {
                            var29 = var19 + var27;
                        }
                        int var30 = var17.field3878;
                        var13 += var30;
                        int var31 = field709 + arg2 - (var20 >> 1);
                        int var32 = field830 + arg3 - var13;
                        int var33 = var31 - var19;
                        if (var21 >= 0 && var21 < 255) {
                            var17.method5466(var33, var32, var21);
                            class320.method5341(var33, var32, var29 + var33, var30 + var32);
                            var18.method5466(var33, var32, var21);
                        } else {
                            var17.method5460(var33, var32);
                            class320.method5341(var33, var32, var29 + var33, var30 + var32);
                            var18.method5460(var33, var32);
                        }
                        class320.method5408(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var13 += 2;
                    }
                } else if (var14.method1702()) {
                    var14.method3812();
                }
            }
        }
        if (var13 == -2) {
            var13 += 7;
        }
        int var36 = var9 + var13;
        if (arg1 < var7) {
            class62 var37 = (class62) arg0;
            if (var37.field572) {
                return;
            }
            if (var37.field571 != -1 || var37.field596 != -1) {
                method1577(arg0, arg0.field902 + 15);
                if (field709 > -1) {
                    if (var37.field571 != -1) {
                        var36 += 25;
                        Statics.field123[var37.field571].method5460(field709 + arg2 - 12, field830 + arg3 - var36);
                    }
                    if (var37.field596 != -1) {
                        var36 += 25;
                        Statics.field903[var37.field596].method5460(field709 + arg2 - 12, field830 + arg3 - var36);
                    }
                }
            }
            if (arg1 >= 0 && field629 == 10 && field631 == var8[arg1]) {
                method1577(arg0, arg0.field902 + 15);
                if (field709 > -1) {
                    int var38 = Statics.field1914[1].field3878 + var36;
                    Statics.field1914[1].method5460(field709 + arg2 - 12, field830 + arg3 - var38);
                }
            }
        } else {
            class274 var39 = ((class74) arg0).field1071;
            if (var39.field3572 != null) {
                var39 = var39.method4802();
            }
            if (var39.field3570 >= 0 && var39.field3570 < Statics.field903.length) {
                method1577(arg0, arg0.field902 + 15);
                if (field709 > -1) {
                    Statics.field903[var39.field3570].method5460(field709 + arg2 - 12, field830 + arg3 - 30);
                }
            }
            if (field629 == 1 && field873 == field868[arg1 - var7] && field633 % 20 < 10) {
                method1577(arg0, arg0.field902 + 15);
                if (field709 > -1) {
                    Statics.field1914[0].method5460(field709 + arg2 - 12, field830 + arg3 - 28);
                }
            }
        }
        if (arg0.field959 != null && (arg1 >= var7 || !arg0.field918 && (field630 == 4 || !arg0.field917 && (field630 == 0 || field630 == 3 || field630 == 1 && ((class62) arg0).method1020())))) {
            method1577(arg0, arg0.field902);
            if (field709 > -1 && field732 < field698) {
                field785[field732] = Statics.field66.method5122(arg0.field959) / 2;
                field701[field732] = Statics.field66.field3756;
                field699[field732] = field709;
                field700[field732] = field830;
                field703[field732] = arg0.field920;
                field668[field732] = arg0.field921;
                field743[field732] = arg0.field933;
                field706[field732] = arg0.field959;
                field732++;
            }
        }
        for (int var40 = 0; var40 < 4; var40++) {
            int var41 = arg0.field925[var40];
            int var42 = arg0.field923[var40];
            class270 var43 = null;
            int var44 = 0;
            if (var42 >= 0) {
                if (var41 <= field633) {
                    continue;
                }
                var43 = class270.method4489(arg0.field923[var40]);
                var44 = var43.field3426;
                if (var43 != null && var43.field3428 != null) {
                    var43 = var43.method4638();
                    if (var43 == null) {
                        arg0.field925[var40] = -1;
                        continue;
                    }
                }
            } else if (var41 < 0) {
                continue;
            }
            int var45 = arg0.field926[var40];
            class270 var46 = null;
            if (var45 >= 0) {
                var46 = class270.method4489(var45);
                if (var46 != null && var46.field3428 != null) {
                    var46 = var46.method4638();
                }
            }
            if (var41 - var44 <= field633) {
                if (var43 == null) {
                    arg0.field925[var40] = -1;
                } else {
                    method1577(arg0, arg0.field902 / 2);
                    if (field709 > -1) {
                        if (var40 == 1) {
                            field830 -= 20;
                        }
                        if (var40 == 2) {
                            field709 -= 15;
                            field830 -= 10;
                        }
                        if (var40 == 3) {
                            field709 += 15;
                            field830 -= 10;
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
                        class324 var72 = var43.method4640();
                        if (var72 != null) {
                            var51 = var72.field3870;
                            int var73 = var72.field3878;
                            if (var73 > var71) {
                                var71 = var73;
                            }
                            var55 = var72.field3872;
                        }
                        class324 var74 = var43.method4641();
                        if (var74 != null) {
                            var52 = var74.field3870;
                            int var75 = var74.field3878;
                            if (var75 > var71) {
                                var71 = var75;
                            }
                            var56 = var74.field3872;
                        }
                        class324 var76 = var43.method4672();
                        if (var76 != null) {
                            var53 = var76.field3870;
                            int var77 = var76.field3878;
                            if (var77 > var71) {
                                var71 = var77;
                            }
                            var57 = var76.field3872;
                        }
                        class324 var78 = var43.method4637();
                        if (var78 != null) {
                            var54 = var78.field3870;
                            int var79 = var78.field3878;
                            if (var79 > var71) {
                                var71 = var79;
                            }
                            var58 = var78.field3872;
                        }
                        if (var46 != null) {
                            var59 = var46.method4640();
                            if (var59 != null) {
                                var63 = var59.field3870;
                                int var80 = var59.field3878;
                                if (var80 > var71) {
                                    var71 = var80;
                                }
                                var67 = var59.field3872;
                            }
                            var60 = var46.method4641();
                            if (var60 != null) {
                                var64 = var60.field3870;
                                int var81 = var60.field3878;
                                if (var81 > var71) {
                                    var71 = var81;
                                }
                                var68 = var60.field3872;
                            }
                            var61 = var46.method4672();
                            if (var61 != null) {
                                var65 = var61.field3870;
                                int var82 = var61.field3878;
                                if (var82 > var71) {
                                    var71 = var82;
                                }
                                var69 = var61.field3872;
                            }
                            var62 = var46.method4637();
                            if (var62 != null) {
                                var66 = var62.field3870;
                                int var83 = var62.field3878;
                                if (var83 > var71) {
                                    var71 = var83;
                                }
                                var70 = var62.field3872;
                            }
                        }
                        class301 var84 = var43.method4663();
                        if (var84 == null) {
                            var84 = Statics.field447;
                        }
                        class301 var85;
                        if (var46 == null) {
                            var85 = Statics.field447;
                        } else {
                            var85 = var46.method4663();
                            if (var85 == null) {
                                var85 = Statics.field447;
                            }
                        }
                        Object var86 = null;
                        String var87 = null;
                        boolean var88 = false;
                        int var89 = 0;
                        String var90 = var43.method4639(arg0.field932[var40]);
                        int var91 = var84.method5122(var90);
                        if (var46 != null) {
                            var87 = var46.method4639(arg0.field927[var40]);
                            var89 = var85.method5122(var87);
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
                        int var108 = arg0.field925[var40] - field633;
                        int var109 = var43.field3422 - var43.field3422 * var108 / var43.field3426;
                        int var110 = var43.field3421 * var108 / var43.field3426 + -var43.field3421;
                        int var111 = field709 + arg2 - (var100 >> 1) + var109;
                        int var112 = field830 + arg3 - 12 + var110;
                        int var113 = var112;
                        int var114 = var71 + var112;
                        int var115 = var43.field3427 + var112 + 15;
                        int var116 = var115 - var84.field3753;
                        int var117 = var84.field3758 + var115;
                        if (var116 < var112) {
                            var113 = var116;
                        }
                        if (var117 > var114) {
                            var114 = var117;
                        }
                        int var118 = 0;
                        if (var46 != null) {
                            var118 = var46.field3427 + var112 + 15;
                            int var119 = var118 - var85.field3753;
                            int var120 = var85.field3758 + var118;
                            if (var119 < var113) {
                                ;
                            }
                            if (var120 > var114) {
                                ;
                            }
                        }
                        int var123 = 255;
                        if (var43.field3424 >= 0) {
                            var123 = (var108 << 8) / (var43.field3426 - var43.field3424);
                        }
                        if (var123 >= 0 && var123 < 255) {
                            if (var72 != null) {
                                var72.method5466(var95 + var111 - var55, var112, var123);
                            }
                            if (var76 != null) {
                                var76.method5466(var96 + var111 - var57, var112, var123);
                            }
                            if (var74 != null) {
                                for (int var124 = 0; var124 < var92; var124++) {
                                    var74.method5466(var52 * var124 + (var97 + var111 - var56), var112, var123);
                                }
                            }
                            if (var78 != null) {
                                var78.method5466(var101 + var111 - var58, var112, var123);
                            }
                            var84.method5151(var90, var98 + var111, var115, var43.field3416, 0, var123);
                            if (var46 != null) {
                                if (var59 != null) {
                                    var59.method5466(var102 + var111 - var67, var112, var123);
                                }
                                if (var61 != null) {
                                    var61.method5466(var103 + var111 - var69, var112, var123);
                                }
                                if (var60 != null) {
                                    for (int var125 = 0; var125 < var93; var125++) {
                                        var60.method5466(var64 * var125 + (var104 + var111 - var68), var112, var123);
                                    }
                                }
                                if (var62 != null) {
                                    var62.method5466(var105 + var111 - var70, var112, var123);
                                }
                                var85.method5151(var87, var106 + var111, var118, var46.field3416, 0, var123);
                            }
                        } else {
                            if (var72 != null) {
                                var72.method5460(var95 + var111 - var55, var112);
                            }
                            if (var76 != null) {
                                var76.method5460(var96 + var111 - var57, var112);
                            }
                            if (var74 != null) {
                                for (int var126 = 0; var126 < var92; var126++) {
                                    var74.method5460(var52 * var126 + (var97 + var111 - var56), var112);
                                }
                            }
                            if (var78 != null) {
                                var78.method5460(var101 + var111 - var58, var112);
                            }
                            var84.method5134(var90, var98 + var111, var115, var43.field3416 | 0xFF000000, 0);
                            if (var46 != null) {
                                if (var59 != null) {
                                    var59.method5460(var102 + var111 - var67, var112);
                                }
                                if (var61 != null) {
                                    var61.method5460(var103 + var111 - var69, var112);
                                }
                                if (var60 != null) {
                                    for (int var127 = 0; var127 < var93; var127++) {
                                        var60.method5460(var64 * var127 + (var104 + var111 - var68), var112);
                                    }
                                }
                                if (var62 != null) {
                                    var62.method5460(var105 + var111 - var70, var112);
                                }
                                var85.method5134(var87, var106 + var111, var118, var46.field3416 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("av.gy(I)V")
    public static final void method444() {
        field885 = 0;
        int var0 = (Statics.field502.field953 >> 7) + Statics.field1225;
        int var1 = (Statics.field502.field919 >> 7) + Statics.field64;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field885 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field885 = 1;
        }
        if (field885 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field885 = 0;
        }
    }

    @ObfuscatedName("bx.gn(Lbn;II)V")
    public static final void method1577(class65 arg0, int arg1) {
        method3124(arg0.field953, arg0.field919, arg1);
    }

    @ObfuscatedName("fz.ge(IIII)V")
    public static final void method3124(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field709 = -1;
            field830 = -1;
            return;
        }
        int var3 = method953(arg0, arg1, Statics.field517) - arg2;
        int var4 = arg0 - Statics.field2602;
        int var5 = var3 - Statics.field2413;
        int var6 = arg1 - Statics.field675;
        int var7 = class125.field1742[Statics.field61];
        int var8 = class125.field1743[Statics.field61];
        int var9 = class125.field1742[Statics.field96];
        int var10 = class125.field1743[Statics.field96];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field709 = field837 * var11 / var15 + field861 / 2;
            field830 = field837 * var14 / var15 + field753 / 2;
        } else {
            field709 = -1;
            field830 = -1;
        }
    }

    @ObfuscatedName("bm.gj(IIII)I")
    public static final int method953(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class51.field457[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class51.field460[var5][var3][var4] + class51.field460[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class51.field460[var5][var3][var4 + 1] + class51.field460[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("j.gf(ZLgh;B)V")
    public static final void method302(boolean arg0, class192 arg1) {
        field689 = arg0;
        if (!field689) {
            int var2 = arg1.method3309();
            int var3 = arg1.method3309();
            int var4 = arg1.method3325();
            Statics.field1924 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field1924[var5][var6] = arg1.method3328();
                }
            }
            Statics.field3204 = new int[var4];
            Statics.field3737 = new int[var4];
            Statics.field1160 = new int[var4];
            Statics.field551 = new byte[var4][];
            Statics.field282 = new byte[var4][];
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
                        Statics.field3204[var8] = var11;
                        Statics.field3737[var8] = Statics.field3315.method4285("m" + var9 + "_" + var10);
                        Statics.field1160[var8] = Statics.field3315.method4285("l" + var9 + "_" + var10);
                        var8++;
                    }
                }
            }
            method23(var2, var3, true);
            return;
        }
        int var12 = arg1.method3325();
        int var13 = arg1.method3361();
        boolean var14 = arg1.method3346() == 1;
        int var15 = arg1.method3325();
        arg1.method3586();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = arg1.method3590(1);
                    if (var19 == 1) {
                        field669[var16][var17][var18] = arg1.method3590(26);
                    } else {
                        field669[var16][var17][var18] = -1;
                    }
                }
            }
        }
        arg1.method3587();
        Statics.field1924 = new int[var15][4];
        for (int var20 = 0; var20 < var15; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field1924[var20][var21] = arg1.method3328();
            }
        }
        Statics.field3204 = new int[var15];
        Statics.field3737 = new int[var15];
        Statics.field1160 = new int[var15];
        Statics.field551 = new byte[var15][];
        Statics.field282 = new byte[var15][];
        int var22 = 0;
        for (int var23 = 0; var23 < 4; var23++) {
            for (int var24 = 0; var24 < 13; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    int var26 = field669[var23][var24][var25];
                    if (var26 != -1) {
                        int var27 = var26 >> 14 & 0x3FF;
                        int var28 = var26 >> 3 & 0x7FF;
                        int var29 = (var27 / 8 << 8) + var28 / 8;
                        for (int var30 = 0; var30 < var22; var30++) {
                            if (Statics.field3204[var30] == var29) {
                                var29 = -1;
                                break;
                            }
                        }
                        if (var29 != -1) {
                            Statics.field3204[var22] = var29;
                            int var31 = var29 >> 8 & 0xFF;
                            int var32 = var29 & 0xFF;
                            Statics.field3737[var22] = Statics.field3315.method4285("m" + var31 + "_" + var32);
                            Statics.field1160[var22] = Statics.field3315.method4285("l" + var31 + "_" + var32);
                            var22++;
                        }
                    }
                }
            }
        }
        method23(var12, var13, !var14);
    }

    @ObfuscatedName("e.gd(IIZI)V")
    public static final void method23(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field455 == arg0 && Statics.field1938 == arg1) {
            return;
        }
        Statics.field455 = arg0;
        Statics.field1938 = arg1;
        method1776(25);
        method1066(class240.field3122, true);
        int var3 = Statics.field1225;
        int var4 = Statics.field64;
        Statics.field1225 = (arg0 - 6) * 8;
        Statics.field64 = (arg1 - 6) * 8;
        int var5 = Statics.field1225 - var3;
        int var6 = Statics.field64 - var4;
        int var7 = Statics.field1225;
        int var8 = Statics.field64;
        for (int var9 = 0; var9 < 32768; var9++) {
            class74 var10 = field651[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field958[var11] -= var5;
                    var10.field944[var11] -= var6;
                }
                var10.field953 -= var5 * 128;
                var10.field919 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class62 var13 = field727[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field958[var14] -= var5;
                    var13.field944[var14] -= var6;
                }
                var13.field953 -= var5 * 128;
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
                        field739[var25][var21][var22] = field739[var25][var23][var24];
                    } else {
                        field739[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class64 var26 = (class64) field821.method3823(); var26 != null; var26 = (class64) field821.method3822()) {
            var26.field890 -= var5;
            var26.field891 -= var6;
            if (var26.field890 < 0 || var26.field891 < 0 || var26.field890 >= 104 || var26.field891 >= 104) {
                var26.method3812();
            }
        }
        if (field825 != 0) {
            field825 -= var5;
            field842 -= var6;
        }
        field849 = 0;
        field702 = false;
        Statics.field2602 -= var5 << 7;
        Statics.field675 -= var6 << 7;
        Statics.field1491 -= var5 << 7;
        Statics.field1260 -= var6 << 7;
        field836 = -1;
        field742.method3815();
        field741.method3815();
        for (int var27 = 0; var27 < 4; var27++) {
            field767[var27].method3167();
        }
    }

    @ObfuscatedName("bc.hp(ZB)V")
    public static final void method1542(boolean arg0) {
        method450();
        field798.field1261++;
        if (field798.field1261 < 50 && !arg0) {
            return;
        }
        field798.field1261 = 0;
        if (field658 || field798.method1888() == null) {
            return;
        }
        class175 var1 = class175.method3561(class172.field2204, field798.field1265);
        field798.method1884(var1);
        try {
            field798.method1883();
        } catch (IOException var3) {
            field658 = true;
        }
    }

    @ObfuscatedName("kn.ha(B)V")
    public static final void method5102() {
        method1542(false);
        field683 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field551.length; var1++) {
            if (Statics.field3737[var1] != -1 && Statics.field551[var1] == null) {
                Statics.field551[var1] = Statics.field3315.method4267(Statics.field3737[var1], 0);
                if (Statics.field551[var1] == null) {
                    var0 = false;
                    field683++;
                }
            }
            if (Statics.field1160[var1] != -1 && Statics.field282[var1] == null) {
                Statics.field282[var1] = Statics.field3315.method4340(Statics.field1160[var1], 0, Statics.field1924[var1]);
                if (Statics.field282[var1] == null) {
                    var0 = false;
                    field683++;
                }
            }
        }
        if (!var0) {
            field666 = 1;
            return;
        }
        field615 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field551.length; var3++) {
            byte[] var4 = Statics.field282[var3];
            if (var4 != null) {
                int var5 = (Statics.field3204[var3] >> 8) * 64 - Statics.field1225;
                int var6 = (Statics.field3204[var3] & 0xFF) * 64 - Statics.field64;
                if (field689) {
                    var5 = 10;
                    var6 = 10;
                }
                boolean var8 = true;
                class185 var9 = new class185(var4);
                int var10 = -1;
                label395: while (true) {
                    int var11 = var9.method3338();
                    if (var11 == 0) {
                        var2 &= var8;
                        break;
                    }
                    var10 += var11;
                    int var13 = 0;
                    boolean var14 = false;
                    while (true) {
                        while (!var14) {
                            int var16 = var9.method3498();
                            if (var16 == 0) {
                                continue label395;
                            }
                            var13 += var16 - 1;
                            int var17 = var13 & 0x3F;
                            int var18 = var13 >> 6 & 0x3F;
                            int var19 = var9.method3323() >> 2;
                            int var20 = var5 + var18;
                            int var21 = var6 + var17;
                            if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                                class271 var22 = class271.method1706(var10);
                                if (var19 != 22 || !field614 || var22.field3456 != 0 || var22.field3448 == 1 || var22.field3469) {
                                    if (!var22.method4676()) {
                                        field615++;
                                        var8 = false;
                                    }
                                    var14 = true;
                                }
                            }
                        }
                        int var15 = var9.method3498();
                        if (var15 == 0) {
                            break;
                        }
                        var9.method3323();
                    }
                }
            }
        }
        if (!var2) {
            field666 = 2;
            return;
        }
        if (field666 != 0) {
            method1066(class240.field3122 + class76.field1093 + class76.field1089 + 100 + "%" + class76.field1090, true);
        }
        method450();
        Statics.field186.method2681();
        for (int var23 = 0; var23 < 4; var23++) {
            field767[var23].method3167();
        }
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class51.field457[var24][var25][var26] = 0;
                }
            }
        }
        method450();
        class51.method3235();
        int var27 = Statics.field551.length;
        for (class70 var28 = (class70) class70.field1018.method3823(); var28 != null; var28 = (class70) class70.field1018.method3822()) {
            if (var28.field1014 != null) {
                Statics.field2095.method1910(var28.field1014);
                var28.field1014 = null;
            }
            if (var28.field1021 != null) {
                Statics.field2095.method1910(var28.field1021);
                var28.field1021 = null;
            }
        }
        class70.field1018.method3815();
        method1542(true);
        if (!field689) {
            for (int var29 = 0; var29 < var27; var29++) {
                int var30 = (Statics.field3204[var29] >> 8) * 64 - Statics.field1225;
                int var31 = (Statics.field3204[var29] & 0xFF) * 64 - Statics.field64;
                byte[] var32 = Statics.field551[var29];
                if (var32 != null) {
                    method450();
                    class51.method636(var32, var30, var31, Statics.field455 * 8 - 48, Statics.field1938 * 8 - 48, field767);
                }
            }
            for (int var33 = 0; var33 < var27; var33++) {
                int var34 = (Statics.field3204[var33] >> 8) * 64 - Statics.field1225;
                int var35 = (Statics.field3204[var33] & 0xFF) * 64 - Statics.field64;
                byte[] var36 = Statics.field551[var33];
                if (var36 == null && Statics.field1938 < 800) {
                    method450();
                    class51.method3223(var34, var35, 64, 64);
                }
            }
            method1542(true);
            for (int var37 = 0; var37 < var27; var37++) {
                byte[] var38 = Statics.field282[var37];
                if (var38 != null) {
                    int var39 = (Statics.field3204[var37] >> 8) * 64 - Statics.field1225;
                    int var40 = (Statics.field3204[var37] & 0xFF) * 64 - Statics.field64;
                    method450();
                    class51.method3011(var38, var39, var40, Statics.field186, field767);
                }
            }
        }
        if (field689) {
            for (int var41 = 0; var41 < 4; var41++) {
                method450();
                for (int var42 = 0; var42 < 13; var42++) {
                    for (int var43 = 0; var43 < 13; var43++) {
                        boolean var44 = false;
                        int var45 = field669[var41][var42][var43];
                        if (var45 != -1) {
                            int var46 = var45 >> 24 & 0x3;
                            int var47 = var45 >> 1 & 0x3;
                            int var48 = var45 >> 14 & 0x3FF;
                            int var49 = var45 >> 3 & 0x7FF;
                            int var50 = (var48 / 8 << 8) + var49 / 8;
                            for (int var51 = 0; var51 < Statics.field3204.length; var51++) {
                                if (Statics.field3204[var51] == var50 && Statics.field551[var51] != null) {
                                    class51.method4577(Statics.field551[var51], var41, var42 * 8, var43 * 8, var46, (var48 & 0x7) * 8, (var49 & 0x7) * 8, var47, field767);
                                    var44 = true;
                                    break;
                                }
                            }
                        }
                        if (!var44) {
                            class51.method183(var41, var42 * 8, var43 * 8);
                        }
                    }
                }
            }
            for (int var52 = 0; var52 < 13; var52++) {
                for (int var53 = 0; var53 < 13; var53++) {
                    int var54 = field669[0][var52][var53];
                    if (var54 == -1) {
                        class51.method3223(var52 * 8, var53 * 8, 8, 8);
                    }
                }
            }
            method1542(true);
            for (int var55 = 0; var55 < 4; var55++) {
                method450();
                for (int var56 = 0; var56 < 13; var56++) {
                    for (int var57 = 0; var57 < 13; var57++) {
                        int var58 = field669[var55][var56][var57];
                        if (var58 != -1) {
                            int var59 = var58 >> 24 & 0x3;
                            int var60 = var58 >> 1 & 0x3;
                            int var61 = var58 >> 14 & 0x3FF;
                            int var62 = var58 >> 3 & 0x7FF;
                            int var63 = (var61 / 8 << 8) + var62 / 8;
                            for (int var64 = 0; var64 < Statics.field3204.length; var64++) {
                                if (Statics.field3204[var64] == var63 && Statics.field282[var64] != null) {
                                    class51.method606(Statics.field282[var64], var55, var56 * 8, var57 * 8, var59, (var61 & 0x7) * 8, (var62 & 0x7) * 8, var60, Statics.field186, field767);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method1542(true);
        method450();
        class51.method3237(Statics.field186, field767);
        method1542(true);
        int var65 = class51.field458;
        if (var65 > Statics.field517) {
            var65 = Statics.field517;
        }
        if (var65 < Statics.field517 - 1) {
            int var66 = Statics.field517 - 1;
        }
        if (field614) {
            Statics.field186.method2682(class51.field458);
        } else {
            Statics.field186.method2682(0);
        }
        for (int var67 = 0; var67 < 104; var67++) {
            for (int var68 = 0; var68 < 104; var68++) {
                method1016(var67, var68);
            }
        }
        method450();
        for (class64 var69 = (class64) field821.method3823(); var69 != null; var69 = (class64) field821.method3822()) {
            if (var69.field899 == -1) {
                var69.field901 = 0;
                method952(var69);
            } else {
                var69.method3812();
            }
        }
        class271.field3471.method3725();
        if (Statics.field3284.method837()) {
            class175 var70 = class175.method3561(class172.field2215, field798.field1265);
            var70.field2323.method3528(1057001181);
            field798.method1884(var70);
        }
        if (!field689) {
            int var71 = (Statics.field455 - 6) / 8;
            int var72 = (Statics.field455 + 6) / 8;
            int var73 = (Statics.field1938 - 6) / 8;
            int var74 = (Statics.field1938 + 6) / 8;
            for (int var75 = var71 - 1; var75 <= var72 + 1; var75++) {
                for (int var76 = var73 - 1; var76 <= var74 + 1; var76++) {
                    if (var75 < var71 || var75 > var72 || var76 < var73 || var76 > var74) {
                        Statics.field3315.method4291("m" + var75 + "_" + var76);
                        Statics.field3315.method4291("l" + var75 + "_" + var76);
                    }
                }
            }
        }
        method1776(30);
        method450();
        Statics.field476 = (byte[][][]) null;
        Statics.field472 = (byte[][][]) null;
        Statics.field461 = (byte[][][]) null;
        Statics.field40 = (byte[][][]) null;
        Statics.field1005 = (int[][][]) null;
        Statics.field462 = (byte[][][]) null;
        Statics.field456 = (int[][]) null;
        Statics.field464 = null;
        Statics.field558 = null;
        Statics.field3403 = null;
        Statics.field465 = null;
        Statics.field62 = null;
        class175 var77 = class175.method3561(class172.field2265, field798.field1265);
        field798.method1884(var77);
        class48.method1390();
    }

    @ObfuscatedName("i.hi(II)V")
    public static final void method353(int arg0) {
        int[] var1 = Statics.field163.field3873;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class51.field457[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field186.method2715(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class51.field457[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field186.method2715(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field163.method5451();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class51.field457[arg0][var10][var9] & 0x18) == 0) {
                    method274(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class51.field457[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method274(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field853 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                long var13 = Statics.field186.method2710(Statics.field517, var11, var12);
                if (var13 != 0L) {
                    int var15 = class123.method4074(var13);
                    int var16 = class271.method1706(var15).field3459;
                    if (var16 >= 0) {
                        field847[field853] = class258.method3226(var16).method4452(false);
                        field838[field853] = var11;
                        field855[field853] = var12;
                        field853++;
                    }
                }
            }
        }
        Statics.field3231.method5418();
    }

    @ObfuscatedName("p.hy(IIIIII)V")
    public static final void method274(int arg0, int arg1, int arg2, int arg3, int arg4) {
        long var5 = Statics.field186.method2707(arg0, arg1, arg2);
        if (var5 != 0L) {
            int var7 = Statics.field186.method2711(arg0, arg1, arg2, var5);
            int var8 = var7 >> 6 & 0x3;
            int var9 = var7 & 0x1F;
            int var10 = arg3;
            if (class123.method3556(var5)) {
                var10 = arg4;
            }
            int[] var11 = Statics.field163.field3873;
            int var12 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var13 = class123.method4074(var5);
            class271 var14 = class271.method1706(var13);
            if (var14.field3460 == -1) {
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
                class323 var15 = Statics.field1931[var14.field3460];
                if (var15 != null) {
                    int var16 = (var14.field3446 * 4 - var15.field3864) / 2;
                    int var17 = (var14.field3447 * 4 - var15.field3862) / 2;
                    var15.method5435(arg1 * 4 + 48 + var16, (104 - arg2 - var14.field3447) * 4 + 48 + var17);
                }
            }
        }
        long var18 = Statics.field186.method2709(arg0, arg1, arg2);
        if (var18 != 0L) {
            int var20 = Statics.field186.method2711(arg0, arg1, arg2, var18);
            int var21 = var20 >> 6 & 0x3;
            int var22 = var20 & 0x1F;
            int var23 = class123.method4074(var18);
            class271 var24 = class271.method1706(var23);
            if (var24.field3460 != -1) {
                class323 var25 = Statics.field1931[var24.field3460];
                if (var25 != null) {
                    int var26 = (var24.field3446 * 4 - var25.field3864) / 2;
                    int var27 = (var24.field3447 * 4 - var25.field3862) / 2;
                    var25.method5435(arg1 * 4 + 48 + var26, (104 - arg2 - var24.field3447) * 4 + 48 + var27);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (class123.method3556(var18)) {
                    var28 = 15597568;
                }
                int[] var29 = Statics.field163.field3873;
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
        long var31 = Statics.field186.method2710(arg0, arg1, arg2);
        if (var31 == 0L) {
            return;
        }
        int var33 = class123.method4074(var31);
        class271 var34 = class271.method1706(var33);
        if (var34.field3460 == -1) {
            return;
        }
        class323 var35 = Statics.field1931[var34.field3460];
        if (var35 != null) {
            int var36 = (var34.field3446 * 4 - var35.field3864) / 2;
            int var37 = (var34.field3447 * 4 - var35.field3862) / 2;
            var35.method5435(arg1 * 4 + 48 + var36, (104 - arg2 - var34.field3447) * 4 + 48 + var37);
        }
    }

    @ObfuscatedName("client.hr(Lcu;I)Z")
    public final boolean method1093(class90 arg0) {
        class160 var2 = arg0.method1888();
        class192 var3 = arg0.field1266;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1267 == null) {
                if (arg0.field1269) {
                    if (!var2.method3085(1)) {
                        return false;
                    }
                    var2.method3089(arg0.field1266.field2399, 0, 1);
                    arg0.field1270 = 0;
                    arg0.field1269 = false;
                }
                var3.field2397 = 0;
                if (var3.method3596()) {
                    if (!var2.method3085(1)) {
                        return false;
                    }
                    var2.method3089(arg0.field1266.field2399, 1, 1);
                    arg0.field1270 = 0;
                }
                arg0.field1269 = true;
                class171[] var4 = new class171[] { class171.field2169, class171.field2161, class171.field2148, class171.field2103, class171.field2104, class171.field2147, class171.field2106, class171.field2149, class171.field2176, class171.field2183, class171.field2130, class171.field2111, class171.field2121, class171.field2113, class171.field2114, class171.field2115, class171.field2116, class171.field2117, class171.field2118, class171.field2139, class171.field2178, class171.field2112, class171.field2122, class171.field2123, class171.field2124, class171.field2125, class171.field2126, class171.field2127, class171.field2136, class171.field2129, class171.field2140, class171.field2109, class171.field2132, class171.field2133, class171.field2101, class171.field2135, class171.field2100, class171.field2171, class171.field2138, class171.field2143, class171.field2180, class171.field2141, class171.field2142, class171.field2120, class171.field2144, class171.field2145, class171.field2146, class171.field2119, class171.field2158, class171.field2134, class171.field2150, class171.field2151, class171.field2152, class171.field2153, class171.field2154, class171.field2128, class171.field2156, class171.field2131, class171.field2108, class171.field2159, class171.field2160, class171.field2137, class171.field2162, class171.field2163, class171.field2164, class171.field2165, class171.field2166, class171.field2167, class171.field2105, class171.field2102, class171.field2170, class171.field2173, class171.field2172, class171.field2110, class171.field2174, class171.field2175, class171.field2181, class171.field2177, class171.field2168, class171.field2179, class171.field2107, class171.field2157, class171.field2182, class171.field2155, class171.field2184 };
                int var6 = var3.method3607();
                if (var6 < 0 || var6 >= var4.length) {
                    throw new IOException(var6 + " " + var3.field2397);
                }
                arg0.field1267 = var4[var6];
                arg0.field1268 = arg0.field1267.field2186;
            }
            if (arg0.field1268 == -1) {
                if (!var2.method3085(1)) {
                    return false;
                }
                arg0.method1888().method3089(var3.field2399, 0, 1);
                arg0.field1268 = var3.field2399[0] & 0xFF;
            }
            if (arg0.field1268 == -2) {
                if (!var2.method3085(2)) {
                    return false;
                }
                arg0.method1888().method3089(var3.field2399, 0, 2);
                var3.field2397 = 0;
                arg0.field1268 = var3.method3325();
            }
            if (!var2.method3085(arg0.field1268)) {
                return false;
            }
            var3.field2397 = 0;
            var2.method3089(var3.field2399, 0, arg0.field1268);
            arg0.field1270 = 0;
            field660.method4881();
            arg0.field1274 = arg0.field1273;
            arg0.field1273 = arg0.field1264;
            arg0.field1264 = arg0.field1267;
            if (class171.field2108 == arg0.field1267) {
                boolean var7 = var3.method3323() == 1;
                if (var7) {
                    Statics.field484 = class187.method2864() - var3.method3505();
                    Statics.field483 = new class2(var3, true);
                } else {
                    Statics.field483 = null;
                }
                field807 = field796;
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2166 == arg0.field1267) {
                int var8 = var3.method3328();
                int var9 = var3.method3325();
                if (var8 < -70000) {
                    var9 += 32768;
                }
                class233 var10;
                if (var8 >= 0) {
                    var10 = class233.method130(var8);
                } else {
                    var10 = null;
                }
                while (var3.field2397 < arg0.field1268) {
                    int var11 = var3.method3498();
                    int var12 = var3.method3325();
                    int var13 = 0;
                    if (var12 != 0) {
                        var13 = var3.method3323();
                        if (var13 == 255) {
                            var13 = var3.method3328();
                        }
                    }
                    if (var10 != null && var11 >= 0 && var11 < var10.field2775.length) {
                        var10.field2775[var11] = var12;
                        var10.field2646[var11] = var13;
                    }
                    class55.method1782(var9, var11, var12 - 1, var13);
                }
                if (var10 != null) {
                    method956(var10);
                }
                method3560();
                field792[++field800 - 1 & 0x1F] = var9 & 0x7FFF;
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2140 == arg0.field1267) {
                field702 = false;
                for (int var14 = 0; var14 < 5; var14++) {
                    field856[var14] = false;
                }
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2151 == arg0.field1267) {
                Statics.field2415 = var3.method3352();
                Statics.field2058 = var3.method3323();
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2174 == arg0.field1267) {
                field702 = true;
                Statics.field2098 = var3.method3323();
                Statics.field1391 = var3.method3323();
                Statics.field48 = var3.method3325();
                Statics.field222 = var3.method3323();
                Statics.field1492 = var3.method3323();
                if (Statics.field1492 >= 100) {
                    int var15 = Statics.field2098 * 128 + 64;
                    int var16 = Statics.field1391 * 128 + 64;
                    int var17 = method953(var15, var16, Statics.field517) - Statics.field48;
                    int var18 = var15 - Statics.field2602;
                    int var19 = var17 - Statics.field2413;
                    int var20 = var16 - Statics.field675;
                    int var21 = (int) Math.sqrt((double) (var18 * var18 + var20 * var20));
                    Statics.field61 = (int) (Math.atan2((double) var19, (double) var21) * 325.949D) & 0x7FF;
                    Statics.field96 = (int) (Math.atan2((double) var18, (double) var20) * -325.949D) & 0x7FF;
                    if (Statics.field61 < 128) {
                        Statics.field61 = 128;
                    }
                    if (Statics.field61 > 383) {
                        Statics.field61 = 383;
                    }
                }
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2147 == arg0.field1267) {
                int var22 = var3.method3371();
                int var23 = var3.method3361();
                int var24 = var23 >> 10 & 0x1F;
                int var25 = var23 >> 5 & 0x1F;
                int var26 = var23 & 0x1F;
                int var27 = (var26 << 3) + (var24 << 19) + (var25 << 11);
                class233 var28 = class233.method130(var22);
                if (var28.field2681 != var27) {
                    var28.field2681 = var27;
                    method956(var28);
                }
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2101 == arg0.field1267) {
                int var29 = var3.method3328();
                boolean var30 = var3.method3354() == 1;
                class233 var31 = class233.method130(var29);
                if (var31.field2676 != var30) {
                    var31.field2676 = var30;
                    method956(var31);
                }
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2176 == arg0.field1267) {
                int var32 = var3.method3328();
                if (field764 != var32) {
                    field764 = var32;
                    method3624();
                }
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2121 == arg0.field1267) {
                method1684(class174.field2304);
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2155 == arg0.field1267) {
                int var33 = var3.method3361();
                if (var33 == 65535) {
                    var33 = -1;
                }
                method568(var33);
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2139 == arg0.field1267) {
                int var34 = var3.method3524();
                int var35 = var3.method3361();
                if (var35 == 65535) {
                    var35 = -1;
                }
                if (field705 != 0 && var35 != -1) {
                    class220.method3559(Statics.field1500, var35, 0, field705, false);
                    field846 = true;
                }
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2137 == arg0.field1267) {
                Statics.field191.method1547(var3, arg0.field1268);
                field667 = field796;
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2165 == arg0.field1267) {
                int var36 = var3.method3328();
                int var37 = var3.method3325();
                if (var36 < -70000) {
                    var37 += 32768;
                }
                class233 var38;
                if (var36 >= 0) {
                    var38 = class233.method130(var36);
                } else {
                    var38 = null;
                }
                if (var38 != null) {
                    for (int var39 = 0; var39 < var38.field2775.length; var39++) {
                        var38.field2775[var39] = 0;
                        var38.field2646[var39] = 0;
                    }
                }
                class55 var40 = (class55) class55.field499.method3759((long) var37);
                if (var40 != null) {
                    for (int var41 = 0; var41 < var40.field497.length; var41++) {
                        var40.field497[var41] = -1;
                        var40.field495[var41] = 0;
                    }
                }
                int var42 = var3.method3325();
                for (int var43 = 0; var43 < var42; var43++) {
                    int var44 = var3.method3346();
                    if (var44 == 255) {
                        var44 = var3.method3371();
                    }
                    int var45 = var3.method3325();
                    if (var38 != null && var43 < var38.field2775.length) {
                        var38.field2775[var43] = var45;
                        var38.field2646[var43] = var44;
                    }
                    class55.method1782(var37, var43, var45 - 1, var44);
                }
                if (var38 != null) {
                    method956(var38);
                }
                method3560();
                field792[++field800 - 1 & 0x1F] = var37 & 0x7FFF;
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2152 == arg0.field1267) {
                method1684(class174.field2303);
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2109 == arg0.field1267) {
                int var46 = var3.method3373();
                class233 var47 = class233.method130(var46);
                var47.field2710 = 3;
                var47.field2700 = Statics.field502.field582.method4154();
                method956(var47);
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2102 == arg0.field1267) {
                int var48 = arg0.field1268;
                int var49 = var3.field2397;
                class84.field1211 = 0;
                int var50 = 0;
                var3.method3586();
                for (int var51 = 0; var51 < class84.field1204; var51++) {
                    int var52 = class84.field1209[var51];
                    if ((class84.field1201[var52] & 0x1) == 0) {
                        if (var50 > 0) {
                            var50--;
                            class84.field1201[var52] = (byte) (class84.field1201[var52] | 0x2);
                        } else {
                            int var53 = var3.method3590(1);
                            if (var53 == 0) {
                                var50 = class84.method1703(var3);
                                class84.field1201[var52] = (byte) (class84.field1201[var52] | 0x2);
                            } else {
                                class84.method2863(var3, var52);
                            }
                        }
                    }
                }
                var3.method3587();
                if (var50 != 0) {
                    throw new RuntimeException();
                }
                var3.method3586();
                for (int var54 = 0; var54 < class84.field1204; var54++) {
                    int var55 = class84.field1209[var54];
                    if ((class84.field1201[var55] & 0x1) != 0) {
                        if (var50 > 0) {
                            var50--;
                            class84.field1201[var55] = (byte) (class84.field1201[var55] | 0x2);
                        } else {
                            int var56 = var3.method3590(1);
                            if (var56 == 0) {
                                var50 = class84.method1703(var3);
                                class84.field1201[var55] = (byte) (class84.field1201[var55] | 0x2);
                            } else {
                                class84.method2863(var3, var55);
                            }
                        }
                    }
                }
                var3.method3587();
                if (var50 != 0) {
                    throw new RuntimeException();
                }
                var3.method3586();
                for (int var57 = 0; var57 < class84.field1205; var57++) {
                    int var58 = class84.field1207[var57];
                    if ((class84.field1201[var58] & 0x1) != 0) {
                        if (var50 > 0) {
                            var50--;
                            class84.field1201[var58] = (byte) (class84.field1201[var58] | 0x2);
                        } else {
                            int var59 = var3.method3590(1);
                            if (var59 == 0) {
                                var50 = class84.method1703(var3);
                                class84.field1201[var58] = (byte) (class84.field1201[var58] | 0x2);
                            } else if (class84.method4073(var3, var58)) {
                                class84.field1201[var58] = (byte) (class84.field1201[var58] | 0x2);
                            }
                        }
                    }
                }
                var3.method3587();
                if (var50 != 0) {
                    throw new RuntimeException();
                }
                var3.method3586();
                for (int var60 = 0; var60 < class84.field1205; var60++) {
                    int var61 = class84.field1207[var60];
                    if ((class84.field1201[var61] & 0x1) == 0) {
                        if (var50 > 0) {
                            var50--;
                            class84.field1201[var61] = (byte) (class84.field1201[var61] | 0x2);
                        } else {
                            int var62 = var3.method3590(1);
                            if (var62 == 0) {
                                var50 = class84.method1703(var3);
                                class84.field1201[var61] = (byte) (class84.field1201[var61] | 0x2);
                            } else if (class84.method4073(var3, var61)) {
                                class84.field1201[var61] = (byte) (class84.field1201[var61] | 0x2);
                            }
                        }
                    }
                }
                var3.method3587();
                if (var50 != 0) {
                    throw new RuntimeException();
                }
                class84.field1204 = 0;
                class84.field1205 = 0;
                for (int var63 = 1; var63 < 2048; var63++) {
                    class84.field1201[var63] = (byte) (class84.field1201[var63] >> 1);
                    class62 var64 = field727[var63];
                    if (var64 == null) {
                        class84.field1207[++class84.field1205 - 1] = var63;
                    } else {
                        class84.field1209[++class84.field1204 - 1] = var63;
                    }
                }
                for (int var65 = 0; var65 < class84.field1211; var65++) {
                    int var66 = class84.field1212[var65];
                    class62 var67 = field727[var66];
                    int var68 = var3.method3323();
                    if ((var68 & 0x20) != 0) {
                        var68 += var3.method3323() << 8;
                    }
                    byte var69 = -1;
                    if ((var68 & 0x200) != 0) {
                        var67.field945 = var3.method3357();
                        var67.field912 = var3.method3355();
                        var67.field928 = var3.method3357();
                        var67.field947 = var3.method3324();
                        var67.field930 = var3.method3362() + field633;
                        var67.field948 = var3.method3325() + field633;
                        var67.field924 = var3.method3362();
                        if (var67.field591) {
                            var67.field945 += var67.field579;
                            var67.field912 += var67.field598;
                            var67.field928 += var67.field579;
                            var67.field947 += var67.field598;
                            var67.field957 = 0;
                        } else {
                            var67.field945 += var67.field958[0];
                            var67.field912 += var67.field944[0];
                            var67.field928 += var67.field958[0];
                            var67.field947 += var67.field944[0];
                            var67.field957 = 1;
                        }
                        var67.field962 = 0;
                    }
                    if ((var68 & 0x1) != 0) {
                        var67.field929 = var3.method3325();
                        if (var67.field929 == 65535) {
                            var67.field929 = -1;
                        }
                    }
                    if ((var68 & 0x2) != 0) {
                        int var70 = var3.method3354();
                        byte[] var71 = new byte[var70];
                        class185 var72 = new class185(var71);
                        var3.method3374(var71, 0, var70);
                        class84.field1213[var66] = var72;
                        var67.method1056(var72);
                    }
                    if ((var68 & 0x100) != 0) {
                        class84.field1202[var66] = var3.method3355();
                    }
                    if ((var68 & 0x40) != 0) {
                        var67.field959 = var3.method3435();
                        if (var67.field959.charAt(0) == '~') {
                            var67.field959 = var67.field959.substring(1);
                            class86.method1011(2, var67.field573.method5059(), var67.field959);
                        } else if (Statics.field502 == var67) {
                            class86.method1011(2, var67.field573.method5059(), var67.field959);
                        }
                        var67.field917 = false;
                        var67.field920 = 0;
                        var67.field921 = 0;
                        var67.field933 = 150;
                    }
                    if ((var68 & 0x400) != 0) {
                        var69 = var3.method3324();
                    }
                    if ((var68 & 0x800) != 0) {
                        for (int var73 = 0; var73 < 3; var73++) {
                            var67.field575[var73] = var3.method3435();
                        }
                    }
                    if ((var68 & 0x10) != 0) {
                        var67.field931 = var3.method3309();
                        if (var67.field957 == 0) {
                            var67.field954 = var67.field931;
                            var67.field931 = -1;
                        }
                    }
                    if ((var68 & 0x4) != 0) {
                        int var74 = var3.method3346();
                        if (var74 > 0) {
                            for (int var75 = 0; var75 < var74; var75++) {
                                int var76 = -1;
                                int var77 = -1;
                                int var78 = -1;
                                int var79 = var3.method3498();
                                if (var79 == 32767) {
                                    var79 = var3.method3498();
                                    var77 = var3.method3498();
                                    var76 = var3.method3498();
                                    var78 = var3.method3498();
                                } else if (var79 == 32766) {
                                    var79 = -1;
                                } else {
                                    var77 = var3.method3498();
                                }
                                int var80 = var3.method3498();
                                var67.method1467(var79, var77, var76, var78, field633, var80);
                            }
                        }
                        int var81 = var3.method3352();
                        if (var81 > 0) {
                            for (int var82 = 0; var82 < var81; var82++) {
                                int var83 = var3.method3498();
                                int var84 = var3.method3498();
                                if (var84 == 32767) {
                                    var67.method1464(var83);
                                } else {
                                    int var85 = var3.method3498();
                                    int var86 = var3.method3346();
                                    int var87 = var84 > 0 ? var3.method3352() : var86;
                                    var67.method1469(var83, field633, var84, var85, var86, var87);
                                }
                            }
                        }
                    }
                    if ((var68 & 0x1000) != 0) {
                        var67.field940 = var3.method3362();
                        int var88 = var3.method3371();
                        var67.field941 = var88 >> 16;
                        var67.field943 = (var88 & 0xFFFF) + field633;
                        var67.field946 = 0;
                        var67.field950 = 0;
                        if (var67.field943 > field633) {
                            var67.field946 = -1;
                        }
                        if (var67.field940 == 65535) {
                            var67.field940 = -1;
                        }
                    }
                    if ((var68 & 0x80) != 0) {
                        int var89 = var3.method3362();
                        class245 var90 = (class245) class180.method3213(class245.method2948(), var3.method3354());
                        boolean var91 = var3.method3354() == 1;
                        int var92 = var3.method3346();
                        int var93 = var3.field2397;
                        if (var67.field573 != null && var67.field582 != null) {
                            boolean var94 = false;
                            if (var90.field3183 && Statics.field191.method1551(var67.field573)) {
                                var94 = true;
                            }
                            if (!var94 && field885 == 0 && !var67.field572) {
                                class84.field1203.field2397 = 0;
                                var3.method3326(class84.field1203.field2399, 0, var92);
                                class84.field1203.field2397 = 0;
                                String var95 = class302.method5126(class308.method3121(class303.method4522(class84.field1203)));
                                var67.field959 = var95.trim();
                                var67.field920 = var89 >> 8;
                                var67.field921 = var89 & 0xFF;
                                var67.field933 = 150;
                                var67.field917 = var91;
                                var67.field918 = Statics.field502 != var67 && var90.field3183 && field829 != "" && var95.toLowerCase().indexOf(field829) == -1;
                                int var96;
                                if (var90.field3182) {
                                    var96 = var91 ? 91 : 1;
                                } else {
                                    var96 = var91 ? 90 : 2;
                                }
                                if (var90.field3177 == -1) {
                                    class86.method1011(var96, var67.field573.method5059(), var95);
                                } else {
                                    int var98 = var90.field3177;
                                    String var99 = "<img=" + var98 + ">";
                                    class86.method1011(var96, var99 + var67.field573.method5059(), var95);
                                }
                            }
                        }
                        var3.field2397 = var92 + var93;
                    }
                    if ((var68 & 0x8) != 0) {
                        int var100 = var3.method3362();
                        if (var100 == 65535) {
                            var100 = -1;
                        }
                        int var101 = var3.method3352();
                        method4364(var67, var100, var101);
                    }
                    if (var67.field591) {
                        if (var69 == 127) {
                            var67.method1021(var67.field579, var67.field598);
                        } else {
                            byte var102;
                            if (var69 == -1) {
                                var102 = class84.field1202[var66];
                            } else {
                                var102 = var69;
                            }
                            var67.method1027(var67.field579, var67.field598, var102);
                        }
                    }
                }
                if (var3.field2397 - var49 != var48) {
                    throw new RuntimeException(var3.field2397 - var49 + " " + var48);
                }
                if (Statics.field3774 != null) {
                    field682 = field633;
                    Statics.field3774.method4425();
                    for (int var103 = 0; var103 < field727.length; var103++) {
                        if (field727[var103] != null) {
                            Statics.field3774.method4413((field727[var103].field953 >> 7) + Statics.field1225, (field727[var103].field919 >> 7) + Statics.field64);
                        }
                    }
                }
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2164 == arg0.field1267) {
                for (int var104 = 0; var104 < Statics.field3286; var104++) {
                    class257 var105 = class257.method3120(var104);
                    if (var105 != null) {
                        class228.field2615[var104] = 0;
                        class228.field2617[var104] = 0;
                    }
                }
                method3560();
                field757 += 32;
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2111 == arg0.field1267) {
                int var106 = var3.method3323();
                method92(var106);
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2125 == arg0.field1267) {
                field825 = var3.method3323();
                if (field825 == 255) {
                    field825 = 0;
                }
                field842 = var3.method3323();
                if (field842 == 255) {
                    field842 = 0;
                }
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2154 == arg0.field1267) {
                int var107 = var3.method3309();
                if (var107 == 65535) {
                    var107 = -1;
                }
                int var108 = var3.method3371();
                int var109 = var3.method3373();
                int var110 = var3.method3362();
                if (var110 == 65535) {
                    var110 = -1;
                }
                for (int var111 = var107; var111 <= var110; var111++) {
                    long var112 = ((long) var108 << 32) + (long) var111;
                    class207 var114 = field813.method3759(var112);
                    if (var114 != null) {
                        var114.method3812();
                    }
                    field813.method3761(new class214(var109), var112);
                }
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2172 == arg0.field1267) {
                if (arg0.field1268 == 0) {
                    Statics.field1960 = null;
                } else {
                    if (Statics.field1960 == null) {
                        Statics.field1960 = new class296(Statics.field459, Statics.field3284);
                    }
                    Statics.field1960.method5093(var3);
                }
                field805 = field796;
                Statics.field180 = true;
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2132 == arg0.field1267) {
                method3560();
                int var115 = var3.method3373();
                int var116 = var3.method3354();
                int var117 = var3.method3354();
                field745[var116] = var115;
                field756[var116] = var117;
                field744[var116] = 1;
                for (int var118 = 0; var118 < 98; var118++) {
                    if (var115 >= class237.field2833[var118]) {
                        field744[var116] = var118 + 2;
                    }
                }
                field704[++field802 - 1 & 0x1F] = var116;
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2106 == arg0.field1267) {
                class319.method2868(var3, arg0.field1268);
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2131 == arg0.field1267) {
                String var119 = var3.method3435();
                String var120 = class302.method5126(class308.method3121(class303.method4522(var3)));
                class86.method1011(6, var119, var120);
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2127 == arg0.field1267) {
                int var121 = var3.method3309();
                int var122 = var3.method3361();
                int var123 = var3.method3328();
                int var124 = var3.method3362();
                class233 var125 = class233.method130(var123);
                if (var125.field2733 != var124 || var125.field2708 != var122 || var125.field2689 != var121) {
                    var125.field2733 = var124;
                    var125.field2708 = var122;
                    var125.field2689 = var121;
                    method956(var125);
                }
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2159 == arg0.field1267) {
                if (field816 != -1) {
                    method4739(field816, 0);
                }
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2157 == arg0.field1267) {
                int var126 = var3.method3328();
                int var127 = var3.method3328();
                int var128 = 0;
                if (Statics.field2355 == null || !Statics.field2355.isValid()) {
                    try {
                        Iterator var129 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                        while (var129.hasNext()) {
                            GarbageCollectorMXBean var130 = (GarbageCollectorMXBean) var129.next();
                            if (var130.isValid()) {
                                Statics.field2355 = var130;
                                field389 = -1L;
                                field420 = -1L;
                            }
                        }
                    } catch (Throwable var286) {
                    }
                }
                if (Statics.field2355 != null) {
                    long var132 = class187.method2864();
                    long var134 = Statics.field2355.getCollectionTime();
                    if (field420 != -1L) {
                        long var136 = var134 - field420;
                        long var138 = var132 - field389;
                        if (var138 != 0L) {
                            var128 = (int) (var136 * 100L / var138);
                        }
                    }
                    field420 = var134;
                    field389 = var132;
                }
                class175 var142 = class175.method3561(class172.field2271, field798.field1265);
                var142.field2323.method3349(var128);
                var142.field2323.method3351(field397);
                var142.field2323.method3368(var126);
                var142.field2323.method3368(var127);
                field798.method1884(var142);
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2128 == arg0.field1267) {
                Statics.field2415 = var3.method3354();
                Statics.field2058 = var3.method3346();
                while (var3.field2397 < arg0.field1268) {
                    int var143 = var3.method3323();
                    class174[] var144 = new class174[] { class174.field2305, class174.field2301, class174.field2302, class174.field2300, class174.field2304, class174.field2310, class174.field2306, class174.field2307, class174.field2303, class174.field2309 };
                    class174 var145 = var144[var143];
                    method1684(var145);
                }
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2124 == arg0.field1267) {
                String var146 = var3.method3435();
                Object[] var147 = new Object[var146.length() + 1];
                for (int var148 = var146.length() - 1; var148 >= 0; var148--) {
                    if (var146.charAt(var148) == 's') {
                        var147[var148 + 1] = var3.method3435();
                    } else {
                        var147[var148 + 1] = Integer.valueOf(var3.method3328());
                    }
                }
                var147[0] = Integer.valueOf(var3.method3328());
                class58 var149 = new class58();
                var149.field545 = var147;
                class71.method1800(var149);
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2107 == arg0.field1267) {
                int var150 = var3.method3372();
                int var151 = var3.method3325();
                class228.field2615[var151] = var150;
                if (class228.field2617[var151] != var150) {
                    class228.field2617[var151] = var150;
                }
                method2960(var151);
                field797[++field757 - 1 & 0x1F] = var151;
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2120 == arg0.field1267) {
                int var152 = var3.method3328();
                int var153 = var3.method3371();
                class57 var154 = (class57) field771.method3759((long) var152);
                class57 var155 = (class57) field771.method3759((long) var153);
                if (var155 != null) {
                    method937(var155, var154 == null || var154.field527 != var155.field527);
                }
                if (var154 != null) {
                    var154.method3812();
                    field771.method3761(var154, (long) var153);
                }
                class233 var156 = class233.method130(var152);
                if (var156 != null) {
                    method956(var156);
                }
                class233 var157 = class233.method130(var153);
                if (var157 != null) {
                    method956(var157);
                    method62(Statics.field2763[var157.field2656 >>> 16], var157, true);
                }
                if (field816 != -1) {
                    method4739(field816, 1);
                }
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2146 == arg0.field1267) {
                int var158 = var3.method3362();
                field816 = var158;
                this.method1085(false);
                method4622(var158);
                class71.method935(field816);
                for (int var159 = 0; var159 < 100; var159++) {
                    field875[var159] = true;
                }
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2118 == arg0.field1267) {
                method3560();
                field779 = var3.method3540();
                field848 = field796;
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2175 == arg0.field1267) {
                int var160 = var3.method3365();
                int var161 = var3.method3371();
                class233 var162 = class233.method130(var161);
                if (var162.field2703 != var160 || var160 == -1) {
                    var162.field2703 = var160;
                    var162.field2677 = 0;
                    var162.field2784 = 0;
                    method956(var162);
                }
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2171 == arg0.field1267) {
                method4326(var3.method3435());
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2162 == arg0.field1267) {
                method1684(class174.field2309);
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2177 == arg0.field1267) {
                method1684(class174.field2305);
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2145 == arg0.field1267) {
                method3560();
                field778 = var3.method3323();
                field848 = field796;
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2115 == arg0.field1267) {
                int var163 = var3.method3323();
                if (var3.method3323() == 0) {
                    field878[var163] = new class5();
                    var3.field2397 += 18;
                } else {
                    var3.field2397--;
                    field878[var163] = new class5(var3, false);
                }
                field806 = field796;
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2168 == arg0.field1267) {
                for (int var164 = 0; var164 < class228.field2617.length; var164++) {
                    if (class228.field2617[var164] != class228.field2615[var164]) {
                        class228.field2617[var164] = class228.field2615[var164];
                        method2960(var164);
                        field797[++field757 - 1 & 0x1F] = var164;
                    }
                }
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2112 == arg0.field1267) {
                int var165 = var3.method3373();
                int var166 = var3.method3361();
                class233 var167 = class233.method130(var165);
                if (var167.field2710 != 2 || var167.field2700 != var166) {
                    var167.field2710 = 2;
                    var167.field2700 = var166;
                    method956(var167);
                }
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2126 == arg0.field1267) {
                int var168 = var3.method3362();
                int var169 = var3.method3323();
                int var170 = var3.method3371();
                class57 var171 = (class57) field771.method3759((long) var170);
                if (var171 != null) {
                    method937(var171, var171.field527 != var168);
                }
                method1871(var170, var168, var169);
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2114 == arg0.field1267) {
                field828 = var3.method3354();
                field630 = var3.method3352();
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2100 == arg0.field1267) {
                method1684(class174.field2301);
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2148 == arg0.field1267) {
                int var172 = var3.method3362();
                if (var172 == 65535) {
                    var172 = -1;
                }
                int var173 = var3.method3371();
                int var174 = var3.method3373();
                class233 var175 = class233.method130(var173);
                if (var175.field2655) {
                    var175.field2783 = var172;
                    var175.field2661 = var174;
                    class272 var177 = class272.method2892(var172);
                    var175.field2733 = var177.field3498;
                    var175.field2708 = var177.field3499;
                    var175.field2755 = var177.field3532;
                    var175.field2705 = var177.field3501;
                    var175.field2706 = var177.field3517;
                    var175.field2689 = var177.field3497;
                    if (var177.field3503 == 1) {
                        var175.field2751 = 1;
                    } else {
                        var175.field2751 = 2;
                    }
                    if (var175.field2711 > 0) {
                        var175.field2689 = var175.field2689 * 32 / var175.field2711;
                    } else if (var175.field2667 > 0) {
                        var175.field2689 = var175.field2689 * 32 / var175.field2667;
                    }
                    method956(var175);
                } else if (var172 == -1) {
                    var175.field2710 = 0;
                    arg0.field1267 = null;
                    return true;
                } else {
                    class272 var176 = class272.method2892(var172);
                    var175.field2710 = 4;
                    var175.field2700 = var172;
                    var175.field2733 = var176.field3498;
                    var175.field2708 = var176.field3499;
                    var175.field2689 = var176.field3497 * 100 / var174;
                    method956(var175);
                }
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2173 == arg0.field1267) {
                int var178 = var3.method3365();
                int var179 = var3.method3365();
                int var180 = var3.method3328();
                class233 var181 = class233.method130(var180);
                if (var181.field2665 != var179 || var181.field2666 != var178 || var181.field2734 != 0 || var181.field2662 != 0) {
                    var181.field2665 = var179;
                    var181.field2666 = var178;
                    var181.field2734 = 0;
                    var181.field2662 = 0;
                    method956(var181);
                    this.method1241(var181);
                    if (var181.field2658 == 0) {
                        method62(Statics.field2763[var180 >> 16], var181, false);
                    }
                }
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2156 == arg0.field1267) {
                Statics.field191.method1556();
                field667 = field796;
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2183 == arg0.field1267) {
                int var182 = var3.method3328();
                int var183 = var3.method3309();
                class233 var184 = class233.method130(var182);
                if (var184.field2710 != 1 || var184.field2700 != var183) {
                    var184.field2710 = 1;
                    var184.field2700 = var183;
                    method956(var184);
                }
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2141 == arg0.field1267) {
                method1684(class174.field2306);
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2136 == arg0.field1267) {
                for (int var185 = 0; var185 < field727.length; var185++) {
                    if (field727[var185] != null) {
                        field727[var185].field935 = -1;
                    }
                }
                for (int var186 = 0; var186 < field651.length; var186++) {
                    if (field651[var186] != null) {
                        field651[var186].field935 = -1;
                    }
                }
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2184 == arg0.field1267) {
                Statics.field191.field1001.method4953(var3, arg0.field1268);
                Iterator var187 = class86.field1226.iterator();
                while (var187.hasNext()) {
                    class60 var188 = (class60) var187.next();
                    var188.method975();
                }
                if (Statics.field1960 != null) {
                    Statics.field1960.method5098();
                }
                field667 = field796;
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2180 == arg0.field1267) {
                String var189 = var3.method3435();
                long var190 = var3.method3505();
                long var192 = (long) var3.method3325();
                long var194 = (long) var3.method3327();
                class245 var196 = (class245) class180.method3213(class245.method2948(), var3.method3323());
                long var197 = (var192 << 32) + var194;
                boolean var199 = false;
                for (int var200 = 0; var200 < 100; var200++) {
                    if (field619[var200] == var197) {
                        var199 = true;
                        break;
                    }
                }
                if (var196.field3183 && Statics.field191.method1551(new class294(var189, Statics.field459))) {
                    var199 = true;
                }
                if (!var199 && field885 == 0) {
                    field619[field831] = var197;
                    field831 = (field831 + 1) % 100;
                    String var201 = class302.method5126(class308.method3121(class303.method4522(var3)));
                    if (var196.field3177 == -1) {
                        class86.method2384(9, var189, var201, class306.method2877(var190));
                    } else {
                        int var202 = var196.field3177;
                        String var203 = "<img=" + var202 + ">";
                        class86.method2384(9, var203 + var189, var201, class306.method2877(var190));
                    }
                }
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2149 == arg0.field1267) {
                method302(true, arg0.field1266);
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2116 == arg0.field1267) {
                Statics.field2415 = var3.method3354();
                Statics.field2058 = var3.method3323();
                for (int var204 = Statics.field2058; var204 < Statics.field2058 + 8; var204++) {
                    for (int var205 = Statics.field2415; var205 < Statics.field2415 + 8; var205++) {
                        if (field739[Statics.field517][var204][var205] != null) {
                            field739[Statics.field517][var204][var205] = null;
                            method1016(var204, var205);
                        }
                    }
                }
                for (class64 var206 = (class64) field821.method3823(); var206 != null; var206 = (class64) field821.method3822()) {
                    if (var206.field890 >= Statics.field2058 && var206.field890 < Statics.field2058 + 8 && var206.field891 >= Statics.field2415 && var206.field891 < Statics.field2415 + 8 && Statics.field517 == var206.field895) {
                        var206.field899 = 0;
                    }
                }
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2110 == arg0.field1267) {
                int var207 = var3.method3309();
                int var208 = var3.method3361();
                int var209 = var3.method3371();
                class233 var210 = class233.method130(var209);
                var210.field2712 = (var207 << 16) + var208;
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2150 == arg0.field1267) {
                String var211 = var3.method3435();
                long var212 = (long) var3.method3325();
                long var214 = (long) var3.method3327();
                class245 var216 = (class245) class180.method3213(class245.method2948(), var3.method3323());
                long var217 = (var212 << 32) + var214;
                boolean var219 = false;
                for (int var220 = 0; var220 < 100; var220++) {
                    if (field619[var220] == var217) {
                        var219 = true;
                        break;
                    }
                }
                if (Statics.field191.method1551(new class294(var211, Statics.field459))) {
                    var219 = true;
                }
                if (!var219 && field885 == 0) {
                    field619[field831] = var217;
                    field831 = (field831 + 1) % 100;
                    String var221 = class302.method5126(class308.method3121(class303.method4522(var3)));
                    byte var222;
                    if (var216.field3182) {
                        var222 = 7;
                    } else {
                        var222 = 3;
                    }
                    if (var216.field3177 == -1) {
                        class86.method1011(var222, var211, var221);
                    } else {
                        int var224 = var216.field3177;
                        String var225 = "<img=" + var224 + ">";
                        class86.method1011(var222, var225 + var211, var221);
                    }
                }
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2158 == arg0.field1267) {
                method302(false, arg0.field1266);
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2170 == arg0.field1267) {
                int var226 = var3.method3323();
                int var227 = var3.method3323();
                int var228 = var3.method3323();
                int var229 = var3.method3323();
                field856[var226] = true;
                field857[var226] = var227;
                field858[var226] = var228;
                field859[var226] = var229;
                field860[var226] = 0;
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2103 == arg0.field1267) {
                field629 = var3.method3323();
                if (field629 == 1) {
                    field873 = var3.method3325();
                }
                if (field629 >= 2 && field629 <= 6) {
                    if (field629 == 2) {
                        field635 = 64;
                        field636 = 64;
                    }
                    if (field629 == 3) {
                        field635 = 0;
                        field636 = 64;
                    }
                    if (field629 == 4) {
                        field635 = 128;
                        field636 = 64;
                    }
                    if (field629 == 5) {
                        field635 = 64;
                        field636 = 0;
                    }
                    if (field629 == 6) {
                        field635 = 64;
                        field636 = 128;
                    }
                    field629 = 2;
                    field632 = var3.method3325();
                    field786 = var3.method3325();
                    field719 = var3.method3323();
                }
                if (field629 == 10) {
                    field631 = var3.method3325();
                }
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2142 == arg0.field1267) {
                method1684(class174.field2300);
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2135 == arg0.field1267) {
                int var230 = arg0.field1268 + var3.field2397;
                int var231 = var3.method3325();
                int var232 = var3.method3325();
                if (field816 != var231) {
                    field816 = var231;
                    this.method1085(false);
                    method4622(field816);
                    class71.method935(field816);
                    for (int var233 = 0; var233 < 100; var233++) {
                        field875[var233] = true;
                    }
                }
                while (var232-- > 0) {
                    int var234 = var3.method3328();
                    int var235 = var3.method3325();
                    int var236 = var3.method3323();
                    class57 var237 = (class57) field771.method3759((long) var234);
                    if (var237 != null && var237.field527 != var235) {
                        method937(var237, true);
                        var237 = null;
                    }
                    if (var237 == null) {
                        var237 = method1871(var234, var235, var236);
                    }
                    var237.field525 = true;
                }
                for (class57 var238 = (class57) field771.method3766(); var238 != null; var238 = (class57) field771.method3764()) {
                    if (var238.field525) {
                        var238.field525 = false;
                    } else {
                        method937(var238, true);
                    }
                }
                field813 = new class205(512);
                while (var3.field2397 < var230) {
                    int var239 = var3.method3328();
                    int var240 = var3.method3325();
                    int var241 = var3.method3325();
                    int var242 = var3.method3328();
                    for (int var243 = var240; var243 <= var241; var243++) {
                        long var244 = ((long) var239 << 32) + (long) var243;
                        field813.method3761(new class214(var242), var244);
                    }
                }
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2134 == arg0.field1267) {
                method4836(true, var3);
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2144 == arg0.field1267) {
                field628 = var3.method3361() * 30;
                field848 = field796;
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2169 == arg0.field1267) {
                String var246 = var3.method3435();
                int var247 = var3.method3371();
                class233 var248 = class233.method130(var247);
                if (!var246.equals(var248.field2717)) {
                    var248.field2717 = var246;
                    method956(var248);
                }
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2122 == arg0.field1267) {
                Statics.field528 = class310.method4251(var3.method3323());
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2119 == arg0.field1267) {
                boolean var249 = var3.method3330();
                if (!var249) {
                    Statics.field3774 = null;
                } else if (Statics.field3774 == null) {
                    Statics.field3774 = new class254();
                }
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2179 == arg0.field1267) {
                int var250 = var3.method3325();
                int var251 = var3.method3323();
                int var252 = var3.method3325();
                method880(var250, var251, var252);
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2104 == arg0.field1267) {
                class67 var253 = new class67();
                var253.field978 = var3.method3435();
                var253.field985 = var3.method3325();
                int var254 = var3.method3328();
                var253.field979 = var254;
                method1776(45);
                var2.method3098();
                Object var255 = null;
                class80.method1764(var253);
                arg0.field1267 = null;
                return false;
            }
            if (class171.field2163 == arg0.field1267) {
                byte[] var256 = new byte[arg0.field1268];
                var3.method3617(var256, 0, var256.length);
                class185 var257 = new class185(var256);
                String var258 = var257.method3435();
                class46.method4235(var258, true, false);
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2138 == arg0.field1267) {
                field843 = var3.method3323();
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2161 == arg0.field1267) {
                method1684(class174.field2302);
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2143 == arg0.field1267) {
                int var259 = var3.method3498();
                boolean var260 = var3.method3323() == 1;
                String var261 = "";
                boolean var262 = false;
                if (var260) {
                    var261 = var3.method3435();
                    if (Statics.field191.method1551(new class294(var261, Statics.field459))) {
                        var262 = true;
                    }
                }
                String var263 = var3.method3435();
                if (!var262) {
                    class86.method1011(var259, var261, var263);
                }
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2181 == arg0.field1267) {
                method1684(class174.field2310);
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2129 == arg0.field1267) {
                method4836(false, var3);
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2117 == arg0.field1267) {
                byte var264 = var3.method3366();
                int var265 = var3.method3362();
                class228.field2615[var265] = var264;
                if (class228.field2617[var265] != var264) {
                    class228.field2617[var265] = var264;
                }
                method2960(var265);
                field797[++field757 - 1 & 0x1F] = var265;
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2113 == arg0.field1267) {
                method2090();
                arg0.field1267 = null;
                return false;
            }
            if (class171.field2178 == arg0.field1267) {
                field702 = true;
                Statics.field1980 = var3.method3323();
                Statics.field2187 = var3.method3323();
                Statics.field538 = var3.method3325();
                Statics.field82 = var3.method3323();
                Statics.field208 = var3.method3323();
                if (Statics.field208 >= 100) {
                    Statics.field2602 = Statics.field1980 * 128 + 64;
                    Statics.field675 = Statics.field2187 * 128 + 64;
                    Statics.field2413 = method953(Statics.field2602, Statics.field675, Statics.field517) - Statics.field538;
                }
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2153 == arg0.field1267) {
                int var266 = var3.method3328();
                class233 var267 = class233.method130(var266);
                for (int var268 = 0; var268 < var267.field2775.length; var268++) {
                    var267.field2775[var268] = -1;
                    var267.field2775[var268] = 0;
                }
                method956(var267);
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2123 == arg0.field1267) {
                int var269 = var3.method3325();
                class55.method4473(var269);
                field792[++field800 - 1 & 0x1F] = var269 & 0x7FFF;
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2130 == arg0.field1267) {
                if (Statics.field1960 != null) {
                    Statics.field1960.method5084(var3);
                }
                field805 = field796;
                Statics.field180 = true;
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2167 == arg0.field1267) {
                method1684(class174.field2307);
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2160 == arg0.field1267) {
                var3.field2397 += 28;
                if (var3.method3491()) {
                    int var270 = var3.field2397 - 28;
                    byte[] var271 = var3.field2399;
                    if (field650 == null) {
                        field650 = new byte[24];
                    }
                    class196.method3644(var271, var270, field650, 0, 24);
                    if (class158.field2015 != null) {
                        try {
                            class158.field2015.method2297(0L);
                            class158.field2015.method2312(var3.field2399, var270, 24);
                        } catch (Exception var285) {
                        }
                    }
                }
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2133 == arg0.field1267) {
                int var273 = var3.method3328();
                class57 var274 = (class57) field771.method3759((long) var273);
                if (var274 != null) {
                    method937(var274, true);
                }
                if (field710 != null) {
                    method956(field710);
                    field710 = null;
                }
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2105 == arg0.field1267) {
                int var275 = var3.method3372();
                int var276 = var3.method3362();
                class233 var277 = class233.method130(var275);
                if (var277 != null && var277.field2658 == 0) {
                    if (var276 > var277.field2680 - var277.field2675) {
                        var276 = var277.field2680 - var277.field2675;
                    }
                    if (var276 < 0) {
                        var276 = 0;
                    }
                    if (var277.field2678 != var276) {
                        var277.field2678 = var276;
                        method956(var277);
                    }
                }
                arg0.field1267 = null;
                return true;
            }
            if (class171.field2182 == arg0.field1267) {
                String var278 = var3.method3435();
                int var279 = var3.method3354();
                int var280 = var3.method3354();
                if (var279 >= 1 && var279 <= 8) {
                    if (var278.equalsIgnoreCase(class240.field2850)) {
                        var278 = null;
                    }
                    field735[var279 - 1] = var278;
                    field736[var279 - 1] = var280 == 0;
                }
                arg0.field1267 = null;
                return true;
            }
            class155.method1834("" + (arg0.field1267 == null ? -1 : arg0.field1267.field2185) + class76.field1087 + (arg0.field1273 == null ? -1 : arg0.field1273.field2185) + class76.field1087 + (arg0.field1274 == null ? -1 : arg0.field1274.field2185) + class76.field1087 + arg0.field1268, (Throwable) null);
            method2090();
        } catch (IOException var287) {
            method19();
        } catch (Exception var288) {
            String var283 = "" + (arg0.field1267 == null ? -1 : arg0.field1267.field2185) + class76.field1087 + (arg0.field1273 == null ? -1 : arg0.field1273.field2185) + class76.field1087 + (arg0.field1274 == null ? -1 : arg0.field1274.field2185) + class76.field1087 + arg0.field1268 + class76.field1087 + (Statics.field1225 + Statics.field502.field958[0]) + class76.field1087 + (Statics.field64 + Statics.field502.field944[0]) + class76.field1087;
            for (int var284 = 0; var284 < arg0.field1268 && var284 < 50; var284++) {
                var283 = var283 + var3.field2399[var284] + class76.field1087;
            }
            class155.method1834(var283, var288);
            method2090();
        }
        return true;
    }

    @ObfuscatedName("bj.hn(Lfd;I)V")
    public static final void method1684(class174 arg0) {
        class192 var1 = field798.field1266;
        if (class174.field2306 == arg0) {
            int var2 = var1.method3325();
            int var3 = var1.method3309();
            int var4 = var1.method3352();
            int var5 = var1.method3323();
            int var6 = (var5 >> 4 & 0x7) + Statics.field2058;
            int var7 = (var5 & 0x7) + Statics.field2415;
            if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
                int var8 = var6 * 128 + 64;
                int var9 = var7 * 128 + 64;
                class72 var10 = new class72(var3, Statics.field517, var8, var9, method953(var8, var9, Statics.field517) - var4, var2, field633);
                field742.method3831(var10);
            }
        } else if (class174.field2303 == arg0) {
            int var11 = var1.method3362();
            int var12 = var1.method3362();
            int var13 = var1.method3352();
            int var14 = (var13 >> 4 & 0x7) + Statics.field2058;
            int var15 = (var13 & 0x7) + Statics.field2415;
            int var16 = var1.method3361();
            if (var14 >= 0 && var15 >= 0 && var14 < 104 && var15 < 104) {
                class208 var17 = field739[Statics.field517][var14][var15];
                if (var17 != null) {
                    for (class82 var18 = (class82) var17.method3823(); var18 != null; var18 = (class82) var17.method3822()) {
                        if ((var11 & 0x7FFF) == var18.field1191 && var18.field1189 == var16) {
                            var18.field1189 = var12;
                            break;
                        }
                    }
                    method1016(var14, var15);
                }
            }
        } else if (class174.field2302 == arg0) {
            int var19 = var1.method3362();
            int var20 = var1.method3346();
            int var21 = (var20 >> 4 & 0x7) + Statics.field2058;
            int var22 = (var20 & 0x7) + Statics.field2415;
            int var23 = var1.method3325();
            if (var21 >= 0 && var22 >= 0 && var21 < 104 && var22 < 104) {
                class82 var24 = new class82();
                var24.field1191 = var23;
                var24.field1189 = var19;
                if (field739[Statics.field517][var21][var22] == null) {
                    field739[Statics.field517][var21][var22] = new class208();
                }
                field739[Statics.field517][var21][var22].method3831(var24);
                method1016(var21, var22);
            }
        } else if (class174.field2309 == arg0) {
            int var25 = var1.method3309();
            int var26 = var1.method3346();
            int var27 = var1.method3362();
            int var28 = var1.method3323();
            int var29 = var1.method3352() * 4;
            int var30 = var1.method3354() * 4;
            int var31 = var1.method3362();
            int var32 = var1.method3476();
            byte var33 = var1.method3324();
            byte var34 = var1.method3324();
            int var35 = var1.method3354();
            int var36 = (var35 >> 4 & 0x7) + Statics.field2058;
            int var37 = (var35 & 0x7) + Statics.field2415;
            int var38 = var33 + var36;
            int var39 = var34 + var37;
            if (var36 >= 0 && var37 >= 0 && var36 < 104 && var37 < 104 && var38 >= 0 && var39 >= 0 && var38 < 104 && var39 < 104 && var31 != 65535) {
                int var40 = var36 * 128 + 64;
                int var41 = var37 * 128 + 64;
                int var42 = var38 * 128 + 64;
                int var43 = var39 * 128 + 64;
                class81 var44 = new class81(var31, Statics.field517, var40, var41, method953(var40, var41, Statics.field517) - var29, field633 + var25, field633 + var27, var28, var26, var32, var30);
                var44.method1767(var42, var43, method953(var42, var43, Statics.field517) - var30, field633 + var25);
                field741.method3831(var44);
            }
        } else if (class174.field2300 == arg0) {
            int var45 = var1.method3323();
            int var46 = var45 >> 2;
            int var47 = var45 & 0x3;
            int var48 = field670[var46];
            int var49 = var1.method3362();
            int var50 = var1.method3354();
            int var51 = (var50 >> 4 & 0x7) + Statics.field2058;
            int var52 = (var50 & 0x7) + Statics.field2415;
            if (var51 >= 0 && var52 >= 0 && var51 < 104 && var52 < 104) {
                method1478(Statics.field517, var51, var52, var48, var49, var46, var47, 0, -1);
            }
        } else {
            if (class174.field2307 == arg0) {
                int var53 = var1.method3309();
                int var54 = var1.method3354();
                int var55 = var54 >> 4 & 0xF;
                int var56 = var54 & 0x7;
                int var57 = var1.method3323();
                int var58 = (var57 >> 4 & 0x7) + Statics.field2058;
                int var59 = (var57 & 0x7) + Statics.field2415;
                int var60 = var1.method3352();
                if (var58 >= 0 && var59 >= 0 && var58 < 104 && var59 < 104) {
                    int var61 = var55 + 1;
                    if (Statics.field502.field958[0] >= var58 - var61 && Statics.field502.field958[0] <= var58 + var61 && Statics.field502.field944[0] >= var59 - var61 && Statics.field502.field944[0] <= var59 + var61 && field755 != 0 && var56 > 0 && field849 < 50) {
                        field850[field849] = var53;
                        field871[field849] = var56;
                        field852[field849] = var60;
                        field653[field849] = null;
                        field880[field849] = (var58 << 16) + (var59 << 8) + var55;
                        field849++;
                    }
                }
            }
            if (class174.field2304 == arg0) {
                int var62 = var1.method3352();
                int var63 = var62 >> 2;
                int var64 = var62 & 0x3;
                int var65 = field670[var63];
                int var66 = var1.method3309();
                int var67 = var1.method3346();
                int var68 = (var67 >> 4 & 0x7) + Statics.field2058;
                int var69 = (var67 & 0x7) + Statics.field2415;
                if (var68 >= 0 && var69 >= 0 && var68 < 103 && var69 < 103) {
                    if (var65 == 0) {
                        class131 var70 = Statics.field186.method2703(Statics.field517, var68, var69);
                        if (var70 != null) {
                            int var71 = class123.method4074(var70.field1833);
                            if (var63 == 2) {
                                var70.field1835 = new class88(var71, 2, var64 + 4, Statics.field517, var68, var69, var66, false, var70.field1835);
                                var70.field1836 = new class88(var71, 2, var64 + 1 & 0x3, Statics.field517, var68, var69, var66, false, var70.field1836);
                            } else {
                                var70.field1835 = new class88(var71, var63, var64, Statics.field517, var68, var69, var66, false, var70.field1835);
                            }
                        }
                    }
                    if (var65 == 1) {
                        class136 var72 = Statics.field186.method2720(Statics.field517, var68, var69);
                        if (var72 != null) {
                            int var73 = class123.method4074(var72.field1881);
                            if (var63 == 4 || var63 == 5) {
                                var72.field1879 = new class88(var73, 4, var64, Statics.field517, var68, var69, var66, false, var72.field1879);
                            } else if (var63 == 6) {
                                var72.field1879 = new class88(var73, 4, var64 + 4, Statics.field517, var68, var69, var66, false, var72.field1879);
                            } else if (var63 == 7) {
                                var72.field1879 = new class88(var73, 4, (var64 + 2 & 0x3) + 4, Statics.field517, var68, var69, var66, false, var72.field1879);
                            } else if (var63 == 8) {
                                var72.field1879 = new class88(var73, 4, var64 + 4, Statics.field517, var68, var69, var66, false, var72.field1879);
                                var72.field1880 = new class88(var73, 4, (var64 + 2 & 0x3) + 4, Statics.field517, var68, var69, var66, false, var72.field1880);
                            }
                        }
                    }
                    if (var65 == 2) {
                        class137 var74 = Statics.field186.method2705(Statics.field517, var68, var69);
                        if (var63 == 11) {
                            var63 = 10;
                        }
                        if (var74 != null) {
                            var74.field1890 = new class88(class123.method4074(var74.field1898), var63, var64, Statics.field517, var68, var69, var66, false, var74.field1890);
                        }
                    }
                    if (var65 == 3) {
                        class118 var75 = Statics.field186.method2706(Statics.field517, var68, var69);
                        if (var75 != null) {
                            var75.field1568 = new class88(class123.method4074(var75.field1569), 22, var64, Statics.field517, var68, var69, var66, false, var75.field1568);
                        }
                    }
                }
            } else if (class174.field2305 == arg0) {
                int var76 = var1.method3323();
                int var77 = var76 >> 2;
                int var78 = var76 & 0x3;
                int var79 = field670[var77];
                int var80 = var1.method3352();
                int var81 = (var80 >> 4 & 0x7) + Statics.field2058;
                int var82 = (var80 & 0x7) + Statics.field2415;
                if (var81 >= 0 && var82 >= 0 && var81 < 104 && var82 < 104) {
                    method1478(Statics.field517, var81, var82, var79, -1, var77, var78, 0, -1);
                }
            } else if (class174.field2310 == arg0) {
                int var83 = var1.method3323();
                int var84 = (var83 >> 4 & 0x7) + Statics.field2058;
                int var85 = (var83 & 0x7) + Statics.field2415;
                int var86 = var1.method3361();
                if (var84 >= 0 && var85 >= 0 && var84 < 104 && var85 < 104) {
                    class208 var87 = field739[Statics.field517][var84][var85];
                    if (var87 != null) {
                        for (class82 var88 = (class82) var87.method3823(); var88 != null; var88 = (class82) var87.method3822()) {
                            if ((var86 & 0x7FFF) == var88.field1191) {
                                var88.method3812();
                                break;
                            }
                        }
                        if (var87.method3823() == null) {
                            field739[Statics.field517][var84][var85] = null;
                        }
                        method1016(var84, var85);
                    }
                }
            } else if (class174.field2301 == arg0) {
                int var89 = var1.method3325();
                byte var90 = var1.method3355();
                byte var91 = var1.method3324();
                int var92 = var1.method3362();
                byte var93 = var1.method3324();
                int var94 = var1.method3323();
                int var95 = var94 >> 2;
                int var96 = var94 & 0x3;
                int var97 = field670[var95];
                int var98 = var1.method3309();
                int var99 = var1.method3325();
                byte var100 = var1.method3324();
                int var101 = var1.method3354();
                int var102 = (var101 >> 4 & 0x7) + Statics.field2058;
                int var103 = (var101 & 0x7) + Statics.field2415;
                class62 var104;
                if (field781 == var98) {
                    var104 = Statics.field502;
                } else {
                    var104 = field727[var98];
                }
                if (var104 != null) {
                    class271 var105 = class271.method1706(var89);
                    int var106;
                    int var107;
                    if (var96 == 1 || var96 == 3) {
                        var106 = var105.field3447;
                        var107 = var105.field3446;
                    } else {
                        var106 = var105.field3446;
                        var107 = var105.field3447;
                    }
                    int var108 = (var106 >> 1) + var102;
                    int var109 = (var106 + 1 >> 1) + var102;
                    int var110 = (var107 >> 1) + var103;
                    int var111 = (var107 + 1 >> 1) + var103;
                    int[][] var112 = class51.field460[Statics.field517];
                    int var113 = var112[var108][var110] + var112[var109][var110] + var112[var108][var111] + var112[var109][var111] >> 2;
                    int var114 = (var102 << 7) + (var106 << 6);
                    int var115 = (var103 << 7) + (var107 << 6);
                    class122 var116 = var105.method4680(var95, var96, var112, var114, var113, var115);
                    if (var116 != null) {
                        method1478(Statics.field517, var102, var103, var97, -1, 0, 0, var92 + 1, var99 + 1);
                        var104.field595 = field633 + var92;
                        var104.field580 = field633 + var99;
                        var104.field584 = var116;
                        var104.field581 = var102 * 128 + var106 * 64;
                        var104.field583 = var103 * 128 + var107 * 64;
                        var104.field578 = var113;
                        if (var100 > var91) {
                            byte var117 = var100;
                            var100 = var91;
                            var91 = var117;
                        }
                        if (var90 > var93) {
                            byte var118 = var90;
                            var90 = var93;
                            var93 = var118;
                        }
                        var104.field585 = var100 + var102;
                        var104.field587 = var91 + var102;
                        var104.field586 = var90 + var103;
                        var104.field593 = var93 + var103;
                    }
                }
            }
        }
    }

    @ObfuscatedName("bn.hf(IIIIIIIIII)V")
    public static final void method1478(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class64 var9 = null;
        for (class64 var10 = (class64) field821.method3823(); var10 != null; var10 = (class64) field821.method3822()) {
            if (var10.field895 == arg0 && var10.field890 == arg1 && var10.field891 == arg2 && var10.field889 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class64();
            var9.field895 = arg0;
            var9.field889 = arg3;
            var9.field890 = arg1;
            var9.field891 = arg2;
            method952(var9);
            field821.method3831(var9);
        }
        var9.field896 = arg4;
        var9.field897 = arg5;
        var9.field893 = arg6;
        var9.field901 = arg7;
        var9.field899 = arg8;
    }

    @ObfuscatedName("bm.hg(Lby;I)V")
    public static final void method952(class64 arg0) {
        long var1 = 0L;
        int var3 = -1;
        int var4 = 0;
        int var5 = 0;
        if (arg0.field889 == 0) {
            var1 = Statics.field186.method2707(arg0.field895, arg0.field890, arg0.field891);
        }
        if (arg0.field889 == 1) {
            var1 = Statics.field186.method2708(arg0.field895, arg0.field890, arg0.field891);
        }
        if (arg0.field889 == 2) {
            var1 = Statics.field186.method2709(arg0.field895, arg0.field890, arg0.field891);
        }
        if (arg0.field889 == 3) {
            var1 = Statics.field186.method2710(arg0.field895, arg0.field890, arg0.field891);
        }
        if (var1 != 0L) {
            int var6 = Statics.field186.method2711(arg0.field895, arg0.field890, arg0.field891, var1);
            var3 = class123.method4074(var1);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg0.field892 = var3;
        arg0.field894 = var4;
        arg0.field898 = var5;
    }

    @ObfuscatedName("r.hx(IIIIIIII)V")
    public static final void method131(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field614 && Statics.field517 != arg0) {
            return;
        }
        long var7 = 0L;
        boolean var9 = true;
        boolean var10 = false;
        boolean var11 = false;
        if (arg1 == 0) {
            var7 = Statics.field186.method2707(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field186.method2708(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field186.method2709(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field186.method2710(arg0, arg2, arg3);
        }
        if (var7 != 0L) {
            int var12 = Statics.field186.method2711(arg0, arg2, arg3, var7);
            int var13 = class123.method4074(var7);
            int var14 = var12 & 0x1F;
            int var15 = var12 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field186.method2698(arg0, arg2, arg3);
                class271 var16 = class271.method1706(var13);
                if (var16.field3448 != 0) {
                    field767[arg0].method3184(arg2, arg3, var14, var15, var16.field3457);
                }
            }
            if (arg1 == 1) {
                Statics.field186.method2860(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field186.method2700(arg0, arg2, arg3);
                class271 var17 = class271.method1706(var13);
                if (var17.field3446 + arg2 > 103 || var17.field3446 + arg3 > 103 || var17.field3447 + arg2 > 103 || var17.field3447 + arg3 > 103) {
                    return;
                }
                if (var17.field3448 != 0) {
                    field767[arg0].method3174(arg2, arg3, var17.field3446, var17.field3447, var15, var17.field3457);
                }
            }
            if (arg1 == 3) {
                Statics.field186.method2701(arg0, arg2, arg3);
                class271 var18 = class271.method1706(var13);
                if (var18.field3448 == 1) {
                    field767[arg0].method3176(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var19 = arg0;
        if (arg0 < 3 && (class51.field457[1][arg2][arg3] & 0x2) == 2) {
            var19 = arg0 + 1;
        }
        class128 var20 = Statics.field186;
        class167 var21 = field767[arg0];
        class271 var22 = class271.method1706(arg4);
        int var23;
        int var24;
        if (arg5 == 1 || arg5 == 3) {
            var23 = var22.field3447;
            var24 = var22.field3446;
        } else {
            var23 = var22.field3446;
            var24 = var22.field3447;
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
        int[][] var29 = class51.field460[var19];
        int var30 = var29[var25][var27] + var29[var26][var27] + var29[var25][var28] + var29[var26][var28] >> 2;
        int var31 = (arg2 << 7) + (var23 << 6);
        int var32 = (arg3 << 7) + (var24 << 6);
        long var33 = class123.method649(arg2, arg3, 2, var22.field3456 == 0, arg4);
        int var35 = (arg5 << 6) + arg6;
        if (var22.field3461 == 1) {
            var35 += 256;
        }
        if (arg6 == 22) {
            class130 var36;
            if (var22.field3454 == -1 && var22.field3472 == null) {
                var36 = var22.method4680(22, arg5, var29, var31, var30, var32);
            } else {
                var36 = new class88(arg4, 22, arg5, var19, arg2, arg3, var22.field3454, true, (class130) null);
            }
            var20.method2845(arg0, arg2, arg3, var30, var36, var33, var35);
            if (var22.field3448 == 1) {
                var21.method3171(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class130 var62;
            if (var22.field3454 == -1 && var22.field3472 == null) {
                var62 = var22.method4680(10, arg5, var29, var31, var30, var32);
            } else {
                var62 = new class88(arg4, 10, arg5, var19, arg2, arg3, var22.field3454, true, (class130) null);
            }
            if (var62 != null) {
                var20.method2742(arg0, arg2, arg3, var30, var23, var24, var62, arg6 == 11 ? 256 : 0, var33, var35);
            }
            if (var22.field3448 != 0) {
                var21.method3169(arg2, arg3, var23, var24, var22.field3457);
            }
        } else if (arg6 >= 12) {
            class130 var37;
            if (var22.field3454 == -1 && var22.field3472 == null) {
                var37 = var22.method4680(arg6, arg5, var29, var31, var30, var32);
            } else {
                var37 = new class88(arg4, arg6, arg5, var19, arg2, arg3, var22.field3454, true, (class130) null);
            }
            var20.method2742(arg0, arg2, arg3, var30, 1, 1, var37, 0, var33, var35);
            if (var22.field3448 != 0) {
                var21.method3169(arg2, arg3, var23, var24, var22.field3457);
            }
        } else if (arg6 == 0) {
            class130 var38;
            if (var22.field3454 == -1 && var22.field3472 == null) {
                var38 = var22.method4680(0, arg5, var29, var31, var30, var32);
            } else {
                var38 = new class88(arg4, 0, arg5, var19, arg2, arg3, var22.field3454, true, (class130) null);
            }
            var20.method2689(arg0, arg2, arg3, var30, var38, (class130) null, class51.field467[arg5], 0, var33, var35);
            if (var22.field3448 != 0) {
                var21.method3204(arg2, arg3, arg6, arg5, var22.field3457);
            }
        } else if (arg6 == 1) {
            class130 var39;
            if (var22.field3454 == -1 && var22.field3472 == null) {
                var39 = var22.method4680(1, arg5, var29, var31, var30, var32);
            } else {
                var39 = new class88(arg4, 1, arg5, var19, arg2, arg3, var22.field3454, true, (class130) null);
            }
            var20.method2689(arg0, arg2, arg3, var30, var39, (class130) null, class51.field471[arg5], 0, var33, var35);
            if (var22.field3448 != 0) {
                var21.method3204(arg2, arg3, arg6, arg5, var22.field3457);
            }
        } else if (arg6 == 2) {
            int var40 = arg5 + 1 & 0x3;
            class130 var41;
            class130 var42;
            if (var22.field3454 == -1 && var22.field3472 == null) {
                var41 = var22.method4680(2, arg5 + 4, var29, var31, var30, var32);
                var42 = var22.method4680(2, var40, var29, var31, var30, var32);
            } else {
                var41 = new class88(arg4, 2, arg5 + 4, var19, arg2, arg3, var22.field3454, true, (class130) null);
                var42 = new class88(arg4, 2, var40, var19, arg2, arg3, var22.field3454, true, (class130) null);
            }
            var20.method2689(arg0, arg2, arg3, var30, var41, var42, class51.field467[arg5], class51.field467[var40], var33, var35);
            if (var22.field3448 != 0) {
                var21.method3204(arg2, arg3, arg6, arg5, var22.field3457);
            }
        } else if (arg6 == 3) {
            class130 var43;
            if (var22.field3454 == -1 && var22.field3472 == null) {
                var43 = var22.method4680(3, arg5, var29, var31, var30, var32);
            } else {
                var43 = new class88(arg4, 3, arg5, var19, arg2, arg3, var22.field3454, true, (class130) null);
            }
            var20.method2689(arg0, arg2, arg3, var30, var43, (class130) null, class51.field471[arg5], 0, var33, var35);
            if (var22.field3448 != 0) {
                var21.method3204(arg2, arg3, arg6, arg5, var22.field3457);
            }
        } else if (arg6 == 9) {
            class130 var44;
            if (var22.field3454 == -1 && var22.field3472 == null) {
                var44 = var22.method4680(arg6, arg5, var29, var31, var30, var32);
            } else {
                var44 = new class88(arg4, arg6, arg5, var19, arg2, arg3, var22.field3454, true, (class130) null);
            }
            var20.method2742(arg0, arg2, arg3, var30, 1, 1, var44, 0, var33, var35);
            if (var22.field3448 != 0) {
                var21.method3169(arg2, arg3, var23, var24, var22.field3457);
            }
        } else if (arg6 == 4) {
            class130 var45;
            if (var22.field3454 == -1 && var22.field3472 == null) {
                var45 = var22.method4680(4, arg5, var29, var31, var30, var32);
            } else {
                var45 = new class88(arg4, 4, arg5, var19, arg2, arg3, var22.field3454, true, (class130) null);
            }
            var20.method2817(arg0, arg2, arg3, var30, var45, (class130) null, class51.field467[arg5], 0, 0, 0, var33, var35);
        } else if (arg6 == 5) {
            int var46 = 16;
            long var47 = var20.method2707(arg0, arg2, arg3);
            if (var47 != 0L) {
                var46 = class271.method1706(class123.method4074(var47)).field3455;
            }
            class130 var49;
            if (var22.field3454 == -1 && var22.field3472 == null) {
                var49 = var22.method4680(4, arg5, var29, var31, var30, var32);
            } else {
                var49 = new class88(arg4, 4, arg5, var19, arg2, arg3, var22.field3454, true, (class130) null);
            }
            var20.method2817(arg0, arg2, arg3, var30, var49, (class130) null, class51.field467[arg5], 0, class51.field469[arg5] * var46, class51.field470[arg5] * var46, var33, var35);
        } else if (arg6 == 6) {
            int var50 = 8;
            long var51 = var20.method2707(arg0, arg2, arg3);
            if (var51 != 0L) {
                var50 = class271.method1706(class123.method4074(var51)).field3455 / 2;
            }
            class130 var53;
            if (var22.field3454 == -1 && var22.field3472 == null) {
                var53 = var22.method4680(4, arg5 + 4, var29, var31, var30, var32);
            } else {
                var53 = new class88(arg4, 4, arg5 + 4, var19, arg2, arg3, var22.field3454, true, (class130) null);
            }
            var20.method2817(arg0, arg2, arg3, var30, var53, (class130) null, 256, arg5, class51.field468[arg5] * var50, class51.field463[arg5] * var50, var33, var35);
        } else if (arg6 == 7) {
            int var54 = arg5 + 2 & 0x3;
            class130 var55;
            if (var22.field3454 == -1 && var22.field3472 == null) {
                var55 = var22.method4680(4, var54 + 4, var29, var31, var30, var32);
            } else {
                var55 = new class88(arg4, 4, var54 + 4, var19, arg2, arg3, var22.field3454, true, (class130) null);
            }
            var20.method2817(arg0, arg2, arg3, var30, var55, (class130) null, 256, var54, 0, 0, var33, var35);
        } else if (arg6 == 8) {
            int var56 = 8;
            long var57 = var20.method2707(arg0, arg2, arg3);
            if (var57 != 0L) {
                var56 = class271.method1706(class123.method4074(var57)).field3455 / 2;
            }
            int var59 = arg5 + 2 & 0x3;
            class130 var60;
            class130 var61;
            if (var22.field3454 == -1 && var22.field3472 == null) {
                var60 = var22.method4680(4, arg5 + 4, var29, var31, var30, var32);
                var61 = var22.method4680(4, var59 + 4, var29, var31, var30, var32);
            } else {
                var60 = new class88(arg4, 4, arg5 + 4, var19, arg2, arg3, var22.field3454, true, (class130) null);
                var61 = new class88(arg4, 4, var59 + 4, var19, arg2, arg3, var22.field3454, true, (class130) null);
            }
            var20.method2817(arg0, arg2, arg3, var30, var60, var61, 256, arg5, class51.field468[arg5] * var56, class51.field463[arg5] * var56, var33, var35);
        }
    }

    @ObfuscatedName("bu.hw(III)V")
    public static final void method1016(int arg0, int arg1) {
        class208 var2 = field739[Statics.field517][arg0][arg1];
        if (var2 == null) {
            Statics.field186.method2702(Statics.field517, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class82 var5 = null;
        for (class82 var6 = (class82) var2.method3823(); var6 != null; var6 = (class82) var2.method3822()) {
            class272 var7 = class272.method2892(var6.field1191);
            long var8 = (long) var7.field3534;
            if (var7.field3503 == 1) {
                var8 = (long) (var6.field1189 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field186.method2702(Statics.field517, arg0, arg1);
            return;
        }
        var2.method3816(var5);
        class82 var10 = null;
        class82 var11 = null;
        for (class82 var12 = (class82) var2.method3823(); var12 != null; var12 = (class82) var2.method3822()) {
            if (var5.field1191 != var12.field1191) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1191 != var12.field1191 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        long var13 = class123.method649(arg0, arg1, 3, false, 0);
        Statics.field186.method2688(Statics.field517, arg0, arg1, method953(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field517), var5, var13, var10, var11);
    }

    @ObfuscatedName("jy.hq(ZLgh;I)V")
    public static final void method4836(boolean arg0, class192 arg1) {
        field808 = 0;
        field654 = 0;
        method1006();
        Statics.method2679(arg0, arg1);
        method2470(arg1);
        for (int var2 = 0; var2 < field808; var2++) {
            int var3 = field733[var2];
            if (field633 != field651[var3].field952) {
                field651[var3].field1071 = null;
                field651[var3] = null;
            }
        }
        if (field798.field1268 != arg1.field2397) {
            throw new RuntimeException(arg1.field2397 + class76.field1087 + field798.field1268);
        }
        for (int var4 = 0; var4 < field652; var4++) {
            if (field651[field868[var4]] == null) {
                throw new RuntimeException(var4 + class76.field1087 + field652);
            }
        }
    }

    @ObfuscatedName("bu.hd(I)V")
    public static final void method1006() {
        class192 var0 = field798.field1266;
        var0.method3586();
        int var1 = var0.method3590(8);
        if (var1 < field652) {
            for (int var2 = var1; var2 < field652; var2++) {
                field733[++field808 - 1] = field868[var2];
            }
        }
        if (var1 > field652) {
            throw new RuntimeException("");
        }
        field652 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field868[var3];
            class74 var5 = field651[var4];
            int var6 = var0.method3590(1);
            if (var6 == 0) {
                field868[++field652 - 1] = var4;
                var5.field952 = field633;
            } else {
                int var7 = var0.method3590(2);
                if (var7 == 0) {
                    field868[++field652 - 1] = var4;
                    var5.field952 = field633;
                    field655[++field654 - 1] = var4;
                } else if (var7 == 1) {
                    field868[++field652 - 1] = var4;
                    var5.field952 = field633;
                    int var8 = var0.method3590(3);
                    var5.method1708(var8, (byte) 1);
                    int var9 = var0.method3590(1);
                    if (var9 == 1) {
                        field655[++field654 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field868[++field652 - 1] = var4;
                    var5.field952 = field633;
                    int var10 = var0.method3590(3);
                    var5.method1708(var10, (byte) 2);
                    int var11 = var0.method3590(3);
                    var5.method1708(var11, (byte) 2);
                    int var12 = var0.method3590(1);
                    if (var12 == 1) {
                        field655[++field654 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field733[++field808 - 1] = var4;
                }
            }
        }
    }

    @ObfuscatedName("dg.he(Lgh;I)V")
    public static final void method2470(class192 arg0) {
        for (int var1 = 0; var1 < field654; var1++) {
            int var2 = field655[var1];
            class74 var3 = field651[var2];
            int var4 = arg0.method3323();
            if ((var4 & 0x20) != 0) {
                int var5 = arg0.method3354();
                if (var5 > 0) {
                    for (int var6 = 0; var6 < var5; var6++) {
                        int var7 = -1;
                        int var8 = -1;
                        int var9 = -1;
                        int var10 = arg0.method3498();
                        if (var10 == 32767) {
                            var10 = arg0.method3498();
                            var8 = arg0.method3498();
                            var7 = arg0.method3498();
                            var9 = arg0.method3498();
                        } else if (var10 == 32766) {
                            var10 = -1;
                        } else {
                            var8 = arg0.method3498();
                        }
                        int var11 = arg0.method3498();
                        var3.method1467(var10, var8, var7, var9, field633, var11);
                    }
                }
                int var12 = arg0.method3352();
                if (var12 > 0) {
                    for (int var13 = 0; var13 < var12; var13++) {
                        int var14 = arg0.method3498();
                        int var15 = arg0.method3498();
                        if (var15 == 32767) {
                            var3.method1464(var14);
                        } else {
                            int var16 = arg0.method3498();
                            int var17 = arg0.method3346();
                            int var18 = var15 > 0 ? arg0.method3354() : var17;
                            var3.method1469(var14, field633, var15, var16, var17, var18);
                        }
                    }
                }
            }
            if ((var4 & 0x40) != 0) {
                var3.field940 = arg0.method3309();
                int var19 = arg0.method3371();
                var3.field941 = var19 >> 16;
                var3.field943 = (var19 & 0xFFFF) + field633;
                var3.field946 = 0;
                var3.field950 = 0;
                if (var3.field943 > field633) {
                    var3.field946 = -1;
                }
                if (var3.field940 == 65535) {
                    var3.field940 = -1;
                }
            }
            if ((var4 & 0x8) != 0) {
                var3.field959 = arg0.method3435();
                var3.field933 = 100;
            }
            if ((var4 & 0x4) != 0) {
                var3.field929 = arg0.method3325();
                if (var3.field929 == 65535) {
                    var3.field929 = -1;
                }
            }
            if ((var4 & 0x2) != 0) {
                int var20 = arg0.method3362();
                if (var20 == 65535) {
                    var20 = -1;
                }
                int var21 = arg0.method3323();
                if (var3.field935 == var20 && var20 != -1) {
                    int var22 = class276.method2865(var20).field3610;
                    if (var22 == 1) {
                        var3.field936 = 0;
                        var3.field937 = 0;
                        var3.field938 = var21;
                        var3.field939 = 0;
                    }
                    if (var22 == 2) {
                        var3.field939 = 0;
                    }
                } else if (var20 == -1 || var3.field935 == -1 || class276.method2865(var20).field3604 >= class276.method2865(var3.field935).field3604) {
                    var3.field935 = var20;
                    var3.field936 = 0;
                    var3.field937 = 0;
                    var3.field938 = var21;
                    var3.field939 = 0;
                    var3.field962 = var3.field957;
                }
            }
            if ((var4 & 0x1) != 0) {
                var3.field1071 = class274.method3290(arg0.method3309());
                var3.field964 = var3.field1071.field3548;
                var3.field956 = var3.field1071.field3543;
                var3.field911 = var3.field1071.field3551;
                var3.field910 = var3.field1071.field3555;
                var3.field913 = var3.field1071.field3556;
                var3.field914 = var3.field1071.field3557;
                var3.field908 = var3.field1071.field3568;
                var3.field909 = var3.field1071.field3559;
                var3.field916 = var3.field1071.field3553;
            }
            if ((var4 & 0x10) != 0) {
                int var23 = arg0.method3325();
                int var24 = arg0.method3362();
                int var25 = var3.field953 - (var23 - Statics.field1225 - Statics.field1225) * 64;
                int var26 = var3.field919 - (var24 - Statics.field64 - Statics.field64) * 64;
                if (var25 != 0 || var26 != 0) {
                    var3.field931 = (int) (Math.atan2((double) var25, (double) var26) * 325.949D) & 0x7FF;
                }
            }
        }
    }

    @ObfuscatedName("ef.hu(III)Lff;")
    public static class169 method2934(int arg0, int arg1) {
        field883.field2092 = arg0;
        field883.field2099 = arg1;
        field883.field2093 = 1;
        field883.field2090 = 1;
        return field883;
    }

    @ObfuscatedName("hm.ht(III)V")
    public static final void method4234(int arg0, int arg1) {
        if (field748 < 2 && field839 == 0 && !field766 || !field715) {
            return;
        }
        int var2 = method143();
        String var3;
        if (field839 == 1 && field748 < 2) {
            var3 = class240.field2996 + class240.field3006 + field765 + " " + class76.field1086;
        } else if (field766 && field748 < 2) {
            var3 = field799 + class240.field3006 + field721 + " " + class76.field1086;
        } else {
            var3 = method3295(var2);
        }
        if (field748 > 2) {
            var3 = var3 + class76.method4105(16777215) + " " + '/' + " " + (field748 - 2) + class240.field3000;
        }
        Statics.field66.method5135(var3, arg0 + 4, arg1 + 15, 16777215, 0, field633 / 1000);
    }

    @ObfuscatedName("s.hs(I)V")
    public static final void method108() {
        int var0 = Statics.field969;
        int var1 = Statics.field1958;
        int var2 = Statics.field475;
        int var3 = Statics.field448;
        int var4 = 6116423;
        class320.method5348(var0, var1, var2, var3, var4);
        class320.method5348(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class320.method5352(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field66.method5134(class240.field2926, var0 + 3, var1 + 14, var4, -1);
        int var5 = class49.field437;
        int var6 = class49.field439;
        for (int var7 = 0; var7 < field748; var7++) {
            int var8 = (field748 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            Statics.field66.method5134(method3295(var7), var0 + 3, var8, var9, 0);
        }
        int var10 = Statics.field969;
        int var11 = Statics.field1958;
        int var12 = Statics.field475;
        int var13 = Statics.field448;
        for (int var14 = 0; var14 < field814; var14++) {
            if (field819[var14] + field661[var14] > var10 && field819[var14] < var10 + var12 && field834[var14] + field820[var14] > var11 && field820[var14] < var11 + var13) {
                field817[var14] = true;
            }
        }
    }

    @ObfuscatedName("cy.hv(IIIII)V")
    public static final void method1774(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field814; var4++) {
            if (field819[var4] + field661[var4] > arg0 && field819[var4] < arg0 + arg2 && field834[var4] + field820[var4] > arg1 && field820[var4] < arg1 + arg3) {
                field875[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.hh(I)V")
    public final void method1094() {
        method105();
        if (Statics.field228 != null || field784 != null) {
            return;
        }
        int var12;
        int var14;
        int var15;
        label186: {
            int var1 = class49.field426;
            if (field692) {
                if (var1 != 1 && (Statics.field1754 || var1 != 4)) {
                    int var2 = class49.field437;
                    int var3 = class49.field439;
                    if (var2 < Statics.field969 - 10 || var2 > Statics.field969 + Statics.field475 + 10 || var3 < Statics.field1958 - 10 || var3 > Statics.field448 + Statics.field1958 + 10) {
                        field692 = false;
                        method1774(Statics.field969, Statics.field1958, Statics.field475, Statics.field448);
                    }
                }
                if (var1 == 1 || !Statics.field1754 && var1 == 4) {
                    int var4 = Statics.field969;
                    int var5 = Statics.field1958;
                    int var6 = Statics.field475;
                    int var7 = class49.field443;
                    int var8 = class49.field444;
                    int var9 = -1;
                    for (int var10 = 0; var10 < field748; var10++) {
                        int var11 = (field748 - 1 - var10) * 15 + var5 + 31;
                        if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
                            var9 = var10;
                        }
                    }
                    if (var9 != -1) {
                        method452(var9);
                    }
                    field692 = false;
                    method1774(Statics.field969, Statics.field1958, Statics.field475, Statics.field448);
                }
            } else {
                var12 = method143();
                if ((var1 == 1 || !Statics.field1754 && var1 == 4) && var12 >= 0) {
                    int var13 = field870[var12];
                    if (var13 == 39 || var13 == 40 || var13 == 41 || var13 == 42 || var13 == 43 || var13 == 33 || var13 == 34 || var13 == 35 || var13 == 36 || var13 == 37 || var13 == 38 || var13 == 1005) {
                        var14 = field749[var12];
                        var15 = field750[var12];
                        class233 var16 = class233.method130(var15);
                        if (class234.method2471(method2323(var16))) {
                            break label186;
                        }
                        int var17 = method2323(var16);
                        boolean var18 = (var17 >> 29 & 0x1) != 0;
                        if (var18) {
                            break label186;
                        }
                    }
                }
                if ((var1 == 1 || !Statics.field1754 && var1 == 4) && this.method1084()) {
                    var1 = 2;
                }
                if ((var1 == 1 || !Statics.field1754 && var1 == 4) && field748 > 0) {
                    method452(var12);
                }
                if (var1 == 2 && field748 > 0) {
                    this.method1096(class49.field443, class49.field444);
                }
            }
            return;
        }
        if (Statics.field228 != null && !field722 && field748 > 0 && !this.method1084()) {
            int var19 = field640;
            int var20 = field747;
            class77 var21 = Statics.field1467;
            method2972(var21.field1101, var21.field1098, var21.field1097, var21.field1100, var21.field1099, var21.field1099, var19, var20);
            Statics.field1467 = null;
        }
        field722 = false;
        field723 = 0;
        if (Statics.field228 != null) {
            method956(Statics.field228);
        }
        Statics.field228 = class233.method130(var15);
        field718 = var14;
        field640 = class49.field443;
        field747 = class49.field444;
        if (var12 >= 0) {
            method440(var12);
        }
        method956(Statics.field228);
    }

    @ObfuscatedName("client.hz(B)Z")
    public final boolean method1084() {
        int var1 = method143();
        return (field746 == 1 && field748 > 2 || method3224(var1)) && !field613[var1];
    }

    @ObfuscatedName("client.hc(III)V")
    public final void method1096(int arg0, int arg1) {
        method523(arg0, arg1);
        Statics.field186.method2712(Statics.field517, arg0, arg1, false);
        field692 = true;
    }

    @ObfuscatedName("ag.hj(III)V")
    public static void method523(int arg0, int arg1) {
        int var2 = Statics.field66.method5122(class240.field2926);
        for (int var3 = 0; var3 < field748; var3++) {
            int var4 = Statics.field66.method5122(method3295(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field748 * 15 + 22;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > Statics.field2097) {
            var6 = Statics.field2097 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > Statics.field3800) {
            var7 = Statics.field3800 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        Statics.field969 = var6;
        Statics.field1958 = var7;
        Statics.field475 = var2;
        Statics.field448 = field748 * 15 + 22;
    }

    @ObfuscatedName("fj.hl(II)Z")
    public static final boolean method3224(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field870[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("av.ho(IB)V")
    public static final void method452(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field749[arg0];
        int var2 = field750[arg0];
        int var3 = field870[arg0];
        int var4 = field752[arg0];
        String var5 = field730[arg0];
        String var6 = field754[arg0];
        method2972(var1, var2, var3, var4, var5, var6, class49.field443, class49.field444);
    }

    @ObfuscatedName("eu.hk(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method2972(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 34) {
            class175 var8 = class175.method3561(class172.field2264, field798.field1265);
            var8.field2323.method3359(arg3);
            var8.field2323.method3368(arg1);
            var8.field2323.method3449(arg0);
            field798.method1884(var8);
            field712 = 0;
            Statics.field1392 = class233.method130(arg1);
            field717 = arg0;
        }
        if (arg2 == 41) {
            class175 var9 = class175.method3561(class172.field2192, field798.field1265);
            var9.field2323.method3359(arg0);
            var9.field2323.method3449(arg3);
            var9.field2323.method3331(arg1);
            field798.method1884(var9);
            field712 = 0;
            Statics.field1392 = class233.method130(arg1);
            field717 = arg0;
        }
        if (arg2 == 32) {
            class175 var10 = class175.method3561(class172.field2281, field798.field1265);
            var10.field2323.method3401(arg3);
            var10.field2323.method3449(field678);
            var10.field2323.method3331(arg1);
            var10.field2323.method3319(arg0);
            var10.field2323.method3331(Statics.field1903);
            field798.method1884(var10);
            field712 = 0;
            Statics.field1392 = class233.method130(arg1);
            field717 = arg0;
        }
        if (arg2 == 18) {
            field711 = arg6;
            field832 = arg7;
            field664 = 2;
            field810 = 0;
            field825 = arg0;
            field842 = arg1;
            class175 var11 = class175.method3561(class172.field2231, field798.field1265);
            var11.field2323.method3349(class40.field328[82] ? 1 : 0);
            var11.field2323.method3401(Statics.field64 + arg1);
            var11.field2323.method3449(arg3);
            var11.field2323.method3319(Statics.field1225 + arg0);
            field798.method1884(var11);
        }
        if (arg2 == 1) {
            field711 = arg6;
            field832 = arg7;
            field664 = 2;
            field810 = 0;
            field825 = arg0;
            field842 = arg1;
            class175 var12 = class175.method3561(class172.field2279, field798.field1265);
            var12.field2323.method3368(Statics.field2416);
            var12.field2323.method3449(Statics.field64 + arg1);
            var12.field2323.method3449(Statics.field1828);
            var12.field2323.method3401(arg3);
            var12.field2323.method3351(class40.field328[82] ? 1 : 0);
            var12.field2323.method3401(Statics.field3210);
            var12.field2323.method3359(Statics.field1225 + arg0);
            field798.method1884(var12);
        }
        if (arg2 == 7) {
            class74 var13 = field651[arg3];
            if (var13 != null) {
                field711 = arg6;
                field832 = arg7;
                field664 = 2;
                field810 = 0;
                field825 = arg0;
                field842 = arg1;
                class175 var14 = class175.method3561(class172.field2263, field798.field1265);
                var14.field2323.method3368(Statics.field2416);
                var14.field2323.method3359(Statics.field3210);
                var14.field2323.method3449(arg3);
                var14.field2323.method3449(Statics.field1828);
                var14.field2323.method3318(class40.field328[82] ? 1 : 0);
                field798.method1884(var14);
            }
        }
        if (arg2 == 12) {
            class74 var15 = field651[arg3];
            if (var15 != null) {
                field711 = arg6;
                field832 = arg7;
                field664 = 2;
                field810 = 0;
                field825 = arg0;
                field842 = arg1;
                class175 var16 = class175.method3561(class172.field2224, field798.field1265);
                var16.field2323.method3351(class40.field328[82] ? 1 : 0);
                var16.field2323.method3319(arg3);
                field798.method1884(var16);
            }
        }
        if (arg2 == 1004) {
            field711 = arg6;
            field832 = arg7;
            field664 = 2;
            field810 = 0;
            class175 var17 = class175.method3561(class172.field2214, field798.field1265);
            var17.field2323.method3449(arg3);
            field798.method1884(var17);
        }
        if (arg2 == 8) {
            class74 var18 = field651[arg3];
            if (var18 != null) {
                field711 = arg6;
                field832 = arg7;
                field664 = 2;
                field810 = 0;
                field825 = arg0;
                field842 = arg1;
                class175 var19 = class175.method3561(class172.field2205, field798.field1265);
                var19.field2323.method3401(arg3);
                var19.field2323.method3368(Statics.field1903);
                var19.field2323.method3401(field678);
                var19.field2323.method3318(class40.field328[82] ? 1 : 0);
                field798.method1884(var19);
            }
        }
        if (arg2 == 15) {
            class62 var20 = field727[arg3];
            if (var20 != null) {
                field711 = arg6;
                field832 = arg7;
                field664 = 2;
                field810 = 0;
                field825 = arg0;
                field842 = arg1;
                class175 var21 = class175.method3561(class172.field2262, field798.field1265);
                var21.field2323.method3531(class40.field328[82] ? 1 : 0);
                var21.field2323.method3319(arg3);
                var21.field2323.method3401(field678);
                var21.field2323.method3528(Statics.field1903);
                field798.method1884(var21);
            }
        }
        if (arg2 == 6) {
            field711 = arg6;
            field832 = arg7;
            field664 = 2;
            field810 = 0;
            field825 = arg0;
            field842 = arg1;
            class175 var22 = class175.method3561(class172.field2202, field798.field1265);
            var22.field2323.method3319(arg3);
            var22.field2323.method3401(Statics.field64 + arg1);
            var22.field2323.method3351(class40.field328[82] ? 1 : 0);
            var22.field2323.method3359(Statics.field1225 + arg0);
            field798.method1884(var22);
        }
        if (arg2 == 40) {
            class175 var23 = class175.method3561(class172.field2238, field798.field1265);
            var23.field2323.method3359(arg3);
            var23.field2323.method3331(arg1);
            var23.field2323.method3401(arg0);
            field798.method1884(var23);
            field712 = 0;
            Statics.field1392 = class233.method130(arg1);
            field717 = arg0;
        }
        if (arg2 == 10) {
            class74 var24 = field651[arg3];
            if (var24 != null) {
                field711 = arg6;
                field832 = arg7;
                field664 = 2;
                field810 = 0;
                field825 = arg0;
                field842 = arg1;
                class175 var25 = class175.method3561(class172.field2288, field798.field1265);
                var25.field2323.method3531(class40.field328[82] ? 1 : 0);
                var25.field2323.method3449(arg3);
                field798.method1884(var25);
            }
        }
        if (arg2 == 51) {
            class62 var26 = field727[arg3];
            if (var26 != null) {
                field711 = arg6;
                field832 = arg7;
                field664 = 2;
                field810 = 0;
                field825 = arg0;
                field842 = arg1;
                class175 var27 = class175.method3561(class172.field2258, field798.field1265);
                var27.field2323.method3449(arg3);
                var27.field2323.method3349(class40.field328[82] ? 1 : 0);
                field798.method1884(var27);
            }
        }
        if (arg2 == 21) {
            field711 = arg6;
            field832 = arg7;
            field664 = 2;
            field810 = 0;
            field825 = arg0;
            field842 = arg1;
            class175 var28 = class175.method3561(class172.field2285, field798.field1265);
            var28.field2323.method3359(Statics.field1225 + arg0);
            var28.field2323.method3318(class40.field328[82] ? 1 : 0);
            var28.field2323.method3449(Statics.field64 + arg1);
            var28.field2323.method3401(arg3);
            field798.method1884(var28);
        }
        if (arg2 == 25) {
            class233 var29 = class233.method3146(arg1, arg0);
            if (var29 != null) {
                method3084();
                int var30 = class234.method4585(method2323(var29));
                int var31 = var29.field2783;
                class233 var32 = class233.method3146(arg1, arg0);
                if (var32 != null && var32.field2753 != null) {
                    class58 var33 = new class58();
                    var33.field531 = var32;
                    var33.field545 = var32.field2753;
                    class71.method1800(var33);
                }
                field768 = var31;
                field766 = true;
                Statics.field1903 = arg1;
                field678 = arg0;
                Statics.field490 = var30;
                method956(var32);
                field839 = 0;
                field799 = method1001(var29);
                if (field799 == null) {
                    field799 = class240.field2850;
                }
                if (var29.field2655) {
                    field721 = var29.field2735 + class76.method4105(16777215);
                } else {
                    field721 = class76.method4105(65280) + var29.field2778 + class76.method4105(16777215);
                }
            }
            return;
        }
        if (arg2 == 9) {
            class74 var34 = field651[arg3];
            if (var34 != null) {
                field711 = arg6;
                field832 = arg7;
                field664 = 2;
                field810 = 0;
                field825 = arg0;
                field842 = arg1;
                class175 var35 = class175.method3561(class172.field2246, field798.field1265);
                var35.field2323.method3449(arg3);
                var35.field2323.method3531(class40.field328[82] ? 1 : 0);
                field798.method1884(var35);
            }
        }
        if (arg2 == 31) {
            class175 var36 = class175.method3561(class172.field2188, field798.field1265);
            var36.field2323.method3368(arg1);
            var36.field2323.method3359(arg0);
            var36.field2323.method3319(Statics.field1828);
            var36.field2323.method3449(Statics.field3210);
            var36.field2323.method3368(Statics.field2416);
            var36.field2323.method3449(arg3);
            field798.method1884(var36);
            field712 = 0;
            Statics.field1392 = class233.method130(arg1);
            field717 = arg0;
        }
        if (arg2 == 38) {
            method3084();
            class233 var37 = class233.method130(arg1);
            field839 = 1;
            Statics.field1828 = arg0;
            Statics.field2416 = arg1;
            Statics.field3210 = arg3;
            method956(var37);
            field765 = class76.method4105(16748608) + class272.method2892(arg3).field3492 + class76.method4105(16777215);
            if (field765 == null) {
                field765 = class240.field2850;
            }
            return;
        }
        if (arg2 == 1002) {
            field711 = arg6;
            field832 = arg7;
            field664 = 2;
            field810 = 0;
            class175 var38 = class175.method3561(class172.field2235, field798.field1265);
            var38.field2323.method3449(arg3);
            field798.method1884(var38);
        }
        if (arg2 == 16) {
            field711 = arg6;
            field832 = arg7;
            field664 = 2;
            field810 = 0;
            field825 = arg0;
            field842 = arg1;
            class175 var39 = class175.method3561(class172.field2196, field798.field1265);
            var39.field2323.method3368(Statics.field2416);
            var39.field2323.method3449(arg3);
            var39.field2323.method3359(Statics.field1828);
            var39.field2323.method3349(class40.field328[82] ? 1 : 0);
            var39.field2323.method3449(Statics.field1225 + arg0);
            var39.field2323.method3449(Statics.field64 + arg1);
            var39.field2323.method3449(Statics.field3210);
            field798.method1884(var39);
        }
        if (arg2 == 2) {
            field711 = arg6;
            field832 = arg7;
            field664 = 2;
            field810 = 0;
            field825 = arg0;
            field842 = arg1;
            class175 var40 = class175.method3561(class172.field2267, field798.field1265);
            var40.field2323.method3359(Statics.field1225 + arg0);
            var40.field2323.method3401(field678);
            var40.field2323.method3528(Statics.field1903);
            var40.field2323.method3401(arg3);
            var40.field2323.method3319(Statics.field64 + arg1);
            var40.field2323.method3349(class40.field328[82] ? 1 : 0);
            field798.method1884(var40);
        }
        if (arg2 == 1005) {
            class233 var41 = class233.method130(arg1);
            if (var41 == null || var41.field2646[arg0] < 100000) {
                class175 var42 = class175.method3561(class172.field2214, field798.field1265);
                var42.field2323.method3449(arg3);
                field798.method1884(var42);
            } else {
                class86.method1011(27, "", var41.field2646[arg0] + " x " + class272.method2892(arg3).field3492);
            }
            field712 = 0;
            Statics.field1392 = class233.method130(arg1);
            field717 = arg0;
        }
        if (arg2 == 50) {
            class62 var43 = field727[arg3];
            if (var43 != null) {
                field711 = arg6;
                field832 = arg7;
                field664 = 2;
                field810 = 0;
                field825 = arg0;
                field842 = arg1;
                class175 var44 = class175.method3561(class172.field2270, field798.field1265);
                var44.field2323.method3401(arg3);
                var44.field2323.method3349(class40.field328[82] ? 1 : 0);
                field798.method1884(var44);
            }
        }
        if (arg2 == 49) {
            class62 var45 = field727[arg3];
            if (var45 != null) {
                field711 = arg6;
                field832 = arg7;
                field664 = 2;
                field810 = 0;
                field825 = arg0;
                field842 = arg1;
                class175 var46 = class175.method3561(class172.field2276, field798.field1265);
                var46.field2323.method3531(class40.field328[82] ? 1 : 0);
                var46.field2323.method3449(arg3);
                field798.method1884(var46);
            }
        }
        if (arg2 == 35) {
            class175 var47 = class175.method3561(class172.field2242, field798.field1265);
            var47.field2323.method3368(arg1);
            var47.field2323.method3401(arg0);
            var47.field2323.method3319(arg3);
            field798.method1884(var47);
            field712 = 0;
            Statics.field1392 = class233.method130(arg1);
            field717 = arg0;
        }
        if (arg2 == 37) {
            class175 var48 = class175.method3561(class172.field2269, field798.field1265);
            var48.field2323.method3319(arg3);
            var48.field2323.method3319(arg0);
            var48.field2323.method3368(arg1);
            field798.method1884(var48);
            field712 = 0;
            Statics.field1392 = class233.method130(arg1);
            field717 = arg0;
        }
        if (arg2 == 5) {
            field711 = arg6;
            field832 = arg7;
            field664 = 2;
            field810 = 0;
            field825 = arg0;
            field842 = arg1;
            class175 var49 = class175.method3561(class172.field2253, field798.field1265);
            var49.field2323.method3319(Statics.field1225 + arg0);
            var49.field2323.method3359(arg3);
            var49.field2323.method3359(Statics.field64 + arg1);
            var49.field2323.method3351(class40.field328[82] ? 1 : 0);
            field798.method1884(var49);
        }
        if (arg2 == 23) {
            if (field692) {
                Statics.field186.method2786();
            } else {
                Statics.field186.method2712(Statics.field517, arg0, arg1, true);
            }
        }
        if (arg2 == 1001) {
            field711 = arg6;
            field832 = arg7;
            field664 = 2;
            field810 = 0;
            field825 = arg0;
            field842 = arg1;
            class175 var50 = class175.method3561(class172.field2245, field798.field1265);
            var50.field2323.method3318(class40.field328[82] ? 1 : 0);
            var50.field2323.method3359(arg3);
            var50.field2323.method3319(Statics.field64 + arg1);
            var50.field2323.method3319(Statics.field1225 + arg0);
            field798.method1884(var50);
        }
        if (arg2 == 30 && field710 == null) {
            class175 var51 = class175.method3561(class172.field2218, field798.field1265);
            var51.field2323.method3359(arg0);
            var51.field2323.method3528(arg1);
            field798.method1884(var51);
            field710 = class233.method3146(arg1, arg0);
            method956(field710);
        }
        if (arg2 == 45) {
            class62 var52 = field727[arg3];
            if (var52 != null) {
                field711 = arg6;
                field832 = arg7;
                field664 = 2;
                field810 = 0;
                field825 = arg0;
                field842 = arg1;
                class175 var53 = class175.method3561(class172.field2230, field798.field1265);
                var53.field2323.method3318(class40.field328[82] ? 1 : 0);
                var53.field2323.method3319(arg3);
                field798.method1884(var53);
            }
        }
        if (arg2 == 4) {
            field711 = arg6;
            field832 = arg7;
            field664 = 2;
            field810 = 0;
            field825 = arg0;
            field842 = arg1;
            class175 var54 = class175.method3561(class172.field2229, field798.field1265);
            var54.field2323.method3359(Statics.field64 + arg1);
            var54.field2323.method3319(arg3);
            var54.field2323.method3318(class40.field328[82] ? 1 : 0);
            var54.field2323.method3319(Statics.field1225 + arg0);
            field798.method1884(var54);
        }
        if (arg2 == 26) {
            class175 var55 = class175.method3561(class172.field2248, field798.field1265);
            field798.method1884(var55);
            for (class57 var56 = (class57) field771.method3766(); var56 != null; var56 = (class57) field771.method3764()) {
                if (var56.field526 == 0 || var56.field526 == 3) {
                    method937(var56, true);
                }
            }
            if (field710 != null) {
                method956(field710);
                field710 = null;
            }
        }
        if (arg2 == 13) {
            class74 var57 = field651[arg3];
            if (var57 != null) {
                field711 = arg6;
                field832 = arg7;
                field664 = 2;
                field810 = 0;
                field825 = arg0;
                field842 = arg1;
                class175 var58 = class175.method3561(class172.field2286, field798.field1265);
                var58.field2323.method3318(class40.field328[82] ? 1 : 0);
                var58.field2323.method3359(arg3);
                field798.method1884(var58);
            }
        }
        if (arg2 == 11) {
            class74 var59 = field651[arg3];
            if (var59 != null) {
                field711 = arg6;
                field832 = arg7;
                field664 = 2;
                field810 = 0;
                field825 = arg0;
                field842 = arg1;
                class175 var60 = class175.method3561(class172.field2195, field798.field1265);
                var60.field2323.method3401(arg3);
                var60.field2323.method3531(class40.field328[82] ? 1 : 0);
                field798.method1884(var60);
            }
        }
        if (arg2 == 14) {
            class62 var61 = field727[arg3];
            if (var61 != null) {
                field711 = arg6;
                field832 = arg7;
                field664 = 2;
                field810 = 0;
                field825 = arg0;
                field842 = arg1;
                class175 var62 = class175.method3561(class172.field2254, field798.field1265);
                var62.field2323.method3359(Statics.field3210);
                var62.field2323.method3449(Statics.field1828);
                var62.field2323.method3359(arg3);
                var62.field2323.method3368(Statics.field2416);
                var62.field2323.method3351(class40.field328[82] ? 1 : 0);
                field798.method1884(var62);
            }
        }
        if (arg2 == 3) {
            field711 = arg6;
            field832 = arg7;
            field664 = 2;
            field810 = 0;
            field825 = arg0;
            field842 = arg1;
            class175 var63 = class175.method3561(class172.field2260, field798.field1265);
            var63.field2323.method3401(Statics.field64 + arg1);
            var63.field2323.method3401(arg3);
            var63.field2323.method3349(class40.field328[82] ? 1 : 0);
            var63.field2323.method3449(Statics.field1225 + arg0);
            field798.method1884(var63);
        }
        if (arg2 == 22) {
            field711 = arg6;
            field832 = arg7;
            field664 = 2;
            field810 = 0;
            field825 = arg0;
            field842 = arg1;
            class175 var64 = class175.method3561(class172.field2256, field798.field1265);
            var64.field2323.method3401(arg3);
            var64.field2323.method3401(Statics.field1225 + arg0);
            var64.field2323.method3359(Statics.field64 + arg1);
            var64.field2323.method3351(class40.field328[82] ? 1 : 0);
            field798.method1884(var64);
        }
        if (arg2 == 43) {
            class175 var65 = class175.method3561(class172.field2220, field798.field1265);
            var65.field2323.method3528(arg1);
            var65.field2323.method3401(arg3);
            var65.field2323.method3449(arg0);
            field798.method1884(var65);
            field712 = 0;
            Statics.field1392 = class233.method130(arg1);
            field717 = arg0;
        }
        if (arg2 == 36) {
            class175 var66 = class175.method3561(class172.field2251, field798.field1265);
            var66.field2323.method3368(arg1);
            var66.field2323.method3449(arg0);
            var66.field2323.method3401(arg3);
            field798.method1884(var66);
            field712 = 0;
            Statics.field1392 = class233.method130(arg1);
            field717 = arg0;
        }
        if (arg2 == 46) {
            class62 var67 = field727[arg3];
            if (var67 != null) {
                field711 = arg6;
                field832 = arg7;
                field664 = 2;
                field810 = 0;
                field825 = arg0;
                field842 = arg1;
                class175 var68 = class175.method3561(class172.field2199, field798.field1265);
                var68.field2323.method3531(class40.field328[82] ? 1 : 0);
                var68.field2323.method3319(arg3);
                field798.method1884(var68);
            }
        }
        if (arg2 == 20) {
            field711 = arg6;
            field832 = arg7;
            field664 = 2;
            field810 = 0;
            field825 = arg0;
            field842 = arg1;
            class175 var69 = class175.method3561(class172.field2208, field798.field1265);
            var69.field2323.method3359(Statics.field1225 + arg0);
            var69.field2323.method3318(class40.field328[82] ? 1 : 0);
            var69.field2323.method3319(arg3);
            var69.field2323.method3359(Statics.field64 + arg1);
            field798.method1884(var69);
        }
        if (arg2 == 47) {
            class62 var70 = field727[arg3];
            if (var70 != null) {
                field711 = arg6;
                field832 = arg7;
                field664 = 2;
                field810 = 0;
                field825 = arg0;
                field842 = arg1;
                class175 var71 = class175.method3561(class172.field2212, field798.field1265);
                var71.field2323.method3351(class40.field328[82] ? 1 : 0);
                var71.field2323.method3449(arg3);
                field798.method1884(var71);
            }
        }
        if (arg2 == 58) {
            class233 var72 = class233.method3146(arg1, arg0);
            if (var72 != null) {
                class175 var73 = class175.method3561(class172.field2234, field798.field1265);
                var73.field2323.method3368(Statics.field1903);
                var73.field2323.method3528(arg1);
                var73.field2323.method3449(var72.field2783);
                var73.field2323.method3359(field768);
                var73.field2323.method3401(arg0);
                var73.field2323.method3319(field678);
                field798.method1884(var73);
            }
        }
        if (arg2 == 29) {
            class175 var74 = class175.method3561(class172.field2201, field798.field1265);
            var74.field2323.method3528(arg1);
            field798.method1884(var74);
            class233 var75 = class233.method130(arg1);
            if (var75.field2774 != null && var75.field2774[0][0] == 5) {
                int var76 = var75.field2774[0][1];
                if (class228.field2617[var76] != var75.field2702[0]) {
                    class228.field2617[var76] = var75.field2702[0];
                    method2960(var76);
                }
            }
        }
        if (arg2 == 39) {
            class175 var77 = class175.method3561(class172.field2191, field798.field1265);
            var77.field2323.method3359(arg3);
            var77.field2323.method3331(arg1);
            var77.field2323.method3359(arg0);
            field798.method1884(var77);
            field712 = 0;
            Statics.field1392 = class233.method130(arg1);
            field717 = arg0;
        }
        if (arg2 == 1003) {
            field711 = arg6;
            field832 = arg7;
            field664 = 2;
            field810 = 0;
            class74 var78 = field651[arg3];
            if (var78 != null) {
                class274 var79 = var78.field1071;
                if (var79.field3572 != null) {
                    var79 = var79.method4802();
                }
                if (var79 != null) {
                    class175 var80 = class175.method3561(class172.field2243, field798.field1265);
                    var80.field2323.method3449(var79.field3558);
                    field798.method1884(var80);
                }
            }
        }
        if (arg2 == 28) {
            class175 var81 = class175.method3561(class172.field2201, field798.field1265);
            var81.field2323.method3528(arg1);
            field798.method1884(var81);
            class233 var82 = class233.method130(arg1);
            if (var82.field2774 != null && var82.field2774[0][0] == 5) {
                int var83 = var82.field2774[0][1];
                class228.field2617[var83] = 1 - class228.field2617[var83];
                method2960(var83);
            }
        }
        if (arg2 == 48) {
            class62 var84 = field727[arg3];
            if (var84 != null) {
                field711 = arg6;
                field832 = arg7;
                field664 = 2;
                field810 = 0;
                field825 = arg0;
                field842 = arg1;
                class175 var85 = class175.method3561(class172.field2240, field798.field1265);
                var85.field2323.method3351(class40.field328[82] ? 1 : 0);
                var85.field2323.method3401(arg3);
                field798.method1884(var85);
            }
        }
        if (arg2 == 17) {
            field711 = arg6;
            field832 = arg7;
            field664 = 2;
            field810 = 0;
            field825 = arg0;
            field842 = arg1;
            class175 var86 = class175.method3561(class172.field2274, field798.field1265);
            var86.field2323.method3449(field678);
            var86.field2323.method3401(Statics.field64 + arg1);
            var86.field2323.method3401(Statics.field1225 + arg0);
            var86.field2323.method3531(class40.field328[82] ? 1 : 0);
            var86.field2323.method3369(Statics.field1903);
            var86.field2323.method3449(arg3);
            field798.method1884(var86);
        }
        if (arg2 == 44) {
            class62 var87 = field727[arg3];
            if (var87 != null) {
                field711 = arg6;
                field832 = arg7;
                field664 = 2;
                field810 = 0;
                field825 = arg0;
                field842 = arg1;
                class175 var88 = class175.method3561(class172.field2219, field798.field1265);
                var88.field2323.method3318(class40.field328[82] ? 1 : 0);
                var88.field2323.method3319(arg3);
                field798.method1884(var88);
            }
        }
        if (arg2 == 42) {
            class175 var89 = class175.method3561(class172.field2216, field798.field1265);
            var89.field2323.method3319(arg0);
            var89.field2323.method3319(arg3);
            var89.field2323.method3368(arg1);
            field798.method1884(var89);
            field712 = 0;
            Statics.field1392 = class233.method130(arg1);
            field717 = arg0;
        }
        if (arg2 == 24) {
            class233 var90 = class233.method130(arg1);
            boolean var91 = true;
            if (var90.field2660 > 0) {
                var91 = method3147(var90);
            }
            if (var91) {
                class175 var92 = class175.method3561(class172.field2201, field798.field1265);
                var92.field2323.method3528(arg1);
                field798.method1884(var92);
            }
        }
        if (arg2 == 33) {
            class175 var93 = class175.method3561(class172.field2287, field798.field1265);
            var93.field2323.method3401(arg3);
            var93.field2323.method3359(arg0);
            var93.field2323.method3368(arg1);
            field798.method1884(var93);
            field712 = 0;
            Statics.field1392 = class233.method130(arg1);
            field717 = arg0;
        }
        if (arg2 == 57 || arg2 == 1007) {
            class233 var94 = class233.method3146(arg1, arg0);
            if (var94 != null) {
                method206(arg3, arg1, arg0, var94.field2783, arg5);
            }
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field2074.method5685(arg2, arg3, new class229(arg0), new class229(arg1));
        }
        if (arg2 == 19) {
            field711 = arg6;
            field832 = arg7;
            field664 = 2;
            field810 = 0;
            field825 = arg0;
            field842 = arg1;
            class175 var95 = class175.method3561(class172.field2227, field798.field1265);
            var95.field2323.method3359(Statics.field1225 + arg0);
            var95.field2323.method3359(arg3);
            var95.field2323.method3359(Statics.field64 + arg1);
            var95.field2323.method3318(class40.field328[82] ? 1 : 0);
            field798.method1884(var95);
        }
        if (field839 != 0) {
            field839 = 0;
            method956(class233.method130(Statics.field2416));
        }
        if (field766) {
            method3084();
        }
        if (Statics.field1392 != null && field712 == 0) {
            method956(Statics.field1392);
        }
    }

    @ObfuscatedName("y.hm(ILjava/lang/String;I)V")
    public static void method442(int arg0, String arg1) {
        int var2 = class84.field1204;
        int[] var3 = class84.field1209;
        boolean var4 = false;
        class294 var5 = new class294(arg1, Statics.field459);
        for (int var6 = 0; var6 < var2; var6++) {
            class62 var7 = field727[var3[var6]];
            if (var7 != null && Statics.field502 != var7 && var7.field573 != null && var7.field573.equals(var5)) {
                if (arg0 == 1) {
                    class175 var8 = class175.method3561(class172.field2219, field798.field1265);
                    var8.field2323.method3318(0);
                    var8.field2323.method3319(var3[var6]);
                    field798.method1884(var8);
                } else if (arg0 == 4) {
                    class175 var9 = class175.method3561(class172.field2212, field798.field1265);
                    var9.field2323.method3351(0);
                    var9.field2323.method3449(var3[var6]);
                    field798.method1884(var9);
                } else if (arg0 == 6) {
                    class175 var10 = class175.method3561(class172.field2276, field798.field1265);
                    var10.field2323.method3531(0);
                    var10.field2323.method3449(var3[var6]);
                    field798.method1884(var10);
                } else if (arg0 == 7) {
                    class175 var11 = class175.method3561(class172.field2270, field798.field1265);
                    var11.field2323.method3401(var3[var6]);
                    var11.field2323.method3349(0);
                    field798.method1884(var11);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class86.method1011(4, "", class240.field2951 + arg1);
        }
    }

    @ObfuscatedName("fk.ia(B)V")
    public static void method3084() {
        if (!field766) {
            return;
        }
        class233 var0 = class233.method3146(Statics.field1903, field678);
        if (var0 != null && var0.field2754 != null) {
            class58 var1 = new class58();
            var1.field531 = var0;
            var1.field545 = var0.field2754;
            class71.method1800(var1);
        }
        field766 = false;
        method956(var0);
    }

    @ObfuscatedName("u.il(IIIILjava/lang/String;I)V")
    public static void method206(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class233 var5 = class233.method3146(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2762 != null) {
            class58 var6 = new class58();
            var6.field531 = var5;
            var6.field534 = arg0;
            var6.field542 = arg4;
            var6.field545 = var5.field2762;
            class71.method1800(var6);
        }
        boolean var7 = true;
        if (var5.field2660 > 0) {
            var7 = method3147(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = method2323(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            class175 var11 = class175.method3561(class172.field2249, field798.field1265);
            var11.field2323.method3528(arg1);
            var11.field2323.method3449(arg2);
            var11.field2323.method3449(arg3);
            field798.method1884(var11);
        }
        if (arg0 == 2) {
            class175 var12 = class175.method3561(class172.field2257, field798.field1265);
            var12.field2323.method3528(arg1);
            var12.field2323.method3449(arg2);
            var12.field2323.method3449(arg3);
            field798.method1884(var12);
        }
        if (arg0 == 3) {
            class175 var13 = class175.method3561(class172.field2226, field798.field1265);
            var13.field2323.method3528(arg1);
            var13.field2323.method3449(arg2);
            var13.field2323.method3449(arg3);
            field798.method1884(var13);
        }
        if (arg0 == 4) {
            class175 var14 = class175.method3561(class172.field2278, field798.field1265);
            var14.field2323.method3528(arg1);
            var14.field2323.method3449(arg2);
            var14.field2323.method3449(arg3);
            field798.method1884(var14);
        }
        if (arg0 == 5) {
            class175 var15 = class175.method3561(class172.field2247, field798.field1265);
            var15.field2323.method3528(arg1);
            var15.field2323.method3449(arg2);
            var15.field2323.method3449(arg3);
            field798.method1884(var15);
        }
        if (arg0 == 6) {
            class175 var16 = class175.method3561(class172.field2193, field798.field1265);
            var16.field2323.method3528(arg1);
            var16.field2323.method3449(arg2);
            var16.field2323.method3449(arg3);
            field798.method1884(var16);
        }
        if (arg0 == 7) {
            class175 var17 = class175.method3561(class172.field2273, field798.field1265);
            var17.field2323.method3528(arg1);
            var17.field2323.method3449(arg2);
            var17.field2323.method3449(arg3);
            field798.method1884(var17);
        }
        if (arg0 == 8) {
            class175 var18 = class175.method3561(class172.field2225, field798.field1265);
            var18.field2323.method3528(arg1);
            var18.field2323.method3449(arg2);
            var18.field2323.method3449(arg3);
            field798.method1884(var18);
        }
        if (arg0 == 9) {
            class175 var19 = class175.method3561(class172.field2197, field798.field1265);
            var19.field2323.method3528(arg1);
            var19.field2323.method3449(arg2);
            var19.field2323.method3449(arg3);
            field798.method1884(var19);
        }
        if (arg0 != 10) {
            return;
        }
        class175 var20 = class175.method3561(class172.field2241, field798.field1265);
        var20.field2323.method3528(arg1);
        var20.field2323.method3449(arg2);
        var20.field2323.method3449(arg3);
        field798.method1884(var20);
    }

    @ObfuscatedName("s.ij(I)V")
    public static final void method105() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field748 - 1; var1++) {
                if (field870[var1] < 1000 && field870[var1 + 1] > 1000) {
                    String var2 = field754[var1];
                    field754[var1] = field754[var1 + 1];
                    field754[var1 + 1] = var2;
                    String var3 = field730[var1];
                    field730[var1] = field730[var1 + 1];
                    field730[var1 + 1] = var3;
                    int var4 = field870[var1];
                    field870[var1] = field870[var1 + 1];
                    field870[var1 + 1] = var4;
                    int var5 = field749[var1];
                    field749[var1] = field749[var1 + 1];
                    field749[var1 + 1] = var5;
                    int var6 = field750[var1];
                    field750[var1] = field750[var1 + 1];
                    field750[var1 + 1] = var6;
                    int var7 = field752[var1];
                    field752[var1] = field752[var1 + 1];
                    field752[var1 + 1] = var7;
                    boolean var8 = field613[var1];
                    field613[var1] = field613[var1 + 1];
                    field613[var1 + 1] = var8;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("ap.ik(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method603(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method948(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("bq.ii(Ljava/lang/String;Ljava/lang/String;IIIIZI)V")
    public static final void method948(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field692 || field748 >= 500) {
            return;
        }
        field730[field748] = arg0;
        field754[field748] = arg1;
        field870[field748] = arg2;
        field752[field748] = arg3;
        field749[field748] = arg4;
        field750[field748] = arg5;
        field613[field748] = arg6;
        field748++;
    }

    @ObfuscatedName("k.im(I)I")
    public static final int method143() {
        return field748 - 1;
    }

    @ObfuscatedName("gb.iw(I)V")
    public static void method3555() {
        for (int var0 = 0; var0 < field748; var0++) {
            if (Statics.method3216(field870[var0])) {
                if (var0 < field748 - 1) {
                    for (int var1 = var0; var1 < field748 - 1; var1++) {
                        field730[var1] = field730[var1 + 1];
                        field754[var1] = field754[var1 + 1];
                        field870[var1] = field870[var1 + 1];
                        field752[var1] = field752[var1 + 1];
                        field749[var1] = field749[var1 + 1];
                        field750[var1] = field750[var1 + 1];
                        field613[var1] = field613[var1 + 1];
                    }
                }
                var0--;
                field748--;
            }
        }
        method523(Statics.field475 / 2 + Statics.field969, Statics.field1958);
    }

    @ObfuscatedName("ft.in(II)Ljava/lang/String;")
    public static String method3295(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (field754[arg0].length() > 0) {
            return field730[arg0] + class240.field3006 + field754[arg0];
        } else {
            return field730[arg0];
        }
    }

    @ObfuscatedName("bo.iv(Ljo;IIIB)V")
    public static final void method1065(class274 arg0, int arg1, int arg2, int arg3) {
        if (field748 >= 400) {
            return;
        }
        if (arg0.field3572 != null) {
            arg0 = arg0.method4802();
        }
        if (arg0 == null || !arg0.field3575 || arg0.field3577 && field714 != arg1) {
            return;
        }
        String var4 = arg0.field3547;
        if (arg0.field3564 != 0) {
            var4 = var4 + Statics.method1729(arg0.field3564, Statics.field502.field576) + " " + class76.field1089 + class240.field3002 + arg0.field3564 + class76.field1090;
        }
        if (arg0.field3577 && field773) {
            method603(class240.field2997, class76.method4105(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field839 == 1) {
            method603(class240.field2996, field765 + " " + class76.field1086 + " " + class76.method4105(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field766) {
            int var5 = arg0.field3577 && field773 ? 2000 : 0;
            String[] var6 = arg0.field3562;
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].equalsIgnoreCase(class240.field2998)) {
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
                        method603(var6[var7], class76.method4105(16776960) + var4, var8, arg1, arg2, arg3);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].equalsIgnoreCase(class240.field2998)) {
                        short var10 = 0;
                        if (field638 != class79.field1112) {
                            if (field638 == class79.field1111 || field638 == class79.field1119 && arg0.field3564 > Statics.field502.field576) {
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
                            method603(var6[var9], class76.method4105(16776960) + var4, var11, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3577 || !field773) {
                method603(class240.field2997, class76.method4105(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field490 & 0x2) == 2) {
            method603(field799, field721 + " " + class76.field1086 + " " + class76.method4105(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("hq.if(Lbo;IIII)V")
    public static final void method3903(class62 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field502 == arg0 || field748 >= 400) {
            return;
        }
        String var4;
        if (arg0.field577 == 0) {
            var4 = arg0.field575[0] + arg0.field573 + arg0.field575[1] + Statics.method1729(arg0.field576, Statics.field502.field576) + " " + class76.field1089 + class240.field3002 + arg0.field576 + class76.field1090 + arg0.field575[2];
        } else {
            var4 = arg0.field575[0] + arg0.field573 + arg0.field575[1] + " " + class76.field1089 + class240.field3010 + arg0.field577 + class76.field1090 + arg0.field575[2];
        }
        if (field839 == 1) {
            method603(class240.field2996, field765 + " " + class76.field1086 + " " + class76.method4105(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field766) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field735[var5] != null) {
                    short var6 = 0;
                    if (field735[var5].equalsIgnoreCase(class240.field2998)) {
                        if (field637 == class79.field1112) {
                            continue;
                        }
                        if (field637 == class79.field1111 || field637 == class79.field1119 && arg0.field576 > Statics.field502.field576) {
                            var6 = 2000;
                        }
                        if (Statics.field502.field590 != 0 && arg0.field590 != 0) {
                            if (Statics.field502.field590 == arg0.field590) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field736[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field734[var5] + var6;
                    method603(field735[var5], class76.method4105(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field490 & 0x8) == 8) {
            method603(field799, field721 + " " + class76.field1086 + " " + class76.method4105(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field748; var9++) {
            if (field870[var9] == 23) {
                field754[var9] = class76.method4105(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("bt.ir(IIIIIIIII)V")
    public static final void method1079(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class233.method627(arg0)) {
            Statics.field1193 = null;
            method651(Statics.field2763[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field1193 != null) {
                method651(Statics.field1193, -1412584499, arg1, arg2, arg3, arg4, Statics.field308, Statics.field1943, arg7);
                Statics.field1193 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field875[var8] = true;
            }
        } else {
            field875[arg7] = true;
        }
    }

    @ObfuscatedName("ab.iy([Lhk;IIIIIIIII)V")
    public static final void method651(class233[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class320.method5408(arg2, arg3, arg4, arg5);
        class125.method2601();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class233 var10 = arg0[var9];
            if (var10 != null && (var10.field2672 == arg1 || arg1 == -1412584499 && field784 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field819[field814] = var10.field2669 + arg6;
                    field820[field814] = var10.field2742 + arg7;
                    field661[field814] = var10.field2746;
                    field834[field814] = var10.field2675;
                    var11 = ++field814 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2793 = var11;
                var10.field2794 = field633;
                if (var10.field2655) {
                    boolean var12 = var10.field2676;
                    if (var12) {
                        continue;
                    }
                }
                if (var10.field2660 > 0) {
                    int var13 = var10.field2660;
                    if (var13 == 324) {
                        if (field625 == -1) {
                            field625 = var10.field2691;
                            field696 = var10.field2692;
                        }
                        if (field851.field2632) {
                            var10.field2691 = field625;
                        } else {
                            var10.field2691 = field696;
                        }
                    } else if (var13 == 325) {
                        if (field625 == -1) {
                            field625 = var10.field2691;
                            field696 = var10.field2692;
                        }
                        if (field851.field2632) {
                            var10.field2691 = field696;
                        } else {
                            var10.field2691 = field625;
                        }
                    } else if (var13 == 327) {
                        var10.field2733 = 150;
                        var10.field2708 = (int) (Math.sin((double) field633 / 40.0D) * 256.0D) & 0x7FF;
                        var10.field2710 = 5;
                        var10.field2700 = 0;
                    } else if (var13 == 328) {
                        var10.field2733 = 150;
                        var10.field2708 = (int) (Math.sin((double) field633 / 40.0D) * 256.0D) & 0x7FF;
                        var10.field2710 = 5;
                        var10.field2700 = 1;
                    }
                }
                int var14 = var10.field2669 + arg6;
                int var15 = var10.field2742 + arg7;
                int var16 = var10.field2687;
                if (field784 == var10) {
                    if (arg1 != -1412584499 && !var10.field2724) {
                        Statics.field1193 = arg0;
                        Statics.field308 = arg6;
                        Statics.field1943 = arg7;
                        continue;
                    }
                    if (field795 && field716) {
                        int var17 = class49.field437;
                        int var18 = class49.field439;
                        int var19 = var17 - field801;
                        int var20 = var18 - field787;
                        if (var19 < field790) {
                            var19 = field790;
                        }
                        if (var10.field2746 + var19 > field790 + field777.field2746) {
                            var19 = field790 + field777.field2746 - var10.field2746;
                        }
                        if (var20 < field791) {
                            var20 = field791;
                        }
                        if (var10.field2675 + var20 > field791 + field777.field2675) {
                            var20 = field791 + field777.field2675 - var10.field2675;
                        }
                        var14 = var19;
                        var15 = var20;
                    }
                    if (!var10.field2724) {
                        var16 = 128;
                    }
                }
                int var21;
                int var22;
                int var23;
                int var24;
                if (var10.field2658 == 2) {
                    var21 = arg2;
                    var22 = arg3;
                    var23 = arg4;
                    var24 = arg5;
                } else if (var10.field2658 == 9) {
                    int var25 = var14;
                    int var26 = var15;
                    int var27 = var10.field2746 + var14;
                    int var28 = var10.field2675 + var15;
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
                    int var31 = var10.field2746 + var14;
                    int var32 = var10.field2675 + var15;
                    var21 = var14 > arg2 ? var14 : arg2;
                    var22 = var15 > arg3 ? var15 : arg3;
                    var23 = var31 < arg4 ? var31 : arg4;
                    var24 = var32 < arg5 ? var32 : arg5;
                }
                if (!var10.field2655 || var21 < var23 && var22 < var24) {
                    if (var10.field2660 != 0) {
                        if (var10.field2660 == 1336) {
                            if (field627) {
                                var15 += 15;
                                Statics.field1941.method5129("Fps:" + field397, var10.field2746 + var14, var15, 16776960, -1);
                                var15 += 15;
                                Runtime var33 = Runtime.getRuntime();
                                int var34 = (int) ((var33.totalMemory() - var33.freeMemory()) / 1024L);
                                int var35 = 16776960;
                                if (var34 > 327680 && !field614) {
                                    var35 = 16711680;
                                }
                                Statics.field1941.method5129("Mem:" + var34 + "k", var10.field2746 + var14, var15, var35, -1);
                                var15 += 15;
                            }
                            continue;
                        }
                        if (var10.field2660 == 1337) {
                            field760 = var14;
                            field761 = var15;
                            method4104(var14, var15, var10.field2746, var10.field2675);
                            field875[var10.field2793] = true;
                            class320.method5408(arg2, arg3, arg4, arg5);
                            continue;
                        }
                        if (var10.field2660 == 1338) {
                            method1698(var10, var14, var15, var11);
                            class320.method5408(arg2, arg3, arg4, arg5);
                            continue;
                        }
                        if (var10.field2660 == 1339) {
                            method221(var10, var14, var15, var11);
                            class320.method5408(arg2, arg3, arg4, arg5);
                            continue;
                        }
                        if (var10.field2660 == 1400) {
                            Statics.field2074.method5648(var14, var15, var10.field2746, var10.field2675, field633);
                        }
                        if (var10.field2660 == 1401) {
                            Statics.field2074.method5671(var14, var15, var10.field2746, var10.field2675);
                        }
                    }
                    if (var10.field2658 == 0) {
                        if (!var10.field2655) {
                            boolean var36 = var10.field2676;
                            if (var36 && Statics.field3738 != var10) {
                                continue;
                            }
                        }
                        if (!var10.field2655) {
                            if (var10.field2678 > var10.field2680 - var10.field2675) {
                                var10.field2678 = var10.field2680 - var10.field2675;
                            }
                            if (var10.field2678 < 0) {
                                var10.field2678 = 0;
                            }
                        }
                        method651(arg0, var10.field2656, var21, var22, var23, var24, var14 - var10.field2764, var15 - var10.field2678, var11);
                        if (var10.field2765 != null) {
                            method651(var10.field2765, var10.field2656, var21, var22, var23, var24, var14 - var10.field2764, var15 - var10.field2678, var11);
                        }
                        class57 var37 = (class57) field771.method3759((long) var10.field2656);
                        if (var37 != null) {
                            method1079(var37.field527, var21, var22, var23, var24, var14, var15, var11);
                        }
                        class320.method5408(arg2, arg3, arg4, arg5);
                        class125.method2601();
                    }
                    if (field809 || field818[var11] || field609 > 1) {
                        if (var10.field2658 == 0 && !var10.field2655 && var10.field2680 > var10.field2675) {
                            int var38 = var10.field2746 + var14;
                            int var39 = var10.field2678;
                            int var40 = var10.field2675;
                            int var41 = var10.field2680;
                            Statics.field1012[0].method5435(var38, var15);
                            Statics.field1012[1].method5435(var38, var15 + var40 - 16);
                            class320.method5348(var38, var15 + 16, 16, var40 - 32, field672);
                            int var42 = (var40 - 32) * var40 / var41;
                            if (var42 < 8) {
                                var42 = 8;
                            }
                            int var43 = (var40 - 32 - var42) * var39 / (var41 - var40);
                            class320.method5348(var38, var15 + 16 + var43, 16, var42, field673);
                            class320.method5356(var38, var15 + 16 + var43, var42, field872);
                            class320.method5356(var38 + 1, var15 + 16 + var43, var42, field872);
                            class320.method5364(var38, var15 + 16 + var43, 16, field872);
                            class320.method5364(var38, var15 + 17 + var43, 16, field872);
                            class320.method5356(var38 + 15, var15 + 16 + var43, var42, field662);
                            class320.method5356(var38 + 14, var15 + 17 + var43, var42 - 1, field662);
                            class320.method5364(var38, var15 + 15 + var43 + var42, 16, field662);
                            class320.method5364(var38 + 1, var15 + 14 + var43 + var42, 15, field662);
                        }
                        if (var10.field2658 != 1) {
                            if (var10.field2658 == 2) {
                                int var44 = 0;
                                for (int var45 = 0; var45 < var10.field2760; var45++) {
                                    for (int var46 = 0; var46 < var10.field2667; var46++) {
                                        int var47 = (var10.field2723 + 32) * var46 + var14;
                                        int var48 = (var10.field2649 + 32) * var45 + var15;
                                        if (var44 < 20) {
                                            var47 += var10.field2725[var44];
                                            var48 += var10.field2726[var44];
                                        }
                                        if (var10.field2775[var44] > 0) {
                                            boolean var49 = false;
                                            boolean var50 = false;
                                            int var51 = var10.field2775[var44] - 1;
                                            if (var47 + 32 > arg2 && var47 < arg4 && var48 + 32 > arg3 && var48 < arg5 || Statics.field228 == var10 && field718 == var44) {
                                                class324 var52;
                                                if (field839 == 1 && Statics.field1828 == var44 && Statics.field2416 == var10.field2656) {
                                                    var52 = class272.method63(var51, var10.field2646[var44], 2, 0, 2, false);
                                                } else {
                                                    var52 = class272.method63(var51, var10.field2646[var44], 1, 3153952, 2, false);
                                                }
                                                if (var52 == null) {
                                                    method956(var10);
                                                } else if (Statics.field228 == var10 && field718 == var44) {
                                                    int var53 = class49.field437 - field640;
                                                    int var54 = class49.field439 - field747;
                                                    if (var53 < 5 && var53 > -5) {
                                                        var53 = 0;
                                                    }
                                                    if (var54 < 5 && var54 > -5) {
                                                        var54 = 0;
                                                    }
                                                    if (field723 < 5) {
                                                        var53 = 0;
                                                        var54 = 0;
                                                    }
                                                    var52.method5466(var47 + var53, var48 + var54, 128);
                                                    if (arg1 != -1) {
                                                        class233 var55 = arg0[arg1 & 0xFFFF];
                                                        if (var48 + var54 < class320.field3845 && var55.field2678 > 0) {
                                                            int var56 = field671 * (class320.field3845 - var48 - var54) / 3;
                                                            if (var56 > field671 * 10) {
                                                                var56 = field671 * 10;
                                                            }
                                                            if (var56 > var55.field2678) {
                                                                var56 = var55.field2678;
                                                            }
                                                            var55.field2678 -= var56;
                                                            field747 += var56;
                                                            method956(var55);
                                                        }
                                                        if (var48 + var54 + 32 > class320.field3851 && var55.field2678 < var55.field2680 - var55.field2675) {
                                                            int var57 = field671 * (var48 + var54 + 32 - class320.field3851) / 3;
                                                            if (var57 > field671 * 10) {
                                                                var57 = field671 * 10;
                                                            }
                                                            if (var57 > var55.field2680 - var55.field2675 - var55.field2678) {
                                                                var57 = var55.field2680 - var55.field2675 - var55.field2678;
                                                            }
                                                            var55.field2678 += var57;
                                                            field747 -= var57;
                                                            method956(var55);
                                                        }
                                                    }
                                                } else if (Statics.field1392 == var10 && field717 == var44) {
                                                    var52.method5466(var47, var48, 128);
                                                } else {
                                                    var52.method5460(var47, var48);
                                                }
                                            }
                                        } else if (var10.field2727 != null && var44 < 20) {
                                            class324 var58 = var10.method4218(var44);
                                            if (var58 != null) {
                                                var58.method5460(var47, var48);
                                            } else if (class233.field2654) {
                                                method956(var10);
                                            }
                                        }
                                        var44++;
                                    }
                                }
                            } else if (var10.field2658 == 3) {
                                int var59;
                                if (method1064(var10)) {
                                    var59 = var10.field2682;
                                    if (Statics.field3738 == var10 && var10.field2684 != 0) {
                                        var59 = var10.field2684;
                                    }
                                } else {
                                    var59 = var10.field2681;
                                    if (Statics.field3738 == var10 && var10.field2679 != 0) {
                                        var59 = var10.field2679;
                                    }
                                }
                                if (var10.field2685) {
                                    switch(var10.field2686.field3857) {
                                        case 1:
                                            class320.method5357(var14, var15, var10.field2746, var10.field2675, var10.field2681, var10.field2682);
                                            break;
                                        case 2:
                                            class320.method5350(var14, var15, var10.field2746, var10.field2675, var10.field2681, var10.field2682, 255 - (var10.field2687 & 0xFF), 255 - (var10.field2688 & 0xFF));
                                            break;
                                        default:
                                            if (var16 == 0) {
                                                class320.method5348(var14, var15, var10.field2746, var10.field2675, var59);
                                            } else {
                                                class320.method5339(var14, var15, var10.field2746, var10.field2675, var59, 256 - (var16 & 0xFF));
                                            }
                                    }
                                } else if (var16 == 0) {
                                    class320.method5352(var14, var15, var10.field2746, var10.field2675, var59);
                                } else {
                                    class320.method5402(var14, var15, var10.field2746, var10.field2675, var59, 256 - (var16 & 0xFF));
                                }
                            } else if (var10.field2658 == 4) {
                                class301 var60 = var10.method4174();
                                if (var60 != null) {
                                    String var61 = var10.field2717;
                                    int var62;
                                    if (method1064(var10)) {
                                        var62 = var10.field2682;
                                        if (Statics.field3738 == var10 && var10.field2684 != 0) {
                                            var62 = var10.field2684;
                                        }
                                        if (var10.field2718.length() > 0) {
                                            var61 = var10.field2718;
                                        }
                                    } else {
                                        var62 = var10.field2681;
                                        if (Statics.field3738 == var10 && var10.field2679 != 0) {
                                            var62 = var10.field2679;
                                        }
                                    }
                                    if (var10.field2655 && var10.field2783 != -1) {
                                        class272 var63 = class272.method2892(var10.field2783);
                                        var61 = var63.field3492;
                                        if (var61 == null) {
                                            var61 = class240.field2850;
                                        }
                                        if ((var63.field3503 == 1 || var10.field2661 != 1) && var10.field2661 != -1) {
                                            var61 = class76.method4105(16748608) + var61 + class76.field1094 + " " + 'x' + Statics.method2949(var10.field2661);
                                        }
                                    }
                                    if (field710 == var10) {
                                        var61 = class240.field3004;
                                        var62 = var10.field2681;
                                    }
                                    if (!var10.field2655) {
                                        var61 = method61(var61, var10);
                                    }
                                    var60.method5127(var61, var14, var15, var10.field2746, var10.field2675, var62, var10.field2722 ? 0 : -1, var10.field2720, var10.field2683, var10.field2719);
                                } else if (class233.field2654) {
                                    method956(var10);
                                }
                            } else if (var10.field2658 == 5) {
                                if (var10.field2655) {
                                    class324 var65;
                                    if (var10.field2783 == -1) {
                                        var65 = var10.method4180(false);
                                    } else {
                                        var65 = class272.method63(var10.field2783, var10.field2661, var10.field2695, var10.field2696, var10.field2751, false);
                                    }
                                    if (var65 != null) {
                                        int var66 = var65.field3875;
                                        int var67 = var65.field3876;
                                        if (var10.field2741) {
                                            class320.method5341(var14, var15, var10.field2746 + var14, var10.field2675 + var15);
                                            int var68 = (var10.field2746 + (var66 - 1)) / var66;
                                            int var69 = (var10.field2675 + (var67 - 1)) / var67;
                                            for (int var70 = 0; var70 < var68; var70++) {
                                                for (int var71 = 0; var71 < var69; var71++) {
                                                    if (var10.field2693 != 0) {
                                                        var65.method5479(var66 / 2 + var66 * var70 + var14, var67 / 2 + var67 * var71 + var15, var10.field2693, 4096);
                                                    } else if (var16 == 0) {
                                                        var65.method5460(var66 * var70 + var14, var67 * var71 + var15);
                                                    } else {
                                                        var65.method5466(var66 * var70 + var14, var67 * var71 + var15, 256 - (var16 & 0xFF));
                                                    }
                                                }
                                            }
                                            class320.method5408(arg2, arg3, arg4, arg5);
                                        } else {
                                            int var72 = var10.field2746 * 4096 / var66;
                                            if (var10.field2693 != 0) {
                                                var65.method5479(var10.field2746 / 2 + var14, var10.field2675 / 2 + var15, var10.field2693, var72);
                                            } else if (var16 != 0) {
                                                var65.method5483(var14, var15, var10.field2746, var10.field2675, 256 - (var16 & 0xFF));
                                            } else if (var10.field2746 == var66 && var10.field2675 == var67) {
                                                var65.method5460(var14, var15);
                                            } else {
                                                var65.method5462(var14, var15, var10.field2746, var10.field2675);
                                            }
                                        }
                                    } else if (class233.field2654) {
                                        method956(var10);
                                    }
                                } else {
                                    class324 var64 = var10.method4180(method1064(var10));
                                    if (var64 != null) {
                                        var64.method5460(var14, var15);
                                    } else if (class233.field2654) {
                                        method956(var10);
                                    }
                                }
                            } else if (var10.field2658 == 6) {
                                boolean var73 = method1064(var10);
                                int var74;
                                if (var73) {
                                    var74 = var10.field2704;
                                } else {
                                    var74 = var10.field2703;
                                }
                                class122 var75 = null;
                                int var76 = 0;
                                if (var10.field2783 != -1) {
                                    class272 var77 = class272.method2892(var10.field2783);
                                    if (var77 != null) {
                                        class272 var78 = var77.method4731(var10.field2661);
                                        var75 = var78.method4730(1);
                                        if (var75 == null) {
                                            method956(var10);
                                        } else {
                                            var75.method2534();
                                            var76 = var75.field1829 / 2;
                                        }
                                    }
                                } else if (var10.field2710 == 5) {
                                    if (var10.field2700 == 0) {
                                        var75 = field851.method4138((class276) null, -1, (class276) null, -1);
                                    } else {
                                        var75 = Statics.field502.method1038();
                                    }
                                } else if (var74 == -1) {
                                    var75 = var10.method4183((class276) null, -1, var73, Statics.field502.field582);
                                    if (var75 == null && class233.field2654) {
                                        method956(var10);
                                    }
                                } else {
                                    class276 var79 = class276.method2865(var74);
                                    var75 = var10.method4183(var79, var10.field2677, var73, Statics.field502.field582);
                                    if (var75 == null && class233.field2654) {
                                        method956(var10);
                                    }
                                }
                                class125.method2604(var10.field2746 / 2 + var14, var10.field2675 / 2 + var15);
                                int var80 = var10.field2689 * class125.field1742[var10.field2733] >> 16;
                                int var81 = var10.field2689 * class125.field1743[var10.field2733] >> 16;
                                if (var75 != null) {
                                    if (var10.field2655) {
                                        var75.method2534();
                                        if (var10.field2713) {
                                            var75.method2560(0, var10.field2708, var10.field2755, var10.field2733, var10.field2705, var10.field2706 + var76 + var80, var10.field2706 + var81, var10.field2689);
                                        } else {
                                            var75.method2503(0, var10.field2708, var10.field2755, var10.field2733, var10.field2705, var10.field2706 + var76 + var80, var10.field2706 + var81);
                                        }
                                    } else {
                                        var75.method2503(0, var10.field2708, 0, var10.field2733, 0, var80, var81);
                                    }
                                }
                                class125.method2676();
                            } else {
                                if (var10.field2658 == 7) {
                                    class301 var82 = var10.method4174();
                                    if (var82 == null) {
                                        if (class233.field2654) {
                                            method956(var10);
                                        }
                                        continue;
                                    }
                                    int var83 = 0;
                                    for (int var84 = 0; var84 < var10.field2760; var84++) {
                                        for (int var85 = 0; var85 < var10.field2667; var85++) {
                                            if (var10.field2775[var83] > 0) {
                                                class272 var86 = class272.method2892(var10.field2775[var83] - 1);
                                                String var87;
                                                if (var86.field3503 != 1 && var10.field2646[var83] == 1) {
                                                    var87 = class76.method4105(16748608) + var86.field3492 + class76.field1094;
                                                } else {
                                                    var87 = class76.method4105(16748608) + var86.field3492 + class76.field1094 + " " + 'x' + Statics.method2949(var10.field2646[var83]);
                                                }
                                                int var88 = (var10.field2723 + 115) * var85 + var14;
                                                int var89 = (var10.field2649 + 12) * var84 + var15;
                                                if (var10.field2720 == 0) {
                                                    var82.method5134(var87, var88, var89, var10.field2681, var10.field2722 ? 0 : -1);
                                                } else if (var10.field2720 == 1) {
                                                    var82.method5130(var87, var10.field2746 / 2 + var88, var89, var10.field2681, var10.field2722 ? 0 : -1);
                                                } else {
                                                    var82.method5129(var87, var10.field2746 + var88 - 1, var89, var10.field2681, var10.field2722 ? 0 : -1);
                                                }
                                            }
                                            var83++;
                                        }
                                    }
                                }
                                if (var10.field2658 == 8 && Statics.field997 == var10 && field763 == field762) {
                                    int var90 = 0;
                                    int var91 = 0;
                                    class301 var92 = Statics.field1941;
                                    String var93 = var10.field2717;
                                    String var94 = method61(var93, var10);
                                    while (var94.length() > 0) {
                                        int var95 = var94.indexOf(class76.field1093);
                                        String var96;
                                        if (var95 == -1) {
                                            var96 = var94;
                                            var94 = "";
                                        } else {
                                            var96 = var94.substring(0, var95);
                                            var94 = var94.substring(var95 + 4);
                                        }
                                        int var97 = var92.method5122(var96);
                                        if (var97 > var90) {
                                            var90 = var97;
                                        }
                                        var91 += var92.field3756 + 1;
                                    }
                                    var90 += 6;
                                    var91 += 7;
                                    int var98 = var10.field2746 + var14 - 5 - var90;
                                    int var99 = var10.field2675 + var15 + 5;
                                    if (var98 < var14 + 5) {
                                        var98 = var14 + 5;
                                    }
                                    if (var90 + var98 > arg4) {
                                        var98 = arg4 - var90;
                                    }
                                    if (var91 + var99 > arg5) {
                                        var99 = arg5 - var91;
                                    }
                                    class320.method5348(var98, var99, var90, var91, 16777120);
                                    class320.method5352(var98, var99, var90, var91, 0);
                                    String var100 = var10.field2717;
                                    int var101 = var92.field3756 + var99 + 2;
                                    String var102 = method61(var100, var10);
                                    while (var102.length() > 0) {
                                        int var103 = var102.indexOf(class76.field1093);
                                        String var104;
                                        if (var103 == -1) {
                                            var104 = var102;
                                            var102 = "";
                                        } else {
                                            var104 = var102.substring(0, var103);
                                            var102 = var102.substring(var103 + 4);
                                        }
                                        var92.method5134(var104, var98 + 3, var101, 0, -1);
                                        var101 += var92.field3756 + 1;
                                    }
                                }
                                if (var10.field2658 == 9) {
                                    int var105;
                                    int var106;
                                    int var107;
                                    int var108;
                                    if (var10.field2690) {
                                        var105 = var14;
                                        var106 = var10.field2675 + var15;
                                        var107 = var10.field2746 + var14;
                                        var108 = var15;
                                    } else {
                                        var105 = var14;
                                        var106 = var15;
                                        var107 = var10.field2746 + var14;
                                        var108 = var10.field2675 + var15;
                                    }
                                    if (var10.field2699 == 1) {
                                        class320.method5337(var105, var106, var107, var108, var10.field2681);
                                    } else {
                                        method146(var105, var106, var107, var108, var10.field2681, var10.field2699);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("m.ih(IIIIIIB)V")
    public static final void method146(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class320.field3850;
        int var18 = arg1 - class320.field3845;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class125.method2609(var19, var20, var21);
        class125.method2612(var23, var24, var25, var19, var20, var21, arg4);
        class125.method2609(var19, var21, var22);
        class125.method2612(var23, var25, var26, var19, var21, var22, arg4);
    }

    @ObfuscatedName("l.ie(Ljava/lang/String;Lhk;B)Ljava/lang/String;")
    public static String method61(String arg0, class233 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = Statics.method104(arg1, var2 - 1);
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

    @ObfuscatedName("client.is(ZI)V")
    public final void method1085(boolean arg0) {
        int var2 = field816;
        int var3 = Statics.field2097;
        int var4 = Statics.field3800;
        if (class233.method627(var2)) {
            method196(Statics.field2763[var2], -1, var3, var4, arg0);
        }
    }

    @ObfuscatedName("client.ip(Lhk;I)V")
    public void method1241(class233 arg0) {
        class233 var2 = arg0.field2672 == -1 ? null : class233.method130(arg0.field2672);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field2097;
            var4 = Statics.field3800;
        } else {
            var3 = var2.field2746;
            var4 = var2.field2675;
        }
        method958(arg0, var3, var4, false);
        Statics.method26(arg0, var3, var4);
    }

    @ObfuscatedName("l.iz([Lhk;Lhk;ZB)V")
    public static void method62(class233[] arg0, class233 arg1, boolean arg2) {
        int var3 = arg1.field2715 == 0 ? arg1.field2746 : arg1.field2715;
        int var4 = arg1.field2680 == 0 ? arg1.field2675 : arg1.field2680;
        method196(arg0, arg1.field2656, var3, var4, arg2);
        if (arg1.field2765 != null) {
            method196(arg1.field2765, arg1.field2656, var3, var4, arg2);
        }
        class57 var5 = (class57) field771.method3759((long) arg1.field2656);
        if (var5 != null) {
            int var6 = var5.field527;
            if (class233.method627(var6)) {
                method196(Statics.field2763[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2660 == 1337) {
        }
    }

    @ObfuscatedName("u.it([Lhk;IIIZI)V")
    public static void method196(class233[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class233 var6 = arg0[var5];
            if (var6 != null && var6.field2672 == arg1) {
                method958(var6, arg2, arg3, arg4);
                Statics.method26(var6, arg2, arg3);
                if (var6.field2764 > var6.field2715 - var6.field2746) {
                    var6.field2764 = var6.field2715 - var6.field2746;
                }
                if (var6.field2764 < 0) {
                    var6.field2764 = 0;
                }
                if (var6.field2678 > var6.field2680 - var6.field2675) {
                    var6.field2678 = var6.field2680 - var6.field2675;
                }
                if (var6.field2678 < 0) {
                    var6.field2678 = 0;
                }
                if (var6.field2658 == 0) {
                    method62(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("bw.ib(Lhk;IIZI)V")
    public static void method958(class233 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2746;
        int var5 = arg0.field2675;
        if (arg0.field2663 == 0) {
            arg0.field2746 = arg0.field2667;
        } else if (arg0.field2663 == 1) {
            arg0.field2746 = arg1 - arg0.field2667;
        } else if (arg0.field2663 == 2) {
            arg0.field2746 = arg0.field2667 * arg1 >> 14;
        }
        if (arg0.field2670 == 0) {
            arg0.field2675 = arg0.field2760;
        } else if (arg0.field2670 == 1) {
            arg0.field2675 = arg2 - arg0.field2760;
        } else if (arg0.field2670 == 2) {
            arg0.field2675 = arg0.field2760 * arg2 >> 14;
        }
        if (arg0.field2663 == 4) {
            arg0.field2746 = arg0.field2675 * arg0.field2671 / arg0.field2674;
        }
        if (arg0.field2670 == 4) {
            arg0.field2675 = arg0.field2746 * arg0.field2674 / arg0.field2671;
        }
        if (arg0.field2660 == 1337) {
            field783 = arg0;
        }
        if (arg3 && arg0.field2771 != null && (arg0.field2746 != var4 || arg0.field2675 != var5)) {
            class58 var6 = new class58();
            var6.field531 = arg0;
            var6.field545 = arg0.field2771;
            field770.method3831(var6);
        }
    }

    @ObfuscatedName("bo.ic(Lhk;I)Z")
    public static final boolean method1064(class233 arg0) {
        if (arg0.field2707 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2707.length; var1++) {
            int var2 = Statics.method104(arg0, var1);
            int var3 = arg0.field2702[var1];
            if (arg0.field2707[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2707[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2707[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("g.io(Lhk;Ljn;IIZI)V")
    public static final void method114(class233 arg0, class272 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field3507;
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
            var7 = class240.field2852;
        }
        if (var6 != -1 && var7 != null) {
            method948(var7, class76.method4105(16748608) + arg1.field3492, var6, arg1.field3490, arg2, arg0.field2656, arg4);
        }
    }

    @ObfuscatedName("bm.jr(Lhk;III)V")
    public static final void method950(class233 arg0, int arg1, int arg2) {
        if (arg0.field2659 == 1) {
            method603(arg0.field2779, "", 24, 0, 0, arg0.field2656);
        }
        if (arg0.field2659 == 2 && !field766) {
            String var3 = method1001(arg0);
            if (var3 != null) {
                method603(var3, class76.method4105(65280) + arg0.field2778, 25, 0, -1, arg0.field2656);
            }
        }
        if (arg0.field2659 == 3) {
            method603(class240.field3005, "", 26, 0, 0, arg0.field2656);
        }
        if (arg0.field2659 == 4) {
            method603(arg0.field2779, "", 28, 0, 0, arg0.field2656);
        }
        if (arg0.field2659 == 5) {
            method603(arg0.field2779, "", 29, 0, 0, arg0.field2656);
        }
        if (arg0.field2659 == 6 && field710 == null) {
            method603(arg0.field2779, "", 30, 0, -1, arg0.field2656);
        }
        if (arg0.field2658 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2675; var5++) {
                for (int var6 = 0; var6 < arg0.field2746; var6++) {
                    int var7 = (arg0.field2723 + 32) * var6;
                    int var8 = (arg0.field2649 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2725[var4];
                        var8 += arg0.field2726[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field789 = var4;
                        Statics.field230 = arg0;
                        if (arg0.field2775[var4] > 0) {
                            label265: {
                                class272 var9 = class272.method2892(arg0.field2775[var4] - 1);
                                if (field839 == 1) {
                                    int var10 = method2323(arg0);
                                    boolean var11 = (var10 >> 30 & 0x1) != 0;
                                    if (var11) {
                                        if (Statics.field2416 != arg0.field2656 || Statics.field1828 != var4) {
                                            method603(class240.field2996, field765 + " " + class76.field1086 + " " + class76.method4105(16748608) + var9.field3492, 31, var9.field3490, var4, arg0.field2656);
                                        }
                                        break label265;
                                    }
                                }
                                if (field766) {
                                    int var12 = method2323(arg0);
                                    boolean var13 = (var12 >> 30 & 0x1) != 0;
                                    if (var13) {
                                        if ((Statics.field490 & 0x10) == 16) {
                                            method603(field799, field721 + " " + class76.field1086 + " " + class76.method4105(16748608) + var9.field3492, 32, var9.field3490, var4, arg0.field2656);
                                        }
                                        break label265;
                                    }
                                }
                                String[] var14 = var9.field3507;
                                int var15 = -1;
                                if (field759 && Statics.method141()) {
                                    var15 = var9.method4742();
                                }
                                int var16 = method2323(arg0);
                                boolean var17 = (var16 >> 30 & 0x1) != 0;
                                if (var17) {
                                    for (int var18 = 4; var18 >= 3; var18--) {
                                        if (var15 != var18) {
                                            method114(arg0, var9, var4, var18, false);
                                        }
                                    }
                                }
                                int var19 = method2323(arg0);
                                boolean var20 = (var19 >> 31 & 0x1) != 0;
                                if (var20) {
                                    method603(class240.field2996, class76.method4105(16748608) + var9.field3492, 38, var9.field3490, var4, arg0.field2656);
                                }
                                int var21 = method2323(arg0);
                                boolean var22 = (var21 >> 30 & 0x1) != 0;
                                if (var22) {
                                    for (int var23 = 2; var23 >= 0; var23--) {
                                        if (var15 != var23) {
                                            method114(arg0, var9, var4, var23, false);
                                        }
                                    }
                                    if (var15 >= 0) {
                                        method114(arg0, var9, var4, var15, true);
                                    }
                                }
                                String[] var24 = arg0.field2785;
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
                                            method603(var24[var25], class76.method4105(16748608) + var9.field3492, var26, var9.field3490, var4, arg0.field2656);
                                        }
                                    }
                                }
                                method603(class240.field2997, class76.method4105(16748608) + var9.field3492, 1005, var9.field3490, var4, arg0.field2656);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2655) {
            return;
        }
        if (!field766) {
            for (int var27 = 9; var27 >= 5; var27--) {
                String var28 = method1077(arg0, var27);
                if (var28 != null) {
                    method603(var28, arg0.field2735, 1007, var27 + 1, arg0.field2657, arg0.field2656);
                }
            }
            String var29 = method1001(arg0);
            if (var29 != null) {
                method603(var29, arg0.field2735, 25, 0, arg0.field2657, arg0.field2656);
            }
            for (int var30 = 4; var30 >= 0; var30--) {
                String var31 = method1077(arg0, var30);
                if (var31 != null) {
                    method603(var31, arg0.field2735, 57, var30 + 1, arg0.field2657, arg0.field2656);
                }
            }
            int var32 = method2323(arg0);
            boolean var33 = (var32 & 0x1) != 0;
            if (var33) {
                method603(class240.field2915, "", 30, 0, arg0.field2657, arg0.field2656);
            }
        } else if (class234.method1789(method2323(arg0)) && (Statics.field490 & 0x20) == 32) {
            method603(field799, field721 + " " + class76.field1086 + " " + arg0.field2735, 58, 0, arg0.field2657, arg0.field2656);
        }
    }

    @ObfuscatedName("bu.jz(ZI)V")
    public static void method1012(boolean arg0) {
        field758 = arg0;
    }

    @ObfuscatedName("az.ja(B)Z")
    public static boolean method925() {
        return field758;
    }

    @ObfuscatedName("t.jb([Lhk;IIIIIIIB)V")
    public static final void method220(class233[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class233 var9 = arg0[var8];
            if (var9 != null && var9.field2672 == arg1 && (!var9.field2655 || var9.field2658 == 0 || var9.field2729 || method2323(var9) != 0 || field777 == var9 || var9.field2660 == 1338)) {
                if (var9.field2655) {
                    boolean var10 = var9.field2676;
                    if (var10) {
                        continue;
                    }
                } else if (var9.field2658 == 0 && Statics.field3738 != var9) {
                    boolean var11 = var9.field2676;
                    if (var11) {
                        continue;
                    }
                }
                int var12 = var9.field2669 + arg6;
                int var13 = var9.field2742 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var9.field2658 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else if (var9.field2658 == 9) {
                    int var18 = var12;
                    int var19 = var13;
                    int var20 = var9.field2746 + var12;
                    int var21 = var9.field2675 + var13;
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
                    int var24 = var9.field2746 + var12;
                    int var25 = var9.field2675 + var13;
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var24 < arg4 ? var24 : arg4;
                    var17 = var25 < arg5 ? var25 : arg5;
                }
                if (field784 == var9) {
                    field693 = true;
                    field793 = var12;
                    field794 = var13;
                }
                boolean var26 = false;
                if (var9.field2730) {
                    switch(field772) {
                        case 0:
                            var26 = true;
                        case 1:
                        default:
                            break;
                        case 2:
                            if (var9.field2656 >>> 16 == field774) {
                                var26 = true;
                            }
                            break;
                        case 3:
                            if (field774 == var9.field2656) {
                                var26 = true;
                            }
                    }
                }
                if (var26 || !var9.field2655 || var14 < var16 && var15 < var17) {
                    if (var9.field2655) {
                        if (var9.field2769) {
                            if (class49.field437 >= var14 && class49.field439 >= var15 && class49.field437 < var16 && class49.field439 < var17) {
                                for (class58 var27 = (class58) field770.method3823(); var27 != null; var27 = (class58) field770.method3822()) {
                                    if (var27.field530) {
                                        var27.method3812();
                                        var27.field531.field2787 = false;
                                    }
                                }
                                if (Statics.field3713 == 0) {
                                    field784 = null;
                                    field777 = null;
                                }
                                if (!field692) {
                                    field748 = 0;
                                    field692 = false;
                                    field730[0] = class240.field3121;
                                    field754[0] = "";
                                    field870[0] = 1006;
                                    field613[0] = false;
                                    field748 = 1;
                                }
                            }
                        } else if (var9.field2797 && class49.field437 >= var14 && class49.field439 >= var15 && class49.field437 < var16 && class49.field439 < var17) {
                            for (class58 var28 = (class58) field770.method3823(); var28 != null; var28 = (class58) field770.method3822()) {
                                if (var28.field530 && var28.field531.field2731 == var28.field545) {
                                    var28.method3812();
                                }
                            }
                        }
                    }
                    int var29 = class49.field437;
                    int var30 = class49.field439;
                    if (class49.field426 != 0) {
                        var29 = class49.field443;
                        var30 = class49.field444;
                    }
                    boolean var31 = var29 >= var14 && var30 >= var15 && var29 < var16 && var30 < var17;
                    if (var9.field2660 == 1337) {
                        if (!field620 && !field692 && var31) {
                            if (field839 == 0 && !field766) {
                                method603(class240.field2875, "", 23, 0, var29 - var14, var30 - var15);
                            }
                            long var32 = -1L;
                            long var34 = -1L;
                            int var36 = 0;
                            while (true) {
                                int var38 = class123.field1710;
                                if (var36 >= var38) {
                                    if (var32 != -1L) {
                                        int var39 = class123.method106(var32);
                                        int var40 = class123.method3222(var32);
                                        class62 var41 = field727[field738];
                                        method3903(var41, field738, var39, var40);
                                    }
                                    break;
                                }
                                long var42 = class123.method1710(var36);
                                if (var34 != var42) {
                                    label1193: {
                                        var34 = var42;
                                        int var44 = class123.method1078(var36);
                                        int var45 = class123.method3222(class123.field1694[var36]);
                                        int var46 = var45;
                                        int var47 = Statics.method3164(var36);
                                        int var48 = class123.method1727(var36);
                                        if (var47 == 2 && Statics.field186.method2711(Statics.field517, var44, var45, var42) >= 0) {
                                            class271 var49 = class271.method1706(var48);
                                            if (var49.field3472 != null) {
                                                var49 = var49.method4682();
                                            }
                                            if (var49 == null) {
                                                break label1193;
                                            }
                                            if (field839 == 1) {
                                                method603(class240.field2996, field765 + " " + class76.field1086 + " " + class76.method4105(65535) + var49.field3466, 1, var48, var44, var45);
                                            } else if (!field766) {
                                                String[] var50 = var49.field3458;
                                                if (var50 != null) {
                                                    for (int var51 = 4; var51 >= 0; var51--) {
                                                        if (var50[var51] != null) {
                                                            short var52 = 0;
                                                            if (var51 == 0) {
                                                                var52 = 3;
                                                            }
                                                            if (var51 == 1) {
                                                                var52 = 4;
                                                            }
                                                            if (var51 == 2) {
                                                                var52 = 5;
                                                            }
                                                            if (var51 == 3) {
                                                                var52 = 6;
                                                            }
                                                            if (var51 == 4) {
                                                                var52 = 1001;
                                                            }
                                                            method603(var50[var51], class76.method4105(65535) + var49.field3466, var52, var48, var44, var46);
                                                        }
                                                    }
                                                }
                                                method603(class240.field2997, class76.method4105(65535) + var49.field3466, 1002, var49.field3474, var44, var46);
                                            } else if ((Statics.field490 & 0x4) == 4) {
                                                method603(field799, field721 + " " + class76.field1086 + " " + class76.method4105(65535) + var49.field3466, 2, var48, var44, var45);
                                            }
                                        }
                                        if (var47 == 1) {
                                            class74 var53 = field651[var48];
                                            if (var53 == null) {
                                                break label1193;
                                            }
                                            if (var53.field1071.field3548 == 1 && (var53.field953 & 0x7F) == 64 && (var53.field919 & 0x7F) == 64) {
                                                for (int var54 = 0; var54 < field652; var54++) {
                                                    class74 var55 = field651[field868[var54]];
                                                    if (var55 != null && var53 != var55 && var55.field1071.field3548 == 1 && var53.field953 == var55.field953 && var53.field919 == var55.field919) {
                                                        method1065(var55.field1071, field868[var54], var44, var46);
                                                    }
                                                }
                                                int var56 = class84.field1204;
                                                int[] var57 = class84.field1209;
                                                for (int var58 = 0; var58 < var56; var58++) {
                                                    class62 var59 = field727[var57[var58]];
                                                    if (var59 != null && var53.field953 == var59.field953 && var53.field919 == var59.field919) {
                                                        method3903(var59, var57[var58], var44, var46);
                                                    }
                                                }
                                            }
                                            method1065(var53.field1071, var48, var44, var46);
                                        }
                                        if (var47 == 0) {
                                            class62 var60 = field727[var48];
                                            if (var60 == null) {
                                                break label1193;
                                            }
                                            if ((var60.field953 & 0x7F) == 64 && (var60.field919 & 0x7F) == 64) {
                                                for (int var61 = 0; var61 < field652; var61++) {
                                                    class74 var62 = field651[field868[var61]];
                                                    if (var62 != null && var62.field1071.field3548 == 1 && var60.field953 == var62.field953 && var60.field919 == var62.field919) {
                                                        method1065(var62.field1071, field868[var61], var44, var46);
                                                    }
                                                }
                                                int var63 = class84.field1204;
                                                int[] var64 = class84.field1209;
                                                for (int var65 = 0; var65 < var63; var65++) {
                                                    class62 var66 = field727[var64[var65]];
                                                    if (var66 != null && var60 != var66 && var60.field953 == var66.field953 && var60.field919 == var66.field919) {
                                                        method3903(var66, var64[var65], var44, var46);
                                                    }
                                                }
                                            }
                                            if (field738 == var48) {
                                                var32 = var42;
                                            } else {
                                                method3903(var60, var48, var44, var46);
                                            }
                                        }
                                        if (var47 == 3) {
                                            class208 var67 = field739[Statics.field517][var44][var46];
                                            if (var67 != null) {
                                                for (class82 var68 = (class82) var67.method3821(); var68 != null; var68 = (class82) var67.method3813()) {
                                                    class272 var69 = class272.method2892(var68.field1191);
                                                    if (field839 == 1) {
                                                        method603(class240.field2996, field765 + " " + class76.field1086 + " " + class76.method4105(16748608) + var69.field3492, 16, var68.field1191, var44, var46);
                                                    } else if (!field766) {
                                                        String[] var70 = var69.field3506;
                                                        for (int var71 = 4; var71 >= 0; var71--) {
                                                            if (var70 != null && var70[var71] != null) {
                                                                byte var72 = 0;
                                                                if (var71 == 0) {
                                                                    var72 = 18;
                                                                }
                                                                if (var71 == 1) {
                                                                    var72 = 19;
                                                                }
                                                                if (var71 == 2) {
                                                                    var72 = 20;
                                                                }
                                                                if (var71 == 3) {
                                                                    var72 = 21;
                                                                }
                                                                if (var71 == 4) {
                                                                    var72 = 22;
                                                                }
                                                                method603(var70[var71], class76.method4105(16748608) + var69.field3492, var72, var68.field1191, var44, var46);
                                                            } else if (var71 == 2) {
                                                                method603(class240.field2913, class76.method4105(16748608) + var69.field3492, 20, var68.field1191, var44, var46);
                                                            }
                                                        }
                                                        method603(class240.field2997, class76.method4105(16748608) + var69.field3492, 1004, var68.field1191, var44, var46);
                                                    } else if ((Statics.field490 & 0x1) == 1) {
                                                        method603(field799, field721 + " " + class76.field1086 + " " + class76.method4105(16748608) + var69.field3492, 17, var68.field1191, var44, var46);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                var36++;
                            }
                        }
                    } else if (var9.field2660 != 1338) {
                        if (var9.field2660 == 1400) {
                            Statics.field2074.method5690(class49.field437, class49.field439, var31, var12, var13, var9.field2746, var9.field2675);
                        }
                        if (!field692 && var31) {
                            if (var9.field2660 == 1400) {
                                Statics.field2074.method5683(var12, var13, var9.field2746, var9.field2675, var29, var30);
                            } else {
                                method950(var9, var29 - var12, var30 - var13);
                            }
                        }
                        if (var26) {
                            for (int var86 = 0; var86 < var9.field2790.length; var86++) {
                                boolean var87 = false;
                                boolean var88 = false;
                                if (!var87 && var9.field2790[var86] != null) {
                                    for (int var89 = 0; var89 < var9.field2790[var86].length; var89++) {
                                        boolean var90 = false;
                                        if (var9.field2668 != null) {
                                            var90 = class40.field328[var9.field2790[var86][var89]];
                                        }
                                        byte var91 = var9.field2790[var86][var89];
                                        int var92 = 0;
                                        boolean var93;
                                        while (true) {
                                            if (var92 >= field841) {
                                                var93 = false;
                                                break;
                                            }
                                            if (field823[var92] == var91) {
                                                var93 = true;
                                                break;
                                            }
                                            var92++;
                                        }
                                        if (var93 || var90) {
                                            var87 = true;
                                            if (var9.field2668 != null && var9.field2668[var86] > field633) {
                                                break;
                                            }
                                            byte var94 = var9.field2698[var86][var89];
                                            if (var94 == 0 || ((var94 & 0x8) == 0 || !class40.field328[86] && !class40.field328[82] && !class40.field328[81]) && ((var94 & 0x2) == 0 || class40.field328[86]) && ((var94 & 0x1) == 0 || class40.field328[82]) && ((var94 & 0x4) == 0 || class40.field328[81])) {
                                                var88 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (var88) {
                                    if (var86 < 10) {
                                        method206(var86 + 1, var9.field2656, var9.field2657, var9.field2783, "");
                                    } else if (var86 == 10) {
                                        method3084();
                                        int var95 = var9.field2656;
                                        int var96 = var9.field2657;
                                        int var97 = class234.method4585(method2323(var9));
                                        int var98 = var9.field2783;
                                        class233 var99 = class233.method3146(var95, var96);
                                        if (var99 != null && var99.field2753 != null) {
                                            class58 var100 = new class58();
                                            var100.field531 = var99;
                                            var100.field545 = var99.field2753;
                                            class71.method1800(var100);
                                        }
                                        field768 = var98;
                                        field766 = true;
                                        Statics.field1903 = var95;
                                        field678 = var96;
                                        Statics.field490 = var97;
                                        method956(var99);
                                        field799 = method1001(var9);
                                        if (field799 == null) {
                                            field799 = class240.field2850;
                                        }
                                        field721 = var9.field2735 + class76.method4105(16777215);
                                    }
                                    int var101 = var9.field2714[var86];
                                    if (var9.field2668 == null) {
                                        var9.field2668 = new int[var9.field2790.length];
                                    }
                                    if (var9.field2776 == null) {
                                        var9.field2776 = new int[var9.field2790.length];
                                    }
                                    if (var101 == 0) {
                                        var9.field2668[var86] = Integer.MAX_VALUE;
                                    } else if (var9.field2668[var86] == 0) {
                                        var9.field2668[var86] = field633 + var101 + var9.field2776[var86];
                                    } else {
                                        var9.field2668[var86] = field633 + var101;
                                    }
                                }
                                if (!var87 && var9.field2668 != null) {
                                    var9.field2668[var86] = 0;
                                }
                            }
                        }
                        if (var9.field2655) {
                            boolean var102;
                            if (class49.field437 >= var14 && class49.field439 >= var15 && class49.field437 < var16 && class49.field439 < var17) {
                                var102 = true;
                            } else {
                                var102 = false;
                            }
                            boolean var103 = false;
                            if ((class49.field434 == 1 || !Statics.field1754 && class49.field434 == 4) && var102) {
                                var103 = true;
                            }
                            boolean var104 = false;
                            if ((class49.field426 == 1 || !Statics.field1754 && class49.field426 == 4) && class49.field443 >= var14 && class49.field444 >= var15 && class49.field443 < var16 && class49.field444 < var17) {
                                var104 = true;
                            }
                            if (var104) {
                                method3217(var9, class49.field443 - var12, class49.field444 - var13);
                            }
                            if (var9.field2660 == 1400) {
                                Statics.field2074.method5632(var29, var30, var102 & var103, var102 & var104);
                            }
                            if (field784 != null && field784 != var9 && var102) {
                                int var105 = method2323(var9);
                                boolean var106 = (var105 >> 20 & 0x1) != 0;
                                if (var106) {
                                    field788 = var9;
                                }
                            }
                            if (field777 == var9) {
                                field716 = true;
                                field790 = var12;
                                field791 = var13;
                            }
                            if (var9.field2729) {
                                if (var102 && field634 != 0 && var9.field2731 != null) {
                                    class58 var107 = new class58();
                                    var107.field530 = true;
                                    var107.field531 = var9;
                                    var107.field533 = field634;
                                    var107.field545 = var9.field2731;
                                    field770.method3831(var107);
                                }
                                if (field784 != null || Statics.field228 != null || field692) {
                                    var104 = false;
                                    var103 = false;
                                    var102 = false;
                                }
                                if (!var9.field2788 && var104) {
                                    var9.field2788 = true;
                                    if (var9.field2744 != null) {
                                        class58 var108 = new class58();
                                        var108.field530 = true;
                                        var108.field531 = var9;
                                        var108.field532 = class49.field443 - var12;
                                        var108.field533 = class49.field444 - var13;
                                        var108.field545 = var9.field2744;
                                        field770.method3831(var108);
                                    }
                                }
                                if (var9.field2788 && var103 && var9.field2745 != null) {
                                    class58 var109 = new class58();
                                    var109.field530 = true;
                                    var109.field531 = var9;
                                    var109.field532 = class49.field437 - var12;
                                    var109.field533 = class49.field439 - var13;
                                    var109.field545 = var9.field2745;
                                    field770.method3831(var109);
                                }
                                if (var9.field2788 && !var103) {
                                    var9.field2788 = false;
                                    if (var9.field2728 != null) {
                                        class58 var110 = new class58();
                                        var110.field530 = true;
                                        var110.field531 = var9;
                                        var110.field532 = class49.field437 - var12;
                                        var110.field533 = class49.field439 - var13;
                                        var110.field545 = var9.field2728;
                                        field812.method3831(var110);
                                    }
                                }
                                if (var103 && var9.field2747 != null) {
                                    class58 var111 = new class58();
                                    var111.field530 = true;
                                    var111.field531 = var9;
                                    var111.field532 = class49.field437 - var12;
                                    var111.field533 = class49.field439 - var13;
                                    var111.field545 = var9.field2747;
                                    field770.method3831(var111);
                                }
                                if (!var9.field2787 && var102) {
                                    var9.field2787 = true;
                                    if (var9.field2748 != null) {
                                        class58 var112 = new class58();
                                        var112.field530 = true;
                                        var112.field531 = var9;
                                        var112.field532 = class49.field437 - var12;
                                        var112.field533 = class49.field439 - var13;
                                        var112.field545 = var9.field2748;
                                        field770.method3831(var112);
                                    }
                                }
                                if (var9.field2787 && var102 && var9.field2781 != null) {
                                    class58 var113 = new class58();
                                    var113.field530 = true;
                                    var113.field531 = var9;
                                    var113.field532 = class49.field437 - var12;
                                    var113.field533 = class49.field439 - var13;
                                    var113.field545 = var9.field2781;
                                    field770.method3831(var113);
                                }
                                if (var9.field2787 && !var102) {
                                    var9.field2787 = false;
                                    if (var9.field2750 != null) {
                                        class58 var114 = new class58();
                                        var114.field530 = true;
                                        var114.field531 = var9;
                                        var114.field532 = class49.field437 - var12;
                                        var114.field533 = class49.field439 - var13;
                                        var114.field545 = var9.field2750;
                                        field812.method3831(var114);
                                    }
                                }
                                if (var9.field2761 != null) {
                                    class58 var115 = new class58();
                                    var115.field531 = var9;
                                    var115.field545 = var9.field2761;
                                    field811.method3831(var115);
                                }
                                if (var9.field2673 != null && field757 > var9.field2709) {
                                    if (var9.field2756 == null || field757 - var9.field2709 > 32) {
                                        class58 var120 = new class58();
                                        var120.field531 = var9;
                                        var120.field545 = var9.field2673;
                                        field770.method3831(var120);
                                    } else {
                                        label966: for (int var116 = var9.field2709; var116 < field757; var116++) {
                                            int var117 = field797[var116 & 0x1F];
                                            for (int var118 = 0; var118 < var9.field2756.length; var118++) {
                                                if (var9.field2756[var118] == var117) {
                                                    class58 var119 = new class58();
                                                    var119.field531 = var9;
                                                    var119.field545 = var9.field2673;
                                                    field770.method3831(var119);
                                                    break label966;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2709 = field757;
                                }
                                if (var9.field2757 != null && field800 > var9.field2791) {
                                    if (var9.field2758 == null || field800 - var9.field2791 > 32) {
                                        class58 var125 = new class58();
                                        var125.field531 = var9;
                                        var125.field545 = var9.field2757;
                                        field770.method3831(var125);
                                    } else {
                                        label942: for (int var121 = var9.field2791; var121 < field800; var121++) {
                                            int var122 = field792[var121 & 0x1F];
                                            for (int var123 = 0; var123 < var9.field2758.length; var123++) {
                                                if (var9.field2758[var123] == var122) {
                                                    class58 var124 = new class58();
                                                    var124.field531 = var9;
                                                    var124.field545 = var9.field2757;
                                                    field770.method3831(var124);
                                                    break label942;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2791 = field800;
                                }
                                if (var9.field2759 != null && field802 > var9.field2792) {
                                    if (var9.field2749 == null || field802 - var9.field2792 > 32) {
                                        class58 var130 = new class58();
                                        var130.field531 = var9;
                                        var130.field545 = var9.field2759;
                                        field770.method3831(var130);
                                    } else {
                                        label918: for (int var126 = var9.field2792; var126 < field802; var126++) {
                                            int var127 = field704[var126 & 0x1F];
                                            for (int var128 = 0; var128 < var9.field2749.length; var128++) {
                                                if (var9.field2749[var128] == var127) {
                                                    class58 var129 = new class58();
                                                    var129.field531 = var9;
                                                    var129.field545 = var9.field2759;
                                                    field770.method3831(var129);
                                                    break label918;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2792 = field802;
                                }
                                if (field803 > var9.field2789 && var9.field2694 != null) {
                                    class58 var131 = new class58();
                                    var131.field531 = var9;
                                    var131.field545 = var9.field2694;
                                    field770.method3831(var131);
                                }
                                if (field667 > var9.field2789 && var9.field2782 != null) {
                                    class58 var132 = new class58();
                                    var132.field531 = var9;
                                    var132.field545 = var9.field2782;
                                    field770.method3831(var132);
                                }
                                if (field805 > var9.field2789 && var9.field2767 != null) {
                                    class58 var133 = new class58();
                                    var133.field531 = var9;
                                    var133.field545 = var9.field2767;
                                    field770.method3831(var133);
                                }
                                if (field806 > var9.field2789 && var9.field2772 != null) {
                                    class58 var134 = new class58();
                                    var134.field531 = var9;
                                    var134.field545 = var9.field2772;
                                    field770.method3831(var134);
                                }
                                if (field807 > var9.field2789 && var9.field2773 != null) {
                                    class58 var135 = new class58();
                                    var135.field531 = var9;
                                    var135.field545 = var9.field2773;
                                    field770.method3831(var135);
                                }
                                if (field848 > var9.field2789 && var9.field2768 != null) {
                                    class58 var136 = new class58();
                                    var136.field531 = var9;
                                    var136.field545 = var9.field2768;
                                    field770.method3831(var136);
                                }
                                var9.field2789 = field796;
                                if (var9.field2796 != null) {
                                    for (int var137 = 0; var137 < field841; var137++) {
                                        class58 var138 = new class58();
                                        var138.field531 = var9;
                                        var138.field544 = field823[var137];
                                        var138.field537 = field833[var137];
                                        var138.field545 = var9.field2796;
                                        field770.method3831(var138);
                                    }
                                }
                            }
                        }
                        if (!var9.field2655) {
                            if (field784 != null || Statics.field228 != null || field692) {
                                continue;
                            }
                            if ((var9.field2777 >= 0 || var9.field2679 != 0) && class49.field437 >= var14 && class49.field439 >= var15 && class49.field437 < var16 && class49.field439 < var17) {
                                if (var9.field2777 >= 0) {
                                    Statics.field3738 = arg0[var9.field2777];
                                } else {
                                    Statics.field3738 = var9;
                                }
                            }
                            if (var9.field2658 == 8 && class49.field437 >= var14 && class49.field439 >= var15 && class49.field437 < var16 && class49.field439 < var17) {
                                Statics.field997 = var9;
                            }
                            if (var9.field2680 > var9.field2675) {
                                int var139 = var9.field2746 + var12;
                                int var140 = var9.field2675;
                                int var141 = var9.field2680;
                                int var142 = class49.field437;
                                int var143 = class49.field439;
                                if (field769) {
                                    field677 = 32;
                                } else {
                                    field677 = 0;
                                }
                                field769 = false;
                                if (class49.field434 == 1 || !Statics.field1754 && class49.field434 == 4) {
                                    if (var142 >= var139 && var142 < var139 + 16 && var143 >= var13 && var143 < var13 + 16) {
                                        var9.field2678 -= 4;
                                        method956(var9);
                                    } else if (var142 >= var139 && var142 < var139 + 16 && var143 >= var13 + var140 - 16 && var143 < var13 + var140) {
                                        var9.field2678 += 4;
                                        method956(var9);
                                    } else if (var142 >= var139 - field677 && var142 < field677 + var139 + 16 && var143 >= var13 + 16 && var143 < var13 + var140 - 16) {
                                        int var144 = (var140 - 32) * var140 / var141;
                                        if (var144 < 8) {
                                            var144 = 8;
                                        }
                                        int var145 = var143 - var13 - 16 - var144 / 2;
                                        int var146 = var140 - 32 - var144;
                                        var9.field2678 = (var141 - var140) * var145 / var146;
                                        method956(var9);
                                        field769 = true;
                                    }
                                }
                                if (field634 != 0) {
                                    int var147 = var9.field2746;
                                    if (var142 >= var139 - var147 && var143 >= var13 && var142 < var139 + 16 && var143 <= var13 + var140) {
                                        var9.field2678 += field634 * 45;
                                        method956(var9);
                                    }
                                }
                            }
                        }
                        if (var9.field2658 == 0) {
                            method220(arg0, var9.field2656, var14, var15, var16, var17, var12 - var9.field2764, var13 - var9.field2678);
                            if (var9.field2765 != null) {
                                method220(var9.field2765, var9.field2656, var14, var15, var16, var17, var12 - var9.field2764, var13 - var9.field2678);
                            }
                            class57 var148 = (class57) field771.method3759((long) var9.field2656);
                            if (var148 != null) {
                                if (var148.field526 == 0 && class49.field437 >= var14 && class49.field439 >= var15 && class49.field437 < var16 && class49.field439 < var17 && !field692) {
                                    for (class58 var149 = (class58) field770.method3823(); var149 != null; var149 = (class58) field770.method3822()) {
                                        if (var149.field530) {
                                            var149.method3812();
                                            var149.field531.field2787 = false;
                                        }
                                    }
                                    if (Statics.field3713 == 0) {
                                        field784 = null;
                                        field777 = null;
                                    }
                                    if (!field692) {
                                        field748 = 0;
                                        field692 = false;
                                        field730[0] = class240.field3121;
                                        field754[0] = "";
                                        field870[0] = 1006;
                                        field613[0] = false;
                                        field748 = 1;
                                    }
                                }
                                int var150 = var148.field527;
                                if (class233.method627(var150)) {
                                    method220(Statics.field2763[var150], -1, var14, var15, var16, var17, var12, var13);
                                }
                            }
                        }
                    } else if ((field843 == 0 || field843 == 3) && !field692 && (class49.field426 == 1 || !Statics.field1754 && class49.field426 == 4)) {
                        class227 var73 = var9.method4184(true);
                        if (var73 != null) {
                            int var74 = class49.field443 - var12;
                            int var75 = class49.field444 - var13;
                            if (var73.method4099(var74, var75)) {
                                int var76 = var74 - var73.field2609 / 2;
                                int var77 = var75 - var73.field2607 / 2;
                                int var78 = field680 & 0x7FF;
                                int var79 = class125.field1742[var78];
                                int var80 = class125.field1743[var78];
                                int var81 = var76 * var80 + var77 * var79 >> 11;
                                int var82 = var77 * var80 - var76 * var79 >> 11;
                                int var83 = Statics.field502.field953 + var81 >> 7;
                                int var84 = Statics.field502.field919 - var82 >> 7;
                                class175 var85 = class175.method3561(class172.field2284, field798.field1265);
                                var85.field2323.method3531(18);
                                var85.field2323.method3449(Statics.field64 + var84);
                                var85.field2323.method3449(Statics.field1225 + var83);
                                var85.field2323.method3351(class40.field328[82] ? (class40.field328[81] ? 2 : 1) : 0);
                                var85.field2323.method3531(var76);
                                var85.field2323.method3531(var77);
                                var85.field2323.method3449(field680);
                                var85.field2323.method3531(57);
                                var85.field2323.method3531(0);
                                var85.field2323.method3531(0);
                                var85.field2323.method3531(89);
                                var85.field2323.method3449(Statics.field502.field953);
                                var85.field2323.method3449(Statics.field502.field919);
                                var85.field2323.method3531(63);
                                field798.method1884(var85);
                                field825 = var83;
                                field842 = var84;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("jn.jf(IIB)V")
    public static final void method4739(int arg0, int arg1) {
        if (class233.method627(arg0)) {
            method1802(Statics.field2763[arg0], arg1);
        }
    }

    @ObfuscatedName("cl.je([Lhk;II)V")
    public static final void method1802(class233[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class233 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2658 == 0) {
                    if (var3.field2765 != null) {
                        method1802(var3.field2765, arg1);
                    }
                    class57 var4 = (class57) field771.method3759((long) var3.field2656);
                    if (var4 != null) {
                        method4739(var4.field527, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2780 != null) {
                    class58 var5 = new class58();
                    var5.field531 = var3;
                    var5.field545 = var3.field2780;
                    class71.method1800(var5);
                }
                if (arg1 == 1 && var3.field2770 != null) {
                    if (var3.field2657 >= 0) {
                        class233 var6 = class233.method130(var3.field2656);
                        if (var6 == null || var6.field2765 == null || var3.field2657 >= var6.field2765.length || var6.field2765[var3.field2657] != var3) {
                            continue;
                        }
                    }
                    class58 var7 = new class58();
                    var7.field531 = var3;
                    var7.field545 = var3.field2770;
                    class71.method1800(var7);
                }
            }
        }
    }

    @ObfuscatedName("ff.jl(Lhk;III)V")
    public static final void method3217(class233 arg0, int arg1, int arg2) {
        if (field784 != null || field692 || arg0 == null) {
            return;
        }
        class233 var3 = arg0;
        int var4 = class234.method5101(method2323(arg0));
        class233 var5;
        if (var4 == 0) {
            var5 = null;
        } else {
            int var6 = 0;
            while (true) {
                if (var6 >= var4) {
                    var5 = var3;
                    break;
                }
                var3 = class233.method130(var3.field2672);
                if (var3 == null) {
                    var5 = null;
                    break;
                }
                var6++;
            }
        }
        class233 var7 = var5;
        if (var5 == null) {
            var7 = arg0.field2732;
        }
        if (var7 == null) {
            return;
        }
        field784 = arg0;
        class233 var9 = arg0;
        int var10 = class234.method5101(method2323(arg0));
        class233 var11;
        if (var10 == 0) {
            var11 = null;
        } else {
            int var12 = 0;
            while (true) {
                if (var12 >= var10) {
                    var11 = var9;
                    break;
                }
                var9 = class233.method130(var9.field2672);
                if (var9 == null) {
                    var11 = null;
                    break;
                }
                var12++;
            }
        }
        class233 var13 = var11;
        if (var11 == null) {
            var13 = arg0.field2732;
        }
        field777 = var13;
        field801 = arg1;
        field787 = arg2;
        Statics.field3713 = 0;
        field795 = false;
        int var15 = method143();
        if (var15 != -1) {
            method440(var15);
        }
        return;
    }

    @ObfuscatedName("client.jj(I)V")
    public final void method1099() {
        method956(field784);
        Statics.field3713++;
        if (field693 && field716) {
            int var1 = class49.field437;
            int var2 = class49.field439;
            int var3 = var1 - field801;
            int var4 = var2 - field787;
            if (var3 < field790) {
                var3 = field790;
            }
            if (field784.field2746 + var3 > field790 + field777.field2746) {
                var3 = field790 + field777.field2746 - field784.field2746;
            }
            if (var4 < field791) {
                var4 = field791;
            }
            if (field784.field2675 + var4 > field791 + field777.field2675) {
                var4 = field791 + field777.field2675 - field784.field2675;
            }
            int var5 = var3 - field793;
            int var6 = var4 - field794;
            int var7 = field784.field2738;
            if (Statics.field3713 > field784.field2739 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field795 = true;
            }
            int var8 = field777.field2764 + (var3 - field790);
            int var9 = field777.field2678 + (var4 - field791);
            if (field784.field2721 != null && field795) {
                class58 var10 = new class58();
                var10.field531 = field784;
                var10.field532 = var8;
                var10.field533 = var9;
                var10.field545 = field784.field2721;
                class71.method1800(var10);
            }
            if (class49.field434 == 0) {
                if (field795) {
                    if (field784.field2752 != null) {
                        class58 var11 = new class58();
                        var11.field531 = field784;
                        var11.field532 = var8;
                        var11.field533 = var9;
                        var11.field535 = field788;
                        var11.field545 = field784.field2752;
                        class71.method1800(var11);
                    }
                    if (field788 != null) {
                        class233 var12 = field784;
                        int var13 = class234.method5101(method2323(var12));
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
                                var12 = class233.method130(var12.field2672);
                                if (var12 == null) {
                                    var14 = null;
                                    break;
                                }
                                var15++;
                            }
                        }
                        if (var14 != null) {
                            class175 var16 = class175.method3561(class172.field2255, field798.field1265);
                            var16.field2323.method3528(field788.field2656);
                            var16.field2323.method3449(field784.field2783);
                            var16.field2323.method3368(field784.field2656);
                            var16.field2323.method3449(field788.field2657);
                            var16.field2323.method3359(field784.field2657);
                            var16.field2323.method3359(field788.field2783);
                            field798.method1884(var16);
                        }
                    }
                } else if (this.method1084()) {
                    this.method1096(field801 + field793, field794 + field787);
                } else if (field748 > 0) {
                    int var17 = field801 + field793;
                    int var18 = field794 + field787;
                    class77 var19 = Statics.field1467;
                    method2972(var19.field1101, var19.field1098, var19.field1097, var19.field1100, var19.field1099, var19.field1099, var17, var18);
                    Statics.field1467 = null;
                }
                field784 = null;
            }
        } else if (Statics.field3713 > 1) {
            field784 = null;
        }
    }

    @ObfuscatedName("c.ji(IS)V")
    public static void method440(int arg0) {
        Statics.field1467 = new class77();
        Statics.field1467.field1101 = field749[arg0];
        Statics.field1467.field1098 = field750[arg0];
        Statics.field1467.field1097 = field870[arg0];
        Statics.field1467.field1100 = field752[arg0];
        Statics.field1467.field1099 = field730[arg0];
    }

    @ObfuscatedName("bw.ju(Lhk;I)V")
    public static void method956(class233 arg0) {
        if (field815 == arg0.field2794) {
            field875[arg0.field2793] = true;
        }
    }

    @ObfuscatedName("ga.jn(B)V")
    public static void method3560() {
        for (class57 var0 = (class57) field771.method3766(); var0 != null; var0 = (class57) field771.method3764()) {
            int var1 = var0.field527;
            if (class233.method627(var1)) {
                boolean var2 = true;
                class233[] var3 = Statics.field2763[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2655;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2486;
                    class233 var6 = class233.method130(var5);
                    if (var6 != null) {
                        method956(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("jl.jd(IB)V")
    public static final void method4622(int arg0) {
        if (!class233.method627(arg0)) {
            return;
        }
        class233[] var1 = Statics.field2763[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class233 var3 = var1[var2];
            if (var3 != null) {
                var3.field2677 = 0;
                var3.field2784 = 0;
            }
        }
    }

    @ObfuscatedName("bh.jo(II)V")
    public static final void method939(int arg0) {
        if (class233.method627(arg0)) {
            method89(Statics.field2763[arg0], -1);
        }
    }

    @ObfuscatedName("d.jy([Lhk;IB)V")
    public static final void method89(class233[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class233 var3 = arg0[var2];
            if (var3 != null && var3.field2672 == arg1) {
                if (var3.field2655) {
                    boolean var4 = var3.field2676;
                    if (var4) {
                        continue;
                    }
                }
                if (var3.field2658 == 0) {
                    if (!var3.field2655) {
                        boolean var5 = var3.field2676;
                        if (var5 && Statics.field3738 != var3) {
                            continue;
                        }
                    }
                    method89(arg0, var3.field2656);
                    if (var3.field2765 != null) {
                        method89(var3.field2765, var3.field2656);
                    }
                    class57 var6 = (class57) field771.method3759((long) var3.field2656);
                    if (var6 != null) {
                        method939(var6.field527);
                    }
                }
                if (var3.field2658 == 6) {
                    if (var3.field2703 != -1 || var3.field2704 != -1) {
                        boolean var7 = method1064(var3);
                        int var8;
                        if (var7) {
                            var8 = var3.field2704;
                        } else {
                            var8 = var3.field2703;
                        }
                        if (var8 != -1) {
                            class276 var9 = class276.method2865(var8);
                            var3.field2784 += field671;
                            while (var3.field2784 > var9.field3599[var3.field2677]) {
                                var3.field2784 -= var9.field3599[var3.field2677];
                                var3.field2677++;
                                if (var3.field2677 >= var9.field3597.length) {
                                    var3.field2677 -= var9.field3601;
                                    if (var3.field2677 < 0 || var3.field2677 >= var9.field3597.length) {
                                        var3.field2677 = 0;
                                    }
                                }
                                method956(var3);
                            }
                        }
                    }
                    if (var3.field2712 != 0 && !var3.field2655) {
                        int var10 = var3.field2712 >> 16;
                        int var11 = var3.field2712 << 16 >> 16;
                        int var12 = field671 * var10;
                        int var13 = field671 * var11;
                        var3.field2733 = var3.field2733 + var12 & 0x7FF;
                        var3.field2708 = var3.field2708 + var13 & 0x7FF;
                        method956(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ex.jv(IB)V")
    public static final void method2960(int arg0) {
        method3560();
        class70.method1772();
        int var1 = class257.method3120(arg0).field3287;
        if (var1 == 0) {
            return;
        }
        int var2 = class228.field2617[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class125.method2606(0.9D);
                ((class114) Statics.field1739).method2372(0.9D);
            }
            if (var2 == 2) {
                class125.method2606(0.8D);
                ((class114) Statics.field1739).method2372(0.8D);
            }
            if (var2 == 3) {
                class125.method2606(0.7D);
                ((class114) Statics.field1739).method2372(0.7D);
            }
            if (var2 == 4) {
                class125.method2606(0.6D);
                ((class114) Statics.field1739).method2372(0.6D);
            }
            class272.method652();
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
            if (field705 != var3) {
                if (field705 == 0 && field845 != -1) {
                    class220.method3559(Statics.field2612, field845, 0, var3, false);
                    field846 = false;
                } else if (var3 == 0) {
                    Statics.field2522.method3925();
                    class220.field2525 = 1;
                    Statics.field3278 = null;
                    field846 = false;
                } else if (class220.field2525 == 0) {
                    Statics.field2522.method3910(var3);
                } else {
                    Statics.field312 = var3;
                }
                field705 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field840 = 127;
            }
            if (var2 == 1) {
                field840 = 96;
            }
            if (var2 == 2) {
                field840 = 64;
            }
            if (var2 == 3) {
                field840 = 32;
            }
            if (var2 == 4) {
                field840 = 0;
            }
        }
        if (var1 == 5) {
            field746 = var2;
        }
        if (var1 == 6) {
            field854 = var2;
        }
        if (var1 == 9) {
            field776 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                field755 = 127;
            }
            if (var2 == 1) {
                field755 = 96;
            }
            if (var2 == 2) {
                field755 = 64;
            }
            if (var2 == 3) {
                field755 = 32;
            }
            if (var2 == 4) {
                field755 = 0;
            }
        }
        if (var1 == 17) {
            field714 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            class79[] var4 = new class79[] { class79.field1111, class79.field1119, class79.field1113, class79.field1112 };
            field637 = (class79) class180.method3213(var4, var2);
            if (field637 == null) {
                field637 = class79.field1119;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field738 = -1;
            } else {
                field738 = var2 & 0x7FF;
            }
        }
        if (var1 != 22) {
            return;
        }
        class79[] var5 = new class79[] { class79.field1111, class79.field1119, class79.field1113, class79.field1112 };
        field638 = (class79) class180.method3213(var5, var2);
        if (field638 == null) {
            field638 = class79.field1119;
        }
    }

    @ObfuscatedName("ch.jc(IIII)Lbw;")
    public static final class57 method1871(int arg0, int arg1, int arg2) {
        class57 var3 = new class57();
        var3.field527 = arg1;
        var3.field526 = arg2;
        field771.method3761(var3, (long) arg0);
        method4622(arg1);
        class233 var4 = class233.method130(arg0);
        method956(var4);
        if (field710 != null) {
            method956(field710);
            field710 = null;
        }
        method3555();
        method62(Statics.field2763[arg0 >> 16], var4, false);
        class71.method935(arg1);
        if (field816 != -1) {
            method4739(field816, 1);
        }
        return var3;
    }

    @ObfuscatedName("bv.jk(Lbw;ZI)V")
    public static final void method937(class57 arg0, boolean arg1) {
        int var2 = arg0.field527;
        int var3 = (int) arg0.field2486;
        arg0.method3812();
        if (arg1) {
            class233.method2324(var2);
        }
        method2352(var2);
        class233 var4 = class233.method130(var3);
        if (var4 != null) {
            method956(var4);
        }
        method3555();
        if (field816 != -1) {
            method4739(field816, 1);
        }
    }

    @ObfuscatedName("fp.jt(Lhk;I)Z")
    public static final boolean method3147(class233 arg0) {
        int var1 = arg0.field2660;
        if (var1 == 205) {
            field657 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field851.method4156(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field851.method4134(var4, var5 == 1);
        }
        if (var1 == 324) {
            field851.method4135(false);
        }
        if (var1 == 325) {
            field851.method4135(true);
        }
        if (var1 == 326) {
            class175 var6 = class175.method3561(class172.field2210, field798.field1265);
            field851.method4141(var6.field2323);
            field798.method1884(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("bp.jg(Lhk;IIII)V")
    public static final void method1698(class233 arg0, int arg1, int arg2, int arg3) {
        method450();
        class227 var4 = arg0.method4184(false);
        if (var4 == null) {
            return;
        }
        class320.method5408(arg1, arg2, var4.field2609 + arg1, var4.field2607 + arg2);
        if (field843 == 2 || field843 == 5) {
            class320.method5359(arg1, arg2, 0, var4.field2610, var4.field2608);
        } else {
            int var5 = field680 & 0x7FF;
            int var6 = Statics.field502.field953 / 32 + 48;
            int var7 = 464 - Statics.field502.field919 / 32;
            Statics.field163.method5477(arg1, arg2, var4.field2609, var4.field2607, var6, var7, var5, 256, var4.field2610, var4.field2608);
            for (int var8 = 0; var8 < field853; var8++) {
                int var9 = field838[var8] * 4 + 2 - Statics.field502.field953 / 32;
                int var10 = field855[var8] * 4 + 2 - Statics.field502.field919 / 32;
                method29(arg1, arg2, var9, var10, field847[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class208 var13 = field739[Statics.field517][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field502.field953 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field502.field919 / 32;
                        method29(arg1, arg2, var14, var15, Statics.field41[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field652; var16++) {
                class74 var17 = field651[field868[var16]];
                if (var17 != null && var17.method1030()) {
                    class274 var18 = var17.field1071;
                    if (var18 != null && var18.field3572 != null) {
                        var18 = var18.method4802();
                    }
                    if (var18 != null && var18.field3563 && var18.field3575) {
                        int var19 = var17.field953 / 32 - Statics.field502.field953 / 32;
                        int var20 = var17.field919 / 32 - Statics.field502.field919 / 32;
                        method29(arg1, arg2, var19, var20, Statics.field41[1], var4);
                    }
                }
            }
            int var21 = class84.field1204;
            int[] var22 = class84.field1209;
            for (int var23 = 0; var23 < var21; var23++) {
                class62 var24 = field727[var22[var23]];
                if (var24 != null && var24.method1030() && !var24.field572 && Statics.field502 != var24) {
                    int var25 = var24.field953 / 32 - Statics.field502.field953 / 32;
                    int var26 = var24.field919 / 32 - Statics.field502.field919 / 32;
                    boolean var27 = false;
                    if (Statics.field502.field590 != 0 && var24.field590 != 0 && Statics.field502.field590 == var24.field590) {
                        var27 = true;
                    }
                    if (var24.method1020()) {
                        method29(arg1, arg2, var25, var26, Statics.field41[3], var4);
                    } else if (var27) {
                        method29(arg1, arg2, var25, var26, Statics.field41[4], var4);
                    } else if (var24.method1023()) {
                        method29(arg1, arg2, var25, var26, Statics.field41[5], var4);
                    } else {
                        method29(arg1, arg2, var25, var26, Statics.field41[2], var4);
                    }
                }
            }
            if (field629 != 0 && field633 % 20 < 10) {
                if (field629 == 1 && field873 >= 0 && field873 < field651.length) {
                    class74 var28 = field651[field873];
                    if (var28 != null) {
                        int var29 = var28.field953 / 32 - Statics.field502.field953 / 32;
                        int var30 = var28.field919 / 32 - Statics.field502.field919 / 32;
                        method1835(arg1, arg2, var29, var30, Statics.field1022[1], var4);
                    }
                }
                if (field629 == 2) {
                    int var31 = field632 * 4 - Statics.field1225 * 4 + 2 - Statics.field502.field953 / 32;
                    int var32 = field786 * 4 - Statics.field64 * 4 + 2 - Statics.field502.field919 / 32;
                    method1835(arg1, arg2, var31, var32, Statics.field1022[1], var4);
                }
                if (field629 == 10 && field631 >= 0 && field631 < field727.length) {
                    class62 var33 = field727[field631];
                    if (var33 != null) {
                        int var34 = var33.field953 / 32 - Statics.field502.field953 / 32;
                        int var35 = var33.field919 / 32 - Statics.field502.field919 / 32;
                        method1835(arg1, arg2, var34, var35, Statics.field1022[1], var4);
                    }
                }
            }
            if (field825 != 0) {
                int var36 = field825 * 4 + 2 - Statics.field502.field953 / 32;
                int var37 = field842 * 4 + 2 - Statics.field502.field919 / 32;
                method29(arg1, arg2, var36, var37, Statics.field1022[0], var4);
            }
            if (!Statics.field502.field572) {
                class320.method5348(var4.field2609 / 2 + arg1 - 1, var4.field2607 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field817[arg3] = true;
    }

    @ObfuscatedName("v.jx(Lhk;IIII)V")
    public static final void method221(class233 arg0, int arg1, int arg2, int arg3) {
        class227 var4 = arg0.method4184(false);
        if (var4 == null) {
            return;
        }
        if (field843 < 3) {
            Statics.field22.method5477(arg1, arg2, var4.field2609, var4.field2607, 25, 25, field680, 256, var4.field2610, var4.field2608);
        } else {
            class320.method5359(arg1, arg2, 0, var4.field2610, var4.field2608);
        }
    }

    @ObfuscatedName("cp.jq(IIIILly;Lhh;B)V")
    public static final void method1835(int arg0, int arg1, int arg2, int arg3, class324 arg4, class227 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method29(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field680 & 0x7FF;
        int var8 = class125.field1742[var7];
        int var9 = class125.field1743[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field2609 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field18.method5478(arg5.field2609 / 2 + arg0 - var17 / 2 + var15, arg5.field2607 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("b.js(IIIILly;Lhh;I)V")
    public static final void method29(int arg0, int arg1, int arg2, int arg3, class324 arg4, class227 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field680 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class125.field1742[var6];
        int var9 = class125.field1743[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method5476(arg5.field2609 / 2 + var10 - arg4.field3875 / 2, arg5.field2607 / 2 - var11 - arg4.field3876 / 2, arg0, arg1, arg5.field2609, arg5.field2607, arg5.field2610, arg5.field2608);
        } else {
            arg4.method5460(arg5.field2609 / 2 + arg0 + var10 - arg4.field3875 / 2, arg5.field2607 / 2 + arg1 - var11 - arg4.field3876 / 2);
        }
    }

    @ObfuscatedName("az.jp(I)V")
    public static final void method927() {
        for (int var0 = 0; var0 < class84.field1204; var0++) {
            class62 var1 = field727[class84.field1209[var0]];
            var1.method1061();
        }
        Iterator var2 = class86.field1226.iterator();
        while (var2.hasNext()) {
            class60 var3 = (class60) var2.next();
            var3.method972();
        }
        if (Statics.field1960 != null) {
            Statics.field1960.method5090();
        }
    }

    @ObfuscatedName("aj.jw(I)V")
    public static final void method535() {
        for (int var0 = 0; var0 < class84.field1204; var0++) {
            class62 var1 = field727[class84.field1209[var0]];
            var1.method1024();
        }
    }

    @ObfuscatedName("ho.jh(I)V")
    public static final void method4173() {
        field667 = field796;
    }

    @ObfuscatedName("i.ki(Ljava/lang/String;B)V")
    public static final void method437(String arg0) {
        if (!arg0.equals("")) {
            class175 var1 = class175.method3561(class172.field2209, field798.field1265);
            var1.field2323.method3531(class185.method459(arg0));
            var1.field2323.method3314(arg0);
            field798.method1884(var1);
        }
    }

    @ObfuscatedName("df.kz(II)V")
    public static void method2352(int arg0) {
        for (class214 var1 = (class214) field813.method3766(); var1 != null; var1 = (class214) field813.method3764()) {
            if ((long) arg0 == (var1.field2486 >> 48 & 0xFFFFL)) {
                var1.method3812();
            }
        }
    }

    @ObfuscatedName("dc.kp(Lhk;I)I")
    public static int method2323(class233 arg0) {
        class214 var1 = (class214) field813.method3759(((long) arg0.field2656 << 32) + (long) arg0.field2657);
        return var1 == null ? arg0.field2766 : var1.field2502;
    }

    @ObfuscatedName("bt.kd(Lhk;II)Ljava/lang/String;")
    public static String method1077(class233 arg0, int arg1) {
        int var2 = method2323(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2762 == null) {
            return null;
        } else if (arg0.field2736 == null || arg0.field2736.length <= arg1 || arg0.field2736[arg1] == null || arg0.field2736[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2736[arg1];
        }
    }

    @ObfuscatedName("bd.kv(Lhk;I)Ljava/lang/String;")
    public static String method1001(class233 arg0) {
        if (class234.method4585(method2323(arg0)) == 0) {
            return null;
        } else if (arg0.field2664 == null || arg0.field2664.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2664;
        }
    }

    @ObfuscatedName("aq.kf(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method639(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field612 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field612 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field612 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field612 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field612 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field616 != null) {
            var3 = "/p=" + Statics.field616;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field642 + "/a=" + Statics.field2831 + var3 + "/";
    }

    @ObfuscatedName("ie.kj(Ljava/lang/String;B)V")
    public static void method4326(String arg0) {
        Statics.field616 = arg0;
        try {
            String var1 = Statics.field3284.getParameter(class282.field3654.field3653);
            String var2 = Statics.field3284.getParameter(class282.field3655.field3653);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                String var5 = var3 + "; Expires=";
                long var6 = class187.method2864() + 94608000000L;
                class195.field2452.setTime(new Date(var6));
                int var8 = class195.field2452.get(7);
                int var9 = class195.field2452.get(5);
                int var10 = class195.field2452.get(2);
                int var11 = class195.field2452.get(1);
                int var12 = class195.field2452.get(11);
                int var13 = class195.field2452.get(12);
                int var14 = class195.field2452.get(13);
                String var15 = class195.field2451[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + class195.field2456[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT";
                var4 = var5 + var15 + "; Max-Age=" + 94608000L;
            }
            client var16 = Statics.field3284;
            String var17 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var16).eval(var17);
        } catch (Throwable var19) {
        }
    }

    @ObfuscatedName("client.kh(I)Lkh;")
    public class294 method1100() {
        return Statics.field502 == null ? null : Statics.field502.field573;
    }

    @ObfuscatedName("n.kq(II)V")
    public static void method92(int arg0) {
        field876 = arg0;
    }

    @ObfuscatedName("bv.ko(I)V")
    public static void method930() {
        field798.method1884(class175.method3561(class172.field2237, field798.field1265));
        field876 = 0;
    }

    @ObfuscatedName("go.kn(B)V")
    public static void method3624() {
        if (field876 == 1) {
            field866 = true;
        }
    }

    @ObfuscatedName("bg.ks(I)V")
    public static void method1615() {
        if (!field866 || Statics.field502 == null) {
            return;
        }
        int var0 = Statics.field502.field958[0];
        int var1 = Statics.field502.field944[0];
        if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) {
            return;
        }
        Statics.field1491 = Statics.field502.field953;
        int var2 = method953(Statics.field502.field953, Statics.field502.field919, Statics.field517) - field686;
        if (var2 < Statics.field608) {
            Statics.field608 = var2;
        }
        Statics.field1260 = Statics.field502.field919;
        field866 = false;
    }

    @ObfuscatedName("dl.ke(Ljava/lang/String;S)Ljava/lang/String;")
    public static String method2128(String arg0) {
        class245[] var1 = class245.method2948();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class245 var3 = var1[var2];
            if (var3.field3177 != -1) {
                int var5 = var3.field3177;
                String var6 = "<img=" + var5 + ">";
                if (arg0.startsWith(var6)) {
                    arg0 = arg0.substring(6 + Integer.toString(var3.field3177).length());
                    break;
                }
            }
        }
        return arg0;
    }
}

package deob;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public final class client extends class47 implements class315 {

    @ObfuscatedName("client.w")
    public static class136[] field661 = new class136[4];

    @ObfuscatedName("client.ae")
    public static boolean field868 = true;

    @ObfuscatedName("client.bh")
    public static int field600 = 1;

    @ObfuscatedName("client.br")
    public static int field601 = 0;

    @ObfuscatedName("client.bi")
    public static int field786 = 0;

    @ObfuscatedName("client.bt")
    public static boolean field599 = false;

    @ObfuscatedName("client.ba")
    public static boolean field604 = false;

    @ObfuscatedName("client.bw")
    public static int field619 = -1;

    @ObfuscatedName("client.by")
    public static int field606 = -1;

    @ObfuscatedName("client.bq")
    public static boolean field607 = false;

    @ObfuscatedName("client.bf")
    public static int field755 = 0;

    @ObfuscatedName("client.ca")
    public static boolean field665 = true;

    @ObfuscatedName("client.ch")
    public static int field611 = 0;

    @ObfuscatedName("client.cq")
    public static long field612 = 1L;

    @ObfuscatedName("client.cu")
    public static int field876 = -1;

    @ObfuscatedName("client.cb")
    public static int field760 = -1;

    @ObfuscatedName("client.cv")
    public static long field852 = -1L;

    @ObfuscatedName("client.cj")
    public static boolean field616 = true;

    @ObfuscatedName("client.cy")
    public static boolean field830 = false;

    @ObfuscatedName("client.cs")
    public static int field618 = 0;

    @ObfuscatedName("client.cr")
    public static int field809 = 0;

    @ObfuscatedName("client.cd")
    public static int field620 = 0;

    @ObfuscatedName("client.cl")
    public static int field621 = 0;

    @ObfuscatedName("client.ci")
    public static int field622 = 0;

    @ObfuscatedName("client.cm")
    public static int field623 = 0;

    @ObfuscatedName("client.ct")
    public static int field608 = 0;

    @ObfuscatedName("client.do")
    public static int field625 = 0;

    @ObfuscatedName("client.dm")
    public static int field769 = 0;

    @ObfuscatedName("client.dg")
    public static class107 field627 = class107.field1336;

    @ObfuscatedName("client.dq")
    public static class107 field628 = class107.field1336;

    @ObfuscatedName("client.dc")
    public static int field629 = 0;

    @ObfuscatedName("client.da")
    public static int field630 = 0;

    @ObfuscatedName("client.dz")
    public static int field631 = 0;

    @ObfuscatedName("client.eb")
    public static int field881 = 0;

    @ObfuscatedName("client.em")
    public static int field770 = 0;

    @ObfuscatedName("client.eh")
    public static int field634 = 0;

    @ObfuscatedName("client.ey")
    public static int field635 = 0;

    @ObfuscatedName("client.eu")
    public static int field636 = 0;

    @ObfuscatedName("client.en")
    public static class126 field637 = class126.field1459;

    @ObfuscatedName("client.ed")
    public static boolean field638 = false;

    @ObfuscatedName("client.ee")
    public static class86 field639 = new class86();

    @ObfuscatedName("client.ea")
    public class382 field747;

    @ObfuscatedName("client.fi")
    public class36 field641;

    @ObfuscatedName("client.fy")
    public static byte[] field788 = null;

    @ObfuscatedName("client.fg")
    public static class105[] field643 = new class105[32768];

    @ObfuscatedName("client.fl")
    public static int field644 = 0;

    @ObfuscatedName("client.fv")
    public static int[] field645 = new int[32768];

    @ObfuscatedName("client.fr")
    public static int field646 = 0;

    @ObfuscatedName("client.fw")
    public static int[] field647 = new int[250];

    @ObfuscatedName("client.fs")
    public static final class112 field649 = new class112();

    @ObfuscatedName("client.fc")
    public static int field651 = 0;

    @ObfuscatedName("client.ft")
    public static boolean field738 = false;

    @ObfuscatedName("client.fx")
    public static boolean field653 = true;

    @ObfuscatedName("client.fq")
    public static class309 field858 = new class309();

    @ObfuscatedName("client.fd")
    public static HashMap field864 = new HashMap();

    @ObfuscatedName("client.gk")
    public static int field656 = 0;

    @ObfuscatedName("client.gs")
    public static int field657 = 1;

    @ObfuscatedName("client.gn")
    public static int field658 = 0;

    @ObfuscatedName("client.gh")
    public static int field753 = 1;

    @ObfuscatedName("client.gb")
    public static int field660 = 0;

    @ObfuscatedName("client.gf")
    public static boolean field662 = false;

    @ObfuscatedName("client.gw")
    public static int[][][] field663 = new int[4][13][13];

    @ObfuscatedName("client.gm")
    public static final int[] field664 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.gl")
    public static int field800 = 0;

    @ObfuscatedName("client.ho")
    public static int field666 = 2301979;

    @ObfuscatedName("client.hj")
    public static int field667 = 5063219;

    @ObfuscatedName("client.hq")
    public static int field668 = 3353893;

    @ObfuscatedName("client.hh")
    public static int field669 = 7759444;

    @ObfuscatedName("client.hw")
    public static boolean field670 = false;

    @ObfuscatedName("client.hk")
    public static int field671 = 0;

    @ObfuscatedName("client.hd")
    public static int field632 = 128;

    @ObfuscatedName("client.hf")
    public static int field673 = 0;

    @ObfuscatedName("client.hb")
    public static int field674 = 0;

    @ObfuscatedName("client.hy")
    public static int field675 = 0;

    @ObfuscatedName("client.hm")
    public static int field676 = 0;

    @ObfuscatedName("client.hl")
    public static int field752 = 0;

    @ObfuscatedName("client.ie")
    public static int field678 = 0;

    @ObfuscatedName("client.iu")
    public static int field870 = 50;

    @ObfuscatedName("client.ip")
    public static int field680 = 0;

    @ObfuscatedName("client.im")
    public static int field703 = 0;

    @ObfuscatedName("client.ij")
    public static int field682 = 0;

    @ObfuscatedName("client.iq")
    public static int field642 = 12;

    @ObfuscatedName("client.ih")
    public static int field684 = 6;

    @ObfuscatedName("client.iy")
    public static int field685 = 0;

    @ObfuscatedName("client.it")
    public static String field695 = null;

    @ObfuscatedName("client.if")
    public static boolean field686 = false;

    @ObfuscatedName("client.ia")
    public static int field827 = 0;

    @ObfuscatedName("client.ig")
    public static boolean field688 = false;

    @ObfuscatedName("client.ic")
    public static int field736 = 0;

    @ObfuscatedName("client.ir")
    public static int field655 = 0;

    @ObfuscatedName("client.in")
    public static int field691 = 50;

    @ObfuscatedName("client.is")
    public static int[] field692 = new int[field691];

    @ObfuscatedName("client.iw")
    public static int[] field867 = new int[field691];

    @ObfuscatedName("client.iv")
    public static int[] field694 = new int[field691];

    @ObfuscatedName("client.io")
    public static int[] field720 = new int[field691];

    @ObfuscatedName("client.ib")
    public static int[] field696 = new int[field691];

    @ObfuscatedName("client.jt")
    public static int[] field633 = new int[field691];

    @ObfuscatedName("client.jn")
    public static int[] field698 = new int[field691];

    @ObfuscatedName("client.ja")
    public static String[] field861 = new String[field691];

    @ObfuscatedName("client.jf")
    public static int[][] field617 = new int[104][104];

    @ObfuscatedName("client.jj")
    public static int field701 = 0;

    @ObfuscatedName("client.jk")
    public static int field702 = -1;

    @ObfuscatedName("client.jr")
    public static int field814 = -1;

    @ObfuscatedName("client.jh")
    public static int field704 = 0;

    @ObfuscatedName("client.jb")
    public static int field730 = 0;

    @ObfuscatedName("client.jl")
    public static int field706 = 0;

    @ObfuscatedName("client.jo")
    public static int field782 = 0;

    @ObfuscatedName("client.ju")
    public static boolean field772 = true;

    @ObfuscatedName("client.jc")
    public static int field709 = 0;

    @ObfuscatedName("client.jp")
    public static int field710 = 0;

    @ObfuscatedName("client.js")
    public static int field711 = 0;

    @ObfuscatedName("client.je")
    public static int field659 = 0;

    @ObfuscatedName("client.jy")
    public static int field713 = 0;

    @ObfuscatedName("client.jv")
    public static int field878 = 0;

    @ObfuscatedName("client.jq")
    public static boolean field715 = false;

    @ObfuscatedName("client.jg")
    public static int field716 = 0;

    @ObfuscatedName("client.ji")
    public static int field717 = 0;

    @ObfuscatedName("client.jd")
    public static boolean field718 = true;

    @ObfuscatedName("client.kf")
    public static class98[] field849 = new class98[2048];

    @ObfuscatedName("client.ky")
    public static int field700 = -1;

    @ObfuscatedName("client.kl")
    public static int field721 = 0;

    @ObfuscatedName("client.ka")
    public static boolean field722 = true;

    @ObfuscatedName("client.kw")
    public static int field796 = 0;

    @ObfuscatedName("client.kq")
    public static int field724 = 0;

    @ObfuscatedName("client.kx")
    public static int[] field725 = new int[1000];

    @ObfuscatedName("client.ks")
    public static final int[] field726 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.ku")
    public static String[] field831 = new String[8];

    @ObfuscatedName("client.km")
    public static boolean[] field816 = new boolean[8];

    @ObfuscatedName("client.kv")
    public static int[] field729 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.kn")
    public static int field869 = -1;

    @ObfuscatedName("client.kp")
    public static class272[][][] field731 = new class272[4][104][104];

    @ObfuscatedName("client.kr")
    public static class272 field732 = new class272();

    @ObfuscatedName("client.kh")
    public static class272 field733 = new class272();

    @ObfuscatedName("client.kg")
    public static class272 field734 = new class272();

    @ObfuscatedName("client.kk")
    public static int[] field735 = new int[25];

    @ObfuscatedName("client.ki")
    public static int[] field737 = new int[25];

    @ObfuscatedName("client.le")
    public static int[] field652 = new int[25];

    @ObfuscatedName("client.lu")
    public static int field874 = 0;

    @ObfuscatedName("client.la")
    public static boolean field739 = false;

    @ObfuscatedName("client.lt")
    public static int field740 = 0;

    @ObfuscatedName("client.ll")
    public static int[] field826 = new int[500];

    @ObfuscatedName("client.lf")
    public static int[] field742 = new int[500];

    @ObfuscatedName("client.lz")
    public static int[] field648 = new int[500];

    @ObfuscatedName("client.lg")
    public static int[] field744 = new int[500];

    @ObfuscatedName("client.ls")
    public static String[] field745 = new String[500];

    @ObfuscatedName("client.lw")
    public static String[] field746 = new String[500];

    @ObfuscatedName("client.li")
    public static boolean[] field833 = new boolean[500];

    @ObfuscatedName("client.lo")
    public static boolean field862 = false;

    @ObfuscatedName("client.ld")
    public static boolean field749 = false;

    @ObfuscatedName("client.lp")
    public static boolean field750 = false;

    @ObfuscatedName("client.ln")
    public static boolean field751 = true;

    @ObfuscatedName("client.lh")
    public static int field693 = -1;

    @ObfuscatedName("client.lc")
    public static int field650 = -1;

    @ObfuscatedName("client.mk")
    public static int field754 = 0;

    @ObfuscatedName("client.ms")
    public static int field697 = 50;

    @ObfuscatedName("client.mx")
    public static int field756 = 0;

    @ObfuscatedName("client.ma")
    public static boolean field758 = false;

    @ObfuscatedName("client.mc")
    public static int field759 = -1;

    @ObfuscatedName("client.mz")
    public static int field875 = -1;

    @ObfuscatedName("client.mw")
    public static String field815 = null;

    @ObfuscatedName("client.mb")
    public static String field762 = null;

    @ObfuscatedName("client.mp")
    public static int field763 = -1;

    @ObfuscatedName("client.mh")
    public static class361 field764 = new class361(8);

    @ObfuscatedName("client.mr")
    public static int field765 = 0;

    @ObfuscatedName("client.mj")
    public static int field766 = -1;

    @ObfuscatedName("client.mv")
    public static int field707 = 0;

    @ObfuscatedName("client.mq")
    public static int field768 = 0;

    @ObfuscatedName("client.me")
    public static class225 field640 = null;

    @ObfuscatedName("client.mg")
    public static int field626 = 0;

    @ObfuscatedName("client.mt")
    public static int field771 = 0;

    @ObfuscatedName("client.mu")
    public static int field797 = 0;

    @ObfuscatedName("client.mf")
    public static int field615 = -1;

    @ObfuscatedName("client.nm")
    public static boolean field774 = false;

    @ObfuscatedName("client.ni")
    public static class225 field775 = null;

    @ObfuscatedName("client.nx")
    public static class225 field776 = null;

    @ObfuscatedName("client.na")
    public static class225 field777 = null;

    @ObfuscatedName("client.nh")
    public static int field824 = 0;

    @ObfuscatedName("client.nn")
    public static int field779 = 0;

    @ObfuscatedName("client.no")
    public static class225 field853 = null;

    @ObfuscatedName("client.np")
    public static boolean field781 = false;

    @ObfuscatedName("client.ns")
    public static int field728 = -1;

    @ObfuscatedName("client.ne")
    public static int field783 = -1;

    @ObfuscatedName("client.nc")
    public static boolean field784 = false;

    @ObfuscatedName("client.nq")
    public static int field785 = -1;

    @ObfuscatedName("client.ng")
    public static int field846 = -1;

    @ObfuscatedName("client.nr")
    public static boolean field712 = false;

    @ObfuscatedName("client.nv")
    public static int field605 = 1;

    @ObfuscatedName("client.nj")
    public static int[] field789 = new int[32];

    @ObfuscatedName("client.nw")
    public static int field790 = 0;

    @ObfuscatedName("client.nt")
    public static int[] field791 = new int[32];

    @ObfuscatedName("client.nz")
    public static int field792 = 0;

    @ObfuscatedName("client.nl")
    public static int[] field723 = new int[32];

    @ObfuscatedName("client.ou")
    public static int field794 = 0;

    @ObfuscatedName("client.oe")
    public static int[] field795 = new int[32];

    @ObfuscatedName("client.ox")
    public static int field614 = 0;

    @ObfuscatedName("client.ow")
    public static int field871 = 0;

    @ObfuscatedName("client.oh")
    public static int field798 = 0;

    @ObfuscatedName("client.os")
    public static int field799 = 0;

    @ObfuscatedName("client.oa")
    public static int field787 = 0;

    @ObfuscatedName("client.oy")
    public static int field801 = 0;

    @ObfuscatedName("client.ok")
    public static int field802 = 0;

    @ObfuscatedName("client.on")
    public static int field803 = 0;

    @ObfuscatedName("client.ot")
    public static int field804 = 0;

    @ObfuscatedName("client.oi")
    public static int field805 = 0;

    @ObfuscatedName("client.op")
    public static class272 field806 = new class272();

    @ObfuscatedName("client.of")
    public static class272 field807 = new class272();

    @ObfuscatedName("client.ol")
    public static class272 field689 = new class272();

    @ObfuscatedName("client.oq")
    public static class361 field748 = new class361(512);

    @ObfuscatedName("client.om")
    public static int field810 = 0;

    @ObfuscatedName("client.oj")
    public static int field811 = -2;

    @ObfuscatedName("client.oo")
    public static boolean[] field812 = new boolean[100];

    @ObfuscatedName("client.og")
    public static boolean[] field813 = new boolean[100];

    @ObfuscatedName("client.od")
    public static boolean[] field705 = new boolean[100];

    @ObfuscatedName("client.px")
    public static int[] field677 = new int[100];

    @ObfuscatedName("client.pb")
    public static int[] field672 = new int[100];

    @ObfuscatedName("client.pi")
    public static int[] field817 = new int[100];

    @ObfuscatedName("client.pf")
    public static int[] field818 = new int[100];

    @ObfuscatedName("client.pk")
    public static int field613 = 0;

    @ObfuscatedName("client.pl")
    public static long field820 = 0L;

    @ObfuscatedName("client.pv")
    public static boolean field819 = true;

    @ObfuscatedName("client.pc")
    public static int[] field822 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.py")
    public static int field823 = 0;

    @ObfuscatedName("client.pz")
    public static int field780 = 0;

    @ObfuscatedName("client.pd")
    public static String field825 = "";

    @ObfuscatedName("client.pt")
    public static long[] field690 = new long[100];

    @ObfuscatedName("client.pn")
    public static int field761 = 0;

    @ObfuscatedName("client.pr")
    public static int field828 = 0;

    @ObfuscatedName("client.pu")
    public static int[] field829 = new int[128];

    @ObfuscatedName("client.pe")
    public static int[] field793 = new int[128];

    @ObfuscatedName("client.po")
    public static long field679 = -1L;

    @ObfuscatedName("client.ql")
    public static class12[] field832 = new class12[1];

    @ObfuscatedName("client.qc")
    public static class4[] field821 = new class4[1];

    @ObfuscatedName("client.qt")
    public static int field834 = -1;

    @ObfuscatedName("client.qf")
    public static int field835 = 0;

    @ObfuscatedName("client.qn")
    public static int[] field836 = new int[1000];

    @ObfuscatedName("client.qp")
    public static int[] field837 = new int[1000];

    @ObfuscatedName("client.qm")
    public static class395[] field838 = new class395[1000];

    @ObfuscatedName("client.qi")
    public static int field839 = 0;

    @ObfuscatedName("client.qu")
    public static int field840 = 0;

    @ObfuscatedName("client.qx")
    public static int field841 = 0;

    @ObfuscatedName("client.qe")
    public static int field842 = -1;

    @ObfuscatedName("client.qy")
    public static boolean field843 = false;

    @ObfuscatedName("client.rr")
    public static int field844 = 0;

    @ObfuscatedName("client.rq")
    public static int[] field845 = new int[50];

    @ObfuscatedName("client.rk")
    public static int[] field654 = new int[50];

    @ObfuscatedName("client.rm")
    public static int[] field847 = new int[50];

    @ObfuscatedName("client.ru")
    public static int[] field848 = new int[50];

    @ObfuscatedName("client.rc")
    public static class50[] field778 = new class50[50];

    @ObfuscatedName("client.rw")
    public static boolean field850 = false;

    @ObfuscatedName("client.rj")
    public static boolean[] field851 = new boolean[5];

    @ObfuscatedName("client.rp")
    public static int[] field602 = new int[5];

    @ObfuscatedName("client.rg")
    public static int[] field699 = new int[5];

    @ObfuscatedName("client.rn")
    public static int[] field854 = new int[5];

    @ObfuscatedName("client.rh")
    public static int[] field855 = new int[5];

    @ObfuscatedName("client.ra")
    public static short field856 = 256;

    @ObfuscatedName("client.sd")
    public static short field857 = 205;

    @ObfuscatedName("client.sf")
    public static short field683 = 256;

    @ObfuscatedName("client.sp")
    public static short field859 = 320;

    @ObfuscatedName("client.se")
    public static short field860 = 1;

    @ObfuscatedName("client.ss")
    public static short field743 = 32767;

    @ObfuscatedName("client.sa")
    public static short field708 = 1;

    @ObfuscatedName("client.sr")
    public static short field863 = 32767;

    @ObfuscatedName("client.sm")
    public static int field767 = 0;

    @ObfuscatedName("client.sx")
    public static int field865 = 0;

    @ObfuscatedName("client.sn")
    public static int field866 = 0;

    @ObfuscatedName("client.sb")
    public static int field603 = 0;

    @ObfuscatedName("client.sw")
    public static int field681 = 0;

    @ObfuscatedName("client.sv")
    public static class223 field808 = new class223();

    @ObfuscatedName("client.sq")
    public static int field872 = -1;

    @ObfuscatedName("client.sj")
    public static int field714 = -1;

    @ObfuscatedName("client.st")
    public static class354 field609 = new class352();

    @ObfuscatedName("client.sk")
    public static class262[] field873 = new class262[8];

    @ObfuscatedName("client.so")
    public static class75 field773 = new class75();

    @ObfuscatedName("client.tn")
    public static int field624 = -1;

    @ObfuscatedName("client.ts")
    public static ArrayList field757 = new ArrayList(10);

    @ObfuscatedName("client.tj")
    public static int field877 = 0;

    @ObfuscatedName("client.ti")
    public static int field741 = 0;

    @ObfuscatedName("client.tt")
    public static final class74 field879 = new class74();

    @ObfuscatedName("client.td")
    public static int[] field880 = new int[50];

    @ObfuscatedName("client.tq")
    public static int[] field727 = new int[50];

    @ObfuscatedName("cd.eh(B)Lmr;")
    public static class356 method1900() {
        return Statics.field1411;
    }

    @ObfuscatedName("client.av(I)V")
    public final void method401() {
    }

    public final void init() {
        if (!this.method379()) {
            return;
        }
        for (int var1 = 0; var1 <= 20; var1++) {
            String var2 = this.getParameter(Integer.toString(var1));
            if (var2 != null) {
                switch(var1) {
                    case 1:
                        field653 = Integer.parseInt(var2) != 0;
                    case 2:
                    case 11:
                    case 13:
                    case 16:
                    default:
                        break;
                    case 3:
                        if (var2.equalsIgnoreCase(class106.field1330)) {
                            field599 = true;
                        } else {
                            field599 = false;
                        }
                        break;
                    case 4:
                        if (field619 == -1) {
                            field619 = Integer.parseInt(var2);
                        }
                        break;
                    case 5:
                        field601 = Integer.parseInt(var2);
                        break;
                    case 6:
                        Statics.field242 = class268.method4132(Integer.parseInt(var2));
                        break;
                    case 7:
                        Statics.field3813 = class241.method2834(Integer.parseInt(var2));
                        break;
                    case 8:
                        if (var2.equalsIgnoreCase(class106.field1330)) {
                        }
                        break;
                    case 9:
                        Statics.field5 = var2;
                        break;
                    case 10:
                        class242[] var3 = new class242[] { class242.field2888, class242.field2886, class242.field2887, class242.field2883, class242.field2885, class242.field2884 };
                        Statics.field209 = (class242) class267.method2139(var3, Integer.parseInt(var2));
                        if (Statics.field209 == class242.field2885) {
                            Statics.field3841 = class364.field4091;
                        } else {
                            Statics.field3841 = class364.field4087;
                        }
                        break;
                    case 12:
                        field600 = Integer.parseInt(var2);
                        break;
                    case 14:
                        Statics.field2003 = Integer.parseInt(var2);
                        break;
                    case 15:
                        field786 = Integer.parseInt(var2);
                        break;
                    case 17:
                        Statics.field2910 = var2;
                }
            }
        }
        class176.field1950 = false;
        field604 = false;
        Statics.field2541 = this.getCodeBase().getHost();
        String var4 = Statics.field3813.field2878;
        byte var5 = 0;
        try {
            class129.method2338("oldschool", var4, var5, 21);
        } catch (Exception var7) {
            class405.method3718((String) null, var7);
        }
        Statics.field75 = this;
        Statics.field4290 = field619;
        if (field606 == -1) {
            field606 = 0;
        }
        this.method377(765, 503, 195);
    }

    @ObfuscatedName("client.aq(I)V")
    public final void method367() {
        class307.method13(new int[] { 20, 260, 10000 }, new int[] { 1000, 100, 500 });
        Statics.field1335 = field786 == 0 ? 43594 : field600 + 40000;
        Statics.field2796 = field786 == 0 ? 443 : field600 + 50000;
        Statics.field40 = Statics.field1335;
        Statics.field2602 = class224.field2610;
        Statics.field1087 = class224.field2609;
        Statics.field1754 = class224.field2612;
        Statics.field2597 = class224.field2611;
        Statics.field222 = new class113();
        this.method471();
        this.method372();
        Statics.field68 = this.method503();
        Statics.field3830 = new class332(255, class129.field1479, class129.field1484, 500000);
        class366 var1 = null;
        class103 var2 = new class103();
        try {
            var1 = class129.method162("", Statics.field209.field2889, false);
            byte[] var3 = new byte[(int) var1.method5695()];
            int var5;
            for (int var4 = 0; var4 < var3.length; var4 += var5) {
                var5 = var1.method5671(var3, var4, var3.length - var4);
                if (var5 == -1) {
                    throw new IOException();
                }
            }
            var2 = new class103(new class382(var3));
        } catch (Exception var12) {
        }
        try {
            if (var1 != null) {
                var1.method5674();
            }
        } catch (Exception var11) {
        }
        Statics.field988 = var2;
        this.method369();
        String var10 = Statics.field277;
        class45.field294 = this;
        if (var10 != null) {
            class45.field295 = var10;
        }
        if (field786 != 0) {
            field830 = true;
        }
        method2921(Statics.field988.field1306);
        Statics.field118 = new class77(Statics.field3841);
    }

    @ObfuscatedName("client.at(B)V")
    public final void method392() {
        field611++;
        this.method981();
        while (true) {
            class272 var1 = class250.field3239;
            class249 var2;
            synchronized (class250.field3239) {
                var2 = (class249) class250.field3243.method4158();
            }
            if (var2 == null) {
                try {
                    if (class211.field2483 == 1) {
                        int var4 = Statics.field2486.method3522();
                        if (var4 > 0 && Statics.field2486.method3448()) {
                            int var5 = var4 - Statics.field14;
                            if (var5 < 0) {
                                var5 = 0;
                            }
                            Statics.field2486.method3449(var5);
                        } else {
                            Statics.field2486.method3453();
                            Statics.field2486.method3533();
                            if (Statics.field2484 == null) {
                                class211.field2483 = 0;
                            } else {
                                class211.field2483 = 2;
                            }
                            Statics.field2179 = null;
                            Statics.field2480 = null;
                        }
                    }
                } catch (Exception var13) {
                    var13.printStackTrace();
                    Statics.field2486.method3453();
                    class211.field2483 = 0;
                    Statics.field2179 = null;
                    Statics.field2480 = null;
                    Statics.field2484 = null;
                }
                method3342();
                class39.method2385();
                class48.method3873();
                if (Statics.field68 != null) {
                    int var7 = Statics.field68.method267();
                    field805 = var7;
                }
                if (field755 == 0) {
                    method245();
                    Statics.field512.method2208();
                    for (int var8 = 0; var8 < 32; var8++) {
                        field331[var8] = 0L;
                    }
                    for (int var9 = 0; var9 < 32; var9++) {
                        field314[var9] = 0L;
                    }
                    Statics.field2807 = 0;
                } else if (field755 == 5) {
                    class84.method2150(this);
                    method245();
                    Statics.field512.method2208();
                    for (int var10 = 0; var10 < 32; var10++) {
                        field331[var10] = 0L;
                    }
                    for (int var11 = 0; var11 < 32; var11++) {
                        field314[var11] = 0L;
                    }
                    Statics.field2807 = 0;
                } else if (field755 == 10 || field755 == 11) {
                    class84.method2150(this);
                } else if (field755 == 20) {
                    class84.method2150(this);
                    this.method1151();
                } else if (field755 == 25) {
                    method2054();
                }
                if (field755 == 30) {
                    this.method989();
                } else if (field755 == 40 || field755 == 45) {
                    this.method1151();
                }
                return;
            }
            var2.field3237.method3894(var2.field3235, (int) var2.field3941, var2.field3234, false);
        }
    }

    @ObfuscatedName("client.aj(ZI)V")
    public final void method391(boolean arg0) {
        boolean var2;
        label140: {
            try {
                if (class211.field2483 == 2) {
                    if (Statics.field2179 == null) {
                        Statics.field2179 = class216.method3647(Statics.field2484, Statics.field2004, Statics.field1744);
                        if (Statics.field2179 == null) {
                            var2 = false;
                            break label140;
                        }
                    }
                    if (Statics.field2480 == null) {
                        Statics.field2480 = new class56(Statics.field2481, Statics.field4126);
                    }
                    if (Statics.field2486.method3450(Statics.field2179, Statics.field2488, Statics.field2480, 22050)) {
                        Statics.field2486.method3473();
                        Statics.field2486.method3449(Statics.field4138);
                        Statics.field2486.method3478(Statics.field2179, Statics.field2485);
                        class211.field2483 = 0;
                        Statics.field2179 = null;
                        Statics.field2480 = null;
                        Statics.field2484 = null;
                        var2 = true;
                        break label140;
                    }
                }
            } catch (Exception var10) {
                var10.printStackTrace();
                Statics.field2486.method3453();
                class211.field2483 = 0;
                Statics.field2179 = null;
                Statics.field2480 = null;
                Statics.field2484 = null;
            }
            var2 = false;
        }
        if (var2 && field843 && Statics.field594 != null) {
            Statics.field594.method651();
        }
        if ((field755 == 10 || field755 == 20 || field755 == 30) && field820 != 0L && class379.method1540() > field820) {
            method2921(method2829());
        }
        if (arg0) {
            for (int var5 = 0; var5 < 100; var5++) {
                field812[var5] = true;
            }
        }
        if (field755 == 0) {
            this.method395(class84.field1023, class84.field993, arg0);
        } else if (field755 == 5) {
            class84.method216(Statics.field4121, Statics.field4, Statics.field122);
        } else if (field755 == 10 || field755 == 11) {
            class84.method216(Statics.field4121, Statics.field4, Statics.field122);
        } else if (field755 == 20) {
            class84.method216(Statics.field4121, Statics.field4, Statics.field122);
        } else if (field755 == 25) {
            if (field660 == 1) {
                if (field656 > field657) {
                    field657 = field656;
                }
                int var6 = (field657 * 50 - field656 * 50) / field657;
                method33(class246.field2990 + class106.field1320 + class106.field1323 + var6 + "%" + class106.field1324, false);
            } else if (field660 == 2) {
                if (field658 > field753) {
                    field753 = field658;
                }
                int var7 = (field753 * 50 - field658 * 50) / field753 + 50;
                method33(class246.field2990 + class106.field1320 + class106.field1323 + var7 + "%" + class106.field1324, false);
            } else {
                method33(class246.field2990, false);
            }
        } else if (field755 == 30) {
            this.method991();
        } else if (field755 == 40) {
            method33(class246.field2924 + class106.field1320 + class246.field2925, false);
        } else if (field755 == 45) {
            method33(class246.field3074, false);
        }
        if (field755 == 30 && field613 == 0 && !arg0 && !field819) {
            for (int var8 = 0; var8 < field810; var8++) {
                if (field813[var8]) {
                    Statics.field330.method349(field677[var8], field672[var8], field817[var8], field818[var8]);
                    field813[var8] = false;
                }
            }
        } else if (field755 > 0) {
            Statics.field330.method355(0, 0);
            for (int var9 = 0; var9 < field810; var9++) {
                field813[var9] = false;
            }
        }
    }

    @ObfuscatedName("client.aw(B)V")
    public final void method394() {
        if (Statics.field2038.method2013()) {
            Statics.field2038.method2011();
        }
        if (Statics.field3360 != null) {
            Statics.field3360.field1164 = false;
        }
        Statics.field3360 = null;
        field649.method2086();
        if (class39.field270 != null) {
            class39 var1 = class39.field270;
            synchronized (class39.field270) {
                class39.field270 = null;
            }
        }
        class48.method2355();
        Statics.field68 = null;
        if (Statics.field594 != null) {
            Statics.field594.method633();
        }
        if (Statics.field291 != null) {
            Statics.field291.method633();
        }
        class254.method3847();
        Object var3 = class250.field3241;
        synchronized (class250.field3241) {
            if (class250.field3240 != 0) {
                class250.field3240 = 1;
                try {
                    class250.field3241.wait();
                } catch (InterruptedException var6) {
                }
            }
        }
        if (Statics.field222 != null) {
            Statics.field222.method2108();
            Statics.field222 = null;
        }
        class129.method170();
    }

    @ObfuscatedName("z.eu(II)V")
    public static void method184(int arg0) {
        if (field755 == arg0) {
            return;
        }
        if (field755 == 0) {
            Statics.field75.method418();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field770 = 0;
            field634 = 0;
            field635 = 0;
            field858.method4998(arg0);
            if (arg0 != 20) {
                method5199(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field687 != null) {
            Statics.field687.method2268();
            Statics.field687 = null;
        }
        if (field755 == 25) {
            field660 = 0;
            field656 = 0;
            field657 = 1;
            field658 = 0;
            field753 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class84.method1537(Statics.field4128, Statics.field423, true, 0);
        } else if (arg0 == 20) {
            class84.method1537(Statics.field4128, Statics.field423, true, field755 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class84.method1537(Statics.field4128, Statics.field423, false, 4);
        } else if (Statics.field45) {
            Statics.field1344 = null;
            Statics.field950 = null;
            Statics.field1002 = null;
            Statics.field882 = null;
            Statics.field3242 = null;
            Statics.field1464 = null;
            Statics.field4134 = null;
            Statics.field1348 = null;
            Statics.field1930 = null;
            Statics.field1871 = null;
            Statics.field3764 = null;
            Statics.field51 = null;
            Statics.field116 = null;
            Statics.field2901 = null;
            Statics.field989.method1920();
            class211.method2082(2);
            class254.method3871(true);
            Statics.field45 = false;
        }
        field755 = arg0;
    }

    @ObfuscatedName("client.en(I)V")
    public void method981() {
        if (field755 != 1000) {
            boolean var1 = class254.method2773();
            if (!var1) {
                this.method1178();
            }
        }
    }

    @ObfuscatedName("client.eq(I)V")
    public void method1178() {
        if (class254.field3301 >= 4) {
            this.method397("js5crc");
            field755 = 1000;
            return;
        }
        if (class254.field3302 >= 4) {
            if (field755 <= 5) {
                this.method397("js5io");
                field755 = 1000;
                return;
            }
            field631 = 3000;
            class254.field3302 = 3;
        }
        if (--field631 + 1 > 0) {
            return;
        }
        try {
            if (field630 == 0) {
                Statics.field591 = Statics.field308.method2219(Statics.field2541, Statics.field40);
                field630++;
            }
            if (field630 == 1) {
                if (Statics.field591.field1515 == 2) {
                    this.method987(-1);
                    return;
                }
                if (Statics.field591.field1515 == 1) {
                    field630++;
                }
            }
            if (field630 == 2) {
                if (field653) {
                    Statics.field252 = class328.method3420((Socket) Statics.field591.field1519, 40000, 5000);
                } else {
                    Statics.field252 = new class132((Socket) Statics.field591.field1519, Statics.field308, 5000);
                }
                class382 var1 = new class382(5);
                var1.method5839(15);
                var1.method5842(195);
                Statics.field252.method2265(var1.field4153, 0, 5);
                field630++;
                Statics.field2349 = class379.method1540();
            }
            if (field630 == 3) {
                if (Statics.field252.method2261() > 0 || !field653 && field755 <= 5) {
                    int var2 = Statics.field252.method2260();
                    if (var2 != 0) {
                        this.method987(var2);
                        return;
                    }
                    field630++;
                } else if (class379.method1540() - Statics.field2349 > 30000L) {
                    this.method987(-2);
                    return;
                }
            }
            if (field630 == 4) {
                class328 var3 = Statics.field252;
                boolean var4 = field755 > 20;
                if (Statics.field3759 != null) {
                    try {
                        Statics.field3759.method2268();
                    } catch (Exception var14) {
                    }
                    Statics.field3759 = null;
                }
                Statics.field3759 = var3;
                class254.method3871(var4);
                class254.field3295.field4155 = 0;
                Statics.field2464 = null;
                Statics.field1144 = null;
                class254.field3296 = 0;
                while (true) {
                    class252 var6 = (class252) class254.field3289.method5641();
                    if (var6 == null) {
                        while (true) {
                            class252 var7 = (class252) class254.field3300.method5641();
                            if (var7 == null) {
                                if (class254.field3288 != 0) {
                                    try {
                                        class382 var8 = new class382(4);
                                        var8.method5839(4);
                                        var8.method5839(class254.field3288);
                                        var8.method5853(0);
                                        Statics.field3759.method2265(var8.field4153, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field3759.method2268();
                                        } catch (Exception var12) {
                                        }
                                        class254.field3302++;
                                        Statics.field3759 = null;
                                    }
                                }
                                class254.field3291 = 0;
                                Statics.field3285 = class379.method1540();
                                Statics.field591 = null;
                                Statics.field252 = null;
                                field630 = 0;
                                field881 = 0;
                                return;
                            }
                            class254.field3290.method4144(var7);
                            class254.field3294.method5640(var7, var7.field3941);
                            class254.field3292++;
                            class254.field3297--;
                        }
                    }
                    class254.field3286.method5640(var6, var6.field3941);
                    class254.field3287++;
                    class254.field3293--;
                }
            }
        } catch (IOException var15) {
            this.method987(-3);
        }
    }

    @ObfuscatedName("client.ew(II)V")
    public void method987(int arg0) {
        Statics.field591 = null;
        Statics.field252 = null;
        field630 = 0;
        if (Statics.field40 == Statics.field1335) {
            Statics.field40 = Statics.field2796;
        } else {
            Statics.field40 = Statics.field1335;
        }
        field881++;
        if (field881 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field755 <= 5) {
                this.method397("js5connect_full");
                field755 = 1000;
            } else {
                field631 = 3000;
            }
        } else if (field881 >= 2 && arg0 == 6) {
            this.method397("js5connect_outofdate");
            field755 = 1000;
        } else if (field881 >= 4) {
            if (field755 <= 5) {
                this.method397("js5connect");
                field755 = 1000;
            } else {
                field631 = 3000;
            }
        }
    }

    @ObfuscatedName("hy.ez(Lig;Ljava/lang/String;I)V")
    public static void method3834(class251 arg0, String arg1) {
        class92 var2 = new class92(arg0, arg1);
        field757.add(var2);
        field741 += var2.field1111;
    }

    @ObfuscatedName("p.ef(I)Z")
    public static boolean method54() {
        if (field757 == null || field877 >= field757.size()) {
            return true;
        }
        while (field877 < field757.size()) {
            class92 var0 = (class92) field757.get(field877);
            if (!var0.method1810()) {
                return false;
            }
            field877++;
        }
        return true;
    }

    @ObfuscatedName("w.ev(I)I")
    public static int method196() {
        if (field757 == null || field877 >= field757.size()) {
            return 10000;
        }
        int var0 = 0;
        for (int var1 = 0; var1 <= field877; var1++) {
            var0 += ((class92) field757.get(var1)).field1112;
        }
        return var0 * 10000 / field741;
    }

    @ObfuscatedName("fo.er(II)I")
    public static int method2736(int arg0) {
        return arg0 * 3 + 600;
    }

    @ObfuscatedName("ap.ex(I)V")
    public static void method245() {
        if (field629 == 0) {
            Statics.field1599 = new class176(4, 104, 104, class90.field1090);
            for (int var0 = 0; var0 < 4; var0++) {
                field661[var0] = new class136(104, 104);
            }
            Statics.field149 = new class395(512, 512);
            class84.field993 = class246.field3196;
            class84.field1023 = 5;
            field629 = 20;
        } else if (field629 == 20) {
            class84.field993 = class246.field2927;
            class84.field1023 = 10;
            field629 = 30;
        } else if (field629 == 30) {
            Statics.field3855 = method4559(0, false, true, true);
            Statics.field4115 = method4559(1, false, true, true);
            Statics.field2847 = method4559(2, true, false, true);
            Statics.field46 = method4559(3, false, true, true);
            Statics.field1121 = method4559(4, false, true, true);
            Statics.field1735 = method4559(5, true, true, true);
            Statics.field62 = method4559(6, true, true, true);
            Statics.field113 = method4559(7, false, true, true);
            Statics.field423 = method4559(8, false, true, true);
            Statics.field1690 = method4559(9, false, true, true);
            Statics.field4128 = method4559(10, false, true, true);
            Statics.field72 = method4559(11, false, true, true);
            Statics.field1449 = method4559(12, false, true, true);
            Statics.field1508 = method4559(13, true, false, true);
            Statics.field1682 = method4559(14, false, true, true);
            Statics.field3854 = method4559(15, false, true, true);
            Statics.field8 = method4559(17, true, true, true);
            Statics.field3220 = method4559(18, false, true, true);
            Statics.field3457 = method4559(19, false, true, true);
            Statics.field3512 = method4559(20, false, true, true);
            class84.field993 = class246.field2928;
            class84.field1023 = 20;
            field629 = 40;
        } else if (field629 == 40) {
            byte var1 = 0;
            int var2 = var1 + Statics.field3855.method3889() * 4 / 100;
            int var3 = var2 + Statics.field4115.method3889() * 4 / 100;
            int var4 = var3 + Statics.field2847.method3889() * 2 / 100;
            int var5 = var4 + Statics.field46.method3889() * 2 / 100;
            int var6 = var5 + Statics.field1121.method3889() * 6 / 100;
            int var7 = var6 + Statics.field1735.method3889() * 4 / 100;
            int var8 = var7 + Statics.field62.method3889() * 2 / 100;
            int var9 = var8 + Statics.field113.method3889() * 56 / 100;
            int var10 = var9 + Statics.field423.method3889() * 2 / 100;
            int var11 = var10 + Statics.field1690.method3889() * 2 / 100;
            int var12 = var11 + Statics.field4128.method3889() * 2 / 100;
            int var13 = var12 + Statics.field72.method3889() * 2 / 100;
            int var14 = var13 + Statics.field1449.method3889() * 2 / 100;
            int var15 = var14 + Statics.field1508.method3889() * 2 / 100;
            int var16 = var15 + Statics.field1682.method3889() * 2 / 100;
            int var17 = var16 + Statics.field3854.method3889() * 2 / 100;
            int var18 = var17 + Statics.field3457.method3889() / 100;
            int var19 = var18 + Statics.field3220.method3889() / 100;
            int var20 = var19 + Statics.field3512.method3889() / 100;
            int var21 = var20 + (Statics.field8.method3888() && Statics.field8.method3954() ? 1 : 0);
            if (var21 == 100) {
                method3834(Statics.field3855, "Animations");
                method3834(Statics.field4115, "Skeletons");
                method3834(Statics.field1121, "Sound FX");
                method3834(Statics.field1735, "Maps");
                method3834(Statics.field62, "Music Tracks");
                method3834(Statics.field113, "Models");
                method3834(Statics.field423, "Sprites");
                method3834(Statics.field72, "Music Jingles");
                method3834(Statics.field1682, "Music Samples");
                method3834(Statics.field3854, "Music Patches");
                method3834(Statics.field3457, "World Map");
                method3834(Statics.field3220, "World Map Geography");
                method3834(Statics.field3512, "World Map Ground");
                Statics.field224 = new class335();
                Statics.field224.method5282(Statics.field8);
                class84.field993 = class246.field2930;
                class84.field1023 = 30;
                field629 = 45;
            } else {
                if (var21 != 0) {
                    class84.field993 = class246.field2929 + var21 + "%";
                }
                class84.field1023 = 30;
            }
        } else if (field629 == 45) {
            boolean var22 = !field604;
            Statics.field395 = 22050;
            Statics.field388 = var22;
            Statics.field2008 = 2;
            class212 var23 = new class212();
            var23.method3455(9, 128);
            Statics.field594 = class53.method48(Statics.field308, 0, 22050);
            Statics.field594.method645(var23);
            class251 var24 = Statics.field3854;
            class251 var25 = Statics.field1682;
            class251 var26 = Statics.field1121;
            Statics.field2488 = var24;
            Statics.field4126 = var25;
            Statics.field2481 = var26;
            Statics.field2486 = var23;
            Statics.field291 = class53.method48(Statics.field308, 1, 2048);
            Statics.field2784 = new class49();
            Statics.field291.method645(Statics.field2784);
            Statics.field235 = new class66(22050, Statics.field395);
            class84.field993 = class246.field3194;
            class84.field1023 = 35;
            field629 = 50;
            Statics.field2904 = new class357(Statics.field423, Statics.field1508);
        } else if (field629 == 50) {
            class358[] var27 = new class358[] { class358.field4059, class358.field4065, class358.field4061, class358.field4062, class358.field4057, class358.field4056 };
            int var28 = var27.length;
            class357 var29 = Statics.field2904;
            class358[] var30 = new class358[] { class358.field4059, class358.field4065, class358.field4061, class358.field4062, class358.field4057, class358.field4056 };
            field864 = var29.method5606(var30);
            if (field864.size() < var28) {
                class84.field993 = class246.field2932 + field864.size() * 100 / var28 + "%";
                class84.field1023 = 40;
            } else {
                Statics.field4 = (class299) field864.get(class358.field4057);
                Statics.field122 = (class299) field864.get(class358.field4065);
                Statics.field4121 = (class299) field864.get(class358.field4062);
                Statics.field1417 = field609.method5373();
                class84.field993 = class246.field2933;
                class84.field1023 = 40;
                field629 = 60;
            }
        } else if (field629 == 60) {
            class251 var31 = Statics.field4128;
            class251 var32 = Statics.field423;
            int var33 = 0;
            if (var31.method4000("title.jpg", "")) {
                var33++;
            }
            if (var32.method4000("logo", "")) {
                var33++;
            }
            if (var32.method4000("logo_deadman_mode", "")) {
                var33++;
            }
            if (var32.method4000("logo_seasonal_mode", "")) {
                var33++;
            }
            if (var32.method4000("titlebox", "")) {
                var33++;
            }
            if (var32.method4000("titlebutton", "")) {
                var33++;
            }
            if (var32.method4000("runes", "")) {
                var33++;
            }
            if (var32.method4000("title_mute", "")) {
                var33++;
            }
            if (var32.method4000("options_radio_buttons,0", "")) {
                var33++;
            }
            if (var32.method4000("options_radio_buttons,2", "")) {
                var33++;
            }
            if (var32.method4000("options_radio_buttons,4", "")) {
                var33++;
            }
            if (var32.method4000("options_radio_buttons,6", "")) {
                var33++;
            }
            var32.method4000("sl_back", "");
            var32.method4000("sl_flags", "");
            var32.method4000("sl_arrows", "");
            var32.method4000("sl_stars", "");
            var32.method4000("sl_button", "");
            int var36 = class84.method3832();
            if (var33 < var36) {
                class84.field993 = class246.field2934 + var33 * 100 / var36 + "%";
                class84.field1023 = 50;
            } else {
                class84.field993 = class246.field2935;
                class84.field1023 = 50;
                method184(5);
                field629 = 70;
            }
        } else if (field629 == 70) {
            if (Statics.field2847.method3954()) {
                class251 var37 = Statics.field2847;
                Statics.field3707 = var37;
                class290.method14(Statics.field2847);
                class251 var38 = Statics.field2847;
                class251 var39 = Statics.field113;
                Statics.field3438 = var38;
                Statics.field3346 = var39;
                Statics.field3432 = Statics.field3438.method3944(3);
                class251 var40 = Statics.field2847;
                class251 var41 = Statics.field113;
                boolean var42 = field604;
                Statics.field3589 = var40;
                Statics.field3625 = var41;
                class295.field3637 = var42;
                class287.method877(Statics.field2847, Statics.field113);
                class251 var43 = Statics.field2847;
                Statics.field3560 = var43;
                Statics.method1836(Statics.field2847, Statics.field113, field599, Statics.field4);
                class251 var44 = Statics.field2847;
                class251 var45 = Statics.field3855;
                class251 var46 = Statics.field4115;
                Statics.field3718 = var44;
                Statics.field595 = var45;
                Statics.field3709 = var46;
                class251 var47 = Statics.field2847;
                class251 var48 = Statics.field113;
                Statics.field3536 = var47;
                Statics.field3523 = var48;
                class251 var49 = Statics.field2847;
                Statics.field3547 = var49;
                class279.method2832(Statics.field2847);
                class251 var50 = Statics.field46;
                class251 var51 = Statics.field113;
                class251 var52 = Statics.field423;
                class251 var53 = Statics.field1508;
                Statics.field1842 = var50;
                Statics.field1717 = var51;
                Statics.field1408 = var52;
                Statics.field226 = var53;
                Statics.field2618 = new class225[Statics.field1842.method4002()][];
                Statics.field556 = new boolean[Statics.field1842.method4002()];
                class251 var54 = Statics.field2847;
                Statics.field3398 = var54;
                class251 var55 = Statics.field2847;
                Statics.field3462 = var55;
                class281.method4945(Statics.field2847);
                class292.method68(Statics.field2847);
                Statics.field2038 = new class110();
                class294.method2681(Statics.field2847, Statics.field423, Statics.field1508);
                class283.method3338(Statics.field2847, Statics.field423);
                class280.method166(Statics.field2847, Statics.field423);
                class84.field993 = class246.field2976;
                class84.field1023 = 60;
                field629 = 80;
            } else {
                class84.field993 = class246.field3157 + Statics.field2847.method3899() + "%";
                class84.field1023 = 60;
            }
        } else if (field629 == 80) {
            int var56 = 0;
            if (Statics.field175 == null) {
                Statics.field175 = class396.method3341(Statics.field423, Statics.field224.field3906, 0);
            } else {
                var56++;
            }
            if (Statics.field221 == null) {
                Statics.field221 = class396.method3341(Statics.field423, Statics.field224.field3899, 0);
            } else {
                var56++;
            }
            if (Statics.field144 == null) {
                Statics.field144 = class396.method5022(Statics.field423, Statics.field224.field3905, 0);
            } else {
                var56++;
            }
            if (Statics.field1119 == null) {
                Statics.field1119 = class396.method5314(Statics.field423, Statics.field224.field3901, 0);
            } else {
                var56++;
            }
            if (Statics.field3245 == null) {
                Statics.field3245 = class396.method5314(Statics.field423, Statics.field224.field3902, 0);
            } else {
                var56++;
            }
            if (Statics.field1069 == null) {
                Statics.field1069 = class396.method5314(Statics.field423, Statics.field224.field3898, 0);
            } else {
                var56++;
            }
            if (Statics.field124 == null) {
                Statics.field124 = class396.method5314(Statics.field423, Statics.field224.field3904, 0);
            } else {
                var56++;
            }
            if (Statics.field145 == null) {
                Statics.field145 = class396.method5314(Statics.field423, Statics.field224.field3908, 0);
            } else {
                var56++;
            }
            if (Statics.field2911 == null) {
                Statics.field2911 = class396.method5314(Statics.field423, Statics.field224.field3903, 0);
            } else {
                var56++;
            }
            if (Statics.field3511 == null) {
                Statics.field3511 = class396.method5022(Statics.field423, Statics.field224.field3907, 0);
            } else {
                var56++;
            }
            if (Statics.field1135 == null) {
                Statics.field1135 = class396.method5022(Statics.field423, Statics.field224.field3900, 0);
            } else {
                var56++;
            }
            if (var56 < 11) {
                class84.field993 = class246.field3075 + var56 * 100 / 12 + "%";
                class84.field1023 = 70;
            } else {
                Statics.field3735 = Statics.field1135;
                Statics.field221.method6231();
                int var57 = (int) (Math.random() * 21.0D) - 10;
                int var58 = (int) (Math.random() * 21.0D) - 10;
                int var59 = (int) (Math.random() * 21.0D) - 10;
                int var60 = (int) (Math.random() * 41.0D) - 20;
                Statics.field144[0].method6217(var57 + var60, var58 + var60, var59 + var60);
                class84.field993 = class246.field3046;
                class84.field1023 = 70;
                field629 = 90;
            }
        } else if (field629 == 90) {
            if (Statics.field1690.method3954()) {
                Statics.field3833 = new class181(Statics.field1690, Statics.field423, 20, Statics.field988.field1305, field604 ? 64 : 128);
                class174.method2968(Statics.field3833);
                class174.method2946(Statics.field988.field1305);
                field629 = 100;
            } else {
                class84.field993 = class246.field2940 + "0%";
                class84.field1023 = 90;
            }
        } else if (field629 == 100) {
            int var61 = Statics.field3833.method3202();
            if (var61 < 100) {
                class84.field993 = class246.field2940 + var61 + "%";
                class84.field1023 = 90;
            } else {
                class84.field993 = class246.field3147;
                class84.field1023 = 90;
                field629 = 110;
            }
        } else if (field629 == 110) {
            Statics.field3360 = new class97();
            Statics.field308.method2223(Statics.field3360, 10);
            class84.field993 = class246.field2942;
            class84.field1023 = 92;
            field629 = 120;
        } else if (field629 == 120) {
            if (Statics.field4128.method4000("huffman", "")) {
                class227 var62 = new class227(Statics.field4128.method3953("huffman", ""));
                class228.method3403(var62);
                class84.field993 = class246.field2944;
                class84.field1023 = 94;
                field629 = 130;
            } else {
                class84.field993 = class246.field2943 + "%";
                class84.field1023 = 94;
            }
        } else if (field629 == 130) {
            if (!Statics.field46.method3954()) {
                class84.field993 = class246.field2945 + Statics.field46.method3899() * 4 / 5 + "%";
                class84.field1023 = 96;
            } else if (!Statics.field1449.method3954()) {
                class84.field993 = class246.field2945 + (80 + Statics.field1449.method3899() / 6) + "%";
                class84.field1023 = 96;
            } else if (Statics.field1508.method3954()) {
                class84.field993 = class246.field2953;
                class84.field1023 = 98;
                field629 = 140;
            } else {
                class84.field993 = class246.field2945 + (96 + Statics.field1508.method3899() / 50) + "%";
                class84.field1023 = 96;
            }
        } else if (field629 == 140) {
            class84.field1023 = 100;
            if (Statics.field3457.method3931(class163.field1769.field1767)) {
                if (Statics.field1411 == null) {
                    Statics.field1411 = new class356();
                    Statics.field1411.method5399(Statics.field3457, Statics.field3220, Statics.field3512, Statics.field4121, field864, Statics.field144);
                }
                class84.field993 = class246.field2948;
                field629 = 150;
            } else {
                class84.field993 = class246.field2947 + Statics.field3457.method3957(class163.field1769.field1767) / 10 + "%";
            }
        } else if (field629 == 150) {
            method184(10);
        }
    }

    @ObfuscatedName("kt.ed(IZZZB)Lig;")
    public static class251 method4559(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class332 var4 = null;
        if (class129.field1479 != null) {
            var4 = new class332(arg0, class129.field1479, Statics.field1201[arg0], 1000000);
        }
        return new class251(var4, Statics.field3830, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.ee(B)V")
    public final void method1151() {
        class328 var1 = field649.method2088();
        class381 var2 = field649.field1386;
        try {
            if (field770 == 0) {
                if (Statics.field282 == null && (field639.method1722() || field634 > 250)) {
                    Statics.field282 = field639.method1731();
                    field639.method1721();
                    field639 = null;
                }
                if (Statics.field282 != null) {
                    if (var1 != null) {
                        var1.method2268();
                        var1 = null;
                    }
                    Statics.field719 = null;
                    field738 = false;
                    field634 = 0;
                    field770 = 1;
                }
            }
            if (field770 == 1) {
                if (Statics.field719 == null) {
                    Statics.field719 = Statics.field308.method2219(Statics.field2541, Statics.field40);
                }
                if (Statics.field719.field1515 == 2) {
                    throw new IOException();
                }
                if (Statics.field719.field1515 == 1) {
                    if (field653) {
                        var1 = class328.method3420((Socket) Statics.field719.field1519, 40000, 5000);
                    } else {
                        var1 = new class132((Socket) Statics.field719.field1519, Statics.field308, 5000);
                    }
                    field649.method2101(var1);
                    Statics.field719 = null;
                    field770 = 2;
                }
            }
            if (field770 == 2) {
                field649.method2085();
                class205 var3 = class205.method69();
                var3.field2342.method5839(class207.field2457.field2456);
                field649.method2099(var3);
                field649.method2084();
                var2.field4155 = 0;
                field770 = 3;
            }
            if (field770 == 3) {
                if (Statics.field594 != null) {
                    Statics.field594.method631();
                }
                if (Statics.field291 != null) {
                    Statics.field291.method631();
                }
                boolean var4 = true;
                if (field653 && !var1.method2262(1)) {
                    var4 = false;
                }
                if (var4) {
                    int var5 = var1.method2260();
                    if (Statics.field594 != null) {
                        Statics.field594.method631();
                    }
                    if (Statics.field291 != null) {
                        Statics.field291.method631();
                    }
                    if (var5 != 0) {
                        method2060(var5);
                        return;
                    }
                    var2.field4155 = 0;
                    field770 = 4;
                }
            }
            if (field770 == 4) {
                if (var2.field4155 < 8) {
                    int var6 = var1.method2261();
                    if (var6 > 8 - var2.field4155) {
                        var6 = 8 - var2.field4155;
                    }
                    if (var6 > 0) {
                        var1.method2291(var2.field4153, var2.field4155, var6);
                        var2.field4155 += var6;
                    }
                }
                if (var2.field4155 == 8) {
                    var2.field4155 = 0;
                    Statics.field1278 = var2.method6069();
                    field770 = 5;
                }
            }
            if (field770 == 5) {
                field649.field1386.field4155 = 0;
                field649.method2085();
                class381 var7 = new class381(500);
                int[] var8 = new int[] { Statics.field282.nextInt(), Statics.field282.nextInt(), Statics.field282.nextInt(), Statics.field282.nextInt() };
                var7.field4155 = 0;
                var7.method5839(1);
                var7.method5842(var8[0]);
                var7.method5842(var8[1]);
                var7.method5842(var8[2]);
                var7.method5842(var8[3]);
                var7.method5870(Statics.field1278);
                if (field755 == 40) {
                    var7.method5842(Statics.field2804[0]);
                    var7.method5842(Statics.field2804[1]);
                    var7.method5842(Statics.field2804[2]);
                    var7.method5842(Statics.field2804[3]);
                } else {
                    var7.method5839(field637.method240());
                    switch(field637.field1461) {
                        case 0:
                        case 3:
                            var7.method5841(Statics.field1561);
                            var7.field4155++;
                            break;
                        case 1:
                            LinkedHashMap var10 = Statics.field988.field1309;
                            String var11 = class84.field1001;
                            int var12 = var11.length();
                            int var13 = 0;
                            for (int var14 = 0; var14 < var12; var14++) {
                                var13 = (var13 << 5) - var13 + var11.charAt(var14);
                            }
                            var7.method5842((Integer) var10.get(var13));
                            break;
                        case 2:
                            var7.field4155 += 4;
                    }
                    var7.method5839(class386.field4205.method240());
                    var7.method6016(class84.field1016);
                }
                var7.method5961(class83.field984, class83.field983);
                Statics.field2804 = var8;
                class205 var16 = class205.method69();
                var16.field2342.field4155 = 0;
                if (field755 == 40) {
                    var16.field2342.method5839(class207.field2453.field2456);
                } else {
                    var16.field2342.method5839(class207.field2452.field2456);
                }
                var16.field2342.method5853(0);
                int var17 = var16.field2342.field4155;
                var16.field2342.method5842(195);
                var16.field2342.method5842(1);
                var16.field2342.method5839(field619);
                var16.field2342.method5839(field606);
                var16.field2342.method5849(var7.field4153, 0, var7.field4155);
                int var18 = var16.field2342.field4155;
                var16.field2342.method6016(class84.field1001);
                var16.field2342.method5839((field819 ? 1 : 0) << 1 | (field604 ? 1 : 0));
                var16.field2342.method5853(Statics.field1143);
                var16.field2342.method5853(Statics.field320);
                class381 var19 = var16.field2342;
                if (field788 == null) {
                    byte[] var20 = class129.method2920();
                    var19.method5849(var20, 0, var20.length);
                } else {
                    var19.method5849(field788, 0, field788.length);
                }
                var16.field2342.method6016(Statics.field5);
                var16.field2342.method5842(Statics.field2003);
                class382 var21 = new class382(Statics.field1417.method5382());
                Statics.field1417.method5378(var21);
                var16.field2342.method5849(var21.field4153, 0, var21.field4153.length);
                var16.field2342.method5839(field619);
                var16.field2342.method5842(0);
                var16.field2342.method6030(Statics.field1508.field3278);
                var16.field2342.method5901(Statics.field3512.field3278);
                var16.field2342.method5842(Statics.field3220.field3278);
                var16.field2342.method5842(Statics.field4128.field3278);
                var16.field2342.method6030(Statics.field62.field3278);
                var16.field2342.method5900(Statics.field1690.field3278);
                var16.field2342.method5901(Statics.field423.field3278);
                var16.field2342.method6030(Statics.field113.field3278);
                var16.field2342.method6030(Statics.field3457.field3278);
                var16.field2342.method6030(0);
                var16.field2342.method5900(Statics.field72.field3278);
                var16.field2342.method5900(Statics.field8.field3278);
                var16.field2342.method6030(Statics.field3854.field3278);
                var16.field2342.method5900(Statics.field1449.field3278);
                var16.field2342.method5842(Statics.field4115.field3278);
                var16.field2342.method5900(Statics.field1682.field3278);
                var16.field2342.method6030(Statics.field46.field3278);
                var16.field2342.method5900(Statics.field1735.field3278);
                var16.field2342.method5901(Statics.field1121.field3278);
                var16.field2342.method5842(Statics.field3855.field3278);
                var16.field2342.method5901(Statics.field2847.field3278);
                var16.field2342.method5877(var8, var18, var16.field2342.field4155);
                var16.field2342.method5852(var16.field2342.field4155 - var17);
                field649.method2099(var16);
                field649.method2084();
                field649.field1385 = new class398(var8);
                int[] var22 = new int[4];
                for (int var23 = 0; var23 < 4; var23++) {
                    var22[var23] = var8[var23] + 50;
                }
                var2.method5800(var22);
                field770 = 6;
            }
            if (field770 == 6 && var1.method2261() > 0) {
                int var24 = var1.method2260();
                if (var24 == 21 && field755 == 20) {
                    field770 = 12;
                } else if (var24 == 2) {
                    field770 = 14;
                } else if (var24 == 15 && field755 == 40) {
                    field649.field1388 = -1;
                    field770 = 19;
                } else if (var24 == 64) {
                    field770 = 10;
                } else if (var24 == 23 && field635 < 1) {
                    field635++;
                    field770 = 0;
                } else if (var24 == 29) {
                    field770 = 17;
                } else if (var24 == 69) {
                    field770 = 7;
                } else {
                    method2060(var24);
                    return;
                }
            }
            if (field770 == 7 && var1.method2261() >= 2) {
                var1.method2291(var2.field4153, 0, 2);
                var2.field4155 = 0;
                Statics.field4118 = var2.method5858();
                field770 = 8;
            }
            if (field770 == 8 && var1.method2261() >= Statics.field4118) {
                var2.field4155 = 0;
                var1.method2291(var2.field4153, var2.field4155, Statics.field4118);
                class35[] var25 = new class35[] { class35.field237 };
                class35 var26 = var25[var2.method5856()];
                try {
                    switch(var26.field231) {
                        case 0:
                            class29 var27 = new class29();
                            this.field641 = new class36(var2, var27);
                            field770 = 9;
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                } catch (Exception var57) {
                    method2060(22);
                    return;
                }
            }
            if (field770 == 9 && this.field641.method250()) {
                this.field747 = this.field641.method249();
                this.field641.method251();
                this.field641 = null;
                if (this.field747 == null) {
                    method2060(22);
                    return;
                }
                field649.method2085();
                class205 var30 = class205.method69();
                var30.field2342.method5839(class207.field2451.field2456);
                var30.field2342.method5853(this.field747.field4155);
                var30.field2342.method5850(this.field747);
                field649.method2099(var30);
                field649.method2084();
                this.field747 = null;
                field770 = 6;
            }
            if (field770 == 10 && var1.method2261() > 0) {
                Statics.field109 = var1.method2260();
                field770 = 11;
            }
            if (field770 == 11 && var1.method2261() >= Statics.field109) {
                var1.method2291(var2.field4153, 0, Statics.field109);
                var2.field4155 = 0;
                field770 = 6;
            }
            if (field770 == 12 && var1.method2261() > 0) {
                field636 = (var1.method2260() + 3) * 60;
                field770 = 13;
            }
            if (field770 == 13) {
                field634 = 0;
                class84.method80(class246.field2954, class246.field2955, field636 / 60 + class246.field3095);
                if (--field636 <= 0) {
                    field770 = 0;
                }
            } else {
                if (field770 == 14 && var1.method2261() >= 1) {
                    Statics.field1573 = var1.method2260();
                    field770 = 15;
                }
                if (field770 == 15 && var1.method2261() >= Statics.field1573) {
                    boolean var31 = var1.method2260() == 1;
                    var1.method2291(var2.field4153, 0, 4);
                    var2.field4155 = 0;
                    boolean var32 = false;
                    if (var31) {
                        int var33 = var2.method5803() << 24;
                        int var34 = var33 | var2.method5803() << 16;
                        int var35 = var34 | var2.method5803() << 8;
                        int var36 = var35 | var2.method5803();
                        String var37 = class84.field1001;
                        int var38 = var37.length();
                        int var39 = 0;
                        int var40 = 0;
                        while (true) {
                            if (var40 >= var38) {
                                if (Statics.field988.field1309.size() >= 10 && !Statics.field988.field1309.containsKey(var39)) {
                                    Iterator var43 = Statics.field988.field1309.entrySet().iterator();
                                    var43.next();
                                    var43.remove();
                                }
                                Statics.field988.field1309.put(var39, var36);
                                break;
                            }
                            var39 = (var39 << 5) - var39 + var37.charAt(var40);
                            var40++;
                        }
                    }
                    if (field638) {
                        Statics.field988.field1300 = class84.field1001;
                    } else {
                        Statics.field988.field1300 = null;
                    }
                    class103.method964();
                    field797 = var1.method2260();
                    field774 = var1.method2260() == 1;
                    field700 = var1.method2260();
                    field700 <<= 0x8;
                    field700 += var1.method2260();
                    field721 = var1.method2260();
                    var1.method2291(var2.field4153, 0, 1);
                    var2.field4155 = 0;
                    class206[] var44 = class206.method2836();
                    int var45 = var2.method5826();
                    if (var45 < 0 || var45 >= var44.length) {
                        throw new IOException(var45 + " " + var2.field4155);
                    }
                    field649.field1387 = var44[var45];
                    field649.field1388 = field649.field1387.field2421;
                    var1.method2291(var2.field4153, 0, 2);
                    var2.field4155 = 0;
                    field649.field1388 = var2.method5858();
                    try {
                        class43.method333(Statics.field75, "zap");
                    } catch (Throwable var56) {
                    }
                    field770 = 16;
                }
                if (field770 != 16) {
                    if (field770 == 17 && var1.method2261() >= 2) {
                        var2.field4155 = 0;
                        var1.method2291(var2.field4153, 0, 2);
                        var2.field4155 = 0;
                        Statics.field64 = var2.method5858();
                        field770 = 18;
                    }
                    if (field770 == 18 && var1.method2261() >= Statics.field64) {
                        var2.field4155 = 0;
                        var1.method2291(var2.field4153, 0, Statics.field64);
                        var2.field4155 = 0;
                        String var47 = var2.method5865();
                        String var48 = var2.method5865();
                        String var49 = var2.method5865();
                        class84.method80(var47, var48, var49);
                        method184(10);
                    }
                    if (field770 == 19) {
                        if (field649.field1388 == -1) {
                            if (var1.method2261() < 2) {
                                return;
                            }
                            var1.method2291(var2.field4153, 0, 2);
                            var2.field4155 = 0;
                            field649.field1388 = var2.method5858();
                        }
                        if (var1.method2261() >= field649.field1388) {
                            var1.method2291(var2.field4153, 0, field649.field1388);
                            var2.field4155 = 0;
                            int var50 = field649.field1388;
                            field858.method5001();
                            field649.method2085();
                            field649.field1386.field4155 = 0;
                            field649.field1387 = null;
                            field649.field1382 = null;
                            field649.field1393 = null;
                            field649.field1394 = null;
                            field649.field1388 = 0;
                            field649.field1392 = 0;
                            field618 = 0;
                            field740 = 0;
                            field739 = false;
                            field841 = 0;
                            field839 = 0;
                            for (int var51 = 0; var51 < 2048; var51++) {
                                field849[var51] = null;
                            }
                            Statics.field1374 = null;
                            for (int var52 = 0; var52 < field643.length; var52++) {
                                class105 var53 = field643[var52];
                                if (var53 != null) {
                                    var53.field1236 = -1;
                                    var53.field1230 = false;
                                }
                            }
                            class93.field1116 = new class361(32);
                            method184(30);
                            for (int var54 = 0; var54 < 100; var54++) {
                                field812[var54] = true;
                            }
                            method1828();
                            class109.method5699(var2);
                            if (var2.field4155 != var50) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field634++;
                        if (field634 > 2000) {
                            if (field635 < 1) {
                                if (Statics.field40 == Statics.field1335) {
                                    Statics.field40 = Statics.field2796;
                                } else {
                                    Statics.field40 = Statics.field1335;
                                }
                                field635++;
                                field770 = 0;
                            } else {
                                method2060(-3);
                            }
                        }
                    }
                } else if (var1.method2261() >= field649.field1388) {
                    var2.field4155 = 0;
                    var1.method2291(var2.field4153, 0, field649.field1388);
                    field858.method5006();
                    method4955();
                    class109.method5699(var2);
                    Statics.field1328 = -1;
                    method1986(false, var2);
                    field649.field1387 = null;
                }
            }
        } catch (IOException var58) {
            if (field635 < 1) {
                if (Statics.field40 == Statics.field1335) {
                    Statics.field40 = Statics.field2796;
                } else {
                    Statics.field40 = Statics.field1335;
                }
                field635++;
                field770 = 0;
            } else {
                method2060(-2);
            }
        }
    }

    @ObfuscatedName("kv.eo(I)V")
    public static void method4955() {
        field612 = 1L;
        Statics.field3360.field1160 = 0;
        Statics.field3314 = true;
        field616 = true;
        field679 = -1L;
        class70.field557 = new class274();
        field649.method2085();
        field649.field1386.field4155 = 0;
        field649.field1387 = null;
        field649.field1382 = null;
        field649.field1393 = null;
        field649.field1394 = null;
        field649.field1388 = 0;
        field649.field1392 = 0;
        field618 = 0;
        field651 = 0;
        field809 = 0;
        field740 = 0;
        field739 = false;
        class48.field349 = 0;
        class111.method1748();
        field756 = 0;
        field758 = false;
        field844 = 0;
        field673 = 0;
        field678 = 0;
        Statics.field1332 = null;
        field841 = 0;
        field834 = -1;
        field839 = 0;
        field840 = 0;
        field627 = class107.field1336;
        field628 = class107.field1336;
        field644 = 0;
        class109.method2234();
        for (int var0 = 0; var0 < 2048; var0++) {
            field849[var0] = null;
        }
        for (int var1 = 0; var1 < 32768; var1++) {
            field643[var1] = null;
        }
        field869 = -1;
        field733.method4154();
        field734.method4154();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    field731[var2][var3][var4] = null;
                }
            }
        }
        field732 = new class272();
        Statics.field118.method1464();
        for (int var5 = 0; var5 < Statics.field3400; var5++) {
            class279 var6 = class279.method4938(var5);
            if (var6 != null) {
                class220.field2579[var5] = 0;
                class220.field2578[var5] = 0;
            }
        }
        Statics.field2038.method2009();
        field615 = -1;
        if (field763 != -1) {
            class225.method2615(field763);
        }
        for (class95 var7 = (class95) field764.method5641(); var7 != null; var7 = (class95) field764.method5643()) {
            method2663(var7, true);
        }
        field763 = -1;
        field764 = new class361(8);
        field640 = null;
        field740 = 0;
        field739 = false;
        field808.method3704((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var8 = 0; var8 < 8; var8++) {
            field831[var8] = null;
            field816[var8] = false;
        }
        class93.field1116 = new class361(32);
        field665 = true;
        for (int var9 = 0; var9 < 100; var9++) {
            field812[var9] = true;
        }
        method1828();
        Statics.field1142 = null;
        Statics.field929 = null;
        Arrays.fill(field832, (Object) null);
        Statics.field4267 = null;
        Arrays.fill(field821, (Object) null);
        for (int var10 = 0; var10 < 8; var10++) {
            field873[var10] = new class262();
        }
        Statics.field2790 = null;
    }

    @ObfuscatedName("dc.ej(IB)V")
    public static void method2060(int arg0) {
        if (arg0 == -3) {
            class84.method80(class246.field3092, class246.field3179, class246.field2959);
        } else if (arg0 == -2) {
            class84.method80(class246.field3110, class246.field3062, class246.field3111);
        } else if (arg0 == -1) {
            class84.method80(class246.field2963, class246.field2964, class246.field3038);
        } else if (arg0 == 3) {
            class84.field986 = 3;
            class84.field995 = 1;
        } else if (arg0 == 4) {
            class84.method1831(0);
        } else if (arg0 == 5) {
            class84.field995 = 2;
            class84.method80(class246.field2965, class246.field2970, class246.field2971);
        } else if (arg0 == 68 || !(field607 || arg0 != 6)) {
            class84.method80(class246.field3152, class246.field2973, class246.field2987);
        } else if (arg0 == 7) {
            class84.method80(class246.field2975, class246.field2994, class246.field2977);
        } else if (arg0 == 8) {
            class84.method80(class246.field2978, class246.field2979, class246.field3116);
        } else if (arg0 == 9) {
            class84.method80(class246.field2981, class246.field2982, class246.field2983);
        } else if (arg0 == 10) {
            class84.method80(class246.field2984, class246.field2985, class246.field3112);
        } else if (arg0 == 11) {
            class84.method80(class246.field3180, class246.field2931, class246.field2923);
        } else if (arg0 == 12) {
            class84.method80(class246.field3135, class246.field2991, class246.field2992);
        } else if (arg0 == 13) {
            class84.method80(class246.field2993, class246.field3175, class246.field2957);
        } else if (arg0 == 14) {
            class84.method80(class246.field2996, class246.field2997, class246.field2998);
        } else if (arg0 == 16) {
            class84.method80(class246.field2999, class246.field3071, class246.field3129);
        } else if (arg0 == 17) {
            class84.method80(class246.field2974, class246.field3003, class246.field3004);
        } else if (arg0 == 18) {
            class84.method1831(1);
        } else if (arg0 == 19) {
            class84.method80(class246.field3008, class246.field3009, class246.field3010);
        } else if (arg0 == 20) {
            class84.method80(class246.field3020, class246.field3047, class246.field3154);
        } else if (arg0 == 22) {
            class84.method80(class246.field3014, class246.field3015, class246.field3016);
        } else if (arg0 == 23) {
            class84.method80(class246.field3017, class246.field3018, class246.field3019);
        } else if (arg0 == 24) {
            class84.method80(class246.field3034, class246.field3021, class246.field3183);
        } else if (arg0 == 25) {
            class84.method80(class246.field3023, class246.field3171, class246.field3025);
        } else if (arg0 == 26) {
            class84.method80(class246.field3026, class246.field3027, class246.field3028);
        } else if (arg0 == 27) {
            class84.method80(class246.field3029, class246.field3146, class246.field2916);
        } else if (arg0 == 31) {
            class84.method80(class246.field2972, class246.field3039, class246.field3040);
        } else if (arg0 == 32) {
            class84.method80(class246.field3041, class246.field3140, class246.field3043);
        } else if (arg0 == 37) {
            class84.method80(class246.field3044, class246.field3011, class246.field3073);
        } else if (arg0 == 38) {
            class84.method80(class246.field3013, class246.field3066, class246.field3049);
        } else if (arg0 == 55) {
            class84.field986 = 8;
        } else if (arg0 == 56) {
            class84.method80(class246.field3054, class246.field3055, class246.field3056);
            method184(11);
            return;
        } else if (arg0 == 57) {
            class84.method80(class246.field2986, class246.field2949, class246.field3059);
            method184(11);
            return;
        } else if (arg0 == 61) {
            class84.field986 = 7;
        } else {
            class84.method80(class246.field3187, class246.field3061, class246.field3072);
        }
        method184(10);
    }

    @ObfuscatedName("w.ea(B)V")
    public static final void method193() {
        field649.method2086();
        method165();
        Statics.field1599.method2999();
        for (int var0 = 0; var0 < 4; var0++) {
            field661[var0].method2301();
        }
        System.gc();
        class211.method2082(2);
        field842 = -1;
        field843 = false;
        for (class78 var1 = (class78) class78.field920.method4160(); var1 != null; var1 = (class78) class78.field920.method4182()) {
            if (var1.field921 != null) {
                Statics.field2784.method553(var1.field921);
                var1.field921 = null;
            }
            if (var1.field924 != null) {
                Statics.field2784.method553(var1.field924);
                var1.field924 = null;
            }
        }
        class78.field920.method4154();
        method184(10);
    }

    @ObfuscatedName("cu.fi(IB)V")
    public static final void method1826(int arg0) {
        method193();
        switch(arg0) {
            case 1:
                class84.field986 = 24;
                class84.method80(class246.field3151, class246.field3165, class246.field3060);
                break;
            case 2:
                class84.method82();
        }
    }

    @ObfuscatedName("q.fy(I)V")
    public static final void method165() {
        class297.method968();
        class290.field3538.method3392();
        class282.field3433.method3392();
        class295.field3591.method3392();
        class295.field3592.method3392();
        class295.field3629.method3392();
        class295.field3608.method3392();
        class287.method3624();
        class296.method2364();
        class298.method188();
        class289.field3524.method3392();
        class289.field3529.method3392();
        class291.method2776();
        class279.field3399.method3392();
        class294.method2295();
        Statics.method2362();
        class293.method4523();
        class292.field3554.method3392();
        class280.field3404.method3392();
        class223.field2596.method3392();
        class225.method935();
        ((class181) Statics.field1921).method3208();
        class87.field1061.method3392();
        Statics.field3855.method3958();
        Statics.field4115.method3958();
        Statics.field46.method3958();
        Statics.field1121.method3958();
        Statics.field1735.method3958();
        Statics.field62.method3958();
        Statics.field113.method3958();
        Statics.field423.method3958();
        Statics.field1690.method3958();
        Statics.field4128.method3958();
        Statics.field72.method3958();
        Statics.field1449.method3958();
    }

    @ObfuscatedName("cl.fo(I)V")
    public static final void method1909() {
        if (field651 > 0) {
            method193();
        } else {
            field858.method4997();
            method184(40);
            Statics.field687 = field649.method2088();
            field649.method2087();
        }
    }

    @ObfuscatedName("ls.fe(ZB)V")
    public static final void method5199(boolean arg0) {
        if (arg0) {
            field637 = class84.field1006 ? class126.field1457 : class126.field1458;
            return;
        }
        LinkedHashMap var1 = Statics.field988.field1309;
        String var2 = class84.field1001;
        int var3 = var2.length();
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            var4 = (var4 << 5) - var4 + var2.charAt(var5);
        }
        field637 = var1.containsKey(var4) ? class126.field1460 : class126.field1459;
    }

    @ObfuscatedName("client.ff(B)V")
    public final void method989() {
        if (field618 > 1) {
            field618--;
        }
        if (field651 > 0) {
            field651--;
        }
        if (field738) {
            field738 = false;
            method1909();
            return;
        }
        if (!field739) {
            method4469();
        }
        for (int var1 = 0; var1 < 100 && this.method992(field649); var1++) {
        }
        if (field755 != 30) {
            return;
        }
        while (class70.method239()) {
            class205 var2 = class205.method4631(class203.field2246, field649.field1385);
            var2.field2342.method5839(0);
            int var3 = var2.field2342.field4155;
            class70.method148(var2.field2342);
            var2.field2342.method5887(var2.field2342.field4155 - var3);
            field649.method2099(var2);
        }
        if (field858.field3774) {
            class205 var4 = class205.method4631(class203.field2235, field649.field1385);
            var4.field2342.method5839(0);
            int var5 = var4.field2342.field4155;
            field858.method5002(var4.field2342);
            var4.field2342.method5887(var4.field2342.field4155 - var5);
            field649.method2099(var4);
            field858.method5000();
        }
        Object var6 = Statics.field3360.field1158;
        synchronized (Statics.field3360.field1158) {
            if (!field868) {
                Statics.field3360.field1160 = 0;
            } else if (class48.field355 != 0 || Statics.field3360.field1160 >= 40) {
                class205 var7 = null;
                int var8 = 0;
                int var9 = 0;
                int var10 = 0;
                int var11 = 0;
                for (int var12 = 0; var12 < Statics.field3360.field1160 && (var7 == null || var7.field2342.field4155 - var8 < 246); var12++) {
                    var9 = var12;
                    int var13 = Statics.field3360.field1162[var12];
                    if (var13 < -1) {
                        var13 = -1;
                    } else if (var13 > 65534) {
                        var13 = 65534;
                    }
                    int var14 = Statics.field3360.field1161[var12];
                    if (var14 < -1) {
                        var14 = -1;
                    } else if (var14 > 65534) {
                        var14 = 65534;
                    }
                    if (field876 != var14 || field760 != var13) {
                        if (var7 == null) {
                            var7 = class205.method4631(class203.field2242, field649.field1385);
                            var7.field2342.method5839(0);
                            var8 = var7.field2342.field4155;
                            var7.field2342.field4155 += 2;
                            var10 = 0;
                            var11 = 0;
                        }
                        int var15;
                        int var16;
                        int var17;
                        if (field852 == -1L) {
                            var15 = var14;
                            var16 = var13;
                            var17 = Integer.MAX_VALUE;
                        } else {
                            var15 = var14 - field876;
                            var16 = var13 - field760;
                            var17 = (int) ((Statics.field3360.field1163[var12] - field852) / 20L);
                            var10 = (int) ((Statics.field3360.field1163[var12] - field852) % 20L + (long) var10);
                        }
                        field876 = var14;
                        field760 = var13;
                        if (var17 < 8 && var15 >= -32 && var15 <= 31 && var16 >= -32 && var16 <= 31) {
                            var15 += 32;
                            var16 += 32;
                            var7.field2342.method5853((var15 << 6) + (var17 << 12) + var16);
                        } else if (var17 < 32 && var15 >= -128 && var15 <= 127 && var16 >= -128 && var16 <= 127) {
                            var15 += 128;
                            var16 += 128;
                            var7.field2342.method5839(var17 + 128);
                            var7.field2342.method5853((var15 << 8) + var16);
                        } else if (var17 < 32) {
                            var7.field2342.method5839(var17 + 192);
                            if (var14 == -1 || var13 == -1) {
                                var7.field2342.method5842(Integer.MIN_VALUE);
                            } else {
                                var7.field2342.method5842(var14 | var13 << 16);
                            }
                        } else {
                            var7.field2342.method5853((var17 & 0x1FFF) + 57344);
                            if (var14 == -1 || var13 == -1) {
                                var7.field2342.method5842(Integer.MIN_VALUE);
                            } else {
                                var7.field2342.method5842(var14 | var13 << 16);
                            }
                        }
                        var11++;
                        field852 = Statics.field3360.field1163[var12];
                    }
                }
                if (var7 != null) {
                    var7.field2342.method5887(var7.field2342.field4155 - var8);
                    int var18 = var7.field2342.field4155;
                    var7.field2342.field4155 = var8;
                    var7.field2342.method5839(var10 / var11);
                    var7.field2342.method5839(var10 % var11);
                    var7.field2342.field4155 = var18;
                    field649.method2099(var7);
                }
                if (var9 >= Statics.field3360.field1160) {
                    Statics.field3360.field1160 = 0;
                } else {
                    Statics.field3360.field1160 -= var9;
                    System.arraycopy(Statics.field3360.field1161, var9, Statics.field3360.field1161, 0, Statics.field3360.field1160);
                    System.arraycopy(Statics.field3360.field1162, var9, Statics.field3360.field1162, 0, Statics.field3360.field1160);
                    System.arraycopy(Statics.field3360.field1163, var9, Statics.field3360.field1163, 0, Statics.field3360.field1160);
                }
            }
        }
        if (class48.field355 == 1 || !Statics.field360 && class48.field355 == 4 || class48.field355 == 2) {
            long var20 = class48.field358 - field612 * -1L;
            if (var20 > 32767L) {
                var20 = 32767L;
            }
            field612 = class48.field358 * -1L;
            int var22 = class48.field348;
            if (var22 < 0) {
                var22 = 0;
            } else if (var22 > Statics.field320) {
                var22 = Statics.field320;
            }
            int var23 = class48.field343;
            if (var23 < 0) {
                var23 = 0;
            } else if (var23 > Statics.field1143) {
                var23 = Statics.field1143;
            }
            int var24 = (int) var20;
            class205 var25 = class205.method4631(class203.field2217, field649.field1385);
            var25.field2342.method5853((class48.field355 == 2 ? 1 : 0) + (var24 << 1));
            var25.field2342.method5853(var23);
            var25.field2342.method5853(var22);
            field649.method2099(var25);
        }
        if (class39.field264 > 0) {
            class205 var26 = class205.method4631(class203.field2227, field649.field1385);
            var26.field2342.method5853(0);
            int var27 = var26.field2342.field4155;
            long var28 = class379.method1540();
            for (int var30 = 0; var30 < class39.field264; var30++) {
                long var31 = var28 - field679;
                if (var31 > 16777215L) {
                    var31 = 16777215L;
                }
                field679 = var28;
                var26.field2342.method5841((int) var31);
                var26.field2342.method5915(class39.field263[var30]);
            }
            var26.field2342.method5852(var26.field2342.field4155 - var27);
            field649.method2099(var26);
        }
        if (field827 > 0) {
            field827--;
        }
        if (class39.field247[96] || class39.field247[97] || class39.field247[98] || class39.field247[99]) {
            field688 = true;
        }
        if (field688 && field827 <= 0) {
            field827 = 20;
            field688 = false;
            class205 var33 = class205.method4631(class203.field2294, field649.field1385);
            var33.field2342.method5890(field632);
            var33.field2342.method5992(field673);
            field649.method2099(var33);
        }
        if (Statics.field3314 && !field616) {
            field616 = true;
            class205 var34 = class205.method4631(class203.field2273, field649.field1385);
            var34.field2342.method5839(1);
            field649.method2099(var34);
        }
        if (!Statics.field3314 && field616) {
            field616 = false;
            class205 var35 = class205.method4631(class203.field2273, field649.field1385);
            var35.field2342.method5839(0);
            field649.method2099(var35);
        }
        if (Statics.field1411 != null) {
            Statics.field1411.method5471();
        }
        if (Statics.field1592) {
            if (Statics.field1142 != null) {
                Statics.field1142.method5122();
            }
            method2732();
            Statics.field1592 = false;
        }
        if (Statics.field201 != field834) {
            field834 = Statics.field201;
            method160(Statics.field201);
        }
        if (field755 != 30) {
            return;
        }
        method3407();
        int var10002;
        for (int var36 = 0; var36 < field844; var36++) {
            var10002 = field847[var36]--;
            if (field847[var36] >= -10) {
                class50 var38 = field778[var36];
                if (var38 == null) {
                    class50 var10000 = (class50) null;
                    var38 = class50.method602(Statics.field1121, field845[var36], 0);
                    if (var38 == null) {
                        continue;
                    }
                    field847[var36] += var38.method594();
                    field778[var36] = var38;
                }
                if (field847[var36] < 0) {
                    int var45;
                    if (field848[var36] == 0) {
                        var45 = Statics.field988.field1307;
                    } else {
                        int var39 = (field848[var36] & 0xFF) * 128;
                        int var40 = field848[var36] >> 16 & 0xFF;
                        int var41 = var40 * 128 + 64 - Statics.field1374.field1232;
                        if (var41 < 0) {
                            var41 = -var41;
                        }
                        int var42 = field848[var36] >> 8 & 0xFF;
                        int var43 = var42 * 128 + 64 - Statics.field1374.field1210;
                        if (var43 < 0) {
                            var43 = -var43;
                        }
                        int var44 = var41 + var43 - 128;
                        if (var44 > var39) {
                            field847[var36] = -100;
                            continue;
                        }
                        if (var44 < 0) {
                            var44 = 0;
                        }
                        var45 = Statics.field988.field1308 * (var39 - var44) / var39;
                    }
                    if (var45 > 0) {
                        class51 var46 = var38.method590().method606(Statics.field235);
                        class58 var47 = class58.method700(var46, 100, var45);
                        var47.method703(field654[var36] - 1);
                        Statics.field2784.method583(var47);
                    }
                    field847[var36] = -100;
                }
            } else {
                field844--;
                for (int var37 = var36; var37 < field844; var37++) {
                    field845[var37] = field845[var37 + 1];
                    field778[var37] = field778[var37 + 1];
                    field654[var37] = field654[var37 + 1];
                    field847[var37] = field847[var37 + 1];
                    field848[var37] = field848[var37 + 1];
                }
                var36--;
            }
        }
        if (field843) {
            boolean var48;
            if (class211.field2483 == 0) {
                var48 = Statics.field2486.method3448();
            } else {
                var48 = true;
            }
            if (!var48) {
                if (Statics.field988.field1303 != 0 && field842 != -1) {
                    class211.method3417(Statics.field62, field842, 0, Statics.field988.field1303, false);
                }
                field843 = false;
            }
        }
        field649.field1392++;
        if (field649.field1392 > 750) {
            method1909();
            return;
        }
        int var49 = class109.field1362;
        int[] var50 = class109.field1354;
        for (int var51 = 0; var51 < var49; var51++) {
            class98 var52 = field849[var50[var51]];
            if (var52 != null) {
                Statics.method2343(var52, 1);
            }
        }
        method2772();
        int[] var53 = class109.field1354;
        for (int var54 = 0; var54 < class109.field1362; var54++) {
            class98 var55 = field849[var53[var54]];
            if (var55 != null && var55.field1242 > 0) {
                var55.field1242--;
                if (var55.field1242 == 0) {
                    var55.field1223 = null;
                }
            }
        }
        for (int var56 = 0; var56 < field644; var56++) {
            int var57 = field645[var56];
            class105 var58 = field643[var57];
            if (var58 != null && var58.field1242 > 0) {
                var58.field1242--;
                if (var58.field1242 == 0) {
                    var58.field1223 = null;
                }
            }
        }
        field800++;
        if (field782 != 0) {
            field706 += 20;
            if (field706 >= 400) {
                field782 = 0;
            }
        }
        if (Statics.field1395 != null) {
            field709++;
            if (field709 >= 15) {
                method213(Statics.field1395);
                Statics.field1395 = null;
            }
        }
        class225 var59 = Statics.field2582;
        class225 var60 = Statics.field1193;
        Statics.field2582 = null;
        Statics.field1193 = null;
        field853 = null;
        field784 = false;
        field781 = false;
        field828 = 0;
        while (class39.method3835() && field828 < 128) {
            if (field797 >= 2 && class39.field247[82] && Statics.field147 == 66) {
                String var61 = "";
                Iterator var62 = class111.field1376.iterator();
                while (var62.hasNext()) {
                    class73 var63 = (class73) var62.next();
                    var61 = var61 + var63.field582 + ':' + var63.field589 + '\n';
                }
                Statics.field75.method370(var61);
            } else if (field678 != 1 || Statics.field592 <= 0) {
                field793[field828] = Statics.field147;
                field829[field828] = Statics.field592;
                field828++;
            }
        }
        boolean var66 = field797 >= 2;
        if (var66 && class39.field247[82] && class39.field247[81] && field805 != 0) {
            int var67 = Statics.field1374.field1186 - field805;
            if (var67 < 0) {
                var67 = 0;
            } else if (var67 > 3) {
                var67 = 3;
            }
            if (Statics.field1374.field1186 != var67) {
                method79(Statics.field1795 + Statics.field1374.field1265[0], Statics.field1892 + Statics.field1374.field1266[0], var67, false);
            }
            field805 = 0;
        }
        if (field763 != -1) {
            method60(field763, 0, 0, Statics.field1143, Statics.field320, 0, 0);
        }
        field605++;
        while (true) {
            class96 var68;
            class225 var69;
            class225 var70;
            do {
                var68 = (class96) field807.method4158();
                if (var68 == null) {
                    while (true) {
                        class96 var71;
                        class225 var72;
                        class225 var73;
                        do {
                            var71 = (class96) field689.method4158();
                            if (var71 == null) {
                                while (true) {
                                    class96 var74;
                                    class225 var75;
                                    class225 var76;
                                    do {
                                        var74 = (class96) field806.method4158();
                                        if (var74 == null) {
                                            this.method993();
                                            if (Statics.field1411 != null) {
                                                Statics.field1411.method5439(Statics.field201, (Statics.field1374.field1232 >> 7) + Statics.field1795, (Statics.field1374.field1210 >> 7) + Statics.field1892, false);
                                                Statics.field1411.method5486();
                                            }
                                            if (field776 != null) {
                                                this.method998();
                                            }
                                            if (Statics.field2234 != null) {
                                                method213(Statics.field2234);
                                                field716++;
                                                if (class48.field347 == 0) {
                                                    if (field715) {
                                                        if (Statics.field580 == Statics.field2234 && field878 != field711) {
                                                            class225 var77 = Statics.field2234;
                                                            byte var78 = 0;
                                                            if (field768 == 1 && var77.field2629 == 206) {
                                                                var78 = 1;
                                                            }
                                                            if (var77.field2635[field878] <= 0) {
                                                                var78 = 0;
                                                            }
                                                            if (class226.method928(method3830(var77))) {
                                                                int var79 = field711;
                                                                int var80 = field878;
                                                                var77.field2635[var80] = var77.field2635[var79];
                                                                var77.field2752[var80] = var77.field2752[var79];
                                                                var77.field2635[var79] = -1;
                                                                var77.field2752[var79] = 0;
                                                            } else if (var78 == 1) {
                                                                int var81 = field711;
                                                                int var82 = field878;
                                                                while (var81 != var82) {
                                                                    if (var81 > var82) {
                                                                        var77.method3730(var81 - 1, var81);
                                                                        var81--;
                                                                    } else if (var81 < var82) {
                                                                        var77.method3730(var81 + 1, var81);
                                                                        var81++;
                                                                    }
                                                                }
                                                            } else {
                                                                var77.method3730(field878, field711);
                                                            }
                                                            class205 var83 = class205.method4631(class203.field2231, field649.field1385);
                                                            var83.field2342.method5901(Statics.field2234.field2703);
                                                            var83.field2342.method5890(field711);
                                                            var83.field2342.method5882(var78);
                                                            var83.field2342.method5890(field878);
                                                            field649.method2099(var83);
                                                        }
                                                    } else if (this.method1318()) {
                                                        this.method1218(field659, field713);
                                                    } else if (field740 > 0) {
                                                        method203(field659, field713);
                                                    }
                                                    field709 = 10;
                                                    class48.field355 = 0;
                                                    Statics.field2234 = null;
                                                } else if (field716 >= 5 && (class48.field342 > field659 + 5 || class48.field342 < field659 - 5 || class48.field357 > field713 + 5 || class48.field357 < field713 - 5)) {
                                                    field715 = true;
                                                }
                                            }
                                            if (class176.method3038()) {
                                                int var84 = class176.field1967;
                                                int var85 = class176.field1968;
                                                class205 var86 = class205.method4631(class203.field2268, field649.field1385);
                                                var86.field2342.method5839(5);
                                                var86.field2342.method6047(Statics.field1892 + var85);
                                                var86.field2342.method5839(class39.field247[82] ? (class39.field247[81] ? 2 : 1) : 0);
                                                var86.field2342.method5992(Statics.field1795 + var84);
                                                field649.method2099(var86);
                                                class176.method3040();
                                                field704 = class48.field343;
                                                field730 = class48.field348;
                                                field782 = 1;
                                                field706 = 0;
                                                field839 = var84;
                                                field840 = var85;
                                            }
                                            if (Statics.field2582 != var59) {
                                                if (var59 != null) {
                                                    method213(var59);
                                                }
                                                if (Statics.field2582 != null) {
                                                    method213(Statics.field2582);
                                                }
                                            }
                                            if (Statics.field1193 != var60 && field754 == field697) {
                                                if (var60 != null) {
                                                    method213(var60);
                                                }
                                                if (Statics.field1193 != null) {
                                                    method213(Statics.field1193);
                                                }
                                            }
                                            if (Statics.field1193 == null) {
                                                if (field754 > 0) {
                                                    field754--;
                                                }
                                            } else if (field754 < field697) {
                                                field754++;
                                                if (field754 == field697) {
                                                    method213(Statics.field1193);
                                                }
                                            }
                                            method3623();
                                            if (field850) {
                                                int var87 = Statics.field41 * 128 + 64;
                                                int var88 = Statics.field593 * 128 + 64;
                                                int var89 = method2142(var87, var88, Statics.field201) - Statics.field1570;
                                                if (Statics.field3371 < var87) {
                                                    Statics.field3371 += Statics.field1436 * (var87 - Statics.field3371) / 1000 + Statics.field1928;
                                                    if (Statics.field3371 > var87) {
                                                        Statics.field3371 = var87;
                                                    }
                                                }
                                                if (Statics.field3371 > var87) {
                                                    Statics.field3371 -= Statics.field1436 * (Statics.field3371 - var87) / 1000 + Statics.field1928;
                                                    if (Statics.field3371 < var87) {
                                                        Statics.field3371 = var87;
                                                    }
                                                }
                                                if (Statics.field1711 < var89) {
                                                    Statics.field1711 += Statics.field1436 * (var89 - Statics.field1711) / 1000 + Statics.field1928;
                                                    if (Statics.field1711 > var89) {
                                                        Statics.field1711 = var89;
                                                    }
                                                }
                                                if (Statics.field1711 > var89) {
                                                    Statics.field1711 -= Statics.field1436 * (Statics.field1711 - var89) / 1000 + Statics.field1928;
                                                    if (Statics.field1711 < var89) {
                                                        Statics.field1711 = var89;
                                                    }
                                                }
                                                if (Statics.field568 < var88) {
                                                    Statics.field568 += Statics.field1436 * (var88 - Statics.field568) / 1000 + Statics.field1928;
                                                    if (Statics.field568 > var88) {
                                                        Statics.field568 = var88;
                                                    }
                                                }
                                                if (Statics.field568 > var88) {
                                                    Statics.field568 -= Statics.field1436 * (Statics.field568 - var88) / 1000 + Statics.field1928;
                                                    if (Statics.field568 < var88) {
                                                        Statics.field568 = var88;
                                                    }
                                                }
                                                int var90 = Statics.field3369 * 128 + 64;
                                                int var91 = Statics.field1340 * 128 + 64;
                                                int var92 = method2142(var90, var91, Statics.field201) - Statics.field16;
                                                int var93 = var90 - Statics.field3371;
                                                int var94 = var92 - Statics.field1711;
                                                int var95 = var91 - Statics.field568;
                                                int var96 = (int) Math.sqrt((double) (var93 * var93 + var95 * var95));
                                                int var97 = (int) (Math.atan2((double) var94, (double) var96) * 325.949D) & 0x7FF;
                                                int var98 = (int) (Math.atan2((double) var93, (double) var95) * -325.949D) & 0x7FF;
                                                if (var97 < 128) {
                                                    var97 = 128;
                                                }
                                                if (var97 > 383) {
                                                    var97 = 383;
                                                }
                                                if (Statics.field1607 < var97) {
                                                    Statics.field1607 += Statics.field7 * (var97 - Statics.field1607) / 1000 + Statics.field1364;
                                                    if (Statics.field1607 > var97) {
                                                        Statics.field1607 = var97;
                                                    }
                                                }
                                                if (Statics.field1607 > var97) {
                                                    Statics.field1607 -= Statics.field7 * (Statics.field1607 - var97) / 1000 + Statics.field1364;
                                                    if (Statics.field1607 < var97) {
                                                        Statics.field1607 = var97;
                                                    }
                                                }
                                                int var99 = var98 - Statics.field558;
                                                if (var99 > 1024) {
                                                    var99 -= 2048;
                                                }
                                                if (var99 < -1024) {
                                                    var99 += 2048;
                                                }
                                                if (var99 > 0) {
                                                    Statics.field558 += Statics.field7 * var99 / 1000 + Statics.field1364;
                                                    Statics.field558 &= 0x7FF;
                                                }
                                                if (var99 < 0) {
                                                    Statics.field558 -= Statics.field7 * -var99 / 1000 + Statics.field1364;
                                                    Statics.field558 &= 0x7FF;
                                                }
                                                int var100 = var98 - Statics.field558;
                                                if (var100 > 1024) {
                                                    var100 -= 2048;
                                                }
                                                if (var100 < -1024) {
                                                    var100 += 2048;
                                                }
                                                if (var100 < 0 && var99 > 0 || var100 > 0 && var99 < 0) {
                                                    Statics.field558 = var98;
                                                }
                                            }
                                            for (int var101 = 0; var101 < 5; var101++) {
                                                var10002 = field855[var101]++;
                                            }
                                            Statics.field2038.method2018();
                                            int var102 = class48.method1842();
                                            int var103 = class39.method81();
                                            if (var102 > 15000 && var103 > 15000) {
                                                field651 = 250;
                                                class48.field349 = 14500;
                                                class205 var104 = class205.method4631(class203.field2270, field649.field1385);
                                                field649.method2099(var104);
                                            }
                                            Statics.field118.method1463();
                                            field649.field1391++;
                                            if (field649.field1391 > 50) {
                                                class205 var105 = class205.method4631(class203.field2272, field649.field1385);
                                                field649.method2099(var105);
                                            }
                                            try {
                                                field649.method2084();
                                            } catch (IOException var107) {
                                                method1909();
                                            }
                                            return;
                                        }
                                        var75 = var74.field1147;
                                        if (var75.field2626 < 0) {
                                            break;
                                        }
                                        var76 = class225.method2354(var75.field2644);
                                    } while (var76 == null || var76.field2757 == null || var75.field2626 >= var76.field2757.length || var76.field2757[var75.field2626] != var75);
                                    class79.method179(var74);
                                }
                            }
                            var72 = var71.field1147;
                            if (var72.field2626 < 0) {
                                break;
                            }
                            var73 = class225.method2354(var72.field2644);
                        } while (var73 == null || var73.field2757 == null || var72.field2626 >= var73.field2757.length || var73.field2757[var72.field2626] != var72);
                        class79.method179(var71);
                    }
                }
                var69 = var68.field1147;
                if (var69.field2626 < 0) {
                    break;
                }
                var70 = class225.method2354(var69.field2644);
            } while (var70 == null || var70.field2757 == null || var69.field2626 >= var70.field2757.length || var70.field2757[var69.field2626] != var69);
            class79.method179(var68);
        }
    }

    @ObfuscatedName("gs.fg(B)V")
    public static final void method3342() {
        if (Statics.field291 != null) {
            Statics.field291.method630();
        }
        if (Statics.field594 != null) {
            Statics.field594.method630();
        }
    }

    @ObfuscatedName("hm.fl(Lkw;IIII)V")
    public static void method3838(class298 arg0, int arg1, int arg2, int arg3) {
        if (field844 >= 50 || Statics.field988.field1308 == 0 || arg0.field3710 == null || arg1 >= arg0.field3710.length) {
            return;
        }
        int var4 = arg0.field3710[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field845[field844] = var5;
        field654[field844] = var6;
        field847[field844] = 0;
        field778[field844] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field848[field844] = (var8 << 16) + (var9 << 8) + var7;
        field844++;
    }

    @ObfuscatedName("if.fv(IIII)V")
    public static void method3878(int arg0, int arg1, int arg2) {
        if (Statics.field988.field1307 == 0 || arg1 == 0 || field844 >= 50) {
            return;
        }
        field845[field844] = arg0;
        field654[field844] = arg1;
        field847[field844] = arg2;
        field778[field844] = null;
        field848[field844] = 0;
        field844++;
    }

    @ObfuscatedName("b.fr(II)V")
    public static void method55(int arg0) {
        if (arg0 == -1 && !field843) {
            class211.method3836();
        } else if (arg0 != -1 && field842 != arg0 && Statics.field988.field1303 != 0 && !field843) {
            class211.method2686(2, Statics.field62, arg0, 0, Statics.field988.field1303, false);
        }
        field842 = arg0;
    }

    @ObfuscatedName("cl.fw(IIB)V")
    public static void method1903(int arg0, int arg1) {
        if (Statics.field988.field1303 != 0 && arg0 != -1) {
            class211.method3417(Statics.field72, arg0, 0, Statics.field988.field1303, false);
            field843 = true;
        }
    }

    @ObfuscatedName("j.fp(Lhu;III)V")
    public static final void method159(class225 arg0, int arg1, int arg2) {
        if (field841 != 0 && field841 != 3 || field739 || !(class48.field355 == 1 || !Statics.field360 && class48.field355 == 4)) {
            return;
        }
        class219 var3 = arg0.method3752(true);
        if (var3 == null) {
            return;
        }
        int var4 = class48.field343 - arg1;
        int var5 = class48.field348 - arg2;
        if (!var3.method3659(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2571 / 2;
        int var7 = var5 - var3.field2572 / 2;
        int var8 = field673 & 0x7FF;
        int var9 = class174.field1924[var8];
        int var10 = class174.field1909[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field1374.field1232 + var11 >> 7;
        int var14 = Statics.field1374.field1210 - var12 >> 7;
        class205 var15 = class205.method4631(class203.field2221, field649.field1385);
        var15.field2342.method5839(18);
        var15.field2342.method6047(Statics.field1892 + var14);
        var15.field2342.method5839(class39.field247[82] ? (class39.field247[81] ? 2 : 1) : 0);
        var15.field2342.method5992(Statics.field1795 + var13);
        var15.field2342.method5839(var6);
        var15.field2342.method5839(var7);
        var15.field2342.method5853(field673);
        var15.field2342.method5839(57);
        var15.field2342.method5839(0);
        var15.field2342.method5839(0);
        var15.field2342.method5839(89);
        var15.field2342.method5853(Statics.field1374.field1232);
        var15.field2342.method5853(Statics.field1374.field1210);
        var15.field2342.method5839(63);
        field649.method2099(var15);
        field839 = var13;
        field840 = var14;
    }

    @ObfuscatedName("dc.fk(Ljava/lang/String;I)V")
    public static final void method2073(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field988.field1311 = !Statics.field988.field1311;
            class103.method964();
            if (Statics.field988.field1311) {
                class111.method930(99, "", "Roofs are now all hidden");
            } else {
                class111.method930(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field830 = !field830;
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            field722 = !field722;
        }
        if (arg0.equalsIgnoreCase("mouseovertext")) {
            field751 = !field751;
        }
        if (field797 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equalsIgnoreCase("showcoord")) {
                Statics.field1411.field4046 = !Statics.field1411.field4046;
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                field830 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field830 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method1909();
            }
            if (arg0.equalsIgnoreCase("setclantransmit")) {
                field787 = field605;
                field801 = field605;
            }
        }
        class205 var1 = class205.method4631(class203.field2257, field649.field1385);
        var1.field2342.method5839(arg0.length() + 1);
        var1.field2342.method6016(arg0);
        field649.method2099(var1);
    }

    @ObfuscatedName("hv.fs(I)V")
    public static final void method3623() {
        if (field678 == 0) {
            int var0 = Statics.field1374.field1232;
            int var1 = Statics.field1374.field1210;
            if (Statics.field48 - var0 < -500 || Statics.field48 - var0 > 500 || Statics.field1359 - var1 < -500 || Statics.field1359 - var1 > 500) {
                Statics.field48 = var0;
                Statics.field1359 = var1;
            }
            if (Statics.field48 != var0) {
                Statics.field48 += (var0 - Statics.field48) / 16;
            }
            if (Statics.field1359 != var1) {
                Statics.field1359 += (var1 - Statics.field1359) / 16;
            }
            int var2 = Statics.field48 >> 7;
            int var3 = Statics.field1359 >> 7;
            int var4 = method2142(Statics.field48, Statics.field1359, Statics.field201);
            int var5 = 0;
            if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                        int var8 = Statics.field201;
                        if (var8 < 3 && (class90.field1091[1][var6][var7] & 0x2) == 2) {
                            var8++;
                        }
                        int var9 = var4 - class90.field1090[var8][var6][var7];
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
            if (var10 > field736) {
                field736 += (var10 - field736) / 24;
            } else if (var10 < field736) {
                field736 += (var10 - field736) / 80;
            }
            Statics.field3545 = method2142(Statics.field1374.field1232, Statics.field1374.field1210, Statics.field201) - field870;
        } else if (field678 == 1) {
            method3635();
            short var11 = -1;
            if (class39.field247[33]) {
                var11 = 0;
            } else if (class39.field247[49]) {
                var11 = 1024;
            }
            if (class39.field247[48]) {
                if (var11 == 0) {
                    var11 = 1792;
                } else if (var11 == 1024) {
                    var11 = 1280;
                } else {
                    var11 = 1536;
                }
            } else if (class39.field247[50]) {
                if (var11 == 0) {
                    var11 = 256;
                } else if (var11 == 1024) {
                    var11 = 768;
                } else {
                    var11 = 512;
                }
            }
            byte var12 = 0;
            if (class39.field247[35]) {
                var12 = -1;
            } else if (class39.field247[51]) {
                var12 = 1;
            }
            int var13 = 0;
            if (var11 >= 0 || var12 != 0) {
                int var14 = class39.field247[81] ? field684 : field642;
                var13 = var14 * 16;
                field703 = var11;
                field682 = var12;
            }
            if (field680 < var13) {
                field680 += var13 / 8;
                if (field680 > var13) {
                    field680 = var13;
                }
            } else if (field680 > var13) {
                field680 = field680 * 9 / 10;
            }
            if (field680 > 0) {
                int var15 = field680 / 16;
                if (field703 >= 0) {
                    int var16 = field703 - Statics.field558 & 0x7FF;
                    int var17 = class174.field1924[var16];
                    int var18 = class174.field1909[var16];
                    Statics.field48 += var15 * var17 / 65536;
                    Statics.field1359 += var15 * var18 / 65536;
                }
                if (field682 != 0) {
                    Statics.field3545 += field682 * var15;
                    if (Statics.field3545 > 0) {
                        Statics.field3545 = 0;
                    }
                }
            } else {
                field703 = -1;
                field682 = -1;
            }
            if (class39.field247[13]) {
                field649.method2099(class205.method4631(class203.field2263, field649.field1385));
                field678 = 0;
            }
        }
        if (class48.field347 == 4 && Statics.field360) {
            int var19 = class48.field357 - field752;
            field675 = var19 * 2;
            field752 = var19 == -1 || var19 == 1 ? class48.field357 : (field752 + class48.field357) / 2;
            int var20 = field676 - class48.field342;
            field674 = var20 * 2;
            field676 = var20 == -1 || var20 == 1 ? class48.field342 : (field676 + class48.field342) / 2;
        } else {
            if (class39.field247[96]) {
                field674 += (-24 - field674) / 2;
            } else if (class39.field247[97]) {
                field674 += (24 - field674) / 2;
            } else {
                field674 /= 2;
            }
            if (class39.field247[98]) {
                field675 += (12 - field675) / 2;
            } else if (class39.field247[99]) {
                field675 += (-12 - field675) / 2;
            } else {
                field675 /= 2;
            }
            field752 = class48.field357;
            field676 = class48.field342;
        }
        field673 = field674 / 2 + field673 & 0x7FF;
        field632 += field675 / 2;
        if (field632 < 128) {
            field632 = 128;
        }
        if (field632 > 383) {
            field632 = 383;
        }
    }

    @ObfuscatedName("fl.fz(I)V")
    public static final void method2772() {
        for (int var0 = 0; var0 < field644; var0++) {
            int var1 = field645[var0];
            class105 var2 = field643[var1];
            if (var2 != null) {
                Statics.method2343(var2, var2.field1319.field3480);
            }
        }
    }

    @ObfuscatedName("ac.ft(Lcd;I)V")
    public static final void method204(class100 arg0) {
        int var1 = Math.max(1, arg0.field1256 - field611);
        int var2 = arg0.field1259 * 64 + arg0.field1241 * 128;
        int var3 = arg0.field1259 * 64 + arg0.field1254 * 128;
        arg0.field1232 += (var2 - arg0.field1232) / var1;
        arg0.field1210 += (var3 - arg0.field1210) / var1;
        arg0.field1268 = 0;
        arg0.field1226 = arg0.field1214;
    }

    @ObfuscatedName("ef.fx(Lcd;I)V")
    public static final void method2673(class100 arg0) {
        if (field611 == arg0.field1269 || arg0.field1216 == -1 || arg0.field1245 != 0 || arg0.field1237 + 1 > class298.method3795(arg0.field1216).field3714[arg0.field1243]) {
            int var1 = arg0.field1269 - arg0.field1256;
            int var2 = field611 - arg0.field1256;
            int var3 = arg0.field1259 * 64 + arg0.field1241 * 128;
            int var4 = arg0.field1259 * 64 + arg0.field1254 * 128;
            int var5 = arg0.field1259 * 64 + arg0.field1253 * 128;
            int var6 = arg0.field1259 * 64 + arg0.field1240 * 128;
            arg0.field1232 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field1210 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field1268 = 0;
        arg0.field1226 = arg0.field1214;
        arg0.field1213 = arg0.field1226;
    }

    @ObfuscatedName("a.fq(Lcd;I)V")
    public static final void method191(class100 arg0) {
        arg0.field1261 = arg0.field1211;
        if (arg0.field1264 == 0) {
            arg0.field1268 = 0;
            return;
        }
        if (arg0.field1216 != -1 && arg0.field1245 == 0) {
            class298 var1 = class298.method3795(arg0.field1216);
            if (arg0.field1225 > 0 && var1.field3723 == 0) {
                arg0.field1268++;
                return;
            }
            if (arg0.field1225 <= 0 && var1.field3724 == 0) {
                arg0.field1268++;
                return;
            }
        }
        int var2 = arg0.field1232;
        int var3 = arg0.field1210;
        int var4 = arg0.field1265[arg0.field1264 - 1] * 128 + arg0.field1259 * 64;
        int var5 = arg0.field1266[arg0.field1264 - 1] * 128 + arg0.field1259 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field1226 = 1280;
            } else if (var3 > var5) {
                arg0.field1226 = 1792;
            } else {
                arg0.field1226 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field1226 = 768;
            } else if (var3 > var5) {
                arg0.field1226 = 256;
            } else {
                arg0.field1226 = 512;
            }
        } else if (var3 < var5) {
            arg0.field1226 = 1024;
        } else if (var3 > var5) {
            arg0.field1226 = 0;
        }
        byte var6 = arg0.field1267[arg0.field1264 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field1232 = var4;
            arg0.field1210 = var5;
            arg0.field1264--;
            if (arg0.field1225 > 0) {
                arg0.field1225--;
            }
            return;
        }
        int var7 = arg0.field1226 - arg0.field1213 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field1219;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field1218;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field1247;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field1220;
        }
        if (var8 == -1) {
            var8 = arg0.field1218;
        }
        arg0.field1261 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class105) {
            var10 = ((class105) arg0).field1319.field3496;
        }
        if (var10) {
            if (arg0.field1226 != arg0.field1213 && arg0.field1236 == -1 && arg0.field1263 != 0) {
                var9 = 2;
            }
            if (arg0.field1264 > 2) {
                var9 = 6;
            }
            if (arg0.field1264 > 3) {
                var9 = 8;
            }
            if (arg0.field1268 > 0 && arg0.field1264 > 1) {
                var9 = 8;
                arg0.field1268--;
            }
        } else {
            if (arg0.field1264 > 1) {
                var9 = 6;
            }
            if (arg0.field1264 > 2) {
                var9 = 8;
            }
            if (arg0.field1268 > 0 && arg0.field1264 > 1) {
                var9 = 8;
                arg0.field1268--;
            }
        }
        if (var6 == 2) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field1261 == arg0.field1218 && arg0.field1222 != -1) {
            arg0.field1261 = arg0.field1222;
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field1232 += var9;
                if (arg0.field1232 > var4) {
                    arg0.field1232 = var4;
                }
            } else if (var2 > var4) {
                arg0.field1232 -= var9;
                if (arg0.field1232 < var4) {
                    arg0.field1232 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field1210 += var9;
                if (arg0.field1210 > var5) {
                    arg0.field1210 = var5;
                }
            } else if (var3 > var5) {
                arg0.field1210 -= var9;
                if (arg0.field1210 < var5) {
                    arg0.field1210 = var5;
                }
            }
        }
        if (arg0.field1232 == var4 && arg0.field1210 == var5) {
            arg0.field1264--;
            if (arg0.field1225 > 0) {
                arg0.field1225--;
            }
        }
    }

    @ObfuscatedName("aj.fa(Lcs;IIB)V")
    public static void method215(class98 arg0, int arg1, int arg2) {
        if (arg0.field1216 == arg1 && arg1 != -1) {
            int var3 = class298.method3795(arg1).field3708;
            if (var3 == 1) {
                arg0.field1243 = 0;
                arg0.field1237 = 0;
                arg0.field1245 = arg2;
                arg0.field1246 = 0;
            }
            if (var3 == 2) {
                arg0.field1246 = 0;
            }
        } else if (arg1 == -1 || arg0.field1216 == -1 || class298.method3795(arg1).field3719 >= class298.method3795(arg0.field1216).field3719) {
            arg0.field1216 = arg1;
            arg0.field1243 = 0;
            arg0.field1237 = 0;
            arg0.field1245 = arg2;
            arg0.field1246 = 0;
            arg0.field1225 = arg0.field1264;
        }
    }

    @ObfuscatedName("fw.fu(I)I")
    public static int method2829() {
        return field819 ? 2 : 1;
    }

    @ObfuscatedName("fx.fm(II)V")
    public static void method2921(int arg0) {
        field820 = 0L;
        if (arg0 >= 2) {
            field819 = true;
        } else {
            field819 = false;
        }
        if (method2829() == 1) {
            Statics.field75.method366(765, 503);
        } else {
            Statics.field75.method366(7680, 2160);
        }
        if (field755 >= 25) {
            method1828();
        }
    }

    @ObfuscatedName("cu.fh(I)V")
    public static void method1828() {
        class205 var0 = class205.method4631(class203.field2295, field649.field1385);
        var0.field2342.method5839(method2829());
        var0.field2342.method5853(Statics.field1143);
        var0.field2342.method5853(Statics.field320);
        field649.method2099(var0);
    }

    @ObfuscatedName("client.j(I)V")
    public final void method374() {
        field820 = class379.method1540() + 500L;
        this.method1131();
        if (field763 != -1) {
            this.method996(true);
        }
    }

    @ObfuscatedName("client.fb(I)V")
    public void method1131() {
        int var1 = Statics.field1143;
        int var2 = Statics.field320;
        if (this.field315 < var1) {
            int var3 = this.field315;
        }
        if (this.field313 < var2) {
            int var4 = this.field313;
        }
        if (Statics.field988 != null) {
            try {
                class43.method335(Statics.field75, "resize", new Object[] { method2829() });
            } catch (Throwable var6) {
            }
        }
    }

    @ObfuscatedName("client.fd(S)V")
    public final void method991() {
        if (field763 != -1) {
            method3929(field763);
        }
        for (int var1 = 0; var1 < field810; var1++) {
            if (field812[var1]) {
                field813[var1] = true;
            }
            field705[var1] = field812[var1];
            field812[var1] = false;
        }
        field811 = field611;
        field693 = -1;
        field650 = -1;
        Statics.field580 = null;
        if (field763 != -1) {
            field810 = 0;
            method2996(field763, 0, 0, Statics.field1143, Statics.field320, 0, 0, -1);
        }
        class391.method6118();
        if (field772) {
            if (field782 == 1) {
                Statics.field145[field706 / 100].method6284(field704 - 8, field730 - 8);
            }
            if (field782 == 2) {
                Statics.field145[field706 / 100 + 4].method6284(field704 - 8, field730 - 8);
            }
        }
        if (field739) {
            method5251();
        } else if (field693 != -1) {
            method2725(field693, field650);
        }
        if (field613 == 3) {
            for (int var2 = 0; var2 < field810; var2++) {
                if (field705[var2]) {
                    class391.method6126(field677[var2], field672[var2], field817[var2], field818[var2], 16711935, 128);
                } else if (field813[var2]) {
                    class391.method6126(field677[var2], field672[var2], field817[var2], field818[var2], 16711680, 128);
                }
            }
        }
        class78.method4055(Statics.field201, Statics.field1374.field1232, Statics.field1374.field1210, field800);
        field800 = 0;
    }

    @ObfuscatedName("u.fn(Ljava/lang/String;ZI)V")
    public static final void method33(String arg0, boolean arg1) {
        if (!field718) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field122.method4814(arg0, 250);
        int var6 = Statics.field122.method4813(arg0, 250) * 13;
        class391.method6191(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class391.method6131(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field122.method4789(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        int var7 = var3 - var2;
        int var8 = var4 - var2;
        int var9 = var2 + var5 + var2;
        int var10 = var2 + var6 + var2;
        for (int var11 = 0; var11 < field810; var11++) {
            if (field817[var11] + field677[var11] > var7 && field677[var11] < var7 + var9 && field818[var11] + field672[var11] > var8 && field672[var11] < var8 + var10) {
                field812[var11] = true;
            }
        }
        if (arg1) {
            Statics.field330.method355(0, 0);
        } else {
            method1926(var3, var4, var5, var6);
        }
    }

    @ObfuscatedName("s.fj(IIIII)V")
    public static final void method198(int arg0, int arg1, int arg2, int arg3) {
        field701++;
        method4422();
        if (field722) {
            method1515(Statics.field1374, false);
        }
        if (field869 >= 0 && field849[field869] != null) {
            method1515(field849[field869], false);
        }
        method679(true);
        int var4 = class109.field1362;
        int[] var5 = class109.field1354;
        for (int var6 = 0; var6 < var4; var6++) {
            if (field869 != var5[var6] && field700 != var5[var6]) {
                method1515(field849[var5[var6]], true);
            }
        }
        method679(false);
        for (class85 var7 = (class85) field733.method4160(); var7 != null; var7 = (class85) field733.method4182()) {
            if (Statics.field201 != var7.field1025 || field611 > var7.field1028) {
                var7.method5354();
            } else if (field611 >= var7.field1030) {
                if (var7.field1034 > 0) {
                    class105 var8 = field643[var7.field1034 - 1];
                    if (var8 != null && var8.field1232 >= 0 && var8.field1232 < 13312 && var8.field1210 >= 0 && var8.field1210 < 13312) {
                        var7.method1712(var8.field1232, var8.field1210, method2142(var8.field1232, var8.field1210, var7.field1025) - var7.field1029, field611);
                    }
                }
                if (var7.field1034 < 0) {
                    int var9 = -var7.field1034 - 1;
                    class98 var10;
                    if (field700 == var9) {
                        var10 = Statics.field1374;
                    } else {
                        var10 = field849[var9];
                    }
                    if (var10 != null && var10.field1232 >= 0 && var10.field1232 < 13312 && var10.field1210 >= 0 && var10.field1210 < 13312) {
                        var7.method1712(var10.field1232, var10.field1210, method2142(var10.field1232, var10.field1210, var7.field1025) - var7.field1029, field611);
                    }
                }
                var7.method1713(field800);
                Statics.field1599.method3010(Statics.field201, (int) var7.field1031, (int) var7.field1026, (int) var7.field1038, 60, var7, var7.field1044, -1L, false);
            }
        }
        method5698();
        method5310(arg0, arg1, arg2, arg3, true);
        int var11 = field767;
        int var12 = field865;
        int var13 = field866;
        int var14 = field603;
        class391.method6119(var11, var12, var11 + var13, var12 + var14);
        class174.method2924();
        if (!field850) {
            int var15 = field632;
            if (field736 / 256 > var15) {
                var15 = field736 / 256;
            }
            if (field851[4] && field699[4] + 128 > var15) {
                var15 = field699[4] + 128;
            }
            int var16 = field673 & 0x7FF;
            method190(Statics.field48, Statics.field3545, Statics.field1359, var15, var16, method2736(var15), var14);
        }
        int var17;
        if (field850) {
            var17 = method244();
        } else {
            var17 = method27();
        }
        int var18 = Statics.field3371;
        int var19 = Statics.field1711;
        int var20 = Statics.field568;
        int var21 = Statics.field1607;
        int var22 = Statics.field558;
        for (int var23 = 0; var23 < 5; var23++) {
            if (field851[var23]) {
                int var24 = (int) (Math.random() * (double) (field602[var23] * 2 + 1) - (double) field602[var23] + Math.sin((double) field854[var23] / 100.0D * (double) field855[var23]) * (double) field699[var23]);
                if (var23 == 0) {
                    Statics.field3371 += var24;
                }
                if (var23 == 1) {
                    Statics.field1711 += var24;
                }
                if (var23 == 2) {
                    Statics.field568 += var24;
                }
                if (var23 == 3) {
                    Statics.field558 = Statics.field558 + var24 & 0x7FF;
                }
                if (var23 == 4) {
                    Statics.field1607 += var24;
                    if (Statics.field1607 < 128) {
                        Statics.field1607 = 128;
                    }
                    if (Statics.field1607 > 383) {
                        Statics.field1607 = 383;
                    }
                }
            }
        }
        int var25 = class48.field342;
        int var26 = class48.field357;
        if (class48.field355 != 0) {
            var25 = class48.field343;
            var26 = class48.field348;
        }
        if (var25 >= var11 && var25 < var11 + var13 && var26 >= var12 && var26 < var12 + var14) {
            int var27 = var25 - var11;
            int var28 = var26 - var12;
            class184.field2133 = var27;
            class184.field2134 = var28;
            class184.field2140 = true;
            class184.field2139 = 0;
            class184.field2135 = false;
        } else {
            class184.field2140 = false;
            class184.field2139 = 0;
        }
        method3342();
        class391.method6191(var11, var12, var13, var14, 0);
        method3342();
        int var29 = class174.field1912;
        class174.field1912 = field681;
        Statics.field1599.method3001(Statics.field3371, Statics.field1711, Statics.field568, Statics.field1607, Statics.field558, var17);
        class174.field1912 = var29;
        method3342();
        Statics.field1599.method3169();
        method3422(var11, var12, var13, var14);
        if (field809 == 2) {
            method157((field622 - Statics.field1795 << 7) + field625, (field623 - Statics.field1892 << 7) + field769, field608 * 2);
            if (field702 > -1 && field611 % 20 < 10) {
                Statics.field1069[0].method6284(field702 + var11 - 12, field814 + var12 - 28);
            }
        }
        ((class181) Statics.field1921).method3232(field800);
        field717 = 0;
        int var30 = (Statics.field1374.field1232 >> 7) + Statics.field1795;
        int var31 = (Statics.field1374.field1210 >> 7) + Statics.field1892;
        if (var30 >= 3053 && var30 <= 3156 && var31 >= 3056 && var31 <= 3136) {
            field717 = 1;
        }
        if (var30 >= 3072 && var30 <= 3118 && var31 >= 9492 && var31 <= 9535) {
            field717 = 1;
        }
        if (field717 == 1 && var30 >= 3139 && var30 <= 3199 && var31 >= 3008 && var31 <= 3062) {
            field717 = 0;
        }
        Statics.field3371 = var18;
        Statics.field1711 = var19;
        Statics.field568 = var20;
        Statics.field1607 = var21;
        Statics.field558 = var22;
        if (field665 && class254.method3415(true, false) == 0) {
            field665 = false;
        }
        if (field665) {
            class391.method6191(var11, var12, var13, var14, 0);
            method33(class246.field2990, false);
        }
    }

    @ObfuscatedName("lj.gv(IIIIZI)V")
    public static final void method5310(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var5 = arg3 - 334;
        int var6;
        if (var5 < 0) {
            var6 = field856;
        } else if (var5 >= 100) {
            var6 = field857;
        } else {
            var6 = (field857 - field856) * var5 / 100 + field856;
        }
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field708) {
            short var8 = field708;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field743) {
                var6 = field743;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class391.method6118();
                    class391.method6191(arg0, arg1, var10, arg3, -16777216);
                    class391.method6191(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field863) {
            short var11 = field863;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field860) {
                var6 = field860;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class391.method6118();
                    class391.method6191(arg0, arg1, arg2, var13, -16777216);
                    class391.method6191(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field681 = arg3 * var6 / 334;
        if (field866 != arg2 || field603 != arg3) {
            int[] var14 = new int[9];
            for (int var15 = 0; var15 < var14.length; var15++) {
                int var16 = var15 * 32 + 128 + 15;
                int var17 = method2736(var16);
                int var18 = class174.field1924[var16];
                int var19 = arg3 - 334;
                if (var19 < 0) {
                    var19 = 0;
                } else if (var19 > 100) {
                    var19 = 100;
                }
                int var20 = (field859 - field683) * var19 / 100 + field683;
                int var21 = var17 * var20 / 256;
                var14[var15] = var18 * var21 >> 16;
            }
            class176.method3034(var14, 500, 800, arg2 * 334 / arg3, 334);
        }
        field767 = arg0;
        field865 = arg1;
        field866 = arg2;
        field603 = arg3;
    }

    @ObfuscatedName("ji.gj(I)V")
    public static void method4422() {
        if (Statics.field1374.field1232 >> 7 == field839 && Statics.field1374.field1210 >> 7 == field840) {
            field839 = 0;
        }
    }

    @ObfuscatedName("bl.ge(Lcs;ZI)V")
    public static void method1515(class98 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method1857() || arg0.field1185) {
            return;
        }
        arg0.field1175 = false;
        if ((field604 && class109.field1362 > 50 || class109.field1362 > 200) && arg1 && arg0.field1261 == arg0.field1211) {
            arg0.field1175 = true;
        }
        int var2 = arg0.field1232 >> 7;
        int var3 = arg0.field1210 >> 7;
        if (var2 < 0 || var2 >= 104 || var3 < 0 || var3 >= 104) {
            return;
        }
        long var4 = class184.method1978(0, 0, 0, false, arg0.field1187);
        if (arg0.field1184 != null && field611 >= arg0.field1173 && field611 < arg0.field1174) {
            arg0.field1175 = false;
            arg0.field1182 = method2142(arg0.field1232, arg0.field1210, Statics.field201);
            arg0.field1251 = field611;
            Statics.field1599.method3011(Statics.field201, arg0.field1232, arg0.field1210, arg0.field1182, 60, arg0, arg0.field1213, var4, arg0.field1188, arg0.field1180, arg0.field1181, arg0.field1177);
            return;
        }
        if ((arg0.field1232 & 0x7F) == 64 && (arg0.field1210 & 0x7F) == 64) {
            if (field701 == field617[var2][var3]) {
                return;
            }
            field617[var2][var3] = field701;
        }
        arg0.field1182 = method2142(arg0.field1232, arg0.field1210, Statics.field201);
        arg0.field1251 = field611;
        Statics.field1599.method3010(Statics.field201, arg0.field1232, arg0.field1210, arg0.field1182, 60, arg0, arg0.field1213, var4, arg0.field1212);
    }

    @ObfuscatedName("bn.gr(ZB)V")
    public static final void method679(boolean arg0) {
        for (int var1 = 0; var1 < field644; var1++) {
            class105 var2 = field643[field645[var1]];
            if (var2 != null && var2.method1857() && var2.field1319.field3499 == arg0 && var2.field1319.method4432()) {
                int var3 = var2.field1232 >> 7;
                int var4 = var2.field1210 >> 7;
                if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
                    if (var2.field1259 == 1 && (var2.field1232 & 0x7F) == 64 && (var2.field1210 & 0x7F) == 64) {
                        if (field701 == field617[var3][var4]) {
                            continue;
                        }
                        field617[var3][var4] = field701;
                    }
                    long var5 = class184.method1978(0, 0, 1, !var2.field1319.field3507, field645[var1]);
                    var2.field1251 = field611;
                    Statics.field1599.method3010(Statics.field201, var2.field1232, var2.field1210, method2142(var2.field1232 + (var2.field1259 * 64 - 64), var2.field1210 + (var2.field1259 * 64 - 64), Statics.field201), var2.field1259 * 64 - 64 + 60, var2, var2.field1213, var5, var2.field1212);
                }
            }
        }
    }

    @ObfuscatedName("ni.gk(I)V")
    public static final void method5698() {
        for (class80 var0 = (class80) field734.method4160(); var0 != null; var0 = (class80) field734.method4182()) {
            if (Statics.field201 != var0.field956 || var0.field963) {
                var0.method5354();
            } else if (field611 >= var0.field955) {
                var0.method1648(field800);
                if (var0.field963) {
                    var0.method5354();
                } else {
                    Statics.field1599.method3010(var0.field956, var0.field957, var0.field958, var0.field954, 60, var0, 0, -1L, false);
                }
            }
        }
    }

    @ObfuscatedName("u.gs(I)I")
    public static final int method27() {
        if (Statics.field988.field1311) {
            return Statics.field201;
        }
        int var0 = 3;
        if (Statics.field1607 < 310) {
            int var1;
            int var2;
            if (field678 == 1) {
                var1 = Statics.field48 >> 7;
                var2 = Statics.field1359 >> 7;
            } else {
                var1 = Statics.field1374.field1232 >> 7;
                var2 = Statics.field1374.field1210 >> 7;
            }
            int var3 = Statics.field3371 >> 7;
            int var4 = Statics.field568 >> 7;
            if (var3 < 0 || var4 < 0 || var3 >= 104 || var4 >= 104) {
                return Statics.field201;
            }
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field201;
            }
            if ((class90.field1091[Statics.field201][var3][var4] & 0x4) != 0) {
                var0 = Statics.field201;
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
                    if ((class90.field1091[Statics.field201][var3][var4] & 0x4) != 0) {
                        var0 = Statics.field201;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var4 < var2) {
                            var4++;
                        } else if (var4 > var2) {
                            var4--;
                        }
                        if ((class90.field1091[Statics.field201][var3][var4] & 0x4) != 0) {
                            var0 = Statics.field201;
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
                    if ((class90.field1091[Statics.field201][var3][var4] & 0x4) != 0) {
                        var0 = Statics.field201;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var3 < var1) {
                            var3++;
                        } else if (var3 > var1) {
                            var3--;
                        }
                        if ((class90.field1091[Statics.field201][var3][var4] & 0x4) != 0) {
                            var0 = Statics.field201;
                        }
                    }
                }
            }
        }
        if (Statics.field1374.field1232 >= 0 && Statics.field1374.field1210 >= 0 && Statics.field1374.field1232 < 13312 && Statics.field1374.field1210 < 13312) {
            if ((class90.field1091[Statics.field201][Statics.field1374.field1232 >> 7][Statics.field1374.field1210 >> 7] & 0x4) != 0) {
                var0 = Statics.field201;
            }
            return var0;
        } else {
            return Statics.field201;
        }
    }

    @ObfuscatedName("ap.gn(I)I")
    public static final int method244() {
        if (Statics.field988.field1311) {
            return Statics.field201;
        } else {
            int var0 = method2142(Statics.field3371, Statics.field568, Statics.field201);
            return var0 - Statics.field1711 >= 800 || (class90.field1091[Statics.field201][Statics.field3371 >> 7][Statics.field568 >> 7] & 0x4) == 0 ? 3 : Statics.field201;
        }
    }

    @ObfuscatedName("bm.gh(B)Z")
    public static boolean method969() {
        return (field796 & 0x2) != 0;
    }

    @ObfuscatedName("bh.gb(I)Z")
    public static boolean method658() {
        return (field796 & 0x8) != 0;
    }

    @ObfuscatedName("gg.gd(IIIII)V")
    public static final void method3422(int arg0, int arg1, int arg2, int arg3) {
        field655 = 0;
        boolean var4 = false;
        int var5 = -1;
        int var6 = -1;
        int var7 = class109.field1362;
        int[] var8 = class109.field1354;
        for (int var9 = 0; var9 < field644 + var7; var9++) {
            class100 var10;
            if (var9 < var7) {
                var10 = field849[var8[var9]];
                if (field869 == var8[var9]) {
                    var4 = true;
                    var5 = var9;
                    continue;
                }
                if (Statics.field1374 == var10) {
                    var6 = var9;
                    continue;
                }
            } else {
                var10 = field643[field645[var9 - var7]];
            }
            Statics.method5023(var10, var9, arg0, arg1, arg2, arg3);
        }
        if (field722 && var6 != -1) {
            Statics.method5023(Statics.field1374, var6, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            Statics.method5023(field849[field869], var5, arg0, arg1, arg2, arg3);
        }
        for (int var11 = 0; var11 < field655; var11++) {
            int var12 = field692[var11];
            int var13 = field867[var11];
            int var14 = field720[var11];
            int var15 = field694[var11];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var17 = 0; var17 < var11; var17++) {
                    if (var13 + 2 > field867[var17] - field694[var17] && var13 - var15 < field867[var17] + 2 && var12 - var14 < field720[var17] + field692[var17] && var12 + var14 > field692[var17] - field720[var17] && field867[var17] - field694[var17] < var13) {
                        var13 = field867[var17] - field694[var17];
                        var16 = true;
                    }
                }
            }
            field702 = field692[var11];
            field814 = field867[var11] = var13;
            String var18 = field861[var11];
            if (field707 == 0) {
                int var19 = 16776960;
                if (field696[var11] < 6) {
                    var19 = field822[field696[var11]];
                }
                if (field696[var11] == 6) {
                    var19 = field701 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field696[var11] == 7) {
                    var19 = field701 % 20 < 10 ? 255 : 65535;
                }
                if (field696[var11] == 8) {
                    var19 = field701 % 20 < 10 ? 45056 : 8454016;
                }
                if (field696[var11] == 9) {
                    int var20 = 150 - field698[var11];
                    if (var20 < 50) {
                        var19 = var20 * 1280 + 16711680;
                    } else if (var20 < 100) {
                        var19 = 16776960 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var19 = (var20 - 100) * 5 + 65280;
                    }
                }
                if (field696[var11] == 10) {
                    int var21 = 150 - field698[var11];
                    if (var21 < 50) {
                        var19 = var21 * 5 + 16711680;
                    } else if (var21 < 100) {
                        var19 = 16711935 - (var21 - 50) * 327680;
                    } else if (var21 < 150) {
                        var19 = (var21 - 100) * 327680 + 255 - (var21 - 100) * 5;
                    }
                }
                if (field696[var11] == 11) {
                    int var22 = 150 - field698[var11];
                    if (var22 < 50) {
                        var19 = 16777215 - var22 * 327685;
                    } else if (var22 < 100) {
                        var19 = (var22 - 50) * 327685 + 65280;
                    } else if (var22 < 150) {
                        var19 = 16777215 - (var22 - 100) * 327680;
                    }
                }
                if (field633[var11] == 0) {
                    Statics.field4121.method4788(var18, field702 + arg0, field814 + arg1, var19, 0);
                }
                if (field633[var11] == 1) {
                    Statics.field4121.method4790(var18, field702 + arg0, field814 + arg1, var19, 0, field701);
                }
                if (field633[var11] == 2) {
                    Statics.field4121.method4791(var18, field702 + arg0, field814 + arg1, var19, 0, field701);
                }
                if (field633[var11] == 3) {
                    Statics.field4121.method4792(var18, field702 + arg0, field814 + arg1, var19, 0, field701, 150 - field698[var11]);
                }
                if (field633[var11] == 4) {
                    int var23 = (150 - field698[var11]) * (Statics.field4121.method4781(var18) + 100) / 150;
                    class391.method6120(field702 + arg0 - 50, arg1, field702 + arg0 + 50, arg1 + arg3);
                    Statics.field4121.method4785(var18, field702 + arg0 + 50 - var23, field814 + arg1, var19, 0);
                    class391.method6119(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field633[var11] == 5) {
                    int var24 = 150 - field698[var11];
                    int var25 = 0;
                    if (var24 < 25) {
                        var25 = var24 - 25;
                    } else if (var24 > 125) {
                        var25 = var24 - 125;
                    }
                    class391.method6120(arg0, field814 + arg1 - Statics.field4121.field3732 - 1, arg0 + arg2, field814 + arg1 + 5);
                    Statics.field4121.method4788(var18, field702 + arg0, field814 + arg1 + var25, var19, 0);
                    class391.method6119(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field4121.method4788(var18, field702 + arg0, field814 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("bg.gq(Lcd;II)V")
    public static final void method936(class100 arg0, int arg1) {
        method157(arg0.field1232, arg0.field1210, arg1);
    }

    @ObfuscatedName("j.gp(IIIB)V")
    public static final void method157(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field702 = -1;
            field814 = -1;
            return;
        }
        int var3 = method2142(arg0, arg1, Statics.field201) - arg2;
        int var4 = arg0 - Statics.field3371;
        int var5 = var3 - Statics.field1711;
        int var6 = arg1 - Statics.field568;
        int var7 = class174.field1924[Statics.field1607];
        int var8 = class174.field1909[Statics.field1607];
        int var9 = class174.field1924[Statics.field558];
        int var10 = class174.field1909[Statics.field558];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field702 = field681 * var11 / var15 + field866 / 2;
            field814 = field681 * var14 / var15 + field603 / 2;
        } else {
            field702 = -1;
            field814 = -1;
        }
    }

    @ObfuscatedName("dh.gu(IIII)I")
    public static final int method2142(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class90.field1091[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class90.field1090[var5][var3][var4] + class90.field1090[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class90.field1090[var5][var3][var4 + 1] + class90.field1090[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("a.go(IIIIIIIB)V")
    public static final void method190(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg6 - 334;
        if (var7 < 0) {
            var7 = 0;
        } else if (var7 > 100) {
            var7 = 100;
        }
        int var8 = (field859 - field683) * var7 / 100 + field683;
        int var9 = arg5 * var8 / 256;
        int var11 = 2048 - arg3 & 0x7FF;
        int var12 = 2048 - arg4 & 0x7FF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var9;
        if (var11 != 0) {
            int var16 = class174.field1924[var11];
            int var17 = class174.field1909[var11];
            int var18 = var14 * var17 - var9 * var16 >> 16;
            var15 = var14 * var16 + var9 * var17 >> 16;
            var14 = var18;
        }
        if (var12 != 0) {
            int var19 = class174.field1924[var12];
            int var20 = class174.field1909[var12];
            int var21 = var13 * var20 + var15 * var19 >> 16;
            var15 = var15 * var20 - var13 * var19 >> 16;
            var13 = var21;
        }
        Statics.field3371 = arg0 - var13;
        Statics.field1711 = arg1 - var14;
        Statics.field568 = arg2 - var15;
        Statics.field1607 = arg3;
        Statics.field558 = arg4;
        if (field678 == 1 && field797 >= 2 && field611 % 50 == 0 && (Statics.field48 >> 7 != Statics.field1374.field1232 >> 7 || Statics.field1359 >> 7 != Statics.field1374.field1210 >> 7)) {
            int var22 = Statics.field1374.field1186;
            int var23 = (Statics.field48 >> 7) + Statics.field1795;
            int var24 = (Statics.field1359 >> 7) + Statics.field1892;
            method79(var23, var24, var22, true);
        }
    }

    @ObfuscatedName("dq.gz(ZLnk;B)V")
    public static final void method1986(boolean arg0, class381 arg1) {
        field662 = arg0;
        if (!field662) {
            int var2 = arg1.method6042();
            int var3 = arg1.method5893();
            int var4 = arg1.method5858();
            Statics.field1318 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field1318[var5][var6] = arg1.method5861();
                }
            }
            Statics.field102 = new int[var4];
            Statics.field1552 = new int[var4];
            Statics.field143 = new int[var4];
            Statics.field126 = new byte[var4][];
            Statics.field359 = new byte[var4][];
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
                        Statics.field102[var8] = var11;
                        Statics.field1552[var8] = Statics.field1735.method3950("m" + var9 + "_" + var10);
                        Statics.field143[var8] = Statics.field1735.method3950("l" + var9 + "_" + var10);
                        var8++;
                    }
                }
            }
            method1913(var2, var3, true);
            return;
        }
        boolean var12 = arg1.method5899() == 1;
        int var13 = arg1.method6042();
        int var14 = arg1.method6042();
        int var15 = arg1.method5858();
        arg1.method5807();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = arg1.method5801(1);
                    if (var19 == 1) {
                        field663[var16][var17][var18] = arg1.method5801(26);
                    } else {
                        field663[var16][var17][var18] = -1;
                    }
                }
            }
        }
        arg1.method5804();
        Statics.field1318 = new int[var15][4];
        for (int var20 = 0; var20 < var15; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field1318[var20][var21] = arg1.method5861();
            }
        }
        Statics.field102 = new int[var15];
        Statics.field1552 = new int[var15];
        Statics.field143 = new int[var15];
        Statics.field126 = new byte[var15][];
        Statics.field359 = new byte[var15][];
        int var22 = 0;
        for (int var23 = 0; var23 < 4; var23++) {
            for (int var24 = 0; var24 < 13; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    int var26 = field663[var23][var24][var25];
                    if (var26 != -1) {
                        int var27 = var26 >> 14 & 0x3FF;
                        int var28 = var26 >> 3 & 0x7FF;
                        int var29 = (var27 / 8 << 8) + var28 / 8;
                        for (int var30 = 0; var30 < var22; var30++) {
                            if (Statics.field102[var30] == var29) {
                                var29 = -1;
                                break;
                            }
                        }
                        if (var29 != -1) {
                            Statics.field102[var22] = var29;
                            int var31 = var29 >> 8 & 0xFF;
                            int var32 = var29 & 0xFF;
                            Statics.field1552[var22] = Statics.field1735.method3950("m" + var31 + "_" + var32);
                            Statics.field143[var22] = Statics.field1735.method3950("l" + var31 + "_" + var32);
                            var22++;
                        }
                    }
                }
            }
        }
        method1913(var13, var14, !var12);
    }

    @ObfuscatedName("ci.gf(IIZB)V")
    public static final void method1913(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field1328 == arg0 && Statics.field3358 == arg1) {
            return;
        }
        Statics.field1328 = arg0;
        Statics.field3358 = arg1;
        method184(25);
        method33(class246.field2990, true);
        int var3 = Statics.field1795;
        int var4 = Statics.field1892;
        Statics.field1795 = (arg0 - 6) * 8;
        Statics.field1892 = (arg1 - 6) * 8;
        int var5 = Statics.field1795 - var3;
        int var6 = Statics.field1892 - var4;
        int var7 = Statics.field1795;
        int var8 = Statics.field1892;
        for (int var9 = 0; var9 < 32768; var9++) {
            class105 var10 = field643[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1265[var11] -= var5;
                    var10.field1266[var11] -= var6;
                }
                var10.field1232 -= var5 * 128;
                var10.field1210 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class98 var13 = field849[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1265[var14] -= var5;
                    var13.field1266[var14] -= var6;
                }
                var13.field1232 -= var5 * 128;
                var13.field1210 -= var6 * 128;
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
                        field731[var25][var21][var22] = field731[var25][var23][var24];
                    } else {
                        field731[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class99 var26 = (class99) field732.method4160(); var26 != null; var26 = (class99) field732.method4182()) {
            var26.field1196 -= var5;
            var26.field1198 -= var6;
            if (var26.field1196 < 0 || var26.field1198 < 0 || var26.field1196 >= 104 || var26.field1198 >= 104) {
                var26.method5354();
            }
        }
        if (field839 != 0) {
            field839 -= var5;
            field840 -= var6;
        }
        field844 = 0;
        field850 = false;
        Statics.field3371 -= var5 << 7;
        Statics.field568 -= var6 << 7;
        Statics.field48 -= var5 << 7;
        Statics.field1359 -= var6 << 7;
        field834 = -1;
        field734.method4154();
        field733.method4154();
        for (int var27 = 0; var27 < 4; var27++) {
            field661[var27].method2301();
        }
    }

    @ObfuscatedName("z.gw(ZI)V")
    public static final void method185(boolean arg0) {
        method3342();
        field649.field1391++;
        if (field649.field1391 < 50 && !arg0) {
            return;
        }
        field649.field1391 = 0;
        if (field738 || field649.method2088() == null) {
            return;
        }
        class205 var1 = class205.method4631(class203.field2272, field649.field1385);
        field649.method2099(var1);
        try {
            field649.method2084();
        } catch (IOException var3) {
            field738 = true;
        }
    }

    @ObfuscatedName("dl.gm(I)V")
    public static final void method2054() {
        method185(false);
        field656 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field126.length; var1++) {
            if (Statics.field1552[var1] != -1 && Statics.field126[var1] == null) {
                Statics.field126[var1] = Statics.field1735.method3933(Statics.field1552[var1], 0);
                if (Statics.field126[var1] == null) {
                    var0 = false;
                    field656++;
                }
            }
            if (Statics.field143[var1] != -1 && Statics.field359[var1] == null) {
                Statics.field359[var1] = Statics.field1735.method3934(Statics.field143[var1], 0, Statics.field1318[var1]);
                if (Statics.field359[var1] == null) {
                    var0 = false;
                    field656++;
                }
            }
        }
        if (!var0) {
            field660 = 1;
            return;
        }
        field658 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field126.length; var3++) {
            byte[] var4 = Statics.field359[var3];
            if (var4 != null) {
                int var5 = (Statics.field102[var3] >> 8) * 64 - Statics.field1795;
                int var6 = (Statics.field102[var3] & 0xFF) * 64 - Statics.field1892;
                if (field662) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class90.method1827(var4, var5, var6);
            }
        }
        if (!var2) {
            field660 = 2;
            return;
        }
        if (field660 != 0) {
            method33(class246.field2990 + class106.field1320 + class106.field1323 + 100 + "%" + class106.field1324, true);
        }
        method3342();
        Statics.field1599.method2999();
        for (int var7 = 0; var7 < 4; var7++) {
            field661[var7].method2301();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class90.field1091[var8][var9][var10] = 0;
                }
            }
        }
        method3342();
        class90.field1103 = 99;
        Statics.field70 = new byte[4][104][104];
        Statics.field1093 = new byte[4][104][104];
        Statics.field1092 = new byte[4][104][104];
        Statics.field4080 = new byte[4][104][104];
        Statics.field2490 = new int[4][105][105];
        Statics.field1107 = new byte[4][105][105];
        Statics.field1571 = new int[105][105];
        Statics.field1094 = new int[104];
        Statics.field1096 = new int[104];
        Statics.field1097 = new int[104];
        Statics.field596 = new int[104];
        Statics.field4137 = new int[104];
        int var11 = Statics.field126.length;
        for (class78 var12 = (class78) class78.field920.method4160(); var12 != null; var12 = (class78) class78.field920.method4182()) {
            if (var12.field921 != null) {
                Statics.field2784.method553(var12.field921);
                var12.field921 = null;
            }
            if (var12.field924 != null) {
                Statics.field2784.method553(var12.field924);
                var12.field924 = null;
            }
        }
        class78.field920.method4154();
        method185(true);
        if (!field662) {
            for (int var13 = 0; var13 < var11; var13++) {
                int var14 = (Statics.field102[var13] >> 8) * 64 - Statics.field1795;
                int var15 = (Statics.field102[var13] & 0xFF) * 64 - Statics.field1892;
                byte[] var16 = Statics.field126[var13];
                if (var16 != null) {
                    method3342();
                    Statics.method1843(var16, var14, var15, Statics.field1328 * 8 - 48, Statics.field3358 * 8 - 48, field661);
                }
            }
            for (int var17 = 0; var17 < var11; var17++) {
                int var18 = (Statics.field102[var17] >> 8) * 64 - Statics.field1795;
                int var19 = (Statics.field102[var17] & 0xFF) * 64 - Statics.field1892;
                byte[] var20 = Statics.field126[var17];
                if (var20 == null && Statics.field3358 < 800) {
                    method3342();
                    int var21 = var18;
                    int var22 = var19;
                    byte var23 = 64;
                    byte var24 = 64;
                    for (int var25 = var19; var25 <= var22 + var24; var25++) {
                        for (int var26 = var21; var26 <= var21 + var23; var26++) {
                            if (var26 >= 0 && var26 < 104 && var25 >= 0 && var25 < 104) {
                                Statics.field1107[0][var26][var25] = 127;
                                if (var21 == var26 && var26 > 0) {
                                    class90.field1090[0][var26][var25] = class90.field1090[0][var26 - 1][var25];
                                }
                                if (var21 + var23 == var26 && var26 < 103) {
                                    class90.field1090[0][var26][var25] = class90.field1090[0][var26 + 1][var25];
                                }
                                if (var22 == var25 && var25 > 0) {
                                    class90.field1090[0][var26][var25] = class90.field1090[0][var26][var25 - 1];
                                }
                                if (var22 + var24 == var25 && var25 < 103) {
                                    class90.field1090[0][var26][var25] = class90.field1090[0][var26][var25 + 1];
                                }
                            }
                        }
                    }
                }
            }
            method185(true);
            for (int var27 = 0; var27 < var11; var27++) {
                byte[] var28 = Statics.field359[var27];
                if (var28 != null) {
                    int var29 = (Statics.field102[var27] >> 8) * 64 - Statics.field1795;
                    int var30 = (Statics.field102[var27] & 0xFF) * 64 - Statics.field1892;
                    method3342();
                    class90.method3865(var28, var29, var30, Statics.field1599, field661);
                }
            }
        }
        if (field662) {
            for (int var31 = 0; var31 < 4; var31++) {
                method3342();
                for (int var32 = 0; var32 < 13; var32++) {
                    for (int var33 = 0; var33 < 13; var33++) {
                        boolean var34 = false;
                        int var35 = field663[var31][var32][var33];
                        if (var35 != -1) {
                            int var36 = var35 >> 24 & 0x3;
                            int var37 = var35 >> 1 & 0x3;
                            int var38 = var35 >> 14 & 0x3FF;
                            int var39 = var35 >> 3 & 0x7FF;
                            int var40 = (var38 / 8 << 8) + var39 / 8;
                            for (int var41 = 0; var41 < Statics.field102.length; var41++) {
                                if (Statics.field102[var41] == var40 && Statics.field126[var41] != null) {
                                    class90.method71(Statics.field126[var41], var31, var32 * 8, var33 * 8, var36, (var38 & 0x7) * 8, (var39 & 0x7) * 8, var37, field661);
                                    var34 = true;
                                    break;
                                }
                            }
                        }
                        if (!var34) {
                            class90.method205(var31, var32 * 8, var33 * 8);
                        }
                    }
                }
            }
            for (int var42 = 0; var42 < 13; var42++) {
                for (int var43 = 0; var43 < 13; var43++) {
                    int var44 = field663[0][var42][var43];
                    if (var44 == -1) {
                        int var45 = var42 * 8;
                        int var46 = var43 * 8;
                        byte var47 = 8;
                        byte var48 = 8;
                        for (int var49 = var46; var49 <= var46 + var48; var49++) {
                            for (int var50 = var45; var50 <= var45 + var47; var50++) {
                                if (var50 >= 0 && var50 < 104 && var49 >= 0 && var49 < 104) {
                                    Statics.field1107[0][var50][var49] = 127;
                                    if (var45 == var50 && var50 > 0) {
                                        class90.field1090[0][var50][var49] = class90.field1090[0][var50 - 1][var49];
                                    }
                                    if (var45 + var47 == var50 && var50 < 103) {
                                        class90.field1090[0][var50][var49] = class90.field1090[0][var50 + 1][var49];
                                    }
                                    if (var46 == var49 && var49 > 0) {
                                        class90.field1090[0][var50][var49] = class90.field1090[0][var50][var49 - 1];
                                    }
                                    if (var46 + var48 == var49 && var49 < 103) {
                                        class90.field1090[0][var50][var49] = class90.field1090[0][var50][var49 + 1];
                                    }
                                }
                            }
                        }
                    }
                }
            }
            method185(true);
            for (int var51 = 0; var51 < 4; var51++) {
                method3342();
                for (int var52 = 0; var52 < 13; var52++) {
                    for (int var53 = 0; var53 < 13; var53++) {
                        int var54 = field663[var51][var52][var53];
                        if (var54 != -1) {
                            int var55 = var54 >> 24 & 0x3;
                            int var56 = var54 >> 1 & 0x3;
                            int var57 = var54 >> 14 & 0x3FF;
                            int var58 = var54 >> 3 & 0x7FF;
                            int var59 = (var57 / 8 << 8) + var58 / 8;
                            for (int var60 = 0; var60 < Statics.field102.length; var60++) {
                                if (Statics.field102[var60] == var59 && Statics.field359[var60] != null) {
                                    class90.method2734(Statics.field359[var60], var51, var52 * 8, var53 * 8, var55, (var57 & 0x7) * 8, (var58 & 0x7) * 8, var56, Statics.field1599, field661);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method185(true);
        method3342();
        class90.method504(Statics.field1599, field661);
        method185(true);
        int var61 = class90.field1103;
        if (var61 > Statics.field201) {
            var61 = Statics.field201;
        }
        if (var61 < Statics.field201 - 1) {
            int var62 = Statics.field201 - 1;
        }
        if (field604) {
            Statics.field1599.method3000(class90.field1103);
        } else {
            Statics.field1599.method3000(0);
        }
        for (int var63 = 0; var63 < 104; var63++) {
            for (int var64 = 0; var64 < 104; var64++) {
                method3794(var63, var64);
            }
        }
        method3342();
        method3930();
        class295.field3592.method3392();
        if (Statics.field75.method386()) {
            class205 var65 = class205.method4631(class203.field2313, field649.field1385);
            var65.field2342.method5842(1057001181);
            field649.method2099(var65);
        }
        if (!field662) {
            int var66 = (Statics.field1328 - 6) / 8;
            int var67 = (Statics.field1328 + 6) / 8;
            int var68 = (Statics.field3358 - 6) / 8;
            int var69 = (Statics.field3358 + 6) / 8;
            for (int var70 = var66 - 1; var70 <= var67 + 1; var70++) {
                for (int var71 = var68 - 1; var71 <= var69 + 1; var71++) {
                    if (var70 < var66 || var70 > var67 || var71 < var68 || var71 > var69) {
                        Statics.field1735.method3956("m" + var70 + "_" + var71);
                        Statics.field1735.method3956("l" + var70 + "_" + var71);
                    }
                }
            }
        }
        method184(30);
        method3342();
        class90.method929();
        class205 var72 = class205.method4631(class203.field2237, field649.field1385);
        field649.method2099(var72);
        Statics.field512.method2208();
        for (int var73 = 0; var73 < 32; var73++) {
            field331[var73] = 0L;
        }
        for (int var74 = 0; var74 < 32; var74++) {
            field314[var74] = 0L;
        }
        Statics.field2807 = 0;
    }

    @ObfuscatedName("j.gt(IB)V")
    public static final void method160(int arg0) {
        int[] var1 = Statics.field149.field4247;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class90.field1091[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field1599.method3155(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class90.field1091[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field1599.method3155(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field149.method6230();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class90.field1091[arg0][var10][var9] & 0x18) == 0) {
                    method6199(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class90.field1091[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method6199(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field835 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                long var13 = Statics.field1599.method3076(Statics.field201, var11, var12);
                if (var13 != 0L) {
                    int var15 = class184.method2752(var13);
                    int var16 = class295.method182(var15).field3617;
                    if (var16 >= 0 && class280.method4995(var16).field3413) {
                        field838[field835] = class280.method4995(var16).method4344(false);
                        field836[field835] = var11;
                        field837[field835] = var12;
                        field835++;
                    }
                }
            }
        }
        Statics.field330.method6196();
    }

    @ObfuscatedName("oe.gx(IIIIIB)V")
    public static final void method6199(int arg0, int arg1, int arg2, int arg3, int arg4) {
        long var5 = Statics.field1599.method3066(arg0, arg1, arg2);
        if (var5 != 0L) {
            int var7 = Statics.field1599.method3029(arg0, arg1, arg2, var5);
            int var8 = var7 >> 6 & 0x3;
            int var9 = var7 & 0x1F;
            int var10 = arg3;
            boolean var11 = var5 != 0L && !class184.method84(var5);
            if (var11) {
                var10 = arg4;
            }
            int[] var12 = Statics.field149.field4247;
            int var13 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var14 = class184.method2752(var5);
            class295 var15 = class295.method182(var14);
            if (var15.field3618 == -1) {
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
                class394 var16 = Statics.field144[var15.field3618];
                if (var16 != null) {
                    int var17 = (var15.field3604 * 4 - var16.field4236) / 2;
                    int var18 = (var15.field3588 * 4 - var16.field4239) / 2;
                    var16.method6207(arg1 * 4 + 48 + var17, (104 - arg2 - var15.field3588) * 4 + 48 + var18);
                }
            }
        }
        long var19 = Statics.field1599.method3025(arg0, arg1, arg2);
        if (var19 != 0L) {
            int var21 = Statics.field1599.method3029(arg0, arg1, arg2, var19);
            int var22 = var21 >> 6 & 0x3;
            int var23 = var21 & 0x1F;
            int var24 = class184.method2752(var19);
            class295 var25 = class295.method182(var24);
            if (var25.field3618 != -1) {
                class394 var26 = Statics.field144[var25.field3618];
                if (var26 != null) {
                    int var27 = (var25.field3604 * 4 - var26.field4236) / 2;
                    int var28 = (var25.field3588 * 4 - var26.field4239) / 2;
                    var26.method6207(arg1 * 4 + 48 + var27, (104 - arg2 - var25.field3588) * 4 + 48 + var28);
                }
            } else if (var23 == 9) {
                int var29 = 15658734;
                boolean var30 = var19 != 0L && !class184.method84(var19);
                if (var30) {
                    var29 = 15597568;
                }
                int[] var31 = Statics.field149.field4247;
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
        long var33 = Statics.field1599.method3076(arg0, arg1, arg2);
        if (var33 == 0L) {
            return;
        }
        int var35 = class184.method2752(var33);
        class295 var36 = class295.method182(var35);
        if (var36.field3618 == -1) {
            return;
        }
        class394 var37 = Statics.field144[var36.field3618];
        if (var37 != null) {
            int var38 = (var36.field3604 * 4 - var37.field4236) / 2;
            int var39 = (var36.field3588 * 4 - var37.field4239) / 2;
            var37.method6207(arg1 * 4 + 48 + var38, (104 - arg2 - var36.field3588) * 4 + 48 + var39);
        }
    }

    @ObfuscatedName("client.gl(Ldn;I)Z")
    public final boolean method992(class112 arg0) {
        class328 var2 = arg0.method2088();
        class381 var3 = arg0.field1386;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1387 == null) {
                if (arg0.field1389) {
                    if (!var2.method2262(1)) {
                        return false;
                    }
                    var2.method2291(arg0.field1386.field4153, 0, 1);
                    arg0.field1392 = 0;
                    arg0.field1389 = false;
                }
                var3.field4155 = 0;
                if (var3.method5805()) {
                    if (!var2.method2262(1)) {
                        return false;
                    }
                    var2.method2291(arg0.field1386.field4153, 1, 1);
                    arg0.field1392 = 0;
                }
                arg0.field1389 = true;
                class206[] var4 = class206.method2836();
                int var5 = var3.method5826();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field4155);
                }
                arg0.field1387 = var4[var5];
                arg0.field1388 = arg0.field1387.field2421;
            }
            if (arg0.field1388 == -1) {
                if (!var2.method2262(1)) {
                    return false;
                }
                arg0.method2088().method2291(var3.field4153, 0, 1);
                arg0.field1388 = var3.field4153[0] & 0xFF;
            }
            if (arg0.field1388 == -2) {
                if (!var2.method2262(2)) {
                    return false;
                }
                arg0.method2088().method2291(var3.field4153, 0, 2);
                var3.field4155 = 0;
                arg0.field1388 = var3.method5858();
            }
            if (!var2.method2262(arg0.field1388)) {
                return false;
            }
            var3.field4155 = 0;
            var2.method2291(var3.field4153, 0, arg0.field1388);
            arg0.field1392 = 0;
            field858.method4996();
            arg0.field1394 = arg0.field1393;
            arg0.field1393 = arg0.field1382;
            arg0.field1382 = arg0.field1387;
            if (class206.field2413 == arg0.field1387) {
                int var6 = var3.method5905();
                class225 var7 = class225.method2354(var6);
                for (int var8 = 0; var8 < var7.field2635.length; var8++) {
                    var7.field2635[var8] = -1;
                    var7.field2635[var8] = 0;
                }
                method213(var7);
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2406 == arg0.field1387) {
                boolean var9 = var3.method5886() == 1;
                int var10 = var3.method5861();
                class225 var11 = class225.method2354(var10);
                if (var11.field2645 != var9) {
                    var11.field2645 = var9;
                    method213(var11);
                }
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2370 == arg0.field1387) {
                method1976();
                field626 = var3.method5856();
                field804 = field605;
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2371 == arg0.field1387) {
                method3634(class204.field2328);
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2436 == arg0.field1387) {
                String var12 = var3.method5865();
                String var13 = class300.method4804(class303.method4054(class228.method164(var3)));
                class111.method930(6, var12, var13);
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2395 == arg0.field1387) {
                int var14 = var3.method5861();
                int var15 = var3.method5858();
                class225 var16 = class225.method2354(var14);
                if (var16.field2668 != 1 || var16.field2695 != var15) {
                    var16.field2668 = 1;
                    var16.field2695 = var15;
                    method213(var16);
                }
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2433 == arg0.field1387) {
                method3634(class204.field2336);
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2379 == arg0.field1387) {
                int var17 = var3.method5856();
                if (var3.method5856() == 0) {
                    field873[var17] = new class262();
                    var3.field4155 += 18;
                } else {
                    var3.field4155--;
                    field873[var17] = new class262(var3, false);
                }
                field802 = field605;
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2441 == arg0.field1387) {
                field801 = field605;
                byte var18 = var3.method6045();
                class20 var19 = new class20(var3);
                class4 var20;
                if (var18 >= 0) {
                    var20 = field821[var18];
                } else {
                    var20 = Statics.field4267;
                }
                var19.method172(var20);
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2377 == arg0.field1387) {
                String var21 = var3.method5865();
                long var22 = (long) var3.method5858();
                long var24 = (long) var3.method5875();
                class248 var26 = (class248) class267.method2139(class248.method3344(), var3.method5856());
                long var27 = (var22 << 32) + var24;
                boolean var29 = false;
                for (int var30 = 0; var30 < 100; var30++) {
                    if (field690[var30] == var27) {
                        var29 = true;
                        break;
                    }
                }
                if (Statics.field118.method1468(new class327(var21, Statics.field3841))) {
                    var29 = true;
                }
                if (!var29 && field717 == 0) {
                    field690[field761] = var27;
                    field761 = (field761 + 1) % 100;
                    String var31 = class300.method4804(class303.method4054(class228.method164(var3)));
                    byte var32;
                    if (var26.field3221) {
                        var32 = 7;
                    } else {
                        var32 = 3;
                    }
                    if (var26.field3224 == -1) {
                        class111.method930(var32, var21, var31);
                    } else {
                        class111.method930(var32, class106.method5315(var26.field3224) + var21, var31);
                    }
                }
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2402 == arg0.field1387) {
                field850 = false;
                for (int var33 = 0; var33 < 5; var33++) {
                    field851[var33] = false;
                }
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2412 == arg0.field1387) {
                byte var34 = var3.method5954();
                int var35 = var3.method6042();
                class220.field2579[var35] = var34;
                if (class220.field2578[var35] != var34) {
                    class220.field2578[var35] = var34;
                }
                method207(var35);
                field789[++field790 - 1 & 0x1F] = var35;
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2417 == arg0.field1387) {
                Statics.field3819 = var3.method5885();
                Statics.field146 = var3.method5899();
                while (var3.field4155 < arg0.field1388) {
                    int var36 = var3.method5856();
                    class204 var37 = class204.method2719()[var36];
                    method3634(var37);
                }
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2381 == arg0.field1387) {
                String var38 = var3.method5865();
                Object[] var39 = new Object[var38.length() + 1];
                for (int var40 = var38.length() - 1; var40 >= 0; var40--) {
                    if (var38.charAt(var40) == 's') {
                        var39[var40 + 1] = var3.method5865();
                    } else {
                        var39[var40 + 1] = Integer.valueOf(var3.method5861());
                    }
                }
                var39[0] = Integer.valueOf(var3.method5861());
                class96 var41 = new class96();
                var41.field1157 = var39;
                class79.method179(var41);
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2386 == arg0.field1387) {
                String var42 = var3.method5865();
                int var43 = var3.method5885();
                int var44 = var3.method5856();
                if (var43 >= 1 && var43 <= 8) {
                    if (var42.equalsIgnoreCase(class246.field2920)) {
                        var42 = null;
                    }
                    field831[var43 - 1] = var42;
                    field816[var43 - 1] = var44 == 0;
                }
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2378 == arg0.field1387) {
                byte[] var45 = new byte[arg0.field1388];
                var3.method5806(var45, 0, var45.length);
                class382 var46 = new class382(var45);
                String var47 = var46.method5865();
                class45.method4915(var47, true, false);
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2364 == arg0.field1387) {
                for (int var48 = 0; var48 < field849.length; var48++) {
                    if (field849[var48] != null) {
                        field849[var48].field1216 = -1;
                    }
                }
                for (int var49 = 0; var49 < field643.length; var49++) {
                    if (field643[var49] != null) {
                        field643[var49].field1216 = -1;
                    }
                }
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2420 == arg0.field1387) {
                for (int var50 = 0; var50 < Statics.field3400; var50++) {
                    class279 var51 = class279.method4938(var50);
                    if (var51 != null) {
                        class220.field2579[var50] = 0;
                        class220.field2578[var50] = 0;
                    }
                }
                method1976();
                field790 += 32;
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2383 == arg0.field1387) {
                int var52 = var3.method5846();
                boolean var53 = var3.method5856() == 1;
                String var54 = "";
                boolean var55 = false;
                if (var53) {
                    var54 = var3.method5865();
                    if (Statics.field118.method1468(new class327(var54, Statics.field3841))) {
                        var55 = true;
                    }
                }
                String var56 = var3.method5865();
                if (!var55) {
                    class111.method930(var52, var54, var56);
                }
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2353 == arg0.field1387) {
                field809 = var3.method5856();
                if (field809 == 1) {
                    field620 = var3.method5858();
                }
                if (field809 >= 2 && field809 <= 6) {
                    if (field809 == 2) {
                        field625 = 64;
                        field769 = 64;
                    }
                    if (field809 == 3) {
                        field625 = 0;
                        field769 = 64;
                    }
                    if (field809 == 4) {
                        field625 = 128;
                        field769 = 64;
                    }
                    if (field809 == 5) {
                        field625 = 64;
                        field769 = 0;
                    }
                    if (field809 == 6) {
                        field625 = 64;
                        field769 = 128;
                    }
                    field809 = 2;
                    field622 = var3.method5858();
                    field623 = var3.method5858();
                    field608 = var3.method5856();
                }
                if (field809 == 10) {
                    field621 = var3.method5858();
                }
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2442 == arg0.field1387) {
                Statics.field2592 = new class339(Statics.field911);
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2426 == arg0.field1387) {
                method3634(class204.field2335);
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2366 == arg0.field1387) {
                boolean var57 = var3.method5847();
                if (!var57) {
                    Statics.field1332 = null;
                } else if (Statics.field1332 == null) {
                    Statics.field1332 = new class264();
                }
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2354 == arg0.field1387) {
                field618 = var3.method6042() * 30;
                field804 = field605;
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2396 == arg0.field1387) {
                int var58 = var3.method5858();
                int var59 = var3.method5893();
                int var60 = var3.method5904();
                int var61 = var3.method6042();
                class225 var62 = class225.method2354(var60);
                if (var62.field2723 != var61 || var62.field2677 != var59 || var62.field2679 != var58) {
                    var62.field2723 = var61;
                    var62.field2677 = var59;
                    var62.field2679 = var58;
                    method213(var62);
                }
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2388 == arg0.field1387) {
                int var63 = var3.method5861();
                int var64 = var3.method5861();
                int var65 = class47.method1655();
                class205 var66 = class205.method4631(class203.field2298, field649.field1385);
                var66.field2342.method5934(field311);
                var66.field2342.method5900(var63);
                var66.field2342.method5842(var64);
                var66.field2342.method5882(var65);
                field649.method2099(var66);
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2355 == arg0.field1387) {
                Statics.field118.field908.method5032(var3, arg0.field1388);
                method17();
                field798 = field605;
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2362 == arg0.field1387) {
                class109.method150(var3, arg0.field1388);
                method2233();
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2385 == arg0.field1387) {
                int var67 = var3.method6042();
                int var68 = var3.method5905();
                class225 var69 = class225.method2354(var68);
                if (var69.field2668 != 2 || var69.field2695 != var67) {
                    var69.field2668 = 2;
                    var69.field2695 = var67;
                    method213(var69);
                }
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2356 == arg0.field1387) {
                method3634(class204.field2332);
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2443 == arg0.field1387) {
                Statics.field2592 = null;
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2365 == arg0.field1387) {
                int var70 = var3.method5897();
                int var71 = var3.method5898();
                int var72 = var3.method5905();
                class225 var73 = class225.method2354(var72);
                if (var73.field2634 != var70 || var73.field2669 != var71 || var73.field2630 != 0 || var73.field2739 != 0) {
                    var73.field2634 = var70;
                    var73.field2669 = var71;
                    var73.field2630 = 0;
                    var73.field2739 = 0;
                    method213(var73);
                    this.method997(var73);
                    if (var73.field2627 == 0) {
                        method5183(Statics.field2618[var72 >> 16], var73, false);
                    }
                }
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2446 == arg0.field1387) {
                field801 = field605;
                byte var74 = var3.method6045();
                if (arg0.field1388 == 1) {
                    if (var74 >= 0) {
                        field821[var74] = null;
                    } else {
                        Statics.field4267 = null;
                    }
                    arg0.field1387 = null;
                    return true;
                }
                if (var74 >= 0) {
                    field821[var74] = new class4(var3);
                } else {
                    Statics.field4267 = new class4(var3);
                }
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2431 == arg0.field1387) {
                int var75 = var3.method5858();
                int var76 = var3.method5856();
                int var77 = var3.method5858();
                method3878(var75, var76, var77);
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2397 == arg0.field1387) {
                int var78 = var3.method5861();
                class95 var79 = (class95) field764.method5638((long) var78);
                if (var79 != null) {
                    method2663(var79, true);
                }
                if (field640 != null) {
                    method213(field640);
                    field640 = null;
                }
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2449 == arg0.field1387) {
                int var80 = var3.method5905();
                int var81 = var3.method6042();
                int var82 = var3.method5899();
                class95 var83 = (class95) field764.method5638((long) var80);
                if (var83 != null) {
                    method2663(var83, var83.field1141 != var81);
                }
                method1883(var80, var81, var82);
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2363 == arg0.field1387) {
                Statics.field118.method1467(var3, arg0.field1388);
                field798 = field605;
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2403 == arg0.field1387) {
                var3.field4155 += 28;
                if (var3.method5881()) {
                    method2365(var3, var3.field4155 - 28);
                }
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2352 == arg0.field1387) {
                for (int var84 = 0; var84 < class220.field2578.length; var84++) {
                    if (class220.field2579[var84] != class220.field2578[var84]) {
                        class220.field2578[var84] = class220.field2579[var84];
                        method207(var84);
                        field789[++field790 - 1 & 0x1F] = var84;
                    }
                }
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2423 == arg0.field1387) {
                Statics.field285 = class333.method3468(var3.method5856());
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2409 == arg0.field1387) {
                int var85 = arg0.field1388 + var3.field4155;
                int var86 = var3.method5858();
                int var87 = var3.method5858();
                if (field763 != var86) {
                    field763 = var86;
                    this.method996(false);
                    method3691(field763);
                    class79.method5223(field763);
                    for (int var88 = 0; var88 < 100; var88++) {
                        field812[var88] = true;
                    }
                }
                while (var87-- > 0) {
                    int var89 = var3.method5861();
                    int var90 = var3.method5858();
                    int var91 = var3.method5856();
                    class95 var92 = (class95) field764.method5638((long) var89);
                    if (var92 != null && var92.field1141 != var90) {
                        method2663(var92, true);
                        var92 = null;
                    }
                    if (var92 == null) {
                        var92 = method1883(var89, var90, var91);
                    }
                    var92.field1137 = true;
                }
                for (class95 var93 = (class95) field764.method5641(); var93 != null; var93 = (class95) field764.method5643()) {
                    if (var93.field1137) {
                        var93.field1137 = false;
                    } else {
                        method2663(var93, true);
                    }
                }
                field748 = new class361(512);
                while (var3.field4155 < var85) {
                    int var94 = var3.method5861();
                    int var95 = var3.method5858();
                    int var96 = var3.method5858();
                    int var97 = var3.method5861();
                    for (int var98 = var95; var98 <= var96; var98++) {
                        long var99 = ((long) var94 << 32) + (long) var98;
                        field748.method5640(new class350(var97), var99);
                    }
                }
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2358 == arg0.field1387) {
                if (field763 != -1) {
                    method5795(field763, 0);
                }
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2435 == arg0.field1387) {
                class76 var101 = new class76();
                var101.field897 = var3.method5865();
                var101.field900 = var3.method5858();
                int var102 = var3.method5861();
                var101.field889 = var102;
                method184(45);
                var2.method2268();
                Object var103 = null;
                class84.method2680(var101);
                arg0.field1387 = null;
                return false;
            }
            if (class206.field2440 == arg0.field1387) {
                byte var104 = var3.method6045();
                long var105 = (long) var3.method5858();
                long var107 = (long) var3.method5875();
                long var109 = (var105 << 32) + var107;
                boolean var111 = false;
                class4 var112 = var104 >= 0 ? field821[var104] : Statics.field4267;
                if (var112 == null) {
                    var111 = true;
                } else {
                    for (int var113 = 0; var113 < 100; var113++) {
                        if (field690[var113] == var109) {
                            var111 = true;
                            break;
                        }
                    }
                }
                if (!var111) {
                    field690[field761] = var109;
                    field761 = (field761 + 1) % 100;
                    String var114 = class228.method164(var3);
                    int var115 = var104 >= 0 ? 43 : 46;
                    class111.method1718(var115, "", var114, var112.field26);
                }
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2416 == arg0.field1387) {
                field850 = true;
                Statics.field3369 = var3.method5856();
                Statics.field1340 = var3.method5856();
                Statics.field16 = var3.method5858();
                Statics.field1364 = var3.method5856();
                Statics.field7 = var3.method5856();
                if (Statics.field7 >= 100) {
                    int var116 = Statics.field3369 * 128 + 64;
                    int var117 = Statics.field1340 * 128 + 64;
                    int var118 = method2142(var116, var117, Statics.field201) - Statics.field16;
                    int var119 = var116 - Statics.field3371;
                    int var120 = var118 - Statics.field1711;
                    int var121 = var117 - Statics.field568;
                    int var122 = (int) Math.sqrt((double) (var119 * var119 + var121 * var121));
                    Statics.field1607 = (int) (Math.atan2((double) var120, (double) var122) * 325.949D) & 0x7FF;
                    Statics.field558 = (int) (Math.atan2((double) var119, (double) var121) * -325.949D) & 0x7FF;
                    if (Statics.field1607 < 128) {
                        Statics.field1607 = 128;
                    }
                    if (Statics.field1607 > 383) {
                        Statics.field1607 = 383;
                    }
                }
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2359 == arg0.field1387) {
                field841 = var3.method5856();
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2393 == arg0.field1387) {
                int var123 = var3.method5905();
                int var124 = var3.method5994();
                class225 var125 = class225.method2354(var123);
                if (var125.field2624 != var124 || var124 == -1) {
                    var125.field2624 = var124;
                    var125.field2706 = 0;
                    var125.field2756 = 0;
                    method213(var125);
                }
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2425 == arg0.field1387) {
                boolean var126 = var3.method5856() == 1;
                if (var126) {
                    Statics.field1273 = class379.method1540() - var3.method6069();
                    Statics.field2790 = new class255(var3, true);
                } else {
                    Statics.field2790 = null;
                }
                field803 = field605;
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2405 == arg0.field1387) {
                method3634(class204.field2329);
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2394 == arg0.field1387) {
                if (Statics.field1142 != null) {
                    Statics.field1142.method5053(var3);
                }
                method2741();
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2391 == arg0.field1387) {
                int var127 = var3.method5893();
                if (var127 == 65535) {
                    var127 = -1;
                }
                int var128 = var3.method5904();
                int var129 = var3.method6024();
                if (var129 == 65535) {
                    var129 = -1;
                }
                int var130 = var3.method5861();
                for (int var131 = var127; var131 <= var129; var131++) {
                    long var132 = ((long) var128 << 32) + (long) var131;
                    class351 var134 = field748.method5638(var132);
                    if (var134 != null) {
                        var134.method5354();
                    }
                    field748.method5640(new class350(var130), var132);
                }
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2419 == arg0.field1387) {
                method1986(true, arg0.field1386);
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2414 == arg0.field1387) {
                int var135 = var3.method5904();
                int var136 = var3.method5858();
                int var137 = var3.method5858();
                class225 var138 = class225.method2354(var135);
                var138.field2681 = (var137 << 16) + var136;
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2367 == arg0.field1387) {
                String var139 = var3.method5865();
                int var140 = var3.method5903();
                class225 var141 = class225.method2354(var140);
                if (!var139.equals(var141.field2686)) {
                    var141.field2686 = var139;
                    method213(var141);
                }
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2428 == arg0.field1387) {
                method3634(class204.field2333);
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2447 == arg0.field1387) {
                int var142 = var3.method6024();
                if (var142 == 65535) {
                    var142 = -1;
                }
                method55(var142);
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2429 == arg0.field1387) {
                int var143 = var3.method5918();
                int var144 = var3.method6042();
                if (var144 == 65535) {
                    var144 = -1;
                }
                method1903(var144, var143);
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2438 == arg0.field1387) {
                Statics.method2132(true, var3, true);
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2387 == arg0.field1387) {
                method3634(class204.field2331);
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2373 == arg0.field1387) {
                method3634(class204.field2330);
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2357 == arg0.field1387) {
                method3634(class204.field2340);
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2424 == arg0.field1387) {
                int var145 = var3.method5905();
                int var146 = var3.method5905();
                class95 var147 = (class95) field764.method5638((long) var146);
                class95 var148 = (class95) field764.method5638((long) var145);
                if (var148 != null) {
                    method2663(var148, var147 == null || var147.field1141 != var148.field1141);
                }
                if (var147 != null) {
                    var147.method5354();
                    field764.method5640(var147, (long) var145);
                }
                class225 var149 = class225.method2354(var146);
                if (var149 != null) {
                    method213(var149);
                }
                class225 var150 = class225.method2354(var145);
                if (var150 != null) {
                    method213(var150);
                    method5183(Statics.field2618[var150.field2703 >>> 16], var150, true);
                }
                if (field763 != -1) {
                    method5795(field763, 1);
                }
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2430 == arg0.field1387) {
                Statics.method2132(false, var3, true);
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2368 == arg0.field1387) {
                method193();
                arg0.field1387 = null;
                return false;
            }
            if (class206.field2439 == arg0.field1387) {
                byte var151 = var3.method6045();
                String var152 = var3.method5865();
                long var153 = (long) var3.method5858();
                long var155 = (long) var3.method5875();
                class248 var157 = (class248) class267.method2139(class248.method3344(), var3.method5856());
                long var158 = (var153 << 32) + var155;
                boolean var160 = false;
                Object var161 = null;
                class4 var162 = var151 >= 0 ? field821[var151] : Statics.field4267;
                if (var162 == null) {
                    var160 = true;
                } else {
                    int var163 = 0;
                    while (true) {
                        if (var163 >= 100) {
                            if (var157.field3231 && Statics.field118.method1468(new class327(var152, Statics.field3841))) {
                                var160 = true;
                            }
                            break;
                        }
                        if (field690[var163] == var158) {
                            var160 = true;
                            break;
                        }
                        var163++;
                    }
                }
                if (!var160) {
                    field690[field761] = var158;
                    field761 = (field761 + 1) % 100;
                    String var164 = class300.method4804(class228.method164(var3));
                    int var165 = var151 >= 0 ? 41 : 44;
                    if (var157.field3224 == -1) {
                        class111.method1718(var165, var152, var164, var162.field26);
                    } else {
                        class111.method1718(var165, class106.method5315(var157.field3224) + var152, var164, var162.field26);
                    }
                }
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2415 == arg0.field1387) {
                Statics.field146 = var3.method5886();
                Statics.field3819 = var3.method5899();
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2375 == arg0.field1387) {
                int var166 = var3.method5856();
                method1826(var166);
                arg0.field1387 = null;
                return false;
            }
            if (class206.field2432 == arg0.field1387) {
                Statics.method2132(true, var3, false);
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2380 == arg0.field1387) {
                int var167 = var3.method5861();
                int var168 = var3.method5893();
                class225 var169 = class225.method2354(var167);
                if (var169 != null && var169.field2627 == 0) {
                    if (var168 > var169.field2649 - var169.field2641) {
                        var168 = var169.field2649 - var169.field2641;
                    }
                    if (var168 < 0) {
                        var168 = 0;
                    }
                    if (var169.field2647 != var168) {
                        var169.field2647 = var168;
                        method213(var169);
                    }
                }
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2392 == arg0.field1387) {
                int var170 = var3.method5856();
                int var171 = var3.method5856();
                int var172 = var3.method5856();
                int var173 = var3.method5856();
                field851[var170] = true;
                field602[var170] = var171;
                field699[var170] = var172;
                field854[var170] = var173;
                field855[var170] = 0;
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2418 == arg0.field1387) {
                field850 = true;
                Statics.field41 = var3.method5856();
                Statics.field593 = var3.method5856();
                Statics.field1570 = var3.method5858();
                Statics.field1928 = var3.method5856();
                Statics.field1436 = var3.method5856();
                if (Statics.field1436 >= 100) {
                    Statics.field3371 = Statics.field41 * 128 + 64;
                    Statics.field568 = Statics.field593 * 128 + 64;
                    Statics.field1711 = method2142(Statics.field3371, Statics.field568, Statics.field201) - Statics.field1570;
                }
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2401 == arg0.field1387) {
                method1976();
                int var174 = var3.method5885();
                int var175 = var3.method5904();
                int var176 = var3.method5899();
                field652[var176] = var175;
                field735[var176] = var174;
                field737[var176] = 1;
                for (int var177 = 0; var177 < 98; var177++) {
                    if (var175 >= class235.field2840[var177]) {
                        field737[var176] = var177 + 2;
                    }
                }
                field723[++field794 - 1 & 0x1F] = var176;
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2444 == arg0.field1387) {
                field787 = field605;
                byte var178 = var3.method6045();
                if (arg0.field1388 == 1) {
                    if (var178 >= 0) {
                        field832[var178] = null;
                    } else {
                        Statics.field929 = null;
                    }
                    arg0.field1387 = null;
                    return true;
                }
                if (var178 >= 0) {
                    field832[var178] = new class12(var3);
                } else {
                    Statics.field929 = new class12(var3);
                }
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2376 == arg0.field1387) {
                int var179 = var3.method6042();
                int var180 = var3.method5903();
                class220.field2579[var179] = var180;
                if (class220.field2578[var179] != var180) {
                    class220.field2578[var179] = var180;
                }
                method207(var179);
                field789[++field790 - 1 & 0x1F] = var179;
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2408 == arg0.field1387) {
                Statics.field146 = var3.method5885();
                Statics.field3819 = var3.method5886();
                for (int var181 = Statics.field146; var181 < Statics.field146 + 8; var181++) {
                    for (int var182 = Statics.field3819; var182 < Statics.field3819 + 8; var182++) {
                        if (field731[Statics.field201][var181][var182] != null) {
                            field731[Statics.field201][var181][var182] = null;
                            method3794(var181, var182);
                        }
                    }
                }
                for (class99 var183 = (class99) field732.method4160(); var183 != null; var183 = (class99) field732.method4182()) {
                    if (var183.field1196 >= Statics.field146 && var183.field1196 < Statics.field146 + 8 && var183.field1198 >= Statics.field3819 && var183.field1198 < Statics.field3819 + 8 && Statics.field201 == var183.field1207) {
                        var183.field1206 = 0;
                    }
                }
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2369 == arg0.field1387) {
                int var184 = var3.method5861();
                int var185 = var3.method5858();
                if (var184 < -70000) {
                    var185 += 32768;
                }
                class225 var186;
                if (var184 >= 0) {
                    var186 = class225.method2354(var184);
                } else {
                    var186 = null;
                }
                while (var3.field4155 < arg0.field1388) {
                    int var187 = var3.method5846();
                    int var188 = var3.method5858();
                    int var189 = 0;
                    if (var188 != 0) {
                        var189 = var3.method5856();
                        if (var189 == 255) {
                            var189 = var3.method5861();
                        }
                    }
                    if (var186 != null && var187 >= 0 && var187 < var186.field2635.length) {
                        var186.field2635[var187] = var188;
                        var186.field2752[var187] = var189;
                    }
                    class93.method1720(var185, var187, var188 - 1, var189);
                }
                if (var186 != null) {
                    method213(var186);
                }
                method1976();
                field791[++field792 - 1 & 0x1F] = var185 & 0x7FFF;
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2434 == arg0.field1387) {
                int var190 = var3.method5861();
                if (field685 != var190) {
                    field685 = var190;
                    method75();
                }
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2360 == arg0.field1387) {
                field823 = var3.method5899();
                field780 = var3.method5856();
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2404 == arg0.field1387) {
                int var191 = var3.method5861();
                int var192 = var3.method5858();
                if (var192 == 65535) {
                    var192 = -1;
                }
                int var193 = var3.method5905();
                class225 var194 = class225.method2354(var191);
                if (var194.field2625) {
                    var194.field2753 = var192;
                    var194.field2754 = var193;
                    class296 var196 = class296.method194(var192);
                    var194.field2723 = var196.field3679;
                    var194.field2677 = var196.field3650;
                    var194.field2694 = var196.field3658;
                    var194.field2716 = var196.field3662;
                    var194.field2675 = var196.field3660;
                    var194.field2679 = var196.field3655;
                    if (var196.field3661 == 1) {
                        var194.field2666 = 1;
                    } else {
                        var194.field2666 = 2;
                    }
                    if (var194.field2721 > 0) {
                        var194.field2679 = var194.field2679 * 32 / var194.field2721;
                    } else if (var194.field2636 > 0) {
                        var194.field2679 = var194.field2679 * 32 / var194.field2636;
                    }
                    method213(var194);
                } else if (var192 == -1) {
                    var194.field2668 = 0;
                    arg0.field1387 = null;
                    return true;
                } else {
                    class296 var195 = class296.method194(var192);
                    var194.field2668 = 4;
                    var194.field2695 = var192;
                    var194.field2723 = var195.field3679;
                    var194.field2677 = var195.field3650;
                    var194.field2679 = var195.field3655 * 100 / var193;
                    method213(var194);
                }
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2384 == arg0.field1387) {
                int var197 = var3.method5856();
                method1902(var197);
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2445 == arg0.field1387) {
                field787 = field605;
                byte var198 = var3.method6045();
                class3 var199 = new class3(var3);
                class12 var200;
                if (var198 >= 0) {
                    var200 = field832[var198];
                } else {
                    var200 = Statics.field929;
                }
                var199.method20(var200);
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2390 == arg0.field1387) {
                if (Statics.field2592 == null) {
                    Statics.field2592 = new class339(Statics.field911);
                }
                class390 var201 = Statics.field911.method5325(var3);
                Statics.field2592.field3927.method5651(var201.field4216, var201.field4217);
                field795[++field614 - 1 & 0x1F] = var201.field4216;
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2411 == arg0.field1387) {
                Statics.field118.method1461();
                field798 = field605;
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2361 == arg0.field1387) {
                int var202 = var3.method6024();
                field763 = var202;
                this.method996(false);
                method3691(var202);
                class79.method5223(field763);
                for (int var203 = 0; var203 < 100; var203++) {
                    field812[var203] = true;
                }
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2399 == arg0.field1387) {
                String var204 = var3.method5865();
                long var205 = var3.method6069();
                long var207 = (long) var3.method5858();
                long var209 = (long) var3.method5875();
                class248 var211 = (class248) class267.method2139(class248.method3344(), var3.method5856());
                long var212 = (var207 << 32) + var209;
                boolean var214 = false;
                for (int var215 = 0; var215 < 100; var215++) {
                    if (field690[var215] == var212) {
                        var214 = true;
                        break;
                    }
                }
                if (var211.field3231 && Statics.field118.method1468(new class327(var204, Statics.field3841))) {
                    var214 = true;
                }
                if (!var214 && field717 == 0) {
                    field690[field761] = var212;
                    field761 = (field761 + 1) % 100;
                    String var216 = class300.method4804(class303.method4054(class228.method164(var3)));
                    if (var211.field3224 == -1) {
                        class111.method1718(9, var204, var216, class305.method2002(var205));
                    } else {
                        class111.method1718(9, class106.method5315(var211.field3224) + var204, var216, class305.method2002(var205));
                    }
                }
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2422 == arg0.field1387) {
                if (arg0.field1388 == 0) {
                    Statics.field1142 = null;
                } else {
                    if (Statics.field1142 == null) {
                        Statics.field1142 = new class317(Statics.field3841, Statics.field75);
                    }
                    Statics.field1142.method5041(var3);
                }
                method2741();
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2400 == arg0.field1387) {
                method1976();
                field771 = var3.method5859();
                field804 = field605;
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2351 == arg0.field1387) {
                int var217 = var3.method6042();
                class93.method217(var217);
                field791[++field792 - 1 & 0x1F] = var217 & 0x7FFF;
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2410 == arg0.field1387) {
                int var218 = var3.method6042();
                int var219 = var3.method5904();
                int var220 = var218 >> 10 & 0x1F;
                int var221 = var218 >> 5 & 0x1F;
                int var222 = var218 & 0x1F;
                int var223 = (var222 << 3) + (var220 << 19) + (var221 << 11);
                class225 var224 = class225.method2354(var219);
                if (var224.field2659 != var223) {
                    var224.field2659 = var223;
                    method213(var224);
                }
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2398 == arg0.field1387) {
                Statics.method2132(false, var3, false);
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2382 == arg0.field1387) {
                method1986(false, arg0.field1386);
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2372 == arg0.field1387) {
                method58(var3.method5865());
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2407 == arg0.field1387) {
                int var225 = var3.method5861();
                int var226 = var3.method5858();
                if (var225 < -70000) {
                    var226 += 32768;
                }
                class225 var227;
                if (var225 >= 0) {
                    var227 = class225.method2354(var225);
                } else {
                    var227 = null;
                }
                if (var227 != null) {
                    for (int var228 = 0; var228 < var227.field2635.length; var228++) {
                        var227.field2635[var228] = 0;
                        var227.field2752[var228] = 0;
                    }
                }
                class93.method2138(var226);
                int var229 = var3.method5858();
                for (int var230 = 0; var230 < var229; var230++) {
                    int var231 = var3.method5893();
                    int var232 = var3.method5899();
                    if (var232 == 255) {
                        var232 = var3.method5904();
                    }
                    if (var227 != null && var230 < var227.field2635.length) {
                        var227.field2635[var230] = var231;
                        var227.field2752[var230] = var232;
                    }
                    class93.method1720(var226, var230, var231 - 1, var232);
                }
                if (var227 != null) {
                    method213(var227);
                }
                method1976();
                field791[++field792 - 1 & 0x1F] = var226 & 0x7FFF;
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2427 == arg0.field1387) {
                Statics.method16(var3, arg0.field1388);
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2437 == arg0.field1387) {
                int var233 = var3.method5905();
                class225 var234 = class225.method2354(var233);
                var234.field2668 = 3;
                var234.field2695 = Statics.field1374.field1166.method3689();
                method213(var234);
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2374 == arg0.field1387) {
                method3634(class204.field2334);
                arg0.field1387 = null;
                return true;
            }
            if (class206.field2389 == arg0.field1387) {
                field839 = var3.method5856();
                if (field839 == 255) {
                    field839 = 0;
                }
                field840 = var3.method5856();
                if (field840 == 255) {
                    field840 = 0;
                }
                arg0.field1387 = null;
                return true;
            }
            class405.method3718("" + (arg0.field1387 == null ? -1 : arg0.field1387.field2448) + class106.field1326 + (arg0.field1393 == null ? -1 : arg0.field1393.field2448) + class106.field1326 + (arg0.field1394 == null ? -1 : arg0.field1394.field2448) + class106.field1326 + arg0.field1388, (Throwable) null);
            method193();
        } catch (IOException var239) {
            method1909();
        } catch (Exception var240) {
            String var237 = "" + (arg0.field1387 == null ? -1 : arg0.field1387.field2448) + class106.field1326 + (arg0.field1393 == null ? -1 : arg0.field1393.field2448) + class106.field1326 + (arg0.field1394 == null ? -1 : arg0.field1394.field2448) + class106.field1326 + arg0.field1388 + class106.field1326 + (Statics.field1795 + Statics.field1374.field1265[0]) + class106.field1326 + (Statics.field1892 + Statics.field1374.field1266[0]) + class106.field1326;
            for (int var238 = 0; var238 < arg0.field1388 && var238 < 50; var238++) {
                var237 = var237 + var3.field4153[var238] + class106.field1326;
            }
            class405.method3718(var237, var240);
            method193();
        }
        return true;
    }

    @ObfuscatedName("hv.gy(Lgl;I)V")
    public static final void method3634(class204 arg0) {
        class381 var1 = field649.field1386;
        if (class204.field2329 == arg0) {
            int var2 = var1.method5899();
            int var3 = var1.method5858();
            int var4 = var1.method5885();
            int var5 = (var4 >> 4 & 0x7) + Statics.field146;
            int var6 = (var4 & 0x7) + Statics.field3819;
            int var7 = var1.method5899();
            int var8 = var7 >> 4 & 0xF;
            int var9 = var7 & 0x7;
            if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                int var10 = var8 + 1;
                if (Statics.field1374.field1265[0] >= var5 - var10 && Statics.field1374.field1265[0] <= var5 + var10 && Statics.field1374.field1266[0] >= var6 - var10 && Statics.field1374.field1266[0] <= var6 + var10 && Statics.field988.field1308 != 0 && var9 > 0 && field844 < 50) {
                    field845[field844] = var3;
                    field654[field844] = var9;
                    field847[field844] = var2;
                    field778[field844] = null;
                    field848[field844] = (var5 << 16) + (var6 << 8) + var8;
                    field844++;
                }
            }
        }
        if (class204.field2336 == arg0) {
            int var11 = var1.method5899();
            int var12 = var11 >> 2;
            int var13 = var11 & 0x3;
            int var14 = field664[var12];
            int var15 = var1.method5885();
            int var16 = (var15 >> 4 & 0x7) + Statics.field146;
            int var17 = (var15 & 0x7) + Statics.field3819;
            if (var16 >= 0 && var17 >= 0 && var16 < 104 && var17 < 104) {
                method163(Statics.field201, var16, var17, var14, -1, var12, var13, 0, -1);
            }
        } else if (class204.field2330 == arg0) {
            int var18 = var1.method5893();
            int var19 = var1.method5856();
            int var20 = var19 >> 2;
            int var21 = var19 & 0x3;
            int var22 = field664[var20];
            int var23 = var1.method5885();
            int var24 = (var23 >> 4 & 0x7) + Statics.field146;
            int var25 = (var23 & 0x7) + Statics.field3819;
            if (var24 >= 0 && var25 >= 0 && var24 < 103 && var25 < 103) {
                if (var22 == 0) {
                    class188 var26 = Statics.field1599.method3021(Statics.field201, var24, var25);
                    if (var26 != null) {
                        int var27 = class184.method2752(var26.field2165);
                        if (var20 == 2) {
                            var26.field2157 = new class88(var27, 2, var21 + 4, Statics.field201, var24, var25, var18, false, var26.field2157);
                            var26.field2163 = new class88(var27, 2, var21 + 1 & 0x3, Statics.field201, var24, var25, var18, false, var26.field2163);
                        } else {
                            var26.field2157 = new class88(var27, var20, var21, Statics.field201, var24, var25, var18, false, var26.field2157);
                        }
                    }
                }
                if (var22 == 1) {
                    class190 var28 = Statics.field1599.method3022(Statics.field201, var24, var25);
                    if (var28 != null) {
                        int var29 = class184.method2752(var28.field2176);
                        if (var20 == 4 || var20 == 5) {
                            var28.field2168 = new class88(var29, 4, var21, Statics.field201, var24, var25, var18, false, var28.field2168);
                        } else if (var20 == 6) {
                            var28.field2168 = new class88(var29, 4, var21 + 4, Statics.field201, var24, var25, var18, false, var28.field2168);
                        } else if (var20 == 7) {
                            var28.field2168 = new class88(var29, 4, (var21 + 2 & 0x3) + 4, Statics.field201, var24, var25, var18, false, var28.field2168);
                        } else if (var20 == 8) {
                            var28.field2168 = new class88(var29, 4, var21 + 4, Statics.field201, var24, var25, var18, false, var28.field2168);
                            var28.field2173 = new class88(var29, 4, (var21 + 2 & 0x3) + 4, Statics.field201, var24, var25, var18, false, var28.field2173);
                        }
                    }
                }
                if (var22 == 2) {
                    class191 var30 = Statics.field1599.method3023(Statics.field201, var24, var25);
                    if (var20 == 11) {
                        var20 = 10;
                    }
                    if (var30 != null) {
                        var30.field2182 = new class88(class184.method2752(var30.field2194), var20, var21, Statics.field201, var24, var25, var18, false, var30.field2182);
                    }
                }
                if (var22 == 3) {
                    class170 var31 = Statics.field1599.method3105(Statics.field201, var24, var25);
                    if (var31 != null) {
                        var31.field1844 = new class88(class184.method2752(var31.field1840), 22, var21, Statics.field201, var24, var25, var18, false, var31.field1844);
                    }
                }
            }
        } else if (class204.field2333 == arg0) {
            int var32 = var1.method5893();
            int var33 = var1.method5858();
            byte var34 = var1.method5954();
            int var35 = var1.method5893();
            int var36 = var1.method5856();
            int var37 = var1.method5856();
            int var38 = var1.method5856() * 4;
            int var39 = var1.method5897();
            int var40 = var1.method5885();
            int var41 = (var40 >> 4 & 0x7) + Statics.field146;
            int var42 = (var40 & 0x7) + Statics.field3819;
            byte var43 = var1.method5888();
            int var44 = var1.method5886() * 4;
            int var45 = var34 + var41;
            int var46 = var42 + var43;
            if (var41 >= 0 && var42 >= 0 && var41 < 104 && var42 < 104 && var45 >= 0 && var46 >= 0 && var45 < 104 && var46 < 104 && var35 != 65535) {
                int var47 = var41 * 128 + 64;
                int var48 = var42 * 128 + 64;
                int var49 = var45 * 128 + 64;
                int var50 = var46 * 128 + 64;
                class85 var51 = new class85(var35, Statics.field201, var47, var48, method2142(var47, var48, Statics.field201) - var44, field611 + var33, field611 + var32, var36, var37, var39, var38);
                var51.method1712(var49, var50, method2142(var49, var50, Statics.field201) - var38, field611 + var33);
                field733.method4155(var51);
            }
        } else if (class204.field2332 == arg0) {
            int var52 = var1.method5886();
            int var53 = (var52 >> 4 & 0x7) + Statics.field146;
            int var54 = (var52 & 0x7) + Statics.field3819;
            int var55 = var1.method5858();
            if (var53 >= 0 && var54 >= 0 && var53 < 104 && var54 < 104) {
                class272 var56 = field731[Statics.field201][var53][var54];
                if (var56 != null) {
                    for (class108 var57 = (class108) var56.method4160(); var57 != null; var57 = (class108) var56.method4182()) {
                        if ((var55 & 0x7FFF) == var57.field1347) {
                            var57.method5354();
                            break;
                        }
                    }
                    if (var56.method4160() == null) {
                        field731[Statics.field201][var53][var54] = null;
                    }
                    method3794(var53, var54);
                }
            }
        } else if (class204.field2340 == arg0) {
            int var58 = var1.method5856();
            int var59 = var1.method6024();
            int var60 = var1.method5858();
            int var61 = var1.method5899();
            int var62 = (var61 >> 4 & 0x7) + Statics.field146;
            int var63 = (var61 & 0x7) + Statics.field3819;
            if (var62 >= 0 && var63 >= 0 && var62 < 104 && var63 < 104) {
                int var64 = var62 * 128 + 64;
                int var65 = var63 * 128 + 64;
                class80 var66 = new class80(var59, Statics.field201, var64, var65, method2142(var64, var65, Statics.field201) - var58, var60, field611);
                field734.method4155(var66);
            }
        } else if (class204.field2334 == arg0) {
            int var67 = var1.method5858();
            int var68 = var1.method5858();
            int var69 = var1.method5893();
            int var70 = var1.method5856();
            int var71 = (var70 >> 4 & 0x7) + Statics.field146;
            int var72 = (var70 & 0x7) + Statics.field3819;
            if (var71 >= 0 && var72 >= 0 && var71 < 104 && var72 < 104) {
                class272 var73 = field731[Statics.field201][var71][var72];
                if (var73 != null) {
                    for (class108 var74 = (class108) var73.method4160(); var74 != null; var74 = (class108) var73.method4182()) {
                        if ((var67 & 0x7FFF) == var74.field1347 && var74.field1343 == var69) {
                            var74.field1343 = var68;
                            break;
                        }
                    }
                    method3794(var71, var72);
                }
            }
        } else if (class204.field2335 == arg0) {
            int var75 = var1.method5858();
            int var76 = var1.method5886();
            int var77 = (var76 >> 4 & 0x7) + Statics.field146;
            int var78 = (var76 & 0x7) + Statics.field3819;
            int var79 = var1.method5858();
            if (var77 >= 0 && var78 >= 0 && var77 < 104 && var78 < 104) {
                class108 var80 = new class108();
                var80.field1347 = var79;
                var80.field1343 = var75;
                if (field731[Statics.field201][var77][var78] == null) {
                    field731[Statics.field201][var77][var78] = new class272();
                }
                field731[Statics.field201][var77][var78].method4155(var80);
                method3794(var77, var78);
            }
        } else {
            if (class204.field2328 == arg0) {
                int var81 = var1.method5886();
                int var82 = var81 >> 2;
                int var83 = var81 & 0x3;
                int var84 = field664[var82];
                int var85 = var1.method5858();
                int var86 = var1.method6042();
                byte var87 = var1.method6045();
                int var88 = var1.method6024();
                byte var89 = var1.method5888();
                byte var90 = var1.method5954();
                byte var91 = var1.method5954();
                int var92 = var1.method5856();
                int var93 = (var92 >> 4 & 0x7) + Statics.field146;
                int var94 = (var92 & 0x7) + Statics.field3819;
                int var95 = var1.method5858();
                class98 var96;
                if (field700 == var86) {
                    var96 = Statics.field1374;
                } else {
                    var96 = field849[var86];
                }
                if (var96 != null) {
                    class295 var97 = class295.method182(var95);
                    int var98;
                    int var99;
                    if (var83 == 1 || var83 == 3) {
                        var98 = var97.field3588;
                        var99 = var97.field3604;
                    } else {
                        var98 = var97.field3604;
                        var99 = var97.field3588;
                    }
                    int var100 = (var98 >> 1) + var93;
                    int var101 = (var98 + 1 >> 1) + var93;
                    int var102 = (var99 >> 1) + var94;
                    int var103 = (var99 + 1 >> 1) + var94;
                    int[][] var104 = class90.field1090[Statics.field201];
                    int var105 = var104[var100][var102] + var104[var101][var102] + var104[var100][var103] + var104[var101][var103] >> 2;
                    int var106 = (var93 << 7) + (var98 << 6);
                    int var107 = (var94 << 7) + (var99 << 6);
                    class183 var108 = var97.method4603(var82, var83, var104, var106, var105, var107);
                    if (var108 != null) {
                        method163(Statics.field201, var93, var94, var84, -1, 0, 0, var85 + 1, var88 + 1);
                        var96.field1173 = field611 + var85;
                        var96.field1174 = field611 + var88;
                        var96.field1184 = var108;
                        var96.field1176 = var93 * 128 + var98 * 64;
                        var96.field1178 = var94 * 128 + var99 * 64;
                        var96.field1172 = var105;
                        if (var87 > var89) {
                            byte var109 = var87;
                            var87 = var89;
                            var89 = var109;
                        }
                        if (var91 > var90) {
                            byte var110 = var91;
                            var91 = var90;
                            var90 = var110;
                        }
                        var96.field1188 = var87 + var93;
                        var96.field1181 = var89 + var93;
                        var96.field1180 = var91 + var94;
                        var96.field1177 = var90 + var94;
                    }
                }
            }
            if (class204.field2331 == arg0) {
                int var111 = var1.method5885();
                int var112 = var111 >> 2;
                int var113 = var111 & 0x3;
                int var114 = field664[var112];
                int var115 = var1.method6042();
                int var116 = var1.method5856();
                int var117 = (var116 >> 4 & 0x7) + Statics.field146;
                int var118 = (var116 & 0x7) + Statics.field3819;
                if (var117 >= 0 && var118 >= 0 && var117 < 104 && var118 < 104) {
                    method163(Statics.field201, var117, var118, var114, var115, var112, var113, 0, -1);
                }
            }
        }
    }

    @ObfuscatedName("q.gg(IIIIIIIIIB)V")
    public static final void method163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class99 var9 = null;
        for (class99 var10 = (class99) field732.method4160(); var10 != null; var10 = (class99) field732.method4182()) {
            if (var10.field1207 == arg0 && var10.field1196 == arg1 && var10.field1198 == arg2 && var10.field1203 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class99();
            var9.field1207 = arg0;
            var9.field1203 = arg3;
            var9.field1196 = arg1;
            var9.field1198 = arg2;
            long var11 = 0L;
            int var13 = -1;
            int var14 = 0;
            int var15 = 0;
            if (var9.field1203 == 0) {
                var11 = Statics.field1599.method3066(var9.field1207, var9.field1196, var9.field1198);
            }
            if (var9.field1203 == 1) {
                var11 = Statics.field1599.method3026(var9.field1207, var9.field1196, var9.field1198);
            }
            if (var9.field1203 == 2) {
                var11 = Statics.field1599.method3025(var9.field1207, var9.field1196, var9.field1198);
            }
            if (var9.field1203 == 3) {
                var11 = Statics.field1599.method3076(var9.field1207, var9.field1196, var9.field1198);
            }
            if (var11 != 0L) {
                int var16 = Statics.field1599.method3029(var9.field1207, var9.field1196, var9.field1198, var11);
                var13 = class184.method2752(var11);
                var14 = var16 & 0x1F;
                var15 = var16 >> 6 & 0x3;
            }
            var9.field1199 = var13;
            var9.field1204 = var14;
            var9.field1200 = var15;
            field732.method4155(var9);
        }
        var9.field1202 = arg4;
        var9.field1197 = arg5;
        var9.field1195 = arg6;
        var9.field1205 = arg7;
        var9.field1206 = arg8;
    }

    @ObfuscatedName("ic.gc(I)V")
    public static final void method3930() {
        for (class99 var0 = (class99) field732.method4160(); var0 != null; var0 = (class99) field732.method4182()) {
            if (var0.field1206 == -1) {
                var0.field1205 = 0;
                method5344(var0);
            } else {
                var0.method5354();
            }
        }
    }

    @ObfuscatedName("md.ga(Lcr;I)V")
    public static final void method5344(class99 arg0) {
        long var1 = 0L;
        int var3 = -1;
        int var4 = 0;
        int var5 = 0;
        if (arg0.field1203 == 0) {
            var1 = Statics.field1599.method3066(arg0.field1207, arg0.field1196, arg0.field1198);
        }
        if (arg0.field1203 == 1) {
            var1 = Statics.field1599.method3026(arg0.field1207, arg0.field1196, arg0.field1198);
        }
        if (arg0.field1203 == 2) {
            var1 = Statics.field1599.method3025(arg0.field1207, arg0.field1196, arg0.field1198);
        }
        if (arg0.field1203 == 3) {
            var1 = Statics.field1599.method3076(arg0.field1207, arg0.field1196, arg0.field1198);
        }
        if (var1 != 0L) {
            int var6 = Statics.field1599.method3029(arg0.field1207, arg0.field1196, arg0.field1198, var1);
            var3 = class184.method2752(var1);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg0.field1199 = var3;
        arg0.field1204 = var4;
        arg0.field1200 = var5;
    }

    @ObfuscatedName("gy.hr(I)V")
    public static final void method3407() {
        for (class99 var0 = (class99) field732.method4160(); var0 != null; var0 = (class99) field732.method4182()) {
            if (var0.field1206 > 0) {
                var0.field1206--;
            }
            if (var0.field1206 == 0) {
                if (var0.field1199 >= 0) {
                    int var1 = var0.field1199;
                    int var2 = var0.field1204;
                    class295 var3 = class295.method182(var1);
                    if (var2 == 11) {
                        var2 = 10;
                    }
                    if (var2 >= 5 && var2 <= 8) {
                        var2 = 4;
                    }
                    boolean var4 = var3.method4600(var2);
                    if (!var4) {
                        continue;
                    }
                }
                method72(var0.field1207, var0.field1203, var0.field1196, var0.field1198, var0.field1199, var0.field1200, var0.field1204);
                var0.method5354();
            } else {
                if (var0.field1205 > 0) {
                    var0.field1205--;
                }
                if (var0.field1205 == 0 && var0.field1196 >= 1 && var0.field1198 >= 1 && var0.field1196 <= 102 && var0.field1198 <= 102) {
                    if (var0.field1202 >= 0) {
                        int var5 = var0.field1202;
                        int var6 = var0.field1197;
                        class295 var7 = class295.method182(var5);
                        if (var6 == 11) {
                            var6 = 10;
                        }
                        if (var6 >= 5 && var6 <= 8) {
                            var6 = 4;
                        }
                        boolean var8 = var7.method4600(var6);
                        if (!var8) {
                            continue;
                        }
                    }
                    method72(var0.field1207, var0.field1203, var0.field1196, var0.field1198, var0.field1202, var0.field1195, var0.field1197);
                    var0.field1205 = -1;
                    if (var0.field1202 == var0.field1199 && var0.field1199 == -1) {
                        var0.method5354();
                    } else if (var0.field1202 == var0.field1199 && var0.field1200 == var0.field1195 && var0.field1204 == var0.field1197) {
                        var0.method5354();
                    }
                }
            }
        }
    }

    @ObfuscatedName("g.ha(IIIIIIII)V")
    public static final void method72(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field604 && Statics.field201 != arg0) {
            return;
        }
        long var7 = 0L;
        boolean var9 = true;
        boolean var10 = false;
        boolean var11 = false;
        if (arg1 == 0) {
            var7 = Statics.field1599.method3066(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field1599.method3026(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field1599.method3025(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field1599.method3076(arg0, arg2, arg3);
        }
        if (var7 != 0L) {
            int var12 = Statics.field1599.method3029(arg0, arg2, arg3, var7);
            int var13 = class184.method2752(var7);
            int var14 = var12 & 0x1F;
            int var15 = var12 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field1599.method3152(arg0, arg2, arg3);
                class295 var16 = class295.method182(var13);
                if (var16.field3614 != 0) {
                    field661[arg0].method2305(arg2, arg3, var14, var15, var16.field3607);
                }
            }
            if (arg1 == 1) {
                Statics.field1599.method3017(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field1599.method3064(arg0, arg2, arg3);
                class295 var17 = class295.method182(var13);
                if (var17.field3604 + arg2 > 103 || var17.field3604 + arg3 > 103 || var17.field3588 + arg2 > 103 || var17.field3588 + arg3 > 103) {
                    return;
                }
                if (var17.field3614 != 0) {
                    field661[arg0].method2335(arg2, arg3, var17.field3604, var17.field3588, var15, var17.field3607);
                }
            }
            if (arg1 == 3) {
                Statics.field1599.method3019(arg0, arg2, arg3);
                class295 var18 = class295.method182(var13);
                if (var18.field3614 == 1) {
                    field661[arg0].method2310(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var19 = arg0;
        if (arg0 < 3 && (class90.field1091[1][arg2][arg3] & 0x2) == 2) {
            var19 = arg0 + 1;
        }
        class176 var20 = Statics.field1599;
        class136 var21 = field661[arg0];
        class295 var22 = class295.method182(arg4);
        int var23;
        int var24;
        if (arg5 == 1 || arg5 == 3) {
            var23 = var22.field3588;
            var24 = var22.field3604;
        } else {
            var23 = var22.field3604;
            var24 = var22.field3588;
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
        int[][] var29 = class90.field1090[var19];
        int var30 = var29[var25][var27] + var29[var26][var27] + var29[var25][var28] + var29[var26][var28] >> 2;
        int var31 = (arg2 << 7) + (var23 << 6);
        int var32 = (arg3 << 7) + (var24 << 6);
        long var33 = class184.method1978(arg2, arg3, 2, var22.field3602 == 0, arg4);
        int var35 = (arg5 << 6) + arg6;
        if (var22.field3621 == 1) {
            var35 += 256;
        }
        if (arg6 == 22) {
            class177 var36;
            if (var22.field3612 == -1 && var22.field3630 == null) {
                var36 = var22.method4603(22, arg5, var29, var31, var30, var32);
            } else {
                var36 = new class88(arg4, 22, arg5, var19, arg2, arg3, var22.field3612, var22.field3622, (class177) null);
            }
            var20.method3158(arg0, arg2, arg3, var30, var36, var33, var35);
            if (var22.field3614 == 1) {
                var21.method2308(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class177 var62;
            if (var22.field3612 == -1 && var22.field3630 == null) {
                var62 = var22.method4603(10, arg5, var29, var31, var30, var32);
            } else {
                var62 = new class88(arg4, 10, arg5, var19, arg2, arg3, var22.field3612, var22.field3622, (class177) null);
            }
            if (var62 != null) {
                var20.method3009(arg0, arg2, arg3, var30, var23, var24, var62, arg6 == 11 ? 256 : 0, var33, var35);
            }
            if (var22.field3614 != 0) {
                var21.method2326(arg2, arg3, var23, var24, var22.field3607);
            }
        } else if (arg6 >= 12) {
            class177 var37;
            if (var22.field3612 == -1 && var22.field3630 == null) {
                var37 = var22.method4603(arg6, arg5, var29, var31, var30, var32);
            } else {
                var37 = new class88(arg4, arg6, arg5, var19, arg2, arg3, var22.field3612, var22.field3622, (class177) null);
            }
            var20.method3009(arg0, arg2, arg3, var30, 1, 1, var37, 0, var33, var35);
            if (var22.field3614 != 0) {
                var21.method2326(arg2, arg3, var23, var24, var22.field3607);
            }
        } else if (arg6 == 0) {
            class177 var38;
            if (var22.field3612 == -1 && var22.field3630 == null) {
                var38 = var22.method4603(0, arg5, var29, var31, var30, var32);
            } else {
                var38 = new class88(arg4, 0, arg5, var19, arg2, arg3, var22.field3612, var22.field3622, (class177) null);
            }
            var20.method3007(arg0, arg2, arg3, var30, var38, (class177) null, class90.field1095[arg5], 0, var33, var35);
            if (var22.field3614 != 0) {
                var21.method2302(arg2, arg3, arg6, arg5, var22.field3607);
            }
        } else if (arg6 == 1) {
            class177 var39;
            if (var22.field3612 == -1 && var22.field3630 == null) {
                var39 = var22.method4603(1, arg5, var29, var31, var30, var32);
            } else {
                var39 = new class88(arg4, 1, arg5, var19, arg2, arg3, var22.field3612, var22.field3622, (class177) null);
            }
            var20.method3007(arg0, arg2, arg3, var30, var39, (class177) null, class90.field1099[arg5], 0, var33, var35);
            if (var22.field3614 != 0) {
                var21.method2302(arg2, arg3, arg6, arg5, var22.field3607);
            }
        } else if (arg6 == 2) {
            int var40 = arg5 + 1 & 0x3;
            class177 var41;
            class177 var42;
            if (var22.field3612 == -1 && var22.field3630 == null) {
                var41 = var22.method4603(2, arg5 + 4, var29, var31, var30, var32);
                var42 = var22.method4603(2, var40, var29, var31, var30, var32);
            } else {
                var41 = new class88(arg4, 2, arg5 + 4, var19, arg2, arg3, var22.field3612, var22.field3622, (class177) null);
                var42 = new class88(arg4, 2, var40, var19, arg2, arg3, var22.field3612, var22.field3622, (class177) null);
            }
            var20.method3007(arg0, arg2, arg3, var30, var41, var42, class90.field1095[arg5], class90.field1095[var40], var33, var35);
            if (var22.field3614 != 0) {
                var21.method2302(arg2, arg3, arg6, arg5, var22.field3607);
            }
        } else if (arg6 == 3) {
            class177 var43;
            if (var22.field3612 == -1 && var22.field3630 == null) {
                var43 = var22.method4603(3, arg5, var29, var31, var30, var32);
            } else {
                var43 = new class88(arg4, 3, arg5, var19, arg2, arg3, var22.field3612, var22.field3622, (class177) null);
            }
            var20.method3007(arg0, arg2, arg3, var30, var43, (class177) null, class90.field1099[arg5], 0, var33, var35);
            if (var22.field3614 != 0) {
                var21.method2302(arg2, arg3, arg6, arg5, var22.field3607);
            }
        } else if (arg6 == 9) {
            class177 var44;
            if (var22.field3612 == -1 && var22.field3630 == null) {
                var44 = var22.method4603(arg6, arg5, var29, var31, var30, var32);
            } else {
                var44 = new class88(arg4, arg6, arg5, var19, arg2, arg3, var22.field3612, var22.field3622, (class177) null);
            }
            var20.method3009(arg0, arg2, arg3, var30, 1, 1, var44, 0, var33, var35);
            if (var22.field3614 != 0) {
                var21.method2326(arg2, arg3, var23, var24, var22.field3607);
            }
        } else if (arg6 == 4) {
            class177 var45;
            if (var22.field3612 == -1 && var22.field3630 == null) {
                var45 = var22.method4603(4, arg5, var29, var31, var30, var32);
            } else {
                var45 = new class88(arg4, 4, arg5, var19, arg2, arg3, var22.field3612, var22.field3622, (class177) null);
            }
            var20.method3008(arg0, arg2, arg3, var30, var45, (class177) null, class90.field1095[arg5], 0, 0, 0, var33, var35);
        } else if (arg6 == 5) {
            int var46 = 16;
            long var47 = var20.method3066(arg0, arg2, arg3);
            if (var47 != 0L) {
                var46 = class295.method182(class184.method2752(var47)).field3613;
            }
            class177 var49;
            if (var22.field3612 == -1 && var22.field3630 == null) {
                var49 = var22.method4603(4, arg5, var29, var31, var30, var32);
            } else {
                var49 = new class88(arg4, 4, arg5, var19, arg2, arg3, var22.field3612, var22.field3622, (class177) null);
            }
            var20.method3008(arg0, arg2, arg3, var30, var49, (class177) null, class90.field1095[arg5], 0, class90.field1098[arg5] * var46, class90.field1101[arg5] * var46, var33, var35);
        } else if (arg6 == 6) {
            int var50 = 8;
            long var51 = var20.method3066(arg0, arg2, arg3);
            if (var51 != 0L) {
                var50 = class295.method182(class184.method2752(var51)).field3613 / 2;
            }
            class177 var53;
            if (var22.field3612 == -1 && var22.field3630 == null) {
                var53 = var22.method4603(4, arg5 + 4, var29, var31, var30, var32);
            } else {
                var53 = new class88(arg4, 4, arg5 + 4, var19, arg2, arg3, var22.field3612, var22.field3622, (class177) null);
            }
            var20.method3008(arg0, arg2, arg3, var30, var53, (class177) null, 256, arg5, class90.field1102[arg5] * var50, class90.field1100[arg5] * var50, var33, var35);
        } else if (arg6 == 7) {
            int var54 = arg5 + 2 & 0x3;
            class177 var55;
            if (var22.field3612 == -1 && var22.field3630 == null) {
                var55 = var22.method4603(4, var54 + 4, var29, var31, var30, var32);
            } else {
                var55 = new class88(arg4, 4, var54 + 4, var19, arg2, arg3, var22.field3612, var22.field3622, (class177) null);
            }
            var20.method3008(arg0, arg2, arg3, var30, var55, (class177) null, 256, var54, 0, 0, var33, var35);
        } else if (arg6 == 8) {
            int var56 = 8;
            long var57 = var20.method3066(arg0, arg2, arg3);
            if (var57 != 0L) {
                var56 = class295.method182(class184.method2752(var57)).field3613 / 2;
            }
            int var59 = arg5 + 2 & 0x3;
            class177 var60;
            class177 var61;
            if (var22.field3612 == -1 && var22.field3630 == null) {
                var60 = var22.method4603(4, arg5 + 4, var29, var31, var30, var32);
                var61 = var22.method4603(4, var59 + 4, var29, var31, var30, var32);
            } else {
                var60 = new class88(arg4, 4, arg5 + 4, var19, arg2, arg3, var22.field3612, var22.field3622, (class177) null);
                var61 = new class88(arg4, 4, var59 + 4, var19, arg2, arg3, var22.field3612, var22.field3622, (class177) null);
            }
            var20.method3008(arg0, arg2, arg3, var30, var60, var61, 256, arg5, class90.field1102[arg5] * var56, class90.field1100[arg5] * var56, var33, var35);
        }
    }

    @ObfuscatedName("hg.he(III)V")
    public static final void method3794(int arg0, int arg1) {
        class272 var2 = field731[Statics.field201][arg0][arg1];
        if (var2 == null) {
            Statics.field1599.method3118(Statics.field201, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class108 var5 = null;
        for (class108 var6 = (class108) var2.method4160(); var6 != null; var6 = (class108) var2.method4182()) {
            class296 var7 = class296.method194(var6.field1347);
            long var8 = (long) var7.field3653;
            if (var7.field3661 == 1) {
                var8 = (long) (var6.field1343 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field1599.method3118(Statics.field201, arg0, arg1);
            return;
        }
        var2.method4156(var5);
        class108 var10 = null;
        class108 var11 = null;
        for (class108 var12 = (class108) var2.method4160(); var12 != null; var12 = (class108) var2.method4182()) {
            if (var5.field1347 != var12.field1347) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1347 != var12.field1347 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        long var13 = class184.method1978(arg0, arg1, 3, false, 0);
        Statics.field1599.method3006(Statics.field201, arg0, arg1, method2142(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field201), var5, var13, var10, var11);
    }

    @ObfuscatedName("ih.hs(I)V")
    public static final void method3870() {
        class381 var0 = field649.field1386;
        var0.method5807();
        int var1 = var0.method5801(8);
        if (var1 < field644) {
            for (int var2 = var1; var2 < field644; var2++) {
                field725[++field724 - 1] = field645[var2];
            }
        }
        if (var1 > field644) {
            throw new RuntimeException("");
        }
        field644 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field645[var3];
            class105 var5 = field643[var4];
            int var6 = var0.method5801(1);
            if (var6 == 0) {
                field645[++field644 - 1] = var4;
                var5.field1221 = field611;
            } else {
                int var7 = var0.method5801(2);
                if (var7 == 0) {
                    field645[++field644 - 1] = var4;
                    var5.field1221 = field611;
                    field647[++field646 - 1] = var4;
                } else if (var7 == 1) {
                    field645[++field644 - 1] = var4;
                    var5.field1221 = field611;
                    int var8 = var0.method5801(3);
                    var5.method1962(var8, (byte) 1);
                    int var9 = var0.method5801(1);
                    if (var9 == 1) {
                        field647[++field646 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field645[++field644 - 1] = var4;
                    var5.field1221 = field611;
                    int var10 = var0.method5801(3);
                    var5.method1962(var10, (byte) 2);
                    int var11 = var0.method5801(3);
                    var5.method1962(var11, (byte) 2);
                    int var12 = var0.method5801(1);
                    if (var12 == 1) {
                        field647[++field646 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field725[++field724 - 1] = var4;
                }
            }
        }
    }

    @ObfuscatedName("fw.hc(ZLnk;ZI)V")
    public static final void method2810(boolean arg0, class381 arg1, boolean arg2) {
        while (true) {
            if (arg1.method5830(field649.field1388) >= 27) {
                int var3 = arg1.method5801(15);
                if (var3 != 32767) {
                    boolean var4 = false;
                    if (field643[var3] == null) {
                        field643[var3] = new class105();
                        var4 = true;
                    }
                    class105 var5 = field643[var3];
                    field645[++field644 - 1] = var3;
                    var5.field1221 = field611;
                    int var6;
                    int var8;
                    int var9;
                    if (arg2) {
                        int var11 = arg1.method5801(1);
                        if (var11 == 1) {
                            field647[++field646 - 1] = var3;
                        }
                        var5.field1319 = class287.method1652(arg1.method5801(14));
                        var8 = arg1.method5801(1);
                        if (arg0) {
                            var6 = arg1.method5801(8);
                            if (var6 > 127) {
                                var6 -= 256;
                            }
                        } else {
                            var6 = arg1.method5801(5);
                            if (var6 > 15) {
                                var6 -= 32;
                            }
                        }
                        if (arg0) {
                            var9 = arg1.method5801(8);
                            if (var9 > 127) {
                                var9 -= 256;
                            }
                        } else {
                            var9 = arg1.method5801(5);
                            if (var9 > 15) {
                                var9 -= 32;
                            }
                        }
                        boolean var12 = arg1.method5801(1) == 1;
                        if (var12) {
                            arg1.method5801(32);
                        }
                        int var13 = field729[arg1.method5801(3)];
                        if (var4) {
                            var5.field1226 = var5.field1213 = var13;
                        }
                    } else {
                        if (arg0) {
                            var6 = arg1.method5801(8);
                            if (var6 > 127) {
                                var6 -= 256;
                            }
                        } else {
                            var6 = arg1.method5801(5);
                            if (var6 > 15) {
                                var6 -= 32;
                            }
                        }
                        int var7 = arg1.method5801(1);
                        if (var7 == 1) {
                            field647[++field646 - 1] = var3;
                        }
                        var5.field1319 = class287.method1652(arg1.method5801(14));
                        var8 = arg1.method5801(1);
                        if (arg0) {
                            var9 = arg1.method5801(8);
                            if (var9 > 127) {
                                var9 -= 256;
                            }
                        } else {
                            var9 = arg1.method5801(5);
                            if (var9 > 15) {
                                var9 -= 32;
                            }
                        }
                        int var10 = field729[arg1.method5801(3)];
                        if (var4) {
                            var5.field1226 = var5.field1213 = var10;
                        }
                    }
                    var5.field1259 = var5.field1319.field3480;
                    var5.field1263 = var5.field1319.field3504;
                    if (var5.field1263 == 0) {
                        var5.field1213 = 0;
                    }
                    var5.field1218 = var5.field1319.field3486;
                    var5.field1219 = var5.field1319.field3482;
                    var5.field1220 = var5.field1319.field3488;
                    var5.field1247 = var5.field1319.field3497;
                    var5.field1211 = var5.field1319.field3493;
                    var5.field1252 = var5.field1319.field3495;
                    var5.field1217 = var5.field1319.field3485;
                    var5.method1963(Statics.field1374.field1265[0] + var9, Statics.field1374.field1266[0] + var6, var8 == 1);
                    continue;
                }
            }
            arg1.method5804();
            return;
        }
    }

    @ObfuscatedName("ao.hv(Lcs;IIBI)V")
    public static final void method294(class98 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field1265[0];
        int var5 = arg0.field1266[0];
        int var6 = arg0.method1853();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var7 = arg0.method1853();
        class137 var8 = method3189(arg1, arg2);
        class136 var9 = field661[arg0.field1186];
        int[] var10 = field880;
        int[] var11 = field727;
        for (int var12 = 0; var12 < 128; var12++) {
            for (int var13 = 0; var13 < 128; var13++) {
                class138.field1547[var12][var13] = 0;
                class138.field1548[var12][var13] = 99999999;
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
            class138.field1547[var16][var17] = 99;
            class138.field1548[var16][var17] = 0;
            byte var20 = 0;
            int var21 = 0;
            class138.field1549[var20] = var4;
            int var78 = var20 + 1;
            class138.field1546[var20] = var5;
            int[][] var22 = var9.field1535;
            boolean var27;
            while (true) {
                if (var78 == var21) {
                    Statics.field1378 = var14;
                    Statics.field1536 = var15;
                    var27 = false;
                    break;
                }
                var14 = class138.field1549[var21];
                var15 = class138.field1546[var21];
                var21 = var21 + 1 & 0xFFF;
                int var23 = var14 - var18;
                int var24 = var15 - var19;
                int var25 = var14 - var9.field1524;
                int var26 = var15 - var9.field1532;
                if (var8.method970(1, var14, var15, var9)) {
                    Statics.field1378 = var14;
                    Statics.field1536 = var15;
                    var27 = true;
                    break;
                }
                int var28 = class138.field1548[var23][var24] + 1;
                if (var23 > 0 && class138.field1547[var23 - 1][var24] == 0 && (var22[var25 - 1][var26] & 0x1240108) == 0) {
                    class138.field1549[var78] = var14 - 1;
                    class138.field1546[var78] = var15;
                    var78 = var78 + 1 & 0xFFF;
                    class138.field1547[var23 - 1][var24] = 2;
                    class138.field1548[var23 - 1][var24] = var28;
                }
                if (var23 < 127 && class138.field1547[var23 + 1][var24] == 0 && (var22[var25 + 1][var26] & 0x1240180) == 0) {
                    class138.field1549[var78] = var14 + 1;
                    class138.field1546[var78] = var15;
                    var78 = var78 + 1 & 0xFFF;
                    class138.field1547[var23 + 1][var24] = 8;
                    class138.field1548[var23 + 1][var24] = var28;
                }
                if (var24 > 0 && class138.field1547[var23][var24 - 1] == 0 && (var22[var25][var26 - 1] & 0x1240102) == 0) {
                    class138.field1549[var78] = var14;
                    class138.field1546[var78] = var15 - 1;
                    var78 = var78 + 1 & 0xFFF;
                    class138.field1547[var23][var24 - 1] = 1;
                    class138.field1548[var23][var24 - 1] = var28;
                }
                if (var24 < 127 && class138.field1547[var23][var24 + 1] == 0 && (var22[var25][var26 + 1] & 0x1240120) == 0) {
                    class138.field1549[var78] = var14;
                    class138.field1546[var78] = var15 + 1;
                    var78 = var78 + 1 & 0xFFF;
                    class138.field1547[var23][var24 + 1] = 4;
                    class138.field1548[var23][var24 + 1] = var28;
                }
                if (var23 > 0 && var24 > 0 && class138.field1547[var23 - 1][var24 - 1] == 0 && (var22[var25 - 1][var26 - 1] & 0x124010E) == 0 && (var22[var25 - 1][var26] & 0x1240108) == 0 && (var22[var25][var26 - 1] & 0x1240102) == 0) {
                    class138.field1549[var78] = var14 - 1;
                    class138.field1546[var78] = var15 - 1;
                    var78 = var78 + 1 & 0xFFF;
                    class138.field1547[var23 - 1][var24 - 1] = 3;
                    class138.field1548[var23 - 1][var24 - 1] = var28;
                }
                if (var23 < 127 && var24 > 0 && class138.field1547[var23 + 1][var24 - 1] == 0 && (var22[var25 + 1][var26 - 1] & 0x1240183) == 0 && (var22[var25 + 1][var26] & 0x1240180) == 0 && (var22[var25][var26 - 1] & 0x1240102) == 0) {
                    class138.field1549[var78] = var14 + 1;
                    class138.field1546[var78] = var15 - 1;
                    var78 = var78 + 1 & 0xFFF;
                    class138.field1547[var23 + 1][var24 - 1] = 9;
                    class138.field1548[var23 + 1][var24 - 1] = var28;
                }
                if (var23 > 0 && var24 < 127 && class138.field1547[var23 - 1][var24 + 1] == 0 && (var22[var25 - 1][var26 + 1] & 0x1240138) == 0 && (var22[var25 - 1][var26] & 0x1240108) == 0 && (var22[var25][var26 + 1] & 0x1240120) == 0) {
                    class138.field1549[var78] = var14 - 1;
                    class138.field1546[var78] = var15 + 1;
                    var78 = var78 + 1 & 0xFFF;
                    class138.field1547[var23 - 1][var24 + 1] = 6;
                    class138.field1548[var23 - 1][var24 + 1] = var28;
                }
                if (var23 < 127 && var24 < 127 && class138.field1547[var23 + 1][var24 + 1] == 0 && (var22[var25 + 1][var26 + 1] & 0x12401E0) == 0 && (var22[var25 + 1][var26] & 0x1240180) == 0 && (var22[var25][var26 + 1] & 0x1240120) == 0) {
                    class138.field1549[var78] = var14 + 1;
                    class138.field1546[var78] = var15 + 1;
                    var78 = var78 + 1 & 0xFFF;
                    class138.field1547[var23 + 1][var24 + 1] = 12;
                    class138.field1548[var23 + 1][var24 + 1] = var28;
                }
            }
            var29 = var27;
        } else if (var7 == 2) {
            var29 = class138.method876(var4, var5, var8, var9);
        } else {
            int var30 = var4;
            int var31 = var5;
            byte var32 = 64;
            byte var33 = 64;
            int var34 = var4 - var32;
            int var35 = var5 - var33;
            class138.field1547[var32][var33] = 99;
            class138.field1548[var32][var33] = 0;
            byte var36 = 0;
            int var37 = 0;
            class138.field1549[var36] = var4;
            int var79 = var36 + 1;
            class138.field1546[var36] = var5;
            int[][] var38 = var9.field1535;
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
                                        Statics.field1378 = var30;
                                        Statics.field1536 = var31;
                                        var43 = false;
                                        break label514;
                                    }
                                    var30 = class138.field1549[var37];
                                    var31 = class138.field1546[var37];
                                    var37 = var37 + 1 & 0xFFF;
                                    var39 = var30 - var34;
                                    var40 = var31 - var35;
                                    var41 = var30 - var9.field1524;
                                    var42 = var31 - var9.field1532;
                                    if (var8.method970(var7, var30, var31, var9)) {
                                        Statics.field1378 = var30;
                                        Statics.field1536 = var31;
                                        var43 = true;
                                        break label514;
                                    }
                                    var44 = class138.field1548[var39][var40] + 1;
                                    if (var39 > 0 && class138.field1547[var39 - 1][var40] == 0 && (var38[var41 - 1][var42] & 0x124010E) == 0 && (var38[var41 - 1][var7 + var42 - 1] & 0x1240138) == 0) {
                                        int var45 = 1;
                                        while (true) {
                                            if (var45 >= var7 - 1) {
                                                class138.field1549[var79] = var30 - 1;
                                                class138.field1546[var79] = var31;
                                                var79 = var79 + 1 & 0xFFF;
                                                class138.field1547[var39 - 1][var40] = 2;
                                                class138.field1548[var39 - 1][var40] = var44;
                                                break;
                                            }
                                            if ((var38[var41 - 1][var42 + var45] & 0x124013E) != 0) {
                                                break;
                                            }
                                            var45++;
                                        }
                                    }
                                    if (var39 < 128 - var7 && class138.field1547[var39 + 1][var40] == 0 && (var38[var7 + var41][var42] & 0x1240183) == 0 && (var38[var7 + var41][var7 + var42 - 1] & 0x12401E0) == 0) {
                                        int var46 = 1;
                                        while (true) {
                                            if (var46 >= var7 - 1) {
                                                class138.field1549[var79] = var30 + 1;
                                                class138.field1546[var79] = var31;
                                                var79 = var79 + 1 & 0xFFF;
                                                class138.field1547[var39 + 1][var40] = 8;
                                                class138.field1548[var39 + 1][var40] = var44;
                                                break;
                                            }
                                            if ((var38[var7 + var41][var42 + var46] & 0x12401E3) != 0) {
                                                break;
                                            }
                                            var46++;
                                        }
                                    }
                                    if (var40 > 0 && class138.field1547[var39][var40 - 1] == 0 && (var38[var41][var42 - 1] & 0x124010E) == 0 && (var38[var7 + var41 - 1][var42 - 1] & 0x1240183) == 0) {
                                        int var47 = 1;
                                        while (true) {
                                            if (var47 >= var7 - 1) {
                                                class138.field1549[var79] = var30;
                                                class138.field1546[var79] = var31 - 1;
                                                var79 = var79 + 1 & 0xFFF;
                                                class138.field1547[var39][var40 - 1] = 1;
                                                class138.field1548[var39][var40 - 1] = var44;
                                                break;
                                            }
                                            if ((var38[var41 + var47][var42 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var47++;
                                        }
                                    }
                                    if (var40 < 128 - var7 && class138.field1547[var39][var40 + 1] == 0 && (var38[var41][var7 + var42] & 0x1240138) == 0 && (var38[var7 + var41 - 1][var7 + var42] & 0x12401E0) == 0) {
                                        int var48 = 1;
                                        while (true) {
                                            if (var48 >= var7 - 1) {
                                                class138.field1549[var79] = var30;
                                                class138.field1546[var79] = var31 + 1;
                                                var79 = var79 + 1 & 0xFFF;
                                                class138.field1547[var39][var40 + 1] = 4;
                                                class138.field1548[var39][var40 + 1] = var44;
                                                break;
                                            }
                                            if ((var38[var41 + var48][var7 + var42] & 0x12401F8) != 0) {
                                                break;
                                            }
                                            var48++;
                                        }
                                    }
                                    if (var39 > 0 && var40 > 0 && class138.field1547[var39 - 1][var40 - 1] == 0 && (var38[var41 - 1][var42 - 1] & 0x124010E) == 0) {
                                        int var49 = 1;
                                        while (true) {
                                            if (var49 >= var7) {
                                                class138.field1549[var79] = var30 - 1;
                                                class138.field1546[var79] = var31 - 1;
                                                var79 = var79 + 1 & 0xFFF;
                                                class138.field1547[var39 - 1][var40 - 1] = 3;
                                                class138.field1548[var39 - 1][var40 - 1] = var44;
                                                break;
                                            }
                                            if ((var38[var41 - 1][var42 - 1 + var49] & 0x124013E) != 0 || (var38[var41 - 1 + var49][var42 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var49++;
                                        }
                                    }
                                    if (var39 < 128 - var7 && var40 > 0 && class138.field1547[var39 + 1][var40 - 1] == 0 && (var38[var7 + var41][var42 - 1] & 0x1240183) == 0) {
                                        int var50 = 1;
                                        while (true) {
                                            if (var50 >= var7) {
                                                class138.field1549[var79] = var30 + 1;
                                                class138.field1546[var79] = var31 - 1;
                                                var79 = var79 + 1 & 0xFFF;
                                                class138.field1547[var39 + 1][var40 - 1] = 9;
                                                class138.field1548[var39 + 1][var40 - 1] = var44;
                                                break;
                                            }
                                            if ((var38[var7 + var41][var42 - 1 + var50] & 0x12401E3) != 0 || (var38[var41 + var50][var42 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var50++;
                                        }
                                    }
                                    if (var39 > 0 && var40 < 128 - var7 && class138.field1547[var39 - 1][var40 + 1] == 0 && (var38[var41 - 1][var7 + var42] & 0x1240138) == 0) {
                                        for (int var51 = 1; var51 < var7; var51++) {
                                            if ((var38[var41 - 1][var42 + var51] & 0x124013E) != 0 || (var38[var41 - 1 + var51][var7 + var42] & 0x12401F8) != 0) {
                                                continue label489;
                                            }
                                        }
                                        class138.field1549[var79] = var30 - 1;
                                        class138.field1546[var79] = var31 + 1;
                                        var79 = var79 + 1 & 0xFFF;
                                        class138.field1547[var39 - 1][var40 + 1] = 6;
                                        class138.field1548[var39 - 1][var40 + 1] = var44;
                                    }
                                } while (var39 >= 128 - var7);
                            } while (var40 >= 128 - var7);
                        } while (class138.field1547[var39 + 1][var40 + 1] != 0);
                    } while ((var38[var7 + var41][var7 + var42] & 0x12401E0) != 0);
                    for (int var52 = 1; var52 < var7; var52++) {
                        if ((var38[var41 + var52][var7 + var42] & 0x12401F8) != 0 || (var38[var7 + var41][var42 + var52] & 0x12401E3) != 0) {
                            continue label512;
                        }
                    }
                    class138.field1549[var79] = var30 + 1;
                    class138.field1546[var79] = var31 + 1;
                    var79 = var79 + 1 & 0xFFF;
                    class138.field1547[var39 + 1][var40 + 1] = 12;
                    class138.field1548[var39 + 1][var40 + 1] = var44;
                }
            }
            var29 = var43;
        }
        int var71;
        label570: {
            int var53 = var4 - 64;
            int var54 = var5 - 64;
            int var55 = Statics.field1378;
            int var56 = Statics.field1536;
            if (!var29) {
                int var57 = Integer.MAX_VALUE;
                int var58 = Integer.MAX_VALUE;
                byte var59 = 10;
                int var60 = var8.field1539;
                int var61 = var8.field1542;
                int var62 = var8.field1541;
                int var63 = var8.field1543;
                for (int var64 = var60 - var59; var64 <= var59 + var60; var64++) {
                    for (int var65 = var61 - var59; var65 <= var59 + var61; var65++) {
                        int var66 = var64 - var53;
                        int var67 = var65 - var54;
                        if (var66 >= 0 && var67 >= 0 && var66 < 128 && var67 < 128 && class138.field1548[var66][var67] < 100) {
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
                            if (var70 < var57 || var57 == var70 && class138.field1548[var66][var67] < var58) {
                                var57 = var70;
                                var58 = class138.field1548[var66][var67];
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
                class138.field1549[var72] = var55;
                int var80 = var72 + 1;
                class138.field1546[var72] = var56;
                int var73;
                int var74 = var73 = class138.field1547[var55 - var53][var56 - var54];
                while (var4 != var55 || var5 != var56) {
                    if (var73 != var74) {
                        var73 = var74;
                        class138.field1549[var80] = var55;
                        class138.field1546[var80++] = var56;
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
                    var74 = class138.field1547[var55 - var53][var56 - var54];
                }
                int var75 = 0;
                while (var80-- > 0) {
                    var10[var75] = class138.field1549[var80];
                    var11[var75++] = class138.field1546[var80];
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
                arg0.method1874(field880[var77], field727[var77], arg3);
            }
        }
    }

    @ObfuscatedName("fm.ho(III)Leb;")
    public static class137 method3189(int arg0, int arg1) {
        field879.field1539 = arg0;
        field879.field1542 = arg1;
        field879.field1541 = 1;
        field879.field1543 = 1;
        return field879;
    }

    @ObfuscatedName("kf.hj(I)V")
    public static void method4469() {
        field740 = 0;
        field739 = false;
        field745[0] = class246.field2969;
        field746[0] = "";
        field648[0] = 1006;
        field833[0] = false;
        field740 = 1;
    }

    @ObfuscatedName("ej.hq(III)V")
    public static final void method2725(int arg0, int arg1) {
        if (field740 < 2 && field756 == 0 && !field758 || !field751) {
            return;
        }
        int var2 = method2997();
        String var3;
        if (field756 == 1 && field740 < 2) {
            var3 = class246.field3164 + class246.field3158 + field695 + " " + class106.field1325;
        } else if (field758 && field740 < 2) {
            var3 = field815 + class246.field3158 + field762 + " " + class106.field1325;
        } else {
            var3 = method927(var2);
        }
        if (field740 > 2) {
            var3 = var3 + class106.method5281(16777215) + " " + '/' + " " + (field740 - 2) + class246.field3211;
        }
        Statics.field4121.method4793(var3, arg0 + 4, arg1 + 15, 16777215, 0, field611 / 1000);
    }

    @ObfuscatedName("lm.hh(I)V")
    public static final void method5251() {
        int var0 = Statics.field131;
        int var1 = Statics.field4060;
        int var2 = Statics.field1194;
        int var3 = Statics.field94;
        int var4 = 6116423;
        class391.method6191(var0, var1, var2, var3, var4);
        class391.method6191(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class391.method6131(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field4121.method4785(class246.field3069, var0 + 3, var1 + 14, var4, -1);
        int var5 = class48.field342;
        int var6 = class48.field357;
        for (int var7 = 0; var7 < field740; var7++) {
            int var8 = (field740 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            Statics.field4121.method4785(method927(var7), var0 + 3, var8, var9, 0);
        }
        method1926(Statics.field131, Statics.field4060, Statics.field1194, Statics.field94);
    }

    @ObfuscatedName("hx.hw(I)Z")
    public static final boolean method3796() {
        return field739;
    }

    @ObfuscatedName("ci.hk(IIIII)V")
    public static final void method1926(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field810; var4++) {
            if (field817[var4] + field677[var4] > arg0 && field677[var4] < arg0 + arg2 && field818[var4] + field672[var4] > arg1 && field672[var4] < arg1 + arg3) {
                field813[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.hp(B)V")
    public final void method993() {
        method3872();
        if (Statics.field2234 != null || field776 != null) {
            return;
        }
        int var1 = class48.field355;
        if (!field739) {
            int var28 = field740 - 1;
            if ((var1 == 1 || !Statics.field360 && var1 == 4) && var28 >= 0) {
                int var30 = field648[var28];
                if (var30 == 39 || var30 == 40 || var30 == 41 || var30 == 42 || var30 == 43 || var30 == 33 || var30 == 34 || var30 == 35 || var30 == 36 || var30 == 37 || var30 == 38 || var30 == 1005) {
                    int var31 = field826[var28];
                    int var32 = field742[var28];
                    class225 var33 = class225.method2354(var32);
                    if (class226.method30(method3830(var33)) || class226.method928(method3830(var33))) {
                        if (Statics.field2234 != null && !field715 && field740 > 0 && !this.method1318()) {
                            method203(field659, field713);
                        }
                        field715 = false;
                        field716 = 0;
                        if (Statics.field2234 != null) {
                            method213(Statics.field2234);
                        }
                        Statics.field2234 = class225.method2354(var32);
                        field711 = var31;
                        field659 = class48.field343;
                        field713 = class48.field348;
                        if (var28 >= 0) {
                            Statics.field195 = new class82();
                            Statics.field195.field981 = field826[var28];
                            Statics.field195.field977 = field742[var28];
                            Statics.field195.field978 = field648[var28];
                            Statics.field195.field979 = field744[var28];
                            Statics.field195.field980 = field745[var28];
                        }
                        method213(Statics.field2234);
                        return;
                    }
                }
            }
            if ((var1 == 1 || !Statics.field360 && var1 == 4) && this.method1318()) {
                var1 = 2;
            }
            if ((var1 == 1 || !Statics.field360 && var1 == 4) && field740 > 0 && var28 >= 0) {
                int var34 = field826[var28];
                int var35 = field742[var28];
                int var36 = field648[var28];
                int var37 = field744[var28];
                String var38 = field745[var28];
                String var39 = field746[var28];
                method2179(var34, var35, var36, var37, var38, var39, class48.field343, class48.field348);
            }
            if (var1 == 2 && field740 > 0) {
                this.method1218(class48.field343, class48.field348);
            }
            return;
        }
        if (var1 != 1 && (Statics.field360 || var1 != 4)) {
            int var2 = class48.field342;
            int var3 = class48.field357;
            if (var2 < Statics.field131 - 10 || var2 > Statics.field131 + Statics.field1194 + 10 || var3 < Statics.field4060 - 10 || var3 > Statics.field94 + Statics.field4060 + 10) {
                field739 = false;
                int var4 = Statics.field131;
                int var5 = Statics.field4060;
                int var6 = Statics.field1194;
                int var7 = Statics.field94;
                for (int var8 = 0; var8 < field810; var8++) {
                    if (field817[var8] + field677[var8] > var4 && field677[var8] < var4 + var6 && field818[var8] + field672[var8] > var5 && field672[var8] < var5 + var7) {
                        field812[var8] = true;
                    }
                }
            }
        }
        if (var1 != 1 && Statics.field360 || var1 != 4) {
            return;
        }
        int var9 = Statics.field131;
        int var10 = Statics.field4060;
        int var11 = Statics.field1194;
        int var12 = class48.field343;
        int var13 = class48.field348;
        int var14 = -1;
        for (int var15 = 0; var15 < field740; var15++) {
            int var16 = (field740 - 1 - var15) * 15 + var10 + 31;
            if (var12 > var9 && var12 < var9 + var11 && var13 > var16 - 13 && var13 < var16 + 3) {
                var14 = var15;
            }
        }
        if (var14 != -1 && var14 >= 0) {
            int var17 = field826[var14];
            int var18 = field742[var14];
            int var19 = field648[var14];
            int var20 = field744[var14];
            String var21 = field745[var14];
            String var22 = field746[var14];
            method2179(var17, var18, var19, var20, var21, var22, class48.field343, class48.field348);
        }
        field739 = false;
        int var23 = Statics.field131;
        int var24 = Statics.field4060;
        int var25 = Statics.field1194;
        int var26 = Statics.field94;
        for (int var27 = 0; var27 < field810; var27++) {
            if (field817[var27] + field677[var27] > var23 && field677[var27] < var23 + var25 && field818[var27] + field672[var27] > var24 && field672[var27] < var24 + var26) {
                field812[var27] = true;
            }
        }
    }

    @ObfuscatedName("client.ht(I)Z")
    public final boolean method1318() {
        int var1 = method2997();
        return (field874 == 1 && field740 > 2 || method1882(var1)) && !field833[var1];
    }

    @ObfuscatedName("client.hi(III)V")
    public final void method1218(int arg0, int arg1) {
        method3657(arg0, arg1);
        Statics.field1599.method3063(Statics.field201, arg0, arg1, false);
        field739 = true;
    }

    @ObfuscatedName("hh.hu(IIB)V")
    public static void method3657(int arg0, int arg1) {
        int var2 = Statics.field4121.method4781(class246.field3069);
        for (int var3 = 0; var3 < field740; var3++) {
            int var4 = Statics.field4121.method4781(method927(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field740 * 15 + 22;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > Statics.field1143) {
            var6 = Statics.field1143 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > Statics.field320) {
            var7 = Statics.field320 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        Statics.field131 = var6;
        Statics.field4060 = var7;
        Statics.field1194 = var2;
        Statics.field94 = field740 * 15 + 22;
    }

    @ObfuscatedName("cs.hg(IB)Z")
    public static final boolean method1882(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field648[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("dp.hx(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method2179(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 25) {
            class225 var8 = class225.method3833(arg1, arg0);
            if (var8 != null) {
                method2737();
                method3869(arg1, arg0, class226.method3716(method3830(var8)), var8.field2753);
                field756 = 0;
                field815 = method145(var8);
                if (field815 == null) {
                    field815 = class246.field2920;
                }
                if (var8.field2625) {
                    field762 = var8.field2704 + class106.method5281(16777215);
                } else {
                    field762 = class106.method5281(65280) + var8.field2674 + class106.method5281(16777215);
                }
            }
            return;
        }
        if (arg2 == 47) {
            class98 var9 = field849[arg3];
            if (var9 != null) {
                field704 = arg6;
                field730 = arg7;
                field782 = 2;
                field706 = 0;
                field839 = arg0;
                field840 = arg1;
                class205 var10 = class205.method4631(class203.field2251, field649.field1385);
                var10.field2342.method5934(class39.field247[82] ? 1 : 0);
                var10.field2342.method6047(arg3);
                field649.method2099(var10);
            }
        }
        if (arg2 == 35) {
            class205 var11 = class205.method4631(class203.field2265, field649.field1385);
            var11.field2342.method5842(arg1);
            var11.field2342.method5992(arg3);
            var11.field2342.method5853(arg0);
            field649.method2099(var11);
            field709 = 0;
            Statics.field1395 = class225.method2354(arg1);
            field710 = arg0;
        }
        if (arg2 == 38) {
            method2737();
            class225 var12 = class225.method2354(arg1);
            field756 = 1;
            Statics.field2466 = arg0;
            Statics.field1451 = arg1;
            Statics.field884 = arg3;
            method213(var12);
            field695 = class106.method5281(16748608) + class296.method194(arg3).field3691 + class106.method5281(16777215);
            if (field695 == null) {
                field695 = class246.field2920;
            }
            return;
        }
        if (arg2 == 28) {
            class205 var13 = class205.method4631(class203.field2241, field649.field1385);
            var13.field2342.method5842(arg1);
            field649.method2099(var13);
            class225 var14 = class225.method2354(arg1);
            if (var14.field2722 != null && var14.field2722[0][0] == 5) {
                int var15 = var14.field2722[0][1];
                class220.field2578[var15] = 1 - class220.field2578[var15];
                method207(var15);
            }
        }
        if (arg2 == 30 && field640 == null) {
            method339(arg1, arg0);
            field640 = class225.method3833(arg1, arg0);
            method213(field640);
        }
        if (arg2 == 37) {
            class205 var16 = class205.method4631(class203.field2290, field649.field1385);
            var16.field2342.method5900(arg1);
            var16.field2342.method5992(arg3);
            var16.field2342.method5890(arg0);
            field649.method2099(var16);
            field709 = 0;
            Statics.field1395 = class225.method2354(arg1);
            field710 = arg0;
        }
        if (arg2 == 1002) {
            field704 = arg6;
            field730 = arg7;
            field782 = 2;
            field706 = 0;
            class205 var17 = class205.method4631(class203.field2247, field649.field1385);
            var17.field2342.method5890(arg3);
            field649.method2099(var17);
        }
        if (arg2 == 39) {
            class205 var18 = class205.method4631(class203.field2316, field649.field1385);
            var18.field2342.method6030(arg1);
            var18.field2342.method6047(arg3);
            var18.field2342.method6047(arg0);
            field649.method2099(var18);
            field709 = 0;
            Statics.field1395 = class225.method2354(arg1);
            field710 = arg0;
        }
        if (arg2 == 19) {
            field704 = arg6;
            field730 = arg7;
            field782 = 2;
            field706 = 0;
            field839 = arg0;
            field840 = arg1;
            class205 var19 = class205.method4631(class203.field2261, field649.field1385);
            var19.field2342.method5992(Statics.field1892 + arg1);
            var19.field2342.method5934(class39.field247[82] ? 1 : 0);
            var19.field2342.method5890(arg3);
            var19.field2342.method5992(Statics.field1795 + arg0);
            field649.method2099(var19);
        }
        if (arg2 == 29) {
            class205 var20 = class205.method4631(class203.field2241, field649.field1385);
            var20.field2342.method5842(arg1);
            field649.method2099(var20);
            class225 var21 = class225.method2354(arg1);
            if (var21.field2722 != null && var21.field2722[0][0] == 5) {
                int var22 = var21.field2722[0][1];
                if (class220.field2578[var22] != var21.field2747[0]) {
                    class220.field2578[var22] = var21.field2747[0];
                    method207(var22);
                }
            }
        }
        if (arg2 == 13) {
            class105 var23 = field643[arg3];
            if (var23 != null) {
                field704 = arg6;
                field730 = arg7;
                field782 = 2;
                field706 = 0;
                field839 = arg0;
                field840 = arg1;
                class205 var24 = class205.method4631(class203.field2310, field649.field1385);
                var24.field2342.method5890(arg3);
                var24.field2342.method5882(class39.field247[82] ? 1 : 0);
                field649.method2099(var24);
            }
        }
        if (arg2 == 50) {
            class98 var25 = field849[arg3];
            if (var25 != null) {
                field704 = arg6;
                field730 = arg7;
                field782 = 2;
                field706 = 0;
                field839 = arg0;
                field840 = arg1;
                class205 var26 = class205.method4631(class203.field2245, field649.field1385);
                var26.field2342.method5934(class39.field247[82] ? 1 : 0);
                var26.field2342.method5890(arg3);
                field649.method2099(var26);
            }
        }
        if (arg2 == 8) {
            class105 var27 = field643[arg3];
            if (var27 != null) {
                field704 = arg6;
                field730 = arg7;
                field782 = 2;
                field706 = 0;
                field839 = arg0;
                field840 = arg1;
                class205 var28 = class205.method4631(class203.field2216, field649.field1385);
                var28.field2342.method5842(Statics.field1658);
                var28.field2342.method5882(class39.field247[82] ? 1 : 0);
                var28.field2342.method5853(field759);
                var28.field2342.method6047(arg3);
                field649.method2099(var28);
            }
        }
        if (arg2 == 32) {
            class205 var29 = class205.method4631(class203.field2220, field649.field1385);
            var29.field2342.method5992(arg0);
            var29.field2342.method5853(arg3);
            var29.field2342.method5900(Statics.field1658);
            var29.field2342.method5842(arg1);
            var29.field2342.method5890(field759);
            field649.method2099(var29);
            field709 = 0;
            Statics.field1395 = class225.method2354(arg1);
            field710 = arg0;
        }
        if (arg2 == 1001) {
            field704 = arg6;
            field730 = arg7;
            field782 = 2;
            field706 = 0;
            field839 = arg0;
            field840 = arg1;
            class205 var30 = class205.method4631(class203.field2286, field649.field1385);
            var30.field2342.method5992(Statics.field1892 + arg1);
            var30.field2342.method5882(class39.field247[82] ? 1 : 0);
            var30.field2342.method6047(arg3);
            var30.field2342.method5890(Statics.field1795 + arg0);
            field649.method2099(var30);
        }
        if (arg2 == 26) {
            method3928();
        }
        if (arg2 == 7) {
            class105 var31 = field643[arg3];
            if (var31 != null) {
                field704 = arg6;
                field730 = arg7;
                field782 = 2;
                field706 = 0;
                field839 = arg0;
                field840 = arg1;
                class205 var32 = class205.method4631(class203.field2249, field649.field1385);
                var32.field2342.method5842(Statics.field1451);
                var32.field2342.method5890(Statics.field884);
                var32.field2342.method5890(Statics.field2466);
                var32.field2342.method5934(class39.field247[82] ? 1 : 0);
                var32.field2342.method5992(arg3);
                field649.method2099(var32);
            }
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field1411.method5454(arg2, arg3, new class221(arg0), new class221(arg1));
        }
        if (arg2 == 11) {
            class105 var33 = field643[arg3];
            if (var33 != null) {
                field704 = arg6;
                field730 = arg7;
                field782 = 2;
                field706 = 0;
                field839 = arg0;
                field840 = arg1;
                class205 var34 = class205.method4631(class203.field2259, field649.field1385);
                var34.field2342.method5890(arg3);
                var34.field2342.method5934(class39.field247[82] ? 1 : 0);
                field649.method2099(var34);
            }
        }
        if (arg2 == 3) {
            field704 = arg6;
            field730 = arg7;
            field782 = 2;
            field706 = 0;
            field839 = arg0;
            field840 = arg1;
            class205 var35 = class205.method4631(class203.field2223, field649.field1385);
            var35.field2342.method5992(Statics.field1892 + arg1);
            var35.field2342.method5934(class39.field247[82] ? 1 : 0);
            var35.field2342.method6047(arg3);
            var35.field2342.method5853(Statics.field1795 + arg0);
            field649.method2099(var35);
        }
        if (arg2 == 22) {
            field704 = arg6;
            field730 = arg7;
            field782 = 2;
            field706 = 0;
            field839 = arg0;
            field840 = arg1;
            class205 var36 = class205.method4631(class203.field2255, field649.field1385);
            var36.field2342.method5882(class39.field247[82] ? 1 : 0);
            var36.field2342.method5992(Statics.field1795 + arg0);
            var36.field2342.method5853(Statics.field1892 + arg1);
            var36.field2342.method5992(arg3);
            field649.method2099(var36);
        }
        if (arg2 == 21) {
            field704 = arg6;
            field730 = arg7;
            field782 = 2;
            field706 = 0;
            field839 = arg0;
            field840 = arg1;
            class205 var37 = class205.method4631(class203.field2304, field649.field1385);
            var37.field2342.method5839(class39.field247[82] ? 1 : 0);
            var37.field2342.method5992(Statics.field1892 + arg1);
            var37.field2342.method5992(Statics.field1795 + arg0);
            var37.field2342.method5853(arg3);
            field649.method2099(var37);
        }
        if (arg2 == 34) {
            class205 var38 = class205.method4631(class203.field2300, field649.field1385);
            var38.field2342.method5992(arg3);
            var38.field2342.method5992(arg0);
            var38.field2342.method6030(arg1);
            field649.method2099(var38);
            field709 = 0;
            Statics.field1395 = class225.method2354(arg1);
            field710 = arg0;
        }
        if (arg2 == 31) {
            class205 var39 = class205.method4631(class203.field2275, field649.field1385);
            var39.field2342.method6047(arg3);
            var39.field2342.method6030(arg1);
            var39.field2342.method5992(Statics.field884);
            var39.field2342.method5853(arg0);
            var39.field2342.method5853(Statics.field2466);
            var39.field2342.method6030(Statics.field1451);
            field649.method2099(var39);
            field709 = 0;
            Statics.field1395 = class225.method2354(arg1);
            field710 = arg0;
        }
        if (arg2 == 12) {
            class105 var40 = field643[arg3];
            if (var40 != null) {
                field704 = arg6;
                field730 = arg7;
                field782 = 2;
                field706 = 0;
                field839 = arg0;
                field840 = arg1;
                class205 var41 = class205.method4631(class203.field2283, field649.field1385);
                var41.field2342.method6047(arg3);
                var41.field2342.method5915(class39.field247[82] ? 1 : 0);
                field649.method2099(var41);
            }
        }
        if (arg2 == 48) {
            class98 var42 = field849[arg3];
            if (var42 != null) {
                field704 = arg6;
                field730 = arg7;
                field782 = 2;
                field706 = 0;
                field839 = arg0;
                field840 = arg1;
                class205 var43 = class205.method4631(class203.field2309, field649.field1385);
                var43.field2342.method5853(arg3);
                var43.field2342.method5882(class39.field247[82] ? 1 : 0);
                field649.method2099(var43);
            }
        }
        if (arg2 == 1005) {
            class225 var44 = class225.method2354(arg1);
            if (var44 == null || var44.field2752[arg0] < 100000) {
                class205 var45 = class205.method4631(class203.field2296, field649.field1385);
                var45.field2342.method6047(arg3);
                field649.method2099(var45);
            } else {
                class111.method930(27, "", var44.field2752[arg0] + " x " + class296.method194(arg3).field3691);
            }
            field709 = 0;
            Statics.field1395 = class225.method2354(arg1);
            field710 = arg0;
        }
        if (arg2 == 1003) {
            field704 = arg6;
            field730 = arg7;
            field782 = 2;
            field706 = 0;
            class105 var46 = field643[arg3];
            if (var46 != null) {
                class287 var47 = var46.field1319;
                if (var47.field3487 != null) {
                    var47 = var47.method4437();
                }
                if (var47 != null) {
                    class205 var48 = class205.method4631(class203.field2291, field649.field1385);
                    var48.field2342.method6047(var47.field3478);
                    field649.method2099(var48);
                }
            }
        }
        if (arg2 == 20) {
            field704 = arg6;
            field730 = arg7;
            field782 = 2;
            field706 = 0;
            field839 = arg0;
            field840 = arg1;
            class205 var49 = class205.method4631(class203.field2306, field649.field1385);
            var49.field2342.method6047(Statics.field1795 + arg0);
            var49.field2342.method5882(class39.field247[82] ? 1 : 0);
            var49.field2342.method6047(Statics.field1892 + arg1);
            var49.field2342.method5992(arg3);
            field649.method2099(var49);
        }
        if (arg2 == 40) {
            class205 var50 = class205.method4631(class203.field2326, field649.field1385);
            var50.field2342.method5890(arg3);
            var50.field2342.method5992(arg0);
            var50.field2342.method6030(arg1);
            field649.method2099(var50);
            field709 = 0;
            Statics.field1395 = class225.method2354(arg1);
            field710 = arg0;
        }
        if (arg2 == 15) {
            class98 var51 = field849[arg3];
            if (var51 != null) {
                field704 = arg6;
                field730 = arg7;
                field782 = 2;
                field706 = 0;
                field839 = arg0;
                field840 = arg1;
                class205 var52 = class205.method4631(class203.field2266, field649.field1385);
                var52.field2342.method5900(Statics.field1658);
                var52.field2342.method5882(class39.field247[82] ? 1 : 0);
                var52.field2342.method5992(arg3);
                var52.field2342.method6047(field759);
                field649.method2099(var52);
            }
        }
        if (arg2 == 2) {
            field704 = arg6;
            field730 = arg7;
            field782 = 2;
            field706 = 0;
            field839 = arg0;
            field840 = arg1;
            class205 var53 = class205.method4631(class203.field2230, field649.field1385);
            var53.field2342.method5992(field759);
            var53.field2342.method5890(Statics.field1795 + arg0);
            var53.field2342.method5839(class39.field247[82] ? 1 : 0);
            var53.field2342.method5890(Statics.field1892 + arg1);
            var53.field2342.method5890(arg3);
            var53.field2342.method5901(Statics.field1658);
            field649.method2099(var53);
        }
        if (arg2 == 49) {
            class98 var54 = field849[arg3];
            if (var54 != null) {
                field704 = arg6;
                field730 = arg7;
                field782 = 2;
                field706 = 0;
                field839 = arg0;
                field840 = arg1;
                class205 var55 = class205.method4631(class203.field2277, field649.field1385);
                var55.field2342.method5890(arg3);
                var55.field2342.method5882(class39.field247[82] ? 1 : 0);
                field649.method2099(var55);
            }
        }
        if (arg2 == 36) {
            class205 var56 = class205.method4631(class203.field2318, field649.field1385);
            var56.field2342.method5853(arg0);
            var56.field2342.method6047(arg3);
            var56.field2342.method5900(arg1);
            field649.method2099(var56);
            field709 = 0;
            Statics.field1395 = class225.method2354(arg1);
            field710 = arg0;
        }
        if (arg2 == 18) {
            field704 = arg6;
            field730 = arg7;
            field782 = 2;
            field706 = 0;
            field839 = arg0;
            field840 = arg1;
            class205 var57 = class205.method4631(class203.field2233, field649.field1385);
            var57.field2342.method5890(Statics.field1795 + arg0);
            var57.field2342.method5915(class39.field247[82] ? 1 : 0);
            var57.field2342.method5890(Statics.field1892 + arg1);
            var57.field2342.method5853(arg3);
            field649.method2099(var57);
        }
        if (arg2 == 45) {
            class98 var58 = field849[arg3];
            if (var58 != null) {
                field704 = arg6;
                field730 = arg7;
                field782 = 2;
                field706 = 0;
                field839 = arg0;
                field840 = arg1;
                class205 var59 = class205.method4631(class203.field2252, field649.field1385);
                var59.field2342.method5890(arg3);
                var59.field2342.method5839(class39.field247[82] ? 1 : 0);
                field649.method2099(var59);
            }
        }
        if (arg2 == 16) {
            field704 = arg6;
            field730 = arg7;
            field782 = 2;
            field706 = 0;
            field839 = arg0;
            field840 = arg1;
            class205 var60 = class205.method4631(class203.field2260, field649.field1385);
            var60.field2342.method5890(Statics.field2466);
            var60.field2342.method5901(Statics.field1451);
            var60.field2342.method6047(Statics.field1795 + arg0);
            var60.field2342.method5915(class39.field247[82] ? 1 : 0);
            var60.field2342.method5890(Statics.field884);
            var60.field2342.method5890(Statics.field1892 + arg1);
            var60.field2342.method5853(arg3);
            field649.method2099(var60);
        }
        if (arg2 == 24) {
            class225 var61 = class225.method2354(arg1);
            boolean var62 = true;
            if (var61.field2629 > 0) {
                var62 = method5046(var61);
            }
            if (var62) {
                class205 var63 = class205.method4631(class203.field2241, field649.field1385);
                var63.field2342.method5842(arg1);
                field649.method2099(var63);
            }
        }
        if (arg2 == 4) {
            field704 = arg6;
            field730 = arg7;
            field782 = 2;
            field706 = 0;
            field839 = arg0;
            field840 = arg1;
            class205 var64 = class205.method4631(class203.field2293, field649.field1385);
            var64.field2342.method5890(Statics.field1892 + arg1);
            var64.field2342.method5853(Statics.field1795 + arg0);
            var64.field2342.method5934(class39.field247[82] ? 1 : 0);
            var64.field2342.method5890(arg3);
            field649.method2099(var64);
        }
        if (arg2 == 44) {
            class98 var65 = field849[arg3];
            if (var65 != null) {
                field704 = arg6;
                field730 = arg7;
                field782 = 2;
                field706 = 0;
                field839 = arg0;
                field840 = arg1;
                class205 var66 = class205.method4631(class203.field2319, field649.field1385);
                var66.field2342.method5915(class39.field247[82] ? 1 : 0);
                var66.field2342.method5890(arg3);
                field649.method2099(var66);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class225 var67 = class225.method3833(arg1, arg0);
            if (var67 != null) {
                method5788(arg3, arg1, arg0, var67.field2753, arg5);
            }
        }
        if (arg2 == 17) {
            field704 = arg6;
            field730 = arg7;
            field782 = 2;
            field706 = 0;
            field839 = arg0;
            field840 = arg1;
            class205 var68 = class205.method4631(class203.field2322, field649.field1385);
            var68.field2342.method5842(Statics.field1658);
            var68.field2342.method5915(class39.field247[82] ? 1 : 0);
            var68.field2342.method6047(arg3);
            var68.field2342.method5992(Statics.field1892 + arg1);
            var68.field2342.method5890(field759);
            var68.field2342.method5853(Statics.field1795 + arg0);
            field649.method2099(var68);
        }
        if (arg2 == 9) {
            class105 var69 = field643[arg3];
            if (var69 != null) {
                field704 = arg6;
                field730 = arg7;
                field782 = 2;
                field706 = 0;
                field839 = arg0;
                field840 = arg1;
                class205 var70 = class205.method4631(class203.field2279, field649.field1385);
                var70.field2342.method5890(arg3);
                var70.field2342.method5915(class39.field247[82] ? 1 : 0);
                field649.method2099(var70);
            }
        }
        if (arg2 == 51) {
            class98 var71 = field849[arg3];
            if (var71 != null) {
                field704 = arg6;
                field730 = arg7;
                field782 = 2;
                field706 = 0;
                field839 = arg0;
                field840 = arg1;
                class205 var72 = class205.method4631(class203.field2229, field649.field1385);
                var72.field2342.method6047(arg3);
                var72.field2342.method5839(class39.field247[82] ? 1 : 0);
                field649.method2099(var72);
            }
        }
        if (arg2 == 46) {
            class98 var73 = field849[arg3];
            if (var73 != null) {
                field704 = arg6;
                field730 = arg7;
                field782 = 2;
                field706 = 0;
                field839 = arg0;
                field840 = arg1;
                class205 var74 = class205.method4631(class203.field2276, field649.field1385);
                var74.field2342.method5992(arg3);
                var74.field2342.method5915(class39.field247[82] ? 1 : 0);
                field649.method2099(var74);
            }
        }
        if (arg2 == 10) {
            class105 var75 = field643[arg3];
            if (var75 != null) {
                field704 = arg6;
                field730 = arg7;
                field782 = 2;
                field706 = 0;
                field839 = arg0;
                field840 = arg1;
                class205 var76 = class205.method4631(class203.field2243, field649.field1385);
                var76.field2342.method5839(class39.field247[82] ? 1 : 0);
                var76.field2342.method6047(arg3);
                field649.method2099(var76);
            }
        }
        if (arg2 == 6) {
            field704 = arg6;
            field730 = arg7;
            field782 = 2;
            field706 = 0;
            field839 = arg0;
            field840 = arg1;
            class205 var77 = class205.method4631(class203.field2262, field649.field1385);
            var77.field2342.method5853(arg3);
            var77.field2342.method6047(Statics.field1892 + arg1);
            var77.field2342.method5992(Statics.field1795 + arg0);
            var77.field2342.method5882(class39.field247[82] ? 1 : 0);
            field649.method2099(var77);
        }
        if (arg2 == 58) {
            class225 var78 = class225.method3833(arg1, arg0);
            if (var78 != null) {
                class205 var79 = class205.method4631(class203.field2224, field649.field1385);
                var79.field2342.method5890(var78.field2753);
                var79.field2342.method5900(arg1);
                var79.field2342.method5853(field875);
                var79.field2342.method6047(field759);
                var79.field2342.method5901(Statics.field1658);
                var79.field2342.method5992(arg0);
                field649.method2099(var79);
            }
        }
        if (arg2 == 41) {
            class205 var80 = class205.method4631(class203.field2281, field649.field1385);
            var80.field2342.method5890(arg3);
            var80.field2342.method5890(arg0);
            var80.field2342.method5900(arg1);
            field649.method2099(var80);
            field709 = 0;
            Statics.field1395 = class225.method2354(arg1);
            field710 = arg0;
        }
        if (arg2 == 33) {
            class205 var81 = class205.method4631(class203.field2278, field649.field1385);
            var81.field2342.method5901(arg1);
            var81.field2342.method6047(arg3);
            var81.field2342.method6047(arg0);
            field649.method2099(var81);
            field709 = 0;
            Statics.field1395 = class225.method2354(arg1);
            field710 = arg0;
        }
        if (arg2 == 14) {
            class98 var82 = field849[arg3];
            if (var82 != null) {
                field704 = arg6;
                field730 = arg7;
                field782 = 2;
                field706 = 0;
                field839 = arg0;
                field840 = arg1;
                class205 var83 = class205.method4631(class203.field2288, field649.field1385);
                var83.field2342.method5900(Statics.field1451);
                var83.field2342.method5915(class39.field247[82] ? 1 : 0);
                var83.field2342.method5853(Statics.field884);
                var83.field2342.method5992(Statics.field2466);
                var83.field2342.method5890(arg3);
                field649.method2099(var83);
            }
        }
        if (arg2 == 5) {
            field704 = arg6;
            field730 = arg7;
            field782 = 2;
            field706 = 0;
            field839 = arg0;
            field840 = arg1;
            class205 var84 = class205.method4631(class203.field2297, field649.field1385);
            var84.field2342.method6047(Statics.field1795 + arg0);
            var84.field2342.method6047(arg3);
            var84.field2342.method5882(class39.field247[82] ? 1 : 0);
            var84.field2342.method6047(Statics.field1892 + arg1);
            field649.method2099(var84);
        }
        if (arg2 == 23) {
            if (field739) {
                Statics.field1599.method3037();
            } else {
                Statics.field1599.method3063(Statics.field201, arg0, arg1, true);
            }
        }
        if (arg2 == 43) {
            class205 var85 = class205.method4631(class203.field2238, field649.field1385);
            var85.field2342.method5890(arg0);
            var85.field2342.method5842(arg1);
            var85.field2342.method6047(arg3);
            field649.method2099(var85);
            field709 = 0;
            Statics.field1395 = class225.method2354(arg1);
            field710 = arg0;
        }
        if (arg2 == 1004) {
            field704 = arg6;
            field730 = arg7;
            field782 = 2;
            field706 = 0;
            class205 var86 = class205.method4631(class203.field2296, field649.field1385);
            var86.field2342.method6047(arg3);
            field649.method2099(var86);
        }
        if (arg2 == 42) {
            class205 var87 = class205.method4631(class203.field2258, field649.field1385);
            var87.field2342.method5890(arg0);
            var87.field2342.method5890(arg3);
            var87.field2342.method6030(arg1);
            field649.method2099(var87);
            field709 = 0;
            Statics.field1395 = class225.method2354(arg1);
            field710 = arg0;
        }
        if (arg2 == 1) {
            field704 = arg6;
            field730 = arg7;
            field782 = 2;
            field706 = 0;
            field839 = arg0;
            field840 = arg1;
            class205 var88 = class205.method4631(class203.field2323, field649.field1385);
            var88.field2342.method6047(Statics.field884);
            var88.field2342.method5842(Statics.field1451);
            var88.field2342.method5853(arg3);
            var88.field2342.method5992(Statics.field2466);
            var88.field2342.method5853(Statics.field1892 + arg1);
            var88.field2342.method5839(class39.field247[82] ? 1 : 0);
            var88.field2342.method5853(Statics.field1795 + arg0);
            field649.method2099(var88);
        }
        if (field756 != 0) {
            field756 = 0;
            method213(class225.method2354(Statics.field1451));
        }
        if (field758) {
            method2737();
        }
        if (Statics.field1395 != null && field709 == 0) {
            method213(Statics.field1395);
        }
    }

    @ObfuscatedName("bi.hz(ILjava/lang/String;B)V")
    public static void method692(int arg0, String arg1) {
        int var2 = class109.field1362;
        int[] var3 = class109.field1354;
        boolean var4 = false;
        class327 var5 = new class327(arg1, Statics.field3841);
        for (int var6 = 0; var6 < var2; var6++) {
            class98 var7 = field849[var3[var6]];
            if (var7 != null && Statics.field1374 != var7 && var7.field1183 != null && var7.field1183.equals(var5)) {
                if (arg0 == 1) {
                    class205 var8 = class205.method4631(class203.field2319, field649.field1385);
                    var8.field2342.method5915(0);
                    var8.field2342.method5890(var3[var6]);
                    field649.method2099(var8);
                } else if (arg0 == 4) {
                    class205 var9 = class205.method4631(class203.field2251, field649.field1385);
                    var9.field2342.method5934(0);
                    var9.field2342.method6047(var3[var6]);
                    field649.method2099(var9);
                } else if (arg0 == 6) {
                    class205 var10 = class205.method4631(class203.field2277, field649.field1385);
                    var10.field2342.method5890(var3[var6]);
                    var10.field2342.method5882(0);
                    field649.method2099(var10);
                } else if (arg0 == 7) {
                    class205 var11 = class205.method4631(class203.field2245, field649.field1385);
                    var11.field2342.method5934(0);
                    var11.field2342.method5890(var3[var6]);
                    field649.method2099(var11);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class111.method930(4, "", class246.field3050 + arg1);
        }
    }

    @ObfuscatedName("ih.hd(IIIIB)V")
    public static void method3869(int arg0, int arg1, int arg2, int arg3) {
        class225 var4 = class225.method3833(arg0, arg1);
        if (var4 != null && var4.field2711 != null) {
            class96 var5 = new class96();
            var5.field1147 = var4;
            var5.field1157 = var4.field2711;
            class79.method179(var5);
        }
        field875 = arg3;
        field758 = true;
        Statics.field1658 = arg0;
        field759 = arg1;
        Statics.field1442 = arg2;
        method213(var4);
    }

    @ObfuscatedName("fo.hf(I)V")
    public static void method2737() {
        if (!field758) {
            return;
        }
        class225 var0 = class225.method3833(Statics.field1658, field759);
        if (var0 != null && var0.field2762 != null) {
            class96 var1 = new class96();
            var1.field1147 = var0;
            var1.field1157 = var0.field2762;
            class79.method179(var1);
        }
        field875 = -1;
        field758 = false;
        method213(var0);
    }

    @ObfuscatedName("au.hb(III)V")
    public static void method339(int arg0, int arg1) {
        class205 var2 = class205.method4631(class203.field2287, field649.field1385);
        var2.field2342.method5901(arg0);
        var2.field2342.method5992(arg1);
        field649.method2099(var2);
    }

    @ObfuscatedName("ng.hy(IIIILjava/lang/String;I)V")
    public static void method5788(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class225 var5 = class225.method3833(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2731 != null) {
            class96 var6 = new class96();
            var6.field1147 = var5;
            var6.field1153 = arg0;
            var6.field1154 = arg4;
            var6.field1157 = var5.field2731;
            class79.method179(var6);
        }
        boolean var7 = true;
        if (var5.field2629 > 0) {
            var7 = method5046(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = method3830(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            class205 var11 = class205.method4631(class203.field2256, field649.field1385);
            var11.field2342.method5842(arg1);
            var11.field2342.method5853(arg2);
            var11.field2342.method5853(arg3);
            field649.method2099(var11);
        }
        if (arg0 == 2) {
            class205 var12 = class205.method4631(class203.field2218, field649.field1385);
            var12.field2342.method5842(arg1);
            var12.field2342.method5853(arg2);
            var12.field2342.method5853(arg3);
            field649.method2099(var12);
        }
        if (arg0 == 3) {
            class205 var13 = class205.method4631(class203.field2228, field649.field1385);
            var13.field2342.method5842(arg1);
            var13.field2342.method5853(arg2);
            var13.field2342.method5853(arg3);
            field649.method2099(var13);
        }
        if (arg0 == 4) {
            class205 var14 = class205.method4631(class203.field2232, field649.field1385);
            var14.field2342.method5842(arg1);
            var14.field2342.method5853(arg2);
            var14.field2342.method5853(arg3);
            field649.method2099(var14);
        }
        if (arg0 == 5) {
            class205 var15 = class205.method4631(class203.field2312, field649.field1385);
            var15.field2342.method5842(arg1);
            var15.field2342.method5853(arg2);
            var15.field2342.method5853(arg3);
            field649.method2099(var15);
        }
        if (arg0 == 6) {
            class205 var16 = class205.method4631(class203.field2264, field649.field1385);
            var16.field2342.method5842(arg1);
            var16.field2342.method5853(arg2);
            var16.field2342.method5853(arg3);
            field649.method2099(var16);
        }
        if (arg0 == 7) {
            class205 var17 = class205.method4631(class203.field2269, field649.field1385);
            var17.field2342.method5842(arg1);
            var17.field2342.method5853(arg2);
            var17.field2342.method5853(arg3);
            field649.method2099(var17);
        }
        if (arg0 == 8) {
            class205 var18 = class205.method4631(class203.field2311, field649.field1385);
            var18.field2342.method5842(arg1);
            var18.field2342.method5853(arg2);
            var18.field2342.method5853(arg3);
            field649.method2099(var18);
        }
        if (arg0 == 9) {
            class205 var19 = class205.method4631(class203.field2240, field649.field1385);
            var19.field2342.method5842(arg1);
            var19.field2342.method5853(arg2);
            var19.field2342.method5853(arg3);
            field649.method2099(var19);
        }
        if (arg0 != 10) {
            return;
        }
        class205 var20 = class205.method4631(class203.field2271, field649.field1385);
        var20.field2342.method5842(arg1);
        var20.field2342.method5853(arg2);
        var20.field2342.method5853(arg3);
        field649.method2099(var20);
    }

    @ObfuscatedName("it.hm(B)V")
    public static final void method3872() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field740 - 1; var1++) {
                if (field648[var1] < 1000 && field648[var1 + 1] > 1000) {
                    String var2 = field746[var1];
                    field746[var1] = field746[var1 + 1];
                    field746[var1 + 1] = var2;
                    String var3 = field745[var1];
                    field745[var1] = field745[var1 + 1];
                    field745[var1 + 1] = var3;
                    int var4 = field648[var1];
                    field648[var1] = field648[var1 + 1];
                    field648[var1 + 1] = var4;
                    int var5 = field826[var1];
                    field826[var1] = field826[var1 + 1];
                    field826[var1 + 1] = var5;
                    int var6 = field742[var1];
                    field742[var1] = field742[var1 + 1];
                    field742[var1 + 1] = var6;
                    int var7 = field744[var1];
                    field744[var1] = field744[var1 + 1];
                    field744[var1 + 1] = var7;
                    boolean var8 = field833[var1];
                    field833[var1] = field833[var1 + 1];
                    field833[var1 + 1] = var8;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("hh.hl(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method3660(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method3824(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("hd.ie(Ljava/lang/String;Ljava/lang/String;IIIIZI)V")
    public static final void method3824(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field739 || field740 >= 500) {
            return;
        }
        field745[field740] = arg0;
        field746[field740] = arg1;
        field648[field740] = arg2;
        field744[field740] = arg3;
        field826[field740] = arg4;
        field742[field740] = arg5;
        field833[field740] = arg6;
        field740++;
    }

    @ObfuscatedName("fa.iu(I)I")
    public static final int method2997() {
        return field740 - 1;
    }

    @ObfuscatedName("fg.ii(I)V")
    public static void method2770() {
        for (int var0 = 0; var0 < field740; var0++) {
            if (method2339(field648[var0])) {
                if (var0 < field740 - 1) {
                    for (int var1 = var0; var1 < field740 - 1; var1++) {
                        field745[var1] = field745[var1 + 1];
                        field746[var1] = field746[var1 + 1];
                        field648[var1] = field648[var1 + 1];
                        field744[var1] = field744[var1 + 1];
                        field826[var1] = field826[var1 + 1];
                        field742[var1] = field742[var1 + 1];
                        field833[var1] = field833[var1 + 1];
                    }
                }
                var0--;
                field740--;
            }
        }
        method3657(Statics.field1194 / 2 + Statics.field131, Statics.field4060);
    }

    @ObfuscatedName("eb.id(IB)Z")
    public static boolean method2339(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("bv.il(II)Ljava/lang/String;")
    public static String method927(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (field746[arg0].length() > 0) {
            return field745[arg0] + class246.field3158 + field746[arg0];
        } else {
            return field745[arg0];
        }
    }

    @ObfuscatedName("ds.ip(IIIII)V")
    public static final void method2194(int arg0, int arg1, int arg2, int arg3) {
        if (field756 == 0 && !field758) {
            method3660(class246.field3201, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        long var4 = -1L;
        long var6 = -1L;
        for (int var8 = 0; var8 < class184.method2204(); var8++) {
            long var9 = class184.field2132[var8];
            if (var6 != var9) {
                var6 = var9;
                int var13 = class184.method1708(class184.field2132[var8]);
                int var14 = var13;
                long var15 = class184.field2132[var8];
                int var17 = (int) (var15 >>> 7 & 0x7FL);
                int var19 = var17;
                int var20 = class184.method343(var8);
                int var21 = class184.method181(var8);
                if (var20 == 2 && Statics.field1599.method3029(Statics.field201, var13, var17, var9) >= 0) {
                    class295 var22 = class295.method182(var21);
                    if (var22.field3630 != null) {
                        var22 = var22.method4611();
                    }
                    if (var22 == null) {
                        continue;
                    }
                    if (field756 == 1) {
                        method3660(class246.field3164, field695 + " " + class106.field1325 + " " + class106.method5281(65535) + var22.field3599, 1, var21, var13, var17);
                    } else if (!field758) {
                        String[] var23 = var22.field3616;
                        if (var23 != null) {
                            for (int var24 = 4; var24 >= 0; var24--) {
                                if (var23[var24] != null) {
                                    short var25 = 0;
                                    if (var24 == 0) {
                                        var25 = 3;
                                    }
                                    if (var24 == 1) {
                                        var25 = 4;
                                    }
                                    if (var24 == 2) {
                                        var25 = 5;
                                    }
                                    if (var24 == 3) {
                                        var25 = 6;
                                    }
                                    if (var24 == 4) {
                                        var25 = 1001;
                                    }
                                    method3660(var23[var24], class106.method5281(65535) + var22.field3599, var25, var21, var14, var19);
                                }
                            }
                        }
                        method3660(class246.field2938, class106.method5281(65535) + var22.field3599, 1002, var22.field3596, var14, var19);
                    } else if ((Statics.field1442 & 0x4) == 4) {
                        method3660(field815, field762 + " " + class106.field1325 + " " + class106.method5281(65535) + var22.field3599, 2, var21, var13, var17);
                    }
                }
                if (var20 == 1) {
                    class105 var26 = field643[var21];
                    if (var26 == null) {
                        continue;
                    }
                    if (var26.field1319.field3480 == 1 && (var26.field1232 & 0x7F) == 64 && (var26.field1210 & 0x7F) == 64) {
                        for (int var27 = 0; var27 < field644; var27++) {
                            class105 var28 = field643[field645[var27]];
                            if (var28 != null && var26 != var28 && var28.field1319.field3480 == 1 && var26.field1232 == var28.field1232 && var26.field1210 == var28.field1210) {
                                method2395(var28.field1319, field645[var27], var14, var19);
                            }
                        }
                        int var29 = class109.field1362;
                        int[] var30 = class109.field1354;
                        for (int var31 = 0; var31 < var29; var31++) {
                            class98 var32 = field849[var30[var31]];
                            if (var32 != null && var26.field1232 == var32.field1232 && var26.field1210 == var32.field1210) {
                                method2721(var32, var30[var31], var14, var19);
                            }
                        }
                    }
                    method2395(var26.field1319, var21, var14, var19);
                }
                if (var20 == 0) {
                    class98 var33 = field849[var21];
                    if (var33 == null) {
                        continue;
                    }
                    if ((var33.field1232 & 0x7F) == 64 && (var33.field1210 & 0x7F) == 64) {
                        for (int var34 = 0; var34 < field644; var34++) {
                            class105 var35 = field643[field645[var34]];
                            if (var35 != null && var35.field1319.field3480 == 1 && var33.field1232 == var35.field1232 && var33.field1210 == var35.field1210) {
                                method2395(var35.field1319, field645[var34], var14, var19);
                            }
                        }
                        int var36 = class109.field1362;
                        int[] var37 = class109.field1354;
                        for (int var38 = 0; var38 < var36; var38++) {
                            class98 var39 = field849[var37[var38]];
                            if (var39 != null && var33 != var39 && var33.field1232 == var39.field1232 && var33.field1210 == var39.field1210) {
                                method2721(var39, var37[var38], var14, var19);
                            }
                        }
                    }
                    if (field869 == var21) {
                        var4 = var9;
                    } else {
                        method2721(var33, var21, var14, var19);
                    }
                }
                if (var20 == 3) {
                    class272 var40 = field731[Statics.field201][var14][var19];
                    if (var40 != null) {
                        for (class108 var41 = (class108) var40.method4188(); var41 != null; var41 = (class108) var40.method4162()) {
                            class296 var42 = class296.method194(var41.field1347);
                            if (field756 == 1) {
                                method3660(class246.field3164, field695 + " " + class106.field1325 + " " + class106.method5281(16748608) + var42.field3691, 16, var41.field1347, var14, var19);
                            } else if (!field758) {
                                String[] var43 = var42.field3664;
                                for (int var44 = 4; var44 >= 0; var44--) {
                                    if (var43 != null && var43[var44] != null) {
                                        byte var45 = 0;
                                        if (var44 == 0) {
                                            var45 = 18;
                                        }
                                        if (var44 == 1) {
                                            var45 = 19;
                                        }
                                        if (var44 == 2) {
                                            var45 = 20;
                                        }
                                        if (var44 == 3) {
                                            var45 = 21;
                                        }
                                        if (var44 == 4) {
                                            var45 = 22;
                                        }
                                        method3660(var43[var44], class106.method5281(16748608) + var42.field3691, var45, var41.field1347, var14, var19);
                                    } else if (var44 == 2) {
                                        method3660(class246.field2913, class106.method5281(16748608) + var42.field3691, 20, var41.field1347, var14, var19);
                                    }
                                }
                                method3660(class246.field2938, class106.method5281(16748608) + var42.field3691, 1004, var41.field1347, var14, var19);
                            } else if ((Statics.field1442 & 0x1) == 1) {
                                method3660(field815, field762 + " " + class106.field1325 + " " + class106.method5281(16748608) + var42.field3691, 17, var41.field1347, var14, var19);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1L) {
            int var46 = class184.method1708(var4);
            int var47 = (int) (var4 >>> 7 & 0x7FL);
            class98 var49 = field849[field869];
            method2721(var49, field869, var46, var47);
        }
    }

    @ObfuscatedName("en.im(Lkc;IIII)V")
    public static final void method2395(class287 arg0, int arg1, int arg2, int arg3) {
        if (field740 >= 400) {
            return;
        }
        if (arg0.field3487 != null) {
            arg0 = arg0.method4437();
        }
        if (arg0 == null || !arg0.field3507 || arg0.field3509 && field615 != arg1) {
            return;
        }
        String var4 = arg0.field3479;
        if (arg0.field3494 != 0) {
            int var6 = arg0.field3494;
            int var7 = Statics.field1374.field1169;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class106.method5281(16711680);
            } else if (var8 < -6) {
                var9 = class106.method5281(16723968);
            } else if (var8 < -3) {
                var9 = class106.method5281(16740352);
            } else if (var8 < 0) {
                var9 = class106.method5281(16756736);
            } else if (var8 > 9) {
                var9 = class106.method5281(65280);
            } else if (var8 > 6) {
                var9 = class106.method5281(4259584);
            } else if (var8 > 3) {
                var9 = class106.method5281(8453888);
            } else if (var8 > 0) {
                var9 = class106.method5281(12648192);
            } else {
                var9 = class106.method5281(16776960);
            }
            var4 = var4 + var9 + " " + class106.field1323 + class246.field3096 + arg0.field3494 + class106.field1324;
        }
        if (arg0.field3509 && field862) {
            method3660(class246.field2938, class106.method5281(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field756 == 1) {
            method3660(class246.field3164, field695 + " " + class106.field1325 + " " + class106.method5281(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field758) {
            int var10 = arg0.field3509 && field862 ? 2000 : 0;
            String[] var11 = arg0.field3489;
            if (var11 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var11[var12] != null && !var11[var12].equalsIgnoreCase(class246.field2980)) {
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
                        method3660(var11[var12], class106.method5281(16776960) + var4, var13, arg1, arg2, arg3);
                    }
                }
            }
            if (var11 != null) {
                for (int var14 = 4; var14 >= 0; var14--) {
                    if (var11[var14] != null && var11[var14].equalsIgnoreCase(class246.field2980)) {
                        short var15 = 0;
                        if (field628 != class107.field1336) {
                            if (field628 == class107.field1334 || field628 == class107.field1338 && arg0.field3494 > Statics.field1374.field1169) {
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
                            method3660(var11[var14], class106.method5281(16776960) + var4, var16, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3509 || !field862) {
                method3660(class246.field2938, class106.method5281(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field1442 & 0x2) == 2) {
            method3660(field815, field762 + " " + class106.field1325 + " " + class106.method5281(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ee.ij(Lcs;IIII)V")
    public static final void method2721(class98 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field1374 == arg0 || field740 >= 400) {
            return;
        }
        String var9;
        if (arg0.field1171 == 0) {
            String var4 = arg0.field1165[0] + arg0.field1183 + arg0.field1165[1];
            int var5 = arg0.field1169;
            int var6 = Statics.field1374.field1169;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class106.method5281(16711680);
            } else if (var7 < -6) {
                var8 = class106.method5281(16723968);
            } else if (var7 < -3) {
                var8 = class106.method5281(16740352);
            } else if (var7 < 0) {
                var8 = class106.method5281(16756736);
            } else if (var7 > 9) {
                var8 = class106.method5281(65280);
            } else if (var7 > 6) {
                var8 = class106.method5281(4259584);
            } else if (var7 > 3) {
                var8 = class106.method5281(8453888);
            } else if (var7 > 0) {
                var8 = class106.method5281(12648192);
            } else {
                var8 = class106.method5281(16776960);
            }
            var9 = var4 + var8 + " " + class106.field1323 + class246.field3096 + arg0.field1169 + class106.field1324 + arg0.field1165[2];
        } else {
            var9 = arg0.field1165[0] + arg0.field1183 + arg0.field1165[1] + " " + class106.field1323 + class246.field3048 + arg0.field1171 + class106.field1324 + arg0.field1165[2];
        }
        if (field756 == 1) {
            method3660(class246.field3164, field695 + " " + class106.field1325 + " " + class106.method5281(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field758) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field831[var10] != null) {
                    short var11 = 0;
                    if (field831[var10].equalsIgnoreCase(class246.field2980)) {
                        if (field627 == class107.field1336) {
                            continue;
                        }
                        if (field627 == class107.field1334 || field627 == class107.field1338 && arg0.field1169 > Statics.field1374.field1169) {
                            var11 = 2000;
                        }
                        if (Statics.field1374.field1191 != 0 && arg0.field1191 != 0) {
                            if (Statics.field1374.field1191 == arg0.field1191) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field816[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field726[var10] + var11;
                    method3660(field831[var10], class106.method5281(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1442 & 0x8) == 8) {
            method3660(field815, field762 + " " + class106.field1325 + " " + class106.method5281(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field740; var14++) {
            if (field648[var14] == 23) {
                field746[var14] = class106.method5281(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("fa.iz(IIIIIIIII)V")
    public static final void method2996(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (Statics.method161(arg0)) {
            Statics.field2180 = null;
            method32(Statics.field2618[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field2180 != null) {
                method32(Statics.field2180, -1412584499, arg1, arg2, arg3, arg4, Statics.field107, Statics.field2844, arg7);
                Statics.field2180 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field812[var8] = true;
            }
        } else {
            field812[arg7] = true;
        }
    }

    @ObfuscatedName("u.ik([Lhu;IIIIIIIII)V")
    public static final void method32(class225[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class391.method6119(arg2, arg3, arg4, arg5);
        class174.method2924();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class225 var10 = arg0[var9];
            if (var10 != null && (var10.field2644 == arg1 || arg1 == -1412584499 && field776 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field677[field810] = var10.field2642 + arg6;
                    field672[field810] = var10.field2639 + arg7;
                    field817[field810] = var10.field2640;
                    field818[field810] = var10.field2641;
                    var11 = ++field810 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2764 = var11;
                var10.field2765 = field611;
                if (!var10.field2625 || !method2460(var10)) {
                    if (var10.field2629 > 0) {
                        method1752(var10);
                    }
                    int var12 = var10.field2642 + arg6;
                    int var13 = var10.field2639 + arg7;
                    int var14 = var10.field2688;
                    if (field776 == var10) {
                        if (arg1 != -1412584499 && !var10.field2680) {
                            Statics.field2180 = arg0;
                            Statics.field107 = arg6;
                            Statics.field2844 = arg7;
                            continue;
                        }
                        if (field712 && field781) {
                            int var15 = class48.field342;
                            int var16 = class48.field357;
                            int var17 = var15 - field824;
                            int var18 = var16 - field779;
                            if (var17 < field728) {
                                var17 = field728;
                            }
                            if (var10.field2640 + var17 > field728 + field777.field2640) {
                                var17 = field728 + field777.field2640 - var10.field2640;
                            }
                            if (var18 < field783) {
                                var18 = field783;
                            }
                            if (var10.field2641 + var18 > field783 + field777.field2641) {
                                var18 = field783 + field777.field2641 - var10.field2641;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2680) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2627 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2627 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2640 + var12;
                        int var26 = var10.field2641 + var13;
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
                        int var29 = var10.field2640 + var12;
                        int var30 = var10.field2641 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2625 || var19 < var21 && var20 < var22) {
                        if (var10.field2629 != 0) {
                            if (var10.field2629 == 1336) {
                                if (field830) {
                                    var13 += 15;
                                    Statics.field122.method4855("Fps:" + field311, var10.field2640 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 327680 && !field604) {
                                        var33 = 16711680;
                                    }
                                    Statics.field122.method4855("Mem:" + var32 + "k", var10.field2640 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2629 == 1337) {
                                field693 = var12;
                                field650 = var13;
                                method198(var12, var13, var10.field2640, var10.field2641);
                                field812[var10.field2764] = true;
                                class391.method6119(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2629 == 1338) {
                                method186(var10, var12, var13, var11);
                                class391.method6119(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2629 == 1339) {
                                method5777(var10, var12, var13, var11);
                                class391.method6119(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2629 == 1400) {
                                Statics.field1411.method5433(var12, var13, var10.field2640, var10.field2641, field611);
                            }
                            if (var10.field2629 == 1401) {
                                Statics.field1411.method5420(var12, var13, var10.field2640, var10.field2641);
                            }
                            if (var10.field2629 == 1402) {
                                Statics.field989.method1917(var12, field611);
                            }
                        }
                        if (var10.field2627 == 0) {
                            if (!var10.field2625 && method2460(var10) && Statics.field2582 != var10) {
                                continue;
                            }
                            if (!var10.field2625) {
                                if (var10.field2647 > var10.field2649 - var10.field2641) {
                                    var10.field2647 = var10.field2649 - var10.field2641;
                                }
                                if (var10.field2647 < 0) {
                                    var10.field2647 = 0;
                                }
                            }
                            method32(arg0, var10.field2703, var19, var20, var21, var22, var12 - var10.field2646, var13 - var10.field2647, var11);
                            if (var10.field2757 != null) {
                                method32(var10.field2757, var10.field2703, var19, var20, var21, var22, var12 - var10.field2646, var13 - var10.field2647, var11);
                            }
                            class95 var34 = (class95) field764.method5638((long) var10.field2703);
                            if (var34 != null) {
                                method2996(var34.field1141, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class391.method6119(arg2, arg3, arg4, arg5);
                            class174.method2924();
                        }
                        if (field819 || field705[var11] || field613 > 1) {
                            if (var10.field2627 == 0 && !var10.field2625 && var10.field2649 > var10.field2641) {
                                method4946(var10.field2640 + var12, var13, var10.field2647, var10.field2641, var10.field2649);
                            }
                            if (var10.field2627 != 1) {
                                if (var10.field2627 == 2) {
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < var10.field2676; var36++) {
                                        for (int var37 = 0; var37 < var10.field2636; var37++) {
                                            int var38 = (var10.field2692 + 32) * var37 + var12;
                                            int var39 = (var10.field2717 + 32) * var36 + var13;
                                            if (var35 < 20) {
                                                var38 += var10.field2670[var35];
                                                var39 += var10.field2733[var35];
                                            }
                                            if (var10.field2635[var35] > 0) {
                                                boolean var40 = false;
                                                boolean var41 = false;
                                                int var42 = var10.field2635[var35] - 1;
                                                if (var38 + 32 > arg2 && var38 < arg4 && var39 + 32 > arg3 && var39 < arg5 || Statics.field2234 == var10 && field711 == var35) {
                                                    class395 var43;
                                                    if (field756 == 1 && Statics.field2466 == var35 && Statics.field1451 == var10.field2703) {
                                                        var43 = class296.method2653(var42, var10.field2752[var35], 2, 0, 2, false);
                                                    } else {
                                                        var43 = class296.method2653(var42, var10.field2752[var35], 1, 3153952, 2, false);
                                                    }
                                                    if (var43 == null) {
                                                        method213(var10);
                                                    } else if (Statics.field2234 == var10 && field711 == var35) {
                                                        int var44 = class48.field342 - field659;
                                                        int var45 = class48.field357 - field713;
                                                        if (var44 < 5 && var44 > -5) {
                                                            var44 = 0;
                                                        }
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (field716 < 5) {
                                                            var44 = 0;
                                                            var45 = 0;
                                                        }
                                                        var43.method6245(var38 + var44, var39 + var45, 128);
                                                        if (arg1 != -1) {
                                                            class225 var46 = arg0[arg1 & 0xFFFF];
                                                            if (var39 + var45 < class391.field4222 && var46.field2647 > 0) {
                                                                int var47 = field800 * (class391.field4222 - var39 - var45) / 3;
                                                                if (var47 > field800 * 10) {
                                                                    var47 = field800 * 10;
                                                                }
                                                                if (var47 > var46.field2647) {
                                                                    var47 = var46.field2647;
                                                                }
                                                                var46.field2647 -= var47;
                                                                field713 += var47;
                                                                method213(var46);
                                                            }
                                                            if (var39 + var45 + 32 > class391.field4220 && var46.field2647 < var46.field2649 - var46.field2641) {
                                                                int var48 = field800 * (var39 + var45 + 32 - class391.field4220) / 3;
                                                                if (var48 > field800 * 10) {
                                                                    var48 = field800 * 10;
                                                                }
                                                                if (var48 > var46.field2649 - var46.field2641 - var46.field2647) {
                                                                    var48 = var46.field2649 - var46.field2641 - var46.field2647;
                                                                }
                                                                var46.field2647 += var48;
                                                                field713 -= var48;
                                                                method213(var46);
                                                            }
                                                        }
                                                    } else if (Statics.field1395 == var10 && field710 == var35) {
                                                        var43.method6245(var38, var39, 128);
                                                    } else {
                                                        var43.method6284(var38, var39);
                                                    }
                                                }
                                            } else if (var10.field2696 != null && var35 < 20) {
                                                class395 var49 = var10.method3733(var35);
                                                if (var49 != null) {
                                                    var49.method6284(var38, var39);
                                                } else if (class225.field2623) {
                                                    method213(var10);
                                                }
                                            }
                                            var35++;
                                        }
                                    }
                                } else if (var10.field2627 == 3) {
                                    int var50;
                                    if (Statics.method2750(var10)) {
                                        var50 = var10.field2651;
                                        if (Statics.field2582 == var10 && var10.field2653 != 0) {
                                            var50 = var10.field2653;
                                        }
                                    } else {
                                        var50 = var10.field2659;
                                        if (Statics.field2582 == var10 && var10.field2652 != 0) {
                                            var50 = var10.field2652;
                                        }
                                    }
                                    if (var10.field2672) {
                                        switch(var10.field2655.field4233) {
                                            case 1:
                                                class391.method6128(var12, var13, var10.field2640, var10.field2641, var10.field2659, var10.field2651);
                                                break;
                                            case 2:
                                                class391.method6129(var12, var13, var10.field2640, var10.field2641, var10.field2659, var10.field2651, 255 - (var10.field2688 & 0xFF), 255 - (var10.field2657 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class391.method6191(var12, var13, var10.field2640, var10.field2641, var50);
                                                } else {
                                                    class391.method6126(var12, var13, var10.field2640, var10.field2641, var50, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class391.method6131(var12, var13, var10.field2640, var10.field2641, var50);
                                    } else {
                                        class391.method6132(var12, var13, var10.field2640, var10.field2641, var50, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2627 == 4) {
                                    class299 var51 = var10.method3732();
                                    if (var51 != null) {
                                        String var52 = var10.field2686;
                                        int var53;
                                        if (Statics.method2750(var10)) {
                                            var53 = var10.field2651;
                                            if (Statics.field2582 == var10 && var10.field2653 != 0) {
                                                var53 = var10.field2653;
                                            }
                                            if (var10.field2687.length() > 0) {
                                                var52 = var10.field2687;
                                            }
                                        } else {
                                            var53 = var10.field2659;
                                            if (Statics.field2582 == var10 && var10.field2652 != 0) {
                                                var53 = var10.field2652;
                                            }
                                        }
                                        if (var10.field2625 && var10.field2753 != -1) {
                                            class296 var54 = class296.method194(var10.field2753);
                                            var52 = var54.field3691;
                                            if (var52 == null) {
                                                var52 = class246.field2920;
                                            }
                                            if ((var54.field3661 == 1 || var10.field2754 != 1) && var10.field2754 != -1) {
                                                var52 = class106.method5281(16748608) + var52 + class106.field1327 + " " + 'x' + method2159(var10.field2754);
                                            }
                                        }
                                        if (field640 == var10) {
                                            var52 = class246.field3074;
                                            var53 = var10.field2659;
                                        }
                                        if (!var10.field2625) {
                                            var52 = method3837(var52, var10);
                                        }
                                        var51.method4789(var52, var12, var13, var10.field2640, var10.field2641, var53, var10.field2691 ? 0 : -1, var10.field2689, var10.field2690, var10.field2712);
                                    } else if (class225.field2623) {
                                        method213(var10);
                                    }
                                } else if (var10.field2627 == 5) {
                                    if (var10.field2625) {
                                        class395 var56;
                                        if (var10.field2753 == -1) {
                                            var56 = var10.method3731(false);
                                        } else {
                                            var56 = class296.method2653(var10.field2753, var10.field2754, var10.field2664, var10.field2665, var10.field2666, false);
                                        }
                                        if (var56 != null) {
                                            int var57 = var56.field4251;
                                            int var58 = var56.field4248;
                                            if (var10.field2663) {
                                                class391.method6120(var12, var13, var10.field2640 + var12, var10.field2641 + var13);
                                                int var59 = (var10.field2640 + (var57 - 1)) / var57;
                                                int var60 = (var10.field2641 + (var58 - 1)) / var58;
                                                for (int var61 = 0; var61 < var59; var61++) {
                                                    for (int var62 = 0; var62 < var60; var62++) {
                                                        if (var10.field2662 != 0) {
                                                            var56.method6258(var57 / 2 + var57 * var61 + var12, var58 / 2 + var58 * var62 + var13, var10.field2662, 4096);
                                                        } else if (var14 == 0) {
                                                            var56.method6284(var57 * var61 + var12, var58 * var62 + var13);
                                                        } else {
                                                            var56.method6245(var57 * var61 + var12, var58 * var62 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class391.method6119(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var63 = var10.field2640 * 4096 / var57;
                                                if (var10.field2662 != 0) {
                                                    var56.method6258(var10.field2640 / 2 + var12, var10.field2641 / 2 + var13, var10.field2662, var63);
                                                } else if (var14 != 0) {
                                                    var56.method6247(var12, var13, var10.field2640, var10.field2641, 256 - (var14 & 0xFF));
                                                } else if (var10.field2640 == var57 && var10.field2641 == var58) {
                                                    var56.method6284(var12, var13);
                                                } else {
                                                    var56.method6241(var12, var13, var10.field2640, var10.field2641);
                                                }
                                            }
                                        } else if (class225.field2623) {
                                            method213(var10);
                                        }
                                    } else {
                                        class395 var55 = var10.method3731(Statics.method2750(var10));
                                        if (var55 != null) {
                                            var55.method6284(var12, var13);
                                        } else if (class225.field2623) {
                                            method213(var10);
                                        }
                                    }
                                } else if (var10.field2627 == 6) {
                                    boolean var64 = Statics.method2750(var10);
                                    int var65;
                                    if (var64) {
                                        var65 = var10.field2673;
                                    } else {
                                        var65 = var10.field2624;
                                    }
                                    class183 var66 = null;
                                    int var67 = 0;
                                    if (var10.field2753 != -1) {
                                        class296 var68 = class296.method194(var10.field2753);
                                        if (var68 != null) {
                                            class296 var69 = var68.method4700(var10.field2754);
                                            var66 = var69.method4660(1);
                                            if (var66 == null) {
                                                method213(var10);
                                            } else {
                                                var66.method3240();
                                                var67 = var66.field1999 / 2;
                                            }
                                        }
                                    } else if (var10.field2668 == 5) {
                                        if (var10.field2695 == 0) {
                                            var66 = field808.method3694((class298) null, -1, (class298) null, -1);
                                        } else {
                                            var66 = Statics.field1374.method1649();
                                        }
                                    } else if (var65 == -1) {
                                        var66 = var10.method3727((class298) null, -1, var64, Statics.field1374.field1166);
                                        if (var66 == null && class225.field2623) {
                                            method213(var10);
                                        }
                                    } else {
                                        class298 var70 = class298.method3795(var65);
                                        var66 = var10.method3727(var70, var10.field2706, var64, Statics.field1374.field1166);
                                        if (var66 == null && class225.field2623) {
                                            method213(var10);
                                        }
                                    }
                                    class174.method2975(var10.field2640 / 2 + var12, var10.field2641 / 2 + var13);
                                    int var71 = var10.field2679 * class174.field1924[var10.field2723] >> 16;
                                    int var72 = var10.field2679 * class174.field1909[var10.field2723] >> 16;
                                    if (var66 != null) {
                                        if (var10.field2625) {
                                            var66.method3240();
                                            if (var10.field2682) {
                                                var66.method3254(0, var10.field2677, var10.field2694, var10.field2723, var10.field2716, var10.field2675 + var67 + var71, var10.field2675 + var72, var10.field2679);
                                            } else {
                                                var66.method3253(0, var10.field2677, var10.field2694, var10.field2723, var10.field2716, var10.field2675 + var67 + var71, var10.field2675 + var72);
                                            }
                                        } else {
                                            var66.method3253(0, var10.field2677, 0, var10.field2723, 0, var71, var72);
                                        }
                                    }
                                    class174.method2926();
                                } else {
                                    if (var10.field2627 == 7) {
                                        class299 var73 = var10.method3732();
                                        if (var73 == null) {
                                            if (class225.field2623) {
                                                method213(var10);
                                            }
                                            continue;
                                        }
                                        int var74 = 0;
                                        for (int var75 = 0; var75 < var10.field2676; var75++) {
                                            for (int var76 = 0; var76 < var10.field2636; var76++) {
                                                if (var10.field2635[var74] > 0) {
                                                    class296 var77 = class296.method194(var10.field2635[var74] - 1);
                                                    String var78;
                                                    if (var77.field3661 != 1 && var10.field2752[var74] == 1) {
                                                        var78 = class106.method5281(16748608) + var77.field3691 + class106.field1327;
                                                    } else {
                                                        var78 = class106.method5281(16748608) + var77.field3691 + class106.field1327 + " " + 'x' + method2159(var10.field2752[var74]);
                                                    }
                                                    int var79 = (var10.field2692 + 115) * var76 + var12;
                                                    int var80 = (var10.field2717 + 12) * var75 + var13;
                                                    if (var10.field2689 == 0) {
                                                        var73.method4785(var78, var79, var80, var10.field2659, var10.field2691 ? 0 : -1);
                                                    } else if (var10.field2689 == 1) {
                                                        var73.method4788(var78, var10.field2640 / 2 + var79, var80, var10.field2659, var10.field2691 ? 0 : -1);
                                                    } else {
                                                        var73.method4855(var78, var10.field2640 + var79 - 1, var80, var10.field2659, var10.field2691 ? 0 : -1);
                                                    }
                                                }
                                                var74++;
                                            }
                                        }
                                    }
                                    if (var10.field2627 == 8 && Statics.field1193 == var10 && field754 == field697) {
                                        int var81 = 0;
                                        int var82 = 0;
                                        class299 var83 = Statics.field122;
                                        String var84 = var10.field2686;
                                        String var85 = method3837(var84, var10);
                                        while (var85.length() > 0) {
                                            int var86 = var85.indexOf(class106.field1320);
                                            String var87;
                                            if (var86 == -1) {
                                                var87 = var85;
                                                var85 = "";
                                            } else {
                                                var87 = var85.substring(0, var86);
                                                var85 = var85.substring(var86 + 4);
                                            }
                                            int var88 = var83.method4781(var87);
                                            if (var88 > var81) {
                                                var81 = var88;
                                            }
                                            var82 += var83.field3732 + 1;
                                        }
                                        var81 += 6;
                                        var82 += 7;
                                        int var89 = var10.field2640 + var12 - 5 - var81;
                                        int var90 = var10.field2641 + var13 + 5;
                                        if (var89 < var12 + 5) {
                                            var89 = var12 + 5;
                                        }
                                        if (var81 + var89 > arg4) {
                                            var89 = arg4 - var81;
                                        }
                                        if (var82 + var90 > arg5) {
                                            var90 = arg5 - var82;
                                        }
                                        class391.method6191(var89, var90, var81, var82, 16777120);
                                        class391.method6131(var89, var90, var81, var82, 0);
                                        String var91 = var10.field2686;
                                        int var92 = var83.field3732 + var90 + 2;
                                        String var93 = method3837(var91, var10);
                                        while (var93.length() > 0) {
                                            int var94 = var93.indexOf(class106.field1320);
                                            String var95;
                                            if (var94 == -1) {
                                                var95 = var93;
                                                var93 = "";
                                            } else {
                                                var95 = var93.substring(0, var94);
                                                var93 = var93.substring(var94 + 4);
                                            }
                                            var83.method4785(var95, var89 + 3, var92, 0, -1);
                                            var92 += var83.field3732 + 1;
                                        }
                                    }
                                    if (var10.field2627 == 9) {
                                        int var96;
                                        int var97;
                                        int var98;
                                        int var99;
                                        if (var10.field2728) {
                                            var96 = var12;
                                            var97 = var10.field2641 + var13;
                                            var98 = var10.field2640 + var12;
                                            var99 = var13;
                                        } else {
                                            var96 = var12;
                                            var97 = var13;
                                            var98 = var10.field2640 + var12;
                                            var99 = var10.field2641 + var13;
                                        }
                                        if (var10.field2658 == 1) {
                                            class391.method6137(var96, var97, var98, var99, var10.field2659);
                                        } else {
                                            method4994(var96, var97, var98, var99, var10.field2659, var10.field2658);
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

    @ObfuscatedName("kp.iq(IIIIIII)V")
    public static final void method4994(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class391.field4221;
        int var18 = arg1 - class391.field4222;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class174.method2953(var19, var20, var21);
        class174.method2934(var23, var24, var25, var19, var20, var21, arg4);
        class174.method2953(var19, var21, var22);
        class174.method2934(var23, var25, var26, var19, var21, var22, arg4);
    }

    @ObfuscatedName("hm.ih(Ljava/lang/String;Lhu;I)Ljava/lang/String;")
    public static String method3837(String arg0, class225 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method2412(method2682(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
        }
        return arg0;
    }

    @ObfuscatedName("du.iy(II)Ljava/lang/String;")
    public static final String method2159(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class106.field1326 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class106.method5281(65408) + var1.substring(0, var1.length() - 8) + class246.field3042 + " " + class106.field1323 + var1 + class106.field1324 + class106.field1327;
        } else if (var1.length() > 6) {
            return " " + class106.method5281(16777215) + var1.substring(0, var1.length() - 4) + class246.field3079 + " " + class106.field1323 + var1 + class106.field1324 + class106.field1327;
        } else {
            return " " + class106.method5281(16776960) + var1 + class106.field1327;
        }
    }

    @ObfuscatedName("client.it(ZI)V")
    public final void method996(boolean arg0) {
        method3340(field763, Statics.field1143, Statics.field320, arg0);
    }

    @ObfuscatedName("client.if(Lhu;I)V")
    public void method997(class225 arg0) {
        class225 var2 = arg0.field2644 == -1 ? null : class225.method2354(arg0.field2644);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field1143;
            var4 = Statics.field320;
        } else {
            var3 = var2.field2640;
            var4 = var2.field2641;
        }
        method6378(arg0, var3, var4, false);
        Statics.method293(arg0, var3, var4);
    }

    @ObfuscatedName("lf.ia([Lhu;Lhu;ZB)V")
    public static void method5183(class225[] arg0, class225 arg1, boolean arg2) {
        int var3 = arg1.field2720 == 0 ? arg1.field2640 : arg1.field2720;
        int var4 = arg1.field2649 == 0 ? arg1.field2641 : arg1.field2649;
        Statics.method949(arg0, arg1.field2703, var3, var4, arg2);
        if (arg1.field2757 != null) {
            Statics.method949(arg1.field2757, arg1.field2703, var3, var4, arg2);
        }
        class95 var5 = (class95) field764.method5638((long) arg1.field2703);
        if (var5 != null) {
            int var6 = var5.field1141;
            if (Statics.method161(var6)) {
                Statics.method949(Statics.field2618[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2629 == 1337) {
        }
    }

    @ObfuscatedName("gk.ig(IIIZI)V")
    public static final void method3340(int arg0, int arg1, int arg2, boolean arg3) {
        if (Statics.method161(arg0)) {
            Statics.method949(Statics.field2618[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("oz.ir(Lhu;IIZI)V")
    public static void method6378(class225 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2640;
        int var5 = arg0.field2641;
        if (arg0.field2768 == 0) {
            arg0.field2640 = arg0.field2636;
        } else if (arg0.field2768 == 1) {
            arg0.field2640 = arg1 - arg0.field2636;
        } else if (arg0.field2768 == 2) {
            arg0.field2640 = arg0.field2636 * arg1 >> 14;
        }
        if (arg0.field2633 == 0) {
            arg0.field2641 = arg0.field2676;
        } else if (arg0.field2633 == 1) {
            arg0.field2641 = arg2 - arg0.field2676;
        } else if (arg0.field2633 == 2) {
            arg0.field2641 = arg0.field2676 * arg2 >> 14;
        }
        if (arg0.field2768 == 4) {
            arg0.field2640 = arg0.field2641 * arg0.field2615 / arg0.field2643;
        }
        if (arg0.field2633 == 4) {
            arg0.field2641 = arg0.field2643 * arg0.field2640 / arg0.field2615;
        }
        if (arg0.field2629 == 1337) {
            field775 = arg0;
        }
        if (arg3 && arg0.field2678 != null && (arg0.field2640 != var4 || arg0.field2641 != var5)) {
            class96 var6 = new class96();
            var6.field1147 = arg0;
            var6.field1157 = arg0.field2678;
            field806.method4155(var6);
        }
    }

    @ObfuscatedName("mf.is(Lhu;IIIIIII)V")
    public static final void method5660(class225 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field670) {
            field671 = 32;
        } else {
            field671 = 0;
        }
        field670 = false;
        if (class48.field347 == 1 || !Statics.field360 && class48.field347 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2647 -= 4;
                method213(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2647 += 4;
                method213(arg0);
            } else if (arg5 >= arg1 - field671 && arg5 < field671 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2647 = (arg4 - arg3) * var8 / var9;
                method213(arg0);
                field670 = true;
            }
        }
        if (field805 == 0) {
            return;
        }
        int var10 = arg0.field2640;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2647 += field805 * 45;
            method213(arg0);
        }
    }

    @ObfuscatedName("km.ix(IIIIII)V")
    public static final void method4946(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field3511[0].method6207(arg0, arg1);
        Statics.field3511[1].method6207(arg0, arg1 + arg3 - 16);
        class391.method6191(arg0, arg1 + 16, 16, arg3 - 32, field666);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class391.method6191(arg0, arg1 + 16 + var6, 16, var5, field667);
        class391.method6144(arg0, arg1 + 16 + var6, var5, field669);
        class391.method6144(arg0 + 1, arg1 + 16 + var6, var5, field669);
        class391.method6133(arg0, arg1 + 16 + var6, 16, field669);
        class391.method6133(arg0, arg1 + 17 + var6, 16, field669);
        class391.method6144(arg0 + 15, arg1 + 16 + var6, var5, field668);
        class391.method6144(arg0 + 14, arg1 + 17 + var6, var5 - 1, field668);
        class391.method6133(arg0, arg1 + 15 + var6 + var5, 16, field668);
        class391.method6133(arg0 + 1, arg1 + 14 + var6 + var5, 15, field668);
    }

    @ObfuscatedName("en.iw(IB)Ljava/lang/String;")
    public static final String method2412(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("ex.io(Lhu;II)I")
    public static final int method2682(class225 arg0, int arg1) {
        if (arg0.field2722 == null || arg1 >= arg0.field2722.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2722[arg1];
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
                    var7 = field735[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field737[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field652[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class225 var11 = class225.method2354(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class296.method194(var12).field3663 || field599)) {
                        for (int var13 = 0; var13 < var11.field2635.length; var13++) {
                            if (var12 + 1 == var11.field2635[var13]) {
                                var7 += var11.field2752[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class220.field2578[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class235.field2840[field737[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class220.field2578[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field1374.field1169;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class235.field2841[var14]) {
                            var7 += field737[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class225 var17 = class225.method2354(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class296.method194(var18).field3663 || field599)) {
                        for (int var19 = 0; var19 < var17.field2635.length; var19++) {
                            if (var18 + 1 == var17.field2635[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field626;
                }
                if (var6 == 12) {
                    var7 = field771;
                }
                if (var6 == 13) {
                    int var20 = class220.field2578[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class220.method29(var22);
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
                    var7 = (Statics.field1374.field1232 >> 7) + Statics.field1795;
                }
                if (var6 == 19) {
                    var7 = (Statics.field1374.field1210 >> 7) + Statics.field1892;
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

    @ObfuscatedName("bu.ib(Lhu;Lko;IIZI)V")
    public static final void method1438(class225 arg0, class296 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field3665;
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
            var7 = class246.field2914;
        }
        if (var6 != -1 && var7 != null) {
            method3824(var7, class106.method5281(16748608) + arg1.field3691, var6, arg1.field3648, arg2, arg0.field2703, arg4);
        }
    }

    @ObfuscatedName("d.jt(Lhu;IIB)V")
    public static final void method154(class225 arg0, int arg1, int arg2) {
        if (arg0.field2628 == 1) {
            method3660(arg0.field2750, "", 24, 0, 0, arg0.field2703);
        }
        if (arg0.field2628 == 2 && !field758) {
            String var3 = method145(arg0);
            if (var3 != null) {
                method3660(var3, class106.method5281(65280) + arg0.field2674, 25, 0, -1, arg0.field2703);
            }
        }
        if (arg0.field2628 == 3) {
            method3660(class246.field3193, "", 26, 0, 0, arg0.field2703);
        }
        if (arg0.field2628 == 4) {
            method3660(arg0.field2750, "", 28, 0, 0, arg0.field2703);
        }
        if (arg0.field2628 == 5) {
            method3660(arg0.field2750, "", 29, 0, 0, arg0.field2703);
        }
        if (arg0.field2628 == 6 && field640 == null) {
            method3660(arg0.field2750, "", 30, 0, -1, arg0.field2703);
        }
        if (arg0.field2627 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2641; var5++) {
                for (int var6 = 0; var6 < arg0.field2640; var6++) {
                    int var7 = (arg0.field2692 + 32) * var6;
                    int var8 = (arg0.field2717 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2670[var4];
                        var8 += arg0.field2733[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field878 = var4;
                        Statics.field580 = arg0;
                        if (arg0.field2635[var4] > 0) {
                            class296 var9 = class296.method194(arg0.field2635[var4] - 1);
                            if (field756 == 1 && class226.method3685(method3830(arg0))) {
                                if (Statics.field1451 != arg0.field2703 || Statics.field2466 != var4) {
                                    method3660(class246.field3164, field695 + " " + class106.field1325 + " " + class106.method5281(16748608) + var9.field3691, 31, var9.field3648, var4, arg0.field2703);
                                }
                            } else if (!field758 || !class226.method3685(method3830(arg0))) {
                                String[] var10 = var9.field3665;
                                int var11 = -1;
                                if (field749) {
                                    boolean var12 = field750 || class39.field247[81];
                                    if (var12) {
                                        var11 = var9.method4690();
                                    }
                                }
                                if (class226.method3685(method3830(arg0))) {
                                    for (int var13 = 4; var13 >= 3; var13--) {
                                        if (var11 != var13) {
                                            method1438(arg0, var9, var4, var13, false);
                                        }
                                    }
                                }
                                int var14 = method3830(arg0);
                                boolean var15 = (var14 >> 31 & 0x1) != 0;
                                if (var15) {
                                    method3660(class246.field3164, class106.method5281(16748608) + var9.field3691, 38, var9.field3648, var4, arg0.field2703);
                                }
                                class226 var10000 = (class226) null;
                                if (class226.method3685(method3830(arg0))) {
                                    for (int var16 = 2; var16 >= 0; var16--) {
                                        if (var11 != var16) {
                                            method1438(arg0, var9, var4, var16, false);
                                        }
                                    }
                                    if (var11 >= 0) {
                                        method1438(arg0, var9, var4, var11, true);
                                    }
                                }
                                String[] var17 = arg0.field2697;
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
                                            method3660(var17[var18], class106.method5281(16748608) + var9.field3691, var19, var9.field3648, var4, arg0.field2703);
                                        }
                                    }
                                }
                                method3660(class246.field2938, class106.method5281(16748608) + var9.field3691, 1005, var9.field3648, var4, arg0.field2703);
                            } else if ((Statics.field1442 & 0x10) == 16) {
                                method3660(field815, field762 + " " + class106.field1325 + " " + class106.method5281(16748608) + var9.field3691, 32, var9.field3648, var4, arg0.field2703);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2625) {
            return;
        }
        if (!field758) {
            for (int var20 = 9; var20 >= 5; var20--) {
                int var21 = method3830(arg0);
                boolean var22 = (var21 >> var20 + 1 & 0x1) != 0;
                String var23;
                if (!var22 && arg0.field2731 == null) {
                    var23 = null;
                } else if (arg0.field2705 == null || arg0.field2705.length <= var20 || arg0.field2705[var20] == null || arg0.field2705[var20].trim().length() == 0) {
                    var23 = null;
                } else {
                    var23 = arg0.field2705[var20];
                }
                if (var23 != null) {
                    method3660(var23, arg0.field2704, 1007, var20 + 1, arg0.field2626, arg0.field2703);
                }
            }
            String var25 = method145(arg0);
            if (var25 != null) {
                method3660(var25, arg0.field2704, 25, 0, arg0.field2626, arg0.field2703);
            }
            for (int var26 = 4; var26 >= 0; var26--) {
                int var27 = method3830(arg0);
                boolean var28 = (var27 >> var26 + 1 & 0x1) != 0;
                String var29;
                if (!var28 && arg0.field2731 == null) {
                    var29 = null;
                } else if (arg0.field2705 == null || arg0.field2705.length <= var26 || arg0.field2705[var26] == null || arg0.field2705[var26].trim().length() == 0) {
                    var29 = null;
                } else {
                    var29 = arg0.field2705[var26];
                }
                if (var29 != null) {
                    method3824(var29, arg0.field2704, 57, var26 + 1, arg0.field2626, arg0.field2703, arg0.field2769);
                }
            }
            if (class226.method2831(method3830(arg0))) {
                method3660(class246.field2918, "", 30, 0, arg0.field2626, arg0.field2703);
            }
        } else if (class226.method3724(method3830(arg0)) && (Statics.field1442 & 0x20) == 32) {
            method3660(field815, field762 + " " + class106.field1325 + " " + arg0.field2704, 58, 0, arg0.field2626, arg0.field2703);
        }
    }

    @ObfuscatedName("ga.jn(ZI)V")
    public static void method3427(boolean arg0) {
        field750 = arg0;
    }

    @ObfuscatedName("ay.ja(I)Z")
    public static boolean method206() {
        return field750;
    }

    @ObfuscatedName("e.jf(IIIIIIIB)V")
    public static final void method60(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (Statics.method161(arg0)) {
            method3348(Statics.field2618[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("gb.jj([Lhu;IIIIIIII)V")
    public static final void method3348(class225[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class225 var9 = arg0[var8];
            if (var9 != null && var9.field2644 == arg1 && (!var9.field2625 || var9.field2627 == 0 || var9.field2736 || method3830(var9) != 0 || field777 == var9 || var9.field2629 == 1338)) {
                if (var9.field2625) {
                    if (method2460(var9)) {
                        continue;
                    }
                } else if (var9.field2627 == 0 && Statics.field2582 != var9 && method2460(var9)) {
                    continue;
                }
                int var10 = var9.field2642 + arg6;
                int var11 = var9.field2639 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2627 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2627 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2640 + var10;
                    int var19 = var9.field2641 + var11;
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
                    int var22 = var9.field2640 + var10;
                    int var23 = var9.field2641 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field776 == var9) {
                    field784 = true;
                    field785 = var10;
                    field846 = var11;
                }
                boolean var24 = false;
                if (var9.field2699) {
                    switch(field765) {
                        case 0:
                            var24 = true;
                        case 1:
                        default:
                            break;
                        case 2:
                            if (var9.field2703 >>> 16 == field766) {
                                var24 = true;
                            }
                            break;
                        case 3:
                            if (field766 == var9.field2703) {
                                var24 = true;
                            }
                    }
                }
                if (var24 || !var9.field2625 || var12 < var14 && var13 < var15) {
                    if (var9.field2625) {
                        if (var9.field2638) {
                            if (class48.field342 >= var12 && class48.field357 >= var13 && class48.field342 < var14 && class48.field357 < var15) {
                                for (class96 var25 = (class96) field806.method4160(); var25 != null; var25 = (class96) field806.method4182()) {
                                    if (var25.field1149) {
                                        var25.method5354();
                                        var25.field1147.field2758 = false;
                                    }
                                }
                                if (Statics.field232 == 0) {
                                    field776 = null;
                                    field777 = null;
                                }
                                if (!field739) {
                                    method4469();
                                }
                            }
                        } else if (var9.field2742 && class48.field342 >= var12 && class48.field357 >= var13 && class48.field342 < var14 && class48.field357 < var15) {
                            for (class96 var26 = (class96) field806.method4160(); var26 != null; var26 = (class96) field806.method4182()) {
                                if (var26.field1149 && var26.field1147.field2732 == var26.field1157) {
                                    var26.method5354();
                                }
                            }
                        }
                    }
                    int var27 = class48.field342;
                    int var28 = class48.field357;
                    if (class48.field355 != 0) {
                        var27 = class48.field343;
                        var28 = class48.field348;
                    }
                    boolean var29 = var27 >= var12 && var28 >= var13 && var27 < var14 && var28 < var15;
                    if (var9.field2629 == 1337) {
                        if (!field665 && !field739 && var29) {
                            method2194(var27, var28, var12, var13);
                        }
                    } else if (var9.field2629 == 1338) {
                        method159(var9, var10, var11);
                    } else {
                        if (var9.field2629 == 1400) {
                            Statics.field1411.method5401(class48.field342, class48.field357, var29, var10, var11, var9.field2640, var9.field2641);
                        }
                        if (!field739 && var29) {
                            if (var9.field2629 == 1400) {
                                Statics.field1411.method5442(var10, var11, var9.field2640, var9.field2641, var27, var28);
                            } else {
                                method154(var9, var27 - var10, var28 - var11);
                            }
                        }
                        if (var24) {
                            for (int var30 = 0; var30 < var9.field2700.length; var30++) {
                                boolean var31 = false;
                                boolean var32 = false;
                                if (!var31 && var9.field2700[var30] != null) {
                                    for (int var33 = 0; var33 < var9.field2700[var30].length; var33++) {
                                        boolean var34 = false;
                                        if (var9.field2654 != null) {
                                            var34 = class39.field247[var9.field2700[var30][var33]];
                                        }
                                        if (method3343(var9.field2700[var30][var33]) || var34) {
                                            var31 = true;
                                            if (var9.field2654 != null && var9.field2654[var30] > field611) {
                                                break;
                                            }
                                            byte var35 = var9.field2748[var30][var33];
                                            if (var35 == 0 || ((var35 & 0x8) == 0 || !class39.field247[86] && !class39.field247[82] && !class39.field247[81]) && ((var35 & 0x2) == 0 || class39.field247[86]) && ((var35 & 0x1) == 0 || class39.field247[82]) && ((var35 & 0x4) == 0 || class39.field247[81])) {
                                                var32 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (var32) {
                                    if (var30 < 10) {
                                        method5788(var30 + 1, var9.field2703, var9.field2626, var9.field2753, "");
                                    } else if (var30 == 10) {
                                        method2737();
                                        method3869(var9.field2703, var9.field2626, class226.method3716(method3830(var9)), var9.field2753);
                                        field815 = method145(var9);
                                        if (field815 == null) {
                                            field815 = class246.field2920;
                                        }
                                        field762 = var9.field2704 + class106.method5281(16777215);
                                    }
                                    int var36 = var9.field2702[var30];
                                    if (var9.field2654 == null) {
                                        var9.field2654 = new int[var9.field2700.length];
                                    }
                                    if (var9.field2693 == null) {
                                        var9.field2693 = new int[var9.field2700.length];
                                    }
                                    if (var36 == 0) {
                                        var9.field2654[var30] = Integer.MAX_VALUE;
                                    } else if (var9.field2654[var30] == 0) {
                                        var9.field2654[var30] = field611 + var36 + var9.field2693[var30];
                                    } else {
                                        var9.field2654[var30] = field611 + var36;
                                    }
                                }
                                if (!var31 && var9.field2654 != null) {
                                    var9.field2654[var30] = 0;
                                }
                            }
                        }
                        if (var9.field2625) {
                            boolean var37;
                            if (class48.field342 >= var12 && class48.field357 >= var13 && class48.field342 < var14 && class48.field357 < var15) {
                                var37 = true;
                            } else {
                                var37 = false;
                            }
                            boolean var38 = false;
                            if ((class48.field347 == 1 || !Statics.field360 && class48.field347 == 4) && var37) {
                                var38 = true;
                            }
                            boolean var39 = false;
                            if ((class48.field355 == 1 || !Statics.field360 && class48.field355 == 4) && class48.field343 >= var12 && class48.field348 >= var13 && class48.field343 < var14 && class48.field348 < var15) {
                                var39 = true;
                            }
                            if (var39) {
                                method659(var9, class48.field343 - var10, class48.field348 - var11);
                            }
                            if (var9.field2629 == 1400) {
                                Statics.field1411.method5520(var27, var28, var37 & var38, var37 & var39);
                            }
                            if (field776 != null && field776 != var9 && var37 && class226.method1538(method3830(var9))) {
                                field853 = var9;
                            }
                            if (field777 == var9) {
                                field781 = true;
                                field728 = var10;
                                field783 = var11;
                            }
                            if (var9.field2736) {
                                if (var37 && field805 != 0 && var9.field2732 != null) {
                                    class96 var40 = new class96();
                                    var40.field1149 = true;
                                    var40.field1147 = var9;
                                    var40.field1150 = field805;
                                    var40.field1157 = var9.field2732;
                                    field806.method4155(var40);
                                }
                                if (field776 != null || Statics.field2234 != null || field739) {
                                    var39 = false;
                                    var38 = false;
                                    var37 = false;
                                }
                                if (!var9.field2759 && var39) {
                                    var9.field2759 = true;
                                    if (var9.field2713 != null) {
                                        class96 var41 = new class96();
                                        var41.field1149 = true;
                                        var41.field1147 = var9;
                                        var41.field1148 = class48.field343 - var10;
                                        var41.field1150 = class48.field348 - var11;
                                        var41.field1157 = var9.field2713;
                                        field806.method4155(var41);
                                    }
                                }
                                if (var9.field2759 && var38 && var9.field2667 != null) {
                                    class96 var42 = new class96();
                                    var42.field1149 = true;
                                    var42.field1147 = var9;
                                    var42.field1148 = class48.field342 - var10;
                                    var42.field1150 = class48.field357 - var11;
                                    var42.field1157 = var9.field2667;
                                    field806.method4155(var42);
                                }
                                if (var9.field2759 && !var38) {
                                    var9.field2759 = false;
                                    if (var9.field2715 != null) {
                                        class96 var43 = new class96();
                                        var43.field1149 = true;
                                        var43.field1147 = var9;
                                        var43.field1148 = class48.field342 - var10;
                                        var43.field1150 = class48.field357 - var11;
                                        var43.field1157 = var9.field2715;
                                        field689.method4155(var43);
                                    }
                                }
                                if (var38 && var9.field2738 != null) {
                                    class96 var44 = new class96();
                                    var44.field1149 = true;
                                    var44.field1147 = var9;
                                    var44.field1148 = class48.field342 - var10;
                                    var44.field1150 = class48.field357 - var11;
                                    var44.field1157 = var9.field2738;
                                    field806.method4155(var44);
                                }
                                if (!var9.field2758 && var37) {
                                    var9.field2758 = true;
                                    if (var9.field2767 != null) {
                                        class96 var45 = new class96();
                                        var45.field1149 = true;
                                        var45.field1147 = var9;
                                        var45.field1148 = class48.field342 - var10;
                                        var45.field1150 = class48.field357 - var11;
                                        var45.field1157 = var9.field2767;
                                        field806.method4155(var45);
                                    }
                                }
                                if (var9.field2758 && var37 && var9.field2718 != null) {
                                    class96 var46 = new class96();
                                    var46.field1149 = true;
                                    var46.field1147 = var9;
                                    var46.field1148 = class48.field342 - var10;
                                    var46.field1150 = class48.field357 - var11;
                                    var46.field1157 = var9.field2718;
                                    field806.method4155(var46);
                                }
                                if (var9.field2758 && !var37) {
                                    var9.field2758 = false;
                                    if (var9.field2719 != null) {
                                        class96 var47 = new class96();
                                        var47.field1149 = true;
                                        var47.field1147 = var9;
                                        var47.field1148 = class48.field342 - var10;
                                        var47.field1150 = class48.field357 - var11;
                                        var47.field1157 = var9.field2719;
                                        field689.method4155(var47);
                                    }
                                }
                                if (var9.field2709 != null) {
                                    class96 var48 = new class96();
                                    var48.field1147 = var9;
                                    var48.field1157 = var9.field2709;
                                    field807.method4155(var48);
                                }
                                if (var9.field2724 != null && field790 > var9.field2761) {
                                    if (var9.field2725 == null || field790 - var9.field2761 > 32) {
                                        class96 var53 = new class96();
                                        var53.field1147 = var9;
                                        var53.field1157 = var9.field2724;
                                        field806.method4155(var53);
                                    } else {
                                        label610: for (int var49 = var9.field2761; var49 < field790; var49++) {
                                            int var50 = field789[var49 & 0x1F];
                                            for (int var51 = 0; var51 < var9.field2725.length; var51++) {
                                                if (var9.field2725[var51] == var50) {
                                                    class96 var52 = new class96();
                                                    var52.field1147 = var9;
                                                    var52.field1157 = var9.field2724;
                                                    field806.method4155(var52);
                                                    break label610;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2761 = field790;
                                }
                                if (var9.field2632 != null && field792 > var9.field2749) {
                                    if (var9.field2684 == null || field792 - var9.field2749 > 32) {
                                        class96 var58 = new class96();
                                        var58.field1147 = var9;
                                        var58.field1157 = var9.field2632;
                                        field806.method4155(var58);
                                    } else {
                                        label586: for (int var54 = var9.field2749; var54 < field792; var54++) {
                                            int var55 = field791[var54 & 0x1F];
                                            for (int var56 = 0; var56 < var9.field2684.length; var56++) {
                                                if (var9.field2684[var56] == var55) {
                                                    class96 var57 = new class96();
                                                    var57.field1147 = var9;
                                                    var57.field1157 = var9.field2632;
                                                    field806.method4155(var57);
                                                    break label586;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2749 = field792;
                                }
                                if (var9.field2741 != null && field794 > var9.field2755) {
                                    if (var9.field2729 == null || field794 - var9.field2755 > 32) {
                                        class96 var63 = new class96();
                                        var63.field1147 = var9;
                                        var63.field1157 = var9.field2741;
                                        field806.method4155(var63);
                                    } else {
                                        label562: for (int var59 = var9.field2755; var59 < field794; var59++) {
                                            int var60 = field723[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var9.field2729.length; var61++) {
                                                if (var9.field2729[var61] == var60) {
                                                    class96 var62 = new class96();
                                                    var62.field1147 = var9;
                                                    var62.field1157 = var9.field2741;
                                                    field806.method4155(var62);
                                                    break label562;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2755 = field794;
                                }
                                if (field871 > var9.field2760 && var9.field2698 != null) {
                                    class96 var64 = new class96();
                                    var64.field1147 = var9;
                                    var64.field1157 = var9.field2698;
                                    field806.method4155(var64);
                                }
                                if (field798 > var9.field2760 && var9.field2735 != null) {
                                    class96 var65 = new class96();
                                    var65.field1147 = var9;
                                    var65.field1157 = var9.field2735;
                                    field806.method4155(var65);
                                }
                                if (field799 > var9.field2760 && var9.field2650 != null) {
                                    class96 var66 = new class96();
                                    var66.field1147 = var9;
                                    var66.field1157 = var9.field2650;
                                    field806.method4155(var66);
                                }
                                if (field787 > var9.field2760 && var9.field2737 != null) {
                                    class96 var67 = new class96();
                                    var67.field1147 = var9;
                                    var67.field1157 = var9.field2737;
                                    field806.method4155(var67);
                                }
                                if (field801 > var9.field2760 && var9.field2656 != null) {
                                    class96 var68 = new class96();
                                    var68.field1147 = var9;
                                    var68.field1157 = var9.field2656;
                                    field806.method4155(var68);
                                }
                                if (field802 > var9.field2760 && var9.field2743 != null) {
                                    class96 var69 = new class96();
                                    var69.field1147 = var9;
                                    var69.field1157 = var9.field2743;
                                    field806.method4155(var69);
                                }
                                if (field803 > var9.field2760 && var9.field2744 != null) {
                                    class96 var70 = new class96();
                                    var70.field1147 = var9;
                                    var70.field1157 = var9.field2744;
                                    field806.method4155(var70);
                                }
                                if (field804 > var9.field2760 && var9.field2714 != null) {
                                    class96 var71 = new class96();
                                    var71.field1147 = var9;
                                    var71.field1157 = var9.field2714;
                                    field806.method4155(var71);
                                }
                                var9.field2760 = field605;
                                if (var9.field2734 != null) {
                                    for (int var72 = 0; var72 < field828; var72++) {
                                        class96 var73 = new class96();
                                        var73.field1147 = var9;
                                        var73.field1146 = field793[var72];
                                        var73.field1152 = field829[var72];
                                        var73.field1157 = var9.field2734;
                                        field806.method4155(var73);
                                    }
                                }
                            }
                        }
                        if (!var9.field2625) {
                            if (field776 != null || Statics.field2234 != null || field739) {
                                continue;
                            }
                            if ((var9.field2710 >= 0 || var9.field2652 != 0) && class48.field342 >= var12 && class48.field357 >= var13 && class48.field342 < var14 && class48.field357 < var15) {
                                if (var9.field2710 >= 0) {
                                    Statics.field2582 = arg0[var9.field2710];
                                } else {
                                    Statics.field2582 = var9;
                                }
                            }
                            if (var9.field2627 == 8 && class48.field342 >= var12 && class48.field357 >= var13 && class48.field342 < var14 && class48.field357 < var15) {
                                Statics.field1193 = var9;
                            }
                            if (var9.field2649 > var9.field2641) {
                                method5660(var9, var9.field2640 + var10, var11, var9.field2641, var9.field2649, class48.field342, class48.field357);
                            }
                        }
                        if (var9.field2627 == 0) {
                            method3348(arg0, var9.field2703, var12, var13, var14, var15, var10 - var9.field2646, var11 - var9.field2647);
                            if (var9.field2757 != null) {
                                method3348(var9.field2757, var9.field2703, var12, var13, var14, var15, var10 - var9.field2646, var11 - var9.field2647);
                            }
                            class95 var74 = (class95) field764.method5638((long) var9.field2703);
                            if (var74 != null) {
                                if (var74.field1138 == 0 && class48.field342 >= var12 && class48.field357 >= var13 && class48.field342 < var14 && class48.field357 < var15 && !field739) {
                                    for (class96 var75 = (class96) field806.method4160(); var75 != null; var75 = (class96) field806.method4182()) {
                                        if (var75.field1149) {
                                            var75.method5354();
                                            var75.field1147.field2758 = false;
                                        }
                                    }
                                    if (Statics.field232 == 0) {
                                        field776 = null;
                                        field777 = null;
                                    }
                                    if (!field739) {
                                        method4469();
                                    }
                                }
                                method60(var74.field1141, var12, var13, var14, var15, var10, var11);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("gs.jk(II)Z")
    public static boolean method3343(int arg0) {
        for (int var1 = 0; var1 < field828; var1++) {
            if (field793[var1] == arg0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("ny.jr(III)V")
    public static final void method5795(int arg0, int arg1) {
        if (Statics.method161(arg0)) {
            method2298(Statics.field2618[arg0], arg1);
        }
    }

    @ObfuscatedName("et.jh([Lhu;II)V")
    public static final void method2298(class225[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class225 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2627 == 0) {
                    if (var3.field2757 != null) {
                        method2298(var3.field2757, arg1);
                    }
                    class95 var4 = (class95) field764.method5638((long) var3.field2703);
                    if (var4 != null) {
                        method5795(var4.field1141, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2766 != null) {
                    class96 var5 = new class96();
                    var5.field1147 = var3;
                    var5.field1157 = var3.field2766;
                    class79.method179(var5);
                }
                if (arg1 == 1 && var3.field2648 != null) {
                    if (var3.field2626 >= 0) {
                        class225 var6 = class225.method2354(var3.field2703);
                        if (var6 == null || var6.field2757 == null || var3.field2626 >= var6.field2757.length || var6.field2757[var3.field2626] != var3) {
                            continue;
                        }
                    }
                    class96 var7 = new class96();
                    var7.field1147 = var3;
                    var7.field1157 = var3.field2648;
                    class79.method179(var7);
                }
            }
        }
    }

    @ObfuscatedName("bh.jb(Lhu;III)V")
    public static final void method659(class225 arg0, int arg1, int arg2) {
        if (field776 != null || field739 || arg0 == null || method156(arg0) == null) {
            return;
        }
        field776 = arg0;
        field777 = method156(arg0);
        field824 = arg1;
        field779 = arg2;
        Statics.field232 = 0;
        field712 = false;
        int var3 = field740 - 1;
        if (var3 == -1) {
            return;
        }
        Statics.field195 = new class82();
        Statics.field195.field981 = field826[var3];
        Statics.field195.field977 = field742[var3];
        Statics.field195.field978 = field648[var3];
        Statics.field195.field979 = field744[var3];
        Statics.field195.field980 = field745[var3];
    }

    @ObfuscatedName("client.jl(I)V")
    public final void method998() {
        method213(field776);
        Statics.field232++;
        if (field784 && field781) {
            int var1 = class48.field342;
            int var2 = class48.field357;
            int var3 = var1 - field824;
            int var4 = var2 - field779;
            if (var3 < field728) {
                var3 = field728;
            }
            if (field776.field2640 + var3 > field728 + field777.field2640) {
                var3 = field728 + field777.field2640 - field776.field2640;
            }
            if (var4 < field783) {
                var4 = field783;
            }
            if (field776.field2641 + var4 > field783 + field777.field2641) {
                var4 = field783 + field777.field2641 - field776.field2641;
            }
            int var5 = var3 - field785;
            int var6 = var4 - field846;
            int var7 = field776.field2707;
            if (Statics.field232 > field776.field2708 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field712 = true;
            }
            int var8 = field777.field2646 + (var3 - field728);
            int var9 = field777.field2647 + (var4 - field783);
            if (field776.field2727 != null && field712) {
                class96 var10 = new class96();
                var10.field1147 = field776;
                var10.field1148 = var8;
                var10.field1150 = var9;
                var10.field1157 = field776.field2727;
                class79.method179(var10);
            }
            if (class48.field347 == 0) {
                if (field712) {
                    if (field776.field2631 != null) {
                        class96 var11 = new class96();
                        var11.field1147 = field776;
                        var11.field1148 = var8;
                        var11.field1150 = var9;
                        var11.field1151 = field853;
                        var11.field1157 = field776.field2631;
                        class79.method179(var11);
                    }
                    if (field853 != null) {
                        class225 var12 = field776;
                        int var13 = class226.method2699(method3830(var12));
                        class225 var14;
                        if (var13 == 0) {
                            var14 = null;
                        } else {
                            int var15 = 0;
                            while (true) {
                                if (var15 >= var13) {
                                    var14 = var12;
                                    break;
                                }
                                var12 = class225.method2354(var12.field2644);
                                if (var12 == null) {
                                    var14 = null;
                                    break;
                                }
                                var15++;
                            }
                        }
                        if (var14 != null) {
                            class205 var16 = class205.method4631(class203.field2308, field649.field1385);
                            var16.field2342.method5853(field776.field2626);
                            var16.field2342.method5853(field853.field2753);
                            var16.field2342.method5890(field776.field2753);
                            var16.field2342.method5900(field853.field2703);
                            var16.field2342.method5853(field853.field2626);
                            var16.field2342.method5900(field776.field2703);
                            field649.method2099(var16);
                        }
                    }
                } else if (this.method1318()) {
                    this.method1218(field824 + field785, field846 + field779);
                } else if (field740 > 0) {
                    method203(field824 + field785, field846 + field779);
                }
                field776 = null;
            }
        } else if (Statics.field232 > 1) {
            field776 = null;
        }
    }

    @ObfuscatedName("ac.jo(III)V")
    public static void method203(int arg0, int arg1) {
        class82 var2 = Statics.field195;
        method2179(var2.field981, var2.field977, var2.field978, var2.field979, var2.field980, var2.field980, arg0, arg1);
        Statics.field195 = null;
    }

    @ObfuscatedName("ag.ju(Lhu;I)V")
    public static void method213(class225 arg0) {
        if (field811 == arg0.field2765) {
            field812[arg0.field2764] = true;
        }
    }

    @ObfuscatedName("dm.jx(I)V")
    public static void method1976() {
        for (class95 var0 = (class95) field764.method5641(); var0 != null; var0 = (class95) field764.method5643()) {
            int var1 = var0.field1141;
            if (Statics.method161(var1)) {
                boolean var2 = true;
                class225[] var3 = Statics.field2618[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2625;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field3941;
                    class225 var6 = class225.method2354(var5);
                    if (var6 != null) {
                        method213(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("c.jc(Lhu;I)Lhu;")
    public static class225 method156(class225 arg0) {
        class225 var1 = arg0;
        int var2 = class226.method2699(method3830(arg0));
        class225 var3;
        if (var2 == 0) {
            var3 = null;
        } else {
            int var4 = 0;
            while (true) {
                if (var4 >= var2) {
                    var3 = var1;
                    break;
                }
                var1 = class225.method2354(var1.field2644);
                if (var1 == null) {
                    var3 = null;
                    break;
                }
                var4++;
            }
        }
        class225 var5 = var3;
        if (var3 == null) {
            var5 = arg0.field2701;
        }
        return var5;
    }

    @ObfuscatedName("ht.jp(II)V")
    public static final void method3691(int arg0) {
        if (!Statics.method161(arg0)) {
            return;
        }
        class225[] var1 = Statics.field2618[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class225 var3 = var1[var2];
            if (var3 != null) {
                var3.field2706 = 0;
                var3.field2756 = 0;
            }
        }
    }

    @ObfuscatedName("ig.jm(IB)V")
    public static final void method3929(int arg0) {
        if (Statics.method161(arg0)) {
            method3431(Statics.field2618[arg0], -1);
        }
    }

    @ObfuscatedName("hr.jw([Lhu;II)V")
    public static final void method3431(class225[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class225 var3 = arg0[var2];
            if (var3 != null && var3.field2644 == arg1 && (!var3.field2625 || !method2460(var3))) {
                if (var3.field2627 == 0) {
                    if (!var3.field2625 && method2460(var3) && Statics.field2582 != var3) {
                        continue;
                    }
                    method3431(arg0, var3.field2703);
                    if (var3.field2757 != null) {
                        method3431(var3.field2757, var3.field2703);
                    }
                    class95 var4 = (class95) field764.method5638((long) var3.field2703);
                    if (var4 != null) {
                        method3929(var4.field1141);
                    }
                }
                if (var3.field2627 == 6) {
                    if (var3.field2624 != -1 || var3.field2673 != -1) {
                        boolean var5 = Statics.method2750(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2673;
                        } else {
                            var6 = var3.field2624;
                        }
                        if (var6 != -1) {
                            class298 var7 = class298.method3795(var6);
                            var3.field2756 += field800;
                            while (var3.field2756 > var7.field3714[var3.field2706]) {
                                var3.field2756 -= var7.field3714[var3.field2706];
                                var3.field2706++;
                                if (var3.field2706 >= var7.field3712.length) {
                                    var3.field2706 -= var7.field3715;
                                    if (var3.field2706 < 0 || var3.field2706 >= var7.field3712.length) {
                                        var3.field2706 = 0;
                                    }
                                }
                                method213(var3);
                            }
                        }
                    }
                    if (var3.field2681 != 0 && !var3.field2625) {
                        int var8 = var3.field2681 >> 16;
                        int var9 = var3.field2681 << 16 >> 16;
                        int var10 = field800 * var8;
                        int var11 = field800 * var9;
                        var3.field2723 = var3.field2723 + var10 & 0x7FF;
                        var3.field2677 = var3.field2677 + var11 & 0x7FF;
                        method213(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cy.js(D)V")
    public static final void method1844(double arg0) {
        class174.method2946(arg0);
        ((class181) Statics.field1921).method3203(arg0);
        class296.method2299();
        Statics.field988.field1305 = arg0;
        class103.method964();
    }

    @ObfuscatedName("dc.je(II)V")
    public static final void method2081(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 255);
        if (Statics.field988.field1303 == var1) {
            return;
        }
        if (Statics.field988.field1303 == 0 && field842 != -1) {
            class211.method3417(Statics.field62, field842, 0, var1, false);
            field843 = false;
        } else if (var1 == 0) {
            class211.method3836();
            field843 = false;
        } else if (class211.field2483 == 0) {
            Statics.field2486.method3449(var1);
        } else {
            Statics.field4138 = var1;
        }
        Statics.field988.field1303 = var1;
        class103.method964();
    }

    @ObfuscatedName("ai.jy(IB)V")
    public static final void method302(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field988.field1307 = var1;
        class103.method964();
    }

    @ObfuscatedName("hv.jv(II)V")
    public static final void method3625(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field988.field1308 = var1;
        class103.method964();
    }

    @ObfuscatedName("ay.jq(II)V")
    public static final void method207(int arg0) {
        method1976();
        for (class78 var1 = (class78) class78.field920.method4160(); var1 != null; var1 = (class78) class78.field920.method4182()) {
            if (var1.field927 != null) {
                var1.method1531();
            }
        }
        int var2 = class279.method4938(arg0).field3402;
        if (var2 == 0) {
            return;
        }
        int var3 = class220.field2578[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                method1844(0.9D);
            }
            if (var3 == 2) {
                method1844(0.8D);
            }
            if (var3 == 3) {
                method1844(0.7D);
            }
            if (var3 == 4) {
                method1844(0.6D);
            }
        }
        if (var2 == 3) {
            if (var3 == 0) {
                method2081(255);
            }
            if (var3 == 1) {
                method2081(192);
            }
            if (var3 == 2) {
                method2081(128);
            }
            if (var3 == 3) {
                method2081(64);
            }
            if (var3 == 4) {
                method2081(0);
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                method302(127);
            }
            if (var3 == 1) {
                method302(96);
            }
            if (var3 == 2) {
                method302(64);
            }
            if (var3 == 3) {
                method302(32);
            }
            if (var3 == 4) {
                method302(0);
            }
        }
        if (var2 == 5) {
            field874 = var3;
        }
        if (var2 == 6) {
            field707 = var3;
        }
        if (var2 == 9) {
            field768 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                method3625(127);
            }
            if (var3 == 1) {
                method3625(96);
            }
            if (var3 == 2) {
                method3625(64);
            }
            if (var3 == 3) {
                method3625(32);
            }
            if (var3 == 4) {
                method3625(0);
            }
        }
        if (var2 == 17) {
            field615 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            class107[] var4 = new class107[] { class107.field1336, class107.field1337, class107.field1338, class107.field1334 };
            field627 = (class107) class267.method2139(var4, var3);
            if (field627 == null) {
                field627 = class107.field1338;
            }
        }
        if (var2 == 19) {
            if (var3 == -1) {
                field869 = -1;
            } else {
                field869 = var3 & 0x7FF;
            }
        }
        if (var2 != 22) {
            return;
        }
        class107[] var5 = new class107[] { class107.field1336, class107.field1337, class107.field1338, class107.field1334 };
        field628 = (class107) class267.method2139(var5, var3);
        if (field628 == null) {
            field628 = class107.field1338;
        }
    }

    @ObfuscatedName("ca.jg(Lhu;I)V")
    public static final void method1752(class225 arg0) {
        int var1 = arg0.field2629;
        if (var1 == 324) {
            if (field872 == -1) {
                field872 = arg0.field2637;
                field714 = arg0.field2661;
            }
            if (field808.field2598) {
                arg0.field2637 = field872;
            } else {
                arg0.field2637 = field714;
            }
        } else if (var1 == 325) {
            if (field872 == -1) {
                field872 = arg0.field2637;
                field714 = arg0.field2661;
            }
            if (field808.field2598) {
                arg0.field2637 = field714;
            } else {
                arg0.field2637 = field872;
            }
        } else if (var1 == 327) {
            arg0.field2723 = 150;
            arg0.field2677 = (int) (Math.sin((double) field611 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2668 = 5;
            arg0.field2695 = 0;
        } else if (var1 == 328) {
            arg0.field2723 = 150;
            arg0.field2677 = (int) (Math.sin((double) field611 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2668 = 5;
            arg0.field2695 = 1;
        }
    }

    @ObfuscatedName("ig.ji(I)V")
    public static final void method3928() {
        class205 var0 = class205.method4631(class203.field2282, field649.field1385);
        field649.method2099(var0);
        for (class95 var1 = (class95) field764.method5641(); var1 != null; var1 = (class95) field764.method5643()) {
            if (var1.field1138 == 0 || var1.field1138 == 3) {
                method2663(var1, true);
            }
        }
        if (field640 != null) {
            method213(field640);
            field640 = null;
        }
    }

    @ObfuscatedName("cs.jz(IIIB)Lcv;")
    public static final class95 method1883(int arg0, int arg1, int arg2) {
        class95 var3 = new class95();
        var3.field1141 = arg1;
        var3.field1138 = arg2;
        field764.method5640(var3, (long) arg0);
        method3691(arg1);
        class225 var4 = class225.method2354(arg0);
        method213(var4);
        if (field640 != null) {
            method213(field640);
            field640 = null;
        }
        method2770();
        method5183(Statics.field2618[arg0 >> 16], var4, false);
        class79.method5223(arg1);
        if (field763 != -1) {
            method5795(field763, 1);
        }
        return var3;
    }

    @ObfuscatedName("ef.jd(Lcv;ZI)V")
    public static final void method2663(class95 arg0, boolean arg1) {
        int var2 = arg0.field1141;
        int var3 = (int) arg0.field3941;
        arg0.method5354();
        if (arg1) {
            class225.method2615(var2);
        }
        method74(var2);
        class225 var4 = class225.method2354(var3);
        if (var4 != null) {
            method213(var4);
        }
        method2770();
        if (field763 != -1) {
            method5795(field763, 1);
        }
    }

    @ObfuscatedName("lb.kc(Lhu;I)Z")
    public static final boolean method5046(class225 arg0) {
        int var1 = arg0.field2629;
        if (var1 == 205) {
            field651 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field808.method3699(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field808.method3690(var4, var5 == 1);
        }
        if (var1 == 324) {
            field808.method3711(false);
        }
        if (var1 == 325) {
            field808.method3711(true);
        }
        if (var1 == 326) {
            class205 var6 = class205.method4631(class203.field2226, field649.field1385);
            field808.method3692(var6.field2342);
            field649.method2099(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("i.kf(Lhu;IIIB)V")
    public static final void method186(class225 arg0, int arg1, int arg2, int arg3) {
        method3342();
        class219 var4 = arg0.method3752(false);
        if (var4 == null) {
            return;
        }
        class391.method6119(arg1, arg2, var4.field2571 + arg1, var4.field2572 + arg2);
        if (field841 == 2 || field841 == 5) {
            class391.method6139(arg1, arg2, 0, var4.field2573, var4.field2575);
        } else {
            int var5 = field673 & 0x7FF;
            int var6 = Statics.field1374.field1232 / 32 + 48;
            int var7 = 464 - Statics.field1374.field1210 / 32;
            Statics.field149.method6256(arg1, arg2, var4.field2571, var4.field2572, var6, var7, var5, 256, var4.field2573, var4.field2575);
            for (int var8 = 0; var8 < field835; var8++) {
                int var9 = field836[var8] * 4 + 2 - Statics.field1374.field1232 / 32;
                int var10 = field837[var8] * 4 + 2 - Statics.field1374.field1210 / 32;
                method2771(arg1, arg2, var9, var10, field838[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class272 var13 = field731[Statics.field201][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field1374.field1232 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field1374.field1210 / 32;
                        method2771(arg1, arg2, var14, var15, Statics.field2911[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field644; var16++) {
                class105 var17 = field643[field645[var16]];
                if (var17 != null && var17.method1857()) {
                    class287 var18 = var17.field1319;
                    if (var18 != null && var18.field3487 != null) {
                        var18 = var18.method4437();
                    }
                    if (var18 != null && var18.field3503 && var18.field3507) {
                        int var19 = var17.field1232 / 32 - Statics.field1374.field1232 / 32;
                        int var20 = var17.field1210 / 32 - Statics.field1374.field1210 / 32;
                        method2771(arg1, arg2, var19, var20, Statics.field2911[1], var4);
                    }
                }
            }
            int var21 = class109.field1362;
            int[] var22 = class109.field1354;
            for (int var23 = 0; var23 < var21; var23++) {
                class98 var24 = field849[var22[var23]];
                if (var24 != null && var24.method1857() && !var24.field1185 && Statics.field1374 != var24) {
                    int var25 = var24.field1232 / 32 - Statics.field1374.field1232 / 32;
                    int var26 = var24.field1210 / 32 - Statics.field1374.field1210 / 32;
                    boolean var27 = false;
                    if (Statics.field1374.field1191 != 0 && var24.field1191 != 0 && Statics.field1374.field1191 == var24.field1191) {
                        var27 = true;
                    }
                    if (var24.method1847()) {
                        method2771(arg1, arg2, var25, var26, Statics.field2911[3], var4);
                    } else if (var27) {
                        method2771(arg1, arg2, var25, var26, Statics.field2911[4], var4);
                    } else if (var24.method1850()) {
                        method2771(arg1, arg2, var25, var26, Statics.field2911[5], var4);
                    } else {
                        method2771(arg1, arg2, var25, var26, Statics.field2911[2], var4);
                    }
                }
            }
            if (field809 != 0 && field611 % 20 < 10) {
                if (field809 == 1 && field620 >= 0 && field620 < field643.length) {
                    class105 var28 = field643[field620];
                    if (var28 != null) {
                        int var29 = var28.field1232 / 32 - Statics.field1374.field1232 / 32;
                        int var30 = var28.field1210 / 32 - Statics.field1374.field1210 / 32;
                        method5762(arg1, arg2, var29, var30, Statics.field124[1], var4);
                    }
                }
                if (field809 == 2) {
                    int var31 = field622 * 4 - Statics.field1795 * 4 + 2 - Statics.field1374.field1232 / 32;
                    int var32 = field623 * 4 - Statics.field1892 * 4 + 2 - Statics.field1374.field1210 / 32;
                    method5762(arg1, arg2, var31, var32, Statics.field124[1], var4);
                }
                if (field809 == 10 && field621 >= 0 && field621 < field849.length) {
                    class98 var33 = field849[field621];
                    if (var33 != null) {
                        int var34 = var33.field1232 / 32 - Statics.field1374.field1232 / 32;
                        int var35 = var33.field1210 / 32 - Statics.field1374.field1210 / 32;
                        method5762(arg1, arg2, var34, var35, Statics.field124[1], var4);
                    }
                }
            }
            if (field839 != 0) {
                int var36 = field839 * 4 + 2 - Statics.field1374.field1232 / 32;
                int var37 = field840 * 4 + 2 - Statics.field1374.field1210 / 32;
                method2771(arg1, arg2, var36, var37, Statics.field124[0], var4);
            }
            if (!Statics.field1374.field1185) {
                class391.method6191(var4.field2571 / 2 + arg1 - 1, var4.field2572 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field813[arg3] = true;
    }

    @ObfuscatedName("ne.kb(Lhu;IIIB)V")
    public static final void method5777(class225 arg0, int arg1, int arg2, int arg3) {
        class219 var4 = arg0.method3752(false);
        if (var4 == null) {
            return;
        }
        if (field841 < 3) {
            Statics.field175.method6256(arg1, arg2, var4.field2571, var4.field2572, 25, 25, field673, 256, var4.field2573, var4.field2575);
        } else {
            class391.method6139(arg1, arg2, 0, var4.field2573, var4.field2575);
        }
    }

    @ObfuscatedName("np.ky(IIIILoh;Lhh;I)V")
    public static final void method5762(int arg0, int arg1, int arg2, int arg3, class395 arg4, class219 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method2771(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field673 & 0x7FF;
        int var8 = class174.field1924[var7];
        int var9 = class174.field1909[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field2571 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field221.method6257(arg5.field2571 / 2 + arg0 - var17 / 2 + var15, arg5.field2572 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("fl.kl(IIIILoh;Lhh;S)V")
    public static final void method2771(int arg0, int arg1, int arg2, int arg3, class395 arg4, class219 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field673 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class174.field1924[var6];
        int var9 = class174.field1909[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method6314(arg5.field2571 / 2 + var10 - arg4.field4251 / 2, arg5.field2572 / 2 - var11 - arg4.field4248 / 2, arg0, arg1, arg5.field2571, arg5.field2572, arg5.field2573, arg5.field2575);
        } else {
            arg4.method6284(arg5.field2571 / 2 + arg0 + var10 - arg4.field4251 / 2, arg5.field2572 / 2 + arg1 - var11 - arg4.field4248 / 2);
        }
    }

    @ObfuscatedName("o.kz(I)V")
    public static final void method17() {
        Iterator var0 = class111.field1376.iterator();
        while (var0.hasNext()) {
            class73 var1 = (class73) var0.next();
            var1.method945();
        }
        if (Statics.field1142 != null) {
            Statics.field1142.method5043();
        }
    }

    @ObfuscatedName("fy.ka(I)V")
    public static final void method2732() {
        for (int var0 = 0; var0 < class109.field1362; var0++) {
            class98 var1 = field849[class109.field1354[var0]];
            var1.method1851();
        }
    }

    @ObfuscatedName("ar.kt(B)V")
    public static final void method531() {
        field798 = field605;
    }

    @ObfuscatedName("fe.kj(I)V")
    public static final void method2741() {
        field799 = field605;
        Statics.field1592 = true;
    }

    @ObfuscatedName("ck.ke(Ljava/lang/String;I)V")
    public static final void method1812(String arg0) {
        if (!arg0.equals("")) {
            class205 var1 = class205.method4631(class203.field2253, field649.field1385);
            var1.field2342.method5839(class382.method5070(arg0));
            var1.field2342.method6016(arg0);
            field649.method2099(var1);
        }
    }

    @ObfuscatedName("il.kw(I)V")
    public static final void method3849() {
        class205 var0 = class205.method4631(class203.field2253, field649.field1385);
        var0.field2342.method5839(0);
        field649.method2099(var0);
    }

    @ObfuscatedName("cf.kq(III)V")
    public static final void method1654(int arg0, int arg1) {
        class4 var2 = arg0 >= 0 ? field821[arg0] : Statics.field4267;
        if (var2 == null || arg1 < 0 || arg1 >= var2.method37()) {
            return;
        }
        class10 var3 = (class10) var2.field28.get(arg1);
        if (var3.field67 != -1) {
            return;
        }
        String var4 = var3.field66;
        class112 var5 = field649;
        class205 var6 = class205.method4631(class203.field2317, var5.field1385);
        var6.field2342.method5839(3 + class382.method5070(var4));
        var6.field2342.method5839(arg0);
        var6.field2342.method5853(arg1);
        var6.field2342.method6016(var4);
        var5.method2099(var6);
    }

    @ObfuscatedName("gx.kx(IIB)V")
    public static final void method3404(int arg0, int arg1) {
        if (field821[arg0] == null || arg1 < 0 || arg1 >= field821[arg0].method37()) {
            return;
        }
        class10 var2 = (class10) field821[arg0].field28.get(arg1);
        if (var2.field67 != -1) {
            return;
        }
        class112 var3 = field649;
        class205 var4 = class205.method4631(class203.field2215, var3.field1385);
        var4.field2342.method5839(3 + class382.method5070(var2.field66));
        var4.field2342.method5839(arg0);
        var4.field2342.method5853(arg1);
        var4.field2342.method6016(var2.field66);
        var3.method2099(var4);
    }

    @ObfuscatedName("b.kd(IIZB)V")
    public static final void method56(int arg0, int arg1, boolean arg2) {
        if (field821[arg0] == null || arg1 < 0 || arg1 >= field821[arg0].method37()) {
            return;
        }
        class10 var3 = (class10) field821[arg0].field28.get(arg1);
        class112 var4 = field649;
        class205 var5 = class205.method4631(class203.field2299, var4.field1385);
        var5.field2342.method5839(4 + class382.method5070(var3.field66));
        var5.field2342.method5839(arg0);
        var5.field2342.method5853(arg1);
        var5.field2342.method5845(arg2);
        var5.field2342.method6016(var3.field66);
        var4.method2099(var5);
    }

    @ObfuscatedName("n.ks(II)V")
    public static void method74(int arg0) {
        for (class350 var1 = (class350) field748.method5641(); var1 != null; var1 = (class350) field748.method5643()) {
            if ((var1.field3941 >> 48 & 0xFFFFL) == (long) arg0) {
                var1.method5354();
            }
        }
    }

    @ObfuscatedName("hb.ku(Lhu;B)I")
    public static int method3830(class225 arg0) {
        class350 var1 = (class350) field748.method5638(((long) arg0.field2703 << 32) + (long) arg0.field2626);
        return var1 == null ? arg0.field2740 : var1.field3940;
    }

    @ObfuscatedName("eq.km(Lhu;I)Z")
    public static boolean method2460(class225 arg0) {
        return arg0.field2645;
    }

    @ObfuscatedName("m.kv(Lhu;B)Ljava/lang/String;")
    public static String method145(class225 arg0) {
        if (class226.method3716(method3830(arg0)) == 0) {
            return null;
        } else if (arg0.field2751 == null || arg0.field2751.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2751;
        }
    }

    @ObfuscatedName("mv.kn(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method5608(String arg0, boolean arg1) {
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
        if (Statics.field5 != null) {
            var3 = "/p=" + Statics.field5;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + Statics.field242 + "/a=" + Statics.field2003 + var3 + "/";
    }

    @ObfuscatedName("b.kp(Ljava/lang/String;I)V")
    public static void method58(String arg0) {
        Statics.field5 = arg0;
        try {
            String var1 = Statics.field75.getParameter(Integer.toString(18));
            String var2 = Statics.field75.getParameter(Integer.toString(13));
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class230.method548(class379.method1540() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class43.method329(Statics.field75, "document.cookie=\"" + var4 + "\"");
        } catch (Throwable var6) {
        }
    }

    @ObfuscatedName("fr.kr(Ljava/lang/String;ZI)V")
    public static void method2784(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field1419; var5++) {
            class296 var6 = class296.method194(var5);
            if ((!arg1 || var6.field3690) && var6.field3682 == -1 && var6.field3691.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field1785 = -1;
                    Statics.field150 = null;
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
        Statics.field150 = var3;
        Statics.field2339 = 0;
        Statics.field1785 = var4;
        String[] var9 = new String[Statics.field1785];
        for (int var10 = 0; var10 < Statics.field1785; var10++) {
            var9[var10] = class296.method194(var3[var10]).field3691;
        }
        short[] var11 = Statics.field150;
        class377.method4417(var9, var11, 0, var9.length - 1);
    }

    @ObfuscatedName("ey.kh(Lnu;IB)V")
    public static void method2365(class382 arg0, int arg1) {
        byte[] var2 = arg0.field4153;
        if (field788 == null) {
            field788 = new byte[24];
        }
        class306.method4956(var2, arg1, field788, 0, 24);
        if (class129.field1481 == null) {
            return;
        }
        try {
            class129.field1481.method5702(0L);
            class129.field1481.method5721(arg0.field4153, arg1, 24);
        } catch (Exception var4) {
        }
    }

    @ObfuscatedName("client.kg(I)Llw;")
    public class327 method999() {
        return Statics.field1374 == null ? null : Statics.field1374.field1183;
    }

    @ObfuscatedName("n.kk(IIIZI)V")
    public static void method79(int arg0, int arg1, int arg2, boolean arg3) {
        class205 var4 = class205.method4631(class203.field2239, field649.field1385);
        var4.field2342.method5934(arg2);
        var4.field2342.method5853(arg1);
        var4.field2342.method5842(arg3 ? field685 : 0);
        var4.field2342.method6047(arg0);
        field649.method2099(var4);
    }

    @ObfuscatedName("cd.ki(IS)V")
    public static void method1902(int arg0) {
        field678 = arg0;
    }

    @ObfuscatedName("n.le(B)V")
    public static void method75() {
        if (field678 == 1) {
            field686 = true;
        }
    }

    @ObfuscatedName("hv.lu(B)V")
    public static void method3635() {
        if (!field686 || Statics.field1374 == null) {
            return;
        }
        int var0 = Statics.field1374.field1265[0];
        int var1 = Statics.field1374.field1266[0];
        if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) {
            return;
        }
        Statics.field48 = Statics.field1374.field1232;
        int var2 = method2142(Statics.field1374.field1232, Statics.field1374.field1210, Statics.field201) - field870;
        if (var2 < Statics.field3545) {
            Statics.field3545 = var2;
        }
        Statics.field1359 = Statics.field1374.field1210;
        field686 = false;
    }

    @ObfuscatedName("o.la(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method15(String arg0) {
        class248[] var1 = class248.method3344();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class248 var3 = var1[var2];
            if (var3.field3224 != -1 && arg0.startsWith(class106.method5315(var3.field3224))) {
                arg0 = arg0.substring(6 + Integer.toString(var3.field3224).length());
                break;
            }
        }
        return arg0;
    }

    @ObfuscatedName("dt.lx(I)V")
    public static void method2233() {
        if (Statics.field1332 == null) {
            return;
        }
        field624 = field611;
        Statics.field1332.method4104();
        for (int var0 = 0; var0 < field849.length; var0++) {
            if (field849[var0] != null) {
                Statics.field1332.method4103((field849[var0].field1232 >> 7) + Statics.field1795, (field849[var0].field1210 >> 7) + Statics.field1892);
            }
        }
    }
}

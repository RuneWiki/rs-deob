package deob;

import com.jagex.oldscape.pub.OAuthApi;
import com.jagex.oldscape.pub.OtlTokenRequester;
import com.jagex.oldscape.pub.OtlTokenResponse;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Future;

public final class client extends class32 implements class349, OAuthApi {

    @ObfuscatedName("client.w")
    public static class184[] field518 = new class184[4];

    @ObfuscatedName("client.am")
    public static boolean field593 = true;

    @ObfuscatedName("client.be")
    public static int field496 = 1;

    @ObfuscatedName("client.bt")
    public static int field770 = 0;

    @ObfuscatedName("client.bz")
    public static int field539 = 0;

    @ObfuscatedName("client.bg")
    public static boolean field669 = false;

    @ObfuscatedName("client.bm")
    public static boolean field500 = false;

    @ObfuscatedName("client.bb")
    public static int field700 = -1;

    @ObfuscatedName("client.br")
    public static int field502 = -1;

    @ObfuscatedName("client.bh")
    public static int field503 = -1;

    @ObfuscatedName("client.bf")
    public static boolean field544 = false;

    @ObfuscatedName("client.cf")
    public static int field731 = 0;

    @ObfuscatedName("client.ce")
    public static boolean field506 = true;

    @ObfuscatedName("client.cv")
    public static int field682 = 0;

    @ObfuscatedName("client.ds")
    public static long field508 = 1L;

    @ObfuscatedName("client.df")
    public static int field509 = -1;

    @ObfuscatedName("client.db")
    public static int field510 = -1;

    @ObfuscatedName("client.dr")
    public static long field652 = -1L;

    @ObfuscatedName("client.dq")
    public static boolean field512 = true;

    @ObfuscatedName("client.dj")
    public static boolean field592 = false;

    @ObfuscatedName("client.dz")
    public static int field757 = 0;

    @ObfuscatedName("client.du")
    public static int field696 = 0;

    @ObfuscatedName("client.dm")
    public static int field726 = 0;

    @ObfuscatedName("client.di")
    public static int field517 = 0;

    @ObfuscatedName("client.dt")
    public static int field642 = 0;

    @ObfuscatedName("client.dl")
    public static int field519 = 0;

    @ObfuscatedName("client.do")
    public static int field520 = 0;

    @ObfuscatedName("client.dv")
    public static int field521 = 0;

    @ObfuscatedName("client.dh")
    public static int field522 = 0;

    @ObfuscatedName("client.dp")
    public static class94 field523 = class94.field1262;

    @ObfuscatedName("client.dd")
    public static class94 field722 = class94.field1262;

    @ObfuscatedName("client.dn")
    public static int field719 = 0;

    @ObfuscatedName("client.dc")
    public static int field627 = 0;

    @ObfuscatedName("client.dk")
    public static int field527 = 0;

    @ObfuscatedName("client.ec")
    public static int field723 = 0;

    @ObfuscatedName("client.el")
    public static int field530 = 0;

    @ObfuscatedName("client.ei")
    public static int field531 = 0;

    @ObfuscatedName("client.ek")
    public static int field532 = 0;

    @ObfuscatedName("client.fc")
    public static int field533 = 0;

    @ObfuscatedName("client.fi")
    public static class123 field534 = class123.field1496;

    @ObfuscatedName("client.fw")
    public static class425 field535 = class425.field4570;

    @ObfuscatedName("client.fq")
    public String field536;

    @ObfuscatedName("client.fh")
    public class15 field701;

    @ObfuscatedName("client.fj")
    public class20 field538;

    @ObfuscatedName("client.fo")
    public OtlTokenRequester field511;

    @ObfuscatedName("client.fd")
    public Future field540;

    @ObfuscatedName("client.fe")
    public static boolean field720 = false;

    @ObfuscatedName("client.fy")
    public static class71 field542 = new class71();

    @ObfuscatedName("client.fm")
    public class421 field543;

    @ObfuscatedName("client.gm")
    public class8 field529;

    @ObfuscatedName("client.gi")
    public static byte[] field545 = null;

    @ObfuscatedName("client.gr")
    public static class91[] field546 = new class91[32768];

    @ObfuscatedName("client.gq")
    public static int field547 = 0;

    @ObfuscatedName("client.go")
    public static int[] field548 = new int[32768];

    @ObfuscatedName("client.gy")
    public static int field549 = 0;

    @ObfuscatedName("client.ge")
    public static int[] field550 = new int[250];

    @ObfuscatedName("client.ga")
    public static final class99 field551 = new class99();

    @ObfuscatedName("client.gn")
    public static int field552 = 0;

    @ObfuscatedName("client.gp")
    public static boolean field553 = false;

    @ObfuscatedName("client.gk")
    public static boolean field554 = true;

    @ObfuscatedName("client.gu")
    public static boolean field555 = false;

    @ObfuscatedName("client.gg")
    public static class343 field556 = new class343();

    @ObfuscatedName("client.gj")
    public static HashMap field558 = new HashMap();

    @ObfuscatedName("client.he")
    public static int field499 = 0;

    @ObfuscatedName("client.hh")
    public static int field559 = 1;

    @ObfuscatedName("client.hs")
    public static int field560 = 0;

    @ObfuscatedName("client.hv")
    public static int field561 = 1;

    @ObfuscatedName("client.hm")
    public static int field622 = 0;

    @ObfuscatedName("client.hf")
    public static boolean field564 = false;

    @ObfuscatedName("client.hx")
    public static int[][][] field565 = new int[4][13][13];

    @ObfuscatedName("client.hd")
    public static final int[] field566 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.hp")
    public static int field567 = 0;

    @ObfuscatedName("client.in")
    public static int field721 = 2301979;

    @ObfuscatedName("client.im")
    public static int field569 = 5063219;

    @ObfuscatedName("client.it")
    public static String field497 = null;

    @ObfuscatedName("client.iy")
    public static int field570 = 3353893;

    @ObfuscatedName("client.ir")
    public static int field563 = 7759444;

    @ObfuscatedName("client.ic")
    public static boolean field572 = false;

    @ObfuscatedName("client.iv")
    public static int field769 = 0;

    @ObfuscatedName("client.is")
    public static int field574 = 128;

    @ObfuscatedName("client.ia")
    public static int field575 = 0;

    @ObfuscatedName("client.jh")
    public static int field568 = 0;

    @ObfuscatedName("client.jr")
    public static int field577 = 0;

    @ObfuscatedName("client.jg")
    public static int field578 = 0;

    @ObfuscatedName("client.ji")
    public static int field739 = 0;

    @ObfuscatedName("client.ju")
    public static int field580 = 0;

    @ObfuscatedName("client.jk")
    public static int field581 = 50;

    @ObfuscatedName("client.jn")
    public static int field582 = 0;

    @ObfuscatedName("client.jp")
    public static int field498 = 0;

    @ObfuscatedName("client.jm")
    public static int field584 = 0;

    @ObfuscatedName("client.je")
    public static int field781 = 12;

    @ObfuscatedName("client.js")
    public static int field571 = 6;

    @ObfuscatedName("client.jc")
    public static int field514 = 0;

    @ObfuscatedName("client.jx")
    public static boolean field588 = false;

    @ObfuscatedName("client.ja")
    public static int field678 = 0;

    @ObfuscatedName("client.jw")
    public static boolean field590 = false;

    @ObfuscatedName("client.jq")
    public static int field591 = 0;

    @ObfuscatedName("client.jv")
    public static int field766 = 0;

    @ObfuscatedName("client.jd")
    public static int field587 = 50;

    @ObfuscatedName("client.jt")
    public static int[] field594 = new int[field587];

    @ObfuscatedName("client.jo")
    public static int[] field595 = new int[field587];

    @ObfuscatedName("client.jy")
    public static int[] field596 = new int[field587];

    @ObfuscatedName("client.jz")
    public static int[] field597 = new int[field587];

    @ObfuscatedName("client.kp")
    public static int[] field664 = new int[field587];

    @ObfuscatedName("client.kh")
    public static int[] field753 = new int[field587];

    @ObfuscatedName("client.kj")
    public static int[] field600 = new int[field587];

    @ObfuscatedName("client.ka")
    public static String[] field650 = new String[field587];

    @ObfuscatedName("client.kc")
    public static int[][] field602 = new int[104][104];

    @ObfuscatedName("client.kb")
    public static int field603 = 0;

    @ObfuscatedName("client.ku")
    public static int field671 = -1;

    @ObfuscatedName("client.kn")
    public static int field605 = -1;

    @ObfuscatedName("client.kf")
    public static int field694 = 0;

    @ObfuscatedName("client.kr")
    public static int field505 = 0;

    @ObfuscatedName("client.kw")
    public static int field608 = 0;

    @ObfuscatedName("client.kv")
    public static int field621 = 0;

    @ObfuscatedName("client.kx")
    public static boolean field610 = true;

    @ObfuscatedName("client.ko")
    public static int field611 = 0;

    @ObfuscatedName("client.km")
    public static int field612 = 0;

    @ObfuscatedName("client.kz")
    public static int field613 = 0;

    @ObfuscatedName("client.ki")
    public static int field579 = 0;

    @ObfuscatedName("client.kq")
    public static int field615 = 0;

    @ObfuscatedName("client.kk")
    public static int field616 = 0;

    @ObfuscatedName("client.ke")
    public static boolean field617 = false;

    @ObfuscatedName("client.kl")
    public static int field618 = 0;

    @ObfuscatedName("client.kt")
    public static int field659 = 0;

    @ObfuscatedName("client.la")
    public static boolean field620 = true;

    @ObfuscatedName("client.ld")
    public static class83[] field619 = new class83[2048];

    @ObfuscatedName("client.lq")
    public static int field576 = -1;

    @ObfuscatedName("client.lk")
    public static int field773 = 0;

    @ObfuscatedName("client.lr")
    public static boolean field638 = true;

    @ObfuscatedName("client.lo")
    public static int field513 = 0;

    @ObfuscatedName("client.ls")
    public static int field626 = 0;

    @ObfuscatedName("client.lc")
    public static int[] field684 = new int[1000];

    @ObfuscatedName("client.lp")
    public static final int[] field628 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.ln")
    public static String[] field629 = new String[8];

    @ObfuscatedName("client.li")
    public static boolean[] field630 = new boolean[8];

    @ObfuscatedName("client.lv")
    public static int[] field631 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.ly")
    public static int field632 = -1;

    @ObfuscatedName("client.lw")
    public static class326[][][] field633 = new class326[4][104][104];

    @ObfuscatedName("client.lj")
    public static class326 field634 = new class326();

    @ObfuscatedName("client.lb")
    public static class326 field759 = new class326();

    @ObfuscatedName("client.lz")
    public static class326 field636 = new class326();

    @ObfuscatedName("client.lh")
    public static int[] field637 = new int[25];

    @ObfuscatedName("client.mh")
    public static int[] field557 = new int[25];

    @ObfuscatedName("client.mt")
    public static int[] field639 = new int[25];

    @ObfuscatedName("client.mq")
    public static int field609 = 0;

    @ObfuscatedName("client.mf")
    public static boolean field691 = false;

    @ObfuscatedName("client.mn")
    public static int field733 = 0;

    @ObfuscatedName("client.mb")
    public static int[] field528 = new int[500];

    @ObfuscatedName("client.mi")
    public static int[] field644 = new int[500];

    @ObfuscatedName("client.mp")
    public static int[] field645 = new int[500];

    @ObfuscatedName("client.ma")
    public static int[] field646 = new int[500];

    @ObfuscatedName("client.mu")
    public static String[] field624 = new String[500];

    @ObfuscatedName("client.mm")
    public static String[] field648 = new String[500];

    @ObfuscatedName("client.my")
    public static boolean[] field786 = new boolean[500];

    @ObfuscatedName("client.mz")
    public static boolean field585 = false;

    @ObfuscatedName("client.mo")
    public static boolean field651 = false;

    @ObfuscatedName("client.md")
    public static boolean field643 = false;

    @ObfuscatedName("client.mc")
    public static boolean field705 = true;

    @ObfuscatedName("client.mg")
    public static int field654 = -1;

    @ObfuscatedName("client.mr")
    public static int field655 = -1;

    @ObfuscatedName("client.nc")
    public static int field507 = 0;

    @ObfuscatedName("client.nm")
    public static int field735 = 50;

    @ObfuscatedName("client.na")
    public static int field658 = 0;

    @ObfuscatedName("client.nn")
    public static boolean field660 = false;

    @ObfuscatedName("client.ni")
    public static int field661 = -1;

    @ObfuscatedName("client.ng")
    public static int field537 = -1;

    @ObfuscatedName("client.nz")
    public static String field663 = null;

    @ObfuscatedName("client.nh")
    public static String field689 = null;

    @ObfuscatedName("client.ny")
    public static int field725 = -1;

    @ObfuscatedName("client.nt")
    public static class402 field666 = new class402(8);

    @ObfuscatedName("client.nv")
    public static int field667 = 0;

    @ObfuscatedName("client.ns")
    public static int field668 = -1;

    @ObfuscatedName("client.nx")
    public static int field625 = 0;

    @ObfuscatedName("client.nf")
    public static int field670 = 0;

    @ObfuscatedName("client.nd")
    public static class286 field526 = null;

    @ObfuscatedName("client.no")
    public static int field672 = 0;

    @ObfuscatedName("client.nl")
    public static int field673 = 0;

    @ObfuscatedName("client.ne")
    public static int field674 = 0;

    @ObfuscatedName("client.od")
    public static int field525 = -1;

    @ObfuscatedName("client.oe")
    public static boolean field676 = false;

    @ObfuscatedName("client.oh")
    public static class286 field677 = null;

    @ObfuscatedName("client.om")
    public static class286 field541 = null;

    @ObfuscatedName("client.of")
    public static class286 field679 = null;

    @ObfuscatedName("client.og")
    public static int field680 = 0;

    @ObfuscatedName("client.or")
    public static int field681 = 0;

    @ObfuscatedName("client.ov")
    public static class286 field693 = null;

    @ObfuscatedName("client.ox")
    public static boolean field683 = false;

    @ObfuscatedName("client.oc")
    public static int field607 = -1;

    @ObfuscatedName("client.on")
    public static int field562 = -1;

    @ObfuscatedName("client.oj")
    public static boolean field649 = false;

    @ObfuscatedName("client.oq")
    public static int field687 = -1;

    @ObfuscatedName("client.ou")
    public static int field688 = -1;

    @ObfuscatedName("client.ok")
    public static boolean field662 = false;

    @ObfuscatedName("client.op")
    public static int field690 = 1;

    @ObfuscatedName("client.ow")
    public static int[] field675 = new int[32];

    @ObfuscatedName("client.oy")
    public static int field692 = 0;

    @ObfuscatedName("client.oi")
    public static int[] field647 = new int[32];

    @ObfuscatedName("client.oz")
    public static int field495 = 0;

    @ObfuscatedName("client.pm")
    public static int[] field695 = new int[32];

    @ObfuscatedName("client.pp")
    public static int field641 = 0;

    @ObfuscatedName("client.pe")
    public static int[] field697 = new int[32];

    @ObfuscatedName("client.pc")
    public static int field698 = 0;

    @ObfuscatedName("client.pi")
    public static int field640 = 0;

    @ObfuscatedName("client.pl")
    public static int field601 = 0;

    @ObfuscatedName("client.ph")
    public static int field665 = 0;

    @ObfuscatedName("client.pz")
    public static int field702 = 0;

    @ObfuscatedName("client.pn")
    public static int field504 = 0;

    @ObfuscatedName("client.pu")
    public static int field704 = 0;

    @ObfuscatedName("client.pk")
    public static int field653 = 0;

    @ObfuscatedName("client.pr")
    public static int field706 = 0;

    @ObfuscatedName("client.pt")
    public static int field707 = 0;

    @ObfuscatedName("client.pa")
    public static class326 field708 = new class326();

    @ObfuscatedName("client.pj")
    public static class326 field709 = new class326();

    @ObfuscatedName("client.pv")
    public static class326 field710 = new class326();

    @ObfuscatedName("client.py")
    public static class402 field711 = new class402(512);

    @ObfuscatedName("client.pf")
    public static int field712 = 0;

    @ObfuscatedName("client.px")
    public static int field713 = -2;

    @ObfuscatedName("client.pb")
    public static boolean[] field714 = new boolean[100];

    @ObfuscatedName("client.qo")
    public static boolean[] field715 = new boolean[100];

    @ObfuscatedName("client.qq")
    public static boolean[] field716 = new boolean[100];

    @ObfuscatedName("client.qy")
    public static int[] field573 = new int[100];

    @ObfuscatedName("client.ql")
    public static int[] field718 = new int[100];

    @ObfuscatedName("client.qj")
    public static int[] field703 = new int[100];

    @ObfuscatedName("client.qx")
    public static int[] field599 = new int[100];

    @ObfuscatedName("client.qf")
    public static int field583 = 0;

    @ObfuscatedName("client.qk")
    public static long field765 = 0L;

    @ObfuscatedName("client.qe")
    public static boolean field635 = true;

    @ObfuscatedName("client.qu")
    public static int[] field724 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.qd")
    public static int field606 = 0;

    @ObfuscatedName("client.qm")
    public static int field656 = 0;

    @ObfuscatedName("client.qg")
    public static String field727 = "";

    @ObfuscatedName("client.qs")
    public static long[] field728 = new long[100];

    @ObfuscatedName("client.qw")
    public static int field729 = 0;

    @ObfuscatedName("client.qh")
    public static int field730 = 0;

    @ObfuscatedName("client.qv")
    public static int[] field685 = new int[128];

    @ObfuscatedName("client.rd")
    public static int[] field732 = new int[128];

    @ObfuscatedName("client.ri")
    public static long field686 = -1L;

    @ObfuscatedName("client.rv")
    public static class138[] field589 = new class138[2];

    @ObfuscatedName("client.rj")
    public static class147[] field717 = new class147[2];

    @ObfuscatedName("client.rq")
    public static int field736 = -1;

    @ObfuscatedName("client.rr")
    public static int field737 = 0;

    @ObfuscatedName("client.rw")
    public static int[] field738 = new int[1000];

    @ObfuscatedName("client.ra")
    public static int[] field750 = new int[1000];

    @ObfuscatedName("client.rn")
    public static class434[] field740 = new class434[1000];

    @ObfuscatedName("client.rp")
    public static int field741 = 0;

    @ObfuscatedName("client.rf")
    public static int field742 = 0;

    @ObfuscatedName("client.rc")
    public static int field743 = 0;

    @ObfuscatedName("client.ry")
    public static int field744 = -1;

    @ObfuscatedName("client.rb")
    public static boolean field745 = false;

    @ObfuscatedName("client.si")
    public static int field746 = 0;

    @ObfuscatedName("client.se")
    public static int[] field747 = new int[50];

    @ObfuscatedName("client.sf")
    public static int[] field748 = new int[50];

    @ObfuscatedName("client.sn")
    public static int[] field749 = new int[50];

    @ObfuscatedName("client.sb")
    public static int[] field598 = new int[50];

    @ObfuscatedName("client.sy")
    public static class37[] field751 = new class37[50];

    @ObfuscatedName("client.sd")
    public static boolean field752 = false;

    @ObfuscatedName("client.sa")
    public static boolean field756 = false;

    @ObfuscatedName("client.tl")
    public static boolean[] field754 = new boolean[5];

    @ObfuscatedName("client.tc")
    public static int[] field755 = new int[5];

    @ObfuscatedName("client.ti")
    public static int[] field734 = new int[5];

    @ObfuscatedName("client.tq")
    public static int[] field501 = new int[5];

    @ObfuscatedName("client.ts")
    public static int[] field758 = new int[5];

    @ObfuscatedName("client.tp")
    public static short field776 = 256;

    @ObfuscatedName("client.tb")
    public static short field760 = 205;

    @ObfuscatedName("client.tj")
    public static short field761 = 256;

    @ObfuscatedName("client.th")
    public static short field762 = 320;

    @ObfuscatedName("client.tm")
    public static short field763 = 1;

    @ObfuscatedName("client.tt")
    public static short field764 = 32767;

    @ObfuscatedName("client.te")
    public static short field657 = 1;

    @ObfuscatedName("client.tk")
    public static short field515 = 32767;

    @ObfuscatedName("client.tr")
    public static int field767 = 0;

    @ObfuscatedName("client.tu")
    public static int field768 = 0;

    @ObfuscatedName("client.tw")
    public static int field524 = 0;

    @ObfuscatedName("client.tg")
    public static int field614 = 0;

    @ObfuscatedName("client.tx")
    public static int field771 = 0;

    @ObfuscatedName("client.ta")
    public static class284 field772 = new class284();

    @ObfuscatedName("client.tz")
    public static int field586 = -1;

    @ObfuscatedName("client.tn")
    public static int field774 = -1;

    @ObfuscatedName("client.ud")
    public static class395 field775 = new class393();

    @ObfuscatedName("client.ue")
    public static class316[] field516 = new class316[8];

    @ObfuscatedName("client.ui")
    public static class60 field777 = new class60();

    @ObfuscatedName("client.ul")
    public static int field778 = -1;

    @ObfuscatedName("client.uw")
    public static ArrayList field779 = new ArrayList(10);

    @ObfuscatedName("client.uo")
    public static int field780 = 0;

    @ObfuscatedName("client.uj")
    public static int field699 = 0;

    @ObfuscatedName("client.uk")
    public static final class59 field782 = new class59();

    @ObfuscatedName("client.vn")
    public static int[] field783 = new int[50];

    @ObfuscatedName("client.vt")
    public static int[] field784 = new int[50];

    @ObfuscatedName("ih.eg(I)Lor;")
    public static class397 method4434() {
        return Statics.field3193;
    }

    @ObfuscatedName("client.ay(I)V")
    public final void method459() {
    }

    public final void init() {
        if (!this.method441()) {
            return;
        }
        for (int var1 = 0; var1 <= 27; var1++) {
            String var2 = this.getParameter(Integer.toString(var1));
            if (var2 != null) {
                switch(var1) {
                    case 1:
                        field554 = Integer.parseInt(var2) != 0;
                    case 2:
                    case 13:
                    case 16:
                    case 18:
                    case 19:
                    case 20:
                    default:
                        break;
                    case 3:
                        if (var2.equalsIgnoreCase(class92.field1251)) {
                            field669 = true;
                        } else {
                            field669 = false;
                        }
                        break;
                    case 4:
                        if (field502 == -1) {
                            field502 = Integer.parseInt(var2);
                        }
                        break;
                    case 5:
                        field770 = Integer.parseInt(var2);
                        break;
                    case 6:
                        int var3 = Integer.parseInt(var2);
                        class322 var4;
                        if (var3 >= 0 && var3 < class322.field3980.length) {
                            var4 = class322.field3980[var3];
                        } else {
                            var4 = null;
                        }
                        Statics.field1503 = var4;
                        break;
                    case 7:
                        int var5 = Integer.parseInt(var2);
                        class295[] var6 = new class295[] { class295.field3490, class295.field3488, class295.field3493, class295.field3487 };
                        class295[] var7 = var6;
                        int var8 = 0;
                        class295 var10;
                        while (true) {
                            if (var8 >= var7.length) {
                                var10 = null;
                                break;
                            }
                            class295 var9 = var7[var8];
                            if (var9.field3492 == var5) {
                                var10 = var9;
                                break;
                            }
                            var8++;
                        }
                        Statics.field3991 = var10;
                        break;
                    case 8:
                        if (var2.equalsIgnoreCase(class92.field1251)) {
                        }
                        break;
                    case 9:
                        Statics.field257 = var2;
                        break;
                    case 10:
                        Statics.field1847 = (class296) class321.method2696(class296.method4378(), Integer.parseInt(var2));
                        if (Statics.field1847 == class296.field3501) {
                            Statics.field1786 = class405.field4448;
                        } else {
                            Statics.field1786 = class405.field4455;
                        }
                        break;
                    case 11:
                        Statics.field1708 = var2;
                        break;
                    case 12:
                        field496 = Integer.parseInt(var2);
                        break;
                    case 14:
                        Statics.field1219 = Integer.parseInt(var2);
                        break;
                    case 15:
                        field539 = Integer.parseInt(var2);
                        break;
                    case 17:
                        Statics.field2547 = var2;
                        break;
                    case 21:
                        field700 = Integer.parseInt(var2);
                        break;
                    case 22:
                        field555 = Integer.parseInt(var2) != 0;
                }
            }
        }
        method2173();
        Statics.field1243 = this.getCodeBase().getHost();
        String var11 = Statics.field3991.field3491;
        byte var12 = 0;
        try {
            class154.method1783("oldschool", var11, var12, 21);
        } catch (Exception var14) {
            class445.method3452((String) null, var14);
        }
        Statics.field4489 = this;
        Statics.field4651 = field502;
        if (field503 == -1) {
            field503 = 0;
        }
        Statics.field1201 = System.getenv("JX_ACCESS_TOKEN");
        System.getenv("JX_REFRESH_TOKEN");
        this.method560(765, 503, 203);
    }

    @ObfuscatedName("co.em(I)V")
    public static final void method2173() {
        class197.field2328 = false;
        field500 = false;
    }

    public void setOtlTokenRequester(OtlTokenRequester arg0) {
        if (arg0 != null) {
            this.field511 = arg0;
            class69.method2054(10);
        }
    }

    public boolean isOnLoginScreen() {
        return field731 == 10;
    }

    @ObfuscatedName("client.eo(I)Z")
    public boolean method1217() {
        return Statics.field1201 != null && !Statics.field1201.trim().isEmpty();
    }

    @ObfuscatedName("client.ef(I)Z")
    public boolean method1132() {
        return this.field511 != null;
    }

    @ObfuscatedName("client.ec(Ljava/lang/String;I)V")
    public void method1139(String arg0) throws MalformedURLException, IOException {
        URL var2 = new URL(Statics.field1708 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
        OtlTokenRequester var3 = this.field511;
        if (var3 == null) {
            class11 var4 = new class11(var2, class10.field50);
            var4.method81("Authorization", "Bearer " + arg0);
            this.field538 = this.field701.method170(var4);
        } else {
            this.field540 = var3.request(var2);
        }
    }

    @ObfuscatedName("client.b(I)V")
    public final void method449() {
        int[] var1 = new int[] { 20, 260, 10000 };
        int[] var2 = new int[] { 1000, 100, 500 };
        if (var1 == null || var2 == null) {
            Statics.field4082 = null;
            Statics.field3873 = null;
            Statics.field1394 = (byte[][][]) null;
            class341.method5119();
        } else {
            Statics.field4082 = var1;
            Statics.field3873 = new int[var1.length];
            Statics.field1394 = new byte[var1.length][][];
            for (int var3 = 0; var3 < Statics.field4082.length; var3++) {
                Statics.field1394[var3] = new byte[var2[var3]][];
                class341.field4084.add(var1[var3]);
            }
            Collections.sort(class341.field4084);
        }
        Statics.field4124 = field539 == 0 ? 43594 : field496 + 40000;
        Statics.field3517 = field539 == 0 ? 443 : field496 + 50000;
        Statics.field3198 = Statics.field4124;
        Statics.field3237 = class285.field3251;
        Statics.field9 = class285.field3250;
        Statics.field121 = class285.field3249;
        Statics.field41 = class285.field3247;
        Statics.field24 = new class100();
        this.method531();
        this.method434();
        Statics.field3412 = this.method448();
        Statics.field90 = new class365(255, class154.field1693, class154.field1699, 500000);
        Statics.field4567 = class89.method1784();
        this.method470();
        class30.method1902(this, Statics.field2548);
        if (field539 != 0) {
            field592 = true;
        }
        method3962(Statics.field4567.field1225);
        Statics.field1606 = new class62(Statics.field1786);
        this.field701 = new class15("tokenRequest", 1, 1);
    }

    @ObfuscatedName("client.z(I)V")
    public final void method464() {
        field682++;
        this.method1078();
        class304.method4380();
        class266.method2811();
        method2572();
        class24 var1 = class24.field144;
        synchronized (class24.field144) {
            class24.field138++;
            class24.field141 = class24.field145;
            class24.field140 = 0;
            class24.field142 = 0;
            Arrays.fill(class24.field132, false);
            Arrays.fill(class24.field139, false);
            if (class24.field149 < 0) {
                Arrays.fill(class24.field131, false);
                class24.field149 = class24.field146;
            } else {
                while (class24.field149 != class24.field146) {
                    int var2 = class24.field134[class24.field146];
                    class24.field146 = class24.field146 + 1 & 0x7F;
                    if (var2 < 0) {
                        int var3 = ~var2;
                        if (class24.field131[var3]) {
                            class24.field131[var3] = false;
                            class24.field139[var3] = true;
                            class24.field126[class24.field142] = var3;
                            class24.field142++;
                        }
                    } else {
                        if (!class24.field131[var2] && class24.field140 < class24.field136.length - 1) {
                            class24.field132[var2] = true;
                            class24.field136[++class24.field140 - 1] = var2;
                        }
                        class24.field131[var2] = true;
                    }
                }
            }
            if (class24.field140 > 0) {
                class24.field138 = 0;
            }
            class24.field145 = class24.field147;
        }
        class33.method1003();
        if (Statics.field3412 != null) {
            int var5 = Statics.field3412.method307();
            field707 = var5;
        }
        if (field731 == 0) {
            Statics.method978();
            class32.method1049();
        } else if (field731 == 5) {
            class69.method2341(this, Statics.field1275);
            Statics.method978();
            class32.method1049();
        } else if (field731 == 10 || field731 == 11) {
            class69.method2341(this, Statics.field1275);
        } else if (field731 == 20) {
            class69.method2341(this, Statics.field1275);
            this.method1269();
        } else if (field731 == 50) {
            class69.method2341(this, Statics.field1275);
            this.method1269();
        } else if (field731 == 25) {
            method611();
        }
        if (field731 == 30) {
            this.method1212();
        } else if (field731 == 40 || field731 == 45) {
            this.method1269();
        }
    }

    @ObfuscatedName("client.ap(ZI)V")
    public final void method451(boolean arg0) {
        boolean var2;
        label143: {
            try {
                if (class266.field3108 == 2) {
                    if (Statics.field3111 == null) {
                        Statics.field3111 = class271.method4739(Statics.field3105, Statics.field3110, Statics.field1629);
                        if (Statics.field3111 == null) {
                            var2 = false;
                            break label143;
                        }
                    }
                    if (Statics.field1707 == null) {
                        Statics.field1707 = new class43(Statics.field1349, Statics.field3107);
                    }
                    if (Statics.field3109.method4548(Statics.field3111, Statics.field3106, Statics.field1707, 22050)) {
                        Statics.field3109.method4549();
                        Statics.field3109.method4546(Statics.field1828);
                        Statics.field3109.method4551(Statics.field3111, Statics.field3154);
                        class266.field3108 = 0;
                        Statics.field3111 = null;
                        Statics.field1707 = null;
                        Statics.field3105 = null;
                        var2 = true;
                        break label143;
                    }
                }
            } catch (Exception var10) {
                var10.printStackTrace();
                Statics.field3109.method4552();
                class266.field3108 = 0;
                Statics.field3111 = null;
                Statics.field1707 = null;
                Statics.field3105 = null;
            }
            var2 = false;
        }
        if (var2 && field745 && Statics.field2961 != null) {
            Statics.field2961.method707();
        }
        if ((field731 == 10 || field731 == 20 || field731 == 30) && field765 != 0L && class262.method4787() > field765) {
            method3962(method5641());
        }
        if (arg0) {
            for (int var5 = 0; var5 < 100; var5++) {
                field714[var5] = true;
            }
        }
        if (field731 == 0) {
            this.method453(class69.field900, class69.field899, arg0);
        } else if (field731 == 5) {
            class69.method1649(Statics.field4479, Statics.field10, Statics.field1275);
        } else if (field731 == 10 || field731 == 11) {
            class69.method1649(Statics.field4479, Statics.field10, Statics.field1275);
        } else if (field731 == 20) {
            class69.method1649(Statics.field4479, Statics.field10, Statics.field1275);
        } else if (field731 == 50) {
            class69.method1649(Statics.field4479, Statics.field10, Statics.field1275);
        } else if (field731 == 25) {
            if (field622 == 1) {
                if (field499 > field559) {
                    field559 = field499;
                }
                int var6 = (field559 * 50 - field499 * 50) / field559;
                method4786(class300.field3535 + class92.field1255 + class92.field1257 + var6 + "%" + class92.field1253, false);
            } else if (field622 == 2) {
                if (field560 > field561) {
                    field561 = field560;
                }
                int var7 = (field561 * 50 - field560 * 50) / field561 + 50;
                method4786(class300.field3535 + class92.field1255 + class92.field1257 + var7 + "%" + class92.field1253, false);
            } else {
                method4786(class300.field3535, false);
            }
        } else if (field731 == 30) {
            this.method1063();
        } else if (field731 == 40) {
            method4786(class300.field3536 + class92.field1255 + class300.field3675, false);
        } else if (field731 == 45) {
            method4786(class300.field3695, false);
        }
        if (field731 == 30 && field583 == 0 && !arg0 && !field635) {
            for (int var8 = 0; var8 < field712; var8++) {
                if (field715[var8]) {
                    Statics.field309.method417(field573[var8], field718[var8], field703[var8], field599[var8]);
                    field715[var8] = false;
                }
            }
        } else if (field731 > 0) {
            Statics.field309.method427(0, 0);
            for (int var9 = 0; var9 < field712; var9++) {
                field715[var9] = false;
            }
        }
    }

    @ObfuscatedName("client.af(B)V")
    public final void method439() {
        if (Statics.field1702.method2201()) {
            Statics.field1702.method2212();
        }
        if (Statics.field1329 != null) {
            Statics.field1329.field1064 = false;
        }
        Statics.field1329 = null;
        field551.method2270();
        if (class24.field144 != null) {
            class24 var1 = class24.field144;
            synchronized (class24.field144) {
                class24.field144 = null;
            }
        }
        if (class33.field228 != null) {
            class33 var3 = class33.field228;
            synchronized (class33.field228) {
                class33.field228 = null;
            }
        }
        Statics.field3412 = null;
        if (Statics.field2961 != null) {
            Statics.field2961.method708();
        }
        if (Statics.field242 != null) {
            Statics.field242.method708();
        }
        if (Statics.field3916 != null) {
            Statics.field3916.method2780();
        }
        class304.method4512();
        if (Statics.field24 != null) {
            Statics.field24.method2288();
            Statics.field24 = null;
        }
        try {
            class154.field1693.method6502();
            for (int var5 = 0; var5 < Statics.field1692; var5++) {
                Statics.field1891[var5].method6502();
            }
            class154.field1699.method6502();
            class154.field1697.method6502();
        } catch (Exception var9) {
        }
        this.field701.method165();
    }

    @ObfuscatedName("dz.ex(II)V")
    public static void method2405(int arg0) {
        if (field731 == arg0) {
            return;
        }
        if (field731 == 0) {
            Statics.field4489.method445();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45 || arg0 == 50) {
            method3973(0);
            field531 = 0;
            field532 = 0;
            field556.method5656(arg0);
            if (arg0 != 20) {
                method5711(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field1700 != null) {
            Statics.field1700.method2780();
            Statics.field1700 = null;
        }
        if (field731 == 25) {
            field622 = 0;
            field499 = 0;
            field559 = 1;
            field560 = 0;
            field561 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            int var2 = method3568() ? 0 : 12;
            class69.method2073(Statics.field2258, Statics.field481, true, var2);
        } else if (arg0 == 20) {
            int var1 = field731 == 11 ? 4 : 0;
            class69.method2073(Statics.field2258, Statics.field481, false, var1);
        } else if (arg0 == 11) {
            class69.method2073(Statics.field2258, Statics.field481, false, 4);
        } else if (arg0 == 50) {
            class69.method2337("", "Updating date of birth...", "");
            class69.method2073(Statics.field2258, Statics.field481, false, 7);
        } else {
            class69.method5252();
        }
        field731 = arg0;
    }

    @ObfuscatedName("client.el(I)V")
    public void method1078() {
        if (field731 == 1000) {
            return;
        }
        long var1 = class262.method4787();
        int var3 = (int) (var1 - Statics.field3912);
        Statics.field3912 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class308.field3924 += var3;
        boolean var4;
        if (class308.field3913 == 0 && class308.field3918 == 0 && class308.field3920 == 0 && class308.field3921 == 0) {
            var4 = true;
        } else if (Statics.field3916 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class308.field3924 > 30000) {
                        throw new IOException();
                    }
                    while (class308.field3918 < 200 && class308.field3921 > 0) {
                        class306 var5 = (class306) class308.field3915.method6463();
                        class421 var6 = new class421(4);
                        var6.method6644(1);
                        var6.method6703((int) var5.field4301);
                        Statics.field3916.method2788(var6.field4511, 0, 4);
                        class308.field3917.method6455(var5, var5.field4301);
                        class308.field3921--;
                        class308.field3918++;
                    }
                    while (class308.field3913 < 200 && class308.field3920 > 0) {
                        class306 var7 = (class306) class308.field3919.method5255();
                        class421 var8 = new class421(4);
                        var8.method6644(0);
                        var8.method6703((int) var7.field4301);
                        Statics.field3916.method2788(var8.field4511, 0, 4);
                        var7.method6163();
                        class308.field3922.method6455(var7, var7.field4301);
                        class308.field3920--;
                        class308.field3913++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field3916.method2810();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class308.field3924 = 0;
                        byte var11 = 0;
                        if (Statics.field110 == null) {
                            var11 = 8;
                        } else if (class308.field3927 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class308.field3925.field4512;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field3916.method2781(class308.field3925.field4511, class308.field3925.field4512, var12);
                            if (class308.field3930 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class308.field3925.field4511[class308.field3925.field4512 + var13] ^= class308.field3930;
                                }
                            }
                            class308.field3925.field4512 += var12;
                            if (class308.field3925.field4512 < var11) {
                                break;
                            }
                            if (Statics.field110 == null) {
                                class308.field3925.field4512 = 0;
                                int var14 = class308.field3925.method6686();
                                int var15 = class308.field3925.method6666();
                                int var16 = class308.field3925.method6686();
                                int var17 = class308.field3925.method6669();
                                long var18 = (long) ((var14 << 16) + var15);
                                class306 var20 = (class306) class308.field3917.method6456(var18);
                                Statics.field3923 = true;
                                if (var20 == null) {
                                    var20 = (class306) class308.field3922.method6456(var18);
                                    Statics.field3923 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field110 = var20;
                                Statics.field3926 = new class421(var17 + var21 + Statics.field110.field3892);
                                Statics.field3926.method6644(var16);
                                Statics.field3926.method6650(var17);
                                class308.field3927 = 8;
                                class308.field3925.field4512 = 0;
                            } else if (class308.field3927 == 0) {
                                if (class308.field3925.field4511[0] == -1) {
                                    class308.field3927 = 1;
                                    class308.field3925.field4512 = 0;
                                } else {
                                    Statics.field110 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field3926.field4511.length - Statics.field110.field3892;
                            int var23 = 512 - class308.field3927;
                            if (var23 > var22 - Statics.field3926.field4512) {
                                var23 = var22 - Statics.field3926.field4512;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field3916.method2781(Statics.field3926.field4511, Statics.field3926.field4512, var23);
                            if (class308.field3930 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field3926.field4511[Statics.field3926.field4512 + var24] ^= class308.field3930;
                                }
                            }
                            Statics.field3926.field4512 += var23;
                            class308.field3927 += var23;
                            if (Statics.field3926.field4512 == var22) {
                                if (Statics.field110.field4301 == 16711935L) {
                                    Statics.field4123 = Statics.field3926;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class305 var26 = class308.field3929[var25];
                                        if (var26 != null) {
                                            Statics.field4123.field4512 = var25 * 8 + 5;
                                            int var27 = Statics.field4123.method6669();
                                            int var28 = Statics.field4123.method6669();
                                            var26.method4979(var27, var28);
                                        }
                                    }
                                } else {
                                    class308.field3928.reset();
                                    class308.field3928.update(Statics.field3926.field4511, 0, var22);
                                    int var29 = (int) class308.field3928.getValue();
                                    if (Statics.field110.field3889 != var29) {
                                        try {
                                            Statics.field3916.method2780();
                                        } catch (Exception var35) {
                                        }
                                        class308.field3931++;
                                        Statics.field3916 = null;
                                        class308.field3930 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class308.field3931 = 0;
                                    class308.field3932 = 0;
                                    Statics.field110.field3890.method4980((int) (Statics.field110.field4301 & 0xFFFFL), Statics.field3926.field4511, (Statics.field110.field4301 & 0xFF0000L) == 16711680L, Statics.field3923);
                                }
                                Statics.field110.method6167();
                                if (Statics.field3923) {
                                    class308.field3918--;
                                } else {
                                    class308.field3913--;
                                }
                                class308.field3927 = 0;
                                Statics.field110 = null;
                                Statics.field3926 = null;
                            } else {
                                if (class308.field3927 != 512) {
                                    break;
                                }
                                class308.field3927 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field3916.method2780();
                } catch (Exception var34) {
                }
                class308.field3932++;
                Statics.field3916 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method1469();
        }
    }

    @ObfuscatedName("client.ei(I)V")
    public void method1469() {
        if (class308.field3931 >= 4) {
            this.method455("js5crc");
            method2405(1000);
            return;
        }
        if (class308.field3932 >= 4) {
            if (field731 <= 5) {
                this.method455("js5io");
                method2405(1000);
                return;
            }
            field527 = 3000;
            class308.field3932 = 3;
        }
        if (--field527 + 1 > 0) {
            return;
        }
        try {
            if (field627 == 0) {
                Statics.field4428 = Statics.field203.method2748(Statics.field1243, Statics.field3198);
                field627++;
            }
            if (field627 == 1) {
                if (Statics.field4428.field1738 == 2) {
                    this.method1061(-1);
                    return;
                }
                if (Statics.field4428.field1738 == 1) {
                    field627++;
                }
            }
            if (field627 == 2) {
                if (field554) {
                    Socket var1 = (Socket) Statics.field4428.field1732;
                    class362 var2 = new class362(var1, 40000, 5000);
                    Statics.field2790 = var2;
                } else {
                    Statics.field2790 = new class157((Socket) Statics.field4428.field1732, Statics.field203, 5000);
                }
                class421 var3 = new class421(5);
                var3.method6644(15);
                var3.method6650(203);
                Statics.field2790.method2788(var3.field4511, 0, 5);
                field627++;
                Statics.field1348 = class262.method4787();
            }
            if (field627 == 3) {
                if (Statics.field2790.method2810() > 0 || !field554 && field731 <= 5) {
                    int var4 = Statics.field2790.method2782();
                    if (var4 != 0) {
                        this.method1061(var4);
                        return;
                    }
                    field627++;
                } else if (class262.method4787() - Statics.field1348 > 30000L) {
                    this.method1061(-2);
                    return;
                }
            }
            if (field627 == 4) {
                class361 var5 = Statics.field2790;
                boolean var6 = field731 > 20;
                if (Statics.field3916 != null) {
                    try {
                        Statics.field3916.method2780();
                    } catch (Exception var16) {
                    }
                    Statics.field3916 = null;
                }
                Statics.field3916 = var5;
                class308.method2310(var6);
                class308.field3925.field4512 = 0;
                Statics.field110 = null;
                Statics.field3926 = null;
                class308.field3927 = 0;
                while (true) {
                    class306 var8 = (class306) class308.field3917.method6463();
                    if (var8 == null) {
                        while (true) {
                            class306 var9 = (class306) class308.field3922.method6463();
                            if (var9 == null) {
                                if (class308.field3930 != 0) {
                                    try {
                                        class421 var10 = new class421(4);
                                        var10.method6644(4);
                                        var10.method6644(class308.field3930);
                                        var10.method6757(0);
                                        Statics.field3916.method2788(var10.field4511, 0, 4);
                                    } catch (IOException var15) {
                                        try {
                                            Statics.field3916.method2780();
                                        } catch (Exception var14) {
                                        }
                                        class308.field3932++;
                                        Statics.field3916 = null;
                                    }
                                }
                                class308.field3924 = 0;
                                Statics.field3912 = class262.method4787();
                                Statics.field4428 = null;
                                Statics.field2790 = null;
                                field627 = 0;
                                field723 = 0;
                                return;
                            }
                            class308.field3919.method5259(var9);
                            class308.field3914.method6455(var9, var9.field4301);
                            class308.field3920++;
                            class308.field3913--;
                        }
                    }
                    class308.field3915.method6455(var8, var8.field4301);
                    class308.field3921++;
                    class308.field3918--;
                }
            }
        } catch (IOException var17) {
            this.method1061(-3);
        }
    }

    @ObfuscatedName("client.ek(II)V")
    public void method1061(int arg0) {
        Statics.field4428 = null;
        Statics.field2790 = null;
        field627 = 0;
        if (Statics.field4124 == Statics.field3198) {
            Statics.field3198 = Statics.field3517;
        } else {
            Statics.field3198 = Statics.field4124;
        }
        field723++;
        if (field723 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field731 <= 5) {
                this.method455("js5connect_full");
                method2405(1000);
            } else {
                field527 = 3000;
            }
        } else if (field723 >= 2 && arg0 == 6) {
            this.method455("js5connect_outofdate");
            method2405(1000);
        } else if (field723 >= 4) {
            if (field731 <= 5) {
                this.method455("js5connect");
                method2405(1000);
            } else {
                field527 = 3000;
            }
        }
    }

    @ObfuscatedName("hp.fc(Lkz;Ljava/lang/String;I)V")
    public static void method4347(class305 arg0, String arg1) {
        class77 var2 = new class77(arg0, arg1);
        field779.add(var2);
        field699 += var2.field1014;
    }

    @ObfuscatedName("cq.fi(I)I")
    public static int method2069() {
        if (field779 == null || field780 >= field779.size()) {
            return 10000;
        }
        int var0 = 0;
        for (int var1 = 0; var1 <= field780; var1++) {
            var0 += ((class77) field779.get(var1)).field1015;
        }
        return var0 * 10000 / field699;
    }

    @ObfuscatedName("fc.fw(III)V")
    public static void method2802(int arg0, int arg1) {
        int[] var2 = new int[9];
        for (int var3 = 0; var3 < var2.length; var3++) {
            int var4 = var3 * 32 + 128 + 15;
            int var5 = var4 * 3 + 600;
            int var7 = class194.field2271[var4];
            int var8 = method2944(var5, arg1);
            var2[var3] = var7 * var8 >> 16;
        }
        class197.method3638(var2, 500, 800, arg0 * 334 / arg1, 334);
    }

    @ObfuscatedName("es.ff(IZZZI)Lkz;")
    public static class305 method2695(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class365 var4 = null;
        if (class154.field1693 != null) {
            var4 = new class365(arg0, class154.field1693, Statics.field1891[arg0], 1000000);
        }
        return new class305(var4, Statics.field90, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.fu(I)V")
    public final void method1269() {
        class361 var1 = field551.method2271();
        class420 var2 = field551.field1318;
        try {
            if (field530 == 0) {
                if (Statics.field1638 == null && (field542.method1881() || field531 > 250)) {
                    Statics.field1638 = field542.method1877();
                    field542.method1875();
                    field542 = null;
                }
                if (Statics.field1638 != null) {
                    if (var1 != null) {
                        var1.method2780();
                        var1 = null;
                    }
                    Statics.field3891 = null;
                    field553 = false;
                    field531 = 0;
                    if (field535.method6923()) {
                        try {
                            this.method1139(Statics.field1201);
                            method3973(20);
                        } catch (Throwable var74) {
                            class445.method3452((String) null, var74);
                            method4296(65);
                            return;
                        }
                    } else {
                        method3973(1);
                    }
                }
            }
            if (field530 == 20) {
                if (this.field540 == null) {
                    if (this.field538 == null) {
                        method4296(65);
                        return;
                    }
                    if (!this.field538.method279()) {
                        return;
                    }
                    if (this.field538.method269()) {
                        class445.method3452(this.field538.method268(), (Throwable) null);
                        method4296(65);
                        this.field538 = null;
                        return;
                    }
                    class22 var6 = this.field538.method270();
                    if (var6.method290() != 200) {
                        class445.method3452("Response code: " + var6.method290() + "Response body: " + var6.method291(), (Throwable) null);
                        method4296(65);
                        this.field538 = null;
                        return;
                    }
                    this.field536 = var6.method291();
                    this.field538 = null;
                } else if (this.field540.isDone()) {
                    if (this.field540.isCancelled()) {
                        method4296(65);
                        this.field540 = null;
                        return;
                    }
                    try {
                        OtlTokenResponse var4 = (OtlTokenResponse) this.field540.get();
                        if (!var4.isSuccess()) {
                            method4296(65);
                            this.field540 = null;
                            return;
                        }
                        this.field536 = var4.getToken();
                        this.field540 = null;
                    } catch (Exception var73) {
                        class445.method3452((String) null, var73);
                        method4296(65);
                        this.field540 = null;
                        return;
                    }
                } else {
                    return;
                }
                field531 = 0;
                method3973(1);
            }
            if (field530 == 1) {
                if (Statics.field3891 == null) {
                    Statics.field3891 = Statics.field203.method2748(Statics.field1243, Statics.field3198);
                }
                if (Statics.field3891.field1738 == 2) {
                    throw new IOException();
                }
                if (Statics.field3891.field1738 == 1) {
                    if (field554) {
                        Socket var7 = (Socket) Statics.field3891.field1732;
                        class362 var8 = new class362(var7, 40000, 5000);
                        var1 = var8;
                    } else {
                        var1 = new class157((Socket) Statics.field3891.field1732, Statics.field203, 5000);
                    }
                    field551.method2278(var1);
                    Statics.field3891 = null;
                    method3973(2);
                }
            }
            if (field530 == 2) {
                field551.method2266();
                class257 var9;
                if (class257.field2956 == 0) {
                    var9 = new class257();
                } else {
                    var9 = class257.field2959[--class257.field2956];
                }
                var9.field2958 = null;
                var9.field2955 = 0;
                var9.field2960 = new class420(5000);
                var9.field2960.method6644(class259.field3065.field3070);
                field551.method2268(var9);
                field551.method2267();
                var2.field4512 = 0;
                method3973(3);
            }
            if (field530 == 3) {
                if (Statics.field2961 != null) {
                    Statics.field2961.method706();
                }
                if (Statics.field242 != null) {
                    Statics.field242.method706();
                }
                boolean var13 = true;
                if (field554 && !var1.method2784(1)) {
                    var13 = false;
                }
                if (var13) {
                    int var14 = var1.method2782();
                    if (Statics.field2961 != null) {
                        Statics.field2961.method706();
                    }
                    if (Statics.field242 != null) {
                        Statics.field242.method706();
                    }
                    if (var14 != 0) {
                        method4296(var14);
                        return;
                    }
                    var2.field4512 = 0;
                    method3973(4);
                }
            }
            if (field530 == 4) {
                if (var2.field4512 < 8) {
                    int var15 = var1.method2810();
                    if (var15 > 8 - var2.field4512) {
                        var15 = 8 - var2.field4512;
                    }
                    if (var15 > 0) {
                        var1.method2781(var2.field4511, var2.field4512, var15);
                        var2.field4512 += var15;
                    }
                }
                if (var2.field4512 == 8) {
                    var2.field4512 = 0;
                    Statics.field160 = var2.method6670();
                    method3973(5);
                }
            }
            if (field530 == 5) {
                field551.field1318.field4512 = 0;
                field551.method2266();
                class420 var16 = new class420(500);
                int[] var17 = new int[] { Statics.field1638.nextInt(), Statics.field1638.nextInt(), Statics.field1638.nextInt(), Statics.field1638.nextInt() };
                var16.field4512 = 0;
                var16.method6644(1);
                var16.method6650(var17[0]);
                var16.method6650(var17[1]);
                var16.method6650(var17[2]);
                var16.method6650(var17[3]);
                var16.method6778(Statics.field160);
                if (field731 == 40) {
                    var16.method6650(Statics.field2598[0]);
                    var16.method6650(Statics.field2598[1]);
                    var16.method6650(Statics.field2598[2]);
                    var16.method6650(Statics.field2598[3]);
                } else {
                    if (field731 == 50) {
                        var16.method6644(class123.field1498.method38());
                        var16.method6650(Statics.field2400);
                    } else {
                        var16.method6644(field534.method38());
                        switch(field534.field1494) {
                            case 0:
                                LinkedHashMap var19 = Statics.field4567.field1233;
                                String var20 = class69.field902;
                                int var21 = var20.length();
                                int var22 = 0;
                                for (int var23 = 0; var23 < var21; var23++) {
                                    var22 = (var22 << 5) - var22 + var20.charAt(var23);
                                }
                                var16.method6650((Integer) var19.get(var22));
                                break;
                            case 1:
                            case 3:
                                var16.method6703(Statics.field2589);
                                var16.field4512++;
                            case 2:
                            default:
                                break;
                            case 4:
                                var16.field4512 += 4;
                        }
                    }
                    if (field535.method6923()) {
                        var16.method6644(class425.field4562.method38());
                        var16.method6654(this.field536);
                    } else {
                        var16.method6644(class425.field4570.method38());
                        var16.method6654(class69.field910);
                    }
                }
                var16.method6677(class68.field887, class68.field886);
                Statics.field2598 = var17;
                class257 var25;
                if (class257.field2956 == 0) {
                    var25 = new class257();
                } else {
                    var25 = class257.field2959[--class257.field2956];
                }
                var25.field2958 = null;
                var25.field2955 = 0;
                var25.field2960 = new class420(5000);
                var25.field2960.field4512 = 0;
                if (field731 == 40) {
                    var25.field2960.method6644(class259.field3066.field3070);
                } else {
                    var25.field2960.method6644(class259.field3068.field3070);
                }
                var25.field2960.method6757(0);
                int var29 = var25.field2960.field4512;
                var25.field2960.method6650(203);
                var25.field2960.method6650(1);
                var25.field2960.method6644(field502);
                var25.field2960.method6644(field503);
                var25.field2960.method6657(var16.field4511, 0, var16.field4512);
                int var30 = var25.field2960.field4512;
                var25.field2960.method6654(class69.field902);
                var25.field2960.method6644((field635 ? 1 : 0) << 1 | (field500 ? 1 : 0));
                var25.field2960.method6757(Statics.field3209);
                var25.field2960.method6757(Statics.field1246);
                class420 var31 = var25.field2960;
                if (field545 == null) {
                    byte[] var32 = class154.method328();
                    var31.method6657(var32, 0, var32.length);
                } else {
                    var31.method6657(field545, 0, field545.length);
                }
                var25.field2960.method6654(Statics.field257);
                var25.field2960.method6650(Statics.field1219);
                class421 var33 = new class421(Statics.field243.method6192());
                Statics.field243.method6188(var33);
                var25.field2960.method6657(var33.field4511, 0, var33.field4511.length);
                var25.field2960.method6644(field502);
                var25.field2960.method6650(0);
                var25.field2960.method6747(Statics.field2828.field3908);
                var25.field2960.method6650(Statics.field332.field3908);
                var25.field2960.method6747(Statics.field1742.field3908);
                var25.field2960.method6747(Statics.field4426.field3908);
                var25.field2960.method6783(Statics.field2646.field3908);
                var25.field2960.method6747(Statics.field30.field3908);
                var25.field2960.method6783(0);
                var25.field2960.method6783(Statics.field2607.field3908);
                var25.field2960.method6783(Statics.field4446.field3908);
                var25.field2960.method6860(Statics.field2241.field3908);
                var25.field2960.method6747(Statics.field2609.field3908);
                var25.field2960.method6783(Statics.field623.field3908);
                var25.field2960.method6860(Statics.field481.field3908);
                var25.field2960.method6747(Statics.field604.field3908);
                var25.field2960.method6650(Statics.field1336.field3908);
                var25.field2960.method6783(Statics.field1671.field3908);
                var25.field2960.method6860(Statics.field1296.field3908);
                var25.field2960.method6650(Statics.field1805.field3908);
                var25.field2960.method6650(Statics.field4152.field3908);
                var25.field2960.method6650(Statics.field2258.field3908);
                var25.field2960.method6783(Statics.field58.field3908);
                var25.field2960.method6843(var17, var30, var25.field2960.field4512);
                var25.field2960.method6660(var25.field2960.field4512 - var29);
                field551.method2268(var25);
                field551.method2267();
                field551.field1319 = new class437(var17);
                int[] var34 = new int[4];
                for (int var35 = 0; var35 < 4; var35++) {
                    var34[var35] = var17[var35] + 50;
                }
                var2.method6608(var34);
                method3973(6);
            }
            if (field530 == 6 && var1.method2810() > 0) {
                int var36 = var1.method2782();
                if (var36 == 61) {
                    int var37 = var1.method2810();
                    Statics.field3086 = var37 == 1 && var1.method2782() == 1;
                    method3973(5);
                }
                if (var36 == 21 && field731 == 20) {
                    method3973(12);
                } else if (var36 == 2) {
                    method3973(14);
                } else if (var36 == 15 && field731 == 40) {
                    field551.field1320 = -1;
                    method3973(19);
                } else if (var36 == 64) {
                    method3973(10);
                } else if (var36 == 23 && field532 < 1) {
                    field532++;
                    method3973(0);
                } else if (var36 == 29) {
                    method3973(17);
                } else if (var36 == 69) {
                    method3973(7);
                } else {
                    method4296(var36);
                    return;
                }
            }
            if (field530 == 7 && var1.method2810() >= 2) {
                var1.method2781(var2.field4511, 0, 2);
                var2.field4512 = 0;
                Statics.field956 = var2.method6666();
                method3973(8);
            }
            if (field530 == 8 && var1.method2810() >= Statics.field956) {
                var2.field4512 = 0;
                var1.method2781(var2.field4511, var2.field4512, Statics.field956);
                class7[] var38 = new class7[] { class7.field28 };
                class7 var39 = var38[var2.method6686()];
                try {
                    class4 var40 = class5.method2627(var39);
                    this.field529 = new class8(var2, var40);
                    method3973(9);
                } catch (Exception var72) {
                    method4296(22);
                    return;
                }
            }
            if (field530 == 9 && this.field529.method42()) {
                this.field543 = this.field529.method44();
                this.field529.method43();
                this.field529 = null;
                if (this.field543 == null) {
                    method4296(22);
                    return;
                }
                field551.method2266();
                class257 var42;
                if (class257.field2956 == 0) {
                    var42 = new class257();
                } else {
                    var42 = class257.field2959[--class257.field2956];
                }
                var42.field2958 = null;
                var42.field2955 = 0;
                var42.field2960 = new class420(5000);
                var42.field2960.method6644(class259.field3067.field3070);
                var42.field2960.method6757(this.field543.field4512);
                var42.field2960.method6658(this.field543);
                field551.method2268(var42);
                field551.method2267();
                this.field543 = null;
                method3973(6);
            }
            if (field530 == 10 && var1.method2810() > 0) {
                Statics.field2535 = var1.method2782();
                method3973(11);
            }
            if (field530 == 11 && var1.method2810() >= Statics.field2535) {
                var1.method2781(var2.field4511, 0, Statics.field2535);
                var2.field4512 = 0;
                method3973(6);
            }
            if (field530 == 12 && var1.method2810() > 0) {
                field533 = (var1.method2782() + 3) * 60;
                method3973(13);
            }
            if (field530 == 13) {
                field531 = 0;
                class69.method2337(class300.field3714, class300.field3567, field533 / 60 + class300.field3568);
                if (--field533 <= 0) {
                    method3973(0);
                }
            } else {
                if (field530 == 14 && var1.method2810() >= 1) {
                    Statics.field1573 = var1.method2782();
                    method3973(15);
                }
                if (field530 == 15 && var1.method2810() >= Statics.field1573) {
                    boolean var46 = var1.method2782() == 1;
                    var1.method2781(var2.field4511, 0, 4);
                    var2.field4512 = 0;
                    boolean var47 = false;
                    if (var46) {
                        int var48 = var2.method6611() << 24;
                        int var49 = var48 | var2.method6611() << 16;
                        int var50 = var49 | var2.method6611() << 8;
                        int var51 = var50 | var2.method6611();
                        String var52 = class69.field902;
                        int var53 = var52.length();
                        int var54 = 0;
                        int var55 = 0;
                        while (true) {
                            if (var55 >= var53) {
                                if (Statics.field4567.field1233.size() >= 10 && !Statics.field4567.field1233.containsKey(var54)) {
                                    Iterator var58 = Statics.field4567.field1233.entrySet().iterator();
                                    var58.next();
                                    var58.remove();
                                }
                                Statics.field4567.field1233.put(var54, var51);
                                break;
                            }
                            var54 = (var54 << 5) - var54 + var52.charAt(var55);
                            var55++;
                        }
                    }
                    if (field720) {
                        Statics.field4567.field1226 = class69.field902;
                    } else {
                        Statics.field4567.field1226 = null;
                    }
                    class89.method450();
                    field674 = var1.method2782();
                    field676 = var1.method2782() == 1;
                    field576 = var1.method2782();
                    field576 <<= 0x8;
                    field576 += var1.method2782();
                    field773 = var1.method2782();
                    var1.method2781(var2.field4511, 0, 1);
                    var2.field4512 = 0;
                    class258[] var59 = class258.method3357();
                    int var60 = var2.method6609();
                    if (var60 < 0 || var60 >= var59.length) {
                        throw new IOException(var60 + " " + var2.field4512);
                    }
                    field551.field1321 = var59[var60];
                    field551.field1320 = field551.field1321.field3062;
                    var1.method2781(var2.field4511, 0, 2);
                    var2.field4512 = 0;
                    field551.field1320 = var2.method6666();
                    try {
                        class28.method391(Statics.field4489, "zap");
                    } catch (Throwable var71) {
                    }
                    method3973(16);
                }
                if (field530 != 16) {
                    if (field530 == 17 && var1.method2810() >= 2) {
                        var2.field4512 = 0;
                        var1.method2781(var2.field4511, 0, 2);
                        var2.field4512 = 0;
                        Statics.field3942 = var2.method6666();
                        method3973(18);
                    }
                    if (field530 == 18 && var1.method2810() >= Statics.field3942) {
                        var2.field4512 = 0;
                        var1.method2781(var2.field4511, 0, Statics.field3942);
                        var2.field4512 = 0;
                        String var62 = var2.method6674();
                        String var63 = var2.method6674();
                        String var64 = var2.method6674();
                        class69.method2337(var62, var63, var64);
                        method2405(10);
                    }
                    if (field530 == 19) {
                        if (field551.field1320 == -1) {
                            if (var1.method2810() < 2) {
                                return;
                            }
                            var1.method2781(var2.field4511, 0, 2);
                            var2.field4512 = 0;
                            field551.field1320 = var2.method6666();
                        }
                        if (var1.method2810() >= field551.field1320) {
                            var1.method2781(var2.field4511, 0, field551.field1320);
                            var2.field4512 = 0;
                            int var65 = field551.field1320;
                            field556.method5659();
                            field551.method2266();
                            field551.field1318.field4512 = 0;
                            field551.field1321 = null;
                            field551.field1326 = null;
                            field551.field1327 = null;
                            field551.field1328 = null;
                            field551.field1320 = 0;
                            field551.field1324 = 0;
                            field757 = 0;
                            method3138();
                            field743 = 0;
                            field741 = 0;
                            for (int var66 = 0; var66 < 2048; var66++) {
                                field619[var66] = null;
                            }
                            Statics.field2754 = null;
                            for (int var67 = 0; var67 < field546.length; var67++) {
                                class91 var68 = field546[var67];
                                if (var68 != null) {
                                    var68.field1174 = -1;
                                    var68.field1166 = false;
                                }
                            }
                            class78.field1023 = new class402(32);
                            method2405(30);
                            for (int var69 = 0; var69 < 100; var69++) {
                                field714[var69] = true;
                            }
                            method6181();
                            Statics.method5877(var2);
                            if (var2.field4512 != var65) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field531++;
                        if (field531 > 2000) {
                            if (field532 < 1) {
                                if (Statics.field4124 == Statics.field3198) {
                                    Statics.field3198 = Statics.field3517;
                                } else {
                                    Statics.field3198 = Statics.field4124;
                                }
                                field532++;
                                method3973(0);
                            } else {
                                method4296(-3);
                            }
                        }
                    }
                } else if (var1.method2810() >= field551.field1320) {
                    var2.field4512 = 0;
                    var1.method2781(var2.field4511, 0, field551.field1320);
                    field556.method5664();
                    method4727();
                    Statics.method5877(var2);
                    Statics.field241 = -1;
                    method977(false, var2);
                    field551.field1321 = null;
                }
            }
        } catch (IOException var75) {
            if (field532 < 1) {
                if (Statics.field4124 == Statics.field3198) {
                    Statics.field3198 = Statics.field3517;
                } else {
                    Statics.field3198 = Statics.field4124;
                }
                field532++;
                method3973(0);
            } else {
                method4296(-2);
            }
        }
    }

    @ObfuscatedName("jj.fp(I)V")
    public static void method4727() {
        field508 = 1L;
        Statics.field1329.field1057 = 0;
        Statics.field3516 = true;
        field512 = true;
        field686 = -1L;
        class34.method349();
        field551.method2266();
        field551.field1318.field4512 = 0;
        field551.field1321 = null;
        field551.field1326 = null;
        field551.field1327 = null;
        field551.field1328 = null;
        field551.field1320 = 0;
        field551.field1324 = 0;
        field757 = 0;
        field552 = 0;
        field696 = 0;
        method3138();
        class33.method1896(0);
        class98.method2171();
        field658 = 0;
        field660 = false;
        field746 = 0;
        field575 = 0;
        field580 = 0;
        Statics.field59 = null;
        field743 = 0;
        field736 = -1;
        field741 = 0;
        field742 = 0;
        field523 = class94.field1262;
        field722 = class94.field1262;
        field547 = 0;
        class96.method4490();
        for (int var0 = 0; var0 < 2048; var0++) {
            field619[var0] = null;
        }
        for (int var1 = 0; var1 < 32768; var1++) {
            field546[var1] = null;
        }
        field632 = -1;
        field759.method5262();
        field636.method5262();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    field633[var2][var3][var4] = null;
                }
            }
        }
        field634 = new class326();
        Statics.field1606.method1586();
        for (int var5 = 0; var5 < Statics.field1755; var5++) {
            class163 var6 = class163.method740(var5);
            if (var6 != null) {
                class281.field3225[var5] = 0;
                class281.field3224[var5] = 0;
            }
        }
        Statics.field1702.method2208();
        field525 = -1;
        if (field725 != -1) {
            class286.method4751(field725);
        }
        for (class80 var7 = (class80) field666.method6463(); var7 != null; var7 = (class80) field666.method6457()) {
            method2598(var7, true);
        }
        field725 = -1;
        field666 = new class402(8);
        field526 = null;
        method3138();
        field772.method4856((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var8 = 0; var8 < 8; var8++) {
            field629[var8] = null;
            field630[var8] = false;
        }
        class78.field1023 = new class402(32);
        field506 = true;
        for (int var9 = 0; var9 < 100; var9++) {
            field714[var9] = true;
        }
        method6181();
        Statics.field888 = null;
        Statics.field1355 = null;
        Arrays.fill(field589, (Object) null);
        Statics.field1037 = null;
        Arrays.fill(field717, (Object) null);
        for (int var10 = 0; var10 < 8; var10++) {
            field516[var10] = new class316();
        }
        Statics.field1578 = null;
    }

    @ObfuscatedName("hk.fr(II)V")
    public static void method4296(int arg0) {
        if (arg0 == -3) {
            class69.method2337(class300.field3569, class300.field3551, class300.field3571);
        } else if (arg0 == -2) {
            class69.method2337(class300.field3572, class300.field3792, class300.field3574);
        } else if (arg0 == -1) {
            class69.method2337(class300.field3580, class300.field3576, class300.field3577);
        } else if (arg0 == 3) {
            class69.method2054(3);
            class69.field919 = 1;
        } else if (arg0 == 4) {
            class69.method2054(14);
            class69.field915 = 0;
        } else if (arg0 == 5) {
            class69.field919 = 2;
            class69.method2337(class300.field3612, class300.field3582, class300.field3583);
        } else if (arg0 == 68 || !(field544 || arg0 != 6)) {
            class69.method2337(class300.field3596, class300.field3585, class300.field3649);
        } else if (arg0 == 7) {
            class69.method2337(class300.field3587, class300.field3588, class300.field3680);
        } else if (arg0 == 8) {
            class69.method2337(class300.field3590, class300.field3758, class300.field3592);
        } else if (arg0 == 9) {
            class69.method2337(class300.field3593, class300.field3594, class300.field3566);
        } else if (arg0 == 10) {
            class69.method2337(class300.field3549, class300.field3645, class300.field3598);
        } else if (arg0 == 11) {
            class69.method2337(class300.field3595, class300.field3600, class300.field3601);
        } else if (arg0 == 12) {
            class69.method2337(class300.field3602, class300.field3770, class300.field3652);
        } else if (arg0 == 13) {
            class69.method2337(class300.field3747, class300.field3606, class300.field3811);
        } else if (arg0 == 14) {
            class69.method2337(class300.field3755, class300.field3609, class300.field3610);
        } else if (arg0 == 16) {
            class69.method2337(class300.field3611, class300.field3672, class300.field3657);
        } else if (arg0 == 17) {
            class69.method2337(class300.field3614, class300.field3840, class300.field3616);
        } else if (arg0 == 18) {
            class69.method2054(14);
            class69.field915 = 1;
        } else if (arg0 == 19) {
            class69.method2337(class300.field3620, class300.field3621, class300.field3622);
        } else if (arg0 == 20) {
            class69.method2337(class300.field3623, class300.field3624, class300.field3697);
        } else if (arg0 == 22) {
            class69.method2337(class300.field3843, class300.field3627, class300.field3771);
        } else if (arg0 == 23) {
            class69.method2337(class300.field3629, class300.field3630, class300.field3631);
        } else if (arg0 == 24) {
            class69.method2337(class300.field3632, class300.field3633, class300.field3775);
        } else if (arg0 == 25) {
            class69.method2337(class300.field3591, class300.field3636, class300.field3637);
        } else if (arg0 == 26) {
            class69.method2337(class300.field3638, class300.field3744, class300.field3537);
        } else if (arg0 == 27) {
            class69.method2337(class300.field3641, class300.field3542, class300.field3706);
        } else if (arg0 == 31) {
            class69.method2337(class300.field3650, class300.field3651, class300.field3626);
        } else if (arg0 == 32) {
            class69.method2337(class300.field3581, class300.field3654, class300.field3655);
        } else if (arg0 == 37) {
            class69.method2337(class300.field3759, class300.field3584, class300.field3658);
        } else if (arg0 == 38) {
            class69.method2337(class300.field3659, class300.field3660, class300.field3573);
        } else if (arg0 == 55) {
            class69.method2054(8);
        } else if (arg0 == 56) {
            class69.method2337(class300.field3666, class300.field3667, class300.field3668);
            method2405(11);
            return;
        } else if (arg0 == 57) {
            class69.method2337(class300.field3669, class300.field3670, class300.field3671);
            method2405(11);
            return;
        } else if (arg0 == 61) {
            class69.method2337("", "Please enter your date of birth (DD/MM/YYYY)", "");
            class69.method2054(7);
        } else if (arg0 == 62) {
            method2405(10);
            class69.method2054(9);
            class69.method2337(class300.field3829, class300.field3673, class300.field3674);
            return;
        } else if (arg0 == 63) {
            method2405(10);
            class69.method2054(9);
            class69.method2337(class300.field3563, class300.field3676, class300.field3677);
            return;
        } else if (arg0 == 65 || arg0 == 67) {
            method2405(10);
            class69.method2054(9);
            class69.method2337(class300.field3678, class300.field3679, class300.field3757);
            return;
        } else if (arg0 == 70) {
            class69.method2337(class300.field3642, class300.field3767, class300.field3768);
            method2405(20);
            method3973(0);
            return;
        } else if (arg0 == 71) {
            method2405(10);
            class69.method2054(7);
            class69.method2337("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
        } else {
            class69.method2337(class300.field3681, class300.field3682, class300.field3789);
        }
        method2405(10);
        if (field535.method6923()) {
            class69.method2054(9);
        }
    }

    @ObfuscatedName("et.ft(B)V")
    public static final void method2625() {
        field551.method2270();
        method2325();
        Statics.field415.method3572();
        for (int var0 = 0; var0 < 4; var0++) {
            field518[var0].method3331();
        }
        System.gc();
        class266.method4511(2);
        field744 = -1;
        field745 = false;
        class63.method3307();
        method2405(10);
    }

    @ObfuscatedName("jt.fb(II)V")
    public static final void method4826(int arg0) {
        method2625();
        switch(arg0) {
            case 1:
                class69.method6113();
                break;
            case 2:
                class69.method2054(24);
                class69.method2337(class300.field3691, class300.field3613, class300.field3794);
        }
    }

    @ObfuscatedName("ce.fs(B)V")
    public static final void method2325() {
        class182.method622();
        class174.method627();
        class166.field1793.method4475();
        class180.method297();
        class171.method2479();
        class181.field2051.method4475();
        class181.field2023.method4475();
        class181.field2025.method4475();
        class183.method2814();
        class173.method4314();
        class176.field1926.method4475();
        class163.method2113();
        Statics.field1433.method6539();
        Statics.field2085.method6539();
        class179.method1804();
        class167.method264();
        class178.method1999();
        class177.method2936();
        class164.field1760.method4475();
        class284.method5248();
        class286.method3934();
        ((class202) Statics.field2281).method3778();
        class72.field967.method4475();
        Statics.field30.method5053();
        Statics.field604.method5053();
        Statics.field2241.method5053();
        Statics.field4446.method5053();
        Statics.field623.method5053();
        Statics.field2607.method5053();
        Statics.field2609.method5053();
        Statics.field481.method5053();
        Statics.field58.method5053();
        Statics.field2258.method5053();
        Statics.field2828.method5053();
        Statics.field1671.method5053();
    }

    @ObfuscatedName("m.fz(S)V")
    public static final void method254() {
        if (field552 > 0) {
            method2625();
        } else {
            field556.method5667();
            method2405(40);
            Statics.field1700 = field551.method2271();
            field551.method2284();
        }
    }

    @ObfuscatedName("mp.fq(ZI)V")
    public static final void method5711(boolean arg0) {
        if (arg0) {
            field534 = class69.field894 ? class123.field1499 : class123.field1497;
            return;
        }
        LinkedHashMap var1 = Statics.field4567.field1233;
        String var2 = class69.field902;
        int var3 = var2.length();
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            var4 = (var4 << 5) - var4 + var2.charAt(var5);
        }
        field534 = var1.containsKey(var4) ? class123.field1495 : class123.field1496;
    }

    @ObfuscatedName("client.fh(I)V")
    public final void method1212() {
        if (field757 > 1) {
            field757--;
        }
        if (field552 > 0) {
            field552--;
        }
        if (field553) {
            field553 = false;
            method254();
            return;
        }
        if (!field691) {
            method2114();
        }
        for (int var1 = 0; var1 < 100 && this.method1068(field551); var1++) {
        }
        if (field731 != 30) {
            return;
        }
        while (class34.method5246()) {
            class257 var2 = class257.method2630(class255.field2897, field551.field1319);
            var2.field2960.method6644(0);
            int var3 = var2.field2960.field4512;
            class34.method4823(var2.field2960);
            var2.field2960.method6801(var2.field2960.field4512 - var3);
            field551.method2268(var2);
        }
        if (field556.field4088) {
            class257 var4 = class257.method2630(class255.field2916, field551.field1319);
            var4.field2960.method6644(0);
            int var5 = var4.field2960.field4512;
            field556.method5660(var4.field2960);
            var4.field2960.method6801(var4.field2960.field4512 - var5);
            field551.method2268(var4);
            field556.method5658();
        }
        Object var6 = Statics.field1329.field1063;
        synchronized (Statics.field1329.field1063) {
            if (!field593) {
                Statics.field1329.field1057 = 0;
            } else if (class33.field235 != 0 || Statics.field1329.field1057 >= 40) {
                class257 var7 = null;
                int var8 = 0;
                int var9 = 0;
                int var10 = 0;
                int var11 = 0;
                for (int var12 = 0; var12 < Statics.field1329.field1057 && (var7 == null || var7.field2960.field4512 - var8 < 246); var12++) {
                    var9 = var12;
                    int var13 = Statics.field1329.field1060[var12];
                    if (var13 < -1) {
                        var13 = -1;
                    } else if (var13 > 65534) {
                        var13 = 65534;
                    }
                    int var14 = Statics.field1329.field1059[var12];
                    if (var14 < -1) {
                        var14 = -1;
                    } else if (var14 > 65534) {
                        var14 = 65534;
                    }
                    if (field509 != var14 || field510 != var13) {
                        if (var7 == null) {
                            var7 = class257.method2630(class255.field2839, field551.field1319);
                            var7.field2960.method6644(0);
                            var8 = var7.field2960.field4512;
                            var7.field2960.field4512 += 2;
                            var10 = 0;
                            var11 = 0;
                        }
                        int var15;
                        int var16;
                        int var17;
                        if (field652 == -1L) {
                            var15 = var14;
                            var16 = var13;
                            var17 = Integer.MAX_VALUE;
                        } else {
                            var15 = var14 - field509;
                            var16 = var13 - field510;
                            var17 = (int) ((Statics.field1329.field1061[var12] - field652) / 20L);
                            var10 = (int) ((Statics.field1329.field1061[var12] - field652) % 20L + (long) var10);
                        }
                        field509 = var14;
                        field510 = var13;
                        if (var17 < 8 && var15 >= -32 && var15 <= 31 && var16 >= -32 && var16 <= 31) {
                            var15 += 32;
                            var16 += 32;
                            var7.field2960.method6757((var15 << 6) + (var17 << 12) + var16);
                        } else if (var17 < 32 && var15 >= -128 && var15 <= 127 && var16 >= -128 && var16 <= 127) {
                            var15 += 128;
                            var16 += 128;
                            var7.field2960.method6644(var17 + 128);
                            var7.field2960.method6757((var15 << 8) + var16);
                        } else if (var17 < 32) {
                            var7.field2960.method6644(var17 + 192);
                            if (var14 == -1 || var13 == -1) {
                                var7.field2960.method6650(Integer.MIN_VALUE);
                            } else {
                                var7.field2960.method6650(var14 | var13 << 16);
                            }
                        } else {
                            var7.field2960.method6757((var17 & 0x1FFF) + 57344);
                            if (var14 == -1 || var13 == -1) {
                                var7.field2960.method6650(Integer.MIN_VALUE);
                            } else {
                                var7.field2960.method6650(var14 | var13 << 16);
                            }
                        }
                        var11++;
                        field652 = Statics.field1329.field1061[var12];
                    }
                }
                if (var7 != null) {
                    var7.field2960.method6801(var7.field2960.field4512 - var8);
                    int var18 = var7.field2960.field4512;
                    var7.field2960.field4512 = var8;
                    var7.field2960.method6644(var10 / var11);
                    var7.field2960.method6644(var10 % var11);
                    var7.field2960.field4512 = var18;
                    field551.method2268(var7);
                }
                if (var9 >= Statics.field1329.field1057) {
                    Statics.field1329.field1057 = 0;
                } else {
                    Statics.field1329.field1057 -= var9;
                    System.arraycopy(Statics.field1329.field1059, var9, Statics.field1329.field1059, 0, Statics.field1329.field1057);
                    System.arraycopy(Statics.field1329.field1060, var9, Statics.field1329.field1060, 0, Statics.field1329.field1057);
                    System.arraycopy(Statics.field1329.field1061, var9, Statics.field1329.field1061, 0, Statics.field1329.field1057);
                }
            }
        }
        if (class33.field235 == 1 || !Statics.field4238 && class33.field235 == 4 || class33.field235 == 2) {
            long var20 = class33.field238 - field508 * -1L;
            if (var20 > 32767L) {
                var20 = 32767L;
            }
            field508 = class33.field238 * -1L;
            int var22 = class33.field237;
            if (var22 < 0) {
                var22 = 0;
            } else if (var22 > Statics.field1246) {
                var22 = Statics.field1246;
            }
            int var23 = class33.field236;
            if (var23 < 0) {
                var23 = 0;
            } else if (var23 > Statics.field3209) {
                var23 = Statics.field3209;
            }
            int var24 = (int) var20;
            class257 var25 = class257.method2630(class255.field2909, field551.field1319);
            var25.field2960.method6757((var24 << 1) + (class33.field235 == 2 ? 1 : 0));
            var25.field2960.method6757(var23);
            var25.field2960.method6757(var22);
            field551.method2268(var25);
        }
        if (class24.field140 > 0) {
            class257 var26 = class257.method2630(class255.field2883, field551.field1319);
            var26.field2960.method6757(0);
            int var27 = var26.field2960.field4512;
            long var28 = class262.method4787();
            for (int var30 = 0; var30 < class24.field140; var30++) {
                long var31 = var28 - field686;
                if (var31 > 16777215L) {
                    var31 = 16777215L;
                }
                field686 = var28;
                var26.field2960.method6755(class24.field136[var30]);
                var26.field2960.method6703((int) var31);
            }
            var26.field2960.method6660(var26.field2960.field4512 - var27);
            field551.method2268(var26);
        }
        if (field678 > 0) {
            field678--;
        }
        if (class24.field131[96] || class24.field131[97] || class24.field131[98] || class24.field131[99]) {
            field590 = true;
        }
        if (field590 && field678 <= 0) {
            field678 = 20;
            field590 = false;
            class257 var33 = class257.method2630(class255.field2837, field551.field1319);
            var33.field2960.method6691(field574);
            var33.field2960.method6702(field575);
            field551.method2268(var33);
        }
        if (Statics.field3516 && !field512) {
            field512 = true;
            class257 var34 = class257.method2630(class255.field2931, field551.field1319);
            var34.field2960.method6644(1);
            field551.method2268(var34);
        }
        if (!Statics.field3516 && field512) {
            field512 = false;
            class257 var35 = class257.method2630(class255.field2931, field551.field1319);
            var35.field2960.method6644(0);
            field551.method2268(var35);
        }
        if (Statics.field3193 != null) {
            Statics.field3193.method6215();
        }
        method4313();
        if (Statics.field1529) {
            method2068();
            Statics.field1529 = false;
        }
        method2524();
        if (field731 != 30) {
            return;
        }
        for (class84 var36 = (class84) field634.method5269(); var36 != null; var36 = (class84) field634.method5270()) {
            if (var36.field1098 > 0) {
                var36.field1098--;
            }
            if (var36.field1098 != 0) {
                if (var36.field1109 > 0) {
                    var36.field1109--;
                }
                if (var36.field1109 == 0 && var36.field1097 >= 1 && var36.field1105 >= 1 && var36.field1097 <= 102 && var36.field1105 <= 102 && (var36.field1102 < 0 || class75.method4308(var36.field1102, var36.field1104))) {
                    method3451(var36.field1106, var36.field1096, var36.field1097, var36.field1105, var36.field1102, var36.field1103, var36.field1104);
                    var36.field1109 = -1;
                    if (var36.field1102 == var36.field1099 && var36.field1099 == -1) {
                        var36.method6167();
                    } else if (var36.field1102 == var36.field1099 && var36.field1107 == var36.field1103 && var36.field1104 == var36.field1101) {
                        var36.method6167();
                    }
                }
            } else if (var36.field1099 < 0 || class75.method4308(var36.field1099, var36.field1101)) {
                method3451(var36.field1106, var36.field1096, var36.field1097, var36.field1105, var36.field1099, var36.field1107, var36.field1101);
                var36.method6167();
            }
        }
        int var10002;
        for (int var37 = 0; var37 < field746; var37++) {
            var10002 = field749[var37]--;
            if (field749[var37] >= -10) {
                class37 var39 = field751[var37];
                if (var39 == null) {
                    class37 var10000 = (class37) null;
                    var39 = class37.method668(Statics.field4446, field747[var37], 0);
                    if (var39 == null) {
                        continue;
                    }
                    field749[var37] += var39.method670();
                    field751[var37] = var39;
                }
                if (field749[var37] < 0) {
                    int var46;
                    if (field598[var37] == 0) {
                        var46 = Statics.field4567.field1230;
                    } else {
                        int var40 = (field598[var37] & 0xFF) * 128;
                        int var41 = field598[var37] >> 16 & 0xFF;
                        int var42 = var41 * 128 + 64 - Statics.field2754.field1161;
                        if (var42 < 0) {
                            var42 = -var42;
                        }
                        int var43 = field598[var37] >> 8 & 0xFF;
                        int var44 = var43 * 128 + 64 - Statics.field2754.field1152;
                        if (var44 < 0) {
                            var44 = -var44;
                        }
                        int var45 = var42 + var44 - 128;
                        if (var45 > var40) {
                            field749[var37] = -100;
                            continue;
                        }
                        if (var45 < 0) {
                            var45 = 0;
                        }
                        var46 = Statics.field4567.field1231 * (var40 - var45) / var40;
                    }
                    if (var46 > 0) {
                        class38 var47 = var39.method672().method677(Statics.field1549);
                        class45 var48 = class45.method825(var47, 100, var46);
                        var48.method847(field748[var37] - 1);
                        Statics.field1509.method629(var48);
                    }
                    field749[var37] = -100;
                }
            } else {
                field746--;
                for (int var38 = var37; var38 < field746; var38++) {
                    field747[var38] = field747[var38 + 1];
                    field751[var38] = field751[var38 + 1];
                    field748[var38] = field748[var38 + 1];
                    field749[var38] = field749[var38 + 1];
                    field598[var38] = field598[var38 + 1];
                }
                var37--;
            }
        }
        if (field745) {
            boolean var49;
            if (class266.field3108 == 0) {
                var49 = Statics.field3109.method4553();
            } else {
                var49 = true;
            }
            if (!var49) {
                if (Statics.field4567.field1229 != 0 && field744 != -1) {
                    class266.method1801(Statics.field2607, field744, 0, Statics.field4567.field1229, false);
                }
                field745 = false;
            }
        }
        field551.field1324++;
        if (field551.field1324 > 750) {
            method254();
            return;
        }
        int var50 = class96.field1280;
        int[] var51 = class96.field1281;
        for (int var52 = 0; var52 < var50; var52++) {
            class83 var53 = field619[var51[var52]];
            if (var53 != null) {
                method5555(var53, 1);
            }
        }
        method2370();
        int[] var54 = class96.field1281;
        for (int var55 = 0; var55 < class96.field1280; var55++) {
            class83 var56 = field619[var54[var55]];
            if (var56 != null && var56.field1118 > 0) {
                var56.field1118--;
                if (var56.field1118 == 0) {
                    var56.field1124 = null;
                }
            }
        }
        for (int var57 = 0; var57 < field547; var57++) {
            int var58 = field548[var57];
            class91 var59 = field546[var58];
            if (var59 != null && var59.field1118 > 0) {
                var59.field1118--;
                if (var59.field1118 == 0) {
                    var59.field1124 = null;
                }
            }
        }
        field567++;
        if (field621 != 0) {
            field608 += 20;
            if (field608 >= 400) {
                field621 = 0;
            }
        }
        if (Statics.field2721 != null) {
            field611++;
            if (field611 >= 15) {
                method2435(Statics.field2721);
                Statics.field2721 = null;
            }
        }
        class286 var60 = Statics.field2808;
        class286 var61 = Statics.field1517;
        Statics.field2808 = null;
        Statics.field1517 = null;
        field693 = null;
        field649 = false;
        field683 = false;
        field730 = 0;
        while (class24.method6010() && field730 < 128) {
            if (field674 >= 2 && class24.field131[82] && Statics.field1750 == 66) {
                String var62 = class98.method2602();
                Statics.field4489.method444(var62);
            } else if (field580 != 1 || Statics.field1611 <= 0) {
                field732[field730] = Statics.field1750;
                field685[field730] = Statics.field1611;
                field730++;
            }
        }
        if (method2624() && class24.field131[82] && class24.field131[81] && field707 != 0) {
            int var63 = Statics.field2754.field1084 - field707;
            if (var63 < 0) {
                var63 = 0;
            } else if (var63 > 3) {
                var63 = 3;
            }
            if (Statics.field2754.field1084 != var63) {
                method357(Statics.field161 + Statics.field2754.field1173[0], Statics.field1467 + Statics.field2754.field1147[0], var63, false);
            }
            field707 = 0;
        }
        if (field725 != -1) {
            method2584(field725, 0, 0, Statics.field3209, Statics.field1246, 0, 0);
        }
        field690++;
        while (true) {
            class81 var64;
            class286 var65;
            class286 var66;
            do {
                var64 = (class81) field709.method5267();
                if (var64 == null) {
                    while (true) {
                        class81 var67;
                        class286 var68;
                        class286 var69;
                        do {
                            var67 = (class81) field710.method5267();
                            if (var67 == null) {
                                while (true) {
                                    class81 var70;
                                    class286 var71;
                                    class286 var72;
                                    do {
                                        var70 = (class81) field708.method5267();
                                        if (var70 == null) {
                                            this.method1208();
                                            if (Statics.field3193 != null) {
                                                Statics.field3193.method6225(Statics.field325, (Statics.field2754.field1161 >> 7) + Statics.field161, (Statics.field2754.field1152 >> 7) + Statics.field1467, false);
                                                Statics.field3193.method6241();
                                            }
                                            if (field541 != null) {
                                                this.method1072();
                                            }
                                            if (Statics.field111 != null) {
                                                method2435(Statics.field111);
                                                field618++;
                                                if (class33.field227 == 0) {
                                                    if (field617) {
                                                        if (Statics.field1248 == Statics.field111 && field616 != field613) {
                                                            class286 var73 = Statics.field111;
                                                            byte var74 = 0;
                                                            if (field670 == 1 && var73.field3269 == 206) {
                                                                var74 = 1;
                                                            }
                                                            if (var73.field3393[field616] <= 0) {
                                                                var74 = 0;
                                                            }
                                                            if (class287.method2965(method5247(var73))) {
                                                                int var75 = field613;
                                                                int var76 = field616;
                                                                var73.field3393[var76] = var73.field3393[var75];
                                                                var73.field3394[var76] = var73.field3394[var75];
                                                                var73.field3393[var75] = -1;
                                                                var73.field3394[var75] = 0;
                                                            } else if (var74 == 1) {
                                                                int var77 = field613;
                                                                int var78 = field616;
                                                                while (var77 != var78) {
                                                                    if (var77 > var78) {
                                                                        var73.method4876(var77 - 1, var77);
                                                                        var77--;
                                                                    } else if (var77 < var78) {
                                                                        var73.method4876(var77 + 1, var77);
                                                                        var77++;
                                                                    }
                                                                }
                                                            } else {
                                                                var73.method4876(field616, field613);
                                                            }
                                                            class257 var79 = class257.method2630(class255.field2857, field551.field1319);
                                                            var79.field2960.method6702(field616);
                                                            var79.field2960.method6702(field613);
                                                            var79.field2960.method6650(Statics.field111.field3265);
                                                            var79.field2960.method6700(var74);
                                                            field551.method2268(var79);
                                                        }
                                                    } else if (this.method1244()) {
                                                        this.method1069(field579, field615);
                                                    } else if (field733 > 0) {
                                                        method1953(field579, field615);
                                                    }
                                                    field611 = 10;
                                                    class33.field235 = 0;
                                                    Statics.field111 = null;
                                                } else if (field618 >= 5 && (class33.field223 > field579 + 5 || class33.field223 < field579 - 5 || class33.field229 > field615 + 5 || class33.field229 < field615 - 5)) {
                                                    field617 = true;
                                                }
                                            }
                                            if (class197.method3611()) {
                                                int var80 = class197.field2340;
                                                int var81 = class197.field2341;
                                                class257 var82 = class257.method2630(class255.field2862, field551.field1319);
                                                var82.field2960.method6644(5);
                                                var82.field2960.method6700(class24.field131[82] ? (class24.field131[81] ? 2 : 1) : 0);
                                                var82.field2960.method6852(Statics.field161 + var80);
                                                var82.field2960.method6852(Statics.field1467 + var81);
                                                field551.method2268(var82);
                                                class197.method3612();
                                                field694 = class33.field236;
                                                field505 = class33.field237;
                                                field621 = 1;
                                                field608 = 0;
                                                field741 = var80;
                                                field742 = var81;
                                            }
                                            if (Statics.field2808 != var60) {
                                                if (var60 != null) {
                                                    method2435(var60);
                                                }
                                                if (Statics.field2808 != null) {
                                                    method2435(Statics.field2808);
                                                }
                                            }
                                            if (Statics.field1517 != var61 && field735 == field507) {
                                                if (var61 != null) {
                                                    method2435(var61);
                                                }
                                                if (Statics.field1517 != null) {
                                                    method2435(Statics.field1517);
                                                }
                                            }
                                            if (Statics.field1517 == null) {
                                                if (field507 > 0) {
                                                    field507--;
                                                }
                                            } else if (field507 < field735) {
                                                field507++;
                                                if (field735 == field507) {
                                                    method2435(Statics.field1517);
                                                }
                                            }
                                            method2319();
                                            if (field756) {
                                                method4941();
                                            } else if (field752) {
                                                int var83 = Statics.field479 * 128 + 64;
                                                int var84 = Statics.field76 * 128 + 64;
                                                int var85 = method2169(var83, var84, Statics.field325) - Statics.field1493;
                                                method3939(var83, var85, var84);
                                                int var86 = Statics.field34 * 128 + 64;
                                                int var87 = Statics.field120 * 128 + 64;
                                                int var88 = method2169(var86, var87, Statics.field325) - Statics.field4058;
                                                int var89 = var86 - Statics.field4498;
                                                int var90 = var88 - Statics.field2749;
                                                int var91 = var87 - Statics.field494;
                                                int var92 = (int) Math.sqrt((double) (var89 * var89 + var91 * var91));
                                                int var93 = (int) (Math.atan2((double) var90, (double) var92) * 325.9490051269531D) & 0x7FF;
                                                int var94 = (int) (Math.atan2((double) var89, (double) var91) * -325.9490051269531D) & 0x7FF;
                                                method4513(var93, var94);
                                            }
                                            for (int var95 = 0; var95 < 5; var95++) {
                                                var10002 = field758[var95]++;
                                            }
                                            Statics.field1702.method2211();
                                            int var96 = class33.method4293();
                                            int var97 = class24.method2631();
                                            if (var96 > 15000 && var97 > 15000) {
                                                field552 = 250;
                                                class33.method1896(14500);
                                                class257 var98 = class257.method2630(class255.field2904, field551.field1319);
                                                field551.method2268(var98);
                                            }
                                            Statics.field1606.method1612();
                                            field551.field1325++;
                                            if (field551.field1325 > 50) {
                                                class257 var99 = class257.method2630(class255.field2838, field551.field1319);
                                                field551.method2268(var99);
                                            }
                                            try {
                                                field551.method2267();
                                            } catch (IOException var101) {
                                                method254();
                                            }
                                            return;
                                        }
                                        var71 = var70.field1044;
                                        if (var71.field3257 < 0) {
                                            break;
                                        }
                                        var72 = class286.method2611(var71.field3320);
                                    } while (var72 == null || var72.field3326 == null || var71.field3257 >= var72.field3326.length || var72.field3326[var71.field3257] != var71);
                                    class64.method2170(var70);
                                }
                            }
                            var68 = var67.field1044;
                            if (var68.field3257 < 0) {
                                break;
                            }
                            var69 = class286.method2611(var68.field3320);
                        } while (var69 == null || var69.field3326 == null || var68.field3257 >= var69.field3326.length || var69.field3326[var68.field3257] != var68);
                        class64.method2170(var67);
                    }
                }
                var65 = var64.field1044;
                if (var65.field3257 < 0) {
                    break;
                }
                var66 = class286.method2611(var65.field3320);
            } while (var66 == null || var66.field3326 == null || var65.field3257 >= var66.field3326.length || var66.field3326[var65.field3257] != var65);
            class64.method2170(var64);
        }
    }

    @ObfuscatedName("dd.fj(B)V")
    public static final void method2572() {
        if (Statics.field242 != null) {
            Statics.field242.method705();
        }
        if (Statics.field2961 != null) {
            Statics.field2961.method705();
        }
    }

    @ObfuscatedName("ba.fo(Lgm;IIII)V")
    public static void method1865(class183 arg0, int arg1, int arg2, int arg3) {
        if (field746 < 50 && Statics.field4567.field1231 != 0 && arg0.field2104 != null && arg1 < arg0.field2104.length) {
            method3192(arg0.field2104[arg1], arg2, arg3);
        }
    }

    @ObfuscatedName("lw.fd(Lgm;IIII)V")
    public static void method5550(class183 arg0, int arg1, int arg2, int arg3) {
        if (field746 < 50 && Statics.field4567.field1231 != 0 && arg0.field2093 != null && arg0.field2093.containsKey(arg1)) {
            method3192((Integer) arg0.field2093.get(arg1), arg2, arg3);
        }
    }

    @ObfuscatedName("fg.fa(IIIB)V")
    public static void method3192(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            return;
        }
        int var3 = arg0 >> 8;
        int var4 = arg0 >> 4 & 0x7;
        int var5 = arg0 & 0xF;
        field747[field746] = var3;
        field748[field746] = var4;
        field749[field746] = 0;
        field751[field746] = null;
        int var6 = (arg1 - 64) / 128;
        int var7 = (arg2 - 64) / 128;
        field598[field746] = (var6 << 16) + (var7 << 8) + var5;
        field746++;
    }

    @ObfuscatedName("fg.fx(IIII)V")
    public static void method3166(int arg0, int arg1, int arg2) {
        if (Statics.field4567.field1230 == 0 || arg1 == 0 || field746 >= 50) {
            return;
        }
        field747[field746] = arg0;
        field748[field746] = arg1;
        field749[field746] = arg2;
        field751[field746] = null;
        field598[field746] = 0;
        field746++;
    }

    @ObfuscatedName("hv.fv(IB)V")
    public static void method4009(int arg0) {
        if (arg0 == -1 && !field745) {
            Statics.field3109.method4552();
            class266.field3108 = 1;
            Statics.field3105 = null;
        } else if (arg0 != -1 && field744 != arg0 && Statics.field4567.field1229 != 0 && !field745) {
            class305 var1 = Statics.field2607;
            int var2 = Statics.field4567.field1229;
            class266.field3108 = 1;
            Statics.field3105 = var1;
            Statics.field3110 = arg0;
            Statics.field1629 = 0;
            Statics.field1828 = var2;
            Statics.field3154 = false;
            Statics.field3941 = 2;
        }
        field744 = arg0;
    }

    @ObfuscatedName("gd.fl(III)V")
    public static void method3371(int arg0, int arg1) {
        if (Statics.field4567.field1229 != 0 && arg0 != -1) {
            class266.method1801(Statics.field2828, arg0, 0, Statics.field4567.field1229, false);
            field745 = true;
        }
    }

    @ObfuscatedName("hf.fe(I)V")
    public static final void method4313() {
        if (!Statics.field2298) {
            return;
        }
        if (Statics.field888 != null) {
            Statics.field888.method5796();
        }
        for (int var0 = 0; var0 < class96.field1280; var0++) {
            class83 var1 = field619[class96.field1281[var0]];
            var1.method2006();
        }
        Statics.field2298 = false;
    }

    @ObfuscatedName("dv.fy(S)V")
    public static final void method2524() {
        if (Statics.field325 == field736) {
            return;
        }
        field736 = Statics.field325;
        int var0 = Statics.field325;
        int[] var1 = Statics.field4497.field4606;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class75.field994[var0][var6][var4] & 0x18) == 0) {
                    Statics.field415.method3689(var1, var5, 512, var0, var6, var4);
                }
                if (var0 < 3 && (class75.field994[var0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field415.method3689(var1, var5, 512, var0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field4497.method7082();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class75.field994[var0][var10][var9] & 0x18) == 0) {
                    method53(var0, var10, var9, var7, var8);
                }
                if (var0 < 3 && (class75.field994[var0 + 1][var10][var9] & 0x8) != 0) {
                    method53(var0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field737 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                long var13 = Statics.field415.method3601(Statics.field325, var11, var12);
                if (var13 != 0L) {
                    int var15 = class205.method3561(var13);
                    int var16 = class180.method3056(var15).field1997;
                    if (var16 >= 0 && class164.method2597(var16).field1774) {
                        field740[field737] = class164.method2597(var16).method2855(false);
                        field738[field737] = var11;
                        field750[field737] = var12;
                        field737++;
                    }
                }
            }
        }
        Statics.field309.method7028();
    }

    @ObfuscatedName("cn.fg(Ljz;III)V")
    public static final void method2154(class286 arg0, int arg1, int arg2) {
        if (field743 != 0 && field743 != 3 || field691 || !(class33.field235 == 1 || !Statics.field4238 && class33.field235 == 4)) {
            return;
        }
        class280 var3 = arg0.method4911(true);
        if (var3 == null) {
            return;
        }
        int var4 = class33.field236 - arg1;
        int var5 = class33.field237 - arg2;
        if (!var3.method4790(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field3218 / 2;
        int var7 = var5 - var3.field3212 / 2;
        int var8 = field575 & 0x7FF;
        int var9 = class194.field2271[var8];
        int var10 = class194.field2280[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field2754.field1161 + var11 >> 7;
        int var14 = Statics.field2754.field1152 - var12 >> 7;
        class257 var15 = class257.method2630(class255.field2927, field551.field1319);
        var15.field2960.method6644(18);
        var15.field2960.method6700(class24.field131[82] ? (class24.field131[81] ? 2 : 1) : 0);
        var15.field2960.method6852(Statics.field161 + var13);
        var15.field2960.method6852(Statics.field1467 + var14);
        var15.field2960.method6644(var6);
        var15.field2960.method6644(var7);
        var15.field2960.method6757(field575);
        var15.field2960.method6644(57);
        var15.field2960.method6644(0);
        var15.field2960.method6644(0);
        var15.field2960.method6644(89);
        var15.field2960.method6757(Statics.field2754.field1161);
        var15.field2960.method6757(Statics.field2754.field1152);
        var15.field2960.method6644(63);
        field551.method2268(var15);
        field741 = var13;
        field742 = var14;
    }

    @ObfuscatedName("dc.fn(Ljava/lang/String;I)V")
    public static final void method2601(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field4567.field1221 = !Statics.field4567.field1221;
            class89.method450();
            if (Statics.field4567.field1221) {
                class98.method2081(99, "", "Roofs are now all hidden");
            } else {
                class98.method2081(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field592 = !field592;
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            field638 = !field638;
        }
        if (arg0.equalsIgnoreCase("mouseovertext")) {
            field705 = !field705;
        }
        if (field674 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equalsIgnoreCase("showcoord")) {
                Statics.field3193.field4407 = !Statics.field3193.field4407;
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                field592 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field592 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method254();
            }
        }
        class257 var1 = class257.method2630(class255.field2855, field551.field1319);
        var1.field2960.method6644(arg0.length() + 1);
        var1.field2960.method6654(arg0);
        field551.method2268(var1);
    }

    @ObfuscatedName("kb.fm(B)V")
    public static final void method4941() {
        method3939(Statics.field2599, Statics.field4142, Statics.field1625);
        method4513(Statics.field3063, Statics.field855);
        if (Statics.field4498 != Statics.field2599 || Statics.field4142 != Statics.field2749 || Statics.field494 != Statics.field1625 || Statics.field33 != Statics.field3063 || Statics.field855 != Statics.field42) {
            return;
        }
        field756 = false;
        field752 = false;
        Statics.field34 = 0;
        Statics.field120 = 0;
        Statics.field4058 = 0;
        Statics.field2724 = 0;
        Statics.field2574 = 0;
        Statics.field18 = 0;
        Statics.field2544 = 0;
        Statics.field479 = 0;
        Statics.field76 = 0;
        Statics.field1493 = 0;
    }

    @ObfuscatedName("gj.gm(IIII)V")
    public static final void method3939(int arg0, int arg1, int arg2) {
        if (Statics.field4498 < arg0) {
            Statics.field4498 += Statics.field18 * (arg0 - Statics.field4498) / 1000 + Statics.field2544;
            if (Statics.field4498 > arg0) {
                Statics.field4498 = arg0;
            }
        }
        if (Statics.field4498 > arg0) {
            Statics.field4498 -= Statics.field18 * (Statics.field4498 - arg0) / 1000 + Statics.field2544;
            if (Statics.field4498 < arg0) {
                Statics.field4498 = arg0;
            }
        }
        if (Statics.field2749 < arg1) {
            Statics.field2749 += Statics.field18 * (arg1 - Statics.field2749) / 1000 + Statics.field2544;
            if (Statics.field2749 > arg1) {
                Statics.field2749 = arg1;
            }
        }
        if (Statics.field2749 > arg1) {
            Statics.field2749 -= Statics.field18 * (Statics.field2749 - arg1) / 1000 + Statics.field2544;
            if (Statics.field2749 < arg1) {
                Statics.field2749 = arg1;
            }
        }
        if (Statics.field494 < arg2) {
            Statics.field494 += Statics.field18 * (arg2 - Statics.field494) / 1000 + Statics.field2544;
            if (Statics.field494 > arg2) {
                Statics.field494 = arg2;
            }
        }
        if (Statics.field494 > arg2) {
            Statics.field494 -= Statics.field18 * (Statics.field494 - arg2) / 1000 + Statics.field2544;
            if (Statics.field494 < arg2) {
                Statics.field494 = arg2;
            }
        }
    }

    @ObfuscatedName("jh.gi(IIB)V")
    public static final void method4513(int arg0, int arg1) {
        if (arg0 < 128) {
            arg0 = 128;
        }
        if (arg0 > 383) {
            arg0 = 383;
        }
        if (Statics.field33 < arg0) {
            Statics.field33 += Statics.field2574 * (arg0 - Statics.field33) / 1000 + Statics.field2724;
            if (Statics.field33 > arg0) {
                Statics.field33 = arg0;
            }
        }
        if (Statics.field33 > arg0) {
            Statics.field33 -= Statics.field2574 * (Statics.field33 - arg0) / 1000 + Statics.field2724;
            if (Statics.field33 < arg0) {
                Statics.field33 = arg0;
            }
        }
        int var2 = arg1 - Statics.field42;
        if (var2 > 1024) {
            var2 -= 2048;
        }
        if (var2 < -1024) {
            var2 += 2048;
        }
        if (var2 > 0) {
            Statics.field42 += Statics.field2574 * var2 / 1000 + Statics.field2724;
            Statics.field42 &= 0x7FF;
        }
        if (var2 < 0) {
            Statics.field42 -= Statics.field2574 * -var2 / 1000 + Statics.field2724;
            Statics.field42 &= 0x7FF;
        }
        int var3 = arg1 - Statics.field42;
        if (var3 > 1024) {
            var3 -= 2048;
        }
        if (var3 < -1024) {
            var3 += 2048;
        }
        if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) {
            Statics.field42 = arg1;
        }
    }

    @ObfuscatedName("cp.gx(B)V")
    public static final void method2319() {
        if (field580 == 0) {
            int var0 = Statics.field2754.field1161;
            int var1 = Statics.field2754.field1152;
            if (Statics.field182 - var0 < -500 || Statics.field182 - var0 > 500 || Statics.field1492 - var1 < -500 || Statics.field1492 - var1 > 500) {
                Statics.field182 = var0;
                Statics.field1492 = var1;
            }
            if (Statics.field182 != var0) {
                Statics.field182 += (var0 - Statics.field182) / 16;
            }
            if (Statics.field1492 != var1) {
                Statics.field1492 += (var1 - Statics.field1492) / 16;
            }
            int var2 = Statics.field182 >> 7;
            int var3 = Statics.field1492 >> 7;
            int var4 = method2169(Statics.field182, Statics.field1492, Statics.field325);
            int var5 = 0;
            if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                        int var8 = Statics.field325;
                        if (var8 < 3 && (class75.field994[1][var6][var7] & 0x2) == 2) {
                            var8++;
                        }
                        int var9 = var4 - class75.field1005[var8][var6][var7];
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
            if (var10 > field591) {
                field591 += (var10 - field591) / 24;
            } else if (var10 < field591) {
                field591 += (var10 - field591) / 80;
            }
            Statics.field3219 = method2169(Statics.field2754.field1161, Statics.field2754.field1152, Statics.field325) - field581;
        } else if (field580 == 1) {
            method196();
            short var11 = -1;
            if (class24.field131[33]) {
                var11 = 0;
            } else if (class24.field131[49]) {
                var11 = 1024;
            }
            if (class24.field131[48]) {
                if (var11 == 0) {
                    var11 = 1792;
                } else if (var11 == 1024) {
                    var11 = 1280;
                } else {
                    var11 = 1536;
                }
            } else if (class24.field131[50]) {
                if (var11 == 0) {
                    var11 = 256;
                } else if (var11 == 1024) {
                    var11 = 768;
                } else {
                    var11 = 512;
                }
            }
            byte var12 = 0;
            if (class24.field131[35]) {
                var12 = -1;
            } else if (class24.field131[51]) {
                var12 = 1;
            }
            int var13 = 0;
            if (var11 >= 0 || var12 != 0) {
                int var14 = class24.field131[81] ? field571 : field781;
                var13 = var14 * 16;
                field498 = var11;
                field584 = var12;
            }
            if (field582 < var13) {
                field582 += var13 / 8;
                if (field582 > var13) {
                    field582 = var13;
                }
            } else if (field582 > var13) {
                field582 = field582 * 9 / 10;
            }
            if (field582 > 0) {
                int var15 = field582 / 16;
                if (field498 >= 0) {
                    int var16 = field498 - Statics.field42 & 0x7FF;
                    int var17 = class194.field2271[var16];
                    int var18 = class194.field2280[var16];
                    Statics.field182 += var15 * var17 / 65536;
                    Statics.field1492 += var15 * var18 / 65536;
                }
                if (field584 != 0) {
                    Statics.field3219 += field584 * var15;
                    if (Statics.field3219 > 0) {
                        Statics.field3219 = 0;
                    }
                }
            } else {
                field498 = -1;
                field584 = -1;
            }
            if (class24.field131[13]) {
                field551.method2268(class257.method2630(class255.field2892, field551.field1319));
                field580 = 0;
            }
        }
        if (class33.field227 == 4 && Statics.field4238) {
            int var19 = class33.field229 - field739;
            field577 = var19 * 2;
            field739 = var19 == -1 || var19 == 1 ? class33.field229 : (field739 + class33.field229) / 2;
            int var20 = field578 - class33.field223;
            field568 = var20 * 2;
            field578 = var20 == -1 || var20 == 1 ? class33.field223 : (field578 + class33.field223) / 2;
        } else {
            if (class24.field131[96]) {
                field568 += (-24 - field568) / 2;
            } else if (class24.field131[97]) {
                field568 += (24 - field568) / 2;
            } else {
                field568 /= 2;
            }
            if (class24.field131[98]) {
                field577 += (12 - field577) / 2;
            } else if (class24.field131[99]) {
                field577 += (-12 - field577) / 2;
            } else {
                field577 /= 2;
            }
            field739 = class33.field229;
            field578 = class33.field223;
        }
        field575 = field568 / 2 + field575 & 0x7FF;
        field574 += field577 / 2;
        if (field574 < 128) {
            field574 = 128;
        }
        if (field574 > 383) {
            field574 = 383;
        }
    }

    @ObfuscatedName("df.gl(B)V")
    public static final void method2370() {
        for (int var0 = 0; var0 < field547; var0++) {
            int var1 = field548[var0];
            class91 var2 = field546[var1];
            if (var2 != null) {
                method5555(var2, var2.field1247.field1854);
            }
        }
    }

    @ObfuscatedName("lj.gd(Lcq;IB)V")
    public static final void method5555(class85 arg0, int arg1) {
        if (arg0.field1158 >= field682) {
            int var2 = Math.max(1, arg0.field1158 - field682);
            int var3 = arg0.field1154 * 128 + arg0.field1114 * 64;
            int var4 = arg0.field1145 * 128 + arg0.field1114 * 64;
            arg0.field1161 += (var3 - arg0.field1161) / var2;
            arg0.field1152 += (var4 - arg0.field1152) / var2;
            arg0.field1176 = 0;
            arg0.field1169 = arg0.field1160;
        } else if (arg0.field1159 >= field682) {
            if (field682 == arg0.field1159 || arg0.field1144 == -1 || arg0.field1127 != 0 || arg0.field1146 + 1 > class183.method1980(arg0.field1144).field2094[arg0.field1162]) {
                int var5 = arg0.field1159 - arg0.field1158;
                int var6 = field682 - arg0.field1158;
                int var7 = arg0.field1154 * 128 + arg0.field1114 * 64;
                int var8 = arg0.field1145 * 128 + arg0.field1114 * 64;
                int var9 = arg0.field1148 * 128 + arg0.field1114 * 64;
                int var10 = arg0.field1157 * 128 + arg0.field1114 * 64;
                arg0.field1161 = ((var5 - var6) * var7 + var6 * var9) / var5;
                arg0.field1152 = ((var5 - var6) * var8 + var6 * var10) / var5;
            }
            arg0.field1176 = 0;
            arg0.field1169 = arg0.field1160;
            arg0.field1112 = arg0.field1169;
        } else {
            method215(arg0);
        }
        if (arg0.field1161 < 128 || arg0.field1152 < 128 || arg0.field1161 >= 13184 || arg0.field1152 >= 13184) {
            arg0.field1144 = -1;
            arg0.field1155 = -1;
            arg0.field1158 = 0;
            arg0.field1159 = 0;
            arg0.field1161 = arg0.field1173[0] * 128 + arg0.field1114 * 64;
            arg0.field1152 = arg0.field1147[0] * 128 + arg0.field1114 * 64;
            arg0.method2057();
        }
        if (Statics.field2754 == arg0 && (arg0.field1161 < 1536 || arg0.field1152 < 1536 || arg0.field1161 >= 11776 || arg0.field1152 >= 11776)) {
            arg0.field1144 = -1;
            arg0.field1155 = -1;
            arg0.field1158 = 0;
            arg0.field1159 = 0;
            arg0.field1161 = arg0.field1173[0] * 128 + arg0.field1114 * 64;
            arg0.field1152 = arg0.field1147[0] * 128 + arg0.field1114 * 64;
            arg0.method2057();
        }
        if (arg0.field1171 != 0) {
            if (arg0.field1174 != -1) {
                class85 var11 = null;
                if (arg0.field1174 < 32768) {
                    var11 = field546[arg0.field1174];
                } else if (arg0.field1174 >= 32768) {
                    var11 = field619[arg0.field1174 - 32768];
                }
                if (var11 != null) {
                    int var12 = arg0.field1161 - var11.field1161;
                    int var13 = arg0.field1152 - var11.field1152;
                    if (var12 != 0 || var13 != 0) {
                        arg0.field1169 = (int) (Math.atan2((double) var12, (double) var13) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field1166) {
                    arg0.field1174 = -1;
                    arg0.field1166 = false;
                }
            }
            if (arg0.field1139 != -1 && (arg0.field1172 == 0 || arg0.field1176 > 0)) {
                arg0.field1169 = arg0.field1139;
                arg0.field1139 = -1;
            }
            int var14 = arg0.field1169 - arg0.field1112 & 0x7FF;
            if (var14 == 0 && arg0.field1166) {
                arg0.field1174 = -1;
                arg0.field1166 = false;
            }
            if (var14 == 0) {
                arg0.field1170 = 0;
            } else {
                arg0.field1170++;
                if (var14 > 1024) {
                    arg0.field1112 -= arg0.field1140 ? var14 : arg0.field1171;
                    boolean var15 = true;
                    if (var14 < arg0.field1171 || var14 > 2048 - arg0.field1171) {
                        arg0.field1112 = arg0.field1169;
                        var15 = false;
                    }
                    if (!arg0.field1140 && arg0.field1141 == arg0.field1116 && (arg0.field1170 > 25 || var15)) {
                        if (arg0.field1117 == -1) {
                            arg0.field1141 = arg0.field1119;
                        } else {
                            arg0.field1141 = arg0.field1117;
                        }
                    }
                } else {
                    arg0.field1112 += arg0.field1140 ? var14 : arg0.field1171;
                    boolean var16 = true;
                    if (var14 < arg0.field1171 || var14 > 2048 - arg0.field1171) {
                        arg0.field1112 = arg0.field1169;
                        var16 = false;
                    }
                    if (!arg0.field1140 && arg0.field1141 == arg0.field1116 && (arg0.field1170 > 25 || var16)) {
                        if (arg0.field1149 == -1) {
                            arg0.field1141 = arg0.field1119;
                        } else {
                            arg0.field1141 = arg0.field1149;
                        }
                    }
                }
                arg0.field1112 &= 0x7FF;
                arg0.field1140 = false;
            }
        }
        method4944(arg0);
    }

    @ObfuscatedName("m.gr(Lcq;I)V")
    public static final void method215(class85 arg0) {
        arg0.field1141 = arg0.field1116;
        if (arg0.field1172 == 0) {
            arg0.field1176 = 0;
            return;
        }
        if (arg0.field1144 != -1 && arg0.field1127 == 0) {
            class183 var1 = class183.method1980(arg0.field1144);
            if (arg0.field1177 > 0 && var1.field2108 == 0) {
                arg0.field1176++;
                return;
            }
            if (arg0.field1177 <= 0 && var1.field2100 == 0) {
                arg0.field1176++;
                return;
            }
        }
        int var2 = arg0.field1161;
        int var3 = arg0.field1152;
        int var4 = arg0.field1173[arg0.field1172 - 1] * 128 + arg0.field1114 * 64;
        int var5 = arg0.field1147[arg0.field1172 - 1] * 128 + arg0.field1114 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field1169 = 1280;
            } else if (var3 > var5) {
                arg0.field1169 = 1792;
            } else {
                arg0.field1169 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field1169 = 768;
            } else if (var3 > var5) {
                arg0.field1169 = 256;
            } else {
                arg0.field1169 = 512;
            }
        } else if (var3 < var5) {
            arg0.field1169 = 1024;
        } else if (var3 > var5) {
            arg0.field1169 = 0;
        }
        class186 var6 = arg0.field1175[arg0.field1172 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field1161 = var4;
            arg0.field1152 = var5;
            arg0.field1172--;
            if (arg0.field1177 > 0) {
                arg0.field1177--;
            }
            return;
        }
        int var7 = arg0.field1169 - arg0.field1112 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field1120;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field1119;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field1122;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field1121;
        }
        if (var8 == -1) {
            var8 = arg0.field1119;
        }
        arg0.field1141 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class91) {
            var10 = ((class91) arg0).field1247.field1863;
        }
        if (var10) {
            if (arg0.field1169 != arg0.field1112 && arg0.field1174 == -1 && arg0.field1171 != 0) {
                var9 = 2;
            }
            if (arg0.field1172 > 2) {
                var9 = 6;
            }
            if (arg0.field1172 > 3) {
                var9 = 8;
            }
            if (arg0.field1176 > 0 && arg0.field1172 > 1) {
                var9 = 8;
                arg0.field1176--;
            }
        } else {
            if (arg0.field1172 > 1) {
                var9 = 6;
            }
            if (arg0.field1172 > 2) {
                var9 = 8;
            }
            if (arg0.field1176 > 0 && arg0.field1172 > 1) {
                var9 = 8;
                arg0.field1176--;
            }
        }
        if (class186.field2133 == var6) {
            var9 <<= 0x1;
        } else if (class186.field2134 == var6) {
            var9 >>= 0x1;
        }
        if (var9 >= 8 && arg0.field1141 == arg0.field1119 && arg0.field1132 != -1) {
            arg0.field1141 = arg0.field1132;
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field1161 += var9;
                if (arg0.field1161 > var4) {
                    arg0.field1161 = var4;
                }
            } else if (var2 > var4) {
                arg0.field1161 -= var9;
                if (arg0.field1161 < var4) {
                    arg0.field1161 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field1152 += var9;
                if (arg0.field1152 > var5) {
                    arg0.field1152 = var5;
                }
            } else if (var3 > var5) {
                arg0.field1152 -= var9;
                if (arg0.field1152 < var5) {
                    arg0.field1152 = var5;
                }
            }
        }
        if (arg0.field1161 == var4 && arg0.field1152 == var5) {
            arg0.field1172--;
            if (arg0.field1177 > 0) {
                arg0.field1177--;
            }
        }
    }

    @ObfuscatedName("kn.gq(Lcq;B)V")
    public static final void method4944(class85 arg0) {
        arg0.field1113 = false;
        if (arg0.field1141 != -1) {
            class183 var1 = class183.method1980(arg0.field1141);
            if (var1 == null) {
                arg0.field1141 = -1;
            } else if (!var1.method3284() && var1.field2107 != null) {
                arg0.field1143++;
                if (arg0.field1142 < var1.field2107.length && arg0.field1143 > var1.field2094[arg0.field1142]) {
                    arg0.field1143 = 1;
                    arg0.field1142++;
                    method1865(var1, arg0.field1142, arg0.field1161, arg0.field1152);
                }
                if (arg0.field1142 >= var1.field2107.length) {
                    arg0.field1143 = 0;
                    arg0.field1142 = 0;
                    method1865(var1, arg0.field1142, arg0.field1161, arg0.field1152);
                }
            } else if (var1.method3284()) {
                arg0.field1142++;
                int var2 = var1.method3321();
                if (arg0.field1142 < var2) {
                    method5550(var1, arg0.field1142, arg0.field1161, arg0.field1152);
                } else {
                    arg0.field1143 = 0;
                    arg0.field1142 = 0;
                    method5550(var1, arg0.field1142, arg0.field1161, arg0.field1152);
                }
            } else {
                arg0.field1141 = -1;
            }
        }
        if (arg0.field1155 != -1 && field682 >= arg0.field1178) {
            if (arg0.field1150 < 0) {
                arg0.field1150 = 0;
            }
            int var3 = class173.method4901(arg0.field1155).field1900;
            if (var3 == -1) {
                arg0.field1155 = -1;
            } else {
                class183 var4 = class183.method1980(var3);
                if (var4 != null && var4.field2107 != null) {
                    arg0.field1151++;
                    if (arg0.field1150 < var4.field2107.length && arg0.field1151 > var4.field2094[arg0.field1150]) {
                        arg0.field1151 = 1;
                        arg0.field1150++;
                        method1865(var4, arg0.field1150, arg0.field1161, arg0.field1152);
                    }
                    if (arg0.field1150 >= var4.field2107.length && (arg0.field1150 < 0 || arg0.field1150 >= var4.field2107.length)) {
                        arg0.field1155 = -1;
                    }
                } else if (var4.method3284()) {
                    arg0.field1150++;
                    int var5 = var4.method3321();
                    if (arg0.field1150 < var5) {
                        method5550(var4, arg0.field1150, arg0.field1161, arg0.field1152);
                    } else if (arg0.field1150 < 0 || arg0.field1150 >= var5) {
                        arg0.field1155 = -1;
                    }
                } else {
                    arg0.field1155 = -1;
                }
            }
        }
        if (arg0.field1144 != -1 && arg0.field1127 <= 1) {
            class183 var6 = class183.method1980(arg0.field1144);
            if (var6.field2108 == 1 && arg0.field1177 > 0 && arg0.field1158 <= field682 && arg0.field1159 < field682) {
                arg0.field1127 = 1;
                return;
            }
        }
        if (arg0.field1144 != -1 && arg0.field1127 == 0) {
            class183 var7 = class183.method1980(arg0.field1144);
            if (var7 == null) {
                arg0.field1144 = -1;
            } else if (!var7.method3284() && var7.field2107 != null) {
                arg0.field1146++;
                if (arg0.field1162 < var7.field2107.length && arg0.field1146 > var7.field2094[arg0.field1162]) {
                    arg0.field1146 = 1;
                    arg0.field1162++;
                    method1865(var7, arg0.field1162, arg0.field1161, arg0.field1152);
                }
                if (arg0.field1162 >= var7.field2107.length) {
                    arg0.field1162 -= var7.field2111;
                    arg0.field1130++;
                    if (arg0.field1130 >= var7.field2109) {
                        arg0.field1144 = -1;
                    } else if (arg0.field1162 >= 0 && arg0.field1162 < var7.field2107.length) {
                        method1865(var7, arg0.field1162, arg0.field1161, arg0.field1152);
                    } else {
                        arg0.field1144 = -1;
                    }
                }
                arg0.field1113 = var7.field2103;
            } else if (var7.method3284()) {
                arg0.field1162++;
                int var8 = var7.method3286().method2560();
                if (arg0.field1162 < var8) {
                    method5550(var7, arg0.field1162, arg0.field1161, arg0.field1152);
                } else {
                    arg0.field1162 -= var7.field2111;
                    arg0.field1130++;
                    if (arg0.field1130 >= var7.field2109) {
                        arg0.field1144 = -1;
                    } else if (arg0.field1162 >= 0 && arg0.field1162 < var8) {
                        method5550(var7, arg0.field1162, arg0.field1161, arg0.field1152);
                    } else {
                        arg0.field1144 = -1;
                    }
                }
            } else {
                arg0.field1144 = -1;
            }
        }
        if (arg0.field1127 > 0) {
            arg0.field1127--;
        }
    }

    @ObfuscatedName("bp.go(Lcw;III)V")
    public static void method1978(class83 arg0, int arg1, int arg2) {
        if (arg0.field1144 == arg1 && arg1 != -1) {
            int var3 = class183.method1980(arg1).field2110;
            if (var3 == 1) {
                arg0.field1162 = 0;
                arg0.field1146 = 0;
                arg0.field1127 = arg2;
                arg0.field1130 = 0;
            }
            if (var3 == 2) {
                arg0.field1130 = 0;
            }
        } else if (arg1 == -1 || arg0.field1144 == -1 || class183.method1980(arg1).field2096 >= class183.method1980(arg0.field1144).field2096) {
            arg0.field1144 = arg1;
            arg0.field1162 = 0;
            arg0.field1146 = 0;
            arg0.field1127 = arg2;
            arg0.field1130 = 0;
            arg0.field1177 = arg0.field1172;
        }
    }

    @ObfuscatedName("mt.gy(I)I")
    public static int method5641() {
        return field635 ? 2 : 1;
    }

    @ObfuscatedName("hh.ge(II)V")
    public static void method3962(int arg0) {
        field765 = 0L;
        if (arg0 >= 2) {
            field635 = true;
        } else {
            field635 = false;
        }
        if (method5641() == 1) {
            Statics.field4489.method429(765, 503);
        } else {
            Statics.field4489.method429(7680, 2160);
        }
        if (field731 >= 25) {
            method6181();
        }
    }

    @ObfuscatedName("oh.gc(I)V")
    public static void method6181() {
        class257 var0 = class257.method2630(class255.field2866, field551.field1319);
        var0.field2960.method6644(method5641());
        var0.field2960.method6757(Statics.field3209);
        var0.field2960.method6757(Statics.field1246);
        field551.method2268(var0);
    }

    @ObfuscatedName("client.h(I)V")
    public final void method436() {
        field765 = class262.method4787() + 500L;
        this.method1064();
        if (field725 != -1) {
            this.method1070(true);
        }
    }

    @ObfuscatedName("client.gb(I)V")
    public void method1064() {
        int var1 = Statics.field3209;
        int var2 = Statics.field1246;
        if (this.field197 < var1) {
            int var3 = this.field197;
        }
        if (this.field198 < var2) {
            int var4 = this.field198;
        }
        if (Statics.field4567 != null) {
            try {
                class28.method392(Statics.field4489, "resize", new Object[] { method5641() });
            } catch (Throwable var6) {
            }
        }
    }

    @ObfuscatedName("client.ga(I)V")
    public final void method1063() {
        if (field725 != -1) {
            int var1 = field725;
            if (class286.method159(var1)) {
                method2003(Statics.field3290[var1], -1);
            }
        }
        for (int var2 = 0; var2 < field712; var2++) {
            if (field714[var2]) {
                field715[var2] = true;
            }
            field716[var2] = field714[var2];
            field714[var2] = false;
        }
        field713 = field682;
        field654 = -1;
        field655 = -1;
        Statics.field1248 = null;
        if (field725 != -1) {
            field712 = 0;
            method2342(field725, 0, 0, Statics.field3209, Statics.field1246, 0, 0, -1);
        }
        class430.method6949();
        if (field610) {
            if (field621 == 1) {
                Statics.field2678[field608 / 100].method7066(field694 - 8, field505 - 8);
            }
            if (field621 == 2) {
                Statics.field2678[field608 / 100 + 4].method7066(field694 - 8, field505 - 8);
            }
        }
        if (field691) {
            int var3 = Statics.field955;
            int var4 = Statics.field259;
            int var5 = Statics.field3205;
            int var6 = Statics.field470;
            int var7 = 6116423;
            class430.method6958(var3, var4, var5, var6, var7);
            class430.method6958(var3 + 1, var4 + 1, var5 - 2, 16, 0);
            class430.method6959(var3 + 1, var4 + 18, var5 - 2, var6 - 19, 0);
            Statics.field4479.method5446(class300.field3690, var3 + 3, var4 + 14, var7, -1);
            int var8 = class33.field223;
            int var9 = class33.field229;
            for (int var10 = 0; var10 < field733; var10++) {
                int var11 = (field733 - 1 - var10) * 15 + var4 + 31;
                int var12 = 16777215;
                if (var8 > var3 && var8 < var3 + var5 && var9 > var11 - 13 && var9 < var11 + 3) {
                    var12 = 16776960;
                }
                Statics.field4479.method5446(method2710(var10), var3 + 3, var11, var12, 0);
            }
            method2599(Statics.field955, Statics.field259, Statics.field3205, Statics.field470);
        } else if (field654 != -1) {
            method2112(field654, field655);
        }
        if (field583 == 3) {
            for (int var13 = 0; var13 < field712; var13++) {
                if (field716[var13]) {
                    class430.method6997(field573[var13], field718[var13], field703[var13], field599[var13], 16711935, 128);
                } else if (field715[var13]) {
                    class430.method6997(field573[var13], field718[var13], field703[var13], field599[var13], 16711680, 128);
                }
            }
        }
        class63.method775(Statics.field325, Statics.field2754.field1161, Statics.field2754.field1152, field567);
        field567 = 0;
    }

    @ObfuscatedName("jx.gs(Ljava/lang/String;ZI)V")
    public static final void method4786(String arg0, boolean arg1) {
        if (!field620) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field1275.method5497(arg0, 250);
        int var6 = Statics.field1275.method5443(arg0, 250) * 13;
        class430.method6958(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class430.method6959(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field1275.method5519(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method3937(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field309.method427(0, 0);
        } else {
            method2599(var3, var4, var5, var6);
        }
    }

    @ObfuscatedName("jt.gn(IIIII)V")
    public static final void method4828(int arg0, int arg1, int arg2, int arg3) {
        field603++;
        if (Statics.field2754.field1161 >> 7 == field741 && Statics.field2754.field1152 >> 7 == field742) {
            field741 = 0;
        }
        if (field638) {
            method4324(Statics.field2754, false);
        }
        method5026();
        method4504(true);
        int var4 = class96.field1280;
        int[] var5 = class96.field1281;
        for (int var6 = 0; var6 < var4; var6++) {
            if (field632 != var5[var6] && field576 != var5[var6]) {
                method4324(field619[var5[var6]], true);
            }
        }
        method4504(false);
        for (class70 var7 = (class70) field759.method5269(); var7 != null; var7 = (class70) field759.method5270()) {
            if (Statics.field325 != var7.field936 || field682 > var7.field935) {
                var7.method6167();
            } else if (field682 >= var7.field945) {
                if (var7.field938 > 0) {
                    class91 var8 = field546[var7.field938 - 1];
                    if (var8 != null && var8.field1161 >= 0 && var8.field1161 < 13312 && var8.field1152 >= 0 && var8.field1152 < 13312) {
                        var7.method1870(var8.field1161, var8.field1152, method2169(var8.field1161, var8.field1152, var7.field936) - var7.field933, field682);
                    }
                }
                if (var7.field938 < 0) {
                    int var9 = -var7.field938 - 1;
                    class83 var10;
                    if (field576 == var9) {
                        var10 = Statics.field2754;
                    } else {
                        var10 = field619[var9];
                    }
                    if (var10 != null && var10.field1161 >= 0 && var10.field1161 < 13312 && var10.field1152 >= 0 && var10.field1152 < 13312) {
                        var7.method1870(var10.field1161, var10.field1152, method2169(var10.field1161, var10.field1152, var7.field936) - var7.field933, field682);
                    }
                }
                var7.method1868(field567);
                Statics.field415.method3583(Statics.field325, (int) var7.field940, (int) var7.field941, (int) var7.field942, 60, var7, var7.field948, -1L, false);
            }
        }
        method4491();
        method2586(arg0, arg1, arg2, arg3, true);
        int var11 = field767;
        int var12 = field768;
        int var13 = field524;
        int var14 = field614;
        class430.method6950(var11, var12, var11 + var13, var12 + var14);
        class194.method3490();
        int var15 = field574;
        if (field591 / 256 > var15) {
            var15 = field591 / 256;
        }
        if (field754[4] && field734[4] + 128 > var15) {
            var15 = field734[4] + 128;
        }
        int var16 = field575 & 0x7FF;
        int var17 = Statics.field182;
        int var18 = Statics.field3219;
        int var19 = Statics.field1492;
        int var22 = var15 * 3 + 600;
        Statics.method1983(var17, var18, var19, var15, var16, var22, var14);
        int var35;
        if (field752) {
            int var36;
            if (Statics.field4567.field1221) {
                var36 = Statics.field325;
            } else {
                int var37 = method2169(Statics.field4498, Statics.field494, Statics.field325);
                if (var37 - Statics.field2749 >= 800 || (class75.field994[Statics.field325][Statics.field4498 >> 7][Statics.field494 >> 7] & 0x4) == 0) {
                    var36 = 3;
                } else {
                    var36 = Statics.field325;
                }
            }
            var35 = var36;
        } else {
            int var23;
            if (Statics.field4567.field1221) {
                var23 = Statics.field325;
            } else {
                label525: {
                    int var24 = 3;
                    if (Statics.field33 < 310) {
                        int var25;
                        int var26;
                        if (field580 == 1) {
                            var25 = Statics.field182 >> 7;
                            var26 = Statics.field1492 >> 7;
                        } else {
                            var25 = Statics.field2754.field1161 >> 7;
                            var26 = Statics.field2754.field1152 >> 7;
                        }
                        int var27 = Statics.field4498 >> 7;
                        int var28 = Statics.field494 >> 7;
                        if (var27 < 0 || var28 < 0 || var27 >= 104 || var28 >= 104) {
                            var23 = Statics.field325;
                            break label525;
                        }
                        if (var25 < 0 || var26 < 0 || var25 >= 104 || var26 >= 104) {
                            var23 = Statics.field325;
                            break label525;
                        }
                        if ((class75.field994[Statics.field325][var27][var28] & 0x4) != 0) {
                            var24 = Statics.field325;
                        }
                        int var29;
                        if (var25 > var27) {
                            var29 = var25 - var27;
                        } else {
                            var29 = var27 - var25;
                        }
                        int var30;
                        if (var26 > var28) {
                            var30 = var26 - var28;
                        } else {
                            var30 = var28 - var26;
                        }
                        if (var29 > var30) {
                            int var31 = var30 * 65536 / var29;
                            int var32 = 32768;
                            while (var25 != var27) {
                                if (var27 < var25) {
                                    var27++;
                                } else if (var27 > var25) {
                                    var27--;
                                }
                                if ((class75.field994[Statics.field325][var27][var28] & 0x4) != 0) {
                                    var24 = Statics.field325;
                                }
                                var32 += var31;
                                if (var32 >= 65536) {
                                    var32 -= 65536;
                                    if (var28 < var26) {
                                        var28++;
                                    } else if (var28 > var26) {
                                        var28--;
                                    }
                                    if ((class75.field994[Statics.field325][var27][var28] & 0x4) != 0) {
                                        var24 = Statics.field325;
                                    }
                                }
                            }
                        } else if (var30 > 0) {
                            int var33 = var29 * 65536 / var30;
                            int var34 = 32768;
                            while (var26 != var28) {
                                if (var28 < var26) {
                                    var28++;
                                } else if (var28 > var26) {
                                    var28--;
                                }
                                if ((class75.field994[Statics.field325][var27][var28] & 0x4) != 0) {
                                    var24 = Statics.field325;
                                }
                                var34 += var33;
                                if (var34 >= 65536) {
                                    var34 -= 65536;
                                    if (var27 < var25) {
                                        var27++;
                                    } else if (var27 > var25) {
                                        var27--;
                                    }
                                    if ((class75.field994[Statics.field325][var27][var28] & 0x4) != 0) {
                                        var24 = Statics.field325;
                                    }
                                }
                            }
                        }
                    }
                    if (Statics.field2754.field1161 >= 0 && Statics.field2754.field1152 >= 0 && Statics.field2754.field1161 < 13312 && Statics.field2754.field1152 < 13312) {
                        if ((class75.field994[Statics.field325][Statics.field2754.field1161 >> 7][Statics.field2754.field1152 >> 7] & 0x4) != 0) {
                            var24 = Statics.field325;
                        }
                        var23 = var24;
                    } else {
                        var23 = Statics.field325;
                    }
                }
            }
            var35 = var23;
        }
        int var38 = Statics.field4498;
        int var39 = Statics.field2749;
        int var40 = Statics.field494;
        int var41 = Statics.field33;
        int var42 = Statics.field42;
        for (int var43 = 0; var43 < 5; var43++) {
            if (field754[var43]) {
                int var44 = (int) (Math.random() * (double) (field755[var43] * 2 + 1) - (double) field755[var43] + Math.sin((double) field501[var43] / 100.0D * (double) field758[var43]) * (double) field734[var43]);
                if (var43 == 0) {
                    Statics.field4498 += var44;
                }
                if (var43 == 1) {
                    Statics.field2749 += var44;
                }
                if (var43 == 2) {
                    Statics.field494 += var44;
                }
                if (var43 == 3) {
                    Statics.field42 = Statics.field42 + var44 & 0x7FF;
                }
                if (var43 == 4) {
                    Statics.field33 += var44;
                    if (Statics.field33 < 128) {
                        Statics.field33 = 128;
                    }
                    if (Statics.field33 > 383) {
                        Statics.field33 = 383;
                    }
                }
            }
        }
        int var45 = class33.field223;
        int var46 = class33.field229;
        if (class33.field235 != 0) {
            var45 = class33.field236;
            var46 = class33.field237;
        }
        if (var45 >= var11 && var45 < var11 + var13 && var46 >= var12 && var46 < var12 + var14) {
            int var47 = var45 - var11;
            int var48 = var46 - var12;
            class205.field2521 = var47;
            class205.field2515 = var48;
            class205.field2524 = true;
            class205.field2520 = 0;
            class205.field2516 = false;
        } else {
            class205.method256();
        }
        method2572();
        class430.method6958(var11, var12, var13, var14, 0);
        method2572();
        int var49 = class194.field2285;
        class194.field2285 = field771;
        Statics.field415.method3613(Statics.field4498, Statics.field2749, Statics.field494, Statics.field33, Statics.field42, var35);
        class194.field2285 = var49;
        method2572();
        Statics.field415.method3586();
        field766 = 0;
        boolean var50 = false;
        int var51 = -1;
        int var52 = -1;
        int var53 = class96.field1280;
        int[] var54 = class96.field1281;
        for (int var55 = 0; var55 < field547 + var53; var55++) {
            class85 var56;
            if (var55 < var53) {
                var56 = field619[var54[var55]];
                if (field632 == var54[var55]) {
                    var50 = true;
                    var51 = var55;
                    continue;
                }
                if (Statics.field2754 == var56) {
                    var52 = var55;
                    continue;
                }
            } else {
                var56 = field546[field548[var55 - var53]];
            }
            method271(var56, var55, var11, var12, var13, var14);
        }
        if (field638 && var52 != -1) {
            method271(Statics.field2754, var52, var11, var12, var13, var14);
        }
        if (var50) {
            method271(field619[field632], var51, var11, var12, var13, var14);
        }
        for (int var57 = 0; var57 < field766; var57++) {
            int var58 = field594[var57];
            int var59 = field595[var57];
            int var60 = field597[var57];
            int var61 = field596[var57];
            boolean var62 = true;
            while (var62) {
                var62 = false;
                for (int var63 = 0; var63 < var57; var63++) {
                    if (var59 + 2 > field595[var63] - field596[var63] && var59 - var61 < field595[var63] + 2 && var58 - var60 < field597[var63] + field594[var63] && var58 + var60 > field594[var63] - field597[var63] && field595[var63] - field596[var63] < var59) {
                        var59 = field595[var63] - field596[var63];
                        var62 = true;
                    }
                }
            }
            field671 = field594[var57];
            field605 = field595[var57] = var59;
            String var64 = field650[var57];
            if (field625 == 0) {
                int var65 = 16776960;
                if (field664[var57] < 6) {
                    var65 = field724[field664[var57]];
                }
                if (field664[var57] == 6) {
                    var65 = field603 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field664[var57] == 7) {
                    var65 = field603 % 20 < 10 ? 255 : 65535;
                }
                if (field664[var57] == 8) {
                    var65 = field603 % 20 < 10 ? 45056 : 8454016;
                }
                if (field664[var57] == 9) {
                    int var66 = 150 - field600[var57];
                    if (var66 < 50) {
                        var65 = var66 * 1280 + 16711680;
                    } else if (var66 < 100) {
                        var65 = 16776960 - (var66 - 50) * 327680;
                    } else if (var66 < 150) {
                        var65 = (var66 - 100) * 5 + 65280;
                    }
                }
                if (field664[var57] == 10) {
                    int var67 = 150 - field600[var57];
                    if (var67 < 50) {
                        var65 = var67 * 5 + 16711680;
                    } else if (var67 < 100) {
                        var65 = 16711935 - (var67 - 50) * 327680;
                    } else if (var67 < 150) {
                        var65 = (var67 - 100) * 327680 + 255 - (var67 - 100) * 5;
                    }
                }
                if (field664[var57] == 11) {
                    int var68 = 150 - field600[var57];
                    if (var68 < 50) {
                        var65 = 16777215 - var68 * 327685;
                    } else if (var68 < 100) {
                        var65 = (var68 - 50) * 327685 + 65280;
                    } else if (var68 < 150) {
                        var65 = 16777215 - (var68 - 100) * 327680;
                    }
                }
                if (field753[var57] == 0) {
                    Statics.field4479.method5449(var64, field671 + var11, field605 + var12, var65, 0);
                }
                if (field753[var57] == 1) {
                    Statics.field4479.method5474(var64, field671 + var11, field605 + var12, var65, 0, field603);
                }
                if (field753[var57] == 2) {
                    Statics.field4479.method5452(var64, field671 + var11, field605 + var12, var65, 0, field603);
                }
                if (field753[var57] == 3) {
                    Statics.field4479.method5453(var64, field671 + var11, field605 + var12, var65, 0, field603, 150 - field600[var57]);
                }
                if (field753[var57] == 4) {
                    int var69 = (150 - field600[var57]) * (Statics.field4479.method5441(var64) + 100) / 150;
                    class430.method6951(field671 + var11 - 50, var12, field671 + var11 + 50, var12 + var14);
                    Statics.field4479.method5446(var64, field671 + var11 + 50 - var69, field605 + var12, var65, 0);
                    class430.method6950(var11, var12, var11 + var13, var12 + var14);
                }
                if (field753[var57] == 5) {
                    int var70 = 150 - field600[var57];
                    int var71 = 0;
                    if (var70 < 25) {
                        var71 = var70 - 25;
                    } else if (var70 > 125) {
                        var71 = var70 - 125;
                    }
                    class430.method6951(var11, field605 + var12 - Statics.field4479.field4045 - 1, var11 + var13, field605 + var12 + 5);
                    Statics.field4479.method5449(var64, field671 + var11, field605 + var12 + var71, var65, 0);
                    class430.method6950(var11, var12, var11 + var13, var12 + var14);
                }
            } else {
                Statics.field4479.method5449(var64, field671 + var11, field605 + var12, 16776960, 0);
            }
        }
        method6014(var11, var12);
        ((class202) Statics.field2281).method3781(field567);
        method760();
        Statics.field4498 = var38;
        Statics.field2749 = var39;
        Statics.field494 = var40;
        Statics.field33 = var41;
        Statics.field42 = var42;
        if (field506) {
            byte var72 = 0;
            int var73 = class308.field3921 + class308.field3918 + var72;
            if (var73 == 0) {
                field506 = false;
            }
        }
        if (field506) {
            class430.method6958(var11, var12, var13, var14, 0);
            method4786(class300.field3535, false);
        }
    }

    @ObfuscatedName("dg.gp(IIIIZB)V")
    public static final void method2586(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var5 = arg3 - 334;
        int var6;
        if (var5 < 0) {
            var6 = field776;
        } else if (var5 >= 100) {
            var6 = field760;
        } else {
            var6 = (field760 - field776) * var5 / 100 + field776;
        }
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field657) {
            short var8 = field657;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field764) {
                var6 = field764;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class430.method6949();
                    class430.method6958(arg0, arg1, var10, arg3, -16777216);
                    class430.method6958(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field515) {
            short var11 = field515;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field763) {
                var6 = field763;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class430.method6949();
                    class430.method6958(arg0, arg1, arg2, var13, -16777216);
                    class430.method6958(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field771 = arg3 * var6 / 334;
        if (field524 != arg2 || field614 != arg3) {
            method2802(arg2, arg3);
        }
        field767 = arg0;
        field768 = arg1;
        field524 = arg2;
        field614 = arg3;
    }

    @ObfuscatedName("ki.gk(B)V")
    public static void method5026() {
        if (field632 >= 0 && field619[field632] != null) {
            method4324(field619[field632], false);
        }
    }

    @ObfuscatedName("hx.gu(Lcw;ZI)V")
    public static void method4324(class83 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method2015() || arg0.field1086) {
            return;
        }
        arg0.field1065 = false;
        if ((field500 && class96.field1280 > 50 || class96.field1280 > 200) && arg1 && arg0.field1141 == arg0.field1116) {
            arg0.field1065 = true;
        }
        int var2 = arg0.field1161 >> 7;
        int var3 = arg0.field1152 >> 7;
        if (var2 < 0 || var2 >= 104 || var3 < 0 || var3 >= 104) {
            return;
        }
        long var4 = class205.method1993(0, 0, 0, false, arg0.field1088);
        if (arg0.field1079 != null && field682 >= arg0.field1074 && field682 < arg0.field1075) {
            arg0.field1065 = false;
            arg0.field1082 = method2169(arg0.field1161, arg0.field1152, Statics.field325);
            arg0.field1115 = field682;
            Statics.field415.method3584(Statics.field325, arg0.field1161, arg0.field1152, arg0.field1082, 60, arg0, arg0.field1112, var4, arg0.field1067, arg0.field1081, arg0.field1080, arg0.field1083);
            return;
        }
        if ((arg0.field1161 & 0x7F) == 64 && (arg0.field1152 & 0x7F) == 64) {
            if (field603 == field602[var2][var3]) {
                return;
            }
            field602[var2][var3] = field603;
        }
        arg0.field1082 = method2169(arg0.field1161, arg0.field1152, Statics.field325);
        arg0.field1115 = field682;
        Statics.field415.method3583(Statics.field325, arg0.field1161, arg0.field1152, arg0.field1082, 60, arg0, arg0.field1112, var4, arg0.field1113);
    }

    @ObfuscatedName("ii.gg(ZI)V")
    public static final void method4504(boolean arg0) {
        for (int var1 = 0; var1 < field547; var1++) {
            class91 var2 = field546[field548[var1]];
            if (var2 != null && var2.method2015() && var2.field1247.field1873 == arg0 && var2.field1247.method2974()) {
                int var3 = var2.field1161 >> 7;
                int var4 = var2.field1152 >> 7;
                if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
                    if (var2.field1114 == 1 && (var2.field1161 & 0x7F) == 64 && (var2.field1152 & 0x7F) == 64) {
                        if (field603 == field602[var3][var4]) {
                            continue;
                        }
                        field602[var3][var4] = field603;
                    }
                    long var5 = class205.method1993(0, 0, 1, !var2.field1247.field1878, field548[var1]);
                    var2.field1115 = field682;
                    Statics.field415.method3583(Statics.field325, var2.field1161, var2.field1152, method2169(var2.field1161 + (var2.field1114 * 64 - 64), var2.field1152 + (var2.field1114 * 64 - 64), Statics.field325), var2.field1114 * 64 - 64 + 60, var2, var2.field1112, var5, var2.field1113);
                }
            }
        }
    }

    @ObfuscatedName("ie.gw(B)V")
    public static final void method4491() {
        for (class65 var0 = (class65) field636.method5269(); var0 != null; var0 = (class65) field636.method5270()) {
            if (Statics.field325 != var0.field858 || var0.field864) {
                var0.method6167();
            } else if (field682 >= var0.field857) {
                var0.method1789(field567);
                if (var0.field864) {
                    var0.method6167();
                } else {
                    Statics.field415.method3583(var0.field858, var0.field862, var0.field860, var0.field861, 60, var0, 0, -1L, false);
                }
            }
        }
    }

    @ObfuscatedName("ni.gt(III)V")
    public static final void method6014(int arg0, int arg1) {
        if (field696 == 2) {
            method2734((field642 - Statics.field161 << 7) + field521, (field519 - Statics.field1467 << 7) + field522, field520 * 2);
            if (field671 > -1 && field682 % 20 < 10) {
                Statics.field2087[0].method7066(field671 + arg0 - 12, field605 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("hn.gf(I)Z")
    public static boolean method4292() {
        return (field513 & 0x4) != 0;
    }

    @ObfuscatedName("j.gv(I)Z")
    public static boolean method278() {
        return (field513 & 0x1) != 0;
    }

    @ObfuscatedName("co.gz(B)Z")
    public static boolean method2174() {
        return (field513 & 0x2) != 0;
    }

    @ObfuscatedName("ck.gj(B)Z")
    public static boolean method2141() {
        return (field513 & 0x8) != 0;
    }

    @ObfuscatedName("j.gh(Lcq;IIIIII)V")
    public static final void method271(class85 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method2015()) {
            return;
        }
        if (arg0 instanceof class91) {
            class171 var6 = ((class91) arg0).field1247;
            if (var6.field1856 != null) {
                var6 = var6.method2973();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class96.field1280;
        int[] var8 = class96.field1281;
        byte var9 = 0;
        if (arg1 < var7 && field682 == arg0.field1115) {
            class83 var10 = (class83) arg0;
            boolean var11;
            if (field513 == 0) {
                var11 = false;
            } else if (Statics.field2754 == var10) {
                var11 = method2141();
            } else {
                var11 = method4292() || method278() && var10.method2002() || method2174() && var10.method2005();
            }
            if (var11) {
                class83 var12 = (class83) arg0;
                if (arg1 < var7) {
                    method2105(arg0, arg0.field1123 + 15);
                    class333 var13 = (class333) field558.get(class399.field4423);
                    byte var14 = 9;
                    var13.method5449(var12.field1073.method7231(), field671 + arg2, field605 + arg3 - var14, 16777215, 0);
                    var9 = 18;
                }
            }
        }
        int var15 = -2;
        if (!arg0.field1137.method5315()) {
            method2105(arg0, arg0.field1123 + 15);
            for (class90 var16 = (class90) arg0.field1137.method5311(); var16 != null; var16 = (class90) arg0.field1137.method5313()) {
                class86 var17 = var16.method2132(field682);
                if (var17 != null) {
                    class167 var18 = var16.field1239;
                    class434 var19 = var18.method2927();
                    class434 var20 = var18.method2935();
                    int var21 = 0;
                    int var22;
                    if (var19 == null || var20 == null) {
                        var22 = var18.field1819;
                    } else {
                        if (var18.field1814 * 2 < var20.field4602) {
                            var21 = var18.field1814;
                        }
                        var22 = var20.field4602 - var21 * 2;
                    }
                    int var23 = 255;
                    boolean var24 = true;
                    int var25 = field682 - var17.field1188;
                    int var26 = var17.field1181 * var22 / var18.field1819;
                    int var29;
                    if (var17.field1185 > var25) {
                        int var27 = var18.field1815 == 0 ? 0 : var25 / var18.field1815 * var18.field1815;
                        int var28 = var17.field1180 * var22 / var18.field1819;
                        var29 = (var26 - var28) * var27 / var17.field1185 + var28;
                    } else {
                        var29 = var26;
                        int var30 = var17.field1185 + var18.field1816 - var25;
                        if (var18.field1811 >= 0) {
                            var23 = (var30 << 8) / (var18.field1816 - var18.field1811);
                        }
                    }
                    if (var17.field1181 > 0 && var29 < 1) {
                        var29 = 1;
                    }
                    if (var19 == null || var20 == null) {
                        var15 += 5;
                        if (field671 > -1) {
                            int var36 = field671 + arg2 - (var22 >> 1);
                            int var37 = field605 + arg3 - var15;
                            class430.method6958(var36, var37, var29, 5, 65280);
                            class430.method6958(var29 + var36, var37, var22 - var29, 5, 16711680);
                        }
                        var15 += 2;
                    } else {
                        int var31;
                        if (var22 == var29) {
                            var31 = var21 * 2 + var29;
                        } else {
                            var31 = var21 + var29;
                        }
                        int var32 = var19.field4603;
                        var15 += var32;
                        int var33 = field671 + arg2 - (var22 >> 1);
                        int var34 = field605 + arg3 - var15;
                        int var35 = var33 - var21;
                        if (var23 >= 0 && var23 < 255) {
                            var19.method7072(var35, var34, var23);
                            class430.method6951(var35, var34, var31 + var35, var32 + var34);
                            var20.method7072(var35, var34, var23);
                        } else {
                            var19.method7066(var35, var34);
                            class430.method6951(var35, var34, var31 + var35, var32 + var34);
                            var20.method7066(var35, var34);
                        }
                        class430.method6950(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var15 += 2;
                    }
                } else if (var16.method2130()) {
                    var16.method6167();
                }
            }
        }
        if (var15 == -2) {
            var15 += 7;
        }
        int var38 = var9 + var15;
        if (arg1 < var7) {
            class83 var39 = (class83) arg0;
            if (var39.field1086) {
                return;
            }
            if (var39.field1092 != -1 || var39.field1072 != -1) {
                method2105(arg0, arg0.field1123 + 15);
                if (field671 > -1) {
                    if (var39.field1092 != -1) {
                        var38 += 25;
                        Statics.field818[var39.field1092].method7066(field671 + arg2 - 12, field605 + arg3 - var38);
                    }
                    if (var39.field1072 != -1) {
                        var38 += 25;
                        Statics.field15[var39.field1072].method7066(field671 + arg2 - 12, field605 + arg3 - var38);
                    }
                }
            }
            if (arg1 >= 0 && field696 == 10 && field517 == var8[arg1]) {
                method2105(arg0, arg0.field1123 + 15);
                if (field671 > -1) {
                    int var40 = Statics.field2087[1].field4603 + var38;
                    Statics.field2087[1].method7066(field671 + arg2 - 12, field605 + arg3 - var40);
                }
            }
        } else {
            class171 var41 = ((class91) arg0).field1247;
            if (var41.field1856 != null) {
                var41 = var41.method2973();
            }
            if (var41.field1876 >= 0 && var41.field1876 < Statics.field15.length) {
                method2105(arg0, arg0.field1123 + 15);
                if (field671 > -1) {
                    Statics.field15[var41.field1876].method7066(field671 + arg2 - 12, field605 + arg3 - 30);
                }
            }
            if (field696 == 1 && field726 == field548[arg1 - var7] && field682 % 20 < 10) {
                method2105(arg0, arg0.field1123 + 15);
                if (field671 > -1) {
                    Statics.field2087[0].method7066(field671 + arg2 - 12, field605 + arg3 - 28);
                }
            }
        }
        if (arg0.field1124 != null && (arg1 >= var7 || !arg0.field1126 && (field606 == 4 || !arg0.field1125 && (field606 == 0 || field606 == 3 || field606 == 1 && ((class83) arg0).method2002())))) {
            method2105(arg0, arg0.field1123);
            if (field671 > -1 && field766 < field587) {
                field597[field766] = Statics.field4479.method5441(arg0.field1124) / 2;
                field596[field766] = Statics.field4479.field4045;
                field594[field766] = field671;
                field595[field766] = field605;
                field664[field766] = arg0.field1128;
                field753[field766] = arg0.field1110;
                field600[field766] = arg0.field1118;
                field650[field766] = arg0.field1124;
                field766++;
            }
        }
        for (int var42 = 0; var42 < 4; var42++) {
            int var43 = arg0.field1133[var42];
            int var44 = arg0.field1131[var42];
            class179 var45 = null;
            int var46 = 0;
            if (var44 >= 0) {
                if (var43 <= field682) {
                    continue;
                }
                var45 = class179.method4943(arg0.field1131[var42]);
                var46 = var45.field1945;
                if (var45 != null && var45.field1964 != null) {
                    var45 = var45.method3098();
                    if (var45 == null) {
                        arg0.field1133[var42] = -1;
                        continue;
                    }
                }
            } else if (var43 < 0) {
                continue;
            }
            int var47 = arg0.field1134[var42];
            class179 var48 = null;
            if (var47 >= 0) {
                var48 = class179.method4943(var47);
                if (var48 != null && var48.field1964 != null) {
                    var48 = var48.method3098();
                }
            }
            if (var43 - var46 <= field682) {
                if (var45 == null) {
                    arg0.field1133[var42] = -1;
                } else {
                    method2105(arg0, arg0.field1123 / 2);
                    if (field671 > -1) {
                        boolean var49 = true;
                        if (var42 == 1) {
                            field605 -= 20;
                        }
                        if (var42 == 2) {
                            field671 -= 15;
                            field605 -= 10;
                        }
                        if (var42 == 3) {
                            field671 += 15;
                            field605 -= 10;
                        }
                        Object var50 = null;
                        Object var51 = null;
                        Object var52 = null;
                        Object var53 = null;
                        int var54 = 0;
                        int var55 = 0;
                        int var56 = 0;
                        int var57 = 0;
                        int var58 = 0;
                        int var59 = 0;
                        int var60 = 0;
                        int var61 = 0;
                        class434 var62 = null;
                        class434 var63 = null;
                        class434 var64 = null;
                        class434 var65 = null;
                        int var66 = 0;
                        int var67 = 0;
                        int var68 = 0;
                        int var69 = 0;
                        int var70 = 0;
                        int var71 = 0;
                        int var72 = 0;
                        int var73 = 0;
                        int var74 = 0;
                        class434 var75 = var45.method3134();
                        if (var75 != null) {
                            var54 = var75.field4602;
                            int var76 = var75.field4603;
                            if (var76 > var74) {
                                var74 = var76;
                            }
                            var58 = var75.field4604;
                        }
                        class434 var77 = var45.method3095();
                        if (var77 != null) {
                            var55 = var77.field4602;
                            int var78 = var77.field4603;
                            if (var78 > var74) {
                                var74 = var78;
                            }
                            var59 = var77.field4604;
                        }
                        class434 var79 = var45.method3102();
                        if (var79 != null) {
                            var56 = var79.field4602;
                            int var80 = var79.field4603;
                            if (var80 > var74) {
                                var74 = var80;
                            }
                            var60 = var79.field4604;
                        }
                        class434 var81 = var45.method3103();
                        if (var81 != null) {
                            var57 = var81.field4602;
                            int var82 = var81.field4603;
                            if (var82 > var74) {
                                var74 = var82;
                            }
                            var61 = var81.field4604;
                        }
                        if (var48 != null) {
                            var62 = var48.method3134();
                            if (var62 != null) {
                                var66 = var62.field4602;
                                int var83 = var62.field4603;
                                if (var83 > var74) {
                                    var74 = var83;
                                }
                                var70 = var62.field4604;
                            }
                            var63 = var48.method3095();
                            if (var63 != null) {
                                var67 = var63.field4602;
                                int var84 = var63.field4603;
                                if (var84 > var74) {
                                    var74 = var84;
                                }
                                var71 = var63.field4604;
                            }
                            var64 = var48.method3102();
                            if (var64 != null) {
                                var68 = var64.field4602;
                                int var85 = var64.field4603;
                                if (var85 > var74) {
                                    var74 = var85;
                                }
                                var72 = var64.field4604;
                            }
                            var65 = var48.method3103();
                            if (var65 != null) {
                                var69 = var65.field4602;
                                int var86 = var65.field4603;
                                if (var86 > var74) {
                                    var74 = var86;
                                }
                                var73 = var65.field4604;
                            }
                        }
                        class332 var87 = var45.method3108();
                        if (var87 == null) {
                            var87 = Statics.field10;
                        }
                        class332 var88;
                        if (var48 == null) {
                            var88 = Statics.field10;
                        } else {
                            var88 = var48.method3108();
                            if (var88 == null) {
                                var88 = Statics.field10;
                            }
                        }
                        Object var89 = null;
                        String var90 = null;
                        boolean var91 = false;
                        int var92 = 0;
                        String var93 = var45.method3132(arg0.field1138[var42]);
                        int var94 = var87.method5441(var93);
                        if (var48 != null) {
                            var90 = var48.method3132(arg0.field1135[var42]);
                            var92 = var88.method5441(var90);
                        }
                        int var95 = 0;
                        int var96 = 0;
                        if (var55 > 0) {
                            if (var79 == null && var81 == null) {
                                var95 = 1;
                            } else {
                                var95 = var94 / var55 + 1;
                            }
                        }
                        if (var48 != null && var67 > 0) {
                            if (var64 == null && var65 == null) {
                                var96 = 1;
                            } else {
                                var96 = var92 / var67 + 1;
                            }
                        }
                        int var97 = 0;
                        int var98 = var97;
                        if (var54 > 0) {
                            var97 += var54;
                        }
                        var97 += 2;
                        int var99 = var97;
                        if (var56 > 0) {
                            var97 += var56;
                        }
                        int var100 = var97;
                        int var101 = var97;
                        int var103;
                        if (var55 > 0) {
                            int var102 = var55 * var95;
                            var103 = var97 + var102;
                            var101 = (var102 - var94) / 2 + var97;
                        } else {
                            var103 = var94 + var97;
                        }
                        int var104 = var103;
                        if (var57 > 0) {
                            var103 += var57;
                        }
                        int var105 = 0;
                        int var106 = 0;
                        int var107 = 0;
                        int var108 = 0;
                        int var109 = 0;
                        if (var48 != null) {
                            var103 += 2;
                            var105 = var103;
                            if (var66 > 0) {
                                var103 += var66;
                            }
                            var103 += 2;
                            var106 = var103;
                            if (var68 > 0) {
                                var103 += var68;
                            }
                            var107 = var103;
                            var109 = var103;
                            if (var67 > 0) {
                                int var110 = var67 * var96;
                                var103 += var110;
                                var109 += (var110 - var92) / 2;
                            } else {
                                var103 += var92;
                            }
                            var108 = var103;
                            if (var69 > 0) {
                                var103 += var69;
                            }
                        }
                        int var111 = arg0.field1133[var42] - field682;
                        int var112 = var45.field1958 - var45.field1958 * var111 / var45.field1945;
                        int var113 = var45.field1953 * var111 / var45.field1945 + -var45.field1953;
                        int var114 = field671 + arg2 - (var103 >> 1) + var112;
                        int var115 = field605 + arg3 - 12 + var113;
                        int var116 = var115;
                        int var117 = var74 + var115;
                        int var118 = var45.field1959 + var115 + 15;
                        int var119 = var118 - var87.field4028;
                        int var120 = var87.field4032 + var118;
                        if (var119 < var115) {
                            var116 = var119;
                        }
                        if (var120 > var117) {
                            var117 = var120;
                        }
                        int var121 = 0;
                        if (var48 != null) {
                            var121 = var48.field1959 + var115 + 15;
                            int var122 = var121 - var88.field4028;
                            int var123 = var88.field4032 + var121;
                            if (var122 < var116) {
                                ;
                            }
                            if (var123 > var117) {
                                ;
                            }
                        }
                        int var126 = 255;
                        if (var45.field1960 >= 0) {
                            var126 = (var111 << 8) / (var45.field1945 - var45.field1960);
                        }
                        if (var126 >= 0 && var126 < 255) {
                            if (var75 != null) {
                                var75.method7072(var98 + var114 - var58, var115, var126);
                            }
                            if (var79 != null) {
                                var79.method7072(var99 + var114 - var60, var115, var126);
                            }
                            if (var77 != null) {
                                for (int var127 = 0; var127 < var95; var127++) {
                                    var77.method7072(var55 * var127 + (var100 + var114 - var59), var115, var126);
                                }
                            }
                            if (var81 != null) {
                                var81.method7072(var104 + var114 - var61, var115, var126);
                            }
                            var87.method5464(var93, var101 + var114, var118, var45.field1952, 0, var126);
                            if (var48 != null) {
                                if (var62 != null) {
                                    var62.method7072(var105 + var114 - var70, var115, var126);
                                }
                                if (var64 != null) {
                                    var64.method7072(var106 + var114 - var72, var115, var126);
                                }
                                if (var63 != null) {
                                    for (int var128 = 0; var128 < var96; var128++) {
                                        var63.method7072(var67 * var128 + (var107 + var114 - var71), var115, var126);
                                    }
                                }
                                if (var65 != null) {
                                    var65.method7072(var108 + var114 - var73, var115, var126);
                                }
                                var88.method5464(var90, var109 + var114, var121, var48.field1952, 0, var126);
                            }
                        } else {
                            if (var75 != null) {
                                var75.method7066(var98 + var114 - var58, var115);
                            }
                            if (var79 != null) {
                                var79.method7066(var99 + var114 - var60, var115);
                            }
                            if (var77 != null) {
                                for (int var129 = 0; var129 < var95; var129++) {
                                    var77.method7066(var55 * var129 + (var100 + var114 - var59), var115);
                                }
                            }
                            if (var81 != null) {
                                var81.method7066(var104 + var114 - var61, var115);
                            }
                            var87.method5446(var93, var101 + var114, var118, var45.field1952 | 0xFF000000, 0);
                            if (var48 != null) {
                                if (var62 != null) {
                                    var62.method7066(var105 + var114 - var70, var115);
                                }
                                if (var64 != null) {
                                    var64.method7066(var106 + var114 - var72, var115);
                                }
                                if (var63 != null) {
                                    for (int var130 = 0; var130 < var96; var130++) {
                                        var63.method7066(var67 * var130 + (var107 + var114 - var71), var115);
                                    }
                                }
                                if (var65 != null) {
                                    var65.method7066(var108 + var114 - var73, var115);
                                }
                                var88.method5446(var90, var109 + var114, var121, var48.field1952 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("au.hg(I)V")
    public static final void method760() {
        field659 = 0;
        int var0 = (Statics.field2754.field1161 >> 7) + Statics.field161;
        int var1 = (Statics.field2754.field1152 >> 7) + Statics.field1467;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field659 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field659 = 1;
        }
        if (field659 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field659 = 0;
        }
    }

    @ObfuscatedName("cc.ha(Lcq;IS)V")
    public static final void method2105(class85 arg0, int arg1) {
        method2734(arg0.field1161, arg0.field1152, arg1);
    }

    @ObfuscatedName("em.hc(IIII)V")
    public static final void method2734(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field671 = -1;
            field605 = -1;
            return;
        }
        int var3 = method2169(arg0, arg1, Statics.field325) - arg2;
        int var4 = arg0 - Statics.field4498;
        int var5 = var3 - Statics.field2749;
        int var6 = arg1 - Statics.field494;
        int var7 = class194.field2271[Statics.field33];
        int var8 = class194.field2280[Statics.field33];
        int var9 = class194.field2271[Statics.field42];
        int var10 = class194.field2280[Statics.field42];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field671 = field771 * var11 / var15 + field524 / 2;
            field605 = field771 * var14 / var15 + field614 / 2;
        } else {
            field671 = -1;
            field605 = -1;
        }
    }

    @ObfuscatedName("cr.hq(IIIB)I")
    public static final int method2169(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class75.field994[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class75.field1005[var5][var3][var4] + class75.field1005[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class75.field1005[var5][var3][var4 + 1] + class75.field1005[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("fz.hu(III)I")
    public static int method2944(int arg0, int arg1) {
        int var2 = arg1 - 334;
        if (var2 < 0) {
            var2 = 0;
        } else if (var2 > 100) {
            var2 = 100;
        }
        int var3 = (field762 - field761) * var2 / 100 + field761;
        return arg0 * var3 / 256;
    }

    @ObfuscatedName("be.hh(ZLpc;I)V")
    public static final void method977(boolean arg0, class420 arg1) {
        field564 = arg0;
        if (!field564) {
            int var2 = arg1.method6705();
            int var3 = arg1.method6705();
            int var4 = arg1.method6666();
            Statics.field1350 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field1350[var5][var6] = arg1.method6669();
                }
            }
            Statics.field2759 = new int[var4];
            Statics.field1293 = new int[var4];
            Statics.field2591 = new int[var4];
            Statics.field4136 = new byte[var4][];
            Statics.field262 = new byte[var4][];
            boolean var7 = false;
            if (field555) {
                if ((var3 / 8 == 48 || var3 / 8 == 49) && var2 / 8 == 48) {
                    var7 = true;
                }
                if (var3 / 8 == 48 && var2 / 8 == 148) {
                    var7 = true;
                }
            }
            int var8 = 0;
            for (int var9 = (var3 - 6) / 8; var9 <= (var3 + 6) / 8; var9++) {
                for (int var10 = (var2 - 6) / 8; var10 <= (var2 + 6) / 8; var10++) {
                    int var11 = (var9 << 8) + var10;
                    if (!var7 || var10 != 49 && var10 != 149 && var10 != 147 && var9 != 50 && (var9 != 49 || var10 != 47)) {
                        Statics.field2759[var8] = var11;
                        Statics.field1293[var8] = Statics.field623.method5046("m" + var9 + "_" + var10);
                        Statics.field2591[var8] = Statics.field623.method5046("l" + var9 + "_" + var10);
                        var8++;
                    }
                }
            }
            method4543(var3, var2, true);
            return;
        }
        int var12 = arg1.method6859();
        int var13 = arg1.method6859();
        boolean var14 = arg1.method6695() == 1;
        int var15 = arg1.method6666();
        arg1.method6615();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = arg1.method6631(1);
                    if (var19 == 1) {
                        field565[var16][var17][var18] = arg1.method6631(26);
                    } else {
                        field565[var16][var17][var18] = -1;
                    }
                }
            }
        }
        arg1.method6636();
        Statics.field1350 = new int[var15][4];
        for (int var20 = 0; var20 < var15; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field1350[var20][var21] = arg1.method6669();
            }
        }
        Statics.field2759 = new int[var15];
        Statics.field1293 = new int[var15];
        Statics.field2591 = new int[var15];
        Statics.field4136 = new byte[var15][];
        Statics.field262 = new byte[var15][];
        int var22 = 0;
        for (int var23 = 0; var23 < 4; var23++) {
            for (int var24 = 0; var24 < 13; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    int var26 = field565[var23][var24][var25];
                    if (var26 != -1) {
                        int var27 = var26 >> 14 & 0x3FF;
                        int var28 = var26 >> 3 & 0x7FF;
                        int var29 = (var27 / 8 << 8) + var28 / 8;
                        for (int var30 = 0; var30 < var22; var30++) {
                            if (Statics.field2759[var30] == var29) {
                                var29 = -1;
                                break;
                            }
                        }
                        if (var29 != -1) {
                            Statics.field2759[var22] = var29;
                            int var31 = var29 >> 8 & 0xFF;
                            int var32 = var29 & 0xFF;
                            Statics.field1293[var22] = Statics.field623.method5046("m" + var31 + "_" + var32);
                            Statics.field2591[var22] = Statics.field623.method5046("l" + var31 + "_" + var32);
                            var22++;
                        }
                    }
                }
            }
        }
        method4543(var12, var13, !var14);
    }

    @ObfuscatedName("jk.hs(IIZI)V")
    public static final void method4543(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field241 == arg0 && Statics.field1353 == arg1) {
            return;
        }
        Statics.field241 = arg0;
        Statics.field1353 = arg1;
        method2405(25);
        method4786(class300.field3535, true);
        int var3 = Statics.field161;
        int var4 = Statics.field1467;
        Statics.field161 = (arg0 - 6) * 8;
        Statics.field1467 = (arg1 - 6) * 8;
        int var5 = Statics.field161 - var3;
        int var6 = Statics.field1467 - var4;
        int var7 = Statics.field161;
        int var8 = Statics.field1467;
        for (int var9 = 0; var9 < 32768; var9++) {
            class91 var10 = field546[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1173[var11] -= var5;
                    var10.field1147[var11] -= var6;
                }
                var10.field1161 -= var5 * 128;
                var10.field1152 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class83 var13 = field619[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1173[var14] -= var5;
                    var13.field1147[var14] -= var6;
                }
                var13.field1161 -= var5 * 128;
                var13.field1152 -= var6 * 128;
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
                        field633[var25][var21][var22] = field633[var25][var23][var24];
                    } else {
                        field633[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class84 var26 = (class84) field634.method5269(); var26 != null; var26 = (class84) field634.method5270()) {
            var26.field1097 -= var5;
            var26.field1105 -= var6;
            if (var26.field1097 < 0 || var26.field1105 < 0 || var26.field1097 >= 104 || var26.field1105 >= 104) {
                var26.method6167();
            }
        }
        if (field741 != 0) {
            field741 -= var5;
            field742 -= var6;
        }
        field746 = 0;
        field752 = false;
        Statics.field4498 -= var5 << 7;
        Statics.field494 -= var6 << 7;
        Statics.field182 -= var5 << 7;
        Statics.field1492 -= var6 << 7;
        field736 = -1;
        field636.method5262();
        field759.method5262();
        for (int var27 = 0; var27 < 4; var27++) {
            field518[var27].method3331();
        }
    }

    @ObfuscatedName("fh.hv(ZI)V")
    public static final void method2966(boolean arg0) {
        method2572();
        field551.field1325++;
        if (field551.field1325 < 50 && !arg0) {
            return;
        }
        field551.field1325 = 0;
        if (field553 || field551.method2271() == null) {
            return;
        }
        class257 var1 = class257.method2630(class255.field2838, field551.field1319);
        field551.method2268(var1);
        try {
            field551.method2267();
        } catch (IOException var3) {
            field553 = true;
        }
    }

    @ObfuscatedName("aa.hm(I)V")
    public static final void method611() {
        method2966(false);
        field499 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field4136.length; var1++) {
            if (Statics.field1293[var1] != -1 && Statics.field4136[var1] == null) {
                Statics.field4136[var1] = Statics.field623.method5066(Statics.field1293[var1], 0);
                if (Statics.field4136[var1] == null) {
                    var0 = false;
                    field499++;
                }
            }
            if (Statics.field2591[var1] != -1 && Statics.field262[var1] == null) {
                Statics.field262[var1] = Statics.field623.method5033(Statics.field2591[var1], 0, Statics.field1350[var1]);
                if (Statics.field262[var1] == null) {
                    var0 = false;
                    field499++;
                }
            }
        }
        if (!var0) {
            field622 = 1;
            return;
        }
        field560 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field4136.length; var3++) {
            byte[] var4 = Statics.field262[var3];
            if (var4 != null) {
                int var5 = (Statics.field2759[var3] >> 8) * 64 - Statics.field161;
                int var6 = (Statics.field2759[var3] & 0xFF) * 64 - Statics.field1467;
                if (field564) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class75.method1596(var4, var5, var6);
            }
        }
        if (!var2) {
            field622 = 2;
            return;
        }
        if (field622 != 0) {
            method4786(class300.field3535 + class92.field1255 + class92.field1257 + 100 + "%" + class92.field1253, true);
        }
        method2572();
        Statics.field415.method3572();
        for (int var7 = 0; var7 < 4; var7++) {
            field518[var7].method3331();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class75.field994[var8][var9][var10] = 0;
                }
            }
        }
        method2572();
        class75.method2351();
        int var11 = Statics.field4136.length;
        class63.method3307();
        method2966(true);
        if (!field564) {
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = (Statics.field2759[var12] >> 8) * 64 - Statics.field161;
                int var14 = (Statics.field2759[var12] & 0xFF) * 64 - Statics.field1467;
                byte[] var15 = Statics.field4136[var12];
                if (var15 != null) {
                    method2572();
                    class75.method4802(var15, var13, var14, Statics.field241 * 8 - 48, Statics.field1353 * 8 - 48, field518);
                }
            }
            for (int var16 = 0; var16 < var11; var16++) {
                int var17 = (Statics.field2759[var16] >> 8) * 64 - Statics.field161;
                int var18 = (Statics.field2759[var16] & 0xFF) * 64 - Statics.field1467;
                byte[] var19 = Statics.field4136[var16];
                if (var19 == null && Statics.field1353 < 800) {
                    method2572();
                    class75.method50(var17, var18, 64, 64);
                }
            }
            method2966(true);
            for (int var20 = 0; var20 < var11; var20++) {
                byte[] var21 = Statics.field262[var20];
                if (var21 != null) {
                    int var22 = (Statics.field2759[var20] >> 8) * 64 - Statics.field161;
                    int var23 = (Statics.field2759[var20] & 0xFF) * 64 - Statics.field1467;
                    method2572();
                    class75.method1982(var21, var22, var23, Statics.field415, field518);
                }
            }
        }
        if (field564) {
            for (int var24 = 0; var24 < 4; var24++) {
                method2572();
                for (int var25 = 0; var25 < 13; var25++) {
                    for (int var26 = 0; var26 < 13; var26++) {
                        boolean var27 = false;
                        int var28 = field565[var24][var25][var26];
                        if (var28 != -1) {
                            int var29 = var28 >> 24 & 0x3;
                            int var30 = var28 >> 1 & 0x3;
                            int var31 = var28 >> 14 & 0x3FF;
                            int var32 = var28 >> 3 & 0x7FF;
                            int var33 = (var31 / 8 << 8) + var32 / 8;
                            for (int var34 = 0; var34 < Statics.field2759.length; var34++) {
                                if (Statics.field2759[var34] == var33 && Statics.field4136[var34] != null) {
                                    class75.method3933(Statics.field4136[var34], var24, var25 * 8, var26 * 8, var29, (var31 & 0x7) * 8, (var32 & 0x7) * 8, var30, field518);
                                    var27 = true;
                                    break;
                                }
                            }
                        }
                        if (!var27) {
                            class75.method366(var24, var25 * 8, var26 * 8);
                        }
                    }
                }
            }
            for (int var35 = 0; var35 < 13; var35++) {
                for (int var36 = 0; var36 < 13; var36++) {
                    int var37 = field565[0][var35][var36];
                    if (var37 == -1) {
                        class75.method50(var35 * 8, var36 * 8, 8, 8);
                    }
                }
            }
            method2966(true);
            for (int var38 = 0; var38 < 4; var38++) {
                method2572();
                for (int var39 = 0; var39 < 13; var39++) {
                    for (int var40 = 0; var40 < 13; var40++) {
                        int var41 = field565[var38][var39][var40];
                        if (var41 != -1) {
                            int var42 = var41 >> 24 & 0x3;
                            int var43 = var41 >> 1 & 0x3;
                            int var44 = var41 >> 14 & 0x3FF;
                            int var45 = var41 >> 3 & 0x7FF;
                            int var46 = (var44 / 8 << 8) + var45 / 8;
                            for (int var47 = 0; var47 < Statics.field2759.length; var47++) {
                                if (Statics.field2759[var47] == var46 && Statics.field262[var47] != null) {
                                    class75.method1930(Statics.field262[var47], var38, var39 * 8, var40 * 8, var42, (var44 & 0x7) * 8, (var45 & 0x7) * 8, var43, Statics.field415, field518);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method2966(true);
        method2572();
        Statics.method2711(Statics.field415, field518);
        method2966(true);
        int var48 = class75.field995;
        if (var48 > Statics.field325) {
            var48 = Statics.field325;
        }
        if (var48 < Statics.field325 - 1) {
            int var49 = Statics.field325 - 1;
        }
        if (field500) {
            Statics.field415.method3573(class75.field995);
        } else {
            Statics.field415.method3573(0);
        }
        for (int var50 = 0; var50 < 104; var50++) {
            for (int var51 = 0; var51 < 104; var51++) {
                method4947(var50, var51);
            }
        }
        method2572();
        method2111();
        class180.field1972.method4475();
        if (Statics.field4489.method458()) {
            class257 var52 = class257.method2630(class255.field2898, field551.field1319);
            var52.field2960.method6650(1057001181);
            field551.method2268(var52);
        }
        if (!field564) {
            int var53 = (Statics.field241 - 6) / 8;
            int var54 = (Statics.field241 + 6) / 8;
            int var55 = (Statics.field1353 - 6) / 8;
            int var56 = (Statics.field1353 + 6) / 8;
            for (int var57 = var53 - 1; var57 <= var54 + 1; var57++) {
                for (int var58 = var55 - 1; var58 <= var56 + 1; var58++) {
                    if (var57 < var53 || var57 > var54 || var58 < var55 || var58 > var56) {
                        Statics.field623.method5054("m" + var57 + "_" + var58);
                        Statics.field623.method5054("l" + var57 + "_" + var58);
                    }
                }
            }
        }
        method2405(30);
        method2572();
        class75.method2401();
        class257 var59 = class257.method2630(class255.field2884, field551.field1319);
        field551.method2268(var59);
        class32.method1049();
    }

    @ObfuscatedName("w.hw(IIIIII)V")
    public static final void method53(int arg0, int arg1, int arg2, int arg3, int arg4) {
        long var5 = Statics.field415.method3598(arg0, arg1, arg2);
        if (var5 != 0L) {
            int var7 = Statics.field415.method3602(arg0, arg1, arg2, var5);
            int var8 = var7 >> 6 & 0x3;
            int var9 = var7 & 0x1F;
            int var10 = arg3;
            if (Statics.method2110(var5)) {
                var10 = arg4;
            }
            int[] var11 = Statics.field4497.field4606;
            int var12 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var13 = class205.method3561(var5);
            class180 var14 = class180.method3056(var13);
            if (var14.field1998 == -1) {
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
                class433 var15 = Statics.field70[var14.field1998];
                if (var15 != null) {
                    int var16 = (var14.field1995 * 4 - var15.field4595) / 2;
                    int var17 = (var14.field1985 * 4 - var15.field4600) / 2;
                    var15.method7034(arg1 * 4 + 48 + var16, (104 - arg2 - var14.field1985) * 4 + 48 + var17);
                }
            }
        }
        long var18 = Statics.field415.method3645(arg0, arg1, arg2);
        if (var18 != 0L) {
            int var20 = Statics.field415.method3602(arg0, arg1, arg2, var18);
            int var21 = var20 >> 6 & 0x3;
            int var22 = var20 & 0x1F;
            int var23 = class205.method3561(var18);
            class180 var24 = class180.method3056(var23);
            if (var24.field1998 != -1) {
                class433 var25 = Statics.field70[var24.field1998];
                if (var25 != null) {
                    int var26 = (var24.field1995 * 4 - var25.field4595) / 2;
                    int var27 = (var24.field1985 * 4 - var25.field4600) / 2;
                    var25.method7034(arg1 * 4 + 48 + var26, (104 - arg2 - var24.field1985) * 4 + 48 + var27);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (Statics.method2110(var18)) {
                    var28 = 15597568;
                }
                int[] var29 = Statics.field4497.field4606;
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
        long var31 = Statics.field415.method3601(arg0, arg1, arg2);
        if (var31 == 0L) {
            return;
        }
        int var33 = class205.method3561(var31);
        class180 var34 = class180.method3056(var33);
        if (var34.field1998 == -1) {
            return;
        }
        class433 var35 = Statics.field70[var34.field1998];
        if (var35 != null) {
            int var36 = (var34.field1995 * 4 - var35.field4595) / 2;
            int var37 = (var34.field1985 * 4 - var35.field4600) / 2;
            var35.method7034(arg1 * 4 + 48 + var36, (104 - arg2 - var34.field1985) * 4 + 48 + var37);
        }
    }

    @ObfuscatedName("client.hr(Lcx;I)Z")
    public final boolean method1068(class99 arg0) {
        class361 var2 = arg0.method2271();
        class420 var3 = arg0.field1318;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1321 == null) {
                if (arg0.field1323) {
                    if (!var2.method2784(1)) {
                        return false;
                    }
                    var2.method2781(arg0.field1318.field4511, 0, 1);
                    arg0.field1324 = 0;
                    arg0.field1323 = false;
                }
                var3.field4512 = 0;
                if (var3.method6618()) {
                    if (!var2.method2784(1)) {
                        return false;
                    }
                    var2.method2781(arg0.field1318.field4511, 1, 1);
                    arg0.field1324 = 0;
                }
                arg0.field1323 = true;
                class258[] var4 = class258.method3357();
                int var5 = var3.method6609();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field4512);
                }
                arg0.field1321 = var4[var5];
                arg0.field1320 = arg0.field1321.field3062;
            }
            if (arg0.field1320 == -1) {
                if (!var2.method2784(1)) {
                    return false;
                }
                arg0.method2271().method2781(var3.field4511, 0, 1);
                arg0.field1320 = var3.field4511[0] & 0xFF;
            }
            if (arg0.field1320 == -2) {
                if (!var2.method2784(2)) {
                    return false;
                }
                arg0.method2271().method2781(var3.field4511, 0, 2);
                var3.field4512 = 0;
                arg0.field1320 = var3.method6666();
            }
            if (!var2.method2784(arg0.field1320)) {
                return false;
            }
            var3.field4512 = 0;
            var2.method2781(var3.field4511, 0, arg0.field1320);
            arg0.field1324 = 0;
            field556.method5654();
            arg0.field1328 = arg0.field1327;
            arg0.field1327 = arg0.field1326;
            arg0.field1326 = arg0.field1321;
            if (class258.field2978 == arg0.field1321) {
                int var6 = var3.method6696();
                String var7 = var3.method6674();
                int var8 = var3.method6695();
                if (var6 >= 1 && var6 <= 8) {
                    if (var7.equalsIgnoreCase(class300.field3605)) {
                        var7 = null;
                    }
                    field629[var6 - 1] = var7;
                    field630[var6 - 1] = var8 == 0;
                }
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3035 == arg0.field1321) {
                int var9 = var3.method6669();
                int var10 = var3.method6705();
                int var11 = var3.method6711();
                class286 var12 = class286.method2611(var9);
                var12.field3321 = (var11 << 16) + var10;
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3060 == arg0.field1321) {
                method5968(false, var3);
                arg0.field1321 = null;
                return true;
            }
            if (class258.field2997 == arg0.field1321) {
                for (int var13 = 0; var13 < class281.field3224.length; var13++) {
                    if (class281.field3225[var13] != class281.field3224[var13]) {
                        class281.field3224[var13] = class281.field3225[var13];
                        method5028(var13);
                        field675[++field692 - 1 & 0x1F] = var13;
                    }
                }
                arg0.field1321 = null;
                return true;
            }
            if (class258.field2963 == arg0.field1321) {
                method2339(class256.field2949);
                arg0.field1321 = null;
                return true;
            }
            if (class258.field2976 == arg0.field1321) {
                method2339(class256.field2951);
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3006 == arg0.field1321) {
                field752 = false;
                for (int var14 = 0; var14 < 5; var14++) {
                    field754[var14] = false;
                }
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3027 == arg0.field1321) {
                int var15 = var3.method6714();
                int var16 = var3.method6705();
                class286 var17 = class286.method2611(var15);
                if (var17.field3318 != 1 || var17.field3309 != var16) {
                    var17.field3318 = 1;
                    var17.field3309 = var16;
                    method2435(var17);
                }
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3016 == arg0.field1321) {
                int var18 = var3.method6669();
                int var19 = var3.method6705();
                class286 var20 = class286.method2611(var18);
                if (var20 != null && var20.field3286 == 0) {
                    if (var19 > var20.field3379 - var20.field3281) {
                        var19 = var20.field3379 - var20.field3281;
                    }
                    if (var19 < 0) {
                        var19 = 0;
                    }
                    if (var20.field3355 != var19) {
                        var20.field3355 = var19;
                        method2435(var20);
                    }
                }
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3050 == arg0.field1321) {
                method2339(class256.field2950);
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3034 == arg0.field1321) {
                int var21 = var3.method6686();
                method4488(var21);
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3012 == arg0.field1321) {
                Statics.field1606.method1611();
                field601 = field690;
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3057 == arg0.field1321) {
                Statics.field2681 = new class376(Statics.field2085);
                arg0.field1321 = null;
                return true;
            }
            if (class258.field2996 == arg0.field1321) {
                byte[] var22 = new byte[arg0.field1320];
                var3.method6614(var22, 0, var22.length);
                class421 var23 = new class421(var22);
                String var24 = var23.method6674();
                class30.method2812(var24, true, false);
                arg0.field1321 = null;
                return true;
            }
            if (class258.field2983 == arg0.field1321) {
                Statics.field2681 = null;
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3019 == arg0.field1321) {
                int var25 = var3.method6715();
                class286 var26 = class286.method2611(var25);
                var26.field3318 = 3;
                var26.field3309 = Statics.field2754.field1066.method4834();
                method2435(var26);
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3023 == arg0.field1321) {
                String var27 = var3.method6674();
                long var28 = (long) var3.method6666();
                long var30 = (long) var3.method6668();
                class302 var32 = (class302) class321.method2696(class302.method4604(), var3.method6686());
                long var33 = (var28 << 32) + var30;
                boolean var35 = false;
                for (int var36 = 0; var36 < 100; var36++) {
                    if (field728[var36] == var33) {
                        var35 = true;
                        break;
                    }
                }
                if (Statics.field1606.method1588(new class442(var27, Statics.field1786))) {
                    var35 = true;
                }
                if (!var35 && field659 == 0) {
                    field728[field729] = var33;
                    field729 = (field729 + 1) % 100;
                    String var37 = class333.method5477(class336.method3942(class275.method5197(var3)));
                    byte var38;
                    if (var32.field3861) {
                        var38 = 7;
                    } else {
                        var38 = 3;
                    }
                    if (var32.field3860 == -1) {
                        class98.method2081(var38, var27, var37);
                    } else {
                        class98.method2081(var38, class92.method4309(var32.field3860) + var27, var37);
                    }
                }
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3028 == arg0.field1321) {
                int var39 = var3.method6666();
                int var40 = var3.method6686();
                int var41 = var3.method6666();
                method3166(var39, var40, var41);
                arg0.field1321 = null;
                return true;
            }
            if (class258.field2979 == arg0.field1321) {
                String var42 = var3.method6674();
                Object[] var43 = new Object[var42.length() + 1];
                for (int var44 = var42.length() - 1; var44 >= 0; var44--) {
                    if (var42.charAt(var44) == 's') {
                        var43[var44 + 1] = var3.method6674();
                    } else {
                        var43[var44 + 1] = Integer.valueOf(var3.method6669());
                    }
                }
                var43[0] = Integer.valueOf(var3.method6669());
                class81 var45 = new class81();
                var45.field1047 = var43;
                class64.method2170(var45);
                arg0.field1321 = null;
                return true;
            }
            if (class258.field2964 == arg0.field1321) {
                int var46 = var3.method6669();
                class80 var47 = (class80) field666.method6456((long) var46);
                if (var47 != null) {
                    method2598(var47, true);
                }
                if (field526 != null) {
                    method2435(field526);
                    field526 = null;
                }
                arg0.field1321 = null;
                return true;
            }
            if (class258.field2999 == arg0.field1321) {
                Statics.field244 = var3.method6696();
                Statics.field158 = var3.method6686();
                while (var3.field4512 < arg0.field1320) {
                    int var48 = var3.method6686();
                    class256 var49 = class256.method3005()[var48];
                    method2339(var49);
                }
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3047 == arg0.field1321) {
                field696 = var3.method6686();
                if (field696 == 1) {
                    field726 = var3.method6666();
                }
                if (field696 >= 2 && field696 <= 6) {
                    if (field696 == 2) {
                        field521 = 64;
                        field522 = 64;
                    }
                    if (field696 == 3) {
                        field521 = 0;
                        field522 = 64;
                    }
                    if (field696 == 4) {
                        field521 = 128;
                        field522 = 64;
                    }
                    if (field696 == 5) {
                        field521 = 64;
                        field522 = 0;
                    }
                    if (field696 == 6) {
                        field521 = 64;
                        field522 = 128;
                    }
                    field696 = 2;
                    field642 = var3.method6666();
                    field519 = var3.method6666();
                    field520 = var3.method6686();
                }
                if (field696 == 10) {
                    field517 = var3.method6666();
                }
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3061 == arg0.field1321) {
                int var50 = var3.method6705();
                if (var50 == 65535) {
                    var50 = -1;
                }
                method4009(var50);
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3033 == arg0.field1321) {
                int var51 = var3.method6709();
                int var52 = var3.method6711();
                if (var52 == 65535) {
                    var52 = -1;
                }
                method3371(var52, var51);
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3052 == arg0.field1321) {
                int var53 = var3.method6715();
                int var54 = var3.method6708();
                class286 var55 = class286.method2611(var53);
                if (var55.field3312 != var54 || var54 == -1) {
                    var55.field3312 = var54;
                    var55.field3397 = 0;
                    var55.field3387 = 0;
                    method2435(var55);
                }
                arg0.field1321 = null;
                return true;
            }
            if (class258.field2965 == arg0.field1321) {
                method2339(class256.field2948);
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3051 == arg0.field1321) {
                var3.field4512 += 28;
                if (var3.method6853()) {
                    method3770(var3, var3.field4512 - 28);
                }
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3013 == arg0.field1321) {
                int var56 = var3.method6669();
                class286 var57 = class286.method2611(var56);
                for (int var58 = 0; var58 < var57.field3393.length; var58++) {
                    var57.field3393[var58] = -1;
                    var57.field3393[var58] = 0;
                }
                method2435(var57);
                arg0.field1321 = null;
                return true;
            }
            if (class258.field2971 == arg0.field1321) {
                boolean var59 = var3.method6672();
                if (!var59) {
                    Statics.field59 = null;
                } else if (Statics.field59 == null) {
                    Statics.field59 = new class318();
                }
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3055 == arg0.field1321) {
                Statics.field1606.field808.method5682(var3, arg0.field1320);
                method1996();
                field601 = field690;
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3017 == arg0.field1321) {
                class96.method7221(var3, arg0.field1320);
                method6562();
                arg0.field1321 = null;
                return true;
            }
            if (class258.field2968 == arg0.field1321) {
                int var60 = var3.method6713();
                int var61 = var3.method6715();
                int var62 = var3.method6705();
                if (var62 == 65535) {
                    var62 = -1;
                }
                int var63 = var3.method6711();
                if (var63 == 65535) {
                    var63 = -1;
                }
                for (int var64 = var62; var64 <= var63; var64++) {
                    long var65 = ((long) var60 << 32) + (long) var64;
                    class392 var67 = field711.method6456(var65);
                    if (var67 != null) {
                        var67.method6167();
                    }
                    field711.method6455(new class391(var61), var65);
                }
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3053 == arg0.field1321) {
                method4382();
                int var68 = var3.method6696();
                int var69 = var3.method6764();
                int var70 = var3.method6669();
                field639[var68] = var70;
                field637[var68] = var69;
                field557[var68] = 1;
                for (int var71 = 0; var71 < 98; var71++) {
                    if (var70 >= class290.field3451[var71]) {
                        field557[var68] = var71 + 2;
                    }
                }
                field695[++field641 - 1 & 0x1F] = var68;
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3025 == arg0.field1321) {
                for (int var72 = 0; var72 < Statics.field1755; var72++) {
                    class163 var73 = class163.method740(var72);
                    if (var73 != null) {
                        class281.field3225[var72] = 0;
                        class281.field3224[var72] = 0;
                    }
                }
                method4382();
                field692 += 32;
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3042 == arg0.field1321) {
                int var74 = var3.method6666();
                class78.method3976(var74);
                field647[++field495 - 1 & 0x1F] = var74 & 0x7FFF;
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3046 == arg0.field1321) {
                int var75 = var3.method6859();
                int var76 = var3.method6713();
                int var77 = var75 >> 10 & 0x1F;
                int var78 = var75 >> 5 & 0x1F;
                int var79 = var75 & 0x1F;
                int var80 = (var79 << 3) + (var77 << 19) + (var78 << 11);
                class286 var81 = class286.method2611(var76);
                if (var81.field3264 != var80) {
                    var81.field3264 = var80;
                    method2435(var81);
                }
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3043 == arg0.field1321) {
                int var82 = var3.method6686();
                method4826(var82);
                arg0.field1321 = null;
                return false;
            }
            if (class258.field2970 == arg0.field1321) {
                field504 = field690;
                byte var83 = var3.method6664();
                class144 var84 = new class144(var3);
                class147 var85;
                if (var83 >= 0) {
                    var85 = field717[var83];
                } else {
                    var85 = Statics.field1037;
                }
                var84.method2705(var85);
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3049 == arg0.field1321) {
                int var86 = var3.method6669();
                int var87 = var3.method6859();
                class286 var88 = class286.method2611(var86);
                if (var88.field3318 != 2 || var88.field3309 != var87) {
                    var88.field3318 = 2;
                    var88.field3309 = var87;
                    method2435(var88);
                }
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3010 == arg0.field1321) {
                int var89 = var3.method6713();
                int var90 = var3.method6711();
                if (var90 == 65535) {
                    var90 = -1;
                }
                int var91 = var3.method6715();
                class286 var92 = class286.method2611(var91);
                if (var92.field3391) {
                    var92.field3388 = var90;
                    var92.field3396 = var89;
                    class181 var94 = class181.method1538(var90);
                    var92.field3316 = var94.field2034;
                    var92.field3256 = var94.field2066;
                    var92.field3338 = var94.field2036;
                    var92.field3314 = var94.field2042;
                    var92.field3315 = var94.field2038;
                    var92.field3319 = var94.field2033;
                    if (var94.field2039 == 1) {
                        var92.field3324 = 1;
                    } else {
                        var92.field3324 = 2;
                    }
                    if (var92.field3311 > 0) {
                        var92.field3319 = var92.field3319 * 32 / var92.field3311;
                    } else if (var92.field3276 > 0) {
                        var92.field3319 = var92.field3319 * 32 / var92.field3276;
                    }
                    method2435(var92);
                } else if (var90 == -1) {
                    var92.field3318 = 0;
                    arg0.field1321 = null;
                    return true;
                } else {
                    class181 var93 = class181.method1538(var90);
                    var92.field3318 = 4;
                    var92.field3309 = var90;
                    var92.field3316 = var93.field2034;
                    var92.field3256 = var93.field2066;
                    var92.field3319 = var93.field2033 * 100 / var89;
                    method2435(var92);
                }
                arg0.field1321 = null;
                return true;
            }
            if (class258.field2990 == arg0.field1321) {
                if (field725 != -1) {
                    method358(field725, 0);
                }
                arg0.field1321 = null;
                return true;
            }
            if (class258.field2977 == arg0.field1321) {
                field606 = var3.method6696();
                field656 = var3.method6696();
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3039 == arg0.field1321) {
                for (int var95 = 0; var95 < field619.length; var95++) {
                    if (field619[var95] != null) {
                        field619[var95].field1144 = -1;
                    }
                }
                for (int var96 = 0; var96 < field546.length; var96++) {
                    if (field546[var96] != null) {
                        field546[var96].field1144 = -1;
                    }
                }
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3000 == arg0.field1321) {
                String var97 = var3.method6674();
                int var98 = var3.method6714();
                class286 var99 = class286.method2611(var98);
                if (!var97.equals(var99.field3296)) {
                    var99.field3296 = var97;
                    method2435(var99);
                }
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3020 == arg0.field1321) {
                String var100 = var3.method6674();
                String var101 = class333.method5477(class336.method3942(class275.method5197(var3)));
                class98.method2081(6, var100, var101);
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3026 == arg0.field1321) {
                boolean var102 = var3.method6686() == 1;
                if (var102) {
                    Statics.field1627 = class262.method4787() - var3.method6670();
                    Statics.field1578 = new class309(var3, true);
                } else {
                    Statics.field1578 = null;
                }
                field653 = field690;
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3030 == arg0.field1321) {
                method4012();
                byte var103 = var3.method6664();
                class130 var104 = new class130(var3);
                class138 var105;
                if (var103 >= 0) {
                    var105 = field589[var103];
                } else {
                    var105 = Statics.field1355;
                }
                var104.method2608(var105);
                arg0.field1321 = null;
                return true;
            }
            if (class258.field2991 == arg0.field1321) {
                int var106 = var3.method6679();
                boolean var107 = var3.method6686() == 1;
                String var108 = "";
                boolean var109 = false;
                if (var107) {
                    var108 = var3.method6674();
                    if (Statics.field1606.method1588(new class442(var108, Statics.field1786))) {
                        var109 = true;
                    }
                }
                String var110 = var3.method6674();
                if (!var109) {
                    class98.method2081(var106, var108, var110);
                }
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3005 == arg0.field1321) {
                int var111 = var3.method6669();
                int var112 = var3.method6666();
                int var113 = var3.method6764();
                class80 var114 = (class80) field666.method6456((long) var111);
                if (var114 != null) {
                    method2598(var114, var114.field1039 != var112);
                }
                method4357(var111, var112, var113);
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3058 == arg0.field1321) {
                method977(true, arg0.field1318);
                arg0.field1321 = null;
                return true;
            }
            if (class258.field2981 == arg0.field1321) {
                byte var115 = var3.method6664();
                String var116 = var3.method6674();
                long var117 = (long) var3.method6666();
                long var119 = (long) var3.method6668();
                class302 var121 = (class302) class321.method2696(class302.method4604(), var3.method6686());
                long var122 = (var117 << 32) + var119;
                boolean var124 = false;
                Object var125 = null;
                class147 var126 = var115 >= 0 ? field717[var115] : Statics.field1037;
                if (var126 == null) {
                    var124 = true;
                } else {
                    int var127 = 0;
                    while (true) {
                        if (var127 >= 100) {
                            if (var121.field3851 && Statics.field1606.method1588(new class442(var116, Statics.field1786))) {
                                var124 = true;
                            }
                            break;
                        }
                        if (field728[var127] == var122) {
                            var124 = true;
                            break;
                        }
                        var127++;
                    }
                }
                if (!var124) {
                    field728[field729] = var122;
                    field729 = (field729 + 1) % 100;
                    String var128 = class333.method5477(class275.method5197(var3));
                    int var129 = var115 >= 0 ? 41 : 44;
                    if (var121.field3860 == -1) {
                        class98.method1795(var129, var116, var128, var126.field1662);
                    } else {
                        class98.method1795(var129, class92.method4309(var121.field3860) + var116, var128, var126.field1662);
                    }
                }
                arg0.field1321 = null;
                return true;
            }
            if (class258.field2969 == arg0.field1321) {
                Statics.field244 = var3.method6686();
                Statics.field158 = var3.method6695();
                for (int var130 = Statics.field244; var130 < Statics.field244 + 8; var130++) {
                    for (int var131 = Statics.field158; var131 < Statics.field158 + 8; var131++) {
                        if (field633[Statics.field325][var130][var131] != null) {
                            field633[Statics.field325][var130][var131] = null;
                            method4947(var130, var131);
                        }
                    }
                }
                for (class84 var132 = (class84) field634.method5269(); var132 != null; var132 = (class84) field634.method5270()) {
                    if (var132.field1097 >= Statics.field244 && var132.field1097 < Statics.field244 + 8 && var132.field1105 >= Statics.field158 && var132.field1105 < Statics.field158 + 8 && Statics.field325 == var132.field1106) {
                        var132.field1098 = 0;
                    }
                }
                arg0.field1321 = null;
                return true;
            }
            if (class258.field2973 == arg0.field1321) {
                Statics.field1179 = true;
                method5968(false, var3);
                arg0.field1321 = null;
                return true;
            }
            if (class258.field2994 == arg0.field1321) {
                field743 = var3.method6686();
                arg0.field1321 = null;
                return true;
            }
            if (class258.field2972 == arg0.field1321) {
                method5968(true, var3);
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3040 == arg0.field1321) {
                field741 = var3.method6686();
                if (field741 == 255) {
                    field741 = 0;
                }
                field742 = var3.method6686();
                if (field742 == 255) {
                    field742 = 0;
                }
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3002 == arg0.field1321) {
                method2582(var3.method6674());
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3037 == arg0.field1321) {
                field752 = true;
                field756 = false;
                Statics.field34 = var3.method6686();
                Statics.field120 = var3.method6686();
                Statics.field4058 = var3.method6666();
                Statics.field2724 = var3.method6686();
                Statics.field2574 = var3.method6686();
                if (Statics.field2574 >= 100) {
                    int var133 = Statics.field34 * 128 + 64;
                    int var134 = Statics.field120 * 128 + 64;
                    int var135 = method2169(var133, var134, Statics.field325) - Statics.field4058;
                    int var136 = var133 - Statics.field4498;
                    int var137 = var135 - Statics.field2749;
                    int var138 = var134 - Statics.field494;
                    int var139 = (int) Math.sqrt((double) (var136 * var136 + var138 * var138));
                    Statics.field33 = (int) (Math.atan2((double) var137, (double) var139) * 325.9490051269531D) & 0x7FF;
                    Statics.field42 = (int) (Math.atan2((double) var136, (double) var138) * -325.9490051269531D) & 0x7FF;
                    if (Statics.field33 < 128) {
                        Statics.field33 = 128;
                    }
                    if (Statics.field33 > 383) {
                        Statics.field33 = 383;
                    }
                }
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3048 == arg0.field1321) {
                int var140 = var3.method6669();
                boolean var141 = var3.method6764() == 1;
                class286 var142 = class286.method2611(var140);
                if (var142.field3360 != var141) {
                    var142.field3360 = var141;
                    method2435(var142);
                }
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3011 == arg0.field1321) {
                int var143 = var3.method6782();
                int var144 = var3.method6706();
                int var145 = var3.method6715();
                class286 var146 = class286.method2611(var145);
                if (var146.field3323 != var143 || var146.field3275 != var144 || var146.field3270 != 0 || var146.field3271 != 0) {
                    var146.field3323 = var143;
                    var146.field3275 = var144;
                    var146.field3270 = 0;
                    var146.field3271 = 0;
                    method2435(var146);
                    this.method1067(var146);
                    if (var146.field3286 == 0) {
                        method728(Statics.field3290[var145 >> 16], var146, false);
                    }
                }
                arg0.field1321 = null;
                return true;
            }
            if (class258.field2986 == arg0.field1321) {
                method977(false, arg0.field1318);
                arg0.field1321 = null;
                return true;
            }
            if (class258.field2995 == arg0.field1321) {
                method2339(class256.field2946);
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3022 == arg0.field1321) {
                int var147 = var3.method6669();
                int var148 = var3.method6666();
                if (var147 < -70000) {
                    var148 += 32768;
                }
                class286 var149;
                if (var147 >= 0) {
                    var149 = class286.method2611(var147);
                } else {
                    var149 = null;
                }
                while (var3.field4512 < arg0.field1320) {
                    int var150 = var3.method6679();
                    int var151 = var3.method6666();
                    int var152 = 0;
                    if (var151 != 0) {
                        var152 = var3.method6686();
                        if (var152 == 255) {
                            var152 = var3.method6669();
                        }
                    }
                    if (var149 != null && var150 >= 0 && var150 < var149.field3393.length) {
                        var149.field3393[var150] = var151;
                        var149.field3394[var150] = var152;
                    }
                    class78.method2882(var148, var150, var151 - 1, var152);
                }
                if (var149 != null) {
                    method2435(var149);
                }
                method4382();
                field647[++field495 - 1 & 0x1F] = var148 & 0x7FFF;
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3009 == arg0.field1321) {
                int var153 = var3.method6669();
                int var154 = var3.method6714();
                class80 var155 = (class80) field666.method6456((long) var153);
                class80 var156 = (class80) field666.method6456((long) var154);
                if (var156 != null) {
                    method2598(var156, var155 == null || var155.field1039 != var156.field1039);
                }
                if (var155 != null) {
                    var155.method6167();
                    field666.method6455(var155, (long) var154);
                }
                class286 var157 = class286.method2611(var153);
                if (var157 != null) {
                    method2435(var157);
                }
                class286 var158 = class286.method2611(var154);
                if (var158 != null) {
                    method2435(var158);
                    method728(Statics.field3290[var158.field3265 >>> 16], var158, true);
                }
                if (field725 != -1) {
                    method358(field725, 1);
                }
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3041 == arg0.field1321) {
                Statics.field879 = class438.method4349(var3.method6686());
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3021 == arg0.field1321) {
                if (Statics.field888 != null) {
                    Statics.field888.method5713(var3);
                }
                method2613();
                arg0.field1321 = null;
                return true;
            }
            if (class258.field2974 == arg0.field1321) {
                int var159 = var3.method6669();
                int var160 = var3.method6666();
                if (var159 < -70000) {
                    var160 += 32768;
                }
                class286 var161;
                if (var159 >= 0) {
                    var161 = class286.method2611(var159);
                } else {
                    var161 = null;
                }
                if (var161 != null) {
                    for (int var162 = 0; var162 < var161.field3393.length; var162++) {
                        var161.field3393[var162] = 0;
                        var161.field3394[var162] = 0;
                    }
                }
                class78.method5861(var160);
                int var163 = var3.method6666();
                for (int var164 = 0; var164 < var163; var164++) {
                    int var165 = var3.method6711();
                    int var166 = var3.method6764();
                    if (var166 == 255) {
                        var166 = var3.method6715();
                    }
                    if (var161 != null && var164 < var161.field3393.length) {
                        var161.field3393[var164] = var165;
                        var161.field3394[var164] = var166;
                    }
                    class78.method2882(var160, var164, var165 - 1, var166);
                }
                if (var161 != null) {
                    method2435(var161);
                }
                method4382();
                field647[++field495 - 1 & 0x1F] = var160 & 0x7FFF;
                arg0.field1321 = null;
                return true;
            }
            if (class258.field2998 == arg0.field1321) {
                int var167 = var3.method6686();
                if (var3.method6686() == 0) {
                    field516[var167] = new class316();
                    var3.field4512 += 18;
                } else {
                    var3.field4512--;
                    field516[var167] = new class316(var3, false);
                }
                field704 = field690;
                arg0.field1321 = null;
                return true;
            }
            if (class258.field2987 == arg0.field1321) {
                method2339(class256.field2942);
                arg0.field1321 = null;
                return true;
            }
            if (class258.field2975 == arg0.field1321) {
                method2339(class256.field2947);
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3024 == arg0.field1321) {
                int var168 = var3.method6669();
                int var169 = var3.method6669();
                int var170 = class32.method2381();
                class257 var171 = class257.method2630(class255.field2891, field551.field1319);
                var171.field2960.method6783(var168);
                var171.field2960.method6783(var169);
                var171.field2960.method6755(var170);
                var171.field2960.method6667(field193);
                field551.method2268(var171);
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3014 == arg0.field1321) {
                method2339(class256.field2944);
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3044 == arg0.field1321) {
                method2625();
                arg0.field1321 = null;
                return false;
            }
            if (class258.field3015 == arg0.field1321) {
                method2339(class256.field2945);
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3001 == arg0.field1321) {
                Statics.field1606.method1584(var3, arg0.field1320);
                field601 = field690;
                arg0.field1321 = null;
                return true;
            }
            if (class258.field2989 == arg0.field1321) {
                method4382();
                field673 = var3.method6830();
                field706 = field690;
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3045 == arg0.field1321) {
                method4382();
                field672 = var3.method6686();
                field706 = field690;
                arg0.field1321 = null;
                return true;
            }
            if (class258.field2966 == arg0.field1321) {
                int var172 = var3.method6666();
                int var173 = var3.method6714();
                int var174 = var3.method6666();
                int var175 = var3.method6711();
                class286 var176 = class286.method2611(var173);
                if (var176.field3316 != var175 || var176.field3256 != var172 || var176.field3319 != var174) {
                    var176.field3316 = var175;
                    var176.field3256 = var172;
                    var176.field3319 = var174;
                    method2435(var176);
                }
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3056 == arg0.field1321) {
                String var177 = var3.method6674();
                long var178 = var3.method6670();
                long var180 = (long) var3.method6666();
                long var182 = (long) var3.method6668();
                class302 var184 = (class302) class321.method2696(class302.method4604(), var3.method6686());
                long var185 = (var180 << 32) + var182;
                boolean var187 = false;
                for (int var188 = 0; var188 < 100; var188++) {
                    if (field728[var188] == var185) {
                        var187 = true;
                        break;
                    }
                }
                if (var184.field3851 && Statics.field1606.method1588(new class442(var177, Statics.field1786))) {
                    var187 = true;
                }
                if (!var187 && field659 == 0) {
                    field728[field729] = var185;
                    field729 = (field729 + 1) % 100;
                    String var189 = class333.method5477(class336.method3942(class275.method5197(var3)));
                    if (var184.field3860 == -1) {
                        class98.method1795(9, var177, var189, class338.method5582(var178));
                    } else {
                        class98.method1795(9, class92.method4309(var184.field3860) + var177, var189, class338.method5582(var178));
                    }
                }
                arg0.field1321 = null;
                return true;
            }
            if (class258.field2988 == arg0.field1321) {
                if (arg0.field1320 == 0) {
                    Statics.field888 = null;
                } else {
                    if (Statics.field888 == null) {
                        Statics.field888 = new class352(Statics.field1786, Statics.field4489);
                    }
                    Statics.field888.method5717(var3);
                }
                method2613();
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3008 == arg0.field1321) {
                if (Statics.field2681 == null) {
                    Statics.field2681 = new class376(Statics.field2085);
                }
                class429 var190 = Statics.field2085.method6121(var3);
                Statics.field2681.field4269.method6466(var190.field4577, var190.field4576);
                field697[++field698 - 1 & 0x1F] = var190.field4577;
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3004 == arg0.field1321) {
                int var191 = arg0.field1320 + var3.field4512;
                int var192 = var3.method6666();
                int var193 = var3.method6666();
                if (field725 != var192) {
                    field725 = var192;
                    this.method1070(false);
                    method5594(field725);
                    class64.method3773(field725);
                    for (int var194 = 0; var194 < 100; var194++) {
                        field714[var194] = true;
                    }
                }
                while (var193-- > 0) {
                    int var195 = var3.method6669();
                    int var196 = var3.method6666();
                    int var197 = var3.method6686();
                    class80 var198 = (class80) field666.method6456((long) var195);
                    if (var198 != null && var198.field1039 != var196) {
                        method2598(var198, true);
                        var198 = null;
                    }
                    if (var198 == null) {
                        var198 = method4357(var195, var196, var197);
                    }
                    var198.field1041 = true;
                }
                for (class80 var199 = (class80) field666.method6463(); var199 != null; var199 = (class80) field666.method6457()) {
                    if (var199.field1041) {
                        var199.field1041 = false;
                    } else {
                        method2598(var199, true);
                    }
                }
                field711 = new class402(512);
                while (var3.field4512 < var191) {
                    int var200 = var3.method6669();
                    int var201 = var3.method6666();
                    int var202 = var3.method6666();
                    int var203 = var3.method6669();
                    for (int var204 = var201; var204 <= var202; var204++) {
                        long var205 = ((long) var200 << 32) + (long) var204;
                        field711.method6455(new class391(var203), var205);
                    }
                }
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3018 == arg0.field1321) {
                Statics.field1179 = true;
                method5968(true, var3);
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3031 == arg0.field1321) {
                byte var207 = var3.method6664();
                long var208 = (long) var3.method6666();
                long var210 = (long) var3.method6668();
                long var212 = (var208 << 32) + var210;
                boolean var214 = false;
                class147 var215 = var207 >= 0 ? field717[var207] : Statics.field1037;
                if (var215 == null) {
                    var214 = true;
                } else {
                    for (int var216 = 0; var216 < 100; var216++) {
                        if (field728[var216] == var212) {
                            var214 = true;
                            break;
                        }
                    }
                }
                if (!var214) {
                    field728[field729] = var212;
                    field729 = (field729 + 1) % 100;
                    String var217 = class275.method5197(var3);
                    int var218 = var207 >= 0 ? 43 : 46;
                    class98.method1795(var218, "", var217, var215.field1662);
                }
                arg0.field1321 = null;
                return true;
            }
            if (class258.field2982 == arg0.field1321) {
                int var219 = var3.method6705();
                field725 = var219;
                this.method1070(false);
                method5594(var219);
                class64.method3773(field725);
                for (int var220 = 0; var220 < 100; var220++) {
                    field714[var220] = true;
                }
                arg0.field1321 = null;
                return true;
            }
            if (class258.field2993 == arg0.field1321) {
                field504 = field690;
                byte var221 = var3.method6664();
                if (arg0.field1320 == 1) {
                    if (var221 >= 0) {
                        field717[var221] = null;
                    } else {
                        Statics.field1037 = null;
                    }
                    arg0.field1321 = null;
                    return true;
                }
                if (var221 >= 0) {
                    field717[var221] = new class147(var3);
                } else {
                    Statics.field1037 = new class147(var3);
                }
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3054 == arg0.field1321) {
                method2339(class256.field2943);
                arg0.field1321 = null;
                return true;
            }
            if (class258.field2984 == arg0.field1321) {
                class34.method3359(var3, arg0.field1320);
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3036 == arg0.field1321) {
                field752 = true;
                field756 = false;
                Statics.field479 = var3.method6686();
                Statics.field76 = var3.method6686();
                Statics.field1493 = var3.method6666();
                Statics.field2544 = var3.method6686();
                Statics.field18 = var3.method6686();
                if (Statics.field18 >= 100) {
                    Statics.field4498 = Statics.field479 * 128 + 64;
                    Statics.field494 = Statics.field76 * 128 + 64;
                    Statics.field2749 = method2169(Statics.field4498, Statics.field494, Statics.field325) - Statics.field1493;
                }
                arg0.field1321 = null;
                return true;
            }
            if (class258.field2967 == arg0.field1321) {
                class61 var222 = new class61();
                var222.field798 = var3.method6674();
                var222.field795 = var3.method6666();
                int var223 = var3.method6669();
                var222.field796 = var223;
                method2405(45);
                var2.method2780();
                Object var224 = null;
                class69.method1984(var222);
                arg0.field1321 = null;
                return false;
            }
            if (class258.field3003 == arg0.field1321 && field752) {
                field756 = true;
                Statics.field2544 = var3.method6686();
                Statics.field18 = var3.method6686();
                Statics.field2724 = var3.method6686();
                Statics.field2574 = var3.method6686();
                for (int var225 = 0; var225 < 5; var225++) {
                    field754[var225] = false;
                }
                arg0.field1321 = null;
                return true;
            }
            if (class258.field2985 == arg0.field1321) {
                method4012();
                byte var226 = var3.method6664();
                if (arg0.field1320 == 1) {
                    if (var226 >= 0) {
                        field589[var226] = null;
                    } else {
                        Statics.field1355 = null;
                    }
                    arg0.field1321 = null;
                    return true;
                }
                if (var226 >= 0) {
                    field589[var226] = new class138(var3);
                } else {
                    Statics.field1355 = new class138(var3);
                }
                arg0.field1321 = null;
                return true;
            }
            if (class258.field2980 == arg0.field1321) {
                int var227 = var3.method6715();
                int var228 = var3.method6705();
                class281.field3225[var228] = var227;
                if (class281.field3224[var228] != var227) {
                    class281.field3224[var228] = var227;
                }
                method5028(var228);
                field675[++field692 - 1 & 0x1F] = var228;
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3059 == arg0.field1321) {
                int var229 = var3.method6666();
                byte var230 = var3.method6698();
                class281.field3225[var229] = var230;
                if (class281.field3224[var229] != var230) {
                    class281.field3224[var229] = var230;
                }
                method5028(var229);
                field675[++field692 - 1 & 0x1F] = var229;
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3032 == arg0.field1321) {
                field757 = var3.method6705() * 30;
                field706 = field690;
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3007 == arg0.field1321) {
                int var231 = var3.method6686();
                int var232 = var3.method6686();
                int var233 = var3.method6686();
                int var234 = var3.method6686();
                field754[var231] = true;
                field755[var231] = var232;
                field734[var231] = var233;
                field501[var231] = var234;
                field758[var231] = 0;
                arg0.field1321 = null;
                return true;
            }
            if (class258.field3038 == arg0.field1321) {
                Statics.field244 = var3.method6764();
                Statics.field158 = var3.method6696();
                arg0.field1321 = null;
                return true;
            }
            if (class258.field2992 == arg0.field1321) {
                int var235 = var3.method6669();
                if (field514 != var235) {
                    field514 = var235;
                    method4940();
                }
                arg0.field1321 = null;
                return true;
            }
            class445.method3452("" + (arg0.field1321 == null ? -1 : arg0.field1321.field3029) + class92.field1249 + (arg0.field1327 == null ? -1 : arg0.field1327.field3029) + class92.field1249 + (arg0.field1328 == null ? -1 : arg0.field1328.field3029) + class92.field1249 + arg0.field1320, (Throwable) null);
            method2625();
        } catch (IOException var240) {
            method254();
        } catch (Exception var241) {
            String var238 = "" + (arg0.field1321 == null ? -1 : arg0.field1321.field3029) + class92.field1249 + (arg0.field1327 == null ? -1 : arg0.field1327.field3029) + class92.field1249 + (arg0.field1328 == null ? -1 : arg0.field1328.field3029) + class92.field1249 + arg0.field1320 + class92.field1249 + (Statics.field161 + Statics.field2754.field1173[0]) + class92.field1249 + (Statics.field1467 + Statics.field2754.field1147[0]) + class92.field1249;
            for (int var239 = 0; var239 < arg0.field1320 && var239 < 50; var239++) {
                var238 = var238 + var3.field4511[var239] + class92.field1249;
            }
            class445.method3452(var238, var241);
            method2625();
        }
        return true;
    }

    @ObfuscatedName("cv.hn(Lij;I)V")
    public static final void method2339(class256 arg0) {
        class420 var1 = field551.field1318;
        if (class256.field2947 == arg0) {
            int var2 = var1.method6711();
            int var3 = var1.method6686();
            int var4 = (var3 >> 4 & 0x7) + Statics.field244;
            int var5 = (var3 & 0x7) + Statics.field158;
            int var6 = var1.method6686();
            int var7 = var6 >> 2;
            int var8 = var6 & 0x3;
            int var9 = field566[var7];
            if (var4 >= 0 && var5 >= 0 && var4 < 103 && var5 < 103) {
                if (var9 == 0) {
                    class209 var10 = Statics.field415.method3678(Statics.field325, var4, var5);
                    if (var10 != null) {
                        int var11 = class205.method3561(var10.field2558);
                        if (var7 == 2) {
                            var10.field2556 = new class73(var11, 2, var8 + 4, Statics.field325, var4, var5, var2, false, var10.field2556);
                            var10.field2554 = new class73(var11, 2, var8 + 1 & 0x3, Statics.field325, var4, var5, var2, false, var10.field2554);
                        } else {
                            var10.field2556 = new class73(var11, var7, var8, Statics.field325, var4, var5, var2, false, var10.field2556);
                        }
                    }
                }
                if (var9 == 1) {
                    class211 var12 = Statics.field415.method3595(Statics.field325, var4, var5);
                    if (var12 != null) {
                        int var13 = class205.method3561(var12.field2563);
                        if (var7 == 4 || var7 == 5) {
                            var12.field2570 = new class73(var13, 4, var8, Statics.field325, var4, var5, var2, false, var12.field2570);
                        } else if (var7 == 6) {
                            var12.field2570 = new class73(var13, 4, var8 + 4, Statics.field325, var4, var5, var2, false, var12.field2570);
                        } else if (var7 == 7) {
                            var12.field2570 = new class73(var13, 4, (var8 + 2 & 0x3) + 4, Statics.field325, var4, var5, var2, false, var12.field2570);
                        } else if (var7 == 8) {
                            var12.field2570 = new class73(var13, 4, var8 + 4, Statics.field325, var4, var5, var2, false, var12.field2570);
                            var12.field2571 = new class73(var13, 4, (var8 + 2 & 0x3) + 4, Statics.field325, var4, var5, var2, false, var12.field2571);
                        }
                    }
                }
                if (var9 == 2) {
                    class212 var14 = Statics.field415.method3596(Statics.field325, var4, var5);
                    if (var7 == 11) {
                        var7 = 10;
                    }
                    if (var14 != null) {
                        var14.field2575 = new class73(class205.method3561(var14.field2579), var7, var8, Statics.field325, var4, var5, var2, false, var14.field2575);
                    }
                }
                if (var9 == 3) {
                    class190 var15 = Statics.field415.method3597(Statics.field325, var4, var5);
                    if (var15 != null) {
                        var15.field2206 = new class73(class205.method3561(var15.field2205), 22, var8, Statics.field325, var4, var5, var2, false, var15.field2206);
                    }
                }
            }
        } else if (class256.field2943 == arg0) {
            int var16 = var1.method6686();
            int var17 = (var16 >> 4 & 0x7) + Statics.field244;
            int var18 = (var16 & 0x7) + Statics.field158;
            int var19 = var1.method6711();
            int var20 = var1.method6705();
            int var21 = var1.method6666();
            if (var17 >= 0 && var18 >= 0 && var17 < 104 && var18 < 104) {
                class326 var22 = field633[Statics.field325][var17][var18];
                if (var22 != null) {
                    for (class95 var23 = (class95) var22.method5269(); var23 != null; var23 = (class95) var22.method5270()) {
                        if ((var20 & 0x7FFF) == var23.field1271 && var23.field1272 == var19) {
                            var23.field1272 = var21;
                            break;
                        }
                    }
                    method4947(var17, var18);
                }
            }
        } else {
            if (class256.field2948 == arg0) {
                int var24 = var1.method6711();
                byte var25 = var1.method6697();
                int var26 = var1.method6859();
                int var27 = var1.method6666();
                int var28 = var1.method6695();
                int var29 = (var28 >> 4 & 0x7) + Statics.field244;
                int var30 = (var28 & 0x7) + Statics.field158;
                int var31 = var1.method6695();
                int var32 = var31 >> 2;
                int var33 = var31 & 0x3;
                int var34 = field566[var32];
                byte var35 = var1.method6697();
                byte var36 = var1.method6697();
                byte var37 = var1.method6664();
                int var38 = var1.method6666();
                class83 var39;
                if (field576 == var24) {
                    var39 = Statics.field2754;
                } else {
                    var39 = field619[var24];
                }
                if (var39 != null) {
                    class180 var40 = class180.method3056(var38);
                    int var41;
                    int var42;
                    if (var33 == 1 || var33 == 3) {
                        var41 = var40.field1985;
                        var42 = var40.field1995;
                    } else {
                        var41 = var40.field1995;
                        var42 = var40.field1985;
                    }
                    int var43 = (var41 >> 1) + var29;
                    int var44 = (var41 + 1 >> 1) + var29;
                    int var45 = (var42 >> 1) + var30;
                    int var46 = (var42 + 1 >> 1) + var30;
                    int[][] var47 = class75.field1005[Statics.field325];
                    int var48 = var47[var43][var45] + var47[var44][var45] + var47[var43][var46] + var47[var44][var46] >> 2;
                    int var49 = (var29 << 7) + (var41 << 6);
                    int var50 = (var30 << 7) + (var42 << 6);
                    class204 var51 = var40.method3148(var32, var33, var47, var49, var48, var50);
                    if (var51 != null) {
                        method4339(Statics.field325, var29, var30, var34, -1, 0, 0, var26 + 1, var27 + 1);
                        var39.field1074 = field682 + var26;
                        var39.field1075 = field682 + var27;
                        var39.field1079 = var51;
                        var39.field1076 = var29 * 128 + var41 * 64;
                        var39.field1078 = var30 * 128 + var42 * 64;
                        var39.field1077 = var48;
                        if (var36 > var25) {
                            byte var52 = var36;
                            var36 = var25;
                            var25 = var52;
                        }
                        if (var37 > var35) {
                            byte var53 = var37;
                            var37 = var35;
                            var35 = var53;
                        }
                        var39.field1067 = var29 + var36;
                        var39.field1080 = var25 + var29;
                        var39.field1081 = var30 + var37;
                        var39.field1083 = var30 + var35;
                    }
                }
            }
            if (class256.field2942 == arg0) {
                int var54 = var1.method6666();
                int var55 = var1.method6705();
                int var56 = var1.method6764();
                int var57 = (var56 >> 4 & 0x7) + Statics.field244;
                int var58 = (var56 & 0x7) + Statics.field158;
                if (var57 >= 0 && var58 >= 0 && var57 < 104 && var58 < 104) {
                    class95 var59 = new class95();
                    var59.field1271 = var55;
                    var59.field1272 = var54;
                    if (field633[Statics.field325][var57][var58] == null) {
                        field633[Statics.field325][var57][var58] = new class326();
                    }
                    field633[Statics.field325][var57][var58].method5264(var59);
                    method4947(var57, var58);
                }
            } else if (class256.field2946 == arg0) {
                int var60 = var1.method6666();
                int var61 = var1.method6695();
                int var62 = var61 >> 2;
                int var63 = var61 & 0x3;
                int var64 = field566[var62];
                int var65 = var1.method6695();
                int var66 = (var65 >> 4 & 0x7) + Statics.field244;
                int var67 = (var65 & 0x7) + Statics.field158;
                if (var66 >= 0 && var67 >= 0 && var66 < 104 && var67 < 104) {
                    method4339(Statics.field325, var66, var67, var64, var60, var62, var63, 0, -1);
                }
            } else if (class256.field2950 == arg0) {
                int var68 = var1.method6764();
                int var69 = (var68 >> 4 & 0x7) + Statics.field244;
                int var70 = (var68 & 0x7) + Statics.field158;
                int var71 = var1.method6764();
                int var72 = var1.method6711();
                int var73 = var1.method6859();
                if (var69 >= 0 && var70 >= 0 && var69 < 104 && var70 < 104) {
                    int var74 = var69 * 128 + 64;
                    int var75 = var70 * 128 + 64;
                    class65 var76 = new class65(var72, Statics.field325, var74, var75, method2169(var74, var75, Statics.field325) - var71, var73, field682);
                    field636.method5264(var76);
                }
            } else {
                if (class256.field2951 == arg0) {
                    int var77 = var1.method6686();
                    int var78 = var77 >> 4 & 0xF;
                    int var79 = var77 & 0x7;
                    int var80 = var1.method6705();
                    int var81 = var1.method6764();
                    int var82 = var1.method6764();
                    int var83 = (var82 >> 4 & 0x7) + Statics.field244;
                    int var84 = (var82 & 0x7) + Statics.field158;
                    if (var83 >= 0 && var84 >= 0 && var83 < 104 && var84 < 104) {
                        int var85 = var78 + 1;
                        if (Statics.field2754.field1173[0] >= var83 - var85 && Statics.field2754.field1173[0] <= var83 + var85 && Statics.field2754.field1147[0] >= var84 - var85 && Statics.field2754.field1147[0] <= var84 + var85 && Statics.field4567.field1231 != 0 && var79 > 0 && field746 < 50) {
                            field747[field746] = var80;
                            field748[field746] = var79;
                            field749[field746] = var81;
                            field751[field746] = null;
                            field598[field746] = (var83 << 16) + (var84 << 8) + var78;
                            field746++;
                        }
                    }
                }
                if (class256.field2945 == arg0) {
                    int var86 = var1.method6695();
                    int var87 = (var86 >> 4 & 0x7) + Statics.field244;
                    int var88 = (var86 & 0x7) + Statics.field158;
                    int var89 = var1.method6696();
                    int var90 = var89 >> 2;
                    int var91 = var89 & 0x3;
                    int var92 = field566[var90];
                    if (var87 >= 0 && var88 >= 0 && var87 < 104 && var88 < 104) {
                        method4339(Statics.field325, var87, var88, var92, -1, var90, var91, 0, -1);
                    }
                } else if (class256.field2944 == arg0) {
                    int var93 = var1.method6859();
                    int var94 = var1.method6764();
                    int var95 = (var94 >> 4 & 0x7) + Statics.field244;
                    int var96 = (var94 & 0x7) + Statics.field158;
                    if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
                        class326 var97 = field633[Statics.field325][var95][var96];
                        if (var97 != null) {
                            for (class95 var98 = (class95) var97.method5269(); var98 != null; var98 = (class95) var97.method5270()) {
                                if ((var93 & 0x7FFF) == var98.field1271) {
                                    var98.method6167();
                                    break;
                                }
                            }
                            if (var97.method5269() == null) {
                                field633[Statics.field325][var95][var96] = null;
                            }
                            method4947(var95, var96);
                        }
                    }
                } else if (class256.field2949 == arg0) {
                    byte var99 = var1.method6662();
                    byte var100 = var1.method6662();
                    int var101 = var1.method6859();
                    int var102 = var1.method6706();
                    int var103 = var1.method6859();
                    int var104 = var1.method6696() * 4;
                    int var105 = var1.method6764();
                    int var106 = var1.method6859();
                    int var107 = var1.method6764() * 4;
                    int var108 = var1.method6696();
                    int var109 = (var108 >> 4 & 0x7) + Statics.field244;
                    int var110 = (var108 & 0x7) + Statics.field158;
                    int var111 = var1.method6696();
                    int var112 = var99 + var109;
                    int var113 = var100 + var110;
                    if (var109 >= 0 && var110 >= 0 && var109 < 104 && var110 < 104 && var112 >= 0 && var113 >= 0 && var112 < 104 && var113 < 104 && var101 != 65535) {
                        int var114 = var109 * 128 + 64;
                        int var115 = var110 * 128 + 64;
                        int var116 = var112 * 128 + 64;
                        int var117 = var113 * 128 + 64;
                        class70 var118 = new class70(var101, Statics.field325, var114, var115, method2169(var114, var115, Statics.field325) - var104, field682 + var103, field682 + var106, var111, var105, var102, var107);
                        var118.method1870(var116, var117, method2169(var116, var117, Statics.field325) - var107, field682 + var103);
                        field759.method5264(var118);
                    }
                }
            }
        }
    }

    @ObfuscatedName("hx.hk(IIIIIIIIII)V")
    public static final void method4339(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class84 var9 = null;
        for (class84 var10 = (class84) field634.method5269(); var10 != null; var10 = (class84) field634.method5270()) {
            if (var10.field1106 == arg0 && var10.field1097 == arg1 && var10.field1105 == arg2 && var10.field1096 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class84();
            var9.field1106 = arg0;
            var9.field1096 = arg3;
            var9.field1097 = arg1;
            var9.field1105 = arg2;
            method4949(var9);
            field634.method5264(var9);
        }
        var9.field1102 = arg4;
        var9.field1104 = arg5;
        var9.field1103 = arg6;
        var9.field1109 = arg7;
        var9.field1098 = arg8;
    }

    @ObfuscatedName("cs.hi(B)V")
    public static final void method2111() {
        for (class84 var0 = (class84) field634.method5269(); var0 != null; var0 = (class84) field634.method5270()) {
            if (var0.field1098 == -1) {
                var0.field1109 = 0;
                method4949(var0);
            } else {
                var0.method6167();
            }
        }
    }

    @ObfuscatedName("kw.hz(Lcb;I)V")
    public static final void method4949(class84 arg0) {
        long var1 = 0L;
        int var3 = -1;
        int var4 = 0;
        int var5 = 0;
        if (arg0.field1096 == 0) {
            var1 = Statics.field415.method3598(arg0.field1106, arg0.field1097, arg0.field1105);
        }
        if (arg0.field1096 == 1) {
            var1 = Statics.field415.method3599(arg0.field1106, arg0.field1097, arg0.field1105);
        }
        if (arg0.field1096 == 2) {
            var1 = Statics.field415.method3645(arg0.field1106, arg0.field1097, arg0.field1105);
        }
        if (arg0.field1096 == 3) {
            var1 = Statics.field415.method3601(arg0.field1106, arg0.field1097, arg0.field1105);
        }
        if (var1 != 0L) {
            int var6 = Statics.field415.method3602(arg0.field1106, arg0.field1097, arg0.field1105, var1);
            var3 = class205.method3561(var1);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg0.field1099 = var3;
        arg0.field1101 = var4;
        arg0.field1107 = var5;
    }

    @ObfuscatedName("go.hy(IIIIIIII)V")
    public static final void method3451(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field500 && Statics.field325 != arg0) {
            return;
        }
        long var7 = 0L;
        boolean var9 = true;
        boolean var10 = false;
        boolean var11 = false;
        if (arg1 == 0) {
            var7 = Statics.field415.method3598(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field415.method3599(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field415.method3645(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field415.method3601(arg0, arg2, arg3);
        }
        if (var7 != 0L) {
            int var12 = Statics.field415.method3602(arg0, arg2, arg3, var7);
            int var13 = class205.method3561(var7);
            int var14 = var12 & 0x1F;
            int var15 = var12 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field415.method3589(arg0, arg2, arg3);
                class180 var16 = class180.method3056(var13);
                if (var16.field1996 != 0) {
                    field518[arg0].method3337(arg2, arg3, var14, var15, var16.field1983);
                }
            }
            if (arg1 == 1) {
                Statics.field415.method3590(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field415.method3696(arg0, arg2, arg3);
                class180 var17 = class180.method3056(var13);
                if (var17.field1995 + arg2 > 103 || var17.field1995 + arg3 > 103 || var17.field1985 + arg2 > 103 || var17.field1985 + arg3 > 103) {
                    return;
                }
                if (var17.field1996 != 0) {
                    field518[arg0].method3338(arg2, arg3, var17.field1995, var17.field1985, var15, var17.field1983);
                }
            }
            if (arg1 == 3) {
                Statics.field415.method3688(arg0, arg2, arg3);
                class180 var18 = class180.method3056(var13);
                if (var18.field1996 == 1) {
                    field518[arg0].method3340(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var19 = arg0;
        if (arg0 < 3 && (class75.field994[1][arg2][arg3] & 0x2) == 2) {
            var19 = arg0 + 1;
        }
        class197 var20 = Statics.field415;
        class184 var21 = field518[arg0];
        class180 var22 = class180.method3056(arg4);
        int var23;
        int var24;
        if (arg5 == 1 || arg5 == 3) {
            var23 = var22.field1985;
            var24 = var22.field1995;
        } else {
            var23 = var22.field1995;
            var24 = var22.field1985;
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
        int[][] var29 = class75.field1005[var19];
        int var30 = var29[var25][var27] + var29[var26][var27] + var29[var25][var28] + var29[var26][var28] >> 2;
        int var31 = (arg2 << 7) + (var23 << 6);
        int var32 = (arg3 << 7) + (var24 << 6);
        long var33 = class205.method1993(arg2, arg3, 2, var22.field1984 == 0, arg4);
        int var35 = (arg5 << 6) + arg6;
        if (var22.field1988 == 1) {
            var35 += 256;
        }
        if (arg6 == 22) {
            class198 var36;
            if (var22.field1969 == -1 && var22.field2010 == null) {
                var36 = var22.method3148(22, arg5, var29, var31, var30, var32);
            } else {
                var36 = new class73(arg4, 22, arg5, var19, arg2, arg3, var22.field1969, var22.field2018, (class198) null);
            }
            var20.method3666(arg0, arg2, arg3, var30, var36, var33, var35);
            if (var22.field1996 == 1) {
                var21.method3351(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class198 var62;
            if (var22.field1969 == -1 && var22.field2010 == null) {
                var62 = var22.method3148(10, arg5, var29, var31, var30, var32);
            } else {
                var62 = new class73(arg4, 10, arg5, var19, arg2, arg3, var22.field1969, var22.field2018, (class198) null);
            }
            if (var62 != null) {
                var20.method3703(arg0, arg2, arg3, var30, var23, var24, var62, arg6 == 11 ? 256 : 0, var33, var35);
            }
            if (var22.field1996 != 0) {
                var21.method3333(arg2, arg3, var23, var24, var22.field1983);
            }
        } else if (arg6 >= 12) {
            class198 var37;
            if (var22.field1969 == -1 && var22.field2010 == null) {
                var37 = var22.method3148(arg6, arg5, var29, var31, var30, var32);
            } else {
                var37 = new class73(arg4, arg6, arg5, var19, arg2, arg3, var22.field1969, var22.field2018, (class198) null);
            }
            var20.method3703(arg0, arg2, arg3, var30, 1, 1, var37, 0, var33, var35);
            if (var22.field1996 != 0) {
                var21.method3333(arg2, arg3, var23, var24, var22.field1983);
            }
        } else if (arg6 == 0) {
            class198 var38;
            if (var22.field1969 == -1 && var22.field2010 == null) {
                var38 = var22.method3148(0, arg5, var29, var31, var30, var32);
            } else {
                var38 = new class73(arg4, 0, arg5, var19, arg2, arg3, var22.field1969, var22.field2018, (class198) null);
            }
            var20.method3632(arg0, arg2, arg3, var30, var38, (class198) null, class75.field1000[arg5], 0, var33, var35);
            if (var22.field1996 != 0) {
                var21.method3335(arg2, arg3, arg6, arg5, var22.field1983);
            }
        } else if (arg6 == 1) {
            class198 var39;
            if (var22.field1969 == -1 && var22.field2010 == null) {
                var39 = var22.method3148(1, arg5, var29, var31, var30, var32);
            } else {
                var39 = new class73(arg4, 1, arg5, var19, arg2, arg3, var22.field1969, var22.field2018, (class198) null);
            }
            var20.method3632(arg0, arg2, arg3, var30, var39, (class198) null, class75.field1001[arg5], 0, var33, var35);
            if (var22.field1996 != 0) {
                var21.method3335(arg2, arg3, arg6, arg5, var22.field1983);
            }
        } else if (arg6 == 2) {
            int var40 = arg5 + 1 & 0x3;
            class198 var41;
            class198 var42;
            if (var22.field1969 == -1 && var22.field2010 == null) {
                var41 = var22.method3148(2, arg5 + 4, var29, var31, var30, var32);
                var42 = var22.method3148(2, var40, var29, var31, var30, var32);
            } else {
                var41 = new class73(arg4, 2, arg5 + 4, var19, arg2, arg3, var22.field1969, var22.field2018, (class198) null);
                var42 = new class73(arg4, 2, var40, var19, arg2, arg3, var22.field1969, var22.field2018, (class198) null);
            }
            var20.method3632(arg0, arg2, arg3, var30, var41, var42, class75.field1000[arg5], class75.field1000[var40], var33, var35);
            if (var22.field1996 != 0) {
                var21.method3335(arg2, arg3, arg6, arg5, var22.field1983);
            }
        } else if (arg6 == 3) {
            class198 var43;
            if (var22.field1969 == -1 && var22.field2010 == null) {
                var43 = var22.method3148(3, arg5, var29, var31, var30, var32);
            } else {
                var43 = new class73(arg4, 3, arg5, var19, arg2, arg3, var22.field1969, var22.field2018, (class198) null);
            }
            var20.method3632(arg0, arg2, arg3, var30, var43, (class198) null, class75.field1001[arg5], 0, var33, var35);
            if (var22.field1996 != 0) {
                var21.method3335(arg2, arg3, arg6, arg5, var22.field1983);
            }
        } else if (arg6 == 9) {
            class198 var44;
            if (var22.field1969 == -1 && var22.field2010 == null) {
                var44 = var22.method3148(arg6, arg5, var29, var31, var30, var32);
            } else {
                var44 = new class73(arg4, arg6, arg5, var19, arg2, arg3, var22.field1969, var22.field2018, (class198) null);
            }
            var20.method3703(arg0, arg2, arg3, var30, 1, 1, var44, 0, var33, var35);
            if (var22.field1996 != 0) {
                var21.method3333(arg2, arg3, var23, var24, var22.field1983);
            }
        } else if (arg6 == 4) {
            class198 var45;
            if (var22.field1969 == -1 && var22.field2010 == null) {
                var45 = var22.method3148(4, arg5, var29, var31, var30, var32);
            } else {
                var45 = new class73(arg4, 4, arg5, var19, arg2, arg3, var22.field1969, var22.field2018, (class198) null);
            }
            var20.method3581(arg0, arg2, arg3, var30, var45, (class198) null, class75.field1000[arg5], 0, 0, 0, var33, var35);
        } else if (arg6 == 5) {
            int var46 = 16;
            long var47 = var20.method3598(arg0, arg2, arg3);
            if (var47 != 0L) {
                var46 = class180.method3056(class205.method3561(var47)).field1986;
            }
            class198 var49;
            if (var22.field1969 == -1 && var22.field2010 == null) {
                var49 = var22.method3148(4, arg5, var29, var31, var30, var32);
            } else {
                var49 = new class73(arg4, 4, arg5, var19, arg2, arg3, var22.field1969, var22.field2018, (class198) null);
            }
            var20.method3581(arg0, arg2, arg3, var30, var49, (class198) null, class75.field1000[arg5], 0, class75.field1002[arg5] * var46, class75.field1003[arg5] * var46, var33, var35);
        } else if (arg6 == 6) {
            int var50 = 8;
            long var51 = var20.method3598(arg0, arg2, arg3);
            if (var51 != 0L) {
                var50 = class180.method3056(class205.method3561(var51)).field1986 / 2;
            }
            class198 var53;
            if (var22.field1969 == -1 && var22.field2010 == null) {
                var53 = var22.method3148(4, arg5 + 4, var29, var31, var30, var32);
            } else {
                var53 = new class73(arg4, 4, arg5 + 4, var19, arg2, arg3, var22.field1969, var22.field2018, (class198) null);
            }
            var20.method3581(arg0, arg2, arg3, var30, var53, (class198) null, 256, arg5, class75.field1004[arg5] * var50, class75.field1006[arg5] * var50, var33, var35);
        } else if (arg6 == 7) {
            int var54 = arg5 + 2 & 0x3;
            class198 var55;
            if (var22.field1969 == -1 && var22.field2010 == null) {
                var55 = var22.method3148(4, var54 + 4, var29, var31, var30, var32);
            } else {
                var55 = new class73(arg4, 4, var54 + 4, var19, arg2, arg3, var22.field1969, var22.field2018, (class198) null);
            }
            var20.method3581(arg0, arg2, arg3, var30, var55, (class198) null, 256, var54, 0, 0, var33, var35);
        } else if (arg6 == 8) {
            int var56 = 8;
            long var57 = var20.method3598(arg0, arg2, arg3);
            if (var57 != 0L) {
                var56 = class180.method3056(class205.method3561(var57)).field1986 / 2;
            }
            int var59 = arg5 + 2 & 0x3;
            class198 var60;
            class198 var61;
            if (var22.field1969 == -1 && var22.field2010 == null) {
                var60 = var22.method3148(4, arg5 + 4, var29, var31, var30, var32);
                var61 = var22.method3148(4, var59 + 4, var29, var31, var30, var32);
            } else {
                var60 = new class73(arg4, 4, arg5 + 4, var19, arg2, arg3, var22.field1969, var22.field2018, (class198) null);
                var61 = new class73(arg4, 4, var59 + 4, var19, arg2, arg3, var22.field1969, var22.field2018, (class198) null);
            }
            var20.method3581(arg0, arg2, arg3, var30, var60, var61, 256, arg5, class75.field1004[arg5] * var56, class75.field1006[arg5] * var56, var33, var35);
        }
    }

    @ObfuscatedName("kr.hf(IIB)V")
    public static final void method4947(int arg0, int arg1) {
        class326 var2 = field633[Statics.field325][arg0][arg1];
        if (var2 == null) {
            Statics.field415.method3721(Statics.field325, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class95 var5 = null;
        for (class95 var6 = (class95) var2.method5269(); var6 != null; var6 = (class95) var2.method5270()) {
            class181 var7 = class181.method1538(var6.field1271);
            long var8 = (long) var7.field2040;
            if (var7.field2039 == 1) {
                var8 = (long) (var6.field1272 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field415.method3721(Statics.field325, arg0, arg1);
            return;
        }
        var2.method5263(var5);
        class95 var10 = null;
        class95 var11 = null;
        for (class95 var12 = (class95) var2.method5269(); var12 != null; var12 = (class95) var2.method5270()) {
            if (var5.field1271 != var12.field1271) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1271 != var12.field1271 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        long var13 = class205.method1993(arg0, arg1, 3, false, 0);
        Statics.field415.method3579(Statics.field325, arg0, arg1, method2169(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field325), var5, var13, var10, var11);
    }

    @ObfuscatedName("np.hx(ZLpc;I)V")
    public static final void method5968(boolean arg0, class420 arg1) {
        field626 = 0;
        field549 = 0;
        method1958();
        method286(arg0, arg1);
        method2703(arg1);
        for (int var2 = 0; var2 < field626; var2++) {
            int var3 = field684[var2];
            if (field682 != field546[var3].field1111) {
                field546[var3].field1247 = null;
                field546[var3] = null;
            }
        }
        if (field551.field1320 != arg1.field4512) {
            throw new RuntimeException(arg1.field4512 + class92.field1249 + field551.field1320);
        }
        for (int var4 = 0; var4 < field547; var4++) {
            if (field546[field548[var4]] == null) {
                throw new RuntimeException(var4 + class92.field1249 + field547);
            }
        }
    }

    @ObfuscatedName("by.hd(I)V")
    public static final void method1958() {
        class420 var0 = field551.field1318;
        var0.method6615();
        int var1 = var0.method6631(8);
        if (var1 < field547) {
            for (int var2 = var1; var2 < field547; var2++) {
                field684[++field626 - 1] = field548[var2];
            }
        }
        if (var1 > field547) {
            throw new RuntimeException("");
        }
        field547 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field548[var3];
            class91 var5 = field546[var4];
            int var6 = var0.method6631(1);
            if (var6 == 0) {
                field548[++field547 - 1] = var4;
                var5.field1111 = field682;
            } else {
                int var7 = var0.method6631(2);
                if (var7 == 0) {
                    field548[++field547 - 1] = var4;
                    var5.field1111 = field682;
                    field550[++field549 - 1] = var4;
                } else if (var7 == 1) {
                    field548[++field547 - 1] = var4;
                    var5.field1111 = field682;
                    int var8 = var0.method6631(3);
                    var5.method2148(var8, class186.field2136);
                    int var9 = var0.method6631(1);
                    if (var9 == 1) {
                        field550[++field549 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field548[++field547 - 1] = var4;
                    var5.field1111 = field682;
                    if (var0.method6631(1) == 1) {
                        int var10 = var0.method6631(3);
                        var5.method2148(var10, class186.field2133);
                        int var11 = var0.method6631(3);
                        var5.method2148(var11, class186.field2133);
                    } else {
                        int var12 = var0.method6631(3);
                        var5.method2148(var12, class186.field2134);
                    }
                    int var13 = var0.method6631(1);
                    if (var13 == 1) {
                        field550[++field549 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field684[++field626 - 1] = var4;
                }
            }
        }
    }

    @ObfuscatedName("f.hj(ZLpc;I)V")
    public static final void method286(boolean arg0, class420 arg1) {
        while (true) {
            if (arg1.method6607(field551.field1320) >= 27) {
                int var2 = arg1.method6631(15);
                if (var2 != 32767) {
                    boolean var3 = false;
                    if (field546[var2] == null) {
                        field546[var2] = new class91();
                        var3 = true;
                    }
                    class91 var4 = field546[var2];
                    field548[++field547 - 1] = var2;
                    var4.field1111 = field682;
                    int var5;
                    int var7;
                    int var10;
                    if (Statics.field1179) {
                        if (arg0) {
                            var5 = arg1.method6631(8);
                            if (var5 > 127) {
                                var5 -= 256;
                            }
                        } else {
                            var5 = arg1.method6631(5);
                            if (var5 > 15) {
                                var5 -= 32;
                            }
                        }
                        int var6 = field631[arg1.method6631(3)];
                        if (var3) {
                            var4.field1169 = var4.field1112 = var6;
                        }
                        if (arg0) {
                            var7 = arg1.method6631(8);
                            if (var7 > 127) {
                                var7 -= 256;
                            }
                        } else {
                            var7 = arg1.method6631(5);
                            if (var7 > 15) {
                                var7 -= 32;
                            }
                        }
                        int var8 = arg1.method6631(1);
                        if (var8 == 1) {
                            field550[++field549 - 1] = var2;
                        }
                        boolean var9 = arg1.method6631(1) == 1;
                        if (var9) {
                            arg1.method6631(32);
                        }
                        var10 = arg1.method6631(1);
                        var4.field1247 = class171.method2378(arg1.method6631(14));
                    } else {
                        int var11 = field631[arg1.method6631(3)];
                        if (var3) {
                            var4.field1169 = var4.field1112 = var11;
                        }
                        if (arg0) {
                            var7 = arg1.method6631(8);
                            if (var7 > 127) {
                                var7 -= 256;
                            }
                        } else {
                            var7 = arg1.method6631(5);
                            if (var7 > 15) {
                                var7 -= 32;
                            }
                        }
                        int var12 = arg1.method6631(1);
                        if (var12 == 1) {
                            field550[++field549 - 1] = var2;
                        }
                        var4.field1247 = class171.method2378(arg1.method6631(14));
                        var10 = arg1.method6631(1);
                        boolean var13 = arg1.method6631(1) == 1;
                        if (var13) {
                            arg1.method6631(32);
                        }
                        if (arg0) {
                            var5 = arg1.method6631(8);
                            if (var5 > 127) {
                                var5 -= 256;
                            }
                        } else {
                            var5 = arg1.method6631(5);
                            if (var5 > 15) {
                                var5 -= 32;
                            }
                        }
                    }
                    var4.field1114 = var4.field1247.field1854;
                    var4.field1171 = var4.field1247.field1877;
                    if (var4.field1171 == 0) {
                        var4.field1112 = 0;
                    }
                    var4.field1119 = var4.field1247.field1860;
                    var4.field1120 = var4.field1247.field1861;
                    var4.field1121 = var4.field1247.field1848;
                    var4.field1122 = var4.field1247.field1864;
                    var4.field1116 = var4.field1247.field1857;
                    var4.field1117 = var4.field1247.field1858;
                    var4.field1149 = var4.field1247.field1882;
                    var4.method2144(Statics.field2754.field1173[0] + var5, Statics.field2754.field1147[0] + var7, var10 == 1);
                    continue;
                }
            }
            arg1.method6636();
            return;
        }
    }

    @ObfuscatedName("en.hl(Lpc;I)V")
    public static final void method2703(class420 arg0) {
        for (int var1 = 0; var1 < field549; var1++) {
            int var2 = field550[var1];
            class91 var3 = field546[var2];
            int var4 = arg0.method6686();
            if (Statics.field1179 && (var4 & 0x10) != 0) {
                int var5 = arg0.method6686();
                var4 += var5 << 8;
            }
            if ((var4 & 0x20) != 0) {
                var3.field1247 = class171.method2378(arg0.method6705());
                var3.field1114 = var3.field1247.field1854;
                var3.field1171 = var3.field1247.field1877;
                var3.field1119 = var3.field1247.field1860;
                var3.field1120 = var3.field1247.field1861;
                var3.field1121 = var3.field1247.field1848;
                var3.field1122 = var3.field1247.field1864;
                var3.field1116 = var3.field1247.field1857;
                var3.field1117 = var3.field1247.field1858;
                var3.field1149 = var3.field1247.field1882;
            }
            if ((var4 & 0x80) != 0) {
                var3.field1155 = arg0.method6859();
                int var6 = arg0.method6669();
                var3.field1153 = var6 >> 16;
                var3.field1178 = (var6 & 0xFFFF) + field682;
                var3.field1150 = 0;
                var3.field1151 = 0;
                if (var3.field1178 > field682) {
                    var3.field1150 = -1;
                }
                if (var3.field1155 == 65535) {
                    var3.field1155 = -1;
                }
            }
            if ((var4 & 0x200) != 0) {
                var3.field1136 = arg0.method6713();
            }
            if (Statics.field1179 && (var4 & 0x400) != 0 || !Statics.field1179 && (var4 & 0x10) != 0) {
                var3.field1154 = arg0.method6664();
                var3.field1145 = arg0.method6664();
                var3.field1148 = arg0.method6662();
                var3.field1157 = arg0.method6697();
                var3.field1158 = arg0.method6705() + field682;
                var3.field1159 = arg0.method6859() + field682;
                var3.field1160 = arg0.method6666();
                var3.field1172 = 1;
                var3.field1177 = 0;
                var3.field1154 += var3.field1173[0];
                var3.field1145 += var3.field1147[0];
                var3.field1148 += var3.field1173[0];
                var3.field1157 += var3.field1147[0];
            }
            if ((var4 & 0x100) != 0) {
                var3.field1163 = field682 + arg0.method6859();
                var3.field1164 = field682 + arg0.method6666();
                var3.field1165 = arg0.method6698();
                var3.field1156 = arg0.method6697();
                var3.field1167 = arg0.method6664();
                var3.field1168 = (byte) arg0.method6696();
            }
            if ((var4 & 0x40) != 0) {
                var3.field1174 = arg0.method6705();
                if (var3.field1174 == 65535) {
                    var3.field1174 = -1;
                }
            }
            if ((var4 & 0x1) != 0) {
                int var7 = arg0.method6695();
                if (var7 > 0) {
                    for (int var8 = 0; var8 < var7; var8++) {
                        int var9 = -1;
                        int var10 = -1;
                        int var11 = -1;
                        int var12 = arg0.method6679();
                        if (var12 == 32767) {
                            var12 = arg0.method6679();
                            var10 = arg0.method6679();
                            var9 = arg0.method6679();
                            var11 = arg0.method6679();
                        } else if (var12 == 32766) {
                            var12 = -1;
                        } else {
                            var10 = arg0.method6679();
                        }
                        int var13 = arg0.method6679();
                        var3.method2059(var12, var10, var9, var11, field682, var13);
                    }
                }
                int var14 = arg0.method6686();
                if (var14 > 0) {
                    for (int var15 = 0; var15 < var14; var15++) {
                        int var16 = arg0.method6679();
                        int var17 = arg0.method6679();
                        if (var17 == 32767) {
                            var3.method2063(var16);
                        } else {
                            int var18 = arg0.method6679();
                            int var19 = arg0.method6695();
                            int var20 = var17 > 0 ? arg0.method6764() : var19;
                            var3.method2066(var16, field682, var17, var18, var19, var20);
                        }
                    }
                }
            }
            if ((var4 & 0x4) != 0) {
                int var21 = arg0.method6705();
                if (var21 == 65535) {
                    var21 = -1;
                }
                int var22 = arg0.method6686();
                if (var3.field1144 == var21 && var21 != -1) {
                    int var23 = class183.method1980(var21).field2110;
                    if (var23 == 1) {
                        var3.field1162 = 0;
                        var3.field1146 = 0;
                        var3.field1127 = var22;
                        var3.field1130 = 0;
                    }
                    if (var23 == 2) {
                        var3.field1130 = 0;
                    }
                } else if (var21 == -1 || var3.field1144 == -1 || class183.method1980(var21).field2096 >= class183.method1980(var3.field1144).field2096) {
                    var3.field1144 = var21;
                    var3.field1162 = 0;
                    var3.field1146 = 0;
                    var3.field1127 = var22;
                    var3.field1130 = 0;
                    var3.field1177 = var3.field1172;
                }
            }
            if ((var4 & 0x2) != 0) {
                var3.field1124 = arg0.method6674();
                var3.field1118 = 100;
            }
            if ((var4 & 0x8) != 0) {
                int var24 = arg0.method6666();
                int var25 = arg0.method6859();
                if (Statics.field1179) {
                    var3.field1140 = arg0.method6686() == 1;
                }
                int var26 = var3.field1161 - (var24 - Statics.field161 - Statics.field161) * 64;
                int var27 = var3.field1152 - (var25 - Statics.field1467 - Statics.field1467) * 64;
                if (var26 != 0 || var27 != 0) {
                    var3.field1139 = (int) (Math.atan2((double) var26, (double) var27) * 325.949D) & 0x7FF;
                }
            }
        }
    }

    @ObfuscatedName("dn.hp(Lcw;IILgl;I)V")
    public static final void method2589(class83 arg0, int arg1, int arg2, class186 arg3) {
        int var4 = arg0.field1173[0];
        int var5 = arg0.field1147[0];
        int var6 = arg0.method2011();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var7 = arg0.method2011();
        field782.field2130 = arg1;
        field782.field2129 = arg2;
        field782.field2126 = 1;
        field782.field2124 = 1;
        class59 var8 = field782;
        class59 var9 = var8;
        class184 var10 = field518[arg0.field1084];
        int[] var11 = field783;
        int[] var12 = field784;
        for (int var13 = 0; var13 < 128; var13++) {
            for (int var14 = 0; var14 < 128; var14++) {
                class187.field2141[var13][var14] = 0;
                class187.field2142[var13][var14] = 99999999;
            }
        }
        boolean var15;
        if (var7 == 1) {
            var15 = class187.method195(var4, var5, var8, var10);
        } else if (var7 == 2) {
            var15 = class187.method4864(var4, var5, var8, var10);
        } else {
            int var16 = var4;
            int var17 = var5;
            byte var18 = 64;
            byte var19 = 64;
            int var20 = var4 - var18;
            int var21 = var5 - var19;
            class187.field2141[var18][var19] = 99;
            class187.field2142[var18][var19] = 0;
            byte var22 = 0;
            int var23 = 0;
            class187.field2143[var22] = var4;
            int var64 = var22 + 1;
            class187.field2144[var22] = var5;
            int[][] var24 = var10.field2112;
            boolean var29;
            label421: while (true) {
                label419: while (true) {
                    int var25;
                    int var26;
                    int var27;
                    int var28;
                    int var30;
                    do {
                        do {
                            do {
                                label396: do {
                                    if (var64 == var23) {
                                        Statics.field1010 = var16;
                                        Statics.field40 = var17;
                                        var29 = false;
                                        break label421;
                                    }
                                    var16 = class187.field2143[var23];
                                    var17 = class187.field2144[var23];
                                    var23 = var23 + 1 & 0xFFF;
                                    var25 = var16 - var20;
                                    var26 = var17 - var21;
                                    var27 = var16 - var10.field2118;
                                    var28 = var17 - var10.field2119;
                                    if (var9.method1035(var7, var16, var17, var10)) {
                                        Statics.field1010 = var16;
                                        Statics.field40 = var17;
                                        var29 = true;
                                        break label421;
                                    }
                                    var30 = class187.field2142[var25][var26] + 1;
                                    if (var25 > 0 && class187.field2141[var25 - 1][var26] == 0 && (var24[var27 - 1][var28] & 0x124010E) == 0 && (var24[var27 - 1][var7 + var28 - 1] & 0x1240138) == 0) {
                                        int var31 = 1;
                                        while (true) {
                                            if (var31 >= var7 - 1) {
                                                class187.field2143[var64] = var16 - 1;
                                                class187.field2144[var64] = var17;
                                                var64 = var64 + 1 & 0xFFF;
                                                class187.field2141[var25 - 1][var26] = 2;
                                                class187.field2142[var25 - 1][var26] = var30;
                                                break;
                                            }
                                            if ((var24[var27 - 1][var28 + var31] & 0x124013E) != 0) {
                                                break;
                                            }
                                            var31++;
                                        }
                                    }
                                    if (var25 < 128 - var7 && class187.field2141[var25 + 1][var26] == 0 && (var24[var7 + var27][var28] & 0x1240183) == 0 && (var24[var7 + var27][var7 + var28 - 1] & 0x12401E0) == 0) {
                                        int var32 = 1;
                                        while (true) {
                                            if (var32 >= var7 - 1) {
                                                class187.field2143[var64] = var16 + 1;
                                                class187.field2144[var64] = var17;
                                                var64 = var64 + 1 & 0xFFF;
                                                class187.field2141[var25 + 1][var26] = 8;
                                                class187.field2142[var25 + 1][var26] = var30;
                                                break;
                                            }
                                            if ((var24[var7 + var27][var28 + var32] & 0x12401E3) != 0) {
                                                break;
                                            }
                                            var32++;
                                        }
                                    }
                                    if (var26 > 0 && class187.field2141[var25][var26 - 1] == 0 && (var24[var27][var28 - 1] & 0x124010E) == 0 && (var24[var7 + var27 - 1][var28 - 1] & 0x1240183) == 0) {
                                        int var33 = 1;
                                        while (true) {
                                            if (var33 >= var7 - 1) {
                                                class187.field2143[var64] = var16;
                                                class187.field2144[var64] = var17 - 1;
                                                var64 = var64 + 1 & 0xFFF;
                                                class187.field2141[var25][var26 - 1] = 1;
                                                class187.field2142[var25][var26 - 1] = var30;
                                                break;
                                            }
                                            if ((var24[var27 + var33][var28 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var33++;
                                        }
                                    }
                                    if (var26 < 128 - var7 && class187.field2141[var25][var26 + 1] == 0 && (var24[var27][var7 + var28] & 0x1240138) == 0 && (var24[var7 + var27 - 1][var7 + var28] & 0x12401E0) == 0) {
                                        int var34 = 1;
                                        while (true) {
                                            if (var34 >= var7 - 1) {
                                                class187.field2143[var64] = var16;
                                                class187.field2144[var64] = var17 + 1;
                                                var64 = var64 + 1 & 0xFFF;
                                                class187.field2141[var25][var26 + 1] = 4;
                                                class187.field2142[var25][var26 + 1] = var30;
                                                break;
                                            }
                                            if ((var24[var27 + var34][var7 + var28] & 0x12401F8) != 0) {
                                                break;
                                            }
                                            var34++;
                                        }
                                    }
                                    if (var25 > 0 && var26 > 0 && class187.field2141[var25 - 1][var26 - 1] == 0 && (var24[var27 - 1][var28 - 1] & 0x124010E) == 0) {
                                        int var35 = 1;
                                        while (true) {
                                            if (var35 >= var7) {
                                                class187.field2143[var64] = var16 - 1;
                                                class187.field2144[var64] = var17 - 1;
                                                var64 = var64 + 1 & 0xFFF;
                                                class187.field2141[var25 - 1][var26 - 1] = 3;
                                                class187.field2142[var25 - 1][var26 - 1] = var30;
                                                break;
                                            }
                                            if ((var24[var27 - 1][var28 - 1 + var35] & 0x124013E) != 0 || (var24[var27 - 1 + var35][var28 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var35++;
                                        }
                                    }
                                    if (var25 < 128 - var7 && var26 > 0 && class187.field2141[var25 + 1][var26 - 1] == 0 && (var24[var7 + var27][var28 - 1] & 0x1240183) == 0) {
                                        int var36 = 1;
                                        while (true) {
                                            if (var36 >= var7) {
                                                class187.field2143[var64] = var16 + 1;
                                                class187.field2144[var64] = var17 - 1;
                                                var64 = var64 + 1 & 0xFFF;
                                                class187.field2141[var25 + 1][var26 - 1] = 9;
                                                class187.field2142[var25 + 1][var26 - 1] = var30;
                                                break;
                                            }
                                            if ((var24[var7 + var27][var28 - 1 + var36] & 0x12401E3) != 0 || (var24[var27 + var36][var28 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var36++;
                                        }
                                    }
                                    if (var25 > 0 && var26 < 128 - var7 && class187.field2141[var25 - 1][var26 + 1] == 0 && (var24[var27 - 1][var7 + var28] & 0x1240138) == 0) {
                                        for (int var37 = 1; var37 < var7; var37++) {
                                            if ((var24[var27 - 1][var28 + var37] & 0x124013E) != 0 || (var24[var27 - 1 + var37][var7 + var28] & 0x12401F8) != 0) {
                                                continue label396;
                                            }
                                        }
                                        class187.field2143[var64] = var16 - 1;
                                        class187.field2144[var64] = var17 + 1;
                                        var64 = var64 + 1 & 0xFFF;
                                        class187.field2141[var25 - 1][var26 + 1] = 6;
                                        class187.field2142[var25 - 1][var26 + 1] = var30;
                                    }
                                } while (var25 >= 128 - var7);
                            } while (var26 >= 128 - var7);
                        } while (class187.field2141[var25 + 1][var26 + 1] != 0);
                    } while ((var24[var7 + var27][var7 + var28] & 0x12401E0) != 0);
                    for (int var38 = 1; var38 < var7; var38++) {
                        if ((var24[var27 + var38][var7 + var28] & 0x12401F8) != 0 || (var24[var7 + var27][var28 + var38] & 0x12401E3) != 0) {
                            continue label419;
                        }
                    }
                    class187.field2143[var64] = var16 + 1;
                    class187.field2144[var64] = var17 + 1;
                    var64 = var64 + 1 & 0xFFF;
                    class187.field2141[var25 + 1][var26 + 1] = 12;
                    class187.field2142[var25 + 1][var26 + 1] = var30;
                }
            }
            var15 = var29;
        }
        int var57;
        label467: {
            int var39 = var4 - 64;
            int var40 = var5 - 64;
            int var41 = Statics.field1010;
            int var42 = Statics.field40;
            if (!var15) {
                int var43 = Integer.MAX_VALUE;
                int var44 = Integer.MAX_VALUE;
                byte var45 = 10;
                int var46 = var9.field2130;
                int var47 = var9.field2129;
                int var48 = var9.field2126;
                int var49 = var9.field2124;
                for (int var50 = var46 - var45; var50 <= var45 + var46; var50++) {
                    for (int var51 = var47 - var45; var51 <= var45 + var47; var51++) {
                        int var52 = var50 - var39;
                        int var53 = var51 - var40;
                        if (var52 >= 0 && var53 >= 0 && var52 < 128 && var53 < 128 && class187.field2142[var52][var53] < 100) {
                            int var54 = 0;
                            if (var50 < var46) {
                                var54 = var46 - var50;
                            } else if (var50 > var46 + var48 - 1) {
                                var54 = var50 - (var46 + var48 - 1);
                            }
                            int var55 = 0;
                            if (var51 < var47) {
                                var55 = var47 - var51;
                            } else if (var51 > var47 + var49 - 1) {
                                var55 = var51 - (var47 + var49 - 1);
                            }
                            int var56 = var54 * var54 + var55 * var55;
                            if (var56 < var43 || var43 == var56 && class187.field2142[var52][var53] < var44) {
                                var43 = var56;
                                var44 = class187.field2142[var52][var53];
                                var41 = var50;
                                var42 = var51;
                            }
                        }
                    }
                }
                if (var43 == Integer.MAX_VALUE) {
                    var57 = -1;
                    break label467;
                }
            }
            if (var4 == var41 && var5 == var42) {
                var11[0] = var41;
                var12[0] = var42;
                var57 = 0;
            } else {
                byte var58 = 0;
                class187.field2143[var58] = var41;
                int var65 = var58 + 1;
                class187.field2144[var58] = var42;
                int var59;
                int var60 = var59 = class187.field2141[var41 - var39][var42 - var40];
                while (var4 != var41 || var5 != var42) {
                    if (var59 != var60) {
                        var59 = var60;
                        class187.field2143[var65] = var41;
                        class187.field2144[var65++] = var42;
                    }
                    if ((var60 & 0x2) != 0) {
                        var41++;
                    } else if ((var60 & 0x8) != 0) {
                        var41--;
                    }
                    if ((var60 & 0x1) != 0) {
                        var42++;
                    } else if ((var60 & 0x4) != 0) {
                        var42--;
                    }
                    var60 = class187.field2141[var41 - var39][var42 - var40];
                }
                int var61 = 0;
                while (var65-- > 0) {
                    var11[var61] = class187.field2143[var65];
                    var12[var61++] = class187.field2144[var65];
                    if (var61 >= var11.length) {
                        break;
                    }
                }
                var57 = var61;
            }
        }
        int var62 = var57;
        if (var57 >= 1) {
            for (int var63 = 0; var63 < var62 - 1; var63++) {
                arg0.method2014(field783[var63], field784[var63], arg3);
            }
        }
    }

    @ObfuscatedName("fy.ho(I)V")
    public static void method3138() {
        field733 = 0;
        field691 = false;
    }

    @ObfuscatedName("cs.hb(I)V")
    public static void method2114() {
        method3138();
        field624[0] = class300.field3782;
        field648[0] = "";
        field645[0] = 1006;
        field786[0] = false;
        field733 = 1;
    }

    @ObfuscatedName("cs.ht(IIB)V")
    public static final void method2112(int arg0, int arg1) {
        if (field733 < 2 && field658 == 0 && !field660 || !field705) {
            return;
        }
        int var2 = field733 - 1;
        String var4;
        if (field658 == 1 && field733 < 2) {
            var4 = class300.field3524 + class300.field3538 + field497 + " " + class92.field1254;
        } else if (field660 && field733 < 2) {
            var4 = field663 + class300.field3538 + field689 + " " + class92.field1254;
        } else {
            var4 = method2710(var2);
        }
        if (field733 > 2) {
            var4 = var4 + Statics.method2088(16777215) + " " + '/' + " " + (field733 - 2) + class300.field3834;
        }
        Statics.field4479.method5454(var4, arg0 + 4, arg1 + 15, 16777215, 0, field682 / 1000);
    }

    @ObfuscatedName("m.ik(B)Z")
    public static final boolean method243() {
        return field691;
    }

    @ObfuscatedName("gj.ix(IIIII)V")
    public static final void method3937(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field712; var4++) {
            if (field703[var4] + field573[var4] > arg0 && field573[var4] < arg0 + arg2 && field718[var4] + field599[var4] > arg1 && field718[var4] < arg1 + arg3) {
                field714[var4] = true;
            }
        }
    }

    @ObfuscatedName("da.id(IIIII)V")
    public static final void method2599(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field712; var4++) {
            if (field703[var4] + field573[var4] > arg0 && field573[var4] < arg0 + arg2 && field718[var4] + field599[var4] > arg1 && field718[var4] < arg1 + arg3) {
                field715[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.iu(I)V")
    public final void method1208() {
        method5126();
        if (Statics.field111 != null || field541 != null) {
            return;
        }
        int var18;
        int var21;
        int var22;
        label191: {
            int var1 = class33.field235;
            if (field691) {
                if (var1 != 1 && (Statics.field4238 || var1 != 4)) {
                    int var2 = class33.field223;
                    int var3 = class33.field229;
                    if (var2 < Statics.field955 - 10 || var2 > Statics.field955 + Statics.field3205 + 10 || var3 < Statics.field259 - 10 || var3 > Statics.field470 + Statics.field259 + 10) {
                        field691 = false;
                        method3937(Statics.field955, Statics.field259, Statics.field3205, Statics.field470);
                    }
                }
                if (var1 == 1 || !Statics.field4238 && var1 == 4) {
                    int var4 = Statics.field955;
                    int var5 = Statics.field259;
                    int var6 = Statics.field3205;
                    int var7 = class33.field236;
                    int var8 = class33.field237;
                    int var9 = -1;
                    for (int var10 = 0; var10 < field733; var10++) {
                        int var11 = (field733 - 1 - var10) * 15 + var5 + 31;
                        if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
                            var9 = var10;
                        }
                    }
                    if (var9 != -1 && var9 >= 0) {
                        int var12 = field528[var9];
                        int var13 = field644[var9];
                        int var14 = field645[var9];
                        int var15 = field646[var9];
                        String var16 = field624[var9];
                        String var17 = field648[var9];
                        method263(var12, var13, var14, var15, var16, var17, class33.field236, class33.field237);
                    }
                    field691 = false;
                    method3937(Statics.field955, Statics.field259, Statics.field3205, Statics.field470);
                }
            } else {
                var18 = field733 - 1;
                if ((var1 == 1 || !Statics.field4238 && var1 == 4) && var18 >= 0) {
                    int var20 = field645[var18];
                    if (var20 == 39 || var20 == 40 || var20 == 41 || var20 == 42 || var20 == 43 || var20 == 33 || var20 == 34 || var20 == 35 || var20 == 36 || var20 == 37 || var20 == 38 || var20 == 1005) {
                        var21 = field528[var18];
                        var22 = field644[var18];
                        class286 var23 = class286.method2611(var22);
                        int var24 = method5247(var23);
                        boolean var25 = (var24 >> 28 & 0x1) != 0;
                        if (var25) {
                            break label191;
                        }
                        class287 var10000 = (class287) null;
                        if (class287.method2965(method5247(var23))) {
                            break label191;
                        }
                    }
                }
                if ((var1 == 1 || !Statics.field4238 && var1 == 4) && this.method1244()) {
                    var1 = 2;
                }
                if ((var1 == 1 || !Statics.field4238 && var1 == 4) && field733 > 0 && var18 >= 0) {
                    int var26 = field528[var18];
                    int var27 = field644[var18];
                    int var28 = field645[var18];
                    int var29 = field646[var18];
                    String var30 = field624[var18];
                    String var31 = field648[var18];
                    method263(var26, var27, var28, var29, var30, var31, class33.field236, class33.field237);
                }
                if (var1 == 2 && field733 > 0) {
                    this.method1069(class33.field236, class33.field237);
                }
            }
            return;
        }
        if (Statics.field111 != null && !field617 && field733 > 0 && !this.method1244()) {
            method1953(field579, field615);
        }
        field617 = false;
        field618 = 0;
        if (Statics.field111 != null) {
            method2435(Statics.field111);
        }
        Statics.field111 = class286.method2611(var22);
        field613 = var21;
        field579 = class33.field236;
        field615 = class33.field237;
        if (var18 >= 0) {
            method1004(var18);
        }
        method2435(Statics.field111);
    }

    @ObfuscatedName("client.ip(I)Z")
    public final boolean method1244() {
        int var1 = field733 - 1;
        boolean var3 = field609 == 1 && field733 > 2;
        if (!var3) {
            boolean var4;
            if (var1 < 0) {
                var4 = false;
            } else {
                int var5 = field645[var1];
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
        return var3 && !field786[var1];
    }

    @ObfuscatedName("client.if(III)V")
    public final void method1069(int arg0, int arg1) {
        method1782(arg0, arg1);
        int var3 = arg0 - field767;
        int var4 = arg1 - field768;
        Statics.field415.method3609(Statics.field325, var3, var4, false);
        field691 = true;
    }

    @ObfuscatedName("bs.ih(III)V")
    public static void method1782(int arg0, int arg1) {
        int var2 = Statics.field4479.method5441(class300.field3690);
        for (int var3 = 0; var3 < field733; var3++) {
            int var4 = Statics.field4479.method5441(method2710(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field733 * 15 + 22;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > Statics.field3209) {
            var6 = Statics.field3209 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > Statics.field1246) {
            var7 = Statics.field1246 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        Statics.field955 = var6;
        Statics.field259 = var7;
        Statics.field3205 = var2;
        Statics.field470 = field733 * 15 + 22;
    }

    @ObfuscatedName("d.ig(IIIILjava/lang/String;Ljava/lang/String;IIB)V")
    public static final void method263(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 1) {
            field694 = arg6;
            field505 = arg7;
            field621 = 2;
            field608 = 0;
            field741 = arg0;
            field742 = arg1;
            class257 var8 = class257.method2630(class255.field2846, field551.field1319);
            var8.field2960.method6691(arg3);
            var8.field2960.method6852(Statics.field161 + arg0);
            var8.field2960.method6852(Statics.field2797);
            var8.field2960.method6757(Statics.field3413);
            var8.field2960.method6691(Statics.field1467 + arg1);
            var8.field2960.method6667(class24.field131[82] ? 1 : 0);
            var8.field2960.method6783(Statics.field1558);
            field551.method2268(var8);
        }
        if (arg2 == 43) {
            class257 var9 = class257.method2630(class255.field2850, field551.field1319);
            var9.field2960.method6757(arg3);
            var9.field2960.method6757(arg0);
            var9.field2960.method6650(arg1);
            field551.method2268(var9);
            field611 = 0;
            Statics.field2721 = class286.method2611(arg1);
            field612 = arg0;
        }
        if (arg2 == 57 || arg2 == 1007) {
            class286 var10 = Statics.method5251(arg1, arg0);
            if (var10 != null) {
                method572(arg3, arg1, arg0, var10.field3388, arg5);
            }
        }
        if (arg2 == 46) {
            class83 var11 = field619[arg3];
            if (var11 != null) {
                field694 = arg6;
                field505 = arg7;
                field621 = 2;
                field608 = 0;
                field741 = arg0;
                field742 = arg1;
                class257 var12 = class257.method2630(class255.field2936, field551.field1319);
                var12.field2960.method6691(arg3);
                var12.field2960.method6755(class24.field131[82] ? 1 : 0);
                field551.method2268(var12);
            }
        }
        if (arg2 == 38) {
            method4341();
            class286 var13 = class286.method2611(arg1);
            field658 = 1;
            Statics.field2797 = arg0;
            Statics.field1558 = arg1;
            Statics.field3413 = arg3;
            method2435(var13);
            field497 = Statics.method2088(16748608) + class181.method1538(arg3).field2028 + Statics.method2088(16777215);
            if (field497 == null) {
                field497 = class300.field3605;
            }
            return;
        }
        if (arg2 == 50) {
            class83 var14 = field619[arg3];
            if (var14 != null) {
                field694 = arg6;
                field505 = arg7;
                field621 = 2;
                field608 = 0;
                field741 = arg0;
                field742 = arg1;
                class257 var15 = class257.method2630(class255.field2863, field551.field1319);
                var15.field2960.method6755(class24.field131[82] ? 1 : 0);
                var15.field2960.method6757(arg3);
                field551.method2268(var15);
            }
        }
        if (arg2 == 29) {
            class257 var16 = class257.method2630(class255.field2937, field551.field1319);
            var16.field2960.method6650(arg1);
            field551.method2268(var16);
            class286 var17 = class286.method2611(arg1);
            if (var17.field3330 != null && var17.field3330[0][0] == 5) {
                int var18 = var17.field3330[0][1];
                if (class281.field3224[var18] != var17.field3389[0]) {
                    class281.field3224[var18] = var17.field3389[0];
                    method5028(var18);
                }
            }
        }
        if (arg2 == 11) {
            class91 var19 = field546[arg3];
            if (var19 != null) {
                field694 = arg6;
                field505 = arg7;
                field621 = 2;
                field608 = 0;
                field741 = arg0;
                field742 = arg1;
                class257 var20 = class257.method2630(class255.field2842, field551.field1319);
                var20.field2960.method6702(arg3);
                var20.field2960.method6644(class24.field131[82] ? 1 : 0);
                field551.method2268(var20);
            }
        }
        if (arg2 == 1005) {
            class286 var21 = class286.method2611(arg1);
            if (var21 == null || var21.field3394[arg0] < 100000) {
                class257 var22 = class257.method2630(class255.field2926, field551.field1319);
                var22.field2960.method6757(arg3);
                field551.method2268(var22);
            } else {
                class98.method2081(27, "", var21.field3394[arg0] + " x " + class181.method1538(arg3).field2028);
            }
            field611 = 0;
            Statics.field2721 = class286.method2611(arg1);
            field612 = arg0;
        }
        if (arg2 == 32) {
            class257 var23 = class257.method2630(class255.field2864, field551.field1319);
            var23.field2960.method6691(arg3);
            var23.field2960.method6757(field661);
            var23.field2960.method6650(Statics.field2608);
            var23.field2960.method6747(arg1);
            var23.field2960.method6852(arg0);
            field551.method2268(var23);
            field611 = 0;
            Statics.field2721 = class286.method2611(arg1);
            field612 = arg0;
        }
        if (arg2 == 25) {
            class286 var24 = Statics.method5251(arg1, arg0);
            if (var24 != null) {
                method4341();
                method2055(arg1, arg0, class287.method2632(method5247(var24)), var24.field3388);
                field658 = 0;
                field663 = method4435(var24);
                if (field663 == null) {
                    field663 = class300.field3605;
                }
                if (var24.field3391) {
                    field689 = var24.field3344 + Statics.method2088(16777215);
                } else {
                    field689 = Statics.method2088(65280) + var24.field3345 + Statics.method2088(16777215);
                }
            }
            return;
        }
        if (arg2 == 15) {
            class83 var25 = field619[arg3];
            if (var25 != null) {
                field694 = arg6;
                field505 = arg7;
                field621 = 2;
                field608 = 0;
                field741 = arg0;
                field742 = arg1;
                class257 var26 = class257.method2630(class255.field2843, field551.field1319);
                var26.field2960.method6700(class24.field131[82] ? 1 : 0);
                var26.field2960.method6860(Statics.field2608);
                var26.field2960.method6757(field661);
                var26.field2960.method6702(field537);
                var26.field2960.method6702(arg3);
                field551.method2268(var26);
            }
        }
        if (arg2 == 44) {
            class83 var27 = field619[arg3];
            if (var27 != null) {
                field694 = arg6;
                field505 = arg7;
                field621 = 2;
                field608 = 0;
                field741 = arg0;
                field742 = arg1;
                class257 var28 = class257.method2630(class255.field2860, field551.field1319);
                var28.field2960.method6755(class24.field131[82] ? 1 : 0);
                var28.field2960.method6702(arg3);
                field551.method2268(var28);
            }
        }
        if (arg2 == 1004) {
            field694 = arg6;
            field505 = arg7;
            field621 = 2;
            field608 = 0;
            class257 var29 = class257.method2630(class255.field2926, field551.field1319);
            var29.field2960.method6757(arg3);
            field551.method2268(var29);
        }
        if (arg2 == 41) {
            class257 var30 = class257.method2630(class255.field2925, field551.field1319);
            var30.field2960.method6650(arg1);
            var30.field2960.method6757(arg3);
            var30.field2960.method6757(arg0);
            field551.method2268(var30);
            field611 = 0;
            Statics.field2721 = class286.method2611(arg1);
            field612 = arg0;
        }
        if (arg2 == 33) {
            class257 var31 = class257.method2630(class255.field2915, field551.field1319);
            var31.field2960.method6852(arg0);
            var31.field2960.method6852(arg3);
            var31.field2960.method6650(arg1);
            field551.method2268(var31);
            field611 = 0;
            Statics.field2721 = class286.method2611(arg1);
            field612 = arg0;
        }
        if (arg2 == 19) {
            field694 = arg6;
            field505 = arg7;
            field621 = 2;
            field608 = 0;
            field741 = arg0;
            field742 = arg1;
            class257 var32 = class257.method2630(class255.field2921, field551.field1319);
            var32.field2960.method6852(Statics.field1467 + arg1);
            var32.field2960.method6700(class24.field131[82] ? 1 : 0);
            var32.field2960.method6691(Statics.field161 + arg0);
            var32.field2960.method6691(arg3);
            field551.method2268(var32);
        }
        if (arg2 == 23) {
            if (field691) {
                Statics.field415.method3610();
            } else {
                Statics.field415.method3609(Statics.field325, arg0, arg1, true);
            }
        }
        if (arg2 == 48) {
            class83 var33 = field619[arg3];
            if (var33 != null) {
                field694 = arg6;
                field505 = arg7;
                field621 = 2;
                field608 = 0;
                field741 = arg0;
                field742 = arg1;
                class257 var34 = class257.method2630(class255.field2856, field551.field1319);
                var34.field2960.method6757(arg3);
                var34.field2960.method6755(class24.field131[82] ? 1 : 0);
                field551.method2268(var34);
            }
        }
        if (arg2 == 9) {
            class91 var35 = field546[arg3];
            if (var35 != null) {
                field694 = arg6;
                field505 = arg7;
                field621 = 2;
                field608 = 0;
                field741 = arg0;
                field742 = arg1;
                class257 var36 = class257.method2630(class255.field2835, field551.field1319);
                var36.field2960.method6852(arg3);
                var36.field2960.method6700(class24.field131[82] ? 1 : 0);
                field551.method2268(var36);
            }
        }
        if (arg2 == 35) {
            class257 var37 = class257.method2630(class255.field2906, field551.field1319);
            var37.field2960.method6747(arg1);
            var37.field2960.method6691(arg0);
            var37.field2960.method6702(arg3);
            field551.method2268(var37);
            field611 = 0;
            Statics.field2721 = class286.method2611(arg1);
            field612 = arg0;
        }
        if (arg2 == 42) {
            class257 var38 = class257.method2630(class255.field2867, field551.field1319);
            var38.field2960.method6691(arg3);
            var38.field2960.method6691(arg0);
            var38.field2960.method6747(arg1);
            field551.method2268(var38);
            field611 = 0;
            Statics.field2721 = class286.method2611(arg1);
            field612 = arg0;
        }
        if (arg2 == 12) {
            class91 var39 = field546[arg3];
            if (var39 != null) {
                field694 = arg6;
                field505 = arg7;
                field621 = 2;
                field608 = 0;
                field741 = arg0;
                field742 = arg1;
                class257 var40 = class257.method2630(class255.field2844, field551.field1319);
                var40.field2960.method6702(arg3);
                var40.field2960.method6755(class24.field131[82] ? 1 : 0);
                field551.method2268(var40);
            }
        }
        if (arg2 == 22) {
            field694 = arg6;
            field505 = arg7;
            field621 = 2;
            field608 = 0;
            field741 = arg0;
            field742 = arg1;
            class257 var41 = class257.method2630(class255.field2845, field551.field1319);
            var41.field2960.method6691(Statics.field161 + arg0);
            var41.field2960.method6757(Statics.field1467 + arg1);
            var41.field2960.method6852(arg3);
            var41.field2960.method6755(class24.field131[82] ? 1 : 0);
            field551.method2268(var41);
        }
        if (arg2 == 51) {
            class83 var42 = field619[arg3];
            if (var42 != null) {
                field694 = arg6;
                field505 = arg7;
                field621 = 2;
                field608 = 0;
                field741 = arg0;
                field742 = arg1;
                class257 var43 = class257.method2630(class255.field2934, field551.field1319);
                var43.field2960.method6852(arg3);
                var43.field2960.method6644(class24.field131[82] ? 1 : 0);
                field551.method2268(var43);
            }
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field3193.method6270(arg2, arg3, new class282(arg0), new class282(arg1));
        }
        if (arg2 == 3) {
            field694 = arg6;
            field505 = arg7;
            field621 = 2;
            field608 = 0;
            field741 = arg0;
            field742 = arg1;
            class257 var44 = class257.method2630(class255.field2877, field551.field1319);
            var44.field2960.method6691(Statics.field161 + arg0);
            var44.field2960.method6852(Statics.field1467 + arg1);
            var44.field2960.method6757(arg3);
            var44.field2960.method6644(class24.field131[82] ? 1 : 0);
            field551.method2268(var44);
        }
        if (arg2 == 31) {
            class257 var45 = class257.method2630(class255.field2893, field551.field1319);
            var45.field2960.method6860(arg1);
            var45.field2960.method6650(Statics.field1558);
            var45.field2960.method6852(arg0);
            var45.field2960.method6852(arg3);
            var45.field2960.method6691(Statics.field2797);
            var45.field2960.method6702(Statics.field3413);
            field551.method2268(var45);
            field611 = 0;
            Statics.field2721 = class286.method2611(arg1);
            field612 = arg0;
        }
        if (arg2 == 10) {
            class91 var46 = field546[arg3];
            if (var46 != null) {
                field694 = arg6;
                field505 = arg7;
                field621 = 2;
                field608 = 0;
                field741 = arg0;
                field742 = arg1;
                class257 var47 = class257.method2630(class255.field2932, field551.field1319);
                var47.field2960.method6667(class24.field131[82] ? 1 : 0);
                var47.field2960.method6702(arg3);
                field551.method2268(var47);
            }
        }
        if (arg2 == 1001) {
            field694 = arg6;
            field505 = arg7;
            field621 = 2;
            field608 = 0;
            field741 = arg0;
            field742 = arg1;
            class257 var48 = class257.method2630(class255.field2913, field551.field1319);
            var48.field2960.method6852(Statics.field161 + arg0);
            var48.field2960.method6757(Statics.field1467 + arg1);
            var48.field2960.method6757(arg3);
            var48.field2960.method6700(class24.field131[82] ? 1 : 0);
            field551.method2268(var48);
        }
        if (arg2 == 6) {
            field694 = arg6;
            field505 = arg7;
            field621 = 2;
            field608 = 0;
            field741 = arg0;
            field742 = arg1;
            class257 var49 = class257.method2630(class255.field2928, field551.field1319);
            var49.field2960.method6757(Statics.field1467 + arg1);
            var49.field2960.method6852(arg3);
            var49.field2960.method6691(Statics.field161 + arg0);
            var49.field2960.method6644(class24.field131[82] ? 1 : 0);
            field551.method2268(var49);
        }
        if (arg2 == 16) {
            field694 = arg6;
            field505 = arg7;
            field621 = 2;
            field608 = 0;
            field741 = arg0;
            field742 = arg1;
            class257 var50 = class257.method2630(class255.field2939, field551.field1319);
            var50.field2960.method6757(Statics.field1467 + arg1);
            var50.field2960.method6702(Statics.field2797);
            var50.field2960.method6702(arg3);
            var50.field2960.method6691(Statics.field161 + arg0);
            var50.field2960.method6860(Statics.field1558);
            var50.field2960.method6667(class24.field131[82] ? 1 : 0);
            var50.field2960.method6702(Statics.field3413);
            field551.method2268(var50);
        }
        if (arg2 == 37) {
            class257 var51 = class257.method2630(class255.field2859, field551.field1319);
            var51.field2960.method6691(arg0);
            var51.field2960.method6852(arg3);
            var51.field2960.method6650(arg1);
            field551.method2268(var51);
            field611 = 0;
            Statics.field2721 = class286.method2611(arg1);
            field612 = arg0;
        }
        if (arg2 == 2) {
            field694 = arg6;
            field505 = arg7;
            field621 = 2;
            field608 = 0;
            field741 = arg0;
            field742 = arg1;
            class257 var52 = class257.method2630(class255.field2911, field551.field1319);
            var52.field2960.method6757(Statics.field1467 + arg1);
            var52.field2960.method6650(Statics.field2608);
            var52.field2960.method6852(Statics.field161 + arg0);
            var52.field2960.method6852(field661);
            var52.field2960.method6702(field537);
            var52.field2960.method6757(arg3);
            var52.field2960.method6644(class24.field131[82] ? 1 : 0);
            field551.method2268(var52);
        }
        if (arg2 == 49) {
            class83 var53 = field619[arg3];
            if (var53 != null) {
                field694 = arg6;
                field505 = arg7;
                field621 = 2;
                field608 = 0;
                field741 = arg0;
                field742 = arg1;
                class257 var54 = class257.method2630(class255.field2868, field551.field1319);
                var54.field2960.method6644(class24.field131[82] ? 1 : 0);
                var54.field2960.method6852(arg3);
                field551.method2268(var54);
            }
        }
        if (arg2 == 24) {
            class286 var55 = class286.method2611(arg1);
            boolean var56 = true;
            if (var55.field3269 > 0) {
                var56 = method2109(var55);
            }
            if (var56) {
                class257 var57 = class257.method2630(class255.field2937, field551.field1319);
                var57.field2960.method6650(arg1);
                field551.method2268(var57);
            }
        }
        if (arg2 == 26) {
            Statics.method3936();
        }
        if (arg2 == 18) {
            field694 = arg6;
            field505 = arg7;
            field621 = 2;
            field608 = 0;
            field741 = arg0;
            field742 = arg1;
            class257 var58 = class257.method2630(class255.field2882, field551.field1319);
            var58.field2960.method6644(class24.field131[82] ? 1 : 0);
            var58.field2960.method6757(Statics.field1467 + arg1);
            var58.field2960.method6852(arg3);
            var58.field2960.method6757(Statics.field161 + arg0);
            field551.method2268(var58);
        }
        if (arg2 == 20) {
            field694 = arg6;
            field505 = arg7;
            field621 = 2;
            field608 = 0;
            field741 = arg0;
            field742 = arg1;
            class257 var59 = class257.method2630(class255.field2886, field551.field1319);
            var59.field2960.method6757(Statics.field1467 + arg1);
            var59.field2960.method6757(arg3);
            var59.field2960.method6852(Statics.field161 + arg0);
            var59.field2960.method6644(class24.field131[82] ? 1 : 0);
            field551.method2268(var59);
        }
        if (arg2 == 1002) {
            field694 = arg6;
            field505 = arg7;
            field621 = 2;
            field608 = 0;
            class257 var60 = class257.method2630(class255.field2902, field551.field1319);
            var60.field2960.method6757(arg3);
            field551.method2268(var60);
        }
        if (arg2 == 28) {
            class257 var61 = class257.method2630(class255.field2937, field551.field1319);
            var61.field2960.method6650(arg1);
            field551.method2268(var61);
            class286 var62 = class286.method2611(arg1);
            if (var62.field3330 != null && var62.field3330[0][0] == 5) {
                int var63 = var62.field3330[0][1];
                class281.field3224[var63] = 1 - class281.field3224[var63];
                method5028(var63);
            }
        }
        if (arg2 == 5) {
            field694 = arg6;
            field505 = arg7;
            field621 = 2;
            field608 = 0;
            field741 = arg0;
            field742 = arg1;
            class257 var64 = class257.method2630(class255.field2935, field551.field1319);
            var64.field2960.method6852(Statics.field1467 + arg1);
            var64.field2960.method6667(class24.field131[82] ? 1 : 0);
            var64.field2960.method6852(arg3);
            var64.field2960.method6757(Statics.field161 + arg0);
            field551.method2268(var64);
        }
        if (arg2 == 21) {
            field694 = arg6;
            field505 = arg7;
            field621 = 2;
            field608 = 0;
            field741 = arg0;
            field742 = arg1;
            class257 var65 = class257.method2630(class255.field2910, field551.field1319);
            var65.field2960.method6702(arg3);
            var65.field2960.method6691(Statics.field161 + arg0);
            var65.field2960.method6702(Statics.field1467 + arg1);
            var65.field2960.method6667(class24.field131[82] ? 1 : 0);
            field551.method2268(var65);
        }
        if (arg2 == 8) {
            class91 var66 = field546[arg3];
            if (var66 != null) {
                field694 = arg6;
                field505 = arg7;
                field621 = 2;
                field608 = 0;
                field741 = arg0;
                field742 = arg1;
                class257 var67 = class257.method2630(class255.field2849, field551.field1319);
                var67.field2960.method6852(field661);
                var67.field2960.method6691(arg3);
                var67.field2960.method6755(class24.field131[82] ? 1 : 0);
                var67.field2960.method6747(Statics.field2608);
                var67.field2960.method6702(field537);
                field551.method2268(var67);
            }
        }
        if (arg2 == 30 && field526 == null) {
            method5154(arg1, arg0);
            field526 = Statics.method5251(arg1, arg0);
            method2435(field526);
        }
        if (arg2 == 4) {
            field694 = arg6;
            field505 = arg7;
            field621 = 2;
            field608 = 0;
            field741 = arg0;
            field742 = arg1;
            class257 var68 = class257.method2630(class255.field2853, field551.field1319);
            var68.field2960.method6852(Statics.field161 + arg0);
            var68.field2960.method6691(arg3);
            var68.field2960.method6852(Statics.field1467 + arg1);
            var68.field2960.method6667(class24.field131[82] ? 1 : 0);
            field551.method2268(var68);
        }
        if (arg2 == 45) {
            class83 var69 = field619[arg3];
            if (var69 != null) {
                field694 = arg6;
                field505 = arg7;
                field621 = 2;
                field608 = 0;
                field741 = arg0;
                field742 = arg1;
                class257 var70 = class257.method2630(class255.field2869, field551.field1319);
                var70.field2960.method6755(class24.field131[82] ? 1 : 0);
                var70.field2960.method6702(arg3);
                field551.method2268(var70);
            }
        }
        if (arg2 == 40) {
            class257 var71 = class257.method2630(class255.field2901, field551.field1319);
            var71.field2960.method6852(arg3);
            var71.field2960.method6650(arg1);
            var71.field2960.method6852(arg0);
            field551.method2268(var71);
            field611 = 0;
            Statics.field2721 = class286.method2611(arg1);
            field612 = arg0;
        }
        if (arg2 == 34) {
            class257 var72 = class257.method2630(class255.field2871, field551.field1319);
            var72.field2960.method6757(arg0);
            var72.field2960.method6783(arg1);
            var72.field2960.method6757(arg3);
            field551.method2268(var72);
            field611 = 0;
            Statics.field2721 = class286.method2611(arg1);
            field612 = arg0;
        }
        if (arg2 == 13) {
            class91 var73 = field546[arg3];
            if (var73 != null) {
                field694 = arg6;
                field505 = arg7;
                field621 = 2;
                field608 = 0;
                field741 = arg0;
                field742 = arg1;
                class257 var74 = class257.method2630(class255.field2912, field551.field1319);
                var74.field2960.method6757(arg3);
                var74.field2960.method6700(class24.field131[82] ? 1 : 0);
                field551.method2268(var74);
            }
        }
        if (arg2 == 39) {
            class257 var75 = class257.method2630(class255.field2834, field551.field1319);
            var75.field2960.method6860(arg1);
            var75.field2960.method6852(arg3);
            var75.field2960.method6757(arg0);
            field551.method2268(var75);
            field611 = 0;
            Statics.field2721 = class286.method2611(arg1);
            field612 = arg0;
        }
        if (arg2 == 1003) {
            field694 = arg6;
            field505 = arg7;
            field621 = 2;
            field608 = 0;
            class91 var76 = field546[arg3];
            if (var76 != null) {
                class171 var77 = var76.field1247;
                if (var77.field1856 != null) {
                    var77 = var77.method2973();
                }
                if (var77 != null) {
                    class257 var78 = class257.method2630(class255.field2865, field551.field1319);
                    var78.field2960.method6691(var77.field1852);
                    field551.method2268(var78);
                }
            }
        }
        if (arg2 == 36) {
            class257 var79 = class257.method2630(class255.field2919, field551.field1319);
            var79.field2960.method6650(arg1);
            var79.field2960.method6852(arg3);
            var79.field2960.method6691(arg0);
            field551.method2268(var79);
            field611 = 0;
            Statics.field2721 = class286.method2611(arg1);
            field612 = arg0;
        }
        if (arg2 == 47) {
            class83 var80 = field619[arg3];
            if (var80 != null) {
                field694 = arg6;
                field505 = arg7;
                field621 = 2;
                field608 = 0;
                field741 = arg0;
                field742 = arg1;
                class257 var81 = class257.method2630(class255.field2885, field551.field1319);
                var81.field2960.method6691(arg3);
                var81.field2960.method6700(class24.field131[82] ? 1 : 0);
                field551.method2268(var81);
            }
        }
        if (arg2 == 17) {
            field694 = arg6;
            field505 = arg7;
            field621 = 2;
            field608 = 0;
            field741 = arg0;
            field742 = arg1;
            class257 var82 = class257.method2630(class255.field2841, field551.field1319);
            var82.field2960.method6650(Statics.field2608);
            var82.field2960.method6702(Statics.field1467 + arg1);
            var82.field2960.method6667(class24.field131[82] ? 1 : 0);
            var82.field2960.method6702(field661);
            var82.field2960.method6702(arg3);
            var82.field2960.method6691(Statics.field161 + arg0);
            var82.field2960.method6691(field537);
            field551.method2268(var82);
        }
        if (arg2 == 58) {
            class286 var83 = Statics.method5251(arg1, arg0);
            if (var83 != null) {
                class257 var84 = class257.method2630(class255.field2920, field551.field1319);
                var84.field2960.method6852(field537);
                var84.field2960.method6691(arg0);
                var84.field2960.method6860(Statics.field2608);
                var84.field2960.method6691(field661);
                var84.field2960.method6757(var83.field3388);
                var84.field2960.method6860(arg1);
                field551.method2268(var84);
            }
        }
        if (arg2 == 14) {
            class83 var85 = field619[arg3];
            if (var85 != null) {
                field694 = arg6;
                field505 = arg7;
                field621 = 2;
                field608 = 0;
                field741 = arg0;
                field742 = arg1;
                class257 var86 = class257.method2630(class255.field2914, field551.field1319);
                var86.field2960.method6700(class24.field131[82] ? 1 : 0);
                var86.field2960.method6860(Statics.field1558);
                var86.field2960.method6691(Statics.field2797);
                var86.field2960.method6852(arg3);
                var86.field2960.method6852(Statics.field3413);
                field551.method2268(var86);
            }
        }
        if (arg2 == 7) {
            class91 var87 = field546[arg3];
            if (var87 != null) {
                field694 = arg6;
                field505 = arg7;
                field621 = 2;
                field608 = 0;
                field741 = arg0;
                field742 = arg1;
                class257 var88 = class257.method2630(class255.field2890, field551.field1319);
                var88.field2960.method6691(arg3);
                var88.field2960.method6691(Statics.field2797);
                var88.field2960.method6691(Statics.field3413);
                var88.field2960.method6747(Statics.field1558);
                var88.field2960.method6755(class24.field131[82] ? 1 : 0);
                field551.method2268(var88);
            }
        }
        if (field658 != 0) {
            field658 = 0;
            method2435(class286.method2611(Statics.field1558));
        }
        if (field660) {
            method4341();
        }
        if (Statics.field2721 != null && field611 == 0) {
            method2435(Statics.field2721);
        }
    }

    @ObfuscatedName("gh.il(ILjava/lang/String;I)V")
    public static void method3943(int arg0, String arg1) {
        int var2 = class96.field1280;
        int[] var3 = class96.field1281;
        boolean var4 = false;
        class442 var5 = new class442(arg1, Statics.field1786);
        for (int var6 = 0; var6 < var2; var6++) {
            class83 var7 = field619[var3[var6]];
            if (var7 != null && Statics.field2754 != var7 && var7.field1073 != null && var7.field1073.equals(var5)) {
                if (arg0 == 1) {
                    class257 var8 = class257.method2630(class255.field2860, field551.field1319);
                    var8.field2960.method6755(0);
                    var8.field2960.method6702(var3[var6]);
                    field551.method2268(var8);
                } else if (arg0 == 4) {
                    class257 var9 = class257.method2630(class255.field2885, field551.field1319);
                    var9.field2960.method6691(var3[var6]);
                    var9.field2960.method6700(0);
                    field551.method2268(var9);
                } else if (arg0 == 6) {
                    class257 var10 = class257.method2630(class255.field2868, field551.field1319);
                    var10.field2960.method6644(0);
                    var10.field2960.method6852(var3[var6]);
                    field551.method2268(var10);
                } else if (arg0 == 7) {
                    class257 var11 = class257.method2630(class255.field2863, field551.field1319);
                    var11.field2960.method6755(0);
                    var11.field2960.method6757(var3[var6]);
                    field551.method2268(var11);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class98.method2081(4, "", class300.field3686 + arg1);
        }
    }

    @ObfuscatedName("cb.in(IIIIB)V")
    public static void method2055(int arg0, int arg1, int arg2, int arg3) {
        class286 var4 = Statics.method5251(arg0, arg1);
        if (var4 != null && var4.field3362 != null) {
            class81 var5 = new class81();
            var5.field1044 = var4;
            var5.field1047 = var4.field3362;
            class64.method2170(var5);
        }
        field537 = arg3;
        field660 = true;
        Statics.field2608 = arg0;
        field661 = arg1;
        Statics.field2132 = arg2;
        method2435(var4);
    }

    @ObfuscatedName("hd.im(I)V")
    public static void method4341() {
        if (!field660) {
            return;
        }
        class286 var0 = Statics.method5251(Statics.field2608, field661);
        if (var0 != null && var0.field3363 != null) {
            class81 var1 = new class81();
            var1.field1044 = var0;
            var1.field1047 = var0.field3363;
            class64.method2170(var1);
        }
        field537 = -1;
        field660 = false;
        method2435(var0);
    }

    @ObfuscatedName("la.it(IIB)V")
    public static void method5154(int arg0, int arg1) {
        class257 var2 = class257.method2630(class255.field2836, field551.field1319);
        var2.field2960.method6650(arg0);
        var2.field2960.method6757(arg1);
        field551.method2268(var2);
    }

    @ObfuscatedName("al.iy(IIIILjava/lang/String;I)V")
    public static void method572(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class286 var5 = Statics.method5251(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field3399 != null) {
            class81 var6 = new class81();
            var6.field1044 = var5;
            var6.field1053 = arg0;
            var6.field1051 = arg4;
            var6.field1047 = var5.field3399;
            class64.method2170(var6);
        }
        boolean var7 = true;
        if (var5.field3269 > 0) {
            var7 = method2109(var5);
        }
        if (!var7 || !class287.method4492(method5247(var5), arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            class257 var8 = class257.method2630(class255.field2858, field551.field1319);
            var8.field2960.method6650(arg1);
            var8.field2960.method6757(arg2);
            var8.field2960.method6757(arg3);
            field551.method2268(var8);
        }
        if (arg0 == 2) {
            class257 var9 = class257.method2630(class255.field2888, field551.field1319);
            var9.field2960.method6650(arg1);
            var9.field2960.method6757(arg2);
            var9.field2960.method6757(arg3);
            field551.method2268(var9);
        }
        if (arg0 == 3) {
            class257 var10 = class257.method2630(class255.field2896, field551.field1319);
            var10.field2960.method6650(arg1);
            var10.field2960.method6757(arg2);
            var10.field2960.method6757(arg3);
            field551.method2268(var10);
        }
        if (arg0 == 4) {
            class257 var11 = class257.method2630(class255.field2924, field551.field1319);
            var11.field2960.method6650(arg1);
            var11.field2960.method6757(arg2);
            var11.field2960.method6757(arg3);
            field551.method2268(var11);
        }
        if (arg0 == 5) {
            class257 var12 = class257.method2630(class255.field2875, field551.field1319);
            var12.field2960.method6650(arg1);
            var12.field2960.method6757(arg2);
            var12.field2960.method6757(arg3);
            field551.method2268(var12);
        }
        if (arg0 == 6) {
            class257 var13 = class257.method2630(class255.field2900, field551.field1319);
            var13.field2960.method6650(arg1);
            var13.field2960.method6757(arg2);
            var13.field2960.method6757(arg3);
            field551.method2268(var13);
        }
        if (arg0 == 7) {
            class257 var14 = class257.method2630(class255.field2872, field551.field1319);
            var14.field2960.method6650(arg1);
            var14.field2960.method6757(arg2);
            var14.field2960.method6757(arg3);
            field551.method2268(var14);
        }
        if (arg0 == 8) {
            class257 var15 = class257.method2630(class255.field2905, field551.field1319);
            var15.field2960.method6650(arg1);
            var15.field2960.method6757(arg2);
            var15.field2960.method6757(arg3);
            field551.method2268(var15);
        }
        if (arg0 == 9) {
            class257 var16 = class257.method2630(class255.field2929, field551.field1319);
            var16.field2960.method6650(arg1);
            var16.field2960.method6757(arg2);
            var16.field2960.method6757(arg3);
            field551.method2268(var16);
        }
        if (arg0 != 10) {
            return;
        }
        class257 var17 = class257.method2630(class255.field2887, field551.field1319);
        var17.field2960.method6650(arg1);
        var17.field2960.method6757(arg2);
        var17.field2960.method6757(arg3);
        field551.method2268(var17);
    }

    @ObfuscatedName("ke.ir(I)V")
    public static final void method5126() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field733 - 1; var1++) {
                if (field645[var1] < 1000 && field645[var1 + 1] > 1000) {
                    String var2 = field648[var1];
                    field648[var1] = field648[var1 + 1];
                    field648[var1 + 1] = var2;
                    String var3 = field624[var1];
                    field624[var1] = field624[var1 + 1];
                    field624[var1 + 1] = var3;
                    int var4 = field645[var1];
                    field645[var1] = field645[var1 + 1];
                    field645[var1 + 1] = var4;
                    int var5 = field528[var1];
                    field528[var1] = field528[var1 + 1];
                    field528[var1 + 1] = var5;
                    int var6 = field644[var1];
                    field644[var1] = field644[var1 + 1];
                    field644[var1 + 1] = var6;
                    int var7 = field646[var1];
                    field646[var1] = field646[var1 + 1];
                    field646[var1 + 1] = var7;
                    boolean var8 = field786[var1];
                    field786[var1] = field786[var1 + 1];
                    field786[var1 + 1] = var8;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("u.ic(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method105(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method1964(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("bk.iz(Ljava/lang/String;Ljava/lang/String;IIIIZI)V")
    public static final void method1964(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field691 || field733 >= 500) {
            return;
        }
        field624[field733] = arg0;
        field648[field733] = arg1;
        field645[field733] = arg2;
        field646[field733] = arg3;
        field528[field733] = arg4;
        field644[field733] = arg5;
        field786[field733] = arg6;
        field733++;
    }

    @ObfuscatedName("ox.iv(I)V")
    public static void method6415() {
        for (int var0 = 0; var0 < field733; var0++) {
            int var1 = field645[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field733 - 1) {
                    for (int var3 = var0; var3 < field733 - 1; var3++) {
                        field624[var3] = field624[var3 + 1];
                        field648[var3] = field648[var3 + 1];
                        field645[var3] = field645[var3 + 1];
                        field646[var3] = field646[var3 + 1];
                        field528[var3] = field528[var3 + 1];
                        field644[var3] = field644[var3 + 1];
                        field786[var3] = field786[var3 + 1];
                    }
                }
                var0--;
                field733--;
            }
        }
        method1782(Statics.field3205 / 2 + Statics.field955, Statics.field259);
    }

    @ObfuscatedName("ew.io(IB)Ljava/lang/String;")
    public static String method2710(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (field648[arg0].length() > 0) {
            return field624[arg0] + class300.field3538 + field648[arg0];
        } else {
            return field624[arg0];
        }
    }

    @ObfuscatedName("cy.iw(IIIII)V")
    public static final void method2147(int arg0, int arg1, int arg2, int arg3) {
        if (field658 == 0 && !field660) {
            method105(class300.field3692, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        long var4 = -1L;
        long var6 = -1L;
        for (int var8 = 0; var8 < class205.method4304(); var8++) {
            long var9 = class205.method6152(var8);
            if (var6 != var9) {
                var6 = var9;
                long var11 = class205.field2513[var8];
                int var13 = (int) (var11 >>> 0 & 0x7FL);
                int var15 = var13;
                int var16 = class205.method3366(var8);
                int var17 = class205.method2115(var8);
                int var18 = class205.method3561(class205.field2513[var8]);
                int var19 = var18;
                if (var17 == 2 && Statics.field415.method3602(Statics.field325, var13, var16, var9) >= 0) {
                    class180 var20 = class180.method3056(var18);
                    if (var20.field2010 != null) {
                        var20 = var20.method3151();
                    }
                    if (var20 == null) {
                        continue;
                    }
                    if (field658 == 1) {
                        method105(class300.field3524, field497 + " " + class92.field1254 + " " + Statics.method2088(65535) + var20.field2003, 1, var18, var13, var16);
                    } else if (!field660) {
                        String[] var21 = var20.field1981;
                        if (var21 != null) {
                            for (int var22 = 4; var22 >= 0; var22--) {
                                if (var21[var22] != null) {
                                    short var23 = 0;
                                    if (var22 == 0) {
                                        var23 = 3;
                                    }
                                    if (var22 == 1) {
                                        var23 = 4;
                                    }
                                    if (var22 == 2) {
                                        var23 = 5;
                                    }
                                    if (var22 == 3) {
                                        var23 = 6;
                                    }
                                    if (var22 == 4) {
                                        var23 = 1001;
                                    }
                                    method105(var21[var22], Statics.method2088(65535) + var20.field2003, var23, var19, var15, var16);
                                }
                            }
                        }
                        method105(class300.field3688, Statics.method2088(65535) + var20.field2003, 1002, var20.field1976, var15, var16);
                    } else if ((Statics.field2132 & 0x4) == 4) {
                        method105(field663, field689 + " " + class92.field1254 + " " + Statics.method2088(65535) + var20.field2003, 2, var18, var13, var16);
                    }
                }
                if (var17 == 1) {
                    class91 var24 = field546[var19];
                    if (var24 == null) {
                        continue;
                    }
                    if (var24.field1247.field1854 == 1 && (var24.field1161 & 0x7F) == 64 && (var24.field1152 & 0x7F) == 64) {
                        for (int var25 = 0; var25 < field547; var25++) {
                            class91 var26 = field546[field548[var25]];
                            if (var26 != null && var24 != var26 && var26.field1247.field1854 == 1 && var24.field1161 == var26.field1161 && var24.field1152 == var26.field1152) {
                                method4384(var26, field548[var25], var15, var16);
                            }
                        }
                        int var27 = class96.field1280;
                        int[] var28 = class96.field1281;
                        for (int var29 = 0; var29 < var27; var29++) {
                            class83 var30 = field619[var28[var29]];
                            if (var30 != null && var24.field1161 == var30.field1161 && var24.field1152 == var30.field1152) {
                                method173(var30, var28[var29], var15, var16);
                            }
                        }
                    }
                    method4384(var24, var19, var15, var16);
                }
                if (var17 == 0) {
                    class83 var31 = field619[var19];
                    if (var31 == null) {
                        continue;
                    }
                    if ((var31.field1161 & 0x7F) == 64 && (var31.field1152 & 0x7F) == 64) {
                        for (int var32 = 0; var32 < field547; var32++) {
                            class91 var33 = field546[field548[var32]];
                            if (var33 != null && var33.field1247.field1854 == 1 && var31.field1161 == var33.field1161 && var31.field1152 == var33.field1152) {
                                method4384(var33, field548[var32], var15, var16);
                            }
                        }
                        int var34 = class96.field1280;
                        int[] var35 = class96.field1281;
                        for (int var36 = 0; var36 < var34; var36++) {
                            class83 var37 = field619[var35[var36]];
                            if (var37 != null && var31 != var37 && var31.field1161 == var37.field1161 && var31.field1152 == var37.field1152) {
                                method173(var37, var35[var36], var15, var16);
                            }
                        }
                    }
                    if (field632 == var19) {
                        var4 = var9;
                    } else {
                        method173(var31, var19, var15, var16);
                    }
                }
                if (var17 == 3) {
                    class326 var38 = field633[Statics.field325][var15][var16];
                    if (var38 != null) {
                        for (class95 var39 = (class95) var38.method5284(); var39 != null; var39 = (class95) var38.method5272()) {
                            class181 var40 = class181.method1538(var39.field1271);
                            if (field658 == 1) {
                                method105(class300.field3524, field497 + " " + class92.field1254 + " " + Statics.method2088(16748608) + var40.field2028, 16, var39.field1271, var15, var16);
                            } else if (!field660) {
                                String[] var41 = var40.field2064;
                                for (int var42 = 4; var42 >= 0; var42--) {
                                    if (var41 != null && var41[var42] != null) {
                                        byte var43 = 0;
                                        if (var42 == 0) {
                                            var43 = 18;
                                        }
                                        if (var42 == 1) {
                                            var43 = 19;
                                        }
                                        if (var42 == 2) {
                                            var43 = 20;
                                        }
                                        if (var42 == 3) {
                                            var43 = 21;
                                        }
                                        if (var42 == 4) {
                                            var43 = 22;
                                        }
                                        method105(var41[var42], Statics.method2088(16748608) + var40.field2028, var43, var39.field1271, var15, var16);
                                    } else if (var42 == 2) {
                                        method105(class300.field3525, Statics.method2088(16748608) + var40.field2028, 20, var39.field1271, var15, var16);
                                    }
                                }
                                method105(class300.field3688, Statics.method2088(16748608) + var40.field2028, 1004, var39.field1271, var15, var16);
                            } else if ((Statics.field2132 & 0x1) == 1) {
                                method105(field663, field689 + " " + class92.field1254 + " " + Statics.method2088(16748608) + var40.field2028, 17, var39.field1271, var15, var16);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1L) {
            int var44 = (int) (var4 >>> 0 & 0x7FL);
            int var46 = class205.method351(var4);
            class83 var47 = field619[field632];
            method173(var47, field632, var44, var46);
        }
    }

    @ObfuscatedName("ip.ib(Lcy;IIIB)V")
    public static final void method4384(class91 arg0, int arg1, int arg2, int arg3) {
        class171 var4 = arg0.field1247;
        if (field733 >= 400) {
            return;
        }
        if (var4.field1856 != null) {
            var4 = var4.method2973();
        }
        if (var4 == null || !var4.field1878 || var4.field1883 && field525 != arg1) {
            return;
        }
        String var5 = var4.field1862;
        if (var4.field1870 != 0 && arg0.field1136 != 0) {
            int var6 = arg0.field1136 == -1 ? var4.field1870 : arg0.field1136;
            int var8 = Statics.field2754.field1071;
            int var9 = var8 - var6;
            String var10;
            if (var9 < -9) {
                var10 = Statics.method2088(16711680);
            } else if (var9 < -6) {
                var10 = Statics.method2088(16723968);
            } else if (var9 < -3) {
                var10 = Statics.method2088(16740352);
            } else if (var9 < 0) {
                var10 = Statics.method2088(16756736);
            } else if (var9 > 9) {
                var10 = Statics.method2088(65280);
            } else if (var9 > 6) {
                var10 = Statics.method2088(4259584);
            } else if (var9 > 3) {
                var10 = Statics.method2088(8453888);
            } else if (var9 > 0) {
                var10 = Statics.method2088(12648192);
            } else {
                var10 = Statics.method2088(16776960);
            }
            var5 = var5 + var10 + " " + class92.field1257 + class300.field3608 + var6 + class92.field1253;
        }
        if (var4.field1883 && field585) {
            method105(class300.field3688, Statics.method2088(16776960) + var5, 1003, arg1, arg2, arg3);
        }
        if (field658 == 1) {
            method105(class300.field3524, field497 + " " + class92.field1254 + " " + Statics.method2088(16776960) + var5, 7, arg1, arg2, arg3);
        } else if (!field660) {
            int var11 = var4.field1883 && field585 ? 2000 : 0;
            String[] var12 = var4.field1868;
            if (var12 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (var12[var13] != null && !var12[var13].equalsIgnoreCase(class300.field3689)) {
                        int var14 = 0;
                        if (var13 == 0) {
                            var14 = var11 + 9;
                        }
                        if (var13 == 1) {
                            var14 = var11 + 10;
                        }
                        if (var13 == 2) {
                            var14 = var11 + 11;
                        }
                        if (var13 == 3) {
                            var14 = var11 + 12;
                        }
                        if (var13 == 4) {
                            var14 = var11 + 13;
                        }
                        method105(var12[var13], Statics.method2088(16776960) + var5, var14, arg1, arg2, arg3);
                    }
                }
            }
            if (var12 != null) {
                for (int var15 = 4; var15 >= 0; var15--) {
                    if (var12[var15] != null && var12[var15].equalsIgnoreCase(class300.field3689)) {
                        short var16 = 0;
                        if (field722 != class94.field1262) {
                            if (field722 == class94.field1263 || field722 == class94.field1266 && var4.field1870 > Statics.field2754.field1071) {
                                var16 = 2000;
                            }
                            int var17 = 0;
                            if (var15 == 0) {
                                var17 = var16 + 9;
                            }
                            if (var15 == 1) {
                                var17 = var16 + 10;
                            }
                            if (var15 == 2) {
                                var17 = var16 + 11;
                            }
                            if (var15 == 3) {
                                var17 = var16 + 12;
                            }
                            if (var15 == 4) {
                                var17 = var16 + 13;
                            }
                            method105(var12[var15], Statics.method2088(16776960) + var5, var17, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!var4.field1883 || !field585) {
                method105(class300.field3688, Statics.method2088(16776960) + var5, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field2132 & 0x2) == 2) {
            method105(field663, field689 + " " + class92.field1254 + " " + Statics.method2088(16776960) + var5, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("x.ie(Lcw;IIIB)V")
    public static final void method173(class83 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field2754 == arg0 || field733 >= 400) {
            return;
        }
        String var9;
        if (arg0.field1087 == 0) {
            String var4 = arg0.field1070[0] + arg0.field1073 + arg0.field1070[1];
            int var5 = arg0.field1071;
            int var6 = Statics.field2754.field1071;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = Statics.method2088(16711680);
            } else if (var7 < -6) {
                var8 = Statics.method2088(16723968);
            } else if (var7 < -3) {
                var8 = Statics.method2088(16740352);
            } else if (var7 < 0) {
                var8 = Statics.method2088(16756736);
            } else if (var7 > 9) {
                var8 = Statics.method2088(65280);
            } else if (var7 > 6) {
                var8 = Statics.method2088(4259584);
            } else if (var7 > 3) {
                var8 = Statics.method2088(8453888);
            } else if (var7 > 0) {
                var8 = Statics.method2088(12648192);
            } else {
                var8 = Statics.method2088(16776960);
            }
            var9 = var4 + var8 + " " + class92.field1257 + class300.field3608 + arg0.field1071 + class92.field1253 + arg0.field1070[2];
        } else {
            var9 = arg0.field1070[0] + arg0.field1073 + arg0.field1070[1] + " " + class92.field1257 + class300.field3604 + arg0.field1087 + class92.field1253 + arg0.field1070[2];
        }
        if (field658 == 1) {
            method105(class300.field3524, field497 + " " + class92.field1254 + " " + Statics.method2088(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field660) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field629[var10] != null) {
                    short var11 = 0;
                    if (field629[var10].equalsIgnoreCase(class300.field3689)) {
                        if (field523 == class94.field1262) {
                            continue;
                        }
                        if (field523 == class94.field1263 || field523 == class94.field1266 && arg0.field1071 > Statics.field2754.field1071) {
                            var11 = 2000;
                        }
                        if (Statics.field2754.field1085 == 0 || arg0.field1085 == 0) {
                            if (field523 == class94.field1264 && arg0.method2040()) {
                                var11 = 2000;
                            }
                        } else if (Statics.field2754.field1085 == arg0.field1085) {
                            var11 = 2000;
                        } else {
                            var11 = 0;
                        }
                    } else if (field630[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field628[var10] + var11;
                    method105(field629[var10], Statics.method2088(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field2132 & 0x8) == 8) {
            method105(field663, field689 + " " + class92.field1254 + " " + Statics.method2088(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field733; var14++) {
            if (field645[var14] == 23) {
                field648[var14] = Statics.method2088(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("ds.ij(IIIIIIIII)V")
    public static final void method2342(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class286.method159(arg0)) {
            Statics.field1785 = null;
            method4937(Statics.field3290[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field1785 != null) {
                method4937(Statics.field1785, -1412584499, arg1, arg2, arg3, arg4, Statics.field2677, Statics.field1939, arg7);
                Statics.field1785 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field714[var8] = true;
            }
        } else {
            field714[arg7] = true;
        }
    }

    @ObfuscatedName("ka.ii([Ljz;IIIIIIIII)V")
    public static final void method4937(class286[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class430.method6950(arg2, arg3, arg4, arg5);
        class194.method3490();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class286 var10 = arg0[var9];
            if (var10 != null && (var10.field3320 == arg1 || arg1 == -1412584499 && field541 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field573[field712] = var10.field3267 + arg6;
                    field718[field712] = var10.field3279 + arg7;
                    field703[field712] = var10.field3280;
                    field599[field712] = var10.field3281;
                    var11 = ++field712 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field3392 = var11;
                var10.field3407 = field682;
                if (!var10.field3391 || !method4514(var10)) {
                    if (var10.field3269 > 0) {
                        method402(var10);
                    }
                    int var12 = var10.field3267 + arg6;
                    int var13 = var10.field3279 + arg7;
                    int var14 = var10.field3278;
                    if (field541 == var10) {
                        if (arg1 != -1412584499 && !var10.field3349) {
                            Statics.field1785 = arg0;
                            Statics.field2677 = arg6;
                            Statics.field1939 = arg7;
                            continue;
                        }
                        if (field662 && field683) {
                            int var15 = class33.field223;
                            int var16 = class33.field229;
                            int var17 = var15 - field680;
                            int var18 = var16 - field681;
                            if (var17 < field607) {
                                var17 = field607;
                            }
                            if (var10.field3280 + var17 > field607 + field679.field3280) {
                                var17 = field607 + field679.field3280 - var10.field3280;
                            }
                            if (var18 < field562) {
                                var18 = field562;
                            }
                            if (var10.field3281 + var18 > field562 + field679.field3281) {
                                var18 = field562 + field679.field3281 - var10.field3281;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field3349) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field3286 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field3286 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field3280 + var12;
                        int var26 = var10.field3281 + var13;
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
                        int var29 = var10.field3280 + var12;
                        int var30 = var10.field3281 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field3391 || var19 < var21 && var20 < var22) {
                        if (var10.field3269 != 0) {
                            if (var10.field3269 == 1336) {
                                if (field592) {
                                    var13 += 15;
                                    Statics.field1275.method5448("Fps:" + field193, var10.field3280 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 327680 && !field500) {
                                        var33 = 16711680;
                                    }
                                    Statics.field1275.method5448("Mem:" + var32 + "k", var10.field3280 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field3269 == 1337) {
                                field654 = var12;
                                field655 = var13;
                                method4828(var12, var13, var10.field3280, var10.field3281);
                                field714[var10.field3392] = true;
                                class430.method6950(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3269 == 1338) {
                                method624(var10, var12, var13, var11);
                                class430.method6950(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3269 == 1339) {
                                method3002(var10, var12, var13, var11);
                                class430.method6950(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3269 == 1400) {
                                Statics.field3193.method6233(var12, var13, var10.field3280, var10.field3281, field682);
                            }
                            if (var10.field3269 == 1401) {
                                Statics.field3193.method6236(var12, var13, var10.field3280, var10.field3281);
                            }
                            if (var10.field3269 == 1402) {
                                Statics.field896.method2077(var12, field682);
                            }
                        }
                        if (var10.field3286 == 0) {
                            if (!var10.field3391 && method4514(var10) && Statics.field2808 != var10) {
                                continue;
                            }
                            if (!var10.field3391) {
                                if (var10.field3355 > var10.field3379 - var10.field3281) {
                                    var10.field3355 = var10.field3379 - var10.field3281;
                                }
                                if (var10.field3355 < 0) {
                                    var10.field3355 = 0;
                                }
                            }
                            method4937(arg0, var10.field3265, var19, var20, var21, var22, var12 - var10.field3350, var13 - var10.field3355, var11);
                            if (var10.field3326 != null) {
                                method4937(var10.field3326, var10.field3265, var19, var20, var21, var22, var12 - var10.field3350, var13 - var10.field3355, var11);
                            }
                            class80 var34 = (class80) field666.method6456((long) var10.field3265);
                            if (var34 != null) {
                                method2342(var34.field1039, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class430.method6950(arg2, arg3, arg4, arg5);
                            class194.method3490();
                        }
                        if (field635 || field716[var11] || field583 > 1) {
                            if (var10.field3286 == 0 && !var10.field3391 && var10.field3379 > var10.field3281) {
                                method1785(var10.field3280 + var12, var13, var10.field3355, var10.field3281, var10.field3379);
                            }
                            if (var10.field3286 != 1) {
                                if (var10.field3286 == 2) {
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < var10.field3277; var36++) {
                                        for (int var37 = 0; var37 < var10.field3276; var37++) {
                                            int var38 = (var10.field3332 + 32) * var37 + var12;
                                            int var39 = (var10.field3353 + 32) * var36 + var13;
                                            if (var35 < 20) {
                                                var38 += var10.field3334[var35];
                                                var39 += var10.field3335[var35];
                                            }
                                            if (var10.field3393[var35] > 0) {
                                                boolean var40 = false;
                                                boolean var41 = false;
                                                int var42 = var10.field3393[var35] - 1;
                                                if (var38 + 32 > arg2 && var38 < arg4 && var39 + 32 > arg3 && var39 < arg5 || Statics.field111 == var10 && field613 == var35) {
                                                    class434 var43;
                                                    if (field658 == 1 && Statics.field2797 == var35 && Statics.field1558 == var10.field3265) {
                                                        var43 = class181.method6011(var42, var10.field3394[var35], 2, 0, 2, false);
                                                    } else {
                                                        var43 = class181.method6011(var42, var10.field3394[var35], 1, 3153952, 2, false);
                                                    }
                                                    if (var43 == null) {
                                                        method2435(var10);
                                                    } else if (Statics.field111 == var10 && field613 == var35) {
                                                        int var44 = class33.field223 - field579;
                                                        int var45 = class33.field229 - field615;
                                                        if (var44 < 5 && var44 > -5) {
                                                            var44 = 0;
                                                        }
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (field618 < 5) {
                                                            var44 = 0;
                                                            var45 = 0;
                                                        }
                                                        var43.method7072(var38 + var44, var39 + var45, 128);
                                                        if (arg1 != -1) {
                                                            class286 var46 = arg0[arg1 & 0xFFFF];
                                                            if (var39 + var45 < class430.field4581 && var46.field3355 > 0) {
                                                                int var47 = field567 * (class430.field4581 - var39 - var45) / 3;
                                                                if (var47 > field567 * 10) {
                                                                    var47 = field567 * 10;
                                                                }
                                                                if (var47 > var46.field3355) {
                                                                    var47 = var46.field3355;
                                                                }
                                                                var46.field3355 -= var47;
                                                                field615 += var47;
                                                                method2435(var46);
                                                            }
                                                            if (var39 + var45 + 32 > class430.field4582 && var46.field3355 < var46.field3379 - var46.field3281) {
                                                                int var48 = field567 * (var39 + var45 + 32 - class430.field4582) / 3;
                                                                if (var48 > field567 * 10) {
                                                                    var48 = field567 * 10;
                                                                }
                                                                if (var48 > var46.field3379 - var46.field3281 - var46.field3355) {
                                                                    var48 = var46.field3379 - var46.field3281 - var46.field3355;
                                                                }
                                                                var46.field3355 += var48;
                                                                field615 -= var48;
                                                                method2435(var46);
                                                            }
                                                        }
                                                    } else if (Statics.field2721 == var10 && field612 == var35) {
                                                        var43.method7072(var38, var39, 128);
                                                    } else {
                                                        var43.method7066(var38, var39);
                                                    }
                                                }
                                            } else if (var10.field3317 != null && var35 < 20) {
                                                class434 var49 = var10.method4879(var35);
                                                if (var49 != null) {
                                                    var49.method7066(var38, var39);
                                                } else if (class286.field3263) {
                                                    method2435(var10);
                                                }
                                            }
                                            var35++;
                                        }
                                    }
                                } else if (var10.field3286 == 3) {
                                    int var50;
                                    if (method3938(var10)) {
                                        var50 = var10.field3254;
                                        if (Statics.field2808 == var10 && var10.field3385 != 0) {
                                            var50 = var10.field3385;
                                        }
                                    } else {
                                        var50 = var10.field3264;
                                        if (Statics.field2808 == var10 && var10.field3292 != 0) {
                                            var50 = var10.field3292;
                                        }
                                    }
                                    if (var10.field3294) {
                                        switch(var10.field3328.field4591) {
                                            case 1:
                                                class430.method6992(var12, var13, var10.field3280, var10.field3281, var10.field3264, var10.field3254);
                                                break;
                                            case 2:
                                                class430.method6991(var12, var13, var10.field3280, var10.field3281, var10.field3264, var10.field3254, 255 - (var10.field3278 & 0xFF), 255 - (var10.field3297 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class430.method6958(var12, var13, var10.field3280, var10.field3281, var50);
                                                } else {
                                                    class430.method6997(var12, var13, var10.field3280, var10.field3281, var50, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class430.method6959(var12, var13, var10.field3280, var10.field3281, var50);
                                    } else {
                                        class430.method6962(var12, var13, var10.field3280, var10.field3281, var50, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field3286 == 4) {
                                    class332 var51 = var10.method4878();
                                    if (var51 != null) {
                                        String var52 = var10.field3296;
                                        int var53;
                                        if (method3938(var10)) {
                                            var53 = var10.field3254;
                                            if (Statics.field2808 == var10 && var10.field3385 != 0) {
                                                var53 = var10.field3385;
                                            }
                                            if (var10.field3327.length() > 0) {
                                                var52 = var10.field3327;
                                            }
                                        } else {
                                            var53 = var10.field3264;
                                            if (Statics.field2808 == var10 && var10.field3292 != 0) {
                                                var53 = var10.field3292;
                                            }
                                        }
                                        if (var10.field3391 && var10.field3388 != -1) {
                                            class181 var54 = class181.method1538(var10.field3388);
                                            var52 = var54.field2028;
                                            if (var52 == null) {
                                                var52 = class300.field3605;
                                            }
                                            if ((var54.field2039 == 1 || var10.field3396 != 1) && var10.field3396 != -1) {
                                                var52 = Statics.method2088(16748608) + var52 + class92.field1256 + " " + 'x' + method4913(var10.field3396);
                                            }
                                        }
                                        if (field526 == var10) {
                                            var52 = class300.field3695;
                                            var53 = var10.field3264;
                                        }
                                        if (!var10.field3391) {
                                            var52 = Statics.method2585(var52, var10);
                                        }
                                        var51.method5519(var52, var12, var13, var10.field3280, var10.field3281, var53, var10.field3331 ? 0 : -1, var10.field3274, var10.field3408, var10.field3295);
                                    } else if (class286.field3263) {
                                        method2435(var10);
                                    }
                                } else if (var10.field3286 == 5) {
                                    if (var10.field3391) {
                                        class434 var56;
                                        if (var10.field3388 == -1) {
                                            var56 = var10.method4877(false);
                                        } else {
                                            var56 = class181.method6011(var10.field3388, var10.field3396, var10.field3336, var10.field3305, var10.field3324, false);
                                        }
                                        if (var56 != null) {
                                            int var57 = var56.field4601;
                                            int var58 = var56.field4607;
                                            if (var10.field3325) {
                                                class430.method6951(var12, var13, var10.field3280 + var12, var10.field3281 + var13);
                                                int var59 = (var10.field3280 + (var57 - 1)) / var57;
                                                int var60 = (var10.field3281 + (var58 - 1)) / var58;
                                                for (int var61 = 0; var61 < var59; var61++) {
                                                    for (int var62 = 0; var62 < var60; var62++) {
                                                        if (var10.field3302 != 0) {
                                                            var56.method7085(var57 / 2 + var57 * var61 + var12, var58 / 2 + var58 * var62 + var13, var10.field3302, 4096);
                                                        } else if (var14 == 0) {
                                                            var56.method7066(var57 * var61 + var12, var58 * var62 + var13);
                                                        } else {
                                                            var56.method7072(var57 * var61 + var12, var58 * var62 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class430.method6950(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var63 = var10.field3280 * 4096 / var57;
                                                if (var10.field3302 != 0) {
                                                    var56.method7085(var10.field3280 / 2 + var12, var10.field3281 / 2 + var13, var10.field3302, var63);
                                                } else if (var14 != 0) {
                                                    var56.method7102(var12, var13, var10.field3280, var10.field3281, 256 - (var14 & 0xFF));
                                                } else if (var10.field3280 == var57 && var10.field3281 == var58) {
                                                    var56.method7066(var12, var13);
                                                } else {
                                                    var56.method7074(var12, var13, var10.field3280, var10.field3281);
                                                }
                                            }
                                        } else if (class286.field3263) {
                                            method2435(var10);
                                        }
                                    } else {
                                        class434 var55 = var10.method4877(method3938(var10));
                                        if (var55 != null) {
                                            var55.method7066(var12, var13);
                                        } else if (class286.field3263) {
                                            method2435(var10);
                                        }
                                    }
                                } else if (var10.field3286 == 6) {
                                    boolean var64 = method3938(var10);
                                    int var65;
                                    if (var64) {
                                        var65 = var10.field3313;
                                    } else {
                                        var65 = var10.field3312;
                                    }
                                    class204 var66 = null;
                                    int var67 = 0;
                                    if (var10.field3388 != -1) {
                                        class181 var68 = class181.method1538(var10.field3388);
                                        if (var68 != null) {
                                            class181 var69 = var68.method3201(var10.field3396);
                                            var66 = var69.method3200(1);
                                            if (var66 == null) {
                                                method2435(var10);
                                            } else {
                                                var66.method3807();
                                                var67 = var66.field2372 / 2;
                                            }
                                        }
                                    } else if (var10.field3318 == 5) {
                                        if (var10.field3309 == 0) {
                                            var66 = field772.method4837((class183) null, -1, (class183) null, -1);
                                        } else {
                                            var66 = Statics.field2754.method1790();
                                        }
                                    } else if (var65 == -1) {
                                        var66 = var10.method4880((class183) null, -1, var64, Statics.field2754.field1066);
                                        if (var66 == null && class286.field3263) {
                                            method2435(var10);
                                        }
                                    } else {
                                        class183 var70 = class183.method1980(var65);
                                        var66 = var10.method4880(var70, var10.field3397, var64, Statics.field2754.field1066);
                                        if (var66 == null && class286.field3263) {
                                            method2435(var10);
                                        }
                                    }
                                    class194.method3463(var10.field3280 / 2 + var12, var10.field3281 / 2 + var13);
                                    int var71 = var10.field3319 * class194.field2271[var10.field3316] >> 16;
                                    int var72 = var10.field3319 * class194.field2280[var10.field3316] >> 16;
                                    if (var66 != null) {
                                        if (var10.field3391) {
                                            var66.method3807();
                                            if (var10.field3266) {
                                                var66.method3826(0, var10.field3256, var10.field3338, var10.field3316, var10.field3314, var10.field3315 + var67 + var71, var10.field3315 + var72, var10.field3319);
                                            } else {
                                                var66.method3884(0, var10.field3256, var10.field3338, var10.field3316, var10.field3314, var10.field3315 + var67 + var71, var10.field3315 + var72);
                                            }
                                        } else {
                                            var66.method3884(0, var10.field3256, 0, var10.field3316, 0, var71, var72);
                                        }
                                    }
                                    class194.method3523();
                                } else {
                                    if (var10.field3286 == 7) {
                                        class332 var73 = var10.method4878();
                                        if (var73 == null) {
                                            if (class286.field3263) {
                                                method2435(var10);
                                            }
                                            continue;
                                        }
                                        int var74 = 0;
                                        for (int var75 = 0; var75 < var10.field3277; var75++) {
                                            for (int var76 = 0; var76 < var10.field3276; var76++) {
                                                if (var10.field3393[var74] > 0) {
                                                    class181 var77 = class181.method1538(var10.field3393[var74] - 1);
                                                    String var78;
                                                    if (var77.field2039 != 1 && var10.field3394[var74] == 1) {
                                                        var78 = Statics.method2088(16748608) + var77.field2028 + class92.field1256;
                                                    } else {
                                                        var78 = Statics.method2088(16748608) + var77.field2028 + class92.field1256 + " " + 'x' + method4913(var10.field3394[var74]);
                                                    }
                                                    int var79 = (var10.field3332 + 115) * var76 + var12;
                                                    int var80 = (var10.field3353 + 12) * var75 + var13;
                                                    if (var10.field3274 == 0) {
                                                        var73.method5446(var78, var79, var80, var10.field3264, var10.field3331 ? 0 : -1);
                                                    } else if (var10.field3274 == 1) {
                                                        var73.method5449(var78, var10.field3280 / 2 + var79, var80, var10.field3264, var10.field3331 ? 0 : -1);
                                                    } else {
                                                        var73.method5448(var78, var10.field3280 + var79 - 1, var80, var10.field3264, var10.field3331 ? 0 : -1);
                                                    }
                                                }
                                                var74++;
                                            }
                                        }
                                    }
                                    if (var10.field3286 == 8 && Statics.field1517 == var10 && field735 == field507) {
                                        int var81 = 0;
                                        int var82 = 0;
                                        class332 var83 = Statics.field1275;
                                        String var84 = var10.field3296;
                                        String var85 = Statics.method2585(var84, var10);
                                        while (var85.length() > 0) {
                                            int var86 = var85.indexOf(class92.field1255);
                                            String var87;
                                            if (var86 == -1) {
                                                var87 = var85;
                                                var85 = "";
                                            } else {
                                                var87 = var85.substring(0, var86);
                                                var85 = var85.substring(var86 + 4);
                                            }
                                            int var88 = var83.method5441(var87);
                                            if (var88 > var81) {
                                                var81 = var88;
                                            }
                                            var82 += var83.field4045 + 1;
                                        }
                                        var81 += 6;
                                        var82 += 7;
                                        int var89 = var10.field3280 + var12 - 5 - var81;
                                        int var90 = var10.field3281 + var13 + 5;
                                        if (var89 < var12 + 5) {
                                            var89 = var12 + 5;
                                        }
                                        if (var81 + var89 > arg4) {
                                            var89 = arg4 - var81;
                                        }
                                        if (var82 + var90 > arg5) {
                                            var90 = arg5 - var82;
                                        }
                                        class430.method6958(var89, var90, var81, var82, 16777120);
                                        class430.method6959(var89, var90, var81, var82, 0);
                                        String var91 = var10.field3296;
                                        int var92 = var83.field4045 + var90 + 2;
                                        String var93 = Statics.method2585(var91, var10);
                                        while (var93.length() > 0) {
                                            int var94 = var93.indexOf(class92.field1255);
                                            String var95;
                                            if (var94 == -1) {
                                                var95 = var93;
                                                var93 = "";
                                            } else {
                                                var95 = var93.substring(0, var94);
                                                var93 = var93.substring(var94 + 4);
                                            }
                                            var83.method5446(var95, var89 + 3, var92, 0, -1);
                                            var92 += var83.field4045 + 1;
                                        }
                                    }
                                    if (var10.field3286 == 9) {
                                        int var96;
                                        int var97;
                                        int var98;
                                        int var99;
                                        if (var10.field3299) {
                                            var96 = var12;
                                            var97 = var10.field3281 + var13;
                                            var98 = var10.field3280 + var12;
                                            var99 = var13;
                                        } else {
                                            var96 = var12;
                                            var97 = var13;
                                            var98 = var10.field3280 + var12;
                                            var99 = var10.field3281 + var13;
                                        }
                                        if (var10.field3298 == 1) {
                                            class430.method6989(var96, var97, var98, var99, var10.field3264);
                                        } else {
                                            method4348(var96, var97, var98, var99, var10.field3264, var10.field3298);
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

    @ObfuscatedName("hp.iq(IIIIIII)V")
    public static final void method4348(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class430.field4583;
        int var18 = arg1 - class430.field4581;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class194.method3468(var19, var20, var21);
        class194.method3473(var23, var24, var25, var19, var20, var21, arg4);
        class194.method3468(var19, var21, var22);
        class194.method3473(var23, var25, var26, var19, var21, var22, arg4);
    }

    @ObfuscatedName("jz.ia(II)Ljava/lang/String;")
    public static final String method4913(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class92.field1249 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + Statics.method2088(65408) + var1.substring(0, var1.length() - 8) + class300.field3698 + " " + class92.field1257 + var1 + class92.field1253 + class92.field1256;
        } else if (var1.length() > 6) {
            return " " + Statics.method2088(16777215) + var1.substring(0, var1.length() - 4) + class300.field3700 + " " + class92.field1257 + var1 + class92.field1253 + class92.field1256;
        } else {
            return " " + Statics.method2088(16776960) + var1 + class92.field1256;
        }
    }

    @ObfuscatedName("client.jh(ZB)V")
    public final void method1070(boolean arg0) {
        int var2 = field725;
        int var3 = Statics.field3209;
        int var4 = Statics.field1246;
        if (class286.method159(var2)) {
            method296(Statics.field3290[var2], -1, var3, var4, arg0);
        }
    }

    @ObfuscatedName("client.jr(Ljz;I)V")
    public void method1067(class286 arg0) {
        class286 var2 = arg0.field3320 == -1 ? null : class286.method2611(arg0.field3320);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field3209;
            var4 = Statics.field1246;
        } else {
            var3 = var2.field3280;
            var4 = var2.field3281;
        }
        method2700(arg0, var3, var4, false);
        method5120(arg0, var3, var4);
    }

    @ObfuscatedName("ag.jg([Ljz;Ljz;ZI)V")
    public static void method728(class286[] arg0, class286 arg1, boolean arg2) {
        int var3 = arg1.field3288 == 0 ? arg1.field3280 : arg1.field3288;
        int var4 = arg1.field3379 == 0 ? arg1.field3281 : arg1.field3379;
        method296(arg0, arg1.field3265, var3, var4, arg2);
        if (arg1.field3326 != null) {
            method296(arg1.field3326, arg1.field3265, var3, var4, arg2);
        }
        class80 var5 = (class80) field666.method6456((long) arg1.field3265);
        if (var5 != null) {
            int var6 = var5.field1039;
            if (class286.method159(var6)) {
                method296(Statics.field3290[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field3269 == 1337) {
        }
    }

    @ObfuscatedName("g.ji([Ljz;IIIZB)V")
    public static void method296(class286[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class286 var6 = arg0[var5];
            if (var6 != null && var6.field3320 == arg1) {
                method2700(var6, arg2, arg3, arg4);
                method5120(var6, arg2, arg3);
                if (var6.field3350 > var6.field3288 - var6.field3280) {
                    var6.field3350 = var6.field3288 - var6.field3280;
                }
                if (var6.field3350 < 0) {
                    var6.field3350 = 0;
                }
                if (var6.field3355 > var6.field3379 - var6.field3281) {
                    var6.field3355 = var6.field3379 - var6.field3281;
                }
                if (var6.field3355 < 0) {
                    var6.field3355 = 0;
                }
                if (var6.field3286 == 0) {
                    method728(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("eb.ju(Ljz;IIZI)V")
    public static void method2700(class286 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field3280;
        int var5 = arg0.field3281;
        if (arg0.field3401 == 0) {
            arg0.field3280 = arg0.field3276;
        } else if (arg0.field3401 == 1) {
            arg0.field3280 = arg1 - arg0.field3276;
        } else if (arg0.field3401 == 2) {
            arg0.field3280 = arg0.field3276 * arg1 >> 14;
        }
        if (arg0.field3406 == 0) {
            arg0.field3281 = arg0.field3277;
        } else if (arg0.field3406 == 1) {
            arg0.field3281 = arg2 - arg0.field3277;
        } else if (arg0.field3406 == 2) {
            arg0.field3281 = arg0.field3277 * arg2 >> 14;
        }
        if (arg0.field3401 == 4) {
            arg0.field3280 = arg0.field3282 * arg0.field3281 / arg0.field3283;
        }
        if (arg0.field3406 == 4) {
            arg0.field3281 = arg0.field3283 * arg0.field3280 / arg0.field3282;
        }
        if (arg0.field3269 == 1337) {
            field677 = arg0;
        }
        if (arg3 && arg0.field3293 != null && (arg0.field3280 != var4 || arg0.field3281 != var5)) {
            class81 var6 = new class81();
            var6.field1044 = arg0;
            var6.field1047 = arg0.field3293;
            field708.method5264(var6);
        }
    }

    @ObfuscatedName("kk.jk(Ljz;III)V")
    public static void method5120(class286 arg0, int arg1, int arg2) {
        if (arg0.field3270 == 0) {
            arg0.field3267 = arg0.field3323;
        } else if (arg0.field3270 == 1) {
            arg0.field3267 = (arg1 - arg0.field3280) / 2 + arg0.field3323;
        } else if (arg0.field3270 == 2) {
            arg0.field3267 = arg1 - arg0.field3280 - arg0.field3323;
        } else if (arg0.field3270 == 3) {
            arg0.field3267 = arg0.field3323 * arg1 >> 14;
        } else if (arg0.field3270 == 4) {
            arg0.field3267 = (arg0.field3323 * arg1 >> 14) + (arg1 - arg0.field3280) / 2;
        } else {
            arg0.field3267 = arg1 - arg0.field3280 - (arg0.field3323 * arg1 >> 14);
        }
        if (arg0.field3271 == 0) {
            arg0.field3279 = arg0.field3275;
        } else if (arg0.field3271 == 1) {
            arg0.field3279 = (arg2 - arg0.field3281) / 2 + arg0.field3275;
        } else if (arg0.field3271 == 2) {
            arg0.field3279 = arg2 - arg0.field3281 - arg0.field3275;
        } else if (arg0.field3271 == 3) {
            arg0.field3279 = arg0.field3275 * arg2 >> 14;
        } else if (arg0.field3271 == 4) {
            arg0.field3279 = (arg0.field3275 * arg2 >> 14) + (arg2 - arg0.field3281) / 2;
        } else {
            arg0.field3279 = arg2 - arg0.field3281 - (arg0.field3275 * arg2 >> 14);
        }
    }

    @ObfuscatedName("om.jb(Ljz;IIIIIII)V")
    public static final void method6194(class286 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field572) {
            field769 = 32;
        } else {
            field769 = 0;
        }
        field572 = false;
        if (class33.field227 == 1 || !Statics.field4238 && class33.field227 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field3355 -= 4;
                method2435(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field3355 += 4;
                method2435(arg0);
            } else if (arg5 >= arg1 - field769 && arg5 < field769 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field3355 = (arg4 - arg3) * var8 / var9;
                method2435(arg0);
                field572 = true;
            }
        }
        if (field707 == 0) {
            return;
        }
        int var10 = arg0.field3280;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field3355 += field707 * 45;
            method2435(arg0);
        }
    }

    @ObfuscatedName("bs.jl(IIIIII)V")
    public static final void method1785(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field1651[0].method7034(arg0, arg1);
        Statics.field1651[1].method7034(arg0, arg1 + arg3 - 16);
        class430.method6958(arg0, arg1 + 16, 16, arg3 - 32, field721);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class430.method6958(arg0, arg1 + 16 + var6, 16, var5, field569);
        class430.method6947(arg0, arg1 + 16 + var6, var5, field563);
        class430.method6947(arg0 + 1, arg1 + 16 + var6, var5, field563);
        class430.method6963(arg0, arg1 + 16 + var6, 16, field563);
        class430.method6963(arg0, arg1 + 17 + var6, 16, field563);
        class430.method6947(arg0 + 15, arg1 + 16 + var6, var5, field570);
        class430.method6947(arg0 + 14, arg1 + 17 + var6, var5 - 1, field570);
        class430.method6963(arg0, arg1 + 15 + var6 + var5, 16, field570);
        class430.method6963(arg0 + 1, arg1 + 14 + var6 + var5, 15, field570);
    }

    @ObfuscatedName("ho.jj(II)Ljava/lang/String;")
    public static final String method4351(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("gj.jn(Ljz;B)Z")
    public static final boolean method3938(class286 arg0) {
        if (arg0.field3291 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field3291.length; var1++) {
            int var2 = method6128(arg0, var1);
            int var3 = arg0.field3389[var1];
            if (arg0.field3291[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field3291[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field3291[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ny.jp(Ljz;IB)I")
    public static final int method6128(class286 arg0, int arg1) {
        if (arg0.field3330 == null || arg1 >= arg0.field3330.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field3330[arg1];
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
                    var7 = field637[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field557[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field639[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class286 var11 = class286.method2611(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class181.method1538(var12).field2041 || field669)) {
                        for (int var13 = 0; var13 < var11.field3393.length; var13++) {
                            if (var12 + 1 == var11.field3393[var13]) {
                                var7 += var11.field3394[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class281.field3224[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class290.field3451[field557[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class281.field3224[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field2754.field1071;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class290.field3450[var14]) {
                            var7 += field557[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class286 var17 = class286.method2611(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class181.method1538(var18).field2041 || field669)) {
                        for (int var19 = 0; var19 < var17.field3393.length; var19++) {
                            if (var18 + 1 == var17.field3393[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field672;
                }
                if (var6 == 12) {
                    var7 = field673;
                }
                if (var6 == 13) {
                    int var20 = class281.field3224[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class281.method6117(var22);
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
                    var7 = (Statics.field2754.field1161 >> 7) + Statics.field161;
                }
                if (var6 == 19) {
                    var7 = (Statics.field2754.field1152 >> 7) + Statics.field1467;
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

    @ObfuscatedName("lx.jm(Ljz;Lfn;IIZI)V")
    public static final void method5229(class286 arg0, class181 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field2043;
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
            var7 = class300.field3746;
        }
        if (var6 != -1 && var7 != null) {
            method1964(var7, Statics.method2088(16748608) + arg1.field2028, var6, arg1.field2026, arg2, arg0.field3265, arg4);
        }
    }

    @ObfuscatedName("ke.jf(Ljz;III)V")
    public static final void method5121(class286 arg0, int arg1, int arg2) {
        if (arg0.field3253 == 1) {
            method105(arg0.field3410, "", 24, 0, 0, arg0.field3265);
        }
        if (arg0.field3253 == 2 && !field660) {
            String var3 = method4435(arg0);
            if (var3 != null) {
                method105(var3, Statics.method2088(65280) + arg0.field3345, 25, 0, -1, arg0.field3265);
            }
        }
        if (arg0.field3253 == 3) {
            method105(class300.field3842, "", 26, 0, 0, arg0.field3265);
        }
        if (arg0.field3253 == 4) {
            method105(arg0.field3410, "", 28, 0, 0, arg0.field3265);
        }
        if (arg0.field3253 == 5) {
            method105(arg0.field3410, "", 29, 0, 0, arg0.field3265);
        }
        if (arg0.field3253 == 6 && field526 == null) {
            method105(arg0.field3410, "", 30, 0, -1, arg0.field3265);
        }
        if (arg0.field3286 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field3281; var5++) {
                for (int var6 = 0; var6 < arg0.field3280; var6++) {
                    int var7 = (arg0.field3332 + 32) * var6;
                    int var8 = (arg0.field3353 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field3334[var4];
                        var8 += arg0.field3335[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field616 = var4;
                        Statics.field1248 = arg0;
                        if (arg0.field3393[var4] > 0) {
                            class181 var9 = class181.method1538(arg0.field3393[var4] - 1);
                            if (field658 == 1 && class287.method4938(method5247(arg0))) {
                                if (Statics.field1558 != arg0.field3265 || Statics.field2797 != var4) {
                                    method105(class300.field3524, field497 + " " + class92.field1254 + " " + Statics.method2088(16748608) + var9.field2028, 31, var9.field2026, var4, arg0.field3265);
                                }
                            } else if (!field660 || !class287.method4938(method5247(arg0))) {
                                String[] var10 = var9.field2043;
                                int var11 = -1;
                                if (field651 && method320()) {
                                    var11 = var9.method3208();
                                }
                                if (class287.method4938(method5247(arg0))) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != var12) {
                                            method5229(arg0, var9, var4, var12, false);
                                        }
                                    }
                                }
                                int var13 = method5247(arg0);
                                boolean var14 = (var13 >> 31 & 0x1) != 0;
                                if (var14) {
                                    method105(class300.field3524, Statics.method2088(16748608) + var9.field2028, 38, var9.field2026, var4, arg0.field3265);
                                }
                                class287 var10000 = (class287) null;
                                if (class287.method4938(method5247(arg0))) {
                                    for (int var15 = 2; var15 >= 0; var15--) {
                                        if (var11 != var15) {
                                            method5229(arg0, var9, var4, var15, false);
                                        }
                                    }
                                    if (var11 >= 0) {
                                        method5229(arg0, var9, var4, var11, true);
                                    }
                                }
                                String[] var16 = arg0.field3337;
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
                                            method105(var16[var17], Statics.method2088(16748608) + var9.field2028, var18, var9.field2026, var4, arg0.field3265);
                                        }
                                    }
                                }
                                method105(class300.field3688, Statics.method2088(16748608) + var9.field2028, 1005, var9.field2026, var4, arg0.field3265);
                            } else if ((Statics.field2132 & 0x10) == 16) {
                                method105(field663, field689 + " " + class92.field1254 + " " + Statics.method2088(16748608) + var9.field2028, 32, var9.field2026, var4, arg0.field3265);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field3391) {
            return;
        }
        if (!field660) {
            for (int var19 = 9; var19 >= 5; var19--) {
                String var20;
                if (!class287.method4492(method5247(arg0), var19) && arg0.field3399 == null) {
                    var20 = null;
                } else if (arg0.field3400 == null || arg0.field3400.length <= var19 || arg0.field3400[var19] == null || arg0.field3400[var19].trim().length() == 0) {
                    var20 = null;
                } else {
                    var20 = arg0.field3400[var19];
                }
                if (var20 != null) {
                    method105(var20, arg0.field3344, 1007, var19 + 1, arg0.field3257, arg0.field3265);
                }
            }
            String var22 = method4435(arg0);
            if (var22 != null) {
                method105(var22, arg0.field3344, 25, 0, arg0.field3257, arg0.field3265);
            }
            for (int var23 = 4; var23 >= 0; var23--) {
                String var24;
                if (!class287.method4492(method5247(arg0), var23) && arg0.field3399 == null) {
                    var24 = null;
                } else if (arg0.field3400 == null || arg0.field3400.length <= var23 || arg0.field3400[var23] == null || arg0.field3400[var23].trim().length() == 0) {
                    var24 = null;
                } else {
                    var24 = arg0.field3400[var23];
                }
                if (var24 != null) {
                    method1964(var24, arg0.field3344, 57, var23 + 1, arg0.field3257, arg0.field3265, arg0.field3411);
                }
            }
            if (class287.method2626(method5247(arg0))) {
                method105(class300.field3817, "", 30, 0, arg0.field3257, arg0.field3265);
            }
        } else if (class287.method2813(method5247(arg0)) && (Statics.field2132 & 0x20) == 32) {
            method105(field663, field689 + " " + class92.field1254 + " " + arg0.field3344, 58, 0, arg0.field3257, arg0.field3265);
        }
    }

    @ObfuscatedName("kz.je(ZB)V")
    public static void method5025(boolean arg0) {
        field643 = arg0;
    }

    @ObfuscatedName("dx.js(I)Z")
    public static boolean method2596() {
        return field643;
    }

    @ObfuscatedName("k.jc(B)Z")
    public static boolean method320() {
        return field643 || class24.field131[81];
    }

    @ObfuscatedName("dy.jx(IIIIIIII)V")
    public static final void method2584(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class286.method159(arg0)) {
            method2403(Statics.field3290[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("dz.ja([Ljz;IIIIIIIB)V")
    public static final void method2403(class286[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class286 var9 = arg0[var8];
            if (var9 != null && var9.field3320 == arg1 && (!var9.field3391 || var9.field3286 == 0 || var9.field3351 || method5247(var9) != 0 || field679 == var9 || var9.field3269 == 1338)) {
                if (var9.field3391) {
                    if (method4514(var9)) {
                        continue;
                    }
                } else if (var9.field3286 == 0 && Statics.field2808 != var9 && method4514(var9)) {
                    continue;
                }
                int var10 = var9.field3267 + arg6;
                int var11 = var9.field3279 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field3286 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field3286 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field3280 + var10;
                    int var19 = var9.field3281 + var11;
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
                    int var22 = var9.field3280 + var10;
                    int var23 = var9.field3281 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field541 == var9) {
                    field649 = true;
                    field687 = var10;
                    field688 = var11;
                }
                boolean var24 = false;
                if (var9.field3339) {
                    switch(field667) {
                        case 0:
                            var24 = true;
                        case 1:
                        default:
                            break;
                        case 2:
                            if (var9.field3265 >>> 16 == field668) {
                                var24 = true;
                            }
                            break;
                        case 3:
                            if (field668 == var9.field3265) {
                                var24 = true;
                            }
                    }
                }
                if (var24 || !var9.field3391 || var12 < var14 && var13 < var15) {
                    if (var9.field3391) {
                        if (var9.field3409) {
                            if (class33.field223 >= var12 && class33.field229 >= var13 && class33.field223 < var14 && class33.field229 < var15) {
                                for (class81 var25 = (class81) field708.method5269(); var25 != null; var25 = (class81) field708.method5270()) {
                                    if (var25.field1043) {
                                        var25.method6167();
                                        var25.field1044.field3369 = false;
                                    }
                                }
                                if (Statics.field4069 == 0) {
                                    field541 = null;
                                    field679 = null;
                                }
                                if (!field691) {
                                    method2114();
                                }
                            }
                        } else if (var9.field3287 && class33.field223 >= var12 && class33.field229 >= var13 && class33.field223 < var14 && class33.field229 < var15) {
                            for (class81 var26 = (class81) field708.method5269(); var26 != null; var26 = (class81) field708.method5270()) {
                                if (var26.field1043 && var26.field1044.field3372 == var26.field1047) {
                                    var26.method6167();
                                }
                            }
                        }
                    }
                    int var27 = class33.field223;
                    int var28 = class33.field229;
                    if (class33.field235 != 0) {
                        var27 = class33.field236;
                        var28 = class33.field237;
                    }
                    boolean var29 = var27 >= var12 && var28 >= var13 && var27 < var14 && var28 < var15;
                    if (var9.field3269 == 1337) {
                        if (!field506 && !field691 && var29) {
                            method2147(var27, var28, var12, var13);
                        }
                    } else if (var9.field3269 == 1338) {
                        method2154(var9, var10, var11);
                    } else {
                        if (var9.field3269 == 1400) {
                            Statics.field3193.method6216(class33.field223, class33.field229, var29, var10, var11, var9.field3280, var9.field3281);
                        }
                        if (!field691 && var29) {
                            if (var9.field3269 == 1400) {
                                Statics.field3193.method6268(var10, var11, var9.field3280, var9.field3281, var27, var28);
                            } else {
                                method5121(var9, var27 - var10, var28 - var11);
                            }
                        }
                        if (var24) {
                            for (int var30 = 0; var30 < var9.field3340.length; var30++) {
                                boolean var31 = false;
                                boolean var32 = false;
                                if (!var31 && var9.field3340[var30] != null) {
                                    for (int var33 = 0; var33 < var9.field3340[var30].length; var33++) {
                                        boolean var34 = false;
                                        if (var9.field3255 != null) {
                                            var34 = class24.field131[var9.field3340[var30][var33]];
                                        }
                                        if (method4771(var9.field3340[var30][var33]) || var34) {
                                            var31 = true;
                                            if (var9.field3255 != null && var9.field3255[var30] > field682) {
                                                break;
                                            }
                                            byte var35 = var9.field3398[var30][var33];
                                            if (var35 == 0 || ((var35 & 0x8) == 0 || !class24.field131[86] && !class24.field131[82] && !class24.field131[81]) && ((var35 & 0x2) == 0 || class24.field131[86]) && ((var35 & 0x1) == 0 || class24.field131[82]) && ((var35 & 0x4) == 0 || class24.field131[81])) {
                                                var32 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (var32) {
                                    if (var30 < 10) {
                                        method572(var30 + 1, var9.field3265, var9.field3257, var9.field3388, "");
                                    } else if (var30 == 10) {
                                        method4341();
                                        method2055(var9.field3265, var9.field3257, class287.method2632(method5247(var9)), var9.field3388);
                                        field663 = method4435(var9);
                                        if (field663 == null) {
                                            field663 = class300.field3605;
                                        }
                                        field689 = var9.field3344 + Statics.method2088(16777215);
                                    }
                                    int var36 = var9.field3342[var30];
                                    if (var9.field3255 == null) {
                                        var9.field3255 = new int[var9.field3340.length];
                                    }
                                    if (var9.field3343 == null) {
                                        var9.field3343 = new int[var9.field3340.length];
                                    }
                                    if (var36 == 0) {
                                        var9.field3255[var30] = Integer.MAX_VALUE;
                                    } else if (var9.field3255[var30] == 0) {
                                        var9.field3255[var30] = field682 + var36 + var9.field3343[var30];
                                    } else {
                                        var9.field3255[var30] = field682 + var36;
                                    }
                                }
                                if (!var31 && var9.field3255 != null) {
                                    var9.field3255[var30] = 0;
                                }
                            }
                        }
                        if (var9.field3391) {
                            boolean var37;
                            if (class33.field223 >= var12 && class33.field229 >= var13 && class33.field223 < var14 && class33.field229 < var15) {
                                var37 = true;
                            } else {
                                var37 = false;
                            }
                            boolean var38 = false;
                            if ((class33.field227 == 1 || !Statics.field4238 && class33.field227 == 4) && var37) {
                                var38 = true;
                            }
                            boolean var39 = false;
                            if ((class33.field235 == 1 || !Statics.field4238 && class33.field235 == 4) && class33.field236 >= var12 && class33.field237 >= var13 && class33.field236 < var14 && class33.field237 < var15) {
                                var39 = true;
                            }
                            if (var39) {
                                method103(var9, class33.field236 - var10, class33.field237 - var11);
                            }
                            if (var9.field3269 == 1400) {
                                Statics.field3193.method6217(var27, var28, var37 & var38, var37 & var39);
                            }
                            if (field541 != null && field541 != var9 && var37 && class287.method83(method5247(var9))) {
                                field693 = var9;
                            }
                            if (field679 == var9) {
                                field683 = true;
                                field607 = var10;
                                field562 = var11;
                            }
                            if (var9.field3351) {
                                if (var37 && field707 != 0 && var9.field3372 != null) {
                                    class81 var40 = new class81();
                                    var40.field1043 = true;
                                    var40.field1044 = var9;
                                    var40.field1050 = field707;
                                    var40.field1047 = var9.field3372;
                                    field708.method5264(var40);
                                }
                                if (field541 != null || Statics.field111 != null || field691) {
                                    var39 = false;
                                    var38 = false;
                                    var37 = false;
                                }
                                if (!var9.field3284 && var39) {
                                    var9.field3284 = true;
                                    if (var9.field3356 != null) {
                                        class81 var41 = new class81();
                                        var41.field1043 = true;
                                        var41.field1044 = var9;
                                        var41.field1045 = class33.field236 - var10;
                                        var41.field1050 = class33.field237 - var11;
                                        var41.field1047 = var9.field3356;
                                        field708.method5264(var41);
                                    }
                                }
                                if (var9.field3284 && var38 && var9.field3354 != null) {
                                    class81 var42 = new class81();
                                    var42.field1043 = true;
                                    var42.field1044 = var9;
                                    var42.field1045 = class33.field223 - var10;
                                    var42.field1050 = class33.field229 - var11;
                                    var42.field1047 = var9.field3354;
                                    field708.method5264(var42);
                                }
                                if (var9.field3284 && !var38) {
                                    var9.field3284 = false;
                                    if (var9.field3268 != null) {
                                        class81 var43 = new class81();
                                        var43.field1043 = true;
                                        var43.field1044 = var9;
                                        var43.field1045 = class33.field223 - var10;
                                        var43.field1050 = class33.field229 - var11;
                                        var43.field1047 = var9.field3268;
                                        field710.method5264(var43);
                                    }
                                }
                                if (var38 && var9.field3308 != null) {
                                    class81 var44 = new class81();
                                    var44.field1043 = true;
                                    var44.field1044 = var9;
                                    var44.field1045 = class33.field223 - var10;
                                    var44.field1050 = class33.field229 - var11;
                                    var44.field1047 = var9.field3308;
                                    field708.method5264(var44);
                                }
                                if (!var9.field3369 && var37) {
                                    var9.field3369 = true;
                                    if (var9.field3357 != null) {
                                        class81 var45 = new class81();
                                        var45.field1043 = true;
                                        var45.field1044 = var9;
                                        var45.field1045 = class33.field223 - var10;
                                        var45.field1050 = class33.field229 - var11;
                                        var45.field1047 = var9.field3357;
                                        field708.method5264(var45);
                                    }
                                }
                                if (var9.field3369 && var37 && var9.field3358 != null) {
                                    class81 var46 = new class81();
                                    var46.field1043 = true;
                                    var46.field1044 = var9;
                                    var46.field1045 = class33.field223 - var10;
                                    var46.field1050 = class33.field229 - var11;
                                    var46.field1047 = var9.field3358;
                                    field708.method5264(var46);
                                }
                                if (var9.field3369 && !var37) {
                                    var9.field3369 = false;
                                    if (var9.field3359 != null) {
                                        class81 var47 = new class81();
                                        var47.field1043 = true;
                                        var47.field1044 = var9;
                                        var47.field1045 = class33.field223 - var10;
                                        var47.field1050 = class33.field229 - var11;
                                        var47.field1047 = var9.field3359;
                                        field710.method5264(var47);
                                    }
                                }
                                if (var9.field3370 != null) {
                                    class81 var48 = new class81();
                                    var48.field1044 = var9;
                                    var48.field1047 = var9.field3370;
                                    field709.method5264(var48);
                                }
                                if (var9.field3364 != null && field692 > var9.field3403) {
                                    if (var9.field3365 == null || field692 - var9.field3403 > 32) {
                                        class81 var53 = new class81();
                                        var53.field1044 = var9;
                                        var53.field1047 = var9.field3364;
                                        field708.method5264(var53);
                                    } else {
                                        label634: for (int var49 = var9.field3403; var49 < field692; var49++) {
                                            int var50 = field675[var49 & 0x1F];
                                            for (int var51 = 0; var51 < var9.field3365.length; var51++) {
                                                if (var9.field3365[var51] == var50) {
                                                    class81 var52 = new class81();
                                                    var52.field1044 = var9;
                                                    var52.field1047 = var9.field3364;
                                                    field708.method5264(var52);
                                                    break label634;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3403 = field692;
                                }
                                if (var9.field3366 != null && field495 > var9.field3404) {
                                    if (var9.field3367 == null || field495 - var9.field3404 > 32) {
                                        class81 var58 = new class81();
                                        var58.field1044 = var9;
                                        var58.field1047 = var9.field3366;
                                        field708.method5264(var58);
                                    } else {
                                        label610: for (int var54 = var9.field3404; var54 < field495; var54++) {
                                            int var55 = field647[var54 & 0x1F];
                                            for (int var56 = 0; var56 < var9.field3367.length; var56++) {
                                                if (var9.field3367[var56] == var55) {
                                                    class81 var57 = new class81();
                                                    var57.field1044 = var9;
                                                    var57.field1047 = var9.field3366;
                                                    field708.method5264(var57);
                                                    break label610;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3404 = field495;
                                }
                                if (var9.field3368 != null && field641 > var9.field3371) {
                                    if (var9.field3395 == null || field641 - var9.field3371 > 32) {
                                        class81 var63 = new class81();
                                        var63.field1044 = var9;
                                        var63.field1047 = var9.field3368;
                                        field708.method5264(var63);
                                    } else {
                                        label586: for (int var59 = var9.field3371; var59 < field641; var59++) {
                                            int var60 = field695[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var9.field3395.length; var61++) {
                                                if (var9.field3395[var61] == var60) {
                                                    class81 var62 = new class81();
                                                    var62.field1044 = var9;
                                                    var62.field1047 = var9.field3368;
                                                    field708.method5264(var62);
                                                    break label586;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3371 = field641;
                                }
                                if (field640 > var9.field3402 && var9.field3373 != null) {
                                    class81 var64 = new class81();
                                    var64.field1044 = var9;
                                    var64.field1047 = var9.field3373;
                                    field708.method5264(var64);
                                }
                                if (field601 > var9.field3402 && var9.field3377 != null) {
                                    class81 var65 = new class81();
                                    var65.field1044 = var9;
                                    var65.field1047 = var9.field3377;
                                    field708.method5264(var65);
                                }
                                if (field665 > var9.field3402 && var9.field3378 != null) {
                                    class81 var66 = new class81();
                                    var66.field1044 = var9;
                                    var66.field1047 = var9.field3378;
                                    field708.method5264(var66);
                                }
                                if (field702 > var9.field3402 && var9.field3329 != null) {
                                    class81 var67 = new class81();
                                    var67.field1044 = var9;
                                    var67.field1047 = var9.field3329;
                                    field708.method5264(var67);
                                }
                                if (field504 > var9.field3402 && var9.field3272 != null) {
                                    class81 var68 = new class81();
                                    var68.field1044 = var9;
                                    var68.field1047 = var9.field3272;
                                    field708.method5264(var68);
                                }
                                if (field704 > var9.field3402 && var9.field3341 != null) {
                                    class81 var69 = new class81();
                                    var69.field1044 = var9;
                                    var69.field1047 = var9.field3341;
                                    field708.method5264(var69);
                                }
                                if (field653 > var9.field3402 && var9.field3386 != null) {
                                    class81 var70 = new class81();
                                    var70.field1044 = var9;
                                    var70.field1047 = var9.field3386;
                                    field708.method5264(var70);
                                }
                                if (field706 > var9.field3402 && var9.field3381 != null) {
                                    class81 var71 = new class81();
                                    var71.field1044 = var9;
                                    var71.field1047 = var9.field3381;
                                    field708.method5264(var71);
                                }
                                var9.field3402 = field690;
                                if (var9.field3374 != null) {
                                    for (int var72 = 0; var72 < field730; var72++) {
                                        class81 var73 = new class81();
                                        var73.field1044 = var9;
                                        var73.field1049 = field732[var72];
                                        var73.field1052 = field685[var72];
                                        var73.field1047 = var9.field3374;
                                        field708.method5264(var73);
                                    }
                                }
                                if (var9.field3375 != null) {
                                    int[] var74 = class24.method2581();
                                    for (int var75 = 0; var75 < var74.length; var75++) {
                                        class81 var76 = new class81();
                                        var76.field1044 = var9;
                                        var76.field1049 = var74[var75];
                                        var76.field1047 = var9.field3375;
                                        field708.method5264(var76);
                                    }
                                }
                                if (var9.field3322 != null) {
                                    int[] var77 = class24.method3949();
                                    for (int var78 = 0; var78 < var77.length; var78++) {
                                        class81 var79 = new class81();
                                        var79.field1044 = var9;
                                        var79.field1049 = var77[var78];
                                        var79.field1047 = var9.field3322;
                                        field708.method5264(var79);
                                    }
                                }
                            }
                        }
                        if (!var9.field3391) {
                            if (field541 != null || Statics.field111 != null || field691) {
                                continue;
                            }
                            if ((var9.field3390 >= 0 || var9.field3292 != 0) && class33.field223 >= var12 && class33.field229 >= var13 && class33.field223 < var14 && class33.field229 < var15) {
                                if (var9.field3390 >= 0) {
                                    Statics.field2808 = arg0[var9.field3390];
                                } else {
                                    Statics.field2808 = var9;
                                }
                            }
                            if (var9.field3286 == 8 && class33.field223 >= var12 && class33.field229 >= var13 && class33.field223 < var14 && class33.field229 < var15) {
                                Statics.field1517 = var9;
                            }
                            if (var9.field3379 > var9.field3281) {
                                method6194(var9, var9.field3280 + var10, var11, var9.field3281, var9.field3379, class33.field223, class33.field229);
                            }
                        }
                        if (var9.field3286 == 0) {
                            method2403(arg0, var9.field3265, var12, var13, var14, var15, var10 - var9.field3350, var11 - var9.field3355);
                            if (var9.field3326 != null) {
                                method2403(var9.field3326, var9.field3265, var12, var13, var14, var15, var10 - var9.field3350, var11 - var9.field3355);
                            }
                            class80 var80 = (class80) field666.method6456((long) var9.field3265);
                            if (var80 != null) {
                                if (var80.field1038 == 0 && class33.field223 >= var12 && class33.field229 >= var13 && class33.field223 < var14 && class33.field229 < var15 && !field691) {
                                    for (class81 var81 = (class81) field708.method5269(); var81 != null; var81 = (class81) field708.method5270()) {
                                        if (var81.field1043) {
                                            var81.method6167();
                                            var81.field1044.field3369 = false;
                                        }
                                    }
                                    if (Statics.field4069 == 0) {
                                        field541 = null;
                                        field679 = null;
                                    }
                                    if (!field691) {
                                        method2114();
                                    }
                                }
                                method2584(var80.field1039, var12, var13, var14, var15, var10, var11);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("js.jw(IB)Z")
    public static boolean method4771(int arg0) {
        for (int var1 = 0; var1 < field730; var1++) {
            if (field732[var1] == arg0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("b.jq(III)V")
    public static final void method358(int arg0, int arg1) {
        if (class286.method159(arg0)) {
            method623(Statics.field3290[arg0], arg1);
        }
    }

    @ObfuscatedName("ao.jv([Ljz;II)V")
    public static final void method623(class286[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class286 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field3286 == 0) {
                    if (var3.field3326 != null) {
                        method623(var3.field3326, arg1);
                    }
                    class80 var4 = (class80) field666.method6456((long) var3.field3265);
                    if (var4 != null) {
                        method358(var4.field1039, arg1);
                    }
                }
                if (arg1 == 0 && var3.field3382 != null) {
                    class81 var5 = new class81();
                    var5.field1044 = var3;
                    var5.field1047 = var3.field3382;
                    class64.method2170(var5);
                }
                if (arg1 == 1 && var3.field3383 != null) {
                    if (var3.field3257 >= 0) {
                        class286 var6 = class286.method2611(var3.field3265);
                        if (var6 == null || var6.field3326 == null || var3.field3257 >= var6.field3326.length || var6.field3326[var3.field3257] != var3) {
                            continue;
                        }
                    }
                    class81 var7 = new class81();
                    var7.field1044 = var3;
                    var7.field1047 = var3.field3383;
                    class64.method2170(var7);
                }
            }
        }
    }

    @ObfuscatedName("u.jd(Ljz;III)V")
    public static final void method103(class286 arg0, int arg1, int arg2) {
        if (field541 != null || field691 || arg0 == null) {
            return;
        }
        class286 var3 = arg0;
        int var4 = class287.method1046(method5247(arg0));
        class286 var5;
        if (var4 == 0) {
            var5 = null;
        } else {
            int var6 = 0;
            while (true) {
                if (var6 >= var4) {
                    var5 = var3;
                    break;
                }
                var3 = class286.method2611(var3.field3320);
                if (var3 == null) {
                    var5 = null;
                    break;
                }
                var6++;
            }
        }
        class286 var7 = var5;
        if (var5 == null) {
            var7 = arg0.field3346;
        }
        if (var7 == null) {
            return;
        }
        field541 = arg0;
        class286 var9 = arg0;
        int var10 = class287.method1046(method5247(arg0));
        class286 var11;
        if (var10 == 0) {
            var11 = null;
        } else {
            int var12 = 0;
            while (true) {
                if (var12 >= var10) {
                    var11 = var9;
                    break;
                }
                var9 = class286.method2611(var9.field3320);
                if (var9 == null) {
                    var11 = null;
                    break;
                }
                var12++;
            }
        }
        class286 var13 = var11;
        if (var11 == null) {
            var13 = arg0.field3346;
        }
        field679 = var13;
        field680 = arg1;
        field681 = arg2;
        Statics.field4069 = 0;
        field662 = false;
        int var15 = field733 - 1;
        if (var15 != -1) {
            Statics.field3933 = new class67();
            Statics.field3933.field883 = field528[var15];
            Statics.field3933.field881 = field644[var15];
            Statics.field3933.field880 = field645[var15];
            Statics.field3933.field882 = field646[var15];
            Statics.field3933.field884 = field624[var15];
        }
        return;
    }

    @ObfuscatedName("client.jt(I)V")
    public final void method1072() {
        method2435(field541);
        Statics.field4069++;
        if (field649 && field683) {
            int var1 = class33.field223;
            int var2 = class33.field229;
            int var3 = var1 - field680;
            int var4 = var2 - field681;
            if (var3 < field607) {
                var3 = field607;
            }
            if (field541.field3280 + var3 > field607 + field679.field3280) {
                var3 = field607 + field679.field3280 - field541.field3280;
            }
            if (var4 < field562) {
                var4 = field562;
            }
            if (field541.field3281 + var4 > field562 + field679.field3281) {
                var4 = field562 + field679.field3281 - field541.field3281;
            }
            int var5 = var3 - field687;
            int var6 = var4 - field688;
            int var7 = field541.field3347;
            if (Statics.field4069 > field541.field3348 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field662 = true;
            }
            int var8 = field679.field3350 + (var3 - field607);
            int var9 = field679.field3355 + (var4 - field562);
            if (field541.field3380 != null && field662) {
                class81 var10 = new class81();
                var10.field1044 = field541;
                var10.field1045 = var8;
                var10.field1050 = var9;
                var10.field1047 = field541.field3380;
                class64.method2170(var10);
            }
            if (class33.field227 == 0) {
                if (field662) {
                    if (field541.field3361 != null) {
                        class81 var11 = new class81();
                        var11.field1044 = field541;
                        var11.field1045 = var8;
                        var11.field1050 = var9;
                        var11.field1048 = field693;
                        var11.field1047 = field541.field3361;
                        class64.method2170(var11);
                    }
                    if (field693 != null) {
                        class286 var12 = field541;
                        int var13 = class287.method1046(method5247(var12));
                        class286 var14;
                        if (var13 == 0) {
                            var14 = null;
                        } else {
                            int var15 = 0;
                            while (true) {
                                if (var15 >= var13) {
                                    var14 = var12;
                                    break;
                                }
                                var12 = class286.method2611(var12.field3320);
                                if (var12 == null) {
                                    var14 = null;
                                    break;
                                }
                                var15++;
                            }
                        }
                        if (var14 != null) {
                            class257 var16 = class257.method2630(class255.field2848, field551.field1319);
                            var16.field2960.method6852(field693.field3257);
                            var16.field2960.method6650(field541.field3265);
                            var16.field2960.method6691(field693.field3388);
                            var16.field2960.method6852(field541.field3388);
                            var16.field2960.method6783(field693.field3265);
                            var16.field2960.method6757(field541.field3257);
                            field551.method2268(var16);
                        }
                    }
                } else if (this.method1244()) {
                    this.method1069(field687 + field680, field688 + field681);
                } else if (field733 > 0) {
                    method1953(field687 + field680, field688 + field681);
                }
                field541 = null;
            }
        } else if (Statics.field4069 > 1) {
            field541 = null;
        }
    }

    @ObfuscatedName("bx.jo(II)V")
    public static void method1004(int arg0) {
        Statics.field3933 = new class67();
        Statics.field3933.field883 = field528[arg0];
        Statics.field3933.field881 = field644[arg0];
        Statics.field3933.field880 = field645[arg0];
        Statics.field3933.field882 = field646[arg0];
        Statics.field3933.field884 = field624[arg0];
    }

    @ObfuscatedName("bo.jy(III)V")
    public static void method1953(int arg0, int arg1) {
        class67 var2 = Statics.field3933;
        method263(var2.field883, var2.field881, var2.field880, var2.field882, var2.field884, var2.field884, arg0, arg1);
        Statics.field3933 = null;
    }

    @ObfuscatedName("du.jz(Ljz;B)V")
    public static void method2435(class286 arg0) {
        if (field713 == arg0.field3407) {
            field714[arg0.field3392] = true;
        }
    }

    @ObfuscatedName("ip.kp(I)V")
    public static void method4382() {
        for (class80 var0 = (class80) field666.method6463(); var0 != null; var0 = (class80) field666.method6457()) {
            int var1 = var0.field1039;
            if (class286.method159(var1)) {
                boolean var2 = true;
                class286[] var3 = Statics.field3290[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field3391;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field4301;
                    class286 var6 = class286.method2611(var5);
                    if (var6 != null) {
                        method2435(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("lz.kh(IS)V")
    public static final void method5594(int arg0) {
        if (!class286.method159(arg0)) {
            return;
        }
        class286[] var1 = Statics.field3290[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class286 var3 = var1[var2];
            if (var3 != null) {
                var3.field3397 = 0;
                var3.field3387 = 0;
            }
        }
    }

    @ObfuscatedName("cw.kj([Ljz;II)V")
    public static final void method2003(class286[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class286 var3 = arg0[var2];
            if (var3 != null && var3.field3320 == arg1 && (!var3.field3391 || !method4514(var3))) {
                if (var3.field3286 == 0) {
                    if (!var3.field3391 && method4514(var3) && Statics.field2808 != var3) {
                        continue;
                    }
                    method2003(arg0, var3.field3265);
                    if (var3.field3326 != null) {
                        method2003(var3.field3326, var3.field3265);
                    }
                    class80 var4 = (class80) field666.method6456((long) var3.field3265);
                    if (var4 != null) {
                        int var5 = var4.field1039;
                        if (class286.method159(var5)) {
                            method2003(Statics.field3290[var5], -1);
                        }
                    }
                }
                if (var3.field3286 == 6) {
                    if (var3.field3312 != -1 || var3.field3313 != -1) {
                        boolean var6 = method3938(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field3313;
                        } else {
                            var7 = var3.field3312;
                        }
                        if (var7 != -1) {
                            class183 var8 = class183.method1980(var7);
                            var3.field3387 += field567;
                            while (var3.field3387 > var8.field2094[var3.field3397]) {
                                var3.field3387 -= var8.field2094[var3.field3397];
                                var3.field3397++;
                                if (var3.field3397 >= var8.field2107.length) {
                                    var3.field3397 -= var8.field2111;
                                    if (var3.field3397 < 0 || var3.field3397 >= var8.field2107.length) {
                                        var3.field3397 = 0;
                                    }
                                }
                                method2435(var3);
                            }
                        }
                    }
                    if (var3.field3321 != 0 && !var3.field3391) {
                        int var9 = var3.field3321 >> 16;
                        int var10 = var3.field3321 << 16 >> 16;
                        int var11 = field567 * var9;
                        int var12 = field567 * var10;
                        var3.field3316 = var3.field3316 + var11 & 0x7FF;
                        var3.field3256 = var3.field3256 + var12 & 0x7FF;
                        method2435(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ok.ka(D)V")
    public static final void method6476(double arg0) {
        class194.method3465(arg0);
        ((class202) Statics.field2281).method3794(arg0);
        class181.method1797();
        Statics.field4567.field1228 = arg0;
        class89.method450();
    }

    @ObfuscatedName("g.kc(IB)V")
    public static final void method295(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 255);
        if (Statics.field4567.field1229 == var1) {
            return;
        }
        if (Statics.field4567.field1229 == 0 && field744 != -1) {
            class266.method1801(Statics.field2607, field744, 0, var1, false);
            field745 = false;
        } else if (var1 == 0) {
            Statics.field3109.method4552();
            class266.field3108 = 1;
            Statics.field3105 = null;
            field745 = false;
        } else {
            class266.method2404(var1);
        }
        Statics.field4567.field1229 = var1;
        class89.method450();
    }

    @ObfuscatedName("aa.kb(II)V")
    public static final void method613(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field4567.field1230 = var1;
        class89.method450();
    }

    @ObfuscatedName("cm.ku(II)V")
    public static final void method2300(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field4567.field1231 = var1;
        class89.method450();
    }

    @ObfuscatedName("ki.kn(II)V")
    public static final void method5028(int arg0) {
        method4382();
        for (class63 var1 = (class63) class63.field830.method5269(); var1 != null; var1 = (class63) class63.field830.method5270()) {
            if (var1.field815 != null) {
                var1.method1641();
            }
        }
        int var2 = class163.method740(arg0).field1758;
        if (var2 == 0) {
            return;
        }
        int var3 = class281.field3224[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                method6476(0.9D);
            }
            if (var3 == 2) {
                method6476(0.8D);
            }
            if (var3 == 3) {
                method6476(0.7D);
            }
            if (var3 == 4) {
                method6476(0.6D);
            }
        }
        if (var2 == 3) {
            if (var3 == 0) {
                method295(255);
            }
            if (var3 == 1) {
                method295(192);
            }
            if (var3 == 2) {
                method295(128);
            }
            if (var3 == 3) {
                method295(64);
            }
            if (var3 == 4) {
                method295(0);
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                method613(127);
            }
            if (var3 == 1) {
                method613(96);
            }
            if (var3 == 2) {
                method613(64);
            }
            if (var3 == 3) {
                method613(32);
            }
            if (var3 == 4) {
                method613(0);
            }
        }
        if (var2 == 5) {
            field609 = var3;
        }
        if (var2 == 6) {
            field625 = var3;
        }
        if (var2 == 9) {
            field670 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                method2300(127);
            }
            if (var3 == 1) {
                method2300(96);
            }
            if (var3 == 2) {
                method2300(64);
            }
            if (var3 == 3) {
                method2300(32);
            }
            if (var3 == 4) {
                method2300(0);
            }
        }
        if (var2 == 17) {
            field525 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            class94[] var4 = new class94[] { class94.field1268, class94.field1266, class94.field1262, class94.field1263, class94.field1264 };
            field523 = (class94) class321.method2696(var4, var3);
            if (field523 == null) {
                field523 = class94.field1266;
            }
        }
        if (var2 == 19) {
            if (var3 == -1) {
                field632 = -1;
            } else {
                field632 = var3 & 0x7FF;
            }
        }
        if (var2 != 22) {
            return;
        }
        class94[] var5 = new class94[] { class94.field1268, class94.field1266, class94.field1262, class94.field1263, class94.field1264 };
        field722 = (class94) class321.method2696(var5, var3);
        if (field722 == null) {
            field722 = class94.field1266;
        }
    }

    @ObfuscatedName("ak.kf(Ljz;I)V")
    public static final void method402(class286 arg0) {
        int var1 = arg0.field3269;
        if (var1 == 324) {
            if (field586 == -1) {
                field586 = arg0.field3300;
                field774 = arg0.field3301;
            }
            if (field772.field3235) {
                arg0.field3300 = field586;
            } else {
                arg0.field3300 = field774;
            }
        } else if (var1 == 325) {
            if (field586 == -1) {
                field586 = arg0.field3300;
                field774 = arg0.field3301;
            }
            if (field772.field3235) {
                arg0.field3300 = field774;
            } else {
                arg0.field3300 = field586;
            }
        } else if (var1 == 327) {
            arg0.field3316 = 150;
            arg0.field3256 = (int) (Math.sin((double) field682 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3318 = 5;
            arg0.field3309 = 0;
        } else if (var1 == 328) {
            arg0.field3316 = 150;
            arg0.field3256 = (int) (Math.sin((double) field682 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3318 = 5;
            arg0.field3309 = 1;
        }
    }

    @ObfuscatedName("ht.kw(IIII)Lcf;")
    public static final class80 method4357(int arg0, int arg1, int arg2) {
        class80 var3 = new class80();
        var3.field1039 = arg1;
        var3.field1038 = arg2;
        field666.method6455(var3, (long) arg0);
        method5594(arg1);
        class286 var4 = class286.method2611(arg0);
        method2435(var4);
        if (field526 != null) {
            method2435(field526);
            field526 = null;
        }
        method6415();
        method728(Statics.field3290[arg0 >> 16], var4, false);
        class64.method3773(arg1);
        if (field725 != -1) {
            method358(field725, 1);
        }
        return var3;
    }

    @ObfuscatedName("da.kv(Lcf;ZI)V")
    public static final void method2598(class80 arg0, boolean arg1) {
        int var2 = arg0.field1039;
        int var3 = (int) arg0.field4301;
        arg0.method6167();
        if (arg1) {
            class286.method4751(var2);
        }
        for (class391 var4 = (class391) field711.method6463(); var4 != null; var4 = (class391) field711.method6457()) {
            if ((long) var2 == (var4.field4301 >> 48 & 0xFFFFL)) {
                var4.method6167();
            }
        }
        class286 var5 = class286.method2611(var3);
        if (var5 != null) {
            method2435(var5);
        }
        method6415();
        if (field725 != -1) {
            method358(field725, 1);
        }
    }

    @ObfuscatedName("cc.kx(Ljz;I)Z")
    public static final boolean method2109(class286 arg0) {
        int var1 = arg0.field3269;
        if (var1 == 205) {
            field552 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field772.method4832(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field772.method4862(var4, var5 == 1);
        }
        if (var1 == 324) {
            field772.method4833(false);
        }
        if (var1 == 325) {
            field772.method4833(true);
        }
        if (var1 == 326) {
            class257 var6 = class257.method2630(class255.field2923, field551.field1319);
            field772.method4835(var6.field2960);
            field551.method2268(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("aq.ky(Ljz;IIIB)V")
    public static final void method624(class286 arg0, int arg1, int arg2, int arg3) {
        method2572();
        class280 var4 = arg0.method4911(false);
        if (var4 == null) {
            return;
        }
        class430.method6950(arg1, arg2, var4.field3218 + arg1, var4.field3212 + arg2);
        if (field743 == 2 || field743 == 5) {
            class430.method6953(arg1, arg2, 0, var4.field3221, var4.field3214);
        } else {
            int var5 = field575 & 0x7FF;
            int var6 = Statics.field2754.field1161 / 32 + 48;
            int var7 = 464 - Statics.field2754.field1152 / 32;
            Statics.field4497.method7087(arg1, arg2, var4.field3218, var4.field3212, var6, var7, var5, 256, var4.field3221, var4.field3214);
            for (int var8 = 0; var8 < field737; var8++) {
                int var9 = field738[var8] * 4 + 2 - Statics.field2754.field1161 / 32;
                int var10 = field750[var8] * 4 + 2 - Statics.field2754.field1152 / 32;
                method1786(arg1, arg2, var9, var10, field740[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class326 var13 = field633[Statics.field325][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field2754.field1161 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field2754.field1152 / 32;
                        method1786(arg1, arg2, var14, var15, Statics.field3197[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field547; var16++) {
                class91 var17 = field546[field548[var16]];
                if (var17 != null && var17.method2015()) {
                    class171 var18 = var17.field1247;
                    if (var18 != null && var18.field1856 != null) {
                        var18 = var18.method2973();
                    }
                    if (var18 != null && var18.field1869 && var18.field1878) {
                        int var19 = var17.field1161 / 32 - Statics.field2754.field1161 / 32;
                        int var20 = var17.field1152 / 32 - Statics.field2754.field1152 / 32;
                        method1786(arg1, arg2, var19, var20, Statics.field3197[1], var4);
                    }
                }
            }
            int var21 = class96.field1280;
            int[] var22 = class96.field1281;
            for (int var23 = 0; var23 < var21; var23++) {
                class83 var24 = field619[var22[var23]];
                if (var24 != null && var24.method2015() && !var24.field1086 && Statics.field2754 != var24) {
                    int var25 = var24.field1161 / 32 - Statics.field2754.field1161 / 32;
                    int var26 = var24.field1152 / 32 - Statics.field2754.field1152 / 32;
                    if (var24.method2002()) {
                        method1786(arg1, arg2, var25, var26, Statics.field3197[3], var4);
                    } else if (Statics.field2754.field1085 != 0 && var24.field1085 != 0 && Statics.field2754.field1085 == var24.field1085) {
                        method1786(arg1, arg2, var25, var26, Statics.field3197[4], var4);
                    } else if (var24.method2005()) {
                        method1786(arg1, arg2, var25, var26, Statics.field3197[5], var4);
                    } else if (var24.method2040()) {
                        method1786(arg1, arg2, var25, var26, Statics.field3197[6], var4);
                    } else {
                        method1786(arg1, arg2, var25, var26, Statics.field3197[2], var4);
                    }
                }
            }
            if (field696 != 0 && field682 % 20 < 10) {
                if (field696 == 1 && field726 >= 0 && field726 < field546.length) {
                    class91 var27 = field546[field726];
                    if (var27 != null) {
                        int var28 = var27.field1161 / 32 - Statics.field2754.field1161 / 32;
                        int var29 = var27.field1152 / 32 - Statics.field2754.field1152 / 32;
                        method144(arg1, arg2, var28, var29, Statics.field1297[1], var4);
                    }
                }
                if (field696 == 2) {
                    int var30 = field642 * 4 - Statics.field161 * 4 + 2 - Statics.field2754.field1161 / 32;
                    int var31 = field519 * 4 - Statics.field1467 * 4 + 2 - Statics.field2754.field1152 / 32;
                    method144(arg1, arg2, var30, var31, Statics.field1297[1], var4);
                }
                if (field696 == 10 && field517 >= 0 && field517 < field619.length) {
                    class83 var32 = field619[field517];
                    if (var32 != null) {
                        int var33 = var32.field1161 / 32 - Statics.field2754.field1161 / 32;
                        int var34 = var32.field1152 / 32 - Statics.field2754.field1152 / 32;
                        method144(arg1, arg2, var33, var34, Statics.field1297[1], var4);
                    }
                }
            }
            if (field741 != 0) {
                int var35 = field741 * 4 + 2 - Statics.field2754.field1161 / 32;
                int var36 = field742 * 4 + 2 - Statics.field2754.field1152 / 32;
                method1786(arg1, arg2, var35, var36, Statics.field1297[0], var4);
            }
            if (!Statics.field2754.field1086) {
                class430.method6958(var4.field3218 / 2 + arg1 - 1, var4.field3212 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field715[arg3] = true;
    }

    @ObfuscatedName("fj.ko(Ljz;IIII)V")
    public static final void method3002(class286 arg0, int arg1, int arg2, int arg3) {
        class280 var4 = arg0.method4911(false);
        if (var4 == null) {
            return;
        }
        if (field743 < 3) {
            Statics.field71.method7087(arg1, arg2, var4.field3218, var4.field3212, 25, 25, field575, 256, var4.field3221, var4.field3214);
        } else {
            class430.method6953(arg1, arg2, 0, var4.field3221, var4.field3214);
        }
    }

    @ObfuscatedName("h.km(IIIILpt;Ljq;I)V")
    public static final void method144(int arg0, int arg1, int arg2, int arg3, class434 arg4, class280 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method1786(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field575 & 0x7FF;
        int var8 = class194.field2271[var7];
        int var9 = class194.field2280[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field3218 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field1031.method7084(arg5.field3218 / 2 + arg0 - var17 / 2 + var15, arg5.field3212 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("bs.ks(IIIILpt;Ljq;I)V")
    public static final void method1786(int arg0, int arg1, int arg2, int arg3, class434 arg4, class280 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field575 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class194.field2271[var6];
        int var9 = class194.field2280[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method7090(arg5.field3218 / 2 + var10 - arg4.field4601 / 2, arg5.field3212 / 2 - var11 - arg4.field4607 / 2, arg0, arg1, arg5.field3218, arg5.field3212, arg5.field3221, arg5.field3214);
        } else {
            arg4.method7066(arg5.field3218 / 2 + arg0 + var10 - arg4.field4601 / 2, arg5.field3212 / 2 + arg1 - var11 - arg4.field4607 / 2);
        }
    }

    @ObfuscatedName("kf.kg(S)V")
    public static final void method4946() {
        for (int var0 = 0; var0 < class96.field1280; var0++) {
            class83 var1 = field619[class96.field1281[var0]];
            var1.method2012();
        }
        class98.method2692();
        if (Statics.field888 != null) {
            Statics.field888.method5718();
        }
    }

    @ObfuscatedName("cu.kz(I)V")
    public static final void method1996() {
        Iterator var0 = class98.field1308.iterator();
        while (var0.hasNext()) {
            class58 var1 = (class58) var0.next();
            var1.method1012();
        }
        if (Statics.field888 != null) {
            Statics.field888.method5714();
        }
    }

    @ObfuscatedName("cq.ki(I)V")
    public static final void method2068() {
        for (int var0 = 0; var0 < class96.field1280; var0++) {
            class83 var1 = field619[class96.field1281[var0]];
            var1.method2004();
        }
    }

    @ObfuscatedName("ow.kq(I)V")
    public static final void method6557() {
        field601 = field690;
    }

    @ObfuscatedName("ep.kk(I)V")
    public static final void method2613() {
        field665 = field690;
        Statics.field2298 = true;
    }

    @ObfuscatedName("hv.ke(I)V")
    public static final void method4012() {
        field702 = field690;
        Statics.field1529 = true;
    }

    @ObfuscatedName("ov.kt(Ljava/lang/String;I)V")
    public static final void method6413(String arg0) {
        if (!arg0.equals("")) {
            class257 var1 = class257.method2630(class255.field2861, field551.field1319);
            var1.field2960.method6644(class421.method5127(arg0));
            var1.field2960.method6654(arg0);
            field551.method2268(var1);
        }
    }

    @ObfuscatedName("lw.kd(I)V")
    public static final void method5551() {
        class257 var0 = class257.method2630(class255.field2861, field551.field1319);
        var0.field2960.method6644(0);
        field551.method2268(var0);
    }

    @ObfuscatedName("fe.la(III)V")
    public static final void method3094(int arg0, int arg1) {
        class147 var2 = arg0 >= 0 ? field717[arg0] : Statics.field1037;
        if (var2 == null || arg1 < 0 || arg1 >= var2.method2716()) {
            return;
        }
        class129 var3 = (class129) var2.field1660.get(arg1);
        if (var3.field1528 != -1) {
            return;
        }
        String var4 = var3.field1527.method7231();
        class257 var5 = class257.method2630(class255.field2933, field551.field1319);
        var5.field2960.method6644(3 + class421.method5127(var4));
        var5.field2960.method6644(arg0);
        var5.field2960.method6757(arg1);
        var5.field2960.method6654(var4);
        field551.method2268(var5);
    }

    @ObfuscatedName("do.lf(III)V")
    public static final void method2522(int arg0, int arg1) {
        if (field717[arg0] == null || arg1 < 0 || arg1 >= field717[arg0].method2716()) {
            return;
        }
        class129 var2 = (class129) field717[arg0].field1660.get(arg1);
        if (var2.field1528 != -1) {
            return;
        }
        class257 var3 = class257.method2630(class255.field2851, field551.field1319);
        var3.field2960.method6644(3 + class421.method5127(var2.field1527.method7231()));
        var3.field2960.method6644(arg0);
        var3.field2960.method6757(arg1);
        var3.field2960.method6654(var2.field1527.method7231());
        field551.method2268(var3);
    }

    @ObfuscatedName("fs.ld(IIZI)V")
    public static final void method2915(int arg0, int arg1, boolean arg2) {
        if (field717[arg0] == null || arg1 < 0 || arg1 >= field717[arg0].method2716()) {
            return;
        }
        class129 var3 = (class129) field717[arg0].field1660.get(arg1);
        class257 var4 = class257.method2630(class255.field2881, field551.field1319);
        var4.field2960.method6644(4 + class421.method5127(var3.field1527.method7231()));
        var4.field2960.method6644(arg0);
        var4.field2960.method6757(arg1);
        var4.field2960.method6653(arg2);
        var4.field2960.method6654(var3.field1527.method7231());
        field551.method2268(var4);
    }

    @ObfuscatedName("lu.lm(Ljz;B)I")
    public static int method5247(class286 arg0) {
        class391 var1 = (class391) field711.method6456(((long) arg0.field3265 << 32) + (long) arg0.field3257);
        return var1 == null ? arg0.field3304 : var1.field4299;
    }

    @ObfuscatedName("jh.lq(Ljz;I)Z")
    public static boolean method4514(class286 arg0) {
        return arg0.field3360;
    }

    @ObfuscatedName("ih.lk(Ljz;I)Ljava/lang/String;")
    public static String method4435(class286 arg0) {
        if (class287.method2632(method5247(arg0)) == 0) {
            return null;
        } else if (arg0.field3303 == null || arg0.field3303.trim().length() == 0) {
            return null;
        } else {
            return arg0.field3303;
        }
    }

    @ObfuscatedName("fe.lx(Ljava/lang/String;ZS)Ljava/lang/String;")
    public static String method3071(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field539 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field539 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field539 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field539 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field539 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field257 != null) {
            var3 = "/p=" + Statics.field257;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + Statics.field1503 + "/a=" + Statics.field1219 + var3 + "/";
    }

    @ObfuscatedName("dy.lr(Ljava/lang/String;B)V")
    public static void method2582(String arg0) {
        Statics.field257 = arg0;
        try {
            String var1 = Statics.field4489.getParameter(Integer.toString(18));
            String var2 = Statics.field4489.getParameter(Integer.toString(13));
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                String var5 = var3 + "; Expires=";
                long var6 = class262.method4787() + 94608000000L;
                class277.field3203.setTime(new Date(var6));
                int var8 = class277.field3203.get(7);
                int var9 = class277.field3203.get(5);
                int var10 = class277.field3203.get(2);
                int var11 = class277.field3203.get(1);
                int var12 = class277.field3203.get(11);
                int var13 = class277.field3203.get(12);
                int var14 = class277.field3203.get(13);
                String var15 = class277.field3204[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + class277.field3202[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT";
                var4 = var5 + var15 + "; Max-Age=" + 94608000L;
            }
            class28.method390(Statics.field4489, "document.cookie=\"" + var4 + "\"");
        } catch (Throwable var17) {
        }
    }

    @ObfuscatedName("n.lg(Ljava/lang/String;ZB)V")
    public static void method197(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field1183; var5++) {
            class181 var6 = class181.method1538(var5);
            if ((!arg1 || var6.field2068) && var6.field2053 == -1 && var6.field2028.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field2202 = -1;
                    Statics.field1565 = null;
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
        Statics.field1565 = var3;
        Statics.field2127 = 0;
        Statics.field2202 = var4;
        String[] var9 = new String[Statics.field2202];
        for (int var10 = 0; var10 < Statics.field2202; var10++) {
            var9[var10] = class181.method1538(var3[var10]).field2028;
        }
        class418.method1539(var9, Statics.field1565);
    }

    @ObfuscatedName("gu.lu(Lpi;II)V")
    public static void method3770(class421 arg0, int arg1) {
        byte[] var2 = arg0.field4511;
        if (field545 == null) {
            field545 = new byte[24];
        }
        class339.method5605(var2, arg1, field545, 0, 24);
        if (class154.field1697 == null) {
            return;
        }
        try {
            class154.field1697.method6501(0L);
            class154.field1697.method6508(arg0.field4511, arg1, 24);
        } catch (Exception var4) {
        }
    }

    @ObfuscatedName("client.ll(B)Lpb;")
    public class442 method1372() {
        return Statics.field2754 == null ? null : Statics.field2754.field1073;
    }

    @ObfuscatedName("b.le(IIIZB)V")
    public static void method357(int arg0, int arg1, int arg2, boolean arg3) {
        class257 var4 = class257.method2630(class255.field2899, field551.field1319);
        var4.field2960.method6747(arg3 ? field514 : 0);
        var4.field2960.method6852(arg0);
        var4.field2960.method6667(arg2);
        var4.field2960.method6852(arg1);
        field551.method2268(var4);
    }

    @ObfuscatedName("et.lo(B)Z")
    public static boolean method2624() {
        return field674 >= 2;
    }

    @ObfuscatedName("ie.ls(IB)V")
    public static void method4488(int arg0) {
        field580 = arg0;
    }

    @ObfuscatedName("kc.lc(B)V")
    public static void method4940() {
        if (field580 == 1) {
            field588 = true;
        }
    }

    @ObfuscatedName("n.lt(I)V")
    public static void method196() {
        if (!field588 || Statics.field2754 == null) {
            return;
        }
        int var0 = Statics.field2754.field1173[0];
        int var1 = Statics.field2754.field1147[0];
        if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) {
            return;
        }
        Statics.field182 = Statics.field2754.field1161;
        int var2 = method2169(Statics.field2754.field1161, Statics.field2754.field1152, Statics.field325) - field581;
        if (var2 < Statics.field3219) {
            Statics.field3219 = var2;
        }
        Statics.field1492 = Statics.field2754.field1152;
        field588 = false;
    }

    @ObfuscatedName("jo.lp(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method4849(String arg0) {
        class302[] var1 = class302.method4604();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class302 var3 = var1[var2];
            if (var3.field3860 != -1 && arg0.startsWith(class92.method4309(var3.field3860))) {
                arg0 = arg0.substring(6 + Integer.toString(var3.field3860).length());
                break;
            }
        }
        return arg0;
    }

    @ObfuscatedName("oi.ln(I)V")
    public static void method6562() {
        if (Statics.field59 == null) {
            return;
        }
        field778 = field682;
        Statics.field59.method5207();
        for (int var0 = 0; var0 < field619.length; var0++) {
            if (field619[var0] != null) {
                Statics.field59.method5206((field619[var0].field1161 >> 7) + Statics.field161, (field619[var0].field1152 >> 7) + Statics.field1467);
            }
        }
    }

    @ObfuscatedName("gs.li(B)Z")
    public static boolean method3568() {
        return Statics.field4567.field1232 >= field700;
    }

    @ObfuscatedName("bh.lv(I)V")
    public static void method1802() {
        Statics.field4567.field1232 = field700;
        class89.method450();
    }

    @ObfuscatedName("hh.ly(IB)V")
    public static void method3973(int arg0) {
        if (field530 != arg0) {
            field530 = arg0;
        }
    }
}

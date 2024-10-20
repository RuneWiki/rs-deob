package deob;

import com.jagex.oldscape.pub.OAuthApi;
import com.jagex.oldscape.pub.OtlTokenRequester;
import com.jagex.oldscape.pub.OtlTokenResponse;
import com.jagex.oldscape.pub.RefreshAccessTokenRequester;
import com.jagex.oldscape.pub.RefreshAccessTokenResponse;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import netscape.javascript.JSObject;
import org.json.JSONException;
import org.json.JSONObject;

public final class client extends class35 implements class466, OAuthApi, class339 {

    @ObfuscatedName("client.bl")
    public static boolean field777 = true;

    @ObfuscatedName("client.cx")
    public static int field798 = 1;

    @ObfuscatedName("client.cu")
    public static int field719 = 0;

    @ObfuscatedName("client.cm")
    public static int field505 = 0;

    @ObfuscatedName("client.cb")
    public static boolean field601 = false;

    @ObfuscatedName("client.cr")
    public static boolean field548 = false;

    @ObfuscatedName("client.ci")
    public static int field571 = -1;

    @ObfuscatedName("client.co")
    public static int field559 = -1;

    @ObfuscatedName("client.cn")
    public static int field510 = -1;

    @ObfuscatedName("client.cy")
    public static boolean field642 = false;

    @ObfuscatedName("client.da")
    public static boolean field513;

    @ObfuscatedName("client.dp")
    public static boolean field514;

    @ObfuscatedName("client.dj")
    public static int field609;

    @ObfuscatedName("client.dl")
    public static boolean field516;

    @ObfuscatedName("client.de")
    public static boolean field517;

    @ObfuscatedName("client.dc")
    public static boolean field536;

    @ObfuscatedName("client.ds")
    public static int field519;

    @ObfuscatedName("client.dh")
    public static int field520;

    @ObfuscatedName("client.do")
    public static long field521;

    @ObfuscatedName("client.dq")
    public static int field522;

    @ObfuscatedName("client.dr")
    public static int field663;

    @ObfuscatedName("client.dg")
    public static long field524;

    @ObfuscatedName("client.dt")
    public static boolean field525;

    @ObfuscatedName("client.du")
    public static int field526;

    @ObfuscatedName("client.dk")
    public static int field527;

    @ObfuscatedName("client.db")
    public static int field528;

    @ObfuscatedName("client.dy")
    public static int field529;

    @ObfuscatedName("client.dz")
    public static int field640;

    @ObfuscatedName("client.dd")
    public static int field531;

    @ObfuscatedName("client.ep")
    public static int field720;

    @ObfuscatedName("client.et")
    public static int field645;

    @ObfuscatedName("client.en")
    public static int field534;

    @ObfuscatedName("client.eh")
    public static class107 field535;

    @ObfuscatedName("client.eb")
    public static class107 field650;

    @ObfuscatedName("client.em")
    public static boolean field537;

    @ObfuscatedName("client.ej")
    public static class95 field780;

    @ObfuscatedName("client.ey")
    public static int field539;

    @ObfuscatedName("client.ew")
    public static int field540;

    @ObfuscatedName("client.fv")
    public static int field541;

    @ObfuscatedName("client.fh")
    public static int field544;

    @ObfuscatedName("client.ft")
    public static int field543;

    @ObfuscatedName("client.fp")
    public static int field673;

    @ObfuscatedName("client.fw")
    public static class145 field545;

    @ObfuscatedName("client.gb")
    public static class554 field546;

    @ObfuscatedName("client.gd")
    public String field579;

    @ObfuscatedName("client.gr")
    public class15 field685;

    @ObfuscatedName("client.gi")
    public class19 field549;

    @ObfuscatedName("client.gq")
    public OtlTokenRequester field550;

    @ObfuscatedName("client.gj")
    public Future field551;

    @ObfuscatedName("client.gy")
    public boolean field552 = false;

    @ObfuscatedName("client.gm")
    public int field553 = 0;

    @ObfuscatedName("client.gf")
    public class19 field554;

    @ObfuscatedName("client.ga")
    public RefreshAccessTokenRequester field555;

    @ObfuscatedName("client.gv")
    public Future field556;

    @ObfuscatedName("client.go")
    public static final String field557;

    @ObfuscatedName("client.gc")
    public static final String field558;

    @ObfuscatedName("client.hc")
    public static boolean field560;

    @ObfuscatedName("client.hg")
    public static class80 field561;

    @ObfuscatedName("client.ht")
    public static int[] field533;

    @ObfuscatedName("client.hd")
    public class549 field508;

    @ObfuscatedName("client.hv")
    public class8 field564;

    @ObfuscatedName("client.hi")
    public long field565 = -1L;

    @ObfuscatedName("client.hk")
    public static byte[] field566;

    @ObfuscatedName("client.hw")
    public static int field714;

    @ObfuscatedName("client.hz")
    public static int[] field568;

    @ObfuscatedName("client.iq")
    public static final class115 field569;

    @ObfuscatedName("client.in")
    public static int field570;

    @ObfuscatedName("client.ip")
    public static boolean field671;

    @ObfuscatedName("client.il")
    public static class453 field703;

    @ObfuscatedName("client.it")
    public static String field660;

    @ObfuscatedName("client.ib")
    public static HashMap field749;

    @ObfuscatedName("client.im")
    public static int field574;

    @ObfuscatedName("client.ia")
    public static int field575;

    @ObfuscatedName("client.iv")
    public static int field576;

    @ObfuscatedName("client.ih")
    public static int field786;

    @ObfuscatedName("client.ic")
    public static int field705;

    @ObfuscatedName("client.jx")
    public static int[][][] field768;

    @ObfuscatedName("client.jy")
    public static boolean field711;

    @ObfuscatedName("client.jh")
    public static int[][][] field581;

    @ObfuscatedName("client.jn")
    public static final int[] field582;

    @ObfuscatedName("client.jo")
    public static int field583;

    @ObfuscatedName("client.ju")
    public static int field584;

    @ObfuscatedName("client.kd")
    public static int field612;

    @ObfuscatedName("client.ka")
    public static int field586;

    @ObfuscatedName("client.kg")
    public static int field718;

    @ObfuscatedName("client.kb")
    public static int field588;

    @ObfuscatedName("client.kl")
    public static boolean field589;

    @ObfuscatedName("client.kp")
    public static int field590;

    @ObfuscatedName("client.kj")
    public static int field591;

    @ObfuscatedName("client.kw")
    public static int field592;

    @ObfuscatedName("client.ku")
    public static int field726;

    @ObfuscatedName("client.kv")
    public static int field595;

    @ObfuscatedName("client.kz")
    public static int field600;

    @ObfuscatedName("client.lu")
    public static int field596;

    @ObfuscatedName("client.ln")
    public static int field704;

    @ObfuscatedName("client.lj")
    public static int field506;

    @ObfuscatedName("client.li")
    public static int field599;

    @ObfuscatedName("client.ld")
    public static int field503;

    @ObfuscatedName("client.lw")
    public static int field682;

    @ObfuscatedName("client.lk")
    public static int field602;

    @ObfuscatedName("client.lt")
    public static int field603;

    @ObfuscatedName("client.lo")
    public static int field604;

    @ObfuscatedName("client.lz")
    public static boolean field633;

    @ObfuscatedName("client.lq")
    public static int field778;

    @ObfuscatedName("client.la")
    public static boolean field607;

    @ObfuscatedName("client.lg")
    public static int field502;

    @ObfuscatedName("client.ls")
    public static int field532;

    @ObfuscatedName("client.ll")
    public static int field610;

    @ObfuscatedName("client.lm")
    public static int[] field611;

    @ObfuscatedName("client.lf")
    public static int[] field620;

    @ObfuscatedName("client.lp")
    public static int[] field613;

    @ObfuscatedName("client.lh")
    public static int[] field654;

    @ObfuscatedName("client.lx")
    public static int[] field615;

    @ObfuscatedName("client.le")
    public static int[] field773;

    @ObfuscatedName("client.lc")
    public static int[][] field617;

    @ObfuscatedName("client.mj")
    public static int[] field618;

    @ObfuscatedName("client.mm")
    public static String[] field562;

    @ObfuscatedName("client.ms")
    public static int field628;

    @ObfuscatedName("client.mx")
    public static int field747;

    @ObfuscatedName("client.mu")
    public static int field622;

    @ObfuscatedName("client.mh")
    public static int field623;

    @ObfuscatedName("client.mg")
    public static int field624;

    @ObfuscatedName("client.mi")
    public static int field511;

    @ObfuscatedName("client.mb")
    public static int field626;

    @ObfuscatedName("client.mc")
    public static boolean field627;

    @ObfuscatedName("client.my")
    public static int field587;

    @ObfuscatedName("client.ml")
    public static boolean field629;

    @ObfuscatedName("client.me")
    public static int field630;

    @ObfuscatedName("client.mp")
    public static int field631;

    @ObfuscatedName("client.mw")
    public static long field632;

    @ObfuscatedName("client.mn")
    public static long field598;

    @ObfuscatedName("client.mo")
    public static String field634;

    @ObfuscatedName("client.mr")
    public static int field635;

    @ObfuscatedName("client.mt")
    public static boolean field577;

    @ObfuscatedName("client.nd")
    public static int field637;

    @ObfuscatedName("client.no")
    public static int field638;

    @ObfuscatedName("client.nk")
    public static int[] field585;

    @ObfuscatedName("client.nn")
    public static final int[] field639;

    @ObfuscatedName("client.nf")
    public static String[] field641;

    @ObfuscatedName("client.nm")
    public static boolean[] field729;

    @ObfuscatedName("client.ny")
    public static int[] field507;

    @ObfuscatedName("client.nv")
    public static int field644;

    @ObfuscatedName("client.ne")
    public static int[] field578;

    @ObfuscatedName("client.nw")
    public static int[] field646;

    @ObfuscatedName("client.nx")
    public static int[] field647;

    @ObfuscatedName("client.nl")
    public static int[] field648;

    @ObfuscatedName("client.nz")
    public static boolean field649;

    @ObfuscatedName("client.nb")
    public static boolean field694;

    @ObfuscatedName("client.nu")
    public static class568 field651;

    @ObfuscatedName("client.nt")
    public static boolean field701;

    @ObfuscatedName("client.nj")
    public static boolean field653;

    @ObfuscatedName("client.nq")
    public static boolean field668;

    @ObfuscatedName("client.na")
    public static int field655;

    @ObfuscatedName("client.nh")
    public static int field656;

    @ObfuscatedName("client.oe")
    public static int field657;

    @ObfuscatedName("client.og")
    public static int field658;

    @ObfuscatedName("client.ol")
    public static int field659;

    @ObfuscatedName("client.ow")
    public static boolean field661;

    @ObfuscatedName("client.ou")
    public static int field716;

    @ObfuscatedName("client.ok")
    public static int field530;

    @ObfuscatedName("client.ot")
    public static String field664;

    @ObfuscatedName("client.oi")
    public static String field665;

    @ObfuscatedName("client.od")
    public static int field667;

    @ObfuscatedName("client.ov")
    public static class522 field762;

    @ObfuscatedName("client.oh")
    public static int field669;

    @ObfuscatedName("client.oq")
    public static int field670;

    @ObfuscatedName("client.oj")
    public static int field572;

    @ObfuscatedName("client.op")
    public static class361 field672;

    @ObfuscatedName("client.on")
    public static int field680;

    @ObfuscatedName("client.ob")
    public static int field674;

    @ObfuscatedName("client.or")
    public static int field675;

    @ObfuscatedName("client.pb")
    public static int field676;

    @ObfuscatedName("client.pq")
    public static boolean field593;

    @ObfuscatedName("client.pd")
    public static class361 field678;

    @ObfuscatedName("client.pj")
    public static class361 field679;

    @ObfuscatedName("client.pt")
    public static class361 field643;

    @ObfuscatedName("client.ph")
    public static int field681;

    @ObfuscatedName("client.px")
    public static int field597;

    @ObfuscatedName("client.pc")
    public static class361 field683;

    @ObfuscatedName("client.pp")
    public static boolean field684;

    @ObfuscatedName("client.pi")
    public static int field662;

    @ObfuscatedName("client.pn")
    public static int field767;

    @ObfuscatedName("client.py")
    public static boolean field605;

    @ObfuscatedName("client.pe")
    public static int field636;

    @ObfuscatedName("client.pg")
    public static int field689;

    @ObfuscatedName("client.ps")
    public static boolean field690;

    @ObfuscatedName("client.pf")
    public static int field691;

    @ObfuscatedName("client.pz")
    public static int[] field746;

    @ObfuscatedName("client.pl")
    public static int field693;

    @ObfuscatedName("client.pa")
    public static int[] field710;

    @ObfuscatedName("client.pm")
    public static int field573;

    @ObfuscatedName("client.qs")
    public static int[] field696;

    @ObfuscatedName("client.qt")
    public static int field697;

    @ObfuscatedName("client.qa")
    public static int[] field698;

    @ObfuscatedName("client.qr")
    public static int field699;

    @ObfuscatedName("client.qw")
    public static int field700;

    @ObfuscatedName("client.qz")
    public static int field504;

    @ObfuscatedName("client.qm")
    public static int field702;

    @ObfuscatedName("client.qh")
    public static int field804;

    @ObfuscatedName("client.qf")
    public static int field563;

    @ObfuscatedName("client.qy")
    public static int field752;

    @ObfuscatedName("client.qi")
    public static int field706;

    @ObfuscatedName("client.qo")
    public static int field707;

    @ObfuscatedName("client.qd")
    public static int field708;

    @ObfuscatedName("client.qg")
    public static class567 field709;

    @ObfuscatedName("client.qu")
    public static class408 field621;

    @ObfuscatedName("client.qv")
    public static class408 field801;

    @ObfuscatedName("client.qx")
    public static class408 field712;

    @ObfuscatedName("client.qj")
    public static class408 field713;

    @ObfuscatedName("client.qb")
    public static class522 field735;

    @ObfuscatedName("client.qn")
    public static int field715;

    @ObfuscatedName("client.ro")
    public static int field687;

    @ObfuscatedName("client.rg")
    public static boolean[] field717;

    @ObfuscatedName("client.rw")
    public static boolean[] field686;

    @ObfuscatedName("client.rm")
    public static boolean[] field764;

    @ObfuscatedName("client.rk")
    public static int[] field625;

    @ObfuscatedName("client.rs")
    public static int[] field721;

    @ObfuscatedName("client.ra")
    public static int[] field722;

    @ObfuscatedName("client.rx")
    public static int[] field723;

    @ObfuscatedName("client.ru")
    public static int field724;

    @ObfuscatedName("client.rn")
    public static long field725;

    @ObfuscatedName("client.rd")
    public static boolean field614;

    @ObfuscatedName("client.rt")
    public static int field727;

    @ObfuscatedName("client.rj")
    public static int field728;

    @ObfuscatedName("client.rh")
    public static int[] field688;

    @ObfuscatedName("client.rz")
    public static int field730;

    @ObfuscatedName("client.rp")
    public static int field731;

    @ObfuscatedName("client.re")
    public static String field732;

    @ObfuscatedName("client.rr")
    public static long[] field759;

    @ObfuscatedName("client.sp")
    public static int field734;

    @ObfuscatedName("client.sq")
    public static class268 field748;

    @ObfuscatedName("client.se")
    public static class266 field736;

    @ObfuscatedName("client.sh")
    public static int field737;

    @ObfuscatedName("client.so")
    public static int[] field738;

    @ObfuscatedName("client.sk")
    public static int[] field652;

    @ObfuscatedName("client.sc")
    public static long field677;

    @ObfuscatedName("client.sx")
    public static class160[] field741;

    @ObfuscatedName("client.su")
    public static class169[] field608;

    @ObfuscatedName("client.si")
    public static int field743;

    @ObfuscatedName("client.sr")
    public static int field744;

    @ObfuscatedName("client.ss")
    public static int[] field745;

    @ObfuscatedName("client.sd")
    public static int[] field695;

    @ObfuscatedName("client.sj")
    public static class563[] field567;

    @ObfuscatedName("client.sg")
    public static int field542;

    @ObfuscatedName("client.sy")
    public static int field739;

    @ObfuscatedName("client.tl")
    public static int field750;

    @ObfuscatedName("client.ti")
    public static boolean field751;

    @ObfuscatedName("client.tr")
    public static int field666;

    @ObfuscatedName("client.tq")
    public static int[] field753;

    @ObfuscatedName("client.ty")
    public static int[] field754;

    @ObfuscatedName("client.tp")
    public static int[] field755;

    @ObfuscatedName("client.tg")
    public static int[] field756;

    @ObfuscatedName("client.te")
    public static int[] field757;

    @ObfuscatedName("client.tw")
    public static class40[] field758;

    @ObfuscatedName("client.tx")
    public static boolean field538;

    @ObfuscatedName("client.tz")
    public static boolean field760;

    @ObfuscatedName("client.to")
    public static boolean field761;

    @ObfuscatedName("client.tj")
    public static boolean field515;

    @ObfuscatedName("client.uh")
    public static class513 field763;

    @ObfuscatedName("client.uk")
    public static class512 field518;

    @ObfuscatedName("client.ua")
    public static class512 field616;

    @ObfuscatedName("client.um")
    public static boolean field766;

    @ObfuscatedName("client.uy")
    public static boolean[] field765;

    @ObfuscatedName("client.uz")
    public static int[] field509;

    @ObfuscatedName("client.uo")
    public static int[] field769;

    @ObfuscatedName("client.uj")
    public static int[] field770;

    @ObfuscatedName("client.ub")
    public static int[] field771;

    @ObfuscatedName("client.uc")
    public static short field772;

    @ObfuscatedName("client.un")
    public static short field692;

    @ObfuscatedName("client.ur")
    public static short field774;

    @ObfuscatedName("client.uq")
    public static short field775;

    @ObfuscatedName("client.uu")
    public static short field547;

    @ObfuscatedName("client.ue")
    public static short field776;

    @ObfuscatedName("client.vh")
    public static short field580;

    @ObfuscatedName("client.vs")
    public static short field779;

    @ObfuscatedName("client.vg")
    public static int field606;

    @ObfuscatedName("client.vj")
    public static int field781;

    @ObfuscatedName("client.vm")
    public static int field782;

    @ObfuscatedName("client.vd")
    public static int field783;

    @ObfuscatedName("client.vi")
    public static int field784;

    @ObfuscatedName("client.va")
    public static final class358 field785;

    @ObfuscatedName("client.vn")
    public static int field619;

    @ObfuscatedName("client.vt")
    public static int field787;

    @ObfuscatedName("client.vx")
    public static class509 field788;

    @ObfuscatedName("client.vr")
    public static class398[] field789;

    @ObfuscatedName("client.vv")
    public static class67 field790;

    @ObfuscatedName("client.vu")
    public static class463 field791;

    @ObfuscatedName("client.vw")
    public static class315 field792;

    @ObfuscatedName("client.vp")
    public static class315 field793;

    @ObfuscatedName("client.vf")
    public static int field794;

    @ObfuscatedName("client.wd")
    public static int field795;

    @ObfuscatedName("client.wz")
    public static List field796;

    @ObfuscatedName("client.wt")
    public static final class277 field797;

    @ObfuscatedName("client.wc")
    public static ArrayList field740;

    @ObfuscatedName("client.ws")
    public static int field799;

    @ObfuscatedName("client.wp")
    public static int field800;

    @ObfuscatedName("client.wq")
    public static final class66 field742;

    @ObfuscatedName("client.wg")
    public static int[] field802;

    @ObfuscatedName("client.wn")
    public static int[] field803;

    static {
        class547.field5372 = 224;
        field513 = false;
        field514 = false;
        field609 = 0;
        field516 = false;
        field517 = false;
        field536 = true;
        field519 = 0;
        field520 = 0;
        field521 = 1L;
        field522 = -1;
        field663 = -1;
        field524 = -1L;
        field525 = true;
        field526 = 0;
        field527 = 0;
        field528 = 0;
        field529 = 0;
        field640 = 0;
        field531 = 0;
        field720 = 0;
        field645 = 0;
        field534 = 0;
        field535 = class107.field1368;
        field650 = class107.field1368;
        field537 = false;
        field780 = class95.field1143;
        field539 = 0;
        field540 = 0;
        field541 = 0;
        field544 = 0;
        field543 = 0;
        field673 = 0;
        field545 = class145.field1654;
        field546 = class554.field5436;
        field557 = class416.method6803(class414.method4991("com_jagex_auth_desktop_osrs:public"));
        field558 = class416.method6803(class414.method4991("com_jagex_auth_desktop_runelite:public"));
        field560 = false;
        field561 = new class80();
        field533 = new int[4];
        field566 = null;
        field714 = 0;
        field568 = new int[250];
        field569 = new class115();
        field570 = 0;
        field671 = false;
        field703 = new class453();
        field749 = new HashMap();
        field574 = 0;
        field575 = 1;
        field576 = 0;
        field786 = 1;
        field705 = 0;
        field768 = new int[4][13][13];
        field711 = false;
        field581 = new int[4][13][13];
        field582 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
        field583 = -1;
        field584 = 0;
        field612 = 2301979;
        field586 = 5063219;
        field718 = 3353893;
        field588 = 7759444;
        field589 = false;
        field590 = 0;
        field591 = 128;
        field592 = 0;
        field726 = 0;
        field595 = 0;
        field600 = 0;
        field596 = 0;
        field704 = 0;
        field506 = 50;
        field599 = 0;
        field503 = 0;
        field682 = 0;
        field602 = 12;
        field603 = 6;
        field604 = 0;
        field633 = false;
        field778 = 0;
        field607 = false;
        field502 = 0;
        field532 = 0;
        field610 = 50;
        field611 = new int[field610];
        field620 = new int[field610];
        field613 = new int[field610];
        field654 = new int[field610];
        field615 = new int[field610];
        field773 = new int[field610];
        field617 = new int[field610][];
        field618 = new int[field610];
        field562 = new String[field610];
        field628 = 0;
        field747 = -1;
        field622 = -1;
        field623 = 0;
        field624 = 0;
        field511 = 0;
        field626 = 0;
        field627 = true;
        field587 = 0;
        field629 = true;
        field630 = -1;
        field631 = 0;
        field632 = -1L;
        field598 = -1L;
        field634 = "";
        field635 = -1;
        field577 = true;
        field637 = 0;
        field638 = 0;
        field585 = new int[1000];
        field639 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };
        field641 = new String[8];
        field729 = new boolean[8];
        field507 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };
        field644 = -1;
        field578 = new int[25];
        field646 = new int[25];
        field647 = new int[25];
        field648 = new int[25];
        field649 = false;
        field694 = false;
        field651 = new class568(true);
        field701 = false;
        field653 = false;
        field668 = true;
        field655 = -1;
        field656 = -1;
        field657 = 0;
        field658 = 50;
        field659 = 0;
        field660 = null;
        field661 = false;
        field716 = -1;
        field530 = -1;
        field664 = null;
        field665 = null;
        field667 = -1;
        field762 = new class522(8);
        field669 = 0;
        field670 = -1;
        field572 = 0;
        field672 = null;
        field680 = 0;
        field674 = 0;
        field675 = 0;
        field676 = -1;
        field593 = false;
        field678 = null;
        field679 = null;
        field643 = null;
        field681 = 0;
        field597 = 0;
        field683 = null;
        field684 = false;
        field662 = -1;
        field767 = -1;
        field605 = false;
        field636 = -1;
        field689 = -1;
        field690 = false;
        field691 = 1;
        field746 = new int[32];
        field693 = 0;
        field710 = new int[32];
        field573 = 0;
        field696 = new int[32];
        field697 = 0;
        field698 = new int[32];
        field699 = 0;
        field700 = 0;
        field504 = 0;
        field702 = 0;
        field804 = 0;
        field563 = 0;
        field752 = 0;
        field706 = 0;
        field707 = 0;
        field708 = 0;
        field709 = new class567();
        field621 = new class408();
        field801 = new class408();
        field712 = new class408();
        field713 = new class408();
        field735 = new class522(512);
        field715 = 0;
        field687 = -2;
        field717 = new boolean[100];
        field686 = new boolean[100];
        field764 = new boolean[100];
        field625 = new int[100];
        field721 = new int[100];
        field722 = new int[100];
        field723 = new int[100];
        field724 = 0;
        field725 = 0L;
        field614 = true;
        field727 = 600;
        field728 = field727 / field165;
        field688 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
        field730 = 0;
        field731 = 0;
        field732 = "";
        field759 = new long[100];
        field734 = 0;
        field748 = new class268();
        field736 = new class266();
        field737 = 0;
        field738 = new int[128];
        field652 = new int[128];
        field677 = -1L;
        field741 = new class160[4];
        field608 = new class169[4];
        field743 = -1;
        field744 = 0;
        field745 = new int[1000];
        field695 = new int[1000];
        field567 = new class563[1000];
        field542 = 0;
        field739 = 0;
        field750 = 0;
        field751 = false;
        field666 = 0;
        field753 = new int[50];
        field754 = new int[50];
        field755 = new int[50];
        field756 = new int[50];
        field757 = new int[50];
        field758 = new class40[50];
        field538 = false;
        field760 = false;
        field761 = false;
        field515 = false;
        field763 = null;
        field518 = null;
        field616 = null;
        field766 = false;
        field765 = new boolean[5];
        field509 = new int[5];
        field769 = new int[5];
        field770 = new int[5];
        field771 = new int[5];
        field772 = 256;
        field692 = 205;
        field774 = 256;
        field775 = 320;
        field547 = 1;
        field776 = 32767;
        field580 = 1;
        field779 = 32767;
        field606 = 0;
        field781 = 0;
        field782 = 0;
        field783 = 0;
        field784 = 0;
        field785 = new class358();
        field619 = -1;
        field787 = -1;
        field788 = new class507();
        field789 = new class398[8];
        field790 = new class67();
        field791 = new class463(8, class461.field4877);
        field792 = new class315(64);
        field793 = new class315(64);
        field794 = -1;
        field795 = -1;
        field796 = new ArrayList();
        field797 = new class277();
        field740 = new ArrayList(10);
        field799 = 0;
        field800 = 0;
        field742 = new class66();
        field802 = new int[50];
        field803 = new int[50];
    }

    @ObfuscatedName("jr.gr(I)Lte;")
    public static class508 method4457() {
        return Statics.field2489;
    }

    @ObfuscatedName("nk.gi(I)Ltb;")
    public static class516 method5905() {
        return Statics.field2389;
    }

    @ObfuscatedName("client.bs(B)V")
    public final void method453() {
    }

    public final void init() {
        if (!this.method465()) {
            return;
        }
        for (int var1 = 0; var1 <= 28; var1++) {
            String var2 = this.getParameter(Integer.toString(var1));
            if (var2 != null) {
                switch(var1) {
                    case 3:
                        if (var2.equalsIgnoreCase(class105.field1352)) {
                            field601 = true;
                        } else {
                            field601 = false;
                        }
                        break;
                    case 4:
                        if (field559 == -1) {
                            field559 = Integer.parseInt(var2);
                        }
                        break;
                    case 5:
                        field719 = Integer.parseInt(var2);
                        break;
                    case 6:
                        Statics.field62 = class404.method6870(Integer.parseInt(var2));
                        break;
                    case 7:
                        Statics.field3014 = class375.method1103(Integer.parseInt(var2));
                        break;
                    case 8:
                        if (var2.equalsIgnoreCase(class105.field1352)) {
                        }
                        break;
                    case 9:
                        Statics.field4741 = var2;
                        break;
                    case 10:
                        Statics.field229 = (class376) class403.method3083(class376.method184(), Integer.parseInt(var2));
                        if (Statics.field229 == class376.field4047) {
                            Statics.field848 = class526.field5252;
                        } else {
                            Statics.field848 = class526.field5258;
                        }
                        break;
                    case 11:
                        Statics.field2618 = var2;
                        break;
                    case 12:
                        field798 = Integer.parseInt(var2);
                    case 13:
                    case 16:
                    case 18:
                    case 19:
                    case 20:
                    case 23:
                    case 24:
                    default:
                        break;
                    case 14:
                        Statics.field3254 = Integer.parseInt(var2);
                        break;
                    case 15:
                        field505 = Integer.parseInt(var2);
                        break;
                    case 17:
                        Statics.field2361 = var2;
                        break;
                    case 21:
                        field571 = Integer.parseInt(var2);
                        break;
                    case 22:
                        Statics.field142 = var2;
                        break;
                    case 25:
                        int var3 = var2.indexOf(".");
                        if (var3 == -1) {
                            class547.field5372 = Integer.parseInt(var2);
                        } else {
                            class547.field5372 = Integer.parseInt(var2.substring(0, var3));
                            Integer.parseInt(var2.substring(var3 + 1));
                        }
                }
            }
        }
        method6636();
        Statics.field5054 = this.getCodeBase().getHost();
        Statics.field981 = new class390();
        String var4 = Statics.field3014.field4037;
        byte var5 = 0;
        if ((field719 & class544.field5345.method33()) != 0) {
            Statics.field2949 = "beta";
        }
        try {
            class215.method2341("oldschool", Statics.field2949, var4, var5, 23);
        } catch (Exception var7) {
            class575.method2216((String) null, var7);
        }
        Statics.field997 = this;
        Statics.field5552 = field559;
        Statics.field1467 = System.getenv("JX_ACCESS_TOKEN");
        Statics.field465 = System.getenv("JX_REFRESH_TOKEN");
        Statics.field499 = System.getenv("JX_SESSION_ID");
        Statics.field81 = System.getenv("JX_CHARACTER_ID");
        class78.method4375(System.getenv("JX_DISPLAY_NAME"));
        if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
            this.field552 = true;
        }
        if (field510 == -1) {
            if (this.method1164() || this.method1489()) {
                field510 = 5;
            } else {
                field510 = 0;
            }
        }
        this.method462(765, 503, 224, 1);
    }

    public void finalize() throws Throwable {
        class333.field3570.remove(this);
        super.finalize();
    }

    @ObfuscatedName("on.gj(I)V")
    public static final void method6636() {
        class186.field1987 = false;
        field548 = false;
    }

    @ObfuscatedName("client.gy(I)Z")
    public boolean method1162() {
        return this.field553 == 1;
    }

    public void setClient(int arg0) {
        this.field553 = arg0;
    }

    public void setOtlTokenRequester(OtlTokenRequester arg0) {
        if (arg0 != null) {
            this.field550 = arg0;
            class78.method8645(10);
        }
    }

    public void setRefreshTokenRequester(RefreshAccessTokenRequester arg0) {
        if (arg0 != null) {
            this.field555 = arg0;
        }
    }

    public boolean isOnLoginScreen() {
        return field609 == 10;
    }

    public long getAccountHash() {
        return this.field565;
    }

    @ObfuscatedName("client.gm(I)Z")
    public boolean method1164() {
        return Statics.field1467 != null && !Statics.field1467.trim().isEmpty() && Statics.field465 != null && !Statics.field465.trim().isEmpty();
    }

    @ObfuscatedName("client.gf(I)Z")
    public boolean method1489() {
        return Statics.field499 != null && !Statics.field499.trim().isEmpty() && Statics.field81 != null && !Statics.field81.trim().isEmpty();
    }

    @ObfuscatedName("client.ga(B)Z")
    public boolean method1651() {
        return this.field550 != null;
    }

    @ObfuscatedName("client.gv(Ljava/lang/String;I)V")
    public void method1496(String arg0) throws IOException {
        HashMap var2 = new HashMap();
        var2.put("grant_type", "refresh_token");
        var2.put("scope", "gamesso.token.create");
        var2.put("refresh_token", arg0);
        URL var3 = new URL(Statics.field2618 + "shield/oauth/token" + (new class497(var2)).method8187());
        class459 var4 = new class459();
        if (this.method1162()) {
            var4.method7779(field558);
        } else {
            var4.method7779(field557);
        }
        var4.method7776("Host", (new URL(Statics.field2618)).getHost());
        var4.method7783(class494.field5027);
        class10 var5 = class10.field32;
        RefreshAccessTokenRequester var6 = this.field555;
        if (var6 == null) {
            class11 var7 = new class11(var3, var5, var4, this.field552);
            this.field554 = this.field685.method154(var7);
        } else {
            this.field556 = var6.request(var5.method63(), var3, var4.method7775(), "");
        }
    }

    @ObfuscatedName("client.go(Ljava/lang/String;B)V")
    public void method1203(String arg0) throws IOException {
        URL var2 = new URL(Statics.field2618 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
        class459 var3 = new class459();
        var3.method7792(arg0);
        class10 var4 = class10.field27;
        OtlTokenRequester var5 = this.field550;
        if (var5 == null) {
            class11 var6 = new class11(var2, var4, var3, this.field552);
            this.field549 = this.field685.method154(var6);
        } else {
            this.field551 = var5.request(var4.method63(), var2, var3.method7775(), "");
        }
    }

    @ObfuscatedName("client.gc(Ljava/lang/String;Ljava/lang/String;I)V")
    public void method1169(String arg0, String arg1) throws IOException, JSONException {
        URL var3 = new URL(Statics.field142 + "game-session/v1/tokens");
        class11 var4 = new class11(var3, class10.field32, this.field552);
        var4.method76().method7792(arg0);
        var4.method76().method7783(class494.field5027);
        JSONObject var5 = new JSONObject();
        var5.put("accountId", (Object) arg1);
        var4.method77(new class496(var5));
        this.field549 = this.field685.method154(var4);
    }

    @ObfuscatedName("client.bp(I)V")
    public final void method477() {
        class451.method2914(new int[] { 20, 260, 10000 }, new int[] { 1000, 100, 500 });
        Statics.field4408 = class545.method7767(field719, class544.field5345);
        Statics.field300 = field505 == 0 ? 43594 : field798 + 40000;
        Statics.field2679 = field505 == 0 ? 443 : field798 + 50000;
        Statics.field2457 = Statics.field300;
        Statics.field5461 = class360.field3788;
        Statics.field2554 = class360.field3789;
        Statics.field5064 = class360.field3790;
        Statics.field1391 = class360.field3795;
        Statics.field96 = new class118(this.field552, 224);
        this.method454();
        this.method457();
        Statics.field3373 = this.method451();
        this.method499(field736, 0);
        this.method499(field748, 1);
        this.method539();
        Statics.field1101 = new class484(255, class215.field2356, class215.field2350, 500000);
        Statics.field1385 = class101.method1130();
        class32.method8658(this, Statics.field187);
        method4628(Statics.field1385.method2539());
        Statics.field3011 = new class71(Statics.field848);
        this.field685 = new class15("tokenRequest", 1, 1);
        class333.method1936(this);
        field797.method5058();
    }

    @ObfuscatedName("ia.gt(I)Lkk;")
    public static class268 method4380() {
        return field748;
    }

    @ObfuscatedName("client.br(I)V")
    public final void method478() {
        field519++;
        this.method1234();
        while (true) {
            class408 var1 = class385.field4445;
            class384 var2;
            synchronized (class385.field4445) {
                var2 = (class384) class385.field4440.method6916();
            }
            if (var2 == null) {
                boolean var4 = false;
                boolean var5 = false;
                if (!class333.field3567.isEmpty()) {
                    class446 var6 = (class446) class333.field3567.get(0);
                    if (var6 == null) {
                        class333.field3567.remove(0);
                    } else if (var6.method7665()) {
                        if (var6.method7668()) {
                            System.out.println("Error in midimanager.service: " + var6.method7673());
                            var4 = true;
                        } else {
                            if (var6.method7674() != null) {
                                class333.field3567.add(1, var6.method7674());
                            }
                            var5 = var6.method7669();
                        }
                        class333.field3567.remove(0);
                    } else {
                        var5 = var6.method7669();
                    }
                }
                if (var4) {
                    class333.field3567.clear();
                    class333.method5097();
                }
                if (var5 && field751 && Statics.field1548 != null) {
                    Statics.field1548.method746();
                }
                method3185();
                field748.method4944();
                this.method455();
                class36.method2888();
                if (Statics.field3373 != null) {
                    int var9 = Statics.field3373.method277();
                    field708 = var9;
                }
                if (field609 == 0) {
                    method34();
                    class35.method2926();
                } else if (field609 == 5) {
                    class78.method6550(this, Statics.field2096, Statics.field4572);
                    method34();
                    class35.method2926();
                } else if (field609 == 10 || field609 == 11) {
                    class78.method6550(this, Statics.field2096, Statics.field4572);
                } else if (field609 == 20) {
                    class78.method6550(this, Statics.field2096, Statics.field4572);
                    this.method1173();
                } else if (field609 == 50) {
                    class78.method6550(this, Statics.field2096, Statics.field4572);
                    this.method1173();
                } else if (field609 == 25) {
                    if (field513) {
                        method823();
                    }
                    if (field514) {
                        method8493(Statics.field37);
                    }
                    if (!field514 && !field513) {
                        method2936(30);
                    }
                }
                if (field609 == 30) {
                    this.method1729();
                } else if (field609 == 40 || field609 == 45) {
                    this.method1173();
                }
                return;
            }
            var2.field4436.method6610(var2.field4438, (int) var2.field5075, var2.field4435, false);
        }
    }

    @ObfuscatedName("client.bf(ZI)V")
    public final void method479(boolean arg0) {
        if ((field609 == 10 || field609 == 20 || field609 == 30) && field725 != 0L && class329.method5009() > field725) {
            method4628(method3176());
        }
        if (arg0) {
            for (int var2 = 0; var2 < 100; var2++) {
                field717[var2] = true;
            }
        }
        if (field609 == 0) {
            this.method481(class78.field913, class78.field914, arg0, Statics.field1719);
        } else if (field609 == 5) {
            class78.method285(Statics.field3034, Statics.field2096, Statics.field4572);
        } else if (field609 == 10 || field609 == 11) {
            class78.method285(Statics.field3034, Statics.field2096, Statics.field4572);
        } else if (field609 == 20) {
            class78.method285(Statics.field3034, Statics.field2096, Statics.field4572);
        } else if (field609 == 50) {
            class78.method285(Statics.field3034, Statics.field2096, Statics.field4572);
        } else if (field609 == 25) {
            if (field705 == 1) {
                if (field574 > field575) {
                    field575 = field574;
                }
                int var3 = (field575 * 50 - field574 * 50) / field575;
                method4507(class380.field4239 + class105.field1353 + class105.field1355 + var3 + "%" + class105.field1351, false);
            } else if (field705 == 2) {
                if (field576 > field786) {
                    field786 = field576;
                }
                int var4 = (field786 * 50 - field576 * 50) / field786 + 50;
                method4507(class380.field4239 + class105.field1353 + class105.field1355 + var4 + "%" + class105.field1351, false);
            } else {
                method4507(class380.field4239, false);
            }
        } else if (field609 == 30) {
            this.method1178();
        } else if (field609 == 40) {
            method4507(class380.field4101 + class105.field1353 + class380.field4088, false);
        } else if (field609 == 45) {
            method4507(class380.field4263, false);
        }
        if (field609 == 30 && field724 == 0 && !arg0 && !field614) {
            for (int var5 = 0; var5 < field715; var5++) {
                if (field686[var5]) {
                    Statics.field3197.method426(field625[var5], field721[var5], field722[var5], field723[var5]);
                    field686[var5] = false;
                }
            }
        } else if (field609 > 0) {
            Statics.field3197.method435(0, 0);
            for (int var6 = 0; var6 < field715; var6++) {
                field686[var6] = false;
            }
        }
    }

    @ObfuscatedName("client.bq(B)V")
    public final void method557() {
        if (Statics.field2734 != null && Statics.field2734.method2775()) {
            Statics.field2734.method2772();
        }
        if (Statics.field4911 != null) {
            Statics.field4911.field1083 = false;
        }
        Statics.field4911 = null;
        field569.method2831();
        class36.method5600();
        Statics.field3373 = null;
        if (Statics.field1548 != null) {
            Statics.field1548.method775();
        }
        Statics.field981.method6739();
        class385.method3329();
        if (Statics.field96 != null) {
            Statics.field96.method2857();
            Statics.field96 = null;
        }
        class215.method4055();
        this.field685.method157();
    }

    @ObfuscatedName("kp.hh(I)V")
    public static void method5036() {
        field517 = true;
        if (Statics.field2734 != null && Statics.field2734.method2775()) {
            Statics.field2734.method2772();
        }
        method5870();
        method5093();
        if (Statics.field4911 != null) {
            Statics.field4911.field1083 = false;
        }
        Statics.field4911 = null;
        field569.method2831();
        if (Statics.field163 != null) {
            try {
                Statics.field163.method4198();
            } catch (Exception var4) {
            }
        }
        Statics.field163 = null;
        method3334();
        method2177();
        if (Statics.field3543 != null) {
            Statics.field3543.method2616();
            for (int var1 = 0; var1 < 4; var1++) {
                if (Statics.field3543.field1305[var1] != null) {
                    Statics.field3543.field1305[var1].method4986();
                }
            }
        }
        Statics.field2389 = null;
        Statics.method2347(0, 0);
        class333.method3178();
        field751 = false;
        class72.method5455();
        if (Statics.field1548 != null) {
            Statics.field1548.method775();
        }
        Statics.field981.method6739();
        class385.method3329();
        if (Statics.field96 != null) {
            Statics.field96.method2857();
        }
        class215.method4055();
        class215.field2356 = null;
        class215.field2350 = null;
        Statics.field1044 = null;
        class217.method796();
        Statics.field1101 = null;
        field740.clear();
        field800 = 0;
        Statics.field981 = new class390();
        Statics.field96 = new class118(Statics.field997.field552, 224);
        try {
            class215.method2341("oldschool", Statics.field2949, Statics.field3014.field4037, 0, 23);
        } catch (IOException var3) {
            throw new RuntimeException(var3);
        }
        Statics.field1101 = new class484(255, class215.field2356, class215.field2350, 500000);
        Statics.field163 = new class213();
        Statics.field997.method467();
        method6560(class95.field1143);
        method2936(0);
    }

    @ObfuscatedName("dv.hy(I)V")
    public static void method2177() {
        Statics.field3672 = null;
        Statics.field2362 = null;
        Statics.field4977 = null;
        Statics.field980 = null;
        Statics.field2249 = null;
        Statics.field2373 = null;
        Statics.field1386 = null;
        Statics.field3687 = null;
        Statics.field2961 = null;
        Statics.field1509 = null;
        Statics.field5282 = null;
    }

    @ObfuscatedName("ey.hq(IB)V")
    public static void method2936(int arg0) {
        if (field609 == arg0) {
            return;
        }
        if (field609 == 30) {
            field736.method4931();
        }
        if (field609 == 0) {
            Statics.field997.method482();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45 || arg0 == 50) {
            method792(class69.field496);
            field544 = 0;
            field543 = 0;
            field703.method7763(arg0);
            if (arg0 != 20) {
                field545 = Statics.field1385.method2527(class78.field923) ? class145.field1653 : class145.field1654;
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field1092 != null) {
            Statics.field1092.method8069();
            Statics.field1092 = null;
        }
        if (field609 == 25) {
            field705 = 0;
            field574 = 0;
            field575 = 1;
            field576 = 0;
            field786 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            int var2 = method2289() ? 0 : 12;
            class78.method3284(Statics.field221, Statics.field408, true, var2);
        } else if (arg0 == 20) {
            int var1 = field609 == 11 ? 4 : 0;
            class78.method3284(Statics.field221, Statics.field408, false, var1);
        } else if (arg0 == 11) {
            class78.method3284(Statics.field221, Statics.field408, false, 4);
        } else if (arg0 == 50) {
            class78.method2997("", "Updating date of birth...", "");
            class78.method3284(Statics.field221, Statics.field408, false, 7);
        } else if (arg0 != 0) {
            class78.method2883();
        }
        field609 = arg0;
    }

    @ObfuscatedName("client.hf(B)V")
    public void method1234() {
        if (field609 != 1000) {
            boolean var1 = Statics.field981.method6730();
            if (!var1) {
                this.method1484();
            }
        }
    }

    @ObfuscatedName("client.hn(I)V")
    public void method1484() {
        if (Statics.field981.field4535 >= 4) {
            this.method486("js5crc");
            method2936(1000);
            return;
        }
        if (Statics.field981.field4538 >= 4) {
            if (field609 <= 5) {
                this.method486("js5io");
                method2936(1000);
                return;
            }
            field540 = 3000;
            Statics.field981.field4538 = 3;
        }
        if (--field540 + 1 > 0) {
            return;
        }
        try {
            if (field539 == 0) {
                Statics.field4033 = Statics.field163.method4200(Statics.field5054, Statics.field2457);
                field539++;
            }
            if (field539 == 1) {
                if (Statics.field4033.field2395 == 2) {
                    this.method1172(-1);
                    return;
                }
                if (Statics.field4033.field2395 == 1) {
                    field539++;
                }
            }
            if (field539 == 2) {
                Socket var1 = (Socket) Statics.field4033.field2393;
                class481 var2 = new class481(var1, 40000, 5000);
                Statics.field412 = var2;
                if (class547.field5372 >= 223) {
                    class549 var3 = new class549(class326.field3531.field3529 + 1);
                    var3.method8781(class326.field3531.field3526);
                    var3.method9045(224);
                    var3.method9045(field533[0]);
                    var3.method9045(field533[1]);
                    var3.method9045(field533[2]);
                    var3.method9045(field533[3]);
                    Statics.field412.method8068(var3.field5381, 0, class326.field3531.field3529 + 1);
                } else {
                    class549 var4 = new class549(5);
                    var4.method8781(class326.field3531.field3526);
                    var4.method9045(224);
                    Statics.field412.method8068(var4.field5381, 0, 5);
                }
                field539++;
                Statics.field1034 = class329.method5009();
            }
            if (field539 == 3) {
                if (Statics.field412.method8079() > 0) {
                    int var5 = Statics.field412.method8066();
                    if (var5 != 0) {
                        this.method1172(var5);
                        return;
                    }
                    field539++;
                } else if (class329.method5009() - Statics.field1034 > 30000L) {
                    this.method1172(-2);
                    return;
                }
            }
            if (field539 == 4) {
                Statics.field981.method6732(Statics.field412, field609 > 20);
                Statics.field4033 = null;
                Statics.field412 = null;
                field539 = 0;
                field541 = 0;
            }
        } catch (IOException var7) {
            this.method1172(-3);
        }
    }

    @ObfuscatedName("client.hx(II)V")
    public void method1172(int arg0) {
        Statics.field4033 = null;
        Statics.field412 = null;
        field539 = 0;
        if (Statics.field300 == Statics.field2457) {
            Statics.field2457 = Statics.field2679;
        } else {
            Statics.field2457 = Statics.field300;
        }
        field541++;
        if (field541 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field609 <= 5) {
                this.method486("js5connect_full");
                method2936(1000);
            } else {
                field540 = 3000;
            }
        } else if (field541 >= 2 && arg0 == 6) {
            this.method486("js5connect_outofdate");
            method2936(1000);
        } else if (field541 >= 4) {
            if (field609 <= 5) {
                this.method486("js5connect");
                method2936(1000);
            } else {
                field540 = 3000;
            }
        }
    }

    @ObfuscatedName("fn.hs(Loj;Ljava/lang/String;B)V")
    public static void method2996(class386 arg0, String arg1) {
        class86 var2 = new class86(arg0, arg1);
        field740.add(var2);
        field800 += var2.field1035;
    }

    @ObfuscatedName("lt.ha(I)I")
    public static int method5468() {
        if (field740 == null || field799 >= field740.size()) {
            return 10000;
        }
        int var0 = 0;
        for (int var1 = 0; var1 <= field799; var1++) {
            var0 += ((class86) field740.get(var1)).field1037;
        }
        return var0 * 10000 / field800;
    }

    @ObfuscatedName("am.hp(B)V")
    public static void method34() {
        if (field780 == class95.field1143) {
            Statics.field975 = method5554(class387.field4468.field4470, false, true, true, false);
            Statics.field156 = method5554(class387.field4477.field4470, true, true, true, false);
            Statics.field408 = method5554(class387.field4479.field4470, false, true, true, false);
            Statics.field221 = method5554(class387.field4474.field4470, false, true, true, false);
            Statics.field1225 = method5554(class387.field4472.field4470, true, false, true, false);
            Statics.field4679 = method5554(class387.field4478.field4470, false, true, true, false);
            Statics.field1797 = method5554(class387.field4484.field4470, false, true, true, false);
            class78.method5603(20, class380.field4104);
            method6560(class95.field1145);
        } else if (field780 == class95.field1145) {
            byte var0 = 0;
            int var1 = var0 + Statics.field975.method6588() * 53 / 100;
            int var2 = var1 + Statics.field156.method6588() * 5 / 100;
            int var3 = var2 + Statics.field408.method6588() * 36 / 100;
            int var4 = var3 + Statics.field221.method6588() / 100;
            int var5 = var4 + Statics.field1225.method6588() / 100;
            int var6 = var5 + Statics.field4679.method6588() * 3 / 100;
            int var7 = var6 + Statics.field1797.method6588() / 100;
            if (var7 == 100) {
                method2996(Statics.field975, "Sound FX");
                method2996(Statics.field156, "Music Tracks");
                method2996(Statics.field408, "Sprites");
                method2996(Statics.field4679, "Music Samples");
                method2996(Statics.field1797, "Music Patches");
                class78.method5603(40, class380.field4106);
                method6560(class95.field1147);
            } else if (var7 != 0) {
                class78.method5603(30, class380.field4105 + var7 + "%");
            }
        } else if (field780 == class95.field1147) {
            class43.method5626(22050, !field548, 2);
            ArrayList var8 = new ArrayList(3);
            Statics.field1548 = class43.method3327(Statics.field163, 0, 2048);
            Statics.field445 = new class39();
            class39 var9 = new class39();
            var9.method675(Statics.field445);
            for (int var10 = 0; var10 < 3; var10++) {
                class334 var11 = new class334(Statics.field1548);
                var11.method5702(9, 128);
                var9.method675(var11);
                var8.add(var11);
            }
            Statics.field1548.method760(var9);
            class386 var12 = Statics.field1797;
            class386 var13 = Statics.field4679;
            class386 var14 = Statics.field975;
            Statics.field3120 = var12;
            Statics.field2461 = var13;
            Statics.field3573 = var14;
            class333.field3563 = var8;
            Statics.field3668 = new class58(22050, Statics.field5137);
            class78.method5603(60, class380.field4389);
            method6560(class95.field1148);
        } else if (field780 == class95.field1148) {
            if (Statics.field4874 == null) {
                Statics.field4874 = new class517(Statics.field408, Statics.field1225);
            }
            class518[] var15 = new class518[] { class518.field5223, class518.field5226, class518.field5219, class518.field5220, class518.field5221, class518.field5218 };
            int var16 = var15.length;
            class517 var17 = Statics.field4874;
            class518[] var18 = new class518[] { class518.field5223, class518.field5226, class518.field5219, class518.field5220, class518.field5221, class518.field5218 };
            field749 = var17.method8490(var18);
            if (field749.size() < var16) {
                class78.method5603(80, class380.field4108 + field749.size() * 100 / var16 + "%");
            } else {
                Statics.field2096 = (class433) field749.get(class518.field5221);
                Statics.field4572 = (class433) field749.get(class518.field5218);
                Statics.field3034 = (class433) field749.get(class518.field5220);
                Statics.field2489 = field788.method8226();
                class78.method5603(80, class380.field4148);
                method6560(class95.field1149);
            }
        } else if (field780 == class95.field1149) {
            class386 var19 = Statics.field221;
            class386 var20 = Statics.field408;
            int var21 = 0;
            String[] var22 = class78.field936;
            for (int var23 = 0; var23 < var22.length; var23++) {
                String var24 = var22[var23];
                if (var19.method6658(var24, "")) {
                    var21++;
                }
            }
            String[] var25 = class78.field941;
            for (int var26 = 0; var26 < var25.length; var26++) {
                String var27 = var25[var26];
                if (var20.method6658(var27, "")) {
                    var21++;
                }
            }
            String[] var28 = class78.field924;
            for (int var29 = 0; var29 < var28.length; var29++) {
                String var30 = var28[var29];
                if (var20.method6654(var30) != -1 && var20.method6658(var30, "")) {
                    var21++;
                }
            }
            class386 var33 = Statics.field408;
            int var34 = class78.field941.length + class78.field936.length;
            String[] var35 = class78.field924;
            for (int var36 = 0; var36 < var35.length; var36++) {
                String var37 = var35[var36];
                if (var33.method6654(var37) != -1) {
                    var34++;
                }
            }
            if (var21 < var34) {
                class78.method5603(90, class380.field4110 + var21 * 100 / var34 + "%");
            } else {
                class78.method5603(100, class380.field4111);
                if (Statics.field4408) {
                    method2936(5);
                    method6560(class95.field1156);
                } else {
                    method6560(class95.field1144);
                }
            }
        } else if (field780 == class95.field1156) {
            method2936(10);
        } else if (field780 == class95.field1144) {
            Statics.field1306 = method5554(class387.field4464.field4470, false, true, true, false);
            Statics.field1282 = method5554(class387.field4463.field4470, false, true, true, false);
            Statics.field290 = method5554(class387.field4466.field4470, true, false, true, false);
            Statics.field413 = method5554(class387.field4467.field4470, false, true, true, false);
            Statics.field1298 = method5554(class387.field4469.field4470, true, true, true, false);
            Statics.field101 = method5554(class387.field4471.field4470, false, true, true, false);
            Statics.field1937 = method5554(class387.field4465.field4470, false, true, true, false);
            Statics.field2112 = method5554(class387.field4475.field4470, false, true, true, false);
            Statics.field63 = method5554(class387.field4476.field4470, false, true, true, false);
            Statics.field3332 = method5554(class387.field4480.field4470, true, true, true, false);
            Statics.field153 = method5554(class387.field4481.field4470, false, true, true, false);
            Statics.field2681 = method5554(class387.field4482.field4470, false, true, true, false);
            Statics.field4910 = method5554(class387.field4483.field4470, false, true, true, false);
            Statics.field2638 = method5554(class387.field4473.field4470, false, true, true, false);
            Statics.field12 = method273(class387.field4485.field4470, false, true, true, true, true);
            class78.method5603(20, class380.field4104);
            method6560(class95.field1146);
        } else if (field780 == class95.field1146) {
            byte var40 = 0;
            int var41 = var40 + Statics.field1306.method6588() * 5 / 100;
            int var42 = var41 + Statics.field1282.method6588() * 2 / 100;
            int var43 = var42 + Statics.field290.method6588() / 100;
            int var44 = var43 + Statics.field413.method6588() / 100;
            int var45 = var44 + Statics.field1298.method6588() * 10 / 100;
            int var46 = var45 + Statics.field101.method6588() * 65 / 100;
            int var47 = var46 + Statics.field1937.method6588() / 100;
            int var48 = var47 + Statics.field2112.method6588() / 100;
            int var49 = var48 + Statics.field63.method6588() * 6 / 100;
            int var50 = var49 + Statics.field2681.method6588() / 100;
            int var51 = var50 + Statics.field153.method6588() * 2 / 100;
            int var52 = var51 + Statics.field4910.method6588() * 2 / 100;
            int var53 = var52 + Statics.field2638.method6588() / 100;
            int var54 = var53 + Statics.field12.method6588() / 100;
            int var55 = var54 + (Statics.field3332.method6587() && Statics.field3332.method6652() ? 1 : 0);
            if (var55 == 100) {
                method2996(Statics.field1306, "Animations");
                method2996(Statics.field1282, "Skeletons");
                method2996(Statics.field1298, "Maps");
                method2996(Statics.field101, "Models");
                method2996(Statics.field2112, "Music Jingles");
                method2996(Statics.field2681, "World Map");
                method2996(Statics.field153, "World Map Geography");
                method2996(Statics.field4910, "World Map Ground");
                Statics.field3004 = new class486();
                Statics.field3004.method8131(Statics.field3332);
                class78.method5603(30, class380.field4106);
                method6560(class95.field1154);
            } else if (var55 != 0) {
                class78.method5603(30, class380.field4105 + var55 + "%");
            }
        } else if (field780 == class95.field1154) {
            Statics.field4799 = new class102(-1, 104, 104, Statics.field1385.method2604(), class174.field1825);
            Statics.field3543 = Statics.field4799;
            Statics.field1097 = new class563(512, 512);
            class78.method5603(30, class380.field4103);
            method6560(class95.field1150);
        } else if (field780 == class95.field1150) {
            if (!Statics.field290.method6652()) {
                class78.method5603(40, class380.field4159 + Statics.field290.method6626() + "%");
            } else if (Statics.field2638.method6652()) {
                class386 var56 = Statics.field290;
                Statics.field2849 = var56;
                class386 var57 = Statics.field290;
                Statics.field2664 = var57;
                class237.method10(Statics.field290, Statics.field101);
                class261.method6879(Statics.field290, Statics.field101, field548);
                class386 var58 = Statics.field290;
                class386 var59 = Statics.field101;
                Statics.field2565 = var58;
                Statics.field2576 = var59;
                class386 var60 = Statics.field290;
                Statics.field4544 = var60;
                class262.method79(Statics.field290, Statics.field101, field601, Statics.field2096);
                class386 var61 = Statics.field290;
                class386 var62 = Statics.field1306;
                class386 var63 = Statics.field1282;
                Statics.field5305 = var61;
                Statics.field2864 = var62;
                Statics.field1781 = var63;
                class386 var64 = Statics.field290;
                class386 var65 = Statics.field101;
                Statics.field2645 = var64;
                Statics.field2659 = var65;
                class386 var66 = Statics.field290;
                Statics.field2682 = var66;
                class386 var67 = Statics.field290;
                Statics.field2456 = var67;
                Statics.field2454 = Statics.field2456.method6685(16);
                Statics.field2667 = new class352(Statics.field413, Statics.field101, Statics.field408, Statics.field1225, Statics.field12);
                class386 var68 = Statics.field290;
                Statics.field2439 = var68;
                class386 var69 = Statics.field290;
                Statics.field4573 = var69;
                class386 var70 = Statics.field290;
                Statics.field2494 = var70;
                class253.method3081(Statics.field290);
                class257.method4456(Statics.field290);
                class386 var71 = Statics.field290;
                Statics.field5308 = var71;
                class386 var72 = Statics.field290;
                Statics.field5322 = var72;
                Statics.field3 = new class531(Statics.field229, 54, Statics.field62, Statics.field290);
                Statics.field4035 = new class531(Statics.field229, 47, Statics.field62, Statics.field290);
                Statics.field2734 = new class113();
                class386 var73 = Statics.field290;
                class386 var74 = Statics.field408;
                class386 var75 = Statics.field1225;
                Statics.field2708 = var73;
                Statics.field1625 = var74;
                Statics.field2703 = var75;
                class386 var76 = Statics.field290;
                class386 var77 = Statics.field408;
                Statics.field2511 = var76;
                Statics.field2519 = var77;
                class235.method3828(Statics.field290, Statics.field408);
                class78.method5603(50, class380.field4222);
                method6560(class95.field1151);
            } else {
                class78.method5603(40, class380.field4159 + (80 + Statics.field63.method6626() / 6) + "%");
            }
        } else if (field780 == class95.field1151) {
            int var78 = 0;
            if (Statics.field3672 == null) {
                Statics.field3672 = class564.method3898(Statics.field408, Statics.field3004.field5006, 0);
            } else {
                var78++;
            }
            if (Statics.field2362 == null) {
                Statics.field2362 = class564.method3898(Statics.field408, Statics.field3004.field4997, 0);
            } else {
                var78++;
            }
            if (Statics.field4977 == null) {
                Statics.field4977 = class564.method2310(Statics.field408, Statics.field3004.field4998, 0);
            } else {
                var78++;
            }
            if (Statics.field980 == null) {
                Statics.field980 = class564.method7766(Statics.field408, Statics.field3004.field4999, 0);
            } else {
                var78++;
            }
            if (Statics.field2249 == null) {
                Statics.field2249 = class564.method7766(Statics.field408, Statics.field3004.field4996, 0);
            } else {
                var78++;
            }
            if (Statics.field2373 == null) {
                Statics.field2373 = class564.method7766(Statics.field408, Statics.field3004.field5001, 0);
            } else {
                var78++;
            }
            if (Statics.field1386 == null) {
                Statics.field1386 = class564.method7766(Statics.field408, Statics.field3004.field5000, 0);
            } else {
                var78++;
            }
            if (Statics.field3687 == null) {
                Statics.field3687 = class564.method7766(Statics.field408, Statics.field3004.field5003, 0);
            } else {
                var78++;
            }
            if (Statics.field2961 == null) {
                Statics.field2961 = class564.method7766(Statics.field408, Statics.field3004.field5004, 0);
            } else {
                var78++;
            }
            if (Statics.field1509 == null) {
                Statics.field1509 = class564.method2310(Statics.field408, Statics.field3004.field5002, 0);
            } else {
                var78++;
            }
            if (Statics.field5282 == null) {
                Statics.field5282 = class564.method2310(Statics.field408, Statics.field3004.field5005, 0);
            } else {
                var78++;
            }
            if (var78 < 11) {
                class78.method5603(70, class380.field4114 + var78 * 100 / 12 + "%");
            } else {
                Statics.field4753 = Statics.field5282;
                Statics.field2362.method9300();
                int var79 = (int) (Math.random() * 21.0D) - 10;
                int var80 = (int) (Math.random() * 21.0D) - 10;
                int var81 = (int) (Math.random() * 21.0D) - 10;
                int var82 = (int) (Math.random() * 41.0D) - 20;
                Statics.field4977[0].method9219(var79 + var82, var80 + var82, var81 + var82);
                class78.method5603(60, class380.field4275);
                method6560(class95.field1152);
            }
        } else if (field780 == class95.field1152) {
            if (Statics.field1937.method6652()) {
                Statics.field3727 = new class193(Statics.field1937, Statics.field408, 20, Statics.field1385.method2513(), field548 ? 64 : 128);
                class181.method3460(Statics.field3727);
                class181.method3439(Statics.field1385.method2513());
                method6560(class95.field1153);
            } else {
                class78.method5603(70, class380.field4116 + "0%");
            }
        } else if (field780 == class95.field1153) {
            int var83 = Statics.field3727.method3863();
            if (var83 < 100) {
                class78.method5603(80, class380.field4116 + var83 + "%");
            } else {
                class78.method5603(90, class380.field4328);
                method6560(class95.field1157);
            }
        } else if (field780 == class95.field1157) {
            Statics.field4911 = new class91();
            Statics.field163.method4201(Statics.field4911, 10);
            class78.method5603(92, class380.field4118);
            method6560(class95.field1158);
        } else if (field780 == class95.field1158) {
            if (Statics.field221.method6658("huffman", "")) {
                class363 var84 = new class363(Statics.field221.method6657("huffman", ""));
                Statics.field3966 = var84;
                class78.method5603(94, class380.field4120);
                method6560(class95.field1155);
            } else {
                class78.method5603(94, class380.field4119 + "%");
            }
        } else if (field780 == class95.field1155) {
            if (!Statics.field413.method6652()) {
                class78.method5603(96, class380.field4121 + Statics.field413.method6626() * 4 / 5 + "%");
            } else if (!Statics.field12.method6652()) {
                class78.method5603(96, class380.field4121 + Statics.field12.method6626() * 4 / 5 + "%");
            } else if (!Statics.field63.method6652()) {
                class78.method5603(96, class380.field4121 + (80 + Statics.field63.method6626() / 6) + "%");
            } else if (Statics.field1225.method6652()) {
                class78.method5603(98, class380.field4215);
                if (Statics.field63.method6728("version.dat", "")) {
                    class549 var85 = new class549(Statics.field63.method6657("version.dat", ""));
                    var85.method8968();
                }
                method6560(class95.field1142);
            } else {
                class78.method5603(96, class380.field4121 + (96 + Statics.field1225.method6626() / 50) + "%");
            }
        } else if (field780 == class95.field1142) {
            if (Statics.field2681.method6649() <= 0 || Statics.field2681.method6662(class303.field3215.field3217)) {
                if (Statics.field2389 == null) {
                    Statics.field2389 = new class516();
                    Statics.field2389.method8293(Statics.field2681, Statics.field153, Statics.field4910, Statics.field3034, field749, Statics.field4977);
                }
                class78.method5603(100, class380.field4087);
                if (Statics.field4408) {
                    method6560(class95.field1159);
                } else {
                    method6560(class95.field1156);
                }
                field517 = false;
            } else {
                class78.method5603(100, class380.field4100 + Statics.field2681.method6661(class303.field3215.field3217) / 10 + "%");
            }
        } else if (field780 == class95.field1159) {
            Statics.field1719 = false;
            method2936(20);
            method792(class69.field498);
        }
    }

    @ObfuscatedName("oz.ho(Ldq;I)V")
    public static void method6560(class95 arg0) {
        if (field780 != arg0) {
            field780 = arg0;
        }
    }

    @ObfuscatedName("lm.hm(IZZZZB)Loj;")
    public static class386 method5554(int arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        class484 var5 = null;
        if (class215.field2356 != null) {
            var5 = new class484(arg0, class215.field2356, Statics.field1044[arg0], 1000000);
        }
        return new class386(var5, Statics.field1101, Statics.field981, arg0, arg1, arg2, arg3, arg4, false);
    }

    @ObfuscatedName("ar.hb(IZZZZZB)Loj;")
    public static class386 method273(int arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5) {
        class484 var6 = null;
        if (class215.field2356 != null) {
            var6 = new class484(arg0, class215.field2356, Statics.field1044[arg0], 1000000);
        }
        return new class386(var6, Statics.field1101, Statics.field981, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("client.hc(I)V")
    public final void method1173() {
        class480 var1 = field569.method2833();
        class548 var2 = field569.field1450;
        try {
            if (Statics.field157 == class69.field496) {
                if (Statics.field3045 == null && (field561.method2195() || field544 > 250)) {
                    Statics.field3045 = field561.method2191();
                    field561.method2189();
                    field561 = null;
                }
                if (Statics.field3045 != null) {
                    if (var1 != null) {
                        var1.method8069();
                        var1 = null;
                    }
                    Statics.field4814 = null;
                    field671 = false;
                    field544 = 0;
                    if (!field546.method9092()) {
                        method792(class69.field475);
                    } else if (this.method1164()) {
                        try {
                            this.method1496(Statics.field465);
                            method792(class69.field500);
                        } catch (Throwable var71) {
                            class575.method2216((String) null, var71);
                            method3187(65);
                            return;
                        }
                    } else if (this.method1489()) {
                        try {
                            this.method1169(Statics.field499, Statics.field81);
                            method792(class69.field495);
                        } catch (Exception var70) {
                            class575.method2216((String) null, var70);
                            method3187(65);
                            return;
                        }
                    } else {
                        method3187(65);
                        return;
                    }
                }
            }
            if (Statics.field157 == class69.field500) {
                if (this.field556 == null) {
                    if (this.field554 == null) {
                        method3187(65);
                        return;
                    }
                    if (!this.field554.method247()) {
                        return;
                    }
                    if (this.field554.method244()) {
                        class575.method2216(this.field554.method243(), (Throwable) null);
                        method3187(65);
                        this.field554 = null;
                        return;
                    }
                    class21 var7 = this.field554.method246();
                    if (var7.method266() != 200) {
                        method3187(65);
                        this.field554 = null;
                        return;
                    }
                    field544 = 0;
                    class496 var8 = new class496(var7.method268());
                    try {
                        Statics.field1467 = var8.method8182().getString("access_token");
                        Statics.field465 = var8.method8182().getString("refresh_token");
                    } catch (Exception var68) {
                        class575.method2216("Error parsing tokens", var68);
                        method3187(65);
                        this.field554 = null;
                        return;
                    }
                } else if (this.field556.isDone()) {
                    if (this.field556.isCancelled()) {
                        method3187(65);
                        this.field556 = null;
                        return;
                    }
                    try {
                        RefreshAccessTokenResponse var5 = (RefreshAccessTokenResponse) this.field556.get();
                        if (!var5.isSuccess()) {
                            method3187(65);
                            this.field556 = null;
                            return;
                        }
                        Statics.field1467 = var5.getAccessToken();
                        Statics.field465 = var5.getRefreshToken();
                        this.field556 = null;
                    } catch (Exception var69) {
                        class575.method2216((String) null, var69);
                        method3187(65);
                        this.field556 = null;
                        return;
                    }
                } else {
                    return;
                }
                this.method1203(Statics.field1467);
                method792(class69.field495);
            }
            if (Statics.field157 == class69.field495) {
                if (this.field551 == null) {
                    if (this.field549 == null) {
                        method3187(65);
                        return;
                    }
                    if (!this.field549.method247()) {
                        return;
                    }
                    if (this.field549.method244()) {
                        class575.method2216(this.field549.method243(), (Throwable) null);
                        method3187(65);
                        this.field549 = null;
                        return;
                    }
                    class21 var12 = this.field549.method246();
                    if (var12.method266() != 200) {
                        class575.method2216("Response code: " + var12.method266() + "Response body: " + var12.method268(), (Throwable) null);
                        method3187(65);
                        this.field549 = null;
                        return;
                    }
                    List var13 = (List) var12.method267().get("Content-Type");
                    if (var13 != null && var13.contains(class494.field5027.method8171())) {
                        try {
                            JSONObject var14 = new JSONObject(var12.method268());
                            this.field579 = var14.getString("token");
                        } catch (JSONException var66) {
                            class575.method2216((String) null, var66);
                            method3187(65);
                            this.field549 = null;
                            return;
                        }
                    } else {
                        this.field579 = var12.method268();
                    }
                    this.field549 = null;
                } else if (this.field551.isDone()) {
                    if (this.field551.isCancelled()) {
                        method3187(65);
                        this.field551 = null;
                        return;
                    }
                    try {
                        OtlTokenResponse var10 = (OtlTokenResponse) this.field551.get();
                        if (!var10.isSuccess()) {
                            method3187(65);
                            this.field551 = null;
                            return;
                        }
                        this.field579 = var10.getToken();
                        this.field551 = null;
                    } catch (Exception var67) {
                        class575.method2216((String) null, var67);
                        method3187(65);
                        this.field551 = null;
                        return;
                    }
                } else {
                    return;
                }
                field544 = 0;
                method792(class69.field475);
            }
            if (Statics.field157 == class69.field475) {
                if (Statics.field4814 == null) {
                    Statics.field4814 = Statics.field163.method4200(Statics.field5054, Statics.field2457);
                }
                if (Statics.field4814.field2395 == 2) {
                    throw new IOException();
                }
                if (Statics.field4814.field2395 == 1) {
                    Socket var16 = (Socket) Statics.field4814.field2393;
                    class481 var17 = new class481(var16, 40000, 5000);
                    var1 = var17;
                    field569.method2830(var17);
                    Statics.field4814 = null;
                    method792(class69.field476);
                }
            }
            if (Statics.field157 == class69.field476) {
                field569.method2846();
                class324 var18 = class324.method2337();
                var18.field3375 = null;
                var18.field3378 = 0;
                var18.field3379 = new class548(5000);
                var18.field3379.method8781(class326.field3523.field3526);
                field569.method2829(var18);
                field569.method2828();
                var2.field5378 = 0;
                method792(class69.field477);
            }
            if (Statics.field157 == class69.field477) {
                if (Statics.field1548 != null) {
                    Statics.field1548.method745();
                }
                if (var1.method8070(1)) {
                    int var21 = var1.method8066();
                    if (Statics.field1548 != null) {
                        Statics.field1548.method745();
                    }
                    if (var21 != 0) {
                        method3187(var21);
                        return;
                    }
                    var2.field5378 = 0;
                    method792(class69.field488);
                }
            }
            if (Statics.field157 == class69.field488) {
                if (var2.field5378 < 8) {
                    int var22 = var1.method8079();
                    if (var22 > 8 - var2.field5378) {
                        var22 = 8 - var2.field5378;
                    }
                    if (var22 > 0) {
                        var1.method8067(var2.field5381, var2.field5378, var22);
                        var2.field5378 += var22;
                    }
                }
                if (var2.field5378 == 8) {
                    var2.field5378 = 0;
                    Statics.field1521 = var2.method8804();
                    method792(class69.field479);
                }
            }
            if (Statics.field157 == class69.field479) {
                field569.field1450.field5378 = 0;
                field569.method2846();
                class548 var23 = new class548(500);
                int[] var24 = new int[] { Statics.field3045.nextInt(), Statics.field3045.nextInt(), Statics.field3045.nextInt(), Statics.field3045.nextInt() };
                var23.field5378 = 0;
                var23.method8781(1);
                var23.method9045(var24[0]);
                var23.method9045(var24[1]);
                var23.method9045(var24[2]);
                var23.method9045(var24[3]);
                var23.method8786(Statics.field1521);
                if (field609 == 40) {
                    var23.method9045(field533[0]);
                    var23.method9045(field533[1]);
                    var23.method9045(field533[2]);
                    var23.method9045(field533[3]);
                } else {
                    if (field609 == 50) {
                        var23.method8781(class145.field1656.method33());
                        var23.method9045(Statics.field5019);
                    } else {
                        var23.method8781(field545.method33());
                        switch(field545.field1657) {
                            case 0:
                            case 2:
                                var23.method8783(Statics.field4783);
                                var23.field5378++;
                            case 1:
                            default:
                                break;
                            case 3:
                                var23.field5378 += 4;
                                break;
                            case 4:
                                var23.method9045(Statics.field1385.method2528(class78.field923));
                        }
                    }
                    if (field546.method9092()) {
                        var23.method8781(class554.field5435.method33());
                        var23.method8869(this.field579);
                    } else {
                        var23.method8781(class554.field5436.method33());
                        var23.method8869(class78.field902);
                    }
                }
                var23.method8970(class77.field899, class77.field898);
                field533 = var24;
                class324 var25 = class324.method2337();
                var25.field3375 = null;
                var25.field3378 = 0;
                var25.field3379 = new class548(5000);
                var25.field3379.field5378 = 0;
                if (field609 == 40) {
                    var25.field3379.method8781(class326.field3524.field3526);
                } else {
                    var25.field3379.method8781(class326.field3522.field3526);
                }
                var25.field3379.method8782(0);
                int var28 = var25.field3379.field5378;
                var25.field3379.method9045(224);
                var25.field3379.method9045(1);
                var25.field3379.method8781(field559);
                var25.field3379.method8781(field510);
                byte var29 = 0;
                var25.field3379.method8781(var29);
                var25.field3379.method8790(var23.field5381, 0, var23.field5378);
                int var30 = var25.field3379.field5378;
                var25.field3379.method8869(class78.field923);
                var25.field3379.method8781((field614 ? 1 : 0) << 1 | (field548 ? 1 : 0));
                var25.field3379.method8782(Statics.field1345);
                var25.field3379.method8782(Statics.field467);
                method398(var25.field3379);
                var25.field3379.method8869(Statics.field4741);
                var25.field3379.method9045(Statics.field3254);
                var25.field3379.method8781(0);
                class549 var31 = new class549(Statics.field2489.method8245());
                Statics.field2489.method8242(var31);
                var25.field3379.method8790(var31.field5381, 0, var31.field5381.length);
                var25.field3379.method8781(field559);
                var25.field3379.method9045(0);
                if (Statics.field4408) {
                    Statics.method2342(var25);
                } else {
                    method2207(var25);
                }
                var25.field3379.method8854(var24, var30, var25.field3379.field5378);
                var25.field3379.method8793(var25.field3379.field5378 - var28);
                field569.method2829(var25);
                field569.method2828();
                field569.field1458 = new class566(var24);
                int[] var32 = new int[4];
                for (int var33 = 0; var33 < 4; var33++) {
                    var32[var33] = var24[var33] + 50;
                }
                var2.method8753(var32);
                method792(class69.field478);
            }
            if (Statics.field157 == class69.field478 && var1.method8079() > 0) {
                int var34 = var1.method8066();
                if (var34 == 61) {
                    int var35 = var1.method8079();
                    Statics.field3119 = var35 == 1 && var1.method8066() == 1;
                    method792(class69.field479);
                }
                if (var34 == 21 && field609 == 20) {
                    method792(class69.field485);
                } else if (var34 == 2) {
                    if (Statics.field4408) {
                        method792(class69.field497);
                    } else {
                        method792(class69.field493);
                    }
                } else if (var34 == 15 && field609 == 40) {
                    field569.field1452 = -1;
                    method792(class69.field486);
                } else if (var34 == 64) {
                    method792(class69.field484);
                } else if (var34 == 23 && field543 < 1) {
                    field543++;
                    method792(class69.field496);
                } else if (var34 == 29) {
                    method792(class69.field492);
                } else if (var34 == 69) {
                    method792(class69.field481);
                } else {
                    method3187(var34);
                    return;
                }
            }
            if (Statics.field157 == class69.field497) {
                Statics.field1719 = true;
                method6560(class95.field1144);
                method2936(0);
            }
            if (Statics.field157 == class69.field481 && var1.method8079() >= 2) {
                var1.method8067(var2.field5381, 0, 2);
                var2.field5378 = 0;
                Statics.field2460 = var2.method8968();
                method792(class69.field482);
            }
            if (Statics.field157 == class69.field482 && var1.method8079() >= Statics.field2460) {
                var2.field5378 = 0;
                var1.method8067(var2.field5381, var2.field5378, Statics.field2460);
                class7[] var36 = new class7[] { class7.field14 };
                class7 var37 = var36[var2.method9025()];
                try {
                    switch(var37.field11) {
                        case 0:
                            class1 var38 = new class1();
                            this.field564 = new class8(var2, var38);
                            method792(class69.field483);
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                } catch (Exception var65) {
                    method3187(22);
                    return;
                }
            }
            if (Statics.field157 == class69.field483 && this.field564.method49()) {
                this.field508 = this.field564.method41();
                this.field564.method40();
                this.field564 = null;
                if (this.field508 == null) {
                    method3187(22);
                    return;
                }
                field569.method2846();
                class324 var41 = class324.method2337();
                var41.field3375 = null;
                var41.field3378 = 0;
                var41.field3379 = new class548(5000);
                var41.field3379.method8781(class326.field3521.field3526);
                var41.field3379.method8782(this.field508.field5378);
                var41.field3379.method9004(this.field508);
                field569.method2829(var41);
                field569.method2828();
                this.field508 = null;
                method792(class69.field478);
            }
            if (Statics.field157 == class69.field484 && var1.method8079() > 0) {
                Statics.field3724 = var1.method8066();
                method792(class69.field487);
            }
            if (Statics.field157 == class69.field487 && var1.method8079() >= Statics.field3724) {
                var1.method8067(var2.field5381, 0, Statics.field3724);
                var2.field5378 = 0;
                method792(class69.field478);
            }
            if (Statics.field157 == class69.field485 && var1.method8079() > 0) {
                field673 = (var1.method8066() + 3) * 60;
                method792(class69.field480);
            }
            if (Statics.field157 == class69.field480) {
                field544 = 0;
                class78.method2997(class380.field4131, class380.field4132, field673 / 60 + class380.field4133);
                if (--field673 <= 0) {
                    method792(class69.field496);
                }
            } else if (Statics.field157 == class69.field498) {
                class324 var44 = class324.method2337();
                var44.field3375 = null;
                var44.field3378 = 0;
                var44.field3379 = new class548(5000);
                var44.field3379.method8781(class326.field3525.field3526);
                var44.field3379.method8782(class326.field3525.field3529);
                var44.field3379.method8911(Statics.field2681.field4507);
                var44.field3379.method9045(Statics.field1282.field4507);
                var44.field3379.method9045(Statics.field3332.field4507);
                var44.field3379.method8911(Statics.field1937.field4507);
                var44.field3379.method8911(Statics.field413.field4507);
                var44.field3379.method8911(Statics.field2112.field4507);
                var44.field3379.method8852(Statics.field101.field4507);
                var44.field3379.method8852(Statics.field290.field4507);
                var44.field3379.method9045(Statics.field153.field4507);
                var44.field3379.method9045(Statics.field4910.field4507);
                var44.field3379.method9045(Statics.field1298.field4507);
                var44.field3379.method8911(Statics.field63.field4507);
                var44.field3379.method9045(Statics.field1306.field4507);
                var44.field3379.method8851(0);
                field569.method2829(var44);
                field569.method2828();
                method792(class69.field493);
            } else {
                if (Statics.field157 == class69.field493 && var1.method8079() >= 1) {
                    Statics.field2688 = var1.method8066();
                    if (Statics.field2688 != class326.field3520.field3529) {
                        method3187(Statics.field2688);
                        return;
                    }
                    method792(class69.field474);
                }
                if (Statics.field157 == class69.field474 && var1.method8079() >= Statics.field2688) {
                    boolean var47 = var1.method8066() == 1;
                    var1.method8067(var2.field5381, 0, 4);
                    var2.field5378 = 0;
                    boolean var48 = false;
                    if (var47) {
                        int var49 = var2.method8749() << 24;
                        int var50 = var49 | var2.method8749() << 16;
                        int var51 = var50 | var2.method8749() << 8;
                        int var52 = var51 | var2.method8749();
                        Statics.field1385.method2526(class78.field923, var52);
                    }
                    if (field560) {
                        Statics.field1385.method2498(class78.field923);
                    } else {
                        Statics.field1385.method2498((String) null);
                    }
                    class101.method5612();
                    field675 = var1.method8066();
                    field593 = var1.method8066() == 1;
                    field630 = var1.method8066();
                    field630 <<= 0x8;
                    field630 += var1.method8066();
                    field631 = var1.method8066();
                    var1.method8067(var2.field5381, 0, 8);
                    var2.field5378 = 0;
                    this.field565 = var2.method8804();
                    var1.method8067(var2.field5381, 0, 8);
                    var2.field5378 = 0;
                    field632 = var2.method8804();
                    var1.method8067(var2.field5381, 0, 8);
                    var2.field5378 = 0;
                    field598 = var2.method8804();
                    Statics.method260().method4250(this.field552);
                    method792(class69.field490);
                }
                if (Statics.field157 == class69.field490 && var1.method8079() >= field569.field1452) {
                    var1.method8067(var2.field5381, 0, 1);
                    var2.field5378 = 0;
                    if (var2.method8743()) {
                        var1.method8067(var2.field5381, 1, 1);
                        var2.field5378 = 0;
                    }
                    class325[] var53 = class325.method3180();
                    int var54 = var2.method8739();
                    if (var54 < 0 || var54 >= var53.length) {
                        throw new IOException("Invalid ServerProt: " + var54 + " at " + var2.field5378);
                    }
                    field569.field1451 = var53[var54];
                    field569.field1452 = field569.field1451.field3464;
                    var1.method8067(var2.field5381, 0, 2);
                    var2.field5378 = 0;
                    field569.field1452 = var2.method8968();
                    try {
                        client var55 = Statics.field997;
                        JSObject.getWindow(var55).call("zap", (Object[]) null);
                    } catch (Throwable var64) {
                    }
                    method792(class69.field491);
                }
                if (Statics.field157 != class69.field491) {
                    if (Statics.field157 == class69.field492 && var1.method8079() >= 2) {
                        var2.field5378 = 0;
                        var1.method8067(var2.field5381, 0, 2);
                        var2.field5378 = 0;
                        Statics.field830 = var2.method8968();
                        method792(class69.field489);
                    }
                    if (Statics.field157 == class69.field489 && var1.method8079() >= Statics.field830) {
                        var2.field5378 = 0;
                        var1.method8067(var2.field5381, 0, Statics.field830);
                        var2.field5378 = 0;
                        String var57 = var2.method8808();
                        String var58 = var2.method8808();
                        String var59 = var2.method8808();
                        class78.method2997(var57, var58, var59);
                        method2936(10);
                        if (field546.method9092()) {
                            class78.method8645(9);
                        }
                    }
                    if (Statics.field157 == class69.field486) {
                        if (field569.field1452 == -1) {
                            if (var1.method8079() < 2) {
                                return;
                            }
                            var1.method8067(var2.field5381, 0, 2);
                            var2.field5378 = 0;
                            field569.field1452 = var2.method8968();
                        }
                        if (var1.method8079() >= field569.field1452) {
                            var1.method8067(var2.field5381, 0, field569.field1452);
                            var2.field5378 = 0;
                            int var60 = field569.field1452;
                            field703.method7762();
                            field569.method2846();
                            field569.field1450.field5378 = 0;
                            field569.field1451 = null;
                            field569.field1456 = null;
                            field569.field1449 = null;
                            field569.field1445 = null;
                            field569.field1452 = 0;
                            field569.field1454 = 0;
                            field526 = 0;
                            field651.field5519 = 0;
                            field694 = false;
                            field750 = 0;
                            field542 = 0;
                            Statics.field4799.method2617();
                            class87.field1046 = new class522(32);
                            method2936(30);
                            for (int var61 = 0; var61 < 100; var61++) {
                                field717[var61] = true;
                            }
                            if (field569 != null && field569.field1458 != null) {
                                class324 var62 = class324.method4244(class322.field3334, field569.field1458);
                                var62.field3379.method8781(method3176());
                                var62.field3379.method8782(Statics.field1345);
                                var62.field3379.method8782(Statics.field467);
                                field569.method2829(var62);
                            }
                            Statics.field4799.field1322.method2734(var2, true);
                            if (var2.field5378 != var60) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field544++;
                        if (field544 > 2000) {
                            if (field543 < 1) {
                                if (Statics.field300 == Statics.field2457) {
                                    Statics.field2457 = Statics.field2679;
                                } else {
                                    Statics.field2457 = Statics.field300;
                                }
                                field543++;
                                method792(class69.field496);
                            } else {
                                method3187(-3);
                            }
                        }
                    }
                } else if (var1.method8079() >= field569.field1452) {
                    var2.field5378 = 0;
                    var1.method8067(var2.field5381, 0, field569.field1452);
                    field703.method7742();
                    method5093();
                    Statics.field4799.field1322.method2734(var2, true);
                    Statics.field3728 = Statics.field2672;
                    Statics.field34 = -1;
                    method2179(false, var2);
                    field569.field1451 = null;
                    field516 = false;
                }
            }
        } catch (IOException var72) {
            if (field543 < 1) {
                if (Statics.field300 == Statics.field2457) {
                    Statics.field2457 = Statics.field2679;
                } else {
                    Statics.field2457 = Statics.field300;
                }
                field543++;
                method792(class69.field496);
            } else {
                method3187(-2);
            }
        }
    }

    @ObfuscatedName("dp.hg(Lmf;I)V")
    public static void method2207(class324 arg0) {
        arg0.field3379.method9045(Statics.field221.field4507);
        arg0.field3379.method9045(Statics.field4910.field4507);
        arg0.field3379.method8911(Statics.field156.field4507);
        arg0.field3379.method8911(Statics.field101.field4507);
        arg0.field3379.method8851(0);
        arg0.field3379.method8852(Statics.field1282.field4507);
        arg0.field3379.method8851(Statics.field4679.field4507);
        arg0.field3379.method8851(Statics.field408.field4507);
        arg0.field3379.method8911(Statics.field1797.field4507);
        arg0.field3379.method8911(Statics.field1298.field4507);
        arg0.field3379.method8911(Statics.field3332.field4507);
        arg0.field3379.method8911(Statics.field63.field4507);
        arg0.field3379.method8852(Statics.field153.field4507);
        arg0.field3379.method8852(Statics.field2112.field4507);
        arg0.field3379.method9045(Statics.field413.field4507);
        arg0.field3379.method8851(Statics.field290.field4507);
        arg0.field3379.method8911(Statics.field1225.field4507);
        arg0.field3379.method9045(Statics.field975.field4507);
        arg0.field3379.method8851(Statics.field2681.field4507);
        arg0.field3379.method8852(Statics.field1306.field4507);
        arg0.field3379.method8852(Statics.field1937.field4507);
    }

    @ObfuscatedName("kc.ht(B)V")
    public static void method5093() {
        field521 = 1L;
        if (Statics.field4911 != null) {
            Statics.field4911.field1079 = 0;
        }
        Statics.field3540 = true;
        field525 = true;
        field677 = -1L;
        class37.field218 = new class410();
        field569.method2846();
        field569.field1450.field5378 = 0;
        field569.field1451 = null;
        field569.field1456 = null;
        field569.field1449 = null;
        field569.field1445 = null;
        field569.field1452 = 0;
        field569.field1454 = 0;
        field526 = 0;
        field570 = 0;
        field527 = 0;
        field651.field5519 = 0;
        field694 = false;
        class36.method5353(0);
        class114.field1441.clear();
        class114.field1442.method8530();
        class114.field1443.method7029();
        class114.field1444 = 0;
        field659 = 0;
        field661 = false;
        field666 = 0;
        field592 = 0;
        field704 = 0;
        Statics.field1623 = null;
        field750 = 0;
        field743 = -1;
        field542 = 0;
        field739 = 0;
        field535 = class107.field1368;
        field650 = class107.field1368;
        if (Statics.field4799 != null) {
            Statics.field4799.method2616();
        }
        Statics.field3011.method1858();
        if (Statics.field2454 > 5000) {
        }
        if (field517) {
            Arrays.fill(class349.field3699, 0);
            Arrays.fill(class349.field3702, 0);
        } else {
            for (int var0 = 0; var0 < Statics.field2454; var0++) {
                class233 var1 = class233.method6826(var0);
                if (var1 != null) {
                    class349.field3699[var0] = 0;
                    class349.field3702[var0] = 0;
                }
            }
        }
        if (Statics.field2734 != null) {
            Statics.field2734.method2789();
        }
        field676 = -1;
        if (field667 != -1) {
            Statics.field2667.method5967(field667);
        }
        for (class89 var2 = (class89) field762.method8546(); var2 != null; var2 = (class89) field762.method8539()) {
            method1078(var2, true);
        }
        field667 = -1;
        field762 = new class522(8);
        field672 = null;
        field651.field5519 = 0;
        field694 = false;
        field785.method6025((int[]) null, (int[]) null, new int[] { 0, 0, 0, 0, 0 }, 0, -1);
        for (int var3 = 0; var3 < 8; var3++) {
            field641[var3] = null;
            field729[var3] = false;
        }
        class87.field1046 = new class522(32);
        field536 = true;
        for (int var4 = 0; var4 < 100; var4++) {
            field717[var4] = true;
        }
        if (field569 != null && field569.field1458 != null) {
            class324 var5 = class324.method4244(class322.field3334, field569.field1458);
            var5.field3379.method8781(method3176());
            var5.field3379.method8782(Statics.field1345);
            var5.field3379.method8782(Statics.field467);
            field569.method2829(var5);
        }
        Statics.field70 = null;
        Statics.field3968 = null;
        Arrays.fill(field741, (Object) null);
        Statics.field312 = null;
        Arrays.fill(field608, (Object) null);
        for (int var6 = 0; var6 < 8; var6++) {
            field789[var6] = new class398();
        }
        Statics.field4777 = null;
    }

    @ObfuscatedName("fl.hd(II)V")
    public static void method3187(int arg0) {
        int var1 = class78.method4632();
        if (arg0 == -3) {
            class78.method2997(class380.field4134, class380.field4135, class380.field4297);
        } else if (arg0 == -2) {
            class78.method2997(class380.field4185, class380.field4138, class380.field4139);
        } else if (arg0 == -1) {
            class78.method2997(class380.field4140, class380.field4141, class380.field4142);
        } else if (arg0 == 3) {
            class78.method8645(3);
            class78.field942 = 1;
        } else if (arg0 == 4) {
            class78.method2340(0);
        } else if (arg0 == 5) {
            class78.field942 = 2;
            class78.method2997(class380.field4320, class380.field4236, class380.field4238);
        } else if (arg0 == 68) {
            if (!field516) {
                field516 = true;
                method5036();
                return;
            }
            class78.method2997(class380.field4169, class380.field4386, class380.field4184);
        } else if (!field642 && arg0 == 6) {
            class78.method2997(class380.field4169, class380.field4386, class380.field4184);
        } else if (arg0 == 7) {
            class78.method2997(class380.field4152, class380.field4153, class380.field4388);
        } else if (arg0 == 8) {
            class78.method2997(class380.field4155, class380.field4149, class380.field4157);
        } else if (arg0 == 9) {
            class78.method2997(class380.field4158, class380.field4315, class380.field4160);
        } else if (arg0 == 10) {
            class78.method2997(class380.field4161, class380.field4182, class380.field4163);
        } else if (arg0 == 11) {
            class78.method2997(class380.field4164, class380.field4371, class380.field4166);
        } else if (arg0 == 12) {
            class78.method2997(class380.field4167, class380.field4168, class380.field4264);
        } else if (arg0 == 13) {
            class78.method2997(class380.field4170, class380.field4171, class380.field4391);
        } else if (arg0 == 14) {
            class78.method2997(class380.field4292, class380.field4174, class380.field4224);
        } else if (arg0 == 16) {
            class78.method2997(class380.field4176, class380.field4177, class380.field4288);
            class78.method8645(33);
        } else if (arg0 == 17) {
            class78.method2997(class380.field4366, class380.field4180, class380.field4181);
        } else if (arg0 == 18) {
            class78.method2340(1);
        } else if (arg0 == 19) {
            class78.method2997(class380.field4122, class380.field4186, class380.field4187);
        } else if (arg0 == 20) {
            class78.method2997(class380.field4188, class380.field4189, class380.field4190);
        } else if (arg0 == 22) {
            class78.method2997(class380.field4191, class380.field4192, class380.field4193);
        } else if (arg0 == 23) {
            class78.method2997(class380.field4136, class380.field4195, class380.field4124);
        } else if (arg0 == 24) {
            class78.method2997(class380.field4197, class380.field4198, class380.field4199);
        } else if (arg0 == 25) {
            class78.method2997(class380.field4200, class380.field4201, class380.field4151);
        } else if (arg0 == 26) {
            class78.method2997(class380.field4203, class380.field4204, class380.field4194);
        } else if (arg0 == 27) {
            class78.method2997(class380.field4206, class380.field4207, class380.field4208);
        } else if (arg0 == 31) {
            class78.method2997(class380.field4377, class380.field4345, class380.field4217);
        } else if (arg0 == 32) {
            class78.method2340(2);
        } else if (arg0 == 37) {
            class78.method2997(class380.field4221, class380.field4150, class380.field4223);
        } else if (arg0 == 38) {
            class78.method2997(class380.field4341, class380.field4225, class380.field4226);
        } else if (arg0 == 74) {
            class78.method2997(class380.field4227, class380.field4228, class380.field4229);
        } else if (arg0 == 55) {
            class78.method8645(8);
        } else if (arg0 == 56) {
            class78.method2997(class380.field4234, class380.field4235, class380.field4102);
            method2936(11);
            return;
        } else if (arg0 == 57) {
            class78.method2997(class380.field4250, class380.field4376, class380.field4211);
            method2936(11);
            return;
        } else if (arg0 == 61) {
            class78.method2997("", "Please enter your date of birth (DD/MM/YYYY)", "");
            class78.method8645(7);
        } else if (arg0 == 62) {
            method2936(10);
            class78.method8645(9);
            class78.method2997(class380.field4240, class380.field4278, class380.field4362);
            return;
        } else if (arg0 == 63) {
            method2936(10);
            class78.method8645(9);
            class78.method2997(class380.field4282, class380.field4244, class380.field4245);
            return;
        } else if (arg0 == 65 || arg0 == 67) {
            method2936(10);
            class78.method8645(9);
            class78.method2997(class380.field4246, class380.field4355, class380.field4248);
            return;
        } else if (arg0 == 71) {
            method2936(10);
            class78.method8645(7);
            class78.method2997("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
        } else if (arg0 == 73) {
            method2936(10);
            class78.method8645(6);
            class78.method2997(class380.field4399, class380.field4242, class380.field4379);
        } else if (arg0 == 72) {
            method2936(10);
            class78.method8645(32);
        } else {
            class78.method2997(class380.field4268, class380.field4247, class380.field4298);
        }
        method2936(10);
        boolean var2 = var1 != class78.method4632();
        if (!var2 && field546.method9092()) {
            class78.method8645(9);
        }
    }

    @ObfuscatedName("fo.hv(I)V")
    public static final void method3104() {
        field569.method2831();
        method3334();
        Statics.field4799.method2616();
        field736.method4931();
        System.gc();
        Statics.method2347(0, 0);
        class333.method3178();
        field751 = false;
        class72.method5455();
        method2936(10);
        field520 = 0;
        Statics.method260().method4252();
        Statics.method260().method4253();
    }

    @ObfuscatedName("di.hi(II)V")
    public static final void method2323(int arg0) {
        method3104();
        switch(arg0) {
            case 1:
                class78.method8645(24);
                class78.method2997(class380.field4324, class380.field4325, class380.field4305);
                break;
            case 2:
                class78.method8665();
        }
    }

    @ObfuscatedName("to.hk(I)J")
    public static long method8494() {
        return field632;
    }

    @ObfuscatedName("su.hl(B)J")
    public static long method8105() {
        return field598;
    }

    @ObfuscatedName("gi.hj(I)V")
    public static final void method3334() {
        class240.method2186();
        class242.method4749();
        class231.field2445.method5588();
        class541.field5319.method5588();
        class539.method7908();
        class241.field2540.method5588();
        Statics.method6564();
        class252.field2660.method5588();
        class238.method2852();
        class259.method4511();
        class230.method664();
        class237.method4371();
        class228.method2622();
        class261.field2733.method5588();
        class261.field2770.method5588();
        class261.field2773.method5588();
        class261.field2772.method5588();
        class235.method2762();
        class243.method4327();
        class246.method3161();
        class262.field2785.method5588();
        class262.field2792.method5588();
        class262.field2793.method5588();
        class257.method3209();
        class264.field2865.method5588();
        class264.field2866.method5588();
        class264.field2880.method5588();
        class251.field2658.method5588();
        class251.field2646.method5588();
        class258.field2699.method5588();
        class255.method4378();
        if (Statics.field3 != null) {
            Statics.field3.method8628();
        }
        if (Statics.field4035 != null) {
            Statics.field4035.method8628();
        }
        class247.method3286();
        class249.method3838();
        class236.field2493.method5588();
        class234.field2463.method5588();
        Statics.method5868();
        class232.method5426();
        class256.field2689.method5588();
        class233.field2455.method5588();
        class253.field2668.method5588();
        field792.method5588();
        field793.method5588();
        class358.field3752.method5588();
        class358.field3754.method7834();
        class358.field3756 = 0;
        if (Statics.field2667 != null) {
            Statics.field2667.method5968();
        }
        if (class181.field1943.field2264 != null) {
            ((class193) class181.field1943.field2264).method3860();
        }
        class81.method3530();
        field791.method7834();
        if (Statics.field1306 != null) {
            Statics.field1306.method6725();
        }
        if (Statics.field1282 != null) {
            Statics.field1282.method6725();
        }
        if (Statics.field221 != null) {
            Statics.field221.method6725();
        }
        if (Statics.field63 != null) {
            Statics.field63.method6725();
        }
        if (Statics.field290 != null) {
            Statics.field290.method6725();
        }
        if (Statics.field2638 != null) {
            Statics.field2638.method6725();
        }
        if (Statics.field3332 != null) {
            Statics.field3332.method6725();
        }
        if (Statics.field1225 != null) {
            Statics.field1225.method6725();
        }
        if (Statics.field413 != null) {
            Statics.field413.method6725();
        }
        if (Statics.field12 != null) {
            Statics.field12.method6725();
        }
        if (Statics.field975 != null) {
            Statics.field975.method6725();
        }
        if (Statics.field2112 != null) {
            Statics.field2112.method6725();
        }
        if (Statics.field1298 != null) {
            Statics.field1298.method6725();
        }
        if (Statics.field156 != null) {
            Statics.field156.method6725();
        }
        if (Statics.field101 != null) {
            Statics.field101.method6725();
        }
        if (Statics.field1797 != null) {
            Statics.field1797.method6725();
        }
        if (Statics.field408 != null) {
            Statics.field408.method6725();
        }
        if (Statics.field1937 != null) {
            Statics.field1937.method6725();
        }
        if (Statics.field4679 != null) {
            Statics.field4679.method6725();
        }
        if (Statics.field4910 != null) {
            Statics.field4910.method6725();
        }
        if (Statics.field153 != null) {
            Statics.field153.method6725();
        }
        if (Statics.field2681 != null) {
            Statics.field2681.method6725();
        }
    }

    @ObfuscatedName("mt.hu(I)V")
    public static final void method5870() {
        Statics.field2503 = null;
        Statics.field2497 = null;
        Statics.field2336 = 0;
    }

    @ObfuscatedName("ky.hw(I)V")
    public static final void method5053() {
        if (field570 > 0) {
            method3104();
        } else {
            field703.method7765();
            method2936(40);
            Statics.field1092 = field569.method2833();
            field569.method2832();
        }
    }

    @ObfuscatedName("client.hz(I)V")
    public final void method1729() {
        if (field526 > 1) {
            field526--;
        }
        if (field570 > 0) {
            field570--;
        }
        if (field671) {
            field671 = false;
            method5053();
            return;
        }
        if (!field694) {
            method8128();
        }
        for (int var1 = 0; var1 < 100 && this.method1364(field569); var1++) {
        }
        if (field609 != 30) {
            return;
        }
        while (class37.method3283()) {
            class324 var2 = class324.method4244(class322.field3271, field569.field1458);
            var2.field3379.method8781(0);
            int var3 = var2.field3379.field5378;
            class37.method4482(var2.field3379);
            var2.field3379.method9048(var2.field3379.field5378 - var3);
            field569.method2829(var2);
        }
        if (field703.field4840) {
            class324 var4 = class324.method4244(class322.field3274, field569.field1458);
            var4.field3379.method8781(0);
            int var5 = var4.field3379.field5378;
            field703.method7745(var4.field3379);
            var4.field3379.method9048(var4.field3379.field5378 - var5);
            field569.method2829(var4);
            field703.method7743();
        }
        Object var6 = Statics.field4911.field1078;
        synchronized (Statics.field4911.field1078) {
            if (!field777) {
                Statics.field4911.field1079 = 0;
            } else if (class36.field211 != 0 || Statics.field4911.field1079 >= 40) {
                class324 var7 = null;
                int var8 = 0;
                int var9 = 0;
                int var10 = 0;
                int var11 = 0;
                for (int var12 = 0; var12 < Statics.field4911.field1079 && (var7 == null || var7.field3379.field5378 - var8 < 246); var12++) {
                    var9 = var12;
                    int var13 = Statics.field4911.field1081[var12];
                    if (var13 < -1) {
                        var13 = -1;
                    } else if (var13 > 65534) {
                        var13 = 65534;
                    }
                    int var14 = Statics.field4911.field1077[var12];
                    if (var14 < -1) {
                        var14 = -1;
                    } else if (var14 > 65534) {
                        var14 = 65534;
                    }
                    if (field522 != var14 || field663 != var13) {
                        if (var7 == null) {
                            var7 = class324.method4244(class322.field3341, field569.field1458);
                            var7.field3379.method8781(0);
                            var8 = var7.field3379.field5378;
                            var7.field3379.field5378 += 2;
                            var10 = 0;
                            var11 = 0;
                        }
                        int var15;
                        int var16;
                        int var17;
                        if (field524 == -1L) {
                            var15 = var14;
                            var16 = var13;
                            var17 = Integer.MAX_VALUE;
                        } else {
                            var15 = var14 - field522;
                            var16 = var13 - field663;
                            var17 = (int) ((Statics.field4911.field1082[var12] - field524) / 20L);
                            var10 = (int) ((Statics.field4911.field1082[var12] - field524) % 20L + (long) var10);
                        }
                        field522 = var14;
                        field663 = var13;
                        if (var17 < 8 && var15 >= -32 && var15 <= 31 && var16 >= -32 && var16 <= 31) {
                            var15 += 32;
                            var16 += 32;
                            var7.field3379.method8782((var15 << 6) + (var17 << 12) + var16);
                        } else if (var17 < 32 && var15 >= -128 && var15 <= 127 && var16 >= -128 && var16 <= 127) {
                            var15 += 128;
                            var16 += 128;
                            var7.field3379.method8781(var17 + 128);
                            var7.field3379.method8782((var15 << 8) + var16);
                        } else if (var17 < 32) {
                            var7.field3379.method8781(var17 + 192);
                            if (var14 == -1 || var13 == -1) {
                                var7.field3379.method9045(Integer.MIN_VALUE);
                            } else {
                                var7.field3379.method9045(var14 | var13 << 16);
                            }
                        } else {
                            var7.field3379.method8782((var17 & 0x1FFF) + 57344);
                            if (var14 == -1 || var13 == -1) {
                                var7.field3379.method9045(Integer.MIN_VALUE);
                            } else {
                                var7.field3379.method9045(var14 | var13 << 16);
                            }
                        }
                        var11++;
                        field524 = Statics.field4911.field1082[var12];
                    }
                }
                if (var7 != null) {
                    var7.field3379.method9048(var7.field3379.field5378 - var8);
                    int var18 = var7.field3379.field5378;
                    var7.field3379.field5378 = var8;
                    var7.field3379.method8781(var10 / var11);
                    var7.field3379.method8781(var10 % var11);
                    var7.field3379.field5378 = var18;
                    field569.method2829(var7);
                }
                if (var9 >= Statics.field4911.field1079) {
                    Statics.field4911.field1079 = 0;
                } else {
                    Statics.field4911.field1079 -= var9;
                    System.arraycopy(Statics.field4911.field1077, var9, Statics.field4911.field1077, 0, Statics.field4911.field1079);
                    System.arraycopy(Statics.field4911.field1081, var9, Statics.field4911.field1081, 0, Statics.field4911.field1079);
                    System.arraycopy(Statics.field4911.field1082, var9, Statics.field4911.field1082, 0, Statics.field4911.field1079);
                }
            }
        }
        if (class36.field211 == 1 || !Statics.field4709 && class36.field211 == 4 || class36.field211 == 2) {
            long var20 = class36.field214 - field521 * -1L;
            if (var20 > 32767L) {
                var20 = 32767L;
            }
            field521 = class36.field214 * -1L;
            int var22 = class36.field213;
            if (var22 < 0) {
                var22 = 0;
            } else if (var22 > Statics.field467) {
                var22 = Statics.field467;
            }
            int var23 = class36.field216;
            if (var23 < 0) {
                var23 = 0;
            } else if (var23 > Statics.field1345) {
                var23 = Statics.field1345;
            }
            int var24 = (int) var20;
            class324 var25 = class324.method4244(class322.field3295, field569.field1458);
            var25.field3379.method8782((class36.field211 == 2 ? 1 : 0) + (var24 << 1));
            var25.field3379.method8782(var23);
            var25.field3379.method8782(var22);
            field569.method2829(var25);
        }
        if (field708 != 0) {
            class324 var26 = class324.method4244(class322.field3360, field569.field1458);
            var26.field3379.method8782(field708);
            field569.method2829(var26);
        }
        if (field748.field2919 > 0) {
            class324 var27 = class324.method4244(class322.field3356, field569.field1458);
            var27.field3379.method8782(0);
            int var28 = var27.field3379.field5378;
            long var29 = class329.method5009();
            for (int var31 = 0; var31 < field748.field2919; var31++) {
                long var32 = var29 - field677;
                if (var32 > 16777215L) {
                    var32 = 16777215L;
                }
                field677 = var29;
                var27.field3379.method8783((int) var32);
                var27.field3379.method8966(field748.field2921[var31]);
            }
            var27.field3379.method8793(var27.field3379.field5378 - var28);
            field569.method2829(var27);
        }
        if (field778 > 0) {
            field778--;
        }
        if (field748.method4940(96) || field748.method4940(97) || field748.method4940(98) || field748.method4940(99)) {
            field607 = true;
        }
        if (field607 && field778 <= 0) {
            field778 = 20;
            field607 = false;
            class324 var34 = class324.method4244(class322.field3346, field569.field1458);
            var34.field3379.method8961(field592);
            var34.field3379.method8782(field591);
            field569.method2829(var34);
        }
        if (Statics.field3540 && !field525) {
            field525 = true;
            class324 var35 = class324.method4244(class322.field3309, field569.field1458);
            var35.field3379.method8781(1);
            field569.method2829(var35);
        }
        if (!Statics.field3540 && field525) {
            field525 = false;
            class324 var36 = class324.method4244(class322.field3309, field569.field1458);
            var36.field3379.method8781(0);
            field569.method2829(var36);
        }
        if (Statics.field2389 != null) {
            Statics.field2389.method8425();
        }
        method7134();
        method3200();
        if (field743 != Statics.field4799.field1308) {
            field743 = Statics.field4799.field1308;
            method3287(Statics.field4799.field1308);
        }
        if (field609 != 30) {
            return;
        }
        method1041(Statics.field4799);
        int var10002;
        for (int var37 = 0; var37 < field666; var37++) {
            var10002 = field755[var37]--;
            if (field755[var37] >= -10) {
                class40 var39 = field758[var37];
                if (var39 == null) {
                    class40 var10000 = (class40) null;
                    var39 = class40.method723(Statics.field975, field753[var37], 0);
                    if (var39 == null) {
                        continue;
                    }
                    field755[var37] += var39.method720();
                    field758[var37] = var39;
                }
                if (field755[var37] < 0) {
                    int var48;
                    if (field756[var37] == 0) {
                        var48 = Statics.field1385.method2517();
                    } else {
                        int var40 = (field756[var37] & 0xFF) * 128;
                        int var41 = field756[var37] >> 16 & 0xFF;
                        int var42 = Math.abs(class379.method6569(var41) - Statics.field2672.field1249);
                        int var43 = field756[var37] >> 8 & 0xFF;
                        int var44 = Math.abs(class379.method6569(var43) - Statics.field2672.field1180);
                        int var45 = Math.max(var42 + var44 - 128, 0);
                        int var46 = Math.max(((field757[var37] & 0x1F) - 1) * 128, 0);
                        if (var45 >= var40) {
                            field755[var37] = -100;
                            continue;
                        }
                        float var47 = var46 < var40 ? Math.min(Math.max((float) (var40 - var45) / (float) (var40 - var46), 0.0F), 1.0F) : 1.0F;
                        var48 = (int) (var47 * (float) Statics.field1385.method2601());
                    }
                    if (var48 > 0) {
                        class41 var49 = var39.method712().method725(Statics.field3668);
                        class49 var50 = class49.method829(var49, 100, var48);
                        var50.method832(field754[var37] - 1);
                        Statics.field445.method675(var50);
                    }
                    field755[var37] = -100;
                }
            } else {
                field666--;
                for (int var38 = var37; var38 < field666; var38++) {
                    field753[var38] = field753[var38 + 1];
                    field758[var38] = field758[var38 + 1];
                    field754[var38] = field754[var38 + 1];
                    field755[var38] = field755[var38 + 1];
                    field756[var38] = field756[var38 + 1];
                    field757[var38] = field757[var38 + 1];
                }
                var37--;
            }
        }
        if (field751 && !class333.method4358()) {
            if (Statics.field1385.method2515() != 0) {
                boolean var51 = !class333.field3566.isEmpty();
                if (var51) {
                    class333.method2917(Statics.field156, Statics.field1385.method2515());
                }
            }
            field751 = false;
        }
        field569.field1454++;
        if (field569.field1454 > 750) {
            method5053();
            return;
        }
        class102 var52 = Statics.field4799;
        int var53 = var52.field1322.field1399;
        int[] var54 = var52.field1322.field1401;
        for (int var55 = 0; var55 < var53; var55++) {
            class94 var56 = var52.field1317[var54[var55]];
            if (var56 != null) {
                method5412(var52, var56, 1);
            }
        }
        class102 var57 = Statics.field4799;
        for (int var58 = 0; var58 < var57.field1316; var58++) {
            int var59 = var57.field1320[var58];
            class104 var60 = var57.field1318[var59];
            if (var60 != null) {
                method5412(var57, var60, var60.field1340.field2571);
            }
        }
        method5052(Statics.field4799);
        method4057(Statics.field4799);
        for (int var61 = 0; var61 < Statics.field4799.field1307; var61++) {
            class478 var62 = Statics.field4799.field1321[Statics.field4799.field1323[var61]];
            if (var62 != null) {
                method1041(var62.field4947);
                class102 var63 = var62.field4947;
                int var64 = var63.field1322.field1399;
                int[] var65 = var63.field1322.field1401;
                for (int var66 = 0; var66 < var64; var66++) {
                    class94 var67 = var63.field1317[var65[var66]];
                    if (var67 != null) {
                        method5412(var63, var67, 1);
                    }
                }
                class102 var68 = var62.field4947;
                for (int var69 = 0; var69 < var68.field1316; var69++) {
                    int var70 = var68.field1320[var69];
                    class104 var71 = var68.field1318[var70];
                    if (var71 != null) {
                        method5412(var68, var71, var71.field1340.field2571);
                    }
                }
                method4057(var62.field4947);
            }
        }
        field584++;
        if (field626 != 0) {
            field511 += 20;
            if (field511 >= 400) {
                field626 = 0;
            }
        }
        class361 var72 = Statics.field26;
        class361 var73 = Statics.field2979;
        Statics.field26 = null;
        Statics.field2979 = null;
        field683 = null;
        field605 = false;
        field684 = false;
        field737 = 0;
        while (field748.method4948() && field737 < 128) {
            if (field675 >= 2 && field748.method4940(82) && field748.field2931 == 66) {
                StringBuilder var74 = new StringBuilder();
                Iterator var75 = class114.field1442.iterator();
                while (var75.hasNext()) {
                    class65 var76 = (class65) var75.next();
                    if (var76.field455 != null && !var76.field455.isEmpty()) {
                        var74.append(var76.field455).append(':');
                    }
                    var74.append(var76.field457).append('\n');
                }
                String var77 = var74.toString();
                Statics.field997.method452(var77);
            } else if (field704 != 1 || field748.field2932 <= 0) {
                field652[field737] = field748.field2931;
                field738[field737] = field748.field2932;
                field737++;
            }
        }
        if (method5070() && field748.method4940(82) && field748.method4940(81) && field708 != 0) {
            int var79 = Statics.field2672.field1130 - field708;
            if (var79 < 0) {
                var79 = 0;
            } else if (var79 > 3) {
                var79 = 3;
            }
            if (Statics.field2672.field1130 != var79) {
                method3427(Statics.field4799.field1311 + Statics.field2672.field1251[0], Statics.field4799.field1319 + Statics.field2672.field1181[0], var79, false);
            }
            field708 = 0;
        }
        if (field667 != -1) {
            method2467(field667, 0, 0, Statics.field1345, Statics.field467, 0, 0);
        }
        field691++;
        while (true) {
            class90 var80;
            class361 var81;
            class361 var82;
            do {
                var80 = (class90) field801.method6916();
                if (var80 == null) {
                    while (true) {
                        class90 var83;
                        class361 var84;
                        class361 var85;
                        do {
                            var83 = (class90) field712.method6916();
                            if (var83 == null) {
                                while (true) {
                                    class90 var86;
                                    class361 var87;
                                    class361 var88;
                                    do {
                                        var86 = (class90) field621.method6916();
                                        if (var86 == null) {
                                            boolean var89 = false;
                                            while (true) {
                                                class267 var90 = (class267) field713.method6916();
                                                if (var90 == null) {
                                                    if (!var89 && class36.field211 == 1) {
                                                        field736.method4931();
                                                    }
                                                    this.method1794();
                                                    method1852();
                                                    if (field679 != null) {
                                                        this.method1186();
                                                    }
                                                    boolean var91 = false;
                                                    for (int var92 = 0; var92 < Statics.field4799.field1307; var92++) {
                                                        class478 var93 = Statics.field4799.field1321[Statics.field4799.field1323[var92]];
                                                        class102 var94 = var93.field4947;
                                                        class186 var95 = var94.field1328;
                                                        if (var93 != null && var95.method3655()) {
                                                            if (!var91) {
                                                                int var96 = var95.field2028;
                                                                int var97 = var95.field2034;
                                                                class324 var98 = class324.method4244(class322.field3286, field569.field1458);
                                                                var98.field3379.method8781(5);
                                                                var98.field3379.method8781(field748.method4940(82) ? (field748.method4940(81) ? 2 : 1) : 0);
                                                                var98.field3379.method8836(var94.field1319 + var97);
                                                                var98.field3379.method8782(var94.field1311 + var96);
                                                                field569.method2829(var98);
                                                                var91 = true;
                                                                field623 = class36.field216;
                                                                field624 = class36.field213;
                                                                field626 = 1;
                                                                field511 = 0;
                                                                field542 = var96;
                                                                field739 = var97;
                                                            }
                                                            var95.method3656();
                                                        }
                                                    }
                                                    if (!var91 && Statics.field4799.field1328.method3655()) {
                                                        int var99 = Statics.field4799.field1328.field2028;
                                                        int var100 = Statics.field4799.field1328.field2034;
                                                        class324 var101 = class324.method4244(class322.field3286, field569.field1458);
                                                        var101.field3379.method8781(5);
                                                        var101.field3379.method8781(field748.method4940(82) ? (field748.method4940(81) ? 2 : 1) : 0);
                                                        var101.field3379.method8836(Statics.field4799.field1319 + var100);
                                                        var101.field3379.method8782(Statics.field4799.field1311 + var99);
                                                        field569.method2829(var101);
                                                        Statics.field4799.field1328.method3656();
                                                        field623 = class36.field216;
                                                        field624 = class36.field213;
                                                        field626 = 1;
                                                        field511 = 0;
                                                        field542 = var99;
                                                        field739 = var100;
                                                    }
                                                    if (var91) {
                                                        Statics.field4799.field1328.method3656();
                                                    }
                                                    if (Statics.field26 != var72) {
                                                        if (var72 != null) {
                                                            method7116(var72);
                                                        }
                                                        if (Statics.field26 != null) {
                                                            method7116(Statics.field26);
                                                        }
                                                    }
                                                    if (Statics.field2979 != var73 && field658 == field657) {
                                                        if (var73 != null) {
                                                            method7116(var73);
                                                        }
                                                        if (Statics.field2979 != null) {
                                                            method7116(Statics.field2979);
                                                        }
                                                    }
                                                    if (Statics.field2979 == null) {
                                                        if (field657 > 0) {
                                                            field657--;
                                                        }
                                                    } else if (field657 < field658) {
                                                        field657++;
                                                        if (field658 == field657) {
                                                            method7116(Statics.field2979);
                                                        }
                                                    }
                                                    if (field704 == 0) {
                                                        int var102 = Statics.field3728.method1152();
                                                        int var103 = Statics.field3728.method1156();
                                                        if (field635 != -1) {
                                                            class94 var104 = Statics.field2672.field1140.field1317[field635];
                                                            if (var104 != null) {
                                                                class350 var105 = var104.method2430(Statics.field2672.field1140);
                                                                var102 = var105.field3705;
                                                                var103 = var105.field3704;
                                                            }
                                                        }
                                                        int var106 = Statics.field3728.method1151();
                                                        if (Statics.field1524 - var102 < -500 || Statics.field1524 - var102 > 500 || Statics.field5062 - var103 < -500 || Statics.field5062 - var103 > 500) {
                                                            Statics.field1524 = var102;
                                                            Statics.field5062 = var103;
                                                        }
                                                        if (Statics.field1524 != var102) {
                                                            Statics.field1524 += (var102 - Statics.field1524) / 16;
                                                        }
                                                        if (Statics.field5062 != var103) {
                                                            Statics.field5062 += (var103 - Statics.field5062) / 16;
                                                        }
                                                        int var107 = Statics.field1524 >> 7;
                                                        int var108 = Statics.field5062 >> 7;
                                                        int var109 = method3285(Statics.field4799, Statics.field1524, Statics.field5062, var106);
                                                        int var110 = 0;
                                                        if (var107 > 3 && var108 > 3 && var107 < 100 && var108 < 100) {
                                                            for (int var111 = var107 - 4; var111 <= var107 + 4; var111++) {
                                                                for (int var112 = var108 - 4; var112 <= var108 + 4; var112++) {
                                                                    int var113 = var106;
                                                                    if (var106 < 3 && (Statics.field4799.field1315[1][var111][var112] & 0x2) == 2) {
                                                                        var113 = var106 + 1;
                                                                    }
                                                                    int var114 = var109 - Statics.field4799.field1314[var113][var111][var112];
                                                                    if (var114 > var110) {
                                                                        var110 = var114;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        int var115 = var110 * 192;
                                                        if (var115 > 98048) {
                                                            var115 = 98048;
                                                        }
                                                        if (var115 < 32768) {
                                                            var115 = 32768;
                                                        }
                                                        if (var115 > field502) {
                                                            field502 += (var115 - field502) / 24;
                                                        } else if (var115 < field502) {
                                                            field502 += (var115 - field502) / 80;
                                                        }
                                                        Statics.field1258 = method3285(Statics.field4799, var102, var103, var106) - field506;
                                                    } else if (field704 == 1) {
                                                        if (field633 && Statics.field2672 != null) {
                                                            int var116 = Statics.field2672.field1251[0];
                                                            int var117 = Statics.field2672.field1181[0];
                                                            if (var116 >= 0 && 104 > var116 && var117 >= 0 && 104 > var117) {
                                                                Statics.field1524 = Statics.field2672.field1249;
                                                                int var118 = method3285(Statics.field4799, Statics.field2672.field1249, Statics.field2672.field1180, Statics.field4799.field1308) - field506;
                                                                if (var118 < Statics.field1258) {
                                                                    Statics.field1258 = var118;
                                                                }
                                                                Statics.field5062 = Statics.field2672.field1180;
                                                                field633 = false;
                                                            }
                                                        }
                                                        short var119 = -1;
                                                        if (field748.method4940(33)) {
                                                            var119 = 0;
                                                        } else if (field748.method4940(49)) {
                                                            var119 = 1024;
                                                        }
                                                        if (field748.method4940(48)) {
                                                            if (var119 == 0) {
                                                                var119 = 1792;
                                                            } else if (var119 == 1024) {
                                                                var119 = 1280;
                                                            } else {
                                                                var119 = 1536;
                                                            }
                                                        } else if (field748.method4940(50)) {
                                                            if (var119 == 0) {
                                                                var119 = 256;
                                                            } else if (var119 == 1024) {
                                                                var119 = 768;
                                                            } else {
                                                                var119 = 512;
                                                            }
                                                        }
                                                        byte var120 = 0;
                                                        if (field748.method4940(35)) {
                                                            var120 = -1;
                                                        } else if (field748.method4940(51)) {
                                                            var120 = 1;
                                                        }
                                                        int var121 = 0;
                                                        if (var119 >= 0 || var120 != 0) {
                                                            int var122 = field748.method4940(81) ? field603 : field602;
                                                            var121 = var122 * 16;
                                                            field503 = var119;
                                                            field682 = var120;
                                                        }
                                                        if (field599 < var121) {
                                                            field599 += var121 / 8;
                                                            if (field599 > var121) {
                                                                field599 = var121;
                                                            }
                                                        } else if (field599 > var121) {
                                                            field599 = field599 * 9 / 10;
                                                        }
                                                        if (field599 > 0) {
                                                            int var123 = field599 / 16;
                                                            if (field503 >= 0) {
                                                                int var124 = field503 - Statics.field2888 & 0x7FF;
                                                                int var125 = class181.field1941[var124];
                                                                int var126 = class181.field1942[var124];
                                                                Statics.field1524 += var123 * var125 / 65536;
                                                                Statics.field5062 += var123 * var126 / 65536;
                                                            }
                                                            if (field682 != 0) {
                                                                Statics.field1258 += field682 * var123;
                                                                if (Statics.field1258 > 0) {
                                                                    Statics.field1258 = 0;
                                                                }
                                                            }
                                                        } else {
                                                            field503 = -1;
                                                            field682 = -1;
                                                        }
                                                        if (field748.method4940(13)) {
                                                            method242();
                                                        }
                                                    }
                                                    if (class36.field203 == 4 && Statics.field4709) {
                                                        int var127 = class36.field205 - field596;
                                                        field595 = var127 * 2;
                                                        field596 = var127 == -1 || var127 == 1 ? class36.field205 : (field596 + class36.field205) / 2;
                                                        int var128 = field600 - class36.field204;
                                                        field726 = var128 * 2;
                                                        field600 = var128 == -1 || var128 == 1 ? class36.field204 : (field600 + class36.field204) / 2;
                                                    } else {
                                                        if (field748.method4940(96)) {
                                                            field726 += (-24 - field726) / 2;
                                                        } else if (field748.method4940(97)) {
                                                            field726 += (24 - field726) / 2;
                                                        } else {
                                                            field726 /= 2;
                                                        }
                                                        if (field748.method4940(98)) {
                                                            field595 += (12 - field595) / 2;
                                                        } else if (field748.method4940(99)) {
                                                            field595 += (-12 - field595) / 2;
                                                        } else {
                                                            field595 /= 2;
                                                        }
                                                        field596 = class36.field205;
                                                        field600 = class36.field204;
                                                    }
                                                    field592 = field726 / 2 + field592 & 0x7FF;
                                                    field591 += field595 / 2;
                                                    if (field591 < 128) {
                                                        field591 = 128;
                                                    }
                                                    if (field591 > 383) {
                                                        field591 = 383;
                                                    }
                                                    if (field766) {
                                                        method3825();
                                                    } else if (field538) {
                                                        method6864();
                                                    }
                                                    for (int var129 = 0; var129 < 5; var129++) {
                                                        var10002 = field771[var129]++;
                                                    }
                                                    Statics.field2734.method2769();
                                                    int var130 = ++class36.field200 - 1;
                                                    int var132 = class35.method5601();
                                                    if (var130 > 15000 && var132 > 15000) {
                                                        field570 = 250;
                                                        class36.method5353(14500);
                                                        class324 var133 = class324.method4244(class322.field3287, field569.field1458);
                                                        field569.method2829(var133);
                                                    }
                                                    Statics.field3011.method1912();
                                                    method4471();
                                                    field569.field1455++;
                                                    if (field569.field1455 > 50) {
                                                        class324 var134 = class324.method4244(class322.field3289, field569.field1458);
                                                        field569.method2829(var134);
                                                    }
                                                    try {
                                                        field569.method2828();
                                                    } catch (IOException var136) {
                                                        method5053();
                                                    }
                                                    Statics.method260().method4275();
                                                    return;
                                                }
                                                if (var90.field2916.field3828 == 12) {
                                                    var89 = true;
                                                }
                                                method5604(var90);
                                            }
                                        }
                                        var87 = var86.field1065;
                                        if (var87.field3876 < 0) {
                                            break;
                                        }
                                        var88 = Statics.field2667.method5964(var87.field3823);
                                    } while (var88 == null || var88.field3936 == null || var87.field3876 >= var88.field3936.length || var88.field3936[var87.field3876] != var87);
                                    class73.method7183(var86);
                                }
                            }
                            var84 = var83.field1065;
                            if (var84.field3876 < 0) {
                                break;
                            }
                            var85 = Statics.field2667.method5964(var84.field3823);
                        } while (var85 == null || var85.field3936 == null || var84.field3876 >= var85.field3936.length || var85.field3936[var84.field3876] != var84);
                        class73.method7183(var83);
                    }
                }
                var81 = var80.field1065;
                if (var81.field3876 < 0) {
                    break;
                }
                var82 = Statics.field2667.method5964(var81.field3823);
            } while (var82 == null || var82.field3936 == null || var81.field3876 >= var82.field3936.length || var82.field3936[var81.field3876] != var81);
            class73.method7183(var80);
        }
    }

    @ObfuscatedName("fl.he(I)V")
    public static final void method3185() {
        if (Statics.field1548 != null) {
            Statics.field1548.method771();
        }
    }

    @ObfuscatedName("fq.iu(Lkr;IIIZI)V")
    public static void method3149(class264 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (field666 < 50 && arg0.field2875 != null && arg1 < arg0.field2875.length && arg0.field2875[arg1] != null) {
            int var5 = arg0.field2875[arg1].field2728 & 0x1F;
            if ((var5 <= 0 || Statics.field1385.method2601() != 0) && (var5 != 0 || Statics.field1385.method2517() != 0)) {
                method5895(arg0.field2875[arg1], arg2, arg3, arg4);
            }
        }
    }

    @ObfuscatedName("fs.ie(Lkr;IIIZB)V")
    public static void method3109(class264 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (field666 >= 50 || arg0.field2869 == null || !arg0.field2869.containsKey(arg1)) {
            return;
        }
        class260 var5 = (class260) arg0.field2869.get(arg1);
        if (var5 != null) {
            int var6 = var5.field2728 & 0x1F;
            if ((var6 <= 0 || Statics.field1385.method2601() != 0) && (var6 != 0 || Statics.field1385.method2517() != 0)) {
                method5895(var5, arg2, arg3, arg4);
            }
        }
    }

    @ObfuscatedName("no.iy(Ljt;IIZI)V")
    public static void method5895(class260 arg0, int arg1, int arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (arg0.field2728 == 0) {
            if (!arg3) {
                return;
            }
            field756[field666] = 0;
        } else {
            int var4 = (arg1 - 64) / 128;
            int var5 = (arg2 - 64) / 128;
            field756[field666] = arg0.field2728 + (var4 << 16) + (var5 << 8);
        }
        field753[field666] = arg0.field2726;
        field754[field666] = arg0.field2725;
        field755[field666] = 0;
        field758[field666] = null;
        field757[field666] = arg0.field2727;
        field666++;
    }

    @ObfuscatedName("si.iq(IIII)V")
    public static void method8117(int arg0, int arg1, int arg2) {
        if (Statics.field1385.method2517() == 0 || arg1 == 0 || field666 >= 50) {
            return;
        }
        field753[field666] = arg0;
        field754[field666] = arg1;
        field755[field666] = arg2;
        field758[field666] = null;
        field756[field666] = 0;
        field757[field666] = 0;
        field666++;
    }

    @ObfuscatedName("qm.ig(II)V")
    public static void method7186(int arg0) {
        if (arg0 == -1 && !field751) {
            Statics.method2347(0, 0);
        } else if (arg0 != -1) {
            boolean var2;
            if (class333.field3566.isEmpty()) {
                var2 = false;
            } else {
                class345 var1 = (class345) class333.field3566.get(0);
                var2 = var1 != null && var1.field3675 == arg0;
            }
            if (!var2 && Statics.field1385.method2515() != 0) {
                ArrayList var3 = new ArrayList();
                var3.add(new class345(Statics.field156, arg0, 0, Statics.field1385.method2515(), false));
                if (field751) {
                    class333.method4346(var3, 0, 100, 100, 0);
                } else {
                    class333.method996(var3, 0, 100, 100, 0, false);
                }
            }
        }
    }

    @ObfuscatedName("gd.iz(Ljava/util/ArrayList;IIIIB)V")
    public static void method3330(ArrayList arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0.isEmpty()) {
            return;
        }
        int var5 = (Integer) arg0.get(0);
        if (var5 == -1 && !field751) {
            Statics.method2347(0, 0);
        } else if (var5 != -1) {
            boolean var7;
            if (class333.field3566.isEmpty()) {
                var7 = false;
            } else {
                class345 var6 = (class345) class333.field3566.get(0);
                var7 = var6 != null && var6.field3675 == var5;
            }
            if (!var7 && Statics.field1385.method2515() != 0) {
                ArrayList var8 = new ArrayList();
                for (int var9 = 0; var9 < arg0.size(); var9++) {
                    var8.add(new class345(Statics.field156, (Integer) arg0.get(var9), 0, Statics.field1385.method2515(), false));
                }
                if (field751) {
                    class333.method4346(var8, arg1, arg2, arg3, arg4);
                } else {
                    class333.method996(var8, arg1, arg2, arg3, arg4, false);
                }
            }
        }
    }

    @ObfuscatedName("dm.in(IIB)V")
    public static void method2311(int arg0, int arg1) {
        if (Statics.field1385.method2515() != 0 && arg0 != -1) {
            ArrayList var2 = new ArrayList();
            var2.add(new class345(Statics.field2112, arg0, 0, Statics.field1385.method2515(), false));
            class333.method996(var2, 0, 0, 0, 0, true);
            field751 = true;
        }
    }

    @ObfuscatedName("client.ip(III)V")
    public void method1175(int arg0, int arg1) {
        if (field569 != null && field569.field1458 != null && arg0 > -1 && Statics.field1385.method2515() > 0 && !field751) {
            class324 var3 = class324.method4244(class322.field3267, field569.field1458);
            var3.field3379.method9045(arg0);
            field569.method2829(var3);
        }
    }

    @ObfuscatedName("qr.il(I)V")
    public static final void method7134() {
        if (!Statics.field72) {
            return;
        }
        if (Statics.field70 != null) {
            Statics.field70.method7970();
        }
        for (int var0 = 0; var0 < Statics.field4799.field1322.field1399; var0++) {
            class94 var1 = Statics.field4799.field1317[Statics.field4799.field1322.field1401[var0]];
            var1.method2374();
        }
        Statics.field72 = false;
    }

    @ObfuscatedName("ft.io(B)V")
    public static final void method3200() {
        if (Statics.field3125) {
            method3827();
            Statics.field3125 = false;
        }
    }

    @ObfuscatedName("hv.it(Ldy;I)V")
    public static final void method4057(class102 arg0) {
        int[] var1 = arg0.field1322.field1401;
        for (int var2 = 0; var2 < arg0.field1322.field1399; var2++) {
            class94 var3 = arg0.field1317[var1[var2]];
            if (var3 != null && var3.field1204 > 0) {
                var3.field1204--;
                if (var3.field1204 == 0) {
                    var3.field1211 = null;
                }
            }
        }
        for (int var4 = 0; var4 < arg0.field1316; var4++) {
            int var5 = arg0.field1320[var4];
            class104 var6 = arg0.field1318[var5];
            if (var6 != null && var6.field1204 > 0) {
                var6.field1204--;
                if (var6.field1204 == 0) {
                    var6.field1211 = null;
                }
            }
        }
    }

    @ObfuscatedName("ie.ik(Ljava/lang/String;B)V")
    public static final void method4145(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field1385.method2501(!Statics.field1385.method2502());
            if (Statics.field1385.method2502()) {
                class114.method4997(99, "", "Roofs are now all hidden");
            } else {
                class114.method4997(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.startsWith("zbuf")) {
            boolean var1 = class417.method1138(arg0.substring(5).trim()) == 1;
            Statics.field997.method583(var1);
            class181.method3437(var1);
        }
        if (arg0.equalsIgnoreCase("z")) {
            field537 = !field537;
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            Statics.field1385.method2508();
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            field577 = !field577;
        }
        if (arg0.equalsIgnoreCase("mouseovertext")) {
            field668 = !field668;
        }
        if (arg0.startsWith("setdrawdistance")) {
            String[] var2 = arg0.split(" ");
            try {
                int var3 = Integer.parseInt(var2[1]);
                Statics.field1385.method2530(var3);
            } catch (NumberFormatException var10) {
                class114.method4997(99, "", String.format("Error setting draw distance. setdrawdistance should be in the format \"::setdrawdistance X\" where X is a valid number. Value provided: %s", var2[1]));
            }
        }
        if (arg0.startsWith("settilerendermode")) {
            String[] var5 = arg0.split(" ");
            try {
                int var6 = Integer.parseInt(var5[1]);
                Statics.field4799.field1328.method3636(class174.method3339()[var6]);
            } catch (NumberFormatException var9) {
                class114.method4997(99, "", String.format("Error setting tile render mode. settilerendermode should be in the format \"::settilerendermode X\" where X is a valid number from 0-1. 0=camera 1=target Value provided: %s", var5[1]));
            }
        }
        if (arg0.equalsIgnoreCase("getdrawdistance")) {
            class114.method4997(99, "", String.format("%d", Statics.field1385.method2604()));
        }
        if (field675 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equalsIgnoreCase("showcoord")) {
                Statics.field2389.field5208 = !Statics.field2389.field5208;
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                Statics.field1385.method2507(true);
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                Statics.field1385.method2507(false);
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method5053();
            }
        }
        class324 var8 = class324.method4244(class322.field3279, field569.field1458);
        var8.field3379.method8781(arg0.length() + 1);
        var8.field3379.method8869(arg0);
        field569.method2829(var8);
    }

    @ObfuscatedName("iw.ii(II)I")
    public static final int method4335(int arg0) {
        return Math.min(Math.max(arg0, 128), 383);
    }

    @ObfuscatedName("pc.is(IB)I")
    public static final int method6810(int arg0) {
        return Math.abs(arg0 - Statics.field2888) > 1024 ? arg0 + (arg0 < Statics.field2888 ? 1 : -1) * 2048 : arg0;
    }

    @ObfuscatedName("hn.iw(I)V")
    public static final void method3825() {
        method8565(Statics.field4557, Statics.field2388, Statics.field4704);
        method6740(Statics.field3005, Statics.field2119);
        if (Statics.field4736 != Statics.field4557 || Statics.field65 != Statics.field2388 || Statics.field4704 != Statics.field3140 || Statics.field3005 != Statics.field1500 || Statics.field2888 != Statics.field2119) {
            return;
        }
        field766 = false;
        field538 = false;
        field760 = false;
        field761 = false;
        Statics.field1722 = 0;
        Statics.field2418 = 0;
        Statics.field4603 = 0;
        Statics.field2614 = 0;
        Statics.field462 = 0;
        Statics.field828 = 0;
        Statics.field501 = 0;
        Statics.field1794 = 0;
        Statics.field3546 = 0;
        Statics.field2087 = 0;
        field763 = null;
        field616 = null;
        field518 = null;
    }

    @ObfuscatedName("uh.ib(IIII)V")
    public static final void method8565(int arg0, int arg1, int arg2) {
        if (Statics.field4736 < arg0) {
            Statics.field4736 += Statics.field828 * (arg0 - Statics.field4736) / 1000 + Statics.field501;
            if (Statics.field4736 > arg0) {
                Statics.field4736 = arg0;
            }
        }
        if (Statics.field4736 > arg0) {
            Statics.field4736 -= Statics.field828 * (Statics.field4736 - arg0) / 1000 + Statics.field501;
            if (Statics.field4736 < arg0) {
                Statics.field4736 = arg0;
            }
        }
        if (Statics.field65 < arg1) {
            Statics.field65 += Statics.field828 * (arg1 - Statics.field65) / 1000 + Statics.field501;
            if (Statics.field65 > arg1) {
                Statics.field65 = arg1;
            }
        }
        if (Statics.field65 > arg1) {
            Statics.field65 -= Statics.field828 * (Statics.field65 - arg1) / 1000 + Statics.field501;
            if (Statics.field65 < arg1) {
                Statics.field65 = arg1;
            }
        }
        if (Statics.field3140 < arg2) {
            Statics.field3140 += Statics.field828 * (arg2 - Statics.field3140) / 1000 + Statics.field501;
            if (Statics.field3140 > arg2) {
                Statics.field3140 = arg2;
            }
        }
        if (Statics.field3140 > arg2) {
            Statics.field3140 -= Statics.field828 * (Statics.field3140 - arg2) / 1000 + Statics.field501;
            if (Statics.field3140 < arg2) {
                Statics.field3140 = arg2;
            }
        }
    }

    @ObfuscatedName("or.if(III)V")
    public static final void method6740(int arg0, int arg1) {
        if (arg0 < 128) {
            arg0 = 128;
        } else if (arg0 > 383) {
            arg0 = 383;
        }
        if (Statics.field1500 < arg0) {
            Statics.field1500 += Statics.field462 * (arg0 - Statics.field1500) / 1000 + Statics.field2614;
            if (Statics.field1500 > arg0) {
                Statics.field1500 = arg0;
            }
        } else if (Statics.field1500 > arg0) {
            Statics.field1500 -= Statics.field462 * (Statics.field1500 - arg0) / 1000 + Statics.field2614;
            if (Statics.field1500 < arg0) {
                Statics.field1500 = arg0;
            }
        }
        int var2 = arg1 & 0x7FF;
        int var3 = var2 - Statics.field2888;
        if (var3 > 1024) {
            var3 -= 2048;
        } else if (var3 < -1024) {
            var3 += 2048;
        }
        if (var3 > 0) {
            Statics.field2888 += Statics.field462 * var3 / 1000 + Statics.field2614;
            Statics.field2888 &= 0x7FF;
        } else if (var3 < 0) {
            Statics.field2888 -= Statics.field462 * -var3 / 1000 + Statics.field2614;
            Statics.field2888 &= 0x7FF;
        }
        int var4 = var2 - Statics.field2888;
        if (var4 > 1024) {
            var4 -= 2048;
        } else if (var4 < -1024) {
            var4 += 2048;
        }
        if (var4 < 0 && var3 > 0 || var4 > 0 && var3 < 0) {
            Statics.field2888 = var2;
        }
    }

    @ObfuscatedName("pn.id(I)V")
    public static final void method6864() {
        if (!field760) {
            int var0 = class379.method6569(Statics.field1794);
            int var1 = class379.method6569(Statics.field3546);
            int var2 = method3285(Statics.field4799, var0, var1, Statics.field4799.field1308) - Statics.field2087;
            method8565(var0, var2, var1);
        } else if (field763 != null) {
            Statics.field4736 = field763.method8253();
            Statics.field3140 = field763.method8252();
            if (field515) {
                Statics.field65 = field763.method8259();
            } else {
                Statics.field65 = method3285(Statics.field4799, Statics.field4736, Statics.field3140, Statics.field4799.field1308) - field763.method8259();
            }
            field763.method8271();
        }
        if (field761) {
            if (field616 != null) {
                Statics.field1500 = field616.method8264();
                Statics.field1500 = Math.min(Math.max(Statics.field1500, 128), 383);
                field616.method8271();
            }
            if (field518 != null) {
                Statics.field2888 = field518.method8264() & 0x7FF;
                field518.method8271();
            }
            return;
        }
        int var3 = class379.method6569(Statics.field1722);
        int var4 = class379.method6569(Statics.field2418);
        int var5 = method3285(Statics.field4799, var3, var4, Statics.field4799.field1308) - Statics.field4603;
        int var6 = var3 - Statics.field4736;
        int var7 = var5 - Statics.field65;
        int var8 = var4 - Statics.field3140;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.9490051269531D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.9490051269531D) & 0x7FF;
        method6740(var10, var11);
    }

    @ObfuscatedName("ko.ir(Ldy;I)V")
    public static void method5052(class102 arg0) {
        for (int var1 = 0; var1 < arg0.field1307; var1++) {
            int var2 = arg0.field1323[var1];
            class478 var3 = arg0.field1321[var2];
            if (var3 != null) {
                var3.method8046();
            }
        }
    }

    @ObfuscatedName("lr.ij(Ldy;Ldt;II)V")
    public static final void method5412(class102 arg0, class98 arg1, int arg2) {
        if (arg1.field1236 >= field519) {
            method3290(arg1);
        } else if (arg1.field1237 >= field519) {
            method2909(arg1);
        } else {
            arg1.field1208 = arg1.field1186;
            if (arg1.field1217 == 0) {
                arg1.field1254 = 0;
            } else {
                label604: {
                    if (arg1.field1257 != -1 && arg1.field1228 == 0) {
                        class264 var3 = class264.method3551(arg1.field1257);
                        if (arg1.field1256 > 0 && var3.field2867 == 0) {
                            arg1.field1254++;
                            break label604;
                        }
                        if (arg1.field1256 <= 0 && var3.field2886 == 0) {
                            arg1.field1254++;
                            break label604;
                        }
                    }
                    int var4 = arg1.field1249;
                    int var5 = arg1.field1180;
                    int var6 = arg1.field1251[arg1.field1217 - 1] * 128 + arg1.field1184 * 64;
                    int var7 = arg1.field1181[arg1.field1217 - 1] * 128 + arg1.field1184 * 64;
                    if (var4 < var6) {
                        if (var5 < var7) {
                            arg1.field1247 = 1280;
                        } else if (var5 > var7) {
                            arg1.field1247 = 1792;
                        } else {
                            arg1.field1247 = 1536;
                        }
                    } else if (var4 > var6) {
                        if (var5 < var7) {
                            arg1.field1247 = 768;
                        } else if (var5 > var7) {
                            arg1.field1247 = 256;
                        } else {
                            arg1.field1247 = 512;
                        }
                    } else if (var5 < var7) {
                        arg1.field1247 = 1024;
                    } else if (var5 > var7) {
                        arg1.field1247 = 0;
                    }
                    class275 var8 = arg1.field1253[arg1.field1217 - 1];
                    if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                        int var9 = arg1.field1247 - arg1.field1182 & 0x7FF;
                        if (var9 > 1024) {
                            var9 -= 2048;
                        }
                        int var10 = arg1.field1190;
                        if (var9 >= -256 && var9 <= 256) {
                            var10 = arg1.field1239;
                        } else if (var9 >= 256 && var9 < 768) {
                            var10 = arg1.field1192;
                        } else if (var9 >= -768 && var9 <= -256) {
                            var10 = arg1.field1191;
                        }
                        if (var10 == -1) {
                            var10 = arg1.field1239;
                        }
                        arg1.field1208 = var10;
                        int var11 = 4;
                        boolean var12 = true;
                        if (arg1 instanceof class104) {
                            var12 = ((class104) arg1).field1340.field2575;
                        }
                        if (var12) {
                            if (arg1.field1247 != arg1.field1182 && arg1.field1215 == -1 && arg1.field1222 != 0) {
                                var11 = 2;
                            }
                            if (arg1.field1217 > 2) {
                                var11 = 6;
                            }
                            if (arg1.field1217 > 3) {
                                var11 = 8;
                            }
                            if (arg1.field1254 > 0 && arg1.field1217 > 1) {
                                var11 = 8;
                                arg1.field1254--;
                            }
                        } else {
                            if (arg1.field1217 > 1) {
                                var11 = 6;
                            }
                            if (arg1.field1217 > 2) {
                                var11 = 8;
                            }
                            if (arg1.field1254 > 0 && arg1.field1217 > 1) {
                                var11 = 8;
                                arg1.field1254--;
                            }
                        }
                        if (class275.field2985 == var8) {
                            var11 <<= 0x1;
                        } else if (class275.field2988 == var8) {
                            var11 >>= 0x1;
                        }
                        if (var11 >= 8) {
                            if (arg1.field1239 == arg1.field1208 && arg1.field1194 != -1) {
                                arg1.field1208 = arg1.field1194;
                            } else if (arg1.field1208 == arg1.field1190 && arg1.field1252 != -1) {
                                arg1.field1208 = arg1.field1252;
                            } else if (arg1.field1208 == arg1.field1191 && arg1.field1195 != -1) {
                                arg1.field1208 = arg1.field1195;
                            } else if (arg1.field1208 == arg1.field1192 && arg1.field1196 != -1) {
                                arg1.field1208 = arg1.field1196;
                            }
                        } else if (var11 <= 2) {
                            if (arg1.field1239 == arg1.field1208 && arg1.field1197 != -1) {
                                arg1.field1208 = arg1.field1197;
                            } else if (arg1.field1208 == arg1.field1190 && arg1.field1198 != -1) {
                                arg1.field1208 = arg1.field1198;
                            } else if (arg1.field1208 == arg1.field1191 && arg1.field1189 != -1) {
                                arg1.field1208 = arg1.field1189;
                            } else if (arg1.field1208 == arg1.field1192 && arg1.field1200 != -1) {
                                arg1.field1208 = arg1.field1200;
                            }
                        }
                        if (var4 != var6 || var5 != var7) {
                            if (var4 < var6) {
                                arg1.field1249 += var11;
                                if (arg1.field1249 > var6) {
                                    arg1.field1249 = var6;
                                }
                            } else if (var4 > var6) {
                                arg1.field1249 -= var11;
                                if (arg1.field1249 < var6) {
                                    arg1.field1249 = var6;
                                }
                            }
                            if (var5 < var7) {
                                arg1.field1180 += var11;
                                if (arg1.field1180 > var7) {
                                    arg1.field1180 = var7;
                                }
                            } else if (var5 > var7) {
                                arg1.field1180 -= var11;
                                if (arg1.field1180 < var7) {
                                    arg1.field1180 = var7;
                                }
                            }
                        }
                        if (arg1.field1249 == var6 && arg1.field1180 == var7) {
                            arg1.field1217--;
                            if (arg1.field1256 > 0) {
                                arg1.field1256--;
                            }
                        }
                    } else {
                        arg1.field1249 = var6;
                        arg1.field1180 = var7;
                        arg1.field1217--;
                        if (arg1.field1256 > 0) {
                            arg1.field1256--;
                        }
                    }
                }
            }
        }
        if (arg1.field1249 < 128 || 13184 <= arg1.field1249 || arg1.field1180 < 128 || 13184 <= arg1.field1180) {
            arg1.field1257 = -1;
            arg1.field1236 = 0;
            arg1.field1237 = 0;
            arg1.method2449();
            arg1.field1249 = arg1.field1251[0] * 128 + arg1.field1184 * 64;
            arg1.field1180 = arg1.field1181[0] * 128 + arg1.field1184 * 64;
            arg1.method2446();
        }
        if (Statics.field2672 == arg1 && (arg1.field1249 < 1536 || 11776 <= arg1.field1249 || arg1.field1180 < 1536 || 11776 <= arg1.field1180)) {
            arg1.field1257 = -1;
            arg1.field1236 = 0;
            arg1.field1237 = 0;
            arg1.method2449();
            arg1.field1249 = arg1.field1251[0] * 128 + arg1.field1184 * 64;
            arg1.field1180 = arg1.field1181[0] * 128 + arg1.field1184 * 64;
            arg1.method2446();
        }
        if (arg1.field1215 != -1) {
            Object var13 = null;
            int var14 = 65536;
            class98 var15;
            if (arg1.field1215 < var14) {
                var15 = arg0.field1318[arg1.field1215];
            } else {
                var15 = arg0.field1317[arg1.field1215 - var14];
            }
            if (var15 != null) {
                int var16 = arg1.field1249 - var15.field1249;
                int var17 = arg1.field1180 - var15.field1180;
                if (var16 != 0 || var17 != 0) {
                    int var19 = (int) (Math.atan2((double) var16, (double) var17) * 325.94932345220167D) & 0x7FF;
                    arg1.field1247 = var19;
                }
            } else if (arg1.field1216) {
                arg1.field1215 = -1;
                arg1.field1216 = false;
            }
        }
        if (arg1.field1217 == 0 || arg1.field1254 > 0) {
            int var20 = -1;
            if (arg1.field1201 != -1 && arg1.field1219 != -1) {
                int var21 = class379.method6569(arg1.field1201 - Statics.field4799.field1311);
                int var22 = class379.method6569(arg1.field1219 - Statics.field4799.field1319);
                int var23 = arg1.field1249 - var21;
                int var24 = arg1.field1180 - var22;
                if (var23 != 0 || var24 != 0) {
                    int var25 = (int) (Math.atan2((double) var23, (double) var24) * 325.94932345220167D) & 0x7FF;
                    var20 = var25;
                }
            } else if (arg1.field1255 != -1) {
                var20 = arg1.field1255;
            }
            if (var20 != -1) {
                arg1.field1247 = var20;
                if (arg1.field1220) {
                    arg1.field1182 = arg1.field1247;
                }
            }
            arg1.method2428();
        }
        int var26 = arg1.field1247 - arg1.field1182 & 0x7FF;
        if (var26 == 0) {
            if (arg1.field1216) {
                arg1.field1215 = -1;
                arg1.field1216 = false;
            }
            arg1.field1248 = 0;
        } else {
            boolean var27 = true;
            boolean var28 = true;
            arg1.field1248++;
            int var29 = var26 > 1024 ? -1 : 1;
            arg1.field1182 += arg1.field1222 * var29;
            boolean var30 = true;
            if (var26 < arg1.field1222 || var26 > 2048 - arg1.field1222) {
                arg1.field1182 = arg1.field1247;
                var30 = false;
            }
            if (arg1.field1222 > 0 && arg1.field1208 == arg1.field1186 && (arg1.field1248 > 25 || var30)) {
                if (var29 == -1 && arg1.field1187 != -1) {
                    arg1.field1208 = arg1.field1187;
                } else if (var29 == 1 && arg1.field1203 != -1) {
                    arg1.field1208 = arg1.field1203;
                } else {
                    arg1.field1208 = arg1.field1239;
                }
            }
            arg1.field1182 &= 0x7FF;
        }
        arg1.field1227 = false;
        if (arg1.field1208 != -1) {
            class264 var32 = class264.method3551(arg1.field1208);
            if (var32 == null) {
                arg1.field1208 = -1;
            } else if (!var32.method4915() && var32.field2872 != null) {
                arg1.field1223++;
                if (arg1.field1183 < var32.field2872.length && arg1.field1223 > var32.field2874[arg1.field1183]) {
                    arg1.field1223 = 1;
                    arg1.field1183++;
                    method3149(var32, arg1.field1183, arg1.field1249, arg1.field1180, Statics.field2672 == arg1);
                }
                if (arg1.field1183 >= var32.field2872.length) {
                    if (var32.field2876 > 0) {
                        arg1.field1183 -= var32.field2876;
                        if (var32.field2884) {
                            arg1.field1193++;
                        }
                        if (arg1.field1183 < 0 || arg1.field1183 >= var32.field2872.length || var32.field2884 && arg1.field1193 >= var32.field2883) {
                            arg1.field1223 = 0;
                            arg1.field1183 = 0;
                            arg1.field1193 = 0;
                        }
                    } else {
                        arg1.field1223 = 0;
                        arg1.field1183 = 0;
                    }
                    method3149(var32, arg1.field1183, arg1.field1249, arg1.field1180, Statics.field2672 == arg1);
                }
            } else if (var32.method4915()) {
                arg1.field1183++;
                int var33 = var32.method4907();
                if (arg1.field1183 < var33) {
                    method3109(var32, arg1.field1183, arg1.field1249, arg1.field1180, Statics.field2672 == arg1);
                } else {
                    if (var32.field2876 > 0) {
                        arg1.field1183 -= var32.field2876;
                        if (var32.field2884) {
                            arg1.field1193++;
                        }
                        if (arg1.field1183 < 0 || arg1.field1183 >= var33 || var32.field2884 && arg1.field1193 >= var32.field2883) {
                            arg1.field1183 = 0;
                            arg1.field1223 = 0;
                            arg1.field1193 = 0;
                        }
                    } else {
                        arg1.field1223 = 0;
                        arg1.field1183 = 0;
                    }
                    method3109(var32, arg1.field1183, arg1.field1249, arg1.field1180, Statics.field2672 == arg1);
                }
            } else {
                arg1.field1208 = -1;
            }
        }
        class520 var34 = new class520(arg1.method2426());
        for (class479 var35 = (class479) var34.method8504(); var35 != null; var35 = (class479) var34.next()) {
            if (var35.field4960 != -1 && field519 >= var35.field4957) {
                int var36 = class251.method5487(var35.field4960).field2649;
                if (var36 == -1) {
                    var35.method8218();
                    arg1.field1231--;
                } else {
                    var35.field4958 = Math.max(var35.field4958, 0);
                    class264 var37 = class264.method3551(var36);
                    if (var37.field2872 != null && !var37.method4915()) {
                        var35.field4959++;
                        if (var35.field4958 < var37.field2872.length && var35.field4959 > var37.field2874[var35.field4958]) {
                            var35.field4959 = 1;
                            var35.field4958++;
                            method3149(var37, var35.field4958, arg1.field1249, arg1.field1180, Statics.field2672 == arg1);
                        }
                        if (var35.field4958 >= var37.field2872.length) {
                            var35.method8218();
                            arg1.field1231--;
                        }
                    } else if (var37.method4915()) {
                        var35.field4958++;
                        int var38 = var37.method4907();
                        if (var35.field4958 < var38) {
                            method3109(var37, var35.field4958, arg1.field1249, arg1.field1180, Statics.field2672 == arg1);
                        } else {
                            var35.method8218();
                            arg1.field1231--;
                        }
                    } else {
                        var35.method8218();
                        arg1.field1231--;
                    }
                }
            }
        }
        if (arg1.field1257 != -1 && arg1.field1228 <= 1) {
            class264 var39 = class264.method3551(arg1.field1257);
            if (var39.field2867 == 1 && arg1.field1256 > 0 && arg1.field1236 <= field519 && arg1.field1237 < field519) {
                arg1.field1228 = 1;
                return;
            }
        }
        if (arg1.field1257 != -1 && arg1.field1228 == 0) {
            class264 var40 = class264.method3551(arg1.field1257);
            if (var40 == null) {
                arg1.field1257 = -1;
            } else if (!var40.method4915() && var40.field2872 != null) {
                arg1.field1212++;
                if (arg1.field1226 < var40.field2872.length && arg1.field1212 > var40.field2874[arg1.field1226]) {
                    arg1.field1212 = 1;
                    arg1.field1226++;
                    method3149(var40, arg1.field1226, arg1.field1249, arg1.field1180, Statics.field2672 == arg1);
                }
                if (arg1.field1226 >= var40.field2872.length) {
                    arg1.field1226 -= var40.field2876;
                    arg1.field1229++;
                    if (arg1.field1229 >= var40.field2883) {
                        arg1.field1257 = -1;
                    } else if (arg1.field1226 >= 0 && arg1.field1226 < var40.field2872.length) {
                        method3149(var40, arg1.field1226, arg1.field1249, arg1.field1180, Statics.field2672 == arg1);
                    } else {
                        arg1.field1257 = -1;
                    }
                }
                arg1.field1227 = var40.field2873;
            } else if (var40.method4915()) {
                arg1.field1226++;
                int var41 = var40.method4907();
                if (arg1.field1226 < var41) {
                    method3109(var40, arg1.field1226, arg1.field1249, arg1.field1180, Statics.field2672 == arg1);
                } else {
                    arg1.field1226 -= var40.field2876;
                    arg1.field1229++;
                    if (arg1.field1229 >= var40.field2883) {
                        arg1.field1257 = -1;
                    } else if (arg1.field1226 >= 0 && arg1.field1226 < var41) {
                        method3109(var40, arg1.field1226, arg1.field1249, arg1.field1180, Statics.field2672 == arg1);
                    } else {
                        arg1.field1257 = -1;
                    }
                }
            } else {
                arg1.field1257 = -1;
            }
        }
        if (arg1.field1228 > 0) {
            arg1.field1228--;
        }
    }

    @ObfuscatedName("gn.im(Ldt;I)V")
    public static final void method3290(class98 arg0) {
        int var1 = Math.max(1, arg0.field1236 - field519);
        int var2 = arg0.field1232 * 128 + arg0.field1184 * 64;
        int var3 = arg0.field1234 * 128 + arg0.field1184 * 64;
        arg0.field1249 += (var2 - arg0.field1249) / var1;
        arg0.field1180 += (var3 - arg0.field1180) / var1;
        arg0.field1254 = 0;
        arg0.field1247 = arg0.field1238;
    }

    @ObfuscatedName("ev.ia(Ldt;S)V")
    public static final void method2909(class98 arg0) {
        boolean var1 = field519 == arg0.field1237 || arg0.field1257 == -1 || arg0.field1228 != 0;
        if (!var1) {
            class264 var2 = class264.method3551(arg0.field1257);
            if (var2 == null || var2.method4915()) {
                var1 = true;
            } else {
                var1 = arg0.field1212 + 1 > var2.field2874[arg0.field1226];
            }
        }
        if (var1) {
            int var3 = arg0.field1237 - arg0.field1236;
            int var4 = field519 - arg0.field1236;
            int var5 = arg0.field1232 * 128 + arg0.field1184 * 64;
            int var6 = arg0.field1234 * 128 + arg0.field1184 * 64;
            int var7 = arg0.field1233 * 128 + arg0.field1184 * 64;
            int var8 = arg0.field1235 * 128 + arg0.field1184 * 64;
            arg0.field1249 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg0.field1180 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg0.field1254 = 0;
        arg0.field1247 = arg0.field1238;
        arg0.field1182 = arg0.field1247;
    }

    @ObfuscatedName("cf.iv(B)V")
    public static void method1852() {
        if (Statics.field2389 != null) {
            Statics.field2389.method8304(Statics.field4799.field1308, (Statics.field3728.method1152() >> 7) + Statics.field4799.field1311, (Statics.field3728.method1156() >> 7) + Statics.field4799.field1319, false);
            Statics.field2389.method8381();
        }
    }

    @ObfuscatedName("ca.ih(Ldw;IIB)V")
    public static void method2176(class94 arg0, int arg1, int arg2) {
        if (arg0.field1257 == arg1 && arg1 != -1) {
            int var3 = class264.method3551(arg1).field2887;
            if (var3 == 1) {
                arg0.field1226 = 0;
                arg0.field1212 = 0;
                arg0.field1228 = arg2;
                arg0.field1229 = 0;
            }
            if (var3 == 2) {
                arg0.field1229 = 0;
            }
        } else if (arg1 == -1 || arg0.field1257 == -1 || class264.method3551(arg1).field2868 >= class264.method3551(arg0.field1257).field2868) {
            arg0.field1257 = arg1;
            arg0.field1226 = 0;
            arg0.field1212 = 0;
            arg0.field1228 = arg2;
            arg0.field1229 = 0;
            arg0.field1256 = arg0.field1217;
        }
    }

    @ObfuscatedName("fu.ic(I)I")
    public static int method3176() {
        return field614 ? 2 : 1;
    }

    @ObfuscatedName("jz.ja(II)V")
    public static void method4628(int arg0) {
        field725 = 0L;
        if (arg0 >= 2) {
            field614 = true;
        } else {
            field614 = false;
        }
        if (method3176() == 1) {
            Statics.field997.method458(765, 503);
        } else {
            Statics.field997.method458(7680, 2160);
        }
        if (field609 < 25 || field569 == null || field569.field1458 == null) {
            return;
        }
        class324 var1 = class324.method4244(class322.field3334, field569.field1458);
        var1.field3379.method8781(method3176());
        var1.field3379.method8782(Statics.field1345);
        var1.field3379.method8782(Statics.field467);
        field569.method2829(var1);
    }

    @ObfuscatedName("client.ag(S)V")
    public final void method485() {
        field725 = class329.method5009() + 500L;
        this.method1177();
        if (field667 != -1) {
            this.method1184(true);
        }
    }

    @ObfuscatedName("client.js(B)V")
    public void method1177() {
        int var1 = Statics.field1345;
        int var2 = Statics.field467;
        if (this.field170 < var1) {
            int var3 = this.field170;
        }
        if (this.field171 < var2) {
            int var4 = this.field171;
        }
        if (Statics.field1385 == null) {
            return;
        }
        try {
            client var5 = Statics.field997;
            Object[] var6 = new Object[] { method3176() };
            JSObject.getWindow(var5).call("resize", var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("client.jr(B)V")
    public final void method1178() {
        if (field667 != -1) {
            method3213(field667);
        }
        for (int var1 = 0; var1 < field715; var1++) {
            if (field717[var1]) {
                field686[var1] = true;
            }
            field764[var1] = field717[var1];
            field717[var1] = false;
        }
        field687 = field519;
        field655 = -1;
        field656 = -1;
        if (field667 != -1) {
            field715 = 0;
            method2103(field667, 0, 0, Statics.field1345, Statics.field467, 0, 0, -1);
        }
        class559.method9184();
        if (field627) {
            if (field626 == 1) {
                Statics.field3687[field511 / 100].method9284(field623 - 8, field624 - 8);
            }
            if (field626 == 2) {
                Statics.field3687[field511 / 100 + 4].method9284(field623 - 8, field624 - 8);
            }
        }
        if (field694) {
            field651.method9443();
        } else if (field655 != -1) {
            int var2 = field655;
            int var3 = field656;
            if ((field651.field5519 >= 2 || field659 != 0 || field661) && field668) {
                int var4 = field651.field5519 - 1;
                String var6;
                if (field659 == 1 && field651.field5519 < 2) {
                    var6 = class380.field4255 + class380.field4112 + field660 + " " + class105.field1350;
                } else if (field661 && field651.field5519 < 2) {
                    var6 = field664 + class380.field4112 + field665 + " " + class105.field1350;
                } else {
                    var6 = field651.method9421(var4);
                }
                if (field651.field5519 > 2) {
                    var6 = var6 + class105.method7315(16777215) + " " + '/' + " " + (field651.field5519 - 2) + class380.field4259;
                }
                Statics.field3034.method7546(var6, var2 + 4, var3 + 15, 16777215, 0, field519 / 1000);
            }
        }
        if (field724 == 3) {
            for (int var7 = 0; var7 < field715; var7++) {
                if (field764[var7]) {
                    class559.method9122(field625[var7], field721[var7], field722[var7], field723[var7], 16711935, 128);
                } else if (field686[var7]) {
                    class559.method9122(field625[var7], field721[var7], field722[var7], field723[var7], 16711680, 128);
                }
            }
        }
        class72.method5876(Statics.field4799.field1308, Statics.field2672.field1249, Statics.field2672.field1180, field584);
        field584 = 0;
    }

    @ObfuscatedName("ji.jd(Ljava/lang/String;ZI)V")
    public static final void method4507(String arg0, boolean arg1) {
        if (!field629) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field4572.method7530(arg0, 250);
        int var6 = Statics.field4572.method7536(arg0, 250) * 13;
        class559.method9145(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class559.method9127(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field4572.method7538(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        int var7 = var3 - var2;
        int var8 = var4 - var2;
        int var9 = var2 + var5 + var2;
        int var10 = var2 + var6 + var2;
        for (int var11 = 0; var11 < field715; var11++) {
            if (field722[var11] + field625[var11] > var7 && field625[var11] < var7 + var9 && field723[var11] + field721[var11] > var8 && field721[var11] < var8 + var10) {
                field717[var11] = true;
            }
        }
        if (arg1) {
            Statics.field3197.method435(0, 0);
            return;
        }
        int var12 = var3;
        int var13 = var4;
        int var14 = var5;
        int var15 = var6;
        for (int var16 = 0; var16 < field715; var16++) {
            if (field722[var16] + field625[var16] > var12 && field625[var16] < var12 + var14 && field723[var16] + field721[var16] > var13 && field721[var16] < var13 + var15) {
                field686[var16] = true;
            }
        }
    }

    @ObfuscatedName("gu.je(IIIII)V")
    public static final void method3302(int arg0, int arg1, int arg2, int arg3) {
        field628++;
        Statics.field4799.field1328.field1988 = field519;
        method818();
        class102 var4 = Statics.field4799;
        if (field577) {
            method4436(var4, field630, false);
        }
        Statics.method2313(Statics.field4799);
        method3333(Statics.field4799, true);
        method4196(Statics.field4799);
        method3333(Statics.field4799, false);
        method2596(Statics.field4799);
        method2320(Statics.field4799);
        method776(Statics.field4799);
        method1066(arg0, arg1, arg2, arg3, true);
        int var5 = field606;
        int var6 = field781;
        int var7 = field782;
        int var8 = field783;
        class559.method9119(var5, var6, var5 + var7, var6 + var8);
        class181.method3483();
        class559.method9136();
        int var9 = field591;
        if (field502 / 256 > var9) {
            var9 = field502 / 256;
        }
        if (field765[4] && field769[4] + 128 > var9) {
            var9 = field769[4] + 128;
        }
        int var10 = field592 & 0x7FF;
        int var11 = Statics.field1524;
        int var12 = Statics.field1258;
        int var13 = Statics.field5062;
        int var16 = var9 * 3 + 600;
        method3592(var11, var12, var13, var9, var10, var16, var8);
        int var17;
        if (field538) {
            var17 = method6353();
        } else {
            var17 = method5656();
        }
        int var18 = Statics.field4736;
        int var19 = Statics.field65;
        int var20 = Statics.field3140;
        int var21 = Statics.field1500;
        int var22 = Statics.field2888;
        for (int var23 = 0; var23 < 5; var23++) {
            if (field765[var23]) {
                int var24 = (int) (Math.random() * (double) (field509[var23] * 2 + 1) - (double) field509[var23] + Math.sin((double) field770[var23] / 100.0D * (double) field771[var23]) * (double) field769[var23]);
                if (var23 == 0) {
                    Statics.field4736 += var24;
                }
                if (var23 == 1) {
                    Statics.field65 += var24;
                }
                if (var23 == 2) {
                    Statics.field3140 += var24;
                }
                if (var23 == 3) {
                    Statics.field2888 = Statics.field2888 + var24 & 0x7FF;
                }
                if (var23 == 4) {
                    Statics.field1500 += var24;
                    if (Statics.field1500 < 128) {
                        Statics.field1500 = 128;
                    }
                    if (Statics.field1500 > 383) {
                        Statics.field1500 = 383;
                    }
                }
            }
        }
        int var25 = class36.field204;
        int var26 = class36.field205;
        if (class36.field211 != 0) {
            var25 = class36.field216;
            var26 = class36.field213;
        }
        if (var25 >= var5 && var25 < var5 + var7 && var26 >= var6 && var26 < var6 + var8) {
            class198.method3113(var25 - var5, var26 - var6);
        } else {
            Statics.method3174();
        }
        method3185();
        class559.method9145(var5, var6, var7, var8, 0);
        method3185();
        int var27 = class181.method3447();
        class181.method3437(Statics.field997.field178);
        class181.field1943.field2263 = field784;
        int var28 = Statics.field3728.method1152();
        int var29 = Statics.field3728.method1156();
        Statics.field4799.field1328.method3762(Statics.field4736, Statics.field65, Statics.field3140, Statics.field1500, Statics.field2888, var17, var28, var29, field538);
        class181.method3437(false);
        if (field537) {
            class559.method9137();
        }
        class181.field1943.field2263 = var27;
        method3185();
        Statics.field4799.field1328.method3785();
        for (int var30 = 0; var30 < Statics.field4799.field1307; var30++) {
            class478 var31 = Statics.field4799.field1321[Statics.field4799.field1323[var30]];
            if (var31 != null) {
                var31.field4947.field1328.method3785();
            }
        }
        method7751(Statics.field4799, var5, var6, var7, var8);
        for (int var32 = 0; var32 < Statics.field4799.field1307; var32++) {
            class478 var33 = Statics.field4799.field1321[Statics.field4799.field1323[var32]];
            if (var33 != null) {
                method7751(var33.field4947, var5, var6, var7, var8);
            }
        }
        class102 var34 = Statics.field4799;
        if (field527 == 2) {
            int var35 = (field640 - var34.field1311 << 7) + field645;
            int var36 = (field531 - var34.field1319 << 7) + field534;
            method2318(var34, var35, var36, var35, var36, field720 * 2);
            if (field747 > -1 && field519 % 20 < 10) {
                Statics.field2373[0].method9284(field747 + var5 - 12, field622 + var6 - 28);
            }
        }
        ((class193) class181.field1943.field2264).method3850(field584);
        method3258();
        Statics.field4736 = var18;
        Statics.field65 = var19;
        Statics.field3140 = var20;
        Statics.field1500 = var21;
        Statics.field2888 = var22;
        if (field536 && Statics.field981.method6756(true, false) == 0) {
            field536 = false;
        }
        if (field536) {
            class559.method9145(var5, var6, var7, var8, 0);
            method4507(class380.field4239, false);
        }
    }

    @ObfuscatedName("cr.jp(IIIIZB)V")
    public static final void method1066(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var5 = arg3 - 334;
        int var6;
        if (var5 < 0) {
            var6 = field772;
        } else if (var5 >= 100) {
            var6 = field692;
        } else {
            var6 = (field692 - field772) * var5 / 100 + field772;
        }
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field580) {
            short var8 = field580;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field776) {
                var6 = field776;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class559.method9184();
                    class559.method9145(arg0, arg1, var10, arg3, -16777216);
                    class559.method9145(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field779) {
            short var11 = field779;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field547) {
                var6 = field547;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class559.method9184();
                    class559.method9145(arg0, arg1, arg2, var13, -16777216);
                    class559.method9145(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field784 = arg3 * var6 / 334;
        if (field782 != arg2 || field783 != arg3) {
            int[] var14 = new int[9];
            for (int var15 = 0; var15 < var14.length; var15++) {
                int var16 = var15 * 32 + 128 + 15;
                int var17 = var16 * 3 + 600;
                int var19 = class181.field1941[var16];
                int var20 = arg3 - 334;
                if (var20 < 0) {
                    var20 = 0;
                } else if (var20 > 100) {
                    var20 = 100;
                }
                int var21 = (field775 - field774) * var20 / 100 + field774;
                int var22 = var17 * var21 / 256;
                var14[var15] = var19 * var22 >> 16;
            }
            Statics.field4799.field1328.method3648(var14, 500, 800, arg2 * 334 / arg3, 334);
        }
        field606 = arg0;
        field781 = arg1;
        field782 = arg2;
        field783 = arg3;
    }

    @ObfuscatedName("bn.jq(I)V")
    public static void method818() {
        if (Statics.field2672.field1249 >> 7 == field542 && Statics.field2672.field1180 >> 7 == field739) {
            field542 = 0;
        }
    }

    @ObfuscatedName("iq.jw(Ldy;I)V")
    public static void method4196(class102 arg0) {
        int var1 = arg0.field1322.field1399;
        int[] var2 = arg0.field1322.field1401;
        for (int var3 = 0; var3 < var1; var3++) {
            if (field644 != var2[var3] && field630 != var2[var3]) {
                method4436(arg0, var2[var3], true);
            }
        }
    }

    @ObfuscatedName("jr.ji(Ldy;IZS)V")
    public static void method4436(class102 arg0, int arg1, boolean arg2) {
        class94 var3 = arg0.field1317[arg1];
        if (var3 == null || !var3.method2367() || var3.field1131) {
            return;
        }
        var3.field1115 = false;
        if ((field548 && arg0.field1322.field1399 > 50 || arg0.field1322.field1399 > 200) && arg2 && var3.field1208 == var3.field1186) {
            var3.field1115 = true;
        }
        int var4 = var3.field1249 >> 7;
        int var5 = var3.field1180 >> 7;
        if (0 > var4 || var4 >= 104 || 0 > var5 || var5 >= 104) {
            return;
        }
        long var6 = class198.method4242(0, 0, 0, false, var3.field1133, arg0.field1312);
        if (var3.field1124 != null && field519 >= var3.field1119 && field519 < var3.field1141) {
            var3.field1115 = false;
            var3.field1137 = method3285(arg0, var3.field1249, var3.field1180, arg0.field1308);
            var3.field1185 = field519;
            arg0.field1328.method3610(arg0.field1308, var3.field1249, var3.field1180, var3.field1137, 60, var3, var3.field1182, var6, var3.field1125, var3.field1126, var3.field1132, var3.field1128);
            return;
        }
        if ((var3.field1249 & 0x7F) == 64 && (var3.field1180 & 0x7F) == 64) {
            if (field628 == arg0.field1313[var4][var5]) {
                return;
            }
            arg0.field1313[var4][var5] = field628;
        }
        var3.field1137 = method3285(arg0, var3.field1249, var3.field1180, arg0.field1308);
        var3.field1185 = field519;
        arg0.field1328.method3730(arg0.field1308, var3.field1249, var3.field1180, var3.field1137, 60, var3, var3.field1182, var6, var3.field1227);
    }

    @ObfuscatedName("gr.jl(Ldy;ZI)V")
    public static final void method3333(class102 arg0, boolean arg1) {
        for (int var2 = 0; var2 < arg0.field1316; var2++) {
            class104 var3 = arg0.field1318[arg0.field1320[var2]];
            if (var3 != null && var3.method2367() && var3.field1340.field2598 == arg1 && var3.field1340.method4524()) {
                int var4 = var3.field1249 >> 7;
                int var5 = var3.field1180 >> 7;
                if (var4 >= 0 && var4 < arg0.field1309 && var5 >= 0 && var5 < arg0.field1310) {
                    if (var3.field1184 == 1 && (var3.field1249 & 0x7F) == 64 && (var3.field1180 & 0x7F) == 64) {
                        if (field628 == arg0.field1313[var4][var5]) {
                            continue;
                        }
                        arg0.field1313[var4][var5] = field628;
                    }
                    long var6 = class198.method4242(0, 0, 1, !var3.field1340.field2605, arg0.field1320[var2], arg0.field1312);
                    var3.field1185 = field519;
                    arg0.field1328.method3730(arg0.field1308, var3.field1249, var3.field1180, method3285(arg0, var3.field1249 + (var3.field1184 * 64 - 64), var3.field1180 + (var3.field1184 * 64 - 64), arg0.field1308), var3.field1184 * 64 - 64 + 60, var3, var3.field1182, var6, var3.field1227);
                }
            }
        }
    }

    @ObfuscatedName("db.jm(Ldy;I)V")
    public static void method2596(class102 arg0) {
        for (int var1 = 0; var1 < arg0.field1307; var1++) {
            class478 var2 = arg0.field1321[arg0.field1323[var1]];
            if (var2 != null) {
                var2.field4954 = method3285(arg0, var2.field4948, var2.field4950, arg0.field1308);
                var2.field4947.field1328.field1988 = field519;
                var2.method8047();
                arg0.field1328.method3730(arg0.field1308, var2.field4948, var2.field4950, var2.field4954, 60, var2.field4947.field1328, var2.field4951, 0L, false);
                class102 var3 = var2.field4947;
                if (field577) {
                    method4436(var3, field630, false);
                }
                Statics.method2313(var2.field4947);
                method3333(var2.field4947, true);
                method4196(var2.field4947);
                method3333(var2.field4947, false);
                method2320(var2.field4947);
                method776(var2.field4947);
            }
        }
    }

    @ObfuscatedName("dm.jx(Ldy;I)V")
    public static final void method2320(class102 arg0) {
        for (class79 var1 = (class79) arg0.field1326.method6907(); var1 != null; var1 = (class79) arg0.field1326.method6896()) {
            if (arg0.field1308 != var1.field945 || field519 > var1.field955) {
                var1.method8218();
            } else if (field519 >= var1.field954) {
                if (!var1.field960 && var1.field958 != 0) {
                    if (var1.field958 > 0) {
                        class104 var2 = Statics.field3543.field1318[var1.field958 - 1];
                        if (var2 != null && 0 <= var2.field1249 && var2.field1249 < 13312 && 0 <= var2.field1180 && var2.field1180 < 13312) {
                            var1.field947 = var2.field1249;
                            var1.field948 = var2.field1180;
                            var1.method2185(var1.field946, var1.field965, var1.field976, field519);
                        }
                    } else {
                        int var3 = -var1.field958 - 1;
                        class94 var4;
                        if (field630 == var3) {
                            var4 = Statics.field2672;
                        } else {
                            var4 = Statics.field3543.field1317[var3];
                        }
                        if (var4 != null && 0 <= var4.field1249 && var4.field1249 < 13312 && 0 <= var4.field1180 && var4.field1180 < 13312) {
                            var1.field947 = var4.field1249;
                            var1.field948 = var4.field1180;
                            var1.method2185(var1.field946, var1.field965, var1.field976, field519);
                        }
                    }
                }
                if (var1.field951 > 0) {
                    class104 var5 = arg0.field1318[var1.field951 - 1];
                    if (var5 != null && 0 <= var5.field1249 && var5.field1249 < 13312 && 0 <= var5.field1180 && var5.field1180 < 13312) {
                        var1.method2185(var5.field1249, var5.field1180, method3285(arg0, var5.field1249, var5.field1180, var1.field945) - var1.field969, field519);
                    }
                }
                if (var1.field951 < 0) {
                    int var6 = -var1.field951 - 1;
                    class94 var7;
                    if (field630 == var6) {
                        var7 = Statics.field2672;
                    } else {
                        var7 = arg0.field1317[var6];
                    }
                    if (var7 != null && 0 <= var7.field1249 && var7.field1249 < 13312 && 0 <= var7.field1180 && var7.field1180 < 13312) {
                        var1.method2185(var7.field1249, var7.field1180, method3285(arg0, var7.field1249, var7.field1180, var1.field945) - var1.field969, field519);
                    }
                }
                var1.method2178(field584);
                arg0.field1328.method3730(arg0.field1308, (int) var1.field961, (int) var1.field962, (int) var1.field963, 60, var1, var1.field950, -1L, false);
            }
        }
    }

    @ObfuscatedName("bi.jg(Ldy;I)V")
    public static final void method776(class102 arg0) {
        for (class74 var1 = (class74) arg0.field1327.method6907(); var1 != null; var1 = (class74) arg0.field1327.method6896()) {
            if (arg0.field1308 != var1.field871 || var1.field876) {
                var1.method8218();
            } else if (field519 >= var1.field870) {
                var1.method2086(field584);
                if (var1.field876) {
                    var1.method8218();
                } else {
                    arg0.field1328.method3730(var1.field871, var1.field878, var1.field873, var1.field869, 60, var1, 0, -1L, false);
                }
            }
        }
    }

    @ObfuscatedName("mo.jy(I)I")
    public static final int method5656() {
        if (Statics.field1385.method2502()) {
            return Statics.field4799.field1308;
        }
        int var0 = 3;
        int var1 = Statics.field3728.method1152() >> 7;
        int var2 = Statics.field3728.method1156() >> 7;
        if (Statics.field1500 < 310) {
            int var3;
            int var4;
            if (field704 == 1) {
                var3 = Statics.field1524 >> 7;
                var4 = Statics.field5062 >> 7;
            } else {
                var3 = var1;
                var4 = var2;
            }
            int var5 = Statics.field4736 >> 7;
            int var6 = Statics.field3140 >> 7;
            if (var5 < 0 || 104 <= var5 || var6 < 0 || 104 <= var6) {
                return Statics.field4799.field1308;
            }
            if (var3 < 0 || 104 <= var3 || var4 < 0 || 104 <= var4) {
                return Statics.field4799.field1308;
            }
            if ((Statics.field4799.field1315[Statics.field4799.field1308][var5][var6] & 0x4) != 0) {
                var0 = Statics.field4799.field1308;
            }
            int var7;
            if (var3 > var5) {
                var7 = var3 - var5;
            } else {
                var7 = var5 - var3;
            }
            int var8;
            if (var4 > var6) {
                var8 = var4 - var6;
            } else {
                var8 = var6 - var4;
            }
            if (var7 > var8) {
                int var9 = var8 * 65536 / var7;
                int var10 = 32768;
                while (var3 != var5) {
                    if (var5 < var3) {
                        var5++;
                    } else if (var5 > var3) {
                        var5--;
                    }
                    if ((Statics.field4799.field1315[Statics.field4799.field1308][var5][var6] & 0x4) != 0) {
                        var0 = Statics.field4799.field1308;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var6 < var4) {
                            var6++;
                        } else if (var6 > var4) {
                            var6--;
                        }
                        if ((Statics.field4799.field1315[Statics.field4799.field1308][var5][var6] & 0x4) != 0) {
                            var0 = Statics.field4799.field1308;
                        }
                    }
                }
            } else if (var8 > 0) {
                int var11 = var7 * 65536 / var8;
                int var12 = 32768;
                while (var4 != var6) {
                    if (var6 < var4) {
                        var6++;
                    } else if (var6 > var4) {
                        var6--;
                    }
                    if ((Statics.field4799.field1315[Statics.field4799.field1308][var5][var6] & 0x4) != 0) {
                        var0 = Statics.field4799.field1308;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        var12 -= 65536;
                        if (var5 < var3) {
                            var5++;
                        } else if (var5 > var3) {
                            var5--;
                        }
                        if ((Statics.field4799.field1315[Statics.field4799.field1308][var5][var6] & 0x4) != 0) {
                            var0 = Statics.field4799.field1308;
                        }
                    }
                }
            }
        }
        if (var1 >= 0 && 104 > var1 && var2 >= 0 && 104 > var2) {
            if ((Statics.field4799.field1315[Statics.field4799.field1308][var1][var2] & 0x4) != 0) {
                var0 = Statics.field4799.field1308;
            }
            return var0;
        } else {
            return Statics.field4799.field1308;
        }
    }

    @ObfuscatedName("nj.jh(I)I")
    public static final int method6353() {
        if (Statics.field1385.method2502()) {
            return Statics.field4799.field1308;
        } else {
            int var0 = method3285(Statics.field4799, Statics.field4736, Statics.field3140, Statics.field4799.field1308);
            return var0 - Statics.field65 >= 800 || (Statics.field4799.field1315[Statics.field4799.field1308][Statics.field4736 >> 7][Statics.field3140 >> 7] & 0x4) == 0 ? 3 : Statics.field4799.field1308;
        }
    }

    @ObfuscatedName("nw.jn(I)Lpr;")
    public static class408 method5981() {
        return field621;
    }

    @ObfuscatedName("jq.jv(I)V")
    public static void method4490() {
        for (class267 var0 = (class267) field713.method6907(); var0 != null; var0 = (class267) field713.method6896()) {
            var0.method8218();
        }
    }

    @ObfuscatedName("mc.jj(Lkh;B)V")
    public static void method5604(class267 arg0) {
        if (arg0 == null || arg0.field2916 == null) {
            return;
        }
        if (arg0.field2916.field3876 >= 0) {
            class361 var1 = Statics.field2667.method5964(arg0.field2916.field3823);
            if (var1 == null || var1.field3936 == null || var1.field3936.length == 0 || arg0.field2916.field3876 >= var1.field3936.length || var1.field3936[arg0.field2916.field3876] != arg0.field2916) {
                return;
            }
        }
        if (arg0.field2916.field3828 == 11 && arg0.field2915 == 0) {
            if (arg0.field2916.method6379(arg0.field2913, arg0.field2914, 0, 0)) {
                arg0.field2916.method6463().method4190().method4249(1, arg0.field2916.method6463().method4160());
                switch(arg0.field2916.method6383()) {
                    case 0:
                        class32.method4914(arg0.field2916.method6385(), true, false);
                        break;
                    case 1:
                        if (class362.method3212(method5918(arg0.field2916))) {
                            int[] var2 = arg0.field2916.method6480();
                            if (var2 != null) {
                                class324 var3 = class324.method4244(class322.field3306, field569.field1458);
                                var3.field3379.method8836(arg0.field2916.field3876);
                                var3.field3379.method9045(var2[1]);
                                var3.field3379.method8852(arg0.field2916.method6384());
                                var3.field3379.method8851(var2[0]);
                                var3.field3379.method8911(arg0.field2916.field3941);
                                var3.field3379.method8911(var2[2]);
                                field569.method2829(var3);
                            }
                        }
                }
            }
        } else if (arg0.field2916.field3828 == 12) {
            class359 var4 = arg0.field2916.method6391();
            if (var4 != null && var4.method6112()) {
                switch(arg0.field2915) {
                    case 0:
                        field736.method4917(arg0.field2916);
                        var4.method6060(true);
                        var4.method6099(arg0.field2913, arg0.field2914, field748.method4940(82), field748.method4940(81));
                        break;
                    case 1:
                        var4.method6100(arg0.field2913, arg0.field2914);
                }
            }
        }
    }

    @ObfuscatedName("aw.jk(B)Z")
    public static boolean method156() {
        return (field637 & 0x2) != 0;
    }

    @ObfuscatedName("do.jz(Ldy;Ldt;IIIIII)V")
    public static final void method2350(class102 arg0, class98 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 == null || !arg1.method2367()) {
            return;
        }
        if (arg1 instanceof class104) {
            class246 var7 = ((class104) arg1).field1340;
            if (var7.field2582 != null) {
                var7 = var7.method4522();
            }
            if (var7 == null) {
                return;
            }
        }
        int var8 = arg0.field1322.field1399;
        int[] var9 = arg0.field1322.field1401;
        boolean var10 = arg2 < var8;
        int var11 = -2;
        if (arg1.field1211 != null && (!var10 || !arg1.field1209 && (field730 == 4 || !arg1.field1202 && (field730 == 0 || field730 == 3 || field730 == 1 && ((class94) arg1).method2354())))) {
            method7067(arg0, arg1, arg1.method2423());
            if (field747 > -1 && field532 < field610) {
                field654[field532] = Statics.field3034.method7586(arg1.field1211) / 2;
                field613[field532] = Statics.field3034.field4756;
                field611[field532] = field747;
                field620[field532] = field622 - var11;
                field615[field532] = arg1.field1205;
                field773[field532] = arg1.field1206;
                field618[field532] = arg1.field1204;
                field617[field532] = arg1.field1207;
                field562[field532] = arg1.field1211;
                field532++;
                var11 += 12;
            }
        }
        if (!arg1.field1224.method6947()) {
            method7067(arg0, arg1, arg1.method2423() + 15);
            for (class103 var12 = (class103) arg1.field1224.method6951(); var12 != null; var12 = (class103) arg1.field1224.method6945()) {
                class99 var13 = var12.method2629(field519);
                if (var13 != null) {
                    class238 var14 = var12.field1329;
                    class563 var15 = var14.method4464();
                    class563 var16 = var14.method4467();
                    int var17 = 0;
                    int var18;
                    if (var15 == null || var16 == null) {
                        var18 = var14.field2522;
                    } else {
                        if (var14.field2523 * 2 < var16.field5478) {
                            var17 = var14.field2523;
                        }
                        var18 = var16.field5478 - var17 * 2;
                    }
                    int var19 = 255;
                    boolean var20 = true;
                    int var21 = field519 - var13.field1262;
                    int var22 = var13.field1259 * var18 / var14.field2522;
                    int var25;
                    if (var13.field1261 > var21) {
                        int var23 = var14.field2510 == 0 ? 0 : var21 / var14.field2510 * var14.field2510;
                        int var24 = var13.field1260 * var18 / var14.field2522;
                        var25 = (var22 - var24) * var23 / var13.field1261 + var24;
                    } else {
                        var25 = var22;
                        int var26 = var13.field1261 + var14.field2509 - var21;
                        if (var14.field2517 >= 0) {
                            var19 = (var26 << 8) / (var14.field2509 - var14.field2517);
                        }
                    }
                    if (var13.field1259 > 0 && var25 < 1) {
                        var25 = 1;
                    }
                    if (var15 == null || var16 == null) {
                        var11 += 5;
                        if (field747 > -1) {
                            int var32 = field747 + arg3 - (var18 >> 1);
                            int var33 = field622 + arg4 - var11;
                            class559.method9145(var32, var33, var25, 5, 65280);
                            class559.method9145(var25 + var32, var33, var18 - var25, 5, 16711680);
                        }
                        var11 += 2;
                    } else {
                        int var27;
                        if (var18 == var25) {
                            var27 = var17 * 2 + var25;
                        } else {
                            var27 = var17 + var25;
                        }
                        int var28 = var15.field5479;
                        var11 += var28;
                        int var29 = field747 + arg3 - (var18 >> 1);
                        int var30 = field622 + arg4 - var11;
                        int var31 = var29 - var17;
                        if (var19 >= 0 && var19 < 255) {
                            var15.method9260(var31, var30, var19);
                            class559.method9123(var31, var30, var27 + var31, var28 + var30);
                            var16.method9260(var31, var30, var19);
                        } else {
                            var15.method9284(var31, var30);
                            class559.method9123(var31, var30, var27 + var31, var28 + var30);
                            var16.method9284(var31, var30);
                        }
                        class559.method9119(arg3, arg4, arg3 + arg5, arg4 + arg6);
                        var11 += 2;
                    }
                } else if (var12.method2627()) {
                    var12.method8218();
                }
            }
        }
        if (var11 == -2) {
            var11 += 7;
        }
        if (var10 && field519 == arg1.field1185) {
            class94 var34 = (class94) arg1;
            boolean var35;
            if (field637 == 0) {
                var35 = false;
            } else if (Statics.field2672 == var34) {
                boolean var39 = (field637 & 0x8) != 0;
                var35 = var39;
            } else {
                boolean var36 = (field637 & 0x4) != 0;
                boolean var37 = var36;
                if (!var36) {
                    boolean var38 = (field637 & 0x1) != 0;
                    var37 = var38 && var34.method2354();
                }
                var35 = var37 || method156() && var34.method2363();
            }
            if (var35) {
                class94 var40 = (class94) arg1;
                if (var10) {
                    method7067(arg0, arg1, arg1.method2423() + 15);
                    class437 var41 = (class437) field749.get(class518.field5218);
                    var11 += 4;
                    var41.method7592(var40.field1138.method9470(), field747 + arg3, field622 + arg4 - var11, 16777215, 0);
                    var11 += 18;
                }
            }
        }
        if (var10) {
            class94 var42 = (class94) arg1;
            if (var42.field1131) {
                return;
            }
            if (var42.field1112 != -1 || var42.field1113 != -1) {
                method7067(arg0, arg1, arg1.field1240 + 15);
                if (field747 > -1) {
                    if (var42.field1112 != -1) {
                        var11 += 25;
                        Statics.field980[var42.field1112].method9284(field747 + arg3 - 12, field622 + arg4 - var11);
                    }
                    if (var42.field1113 != -1) {
                        var11 += 25;
                        Statics.field2249[var42.field1113].method9284(field747 + arg3 - 12, field622 + arg4 - var11);
                    }
                }
            }
            if (arg2 >= 0 && field527 == 10 && field529 == var9[arg2]) {
                method7067(arg0, arg1, arg1.field1240 + 15);
                if (field747 > -1) {
                    int var43 = Statics.field2373[1].field5479 + var11;
                    Statics.field2373[1].method9284(field747 + arg3 - 12, field622 + arg4 - var43);
                }
            }
        } else {
            class104 var44 = (class104) arg1;
            int[] var45 = var44.method2644();
            short[] var46 = var44.method2646();
            if (var46 != null && var45 != null) {
                for (int var47 = 0; var47 < var46.length; var47++) {
                    if (var46[var47] >= 0 && var45[var47] >= 0) {
                        long var48 = (long) var45[var47] << 8 | (long) var46[var47];
                        class563 var50 = (class563) field791.method7840(var48);
                        if (var50 == null) {
                            class563[] var51 = class564.method7766(Statics.field408, var45[var47], 0);
                            if (var51 != null && var46[var47] < var51.length) {
                                var50 = var51[var46[var47]];
                                field791.method7838(var48, var50);
                            }
                        }
                        if (var50 != null) {
                            method7067(arg0, arg1, arg1.method2423() + 15);
                            if (field747 > -1) {
                                var50.method9284(field747 + arg3 - (var50.field5478 >> 1), field622 + ((arg4 - var50.field5479 - 2) * (var47 + 1) - var50.field5479) - 4);
                            }
                        }
                    }
                }
            }
            if (field527 == 1 && field528 == arg0.field1320[arg2 - var8] && field519 % 20 < 10) {
                method7067(arg0, arg1, arg1.method2423() + 15);
                if (field747 > -1) {
                    Statics.field2373[0].method9284(field747 + arg3 - 12, field622 + arg4 - 28);
                }
            }
        }
        for (int var52 = 0; var52 < 4; var52++) {
            int var53 = arg1.field1188[var52];
            int var54 = arg1.field1246[var52];
            class259 var55 = null;
            int var56 = 0;
            if (var54 >= 0) {
                if (var53 <= field519) {
                    continue;
                }
                var55 = class259.method8201(arg1.field1246[var52]);
                var56 = var55.field2709;
                if (var55 != null && var55.field2721 != null) {
                    var55 = var55.method4674();
                    if (var55 == null) {
                        arg1.field1188[var52] = -1;
                        continue;
                    }
                }
            } else if (var53 < 0) {
                continue;
            }
            int var57 = arg1.field1199[var52];
            class259 var58 = null;
            if (var57 >= 0) {
                var58 = class259.method8201(var57);
                if (var58 != null && var58.field2721 != null) {
                    var58 = var58.method4674();
                }
            }
            if (var53 - var56 <= field519) {
                if (var55 == null) {
                    arg1.field1188[var52] = -1;
                } else {
                    method7067(arg0, arg1, arg1.method2423() / 2);
                    if (field747 > -1) {
                        boolean var59 = true;
                        if (var52 == 1) {
                            field622 -= 20;
                        }
                        if (var52 == 2) {
                            field747 -= 15;
                            field622 -= 10;
                        }
                        if (var52 == 3) {
                            field747 += 15;
                            field622 -= 10;
                        }
                        Object var60 = null;
                        Object var61 = null;
                        Object var62 = null;
                        Object var63 = null;
                        int var64 = 0;
                        int var65 = 0;
                        int var66 = 0;
                        int var67 = 0;
                        int var68 = 0;
                        int var69 = 0;
                        int var70 = 0;
                        int var71 = 0;
                        class563 var72 = null;
                        class563 var73 = null;
                        class563 var74 = null;
                        class563 var75 = null;
                        int var76 = 0;
                        int var77 = 0;
                        int var78 = 0;
                        int var79 = 0;
                        int var80 = 0;
                        int var81 = 0;
                        int var82 = 0;
                        int var83 = 0;
                        int var84 = 0;
                        class563 var85 = var55.method4676();
                        if (var85 != null) {
                            var64 = var85.field5478;
                            int var86 = var85.field5479;
                            if (var86 > var84) {
                                var84 = var86;
                            }
                            var68 = var85.field5480;
                        }
                        class563 var87 = var55.method4692();
                        if (var87 != null) {
                            var65 = var87.field5478;
                            int var88 = var87.field5479;
                            if (var88 > var84) {
                                var84 = var88;
                            }
                            var69 = var87.field5480;
                        }
                        class563 var89 = var55.method4671();
                        if (var89 != null) {
                            var66 = var89.field5478;
                            int var90 = var89.field5479;
                            if (var90 > var84) {
                                var84 = var90;
                            }
                            var70 = var89.field5480;
                        }
                        class563 var91 = var55.method4679();
                        if (var91 != null) {
                            var67 = var91.field5478;
                            int var92 = var91.field5479;
                            if (var92 > var84) {
                                var84 = var92;
                            }
                            var71 = var91.field5480;
                        }
                        if (var58 != null) {
                            var72 = var58.method4676();
                            if (var72 != null) {
                                var76 = var72.field5478;
                                int var93 = var72.field5479;
                                if (var93 > var84) {
                                    var84 = var93;
                                }
                                var80 = var72.field5480;
                            }
                            var73 = var58.method4692();
                            if (var73 != null) {
                                var77 = var73.field5478;
                                int var94 = var73.field5479;
                                if (var94 > var84) {
                                    var84 = var94;
                                }
                                var81 = var73.field5480;
                            }
                            var74 = var58.method4671();
                            if (var74 != null) {
                                var78 = var74.field5478;
                                int var95 = var74.field5479;
                                if (var95 > var84) {
                                    var84 = var95;
                                }
                                var82 = var74.field5480;
                            }
                            var75 = var58.method4679();
                            if (var75 != null) {
                                var79 = var75.field5478;
                                int var96 = var75.field5479;
                                if (var96 > var84) {
                                    var84 = var96;
                                }
                                var83 = var75.field5480;
                            }
                        }
                        class433 var97 = var55.method4680();
                        if (var97 == null) {
                            var97 = Statics.field2096;
                        }
                        class433 var98;
                        if (var58 == null) {
                            var98 = Statics.field2096;
                        } else {
                            var98 = var58.method4680();
                            if (var98 == null) {
                                var98 = Statics.field2096;
                            }
                        }
                        Object var99 = null;
                        String var100 = null;
                        boolean var101 = false;
                        int var102 = 0;
                        String var103 = var55.method4675(arg1.field1210[var52]);
                        int var104 = var97.method7586(var103);
                        if (var58 != null) {
                            var100 = var58.method4675(arg1.field1213[var52]);
                            var102 = var98.method7586(var100);
                        }
                        int var105 = 0;
                        int var106 = 0;
                        if (var65 > 0) {
                            if (var89 == null && var91 == null) {
                                var105 = 1;
                            } else {
                                var105 = var104 / var65 + 1;
                            }
                        }
                        if (var58 != null && var77 > 0) {
                            if (var74 == null && var75 == null) {
                                var106 = 1;
                            } else {
                                var106 = var102 / var77 + 1;
                            }
                        }
                        int var107 = 0;
                        int var108 = var107;
                        if (var64 > 0) {
                            var107 += var64;
                        }
                        var107 += 2;
                        int var109 = var107;
                        if (var66 > 0) {
                            var107 += var66;
                        }
                        int var110 = var107;
                        int var111 = var107;
                        int var113;
                        if (var65 > 0) {
                            int var112 = var65 * var105;
                            var113 = var107 + var112;
                            var111 = (var112 - var104) / 2 + var107;
                        } else {
                            var113 = var104 + var107;
                        }
                        int var114 = var113;
                        if (var67 > 0) {
                            var113 += var67;
                        }
                        int var115 = 0;
                        int var116 = 0;
                        int var117 = 0;
                        int var118 = 0;
                        int var119 = 0;
                        if (var58 != null) {
                            var113 += 2;
                            var115 = var113;
                            if (var76 > 0) {
                                var113 += var76;
                            }
                            var113 += 2;
                            var116 = var113;
                            if (var78 > 0) {
                                var113 += var78;
                            }
                            var117 = var113;
                            var119 = var113;
                            if (var77 > 0) {
                                int var120 = var77 * var106;
                                var113 += var120;
                                var119 += (var120 - var102) / 2;
                            } else {
                                var113 += var102;
                            }
                            var118 = var113;
                            if (var79 > 0) {
                                var113 += var79;
                            }
                        }
                        int var121 = arg1.field1188[var52] - field519;
                        int var122 = var55.field2715 - var55.field2715 * var121 / var55.field2709;
                        int var123 = var55.field2716 * var121 / var55.field2709 + -var55.field2716;
                        int var124 = field747 + arg3 - (var113 >> 1) + var122;
                        int var125 = field622 + arg4 - 12 + var123;
                        int var126 = var125;
                        int var127 = var84 + var125;
                        int var128 = var55.field2720 + var125 + 15;
                        int var129 = var128 - var97.field4767;
                        int var130 = var97.field4758 + var128;
                        if (var129 < var125) {
                            var126 = var129;
                        }
                        if (var130 > var127) {
                            var127 = var130;
                        }
                        int var131 = 0;
                        if (var58 != null) {
                            var131 = var58.field2720 + var125 + 15;
                            int var132 = var131 - var98.field4767;
                            int var133 = var98.field4758 + var131;
                            if (var132 < var126) {
                                ;
                            }
                            if (var133 > var127) {
                                ;
                            }
                        }
                        int var136 = 255;
                        if (var55.field2704 >= 0) {
                            var136 = (var121 << 8) / (var55.field2709 - var55.field2704);
                        }
                        if (var136 >= 0 && var136 < 255) {
                            if (var85 != null) {
                                var85.method9260(var108 + var124 - var68, var125, var136);
                            }
                            if (var89 != null) {
                                var89.method9260(var109 + var124 - var70, var125, var136);
                            }
                            if (var87 != null) {
                                for (int var137 = 0; var137 < var105; var137++) {
                                    var87.method9260(var65 * var137 + (var110 + var124 - var69), var125, var136);
                                }
                            }
                            if (var91 != null) {
                                var91.method9260(var114 + var124 - var71, var125, var136);
                            }
                            var97.method7535(var103, var111 + var124, var128, var55.field2702, 0, var136);
                            if (var58 != null) {
                                if (var72 != null) {
                                    var72.method9260(var115 + var124 - var80, var125, var136);
                                }
                                if (var74 != null) {
                                    var74.method9260(var116 + var124 - var82, var125, var136);
                                }
                                if (var73 != null) {
                                    for (int var138 = 0; var138 < var106; var138++) {
                                        var73.method9260(var77 * var138 + (var117 + var124 - var81), var125, var136);
                                    }
                                }
                                if (var75 != null) {
                                    var75.method9260(var118 + var124 - var83, var125, var136);
                                }
                                var98.method7535(var100, var119 + var124, var131, var58.field2702, 0, var136);
                            }
                        } else {
                            if (var85 != null) {
                                var85.method9284(var108 + var124 - var68, var125);
                            }
                            if (var89 != null) {
                                var89.method9284(var109 + var124 - var70, var125);
                            }
                            if (var87 != null) {
                                for (int var139 = 0; var139 < var105; var139++) {
                                    var87.method9284(var65 * var139 + (var110 + var124 - var69), var125);
                                }
                            }
                            if (var91 != null) {
                                var91.method9284(var114 + var124 - var71, var125);
                            }
                            var97.method7565(var103, var111 + var124, var128, var55.field2702 | 0xFF000000, 0);
                            if (var58 != null) {
                                if (var72 != null) {
                                    var72.method9284(var115 + var124 - var80, var125);
                                }
                                if (var74 != null) {
                                    var74.method9284(var116 + var124 - var82, var125);
                                }
                                if (var73 != null) {
                                    for (int var140 = 0; var140 < var106; var140++) {
                                        var73.method9284(var77 * var140 + (var117 + var124 - var81), var125);
                                    }
                                }
                                if (var75 != null) {
                                    var75.method9284(var118 + var124 - var83, var125);
                                }
                                var98.method7565(var100, var119 + var124, var131, var58.field2702 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("rd.jo(Ldy;IIIIB)V")
    public static final void method7751(class102 arg0, int arg1, int arg2, int arg3, int arg4) {
        field532 = 0;
        boolean var5 = false;
        int var6 = -1;
        int var7 = -1;
        int var8 = arg0.field1322.field1399;
        int[] var9 = arg0.field1322.field1401;
        for (int var10 = 0; var10 < arg0.field1316 + var8; var10++) {
            class98 var11;
            if (var10 < var8) {
                var11 = arg0.field1317[var9[var10]];
                if (field644 == var9[var10]) {
                    var5 = true;
                    var6 = var10;
                    continue;
                }
                if (Statics.field2672 == var11) {
                    var7 = var10;
                    continue;
                }
            } else {
                var11 = arg0.field1318[arg0.field1320[var10 - var8]];
            }
            method2350(arg0, var11, var10, arg1, arg2, arg3, arg4);
        }
        if (field577 && var7 != -1) {
            method2350(arg0, Statics.field2672, var7, arg1, arg2, arg3, arg4);
        }
        if (var5) {
            method2350(arg0, arg0.field1317[field644], var6, arg1, arg2, arg3, arg4);
        }
        for (int var12 = 0; var12 < field532; var12++) {
            int var13 = field611[var12];
            int var14 = field620[var12];
            int var15 = field654[var12];
            int var16 = field613[var12];
            boolean var17 = true;
            while (var17) {
                var17 = false;
                for (int var18 = 0; var18 < var12; var18++) {
                    if (var14 + 2 > field620[var18] - field613[var18] && var14 - var16 < field620[var18] + 2 && var13 - var15 < field654[var18] + field611[var18] && var13 + var15 > field611[var18] - field654[var18] && field620[var18] - field613[var18] < var14) {
                        var14 = field620[var18] - field613[var18];
                        var17 = true;
                    }
                }
            }
            field747 = field611[var12];
            field622 = field620[var12] = var14;
            String var19 = field562[var12];
            if (field572 == 0) {
                int var20 = 16776960;
                if (field615[var12] < 6) {
                    var20 = field688[field615[var12]];
                }
                if (field615[var12] == 6) {
                    var20 = field628 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field615[var12] == 7) {
                    var20 = field628 % 20 < 10 ? 255 : 65535;
                }
                if (field615[var12] == 8) {
                    var20 = field628 % 20 < 10 ? 45056 : 8454016;
                }
                if (field615[var12] == 9) {
                    int var21 = 150 - field618[var12];
                    if (var21 < 50) {
                        var20 = var21 * 1280 + 16711680;
                    } else if (var21 < 100) {
                        var20 = 16776960 - (var21 - 50) * 327680;
                    } else if (var21 < 150) {
                        var20 = (var21 - 100) * 5 + 65280;
                    }
                }
                if (field615[var12] == 10) {
                    int var22 = 150 - field618[var12];
                    if (var22 < 50) {
                        var20 = var22 * 5 + 16711680;
                    } else if (var22 < 100) {
                        var20 = 16711935 - (var22 - 50) * 327680;
                    } else if (var22 < 150) {
                        var20 = (var22 - 100) * 327680 + 255 - (var22 - 100) * 5;
                    }
                }
                if (field615[var12] == 11) {
                    int var23 = 150 - field618[var12];
                    if (var23 < 50) {
                        var20 = 16777215 - var23 * 327685;
                    } else if (var23 < 100) {
                        var20 = (var23 - 50) * 327685 + 65280;
                    } else if (var23 < 150) {
                        var20 = 16777215 - (var23 - 100) * 327680;
                    }
                }
                if (field615[var12] == 12 && field617[var12] == null) {
                    int var24 = var19.length();
                    field617[var12] = new int[var24];
                    for (int var25 = 0; var25 < var24; var25++) {
                        int var26 = (int) ((float) var25 / (float) var24 * 64.0F);
                        int var27 = var26 << 10 | 0x380 | 0x40;
                        field617[var12][var25] = Statics.field5056[var27];
                    }
                }
                if (field773[var12] == 0) {
                    Statics.field3034.method7543(var19, field747 + arg1, field622 + arg2, var20, 0, field617[var12]);
                }
                if (field773[var12] == 1) {
                    Statics.field3034.method7541(var19, field747 + arg1, field622 + arg2, var20, 0, field628, field617[var12]);
                }
                if (field773[var12] == 2) {
                    Statics.field3034.method7542(var19, field747 + arg1, field622 + arg2, var20, 0, field628, field617[var12]);
                }
                if (field773[var12] == 3) {
                    Statics.field3034.method7560(var19, field747 + arg1, field622 + arg2, var20, 0, field628, 150 - field618[var12], field617[var12]);
                }
                if (field773[var12] == 4) {
                    int var28 = (150 - field618[var12]) * (Statics.field3034.method7586(var19) + 100) / 150;
                    class559.method9123(field747 + arg1 - 50, arg2, field747 + arg1 + 50, arg2 + arg4);
                    Statics.field3034.method7544(var19, field747 + arg1 + 50 - var28, field622 + arg2, var20, 0, field617[var12]);
                    class559.method9119(arg1, arg2, arg1 + arg3, arg2 + arg4);
                }
                if (field773[var12] == 5) {
                    int var29 = 150 - field618[var12];
                    int var30 = 0;
                    if (var29 < 25) {
                        var30 = var29 - 25;
                    } else if (var29 > 125) {
                        var30 = var29 - 125;
                    }
                    class559.method9123(arg1, field622 + arg2 - Statics.field3034.field4756 - 1, arg1 + arg3, field622 + arg2 + 5);
                    Statics.field3034.method7543(var19, field747 + arg1, field622 + arg2 + var30, var20, 0, field617[var12]);
                    class559.method9119(arg1, arg2, arg1 + arg3, arg2 + arg4);
                }
            } else {
                Statics.field3034.method7592(var19, field747 + arg1, field622 + arg2, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("gg.ju(I)V")
    public static final void method3258() {
        field587 = 0;
        int var0 = (Statics.field2672.field1249 >> 7) + Statics.field4799.field1311;
        int var1 = (Statics.field2672.field1180 >> 7) + Statics.field4799.field1319;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field587 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field587 = 1;
        }
        if (field587 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field587 = 0;
        }
    }

    @ObfuscatedName("pa.jf(Ldy;Ldt;II)V")
    public static void method7067(class102 arg0, class98 arg1, int arg2) {
        class350 var3 = arg1.method2430(arg0);
        method2318(arg0, var3.field3705, var3.field3704, arg1.field1249, arg1.field1180, arg2);
    }

    @ObfuscatedName("dm.jc(Ldy;IIIIII)V")
    public static void method2318(class102 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 < 128 || 13056 < arg1 || arg2 < 128 || 13056 < arg2) {
            field747 = -1;
            field622 = -1;
            return;
        }
        int var6 = method3285(arg0, arg3, arg4, arg0.field1308) - arg5;
        int var7 = arg1 - Statics.field4736;
        int var8 = var6 - Statics.field65;
        int var9 = arg2 - Statics.field3140;
        int var10 = class181.field1941[Statics.field1500];
        int var11 = class181.field1942[Statics.field1500];
        int var12 = class181.field1941[Statics.field2888];
        int var13 = class181.field1942[Statics.field2888];
        int var14 = var7 * var13 + var9 * var12 >> 16;
        int var15 = var9 * var13 - var7 * var12 >> 16;
        int var17 = var8 * var11 - var10 * var15 >> 16;
        int var18 = var8 * var10 + var11 * var15 >> 16;
        if (var18 >= 50) {
            field747 = field784 * var14 / var18 + field782 / 2;
            field622 = field784 * var17 / var18 + field783 / 2;
        } else {
            field747 = -1;
            field622 = -1;
        }
    }

    @ObfuscatedName("gz.jt(Ldy;IIII)I")
    public static final int method3285(class102 arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 >> 7;
        int var5 = arg2 >> 7;
        if (var4 < 0 || var5 < 0 || var4 >= arg0.field1315[0].length || var5 >= arg0.field1315[0][0].length) {
            return 0;
        }
        int var6 = arg3;
        if (arg3 < 3 && (arg0.field1315[1][var4][var5] & 0x2) == 2) {
            var6 = arg3 + 1;
        }
        int var7 = arg1 & 0x7F;
        int var8 = arg2 & 0x7F;
        int var9 = (128 - var7) * arg0.field1314[var6][var4][var5] + arg0.field1314[var6][var4 + 1][var5] * var7 >> 7;
        int var10 = (128 - var7) * arg0.field1314[var6][var4][var5 + 1] + arg0.field1314[var6][var4 + 1][var5 + 1] * var7 >> 7;
        return (128 - var8) * var9 + var8 * var10 >> 7;
    }

    @ObfuscatedName("hq.kt(IIIIIIIB)V")
    public static final void method3592(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg6 - 334;
        if (var7 < 0) {
            var7 = 0;
        } else if (var7 > 100) {
            var7 = 100;
        }
        int var8 = (field775 - field774) * var7 / 100 + field774;
        int var9 = arg5 * var8 / 256;
        int var11 = 2048 - arg3 & 0x7FF;
        int var12 = 2048 - arg4 & 0x7FF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var9;
        if (var11 != 0) {
            int var16 = class181.field1941[var11];
            int var17 = class181.field1942[var11];
            int var18 = var14 * var17 - var9 * var16 >> 16;
            var15 = var14 * var16 + var9 * var17 >> 16;
            var14 = var18;
        }
        if (var12 != 0) {
            int var19 = class181.field1941[var12];
            int var20 = class181.field1942[var12];
            int var21 = var13 * var20 + var15 * var19 >> 16;
            var15 = var15 * var20 - var13 * var19 >> 16;
            var13 = var21;
        }
        if (field538) {
            Statics.field4557 = arg0 - var13;
            Statics.field2388 = arg1 - var14;
            Statics.field4704 = arg2 - var15;
            Statics.field3005 = arg3;
            Statics.field2119 = arg4;
        } else {
            Statics.field4736 = arg0 - var13;
            Statics.field65 = arg1 - var14;
            Statics.field3140 = arg2 - var15;
            Statics.field1500 = arg3;
            Statics.field2888 = arg4;
        }
        if (field704 == 1 && field675 >= 2 && field519 % 50 == 0 && (Statics.field1524 >> 7 != Statics.field2672.field1249 >> 7 || Statics.field5062 >> 7 != Statics.field2672.field1180 >> 7)) {
            int var22 = Statics.field2672.field1130;
            int var23 = (Statics.field1524 >> 7) + Statics.field4799.field1311;
            int var24 = (Statics.field5062 >> 7) + Statics.field4799.field1319;
            method3427(var23, var24, var22, true);
        }
    }

    @ObfuscatedName("dv.km(ZLvs;B)V")
    public static final void method2179(boolean arg0, class548 arg1) {
        field711 = arg0;
        if (!field711) {
            int var2 = arg1.method8814();
            arg1.method9044();
            int var3 = arg1.method9046();
            int var4 = arg1.method8968();
            Statics.field415 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field415[var5][var6] = arg1.method8803();
                }
            }
            Statics.field1109 = new int[var4];
            Statics.field3167 = new int[var4];
            Statics.field854 = new int[var4];
            Statics.field90 = new byte[var4][];
            Statics.field1982 = new byte[var4][];
            int var7 = 0;
            for (int var8 = (var3 - 6) / 8; var8 <= (var3 + 6) / 8; var8++) {
                for (int var9 = (var2 - 6) / 8; var9 <= (var2 + 6) / 8; var9++) {
                    int var10 = (var8 << 8) + var9;
                    Statics.field1109[var7] = var10;
                    Statics.field3167[var7] = Statics.field1298.method6654("m" + var8 + "_" + var9);
                    Statics.field854[var7] = Statics.field1298.method6654("l" + var8 + "_" + var9);
                    var7++;
                }
            }
            method289(var3, var2, true);
            return;
        }
        int var11 = arg1.method9046();
        boolean var12 = arg1.method8839() == 1;
        int var13 = arg1.method9046();
        int var14 = arg1.method8968();
        arg1.method8748();
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 13; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    int var18 = arg1.method8746(1);
                    if (var18 == 1) {
                        field581[var15][var16][var17] = arg1.method8746(26);
                    } else {
                        field581[var15][var16][var17] = -1;
                    }
                }
            }
        }
        arg1.method8747();
        Statics.field415 = new int[var14][4];
        for (int var19 = 0; var19 < var14; var19++) {
            for (int var20 = 0; var20 < 4; var20++) {
                Statics.field415[var19][var20] = arg1.method8803();
            }
        }
        Statics.field1109 = new int[var14];
        Statics.field3167 = new int[var14];
        Statics.field854 = new int[var14];
        Statics.field90 = new byte[var14][];
        Statics.field1982 = new byte[var14][];
        int var21 = 0;
        for (int var22 = 0; var22 < 4; var22++) {
            for (int var23 = 0; var23 < 13; var23++) {
                for (int var24 = 0; var24 < 13; var24++) {
                    int var25 = field581[var22][var23][var24];
                    if (var25 != -1) {
                        int var26 = var25 >> 14 & 0x3FF;
                        int var27 = var25 >> 3 & 0x7FF;
                        int var28 = (var26 / 8 << 8) + var27 / 8;
                        for (int var29 = 0; var29 < var21; var29++) {
                            if (Statics.field1109[var29] == var28) {
                                var28 = -1;
                                break;
                            }
                        }
                        if (var28 != -1) {
                            Statics.field1109[var21] = var28;
                            int var30 = var28 >> 8 & 0xFF;
                            int var31 = var28 & 0xFF;
                            Statics.field3167[var21] = Statics.field1298.method6654("m" + var30 + "_" + var31);
                            Statics.field854[var21] = Statics.field1298.method6654("l" + var30 + "_" + var31);
                            var21++;
                        }
                    }
                }
            }
        }
        method289(var13, var11, !var12);
    }

    @ObfuscatedName("ai.ki(IIZB)V")
    public static final void method289(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field34 == arg0 && Statics.field137 == arg1) {
            return;
        }
        Statics.field34 = arg0;
        Statics.field137 = arg1;
        method2936(25);
        field513 = true;
        method4507(class380.field4239, true);
        int var3 = Statics.field4799.field1311;
        int var4 = Statics.field4799.field1319;
        Statics.field4799.field1311 = (arg0 - 6) * 8;
        Statics.field4799.field1319 = (arg1 - 6) * 8;
        int var5 = Statics.field4799.field1311 - var3;
        int var6 = Statics.field4799.field1319 - var4;
        int var7 = Statics.field4799.field1311;
        int var8 = Statics.field4799.field1319;
        for (int var9 = 0; var9 < 65536; var9++) {
            class104 var10 = Statics.field4799.field1318[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1251[var11] -= var5;
                    var10.field1181[var11] -= var6;
                }
                var10.field1249 -= var5 * 128;
                var10.field1180 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class94 var13 = Statics.field4799.field1317[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1251[var14] -= var5;
                    var13.field1181[var14] -= var6;
                }
                var13.field1249 -= var5 * 128;
                var13.field1180 -= var6 * 128;
            }
        }
        for (int var15 = 0; var15 < 2048; var15++) {
            class478 var16 = Statics.field4799.field1321[var15];
            if (var16 != null) {
                for (int var17 = 0; var17 < 10; var17++) {
                    var16.field4952[var17] -= var5;
                    var16.field4955[var17] -= var6;
                }
                var16.field4948 -= var5 * 128;
                var16.field4950 -= var6 * 128;
            }
        }
        byte var18 = 0;
        byte var19 = 104;
        byte var20 = 1;
        if (var5 < 0) {
            var18 = 103;
            var19 = -1;
            var20 = -1;
        }
        byte var21 = 0;
        byte var22 = 104;
        byte var23 = 1;
        if (var6 < 0) {
            var21 = 103;
            var22 = -1;
            var23 = -1;
        }
        for (int var24 = var18; var24 != var19; var24 += var20) {
            for (int var25 = var21; var25 != var22; var25 += var23) {
                int var26 = var5 + var24;
                int var27 = var6 + var25;
                for (int var28 = 0; var28 < 4; var28++) {
                    if (0 <= var26 && var26 < 104 && 0 <= var27 && var27 < 104) {
                        Statics.field4799.field1324[var28][var24][var25] = Statics.field4799.field1324[var28][var26][var27];
                    } else {
                        Statics.field4799.field1324[var28][var24][var25] = null;
                    }
                }
            }
        }
        for (class97 var29 = (class97) Statics.field4799.field1325.method6907(); var29 != null; var29 = (class97) Statics.field4799.field1325.method6896()) {
            var29.field1179 -= var5;
            var29.field1168 -= var6;
            if (var29.field1179 < 0 || 104 <= var29.field1179 || var29.field1168 < 0 || 104 <= var29.field1168) {
                var29.method8218();
            }
        }
        if (field542 != 0) {
            field542 -= var5;
            field739 -= var6;
        }
        field666 = 0;
        field538 = false;
        Statics.field4736 -= var5 << 7;
        Statics.field3140 -= var6 << 7;
        Statics.field1524 -= var5 << 7;
        Statics.field5062 -= var6 << 7;
        field743 = -1;
        Statics.field4799.field1327.method6898();
        Statics.field4799.field1326.method6898();
        for (int var30 = 0; var30 < 4; var30++) {
            Statics.field4799.field1305[var30].method4986();
        }
    }

    @ObfuscatedName("bp.kr(ZI)V")
    public static final void method667(boolean arg0) {
        method3185();
        field569.field1455++;
        if (field569.field1455 < 50 && !arg0) {
            return;
        }
        field569.field1455 = 0;
        if (field671 || field569.method2833() == null) {
            return;
        }
        class324 var1 = class324.method4244(class322.field3289, field569.field1458);
        field569.method2829(var1);
        try {
            field569.method2828();
        } catch (IOException var3) {
            field671 = true;
        }
    }

    @ObfuscatedName("bk.kx(I)V")
    public static final void method823() {
        method667(false);
        field574 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field90.length; var1++) {
            if (Statics.field3167[var1] != -1 && Statics.field90[var1] == null) {
                Statics.field90[var1] = Statics.field1298.method6670(Statics.field3167[var1], 0);
                if (Statics.field90[var1] == null) {
                    var0 = false;
                    field574++;
                }
            }
            if (Statics.field854[var1] != -1 && Statics.field1982[var1] == null) {
                Statics.field1982[var1] = Statics.field1298.method6640(Statics.field854[var1], 0, Statics.field415[var1]);
                if (Statics.field1982[var1] == null) {
                    var0 = false;
                    field574++;
                }
            }
        }
        if (!var0) {
            field705 = 1;
            return;
        }
        field576 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field90.length; var3++) {
            byte[] var4 = Statics.field1982[var3];
            if (var4 != null) {
                int var5 = (Statics.field1109[var3] >> 8) * 64 - Statics.field4799.field1311;
                int var6 = (Statics.field1109[var3] & 0xFF) * 64 - Statics.field4799.field1319;
                if (field711) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class84.method185(var4, var5, var6);
            }
        }
        if (!var2) {
            field705 = 2;
            return;
        }
        if (field705 != 0) {
            method4507(class380.field4239 + class105.field1353 + class105.field1355 + 100 + "%" + class105.field1351, true);
        }
        method3185();
        Statics.field4799.field1328.method3598();
        for (int var7 = 0; var7 < 4; var7++) {
            Statics.field4799.field1305[var7].method4986();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    Statics.field4799.field1315[var8][var9][var10] = 0;
                }
            }
        }
        method3185();
        class84.method3839();
        int var11 = Statics.field90.length;
        class72.method5455();
        method667(true);
        if (!field711) {
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = (Statics.field1109[var12] >> 8) * 64 - Statics.field4799.field1311;
                int var14 = (Statics.field1109[var12] & 0xFF) * 64 - Statics.field4799.field1319;
                byte[] var15 = Statics.field90[var12];
                if (var15 != null) {
                    method3185();
                    class84.method1851(Statics.field4799, var15, var13, var14, Statics.field34 * 8 - 48, Statics.field137 * 8 - 48);
                }
            }
            for (int var16 = 0; var16 < var11; var16++) {
                int var17 = (Statics.field1109[var16] >> 8) * 64 - Statics.field4799.field1311;
                int var18 = (Statics.field1109[var16] & 0xFF) * 64 - Statics.field4799.field1319;
                byte[] var19 = Statics.field90[var16];
                if (var19 == null && Statics.field137 < 800) {
                    method3185();
                    class84.method4357(Statics.field4799, var17, var18, 64, 64);
                }
            }
            method667(true);
            for (int var20 = 0; var20 < var11; var20++) {
                byte[] var21 = Statics.field1982[var20];
                if (var21 != null) {
                    int var22 = (Statics.field1109[var20] >> 8) * 64 - Statics.field4799.field1311;
                    int var23 = (Statics.field1109[var20] & 0xFF) * 64 - Statics.field4799.field1319;
                    method3185();
                    class84.method3211(Statics.field4799, var21, var22, var23);
                }
            }
        }
        if (field711) {
            for (int var24 = 0; var24 < 4; var24++) {
                method3185();
                for (int var25 = 0; var25 < 13; var25++) {
                    for (int var26 = 0; var26 < 13; var26++) {
                        boolean var27 = false;
                        int var28 = field581[var24][var25][var26];
                        if (var28 != -1) {
                            int var29 = var28 >> 24 & 0x3;
                            int var30 = var28 >> 1 & 0x3;
                            int var31 = var28 >> 14 & 0x3FF;
                            int var32 = var28 >> 3 & 0x7FF;
                            int var33 = (var31 / 8 << 8) + var32 / 8;
                            for (int var34 = 0; var34 < Statics.field1109.length; var34++) {
                                if (Statics.field1109[var34] == var33 && Statics.field90[var34] != null) {
                                    int var35 = (var31 - var25) * 8;
                                    int var36 = (var32 - var26) * 8;
                                    class84.method4210(Statics.field4799, Statics.field90[var34], var24, var25 * 8, var26 * 8, var29, (var31 & 0x7) * 8, (var32 & 0x7) * 8, var30, var35, var36);
                                    var27 = true;
                                    break;
                                }
                            }
                        }
                        if (!var27) {
                            class84.method2948(Statics.field4799.field1314, var24, var25 * 8, var26 * 8);
                        }
                    }
                }
            }
            for (int var37 = 0; var37 < 13; var37++) {
                for (int var38 = 0; var38 < 13; var38++) {
                    int var39 = field581[0][var37][var38];
                    if (var39 == -1) {
                        class84.method4357(Statics.field4799, var37 * 8, var38 * 8, 8, 8);
                    }
                }
            }
            method667(true);
            for (int var40 = 0; var40 < 4; var40++) {
                method3185();
                for (int var41 = 0; var41 < 13; var41++) {
                    for (int var42 = 0; var42 < 13; var42++) {
                        int var43 = field581[var40][var41][var42];
                        if (var43 != -1) {
                            int var44 = var43 >> 24 & 0x3;
                            int var45 = var43 >> 1 & 0x3;
                            int var46 = var43 >> 14 & 0x3FF;
                            int var47 = var43 >> 3 & 0x7FF;
                            int var48 = (var46 / 8 << 8) + var47 / 8;
                            for (int var49 = 0; var49 < Statics.field1109.length; var49++) {
                                if (Statics.field1109[var49] == var48 && Statics.field1982[var49] != null) {
                                    class84.method2260(Statics.field4799, Statics.field1982[var49], var40, var41 * 8, var42 * 8, var44, (var46 & 0x7) * 8, (var47 & 0x7) * 8, var45);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method667(true);
        method3185();
        class84.method7350(Statics.field4799);
        method667(true);
        int var50 = class84.field1025;
        if (var50 > Statics.field4799.field1308) {
            var50 = Statics.field4799.field1308;
        }
        if (var50 < Statics.field4799.field1308 - 1) {
            int var51 = Statics.field4799.field1308 - 1;
        }
        if (field548) {
            Statics.field4799.field1328.method3599(class84.field1025);
        } else {
            Statics.field4799.field1328.method3599(0);
        }
        for (int var52 = 0; var52 < 104; var52++) {
            for (int var53 = 0; var53 < 104; var53++) {
                method3186(Statics.field4799, var52, var53);
            }
        }
        method3185();
        method3342();
        class261.field2770.method5588();
        if (Statics.field997.method524()) {
            class324 var54 = class324.method4244(class322.field3308, field569.field1458);
            var54.field3379.method9045(1057001181);
            field569.method2829(var54);
        }
        if (!field711) {
            int var55 = (Statics.field34 - 6) / 8;
            int var56 = (Statics.field34 + 6) / 8;
            int var57 = (Statics.field137 - 6) / 8;
            int var58 = (Statics.field137 + 6) / 8;
            for (int var59 = var55 - 1; var59 <= var56 + 1; var59++) {
                for (int var60 = var57 - 1; var60 <= var58 + 1; var60++) {
                    if (var59 < var55 || var59 > var56 || var60 < var57 || var60 > var58) {
                        Statics.field1298.method6660("m" + var59 + "_" + var60);
                        Statics.field1298.method6660("l" + var59 + "_" + var60);
                    }
                }
            }
        }
        method3185();
        class84.method1158();
        class324 var61 = class324.method4244(class322.field3322, field569.field1458);
        field569.method2829(var61);
        class35.method2926();
        field513 = false;
    }

    @ObfuscatedName("to.kf(Ldy;I)V")
    public static void method8493(class102 arg0) {
        int var1 = arg0.field1309 / 8;
        int var2 = arg0.field1310 / 8;
        boolean var3 = false;
        method667(false);
        boolean var4 = true;
        for (int var5 = 0; var5 < Statics.field54.length; var5++) {
            if (Statics.field3962[var5] != -1 && Statics.field54[var5] == null) {
                Statics.field54[var5] = Statics.field1298.method6670(Statics.field3962[var5], 0);
                if (Statics.field54[var5] == null) {
                    var4 = false;
                }
            }
            if (Statics.field3033[var5] != -1 && Statics.field996[var5] == null) {
                Statics.field996[var5] = Statics.field1298.method6640(Statics.field3033[var5], 0, Statics.field1616[var5]);
                if (Statics.field996[var5] == null) {
                    var4 = false;
                }
            }
        }
        if (!var4) {
            return;
        }
        method667(false);
        boolean var6 = true;
        for (int var7 = 0; var7 < Statics.field54.length; var7++) {
            byte[] var8 = Statics.field996[var7];
            if (var8 != null) {
                byte var9 = 10;
                byte var10 = 10;
                var6 &= class84.method185(var8, var9, var10);
            }
        }
        if (!var6) {
            return;
        }
        for (int var11 = 0; var11 < 4; var11++) {
            for (int var12 = 0; var12 < arg0.field1315[var11].length; var12++) {
                Arrays.fill(arg0.field1315[var11][var12], (byte) 0);
            }
        }
        method3185();
        class84.method3839();
        class72.method5455();
        method667(true);
        for (int var13 = 0; var13 < 4; var13++) {
            method3185();
            for (int var14 = 0; var14 < var1; var14++) {
                for (int var15 = 0; var15 < var2; var15++) {
                    boolean var16 = false;
                    int var17 = field768[var13][var14][var15];
                    if (var17 != -1) {
                        int var18 = var17 >> 24 & 0x3;
                        int var19 = var17 >> 1 & 0x3;
                        int var20 = var17 >> 14 & 0x3FF;
                        int var21 = var17 >> 3 & 0x7FF;
                        int var22 = (var20 / 8 << 8) + var21 / 8;
                        for (int var23 = 0; var23 < Statics.field3969.length; var23++) {
                            if (Statics.field3969[var23] == var22 && Statics.field54[var23] != null) {
                                int var24 = (var20 - var14) * 8;
                                int var25 = (var21 - var15) * 8;
                                class84.method4210(arg0, Statics.field54[var23], var13, var14 * 8, var15 * 8, var18, (var20 & 0x7) * 8, (var21 & 0x7) * 8, var19, var24, var25);
                                var16 = true;
                                break;
                            }
                        }
                    }
                    if (!var16) {
                        class84.method2948(arg0.field1314, var13, var14 * 8, var15 * 8);
                    }
                }
            }
        }
        for (int var26 = 0; var26 < 13; var26++) {
            for (int var27 = 0; var27 < 13; var27++) {
                int var28 = field768[0][var26][var27];
                if (var28 == -1) {
                    class84.method4357(arg0, var26 * 8, var27 * 8, 8, 8);
                }
            }
        }
        method667(true);
        for (int var29 = 0; var29 < 4; var29++) {
            method3185();
            for (int var30 = 0; var30 < var1; var30++) {
                for (int var31 = 0; var31 < var2; var31++) {
                    int var32 = field768[var29][var30][var31];
                    if (var32 != -1) {
                        int var33 = var32 >> 24 & 0x3;
                        int var34 = var32 >> 1 & 0x3;
                        int var35 = var32 >> 14 & 0x3FF;
                        int var36 = var32 >> 3 & 0x7FF;
                        int var37 = (var35 / 8 << 8) + var36 / 8;
                        for (int var38 = 0; var38 < Statics.field3969.length; var38++) {
                            if (Statics.field3969[var38] == var37 && Statics.field996[var38] != null) {
                                class84.method2260(arg0, Statics.field996[var38], var29, var30 * 8, var31 * 8, var33, (var35 & 0x7) * 8, (var36 & 0x7) * 8, var34);
                                break;
                            }
                        }
                    }
                }
            }
        }
        method667(true);
        method3185();
        class84.method7350(arg0);
        method667(true);
        class261.field2770.method5588();
        method3185();
        class84.method1158();
        field514 = false;
    }

    @ObfuscatedName("gs.kh(IB)V")
    public static final void method3287(int arg0) {
        int[] var1 = Statics.field1097.field5481;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((Statics.field4799.field1315[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field4799.field1328.method3621(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (Statics.field4799.field1315[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field4799.field1328.method3621(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field1097.method9246();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((Statics.field4799.field1315[arg0][var10][var9] & 0x18) == 0) {
                    method4502(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (Statics.field4799.field1315[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method4502(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field744 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                long var13 = Statics.field4799.field1328.method3744(Statics.field4799.field1308, var11, var12);
                if (var13 != 0L) {
                    int var15 = class198.method8270(var13);
                    int var16 = class261.method4328(var15).field2730;
                    if (var16 >= 0 && class235.method2700(var16).field2475) {
                        field567[field744] = class235.method2700(var16).method4398(false);
                        field745[field744] = var11;
                        field695[field744] = var12;
                        field744++;
                    }
                }
            }
        }
        Statics.field3197.method9208();
    }

    @ObfuscatedName("jq.kk(IIIIII)V")
    public static final void method4502(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class186 var5 = Statics.field4799.field1328;
        long var6 = var5.method3819(arg0, arg1, arg2);
        if (var6 != 0L) {
            int var8 = var5.method3628(arg0, arg1, arg2, var6);
            int var9 = var8 >> 6 & 0x3;
            int var10 = var8 & 0x1F;
            int var11 = arg3;
            if (class198.method6867(var6)) {
                var11 = arg4;
            }
            int[] var12 = Statics.field1097.field5481;
            int var13 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var14 = class198.method8270(var6);
            class261 var15 = class261.method4328(var14);
            if (var15.field2784 == -1) {
                if (var10 == 0 || var10 == 2) {
                    if (var9 == 0) {
                        var12[var13] = var11;
                        var12[var13 + 512] = var11;
                        var12[var13 + 1024] = var11;
                        var12[var13 + 1536] = var11;
                    } else if (var9 == 1) {
                        var12[var13] = var11;
                        var12[var13 + 1] = var11;
                        var12[var13 + 2] = var11;
                        var12[var13 + 3] = var11;
                    } else if (var9 == 2) {
                        var12[var13 + 3] = var11;
                        var12[var13 + 3 + 512] = var11;
                        var12[var13 + 3 + 1024] = var11;
                        var12[var13 + 3 + 1536] = var11;
                    } else if (var9 == 3) {
                        var12[var13 + 1536] = var11;
                        var12[var13 + 1536 + 1] = var11;
                        var12[var13 + 1536 + 2] = var11;
                        var12[var13 + 1536 + 3] = var11;
                    }
                }
                if (var10 == 3) {
                    if (var9 == 0) {
                        var12[var13] = var11;
                    } else if (var9 == 1) {
                        var12[var13 + 3] = var11;
                    } else if (var9 == 2) {
                        var12[var13 + 3 + 1536] = var11;
                    } else if (var9 == 3) {
                        var12[var13 + 1536] = var11;
                    }
                }
                if (var10 == 2) {
                    if (var9 == 3) {
                        var12[var13] = var11;
                        var12[var13 + 512] = var11;
                        var12[var13 + 1024] = var11;
                        var12[var13 + 1536] = var11;
                    } else if (var9 == 0) {
                        var12[var13] = var11;
                        var12[var13 + 1] = var11;
                        var12[var13 + 2] = var11;
                        var12[var13 + 3] = var11;
                    } else if (var9 == 1) {
                        var12[var13 + 3] = var11;
                        var12[var13 + 3 + 512] = var11;
                        var12[var13 + 3 + 1024] = var11;
                        var12[var13 + 3 + 1536] = var11;
                    } else if (var9 == 2) {
                        var12[var13 + 1536] = var11;
                        var12[var13 + 1536 + 1] = var11;
                        var12[var13 + 1536 + 2] = var11;
                        var12[var13 + 1536 + 3] = var11;
                    }
                }
            } else {
                class562 var16 = Statics.field4977[var15.field2784];
                if (var16 != null) {
                    int var17 = (var15.field2746 * 4 - var16.field5476) / 2;
                    int var18 = (var15.field2759 * 4 - var16.field5472) / 2;
                    var16.method9218(arg1 * 4 + 48 + var17, (104 - arg2 - var15.field2759) * 4 + 48 + var18);
                }
            }
        }
        long var19 = var5.method3626(arg0, arg1, arg2);
        if (var19 != 0L) {
            int var21 = var5.method3628(arg0, arg1, arg2, var19);
            int var22 = var21 >> 6 & 0x3;
            int var23 = var21 & 0x1F;
            int var24 = class198.method8270(var19);
            class261 var25 = class261.method4328(var24);
            if (var25.field2784 != -1) {
                class562 var26 = Statics.field4977[var25.field2784];
                if (var26 != null) {
                    int var27 = (var25.field2746 * 4 - var26.field5476) / 2;
                    int var28 = (var25.field2759 * 4 - var26.field5472) / 2;
                    var26.method9218(arg1 * 4 + 48 + var27, (104 - arg2 - var25.field2759) * 4 + 48 + var28);
                }
            } else if (var23 == 9) {
                int var29 = 15658734;
                if (class198.method6867(var19)) {
                    var29 = 15597568;
                }
                int[] var30 = Statics.field1097.field5481;
                int var31 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
                if (var22 == 0 || var22 == 2) {
                    var30[var31 + 1536] = var29;
                    var30[var31 + 1024 + 1] = var29;
                    var30[var31 + 512 + 2] = var29;
                    var30[var31 + 3] = var29;
                } else {
                    var30[var31] = var29;
                    var30[var31 + 512 + 1] = var29;
                    var30[var31 + 1024 + 2] = var29;
                    var30[var31 + 1536 + 3] = var29;
                }
            }
        }
        long var32 = var5.method3744(arg0, arg1, arg2);
        if (var32 == 0L) {
            return;
        }
        int var34 = class198.method8270(var32);
        class261 var35 = class261.method4328(var34);
        if (var35.field2784 == -1) {
            return;
        }
        class562 var36 = Statics.field4977[var35.field2784];
        if (var36 != null) {
            int var37 = (var35.field2746 * 4 - var36.field5476) / 2;
            int var38 = (var35.field2759 * 4 - var36.field5472) / 2;
            var36.method9218(arg1 * 4 + 48 + var37, (104 - arg2 - var35.field2759) * 4 + 48 + var38);
        }
    }

    @ObfuscatedName("client.kd(Leq;IB)Z")
    public boolean method1161(class115 arg0, int arg1) {
        if (arg0.field1452 == 0) {
            Statics.field70 = null;
        } else {
            if (Statics.field70 == null) {
                Statics.field70 = new class468(Statics.field848, Statics.field997);
            }
            Statics.field70.method7888(arg0.field1450, arg1);
        }
        method2301();
        arg0.field1451 = null;
        return true;
    }

    @ObfuscatedName("client.ka(Leq;I)Z")
    public boolean method1648(class115 arg0) {
        if (Statics.field70 != null) {
            Statics.field70.method7882(arg0.field1450);
        }
        method2301();
        arg0.field1451 = null;
        return true;
    }

    @ObfuscatedName("client.kg(Leq;I)Z")
    public final boolean method1364(class115 arg0) {
        class480 var2 = arg0.method2833();
        class548 var3 = arg0.field1450;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1451 == null) {
                if (arg0.field1453) {
                    if (!var2.method8070(1)) {
                        return false;
                    }
                    var2.method8067(arg0.field1450.field5381, 0, 1);
                    arg0.field1454 = 0;
                    arg0.field1453 = false;
                }
                var3.field5378 = 0;
                if (var3.method8743()) {
                    if (!var2.method8070(1)) {
                        return false;
                    }
                    var2.method8067(arg0.field1450.field5381, 1, 1);
                    arg0.field1454 = 0;
                }
                arg0.field1453 = true;
                class325[] var4 = class325.method3180();
                int var5 = var3.method8739();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field5378);
                }
                arg0.field1451 = var4[var5];
                arg0.field1452 = arg0.field1451.field3464;
            }
            if (arg0.field1452 == -1) {
                if (!var2.method8070(1)) {
                    return false;
                }
                arg0.method2833().method8067(var3.field5381, 0, 1);
                arg0.field1452 = var3.field5381[0] & 0xFF;
            }
            if (arg0.field1452 == -2) {
                if (!var2.method8070(2)) {
                    return false;
                }
                arg0.method2833().method8067(var3.field5381, 0, 2);
                var3.field5378 = 0;
                arg0.field1452 = var3.method8968();
            }
            if (!var2.method8070(arg0.field1452)) {
                return false;
            }
            var3.field5378 = 0;
            var2.method8067(var3.field5381, 0, arg0.field1452);
            arg0.field1454 = 0;
            field703.method7756();
            arg0.field1445 = arg0.field1449;
            arg0.field1449 = arg0.field1456;
            arg0.field1456 = arg0.field1451;
            if (class325.field3466 == arg0.field1451) {
                int var6 = var3.method9025();
                int var7 = var3.method8968();
                int var8 = class547.field5372 >= 223 ? var3.method8919() : -1;
                this.method583(false);
                if (var6 == 0) {
                    Statics.field3728 = Statics.field4799.field1317[var7];
                    field635 = -1;
                    if (Statics.field4799 != Statics.field2672.field1140) {
                        Statics.field4799.field1328.method3636(class174.field1825);
                        Statics.field2672.field1140 = Statics.field4799;
                    }
                } else if (var6 == 1) {
                    field635 = -1;
                    Statics.field3728 = Statics.field4799.field1318[var7];
                } else if (var6 == 2) {
                    field635 = var8;
                    Statics.field3728 = Statics.field4799.field1321[var7];
                    this.method583(true);
                    if (Statics.field4799.field1321[var7].field4947 != Statics.field2672.field1140) {
                        Statics.field4799.field1328.method3636(class174.field1824);
                        Statics.field2672.field1140 = Statics.field4799.field1321[var7].field4947;
                    }
                }
                if (Statics.field3728 == null) {
                    field635 = -1;
                    Statics.field3728 = Statics.field2672;
                }
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3515 == arg0.field1451) {
                Statics.field3543.field1316 = 0;
                Statics.field3543.field1307 = 0;
                for (int var9 = 0; var9 < 65536; var9++) {
                    Statics.field3543.field1318[var9] = null;
                }
                for (int var10 = 0; var10 < 2048; var10++) {
                    Statics.field3543.field1321[var10] = null;
                }
                Statics.field4799.field1328.method3636(class174.field1825);
                Statics.field2672.field1140 = Statics.field4799;
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3445 == arg0.field1451) {
                int var11 = var3.method8990();
                int var12 = var3.method8980();
                class349.field3699[var11] = var12;
                if (class349.field3702[var11] != var12) {
                    class349.field3702[var11] = var12;
                }
                method1069(var11);
                field746[++field693 - 1 & 0x1F] = var11;
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3417 == arg0.field1451) {
                method2872();
                int var13 = var3.method8803();
                int var14 = var3.method8839();
                int var15 = var3.method8958();
                int var16 = var3.method8839();
                field647[var16] = var13;
                field578[var16] = var15;
                field646[var16] = 1;
                field648[var16] = var14;
                for (int var17 = 0; var17 < 98; var17++) {
                    if (var13 >= class371.field4017[var17]) {
                        field646[var16] = var17 + 2;
                    }
                }
                field696[++field697 - 1 & 0x1F] = var16;
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3491 == arg0.field1451) {
                field527 = var3.method9025();
                if (field527 == 1) {
                    field528 = var3.method8968();
                }
                if (field527 >= 2 && field527 <= 6) {
                    if (field527 == 2) {
                        field645 = 64;
                        field534 = 64;
                    }
                    if (field527 == 3) {
                        field645 = 0;
                        field534 = 64;
                    }
                    if (field527 == 4) {
                        field645 = 128;
                        field534 = 64;
                    }
                    if (field527 == 5) {
                        field645 = 64;
                        field534 = 0;
                    }
                    if (field527 == 6) {
                        field645 = 64;
                        field534 = 128;
                    }
                    field527 = 2;
                    field640 = var3.method8968();
                    field531 = var3.method8968();
                    field720 = var3.method9025();
                }
                if (field527 == 10) {
                    field529 = var3.method8968();
                }
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3477 == arg0.field1451) {
                boolean var18 = var3.method9025() == 1;
                if (var18) {
                    Statics.field3698 = class329.method5009() - var3.method8804();
                    Statics.field4777 = new class391(var3, true);
                } else {
                    Statics.field4777 = null;
                }
                field706 = field691;
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3484 == arg0.field1451) {
                int var19 = var3.method8813();
                boolean var20 = var3.method9025() == 1;
                String var21 = "";
                boolean var22 = false;
                if (var20) {
                    var21 = var3.method8808();
                    if (Statics.field3011.method1860(new class572(var21, Statics.field848))) {
                        var22 = true;
                    }
                }
                String var23 = var3.method8808();
                if (!var22) {
                    class114.method4997(var19, var21, var23);
                }
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3451 == arg0.field1451) {
                field766 = false;
                field538 = false;
                field760 = false;
                field761 = false;
                Statics.field1722 = 0;
                Statics.field2418 = 0;
                Statics.field4603 = 0;
                field515 = false;
                Statics.field2614 = 0;
                Statics.field462 = 0;
                Statics.field828 = 0;
                Statics.field501 = 0;
                Statics.field1794 = 0;
                Statics.field3546 = 0;
                Statics.field2087 = 0;
                field763 = null;
                field616 = null;
                field518 = null;
                for (int var24 = 0; var24 < 5; var24++) {
                    field765[var24] = false;
                }
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3465 == arg0.field1451) {
                int var25 = var3.method8968();
                int var26 = var3.method9025();
                int var27 = var3.method8968();
                method8117(var25, var26, var27);
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3474 == arg0.field1451) {
                int var28 = var3.method9025();
                int var29 = var3.method8839();
                int var30 = var3.method8980();
                class361 var31 = Statics.field2667.method5964(var30);
                var31.field3862.method6009(var29, var28);
                method7116(var31);
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3490 == arg0.field1451) {
                field538 = true;
                field766 = false;
                field761 = true;
                int var32 = method6810(var3.method8919() & 0x7EB);
                int var33 = method4335(var3.method8919() & 0x7EB);
                int var34 = var3.method8968();
                int var35 = var3.method9025();
                field616 = new class512(Statics.field1500, var33, var34, var35);
                field518 = new class512(Statics.field2888, var32, var34, var35);
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3390 == arg0.field1451) {
                method795(class323.field3371);
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3392 == arg0.field1451) {
                field563 = field691;
                byte var36 = var3.method8798();
                class166 var37 = new class166(var3);
                class169 var38;
                if (var36 >= 0) {
                    var38 = field608[var36];
                } else {
                    var38 = Statics.field312;
                }
                if (var38 == null) {
                    this.method1188(var36);
                    arg0.field1451 = null;
                    return true;
                }
                if (var37.field1785 > var38.field1804) {
                    this.method1188(var36);
                    arg0.field1451 = null;
                    return true;
                }
                if (var37.field1785 < var38.field1804) {
                    arg0.field1451 = null;
                    return true;
                }
                var37.method3299(var38);
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3513 == arg0.field1451) {
                Statics.field1356 = var3.method8810();
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3456 == arg0.field1451) {
                method2179(false, arg0.field1450);
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3502 == arg0.field1451) {
                method795(class323.field3366);
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3433 == arg0.field1451) {
                int var39 = var3.method8968();
                int var40 = var3.method9046();
                Statics.method2347(var40, var39);
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3473 == arg0.field1451) {
                field542 = var3.method9025();
                if (field542 == 255) {
                    field542 = 0;
                }
                field739 = var3.method9025();
                if (field739 == 255) {
                    field739 = 0;
                }
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3455 == arg0.field1451) {
                int var41 = var3.method8980();
                int var42 = var3.method8990();
                class361 var43 = Statics.field2667.method5964(var41);
                if (var43.field3848 != 2 || var43.field3849 != var42) {
                    var43.field3848 = 2;
                    var43.field3849 = var42;
                    method7116(var43);
                }
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3415 == arg0.field1451) {
                int var44 = var3.method8803();
                class89 var45 = (class89) field762.method8544((long) var44);
                if (var45 != null) {
                    method1078(var45, true);
                }
                if (field672 != null) {
                    method7116(field672);
                    field672 = null;
                }
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3397 == arg0.field1451) {
                int var46 = var3.method8880();
                int var47 = var3.method8899();
                class361 var48 = Statics.field2667.method5964(var47);
                var48.field3862.method6007(Statics.field2672.field1111.field3745, var46);
                method7116(var48);
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3442 == arg0.field1451) {
                int var49 = var3.method9025();
                int var50 = var3.method8990();
                int var51 = var3.method8814();
                int var52 = var3.method8885();
                int var53 = var52 >> 16;
                int var54 = var52 >> 8 & 0xFF;
                int var55 = (var52 >> 4 & 0x7) + var53;
                int var56 = (var52 & 0x7) + var54;
                if (var55 >= 0 && var56 >= 0 && var55 < Statics.field3543.field1309 && var56 < Statics.field3543.field1310) {
                    int var57 = class379.method6569(var55);
                    int var58 = class379.method6569(var56);
                    class74 var59 = new class74(var50, Statics.field3543.field1308, var57, var58, method3285(Statics.field3543, var57, var58, Statics.field3543.field1308) - var49, var51, field519);
                    Statics.field3543.field1327.method6892(var59);
                }
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3512 == arg0.field1451) {
                int var60 = var3.method8841();
                int var61 = var3.method8842();
                int var62 = var3.method8803();
                class361 var63 = Statics.field2667.method5964(var62);
                if (var63.field3813 != var60 || var63.field3814 != var61 || var63.field3804 != 0 || var63.field3810 != 0) {
                    var63.field3813 = var60;
                    var63.field3814 = var61;
                    var63.field3804 = 0;
                    var63.field3810 = 0;
                    method7116(var63);
                    this.method1185(var63);
                    if (var63.field3828 == 0) {
                        method3298(Statics.field2667.field3709[var62 >> 16], var63, false);
                    }
                }
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3407 == arg0.field1451) {
                int var64 = var3.method8803();
                int var65 = var3.method8968();
                if (var64 < -70000) {
                    var65 += 32768;
                }
                class361 var66;
                if (var64 >= 0) {
                    var66 = Statics.field2667.method5964(var64);
                } else {
                    var66 = null;
                }
                if (var66 != null) {
                    for (int var67 = 0; var67 < var66.field3937.length; var67++) {
                        var66.field3937[var67] = 0;
                        var66.field3938[var67] = 0;
                    }
                }
                class87.method6776(var65);
                int var68 = var3.method8968();
                for (int var69 = 0; var69 < var68; var69++) {
                    int var70 = var3.method8880();
                    if (var70 == 255) {
                        var70 = var3.method8803();
                    }
                    int var71 = var3.method8814();
                    if (var66 != null && var69 < var66.field3937.length) {
                        var66.field3937[var69] = var71;
                        var66.field3938[var69] = var70;
                    }
                    class87.method6533(var65, var69, var71 - 1, var70);
                }
                if (var66 != null) {
                    method7116(var66);
                }
                method2872();
                field710[++field573 - 1 & 0x1F] = var65 & 0x7FFF;
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3468 == arg0.field1451) {
                int var72 = var3.method8803();
                int var73 = var3.method8968();
                if (var72 < -70000) {
                    var73 += 32768;
                }
                class361 var74;
                if (var72 >= 0) {
                    var74 = Statics.field2667.method5964(var72);
                } else {
                    var74 = null;
                }
                while (var3.field5378 < arg0.field1452) {
                    int var75 = var3.method8813();
                    int var76 = var3.method8968();
                    int var77 = 0;
                    if (var76 != 0) {
                        var77 = var3.method9025();
                        if (var77 == 255) {
                            var77 = var3.method8803();
                        }
                    }
                    if (var74 != null && var75 >= 0 && var75 < var74.field3937.length) {
                        var74.field3937[var75] = var76;
                        var74.field3938[var75] = var77;
                    }
                    class87.method6533(var73, var75, var76 - 1, var77);
                }
                if (var74 != null) {
                    method7116(var74);
                }
                method2872();
                field710[++field573 - 1 & 0x1F] = var73 & 0x7FFF;
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3395 == arg0.field1451) {
                return this.method1161(arg0, 2);
            }
            if (class325.field3418 == arg0.field1451) {
                for (int var78 = 0; var78 < class349.field3702.length; var78++) {
                    if (class349.field3702[var78] != class349.field3699[var78]) {
                        class349.field3702[var78] = class349.field3699[var78];
                        method1069(var78);
                        field746[++field693 - 1 & 0x1F] = var78;
                    }
                }
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3518 == arg0.field1451) {
                Statics.field4935 = new class488(Statics.field4035);
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3509 == arg0.field1451) {
                method2280(Statics.field3543, var3);
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3448 == arg0.field1451) {
                int var79 = var3.method8803();
                int var80 = var3.method8980();
                class361 var81 = Statics.field2667.method5964(var79);
                var81.field3862.method6010(var80);
                method7116(var81);
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3443 == arg0.field1451) {
                int var82 = var3.method8839();
                int var83 = var3.method9046();
                int var84 = var3.method9046();
                if (var84 == 65535) {
                    var84 = -1;
                }
                class104 var85 = Statics.field3543.field1318[var83];
                if (var85 != null) {
                    if (var85.field1257 == var84 && var84 != -1) {
                        int var86 = class264.method3551(var84).field2887;
                        if (var86 == 1) {
                            var85.field1226 = 0;
                            var85.field1212 = 0;
                            var85.field1228 = var82;
                            var85.field1229 = 0;
                        } else if (var86 == 2) {
                            var85.field1229 = 0;
                        }
                    } else if (var84 == -1 || var85.field1257 == -1 || class264.method3551(var84).field2868 >= class264.method3551(var85.field1257).field2868) {
                        var85.field1257 = var84;
                        var85.field1226 = 0;
                        var85.field1212 = 0;
                        var85.field1228 = var82;
                        var85.field1229 = 0;
                        var85.field1256 = var85.field1217;
                    }
                }
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3506 == arg0.field1451) {
                int var87 = var3.method9046();
                int var88 = var3.method8968();
                int var89 = var3.method8814();
                int var90 = var3.method9046();
                int var91 = var3.method8814();
                if (var91 == 65535) {
                    var91 = -1;
                }
                ArrayList var92 = new ArrayList();
                var92.add(var91);
                method3330(var92, var87, var88, var90, var89);
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3494 == arg0.field1451) {
                if (Statics.field4935 == null) {
                    Statics.field4935 = new class488(Statics.field4035);
                }
                class558 var93 = Statics.field4035.method8143(var3);
                Statics.field4935.field5017.method8554(var93.field5445, var93.field5446);
                field698[++field699 - 1 & 0x1F] = var93.field5445;
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3438 == arg0.field1451) {
                method795(class323.field3363);
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3516 == arg0.field1451) {
                int var94 = var3.method9025();
                int var95 = var3.method8968();
                int var96 = var3.method9025();
                if (var94 == 0) {
                    Statics.field4799.field1308 = var96;
                    Statics.field3543 = Statics.field4799;
                } else if (var94 == 1) {
                    class478 var97 = Statics.field4799.field1321[var95];
                    var97.field4947.field1308 = var96;
                    Statics.field3543 = var97.field4947;
                } else {
                    throw new RuntimeException("Don't know what world we're about to receive updates for, this is bad");
                }
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3437 == arg0.field1451) {
                int var98 = var3.method8814();
                if (var98 == 65535) {
                    var98 = -1;
                }
                field667 = var98;
                this.method1184(false);
                method8210(var98);
                class73.method5469(field667);
                for (int var99 = 0; var99 < 100; var99++) {
                    field717[var99] = true;
                }
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3444 == arg0.field1451) {
                method795(class323.field3369);
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3450 == arg0.field1451) {
                for (int var100 = 0; var100 < Statics.field3543.field1317.length; var100++) {
                    if (Statics.field3543.field1317[var100] != null) {
                        Statics.field3543.field1317[var100].field1257 = -1;
                    }
                }
                for (int var101 = 0; var101 < Statics.field3543.field1318.length; var101++) {
                    if (Statics.field3543.field1318[var101] != null) {
                        Statics.field3543.field1318[var101].field1257 = -1;
                    }
                }
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3394 == arg0.field1451) {
                field731 = var3.method8880();
                field730 = var3.method8839();
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3382 == arg0.field1451) {
                for (int var102 = 0; var102 < Statics.field2454; var102++) {
                    class233 var103 = class233.method6826(var102);
                    if (var103 != null) {
                        class349.field3699[var102] = 0;
                        class349.field3702[var102] = 0;
                    }
                }
                method2872();
                field693 += 32;
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3497 == arg0.field1451) {
                int var104 = var3.method9025();
                int var105 = var3.method8990();
                class104 var106 = Statics.field3543.field1318[var105];
                int var107 = var3.method9046();
                int var108 = var3.method8855();
                if (var106 != null) {
                    var106.method2425(var104, var107, var108 >> 16, var108 & 0xFFFF);
                }
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3487 == arg0.field1451) {
                int var109 = var3.method8958() * 4;
                byte var110 = var3.method8798();
                int var111 = var3.method8814();
                int var112 = var3.method8839();
                int var113 = var3.method8880() * 4;
                int var114 = var3.method9046();
                int var115 = var3.method8968();
                int var116 = var3.method8802();
                int var117 = var3.method8844();
                int var118 = var117 >> 16;
                int var119 = var117 >> 8 & 0xFF;
                int var120 = (var117 >> 4 & 0x7) + var118;
                int var121 = (var117 & 0x7) + var119;
                byte var122 = var3.method8879();
                int var123 = var3.method9046();
                int var124 = var110 + var120;
                int var125 = var121 + var122;
                if (0 <= var120 && var120 < 104 && 0 <= var121 && var121 < 104 && 0 <= var124 && var124 < 104 && 0 <= var125 && var125 < 104 && var115 != 65535) {
                    int var126 = class379.method6569(var120);
                    int var127 = class379.method6569(var121);
                    int var128 = class379.method6569(var124);
                    int var129 = class379.method6569(var125);
                    class79 var130 = new class79(var115, Statics.field3543.field1308, var126, var127, method3285(Statics.field3543, var126, var127, Statics.field3543.field1308) - var109, field519 + var123, field519 + var114, var112, var111, var116, var113);
                    var130.method2185(var128, var129, method3285(Statics.field3543, var128, var129, Statics.field3543.field1308) - var113, field519 + var123);
                    Statics.field3543.field1326.method6892(var130);
                }
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3447 == arg0.field1451) {
                field538 = true;
                field766 = false;
                field761 = false;
                Statics.field1722 = var3.method9025();
                Statics.field2418 = var3.method9025();
                Statics.field4603 = var3.method8968();
                Statics.field2614 = var3.method9025();
                Statics.field462 = var3.method9025();
                if (Statics.field462 >= 100) {
                    int var131 = class379.method6569(Statics.field1722);
                    int var132 = class379.method6569(Statics.field2418);
                    int var133 = method3285(Statics.field4799, var131, var132, Statics.field4799.field1308) - Statics.field4603;
                    int var134 = var131 - Statics.field4736;
                    int var135 = var133 - Statics.field65;
                    int var136 = var132 - Statics.field3140;
                    int var137 = (int) Math.sqrt((double) (var134 * var134 + var136 * var136));
                    Statics.field1500 = (int) (Math.atan2((double) var135, (double) var137) * 325.9490051269531D) & 0x7FF;
                    Statics.field2888 = (int) (Math.atan2((double) var134, (double) var136) * -325.9490051269531D) & 0x7FF;
                    if (Statics.field1500 < 128) {
                        Statics.field1500 = 128;
                    }
                    if (Statics.field1500 > 383) {
                        Statics.field1500 = 383;
                    }
                }
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3423 == arg0.field1451) {
                method2872();
                int var138 = var3.method8803();
                int var139 = var3.method8958();
                int var140 = var3.method8880();
                field647[var139] = var138;
                field578[var139] = var140;
                field646[var139] = 1;
                field648[var139] = var140;
                for (int var141 = 0; var141 < 98; var141++) {
                    if (var138 >= class371.field4017[var141]) {
                        field646[var139] = var141 + 2;
                    }
                }
                field696[++field697 - 1 & 0x1F] = var139;
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3486 == arg0.field1451) {
                class37.method7876(var3, arg0.field1452);
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3488 == arg0.field1451) {
                Statics.field5059 = var3.method9025();
                field583 = var3.method8880();
                Statics.field1799 = var3.method8880();
                while (var3.field5378 < arg0.field1452) {
                    int var142 = var3.method9025();
                    class323 var143 = class323.method4957()[var142];
                    method795(var143);
                }
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3413 == arg0.field1451) {
                int var144 = var3.method9025();
                method2323(var144);
                arg0.field1451 = null;
                return false;
            }
            if (class325.field3400 == arg0.field1451) {
                String var145 = var3.method8808();
                String var146 = class437.method7594(class417.method3596(class364.method8085(var3)));
                class114.method4997(6, var145, var146);
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3391 == arg0.field1451) {
                int var147 = var3.method8803();
                boolean var148 = var3.method8839() == 1;
                class361 var149 = Statics.field2667.method5964(var147);
                var149.method6465(Statics.field2672.field1111, var148);
                method7116(var149);
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3470 == arg0.field1451) {
                method795(class323.field3362);
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3508 == arg0.field1451) {
                byte[] var150 = new byte[arg0.field1452];
                var3.method8772(var150, 0, var150.length);
                class549 var151 = new class549(var150);
                String var152 = var151.method8808();
                class32.method4914(var152, true, false);
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3422 == arg0.field1451) {
                Statics.field3011.method1856(var3, arg0.field1452);
                field504 = field691;
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3472 == arg0.field1451 && field538) {
                field766 = true;
                field761 = false;
                field760 = false;
                for (int var153 = 0; var153 < 5; var153++) {
                    field765[var153] = false;
                }
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3425 == arg0.field1451) {
                int var154 = var3.method9025();
                int var155 = var3.method8968();
                this.method583(false);
                if (var154 == 0) {
                    Statics.field3728 = Statics.field4799.field1317[var155];
                } else if (var154 == 1) {
                    Statics.field3728 = Statics.field4799.field1318[var155];
                } else if (var154 == 2) {
                    Statics.field3728 = Statics.field4799.field1321[var155];
                    this.method583(true);
                }
                if (Statics.field3728 == null) {
                    Statics.field3728 = Statics.field2672;
                }
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3495 == arg0.field1451) {
                int var156 = var3.method8990();
                int var157 = var3.method8803();
                int var158 = var3.method8880();
                class89 var159 = (class89) field762.method8544((long) var157);
                if (var159 != null) {
                    method1078(var159, var159.field1062 != var156);
                }
                Statics.method7130(var157, var156, var158);
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3411 == arg0.field1451) {
                Statics.field1300 = var3.method8810();
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3426 == arg0.field1451) {
                String var160 = var3.method8808();
                long var161 = var3.method8804();
                long var163 = (long) var3.method8968();
                long var165 = (long) var3.method8801();
                class383 var167 = (class383) class403.method3083(class383.method5910(), var3.method9025());
                long var168 = (var163 << 32) + var165;
                boolean var170 = false;
                for (int var171 = 0; var171 < 100; var171++) {
                    if (field759[var171] == var168) {
                        var170 = true;
                        break;
                    }
                }
                if (var167.field4434 && Statics.field3011.method1860(new class572(var160, Statics.field848))) {
                    var170 = true;
                }
                if (!var170 && field587 == 0) {
                    field759[field734] = var168;
                    field734 = (field734 + 1) % 100;
                    String var172 = class437.method7594(class417.method3596(class364.method8085(var3)));
                    if (var167.field4432 == -1) {
                        class114.method8651(9, var160, var172, class419.method4933(var161));
                    } else {
                        class114.method8651(9, class105.method3198(var167.field4432) + var160, var172, class419.method4933(var161));
                    }
                }
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3424 == arg0.field1451) {
                field520++;
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3393 == arg0.field1451) {
                int var173 = var3.method8990();
                if (var173 == 65535) {
                    var173 = -1;
                }
                int var174 = var3.method8803();
                int var175 = var3.method8855();
                class361 var176 = Statics.field2667.method5964(var174);
                if (var176.field3910) {
                    var176.field3939 = var173;
                    var176.field3940 = var175;
                    class262 var178 = class262.method2385(var173).method4772(var175);
                    var176.field3856 = var178.field2803;
                    var176.field3857 = var178.field2809;
                    var176.field3841 = var178.field2827;
                    var176.field3854 = var178.field2806;
                    var176.field3871 = var178.field2807;
                    var176.field3859 = var178.field2802;
                    if (var178.field2847 == 1) {
                        var176.field3944 = 1;
                    } else {
                        var176.field3944 = 2;
                    }
                    if (var176.field3809 > 0) {
                        var176.field3859 = var176.field3859 * 32 / var176.field3809;
                    } else if (var176.field3815 > 0) {
                        var176.field3859 = var176.field3859 * 32 / var176.field3815;
                    }
                    method7116(var176);
                } else if (var173 == -1) {
                    var176.field3848 = 0;
                    arg0.field1451 = null;
                    return true;
                } else {
                    class262 var177 = class262.method2385(var173).method4772(var175);
                    var176.field3848 = 4;
                    var176.field3849 = var173;
                    var176.field3856 = var177.field2803;
                    var176.field3857 = var177.field2809;
                    var176.field3859 = var177.field2802 * 100 / var175;
                    method7116(var176);
                }
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3441 == arg0.field1451) {
                method3162();
                byte var179 = var3.method8798();
                if (arg0.field1452 == 1) {
                    if (var179 >= 0) {
                        field741[var179] = null;
                    } else {
                        Statics.field3968 = null;
                    }
                    arg0.field1451 = null;
                    return true;
                }
                if (var179 >= 0) {
                    field741[var179] = new class160(var3);
                } else {
                    Statics.field3968 = new class160(var3);
                }
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3406 == arg0.field1451) {
                var3.field5378 += 28;
                if (var3.method8791()) {
                    method4763(var3, var3.field5378 - 28);
                }
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3498 == arg0.field1451) {
                return this.method1161(arg0, 1);
            }
            if (class325.field3412 == arg0.field1451) {
                field526 = var3.method8968() * 30;
                field707 = field691;
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3385 == arg0.field1451) {
                int var180 = var3.method9025();
                method3111(var180);
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3500 == arg0.field1451) {
                method3104();
                arg0.field1451 = null;
                return false;
            }
            if (class325.field3475 == arg0.field1451) {
                field563 = field691;
                byte var181 = var3.method8798();
                if (arg0.field1452 == 1) {
                    if (var181 >= 0) {
                        field608[var181] = null;
                    } else {
                        Statics.field312 = null;
                    }
                    arg0.field1451 = null;
                    return true;
                }
                if (var181 >= 0) {
                    field608[var181] = new class169(var3);
                } else {
                    Statics.field312 = new class169(var3);
                }
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3404 == arg0.field1451) {
                byte var182 = var3.method8798();
                String var183 = var3.method8808();
                long var184 = (long) var3.method8968();
                long var186 = (long) var3.method8801();
                class383 var188 = (class383) class403.method3083(class383.method5910(), var3.method9025());
                long var189 = (var184 << 32) + var186;
                boolean var191 = false;
                Object var192 = null;
                class169 var193 = var182 >= 0 ? field608[var182] : Statics.field312;
                if (var193 == null) {
                    var191 = true;
                } else {
                    int var194 = 0;
                    while (true) {
                        if (var194 >= 100) {
                            if (var188.field4434 && Statics.field3011.method1860(new class572(var183, Statics.field848))) {
                                var191 = true;
                            }
                            break;
                        }
                        if (field759[var194] == var189) {
                            var191 = true;
                            break;
                        }
                        var194++;
                    }
                }
                if (!var191) {
                    field759[field734] = var189;
                    field734 = (field734 + 1) % 100;
                    String var195 = class437.method7594(class364.method8085(var3));
                    int var196 = var182 >= 0 ? 41 : 44;
                    if (var188.field4432 == -1) {
                        class114.method8651(var196, var183, var195, var193.field1803);
                    } else {
                        class114.method8651(var196, class105.method3198(var188.field4432) + var183, var195, var193.field1803);
                    }
                }
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3436 == arg0.field1451) {
                Statics.field1799 = var3.method9025();
                Statics.field5059 = var3.method8880();
                field583 = var3.method9025();
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3517 == arg0.field1451) {
                field634 = var3.method8808();
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3462 == arg0.field1451) {
                int var197 = var3.method8803();
                if (field604 != var197) {
                    field604 = var197;
                    method671();
                }
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3459 == arg0.field1451) {
                field538 = true;
                field766 = false;
                field760 = true;
                Statics.field1794 = var3.method9025();
                Statics.field3546 = var3.method9025();
                int var198 = var3.method8968();
                int var199 = class379.method6569(var3.method9025());
                int var200 = class379.method6569(var3.method9025());
                int var201 = var3.method8968();
                field515 = var3.method8810();
                int var202 = var3.method9025();
                int var203 = class379.method6569(Statics.field1794);
                int var204 = class379.method6569(Statics.field3546);
                boolean var205 = false;
                boolean var206 = false;
                int var207;
                int var208;
                if (field515) {
                    var207 = Statics.field65;
                    var208 = method3285(Statics.field4799, var203, var204, Statics.field4799.field1308) - var198;
                } else {
                    var207 = method3285(Statics.field4799, Statics.field4736, Statics.field3140, Statics.field4799.field1308) - Statics.field65;
                    var208 = var198;
                }
                field763 = new class510(Statics.field4736, Statics.field3140, var207, var203, var204, var208, var199, var200, var201, var202);
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3461 == arg0.field1451) {
                int var209 = var3.method8968();
                class87.method5006(var209);
                field710[++field573 - 1 & 0x1F] = var209 & 0x7FFF;
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3514 == arg0.field1451) {
                Statics.field108 = var3.method8810();
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3388 == arg0.field1451) {
                String var210 = var3.method8808();
                long var211 = (long) var3.method8968();
                long var213 = (long) var3.method8801();
                class383 var215 = (class383) class403.method3083(class383.method5910(), var3.method9025());
                long var216 = (var211 << 32) + var213;
                boolean var218 = false;
                for (int var219 = 0; var219 < 100; var219++) {
                    if (field759[var219] == var216) {
                        var218 = true;
                        break;
                    }
                }
                if (Statics.field3011.method1860(new class572(var210, Statics.field848))) {
                    var218 = true;
                }
                if (!var218 && field587 == 0) {
                    field759[field734] = var216;
                    field734 = (field734 + 1) % 100;
                    String var220 = class437.method7594(class417.method3596(class364.method8085(var3)));
                    byte var221;
                    if (var215.field4431) {
                        var221 = 7;
                    } else {
                        var221 = 3;
                    }
                    if (var215.field4432 == -1) {
                        class114.method4997(var221, var210, var220);
                    } else {
                        class114.method4997(var221, class105.method3198(var215.field4432) + var210, var220);
                    }
                }
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3471 == arg0.field1451) {
                Statics.field4935 = null;
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3476 == arg0.field1451) {
                method3841(Statics.field3543, false, var3);
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3430 == arg0.field1451) {
                method2872();
                field680 = var3.method8968();
                field707 = field691;
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3469 == arg0.field1451) {
                boolean var222 = var3.method8839() == 1;
                int var223 = var3.method8980();
                class361 var224 = Statics.field2667.method5964(var223);
                if (var224.field3824 != var222) {
                    var224.field3824 = var222;
                    method7116(var224);
                }
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3414 == arg0.field1451) {
                int var225 = var3.method8990();
                if (var225 == 65535) {
                    var225 = -1;
                }
                method7186(var225);
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3481 == arg0.field1451) {
                int var226 = var3.method8885();
                int var227 = var3.method8990();
                if (var227 == 65535) {
                    var227 = -1;
                }
                method2311(var227, var226);
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3489 == arg0.field1451) {
                int var228 = var3.method8990();
                if (var228 == 65535) {
                    var228 = -1;
                }
                int var229 = var3.method9046();
                int var230 = var3.method8814();
                int var231 = var3.method8968();
                int var232 = var3.method8968();
                int var233 = var3.method8814();
                if (var233 == 65535) {
                    var233 = -1;
                }
                ArrayList var234 = new ArrayList();
                var234.add(var228);
                var234.add(var233);
                method3330(var234, var232, var231, var229, var230);
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3401 == arg0.field1451) {
                int var235 = var3.method8855();
                int var236 = var3.method9044();
                class361 var237 = Statics.field2667.method5964(var235);
                if (var237.field3852 != var236 || var236 == -1) {
                    var237.field3852 = var236;
                    var237.field3919 = 0;
                    var237.field3899 = 0;
                    method7116(var237);
                }
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3439 == arg0.field1451) {
                field538 = true;
                field766 = false;
                field761 = true;
                int var238 = var3.method8919();
                int var239 = var3.method8919();
                int var240 = method4335(Statics.field1500 + var239 & 0x7EB);
                int var241 = Statics.field2888 + var238;
                int var242 = var3.method8968();
                int var243 = var3.method9025();
                field616 = new class512(Statics.field1500, var240, var242, var243);
                field518 = new class512(Statics.field2888, var241, var242, var243);
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3503 == arg0.field1451) {
                int var244 = var3.method8803();
                String var245 = var3.method8808();
                class361 var246 = Statics.field2667.method5964(var244);
                if (!var245.equals(var246.field3867)) {
                    var246.field3867 = var245;
                    method7116(var246);
                }
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3505 == arg0.field1451) {
                int var247 = var3.method8803();
                int var248 = var3.method8814();
                int var249 = var248 >> 10 & 0x1F;
                int var250 = var248 >> 5 & 0x1F;
                int var251 = var248 & 0x1F;
                int var252 = (var251 << 3) + (var249 << 19) + (var250 << 11);
                class361 var253 = Statics.field2667.method5964(var247);
                if (var253.field3829 != var252) {
                    var253.field3829 = var252;
                    method7116(var253);
                }
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3467 == arg0.field1451) {
                int var254 = var3.method8803();
                class361 var255 = Statics.field2667.method5964(var254);
                for (int var256 = 0; var256 < var255.field3937.length; var256++) {
                    var255.field3937[var256] = -1;
                    var255.field3937[var256] = 0;
                }
                method7116(var255);
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3499 == arg0.field1451) {
                int var257 = var3.method9046();
                int var258 = var3.method8899();
                class361 var259 = Statics.field2667.method5964(var258);
                if (var259.field3848 != 6 || var259.field3849 != var257) {
                    var259.field3848 = 6;
                    var259.field3849 = var257;
                    method7116(var259);
                }
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3389 == arg0.field1451) {
                int var260 = var3.method8990();
                int var261 = var3.method8814();
                int var262 = var3.method8990();
                int var263 = var3.method8814();
                class333.method5557(var260, var263, var261, var262);
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3384 == arg0.field1451) {
                int var264 = var3.method8803();
                int var265 = var3.method9046();
                int var266 = var3.method8814();
                class361 var267 = Statics.field2667.method5964(var264);
                var267.field3855 = (var266 << 16) + var265;
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3457 == arg0.field1451) {
                int var268 = var3.method9025();
                int var269 = var3.method9046();
                if (var269 == 65535) {
                    var269 = -1;
                }
                method2176(Statics.field2672, var269, var268);
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3507 == arg0.field1451) {
                int var270 = var3.method8980();
                int var271 = var3.method8990();
                int var272 = var3.method8968();
                int var273 = var3.method8990();
                class361 var274 = Statics.field2667.method5964(var270);
                if (var274.field3856 != var273 || var274.field3857 != var271 || var274.field3859 != var272) {
                    var274.field3856 = var273;
                    var274.field3857 = var271;
                    var274.field3859 = var272;
                    method7116(var274);
                }
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3421 == arg0.field1451) {
                Statics.field5059 = var3.method8839();
                Statics.field1799 = var3.method8958();
                field583 = var3.method8880();
                for (int var275 = Statics.field1799; var275 < Statics.field1799 + 8; var275++) {
                    for (int var276 = Statics.field5059; var276 < Statics.field5059 + 8; var276++) {
                        if (Statics.field3543.field1324[field583][var275][var276] != null) {
                            Statics.field3543.field1324[field583][var275][var276] = null;
                            method4707(field583, var275, var276);
                        }
                    }
                }
                for (class97 var277 = (class97) Statics.field3543.field1325.method6907(); var277 != null; var277 = (class97) Statics.field3543.field1325.method6896()) {
                    if (var277.field1179 >= Statics.field1799 && var277.field1179 < Statics.field1799 + 8 && var277.field1168 >= Statics.field5059 && var277.field1168 < Statics.field5059 + 8 && field583 == var277.field1174) {
                        var277.field1178 = 0;
                    }
                }
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3428 == arg0.field1451) {
                method3162();
                byte var278 = var3.method8798();
                class152 var279 = new class152(var3);
                class160 var280;
                if (var278 >= 0) {
                    var280 = field741[var278];
                } else {
                    var280 = Statics.field3968;
                }
                if (var280 == null) {
                    this.method1326(var278);
                    arg0.field1451 = null;
                    return true;
                }
                if (var279.field1688 > var280.field1735) {
                    this.method1326(var278);
                    arg0.field1451 = null;
                    return true;
                }
                if (var279.field1688 < var280.field1735) {
                    arg0.field1451 = null;
                    return true;
                }
                var279.method3192(var280);
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3416 == arg0.field1451) {
                boolean var281 = var3.method8810();
                if (!var281) {
                    Statics.field1623 = null;
                } else if (Statics.field1623 == null) {
                    Statics.field1623 = new class400();
                }
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3432 == arg0.field1451) {
                Statics.field3543.field1322.method2735(var3, arg0.field1452);
                method4347();
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3409 == arg0.field1451) {
                field750 = var3.method9025();
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3419 == arg0.field1451) {
                int var282 = var3.method9025();
                if (var3.method9025() == 0) {
                    field789[var282] = new class398();
                    var3.field5378 += 18;
                } else {
                    var3.field5378--;
                    field789[var282] = new class398(var3, false);
                }
                field752 = field691;
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3492 == arg0.field1451) {
                field538 = true;
                field766 = false;
                field760 = false;
                Statics.field1794 = var3.method9025();
                Statics.field3546 = var3.method9025();
                Statics.field2087 = var3.method8968();
                Statics.field501 = var3.method9025();
                Statics.field828 = var3.method9025();
                if (Statics.field828 >= 100) {
                    Statics.field4736 = class379.method6569(Statics.field1794);
                    Statics.field3140 = class379.method6569(Statics.field3546);
                    Statics.field65 = method3285(Statics.field4799, Statics.field4736, Statics.field3140, Statics.field4799.field1308) - Statics.field2087;
                }
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3408 == arg0.field1451) {
                method795(class323.field3365);
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3463 == arg0.field1451) {
                field538 = true;
                field766 = false;
                field761 = true;
                Statics.field1722 = var3.method9025();
                Statics.field2418 = var3.method9025();
                Statics.field4603 = var3.method8968();
                int var283 = var3.method8968();
                int var284 = var3.method9025();
                int var285 = class379.method6569(Statics.field1722);
                int var286 = class379.method6569(Statics.field2418);
                int var287 = method3285(Statics.field4799, var285, var286, Statics.field4799.field1308) - Statics.field4603;
                int var288 = var285 - Statics.field4736;
                int var289 = var287 - Statics.field65;
                int var290 = var286 - Statics.field3140;
                double var291 = Math.sqrt((double) (var288 * var288 + var290 * var290));
                int var293 = method4335((int) (Math.atan2((double) var289, var291) * 325.9490051269531D) & 0x7FF);
                int var294 = method6810((int) (Math.atan2((double) var288, (double) var290) * -325.9490051269531D) & 0x7FF);
                field616 = new class512(Statics.field1500, var293, var283, var284);
                field518 = new class512(Statics.field2888, var294, var283, var284);
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3402 == arg0.field1451) {
                int var295 = var3.method8880();
                int var296 = var3.method8855();
                short var297 = (short) var3.method8919();
                int var298 = var3.method9046();
                class104 var299 = Statics.field3543.field1318[var298];
                if (var299 != null) {
                    var299.method2642(var295, var296, var297);
                }
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3511 == arg0.field1451) {
                method795(class323.field3364);
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3399 == arg0.field1451) {
                int var300 = var3.method8958();
                int var301 = var300 >> 2;
                int var302 = var300 & 0x3;
                int var303 = field582[var301];
                int var304 = var3.method8844();
                int var305 = var304 >> 16;
                int var306 = var304 >> 8 & 0xFF;
                int var307 = (var304 >> 4 & 0x7) + var305;
                int var308 = (var304 & 0x7) + var306;
                int var309 = var3.method8814();
                if (0 <= var307 && var307 < 103 && 0 <= var308 && var308 < 103) {
                    method4246(var307, var308, var301, var302, var303, var309);
                }
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3429 == arg0.field1451) {
                method795(class323.field3370);
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3405 == arg0.field1451) {
                Statics.field1286 = var3.method9025();
                Statics.field133 = var3.method9025();
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3485 == arg0.field1451) {
                method2872();
                field674 = var3.method8919();
                field707 = field691;
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3435 == arg0.field1451) {
                String var310 = var3.method8808();
                Object[] var311 = new Object[var310.length() + 1];
                for (int var312 = var310.length() - 1; var312 >= 0; var312--) {
                    if (var310.charAt(var312) == 's') {
                        var311[var312 + 1] = var3.method8808();
                    } else {
                        var311[var312 + 1] = Integer.valueOf(var3.method8803());
                    }
                }
                var311[0] = Integer.valueOf(var3.method8803());
                class90 var313 = new class90();
                var313.field1072 = var311;
                class73.method7183(var313);
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3460 == arg0.field1451) {
                int var314 = var3.method8958();
                int var315 = var3.method9025();
                String var316 = var3.method8808();
                if (var314 >= 1 && var314 <= 8) {
                    if (var316.equalsIgnoreCase(class380.field4097)) {
                        var316 = null;
                    }
                    field641[var314 - 1] = var316;
                    field729[var314 - 1] = var315 == 0;
                }
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3410 == arg0.field1451) {
                int var317 = var3.method8803();
                int var318 = var3.method8803();
                int var319 = class35.method6565();
                class324 var320 = class324.method4244(class322.field3275, field569.field1458);
                var320.field3379.method8851(var317);
                var320.field3379.method8852(var318);
                var320.field3379.method8781(field167);
                var320.field3379.method8781(var319);
                field569.method2829(var320);
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3480 == arg0.field1451) {
                int var321 = var3.method8830();
                int var322 = var321 >> 16;
                int var323 = var321 >> 8 & 0xFF;
                int var324 = (var321 >> 4 & 0x7) + var322;
                int var325 = (var321 & 0x7) + var323;
                int var326 = var3.method8839();
                byte var327 = var3.method8941();
                int var328 = var3.method8958();
                int var329 = var3.method8839() * 4;
                int var330 = var3.method8990();
                int var331 = var3.method8847();
                byte var332 = var3.method8833();
                int var333 = var3.method8968();
                int var334 = var3.method9046();
                int var335 = var3.method8958() * 4;
                int var336 = var324 + var327;
                int var337 = var325 + var332;
                if (var324 >= 0 && var325 >= 0 && var324 < Statics.field3543.field1309 && var325 < Statics.field3543.field1310 && var336 >= 0 && var337 >= 0 && var336 < Statics.field3543.field1309 && var337 < Statics.field3543.field1310 && var330 != 65535) {
                    int var338 = class379.method6569(var324);
                    int var339 = class379.method6569(var325);
                    int var340 = class379.method6569(var336);
                    int var341 = class379.method6569(var337);
                    class79 var342 = new class79(var330, Statics.field3543.field1308, var338, var339, method3285(Statics.field3543, var338, var339, Statics.field3543.field1308) - var329, field519 + var333, field519 + var334, var328, var326, var331, var335);
                    var342.method2185(var340, var341, method3285(Statics.field3543, var340, var341, Statics.field3543.field1308) - var335, field519 + var333);
                    Statics.field3543.field1326.method6892(var342);
                }
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3396 == arg0.field1451) {
                return this.method1648(arg0);
            }
            if (class325.field3453 == arg0.field1451) {
                byte var343 = var3.method8798();
                int var344 = var3.method8968();
                class349.field3699[var344] = var343;
                if (class349.field3702[var344] != var343) {
                    class349.field3702[var344] = var343;
                }
                method1069(var344);
                field746[++field693 - 1 & 0x1F] = var344;
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3504 == arg0.field1451) {
                int var345 = var3.method8899();
                class361 var346 = Statics.field2667.method5964(var345);
                var346.field3848 = 3;
                var346.field3849 = Statics.field2672.field1111.method6005();
                method7116(var346);
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3510 == arg0.field1451) {
                method7634(Statics.field3543, var3);
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3434 == arg0.field1451) {
                method4374(var3.method8808());
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3427 == arg0.field1451) {
                Statics.field3011.field822.method7860(var3, arg0.field1452);
                method1042();
                field504 = field691;
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3483 == arg0.field1451) {
                int var347 = var3.method9025();
                int var348 = var3.method9025();
                int var349 = var3.method9025();
                int var350 = var3.method9025();
                field765[var347] = true;
                field509[var347] = var348;
                field769[var347] = var349;
                field770[var347] = var350;
                field771[var347] = 0;
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3398 == arg0.field1451) {
                method795(class323.field3368);
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3431 == arg0.field1451) {
                int var351 = var3.method8814();
                if (var351 == 65535) {
                    var351 = -1;
                }
                int var352 = var3.method8814();
                if (var352 == 65535) {
                    var352 = -1;
                }
                int var353 = var3.method8899();
                int var354 = var3.method8899();
                for (int var355 = var351; var355 <= var352; var355++) {
                    long var356 = ((long) var354 << 32) + (long) var355;
                    class506 var358 = field735.method8544(var356);
                    if (var358 != null) {
                        var358.method8218();
                    }
                    field735.method8551(new class505(var353), var356);
                }
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3383 == arg0.field1451) {
                method2179(true, arg0.field1450);
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3452 == arg0.field1451) {
                field538 = true;
                field766 = false;
                field760 = true;
                Statics.field1794 = var3.method9025();
                Statics.field3546 = var3.method9025();
                int var359 = var3.method8968();
                int var360 = var3.method8968();
                field515 = var3.method8810();
                int var361 = var3.method9025();
                int var362 = class379.method6569(Statics.field1794);
                int var363 = class379.method6569(Statics.field3546);
                boolean var364 = false;
                boolean var365 = false;
                int var366;
                int var367;
                if (field515) {
                    var366 = Statics.field65;
                    var367 = method3285(Statics.field4799, var362, var363, Statics.field4799.field1308) - var359;
                } else {
                    var366 = method3285(Statics.field4799, Statics.field4736, Statics.field3140, Statics.field4799.field1308) - Statics.field65;
                    var367 = var359;
                }
                field763 = new class511(Statics.field4736, Statics.field3140, var366, var362, var363, var367, var360, var361);
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3479 == arg0.field1451) {
                int var368 = var3.method8855();
                int var369 = var3.method8990();
                class361 var370 = Statics.field2667.method5964(var368);
                if (var370 != null && var370.field3828 == 0) {
                    if (var369 > var370.field3916 - var370.field3820) {
                        var369 = var370.field3916 - var370.field3820;
                    }
                    if (var369 < 0) {
                        var369 = 0;
                    }
                    if (var370.field3826 != var369) {
                        var370.field3826 = var369;
                        method7116(var370);
                    }
                }
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3454 == arg0.field1451) {
                class70 var371 = new class70();
                var371.field814 = var3.method8808();
                var371.field817 = var3.method8968();
                int var372 = var3.method8803();
                var371.field813 = var372;
                if (var371.method1798()) {
                    var371.field811 = "beta";
                    Statics.field4408 = true;
                } else {
                    Statics.field4408 = false;
                }
                method2936(45);
                var2.method8069();
                Object var373 = null;
                class78.method3042(var371);
                arg0.field1451 = null;
                return false;
            }
            if (class325.field3387 == arg0.field1451) {
                method795(class323.field3372);
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3496 == arg0.field1451) {
                Statics.field3980 = class569.method8719(var3.method9025());
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3482 == arg0.field1451) {
                Statics.field3011.method1855();
                field504 = field691;
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3420 == arg0.field1451) {
                int var374 = arg0.field1452 + var3.field5378;
                int var375 = var3.method8968();
                if (var375 == 65535) {
                    var375 = -1;
                }
                int var376 = var3.method8968();
                if (field667 != var375) {
                    field667 = var375;
                    this.method1184(false);
                    method8210(field667);
                    class73.method5469(field667);
                    for (int var377 = 0; var377 < 100; var377++) {
                        field717[var377] = true;
                    }
                }
                while (var376-- > 0) {
                    int var378 = var3.method8803();
                    int var379 = var3.method8968();
                    int var380 = var3.method9025();
                    class89 var381 = (class89) field762.method8544((long) var378);
                    if (var381 != null && var381.field1062 != var379) {
                        method1078(var381, true);
                        var381 = null;
                    }
                    if (var381 == null) {
                        var381 = Statics.method7130(var378, var379, var380);
                    }
                    var381.field1058 = true;
                }
                for (class89 var382 = (class89) field762.method8546(); var382 != null; var382 = (class89) field762.method8539()) {
                    if (var382.field1058) {
                        var382.field1058 = false;
                    } else {
                        method1078(var382, true);
                    }
                }
                field735 = new class522(512);
                while (var3.field5378 < var374) {
                    int var383 = var3.method8803();
                    int var384 = var3.method8968();
                    int var385 = var3.method8968();
                    int var386 = var3.method8803();
                    for (int var387 = var384; var387 <= var385; var387++) {
                        long var388 = ((long) var383 << 32) + (long) var387;
                        field735.method8551(new class505(var386), var388);
                    }
                }
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3386 == arg0.field1451) {
                int var390 = var3.method8968();
                int var391 = var3.method8803();
                int var392 = var3.method8839();
                int var393 = var3.method9046();
                class94 var394;
                if (field630 == var393) {
                    var394 = Statics.field2672;
                } else {
                    var394 = Statics.field3543.field1317[var393];
                }
                if (var394 != null) {
                    var394.method2425(var392, var390, var391 >> 16, var391 & 0xFFFF);
                }
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3478 == arg0.field1451) {
                method3841(Statics.field3543, true, var3);
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3449 == arg0.field1451) {
                int var395 = var3.method8980();
                int var396 = var3.method8980();
                class89 var397 = (class89) field762.method8544((long) var395);
                class89 var398 = (class89) field762.method8544((long) var396);
                if (var398 != null) {
                    method1078(var398, var397 == null || var397.field1062 != var398.field1062);
                }
                if (var397 != null) {
                    var397.method8218();
                    field762.method8551(var397, (long) var396);
                }
                class361 var399 = Statics.field2667.method5964(var395);
                if (var399 != null) {
                    method7116(var399);
                }
                class361 var400 = Statics.field2667.method5964(var396);
                if (var400 != null) {
                    method7116(var400);
                    method3298(Statics.field2667.field3709[var400.field3941 >>> 16], var400, true);
                }
                if (field667 != -1) {
                    method2468(field667, 1);
                }
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3440 == arg0.field1451) {
                byte var401 = var3.method8798();
                long var402 = (long) var3.method8968();
                long var404 = (long) var3.method8801();
                long var406 = (var402 << 32) + var404;
                boolean var408 = false;
                class169 var409 = var401 >= 0 ? field608[var401] : Statics.field312;
                if (var409 == null) {
                    var408 = true;
                } else {
                    for (int var410 = 0; var410 < 100; var410++) {
                        if (field759[var410] == var406) {
                            var408 = true;
                            break;
                        }
                    }
                }
                if (!var408) {
                    field759[field734] = var406;
                    field734 = (field734 + 1) % 100;
                    String var411 = class364.method8085(var3);
                    int var412 = var401 >= 0 ? 43 : 46;
                    class114.method8651(var412, "", var411, var409.field1803);
                }
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3446 == arg0.field1451) {
                if (field667 != -1) {
                    method2468(field667, 0);
                }
                arg0.field1451 = null;
                return true;
            }
            if (class325.field3403 == arg0.field1451) {
                int var413 = var3.method8855();
                int var414 = var3.method8968();
                class361 var415 = Statics.field2667.method5964(var413);
                if (var415.field3848 != 1 || var415.field3849 != var414) {
                    var415.field3848 = 1;
                    var415.field3849 = var414;
                    method7116(var415);
                }
                arg0.field1451 = null;
                return true;
            }
            class575.method2216("" + (arg0.field1451 == null ? -1 : arg0.field1451.field3458) + class105.field1348 + (arg0.field1449 == null ? -1 : arg0.field1449.field3458) + class105.field1348 + (arg0.field1445 == null ? -1 : arg0.field1445.field3458) + class105.field1348 + arg0.field1452, (Throwable) null);
            method3104();
        } catch (IOException var420) {
            method5053();
        } catch (Exception var421) {
            String var418 = "" + (arg0.field1451 == null ? -1 : arg0.field1451.field3458) + class105.field1348 + (arg0.field1449 == null ? -1 : arg0.field1449.field3458) + class105.field1348 + (arg0.field1445 == null ? -1 : arg0.field1445.field3458) + class105.field1348 + arg0.field1452 + class105.field1348 + (Statics.field4799.field1311 + Statics.field2672.field1251[0]) + class105.field1348 + (Statics.field4799.field1319 + Statics.field2672.field1181[0]) + class105.field1348;
            for (int var419 = 0; var419 < arg0.field1452 && var419 < 50; var419++) {
                var418 = var418 + var3.field5381[var419] + class105.field1348;
            }
            class575.method2216(var418, var421);
            method3104();
        }
        return true;
    }

    @ObfuscatedName("ba.kb(Lmy;B)V")
    public static final void method795(class323 arg0) {
        class548 var1 = field569.field1450;
        if (class323.field3369 == arg0) {
            byte var2 = var1.method8833();
            int var3 = var1.method8880();
            int var4 = (var3 >> 4 & 0x7) + Statics.field1799;
            int var5 = (var3 & 0x7) + Statics.field5059;
            int var6 = var1.method8814();
            int var7 = var1.method8880();
            int var8 = var7 >> 2;
            int var9 = var7 & 0x3;
            int var10 = field582[var8];
            int var11 = var1.method8968();
            byte var12 = var1.method8798();
            byte var13 = var1.method8941();
            byte var14 = var1.method8798();
            int var15 = var1.method8968();
            int var16 = var1.method9046();
            class94 var17;
            if (field630 == var15) {
                var17 = Statics.field2672;
            } else {
                var17 = Statics.field3543.field1317[var15];
            }
            if (var17 != null) {
                int var18 = field583 == -1 ? Statics.field3543.field1308 : field583;
                method7998(var18, var4, var5, var8, var9, var10, var6, var16, var11, var13, var12, var14, var2, var17);
            }
        }
        if (class323.field3364 == arg0) {
            int var19 = var1.method8880();
            int var20 = var1.method8968();
            int var21 = var1.method8958();
            int var22 = (var21 >> 4 & 0x7) + Statics.field1799;
            int var23 = (var21 & 0x7) + Statics.field5059;
            int var24 = Statics.field3543.field1308;
            if (var22 >= 0 && var23 >= 0 && var22 < Statics.field3543.field1309 && var23 < Statics.field3543.field1310) {
                class408 var25 = Statics.field3543.field1324[var24][var22][var23];
                if (var25 != null) {
                    for (class108 var26 = (class108) var25.method6907(); var26 != null; var26 = (class108) var25.method6896()) {
                        if ((var20 & 0x7FFF) == var26.field1384) {
                            var26.method2720(var19);
                            break;
                        }
                    }
                }
                if (var22 >= 0 && var23 >= 0 && var22 < Statics.field3543.field1309 && var23 < Statics.field3543.field1310) {
                    int var27 = field583 == -1 ? Statics.field3543.field1308 : field583;
                    method3172(var27, var22, var23, var20, var19);
                }
                return;
            }
        }
        if (class323.field3371 == arg0) {
            int var28 = var1.method9025();
            int var29 = (var28 >> 4 & 0x7) + Statics.field1799;
            int var30 = (var28 & 0x7) + Statics.field5059;
            int var31 = var1.method8880();
            int var32 = var31 >> 2;
            int var33 = var31 & 0x3;
            int var34 = field582[var32];
            if (var29 >= 0 && var30 >= 0 && var29 < Statics.field3543.field1309 && var30 < Statics.field3543.field1310) {
                int var35 = field583 == -1 ? Statics.field3543.field1308 : field583;
                method4211(Statics.field3543, var35, var29, var30, var34, -1, var32, var33, 31, 0, -1);
            }
        } else if (class323.field3363 == arg0) {
            int var36 = var1.method8990();
            boolean var37 = var1.method8958() == 1;
            int var38 = var1.method8980();
            int var39 = var1.method8880();
            int var40 = var1.method8814();
            int var41 = var1.method9046();
            int var42 = var1.method8880();
            int var43 = (var42 >> 4 & 0x7) + Statics.field1799;
            int var44 = (var42 & 0x7) + Statics.field5059;
            int var45 = var1.method8880();
            if (var43 >= 0 && var44 >= 0 && var43 < Statics.field3543.field1309 && var44 < Statics.field3543.field1310) {
                int var46 = field583 == -1 ? Statics.field3543.field1308 : field583;
                method5602(var46, var43, var44, var36, var38, var39, var40, var41, var45, var37);
            }
        } else if (class323.field3368 == arg0) {
            int var47 = var1.method8958();
            int var48 = var47 >> 2;
            int var49 = var47 & 0x3;
            int var50 = field582[var48];
            int var51 = var1.method9025();
            int var52 = (var51 >> 4 & 0x7) + Statics.field1799;
            int var53 = (var51 & 0x7) + Statics.field5059;
            int var54 = var1.method8958();
            int var55 = var1.method8814();
            if (var52 >= 0 && var53 >= 0 && var52 < Statics.field3543.field1309 && var53 < Statics.field3543.field1310) {
                int var56 = field583 == -1 ? Statics.field3543.field1308 : field583;
                method4211(Statics.field3543, var56, var52, var53, var50, var55, var48, var49, var54, 0, -1);
            }
        } else if (class323.field3372 == arg0) {
            int var57 = var1.method8839();
            int var58 = var57 >> 2;
            int var59 = var57 & 0x3;
            int var60 = field582[var58];
            int var61 = var1.method9025();
            int var62 = (var61 >> 4 & 0x7) + Statics.field1799;
            int var63 = (var61 & 0x7) + Statics.field5059;
            int var64 = var1.method8814();
            if (0 <= var62 && var62 < 103 && 0 <= var63 && var63 < 103) {
                int var65 = field583 == -1 ? Statics.field3543.field1308 : field583;
                class97 var66 = method3110(Statics.field3543, var65, var62, var63, var60);
                if (var66 != null) {
                    class261 var67 = class261.method4328(var66.field1172);
                    if (var67.field2744) {
                        var66.field1175 = var64;
                        return;
                    }
                }
                boolean var68 = method6578(var65, var62, var63, var58, var59, var60, var64);
                if (var68) {
                    return;
                }
                if (var66 != null) {
                    var66.field1175 = var64;
                }
            }
        } else if (class323.field3365 == arg0) {
            int var69 = var1.method8899();
            int var70 = var1.method9046();
            int var71 = var1.method8980();
            int var72 = var1.method8958();
            int var73 = (var72 >> 4 & 0x7) + Statics.field1799;
            int var74 = (var72 & 0x7) + Statics.field5059;
            if (var73 >= 0 && var74 >= 0 && var73 < Statics.field3543.field1309 && var74 < Statics.field3543.field1310) {
                int var75 = field583 == -1 ? Statics.field3543.field1308 : field583;
                method5498(var75, var73, var74, var70, var69, var71);
            }
        } else if (class323.field3367 == arg0) {
            int var76 = var1.method8880();
            int var77 = var1.method9025();
            int var78 = var1.method9025();
            int var79 = (var78 >> 4 & 0x7) + Statics.field1799;
            int var80 = (var78 & 0x7) + Statics.field5059;
            int var81 = var1.method9046();
            int var82 = var1.method9025() & 0x1F;
            int var83 = var1.method8958();
            if (var79 >= 0 && var80 >= 0 && var79 < Statics.field3543.field1309 && var80 < Statics.field3543.field1310) {
                int var84 = var82 + 1;
                if (Statics.field2672.field1251[0] >= var79 - var84 && Statics.field2672.field1251[0] <= var79 + var84 && Statics.field2672.field1181[0] >= var80 - var84 && Statics.field2672.field1181[0] <= var80 + var84 && Statics.field1385.method2601() != 0 && var77 > 0 && field666 < 50) {
                    field753[field666] = var81;
                    field758[field666] = null;
                    field756[field666] = (var79 << 16) + (var80 << 8) + var82;
                    field754[field666] = var77;
                    field755[field666] = var76;
                    field757[field666] = var83;
                    field666++;
                }
            }
        } else if (class323.field3366 == arg0) {
            int var85 = var1.method8968();
            int var86 = var1.method8899();
            int var87 = var1.method8839();
            int var88 = (var87 >> 4 & 0x7) + Statics.field1799;
            int var89 = (var87 & 0x7) + Statics.field5059;
            int var90 = Statics.field3543.field1308;
            if (0 <= var88 && var88 < 104 && 0 <= var89 && var89 < 104) {
                int var91 = field583 == -1 ? var90 : field583;
                method6877(var91, var88, var89, var85, var86);
            }
        } else if (class323.field3362 == arg0) {
            int var92 = var1.method8880();
            int var93 = (var92 >> 4 & 0x7) + Statics.field1799;
            int var94 = (var92 & 0x7) + Statics.field5059;
            int var95 = var1.method8958();
            int var96 = var1.method8968();
            int var97 = var1.method8968();
            if (var93 >= 0 && var94 >= 0 && var93 < Statics.field3543.field1309 && var94 < Statics.field3543.field1310) {
                int var98 = class379.method6569(var93);
                int var99 = class379.method6569(var94);
                int var100 = field583 == -1 ? Statics.field3543.field1308 : field583;
                class74 var101 = new class74(var96, var100, var98, var99, method3285(Statics.field3543, var98, var99, var100) - var95, var97, field519);
                Statics.field3543.field1327.method6892(var101);
            }
        } else if (class323.field3370 == arg0) {
            int var102 = var1.method9025();
            int var103 = var1.method8814();
            int var104 = var1.method9031();
            int var105 = var1.method8958();
            int var106 = (var105 >> 4 & 0x7) + Statics.field1799;
            int var107 = (var105 & 0x7) + Statics.field5059;
            int var108 = var1.method8839() * 4;
            int var109 = var1.method8880() * 4;
            int var110 = var1.method8968();
            int var111 = var1.method8990();
            int var112 = var1.method8848();
            byte var113 = var1.method8798();
            byte var114 = var1.method8833();
            int var115 = var1.method8990();
            int var116 = var106 + var113;
            int var117 = var107 + var114;
            if (var106 >= 0 && var107 >= 0 && var106 < Statics.field3543.field1309 && var107 < Statics.field3543.field1310 && var116 >= 0 && var117 >= 0 && var116 < Statics.field3543.field1309 && var117 < Statics.field3543.field1310 && var115 != 65535) {
                int var118 = field583 == -1 ? Statics.field3543.field1308 : field583;
                method3210(var118, var106, var107, var116, var117, var104, var115, var109, var108, var111, var103, var102, var110, var112);
            }
        }
    }

    @ObfuscatedName("fr.kl(IIIIII)V")
    public static void method3172(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class408 var5 = Statics.field3543.field1324[arg0][arg1][arg2];
        if (var5 == null) {
            return;
        }
        for (class108 var6 = (class108) var5.method6907(); var6 != null; var6 = (class108) var5.method6896()) {
            if ((arg3 & 0x7FFF) == var6.field1384) {
                var6.method2720(arg4);
                break;
            }
        }
    }

    @ObfuscatedName("ll.kp(IIIIIIB)V")
    public static void method5498(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class408 var6 = Statics.field3543.field1324[arg0][arg1][arg2];
        if (var6 == null) {
            return;
        }
        for (class108 var7 = (class108) var6.method6907(); var7 != null; var7 = (class108) var6.method6896()) {
            if ((arg3 & 0x7FFF) == var7.field1384 && var7.field1381 == arg4) {
                var7.field1381 = arg5;
                break;
            }
        }
        method4707(arg0, arg1, arg2);
    }

    @ObfuscatedName("so.ko(IIIIIIIIIIIIILdw;I)V")
    public static void method7998(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class94 arg13) {
        class261 var14 = class261.method4328(arg6);
        int var15;
        int var16;
        if (arg4 == 1 || arg4 == 3) {
            var15 = var14.field2759;
            var16 = var14.field2746;
        } else {
            var15 = var14.field2746;
            var16 = var14.field2759;
        }
        int var17 = (var15 >> 1) + arg1;
        int var18 = (var15 + 1 >> 1) + arg1;
        int var19 = (var16 >> 1) + arg2;
        int var20 = (var16 + 1 >> 1) + arg2;
        int[][] var21 = Statics.field3543.field1314[arg0];
        int var22 = var21[var17][var19] + var21[var18][var19] + var21[var17][var20] + var21[var18][var20] >> 2;
        int var23 = (arg1 << 7) + (var15 << 6);
        int var24 = (arg2 << 7) + (var16 << 6);
        class197 var25 = var14.method4745(arg3, arg4, var21, var23, var22, var24);
        if (var25 == null) {
            return;
        }
        method4211(Statics.field3543, arg0, arg1, arg2, arg5, -1, 0, 0, 31, arg7 + 1, arg8 + 1);
        arg13.field1119 = field519 + arg7;
        arg13.field1141 = field519 + arg8;
        arg13.field1124 = var25;
        arg13.field1110 = arg1 * 128 + var15 * 64;
        arg13.field1118 = arg2 * 128 + var16 * 64;
        arg13.field1122 = var22;
        if (arg9 > arg11) {
            int var26 = arg9;
            arg9 = arg11;
            arg11 = var26;
        }
        if (arg10 > arg12) {
            int var27 = arg10;
            arg10 = arg12;
            arg12 = var27;
        }
        arg13.field1125 = arg1 + arg9;
        arg13.field1132 = arg1 + arg11;
        arg13.field1126 = arg2 + arg10;
        arg13.field1128 = arg2 + arg12;
    }

    @ObfuscatedName("fw.ky(IIIIIIIIIIIIIIB)V")
    public static void method3210(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        int var14 = arg1 * 128 + 64;
        int var15 = arg2 * 128 + 64;
        int var16 = arg3 * 128 + 64;
        int var17 = arg4 * 128 + 64;
        class79 var18 = new class79(arg6, arg0, var14, var15, method3285(Statics.field3543, var14, var15, arg0) - arg7, field519 + arg9, field519 + arg10, arg11, arg12, arg13, arg5, arg8);
        var18.method2185(var16, var17, method3285(Statics.field3543, var16, var17, arg0) - arg8, field519 + arg9);
        Statics.field3543.field1326.method6892(var18);
    }

    @ObfuscatedName("pg.ke(IIIIII)V")
    public static void method6877(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class408 var5 = Statics.field3543.field1324[arg0][arg1][arg2];
        if (var5 == null) {
            return;
        }
        for (class108 var6 = (class108) var5.method6907(); var6 != null; var6 = (class108) var5.method6896()) {
            if ((arg3 & 0x7FFF) == var6.field1384 && var6.field1381 == arg4) {
                var6.method8218();
                break;
            }
        }
        if (var5.method6907() == null) {
            Statics.field3543.field1324[arg0][arg1][arg2] = null;
        }
        method4707(arg0, arg1, arg2);
    }

    @ObfuscatedName("mi.kq(IIIIIIIIIZI)V")
    public static void method5602(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        class108 var10 = new class108();
        var10.field1384 = arg3;
        var10.field1381 = arg4;
        var10.method2720(arg5);
        var10.field1376 = field520 + arg6;
        var10.field1379 = field520 + arg7;
        var10.field1378 = arg8;
        var10.field1377 = arg9;
        if (Statics.field3543.field1324[arg0][arg1][arg2] == null) {
            Statics.field3543.field1324[arg0][arg1][arg2] = new class408();
        }
        Statics.field3543.field1324[arg0][arg1][arg2].method6892(var10);
        method4707(arg0, arg1, arg2);
    }

    @ObfuscatedName("ix.ks(IIIIIII)Z")
    public static boolean method4246(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return method6578(Statics.field3543.field1308, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("oo.kn(IIIIIIII)Z")
    public static boolean method6578(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class186 var7 = Statics.field3543.field1328;
        if (class382.field4412.field4413 == arg5) {
            class205 var8 = var7.method3620(arg0, arg1, arg2);
            if (var8 != null) {
                int var9 = class198.method8270(var8.field2286);
                if (class370.field4001.field3999 == arg3) {
                    var8.field2279 = new class82(Statics.field3543, var9, 2, arg4 + 4, arg0, arg1, arg2, arg6, false, var8.field2279);
                    var8.field2285 = new class82(Statics.field3543, var9, 2, arg4 + 1 & 0x3, arg0, arg1, arg2, arg6, false, var8.field2285);
                } else {
                    var8.field2279 = new class82(Statics.field3543, var9, arg3, arg4, arg0, arg1, arg2, arg6, false, var8.field2279);
                }
                return true;
            }
        } else if (class382.field4410.field4413 == arg5) {
            class207 var10 = var7.method3705(arg0, arg1, arg2);
            if (var10 != null) {
                int var11 = class198.method8270(var10.field2298);
                if (class370.field3997.field3999 == arg3 || class370.field3998.field3999 == arg3) {
                    var10.field2296 = new class82(Statics.field3543, var11, 4, arg4, arg0, arg1, arg2, arg6, false, var10.field2296);
                } else if (class370.field4007.field3999 == arg3) {
                    var10.field2296 = new class82(Statics.field3543, var11, 4, arg4 + 4, arg0, arg1, arg2, arg6, false, var10.field2296);
                } else if (class370.field3993.field3999 == arg3) {
                    var10.field2296 = new class82(Statics.field3543, var11, 4, (arg4 + 2 & 0x3) + 4, arg0, arg1, arg2, arg6, false, var10.field2296);
                } else if (class370.field4003.field3999 == arg3) {
                    var10.field2296 = new class82(Statics.field3543, var11, 4, arg4 + 4, arg0, arg1, arg2, arg6, false, var10.field2296);
                    var10.field2295 = new class82(Statics.field3543, var11, 4, (arg4 + 2 & 0x3) + 4, arg0, arg1, arg2, arg6, false, var10.field2295);
                }
                return true;
            }
        } else if (class382.field4411.field4413 == arg5) {
            class208 var12 = var7.method3622(arg0, arg1, arg2);
            if (class370.field4013.field3999 == arg3) {
                arg3 = class370.field4012.field3999;
            }
            if (var12 != null) {
                var12.field2305 = new class82(Statics.field3543, class198.method8270(var12.field2301), arg3, arg4, arg0, arg1, arg2, arg6, false, var12.field2305);
                return true;
            }
        } else if (class382.field4409.field4413 == arg5) {
            class177 var13 = var7.method3623(arg0, arg1, arg2);
            if (var13 != null) {
                var13.field1884 = new class82(Statics.field3543, class198.method8270(var13.field1882), 22, arg4, arg0, arg1, arg2, arg6, false, var13.field1884);
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("ig.kc(Ldy;IIIIIIIIIIB)V")
    public static void method4211(class102 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        class408 var11 = arg0.field1325;
        class97 var12 = null;
        for (class97 var13 = (class97) var11.method6907(); var13 != null; var13 = (class97) var11.method6896()) {
            if (var13.field1174 == arg1 && var13.field1179 == arg2 && var13.field1168 == arg3 && var13.field1166 == arg4) {
                var12 = var13;
                break;
            }
        }
        if (var12 == null) {
            var12 = new class97();
            var12.field1174 = arg1;
            var12.field1166 = arg4;
            var12.field1179 = arg2;
            var12.field1168 = arg3;
            var12.field1175 = -1;
            Statics.method4392(arg0, var12);
            var11.method6892(var12);
        }
        var12.field1172 = arg5;
        var12.field1177 = arg6;
        var12.field1173 = arg7;
        var12.field1167 = arg9;
        var12.field1178 = arg10;
        var12.method2420(arg8);
    }

    @ObfuscatedName("fs.kj(Ldy;IIIII)Ldg;")
    public static final class97 method3110(class102 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class97 var5 = (class97) arg0.field1325.method6907(); var5 != null; var5 = (class97) arg0.field1325.method6896()) {
            if (var5.field1174 == arg1 && var5.field1179 == arg2 && var5.field1168 == arg3 && var5.field1166 == arg4) {
                return var5;
            }
        }
        return null;
    }

    @ObfuscatedName("gy.kw(I)V")
    public static final void method3342() {
        for (class97 var0 = (class97) Statics.field4799.field1325.method6907(); var0 != null; var0 = (class97) Statics.field4799.field1325.method6896()) {
            if (var0.field1178 == -1) {
                var0.field1167 = 0;
                Statics.method4392(Statics.field4799, var0);
            } else {
                var0.method8218();
            }
        }
    }

    @ObfuscatedName("cl.kv(Ldy;B)V")
    public static final void method1041(class102 arg0) {
        for (class97 var1 = (class97) arg0.field1325.method6907(); var1 != null; var1 = (class97) arg0.field1325.method6896()) {
            if (var1.field1178 > 0) {
                var1.field1178--;
            }
            if (var1.field1178 == 0) {
                if (var1.field1169 >= 0) {
                    int var2 = var1.field1169;
                    int var3 = var1.field1171;
                    class261 var4 = class261.method4328(var2);
                    if (var3 == 11) {
                        var3 = 10;
                    }
                    if (var3 >= 5 && var3 <= 8) {
                        var3 = 4;
                    }
                    boolean var5 = var4.method4714(var3);
                    if (!var5) {
                        continue;
                    }
                }
                method3151(arg0, var1.field1174, var1.field1166, var1.field1179, var1.field1168, var1.field1169, var1.field1170, var1.field1171, var1.field1175);
                var1.method8218();
            } else {
                if (var1.field1167 > 0) {
                    var1.field1167--;
                }
                if (var1.field1167 == 0 && var1.field1179 >= 1 && var1.field1168 >= 1 && var1.field1179 <= 102 && var1.field1168 <= 102) {
                    if (var1.field1172 >= 0) {
                        int var6 = var1.field1172;
                        int var7 = var1.field1177;
                        class261 var8 = class261.method4328(var6);
                        if (var7 == 11) {
                            var7 = 10;
                        }
                        if (var7 >= 5 && var7 <= 8) {
                            var7 = 4;
                        }
                        boolean var9 = var8.method4714(var7);
                        if (!var9) {
                            continue;
                        }
                    }
                    method3151(arg0, var1.field1174, var1.field1166, var1.field1179, var1.field1168, var1.field1172, var1.field1173, var1.field1177, var1.field1175);
                    var1.field1167 = -1;
                    if (var1.field1172 == var1.field1169 && var1.field1169 == -1) {
                        var1.method8218();
                    } else if (var1.field1172 == var1.field1169 && var1.field1173 == var1.field1170 && var1.field1177 == var1.field1171) {
                        var1.method8218();
                    }
                }
            }
        }
    }

    @ObfuscatedName("fq.kz(Ldy;IIIIIIIII)V")
    public static final void method3151(class102 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class186 var9 = arg0.field1328;
        if (arg3 < 1 || arg4 < 1 || arg3 > arg0.field1309 - 1 || arg4 > arg0.field1310 - 1) {
            return;
        }
        if (field548 && arg0.field1308 != arg1) {
            return;
        }
        long var10 = 0L;
        boolean var12 = true;
        boolean var13 = false;
        boolean var14 = false;
        if (arg2 == 0) {
            var10 = var9.method3819(arg1, arg3, arg4);
        }
        if (arg2 == 1) {
            var10 = var9.method3625(arg1, arg3, arg4);
        }
        if (arg2 == 2) {
            var10 = var9.method3626(arg1, arg3, arg4);
        }
        if (arg2 == 3) {
            var10 = var9.method3744(arg1, arg3, arg4);
        }
        if (var10 != 0L) {
            int var15 = var9.method3628(arg1, arg3, arg4, var10);
            int var16 = class198.method8270(var10);
            int var17 = var15 & 0x1F;
            int var18 = var15 >> 6 & 0x3;
            class261 var19 = class261.method4328(var16);
            Statics.method6554(arg1, arg3, arg4, var19, var18);
            if (arg2 == 0) {
                var9.method3615(arg1, arg3, arg4);
                if (var19.field2748 != 0) {
                    arg0.field1305[arg1].method4965(arg3, arg4, var17, var18, var19.field2749);
                }
            }
            if (arg2 == 1) {
                var9.method3668(arg1, arg3, arg4);
            }
            if (arg2 == 2) {
                var9.method3611(arg1, arg3, arg4);
                if (var19.field2746 + arg3 > arg0.field1309 - 1 || var19.field2746 + arg4 > arg0.field1310 - 1 || var19.field2759 + arg3 > arg0.field1309 - 1 || var19.field2759 + arg4 > arg0.field1310 - 1) {
                    return;
                }
                if (var19.field2748 != 0) {
                    arg0.field1305[arg1].method4966(arg3, arg4, var19.field2746, var19.field2759, var18, var19.field2749);
                }
            }
            if (arg2 == 3) {
                var9.method3772(arg1, arg3, arg4);
                if (var19.field2748 == 1) {
                    arg0.field1305[arg1].method4968(arg3, arg4);
                }
            }
        }
        if (arg5 < 0) {
            return;
        }
        int var20 = arg1;
        if (arg1 < 3 && (arg0.field1315[1][arg3][arg4] & 0x2) == 2) {
            var20 = arg1 + 1;
        }
        class269 var21 = arg0.field1305[arg1];
        class261 var22 = class261.method4328(arg5);
        int var23 = arg8 >= 0 ? arg8 : var22.field2754;
        int var24;
        int var25;
        if (arg6 == 1 || arg6 == 3) {
            var24 = var22.field2759;
            var25 = var22.field2746;
        } else {
            var24 = var22.field2746;
            var25 = var22.field2759;
        }
        int var26;
        int var27;
        if (arg3 + var24 <= arg0.field1309) {
            var26 = (var24 >> 1) + arg3;
            var27 = (var24 + 1 >> 1) + arg3;
        } else {
            var26 = arg3;
            var27 = arg3 + 1;
        }
        int var28;
        int var29;
        if (arg4 + var25 <= arg0.field1310) {
            var28 = (var25 >> 1) + arg4;
            var29 = (var25 + 1 >> 1) + arg4;
        } else {
            var28 = arg4;
            var29 = arg4 + 1;
        }
        int[][] var30 = arg0.field1314[var20];
        int var31 = var30[var26][var28] + var30[var27][var28] + var30[var26][var29] + var30[var27][var29] >> 2;
        int var32 = (arg3 << 7) + (var24 << 6);
        int var33 = (arg4 << 7) + (var25 << 6);
        class186 var34 = arg0.field1328;
        long var35 = class198.method4242(arg3, arg4, 2, var22.field2750 == 0, arg5, arg0.field1312);
        int var37 = (arg6 << 6) + arg7;
        if (var22.field2771 == 1) {
            var37 += 256;
        }
        if (arg7 == 22) {
            class189 var38;
            if (var23 == -1 && var22.field2783 == null) {
                var38 = var22.method4745(22, arg6, var30, var32, var31, var33);
            } else {
                var38 = new class82(arg0, arg5, 22, arg6, var20, arg3, arg4, var23, var22.field2781, (class189) null);
            }
            var34.method3604(arg1, arg3, arg4, var31, var38, var35, var37);
            if (var22.field2748 == 1 && var21 != null) {
                var21.method4973(arg3, arg4);
            }
        } else if (arg7 == 10 || arg7 == 11) {
            class189 var64;
            if (var23 == -1 && var22.field2783 == null) {
                var64 = var22.method4745(10, arg6, var30, var32, var31, var33);
            } else {
                var64 = new class82(arg0, arg5, 10, arg6, var20, arg3, arg4, var23, var22.field2781, (class189) null);
            }
            if (var64 != null) {
                var34.method3629(arg1, arg3, arg4, var31, var24, var25, var64, arg7 == 11 ? 256 : 0, var35, var37);
            }
            if (var22.field2748 != 0 && var21 != null) {
                var21.method4961(arg3, arg4, var24, var25, var22.field2749);
            }
        } else if (arg7 >= 12) {
            class189 var39;
            if (var23 == -1 && var22.field2783 == null) {
                var39 = var22.method4745(arg7, arg6, var30, var32, var31, var33);
            } else {
                var39 = new class82(arg0, arg5, arg7, arg6, var20, arg3, arg4, var23, var22.field2781, (class189) null);
            }
            var34.method3629(arg1, arg3, arg4, var31, 1, 1, var39, 0, var35, var37);
            if (var22.field2748 != 0 && var21 != null) {
                var21.method4961(arg3, arg4, var24, var25, var22.field2749);
            }
        } else if (arg7 == 0) {
            class189 var40;
            if (var23 == -1 && var22.field2783 == null) {
                var40 = var22.method4745(0, arg6, var30, var32, var31, var33);
            } else {
                var40 = new class82(arg0, arg5, 0, arg6, var20, arg3, arg4, var23, var22.field2781, (class189) null);
            }
            var34.method3606(arg1, arg3, arg4, var31, var40, (class189) null, class84.field1016[arg6], 0, var35, var37);
            if (var22.field2748 != 0 && var21 != null) {
                var21.method4960(arg3, arg4, arg7, arg6, var22.field2749);
            }
        } else if (arg7 == 1) {
            class189 var41;
            if (var23 == -1 && var22.field2783 == null) {
                var41 = var22.method4745(1, arg6, var30, var32, var31, var33);
            } else {
                var41 = new class82(arg0, arg5, 1, arg6, var20, arg3, arg4, var23, var22.field2781, (class189) null);
            }
            var34.method3606(arg1, arg3, arg4, var31, var41, (class189) null, class84.field1024[arg6], 0, var35, var37);
            if (var22.field2748 != 0 && var21 != null) {
                var21.method4960(arg3, arg4, arg7, arg6, var22.field2749);
            }
        } else if (arg7 == 2) {
            int var42 = arg6 + 1 & 0x3;
            class189 var43;
            class189 var44;
            if (var23 == -1 && var22.field2783 == null) {
                var43 = var22.method4745(2, arg6 + 4, var30, var32, var31, var33);
                var44 = var22.method4745(2, var42, var30, var32, var31, var33);
            } else {
                var43 = new class82(arg0, arg5, 2, arg6 + 4, var20, arg3, arg4, var23, var22.field2781, (class189) null);
                var44 = new class82(arg0, arg5, 2, var42, var20, arg3, arg4, var23, var22.field2781, (class189) null);
            }
            var34.method3606(arg1, arg3, arg4, var31, var43, var44, class84.field1016[arg6], class84.field1016[var42], var35, var37);
            if (var22.field2748 != 0 && var21 != null) {
                var21.method4960(arg3, arg4, arg7, arg6, var22.field2749);
            }
        } else if (arg7 == 3) {
            class189 var45;
            if (var23 == -1 && var22.field2783 == null) {
                var45 = var22.method4745(3, arg6, var30, var32, var31, var33);
            } else {
                var45 = new class82(arg0, arg5, 3, arg6, var20, arg3, arg4, var23, var22.field2781, (class189) null);
            }
            var34.method3606(arg1, arg3, arg4, var31, var45, (class189) null, class84.field1024[arg6], 0, var35, var37);
            if (var22.field2748 != 0 && var21 != null) {
                var21.method4960(arg3, arg4, arg7, arg6, var22.field2749);
            }
        } else if (arg7 == 9) {
            class189 var46;
            if (var23 == -1 && var22.field2783 == null) {
                var46 = var22.method4745(arg7, arg6, var30, var32, var31, var33);
            } else {
                var46 = new class82(arg0, arg5, arg7, arg6, var20, arg3, arg4, var23, var22.field2781, (class189) null);
            }
            var34.method3629(arg1, arg3, arg4, var31, 1, 1, var46, 0, var35, var37);
            if (var22.field2748 != 0 && var21 != null) {
                var21.method4961(arg3, arg4, var24, var25, var22.field2749);
            }
        } else if (arg7 == 4) {
            class189 var47;
            if (var23 == -1 && var22.field2783 == null) {
                var47 = var22.method4745(4, arg6, var30, var32, var31, var33);
            } else {
                var47 = new class82(arg0, arg5, 4, arg6, var20, arg3, arg4, var23, var22.field2781, (class189) null);
            }
            var34.method3607(arg1, arg3, arg4, var31, var47, (class189) null, class84.field1016[arg6], 0, 0, 0, var35, var37);
        } else if (arg7 == 5) {
            int var48 = 16;
            long var49 = var34.method3819(arg1, arg3, arg4);
            if (var49 != 0L) {
                var48 = class261.method4328(class198.method8270(var49)).field2755;
            }
            class189 var51;
            if (var23 == -1 && var22.field2783 == null) {
                var51 = var22.method4745(4, arg6, var30, var32, var31, var33);
            } else {
                var51 = new class82(arg0, arg5, 4, arg6, var20, arg3, arg4, var23, var22.field2781, (class189) null);
            }
            var34.method3607(arg1, arg3, arg4, var31, var51, (class189) null, class84.field1016[arg6], 0, class84.field1018[arg6] * var48, class84.field1026[arg6] * var48, var35, var37);
        } else if (arg7 == 6) {
            int var52 = 8;
            long var53 = var34.method3819(arg1, arg3, arg4);
            if (var53 != 0L) {
                var52 = class261.method4328(class198.method8270(var53)).field2755 / 2;
            }
            class189 var55;
            if (var23 == -1 && var22.field2783 == null) {
                var55 = var22.method4745(4, arg6 + 4, var30, var32, var31, var33);
            } else {
                var55 = new class82(arg0, arg5, 4, arg6 + 4, var20, arg3, arg4, var23, var22.field2781, (class189) null);
            }
            var34.method3607(arg1, arg3, arg4, var31, var55, (class189) null, 256, arg6, class84.field1027[arg6] * var52, class84.field1023[arg6] * var52, var35, var37);
        } else if (arg7 == 7) {
            int var56 = arg6 + 2 & 0x3;
            class189 var57;
            if (var23 == -1 && var22.field2783 == null) {
                var57 = var22.method4745(4, var56 + 4, var30, var32, var31, var33);
            } else {
                var57 = new class82(arg0, arg5, 4, var56 + 4, var20, arg3, arg4, var23, var22.field2781, (class189) null);
            }
            var34.method3607(arg1, arg3, arg4, var31, var57, (class189) null, 256, var56, 0, 0, var35, var37);
        } else if (arg7 == 8) {
            int var58 = 8;
            long var59 = var34.method3819(arg1, arg3, arg4);
            if (var59 != 0L) {
                var58 = class261.method4328(class198.method8270(var59)).field2755 / 2;
            }
            int var61 = arg6 + 2 & 0x3;
            class189 var62;
            class189 var63;
            if (var23 == -1 && var22.field2783 == null) {
                var62 = var22.method4745(4, arg6 + 4, var30, var32, var31, var33);
                var63 = var22.method4745(4, var61 + 4, var30, var32, var31, var33);
            } else {
                var62 = new class82(arg0, arg5, 4, arg6 + 4, var20, arg3, arg4, var23, var22.field2781, (class189) null);
                var63 = new class82(arg0, arg5, 4, var61 + 4, var20, arg3, arg4, var23, var22.field2781, (class189) null);
            }
            var34.method3607(arg1, arg3, arg4, var31, var62, var63, 256, arg6, class84.field1027[arg6] * var58, class84.field1023[arg6] * var58, var35, var37);
        }
        class261 var65 = class261.method4328(arg5);
        if (var65 != null && var65.method4734()) {
            class72.method4349(var20, arg3, arg4, var65, arg6);
        }
    }

    @ObfuscatedName("fl.lu(Ldy;IIB)V")
    public static final void method3186(class102 arg0, int arg1, int arg2) {
        method5421(arg0, arg0.field1308, arg1, arg2);
    }

    @ObfuscatedName("jc.ln(IIII)V")
    public static final void method4707(int arg0, int arg1, int arg2) {
        method5421(Statics.field3543, arg0, arg1, arg2);
    }

    @ObfuscatedName("lb.lj(Ldy;IIII)V")
    public static final void method5421(class102 arg0, int arg1, int arg2, int arg3) {
        class408 var4 = arg0.field1324[arg1][arg2][arg3];
        if (var4 == null) {
            arg0.field1328.method3619(arg1, arg2, arg3);
            return;
        }
        long var5 = -99999999L;
        class108 var7 = null;
        for (class108 var8 = (class108) var4.method6907(); var8 != null; var8 = (class108) var4.method6896()) {
            class262 var9 = class262.method2385(var8.field1384);
            long var10 = (long) var9.field2810;
            if (var9.field2847 == 1) {
                var10 *= var8.field1381 < Integer.MAX_VALUE ? (long) (var8.field1381 + 1) : (long) var8.field1381;
            }
            if (var10 > var5) {
                var5 = var10;
                var7 = var8;
            }
        }
        if (var7 == null) {
            arg0.field1328.method3619(arg1, arg2, arg3);
            return;
        }
        var4.method6893(var7);
        class108 var12 = null;
        class108 var13 = null;
        for (class108 var14 = (class108) var4.method6907(); var14 != null; var14 = (class108) var4.method6896()) {
            if (var7.field1384 != var14.field1384) {
                if (var12 == null) {
                    var12 = var14;
                }
                if (var12.field1384 != var14.field1384 && var13 == null) {
                    var13 = var14;
                }
            }
        }
        long var15 = class198.method4242(arg2, arg3, 3, false, 0, arg0.field1312);
        arg0.field1328.method3651(arg1, arg2, arg3, method3285(arg0, class379.method6569(arg2), class379.method6569(arg3), arg1), var7, var15, var12, var13);
    }

    @ObfuscatedName("de.lr(Ldy;Lvs;I)V")
    public static void method2280(class102 arg0, class548 arg1) {
        int var2 = arg1.method9025();
        if (var2 < arg0.field1307) {
            throw new RuntimeException("dang");
        } else if (var2 > arg0.field1307) {
            throw new RuntimeException("dang!");
        } else {
            arg0.field1307 = 0;
            label55: for (int var3 = 0; var3 < var2; var3++) {
                int var4 = arg0.field1323[var3];
                class478 var5 = arg0.field1321[var4];
                boolean var6 = arg1.method9025() == 1;
                if (var6) {
                    arg0.field1323[++arg0.field1307 - 1] = var4;
                    byte var7 = arg1.method8798();
                    byte var8 = arg1.method8798();
                    var5.field4945 = arg1.method8968();
                    byte var9 = (byte) arg1.method9025();
                    class275[] var10 = class275.field2993;
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        class275 var12 = var10[var11];
                        if (var12.field2991 == var9) {
                            class271 var15 = class272.method4631(var5.field4945, var5.field4951);
                            int var16 = Math.min(var15.method4999(), 128);
                            var5.field4946 = var16 / field728;
                            var5.field4956 = var16 % field728;
                            if (var7 != 0 || var8 != 0) {
                                var5.method8049(var5.field4952[0] + var7, var5.field4955[0] + var8, var12);
                            }
                            continue label55;
                        }
                    }
                    throw new RuntimeException("Could not find MoveSpeed with ID " + var9);
                } else {
                    arg0.field1321[var4] = null;
                }
            }
            while (arg1.method8768(field569.field1452) >= 10) {
                int var17 = arg1.method8968();
                arg0.field1323[++arg0.field1307 - 1] = var17;
                int var18 = arg1.method9025();
                int var19 = arg1.method9025();
                int var20 = var18 * 8;
                int var21 = var19 * 8;
                class478 var22 = new class478(var17, var20, var21, Statics.field1385.method2604(), class174.field1824);
                arg0.field1321[var17] = var22;
                int var23 = arg1.method9025();
                int var24 = arg1.method9025();
                var22.method8055(var23, var24);
                var22.field4951 = arg1.method8968();
                arg1.method8968();
            }
        }
    }

    @ObfuscatedName("qx.lv(Ldy;Lvs;I)V")
    public static void method7634(class102 arg0, class548 arg1) {
        int var2 = arg1.method8968();
        class478 var3 = arg0.field1321[var2];
        class102 var4 = var3.field4947;
        var4.field1311 = arg1.method8968();
        var4.field1319 = arg1.method8968();
        var4.field1322.method2734(arg1, false);
        int var5 = var4.field1309 / 8;
        int var6 = var4.field1310 / 8;
        int var7 = arg1.method8968();
        arg1.method8748();
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < var5; var9++) {
                for (int var10 = 0; var10 < var6; var10++) {
                    int var11 = arg1.method8746(1);
                    if (var11 == 1) {
                        field768[var8][var9][var10] = arg1.method8746(26);
                    } else {
                        field768[var8][var9][var10] = -1;
                    }
                }
            }
        }
        arg1.method8747();
        Statics.field1616 = new int[var7][4];
        for (int var12 = 0; var12 < var7; var12++) {
            for (int var13 = 0; var13 < 4; var13++) {
                Statics.field1616[var12][var13] = arg1.method8803();
            }
        }
        Statics.field3969 = new int[var7];
        Statics.field3962 = new int[var7];
        Statics.field3033 = new int[var7];
        Statics.field54 = new byte[var7][];
        Statics.field996 = new byte[var7][];
        int var14 = 0;
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < var5; var16++) {
                for (int var17 = 0; var17 < var6; var17++) {
                    int var18 = field768[var15][var16][var17];
                    if (var18 != -1) {
                        int var19 = var18 >> 14 & 0x3FF;
                        int var20 = var18 >> 3 & 0x7FF;
                        int var21 = (var19 / 8 << 8) + var20 / 8;
                        for (int var22 = 0; var22 < var14; var22++) {
                            if (Statics.field3969[var22] == var21) {
                                var21 = -1;
                                break;
                            }
                        }
                        if (var21 != -1) {
                            Statics.field3969[var14] = var21;
                            int var23 = var21 >> 8 & 0xFF;
                            int var24 = var21 & 0xFF;
                            Statics.field3962[var14] = Statics.field1298.method6654("m" + var23 + "_" + var24);
                            Statics.field3033[var14] = Statics.field1298.method6654("l" + var23 + "_" + var24);
                            var14++;
                        }
                    }
                }
            }
        }
        method2936(25);
        field514 = true;
        Statics.field37 = var4;
        method8493(var4);
    }

    @ObfuscatedName("ho.lb(Ldy;ZLvs;I)V")
    public static final void method3841(class102 arg0, boolean arg1, class548 arg2) {
        field638 = 0;
        field714 = 0;
        method3150(arg0, arg2);
        method1080(arg0, arg1, arg2);
        for (int var3 = 0; var3 < field714; var3++) {
            int var4 = field568[var3];
            class104 var5 = arg0.field1318[var4];
            int var6 = arg2.method9025();
            if ((var6 & 0x40) != 0) {
                int var7 = arg2.method9025();
                var6 += var7 << 8;
            }
            if ((var6 & 0x8000) != 0) {
                int var8 = arg2.method9025();
                var6 += var8 << 16;
            }
            if ((var6 & 0x4) != 0) {
                var5.field1215 = arg2.method9046();
                var5.field1215 += arg2.method9025() << 16;
                int var9 = 16777215;
                if (var5.field1215 == var9) {
                    var5.field1215 = -1;
                }
            }
            if ((var6 & 0x100) != 0) {
                var5.field1214 = arg2.method8980();
            }
            if ((var6 & 0x10000) != 0) {
                int var10 = arg2.method8803();
                var5.field1187 = (var10 & 0x1) == 0 ? var5.field1340.field2589 : arg2.method8968();
                var5.field1203 = (var10 & 0x2) == 0 ? var5.field1340.field2606 : arg2.method8990();
                var5.field1239 = (var10 & 0x4) == 0 ? var5.field1340.field2611 : arg2.method8968();
                var5.field1190 = (var10 & 0x8) == 0 ? var5.field1340.field2578 : arg2.method8968();
                var5.field1191 = (var10 & 0x10) == 0 ? var5.field1340.field2579 : arg2.method8814();
                var5.field1192 = (var10 & 0x20) == 0 ? var5.field1340.field2566 : arg2.method8814();
                var5.field1194 = (var10 & 0x40) == 0 ? var5.field1340.field2581 : arg2.method8968();
                var5.field1252 = (var10 & 0x80) == 0 ? var5.field1340.field2580 : arg2.method8990();
                var5.field1195 = (var10 & 0x100) == 0 ? var5.field1340.field2583 : arg2.method9046();
                var5.field1196 = (var10 & 0x200) == 0 ? var5.field1340.field2597 : arg2.method8814();
                var5.field1197 = (var10 & 0x400) == 0 ? var5.field1340.field2585 : arg2.method8814();
                var5.field1198 = (var10 & 0x800) == 0 ? var5.field1340.field2586 : arg2.method9046();
                var5.field1189 = (var10 & 0x1000) == 0 ? var5.field1340.field2587 : arg2.method8814();
                var5.field1200 = (var10 & 0x2000) == 0 ? var5.field1340.field2588 : arg2.method8990();
                var5.field1186 = (var10 & 0x4000) == 0 ? var5.field1340.field2602 : arg2.method8990();
            }
            if ((var6 & 0x200) != 0) {
                var5.field1245 = field519 + arg2.method8968();
                var5.field1242 = field519 + arg2.method9046();
                var5.field1243 = arg2.method8941();
                var5.field1244 = arg2.method8833();
                var5.field1241 = arg2.method8798();
                var5.field1221 = (byte) arg2.method8880();
            }
            if ((var6 & 0x20000) != 0) {
                int var11 = arg2.method8958();
                int[] var12 = new int[8];
                short[] var13 = new short[8];
                for (int var14 = 0; var14 < 8; var14++) {
                    if ((var11 & 0x1 << var14) == 0) {
                        var12[var14] = -1;
                        var13[var14] = -1;
                    } else {
                        var12[var14] = arg2.method8863();
                        var13[var14] = (short) arg2.method8840();
                    }
                }
                var5.method2647(var12, var13);
            }
            if ((var6 & 0x4000) != 0) {
                int var15 = arg2.method8958();
                if ((var15 & 0x1) == 1) {
                    var5.method2652();
                } else {
                    int[] var16 = null;
                    if ((var15 & 0x2) == 2) {
                        int var17 = arg2.method8958();
                        var16 = new int[var17];
                        for (int var18 = 0; var18 < var17; var18++) {
                            int var19 = arg2.method8814();
                            int var20 = var19 == 65535 ? -1 : var19;
                            var16[var18] = var20;
                        }
                    }
                    short[] var21 = null;
                    if ((var15 & 0x4) == 4) {
                        int var22 = 0;
                        if (var5.field1340.field2590 != null) {
                            var22 = var5.field1340.field2590.length;
                        }
                        var21 = new short[var22];
                        for (int var23 = 0; var23 < var22; var23++) {
                            var21[var23] = (short) arg2.method8990();
                        }
                    }
                    short[] var24 = null;
                    if ((var15 & 0x8) == 8) {
                        int var25 = 0;
                        if (var5.field1340.field2592 != null) {
                            var25 = var5.field1340.field2592.length;
                        }
                        var24 = new short[var25];
                        for (int var26 = 0; var26 < var25; var26++) {
                            var24[var26] = (short) arg2.method9046();
                        }
                    }
                    boolean var27 = false;
                    if ((var15 & 0x10) != 0) {
                        var27 = arg2.method8958() == 1;
                    }
                    long var28 = (long) (++class104.field1342 - 1);
                    var5.method2655(new class245(var28, var16, var21, var24, var27));
                }
            }
            if ((var6 & 0x40000) != 0) {
                int var30 = arg2.method8839();
                for (int var31 = 0; var31 < var30; var31++) {
                    int var32 = arg2.method8958();
                    int var33 = arg2.method9046();
                    int var34 = arg2.method8899();
                    var5.method2425(var32, var33, var34 >> 16, var34 & 0xFFFF);
                }
            }
            if ((var6 & 0x2000) != 0) {
                var5.method2638(arg2.method8808());
            }
            if ((var6 & 0x1) != 0) {
                int var35 = arg2.method8814();
                int var36 = arg2.method8990();
                var5.field1220 = arg2.method8880() == 1;
                var5.field1201 = var35;
                var5.field1219 = var36;
            }
            if ((var6 & 0x8) != 0) {
                int var37 = arg2.method8958();
                if (var37 > 0) {
                    for (int var38 = 0; var38 < var37; var38++) {
                        int var39 = -1;
                        int var40 = -1;
                        int var41 = -1;
                        int var42 = arg2.method8813();
                        if (var42 == 32767) {
                            var42 = arg2.method8813();
                            var40 = arg2.method8813();
                            var39 = arg2.method8813();
                            var41 = arg2.method8813();
                        } else if (var42 == 32766) {
                            var42 = -1;
                        } else {
                            var40 = arg2.method8813();
                        }
                        int var43 = arg2.method8813();
                        var5.method2422(var42, var40, var39, var41, field519, var43);
                    }
                }
                int var44 = arg2.method8958();
                if (var44 > 0) {
                    for (int var45 = 0; var45 < var44; var45++) {
                        int var46 = arg2.method8813();
                        int var47 = arg2.method8813();
                        if (var47 == 32767) {
                            var5.method2424(var46);
                        } else {
                            int var48 = arg2.method8813();
                            int var49 = arg2.method8958();
                            int var50 = var47 > 0 ? arg2.method8880() : var49;
                            var5.method2463(var46, field519, var47, var48, var49, var50);
                        }
                    }
                }
            }
            if ((var6 & 0x800) != 0) {
                var5.field1232 = arg2.method8833();
                var5.field1234 = arg2.method8879();
                var5.field1233 = arg2.method8879();
                var5.field1235 = arg2.method8879();
                var5.field1236 = arg2.method8990() + field519;
                var5.field1237 = arg2.method8814() + field519;
                var5.field1238 = arg2.method8814();
                var5.field1217 = 1;
                var5.field1256 = 0;
                var5.field1232 += var5.field1251[0];
                var5.field1234 += var5.field1181[0];
                var5.field1233 += var5.field1251[0];
                var5.field1235 += var5.field1181[0];
            }
            if ((var6 & 0x1000) != 0) {
                int var51 = arg2.method8839();
                if ((var51 & 0x1) == 1) {
                    var5.method2665();
                } else {
                    int[] var52 = null;
                    if ((var51 & 0x2) == 2) {
                        int var53 = arg2.method8958();
                        var52 = new int[var53];
                        for (int var54 = 0; var54 < var53; var54++) {
                            int var55 = arg2.method8814();
                            int var56 = var55 == 65535 ? -1 : var55;
                            var52[var54] = var56;
                        }
                    }
                    short[] var57 = null;
                    if ((var51 & 0x4) == 4) {
                        int var58 = 0;
                        if (var5.field1340.field2590 != null) {
                            var58 = var5.field1340.field2590.length;
                        }
                        var57 = new short[var58];
                        for (int var59 = 0; var59 < var58; var59++) {
                            var57[var59] = (short) arg2.method8968();
                        }
                    }
                    short[] var60 = null;
                    if ((var51 & 0x8) == 8) {
                        int var61 = 0;
                        if (var5.field1340.field2592 != null) {
                            var61 = var5.field1340.field2592.length;
                        }
                        var60 = new short[var61];
                        for (int var62 = 0; var62 < var61; var62++) {
                            var60[var62] = (short) arg2.method8968();
                        }
                    }
                    boolean var63 = false;
                    if ((var51 & 0x10) != 0) {
                        var63 = arg2.method8958() == 1;
                    }
                    long var64 = (long) (++class104.field1344 - 1);
                    var5.method2649(new class245(var64, var52, var57, var60, var63));
                }
            }
            if ((var6 & 0x2) != 0) {
                var5.field1340 = class246.method2916(arg2.method8968());
                method4376(var5);
                var5.method2648();
            }
            if ((var6 & 0x10) != 0) {
                int var66 = arg2.method8968();
                if (var66 == 65535) {
                    var66 = -1;
                }
                int var67 = arg2.method8839();
                if (var5.field1257 == var66 && var66 != -1) {
                    int var68 = class264.method3551(var66).field2887;
                    if (var68 == 1) {
                        var5.field1226 = 0;
                        var5.field1212 = 0;
                        var5.field1228 = var67;
                        var5.field1229 = 0;
                    }
                    if (var68 == 2) {
                        var5.field1229 = 0;
                    }
                } else if (var66 == -1 || var5.field1257 == -1 || class264.method3551(var66).field2868 >= class264.method3551(var5.field1257).field2868) {
                    var5.field1257 = var66;
                    var5.field1226 = 0;
                    var5.field1212 = 0;
                    var5.field1228 = var67;
                    var5.field1229 = 0;
                    var5.field1256 = var5.field1217;
                }
            }
            if ((var6 & 0x20) != 0) {
                arg2.method8990();
                arg2.method8803();
            }
            if ((var6 & 0x400) != 0) {
                var5.method2639(arg2.method8839());
            }
            if ((var6 & 0x80) != 0) {
                var5.field1211 = arg2.method8808();
                var5.field1204 = 100;
            }
        }
        for (int var69 = 0; var69 < field638; var69++) {
            int var70 = field585[var69];
            if (field519 != arg0.field1318[var70].field1218) {
                arg0.field1318[var70].field1340 = null;
                arg0.field1318[var70] = null;
            }
        }
        if (field569.field1452 != arg2.field5378) {
            throw new RuntimeException(arg2.field5378 + class105.field1348 + field569.field1452);
        }
        for (int var71 = 0; var71 < arg0.field1316; var71++) {
            if (arg0.field1318[arg0.field1320[var71]] == null) {
                throw new RuntimeException(var71 + class105.field1348 + arg0.field1316);
            }
        }
    }

    @ObfuscatedName("fq.li(Ldy;Lvs;B)V")
    public static final void method3150(class102 arg0, class548 arg1) {
        arg1.method8748();
        int var2 = arg1.method8746(8);
        if (var2 < arg0.field1316) {
            for (int var3 = var2; var3 < arg0.field1316; var3++) {
                field585[++field638 - 1] = arg0.field1320[var3];
            }
        }
        if (var2 > arg0.field1316) {
            throw new RuntimeException("");
        }
        arg0.field1316 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            int var5 = arg0.field1320[var4];
            class104 var6 = arg0.field1318[var5];
            int var7 = arg1.method8746(1);
            if (var7 == 0) {
                arg0.field1320[++arg0.field1316 - 1] = var5;
                var6.field1218 = field519;
            } else {
                int var8 = arg1.method8746(2);
                if (var8 == 0) {
                    arg0.field1320[++arg0.field1316 - 1] = var5;
                    var6.field1218 = field519;
                    field568[++field714 - 1] = var5;
                } else if (var8 == 1) {
                    arg0.field1320[++arg0.field1316 - 1] = var5;
                    var6.field1218 = field519;
                    int var9 = arg1.method8746(3);
                    var6.method2661(var9, class275.field2984);
                    int var10 = arg1.method8746(1);
                    if (var10 == 1) {
                        field568[++field714 - 1] = var5;
                    }
                } else if (var8 == 2) {
                    arg0.field1320[++arg0.field1316 - 1] = var5;
                    var6.field1218 = field519;
                    if (arg1.method8746(1) == 1) {
                        int var11 = arg1.method8746(3);
                        var6.method2661(var11, class275.field2985);
                        int var12 = arg1.method8746(3);
                        var6.method2661(var12, class275.field2985);
                    } else {
                        int var13 = arg1.method8746(3);
                        var6.method2661(var13, class275.field2988);
                    }
                    int var14 = arg1.method8746(1);
                    if (var14 == 1) {
                        field568[++field714 - 1] = var5;
                    }
                } else if (var8 == 3) {
                    field585[++field638 - 1] = var5;
                }
            }
        }
    }

    @ObfuscatedName("cr.ld(Ldy;ZLvs;I)V")
    public static final void method1080(class102 arg0, boolean arg1, class548 arg2) {
        while (true) {
            byte var3 = 16;
            int var4 = 0x1 << var3;
            if (arg2.method8763(field569.field1452) >= var3 + 12) {
                int var5 = arg2.method8746(var3);
                if (var4 - 1 != var5) {
                    boolean var6 = false;
                    if (arg0.field1318[var5] == null) {
                        arg0.field1318[var5] = new class104();
                        var6 = true;
                    }
                    class104 var7 = arg0.field1318[var5];
                    arg0.field1320[++arg0.field1316 - 1] = var5;
                    var7.field1218 = field519;
                    int var8 = arg2.method8746(1);
                    boolean var9 = arg2.method8746(1) == 1;
                    if (var9) {
                        arg2.method8746(32);
                    }
                    int var10 = field507[arg2.method8746(3)];
                    if (var6) {
                        var7.field1247 = var7.field1182 = var10;
                    }
                    int var11;
                    if (arg1) {
                        var11 = arg2.method8746(8);
                        if (var11 > 127) {
                            var11 -= 256;
                        }
                    } else {
                        var11 = arg2.method8746(5);
                        if (var11 > 15) {
                            var11 -= 32;
                        }
                    }
                    int var12;
                    if (arg1) {
                        var12 = arg2.method8746(8);
                        if (var12 > 127) {
                            var12 -= 256;
                        }
                    } else {
                        var12 = arg2.method8746(5);
                        if (var12 > 15) {
                            var12 -= 32;
                        }
                    }
                    var7.field1340 = class246.method2916(arg2.method8746(14));
                    int var13 = arg2.method8746(1);
                    if (var13 == 1) {
                        field568[++field714 - 1] = var5;
                    }
                    method4376(var7);
                    if (var7.field1222 == 0) {
                        var7.field1182 = 0;
                    }
                    if (class547.field5372 >= 222) {
                        var7.method2643(Statics.field1286 + var11, Statics.field133 + var12, var8 == 1);
                        continue;
                    }
                    var7.method2643(Statics.field2672.field1251[0] + var11, Statics.field2672.field1181[0] + var12, var8 == 1);
                    continue;
                }
            }
            arg2.method8747();
            return;
        }
    }

    @ObfuscatedName("im.lw(Ldd;B)V")
    public static void method4376(class104 arg0) {
        arg0.field1184 = arg0.field1340.field2571;
        arg0.field1222 = arg0.field1340.field2574;
        arg0.field1239 = arg0.field1340.field2611;
        arg0.field1190 = arg0.field1340.field2578;
        arg0.field1191 = arg0.field1340.field2579;
        arg0.field1192 = arg0.field1340.field2566;
        arg0.field1186 = arg0.field1340.field2602;
        arg0.field1187 = arg0.field1340.field2589;
        arg0.field1203 = arg0.field1340.field2606;
        arg0.field1194 = arg0.field1340.field2581;
        arg0.field1252 = arg0.field1340.field2580;
        arg0.field1195 = arg0.field1340.field2583;
        arg0.field1196 = arg0.field1340.field2597;
        arg0.field1197 = arg0.field1340.field2585;
        arg0.field1198 = arg0.field1340.field2586;
        arg0.field1189 = arg0.field1340.field2587;
        arg0.field1200 = arg0.field1340.field2588;
    }

    @ObfuscatedName("sl.ly(Ldy;Ldw;IILko;I)V")
    public static final void method8062(class102 arg0, class94 arg1, int arg2, int arg3, class275 arg4) {
        int var5 = arg1.field1251[0];
        int var6 = arg1.field1181[0];
        int var7 = arg1.method2352();
        if (var5 < var7 || var5 >= 104 - var7 || var6 < var7 || var6 >= 104 - var7 || arg2 < var7 || arg2 >= 104 - var7 || arg3 < var7 || arg3 >= 104 - var7) {
            return;
        }
        int var8 = field797.method5056(var5, var6, arg1.method2352(), method2962(arg2, arg3), arg0.field1305[arg1.field1130], true, field802, field803);
        if (var8 >= 1) {
            for (int var9 = 0; var9 < var8 - 1; var9++) {
                arg1.method2411(field802[var9], field803[var9], arg4);
            }
        }
    }

    @ObfuscatedName("ef.lk(IIB)Lkl;")
    public static class273 method2962(int arg0, int arg1) {
        field742.field2968 = arg0;
        field742.field2967 = arg1;
        field742.field2971 = 1;
        field742.field2969 = 1;
        return field742;
    }

    @ObfuscatedName("sr.lt(I)V")
    public static void method8128() {
        field651.field5519 = 0;
        field694 = false;
        field651.field5528[0] = -1;
        field651.field5526[0] = class380.field4334;
        field651.field5523[0] = "";
        field651.field5522[0] = 1006;
        field651.field5529[0] = false;
        field651.field5527[0] = null;
        field651.field5519 = 1;
    }

    @ObfuscatedName("ej.lo(I)Z")
    public static final boolean method2911() {
        return field694;
    }

    @ObfuscatedName("client.lz(I)V")
    public final void method1794() {
        Statics.method4934(field651);
        if (field679 != null) {
            return;
        }
        int var1 = class36.field211;
        if (field694) {
            if (var1 != 1 && (Statics.field4709 || var1 != 4) && !field651.method9427(class36.field204, class36.field205)) {
                field694 = false;
                field651.method9430();
            }
            if (var1 == 1 || !Statics.field4709 && var1 == 4) {
                field651.method9428(class36.field216, class36.field213);
                field694 = false;
                field651.method9430();
            }
            return;
        }
        int var2 = method3177();
        if ((var1 == 1 || !Statics.field4709 && var1 == 4) && this.method1182()) {
            var1 = 2;
        }
        if ((var1 == 1 || !Statics.field4709 && var1 == 4) && field651.field5519 > 0) {
            field651.method9426(var2);
        }
        if (var1 == 2 && field651.field5519 > 0) {
            this.method1525(class36.field216, class36.field213);
        }
    }

    @ObfuscatedName("client.lq(I)Z")
    public final boolean method1182() {
        int var1 = method3177();
        return (field649 && field651.field5519 > 2 || method5095(var1)) && !field651.field5529[var1];
    }

    @ObfuscatedName("client.la(III)V")
    public final void method1525(int arg0, int arg1) {
        field651.method9423(arg0, arg1);
        int var3 = arg0 - field606;
        int var4 = arg1 - field781;
        Statics.field4799.field1328.method3796(Statics.field4799.field1308, var3, var4, false);
        for (int var5 = 0; var5 < Statics.field4799.field1307; var5++) {
            class478 var6 = Statics.field4799.field1321[Statics.field4799.field1323[var5]];
            if (var6 != null) {
                var6.field4947.field1328.method3796(var6.field4947.field1308, var3, var4, false);
            }
        }
        field694 = true;
        field651.method9429();
    }

    @ObfuscatedName("kc.lg(II)Z")
    public static final boolean method5095(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field651.field5522[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("rv.ls(Lcv;III)V")
    public static final void method7768(class76 arg0, int arg1, int arg2) {
        if (arg0 != null) {
            method6770(arg0.field895, arg0.field890, arg0.field891, arg0.field896, arg0.field893, arg0.field892, arg0.field894, arg0.field889, arg1, arg2);
        }
    }

    @ObfuscatedName("pb.ll(IIIIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method6770(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6, String arg7, int arg8, int arg9) {
        class102 var10 = null;
        if (arg5 >= 0 && Statics.field4799.field1321[arg5] != null) {
            var10 = Statics.field4799.field1321[arg5].field4947;
        } else if (arg5 == -1) {
            var10 = Statics.field4799;
        }
        if (var10 == null) {
            return;
        }
        int var11 = var10.field1311;
        int var12 = var10.field1319;
        class104[] var13 = var10.field1318;
        class94[] var14 = var10.field1317;
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 23) {
            if (field694) {
                Statics.field4799.field1328.method3818();
            } else {
                Statics.field4799.field1328.method3796(Statics.field4799.field1308, arg0, arg1, true);
            }
            for (int var15 = 0; var15 < Statics.field4799.field1307; var15++) {
                class478 var16 = Statics.field4799.field1321[Statics.field4799.field1323[var15]];
                if (var16 != null) {
                    if (field694) {
                        var16.field4947.field1328.method3818();
                    } else {
                        var16.field4947.field1328.method3796(var16.field4947.field1308, arg0, arg1, true);
                    }
                }
            }
        }
        if (arg2 == 12) {
            class104 var17 = var13[arg3];
            if (var17 != null) {
                field623 = arg8;
                field624 = arg9;
                field626 = 2;
                field511 = 0;
                field542 = arg0;
                field739 = arg1;
                class324 var18 = class324.method4244(class322.field3331, field569.field1458);
                var18.field3379.method8828(field748.method4940(82) ? 1 : 0);
                var18.field3379.method8961(arg3);
                field569.method2829(var18);
            }
        }
        if (arg2 == 44) {
            class94 var19 = var14[arg3];
            if (var19 != null) {
                field623 = arg8;
                field624 = arg9;
                field626 = 2;
                field511 = 0;
                field542 = arg0;
                field739 = arg1;
                class324 var20 = class324.method4244(class322.field3326, field569.field1458);
                var20.field3379.method8966(field748.method4940(82) ? 1 : 0);
                var20.field3379.method8838(arg3);
                field569.method2829(var20);
            }
        }
        if (arg2 == 13) {
            class104 var21 = var13[arg3];
            if (var21 != null) {
                field623 = arg8;
                field624 = arg9;
                field626 = 2;
                field511 = 0;
                field542 = arg0;
                field739 = arg1;
                class324 var22 = class324.method4244(class322.field3303, field569.field1458);
                var22.field3379.method8837(field748.method4940(82) ? 1 : 0);
                var22.field3379.method8782(arg3);
                field569.method2829(var22);
            }
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field2389.method8350(arg2, arg3, new class350(arg0), new class350(arg1));
        }
        if (arg2 == 28) {
            class324 var23 = class324.method4244(class322.field3330, field569.field1458);
            var23.field3379.method9045(arg1);
            field569.method2829(var23);
            class361 var24 = Statics.field2667.method5964(arg1);
            if (var24 != null && var24.field3931 != null && var24.field3931[0][0] == 5) {
                int var25 = var24.field3931[0][1];
                class349.field3702[var25] = 1 - class349.field3702[var25];
                method1069(var25);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class361 var26 = Statics.field2667.method5965(arg1, arg0);
            if (var26 != null) {
                method261(arg3, arg1, arg0, arg4, arg7);
            }
        }
        if (arg2 == 22) {
            field623 = arg8;
            field624 = arg9;
            field626 = 2;
            field511 = 0;
            field542 = arg0;
            field739 = arg1;
            class324 var27 = class324.method4244(class322.field3321, field569.field1458);
            var27.field3379.method8828(field748.method4940(82) ? 1 : 0);
            var27.field3379.method8782(arg0 + var11);
            var27.field3379.method8836(arg3);
            var27.field3379.method8961(arg1 + var12);
            field569.method2829(var27);
        }
        if (arg2 == 3) {
            field623 = arg8;
            field624 = arg9;
            field626 = 2;
            field511 = 0;
            field542 = arg0;
            field739 = arg1;
            class324 var28 = class324.method4244(class322.field3297, field569.field1458);
            var28.field3379.method8966(field748.method4940(82) ? 1 : 0);
            var28.field3379.method8961(arg1 + var12);
            var28.field3379.method8961(arg0 + var11);
            var28.field3379.method8782(arg3);
            field569.method2829(var28);
        }
        if (arg2 == 1002) {
            field623 = arg8;
            field624 = arg9;
            field626 = 2;
            field511 = 0;
            class324 var29 = class324.method4244(class322.field3311, field569.field1458);
            var29.field3379.method8961(arg3);
            field569.method2829(var29);
        }
        if (arg2 == 18) {
            field623 = arg8;
            field624 = arg9;
            field626 = 2;
            field511 = 0;
            field542 = arg0;
            field739 = arg1;
            class324 var30 = class324.method4244(class322.field3314, field569.field1458);
            var30.field3379.method8782(arg3);
            var30.field3379.method8782(arg1 + var12);
            var30.field3379.method8782(arg0 + var11);
            var30.field3379.method8828(field748.method4940(82) ? 1 : 0);
            field569.method2829(var30);
        }
        if (arg2 == 1004) {
            field623 = arg8;
            field624 = arg9;
            field626 = 2;
            field511 = 0;
            class324 var31 = class324.method4244(class322.field3310, field569.field1458);
            var31.field3379.method8782(arg1 + var12);
            var31.field3379.method8961(arg3);
            var31.field3379.method8836(arg0 + var11);
            field569.method2829(var31);
        }
        if (arg2 == 17) {
            field623 = arg8;
            field624 = arg9;
            field626 = 2;
            field511 = 0;
            field542 = arg0;
            field739 = arg1;
            class324 var32 = class324.method4244(class322.field3312, field569.field1458);
            var32.field3379.method8782(arg1 + var12);
            var32.field3379.method8836(field530);
            var32.field3379.method8838(field716);
            var32.field3379.method8838(arg3);
            var32.field3379.method8836(arg0 + var11);
            var32.field3379.method8911(Statics.field897);
            var32.field3379.method8781(field748.method4940(82) ? 1 : 0);
            field569.method2829(var32);
        }
        if (arg2 == 16) {
            field623 = arg8;
            field624 = arg9;
            field626 = 2;
            field511 = 0;
            field542 = arg0;
            field739 = arg1;
            class324 var33 = class324.method4244(class322.field3293, field569.field1458);
            var33.field3379.method8836(Statics.field4066);
            var33.field3379.method8966(field748.method4940(82) ? 1 : 0);
            var33.field3379.method8961(arg0 + var11);
            var33.field3379.method9045(Statics.field4800);
            var33.field3379.method8838(arg1 + var12);
            var33.field3379.method8961(arg3);
            var33.field3379.method8961(Statics.field1464);
            field569.method2829(var33);
        }
        if (arg2 == 26) {
            method1090();
        }
        if (arg2 == 1) {
            field623 = arg8;
            field624 = arg9;
            field626 = 2;
            field511 = 0;
            field542 = arg0;
            field739 = arg1;
            class324 var34 = class324.method4244(class322.field3298, field569.field1458);
            var34.field3379.method8838(arg3);
            var34.field3379.method8838(arg1 + var12);
            var34.field3379.method8828(field748.method4940(82) ? 1 : 0);
            var34.field3379.method8911(Statics.field4800);
            var34.field3379.method8838(arg0 + var11);
            var34.field3379.method8782(Statics.field4066);
            var34.field3379.method8836(Statics.field1464);
            field569.method2829(var34);
        }
        if (arg2 == 6) {
            field623 = arg8;
            field624 = arg9;
            field626 = 2;
            field511 = 0;
            field542 = arg0;
            field739 = arg1;
            class324 var35 = class324.method4244(class322.field3290, field569.field1458);
            var35.field3379.method8966(field748.method4940(82) ? 1 : 0);
            var35.field3379.method8836(arg3);
            var35.field3379.method8961(arg0 + var11);
            var35.field3379.method8836(arg1 + var12);
            field569.method2829(var35);
        }
        if (arg2 == 1003) {
            field623 = arg8;
            field624 = arg9;
            field626 = 2;
            field511 = 0;
            class104 var36 = var13[arg3];
            if (var36 != null) {
                class246 var37 = var36.field1340;
                if (var37.field2582 != null) {
                    var37 = var37.method4522();
                }
                if (var37 != null) {
                    class324 var38 = class324.method4244(class322.field3281, field569.field1458);
                    var38.field3379.method8838(var37.field2569);
                    field569.method2829(var38);
                }
            }
        }
        if (arg2 == 14) {
            class94 var39 = var14[arg3];
            if (var39 != null) {
                field623 = arg8;
                field624 = arg9;
                field626 = 2;
                field511 = 0;
                field542 = arg0;
                field739 = arg1;
                class324 var40 = class324.method4244(class322.field3261, field569.field1458);
                var40.field3379.method8838(Statics.field1464);
                var40.field3379.method8837(field748.method4940(82) ? 1 : 0);
                var40.field3379.method8911(Statics.field4800);
                var40.field3379.method8782(arg3);
                var40.field3379.method8838(Statics.field4066);
                field569.method2829(var40);
            }
        }
        if (arg2 == 20) {
            field623 = arg8;
            field624 = arg9;
            field626 = 2;
            field511 = 0;
            field542 = arg0;
            field739 = arg1;
            class324 var41 = class324.method4244(class322.field3300, field569.field1458);
            var41.field3379.method8961(arg3);
            var41.field3379.method8966(field748.method4940(82) ? 1 : 0);
            var41.field3379.method8836(arg1 + var12);
            var41.field3379.method8961(arg0 + var11);
            field569.method2829(var41);
        }
        if (arg2 == 47) {
            class94 var42 = var14[arg3];
            if (var42 != null) {
                field623 = arg8;
                field624 = arg9;
                field626 = 2;
                field511 = 0;
                field542 = arg0;
                field739 = arg1;
                class324 var43 = class324.method4244(class322.field3277, field569.field1458);
                var43.field3379.method8837(field748.method4940(82) ? 1 : 0);
                var43.field3379.method8782(arg3);
                field569.method2829(var43);
            }
        }
        if (arg2 == 25) {
            class361 var44 = Statics.field2667.method5965(arg1, arg0);
            if (var44 != null) {
                method3115();
                method3193(arg1, arg0, Statics.method4373(method5918(var44)), arg4);
                field659 = 0;
                field664 = method181(var44);
                if (field664 == null) {
                    field664 = class380.field4097;
                }
                if (var44.field3910) {
                    field665 = var44.field3884 + class105.method7315(16777215);
                } else {
                    field665 = class105.method7315(65280) + var44.field3935 + class105.method7315(16777215);
                }
            }
            return;
        }
        if (arg2 == 11) {
            class104 var45 = var13[arg3];
            if (var45 != null) {
                field623 = arg8;
                field624 = arg9;
                field626 = 2;
                field511 = 0;
                field542 = arg0;
                field739 = arg1;
                class324 var46 = class324.method4244(class322.field3342, field569.field1458);
                var46.field3379.method8836(arg3);
                var46.field3379.method8837(field748.method4940(82) ? 1 : 0);
                field569.method2829(var46);
            }
        }
        if (arg2 == 29) {
            class324 var47 = class324.method4244(class322.field3330, field569.field1458);
            var47.field3379.method9045(arg1);
            field569.method2829(var47);
            class361 var48 = Statics.field2667.method5964(arg1);
            if (var48 != null && var48.field3931 != null && var48.field3931[0][0] == 5) {
                int var49 = var48.field3931[0][1];
                if (class349.field3702[var49] != var48.field3933[0]) {
                    class349.field3702[var49] = var48.field3933[0];
                    method1069(var49);
                }
            }
        }
        if (arg2 == 45) {
            class94 var50 = var14[arg3];
            if (var50 != null) {
                field623 = arg8;
                field624 = arg9;
                field626 = 2;
                field511 = 0;
                field542 = arg0;
                field739 = arg1;
                class324 var51 = class324.method4244(class322.field3273, field569.field1458);
                var51.field3379.method8836(arg3);
                var51.field3379.method8781(field748.method4940(82) ? 1 : 0);
                field569.method2829(var51);
            }
        }
        if (arg2 == 49) {
            class94 var52 = var14[arg3];
            if (var52 != null) {
                field623 = arg8;
                field624 = arg9;
                field626 = 2;
                field511 = 0;
                field542 = arg0;
                field739 = arg1;
                class324 var53 = class324.method4244(class322.field3359, field569.field1458);
                var53.field3379.method8781(field748.method4940(82) ? 1 : 0);
                var53.field3379.method8836(arg3);
                field569.method2829(var53);
            }
        }
        if (arg2 == 7) {
            class104 var54 = var13[arg3];
            if (var54 != null) {
                field623 = arg8;
                field624 = arg9;
                field626 = 2;
                field511 = 0;
                field542 = arg0;
                field739 = arg1;
                class324 var55 = class324.method4244(class322.field3296, field569.field1458);
                var55.field3379.method8782(Statics.field1464);
                var55.field3379.method8837(field748.method4940(82) ? 1 : 0);
                var55.field3379.method8961(arg3);
                var55.field3379.method8911(Statics.field4800);
                var55.field3379.method8961(Statics.field4066);
                field569.method2829(var55);
            }
        }
        if (arg2 == 46) {
            class94 var56 = var14[arg3];
            if (var56 != null) {
                field623 = arg8;
                field624 = arg9;
                field626 = 2;
                field511 = 0;
                field542 = arg0;
                field739 = arg1;
                class324 var57 = class324.method4244(class322.field3260, field569.field1458);
                var57.field3379.method8838(arg3);
                var57.field3379.method8781(field748.method4940(82) ? 1 : 0);
                field569.method2829(var57);
            }
        }
        if (arg2 == 9) {
            class104 var58 = var13[arg3];
            if (var58 != null) {
                field623 = arg8;
                field624 = arg9;
                field626 = 2;
                field511 = 0;
                field542 = arg0;
                field739 = arg1;
                class324 var59 = class324.method4244(class322.field3283, field569.field1458);
                var59.field3379.method8781(field748.method4940(82) ? 1 : 0);
                var59.field3379.method8961(arg3);
                field569.method2829(var59);
            }
        }
        if (arg2 == 50) {
            class94 var60 = var14[arg3];
            if (var60 != null) {
                field623 = arg8;
                field624 = arg9;
                field626 = 2;
                field511 = 0;
                field542 = arg0;
                field739 = arg1;
                class324 var61 = class324.method4244(class322.field3294, field569.field1458);
                var61.field3379.method8781(field748.method4940(82) ? 1 : 0);
                var61.field3379.method8838(arg3);
                field569.method2829(var61);
            }
        }
        if (arg2 == 2) {
            field623 = arg8;
            field624 = arg9;
            field626 = 2;
            field511 = 0;
            field542 = arg0;
            field739 = arg1;
            class324 var62 = class324.method4244(class322.field3318, field569.field1458);
            var62.field3379.method8836(field716);
            var62.field3379.method8851(Statics.field897);
            var62.field3379.method8961(field530);
            var62.field3379.method8782(arg3);
            var62.field3379.method8781(field748.method4940(82) ? 1 : 0);
            var62.field3379.method8836(arg1 + var12);
            var62.field3379.method8961(arg0 + var11);
            field569.method2829(var62);
        }
        if (arg2 == 15) {
            class94 var63 = var14[arg3];
            if (var63 != null) {
                field623 = arg8;
                field624 = arg9;
                field626 = 2;
                field511 = 0;
                field542 = arg0;
                field739 = arg1;
                class324 var64 = class324.method4244(class322.field3353, field569.field1458);
                var64.field3379.method8838(arg3);
                var64.field3379.method8782(field716);
                var64.field3379.method8836(field530);
                var64.field3379.method9045(Statics.field897);
                var64.field3379.method8781(field748.method4940(82) ? 1 : 0);
                field569.method2829(var64);
            }
        }
        if (arg2 == 21) {
            field623 = arg8;
            field624 = arg9;
            field626 = 2;
            field511 = 0;
            field542 = arg0;
            field739 = arg1;
            class324 var65 = class324.method4244(class322.field3270, field569.field1458);
            var65.field3379.method8828(field748.method4940(82) ? 1 : 0);
            var65.field3379.method8836(arg3);
            var65.field3379.method8961(arg1 + var12);
            var65.field3379.method8782(arg0 + var11);
            field569.method2829(var65);
        }
        if (arg2 == 30 && field672 == null) {
            method2283(arg1, arg0);
            field672 = Statics.field2667.method5965(arg1, arg0);
            method7116(field672);
        }
        if (arg2 == 5) {
            field623 = arg8;
            field624 = arg9;
            field626 = 2;
            field511 = 0;
            field542 = arg0;
            field739 = arg1;
            class324 var66 = class324.method4244(class322.field3280, field569.field1458);
            var66.field3379.method8838(arg1 + var12);
            var66.field3379.method8961(arg3);
            var66.field3379.method8837(field748.method4940(82) ? 1 : 0);
            var66.field3379.method8961(arg0 + var11);
            field569.method2829(var66);
        }
        if (arg2 == 51) {
            class94 var67 = var14[arg3];
            if (var67 != null) {
                field623 = arg8;
                field624 = arg9;
                field626 = 2;
                field511 = 0;
                field542 = arg0;
                field739 = arg1;
                class324 var68 = class324.method4244(class322.field3265, field569.field1458);
                var68.field3379.method8837(field748.method4940(82) ? 1 : 0);
                var68.field3379.method8836(arg3);
                field569.method2829(var68);
            }
        }
        if (arg2 == 4) {
            field623 = arg8;
            field624 = arg9;
            field626 = 2;
            field511 = 0;
            field542 = arg0;
            field739 = arg1;
            class324 var69 = class324.method4244(class322.field3323, field569.field1458);
            var69.field3379.method8961(arg0 + var11);
            var69.field3379.method8782(arg1 + var12);
            var69.field3379.method8837(field748.method4940(82) ? 1 : 0);
            var69.field3379.method8836(arg3);
            field569.method2829(var69);
        }
        if (arg2 == 48) {
            class94 var70 = var14[arg3];
            if (var70 != null) {
                field623 = arg8;
                field624 = arg9;
                field626 = 2;
                field511 = 0;
                field542 = arg0;
                field739 = arg1;
                class324 var71 = class324.method4244(class322.field3276, field569.field1458);
                var71.field3379.method8838(arg3);
                var71.field3379.method8828(field748.method4940(82) ? 1 : 0);
                field569.method2829(var71);
            }
        }
        if (arg2 == 58) {
            class361 var72 = Statics.field2667.method5965(arg1, arg0);
            if (var72 != null) {
                if (var72.field3914 != null) {
                    class90 var73 = new class90();
                    var73.field1065 = var72;
                    var73.field1063 = arg3;
                    var73.field1073 = arg7;
                    var73.field1072 = var72.field3914;
                    class73.method7183(var73);
                }
                class324 var74 = class324.method4244(class322.field3319, field569.field1458);
                var74.field3379.method8838(field530);
                var74.field3379.method8782(field716);
                var74.field3379.method8836(arg0);
                var74.field3379.method8782(arg4);
                var74.field3379.method8852(arg1);
                var74.field3379.method8911(Statics.field897);
                field569.method2829(var74);
            }
        }
        if (arg2 == 24) {
            class361 var75 = Statics.field2667.method5964(arg1);
            if (var75 != null) {
                boolean var76 = true;
                if (var75.field3808 > 0) {
                    var76 = method4567(var75);
                }
                if (var76) {
                    class324 var77 = class324.method4244(class322.field3330, field569.field1458);
                    var77.field3379.method9045(arg1);
                    field569.method2829(var77);
                }
            }
        }
        if (arg2 == 8) {
            class104 var78 = var13[arg3];
            if (var78 != null) {
                field623 = arg8;
                field624 = arg9;
                field626 = 2;
                field511 = 0;
                field542 = arg0;
                field739 = arg1;
                class324 var79 = class324.method4244(class322.field3320, field569.field1458);
                var79.field3379.method8782(arg3);
                var79.field3379.method8838(field530);
                var79.field3379.method8837(field748.method4940(82) ? 1 : 0);
                var79.field3379.method8911(Statics.field897);
                var79.field3379.method8838(field716);
                field569.method2829(var79);
            }
        }
        if (arg2 == 19) {
            field623 = arg8;
            field624 = arg9;
            field626 = 2;
            field511 = 0;
            field542 = arg0;
            field739 = arg1;
            class324 var80 = class324.method4244(class322.field3354, field569.field1458);
            var80.field3379.method8838(arg3);
            var80.field3379.method8836(arg0 + var11);
            var80.field3379.method8782(arg1 + var12);
            var80.field3379.method8837(field748.method4940(82) ? 1 : 0);
            field569.method2829(var80);
        }
        if (arg2 == 1001) {
            field623 = arg8;
            field624 = arg9;
            field626 = 2;
            field511 = 0;
            field542 = arg0;
            field739 = arg1;
            class324 var81 = class324.method4244(class322.field3301, field569.field1458);
            var81.field3379.method8961(arg0 + var11);
            var81.field3379.method8961(arg1 + var12);
            var81.field3379.method8961(arg3);
            var81.field3379.method8828(field748.method4940(82) ? 1 : 0);
            field569.method2829(var81);
        }
        if (arg2 == 10) {
            class104 var82 = var13[arg3];
            if (var82 != null) {
                field623 = arg8;
                field624 = arg9;
                field626 = 2;
                field511 = 0;
                field542 = arg0;
                field739 = arg1;
                class324 var83 = class324.method4244(class322.field3333, field569.field1458);
                var83.field3379.method8961(arg3);
                var83.field3379.method8781(field748.method4940(82) ? 1 : 0);
                field569.method2829(var83);
            }
        }
        if (field659 != 0) {
            field659 = 0;
            method7116(Statics.field2667.method5964(Statics.field4800));
        }
        if (field661) {
            method3115();
        }
    }

    @ObfuscatedName("kn.lm(ILjava/lang/String;B)V")
    public static void method5091(int arg0, String arg1) {
        int var2 = Statics.field2672.field1140.field1322.field1399;
        int[] var3 = Statics.field2672.field1140.field1322.field1401;
        boolean var4 = false;
        class572 var5 = new class572(arg1, Statics.field848);
        for (int var6 = 0; var6 < var2; var6++) {
            class94 var7 = Statics.field2672.field1140.field1317[var3[var6]];
            if (var7 != null && Statics.field2672 != var7 && var7.field1138 != null && var7.field1138.equals(var5)) {
                if (arg0 == 1) {
                    class324 var8 = class324.method4244(class322.field3326, field569.field1458);
                    var8.field3379.method8966(0);
                    var8.field3379.method8838(var3[var6]);
                    field569.method2829(var8);
                } else if (arg0 == 4) {
                    class324 var9 = class324.method4244(class322.field3277, field569.field1458);
                    var9.field3379.method8837(0);
                    var9.field3379.method8782(var3[var6]);
                    field569.method2829(var9);
                } else if (arg0 == 6) {
                    class324 var10 = class324.method4244(class322.field3359, field569.field1458);
                    var10.field3379.method8781(0);
                    var10.field3379.method8836(var3[var6]);
                    field569.method2829(var10);
                } else if (arg0 == 7) {
                    class324 var11 = class324.method4244(class322.field3294, field569.field1458);
                    var11.field3379.method8781(0);
                    var11.field3379.method8838(var3[var6]);
                    field569.method2829(var11);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class114.method4997(4, "", class380.field4254 + arg1);
        }
    }

    @ObfuscatedName("fy.lf(IIIIB)V")
    public static void method3193(int arg0, int arg1, int arg2, int arg3) {
        class361 var4 = Statics.field2667.method5965(arg0, arg1);
        if (var4 != null && var4.field3911 != null) {
            class90 var5 = new class90();
            var5.field1065 = var4;
            var5.field1072 = var4.field3911;
            class73.method7183(var5);
        }
        field530 = arg3;
        field661 = true;
        Statics.field897 = arg0;
        field716 = arg1;
        Statics.field1488 = arg2;
        method7116(var4);
    }

    @ObfuscatedName("fx.lp(I)V")
    public static void method3115() {
        if (!field661) {
            return;
        }
        class361 var0 = Statics.field2667.method5965(Statics.field897, field716);
        if (var0 != null && var0.field3905 != null) {
            class90 var1 = new class90();
            var1.field1065 = var0;
            var1.field1072 = var0.field3905;
            class73.method7183(var1);
        }
        field530 = -1;
        field661 = false;
        method7116(var0);
    }

    @ObfuscatedName("df.lh(IIB)V")
    public static void method2283(int arg0, int arg1) {
        class324 var2 = class324.method4244(class322.field3313, field569.field1458);
        var2.field3379.method8782(arg1);
        var2.field3379.method8851(arg0);
        field569.method2829(var2);
    }

    @ObfuscatedName("av.lx(IIIILjava/lang/String;B)V")
    public static void method261(int arg0, int arg1, int arg2, int arg3, String arg4) {
        int var5 = arg0 >>> 16;
        int var6 = arg0 & 0xFFFF;
        class361 var7 = Statics.field2667.method5965(arg1, arg2);
        if (var7 == null) {
            return;
        }
        if (var7.field3913 != null) {
            class90 var8 = new class90();
            var8.field1065 = var7;
            var8.field1063 = var6;
            var8.field1069 = var5;
            var8.field1073 = arg4;
            var8.field1072 = var7.field3913;
            class73.method7183(var8);
        }
        boolean var9 = true;
        if (var7.field3808 > 0) {
            var9 = method4567(var7);
        }
        if (!var9) {
            return;
        }
        int var10 = method5918(var7);
        int var11 = var6 - 1;
        boolean var12 = (var10 >> var11 + 1 & 0x1) != 0;
        if (!var12) {
            return;
        }
        if (arg0 == 1) {
            class324 var13 = class324.method4244(class322.field3328, field569.field1458);
            var13.field3379.method9045(arg1);
            var13.field3379.method8782(arg2);
            var13.field3379.method8782(arg3);
            field569.method2829(var13);
        }
        if (arg0 == 2) {
            class324 var14 = class324.method4244(class322.field3343, field569.field1458);
            var14.field3379.method9045(arg1);
            var14.field3379.method8782(arg2);
            var14.field3379.method8782(arg3);
            field569.method2829(var14);
        }
        if (arg0 == 3) {
            class324 var15 = class324.method4244(class322.field3348, field569.field1458);
            var15.field3379.method9045(arg1);
            var15.field3379.method8782(arg2);
            var15.field3379.method8782(arg3);
            field569.method2829(var15);
        }
        if (arg0 == 4) {
            class324 var16 = class324.method4244(class322.field3302, field569.field1458);
            var16.field3379.method9045(arg1);
            var16.field3379.method8782(arg2);
            var16.field3379.method8782(arg3);
            field569.method2829(var16);
        }
        if (arg0 == 5) {
            class324 var17 = class324.method4244(class322.field3278, field569.field1458);
            var17.field3379.method9045(arg1);
            var17.field3379.method8782(arg2);
            var17.field3379.method8782(arg3);
            field569.method2829(var17);
        }
        if (arg0 == 6) {
            class324 var18 = class324.method4244(class322.field3269, field569.field1458);
            var18.field3379.method9045(arg1);
            var18.field3379.method8782(arg2);
            var18.field3379.method8782(arg3);
            field569.method2829(var18);
        }
        if (arg0 == 7) {
            class324 var19 = class324.method4244(class322.field3272, field569.field1458);
            var19.field3379.method9045(arg1);
            var19.field3379.method8782(arg2);
            var19.field3379.method8782(arg3);
            field569.method2829(var19);
        }
        if (arg0 == 8) {
            class324 var20 = class324.method4244(class322.field3335, field569.field1458);
            var20.field3379.method9045(arg1);
            var20.field3379.method8782(arg2);
            var20.field3379.method8782(arg3);
            field569.method2829(var20);
        }
        if (arg0 == 9) {
            class324 var21 = class324.method4244(class322.field3292, field569.field1458);
            var21.field3379.method9045(arg1);
            var21.field3379.method8782(arg2);
            var21.field3379.method8782(arg3);
            field569.method2829(var21);
        }
        if (arg0 == 10) {
            class324 var22 = class324.method4244(class322.field3350, field569.field1458);
            var22.field3379.method9045(arg1);
            var22.field3379.method8782(arg2);
            var22.field3379.method8782(arg3);
            field569.method2829(var22);
        }
        if (var5 == 0) {
            return;
        }
        class324 var23 = class324.method4244(class322.field3351, field569.field1458);
        var23.field3379.method9045(arg1);
        var23.field3379.method8782(arg2);
        var23.field3379.method8782(arg3);
        var23.field3379.method8781(var6);
        var23.field3379.method8781(var5 - 1);
        field569.method2829(var23);
    }

    @ObfuscatedName("el.lc(Ljava/lang/String;Ljava/lang/String;IIIII)I")
    public static final int method2879(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        return method4514(arg0, arg1, arg2, arg3, arg4, arg5, -1, false, -1);
    }

    @ObfuscatedName("dd.mj(Ljava/lang/String;Ljava/lang/String;IIIIIB)I")
    public static final int method2692(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        return method4514(arg0, arg1, arg2, arg3, arg4, arg5, arg6, false, -1);
    }

    @ObfuscatedName("jl.mm(Ljava/lang/String;Ljava/lang/String;IIIIIZIB)I")
    public static final int method4514(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        return field694 ? -1 : field651.method9434(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @ObfuscatedName("fd.ms(I)I")
    public static final int method3177() {
        return field651.field5519 - 1;
    }

    @ObfuscatedName("ac.mx(IIIIB)V")
    public static final void method52(int arg0, int arg1, int arg2, int arg3) {
        if (field659 == 0 && !field661) {
            method2879(class380.field4260, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        long var4 = -1L;
        int var6 = 0;
        long var7 = -1L;
        int var9 = 0;
        while (true) {
            int var11 = class198.field2241;
            if (var9 >= var11) {
                if (var4 != -1L) {
                    int var12 = (int) (var4 >>> 0 & 0x7FL);
                    int var14 = Statics.method2717(var4);
                    class94 var15 = Statics.field4799.field1317[field644];
                    method5406(var15, field644, var12, var14, var6);
                }
                return;
            }
            long var16 = class198.method3278(var9);
            if (var7 != var16) {
                var7 = var16;
                long var18 = class198.field2239[var9];
                int var20 = (int) (var18 >>> 0 & 0x7FL);
                int var22 = var20;
                int var23 = Statics.method2717(class198.field2239[var9]);
                int var24 = var23;
                int var25 = class198.method4124(var9);
                int var26 = class198.method5411(var9);
                int var27 = Statics.method6553(var9);
                if (var27 == 2047) {
                    var27 = -1;
                }
                class102 var28 = null;
                if (var27 >= 0 && Statics.field4799.field1321[var27] != null) {
                    var28 = Statics.field4799.field1321[var27].field4947;
                } else if (var27 == -1) {
                    var28 = Statics.field4799;
                }
                if (var28 != null) {
                    label346: {
                        int var29 = var28.field1308;
                        if (var25 == 2 && var28.field1328.method3628(var29, var20, var23, var16) >= 0) {
                            class261 var30 = class261.method4328(var26);
                            if (var30.field2783 != null) {
                                var30 = var30.method4719();
                            }
                            if (var30 == null) {
                                break label346;
                            }
                            class97 var31 = null;
                            for (class97 var32 = (class97) var28.field1325.method6907(); var32 != null; var32 = (class97) var28.field1325.method6896()) {
                                if (var32.field1174 == var29 && var32.field1179 == var22 && var32.field1168 == var24 && var32.field1172 == var26) {
                                    var31 = var32;
                                    break;
                                }
                            }
                            if (!Statics.field108 && field659 == 1) {
                                method4514(class380.field4255, field660 + " " + class105.field1350 + " " + class105.method7315(65535) + var30.field2782, 1, var26, var22, var24, -1, false, var27);
                            } else if (!field661) {
                                String[] var33 = var30.field2758;
                                if (var33 != null) {
                                    for (int var34 = 4; var34 >= 0; var34--) {
                                        if (!Statics.field108 && (var31 == null || var31.method2416(var34)) && var33[var34] != null) {
                                            short var35 = 0;
                                            if (var34 == 0) {
                                                var35 = 3;
                                            }
                                            if (var34 == 1) {
                                                var35 = 4;
                                            }
                                            if (var34 == 2) {
                                                var35 = 5;
                                            }
                                            if (var34 == 3) {
                                                var35 = 6;
                                            }
                                            if (var34 == 4) {
                                                var35 = 1001;
                                            }
                                            method4514(var33[var34], class105.method7315(65535) + var30.field2782, var35, var26, var22, var24, -1, false, var27);
                                        }
                                    }
                                }
                                method4514(class380.field4279, class105.method7315(65535) + var30.field2782, 1002, var30.field2753, var22, var24, -1, false, var27);
                            } else if (!Statics.field108 && (Statics.field1488 & 0x4) == 4) {
                                method4514(field664, field665 + " " + class105.field1350 + " " + class105.method7315(65535) + var30.field2782, 2, var26, var22, var24, -1, false, var27);
                            }
                        }
                        if (var25 == 1) {
                            class104 var36 = var28.field1318[var26];
                            if (var36 == null) {
                                break label346;
                            }
                            if (var36.field1340.field2571 == 1 && (var36.field1249 & 0x7F) == 64 && (var36.field1180 & 0x7F) == 64) {
                                for (int var37 = 0; var37 < var28.field1316; var37++) {
                                    class104 var38 = var28.field1318[var28.field1320[var37]];
                                    if (var38 != null && var36 != var38 && var38.field1340.field2571 == 1 && var36.field1249 == var38.field1249 && var36.field1180 == var38.field1180) {
                                        method3201(var38, var28.field1320[var37], var22, var24, var27);
                                    }
                                }
                                int var39 = var28.field1322.field1399;
                                int[] var40 = var28.field1322.field1401;
                                for (int var41 = 0; var41 < var39; var41++) {
                                    class94 var42 = var28.field1317[var40[var41]];
                                    if (var42 != null && var36.field1249 == var42.field1249 && var36.field1180 == var42.field1180) {
                                        method5406(var42, var40[var41], var22, var24, var27);
                                    }
                                }
                            }
                            method3201(var36, var26, var22, var24, var27);
                        }
                        if (var25 == 0) {
                            class94 var43 = var28.field1317[var26];
                            if (var43 == null) {
                                break label346;
                            }
                            if ((var43.field1249 & 0x7F) == 64 && (var43.field1180 & 0x7F) == 64) {
                                for (int var44 = 0; var44 < var28.field1316; var44++) {
                                    class104 var45 = var28.field1318[var28.field1320[var44]];
                                    if (var45 != null && var45.field1340.field2571 == 1 && var43.field1249 == var45.field1249 && var43.field1180 == var45.field1180) {
                                        method3201(var45, var28.field1320[var44], var22, var24, var27);
                                    }
                                }
                                int var46 = var28.field1322.field1399;
                                int[] var47 = var28.field1322.field1401;
                                for (int var48 = 0; var48 < var46; var48++) {
                                    class94 var49 = var28.field1317[var47[var48]];
                                    if (var49 != null && var43 != var49 && var43.field1249 == var49.field1249 && var43.field1180 == var49.field1180) {
                                        method5406(var49, var47[var48], var22, var24, var27);
                                    }
                                }
                            }
                            if (field644 == var26) {
                                var4 = var16;
                                var6 = var27;
                            } else {
                                method5406(var43, var26, var22, var24, var27);
                            }
                        }
                        if (var25 == 3) {
                            class408 var50 = var28.field1324[var29][var22][var24];
                            if (var50 != null) {
                                for (class108 var51 = (class108) var50.method6897(); var51 != null; var51 = (class108) var50.method6899()) {
                                    class262 var52 = class262.method2385(var51.field1384);
                                    if (!Statics.field1300 && field659 == 1) {
                                        method4514(class380.field4255, field660 + " " + class105.field1350 + " " + class105.method7315(16748608) + var52.field2796, 16, var51.field1384, var22, var24, -1, false, var27);
                                    } else if (!field661) {
                                        String[] var53 = var52.field2815;
                                        for (int var54 = 4; var54 >= 0; var54--) {
                                            if (!Statics.field1300 && var51.method2719(var54)) {
                                                if (var53 != null && var53[var54] != null) {
                                                    byte var55 = 0;
                                                    if (var54 == 0) {
                                                        var55 = 18;
                                                    }
                                                    if (var54 == 1) {
                                                        var55 = 19;
                                                    }
                                                    if (var54 == 2) {
                                                        var55 = 20;
                                                    }
                                                    if (var54 == 3) {
                                                        var55 = 21;
                                                    }
                                                    if (var54 == 4) {
                                                        var55 = 22;
                                                    }
                                                    method4514(var53[var54], class105.method7315(16748608) + var52.field2796, var55, var51.field1384, var22, var24, -1, false, var27);
                                                } else if (var54 == 2) {
                                                    method4514(class380.field4090, class105.method7315(16748608) + var52.field2796, 20, var51.field1384, var22, var24, -1, false, var27);
                                                }
                                            }
                                        }
                                        method4514(class380.field4279, class105.method7315(16748608) + var52.field2796, 1004, var51.field1384, var22, var24, -1, false, var27);
                                    } else if (!Statics.field1300 && (Statics.field1488 & 0x1) == 1) {
                                        method4514(field664, field665 + " " + class105.field1350 + " " + class105.method7315(16748608) + var52.field2796, 17, var51.field1384, var22, var24, -1, false, var27);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            var9++;
        }
    }

    @ObfuscatedName("ft.mu(Ldd;IIIII)V")
    public static final void method3201(class104 arg0, int arg1, int arg2, int arg3, int arg4) {
        class246 var5 = arg0.field1340;
        if (field651.field5519 >= 400) {
            return;
        }
        if (var5.field2582 != null) {
            var5 = var5.method4522();
        }
        if (var5 == null || !var5.field2605 || var5.field2607 && field676 != arg1) {
            return;
        }
        String var6 = arg0.method2641();
        if (var5.field2595 != 0 && arg0.field1214 != 0) {
            int var7 = arg0.field1214 == -1 ? var5.field2595 : arg0.field1214;
            int var9 = Statics.field2672.field1116;
            int var10 = var9 - var7;
            String var11;
            if (var10 < -9) {
                var11 = class105.method7315(16711680);
            } else if (var10 < -6) {
                var11 = class105.method7315(16723968);
            } else if (var10 < -3) {
                var11 = class105.method7315(16740352);
            } else if (var10 < 0) {
                var11 = class105.method7315(16756736);
            } else if (var10 > 9) {
                var11 = class105.method7315(65280);
            } else if (var10 > 6) {
                var11 = class105.method7315(4259584);
            } else if (var10 > 3) {
                var11 = class105.method7315(8453888);
            } else if (var10 > 0) {
                var11 = class105.method7315(12648192);
            } else {
                var11 = class105.method7315(16776960);
            }
            var6 = var6 + var11 + " " + class105.field1355 + class380.field4290 + var7 + class105.field1351;
        }
        if (var5.field2608 && field701) {
            method4514(class380.field4279, class105.method7315(16776960) + var6, 1003, arg1, arg2, arg3, -1, false, arg4);
        }
        if (!Statics.field1356 && field659 == 1) {
            method4514(class380.field4255, field660 + " " + class105.field1350 + " " + class105.method7315(16776960) + var6, 7, arg1, arg2, arg3, -1, false, arg4);
        } else if (!field661) {
            int var12 = var5.field2608 && field701 ? 2000 : 0;
            String[] var13 = var5.field2593;
            if (var13 != null) {
                for (int var14 = 4; var14 >= 0; var14--) {
                    if (!Statics.field1356 && arg0.method2640(var14) && var13[var14] != null && !var13[var14].equalsIgnoreCase(class380.field4162)) {
                        int var15 = 0;
                        if (var14 == 0) {
                            var15 = var12 + 9;
                        }
                        if (var14 == 1) {
                            var15 = var12 + 10;
                        }
                        if (var14 == 2) {
                            var15 = var12 + 11;
                        }
                        if (var14 == 3) {
                            var15 = var12 + 12;
                        }
                        if (var14 == 4) {
                            var15 = var12 + 13;
                        }
                        method4514(var13[var14], class105.method7315(16776960) + var6, var15, arg1, arg2, arg3, -1, false, arg4);
                    }
                }
            }
            if (var13 != null) {
                for (int var16 = 4; var16 >= 0; var16--) {
                    if (!Statics.field1356 && arg0.method2640(var16) && var13[var16] != null && var13[var16].equalsIgnoreCase(class380.field4162)) {
                        short var17 = 0;
                        if (field650 != class107.field1368) {
                            if (field650 == class107.field1366 || field650 == class107.field1372 && var5.field2595 > Statics.field2672.field1116) {
                                var17 = 2000;
                            }
                            int var18 = 0;
                            if (var16 == 0) {
                                var18 = var17 + 9;
                            }
                            if (var16 == 1) {
                                var18 = var17 + 10;
                            }
                            if (var16 == 2) {
                                var18 = var17 + 11;
                            }
                            if (var16 == 3) {
                                var18 = var17 + 12;
                            }
                            if (var16 == 4) {
                                var18 = var17 + 13;
                            }
                            method4514(var13[var16], class105.method7315(16776960) + var6, var18, arg1, arg2, arg3, -1, false, arg4);
                        }
                    }
                }
            }
            if (!var5.field2608 || !field701) {
                method4514(class380.field4279, class105.method7315(16776960) + var6, 1003, arg1, arg2, arg3, -1, false, arg4);
            }
        } else if (!Statics.field1356 && (Statics.field1488 & 0x2) == 2) {
            method4514(field664, field665 + " " + class105.field1350 + " " + class105.method7315(16776960) + var6, 8, arg1, arg2, arg3, -1, false, arg4);
        }
    }

    @ObfuscatedName("lu.mh(Ldw;IIIII)V")
    public static final void method5406(class94 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (field630 == arg0.field1133 || field651.field5519 >= 400) {
            return;
        }
        String var5;
        if (arg0.field1117 == 0) {
            var5 = arg0.field1127[0] + arg0.field1138 + arg0.field1127[1] + method2625(arg0.field1116, Statics.field2672.field1116) + " " + class105.field1355 + class380.field4290 + arg0.field1116 + class105.field1351 + arg0.field1127[2];
        } else {
            var5 = arg0.field1127[0] + arg0.field1138 + arg0.field1127[1] + " " + class105.field1355 + class380.field4262 + arg0.field1117 + class105.field1351 + arg0.field1127[2];
        }
        if (field659 == 1) {
            method4514(class380.field4255, field660 + " " + class105.field1350 + " " + class105.method7315(16777215) + var5, 14, arg1, arg2, arg3, -1, false, arg4);
        } else if (!field661) {
            for (int var6 = 7; var6 >= 0; var6--) {
                if (field641[var6] != null) {
                    short var7 = 0;
                    if (field641[var6].equalsIgnoreCase(class380.field4162)) {
                        if (field535 == class107.field1368) {
                            continue;
                        }
                        if (field535 == class107.field1366 || field535 == class107.field1372 && arg0.field1116 > Statics.field2672.field1116) {
                            var7 = 2000;
                        }
                        if (Statics.field2672.field1120 == 0 || arg0.field1120 == 0) {
                            if (field535 == class107.field1365 && arg0.method2378()) {
                                var7 = 2000;
                            }
                        } else if (Statics.field2672.field1120 == arg0.field1120) {
                            var7 = 2000;
                        } else {
                            var7 = 0;
                        }
                    } else if (field729[var6]) {
                        var7 = 2000;
                    }
                    boolean var8 = false;
                    int var9 = field639[var6] + var7;
                    method4514(field641[var6], class105.method7315(16777215) + var5, var9, arg1, arg2, arg3, -1, false, arg4);
                }
            }
        } else if ((Statics.field1488 & 0x8) == 8) {
            method4514(field664, field665 + " " + class105.field1350 + " " + class105.method7315(16777215) + var5, 15, arg1, arg2, arg3, -1, false, arg4);
        }
        for (int var10 = 0; var10 < field651.field5519; var10++) {
            if (field651.field5522[var10] == 23) {
                field651.field5523[var10] = class105.method7315(16777215) + var5;
                break;
            }
        }
    }

    @ObfuscatedName("dy.mg(III)Ljava/lang/String;")
    public static final String method2625(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class105.method7315(16711680);
        } else if (var2 < -6) {
            return class105.method7315(16723968);
        } else if (var2 < -3) {
            return class105.method7315(16740352);
        } else if (var2 < 0) {
            return class105.method7315(16756736);
        } else if (var2 > 9) {
            return class105.method7315(65280);
        } else if (var2 > 6) {
            return class105.method7315(4259584);
        } else if (var2 > 3) {
            return class105.method7315(8453888);
        } else if (var2 > 0) {
            return class105.method7315(12648192);
        } else {
            return class105.method7315(16776960);
        }
    }

    @ObfuscatedName("cd.mi(IIIIIIIIB)V")
    public static final void method2103(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (Statics.field2667.method5980(arg0)) {
            Statics.field3623 = null;
            method2897(Statics.field2667.field3709[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field3623 != null) {
                method2897(Statics.field3623, -1412584499, arg1, arg2, arg3, arg4, Statics.field1686, Statics.field1770, arg7);
                Statics.field3623 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field717[var8] = true;
            }
        } else {
            field717[arg7] = true;
        }
    }

    @ObfuscatedName("ee.mb([Lnq;IIIIIIIIB)V")
    public static final void method2897(class361[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class559.method9119(arg2, arg3, arg4, arg5);
        class181.method3483();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class361 var10 = arg0[var9];
            if (var10 != null && (var10.field3823 == arg1 || arg1 == -1412584499 && field679 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field625[field715] = var10.field3796 + arg6;
                    field721[field715] = var10.field3818 + arg7;
                    field722[field715] = var10.field3819;
                    field723[field715] = var10.field3820;
                    var11 = ++field715 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field3950 = var11;
                var10.field3888 = field519;
                if (!var10.field3910 || !Statics.method4484(var10)) {
                    if (var10.field3808 > 0) {
                        method2288(var10);
                    }
                    int var12 = var10.field3796 + arg6;
                    int var13 = var10.field3818 + arg7;
                    int var14 = var10.field3835;
                    if (field679 == var10) {
                        if (arg1 != -1412584499 && !var10.field3891) {
                            Statics.field3623 = arg0;
                            Statics.field1686 = arg6;
                            Statics.field1770 = arg7;
                            continue;
                        }
                        if (field690 && field684) {
                            int var15 = class36.field204;
                            int var16 = class36.field205;
                            int var17 = var15 - field681;
                            int var18 = var16 - field597;
                            if (var17 < field662) {
                                var17 = field662;
                            }
                            if (var10.field3819 + var17 > field662 + field643.field3819) {
                                var17 = field662 + field643.field3819 - var10.field3819;
                            }
                            if (var18 < field767) {
                                var18 = field767;
                            }
                            if (var10.field3820 + var18 > field767 + field643.field3820) {
                                var18 = field767 + field643.field3820 - var10.field3820;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field3891) {
                            var14 = 128;
                        }
                    }
                    int var25;
                    int var26;
                    int var27;
                    int var28;
                    if (var10.field3828 == 9) {
                        int var19 = var12;
                        int var20 = var13;
                        int var21 = var10.field3819 + var12;
                        int var22 = var10.field3820 + var13;
                        if (var21 < var12) {
                            var19 = var21;
                            var21 = var12;
                        }
                        if (var22 < var13) {
                            var20 = var22;
                            var22 = var13;
                        }
                        var21++;
                        var22++;
                        var25 = var19 > arg2 ? var19 : arg2;
                        var26 = var20 > arg3 ? var20 : arg3;
                        var27 = var21 < arg4 ? var21 : arg4;
                        var28 = var22 < arg5 ? var22 : arg5;
                    } else {
                        int var29 = var10.field3819 + var12;
                        int var30 = var10.field3820 + var13;
                        var25 = var12 > arg2 ? var12 : arg2;
                        var26 = var13 > arg3 ? var13 : arg3;
                        var27 = var29 < arg4 ? var29 : arg4;
                        var28 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field3910 || var25 < var27 && var26 < var28) {
                        if (var10.field3808 != 0) {
                            if (var10.field3808 == 1336) {
                                if (Statics.field1385.method2520()) {
                                    var13 += 15;
                                    Statics.field4572.method7601("Fps:" + field167, var10.field3819 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 327680 && !field548) {
                                        var33 = 16711680;
                                    }
                                    Statics.field4572.method7601("Mem:" + var32 + "k", var10.field3819 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field3808 == 1337) {
                                field655 = var12;
                                field656 = var13;
                                method3302(var12, var13, var10.field3819, var10.field3820);
                                field717[var10.field3950] = true;
                                class559.method9119(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3808 == 1338) {
                                method4932(var10, var12, var13, var11);
                                class559.method9119(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3808 == 1339) {
                                method2175(var10, var12, var13, var11);
                                class559.method9119(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3808 == 1400) {
                                Statics.field2389.method8312(var12, var13, var10.field3819, var10.field3820, field519, Statics.field1385.method2513());
                            }
                            if (var10.field3808 == 1401) {
                                Statics.field2389.method8406(var12, var13, var10.field3819, var10.field3820);
                            }
                            if (var10.field3808 == 1402) {
                                Statics.field121.method2476(var12, field519);
                            }
                        }
                        if (var10.field3828 == 0) {
                            if (!var10.field3910 && Statics.method4484(var10) && Statics.field26 != var10) {
                                continue;
                            }
                            if (!var10.field3910) {
                                if (var10.field3826 > var10.field3916 - var10.field3820) {
                                    var10.field3826 = var10.field3916 - var10.field3820;
                                }
                                if (var10.field3826 < 0) {
                                    var10.field3826 = 0;
                                }
                            }
                            method2897(arg0, var10.field3941, var25, var26, var27, var28, var12 - var10.field3825, var13 - var10.field3826, var11);
                            if (var10.field3936 != null) {
                                method2897(var10.field3936, var10.field3941, var25, var26, var27, var28, var12 - var10.field3825, var13 - var10.field3826, var11);
                            }
                            class89 var34 = (class89) field762.method8544((long) var10.field3941);
                            if (var34 != null) {
                                method2103(var34.field1062, var25, var26, var27, var28, var12, var13, var11);
                            }
                            class559.method9119(arg2, arg3, arg4, arg5);
                            class181.method3483();
                        } else if (var10.field3828 == 11) {
                            if (Statics.method4484(var10) && Statics.field26 != var10) {
                                continue;
                            }
                            if (var10.field3936 != null) {
                                method2897(var10.field3936, var10.field3941, var25, var26, var27, var28, var12 - var10.field3825, var13 - var10.field3826, var11);
                            }
                            class559.method9119(arg2, arg3, arg4, arg5);
                            class181.method3483();
                        }
                        if (field614 || field764[var11] || field724 > 1) {
                            if (var10.field3828 == 0 && !var10.field3910 && var10.field3916 > var10.field3820) {
                                method4579(var10.field3819 + var12, var13, var10.field3826, var10.field3820, var10.field3916);
                            }
                            if (var10.field3828 != 1) {
                                if (var10.field3828 == 3) {
                                    int var35;
                                    if (method2636(var10)) {
                                        var35 = var10.field3830;
                                        if (Statics.field26 == var10 && var10.field3890 != 0) {
                                            var35 = var10.field3890;
                                        }
                                    } else {
                                        var35 = var10.field3829;
                                        if (Statics.field26 == var10 && var10.field3831 != 0) {
                                            var35 = var10.field3831;
                                        }
                                    }
                                    if (var10.field3926) {
                                        switch(var10.field3834.field5464) {
                                            case 1:
                                                class559.method9124(var12, var13, var10.field3819, var10.field3820, var10.field3829, var10.field3830);
                                                break;
                                            case 2:
                                                class559.method9117(var12, var13, var10.field3819, var10.field3820, var10.field3829, var10.field3830, 255 - (var10.field3835 & 0xFF), 255 - (var10.field3836 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class559.method9145(var12, var13, var10.field3819, var10.field3820, var35);
                                                } else {
                                                    class559.method9122(var12, var13, var10.field3819, var10.field3820, var35, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class559.method9127(var12, var13, var10.field3819, var10.field3820, var35);
                                    } else {
                                        class559.method9141(var12, var13, var10.field3819, var10.field3820, var35, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field3828 == 4) {
                                    class433 var36 = var10.method6366(Statics.field2667);
                                    if (var36 != null) {
                                        String var37 = var10.field3867;
                                        int var38;
                                        if (method2636(var10)) {
                                            var38 = var10.field3830;
                                            if (Statics.field26 == var10 && var10.field3890 != 0) {
                                                var38 = var10.field3890;
                                            }
                                            if (var10.field3885.length() > 0) {
                                                var37 = var10.field3885;
                                            }
                                        } else {
                                            var38 = var10.field3829;
                                            if (Statics.field26 == var10 && var10.field3831 != 0) {
                                                var38 = var10.field3831;
                                            }
                                        }
                                        if (var10.field3910 && var10.field3939 != -1) {
                                            class262 var39 = class262.method2385(var10.field3939);
                                            var37 = var39.field2796;
                                            if (var37 == null) {
                                                var37 = class380.field4097;
                                            }
                                            if ((var39.field2847 == 1 || var10.field3940 != 1) && var10.field3940 != -1) {
                                                var37 = class105.method7315(16748608) + var37 + class105.field1354 + " " + 'x' + method3829(var10.field3940);
                                            }
                                        }
                                        if (field672 == var10) {
                                            var37 = class380.field4263;
                                            var38 = var10.field3829;
                                        }
                                        if (!var10.field3910) {
                                            var37 = method5414(var37, var10);
                                        }
                                        var36.method7628(var37, var12, var13, var10.field3819, var10.field3820, var38, var10.field3872 ? 0 : -1, class500.method8203(var10.field3835), var10.field3870, var10.field3861, var10.field3869);
                                    } else if (class361.field3897) {
                                        method7116(var10);
                                    }
                                } else if (var10.field3828 == 5) {
                                    if (var10.field3910) {
                                        class563 var41;
                                        if (var10.field3939 == -1) {
                                            var41 = var10.method6361(Statics.field2667, false, Statics.field96);
                                        } else {
                                            var41 = class262.method6549(var10.field3939, var10.field3940, var10.field3844, var10.field3845, var10.field3944, false);
                                        }
                                        if (var41 != null) {
                                            int var42 = var41.field5477;
                                            int var43 = var41.field5483;
                                            if (var10.field3903) {
                                                class559.method9123(var12, var13, var10.field3819 + var12, var10.field3820 + var13);
                                                int var44 = (var10.field3819 + (var42 - 1)) / var42;
                                                int var45 = (var10.field3820 + (var43 - 1)) / var43;
                                                for (int var46 = 0; var46 < var44; var46++) {
                                                    for (int var47 = 0; var47 < var45; var47++) {
                                                        if (var10.field3896 != 0) {
                                                            var41.method9290(var42 / 2 + var42 * var46 + var12, var43 / 2 + var43 * var47 + var13, var10.field3896, 4096);
                                                        } else if (var14 == 0) {
                                                            var41.method9284(var42 * var46 + var12, var43 * var47 + var13);
                                                        } else {
                                                            var41.method9260(var42 * var46 + var12, var43 * var47 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class559.method9119(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var48 = var10.field3819 * 4096 / var42;
                                                if (var10.field3896 != 0) {
                                                    var41.method9290(var10.field3819 / 2 + var12, var10.field3820 / 2 + var13, var10.field3896, var48);
                                                } else if (var14 != 0) {
                                                    var41.method9262(var12, var13, var10.field3819, var10.field3820, 256 - (var14 & 0xFF));
                                                } else if (var10.field3819 == var42 && var10.field3820 == var43) {
                                                    var41.method9284(var12, var13);
                                                } else {
                                                    var41.method9257(var12, var13, var10.field3819, var10.field3820);
                                                }
                                            }
                                        } else if (class361.field3897) {
                                            method7116(var10);
                                        }
                                    } else {
                                        class563 var40 = var10.method6361(Statics.field2667, method2636(var10), Statics.field96);
                                        if (var40 != null) {
                                            var40.method9284(var12, var13);
                                        } else if (class361.field3897) {
                                            method7116(var10);
                                        }
                                    }
                                } else if (var10.field3828 == 6) {
                                    boolean var49 = method2636(var10);
                                    int var50;
                                    if (var49) {
                                        var50 = var10.field3853;
                                    } else {
                                        var50 = var10.field3852;
                                    }
                                    class197 var51 = null;
                                    int var52 = 0;
                                    if (var10.field3939 != -1) {
                                        class262 var53 = class262.method2385(var10.field3939);
                                        if (var53 != null) {
                                            class262 var54 = var53.method4772(var10.field3940);
                                            var51 = var54.method4771(1);
                                            if (var51 == null) {
                                                method7116(var10);
                                            } else {
                                                var51.method3909();
                                                var52 = var51.field2086 / 2;
                                            }
                                        }
                                    } else if (var10.field3848 == 5) {
                                        if (var10.field3849 == 0) {
                                            var51 = field785.method6003((class264) null, -1, (class264) null, -1);
                                        } else {
                                            var51 = Statics.field2672.method2088();
                                        }
                                    } else if (var10.field3848 == 7) {
                                        var51 = var10.field3862.method6003((class264) null, -1, class264.method3551(Statics.field2672.field1186), Statics.field2672.field1183);
                                    } else {
                                        class245 var55 = null;
                                        if (var10.field3848 == 6) {
                                            int var56 = var10.field3849;
                                            if (var56 >= 0 && var56 < Statics.field4799.field1318.length) {
                                                class104 var57 = Statics.field4799.field1318[var56];
                                                if (var57 != null && var57.field1340 != null) {
                                                    int var58 = var57.field1340.method4558();
                                                    if (var58 != -1) {
                                                        var10.field3849 = var58;
                                                    }
                                                    var55 = var57.method2666();
                                                }
                                            }
                                        } else if (var10.field3848 == 2) {
                                            int var59 = var10.field3849;
                                            int var60 = class246.method2916(var59).method4558();
                                            if (var60 != -1) {
                                                var10.field3849 = var60;
                                            }
                                        }
                                        class264 var61 = null;
                                        int var62 = -1;
                                        if (var50 != -1) {
                                            var61 = class264.method3551(var50);
                                            var62 = var10.field3919;
                                        }
                                        var51 = var10.method6367(Statics.field2667, var61, var62, var49, Statics.field2672.field1111, var55);
                                        if (var51 == null && class361.field3897) {
                                            method7116(var10);
                                        }
                                    }
                                    class181.method3453(var10.field3819 / 2 + var12, var10.field3820 / 2 + var13);
                                    int var63 = var10.field3859 * class181.field1941[var10.field3856] >> 16;
                                    int var64 = var10.field3859 * class181.field1942[var10.field3856] >> 16;
                                    if (var51 != null) {
                                        if (var10.field3910) {
                                            var51.method3909();
                                            if (var10.field3863) {
                                                var51.method3927(0, var10.field3857, var10.field3841, var10.field3856, var10.field3854, var10.field3871 + var52 + var63, var10.field3871 + var64, var10.field3859);
                                            } else {
                                                var51.method3929(0, var10.field3857, var10.field3841, var10.field3856, var10.field3854, var10.field3871 + var52 + var63, var10.field3871 + var64);
                                            }
                                        } else {
                                            var51.method3929(0, var10.field3857, 0, var10.field3856, 0, var63, var64);
                                        }
                                    }
                                    class181.method3452();
                                } else {
                                    if (var10.field3828 == 8 && Statics.field2979 == var10 && field658 == field657) {
                                        int var65 = 0;
                                        int var66 = 0;
                                        class433 var67 = Statics.field4572;
                                        String var68 = var10.field3867;
                                        String var69 = method5414(var68, var10);
                                        while (var69.length() > 0) {
                                            int var70 = var69.indexOf(class105.field1353);
                                            String var71;
                                            if (var70 == -1) {
                                                var71 = var69;
                                                var69 = "";
                                            } else {
                                                var71 = var69.substring(0, var70);
                                                var69 = var69.substring(var70 + 4);
                                            }
                                            int var72 = var67.method7586(var71);
                                            if (var72 > var65) {
                                                var65 = var72;
                                            }
                                            var66 += var67.field4756 + 1;
                                        }
                                        var65 += 6;
                                        var66 += 7;
                                        int var73 = var10.field3819 + var12 - 5 - var65;
                                        int var74 = var10.field3820 + var13 + 5;
                                        if (var73 < var12 + 5) {
                                            var73 = var12 + 5;
                                        }
                                        if (var65 + var73 > arg4) {
                                            var73 = arg4 - var65;
                                        }
                                        if (var66 + var74 > arg5) {
                                            var74 = arg5 - var66;
                                        }
                                        class559.method9145(var73, var74, var65, var66, 16777120);
                                        class559.method9127(var73, var74, var65, var66, 0);
                                        String var75 = var10.field3867;
                                        int var76 = var67.field4756 + var74 + 2;
                                        String var77 = method5414(var75, var10);
                                        while (var77.length() > 0) {
                                            int var78 = var77.indexOf(class105.field1353);
                                            String var79;
                                            if (var78 == -1) {
                                                var79 = var77;
                                                var77 = "";
                                            } else {
                                                var79 = var77.substring(0, var78);
                                                var77 = var77.substring(var78 + 4);
                                            }
                                            var67.method7565(var79, var73 + 3, var76, 0, -1);
                                            var76 += var67.field4756 + 1;
                                        }
                                    }
                                    if (var10.field3828 == 9) {
                                        int var80;
                                        int var81;
                                        int var82;
                                        int var83;
                                        if (var10.field3838) {
                                            var80 = var12;
                                            var81 = var10.field3820 + var13;
                                            var82 = var10.field3819 + var12;
                                            var83 = var13;
                                        } else {
                                            var80 = var12;
                                            var81 = var13;
                                            var82 = var10.field3819 + var12;
                                            var83 = var10.field3820 + var13;
                                        }
                                        if (var10.field3946 == 1) {
                                            class559.method9133(var80, var81, var82, var83, var10.field3829);
                                        } else {
                                            method3184(var80, var81, var82, var83, var10.field3829, var10.field3946);
                                        }
                                    } else if (var10.field3828 == 12) {
                                        class359 var84 = var10.method6391();
                                        class353 var85 = var10.method6392();
                                        if (var84 != null && var85 != null && var84.method6263()) {
                                            class433 var86 = var10.method6366(Statics.field2667);
                                            if (var86 != null) {
                                                field709.method9411(var12, var13, var10.field3819, var10.field3820, var84.method6117(), var84.method6118(), var84.method6114(), var84.method6115(), var84.method6282());
                                                int var87 = var10.field3872 ? var10.field3845 : -1;
                                                if (!var84.method6111() && var84.method6132().method7391()) {
                                                    field709.method9412(var85.field3723, var87, var85.field3722, var85.field3721);
                                                    field709.method9416(var84.method6244(), var86);
                                                } else {
                                                    field709.method9412(var10.field3829, var87, var85.field3722, var85.field3721);
                                                    field709.method9416(var84.method6132(), var86);
                                                }
                                                class559.method9119(arg2, arg3, arg4, arg5);
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
    }

    @ObfuscatedName("fa.mc(IIIIIIB)V")
    public static final void method3184(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class559.field5447;
        int var18 = arg1 - class559.field5449;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class181.method3454(var19, var20, var21);
        class181.method3456(var23, var24, var25, var19, var20, var21, 0.0F, 0.0F, 0.0F, arg4);
        class181.method3454(var19, var21, var22);
        class181.method3456(var23, var25, var26, var19, var21, var22, 0.0F, 0.0F, 0.0F, arg4);
    }

    @ObfuscatedName("lv.my(Ljava/lang/String;Lnq;I)Ljava/lang/String;")
    public static String method5414(String arg0, class361 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method3429(arg1, var2 - 1);
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

    @ObfuscatedName("hx.mf(II)Ljava/lang/String;")
    public static final String method3829(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class105.field1348 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class105.method7315(65408) + var1.substring(0, var1.length() - 8) + class380.field4266 + " " + class105.field1355 + var1 + class105.field1351 + class105.field1354;
        } else if (var1.length() > 6) {
            return " " + class105.method7315(16777215) + var1.substring(0, var1.length() - 4) + class380.field4330 + " " + class105.field1355 + var1 + class105.field1351 + class105.field1354;
        } else {
            return " " + class105.method7315(16776960) + var1 + class105.field1354;
        }
    }

    @ObfuscatedName("client.ml(ZB)V")
    public final void method1184(boolean arg0) {
        method3325(field667, Statics.field1345, Statics.field467, arg0);
    }

    @ObfuscatedName("client.mv(Lnq;I)V")
    public void method1185(class361 arg0) {
        class361 var2 = arg0.field3823 == -1 ? null : Statics.field2667.method5964(arg0.field3823);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field1345;
            var4 = Statics.field467;
        } else {
            var3 = var2.field3819;
            var4 = var2.field3820;
        }
        method5477(arg0, var3, var4, false);
        method350(arg0, var3, var4);
    }

    @ObfuscatedName("gl.me([Lnq;Lnq;ZI)V")
    public static void method3298(class361[] arg0, class361 arg1, boolean arg2) {
        int var3 = arg1.field3832 == 0 ? arg1.field3819 : arg1.field3832;
        int var4 = arg1.field3916 == 0 ? arg1.field3820 : arg1.field3916;
        method3060(arg0, arg1.field3941, var3, var4, arg2);
        if (arg1.field3936 != null) {
            method3060(arg1.field3936, arg1.field3941, var3, var4, arg2);
        }
        class89 var5 = (class89) field762.method8544((long) arg1.field3941);
        if (var5 != null) {
            method3325(var5.field1062, var3, var4, arg2);
        }
        if (arg1.field3808 == 1337) {
        }
    }

    @ObfuscatedName("gx.mp(IIIZI)V")
    public static final void method3325(int arg0, int arg1, int arg2, boolean arg3) {
        if (Statics.field2667.method5980(arg0)) {
            method3060(Statics.field2667.field3709[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("fb.mw([Lnq;IIIZI)V")
    public static void method3060(class361[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class361 var6 = arg0[var5];
            if (var6 != null && var6.field3823 == arg1) {
                method5477(var6, arg2, arg3, arg4);
                method350(var6, arg2, arg3);
                if (var6.field3825 > var6.field3832 - var6.field3819) {
                    var6.field3825 = var6.field3832 - var6.field3819;
                }
                if (var6.field3825 < 0) {
                    var6.field3825 = 0;
                }
                if (var6.field3826 > var6.field3916 - var6.field3820) {
                    var6.field3826 = var6.field3916 - var6.field3820;
                }
                if (var6.field3826 < 0) {
                    var6.field3826 = 0;
                }
                if (var6.field3828 == 0) {
                    method3298(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("lz.mn(Lnq;IIZB)V")
    public static void method5477(class361 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field3819;
        int var5 = arg0.field3820;
        if (arg0.field3811 == 0) {
            arg0.field3819 = arg0.field3815;
        } else if (arg0.field3811 == 1) {
            arg0.field3819 = arg1 - arg0.field3815;
        } else if (arg0.field3811 == 2) {
            arg0.field3819 = arg0.field3815 * arg1 >> 14;
        }
        if (arg0.field3932 == 0) {
            arg0.field3820 = arg0.field3868;
        } else if (arg0.field3932 == 1) {
            arg0.field3820 = arg2 - arg0.field3868;
        } else if (arg0.field3932 == 2) {
            arg0.field3820 = arg0.field3868 * arg2 >> 14;
        }
        if (arg0.field3811 == 4) {
            arg0.field3819 = arg0.field3821 * arg0.field3820 / arg0.field3822;
        }
        if (arg0.field3932 == 4) {
            arg0.field3820 = arg0.field3822 * arg0.field3819 / arg0.field3821;
        }
        if (arg0.field3808 == 1337) {
            field678 = arg0;
        }
        if (arg0.field3828 == 12) {
            arg0.method6391().method6065(arg0.field3819, arg0.field3820);
        }
        if (arg3 && arg0.field3927 != null && (arg0.field3819 != var4 || arg0.field3820 != var5)) {
            class90 var6 = new class90();
            var6.field1065 = arg0;
            var6.field1072 = arg0.field3927;
            field621.method6892(var6);
        }
    }

    @ObfuscatedName("az.mo(Lnq;III)V")
    public static void method350(class361 arg0, int arg1, int arg2) {
        if (arg0.field3804 == 0) {
            arg0.field3796 = arg0.field3813;
        } else if (arg0.field3804 == 1) {
            arg0.field3796 = (arg1 - arg0.field3819) / 2 + arg0.field3813;
        } else if (arg0.field3804 == 2) {
            arg0.field3796 = arg1 - arg0.field3819 - arg0.field3813;
        } else if (arg0.field3804 == 3) {
            arg0.field3796 = arg0.field3813 * arg1 >> 14;
        } else if (arg0.field3804 == 4) {
            arg0.field3796 = (arg0.field3813 * arg1 >> 14) + (arg1 - arg0.field3819) / 2;
        } else {
            arg0.field3796 = arg1 - arg0.field3819 - (arg0.field3813 * arg1 >> 14);
        }
        if (arg0.field3810 == 0) {
            arg0.field3818 = arg0.field3814;
        } else if (arg0.field3810 == 1) {
            arg0.field3818 = (arg2 - arg0.field3820) / 2 + arg0.field3814;
        } else if (arg0.field3810 == 2) {
            arg0.field3818 = arg2 - arg0.field3820 - arg0.field3814;
        } else if (arg0.field3810 == 3) {
            arg0.field3818 = arg0.field3814 * arg2 >> 14;
        } else if (arg0.field3810 == 4) {
            arg0.field3818 = (arg0.field3814 * arg2 >> 14) + (arg2 - arg0.field3820) / 2;
        } else {
            arg0.field3818 = arg2 - arg0.field3820 - (arg0.field3814 * arg2 >> 14);
        }
    }

    @ObfuscatedName("ql.mk(Lnq;IIIIIII)V")
    public static final void method7343(class361 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field589) {
            field590 = 32;
        } else {
            field590 = 0;
        }
        field589 = false;
        if (class36.field203 == 1 || !Statics.field4709 && class36.field203 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field3826 -= 4;
                method7116(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field3826 += 4;
                method7116(arg0);
            } else if (arg5 >= arg1 - field590 && arg5 < field590 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field3826 = (arg4 - arg3) * var8 / var9;
                method7116(arg0);
                field589 = true;
            }
        }
        if (field708 == 0) {
            return;
        }
        int var10 = arg0.field3819;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field3826 += field708 * 45;
            method7116(arg0);
        }
    }

    @ObfuscatedName("jh.mz(IIIIII)V")
    public static final void method4579(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field1509[0].method9218(arg0, arg1);
        Statics.field1509[1].method9218(arg0, arg1 + arg3 - 16);
        class559.method9145(arg0, arg1 + 16, 16, arg3 - 32, field612);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class559.method9145(arg0, arg1 + 16 + var6, 16, var5, field586);
        class559.method9131(arg0, arg1 + 16 + var6, var5, field588);
        class559.method9131(arg0 + 1, arg1 + 16 + var6, var5, field588);
        class559.method9129(arg0, arg1 + 16 + var6, 16, field588);
        class559.method9129(arg0, arg1 + 17 + var6, 16, field588);
        class559.method9131(arg0 + 15, arg1 + 16 + var6, var5, field718);
        class559.method9131(arg0 + 14, arg1 + 17 + var6, var5 - 1, field718);
        class559.method9129(arg0, arg1 + 15 + var6 + var5, 16, field718);
        class559.method9129(arg0 + 1, arg1 + 14 + var6 + var5, 15, field718);
    }

    @ObfuscatedName("dz.mr(Lnq;I)Z")
    public static final boolean method2636(class361 arg0) {
        if (arg0.field3843 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field3843.length; var1++) {
            int var2 = method3429(arg0, var1);
            int var3 = arg0.field3933[var1];
            if (arg0.field3843[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field3843[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field3843[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("gf.md(Lnq;II)I")
    public static final int method3429(class361 arg0, int arg1) {
        if (arg0.field3931 == null || arg1 >= arg0.field3931.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field3931[arg1];
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
                    var7 = field578[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field646[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field647[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class361 var11 = Statics.field2667.method5964(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class262.method2385(var12).field2814 || field601)) {
                        for (int var13 = 0; var13 < var11.field3937.length; var13++) {
                            if (var12 + 1 == var11.field3937[var13]) {
                                var7 += var11.field3938[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class349.field3702[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class371.field4017[field646[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class349.field3702[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field2672.field1116;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class371.field4018[var14]) {
                            var7 += field646[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class361 var17 = Statics.field2667.method5964(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class262.method2385(var18).field2814 || field601)) {
                        for (int var19 = 0; var19 < var17.field3937.length; var19++) {
                            if (var18 + 1 == var17.field3937[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field680;
                }
                if (var6 == 12) {
                    var7 = field674;
                }
                if (var6 == 13) {
                    int var20 = class349.field3702[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class349.method3159(var22);
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
                    var7 = (Statics.field2672.field1249 >> 7) + Statics.field4799.field1311;
                }
                if (var6 == 19) {
                    var7 = (Statics.field2672.field1180 >> 7) + Statics.field4799.field1319;
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

    @ObfuscatedName("ha.mq(Lnq;B)V")
    public static final void method3834(class361 arg0) {
        if (arg0.field3807 == 1) {
            method2692(arg0.field3886, "", 24, 0, 0, arg0.field3941, arg0.field3939);
        }
        if (arg0.field3807 == 2 && !field661) {
            String var1 = method181(arg0);
            if (var1 != null) {
                method2692(var1, class105.method7315(65280) + arg0.field3935, 25, 0, -1, arg0.field3941, arg0.field3939);
            }
        }
        if (arg0.field3807 == 3) {
            method2879(class380.field4172, "", 26, 0, 0, arg0.field3941);
        }
        if (arg0.field3807 == 4) {
            method2879(arg0.field3886, "", 28, 0, 0, arg0.field3941);
        }
        if (arg0.field3807 == 5) {
            method2879(arg0.field3886, "", 29, 0, 0, arg0.field3941);
        }
        if (arg0.field3807 == 6 && field672 == null) {
            method2879(arg0.field3886, "", 30, 0, -1, arg0.field3941);
        }
        if (!arg0.field3910) {
            return;
        }
        if (field661) {
            int var2 = method5918(arg0);
            boolean var3 = (var2 >> 21 & 0x1) != 0;
            if (var3 && (Statics.field1488 & 0x20) == 32) {
                method2692(field664, field665 + " " + class105.field1350 + " " + arg0.field3884, 58, 0, arg0.field3876, arg0.field3941, arg0.field3939);
            }
            return;
        }
        for (int var4 = 9; var4 >= 0; var4--) {
            if (arg0.field3887 == var4) {
                String var5 = method181(arg0);
                if (var5 != null) {
                    method2692(var5, arg0.field3884, 25, 0, arg0.field3876, arg0.field3941, arg0.field3939);
                }
            }
            String var6 = method2287(arg0, var4);
            if (var6 != null) {
                short var7;
                int var8;
                if (var4 > arg0.field3887) {
                    var7 = 1007;
                    var8 = method2692(var6, arg0.field3884, var7, var4 + 1, arg0.field3876, arg0.field3941, arg0.field3939);
                } else {
                    var7 = 57;
                    var8 = method4514(var6, arg0.field3884, var7, var4 + 1, arg0.field3876, arg0.field3941, arg0.field3939, arg0.field3951, -1);
                }
                if (arg0.field3874 != null && var4 < arg0.field3874.length && arg0.field3874[var4] != null) {
                    String[] var9 = arg0.field3874[var4];
                    for (int var10 = var9.length - 1; var10 >= 0; var10--) {
                        int var11 = var10 + 1 << 16 | var4 + 1;
                        if (var9[var10] != null && !var9[var10].isEmpty()) {
                            String var12 = var9[var10];
                            int var13 = arg0.field3876;
                            int var14 = arg0.field3941;
                            int var15 = arg0.field3939;
                            if (!field694) {
                                int var16 = var7;
                                if (var7 >= 2000) {
                                    var16 = var7 - 2000;
                                }
                                boolean var17 = var16 == 16 || var16 == 17 || var16 >= 18 && var16 <= 22;
                                if (!var17 && !class88.method3826(var16) && !class88.method2335(var16)) {
                                }
                                boolean var18 = true;
                                if (var18 && var8 >= 0 && var8 < field651.field5527.length) {
                                    if (field651.field5527[var8] == null) {
                                        field651.field5527[var8] = new class568(false);
                                    }
                                    field651.field5527[var8].method9434(var12, "", var7, var11, var13, var14, var15, false, -1);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (class362.method4649(method5918(arg0))) {
            method2879(class380.field4348, "", 30, 0, arg0.field3876, arg0.field3941);
        }
    }

    @ObfuscatedName("lw.mt(ZI)V")
    public static void method5456(boolean arg0) {
        field653 = arg0;
    }

    @ObfuscatedName("dh.ma(S)Z")
    public static boolean method2343() {
        return field653;
    }

    @ObfuscatedName("dt.nc(IIIIIIII)V")
    public static final void method2467(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (Statics.field2667.method5980(arg0)) {
            method2414(Statics.field2667.field3709[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("dq.nr([Lnq;IIIIIIIB)V")
    public static final void method2414(class361[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class361 var9 = arg0[var8];
            if (var9 != null && var9.field3823 == arg1 && (var9.method6371() || method5918(var9) != 0 || field643 == var9)) {
                if (var9.field3910) {
                    if (Statics.method4484(var9)) {
                        continue;
                    }
                } else if (var9.field3828 == 0 && Statics.field26 != var9 && Statics.method4484(var9)) {
                    continue;
                }
                if (var9.field3828 == 11) {
                    if (var9.method6388(Statics.field2667, Statics.field96)) {
                        if (var9.method6380()) {
                            method7116(var9);
                            method3298(var9.field3936, var9, true);
                            var9.method6463().method4190().method4249(3, var9.method6463().method4160());
                        }
                        if (var9.field3930 != null) {
                            class90 var10 = new class90();
                            var10.field1065 = var9;
                            var10.field1072 = var9.field3930;
                            field621.method6892(var10);
                        }
                    }
                } else if (var9.field3828 == 12 && var9.method6396(Statics.field2667)) {
                    method7116(var9);
                }
                int var11 = var9.field3796 + arg6;
                int var12 = var9.field3818 + arg7;
                int var19;
                int var20;
                int var21;
                int var22;
                if (var9.field3828 == 9) {
                    int var13 = var11;
                    int var14 = var12;
                    int var15 = var9.field3819 + var11;
                    int var16 = var9.field3820 + var12;
                    if (var15 < var11) {
                        var13 = var15;
                        var15 = var11;
                    }
                    if (var16 < var12) {
                        var14 = var16;
                        var16 = var12;
                    }
                    var15++;
                    var16++;
                    var19 = var13 > arg2 ? var13 : arg2;
                    var20 = var14 > arg3 ? var14 : arg3;
                    var21 = var15 < arg4 ? var15 : arg4;
                    var22 = var16 < arg5 ? var16 : arg5;
                } else {
                    int var23 = var9.field3819 + var11;
                    int var24 = var9.field3820 + var12;
                    var19 = var11 > arg2 ? var11 : arg2;
                    var20 = var12 > arg3 ? var12 : arg3;
                    var21 = var23 < arg4 ? var23 : arg4;
                    var22 = var24 < arg5 ? var24 : arg5;
                }
                if (field679 == var9) {
                    field605 = true;
                    field636 = var11;
                    field689 = var12;
                }
                boolean var25 = false;
                if (var9.field3879) {
                    switch(field669) {
                        case 0:
                            var25 = true;
                        case 1:
                        default:
                            break;
                        case 2:
                            if (var9.field3941 >>> 16 == field670) {
                                var25 = true;
                            }
                            break;
                        case 3:
                            if (field670 == var9.field3941) {
                                var25 = true;
                            }
                    }
                }
                if (var25 || !var9.field3910 || var19 < var21 && var20 < var22) {
                    if (var9.field3910) {
                        if (var9.field3953) {
                            if (class36.field204 >= var19 && class36.field205 >= var20 && class36.field204 < var21 && class36.field205 < var22) {
                                for (class90 var26 = (class90) field621.method6907(); var26 != null; var26 = (class90) field621.method6896()) {
                                    if (var26.field1064) {
                                        var26.method8218();
                                        var26.field1065.field3943 = false;
                                    }
                                }
                                method4490();
                                if (Statics.field5304 == 0) {
                                    field679 = null;
                                    field643 = null;
                                }
                                if (!field694) {
                                    method8128();
                                }
                            }
                        } else if (var9.field3954 && class36.field204 >= var19 && class36.field205 >= var20 && class36.field204 < var21 && class36.field205 < var22) {
                            for (class90 var27 = (class90) field621.method6907(); var27 != null; var27 = (class90) field621.method6896()) {
                                if (var27.field1064 && var27.field1065.field3915 == var27.field1072) {
                                    var27.method8218();
                                }
                            }
                        }
                    }
                    int var28 = class36.field204;
                    int var29 = class36.field205;
                    if (class36.field211 != 0) {
                        var28 = class36.field216;
                        var29 = class36.field213;
                    }
                    boolean var30 = var28 >= var19 && var29 >= var20 && var28 < var21 && var29 < var22;
                    if (var9.field3808 == 1337) {
                        if (!field536 && !field694 && var30) {
                            method52(var28, var29, var19, var20);
                        }
                    } else if (var9.field3808 == 1338) {
                        Statics.method3112(var9, var11, var12);
                    } else {
                        if (var9.field3808 == 1400) {
                            Statics.field2389.method8295(class36.field204, class36.field205, var30, var11, var12, var9.field3819, var9.field3820);
                        }
                        if (!field694 && var30) {
                            if (var9.field3808 == 1400) {
                                Statics.field2389.method8348(var11, var12, var9.field3819, var9.field3820, var28, var29);
                            } else {
                                method3834(var9);
                            }
                        }
                        if (var25) {
                            for (int var31 = 0; var31 < var9.field3880.length; var31++) {
                                boolean var32 = false;
                                boolean var33 = false;
                                if (!var32 && var9.field3880[var31] != null) {
                                    for (int var34 = 0; var34 < var9.field3880[var31].length; var34++) {
                                        boolean var35 = false;
                                        if (var9.field3952 != null) {
                                            var35 = field748.method4940(var9.field3880[var31][var34]);
                                        }
                                        if (method995(var9.field3880[var31][var34]) || var35) {
                                            var32 = true;
                                            if (var9.field3952 != null && var9.field3952[var31] > field519) {
                                                break;
                                            }
                                            byte var36 = var9.field3881[var31][var34];
                                            if (var36 == 0 || ((var36 & 0x8) == 0 || !field748.method4940(86) && !field748.method4940(82) && !field748.method4940(81)) && ((var36 & 0x2) == 0 || field748.method4940(86)) && ((var36 & 0x1) == 0 || field748.method4940(82)) && ((var36 & 0x4) == 0 || field748.method4940(81))) {
                                                var33 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (var33) {
                                    if (var31 < 10) {
                                        method261(var31 + 1, var9.field3941, var9.field3876, var9.field3939, "");
                                    } else if (var31 == 10) {
                                        method3115();
                                        method3193(var9.field3941, var9.field3876, Statics.method4373(method5918(var9)), var9.field3939);
                                        field664 = method181(var9);
                                        if (field664 == null) {
                                            field664 = class380.field4097;
                                        }
                                        field665 = var9.field3884 + class105.method7315(16777215);
                                    }
                                    int var37 = var9.field3882[var31];
                                    if (var9.field3952 == null) {
                                        var9.field3952 = new int[var9.field3880.length];
                                    }
                                    if (var9.field3833 == null) {
                                        var9.field3833 = new int[var9.field3880.length];
                                    }
                                    if (var37 == 0) {
                                        var9.field3952[var31] = Integer.MAX_VALUE;
                                    } else if (var9.field3952[var31] == 0) {
                                        var9.field3952[var31] = field519 + var37 + var9.field3833[var31];
                                    } else {
                                        var9.field3952[var31] = field519 + var37;
                                    }
                                }
                                if (!var32 && var9.field3952 != null) {
                                    var9.field3952[var31] = 0;
                                }
                            }
                        }
                        if (var9.field3910) {
                            boolean var38;
                            if (class36.field204 >= var19 && class36.field205 >= var20 && class36.field204 < var21 && class36.field205 < var22) {
                                var38 = true;
                            } else {
                                var38 = false;
                            }
                            boolean var39 = false;
                            if ((class36.field203 == 1 || !Statics.field4709 && class36.field203 == 4) && var38) {
                                var39 = true;
                            }
                            boolean var40 = false;
                            if ((class36.field211 == 1 || !Statics.field4709 && class36.field211 == 4) && class36.field216 >= var19 && class36.field213 >= var20 && class36.field216 < var21 && class36.field213 < var22) {
                                var40 = true;
                            }
                            if (var40) {
                                method4998(var9, class36.field216 - var11, class36.field213 - var12);
                            }
                            if (var9.method6372()) {
                                if (var40) {
                                    field713.method6892(new class267(0, class36.field204 - var11, class36.field205 - var12, var9));
                                }
                                if (var39) {
                                    field713.method6892(new class267(1, class36.field204 - var11, class36.field205 - var12, var9));
                                }
                            }
                            if (var9.field3808 == 1400) {
                                Statics.field2389.method8481(var28, var29, var38 & var39, var38 & var40);
                            }
                            if (field679 != null && field679 != var9 && var38 && class362.method3197(method5918(var9))) {
                                field683 = var9;
                            }
                            if (field643 == var9) {
                                field684 = true;
                                field662 = var11;
                                field767 = var12;
                            }
                            if (var9.field3893) {
                                if (var38 && field708 != 0 && var9.field3915 != null) {
                                    class90 var41 = new class90();
                                    var41.field1064 = true;
                                    var41.field1065 = var9;
                                    var41.field1068 = field708;
                                    var41.field1072 = var9.field3915;
                                    field621.method6892(var41);
                                }
                                if (field679 != null || field694) {
                                    var40 = false;
                                    var39 = false;
                                    var38 = false;
                                }
                                if (!var9.field3945 && var40) {
                                    var9.field3945 = true;
                                    if (var9.field3816 != null) {
                                        class90 var42 = new class90();
                                        var42.field1064 = true;
                                        var42.field1065 = var9;
                                        var42.field1066 = class36.field216 - var11;
                                        var42.field1068 = class36.field213 - var12;
                                        var42.field1072 = var9.field3816;
                                        field621.method6892(var42);
                                    }
                                }
                                if (var9.field3945 && var39 && var9.field3799 != null) {
                                    class90 var43 = new class90();
                                    var43.field1064 = true;
                                    var43.field1065 = var9;
                                    var43.field1066 = class36.field204 - var11;
                                    var43.field1068 = class36.field205 - var12;
                                    var43.field1072 = var9.field3799;
                                    field621.method6892(var43);
                                }
                                if (var9.field3945 && !var39) {
                                    var9.field3945 = false;
                                    if (var9.field3878 != null) {
                                        class90 var44 = new class90();
                                        var44.field1064 = true;
                                        var44.field1065 = var9;
                                        var44.field1066 = class36.field204 - var11;
                                        var44.field1068 = class36.field205 - var12;
                                        var44.field1072 = var9.field3878;
                                        field712.method6892(var44);
                                    }
                                }
                                if (var39 && var9.field3898 != null) {
                                    class90 var45 = new class90();
                                    var45.field1064 = true;
                                    var45.field1065 = var9;
                                    var45.field1066 = class36.field204 - var11;
                                    var45.field1068 = class36.field205 - var12;
                                    var45.field1072 = var9.field3898;
                                    field621.method6892(var45);
                                }
                                if (!var9.field3943 && var38) {
                                    var9.field3943 = true;
                                    if (var9.field3827 != null) {
                                        class90 var46 = new class90();
                                        var46.field1064 = true;
                                        var46.field1065 = var9;
                                        var46.field1066 = class36.field204 - var11;
                                        var46.field1068 = class36.field205 - var12;
                                        var46.field1072 = var9.field3827;
                                        field621.method6892(var46);
                                    }
                                }
                                if (var9.field3943 && var38 && var9.field3900 != null) {
                                    class90 var47 = new class90();
                                    var47.field1064 = true;
                                    var47.field1065 = var9;
                                    var47.field1066 = class36.field204 - var11;
                                    var47.field1068 = class36.field205 - var12;
                                    var47.field1072 = var9.field3900;
                                    field621.method6892(var47);
                                }
                                if (var9.field3943 && !var38) {
                                    var9.field3943 = false;
                                    if (var9.field3901 != null) {
                                        class90 var48 = new class90();
                                        var48.field1064 = true;
                                        var48.field1065 = var9;
                                        var48.field1066 = class36.field204 - var11;
                                        var48.field1068 = class36.field205 - var12;
                                        var48.field1072 = var9.field3901;
                                        field712.method6892(var48);
                                    }
                                }
                                if (var9.field3812 != null) {
                                    class90 var49 = new class90();
                                    var49.field1065 = var9;
                                    var49.field1072 = var9.field3812;
                                    field801.method6892(var49);
                                }
                                if (var9.field3906 != null && field693 > var9.field3947) {
                                    if (var9.field3907 == null || field693 - var9.field3947 > 32) {
                                        class90 var54 = new class90();
                                        var54.field1065 = var9;
                                        var54.field1072 = var9.field3906;
                                        field621.method6892(var54);
                                    } else {
                                        label647: for (int var50 = var9.field3947; var50 < field693; var50++) {
                                            int var51 = field746[var50 & 0x1F];
                                            for (int var52 = 0; var52 < var9.field3907.length; var52++) {
                                                if (var9.field3907[var52] == var51) {
                                                    class90 var53 = new class90();
                                                    var53.field1065 = var9;
                                                    var53.field1072 = var9.field3906;
                                                    field621.method6892(var53);
                                                    break label647;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3947 = field693;
                                }
                                if (var9.field3908 != null && field573 > var9.field3948) {
                                    if (var9.field3909 == null || field573 - var9.field3948 > 32) {
                                        class90 var59 = new class90();
                                        var59.field1065 = var9;
                                        var59.field1072 = var9.field3908;
                                        field621.method6892(var59);
                                    } else {
                                        label623: for (int var55 = var9.field3948; var55 < field573; var55++) {
                                            int var56 = field710[var55 & 0x1F];
                                            for (int var57 = 0; var57 < var9.field3909.length; var57++) {
                                                if (var9.field3909[var57] == var56) {
                                                    class90 var58 = new class90();
                                                    var58.field1065 = var9;
                                                    var58.field1072 = var9.field3908;
                                                    field621.method6892(var58);
                                                    break label623;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3948 = field573;
                                }
                                if (var9.field3942 != null && field697 > var9.field3949) {
                                    if (var9.field3895 == null || field697 - var9.field3949 > 32) {
                                        class90 var64 = new class90();
                                        var64.field1065 = var9;
                                        var64.field1072 = var9.field3942;
                                        field621.method6892(var64);
                                    } else {
                                        label599: for (int var60 = var9.field3949; var60 < field697; var60++) {
                                            int var61 = field696[var60 & 0x1F];
                                            for (int var62 = 0; var62 < var9.field3895.length; var62++) {
                                                if (var9.field3895[var62] == var61) {
                                                    class90 var63 = new class90();
                                                    var63.field1065 = var9;
                                                    var63.field1072 = var9.field3942;
                                                    field621.method6892(var63);
                                                    break label599;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3949 = field697;
                                }
                                if (field700 > var9.field3860 && var9.field3904 != null) {
                                    class90 var65 = new class90();
                                    var65.field1065 = var9;
                                    var65.field1072 = var9.field3904;
                                    field621.method6892(var65);
                                }
                                if (field504 > var9.field3860 && var9.field3912 != null) {
                                    class90 var66 = new class90();
                                    var66.field1065 = var9;
                                    var66.field1072 = var9.field3912;
                                    field621.method6892(var66);
                                }
                                if (field702 > var9.field3860 && var9.field3921 != null) {
                                    class90 var67 = new class90();
                                    var67.field1065 = var9;
                                    var67.field1072 = var9.field3921;
                                    field621.method6892(var67);
                                }
                                if (field804 > var9.field3860 && var9.field3922 != null) {
                                    class90 var68 = new class90();
                                    var68.field1065 = var9;
                                    var68.field1072 = var9.field3922;
                                    field621.method6892(var68);
                                }
                                if (field563 > var9.field3860 && var9.field3923 != null) {
                                    class90 var69 = new class90();
                                    var69.field1065 = var9;
                                    var69.field1072 = var9.field3923;
                                    field621.method6892(var69);
                                }
                                if (field752 > var9.field3860 && var9.field3928 != null) {
                                    class90 var70 = new class90();
                                    var70.field1065 = var9;
                                    var70.field1072 = var9.field3928;
                                    field621.method6892(var70);
                                }
                                if (field706 > var9.field3860 && var9.field3929 != null) {
                                    class90 var71 = new class90();
                                    var71.field1065 = var9;
                                    var71.field1072 = var9.field3929;
                                    field621.method6892(var71);
                                }
                                if (field707 > var9.field3860 && var9.field3924 != null) {
                                    class90 var72 = new class90();
                                    var72.field1065 = var9;
                                    var72.field1072 = var9.field3924;
                                    field621.method6892(var72);
                                }
                                var9.field3860 = field691;
                                if (var9.field3917 != null) {
                                    for (int var73 = 0; var73 < field737; var73++) {
                                        class90 var74 = new class90();
                                        var74.field1065 = var9;
                                        var74.field1071 = field652[var73];
                                        var74.field1076 = field738[var73];
                                        var74.field1072 = var9.field3917;
                                        field621.method6892(var74);
                                    }
                                }
                                if (var9.field3918 != null) {
                                    int[] var75 = field748.method4935();
                                    for (int var76 = 0; var76 < var75.length; var76++) {
                                        class90 var77 = new class90();
                                        var77.field1065 = var9;
                                        var77.field1071 = var75[var76];
                                        var77.field1072 = var9.field3918;
                                        field621.method6892(var77);
                                    }
                                }
                                if (var9.field3839 != null) {
                                    int[] var78 = field748.method4942();
                                    for (int var79 = 0; var79 < var78.length; var79++) {
                                        class90 var80 = new class90();
                                        var80.field1065 = var9;
                                        var80.field1071 = var78[var79];
                                        var80.field1072 = var9.field3839;
                                        field621.method6892(var80);
                                    }
                                }
                            }
                        }
                        if (!var9.field3910) {
                            if (field679 != null || field694) {
                                continue;
                            }
                            if ((var9.field3934 >= 0 || var9.field3831 != 0) && class36.field204 >= var19 && class36.field205 >= var20 && class36.field204 < var21 && class36.field205 < var22) {
                                if (var9.field3934 >= 0) {
                                    Statics.field26 = arg0[var9.field3934];
                                } else {
                                    Statics.field26 = var9;
                                }
                            }
                            if (var9.field3828 == 8 && class36.field204 >= var19 && class36.field205 >= var20 && class36.field204 < var21 && class36.field205 < var22) {
                                Statics.field2979 = var9;
                            }
                            if (var9.field3916 > var9.field3820) {
                                method7343(var9, var9.field3819 + var11, var12, var9.field3820, var9.field3916, class36.field204, class36.field205);
                            }
                        }
                        if (var9.field3828 == 0) {
                            method2414(arg0, var9.field3941, var19, var20, var21, var22, var11 - var9.field3825, var12 - var9.field3826);
                            if (var9.field3936 != null) {
                                method2414(var9.field3936, var9.field3941, var19, var20, var21, var22, var11 - var9.field3825, var12 - var9.field3826);
                            }
                            class89 var81 = (class89) field762.method8544((long) var9.field3941);
                            if (var81 != null) {
                                if (var81.field1057 == 0 && class36.field204 >= var19 && class36.field205 >= var20 && class36.field204 < var21 && class36.field205 < var22 && !field694) {
                                    for (class90 var82 = (class90) field621.method6907(); var82 != null; var82 = (class90) field621.method6896()) {
                                        if (var82.field1064) {
                                            var82.method8218();
                                            var82.field1065.field3943 = false;
                                        }
                                    }
                                    if (Statics.field5304 == 0) {
                                        field679 = null;
                                        field643 = null;
                                    }
                                    if (!field694) {
                                        method8128();
                                    }
                                }
                                method2467(var81.field1062, var19, var20, var21, var22, var11, var12);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("cu.ni(II)Z")
    public static boolean method995(int arg0) {
        for (int var1 = 0; var1 < field737; var1++) {
            if (field652[var1] == arg0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("du.nd(III)V")
    public static final void method2468(int arg0, int arg1) {
        if (Statics.field2667.method5980(arg0)) {
            method2702(Statics.field2667.field3709[arg0], arg1);
        }
    }

    @ObfuscatedName("et.no([Lnq;IB)V")
    public static final void method2702(class361[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class361 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field3828 == 0) {
                    if (var3.field3936 != null) {
                        method2702(var3.field3936, arg1);
                    }
                    class89 var4 = (class89) field762.method8544((long) var3.field3941);
                    if (var4 != null) {
                        method2468(var4.field1062, arg1);
                    }
                }
                if (arg1 == 0 && var3.field3925 != null) {
                    class90 var5 = new class90();
                    var5.field1065 = var3;
                    var5.field1072 = var3.field3925;
                    class73.method7183(var5);
                }
                if (arg1 == 1 && var3.field3846 != null) {
                    if (var3.field3876 >= 0) {
                        class361 var6 = Statics.field2667.method5964(var3.field3941);
                        if (var6 == null || var6.field3936 == null || var3.field3876 >= var6.field3936.length || var6.field3936[var3.field3876] != var3) {
                            continue;
                        }
                    }
                    class90 var7 = new class90();
                    var7.field1065 = var3;
                    var7.field1072 = var3.field3846;
                    class73.method7183(var7);
                }
            }
        }
    }

    @ObfuscatedName("kg.nk(Lnq;IIB)V")
    public static final void method4998(class361 arg0, int arg1, int arg2) {
        if (field679 != null || field694 || arg0 == null) {
            return;
        }
        class361 var3 = method6089(arg0);
        if (var3 == null) {
            var3 = arg0.field3920;
        }
        if (var3 == null) {
            return;
        }
        field679 = arg0;
        class361 var5 = method6089(arg0);
        if (var5 == null) {
            var5 = arg0.field3920;
        }
        field643 = var5;
        field681 = arg1;
        field597 = arg2;
        Statics.field5304 = 0;
        field690 = false;
        int var7 = field651.field5519 - 1;
        if (var7 != -1) {
            method3833(var7);
        }
        return;
    }

    @ObfuscatedName("client.ng(B)V")
    public final void method1186() {
        method7116(field679);
        Statics.field5304++;
        if (field605 && field684) {
            int var1 = class36.field204;
            int var2 = class36.field205;
            int var3 = var1 - field681;
            int var4 = var2 - field597;
            if (var3 < field662) {
                var3 = field662;
            }
            if (field679.field3819 + var3 > field662 + field643.field3819) {
                var3 = field662 + field643.field3819 - field679.field3819;
            }
            if (var4 < field767) {
                var4 = field767;
            }
            if (field679.field3820 + var4 > field767 + field643.field3820) {
                var4 = field767 + field643.field3820 - field679.field3820;
            }
            int var5 = var3 - field636;
            int var6 = var4 - field689;
            int var7 = field679.field3889;
            if (Statics.field5304 > field679.field3802 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field690 = true;
            }
            int var8 = field643.field3825 + (var3 - field662);
            int var9 = field643.field3826 + (var4 - field767);
            if (field679.field3902 != null && field690) {
                class90 var10 = new class90();
                var10.field1065 = field679;
                var10.field1066 = var8;
                var10.field1068 = var9;
                var10.field1072 = field679.field3902;
                class73.method7183(var10);
            }
            if (class36.field203 == 0) {
                if (field690) {
                    if (field679.field3858 != null) {
                        class90 var11 = new class90();
                        var11.field1065 = field679;
                        var11.field1066 = var8;
                        var11.field1068 = var9;
                        var11.field1070 = field683;
                        var11.field1072 = field679.field3858;
                        class73.method7183(var11);
                    }
                    if (field683 != null && method6089(field679) != null) {
                        class324 var12 = class324.method4244(class322.field3340, field569.field1458);
                        var12.field3379.method8851(field683.field3941);
                        var12.field3379.method8838(field683.field3876);
                        var12.field3379.method8782(field683.field3939);
                        var12.field3379.method9045(field679.field3941);
                        var12.field3379.method8782(field679.field3939);
                        var12.field3379.method8961(field679.field3876);
                        field569.method2829(var12);
                    }
                } else if (this.method1182()) {
                    this.method1525(field681 + field636, field689 + field597);
                } else if (field651.field5519 > 0) {
                    method824(field681 + field636, field689 + field597);
                }
                field679 = null;
            }
        } else if (Statics.field5304 > 1) {
            if (!field690 && field651.field5519 > 0) {
                int var13 = field681 + field636;
                int var14 = field689 + field597;
                method7768(Statics.field20, var13, var14);
                Statics.field20 = null;
            }
            field679 = null;
        }
    }

    @ObfuscatedName("hs.nn(II)V")
    public static void method3833(int arg0) {
        Statics.field20 = new class76();
        Statics.field20.field895 = field651.field5518[arg0];
        Statics.field20.field890 = field651.field5521[arg0];
        Statics.field20.field891 = field651.field5522[arg0];
        Statics.field20.field896 = field651.field5520[arg0];
        Statics.field20.field893 = field651.field5524[arg0];
        Statics.field20.field894 = field651.field5526[arg0];
        Statics.field20.field889 = field651.field5523[arg0];
        Statics.field20.field892 = field651.field5528[arg0];
    }

    @ObfuscatedName("bk.nf(III)V")
    public static void method824(int arg0, int arg1) {
        method7768(Statics.field20, arg0, arg1);
        Statics.field20 = null;
    }

    @ObfuscatedName("qs.nm(Lnq;I)V")
    public static void method7116(class361 arg0) {
        if (arg0 != null && field687 == arg0.field3888) {
            field717[arg0.field3950] = true;
        }
    }

    @ObfuscatedName("ex.ny(I)V")
    public static void method2872() {
        for (class89 var0 = (class89) field762.method8546(); var0 != null; var0 = (class89) field762.method8539()) {
            int var1 = var0.field1062;
            if (Statics.field2667.method5980(var1)) {
                boolean var2 = true;
                class361[] var3 = Statics.field2667.field3709[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field3910;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field5075;
                    class361 var6 = Statics.field2667.method5964(var5);
                    if (var6 != null) {
                        method7116(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("tv.nv(II)V")
    public static final void method8210(int arg0) {
        if (!Statics.field2667.method5980(arg0)) {
            return;
        }
        class361[] var1 = Statics.field2667.field3709[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class361 var3 = var1[var2];
            if (var3 != null) {
                var3.field3919 = 0;
                var3.field3899 = 0;
            }
        }
    }

    @ObfuscatedName("fw.ne(II)V")
    public static final void method3213(int arg0) {
        if (Statics.field2667.method5980(arg0)) {
            method1081(Statics.field2667.field3709[arg0], -1);
        }
    }

    @ObfuscatedName("cr.nw([Lnq;IB)V")
    public static final void method1081(class361[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class361 var3 = arg0[var2];
            if (var3 != null && var3.field3823 == arg1 && (!var3.field3910 || !Statics.method4484(var3))) {
                if (var3.field3828 == 0) {
                    if (!var3.field3910 && Statics.method4484(var3) && Statics.field26 != var3) {
                        continue;
                    }
                    method1081(arg0, var3.field3941);
                    if (var3.field3936 != null) {
                        method1081(var3.field3936, var3.field3941);
                    }
                    class89 var4 = (class89) field762.method8544((long) var3.field3941);
                    if (var4 != null) {
                        method3213(var4.field1062);
                    }
                }
                if (var3.field3828 == 6) {
                    if (var3.field3852 != -1 || var3.field3853 != -1) {
                        boolean var5 = method2636(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field3853;
                        } else {
                            var6 = var3.field3852;
                        }
                        if (var6 != -1) {
                            class264 var7 = class264.method3551(var6);
                            if (var7.method4915()) {
                                var3.field3919 += field584;
                                int var8 = var7.method4907();
                                if (var3.field3919 >= var8) {
                                    var3.field3919 -= var7.field2876;
                                    if (var3.field3919 < 0 || var3.field3919 >= var8) {
                                        var3.field3919 = 0;
                                    }
                                }
                                method7116(var3);
                            } else {
                                var3.field3899 += field584;
                                while (var3.field3899 > var7.field2874[var3.field3919]) {
                                    var3.field3899 -= var7.field2874[var3.field3919];
                                    var3.field3919++;
                                    if (var3.field3919 >= var7.field2872.length) {
                                        var3.field3919 -= var7.field2876;
                                        if (var3.field3919 < 0 || var3.field3919 >= var7.field2872.length) {
                                            var3.field3919 = 0;
                                        }
                                    }
                                    method7116(var3);
                                }
                            }
                        }
                    }
                    if (var3.field3855 != 0 && !var3.field3910) {
                        int var9 = var3.field3855 >> 16;
                        int var10 = var3.field3855 << 16 >> 16;
                        int var11 = field584 * var9;
                        int var12 = field584 * var10;
                        var3.field3856 = var3.field3856 + var11 & 0x7FF;
                        var3.field3857 = var3.field3857 + var12 & 0x7FF;
                        method7116(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("rf.nx(IB)V")
    public static final void method7816(int arg0) {
        int var1 = Math.max(Math.min(arg0, 100), 0);
        int var2 = 100 - var1;
        float var3 = (float) var2 / 200.0F + 0.5F;
        method422((double) var3);
    }

    @ObfuscatedName("fo.nl(B)I")
    public static final int method3106() {
        float var0 = 200.0F * ((float) Statics.field1385.method2513() - 0.5F);
        return 100 - Math.round(var0);
    }

    @ObfuscatedName("bm.nz(D)V")
    public static final void method422(double arg0) {
        class181.method3439(arg0);
        ((class193) class181.field1943.field2264).method3842(arg0);
        if (Statics.field2389 != null) {
            Statics.field2389.method8346();
        }
        class262.field2793.method5588();
        Statics.field1385.method2599(arg0);
    }

    @ObfuscatedName("kb.nb(IB)V")
    public static final void method5008(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 255);
        if (var1 == Statics.field1385.method2515()) {
            return;
        }
        label22: {
            if (Statics.field1385.method2515() == 0) {
                boolean var2 = !class333.field3566.isEmpty();
                if (var2) {
                    class333.method2917(Statics.field156, var1);
                    field751 = false;
                    break label22;
                }
            }
            if (var1 == 0) {
                Statics.method2347(0, 0);
                field751 = false;
            } else {
                class333.method4513(var1);
            }
        }
        Statics.field1385.method2514(var1);
    }

    @ObfuscatedName("hg.nu(IB)V")
    public static final void method3892(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field1385.method2558(var1);
    }

    @ObfuscatedName("uu.nt(IB)V")
    public static final void method8734(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field1385.method2518(var1);
    }

    @ObfuscatedName("cr.ns(II)V")
    public static final void method1069(int arg0) {
        method2872();
        for (class72 var1 = (class72) class72.field844.method6907(); var1 != null; var1 = (class72) class72.field844.method6896()) {
            if (var1.field831 != null) {
                var1.method1924();
            }
        }
        int var2 = class233.method6826(arg0).field2458;
        if (var2 == 0) {
            return;
        }
        int var3 = class349.field3702[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                method422(0.9D);
            }
            if (var3 == 2) {
                method422(0.8D);
            }
            if (var3 == 3) {
                method422(0.7D);
            }
            if (var3 == 4) {
                method422(0.6D);
            }
        }
        if (var2 == 3) {
            if (var3 == 0) {
                method5008(255);
            }
            if (var3 == 1) {
                method5008(192);
            }
            if (var3 == 2) {
                method5008(128);
            }
            if (var3 == 3) {
                method5008(64);
            }
            if (var3 == 4) {
                method5008(0);
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                method3892(127);
            }
            if (var3 == 1) {
                method3892(96);
            }
            if (var3 == 2) {
                method3892(64);
            }
            if (var3 == 3) {
                method3892(32);
            }
            if (var3 == 4) {
                method3892(0);
            }
        }
        if (var2 == 5) {
            field649 = var3 == 1;
        }
        if (var2 == 6) {
            field572 = var3;
        }
        if (var2 == 9) {
        }
        if (var2 == 10) {
            if (var3 == 0) {
                method8734(127);
            }
            if (var3 == 1) {
                method8734(96);
            }
            if (var3 == 2) {
                method8734(64);
            }
            if (var3 == 3) {
                method8734(32);
            }
            if (var3 == 4) {
                method8734(0);
            }
        }
        if (var2 == 17) {
            field676 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            class107[] var4 = new class107[] { class107.field1372, class107.field1365, class107.field1366, class107.field1367, class107.field1368 };
            field535 = (class107) class403.method3083(var4, var3);
            if (field535 == null) {
                field535 = class107.field1372;
            }
        }
        if (var2 == 19) {
            if (var3 == -1) {
                field644 = -1;
            } else {
                field644 = var3 & 0x7FF;
            }
        }
        if (var2 != 22) {
            return;
        }
        class107[] var5 = new class107[] { class107.field1372, class107.field1365, class107.field1366, class107.field1367, class107.field1368 };
        field650 = (class107) class403.method3083(var5, var3);
        if (field650 == null) {
            field650 = class107.field1372;
        }
    }

    @ObfuscatedName("dn.nj(Lnq;B)V")
    public static final void method2288(class361 arg0) {
        int var1 = arg0.field3808;
        if (var1 == 324) {
            if (field619 == -1) {
                field619 = arg0.field3806;
                field787 = arg0.field3840;
            }
            if (field785.field3745 == 1) {
                arg0.field3806 = field619;
            } else {
                arg0.field3806 = field787;
            }
        } else if (var1 == 325) {
            if (field619 == -1) {
                field619 = arg0.field3806;
                field787 = arg0.field3840;
            }
            if (field785.field3745 == 1) {
                arg0.field3806 = field787;
            } else {
                arg0.field3806 = field619;
            }
        } else if (var1 == 327) {
            arg0.field3856 = 150;
            arg0.field3857 = (int) (Math.sin((double) field519 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3848 = 5;
            arg0.field3849 = 0;
        } else if (var1 == 328) {
            arg0.field3856 = 150;
            arg0.field3857 = (int) (Math.sin((double) field519 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3848 = 5;
            arg0.field3849 = 1;
        }
    }

    @ObfuscatedName("cj.nq(I)V")
    public static final void method1090() {
        class324 var0 = class324.method4244(class322.field3262, field569.field1458);
        field569.method2829(var0);
        class73.field858 = true;
        for (class89 var1 = (class89) field762.method8546(); var1 != null; var1 = (class89) field762.method8539()) {
            if (var1.field1057 == 0 || var1.field1057 == 3) {
                method1078(var1, true);
            }
        }
        if (field672 != null) {
            method7116(field672);
            field672 = null;
        }
        class73.field858 = false;
    }

    @ObfuscatedName("cr.nh(Ldi;ZI)V")
    public static final void method1078(class89 arg0, boolean arg1) {
        int var2 = arg0.field1062;
        int var3 = (int) arg0.field5075;
        arg0.method8218();
        if (arg1) {
            Statics.field2667.method5967(var2);
        }
        for (class505 var4 = (class505) field735.method8546(); var4 != null; var4 = (class505) field735.method8539()) {
            if ((long) var2 == (var4.field5075 >> 48 & 0xFFFFL)) {
                var4.method8218();
            }
        }
        class361 var5 = Statics.field2667.method5964(var3);
        if (var5 != null) {
            method7116(var5);
        }
        if (field667 != -1) {
            method2468(field667, 1);
        }
    }

    @ObfuscatedName("jm.np(Lnq;I)Z")
    public static final boolean method4567(class361 arg0) {
        int var1 = arg0.field3808;
        if (var1 == 205) {
            field570 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field785.method5999(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field785.method6000(var4, var5 == 1);
        }
        if (var1 == 324) {
            field785.method6001(0);
        }
        if (var1 == 325) {
            field785.method6001(1);
        }
        if (var1 == 326) {
            class324 var6 = class324.method4244(class547.field5372 >= 224 ? class322.field3357 : class322.field3349, field569.field1458);
            field785.method6032(var6.field3379);
            field569.method2829(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("kf.oc(Lnq;IIIB)V")
    public static final void method4932(class361 arg0, int arg1, int arg2, int arg3) {
        method3185();
        class348 var4 = arg0.method6368(Statics.field2667, false);
        if (var4 == null) {
            return;
        }
        class559.method9119(arg1, arg2, var4.field3697 + arg1, var4.field3695 + arg2);
        if (field750 == 2 || field750 == 5) {
            class559.method9135(arg1, arg2, 0, var4.field3694, var4.field3696);
        } else {
            int var5 = field592 & 0x7FF;
            int var6 = 48 + Statics.field3728.method1152() / 32;
            int var7 = 464 - Statics.field3728.method1156() / 32;
            Statics.field1097.method9271(arg1, arg2, var4.field3697, var4.field3695, var6, var7, var5, 256, var4.field3694, var4.field3696);
            for (int var8 = 0; var8 < field744; var8++) {
                int var9 = field745[var8] * 4 + 2 - Statics.field3728.method1152() / 32;
                int var10 = field695[var8] * 4 + 2 - Statics.field3728.method1156() / 32;
                method2898(arg1, arg2, var9, var10, field567[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class408 var13 = Statics.field4799.field1324[Statics.field4799.field1308][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field3728.method1152() / 32;
                        int var15 = var12 * 4 + 2 - Statics.field3728.method1156() / 32;
                        method2898(arg1, arg2, var14, var15, Statics.field2961[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < Statics.field4799.field1316; var16++) {
                class104 var17 = Statics.field4799.field1318[Statics.field4799.field1320[var16]];
                if (var17 != null && var17.method2367()) {
                    class246 var18 = var17.field1340;
                    if (var18 != null && var18.field2582 != null) {
                        var18 = var18.method4522();
                    }
                    if (var18 != null && var18.field2594 && var18.field2605) {
                        int var19 = var17.field1249 / 32 - Statics.field3728.method1152() / 32;
                        int var20 = var17.field1180 / 32 - Statics.field3728.method1156() / 32;
                        method2898(arg1, arg2, var19, var20, Statics.field2961[1], var4);
                    }
                }
            }
            int var21 = Statics.field4799.field1322.field1399;
            int[] var22 = Statics.field4799.field1322.field1401;
            for (int var23 = 0; var23 < var21; var23++) {
                class94 var24 = Statics.field4799.field1317[var22[var23]];
                if (var24 != null && var24.method2367() && !var24.field1131 && Statics.field2672 != var24) {
                    int var25 = var24.field1249 / 32 - Statics.field3728.method1152() / 32;
                    int var26 = var24.field1180 / 32 - Statics.field3728.method1156() / 32;
                    if (var24.method2354()) {
                        method2898(arg1, arg2, var25, var26, Statics.field2961[3], var4);
                    } else if (Statics.field2672.field1120 != 0 && var24.field1120 != 0 && Statics.field2672.field1120 == var24.field1120) {
                        method2898(arg1, arg2, var25, var26, Statics.field2961[4], var4);
                    } else if (var24.method2363()) {
                        method2898(arg1, arg2, var25, var26, Statics.field2961[5], var4);
                    } else if (var24.method2378()) {
                        method2898(arg1, arg2, var25, var26, Statics.field2961[6], var4);
                    } else {
                        method2898(arg1, arg2, var25, var26, Statics.field2961[2], var4);
                    }
                }
            }
            if (field527 != 0 && field519 % 20 < 10) {
                if (field527 == 1 && field528 >= 0 && field528 < Statics.field4799.field1318.length) {
                    class104 var27 = Statics.field4799.field1318[field528];
                    if (var27 != null) {
                        int var28 = var27.field1249 / 32 - Statics.field3728.method1152() / 32;
                        int var29 = var27.field1180 / 32 - Statics.field3728.method1156() / 32;
                        method2322(arg1, arg2, var28, var29, Statics.field1386[1], var4);
                    }
                }
                if (field527 == 2) {
                    int var30 = field640 * 4 - Statics.field4799.field1311 * 4 + 2 - Statics.field3728.method1152() / 32;
                    int var31 = field531 * 4 - Statics.field4799.field1319 * 4 + 2 - Statics.field3728.method1156() / 32;
                    method2322(arg1, arg2, var30, var31, Statics.field1386[1], var4);
                }
                if (field527 == 10 && field529 >= 0 && field529 < Statics.field4799.field1317.length) {
                    class94 var32 = Statics.field4799.field1317[field529];
                    if (var32 != null) {
                        int var33 = var32.field1249 / 32 - Statics.field3728.method1152() / 32;
                        int var34 = var32.field1180 / 32 - Statics.field3728.method1156() / 32;
                        method2322(arg1, arg2, var33, var34, Statics.field1386[1], var4);
                    }
                }
            }
            if (field542 != 0) {
                int var35 = field542 * 4 + 2 - Statics.field3728.method1152() / 32;
                int var36 = field739 * 4 + 2 - Statics.field3728.method1156() / 32;
                method2898(arg1, arg2, var35, var36, Statics.field1386[0], var4);
            }
            if (!Statics.field2672.field1131) {
                class559.method9145(var4.field3697 / 2 + arg1 - 1, var4.field3695 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field686[arg3] = true;
    }

    @ObfuscatedName("ca.om(Lnq;IIII)V")
    public static final void method2175(class361 arg0, int arg1, int arg2, int arg3) {
        class348 var4 = arg0.method6368(Statics.field2667, false);
        if (var4 == null) {
            return;
        }
        if (field750 < 3) {
            Statics.field3672.method9271(arg1, arg2, var4.field3697, var4.field3695, 25, 25, field592, 256, var4.field3694, var4.field3696);
        } else {
            class559.method9135(arg1, arg2, 0, var4.field3694, var4.field3696);
        }
    }

    @ObfuscatedName("di.oe(IIIILvc;Lnm;I)V")
    public static final void method2322(int arg0, int arg1, int arg2, int arg3, class563 arg4, class348 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method2898(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field592 & 0x7FF;
        int var8 = class181.field1941[var7];
        int var9 = class181.field1942[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field3697 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field2362.method9265(arg5.field3697 / 2 + arg0 - var17 / 2 + var15, arg5.field3695 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("ee.og(IIIILvc;Lnm;I)V")
    public static final void method2898(int arg0, int arg1, int arg2, int arg3, class563 arg4, class348 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field592 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class181.field1941[var6];
        int var9 = class181.field1942[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method9330(arg5.field3697 / 2 + var10 - arg4.field5477 / 2, arg5.field3695 / 2 - var11 - arg4.field5483 / 2, arg0, arg1, arg5.field3697, arg5.field3695, arg5.field3694, arg5.field3696);
        } else {
            arg4.method9284(arg5.field3697 / 2 + arg0 + var10 - arg4.field5477 / 2, arg5.field3695 / 2 + arg1 - var11 - arg4.field5483 / 2);
        }
    }

    @ObfuscatedName("cl.ol(I)V")
    public static final void method1042() {
        class114.method2286();
        if (Statics.field70 != null) {
            Statics.field70.method7878();
        }
    }

    @ObfuscatedName("hx.ox(I)V")
    public static final void method3827() {
        for (int var0 = 0; var0 < Statics.field4799.field1322.field1399; var0++) {
            class94 var1 = Statics.field4799.field1317[Statics.field4799.field1322.field1401[var0]];
            var1.method2353();
        }
    }

    @ObfuscatedName("dx.os(I)V")
    public static final void method2301() {
        field702 = field691;
        Statics.field72 = true;
    }

    @ObfuscatedName("fc.ou(I)V")
    public static final void method3162() {
        field804 = field691;
        Statics.field3125 = true;
    }

    @ObfuscatedName("fo.ok(Ljava/lang/String;B)V")
    public static final void method3105(String arg0) {
        if (Statics.field70 != null) {
            class324 var1 = class324.method4244(class322.field3329, field569.field1458);
            var1.field3379.method8781(class549.method8571(arg0));
            var1.field3379.method8869(arg0);
            field569.method2829(var1);
        }
    }

    @ObfuscatedName("ea.oz(Ljava/lang/String;B)V")
    public static final void method2967(String arg0) {
        if (!arg0.equals("")) {
            class324 var1 = class324.method4244(class322.field3336, field569.field1458);
            var1.field3379.method8781(class549.method8571(arg0));
            var1.field3379.method8869(arg0);
            field569.method2829(var1);
        }
    }

    @ObfuscatedName("bp.ot(I)V")
    public static final void method668() {
        class324 var0 = class324.method4244(class322.field3336, field569.field1458);
        var0.field3379.method8781(0);
        field569.method2829(var0);
    }

    @ObfuscatedName("js.oi(III)V")
    public static final void method4423(int arg0, int arg1) {
        class169 var2 = arg0 >= 0 ? field608[arg0] : Statics.field312;
        if (var2 == null || arg1 < 0 || arg1 >= var2.method3308()) {
            return;
        }
        class151 var3 = (class151) var2.field1802.get(arg1);
        if (var3.field1684 != -1) {
            return;
        }
        String var4 = var3.field1682.method9470();
        class324 var5 = class324.method4244(class322.field3344, field569.field1458);
        var5.field3379.method8781(3 + class549.method8571(var4));
        var5.field3379.method8781(arg0);
        var5.field3379.method8782(arg1);
        var5.field3379.method8869(var4);
        field569.method2829(var5);
    }

    @ObfuscatedName("gr.od(III)V")
    public static final void method3331(int arg0, int arg1) {
        if (field608[arg0] == null || arg1 < 0 || arg1 >= field608[arg0].method3308()) {
            return;
        }
        class151 var2 = (class151) field608[arg0].field1802.get(arg1);
        if (var2.field1684 != -1) {
            return;
        }
        class324 var3 = class324.method4244(class322.field3315, field569.field1458);
        var3.field3379.method8781(3 + class549.method8571(var2.field1682.method9470()));
        var3.field3379.method8781(arg0);
        var3.field3379.method8782(arg1);
        var3.field3379.method8869(var2.field1682.method9470());
        field569.method2829(var3);
    }

    @ObfuscatedName("oy.ov(IIZB)V")
    public static final void method6575(int arg0, int arg1, boolean arg2) {
        if (field608[arg0] == null || arg1 < 0 || arg1 >= field608[arg0].method3308()) {
            return;
        }
        class151 var3 = (class151) field608[arg0].field1802.get(arg1);
        class324 var4 = class324.method4244(class322.field3291, field569.field1458);
        var4.field3379.method8781(4 + class549.method8571(var3.field1682.method9470()));
        var4.field3379.method8781(arg0);
        var4.field3379.method8782(arg1);
        var4.field3379.method8832(arg2);
        var4.field3379.method8869(var3.field1682.method9470());
        field569.method2829(var4);
    }

    @ObfuscatedName("nm.oa(Lnq;I)I")
    public static int method5918(class361 arg0) {
        class505 var1 = (class505) field735.method8544(((long) arg0.field3941 << 32) + (long) arg0.field3876);
        return var1 == null ? arg0.field3865 : var1.field5073;
    }

    @ObfuscatedName("ns.oy(Lnq;I)Lnq;")
    public static class361 method6089(class361 arg0) {
        int var1 = Statics.method3163(method5918(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = Statics.field2667.method5964(arg0.field3823);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("df.oo(Lnq;IB)Ljava/lang/String;")
    public static String method2287(class361 arg0, int arg1) {
        int var2 = method5918(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field3913 == null) {
            return null;
        } else if (arg0.field3797 == null || arg0.field3797.length <= arg1 || arg0.field3797[arg1] == null || arg0.field3797[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field3797[arg1];
        }
    }

    @ObfuscatedName("aa.oh(Lnq;B)Ljava/lang/String;")
    public static String method181(class361 arg0) {
        if (Statics.method4373(method5918(arg0)) == 0) {
            return null;
        } else if (arg0.field3892 == null || arg0.field3892.trim().length() == 0) {
            return null;
        } else {
            return arg0.field3892;
        }
    }

    @ObfuscatedName("mn.oq(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method5631(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field505 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field505 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field505 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field505 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field505 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field4741 != null) {
            var3 = "/p=" + Statics.field4741;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + Statics.field62 + "/a=" + Statics.field3254 + var3 + "/";
    }

    @ObfuscatedName("ir.oj(Ljava/lang/String;B)V")
    public static void method4374(String arg0) {
        Statics.field4741 = arg0;
        try {
            String var1 = Statics.field997.getParameter(Integer.toString(18));
            String var2 = Statics.field997.getParameter(Integer.toString(13));
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                String var5 = var3 + "; Expires=";
                long var6 = class329.method5009() + 94608000000L;
                class366.field3974.setTime(new Date(var6));
                int var8 = class366.field3974.get(7);
                int var9 = class366.field3974.get(5);
                int var10 = class366.field3974.get(2);
                int var11 = class366.field3974.get(1);
                int var12 = class366.field3974.get(11);
                int var13 = class366.field3974.get(12);
                int var14 = class366.field3974.get(13);
                String var15 = class366.field3972[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + class366.field3976[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT";
                var4 = var5 + var15 + "; Max-Age=" + 94608000L;
            }
            class27.method354(Statics.field997, "document.cookie=\"" + var4 + "\"");
        } catch (Throwable var17) {
        }
    }

    @ObfuscatedName("ki.op(Ljava/lang/String;ZB)V")
    public static void method4864(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field2790; var5++) {
            class262 var6 = class262.method2385(var5);
            if ((!arg1 || var6.field2843) && var6.field2811 == -1 && var6.field2796.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field1775 = -1;
                    Statics.field3220 = null;
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
        Statics.field3220 = var3;
        Statics.field2696 = 0;
        Statics.field1775 = var4;
        String[] var9 = new String[Statics.field1775];
        for (int var10 = 0; var10 < Statics.field1775; var10++) {
            var9[var10] = class262.method2385(var3[var10]).field2796;
        }
        short[] var11 = Statics.field3220;
        class543.method7139(var9, var11, 0, var9.length - 1);
    }

    @ObfuscatedName("iv.on([BII)V")
    public static void method4384(byte[] arg0, int arg1) {
        if (field566 == null) {
            field566 = new byte[24];
        }
        class449.method7708(arg0, arg1, field566, 0, 24);
    }

    @ObfuscatedName("kt.ob(Lvg;IB)V")
    public static void method4763(class549 arg0, int arg1) {
        method4384(arg0.field5381, arg1);
        if (class215.field2355 == null) {
            return;
        }
        try {
            class215.field2355.method8597(0L);
            class215.field2355.method8611(arg0.field5381, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bj.or(Lvg;I)V")
    public static void method398(class549 arg0) {
        if (field566 == null) {
            byte[] var1 = class215.method5077();
            arg0.method8790(var1, 0, var1.length);
        } else {
            arg0.method8790(field566, 0, field566.length);
        }
    }

    @ObfuscatedName("client.pb(I)Lvf;")
    public class572 method1187() {
        return Statics.field2672 == null ? null : Statics.field2672.field1138;
    }

    @ObfuscatedName("gf.pq(IIIZB)V")
    public static void method3427(int arg0, int arg1, int arg2, boolean arg3) {
        class324 var4 = class324.method4244(class322.field3305, field569.field1458);
        var4.field3379.method8838(arg1);
        var4.field3379.method8782(arg0);
        var4.field3379.method8852(arg3 ? field604 : 0);
        var4.field3379.method8966(arg2);
        field569.method2829(var4);
    }

    @ObfuscatedName("ke.pd(I)Z")
    public static boolean method5070() {
        return field675 >= 2;
    }

    @ObfuscatedName("fz.pj(II)V")
    public static void method3111(int arg0) {
        field704 = arg0;
    }

    @ObfuscatedName("ag.pt(I)V")
    public static void method242() {
        field569.method2829(class324.method4244(class322.field3345, field569.field1458));
        field704 = 0;
    }

    @ObfuscatedName("bp.ph(I)V")
    public static void method671() {
        if (field704 == 1) {
            field633 = true;
        }
    }

    @ObfuscatedName("cj.px(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method1092(String arg0) {
        class383[] var1 = class383.method5910();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class383 var3 = var1[var2];
            if (var3.field4432 != -1 && arg0.startsWith(class105.method3198(var3.field4432))) {
                arg0 = arg0.substring(6 + Integer.toString(var3.field4432).length());
                break;
            }
        }
        return arg0;
    }

    @ObfuscatedName("iw.pc(B)V")
    public static void method4347() {
        if (Statics.field1623 == null) {
            return;
        }
        field795 = field519;
        Statics.field1623.method6846();
        for (int var0 = 0; var0 < Statics.field4799.field1317.length; var0++) {
            if (Statics.field4799.field1317[var0] != null) {
                Statics.field1623.method6839((Statics.field4799.field1317[var0].field1249 >> 7) + Statics.field4799.field1311, (Statics.field4799.field1317[var0].field1180 >> 7) + Statics.field4799.field1319);
            }
        }
    }

    @ObfuscatedName("dn.pp(I)Z")
    public static boolean method2289() {
        return Statics.field1385.method2519() >= field571;
    }

    @ObfuscatedName("ai.pi(B)V")
    public static void method293() {
        Statics.field1385.method2511(field571);
    }

    @ObfuscatedName("ba.pn(Lce;B)V")
    public static void method792(class69 arg0) {
        if (Statics.field157 != arg0) {
            Statics.field157 = arg0;
        }
    }

    @ObfuscatedName("bp.py(ZI)V")
    public static void method669(boolean arg0) {
        field649 = arg0;
    }

    @ObfuscatedName("da.pe(IB)Lub;")
    public static class540 method2192(int arg0) {
        class540 var1 = (class540) field792.method5586((long) arg0);
        if (var1 == null) {
            var1 = new class540(Statics.field2638, class542.method8269(arg0), class542.method4377(arg0));
            field792.method5589(var1, (long) arg0);
        }
        return var1;
    }

    @ObfuscatedName("lq.ps(II)V")
    public static void method5478(int arg0) {
        class264 var1 = class264.method3551(arg0);
        if (!var1.method4915()) {
            return;
        }
        int var2 = var1.field2879;
        class143 var3 = class264.method5976(var2);
        int var4;
        if (var3 == null) {
            var4 = 2;
        } else {
            var4 = var3.method3144() ? 0 : 1;
        }
        if (var4 == 2) {
            field796.add(var1.field2879);
        }
    }

    @ObfuscatedName("jd.pv(B)V")
    public static void method4471() {
        for (int var0 = 0; var0 < field796.size(); var0++) {
            int var1 = (Integer) field796.get(var0);
            class143 var2 = class264.method5976(var1);
            int var3;
            if (var2 == null) {
                var3 = 2;
            } else {
                var3 = var2.method3144() ? 0 : 1;
            }
            if (var3 != 2) {
                field796.remove(var0);
                var0--;
            }
        }
    }

    @ObfuscatedName("ay.pw(B)Lor;")
    public static class390 method9() {
        return Statics.field981;
    }

    @ObfuscatedName("client.pr(II)V")
    public void method1188(int arg0) {
        class324 var2 = class324.method4244(class322.field3355, field569.field1458);
        var2.field3379.method8781(arg0);
        field569.method2829(var2);
    }

    @ObfuscatedName("client.pu(IB)V")
    public void method1326(int arg0) {
        class324 var2 = class324.method4244(class322.field3304, field569.field1458);
        var2.field3379.method8781(arg0);
        field569.method2829(var2);
    }
}

package deob;

import com.jagex.oldscape.pub.OAuthApi;
import com.jagex.oldscape.pub.OtlTokenRequester;
import com.jagex.oldscape.pub.OtlTokenResponse;
import com.jagex.oldscape.pub.RefreshAccessTokenRequester;
import com.jagex.oldscape.pub.RefreshAccessTokenResponse;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.Future;
import netscape.javascript.JSObject;

public final class client extends class36 implements class388, OAuthApi {

    @ObfuscatedName("client.w")
    public static class203[] field577;

    @ObfuscatedName("client.bh")
    public static boolean field675 = true;

    @ObfuscatedName("client.be")
    public static int field683 = 1;

    @ObfuscatedName("client.bf")
    public static int field596 = 0;

    @ObfuscatedName("client.by")
    public static int field509 = 0;

    @ObfuscatedName("client.bc")
    public static boolean field510 = false;

    @ObfuscatedName("client.bl")
    public static boolean field562 = false;

    @ObfuscatedName("client.bi")
    public static int field512 = -1;

    @ObfuscatedName("client.br")
    public static int field603 = -1;

    @ObfuscatedName("client.bq")
    public static int field699 = -1;

    @ObfuscatedName("client.bn")
    public static boolean field749 = false;

    @ObfuscatedName("client.ba")
    public static int field516 = 210;

    @ObfuscatedName("client.cc")
    public static int field517 = 0;

    @ObfuscatedName("client.dn")
    public static boolean field518 = true;

    @ObfuscatedName("client.da")
    public static int field519 = 0;

    @ObfuscatedName("client.de")
    public static long field739 = 1L;

    @ObfuscatedName("client.dw")
    public static int field521 = -1;

    @ObfuscatedName("client.dm")
    public static int field553 = -1;

    @ObfuscatedName("client.dv")
    public static long field523 = -1L;

    @ObfuscatedName("client.ds")
    public static boolean field586 = true;

    @ObfuscatedName("client.dc")
    public static int field525 = 0;

    @ObfuscatedName("client.dk")
    public static int field526 = 0;

    @ObfuscatedName("client.df")
    public static int field527 = 0;

    @ObfuscatedName("client.dy")
    public static int field595 = 0;

    @ObfuscatedName("client.dx")
    public static int field529 = 0;

    @ObfuscatedName("client.dr")
    public static int field570 = 0;

    @ObfuscatedName("client.dd")
    public static int field531 = 0;

    @ObfuscatedName("client.dg")
    public static int field532 = 0;

    @ObfuscatedName("client.dq")
    public static int field627 = 0;

    @ObfuscatedName("client.dt")
    public static class100 field534 = class100.field1346;

    @ObfuscatedName("client.dp")
    public static class100 field755 = class100.field1346;

    @ObfuscatedName("client.eh")
    public static int field536 = 0;

    @ObfuscatedName("client.ee")
    public static int field537 = 0;

    @ObfuscatedName("client.em")
    public static int field538 = 0;

    @ObfuscatedName("client.fr")
    public static int field539 = 0;

    @ObfuscatedName("client.fp")
    public static int field508 = 0;

    @ObfuscatedName("client.fg")
    public static int field649 = 0;

    @ObfuscatedName("client.ff")
    public static int field542 = 0;

    @ObfuscatedName("client.ft")
    public static int field528 = 0;

    @ObfuscatedName("client.fs")
    public static class133 field541 = class133.field1626;

    @ObfuscatedName("client.fh")
    public static class472 field641 = class472.field4977;

    @ObfuscatedName("client.fj")
    public String field782;

    @ObfuscatedName("client.fw")
    public class15 field547;

    @ObfuscatedName("client.gf")
    public class20 field548;

    @ObfuscatedName("client.go")
    public OtlTokenRequester field549;

    @ObfuscatedName("client.gj")
    public Future field550;

    @ObfuscatedName("client.gp")
    public boolean field591 = false;

    @ObfuscatedName("client.gz")
    public class20 field655;

    @ObfuscatedName("client.gl")
    public RefreshAccessTokenRequester field667;

    @ObfuscatedName("client.gq")
    public Future field624;

    @ObfuscatedName("client.gh")
    public static final String field555;

    @ObfuscatedName("client.gr")
    public static boolean field556;

    @ObfuscatedName("client.gk")
    public static class75 field557;

    @ObfuscatedName("client.gt")
    public class467 field558;

    @ObfuscatedName("client.gc")
    public class8 field574;

    @ObfuscatedName("client.gw")
    public long field560 = -1L;

    @ObfuscatedName("client.gg")
    public static byte[] field561;

    @ObfuscatedName("client.gi")
    public static class97[] field753;

    @ObfuscatedName("client.hs")
    public static int field563;

    @ObfuscatedName("client.hx")
    public static int[] field719;

    @ObfuscatedName("client.ho")
    public static int field565;

    @ObfuscatedName("client.he")
    public static int[] field566;

    @ObfuscatedName("client.hn")
    public static final class108 field567;

    @ObfuscatedName("client.hf")
    public static int field568;

    @ObfuscatedName("client.hr")
    public static boolean field569;

    @ObfuscatedName("client.hz")
    public static class378 field513;

    @ObfuscatedName("client.hg")
    public static HashMap field571;

    @ObfuscatedName("client.hp")
    public static int field602;

    @ObfuscatedName("client.hd")
    public static int field756;

    @ObfuscatedName("client.hu")
    public static int field787;

    @ObfuscatedName("client.iq")
    public static int field575;

    @ObfuscatedName("client.ip")
    public static int field659;

    @ObfuscatedName("client.it")
    public static String field771;

    @ObfuscatedName("client.ia")
    public static boolean field578;

    @ObfuscatedName("client.im")
    public static int[][][] field579;

    @ObfuscatedName("client.in")
    public static final int[] field580;

    @ObfuscatedName("client.ii")
    public static int field564;

    @ObfuscatedName("client.jm")
    public static int field720;

    @ObfuscatedName("client.jl")
    public static int field652;

    @ObfuscatedName("client.jq")
    public static int field533;

    @ObfuscatedName("client.jj")
    public static int field585;

    @ObfuscatedName("client.jt")
    public static boolean field690;

    @ObfuscatedName("client.jv")
    public static int field587;

    @ObfuscatedName("client.jn")
    public static int field588;

    @ObfuscatedName("client.jx")
    public static int field589;

    @ObfuscatedName("client.jf")
    public static int field590;

    @ObfuscatedName("client.jh")
    public static int field664;

    @ObfuscatedName("client.jo")
    public static int field592;

    @ObfuscatedName("client.jg")
    public static int field593;

    @ObfuscatedName("client.jc")
    public static int field594;

    @ObfuscatedName("client.ja")
    public static int field750;

    @ObfuscatedName("client.ka")
    public static int field639;

    @ObfuscatedName("client.km")
    public static int field597;

    @ObfuscatedName("client.kl")
    public static int field598;

    @ObfuscatedName("client.kc")
    public static int field661;

    @ObfuscatedName("client.kx")
    public static int field600;

    @ObfuscatedName("client.ke")
    public static int field790;

    @ObfuscatedName("client.kv")
    public static boolean field530;

    @ObfuscatedName("client.ks")
    public static int field808;

    @ObfuscatedName("client.ky")
    public static boolean field604;

    @ObfuscatedName("client.kr")
    public static int field605;

    @ObfuscatedName("client.kb")
    public static int field762;

    @ObfuscatedName("client.kp")
    public static int field607;

    @ObfuscatedName("client.ku")
    public static int[] field608;

    @ObfuscatedName("client.kt")
    public static int[] field609;

    @ObfuscatedName("client.ko")
    public static int[] field610;

    @ObfuscatedName("client.ki")
    public static int[] field795;

    @ObfuscatedName("client.kz")
    public static int[] field612;

    @ObfuscatedName("client.kd")
    public static int[] field613;

    @ObfuscatedName("client.kf")
    public static int[] field703;

    @ObfuscatedName("client.kq")
    public static String[] field606;

    @ObfuscatedName("client.kk")
    public static int[][] field616;

    @ObfuscatedName("client.kw")
    public static int field617;

    @ObfuscatedName("client.kj")
    public static int field724;

    @ObfuscatedName("client.kh")
    public static int field545;

    @ObfuscatedName("client.lb")
    public static int field582;

    @ObfuscatedName("client.lc")
    public static int field515;

    @ObfuscatedName("client.ll")
    public static int field601;

    @ObfuscatedName("client.lk")
    public static int field623;

    @ObfuscatedName("client.lu")
    public static boolean field540;

    @ObfuscatedName("client.lg")
    public static int field625;

    @ObfuscatedName("client.ls")
    public static int field626;

    @ObfuscatedName("client.lm")
    public static int field619;

    @ObfuscatedName("client.lh")
    public static int field628;

    @ObfuscatedName("client.lj")
    public static int field629;

    @ObfuscatedName("client.li")
    public static int field799;

    @ObfuscatedName("client.le")
    public static boolean field631;

    @ObfuscatedName("client.lq")
    public static int field632;

    @ObfuscatedName("client.lt")
    public static int field692;

    @ObfuscatedName("client.ln")
    public static boolean field634;

    @ObfuscatedName("client.ly")
    public static class89[] field635;

    @ObfuscatedName("client.lr")
    public static int field636;

    @ObfuscatedName("client.lx")
    public static int field693;

    @ObfuscatedName("client.la")
    public static long field638;

    @ObfuscatedName("client.mn")
    public static boolean field546;

    @ObfuscatedName("client.ms")
    public static int field737;

    @ObfuscatedName("client.mk")
    public static int field780;

    @ObfuscatedName("client.me")
    public static int[] field642;

    @ObfuscatedName("client.mb")
    public static final int[] field643;

    @ObfuscatedName("client.mr")
    public static String[] field644;

    @ObfuscatedName("client.mi")
    public static boolean[] field645;

    @ObfuscatedName("client.md")
    public static int[] field646;

    @ObfuscatedName("client.mq")
    public static int field647;

    @ObfuscatedName("client.mu")
    public static class352[][][] field648;

    @ObfuscatedName("client.mv")
    public static class352 field738;

    @ObfuscatedName("client.ma")
    public static class352 field650;

    @ObfuscatedName("client.mo")
    public static class352 field640;

    @ObfuscatedName("client.mm")
    public static int[] field581;

    @ObfuscatedName("client.mj")
    public static int[] field653;

    @ObfuscatedName("client.my")
    public static int[] field654;

    @ObfuscatedName("client.mp")
    public static boolean field599;

    @ObfuscatedName("client.mc")
    public static boolean field656;

    @ObfuscatedName("client.nm")
    public static int field657;

    @ObfuscatedName("client.nv")
    public static int[] field658;

    @ObfuscatedName("client.nu")
    public static int[] field651;

    @ObfuscatedName("client.ny")
    public static int[] field751;

    @ObfuscatedName("client.np")
    public static int[] field621;

    @ObfuscatedName("client.ne")
    public static int[] field662;

    @ObfuscatedName("client.na")
    public static String[] field663;

    @ObfuscatedName("client.nl")
    public static String[] field544;

    @ObfuscatedName("client.nk")
    public static boolean[] field665;

    @ObfuscatedName("client.nf")
    public static boolean field666;

    @ObfuscatedName("client.nh")
    public static boolean field672;

    @ObfuscatedName("client.nr")
    public static boolean field668;

    @ObfuscatedName("client.nd")
    public static boolean field669;

    @ObfuscatedName("client.no")
    public static int field670;

    @ObfuscatedName("client.nq")
    public static int field671;

    @ObfuscatedName("client.nz")
    public static int field554;

    @ObfuscatedName("client.nj")
    public static int field522;

    @ObfuscatedName("client.nn")
    public static int field674;

    @ObfuscatedName("client.nc")
    public static boolean field676;

    @ObfuscatedName("client.oy")
    public static int field677;

    @ObfuscatedName("client.og")
    public static int field678;

    @ObfuscatedName("client.os")
    public static String field679;

    @ObfuscatedName("client.od")
    public static String field798;

    @ObfuscatedName("client.oq")
    public static int field681;

    @ObfuscatedName("client.oa")
    public static class444 field682;

    @ObfuscatedName("client.ox")
    public static int field792;

    @ObfuscatedName("client.oi")
    public static int field684;

    @ObfuscatedName("client.oo")
    public static int field685;

    @ObfuscatedName("client.on")
    public static int field686;

    @ObfuscatedName("client.ok")
    public static class306 field687;

    @ObfuscatedName("client.of")
    public static int field630;

    @ObfuscatedName("client.ow")
    public static int field689;

    @ObfuscatedName("client.op")
    public static int field769;

    @ObfuscatedName("client.oj")
    public static int field701;

    @ObfuscatedName("client.oc")
    public static boolean field729;

    @ObfuscatedName("client.oz")
    public static class306 field770;

    @ObfuscatedName("client.om")
    public static class306 field694;

    @ObfuscatedName("client.ob")
    public static class306 field695;

    @ObfuscatedName("client.or")
    public static int field696;

    @ObfuscatedName("client.pe")
    public static int field697;

    @ObfuscatedName("client.pv")
    public static class306 field698;

    @ObfuscatedName("client.pa")
    public static boolean field746;

    @ObfuscatedName("client.ps")
    public static int field700;

    @ObfuscatedName("client.ph")
    public static int field614;

    @ObfuscatedName("client.pu")
    public static boolean field702;

    @ObfuscatedName("client.pf")
    public static int field520;

    @ObfuscatedName("client.pn")
    public static int field704;

    @ObfuscatedName("client.px")
    public static boolean field705;

    @ObfuscatedName("client.po")
    public static int field706;

    @ObfuscatedName("client.pl")
    public static int[] field707;

    @ObfuscatedName("client.pq")
    public static int field708;

    @ObfuscatedName("client.pk")
    public static int[] field709;

    @ObfuscatedName("client.pd")
    public static int field710;

    @ObfuscatedName("client.pc")
    public static int[] field637;

    @ObfuscatedName("client.pb")
    public static int field712;

    @ObfuscatedName("client.pz")
    public static int[] field713;

    @ObfuscatedName("client.pt")
    public static int field714;

    @ObfuscatedName("client.pg")
    public static int field715;

    @ObfuscatedName("client.pi")
    public static int field716;

    @ObfuscatedName("client.ql")
    public static int field611;

    @ObfuscatedName("client.qp")
    public static int field718;

    @ObfuscatedName("client.qn")
    public static int field514;

    @ObfuscatedName("client.qc")
    public static int field778;

    @ObfuscatedName("client.qi")
    public static int field721;

    @ObfuscatedName("client.qt")
    public static int field722;

    @ObfuscatedName("client.qd")
    public static int field615;

    @ObfuscatedName("client.qj")
    public static class485 field506;

    @ObfuscatedName("client.qh")
    public static class352 field583;

    @ObfuscatedName("client.qr")
    public static class352 field726;

    @ObfuscatedName("client.qg")
    public static class352 field727;

    @ObfuscatedName("client.qo")
    public static class352 field728;

    @ObfuscatedName("client.qs")
    public static class444 field559;

    @ObfuscatedName("client.qm")
    public static int field730;

    @ObfuscatedName("client.qb")
    public static int field809;

    @ObfuscatedName("client.qw")
    public static boolean[] field732;

    @ObfuscatedName("client.qe")
    public static boolean[] field733;

    @ObfuscatedName("client.qx")
    public static boolean[] field734;

    @ObfuscatedName("client.qy")
    public static int[] field735;

    @ObfuscatedName("client.qz")
    public static int[] field736;

    @ObfuscatedName("client.rf")
    public static int[] field723;

    @ObfuscatedName("client.rq")
    public static int[] field535;

    @ObfuscatedName("client.rk")
    public static int field763;

    @ObfuscatedName("client.rh")
    public static long field740;

    @ObfuscatedName("client.rl")
    public static boolean field741;

    @ObfuscatedName("client.ra")
    public static int[] field742;

    @ObfuscatedName("client.rx")
    public static int field743;

    @ObfuscatedName("client.rs")
    public static int field744;

    @ObfuscatedName("client.rg")
    public static String field745;

    @ObfuscatedName("client.rt")
    public static long[] field524;

    @ObfuscatedName("client.rr")
    public static int field747;

    @ObfuscatedName("client.rc")
    public static class202 field748;

    @ObfuscatedName("client.re")
    public static class200 field573;

    @ObfuscatedName("client.rn")
    public static int field711;

    @ObfuscatedName("client.rb")
    public static int[] field775;

    @ObfuscatedName("client.rw")
    public static int[] field752;

    @ObfuscatedName("client.ro")
    public static long field680;

    @ObfuscatedName("client.st")
    public static class148[] field754;

    @ObfuscatedName("client.sj")
    public static class157[] field633;

    @ObfuscatedName("client.sd")
    public static int field620;

    @ObfuscatedName("client.sg")
    public static int field757;

    @ObfuscatedName("client.sl")
    public static int[] field758;

    @ObfuscatedName("client.sv")
    public static int[] field759;

    @ObfuscatedName("client.sq")
    public static class481[] field760;

    @ObfuscatedName("client.sx")
    public static int field761;

    @ObfuscatedName("client.su")
    public static int field507;

    @ObfuscatedName("client.sh")
    public static int field584;

    @ObfuscatedName("client.sz")
    public static int field764;

    @ObfuscatedName("client.sw")
    public static boolean field765;

    @ObfuscatedName("client.tw")
    public static int field766;

    @ObfuscatedName("client.to")
    public static int[] field767;

    @ObfuscatedName("client.tj")
    public static int[] field768;

    @ObfuscatedName("client.tf")
    public static int[] field796;

    @ObfuscatedName("client.ta")
    public static int[] field622;

    @ObfuscatedName("client.tr")
    public static class41[] field576;

    @ObfuscatedName("client.ts")
    public static boolean field772;

    @ObfuscatedName("client.th")
    public static boolean field773;

    @ObfuscatedName("client.ut")
    public static boolean[] field774;

    @ObfuscatedName("client.uo")
    public static int[] field804;

    @ObfuscatedName("client.ux")
    public static int[] field776;

    @ObfuscatedName("client.uv")
    public static int[] field777;

    @ObfuscatedName("client.un")
    public static int[] field618;

    @ObfuscatedName("client.ul")
    public static short field779;

    @ObfuscatedName("client.uz")
    public static short field551;

    @ObfuscatedName("client.ue")
    public static short field781;

    @ObfuscatedName("client.ug")
    public static short field673;

    @ObfuscatedName("client.ua")
    public static short field691;

    @ObfuscatedName("client.up")
    public static short field784;

    @ObfuscatedName("client.uh")
    public static short field785;

    @ObfuscatedName("client.uy")
    public static short field511;

    @ObfuscatedName("client.uj")
    public static int field660;

    @ObfuscatedName("client.ui")
    public static int field788;

    @ObfuscatedName("client.us")
    public static int field789;

    @ObfuscatedName("client.uq")
    public static int field688;

    @ObfuscatedName("client.uu")
    public static int field791;

    @ObfuscatedName("client.ur")
    public static class303 field552;

    @ObfuscatedName("client.uc")
    public static int field793;

    @ObfuscatedName("client.ub")
    public static int field794;

    @ObfuscatedName("client.ud")
    public static class436 field543;

    @ObfuscatedName("client.vg")
    public static class342[] field717;

    @ObfuscatedName("client.ve")
    public static class64 field797;

    @ObfuscatedName("client.vq")
    public static class385 field572;

    @ObfuscatedName("client.vh")
    public static class269 field725;

    @ObfuscatedName("client.vp")
    public static class269 field800;

    @ObfuscatedName("client.vr")
    public static int field801;

    @ObfuscatedName("client.vw")
    public static int field802;

    @ObfuscatedName("client.vj")
    public static ArrayList field803;

    @ObfuscatedName("client.vt")
    public static int field731;

    @ObfuscatedName("client.vv")
    public static int field805;

    @ObfuscatedName("client.wd")
    public static final class63 field806;

    @ObfuscatedName("client.ws")
    public static int[] field807;

    @ObfuscatedName("client.wt")
    public static int[] field786;

    static {
        int var0 = "com_jagex_auth_desktop_osrs:public".length();
        byte[] var1 = new byte[var0];
        for (int var2 = 0; var2 < var0; var2++) {
            char var3 = "com_jagex_auth_desktop_osrs:public".charAt(var2);
            if (var3 > 127) {
                var1[var2] = 63;
            } else {
                var1[var2] = (byte) var3;
            }
        }
        field555 = class360.method3309(var1);
        field556 = false;
        field557 = new class75();
        field561 = null;
        field753 = new class97[65536];
        field563 = 0;
        field719 = new int[65536];
        field565 = 0;
        field566 = new int[250];
        field567 = new class108();
        field568 = 0;
        field569 = false;
        field513 = new class378();
        field571 = new HashMap();
        field602 = 0;
        field756 = 1;
        field787 = 0;
        field575 = 1;
        field659 = 0;
        field577 = new class203[4];
        field578 = false;
        field579 = new int[4][13][13];
        field580 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
        field564 = 0;
        field720 = 2301979;
        field652 = 5063219;
        field533 = 3353893;
        field585 = 7759444;
        field690 = false;
        field587 = 0;
        field588 = 128;
        field589 = 0;
        field590 = 0;
        field664 = 0;
        field592 = 0;
        field593 = 0;
        field594 = 0;
        field750 = 50;
        field639 = 0;
        field597 = 0;
        field598 = 0;
        field661 = 12;
        field600 = 6;
        field790 = 0;
        field530 = false;
        field808 = 0;
        field604 = false;
        field605 = 0;
        field762 = 0;
        field607 = 50;
        field608 = new int[field607];
        field609 = new int[field607];
        field610 = new int[field607];
        field795 = new int[field607];
        field612 = new int[field607];
        field613 = new int[field607];
        field703 = new int[field607];
        field606 = new String[field607];
        field616 = new int[104][104];
        field617 = 0;
        field724 = -1;
        field545 = -1;
        field582 = 0;
        field515 = 0;
        field601 = 0;
        field623 = 0;
        field540 = true;
        field625 = 0;
        field626 = 0;
        field619 = 0;
        field628 = 0;
        field629 = 0;
        field799 = 0;
        field631 = false;
        field632 = 0;
        field692 = 0;
        field634 = true;
        field635 = new class89[2048];
        field636 = -1;
        field693 = 0;
        field638 = -1L;
        field546 = true;
        field737 = 0;
        field780 = 0;
        field642 = new int[1000];
        field643 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };
        field644 = new String[8];
        field645 = new boolean[8];
        field646 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };
        field647 = -1;
        field648 = new class352[4][104][104];
        field738 = new class352();
        field650 = new class352();
        field640 = new class352();
        field581 = new int[25];
        field653 = new int[25];
        field654 = new int[25];
        field599 = false;
        field656 = false;
        field657 = 0;
        field658 = new int[500];
        field651 = new int[500];
        field751 = new int[500];
        field621 = new int[500];
        field662 = new int[500];
        field663 = new String[500];
        field544 = new String[500];
        field665 = new boolean[500];
        field666 = false;
        field672 = false;
        field668 = false;
        field669 = true;
        field670 = -1;
        field671 = -1;
        field554 = 0;
        field522 = 50;
        field674 = 0;
        field771 = null;
        field676 = false;
        field677 = -1;
        field678 = -1;
        field679 = null;
        field798 = null;
        field681 = -1;
        field682 = new class444(8);
        field792 = 0;
        field684 = -1;
        field685 = 0;
        field686 = 0;
        field687 = null;
        field630 = 0;
        field689 = 0;
        field769 = 0;
        field701 = -1;
        field729 = false;
        field770 = null;
        field694 = null;
        field695 = null;
        field696 = 0;
        field697 = 0;
        field698 = null;
        field746 = false;
        field700 = -1;
        field614 = -1;
        field702 = false;
        field520 = -1;
        field704 = -1;
        field705 = false;
        field706 = 1;
        field707 = new int[32];
        field708 = 0;
        field709 = new int[32];
        field710 = 0;
        field637 = new int[32];
        field712 = 0;
        field713 = new int[32];
        field714 = 0;
        field715 = 0;
        field716 = 0;
        field611 = 0;
        field718 = 0;
        field514 = 0;
        field778 = 0;
        field721 = 0;
        field722 = 0;
        field615 = 0;
        field506 = new class485();
        field583 = new class352();
        field726 = new class352();
        field727 = new class352();
        field728 = new class352();
        field559 = new class444(512);
        field730 = 0;
        field809 = -2;
        field732 = new boolean[100];
        field733 = new boolean[100];
        field734 = new boolean[100];
        field735 = new int[100];
        field736 = new int[100];
        field723 = new int[100];
        field535 = new int[100];
        field763 = 0;
        field740 = 0L;
        field741 = true;
        field742 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
        field743 = 0;
        field744 = 0;
        field745 = "";
        field524 = new long[100];
        field747 = 0;
        field748 = new class202();
        field573 = new class200();
        field711 = 0;
        field775 = new int[128];
        field752 = new int[128];
        field680 = -1L;
        field754 = new class148[4];
        field633 = new class157[4];
        field620 = -1;
        field757 = 0;
        field758 = new int[1000];
        field759 = new int[1000];
        field760 = new class481[1000];
        field761 = 0;
        field507 = 0;
        field584 = 0;
        field764 = -1;
        field765 = false;
        field766 = 0;
        field767 = new int[50];
        field768 = new int[50];
        field796 = new int[50];
        field622 = new int[50];
        field576 = new class41[50];
        field772 = false;
        field773 = false;
        field774 = new boolean[5];
        field804 = new int[5];
        field776 = new int[5];
        field777 = new int[5];
        field618 = new int[5];
        field779 = 256;
        field551 = 205;
        field781 = 256;
        field673 = 320;
        field691 = 1;
        field784 = 32767;
        field785 = 1;
        field511 = 32767;
        field660 = 0;
        field788 = 0;
        field789 = 0;
        field688 = 0;
        field791 = 0;
        field552 = new class303();
        field793 = -1;
        field794 = -1;
        field543 = new class434();
        field717 = new class342[8];
        field797 = new class64();
        field572 = new class385(8, class383.field4482);
        field725 = new class269(64);
        field800 = new class269(64);
        field801 = -1;
        field802 = -1;
        field803 = new ArrayList(10);
        field731 = 0;
        field805 = 0;
        field806 = new class63();
        field807 = new int[50];
        field786 = new int[50];
    }

    @ObfuscatedName("client.fm(B)Lpb;")
    public static class438 method1635() {
        return Statics.field1973;
    }

    @ObfuscatedName("client.aw(I)V")
    public final void method522() {
    }

    public final void init() {
        if (!this.method500()) {
            return;
        }
        for (int var1 = 0; var1 <= 28; var1++) {
            String var2 = this.getParameter(Integer.toString(var1));
            if (var2 != null) {
                switch(var1) {
                    case 3:
                        if (var2.equalsIgnoreCase(class98.field1326)) {
                            field510 = true;
                        } else {
                            field510 = false;
                        }
                        break;
                    case 4:
                        if (field603 == -1) {
                            field603 = Integer.parseInt(var2);
                        }
                        break;
                    case 5:
                        field596 = Integer.parseInt(var2);
                        break;
                    case 6:
                        int var3 = Integer.parseInt(var2);
                        class348 var4;
                        if (var3 >= 0 && var3 < class348.field4305.length) {
                            var4 = class348.field4305[var3];
                        } else {
                            var4 = null;
                        }
                        Statics.field1905 = var4;
                        break;
                    case 7:
                        Statics.field4326 = class321.method189(Integer.parseInt(var2));
                        break;
                    case 8:
                        if (var2.equalsIgnoreCase(class98.field1326)) {
                        }
                        break;
                    case 9:
                        Statics.field1636 = var2;
                        break;
                    case 10:
                        class322[] var6 = new class322[] { class322.field3798, class322.field3795, class322.field3796, class322.field3799, class322.field3797, class322.field3794 };
                        Statics.field3303 = (class322) class347.method1688(var6, Integer.parseInt(var2));
                        if (Statics.field3303 == class322.field3799) {
                            Statics.field986 = class447.field4832;
                        } else {
                            Statics.field986 = class447.field4838;
                        }
                        break;
                    case 11:
                        Statics.field103 = var2;
                        break;
                    case 12:
                        field683 = Integer.parseInt(var2);
                    case 13:
                    case 16:
                    case 18:
                    case 19:
                    case 20:
                    case 22:
                    case 23:
                    case 24:
                    default:
                        break;
                    case 14:
                        Statics.field2800 = Integer.parseInt(var2);
                        break;
                    case 15:
                        field509 = Integer.parseInt(var2);
                        break;
                    case 17:
                        Statics.field42 = var2;
                        break;
                    case 21:
                        field512 = Integer.parseInt(var2);
                        break;
                    case 25:
                        int var5 = var2.indexOf(".");
                        if (var5 == -1) {
                            field516 = Integer.parseInt(var2);
                        } else {
                            field516 = Integer.parseInt(var2.substring(0, var5));
                            Integer.parseInt(var2.substring(var5 + 1));
                        }
                }
            }
        }
        Statics.method476();
        Statics.field1668 = this.getCodeBase().getHost();
        String var7 = Statics.field4326.field3792;
        byte var8 = 0;
        try {
            Statics.field1708 = 22;
            Statics.field3310 = var8;
            try {
                Statics.field5001 = System.getProperty("os.name");
            } catch (Exception var21) {
                Statics.field5001 = "Unknown";
            }
            Statics.field438 = Statics.field5001.toLowerCase();
            try {
                Statics.field1475 = System.getProperty("user.home");
                if (Statics.field1475 != null) {
                    Statics.field1475 = Statics.field1475 + "/";
                }
            } catch (Exception var20) {
            }
            try {
                if (Statics.field438.startsWith("win")) {
                    if (Statics.field1475 == null) {
                        Statics.field1475 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field1475 == null) {
                    Statics.field1475 = System.getenv("HOME");
                }
                if (Statics.field1475 != null) {
                    Statics.field1475 = Statics.field1475 + "/";
                }
            } catch (Exception var19) {
            }
            if (Statics.field1475 == null) {
                Statics.field1475 = "~/";
            }
            Statics.field1504 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1475, "/tmp/", "" };
            Statics.field1158 = new String[] { ".jagex_cache_" + Statics.field3310, ".file_store_" + Statics.field3310 };
            label133: for (int var12 = 0; var12 < 4; var12++) {
                Statics.field3325 = class166.method3231("oldschool", var7, var12);
                if (!Statics.field3325.exists()) {
                    Statics.field3325.mkdirs();
                }
                File[] var13 = Statics.field3325.listFiles();
                if (var13 == null) {
                    break;
                }
                File[] var14 = var13;
                int var15 = 0;
                while (true) {
                    if (var15 >= var14.length) {
                        break label133;
                    }
                    File var16 = var14[var15];
                    if (!class166.method4450(var16, false)) {
                        break;
                    }
                    var15++;
                }
            }
            class168.method3171(Statics.field3325);
            class166.method4764();
            class166.field1854 = new class450(new class449(class168.method5726("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class166.field1856 = new class450(new class449(class168.method5726("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field1862 = new class450[Statics.field1708];
            for (int var17 = 0; var17 < Statics.field1708; var17++) {
                Statics.field1862[var17] = new class450(new class449(class168.method5726("main_file_cache.idx" + var17), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var22) {
            class493.method2879((String) null, var22);
        }
        Statics.field1488 = this;
        Statics.field5068 = field603;
        if (field699 == -1) {
            field699 = 0;
        }
        Statics.field1718 = System.getenv("JX_ACCESS_TOKEN");
        Statics.field2007 = System.getenv("JX_REFRESH_TOKEN");
        if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
            this.field591 = true;
        }
        this.method498(765, 503, 210, 1);
    }

    public void setOtlTokenRequester(OtlTokenRequester arg0) {
        if (arg0 != null) {
            this.field549 = arg0;
            class73.method146(10);
        }
    }

    public void setRefreshTokenRequester(RefreshAccessTokenRequester arg0) {
        if (arg0 != null) {
            this.field667 = arg0;
        }
    }

    public boolean isOnLoginScreen() {
        return field517 == 10;
    }

    public long getAccountHash() {
        return this.field560;
    }

    @ObfuscatedName("client.fw(I)Z")
    public boolean method1150() {
        return Statics.field1718 != null && !Statics.field1718.trim().isEmpty() && Statics.field2007 != null && !Statics.field2007.trim().isEmpty();
    }

    @ObfuscatedName("client.gf(I)Z")
    public boolean method1151() {
        return this.field549 != null;
    }

    @ObfuscatedName("client.go(Ljava/lang/String;I)V")
    public void method1549(String arg0) throws IOException {
        HashMap var2 = new HashMap();
        var2.put("grant_type", "refresh_token");
        var2.put("scope", "gamesso.token.create");
        var2.put("refresh_token", arg0);
        URL var3 = new URL(Statics.field103 + "shield/oauth/token" + (new class424(var2)).method7213());
        HashMap var4 = new HashMap();
        var4.put("Authorization", "Basic " + field555);
        var4.put("Host", (new URL(Statics.field103)).getHost());
        var4.put("Accept", class421.field4653.method7196());
        class10 var5 = class10.field44;
        RefreshAccessTokenRequester var6 = this.field667;
        if (var6 != null) {
            this.field624 = var6.request(var5.method64(), var3, var4, "");
            return;
        }
        class11 var7 = new class11(var3, var5, this.field591);
        Iterator var8 = var4.entrySet().iterator();
        while (var8.hasNext()) {
            Entry var9 = (Entry) var8.next();
            var7.method77((String) var9.getKey(), (String) var9.getValue());
        }
        this.field655 = this.field547.method158(var7);
    }

    @ObfuscatedName("client.gj(Ljava/lang/String;I)V")
    public void method1153(String arg0) throws MalformedURLException, IOException {
        URL var2 = new URL(Statics.field103 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
        HashMap var3 = new HashMap();
        var3.put("Authorization", "Bearer " + arg0);
        class10 var4 = class10.field34;
        OtlTokenRequester var5 = this.field549;
        if (var5 != null) {
            this.field550 = var5.request(var4.method64(), var2, var3, "");
            return;
        }
        class11 var6 = new class11(var2, var4, this.field591);
        Iterator var7 = var3.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            var6.method77((String) var8.getKey(), (String) var8.getValue());
        }
        this.field548 = this.field547.method158(var6);
    }

    @ObfuscatedName("client.ay(B)V")
    public final void method595() {
        int[] var1 = new int[] { 20, 260, 10000 };
        int[] var2 = new int[] { 1000, 100, 500 };
        if (var1 == null || var2 == null) {
            Statics.field2611 = null;
            Statics.field2778 = null;
            Statics.field2765 = (byte[][][]) null;
            class376.field4447.clear();
            class376.field4447.add(100);
            class376.field4447.add(5000);
            class376.field4447.add(10000);
            class376.field4447.add(30000);
        } else {
            Statics.field2611 = var1;
            Statics.field2778 = new int[var1.length];
            Statics.field2765 = new byte[var1.length][][];
            for (int var3 = 0; var3 < Statics.field2611.length; var3++) {
                Statics.field2765[var3] = new byte[var2[var3]][];
                class376.field4447.add(var1[var3]);
            }
            Collections.sort(class376.field4447);
        }
        Statics.field1793 = field509 == 0 ? 43594 : field683 + 40000;
        Statics.field1654 = field509 == 0 ? 443 : field683 + 50000;
        Statics.field180 = Statics.field1793;
        Statics.field1105 = class305.field3517;
        Statics.field4549 = class305.field3516;
        Statics.field2018 = class305.field3522;
        Statics.field3446 = class305.field3518;
        Statics.field1850 = new class110(this.field591, 210);
        this.method490();
        this.method530();
        Statics.field1103 = this.method486();
        this.method492(field573, 0);
        this.method492(field748, 1);
        Statics.field2865 = new class404(255, class166.field1854, class166.field1856, 500000);
        Statics.field2126 = class95.method5773();
        this.method487();
        String var5 = Statics.field2788;
        class33.field183 = this;
        if (var5 != null) {
            class33.field184 = var5;
        }
        Statics.method2483(Statics.field2126.method2307());
        Statics.field4582 = new class66(Statics.field986);
        this.field547 = new class15("tokenRequest", 1, 1);
    }

    @ObfuscatedName("client.an(B)V")
    public final void method515() {
        field519++;
        this.method1156();
        while (true) {
            class352 var1 = class330.field4176;
            class329 var2;
            synchronized (class330.field4176) {
                var2 = (class329) class330.field4173.method6084();
            }
            if (var2 == null) {
                class287.method4237();
                method1542();
                field748.method3734();
                this.method491();
                class37 var4 = class37.field248;
                synchronized (class37.field248) {
                    class37.field253 = class37.field247;
                    class37.field254 = class37.field250;
                    class37.field249 = class37.field251;
                    class37.field256 = class37.field252;
                    class37.field261 = class37.field257;
                    class37.field262 = class37.field255;
                    class37.field258 = class37.field266;
                    class37.field244 = class37.field260;
                    class37.field257 = 0;
                }
                if (Statics.field1103 != null) {
                    int var6 = Statics.field1103.method299();
                    field615 = var6;
                }
                if (field517 == 0) {
                    method2039();
                    class36.method421();
                } else if (field517 == 5) {
                    class73.method3183(this, Statics.field2957);
                    method2039();
                    class36.method421();
                } else if (field517 == 10 || field517 == 11) {
                    class73.method3183(this, Statics.field2957);
                } else if (field517 == 20) {
                    class73.method3183(this, Statics.field2957);
                    this.method1159();
                } else if (field517 == 50) {
                    class73.method3183(this, Statics.field2957);
                    this.method1159();
                } else if (field517 == 25) {
                    method658();
                }
                if (field517 == 30) {
                    this.method1160();
                } else if (field517 == 40 || field517 == 45) {
                    this.method1159();
                }
                return;
            }
            var2.field4167.method5808(var2.field4169, (int) var2.field4686, var2.field4168, false);
        }
    }

    @ObfuscatedName("client.ab(ZI)V")
    public final void method516(boolean arg0) {
        boolean var2 = class287.method692();
        if (var2 && field765 && Statics.field1361 != null) {
            Statics.field1361.method788();
        }
        if ((field517 == 10 || field517 == 20 || field517 == 30) && field740 != 0L && Statics.method1118() > field740) {
            Statics.method2483(method1127());
        }
        if (arg0) {
            for (int var3 = 0; var3 < 100; var3++) {
                field732[var3] = true;
            }
        }
        if (field517 == 0) {
            this.method517(class73.field926, class73.field927, arg0);
        } else if (field517 == 5) {
            class73.method3727(Statics.field1714, Statics.field1766, Statics.field2957);
        } else if (field517 == 10 || field517 == 11) {
            class73.method3727(Statics.field1714, Statics.field1766, Statics.field2957);
        } else if (field517 == 20) {
            class73.method3727(Statics.field1714, Statics.field1766, Statics.field2957);
        } else if (field517 == 50) {
            class73.method3727(Statics.field1714, Statics.field1766, Statics.field2957);
        } else if (field517 == 25) {
            if (field659 == 1) {
                if (field602 > field756) {
                    field756 = field602;
                }
                int var4 = (field756 * 50 - field602 * 50) / field756;
                method833(class326.field3949 + class98.field1327 + class98.field1324 + var4 + "%" + class98.field1328, false);
            } else if (field659 == 2) {
                if (field787 > field575) {
                    field575 = field787;
                }
                int var5 = (field575 * 50 - field787 * 50) / field575 + 50;
                method833(class326.field3949 + class98.field1327 + class98.field1324 + var5 + "%" + class98.field1328, false);
            } else {
                method833(class326.field3949, false);
            }
        } else if (field517 == 30) {
            this.method1162();
        } else if (field517 == 40) {
            method833(class326.field3843 + class98.field1327 + class326.field3827, false);
        } else if (field517 == 45) {
            method833(class326.field3959, false);
        }
        if (field517 == 30 && field763 == 0 && !arg0 && !field741) {
            for (int var6 = 0; var6 < field730; var6++) {
                if (field733[var6]) {
                    Statics.field2354.method464(field735[var6], field736[var6], field723[var6], field535[var6]);
                    field733[var6] = false;
                }
            }
        } else if (field517 > 0) {
            Statics.field2354.method463(0, 0);
            for (int var7 = 0; var7 < field730; var7++) {
                field733[var7] = false;
            }
        }
    }

    @ObfuscatedName("client.al(I)V")
    public final void method627() {
        if (Statics.field2864.method2510()) {
            Statics.field2864.method2518();
        }
        if (Statics.field3041 != null) {
            Statics.field3041.field1092 = false;
        }
        Statics.field3041 = null;
        field567.method2585();
        if (class37.field248 != null) {
            class37 var1 = class37.field248;
            synchronized (class37.field248) {
                class37.field248 = null;
            }
        }
        Statics.field1103 = null;
        if (Statics.field1361 != null) {
            Statics.field1361.method789();
        }
        if (Statics.field1460 != null) {
            Statics.field1460.method789();
        }
        class334.method4750();
        class330.method3293();
        if (Statics.field1850 != null) {
            Statics.field1850.method2624();
            Statics.field1850 = null;
        }
        try {
            class166.field1854.method7597();
            for (int var3 = 0; var3 < Statics.field1708; var3++) {
                Statics.field1862[var3].method7597();
            }
            class166.field1856.method7597();
            class166.field1859.method7597();
        } catch (Exception var6) {
        }
        this.field547.method162();
    }

    @ObfuscatedName("ea.gp(II)V")
    public static void method2906(int arg0) {
        if (field517 == arg0) {
            return;
        }
        if (field517 == 30) {
            field573.method3718();
        }
        if (field517 == 0) {
            Statics.field1488.method518();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45 || arg0 == 50) {
            method700(0);
            field649 = 0;
            field542 = 0;
            field513.method6691(arg0);
            if (arg0 != 20) {
                method2137(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field84 != null) {
            Statics.field84.method6948();
            Statics.field84 = null;
        }
        if (field517 == 25) {
            field659 = 0;
            field602 = 0;
            field756 = 1;
            field787 = 0;
            field575 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            boolean var2 = Statics.field2126.method2297() >= field512;
            int var3 = var2 ? 0 : 12;
            class73.method2687(Statics.field1667, Statics.field1292, true, var3);
        } else if (arg0 == 20) {
            int var1 = field517 == 11 ? 4 : 0;
            class73.method2687(Statics.field1667, Statics.field1292, false, var1);
        } else if (arg0 == 11) {
            class73.method2687(Statics.field1667, Statics.field1292, false, 4);
        } else if (arg0 == 50) {
            class73.method3133("", "Updating date of birth...", "");
            class73.method2687(Statics.field1667, Statics.field1292, false, 7);
        } else {
            class73.method7481();
        }
        field517 = arg0;
    }

    @ObfuscatedName("client.gz(I)V")
    public void method1156() {
        if (field517 != 1000) {
            boolean var1 = class334.method4422();
            if (!var1) {
                this.method1157();
            }
        }
    }

    @ObfuscatedName("client.gl(I)V")
    public void method1157() {
        if (class334.field4238 >= 4) {
            this.method659("js5crc");
            method2906(1000);
            return;
        }
        if (class334.field4224 >= 4) {
            if (field517 <= 5) {
                this.method659("js5io");
                method2906(1000);
                return;
            }
            field538 = 3000;
            class334.field4224 = 3;
        }
        if (--field538 + 1 > 0) {
            return;
        }
        try {
            if (field537 == 0) {
                Statics.field4344 = Statics.field2911.method3119(Statics.field1668, Statics.field180);
                field537++;
            }
            if (field537 == 1) {
                if (Statics.field4344.field1895 == 2) {
                    this.method1158(-1);
                    return;
                }
                if (Statics.field4344.field1895 == 1) {
                    field537++;
                }
            }
            if (field537 == 2) {
                Socket var1 = (Socket) Statics.field4344.field1899;
                class401 var2 = new class401(var1, 40000, 5000);
                Statics.field2837 = var2;
                class467 var3 = new class467(5);
                var3.method7789(15);
                var3.method7778(210);
                Statics.field2837.method6944(var3.field4917, 0, 5);
                field537++;
                Statics.field1867 = Statics.method1118();
            }
            if (field537 == 3) {
                if (Statics.field2837.method6945() > 0) {
                    int var4 = Statics.field2837.method6947();
                    if (var4 != 0) {
                        this.method1158(var4);
                        return;
                    }
                    field537++;
                } else if (Statics.method1118() - Statics.field1867 > 30000L) {
                    this.method1158(-2);
                    return;
                }
            }
            if (field537 == 4) {
                class400 var5 = Statics.field2837;
                boolean var6 = field517 > 20;
                if (Statics.field4236 != null) {
                    try {
                        Statics.field4236.method6948();
                    } catch (Exception var21) {
                    }
                    Statics.field4236 = null;
                }
                Statics.field4236 = var5;
                if (Statics.field4236 != null) {
                    try {
                        class467 var8 = new class467(4);
                        var8.method7789(var6 ? 2 : 3);
                        var8.method7982(0);
                        Statics.field4236.method6944(var8.field4917, 0, 4);
                    } catch (IOException var20) {
                        try {
                            Statics.field4236.method6948();
                        } catch (Exception var19) {
                        }
                        class334.field4224++;
                        Statics.field4236 = null;
                    }
                }
                class334.field4229.field4915 = 0;
                Statics.field2020 = null;
                Statics.field4313 = null;
                class334.field4217 = 0;
                while (true) {
                    class332 var11 = (class332) class334.field4222.method7530();
                    if (var11 == null) {
                        while (true) {
                            class332 var12 = (class332) class334.field4227.method7530();
                            if (var12 == null) {
                                if (class334.field4233 != 0) {
                                    try {
                                        class467 var13 = new class467(4);
                                        var13.method7789(4);
                                        var13.method7789(class334.field4233);
                                        var13.method7776(0);
                                        Statics.field4236.method6944(var13.field4917, 0, 4);
                                    } catch (IOException var18) {
                                        try {
                                            Statics.field4236.method6948();
                                        } catch (Exception var17) {
                                        }
                                        class334.field4224++;
                                        Statics.field4236 = null;
                                    }
                                }
                                class334.field4235 = 0;
                                Statics.field4219 = Statics.method1118();
                                Statics.field4344 = null;
                                Statics.field2837 = null;
                                field537 = 0;
                                field539 = 0;
                                return;
                            }
                            class334.field4220.method6069(var12);
                            class334.field4225.method7528(var12, var12.field4686);
                            class334.field4226++;
                            class334.field4234--;
                        }
                    }
                    class334.field4228.method7528(var11, var11.field4686);
                    class334.field4221++;
                    class334.field4223--;
                }
            }
        } catch (IOException var22) {
            this.method1158(-3);
        }
    }

    @ObfuscatedName("client.gq(II)V")
    public void method1158(int arg0) {
        Statics.field4344 = null;
        Statics.field2837 = null;
        field537 = 0;
        if (Statics.field180 == Statics.field1793) {
            Statics.field180 = Statics.field1654;
        } else {
            Statics.field180 = Statics.field1793;
        }
        field539++;
        if (field539 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field517 <= 5) {
                this.method659("js5connect_full");
                method2906(1000);
            } else {
                field538 = 3000;
            }
        } else if (field539 >= 2 && arg0 == 6) {
            this.method659("js5connect_outofdate");
            method2906(1000);
        } else if (field539 >= 4) {
            if (field517 <= 5) {
                this.method659("js5connect");
                method2906(1000);
            } else {
                field538 = 3000;
            }
        }
    }

    @ObfuscatedName("l.gh(Lln;Ljava/lang/String;I)V")
    public static void method254(class331 arg0, String arg1) {
        class81 var2 = new class81(arg0, arg1);
        field803.add(var2);
        field805 += var2.field1050;
    }

    @ObfuscatedName("gm.ge(S)Z")
    public static boolean method3475() {
        if (field803 == null || field731 >= field803.size()) {
            return true;
        }
        while (field731 < field803.size()) {
            class81 var0 = (class81) field803.get(field731);
            if (!var0.method2111()) {
                return false;
            }
            field731++;
        }
        return true;
    }

    @ObfuscatedName("bn.gu(B)I")
    public static int method1913() {
        if (field803 == null || field731 >= field803.size()) {
            return 10000;
        }
        int var0 = 0;
        for (int var1 = 0; var1 <= field731; var1++) {
            var0 += ((class81) field803.get(var1)).field1048;
        }
        return var0 * 10000 / field805;
    }

    @ObfuscatedName("cf.gv(I)V")
    public static void method2039() {
        if (field536 == 0) {
            Statics.field286 = new class216(4, 104, 104, class79.field1027);
            for (int var0 = 0; var0 < 4; var0++) {
                field577[var0] = new class203(104, 104);
            }
            Statics.field2817 = new class481(512, 512);
            class73.field927 = class326.field3831;
            class73.field926 = 5;
            field536 = 20;
        } else if (field536 == 20) {
            class73.field927 = class326.field3832;
            class73.field926 = 10;
            field536 = 30;
        } else if (field536 == 30) {
            Statics.field1307 = method5206(0, false, true, true, false);
            Statics.field48 = method5206(1, false, true, true, false);
            Statics.field2152 = method5206(2, true, false, true, false);
            Statics.field2101 = method5206(3, false, true, true, false);
            Statics.field2933 = method5206(4, false, true, true, false);
            Statics.field8 = method5206(5, true, true, true, false);
            Statics.field1825 = method5206(6, true, true, true, false);
            Statics.field3471 = method5206(7, false, true, true, false);
            Statics.field1292 = method5206(8, false, true, true, false);
            Statics.field2616 = method5206(9, false, true, true, false);
            Statics.field1667 = method5206(10, false, true, true, false);
            Statics.field124 = method5206(11, false, true, true, false);
            Statics.field908 = method5206(12, false, true, true, false);
            Statics.field4350 = method5206(13, true, false, true, false);
            Statics.field1925 = method5206(14, false, true, true, false);
            Statics.field1157 = method5206(15, false, true, true, false);
            Statics.field2077 = method5206(17, true, true, true, false);
            Statics.field1881 = method5206(18, false, true, true, false);
            Statics.field4804 = method5206(19, false, true, true, false);
            Statics.field2853 = method5206(20, false, true, true, false);
            Statics.field4540 = method5206(21, false, true, true, true);
            class73.field927 = class326.field4067;
            class73.field926 = 20;
            field536 = 40;
        } else if (field536 == 40) {
            byte var1 = 0;
            int var2 = var1 + Statics.field1307.method5802() * 4 / 100;
            int var3 = var2 + Statics.field48.method5802() * 4 / 100;
            int var4 = var3 + Statics.field2152.method5802() * 2 / 100;
            int var5 = var4 + Statics.field2101.method5802() * 2 / 100;
            int var6 = var5 + Statics.field2933.method5802() * 6 / 100;
            int var7 = var6 + Statics.field8.method5802() * 4 / 100;
            int var8 = var7 + Statics.field1825.method5802() * 2 / 100;
            int var9 = var8 + Statics.field3471.method5802() * 55 / 100;
            int var10 = var9 + Statics.field1292.method5802() * 2 / 100;
            int var11 = var10 + Statics.field2616.method5802() * 2 / 100;
            int var12 = var11 + Statics.field1667.method5802() * 2 / 100;
            int var13 = var12 + Statics.field124.method5802() * 2 / 100;
            int var14 = var13 + Statics.field908.method5802() * 2 / 100;
            int var15 = var14 + Statics.field4350.method5802() * 2 / 100;
            int var16 = var15 + Statics.field1925.method5802() * 2 / 100;
            int var17 = var16 + Statics.field1157.method5802() * 2 / 100;
            int var18 = var17 + Statics.field4804.method5802() / 100;
            int var19 = var18 + Statics.field1881.method5802() / 100;
            int var20 = var19 + Statics.field2853.method5802() / 100;
            int var21 = var20 + Statics.field4540.method5802() / 100;
            int var22 = var21 + (Statics.field2077.method5801() && Statics.field2077.method5850() ? 1 : 0);
            if (var22 == 100) {
                method254(Statics.field1307, "Animations");
                method254(Statics.field48, "Skeletons");
                method254(Statics.field2933, "Sound FX");
                method254(Statics.field8, "Maps");
                method254(Statics.field1825, "Music Tracks");
                method254(Statics.field3471, "Models");
                method254(Statics.field1292, "Sprites");
                method254(Statics.field124, "Music Jingles");
                method254(Statics.field1925, "Music Samples");
                method254(Statics.field1157, "Music Patches");
                method254(Statics.field4804, "World Map");
                method254(Statics.field1881, "World Map Geography");
                method254(Statics.field2853, "World Map Ground");
                Statics.field1471 = new class406();
                Statics.field1471.method7013(Statics.field2077);
                class73.field927 = class326.field3835;
                class73.field926 = 30;
                field536 = 45;
            } else {
                if (var22 != 0) {
                    class73.field927 = class326.field3834 + var22 + "%";
                }
                class73.field926 = 30;
            }
        } else if (field536 == 45) {
            boolean var23 = !field562;
            Statics.field326 = 22050;
            Statics.field3355 = var23;
            Statics.field206 = 2;
            class288 var24 = new class288();
            var24.method5026(9, 128);
            Statics.field1361 = class44.method1089(Statics.field2911, 0, 22050);
            Statics.field1361.method787(var24);
            class287.method4789(Statics.field1157, Statics.field1925, Statics.field2933, var24);
            Statics.field1460 = class44.method1089(Statics.field2911, 1, 2048);
            Statics.field498 = new class40();
            Statics.field1460.method787(Statics.field498);
            Statics.field127 = new class57(22050, Statics.field326);
            class73.field927 = class326.field4027;
            class73.field926 = 35;
            field536 = 50;
            Statics.field1096 = new class439(Statics.field1292, Statics.field4350);
        } else if (field536 == 50) {
            int var25 = class440.method7485().length;
            field571 = Statics.field1096.method7476(class440.method7485());
            if (field571.size() < var25) {
                class73.field927 = class326.field4014 + field571.size() * 100 / var25 + "%";
                class73.field926 = 40;
            } else {
                Statics.field1766 = (class368) field571.get(class440.field4807);
                Statics.field2957 = (class368) field571.get(class440.field4803);
                Statics.field1714 = (class368) field571.get(class440.field4809);
                Statics.field2514 = field543.method7237();
                class73.field927 = class326.field3996;
                class73.field926 = 40;
                field536 = 60;
            }
        } else if (field536 == 60) {
            int var26 = class73.method2887(Statics.field1667, Statics.field1292);
            class331 var27 = Statics.field1292;
            int var28 = class73.field935.length + class73.field933.length;
            String[] var29 = class73.field954;
            for (int var30 = 0; var30 < var29.length; var30++) {
                String var31 = var29[var30];
                if (var27.method5861(var31) != -1) {
                    var28++;
                }
            }
            if (var26 < var28) {
                class73.field927 = class326.field3839 + var26 * 100 / var28 + "%";
                class73.field926 = 50;
            } else {
                class73.field927 = class326.field3840;
                class73.field926 = 50;
                method2906(5);
                field536 = 70;
            }
        } else if (field536 == 70) {
            if (!Statics.field2152.method5850()) {
                class73.field927 = class326.field3841 + Statics.field2152.method5828() + "%";
                class73.field926 = 60;
            } else if (Statics.field4540.method5850()) {
                class331 var34 = Statics.field2152;
                Statics.field2264 = var34;
                class190.method2905(Statics.field2152);
                class331 var35 = Statics.field2152;
                class331 var36 = Statics.field3471;
                Statics.field1963 = var35;
                Statics.field1971 = var36;
                Statics.field911 = Statics.field1963.method5869(3);
                class196.method2629(Statics.field2152, Statics.field3471, field562);
                class187.method2600(Statics.field2152, Statics.field3471, field516 <= 209, Statics.field1471.field4586);
                class331 var37 = Statics.field2152;
                Statics.field2127 = var37;
                class197.method6056(Statics.field2152, Statics.field3471, field510, Statics.field1766);
                class199.method4473(Statics.field2152, Statics.field1307, Statics.field48);
                class189.method4761(Statics.field2152, Statics.field3471);
                class192.method3286(Statics.field2152);
                class331 var38 = Statics.field2152;
                Statics.field1921 = var38;
                Statics.field1923 = Statics.field1921.method5869(16);
                class306.method3714(Statics.field2101, Statics.field3471, Statics.field1292, Statics.field4350);
                class177.method2578(Statics.field2152);
                class184.method4472(Statics.field2152);
                class331 var39 = Statics.field2152;
                Statics.field1956 = var39;
                class191.method3006(Statics.field2152);
                class193.method2401(Statics.field2152);
                class460.method6924(Statics.field2152);
                class462.method7667(Statics.field2152);
                Statics.field1659 = new class452(Statics.field3303, 54, Statics.field1905, Statics.field2152);
                Statics.field205 = new class452(Statics.field3303, 47, Statics.field1905, Statics.field2152);
                Statics.field2864 = new class106();
                class331 var40 = Statics.field2152;
                class331 var41 = Statics.field1292;
                class331 var42 = Statics.field4350;
                Statics.field105 = var40;
                Statics.field2136 = var41;
                Statics.field2130 = var42;
                class182.method2834(Statics.field2152, Statics.field1292);
                class331 var43 = Statics.field2152;
                class331 var44 = Statics.field1292;
                Statics.field1946 = var44;
                if (var43.method5850()) {
                    Statics.field1928 = var43.method5869(35);
                    Statics.field1927 = new class179[Statics.field1928];
                    for (int var45 = 0; var45 < Statics.field1928; var45++) {
                        byte[] var46 = var43.method5909(35, var45);
                        Statics.field1927[var45] = new class179(var45);
                        if (var46 != null) {
                            Statics.field1927[var45].method3211(new class467(var46));
                            Statics.field1927[var45].method3213();
                        }
                    }
                }
                class73.field927 = class326.field3904;
                class73.field926 = 60;
                field536 = 80;
            } else {
                class73.field927 = class326.field3841 + (80 + Statics.field908.method5828() / 6) + "%";
                class73.field926 = 60;
            }
        } else if (field536 == 80) {
            int var47 = 0;
            if (Statics.field2330 == null) {
                Statics.field2330 = Statics.method2794(Statics.field1292, Statics.field1471.field4584, 0);
            } else {
                var47++;
            }
            if (Statics.field1676 == null) {
                Statics.field1676 = Statics.method2794(Statics.field1292, Statics.field1471.field4589, 0);
            } else {
                var47++;
            }
            if (Statics.field191 == null) {
                Statics.field191 = class482.method4765(Statics.field1292, Statics.field1471.field4585, 0);
            } else {
                var47++;
            }
            if (Statics.field810 == null) {
                Statics.field810 = class482.method3715(Statics.field1292, Statics.field1471.field4583, 0);
            } else {
                var47++;
            }
            if (Statics.field4612 == null) {
                Statics.field4612 = class482.method3715(Statics.field1292, Statics.field1471.field4586, 0);
            } else {
                var47++;
            }
            if (Statics.field4349 == null) {
                Statics.field4349 = class482.method3715(Statics.field1292, Statics.field1471.field4588, 0);
            } else {
                var47++;
            }
            if (Statics.field1703 == null) {
                Statics.field1703 = class482.method3715(Statics.field1292, Statics.field1471.field4592, 0);
            } else {
                var47++;
            }
            if (Statics.field268 == null) {
                Statics.field268 = class482.method3715(Statics.field1292, Statics.field1471.field4590, 0);
            } else {
                var47++;
            }
            if (Statics.field3327 == null) {
                Statics.field3327 = class482.method3715(Statics.field1292, Statics.field1471.field4591, 0);
            } else {
                var47++;
            }
            if (Statics.field1160 == null) {
                Statics.field1160 = class482.method4765(Statics.field1292, Statics.field1471.field4587, 0);
            } else {
                var47++;
            }
            if (Statics.field3453 == null) {
                Statics.field3453 = class482.method4765(Statics.field1292, Statics.field1471.field4593, 0);
            } else {
                var47++;
            }
            if (var47 < 11) {
                class73.field927 = class326.field3938 + var47 * 100 / 12 + "%";
                class73.field926 = 70;
            } else {
                Statics.field4409 = Statics.field3453;
                Statics.field1676.method8229();
                int var48 = (int) (Math.random() * 21.0D) - 10;
                int var49 = (int) (Math.random() * 21.0D) - 10;
                int var50 = (int) (Math.random() * 21.0D) - 10;
                int var51 = (int) (Math.random() * 41.0D) - 20;
                Statics.field191[0].method8198(var48 + var51, var49 + var51, var50 + var51);
                class73.field927 = class326.field3844;
                class73.field926 = 70;
                field536 = 90;
            }
        } else if (field536 == 90) {
            if (Statics.field2616.method5850()) {
                Statics.field2528 = new class222(Statics.field2616, Statics.field1292, 20, Statics.field2126.method2295(), field562 ? 64 : 128);
                class213.method3930(Statics.field2528);
                class213.method3925(Statics.field2126.method2295());
                field536 = 100;
            } else {
                class73.field927 = class326.field3845 + "0%";
                class73.field926 = 90;
            }
        } else if (field536 == 100) {
            int var52 = Statics.field2528.method4239();
            if (var52 < 100) {
                class73.field927 = class326.field3845 + var52 + "%";
                class73.field926 = 90;
            } else {
                class73.field927 = class326.field4121;
                class73.field926 = 90;
                field536 = 110;
            }
        } else if (field536 == 110) {
            Statics.field3041 = new class86();
            Statics.field2911.method3120(Statics.field3041, 10);
            class73.field927 = class326.field3901;
            class73.field926 = 92;
            field536 = 120;
        } else if (field536 == 120) {
            if (Statics.field1667.method5865("huffman", "")) {
                class308 var53 = new class308(Statics.field1667.method5864("huffman", ""));
                class309.method1852(var53);
                class73.field927 = class326.field4062;
                class73.field926 = 94;
                field536 = 130;
            } else {
                class73.field927 = class326.field3848 + "%";
                class73.field926 = 94;
            }
        } else if (field536 == 130) {
            if (!Statics.field2101.method5850()) {
                class73.field927 = class326.field3850 + Statics.field2101.method5828() * 4 / 5 + "%";
                class73.field926 = 96;
            } else if (!Statics.field908.method5850()) {
                class73.field927 = class326.field3850 + (80 + Statics.field908.method5828() / 6) + "%";
                class73.field926 = 96;
            } else if (Statics.field4350.method5850()) {
                class73.field927 = class326.field3939;
                class73.field926 = 98;
                field536 = 140;
            } else {
                class73.field927 = class326.field3850 + (96 + Statics.field4350.method5828() / 50) + "%";
                class73.field926 = 96;
            }
        } else if (field536 == 140) {
            class73.field926 = 100;
            if (Statics.field4804.method5905(class257.field3011.field3009)) {
                if (Statics.field1973 == null) {
                    Statics.field1973 = new class438();
                    Statics.field1973.method7270(Statics.field4804, Statics.field1881, Statics.field2853, Statics.field1714, field571, Statics.field191);
                }
                class73.field927 = class326.field4105;
                field536 = 150;
            } else {
                class73.field927 = class326.field3817 + Statics.field4804.method5847(class257.field3011.field3009) / 10 + "%";
            }
        } else if (field536 == 150) {
            method2906(10);
        }
    }

    @ObfuscatedName("kx.gd(IZZZZI)Lln;")
    public static class331 method5206(int arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        class404 var5 = null;
        if (class166.field1854 != null) {
            var5 = new class404(arg0, class166.field1854, Statics.field1862[arg0], 1000000);
        }
        return new class331(var5, Statics.field2865, arg0, arg1, arg2, arg3, arg4);
    }

    @ObfuscatedName("client.gm(B)V")
    public final void method1159() {
        class400 var1 = field567.method2587();
        class466 var2 = field567.field1426;
        try {
            if (field508 == 0) {
                if (Statics.field207 == null && (field557.method1998() || field649 > 250)) {
                    Statics.field207 = field557.method1999();
                    field557.method1997();
                    field557 = null;
                }
                if (Statics.field207 != null) {
                    if (var1 != null) {
                        var1.method6948();
                        var1 = null;
                    }
                    Statics.field107 = null;
                    field569 = false;
                    field649 = 0;
                    if (field641.method8082()) {
                        try {
                            this.method1549(Statics.field2007);
                            method700(21);
                        } catch (Throwable var69) {
                            class493.method2879((String) null, var69);
                            Statics.method460(65);
                            return;
                        }
                    } else {
                        method700(1);
                    }
                }
            }
            if (field508 == 21) {
                if (this.field624 == null) {
                    if (this.field655 == null) {
                        Statics.method460(65);
                        return;
                    }
                    if (!this.field655.method270()) {
                        return;
                    }
                    if (this.field655.method272()) {
                        class493.method2879(this.field655.method266(), (Throwable) null);
                        Statics.method460(65);
                        this.field655 = null;
                        return;
                    }
                    class22 var6 = this.field655.method277();
                    if (var6.method288() != 200) {
                        Statics.method460(65);
                        this.field655 = null;
                        return;
                    }
                    field649 = 0;
                    class423 var7 = new class423(var6.method289());
                    try {
                        Statics.field1718 = var7.method7207().getString("access_token");
                        Statics.field2007 = var7.method7207().getString("refresh_token");
                    } catch (Exception var67) {
                        class493.method2879("Error parsing tokens", var67);
                        Statics.method460(65);
                        this.field655 = null;
                        return;
                    }
                } else if (this.field624.isDone()) {
                    if (this.field624.isCancelled()) {
                        Statics.method460(65);
                        this.field624 = null;
                        return;
                    }
                    try {
                        RefreshAccessTokenResponse var4 = (RefreshAccessTokenResponse) this.field624.get();
                        if (!var4.isSuccess()) {
                            Statics.method460(65);
                            this.field624 = null;
                            return;
                        }
                        Statics.field1718 = var4.getAccessToken();
                        Statics.field2007 = var4.getRefreshToken();
                        this.field624 = null;
                    } catch (Exception var68) {
                        class493.method2879((String) null, var68);
                        Statics.method460(65);
                        this.field624 = null;
                        return;
                    }
                } else {
                    return;
                }
                this.method1153(Statics.field1718);
                method700(20);
            }
            if (field508 == 20) {
                if (this.field550 == null) {
                    if (this.field548 == null) {
                        Statics.method460(65);
                        return;
                    }
                    if (!this.field548.method270()) {
                        return;
                    }
                    if (this.field548.method272()) {
                        class493.method2879(this.field548.method266(), (Throwable) null);
                        Statics.method460(65);
                        this.field548 = null;
                        return;
                    }
                    class22 var11 = this.field548.method277();
                    if (var11.method288() != 200) {
                        class493.method2879("Response code: " + var11.method288() + "Response body: " + var11.method289(), (Throwable) null);
                        Statics.method460(65);
                        this.field548 = null;
                        return;
                    }
                    this.field782 = var11.method289();
                    this.field548 = null;
                } else if (this.field550.isDone()) {
                    if (this.field550.isCancelled()) {
                        Statics.method460(65);
                        this.field550 = null;
                        return;
                    }
                    try {
                        OtlTokenResponse var9 = (OtlTokenResponse) this.field550.get();
                        if (!var9.isSuccess()) {
                            Statics.method460(65);
                            this.field550 = null;
                            return;
                        }
                        this.field782 = var9.getToken();
                        this.field550 = null;
                    } catch (Exception var66) {
                        class493.method2879((String) null, var66);
                        Statics.method460(65);
                        this.field550 = null;
                        return;
                    }
                } else {
                    return;
                }
                field649 = 0;
                method700(1);
            }
            if (field508 == 1) {
                if (Statics.field107 == null) {
                    Statics.field107 = Statics.field2911.method3119(Statics.field1668, Statics.field180);
                }
                if (Statics.field107.field1895 == 2) {
                    throw new IOException();
                }
                if (Statics.field107.field1895 == 1) {
                    Socket var12 = (Socket) Statics.field107.field1899;
                    class401 var13 = new class401(var12, 40000, 5000);
                    var1 = var13;
                    field567.method2584(var13);
                    Statics.field107 = null;
                    method700(2);
                }
            }
            if (field508 == 2) {
                field567.method2581();
                class278 var14 = class278.method2638();
                var14.field3179 = null;
                var14.field3174 = 0;
                var14.field3177 = new class466(5000);
                var14.field3177.method7789(class280.field3301.field3307);
                field567.method2603(var14);
                field567.method2594();
                var2.field4915 = 0;
                method700(3);
            }
            if (field508 == 3) {
                if (Statics.field1361 != null) {
                    Statics.field1361.method794();
                }
                if (Statics.field1460 != null) {
                    Statics.field1460.method794();
                }
                if (var1.method6955(1)) {
                    int var17 = var1.method6947();
                    if (Statics.field1361 != null) {
                        Statics.field1361.method794();
                    }
                    if (Statics.field1460 != null) {
                        Statics.field1460.method794();
                    }
                    if (var17 != 0) {
                        Statics.method460(var17);
                        return;
                    }
                    var2.field4915 = 0;
                    method700(4);
                }
            }
            if (field508 == 4) {
                if (var2.field4915 < 8) {
                    int var18 = var1.method6945();
                    if (var18 > 8 - var2.field4915) {
                        var18 = 8 - var2.field4915;
                    }
                    if (var18 > 0) {
                        var1.method6943(var2.field4917, var2.field4915, var18);
                        var2.field4915 += var18;
                    }
                }
                if (var2.field4915 == 8) {
                    var2.field4915 = 0;
                    Statics.field2076 = var2.method7958();
                    method700(5);
                }
            }
            if (field508 == 5) {
                field567.field1426.field4915 = 0;
                field567.method2581();
                class466 var19 = new class466(500);
                int[] var20 = new int[] { Statics.field207.nextInt(), Statics.field207.nextInt(), Statics.field207.nextInt(), Statics.field207.nextInt() };
                var19.field4915 = 0;
                var19.method7789(1);
                var19.method7778(var20[0]);
                var19.method7778(var20[1]);
                var19.method7778(var20[2]);
                var19.method7778(var20[3]);
                var19.method7780(Statics.field2076);
                if (field517 == 40) {
                    var19.method7778(Statics.field3021[0]);
                    var19.method7778(Statics.field3021[1]);
                    var19.method7778(Statics.field3021[2]);
                    var19.method7778(Statics.field3021[3]);
                } else {
                    if (field517 == 50) {
                        var19.method7789(class133.field1629.method32());
                        var19.method7778(Statics.field173);
                    } else {
                        var19.method7789(field541.method32());
                        switch(field541.field1628) {
                            case 0:
                                var19.field4915 += 4;
                            case 1:
                            default:
                                break;
                            case 2:
                                var19.method7778(Statics.field2126.method2310(class73.field941));
                                break;
                            case 3:
                            case 4:
                                var19.method7982(Statics.field1698);
                                var19.field4915++;
                        }
                    }
                    if (field641.method8082()) {
                        var19.method7789(class472.field4970.method32());
                        var19.method7782(this.field782);
                    } else {
                        var19.method7789(class472.field4977.method32());
                        var19.method7782(class73.field937);
                    }
                }
                var19.method7817(class72.field912, class72.field909);
                Statics.field3021 = var20;
                class278 var21 = class278.method2638();
                var21.field3179 = null;
                var21.field3174 = 0;
                var21.field3177 = new class466(5000);
                var21.field3177.field4915 = 0;
                if (field517 == 40) {
                    var21.field3177.method7789(class280.field3304.field3307);
                } else {
                    var21.field3177.method7789(class280.field3302.field3307);
                }
                var21.field3177.method7776(0);
                int var24 = var21.field3177.field4915;
                var21.field3177.method7778(210);
                var21.field3177.method7778(1);
                var21.field3177.method7789(field603);
                var21.field3177.method7789(field699);
                byte var25 = 0;
                var21.field3177.method7789(var25);
                var21.field3177.method7785(var19.field4917, 0, var19.field4915);
                int var26 = var21.field3177.field4915;
                var21.field3177.method7782(class73.field941);
                var21.field3177.method7789((field741 ? 1 : 0) << 1 | (field562 ? 1 : 0));
                var21.field3177.method7776(Statics.field2331);
                var21.field3177.method7776(Statics.field4300);
                class466 var27 = var21.field3177;
                if (field561 == null) {
                    byte[] var28 = new byte[24];
                    try {
                        class166.field1859.method7598(0L);
                        class166.field1859.method7582(var28);
                        int var29;
                        for (var29 = 0; var29 < 24 && var28[var29] == 0; var29++) {
                        }
                        if (var29 >= 24) {
                            throw new IOException();
                        }
                    } catch (Exception var70) {
                        for (int var31 = 0; var31 < 24; var31++) {
                            var28[var31] = -1;
                        }
                    }
                    var27.method7785(var28, 0, var28.length);
                } else {
                    var27.method7785(field561, 0, field561.length);
                }
                var21.field3177.method7782(Statics.field1636);
                var21.field3177.method7778(Statics.field2800);
                class467 var34 = new class467(Statics.field2514.method7252());
                Statics.field2514.method7250(var34);
                var21.field3177.method7785(var34.field4917, 0, var34.field4917.length);
                var21.field3177.method7789(field603);
                var21.field3177.method7778(0);
                var21.field3177.method7778(Statics.field2101.field4211);
                var21.field3177.method7842(Statics.field908.field4211);
                var21.field3177.method7842(Statics.field2077.field4211);
                var21.field3177.method7841(Statics.field1157.field4211);
                var21.field3177.method7842(Statics.field1925.field4211);
                var21.field3177.method7841(Statics.field2152.field4211);
                var21.field3177.method7842(0);
                var21.field3177.method7843(Statics.field1292.field4211);
                var21.field3177.method7841(Statics.field1825.field4211);
                var21.field3177.method7778(Statics.field4350.field4211);
                var21.field3177.method7842(Statics.field1881.field4211);
                var21.field3177.method7778(Statics.field2616.field4211);
                var21.field3177.method7843(Statics.field3471.field4211);
                var21.field3177.method7778(Statics.field48.field4211);
                var21.field3177.method7778(Statics.field4804.field4211);
                var21.field3177.method7843(Statics.field2853.field4211);
                var21.field3177.method7778(Statics.field124.field4211);
                var21.field3177.method7841(Statics.field1667.field4211);
                var21.field3177.method7841(Statics.field8.field4211);
                var21.field3177.method7778(Statics.field2933.field4211);
                var21.field3177.method7843(Statics.field1307.field4211);
                var21.field3177.method7968(var20, var26, var21.field3177.field4915);
                var21.field3177.method7788(var21.field3177.field4915 - var24);
                field567.method2603(var21);
                field567.method2594();
                field567.field1425 = new class484(var20);
                int[] var35 = new int[4];
                for (int var36 = 0; var36 < 4; var36++) {
                    var35[var36] = var20[var36] + 50;
                }
                var2.method7736(var35);
                method700(6);
            }
            if (field508 == 6 && var1.method6945() > 0) {
                int var37 = var1.method6947();
                if (var37 == 61) {
                    int var38 = var1.method6945();
                    Statics.field1786 = var38 == 1 && var1.method6947() == 1;
                    method700(5);
                }
                if (var37 == 21 && field517 == 20) {
                    method700(12);
                } else if (var37 == 2) {
                    method700(14);
                } else if (var37 == 15 && field517 == 40) {
                    field567.field1430 = -1;
                    method700(19);
                } else if (var37 == 64) {
                    method700(10);
                } else if (var37 == 23 && field542 < 1) {
                    field542++;
                    method700(0);
                } else if (var37 == 29) {
                    method700(17);
                } else if (var37 == 69) {
                    method700(7);
                } else {
                    Statics.method460(var37);
                    return;
                }
            }
            if (field508 == 7 && var1.method6945() >= 2) {
                var1.method6943(var2.field4917, 0, 2);
                var2.field4915 = 0;
                Statics.field1462 = var2.method7794();
                method700(8);
            }
            if (field508 == 8 && var1.method6945() >= Statics.field1462) {
                var2.field4915 = 0;
                var1.method6943(var2.field4917, var2.field4915, Statics.field1462);
                class7 var39 = class7.method5767()[var2.method7792()];
                try {
                    class4 var40 = class5.method5942(var39);
                    this.field574 = new class8(var2, var40);
                    method700(9);
                } catch (Exception var65) {
                    Statics.method460(22);
                    return;
                }
            }
            if (field508 == 9 && this.field574.method52()) {
                this.field558 = this.field574.method51();
                this.field574.method40();
                this.field574 = null;
                if (this.field558 == null) {
                    Statics.method460(22);
                    return;
                }
                field567.method2581();
                class278 var42 = class278.method2638();
                var42.field3179 = null;
                var42.field3174 = 0;
                var42.field3177 = new class466(5000);
                var42.field3177.method7789(class280.field3305.field3307);
                var42.field3177.method7776(this.field558.field4915);
                var42.field3177.method7786(this.field558);
                field567.method2603(var42);
                field567.method2594();
                this.field558 = null;
                method700(6);
            }
            if (field508 == 10 && var1.method6945() > 0) {
                Statics.field2644 = var1.method6947();
                method700(11);
            }
            if (field508 == 11 && var1.method6945() >= Statics.field2644) {
                var1.method6943(var2.field4917, 0, Statics.field2644);
                var2.field4915 = 0;
                method700(6);
            }
            if (field508 == 12 && var1.method6945() > 0) {
                field528 = (var1.method6947() + 3) * 60;
                method700(13);
            }
            if (field508 == 13) {
                field649 = 0;
                class73.method3133(class326.field3859, class326.field3860, field528 / 60 + class326.field3917);
                if (--field528 <= 0) {
                    method700(0);
                }
            } else {
                if (field508 == 14 && var1.method6945() >= 1) {
                    Statics.field4656 = var1.method6947();
                    method700(15);
                }
                if (field508 == 15 && var1.method6945() >= Statics.field4656) {
                    boolean var45 = var1.method6947() == 1;
                    var1.method6943(var2.field4917, 0, 4);
                    var2.field4915 = 0;
                    boolean var46 = false;
                    if (var45) {
                        int var47 = var2.method7737() << 24;
                        int var48 = var47 | var2.method7737() << 16;
                        int var49 = var48 | var2.method7737() << 8;
                        int var50 = var49 | var2.method7737();
                        Statics.field2126.method2308(class73.field941, var50);
                    }
                    if (field556) {
                        Statics.field2126.method2302(class73.field941);
                    } else {
                        Statics.field2126.method2302((String) null);
                    }
                    class95.method3923();
                    field769 = var1.method6947();
                    field729 = var1.method6947() == 1;
                    field636 = var1.method6947();
                    field636 <<= 0x8;
                    field636 += var1.method6947();
                    field693 = var1.method6947();
                    var1.method6943(var2.field4917, 0, 8);
                    var2.field4915 = 0;
                    this.field560 = var2.method7958();
                    if (Statics.field4656 >= 29) {
                        var1.method6943(var2.field4917, 0, 8);
                        var2.field4915 = 0;
                        field638 = var2.method7958();
                    }
                    var1.method6943(var2.field4917, 0, 1);
                    var2.field4915 = 0;
                    class279[] var51 = Statics.method3310();
                    int var52 = var2.method7748();
                    if (var52 < 0 || var52 >= var51.length) {
                        throw new IOException(var52 + " " + var2.field4915);
                    }
                    field567.field1427 = var51[var52];
                    field567.field1430 = field567.field1427.field3221;
                    var1.method6943(var2.field4917, 0, 2);
                    var2.field4915 = 0;
                    field567.field1430 = var2.method7794();
                    try {
                        class28.method381(Statics.field1488, "zap");
                    } catch (Throwable var64) {
                    }
                    method700(16);
                }
                if (field508 != 16) {
                    if (field508 == 17 && var1.method6945() >= 2) {
                        var2.field4915 = 0;
                        var1.method6943(var2.field4917, 0, 2);
                        var2.field4915 = 0;
                        Statics.field1789 = var2.method7794();
                        method700(18);
                    }
                    if (field508 == 18 && var1.method6945() >= Statics.field1789) {
                        var2.field4915 = 0;
                        var1.method6943(var2.field4917, 0, Statics.field1789);
                        var2.field4915 = 0;
                        String var54 = var2.method7801();
                        String var55 = var2.method7801();
                        String var56 = var2.method7801();
                        class73.method3133(var54, var55, var56);
                        method2906(10);
                        if (field641.method8082()) {
                            class73.method146(9);
                        }
                    }
                    if (field508 == 19) {
                        if (field567.field1430 == -1) {
                            if (var1.method6945() < 2) {
                                return;
                            }
                            var1.method6943(var2.field4917, 0, 2);
                            var2.field4915 = 0;
                            field567.field1430 = var2.method7794();
                        }
                        if (var1.method6945() >= field567.field1430) {
                            var1.method6943(var2.field4917, 0, field567.field1430);
                            var2.field4915 = 0;
                            int var57 = field567.field1430;
                            field513.method6688();
                            field567.method2581();
                            field567.field1426.field4915 = 0;
                            field567.field1427 = null;
                            field567.field1432 = null;
                            field567.field1433 = null;
                            field567.field1434 = null;
                            field567.field1430 = 0;
                            field567.field1421 = 0;
                            field525 = 0;
                            method4760();
                            field584 = 0;
                            field761 = 0;
                            for (int var58 = 0; var58 < 2048; var58++) {
                                field635[var58] = null;
                            }
                            Statics.field1790 = null;
                            for (int var59 = 0; var59 < field753.length; var59++) {
                                class97 var60 = field753[var59];
                                if (var60 != null) {
                                    var60.field1212 = -1;
                                    var60.field1213 = false;
                                }
                            }
                            class82.method450();
                            method2906(30);
                            for (int var61 = 0; var61 < 100; var61++) {
                                field732[var61] = true;
                            }
                            class278 var62 = class278.method2890(class276.field3058, field567.field1425);
                            var62.field3177.method7789(method1127());
                            var62.field3177.method7776(Statics.field2331);
                            var62.field3177.method7776(Statics.field4300);
                            field567.method2603(var62);
                            class104.method4951(var2);
                            if (var2.field4915 != var57) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field649++;
                        if (field649 > 2000) {
                            if (field542 < 1) {
                                if (Statics.field180 == Statics.field1793) {
                                    Statics.field180 = Statics.field1654;
                                } else {
                                    Statics.field180 = Statics.field1793;
                                }
                                field542++;
                                method700(0);
                            } else {
                                Statics.method460(-3);
                            }
                        }
                    }
                } else if (var1.method6945() >= field567.field1430) {
                    var2.field4915 = 0;
                    var1.method6943(var2.field4917, 0, field567.field1430);
                    field513.method6692();
                    method2509();
                    class104.method4951(var2);
                    Statics.field102 = -1;
                    method2136(false, var2);
                    field567.field1427 = null;
                }
            }
        } catch (IOException var71) {
            if (field542 < 1) {
                if (Statics.field180 == Statics.field1793) {
                    Statics.field180 = Statics.field1654;
                } else {
                    Statics.field180 = Statics.field1793;
                }
                field542++;
                method700(0);
            } else {
                Statics.method460(-2);
            }
        }
    }

    @ObfuscatedName("dh.gn(I)V")
    public static void method2509() {
        field739 = 1L;
        Statics.field3041.field1097 = 0;
        Statics.field4911 = true;
        field586 = true;
        field680 = -1L;
        class38.field273 = new class354();
        field567.method2581();
        field567.field1426.field4915 = 0;
        field567.field1427 = null;
        field567.field1432 = null;
        field567.field1433 = null;
        field567.field1434 = null;
        field567.field1430 = 0;
        field567.field1421 = 0;
        field525 = 0;
        field568 = 0;
        field526 = 0;
        method4760();
        class37.method2208(0);
        class107.method5776();
        field674 = 0;
        field676 = false;
        field766 = 0;
        field589 = 0;
        field594 = 0;
        Statics.field242 = null;
        field584 = 0;
        field620 = -1;
        field761 = 0;
        field507 = 0;
        field534 = class100.field1346;
        field755 = class100.field1346;
        field563 = 0;
        class104.method6063();
        for (int var0 = 0; var0 < 2048; var0++) {
            field635[var0] = null;
        }
        for (int var1 = 0; var1 < 65536; var1++) {
            field753[var1] = null;
        }
        field647 = -1;
        field650.method6092();
        field640.method6092();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    field648[var2][var3][var4] = null;
                }
            }
        }
        field738 = new class352();
        Statics.field4582.method1705();
        for (int var5 = 0; var5 < Statics.field1923; var5++) {
            class178 var6 = class178.method2635(var5);
            if (var6 != null) {
                class296.field3444[var5] = 0;
                class296.field3445[var5] = 0;
            }
        }
        Statics.field2864.method2516();
        field701 = -1;
        if (field681 != -1) {
            class306.method3501(field681);
        }
        for (class84 var7 = (class84) field682.method7530(); var7 != null; var7 = (class84) field682.method7531()) {
            method72(var7, true);
        }
        field681 = -1;
        field682 = new class444(8);
        field687 = null;
        method4760();
        field552.method5264((int[]) null, new int[] { 0, 0, 0, 0, 0 }, 0, -1);
        for (int var8 = 0; var8 < 8; var8++) {
            field644[var8] = null;
            field645[var8] = false;
        }
        class82.method450();
        field518 = true;
        for (int var9 = 0; var9 < 100; var9++) {
            field732[var9] = true;
        }
        class278 var10 = class278.method2890(class276.field3058, field567.field1425);
        var10.field3177.method7789(method1127());
        var10.field3177.method7776(Statics.field2331);
        var10.field3177.method7776(Statics.field4300);
        field567.method2603(var10);
        Statics.field3324 = null;
        Statics.field115 = null;
        Arrays.fill(field754, (Object) null);
        Statics.field1959 = null;
        Arrays.fill(field633, (Object) null);
        for (int var11 = 0; var11 < 8; var11++) {
            field717[var11] = new class342();
        }
        Statics.field1057 = null;
    }

    @ObfuscatedName("cj.gk(I)V")
    public static final void method2206() {
        field567.method2585();
        method6064();
        Statics.field286.method4043();
        for (int var0 = 0; var0 < 4; var0++) {
            field577[var0].method3760();
        }
        field573.method3718();
        System.gc();
        class287.method6730(2);
        field764 = -1;
        field765 = false;
        class67.method2628();
        method2906(10);
    }

    @ObfuscatedName("ko.ga(II)V")
    public static final void method5270(int arg0) {
        method2206();
        switch(arg0) {
            case 1:
                class73.method6687();
                break;
            case 2:
                class73.method146(24);
                class73.method3133(class326.field3875, class326.field4063, class326.field4064);
        }
    }

    @ObfuscatedName("eu.gb(B)J")
    public static long method3018() {
        return field638;
    }

    @ObfuscatedName("mr.gt(I)V")
    public static final void method6064() {
        class198.method3016();
        class190.field2098.method4918();
        class181.method1094();
        class196.field2155.method4918();
        class196.field2184.method4918();
        class196.field2157.method4918();
        class196.field2158.method4918();
        class187.method6515();
        class197.field2257.method4918();
        class197.field2211.method4918();
        class197.field2212.method4918();
        class199.field2280.method4918();
        class199.field2281.method4918();
        class199.field2294.method4918();
        class189.method3004();
        class192.field2108.method4918();
        class178.method1095();
        Statics.field1659.method7620();
        Statics.field205.method7620();
        class195.method3313();
        class182.method4420();
        Statics.method4934();
        Statics.method2919();
        class179.field1929.method4918();
        class460.field4882.method4918();
        class462.method7195();
        field725.method4918();
        field800.method4918();
        class303.method480();
        class306.method3312();
        ((class222) Statics.field2491).method4238();
        class76.field997.method4918();
        field572.method6747();
        Statics.field1307.method5910();
        Statics.field48.method5910();
        Statics.field2101.method5910();
        Statics.field2933.method5910();
        Statics.field8.method5910();
        Statics.field1825.method5910();
        Statics.field3471.method5910();
        Statics.field1292.method5910();
        Statics.field2616.method5910();
        Statics.field1667.method5910();
        Statics.field124.method5910();
        Statics.field908.method5910();
        Statics.field4540.method5910();
    }

    @ObfuscatedName("hz.gc(I)V")
    public static final void method4229() {
        if (field568 > 0) {
            method2206();
        } else {
            field513.method6690();
            method2906(40);
            Statics.field84 = field567.method2587();
            field567.method2586();
        }
    }

    @ObfuscatedName("cx.gw(ZB)V")
    public static final void method2137(boolean arg0) {
        if (arg0) {
            field541 = class73.field931 ? class133.field1630 : class133.field1627;
        } else {
            field541 = Statics.field2126.method2309(class73.field941) ? class133.field1625 : class133.field1626;
        }
    }

    @ObfuscatedName("client.gg(I)V")
    public final void method1160() {
        if (field525 > 1) {
            field525--;
        }
        if (field568 > 0) {
            field568--;
        }
        if (field569) {
            field569 = false;
            method4229();
            return;
        }
        if (!field656) {
            method6801();
        }
        for (int var1 = 0; var1 < 100 && this.method1619(field567); var1++) {
        }
        if (field517 != 30) {
            return;
        }
        while (true) {
            class39 var2 = (class39) class38.field273.method6176();
            boolean var3;
            if (var2 == null) {
                var3 = false;
            } else {
                var3 = true;
            }
            if (!var3) {
                if (field513.field4453) {
                    class278 var6 = class278.method2890(class276.field3144, field567.field1425);
                    var6.field3177.method7789(0);
                    int var7 = var6.field3177.field4915;
                    field513.method6695(var6.field3177);
                    var6.field3177.method7864(var6.field3177.field4915 - var7);
                    field567.method2603(var6);
                    field513.method6693();
                }
                Object var8 = Statics.field3041.field1091;
                synchronized (Statics.field3041.field1091) {
                    if (!field675) {
                        Statics.field3041.field1097 = 0;
                    } else if (class37.field261 != 0 || Statics.field3041.field1097 >= 40) {
                        class278 var9 = null;
                        int var10 = 0;
                        int var11 = 0;
                        int var12 = 0;
                        int var13 = 0;
                        for (int var14 = 0; var14 < Statics.field3041.field1097 && (var9 == null || var9.field3177.field4915 - var10 < 246); var14++) {
                            var11 = var14;
                            int var15 = Statics.field3041.field1094[var14];
                            if (var15 < -1) {
                                var15 = -1;
                            } else if (var15 > 65534) {
                                var15 = 65534;
                            }
                            int var16 = Statics.field3041.field1093[var14];
                            if (var16 < -1) {
                                var16 = -1;
                            } else if (var16 > 65534) {
                                var16 = 65534;
                            }
                            if (field521 != var16 || field553 != var15) {
                                if (var9 == null) {
                                    var9 = class278.method2890(class276.field3122, field567.field1425);
                                    var9.field3177.method7789(0);
                                    var10 = var9.field3177.field4915;
                                    var9.field3177.field4915 += 2;
                                    var12 = 0;
                                    var13 = 0;
                                }
                                int var17;
                                int var18;
                                int var19;
                                if (field523 == -1L) {
                                    var17 = var16;
                                    var18 = var15;
                                    var19 = Integer.MAX_VALUE;
                                } else {
                                    var17 = var16 - field521;
                                    var18 = var15 - field553;
                                    var19 = (int) ((Statics.field3041.field1095[var14] - field523) / 20L);
                                    var12 = (int) ((Statics.field3041.field1095[var14] - field523) % 20L + (long) var12);
                                }
                                field521 = var16;
                                field553 = var15;
                                if (var19 < 8 && var17 >= -32 && var17 <= 31 && var18 >= -32 && var18 <= 31) {
                                    var17 += 32;
                                    var18 += 32;
                                    var9.field3177.method7776((var17 << 6) + (var19 << 12) + var18);
                                } else if (var19 < 32 && var17 >= -128 && var17 <= 127 && var18 >= -128 && var18 <= 127) {
                                    var17 += 128;
                                    var18 += 128;
                                    var9.field3177.method7789(var19 + 128);
                                    var9.field3177.method7776((var17 << 8) + var18);
                                } else if (var19 < 32) {
                                    var9.field3177.method7789(var19 + 192);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field3177.method7778(Integer.MIN_VALUE);
                                    } else {
                                        var9.field3177.method7778(var16 | var15 << 16);
                                    }
                                } else {
                                    var9.field3177.method7776((var19 & 0x1FFF) + 57344);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field3177.method7778(Integer.MIN_VALUE);
                                    } else {
                                        var9.field3177.method7778(var16 | var15 << 16);
                                    }
                                }
                                var13++;
                                field523 = Statics.field3041.field1095[var14];
                            }
                        }
                        if (var9 != null) {
                            var9.field3177.method7864(var9.field3177.field4915 - var10);
                            int var20 = var9.field3177.field4915;
                            var9.field3177.field4915 = var10;
                            var9.field3177.method7789(var12 / var13);
                            var9.field3177.method7789(var12 % var13);
                            var9.field3177.field4915 = var20;
                            field567.method2603(var9);
                        }
                        if (var11 >= Statics.field3041.field1097) {
                            Statics.field3041.field1097 = 0;
                        } else {
                            Statics.field3041.field1097 -= var11;
                            System.arraycopy(Statics.field3041.field1093, var11, Statics.field3041.field1093, 0, Statics.field3041.field1097);
                            System.arraycopy(Statics.field3041.field1094, var11, Statics.field3041.field1094, 0, Statics.field3041.field1097);
                            System.arraycopy(Statics.field3041.field1095, var11, Statics.field3041.field1095, 0, Statics.field3041.field1097);
                        }
                    }
                }
                if (class37.field261 == 1 || !Statics.field2773 && class37.field261 == 4 || class37.field261 == 2) {
                    long var22 = class37.field244 - field739 * -1L;
                    if (var22 > 32767L) {
                        var22 = 32767L;
                    }
                    field739 = class37.field244 * -1L;
                    int var24 = class37.field258;
                    if (var24 < 0) {
                        var24 = 0;
                    } else if (var24 > Statics.field4300) {
                        var24 = Statics.field4300;
                    }
                    int var25 = class37.field262;
                    if (var25 < 0) {
                        var25 = 0;
                    } else if (var25 > Statics.field2331) {
                        var25 = Statics.field2331;
                    }
                    int var26 = (int) var22;
                    class278 var27 = class278.method2890(class276.field3115, field567.field1425);
                    var27.field3177.method7776((class37.field261 == 2 ? 1 : 0) + (var26 << 1));
                    var27.field3177.method7776(var25);
                    var27.field3177.method7776(var24);
                    field567.method2603(var27);
                }
                if (field748.field2327 > 0) {
                    class278 var28 = class278.method2890(class276.field3049, field567.field1425);
                    var28.field3177.method7776(0);
                    int var29 = var28.field3177.field4915;
                    long var30 = Statics.method1118();
                    for (int var32 = 0; var32 < field748.field2327; var32++) {
                        long var33 = var30 - field680;
                        if (var33 > 16777215L) {
                            var33 = 16777215L;
                        }
                        field680 = var30;
                        var28.field3177.method7982((int) var33);
                        var28.field3177.method7789(field748.field2324[var32]);
                    }
                    var28.field3177.method7788(var28.field3177.field4915 - var29);
                    field567.method2603(var28);
                }
                if (field808 > 0) {
                    field808--;
                }
                if (field748.method3737(96) || field748.method3737(97) || field748.method3737(98) || field748.method3737(99)) {
                    field604 = true;
                }
                if (field604 && field808 <= 0) {
                    field808 = 20;
                    field604 = false;
                    class278 var35 = class278.method2890(class276.field3150, field567.field1425);
                    var35.field3177.method7776(field589);
                    var35.field3177.method7776(field588);
                    field567.method2603(var35);
                }
                if (Statics.field4911 && !field586) {
                    field586 = true;
                    class278 var36 = class278.method2890(class276.field3136, field567.field1425);
                    var36.field3177.method7789(1);
                    field567.method2603(var36);
                }
                if (!Statics.field4911 && field586) {
                    field586 = false;
                    class278 var37 = class278.method2890(class276.field3136, field567.field1425);
                    var37.field3177.method7789(0);
                    field567.method2603(var37);
                }
                if (Statics.field1973 != null) {
                    Statics.field1973.method7271();
                }
                if (Statics.field3320) {
                    if (Statics.field3324 != null) {
                        Statics.field3324.method6917();
                    }
                    method3168();
                    Statics.field3320 = false;
                }
                method420();
                method4803();
                if (field517 != 30) {
                    return;
                }
                for (class91 var38 = (class91) field738.method6086(); var38 != null; var38 = (class91) field738.method6088()) {
                    if (var38.field1174 > 0) {
                        var38.field1174--;
                    }
                    if (var38.field1174 == 0) {
                        if (var38.field1164 >= 0) {
                            int var39 = var38.field1164;
                            int var40 = var38.field1167;
                            class196 var41 = class196.method3208(var39);
                            if (var40 == 11) {
                                var40 = 10;
                            }
                            if (var40 >= 5 && var40 <= 8) {
                                var40 = 4;
                            }
                            boolean var42 = var41.method3518(var40);
                            if (!var42) {
                                continue;
                            }
                        }
                        method2732(var38.field1165, var38.field1172, var38.field1161, var38.field1173, var38.field1164, var38.field1176, var38.field1167);
                        var38.method7230();
                    } else {
                        if (var38.field1163 > 0) {
                            var38.field1163--;
                        }
                        if (var38.field1163 == 0 && var38.field1161 >= 1 && var38.field1173 >= 1 && var38.field1161 <= 102 && var38.field1173 <= 102 && (var38.field1168 < 0 || class79.method5812(var38.field1168, var38.field1170))) {
                            method2732(var38.field1165, var38.field1172, var38.field1161, var38.field1173, var38.field1168, var38.field1169, var38.field1170);
                            var38.field1163 = -1;
                            if (var38.field1168 == var38.field1164 && var38.field1164 == -1) {
                                var38.method7230();
                            } else if (var38.field1168 == var38.field1164 && var38.field1176 == var38.field1169 && var38.field1170 == var38.field1167) {
                                var38.method7230();
                            }
                        }
                    }
                }
                method2874();
                field567.field1421++;
                if (field567.field1421 > 750) {
                    method4229();
                    return;
                }
                Statics.method3511();
                for (int var43 = 0; var43 < field563; var43++) {
                    int var44 = field719[var43];
                    class97 var45 = field753[var44];
                    if (var45 != null) {
                        method3912(var45, var45.field1319.field2035);
                    }
                }
                int[] var46 = class104.field1375;
                for (int var47 = 0; var47 < class104.field1376; var47++) {
                    class89 var48 = field635[var46[var47]];
                    if (var48 != null && var48.field1249 > 0) {
                        var48.field1249--;
                        if (var48.field1249 == 0) {
                            var48.field1199 = null;
                        }
                    }
                }
                for (int var49 = 0; var49 < field563; var49++) {
                    int var50 = field719[var49];
                    class97 var51 = field753[var50];
                    if (var51 != null && var51.field1249 > 0) {
                        var51.field1249--;
                        if (var51.field1249 == 0) {
                            var51.field1199 = null;
                        }
                    }
                }
                field564++;
                if (field623 != 0) {
                    field601 += 20;
                    if (field601 >= 400) {
                        field623 = 0;
                    }
                }
                if (Statics.field3412 != null) {
                    field625++;
                    if (field625 >= 15) {
                        method1922(Statics.field3412);
                        Statics.field3412 = null;
                    }
                }
                class306 var52 = Statics.field3017;
                class306 var53 = Statics.field4471;
                Statics.field3017 = null;
                Statics.field4471 = null;
                field698 = null;
                field702 = false;
                field746 = false;
                field711 = 0;
                while (field748.method3742() && field711 < 128) {
                    if (field769 >= 2 && field748.method3737(82) && field748.field2329 == 66) {
                        String var54 = class107.method2263();
                        Statics.field1488.method488(var54);
                    } else if (field594 != 1 || field748.field2316 <= 0) {
                        field752[field711] = field748.field2329;
                        field775[field711] = field748.field2316;
                        field711++;
                    }
                }
                if (method3130() && field748.method3737(82) && field748.method3737(81) && field615 != 0) {
                    int var55 = Statics.field1790.field1143 - field615;
                    if (var55 < 0) {
                        var55 = 0;
                    } else if (var55 > 3) {
                        var55 = 3;
                    }
                    if (Statics.field1790.field1143 != var55) {
                        int var56 = Statics.field1780 + Statics.field1790.field1204[0];
                        int var57 = Statics.field4368 + Statics.field1790.field1252[0];
                        class278 var58 = class278.method2890(class276.field3121, field567.field1425);
                        var58.field3177.method7849(var57);
                        var58.field3177.method7820(var55);
                        var58.field3177.method7830(var56);
                        var58.field3177.method7843(0);
                        field567.method2603(var58);
                    }
                    field615 = 0;
                }
                if (class37.field261 == 1) {
                    field573.method3718();
                }
                if (field681 != -1) {
                    method6719(field681, 0, 0, Statics.field2331, Statics.field4300, 0, 0);
                }
                field706++;
                while (true) {
                    class85 var59;
                    class306 var60;
                    class306 var61;
                    do {
                        var59 = (class85) field726.method6084();
                        if (var59 == null) {
                            while (true) {
                                class85 var62;
                                class306 var63;
                                class306 var64;
                                do {
                                    var62 = (class85) field727.method6084();
                                    if (var62 == null) {
                                        while (true) {
                                            class85 var65;
                                            class306 var66;
                                            class306 var67;
                                            do {
                                                var65 = (class85) field583.method6084();
                                                if (var65 == null) {
                                                    while (true) {
                                                        while (true) {
                                                            class201 var68;
                                                            class306 var69;
                                                            do {
                                                                do {
                                                                    do {
                                                                        var68 = (class201) field728.method6084();
                                                                        if (var68 == null) {
                                                                            this.method1548();
                                                                            if (Statics.field1973 != null) {
                                                                                Statics.field1973.method7281(Statics.field4488, (Statics.field1790.field1243 >> 7) + Statics.field1780, (Statics.field1790.field1179 >> 7) + Statics.field4368, false);
                                                                                Statics.field1973.method7296();
                                                                            }
                                                                            if (field694 != null) {
                                                                                this.method1173();
                                                                            }
                                                                            if (Statics.field4390 != null) {
                                                                                method1922(Statics.field4390);
                                                                                field632++;
                                                                                if (class37.field253 == 0) {
                                                                                    if (field631) {
                                                                                        if (Statics.field4390 == Statics.field2982 && field799 != field619) {
                                                                                            class306 var75 = Statics.field4390;
                                                                                            byte var76 = 0;
                                                                                            if (field686 == 1 && var75.field3643 == 206) {
                                                                                                var76 = 1;
                                                                                            }
                                                                                            if (var75.field3535[field799] <= 0) {
                                                                                                var76 = 0;
                                                                                            }
                                                                                            int var77 = method3180(var75);
                                                                                            boolean var78 = (var77 >> 29 & 0x1) != 0;
                                                                                            if (var78) {
                                                                                                int var79 = field619;
                                                                                                int var80 = field799;
                                                                                                var75.field3535[var80] = var75.field3535[var79];
                                                                                                var75.field3581[var80] = var75.field3581[var79];
                                                                                                var75.field3535[var79] = -1;
                                                                                                var75.field3581[var79] = 0;
                                                                                            } else if (var76 == 1) {
                                                                                                int var81 = field619;
                                                                                                int var82 = field799;
                                                                                                while (var81 != var82) {
                                                                                                    if (var81 > var82) {
                                                                                                        var75.method5614(var81 - 1, var81);
                                                                                                        var81--;
                                                                                                    } else if (var81 < var82) {
                                                                                                        var75.method5614(var81 + 1, var81);
                                                                                                        var81++;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                var75.method5614(field799, field619);
                                                                                            }
                                                                                            class278 var83 = class278.method2890(class276.field3059, field567.field1425);
                                                                                            var83.field3177.method7843(Statics.field4390.field3635);
                                                                                            var83.field3177.method7849(field619);
                                                                                            var83.field3177.method7776(field799);
                                                                                            var83.field3177.method7822(var76);
                                                                                            field567.method2603(var83);
                                                                                        }
                                                                                    } else if (this.method1167()) {
                                                                                        this.method1168(field628, field629);
                                                                                    } else if (field657 > 0) {
                                                                                        method4453(field628, field629);
                                                                                    }
                                                                                    field625 = 10;
                                                                                    class37.field261 = 0;
                                                                                    Statics.field4390 = null;
                                                                                } else if (field632 >= 5 && (class37.field254 > field628 + 5 || class37.field254 < field628 - 5 || class37.field249 > field629 + 5 || class37.field249 < field629 - 5)) {
                                                                                    field631 = true;
                                                                                }
                                                                            }
                                                                            if (class216.method4082()) {
                                                                                int var84 = class216.field2565;
                                                                                int var85 = class216.field2569;
                                                                                class278 var86 = class278.method2890(class276.field3084, field567.field1425);
                                                                                var86.field3177.method7789(5);
                                                                                var86.field3177.method7822(field748.method3737(82) ? (field748.method3737(81) ? 2 : 1) : 0);
                                                                                var86.field3177.method7849(Statics.field1780 + var84);
                                                                                var86.field3177.method7830(Statics.field4368 + var85);
                                                                                field567.method2603(var86);
                                                                                class216.method4083();
                                                                                field582 = class37.field262;
                                                                                field515 = class37.field258;
                                                                                field623 = 1;
                                                                                field601 = 0;
                                                                                field761 = var84;
                                                                                field507 = var85;
                                                                            }
                                                                            if (Statics.field3017 != var52) {
                                                                                if (var52 != null) {
                                                                                    method1922(var52);
                                                                                }
                                                                                if (Statics.field3017 != null) {
                                                                                    method1922(Statics.field3017);
                                                                                }
                                                                            }
                                                                            if (Statics.field4471 != var53 && field554 == field522) {
                                                                                if (var53 != null) {
                                                                                    method1922(var53);
                                                                                }
                                                                                if (Statics.field4471 != null) {
                                                                                    method1922(Statics.field4471);
                                                                                }
                                                                            }
                                                                            if (Statics.field4471 == null) {
                                                                                if (field554 > 0) {
                                                                                    field554--;
                                                                                }
                                                                            } else if (field554 < field522) {
                                                                                field554++;
                                                                                if (field554 == field522) {
                                                                                    method1922(Statics.field4471);
                                                                                }
                                                                            }
                                                                            method71();
                                                                            if (field773) {
                                                                                method444();
                                                                            } else if (field772) {
                                                                                int var87 = Statics.field1788 * 128 + 64;
                                                                                int var88 = Statics.field209 * 128 + 64;
                                                                                int var89 = method3401(var87, var88, Statics.field4488) - Statics.field1002;
                                                                                method4952(var87, var89, var88);
                                                                                int var90 = Statics.field1443 * 128 + 64;
                                                                                int var91 = Statics.field1719 * 128 + 64;
                                                                                int var92 = method3401(var90, var91, Statics.field4488) - Statics.field1399;
                                                                                int var93 = var90 - Statics.field1710;
                                                                                int var94 = var92 - Statics.field4643;
                                                                                int var95 = var91 - Statics.field1798;
                                                                                int var96 = (int) Math.sqrt((double) (var93 * var93 + var95 * var95));
                                                                                int var97 = (int) (Math.atan2((double) var94, (double) var96) * 325.9490051269531D) & 0x7FF;
                                                                                int var98 = (int) (Math.atan2((double) var93, (double) var95) * -325.9490051269531D) & 0x7FF;
                                                                                method3038(var97, var98);
                                                                            }
                                                                            for (int var99 = 0; var99 < 5; var99++) {
                                                                                int var10002 = field618[var99]++;
                                                                            }
                                                                            Statics.field2864.method2532();
                                                                            int var100 = ++class37.field264 - 1;
                                                                            int var102 = class36.method3166();
                                                                            if (var100 > 15000 && var102 > 15000) {
                                                                                field568 = 250;
                                                                                class37.method2208(14500);
                                                                                class278 var103 = class278.method2890(class276.field3125, field567.field1425);
                                                                                field567.method2603(var103);
                                                                            }
                                                                            Statics.field4582.method1704();
                                                                            field567.field1428++;
                                                                            if (field567.field1428 > 50) {
                                                                                class278 var104 = class278.method2890(class276.field3130, field567.field1425);
                                                                                field567.method2603(var104);
                                                                            }
                                                                            try {
                                                                                field567.method2594();
                                                                            } catch (IOException var106) {
                                                                                method4229();
                                                                            }
                                                                            return;
                                                                        }
                                                                    } while (var68 == null);
                                                                } while (var68.field2313 == null);
                                                                if (var68.field2313.field3543 < 0) {
                                                                    break;
                                                                }
                                                                var69 = Statics.method3181(var68.field2313.field3561);
                                                            } while (var69 == null || var69.field3684 == null || var69.field3684.length == 0 || var68.field2313.field3543 >= var69.field3684.length || var69.field3684[var68.field2313.field3543] != var68.field2313);
                                                            if (var68.field2313.field3679 == 11 && var68.field2308 == 0) {
                                                                switch(var68.field2313.method5588()) {
                                                                    case 0:
                                                                        class33.method6066(var68.field2313.method5591(), true, false);
                                                                        break;
                                                                    case 1:
                                                                        int var70 = method3180(var68.field2313);
                                                                        boolean var71 = (var70 >> 22 & 0x1) != 0;
                                                                        if (var71) {
                                                                            int[] var72 = var68.field2313.method5592();
                                                                            if (var72 != null) {
                                                                                class278 var73 = class278.method2890(class276.field3155, field567.field1425);
                                                                                var73.field3177.method7841(var72[2]);
                                                                                var73.field3177.method7778(var68.field2313.field3635);
                                                                                var73.field3177.method7841(var68.field2313.method5590());
                                                                                var73.field3177.method7778(var72[1]);
                                                                                var73.field3177.method7776(var68.field2313.field3543);
                                                                                var73.field3177.method7843(var72[0]);
                                                                                field567.method2603(var73);
                                                                            }
                                                                        }
                                                                }
                                                            } else if (var68.field2313.field3679 == 12) {
                                                                class304 var74 = var68.field2313.method5581();
                                                                if (var74 != null && var74.method5292()) {
                                                                    switch(var68.field2308) {
                                                                        case 0:
                                                                            field573.method3716(var68.field2313);
                                                                            var74.method5294(true);
                                                                            var74.method5333(var68.field2312, var68.field2311, field748.method3737(82), field748.method3737(81));
                                                                            break;
                                                                        case 1:
                                                                            var74.method5516(var68.field2312, var68.field2311);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                var66 = var65.field1077;
                                                if (var66.field3543 < 0) {
                                                    break;
                                                }
                                                var67 = Statics.method3181(var66.field3561);
                                            } while (var67 == null || var67.field3684 == null || var66.field3543 >= var67.field3684.length || var67.field3684[var66.field3543] != var66);
                                            class68.method3219(var65);
                                        }
                                    }
                                    var63 = var62.field1077;
                                    if (var63.field3543 < 0) {
                                        break;
                                    }
                                    var64 = Statics.method3181(var63.field3561);
                                } while (var64 == null || var64.field3684 == null || var63.field3543 >= var64.field3684.length || var64.field3684[var63.field3543] != var63);
                                class68.method3219(var62);
                            }
                        }
                        var60 = var59.field1077;
                        if (var60.field3543 < 0) {
                            break;
                        }
                        var61 = Statics.method3181(var60.field3561);
                    } while (var61 == null || var61.field3684 == null || var60.field3543 >= var61.field3684.length || var61.field3684[var60.field3543] != var60);
                    class68.method3219(var59);
                }
            }
            class278 var4 = class278.method2890(class276.field3137, field567.field1425);
            var4.field3177.method7789(0);
            int var5 = var4.field3177.field4915;
            class38.method4416(var4.field3177);
            var4.field3177.method7864(var4.field3177.field4915 - var5);
            field567.method2603(var4);
        }
    }

    @ObfuscatedName("client.gs(S)V")
    public static final void method1542() {
        if (Statics.field1460 != null) {
            Statics.field1460.method809();
        }
        if (Statics.field1361 != null) {
            Statics.field1361.method809();
        }
    }

    @ObfuscatedName("ew.gx(I)V")
    public static final void method2874() {
        for (int var0 = 0; var0 < field766; var0++) {
            int var10002 = field796[var0]--;
            if (field796[var0] >= -10) {
                class41 var2 = field576[var0];
                if (var2 == null) {
                    class41 var10000 = (class41) null;
                    var2 = class41.method747(Statics.field2933, field767[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field796[var0] += var2.method750();
                    field576[var0] = var2;
                }
                if (field796[var0] < 0) {
                    int var9;
                    if (field622[var0] == 0) {
                        var9 = Statics.field2126.method2299();
                    } else {
                        int var3 = (field622[var0] & 0xFF) * 128;
                        int var4 = field622[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field1790.field1243;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field622[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field1790.field1179;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field796[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = (var3 - var8) * Statics.field2126.method2379() / var3;
                    }
                    if (var9 > 0) {
                        class42 var10 = var2.method749().method760(Statics.field127);
                        class49 var11 = class49.method864(var10, 100, var9);
                        var11.method866(field768[var0] - 1);
                        Statics.field498.method707(var11);
                    }
                    field796[var0] = -100;
                }
            } else {
                field766--;
                for (int var1 = var0; var1 < field766; var1++) {
                    field767[var1] = field767[var1 + 1];
                    field576[var1] = field576[var1 + 1];
                    field768[var1] = field768[var1 + 1];
                    field796[var1] = field796[var1 + 1];
                    field622[var1] = field622[var1 + 1];
                }
                var0--;
            }
        }
        if (field765 && !class287.method3040()) {
            if (Statics.field2126.method2298() != 0 && field764 != -1) {
                class287.method417(Statics.field1825, field764, 0, Statics.field2126.method2298(), false);
            }
            field765 = false;
        }
    }

    @ObfuscatedName("nc.gy(Lga;IIIB)V")
    public static void method6798(class199 arg0, int arg1, int arg2, int arg3) {
        if (field766 >= 50 || Statics.field2126.method2379() == 0 || arg0.field2290 == null || arg1 >= arg0.field2290.length) {
            return;
        }
        int var4 = arg0.field2290[arg1];
        if (var4 == 0) {
            return;
        }
        int var7 = var4 >> 8;
        int var8 = var4 >> 4 & 0x7;
        int var9 = var4 & 0xF;
        field767[field766] = var7;
        field768[field766] = var8;
        field796[field766] = 0;
        field576[field766] = null;
        int var10 = (arg2 - 64) / 128;
        int var11 = (arg3 - 64) / 128;
        field622[field766] = (var10 << 16) + (var11 << 8) + var9;
        field766++;
    }

    @ObfuscatedName("c.gi(Lga;IIIS)V")
    public static void method284(class199 arg0, int arg1, int arg2, int arg3) {
        if (field766 >= 50 || Statics.field2126.method2379() == 0 || arg0.field2284 == null || !arg0.field2284.containsKey(arg1)) {
            return;
        }
        int var4 = (Integer) arg0.field2284.get(arg1);
        if (var4 == 0) {
            return;
        }
        int var7 = var4 >> 8;
        int var8 = var4 >> 4 & 0x7;
        int var9 = var4 & 0xF;
        field767[field766] = var7;
        field768[field766] = var8;
        field796[field766] = 0;
        field576[field766] = null;
        int var10 = (arg2 - 64) / 128;
        int var11 = (arg3 - 64) / 128;
        field622[field766] = (var10 << 16) + (var11 << 8) + var9;
        field766++;
    }

    @ObfuscatedName("fh.hx(IB)V")
    public static void method3170(int arg0) {
        if (arg0 == -1 && !field765) {
            class287.method34();
        } else if (arg0 != -1 && field764 != arg0 && Statics.field2126.method2298() != 0 && !field765) {
            class331 var1 = Statics.field1825;
            int var2 = Statics.field2126.method2298();
            class287.field3347 = 1;
            Statics.field3520 = var1;
            Statics.field1446 = arg0;
            Statics.field3350 = 0;
            Statics.field4918 = var2;
            Statics.field1706 = false;
            Statics.field3349 = 2;
        }
        field764 = arg0;
    }

    @ObfuscatedName("a.ho(IIB)V")
    public static void method188(int arg0, int arg1) {
        if (Statics.field2126.method2298() != 0 && arg0 != -1) {
            class287.method417(Statics.field124, arg0, 0, Statics.field2126.method2298(), false);
            field765 = true;
        }
    }

    @ObfuscatedName("am.he(B)V")
    public static final void method420() {
        if (!Statics.field4573) {
            return;
        }
        for (int var0 = 0; var0 < class104.field1376; var0++) {
            class89 var1 = field635[class104.field1375[var0]];
            var1.method2171();
        }
        Statics.field4573 = false;
    }

    @ObfuscatedName("ib.hm(I)V")
    public static final void method4803() {
        if (Statics.field4488 == field620) {
            return;
        }
        field620 = Statics.field4488;
        int var0 = Statics.field4488;
        int[] var1 = Statics.field2817.field5021;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class79.field1035[var0][var6][var4] & 0x18) == 0) {
                    Statics.field286.method4077(var1, var5, 512, var0, var6, var4);
                }
                if (var0 < 3 && (class79.field1035[var0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field286.method4077(var1, var5, 512, var0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field2817.method8242();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class79.field1035[var0][var10][var9] & 0x18) == 0) {
                    method3291(var0, var10, var9, var7, var8);
                }
                if (var0 < 3 && (class79.field1035[var0 + 1][var10][var9] & 0x8) != 0) {
                    method3291(var0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field757 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                long var13 = Statics.field286.method4072(Statics.field4488, var11, var12);
                if (var13 != 0L) {
                    int var15 = class225.method4236(var13);
                    int var16 = class196.method3208(var15).field2181;
                    if (var16 >= 0 && class179.method3153(var16).field1941) {
                        field760[field757] = class179.method3153(var16).method3214(false);
                        field758[field757] = var11;
                        field759[field757] = var12;
                        field757++;
                    }
                }
            }
        }
        Statics.field2354.method8188();
    }

    @ObfuscatedName("y.hi(Lkd;IIB)V")
    public static final void method307(class306 arg0, int arg1, int arg2) {
        if (field584 != 0 && field584 != 3 || field656 || !(class37.field261 == 1 || !Statics.field2773 && class37.field261 == 4)) {
            return;
        }
        class295 var3 = arg0.method5579(true);
        if (var3 == null) {
            return;
        }
        int var4 = class37.field262 - arg1;
        int var5 = class37.field258 - arg2;
        if (!var3.method5209(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field3438 / 2;
        int var7 = var5 - var3.field3439 / 2;
        int var8 = field589 & 0x7FF;
        int var9 = class213.field2486[var8];
        int var10 = class213.field2509[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field1790.field1243 + var11 >> 7;
        int var14 = Statics.field1790.field1179 - var12 >> 7;
        class278 var15 = class278.method2890(class276.field3098, field567.field1425);
        var15.field3177.method7789(18);
        var15.field3177.method7822(field748.method3737(82) ? (field748.method3737(81) ? 2 : 1) : 0);
        var15.field3177.method7849(Statics.field1780 + var13);
        var15.field3177.method7830(Statics.field4368 + var14);
        var15.field3177.method7789(var6);
        var15.field3177.method7789(var7);
        var15.field3177.method7776(field589);
        var15.field3177.method7789(57);
        var15.field3177.method7789(0);
        var15.field3177.method7789(0);
        var15.field3177.method7789(89);
        var15.field3177.method7776(Statics.field1790.field1243);
        var15.field3177.method7776(Statics.field1790.field1179);
        var15.field3177.method7789(63);
        field567.method2603(var15);
        field761 = var13;
        field507 = var14;
    }

    @ObfuscatedName("ei.hn(Ljava/lang/String;I)V")
    public static final void method3007(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field2126.method2359(!Statics.field2126.method2285());
            if (Statics.field2126.method2285()) {
                class107.method3247(99, "", "Roofs are now all hidden");
            } else {
                class107.method3247(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            Statics.field2126.method2306();
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            field546 = !field546;
        }
        if (arg0.equalsIgnoreCase("mouseovertext")) {
            field669 = !field669;
        }
        if (field769 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equalsIgnoreCase("showcoord")) {
                Statics.field1973.field4791 = !Statics.field1973.field4791;
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                Statics.field2126.method2343(true);
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                Statics.field2126.method2343(false);
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method4229();
            }
        }
        class278 var1 = class278.method2890(class276.field3085, field567.field1425);
        var1.field3177.method7789(arg0.length() + 1);
        var1.field3177.method7782(arg0);
        field567.method2603(var1);
    }

    @ObfuscatedName("au.hc(I)V")
    public static final void method444() {
        method4952(Statics.field1368, Statics.field2617, Statics.field3343);
        method3038(Statics.field2068, Statics.field1366);
        if (Statics.field1710 != Statics.field1368 || Statics.field4643 != Statics.field2617 || Statics.field3343 != Statics.field1798 || Statics.field2068 != Statics.field1332 || Statics.field1599 != Statics.field1366) {
            return;
        }
        field773 = false;
        field772 = false;
        Statics.field1443 = 0;
        Statics.field1719 = 0;
        Statics.field1399 = 0;
        Statics.field4648 = 0;
        Statics.field1284 = 0;
        Statics.field2482 = 0;
        Statics.field182 = 0;
        Statics.field1788 = 0;
        Statics.field209 = 0;
        Statics.field1002 = 0;
    }

    @ObfuscatedName("jo.hf(IIIB)V")
    public static final void method4952(int arg0, int arg1, int arg2) {
        if (Statics.field1710 < arg0) {
            Statics.field1710 += Statics.field2482 * (arg0 - Statics.field1710) / 1000 + Statics.field182;
            if (Statics.field1710 > arg0) {
                Statics.field1710 = arg0;
            }
        }
        if (Statics.field1710 > arg0) {
            Statics.field1710 -= Statics.field2482 * (Statics.field1710 - arg0) / 1000 + Statics.field182;
            if (Statics.field1710 < arg0) {
                Statics.field1710 = arg0;
            }
        }
        if (Statics.field4643 < arg1) {
            Statics.field4643 += Statics.field2482 * (arg1 - Statics.field4643) / 1000 + Statics.field182;
            if (Statics.field4643 > arg1) {
                Statics.field4643 = arg1;
            }
        }
        if (Statics.field4643 > arg1) {
            Statics.field4643 -= Statics.field2482 * (Statics.field4643 - arg1) / 1000 + Statics.field182;
            if (Statics.field4643 < arg1) {
                Statics.field4643 = arg1;
            }
        }
        if (Statics.field1798 < arg2) {
            Statics.field1798 += Statics.field2482 * (arg2 - Statics.field1798) / 1000 + Statics.field182;
            if (Statics.field1798 > arg2) {
                Statics.field1798 = arg2;
            }
        }
        if (Statics.field1798 > arg2) {
            Statics.field1798 -= Statics.field2482 * (Statics.field1798 - arg2) / 1000 + Statics.field182;
            if (Statics.field1798 < arg2) {
                Statics.field1798 = arg2;
            }
        }
    }

    @ObfuscatedName("fa.hr(IIB)V")
    public static final void method3038(int arg0, int arg1) {
        if (arg0 < 128) {
            arg0 = 128;
        }
        if (arg0 > 383) {
            arg0 = 383;
        }
        if (Statics.field1332 < arg0) {
            Statics.field1332 += Statics.field1284 * (arg0 - Statics.field1332) / 1000 + Statics.field4648;
            if (Statics.field1332 > arg0) {
                Statics.field1332 = arg0;
            }
        }
        if (Statics.field1332 > arg0) {
            Statics.field1332 -= Statics.field1284 * (Statics.field1332 - arg0) / 1000 + Statics.field4648;
            if (Statics.field1332 < arg0) {
                Statics.field1332 = arg0;
            }
        }
        int var2 = arg1 - Statics.field1599;
        if (var2 > 1024) {
            var2 -= 2048;
        }
        if (var2 < -1024) {
            var2 += 2048;
        }
        if (var2 > 0) {
            Statics.field1599 += Statics.field1284 * var2 / 1000 + Statics.field4648;
            Statics.field1599 &= 0x7FF;
        }
        if (var2 < 0) {
            Statics.field1599 -= Statics.field1284 * -var2 / 1000 + Statics.field4648;
            Statics.field1599 &= 0x7FF;
        }
        int var3 = arg1 - Statics.field1599;
        if (var3 > 1024) {
            var3 -= 2048;
        }
        if (var3 < -1024) {
            var3 += 2048;
        }
        if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) {
            Statics.field1599 = arg1;
        }
    }

    @ObfuscatedName("b.hz(I)V")
    public static final void method71() {
        if (field594 == 0) {
            int var0 = Statics.field1790.field1243;
            int var1 = Statics.field1790.field1179;
            if (Statics.field162 - var0 < -500 || Statics.field162 - var0 > 500 || Statics.field85 - var1 < -500 || Statics.field85 - var1 > 500) {
                Statics.field162 = var0;
                Statics.field85 = var1;
            }
            if (Statics.field162 != var0) {
                Statics.field162 += (var0 - Statics.field162) / 16;
            }
            if (Statics.field85 != var1) {
                Statics.field85 += (var1 - Statics.field85) / 16;
            }
            int var2 = Statics.field162 >> 7;
            int var3 = Statics.field85 >> 7;
            int var4 = method3401(Statics.field162, Statics.field85, Statics.field4488);
            int var5 = 0;
            if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                        int var8 = Statics.field4488;
                        if (var8 < 3 && (class79.field1035[1][var6][var7] & 0x2) == 2) {
                            var8++;
                        }
                        int var9 = var4 - class79.field1027[var8][var6][var7];
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
            if (var10 > field605) {
                field605 += (var10 - field605) / 24;
            } else if (var10 < field605) {
                field605 += (var10 - field605) / 80;
            }
            Statics.field499 = method3401(Statics.field1790.field1243, Statics.field1790.field1179, Statics.field4488) - field750;
        } else if (field594 == 1) {
            if (field530 && Statics.field1790 != null) {
                int var11 = Statics.field1790.field1204[0];
                int var12 = Statics.field1790.field1252[0];
                if (var11 >= 0 && var12 >= 0 && var11 < 104 && var12 < 104) {
                    Statics.field162 = Statics.field1790.field1243;
                    int var13 = method3401(Statics.field1790.field1243, Statics.field1790.field1179, Statics.field4488) - field750;
                    if (var13 < Statics.field499) {
                        Statics.field499 = var13;
                    }
                    Statics.field85 = Statics.field1790.field1179;
                    field530 = false;
                }
            }
            short var14 = -1;
            if (field748.method3737(33)) {
                var14 = 0;
            } else if (field748.method3737(49)) {
                var14 = 1024;
            }
            if (field748.method3737(48)) {
                if (var14 == 0) {
                    var14 = 1792;
                } else if (var14 == 1024) {
                    var14 = 1280;
                } else {
                    var14 = 1536;
                }
            } else if (field748.method3737(50)) {
                if (var14 == 0) {
                    var14 = 256;
                } else if (var14 == 1024) {
                    var14 = 768;
                } else {
                    var14 = 512;
                }
            }
            byte var15 = 0;
            if (field748.method3737(35)) {
                var15 = -1;
            } else if (field748.method3737(51)) {
                var15 = 1;
            }
            int var16 = 0;
            if (var14 >= 0 || var15 != 0) {
                int var17 = field748.method3737(81) ? field600 : field661;
                var16 = var17 * 16;
                field597 = var14;
                field598 = var15;
            }
            if (field639 < var16) {
                field639 += var16 / 8;
                if (field639 > var16) {
                    field639 = var16;
                }
            } else if (field639 > var16) {
                field639 = field639 * 9 / 10;
            }
            if (field639 > 0) {
                int var18 = field639 / 16;
                if (field597 >= 0) {
                    int var19 = field597 - Statics.field1599 & 0x7FF;
                    int var20 = class213.field2486[var19];
                    int var21 = class213.field2509[var19];
                    Statics.field162 += var18 * var20 / 65536;
                    Statics.field85 += var18 * var21 / 65536;
                }
                if (field598 != 0) {
                    Statics.field499 += field598 * var18;
                    if (Statics.field499 > 0) {
                        Statics.field499 = 0;
                    }
                }
            } else {
                field597 = -1;
                field598 = -1;
            }
            if (field748.method3737(13)) {
                field567.method2603(class278.method2890(class276.field3074, field567.field1425));
                field594 = 0;
            }
        }
        if (class37.field253 == 4 && Statics.field2773) {
            int var22 = class37.field249 - field593;
            field664 = var22 * 2;
            field593 = var22 == -1 || var22 == 1 ? class37.field249 : (field593 + class37.field249) / 2;
            int var23 = field592 - class37.field254;
            field590 = var23 * 2;
            field592 = var23 == -1 || var23 == 1 ? class37.field254 : (field592 + class37.field254) / 2;
        } else {
            if (field748.method3737(96)) {
                field590 += (-24 - field590) / 2;
            } else if (field748.method3737(97)) {
                field590 += (24 - field590) / 2;
            } else {
                field590 /= 2;
            }
            if (field748.method3737(98)) {
                field664 += (12 - field664) / 2;
            } else if (field748.method3737(99)) {
                field664 += (-12 - field664) / 2;
            } else {
                field664 /= 2;
            }
            field593 = class37.field249;
            field592 = class37.field254;
        }
        field589 = field590 / 2 + field589 & 0x7FF;
        field588 += field664 / 2;
        if (field588 < 128) {
            field588 = 128;
        }
        if (field588 > 383) {
            field588 = 383;
        }
    }

    @ObfuscatedName("hs.hv(Lct;IB)V")
    public static final void method3912(class92 arg0, int arg1) {
        if (arg0.field1234 >= field519) {
            method4933(arg0);
        } else if (arg0.field1235 >= field519) {
            boolean var2 = field519 == arg0.field1235 || arg0.field1220 == -1 || arg0.field1223 != 0;
            if (!var2) {
                class199 var3 = class199.method4223(arg0.field1220);
                if (var3 == null || var3.method3671()) {
                    var2 = true;
                } else {
                    var2 = arg0.field1222 + 1 > var3.field2289[arg0.field1211];
                }
            }
            if (var2) {
                int var4 = arg0.field1235 - arg0.field1234;
                int var5 = field519 - arg0.field1234;
                int var6 = arg0.field1197 * 128 + arg0.field1182 * 64;
                int var7 = arg0.field1186 * 128 + arg0.field1182 * 64;
                int var8 = arg0.field1231 * 128 + arg0.field1182 * 64;
                int var9 = arg0.field1214 * 128 + arg0.field1182 * 64;
                arg0.field1243 = ((var4 - var5) * var6 + var5 * var8) / var4;
                arg0.field1179 = ((var4 - var5) * var7 + var5 * var9) / var4;
            }
            arg0.field1240 = 0;
            arg0.field1245 = arg0.field1236;
            arg0.field1193 = arg0.field1245;
        } else {
            arg0.field1216 = arg0.field1184;
            if (arg0.field1178 == 0) {
                arg0.field1240 = 0;
            } else {
                label498: {
                    if (arg0.field1220 != -1 && arg0.field1223 == 0) {
                        class199 var10 = class199.method4223(arg0.field1220);
                        if (arg0.field1253 > 0 && var10.field2291 == 0) {
                            arg0.field1240++;
                            break label498;
                        }
                        if (arg0.field1253 <= 0 && var10.field2285 == 0) {
                            arg0.field1240++;
                            break label498;
                        }
                    }
                    int var11 = arg0.field1243;
                    int var12 = arg0.field1179;
                    int var13 = arg0.field1204[arg0.field1178 - 1] * 128 + arg0.field1182 * 64;
                    int var14 = arg0.field1252[arg0.field1178 - 1] * 128 + arg0.field1182 * 64;
                    if (var11 < var13) {
                        if (var12 < var14) {
                            arg0.field1245 = 1280;
                        } else if (var12 > var14) {
                            arg0.field1245 = 1792;
                        } else {
                            arg0.field1245 = 1536;
                        }
                    } else if (var11 > var13) {
                        if (var12 < var14) {
                            arg0.field1245 = 768;
                        } else if (var12 > var14) {
                            arg0.field1245 = 256;
                        } else {
                            arg0.field1245 = 512;
                        }
                    } else if (var12 < var14) {
                        arg0.field1245 = 1024;
                    } else if (var12 > var14) {
                        arg0.field1245 = 0;
                    }
                    class205 var15 = arg0.field1232[arg0.field1178 - 1];
                    if (var13 - var11 <= 256 && var13 - var11 >= -256 && var14 - var12 <= 256 && var14 - var12 >= -256) {
                        int var16 = arg0.field1245 - arg0.field1193 & 0x7FF;
                        if (var16 > 1024) {
                            var16 -= 2048;
                        }
                        int var17 = arg0.field1248;
                        if (var16 >= -256 && var16 <= 256) {
                            var17 = arg0.field1187;
                        } else if (var16 >= 256 && var16 < 768) {
                            var17 = arg0.field1190;
                        } else if (var16 >= -768 && var16 <= -256) {
                            var17 = arg0.field1205;
                        }
                        if (var17 == -1) {
                            var17 = arg0.field1187;
                        }
                        arg0.field1216 = var17;
                        int var18 = 4;
                        boolean var19 = true;
                        if (arg0 instanceof class97) {
                            var19 = ((class97) arg0).field1319.field2063;
                        }
                        if (var19) {
                            if (arg0.field1245 != arg0.field1193 && arg0.field1212 == -1 && arg0.field1250 != 0) {
                                var18 = 2;
                            }
                            if (arg0.field1178 > 2) {
                                var18 = 6;
                            }
                            if (arg0.field1178 > 3) {
                                var18 = 8;
                            }
                            if (arg0.field1240 > 0 && arg0.field1178 > 1) {
                                var18 = 8;
                                arg0.field1240--;
                            }
                        } else {
                            if (arg0.field1178 > 1) {
                                var18 = 6;
                            }
                            if (arg0.field1178 > 2) {
                                var18 = 8;
                            }
                            if (arg0.field1240 > 0 && arg0.field1178 > 1) {
                                var18 = 8;
                                arg0.field1240--;
                            }
                        }
                        if (class205.field2358 == var15) {
                            var18 <<= 0x1;
                        } else if (class205.field2357 == var15) {
                            var18 >>= 0x1;
                        }
                        if (var18 >= 8) {
                            if (arg0.field1216 == arg0.field1187 && arg0.field1181 != -1) {
                                arg0.field1216 = arg0.field1181;
                            } else if (arg0.field1248 == arg0.field1216 && arg0.field1192 != -1) {
                                arg0.field1216 = arg0.field1192;
                            } else if (arg0.field1216 == arg0.field1205 && arg0.field1202 != -1) {
                                arg0.field1216 = arg0.field1202;
                            } else if (arg0.field1216 == arg0.field1190 && arg0.field1194 != -1) {
                                arg0.field1216 = arg0.field1194;
                            }
                        } else if (var18 <= 1) {
                            if (arg0.field1216 == arg0.field1187 && arg0.field1195 != -1) {
                                arg0.field1216 = arg0.field1195;
                            } else if (arg0.field1248 == arg0.field1216 && arg0.field1196 != -1) {
                                arg0.field1216 = arg0.field1196;
                            } else if (arg0.field1216 == arg0.field1205 && arg0.field1227 != -1) {
                                arg0.field1216 = arg0.field1227;
                            } else if (arg0.field1216 == arg0.field1190 && arg0.field1198 != -1) {
                                arg0.field1216 = arg0.field1198;
                            }
                        }
                        if (var11 != var13 || var12 != var14) {
                            if (var11 < var13) {
                                arg0.field1243 += var18;
                                if (arg0.field1243 > var13) {
                                    arg0.field1243 = var13;
                                }
                            } else if (var11 > var13) {
                                arg0.field1243 -= var18;
                                if (arg0.field1243 < var13) {
                                    arg0.field1243 = var13;
                                }
                            }
                            if (var12 < var14) {
                                arg0.field1179 += var18;
                                if (arg0.field1179 > var14) {
                                    arg0.field1179 = var14;
                                }
                            } else if (var12 > var14) {
                                arg0.field1179 -= var18;
                                if (arg0.field1179 < var14) {
                                    arg0.field1179 = var14;
                                }
                            }
                        }
                        if (arg0.field1243 == var13 && arg0.field1179 == var14) {
                            arg0.field1178--;
                            if (arg0.field1253 > 0) {
                                arg0.field1253--;
                            }
                        }
                    } else {
                        arg0.field1243 = var13;
                        arg0.field1179 = var14;
                        arg0.field1178--;
                        if (arg0.field1253 > 0) {
                            arg0.field1253--;
                        }
                    }
                }
            }
        }
        if (arg0.field1243 < 128 || arg0.field1179 < 128 || arg0.field1243 >= 13184 || arg0.field1179 >= 13184) {
            arg0.field1220 = -1;
            arg0.field1225 = -1;
            arg0.field1234 = 0;
            arg0.field1235 = 0;
            arg0.field1243 = arg0.field1204[0] * 128 + arg0.field1182 * 64;
            arg0.field1179 = arg0.field1252[0] * 128 + arg0.field1182 * 64;
            arg0.method2223();
        }
        if (Statics.field1790 == arg0 && (arg0.field1243 < 1536 || arg0.field1179 < 1536 || arg0.field1243 >= 11776 || arg0.field1179 >= 11776)) {
            arg0.field1220 = -1;
            arg0.field1225 = -1;
            arg0.field1234 = 0;
            arg0.field1235 = 0;
            arg0.field1243 = arg0.field1204[0] * 128 + arg0.field1182 * 64;
            arg0.field1179 = arg0.field1252[0] * 128 + arg0.field1182 * 64;
            arg0.method2223();
        }
        Statics.method1754(arg0);
        arg0.field1180 = false;
        if (arg0.field1216 != -1) {
            class199 var20 = class199.method4223(arg0.field1216);
            if (var20 == null) {
                arg0.field1216 = -1;
            } else if (!var20.method3671() && var20.field2295 != null) {
                arg0.field1218++;
                if (arg0.field1217 < var20.field2295.length && arg0.field1218 > var20.field2289[arg0.field1217]) {
                    arg0.field1218 = 1;
                    arg0.field1217++;
                    method6798(var20, arg0.field1217, arg0.field1243, arg0.field1179);
                }
                if (arg0.field1217 >= var20.field2295.length) {
                    if (var20.field2298 > 0) {
                        arg0.field1217 -= var20.field2298;
                        if (var20.field2299) {
                            arg0.field1219++;
                        }
                        if (arg0.field1217 < 0 || arg0.field1217 >= var20.field2295.length || var20.field2299 && arg0.field1219 >= var20.field2302) {
                            arg0.field1218 = 0;
                            arg0.field1217 = 0;
                            arg0.field1219 = 0;
                        }
                    } else {
                        arg0.field1218 = 0;
                        arg0.field1217 = 0;
                    }
                    method6798(var20, arg0.field1217, arg0.field1243, arg0.field1179);
                }
            } else if (var20.method3671()) {
                arg0.field1217++;
                int var21 = var20.method3675();
                if (arg0.field1217 < var21) {
                    method284(var20, arg0.field1217, arg0.field1243, arg0.field1179);
                } else {
                    if (var20.field2298 > 0) {
                        arg0.field1217 -= var20.field2298;
                        if (var20.field2299) {
                            arg0.field1219++;
                        }
                        if (arg0.field1217 < 0 || arg0.field1217 >= var21 || var20.field2299 && arg0.field1219 >= var20.field2302) {
                            arg0.field1217 = 0;
                            arg0.field1218 = 0;
                            arg0.field1219 = 0;
                        }
                    } else {
                        arg0.field1218 = 0;
                        arg0.field1217 = 0;
                    }
                    method284(var20, arg0.field1217, arg0.field1243, arg0.field1179);
                }
            } else {
                arg0.field1216 = -1;
            }
        }
        if (arg0.field1225 != -1 && field519 >= arg0.field1228) {
            if (arg0.field1226 < 0) {
                arg0.field1226 = 0;
            }
            int var22 = class189.method3000(arg0.field1225).field2084;
            if (var22 == -1) {
                arg0.field1225 = -1;
            } else {
                class199 var23 = class199.method4223(var22);
                if (var23 != null && var23.field2295 != null && !var23.method3671()) {
                    arg0.field1215++;
                    if (arg0.field1226 < var23.field2295.length && arg0.field1215 > var23.field2289[arg0.field1226]) {
                        arg0.field1215 = 1;
                        arg0.field1226++;
                        method6798(var23, arg0.field1226, arg0.field1243, arg0.field1179);
                    }
                    if (arg0.field1226 >= var23.field2295.length && (arg0.field1226 < 0 || arg0.field1226 >= var23.field2295.length)) {
                        arg0.field1225 = -1;
                    }
                } else if (var23.method3671()) {
                    arg0.field1226++;
                    int var24 = var23.method3675();
                    if (arg0.field1226 < var24) {
                        method284(var23, arg0.field1226, arg0.field1243, arg0.field1179);
                    } else if (arg0.field1226 < 0 || arg0.field1226 >= var24) {
                        arg0.field1225 = -1;
                    }
                } else {
                    arg0.field1225 = -1;
                }
            }
        }
        if (arg0.field1220 != -1 && arg0.field1223 <= 1) {
            class199 var25 = class199.method4223(arg0.field1220);
            if (var25.field2291 == 1 && arg0.field1253 > 0 && arg0.field1234 <= field519 && arg0.field1235 < field519) {
                arg0.field1223 = 1;
                return;
            }
        }
        if (arg0.field1220 != -1 && arg0.field1223 == 0) {
            class199 var26 = class199.method4223(arg0.field1220);
            if (var26 == null) {
                arg0.field1220 = -1;
            } else if (!var26.method3671() && var26.field2295 != null) {
                arg0.field1222++;
                if (arg0.field1211 < var26.field2295.length && arg0.field1222 > var26.field2289[arg0.field1211]) {
                    arg0.field1222 = 1;
                    arg0.field1211++;
                    method6798(var26, arg0.field1211, arg0.field1243, arg0.field1179);
                }
                if (arg0.field1211 >= var26.field2295.length) {
                    arg0.field1211 -= var26.field2298;
                    arg0.field1224++;
                    if (arg0.field1224 >= var26.field2302) {
                        arg0.field1220 = -1;
                    } else if (arg0.field1211 >= 0 && arg0.field1211 < var26.field2295.length) {
                        method6798(var26, arg0.field1211, arg0.field1243, arg0.field1179);
                    } else {
                        arg0.field1220 = -1;
                    }
                }
                arg0.field1180 = var26.field2282;
            } else if (var26.method3671()) {
                arg0.field1211++;
                int var27 = var26.method3675();
                if (arg0.field1211 < var27) {
                    method284(var26, arg0.field1211, arg0.field1243, arg0.field1179);
                } else {
                    arg0.field1211 -= var26.field2298;
                    arg0.field1224++;
                    if (arg0.field1224 >= var26.field2302) {
                        arg0.field1220 = -1;
                    } else if (arg0.field1211 >= 0 && arg0.field1211 < var27) {
                        method284(var26, arg0.field1211, arg0.field1243, arg0.field1179);
                    } else {
                        arg0.field1220 = -1;
                    }
                }
            } else {
                arg0.field1220 = -1;
            }
        }
        if (arg0.field1223 > 0) {
            arg0.field1223--;
        }
    }

    @ObfuscatedName("jw.ht(Lct;I)V")
    public static final void method4933(class92 arg0) {
        int var1 = Math.max(1, arg0.field1234 - field519);
        int var2 = arg0.field1197 * 128 + arg0.field1182 * 64;
        int var3 = arg0.field1186 * 128 + arg0.field1182 * 64;
        arg0.field1243 += (var2 - arg0.field1243) / var1;
        arg0.field1179 += (var3 - arg0.field1179) / var1;
        arg0.field1240 = 0;
        arg0.field1245 = arg0.field1236;
    }

    @ObfuscatedName("ju.hh(Lcj;IIB)V")
    public static void method4873(class89 arg0, int arg1, int arg2) {
        if (arg0.field1220 == arg1 && arg1 != -1) {
            int var3 = class199.method4223(arg1).field2277;
            if (var3 == 1) {
                arg0.field1211 = 0;
                arg0.field1222 = 0;
                arg0.field1223 = arg2;
                arg0.field1224 = 0;
            }
            if (var3 == 2) {
                arg0.field1224 = 0;
            }
        } else if (arg1 == -1 || arg0.field1220 == -1 || class199.method4223(arg1).field2301 >= class199.method4223(arg0.field1220).field2301) {
            arg0.field1220 = arg1;
            arg0.field1211 = 0;
            arg0.field1222 = 0;
            arg0.field1223 = arg2;
            arg0.field1224 = 0;
            arg0.field1253 = arg0.field1178;
        }
    }

    @ObfuscatedName("bv.hg(B)I")
    public static int method1127() {
        return field741 ? 2 : 1;
    }

    @ObfuscatedName("an.hj(I)V")
    public static void method656() {
        class278 var0 = class278.method2890(class276.field3058, field567.field1425);
        var0.field3177.method7789(method1127());
        var0.field3177.method7776(Statics.field2331);
        var0.field3177.method7776(Statics.field4300);
        field567.method2603(var0);
    }

    @ObfuscatedName("client.k(B)V")
    public final void method580() {
        field740 = Statics.method1118() + 500L;
        this.method1161();
        if (field681 != -1) {
            this.method1627(true);
        }
    }

    @ObfuscatedName("client.hk(I)V")
    public void method1161() {
        int var1 = Statics.field2331;
        int var2 = Statics.field4300;
        if (this.field220 < var1) {
            int var3 = this.field220;
        }
        if (this.field219 < var2) {
            int var4 = this.field219;
        }
        if (Statics.field2126 == null) {
            return;
        }
        try {
            client var5 = Statics.field1488;
            Object[] var6 = new Object[] { method1127() };
            JSObject.getWindow(var5).call("resize", var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("client.hq(S)V")
    public final void method1162() {
        if (field681 != -1) {
            int var1 = field681;
            if (class306.method2497(var1)) {
                method2719(Statics.field914[var1], -1);
            }
        }
        for (int var2 = 0; var2 < field730; var2++) {
            if (field732[var2]) {
                field733[var2] = true;
            }
            field734[var2] = field732[var2];
            field732[var2] = false;
        }
        field809 = field519;
        field670 = -1;
        field671 = -1;
        Statics.field2982 = null;
        if (field681 != -1) {
            field730 = 0;
            method2392(field681, 0, 0, Statics.field2331, Statics.field4300, 0, 0, -1);
        }
        class477.method8152();
        if (field540) {
            if (field623 == 1) {
                Statics.field268[field601 / 100].method8252(field582 - 8, field515 - 8);
            }
            if (field623 == 2) {
                Statics.field268[field601 / 100 + 4].method8252(field582 - 8, field515 - 8);
            }
        }
        if (field656) {
            method1140();
        } else if (field670 != -1) {
            int var3 = field670;
            int var4 = field671;
            if ((field657 >= 2 || field674 != 0 || field676) && field669) {
                int var5 = field657 - 1;
                String var7;
                if (field674 == 1 && field657 < 2) {
                    var7 = class326.field3980 + class326.field3990 + field771 + " " + class98.field1330;
                } else if (field676 && field657 < 2) {
                    var7 = field679 + class326.field3990 + field798 + " " + class98.field1330;
                } else {
                    String var8;
                    if (var5 < 0) {
                        var8 = "";
                    } else if (field544[var5].length() > 0) {
                        var8 = field663[var5] + class326.field3990 + field544[var5];
                    } else {
                        var8 = field663[var5];
                    }
                    var7 = var8;
                }
                if (field657 > 2) {
                    var7 = var7 + class98.method2153(16777215) + " " + '/' + " " + (field657 - 2) + class326.field3950;
                }
                Statics.field1714.method6534(var7, var3 + 4, var4 + 15, 16777215, 0, field519 / 1000);
            }
        }
        if (field763 == 3) {
            for (int var9 = 0; var9 < field730; var9++) {
                if (field734[var9]) {
                    class477.method8171(field735[var9], field736[var9], field723[var9], field535[var9], 16711935, 128);
                } else if (field733[var9]) {
                    class477.method8171(field735[var9], field736[var9], field723[var9], field535[var9], 16711680, 128);
                }
            }
        }
        int var10 = Statics.field4488;
        int var11 = Statics.field1790.field1243;
        int var12 = Statics.field1790.field1179;
        int var13 = field564;
        for (class67 var14 = (class67) class67.field849.method6086(); var14 != null; var14 = (class67) class67.field849.method6088()) {
            if (var14.field846 != -1 || var14.field850 != null) {
                int var15 = 0;
                if (var11 > var14.field842) {
                    var15 += var11 - var14.field842;
                } else if (var11 < var14.field841) {
                    var15 += var14.field841 - var11;
                }
                if (var12 > var14.field844) {
                    var15 += var12 - var14.field844;
                } else if (var12 < var14.field839) {
                    var15 += var14.field839 - var12;
                }
                if (var15 - 64 > var14.field848 || Statics.field2126.method2379() == 0 || var14.field845 != var10) {
                    if (var14.field847 != null) {
                        Statics.field498.method708(var14.field847);
                        var14.field847 = null;
                    }
                    if (var14.field852 != null) {
                        Statics.field498.method708(var14.field852);
                        var14.field852 = null;
                    }
                } else {
                    var15 -= 64;
                    if (var15 < 0) {
                        var15 = 0;
                    }
                    int var16 = (var14.field848 - var15) * Statics.field2126.method2379() / var14.field848;
                    class41 var10000;
                    if (var14.field847 != null) {
                        var14.field847.method867(var16);
                    } else if (var14.field846 >= 0) {
                        var10000 = (class41) null;
                        class41 var17 = class41.method747(Statics.field2933, var14.field846, 0);
                        if (var17 != null) {
                            class42 var18 = var17.method749().method760(Statics.field127);
                            class49 var19 = class49.method864(var18, 100, var16);
                            var19.method866(-1);
                            Statics.field498.method707(var19);
                            var14.field847 = var19;
                        }
                    }
                    if (var14.field852 != null) {
                        var14.field852.method867(var16);
                        if (!var14.field852.method7228()) {
                            var14.field852 = null;
                        }
                    } else if (var14.field850 != null && (var14.field851 -= var13) <= 0) {
                        int var20 = (int) (Math.random() * (double) var14.field850.length);
                        var10000 = (class41) null;
                        class41 var21 = class41.method747(Statics.field2933, var14.field850[var20], 0);
                        if (var21 != null) {
                            class42 var22 = var21.method749().method760(Statics.field127);
                            class49 var23 = class49.method864(var22, 100, var16);
                            var23.method866(0);
                            Statics.field498.method707(var23);
                            var14.field852 = var23;
                            var14.field851 = var14.field843 + (int) (Math.random() * (double) (var14.field840 - var14.field843));
                        }
                    }
                }
            }
        }
        field564 = 0;
    }

    @ObfuscatedName("aw.hw(Ljava/lang/String;ZI)V")
    public static final void method833(String arg0, boolean arg1) {
        if (!field634) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field2957.method6522(arg0, 250);
        int var6 = Statics.field2957.method6523(arg0, 250) * 13;
        class477.method8120(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class477.method8111(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field2957.method6529(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method705(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field2354.method463(0, 0);
            return;
        }
        int var7 = var3;
        int var8 = var4;
        int var9 = var5;
        int var10 = var6;
        for (int var11 = 0; var11 < field730; var11++) {
            if (field735[var11] + field723[var11] > var7 && field735[var11] < var7 + var9 && field736[var11] + field535[var11] > var8 && field736[var11] < var8 + var10) {
                field733[var11] = true;
            }
        }
    }

    @ObfuscatedName("bj.hb(IIIII)V")
    public static final void method1993(int arg0, int arg1, int arg2, int arg3) {
        field617++;
        method6016();
        method2705();
        if (field647 >= 0 && field635[field647] != null) {
            method4832(field635[field647], false);
        }
        Statics.method310(true);
        method4958();
        Statics.method310(false);
        method445();
        for (class69 var4 = (class69) field640.method6086(); var4 != null; var4 = (class69) field640.method6088()) {
            if (Statics.field4488 != var4.field878 || var4.field880) {
                var4.method7230();
            } else if (field519 >= var4.field877) {
                var4.method1919(field564);
                if (var4.field880) {
                    var4.method7230();
                } else {
                    Statics.field286.method4152(var4.field878, var4.field879, var4.field885, var4.field881, 60, var4, 0, -1L, false);
                }
            }
        }
        method2923(arg0, arg1, arg2, arg3, true);
        int var5 = field660;
        int var6 = field788;
        int var7 = field789;
        int var8 = field688;
        class477.method8112(var5, var6, var5 + var7, var6 + var8);
        class213.method3926();
        int var9 = field588;
        if (field605 / 256 > var9) {
            var9 = field605 / 256;
        }
        if (field774[4] && field776[4] + 128 > var9) {
            var9 = field776[4] + 128;
        }
        int var10 = field589 & 0x7FF;
        int var11 = Statics.field162;
        int var12 = Statics.field499;
        int var13 = Statics.field85;
        int var14 = var9 * 3 + 600;
        int var16 = var8 - 334;
        if (var16 < 0) {
            var16 = 0;
        } else if (var16 > 100) {
            var16 = 100;
        }
        int var17 = (field673 - field781) * var16 / 100 + field781;
        int var18 = var14 * var17 / 256;
        int var20 = 2048 - var9 & 0x7FF;
        int var21 = 2048 - var10 & 0x7FF;
        int var22 = 0;
        int var23 = 0;
        int var24 = var18;
        if (var20 != 0) {
            int var25 = class213.field2486[var20];
            int var26 = class213.field2509[var20];
            int var27 = var23 * var26 - var18 * var25 >> 16;
            var24 = var23 * var25 + var18 * var26 >> 16;
            var23 = var27;
        }
        if (var21 != 0) {
            int var28 = class213.field2486[var21];
            int var29 = class213.field2509[var21];
            int var30 = var22 * var29 + var24 * var28 >> 16;
            var24 = var24 * var29 - var22 * var28 >> 16;
            var22 = var30;
        }
        if (field772) {
            Statics.field1368 = var11 - var22;
            Statics.field2617 = var12 - var23;
            Statics.field3343 = var13 - var24;
            Statics.field2068 = var9;
            Statics.field1366 = var10;
        } else {
            Statics.field1710 = var11 - var22;
            Statics.field4643 = var12 - var23;
            Statics.field1798 = var13 - var24;
            Statics.field1332 = var9;
            Statics.field1599 = var10;
        }
        if (field594 == 1 && field769 >= 2 && field519 % 50 == 0 && (Statics.field162 >> 7 != Statics.field1790.field1243 >> 7 || Statics.field85 >> 7 != Statics.field1790.field1179 >> 7)) {
            int var31 = Statics.field1790.field1143;
            int var32 = (Statics.field162 >> 7) + Statics.field1780;
            int var33 = (Statics.field85 >> 7) + Statics.field4368;
            class278 var34 = class278.method2890(class276.field3121, field567.field1425);
            var34.field3177.method7849(var33);
            var34.field3177.method7820(var31);
            var34.field3177.method7830(var32);
            var34.field3177.method7843(field790);
            field567.method2603(var34);
        }
        int var35;
        if (field772) {
            var35 = method2007();
        } else {
            var35 = method3111();
        }
        int var36 = Statics.field1710;
        int var37 = Statics.field4643;
        int var38 = Statics.field1798;
        int var39 = Statics.field1332;
        int var40 = Statics.field1599;
        for (int var41 = 0; var41 < 5; var41++) {
            if (field774[var41]) {
                int var42 = (int) (Math.random() * (double) (field804[var41] * 2 + 1) - (double) field804[var41] + Math.sin((double) field777[var41] / 100.0D * (double) field618[var41]) * (double) field776[var41]);
                if (var41 == 0) {
                    Statics.field1710 += var42;
                }
                if (var41 == 1) {
                    Statics.field4643 += var42;
                }
                if (var41 == 2) {
                    Statics.field1798 += var42;
                }
                if (var41 == 3) {
                    Statics.field1599 = Statics.field1599 + var42 & 0x7FF;
                }
                if (var41 == 4) {
                    Statics.field1332 += var42;
                    if (Statics.field1332 < 128) {
                        Statics.field1332 = 128;
                    }
                    if (Statics.field1332 > 383) {
                        Statics.field1332 = 383;
                    }
                }
            }
        }
        int var43 = class37.field254;
        int var44 = class37.field249;
        if (class37.field261 != 0) {
            var43 = class37.field262;
            var44 = class37.field258;
        }
        if (var43 >= var5 && var43 < var5 + var7 && var44 >= var6 && var44 < var6 + var8) {
            int var45 = var43 - var5;
            int var46 = var44 - var6;
            class225.field2744 = var45;
            class225.field2753 = var46;
            class225.field2745 = true;
            class225.field2754 = 0;
            class225.field2746 = false;
        } else {
            class225.method243();
        }
        method1542();
        class477.method8120(var5, var6, var7, var8, 0);
        method1542();
        int var47 = class213.field2494;
        class213.field2494 = field791;
        Statics.field286.method4084(Statics.field1710, Statics.field4643, Statics.field1798, Statics.field1332, Statics.field1599, var35);
        class213.field2494 = var47;
        method1542();
        Statics.field286.method4057();
        field762 = 0;
        boolean var48 = false;
        int var49 = -1;
        int var50 = -1;
        int var51 = class104.field1376;
        int[] var52 = class104.field1375;
        for (int var53 = 0; var53 < field563 + var51; var53++) {
            class92 var54;
            if (var53 < var51) {
                var54 = field635[var52[var53]];
                if (field647 == var52[var53]) {
                    var48 = true;
                    var49 = var53;
                    continue;
                }
                if (Statics.field1790 == var54) {
                    var50 = var53;
                    continue;
                }
            } else {
                var54 = field753[field719[var53 - var51]];
            }
            method2846(var54, var53, var5, var6, var7, var8);
        }
        if (field546 && var50 != -1) {
            method2846(Statics.field1790, var50, var5, var6, var7, var8);
        }
        if (var48) {
            method2846(field635[field647], var49, var5, var6, var7, var8);
        }
        for (int var55 = 0; var55 < field762; var55++) {
            int var56 = field608[var55];
            int var57 = field609[var55];
            int var58 = field795[var55];
            int var59 = field610[var55];
            boolean var60 = true;
            while (var60) {
                var60 = false;
                for (int var61 = 0; var61 < var55; var61++) {
                    if (var57 + 2 > field609[var61] - field610[var61] && var57 - var59 < field609[var61] + 2 && var56 - var58 < field795[var61] + field608[var61] && var56 + var58 > field608[var61] - field795[var61] && field609[var61] - field610[var61] < var57) {
                        var57 = field609[var61] - field610[var61];
                        var60 = true;
                    }
                }
            }
            field724 = field608[var55];
            field545 = field609[var55] = var57;
            String var62 = field606[var55];
            if (field685 == 0) {
                int var63 = 16776960;
                if (field612[var55] < 6) {
                    var63 = field742[field612[var55]];
                }
                if (field612[var55] == 6) {
                    var63 = field617 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field612[var55] == 7) {
                    var63 = field617 % 20 < 10 ? 255 : 65535;
                }
                if (field612[var55] == 8) {
                    var63 = field617 % 20 < 10 ? 45056 : 8454016;
                }
                if (field612[var55] == 9) {
                    int var64 = 150 - field703[var55];
                    if (var64 < 50) {
                        var63 = var64 * 1280 + 16711680;
                    } else if (var64 < 100) {
                        var63 = 16776960 - (var64 - 50) * 327680;
                    } else if (var64 < 150) {
                        var63 = (var64 - 100) * 5 + 65280;
                    }
                }
                if (field612[var55] == 10) {
                    int var65 = 150 - field703[var55];
                    if (var65 < 50) {
                        var63 = var65 * 5 + 16711680;
                    } else if (var65 < 100) {
                        var63 = 16711935 - (var65 - 50) * 327680;
                    } else if (var65 < 150) {
                        var63 = (var65 - 100) * 327680 + 255 - (var65 - 100) * 5;
                    }
                }
                if (field612[var55] == 11) {
                    int var66 = 150 - field703[var55];
                    if (var66 < 50) {
                        var63 = 16777215 - var66 * 327685;
                    } else if (var66 < 100) {
                        var63 = (var66 - 50) * 327685 + 65280;
                    } else if (var66 < 150) {
                        var63 = 16777215 - (var66 - 100) * 327680;
                    }
                }
                if (field613[var55] == 0) {
                    Statics.field1714.method6528(var62, field724 + var5, field545 + var6, var63, 0);
                }
                if (field613[var55] == 1) {
                    Statics.field1714.method6520(var62, field724 + var5, field545 + var6, var63, 0, field617);
                }
                if (field613[var55] == 2) {
                    Statics.field1714.method6594(var62, field724 + var5, field545 + var6, var63, 0, field617);
                }
                if (field613[var55] == 3) {
                    Statics.field1714.method6567(var62, field724 + var5, field545 + var6, var63, 0, field617, 150 - field703[var55]);
                }
                if (field613[var55] == 4) {
                    int var67 = (150 - field703[var55]) * (Statics.field1714.method6568(var62) + 100) / 150;
                    class477.method8113(field724 + var5 - 50, var6, field724 + var5 + 50, var6 + var8);
                    Statics.field1714.method6525(var62, field724 + var5 + 50 - var67, field545 + var6, var63, 0);
                    class477.method8112(var5, var6, var5 + var7, var6 + var8);
                }
                if (field613[var55] == 5) {
                    int var68 = 150 - field703[var55];
                    int var69 = 0;
                    if (var68 < 25) {
                        var69 = var68 - 25;
                    } else if (var68 > 125) {
                        var69 = var68 - 125;
                    }
                    class477.method8113(var5, field545 + var6 - Statics.field1714.field4408 - 1, var5 + var7, field545 + var6 + 5);
                    Statics.field1714.method6528(var62, field724 + var5, field545 + var6 + var69, var63, 0);
                    class477.method8112(var5, var6, var5 + var7, var6 + var8);
                }
            } else {
                Statics.field1714.method6528(var62, field724 + var5, field545 + var6, 16776960, 0);
            }
        }
        method3797(var5, var6);
        ((class222) Statics.field2491).method4260(field564);
        method3795();
        Statics.field1710 = var36;
        Statics.field4643 = var37;
        Statics.field1798 = var38;
        Statics.field1332 = var39;
        Statics.field1599 = var40;
        if (field518) {
            byte var70 = 0;
            int var71 = class334.field4223 + class334.field4221 + var70;
            if (var71 == 0) {
                field518 = false;
            }
        }
        if (field518) {
            class477.method8120(var5, var6, var7, var8, 0);
            method833(class326.field3949, false);
        }
    }

    @ObfuscatedName("ec.hp(IIIIZI)V")
    public static final void method2923(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var5 = arg3 - 334;
        int var6;
        if (var5 < 0) {
            var6 = field779;
        } else if (var5 >= 100) {
            var6 = field551;
        } else {
            var6 = (field551 - field779) * var5 / 100 + field779;
        }
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field785) {
            short var8 = field785;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field784) {
                var6 = field784;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class477.method8152();
                    class477.method8120(arg0, arg1, var10, arg3, -16777216);
                    class477.method8120(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field511) {
            short var11 = field511;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field691) {
                var6 = field691;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class477.method8152();
                    class477.method8120(arg0, arg1, arg2, var13, -16777216);
                    class477.method8120(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field791 = arg3 * var6 / 334;
        if (field789 != arg2 || field688 != arg3) {
            int[] var14 = new int[9];
            for (int var15 = 0; var15 < var14.length; var15++) {
                int var16 = var15 * 32 + 128 + 15;
                int var17 = var16 * 3 + 600;
                int var19 = class213.field2486[var16];
                int var20 = arg3 - 334;
                if (var20 < 0) {
                    var20 = 0;
                } else if (var20 > 100) {
                    var20 = 100;
                }
                int var21 = (field673 - field781) * var20 / 100 + field781;
                int var22 = var17 * var21 / 256;
                var14[var15] = var19 * var22 >> 16;
            }
            class216.method4078(var14, 500, 800, arg2 * 334 / arg3, 334);
        }
        field660 = arg0;
        field788 = arg1;
        field789 = arg2;
        field688 = arg3;
    }

    @ObfuscatedName("mx.hd(B)V")
    public static void method6016() {
        if (Statics.field1790.field1243 >> 7 == field761 && Statics.field1790.field1179 >> 7 == field507) {
            field761 = 0;
        }
    }

    @ObfuscatedName("df.hu(B)V")
    public static void method2705() {
        if (field546) {
            method4832(Statics.field1790, false);
        }
    }

    @ObfuscatedName("jg.iq(B)V")
    public static void method4958() {
        int var0 = class104.field1376;
        int[] var1 = class104.field1375;
        for (int var2 = 0; var2 < var0; var2++) {
            if (field647 != var1[var2] && field636 != var1[var2]) {
                method4832(field635[var1[var2]], true);
            }
        }
    }

    @ObfuscatedName("il.ip(Lcj;ZB)V")
    public static void method4832(class89 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method2164() || arg0.field1142) {
            return;
        }
        arg0.field1140 = false;
        if ((field562 && class104.field1376 > 50 || class104.field1376 > 200) && arg1 && arg0.field1216 == arg0.field1184) {
            arg0.field1140 = true;
        }
        int var2 = arg0.field1243 >> 7;
        int var3 = arg0.field1179 >> 7;
        if (var2 < 0 || var2 >= 104 || var3 < 0 || var3 >= 104) {
            return;
        }
        long var4 = class225.method574(0, 0, 0, false, arg0.field1144);
        if (arg0.field1135 != null && field519 >= arg0.field1147 && field519 < arg0.field1131) {
            arg0.field1140 = false;
            arg0.field1130 = method3401(arg0.field1243, arg0.field1179, Statics.field4488);
            arg0.field1183 = field519;
            Statics.field286.method4055(Statics.field4488, arg0.field1243, arg0.field1179, arg0.field1130, 60, arg0, arg0.field1193, var4, arg0.field1149, arg0.field1137, arg0.field1133, arg0.field1129);
            return;
        }
        if ((arg0.field1243 & 0x7F) == 64 && (arg0.field1179 & 0x7F) == 64) {
            if (field617 == field616[var2][var3]) {
                return;
            }
            field616[var2][var3] = field617;
        }
        arg0.field1130 = method3401(arg0.field1243, arg0.field1179, Statics.field4488);
        arg0.field1183 = field519;
        Statics.field286.method4152(Statics.field4488, arg0.field1243, arg0.field1179, arg0.field1130, 60, arg0, arg0.field1193, var4, arg0.field1180);
    }

    @ObfuscatedName("au.it(I)V")
    public static final void method445() {
        for (class74 var0 = (class74) field650.method6086(); var0 != null; var0 = (class74) field650.method6088()) {
            if (Statics.field4488 != var0.field980 || field519 > var0.field964) {
                var0.method7230();
            } else if (field519 >= var0.field968) {
                if (var0.field967 > 0) {
                    class97 var1 = field753[var0.field967 - 1];
                    if (var1 != null && var1.field1243 >= 0 && var1.field1243 < 13312 && var1.field1179 >= 0 && var1.field1179 < 13312) {
                        var0.method1990(var1.field1243, var1.field1179, method3401(var1.field1243, var1.field1179, var0.field980) - var0.field958, field519);
                    }
                }
                if (var0.field967 < 0) {
                    int var2 = -var0.field967 - 1;
                    class89 var3;
                    if (field636 == var2) {
                        var3 = Statics.field1790;
                    } else {
                        var3 = field635[var2];
                    }
                    if (var3 != null && var3.field1243 >= 0 && var3.field1243 < 13312 && var3.field1179 >= 0 && var3.field1179 < 13312) {
                        var0.method1990(var3.field1243, var3.field1179, method3401(var3.field1243, var3.field1179, var0.field980) - var0.field958, field519);
                    }
                }
                var0.method1991(field564);
                Statics.field286.method4152(Statics.field4488, (int) var0.field969, (int) var0.field970, (int) var0.field965, 60, var0, var0.field977, -1L, false);
            }
        }
    }

    @ObfuscatedName("fk.iy(B)I")
    public static final int method3111() {
        if (Statics.field2126.method2285()) {
            return Statics.field4488;
        }
        int var0 = 3;
        if (Statics.field1332 < 310) {
            int var1;
            int var2;
            if (field594 == 1) {
                var1 = Statics.field162 >> 7;
                var2 = Statics.field85 >> 7;
            } else {
                var1 = Statics.field1790.field1243 >> 7;
                var2 = Statics.field1790.field1179 >> 7;
            }
            int var3 = Statics.field1710 >> 7;
            int var4 = Statics.field1798 >> 7;
            if (var3 < 0 || var4 < 0 || var3 >= 104 || var4 >= 104) {
                return Statics.field4488;
            }
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field4488;
            }
            if ((class79.field1035[Statics.field4488][var3][var4] & 0x4) != 0) {
                var0 = Statics.field4488;
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
                    if ((class79.field1035[Statics.field4488][var3][var4] & 0x4) != 0) {
                        var0 = Statics.field4488;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var4 < var2) {
                            var4++;
                        } else if (var4 > var2) {
                            var4--;
                        }
                        if ((class79.field1035[Statics.field4488][var3][var4] & 0x4) != 0) {
                            var0 = Statics.field4488;
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
                    if ((class79.field1035[Statics.field4488][var3][var4] & 0x4) != 0) {
                        var0 = Statics.field4488;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var3 < var1) {
                            var3++;
                        } else if (var3 > var1) {
                            var3--;
                        }
                        if ((class79.field1035[Statics.field4488][var3][var4] & 0x4) != 0) {
                            var0 = Statics.field4488;
                        }
                    }
                }
            }
        }
        if (Statics.field1790.field1243 >= 0 && Statics.field1790.field1179 >= 0 && Statics.field1790.field1243 < 13312 && Statics.field1790.field1179 < 13312) {
            if ((class79.field1035[Statics.field4488][Statics.field1790.field1243 >> 7][Statics.field1790.field1179 >> 7] & 0x4) != 0) {
                var0 = Statics.field4488;
            }
            return var0;
        } else {
            return Statics.field4488;
        }
    }

    @ObfuscatedName("bb.ie(B)I")
    public static final int method2007() {
        if (Statics.field2126.method2285()) {
            return Statics.field4488;
        } else {
            int var0 = method3401(Statics.field1710, Statics.field1798, Statics.field4488);
            return var0 - Statics.field4643 >= 800 || (class79.field1035[Statics.field4488][Statics.field1710 >> 7][Statics.field1798 >> 7] & 0x4) == 0 ? 3 : Statics.field4488;
        }
    }

    @ObfuscatedName("gg.ij(IIB)V")
    public static final void method3797(int arg0, int arg1) {
        if (field526 == 2) {
            method1088((field529 - Statics.field1780 << 7) + field532, (field570 - Statics.field4368 << 7) + field627, field531 * 2);
            if (field724 > -1 && field519 % 20 < 10) {
                Statics.field4349[0].method8252(field724 + arg0 - 12, field545 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("hf.id(B)Lmq;")
    public static class352 method4224() {
        return field583;
    }

    @ObfuscatedName("jp.ik(B)V")
    public static void method4935() {
        for (class201 var0 = (class201) field728.method6086(); var0 != null; var0 = (class201) field728.method6088()) {
            var0.method7230();
        }
    }

    @ObfuscatedName("aj.io(B)Z")
    public static boolean method853() {
        return (field737 & 0x1) != 0;
    }

    @ObfuscatedName("dq.ia(I)Z")
    public static boolean method2744() {
        return (field737 & 0x2) != 0;
    }

    @ObfuscatedName("bn.im(I)Z")
    public static boolean method1918() {
        return (field737 & 0x8) != 0;
    }

    @ObfuscatedName("di.in(Lct;IIIIIB)V")
    public static final void method2846(class92 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method2164()) {
            return;
        }
        if (arg0 instanceof class97) {
            class187 var6 = ((class97) arg0).field1319;
            if (var6.field2059 != null) {
                var6 = var6.method3323();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class104.field1376;
        int[] var8 = class104.field1375;
        byte var9 = 0;
        if (arg1 < var7 && field519 == arg0.field1183) {
            class89 var10 = (class89) arg0;
            boolean var11;
            if (field737 == 0) {
                var11 = false;
            } else if (Statics.field1790 == var10) {
                var11 = method1918();
            } else {
                boolean var12 = (field737 & 0x4) != 0;
                var11 = var12 || method853() && var10.method2163() || method2744() && var10.method2201();
            }
            if (var11) {
                class89 var13 = (class89) arg0;
                if (arg1 < var7) {
                    method2386(arg0, arg0.field1238 + 15);
                    class372 var14 = (class372) field571.get(class440.field4803);
                    byte var15 = 9;
                    var14.method6528(var13.field1136.method8383(), field724 + arg2, field545 + arg3 - var15, 16777215, 0);
                    var9 = 18;
                }
            }
        }
        int var16 = -2;
        if (!arg0.field1242.method6138()) {
            method2386(arg0, arg0.field1238 + 15);
            for (class96 var17 = (class96) arg0.field1242.method6176(); var17 != null; var17 = (class96) arg0.field1242.method6136()) {
                class93 var18 = var17.method2390(field519);
                if (var18 != null) {
                    class182 var19 = var17.field1306;
                    class481 var20 = var19.method3272();
                    class481 var21 = var19.method3271();
                    int var22 = 0;
                    int var23;
                    if (var20 == null || var21 == null) {
                        var23 = var19.field1988;
                    } else {
                        if (var19.field1989 * 2 < var21.field5011) {
                            var22 = var19.field1989;
                        }
                        var23 = var21.field5011 - var22 * 2;
                    }
                    int var24 = 255;
                    boolean var25 = true;
                    int var26 = field519 - var18.field1260;
                    int var27 = var18.field1257 * var23 / var19.field1988;
                    int var30;
                    if (var18.field1264 > var26) {
                        int var28 = var19.field1977 == 0 ? 0 : var26 / var19.field1977 * var19.field1977;
                        int var29 = var18.field1259 * var23 / var19.field1988;
                        var30 = (var27 - var29) * var28 / var18.field1264 + var29;
                    } else {
                        var30 = var27;
                        int var31 = var18.field1264 + var19.field1975 - var26;
                        if (var19.field1983 >= 0) {
                            var24 = (var31 << 8) / (var19.field1975 - var19.field1983);
                        }
                    }
                    if (var18.field1257 > 0 && var30 < 1) {
                        var30 = 1;
                    }
                    if (var20 == null || var21 == null) {
                        var16 += 5;
                        if (field724 > -1) {
                            int var37 = field724 + arg2 - (var23 >> 1);
                            int var38 = field545 + arg3 - var16;
                            class477.method8120(var37, var38, var30, 5, 65280);
                            class477.method8120(var30 + var37, var38, var23 - var30, 5, 16711680);
                        }
                        var16 += 2;
                    } else {
                        int var32;
                        if (var23 == var30) {
                            var32 = var22 * 2 + var30;
                        } else {
                            var32 = var22 + var30;
                        }
                        int var33 = var20.field5010;
                        var16 += var33;
                        int var34 = field724 + arg2 - (var23 >> 1);
                        int var35 = field545 + arg3 - var16;
                        int var36 = var34 - var22;
                        if (var24 >= 0 && var24 < 255) {
                            var20.method8271(var36, var35, var24);
                            class477.method8113(var36, var35, var32 + var36, var33 + var35);
                            var21.method8271(var36, var35, var24);
                        } else {
                            var20.method8252(var36, var35);
                            class477.method8113(var36, var35, var32 + var36, var33 + var35);
                            var21.method8252(var36, var35);
                        }
                        class477.method8112(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var16 += 2;
                    }
                } else if (var17.method2391()) {
                    var17.method7230();
                }
            }
        }
        if (var16 == -2) {
            var16 += 7;
        }
        int var39 = var9 + var16;
        if (arg1 < var7) {
            class89 var40 = (class89) arg0;
            if (var40.field1142) {
                return;
            }
            if (var40.field1124 != -1 || var40.field1125 != -1) {
                method2386(arg0, arg0.field1238 + 15);
                if (field724 > -1) {
                    if (var40.field1124 != -1) {
                        var39 += 25;
                        Statics.field810[var40.field1124].method8252(field724 + arg2 - 12, field545 + arg3 - var39);
                    }
                    if (var40.field1125 != -1) {
                        var39 += 25;
                        Statics.field4612[var40.field1125].method8252(field724 + arg2 - 12, field545 + arg3 - var39);
                    }
                }
            }
            if (arg1 >= 0 && field526 == 10 && field595 == var8[arg1]) {
                method2386(arg0, arg0.field1238 + 15);
                if (field724 > -1) {
                    var39 += Statics.field4349[1].field5010;
                    Statics.field4349[1].method8252(field724 + arg2 - 12, field545 + arg3 - var39);
                }
            }
        } else {
            class97 var41 = (class97) arg0;
            int[] var42 = var41.method2419();
            short[] var43 = var41.method2411();
            if (var43 != null && var42 != null) {
                for (int var44 = 0; var44 < var43.length; var44++) {
                    if (var43[var44] >= 0 && var42[var44] >= 0) {
                        long var45 = (long) var42[var44] << 8 | (long) var43[var44];
                        class481 var47 = (class481) field572.method6746(var45);
                        if (var47 == null) {
                            class481[] var48 = class482.method3715(Statics.field1292, var42[var44], 0);
                            if (var48 != null && var43[var44] < var48.length) {
                                var47 = var48[var43[var44]];
                                field572.method6734(var45, var47);
                            }
                        }
                        if (var47 != null) {
                            method2386(arg0, arg0.field1238 + 15);
                            if (field724 > -1) {
                                int var138 = arg3 - var47.field5010;
                                var47.method8252(field724 + arg2 - (var47.field5011 >> 1), field545 + var138);
                                arg3 = var138 - 2;
                            }
                        }
                    }
                }
            }
            if (field526 == 1 && field527 == field719[arg1 - var7] && field519 % 20 < 10) {
                method2386(arg0, arg0.field1238 + 15);
                if (field724 > -1) {
                    Statics.field4349[0].method8252(field724 + arg2 - 12, field545 + arg3 - 28);
                }
            }
        }
        if (arg0.field1199 != null && (arg1 >= var7 || !arg0.field1188 && (field743 == 4 || !arg0.field1200 && (field743 == 0 || field743 == 3 || field743 == 1 && ((class89) arg0).method2163())))) {
            method2386(arg0, arg0.field1238 + 15);
            if (field724 > -1 && field762 < field607) {
                field795[field762] = Statics.field1714.method6568(arg0.field1199) / 2;
                field610[field762] = Statics.field1714.field4408;
                field608[field762] = field724;
                field609[field762] = field545 - var39;
                field612[field762] = arg0.field1203;
                field613[field762] = arg0.field1230;
                field703[field762] = arg0.field1249;
                field606[field762] = arg0.field1199;
                field762++;
                var39 += 12;
            }
        }
        for (int var49 = 0; var49 < 4; var49++) {
            int var50 = arg0.field1208[var49];
            int var51 = arg0.field1206[var49];
            class195 var52 = null;
            int var53 = 0;
            if (var51 >= 0) {
                if (var50 <= field519) {
                    continue;
                }
                var52 = class195.method6351(arg0.field1206[var49]);
                var53 = var52.field2133;
                if (var52 != null && var52.field2140 != null) {
                    var52 = var52.method3476();
                    if (var52 == null) {
                        arg0.field1208[var49] = -1;
                        continue;
                    }
                }
            } else if (var50 < 0) {
                continue;
            }
            int var54 = arg0.field1209[var49];
            class195 var55 = null;
            if (var54 >= 0) {
                var55 = class195.method6351(var54);
                if (var55 != null && var55.field2140 != null) {
                    var55 = var55.method3476();
                }
            }
            if (var50 - var53 <= field519) {
                if (var52 == null) {
                    arg0.field1208[var49] = -1;
                } else {
                    method2386(arg0, arg0.field1238 / 2);
                    if (field724 > -1) {
                        boolean var56 = true;
                        if (var49 == 1) {
                            field545 -= 20;
                        }
                        if (var49 == 2) {
                            field724 -= 15;
                            field545 -= 10;
                        }
                        if (var49 == 3) {
                            field724 += 15;
                            field545 -= 10;
                        }
                        Object var57 = null;
                        Object var58 = null;
                        Object var59 = null;
                        Object var60 = null;
                        int var61 = 0;
                        int var62 = 0;
                        int var63 = 0;
                        int var64 = 0;
                        int var65 = 0;
                        int var66 = 0;
                        int var67 = 0;
                        int var68 = 0;
                        class481 var69 = null;
                        class481 var70 = null;
                        class481 var71 = null;
                        class481 var72 = null;
                        int var73 = 0;
                        int var74 = 0;
                        int var75 = 0;
                        int var76 = 0;
                        int var77 = 0;
                        int var78 = 0;
                        int var79 = 0;
                        int var80 = 0;
                        int var81 = 0;
                        class481 var82 = var52.method3478();
                        if (var82 != null) {
                            var61 = var82.field5011;
                            int var83 = var82.field5010;
                            if (var83 > var81) {
                                var81 = var83;
                            }
                            var65 = var82.field5013;
                        }
                        class481 var84 = var52.method3479();
                        if (var84 != null) {
                            var62 = var84.field5011;
                            int var85 = var84.field5010;
                            if (var85 > var81) {
                                var81 = var85;
                            }
                            var66 = var84.field5013;
                        }
                        class481 var86 = var52.method3513();
                        if (var86 != null) {
                            var63 = var86.field5011;
                            int var87 = var86.field5010;
                            if (var87 > var81) {
                                var81 = var87;
                            }
                            var67 = var86.field5013;
                        }
                        class481 var88 = var52.method3481();
                        if (var88 != null) {
                            var64 = var88.field5011;
                            int var89 = var88.field5010;
                            if (var89 > var81) {
                                var81 = var89;
                            }
                            var68 = var88.field5013;
                        }
                        if (var55 != null) {
                            var69 = var55.method3478();
                            if (var69 != null) {
                                var73 = var69.field5011;
                                int var90 = var69.field5010;
                                if (var90 > var81) {
                                    var81 = var90;
                                }
                                var77 = var69.field5013;
                            }
                            var70 = var55.method3479();
                            if (var70 != null) {
                                var74 = var70.field5011;
                                int var91 = var70.field5010;
                                if (var91 > var81) {
                                    var81 = var91;
                                }
                                var78 = var70.field5013;
                            }
                            var71 = var55.method3513();
                            if (var71 != null) {
                                var75 = var71.field5011;
                                int var92 = var71.field5010;
                                if (var92 > var81) {
                                    var81 = var92;
                                }
                                var79 = var71.field5013;
                            }
                            var72 = var55.method3481();
                            if (var72 != null) {
                                var76 = var72.field5011;
                                int var93 = var72.field5010;
                                if (var93 > var81) {
                                    var81 = var93;
                                }
                                var80 = var72.field5013;
                            }
                        }
                        class368 var94 = var52.method3503();
                        if (var94 == null) {
                            var94 = Statics.field1766;
                        }
                        class368 var95;
                        if (var55 == null) {
                            var95 = Statics.field1766;
                        } else {
                            var95 = var55.method3503();
                            if (var95 == null) {
                                var95 = Statics.field1766;
                            }
                        }
                        Object var96 = null;
                        String var97 = null;
                        boolean var98 = false;
                        int var99 = 0;
                        String var100 = var52.method3477(arg0.field1207[var49]);
                        int var101 = var94.method6568(var100);
                        if (var55 != null) {
                            var97 = var55.method3477(arg0.field1210[var49]);
                            var99 = var95.method6568(var97);
                        }
                        int var102 = 0;
                        int var103 = 0;
                        if (var62 > 0) {
                            if (var86 == null && var88 == null) {
                                var102 = 1;
                            } else {
                                var102 = var101 / var62 + 1;
                            }
                        }
                        if (var55 != null && var74 > 0) {
                            if (var71 == null && var72 == null) {
                                var103 = 1;
                            } else {
                                var103 = var99 / var74 + 1;
                            }
                        }
                        int var104 = 0;
                        int var105 = var104;
                        if (var61 > 0) {
                            var104 += var61;
                        }
                        var104 += 2;
                        int var106 = var104;
                        if (var63 > 0) {
                            var104 += var63;
                        }
                        int var107 = var104;
                        int var108 = var104;
                        int var110;
                        if (var62 > 0) {
                            int var109 = var62 * var102;
                            var110 = var104 + var109;
                            var108 = (var109 - var101) / 2 + var104;
                        } else {
                            var110 = var101 + var104;
                        }
                        int var111 = var110;
                        if (var64 > 0) {
                            var110 += var64;
                        }
                        int var112 = 0;
                        int var113 = 0;
                        int var114 = 0;
                        int var115 = 0;
                        int var116 = 0;
                        if (var55 != null) {
                            var110 += 2;
                            var112 = var110;
                            if (var73 > 0) {
                                var110 += var73;
                            }
                            var110 += 2;
                            var113 = var110;
                            if (var75 > 0) {
                                var110 += var75;
                            }
                            var114 = var110;
                            var116 = var110;
                            if (var74 > 0) {
                                int var117 = var74 * var103;
                                var110 += var117;
                                var116 += (var117 - var99) / 2;
                            } else {
                                var110 += var99;
                            }
                            var115 = var110;
                            if (var76 > 0) {
                                var110 += var76;
                            }
                        }
                        int var118 = arg0.field1208[var49] - field519;
                        int var119 = var52.field2143 - var52.field2143 * var118 / var52.field2133;
                        int var120 = var52.field2138 * var118 / var52.field2133 + -var52.field2138;
                        int var121 = field724 + arg2 - (var110 >> 1) + var119;
                        int var122 = field545 + arg3 - 12 + var120;
                        int var123 = var122;
                        int var124 = var81 + var122;
                        int var125 = var52.field2148 + var122 + 15;
                        int var126 = var125 - var94.field4407;
                        int var127 = var94.field4418 + var125;
                        if (var126 < var122) {
                            var123 = var126;
                        }
                        if (var127 > var124) {
                            var124 = var127;
                        }
                        int var128 = 0;
                        if (var55 != null) {
                            var128 = var55.field2148 + var122 + 15;
                            int var129 = var128 - var95.field4407;
                            int var130 = var95.field4418 + var128;
                            if (var129 < var123) {
                                ;
                            }
                            if (var130 > var124) {
                                ;
                            }
                        }
                        int var133 = 255;
                        if (var52.field2145 >= 0) {
                            var133 = (var118 << 8) / (var52.field2133 - var52.field2145);
                        }
                        if (var133 >= 0 && var133 < 255) {
                            if (var82 != null) {
                                var82.method8271(var105 + var121 - var65, var122, var133);
                            }
                            if (var86 != null) {
                                var86.method8271(var106 + var121 - var67, var122, var133);
                            }
                            if (var84 != null) {
                                for (int var134 = 0; var134 < var102; var134++) {
                                    var84.method8271(var62 * var134 + (var107 + var121 - var66), var122, var133);
                                }
                            }
                            if (var88 != null) {
                                var88.method8271(var111 + var121 - var68, var122, var133);
                            }
                            var94.method6571(var100, var108 + var121, var125, var52.field2131, 0, var133);
                            if (var55 != null) {
                                if (var69 != null) {
                                    var69.method8271(var112 + var121 - var77, var122, var133);
                                }
                                if (var71 != null) {
                                    var71.method8271(var113 + var121 - var79, var122, var133);
                                }
                                if (var70 != null) {
                                    for (int var135 = 0; var135 < var103; var135++) {
                                        var70.method8271(var74 * var135 + (var114 + var121 - var78), var122, var133);
                                    }
                                }
                                if (var72 != null) {
                                    var72.method8271(var115 + var121 - var80, var122, var133);
                                }
                                var95.method6571(var97, var116 + var121, var128, var55.field2131, 0, var133);
                            }
                        } else {
                            if (var82 != null) {
                                var82.method8252(var105 + var121 - var65, var122);
                            }
                            if (var86 != null) {
                                var86.method8252(var106 + var121 - var67, var122);
                            }
                            if (var84 != null) {
                                for (int var136 = 0; var136 < var102; var136++) {
                                    var84.method8252(var62 * var136 + (var107 + var121 - var66), var122);
                                }
                            }
                            if (var88 != null) {
                                var88.method8252(var111 + var121 - var68, var122);
                            }
                            var94.method6525(var100, var108 + var121, var125, var52.field2131 | 0xFF000000, 0);
                            if (var55 != null) {
                                if (var69 != null) {
                                    var69.method8252(var112 + var121 - var77, var122);
                                }
                                if (var71 != null) {
                                    var71.method8252(var113 + var121 - var79, var122);
                                }
                                if (var70 != null) {
                                    for (int var137 = 0; var137 < var103; var137++) {
                                        var70.method8252(var74 * var137 + (var114 + var121 - var78), var122);
                                    }
                                }
                                if (var72 != null) {
                                    var72.method8252(var115 + var121 - var80, var122);
                                }
                                var95.method6525(var97, var116 + var121, var128, var55.field2131 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("gw.if(B)V")
    public static final void method3795() {
        field692 = 0;
        int var0 = (Statics.field1790.field1243 >> 7) + Statics.field1780;
        int var1 = (Statics.field1790.field1179 >> 7) + Statics.field4368;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field692 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field692 = 1;
        }
        if (field692 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field692 = 0;
        }
    }

    @ObfuscatedName("ch.iz(Lct;II)V")
    public static final void method2386(class92 arg0, int arg1) {
        method1088(arg0.field1243, arg0.field1179, arg1);
    }

    @ObfuscatedName("bl.ir(IIIB)V")
    public static final void method1088(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field724 = -1;
            field545 = -1;
            return;
        }
        int var3 = method3401(arg0, arg1, Statics.field4488) - arg2;
        int var4 = arg0 - Statics.field1710;
        int var5 = var3 - Statics.field4643;
        int var6 = arg1 - Statics.field1798;
        int var7 = class213.field2486[Statics.field1332];
        int var8 = class213.field2509[Statics.field1332];
        int var9 = class213.field2486[Statics.field1599];
        int var10 = class213.field2509[Statics.field1599];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field724 = field791 * var11 / var15 + field789 / 2;
            field545 = field791 * var14 / var15 + field688 / 2;
        } else {
            field724 = -1;
            field545 = -1;
        }
    }

    @ObfuscatedName("gq.ii(IIII)I")
    public static final int method3401(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class79.field1035[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class79.field1027[var5][var3][var4] + class79.field1027[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class79.field1027[var5][var3][var4 + 1] + class79.field1027[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("cx.is(ZLqx;I)V")
    public static final void method2136(boolean arg0, class466 arg1) {
        field578 = arg0;
        if (!field578) {
            int var2 = arg1.method7772();
            int var3 = arg1.method7834();
            int var4 = arg1.method7794();
            Statics.field1400 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field1400[var5][var6] = arg1.method7946();
                }
            }
            Statics.field2368 = new int[var4];
            Statics.field783 = new int[var4];
            Statics.field4465 = new int[var4];
            Statics.field1640 = new byte[var4][];
            Statics.field2908 = new byte[var4][];
            int var7 = 0;
            for (int var8 = (var2 - 6) / 8; var8 <= (var2 + 6) / 8; var8++) {
                for (int var9 = (var3 - 6) / 8; var9 <= (var3 + 6) / 8; var9++) {
                    int var10 = (var8 << 8) + var9;
                    Statics.field2368[var7] = var10;
                    Statics.field783[var7] = Statics.field8.method5861("m" + var8 + "_" + var9);
                    Statics.field4465[var7] = Statics.field8.method5861("l" + var8 + "_" + var9);
                    var7++;
                }
            }
            Statics.method4953(var2, var3, true);
            return;
        }
        int var11 = arg1.method7834();
        int var12 = arg1.method7834();
        boolean var13 = arg1.method7823() == 1;
        int var14 = arg1.method7794();
        arg1.method7741();
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 13; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    int var18 = arg1.method7747(1);
                    if (var18 == 1) {
                        field579[var15][var16][var17] = arg1.method7747(26);
                    } else {
                        field579[var15][var16][var17] = -1;
                    }
                }
            }
        }
        arg1.method7743();
        Statics.field1400 = new int[var14][4];
        for (int var19 = 0; var19 < var14; var19++) {
            for (int var20 = 0; var20 < 4; var20++) {
                Statics.field1400[var19][var20] = arg1.method7946();
            }
        }
        Statics.field2368 = new int[var14];
        Statics.field783 = new int[var14];
        Statics.field4465 = new int[var14];
        Statics.field1640 = new byte[var14][];
        Statics.field2908 = new byte[var14][];
        int var21 = 0;
        for (int var22 = 0; var22 < 4; var22++) {
            for (int var23 = 0; var23 < 13; var23++) {
                for (int var24 = 0; var24 < 13; var24++) {
                    int var25 = field579[var22][var23][var24];
                    if (var25 != -1) {
                        int var26 = var25 >> 14 & 0x3FF;
                        int var27 = var25 >> 3 & 0x7FF;
                        int var28 = (var26 / 8 << 8) + var27 / 8;
                        for (int var29 = 0; var29 < var21; var29++) {
                            if (Statics.field2368[var29] == var28) {
                                var28 = -1;
                                break;
                            }
                        }
                        if (var28 != -1) {
                            Statics.field2368[var21] = var28;
                            int var30 = var28 >> 8 & 0xFF;
                            int var31 = var28 & 0xFF;
                            Statics.field783[var21] = Statics.field8.method5861("m" + var30 + "_" + var31);
                            Statics.field4465[var21] = Statics.field8.method5861("l" + var30 + "_" + var31);
                            var21++;
                        }
                    }
                }
            }
        }
        Statics.method4953(var11, var12, !var13);
    }

    @ObfuscatedName("pt.ib(ZI)V")
    public static final void method7484(boolean arg0) {
        method1542();
        field567.field1428++;
        if (field567.field1428 < 50 && !arg0) {
            return;
        }
        field567.field1428 = 0;
        if (field569 || field567.method2587() == null) {
            return;
        }
        class278 var1 = class278.method2890(class276.field3130, field567.field1425);
        field567.method2603(var1);
        try {
            field567.method2594();
        } catch (IOException var3) {
            field569 = true;
        }
    }

    @ObfuscatedName("an.ig(B)V")
    public static final void method658() {
        method7484(false);
        field602 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field1640.length; var1++) {
            if (Statics.field783[var1] != -1 && Statics.field1640[var1] == null) {
                Statics.field1640[var1] = Statics.field8.method5909(Statics.field783[var1], 0);
                if (Statics.field1640[var1] == null) {
                    var0 = false;
                    field602++;
                }
            }
            if (Statics.field4465[var1] != -1 && Statics.field2908[var1] == null) {
                Statics.field2908[var1] = Statics.field8.method5846(Statics.field4465[var1], 0, Statics.field1400[var1]);
                if (Statics.field2908[var1] == null) {
                    var0 = false;
                    field602++;
                }
            }
        }
        if (!var0) {
            field659 = 1;
            return;
        }
        field787 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field1640.length; var3++) {
            byte[] var4 = Statics.field2908[var3];
            if (var4 != null) {
                int var5 = (Statics.field2368[var3] >> 8) * 64 - Statics.field1780;
                int var6 = (Statics.field2368[var3] & 0xFF) * 64 - Statics.field4368;
                if (field578) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class79.method2100(var4, var5, var6);
            }
        }
        if (!var2) {
            field659 = 2;
            return;
        }
        if (field659 != 0) {
            method833(class326.field3949 + class98.field1327 + class98.field1324 + 100 + "%" + class98.field1328, true);
        }
        method1542();
        Statics.field286.method4043();
        for (int var7 = 0; var7 < 4; var7++) {
            field577[var7].method3760();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class79.field1035[var8][var9][var10] = 0;
                }
            }
        }
        method1542();
        class79.method5992();
        int var11 = Statics.field1640.length;
        class67.method2628();
        method7484(true);
        if (!field578) {
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = (Statics.field2368[var12] >> 8) * 64 - Statics.field1780;
                int var14 = (Statics.field2368[var12] & 0xFF) * 64 - Statics.field4368;
                byte[] var15 = Statics.field1640[var12];
                if (var15 != null) {
                    method1542();
                    class79.method159(var15, var13, var14, Statics.field102 * 8 - 48, Statics.field3342 * 8 - 48, field577);
                }
            }
            for (int var16 = 0; var16 < var11; var16++) {
                int var17 = (Statics.field2368[var16] >> 8) * 64 - Statics.field1780;
                int var18 = (Statics.field2368[var16] & 0xFF) * 64 - Statics.field4368;
                byte[] var19 = Statics.field1640[var16];
                if (var19 == null && Statics.field3342 < 800) {
                    method1542();
                    class79.method1924(var17, var18, 64, 64);
                }
            }
            method7484(true);
            for (int var20 = 0; var20 < var11; var20++) {
                byte[] var21 = Statics.field2908[var20];
                if (var21 != null) {
                    int var22 = (Statics.field2368[var20] >> 8) * 64 - Statics.field1780;
                    int var23 = (Statics.field2368[var20] & 0xFF) * 64 - Statics.field4368;
                    method1542();
                    class79.method2896(var21, var22, var23, Statics.field286, field577);
                }
            }
        }
        if (field578) {
            for (int var24 = 0; var24 < 4; var24++) {
                method1542();
                for (int var25 = 0; var25 < 13; var25++) {
                    for (int var26 = 0; var26 < 13; var26++) {
                        boolean var27 = false;
                        int var28 = field579[var24][var25][var26];
                        if (var28 != -1) {
                            int var29 = var28 >> 24 & 0x3;
                            int var30 = var28 >> 1 & 0x3;
                            int var31 = var28 >> 14 & 0x3FF;
                            int var32 = var28 >> 3 & 0x7FF;
                            int var33 = (var31 / 8 << 8) + var32 / 8;
                            for (int var34 = 0; var34 < Statics.field2368.length; var34++) {
                                if (Statics.field2368[var34] == var33 && Statics.field1640[var34] != null) {
                                    int var35 = (var31 - var25) * 8;
                                    int var36 = (var32 - var26) * 8;
                                    class79.method355(Statics.field1640[var34], var24, var25 * 8, var26 * 8, var29, (var31 & 0x7) * 8, (var32 & 0x7) * 8, var30, var35, var36, field577);
                                    var27 = true;
                                    break;
                                }
                            }
                        }
                        if (!var27) {
                            class79.method1091(var24, var25 * 8, var26 * 8);
                        }
                    }
                }
            }
            for (int var37 = 0; var37 < 13; var37++) {
                for (int var38 = 0; var38 < 13; var38++) {
                    int var39 = field579[0][var37][var38];
                    if (var39 == -1) {
                        class79.method1924(var37 * 8, var38 * 8, 8, 8);
                    }
                }
            }
            method7484(true);
            for (int var40 = 0; var40 < 4; var40++) {
                method1542();
                for (int var41 = 0; var41 < 13; var41++) {
                    for (int var42 = 0; var42 < 13; var42++) {
                        int var43 = field579[var40][var41][var42];
                        if (var43 != -1) {
                            int var44 = var43 >> 24 & 0x3;
                            int var45 = var43 >> 1 & 0x3;
                            int var46 = var43 >> 14 & 0x3FF;
                            int var47 = var43 >> 3 & 0x7FF;
                            int var48 = (var46 / 8 << 8) + var47 / 8;
                            for (int var49 = 0; var49 < Statics.field2368.length; var49++) {
                                if (Statics.field2368[var49] == var48 && Statics.field2908[var49] != null) {
                                    class79.method2040(Statics.field2908[var49], var40, var41 * 8, var42 * 8, var44, (var46 & 0x7) * 8, (var47 & 0x7) * 8, var45, Statics.field286, field577);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method7484(true);
        method1542();
        class79.method4470(Statics.field286, field577);
        method7484(true);
        int var50 = class79.field1028;
        if (var50 > Statics.field4488) {
            var50 = Statics.field4488;
        }
        if (var50 < Statics.field4488 - 1) {
            int var51 = Statics.field4488 - 1;
        }
        if (field562) {
            Statics.field286.method4149(class79.field1028);
        } else {
            Statics.field286.method4149(0);
        }
        for (int var52 = 0; var52 < 104; var52++) {
            for (int var53 = 0; var53 < 104; var53++) {
                method6283(var52, var53);
            }
        }
        method1542();
        method3799();
        class196.field2184.method4918();
        if (Statics.field1488.method521()) {
            class278 var54 = class278.method2890(class276.field3131, field567.field1425);
            var54.field3177.method7778(1057001181);
            field567.method2603(var54);
        }
        if (!field578) {
            int var55 = (Statics.field102 - 6) / 8;
            int var56 = (Statics.field102 + 6) / 8;
            int var57 = (Statics.field3342 - 6) / 8;
            int var58 = (Statics.field3342 + 6) / 8;
            for (int var59 = var55 - 1; var59 <= var56 + 1; var59++) {
                for (int var60 = var57 - 1; var60 <= var58 + 1; var60++) {
                    if (var59 < var55 || var59 > var56 || var60 < var57 || var60 > var58) {
                        Statics.field8.method5925("m" + var59 + "_" + var60);
                        Statics.field8.method5925("l" + var59 + "_" + var60);
                    }
                }
            }
        }
        method2906(30);
        method1542();
        class79.method6731();
        class278 var61 = class278.method2890(class276.field3108, field567.field1425);
        field567.method2603(var61);
        class36.method421();
    }

    @ObfuscatedName("gf.ix(IIIIII)V")
    public static final void method3291(int arg0, int arg1, int arg2, int arg3, int arg4) {
        long var5 = Statics.field286.method4222(arg0, arg1, arg2);
        if (var5 != 0L) {
            int var7 = Statics.field286.method4166(arg0, arg1, arg2, var5);
            int var8 = var7 >> 6 & 0x3;
            int var9 = var7 & 0x1F;
            int var10 = arg3;
            boolean var11 = var5 != 0L && !class225.method4928(var5);
            if (var11) {
                var10 = arg4;
            }
            int[] var12 = Statics.field2817.field5021;
            int var13 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var14 = class225.method4236(var5);
            class196 var15 = class196.method3208(var14);
            if (var15.field2173 == -1) {
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
                class480 var16 = Statics.field191[var15.field2173];
                if (var16 != null) {
                    int var17 = (var15.field2168 * 4 - var16.field5008) / 2;
                    int var18 = (var15.field2169 * 4 - var16.field5005) / 2;
                    var16.method8196(arg1 * 4 + 48 + var17, (104 - arg2 - var15.field2169) * 4 + 48 + var18);
                }
            }
        }
        long var19 = Statics.field286.method4202(arg0, arg1, arg2);
        if (var19 != 0L) {
            int var21 = Statics.field286.method4166(arg0, arg1, arg2, var19);
            int var22 = var21 >> 6 & 0x3;
            int var23 = var21 & 0x1F;
            int var24 = class225.method4236(var19);
            class196 var25 = class196.method3208(var24);
            if (var25.field2173 != -1) {
                class480 var26 = Statics.field191[var25.field2173];
                if (var26 != null) {
                    int var27 = (var25.field2168 * 4 - var26.field5008) / 2;
                    int var28 = (var25.field2169 * 4 - var26.field5005) / 2;
                    var26.method8196(arg1 * 4 + 48 + var27, (104 - arg2 - var25.field2169) * 4 + 48 + var28);
                }
            } else if (var23 == 9) {
                int var29 = 15658734;
                boolean var30 = var19 != 0L && !class225.method4928(var19);
                if (var30) {
                    var29 = 15597568;
                }
                int[] var31 = Statics.field2817.field5021;
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
        long var33 = Statics.field286.method4072(arg0, arg1, arg2);
        if (var33 == 0L) {
            return;
        }
        int var35 = class225.method4236(var33);
        class196 var36 = class196.method3208(var35);
        if (var36.field2173 == -1) {
            return;
        }
        class480 var37 = Statics.field191[var36.field2173];
        if (var37 != null) {
            int var38 = (var36.field2168 * 4 - var37.field5008) / 2;
            int var39 = (var36.field2169 * 4 - var37.field5005) / 2;
            var37.method8196(arg1 * 4 + 48 + var38, (104 - arg2 - var36.field2169) * 4 + 48 + var39);
        }
    }

    @ObfuscatedName("client.ic(Lde;II)Z")
    public boolean method1332(class108 arg0, int arg1) {
        if (arg0.field1430 == 0) {
            Statics.field3324 = null;
        } else {
            if (Statics.field3324 == null) {
                Statics.field3324 = new class390(Statics.field986, Statics.field1488);
            }
            Statics.field3324.method6786(arg0.field1426, arg1);
        }
        field611 = field706;
        Statics.field3320 = true;
        arg0.field1427 = null;
        return true;
    }

    @ObfuscatedName("client.iw(Lde;I)Z")
    public boolean method1328(class108 arg0) {
        if (Statics.field3324 != null) {
            Statics.field3324.method6783(arg0.field1426);
        }
        field611 = field706;
        Statics.field3320 = true;
        arg0.field1427 = null;
        return true;
    }

    @ObfuscatedName("client.il(Lde;I)Z")
    public final boolean method1619(class108 arg0) {
        class400 var2 = arg0.method2587();
        class466 var3 = arg0.field1426;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1427 == null) {
                if (arg0.field1431) {
                    if (!var2.method6955(1)) {
                        return false;
                    }
                    var2.method6943(arg0.field1426.field4917, 0, 1);
                    arg0.field1421 = 0;
                    arg0.field1431 = false;
                }
                var3.field4915 = 0;
                if (var3.method7738()) {
                    if (!var2.method6955(1)) {
                        return false;
                    }
                    var2.method6943(arg0.field1426.field4917, 1, 1);
                    arg0.field1421 = 0;
                }
                arg0.field1431 = true;
                class279[] var4 = Statics.method3310();
                int var5 = var3.method7748();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field4915);
                }
                arg0.field1427 = var4[var5];
                arg0.field1430 = arg0.field1427.field3221;
            }
            if (arg0.field1430 == -1) {
                if (!var2.method6955(1)) {
                    return false;
                }
                arg0.method2587().method6943(var3.field4917, 0, 1);
                arg0.field1430 = var3.field4917[0] & 0xFF;
            }
            if (arg0.field1430 == -2) {
                if (!var2.method6955(2)) {
                    return false;
                }
                arg0.method2587().method6943(var3.field4917, 0, 2);
                var3.field4915 = 0;
                arg0.field1430 = var3.method7794();
            }
            if (!var2.method6955(arg0.field1430)) {
                return false;
            }
            var3.field4915 = 0;
            var2.method6943(var3.field4917, 0, arg0.field1430);
            arg0.field1421 = 0;
            field513.method6712();
            arg0.field1434 = arg0.field1433;
            arg0.field1433 = arg0.field1432;
            arg0.field1432 = arg0.field1427;
            if (class279.field3209 == arg0.field1427) {
                method306(class277.field3172);
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3194 == arg0.field1427) {
                method306(class277.field3169);
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3256 == arg0.field1427) {
                method5761(false, var3);
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3207 == arg0.field1427) {
                if (Statics.field1287 == null) {
                    Statics.field1287 = new class415(Statics.field205);
                }
                class476 var6 = Statics.field205.method7171(var3);
                Statics.field1287.field4645.method7541(var6.field4981, var6.field4982);
                field713[++field714 - 1 & 0x1F] = var6.field4981;
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3247 == arg0.field1427) {
                Statics.field1919 = var3.method7792();
                Statics.field1561 = var3.method7941();
                while (var3.field4915 < arg0.field1430) {
                    int var7 = var3.method7792();
                    class277 var8 = class277.method3383()[var7];
                    method306(var8);
                }
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3226 == arg0.field1427) {
                int var9 = var3.method7946();
                int var10 = var3.method7794();
                if (var9 < -70000) {
                    var10 += 32768;
                }
                class306 var11;
                if (var9 >= 0) {
                    var11 = Statics.method3181(var9);
                } else {
                    var11 = null;
                }
                while (var3.field4915 < arg0.field1430) {
                    int var12 = var3.method7806();
                    int var13 = var3.method7794();
                    int var14 = 0;
                    if (var13 != 0) {
                        var14 = var3.method7792();
                        if (var14 == 255) {
                            var14 = var3.method7946();
                        }
                    }
                    if (var11 != null && var12 >= 0 && var12 < var11.field3535.length) {
                        var11.field3535[var12] = var13;
                        var11.field3581[var12] = var14;
                    }
                    class82.method147(var10, var12, var13 - 1, var14);
                }
                if (var11 != null) {
                    method1922(var11);
                }
                method2889();
                field709[++field710 - 1 & 0x1F] = var10 & 0x7FFF;
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3284 == arg0.field1427) {
                byte var15 = var3.method7793();
                String var16 = var3.method7801();
                long var17 = (long) var3.method7794();
                long var19 = (long) var3.method7796();
                class328 var21 = (class328) class347.method1688(class328.method3002(), var3.method7792());
                long var22 = (var17 << 32) + var19;
                boolean var24 = false;
                Object var25 = null;
                class157 var26 = var15 >= 0 ? field633[var15] : Statics.field1959;
                if (var26 == null) {
                    var24 = true;
                } else {
                    int var27 = 0;
                    while (true) {
                        if (var27 >= 100) {
                            if (var21.field4166 && Statics.field4582.method1701(new class490(var16, Statics.field986))) {
                                var24 = true;
                            }
                            break;
                        }
                        if (field524[var27] == var22) {
                            var24 = true;
                            break;
                        }
                        var27++;
                    }
                }
                if (!var24) {
                    field524[field747] = var22;
                    field747 = (field747 + 1) % 100;
                    String var28 = class372.method6553(class309.method3009(var3));
                    int var29 = var15 >= 0 ? 41 : 44;
                    if (var21.field4164 == -1) {
                        class107.method6720(var29, var16, var28, var26.field1796);
                    } else {
                        class107.method6720(var29, class98.method7661(var21.field4164) + var16, var28, var26.field1796);
                    }
                }
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3273 == arg0.field1427) {
                field772 = true;
                field773 = false;
                Statics.field1788 = var3.method7792();
                Statics.field209 = var3.method7792();
                Statics.field1002 = var3.method7794();
                Statics.field182 = var3.method7792();
                Statics.field2482 = var3.method7792();
                if (Statics.field2482 >= 100) {
                    Statics.field1710 = Statics.field1788 * 128 + 64;
                    Statics.field1798 = Statics.field209 * 128 + 64;
                    Statics.field4643 = method3401(Statics.field1710, Statics.field1798, Statics.field4488) - Statics.field1002;
                }
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3196 == arg0.field1427) {
                int var30 = var3.method7833();
                if (var30 == 65535) {
                    var30 = -1;
                }
                method3170(var30);
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3249 == arg0.field1427) {
                int var31 = var3.method7871();
                int var32 = var3.method7772();
                if (var32 == 65535) {
                    var32 = -1;
                }
                method188(var32, var31);
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3193 == arg0.field1427) {
                Statics.field1287 = null;
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3268 == arg0.field1427) {
                field514 = field706;
                byte var33 = var3.method7793();
                class154 var34 = new class154(var3);
                class157 var35;
                if (var33 >= 0) {
                    var35 = field633[var33];
                } else {
                    var35 = Statics.field1959;
                }
                var34.method3008(var35);
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3245 == arg0.field1427) {
                int var36 = var3.method7846();
                int var37 = var3.method7834();
                int var38 = var37 >> 10 & 0x1F;
                int var39 = var37 >> 5 & 0x1F;
                int var40 = var37 & 0x1F;
                int var41 = (var40 << 3) + (var38 << 19) + (var39 << 11);
                class306 var42 = Statics.method3181(var36);
                if (var42.field3567 != var41) {
                    var42.field3567 = var41;
                    method1922(var42);
                }
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3291 == arg0.field1427) {
                for (int var43 = 0; var43 < field635.length; var43++) {
                    if (field635[var43] != null) {
                        field635[var43].field1220 = -1;
                    }
                }
                for (int var44 = 0; var44 < field753.length; var44++) {
                    if (field753[var44] != null) {
                        field753[var44].field1220 = -1;
                    }
                }
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3240 == arg0.field1427) {
                int var45 = var3.method7792();
                if (var3.method7792() == 0) {
                    field717[var45] = new class342();
                    var3.field4915 += 18;
                } else {
                    var3.field4915--;
                    field717[var45] = new class342(var3, false);
                }
                field778 = field706;
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3234 == arg0.field1427) {
                method2136(false, arg0.field1426);
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3191 == arg0.field1427) {
                class65 var46 = new class65();
                var46.field820 = var3.method7801();
                var46.field812 = var3.method7794();
                int var47 = var3.method7946();
                var46.field818 = var47;
                method2906(45);
                var2.method6948();
                Object var48 = null;
                class73.method2739(var46);
                arg0.field1427 = null;
                return false;
            }
            if (class279.field3230 == arg0.field1427) {
                method554();
                byte var49 = var3.method7793();
                if (arg0.field1430 == 1) {
                    if (var49 >= 0) {
                        field754[var49] = null;
                    } else {
                        Statics.field115 = null;
                    }
                    arg0.field1427 = null;
                    return true;
                }
                if (var49 >= 0) {
                    field754[var49] = new class148(var3);
                } else {
                    Statics.field115 = new class148(var3);
                }
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3222 == arg0.field1427) {
                method306(class277.field3161);
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3265 == arg0.field1427) {
                Statics.field1288 = class486.method4415(var3.method7792());
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3278 == arg0.field1427) {
                String var50 = var3.method7801();
                long var51 = (long) var3.method7794();
                long var53 = (long) var3.method7796();
                class328 var55 = (class328) class347.method1688(class328.method3002(), var3.method7792());
                long var56 = (var51 << 32) + var53;
                boolean var58 = false;
                for (int var59 = 0; var59 < 100; var59++) {
                    if (field524[var59] == var56) {
                        var58 = true;
                        break;
                    }
                }
                if (Statics.field4582.method1701(new class490(var50, Statics.field986))) {
                    var58 = true;
                }
                if (!var58 && field692 == 0) {
                    field524[field747] = var56;
                    field747 = (field747 + 1) % 100;
                    String var60 = class372.method6553(class361.method3430(class309.method3009(var3)));
                    byte var61;
                    if (var55.field4152) {
                        var61 = 7;
                    } else {
                        var61 = 3;
                    }
                    if (var55.field4164 == -1) {
                        class107.method3247(var61, var50, var60);
                    } else {
                        class107.method3247(var61, class98.method7661(var55.field4164) + var50, var60);
                    }
                }
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3280 == arg0.field1427) {
                byte var62 = var3.method7793();
                int var63 = var3.method7837();
                int var64 = var63 >> 16;
                int var65 = var63 >> 8 & 0xFF;
                int var66 = (var63 >> 4 & 0x7) + var64;
                int var67 = (var63 & 0x7) + var65;
                int var68 = var3.method7795();
                int var69 = var3.method7834();
                byte var70 = var3.method7960();
                int var71 = var3.method7941();
                int var72 = var3.method7944() * 4;
                int var73 = var3.method7834();
                int var74 = var3.method7792();
                int var75 = var3.method7833();
                int var76 = var3.method7944() * 4;
                int var77 = var62 + var66;
                int var78 = var67 + var70;
                if (var66 >= 0 && var67 >= 0 && var66 < 104 && var67 < 104 && var77 >= 0 && var78 >= 0 && var77 < 104 && var78 < 104 && var75 != 65535) {
                    int var79 = var66 * 128 + 64;
                    int var80 = var67 * 128 + 64;
                    int var81 = var77 * 128 + 64;
                    int var82 = var78 * 128 + 64;
                    class74 var83 = new class74(var75, Statics.field4488, var79, var80, method3401(var79, var80, Statics.field4488) - var72, field519 + var69, field519 + var73, var71, var74, var68, var76);
                    var83.method1990(var81, var82, method3401(var81, var82, Statics.field4488) - var76, field519 + var69);
                    field650.method6081(var83);
                }
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3201 == arg0.field1427) {
                int var84 = var3.method7823() * 4;
                byte var85 = var3.method7960();
                int var86 = var3.method7792();
                byte var87 = var3.method7960();
                int var88 = var3.method7834();
                int var89 = var3.method7916();
                int var90 = var3.method7836();
                int var91 = var90 >> 16;
                int var92 = var90 >> 8 & 0xFF;
                int var93 = (var90 >> 4 & 0x7) + var91;
                int var94 = (var90 & 0x7) + var92;
                int var95 = var3.method7792() * 4;
                int var96 = var3.method7941();
                int var97 = var3.method7772();
                int var98 = var3.method7834();
                int var99 = var87 + var93;
                int var100 = var85 + var94;
                if (var93 >= 0 && var94 >= 0 && var93 < 104 && var94 < 104 && var99 >= 0 && var100 >= 0 && var99 < 104 && var100 < 104 && var88 != 65535) {
                    int var101 = var93 * 128 + 64;
                    int var102 = var94 * 128 + 64;
                    int var103 = var99 * 128 + 64;
                    int var104 = var100 * 128 + 64;
                    class74 var105 = new class74(var88, Statics.field4488, var101, var102, method3401(var101, var102, Statics.field4488) - var95, field519 + var97, field519 + var98, var86, var96, var89, var84);
                    var105.method1990(var103, var104, method3401(var103, var104, Statics.field4488) - var84, field519 + var97);
                    field650.method6081(var105);
                }
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3210 == arg0.field1427) {
                Statics.field4582.field830.method6763(var3, arg0.field1430);
                method4788();
                field716 = field706;
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3188 == arg0.field1427) {
                int var106 = var3.method7833();
                byte var107 = var3.method7943();
                class296.field3444[var106] = var107;
                if (class296.field3445[var106] != var107) {
                    class296.field3445[var106] = var107;
                }
                method2154(var106);
                field707[++field708 - 1 & 0x1F] = var106;
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3250 == arg0.field1427) {
                Statics.field4582.method1714();
                field716 = field706;
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3283 == arg0.field1427) {
                int var108 = var3.method7823();
                String var109 = var3.method7801();
                int var110 = var3.method7792();
                if (var110 >= 1 && var110 <= 8) {
                    if (var109.equalsIgnoreCase(class326.field3819)) {
                        var109 = null;
                    }
                    field644[var110 - 1] = var109;
                    field645[var110 - 1] = var108 == 0;
                }
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3231 == arg0.field1427) {
                int var111 = var3.method7772();
                class89 var112;
                if (field636 == var111) {
                    var112 = Statics.field1790;
                } else {
                    var112 = field635[var111];
                }
                int var113 = var3.method7833();
                int var114 = var3.method7846();
                if (var112 != null) {
                    var112.field1225 = var113;
                    var112.field1247 = var114 >> 16;
                    var112.field1228 = (var114 & 0xFFFF) + field519;
                    var112.field1226 = 0;
                    var112.field1215 = 0;
                    if (var112.field1228 > field519) {
                        var112.field1226 = -1;
                    }
                    if (var112.field1225 == 65535) {
                        var112.field1225 = -1;
                    }
                }
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3279 == arg0.field1427) {
                method2136(true, arg0.field1426);
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3213 == arg0.field1427) {
                field525 = var3.method7772() * 30;
                field722 = field706;
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3233 == arg0.field1427) {
                field514 = field706;
                byte var115 = var3.method7793();
                if (arg0.field1430 == 1) {
                    if (var115 >= 0) {
                        field633[var115] = null;
                    } else {
                        Statics.field1959 = null;
                    }
                    arg0.field1427 = null;
                    return true;
                }
                if (var115 >= 0) {
                    field633[var115] = new class157(var3);
                } else {
                    Statics.field1959 = new class157(var3);
                }
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3184 == arg0.field1427) {
                int var116 = var3.method7772();
                field681 = var116;
                this.method1627(false);
                method1921(var116);
                class68.method446(field681);
                for (int var117 = 0; var117 < 100; var117++) {
                    field732[var117] = true;
                }
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3285 == arg0.field1427) {
                method306(class277.field3165);
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3296 == arg0.field1427) {
                method2889();
                field630 = var3.method7794();
                field722 = field706;
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3244 == arg0.field1427) {
                for (int var118 = 0; var118 < Statics.field1923; var118++) {
                    class178 var119 = class178.method2635(var118);
                    if (var119 != null) {
                        class296.field3444[var118] = 0;
                        class296.field3445[var118] = 0;
                    }
                }
                method2889();
                field708 += 32;
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3238 == arg0.field1427) {
                field772 = false;
                for (int var120 = 0; var120 < 5; var120++) {
                    field774[var120] = false;
                }
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3281 == arg0.field1427) {
                int var121 = var3.method7835();
                int var122 = var3.method7846();
                int var123 = var3.method7795();
                class306 var124 = Statics.method3181(var122);
                if (var124.field3551 != var123 || var124.field3552 != var121 || var124.field3590 != 0 || var124.field3689 != 0) {
                    var124.field3551 = var123;
                    var124.field3552 = var121;
                    var124.field3590 = 0;
                    var124.field3689 = 0;
                    method1922(var124);
                    this.method1620(var124);
                    if (var124.field3679 == 0) {
                        method3169(Statics.field914[var122 >> 16], var124, false);
                    }
                }
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3216 == arg0.field1427 && field772) {
                field773 = true;
                Statics.field182 = var3.method7792();
                Statics.field2482 = var3.method7792();
                Statics.field4648 = var3.method7792();
                Statics.field1284 = var3.method7792();
                for (int var125 = 0; var125 < 5; var125++) {
                    field774[var125] = false;
                }
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3260 == arg0.field1427) {
                method2889();
                int var126 = var3.method7846();
                int var127 = var3.method7944();
                int var128 = var3.method7944();
                field654[var128] = var126;
                field581[var128] = var127;
                field653[var128] = 1;
                for (int var129 = 0; var129 < 98; var129++) {
                    if (var126 >= class316.field3756[var129]) {
                        field653[var128] = var129 + 2;
                    }
                }
                field637[++field712 - 1 & 0x1F] = var128;
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3206 == arg0.field1427) {
                method554();
                byte var130 = var3.method7793();
                class140 var131 = new class140(var3);
                class148 var132;
                if (var130 >= 0) {
                    var132 = field754[var130];
                } else {
                    var132 = Statics.field115;
                }
                var131.method2903(var132);
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3297 == arg0.field1427) {
                int var133 = var3.method7946();
                int var134 = var3.method7944();
                short var135 = (short) var3.method7795();
                int var136 = var3.method7834();
                class97 var137 = field753[var136];
                if (var137 != null) {
                    var137.method2412(var134, var133, var135);
                }
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3229 == arg0.field1427) {
                field526 = var3.method7792();
                if (field526 == 1) {
                    field527 = var3.method7794();
                }
                if (field526 >= 2 && field526 <= 6) {
                    if (field526 == 2) {
                        field532 = 64;
                        field627 = 64;
                    }
                    if (field526 == 3) {
                        field532 = 0;
                        field627 = 64;
                    }
                    if (field526 == 4) {
                        field532 = 128;
                        field627 = 64;
                    }
                    if (field526 == 5) {
                        field532 = 64;
                        field627 = 0;
                    }
                    if (field526 == 6) {
                        field532 = 64;
                        field627 = 128;
                    }
                    field526 = 2;
                    field529 = var3.method7794();
                    field570 = var3.method7794();
                    field531 = var3.method7792();
                }
                if (field526 == 10) {
                    field595 = var3.method7794();
                }
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3224 == arg0.field1427) {
                method306(class277.field3158);
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3290 == arg0.field1427) {
                int var138 = var3.method7796();
                int var139 = var138 >> 16;
                int var140 = var138 >> 8 & 0xFF;
                int var141 = (var138 >> 4 & 0x7) + var139;
                int var142 = (var138 & 0x7) + var140;
                int var143 = var3.method7944();
                int var144 = var143 >> 2;
                int var145 = var143 & 0x3;
                int var146 = field580[var144];
                int var147 = var3.method7772();
                if (var141 >= 0 && var142 >= 0 && var141 < 103 && var142 < 103) {
                    if (var146 == 0) {
                        class229 var148 = Statics.field286.method4065(Statics.field4488, var141, var142);
                        if (var148 != null) {
                            int var149 = class225.method4236(var148.field2786);
                            if (var144 == 2) {
                                var148.field2779 = new class77(var149, 2, var145 + 4, Statics.field4488, var141, var142, var147, false, var148.field2779);
                                var148.field2785 = new class77(var149, 2, var145 + 1 & 0x3, Statics.field4488, var141, var142, var147, false, var148.field2785);
                            } else {
                                var148.field2779 = new class77(var149, var144, var145, Statics.field4488, var141, var142, var147, false, var148.field2779);
                            }
                        }
                    } else if (var146 == 1) {
                        class231 var150 = Statics.field286.method4217(Statics.field4488, var141, var142);
                        if (var150 != null) {
                            int var151 = class225.method4236(var150.field2789);
                            if (var144 == 4 || var144 == 5) {
                                var150.field2796 = new class77(var151, 4, var145, Statics.field4488, var141, var142, var147, false, var150.field2796);
                            } else if (var144 == 6) {
                                var150.field2796 = new class77(var151, 4, var145 + 4, Statics.field4488, var141, var142, var147, false, var150.field2796);
                            } else if (var144 == 7) {
                                var150.field2796 = new class77(var151, 4, (var145 + 2 & 0x3) + 4, Statics.field4488, var141, var142, var147, false, var150.field2796);
                            } else if (var144 == 8) {
                                var150.field2796 = new class77(var151, 4, var145 + 4, Statics.field4488, var141, var142, var147, false, var150.field2796);
                                var150.field2797 = new class77(var151, 4, (var145 + 2 & 0x3) + 4, Statics.field4488, var141, var142, var147, false, var150.field2797);
                            }
                        }
                    } else if (var146 == 2) {
                        class232 var152 = Statics.field286.method4067(Statics.field4488, var141, var142);
                        if (var144 == 11) {
                            var144 = 10;
                        }
                        if (var152 != null) {
                            var152.field2804 = new class77(class225.method4236(var152.field2814), var144, var145, Statics.field4488, var141, var142, var147, false, var152.field2804);
                        }
                    } else if (var146 == 3) {
                        class209 var153 = Statics.field286.method4142(Statics.field4488, var141, var142);
                        if (var153 != null) {
                            var153.field2427 = new class77(class225.method4236(var153.field2428), 22, var145, Statics.field4488, var141, var142, var147, false, var153.field2427);
                        }
                    }
                }
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3261 == arg0.field1427) {
                class104.method279(var3, arg0.field1430);
                method4796();
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3228 == arg0.field1427) {
                Statics.field2315 = true;
                class104.method279(var3, arg0.field1430);
                method4796();
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3248 == arg0.field1427) {
                int var154 = var3.method8002();
                int var155 = var3.method7944();
                int var156 = var3.method7794();
                class84 var157 = (class84) field682.method7535((long) var154);
                if (var157 != null) {
                    method72(var157, var157.field1072 != var156);
                }
                method39(var154, var156, var155);
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3289 == arg0.field1427) {
                int var158 = var3.method7827();
                int var159 = var3.method7794();
                int var160 = var3.method7794();
                class306 var161 = Statics.method3181(var158);
                var161.field3599 = (var159 << 16) + var160;
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3282 == arg0.field1427) {
                return this.method1328(arg0);
            }
            if (class279.field3293 == arg0.field1427) {
                method306(class277.field3170);
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3215 == arg0.field1427) {
                return this.method1332(arg0, 1);
            }
            if (class279.field3218 == arg0.field1427) {
                int var162 = var3.method7827();
                int var163 = var3.method7946();
                class84 var164 = (class84) field682.method7535((long) var162);
                class84 var165 = (class84) field682.method7535((long) var163);
                if (var165 != null) {
                    method72(var165, var164 == null || var164.field1072 != var165.field1072);
                }
                if (var164 != null) {
                    var164.method7230();
                    field682.method7528(var164, (long) var163);
                }
                class306 var166 = Statics.method3181(var162);
                if (var166 != null) {
                    method1922(var166);
                }
                class306 var167 = Statics.method3181(var163);
                if (var167 != null) {
                    method1922(var167);
                    method3169(Statics.field914[var167.field3635 >>> 16], var167, true);
                }
                if (field681 != -1) {
                    method5970(field681, 1);
                }
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3298 == arg0.field1427) {
                int var168 = var3.method8002();
                int var169 = var3.method7794();
                class306 var170 = Statics.method3181(var168);
                if (var170.field3586 != 6 || var170.field3605 != var169) {
                    var170.field3586 = 6;
                    var170.field3605 = var169;
                    method1922(var170);
                }
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3186 == arg0.field1427) {
                int var171 = var3.method7806();
                boolean var172 = var3.method7792() == 1;
                String var173 = "";
                boolean var174 = false;
                if (var172) {
                    var173 = var3.method7801();
                    if (Statics.field4582.method1701(new class490(var173, Statics.field986))) {
                        var174 = true;
                    }
                }
                String var175 = var3.method7801();
                if (!var174) {
                    class107.method3247(var171, var173, var175);
                }
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3295 == arg0.field1427) {
                byte[] var176 = new byte[arg0.field1430];
                var3.method7734(var176, 0, var176.length);
                class467 var177 = new class467(var176);
                String var178 = var177.method7801();
                class33.method6066(var178, true, false);
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3239 == arg0.field1427) {
                method2206();
                arg0.field1427 = null;
                return false;
            }
            if (class279.field3276 == arg0.field1427) {
                int var179 = var3.method7827();
                int var180 = var3.method7833();
                class306 var181 = Statics.method3181(var179);
                if (var181.field3586 != 1 || var181.field3605 != var180) {
                    var181.field3586 = 1;
                    var181.field3605 = var180;
                    method1922(var181);
                }
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3264 == arg0.field1427) {
                int var182 = var3.method7795();
                int var183 = var3.method7846();
                class306 var184 = Statics.method3181(var183);
                if (var184.field3625 != var182 || var182 == -1) {
                    var184.field3625 = var182;
                    var184.field3682 = 0;
                    var184.field3683 = 0;
                    method1922(var184);
                }
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3204 == arg0.field1427) {
                Statics.field2122 = true;
                method5761(false, var3);
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3195 == arg0.field1427) {
                method306(class277.field3167);
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3227 == arg0.field1427) {
                method306(class277.field3168);
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3237 == arg0.field1427) {
                Statics.field1561 = var3.method7823();
                Statics.field1919 = var3.method7941();
                for (int var185 = Statics.field1919; var185 < Statics.field1919 + 8; var185++) {
                    for (int var186 = Statics.field1561; var186 < Statics.field1561 + 8; var186++) {
                        if (field648[Statics.field4488][var185][var186] != null) {
                            field648[Statics.field4488][var185][var186] = null;
                            method6283(var185, var186);
                        }
                    }
                }
                for (class91 var187 = (class91) field738.method6086(); var187 != null; var187 = (class91) field738.method6088()) {
                    if (var187.field1161 >= Statics.field1919 && var187.field1161 < Statics.field1919 + 8 && var187.field1173 >= Statics.field1561 && var187.field1173 < Statics.field1561 + 8 && Statics.field4488 == var187.field1165) {
                        var187.field1174 = 0;
                    }
                }
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3269 == arg0.field1427) {
                Statics.field1287 = new class415(Statics.field205);
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3274 == arg0.field1427) {
                int var188 = var3.method7941();
                int var189 = var3.method7833();
                int var190 = var3.method7772();
                if (var190 == 65535) {
                    var190 = -1;
                }
                class97 var191 = field753[var189];
                if (var191 != null) {
                    if (var191.field1220 == var190 && var190 != -1) {
                        int var192 = class199.method4223(var190).field2277;
                        if (var192 == 1) {
                            var191.field1211 = 0;
                            var191.field1222 = 0;
                            var191.field1223 = var188;
                            var191.field1224 = 0;
                        } else if (var192 == 2) {
                            var191.field1224 = 0;
                        }
                    } else if (var190 == -1 || var191.field1220 == -1 || class199.method4223(var190).field2301 >= class199.method4223(var191.field1220).field2301) {
                        var191.field1220 = var190;
                        var191.field1211 = 0;
                        var191.field1222 = 0;
                        var191.field1223 = var188;
                        var191.field1224 = 0;
                        var191.field1253 = var191.field1178;
                    }
                }
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3198 == arg0.field1427) {
                String var193 = var3.method7801();
                long var194 = var3.method7958();
                long var196 = (long) var3.method7794();
                long var198 = (long) var3.method7796();
                class328 var200 = (class328) class347.method1688(class328.method3002(), var3.method7792());
                long var201 = (var196 << 32) + var198;
                boolean var203 = false;
                for (int var204 = 0; var204 < 100; var204++) {
                    if (field524[var204] == var201) {
                        var203 = true;
                        break;
                    }
                }
                if (var200.field4166 && Statics.field4582.method1701(new class490(var193, Statics.field986))) {
                    var203 = true;
                }
                if (!var203 && field692 == 0) {
                    field524[field747] = var201;
                    field747 = (field747 + 1) % 100;
                    String var205 = class372.method6553(class361.method3430(class309.method3009(var3)));
                    if (var200.field4164 == -1) {
                        class107.method6720(9, var193, var205, class363.method6065(var194));
                    } else {
                        class107.method6720(9, class98.method7661(var200.field4164) + var193, var205, class363.method6065(var194));
                    }
                }
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3212 == arg0.field1427) {
                Statics.field4582.method1703(var3, arg0.field1430);
                field716 = field706;
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3292 == arg0.field1427) {
                boolean var206 = var3.method7792() == 1;
                if (var206) {
                    Statics.field2825 = Statics.method1118() - var3.method7958();
                    Statics.field1057 = new class335(var3, true);
                } else {
                    Statics.field1057 = null;
                }
                field721 = field706;
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3225 == arg0.field1427) {
                method306(class277.field3160);
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3253 == arg0.field1427) {
                field584 = var3.method7792();
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3287 == arg0.field1427) {
                int var207 = var3.method7846();
                int var208 = var3.method7833();
                if (var208 == 65535) {
                    var208 = -1;
                }
                int var209 = var3.method7846();
                int var210 = var3.method7833();
                if (var210 == 65535) {
                    var210 = -1;
                }
                for (int var211 = var208; var211 <= var210; var211++) {
                    long var212 = ((long) var207 << 32) + (long) var211;
                    class433 var214 = field559.method7535(var212);
                    if (var214 != null) {
                        var214.method7230();
                    }
                    field559.method7528(new class432(var209), var212);
                }
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3189 == arg0.field1427) {
                int var215 = var3.method7833();
                int var216 = var3.method8002();
                class296.field3444[var215] = var216;
                if (class296.field3445[var215] != var216) {
                    class296.field3445[var215] = var216;
                }
                method2154(var215);
                field707[++field708 - 1 & 0x1F] = var215;
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3286 == arg0.field1427) {
                boolean var217 = var3.method7799();
                if (!var217) {
                    Statics.field242 = null;
                } else if (Statics.field242 == null) {
                    Statics.field242 = new class344();
                }
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3202 == arg0.field1427) {
                int var218 = var3.method7772();
                int var219 = var3.method7871();
                int var220 = var219 >> 16;
                int var221 = var219 >> 8 & 0xFF;
                int var222 = (var219 >> 4 & 0x7) + var220;
                int var223 = (var219 & 0x7) + var221;
                int var224 = var3.method7944();
                int var225 = var3.method7834();
                if (var222 >= 0 && var223 >= 0 && var222 < 104 && var223 < 104) {
                    int var226 = var222 * 128 + 64;
                    int var227 = var223 * 128 + 64;
                    class69 var228 = new class69(var218, Statics.field4488, var226, var227, method3401(var226, var227, Statics.field4488) - var224, var225, field519);
                    field640.method6081(var228);
                }
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3208 == arg0.field1427) {
                int var229 = var3.method7792();
                method4929(var229);
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3251 == arg0.field1427) {
                int var230 = var3.method7946();
                int var231 = var3.method7946();
                int var232 = class36.method4940();
                class278 var233 = class278.method2890(class276.field3052, field567.field1425);
                var233.field3177.method7843(var230);
                var233.field3177.method7841(var231);
                var233.field3177.method7789(field217);
                var233.field3177.method7789(var232);
                field567.method2603(var233);
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3235 == arg0.field1427) {
                for (int var234 = 0; var234 < class296.field3445.length; var234++) {
                    if (class296.field3445[var234] != class296.field3444[var234]) {
                        class296.field3445[var234] = class296.field3444[var234];
                        method2154(var234);
                        field707[++field708 - 1 & 0x1F] = var234;
                    }
                }
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3246 == arg0.field1427) {
                class38.method3175(var3, arg0.field1430);
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3214 == arg0.field1427) {
                method306(class277.field3171);
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3205 == arg0.field1427) {
                String var235 = var3.method7801();
                String var236 = class372.method6553(class361.method3430(class309.method3009(var3)));
                class107.method3247(6, var235, var236);
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3199 == arg0.field1427) {
                int var237 = var3.method7946();
                class84 var238 = (class84) field682.method7535((long) var237);
                if (var238 != null) {
                    method72(var238, true);
                }
                if (field687 != null) {
                    method1922(field687);
                    field687 = null;
                }
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3277 == arg0.field1427) {
                method2607(var3.method7801());
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3200 == arg0.field1427) {
                String var239 = var3.method7801();
                int var240 = var3.method8002();
                class306 var241 = Statics.method3181(var240);
                if (!var239.equals(var241.field3604)) {
                    var241.field3604 = var239;
                    method1922(var241);
                }
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3255 == arg0.field1427) {
                int var242 = var3.method7794();
                int var243 = var3.method8002();
                class306 var244 = Statics.method3181(var243);
                if (var244.field3586 != 2 || var244.field3605 != var242) {
                    var244.field3586 = 2;
                    var244.field3605 = var242;
                    method1922(var244);
                }
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3266 == arg0.field1427) {
                int var245 = var3.method7794();
                int var246 = var3.method7792();
                int var247 = var3.method7794();
                Statics.method12(var245, var246, var247);
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3257 == arg0.field1427) {
                int var248 = var3.method7946();
                int var249 = var3.method7794();
                if (var248 < -70000) {
                    var249 += 32768;
                }
                class306 var250;
                if (var248 >= 0) {
                    var250 = Statics.method3181(var248);
                } else {
                    var250 = null;
                }
                if (var250 != null) {
                    for (int var251 = 0; var251 < var250.field3535.length; var251++) {
                        var250.field3535[var251] = 0;
                        var250.field3581[var251] = 0;
                    }
                }
                class82.method2020(var249);
                int var252 = var3.method7794();
                for (int var253 = 0; var253 < var252; var253++) {
                    int var254 = var3.method7823();
                    if (var254 == 255) {
                        var254 = var3.method7846();
                    }
                    int var255 = var3.method7772();
                    if (var250 != null && var253 < var250.field3535.length) {
                        var250.field3535[var253] = var255;
                        var250.field3581[var253] = var254;
                    }
                    class82.method147(var249, var253, var255 - 1, var254);
                }
                if (var250 != null) {
                    method1922(var250);
                }
                method2889();
                field709[++field710 - 1 & 0x1F] = var249 & 0x7FFF;
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3258 == arg0.field1427) {
                method5761(true, var3);
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3211 == arg0.field1427) {
                var3.field4915 += 28;
                if (var3.method7819()) {
                    method2480(var3, var3.field4915 - 28);
                }
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3223 == arg0.field1427) {
                method306(class277.field3162);
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3300 == arg0.field1427) {
                int var256 = var3.method7772();
                if (var256 == 65535) {
                    var256 = -1;
                }
                int var257 = var3.method8002();
                int var258 = var3.method7846();
                class306 var259 = Statics.method3181(var257);
                if (var259.field3541) {
                    var259.field3547 = var256;
                    var259.field3681 = var258;
                    class197 var261 = class197.method3345(var256);
                    var259.field3610 = var261.field2221;
                    var259.field3597 = var261.field2222;
                    var259.field3596 = var261.field2229;
                    var259.field3592 = var261.field2224;
                    var259.field3687 = var261.field2209;
                    var259.field3525 = var261.field2220;
                    if (var261.field2226 == 1) {
                        var259.field3602 = 1;
                    } else {
                        var259.field3602 = 2;
                    }
                    if (var259.field3660 > 0) {
                        var259.field3525 = var259.field3525 * 32 / var259.field3660;
                    } else if (var259.field3553 > 0) {
                        var259.field3525 = var259.field3525 * 32 / var259.field3553;
                    }
                    method1922(var259);
                } else if (var256 == -1) {
                    var259.field3586 = 0;
                    arg0.field1427 = null;
                    return true;
                } else {
                    class197 var260 = class197.method3345(var256);
                    var259.field3586 = 4;
                    var259.field3605 = var256;
                    var259.field3610 = var260.field2221;
                    var259.field3597 = var260.field2222;
                    var259.field3525 = var260.field2220 * 100 / var258;
                    method1922(var259);
                }
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3294 == arg0.field1427) {
                method306(class277.field3164);
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3288 == arg0.field1427) {
                Statics.field1561 = var3.method7941();
                Statics.field1919 = var3.method7941();
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3272 == arg0.field1427) {
                int var262 = var3.method8002();
                int var263 = var3.method7833();
                int var264 = var3.method7833();
                int var265 = var3.method7833();
                class306 var266 = Statics.method3181(var262);
                if (var266.field3610 != var263 || var266.field3597 != var265 || var266.field3525 != var264) {
                    var266.field3610 = var263;
                    var266.field3597 = var265;
                    var266.field3525 = var264;
                    method1922(var266);
                }
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3270 == arg0.field1427) {
                int var267 = arg0.field1430 + var3.field4915;
                int var268 = var3.method7794();
                int var269 = var3.method7794();
                if (field681 != var268) {
                    field681 = var268;
                    this.method1627(false);
                    method1921(field681);
                    class68.method446(field681);
                    for (int var270 = 0; var270 < 100; var270++) {
                        field732[var270] = true;
                    }
                }
                while (var269-- > 0) {
                    int var271 = var3.method7946();
                    int var272 = var3.method7794();
                    int var273 = var3.method7792();
                    class84 var274 = (class84) field682.method7535((long) var271);
                    if (var274 != null && var274.field1072 != var272) {
                        method72(var274, true);
                        var274 = null;
                    }
                    if (var274 == null) {
                        var274 = method39(var271, var272, var273);
                    }
                    var274.field1068 = true;
                }
                for (class84 var275 = (class84) field682.method7530(); var275 != null; var275 = (class84) field682.method7531()) {
                    if (var275.field1068) {
                        var275.field1068 = false;
                    } else {
                        method72(var275, true);
                    }
                }
                field559 = new class444(512);
                while (var3.field4915 < var267) {
                    int var276 = var3.method7946();
                    int var277 = var3.method7794();
                    int var278 = var3.method7794();
                    int var279 = var3.method7946();
                    for (int var280 = var277; var280 <= var278; var280++) {
                        long var281 = ((long) var276 << 32) + (long) var280;
                        field559.method7528(new class432(var279), var281);
                    }
                }
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3203 == arg0.field1427) {
                int var283 = var3.method8002();
                int var284 = var3.method7794();
                class97 var285 = field753[var284];
                int var286 = var3.method7794();
                if (var285 != null) {
                    var285.field1225 = var286;
                    var285.field1247 = var283 >> 16;
                    var285.field1228 = (var283 & 0xFFFF) + field519;
                    var285.field1226 = 0;
                    var285.field1215 = 0;
                    if (var285.field1228 > field519) {
                        var285.field1226 = -1;
                    }
                    if (var285.field1225 == 65535) {
                        var285.field1225 = -1;
                    }
                }
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3236 == arg0.field1427) {
                method306(class277.field3166);
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3220 == arg0.field1427) {
                if (field681 != -1) {
                    method5970(field681, 0);
                }
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3197 == arg0.field1427) {
                field772 = true;
                field773 = false;
                Statics.field1443 = var3.method7792();
                Statics.field1719 = var3.method7792();
                Statics.field1399 = var3.method7794();
                Statics.field4648 = var3.method7792();
                Statics.field1284 = var3.method7792();
                if (Statics.field1284 >= 100) {
                    int var287 = Statics.field1443 * 128 + 64;
                    int var288 = Statics.field1719 * 128 + 64;
                    int var289 = method3401(var287, var288, Statics.field4488) - Statics.field1399;
                    int var290 = var287 - Statics.field1710;
                    int var291 = var289 - Statics.field4643;
                    int var292 = var288 - Statics.field1798;
                    int var293 = (int) Math.sqrt((double) (var290 * var290 + var292 * var292));
                    Statics.field1332 = (int) (Math.atan2((double) var291, (double) var293) * 325.9490051269531D) & 0x7FF;
                    Statics.field1599 = (int) (Math.atan2((double) var290, (double) var292) * -325.9490051269531D) & 0x7FF;
                    if (Statics.field1332 < 128) {
                        Statics.field1332 = 128;
                    }
                    if (Statics.field1332 > 383) {
                        Statics.field1332 = 383;
                    }
                }
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3267 == arg0.field1427) {
                byte var294 = var3.method7793();
                long var295 = (long) var3.method7794();
                long var297 = (long) var3.method7796();
                long var299 = (var295 << 32) + var297;
                boolean var301 = false;
                class157 var302 = var294 >= 0 ? field633[var294] : Statics.field1959;
                if (var302 == null) {
                    var301 = true;
                } else {
                    for (int var303 = 0; var303 < 100; var303++) {
                        if (field524[var303] == var299) {
                            var301 = true;
                            break;
                        }
                    }
                }
                if (!var301) {
                    field524[field747] = var299;
                    field747 = (field747 + 1) % 100;
                    String var304 = class309.method3009(var3);
                    int var305 = var294 >= 0 ? 43 : 46;
                    class107.method6720(var305, "", var304, var302.field1796);
                }
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3242 == arg0.field1427) {
                method2889();
                field630 = var3.method7792();
                field630 *= 100;
                field722 = field706;
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3192 == arg0.field1427) {
                int var306 = var3.method7846();
                boolean var307 = var3.method7792() == 1;
                class306 var308 = Statics.method3181(var306);
                if (var308.field3595 != var307) {
                    var308.field3595 = var307;
                    method1922(var308);
                }
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3271 == arg0.field1427) {
                Statics.field2122 = true;
                method5761(true, var3);
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3232 == arg0.field1427) {
                int var309 = var3.method7846();
                class306 var310 = Statics.method3181(var309);
                var310.field3586 = 3;
                var310.field3605 = Statics.field1790.field1123.method5271();
                method1922(var310);
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3243 == arg0.field1427) {
                method2889();
                field689 = var3.method7795();
                field722 = field706;
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3190 == arg0.field1427) {
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3252 == arg0.field1427) {
                return this.method1332(arg0, 2);
            }
            if (class279.field3185 == arg0.field1427) {
                int var311 = var3.method7946();
                if (field790 != var311) {
                    field790 = var311;
                    method3776();
                }
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3219 == arg0.field1427) {
                String var312 = var3.method7801();
                Object[] var313 = new Object[var312.length() + 1];
                for (int var314 = var312.length() - 1; var314 >= 0; var314--) {
                    if (var312.charAt(var314) == 's') {
                        var313[var314 + 1] = var3.method7801();
                    } else {
                        var313[var314 + 1] = Integer.valueOf(var3.method7946());
                    }
                }
                var313[0] = Integer.valueOf(var3.method7946());
                class85 var315 = new class85();
                var315.field1079 = var313;
                class68.method3219(var315);
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3259 == arg0.field1427) {
                int var316 = var3.method7946();
                int var317 = var3.method7833();
                class306 var318 = Statics.method3181(var316);
                if (var318 != null && var318.field3679 == 0) {
                    if (var317 > var318.field3566 - var318.field3617) {
                        var317 = var318.field3566 - var318.field3617;
                    }
                    if (var317 < 0) {
                        var317 = 0;
                    }
                    if (var318.field3564 != var317) {
                        var318.field3564 = var317;
                        method1922(var318);
                    }
                }
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3263 == arg0.field1427) {
                int var319 = var3.method7834();
                class82.method2025(var319);
                field709[++field710 - 1 & 0x1F] = var319 & 0x7FFF;
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3254 == arg0.field1427) {
                int var320 = var3.method7792();
                int var321 = var3.method7792();
                int var322 = var3.method7792();
                int var323 = var3.method7792();
                field774[var320] = true;
                field804[var320] = var321;
                field776[var320] = var322;
                field777[var320] = var323;
                field618[var320] = 0;
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3275 == arg0.field1427) {
                field761 = var3.method7792();
                if (field761 == 255) {
                    field761 = 0;
                }
                field507 = var3.method7792();
                if (field507 == 255) {
                    field507 = 0;
                }
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3241 == arg0.field1427) {
                int var324 = var3.method7946();
                class306 var325 = Statics.method3181(var324);
                for (int var326 = 0; var326 < var325.field3535.length; var326++) {
                    var325.field3535[var326] = -1;
                    var325.field3535[var326] = 0;
                }
                method1922(var325);
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3262 == arg0.field1427) {
                int var327 = var3.method7792();
                method5270(var327);
                arg0.field1427 = null;
                return false;
            }
            if (class279.field3217 == arg0.field1427) {
                field743 = var3.method7792();
                field744 = var3.method7941();
                arg0.field1427 = null;
                return true;
            }
            if (class279.field3187 == arg0.field1427) {
                method306(class277.field3159);
                arg0.field1427 = null;
                return true;
            }
            class493.method2879("" + (arg0.field1427 == null ? -1 : arg0.field1427.field3299) + class98.field1325 + (arg0.field1433 == null ? -1 : arg0.field1433.field3299) + class98.field1325 + (arg0.field1434 == null ? -1 : arg0.field1434.field3299) + class98.field1325 + arg0.field1430, (Throwable) null);
            method2206();
        } catch (IOException var332) {
            method4229();
        } catch (Exception var333) {
            String var330 = "" + (arg0.field1427 == null ? -1 : arg0.field1427.field3299) + class98.field1325 + (arg0.field1433 == null ? -1 : arg0.field1433.field3299) + class98.field1325 + (arg0.field1434 == null ? -1 : arg0.field1434.field3299) + class98.field1325 + arg0.field1430 + class98.field1325 + (Statics.field1780 + Statics.field1790.field1204[0]) + class98.field1325 + (Statics.field4368 + Statics.field1790.field1252[0]) + class98.field1325;
            for (int var331 = 0; var331 < arg0.field1430 && var331 < 50; var331++) {
                var330 = var330 + var3.field4917[var331] + class98.field1325;
            }
            class493.method2879(var330, var333);
            method2206();
        }
        return true;
    }

    @ObfuscatedName("y.ih(Ljn;I)V")
    public static final void method306(class277 arg0) {
        class466 var1 = field567.field1426;
        if (class277.field3166 == arg0) {
            int var2 = var1.method7792();
            int var3 = var1.method7833();
            int var4 = var1.method7946();
            int var5 = var1.method7823();
            int var6 = (var5 >> 4 & 0x7) + Statics.field1919;
            int var7 = (var5 & 0x7) + Statics.field1561;
            if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
                class101 var8 = new class101();
                var8.field1360 = var3;
                var8.field1352 = var4;
                var8.method2475(var2);
                if (field648[Statics.field4488][var6][var7] == null) {
                    field648[Statics.field4488][var6][var7] = new class352();
                }
                field648[Statics.field4488][var6][var7].method6081(var8);
                method6283(var6, var7);
            }
        } else if (class277.field3160 == arg0) {
            int var9 = var1.method7833();
            int var10 = var1.method7792();
            int var11 = var1.method7944();
            int var12 = (var11 >> 4 & 0x7) + Statics.field1919;
            int var13 = (var11 & 0x7) + Statics.field1561;
            int var14 = var1.method7833();
            if (var12 >= 0 && var13 >= 0 && var12 < 104 && var13 < 104) {
                int var15 = var12 * 128 + 64;
                int var16 = var13 * 128 + 64;
                class69 var17 = new class69(var14, Statics.field4488, var15, var16, method3401(var15, var16, Statics.field4488) - var10, var9, field519);
                field640.method6081(var17);
            }
        } else if (class277.field3164 == arg0) {
            int var18 = var1.method7792();
            int var19 = (var18 >> 4 & 0x7) + Statics.field1919;
            int var20 = (var18 & 0x7) + Statics.field1561;
            var1.method7834();
            int var21 = var1.method7941();
            var1.method7772();
            int var22 = var1.method7946();
            var1.method7944();
            var1.method7944();
            int var23 = var1.method7794();
            if (var19 >= 0 && var20 >= 0 && var19 < 104 && var20 < 104) {
                class101 var24 = new class101();
                var24.field1360 = var23;
                var24.field1352 = var22;
                var24.method2475(var21);
                if (field648[Statics.field4488][var19][var20] == null) {
                    field648[Statics.field4488][var19][var20] = new class352();
                }
                field648[Statics.field4488][var19][var20].method6081(var24);
                method6283(var19, var20);
            }
        } else if (class277.field3172 == arg0) {
            int var25 = var1.method7941() * 4;
            int var26 = var1.method7792();
            int var27 = (var26 >> 4 & 0x7) + Statics.field1919;
            int var28 = (var26 & 0x7) + Statics.field1561;
            int var29 = var1.method7833();
            int var30 = var1.method7833();
            int var31 = var1.method7823() * 4;
            int var32 = var1.method7941();
            int var33 = var1.method7792();
            int var34 = var1.method7795();
            int var35 = var1.method7833();
            byte var36 = var1.method7943();
            byte var37 = var1.method7793();
            int var38 = var27 + var36;
            int var39 = var28 + var37;
            if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104 && var38 >= 0 && var39 >= 0 && var38 < 104 && var39 < 104 && var35 != 65535) {
                int var40 = var27 * 128 + 64;
                int var41 = var28 * 128 + 64;
                int var42 = var38 * 128 + 64;
                int var43 = var39 * 128 + 64;
                class74 var44 = new class74(var35, Statics.field4488, var40, var41, method3401(var40, var41, Statics.field4488) - var31, field519 + var29, field519 + var30, var33, var32, var34, var25);
                var44.method1990(var42, var43, method3401(var42, var43, Statics.field4488) - var25, field519 + var29);
                field650.method6081(var44);
            }
        } else if (class277.field3158 == arg0) {
            int var45 = var1.method7944();
            int var46 = var45 >> 2;
            int var47 = var45 & 0x3;
            int var48 = field580[var46];
            int var49 = var1.method7944();
            int var50 = (var49 >> 4 & 0x7) + Statics.field1919;
            int var51 = (var49 & 0x7) + Statics.field1561;
            int var52 = var1.method7944();
            int var53 = var1.method7772();
            if (var50 >= 0 && var51 >= 0 && var50 < 104 && var51 < 104) {
                method96(Statics.field4488, var50, var51, var48, var53, var46, var47, var52, 0, -1);
            }
        } else if (class277.field3170 == arg0) {
            int var54 = var1.method7823();
            int var55 = (var54 >> 4 & 0x7) + Statics.field1919;
            int var56 = (var54 & 0x7) + Statics.field1561;
            int var57 = var1.method7794();
            int var58 = var1.method7827();
            if (var55 >= 0 && var56 >= 0 && var55 < 104 && var56 < 104) {
                class352 var59 = field648[Statics.field4488][var55][var56];
                if (var59 != null) {
                    for (class101 var60 = (class101) var59.method6086(); var60 != null; var60 = (class101) var59.method6088()) {
                        if ((var57 & 0x7FFF) == var60.field1360 && var60.field1352 == var58) {
                            var60.method7230();
                            break;
                        }
                    }
                    if (var59.method6086() == null) {
                        field648[Statics.field4488][var55][var56] = null;
                    }
                    method6283(var55, var56);
                }
            }
        } else if (class277.field3167 == arg0) {
            int var61 = var1.method7823();
            int var62 = var61 >> 2;
            int var63 = var61 & 0x3;
            int var64 = field580[var62];
            int var65 = var1.method7823();
            int var66 = (var65 >> 4 & 0x7) + Statics.field1919;
            int var67 = (var65 & 0x7) + Statics.field1561;
            if (var66 >= 0 && var67 >= 0 && var66 < 104 && var67 < 104) {
                method96(Statics.field4488, var66, var67, var64, -1, var62, var63, 31, 0, -1);
            }
        } else {
            if (class277.field3159 == arg0) {
                int var68 = var1.method7792();
                int var69 = var1.method7834();
                int var70 = var1.method7944();
                int var71 = (var70 >> 4 & 0x7) + Statics.field1919;
                int var72 = (var70 & 0x7) + Statics.field1561;
                int var73 = var1.method7823();
                int var74 = var73 >> 4 & 0xF;
                int var75 = var73 & 0x7;
                if (var71 >= 0 && var72 >= 0 && var71 < 104 && var72 < 104) {
                    int var76 = var74 + 1;
                    if (Statics.field1790.field1204[0] >= var71 - var76 && Statics.field1790.field1204[0] <= var71 + var76 && Statics.field1790.field1252[0] >= var72 - var76 && Statics.field1790.field1252[0] <= var72 + var76 && Statics.field2126.method2379() != 0 && var75 > 0 && field766 < 50) {
                        field767[field766] = var69;
                        field768[field766] = var75;
                        field796[field766] = var68;
                        field576[field766] = null;
                        field622[field766] = (var71 << 16) + (var72 << 8) + var74;
                        field766++;
                    }
                }
            }
            if (class277.field3165 == arg0) {
                int var77 = var1.method7944();
                int var78 = var1.method7772();
                int var79 = var1.method7833();
                int var80 = var1.method7792() * 4;
                int var81 = var1.method7944();
                int var82 = (var81 >> 4 & 0x7) + Statics.field1919;
                int var83 = (var81 & 0x7) + Statics.field1561;
                int var84 = var1.method7792() * 4;
                int var85 = var1.method7772();
                int var86 = var1.method7944();
                byte var87 = var1.method7943();
                byte var88 = var1.method7960();
                int var89 = var1.method7791();
                int var90 = var82 + var88;
                int var91 = var83 + var87;
                if (var82 >= 0 && var83 >= 0 && var82 < 104 && var83 < 104 && var90 >= 0 && var91 >= 0 && var90 < 104 && var91 < 104 && var79 != 65535) {
                    int var92 = var82 * 128 + 64;
                    int var93 = var83 * 128 + 64;
                    int var94 = var90 * 128 + 64;
                    int var95 = var91 * 128 + 64;
                    class74 var96 = new class74(var79, Statics.field4488, var92, var93, method3401(var92, var93, Statics.field4488) - var80, field519 + var85, field519 + var78, var77, var86, var89, var84);
                    var96.method1990(var94, var95, method3401(var94, var95, Statics.field4488) - var84, field519 + var85);
                    field650.method6081(var96);
                }
            } else if (class277.field3169 == arg0) {
                int var97 = var1.method7833();
                int var98 = var1.method7834();
                int var99 = var1.method7941();
                int var100 = (var99 >> 4 & 0x7) + Statics.field1919;
                int var101 = (var99 & 0x7) + Statics.field1561;
                int var102 = var1.method7772();
                if (var100 >= 0 && var101 >= 0 && var100 < 104 && var101 < 104) {
                    class352 var103 = field648[Statics.field4488][var100][var101];
                    if (var103 != null) {
                        for (class101 var104 = (class101) var103.method6086(); var104 != null; var104 = (class101) var103.method6088()) {
                            if ((var102 & 0x7FFF) == var104.field1360 && var104.field1352 == var98) {
                                var104.field1352 = var97;
                                break;
                            }
                        }
                        method6283(var100, var101);
                    }
                }
            } else {
                if (class277.field3168 == arg0) {
                    int var105 = var1.method7823();
                    int var106 = var105 >> 2;
                    int var107 = var105 & 0x3;
                    int var108 = field580[var106];
                    int var109 = var1.method7772();
                    int var110 = var1.method7833();
                    int var111 = var1.method7823();
                    int var112 = (var111 >> 4 & 0x7) + Statics.field1919;
                    int var113 = (var111 & 0x7) + Statics.field1561;
                    byte var114 = var1.method7943();
                    int var115 = var1.method7772();
                    byte var116 = var1.method7943();
                    byte var117 = var1.method7793();
                    byte var118 = var1.method7960();
                    int var119 = var1.method7833();
                    class89 var120;
                    if (field636 == var119) {
                        var120 = Statics.field1790;
                    } else {
                        var120 = field635[var119];
                    }
                    if (var120 != null) {
                        class196 var121 = class196.method3208(var110);
                        int var122;
                        int var123;
                        if (var107 == 1 || var107 == 3) {
                            var122 = var121.field2169;
                            var123 = var121.field2168;
                        } else {
                            var122 = var121.field2168;
                            var123 = var121.field2169;
                        }
                        int var124 = (var122 >> 1) + var112;
                        int var125 = (var122 + 1 >> 1) + var112;
                        int var126 = (var123 >> 1) + var113;
                        int var127 = (var123 + 1 >> 1) + var113;
                        int[][] var128 = class79.field1027[Statics.field4488];
                        int var129 = var128[var124][var126] + var128[var125][var126] + var128[var124][var127] + var128[var125][var127] >> 2;
                        int var130 = (var112 << 7) + (var122 << 6);
                        int var131 = (var113 << 7) + (var123 << 6);
                        class224 var132 = var121.method3521(var106, var107, var128, var130, var129, var131);
                        if (var132 != null) {
                            method96(Statics.field4488, var112, var113, var108, -1, 0, 0, 31, var109 + 1, var115 + 1);
                            var120.field1147 = field519 + var109;
                            var120.field1131 = field519 + var115;
                            var120.field1135 = var132;
                            var120.field1132 = var112 * 128 + var122 * 64;
                            var120.field1138 = var113 * 128 + var123 * 64;
                            var120.field1122 = var129;
                            if (var117 > var114) {
                                byte var133 = var117;
                                var117 = var114;
                                var114 = var133;
                            }
                            if (var118 > var116) {
                                byte var134 = var118;
                                var118 = var116;
                                var116 = var134;
                            }
                            var120.field1149 = var112 + var117;
                            var120.field1133 = var112 + var114;
                            var120.field1137 = var113 + var118;
                            var120.field1129 = var113 + var116;
                        }
                    }
                }
                if (class277.field3171 == arg0) {
                    int var135 = var1.method7944();
                    int var136 = (var135 >> 4 & 0x7) + Statics.field1919;
                    int var137 = (var135 & 0x7) + Statics.field1561;
                    int var138 = var1.method7834();
                    int var139 = var1.method7823();
                    int var140 = var139 >> 2;
                    int var141 = var139 & 0x3;
                    int var142 = field580[var140];
                    if (var136 >= 0 && var137 >= 0 && var136 < 103 && var137 < 103) {
                        if (var142 == 0) {
                            class229 var143 = Statics.field286.method4065(Statics.field4488, var136, var137);
                            if (var143 != null) {
                                int var144 = class225.method4236(var143.field2786);
                                if (var140 == 2) {
                                    var143.field2779 = new class77(var144, 2, var141 + 4, Statics.field4488, var136, var137, var138, false, var143.field2779);
                                    var143.field2785 = new class77(var144, 2, var141 + 1 & 0x3, Statics.field4488, var136, var137, var138, false, var143.field2785);
                                } else {
                                    var143.field2779 = new class77(var144, var140, var141, Statics.field4488, var136, var137, var138, false, var143.field2779);
                                }
                            }
                        }
                        if (var142 == 1) {
                            class231 var145 = Statics.field286.method4217(Statics.field4488, var136, var137);
                            if (var145 != null) {
                                int var146 = class225.method4236(var145.field2789);
                                if (var140 == 4 || var140 == 5) {
                                    var145.field2796 = new class77(var146, 4, var141, Statics.field4488, var136, var137, var138, false, var145.field2796);
                                } else if (var140 == 6) {
                                    var145.field2796 = new class77(var146, 4, var141 + 4, Statics.field4488, var136, var137, var138, false, var145.field2796);
                                } else if (var140 == 7) {
                                    var145.field2796 = new class77(var146, 4, (var141 + 2 & 0x3) + 4, Statics.field4488, var136, var137, var138, false, var145.field2796);
                                } else if (var140 == 8) {
                                    var145.field2796 = new class77(var146, 4, var141 + 4, Statics.field4488, var136, var137, var138, false, var145.field2796);
                                    var145.field2797 = new class77(var146, 4, (var141 + 2 & 0x3) + 4, Statics.field4488, var136, var137, var138, false, var145.field2797);
                                }
                            }
                        }
                        if (var142 == 2) {
                            class232 var147 = Statics.field286.method4067(Statics.field4488, var136, var137);
                            if (var140 == 11) {
                                var140 = 10;
                            }
                            if (var147 != null) {
                                var147.field2804 = new class77(class225.method4236(var147.field2814), var140, var141, Statics.field4488, var136, var137, var138, false, var147.field2804);
                            }
                        }
                        if (var142 == 3) {
                            class209 var148 = Statics.field286.method4142(Statics.field4488, var136, var137);
                            if (var148 != null) {
                                var148.field2427 = new class77(class225.method4236(var148.field2428), 22, var141, Statics.field4488, var136, var137, var138, false, var148.field2427);
                            }
                        }
                    }
                } else if (class277.field3161 == arg0) {
                    int var149 = var1.method7833();
                    var1.method7794();
                    int var150 = var1.method7823();
                    int var151 = (var150 >> 4 & 0x7) + Statics.field1919;
                    int var152 = (var150 & 0x7) + Statics.field1561;
                    if (var151 >= 0 && var152 >= 0 && var151 < 104 && var152 < 104) {
                        class352 var153 = field648[Statics.field4488][var151][var152];
                        if (var153 != null) {
                            for (class101 var154 = (class101) var153.method6086(); var154 != null; var154 = (class101) var153.method6088()) {
                                if ((var149 & 0x7FFF) == var154.field1360) {
                                    var154.method7230();
                                    break;
                                }
                            }
                            if (var153.method6086() == null) {
                                field648[Statics.field4488][var151][var152] = null;
                            }
                            method6283(var151, var152);
                        }
                    }
                } else if (class277.field3162 == arg0) {
                    int var155 = var1.method7834();
                    int var156 = var1.method7944();
                    int var157 = (var156 >> 4 & 0x7) + Statics.field1919;
                    int var158 = (var156 & 0x7) + Statics.field1561;
                    int var159 = var1.method7941();
                    if (var157 >= 0 && var158 >= 0 && var157 < 104 && var158 < 104) {
                        class352 var160 = field648[Statics.field4488][var157][var158];
                        if (var160 != null) {
                            for (class101 var161 = (class101) var160.method6086(); var161 != null; var161 = (class101) var160.method6088()) {
                                if ((var155 & 0x7FFF) == var161.field1360) {
                                    var161.method2475(var159);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("g.jk(IIIIIIIIIII)V")
    public static final void method96(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class91 var10 = null;
        for (class91 var11 = (class91) field738.method6086(); var11 != null; var11 = (class91) field738.method6088()) {
            if (var11.field1165 == arg0 && var11.field1161 == arg1 && var11.field1173 == arg2 && var11.field1172 == arg3) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class91();
            var10.field1165 = arg0;
            var10.field1172 = arg3;
            var10.field1161 = arg1;
            var10.field1173 = arg2;
            method2666(var10);
            field738.method6081(var10);
        }
        var10.field1168 = arg4;
        var10.field1170 = arg5;
        var10.field1169 = arg6;
        var10.field1163 = arg8;
        var10.field1174 = arg9;
        var10.method2213(arg7);
    }

    @ObfuscatedName("gs.je(I)V")
    public static final void method3799() {
        for (class91 var0 = (class91) field738.method6086(); var0 != null; var0 = (class91) field738.method6088()) {
            if (var0.field1174 == -1) {
                var0.field1163 = 0;
                method2666(var0);
            } else {
                var0.method7230();
            }
        }
    }

    @ObfuscatedName("dv.ju(Lcm;B)V")
    public static final void method2666(class91 arg0) {
        long var1 = 0L;
        int var3 = -1;
        int var4 = 0;
        int var5 = 0;
        if (arg0.field1172 == 0) {
            var1 = Statics.field286.method4222(arg0.field1165, arg0.field1161, arg0.field1173);
        }
        if (arg0.field1172 == 1) {
            var1 = Statics.field286.method4167(arg0.field1165, arg0.field1161, arg0.field1173);
        }
        if (arg0.field1172 == 2) {
            var1 = Statics.field286.method4202(arg0.field1165, arg0.field1161, arg0.field1173);
        }
        if (arg0.field1172 == 3) {
            var1 = Statics.field286.method4072(arg0.field1165, arg0.field1161, arg0.field1173);
        }
        if (var1 != 0L) {
            int var6 = Statics.field286.method4166(arg0.field1165, arg0.field1161, arg0.field1173, var1);
            var3 = class225.method4236(var1);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg0.field1164 = var3;
        arg0.field1167 = var4;
        arg0.field1176 = var5;
    }

    @ObfuscatedName("dr.jm(IIIIIIIB)V")
    public static final void method2732(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field562 && Statics.field4488 != arg0) {
            return;
        }
        long var7 = 0L;
        boolean var9 = true;
        boolean var10 = false;
        boolean var11 = false;
        if (arg1 == 0) {
            var7 = Statics.field286.method4222(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field286.method4167(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field286.method4202(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field286.method4072(arg0, arg2, arg3);
        }
        if (var7 != 0L) {
            int var12 = Statics.field286.method4166(arg0, arg2, arg3, var7);
            int var13 = class225.method4236(var7);
            int var14 = var12 & 0x1F;
            int var15 = var12 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field286.method4155(arg0, arg2, arg3);
                class196 var16 = class196.method3208(var13);
                if (var16.field2165 != 0) {
                    field577[arg0].method3766(arg2, arg3, var14, var15, var16.field2178);
                }
            }
            if (arg1 == 1) {
                Statics.field286.method4183(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field286.method4122(arg0, arg2, arg3);
                class196 var17 = class196.method3208(var13);
                if (var17.field2168 + arg2 > 103 || var17.field2168 + arg3 > 103 || var17.field2169 + arg2 > 103 || var17.field2169 + arg3 > 103) {
                    return;
                }
                if (var17.field2165 != 0) {
                    field577[arg0].method3781(arg2, arg3, var17.field2168, var17.field2169, var15, var17.field2178);
                }
            }
            if (arg1 == 3) {
                Statics.field286.method4063(arg0, arg2, arg3);
                class196 var18 = class196.method3208(var13);
                if (var18.field2165 == 1) {
                    field577[arg0].method3793(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var19 = arg0;
        if (arg0 < 3 && (class79.field1035[1][arg2][arg3] & 0x2) == 2) {
            var19 = arg0 + 1;
        }
        class216 var20 = Statics.field286;
        class203 var21 = field577[arg0];
        class196 var22 = class196.method3208(arg4);
        int var23;
        int var24;
        if (arg5 == 1 || arg5 == 3) {
            var23 = var22.field2169;
            var24 = var22.field2168;
        } else {
            var23 = var22.field2168;
            var24 = var22.field2169;
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
        int[][] var29 = class79.field1027[var19];
        int var30 = var29[var25][var27] + var29[var26][var27] + var29[var25][var28] + var29[var26][var28] >> 2;
        int var31 = (arg2 << 7) + (var23 << 6);
        int var32 = (arg3 << 7) + (var24 << 6);
        long var33 = class225.method574(arg2, arg3, 2, var22.field2172 == 0, arg4);
        int var35 = (arg5 << 6) + arg6;
        if (var22.field2193 == 1) {
            var35 += 256;
        }
        if (arg6 == 22) {
            class218 var36;
            if (var22.field2176 == -1 && var22.field2194 == null) {
                var36 = var22.method3521(22, arg5, var29, var31, var30, var32);
            } else {
                var36 = new class77(arg4, 22, arg5, var19, arg2, arg3, var22.field2176, var22.field2185, (class218) null);
            }
            var20.method4049(arg0, arg2, arg3, var30, var36, var33, var35);
            if (var22.field2165 == 1) {
                var21.method3764(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class218 var62;
            if (var22.field2176 == -1 && var22.field2194 == null) {
                var62 = var22.method3521(10, arg5, var29, var31, var30, var32);
            } else {
                var62 = new class77(arg4, 10, arg5, var19, arg2, arg3, var22.field2176, var22.field2185, (class218) null);
            }
            if (var62 != null) {
                var20.method4053(arg0, arg2, arg3, var30, var23, var24, var62, arg6 == 11 ? 256 : 0, var33, var35);
            }
            if (var22.field2165 != 0) {
                var21.method3796(arg2, arg3, var23, var24, var22.field2178);
            }
        } else if (arg6 >= 12) {
            class218 var37;
            if (var22.field2176 == -1 && var22.field2194 == null) {
                var37 = var22.method3521(arg6, arg5, var29, var31, var30, var32);
            } else {
                var37 = new class77(arg4, arg6, arg5, var19, arg2, arg3, var22.field2176, var22.field2185, (class218) null);
            }
            var20.method4053(arg0, arg2, arg3, var30, 1, 1, var37, 0, var33, var35);
            if (var22.field2165 != 0) {
                var21.method3796(arg2, arg3, var23, var24, var22.field2178);
            }
        } else if (arg6 == 0) {
            class218 var38;
            if (var22.field2176 == -1 && var22.field2194 == null) {
                var38 = var22.method3521(0, arg5, var29, var31, var30, var32);
            } else {
                var38 = new class77(arg4, 0, arg5, var19, arg2, arg3, var22.field2176, var22.field2185, (class218) null);
            }
            var20.method4051(arg0, arg2, arg3, var30, var38, (class218) null, class79.field1033[arg5], 0, var33, var35);
            if (var22.field2165 != 0) {
                var21.method3761(arg2, arg3, arg6, arg5, var22.field2178);
            }
        } else if (arg6 == 1) {
            class218 var39;
            if (var22.field2176 == -1 && var22.field2194 == null) {
                var39 = var22.method3521(1, arg5, var29, var31, var30, var32);
            } else {
                var39 = new class77(arg4, 1, arg5, var19, arg2, arg3, var22.field2176, var22.field2185, (class218) null);
            }
            var20.method4051(arg0, arg2, arg3, var30, var39, (class218) null, class79.field1037[arg5], 0, var33, var35);
            if (var22.field2165 != 0) {
                var21.method3761(arg2, arg3, arg6, arg5, var22.field2178);
            }
        } else if (arg6 == 2) {
            int var40 = arg5 + 1 & 0x3;
            class218 var41;
            class218 var42;
            if (var22.field2176 == -1 && var22.field2194 == null) {
                var41 = var22.method3521(2, arg5 + 4, var29, var31, var30, var32);
                var42 = var22.method3521(2, var40, var29, var31, var30, var32);
            } else {
                var41 = new class77(arg4, 2, arg5 + 4, var19, arg2, arg3, var22.field2176, var22.field2185, (class218) null);
                var42 = new class77(arg4, 2, var40, var19, arg2, arg3, var22.field2176, var22.field2185, (class218) null);
            }
            var20.method4051(arg0, arg2, arg3, var30, var41, var42, class79.field1033[arg5], class79.field1033[var40], var33, var35);
            if (var22.field2165 != 0) {
                var21.method3761(arg2, arg3, arg6, arg5, var22.field2178);
            }
        } else if (arg6 == 3) {
            class218 var43;
            if (var22.field2176 == -1 && var22.field2194 == null) {
                var43 = var22.method3521(3, arg5, var29, var31, var30, var32);
            } else {
                var43 = new class77(arg4, 3, arg5, var19, arg2, arg3, var22.field2176, var22.field2185, (class218) null);
            }
            var20.method4051(arg0, arg2, arg3, var30, var43, (class218) null, class79.field1037[arg5], 0, var33, var35);
            if (var22.field2165 != 0) {
                var21.method3761(arg2, arg3, arg6, arg5, var22.field2178);
            }
        } else if (arg6 == 9) {
            class218 var44;
            if (var22.field2176 == -1 && var22.field2194 == null) {
                var44 = var22.method3521(arg6, arg5, var29, var31, var30, var32);
            } else {
                var44 = new class77(arg4, arg6, arg5, var19, arg2, arg3, var22.field2176, var22.field2185, (class218) null);
            }
            var20.method4053(arg0, arg2, arg3, var30, 1, 1, var44, 0, var33, var35);
            if (var22.field2165 != 0) {
                var21.method3796(arg2, arg3, var23, var24, var22.field2178);
            }
        } else if (arg6 == 4) {
            class218 var45;
            if (var22.field2176 == -1 && var22.field2194 == null) {
                var45 = var22.method3521(4, arg5, var29, var31, var30, var32);
            } else {
                var45 = new class77(arg4, 4, arg5, var19, arg2, arg3, var22.field2176, var22.field2185, (class218) null);
            }
            var20.method4052(arg0, arg2, arg3, var30, var45, (class218) null, class79.field1033[arg5], 0, 0, 0, var33, var35);
        } else if (arg6 == 5) {
            int var46 = 16;
            long var47 = var20.method4222(arg0, arg2, arg3);
            if (var47 != 0L) {
                var46 = class196.method3208(class225.method4236(var47)).field2177;
            }
            class218 var49;
            if (var22.field2176 == -1 && var22.field2194 == null) {
                var49 = var22.method3521(4, arg5, var29, var31, var30, var32);
            } else {
                var49 = new class77(arg4, 4, arg5, var19, arg2, arg3, var22.field2176, var22.field2185, (class218) null);
            }
            var20.method4052(arg0, arg2, arg3, var30, var49, (class218) null, class79.field1033[arg5], 0, class79.field1036[arg5] * var46, class79.field1030[arg5] * var46, var33, var35);
        } else if (arg6 == 6) {
            int var50 = 8;
            long var51 = var20.method4222(arg0, arg2, arg3);
            if (var51 != 0L) {
                var50 = class196.method3208(class225.method4236(var51)).field2177 / 2;
            }
            class218 var53;
            if (var22.field2176 == -1 && var22.field2194 == null) {
                var53 = var22.method3521(4, arg5 + 4, var29, var31, var30, var32);
            } else {
                var53 = new class77(arg4, 4, arg5 + 4, var19, arg2, arg3, var22.field2176, var22.field2185, (class218) null);
            }
            var20.method4052(arg0, arg2, arg3, var30, var53, (class218) null, 256, arg5, class79.field1038[arg5] * var50, class79.field1026[arg5] * var50, var33, var35);
        } else if (arg6 == 7) {
            int var54 = arg5 + 2 & 0x3;
            class218 var55;
            if (var22.field2176 == -1 && var22.field2194 == null) {
                var55 = var22.method3521(4, var54 + 4, var29, var31, var30, var32);
            } else {
                var55 = new class77(arg4, 4, var54 + 4, var19, arg2, arg3, var22.field2176, var22.field2185, (class218) null);
            }
            var20.method4052(arg0, arg2, arg3, var30, var55, (class218) null, 256, var54, 0, 0, var33, var35);
        } else if (arg6 == 8) {
            int var56 = 8;
            long var57 = var20.method4222(arg0, arg2, arg3);
            if (var57 != 0L) {
                var56 = class196.method3208(class225.method4236(var57)).field2177 / 2;
            }
            int var59 = arg5 + 2 & 0x3;
            class218 var60;
            class218 var61;
            if (var22.field2176 == -1 && var22.field2194 == null) {
                var60 = var22.method3521(4, arg5 + 4, var29, var31, var30, var32);
                var61 = var22.method3521(4, var59 + 4, var29, var31, var30, var32);
            } else {
                var60 = new class77(arg4, 4, arg5 + 4, var19, arg2, arg3, var22.field2176, var22.field2185, (class218) null);
                var61 = new class77(arg4, 4, var59 + 4, var19, arg2, arg3, var22.field2176, var22.field2185, (class218) null);
            }
            var20.method4052(arg0, arg2, arg3, var30, var60, var61, 256, arg5, class79.field1038[arg5] * var56, class79.field1026[arg5] * var56, var33, var35);
        }
    }

    @ObfuscatedName("my.jl(III)V")
    public static final void method6283(int arg0, int arg1) {
        class352 var2 = field648[Statics.field4488][arg0][arg1];
        if (var2 == null) {
            Statics.field286.method4064(Statics.field4488, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class101 var5 = null;
        for (class101 var6 = (class101) var2.method6086(); var6 != null; var6 = (class101) var2.method6088()) {
            class197 var7 = class197.method3345(var6.field1360);
            long var8 = (long) var7.field2227;
            if (var7.field2226 == 1) {
                var8 = (long) (var6.field1352 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field286.method4064(Statics.field4488, arg0, arg1);
            return;
        }
        var2.method6082(var5);
        class101 var10 = null;
        class101 var11 = null;
        for (class101 var12 = (class101) var2.method6086(); var12 != null; var12 = (class101) var2.method6088()) {
            if (var5.field1360 != var12.field1360) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1360 != var12.field1360 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        long var13 = class225.method574(arg0, arg1, 3, false, 0);
        Statics.field286.method4050(Statics.field4488, arg0, arg1, method3401(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field4488), var5, var13, var10, var11);
    }

    @ObfuscatedName("lb.jq(ZLqx;B)V")
    public static final void method5761(boolean arg0, class466 arg1) {
        field780 = 0;
        field565 = 0;
        arg1.method7741();
        int var2 = arg1.method7747(8);
        if (var2 < field563) {
            for (int var3 = var2; var3 < field563; var3++) {
                field642[++field780 - 1] = field719[var3];
            }
        }
        if (var2 > field563) {
            throw new RuntimeException("");
        }
        field563 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            int var5 = field719[var4];
            class97 var6 = field753[var5];
            int var7 = arg1.method7747(1);
            if (var7 == 0) {
                field719[++field563 - 1] = var5;
                var6.field1237 = field519;
            } else {
                int var8 = arg1.method7747(2);
                if (var8 == 0) {
                    field719[++field563 - 1] = var5;
                    var6.field1237 = field519;
                    field566[++field565 - 1] = var5;
                } else if (var8 == 1) {
                    field719[++field563 - 1] = var5;
                    var6.field1237 = field519;
                    int var9 = arg1.method7747(3);
                    var6.method2406(var9, class205.field2356);
                    int var10 = arg1.method7747(1);
                    if (var10 == 1) {
                        field566[++field565 - 1] = var5;
                    }
                } else if (var8 == 2) {
                    field719[++field563 - 1] = var5;
                    var6.field1237 = field519;
                    if (arg1.method7747(1) == 1) {
                        int var11 = arg1.method7747(3);
                        var6.method2406(var11, class205.field2358);
                        int var12 = arg1.method7747(3);
                        var6.method2406(var12, class205.field2358);
                    } else {
                        int var13 = arg1.method7747(3);
                        var6.method2406(var13, class205.field2357);
                    }
                    int var14 = arg1.method7747(1);
                    if (var14 == 1) {
                        field566[++field565 - 1] = var5;
                    }
                } else if (var8 == 3) {
                    field642[++field780 - 1] = var5;
                }
            }
        }
        while (true) {
            int var15 = Statics.field2122 ? 16 : 15;
            int var16 = 0x1 << var15;
            if (arg1.method7753(field567.field1430) < var15 + 12) {
                break;
            }
            int var17 = arg1.method7747(var15);
            if (var16 - 1 == var17) {
                break;
            }
            boolean var21 = false;
            if (field753[var17] == null) {
                field753[var17] = new class97();
                var21 = true;
            }
            class97 var22 = field753[var17];
            field719[++field563 - 1] = var17;
            var22.field1237 = field519;
            int var24;
            int var25;
            int var26;
            if (Statics.field2122) {
                int var23 = field646[arg1.method7747(3)];
                if (var21) {
                    var22.field1245 = var22.field1193 = var23;
                }
                var22.field1319 = class187.method2847(arg1.method7747(14));
                if (arg0) {
                    var24 = arg1.method7747(8);
                    if (var24 > 127) {
                        var24 -= 256;
                    }
                } else {
                    var24 = arg1.method7747(5);
                    if (var24 > 15) {
                        var24 -= 32;
                    }
                }
                var25 = arg1.method7747(1);
                if (arg0) {
                    var26 = arg1.method7747(8);
                    if (var26 > 127) {
                        var26 -= 256;
                    }
                } else {
                    var26 = arg1.method7747(5);
                    if (var26 > 15) {
                        var26 -= 32;
                    }
                }
                boolean var27 = arg1.method7747(1) == 1;
                if (var27) {
                    arg1.method7747(32);
                }
                int var28 = arg1.method7747(1);
                if (var28 == 1) {
                    field566[++field565 - 1] = var17;
                }
            } else {
                if (arg0) {
                    var24 = arg1.method7747(8);
                    if (var24 > 127) {
                        var24 -= 256;
                    }
                } else {
                    var24 = arg1.method7747(5);
                    if (var24 > 15) {
                        var24 -= 32;
                    }
                }
                int var29 = arg1.method7747(1);
                if (var29 == 1) {
                    field566[++field565 - 1] = var17;
                }
                boolean var30 = arg1.method7747(1) == 1;
                if (var30) {
                    arg1.method7747(32);
                }
                var22.field1319 = class187.method2847(arg1.method7747(14));
                if (arg0) {
                    var26 = arg1.method7747(8);
                    if (var26 > 127) {
                        var26 -= 256;
                    }
                } else {
                    var26 = arg1.method7747(5);
                    if (var26 > 15) {
                        var26 -= 32;
                    }
                }
                var25 = arg1.method7747(1);
                int var31 = field646[arg1.method7747(3)];
                if (var21) {
                    var22.field1245 = var22.field1193 = var31;
                }
            }
            method4424(var22);
            var22.method2407(Statics.field1790.field1204[0] + var26, Statics.field1790.field1252[0] + var24, var25 == 1);
        }
        arg1.method7743();
        method8(arg1);
        for (int var18 = 0; var18 < field780; var18++) {
            int var19 = field642[var18];
            if (field519 != field753[var19].field1237) {
                field753[var19].field1319 = null;
                field753[var19] = null;
            }
        }
        if (field567.field1430 != arg1.field4915) {
            throw new RuntimeException(arg1.field4915 + class98.field1325 + field567.field1430);
        }
        for (int var20 = 0; var20 < field563; var20++) {
            if (field753[field719[var20]] == null) {
                throw new RuntimeException(var20 + class98.field1325 + field563);
            }
        }
    }

    @ObfuscatedName("e.jj(Lqx;B)V")
    public static final void method8(class466 arg0) {
        for (int var1 = 0; var1 < field565; var1++) {
            int var2 = field566[var1];
            class97 var3 = field753[var2];
            int var4 = arg0.method7792();
            if ((var4 & 0x1) != 0) {
                int var5 = arg0.method7792();
                var4 += var5 << 8;
            }
            if ((var4 & 0x800) != 0) {
                int var6 = arg0.method7792();
                var4 += var6 << 16;
            }
            if ((var4 & 0x20000) != 0) {
                int var7 = arg0.method8002();
                var3.field1189 = (var7 & 0x1) == 0 ? var3.field1319.field2032 : arg0.method7834();
                var3.field1251 = (var7 & 0x2) == 0 ? var3.field1319.field2033 : arg0.method7794();
                var3.field1187 = (var7 & 0x4) == 0 ? var3.field1319.field2034 : arg0.method7794();
                var3.field1248 = (var7 & 0x8) == 0 ? var3.field1319.field2058 : arg0.method7794();
                var3.field1205 = (var7 & 0x10) == 0 ? var3.field1319.field2054 : arg0.method7794();
                var3.field1190 = (var7 & 0x20) == 0 ? var3.field1319.field2037 : arg0.method7772();
                var3.field1181 = (var7 & 0x40) == 0 ? var3.field1319.field2036 : arg0.method7833();
                var3.field1192 = (var7 & 0x80) == 0 ? var3.field1319.field2039 : arg0.method7772();
                var3.field1202 = (var7 & 0x100) == 0 ? var3.field1319.field2040 : arg0.method7772();
                var3.field1194 = (var7 & 0x200) == 0 ? var3.field1319.field2041 : arg0.method7834();
                var3.field1195 = (var7 & 0x400) == 0 ? var3.field1319.field2042 : arg0.method7833();
                var3.field1196 = (var7 & 0x800) == 0 ? var3.field1319.field2043 : arg0.method7772();
                var3.field1227 = (var7 & 0x1000) == 0 ? var3.field1319.field2044 : arg0.method7772();
                var3.field1198 = (var7 & 0x2000) == 0 ? var3.field1319.field2045 : arg0.method7833();
                var3.field1184 = (var7 & 0x4000) == 0 ? var3.field1319.field2028 : arg0.method7772();
            }
            if ((var4 & 0x4) != 0) {
                var3.field1319 = class187.method2847(arg0.method7772());
                method4424(var3);
                var3.method2414();
            }
            if ((var4 & 0x400) != 0) {
                var3.field1239 = field519 + arg0.method7834();
                var3.field1201 = field519 + arg0.method7834();
                var3.field1241 = arg0.method7960();
                var3.field1221 = arg0.method7793();
                var3.field1233 = arg0.method7960();
                var3.field1244 = (byte) arg0.method7823();
            }
            if ((var4 & 0x200) != 0) {
                int var8 = arg0.method7823();
                if ((var8 & 0x1) == 1) {
                    var3.method2437();
                } else {
                    int[] var9 = null;
                    if ((var8 & 0x2) == 2) {
                        int var10 = arg0.method7941();
                        var9 = new int[var10];
                        for (int var11 = 0; var11 < var10; var11++) {
                            int var12 = arg0.method7772();
                            int var13 = var12 == 65535 ? -1 : var12;
                            var9[var11] = var13;
                        }
                    }
                    short[] var14 = null;
                    if ((var8 & 0x4) == 4) {
                        int var15 = 0;
                        if (var3.field1319.field2047 != null) {
                            var15 = var3.field1319.field2047.length;
                        }
                        var14 = new short[var15];
                        for (int var16 = 0; var16 < var15; var16++) {
                            var14[var16] = (short) arg0.method7834();
                        }
                    }
                    short[] var17 = null;
                    if ((var8 & 0x8) == 8) {
                        int var18 = 0;
                        if (var3.field1319.field2049 != null) {
                            var18 = var3.field1319.field2049.length;
                        }
                        var17 = new short[var18];
                        for (int var19 = 0; var19 < var18; var19++) {
                            var17[var19] = (short) arg0.method7772();
                        }
                    }
                    long var20 = (long) (++class97.field1316 - 1);
                    var3.method2417(new class186(var20, var9, var14, var17));
                }
            }
            if ((var4 & 0x2000) != 0) {
                var3.field1254 = arg0.method7827();
            }
            if ((var4 & 0x20) != 0) {
                int var22 = arg0.method7833();
                if (var22 == 65535) {
                    var22 = -1;
                }
                int var23 = arg0.method7792();
                if (var3.field1220 == var22 && var22 != -1) {
                    int var24 = class199.method4223(var22).field2277;
                    if (var24 == 1) {
                        var3.field1211 = 0;
                        var3.field1222 = 0;
                        var3.field1223 = var23;
                        var3.field1224 = 0;
                    }
                    if (var24 == 2) {
                        var3.field1224 = 0;
                    }
                } else if (var22 == -1 || var3.field1220 == -1 || class199.method4223(var22).field2301 >= class199.method4223(var3.field1220).field2301) {
                    var3.field1220 = var22;
                    var3.field1211 = 0;
                    var3.field1222 = 0;
                    var3.field1223 = var23;
                    var3.field1224 = 0;
                    var3.field1253 = var3.field1178;
                }
            }
            if ((var4 & 0x10) != 0) {
                int var25 = arg0.method7944();
                if (var25 > 0) {
                    for (int var26 = 0; var26 < var25; var26++) {
                        int var27 = -1;
                        int var28 = -1;
                        int var29 = -1;
                        int var30 = arg0.method7806();
                        if (var30 == 32767) {
                            var30 = arg0.method7806();
                            var28 = arg0.method7806();
                            var27 = arg0.method7806();
                            var29 = arg0.method7806();
                        } else if (var30 == 32766) {
                            var30 = -1;
                        } else {
                            var28 = arg0.method7806();
                        }
                        int var31 = arg0.method7806();
                        var3.method2222(var30, var28, var27, var29, field519, var31);
                    }
                }
                int var32 = arg0.method7792();
                if (var32 > 0) {
                    for (int var33 = 0; var33 < var32; var33++) {
                        int var34 = arg0.method7806();
                        int var35 = arg0.method7806();
                        if (var35 == 32767) {
                            var3.method2234(var34);
                        } else {
                            int var36 = arg0.method7806();
                            int var37 = arg0.method7944();
                            int var38 = var35 > 0 ? arg0.method7823() : var37;
                            var3.method2224(var34, field519, var35, var36, var37, var38);
                        }
                    }
                }
            }
            if ((var4 & 0x80) != 0) {
                var3.field1199 = arg0.method7801();
                var3.field1249 = 100;
            }
            if ((var4 & 0x1000) != 0) {
                var3.method2404(arg0.method7792());
            }
            if ((var4 & 0x100) != 0) {
                var3.method2441(arg0.method7801());
            }
            if ((var4 & 0x8) != 0) {
                int var39 = arg0.method7794();
                int var40 = arg0.method7794();
                var3.field1229 = arg0.method7792() == 1;
                int var41 = var3.field1243 - (var39 - Statics.field1780 - Statics.field1780) * 64;
                int var42 = var3.field1179 - (var40 - Statics.field4368 - Statics.field4368) * 64;
                if (var41 != 0 || var42 != 0) {
                    var3.field1191 = (int) (Math.atan2((double) var41, (double) var42) * 325.949D) & 0x7FF;
                }
            }
            if ((var4 & 0x8000) != 0) {
                var3.field1197 = arg0.method7960();
                var3.field1186 = arg0.method7793();
                var3.field1231 = arg0.method7960();
                var3.field1214 = arg0.method7943();
                var3.field1234 = arg0.method7794() + field519;
                var3.field1235 = arg0.method7772() + field519;
                var3.field1236 = arg0.method7794();
                var3.field1178 = 1;
                var3.field1253 = 0;
                var3.field1197 += var3.field1204[0];
                var3.field1186 += var3.field1252[0];
                var3.field1231 += var3.field1204[0];
                var3.field1214 += var3.field1252[0];
            }
            if ((var4 & 0x4000) != 0) {
                int var43 = arg0.method7941();
                if ((var43 & 0x1) == 1) {
                    var3.method2430();
                } else {
                    int[] var44 = null;
                    if ((var43 & 0x2) == 2) {
                        int var45 = arg0.method7792();
                        var44 = new int[var45];
                        for (int var46 = 0; var46 < var45; var46++) {
                            int var47 = arg0.method7833();
                            int var48 = var47 == 65535 ? -1 : var47;
                            var44[var46] = var48;
                        }
                    }
                    short[] var49 = null;
                    if ((var43 & 0x4) == 4) {
                        int var50 = 0;
                        if (var3.field1319.field2047 != null) {
                            var50 = var3.field1319.field2047.length;
                        }
                        var49 = new short[var50];
                        for (int var51 = 0; var51 < var50; var51++) {
                            var49[var51] = (short) arg0.method7772();
                        }
                    }
                    short[] var52 = null;
                    if ((var43 & 0x8) == 8) {
                        int var53 = 0;
                        if (var3.field1319.field2049 != null) {
                            var53 = var3.field1319.field2049.length;
                        }
                        var52 = new short[var53];
                        for (int var54 = 0; var54 < var53; var54++) {
                            var52[var54] = (short) arg0.method7833();
                        }
                    }
                    long var55 = (long) (++class97.field1318 - 1);
                    var3.method2415(new class186(var55, var44, var49, var52));
                }
            }
            if ((var4 & 0x40) != 0) {
                var3.field1212 = arg0.method7794();
                int var57;
                if (Statics.field2122) {
                    var3.field1212 += arg0.method7941() << 16;
                    var57 = 16777215;
                } else {
                    var57 = 65535;
                }
                if (var3.field1212 == var57) {
                    var3.field1212 = -1;
                }
            }
            if ((var4 & 0x2) != 0) {
                var3.field1225 = arg0.method7794();
                int var58 = arg0.method7827();
                var3.field1247 = var58 >> 16;
                var3.field1228 = (var58 & 0xFFFF) + field519;
                var3.field1226 = 0;
                var3.field1215 = 0;
                if (var3.field1228 > field519) {
                    var3.field1226 = -1;
                }
                if (var3.field1225 == 65535) {
                    var3.field1225 = -1;
                }
            }
            if ((var4 & 0x10000) != 0) {
                int var59 = arg0.method7941();
                int[] var60 = new int[8];
                short[] var61 = new short[8];
                for (int var62 = 0; var62 < 8; var62++) {
                    if ((var59 & 0x1 << var62) == 0) {
                        var60[var62] = -1;
                        var61[var62] = -1;
                    } else {
                        var60[var62] = arg0.method7810();
                        var61[var62] = (short) arg0.method8023();
                    }
                }
                var3.method2413(var60, var61);
            }
        }
    }

    @ObfuscatedName("hp.jt(Lcg;B)V")
    public static void method4424(class97 arg0) {
        arg0.field1182 = arg0.field1319.field2035;
        arg0.field1250 = arg0.field1319.field2065;
        if (arg0.field1250 == 0) {
            arg0.field1193 = 0;
        }
        arg0.field1187 = arg0.field1319.field2034;
        arg0.field1248 = arg0.field1319.field2058;
        arg0.field1205 = arg0.field1319.field2054;
        arg0.field1190 = arg0.field1319.field2037;
        arg0.field1184 = arg0.field1319.field2028;
        arg0.field1189 = arg0.field1319.field2032;
        arg0.field1251 = arg0.field1319.field2033;
        arg0.field1181 = arg0.field1319.field2036;
        arg0.field1192 = arg0.field1319.field2039;
        arg0.field1202 = arg0.field1319.field2040;
        arg0.field1194 = arg0.field1319.field2041;
        arg0.field1195 = arg0.field1319.field2042;
        arg0.field1196 = arg0.field1319.field2043;
        arg0.field1227 = arg0.field1319.field2044;
        arg0.field1198 = arg0.field1319.field2045;
    }

    @ObfuscatedName("hs.jv(III)Lgg;")
    public static class204 method3911(int arg0, int arg1) {
        field806.field2350 = arg0;
        field806.field2353 = arg1;
        field806.field2351 = 1;
        field806.field2352 = 1;
        return field806;
    }

    @ObfuscatedName("im.ji(I)V")
    public static void method4760() {
        field657 = 0;
        field656 = false;
    }

    @ObfuscatedName("nc.jd(I)V")
    public static void method6801() {
        method4760();
        field663[0] = class326.field3900;
        field544[0] = "";
        field751[0] = 1006;
        field665[0] = false;
        field657 = 1;
    }

    @ObfuscatedName("bg.jz(I)V")
    public static final void method1140() {
        int var0 = Statics.field1958;
        int var1 = Statics.field1321;
        int var2 = Statics.field1349;
        int var3 = Statics.field265;
        int var4 = 6116423;
        class477.method8120(var0, var1, var2, var3, var4);
        class477.method8120(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class477.method8111(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field1714.method6525(class326.field4033, var0 + 3, var1 + 14, var4, -1);
        int var5 = class37.field254;
        int var6 = class37.field249;
        for (int var7 = 0; var7 < field657; var7++) {
            int var8 = (field657 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            Statics.field1714.method6525(method482(var7), var0 + 3, var8, var9, 0);
        }
        int var10 = Statics.field1958;
        int var11 = Statics.field1321;
        int var12 = Statics.field1349;
        int var13 = Statics.field265;
        for (int var14 = 0; var14 < field730; var14++) {
            if (field735[var14] + field723[var14] > var10 && field735[var14] < var10 + var12 && field736[var14] + field535[var14] > var11 && field736[var14] < var11 + var13) {
                field733[var14] = true;
            }
        }
    }

    @ObfuscatedName("gh.jb(I)Z")
    public static final boolean method3418() {
        return field656;
    }

    @ObfuscatedName("ag.jw(IIIII)V")
    public static final void method705(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field730; var4++) {
            if (field735[var4] + field723[var4] > arg0 && field735[var4] < arg0 + arg2 && field736[var4] + field535[var4] > arg1 && field736[var4] < arg1 + arg3) {
                field732[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.jr(I)V")
    public final void method1548() {
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < field657 - 1; var2++) {
                if (field751[var2] < 1000 && field751[var2 + 1] > 1000) {
                    String var3 = field544[var2];
                    field544[var2] = field544[var2 + 1];
                    field544[var2 + 1] = var3;
                    String var4 = field663[var2];
                    field663[var2] = field663[var2 + 1];
                    field663[var2 + 1] = var4;
                    int var5 = field751[var2];
                    field751[var2] = field751[var2 + 1];
                    field751[var2 + 1] = var5;
                    int var6 = field658[var2];
                    field658[var2] = field658[var2 + 1];
                    field658[var2 + 1] = var6;
                    int var7 = field651[var2];
                    field651[var2] = field651[var2 + 1];
                    field651[var2 + 1] = var7;
                    int var8 = field621[var2];
                    field621[var2] = field621[var2 + 1];
                    field621[var2 + 1] = var8;
                    int var9 = field662[var2];
                    field662[var2] = field662[var2 + 1];
                    field662[var2 + 1] = var9;
                    boolean var10 = field665[var2];
                    field665[var2] = field665[var2 + 1];
                    field665[var2 + 1] = var10;
                    var1 = false;
                }
            }
        }
        if (Statics.field4390 != null || field694 != null) {
            return;
        }
        int var29;
        int var32;
        int var33;
        label220: {
            int var11 = class37.field261;
            if (field656) {
                if (var11 != 1 && (Statics.field2773 || var11 != 4)) {
                    int var12 = class37.field254;
                    int var13 = class37.field249;
                    if (var12 < Statics.field1958 - 10 || var12 > Statics.field1958 + Statics.field1349 + 10 || var13 < Statics.field1321 - 10 || var13 > Statics.field265 + Statics.field1321 + 10) {
                        field656 = false;
                        method705(Statics.field1958, Statics.field1321, Statics.field1349, Statics.field265);
                    }
                }
                if (var11 == 1 || !Statics.field2773 && var11 == 4) {
                    int var14 = Statics.field1958;
                    int var15 = Statics.field1321;
                    int var16 = Statics.field1349;
                    int var17 = class37.field262;
                    int var18 = class37.field258;
                    int var19 = -1;
                    for (int var20 = 0; var20 < field657; var20++) {
                        int var21 = (field657 - 1 - var20) * 15 + var15 + 31;
                        if (var17 > var14 && var17 < var14 + var16 && var18 > var21 - 13 && var18 < var21 + 3) {
                            var19 = var20;
                        }
                    }
                    if (var19 != -1 && var19 >= 0) {
                        int var22 = field658[var19];
                        int var23 = field651[var19];
                        int var24 = field751[var19];
                        int var25 = field621[var19];
                        int var26 = field662[var19];
                        String var27 = field663[var19];
                        String var28 = field544[var19];
                        method4436(var22, var23, var24, var25, var26, var27, var28, class37.field262, class37.field258);
                    }
                    field656 = false;
                    method705(Statics.field1958, Statics.field1321, Statics.field1349, Statics.field265);
                }
            } else {
                var29 = field657 - 1;
                if ((var11 == 1 || !Statics.field2773 && var11 == 4) && var29 >= 0) {
                    int var31 = field751[var29];
                    if (var31 == 39 || var31 == 40 || var31 == 41 || var31 == 42 || var31 == 43 || var31 == 33 || var31 == 34 || var31 == 35 || var31 == 36 || var31 == 37 || var31 == 38 || var31 == 1005) {
                        var32 = field658[var29];
                        var33 = field651[var29];
                        class306 var34 = Statics.method3181(var33);
                        int var35 = method3180(var34);
                        boolean var36 = (var35 >> 28 & 0x1) != 0;
                        if (var36) {
                            break label220;
                        }
                        int var37 = method3180(var34);
                        boolean var38 = (var37 >> 29 & 0x1) != 0;
                        if (var38) {
                            break label220;
                        }
                    }
                }
                if ((var11 == 1 || !Statics.field2773 && var11 == 4) && this.method1167()) {
                    var11 = 2;
                }
                if ((var11 == 1 || !Statics.field2773 && var11 == 4) && field657 > 0 && var29 >= 0) {
                    int var39 = field658[var29];
                    int var40 = field651[var29];
                    int var41 = field751[var29];
                    int var42 = field621[var29];
                    int var43 = field662[var29];
                    String var44 = field663[var29];
                    String var45 = field544[var29];
                    method4436(var39, var40, var41, var42, var43, var44, var45, class37.field262, class37.field258);
                }
                if (var11 == 2 && field657 > 0) {
                    this.method1168(class37.field262, class37.field258);
                }
            }
            return;
        }
        if (Statics.field4390 != null && !field631 && field657 > 0 && !this.method1167()) {
            method4453(field628, field629);
        }
        field631 = false;
        field632 = 0;
        if (Statics.field4390 != null) {
            method1922(Statics.field4390);
        }
        Statics.field4390 = Statics.method3181(var33);
        field619 = var32;
        field628 = class37.field262;
        field629 = class37.field258;
        if (var29 >= 0) {
            method702(var29);
        }
        method1922(Statics.field4390);
    }

    @ObfuscatedName("client.jp(I)Z")
    public final boolean method1167() {
        int var1 = field657 - 1;
        return (field599 && field657 > 2 || method4959(var1)) && !field665[var1];
    }

    @ObfuscatedName("client.jn(III)V")
    public final void method1168(int arg0, int arg1) {
        int var3 = Statics.field1714.method6568(class326.field4033);
        for (int var4 = 0; var4 < field657; var4++) {
            int var5 = Statics.field1714.method6568(method482(var4));
            if (var5 > var3) {
                var3 = var5;
            }
        }
        var3 += 8;
        int var6 = field657 * 15 + 22;
        int var7 = arg0 - var3 / 2;
        if (var3 + var7 > Statics.field2331) {
            var7 = Statics.field2331 - var3;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = arg1;
        if (var6 + arg1 > Statics.field4300) {
            var8 = Statics.field4300 - var6;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        Statics.field1958 = var7;
        Statics.field1321 = var8;
        Statics.field1349 = var3;
        Statics.field265 = field657 * 15 + 22;
        int var9 = arg0 - field660;
        int var10 = arg1 - field788;
        Statics.field286.method4101(Statics.field4488, var9, var10, false);
        field656 = true;
    }

    @ObfuscatedName("jg.jx(II)Z")
    public static final boolean method4959(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field751[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("jn.jf(Lbs;IIB)V")
    public static final void method4939(class71 arg0, int arg1, int arg2) {
        if (arg0 != null) {
            method4436(arg0.field907, arg0.field903, arg0.field901, arg0.field902, arg0.field905, arg0.field904, arg0.field900, arg1, arg2);
        }
    }

    @ObfuscatedName("hd.jh(IIIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method4436(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, String arg6, int arg7, int arg8) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 3) {
            field582 = arg7;
            field515 = arg8;
            field623 = 2;
            field601 = 0;
            field761 = arg0;
            field507 = arg1;
            class278 var9 = class278.method2890(class276.field3118, field567.field1425);
            var9.field3177.method7789(field748.method3737(82) ? 1 : 0);
            var9.field3177.method7831(Statics.field1780 + arg0);
            var9.field3177.method7830(Statics.field4368 + arg1);
            var9.field3177.method7776(arg3);
            field567.method2603(var9);
        }
        if (arg2 == 43) {
            class278 var10 = class278.method2890(class276.field3112, field567.field1425);
            var10.field3177.method7776(arg4);
            var10.field3177.method7830(arg0);
            var10.field3177.method7841(arg1);
            field567.method2603(var10);
            field625 = 0;
            Statics.field3412 = Statics.method3181(arg1);
            field626 = arg0;
        }
        if (arg2 == 34) {
            class278 var11 = class278.method2890(class276.field3102, field567.field1425);
            var11.field3177.method7831(arg4);
            var11.field3177.method7841(arg1);
            var11.field3177.method7849(arg0);
            field567.method2603(var11);
            field625 = 0;
            Statics.field3412 = Statics.method3181(arg1);
            field626 = arg0;
        }
        if (arg2 == 47) {
            class89 var12 = field635[arg3];
            if (var12 != null) {
                field582 = arg7;
                field515 = arg8;
                field623 = 2;
                field601 = 0;
                field761 = arg0;
                field507 = arg1;
                class278 var13 = class278.method2890(class276.field3048, field567.field1425);
                var13.field3177.method7776(arg3);
                var13.field3177.method7822(field748.method3737(82) ? 1 : 0);
                field567.method2603(var13);
            }
        }
        if (arg2 == 17) {
            field582 = arg7;
            field515 = arg8;
            field623 = 2;
            field601 = 0;
            field761 = arg0;
            field507 = arg1;
            class278 var14 = class278.method2890(class276.field3065, field567.field1425);
            var14.field3177.method7776(Statics.field4368 + arg1);
            var14.field3177.method7776(field677);
            var14.field3177.method7843(Statics.field4347);
            var14.field3177.method7831(Statics.field1780 + arg0);
            var14.field3177.method7776(arg3);
            var14.field3177.method7820(field748.method3737(82) ? 1 : 0);
            var14.field3177.method7776(field678);
            field567.method2603(var14);
        }
        if (arg2 == 31) {
            class278 var15 = class278.method2890(class276.field3132, field567.field1425);
            var15.field3177.method7843(arg1);
            var15.field3177.method7841(Statics.field4322);
            var15.field3177.method7776(arg4);
            var15.field3177.method7849(Statics.field1364);
            var15.field3177.method7849(arg0);
            var15.field3177.method7776(Statics.field1258);
            field567.method2603(var15);
            field625 = 0;
            Statics.field3412 = Statics.method3181(arg1);
            field626 = arg0;
        }
        if (arg2 == 7) {
            class97 var16 = field753[arg3];
            if (var16 != null) {
                field582 = arg7;
                field515 = arg8;
                field623 = 2;
                field601 = 0;
                field761 = arg0;
                field507 = arg1;
                class278 var17 = class278.method2890(class276.field3083, field567.field1425);
                var17.field3177.method7842(Statics.field4322);
                var17.field3177.method7822(field748.method3737(82) ? 1 : 0);
                var17.field3177.method7831(arg3);
                var17.field3177.method7830(Statics.field1364);
                var17.field3177.method7830(Statics.field1258);
                field567.method2603(var17);
            }
        }
        if (arg2 == 21) {
            field582 = arg7;
            field515 = arg8;
            field623 = 2;
            field601 = 0;
            field761 = arg0;
            field507 = arg1;
            class278 var18 = class278.method2890(class276.field3113, field567.field1425);
            var18.field3177.method7830(Statics.field1780 + arg0);
            var18.field3177.method7822(field748.method3737(82) ? 1 : 0);
            var18.field3177.method7776(Statics.field4368 + arg1);
            var18.field3177.method7776(arg3);
            field567.method2603(var18);
        }
        if (arg2 == 58) {
            class306 var19 = class306.method2472(arg1, arg0);
            if (var19 != null) {
                if (var19.field3655 != null) {
                    class85 var20 = new class85();
                    var20.field1077 = var19;
                    var20.field1080 = arg3;
                    var20.field1084 = arg6;
                    var20.field1079 = var19.field3655;
                    class68.method3219(var20);
                }
                class278 var21 = class278.method2890(class276.field3154, field567.field1425);
                var21.field3177.method7849(field678);
                var21.field3177.method7778(arg1);
                var21.field3177.method7843(Statics.field4347);
                var21.field3177.method7831(field677);
                var21.field3177.method7849(arg0);
                var21.field3177.method7831(arg4);
                field567.method2603(var21);
            }
        }
        if (arg2 == 51) {
            class89 var22 = field635[arg3];
            if (var22 != null) {
                field582 = arg7;
                field515 = arg8;
                field623 = 2;
                field601 = 0;
                field761 = arg0;
                field507 = arg1;
                class278 var23 = class278.method2890(class276.field3139, field567.field1425);
                var23.field3177.method7831(arg3);
                var23.field3177.method7820(field748.method3737(82) ? 1 : 0);
                field567.method2603(var23);
            }
        }
        if (arg2 == 1) {
            field582 = arg7;
            field515 = arg8;
            field623 = 2;
            field601 = 0;
            field761 = arg0;
            field507 = arg1;
            class278 var24 = class278.method2890(class276.field3070, field567.field1425);
            var24.field3177.method7849(arg3);
            var24.field3177.method7849(Statics.field4368 + arg1);
            var24.field3177.method7849(Statics.field1364);
            var24.field3177.method7830(Statics.field1258);
            var24.field3177.method7841(Statics.field4322);
            var24.field3177.method7830(Statics.field1780 + arg0);
            var24.field3177.method7789(field748.method3737(82) ? 1 : 0);
            field567.method2603(var24);
        }
        if (arg2 == 28) {
            class278 var25 = class278.method2890(class276.field3134, field567.field1425);
            var25.field3177.method7778(arg1);
            field567.method2603(var25);
            class306 var26 = Statics.method3181(arg1);
            if (var26 != null && var26.field3533 != null && var26.field3533[0][0] == 5) {
                int var27 = var26.field3533[0][1];
                class296.field3445[var27] = 1 - class296.field3445[var27];
                method2154(var27);
            }
        }
        if (arg2 == 29) {
            class278 var28 = class278.method2890(class276.field3134, field567.field1425);
            var28.field3177.method7778(arg1);
            field567.method2603(var28);
            class306 var29 = Statics.method3181(arg1);
            if (var29 != null && var29.field3533 != null && var29.field3533[0][0] == 5) {
                int var30 = var29.field3533[0][1];
                if (class296.field3445[var30] != var29.field3674[0]) {
                    class296.field3445[var30] = var29.field3674[0];
                    method2154(var30);
                }
            }
        }
        if (arg2 == 49) {
            class89 var31 = field635[arg3];
            if (var31 != null) {
                field582 = arg7;
                field515 = arg8;
                field623 = 2;
                field601 = 0;
                field761 = arg0;
                field507 = arg1;
                class278 var32 = class278.method2890(class276.field3067, field567.field1425);
                var32.field3177.method7822(field748.method3737(82) ? 1 : 0);
                var32.field3177.method7776(arg3);
                field567.method2603(var32);
            }
        }
        if (arg2 == 26) {
            method4763();
        }
        if (arg2 == 14) {
            class89 var33 = field635[arg3];
            if (var33 != null) {
                field582 = arg7;
                field515 = arg8;
                field623 = 2;
                field601 = 0;
                field761 = arg0;
                field507 = arg1;
                class278 var34 = class278.method2890(class276.field3087, field567.field1425);
                var34.field3177.method7822(field748.method3737(82) ? 1 : 0);
                var34.field3177.method7843(Statics.field4322);
                var34.field3177.method7831(Statics.field1364);
                var34.field3177.method7831(Statics.field1258);
                var34.field3177.method7830(arg3);
                field567.method2603(var34);
            }
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field1973.method7419(arg2, arg3, new class297(arg0), new class297(arg1));
        }
        if (arg2 == 46) {
            class89 var35 = field635[arg3];
            if (var35 != null) {
                field582 = arg7;
                field515 = arg8;
                field623 = 2;
                field601 = 0;
                field761 = arg0;
                field507 = arg1;
                class278 var36 = class278.method2890(class276.field3095, field567.field1425);
                var36.field3177.method7789(field748.method3737(82) ? 1 : 0);
                var36.field3177.method7831(arg3);
                field567.method2603(var36);
            }
        }
        if (arg2 == 39) {
            class278 var37 = class278.method2890(class276.field3060, field567.field1425);
            var37.field3177.method7778(arg1);
            var37.field3177.method7830(arg4);
            var37.field3177.method7831(arg0);
            field567.method2603(var37);
            field625 = 0;
            Statics.field3412 = Statics.method3181(arg1);
            field626 = arg0;
        }
        if (arg2 == 37) {
            class278 var38 = class278.method2890(class276.field3105, field567.field1425);
            var38.field3177.method7843(arg1);
            var38.field3177.method7776(arg4);
            var38.field3177.method7830(arg0);
            field567.method2603(var38);
            field625 = 0;
            Statics.field3412 = Statics.method3181(arg1);
            field626 = arg0;
        }
        if (arg2 == 41) {
            class278 var39 = class278.method2890(class276.field3117, field567.field1425);
            var39.field3177.method7842(arg1);
            var39.field3177.method7831(arg0);
            var39.field3177.method7830(arg4);
            field567.method2603(var39);
            field625 = 0;
            Statics.field3412 = Statics.method3181(arg1);
            field626 = arg0;
        }
        if (arg2 == 16) {
            field582 = arg7;
            field515 = arg8;
            field623 = 2;
            field601 = 0;
            field761 = arg0;
            field507 = arg1;
            class278 var40 = class278.method2890(class276.field3062, field567.field1425);
            var40.field3177.method7776(arg3);
            var40.field3177.method7830(Statics.field4368 + arg1);
            var40.field3177.method7821(field748.method3737(82) ? 1 : 0);
            var40.field3177.method7831(Statics.field1364);
            var40.field3177.method7778(Statics.field4322);
            var40.field3177.method7831(Statics.field1258);
            var40.field3177.method7830(Statics.field1780 + arg0);
            field567.method2603(var40);
        }
        if (arg2 == 18) {
            field582 = arg7;
            field515 = arg8;
            field623 = 2;
            field601 = 0;
            field761 = arg0;
            field507 = arg1;
            class278 var41 = class278.method2890(class276.field3111, field567.field1425);
            var41.field3177.method7849(Statics.field4368 + arg1);
            var41.field3177.method7789(field748.method3737(82) ? 1 : 0);
            var41.field3177.method7831(arg3);
            var41.field3177.method7849(Statics.field1780 + arg0);
            field567.method2603(var41);
        }
        if (arg2 == 48) {
            class89 var42 = field635[arg3];
            if (var42 != null) {
                field582 = arg7;
                field515 = arg8;
                field623 = 2;
                field601 = 0;
                field761 = arg0;
                field507 = arg1;
                class278 var43 = class278.method2890(class276.field3089, field567.field1425);
                var43.field3177.method7849(arg3);
                var43.field3177.method7822(field748.method3737(82) ? 1 : 0);
                field567.method2603(var43);
            }
        }
        if (arg2 == 1001) {
            field582 = arg7;
            field515 = arg8;
            field623 = 2;
            field601 = 0;
            field761 = arg0;
            field507 = arg1;
            class278 var44 = class278.method2890(class276.field3120, field567.field1425);
            var44.field3177.method7831(Statics.field4368 + arg1);
            var44.field3177.method7776(Statics.field1780 + arg0);
            var44.field3177.method7830(arg3);
            var44.field3177.method7820(field748.method3737(82) ? 1 : 0);
            field567.method2603(var44);
        }
        if (arg2 == 9) {
            class97 var45 = field753[arg3];
            if (var45 != null) {
                field582 = arg7;
                field515 = arg8;
                field623 = 2;
                field601 = 0;
                field761 = arg0;
                field507 = arg1;
                class278 var46 = class278.method2890(class276.field3138, field567.field1425);
                var46.field3177.method7849(arg3);
                var46.field3177.method7820(field748.method3737(82) ? 1 : 0);
                field567.method2603(var46);
            }
        }
        if (arg2 == 4) {
            field582 = arg7;
            field515 = arg8;
            field623 = 2;
            field601 = 0;
            field761 = arg0;
            field507 = arg1;
            class278 var47 = class278.method2890(class276.field3101, field567.field1425);
            var47.field3177.method7820(field748.method3737(82) ? 1 : 0);
            var47.field3177.method7849(arg3);
            var47.field3177.method7831(Statics.field4368 + arg1);
            var47.field3177.method7849(Statics.field1780 + arg0);
            field567.method2603(var47);
        }
        if (arg2 == 5) {
            field582 = arg7;
            field515 = arg8;
            field623 = 2;
            field601 = 0;
            field761 = arg0;
            field507 = arg1;
            class278 var48 = class278.method2890(class276.field3081, field567.field1425);
            var48.field3177.method7820(field748.method3737(82) ? 1 : 0);
            var48.field3177.method7831(Statics.field4368 + arg1);
            var48.field3177.method7830(Statics.field1780 + arg0);
            var48.field3177.method7830(arg3);
            field567.method2603(var48);
        }
        if (arg2 == 15) {
            class89 var49 = field635[arg3];
            if (var49 != null) {
                field582 = arg7;
                field515 = arg8;
                field623 = 2;
                field601 = 0;
                field761 = arg0;
                field507 = arg1;
                class278 var50 = class278.method2890(class276.field3097, field567.field1425);
                var50.field3177.method7776(arg3);
                var50.field3177.method7820(field748.method3737(82) ? 1 : 0);
                var50.field3177.method7849(field677);
                var50.field3177.method7778(Statics.field4347);
                var50.field3177.method7831(field678);
                field567.method2603(var50);
            }
        }
        if (arg2 == 35) {
            class278 var51 = class278.method2890(class276.field3094, field567.field1425);
            var51.field3177.method7778(arg1);
            var51.field3177.method7830(arg4);
            var51.field3177.method7830(arg0);
            field567.method2603(var51);
            field625 = 0;
            Statics.field3412 = Statics.method3181(arg1);
            field626 = arg0;
        }
        if (arg2 == 6) {
            field582 = arg7;
            field515 = arg8;
            field623 = 2;
            field601 = 0;
            field761 = arg0;
            field507 = arg1;
            class278 var52 = class278.method2890(class276.field3072, field567.field1425);
            var52.field3177.method7776(arg3);
            var52.field3177.method7821(field748.method3737(82) ? 1 : 0);
            var52.field3177.method7831(Statics.field4368 + arg1);
            var52.field3177.method7849(Statics.field1780 + arg0);
            field567.method2603(var52);
        }
        if (arg2 == 44) {
            class89 var53 = field635[arg3];
            if (var53 != null) {
                field582 = arg7;
                field515 = arg8;
                field623 = 2;
                field601 = 0;
                field761 = arg0;
                field507 = arg1;
                class278 var54 = class278.method2890(class276.field3092, field567.field1425);
                var54.field3177.method7789(field748.method3737(82) ? 1 : 0);
                var54.field3177.method7776(arg3);
                field567.method2603(var54);
            }
        }
        if (arg2 == 30 && field687 == null) {
            method4874(arg1, arg0);
            field687 = class306.method2472(arg1, arg0);
            method1922(field687);
        }
        if (arg2 == 20) {
            field582 = arg7;
            field515 = arg8;
            field623 = 2;
            field601 = 0;
            field761 = arg0;
            field507 = arg1;
            class278 var55 = class278.method2890(class276.field3063, field567.field1425);
            var55.field3177.method7830(Statics.field1780 + arg0);
            var55.field3177.method7849(arg3);
            var55.field3177.method7849(Statics.field4368 + arg1);
            var55.field3177.method7820(field748.method3737(82) ? 1 : 0);
            field567.method2603(var55);
        }
        if (arg2 == 23) {
            if (field656) {
                Statics.field286.method4156();
            } else {
                Statics.field286.method4101(Statics.field4488, arg0, arg1, true);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class306 var56 = class306.method2472(arg1, arg0);
            if (var56 != null) {
                method4417(arg3, arg1, arg0, arg4, arg6);
            }
        }
        if (arg2 == 38) {
            method5715();
            class306 var57 = Statics.method3181(arg1);
            field674 = 1;
            Statics.field1364 = arg0;
            Statics.field4322 = arg1;
            Statics.field1258 = arg4;
            method1922(var57);
            field771 = class98.method2153(16748608) + class197.method3345(arg4).field2215 + class98.method2153(16777215);
            if (field771 == null) {
                field771 = class326.field3819;
            }
            return;
        }
        if (arg2 == 10) {
            class97 var58 = field753[arg3];
            if (var58 != null) {
                field582 = arg7;
                field515 = arg8;
                field623 = 2;
                field601 = 0;
                field761 = arg0;
                field507 = arg1;
                class278 var59 = class278.method2890(class276.field3069, field567.field1425);
                var59.field3177.method7831(arg3);
                var59.field3177.method7789(field748.method3737(82) ? 1 : 0);
                field567.method2603(var59);
            }
        }
        if (arg2 == 33) {
            class278 var60 = class278.method2890(class276.field3096, field567.field1425);
            var60.field3177.method7849(arg0);
            var60.field3177.method7843(arg1);
            var60.field3177.method7830(arg4);
            field567.method2603(var60);
            field625 = 0;
            Statics.field3412 = Statics.method3181(arg1);
            field626 = arg0;
        }
        if (arg2 == 1005) {
            class306 var61 = Statics.method3181(arg1);
            if (var61 == null || var61.field3581[arg0] < 100000) {
                class278 var62 = class278.method2890(class276.field3128, field567.field1425);
                var62.field3177.method7831(arg4);
                field567.method2603(var62);
            } else {
                class107.method3247(27, "", var61.field3581[arg0] + " x " + class197.method3345(arg4).field2215);
            }
            field625 = 0;
            Statics.field3412 = Statics.method3181(arg1);
            field626 = arg0;
        }
        if (arg2 == 36) {
            class278 var63 = class278.method2890(class276.field3123, field567.field1425);
            var63.field3177.method7843(arg1);
            var63.field3177.method7776(arg0);
            var63.field3177.method7831(arg4);
            field567.method2603(var63);
            field625 = 0;
            Statics.field3412 = Statics.method3181(arg1);
            field626 = arg0;
        }
        if (arg2 == 32) {
            class278 var64 = class278.method2890(class276.field3050, field567.field1425);
            var64.field3177.method7849(field677);
            var64.field3177.method7831(arg4);
            var64.field3177.method7842(Statics.field4347);
            var64.field3177.method7831(arg0);
            var64.field3177.method7841(arg1);
            field567.method2603(var64);
            field625 = 0;
            Statics.field3412 = Statics.method3181(arg1);
            field626 = arg0;
        }
        if (arg2 == 19) {
            field582 = arg7;
            field515 = arg8;
            field623 = 2;
            field601 = 0;
            field761 = arg0;
            field507 = arg1;
            class278 var65 = class278.method2890(class276.field3107, field567.field1425);
            var65.field3177.method7849(arg3);
            var65.field3177.method7820(field748.method3737(82) ? 1 : 0);
            var65.field3177.method7776(Statics.field4368 + arg1);
            var65.field3177.method7830(Statics.field1780 + arg0);
            field567.method2603(var65);
        }
        if (arg2 == 24) {
            class306 var66 = Statics.method3181(arg1);
            if (var66 != null) {
                boolean var67 = true;
                if (var66.field3643 > 0) {
                    var67 = method2451(var66);
                }
                if (var67) {
                    class278 var68 = class278.method2890(class276.field3134, field567.field1425);
                    var68.field3177.method7778(arg1);
                    field567.method2603(var68);
                }
            }
        }
        if (arg2 == 12) {
            class97 var69 = field753[arg3];
            if (var69 != null) {
                field582 = arg7;
                field515 = arg8;
                field623 = 2;
                field601 = 0;
                field761 = arg0;
                field507 = arg1;
                class278 var70 = class278.method2890(class276.field3103, field567.field1425);
                var70.field3177.method7821(field748.method3737(82) ? 1 : 0);
                var70.field3177.method7776(arg3);
                field567.method2603(var70);
            }
        }
        if (arg2 == 1004) {
            field582 = arg7;
            field515 = arg8;
            field623 = 2;
            field601 = 0;
            class278 var71 = class278.method2890(class276.field3133, field567.field1425);
            var71.field3177.method7830(Statics.field1780 + arg0);
            var71.field3177.method7776(Statics.field4368 + arg1);
            var71.field3177.method7831(arg3);
            field567.method2603(var71);
        }
        if (arg2 == 13) {
            class97 var72 = field753[arg3];
            if (var72 != null) {
                field582 = arg7;
                field515 = arg8;
                field623 = 2;
                field601 = 0;
                field761 = arg0;
                field507 = arg1;
                class278 var73 = class278.method2890(class276.field3068, field567.field1425);
                var73.field3177.method7831(arg3);
                var73.field3177.method7821(field748.method3737(82) ? 1 : 0);
                field567.method2603(var73);
            }
        }
        if (arg2 == 22) {
            field582 = arg7;
            field515 = arg8;
            field623 = 2;
            field601 = 0;
            field761 = arg0;
            field507 = arg1;
            class278 var74 = class278.method2890(class276.field3124, field567.field1425);
            var74.field3177.method7831(Statics.field4368 + arg1);
            var74.field3177.method7849(arg3);
            var74.field3177.method7820(field748.method3737(82) ? 1 : 0);
            var74.field3177.method7849(Statics.field1780 + arg0);
            field567.method2603(var74);
        }
        if (arg2 == 8) {
            class97 var75 = field753[arg3];
            if (var75 != null) {
                field582 = arg7;
                field515 = arg8;
                field623 = 2;
                field601 = 0;
                field761 = arg0;
                field507 = arg1;
                class278 var76 = class278.method2890(class276.field3054, field567.field1425);
                var76.field3177.method7830(field677);
                var76.field3177.method7831(arg3);
                var76.field3177.method7843(Statics.field4347);
                var76.field3177.method7830(field678);
                var76.field3177.method7822(field748.method3737(82) ? 1 : 0);
                field567.method2603(var76);
            }
        }
        if (arg2 == 45) {
            class89 var77 = field635[arg3];
            if (var77 != null) {
                field582 = arg7;
                field515 = arg8;
                field623 = 2;
                field601 = 0;
                field761 = arg0;
                field507 = arg1;
                class278 var78 = class278.method2890(class276.field3148, field567.field1425);
                var78.field3177.method7830(arg3);
                var78.field3177.method7789(field748.method3737(82) ? 1 : 0);
                field567.method2603(var78);
            }
        }
        if (arg2 == 40) {
            class278 var79 = class278.method2890(class276.field3140, field567.field1425);
            var79.field3177.method7776(arg0);
            var79.field3177.method7778(arg1);
            var79.field3177.method7849(arg4);
            field567.method2603(var79);
            field625 = 0;
            Statics.field3412 = Statics.method3181(arg1);
            field626 = arg0;
        }
        if (arg2 == 25) {
            class306 var80 = class306.method2472(arg1, arg0);
            if (var80 != null) {
                method5715();
                method456(arg1, arg0, class307.method2580(method3180(var80)), arg4);
                field674 = 0;
                field679 = method2110(var80);
                if (field679 == null) {
                    field679 = class326.field3819;
                }
                if (var80.field3541) {
                    field798 = var80.field3542 + class98.method2153(16777215);
                } else {
                    field798 = class98.method2153(65280) + var80.field3652 + class98.method2153(16777215);
                }
            }
            return;
        }
        if (arg2 == 1002) {
            field582 = arg7;
            field515 = arg8;
            field623 = 2;
            field601 = 0;
            class278 var81 = class278.method2890(class276.field3152, field567.field1425);
            var81.field3177.method7831(arg3);
            field567.method2603(var81);
        }
        if (arg2 == 1003) {
            field582 = arg7;
            field515 = arg8;
            field623 = 2;
            field601 = 0;
            class97 var82 = field753[arg3];
            if (var82 != null) {
                class187 var83 = var82.field1319;
                if (var83.field2059 != null) {
                    var83 = var83.method3323();
                }
                if (var83 != null) {
                    class278 var84 = class278.method2890(class276.field3104, field567.field1425);
                    var84.field3177.method7831(var83.field2026);
                    field567.method2603(var84);
                }
            }
        }
        if (arg2 == 2) {
            field582 = arg7;
            field515 = arg8;
            field623 = 2;
            field601 = 0;
            field761 = arg0;
            field507 = arg1;
            class278 var85 = class278.method2890(class276.field3153, field567.field1425);
            var85.field3177.method7831(Statics.field1780 + arg0);
            var85.field3177.method7849(field677);
            var85.field3177.method7842(Statics.field4347);
            var85.field3177.method7830(field678);
            var85.field3177.method7776(Statics.field4368 + arg1);
            var85.field3177.method7821(field748.method3737(82) ? 1 : 0);
            var85.field3177.method7830(arg3);
            field567.method2603(var85);
        }
        if (arg2 == 11) {
            class97 var86 = field753[arg3];
            if (var86 != null) {
                field582 = arg7;
                field515 = arg8;
                field623 = 2;
                field601 = 0;
                field761 = arg0;
                field507 = arg1;
                class278 var87 = class278.method2890(class276.field3141, field567.field1425);
                var87.field3177.method7830(arg3);
                var87.field3177.method7789(field748.method3737(82) ? 1 : 0);
                field567.method2603(var87);
            }
        }
        if (arg2 == 42) {
            class278 var88 = class278.method2890(class276.field3057, field567.field1425);
            var88.field3177.method7849(arg0);
            var88.field3177.method7849(arg4);
            var88.field3177.method7843(arg1);
            field567.method2603(var88);
            field625 = 0;
            Statics.field3412 = Statics.method3181(arg1);
            field626 = arg0;
        }
        if (arg2 == 50) {
            class89 var89 = field635[arg3];
            if (var89 != null) {
                field582 = arg7;
                field515 = arg8;
                field623 = 2;
                field601 = 0;
                field761 = arg0;
                field507 = arg1;
                class278 var90 = class278.method2890(class276.field3106, field567.field1425);
                var90.field3177.method7831(arg3);
                var90.field3177.method7822(field748.method3737(82) ? 1 : 0);
                field567.method2603(var90);
            }
        }
        if (field674 != 0) {
            field674 = 0;
            method1922(Statics.method3181(Statics.field4322));
        }
        if (field676) {
            method5715();
        }
        if (Statics.field3412 != null && field625 == 0) {
            method1922(Statics.field3412);
        }
    }

    @ObfuscatedName("ax.jo(ILjava/lang/String;B)V")
    public static void method819(int arg0, String arg1) {
        int var2 = class104.field1376;
        int[] var3 = class104.field1375;
        boolean var4 = false;
        class490 var5 = new class490(arg1, Statics.field986);
        for (int var6 = 0; var6 < var2; var6++) {
            class89 var7 = field635[var3[var6]];
            if (var7 != null && Statics.field1790 != var7 && var7.field1136 != null && var7.field1136.equals(var5)) {
                if (arg0 == 1) {
                    class278 var8 = class278.method2890(class276.field3092, field567.field1425);
                    var8.field3177.method7789(0);
                    var8.field3177.method7776(var3[var6]);
                    field567.method2603(var8);
                } else if (arg0 == 4) {
                    class278 var9 = class278.method2890(class276.field3048, field567.field1425);
                    var9.field3177.method7776(var3[var6]);
                    var9.field3177.method7822(0);
                    field567.method2603(var9);
                } else if (arg0 == 6) {
                    class278 var10 = class278.method2890(class276.field3067, field567.field1425);
                    var10.field3177.method7822(0);
                    var10.field3177.method7776(var3[var6]);
                    field567.method2603(var10);
                } else if (arg0 == 7) {
                    class278 var11 = class278.method2890(class276.field3106, field567.field1425);
                    var11.field3177.method7831(var3[var6]);
                    var11.field3177.method7822(0);
                    field567.method2603(var11);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class107.method3247(4, "", class326.field3979 + arg1);
        }
    }

    @ObfuscatedName("ar.jg(IIIII)V")
    public static void method456(int arg0, int arg1, int arg2, int arg3) {
        class306 var4 = class306.method2472(arg0, arg1);
        if (var4 != null && var4.field3634 != null) {
            class85 var5 = new class85();
            var5.field1077 = var4;
            var5.field1079 = var4.field3634;
            class68.method3219(var5);
        }
        field678 = arg3;
        field676 = true;
        Statics.field4347 = arg0;
        field677 = arg1;
        Statics.field125 = arg2;
        method1922(var4);
    }

    @ObfuscatedName("kd.jc(I)V")
    public static void method5715() {
        if (!field676) {
            return;
        }
        class306 var0 = class306.method2472(Statics.field4347, field677);
        if (var0 != null && var0.field3558 != null) {
            class85 var1 = new class85();
            var1.field1077 = var0;
            var1.field1079 = var0.field3558;
            class68.method3219(var1);
        }
        field678 = -1;
        field676 = false;
        method1922(var0);
    }

    @ObfuscatedName("ju.ja(III)V")
    public static void method4874(int arg0, int arg1) {
        class278 var2 = class278.method2890(class276.field3142, field567.field1425);
        var2.field3177.method7830(arg1);
        var2.field3177.method7778(arg0);
        field567.method2603(var2);
    }

    @ObfuscatedName("hk.js(IIIILjava/lang/String;I)V")
    public static void method4417(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class306 var5 = class306.method2472(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field3580 != null) {
            class85 var6 = new class85();
            var6.field1077 = var5;
            var6.field1080 = arg0;
            var6.field1084 = arg4;
            var6.field1079 = var5.field3580;
            class68.method3219(var6);
        }
        boolean var7 = true;
        if (var5.field3643 > 0) {
            var7 = method2451(var5);
        }
        if (!var7 || !class307.method4795(method3180(var5), arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            class278 var8 = class278.method2890(class276.field3061, field567.field1425);
            var8.field3177.method7778(arg1);
            var8.field3177.method7776(arg2);
            var8.field3177.method7776(arg3);
            field567.method2603(var8);
        }
        if (arg0 == 2) {
            class278 var9 = class278.method2890(class276.field3145, field567.field1425);
            var9.field3177.method7778(arg1);
            var9.field3177.method7776(arg2);
            var9.field3177.method7776(arg3);
            field567.method2603(var9);
        }
        if (arg0 == 3) {
            class278 var10 = class278.method2890(class276.field3071, field567.field1425);
            var10.field3177.method7778(arg1);
            var10.field3177.method7776(arg2);
            var10.field3177.method7776(arg3);
            field567.method2603(var10);
        }
        if (arg0 == 4) {
            class278 var11 = class278.method2890(class276.field3129, field567.field1425);
            var11.field3177.method7778(arg1);
            var11.field3177.method7776(arg2);
            var11.field3177.method7776(arg3);
            field567.method2603(var11);
        }
        if (arg0 == 5) {
            class278 var12 = class278.method2890(class276.field3073, field567.field1425);
            var12.field3177.method7778(arg1);
            var12.field3177.method7776(arg2);
            var12.field3177.method7776(arg3);
            field567.method2603(var12);
        }
        if (arg0 == 6) {
            class278 var13 = class278.method2890(class276.field3099, field567.field1425);
            var13.field3177.method7778(arg1);
            var13.field3177.method7776(arg2);
            var13.field3177.method7776(arg3);
            field567.method2603(var13);
        }
        if (arg0 == 7) {
            class278 var14 = class278.method2890(class276.field3080, field567.field1425);
            var14.field3177.method7778(arg1);
            var14.field3177.method7776(arg2);
            var14.field3177.method7776(arg3);
            field567.method2603(var14);
        }
        if (arg0 == 8) {
            class278 var15 = class278.method2890(class276.field3075, field567.field1425);
            var15.field3177.method7778(arg1);
            var15.field3177.method7776(arg2);
            var15.field3177.method7776(arg3);
            field567.method2603(var15);
        }
        if (arg0 == 9) {
            class278 var16 = class278.method2890(class276.field3077, field567.field1425);
            var16.field3177.method7778(arg1);
            var16.field3177.method7776(arg2);
            var16.field3177.method7776(arg3);
            field567.method2603(var16);
        }
        if (arg0 != 10) {
            return;
        }
        class278 var17 = class278.method2890(class276.field3082, field567.field1425);
        var17.field3177.method7778(arg1);
        var17.field3177.method7776(arg2);
        var17.field3177.method7776(arg3);
        field567.method2603(var17);
    }

    @ObfuscatedName("br.jy(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method1764(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method697(arg0, arg1, arg2, arg3, arg4, arg5, -1, false);
    }

    @ObfuscatedName("bl.kn(Ljava/lang/String;Ljava/lang/String;IIIIIB)V")
    public static final void method1093(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        method697(arg0, arg1, arg2, arg3, arg4, arg5, arg6, false);
    }

    @ObfuscatedName("al.ka(Ljava/lang/String;Ljava/lang/String;IIIIIZI)V")
    public static final void method697(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        if (field656 || field657 >= 500) {
            return;
        }
        field663[field657] = arg0;
        field544[field657] = arg1;
        field751[field657] = arg2;
        field621[field657] = arg3;
        field658[field657] = arg4;
        field651[field657] = arg5;
        field662[field657] = arg6;
        field665[field657] = arg7;
        field657++;
    }

    @ObfuscatedName("ay.km(II)Ljava/lang/String;")
    public static String method482(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (field544[arg0].length() > 0) {
            return field663[arg0] + class326.field3990 + field544[arg0];
        } else {
            return field663[arg0];
        }
    }

    @ObfuscatedName("s.kl(IIIII)V")
    public static final void method210(int arg0, int arg1, int arg2, int arg3) {
        if (field674 == 0 && !field676) {
            method1764(class326.field3985, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        long var4 = -1L;
        long var6 = -1L;
        int var8 = 0;
        while (true) {
            int var10 = class225.field2754;
            if (var8 >= var10) {
                if (var4 != -1L) {
                    int var11 = class225.method2893(var4);
                    int var12 = (int) (var4 >>> 7 & 0x7FL);
                    class89 var14 = field635[field647];
                    method4948(var14, field647, var11, var12);
                }
                return;
            }
            long var15 = class225.field2751[var8];
            if (var6 != var15) {
                label309: {
                    var6 = var15;
                    int var19 = class225.method2211(var8);
                    long var20 = class225.field2751[var8];
                    int var22 = (int) (var20 >>> 7 & 0x7FL);
                    int var24 = var22;
                    int var25 = class225.method4792(var8);
                    int var26 = Statics.method1994(var8);
                    if (var25 == 2 && Statics.field286.method4166(Statics.field4488, var19, var22, var15) >= 0) {
                        class196 var27 = class196.method3208(var26);
                        if (var27.field2194 != null) {
                            var27 = var27.method3560();
                        }
                        if (var27 == null) {
                            break label309;
                        }
                        class91 var28 = null;
                        for (class91 var29 = (class91) field738.method6086(); var29 != null; var29 = (class91) field738.method6088()) {
                            if (Statics.field4488 == var29.field1165 && var29.field1161 == var19 && var29.field1173 == var24 && var29.field1168 == var26) {
                                var28 = var29;
                                break;
                            }
                        }
                        if (field674 == 1) {
                            method1764(class326.field3980, field771 + " " + class98.field1330 + " " + class98.method2153(65535) + var27.field2163, 1, var26, var19, var24);
                        } else if (!field676) {
                            String[] var30 = var27.field2180;
                            if (var30 != null) {
                                for (int var31 = 4; var31 >= 0; var31--) {
                                    if ((var28 == null || var28.method2216(var31)) && var30[var31] != null) {
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
                                        method1764(var30[var31], class98.method2153(65535) + var27.field2163, var32, var26, var19, var24);
                                    }
                                }
                            }
                            method1764(class326.field4032, class98.method2153(65535) + var27.field2163, 1002, var27.field2160, var19, var24);
                        } else if ((Statics.field125 & 0x4) == 4) {
                            method1764(field679, field798 + " " + class98.field1330 + " " + class98.method2153(65535) + var27.field2163, 2, var26, var19, var24);
                        }
                    }
                    if (var25 == 1) {
                        class97 var33 = field753[var26];
                        if (var33 == null) {
                            break label309;
                        }
                        if (var33.field1319.field2035 == 1 && (var33.field1243 & 0x7F) == 64 && (var33.field1179 & 0x7F) == 64) {
                            for (int var34 = 0; var34 < field563; var34++) {
                                class97 var35 = field753[field719[var34]];
                                if (var35 != null && var33 != var35 && var35.field1319.field2035 == 1 && var33.field1243 == var35.field1243 && var33.field1179 == var35.field1179) {
                                    method704(var35, field719[var34], var19, var24);
                                }
                            }
                            int var36 = class104.field1376;
                            int[] var37 = class104.field1375;
                            for (int var38 = 0; var38 < var36; var38++) {
                                class89 var39 = field635[var37[var38]];
                                if (var39 != null && var33.field1243 == var39.field1243 && var33.field1179 == var39.field1179) {
                                    method4948(var39, var37[var38], var19, var24);
                                }
                            }
                        }
                        method704(var33, var26, var19, var24);
                    }
                    if (var25 == 0) {
                        class89 var40 = field635[var26];
                        if (var40 == null) {
                            break label309;
                        }
                        if ((var40.field1243 & 0x7F) == 64 && (var40.field1179 & 0x7F) == 64) {
                            for (int var41 = 0; var41 < field563; var41++) {
                                class97 var42 = field753[field719[var41]];
                                if (var42 != null && var42.field1319.field2035 == 1 && var40.field1243 == var42.field1243 && var40.field1179 == var42.field1179) {
                                    method704(var42, field719[var41], var19, var24);
                                }
                            }
                            int var43 = class104.field1376;
                            int[] var44 = class104.field1375;
                            for (int var45 = 0; var45 < var43; var45++) {
                                class89 var46 = field635[var44[var45]];
                                if (var46 != null && var40 != var46 && var40.field1243 == var46.field1243 && var40.field1179 == var46.field1179) {
                                    method4948(var46, var44[var45], var19, var24);
                                }
                            }
                        }
                        if (field647 == var26) {
                            var4 = var15;
                        } else {
                            method4948(var40, var26, var19, var24);
                        }
                    }
                    if (var25 == 3) {
                        class352 var47 = field648[Statics.field4488][var19][var24];
                        if (var47 != null) {
                            for (class101 var48 = (class101) var47.method6087(); var48 != null; var48 = (class101) var47.method6099()) {
                                class197 var49 = class197.method3345(var48.field1360);
                                if (field674 == 1) {
                                    method1764(class326.field3980, field771 + " " + class98.field1330 + " " + class98.method2153(16748608) + var49.field2215, 16, var48.field1360, var19, var24);
                                } else if (!field676) {
                                    String[] var50 = var49.field2213;
                                    for (int var51 = 4; var51 >= 0; var51--) {
                                        if (var48.method2476(var51)) {
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
                                                method1764(var50[var51], class98.method2153(16748608) + var49.field2215, var52, var48.field1360, var19, var24);
                                            } else if (var51 == 2) {
                                                method1764(class326.field4065, class98.method2153(16748608) + var49.field2215, 20, var48.field1360, var19, var24);
                                            }
                                        }
                                    }
                                    method1764(class326.field4032, class98.method2153(16748608) + var49.field2215, 1004, var48.field1360, var19, var24);
                                } else if ((Statics.field125 & 0x1) == 1) {
                                    method1764(field679, field798 + " " + class98.field1330 + " " + class98.method2153(16748608) + var49.field2215, 17, var48.field1360, var19, var24);
                                }
                            }
                        }
                    }
                }
            }
            var8++;
        }
    }

    @ObfuscatedName("ag.kg(Lcg;IIIB)V")
    public static final void method704(class97 arg0, int arg1, int arg2, int arg3) {
        class187 var4 = arg0.field1319;
        if (field657 >= 400) {
            return;
        }
        if (var4.field2059 != null) {
            var4 = var4.method3323();
        }
        if (var4 == null || !var4.field2062 || var4.field2064 && field701 != arg1) {
            return;
        }
        String var5 = arg0.method2408();
        if (var4.field2052 != 0 && arg0.field1254 != 0) {
            int var6 = arg0.field1254 == -1 ? var4.field2052 : arg0.field1254;
            var5 = var5 + method2824(var6, Statics.field1790.field1127) + " " + class98.field1324 + class326.field3986 + var6 + class98.field1328;
        }
        if (var4.field2064 && field666) {
            method1764(class326.field4032, class98.method2153(16776960) + var5, 1003, arg1, arg2, arg3);
        }
        if (field674 == 1) {
            method1764(class326.field3980, field771 + " " + class98.field1330 + " " + class98.method2153(16776960) + var5, 7, arg1, arg2, arg3);
        } else if (!field676) {
            int var7 = var4.field2064 && field666 ? 2000 : 0;
            String[] var8 = var4.field2050;
            if (var8 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (arg0.method2444(var9) && var8[var9] != null && !var8[var9].equalsIgnoreCase(class326.field3982)) {
                        int var10 = 0;
                        if (var9 == 0) {
                            var10 = var7 + 9;
                        }
                        if (var9 == 1) {
                            var10 = var7 + 10;
                        }
                        if (var9 == 2) {
                            var10 = var7 + 11;
                        }
                        if (var9 == 3) {
                            var10 = var7 + 12;
                        }
                        if (var9 == 4) {
                            var10 = var7 + 13;
                        }
                        method1764(var8[var9], class98.method2153(16776960) + var5, var10, arg1, arg2, arg3);
                    }
                }
            }
            if (var8 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (arg0.method2444(var11) && var8[var11] != null && var8[var11].equalsIgnoreCase(class326.field3982)) {
                        short var12 = 0;
                        if (field755 != class100.field1346) {
                            if (field755 == class100.field1344 || field755 == class100.field1350 && var4.field2052 > Statics.field1790.field1127) {
                                var12 = 2000;
                            }
                            int var13 = 0;
                            if (var11 == 0) {
                                var13 = var12 + 9;
                            }
                            if (var11 == 1) {
                                var13 = var12 + 10;
                            }
                            if (var11 == 2) {
                                var13 = var12 + 11;
                            }
                            if (var11 == 3) {
                                var13 = var12 + 12;
                            }
                            if (var11 == 4) {
                                var13 = var12 + 13;
                            }
                            method1764(var8[var11], class98.method2153(16776960) + var5, var13, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!var4.field2064 || !field666) {
                method1764(class326.field4032, class98.method2153(16776960) + var5, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field125 & 0x2) == 2) {
            method1764(field679, field798 + " " + class98.field1330 + " " + class98.method2153(16776960) + var5, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("jf.kc(Lcj;IIII)V")
    public static final void method4948(class89 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field1790 == arg0 || field657 >= 400) {
            return;
        }
        String var4;
        if (arg0.field1128 == 0) {
            var4 = arg0.field1146[0] + arg0.field1136 + arg0.field1146[1] + method2824(arg0.field1127, Statics.field1790.field1127) + " " + class98.field1324 + class326.field3986 + arg0.field1127 + class98.field1328 + arg0.field1146[2];
        } else {
            var4 = arg0.field1146[0] + arg0.field1136 + arg0.field1146[1] + " " + class98.field1324 + class326.field4124 + arg0.field1128 + class98.field1328 + arg0.field1146[2];
        }
        if (field674 == 1) {
            method1764(class326.field3980, field771 + " " + class98.field1330 + " " + class98.method2153(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field676) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field644[var5] != null) {
                    short var6 = 0;
                    if (field644[var5].equalsIgnoreCase(class326.field3982)) {
                        if (field534 == class100.field1346) {
                            continue;
                        }
                        if (field534 == class100.field1344 || field534 == class100.field1350 && arg0.field1127 > Statics.field1790.field1127) {
                            var6 = 2000;
                        }
                        if (Statics.field1790.field1126 == 0 || arg0.field1126 == 0) {
                            if (field534 == class100.field1347 && arg0.method2172()) {
                                var6 = 2000;
                            }
                        } else if (Statics.field1790.field1126 == arg0.field1126) {
                            var6 = 2000;
                        } else {
                            var6 = 0;
                        }
                    } else if (field645[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field643[var5] + var6;
                    method1764(field644[var5], class98.method2153(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field125 & 0x8) == 8) {
            method1764(field679, field798 + " " + class98.field1330 + " " + class98.method2153(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field657; var9++) {
            if (field751[var9] == 23) {
                field544[var9] = class98.method2153(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("du.kx(IIB)Ljava/lang/String;")
    public static final String method2824(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class98.method2153(16711680);
        } else if (var2 < -6) {
            return class98.method2153(16723968);
        } else if (var2 < -3) {
            return class98.method2153(16740352);
        } else if (var2 < 0) {
            return class98.method2153(16756736);
        } else if (var2 > 9) {
            return class98.method2153(65280);
        } else if (var2 > 6) {
            return class98.method2153(4259584);
        } else if (var2 > 3) {
            return class98.method2153(8453888);
        } else if (var2 > 0) {
            return class98.method2153(12648192);
        } else {
            return class98.method2153(16776960);
        }
    }

    @ObfuscatedName("ce.ke(IIIIIIIII)V")
    public static final void method2392(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class306.method2497(arg0)) {
            Statics.field269 = null;
            method479(Statics.field914[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field269 != null) {
                method479(Statics.field269, -1412584499, arg1, arg2, arg3, arg4, Statics.field1692, Statics.field1990, arg7);
                Statics.field269 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field732[var8] = true;
            }
        } else {
            field732[arg7] = true;
        }
    }

    @ObfuscatedName("ay.kv([Lkd;IIIIIIIIB)V")
    public static final void method479(class306[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class477.method8112(arg2, arg3, arg4, arg5);
        class213.method3926();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class306 var10 = arg0[var9];
            if (var10 != null && (var10.field3561 == arg1 || arg1 == -1412584499 && field694 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field735[field730] = var10.field3555 + arg6;
                    field736[field730] = var10.field3556 + arg7;
                    field723[field730] = var10.field3557;
                    field535[field730] = var10.field3617;
                    var11 = ++field730 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field3691 = var11;
                var10.field3692 = field519;
                if (!var10.field3541 || !method1710(var10)) {
                    if (var10.field3643 > 0) {
                        method7158(var10);
                    }
                    int var12 = var10.field3555 + arg6;
                    int var13 = var10.field3556 + arg7;
                    int var14 = var10.field3676;
                    if (field694 == var10) {
                        if (arg1 != -1412584499 && !var10.field3632) {
                            Statics.field269 = arg0;
                            Statics.field1692 = arg6;
                            Statics.field1990 = arg7;
                            continue;
                        }
                        if (field705 && field746) {
                            int var15 = class37.field254;
                            int var16 = class37.field249;
                            int var17 = var15 - field696;
                            int var18 = var16 - field697;
                            if (var17 < field700) {
                                var17 = field700;
                            }
                            if (var10.field3557 + var17 > field700 + field695.field3557) {
                                var17 = field700 + field695.field3557 - var10.field3557;
                            }
                            if (var18 < field614) {
                                var18 = field614;
                            }
                            if (var10.field3617 + var18 > field614 + field695.field3617) {
                                var18 = field614 + field695.field3617 - var10.field3617;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field3632) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field3679 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field3679 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field3557 + var12;
                        int var26 = var10.field3617 + var13;
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
                        int var29 = var10.field3557 + var12;
                        int var30 = var10.field3617 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field3541 || var19 < var21 && var20 < var22) {
                        if (var10.field3643 != 0) {
                            if (var10.field3643 == 1336) {
                                if (Statics.field2126.method2292()) {
                                    var13 += 15;
                                    Statics.field2957.method6527("Fps:" + field217, var10.field3557 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 327680 && !field562) {
                                        var33 = 16711680;
                                    }
                                    Statics.field2957.method6527("Mem:" + var32 + "k", var10.field3557 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field3643 == 1337) {
                                field670 = var12;
                                field671 = var13;
                                method1993(var12, var13, var10.field3557, var10.field3617);
                                field732[var10.field3691] = true;
                                class477.method8112(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3643 == 1338) {
                                method2168(var10, var12, var13, var11);
                                class477.method8112(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3643 == 1339) {
                                method857(var10, var12, var13, var11);
                                class477.method8112(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3643 == 1400) {
                                Statics.field1973.method7288(var12, var13, var10.field3557, var10.field3617, field519);
                            }
                            if (var10.field3643 == 1401) {
                                Statics.field1973.method7319(var12, var13, var10.field3557, var10.field3617);
                            }
                            if (var10.field3643 == 1402) {
                                Statics.field1783.method2245(var12, field519);
                            }
                        }
                        if (var10.field3679 == 0) {
                            if (!var10.field3541 && method1710(var10) && Statics.field3017 != var10) {
                                continue;
                            }
                            if (!var10.field3541) {
                                if (var10.field3564 > var10.field3566 - var10.field3617) {
                                    var10.field3564 = var10.field3566 - var10.field3617;
                                }
                                if (var10.field3564 < 0) {
                                    var10.field3564 = 0;
                                }
                            }
                            method479(arg0, var10.field3635, var19, var20, var21, var22, var12 - var10.field3570, var13 - var10.field3564, var11);
                            if (var10.field3684 != null) {
                                method479(var10.field3684, var10.field3635, var19, var20, var21, var22, var12 - var10.field3570, var13 - var10.field3564, var11);
                            }
                            class84 var34 = (class84) field682.method7535((long) var10.field3635);
                            if (var34 != null) {
                                method2392(var34.field1072, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class477.method8112(arg2, arg3, arg4, arg5);
                            class213.method3926();
                        } else if (var10.field3679 == 11) {
                            if (method1710(var10) && Statics.field3017 != var10) {
                                continue;
                            }
                            if (var10.field3684 != null) {
                                method479(var10.field3684, var10.field3635, var19, var20, var21, var22, var12 - var10.field3570, var13 - var10.field3564, var11);
                            }
                            class477.method8112(arg2, arg3, arg4, arg5);
                            class213.method3926();
                        }
                        if (field741 || field734[var11] || field763 > 1) {
                            if (var10.field3679 == 0 && !var10.field3541 && var10.field3566 > var10.field3617) {
                                method1862(var10.field3557 + var12, var13, var10.field3564, var10.field3617, var10.field3566);
                            }
                            if (var10.field3679 != 1) {
                                if (var10.field3679 == 2) {
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < var10.field3572; var36++) {
                                        for (int var37 = 0; var37 < var10.field3553; var37++) {
                                            int var38 = (var10.field3663 + 32) * var37 + var12;
                                            int var39 = (var10.field3594 + 32) * var36 + var13;
                                            if (var35 < 20) {
                                                var38 += var10.field3612[var35];
                                                var39 += var10.field3524[var35];
                                            }
                                            if (var10.field3535[var35] > 0) {
                                                boolean var40 = false;
                                                boolean var41 = false;
                                                int var42 = var10.field3535[var35] - 1;
                                                if (var38 + 32 > arg2 && var38 < arg4 && var39 + 32 > arg3 && var39 < arg5 || Statics.field4390 == var10 && field619 == var35) {
                                                    class481 var43;
                                                    if (field674 == 1 && Statics.field1364 == var35 && Statics.field4322 == var10.field3635) {
                                                        var43 = class197.method3731(var42, var10.field3581[var35], 2, 0, 2, false);
                                                    } else {
                                                        var43 = class197.method3731(var42, var10.field3581[var35], 1, 3153952, 2, false);
                                                    }
                                                    if (var43 == null) {
                                                        method1922(var10);
                                                    } else if (Statics.field4390 == var10 && field619 == var35) {
                                                        int var44 = class37.field254 - field628;
                                                        int var45 = class37.field249 - field629;
                                                        if (var44 < 5 && var44 > -5) {
                                                            var44 = 0;
                                                        }
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (field632 < 5) {
                                                            var44 = 0;
                                                            var45 = 0;
                                                        }
                                                        var43.method8271(var38 + var44, var39 + var45, 128);
                                                        if (arg1 != -1) {
                                                            class306 var46 = arg0[arg1 & 0xFFFF];
                                                            if (var39 + var45 < class477.field4987 && var46.field3564 > 0) {
                                                                int var47 = field564 * (class477.field4987 - var39 - var45) / 3;
                                                                if (var47 > field564 * 10) {
                                                                    var47 = field564 * 10;
                                                                }
                                                                if (var47 > var46.field3564) {
                                                                    var47 = var46.field3564;
                                                                }
                                                                var46.field3564 -= var47;
                                                                field629 += var47;
                                                                method1922(var46);
                                                            }
                                                            if (var39 + var45 + 32 > class477.field4988 && var46.field3564 < var46.field3566 - var46.field3617) {
                                                                int var48 = field564 * (var39 + var45 + 32 - class477.field4988) / 3;
                                                                if (var48 > field564 * 10) {
                                                                    var48 = field564 * 10;
                                                                }
                                                                if (var48 > var46.field3566 - var46.field3617 - var46.field3564) {
                                                                    var48 = var46.field3566 - var46.field3617 - var46.field3564;
                                                                }
                                                                var46.field3564 += var48;
                                                                field629 -= var48;
                                                                method1922(var46);
                                                            }
                                                        }
                                                    } else if (Statics.field3412 == var10 && field626 == var35) {
                                                        var43.method8271(var38, var39, 128);
                                                    } else {
                                                        var43.method8252(var38, var39);
                                                    }
                                                }
                                            } else if (var10.field3614 != null && var35 < 20) {
                                                class481 var49 = var10.method5577(var35);
                                                if (var49 != null) {
                                                    var49.method8252(var38, var39);
                                                } else if (class306.field3540) {
                                                    method1922(var10);
                                                }
                                            }
                                            var35++;
                                        }
                                    }
                                } else if (var10.field3679 == 3) {
                                    int var50;
                                    if (method371(var10)) {
                                        var50 = var10.field3688;
                                        if (Statics.field3017 == var10 && var10.field3608 != 0) {
                                            var50 = var10.field3608;
                                        }
                                    } else {
                                        var50 = var10.field3567;
                                        if (Statics.field3017 == var10 && var10.field3549 != 0) {
                                            var50 = var10.field3549;
                                        }
                                    }
                                    if (var10.field3571) {
                                        switch(var10.field3589.field4996) {
                                            case 1:
                                                class477.method8121(var12, var13, var10.field3557, var10.field3617, var10.field3567, var10.field3688);
                                                break;
                                            case 2:
                                                class477.method8122(var12, var13, var10.field3557, var10.field3617, var10.field3567, var10.field3688, 255 - (var10.field3676 & 0xFF), 255 - (var10.field3574 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class477.method8120(var12, var13, var10.field3557, var10.field3617, var50);
                                                } else {
                                                    class477.method8171(var12, var13, var10.field3557, var10.field3617, var50, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class477.method8111(var12, var13, var10.field3557, var10.field3617, var50);
                                    } else {
                                        class477.method8144(var12, var13, var10.field3557, var10.field3617, var50, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field3679 == 4) {
                                    class368 var51 = var10.method5694();
                                    if (var51 != null) {
                                        String var52 = var10.field3604;
                                        int var53;
                                        if (method371(var10)) {
                                            var53 = var10.field3688;
                                            if (Statics.field3017 == var10 && var10.field3608 != 0) {
                                                var53 = var10.field3608;
                                            }
                                            if (var10.field3645.length() > 0) {
                                                var52 = var10.field3645;
                                            }
                                        } else {
                                            var53 = var10.field3567;
                                            if (Statics.field3017 == var10 && var10.field3549 != 0) {
                                                var53 = var10.field3549;
                                            }
                                        }
                                        if (var10.field3541 && var10.field3547 != -1) {
                                            class197 var54 = class197.method3345(var10.field3547);
                                            var52 = var54.field2215;
                                            if (var52 == null) {
                                                var52 = class326.field3819;
                                            }
                                            if ((var54.field2226 == 1 || var10.field3681 != 1) && var10.field3681 != -1) {
                                                var52 = class98.method2153(16748608) + var52 + class98.field1331 + " " + 'x' + method7486(var10.field3681);
                                            }
                                        }
                                        if (field687 == var10) {
                                            var52 = class326.field3959;
                                            var53 = var10.field3567;
                                        }
                                        if (!var10.field3541) {
                                            var52 = method3281(var52, var10);
                                        }
                                        var51.method6529(var52, var12, var13, var10.field3557, var10.field3617, var53, var10.field3609 ? 0 : -1, var10.field3607, var10.field3670, var10.field3606);
                                    } else if (class306.field3540) {
                                        method1922(var10);
                                    }
                                } else if (var10.field3679 == 5) {
                                    if (var10.field3541) {
                                        class481 var56;
                                        if (var10.field3547 == -1) {
                                            var56 = var10.method5571(false, Statics.field1850);
                                        } else {
                                            var56 = class197.method3731(var10.field3547, var10.field3681, var10.field3582, var10.field3647, var10.field3602, false);
                                        }
                                        if (var56 != null) {
                                            int var57 = var56.field5015;
                                            int var58 = var56.field5016;
                                            if (var10.field3559) {
                                                class477.method8113(var12, var13, var10.field3557 + var12, var10.field3617 + var13);
                                                int var59 = (var10.field3557 + (var57 - 1)) / var57;
                                                int var60 = (var10.field3617 + (var58 - 1)) / var58;
                                                for (int var61 = 0; var61 < var59; var61++) {
                                                    for (int var62 = 0; var62 < var60; var62++) {
                                                        if (var10.field3531 != 0) {
                                                            var56.method8254(var57 / 2 + var57 * var61 + var12, var58 / 2 + var58 * var62 + var13, var10.field3531, 4096);
                                                        } else if (var14 == 0) {
                                                            var56.method8252(var57 * var61 + var12, var58 * var62 + var13);
                                                        } else {
                                                            var56.method8271(var57 * var61 + var12, var58 * var62 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class477.method8112(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var63 = var10.field3557 * 4096 / var57;
                                                if (var10.field3531 != 0) {
                                                    var56.method8254(var10.field3557 / 2 + var12, var10.field3617 / 2 + var13, var10.field3531, var63);
                                                } else if (var14 != 0) {
                                                    var56.method8257(var12, var13, var10.field3557, var10.field3617, 256 - (var14 & 0xFF));
                                                } else if (var10.field3557 == var57 && var10.field3617 == var58) {
                                                    var56.method8252(var12, var13);
                                                } else {
                                                    var56.method8238(var12, var13, var10.field3557, var10.field3617);
                                                }
                                            }
                                        } else if (class306.field3540) {
                                            method1922(var10);
                                        }
                                    } else {
                                        class481 var55 = var10.method5571(method371(var10), Statics.field1850);
                                        if (var55 != null) {
                                            var55.method8252(var12, var13);
                                        } else if (class306.field3540) {
                                            method1922(var10);
                                        }
                                    }
                                } else if (var10.field3679 == 6) {
                                    boolean var64 = method371(var10);
                                    int var65;
                                    if (var64) {
                                        var65 = var10.field3591;
                                    } else {
                                        var65 = var10.field3625;
                                    }
                                    class224 var66 = null;
                                    int var67 = 0;
                                    if (var10.field3547 != -1) {
                                        class197 var68 = class197.method3345(var10.field3547);
                                        if (var68 != null) {
                                            class197 var69 = var68.method3583(var10.field3681);
                                            var66 = var69.method3582(1);
                                            if (var66 == null) {
                                                method1922(var10);
                                            } else {
                                                var66.method4301();
                                                var67 = var66.field2603 / 2;
                                            }
                                        }
                                    } else if (var10.field3586 != 5) {
                                        class187 var70 = null;
                                        class186 var71 = null;
                                        if (var10.field3586 == 6) {
                                            int var72 = var10.field3605;
                                            if (var72 >= 0 && var72 < field753.length) {
                                                class97 var73 = field753[var72];
                                                if (var73 != null) {
                                                    var70 = var73.field1319;
                                                    var71 = var73.method2416();
                                                }
                                            }
                                        }
                                        class199 var74 = null;
                                        int var75 = -1;
                                        if (var65 != -1) {
                                            var74 = class199.method4223(var65);
                                            var75 = var10.field3682;
                                        }
                                        var66 = var10.method5642(var74, var75, var64, Statics.field1790.field1123, var70, var71);
                                        if (var66 == null && class306.field3540) {
                                            method1922(var10);
                                        }
                                    } else if (var10.field3605 == 0) {
                                        var66 = field552.method5263((class199) null, -1, (class199) null, -1);
                                    } else {
                                        var66 = Statics.field1790.method1915();
                                    }
                                    class213.method4008(var10.field3557 / 2 + var12, var10.field3617 / 2 + var13);
                                    int var76 = var10.field3525 * class213.field2486[var10.field3610] >> 16;
                                    int var77 = var10.field3525 * class213.field2509[var10.field3610] >> 16;
                                    if (var66 != null) {
                                        if (var10.field3541) {
                                            var66.method4301();
                                            if (var10.field3600) {
                                                var66.method4319(0, var10.field3597, var10.field3596, var10.field3610, var10.field3592, var10.field3687 + var67 + var76, var10.field3687 + var77, var10.field3525);
                                            } else {
                                                var66.method4292(0, var10.field3597, var10.field3596, var10.field3610, var10.field3592, var10.field3687 + var67 + var76, var10.field3687 + var77);
                                            }
                                        } else {
                                            var66.method4292(0, var10.field3597, 0, var10.field3610, 0, var76, var77);
                                        }
                                    }
                                    class213.method3929();
                                } else {
                                    if (var10.field3679 == 7) {
                                        class368 var78 = var10.method5694();
                                        if (var78 == null) {
                                            if (class306.field3540) {
                                                method1922(var10);
                                            }
                                            continue;
                                        }
                                        int var79 = 0;
                                        for (int var80 = 0; var80 < var10.field3572; var80++) {
                                            for (int var81 = 0; var81 < var10.field3553; var81++) {
                                                if (var10.field3535[var79] > 0) {
                                                    class197 var82 = class197.method3345(var10.field3535[var79] - 1);
                                                    String var83;
                                                    if (var82.field2226 != 1 && var10.field3581[var79] == 1) {
                                                        var83 = class98.method2153(16748608) + var82.field2215 + class98.field1331;
                                                    } else {
                                                        var83 = class98.method2153(16748608) + var82.field2215 + class98.field1331 + " " + 'x' + method7486(var10.field3581[var79]);
                                                    }
                                                    int var84 = (var10.field3663 + 115) * var81 + var12;
                                                    int var85 = (var10.field3594 + 12) * var80 + var13;
                                                    if (var10.field3607 == 0) {
                                                        var78.method6525(var83, var84, var85, var10.field3567, var10.field3609 ? 0 : -1);
                                                    } else if (var10.field3607 == 1) {
                                                        var78.method6528(var83, var10.field3557 / 2 + var84, var85, var10.field3567, var10.field3609 ? 0 : -1);
                                                    } else {
                                                        var78.method6527(var83, var10.field3557 + var84 - 1, var85, var10.field3567, var10.field3609 ? 0 : -1);
                                                    }
                                                }
                                                var79++;
                                            }
                                        }
                                    }
                                    if (var10.field3679 == 8 && Statics.field4471 == var10 && field554 == field522) {
                                        int var86 = 0;
                                        int var87 = 0;
                                        class368 var88 = Statics.field2957;
                                        String var89 = var10.field3604;
                                        String var90 = method3281(var89, var10);
                                        while (var90.length() > 0) {
                                            int var91 = var90.indexOf(class98.field1327);
                                            String var92;
                                            if (var91 == -1) {
                                                var92 = var90;
                                                var90 = "";
                                            } else {
                                                var92 = var90.substring(0, var91);
                                                var90 = var90.substring(var91 + 4);
                                            }
                                            int var93 = var88.method6568(var92);
                                            if (var93 > var86) {
                                                var86 = var93;
                                            }
                                            var87 += var88.field4408 + 1;
                                        }
                                        var86 += 6;
                                        var87 += 7;
                                        int var94 = var10.field3557 + var12 - 5 - var86;
                                        int var95 = var10.field3617 + var13 + 5;
                                        if (var94 < var12 + 5) {
                                            var94 = var12 + 5;
                                        }
                                        if (var86 + var94 > arg4) {
                                            var94 = arg4 - var86;
                                        }
                                        if (var87 + var95 > arg5) {
                                            var95 = arg5 - var87;
                                        }
                                        class477.method8120(var94, var95, var86, var87, 16777120);
                                        class477.method8111(var94, var95, var86, var87, 0);
                                        String var96 = var10.field3604;
                                        int var97 = var88.field4408 + var95 + 2;
                                        String var98 = method3281(var96, var10);
                                        while (var98.length() > 0) {
                                            int var99 = var98.indexOf(class98.field1327);
                                            String var100;
                                            if (var99 == -1) {
                                                var100 = var98;
                                                var98 = "";
                                            } else {
                                                var100 = var98.substring(0, var99);
                                                var98 = var98.substring(var99 + 4);
                                            }
                                            var88.method6525(var100, var94 + 3, var97, 0, -1);
                                            var97 += var88.field4408 + 1;
                                        }
                                    }
                                    if (var10.field3679 == 9) {
                                        int var101;
                                        int var102;
                                        int var103;
                                        int var104;
                                        if (var10.field3576) {
                                            var101 = var12;
                                            var102 = var10.field3617 + var13;
                                            var103 = var10.field3557 + var12;
                                            var104 = var13;
                                        } else {
                                            var101 = var12;
                                            var102 = var13;
                                            var103 = var10.field3557 + var12;
                                            var104 = var10.field3617 + var13;
                                        }
                                        if (var10.field3575 == 1) {
                                            class477.method8155(var101, var102, var103, var104, var10.field3567);
                                        } else {
                                            Statics.method6942(var101, var102, var103, var104, var10.field3567, var10.field3575);
                                        }
                                    } else if (var10.field3679 == 12) {
                                        class304 var105 = var10.method5581();
                                        class299 var106 = var10.method5707();
                                        if (var105 != null && var106 != null && var105.method5476()) {
                                            class368 var107 = var10.method5694();
                                            if (var107 != null) {
                                                field506.method8376(var12, var13, var10.field3557, var10.field3617, var105.method5351(), var105.method5352(), 0, 0, var105.method5348(), var105.method5327(), var105.method5347());
                                                int var108 = var10.field3609 ? var10.field3647 : -1;
                                                if (!var105.method5377() && var105.method5418().method6467()) {
                                                    field506.method8368(var106.field3456, var108, var106.field3455, var106.field3457);
                                                    field506.method8367(var105.method5307(), var107);
                                                } else {
                                                    field506.method8368(var10.field3567, var108, var106.field3455, var106.field3457);
                                                    field506.method8367(var105.method5418(), var107);
                                                }
                                                class477.method8112(arg2, arg3, arg4, arg5);
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

    @ObfuscatedName("fw.ky(Ljava/lang/String;Lkd;I)Ljava/lang/String;")
    public static String method3281(String arg0, class306 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method1917(arg1, var2 - 1);
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

    @ObfuscatedName("pt.kr(II)Ljava/lang/String;")
    public static final String method7486(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class98.field1325 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class98.method2153(65408) + var1.substring(0, var1.length() - 8) + class326.field3991 + " " + class98.field1324 + var1 + class98.field1328 + class98.field1331;
        } else if (var1.length() > 6) {
            return " " + class98.method2153(16777215) + var1.substring(0, var1.length() - 4) + class326.field3993 + " " + class98.field1324 + var1 + class98.field1328 + class98.field1331;
        } else {
            return " " + class98.method2153(16776960) + var1 + class98.field1331;
        }
    }

    @ObfuscatedName("client.kb(ZI)V")
    public final void method1627(boolean arg0) {
        method6679(field681, Statics.field2331, Statics.field4300, arg0);
    }

    @ObfuscatedName("client.kp(Lkd;I)V")
    public void method1620(class306 arg0) {
        class306 var2 = arg0.field3561 == -1 ? null : Statics.method3181(arg0.field3561);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field2331;
            var4 = Statics.field4300;
        } else {
            var3 = var2.field3557;
            var4 = var2.field3617;
        }
        method2203(arg0, var3, var4, false);
        method2210(arg0, var3, var4);
    }

    @ObfuscatedName("fh.ku([Lkd;Lkd;ZI)V")
    public static void method3169(class306[] arg0, class306 arg1, boolean arg2) {
        int var3 = arg1.field3565 == 0 ? arg1.field3557 : arg1.field3565;
        int var4 = arg1.field3566 == 0 ? arg1.field3617 : arg1.field3566;
        method2131(arg0, arg1.field3635, var3, var4, arg2);
        if (arg1.field3684 != null) {
            method2131(arg1.field3684, arg1.field3635, var3, var4, arg2);
        }
        class84 var5 = (class84) field682.method7535((long) arg1.field3635);
        if (var5 != null) {
            method6679(var5.field1072, var3, var4, arg2);
        }
        if (arg1.field3643 == 1337) {
        }
    }

    @ObfuscatedName("nf.kt(IIIZB)V")
    public static final void method6679(int arg0, int arg1, int arg2, boolean arg3) {
        if (class306.method2497(arg0)) {
            method2131(Statics.field914[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("cc.ko([Lkd;IIIZI)V")
    public static void method2131(class306[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class306 var6 = arg0[var5];
            if (var6 != null && var6.field3561 == arg1) {
                method2203(var6, arg2, arg3, arg4);
                method2210(var6, arg2, arg3);
                if (var6.field3570 > var6.field3565 - var6.field3557) {
                    var6.field3570 = var6.field3565 - var6.field3557;
                }
                if (var6.field3570 < 0) {
                    var6.field3570 = 0;
                }
                if (var6.field3564 > var6.field3566 - var6.field3617) {
                    var6.field3564 = var6.field3566 - var6.field3617;
                }
                if (var6.field3564 < 0) {
                    var6.field3564 = 0;
                }
                if (var6.field3679 == 0) {
                    method3169(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("cj.ki(Lkd;IIZI)V")
    public static void method2203(class306 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field3557;
        int var5 = arg0.field3617;
        if (arg0.field3548 == 0) {
            arg0.field3557 = arg0.field3553;
        } else if (arg0.field3548 == 1) {
            arg0.field3557 = arg1 - arg0.field3553;
        } else if (arg0.field3548 == 2) {
            arg0.field3557 = arg0.field3553 * arg1 >> 14;
        }
        if (arg0.field3550 == 0) {
            arg0.field3617 = arg0.field3572;
        } else if (arg0.field3550 == 1) {
            arg0.field3617 = arg2 - arg0.field3572;
        } else if (arg0.field3550 == 2) {
            arg0.field3617 = arg0.field3572 * arg2 >> 14;
        }
        if (arg0.field3548 == 4) {
            arg0.field3557 = arg0.field3662 * arg0.field3617 / arg0.field3560;
        }
        if (arg0.field3550 == 4) {
            arg0.field3617 = arg0.field3560 * arg0.field3557 / arg0.field3662;
        }
        if (arg0.field3643 == 1337) {
            field770 = arg0;
        }
        if (arg0.field3679 == 12) {
            arg0.method5581().method5299(arg0.field3557, arg0.field3617);
        }
        if (arg3 && arg0.field3668 != null && (arg0.field3557 != var4 || arg0.field3617 != var5)) {
            class85 var6 = new class85();
            var6.field1077 = arg0;
            var6.field1079 = arg0.field3668;
            field583.method6081(var6);
        }
    }

    @ObfuscatedName("cn.kz(Lkd;IIB)V")
    public static void method2210(class306 arg0, int arg1, int arg2) {
        if (arg0.field3590 == 0) {
            arg0.field3555 = arg0.field3551;
        } else if (arg0.field3590 == 1) {
            arg0.field3555 = (arg1 - arg0.field3557) / 2 + arg0.field3551;
        } else if (arg0.field3590 == 2) {
            arg0.field3555 = arg1 - arg0.field3557 - arg0.field3551;
        } else if (arg0.field3590 == 3) {
            arg0.field3555 = arg0.field3551 * arg1 >> 14;
        } else if (arg0.field3590 == 4) {
            arg0.field3555 = (arg0.field3551 * arg1 >> 14) + (arg1 - arg0.field3557) / 2;
        } else {
            arg0.field3555 = arg1 - arg0.field3557 - (arg0.field3551 * arg1 >> 14);
        }
        if (arg0.field3689 == 0) {
            arg0.field3556 = arg0.field3552;
        } else if (arg0.field3689 == 1) {
            arg0.field3556 = (arg2 - arg0.field3617) / 2 + arg0.field3552;
        } else if (arg0.field3689 == 2) {
            arg0.field3556 = arg2 - arg0.field3617 - arg0.field3552;
        } else if (arg0.field3689 == 3) {
            arg0.field3556 = arg0.field3552 * arg2 >> 14;
        } else if (arg0.field3689 == 4) {
            arg0.field3556 = (arg0.field3552 * arg2 >> 14) + (arg2 - arg0.field3617) / 2;
        } else {
            arg0.field3556 = arg2 - arg0.field3617 - (arg0.field3552 * arg2 >> 14);
        }
    }

    @ObfuscatedName("aw.kd(Lkd;IIIIIII)V")
    public static final void method830(class306 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field690) {
            field587 = 32;
        } else {
            field587 = 0;
        }
        field690 = false;
        if (class37.field253 == 1 || !Statics.field2773 && class37.field253 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field3564 -= 4;
                method1922(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field3564 += 4;
                method1922(arg0);
            } else if (arg5 >= arg1 - field587 && arg5 < field587 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field3564 = (arg4 - arg3) * var8 / var9;
                method1922(arg0);
                field690 = true;
            }
        }
        if (field615 == 0) {
            return;
        }
        int var10 = arg0.field3557;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field3564 += field615 * 45;
            method1922(arg0);
        }
    }

    @ObfuscatedName("bq.kf(IIIIII)V")
    public static final void method1862(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field1160[0].method8196(arg0, arg1);
        Statics.field1160[1].method8196(arg0, arg1 + arg3 - 16);
        class477.method8120(arg0, arg1 + 16, 16, arg3 - 32, field720);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class477.method8120(arg0, arg1 + 16 + var6, 16, var5, field652);
        class477.method8128(arg0, arg1 + 16 + var6, var5, field585);
        class477.method8128(arg0 + 1, arg1 + 16 + var6, var5, field585);
        class477.method8126(arg0, arg1 + 16 + var6, 16, field585);
        class477.method8126(arg0, arg1 + 17 + var6, 16, field585);
        class477.method8128(arg0 + 15, arg1 + 16 + var6, var5, field533);
        class477.method8128(arg0 + 14, arg1 + 17 + var6, var5 - 1, field533);
        class477.method8126(arg0, arg1 + 15 + var6 + var5, 16, field533);
        class477.method8126(arg0 + 1, arg1 + 14 + var6 + var5, 15, field533);
    }

    @ObfuscatedName("as.kq(Lkd;I)Z")
    public static final boolean method371(class306 arg0) {
        if (arg0.field3673 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field3673.length; var1++) {
            int var2 = method1917(arg0, var1);
            int var3 = arg0.field3674[var1];
            if (arg0.field3673[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field3673[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field3673[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("bn.kk(Lkd;II)I")
    public static final int method1917(class306 arg0, int arg1) {
        if (arg0.field3533 == null || arg1 >= arg0.field3533.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field3533[arg1];
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
                    var7 = field581[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field653[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field654[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class306 var11 = Statics.method3181(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class197.method3345(var12).field2231 || field510)) {
                        for (int var13 = 0; var13 < var11.field3535.length; var13++) {
                            if (var12 + 1 == var11.field3535[var13]) {
                                var7 += var11.field3581[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class296.field3445[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class316.field3756[field653[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class296.field3445[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field1790.field1127;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class316.field3754[var14]) {
                            var7 += field653[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class306 var17 = Statics.method3181(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class197.method3345(var18).field2231 || field510)) {
                        for (int var19 = 0; var19 < var17.field3535.length; var19++) {
                            if (var18 + 1 == var17.field3535[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field630;
                }
                if (var6 == 12) {
                    var7 = field689;
                }
                if (var6 == 13) {
                    int var20 = class296.field3445[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class296.method3182(var22);
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
                    var7 = (Statics.field1790.field1243 >> 7) + Statics.field1780;
                }
                if (var6 == 19) {
                    var7 = (Statics.field1790.field1179 >> 7) + Statics.field4368;
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

    @ObfuscatedName("lp.kw(Lkd;Lgr;IIZS)V")
    public static final void method5768(class306 arg0, class197 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field2233;
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
            var7 = class326.field4132;
        }
        if (var6 != -1 && var7 != null) {
            method697(var7, class98.method2153(16748608) + arg1.field2215, var6, 0, arg2, arg0.field3635, arg1.field2237, arg4);
        }
    }

    @ObfuscatedName("jw.kj(Lkd;IIB)V")
    public static final void method4931(class306 arg0, int arg1, int arg2) {
        if (arg0.field3545 == 1) {
            method1093(arg0.field3677, "", 24, 0, 0, arg0.field3635, arg0.field3547);
        }
        if (arg0.field3545 == 2 && !field676) {
            String var3 = method2110(arg0);
            if (var3 != null) {
                method1093(var3, class98.method2153(65280) + arg0.field3652, 25, 0, -1, arg0.field3635, arg0.field3547);
            }
        }
        if (arg0.field3545 == 3) {
            method1764(class326.field3989, "", 26, 0, 0, arg0.field3635);
        }
        if (arg0.field3545 == 4) {
            method1764(arg0.field3677, "", 28, 0, 0, arg0.field3635);
        }
        if (arg0.field3545 == 5) {
            method1764(arg0.field3677, "", 29, 0, 0, arg0.field3635);
        }
        if (arg0.field3545 == 6 && field687 == null) {
            method1764(arg0.field3677, "", 30, 0, -1, arg0.field3635);
        }
        if (arg0.field3679 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field3617; var5++) {
                for (int var6 = 0; var6 < arg0.field3557; var6++) {
                    int var7 = (arg0.field3663 + 32) * var6;
                    int var8 = (arg0.field3594 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field3612[var4];
                        var8 += arg0.field3524[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field799 = var4;
                        Statics.field2982 = arg0;
                        if (arg0.field3535[var4] > 0) {
                            class197 var9 = class197.method3345(arg0.field3535[var4] - 1);
                            if (field674 == 1 && class307.method4499(method3180(arg0))) {
                                if (Statics.field4322 != arg0.field3635 || Statics.field1364 != var4) {
                                    method1093(class326.field3980, field771 + " " + class98.field1330 + " " + class98.method2153(16748608) + var9.field2215, 31, 0, var4, arg0.field3635, var9.field2237);
                                }
                            } else if (!field676 || !class307.method4499(method3180(arg0))) {
                                String[] var10 = var9.field2233;
                                int var11 = -1;
                                if (field672) {
                                    boolean var12 = field668 || field748.method3737(81);
                                    if (var12) {
                                        var11 = var9.method3599();
                                    }
                                }
                                if (class307.method4499(method3180(arg0))) {
                                    for (int var13 = 4; var13 >= 3; var13--) {
                                        if (var11 != var13) {
                                            method5768(arg0, var9, var4, var13, false);
                                        }
                                    }
                                }
                                if (class307.method2724(method3180(arg0))) {
                                    method1093(class326.field3980, class98.method2153(16748608) + var9.field2215, 38, 0, var4, arg0.field3635, var9.field2237);
                                }
                                if (class307.method4499(method3180(arg0))) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11 != var14) {
                                            method5768(arg0, var9, var4, var14, false);
                                        }
                                    }
                                    if (var11 >= 0) {
                                        method5768(arg0, var9, var4, var11, true);
                                    }
                                }
                                String[] var15 = arg0.field3615;
                                if (var15 != null) {
                                    for (int var16 = 4; var16 >= 0; var16--) {
                                        if (var15[var16] != null) {
                                            byte var17 = 0;
                                            if (var16 == 0) {
                                                var17 = 39;
                                            }
                                            if (var16 == 1) {
                                                var17 = 40;
                                            }
                                            if (var16 == 2) {
                                                var17 = 41;
                                            }
                                            if (var16 == 3) {
                                                var17 = 42;
                                            }
                                            if (var16 == 4) {
                                                var17 = 43;
                                            }
                                            method1093(var15[var16], class98.method2153(16748608) + var9.field2215, var17, 0, var4, arg0.field3635, var9.field2237);
                                        }
                                    }
                                }
                                method1093(class326.field4032, class98.method2153(16748608) + var9.field2215, 1005, 0, var4, arg0.field3635, var9.field2237);
                            } else if ((Statics.field125 & 0x10) == 16) {
                                method1093(field679, field798 + " " + class98.field1330 + " " + class98.method2153(16748608) + var9.field2215, 32, 0, var4, arg0.field3635, var9.field2237);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field3541) {
            return;
        }
        if (field676) {
            int var18 = method3180(arg0);
            boolean var19 = (var18 >> 21 & 0x1) != 0;
            if (var19 && (Statics.field125 & 0x20) == 32) {
                method1093(field679, field798 + " " + class98.field1330 + " " + arg0.field3542, 58, 0, arg0.field3543, arg0.field3635, arg0.field3547);
            }
            return;
        }
        for (int var20 = 9; var20 >= 5; var20--) {
            String var21;
            if (!class307.method4795(method3180(arg0), var20) && arg0.field3580 == null) {
                var21 = null;
            } else if (arg0.field3628 == null || arg0.field3628.length <= var20 || arg0.field3628[var20] == null || arg0.field3628[var20].trim().length() == 0) {
                var21 = null;
            } else {
                var21 = arg0.field3628[var20];
            }
            if (var21 != null) {
                method1093(var21, arg0.field3542, 1007, var20 + 1, arg0.field3543, arg0.field3635, arg0.field3547);
            }
        }
        String var23 = method2110(arg0);
        if (var23 != null) {
            method1093(var23, arg0.field3542, 25, 0, arg0.field3543, arg0.field3635, arg0.field3547);
        }
        for (int var24 = 4; var24 >= 0; var24--) {
            String var25;
            if (!class307.method4795(method3180(arg0), var24) && arg0.field3580 == null) {
                var25 = null;
            } else if (arg0.field3628 == null || arg0.field3628.length <= var24 || arg0.field3628[var24] == null || arg0.field3628[var24].trim().length() == 0) {
                var25 = null;
            } else {
                var25 = arg0.field3628[var24];
            }
            if (var25 != null) {
                method697(var25, arg0.field3542, 57, var24 + 1, arg0.field3543, arg0.field3635, arg0.field3547, arg0.field3696);
            }
        }
        int var27 = method3180(arg0);
        boolean var28 = (var27 & 0x1) != 0;
        if (var28) {
            method1764(class326.field3823, "", 30, 0, arg0.field3543, arg0.field3635);
        }
    }

    @ObfuscatedName("my.kh(ZI)V")
    public static void method6281(boolean arg0) {
        field668 = arg0;
    }

    @ObfuscatedName("ht.lb(I)Z")
    public static boolean method4267() {
        return field668;
    }

    @ObfuscatedName("nr.lc(IIIIIIIB)V")
    public static final void method6719(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class306.method2497(arg0)) {
            method2924(Statics.field914[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("eb.ll([Lkd;IIIIIIII)V")
    public static final void method2924(class306[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class306 var9 = arg0[var8];
            if (var9 != null && var9.field3561 == arg1 && (var9.method5712() || method3180(var9) != 0 || field695 == var9)) {
                if (var9.field3541) {
                    if (method1710(var9)) {
                        continue;
                    }
                } else if (var9.field3679 == 0 && Statics.field3017 != var9 && method1710(var9)) {
                    continue;
                }
                if (var9.field3679 == 11) {
                    if (var9.method5695(Statics.field1850)) {
                        if (var9.method5586()) {
                            method1922(var9);
                            method3169(var9.field3684, var9, true);
                        }
                        if (var9.field3671 != null) {
                            class85 var10 = new class85();
                            var10.field1077 = var9;
                            var10.field1079 = var9.field3671;
                            field583.method6081(var10);
                        }
                    }
                } else if (var9.field3679 == 12 && var9.method5656()) {
                    method1922(var9);
                }
                int var11 = var9.field3555 + arg6;
                int var12 = var9.field3556 + arg7;
                int var13;
                int var14;
                int var15;
                int var16;
                if (var9.field3679 == 2) {
                    var13 = arg2;
                    var14 = arg3;
                    var15 = arg4;
                    var16 = arg5;
                } else if (var9.field3679 == 9) {
                    int var17 = var11;
                    int var18 = var12;
                    int var19 = var9.field3557 + var11;
                    int var20 = var9.field3617 + var12;
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
                    int var23 = var9.field3557 + var11;
                    int var24 = var9.field3617 + var12;
                    var13 = var11 > arg2 ? var11 : arg2;
                    var14 = var12 > arg3 ? var12 : arg3;
                    var15 = var23 < arg4 ? var23 : arg4;
                    var16 = var24 < arg5 ? var24 : arg5;
                }
                if (field694 == var9) {
                    field702 = true;
                    field520 = var11;
                    field704 = var12;
                }
                boolean var25 = false;
                if (var9.field3622) {
                    switch(field792) {
                        case 0:
                            var25 = true;
                        case 1:
                        default:
                            break;
                        case 2:
                            if (var9.field3635 >>> 16 == field684) {
                                var25 = true;
                            }
                            break;
                        case 3:
                            if (field684 == var9.field3635) {
                                var25 = true;
                            }
                    }
                }
                if (var25 || !var9.field3541 || var13 < var15 && var14 < var16) {
                    if (var9.field3541) {
                        if (var9.field3694) {
                            if (class37.field254 >= var13 && class37.field249 >= var14 && class37.field254 < var15 && class37.field249 < var16) {
                                for (class85 var26 = (class85) field583.method6086(); var26 != null; var26 = (class85) field583.method6088()) {
                                    if (var26.field1076) {
                                        var26.method7230();
                                        var26.field1077.field3685 = false;
                                    }
                                }
                                method4935();
                                if (Statics.field1110 == 0) {
                                    field694 = null;
                                    field695 = null;
                                }
                                if (!field656) {
                                    method6801();
                                }
                            }
                        } else if (var9.field3695 && class37.field254 >= var13 && class37.field249 >= var14 && class37.field254 < var15 && class37.field249 < var16) {
                            for (class85 var27 = (class85) field583.method6086(); var27 != null; var27 = (class85) field583.method6088()) {
                                if (var27.field1076 && var27.field1077.field3656 == var27.field1079) {
                                    var27.method7230();
                                }
                            }
                        }
                    }
                    int var28 = class37.field254;
                    int var29 = class37.field249;
                    if (class37.field261 != 0) {
                        var28 = class37.field262;
                        var29 = class37.field258;
                    }
                    boolean var30 = var28 >= var13 && var29 >= var14 && var28 < var15 && var29 < var16;
                    if (var9.field3643 == 1337) {
                        if (!field518 && !field656 && var30) {
                            method210(var28, var29, var13, var14);
                        }
                    } else if (var9.field3643 == 1338) {
                        method307(var9, var11, var12);
                    } else {
                        if (var9.field3643 == 1400) {
                            Statics.field1973.method7272(class37.field254, class37.field249, var30, var11, var12, var9.field3557, var9.field3617);
                        }
                        if (!field656 && var30) {
                            if (var9.field3643 == 1400) {
                                Statics.field1973.method7322(var11, var12, var9.field3557, var9.field3617, var28, var29);
                            } else {
                                method4931(var9, var28 - var11, var29 - var12);
                            }
                        }
                        if (var25) {
                            for (int var31 = 0; var31 < var9.field3623.length; var31++) {
                                boolean var32 = false;
                                boolean var33 = false;
                                if (!var32 && var9.field3623[var31] != null) {
                                    for (int var34 = 0; var34 < var9.field3623[var31].length; var34++) {
                                        boolean var35 = false;
                                        if (var9.field3693 != null) {
                                            var35 = field748.method3737(var9.field3623[var31][var34]);
                                        }
                                        if (method4955(var9.field3623[var31][var34]) || var35) {
                                            var32 = true;
                                            if (var9.field3693 != null && var9.field3693[var31] > field519) {
                                                break;
                                            }
                                            byte var36 = var9.field3624[var31][var34];
                                            if (var36 == 0 || ((var36 & 0x8) == 0 || !field748.method3737(86) && !field748.method3737(82) && !field748.method3737(81)) && ((var36 & 0x2) == 0 || field748.method3737(86)) && ((var36 & 0x1) == 0 || field748.method3737(82)) && ((var36 & 0x4) == 0 || field748.method3737(81))) {
                                                var33 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (var33) {
                                    if (var31 < 10) {
                                        method4417(var31 + 1, var9.field3635, var9.field3543, var9.field3547, "");
                                    } else if (var31 == 10) {
                                        method5715();
                                        method456(var9.field3635, var9.field3543, class307.method2580(method3180(var9)), var9.field3547);
                                        field679 = method2110(var9);
                                        if (field679 == null) {
                                            field679 = class326.field3819;
                                        }
                                        field798 = var9.field3542 + class98.method2153(16777215);
                                    }
                                    int var37 = var9.field3631[var31];
                                    if (var9.field3693 == null) {
                                        var9.field3693 = new int[var9.field3623.length];
                                    }
                                    if (var9.field3626 == null) {
                                        var9.field3626 = new int[var9.field3623.length];
                                    }
                                    if (var37 == 0) {
                                        var9.field3693[var31] = Integer.MAX_VALUE;
                                    } else if (var9.field3693[var31] == 0) {
                                        var9.field3693[var31] = field519 + var37 + var9.field3626[var31];
                                    } else {
                                        var9.field3693[var31] = field519 + var37;
                                    }
                                }
                                if (!var32 && var9.field3693 != null) {
                                    var9.field3693[var31] = 0;
                                }
                            }
                        }
                        if (var9.field3541) {
                            boolean var38;
                            if (class37.field254 >= var13 && class37.field249 >= var14 && class37.field254 < var15 && class37.field249 < var16) {
                                var38 = true;
                            } else {
                                var38 = false;
                            }
                            boolean var39 = false;
                            if ((class37.field253 == 1 || !Statics.field2773 && class37.field253 == 4) && var38) {
                                var39 = true;
                            }
                            boolean var40 = false;
                            if ((class37.field261 == 1 || !Statics.field2773 && class37.field261 == 4) && class37.field262 >= var13 && class37.field258 >= var14 && class37.field262 < var15 && class37.field258 < var16) {
                                var40 = true;
                            }
                            if (var40) {
                                method245(var9, class37.field262 - var11, class37.field258 - var12);
                            }
                            if (var9.method5639()) {
                                if (var40) {
                                    field728.method6081(new class201(0, class37.field254 - var11, class37.field249 - var12, var9));
                                }
                                if (var39) {
                                    field728.method6081(new class201(1, class37.field254 - var11, class37.field249 - var12, var9));
                                }
                            }
                            if (var9.field3643 == 1400) {
                                Statics.field1973.method7273(var28, var29, var38 & var39, var38 & var40);
                            }
                            if (field694 != null && field694 != var9 && var38 && class307.method2891(method3180(var9))) {
                                field698 = var9;
                            }
                            if (field695 == var9) {
                                field746 = true;
                                field700 = var11;
                                field614 = var12;
                            }
                            if (var9.field3627) {
                                if (var38 && field615 != 0 && var9.field3656 != null) {
                                    class85 var41 = new class85();
                                    var41.field1076 = true;
                                    var41.field1077 = var9;
                                    var41.field1082 = field615;
                                    var41.field1079 = var9.field3656;
                                    field583.method6081(var41);
                                }
                                if (field694 != null || Statics.field4390 != null || field656) {
                                    var40 = false;
                                    var39 = false;
                                    var38 = false;
                                }
                                if (!var9.field3611 && var40) {
                                    var9.field3611 = true;
                                    if (var9.field3569 != null) {
                                        class85 var42 = new class85();
                                        var42.field1076 = true;
                                        var42.field1077 = var9;
                                        var42.field1075 = class37.field262 - var11;
                                        var42.field1082 = class37.field258 - var12;
                                        var42.field1079 = var9.field3569;
                                        field583.method6081(var42);
                                    }
                                }
                                if (var9.field3611 && var39 && var9.field3637 != null) {
                                    class85 var43 = new class85();
                                    var43.field1076 = true;
                                    var43.field1077 = var9;
                                    var43.field1075 = class37.field254 - var11;
                                    var43.field1082 = class37.field249 - var12;
                                    var43.field1079 = var9.field3637;
                                    field583.method6081(var43);
                                }
                                if (var9.field3611 && !var39) {
                                    var9.field3611 = false;
                                    if (var9.field3578 != null) {
                                        class85 var44 = new class85();
                                        var44.field1076 = true;
                                        var44.field1077 = var9;
                                        var44.field1075 = class37.field254 - var11;
                                        var44.field1082 = class37.field249 - var12;
                                        var44.field1079 = var9.field3578;
                                        field727.method6081(var44);
                                    }
                                }
                                if (var39 && var9.field3639 != null) {
                                    class85 var45 = new class85();
                                    var45.field1076 = true;
                                    var45.field1077 = var9;
                                    var45.field1075 = class37.field254 - var11;
                                    var45.field1082 = class37.field249 - var12;
                                    var45.field1079 = var9.field3639;
                                    field583.method6081(var45);
                                }
                                if (!var9.field3685 && var38) {
                                    var9.field3685 = true;
                                    if (var9.field3636 != null) {
                                        class85 var46 = new class85();
                                        var46.field1076 = true;
                                        var46.field1077 = var9;
                                        var46.field1075 = class37.field254 - var11;
                                        var46.field1082 = class37.field249 - var12;
                                        var46.field1079 = var9.field3636;
                                        field583.method6081(var46);
                                    }
                                }
                                if (var9.field3685 && var38 && var9.field3686 != null) {
                                    class85 var47 = new class85();
                                    var47.field1076 = true;
                                    var47.field1077 = var9;
                                    var47.field1075 = class37.field254 - var11;
                                    var47.field1082 = class37.field249 - var12;
                                    var47.field1079 = var9.field3686;
                                    field583.method6081(var47);
                                }
                                if (var9.field3685 && !var38) {
                                    var9.field3685 = false;
                                    if (var9.field3642 != null) {
                                        class85 var48 = new class85();
                                        var48.field1076 = true;
                                        var48.field1077 = var9;
                                        var48.field1075 = class37.field254 - var11;
                                        var48.field1082 = class37.field249 - var12;
                                        var48.field1079 = var9.field3642;
                                        field727.method6081(var48);
                                    }
                                }
                                if (var9.field3653 != null) {
                                    class85 var49 = new class85();
                                    var49.field1077 = var9;
                                    var49.field1079 = var9.field3653;
                                    field726.method6081(var49);
                                }
                                if (var9.field3585 != null && field708 > var9.field3646) {
                                    if (var9.field3648 == null || field708 - var9.field3646 > 32) {
                                        class85 var54 = new class85();
                                        var54.field1077 = var9;
                                        var54.field1079 = var9.field3585;
                                        field583.method6081(var54);
                                    } else {
                                        label654: for (int var50 = var9.field3646; var50 < field708; var50++) {
                                            int var51 = field707[var50 & 0x1F];
                                            for (int var52 = 0; var52 < var9.field3648.length; var52++) {
                                                if (var9.field3648[var52] == var51) {
                                                    class85 var53 = new class85();
                                                    var53.field1077 = var9;
                                                    var53.field1079 = var9.field3585;
                                                    field583.method6081(var53);
                                                    break label654;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3646 = field708;
                                }
                                if (var9.field3534 != null && field710 > var9.field3669) {
                                    if (var9.field3587 == null || field710 - var9.field3669 > 32) {
                                        class85 var59 = new class85();
                                        var59.field1077 = var9;
                                        var59.field1079 = var9.field3534;
                                        field583.method6081(var59);
                                    } else {
                                        label630: for (int var55 = var9.field3669; var55 < field710; var55++) {
                                            int var56 = field709[var55 & 0x1F];
                                            for (int var57 = 0; var57 < var9.field3587.length; var57++) {
                                                if (var9.field3587[var57] == var56) {
                                                    class85 var58 = new class85();
                                                    var58.field1077 = var9;
                                                    var58.field1079 = var9.field3534;
                                                    field583.method6081(var58);
                                                    break label630;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3669 = field710;
                                }
                                if (var9.field3651 != null && field712 > var9.field3638) {
                                    if (var9.field3544 == null || field712 - var9.field3638 > 32) {
                                        class85 var64 = new class85();
                                        var64.field1077 = var9;
                                        var64.field1079 = var9.field3651;
                                        field583.method6081(var64);
                                    } else {
                                        label606: for (int var60 = var9.field3638; var60 < field712; var60++) {
                                            int var61 = field637[var60 & 0x1F];
                                            for (int var62 = 0; var62 < var9.field3544.length; var62++) {
                                                if (var9.field3544[var62] == var61) {
                                                    class85 var63 = new class85();
                                                    var63.field1077 = var9;
                                                    var63.field1079 = var9.field3651;
                                                    field583.method6081(var63);
                                                    break label606;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3638 = field712;
                                }
                                if (field715 > var9.field3573 && var9.field3657 != null) {
                                    class85 var65 = new class85();
                                    var65.field1077 = var9;
                                    var65.field1079 = var9.field3657;
                                    field583.method6081(var65);
                                }
                                if (field716 > var9.field3573 && var9.field3661 != null) {
                                    class85 var66 = new class85();
                                    var66.field1077 = var9;
                                    var66.field1079 = var9.field3661;
                                    field583.method6081(var66);
                                }
                                if (field611 > var9.field3573 && var9.field3613 != null) {
                                    class85 var67 = new class85();
                                    var67.field1077 = var9;
                                    var67.field1079 = var9.field3613;
                                    field583.method6081(var67);
                                }
                                if (field718 > var9.field3573 && var9.field3554 != null) {
                                    class85 var68 = new class85();
                                    var68.field1077 = var9;
                                    var68.field1079 = var9.field3554;
                                    field583.method6081(var68);
                                }
                                if (field514 > var9.field3573 && var9.field3664 != null) {
                                    class85 var69 = new class85();
                                    var69.field1077 = var9;
                                    var69.field1079 = var9.field3664;
                                    field583.method6081(var69);
                                }
                                if (field778 > var9.field3573 && var9.field3523 != null) {
                                    class85 var70 = new class85();
                                    var70.field1077 = var9;
                                    var70.field1079 = var9.field3523;
                                    field583.method6081(var70);
                                }
                                if (field721 > var9.field3573 && var9.field3568 != null) {
                                    class85 var71 = new class85();
                                    var71.field1077 = var9;
                                    var71.field1079 = var9.field3568;
                                    field583.method6081(var71);
                                }
                                if (field722 > var9.field3573 && var9.field3665 != null) {
                                    class85 var72 = new class85();
                                    var72.field1077 = var9;
                                    var72.field1079 = var9.field3665;
                                    field583.method6081(var72);
                                }
                                var9.field3573 = field706;
                                if (var9.field3658 != null) {
                                    for (int var73 = 0; var73 < field711; var73++) {
                                        class85 var74 = new class85();
                                        var74.field1077 = var9;
                                        var74.field1078 = field752[var73];
                                        var74.field1083 = field775[var73];
                                        var74.field1079 = var9.field3658;
                                        field583.method6081(var74);
                                    }
                                }
                                if (var9.field3659 != null) {
                                    int[] var75 = field748.method3739();
                                    for (int var76 = 0; var76 < var75.length; var76++) {
                                        class85 var77 = new class85();
                                        var77.field1077 = var9;
                                        var77.field1078 = var75[var76];
                                        var77.field1079 = var9.field3659;
                                        field583.method6081(var77);
                                    }
                                }
                                if (var9.field3654 != null) {
                                    int[] var78 = field748.method3740();
                                    for (int var79 = 0; var79 < var78.length; var79++) {
                                        class85 var80 = new class85();
                                        var80.field1077 = var9;
                                        var80.field1078 = var78[var79];
                                        var80.field1079 = var9.field3654;
                                        field583.method6081(var80);
                                    }
                                }
                            }
                        }
                        if (!var9.field3541) {
                            if (field694 != null || Statics.field4390 != null || field656) {
                                continue;
                            }
                            if ((var9.field3675 >= 0 || var9.field3549 != 0) && class37.field254 >= var13 && class37.field249 >= var14 && class37.field254 < var15 && class37.field249 < var16) {
                                if (var9.field3675 >= 0) {
                                    Statics.field3017 = arg0[var9.field3675];
                                } else {
                                    Statics.field3017 = var9;
                                }
                            }
                            if (var9.field3679 == 8 && class37.field254 >= var13 && class37.field249 >= var14 && class37.field254 < var15 && class37.field249 < var16) {
                                Statics.field4471 = var9;
                            }
                            if (var9.field3566 > var9.field3617) {
                                method830(var9, var9.field3557 + var11, var12, var9.field3617, var9.field3566, class37.field254, class37.field249);
                            }
                        }
                        if (var9.field3679 == 0) {
                            method2924(arg0, var9.field3635, var13, var14, var15, var16, var11 - var9.field3570, var12 - var9.field3564);
                            if (var9.field3684 != null) {
                                method2924(var9.field3684, var9.field3635, var13, var14, var15, var16, var11 - var9.field3570, var12 - var9.field3564);
                            }
                            class84 var81 = (class84) field682.method7535((long) var9.field3635);
                            if (var81 != null) {
                                if (var81.field1067 == 0 && class37.field254 >= var13 && class37.field249 >= var14 && class37.field254 < var15 && class37.field249 < var16 && !field656) {
                                    for (class85 var82 = (class85) field583.method6086(); var82 != null; var82 = (class85) field583.method6088()) {
                                        if (var82.field1076) {
                                            var82.method7230();
                                            var82.field1077.field3685 = false;
                                        }
                                    }
                                    if (Statics.field1110 == 0) {
                                        field694 = null;
                                        field695 = null;
                                    }
                                    if (!field656) {
                                        method6801();
                                    }
                                }
                                method6719(var81.field1072, var13, var14, var15, var16, var11, var12);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("jg.lk(II)Z")
    public static boolean method4955(int arg0) {
        for (int var1 = 0; var1 < field711; var1++) {
            if (field752[var1] == arg0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("lo.lu(III)V")
    public static final void method5970(int arg0, int arg1) {
        if (class306.method2497(arg0)) {
            method4794(Statics.field914[arg0], arg1);
        }
    }

    @ObfuscatedName("ii.lp([Lkd;II)V")
    public static final void method4794(class306[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class306 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field3679 == 0) {
                    if (var3.field3684 != null) {
                        method4794(var3.field3684, arg1);
                    }
                    class84 var4 = (class84) field682.method7535((long) var3.field3635);
                    if (var4 != null) {
                        method5970(var4.field1072, arg1);
                    }
                }
                if (arg1 == 0 && var3.field3666 != null) {
                    class85 var5 = new class85();
                    var5.field1077 = var3;
                    var5.field1079 = var3.field3666;
                    class68.method3219(var5);
                }
                if (arg1 == 1 && var3.field3667 != null) {
                    if (var3.field3543 >= 0) {
                        class306 var6 = Statics.method3181(var3.field3635);
                        if (var6 == null || var6.field3684 == null || var3.field3543 >= var6.field3684.length || var6.field3684[var3.field3543] != var3) {
                            continue;
                        }
                    }
                    class85 var7 = new class85();
                    var7.field1077 = var3;
                    var7.field1079 = var3.field3667;
                    class68.method3219(var7);
                }
            }
        }
    }

    @ObfuscatedName("l.lg(Lkd;III)V")
    public static final void method245(class306 arg0, int arg1, int arg2) {
        if (field694 != null || field656 || arg0 == null || method5731(arg0) == null) {
            return;
        }
        field694 = arg0;
        field695 = method5731(arg0);
        field696 = arg1;
        field697 = arg2;
        Statics.field1110 = 0;
        field705 = false;
        int var3 = field657 - 1;
        if (var3 != -1) {
            method702(var3);
        }
    }

    @ObfuscatedName("client.ls(I)V")
    public final void method1173() {
        method1922(field694);
        Statics.field1110++;
        if (field702 && field746) {
            int var1 = class37.field254;
            int var2 = class37.field249;
            int var3 = var1 - field696;
            int var4 = var2 - field697;
            if (var3 < field700) {
                var3 = field700;
            }
            if (field694.field3557 + var3 > field700 + field695.field3557) {
                var3 = field700 + field695.field3557 - field694.field3557;
            }
            if (var4 < field614) {
                var4 = field614;
            }
            if (field694.field3617 + var4 > field614 + field695.field3617) {
                var4 = field614 + field695.field3617 - field694.field3617;
            }
            int var5 = var3 - field520;
            int var6 = var4 - field704;
            int var7 = field694.field3630;
            if (Statics.field1110 > field694.field3583 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field705 = true;
            }
            int var8 = field695.field3570 + (var3 - field700);
            int var9 = field695.field3564 + (var4 - field614);
            if (field694.field3690 != null && field705) {
                class85 var10 = new class85();
                var10.field1077 = field694;
                var10.field1075 = var8;
                var10.field1082 = var9;
                var10.field1079 = field694.field3690;
                class68.method3219(var10);
            }
            if (class37.field253 == 0) {
                if (field705) {
                    if (field694.field3644 != null) {
                        class85 var11 = new class85();
                        var11.field1077 = field694;
                        var11.field1075 = var8;
                        var11.field1082 = var9;
                        var11.field1089 = field698;
                        var11.field1079 = field694.field3644;
                        class68.method3219(var11);
                    }
                    if (field698 != null) {
                        class306 var12 = field694;
                        int var13 = method3180(var12);
                        int var14 = var13 >> 17 & 0x7;
                        int var15 = var14;
                        class306 var16;
                        if (var14 == 0) {
                            var16 = null;
                        } else {
                            int var17 = 0;
                            while (true) {
                                if (var17 >= var15) {
                                    var16 = var12;
                                    break;
                                }
                                var12 = Statics.method3181(var12.field3561);
                                if (var12 == null) {
                                    var16 = null;
                                    break;
                                }
                                var17++;
                            }
                        }
                        if (var16 != null) {
                            class278 var18 = class278.method2890(class276.field3127, field567.field1425);
                            var18.field3177.method7849(field694.field3547);
                            var18.field3177.method7831(field694.field3543);
                            var18.field3177.method7843(field698.field3635);
                            var18.field3177.method7841(field694.field3635);
                            var18.field3177.method7849(field698.field3543);
                            var18.field3177.method7849(field698.field3547);
                            field567.method2603(var18);
                        }
                    }
                } else if (this.method1167()) {
                    this.method1168(field696 + field520, field704 + field697);
                } else if (field657 > 0) {
                    method4453(field696 + field520, field704 + field697);
                }
                field694 = null;
            }
        } else if (Statics.field1110 > 1) {
            if (!field705 && field657 > 0) {
                method4453(field696 + field520, field704 + field697);
            }
            field694 = null;
        }
    }

    @ObfuscatedName("ag.lz(II)V")
    public static void method702(int arg0) {
        Statics.field1162 = new class71();
        Statics.field1162.field907 = field658[arg0];
        Statics.field1162.field903 = field651[arg0];
        Statics.field1162.field901 = field751[arg0];
        Statics.field1162.field902 = field621[arg0];
        Statics.field1162.field905 = field662[arg0];
        Statics.field1162.field904 = field663[arg0];
        Statics.field1162.field900 = field544[arg0];
    }

    @ObfuscatedName("iq.lw(III)V")
    public static void method4453(int arg0, int arg1) {
        method4939(Statics.field1162, arg0, arg1);
        Statics.field1162 = null;
    }

    @ObfuscatedName("ba.lm(Lkd;B)V")
    public static void method1922(class306 arg0) {
        if (arg0 != null && field809 == arg0.field3692) {
            field732[arg0.field3691] = true;
        }
    }

    @ObfuscatedName("ev.lh(S)V")
    public static void method2889() {
        for (class84 var0 = (class84) field682.method7530(); var0 != null; var0 = (class84) field682.method7531()) {
            int var1 = var0.field1072;
            if (class306.method2497(var1)) {
                boolean var2 = true;
                class306[] var3 = Statics.field914[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field3541;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field4686;
                    class306 var6 = Statics.method3181(var5);
                    if (var6 != null) {
                        method1922(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("kf.lj(Lkd;I)Lkd;")
    public static class306 method5731(class306 arg0) {
        class306 var1 = arg0;
        int var2 = method3180(arg0);
        int var3 = var2 >> 17 & 0x7;
        int var4 = var3;
        class306 var5;
        if (var3 == 0) {
            var5 = null;
        } else {
            int var6 = 0;
            while (true) {
                if (var6 >= var4) {
                    var5 = var1;
                    break;
                }
                var1 = Statics.method3181(var1.field3561);
                if (var1 == null) {
                    var5 = null;
                    break;
                }
                var6++;
            }
        }
        class306 var7 = var5;
        if (var5 == null) {
            var7 = arg0.field3629;
        }
        return var7;
    }

    @ObfuscatedName("ba.li(IB)V")
    public static final void method1921(int arg0) {
        if (!class306.method2497(arg0)) {
            return;
        }
        class306[] var1 = Statics.field914[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class306 var3 = var1[var2];
            if (var3 != null) {
                var3.field3682 = 0;
                var3.field3683 = 0;
            }
        }
    }

    @ObfuscatedName("dx.le([Lkd;II)V")
    public static final void method2719(class306[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class306 var3 = arg0[var2];
            if (var3 != null && var3.field3561 == arg1 && (!var3.field3541 || !method1710(var3))) {
                if (var3.field3679 == 0) {
                    if (!var3.field3541 && method1710(var3) && Statics.field3017 != var3) {
                        continue;
                    }
                    method2719(arg0, var3.field3635);
                    if (var3.field3684 != null) {
                        method2719(var3.field3684, var3.field3635);
                    }
                    class84 var4 = (class84) field682.method7535((long) var3.field3635);
                    if (var4 != null) {
                        int var5 = var4.field1072;
                        if (class306.method2497(var5)) {
                            method2719(Statics.field914[var5], -1);
                        }
                    }
                }
                if (var3.field3679 == 6) {
                    if (var3.field3625 != -1 || var3.field3591 != -1) {
                        boolean var6 = method371(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field3591;
                        } else {
                            var7 = var3.field3625;
                        }
                        if (var7 != -1) {
                            class199 var8 = class199.method4223(var7);
                            if (var8.method3671()) {
                                var3.field3682 += field564;
                                int var9 = var8.method3675();
                                if (var3.field3682 >= var9) {
                                    var3.field3682 -= var8.field2298;
                                    if (var3.field3682 < 0 || var3.field3682 >= var9) {
                                        var3.field3682 = 0;
                                    }
                                }
                                method1922(var3);
                            } else {
                                var3.field3683 += field564;
                                while (var3.field3683 > var8.field2289[var3.field3682]) {
                                    var3.field3683 -= var8.field2289[var3.field3682];
                                    var3.field3682++;
                                    if (var3.field3682 >= var8.field2295.length) {
                                        var3.field3682 -= var8.field2298;
                                        if (var3.field3682 < 0 || var3.field3682 >= var8.field2295.length) {
                                            var3.field3682 = 0;
                                        }
                                    }
                                    method1922(var3);
                                }
                            }
                        }
                    }
                    if (var3.field3599 != 0 && !var3.field3541) {
                        int var10 = var3.field3599 >> 16;
                        int var11 = var3.field3599 << 16 >> 16;
                        int var12 = field564 * var10;
                        int var13 = field564 * var11;
                        var3.field3610 = var3.field3610 + var12 & 0x7FF;
                        var3.field3597 = var3.field3597 + var13 & 0x7FF;
                        method1922(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("n.lq(II)V")
    public static final void method161(int arg0) {
        int var1 = Math.max(Math.min(arg0, 100), 0);
        int var2 = 100 - var1;
        float var3 = (float) var2 / 200.0F + 0.5F;
        method3164((double) var3);
    }

    @ObfuscatedName("ft.lf(D)V")
    public static final void method3164(double arg0) {
        class213.method3925(arg0);
        ((class222) Statics.field2491).method4240(arg0);
        class197.field2212.method4918();
        Statics.field2126.method2348(arg0);
    }

    @ObfuscatedName("kp.ln(II)V")
    public static final void method5248(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 255);
        if (var1 == Statics.field2126.method2298()) {
            return;
        }
        if (Statics.field2126.method2298() == 0 && field764 != -1) {
            class287.method417(Statics.field1825, field764, 0, var1, false);
            field765 = false;
        } else if (var1 == 0) {
            class287.method34();
            field765 = false;
        } else {
            class287.method459(var1);
        }
        Statics.field2126.method2287(var1);
    }

    @ObfuscatedName("r.ld(IS)V")
    public static final void method38(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field2126.method2344(var1);
    }

    @ObfuscatedName("l.ly(II)V")
    public static final void method261(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field2126.method2300(var1);
    }

    @ObfuscatedName("cs.lv(IB)V")
    public static final void method2154(int arg0) {
        method2889();
        class67.method2399();
        int var1 = class178.method2635(arg0).field1920;
        if (var1 == 0) {
            return;
        }
        int var2 = class296.field3445[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                method3164(0.9D);
            }
            if (var2 == 2) {
                method3164(0.8D);
            }
            if (var2 == 3) {
                method3164(0.7D);
            }
            if (var2 == 4) {
                method3164(0.6D);
            }
        }
        if (var1 == 3) {
            if (var2 == 0) {
                method5248(255);
            }
            if (var2 == 1) {
                method5248(192);
            }
            if (var2 == 2) {
                method5248(128);
            }
            if (var2 == 3) {
                method5248(64);
            }
            if (var2 == 4) {
                method5248(0);
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                method38(127);
            }
            if (var2 == 1) {
                method38(96);
            }
            if (var2 == 2) {
                method38(64);
            }
            if (var2 == 3) {
                method38(32);
            }
            if (var2 == 4) {
                method38(0);
            }
        }
        if (var1 == 5) {
            field599 = var2 == 1;
        }
        if (var1 == 6) {
            field685 = var2;
        }
        if (var1 == 9) {
            field686 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                method261(127);
            }
            if (var2 == 1) {
                method261(96);
            }
            if (var2 == 2) {
                method261(64);
            }
            if (var2 == 3) {
                method261(32);
            }
            if (var2 == 4) {
                method261(0);
            }
        }
        if (var1 == 17) {
            field701 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            class100[] var3 = new class100[] { class100.field1350, class100.field1344, class100.field1346, class100.field1348, class100.field1347 };
            field534 = (class100) class347.method1688(var3, var2);
            if (field534 == null) {
                field534 = class100.field1350;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field647 = -1;
            } else {
                field647 = var2 & 0x7FF;
            }
        }
        if (var1 != 22) {
            return;
        }
        class100[] var4 = new class100[] { class100.field1350, class100.field1344, class100.field1346, class100.field1348, class100.field1347 };
        field755 = (class100) class347.method1688(var4, var2);
        if (field755 == null) {
            field755 = class100.field1350;
        }
    }

    @ObfuscatedName("om.lr(Lkd;I)V")
    public static final void method7158(class306 arg0) {
        int var1 = arg0.field3643;
        if (var1 == 324) {
            if (field793 == -1) {
                field793 = arg0.field3577;
                field794 = arg0.field3640;
            }
            if (field552.field3475 == 1) {
                arg0.field3577 = field793;
            } else {
                arg0.field3577 = field794;
            }
        } else if (var1 == 325) {
            if (field793 == -1) {
                field793 = arg0.field3577;
                field794 = arg0.field3640;
            }
            if (field552.field3475 == 1) {
                arg0.field3577 = field794;
            } else {
                arg0.field3577 = field793;
            }
        } else if (var1 == 327) {
            arg0.field3610 = 150;
            arg0.field3597 = (int) (Math.sin((double) field519 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3586 = 5;
            arg0.field3605 = 0;
        } else if (var1 == 328) {
            arg0.field3610 = 150;
            arg0.field3597 = (int) (Math.sin((double) field519 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3586 = 5;
            arg0.field3605 = 1;
        }
    }

    @ObfuscatedName("im.lx(I)V")
    public static final void method4763() {
        class278 var0 = class278.method2890(class276.field3100, field567.field1425);
        field567.method2603(var0);
        class68.field869 = true;
        for (class84 var1 = (class84) field682.method7530(); var1 != null; var1 = (class84) field682.method7531()) {
            if (var1.field1067 == 0 || var1.field1067 == 3) {
                method72(var1, true);
            }
        }
        if (field687 != null) {
            method1922(field687);
            field687 = null;
        }
        class68.field869 = false;
    }

    @ObfuscatedName("r.la(IIII)Lcx;")
    public static final class84 method39(int arg0, int arg1, int arg2) {
        class84 var3 = new class84();
        var3.field1072 = arg1;
        var3.field1067 = arg2;
        field682.method7528(var3, (long) arg0);
        method1921(arg1);
        class306 var4 = Statics.method3181(arg0);
        method1922(var4);
        if (field687 != null) {
            method1922(field687);
            field687 = null;
        }
        method3169(Statics.field914[arg0 >> 16], var4, false);
        class68.method446(arg1);
        if (field681 != -1) {
            method5970(field681, 1);
        }
        return var3;
    }

    @ObfuscatedName("b.lo(Lcx;ZB)V")
    public static final void method72(class84 arg0, boolean arg1) {
        int var2 = arg0.field1072;
        int var3 = (int) arg0.field4686;
        arg0.method7230();
        if (arg1) {
            class306.method3501(var2);
        }
        method3206(var2);
        class306 var4 = Statics.method3181(var3);
        if (var4 != null) {
            method1922(var4);
        }
        if (field681 != -1) {
            method5970(field681, 1);
        }
    }

    @ObfuscatedName("cg.mn(Lkd;I)Z")
    public static final boolean method2451(class306 arg0) {
        int var1 = arg0.field3643;
        if (var1 == 205) {
            field568 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field552.method5288(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field552.method5266(var4, var5 == 1);
        }
        if (var1 == 324) {
            field552.method5267(0);
        }
        if (var1 == 325) {
            field552.method5267(1);
        }
        if (var1 == 326) {
            class278 var6 = class278.method2890(class276.field3051, field567.field1425);
            field552.method5268(var6.field3177);
            field567.method2603(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("cj.mt(Lkd;IIII)V")
    public static final void method2168(class306 arg0, int arg1, int arg2, int arg3) {
        method1542();
        class295 var4 = arg0.method5579(false);
        if (var4 == null) {
            return;
        }
        class477.method8112(arg1, arg2, var4.field3438 + arg1, var4.field3439 + arg2);
        if (field584 == 2 || field584 == 5) {
            class477.method8132(arg1, arg2, 0, var4.field3440, var4.field3437);
        } else {
            int var5 = field589 & 0x7FF;
            int var6 = Statics.field1790.field1243 / 32 + 48;
            int var7 = 464 - Statics.field1790.field1179 / 32;
            Statics.field2817.method8247(arg1, arg2, var4.field3438, var4.field3439, var6, var7, var5, 256, var4.field3440, var4.field3437);
            for (int var8 = 0; var8 < field757; var8++) {
                int var9 = field758[var8] * 4 + 2 - Statics.field1790.field1243 / 32;
                int var10 = field759[var8] * 4 + 2 - Statics.field1790.field1179 / 32;
                method4964(arg1, arg2, var9, var10, field760[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class352 var13 = field648[Statics.field4488][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field1790.field1243 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field1790.field1179 / 32;
                        method4964(arg1, arg2, var14, var15, Statics.field3327[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field563; var16++) {
                class97 var17 = field753[field719[var16]];
                if (var17 != null && var17.method2164()) {
                    class187 var18 = var17.field1319;
                    if (var18 != null && var18.field2059 != null) {
                        var18 = var18.method3323();
                    }
                    if (var18 != null && var18.field2051 && var18.field2062) {
                        int var19 = var17.field1243 / 32 - Statics.field1790.field1243 / 32;
                        int var20 = var17.field1179 / 32 - Statics.field1790.field1179 / 32;
                        method4964(arg1, arg2, var19, var20, Statics.field3327[1], var4);
                    }
                }
            }
            int var21 = class104.field1376;
            int[] var22 = class104.field1375;
            for (int var23 = 0; var23 < var21; var23++) {
                class89 var24 = field635[var22[var23]];
                if (var24 != null && var24.method2164() && !var24.field1142 && Statics.field1790 != var24) {
                    int var25 = var24.field1243 / 32 - Statics.field1790.field1243 / 32;
                    int var26 = var24.field1179 / 32 - Statics.field1790.field1179 / 32;
                    if (var24.method2163()) {
                        method4964(arg1, arg2, var25, var26, Statics.field3327[3], var4);
                    } else if (Statics.field1790.field1126 != 0 && var24.field1126 != 0 && Statics.field1790.field1126 == var24.field1126) {
                        method4964(arg1, arg2, var25, var26, Statics.field3327[4], var4);
                    } else if (var24.method2201()) {
                        method4964(arg1, arg2, var25, var26, Statics.field3327[5], var4);
                    } else if (var24.method2172()) {
                        method4964(arg1, arg2, var25, var26, Statics.field3327[6], var4);
                    } else {
                        method4964(arg1, arg2, var25, var26, Statics.field3327[2], var4);
                    }
                }
            }
            if (field526 != 0 && field519 % 20 < 10) {
                if (field526 == 1 && field527 >= 0 && field527 < field753.length) {
                    class97 var27 = field753[field527];
                    if (var27 != null) {
                        int var28 = var27.field1243 / 32 - Statics.field1790.field1243 / 32;
                        int var29 = var27.field1179 / 32 - Statics.field1790.field1179 / 32;
                        method510(arg1, arg2, var28, var29, Statics.field1703[1], var4);
                    }
                }
                if (field526 == 2) {
                    int var30 = field529 * 4 - Statics.field1780 * 4 + 2 - Statics.field1790.field1243 / 32;
                    int var31 = field570 * 4 - Statics.field4368 * 4 + 2 - Statics.field1790.field1179 / 32;
                    method510(arg1, arg2, var30, var31, Statics.field1703[1], var4);
                }
                if (field526 == 10 && field595 >= 0 && field595 < field635.length) {
                    class89 var32 = field635[field595];
                    if (var32 != null) {
                        int var33 = var32.field1243 / 32 - Statics.field1790.field1243 / 32;
                        int var34 = var32.field1179 / 32 - Statics.field1790.field1179 / 32;
                        method510(arg1, arg2, var33, var34, Statics.field1703[1], var4);
                    }
                }
            }
            if (field761 != 0) {
                int var35 = field761 * 4 + 2 - Statics.field1790.field1243 / 32;
                int var36 = field507 * 4 + 2 - Statics.field1790.field1179 / 32;
                method4964(arg1, arg2, var35, var36, Statics.field1703[0], var4);
            }
            if (!Statics.field1790.field1142) {
                class477.method8120(var4.field3438 / 2 + arg1 - 1, var4.field3439 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field733[arg3] = true;
    }

    @ObfuscatedName("aj.mg(Lkd;IIII)V")
    public static final void method857(class306 arg0, int arg1, int arg2, int arg3) {
        class295 var4 = arg0.method5579(false);
        if (var4 == null) {
            return;
        }
        if (field584 < 3) {
            Statics.field2330.method8247(arg1, arg2, var4.field3438, var4.field3439, 25, 25, field589, 256, var4.field3440, var4.field3437);
        } else {
            class477.method8132(arg1, arg2, 0, var4.field3440, var4.field3437);
        }
    }

    @ObfuscatedName("an.mz(IIIILrx;Lkv;I)V")
    public static final void method510(int arg0, int arg1, int arg2, int arg3, class481 arg4, class295 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method4964(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field589 & 0x7FF;
        int var8 = class213.field2486[var7];
        int var9 = class213.field2509[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field3438 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field1676.method8273(arg5.field3438 / 2 + arg0 - var17 / 2 + var15, arg5.field3439 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("jc.mx(IIIILrx;Lkv;I)V")
    public static final void method4964(int arg0, int arg1, int arg2, int arg3, class481 arg4, class295 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field589 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class213.field2486[var6];
        int var9 = class213.field2509[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method8251(arg5.field3438 / 2 + var10 - arg4.field5015 / 2, arg5.field3439 / 2 - var11 - arg4.field5016 / 2, arg0, arg1, arg5.field3438, arg5.field3439, arg5.field3440, arg5.field3437);
        } else {
            arg4.method8252(arg5.field3438 / 2 + arg0 + var10 - arg4.field5015 / 2, arg5.field3439 / 2 + arg1 - var11 - arg4.field5016 / 2);
        }
    }

    @ObfuscatedName("mk.ms(S)V")
    public static final void method6050() {
        for (int var0 = 0; var0 < class104.field1376; var0++) {
            class89 var1 = field635[class104.field1375[var0]];
            var1.method2165();
        }
        class107.method370();
        if (Statics.field3324 != null) {
            Statics.field3324.method6784();
        }
    }

    @ObfuscatedName("in.mk(S)V")
    public static final void method4788() {
        Iterator var0 = class107.field1418.iterator();
        while (var0.hasNext()) {
            class62 var1 = (class62) var0.next();
            var1.method1101();
        }
        if (Statics.field3324 != null) {
            Statics.field3324.method6793();
        }
    }

    @ObfuscatedName("fh.me(B)V")
    public static final void method3168() {
        for (int var0 = 0; var0 < class104.field1376; var0++) {
            class89 var1 = field635[class104.field1375[var0]];
            var1.method2174();
        }
    }

    @ObfuscatedName("an.ml(I)V")
    public static final void method554() {
        field718 = field706;
        Statics.field4573 = true;
    }

    @ObfuscatedName("ag.mb(Ljava/lang/String;S)V")
    public static final void method703(String arg0) {
        if (Statics.field3324 != null) {
            class278 var1 = class278.method2890(class276.field3091, field567.field1425);
            var1.field3177.method7789(class467.method155(arg0));
            var1.field3177.method7782(arg0);
            field567.method2603(var1);
        }
    }

    @ObfuscatedName("oe.mr(Ljava/lang/String;B)V")
    public static final void method6814(String arg0) {
        if (!arg0.equals("")) {
            class278 var1 = class278.method2890(class276.field3146, field567.field1425);
            var1.field3177.method7789(class467.method155(arg0));
            var1.field3177.method7782(arg0);
            field567.method2603(var1);
        }
    }

    @ObfuscatedName("r.mi(I)V")
    public static final void method54() {
        class278 var0 = class278.method2890(class276.field3146, field567.field1425);
        var0.field3177.method7789(0);
        field567.method2603(var0);
    }

    @ObfuscatedName("bl.md(III)V")
    public static final void method1092(int arg0, int arg1) {
        class157 var2 = arg0 >= 0 ? field633[arg0] : Statics.field1959;
        if (var2 == null || arg1 < 0 || arg1 >= var2.method3022()) {
            return;
        }
        class139 var3 = (class139) var2.field1804.get(arg1);
        if (var3.field1665 != -1) {
            return;
        }
        String var4 = var3.field1662.method8383();
        class278 var5 = class278.method2890(class276.field3143, field567.field1425);
        var5.field3177.method7789(3 + class467.method155(var4));
        var5.field3177.method7789(arg0);
        var5.field3177.method7776(arg1);
        var5.field3177.method7782(var4);
        field567.method2603(var5);
    }

    @ObfuscatedName("ln.mq(III)V")
    public static final void method5841(int arg0, int arg1) {
        if (field633[arg0] == null || arg1 < 0 || arg1 >= field633[arg0].method3022()) {
            return;
        }
        class139 var2 = (class139) field633[arg0].field1804.get(arg1);
        if (var2.field1665 != -1) {
            return;
        }
        class278 var3 = class278.method2890(class276.field3056, field567.field1425);
        var3.field3177.method7789(3 + class467.method155(var2.field1662.method8383()));
        var3.field3177.method7789(arg0);
        var3.field3177.method7776(arg1);
        var3.field3177.method7782(var2.field1662.method8383());
        field567.method2603(var3);
    }

    @ObfuscatedName("hz.mu(IIZI)V")
    public static final void method4230(int arg0, int arg1, boolean arg2) {
        if (field633[arg0] == null || arg1 < 0 || arg1 >= field633[arg0].method3022()) {
            return;
        }
        class139 var3 = (class139) field633[arg0].field1804.get(arg1);
        class278 var4 = class278.method2890(class276.field3079, field567.field1425);
        var4.field3177.method7789(4 + class467.method155(var3.field1662.method8383()));
        var4.field3177.method7789(arg0);
        var4.field3177.method7776(arg1);
        var4.field3177.method7781(arg2);
        var4.field3177.method7782(var3.field1662.method8383());
        field567.method2603(var4);
    }

    @ObfuscatedName("fi.mv(II)V")
    public static void method3206(int arg0) {
        for (class432 var1 = (class432) field559.method7530(); var1 != null; var1 = (class432) field559.method7531()) {
            if ((var1.field4686 >> 48 & 0xFFFFL) == (long) arg0) {
                var1.method7230();
            }
        }
    }

    @ObfuscatedName("fz.ma(Lkd;B)I")
    public static int method3180(class306 arg0) {
        class432 var1 = (class432) field559.method7535(((long) arg0.field3635 << 32) + (long) arg0.field3543);
        return var1 == null ? arg0.field3621 : var1.field4683;
    }

    @ObfuscatedName("bi.mo(Lkd;I)Z")
    public static boolean method1710(class306 arg0) {
        return arg0.field3595;
    }

    @ObfuscatedName("cq.mm(Lkd;I)Ljava/lang/String;")
    public static String method2110(class306 arg0) {
        if (class307.method2580(method3180(arg0)) == 0) {
            return null;
        } else if (arg0.field3633 == null || arg0.field3633.trim().length() == 0) {
            return null;
        } else {
            return arg0.field3633;
        }
    }

    @ObfuscatedName("dl.my(Ljava/lang/String;B)V")
    public static void method2607(String arg0) {
        Statics.field1636 = arg0;
        try {
            String var1 = Statics.field1488.getParameter(Integer.toString(18));
            String var2 = Statics.field1488.getParameter(Integer.toString(13));
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class311.method3154(Statics.method1118() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class28.method380(Statics.field1488, "document.cookie=\"" + var4 + "\"");
        } catch (Throwable var6) {
        }
    }

    @ObfuscatedName("kb.mp(Ljava/lang/String;ZI)V")
    public static void method5245(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field2248; var5++) {
            class197 var6 = class197.method3345(var5);
            if ((!arg1 || var6.field2259) && var6.field2250 == -1 && var6.field2215.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field1087 = -1;
                    Statics.field108 = null;
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
        Statics.field108 = var3;
        Statics.field1494 = 0;
        Statics.field1087 = var4;
        String[] var9 = new String[Statics.field1087];
        for (int var10 = 0; var10 < Statics.field1087; var10++) {
            var9[var10] = class197.method3345(var3[var10]).field2215;
        }
        short[] var11 = Statics.field108;
        class464.method2135(var9, var11, 0, var9.length - 1);
    }

    @ObfuscatedName("cq.mc([BII)V")
    public static void method2108(byte[] arg0, int arg1) {
        if (field561 == null) {
            field561 = new byte[24];
        }
        class374.method6637(arg0, arg1, field561, 0, 24);
    }

    @ObfuscatedName("cr.mh(Lqy;IB)V")
    public static void method2480(class467 arg0, int arg1) {
        method2108(arg0.field4917, arg1);
        class166.method2793(arg0, arg1);
    }

    @ObfuscatedName("client.mw(B)Lrp;")
    public class490 method1171() {
        return Statics.field1790 == null ? null : Statics.field1790.field1136;
    }

    @ObfuscatedName("fp.mf(I)Z")
    public static boolean method3130() {
        return field769 >= 2;
    }

    @ObfuscatedName("jb.nb(II)V")
    public static void method4929(int arg0) {
        field594 = arg0;
    }

    @ObfuscatedName("gw.nx(I)V")
    public static void method3776() {
        if (field594 == 1) {
            field530 = true;
        }
    }

    @ObfuscatedName("jc.nm(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method4961(String arg0) {
        class328[] var1 = class328.method3002();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class328 var3 = var1[var2];
            if (var3.field4164 != -1 && arg0.startsWith(class98.method7661(var3.field4164))) {
                arg0 = arg0.substring(6 + Integer.toString(var3.field4164).length());
                break;
            }
        }
        return arg0;
    }

    @ObfuscatedName("iv.nv(B)V")
    public static void method4796() {
        if (Statics.field242 == null) {
            return;
        }
        field802 = field519;
        Statics.field242.method6039();
        for (int var0 = 0; var0 < field635.length; var0++) {
            if (field635[var0] != null) {
                Statics.field242.method6028((field635[var0].field1243 >> 7) + Statics.field1780, (field635[var0].field1179 >> 7) + Statics.field4368);
            }
        }
    }

    @ObfuscatedName("hd.nu(I)V")
    public static void method4440() {
        Statics.field2126.method2304(field512);
    }

    @ObfuscatedName("al.ny(IS)V")
    public static void method700(int arg0) {
        if (field508 != arg0) {
            field508 = arg0;
        }
    }

    @ObfuscatedName("hi.np(S)Z")
    public static boolean method4033() {
        return field694 != null;
    }

    @ObfuscatedName("gy.ne(ZI)V")
    public static void method3811(boolean arg0) {
        field599 = arg0;
    }

    @ObfuscatedName("co.na(II)Lqf;")
    public static class461 method2280(int arg0) {
        class461 var1 = (class461) field725.method4917((long) arg0);
        if (var1 == null) {
            var1 = new class461(Statics.field4540, class463.method5261(arg0), class463.method7689(arg0));
            field725.method4925(var1, (long) arg0);
        }
        return var1;
    }

    @ObfuscatedName("oz.nl(II)Lqf;")
    public static class461 method7152(int arg0) {
        class461 var1 = (class461) field800.method4917((long) arg0);
        if (var1 == null) {
            var1 = new class461(Statics.field4540, arg0);
        }
        return var1;
    }
}

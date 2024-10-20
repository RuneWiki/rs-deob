package deob;

import com.jagex.oldscape.pub.OAuthApi;
import com.jagex.oldscape.pub.OtlTokenRequester;
import com.jagex.oldscape.pub.OtlTokenResponse;
import com.jagex.oldscape.pub.RefreshAccessTokenRequester;
import com.jagex.oldscape.pub.RefreshAccessTokenResponse;
import java.awt.datatransfer.Clipboard;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import netscape.javascript.JSObject;
import org.json.JSONException;
import org.json.JSONObject;

public final class client extends class35 implements class395, OAuthApi {

    @ObfuscatedName("client.w")
    public static class207[] field685;

    @ObfuscatedName("client.bj")
    public static boolean field535 = true;

    @ObfuscatedName("client.bf")
    public static int field601 = 1;

    @ObfuscatedName("client.bz")
    public static int field498 = 0;

    @ObfuscatedName("client.bm")
    public static int field499 = 0;

    @ObfuscatedName("client.bl")
    public static boolean field500 = false;

    @ObfuscatedName("client.bq")
    public static boolean field501 = false;

    @ObfuscatedName("client.bd")
    public static int field502 = -1;

    @ObfuscatedName("client.bg")
    public static int field629 = -1;

    @ObfuscatedName("client.bb")
    public static int field504 = -1;

    @ObfuscatedName("client.bk")
    public static boolean field661 = false;

    @ObfuscatedName("client.bs")
    public static int field506 = 211;

    @ObfuscatedName("client.cp")
    public static int field508 = 0;

    @ObfuscatedName("client.dz")
    public static boolean field510 = true;

    @ObfuscatedName("client.db")
    public static int field511 = 0;

    @ObfuscatedName("client.di")
    public static long field794 = -1L;

    @ObfuscatedName("client.dg")
    public static int field564 = -1;

    @ObfuscatedName("client.dm")
    public static int field514 = -1;

    @ObfuscatedName("client.dn")
    public static long field686 = -1L;

    @ObfuscatedName("client.df")
    public static boolean field516 = true;

    @ObfuscatedName("client.dv")
    public static int field677 = 0;

    @ObfuscatedName("client.dr")
    public static int field518 = 0;

    @ObfuscatedName("client.do")
    public static int field519 = 0;

    @ObfuscatedName("client.dt")
    public static int field520 = 0;

    @ObfuscatedName("client.dl")
    public static int field521 = 0;

    @ObfuscatedName("client.dh")
    public static int field540 = 0;

    @ObfuscatedName("client.dd")
    public static int field523 = 0;

    @ObfuscatedName("client.dp")
    public static int field763 = 0;

    @ObfuscatedName("client.ds")
    public static int field704 = 0;

    @ObfuscatedName("client.de")
    public static class99 field777 = class99.field1318;

    @ObfuscatedName("client.du")
    public static class99 field527 = class99.field1318;

    @ObfuscatedName("client.eq")
    public static int field528 = 0;

    @ObfuscatedName("client.ew")
    public static int field546 = 0;

    @ObfuscatedName("client.ej")
    public static int field530 = 0;

    @ObfuscatedName("client.fu")
    public static int field531 = 0;

    @ObfuscatedName("client.fk")
    public static int field743 = 0;

    @ObfuscatedName("client.fd")
    public static int field533 = 0;

    @ObfuscatedName("client.fs")
    public static int field534 = 0;

    @ObfuscatedName("client.fg")
    public static int field647 = 0;

    @ObfuscatedName("client.fq")
    public static class136 field536 = class136.field1625;

    @ObfuscatedName("client.fj")
    public static class479 field537 = class479.field4997;

    @ObfuscatedName("client.gk")
    public String field524;

    @ObfuscatedName("client.ga")
    public class15 field539;

    @ObfuscatedName("client.gf")
    public class19 field681;

    @ObfuscatedName("client.gi")
    public OtlTokenRequester field541;

    @ObfuscatedName("client.gx")
    public Future field542;

    @ObfuscatedName("client.gq")
    public boolean field543 = false;

    @ObfuscatedName("client.gw")
    public class19 field544;

    @ObfuscatedName("client.gj")
    public RefreshAccessTokenRequester field614;

    @ObfuscatedName("client.go")
    public Future field785;

    @ObfuscatedName("client.gd")
    public static final String field547;

    @ObfuscatedName("client.ge")
    public static boolean field549;

    @ObfuscatedName("client.gm")
    public static class74 field550;

    @ObfuscatedName("client.gv")
    public class474 field551;

    @ObfuscatedName("client.gt")
    public class8 field552;

    @ObfuscatedName("client.hz")
    public long field553 = -1L;

    @ObfuscatedName("client.hf")
    public static byte[] field554;

    @ObfuscatedName("client.hv")
    public static class96[] field683;

    @ObfuscatedName("client.hm")
    public static int field556;

    @ObfuscatedName("client.hy")
    public static int[] field557;

    @ObfuscatedName("client.hr")
    public static int field558;

    @ObfuscatedName("client.hk")
    public static int[] field559;

    @ObfuscatedName("client.hl")
    public static final class107 field689;

    @ObfuscatedName("client.hb")
    public static int field610;

    @ObfuscatedName("client.hw")
    public static boolean field562;

    @ObfuscatedName("client.hx")
    public static class382 field563;

    @ObfuscatedName("client.hc")
    public static HashMap field732;

    @ObfuscatedName("client.ip")
    public static int field566;

    @ObfuscatedName("client.iw")
    public static int field567;

    @ObfuscatedName("client.ii")
    public static int field568;

    @ObfuscatedName("client.id")
    public static int field569;

    @ObfuscatedName("client.ic")
    public static int field745;

    @ObfuscatedName("client.it")
    public static String field669;

    @ObfuscatedName("client.ik")
    public static boolean field692;

    @ObfuscatedName("client.iy")
    public static int[][][] field771;

    @ObfuscatedName("client.il")
    public static final int[] field574;

    @ObfuscatedName("client.if")
    public static int field575;

    @ObfuscatedName("client.jb")
    public static int field576;

    @ObfuscatedName("client.jp")
    public static int field577;

    @ObfuscatedName("client.jh")
    public static int field657;

    @ObfuscatedName("client.ja")
    public static int field637;

    @ObfuscatedName("client.jc")
    public static boolean field682;

    @ObfuscatedName("client.jr")
    public static int field579;

    @ObfuscatedName("client.jg")
    public static int field582;

    @ObfuscatedName("client.jw")
    public static int field583;

    @ObfuscatedName("client.jx")
    public static int field584;

    @ObfuscatedName("client.jk")
    public static int field585;

    @ObfuscatedName("client.ki")
    public static int field586;

    @ObfuscatedName("client.ku")
    public static int field548;

    @ObfuscatedName("client.kf")
    public static int field507;

    @ObfuscatedName("client.kq")
    public static int field589;

    @ObfuscatedName("client.kk")
    public static int field590;

    @ObfuscatedName("client.kt")
    public static int field591;

    @ObfuscatedName("client.kd")
    public static int field532;

    @ObfuscatedName("client.kx")
    public static int field593;

    @ObfuscatedName("client.kb")
    public static int field594;

    @ObfuscatedName("client.ke")
    public static int field595;

    @ObfuscatedName("client.ko")
    public static boolean field596;

    @ObfuscatedName("client.km")
    public static int field698;

    @ObfuscatedName("client.kr")
    public static boolean field598;

    @ObfuscatedName("client.kc")
    public static int field599;

    @ObfuscatedName("client.kn")
    public static int field600;

    @ObfuscatedName("client.kl")
    public static int field572;

    @ObfuscatedName("client.ka")
    public static int[] field602;

    @ObfuscatedName("client.kp")
    public static int[] field603;

    @ObfuscatedName("client.kh")
    public static int[] field782;

    @ObfuscatedName("client.kz")
    public static int[] field578;

    @ObfuscatedName("client.kw")
    public static int[] field606;

    @ObfuscatedName("client.kg")
    public static int[] field618;

    @ObfuscatedName("client.lj")
    public static int[] field727;

    @ObfuscatedName("client.lh")
    public static String[] field730;

    @ObfuscatedName("client.lc")
    public static int[][] field529;

    @ObfuscatedName("client.lw")
    public static int field665;

    @ObfuscatedName("client.lk")
    public static int field612;

    @ObfuscatedName("client.ly")
    public static int field613;

    @ObfuscatedName("client.lf")
    public static int field597;

    @ObfuscatedName("client.ls")
    public static int field615;

    @ObfuscatedName("client.lg")
    public static int field616;

    @ObfuscatedName("client.lb")
    public static int field617;

    @ObfuscatedName("client.lz")
    public static boolean field588;

    @ObfuscatedName("client.lp")
    public static int field744;

    @ObfuscatedName("client.le")
    public static int field620;

    @ObfuscatedName("client.lt")
    public static int field728;

    @ObfuscatedName("client.lq")
    public static int field622;

    @ObfuscatedName("client.lo")
    public static int field623;

    @ObfuscatedName("client.lu")
    public static int field708;

    @ObfuscatedName("client.lx")
    public static boolean field625;

    @ObfuscatedName("client.li")
    public static int field626;

    @ObfuscatedName("client.lm")
    public static int field627;

    @ObfuscatedName("client.ln")
    public static boolean field628;

    @ObfuscatedName("client.mk")
    public static class88[] field621;

    @ObfuscatedName("client.mp")
    public static int field630;

    @ObfuscatedName("client.ma")
    public static int field631;

    @ObfuscatedName("client.mg")
    public static long field632;

    @ObfuscatedName("client.mv")
    public static boolean field522;

    @ObfuscatedName("client.mb")
    public static int field634;

    @ObfuscatedName("client.mq")
    public static int field635;

    @ObfuscatedName("client.mn")
    public static int[] field636;

    @ObfuscatedName("client.ms")
    public static final int[] field716;

    @ObfuscatedName("client.my")
    public static String[] field607;

    @ObfuscatedName("client.mo")
    public static boolean[] field639;

    @ObfuscatedName("client.mf")
    public static int[] field624;

    @ObfuscatedName("client.mt")
    public static int field641;

    @ObfuscatedName("client.me")
    public static class356[][][] field642;

    @ObfuscatedName("client.mj")
    public static class356 field643;

    @ObfuscatedName("client.mc")
    public static class356 field644;

    @ObfuscatedName("client.mz")
    public static class356 field645;

    @ObfuscatedName("client.mh")
    public static int[] field646;

    @ObfuscatedName("client.mr")
    public static int[] field712;

    @ObfuscatedName("client.nc")
    public static int[] field648;

    @ObfuscatedName("client.ni")
    public static boolean field649;

    @ObfuscatedName("client.ne")
    public static boolean field650;

    @ObfuscatedName("client.np")
    public static int field651;

    @ObfuscatedName("client.nu")
    public static int[] field652;

    @ObfuscatedName("client.nq")
    public static int[] field758;

    @ObfuscatedName("client.nw")
    public static int[] field654;

    @ObfuscatedName("client.nm")
    public static int[] field655;

    @ObfuscatedName("client.nn")
    public static int[] field656;

    @ObfuscatedName("client.na")
    public static String[] field720;

    @ObfuscatedName("client.no")
    public static String[] field658;

    @ObfuscatedName("client.ny")
    public static boolean[] field659;

    @ObfuscatedName("client.ns")
    public static boolean field660;

    @ObfuscatedName("client.nt")
    public static boolean field581;

    @ObfuscatedName("client.nj")
    public static boolean field619;

    @ObfuscatedName("client.nz")
    public static boolean field663;

    @ObfuscatedName("client.nb")
    public static int field664;

    @ObfuscatedName("client.nx")
    public static int field604;

    @ObfuscatedName("client.ok")
    public static int field666;

    @ObfuscatedName("client.oh")
    public static int field667;

    @ObfuscatedName("client.om")
    public static int field668;

    @ObfuscatedName("client.oe")
    public static boolean field670;

    @ObfuscatedName("client.ol")
    public static int field573;

    @ObfuscatedName("client.oo")
    public static int field515;

    @ObfuscatedName("client.ow")
    public static String field673;

    @ObfuscatedName("client.ou")
    public static String field605;

    @ObfuscatedName("client.ob")
    public static int field675;

    @ObfuscatedName("client.oz")
    public static class451 field676;

    @ObfuscatedName("client.ox")
    public static int field799;

    @ObfuscatedName("client.os")
    public static int field678;

    @ObfuscatedName("client.oi")
    public static int field538;

    @ObfuscatedName("client.of")
    public static int field680;

    @ObfuscatedName("client.or")
    public static class310 field697;

    @ObfuscatedName("client.oj")
    public static int field497;

    @ObfuscatedName("client.op")
    public static int field717;

    @ObfuscatedName("client.oy")
    public static int field684;

    @ObfuscatedName("client.pl")
    public static int field791;

    @ObfuscatedName("client.pb")
    public static boolean field611;

    @ObfuscatedName("client.pn")
    public static class310 field687;

    @ObfuscatedName("client.pv")
    public static class310 field688;

    @ObfuscatedName("client.px")
    public static class310 field674;

    @ObfuscatedName("client.pq")
    public static int field802;

    @ObfuscatedName("client.po")
    public static int field691;

    @ObfuscatedName("client.pp")
    public static class310 field503;

    @ObfuscatedName("client.pj")
    public static boolean field693;

    @ObfuscatedName("client.pk")
    public static int field796;

    @ObfuscatedName("client.pe")
    public static int field804;

    @ObfuscatedName("client.pf")
    public static boolean field696;

    @ObfuscatedName("client.pm")
    public static int field736;

    @ObfuscatedName("client.ps")
    public static int field555;

    @ObfuscatedName("client.pt")
    public static boolean field517;

    @ObfuscatedName("client.py")
    public static int field700;

    @ObfuscatedName("client.pg")
    public static int[] field701;

    @ObfuscatedName("client.pr")
    public static int field505;

    @ObfuscatedName("client.pc")
    public static int[] field662;

    @ObfuscatedName("client.pu")
    public static int field525;

    @ObfuscatedName("client.qm")
    public static int[] field705;

    @ObfuscatedName("client.qz")
    public static int field706;

    @ObfuscatedName("client.qf")
    public static int[] field707;

    @ObfuscatedName("client.qq")
    public static int field699;

    @ObfuscatedName("client.qy")
    public static int field709;

    @ObfuscatedName("client.qd")
    public static int field710;

    @ObfuscatedName("client.qi")
    public static int field638;

    @ObfuscatedName("client.qu")
    public static int field695;

    @ObfuscatedName("client.qg")
    public static int field694;

    @ObfuscatedName("client.qs")
    public static int field714;

    @ObfuscatedName("client.qe")
    public static int field805;

    @ObfuscatedName("client.qj")
    public static int field762;

    @ObfuscatedName("client.qk")
    public static int field587;

    @ObfuscatedName("client.qx")
    public static class492 field718;

    @ObfuscatedName("client.qw")
    public static class356 field719;

    @ObfuscatedName("client.ql")
    public static class356 field769;

    @ObfuscatedName("client.qn")
    public static class356 field721;

    @ObfuscatedName("client.qv")
    public static class356 field722;

    @ObfuscatedName("client.qo")
    public static class451 field690;

    @ObfuscatedName("client.qc")
    public static int field724;

    @ObfuscatedName("client.rn")
    public static int field725;

    @ObfuscatedName("client.rr")
    public static boolean[] field726;

    @ObfuscatedName("client.rf")
    public static boolean[] field679;

    @ObfuscatedName("client.rl")
    public static boolean[] field561;

    @ObfuscatedName("client.ru")
    public static int[] field729;

    @ObfuscatedName("client.rd")
    public static int[] field571;

    @ObfuscatedName("client.rx")
    public static int[] field731;

    @ObfuscatedName("client.ri")
    public static int[] field640;

    @ObfuscatedName("client.rb")
    public static int field733;

    @ObfuscatedName("client.rz")
    public static long field734;

    @ObfuscatedName("client.ro")
    public static boolean field735;

    @ObfuscatedName("client.re")
    public static int[] field759;

    @ObfuscatedName("client.rg")
    public static int field737;

    @ObfuscatedName("client.rk")
    public static int field738;

    @ObfuscatedName("client.rw")
    public static String field739;

    @ObfuscatedName("client.rj")
    public static long[] field740;

    @ObfuscatedName("client.ra")
    public static int field741;

    @ObfuscatedName("client.rp")
    public static class206 field703;

    @ObfuscatedName("client.sp")
    public static class204 field753;

    @ObfuscatedName("client.si")
    public static int field760;

    @ObfuscatedName("client.sd")
    public static int[] field754;

    @ObfuscatedName("client.st")
    public static int[] field746;

    @ObfuscatedName("client.sf")
    public static long field747;

    @ObfuscatedName("client.se")
    public static class151[] field748;

    @ObfuscatedName("client.sw")
    public static class160[] field749;

    @ObfuscatedName("client.sq")
    public static int field750;

    @ObfuscatedName("client.sc")
    public static int field751;

    @ObfuscatedName("client.sb")
    public static int[] field608;

    @ObfuscatedName("client.sn")
    public static int[] field592;

    @ObfuscatedName("client.su")
    public static class488[] field580;

    @ObfuscatedName("client.sx")
    public static int field755;

    @ObfuscatedName("client.sr")
    public static int field756;

    @ObfuscatedName("client.tm")
    public static int field671;

    @ObfuscatedName("client.tb")
    public static int field723;

    @ObfuscatedName("client.tu")
    public static boolean field672;

    @ObfuscatedName("client.tc")
    public static int field761;

    @ObfuscatedName("client.tl")
    public static int[] field633;

    @ObfuscatedName("client.tg")
    public static int[] field609;

    @ObfuscatedName("client.tj")
    public static int[] field713;

    @ObfuscatedName("client.ts")
    public static int[] field765;

    @ObfuscatedName("client.ti")
    public static class40[] field766;

    @ObfuscatedName("client.tz")
    public static boolean field767;

    @ObfuscatedName("client.ul")
    public static boolean field768;

    @ObfuscatedName("client.uf")
    public static boolean[] field570;

    @ObfuscatedName("client.uc")
    public static int[] field770;

    @ObfuscatedName("client.uz")
    public static int[] field526;

    @ObfuscatedName("client.ub")
    public static int[] field772;

    @ObfuscatedName("client.ue")
    public static int[] field773;

    @ObfuscatedName("client.us")
    public static short field774;

    @ObfuscatedName("client.uv")
    public static short field775;

    @ObfuscatedName("client.ud")
    public static short field776;

    @ObfuscatedName("client.up")
    public static short field752;

    @ObfuscatedName("client.uw")
    public static short field764;

    @ObfuscatedName("client.ua")
    public static short field779;

    @ObfuscatedName("client.ut")
    public static short field780;

    @ObfuscatedName("client.uj")
    public static short field781;

    @ObfuscatedName("client.uh")
    public static int field496;

    @ObfuscatedName("client.uo")
    public static int field783;

    @ObfuscatedName("client.ug")
    public static int field784;

    @ObfuscatedName("client.uk")
    public static int field702;

    @ObfuscatedName("client.um")
    public static int field512;

    @ObfuscatedName("client.vn")
    public static class307 field787;

    @ObfuscatedName("client.va")
    public static int field788;

    @ObfuscatedName("client.vw")
    public static int field789;

    @ObfuscatedName("client.vh")
    public static class443 field790;

    @ObfuscatedName("client.vo")
    public static class346[] field560;

    @ObfuscatedName("client.vk")
    public static class63 field792;

    @ObfuscatedName("client.vd")
    public static class392 field793;

    @ObfuscatedName("client.vj")
    public static class273 field513;

    @ObfuscatedName("client.vy")
    public static class273 field795;

    @ObfuscatedName("client.ve")
    public static int field778;

    @ObfuscatedName("client.vs")
    public static int field797;

    @ObfuscatedName("client.vb")
    public static List field798;

    @ObfuscatedName("client.vu")
    public static ArrayList field653;

    @ObfuscatedName("client.wd")
    public static int field800;

    @ObfuscatedName("client.wy")
    public static int field801;

    @ObfuscatedName("client.wv")
    public static final class62 field545;

    @ObfuscatedName("client.ws")
    public static int[] field803;

    @ObfuscatedName("client.wx")
    public static int[] field786;

    static {
        byte[] var0 = class362.method6083("com_jagex_auth_desktop_osrs:public");
        int var1 = var0.length;
        StringBuilder var2 = new StringBuilder();
        for (int var3 = 0; var3 < var1; var3 += 3) {
            int var4 = var0[var3] & 0xFF;
            var2.append(class364.field4364[var4 >>> 2]);
            if (var3 < var1 - 1) {
                int var5 = var0[var3 + 1] & 0xFF;
                var2.append(class364.field4364[(var4 & 0x3) << 4 | var5 >>> 4]);
                if (var3 < var1 - 2) {
                    int var6 = var0[var3 + 2] & 0xFF;
                    var2.append(class364.field4364[(var5 & 0xF) << 2 | var6 >>> 6]).append(class364.field4364[var6 & 0x3F]);
                } else {
                    var2.append(class364.field4364[(var5 & 0xF) << 2]).append("=");
                }
            } else {
                var2.append(class364.field4364[(var4 & 0x3) << 4]).append("==");
            }
        }
        String var7 = var2.toString();
        field547 = var7;
        field549 = false;
        field550 = new class74();
        field554 = null;
        field683 = new class96[65536];
        field556 = 0;
        field557 = new int[65536];
        field558 = 0;
        field559 = new int[250];
        field689 = new class107();
        field610 = 0;
        field562 = false;
        field563 = new class382();
        field732 = new HashMap();
        field566 = 0;
        field567 = 1;
        field568 = 0;
        field569 = 1;
        field745 = 0;
        field685 = new class207[4];
        field692 = false;
        field771 = new int[4][13][13];
        field574 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
        field575 = 0;
        field576 = 2301979;
        field577 = 5063219;
        field657 = 3353893;
        field637 = 7759444;
        field682 = false;
        field579 = 0;
        field582 = 128;
        field583 = 0;
        field584 = 0;
        field585 = 0;
        field586 = 0;
        field548 = 0;
        field507 = 0;
        field589 = 50;
        field590 = 0;
        field591 = 0;
        field532 = 0;
        field593 = 12;
        field594 = 6;
        field595 = 0;
        field596 = false;
        field698 = 0;
        field598 = false;
        field599 = 0;
        field600 = 0;
        field572 = 50;
        field602 = new int[field572];
        field603 = new int[field572];
        field782 = new int[field572];
        field578 = new int[field572];
        field606 = new int[field572];
        field618 = new int[field572];
        field727 = new int[field572];
        field730 = new String[field572];
        field529 = new int[104][104];
        field665 = 0;
        field612 = -1;
        field613 = -1;
        field597 = 0;
        field615 = 0;
        field616 = 0;
        field617 = 0;
        field588 = true;
        field744 = 0;
        field620 = 0;
        field728 = 0;
        field622 = 0;
        field623 = 0;
        field708 = 0;
        field625 = false;
        field626 = 0;
        field627 = 0;
        field628 = true;
        field621 = new class88[2048];
        field630 = -1;
        field631 = 0;
        field632 = -1L;
        field522 = true;
        field634 = 0;
        field635 = 0;
        field636 = new int[1000];
        field716 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };
        field607 = new String[8];
        field639 = new boolean[8];
        field624 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };
        field641 = -1;
        field642 = new class356[4][104][104];
        field643 = new class356();
        field644 = new class356();
        field645 = new class356();
        field646 = new int[25];
        field712 = new int[25];
        field648 = new int[25];
        field649 = false;
        field650 = false;
        field651 = 0;
        field652 = new int[500];
        field758 = new int[500];
        field654 = new int[500];
        field655 = new int[500];
        field656 = new int[500];
        field720 = new String[500];
        field658 = new String[500];
        field659 = new boolean[500];
        field660 = false;
        field581 = false;
        field619 = false;
        field663 = true;
        field664 = -1;
        field604 = -1;
        field666 = 0;
        field667 = 50;
        field668 = 0;
        field669 = null;
        field670 = false;
        field573 = -1;
        field515 = -1;
        field673 = null;
        field605 = null;
        field675 = -1;
        field676 = new class451(8);
        field799 = 0;
        field678 = -1;
        field538 = 0;
        field680 = 0;
        field697 = null;
        field497 = 0;
        field717 = 0;
        field684 = 0;
        field791 = -1;
        field611 = false;
        field687 = null;
        field688 = null;
        field674 = null;
        field802 = 0;
        field691 = 0;
        field503 = null;
        field693 = false;
        field796 = -1;
        field804 = -1;
        field696 = false;
        field736 = -1;
        field555 = -1;
        field517 = false;
        field700 = 1;
        field701 = new int[32];
        field505 = 0;
        field662 = new int[32];
        field525 = 0;
        field705 = new int[32];
        field706 = 0;
        field707 = new int[32];
        field699 = 0;
        field709 = 0;
        field710 = 0;
        field638 = 0;
        field695 = 0;
        field694 = 0;
        field714 = 0;
        field805 = 0;
        field762 = 0;
        field587 = 0;
        field718 = new class492();
        field719 = new class356();
        field769 = new class356();
        field721 = new class356();
        field722 = new class356();
        field690 = new class451(512);
        field724 = 0;
        field725 = -2;
        field726 = new boolean[100];
        field679 = new boolean[100];
        field561 = new boolean[100];
        field729 = new int[100];
        field571 = new int[100];
        field731 = new int[100];
        field640 = new int[100];
        field733 = 0;
        field734 = 0L;
        field735 = true;
        field759 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
        field737 = 0;
        field738 = 0;
        field739 = "";
        field740 = new long[100];
        field741 = 0;
        field703 = new class206();
        field753 = new class204();
        field760 = 0;
        field754 = new int[128];
        field746 = new int[128];
        field747 = -1L;
        field748 = new class151[4];
        field749 = new class160[4];
        field750 = -1;
        field751 = 0;
        field608 = new int[1000];
        field592 = new int[1000];
        field580 = new class488[1000];
        field755 = 0;
        field756 = 0;
        field671 = 0;
        field723 = -1;
        field672 = false;
        field761 = 0;
        field633 = new int[50];
        field609 = new int[50];
        field713 = new int[50];
        field765 = new int[50];
        field766 = new class40[50];
        field767 = false;
        field768 = false;
        field570 = new boolean[5];
        field770 = new int[5];
        field526 = new int[5];
        field772 = new int[5];
        field773 = new int[5];
        field774 = 256;
        field775 = 205;
        field776 = 256;
        field752 = 320;
        field764 = 1;
        field779 = 32767;
        field780 = 1;
        field781 = 32767;
        field496 = 0;
        field783 = 0;
        field784 = 0;
        field702 = 0;
        field512 = 0;
        field787 = new class307();
        field788 = -1;
        field789 = -1;
        field790 = new class441();
        field560 = new class346[8];
        field792 = new class63();
        field793 = new class392(8, class390.field4517);
        field513 = new class273(64);
        field795 = new class273(64);
        field778 = -1;
        field797 = -1;
        field798 = new ArrayList();
        field653 = new ArrayList(10);
        field800 = 0;
        field801 = 0;
        field545 = new class62();
        field803 = new int[50];
        field786 = new int[50];
    }

    @ObfuscatedName("lf.ek(I)Lqf;")
    public static class445 method5881() {
        return Statics.field4300;
    }

    @ObfuscatedName("client.ah(I)V")
    public final void method533() {
    }

    public final void init() {
        if (!this.method506()) {
            return;
        }
        for (int var1 = 0; var1 <= 28; var1++) {
            String var2 = this.getParameter(Integer.toString(var1));
            if (var2 != null) {
                switch(var1) {
                    case 3:
                        if (var2.equalsIgnoreCase(class97.field1304)) {
                            field500 = true;
                        } else {
                            field500 = false;
                        }
                        break;
                    case 4:
                        if (field629 == -1) {
                            field629 = Integer.parseInt(var2);
                        }
                        break;
                    case 5:
                        field498 = Integer.parseInt(var2);
                        break;
                    case 6:
                        int var10 = Integer.parseInt(var2);
                        class352 var11;
                        if (var10 >= 0 && var10 < class352.field4320.length) {
                            var11 = class352.field4320[var10];
                        } else {
                            var11 = null;
                        }
                        Statics.field268 = var11;
                        break;
                    case 7:
                        int var4 = Integer.parseInt(var2);
                        class325[] var5 = new class325[] { class325.field3805, class325.field3804, class325.field3806, class325.field3808 };
                        class325[] var6 = var5;
                        int var7 = 0;
                        class325 var9;
                        while (true) {
                            if (var7 >= var6.length) {
                                var9 = null;
                                break;
                            }
                            class325 var8 = var6[var7];
                            if (var8.field3802 == var4) {
                                var9 = var8;
                                break;
                            }
                            var7++;
                        }
                        Statics.field1701 = var9;
                        break;
                    case 8:
                        if (var2.equalsIgnoreCase(class97.field1304)) {
                        }
                        break;
                    case 9:
                        Statics.field4624 = var2;
                        break;
                    case 10:
                        Statics.field1607 = (class326) class351.method19(class326.method4922(), Integer.parseInt(var2));
                        if (Statics.field1607 == class326.field3815) {
                            Statics.field3020 = class454.field4852;
                        } else {
                            Statics.field3020 = class454.field4859;
                        }
                        break;
                    case 11:
                        Statics.field806 = var2;
                        break;
                    case 12:
                        field601 = Integer.parseInt(var2);
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
                        Statics.field487 = Integer.parseInt(var2);
                        break;
                    case 15:
                        field499 = Integer.parseInt(var2);
                        break;
                    case 17:
                        Statics.field2071 = var2;
                        break;
                    case 21:
                        field502 = Integer.parseInt(var2);
                        break;
                    case 25:
                        int var3 = var2.indexOf(".");
                        if (var3 == -1) {
                            field506 = Integer.parseInt(var2);
                        } else {
                            field506 = Integer.parseInt(var2.substring(0, var3));
                            Integer.parseInt(var2.substring(var3 + 1));
                        }
                }
            }
        }
        class220.field2577 = false;
        field501 = false;
        Statics.field4260 = this.getCodeBase().getHost();
        String var12 = Statics.field1701.field3807;
        byte var13 = 0;
        try {
            Statics.field1851 = 22;
            Statics.field1105 = var13;
            try {
                Statics.field1845 = System.getProperty("os.name");
            } catch (Exception var80) {
                Statics.field1845 = "Unknown";
            }
            Statics.field2099 = Statics.field1845.toLowerCase();
            try {
                Statics.field1431 = System.getProperty("user.home");
                if (Statics.field1431 != null) {
                    Statics.field1431 = Statics.field1431 + "/";
                }
            } catch (Exception var79) {
            }
            try {
                if (Statics.field2099.startsWith("win")) {
                    if (Statics.field1431 == null) {
                        Statics.field1431 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field1431 == null) {
                    Statics.field1431 = System.getenv("HOME");
                }
                if (Statics.field1431 != null) {
                    Statics.field1431 = Statics.field1431 + "/";
                }
            } catch (Exception var78) {
            }
            if (Statics.field1431 == null) {
                Statics.field1431 = "~/";
            }
            Statics.field1786 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1431, "/tmp/", "" };
            Statics.field1585 = new String[] { ".jagex_cache_" + Statics.field1105, ".file_store_" + Statics.field1105 };
            int var17 = 0;
            label342: while (var17 < 4) {
                String var18 = var17 == 0 ? "" : "" + var17;
                Statics.field1447 = new File(Statics.field1431, "jagex_cl_oldschool_" + var12 + var18 + ".dat");
                String var19 = null;
                String var20 = null;
                boolean var21 = false;
                if (Statics.field1447.exists()) {
                    try {
                        class456 var22 = new class456(Statics.field1447, "rw", 10000L);
                        class474 var23 = new class474((int) var22.method7739());
                        while (var23.field4939 < var23.field4936.length) {
                            int var24 = var22.method7738(var23.field4936, var23.field4939, var23.field4936.length - var23.field4939);
                            if (var24 == -1) {
                                throw new IOException();
                            }
                            var23.field4939 += var24;
                        }
                        var23.field4939 = 0;
                        int var25 = var23.method7964();
                        if (var25 < 1 || var25 > 3) {
                            throw new IOException("" + var25);
                        }
                        int var26 = 0;
                        if (var25 > 1) {
                            var26 = var23.method7964();
                        }
                        if (var25 <= 2) {
                            var19 = var23.method7975();
                            if (var26 == 1) {
                                var20 = var23.method7975();
                            }
                        } else {
                            var19 = var23.method7976();
                            if (var26 == 1) {
                                var20 = var23.method7976();
                            }
                        }
                        var22.method7735();
                    } catch (IOException var83) {
                        var83.printStackTrace();
                    }
                    if (var19 != null) {
                        File var28 = new File(var19);
                        if (!var28.exists()) {
                            var19 = null;
                        }
                    }
                    if (var19 != null) {
                        File var29 = new File(var19, "test.dat");
                        boolean var32;
                        try {
                            RandomAccessFile var30 = new RandomAccessFile(var29, "rw");
                            int var31 = var30.read();
                            var30.seek(0L);
                            var30.write(var31);
                            var30.seek(0L);
                            var30.close();
                            var29.delete();
                            var32 = true;
                        } catch (Exception var77) {
                            var32 = false;
                        }
                        if (!var32) {
                            var19 = null;
                        }
                    }
                }
                if (var19 == null && var17 == 0) {
                    label318: for (int var34 = 0; var34 < Statics.field1585.length; var34++) {
                        for (int var35 = 0; var35 < Statics.field1786.length; var35++) {
                            File var36 = new File(Statics.field1786[var35] + Statics.field1585[var34] + File.separatorChar + "oldschool" + File.separatorChar);
                            if (var36.exists()) {
                                File var37 = new File(var36, "test.dat");
                                boolean var40;
                                try {
                                    RandomAccessFile var38 = new RandomAccessFile(var37, "rw");
                                    int var39 = var38.read();
                                    var38.seek(0L);
                                    var38.write(var39);
                                    var38.seek(0L);
                                    var38.close();
                                    var37.delete();
                                    var40 = true;
                                } catch (Exception var76) {
                                    var40 = false;
                                }
                                if (var40) {
                                    var19 = var36.toString();
                                    var21 = true;
                                    break label318;
                                }
                            }
                        }
                    }
                }
                if (var19 == null) {
                    var19 = Statics.field1431 + File.separatorChar + "jagexcache" + var18 + File.separatorChar + "oldschool" + File.separatorChar + var12 + File.separatorChar;
                    var21 = true;
                }
                if (var20 != null) {
                    File var42 = new File(var20);
                    File var43 = new File(var19);
                    try {
                        File[] var44 = var42.listFiles();
                        File[] var45 = var44;
                        for (int var46 = 0; var46 < var45.length; var46++) {
                            File var47 = var45[var46];
                            File var48 = new File(var43, var47.getName());
                            boolean var49 = var47.renameTo(var48);
                            if (!var49) {
                                throw new IOException();
                            }
                        }
                    } catch (Exception var82) {
                        var82.printStackTrace();
                    }
                    var21 = true;
                }
                if (var21) {
                    File var51 = new File(var19);
                    Object var52 = null;
                    try {
                        class456 var53 = new class456(Statics.field1447, "rw", 10000L);
                        class474 var54 = new class474(500);
                        var54.method7947(3);
                        var54.method7947(var52 == null ? 0 : 1);
                        var54.method8011(var51.getPath());
                        if (var52 != null) {
                            var54.method8011(((File) var52).getPath());
                        }
                        var53.method7734(var54.field4936, 0, var54.field4939);
                        var53.method7735();
                    } catch (IOException var75) {
                        var75.printStackTrace();
                    }
                }
                File var56 = new File(var19);
                Statics.field4573 = var56;
                if (!Statics.field4573.exists()) {
                    Statics.field4573.mkdirs();
                }
                File[] var57 = Statics.field4573.listFiles();
                if (var57 == null) {
                    break;
                }
                File[] var58 = var57;
                int var59 = 0;
                while (true) {
                    if (var59 >= var58.length) {
                        break label342;
                    }
                    File var60 = var58[var59];
                    boolean var63;
                    try {
                        RandomAccessFile var61 = new RandomAccessFile(var60, "rw");
                        int var62 = var61.read();
                        var61.seek(0L);
                        var61.write(var62);
                        var61.seek(0L);
                        var61.close();
                        var63 = true;
                    } catch (Exception var74) {
                        var63 = false;
                    }
                    if (!var63) {
                        var17++;
                        break;
                    }
                    var59++;
                }
            }
            class172.method2309(Statics.field4573);
            try {
                File var65 = new File(Statics.field1431, "random.dat");
                if (var65.exists()) {
                    class170.field1854 = new class457(new class456(var65, "rw", 25L), 24, 0);
                } else {
                    label271: for (int var66 = 0; var66 < Statics.field1585.length; var66++) {
                        for (int var67 = 0; var67 < Statics.field1786.length; var67++) {
                            File var68 = new File(Statics.field1786[var67] + Statics.field1585[var66] + File.separatorChar + "random.dat");
                            if (var68.exists()) {
                                class170.field1854 = new class457(new class456(var68, "rw", 25L), 24, 0);
                                break label271;
                            }
                        }
                    }
                }
                if (class170.field1854 == null) {
                    RandomAccessFile var69 = new RandomAccessFile(var65, "rw");
                    int var70 = var69.read();
                    var69.seek(0L);
                    var69.write(var70);
                    var69.seek(0L);
                    var69.close();
                    class170.field1854 = new class457(new class456(var65, "rw", 25L), 24, 0);
                }
            } catch (IOException var81) {
            }
            class170.field1853 = new class457(new class456(class172.method6617("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class170.field1856 = new class457(new class456(class172.method6617("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field108 = new class457[Statics.field1851];
            for (int var72 = 0; var72 < Statics.field1851; var72++) {
                Statics.field108[var72] = new class457(new class456(class172.method6617("main_file_cache.idx" + var72), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var84) {
            class500.method2855((String) null, var84);
        }
        Statics.field427 = this;
        Statics.field5094 = field629;
        Statics.field2621 = System.getenv("JX_ACCESS_TOKEN");
        Statics.field1756 = System.getenv("JX_REFRESH_TOKEN");
        Statics.field3450 = System.getenv("JX_SESSION_ID");
        Statics.field1963 = System.getenv("JX_CHARACTER_ID");
        class72.method4299(System.getenv("JX_DISPLAY_NAME"));
        if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
            this.field543 = true;
        }
        if (field504 == -1) {
            if (this.method1634() || this.method1150()) {
                field504 = 5;
            } else {
                field504 = 0;
            }
        }
        this.method504(765, 503, 211, 1);
    }

    public void setOtlTokenRequester(OtlTokenRequester arg0) {
        if (arg0 != null) {
            this.field541 = arg0;
            class72.method689(10);
        }
    }

    public void setRefreshTokenRequester(RefreshAccessTokenRequester arg0) {
        if (arg0 != null) {
            this.field614 = arg0;
        }
    }

    public boolean isOnLoginScreen() {
        return field508 == 10;
    }

    public long getAccountHash() {
        return this.field553;
    }

    @ObfuscatedName("client.fx(I)Z")
    public boolean method1634() {
        return Statics.field2621 != null && !Statics.field2621.trim().isEmpty() && Statics.field1756 != null && !Statics.field1756.trim().isEmpty();
    }

    @ObfuscatedName("client.fh(I)Z")
    public boolean method1150() {
        return Statics.field3450 != null && !Statics.field3450.trim().isEmpty() && Statics.field1963 != null && !Statics.field1963.trim().isEmpty();
    }

    @ObfuscatedName("client.fm(S)Z")
    public boolean method1151() {
        return this.field541 != null;
    }

    @ObfuscatedName("client.fe(Ljava/lang/String;I)V")
    public void method1152(String arg0) throws IOException {
        HashMap var2 = new HashMap();
        var2.put("grant_type", "refresh_token");
        var2.put("scope", "gamesso.token.create");
        var2.put("refresh_token", arg0);
        URL var3 = new URL(Statics.field806 + "shield/oauth/token" + (new class431(var2)).method7418());
        class388 var4 = new class388();
        var4.method6871(field547);
        var4.method6882("Host", (new URL(Statics.field806)).getHost());
        var4.method6853(class428.field4681);
        class10 var5 = class10.field32;
        RefreshAccessTokenRequester var6 = this.field614;
        if (var6 == null) {
            class11 var7 = new class11(var3, var5, var4, this.field543);
            this.field544 = this.field539.method180(var7);
        } else {
            this.field785 = var6.request(var5.method75(), var3, var4.method6845(), "");
        }
    }

    @ObfuscatedName("client.fl(Ljava/lang/String;I)V")
    public void method1478(String arg0) throws IOException {
        URL var2 = new URL(Statics.field806 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
        class388 var3 = new class388();
        var3.method6874(arg0);
        class10 var4 = class10.field33;
        OtlTokenRequester var5 = this.field541;
        if (var5 == null) {
            class11 var6 = new class11(var2, var4, var3, this.field543);
            this.field681 = this.field539.method180(var6);
        } else {
            this.field542 = var5.request(var4.method75(), var2, var3.method6845(), "");
        }
    }

    @ObfuscatedName("client.fu(Ljava/lang/String;Ljava/lang/String;I)V")
    public void method1146(String arg0, String arg1) throws IOException, JSONException {
        URL var3 = new URL(Statics.field806 + "/game-session/v1/tokens");
        class11 var4 = new class11(var3, class10.field32, this.field543);
        var4.method93().method6874(arg0);
        var4.method93().method6853(class428.field4681);
        JSONObject var5 = new JSONObject();
        var5.put("accountId", (Object) arg1);
        var4.method89(new class430(var5));
        this.field681 = this.field539.method180(var4);
    }

    @ObfuscatedName("client.ai(I)V")
    public final void method516() {
        int[] var1 = new int[] { 20, 260, 10000 };
        int[] var2 = new int[] { 1000, 100, 500 };
        if (var1 == null || var2 == null) {
            Statics.field1873 = null;
            Statics.field1595 = null;
            Statics.field41 = (byte[][][]) null;
            class380.method687();
        } else {
            Statics.field1873 = var1;
            Statics.field1595 = new int[var1.length];
            Statics.field41 = new byte[var1.length][][];
            for (int var3 = 0; var3 < Statics.field1873.length; var3++) {
                Statics.field41[var3] = new byte[var2[var3]][];
                class380.field4444.add(var1[var3]);
            }
            Collections.sort(class380.field4444);
        }
        Statics.field6 = field499 == 0 ? 43594 : field601 + 40000;
        Statics.field60 = field499 == 0 ? 443 : field601 + 50000;
        Statics.field3727 = Statics.field6;
        Statics.field4484 = class309.field3533;
        Statics.field1436 = class309.field3534;
        Statics.field2386 = class309.field3535;
        Statics.field1380 = class309.field3536;
        Statics.field2910 = new class109(this.field543, 211);
        this.method542();
        this.method499();
        Statics.field3827 = this.method492();
        this.method498(field753, 0);
        this.method498(field703, 1);
        Statics.field65 = new class411(255, class170.field1853, class170.field1856, 500000);
        Statics.field1404 = class94.method2990();
        this.method493();
        class32.method4300(this, Statics.field4541);
        method3136(Statics.field1404.method2389());
        Statics.field1944 = new class65(Statics.field3020);
        this.field539 = new class15("tokenRequest", 1, 1);
    }

    @ObfuscatedName("client.ax(I)V")
    public final void method496() {
        field511++;
        this.method1157();
        class334.method4859();
        try {
            if (class291.field3359 == 1) {
                int var1 = Statics.field3361.method5120();
                if (var1 > 0 && Statics.field3361.method5126()) {
                    int var2 = var1 - Statics.field2311;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    Statics.field3361.method5197(var2);
                } else {
                    Statics.field3361.method5125();
                    Statics.field3361.method5194();
                    if (Statics.field18 == null) {
                        class291.field3359 = 0;
                    } else {
                        class291.field3359 = 2;
                    }
                    Statics.field4676 = null;
                    Statics.field1768 = null;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field3361.method5125();
            class291.field3359 = 0;
            Statics.field4676 = null;
            Statics.field1768 = null;
            Statics.field18 = null;
        }
        method3415();
        field703.method3817();
        this.method514();
        class36.method86();
        if (Statics.field3827 != null) {
            int var4 = Statics.field3827.method305();
            field587 = var4;
        }
        if (field508 == 0) {
            method6458();
            class35.method3810();
        } else if (field508 == 5) {
            class72.method2705(this, Statics.field895);
            method6458();
            class35.method3810();
        } else if (field508 == 10 || field508 == 11) {
            class72.method2705(this, Statics.field895);
        } else if (field508 == 20) {
            class72.method2705(this, Statics.field895);
            this.method1160();
        } else if (field508 == 50) {
            class72.method2705(this, Statics.field895);
            this.method1160();
        } else if (field508 == 25) {
            method6400();
        }
        if (field508 == 30) {
            this.method1161();
        } else if (field508 == 40 || field508 == 45) {
            this.method1160();
        }
    }

    @ObfuscatedName("client.az(ZI)V")
    public final void method518(boolean arg0) {
        boolean var2;
        label143: {
            try {
                if (class291.field3359 == 2) {
                    if (Statics.field4676 == null) {
                        Statics.field4676 = class296.method5291(Statics.field18, Statics.field115, Statics.field1803);
                        if (Statics.field4676 == null) {
                            var2 = false;
                            break label143;
                        }
                    }
                    if (Statics.field1768 == null) {
                        Statics.field1768 = new class46(Statics.field3360, Statics.field3362);
                    }
                    if (Statics.field3361.method5121(Statics.field4676, Statics.field3363, Statics.field1768, 22050)) {
                        Statics.field3361.method5122();
                        Statics.field3361.method5197(Statics.field3358);
                        Statics.field3361.method5124(Statics.field4676, Statics.field4674);
                        class291.field3359 = 0;
                        Statics.field4676 = null;
                        Statics.field1768 = null;
                        Statics.field18 = null;
                        var2 = true;
                        break label143;
                    }
                }
            } catch (Exception var10) {
                var10.printStackTrace();
                Statics.field3361.method5125();
                class291.field3359 = 0;
                Statics.field4676 = null;
                Statics.field1768 = null;
                Statics.field18 = null;
            }
            var2 = false;
        }
        if (var2 && field672 && Statics.field339 != null) {
            Statics.field339.method775();
        }
        if ((field508 == 10 || field508 == 20 || field508 == 30) && field734 != 0L && class287.method3099() > field734) {
            method3136(method1094());
        }
        if (arg0) {
            for (int var5 = 0; var5 < 100; var5++) {
                field726[var5] = true;
            }
        }
        if (field508 == 0) {
            this.method520(class72.field914, class72.field915, arg0);
        } else if (field508 == 5) {
            class72.method6127(Statics.field109, Statics.field3055, Statics.field895);
        } else if (field508 == 10 || field508 == 11) {
            class72.method6127(Statics.field109, Statics.field3055, Statics.field895);
        } else if (field508 == 20) {
            class72.method6127(Statics.field109, Statics.field3055, Statics.field895);
        } else if (field508 == 50) {
            class72.method6127(Statics.field109, Statics.field3055, Statics.field895);
        } else if (field508 == 25) {
            if (field745 == 1) {
                if (field566 > field567) {
                    field567 = field566;
                }
                int var6 = (field567 * 50 - field566 * 50) / field567;
                method3161(class330.field3996 + class97.field1303 + class97.field1301 + var6 + "%" + class97.field1302, false);
            } else if (field745 == 2) {
                if (field568 > field569) {
                    field569 = field568;
                }
                int var7 = (field569 * 50 - field568 * 50) / field569 + 50;
                method3161(class330.field3996 + class97.field1303 + class97.field1301 + var7 + "%" + class97.field1302, false);
            } else {
                method3161(class330.field3996, false);
            }
        } else if (field508 == 30) {
            this.method1163();
        } else if (field508 == 40) {
            method3161(class330.field4008 + class97.field1303 + class330.field3851, false);
        } else if (field508 == 45) {
            method3161(class330.field4123, false);
        }
        if (field508 == 30 && field733 == 0 && !arg0 && !field735) {
            for (int var8 = 0; var8 < field724; var8++) {
                if (field679[var8]) {
                    Statics.field153.method468(field729[var8], field571[var8], field731[var8], field640[var8]);
                    field679[var8] = false;
                }
            }
        } else if (field508 > 0) {
            Statics.field153.method467(0, 0);
            for (int var9 = 0; var9 < field724; var9++) {
                field679[var9] = false;
            }
        }
    }

    @ObfuscatedName("client.ap(I)V")
    public final void method519() {
        if (Statics.field35.method2641()) {
            Statics.field35.method2631();
        }
        if (Statics.field265 != null) {
            Statics.field265.field1076 = false;
        }
        Statics.field265 = null;
        field689.method2690();
        if (class36.field244 != null) {
            class36 var1 = class36.field244;
            synchronized (class36.field244) {
                class36.field244 = null;
            }
        }
        Statics.field3827 = null;
        if (Statics.field339 != null) {
            Statics.field339.method803();
        }
        if (Statics.field2941 != null) {
            Statics.field2941.method803();
        }
        class338.method3869();
        Object var3 = class334.field4201;
        synchronized (class334.field4201) {
            if (class334.field4200 != 0) {
                class334.field4200 = 1;
                try {
                    class334.field4201.wait();
                } catch (InterruptedException var6) {
                }
            }
        }
        if (Statics.field2910 != null) {
            Statics.field2910.method2716();
            Statics.field2910 = null;
        }
        class170.method5851();
        this.field539.method176();
    }

    @ObfuscatedName("iq.fi(II)V")
    public static void method4858(int arg0) {
        if (field508 == arg0) {
            return;
        }
        if (field508 == 30) {
            field753.method3795();
        }
        if (field508 == 0) {
            Statics.field427.method625();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45 || arg0 == 50) {
            method6222(0);
            field533 = 0;
            field534 = 0;
            field563.method6822(arg0);
            if (arg0 != 20) {
                method6618(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field2819 != null) {
            Statics.field2819.method7150();
            Statics.field2819 = null;
        }
        if (field508 == 25) {
            field745 = 0;
            field566 = 0;
            field567 = 1;
            field568 = 0;
            field569 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            int var1 = method3092() ? 0 : 12;
            Statics.method2940(Statics.field491, Statics.field3034, true, var1);
        } else if (arg0 == 20) {
            int var2 = field508 == 11 ? 4 : 0;
            Statics.method2940(Statics.field491, Statics.field3034, false, var2);
        } else if (arg0 == 11) {
            Statics.method2940(Statics.field491, Statics.field3034, false, 4);
        } else if (arg0 == 50) {
            class72.method1996("", "Updating date of birth...", "");
            Statics.method2940(Statics.field491, Statics.field3034, false, 7);
        } else if (Statics.field904) {
            Statics.field1698 = null;
            Statics.field907 = null;
            Statics.field906 = null;
            Statics.field941 = null;
            Statics.field3053 = null;
            Statics.field199 = null;
            Statics.field909 = null;
            Statics.field933 = null;
            Statics.field911 = null;
            Statics.field5070 = null;
            Statics.field3531 = null;
            Statics.field4528 = null;
            Statics.field155 = null;
            Statics.field936 = null;
            Statics.field3484.method2348();
            class291.method423(2);
            if (Statics.field4244 != null) {
                try {
                    class474 var3 = new class474(4);
                    var3.method7947(2);
                    var3.method7949(0);
                    Statics.field4244.method7152(var3.field4936, 0, 4);
                } catch (IOException var7) {
                    try {
                        Statics.field4244.method7150();
                    } catch (Exception var6) {
                    }
                    class338.field4245++;
                    Statics.field4244 = null;
                }
            }
            Statics.field904 = false;
        }
        field508 = arg0;
    }

    @ObfuscatedName("client.fk(I)V")
    public void method1157() {
        if (field508 != 1000) {
            boolean var1 = class338.method2554();
            if (!var1) {
                this.method1299();
            }
        }
    }

    @ObfuscatedName("client.fd(S)V")
    public void method1299() {
        if (class338.field4246 >= 4) {
            this.method522("js5crc");
            method4858(1000);
            return;
        }
        if (class338.field4245 >= 4) {
            if (field508 <= 5) {
                this.method522("js5io");
                method4858(1000);
                return;
            }
            field530 = 3000;
            class338.field4245 = 3;
        }
        if (--field530 + 1 > 0) {
            return;
        }
        try {
            if (field546 == 0) {
                Statics.field2876 = Statics.field207.method3219(Statics.field4260, Statics.field3727);
                field546++;
            }
            if (field546 == 1) {
                if (Statics.field2876.field1898 == 2) {
                    this.method1475(-1);
                    return;
                }
                if (Statics.field2876.field1898 == 1) {
                    field546++;
                }
            }
            if (field546 == 2) {
                Socket var1 = (Socket) Statics.field2876.field1901;
                class408 var2 = new class408(var1, 40000, 5000);
                Statics.field425 = var2;
                class474 var3 = new class474(5);
                var3.method7947(15);
                var3.method8048(211);
                Statics.field425.method7152(var3.field4936, 0, 5);
                field546++;
                Statics.field2017 = class287.method3099();
            }
            if (field546 == 3) {
                if (Statics.field425.method7146() > 0) {
                    int var4 = Statics.field425.method7148();
                    if (var4 != 0) {
                        this.method1475(var4);
                        return;
                    }
                    field546++;
                } else if (class287.method3099() - Statics.field2017 > 30000L) {
                    this.method1475(-2);
                    return;
                }
            }
            if (field546 == 4) {
                class407 var5 = Statics.field425;
                boolean var6 = field508 > 20;
                if (Statics.field4244 != null) {
                    try {
                        Statics.field4244.method7150();
                    } catch (Exception var21) {
                    }
                    Statics.field4244 = null;
                }
                Statics.field4244 = var5;
                if (Statics.field4244 != null) {
                    try {
                        class474 var8 = new class474(4);
                        var8.method7947(var6 ? 2 : 3);
                        var8.method7949(0);
                        Statics.field4244.method7152(var8.field4936, 0, 4);
                    } catch (IOException var20) {
                        try {
                            Statics.field4244.method7150();
                        } catch (Exception var19) {
                        }
                        class338.field4245++;
                        Statics.field4244 = null;
                    }
                }
                class338.field4258.field4939 = 0;
                Statics.field2975 = null;
                Statics.field82 = null;
                class338.field4251 = 0;
                while (true) {
                    class336 var11 = (class336) class338.field4243.method7708();
                    if (var11 == null) {
                        while (true) {
                            class336 var12 = (class336) class338.field4248.method7708();
                            if (var12 == null) {
                                if (class338.field4249 != 0) {
                                    try {
                                        class474 var13 = new class474(4);
                                        var13.method7947(4);
                                        var13.method7947(class338.field4249);
                                        var13.method7950(0);
                                        Statics.field4244.method7152(var13.field4936, 0, 4);
                                    } catch (IOException var18) {
                                        try {
                                            Statics.field4244.method7150();
                                        } catch (Exception var17) {
                                        }
                                        class338.field4245++;
                                        Statics.field4244 = null;
                                    }
                                }
                                class338.field4238 = 0;
                                Statics.field4253 = class287.method3099();
                                Statics.field2876 = null;
                                Statics.field425 = null;
                                field546 = 0;
                                field531 = 0;
                                return;
                            }
                            class338.field4239.method6226(var12);
                            class338.field4250.method7716(var12, var12.field4711);
                            class338.field4247++;
                            class338.field4256--;
                        }
                    }
                    class338.field4241.method7716(var11, var11.field4711);
                    class338.field4242++;
                    class338.field4257--;
                }
            }
        } catch (IOException var22) {
            this.method1475(-3);
        }
    }

    @ObfuscatedName("client.fs(II)V")
    public void method1475(int arg0) {
        Statics.field2876 = null;
        Statics.field425 = null;
        field546 = 0;
        if (Statics.field6 == Statics.field3727) {
            Statics.field3727 = Statics.field60;
        } else {
            Statics.field3727 = Statics.field6;
        }
        field531++;
        if (field531 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field508 <= 5) {
                this.method522("js5connect_full");
                method4858(1000);
            } else {
                field530 = 3000;
            }
        } else if (field531 >= 2 && arg0 == 6) {
            this.method522("js5connect_outofdate");
            method4858(1000);
        } else if (field531 >= 4) {
            if (field508 <= 5) {
                this.method522("js5connect");
                method4858(1000);
            } else {
                field530 = 3000;
            }
        }
    }

    @ObfuscatedName("iy.fg(Llm;Ljava/lang/String;I)V")
    public static void method4908(class335 arg0, String arg1) {
        class80 var2 = new class80(arg0, arg1);
        field653.add(var2);
        field801 += var2.field1030;
    }

    @ObfuscatedName("dp.fq(B)I")
    public static int method2837() {
        if (field653 == null || field800 >= field653.size()) {
            return 10000;
        }
        int var0 = 0;
        for (int var1 = 0; var1 <= field800; var1++) {
            var0 += ((class80) field653.get(var1)).field1028;
        }
        return var0 * 10000 / field801;
    }

    @ObfuscatedName("o.fj(IB)I")
    public static int method267(int arg0) {
        return arg0 * 3 + 600;
    }

    @ObfuscatedName("fa.fr(III)V")
    public static void method3260(int arg0, int arg1) {
        int[] var2 = new int[9];
        for (int var3 = 0; var3 < var2.length; var3++) {
            int var4 = var3 * 32 + 128 + 15;
            int var5 = method267(var4);
            int var6 = class217.field2515[var4];
            int var7 = arg1 - 334;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 100) {
                var7 = 100;
            }
            int var8 = (field752 - field776) * var7 / 100 + field776;
            int var9 = var5 * var8 / 256;
            var2[var3] = var6 * var9 >> 16;
        }
        class220.method4147(var2, 500, 800, arg0 * 334 / arg1, 334);
    }

    @ObfuscatedName("ne.fw(B)V")
    public static void method6458() {
        if (field528 == 0) {
            Statics.field3022 = new class220(4, 104, 104, class78.field1015);
            for (int var0 = 0; var0 < 4; var0++) {
                field685[var0] = new class207(104, 104);
            }
            Statics.field186 = new class488(512, 512);
            class72.field915 = class330.field3852;
            class72.field914 = 5;
            field528 = 20;
        } else if (field528 == 20) {
            class72.field915 = class330.field4012;
            class72.field914 = 10;
            field528 = 30;
        } else if (field528 == 30) {
            Statics.field71 = method691(0, false, true, true, false);
            Statics.field4546 = method691(1, false, true, true, false);
            Statics.field4403 = method691(2, true, false, true, false);
            Statics.field1676 = method691(3, false, true, true, false);
            Statics.field1002 = method691(4, false, true, true, false);
            Statics.field4261 = method691(5, true, true, true, false);
            Statics.field1761 = method691(6, true, true, true, false);
            Statics.field1751 = method691(7, false, true, true, false);
            Statics.field3034 = method691(8, false, true, true, false);
            Statics.field1705 = method691(9, false, true, true, false);
            Statics.field491 = method691(10, false, true, true, false);
            Statics.field3449 = method691(11, false, true, true, false);
            Statics.field66 = method691(12, false, true, true, false);
            Statics.field1159 = method691(13, true, false, true, false);
            Statics.field1883 = method691(14, false, true, true, false);
            Statics.field3333 = method691(15, false, true, true, false);
            Statics.field2355 = method691(17, true, true, true, false);
            Statics.field4663 = method691(18, false, true, true, false);
            Statics.field240 = method691(19, false, true, true, false);
            Statics.field160 = method691(20, false, true, true, false);
            Statics.field133 = method691(21, false, true, true, true);
            class72.field915 = class330.field3854;
            class72.field914 = 20;
            field528 = 40;
        } else if (field528 == 40) {
            byte var1 = 0;
            int var2 = var1 + Statics.field71.method5958() * 4 / 100;
            int var3 = var2 + Statics.field4546.method5958() * 4 / 100;
            int var4 = var3 + Statics.field4403.method5958() * 2 / 100;
            int var5 = var4 + Statics.field1676.method5958() * 2 / 100;
            int var6 = var5 + Statics.field1002.method5958() * 6 / 100;
            int var7 = var6 + Statics.field4261.method5958() * 4 / 100;
            int var8 = var7 + Statics.field1761.method5958() * 2 / 100;
            int var9 = var8 + Statics.field1751.method5958() * 55 / 100;
            int var10 = var9 + Statics.field3034.method5958() * 2 / 100;
            int var11 = var10 + Statics.field1705.method5958() * 2 / 100;
            int var12 = var11 + Statics.field491.method5958() * 2 / 100;
            int var13 = var12 + Statics.field3449.method5958() * 2 / 100;
            int var14 = var13 + Statics.field66.method5958() * 2 / 100;
            int var15 = var14 + Statics.field1159.method5958() * 2 / 100;
            int var16 = var15 + Statics.field1883.method5958() * 2 / 100;
            int var17 = var16 + Statics.field3333.method5958() * 2 / 100;
            int var18 = var17 + Statics.field240.method5958() / 100;
            int var19 = var18 + Statics.field4663.method5958() / 100;
            int var20 = var19 + Statics.field160.method5958() / 100;
            int var21 = var20 + Statics.field133.method5958() / 100;
            int var22 = var21 + (Statics.field2355.method5926() && Statics.field2355.method6034() ? 1 : 0);
            if (var22 == 100) {
                method4908(Statics.field71, "Animations");
                method4908(Statics.field4546, "Skeletons");
                method4908(Statics.field1002, "Sound FX");
                method4908(Statics.field4261, "Maps");
                method4908(Statics.field1761, "Music Tracks");
                method4908(Statics.field1751, "Models");
                method4908(Statics.field3034, "Sprites");
                method4908(Statics.field3449, "Music Jingles");
                method4908(Statics.field1883, "Music Samples");
                method4908(Statics.field3333, "Music Patches");
                method4908(Statics.field240, "World Map");
                method4908(Statics.field4663, "World Map Geography");
                method4908(Statics.field160, "World Map Ground");
                Statics.field475 = new class413();
                Statics.field475.method7215(Statics.field2355);
                class72.field915 = class330.field3856;
                class72.field914 = 30;
                field528 = 45;
            } else {
                if (var22 != 0) {
                    class72.field915 = class330.field4151 + var22 + "%";
                }
                class72.field914 = 30;
            }
        } else if (field528 == 45) {
            class43.method6208(22050, !field501, 2);
            class292 var23 = new class292();
            var23.method5127(9, 128);
            Statics.field339 = class43.method1821(Statics.field207, 0, 22050);
            Statics.field339.method772(var23);
            class335 var24 = Statics.field3333;
            class335 var25 = Statics.field1883;
            class335 var26 = Statics.field1002;
            Statics.field3363 = var24;
            Statics.field3362 = var25;
            Statics.field3360 = var26;
            Statics.field3361 = var23;
            Statics.field2941 = class43.method1821(Statics.field207, 1, 2048);
            Statics.field2376 = new class39();
            Statics.field2941.method772(Statics.field2376);
            Statics.field2998 = new class56(22050, Statics.field3322);
            class72.field915 = class330.field3857;
            class72.field914 = 35;
            field528 = 50;
            Statics.field1817 = new class446(Statics.field3034, Statics.field1159);
        } else if (field528 == 50) {
            int var27 = class447.method7669().length;
            field732 = Statics.field1817.method7662(class447.method7669());
            if (field732.size() < var27) {
                class72.field915 = class330.field3858 + field732.size() * 100 / var27 + "%";
                class72.field914 = 40;
            } else {
                Statics.field3055 = (class372) field732.get(class447.field4825);
                Statics.field895 = (class372) field732.get(class447.field4832);
                Statics.field109 = (class372) field732.get(class447.field4831);
                Statics.field1455 = field790.method7434();
                class72.field915 = class330.field3859;
                class72.field914 = 40;
                field528 = 60;
            }
        } else if (field528 == 60) {
            int var28 = class72.method4869(Statics.field491, Statics.field3034);
            class335 var29 = Statics.field3034;
            int var30 = class72.field943.length + class72.field942.length;
            String[] var31 = class72.field903;
            for (int var32 = 0; var32 < var31.length; var32++) {
                String var33 = var31[var32];
                if (var29.method5988(var33) != -1) {
                    var30++;
                }
            }
            if (var28 < var30) {
                class72.field915 = class330.field3860 + var28 * 100 / var30 + "%";
                class72.field914 = 50;
            } else {
                class72.field915 = class330.field4088;
                class72.field914 = 50;
                method4858(5);
                field528 = 70;
            }
        } else if (field528 == 70) {
            if (!Statics.field4403.method6034()) {
                class72.field915 = class330.field3862 + Statics.field4403.method5938() + "%";
                class72.field914 = 60;
            } else if (Statics.field133.method6034()) {
                class202.method2300(Statics.field4403);
                class335 var36 = Statics.field4403;
                Statics.field2104 = var36;
                class335 var37 = Statics.field4403;
                class335 var38 = Statics.field1751;
                Statics.field1967 = var37;
                Statics.field1966 = var38;
                Statics.field1976 = Statics.field1967.method5982(3);
                class335 var39 = Statics.field4403;
                class335 var40 = Statics.field1751;
                boolean var41 = field501;
                Statics.field2197 = var39;
                Statics.field2155 = var40;
                class200.field2166 = var41;
                class191.method4909(Statics.field4403, Statics.field1751);
                class335 var42 = Statics.field4403;
                Statics.field2125 = var42;
                class335 var43 = Statics.field4403;
                class335 var44 = Statics.field1751;
                boolean var45 = field500;
                class372 var46 = Statics.field3055;
                Statics.field11 = var43;
                Statics.field2209 = var44;
                Statics.field2210 = var45;
                Statics.field2240 = Statics.field11.method5982(10);
                Statics.field1643 = var46;
                class203.method45(Statics.field4403, Statics.field71, Statics.field4546);
                class335 var47 = Statics.field4403;
                class335 var48 = Statics.field1751;
                Statics.field2081 = var47;
                Statics.field2082 = var48;
                Statics.method76(Statics.field4403);
                class182.method4861(Statics.field4403);
                class335 var49 = Statics.field1676;
                class335 var50 = Statics.field1751;
                class335 var51 = Statics.field3034;
                class335 var52 = Statics.field1159;
                Statics.field1433 = var49;
                Statics.field1690 = var50;
                Statics.field822 = var51;
                Statics.field991 = var52;
                Statics.field2984 = new class310[Statics.field1433.method6055()][];
                Statics.field4692 = new boolean[Statics.field1433.method6055()];
                class335 var53 = Statics.field4403;
                Statics.field1922 = var53;
                class188.method2205(Statics.field4403);
                class184.method1984(Statics.field4403);
                class195.method3097(Statics.field4403);
                class335 var54 = Statics.field4403;
                Statics.field2124 = var54;
                class467.method317(Statics.field4403);
                class469.method3648(Statics.field4403);
                Statics.field5071 = new class459(Statics.field1607, 54, Statics.field268, Statics.field4403);
                Statics.field2362 = new class459(Statics.field1607, 47, Statics.field268, Statics.field4403);
                Statics.field35 = new class105();
                class335 var55 = Statics.field4403;
                class335 var56 = Statics.field3034;
                class335 var57 = Statics.field1159;
                Statics.field5089 = var55;
                Statics.field2137 = var56;
                Statics.field2130 = var57;
                class186.method2076(Statics.field4403, Statics.field3034);
                class183.method2233(Statics.field4403, Statics.field3034);
                class72.field915 = class330.field3863;
                class72.field914 = 60;
                field528 = 80;
            } else {
                class72.field915 = class330.field3862 + (80 + Statics.field66.method5938() / 6) + "%";
                class72.field914 = 60;
            }
        } else if (field528 == 80) {
            int var58 = 0;
            if (Statics.field338 == null) {
                Statics.field338 = class489.method8225(Statics.field3034, Statics.field475.field4619, 0);
            } else {
                var58++;
            }
            if (Statics.field3192 == null) {
                Statics.field3192 = class489.method8225(Statics.field3034, Statics.field475.field4622, 0);
            } else {
                var58++;
            }
            if (Statics.field1934 == null) {
                class335 var59 = Statics.field3034;
                int var60 = Statics.field475.field4615;
                class487[] var61;
                if (class489.method8212(var59, var60, 0)) {
                    class487[] var62 = new class487[Statics.field5044];
                    for (int var63 = 0; var63 < Statics.field5044; var63++) {
                        class487 var64 = var62[var63] = new class487();
                        var64.field5022 = Statics.field5042;
                        var64.field5025 = Statics.field5043;
                        var64.field5028 = Statics.field5045[var63];
                        var64.field5029 = Statics.field489[var63];
                        var64.field5024 = Statics.field4537[var63];
                        var64.field5026 = Statics.field1597[var63];
                        var64.field5023 = Statics.field1335;
                        var64.field5027 = Statics.field1655[var63];
                    }
                    class489.method2590();
                    var61 = var62;
                } else {
                    var61 = null;
                }
                Statics.field1934 = var61;
            } else {
                var58++;
            }
            if (Statics.field1798 == null) {
                Statics.field1798 = class489.method4285(Statics.field3034, Statics.field475.field4616, 0);
            } else {
                var58++;
            }
            if (Statics.field4375 == null) {
                Statics.field4375 = class489.method4285(Statics.field3034, Statics.field475.field4617, 0);
            } else {
                var58++;
            }
            if (Statics.field2942 == null) {
                Statics.field2942 = class489.method4285(Statics.field3034, Statics.field475.field4618, 0);
            } else {
                var58++;
            }
            if (Statics.field1467 == null) {
                Statics.field1467 = class489.method4285(Statics.field3034, Statics.field475.field4621, 0);
            } else {
                var58++;
            }
            if (Statics.field3729 == null) {
                Statics.field3729 = class489.method4285(Statics.field3034, Statics.field475.field4620, 0);
            } else {
                var58++;
            }
            if (Statics.field1421 == null) {
                Statics.field1421 = class489.method4285(Statics.field3034, Statics.field475.field4623, 0);
            } else {
                var58++;
            }
            if (Statics.field1925 == null) {
                class335 var66 = Statics.field3034;
                int var67 = Statics.field475.field4614;
                class487[] var68;
                if (class489.method8212(var66, var67, 0)) {
                    class487[] var69 = new class487[Statics.field5044];
                    for (int var70 = 0; var70 < Statics.field5044; var70++) {
                        class487 var71 = var69[var70] = new class487();
                        var71.field5022 = Statics.field5042;
                        var71.field5025 = Statics.field5043;
                        var71.field5028 = Statics.field5045[var70];
                        var71.field5029 = Statics.field489[var70];
                        var71.field5024 = Statics.field4537[var70];
                        var71.field5026 = Statics.field1597[var70];
                        var71.field5023 = Statics.field1335;
                        var71.field5027 = Statics.field1655[var70];
                    }
                    class489.method2590();
                    var68 = var69;
                } else {
                    var68 = null;
                }
                Statics.field1925 = var68;
            } else {
                var58++;
            }
            if (Statics.field4190 == null) {
                class335 var73 = Statics.field3034;
                int var74 = Statics.field475.field4625;
                class487[] var75;
                if (class489.method8212(var73, var74, 0)) {
                    class487[] var76 = new class487[Statics.field5044];
                    for (int var77 = 0; var77 < Statics.field5044; var77++) {
                        class487 var78 = var76[var77] = new class487();
                        var78.field5022 = Statics.field5042;
                        var78.field5025 = Statics.field5043;
                        var78.field5028 = Statics.field5045[var77];
                        var78.field5029 = Statics.field489[var77];
                        var78.field5024 = Statics.field4537[var77];
                        var78.field5026 = Statics.field1597[var77];
                        var78.field5023 = Statics.field1335;
                        var78.field5027 = Statics.field1655[var77];
                    }
                    class489.method2590();
                    var75 = var76;
                } else {
                    var75 = null;
                }
                Statics.field4190 = var75;
            } else {
                var58++;
            }
            if (var58 < 11) {
                class72.field915 = class330.field3880 + var58 * 100 / 12 + "%";
                class72.field914 = 70;
            } else {
                Statics.field4414 = Statics.field4190;
                Statics.field3192.method8422();
                int var80 = (int) (Math.random() * 21.0D) - 10;
                int var81 = (int) (Math.random() * 21.0D) - 10;
                int var82 = (int) (Math.random() * 21.0D) - 10;
                int var83 = (int) (Math.random() * 41.0D) - 20;
                Statics.field1934[0].method8371(var80 + var83, var81 + var83, var82 + var83);
                class72.field915 = class330.field3865;
                class72.field914 = 70;
                field528 = 90;
            }
        } else if (field528 == 90) {
            if (Statics.field1705.method6034()) {
                Statics.field3803 = new class226(Statics.field1705, Statics.field3034, 20, Statics.field1404.method2441(), field501 ? 64 : 128);
                class217.method3986(Statics.field3803);
                class217.method4070(Statics.field1404.method2441());
                field528 = 100;
            } else {
                class72.field915 = class330.field3866 + "0%";
                class72.field914 = 90;
            }
        } else if (field528 == 100) {
            int var84 = Statics.field3803.method4329();
            if (var84 < 100) {
                class72.field915 = class330.field3866 + var84 + "%";
                class72.field914 = 90;
            } else {
                class72.field915 = class330.field4144;
                class72.field914 = 90;
                field528 = 110;
            }
        } else if (field528 == 110) {
            Statics.field265 = new class85();
            Statics.field207.method3226(Statics.field265, 10);
            class72.field915 = class330.field3868;
            class72.field914 = 92;
            field528 = 120;
        } else if (field528 == 120) {
            if (Statics.field491.method5991("huffman", "")) {
                class312 var85 = new class312(Statics.field491.method5971("huffman", ""));
                Statics.field3719 = var85;
                class72.field915 = class330.field3870;
                class72.field914 = 94;
                field528 = 130;
            } else {
                class72.field915 = class330.field3869 + "%";
                class72.field914 = 94;
            }
        } else if (field528 == 130) {
            if (!Statics.field1676.method6034()) {
                class72.field915 = class330.field3879 + Statics.field1676.method5938() * 4 / 5 + "%";
                class72.field914 = 96;
            } else if (!Statics.field66.method6034()) {
                class72.field915 = class330.field3879 + (80 + Statics.field66.method5938() / 6) + "%";
                class72.field914 = 96;
            } else if (Statics.field1159.method6034()) {
                class72.field915 = class330.field3872;
                class72.field914 = 98;
                field528 = 140;
            } else {
                class72.field915 = class330.field3879 + (96 + Statics.field1159.method5938() / 50) + "%";
                class72.field914 = 96;
            }
        } else if (field528 == 140) {
            class72.field914 = 100;
            if (Statics.field240.method5992(class261.field3014.field3016)) {
                if (Statics.field4300 == null) {
                    Statics.field4300 = new class445();
                    Statics.field4300.method7462(Statics.field240, Statics.field4663, Statics.field160, Statics.field109, field732, Statics.field1934);
                }
                class72.field915 = class330.field3874;
                field528 = 150;
            } else {
                class72.field915 = class330.field3934 + Statics.field240.method5994(class261.field3014.field3016) / 10 + "%";
            }
        } else if (field528 == 150) {
            method4858(10);
        }
    }

    @ObfuscatedName("ap.ft(IZZZZI)Llm;")
    public static class335 method691(int arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        class411 var5 = null;
        if (class170.field1853 != null) {
            var5 = new class411(arg0, class170.field1853, Statics.field108[arg0], 1000000);
        }
        return new class335(var5, Statics.field65, arg0, arg1, arg2, arg3, arg4);
    }

    @ObfuscatedName("client.fv(I)V")
    public final void method1160() {
        class407 var1 = field689.method2699();
        class473 var2 = field689.field1397;
        try {
            if (field743 == 0) {
                if (Statics.field4270 == null && (field550.method2085() || field533 > 250)) {
                    Statics.field4270 = field550.method2087();
                    field550.method2084();
                    field550 = null;
                }
                if (Statics.field4270 != null) {
                    if (var1 != null) {
                        var1.method7150();
                        var1 = null;
                    }
                    Statics.field4589 = null;
                    field562 = false;
                    field533 = 0;
                    if (!field537.method8258()) {
                        method6222(1);
                    } else if (this.method1634()) {
                        try {
                            this.method1152(Statics.field1756);
                            method6222(21);
                        } catch (Throwable var75) {
                            class500.method2855((String) null, var75);
                            method482(65);
                            return;
                        }
                    } else if (this.method1150()) {
                        try {
                            this.method1146(Statics.field3450, Statics.field1963);
                            method6222(20);
                        } catch (Exception var74) {
                            class500.method2855((String) null, var74);
                            method482(65);
                            return;
                        }
                    } else {
                        method482(65);
                        return;
                    }
                }
            }
            if (field743 == 21) {
                if (this.field785 == null) {
                    if (this.field544 == null) {
                        method482(65);
                        return;
                    }
                    if (!this.field544.method272()) {
                        return;
                    }
                    if (this.field544.method275()) {
                        class500.method2855(this.field544.method270(), (Throwable) null);
                        method482(65);
                        this.field544 = null;
                        return;
                    }
                    class21 var7 = this.field544.method273();
                    if (var7.method293() != 200) {
                        method482(65);
                        this.field544 = null;
                        return;
                    }
                    field533 = 0;
                    class430 var8 = new class430(var7.method291());
                    try {
                        Statics.field2621 = var8.method7411().getString("access_token");
                        Statics.field1756 = var8.method7411().getString("refresh_token");
                    } catch (Exception var72) {
                        class500.method2855("Error parsing tokens", var72);
                        method482(65);
                        this.field544 = null;
                        return;
                    }
                } else if (this.field785.isDone()) {
                    if (this.field785.isCancelled()) {
                        method482(65);
                        this.field785 = null;
                        return;
                    }
                    try {
                        RefreshAccessTokenResponse var5 = (RefreshAccessTokenResponse) this.field785.get();
                        if (!var5.isSuccess()) {
                            method482(65);
                            this.field785 = null;
                            return;
                        }
                        Statics.field2621 = var5.getAccessToken();
                        Statics.field1756 = var5.getRefreshToken();
                        this.field785 = null;
                    } catch (Exception var73) {
                        class500.method2855((String) null, var73);
                        method482(65);
                        this.field785 = null;
                        return;
                    }
                } else {
                    return;
                }
                this.method1478(Statics.field2621);
                method6222(20);
            }
            if (field743 == 20) {
                if (this.field542 == null) {
                    if (this.field681 == null) {
                        method482(65);
                        return;
                    }
                    if (!this.field681.method272()) {
                        return;
                    }
                    if (this.field681.method275()) {
                        class500.method2855(this.field681.method270(), (Throwable) null);
                        method482(65);
                        this.field681 = null;
                        return;
                    }
                    class21 var12 = this.field681.method273();
                    if (var12.method293() != 200) {
                        class500.method2855("Response code: " + var12.method293() + "Response body: " + var12.method291(), (Throwable) null);
                        method482(65);
                        this.field681 = null;
                        return;
                    }
                    List var13 = (List) var12.method290().get("Content-Type");
                    if (var13 != null && var13.contains(class428.field4681.method7397())) {
                        try {
                            JSONObject var14 = new JSONObject(var12.method291());
                            this.field524 = var14.getString("token");
                        } catch (JSONException var70) {
                            class500.method2855((String) null, var70);
                            method482(65);
                            this.field681 = null;
                            return;
                        }
                    } else {
                        this.field524 = var12.method291();
                    }
                    this.field681 = null;
                } else if (this.field542.isDone()) {
                    if (this.field542.isCancelled()) {
                        method482(65);
                        this.field542 = null;
                        return;
                    }
                    try {
                        OtlTokenResponse var10 = (OtlTokenResponse) this.field542.get();
                        if (!var10.isSuccess()) {
                            method482(65);
                            this.field542 = null;
                            return;
                        }
                        this.field524 = var10.getToken();
                        this.field542 = null;
                    } catch (Exception var71) {
                        class500.method2855((String) null, var71);
                        method482(65);
                        this.field542 = null;
                        return;
                    }
                } else {
                    return;
                }
                field533 = 0;
                method6222(1);
            }
            if (field743 == 1) {
                if (Statics.field4589 == null) {
                    Statics.field4589 = Statics.field207.method3219(Statics.field4260, Statics.field3727);
                }
                if (Statics.field4589.field1898 == 2) {
                    throw new IOException();
                }
                if (Statics.field4589.field1898 == 1) {
                    Socket var16 = (Socket) Statics.field4589.field1901;
                    class408 var17 = new class408(var16, 40000, 5000);
                    var1 = var17;
                    field689.method2688(var17);
                    Statics.field4589 = null;
                    method6222(2);
                }
            }
            if (field743 == 2) {
                field689.method2685();
                class282 var18 = class282.method3621();
                var18.field3187.method7947(class284.field3318.field3315);
                field689.method2694(var18);
                field689.method2687();
                var2.field4939 = 0;
                method6222(3);
            }
            if (field743 == 3) {
                if (Statics.field339 != null) {
                    Statics.field339.method776();
                }
                if (Statics.field2941 != null) {
                    Statics.field2941.method776();
                }
                if (var1.method7161(1)) {
                    int var19 = var1.method7148();
                    if (Statics.field339 != null) {
                        Statics.field339.method776();
                    }
                    if (Statics.field2941 != null) {
                        Statics.field2941.method776();
                    }
                    if (var19 != 0) {
                        method482(var19);
                        return;
                    }
                    var2.field4939 = 0;
                    method6222(4);
                }
            }
            if (field743 == 4) {
                if (var2.field4939 < 8) {
                    int var20 = var1.method7146();
                    if (var20 > 8 - var2.field4939) {
                        var20 = 8 - var2.field4939;
                    }
                    if (var20 > 0) {
                        var1.method7149(var2.field4936, var2.field4939, var20);
                        var2.field4939 += var20;
                    }
                }
                if (var2.field4939 == 8) {
                    var2.field4939 = 0;
                    Statics.field1710 = var2.method8151();
                    method6222(5);
                }
            }
            if (field743 == 5) {
                field689.field1397.field4939 = 0;
                field689.method2685();
                class473 var21 = new class473(500);
                int[] var22 = new int[] { Statics.field4270.nextInt(), Statics.field4270.nextInt(), Statics.field4270.nextInt(), Statics.field4270.nextInt() };
                var21.field4939 = 0;
                var21.method7947(1);
                var21.method8048(var22[0]);
                var21.method8048(var22[1]);
                var21.method8048(var22[2]);
                var21.method8048(var22[3]);
                var21.method8140(Statics.field1710);
                if (field508 == 40) {
                    var21.method8048(Statics.field100[0]);
                    var21.method8048(Statics.field100[1]);
                    var21.method8048(Statics.field100[2]);
                    var21.method8048(Statics.field100[3]);
                } else {
                    if (field508 == 50) {
                        var21.method7947(class136.field1631.method46());
                        var21.method8048(Statics.field3357);
                    } else {
                        var21.method7947(field536.method46());
                        switch(field536.field1628) {
                            case 0:
                                var21.field4939 += 4;
                            case 1:
                            default:
                                break;
                            case 2:
                                var21.method8048(Statics.field1404.method2392(class72.field924));
                                break;
                            case 3:
                            case 4:
                                var21.method7949(Statics.field1430);
                                var21.field4939++;
                        }
                    }
                    if (field537.method8258()) {
                        var21.method7947(class479.field4993.method46());
                        var21.method7954(this.field524);
                    } else {
                        var21.method7947(class479.field4997.method46());
                        var21.method7954(class72.field913);
                    }
                }
                var21.method8086(class71.field900, class71.field897);
                Statics.field100 = var22;
                class282 var23 = class282.method3621();
                var23.field3187.field4939 = 0;
                if (field508 == 40) {
                    var23.field3187.method7947(class284.field3310.field3315);
                } else {
                    var23.field3187.method7947(class284.field3311.field3315);
                }
                var23.field3187.method7950(0);
                int var24 = var23.field3187.field4939;
                var23.field3187.method8048(211);
                var23.field3187.method8048(1);
                var23.field3187.method7947(field629);
                var23.field3187.method7947(field504);
                byte var25 = 0;
                var23.field3187.method7947(var25);
                var23.field3187.method7957(var21.field4936, 0, var21.field4939);
                int var26 = var23.field3187.field4939;
                var23.field3187.method7954(class72.field924);
                var23.field3187.method7947((field735 ? 1 : 0) << 1 | (field501 ? 1 : 0));
                var23.field3187.method7950(Statics.field220);
                var23.field3187.method7950(Statics.field1559);
                method2801(var23.field3187);
                var23.field3187.method7954(Statics.field4624);
                var23.field3187.method8048(Statics.field487);
                class474 var27 = new class474(Statics.field1455.method7447());
                Statics.field1455.method7448(var27);
                var23.field3187.method7957(var27.field4936, 0, var27.field4936.length);
                var23.field3187.method7947(field629);
                var23.field3187.method8048(0);
                var23.field3187.method7968(Statics.field66.field4235);
                var23.field3187.method7968(Statics.field4403.field4235);
                var23.field3187.method7968(Statics.field491.field4235);
                var23.field3187.method8166(Statics.field3449.field4235);
                var23.field3187.method8016(Statics.field4261.field4235);
                var23.field3187.method8166(0);
                var23.field3187.method8166(Statics.field1883.field4235);
                var23.field3187.method8048(Statics.field240.field4235);
                var23.field3187.method8016(Statics.field4663.field4235);
                var23.field3187.method8048(Statics.field160.field4235);
                var23.field3187.method7968(Statics.field71.field4235);
                var23.field3187.method8166(Statics.field1676.field4235);
                var23.field3187.method8016(Statics.field3034.field4235);
                var23.field3187.method8048(Statics.field1159.field4235);
                var23.field3187.method8016(Statics.field1761.field4235);
                var23.field3187.method8016(Statics.field3333.field4235);
                var23.field3187.method7968(Statics.field1705.field4235);
                var23.field3187.method7968(Statics.field1751.field4235);
                var23.field3187.method8166(Statics.field2355.field4235);
                var23.field3187.method8048(Statics.field1002.field4235);
                var23.field3187.method8166(Statics.field4546.field4235);
                var23.field3187.method8164(var22, var26, var23.field3187.field4939);
                var23.field3187.method7960(var23.field3187.field4939 - var24);
                field689.method2694(var23);
                field689.method2687();
                field689.field1390 = new class491(var22);
                int[] var28 = new int[4];
                for (int var29 = 0; var29 < 4; var29++) {
                    var28[var29] = var22[var29] + 50;
                }
                var2.method7907(var28);
                method6222(6);
            }
            if (field743 == 6 && var1.method7146() > 0) {
                int var30 = var1.method7148();
                if (var30 == 61) {
                    int var31 = var1.method7146();
                    Statics.field2377 = var31 == 1 && var1.method7148() == 1;
                    method6222(5);
                }
                if (var30 == 21 && field508 == 20) {
                    method6222(12);
                } else if (var30 == 2) {
                    method6222(14);
                } else if (var30 == 15 && field508 == 40) {
                    field689.field1394 = -1;
                    method6222(19);
                } else if (var30 == 64) {
                    method6222(10);
                } else if (var30 == 23 && field534 < 1) {
                    field534++;
                    method6222(0);
                } else if (var30 == 29) {
                    method6222(17);
                } else if (var30 == 69) {
                    method6222(7);
                } else {
                    method482(var30);
                    return;
                }
            }
            if (field743 == 7 && var1.method7146() >= 2) {
                var1.method7149(var2.field4936, 0, 2);
                var2.field4939 = 0;
                Statics.field3382 = var2.method8032();
                method6222(8);
            }
            if (field743 == 8 && var1.method7146() >= Statics.field3382) {
                var2.field4939 = 0;
                var1.method7149(var2.field4936, var2.field4939, Statics.field3382);
                class7[] var32 = new class7[] { class7.field17 };
                class7 var33 = var32[var2.method7964()];
                try {
                    class4 var34 = class5.method2000(var33);
                    this.field552 = new class8(var2, var34);
                    method6222(9);
                } catch (Exception var69) {
                    method482(22);
                    return;
                }
            }
            if (field743 == 9 && this.field552.method49()) {
                this.field551 = this.field552.method61();
                this.field552.method50();
                this.field552 = null;
                if (this.field551 == null) {
                    method482(22);
                    return;
                }
                field689.method2685();
                class282 var36 = class282.method3621();
                var36.field3187.method7947(class284.field3313.field3315);
                var36.field3187.method7950(this.field551.field4939);
                var36.field3187.method8197(this.field551);
                field689.method2694(var36);
                field689.method2687();
                this.field551 = null;
                method6222(6);
            }
            if (field743 == 10 && var1.method7146() > 0) {
                Statics.field1484 = var1.method7148();
                method6222(11);
            }
            if (field743 == 11 && var1.method7146() >= Statics.field1484) {
                var1.method7149(var2.field4936, 0, Statics.field1484);
                var2.field4939 = 0;
                method6222(6);
            }
            if (field743 == 12 && var1.method7146() > 0) {
                field647 = (var1.method7148() + 3) * 60;
                method6222(13);
            }
            if (field743 == 13) {
                field533 = 0;
                class72.method1996(class330.field4029, class330.field3956, field647 / 60 + class330.field4035);
                if (--field647 <= 0) {
                    method6222(0);
                }
            } else {
                if (field743 == 14 && var1.method7146() >= 1) {
                    Statics.field4581 = var1.method7148();
                    method6222(15);
                }
                if (field743 == 15 && var1.method7146() >= Statics.field4581) {
                    boolean var37 = var1.method7148() == 1;
                    var1.method7149(var2.field4936, 0, 4);
                    var2.field4939 = 0;
                    boolean var38 = false;
                    if (var37) {
                        int var39 = var2.method7918() << 24;
                        int var40 = var39 | var2.method7918() << 16;
                        int var41 = var40 | var2.method7918() << 8;
                        int var42 = var41 | var2.method7918();
                        Statics.field1404.method2473(class72.field924, var42);
                    }
                    if (field549) {
                        Statics.field1404.method2384(class72.field924);
                    } else {
                        Statics.field1404.method2384((String) null);
                    }
                    class94.method827();
                    field684 = var1.method7148();
                    field611 = var1.method7148() == 1;
                    field630 = var1.method7148();
                    field630 <<= 0x8;
                    field630 += var1.method7148();
                    field631 = var1.method7148();
                    var1.method7149(var2.field4936, 0, 8);
                    var2.field4939 = 0;
                    this.field553 = var2.method8151();
                    if (Statics.field4581 >= 29) {
                        var1.method7149(var2.field4936, 0, 8);
                        var2.field4939 = 0;
                        field632 = var2.method8151();
                    }
                    var1.method7149(var2.field4936, 0, 1);
                    var2.field4939 = 0;
                    class283[] var43 = class283.method3273();
                    int var44 = var2.method7911();
                    if (var44 < 0 || var44 >= var43.length) {
                        throw new IOException(var44 + " " + var2.field4939);
                    }
                    field689.field1396 = var43[var44];
                    field689.field1394 = field689.field1396.field3204;
                    var1.method7149(var2.field4936, 0, 2);
                    var2.field4939 = 0;
                    field689.field1394 = var2.method8032();
                    try {
                        client var45 = Statics.field427;
                        JSObject.getWindow(var45).call("zap", (Object[]) null);
                    } catch (Throwable var68) {
                    }
                    method6222(16);
                }
                if (field743 != 16) {
                    if (field743 == 17 && var1.method7146() >= 2) {
                        var2.field4939 = 0;
                        var1.method7149(var2.field4936, 0, 2);
                        var2.field4939 = 0;
                        Statics.field139 = var2.method8032();
                        method6222(18);
                    }
                    if (field743 == 18 && var1.method7146() >= Statics.field139) {
                        var2.field4939 = 0;
                        var1.method7149(var2.field4936, 0, Statics.field139);
                        var2.field4939 = 0;
                        String var63 = var2.method7983();
                        String var64 = var2.method7983();
                        String var65 = var2.method7983();
                        class72.method1996(var63, var64, var65);
                        method4858(10);
                        if (field537.method8258()) {
                            class72.method689(9);
                        }
                    }
                    if (field743 == 19) {
                        if (field689.field1394 == -1) {
                            if (var1.method7146() < 2) {
                                return;
                            }
                            var1.method7149(var2.field4936, 0, 2);
                            var2.field4939 = 0;
                            field689.field1394 = var2.method8032();
                        }
                        if (var1.method7146() >= field689.field1394) {
                            var1.method7149(var2.field4936, 0, field689.field1394);
                            var2.field4939 = 0;
                            int var66 = field689.field1394;
                            field563.method6811();
                            method162();
                            class103.method2074(var2);
                            if (var2.field4939 != var66) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field533++;
                        if (field533 > 2000) {
                            if (field534 < 1) {
                                if (Statics.field6 == Statics.field3727) {
                                    Statics.field3727 = Statics.field60;
                                } else {
                                    Statics.field3727 = Statics.field6;
                                }
                                field534++;
                                method6222(0);
                            } else {
                                method482(-3);
                            }
                        }
                    }
                } else if (var1.method7146() >= field689.field1394) {
                    var2.field4939 = 0;
                    var1.method7149(var2.field4936, 0, field689.field1394);
                    field563.method6809();
                    field794 = -1L;
                    Statics.field265.field1082 = 0;
                    Statics.field236 = true;
                    field516 = true;
                    field747 = -1L;
                    class37.method3015();
                    field689.method2685();
                    field689.field1397.field4939 = 0;
                    field689.field1396 = null;
                    field689.field1406 = null;
                    field689.field1402 = null;
                    field689.field1403 = null;
                    field689.field1394 = 0;
                    field689.field1399 = 0;
                    field677 = 0;
                    field610 = 0;
                    field518 = 0;
                    method1089();
                    class36.field245 = 0;
                    class106.method2994();
                    field668 = 0;
                    field670 = false;
                    field761 = 0;
                    field583 = 0;
                    field507 = 0;
                    Statics.field1634 = null;
                    field671 = 0;
                    field750 = -1;
                    field755 = 0;
                    field756 = 0;
                    field777 = class99.field1318;
                    field527 = class99.field1318;
                    field556 = 0;
                    class103.field1343 = 0;
                    for (int var47 = 0; var47 < 2048; var47++) {
                        class103.field1342[var47] = null;
                        class103.field1341[var47] = class209.field2361;
                    }
                    for (int var48 = 0; var48 < 2048; var48++) {
                        field621[var48] = null;
                    }
                    for (int var49 = 0; var49 < 65536; var49++) {
                        field683[var49] = null;
                    }
                    field641 = -1;
                    field644.method6235();
                    field645.method6235();
                    for (int var50 = 0; var50 < 4; var50++) {
                        for (int var51 = 0; var51 < 104; var51++) {
                            for (int var52 = 0; var52 < 104; var52++) {
                                field642[var50][var51][var52] = null;
                            }
                        }
                    }
                    field643 = new class356();
                    Statics.field1944.method1748();
                    for (int var53 = 0; var53 < Statics.field1928; var53++) {
                        class182 var54 = class182.method3231(var53);
                        if (var54 != null) {
                            class300.field3460[var53] = 0;
                            class300.field3459[var53] = 0;
                        }
                    }
                    Statics.field35.method2623();
                    field791 = -1;
                    if (field675 != -1) {
                        int var55 = field675;
                        if (var55 != -1 && Statics.field4692[var55]) {
                            Statics.field1433.method5973(var55);
                            if (Statics.field2984[var55] != null) {
                                boolean var56 = true;
                                for (int var57 = 0; var57 < Statics.field2984[var55].length; var57++) {
                                    if (Statics.field2984[var55][var57] != null) {
                                        if (Statics.field2984[var55][var57].field3657 == 2) {
                                            var56 = false;
                                        } else {
                                            Statics.field2984[var55][var57] = null;
                                        }
                                    }
                                }
                                if (var56) {
                                    Statics.field2984[var55] = null;
                                }
                                Statics.field4692[var55] = false;
                            }
                        }
                    }
                    for (class83 var58 = (class83) field676.method7708(); var58 != null; var58 = (class83) field676.method7709()) {
                        method107(var58, true);
                    }
                    field675 = -1;
                    field676 = new class451(8);
                    field697 = null;
                    method1089();
                    field787.method5380((int[]) null, new int[] { 0, 0, 0, 0, 0 }, 0, -1);
                    for (int var59 = 0; var59 < 8; var59++) {
                        field607[var59] = null;
                        field639[var59] = false;
                    }
                    class81.method5888();
                    field510 = true;
                    for (int var60 = 0; var60 < 100; var60++) {
                        field726[var60] = true;
                    }
                    class282 var61 = class282.method4287(class280.field3127, field689.field1390);
                    var61.field3187.method7947(method1094());
                    var61.field3187.method7950(Statics.field220);
                    var61.field3187.method7950(Statics.field1559);
                    field689.method2694(var61);
                    Statics.field4903 = null;
                    Statics.field992 = null;
                    Arrays.fill(field748, (Object) null);
                    Statics.field5003 = null;
                    Arrays.fill(field749, (Object) null);
                    for (int var62 = 0; var62 < 8; var62++) {
                        field560[var62] = new class346();
                    }
                    Statics.field1998 = null;
                    class103.method2074(var2);
                    Statics.field3473 = -1;
                    method5040(false, var2);
                    field689.field1396 = null;
                }
            }
        } catch (IOException var76) {
            if (field534 < 1) {
                if (Statics.field6 == Statics.field3727) {
                    Statics.field3727 = Statics.field60;
                } else {
                    Statics.field3727 = Statics.field6;
                }
                field534++;
                method6222(0);
            } else {
                method482(-2);
            }
        }
    }

    @ObfuscatedName("b.fa(I)V")
    public static void method162() {
        field689.method2685();
        field689.field1397.field4939 = 0;
        field689.field1396 = null;
        field689.field1406 = null;
        field689.field1402 = null;
        field689.field1403 = null;
        field689.field1394 = 0;
        field689.field1399 = 0;
        field677 = 0;
        method1089();
        field671 = 0;
        field755 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field621[var0] = null;
        }
        Statics.field4508 = null;
        for (int var1 = 0; var1 < field683.length; var1++) {
            class96 var2 = field683[var1];
            if (var2 != null) {
                var2.field1194 = -1;
                var2.field1236 = false;
            }
        }
        class81.method5888();
        method4858(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field726[var3] = true;
        }
        class282 var4 = class282.method4287(class280.field3127, field689.field1390);
        var4.field3187.method7947(method1094());
        var4.field3187.method7950(Statics.field220);
        var4.field3187.method7950(Statics.field1559);
        field689.method2694(var4);
    }

    @ObfuscatedName("at.fo(II)V")
    public static void method482(int arg0) {
        int var1 = class72.field919;
        if (arg0 == -3) {
            class72.method1996(class330.field3881, class330.field3885, class330.field3886);
        } else if (arg0 == -2) {
            class72.method1996(class330.field3887, class330.field4042, class330.field3889);
        } else if (arg0 == -1) {
            class72.method1996(class330.field3890, class330.field3891, class330.field4004);
        } else if (arg0 == 3) {
            class72.method689(3);
            class72.field918 = 1;
        } else if (arg0 == 4) {
            class72.method689(14);
            class72.field917 = 0;
        } else if (arg0 == 5) {
            class72.field918 = 2;
            class72.method1996(class330.field4138, class330.field3897, class330.field3898);
        } else if (arg0 == 68 || !(field661 || arg0 != 6)) {
            class72.method1996(class330.field3853, class330.field4101, class330.field3901);
        } else if (arg0 == 7) {
            class72.method1996(class330.field3902, class330.field3903, class330.field3904);
        } else if (arg0 == 8) {
            class72.method1996(class330.field3905, class330.field3895, class330.field3878);
        } else if (arg0 == 9) {
            class72.method1996(class330.field3908, class330.field3909, class330.field3910);
        } else if (arg0 == 10) {
            class72.method1996(class330.field3984, class330.field3912, class330.field4061);
        } else if (arg0 == 11) {
            class72.method1996(class330.field3914, class330.field4099, class330.field3916);
        } else if (arg0 == 12) {
            class72.method1996(class330.field3955, class330.field3918, class330.field4139);
        } else if (arg0 == 13) {
            class72.method1996(class330.field3920, class330.field3921, class330.field3922);
        } else if (arg0 == 14) {
            class72.method1996(class330.field3938, class330.field3924, class330.field3925);
        } else if (arg0 == 16) {
            class72.method1996(class330.field3926, class330.field3884, class330.field3928);
        } else if (arg0 == 17) {
            class72.method1996(class330.field3929, class330.field3930, class330.field3931);
        } else if (arg0 == 18) {
            class72.method689(14);
            class72.field917 = 1;
        } else if (arg0 == 19) {
            class72.method1996(class330.field4038, class330.field3936, class330.field3937);
        } else if (arg0 == 20) {
            class72.method1996(class330.field4052, class330.field3939, class330.field4134);
        } else if (arg0 == 22) {
            class72.method1996(class330.field3941, class330.field3942, class330.field3850);
        } else if (arg0 == 23) {
            class72.method1996(class330.field3950, class330.field4072, class330.field3946);
        } else if (arg0 == 24) {
            class72.method1996(class330.field3935, class330.field3948, class330.field3949);
        } else if (arg0 == 25) {
            class72.method1996(class330.field4086, class330.field4005, class330.field3952);
        } else if (arg0 == 26) {
            class72.method1996(class330.field3953, class330.field4155, class330.field4106);
        } else if (arg0 == 27) {
            class72.method1996(class330.field3907, class330.field4054, class330.field3919);
        } else if (arg0 == 31) {
            class72.method1996(class330.field3965, class330.field3966, class330.field3967);
        } else if (arg0 == 32) {
            class72.method689(14);
            class72.field917 = 2;
        } else if (arg0 == 37) {
            class72.method1996(class330.field3971, class330.field3972, class330.field3973);
        } else if (arg0 == 38) {
            class72.method1996(class330.field3974, class330.field3975, class330.field3976);
        } else if (arg0 == 55) {
            class72.method689(8);
        } else if (arg0 == 56) {
            class72.method1996(class330.field3923, class330.field3958, class330.field3983);
            method4858(11);
            return;
        } else if (arg0 == 57) {
            class72.method1996(class330.field3838, class330.field3985, class330.field3982);
            method4858(11);
            return;
        } else if (arg0 == 61) {
            class72.method1996("", "Please enter your date of birth (DD/MM/YYYY)", "");
            class72.method689(7);
        } else if (arg0 == 62) {
            method4858(10);
            class72.method689(9);
            class72.method1996(class330.field3987, class330.field3988, class330.field3989);
            return;
        } else if (arg0 == 63) {
            method4858(10);
            class72.method689(9);
            class72.method1996(class330.field3986, class330.field3991, class330.field3992);
            return;
        } else if (arg0 == 65 || arg0 == 67) {
            method4858(10);
            class72.method689(9);
            class72.method1996(class330.field3876, class330.field3994, class330.field4136);
            return;
        } else if (arg0 == 71) {
            method4858(10);
            class72.method689(7);
            class72.method1996("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
        } else if (arg0 == 73) {
            method4858(10);
            class72.method689(6);
            class72.method1996(class330.field4140, class330.field4152, class330.field4142);
        } else if (arg0 == 72) {
            method4858(10);
            class72.method689(26);
        } else {
            class72.method1996(class330.field3900, class330.field3997, class330.field3998);
        }
        method4858(10);
        boolean var3 = var1 != class72.method211();
        if (!var3 && field537.method8258()) {
            class72.method689(9);
        }
    }

    @ObfuscatedName("gi.ff(B)V")
    public static final void method3380() {
        field689.method2690();
        class202.method3315();
        class194.field2100.method5033();
        class185.method2976();
        class200.field2156.method5033();
        class200.field2157.method5033();
        class200.field2158.method5033();
        class200.field2159.method5033();
        class191.method3233();
        class201.method3220();
        class203.method1830();
        class193.field2094.method5033();
        class193.field2084.method5033();
        class196.method5884();
        class182.method4291();
        Statics.field5071.method7805();
        Statics.field2362.method7805();
        class199.field2133.method5033();
        class199.field2132.method5033();
        class199.field2139.method5033();
        class186.method453();
        class198.method2751();
        class197.field2119.method5033();
        class183.method2235();
        class467.field4909.method5033();
        class469.field4918.method5033();
        field513.method5033();
        field795.method5033();
        class307.method4490();
        class310.field3544.method5033();
        class310.field3576.method5033();
        class310.field3583.method5033();
        class310.field3609.method5033();
        ((class226) Statics.field2512).method4307();
        class75.field988.method5033();
        field793.method6916();
        Statics.field71.method5986();
        Statics.field4546.method5986();
        Statics.field1676.method5986();
        Statics.field1002.method5986();
        Statics.field4261.method5986();
        Statics.field1761.method5986();
        Statics.field1751.method5986();
        Statics.field3034.method5986();
        Statics.field1705.method5986();
        Statics.field491.method5986();
        Statics.field3449.method5986();
        Statics.field66.method5986();
        Statics.field133.method5986();
        Statics.field3022.method4145();
        for (int var0 = 0; var0 < 4; var0++) {
            field685[var0].method3844();
        }
        field753.method3795();
        System.gc();
        class291.method423(2);
        field723 = -1;
        field672 = false;
        class66.method2762();
        method4858(10);
    }

    @ObfuscatedName("hb.fc(IB)V")
    public static final void method4293(int arg0) {
        method3380();
        switch(arg0) {
            case 1:
                class72.method4635();
                break;
            case 2:
                class72.method689(24);
                class72.method1996(class330.field4084, class330.field4122, class330.field4094);
        }
    }

    @ObfuscatedName("o.fb(I)J")
    public static long method239() {
        return field632;
    }

    @ObfuscatedName("ic.fy(B)V")
    public static final void method4828() {
        if (field610 > 0) {
            method3380();
        } else {
            field563.method6808();
            method4858(40);
            Statics.field2819 = field689.method2699();
            field689.method2691();
        }
    }

    @ObfuscatedName("nu.fz(ZI)V")
    public static final void method6618(boolean arg0) {
        if (arg0) {
            field536 = class72.field931 ? class136.field1624 : class136.field1626;
        } else {
            field536 = Statics.field1404.method2391(class72.field924) ? class136.field1627 : class136.field1625;
        }
    }

    @ObfuscatedName("client.fp(I)V")
    public final void method1161() {
        if (field677 > 1) {
            field677--;
        }
        if (field610 > 0) {
            field610--;
        }
        if (field562) {
            field562 = false;
            method4828();
            return;
        }
        if (!field650) {
            method3259();
        }
        for (int var1 = 0; var1 < 100 && this.method1534(field689); var1++) {
        }
        if (field508 != 30) {
            return;
        }
        while (true) {
            class38 var2 = (class38) class37.field270.method6318();
            boolean var3;
            if (var2 == null) {
                var3 = false;
            } else {
                var3 = true;
            }
            if (!var3) {
                if (field563.field4472) {
                    class282 var6 = class282.method4287(class280.field3090, field689.field1390);
                    var6.field3187.method7947(0);
                    int var7 = var6.field3187.field4939;
                    field563.method6805(var6.field3187);
                    var6.field3187.method8130(var6.field3187.field4939 - var7);
                    field689.method2694(var6);
                    field563.method6815();
                }
                Object var8 = Statics.field265.field1075;
                synchronized (Statics.field265.field1075) {
                    if (!field535) {
                        Statics.field265.field1082 = 0;
                    } else if (class36.field262 != 0 || Statics.field265.field1082 >= 40) {
                        class282 var9 = null;
                        int var10 = 0;
                        int var11 = 0;
                        int var12 = 0;
                        int var13 = 0;
                        for (int var14 = 0; var14 < Statics.field265.field1082 && (var9 == null || var9.field3187.field4939 - var10 < 246); var14++) {
                            var11 = var14;
                            int var15 = Statics.field265.field1078[var14];
                            if (var15 < -1) {
                                var15 = -1;
                            } else if (var15 > 65534) {
                                var15 = 65534;
                            }
                            int var16 = Statics.field265.field1077[var14];
                            if (var16 < -1) {
                                var16 = -1;
                            } else if (var16 > 65534) {
                                var16 = 65534;
                            }
                            if (field564 != var16 || field514 != var15) {
                                if (var9 == null) {
                                    var9 = class282.method4287(class280.field3167, field689.field1390);
                                    var9.field3187.method7947(0);
                                    var10 = var9.field3187.field4939;
                                    var9.field3187.field4939 += 2;
                                    var12 = 0;
                                    var13 = 0;
                                }
                                int var17;
                                int var18;
                                int var19;
                                if (field686 == -1L) {
                                    var17 = var16;
                                    var18 = var15;
                                    var19 = Integer.MAX_VALUE;
                                } else {
                                    var17 = var16 - field564;
                                    var18 = var15 - field514;
                                    var19 = (int) ((Statics.field265.field1074[var14] - field686) / 20L);
                                    var12 = (int) ((Statics.field265.field1074[var14] - field686) % 20L + (long) var12);
                                }
                                field564 = var16;
                                field514 = var15;
                                if (var19 < 8 && var17 >= -32 && var17 <= 31 && var18 >= -32 && var18 <= 31) {
                                    var17 += 32;
                                    var18 += 32;
                                    var9.field3187.method7950((var17 << 6) + (var19 << 12) + var18);
                                } else if (var19 < 32 && var17 >= -128 && var17 <= 127 && var18 >= -128 && var18 <= 127) {
                                    var17 += 128;
                                    var18 += 128;
                                    var9.field3187.method7947(var19 + 128);
                                    var9.field3187.method7950((var17 << 8) + var18);
                                } else if (var19 < 32) {
                                    var9.field3187.method7947(var19 + 192);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field3187.method8048(Integer.MIN_VALUE);
                                    } else {
                                        var9.field3187.method8048(var16 | var15 << 16);
                                    }
                                } else {
                                    var9.field3187.method7950((var19 & 0x1FFF) + 57344);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field3187.method8048(Integer.MIN_VALUE);
                                    } else {
                                        var9.field3187.method8048(var16 | var15 << 16);
                                    }
                                }
                                var13++;
                                field686 = Statics.field265.field1074[var14];
                            }
                        }
                        if (var9 != null) {
                            var9.field3187.method8130(var9.field3187.field4939 - var10);
                            int var20 = var9.field3187.field4939;
                            var9.field3187.field4939 = var10;
                            var9.field3187.method7947(var12 / var13);
                            var9.field3187.method7947(var12 % var13);
                            var9.field3187.field4939 = var20;
                            field689.method2694(var9);
                        }
                        if (var11 >= Statics.field265.field1082) {
                            Statics.field265.field1082 = 0;
                        } else {
                            Statics.field265.field1082 -= var11;
                            System.arraycopy(Statics.field265.field1077, var11, Statics.field265.field1077, 0, Statics.field265.field1082);
                            System.arraycopy(Statics.field265.field1078, var11, Statics.field265.field1078, 0, Statics.field265.field1082);
                            System.arraycopy(Statics.field265.field1074, var11, Statics.field265.field1074, 0, Statics.field265.field1082);
                        }
                    }
                }
                if (class36.field262 == 1 || !Statics.field4559 && class36.field262 == 4 || class36.field262 == 2) {
                    long var22 = class36.field261 - field794;
                    if (var22 > 32767L) {
                        var22 = 32767L;
                    }
                    field794 = class36.field261;
                    int var24 = class36.field260;
                    if (var24 < 0) {
                        var24 = 0;
                    } else if (var24 > Statics.field1559) {
                        var24 = Statics.field1559;
                    }
                    int var25 = class36.field259;
                    if (var25 < 0) {
                        var25 = 0;
                    } else if (var25 > Statics.field220) {
                        var25 = Statics.field220;
                    }
                    int var26 = (int) var22;
                    class282 var27 = class282.method4287(class280.field3065, field689.field1390);
                    var27.field3187.method7950((var26 << 1) + (class36.field262 == 2 ? 1 : 0));
                    var27.field3187.method7950(var25);
                    var27.field3187.method7950(var24);
                    field689.method2694(var27);
                }
                if (field703.field2336 > 0) {
                    class282 var28 = class282.method4287(class280.field3155, field689.field1390);
                    var28.field3187.method7950(0);
                    int var29 = var28.field3187.field4939;
                    long var30 = class287.method3099();
                    for (int var32 = 0; var32 < field703.field2336; var32++) {
                        long var33 = var30 - field747;
                        if (var33 > 16777215L) {
                            var33 = 16777215L;
                        }
                        field747 = var30;
                        var28.field3187.method8010((int) var33);
                        var28.field3187.method7994(field703.field2329[var32]);
                    }
                    var28.field3187.method7960(var28.field3187.field4939 - var29);
                    field689.method2694(var28);
                }
                if (field698 > 0) {
                    field698--;
                }
                if (field703.method3820(96) || field703.method3820(97) || field703.method3820(98) || field703.method3820(99)) {
                    field598 = true;
                }
                if (field598 && field698 <= 0) {
                    field698 = 20;
                    field598 = false;
                    class282 var35 = class282.method4287(class280.field3147, field689.field1390);
                    var35.field3187.method8004(field582);
                    var35.field3187.method7950(field583);
                    field689.method2694(var35);
                }
                if (Statics.field236 && !field516) {
                    field516 = true;
                    class282 var36 = class282.method4287(class280.field3101, field689.field1390);
                    var36.field3187.method7947(1);
                    field689.method2694(var36);
                }
                if (!Statics.field236 && field516) {
                    field516 = false;
                    class282 var37 = class282.method4287(class280.field3101, field689.field1390);
                    var37.field3187.method7947(0);
                    field689.method2694(var37);
                }
                if (Statics.field4300 != null) {
                    Statics.field4300.method7463();
                }
                method6622();
                if (Statics.field2117) {
                    for (int var38 = 0; var38 < class103.field1343; var38++) {
                        class88 var39 = field621[class103.field1350[var38]];
                        var39.method2252();
                    }
                    Statics.field2117 = false;
                }
                if (Statics.field1370 != field750) {
                    field750 = Statics.field1370;
                    method2582(Statics.field1370);
                }
                if (field508 != 30) {
                    return;
                }
                for (class90 var40 = (class90) field643.method6241(); var40 != null; var40 = (class90) field643.method6248()) {
                    if (var40.field1144 > 0) {
                        var40.field1144--;
                    }
                    if (var40.field1144 == 0) {
                        if (var40.field1148 >= 0) {
                            int var41 = var40.field1148;
                            int var42 = var40.field1150;
                            class200 var43 = class200.method7839(var41);
                            if (var42 == 11) {
                                var42 = 10;
                            }
                            if (var42 >= 5 && var42 <= 8) {
                                var42 = 4;
                            }
                            boolean var44 = var43.method3606(var42);
                            if (!var44) {
                                continue;
                            }
                        }
                        method5885(var40.field1156, var40.field1145, var40.field1146, var40.field1147, var40.field1148, var40.field1149, var40.field1150);
                        var40.method7431();
                    } else {
                        if (var40.field1155 > 0) {
                            var40.field1155--;
                        }
                        if (var40.field1155 == 0 && var40.field1146 >= 1 && var40.field1147 >= 1 && var40.field1146 <= 102 && var40.field1147 <= 102) {
                            if (var40.field1151 >= 0) {
                                int var45 = var40.field1151;
                                int var46 = var40.field1153;
                                class200 var47 = class200.method7839(var45);
                                if (var46 == 11) {
                                    var46 = 10;
                                }
                                if (var46 >= 5 && var46 <= 8) {
                                    var46 = 4;
                                }
                                boolean var48 = var47.method3606(var46);
                                if (!var48) {
                                    continue;
                                }
                            }
                            method5885(var40.field1156, var40.field1145, var40.field1146, var40.field1147, var40.field1151, var40.field1152, var40.field1153);
                            var40.field1155 = -1;
                            if (var40.field1151 == var40.field1148 && var40.field1148 == -1) {
                                var40.method7431();
                            } else if (var40.field1151 == var40.field1148 && var40.field1152 == var40.field1149 && var40.field1153 == var40.field1150) {
                                var40.method7431();
                            }
                        }
                    }
                }
                method59();
                field689.field1399++;
                if (field689.field1399 > 750) {
                    method4828();
                    return;
                }
                method1992();
                method3511();
                method2838();
                field575++;
                if (field617 != 0) {
                    field616 += 20;
                    if (field616 >= 400) {
                        field617 = 0;
                    }
                }
                if (Statics.field4438 != null) {
                    field744++;
                    if (field744 >= 15) {
                        method2361(Statics.field4438);
                        Statics.field4438 = null;
                    }
                }
                class310 var49 = Statics.field151;
                class310 var50 = Statics.field103;
                Statics.field151 = null;
                Statics.field103 = null;
                field503 = null;
                field696 = false;
                field693 = false;
                field760 = 0;
                while (field703.method3818() && field760 < 128) {
                    if (field684 >= 2 && field703.method3820(82) && field703.field2340 == 66) {
                        String var51 = class106.method3881();
                        Statics.field427.method494(var51);
                    } else if (field507 != 1 || field703.field2334 <= 0) {
                        field746[field760] = field703.field2340;
                        field754[field760] = field703.field2334;
                        field760++;
                    }
                }
                boolean var52 = field684 >= 2;
                if (var52 && field703.method3820(82) && field703.method3820(81) && field587 != 0) {
                    int var53 = Statics.field4508.field1128 - field587;
                    if (var53 < 0) {
                        var53 = 0;
                    } else if (var53 > 3) {
                        var53 = 3;
                    }
                    if (Statics.field4508.field1128 != var53) {
                        method3232(Statics.field2118 + Statics.field4508.field1210[0], Statics.field565 + Statics.field4508.field1232[0], var53, false);
                    }
                    field587 = 0;
                }
                if (class36.field262 == 1) {
                    field753.method3795();
                }
                if (field675 != -1) {
                    method3005(field675, 0, 0, Statics.field220, Statics.field1559, 0, 0);
                }
                field700++;
                while (true) {
                    class84 var54;
                    class310 var55;
                    class310 var56;
                    do {
                        var54 = (class84) field769.method6239();
                        if (var54 == null) {
                            while (true) {
                                class84 var57;
                                class310 var58;
                                class310 var59;
                                do {
                                    var57 = (class84) field721.method6239();
                                    if (var57 == null) {
                                        while (true) {
                                            class84 var60;
                                            class310 var61;
                                            class310 var62;
                                            do {
                                                var60 = (class84) field719.method6239();
                                                if (var60 == null) {
                                                    while (true) {
                                                        while (true) {
                                                            class205 var63;
                                                            class310 var64;
                                                            do {
                                                                do {
                                                                    do {
                                                                        var63 = (class205) field722.method6239();
                                                                        if (var63 == null) {
                                                                            this.method1487();
                                                                            if (Statics.field4300 != null) {
                                                                                Statics.field4300.method7656(Statics.field1370, (Statics.field4508.field1204 >> 7) + Statics.field2118, (Statics.field4508.field1161 >> 7) + Statics.field565, false);
                                                                                Statics.field4300.method7489();
                                                                            }
                                                                            if (field688 != null) {
                                                                                this.method1641();
                                                                            }
                                                                            if (Statics.field2823 != null) {
                                                                                method2361(Statics.field2823);
                                                                                field626++;
                                                                                if (class36.field250 == 0) {
                                                                                    if (field625) {
                                                                                        if (Statics.field2823 == Statics.field1779 && field728 != field708) {
                                                                                            class310 var68 = Statics.field2823;
                                                                                            byte var69 = 0;
                                                                                            if (field680 == 1 && var68.field3556 == 206) {
                                                                                                var69 = 1;
                                                                                            }
                                                                                            if (var68.field3688[field708] <= 0) {
                                                                                                var69 = 0;
                                                                                            }
                                                                                            if (class311.method209(method3252(var68))) {
                                                                                                int var70 = field728;
                                                                                                int var71 = field708;
                                                                                                var68.field3688[var71] = var68.field3688[var70];
                                                                                                var68.field3689[var71] = var68.field3689[var70];
                                                                                                var68.field3688[var70] = -1;
                                                                                                var68.field3689[var70] = 0;
                                                                                            } else if (var69 == 1) {
                                                                                                int var72 = field728;
                                                                                                int var73 = field708;
                                                                                                while (var72 != var73) {
                                                                                                    if (var72 > var73) {
                                                                                                        var68.method5668(var72 - 1, var72);
                                                                                                        var72--;
                                                                                                    } else if (var72 < var73) {
                                                                                                        var68.method5668(var72 + 1, var72);
                                                                                                        var72++;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                var68.method5668(field708, field728);
                                                                                            }
                                                                                            class282 var74 = class282.method4287(class280.field3145, field689.field1390);
                                                                                            var74.field3187.method8003(field728);
                                                                                            var74.field3187.method8002(field708);
                                                                                            var74.field3187.method7993(var69);
                                                                                            var74.field3187.method7968(Statics.field2823.field3701);
                                                                                            field689.method2694(var74);
                                                                                        }
                                                                                    } else if (this.method1168()) {
                                                                                        this.method1282(field622, field623);
                                                                                    } else if (field651 > 0) {
                                                                                        method5886(field622, field623);
                                                                                    }
                                                                                    field744 = 10;
                                                                                    class36.field262 = 0;
                                                                                    Statics.field2823 = null;
                                                                                } else if (field626 >= 5 && (class36.field251 > field622 + 5 || class36.field251 < field622 - 5 || class36.field252 > field623 + 5 || class36.field252 < field623 - 5)) {
                                                                                    field625 = true;
                                                                                }
                                                                            }
                                                                            if (class220.method4169()) {
                                                                                int var75 = class220.field2569;
                                                                                int var76 = class220.field2570;
                                                                                class282 var77 = class282.method4287(class280.field3159, field689.field1390);
                                                                                var77.field3187.method7947(5);
                                                                                var77.field3187.method7950(Statics.field2118 + var75);
                                                                                var77.field3187.method8085(field703.method3820(82) ? (field703.method3820(81) ? 2 : 1) : 0);
                                                                                var77.field3187.method7950(Statics.field565 + var76);
                                                                                field689.method2694(var77);
                                                                                class220.method4166();
                                                                                field597 = class36.field259;
                                                                                field615 = class36.field260;
                                                                                field617 = 1;
                                                                                field616 = 0;
                                                                                field755 = var75;
                                                                                field756 = var76;
                                                                            }
                                                                            if (Statics.field151 != var49) {
                                                                                if (var49 != null) {
                                                                                    method2361(var49);
                                                                                }
                                                                                if (Statics.field151 != null) {
                                                                                    method2361(Statics.field151);
                                                                                }
                                                                            }
                                                                            if (Statics.field103 != var50 && field667 == field666) {
                                                                                if (var50 != null) {
                                                                                    method2361(var50);
                                                                                }
                                                                                if (Statics.field103 != null) {
                                                                                    method2361(Statics.field103);
                                                                                }
                                                                            }
                                                                            if (Statics.field103 == null) {
                                                                                if (field666 > 0) {
                                                                                    field666--;
                                                                                }
                                                                            } else if (field666 < field667) {
                                                                                field666++;
                                                                                if (field667 == field666) {
                                                                                    method2361(Statics.field103);
                                                                                }
                                                                            }
                                                                            if (field507 == 0) {
                                                                                int var78 = Statics.field4508.field1204;
                                                                                int var79 = Statics.field4508.field1161;
                                                                                if (Statics.field2908 - var78 < -500 || Statics.field2908 - var78 > 500 || Statics.field1461 - var79 < -500 || Statics.field1461 - var79 > 500) {
                                                                                    Statics.field2908 = var78;
                                                                                    Statics.field1461 = var79;
                                                                                }
                                                                                if (Statics.field2908 != var78) {
                                                                                    Statics.field2908 += (var78 - Statics.field2908) / 16;
                                                                                }
                                                                                if (Statics.field1461 != var79) {
                                                                                    Statics.field1461 += (var79 - Statics.field1461) / 16;
                                                                                }
                                                                                int var80 = Statics.field2908 >> 7;
                                                                                int var81 = Statics.field1461 >> 7;
                                                                                int var82 = method6114(Statics.field2908, Statics.field1461, Statics.field1370);
                                                                                int var83 = 0;
                                                                                if (var80 > 3 && var81 > 3 && var80 < 100 && var81 < 100) {
                                                                                    for (int var84 = var80 - 4; var84 <= var80 + 4; var84++) {
                                                                                        for (int var85 = var81 - 4; var85 <= var81 + 4; var85++) {
                                                                                            int var86 = Statics.field1370;
                                                                                            if (var86 < 3 && (class78.field1009[1][var84][var85] & 0x2) == 2) {
                                                                                                var86++;
                                                                                            }
                                                                                            int var87 = var82 - class78.field1015[var86][var84][var85];
                                                                                            if (var87 > var83) {
                                                                                                var83 = var87;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                int var88 = var83 * 192;
                                                                                if (var88 > 98048) {
                                                                                    var88 = 98048;
                                                                                }
                                                                                if (var88 < 32768) {
                                                                                    var88 = 32768;
                                                                                }
                                                                                if (var88 > field599) {
                                                                                    field599 += (var88 - field599) / 24;
                                                                                } else if (var88 < field599) {
                                                                                    field599 += (var88 - field599) / 80;
                                                                                }
                                                                                Statics.field4574 = method6114(Statics.field4508.field1204, Statics.field4508.field1161, Statics.field1370) - field589;
                                                                            } else if (field507 == 1) {
                                                                                method1143();
                                                                                short var89 = -1;
                                                                                if (field703.method3820(33)) {
                                                                                    var89 = 0;
                                                                                } else if (field703.method3820(49)) {
                                                                                    var89 = 1024;
                                                                                }
                                                                                if (field703.method3820(48)) {
                                                                                    if (var89 == 0) {
                                                                                        var89 = 1792;
                                                                                    } else if (var89 == 1024) {
                                                                                        var89 = 1280;
                                                                                    } else {
                                                                                        var89 = 1536;
                                                                                    }
                                                                                } else if (field703.method3820(50)) {
                                                                                    if (var89 == 0) {
                                                                                        var89 = 256;
                                                                                    } else if (var89 == 1024) {
                                                                                        var89 = 768;
                                                                                    } else {
                                                                                        var89 = 512;
                                                                                    }
                                                                                }
                                                                                byte var90 = 0;
                                                                                if (field703.method3820(35)) {
                                                                                    var90 = -1;
                                                                                } else if (field703.method3820(51)) {
                                                                                    var90 = 1;
                                                                                }
                                                                                int var91 = 0;
                                                                                if (var89 >= 0 || var90 != 0) {
                                                                                    int var92 = field703.method3820(81) ? field594 : field593;
                                                                                    var91 = var92 * 16;
                                                                                    field591 = var89;
                                                                                    field532 = var90;
                                                                                }
                                                                                if (field590 < var91) {
                                                                                    field590 += var91 / 8;
                                                                                    if (field590 > var91) {
                                                                                        field590 = var91;
                                                                                    }
                                                                                } else if (field590 > var91) {
                                                                                    field590 = field590 * 9 / 10;
                                                                                }
                                                                                if (field590 > 0) {
                                                                                    int var93 = field590 / 16;
                                                                                    if (field591 >= 0) {
                                                                                        int var94 = field591 - Statics.field3332 & 0x7FF;
                                                                                        int var95 = class217.field2515[var94];
                                                                                        int var96 = class217.field2516[var94];
                                                                                        Statics.field2908 += var93 * var95 / 65536;
                                                                                        Statics.field1461 += var93 * var96 / 65536;
                                                                                    }
                                                                                    if (field532 != 0) {
                                                                                        Statics.field4574 += field532 * var93;
                                                                                        if (Statics.field4574 > 0) {
                                                                                            Statics.field4574 = 0;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    field591 = -1;
                                                                                    field532 = -1;
                                                                                }
                                                                                if (field703.method3820(13)) {
                                                                                    field689.method2694(class282.method4287(class280.field3160, field689.field1390));
                                                                                    field507 = 0;
                                                                                }
                                                                            }
                                                                            if (class36.field250 == 4 && Statics.field4559) {
                                                                                int var97 = class36.field252 - field548;
                                                                                field585 = var97 * 2;
                                                                                field548 = var97 == -1 || var97 == 1 ? class36.field252 : (field548 + class36.field252) / 2;
                                                                                int var98 = field586 - class36.field251;
                                                                                field584 = var98 * 2;
                                                                                field586 = var98 == -1 || var98 == 1 ? class36.field251 : (field586 + class36.field251) / 2;
                                                                            } else {
                                                                                if (field703.method3820(96)) {
                                                                                    field584 += (-24 - field584) / 2;
                                                                                } else if (field703.method3820(97)) {
                                                                                    field584 += (24 - field584) / 2;
                                                                                } else {
                                                                                    field584 /= 2;
                                                                                }
                                                                                if (field703.method3820(98)) {
                                                                                    field585 += (12 - field585) / 2;
                                                                                } else if (field703.method3820(99)) {
                                                                                    field585 += (-12 - field585) / 2;
                                                                                } else {
                                                                                    field585 /= 2;
                                                                                }
                                                                                field548 = class36.field252;
                                                                                field586 = class36.field251;
                                                                            }
                                                                            field583 = field584 / 2 + field583 & 0x7FF;
                                                                            field582 += field585 / 2;
                                                                            if (field582 < 128) {
                                                                                field582 = 128;
                                                                            }
                                                                            if (field582 > 383) {
                                                                                field582 = 383;
                                                                            }
                                                                            if (field768) {
                                                                                method4493();
                                                                            } else if (field767) {
                                                                                int var99 = Statics.field2637 * 128 + 64;
                                                                                int var100 = Statics.field1417 * 128 + 64;
                                                                                int var101 = method6114(var99, var100, Statics.field1370) - Statics.field56;
                                                                                method5037(var99, var101, var100);
                                                                                int var102 = Statics.field2807 * 128 + 64;
                                                                                int var103 = Statics.field1353 * 128 + 64;
                                                                                int var104 = method6114(var102, var103, Statics.field1370) - Statics.field2267;
                                                                                int var105 = var102 - Statics.field1743;
                                                                                int var106 = var104 - Statics.field1462;
                                                                                int var107 = var103 - Statics.field4373;
                                                                                int var108 = (int) Math.sqrt((double) (var105 * var105 + var107 * var107));
                                                                                int var109 = (int) (Math.atan2((double) var106, (double) var108) * 325.9490051269531D) & 0x7FF;
                                                                                int var110 = (int) (Math.atan2((double) var105, (double) var107) * -325.9490051269531D) & 0x7FF;
                                                                                method3726(var109, var110);
                                                                            }
                                                                            for (int var111 = 0; var111 < 5; var111++) {
                                                                                int var10002 = field773[var111]++;
                                                                            }
                                                                            Statics.field35.method2639();
                                                                            int var112 = class36.method2973();
                                                                            int var113 = field237.method346();
                                                                            if (var112 > 15000 && var113 > 15000) {
                                                                                field610 = 250;
                                                                                class36.field245 = 14500;
                                                                                class282 var115 = class282.method4287(class280.field3141, field689.field1390);
                                                                                field689.method2694(var115);
                                                                            }
                                                                            Statics.field1944.method1753();
                                                                            for (int var116 = 0; var116 < field798.size(); var116++) {
                                                                                if (class203.method1997((Integer) field798.get(var116)) != 2) {
                                                                                    field798.remove(var116);
                                                                                    var116--;
                                                                                }
                                                                            }
                                                                            field689.field1401++;
                                                                            if (field689.field1401 > 50) {
                                                                                class282 var117 = class282.method4287(class280.field3099, field689.field1390);
                                                                                field689.method2694(var117);
                                                                            }
                                                                            try {
                                                                                field689.method2687();
                                                                            } catch (IOException var119) {
                                                                                method4828();
                                                                            }
                                                                            return;
                                                                        }
                                                                    } while (var63 == null);
                                                                } while (var63.field2325 == null);
                                                                if (var63.field2325.field3558 < 0) {
                                                                    break;
                                                                }
                                                                var64 = class310.method2952(var63.field2325.field3571);
                                                            } while (var64 == null || var64.field3694 == null || var64.field3694.length == 0 || var63.field2325.field3558 >= var64.field3694.length || var64.field3694[var63.field2325.field3558] != var63.field2325);
                                                            if (var63.field2325.field3657 == 11 && var63.field2318 == 0) {
                                                                switch(var63.field2325.method5688()) {
                                                                    case 0:
                                                                        class32.method2581(var63.field2325.method5699(), true, false);
                                                                        break;
                                                                    case 1:
                                                                        if (class311.method3417(method3252(var63.field2325))) {
                                                                            int[] var65 = var63.field2325.method5717();
                                                                            if (var65 != null) {
                                                                                class282 var66 = class282.method4287(class280.field3165, field689.field1390);
                                                                                var66.field3187.method8166(var65[2]);
                                                                                var66.field3187.method8016(var65[1]);
                                                                                var66.field3187.method8048(var63.field2325.method5805());
                                                                                var66.field3187.method7968(var63.field2325.field3701);
                                                                                var66.field3187.method8004(var63.field2325.field3558);
                                                                                var66.field3187.method8016(var65[0]);
                                                                                field689.method2694(var66);
                                                                            }
                                                                        }
                                                                }
                                                            } else if (var63.field2325.field3657 == 12) {
                                                                class308 var67 = var63.field2325.method5705();
                                                                if (var67 != null && var67.method5424()) {
                                                                    switch(var63.field2318) {
                                                                        case 0:
                                                                            field753.method3794(var63.field2325);
                                                                            var67.method5527(true);
                                                                            var67.method5432(var63.field2320, var63.field2323, field703.method3820(82), field703.method3820(81));
                                                                            break;
                                                                        case 1:
                                                                            var67.method5518(var63.field2320, var63.field2323);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                var61 = var60.field1073;
                                                if (var61.field3558 < 0) {
                                                    break;
                                                }
                                                var62 = class310.method2952(var61.field3571);
                                            } while (var62 == null || var62.field3694 == null || var61.field3558 >= var62.field3694.length || var62.field3694[var61.field3558] != var61);
                                            class67.method4946(var60);
                                        }
                                    }
                                    var58 = var57.field1073;
                                    if (var58.field3558 < 0) {
                                        break;
                                    }
                                    var59 = class310.method2952(var58.field3571);
                                } while (var59 == null || var59.field3694 == null || var58.field3558 >= var59.field3694.length || var59.field3694[var58.field3558] != var58);
                                class67.method4946(var57);
                            }
                        }
                        var55 = var54.field1073;
                        if (var55.field3558 < 0) {
                            break;
                        }
                        var56 = class310.method2952(var55.field3571);
                    } while (var56 == null || var56.field3694 == null || var55.field3558 >= var56.field3694.length || var56.field3694[var55.field3558] != var55);
                    class67.method4946(var54);
                }
            }
            class282 var4 = class282.method4287(class280.field3133, field689.field1390);
            var4.field3187.method7947(0);
            int var5 = var4.field3187.field4939;
            class37.method3133(var4.field3187);
            var4.field3187.method8130(var4.field3187.field4939 - var5);
            field689.method2694(var4);
        }
    }

    @ObfuscatedName("gw.gk(S)V")
    public static final void method3415() {
        if (Statics.field2941 != null) {
            Statics.field2941.method773();
        }
        if (Statics.field339 != null) {
            Statics.field339.method773();
        }
    }

    @ObfuscatedName("n.ga(I)V")
    public static final void method59() {
        for (int var0 = 0; var0 < field761; var0++) {
            int var10002 = field713[var0]--;
            if (field713[var0] >= -10) {
                class40 var2 = field766[var0];
                if (var2 == null) {
                    class40 var10000 = (class40) null;
                    var2 = class40.method734(Statics.field1002, field633[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field713[var0] += var2.method732();
                    field766[var0] = var2;
                }
                if (field713[var0] < 0) {
                    int var9;
                    if (field765[var0] == 0) {
                        var9 = Statics.field1404.method2381();
                    } else {
                        int var3 = (field765[var0] & 0xFF) * 128;
                        int var4 = field765[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field4508.field1204;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field765[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field4508.field1161;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field713[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = (var3 - var8) * Statics.field1404.method2383() / var3;
                    }
                    if (var9 > 0) {
                        class41 var10 = var2.method733().method744(Statics.field2998);
                        class48 var11 = class48.method854(var10, 100, var9);
                        var11.method856(field609[var0] - 1);
                        Statics.field2376.method693(var11);
                    }
                    field713[var0] = -100;
                }
            } else {
                field761--;
                for (int var1 = var0; var1 < field761; var1++) {
                    field633[var1] = field633[var1 + 1];
                    field766[var1] = field766[var1 + 1];
                    field609[var1] = field609[var1 + 1];
                    field713[var1] = field713[var1 + 1];
                    field765[var1] = field765[var1 + 1];
                }
                var0--;
            }
        }
        if (field672 && !class291.method2106()) {
            if (Statics.field1404.method2379() != 0 && field723 != -1) {
                class291.method3020(Statics.field1761, field723, 0, Statics.field1404.method2379(), false);
            }
            field672 = false;
        }
    }

    @ObfuscatedName("ah.gf(Lge;IIII)V")
    public static void method841(class203 arg0, int arg1, int arg2, int arg3) {
        if (field761 < 50 && Statics.field1404.method2383() != 0 && arg0.field2297 != null && arg1 < arg0.field2297.length) {
            method7825(arg0.field2297[arg1], arg2, arg3);
        }
    }

    @ObfuscatedName("le.gi(Lge;IIII)V")
    public static void method5897(class203 arg0, int arg1, int arg2, int arg3) {
        if (field761 < 50 && Statics.field1404.method2383() != 0 && arg0.field2291 != null && arg0.field2291.containsKey(arg1)) {
            method7825((Integer) arg0.field2291.get(arg1), arg2, arg3);
        }
    }

    @ObfuscatedName("qw.gx(IIII)V")
    public static void method7825(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            return;
        }
        int var3 = arg0 >> 8;
        int var4 = arg0 >> 4 & 0x7;
        int var5 = arg0 & 0xF;
        field633[field761] = var3;
        field609[field761] = var4;
        field713[field761] = 0;
        field766[field761] = null;
        int var6 = (arg1 - 64) / 128;
        int var7 = (arg2 - 64) / 128;
        field765[field761] = (var6 << 16) + (var7 << 8) + var5;
        field761++;
    }

    @ObfuscatedName("jo.gq(IIIB)V")
    public static void method5038(int arg0, int arg1, int arg2) {
        if (Statics.field1404.method2381() == 0 || arg1 == 0 || field761 >= 50) {
            return;
        }
        field633[field761] = arg0;
        field609[field761] = arg1;
        field713[field761] = arg2;
        field766[field761] = null;
        field765[field761] = 0;
        field761++;
    }

    @ObfuscatedName("kb.gw(II)V")
    public static void method5310(int arg0) {
        if (arg0 == -1 && !field672) {
            class291.method3262();
        } else if (arg0 != -1 && field723 != arg0 && Statics.field1404.method2379() != 0 && !field672) {
            class291.method5071(2, Statics.field1761, arg0, 0, Statics.field1404.method2379(), false);
        }
        field723 = arg0;
    }

    @ObfuscatedName("cd.gj(IIB)V")
    public static void method2219(int arg0, int arg1) {
        if (Statics.field1404.method2379() != 0 && arg0 != -1) {
            class291.method3020(Statics.field3449, arg0, 0, Statics.field1404.method2379(), false);
            field672 = true;
        }
    }

    @ObfuscatedName("nq.go(B)V")
    public static final void method6622() {
        if (!Statics.field2939) {
            return;
        }
        if (Statics.field4903 != null) {
            Statics.field4903.method7104();
        }
        method5062();
        Statics.field2939 = false;
    }

    @ObfuscatedName("hw.gd(Lkz;III)V")
    public static final void method4298(class310 arg0, int arg1, int arg2) {
        if (field671 != 0 && field671 != 3 || field650 || !(class36.field262 == 1 || !Statics.field4559 && class36.field262 == 4)) {
            return;
        }
        class299 var3 = arg0.method5677(true);
        if (var3 == null) {
            return;
        }
        int var4 = class36.field259 - arg1;
        int var5 = class36.field260 - arg2;
        if (!var3.method5306(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field3454 / 2;
        int var7 = var5 - var3.field3452 / 2;
        int var8 = field583 & 0x7FF;
        int var9 = class217.field2515[var8];
        int var10 = class217.field2516[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field4508.field1204 + var11 >> 7;
        int var14 = Statics.field4508.field1161 - var12 >> 7;
        class282 var15 = class282.method4287(class280.field3088, field689.field1390);
        var15.field3187.method7947(18);
        var15.field3187.method7950(Statics.field2118 + var13);
        var15.field3187.method8085(field703.method3820(82) ? (field703.method3820(81) ? 2 : 1) : 0);
        var15.field3187.method7950(Statics.field565 + var14);
        var15.field3187.method7947(var6);
        var15.field3187.method7947(var7);
        var15.field3187.method7950(field583);
        var15.field3187.method7947(57);
        var15.field3187.method7947(0);
        var15.field3187.method7947(0);
        var15.field3187.method7947(89);
        var15.field3187.method7950(Statics.field4508.field1204);
        var15.field3187.method7950(Statics.field4508.field1161);
        var15.field3187.method7947(63);
        field689.method2694(var15);
        field755 = var13;
        field756 = var14;
    }

    @ObfuscatedName("dp.gg(I)V")
    public static final void method2838() {
        int[] var0 = class103.field1350;
        for (int var1 = 0; var1 < class103.field1343; var1++) {
            class88 var2 = field621[var0[var1]];
            if (var2 != null && var2.field1184 > 0) {
                var2.field1184--;
                if (var2.field1184 == 0) {
                    var2.field1195 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field556; var3++) {
            int var4 = field557[var3];
            class96 var5 = field683[var4];
            if (var5 != null && var5.field1184 > 0) {
                var5.field1184--;
                if (var5.field1184 == 0) {
                    var5.field1195 = null;
                }
            }
        }
    }

    @ObfuscatedName("bl.gc(Ljava/lang/String;I)V")
    public static final void method1086(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field1404.method2435(!Statics.field1404.method2456());
            if (Statics.field1404.method2456()) {
                class106.method5047(99, "", "Roofs are now all hidden");
            } else {
                class106.method5047(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            Statics.field1404.method2372();
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            field522 = !field522;
        }
        if (arg0.equalsIgnoreCase("mouseovertext")) {
            field663 = !field663;
        }
        if (field684 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equalsIgnoreCase("showcoord")) {
                Statics.field4300.field4814 = !Statics.field4300.field4814;
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                Statics.field1404.method2369(true);
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                Statics.field1404.method2369(false);
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method4828();
            }
        }
        class282 var1 = class282.method4287(class280.field3092, field689.field1390);
        var1.field3187.method7947(arg0.length() + 1);
        var1.field3187.method7954(arg0);
        field689.method2694(var1);
    }

    @ObfuscatedName("hg.gs(I)V")
    public static final void method4493() {
        method5037(Statics.field2875, Statics.field1405, Statics.field2971);
        method3726(Statics.field1630, Statics.field89);
        if (Statics.field2875 != Statics.field1743 || Statics.field1462 != Statics.field1405 || Statics.field4373 != Statics.field2971 || Statics.field1630 != Statics.field1358 || Statics.field89 != Statics.field3332) {
            return;
        }
        field768 = false;
        field767 = false;
        Statics.field2807 = 0;
        Statics.field1353 = 0;
        Statics.field2267 = 0;
        Statics.field486 = 0;
        Statics.field1321 = 0;
        Statics.field1445 = 0;
        Statics.field4341 = 0;
        Statics.field2637 = 0;
        Statics.field1417 = 0;
        Statics.field56 = 0;
    }

    @ObfuscatedName("jo.gh(IIII)V")
    public static final void method5037(int arg0, int arg1, int arg2) {
        if (Statics.field1743 < arg0) {
            Statics.field1743 += Statics.field1445 * (arg0 - Statics.field1743) / 1000 + Statics.field4341;
            if (Statics.field1743 > arg0) {
                Statics.field1743 = arg0;
            }
        }
        if (Statics.field1743 > arg0) {
            Statics.field1743 -= Statics.field1445 * (Statics.field1743 - arg0) / 1000 + Statics.field4341;
            if (Statics.field1743 < arg0) {
                Statics.field1743 = arg0;
            }
        }
        if (Statics.field1462 < arg1) {
            Statics.field1462 += Statics.field1445 * (arg1 - Statics.field1462) / 1000 + Statics.field4341;
            if (Statics.field1462 > arg1) {
                Statics.field1462 = arg1;
            }
        }
        if (Statics.field1462 > arg1) {
            Statics.field1462 -= Statics.field1445 * (Statics.field1462 - arg1) / 1000 + Statics.field4341;
            if (Statics.field1462 < arg1) {
                Statics.field1462 = arg1;
            }
        }
        if (Statics.field4373 < arg2) {
            Statics.field4373 += Statics.field1445 * (arg2 - Statics.field4373) / 1000 + Statics.field4341;
            if (Statics.field4373 > arg2) {
                Statics.field4373 = arg2;
            }
        }
        if (Statics.field4373 > arg2) {
            Statics.field4373 -= Statics.field1445 * (Statics.field4373 - arg2) / 1000 + Statics.field4341;
            if (Statics.field4373 < arg2) {
                Statics.field4373 = arg2;
            }
        }
    }

    @ObfuscatedName("gz.gy(III)V")
    public static final void method3726(int arg0, int arg1) {
        if (arg0 < 128) {
            arg0 = 128;
        }
        if (arg0 > 383) {
            arg0 = 383;
        }
        if (Statics.field1358 < arg0) {
            Statics.field1358 += Statics.field1321 * (arg0 - Statics.field1358) / 1000 + Statics.field486;
            if (Statics.field1358 > arg0) {
                Statics.field1358 = arg0;
            }
        }
        if (Statics.field1358 > arg0) {
            Statics.field1358 -= Statics.field1321 * (Statics.field1358 - arg0) / 1000 + Statics.field486;
            if (Statics.field1358 < arg0) {
                Statics.field1358 = arg0;
            }
        }
        int var2 = arg1 - Statics.field3332;
        if (var2 > 1024) {
            var2 -= 2048;
        }
        if (var2 < -1024) {
            var2 += 2048;
        }
        if (var2 > 0) {
            Statics.field3332 += Statics.field1321 * var2 / 1000 + Statics.field486;
            Statics.field3332 &= 0x7FF;
        }
        if (var2 < 0) {
            Statics.field3332 -= Statics.field1321 * -var2 / 1000 + Statics.field486;
            Statics.field3332 &= 0x7FF;
        }
        int var3 = arg1 - Statics.field3332;
        if (var3 > 1024) {
            var3 -= 2048;
        }
        if (var3 < -1024) {
            var3 += 2048;
        }
        if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) {
            Statics.field3332 = arg1;
        }
    }

    @ObfuscatedName("bs.gn(I)V")
    public static final void method1992() {
        int var0 = class103.field1343;
        int[] var1 = class103.field1350;
        for (int var2 = 0; var2 < var0; var2++) {
            class88 var3 = field621[var1[var2]];
            if (var3 != null) {
                method779(var3, 1);
            }
        }
    }

    @ObfuscatedName("gh.gb(B)V")
    public static final void method3511() {
        for (int var0 = 0; var0 < field556; var0++) {
            int var1 = field557[var0];
            class96 var2 = field683[var1];
            if (var2 != null) {
                method779(var2, var2.field1295.field2030);
            }
        }
    }

    @ObfuscatedName("ak.gp(Lcb;II)V")
    public static final void method779(class91 arg0, int arg1) {
        if (arg0.field1216 >= field511) {
            int var2 = Math.max(1, arg0.field1216 - field511);
            int var3 = arg0.field1212 * 128 + arg0.field1164 * 64;
            int var4 = arg0.field1214 * 128 + arg0.field1164 * 64;
            arg0.field1204 += (var3 - arg0.field1204) / var2;
            arg0.field1161 += (var4 - arg0.field1161) / var2;
            arg0.field1176 = 0;
            arg0.field1227 = arg0.field1218;
        } else if (arg0.field1190 >= field511) {
            boolean var5 = field511 == arg0.field1190 || arg0.field1224 == -1 || arg0.field1205 != 0;
            if (!var5) {
                class203 var6 = class203.method2227(arg0.field1224);
                if (var6 == null || var6.method3769()) {
                    var5 = true;
                } else {
                    var5 = arg0.field1171 + 1 > var6.field2296[arg0.field1170];
                }
            }
            if (var5) {
                int var7 = arg0.field1190 - arg0.field1216;
                int var8 = field511 - arg0.field1216;
                int var9 = arg0.field1212 * 128 + arg0.field1164 * 64;
                int var10 = arg0.field1214 * 128 + arg0.field1164 * 64;
                int var11 = arg0.field1213 * 128 + arg0.field1164 * 64;
                int var12 = arg0.field1215 * 128 + arg0.field1164 * 64;
                arg0.field1204 = ((var7 - var8) * var9 + var8 * var11) / var7;
                arg0.field1161 = ((var7 - var8) * var10 + var8 * var12) / var7;
            }
            arg0.field1176 = 0;
            arg0.field1227 = arg0.field1218;
            arg0.field1202 = arg0.field1227;
        } else {
            arg0.field1198 = arg0.field1166;
            if (arg0.field1230 == 0) {
                arg0.field1176 = 0;
            } else {
                label615: {
                    if (arg0.field1224 != -1 && arg0.field1205 == 0) {
                        class203 var13 = class203.method2227(arg0.field1224);
                        if (arg0.field1231 > 0 && var13.field2308 == 0) {
                            arg0.field1176++;
                            break label615;
                        }
                        if (arg0.field1231 <= 0 && var13.field2302 == 0) {
                            arg0.field1176++;
                            break label615;
                        }
                    }
                    int var14 = arg0.field1204;
                    int var15 = arg0.field1161;
                    int var16 = arg0.field1210[arg0.field1230 - 1] * 128 + arg0.field1164 * 64;
                    int var17 = arg0.field1232[arg0.field1230 - 1] * 128 + arg0.field1164 * 64;
                    if (var14 < var16) {
                        if (var15 < var17) {
                            arg0.field1227 = 1280;
                        } else if (var15 > var17) {
                            arg0.field1227 = 1792;
                        } else {
                            arg0.field1227 = 1536;
                        }
                    } else if (var14 > var16) {
                        if (var15 < var17) {
                            arg0.field1227 = 768;
                        } else if (var15 > var17) {
                            arg0.field1227 = 256;
                        } else {
                            arg0.field1227 = 512;
                        }
                    } else if (var15 < var17) {
                        arg0.field1227 = 1024;
                    } else if (var15 > var17) {
                        arg0.field1227 = 0;
                    }
                    class209 var18 = arg0.field1233[arg0.field1230 - 1];
                    if (var16 - var14 <= 256 && var16 - var14 >= -256 && var17 - var15 <= 256 && var17 - var15 >= -256) {
                        int var19 = arg0.field1227 - arg0.field1202 & 0x7FF;
                        if (var19 > 1024) {
                            var19 -= 2048;
                        }
                        int var20 = arg0.field1183;
                        if (var19 >= -256 && var19 <= 256) {
                            var20 = arg0.field1223;
                        } else if (var19 >= 256 && var19 < 768) {
                            var20 = arg0.field1172;
                        } else if (var19 >= -768 && var19 <= -256) {
                            var20 = arg0.field1203;
                        }
                        if (var20 == -1) {
                            var20 = arg0.field1223;
                        }
                        arg0.field1198 = var20;
                        int var21 = 4;
                        boolean var22 = true;
                        if (arg0 instanceof class96) {
                            var22 = ((class96) arg0).field1295.field2065;
                        }
                        if (var22) {
                            if (arg0.field1227 != arg0.field1202 && arg0.field1194 == -1 && arg0.field1229 != 0) {
                                var21 = 2;
                            }
                            if (arg0.field1230 > 2) {
                                var21 = 6;
                            }
                            if (arg0.field1230 > 3) {
                                var21 = 8;
                            }
                            if (arg0.field1176 > 0 && arg0.field1230 > 1) {
                                var21 = 8;
                                arg0.field1176--;
                            }
                        } else {
                            if (arg0.field1230 > 1) {
                                var21 = 6;
                            }
                            if (arg0.field1230 > 2) {
                                var21 = 8;
                            }
                            if (arg0.field1176 > 0 && arg0.field1230 > 1) {
                                var21 = 8;
                                arg0.field1176--;
                            }
                        }
                        if (class209.field2363 == var18) {
                            var21 <<= 0x1;
                        } else if (class209.field2367 == var18) {
                            var21 >>= 0x1;
                        }
                        if (var21 >= 8) {
                            if (arg0.field1223 == arg0.field1198 && arg0.field1235 != -1) {
                                arg0.field1198 = arg0.field1235;
                            } else if (arg0.field1198 == arg0.field1183 && arg0.field1174 != -1) {
                                arg0.field1198 = arg0.field1174;
                            } else if (arg0.field1203 == arg0.field1198 && arg0.field1175 != -1) {
                                arg0.field1198 = arg0.field1175;
                            } else if (arg0.field1198 == arg0.field1172 && arg0.field1169 != -1) {
                                arg0.field1198 = arg0.field1169;
                            }
                        } else if (var21 <= 1) {
                            if (arg0.field1223 == arg0.field1198 && arg0.field1188 != -1) {
                                arg0.field1198 = arg0.field1188;
                            } else if (arg0.field1198 == arg0.field1183 && arg0.field1173 != -1) {
                                arg0.field1198 = arg0.field1173;
                            } else if (arg0.field1203 == arg0.field1198 && arg0.field1179 != -1) {
                                arg0.field1198 = arg0.field1179;
                            } else if (arg0.field1198 == arg0.field1172 && arg0.field1180 != -1) {
                                arg0.field1198 = arg0.field1180;
                            }
                        }
                        if (var14 != var16 || var15 != var17) {
                            if (var14 < var16) {
                                arg0.field1204 += var21;
                                if (arg0.field1204 > var16) {
                                    arg0.field1204 = var16;
                                }
                            } else if (var14 > var16) {
                                arg0.field1204 -= var21;
                                if (arg0.field1204 < var16) {
                                    arg0.field1204 = var16;
                                }
                            }
                            if (var15 < var17) {
                                arg0.field1161 += var21;
                                if (arg0.field1161 > var17) {
                                    arg0.field1161 = var17;
                                }
                            } else if (var15 > var17) {
                                arg0.field1161 -= var21;
                                if (arg0.field1161 < var17) {
                                    arg0.field1161 = var17;
                                }
                            }
                        }
                        if (arg0.field1204 == var16 && arg0.field1161 == var17) {
                            arg0.field1230--;
                            if (arg0.field1231 > 0) {
                                arg0.field1231--;
                            }
                        }
                    } else {
                        arg0.field1204 = var16;
                        arg0.field1161 = var17;
                        arg0.field1230--;
                        if (arg0.field1231 > 0) {
                            arg0.field1231--;
                        }
                    }
                }
            }
        }
        if (arg0.field1204 < 128 || arg0.field1161 < 128 || arg0.field1204 >= 13184 || arg0.field1161 >= 13184) {
            arg0.field1224 = -1;
            arg0.field1207 = -1;
            arg0.field1216 = 0;
            arg0.field1190 = 0;
            arg0.field1204 = arg0.field1210[0] * 128 + arg0.field1164 * 64;
            arg0.field1161 = arg0.field1232[0] * 128 + arg0.field1164 * 64;
            arg0.method2311();
        }
        if (Statics.field4508 == arg0 && (arg0.field1204 < 1536 || arg0.field1161 < 1536 || arg0.field1204 >= 11776 || arg0.field1161 >= 11776)) {
            arg0.field1224 = -1;
            arg0.field1207 = -1;
            arg0.field1216 = 0;
            arg0.field1190 = 0;
            arg0.field1204 = arg0.field1210[0] * 128 + arg0.field1164 * 64;
            arg0.field1161 = arg0.field1232[0] * 128 + arg0.field1164 * 64;
            arg0.method2311();
        }
        if (arg0.field1229 != 0) {
            if (arg0.field1194 != -1) {
                class91 var23 = null;
                int var24 = Statics.field3801 ? 65536 : 32768;
                if (arg0.field1194 < var24) {
                    var23 = field683[arg0.field1194];
                } else if (arg0.field1194 >= var24) {
                    var23 = field621[arg0.field1194 - var24];
                }
                if (var23 != null) {
                    int var25 = arg0.field1204 - var23.field1204;
                    int var26 = arg0.field1161 - var23.field1161;
                    if (var25 != 0 || var26 != 0) {
                        arg0.field1227 = (int) (Math.atan2((double) var25, (double) var26) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field1236) {
                    arg0.field1194 = -1;
                    arg0.field1236 = false;
                }
            }
            if (arg0.field1196 != -1 && (arg0.field1230 == 0 || arg0.field1176 > 0)) {
                arg0.field1227 = arg0.field1196;
                arg0.field1196 = -1;
            }
            int var27 = arg0.field1227 - arg0.field1202 & 0x7FF;
            if (var27 == 0 && arg0.field1236) {
                arg0.field1194 = -1;
                arg0.field1236 = false;
            }
            if (var27 == 0) {
                arg0.field1192 = 0;
            } else {
                arg0.field1192++;
                if (var27 > 1024) {
                    arg0.field1202 -= arg0.field1197 ? var27 : arg0.field1229;
                    boolean var28 = true;
                    if (var27 < arg0.field1229 || var27 > 2048 - arg0.field1229) {
                        arg0.field1202 = arg0.field1227;
                        var28 = false;
                    }
                    if (!arg0.field1197 && arg0.field1198 == arg0.field1166 && (arg0.field1192 > 25 || var28)) {
                        if (arg0.field1217 == -1) {
                            arg0.field1198 = arg0.field1223;
                        } else {
                            arg0.field1198 = arg0.field1217;
                        }
                    }
                } else {
                    arg0.field1202 += arg0.field1197 ? var27 : arg0.field1229;
                    boolean var29 = true;
                    if (var27 < arg0.field1229 || var27 > 2048 - arg0.field1229) {
                        arg0.field1202 = arg0.field1227;
                        var29 = false;
                    }
                    if (!arg0.field1197 && arg0.field1198 == arg0.field1166 && (arg0.field1192 > 25 || var29)) {
                        if (arg0.field1168 == -1) {
                            arg0.field1198 = arg0.field1223;
                        } else {
                            arg0.field1198 = arg0.field1168;
                        }
                    }
                }
                arg0.field1202 &= 0x7FF;
                arg0.field1197 = false;
            }
        }
        arg0.field1163 = false;
        if (arg0.field1198 != -1) {
            class203 var31 = class203.method2227(arg0.field1198);
            if (var31 == null) {
                arg0.field1198 = -1;
            } else if (!var31.method3769() && var31.field2283 != null) {
                arg0.field1200++;
                if (arg0.field1234 < var31.field2283.length && arg0.field1200 > var31.field2296[arg0.field1234]) {
                    arg0.field1200 = 1;
                    arg0.field1234++;
                    method841(var31, arg0.field1234, arg0.field1204, arg0.field1161);
                }
                if (arg0.field1234 >= var31.field2283.length) {
                    if (var31.field2282 > 0) {
                        arg0.field1234 -= var31.field2282;
                        if (var31.field2298) {
                            arg0.field1201++;
                        }
                        if (arg0.field1234 < 0 || arg0.field1234 >= var31.field2283.length || var31.field2298 && arg0.field1201 >= var31.field2305) {
                            arg0.field1200 = 0;
                            arg0.field1234 = 0;
                            arg0.field1201 = 0;
                        }
                    } else {
                        arg0.field1200 = 0;
                        arg0.field1234 = 0;
                    }
                    method841(var31, arg0.field1234, arg0.field1204, arg0.field1161);
                }
            } else if (var31.method3769()) {
                arg0.field1234++;
                int var32 = var31.method3754();
                if (arg0.field1234 < var32) {
                    method5897(var31, arg0.field1234, arg0.field1204, arg0.field1161);
                } else {
                    if (var31.field2282 > 0) {
                        arg0.field1234 -= var31.field2282;
                        if (var31.field2298) {
                            arg0.field1201++;
                        }
                        if (arg0.field1234 < 0 || arg0.field1234 >= var32 || var31.field2298 && arg0.field1201 >= var31.field2305) {
                            arg0.field1234 = 0;
                            arg0.field1200 = 0;
                            arg0.field1201 = 0;
                        }
                    } else {
                        arg0.field1200 = 0;
                        arg0.field1234 = 0;
                    }
                    method5897(var31, arg0.field1234, arg0.field1204, arg0.field1161);
                }
            } else {
                arg0.field1198 = -1;
            }
        }
        if (arg0.field1207 != -1 && field511 >= arg0.field1208) {
            if (arg0.field1199 < 0) {
                arg0.field1199 = 0;
            }
            int var33 = class193.method2221(arg0.field1207).field2097;
            if (var33 == -1) {
                arg0.field1207 = -1;
            } else {
                class203 var34 = class203.method2227(var33);
                if (var34 != null && var34.field2283 != null && !var34.method3769()) {
                    arg0.field1209++;
                    if (arg0.field1199 < var34.field2283.length && arg0.field1209 > var34.field2296[arg0.field1199]) {
                        arg0.field1209 = 1;
                        arg0.field1199++;
                        method841(var34, arg0.field1199, arg0.field1204, arg0.field1161);
                    }
                    if (arg0.field1199 >= var34.field2283.length && (arg0.field1199 < 0 || arg0.field1199 >= var34.field2283.length)) {
                        arg0.field1207 = -1;
                    }
                } else if (var34.method3769()) {
                    arg0.field1199++;
                    int var35 = var34.method3754();
                    if (arg0.field1199 < var35) {
                        method5897(var34, arg0.field1199, arg0.field1204, arg0.field1161);
                    } else if (arg0.field1199 < 0 || arg0.field1199 >= var35) {
                        arg0.field1207 = -1;
                    }
                } else {
                    arg0.field1207 = -1;
                }
            }
        }
        if (arg0.field1224 != -1 && arg0.field1205 <= 1) {
            class203 var36 = class203.method2227(arg0.field1224);
            if (var36.field2308 == 1 && arg0.field1231 > 0 && arg0.field1216 <= field511 && arg0.field1190 < field511) {
                arg0.field1205 = 1;
                return;
            }
        }
        if (arg0.field1224 != -1 && arg0.field1205 == 0) {
            class203 var37 = class203.method2227(arg0.field1224);
            if (var37 == null) {
                arg0.field1224 = -1;
            } else if (!var37.method3769() && var37.field2283 != null) {
                arg0.field1171++;
                if (arg0.field1170 < var37.field2283.length && arg0.field1171 > var37.field2296[arg0.field1170]) {
                    arg0.field1171 = 1;
                    arg0.field1170++;
                    method841(var37, arg0.field1170, arg0.field1204, arg0.field1161);
                }
                if (arg0.field1170 >= var37.field2283.length) {
                    arg0.field1170 -= var37.field2282;
                    arg0.field1206++;
                    if (arg0.field1206 >= var37.field2305) {
                        arg0.field1224 = -1;
                    } else if (arg0.field1170 >= 0 && arg0.field1170 < var37.field2283.length) {
                        method841(var37, arg0.field1170, arg0.field1204, arg0.field1161);
                    } else {
                        arg0.field1224 = -1;
                    }
                }
                arg0.field1163 = var37.field2294;
            } else if (var37.method3769()) {
                arg0.field1170++;
                int var38 = var37.method3754();
                if (arg0.field1170 < var38) {
                    method5897(var37, arg0.field1170, arg0.field1204, arg0.field1161);
                } else {
                    arg0.field1170 -= var37.field2282;
                    arg0.field1206++;
                    if (arg0.field1206 >= var37.field2305) {
                        arg0.field1224 = -1;
                    } else if (arg0.field1170 >= 0 && arg0.field1170 < var38) {
                        method5897(var37, arg0.field1170, arg0.field1204, arg0.field1161);
                    } else {
                        arg0.field1224 = -1;
                    }
                }
            } else {
                arg0.field1224 = -1;
            }
        }
        if (arg0.field1205 > 0) {
            arg0.field1205--;
        }
    }

    @ObfuscatedName("ct.gr(Lcl;IIB)V")
    public static void method2305(class88 arg0, int arg1, int arg2) {
        if (arg0.field1224 == arg1 && arg1 != -1) {
            int var3 = class203.method2227(arg1).field2309;
            if (var3 == 1) {
                arg0.field1170 = 0;
                arg0.field1171 = 0;
                arg0.field1205 = arg2;
                arg0.field1206 = 0;
            }
            if (var3 == 2) {
                arg0.field1206 = 0;
            }
        } else if (arg1 == -1 || arg0.field1224 == -1 || class203.method2227(arg1).field2293 >= class203.method2227(arg0.field1224).field2293) {
            arg0.field1224 = arg1;
            arg0.field1170 = 0;
            arg0.field1171 = 0;
            arg0.field1205 = arg2;
            arg0.field1206 = 0;
            arg0.field1231 = arg0.field1230;
        }
    }

    @ObfuscatedName("bq.gz(I)I")
    public static int method1094() {
        return field735 ? 2 : 1;
    }

    @ObfuscatedName("fe.ge(II)V")
    public static void method3136(int arg0) {
        field734 = 0L;
        if (arg0 >= 2) {
            field735 = true;
        } else {
            field735 = false;
        }
        if (method1094() == 1) {
            Statics.field427.method490(765, 503);
        } else {
            Statics.field427.method490(7680, 2160);
        }
        if (field508 < 25) {
            return;
        }
        class282 var1 = class282.method4287(class280.field3127, field689.field1390);
        var1.field3187.method7947(method1094());
        var1.field3187.method7950(Statics.field220);
        var1.field3187.method7950(Statics.field1559);
        field689.method2694(var1);
    }

    @ObfuscatedName("client.p(I)V")
    public final void method603() {
        field734 = class287.method3099() + 500L;
        this.method1162();
        if (field675 != -1) {
            this.method1210(true);
        }
    }

    @ObfuscatedName("client.gm(I)V")
    public void method1162() {
        int var1 = Statics.field220;
        int var2 = Statics.field1559;
        if (this.field238 < var1) {
            int var3 = this.field238;
        }
        if (this.field221 < var2) {
            int var4 = this.field221;
        }
        if (Statics.field1404 == null) {
            return;
        }
        try {
            client var5 = Statics.field427;
            Object[] var6 = new Object[] { method1094() };
            JSObject.getWindow(var5).call("resize", var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("client.gu(I)V")
    public final void method1163() {
        if (field675 != -1) {
            int var1 = field675;
            if (class310.method3100(var1)) {
                method6908(Statics.field2984[var1], -1);
            }
        }
        for (int var2 = 0; var2 < field724; var2++) {
            if (field726[var2]) {
                field679[var2] = true;
            }
            field561[var2] = field726[var2];
            field726[var2] = false;
        }
        field725 = field511;
        field664 = -1;
        field604 = -1;
        Statics.field1779 = null;
        if (field675 != -1) {
            field724 = 0;
            method2578(field675, 0, 0, Statics.field220, Statics.field1559, 0, 0, -1);
        }
        class484.method8287();
        if (field588) {
            if (field617 == 1) {
                Statics.field3729[field616 / 100].method8402(field597 - 8, field615 - 8);
            }
            if (field617 == 2) {
                Statics.field3729[field616 / 100 + 4].method8402(field597 - 8, field615 - 8);
            }
        }
        if (field650) {
            method3552();
        } else if (field664 != -1) {
            int var3 = field664;
            int var4 = field604;
            if ((field651 >= 2 || field668 != 0 || field670) && field663) {
                int var5 = field651 - 1;
                String var7;
                if (field668 == 1 && field651 < 2) {
                    var7 = class330.field4002 + class330.field3849 + field669 + " " + class97.field1299;
                } else if (field670 && field651 < 2) {
                    var7 = field673 + class330.field3849 + field605 + " " + class97.field1299;
                } else {
                    var7 = method7145(var5);
                }
                if (field651 > 2) {
                    var7 = var7 + class97.method3021(16777215) + " " + '/' + " " + (field651 - 2) + class330.field3947;
                }
                Statics.field109.method6643(var7, var3 + 4, var4 + 15, 16777215, 0, field511 / 1000);
            }
        }
        if (field733 == 3) {
            for (int var8 = 0; var8 < field724; var8++) {
                if (field561[var8]) {
                    class484.method8295(field729[var8], field571[var8], field731[var8], field640[var8], 16711935, 128);
                } else if (field679[var8]) {
                    class484.method8295(field729[var8], field571[var8], field731[var8], field640[var8], 16711680, 128);
                }
            }
        }
        class66.method165(Statics.field1370, Statics.field4508.field1204, Statics.field4508.field1161, field575);
        field575 = 0;
    }

    @ObfuscatedName("fd.gl(Ljava/lang/String;ZI)V")
    public static final void method3161(String arg0, boolean arg1) {
        if (!field628) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field895.method6625(arg0, 250);
        int var6 = Statics.field895.method6645(arg0, 250) * 13;
        class484.method8296(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class484.method8300(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field895.method6682(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        Statics.method6216(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field153.method467(0, 0);
        } else {
            method65(var3, var4, var5, var6);
        }
    }

    @ObfuscatedName("fp.gv(IIIII)V")
    public static final void method3301(int arg0, int arg1, int arg2, int arg3) {
        field665++;
        method3812();
        method7421();
        method783();
        method103(true);
        int var4 = class103.field1343;
        int[] var5 = class103.field1350;
        for (int var6 = 0; var6 < var4; var6++) {
            if (field641 != var5[var6] && field630 != var5[var6]) {
                method1053(field621[var5[var6]], true);
            }
        }
        method103(false);
        method3140();
        method4331();
        method5286(arg0, arg1, arg2, arg3, true);
        int var7 = field496;
        int var8 = field783;
        int var9 = field784;
        int var10 = field702;
        class484.method8288(var7, var8, var7 + var9, var8 + var10);
        class217.method4023();
        int var11 = field582;
        if (field599 / 256 > var11) {
            var11 = field599 / 256;
        }
        if (field570[4] && field526[4] + 128 > var11) {
            var11 = field526[4] + 128;
        }
        int var12 = field583 & 0x7FF;
        int var13 = Statics.field2908;
        int var14 = Statics.field4574;
        int var15 = Statics.field1461;
        int var16 = method267(var11);
        int var17 = var10 - 334;
        if (var17 < 0) {
            var17 = 0;
        } else if (var17 > 100) {
            var17 = 100;
        }
        int var18 = (field752 - field776) * var17 / 100 + field776;
        int var19 = var16 * var18 / 256;
        int var21 = 2048 - var11 & 0x7FF;
        int var22 = 2048 - var12 & 0x7FF;
        int var23 = 0;
        int var24 = 0;
        int var25 = var19;
        if (var21 != 0) {
            int var26 = class217.field2515[var21];
            int var27 = class217.field2516[var21];
            int var28 = var24 * var27 - var19 * var26 >> 16;
            var25 = var24 * var26 + var19 * var27 >> 16;
            var24 = var28;
        }
        if (var22 != 0) {
            int var29 = class217.field2515[var22];
            int var30 = class217.field2516[var22];
            int var31 = var23 * var30 + var25 * var29 >> 16;
            var25 = var25 * var30 - var23 * var29 >> 16;
            var23 = var31;
        }
        if (field767) {
            Statics.field2875 = var13 - var23;
            Statics.field1405 = var14 - var24;
            Statics.field2971 = var15 - var25;
            Statics.field1630 = var11;
            Statics.field89 = var12;
        } else {
            Statics.field1743 = var13 - var23;
            Statics.field1462 = var14 - var24;
            Statics.field4373 = var15 - var25;
            Statics.field1358 = var11;
            Statics.field3332 = var12;
        }
        if (field507 == 1 && field684 >= 2 && field511 % 50 == 0 && (Statics.field2908 >> 7 != Statics.field4508.field1204 >> 7 || Statics.field1461 >> 7 != Statics.field4508.field1161 >> 7)) {
            int var32 = Statics.field4508.field1128;
            int var33 = (Statics.field2908 >> 7) + Statics.field2118;
            int var34 = (Statics.field1461 >> 7) + Statics.field565;
            method3232(var33, var34, var32, true);
        }
        int var47;
        if (field767) {
            var47 = method426();
        } else {
            int var35;
            if (Statics.field1404.method2456()) {
                var35 = Statics.field1370;
            } else {
                label299: {
                    int var36 = 3;
                    if (Statics.field1358 < 310) {
                        int var37;
                        int var38;
                        if (field507 == 1) {
                            var37 = Statics.field2908 >> 7;
                            var38 = Statics.field1461 >> 7;
                        } else {
                            var37 = Statics.field4508.field1204 >> 7;
                            var38 = Statics.field4508.field1161 >> 7;
                        }
                        int var39 = Statics.field1743 >> 7;
                        int var40 = Statics.field4373 >> 7;
                        if (var39 < 0 || var40 < 0 || var39 >= 104 || var40 >= 104) {
                            var35 = Statics.field1370;
                            break label299;
                        }
                        if (var37 < 0 || var38 < 0 || var37 >= 104 || var38 >= 104) {
                            var35 = Statics.field1370;
                            break label299;
                        }
                        if ((class78.field1009[Statics.field1370][var39][var40] & 0x4) != 0) {
                            var36 = Statics.field1370;
                        }
                        int var41;
                        if (var37 > var39) {
                            var41 = var37 - var39;
                        } else {
                            var41 = var39 - var37;
                        }
                        int var42;
                        if (var38 > var40) {
                            var42 = var38 - var40;
                        } else {
                            var42 = var40 - var38;
                        }
                        if (var41 > var42) {
                            int var43 = var42 * 65536 / var41;
                            int var44 = 32768;
                            while (var37 != var39) {
                                if (var39 < var37) {
                                    var39++;
                                } else if (var39 > var37) {
                                    var39--;
                                }
                                if ((class78.field1009[Statics.field1370][var39][var40] & 0x4) != 0) {
                                    var36 = Statics.field1370;
                                }
                                var44 += var43;
                                if (var44 >= 65536) {
                                    var44 -= 65536;
                                    if (var40 < var38) {
                                        var40++;
                                    } else if (var40 > var38) {
                                        var40--;
                                    }
                                    if ((class78.field1009[Statics.field1370][var39][var40] & 0x4) != 0) {
                                        var36 = Statics.field1370;
                                    }
                                }
                            }
                        } else if (var42 > 0) {
                            int var45 = var41 * 65536 / var42;
                            int var46 = 32768;
                            while (var38 != var40) {
                                if (var40 < var38) {
                                    var40++;
                                } else if (var40 > var38) {
                                    var40--;
                                }
                                if ((class78.field1009[Statics.field1370][var39][var40] & 0x4) != 0) {
                                    var36 = Statics.field1370;
                                }
                                var46 += var45;
                                if (var46 >= 65536) {
                                    var46 -= 65536;
                                    if (var39 < var37) {
                                        var39++;
                                    } else if (var39 > var37) {
                                        var39--;
                                    }
                                    if ((class78.field1009[Statics.field1370][var39][var40] & 0x4) != 0) {
                                        var36 = Statics.field1370;
                                    }
                                }
                            }
                        }
                    }
                    if (Statics.field4508.field1204 >= 0 && Statics.field4508.field1161 >= 0 && Statics.field4508.field1204 < 13312 && Statics.field4508.field1161 < 13312) {
                        if ((class78.field1009[Statics.field1370][Statics.field4508.field1204 >> 7][Statics.field4508.field1161 >> 7] & 0x4) != 0) {
                            var36 = Statics.field1370;
                        }
                        var35 = var36;
                    } else {
                        var35 = Statics.field1370;
                    }
                }
            }
            var47 = var35;
        }
        int var48 = Statics.field1743;
        int var49 = Statics.field1462;
        int var50 = Statics.field4373;
        int var51 = Statics.field1358;
        int var52 = Statics.field3332;
        for (int var53 = 0; var53 < 5; var53++) {
            if (field570[var53]) {
                int var54 = (int) (Math.random() * (double) (field770[var53] * 2 + 1) - (double) field770[var53] + Math.sin((double) field772[var53] / 100.0D * (double) field773[var53]) * (double) field526[var53]);
                if (var53 == 0) {
                    Statics.field1743 += var54;
                }
                if (var53 == 1) {
                    Statics.field1462 += var54;
                }
                if (var53 == 2) {
                    Statics.field4373 += var54;
                }
                if (var53 == 3) {
                    Statics.field3332 = Statics.field3332 + var54 & 0x7FF;
                }
                if (var53 == 4) {
                    Statics.field1358 += var54;
                    if (Statics.field1358 < 128) {
                        Statics.field1358 = 128;
                    }
                    if (Statics.field1358 > 383) {
                        Statics.field1358 = 383;
                    }
                }
            }
        }
        int var55 = class36.field251;
        int var56 = class36.field252;
        if (class36.field262 != 0) {
            var55 = class36.field259;
            var56 = class36.field260;
        }
        if (var55 >= var7 && var55 < var7 + var9 && var56 >= var8 && var56 < var8 + var10) {
            class229.method2891(var55 - var7, var56 - var8);
        } else {
            class229.method2997();
        }
        method3415();
        class484.method8296(var7, var8, var9, var10, 0);
        method3415();
        int var57 = class217.field2495;
        class217.field2495 = field512;
        Statics.field3022.method4153(Statics.field1743, Statics.field1462, Statics.field4373, Statics.field1358, Statics.field3332, var47);
        class217.field2495 = var57;
        method3415();
        Statics.field3022.method4215();
        method3970(var7, var8, var9, var10);
        if (field518 == 2) {
            method7874((field521 - Statics.field2118 << 7) + field763, (field540 - Statics.field565 << 7) + field704, field523 * 2);
            if (field612 > -1 && field511 % 20 < 10) {
                Statics.field2942[0].method8402(field612 + var7 - 12, field613 + var8 - 28);
            }
        }
        ((class226) Statics.field2512).method4308(field575);
        method4284(var7, var8, var9, var10);
        Statics.field1743 = var48;
        Statics.field1462 = var49;
        Statics.field4373 = var50;
        Statics.field1358 = var51;
        Statics.field3332 = var52;
        if (field510) {
            byte var58 = 0;
            int var59 = class338.field4257 + class338.field4242 + var58;
            if (var59 == 0) {
                field510 = false;
            }
        }
        if (field510) {
            class484.method8296(var7, var8, var9, var10, 0);
            method3161(class330.field3996, false);
        }
    }

    @ObfuscatedName("kt.gt(IIIIZI)V")
    public static final void method5286(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var5 = arg3 - 334;
        int var6;
        if (var5 < 0) {
            var6 = field774;
        } else if (var5 >= 100) {
            var6 = field775;
        } else {
            var6 = (field775 - field774) * var5 / 100 + field774;
        }
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field780) {
            short var8 = field780;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field779) {
                var6 = field779;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class484.method8287();
                    class484.method8296(arg0, arg1, var10, arg3, -16777216);
                    class484.method8296(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field781) {
            short var11 = field781;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field764) {
                var6 = field764;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class484.method8287();
                    class484.method8296(arg0, arg1, arg2, var13, -16777216);
                    class484.method8296(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field512 = arg3 * var6 / 334;
        if (field784 != arg2 || field702 != arg3) {
            method3260(arg2, arg3);
        }
        field496 = arg0;
        field783 = arg1;
        field784 = arg2;
        field702 = arg3;
    }

    @ObfuscatedName("gu.hz(I)V")
    public static void method3812() {
        if (Statics.field4508.field1204 >> 7 == field755 && Statics.field4508.field1161 >> 7 == field756) {
            field755 = 0;
        }
    }

    @ObfuscatedName("pw.hf(I)V")
    public static void method7421() {
        if (field522) {
            method1053(Statics.field4508, false);
        }
    }

    @ObfuscatedName("ak.hi(I)V")
    public static void method783() {
        if (field641 >= 0 && field621[field641] != null) {
            method1053(field621[field641], false);
        }
    }

    @ObfuscatedName("br.he(Lcl;ZI)V")
    public static void method1053(class88 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method2258() || arg0.field1127) {
            return;
        }
        arg0.field1113 = false;
        if ((field501 && class103.field1343 > 50 || class103.field1343 > 200) && arg1 && arg0.field1198 == arg0.field1166) {
            arg0.field1113 = true;
        }
        int var2 = arg0.field1204 >> 7;
        int var3 = arg0.field1161 >> 7;
        if (var2 < 0 || var2 >= 104 || var3 < 0 || var3 >= 104) {
            return;
        }
        long var4 = class229.method3883(0, 0, 0, false, arg0.field1129);
        if (arg0.field1120 != null && field511 >= arg0.field1132 && field511 < arg0.field1123) {
            arg0.field1113 = false;
            arg0.field1114 = method6114(arg0.field1204, arg0.field1161, Statics.field1370);
            arg0.field1165 = field511;
            Statics.field3022.method4111(Statics.field1370, arg0.field1204, arg0.field1161, arg0.field1114, 60, arg0, arg0.field1202, var4, arg0.field1121, arg0.field1131, arg0.field1106, arg0.field1116);
            return;
        }
        if ((arg0.field1204 & 0x7F) == 64 && (arg0.field1161 & 0x7F) == 64) {
            if (field665 == field529[var2][var3]) {
                return;
            }
            field529[var2][var3] = field665;
        }
        arg0.field1114 = method6114(arg0.field1204, arg0.field1161, Statics.field1370);
        arg0.field1165 = field511;
        Statics.field3022.method4266(Statics.field1370, arg0.field1204, arg0.field1161, arg0.field1114, 60, arg0, arg0.field1202, var4, arg0.field1163);
    }

    @ObfuscatedName("c.hq(ZI)V")
    public static final void method103(boolean arg0) {
        for (int var1 = 0; var1 < field556; var1++) {
            class96 var2 = field683[field557[var1]];
            if (var2 != null && var2.method2258() && var2.field1295.field2054 == arg0 && var2.field1295.method3428()) {
                int var3 = var2.field1204 >> 7;
                int var4 = var2.field1161 >> 7;
                if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
                    if (var2.field1164 == 1 && (var2.field1204 & 0x7F) == 64 && (var2.field1161 & 0x7F) == 64) {
                        if (field665 == field529[var3][var4]) {
                            continue;
                        }
                        field529[var3][var4] = field665;
                    }
                    long var5 = class229.method3883(0, 0, 1, !var2.field1295.field2064, field557[var1]);
                    var2.field1165 = field511;
                    Statics.field3022.method4266(Statics.field1370, var2.field1204, var2.field1161, method6114(var2.field1204 + (var2.field1164 * 64 - 64), var2.field1161 + (var2.field1164 * 64 - 64), Statics.field1370), var2.field1164 * 64 - 64 + 60, var2, var2.field1202, var5, var2.field1163);
                }
            }
        }
    }

    @ObfuscatedName("fl.hv(I)V")
    public static final void method3140() {
        for (class73 var0 = (class73) field644.method6241(); var0 != null; var0 = (class73) field644.method6248()) {
            if (Statics.field1370 != var0.field953 || field511 > var0.field955) {
                var0.method7431();
            } else if (field511 >= var0.field954) {
                if (var0.field958 > 0) {
                    class96 var1 = field683[var0.field958 - 1];
                    if (var1 != null && var1.field1204 >= 0 && var1.field1204 < 13312 && var1.field1161 >= 0 && var1.field1161 < 13312) {
                        var0.method2078(var1.field1204, var1.field1161, method6114(var1.field1204, var1.field1161, var0.field953) - var0.field950, field511);
                    }
                }
                if (var0.field958 < 0) {
                    int var2 = -var0.field958 - 1;
                    class88 var3;
                    if (field630 == var2) {
                        var3 = Statics.field4508;
                    } else {
                        var3 = field621[var2];
                    }
                    if (var3 != null && var3.field1204 >= 0 && var3.field1204 < 13312 && var3.field1161 >= 0 && var3.field1161 < 13312) {
                        var0.method2078(var3.field1204, var3.field1161, method6114(var3.field1204, var3.field1161, var0.field953) - var0.field950, field511);
                    }
                }
                var0.method2079(field575);
                Statics.field3022.method4266(Statics.field1370, (int) var0.field960, (int) var0.field961, (int) var0.field962, 60, var0, var0.field965, -1L, false);
            }
        }
    }

    @ObfuscatedName("ho.hm(B)V")
    public static final void method4331() {
        for (class68 var0 = (class68) field645.method6241(); var0 != null; var0 = (class68) field645.method6248()) {
            if (Statics.field1370 != var0.field870 || var0.field877) {
                var0.method7431();
            } else if (field511 >= var0.field880) {
                var0.method1976(field575);
                if (var0.field877) {
                    var0.method7431();
                } else {
                    Statics.field3022.method4266(var0.field870, var0.field871, var0.field872, var0.field873, 60, var0, 0, -1L, false);
                }
            }
        }
    }

    @ObfuscatedName("ai.hy(I)I")
    public static final int method426() {
        if (Statics.field1404.method2456()) {
            return Statics.field1370;
        } else {
            int var0 = method6114(Statics.field1743, Statics.field4373, Statics.field1370);
            return var0 - Statics.field1462 >= 800 || (class78.field1009[Statics.field1370][Statics.field1743 >> 7][Statics.field4373 >> 7] & 0x4) == 0 ? 3 : Statics.field1370;
        }
    }

    @ObfuscatedName("b.hr(I)Lmo;")
    public static class356 method164() {
        return field719;
    }

    @ObfuscatedName("kh.hk(B)V")
    public static void method5662() {
        for (class205 var0 = (class205) field722.method6241(); var0 != null; var0 = (class205) field722.method6248()) {
            var0.method7431();
        }
    }

    @ObfuscatedName("lw.ha(I)Z")
    public static boolean method5871() {
        return (field634 & 0x4) != 0;
    }

    @ObfuscatedName("dl.hn(I)Z")
    public static boolean method2818() {
        return (field634 & 0x8) != 0;
    }

    @ObfuscatedName("nq.hl(Lcb;IIIIII)V")
    public static final void method6623(class91 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method2258()) {
            return;
        }
        if (arg0 instanceof class96) {
            class191 var6 = ((class96) arg0).field1295;
            if (var6.field2023 != null) {
                var6 = var6.method3427();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class103.field1343;
        int[] var8 = class103.field1350;
        boolean var9 = arg1 < var7;
        int var10 = -2;
        if (arg0.field1195 != null && (!var9 || !arg0.field1167 && (field737 == 4 || !arg0.field1182 && (field737 == 0 || field737 == 3 || field737 == 1 && ((class88) arg0).method2241())))) {
            method461(arg0, arg0.field1220);
            if (field612 > -1 && field600 < field572) {
                field578[field600] = Statics.field109.method6629(arg0.field1195) / 2;
                field782[field600] = Statics.field109.field4419;
                field602[field600] = field612;
                field603[field600] = field613 - var10;
                field606[field600] = arg0.field1162;
                field618[field600] = arg0.field1186;
                field727[field600] = arg0.field1184;
                field730[field600] = arg0.field1195;
                field600++;
                var10 += 12;
            }
        }
        if (!arg0.field1193.method6335()) {
            method461(arg0, arg0.field1220 + 15);
            for (class95 var11 = (class95) arg0.field1193.method6318(); var11 != null; var11 = (class95) arg0.field1193.method6290()) {
                class92 var12 = var11.method2482(field511);
                if (var12 != null) {
                    class186 var13 = var11.field1283;
                    class488 var14 = var13.method3369();
                    class488 var15 = var13.method3378();
                    int var16 = 0;
                    int var17;
                    if (var14 == null || var15 == null) {
                        var17 = var13.field1992;
                    } else {
                        if (var13.field1993 * 2 < var15.field5034) {
                            var16 = var13.field1993;
                        }
                        var17 = var15.field5034 - var16 * 2;
                    }
                    int var18 = 255;
                    boolean var19 = true;
                    int var20 = field511 - var12.field1237;
                    int var21 = var12.field1239 * var17 / var13.field1992;
                    int var24;
                    if (var12.field1240 > var20) {
                        int var22 = var13.field1985 == 0 ? 0 : var20 / var13.field1985 * var13.field1985;
                        int var23 = var12.field1241 * var17 / var13.field1992;
                        var24 = (var21 - var23) * var22 / var12.field1240 + var23;
                    } else {
                        var24 = var21;
                        int var25 = var12.field1240 + var13.field1989 - var20;
                        if (var13.field1981 >= 0) {
                            var18 = (var25 << 8) / (var13.field1989 - var13.field1981);
                        }
                    }
                    if (var12.field1239 > 0 && var24 < 1) {
                        var24 = 1;
                    }
                    if (var14 == null || var15 == null) {
                        var10 += 5;
                        if (field612 > -1) {
                            int var31 = field612 + arg2 - (var17 >> 1);
                            int var32 = field613 + arg3 - var10;
                            class484.method8296(var31, var32, var24, 5, 65280);
                            class484.method8296(var24 + var31, var32, var17 - var24, 5, 16711680);
                        }
                        var10 += 2;
                    } else {
                        int var26;
                        if (var17 == var24) {
                            var26 = var16 * 2 + var24;
                        } else {
                            var26 = var16 + var24;
                        }
                        int var27 = var14.field5032;
                        var10 += var27;
                        int var28 = field612 + arg2 - (var17 >> 1);
                        int var29 = field613 + arg3 - var10;
                        int var30 = var28 - var16;
                        if (var18 >= 0 && var18 < 255) {
                            var14.method8408(var30, var29, var18);
                            class484.method8289(var30, var29, var26 + var30, var27 + var29);
                            var15.method8408(var30, var29, var18);
                        } else {
                            var14.method8402(var30, var29);
                            class484.method8289(var30, var29, var26 + var30, var27 + var29);
                            var15.method8402(var30, var29);
                        }
                        class484.method8288(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var10 += 2;
                    }
                } else if (var11.method2492()) {
                    var11.method7431();
                }
            }
        }
        if (var10 == -2) {
            var10 += 7;
        }
        if (var9 && field511 == arg0.field1165) {
            class88 var33 = (class88) arg0;
            boolean var34;
            if (field634 == 0) {
                var34 = false;
            } else if (Statics.field4508 == var33) {
                var34 = method2818();
            } else {
                boolean var35 = method5871();
                if (!var35) {
                    boolean var36 = (field634 & 0x1) != 0;
                    var35 = var36 && var33.method2241();
                }
                boolean var37 = var35;
                if (!var35) {
                    boolean var38 = (field634 & 0x2) != 0;
                    var37 = var38 && var33.method2246();
                }
                var34 = var37;
            }
            if (var34) {
                class88 var39 = (class88) arg0;
                if (var9) {
                    method461(arg0, arg0.field1220 + 15);
                    class376 var40 = (class376) field732.get(class447.field4832);
                    var10 += 4;
                    var40.method6658(var39.field1115.method8556(), field612 + arg2, field613 + arg3 - var10, 16777215, 0);
                    var10 += 18;
                }
            }
        }
        if (var9) {
            class88 var41 = (class88) arg0;
            if (var41.field1127) {
                return;
            }
            if (var41.field1108 != -1 || var41.field1109 != -1) {
                method461(arg0, arg0.field1220 + 15);
                if (field612 > -1) {
                    if (var41.field1108 != -1) {
                        var10 += 25;
                        Statics.field1798[var41.field1108].method8402(field612 + arg2 - 12, field613 + arg3 - var10);
                    }
                    if (var41.field1109 != -1) {
                        var10 += 25;
                        Statics.field4375[var41.field1109].method8402(field612 + arg2 - 12, field613 + arg3 - var10);
                    }
                }
            }
            if (arg1 >= 0 && field518 == 10 && field520 == var8[arg1]) {
                method461(arg0, arg0.field1220 + 15);
                if (field612 > -1) {
                    int var42 = Statics.field2942[1].field5032 + var10;
                    Statics.field2942[1].method8402(field612 + arg2 - 12, field613 + arg3 - var42);
                }
            }
        } else {
            class96 var43 = (class96) arg0;
            int[] var44 = var43.method2529();
            short[] var45 = var43.method2517();
            if (var45 != null && var44 != null) {
                for (int var46 = 0; var46 < var45.length; var46++) {
                    if (var45[var46] >= 0 && var44[var46] >= 0) {
                        long var47 = (long) var44[var46] << 8 | (long) var45[var46];
                        class488 var49 = (class488) field793.method6912(var47);
                        if (var49 == null) {
                            class488[] var50 = class489.method4285(Statics.field3034, var44[var46], 0);
                            if (var50 != null && var45[var46] < var50.length) {
                                var49 = var50[var45[var46]];
                                field793.method6913(var47, var49);
                            }
                        }
                        if (var49 != null) {
                            method461(arg0, arg0.field1220 + 15);
                            if (field612 > -1) {
                                var49.method8402(field612 + arg2 - (var49.field5034 >> 1), field613 + (arg3 - var49.field5032) - 4);
                            }
                        }
                    }
                }
            }
            if (field518 == 1 && field519 == field557[arg1 - var7] && field511 % 20 < 10) {
                method461(arg0, arg0.field1220 + 15);
                if (field612 > -1) {
                    Statics.field2942[0].method8402(field612 + arg2 - 12, field613 + arg3 - 28);
                }
            }
        }
        for (int var51 = 0; var51 < 4; var51++) {
            int var52 = arg0.field1178[var51];
            int var53 = arg0.field1185[var51];
            class199 var54 = null;
            int var55 = 0;
            if (var53 >= 0) {
                if (var52 <= field511) {
                    continue;
                }
                var54 = class199.method2122(arg0.field1185[var51]);
                var55 = var54.field2143;
                if (var54 != null && var54.field2148 != null) {
                    var54 = var54.method3585();
                    if (var54 == null) {
                        arg0.field1178[var51] = -1;
                        continue;
                    }
                }
            } else if (var52 < 0) {
                continue;
            }
            int var56 = arg0.field1191[var51];
            class199 var57 = null;
            if (var56 >= 0) {
                var57 = class199.method2122(var56);
                if (var57 != null && var57.field2148 != null) {
                    var57 = var57.method3585();
                }
            }
            if (var52 - var55 <= field511) {
                if (var54 == null) {
                    arg0.field1178[var51] = -1;
                } else {
                    method461(arg0, arg0.field1220 / 2);
                    if (field612 > -1) {
                        boolean var58 = true;
                        if (var51 == 1) {
                            field613 -= 20;
                        }
                        if (var51 == 2) {
                            field612 -= 15;
                            field613 -= 10;
                        }
                        if (var51 == 3) {
                            field612 += 15;
                            field613 -= 10;
                        }
                        Object var59 = null;
                        Object var60 = null;
                        Object var61 = null;
                        Object var62 = null;
                        int var63 = 0;
                        int var64 = 0;
                        int var65 = 0;
                        int var66 = 0;
                        int var67 = 0;
                        int var68 = 0;
                        int var69 = 0;
                        int var70 = 0;
                        class488 var71 = null;
                        class488 var72 = null;
                        class488 var73 = null;
                        class488 var74 = null;
                        int var75 = 0;
                        int var76 = 0;
                        int var77 = 0;
                        int var78 = 0;
                        int var79 = 0;
                        int var80 = 0;
                        int var81 = 0;
                        int var82 = 0;
                        int var83 = 0;
                        class488 var84 = var54.method3576();
                        if (var84 != null) {
                            var63 = var84.field5034;
                            int var85 = var84.field5032;
                            if (var85 > var83) {
                                var83 = var85;
                            }
                            var67 = var84.field5033;
                        }
                        class488 var86 = var54.method3578();
                        if (var86 != null) {
                            var64 = var86.field5034;
                            int var87 = var86.field5032;
                            if (var87 > var83) {
                                var83 = var87;
                            }
                            var68 = var86.field5033;
                        }
                        class488 var88 = var54.method3583();
                        if (var88 != null) {
                            var65 = var88.field5034;
                            int var89 = var88.field5032;
                            if (var89 > var83) {
                                var83 = var89;
                            }
                            var69 = var88.field5033;
                        }
                        class488 var90 = var54.method3574();
                        if (var90 != null) {
                            var66 = var90.field5034;
                            int var91 = var90.field5032;
                            if (var91 > var83) {
                                var83 = var91;
                            }
                            var70 = var90.field5033;
                        }
                        if (var57 != null) {
                            var71 = var57.method3576();
                            if (var71 != null) {
                                var75 = var71.field5034;
                                int var92 = var71.field5032;
                                if (var92 > var83) {
                                    var83 = var92;
                                }
                                var79 = var71.field5033;
                            }
                            var72 = var57.method3578();
                            if (var72 != null) {
                                var76 = var72.field5034;
                                int var93 = var72.field5032;
                                if (var93 > var83) {
                                    var83 = var93;
                                }
                                var80 = var72.field5033;
                            }
                            var73 = var57.method3583();
                            if (var73 != null) {
                                var77 = var73.field5034;
                                int var94 = var73.field5032;
                                if (var94 > var83) {
                                    var83 = var94;
                                }
                                var81 = var73.field5033;
                            }
                            var74 = var57.method3574();
                            if (var74 != null) {
                                var78 = var74.field5034;
                                int var95 = var74.field5032;
                                if (var95 > var83) {
                                    var83 = var95;
                                }
                                var82 = var74.field5033;
                            }
                        }
                        class372 var96 = var54.method3579();
                        if (var96 == null) {
                            var96 = Statics.field3055;
                        }
                        class372 var97;
                        if (var57 == null) {
                            var97 = Statics.field3055;
                        } else {
                            var97 = var57.method3579();
                            if (var97 == null) {
                                var97 = Statics.field3055;
                            }
                        }
                        Object var98 = null;
                        String var99 = null;
                        boolean var100 = false;
                        int var101 = 0;
                        String var102 = var54.method3577(arg0.field1189[var51]);
                        int var103 = var96.method6629(var102);
                        if (var57 != null) {
                            var99 = var57.method3577(arg0.field1160[var51]);
                            var101 = var97.method6629(var99);
                        }
                        int var104 = 0;
                        int var105 = 0;
                        if (var64 > 0) {
                            if (var88 == null && var90 == null) {
                                var104 = 1;
                            } else {
                                var104 = var103 / var64 + 1;
                            }
                        }
                        if (var57 != null && var76 > 0) {
                            if (var73 == null && var74 == null) {
                                var105 = 1;
                            } else {
                                var105 = var101 / var76 + 1;
                            }
                        }
                        int var106 = 0;
                        int var107 = var106;
                        if (var63 > 0) {
                            var106 += var63;
                        }
                        var106 += 2;
                        int var108 = var106;
                        if (var65 > 0) {
                            var106 += var65;
                        }
                        int var109 = var106;
                        int var110 = var106;
                        int var112;
                        if (var64 > 0) {
                            int var111 = var64 * var104;
                            var112 = var106 + var111;
                            var110 = (var111 - var103) / 2 + var106;
                        } else {
                            var112 = var103 + var106;
                        }
                        int var113 = var112;
                        if (var66 > 0) {
                            var112 += var66;
                        }
                        int var114 = 0;
                        int var115 = 0;
                        int var116 = 0;
                        int var117 = 0;
                        int var118 = 0;
                        if (var57 != null) {
                            var112 += 2;
                            var114 = var112;
                            if (var75 > 0) {
                                var112 += var75;
                            }
                            var112 += 2;
                            var115 = var112;
                            if (var77 > 0) {
                                var112 += var77;
                            }
                            var116 = var112;
                            var118 = var112;
                            if (var76 > 0) {
                                int var119 = var76 * var105;
                                var112 += var119;
                                var118 += (var119 - var101) / 2;
                            } else {
                                var112 += var101;
                            }
                            var117 = var112;
                            if (var78 > 0) {
                                var112 += var78;
                            }
                        }
                        int var120 = arg0.field1178[var51] - field511;
                        int var121 = var54.field2142 - var54.field2142 * var120 / var54.field2143;
                        int var122 = var54.field2149 * var120 / var54.field2143 + -var54.field2149;
                        int var123 = field612 + arg2 - (var112 >> 1) + var121;
                        int var124 = field613 + arg3 - 12 + var122;
                        int var125 = var124;
                        int var126 = var83 + var124;
                        int var127 = var54.field2147 + var124 + 15;
                        int var128 = var127 - var96.field4420;
                        int var129 = var96.field4421 + var127;
                        if (var128 < var124) {
                            var125 = var128;
                        }
                        if (var129 > var126) {
                            var126 = var129;
                        }
                        int var130 = 0;
                        if (var57 != null) {
                            var130 = var57.field2147 + var124 + 15;
                            int var131 = var130 - var97.field4420;
                            int var132 = var97.field4421 + var130;
                            if (var131 < var125) {
                                ;
                            }
                            if (var132 > var126) {
                                ;
                            }
                        }
                        int var135 = 255;
                        if (var54.field2144 >= 0) {
                            var135 = (var120 << 8) / (var54.field2143 - var54.field2144);
                        }
                        if (var135 >= 0 && var135 < 255) {
                            if (var84 != null) {
                                var84.method8408(var107 + var123 - var67, var124, var135);
                            }
                            if (var88 != null) {
                                var88.method8408(var108 + var123 - var69, var124, var135);
                            }
                            if (var86 != null) {
                                for (int var136 = 0; var136 < var104; var136++) {
                                    var86.method8408(var64 * var136 + (var109 + var123 - var68), var124, var135);
                                }
                            }
                            if (var90 != null) {
                                var90.method8408(var113 + var123 - var70, var124, var135);
                            }
                            var96.method6635(var102, var110 + var123, var127, var54.field2136, 0, var135);
                            if (var57 != null) {
                                if (var71 != null) {
                                    var71.method8408(var114 + var123 - var79, var124, var135);
                                }
                                if (var73 != null) {
                                    var73.method8408(var115 + var123 - var81, var124, var135);
                                }
                                if (var72 != null) {
                                    for (int var137 = 0; var137 < var105; var137++) {
                                        var72.method8408(var76 * var137 + (var116 + var123 - var80), var124, var135);
                                    }
                                }
                                if (var74 != null) {
                                    var74.method8408(var117 + var123 - var82, var124, var135);
                                }
                                var97.method6635(var99, var118 + var123, var130, var57.field2136, 0, var135);
                            }
                        } else {
                            if (var84 != null) {
                                var84.method8402(var107 + var123 - var67, var124);
                            }
                            if (var88 != null) {
                                var88.method8402(var108 + var123 - var69, var124);
                            }
                            if (var86 != null) {
                                for (int var138 = 0; var138 < var104; var138++) {
                                    var86.method8402(var64 * var138 + (var109 + var123 - var68), var124);
                                }
                            }
                            if (var90 != null) {
                                var90.method8402(var113 + var123 - var70, var124);
                            }
                            var96.method6634(var102, var110 + var123, var127, var54.field2136 | 0xFF000000, 0);
                            if (var57 != null) {
                                if (var71 != null) {
                                    var71.method8402(var114 + var123 - var79, var124);
                                }
                                if (var73 != null) {
                                    var73.method8402(var115 + var123 - var81, var124);
                                }
                                if (var72 != null) {
                                    for (int var139 = 0; var139 < var105; var139++) {
                                        var72.method8402(var76 * var139 + (var116 + var123 - var80), var124);
                                    }
                                }
                                if (var74 != null) {
                                    var74.method8402(var117 + var123 - var82, var124);
                                }
                                var97.method6634(var99, var118 + var123, var130, var57.field2136 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("hq.hd(IIIII)V")
    public static final void method3970(int arg0, int arg1, int arg2, int arg3) {
        field600 = 0;
        boolean var4 = false;
        int var5 = -1;
        int var6 = -1;
        int var7 = class103.field1343;
        int[] var8 = class103.field1350;
        for (int var9 = 0; var9 < field556 + var7; var9++) {
            class91 var10;
            if (var9 < var7) {
                var10 = field621[var8[var9]];
                if (field641 == var8[var9]) {
                    var4 = true;
                    var5 = var9;
                    continue;
                }
                if (Statics.field4508 == var10) {
                    var6 = var9;
                    continue;
                }
            } else {
                var10 = field683[field557[var9 - var7]];
            }
            method6623(var10, var9, arg0, arg1, arg2, arg3);
        }
        if (field522 && var6 != -1) {
            method6623(Statics.field4508, var6, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method6623(field621[field641], var5, arg0, arg1, arg2, arg3);
        }
        for (int var11 = 0; var11 < field600; var11++) {
            int var12 = field602[var11];
            int var13 = field603[var11];
            int var14 = field578[var11];
            int var15 = field782[var11];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var17 = 0; var17 < var11; var17++) {
                    if (var13 + 2 > field603[var17] - field782[var17] && var13 - var15 < field603[var17] + 2 && var12 - var14 < field602[var17] + field578[var17] && var12 + var14 > field602[var17] - field578[var17] && field603[var17] - field782[var17] < var13) {
                        var13 = field603[var17] - field782[var17];
                        var16 = true;
                    }
                }
            }
            field612 = field602[var11];
            field613 = field603[var11] = var13;
            String var18 = field730[var11];
            if (field538 == 0) {
                int var19 = 16776960;
                if (field606[var11] < 6) {
                    var19 = field759[field606[var11]];
                }
                if (field606[var11] == 6) {
                    var19 = field665 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field606[var11] == 7) {
                    var19 = field665 % 20 < 10 ? 255 : 65535;
                }
                if (field606[var11] == 8) {
                    var19 = field665 % 20 < 10 ? 45056 : 8454016;
                }
                if (field606[var11] == 9) {
                    int var20 = 150 - field727[var11];
                    if (var20 < 50) {
                        var19 = var20 * 1280 + 16711680;
                    } else if (var20 < 100) {
                        var19 = 16776960 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var19 = (var20 - 100) * 5 + 65280;
                    }
                }
                if (field606[var11] == 10) {
                    int var21 = 150 - field727[var11];
                    if (var21 < 50) {
                        var19 = var21 * 5 + 16711680;
                    } else if (var21 < 100) {
                        var19 = 16711935 - (var21 - 50) * 327680;
                    } else if (var21 < 150) {
                        var19 = (var21 - 100) * 327680 + 255 - (var21 - 100) * 5;
                    }
                }
                if (field606[var11] == 11) {
                    int var22 = 150 - field727[var11];
                    if (var22 < 50) {
                        var19 = 16777215 - var22 * 327685;
                    } else if (var22 < 100) {
                        var19 = (var22 - 50) * 327685 + 65280;
                    } else if (var22 < 150) {
                        var19 = 16777215 - (var22 - 100) * 327680;
                    }
                }
                if (field618[var11] == 0) {
                    Statics.field109.method6658(var18, field612 + arg0, field613 + arg1, var19, 0);
                }
                if (field618[var11] == 1) {
                    Statics.field109.method6640(var18, field612 + arg0, field613 + arg1, var19, 0, field665);
                }
                if (field618[var11] == 2) {
                    Statics.field109.method6636(var18, field612 + arg0, field613 + arg1, var19, 0, field665);
                }
                if (field618[var11] == 3) {
                    Statics.field109.method6638(var18, field612 + arg0, field613 + arg1, var19, 0, field665, 150 - field727[var11]);
                }
                if (field618[var11] == 4) {
                    int var23 = (150 - field727[var11]) * (Statics.field109.method6629(var18) + 100) / 150;
                    class484.method8289(field612 + arg0 - 50, arg1, field612 + arg0 + 50, arg1 + arg3);
                    Statics.field109.method6634(var18, field612 + arg0 + 50 - var23, field613 + arg1, var19, 0);
                    class484.method8288(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field618[var11] == 5) {
                    int var24 = 150 - field727[var11];
                    int var25 = 0;
                    if (var24 < 25) {
                        var25 = var24 - 25;
                    } else if (var24 > 125) {
                        var25 = var24 - 125;
                    }
                    class484.method8289(arg0, field613 + arg1 - Statics.field109.field4419 - 1, arg0 + arg2, field613 + arg1 + 5);
                    Statics.field109.method6658(var18, field612 + arg0, field613 + arg1 + var25, var19, 0);
                    class484.method8288(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field109.method6658(var18, field612 + arg0, field613 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("hl.hb(IIIII)V")
    public static final void method4284(int arg0, int arg1, int arg2, int arg3) {
        field627 = 0;
        int var4 = (Statics.field4508.field1204 >> 7) + Statics.field2118;
        int var5 = (Statics.field4508.field1161 >> 7) + Statics.field565;
        if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) {
            field627 = 1;
        }
        if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
            field627 = 1;
        }
        if (field627 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) {
            field627 = 0;
        }
    }

    @ObfuscatedName("ar.hw(Lcb;II)V")
    public static final void method461(class91 arg0, int arg1) {
        method7874(arg0.field1204, arg0.field1161, arg1);
    }

    @ObfuscatedName("qc.hx(IIIB)V")
    public static final void method7874(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field612 = -1;
            field613 = -1;
            return;
        }
        int var3 = method6114(arg0, arg1, Statics.field1370) - arg2;
        int var4 = arg0 - Statics.field1743;
        int var5 = var3 - Statics.field1462;
        int var6 = arg1 - Statics.field4373;
        int var7 = class217.field2515[Statics.field1358];
        int var8 = class217.field2516[Statics.field1358];
        int var9 = class217.field2515[Statics.field3332];
        int var10 = class217.field2516[Statics.field3332];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field612 = field512 * var11 / var15 + field784 / 2;
            field613 = field512 * var14 / var15 + field702 / 2;
        } else {
            field612 = -1;
            field613 = -1;
        }
    }

    @ObfuscatedName("mp.ho(IIII)I")
    public static final int method6114(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class78.field1009[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class78.field1015[var5][var3][var4] + class78.field1015[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class78.field1015[var5][var3][var4 + 1] + class78.field1015[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("jq.hj(ZLru;I)V")
    public static final void method5040(boolean arg0, class473 arg1) {
        field692 = arg0;
        if (!field692) {
            int var2 = arg1.method8034();
            int var3 = arg1.method8039();
            int var4 = arg1.method8032();
            Statics.field4298 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field4298[var5][var6] = arg1.method7979();
                }
            }
            Statics.field3417 = new int[var4];
            Statics.field2610 = new int[var4];
            Statics.field2520 = new int[var4];
            Statics.field14 = new byte[var4][];
            Statics.field3799 = new byte[var4][];
            int var7 = 0;
            for (int var8 = (var3 - 6) / 8; var8 <= (var3 + 6) / 8; var8++) {
                for (int var9 = (var2 - 6) / 8; var9 <= (var2 + 6) / 8; var9++) {
                    int var10 = (var8 << 8) + var9;
                    Statics.field3417[var7] = var10;
                    Statics.field2610[var7] = Statics.field4261.method5988("m" + var8 + "_" + var9);
                    Statics.field2520[var7] = Statics.field4261.method5988("l" + var8 + "_" + var9);
                    var7++;
                }
            }
            method425(var3, var2, true);
            return;
        }
        int var11 = arg1.method8034();
        boolean var12 = arg1.method7964() == 1;
        int var13 = arg1.method8032();
        int var14 = arg1.method8032();
        arg1.method7935();
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 13; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    int var18 = arg1.method7923(1);
                    if (var18 == 1) {
                        field771[var15][var16][var17] = arg1.method7923(26);
                    } else {
                        field771[var15][var16][var17] = -1;
                    }
                }
            }
        }
        arg1.method7910();
        Statics.field4298 = new int[var14][4];
        for (int var19 = 0; var19 < var14; var19++) {
            for (int var20 = 0; var20 < 4; var20++) {
                Statics.field4298[var19][var20] = arg1.method7979();
            }
        }
        Statics.field3417 = new int[var14];
        Statics.field2610 = new int[var14];
        Statics.field2520 = new int[var14];
        Statics.field14 = new byte[var14][];
        Statics.field3799 = new byte[var14][];
        int var21 = 0;
        for (int var22 = 0; var22 < 4; var22++) {
            for (int var23 = 0; var23 < 13; var23++) {
                for (int var24 = 0; var24 < 13; var24++) {
                    int var25 = field771[var22][var23][var24];
                    if (var25 != -1) {
                        int var26 = var25 >> 14 & 0x3FF;
                        int var27 = var25 >> 3 & 0x7FF;
                        int var28 = (var26 / 8 << 8) + var27 / 8;
                        for (int var29 = 0; var29 < var21; var29++) {
                            if (Statics.field3417[var29] == var28) {
                                var28 = -1;
                                break;
                            }
                        }
                        if (var28 != -1) {
                            Statics.field3417[var21] = var28;
                            int var30 = var28 >> 8 & 0xFF;
                            int var31 = var28 & 0xFF;
                            Statics.field2610[var21] = Statics.field4261.method5988("m" + var30 + "_" + var31);
                            Statics.field2520[var21] = Statics.field4261.method5988("l" + var30 + "_" + var31);
                            var21++;
                        }
                    }
                }
            }
        }
        method425(var13, var11, !var12);
    }

    @ObfuscatedName("ai.hs(IIZI)V")
    public static final void method425(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field3473 == arg0 && Statics.field468 == arg1) {
            return;
        }
        Statics.field3473 = arg0;
        Statics.field468 = arg1;
        method4858(25);
        method3161(class330.field3996, true);
        int var3 = Statics.field2118;
        int var4 = Statics.field565;
        Statics.field2118 = (arg0 - 6) * 8;
        Statics.field565 = (arg1 - 6) * 8;
        int var5 = Statics.field2118 - var3;
        int var6 = Statics.field565 - var4;
        int var7 = Statics.field2118;
        int var8 = Statics.field565;
        for (int var9 = 0; var9 < 65536; var9++) {
            class96 var10 = field683[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1210[var11] -= var5;
                    var10.field1232[var11] -= var6;
                }
                var10.field1204 -= var5 * 128;
                var10.field1161 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class88 var13 = field621[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1210[var14] -= var5;
                    var13.field1232[var14] -= var6;
                }
                var13.field1204 -= var5 * 128;
                var13.field1161 -= var6 * 128;
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
                        field642[var25][var21][var22] = field642[var25][var23][var24];
                    } else {
                        field642[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class90 var26 = (class90) field643.method6241(); var26 != null; var26 = (class90) field643.method6248()) {
            var26.field1146 -= var5;
            var26.field1147 -= var6;
            if (var26.field1146 < 0 || var26.field1147 < 0 || var26.field1146 >= 104 || var26.field1147 >= 104) {
                var26.method7431();
            }
        }
        if (field755 != 0) {
            field755 -= var5;
            field756 -= var6;
        }
        field761 = 0;
        field767 = false;
        Statics.field1743 -= var5 << 7;
        Statics.field4373 -= var6 << 7;
        Statics.field2908 -= var5 << 7;
        Statics.field1461 -= var6 << 7;
        field750 = -1;
        field645.method6235();
        field644.method6235();
        for (int var27 = 0; var27 < 4; var27++) {
            field685[var27].method3844();
        }
    }

    @ObfuscatedName("bp.hu(ZI)V")
    public static final void method2080(boolean arg0) {
        method3415();
        field689.field1401++;
        if (field689.field1401 < 50 && !arg0) {
            return;
        }
        field689.field1401 = 0;
        if (field562 || field689.method2699() == null) {
            return;
        }
        class282 var1 = class282.method4287(class280.field3099, field689.field1390);
        field689.method2694(var1);
        try {
            field689.method2687();
        } catch (IOException var3) {
            field562 = true;
        }
    }

    @ObfuscatedName("mz.ht(B)V")
    public static final void method6400() {
        method2080(false);
        field566 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field14.length; var1++) {
            if (Statics.field2610[var1] != -1 && Statics.field14[var1] == null) {
                Statics.field14[var1] = Statics.field4261.method5990(Statics.field2610[var1], 0);
                if (Statics.field14[var1] == null) {
                    var0 = false;
                    field566++;
                }
            }
            if (Statics.field2520[var1] != -1 && Statics.field3799[var1] == null) {
                Statics.field3799[var1] = Statics.field4261.method5974(Statics.field2520[var1], 0, Statics.field4298[var1]);
                if (Statics.field3799[var1] == null) {
                    var0 = false;
                    field566++;
                }
            }
        }
        if (!var0) {
            field745 = 1;
            return;
        }
        field568 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field14.length; var3++) {
            byte[] var4 = Statics.field3799[var3];
            if (var4 != null) {
                int var5 = (Statics.field3417[var3] >> 8) * 64 - Statics.field2118;
                int var6 = (Statics.field3417[var3] & 0xFF) * 64 - Statics.field565;
                if (field692) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class78.method5969(var4, var5, var6);
            }
        }
        if (!var2) {
            field745 = 2;
            return;
        }
        if (field745 != 0) {
            method3161(class330.field3996 + class97.field1303 + class97.field1301 + 100 + "%" + class97.field1302, true);
        }
        method3415();
        Statics.field3022.method4145();
        for (int var7 = 0; var7 < 4; var7++) {
            field685[var7].method3844();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class78.field1009[var8][var9][var10] = 0;
                }
            }
        }
        method3415();
        class78.method3416();
        int var11 = Statics.field14.length;
        class66.method2762();
        method2080(true);
        if (!field692) {
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = (Statics.field3417[var12] >> 8) * 64 - Statics.field2118;
                int var14 = (Statics.field3417[var12] & 0xFF) * 64 - Statics.field565;
                byte[] var15 = Statics.field14[var12];
                if (var15 != null) {
                    method3415();
                    class78.method2852(var15, var13, var14, Statics.field3473 * 8 - 48, Statics.field468 * 8 - 48, field685);
                }
            }
            for (int var16 = 0; var16 < var11; var16++) {
                int var17 = (Statics.field3417[var16] >> 8) * 64 - Statics.field2118;
                int var18 = (Statics.field3417[var16] & 0xFF) * 64 - Statics.field565;
                byte[] var19 = Statics.field14[var16];
                if (var19 == null && Statics.field468 < 800) {
                    method3415();
                    class78.method175(var17, var18, 64, 64);
                }
            }
            method2080(true);
            for (int var20 = 0; var20 < var11; var20++) {
                byte[] var21 = Statics.field3799[var20];
                if (var21 != null) {
                    int var22 = (Statics.field3417[var20] >> 8) * 64 - Statics.field2118;
                    int var23 = (Statics.field3417[var20] & 0xFF) * 64 - Statics.field565;
                    method3415();
                    class78.method5970(var21, var22, var23, Statics.field3022, field685);
                }
            }
        }
        if (field692) {
            for (int var24 = 0; var24 < 4; var24++) {
                method3415();
                for (int var25 = 0; var25 < 13; var25++) {
                    for (int var26 = 0; var26 < 13; var26++) {
                        boolean var27 = false;
                        int var28 = field771[var24][var25][var26];
                        if (var28 != -1) {
                            int var29 = var28 >> 24 & 0x3;
                            int var30 = var28 >> 1 & 0x3;
                            int var31 = var28 >> 14 & 0x3FF;
                            int var32 = var28 >> 3 & 0x7FF;
                            int var33 = (var31 / 8 << 8) + var32 / 8;
                            for (int var34 = 0; var34 < Statics.field3417.length; var34++) {
                                if (Statics.field3417[var34] == var33 && Statics.field14[var34] != null) {
                                    int var35 = (var31 - var25) * 8;
                                    int var36 = (var32 - var26) * 8;
                                    class78.method3002(Statics.field14[var34], var24, var25 * 8, var26 * 8, var29, (var31 & 0x7) * 8, (var32 & 0x7) * 8, var30, var35, var36, field685);
                                    var27 = true;
                                    break;
                                }
                            }
                        }
                        if (!var27) {
                            class78.method4516(var24, var25 * 8, var26 * 8);
                        }
                    }
                }
            }
            for (int var37 = 0; var37 < 13; var37++) {
                for (int var38 = 0; var38 < 13; var38++) {
                    int var39 = field771[0][var37][var38];
                    if (var39 == -1) {
                        class78.method175(var37 * 8, var38 * 8, 8, 8);
                    }
                }
            }
            method2080(true);
            for (int var40 = 0; var40 < 4; var40++) {
                method3415();
                for (int var41 = 0; var41 < 13; var41++) {
                    for (int var42 = 0; var42 < 13; var42++) {
                        int var43 = field771[var40][var41][var42];
                        if (var43 != -1) {
                            int var44 = var43 >> 24 & 0x3;
                            int var45 = var43 >> 1 & 0x3;
                            int var46 = var43 >> 14 & 0x3FF;
                            int var47 = var43 >> 3 & 0x7FF;
                            int var48 = (var46 / 8 << 8) + var47 / 8;
                            for (int var49 = 0; var49 < Statics.field3417.length; var49++) {
                                if (Statics.field3417[var49] == var48 && Statics.field3799[var49] != null) {
                                    class78.method2172(Statics.field3799[var49], var40, var41 * 8, var42 * 8, var44, (var46 & 0x7) * 8, (var47 & 0x7) * 8, var45, Statics.field3022, field685);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method2080(true);
        method3415();
        class78.method7665(Statics.field3022, field685);
        method2080(true);
        int var50 = class78.field1010;
        if (var50 > Statics.field1370) {
            var50 = Statics.field1370;
        }
        if (var50 < Statics.field1370 - 1) {
            int var51 = Statics.field1370 - 1;
        }
        if (field501) {
            Statics.field3022.method4113(class78.field1010);
        } else {
            Statics.field3022.method4113(0);
        }
        for (int var52 = 0; var52 < 104; var52++) {
            for (int var53 = 0; var53 < 104; var53++) {
                method5043(var52, var53);
            }
        }
        method3415();
        method6219();
        class200.field2157.method5033();
        if (Statics.field427.method525()) {
            class282 var54 = class282.method4287(class280.field3097, field689.field1390);
            var54.field3187.method8048(1057001181);
            field689.method2694(var54);
        }
        if (!field692) {
            int var55 = (Statics.field3473 - 6) / 8;
            int var56 = (Statics.field3473 + 6) / 8;
            int var57 = (Statics.field468 - 6) / 8;
            int var58 = (Statics.field468 + 6) / 8;
            for (int var59 = var55 - 1; var59 <= var56 + 1; var59++) {
                for (int var60 = var57 - 1; var60 <= var58 + 1; var60++) {
                    if (var59 < var55 || var59 > var56 || var60 < var57 || var60 > var58) {
                        Statics.field4261.method5993("m" + var59 + "_" + var60);
                        Statics.field4261.method5993("l" + var59 + "_" + var60);
                    }
                }
            }
        }
        method4858(30);
        method3415();
        class78.method6833();
        class282 var61 = class282.method4287(class280.field3136, field689.field1390);
        field689.method2694(var61);
        class35.method3810();
    }

    @ObfuscatedName("co.hc(II)V")
    public static final void method2582(int arg0) {
        int[] var1 = Statics.field186.field5041;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class78.field1009[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field3022.method4146(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class78.field1009[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field3022.method4146(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field186.method8394();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class78.field1009[arg0][var10][var9] & 0x18) == 0) {
                    method4929(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class78.field1009[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method4929(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field751 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                long var13 = Statics.field3022.method4185(Statics.field1370, var11, var12);
                if (var13 != 0L) {
                    int var15 = class229.method2897(var13);
                    int var16 = class200.method7839(var15).field2170;
                    if (var16 >= 0 && class183.method18(var16).field1954) {
                        field580[field751] = class183.method18(var16).method3318(false);
                        field608[field751] = var11;
                        field592[field751] = var12;
                        field751++;
                    }
                }
            }
        }
        Statics.field153.method8368();
    }

    @ObfuscatedName("io.hp(IIIIII)V")
    public static final void method4929(int arg0, int arg1, int arg2, int arg3, int arg4) {
        long var5 = Statics.field3022.method4138(arg0, arg1, arg2);
        if (var5 != 0L) {
            int var7 = Statics.field3022.method4142(arg0, arg1, arg2, var5);
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
            int[] var14 = Statics.field186.field5041;
            int var15 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var16 = class229.method2897(var5);
            class200 var17 = class200.method7839(var16);
            if (var17.field2184 == -1) {
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
                class487 var18 = Statics.field1934[var17.field2184];
                if (var18 != null) {
                    int var19 = (var17.field2181 * 4 - var18.field5024) / 2;
                    int var20 = (var17.field2182 * 4 - var18.field5026) / 2;
                    var18.method8374(arg1 * 4 + 48 + var19, (104 - arg2 - var17.field2182) * 4 + 48 + var20);
                }
            }
        }
        long var21 = Statics.field3022.method4140(arg0, arg1, arg2);
        if (var21 != 0L) {
            int var23 = Statics.field3022.method4142(arg0, arg1, arg2, var21);
            int var24 = var23 >> 6 & 0x3;
            int var25 = var23 & 0x1F;
            int var26 = class229.method2897(var21);
            class200 var27 = class200.method7839(var26);
            if (var27.field2184 != -1) {
                class487 var28 = Statics.field1934[var27.field2184];
                if (var28 != null) {
                    int var29 = (var27.field2181 * 4 - var28.field5024) / 2;
                    int var30 = (var27.field2182 * 4 - var28.field5026) / 2;
                    var28.method8374(arg1 * 4 + 48 + var29, (104 - arg2 - var27.field2182) * 4 + 48 + var30);
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
                int[] var35 = Statics.field186.field5041;
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
        long var37 = Statics.field3022.method4185(arg0, arg1, arg2);
        if (var37 == 0L) {
            return;
        }
        int var39 = class229.method2897(var37);
        class200 var40 = class200.method7839(var39);
        if (var40.field2184 == -1) {
            return;
        }
        class487 var41 = Statics.field1934[var40.field2184];
        if (var41 != null) {
            int var42 = (var40.field2181 * 4 - var41.field5024) / 2;
            int var43 = (var40.field2182 * 4 - var41.field5026) / 2;
            var41.method8374(arg1 * 4 + 48 + var42, (104 - arg2 - var40.field2182) * 4 + 48 + var43);
        }
    }

    @ObfuscatedName("client.hg(Ldb;IB)Z")
    public boolean method1680(class107 arg0, int arg1) {
        if (arg0.field1394 == 0) {
            Statics.field4903 = null;
        } else {
            if (Statics.field4903 == null) {
                Statics.field4903 = new class397(Statics.field3020, Statics.field427);
            }
            Statics.field4903.method6970(arg0.field1397, arg1);
        }
        method2989();
        arg0.field1396 = null;
        return true;
    }

    @ObfuscatedName("client.hh(Ldb;I)Z")
    public boolean method1165(class107 arg0) {
        if (Statics.field4903 != null) {
            Statics.field4903.method6967(arg0.field1397);
        }
        method2989();
        arg0.field1396 = null;
        return true;
    }

    @ObfuscatedName("client.ij(Ldb;I)Z")
    public final boolean method1534(class107 arg0) {
        class407 var2 = arg0.method2699();
        class473 var3 = arg0.field1397;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1396 == null) {
                if (arg0.field1398) {
                    if (!var2.method7161(1)) {
                        return false;
                    }
                    var2.method7149(arg0.field1397.field4936, 0, 1);
                    arg0.field1399 = 0;
                    arg0.field1398 = false;
                }
                var3.field4939 = 0;
                if (var3.method7944()) {
                    if (!var2.method7161(1)) {
                        return false;
                    }
                    var2.method7149(arg0.field1397.field4936, 1, 1);
                    arg0.field1399 = 0;
                }
                arg0.field1398 = true;
                class283[] var4 = class283.method3273();
                int var5 = var3.method7911();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field4939);
                }
                arg0.field1396 = var4[var5];
                arg0.field1394 = arg0.field1396.field3204;
            }
            if (arg0.field1394 == -1) {
                if (!var2.method7161(1)) {
                    return false;
                }
                arg0.method2699().method7149(var3.field4936, 0, 1);
                arg0.field1394 = var3.field4936[0] & 0xFF;
            }
            if (arg0.field1394 == -2) {
                if (!var2.method7161(2)) {
                    return false;
                }
                arg0.method2699().method7149(var3.field4936, 0, 2);
                var3.field4939 = 0;
                arg0.field1394 = var3.method8032();
            }
            if (!var2.method7161(arg0.field1394)) {
                return false;
            }
            var3.field4939 = 0;
            var2.method7149(var3.field4936, 0, arg0.field1394);
            arg0.field1399 = 0;
            field563.method6810();
            arg0.field1403 = arg0.field1402;
            arg0.field1402 = arg0.field1406;
            arg0.field1406 = arg0.field1396;
            if (class283.field3206 == arg0.field1396) {
                Statics.field148 = var3.method7997();
                Statics.field4407 = var3.method7964();
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3225 == arg0.field1396) {
                int var6 = var3.method8059();
                boolean var7 = var3.method7964() == 1;
                String var8 = "";
                boolean var9 = false;
                if (var7) {
                    var8 = var3.method7983();
                    if (Statics.field1944.method1750(new class497(var8, Statics.field3020))) {
                        var9 = true;
                    }
                }
                String var10 = var3.method7983();
                if (!var9) {
                    class106.method5047(var6, var8, var10);
                }
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3289 == arg0.field1396) {
                int var11 = var3.method7979();
                boolean var12 = var3.method7996() == 1;
                class310 var13 = class310.method2952(var11);
                if (var13.field3708 != var12) {
                    var13.field3708 = var12;
                    method2361(var13);
                }
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3307 == arg0.field1396) {
                int var14 = var3.method8032();
                int var15 = var3.method7964();
                int var16 = var3.method8032();
                method5038(var14, var15, var16);
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3250 == arg0.field1396) {
                field755 = var3.method7964();
                if (field755 == 255) {
                    field755 = 0;
                }
                field756 = var3.method7964();
                if (field756 == 255) {
                    field756 = 0;
                }
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3273 == arg0.field1396) {
                int var17 = var3.method8034();
                int var18 = var3.method8032();
                int var19 = var3.method8018();
                class310 var20 = class310.method2952(var19);
                var20.field3586 = (var17 << 16) + var18;
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3295 == arg0.field1396) {
                method5040(false, arg0.field1397);
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3260 == arg0.field1396) {
                boolean var21 = var3.method7964() == 1;
                if (var21) {
                    Statics.field4360 = class287.method3099() - var3.method8151();
                    Statics.field1998 = new class339(var3, true);
                } else {
                    Statics.field1998 = null;
                }
                field805 = field700;
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3299 == arg0.field1396) {
                byte var22 = var3.method8106();
                int var23 = var3.method7996() * 4;
                byte var24 = var3.method8195();
                int var25 = var3.method7996();
                int var26 = var3.method7996() * 4;
                int var27 = var3.method8032();
                int var28 = var3.method7964();
                int var29 = var3.method8039();
                int var30 = var3.method8039();
                int var31 = var3.method8012();
                int var32 = var31 >> 16;
                int var33 = var31 >> 8 & 0xFF;
                int var34 = (var31 >> 4 & 0x7) + var32;
                int var35 = (var31 & 0x7) + var33;
                int var36 = var3.method8009();
                int var37 = var24 + var34;
                int var38 = var22 + var35;
                if (var34 >= 0 && var35 >= 0 && var34 < 104 && var35 < 104 && var37 >= 0 && var38 >= 0 && var37 < 104 && var38 < 104 && var29 != 65535) {
                    int var39 = var34 * 128 + 64;
                    int var40 = var35 * 128 + 64;
                    int var41 = var37 * 128 + 64;
                    int var42 = var38 * 128 + 64;
                    class73 var43 = new class73(var29, Statics.field1370, var39, var40, method6114(var39, var40, Statics.field1370) - var26, field511 + var27, field511 + var30, var28, var25, var36, var23);
                    var43.method2078(var41, var42, method6114(var41, var42, Statics.field1370) - var23, field511 + var27);
                    field644.method6236(var43);
                }
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3228 == arg0.field1396) {
                byte var44 = var3.method8195();
                int var45 = var3.method7997();
                int var46 = var3.method8034();
                int var47 = var3.method8032();
                int var48 = var3.method7996();
                int var49 = var3.method8012();
                int var50 = var49 >> 16;
                int var51 = var49 >> 8 & 0xFF;
                int var52 = (var49 >> 4 & 0x7) + var50;
                int var53 = (var49 & 0x7) + var51;
                int var54 = var3.method8030();
                int var55 = var3.method7997() * 4;
                byte var56 = var3.method7965();
                int var57 = var3.method8034();
                int var58 = var3.method7997() * 4;
                int var59 = var44 + var52;
                int var60 = var53 + var56;
                if (var52 >= 0 && var53 >= 0 && var52 < 104 && var53 < 104 && var59 >= 0 && var60 >= 0 && var59 < 104 && var60 < 104 && var47 != 65535) {
                    int var61 = var52 * 128 + 64;
                    int var62 = var53 * 128 + 64;
                    int var63 = var59 * 128 + 64;
                    int var64 = var60 * 128 + 64;
                    class73 var65 = new class73(var47, Statics.field1370, var61, var62, method6114(var61, var62, Statics.field1370) - var55, field511 + var46, field511 + var57, var48, var45, var54, var58);
                    var65.method2078(var63, var64, method6114(var63, var64, Statics.field1370) - var58, field511 + var46);
                    field644.method6236(var65);
                }
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3226 == arg0.field1396) {
                if (Statics.field4513 == null) {
                    Statics.field4513 = new class422(Statics.field2362);
                }
                class483 var66 = Statics.field2362.method7373(var3);
                Statics.field4513.field4672.method7718(var66.field5004, var66.field5005);
                field707[++field699 - 1 & 0x1F] = var66.field5004;
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3197 == arg0.field1396) {
                field767 = true;
                field768 = false;
                Statics.field2637 = var3.method7964();
                Statics.field1417 = var3.method7964();
                Statics.field56 = var3.method8032();
                Statics.field4341 = var3.method7964();
                Statics.field1445 = var3.method7964();
                if (Statics.field1445 >= 100) {
                    Statics.field1743 = Statics.field2637 * 128 + 64;
                    Statics.field4373 = Statics.field1417 * 128 + 64;
                    Statics.field1462 = method6114(Statics.field1743, Statics.field4373, Statics.field1370) - Statics.field56;
                }
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3201 == arg0.field1396) {
                Statics.field4513 = null;
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3212 == arg0.field1396) {
                int var67 = var3.method8039();
                class81.method3299(var67);
                field662[++field525 - 1 & 0x1F] = var67 & 0x7FFF;
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3257 == arg0.field1396) {
                int var68 = var3.method7979();
                class83 var69 = (class83) field676.method7706((long) var68);
                if (var69 != null) {
                    method107(var69, true);
                }
                if (field697 != null) {
                    method2361(field697);
                    field697 = null;
                }
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3236 == arg0.field1396) {
                int var70 = var3.method7979();
                if (field595 != var70) {
                    field595 = var70;
                    method823();
                }
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3268 == arg0.field1396) {
                field767 = false;
                for (int var71 = 0; var71 < 5; var71++) {
                    field570[var71] = false;
                }
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3211 == arg0.field1396) {
                String var72 = var3.method7983();
                Object[] var73 = new Object[var72.length() + 1];
                for (int var74 = var72.length() - 1; var74 >= 0; var74--) {
                    if (var72.charAt(var74) == 's') {
                        var73[var74 + 1] = var3.method7983();
                    } else {
                        var73[var74 + 1] = Integer.valueOf(var3.method7979());
                    }
                }
                var73[0] = Integer.valueOf(var3.method7979());
                class84 var75 = new class84();
                var75.field1062 = var73;
                class67.method4946(var75);
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3240 == arg0.field1396) {
                int var76 = var3.method8039();
                if (var76 == 65535) {
                    var76 = -1;
                }
                int var77 = var3.method8020();
                int var78 = var3.method8020();
                class310 var79 = class310.method2952(var78);
                if (var79.field3551) {
                    var79.field3690 = var76;
                    var79.field3569 = var77;
                    class201 var81 = class201.method2583(var76);
                    var79.field3604 = var81.field2223;
                    var79.field3677 = var81.field2224;
                    var79.field3667 = var81.field2252;
                    var79.field3602 = var81.field2226;
                    var79.field3603 = var81.field2227;
                    var79.field3592 = var81.field2254;
                    if (var81.field2228 == 1) {
                        var79.field3669 = 1;
                    } else {
                        var79.field3669 = 2;
                    }
                    if (var79.field3617 > 0) {
                        var79.field3592 = var79.field3592 * 32 / var79.field3617;
                    } else if (var79.field3563 > 0) {
                        var79.field3592 = var79.field3592 * 32 / var79.field3563;
                    }
                    method2361(var79);
                } else if (var76 == -1) {
                    var79.field3596 = 0;
                    arg0.field1396 = null;
                    return true;
                } else {
                    class201 var80 = class201.method2583(var76);
                    var79.field3596 = 4;
                    var79.field3597 = var76;
                    var79.field3604 = var80.field2223;
                    var79.field3677 = var80.field2224;
                    var79.field3592 = var80.field2254 * 100 / var77;
                    method2361(var79);
                }
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3233 == arg0.field1396) {
                byte var82 = var3.method7965();
                String var83 = var3.method7983();
                long var84 = (long) var3.method8032();
                long var86 = (long) var3.method8132();
                class332 var88 = (class332) class351.method19(class332.method2185(), var3.method7964());
                long var89 = (var84 << 32) + var86;
                boolean var91 = false;
                Object var92 = null;
                class160 var93 = var82 >= 0 ? field749[var82] : Statics.field5003;
                if (var93 == null) {
                    var91 = true;
                } else {
                    int var94 = 0;
                    while (true) {
                        if (var94 >= 100) {
                            if (var88.field4189 && Statics.field1944.method1750(new class497(var83, Statics.field3020))) {
                                var91 = true;
                            }
                            break;
                        }
                        if (field740[var94] == var89) {
                            var91 = true;
                            break;
                        }
                        var94++;
                    }
                }
                if (!var91) {
                    field740[field741] = var89;
                    field741 = (field741 + 1) % 100;
                    String var95 = class376.method6713(class313.method3143(var3));
                    int var96 = var82 >= 0 ? 41 : 44;
                    if (var88.field4187 == -1) {
                        class106.method2977(var96, var83, var95, var93.field1799);
                    } else {
                        class106.method2977(var96, class97.method1829(var88.field4187) + var83, var95, var93.field1799);
                    }
                }
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3292 == arg0.field1396) {
                return this.method1680(arg0, 1);
            }
            if (class283.field3302 == arg0.field1396) {
                method1056(class281.field3179);
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3210 == arg0.field1396) {
                int var97 = var3.method7964();
                if (var3.method7964() == 0) {
                    field560[var97] = new class346();
                    var3.field4939 += 18;
                } else {
                    var3.field4939--;
                    field560[var97] = new class346(var3, false);
                }
                field714 = field700;
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3287 == arg0.field1396) {
                int var98 = var3.method8034();
                int var99 = var3.method8050();
                class88 var100;
                if (field630 == var99) {
                    var100 = Statics.field4508;
                } else {
                    var100 = field621[var99];
                }
                int var101 = var3.method8020();
                if (var100 != null) {
                    var100.field1207 = var98;
                    var100.field1211 = var101 >> 16;
                    var100.field1208 = (var101 & 0xFFFF) + field511;
                    var100.field1199 = 0;
                    var100.field1209 = 0;
                    if (var100.field1208 > field511) {
                        var100.field1199 = -1;
                    }
                    if (var100.field1207 == 65535) {
                        var100.field1207 = -1;
                    }
                }
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3231 == arg0.field1396) {
                method1056(class281.field3176);
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3258 == arg0.field1396) {
                int var102 = var3.method7979();
                int var103 = var3.method8039();
                class310 var104 = class310.method2952(var102);
                if (var104.field3596 != 2 || var104.field3597 != var103) {
                    var104.field3596 = 2;
                    var104.field3597 = var103;
                    method2361(var104);
                }
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3248 == arg0.field1396) {
                method1056(class281.field3183);
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3229 == arg0.field1396) {
                method1056(class281.field3173);
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3286 == arg0.field1396) {
                int var105 = arg0.field1394 + var3.field4939;
                int var106 = var3.method8032();
                int var107 = var3.method8032();
                if (field675 != var106) {
                    field675 = var106;
                    this.method1210(false);
                    method3104(field675);
                    class67.method843(field675);
                    for (int var108 = 0; var108 < 100; var108++) {
                        field726[var108] = true;
                    }
                }
                while (var107-- > 0) {
                    int var109 = var3.method7979();
                    int var110 = var3.method8032();
                    int var111 = var3.method7964();
                    class83 var112 = (class83) field676.method7706((long) var109);
                    if (var112 != null && var112.field1055 != var110) {
                        method107(var112, true);
                        var112 = null;
                    }
                    if (var112 == null) {
                        var112 = method6223(var109, var110, var111);
                    }
                    var112.field1056 = true;
                }
                for (class83 var113 = (class83) field676.method7708(); var113 != null; var113 = (class83) field676.method7709()) {
                    if (var113.field1056) {
                        var113.field1056 = false;
                    } else {
                        method107(var113, true);
                    }
                }
                field690 = new class451(512);
                while (var3.field4939 < var105) {
                    int var114 = var3.method7979();
                    int var115 = var3.method8032();
                    int var116 = var3.method8032();
                    int var117 = var3.method7979();
                    for (int var118 = var115; var118 <= var116; var118++) {
                        long var119 = ((long) var114 << 32) + (long) var118;
                        field690.method7716(new class439(var117), var119);
                    }
                }
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3284 == arg0.field1396) {
                int var121 = var3.method8032();
                int var122 = var3.method8050();
                int var123 = var3.method7964();
                if (var122 == 65535) {
                    var122 = -1;
                }
                class96 var124 = field683[var121];
                if (var124 != null) {
                    if (var124.field1224 == var122 && var122 != -1) {
                        int var125 = class203.method2227(var122).field2309;
                        if (var125 == 1) {
                            var124.field1170 = 0;
                            var124.field1171 = 0;
                            var124.field1205 = var123;
                            var124.field1206 = 0;
                        } else if (var125 == 2) {
                            var124.field1206 = 0;
                        }
                    } else if (var122 == -1 || var124.field1224 == -1 || class203.method2227(var122).field2293 >= class203.method2227(var124.field1224).field2293) {
                        var124.field1224 = var122;
                        var124.field1170 = 0;
                        var124.field1171 = 0;
                        var124.field1205 = var123;
                        var124.field1206 = 0;
                        var124.field1231 = var124.field1230;
                    }
                }
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3252 == arg0.field1396) {
                field694 = field700;
                byte var126 = var3.method7965();
                class157 var127 = new class157(var3);
                class160 var128;
                if (var126 >= 0) {
                    var128 = field749[var126];
                } else {
                    var128 = Statics.field5003;
                }
                var127.method3106(var128);
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3288 == arg0.field1396) {
                method5042(false, var3);
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3265 == arg0.field1396) {
                field694 = field700;
                byte var129 = var3.method7965();
                if (arg0.field1394 == 1) {
                    if (var129 >= 0) {
                        field749[var129] = null;
                    } else {
                        Statics.field5003 = null;
                    }
                    arg0.field1396 = null;
                    return true;
                }
                if (var129 >= 0) {
                    field749[var129] = new class160(var3);
                } else {
                    Statics.field5003 = new class160(var3);
                }
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3304 == arg0.field1396) {
                int var130 = var3.method8032();
                int var131 = var3.method7997();
                int var132 = var3.method8050();
                int var133 = var3.method8163();
                int var134 = var133 >> 16;
                int var135 = var133 >> 8 & 0xFF;
                int var136 = (var133 >> 4 & 0x7) + var134;
                int var137 = (var133 & 0x7) + var135;
                if (var136 >= 0 && var137 >= 0 && var136 < 104 && var137 < 104) {
                    int var138 = var136 * 128 + 64;
                    int var139 = var137 * 128 + 64;
                    class68 var140 = new class68(var132, Statics.field1370, var138, var139, method6114(var138, var139, Statics.field1370) - var131, var130, field511);
                    field645.method6236(var140);
                }
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3220 == arg0.field1396) {
                return this.method1165(arg0);
            }
            if (class283.field3285 == arg0.field1396) {
                class103.method5839(var3, arg0.field1394);
                method4497();
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3196 == arg0.field1396) {
                Statics.field3801 = true;
                class103.method5839(var3, arg0.field1394);
                method4497();
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3200 == arg0.field1396) {
                method5042(true, var3);
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3232 == arg0.field1396) {
                Statics.field3342 = class493.method3420(var3.method7964());
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3272 == arg0.field1396) {
                var3.field4939 += 28;
                if (var3.method7992()) {
                    method88(var3, var3.field4939 - 28);
                }
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3261 == arg0.field1396) {
                class64 var141 = new class64();
                var141.field808 = var3.method7983();
                var141.field815 = var3.method8032();
                int var142 = var3.method7979();
                var141.field816 = var142;
                method4858(45);
                var2.method7150();
                Object var143 = null;
                class72.method3520(var141);
                arg0.field1396 = null;
                return false;
            }
            if (class283.field3280 == arg0.field1396) {
                int var144 = var3.method8050();
                int var145 = var3.method7979();
                class310 var146 = class310.method2952(var145);
                if (var146.field3596 != 1 || var146.field3597 != var144) {
                    var146.field3596 = 1;
                    var146.field3597 = var144;
                    method2361(var146);
                }
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3215 == arg0.field1396) {
                method3380();
                arg0.field1396 = null;
                return false;
            }
            if (class283.field3249 == arg0.field1396) {
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3298 == arg0.field1396) {
                Statics.field148 = var3.method7997();
                Statics.field4407 = var3.method7997();
                while (var3.field4939 < arg0.field1394) {
                    int var147 = var3.method7964();
                    class281 var148 = class281.method417()[var147];
                    method1056(var148);
                }
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3221 == arg0.field1396) {
                int var149 = var3.method8050();
                short var150 = (short) var3.method8008();
                int var151 = var3.method7997();
                int var152 = var3.method8020();
                class96 var153 = field683[var149];
                if (var153 != null) {
                    var153.method2503(var151, var152, var150);
                }
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3238 == arg0.field1396) {
                field767 = true;
                field768 = false;
                Statics.field2807 = var3.method7964();
                Statics.field1353 = var3.method7964();
                Statics.field2267 = var3.method8032();
                Statics.field486 = var3.method7964();
                Statics.field1321 = var3.method7964();
                if (Statics.field1321 >= 100) {
                    int var154 = Statics.field2807 * 128 + 64;
                    int var155 = Statics.field1353 * 128 + 64;
                    int var156 = method6114(var154, var155, Statics.field1370) - Statics.field2267;
                    int var157 = var154 - Statics.field1743;
                    int var158 = var156 - Statics.field1462;
                    int var159 = var155 - Statics.field4373;
                    int var160 = (int) Math.sqrt((double) (var157 * var157 + var159 * var159));
                    Statics.field1358 = (int) (Math.atan2((double) var158, (double) var160) * 325.9490051269531D) & 0x7FF;
                    Statics.field3332 = (int) (Math.atan2((double) var157, (double) var159) * -325.9490051269531D) & 0x7FF;
                    if (Statics.field1358 < 128) {
                        Statics.field1358 = 128;
                    }
                    if (Statics.field1358 > 383) {
                        Statics.field1358 = 383;
                    }
                }
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3245 == arg0.field1396) {
                method834();
                byte var161 = var3.method7965();
                if (arg0.field1394 == 1) {
                    if (var161 >= 0) {
                        field748[var161] = null;
                    } else {
                        Statics.field992 = null;
                    }
                    arg0.field1396 = null;
                    return true;
                }
                if (var161 >= 0) {
                    field748[var161] = new class151(var3);
                } else {
                    Statics.field992 = new class151(var3);
                }
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3198 == arg0.field1396) {
                method2892();
                field717 = var3.method7967();
                field762 = field700;
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3282 == arg0.field1396) {
                if (field675 != -1) {
                    method3017(field675, 0);
                }
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3217 == arg0.field1396) {
                int var162 = var3.method8018();
                int var163 = var3.method8008();
                int var164 = var3.method8008();
                class310 var165 = class310.method2952(var162);
                if (var165.field3561 != var163 || var165.field3562 != var164 || var165.field3545 != 0 || var165.field3695 != 0) {
                    var165.field3561 = var163;
                    var165.field3562 = var164;
                    var165.field3545 = 0;
                    var165.field3695 = 0;
                    method2361(var165);
                    this.method1506(var165);
                    if (var165.field3657 == 0) {
                        method4899(Statics.field2984[var162 >> 16], var165, false);
                    }
                }
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3214 == arg0.field1396) {
                return this.method1680(arg0, 2);
            }
            if (class283.field3277 == arg0.field1396) {
                field671 = var3.method7964();
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3290 == arg0.field1396) {
                int var166 = var3.method8050();
                byte var167 = var3.method7999();
                class300.field3460[var166] = var167;
                if (class300.field3459[var166] != var167) {
                    class300.field3459[var166] = var167;
                }
                method690(var166);
                field701[++field505 - 1 & 0x1F] = var166;
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3266 == arg0.field1396) {
                Statics.field1944.method1746(var3, arg0.field1394);
                field710 = field700;
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3213 == arg0.field1396) {
                method3419(var3.method7983());
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3199 == arg0.field1396) {
                method1056(class281.field3184);
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3279 == arg0.field1396) {
                String var168 = var3.method7983();
                String var169 = class376.method6713(class365.method3541(class313.method3143(var3)));
                class106.method5047(6, var168, var169);
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3242 == arg0.field1396) {
                int var170 = var3.method7964();
                method2759(var170);
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3278 == arg0.field1396) {
                boolean var171 = var3.method7972();
                if (!var171) {
                    Statics.field1634 = null;
                } else if (Statics.field1634 == null) {
                    Statics.field1634 = new class348();
                }
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3223 == arg0.field1396) {
                method5040(true, arg0.field1397);
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3297 == arg0.field1396) {
                int var172 = var3.method8032();
                if (var172 == 65535) {
                    var172 = -1;
                }
                method5310(var172);
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3243 == arg0.field1396) {
                int var173 = var3.method8132();
                int var174 = var3.method8050();
                if (var174 == 65535) {
                    var174 = -1;
                }
                method2219(var174, var173);
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3218 == arg0.field1396) {
                String var175 = var3.method7983();
                long var176 = (long) var3.method8032();
                long var178 = (long) var3.method8132();
                class332 var180 = (class332) class351.method19(class332.method2185(), var3.method7964());
                long var181 = (var176 << 32) + var178;
                boolean var183 = false;
                for (int var184 = 0; var184 < 100; var184++) {
                    if (field740[var184] == var181) {
                        var183 = true;
                        break;
                    }
                }
                if (Statics.field1944.method1750(new class497(var175, Statics.field3020))) {
                    var183 = true;
                }
                if (!var183 && field627 == 0) {
                    field740[field741] = var181;
                    field741 = (field741 + 1) % 100;
                    String var185 = class376.method6713(class365.method3541(class313.method3143(var3)));
                    byte var186;
                    if (var180.field4188) {
                        var186 = 7;
                    } else {
                        var186 = 3;
                    }
                    if (var180.field4187 == -1) {
                        class106.method5047(var186, var175, var185);
                    } else {
                        class106.method5047(var186, class97.method1829(var180.field4187) + var175, var185);
                    }
                }
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3255 == arg0.field1396) {
                int var187 = var3.method8032();
                class96 var188 = field683[var187];
                int var189 = var3.method8039();
                int var190 = var3.method8019();
                if (var188 != null) {
                    var188.field1207 = var189;
                    var188.field1211 = var190 >> 16;
                    var188.field1208 = (var190 & 0xFFFF) + field511;
                    var188.field1199 = 0;
                    var188.field1209 = 0;
                    if (var188.field1208 > field511) {
                        var188.field1199 = -1;
                    }
                    if (var188.field1207 == 65535) {
                        var188.field1207 = -1;
                    }
                }
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3241 == arg0.field1396) {
                int var191 = var3.method8039();
                field675 = var191;
                this.method1210(false);
                method3104(var191);
                class67.method843(field675);
                for (int var192 = 0; var192 < 100; var192++) {
                    field726[var192] = true;
                }
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3276 == arg0.field1396) {
                String var193 = var3.method7983();
                int var194 = var3.method8019();
                class310 var195 = class310.method2952(var194);
                if (!var193.equals(var195.field3614)) {
                    var195.field3614 = var193;
                    method2361(var195);
                }
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3247 == arg0.field1396) {
                int var196 = var3.method8019();
                class310 var197 = class310.method2952(var196);
                for (int var198 = 0; var198 < var197.field3688.length; var198++) {
                    var197.field3688[var198] = -1;
                    var197.field3688[var198] = 0;
                }
                method2361(var197);
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3194 == arg0.field1396) {
                method1056(class281.field3172);
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3195 == arg0.field1396) {
                int var199 = var3.method8020();
                class310 var200 = class310.method2952(var199);
                var200.field3596 = 3;
                var200.field3597 = Statics.field4508.field1107.method5369();
                method2361(var200);
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3263 == arg0.field1396) {
                String var201 = var3.method7983();
                long var202 = var3.method8151();
                long var204 = (long) var3.method8032();
                long var206 = (long) var3.method8132();
                class332 var208 = (class332) class351.method19(class332.method2185(), var3.method7964());
                long var209 = (var204 << 32) + var206;
                boolean var211 = false;
                for (int var212 = 0; var212 < 100; var212++) {
                    if (field740[var212] == var209) {
                        var211 = true;
                        break;
                    }
                }
                if (var208.field4189 && Statics.field1944.method1750(new class497(var201, Statics.field3020))) {
                    var211 = true;
                }
                if (!var211 && field627 == 0) {
                    field740[field741] = var209;
                    field741 = (field741 + 1) % 100;
                    String var213 = class376.method6713(class365.method3541(class313.method3143(var3)));
                    if (var208.field4187 == -1) {
                        class106.method2977(9, var201, var213, class367.method4917(var202));
                    } else {
                        class106.method2977(9, class97.method1829(var208.field4187) + var201, var213, class367.method4917(var202));
                    }
                }
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3227 == arg0.field1396) {
                int var214 = var3.method7964();
                method4293(var214);
                arg0.field1396 = null;
                return false;
            }
            if (class283.field3301 == arg0.field1396) {
                Statics.field1944.method1766();
                field710 = field700;
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3216 == arg0.field1396) {
                method1056(class281.field3177);
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3259 == arg0.field1396) {
                int var215 = var3.method8039();
                int var216 = var3.method8018();
                int var217 = var3.method8050();
                int var218 = var3.method8032();
                class310 var219 = class310.method2952(var216);
                if (var219.field3604 != var215 || var219.field3677 != var217 || var219.field3592 != var218) {
                    var219.field3604 = var215;
                    var219.field3677 = var217;
                    var219.field3592 = var218;
                    method2361(var219);
                }
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3208 == arg0.field1396) {
                class37.method3018(var3, arg0.field1394);
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3256 == arg0.field1396) {
                Statics.field3308 = true;
                method5042(true, var3);
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3230 == arg0.field1396) {
                method2892();
                int var220 = var3.method7998();
                int var221 = var3.method7998();
                int var222 = var3.method8020();
                field648[var221] = var222;
                field646[var221] = var220;
                field712[var221] = 1;
                for (int var223 = 0; var223 < 98; var223++) {
                    if (var222 >= class320.field3770[var223]) {
                        field712[var221] = var223 + 2;
                    }
                }
                field705[++field706 - 1 & 0x1F] = var221;
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3264 == arg0.field1396) {
                int var224 = var3.method8034();
                int var225 = var3.method7996();
                int var226 = var3.method8020();
                class83 var227 = (class83) field676.method7706((long) var226);
                if (var227 != null) {
                    method107(var227, var227.field1055 != var224);
                }
                method6223(var226, var224, var225);
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3219 == arg0.field1396) {
                int var228 = var3.method8032();
                int var229 = var3.method8018();
                class300.field3460[var228] = var229;
                if (class300.field3459[var228] != var229) {
                    class300.field3459[var228] = var229;
                }
                method690(var228);
                field701[++field505 - 1 & 0x1F] = var228;
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3237 == arg0.field1396) {
                int var230 = var3.method7979();
                int var231 = var3.method8032();
                if (var230 < -70000) {
                    var231 += 32768;
                }
                class310 var232;
                if (var230 >= 0) {
                    var232 = class310.method2952(var230);
                } else {
                    var232 = null;
                }
                if (var232 != null) {
                    for (int var233 = 0; var233 < var232.field3688.length; var233++) {
                        var232.field3688[var233] = 0;
                        var232.field3689[var233] = 0;
                    }
                }
                class81.method6101(var231);
                int var234 = var3.method8032();
                for (int var235 = 0; var235 < var234; var235++) {
                    int var236 = var3.method7964();
                    if (var236 == 255) {
                        var236 = var3.method7979();
                    }
                    int var237 = var3.method8050();
                    if (var232 != null && var235 < var232.field3688.length) {
                        var232.field3688[var235] = var237;
                        var232.field3689[var235] = var236;
                    }
                    Statics.method3872(var231, var235, var237 - 1, var236);
                }
                if (var232 != null) {
                    method2361(var232);
                }
                method2892();
                field662[++field525 - 1 & 0x1F] = var231 & 0x7FFF;
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3222 == arg0.field1396) {
                method834();
                byte var238 = var3.method7965();
                class143 var239 = new class143(var3);
                class151 var240;
                if (var238 >= 0) {
                    var240 = field748[var238];
                } else {
                    var240 = Statics.field992;
                }
                var239.method2999(var240);
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3234 == arg0.field1396) {
                method1056(class281.field3180);
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3235 == arg0.field1396) {
                int var241 = var3.method7979();
                int var242 = var3.method8032();
                if (var241 < -70000) {
                    var242 += 32768;
                }
                class310 var243;
                if (var241 >= 0) {
                    var243 = class310.method2952(var241);
                } else {
                    var243 = null;
                }
                while (var3.field4939 < arg0.field1394) {
                    int var244 = var3.method8059();
                    int var245 = var3.method8032();
                    int var246 = 0;
                    if (var245 != 0) {
                        var246 = var3.method7964();
                        if (var246 == 255) {
                            var246 = var3.method7979();
                        }
                    }
                    if (var243 != null && var244 >= 0 && var244 < var243.field3688.length) {
                        var243.field3688[var244] = var245;
                        var243.field3689[var244] = var246;
                    }
                    Statics.method3872(var242, var244, var245 - 1, var246);
                }
                if (var243 != null) {
                    method2361(var243);
                }
                method2892();
                field662[++field525 - 1 & 0x1F] = var242 & 0x7FFF;
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3253 == arg0.field1396) {
                method2892();
                field497 = var3.method8032();
                field762 = field700;
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3239 == arg0.field1396) {
                int var247 = var3.method8019();
                int var248 = var3.method8032();
                if (var248 == 65535) {
                    var248 = -1;
                }
                int var249 = var3.method7979();
                int var250 = var3.method8034();
                if (var250 == 65535) {
                    var250 = -1;
                }
                for (int var251 = var250; var251 <= var248; var251++) {
                    long var252 = ((long) var247 << 32) + (long) var251;
                    class440 var254 = field690.method7706(var252);
                    if (var254 != null) {
                        var254.method7431();
                    }
                    field690.method7716(new class439(var249), var252);
                }
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3305 == arg0.field1396) {
                method1056(class281.field3178);
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3203 == arg0.field1396) {
                method1056(class281.field3181);
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3291 == arg0.field1396) {
                int var255 = var3.method8163();
                int var256 = var255 >> 16;
                int var257 = var255 >> 8 & 0xFF;
                int var258 = (var255 >> 4 & 0x7) + var256;
                int var259 = (var255 & 0x7) + var257;
                int var260 = var3.method7996();
                int var261 = var260 >> 2;
                int var262 = var260 & 0x3;
                int var263 = field574[var261];
                int var264 = var3.method8034();
                if (var258 >= 0 && var259 >= 0 && var258 < 103 && var259 < 103) {
                    if (var263 == 0) {
                        class233 var265 = Statics.field3022.method4134(Statics.field1370, var258, var259);
                        if (var265 != null) {
                            int var266 = class229.method2897(var265.field2775);
                            if (var261 == 2) {
                                var265.field2773 = new class76(var266, 2, var262 + 4, Statics.field1370, var258, var259, var264, false, var265.field2773);
                                var265.field2774 = new class76(var266, 2, var262 + 1 & 0x3, Statics.field1370, var258, var259, var264, false, var265.field2774);
                            } else {
                                var265.field2773 = new class76(var266, var261, var262, Statics.field1370, var258, var259, var264, false, var265.field2773);
                            }
                        }
                    } else if (var263 == 1) {
                        class235 var267 = Statics.field3022.method4135(Statics.field1370, var258, var259);
                        if (var267 != null) {
                            int var268 = class229.method2897(var267.field2789);
                            if (var261 == 4 || var261 == 5) {
                                var267.field2780 = new class76(var268, 4, var262, Statics.field1370, var258, var259, var264, false, var267.field2780);
                            } else if (var261 == 6) {
                                var267.field2780 = new class76(var268, 4, var262 + 4, Statics.field1370, var258, var259, var264, false, var267.field2780);
                            } else if (var261 == 7) {
                                var267.field2780 = new class76(var268, 4, (var262 + 2 & 0x3) + 4, Statics.field1370, var258, var259, var264, false, var267.field2780);
                            } else if (var261 == 8) {
                                var267.field2780 = new class76(var268, 4, var262 + 4, Statics.field1370, var258, var259, var264, false, var267.field2780);
                                var267.field2787 = new class76(var268, 4, (var262 + 2 & 0x3) + 4, Statics.field1370, var258, var259, var264, false, var267.field2787);
                            }
                        }
                    } else if (var263 == 2) {
                        class236 var269 = Statics.field3022.method4136(Statics.field1370, var258, var259);
                        if (var261 == 11) {
                            var261 = 10;
                        }
                        if (var269 != null) {
                            var269.field2796 = new class76(class229.method2897(var269.field2792), var261, var262, Statics.field1370, var258, var259, var264, false, var269.field2796);
                        }
                    } else if (var263 == 3) {
                        class213 var270 = Statics.field3022.method4137(Statics.field1370, var258, var259);
                        if (var270 != null) {
                            var270.field2435 = new class76(class229.method2897(var270.field2432), 22, var262, Statics.field1370, var258, var259, var264, false, var270.field2435);
                        }
                    }
                }
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3281 == arg0.field1396) {
                int var271 = var3.method8008();
                int var272 = var3.method8019();
                class310 var273 = class310.method2952(var272);
                if (var273.field3704 != var271 || var271 == -1) {
                    var273.field3704 = var271;
                    var273.field3692 = 0;
                    var273.field3693 = 0;
                    method2361(var273);
                }
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3267 == arg0.field1396) {
                byte var274 = var3.method7965();
                long var275 = (long) var3.method8032();
                long var277 = (long) var3.method8132();
                long var279 = (var275 << 32) + var277;
                boolean var281 = false;
                class160 var282 = var274 >= 0 ? field749[var274] : Statics.field5003;
                if (var282 == null) {
                    var281 = true;
                } else {
                    for (int var283 = 0; var283 < 100; var283++) {
                        if (field740[var283] == var279) {
                            var281 = true;
                            break;
                        }
                    }
                }
                if (!var281) {
                    field740[field741] = var279;
                    field741 = (field741 + 1) % 100;
                    String var284 = class313.method3143(var3);
                    int var285 = var274 >= 0 ? 43 : 46;
                    class106.method2977(var285, "", var284, var282.field1799);
                }
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3251 == arg0.field1396) {
                int var286 = var3.method8020();
                int var287 = var3.method8034();
                int var288 = var287 >> 10 & 0x1F;
                int var289 = var287 >> 5 & 0x1F;
                int var290 = var287 & 0x1F;
                int var291 = (var290 << 3) + (var288 << 19) + (var289 << 11);
                class310 var292 = class310.method2952(var286);
                if (var292.field3577 != var291) {
                    var292.field3577 = var291;
                    method2361(var292);
                }
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3193 == arg0.field1396) {
                Statics.field1944.field826.method6947(var3, arg0.field1394);
                method7668();
                field710 = field700;
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3293 == arg0.field1396) {
                int var293 = var3.method8034();
                int var294 = var3.method8020();
                class310 var295 = class310.method2952(var294);
                if (var295 != null && var295.field3657 == 0) {
                    if (var293 > var295.field3543 - var295.field3568) {
                        var293 = var295.field3543 - var295.field3568;
                    }
                    if (var293 < 0) {
                        var293 = 0;
                    }
                    if (var295.field3574 != var293) {
                        var295.field3574 = var293;
                        method2361(var295);
                    }
                }
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3296 == arg0.field1396 && field767) {
                field768 = true;
                Statics.field4341 = var3.method7964();
                Statics.field1445 = var3.method7964();
                Statics.field486 = var3.method7964();
                Statics.field1321 = var3.method7964();
                for (int var296 = 0; var296 < 5; var296++) {
                    field570[var296] = false;
                }
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3274 == arg0.field1396) {
                Statics.field4513 = new class422(Statics.field2362);
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3224 == arg0.field1396) {
                method1056(class281.field3182);
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3283 == arg0.field1396) {
                byte[] var297 = new byte[arg0.field1394];
                var3.method7915(var297, 0, var297.length);
                class474 var298 = new class474(var297);
                String var299 = var298.method7983();
                class32.method2581(var299, true, false);
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3270 == arg0.field1396) {
                int var300 = var3.method8019();
                int var301 = var3.method8032();
                class310 var302 = class310.method2952(var300);
                if (var302.field3596 != 6 || var302.field3597 != var301) {
                    var302.field3596 = 6;
                    var302.field3597 = var301;
                    method2361(var302);
                }
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3303 == arg0.field1396) {
                int var303 = var3.method8020();
                int var304 = var3.method8019();
                class83 var305 = (class83) field676.method7706((long) var303);
                class83 var306 = (class83) field676.method7706((long) var304);
                if (var306 != null) {
                    method107(var306, var305 == null || var305.field1055 != var306.field1055);
                }
                if (var305 != null) {
                    var305.method7431();
                    field676.method7716(var305, (long) var304);
                }
                class310 var307 = class310.method2952(var303);
                if (var307 != null) {
                    method2361(var307);
                }
                class310 var308 = class310.method2952(var304);
                if (var308 != null) {
                    method2361(var308);
                    method4899(Statics.field2984[var308.field3701 >>> 16], var308, true);
                }
                if (field675 != -1) {
                    method3017(field675, 1);
                }
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3207 == arg0.field1396) {
                method1056(class281.field3175);
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3275 == arg0.field1396) {
                field738 = var3.method7996();
                field737 = var3.method7997();
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3202 == arg0.field1396) {
                Statics.field3308 = true;
                method5042(false, var3);
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3244 == arg0.field1396) {
                field677 = var3.method8050() * 30;
                field762 = field700;
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3246 == arg0.field1396) {
                for (int var309 = 0; var309 < class300.field3459.length; var309++) {
                    if (class300.field3460[var309] != class300.field3459[var309]) {
                        class300.field3459[var309] = class300.field3460[var309];
                        method690(var309);
                        field701[++field505 - 1 & 0x1F] = var309;
                    }
                }
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3300 == arg0.field1396) {
                method1056(class281.field3174);
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3205 == arg0.field1396) {
                Statics.field4407 = var3.method7996();
                Statics.field148 = var3.method7964();
                for (int var310 = Statics.field4407; var310 < Statics.field4407 + 8; var310++) {
                    for (int var311 = Statics.field148; var311 < Statics.field148 + 8; var311++) {
                        if (field642[Statics.field1370][var310][var311] != null) {
                            field642[Statics.field1370][var310][var311] = null;
                            method5043(var310, var311);
                        }
                    }
                }
                for (class90 var312 = (class90) field643.method6241(); var312 != null; var312 = (class90) field643.method6248()) {
                    if (var312.field1146 >= Statics.field4407 && var312.field1146 < Statics.field4407 + 8 && var312.field1147 >= Statics.field148 && var312.field1147 < Statics.field148 + 8 && Statics.field1370 == var312.field1156) {
                        var312.field1144 = 0;
                    }
                }
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3306 == arg0.field1396) {
                for (int var313 = 0; var313 < Statics.field1928; var313++) {
                    class182 var314 = class182.method3231(var313);
                    if (var314 != null) {
                        class300.field3460[var313] = 0;
                        class300.field3459[var313] = 0;
                    }
                }
                method2892();
                field505 += 32;
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3209 == arg0.field1396) {
                int var315 = var3.method7964();
                int var316 = var3.method7964();
                int var317 = var3.method7964();
                int var318 = var3.method7964();
                field570[var315] = true;
                field770[var315] = var316;
                field526[var315] = var317;
                field772[var315] = var318;
                field773[var315] = 0;
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3271 == arg0.field1396) {
                field518 = var3.method7964();
                if (field518 == 1) {
                    field519 = var3.method8032();
                }
                if (field518 >= 2 && field518 <= 6) {
                    if (field518 == 2) {
                        field763 = 64;
                        field704 = 64;
                    }
                    if (field518 == 3) {
                        field763 = 0;
                        field704 = 64;
                    }
                    if (field518 == 4) {
                        field763 = 128;
                        field704 = 64;
                    }
                    if (field518 == 5) {
                        field763 = 64;
                        field704 = 0;
                    }
                    if (field518 == 6) {
                        field763 = 64;
                        field704 = 128;
                    }
                    field518 = 2;
                    field521 = var3.method8032();
                    field540 = var3.method8032();
                    field523 = var3.method7964();
                }
                if (field518 == 10) {
                    field520 = var3.method8032();
                }
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3254 == arg0.field1396) {
                String var319 = var3.method7983();
                int var320 = var3.method7997();
                int var321 = var3.method7998();
                if (var321 >= 1 && var321 <= 8) {
                    if (var319.equalsIgnoreCase(class330.field3846)) {
                        var319 = null;
                    }
                    field607[var321 - 1] = var319;
                    field639[var321 - 1] = var320 == 0;
                }
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3294 == arg0.field1396) {
                for (int var322 = 0; var322 < field621.length; var322++) {
                    if (field621[var322] != null) {
                        field621[var322].field1224 = -1;
                    }
                }
                for (int var323 = 0; var323 < field683.length; var323++) {
                    if (field683[var323] != null) {
                        field683[var323].field1224 = -1;
                    }
                }
                arg0.field1396 = null;
                return true;
            }
            if (class283.field3262 == arg0.field1396) {
                int var324 = var3.method7979();
                int var325 = var3.method7979();
                int var326 = class35.method5081();
                class282 var327 = class282.method4287(class280.field3072, field689.field1390);
                var327.field3187.method8016(var324);
                var327.field3187.method8166(var325);
                var327.field3187.method8085(field213);
                var327.field3187.method7947(var326);
                field689.method2694(var327);
                arg0.field1396 = null;
                return true;
            }
            class500.method2855("" + (arg0.field1396 == null ? -1 : arg0.field1396.field3269) + class97.field1300 + (arg0.field1402 == null ? -1 : arg0.field1402.field3269) + class97.field1300 + (arg0.field1403 == null ? -1 : arg0.field1403.field3269) + class97.field1300 + arg0.field1394, (Throwable) null);
            method3380();
        } catch (IOException var332) {
            method4828();
        } catch (Exception var333) {
            String var330 = "" + (arg0.field1396 == null ? -1 : arg0.field1396.field3269) + class97.field1300 + (arg0.field1402 == null ? -1 : arg0.field1402.field3269) + class97.field1300 + (arg0.field1403 == null ? -1 : arg0.field1403.field3269) + class97.field1300 + arg0.field1394 + class97.field1300 + (Statics.field2118 + Statics.field4508.field1210[0]) + class97.field1300 + (Statics.field565 + Statics.field4508.field1232[0]) + class97.field1300;
            for (int var331 = 0; var331 < arg0.field1394 && var331 < 50; var331++) {
                var330 = var330 + var3.field4936[var331] + class97.field1300;
            }
            class500.method2855(var330, var333);
            method3380();
        }
        return true;
    }

    @ObfuscatedName("br.iu(Ljs;B)V")
    public static final void method1056(class281 arg0) {
        class473 var1 = field689.field1397;
        if (class281.field3179 == arg0) {
            int var2 = var1.method8050();
            int var3 = var1.method7964();
            int var4 = var3 >> 2;
            int var5 = var3 & 0x3;
            int var6 = field574[var4];
            int var7 = var1.method7964();
            int var8 = (var7 >> 4 & 0x7) + Statics.field4407;
            int var9 = (var7 & 0x7) + Statics.field148;
            if (var8 >= 0 && var9 >= 0 && var8 < 103 && var9 < 103) {
                if (var6 == 0) {
                    class233 var10 = Statics.field3022.method4134(Statics.field1370, var8, var9);
                    if (var10 != null) {
                        int var11 = class229.method2897(var10.field2775);
                        if (var4 == 2) {
                            var10.field2773 = new class76(var11, 2, var5 + 4, Statics.field1370, var8, var9, var2, false, var10.field2773);
                            var10.field2774 = new class76(var11, 2, var5 + 1 & 0x3, Statics.field1370, var8, var9, var2, false, var10.field2774);
                        } else {
                            var10.field2773 = new class76(var11, var4, var5, Statics.field1370, var8, var9, var2, false, var10.field2773);
                        }
                    }
                }
                if (var6 == 1) {
                    class235 var12 = Statics.field3022.method4135(Statics.field1370, var8, var9);
                    if (var12 != null) {
                        int var13 = class229.method2897(var12.field2789);
                        if (var4 == 4 || var4 == 5) {
                            var12.field2780 = new class76(var13, 4, var5, Statics.field1370, var8, var9, var2, false, var12.field2780);
                        } else if (var4 == 6) {
                            var12.field2780 = new class76(var13, 4, var5 + 4, Statics.field1370, var8, var9, var2, false, var12.field2780);
                        } else if (var4 == 7) {
                            var12.field2780 = new class76(var13, 4, (var5 + 2 & 0x3) + 4, Statics.field1370, var8, var9, var2, false, var12.field2780);
                        } else if (var4 == 8) {
                            var12.field2780 = new class76(var13, 4, var5 + 4, Statics.field1370, var8, var9, var2, false, var12.field2780);
                            var12.field2787 = new class76(var13, 4, (var5 + 2 & 0x3) + 4, Statics.field1370, var8, var9, var2, false, var12.field2787);
                        }
                    }
                }
                if (var6 == 2) {
                    class236 var14 = Statics.field3022.method4136(Statics.field1370, var8, var9);
                    if (var4 == 11) {
                        var4 = 10;
                    }
                    if (var14 != null) {
                        var14.field2796 = new class76(class229.method2897(var14.field2792), var4, var5, Statics.field1370, var8, var9, var2, false, var14.field2796);
                    }
                }
                if (var6 == 3) {
                    class213 var15 = Statics.field3022.method4137(Statics.field1370, var8, var9);
                    if (var15 != null) {
                        var15.field2435 = new class76(class229.method2897(var15.field2432), 22, var5, Statics.field1370, var8, var9, var2, false, var15.field2435);
                    }
                }
            }
        } else if (class281.field3182 == arg0) {
            int var16 = var1.method7964();
            int var17 = (var16 >> 4 & 0x7) + Statics.field4407;
            int var18 = (var16 & 0x7) + Statics.field148;
            int var19 = var1.method7996();
            var1.method7996();
            var1.method8034();
            int var20 = var1.method8050();
            int var21 = var1.method7979();
            var1.method7996();
            var1.method8050();
            if (var17 >= 0 && var18 >= 0 && var17 < 104 && var18 < 104) {
                class100 var22 = new class100();
                var22.field1326 = var20;
                var22.field1325 = var21;
                var22.method2589(var19);
                if (field642[Statics.field1370][var17][var18] == null) {
                    field642[Statics.field1370][var17][var18] = new class356();
                }
                field642[Statics.field1370][var17][var18].method6236(var22);
                method5043(var17, var18);
            }
        } else {
            if (class281.field3183 == arg0) {
                int var23 = var1.method8034();
                int var24 = var1.method7997();
                int var25 = var24 >> 4 & 0xF;
                int var26 = var24 & 0x7;
                int var27 = var1.method7996();
                int var28 = var1.method7996();
                int var29 = (var28 >> 4 & 0x7) + Statics.field4407;
                int var30 = (var28 & 0x7) + Statics.field148;
                if (var29 >= 0 && var30 >= 0 && var29 < 104 && var30 < 104) {
                    int var31 = var25 + 1;
                    if (Statics.field4508.field1210[0] >= var29 - var31 && Statics.field4508.field1210[0] <= var29 + var31 && Statics.field4508.field1232[0] >= var30 - var31 && Statics.field4508.field1232[0] <= var30 + var31 && Statics.field1404.method2383() != 0 && var26 > 0 && field761 < 50) {
                        field633[field761] = var23;
                        field609[field761] = var26;
                        field713[field761] = var27;
                        field766[field761] = null;
                        field765[field761] = (var29 << 16) + (var30 << 8) + var25;
                        field761++;
                    }
                }
            }
            if (class281.field3175 == arg0) {
                int var32 = var1.method7996();
                int var33 = (var32 >> 4 & 0x7) + Statics.field4407;
                int var34 = (var32 & 0x7) + Statics.field148;
                int var35 = var1.method8034();
                int var36 = var1.method8019();
                if (var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104) {
                    class356 var37 = field642[Statics.field1370][var33][var34];
                    if (var37 != null) {
                        for (class100 var38 = (class100) var37.method6241(); var38 != null; var38 = (class100) var37.method6248()) {
                            if ((var35 & 0x7FFF) == var38.field1326 && var38.field1325 == var36) {
                                var38.method7431();
                                break;
                            }
                        }
                        if (var37.method6241() == null) {
                            field642[Statics.field1370][var33][var34] = null;
                        }
                        method5043(var33, var34);
                    }
                }
            } else if (class281.field3172 == arg0) {
                int var39 = var1.method7964();
                int var40 = (var39 >> 4 & 0x7) + Statics.field4407;
                int var41 = (var39 & 0x7) + Statics.field148;
                int var42 = var1.method7998();
                int var43 = var42 >> 2;
                int var44 = var42 & 0x3;
                int var45 = field574[var43];
                if (var40 >= 0 && var41 >= 0 && var40 < 104 && var41 < 104) {
                    method3274(Statics.field1370, var40, var41, var45, -1, var43, var44, 31, 0, -1);
                }
            } else if (class281.field3177 == arg0) {
                int var46 = var1.method7996();
                int var47 = var1.method8034();
                int var48 = var1.method7997();
                int var49 = (var48 >> 4 & 0x7) + Statics.field4407;
                int var50 = (var48 & 0x7) + Statics.field148;
                int var51 = var1.method7964();
                int var52 = var51 >> 2;
                int var53 = var51 & 0x3;
                int var54 = field574[var52];
                if (var49 >= 0 && var50 >= 0 && var49 < 104 && var50 < 104) {
                    method3274(Statics.field1370, var49, var50, var54, var47, var52, var53, var46, 0, -1);
                }
            } else if (class281.field3176 == arg0) {
                int var55 = var1.method8034();
                int var56 = var1.method8039();
                int var57 = var1.method8039();
                int var58 = var1.method7996();
                int var59 = (var58 >> 4 & 0x7) + Statics.field4407;
                int var60 = (var58 & 0x7) + Statics.field148;
                if (var59 >= 0 && var60 >= 0 && var59 < 104 && var60 < 104) {
                    class356 var61 = field642[Statics.field1370][var59][var60];
                    if (var61 != null) {
                        for (class100 var62 = (class100) var61.method6241(); var62 != null; var62 = (class100) var61.method6248()) {
                            if ((var56 & 0x7FFF) == var62.field1326 && var62.field1325 == var57) {
                                var62.field1325 = var55;
                                break;
                            }
                        }
                        method5043(var59, var60);
                    }
                }
            } else if (class281.field3181 == arg0) {
                int var63 = var1.method7964();
                int var64 = (var63 >> 4 & 0x7) + Statics.field4407;
                int var65 = (var63 & 0x7) + Statics.field148;
                int var66 = var1.method7996();
                int var67 = var1.method8032();
                if (var64 >= 0 && var65 >= 0 && var64 < 104 && var65 < 104) {
                    class356 var68 = field642[Statics.field1370][var64][var65];
                    if (var68 != null) {
                        for (class100 var69 = (class100) var68.method6241(); var69 != null; var69 = (class100) var68.method6248()) {
                            if ((var67 & 0x7FFF) == var69.field1326) {
                                var69.method2589(var66);
                                break;
                            }
                        }
                    }
                }
            } else {
                if (class281.field3173 == arg0) {
                    int var70 = var1.method8032();
                    byte var71 = var1.method7965();
                    byte var72 = var1.method8106();
                    int var73 = var1.method8050();
                    int var74 = var1.method7996();
                    int var75 = var74 >> 2;
                    int var76 = var74 & 0x3;
                    int var77 = field574[var75];
                    byte var78 = var1.method7965();
                    int var79 = var1.method8032();
                    int var80 = var1.method7998();
                    int var81 = (var80 >> 4 & 0x7) + Statics.field4407;
                    int var82 = (var80 & 0x7) + Statics.field148;
                    int var83 = var1.method8050();
                    byte var84 = var1.method7999();
                    class88 var85;
                    if (field630 == var83) {
                        var85 = Statics.field4508;
                    } else {
                        var85 = field621[var83];
                    }
                    if (var85 != null) {
                        class200 var86 = class200.method7839(var70);
                        int var87;
                        int var88;
                        if (var76 == 1 || var76 == 3) {
                            var87 = var86.field2182;
                            var88 = var86.field2181;
                        } else {
                            var87 = var86.field2181;
                            var88 = var86.field2182;
                        }
                        int var89 = (var87 >> 1) + var81;
                        int var90 = (var87 + 1 >> 1) + var81;
                        int var91 = (var88 >> 1) + var82;
                        int var92 = (var88 + 1 >> 1) + var82;
                        int[][] var93 = class78.field1015[Statics.field1370];
                        int var94 = var93[var89][var91] + var93[var90][var91] + var93[var89][var92] + var93[var90][var92] >> 2;
                        int var95 = (var81 << 7) + (var87 << 6);
                        int var96 = (var82 << 7) + (var88 << 6);
                        class228 var97 = var86.method3609(var75, var76, var93, var95, var94, var96);
                        if (var97 != null) {
                            method3274(Statics.field1370, var81, var82, var77, -1, 0, 0, 31, var73 + 1, var79 + 1);
                            var85.field1132 = field511 + var73;
                            var85.field1123 = field511 + var79;
                            var85.field1120 = var97;
                            var85.field1118 = var81 * 128 + var87 * 64;
                            var85.field1124 = var82 * 128 + var88 * 64;
                            var85.field1122 = var94;
                            if (var78 > var84) {
                                byte var98 = var78;
                                var78 = var84;
                                var84 = var98;
                            }
                            if (var71 > var72) {
                                byte var99 = var71;
                                var71 = var72;
                                var72 = var99;
                            }
                            var85.field1121 = var78 + var81;
                            var85.field1106 = var81 + var84;
                            var85.field1131 = var71 + var82;
                            var85.field1116 = var72 + var82;
                        }
                    }
                }
                if (class281.field3178 == arg0) {
                    int var100 = var1.method8039();
                    int var101 = var1.method8018();
                    int var102 = var1.method8019();
                    int var103 = var1.method7964();
                    int var104 = (var103 >> 4 & 0x7) + Statics.field4407;
                    int var105 = (var103 & 0x7) + Statics.field148;
                    if (var104 >= 0 && var105 >= 0 && var104 < 104 && var105 < 104) {
                        class356 var106 = field642[Statics.field1370][var104][var105];
                        if (var106 != null) {
                            for (class100 var107 = (class100) var106.method6241(); var107 != null; var107 = (class100) var106.method6248()) {
                                if ((var100 & 0x7FFF) == var107.field1326 && var107.field1325 == var101) {
                                    var107.field1325 = var102;
                                    break;
                                }
                            }
                            method5043(var104, var105);
                        }
                    }
                } else if (class281.field3174 == arg0) {
                    int var108 = var1.method8039();
                    int var109 = var1.method7964();
                    int var110 = var1.method8014();
                    int var111 = var1.method7998();
                    int var112 = var1.method7996() * 4;
                    int var113 = var1.method7997() * 4;
                    int var114 = var1.method8050();
                    int var115 = var1.method8050();
                    byte var116 = var1.method8106();
                    byte var117 = var1.method8195();
                    int var118 = var1.method7997();
                    int var119 = (var118 >> 4 & 0x7) + Statics.field4407;
                    int var120 = (var118 & 0x7) + Statics.field148;
                    int var121 = var117 + var119;
                    int var122 = var116 + var120;
                    if (var119 >= 0 && var120 >= 0 && var119 < 104 && var120 < 104 && var121 >= 0 && var122 >= 0 && var121 < 104 && var122 < 104 && var108 != 65535) {
                        int var123 = var119 * 128 + 64;
                        int var124 = var120 * 128 + 64;
                        int var125 = var121 * 128 + 64;
                        int var126 = var122 * 128 + 64;
                        class73 var127 = new class73(var108, Statics.field1370, var123, var124, method6114(var123, var124, Statics.field1370) - var113, field511 + var114, field511 + var115, var109, var111, var110, var112);
                        var127.method2078(var125, var126, method6114(var125, var126, Statics.field1370) - var112, field511 + var114);
                        field644.method6236(var127);
                    }
                } else if (class281.field3180 == arg0) {
                    int var128 = var1.method7964();
                    int var129 = var1.method7998();
                    int var130 = (var129 >> 4 & 0x7) + Statics.field4407;
                    int var131 = (var129 & 0x7) + Statics.field148;
                    int var132 = var1.method8050();
                    int var133 = var1.method7964();
                    byte var134 = var1.method7999();
                    int var135 = var1.method8039();
                    int var136 = var1.method7997() * 4;
                    int var137 = var1.method8009();
                    int var138 = var1.method7996() * 4;
                    int var139 = var1.method8034();
                    byte var140 = var1.method8195();
                    int var141 = var130 + var140;
                    int var142 = var131 + var134;
                    if (var130 >= 0 && var131 >= 0 && var130 < 104 && var131 < 104 && var141 >= 0 && var142 >= 0 && var141 < 104 && var142 < 104 && var132 != 65535) {
                        int var143 = var130 * 128 + 64;
                        int var144 = var131 * 128 + 64;
                        int var145 = var141 * 128 + 64;
                        int var146 = var142 * 128 + 64;
                        class73 var147 = new class73(var132, Statics.field1370, var143, var144, method6114(var143, var144, Statics.field1370) - var138, field511 + var135, field511 + var139, var128, var133, var137, var136);
                        var147.method2078(var145, var146, method6114(var145, var146, Statics.field1370) - var136, field511 + var135);
                        field644.method6236(var147);
                    }
                } else if (class281.field3184 == arg0) {
                    int var148 = var1.method7997();
                    int var149 = (var148 >> 4 & 0x7) + Statics.field4407;
                    int var150 = (var148 & 0x7) + Statics.field148;
                    int var151 = var1.method8039();
                    int var152 = var1.method7998();
                    int var153 = var1.method8032();
                    if (var149 >= 0 && var150 >= 0 && var149 < 104 && var150 < 104) {
                        int var154 = var149 * 128 + 64;
                        int var155 = var150 * 128 + 64;
                        class68 var156 = new class68(var153, Statics.field1370, var154, var155, method6114(var154, var155, Statics.field1370) - var152, var151, field511);
                        field645.method6236(var156);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fy.ih(IIIIIIIIIIB)V")
    public static final void method3274(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class90 var10 = null;
        for (class90 var11 = (class90) field643.method6241(); var11 != null; var11 = (class90) field643.method6248()) {
            if (var11.field1156 == arg0 && var11.field1146 == arg1 && var11.field1147 == arg2 && var11.field1145 == arg3) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class90();
            var10.field1156 = arg0;
            var10.field1145 = arg3;
            var10.field1146 = arg1;
            var10.field1147 = arg2;
            method3811(var10);
            field643.method6236(var10);
        }
        var10.field1151 = arg4;
        var10.field1153 = arg5;
        var10.field1152 = arg6;
        var10.field1155 = arg8;
        var10.field1144 = arg9;
        var10.method2302(arg7);
    }

    @ObfuscatedName("mn.ix(I)V")
    public static final void method6219() {
        for (class90 var0 = (class90) field643.method6241(); var0 != null; var0 = (class90) field643.method6248()) {
            if (var0.field1144 == -1) {
                var0.field1155 = 0;
                method3811(var0);
            } else {
                var0.method7431();
            }
        }
    }

    @ObfuscatedName("gu.ip(Lct;I)V")
    public static final void method3811(class90 arg0) {
        long var1 = 0L;
        int var3 = -1;
        int var4 = 0;
        int var5 = 0;
        if (arg0.field1145 == 0) {
            var1 = Statics.field3022.method4138(arg0.field1156, arg0.field1146, arg0.field1147);
        }
        if (arg0.field1145 == 1) {
            var1 = Statics.field3022.method4139(arg0.field1156, arg0.field1146, arg0.field1147);
        }
        if (arg0.field1145 == 2) {
            var1 = Statics.field3022.method4140(arg0.field1156, arg0.field1146, arg0.field1147);
        }
        if (arg0.field1145 == 3) {
            var1 = Statics.field3022.method4185(arg0.field1156, arg0.field1146, arg0.field1147);
        }
        if (var1 != 0L) {
            int var6 = Statics.field3022.method4142(arg0.field1156, arg0.field1146, arg0.field1147, var1);
            var3 = class229.method2897(var1);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg0.field1148 = var3;
        arg0.field1150 = var4;
        arg0.field1149 = var5;
    }

    @ObfuscatedName("ls.iz(IIIIIIII)V")
    public static final void method5885(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field501 && Statics.field1370 != arg0) {
            return;
        }
        long var7 = 0L;
        boolean var9 = true;
        boolean var10 = false;
        boolean var11 = false;
        if (arg1 == 0) {
            var7 = Statics.field3022.method4138(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field3022.method4139(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field3022.method4140(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field3022.method4185(arg0, arg2, arg3);
        }
        if (var7 != 0L) {
            int var12 = Statics.field3022.method4142(arg0, arg2, arg3, var7);
            int var13 = class229.method2897(var7);
            int var14 = var12 & 0x1F;
            int var15 = var12 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field3022.method4129(arg0, arg2, arg3);
                class200 var16 = class200.method7839(var13);
                if (var16.field2204 != 0) {
                    field685[arg0].method3861(arg2, arg3, var14, var15, var16.field2172);
                }
            }
            if (arg1 == 1) {
                Statics.field3022.method4130(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field3022.method4131(arg0, arg2, arg3);
                class200 var17 = class200.method7839(var13);
                if (var17.field2181 + arg2 > 103 || var17.field2181 + arg3 > 103 || var17.field2182 + arg2 > 103 || var17.field2182 + arg3 > 103) {
                    return;
                }
                if (var17.field2204 != 0) {
                    field685[arg0].method3851(arg2, arg3, var17.field2181, var17.field2182, var15, var17.field2172);
                }
            }
            if (arg1 == 3) {
                Statics.field3022.method4209(arg0, arg2, arg3);
                class200 var18 = class200.method7839(var13);
                if (var18.field2204 == 1) {
                    field685[arg0].method3853(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var19 = arg0;
        if (arg0 < 3 && (class78.field1009[1][arg2][arg3] & 0x2) == 2) {
            var19 = arg0 + 1;
        }
        Statics.method3103(arg0, var19, arg2, arg3, arg4, arg5, arg6, Statics.field3022, field685[arg0]);
    }

    @ObfuscatedName("jv.iw(III)V")
    public static final void method5043(int arg0, int arg1) {
        class356 var2 = field642[Statics.field1370][arg0][arg1];
        if (var2 == null) {
            Statics.field3022.method4264(Statics.field1370, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class100 var5 = null;
        for (class100 var6 = (class100) var2.method6241(); var6 != null; var6 = (class100) var2.method6248()) {
            class201 var7 = class201.method2583(var6.field1326);
            long var8 = (long) var7.field2248;
            if (var7.field2228 == 1) {
                var8 *= var6.field1325 < Integer.MAX_VALUE ? (long) (var6.field1325 + 1) : (long) var6.field1325;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field3022.method4264(Statics.field1370, arg0, arg1);
            return;
        }
        var2.method6237(var5);
        class100 var10 = null;
        class100 var11 = null;
        for (class100 var12 = (class100) var2.method6241(); var12 != null; var12 = (class100) var2.method6248()) {
            if (var5.field1326 != var12.field1326) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1326 != var12.field1326 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        long var13 = class229.method3883(arg0, arg1, 3, false, 0);
        Statics.field3022.method4119(Statics.field1370, arg0, arg1, method6114(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1370), var5, var13, var10, var11);
    }

    @ObfuscatedName("jv.ii(ZLru;I)V")
    public static final void method5042(boolean arg0, class473 arg1) {
        field635 = 0;
        field558 = 0;
        method214(arg1);
        while (true) {
            int var2 = Statics.field3308 ? 16 : 15;
            int var3 = 0x1 << var2;
            if (arg1.method7916(field689.field1394) < var2 + 12) {
                break;
            }
            int var4 = arg1.method7923(var2);
            if (var3 - 1 == var4) {
                break;
            }
            boolean var70 = false;
            if (field683[var4] == null) {
                field683[var4] = new class96();
                var70 = true;
            }
            class96 var71 = field683[var4];
            field557[++field556 - 1] = var4;
            var71.field1219 = field511;
            int var73;
            int var76;
            int var77;
            if (Statics.field3308) {
                int var72 = field624[arg1.method7923(3)];
                if (var70) {
                    var71.field1227 = var71.field1202 = var72;
                }
                if (arg0) {
                    var73 = arg1.method7923(8);
                    if (var73 > 127) {
                        var73 -= 256;
                    }
                } else {
                    var73 = arg1.method7923(5);
                    if (var73 > 15) {
                        var73 -= 32;
                    }
                }
                int var74 = arg1.method7923(1);
                if (var74 == 1) {
                    field559[++field558 - 1] = var4;
                }
                boolean var75 = arg1.method7923(1) == 1;
                if (var75) {
                    arg1.method7923(32);
                }
                var76 = arg1.method7923(1);
                if (arg0) {
                    var77 = arg1.method7923(8);
                    if (var77 > 127) {
                        var77 -= 256;
                    }
                } else {
                    var77 = arg1.method7923(5);
                    if (var77 > 15) {
                        var77 -= 32;
                    }
                }
                var71.field1295 = class191.method2988(arg1.method7923(14));
            } else {
                if (arg0) {
                    var77 = arg1.method7923(8);
                    if (var77 > 127) {
                        var77 -= 256;
                    }
                } else {
                    var77 = arg1.method7923(5);
                    if (var77 > 15) {
                        var77 -= 32;
                    }
                }
                var71.field1295 = class191.method2988(arg1.method7923(14));
                boolean var78 = arg1.method7923(1) == 1;
                if (var78) {
                    arg1.method7923(32);
                }
                int var79 = arg1.method7923(1);
                if (var79 == 1) {
                    field559[++field558 - 1] = var4;
                }
                int var80 = field624[arg1.method7923(3)];
                if (var70) {
                    var71.field1227 = var71.field1202 = var80;
                }
                if (arg0) {
                    var73 = arg1.method7923(8);
                    if (var73 > 127) {
                        var73 -= 256;
                    }
                } else {
                    var73 = arg1.method7923(5);
                    if (var73 > 15) {
                        var73 -= 32;
                    }
                }
                var76 = arg1.method7923(1);
            }
            method4910(var71);
            if (var71.field1229 == 0) {
                var71.field1202 = 0;
            }
            var71.method2501(Statics.field4508.field1210[0] + var73, Statics.field4508.field1232[0] + var77, var76 == 1);
        }
        arg1.method7910();
        for (int var5 = 0; var5 < field558; var5++) {
            int var6 = field559[var5];
            class96 var7 = field683[var6];
            int var8 = arg1.method7964();
            if ((var8 & 0x2) != 0) {
                int var9 = arg1.method7964();
                var8 += var9 << 8;
            }
            if ((var8 & 0x4000) != 0) {
                int var10 = arg1.method7964();
                var8 += var10 << 16;
            }
            if ((var8 & 0x10) != 0) {
                var7.field1194 = arg1.method8039();
                int var11;
                if (Statics.field3308) {
                    var7.field1194 += arg1.method7998() << 16;
                    var11 = 16777215;
                } else {
                    var11 = 65535;
                }
                if (var7.field1194 == var11) {
                    var7.field1194 = -1;
                }
            }
            if ((var8 & 0x40) != 0) {
                int var12 = arg1.method8039();
                if (var12 == 65535) {
                    var12 = -1;
                }
                int var13 = arg1.method7996();
                if (var7.field1224 == var12 && var12 != -1) {
                    int var14 = class203.method2227(var12).field2309;
                    if (var14 == 1) {
                        var7.field1170 = 0;
                        var7.field1171 = 0;
                        var7.field1205 = var13;
                        var7.field1206 = 0;
                    }
                    if (var14 == 2) {
                        var7.field1206 = 0;
                    }
                } else if (var12 == -1 || var7.field1224 == -1 || class203.method2227(var12).field2293 >= class203.method2227(var7.field1224).field2293) {
                    var7.field1224 = var12;
                    var7.field1170 = 0;
                    var7.field1171 = 0;
                    var7.field1205 = var13;
                    var7.field1206 = 0;
                    var7.field1231 = var7.field1230;
                }
            }
            if ((var8 & 0x1000) != 0) {
                var7.method2498(arg1.method7964());
            }
            if ((var8 & 0x8000) != 0) {
                int var15 = arg1.method7998();
                if ((var15 & 0x1) == 1) {
                    var7.method2510();
                } else {
                    int[] var16 = null;
                    if ((var15 & 0x2) == 2) {
                        int var17 = arg1.method7964();
                        var16 = new int[var17];
                        for (int var18 = 0; var18 < var17; var18++) {
                            int var19 = arg1.method8050();
                            int var20 = var19 == 65535 ? -1 : var19;
                            var16[var18] = var20;
                        }
                    }
                    short[] var21 = null;
                    if ((var15 & 0x4) == 4) {
                        int var22 = 0;
                        if (var7.field1295.field2063 != null) {
                            var22 = var7.field1295.field2063.length;
                        }
                        var21 = new short[var22];
                        for (int var23 = 0; var23 < var22; var23++) {
                            var21[var23] = (short) arg1.method8032();
                        }
                    }
                    short[] var24 = null;
                    if ((var15 & 0x8) == 8) {
                        int var25 = 0;
                        if (var7.field1295.field2024 != null) {
                            var25 = var7.field1295.field2024.length;
                        }
                        var24 = new short[var25];
                        for (int var26 = 0; var26 < var25; var26++) {
                            var24[var26] = (short) arg1.method8039();
                        }
                    }
                    long var27 = (long) (++class96.field1296 - 1);
                    var7.method2514(new class190(var27, var16, var21, var24));
                }
            }
            if ((var8 & 0x100) != 0) {
                var7.field1212 = arg1.method8195();
                var7.field1214 = arg1.method8106();
                var7.field1213 = arg1.method7999();
                var7.field1215 = arg1.method8195();
                var7.field1216 = arg1.method8032() + field511;
                var7.field1190 = arg1.method8032() + field511;
                var7.field1218 = arg1.method8050();
                var7.field1230 = 1;
                var7.field1231 = 0;
                var7.field1212 += var7.field1210[0];
                var7.field1214 += var7.field1232[0];
                var7.field1213 += var7.field1210[0];
                var7.field1215 += var7.field1232[0];
            }
            if ((var8 & 0x80) != 0) {
                int var29 = arg1.method8039();
                int var30 = arg1.method8050();
                var7.field1197 = arg1.method7964() == 1;
                int var31 = var7.field1204 - (var29 - Statics.field2118 - Statics.field2118) * 64;
                int var32 = var7.field1161 - (var30 - Statics.field565 - Statics.field565) * 64;
                if (var31 != 0 || var32 != 0) {
                    var7.field1196 = (int) (Math.atan2((double) var31, (double) var32) * 325.949D) & 0x7FF;
                }
            }
            if ((var8 & 0x800) != 0) {
                var7.field1221 = arg1.method7979();
            }
            if ((var8 & 0x20000) != 0) {
                int var33 = arg1.method7964();
                int[] var34 = new int[8];
                short[] var35 = new short[8];
                for (int var36 = 0; var36 < 8; var36++) {
                    if ((var33 & 0x1 << var36) == 0) {
                        var34[var36] = -1;
                        var35[var36] = -1;
                    } else {
                        var34[var36] = arg1.method8029();
                        var35[var36] = (short) arg1.method7980();
                    }
                }
                var7.method2496(var34, var35);
            }
            if ((var8 & 0x400) != 0) {
                var7.method2497(arg1.method7983());
            }
            if ((var8 & 0x10000) != 0) {
                int var37 = arg1.method8020();
                var7.field1217 = (var37 & 0x1) == 0 ? var7.field1295.field2034 : arg1.method8034();
                var7.field1168 = (var37 & 0x2) == 0 ? var7.field1295.field2035 : arg1.method8034();
                var7.field1223 = (var37 & 0x4) == 0 ? var7.field1295.field2061 : arg1.method8034();
                var7.field1183 = (var37 & 0x8) == 0 ? var7.field1295.field2037 : arg1.method8039();
                var7.field1203 = (var37 & 0x10) == 0 ? var7.field1295.field2038 : arg1.method8034();
                var7.field1172 = (var37 & 0x20) == 0 ? var7.field1295.field2039 : arg1.method8034();
                var7.field1235 = (var37 & 0x40) == 0 ? var7.field1295.field2040 : arg1.method8032();
                var7.field1174 = (var37 & 0x80) == 0 ? var7.field1295.field2041 : arg1.method8032();
                var7.field1175 = (var37 & 0x100) == 0 ? var7.field1295.field2060 : arg1.method8039();
                var7.field1169 = (var37 & 0x200) == 0 ? var7.field1295.field2043 : arg1.method8034();
                var7.field1188 = (var37 & 0x400) == 0 ? var7.field1295.field2044 : arg1.method8039();
                var7.field1173 = (var37 & 0x800) == 0 ? var7.field1295.field2066 : arg1.method8032();
                var7.field1179 = (var37 & 0x1000) == 0 ? var7.field1295.field2046 : arg1.method8050();
                var7.field1180 = (var37 & 0x2000) == 0 ? var7.field1295.field2058 : arg1.method8039();
                var7.field1166 = (var37 & 0x4000) == 0 ? var7.field1295.field2048 : arg1.method8034();
            }
            if ((var8 & 0x20) != 0) {
                int var38 = arg1.method7964();
                if (var38 > 0) {
                    for (int var39 = 0; var39 < var38; var39++) {
                        int var40 = -1;
                        int var41 = -1;
                        int var42 = -1;
                        int var43 = arg1.method8059();
                        if (var43 == 32767) {
                            var43 = arg1.method8059();
                            var41 = arg1.method8059();
                            var40 = arg1.method8059();
                            var42 = arg1.method8059();
                        } else if (var43 == 32766) {
                            var43 = -1;
                        } else {
                            var41 = arg1.method8059();
                        }
                        int var44 = arg1.method8059();
                        var7.method2317(var43, var41, var40, var42, field511, var44);
                    }
                }
                int var45 = arg1.method7998();
                if (var45 > 0) {
                    for (int var46 = 0; var46 < var45; var46++) {
                        int var47 = arg1.method8059();
                        int var48 = arg1.method8059();
                        if (var48 == 32767) {
                            var7.method2310(var47);
                        } else {
                            int var49 = arg1.method8059();
                            int var50 = arg1.method7997();
                            int var51 = var48 > 0 ? arg1.method7997() : var50;
                            var7.method2313(var47, field511, var48, var49, var50, var51);
                        }
                    }
                }
            }
            if ((var8 & 0x8) != 0) {
                var7.field1195 = arg1.method7983();
                var7.field1184 = 100;
            }
            if ((var8 & 0x200) != 0) {
                var7.field1177 = field511 + arg1.method8050();
                var7.field1222 = field511 + arg1.method8032();
                var7.field1181 = arg1.method7965();
                var7.field1228 = arg1.method8106();
                var7.field1225 = arg1.method7999();
                var7.field1226 = (byte) arg1.method7998();
            }
            if ((var8 & 0x1) != 0) {
                var7.field1207 = arg1.method8050();
                int var52 = arg1.method7979();
                var7.field1211 = var52 >> 16;
                var7.field1208 = (var52 & 0xFFFF) + field511;
                var7.field1199 = 0;
                var7.field1209 = 0;
                if (var7.field1208 > field511) {
                    var7.field1199 = -1;
                }
                if (var7.field1207 == 65535) {
                    var7.field1207 = -1;
                }
            }
            if ((var8 & 0x2000) != 0) {
                int var53 = arg1.method7998();
                if ((var53 & 0x1) == 1) {
                    var7.method2548();
                } else {
                    int[] var54 = null;
                    if ((var53 & 0x2) == 2) {
                        int var55 = arg1.method7998();
                        var54 = new int[var55];
                        for (int var56 = 0; var56 < var55; var56++) {
                            int var57 = arg1.method8034();
                            int var58 = var57 == 65535 ? -1 : var57;
                            var54[var56] = var58;
                        }
                    }
                    short[] var59 = null;
                    if ((var53 & 0x4) == 4) {
                        int var60 = 0;
                        if (var7.field1295.field2063 != null) {
                            var60 = var7.field1295.field2063.length;
                        }
                        var59 = new short[var60];
                        for (int var61 = 0; var61 < var60; var61++) {
                            var59[var61] = (short) arg1.method8039();
                        }
                    }
                    short[] var62 = null;
                    if ((var53 & 0x8) == 8) {
                        int var63 = 0;
                        if (var7.field1295.field2024 != null) {
                            var63 = var7.field1295.field2024.length;
                        }
                        var62 = new short[var63];
                        for (int var64 = 0; var64 < var63; var64++) {
                            var62[var64] = (short) arg1.method8039();
                        }
                    }
                    long var65 = (long) (++class96.field1297 - 1);
                    var7.method2506(new class190(var65, var54, var59, var62));
                }
            }
            if ((var8 & 0x4) != 0) {
                var7.field1295 = class191.method2988(arg1.method8050());
                method4910(var7);
                var7.method2508();
            }
        }
        for (int var67 = 0; var67 < field635; var67++) {
            int var68 = field636[var67];
            if (field511 != field683[var68].field1219) {
                field683[var68].field1295 = null;
                field683[var68] = null;
            }
        }
        if (field689.field1394 != arg1.field4939) {
            throw new RuntimeException(arg1.field4939 + class97.field1300 + field689.field1394);
        }
        for (int var69 = 0; var69 < field556; var69++) {
            if (field683[field557[var69]] == null) {
                throw new RuntimeException(var69 + class97.field1300 + field556);
            }
        }
    }

    @ObfuscatedName("o.id(Lru;I)V")
    public static final void method214(class473 arg0) {
        arg0.method7935();
        int var1 = arg0.method7923(8);
        if (var1 < field556) {
            for (int var2 = var1; var2 < field556; var2++) {
                field636[++field635 - 1] = field557[var2];
            }
        }
        if (var1 > field556) {
            throw new RuntimeException("");
        }
        field556 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field557[var3];
            class96 var5 = field683[var4];
            int var6 = arg0.method7923(1);
            if (var6 == 0) {
                field557[++field556 - 1] = var4;
                var5.field1219 = field511;
            } else {
                int var7 = arg0.method7923(2);
                if (var7 == 0) {
                    field557[++field556 - 1] = var4;
                    var5.field1219 = field511;
                    field559[++field558 - 1] = var4;
                } else if (var7 == 1) {
                    field557[++field556 - 1] = var4;
                    var5.field1219 = field511;
                    int var8 = arg0.method7923(3);
                    var5.method2504(var8, class209.field2361);
                    int var9 = arg0.method7923(1);
                    if (var9 == 1) {
                        field559[++field558 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field557[++field556 - 1] = var4;
                    var5.field1219 = field511;
                    if (arg0.method7923(1) == 1) {
                        int var10 = arg0.method7923(3);
                        var5.method2504(var10, class209.field2363);
                        int var11 = arg0.method7923(3);
                        var5.method2504(var11, class209.field2363);
                    } else {
                        int var12 = arg0.method7923(3);
                        var5.method2504(var12, class209.field2367);
                    }
                    int var13 = arg0.method7923(1);
                    if (var13 == 1) {
                        field559[++field558 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field636[++field635 - 1] = var4;
                }
            }
        }
    }

    @ObfuscatedName("ie.ic(Lcf;I)V")
    public static void method4910(class96 arg0) {
        arg0.field1164 = arg0.field1295.field2030;
        arg0.field1229 = arg0.field1295.field2031;
        arg0.field1223 = arg0.field1295.field2061;
        arg0.field1183 = arg0.field1295.field2037;
        arg0.field1203 = arg0.field1295.field2038;
        arg0.field1172 = arg0.field1295.field2039;
        arg0.field1166 = arg0.field1295.field2048;
        arg0.field1217 = arg0.field1295.field2034;
        arg0.field1168 = arg0.field1295.field2035;
        arg0.field1235 = arg0.field1295.field2040;
        arg0.field1174 = arg0.field1295.field2041;
        arg0.field1175 = arg0.field1295.field2060;
        arg0.field1169 = arg0.field1295.field2043;
        arg0.field1188 = arg0.field1295.field2044;
        arg0.field1173 = arg0.field1295.field2066;
        arg0.field1179 = arg0.field1295.field2046;
        arg0.field1180 = arg0.field1295.field2058;
    }

    @ObfuscatedName("mv.it(Lcl;IILhz;I)V")
    public static final void method6145(class88 arg0, int arg1, int arg2, class209 arg3) {
        int var4 = arg0.field1210[0];
        int var5 = arg0.field1232[0];
        int var6 = arg0.method2251();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var7 = arg0.method2251();
        class208 var8 = method5890(arg1, arg2);
        class207 var9 = field685[arg0.field1128];
        int[] var10 = field803;
        int[] var11 = field786;
        for (int var12 = 0; var12 < 128; var12++) {
            for (int var13 = 0; var13 < 128; var13++) {
                class210.field2368[var12][var13] = 0;
                class210.field2371[var12][var13] = 99999999;
            }
        }
        boolean var14;
        if (var7 == 1) {
            var14 = class210.method3034(var4, var5, var8, var9);
        } else if (var7 == 2) {
            int var15 = var4;
            int var16 = var5;
            byte var17 = 64;
            byte var18 = 64;
            int var19 = var4 - var17;
            int var20 = var5 - var18;
            class210.field2368[var17][var18] = 99;
            class210.field2371[var17][var18] = 0;
            byte var21 = 0;
            int var22 = 0;
            class210.field2369[var21] = var4;
            int var78 = var21 + 1;
            class210.field2375[var21] = var5;
            int[][] var23 = var9.field2354;
            boolean var28;
            while (true) {
                if (var78 == var22) {
                    Statics.field2372 = var15;
                    Statics.field2373 = var16;
                    var28 = false;
                    break;
                }
                var15 = class210.field2369[var22];
                var16 = class210.field2375[var22];
                var22 = var22 + 1 & 0xFFF;
                int var24 = var15 - var19;
                int var25 = var16 - var20;
                int var26 = var15 - var9.field2343;
                int var27 = var16 - var9.field2351;
                if (var8.method1128(2, var15, var16, var9)) {
                    Statics.field2372 = var15;
                    Statics.field2373 = var16;
                    var28 = true;
                    break;
                }
                int var29 = class210.field2371[var24][var25] + 1;
                if (var24 > 0 && class210.field2368[var24 - 1][var25] == 0 && (var23[var26 - 1][var27] & 0x124010E) == 0 && (var23[var26 - 1][var27 + 1] & 0x1240138) == 0) {
                    class210.field2369[var78] = var15 - 1;
                    class210.field2375[var78] = var16;
                    var78 = var78 + 1 & 0xFFF;
                    class210.field2368[var24 - 1][var25] = 2;
                    class210.field2371[var24 - 1][var25] = var29;
                }
                if (var24 < 126 && class210.field2368[var24 + 1][var25] == 0 && (var23[var26 + 2][var27] & 0x1240183) == 0 && (var23[var26 + 2][var27 + 1] & 0x12401E0) == 0) {
                    class210.field2369[var78] = var15 + 1;
                    class210.field2375[var78] = var16;
                    var78 = var78 + 1 & 0xFFF;
                    class210.field2368[var24 + 1][var25] = 8;
                    class210.field2371[var24 + 1][var25] = var29;
                }
                if (var25 > 0 && class210.field2368[var24][var25 - 1] == 0 && (var23[var26][var27 - 1] & 0x124010E) == 0 && (var23[var26 + 1][var27 - 1] & 0x1240183) == 0) {
                    class210.field2369[var78] = var15;
                    class210.field2375[var78] = var16 - 1;
                    var78 = var78 + 1 & 0xFFF;
                    class210.field2368[var24][var25 - 1] = 1;
                    class210.field2371[var24][var25 - 1] = var29;
                }
                if (var25 < 126 && class210.field2368[var24][var25 + 1] == 0 && (var23[var26][var27 + 2] & 0x1240138) == 0 && (var23[var26 + 1][var27 + 2] & 0x12401E0) == 0) {
                    class210.field2369[var78] = var15;
                    class210.field2375[var78] = var16 + 1;
                    var78 = var78 + 1 & 0xFFF;
                    class210.field2368[var24][var25 + 1] = 4;
                    class210.field2371[var24][var25 + 1] = var29;
                }
                if (var24 > 0 && var25 > 0 && class210.field2368[var24 - 1][var25 - 1] == 0 && (var23[var26 - 1][var27] & 0x124013E) == 0 && (var23[var26 - 1][var27 - 1] & 0x124010E) == 0 && (var23[var26][var27 - 1] & 0x124018F) == 0) {
                    class210.field2369[var78] = var15 - 1;
                    class210.field2375[var78] = var16 - 1;
                    var78 = var78 + 1 & 0xFFF;
                    class210.field2368[var24 - 1][var25 - 1] = 3;
                    class210.field2371[var24 - 1][var25 - 1] = var29;
                }
                if (var24 < 126 && var25 > 0 && class210.field2368[var24 + 1][var25 - 1] == 0 && (var23[var26 + 1][var27 - 1] & 0x124018F) == 0 && (var23[var26 + 2][var27 - 1] & 0x1240183) == 0 && (var23[var26 + 2][var27] & 0x12401E3) == 0) {
                    class210.field2369[var78] = var15 + 1;
                    class210.field2375[var78] = var16 - 1;
                    var78 = var78 + 1 & 0xFFF;
                    class210.field2368[var24 + 1][var25 - 1] = 9;
                    class210.field2371[var24 + 1][var25 - 1] = var29;
                }
                if (var24 > 0 && var25 < 126 && class210.field2368[var24 - 1][var25 + 1] == 0 && (var23[var26 - 1][var27 + 1] & 0x124013E) == 0 && (var23[var26 - 1][var27 + 2] & 0x1240138) == 0 && (var23[var26][var27 + 2] & 0x12401F8) == 0) {
                    class210.field2369[var78] = var15 - 1;
                    class210.field2375[var78] = var16 + 1;
                    var78 = var78 + 1 & 0xFFF;
                    class210.field2368[var24 - 1][var25 + 1] = 6;
                    class210.field2371[var24 - 1][var25 + 1] = var29;
                }
                if (var24 < 126 && var25 < 126 && class210.field2368[var24 + 1][var25 + 1] == 0 && (var23[var26 + 1][var27 + 2] & 0x12401F8) == 0 && (var23[var26 + 2][var27 + 2] & 0x12401E0) == 0 && (var23[var26 + 2][var27 + 1] & 0x12401E3) == 0) {
                    class210.field2369[var78] = var15 + 1;
                    class210.field2375[var78] = var16 + 1;
                    var78 = var78 + 1 & 0xFFF;
                    class210.field2368[var24 + 1][var25 + 1] = 12;
                    class210.field2371[var24 + 1][var25 + 1] = var29;
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
            class210.field2368[var32][var33] = 99;
            class210.field2371[var32][var33] = 0;
            byte var36 = 0;
            int var37 = 0;
            class210.field2369[var36] = var4;
            int var79 = var36 + 1;
            class210.field2375[var36] = var5;
            int[][] var38 = var9.field2354;
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
                                        Statics.field2372 = var30;
                                        Statics.field2373 = var31;
                                        var43 = false;
                                        break label550;
                                    }
                                    var30 = class210.field2369[var37];
                                    var31 = class210.field2375[var37];
                                    var37 = var37 + 1 & 0xFFF;
                                    var39 = var30 - var34;
                                    var40 = var31 - var35;
                                    var41 = var30 - var9.field2343;
                                    var42 = var31 - var9.field2351;
                                    if (var8.method1128(var7, var30, var31, var9)) {
                                        Statics.field2372 = var30;
                                        Statics.field2373 = var31;
                                        var43 = true;
                                        break label550;
                                    }
                                    var44 = class210.field2371[var39][var40] + 1;
                                    if (var39 > 0 && class210.field2368[var39 - 1][var40] == 0 && (var38[var41 - 1][var42] & 0x124010E) == 0 && (var38[var41 - 1][var7 + var42 - 1] & 0x1240138) == 0) {
                                        int var45 = 1;
                                        while (true) {
                                            if (var45 >= var7 - 1) {
                                                class210.field2369[var79] = var30 - 1;
                                                class210.field2375[var79] = var31;
                                                var79 = var79 + 1 & 0xFFF;
                                                class210.field2368[var39 - 1][var40] = 2;
                                                class210.field2371[var39 - 1][var40] = var44;
                                                break;
                                            }
                                            if ((var38[var41 - 1][var42 + var45] & 0x124013E) != 0) {
                                                break;
                                            }
                                            var45++;
                                        }
                                    }
                                    if (var39 < 128 - var7 && class210.field2368[var39 + 1][var40] == 0 && (var38[var7 + var41][var42] & 0x1240183) == 0 && (var38[var7 + var41][var7 + var42 - 1] & 0x12401E0) == 0) {
                                        int var46 = 1;
                                        while (true) {
                                            if (var46 >= var7 - 1) {
                                                class210.field2369[var79] = var30 + 1;
                                                class210.field2375[var79] = var31;
                                                var79 = var79 + 1 & 0xFFF;
                                                class210.field2368[var39 + 1][var40] = 8;
                                                class210.field2371[var39 + 1][var40] = var44;
                                                break;
                                            }
                                            if ((var38[var7 + var41][var42 + var46] & 0x12401E3) != 0) {
                                                break;
                                            }
                                            var46++;
                                        }
                                    }
                                    if (var40 > 0 && class210.field2368[var39][var40 - 1] == 0 && (var38[var41][var42 - 1] & 0x124010E) == 0 && (var38[var7 + var41 - 1][var42 - 1] & 0x1240183) == 0) {
                                        int var47 = 1;
                                        while (true) {
                                            if (var47 >= var7 - 1) {
                                                class210.field2369[var79] = var30;
                                                class210.field2375[var79] = var31 - 1;
                                                var79 = var79 + 1 & 0xFFF;
                                                class210.field2368[var39][var40 - 1] = 1;
                                                class210.field2371[var39][var40 - 1] = var44;
                                                break;
                                            }
                                            if ((var38[var41 + var47][var42 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var47++;
                                        }
                                    }
                                    if (var40 < 128 - var7 && class210.field2368[var39][var40 + 1] == 0 && (var38[var41][var7 + var42] & 0x1240138) == 0 && (var38[var7 + var41 - 1][var7 + var42] & 0x12401E0) == 0) {
                                        int var48 = 1;
                                        while (true) {
                                            if (var48 >= var7 - 1) {
                                                class210.field2369[var79] = var30;
                                                class210.field2375[var79] = var31 + 1;
                                                var79 = var79 + 1 & 0xFFF;
                                                class210.field2368[var39][var40 + 1] = 4;
                                                class210.field2371[var39][var40 + 1] = var44;
                                                break;
                                            }
                                            if ((var38[var41 + var48][var7 + var42] & 0x12401F8) != 0) {
                                                break;
                                            }
                                            var48++;
                                        }
                                    }
                                    if (var39 > 0 && var40 > 0 && class210.field2368[var39 - 1][var40 - 1] == 0 && (var38[var41 - 1][var42 - 1] & 0x124010E) == 0) {
                                        int var49 = 1;
                                        while (true) {
                                            if (var49 >= var7) {
                                                class210.field2369[var79] = var30 - 1;
                                                class210.field2375[var79] = var31 - 1;
                                                var79 = var79 + 1 & 0xFFF;
                                                class210.field2368[var39 - 1][var40 - 1] = 3;
                                                class210.field2371[var39 - 1][var40 - 1] = var44;
                                                break;
                                            }
                                            if ((var38[var41 - 1][var42 - 1 + var49] & 0x124013E) != 0 || (var38[var41 - 1 + var49][var42 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var49++;
                                        }
                                    }
                                    if (var39 < 128 - var7 && var40 > 0 && class210.field2368[var39 + 1][var40 - 1] == 0 && (var38[var7 + var41][var42 - 1] & 0x1240183) == 0) {
                                        int var50 = 1;
                                        while (true) {
                                            if (var50 >= var7) {
                                                class210.field2369[var79] = var30 + 1;
                                                class210.field2375[var79] = var31 - 1;
                                                var79 = var79 + 1 & 0xFFF;
                                                class210.field2368[var39 + 1][var40 - 1] = 9;
                                                class210.field2371[var39 + 1][var40 - 1] = var44;
                                                break;
                                            }
                                            if ((var38[var7 + var41][var42 - 1 + var50] & 0x12401E3) != 0 || (var38[var41 + var50][var42 - 1] & 0x124018F) != 0) {
                                                break;
                                            }
                                            var50++;
                                        }
                                    }
                                    if (var39 > 0 && var40 < 128 - var7 && class210.field2368[var39 - 1][var40 + 1] == 0 && (var38[var41 - 1][var7 + var42] & 0x1240138) == 0) {
                                        for (int var51 = 1; var51 < var7; var51++) {
                                            if ((var38[var41 - 1][var42 + var51] & 0x124013E) != 0 || (var38[var41 - 1 + var51][var7 + var42] & 0x12401F8) != 0) {
                                                continue label525;
                                            }
                                        }
                                        class210.field2369[var79] = var30 - 1;
                                        class210.field2375[var79] = var31 + 1;
                                        var79 = var79 + 1 & 0xFFF;
                                        class210.field2368[var39 - 1][var40 + 1] = 6;
                                        class210.field2371[var39 - 1][var40 + 1] = var44;
                                    }
                                } while (var39 >= 128 - var7);
                            } while (var40 >= 128 - var7);
                        } while (class210.field2368[var39 + 1][var40 + 1] != 0);
                    } while ((var38[var7 + var41][var7 + var42] & 0x12401E0) != 0);
                    for (int var52 = 1; var52 < var7; var52++) {
                        if ((var38[var41 + var52][var7 + var42] & 0x12401F8) != 0 || (var38[var7 + var41][var42 + var52] & 0x12401E3) != 0) {
                            continue label548;
                        }
                    }
                    class210.field2369[var79] = var30 + 1;
                    class210.field2375[var79] = var31 + 1;
                    var79 = var79 + 1 & 0xFFF;
                    class210.field2368[var39 + 1][var40 + 1] = 12;
                    class210.field2371[var39 + 1][var40 + 1] = var44;
                }
            }
            var14 = var43;
        }
        int var71;
        label606: {
            int var53 = var4 - 64;
            int var54 = var5 - 64;
            int var55 = Statics.field2372;
            int var56 = Statics.field2373;
            if (!var14) {
                int var57 = Integer.MAX_VALUE;
                int var58 = Integer.MAX_VALUE;
                byte var59 = 10;
                int var60 = var8.field2356;
                int var61 = var8.field2357;
                int var62 = var8.field2359;
                int var63 = var8.field2358;
                for (int var64 = var60 - var59; var64 <= var59 + var60; var64++) {
                    for (int var65 = var61 - var59; var65 <= var59 + var61; var65++) {
                        int var66 = var64 - var53;
                        int var67 = var65 - var54;
                        if (var66 >= 0 && var67 >= 0 && var66 < 128 && var67 < 128 && class210.field2371[var66][var67] < 100) {
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
                            if (var70 < var57 || var57 == var70 && class210.field2371[var66][var67] < var58) {
                                var57 = var70;
                                var58 = class210.field2371[var66][var67];
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
                var10[0] = var55;
                var11[0] = var56;
                var71 = 0;
            } else {
                byte var72 = 0;
                class210.field2369[var72] = var55;
                int var80 = var72 + 1;
                class210.field2375[var72] = var56;
                int var73;
                int var74 = var73 = class210.field2368[var55 - var53][var56 - var54];
                while (var4 != var55 || var5 != var56) {
                    if (var73 != var74) {
                        var73 = var74;
                        class210.field2369[var80] = var55;
                        class210.field2375[var80++] = var56;
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
                    var74 = class210.field2368[var55 - var53][var56 - var54];
                }
                int var75 = 0;
                while (var80-- > 0) {
                    var10[var75] = class210.field2369[var80];
                    var11[var75++] = class210.field2375[var80];
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
                arg0.method2280(field803[var77], field786[var77], arg3);
            }
        }
    }

    @ObfuscatedName("lz.iv(III)Lgt;")
    public static class208 method5890(int arg0, int arg1) {
        field545.field2356 = arg0;
        field545.field2357 = arg1;
        field545.field2359 = 1;
        field545.field2358 = 1;
        return field545;
    }

    @ObfuscatedName("bl.iq(I)V")
    public static void method1089() {
        field651 = 0;
        field650 = false;
    }

    @ObfuscatedName("fa.ig(I)V")
    public static void method3259() {
        method1089();
        field720[0] = class330.field4097;
        field658[0] = "";
        field654[0] = 1006;
        field659[0] = false;
        field651 = 1;
    }

    @ObfuscatedName("gn.ir(B)V")
    public static final void method3552() {
        int var0 = Statics.field1589;
        int var1 = Statics.field4336;
        int var2 = Statics.field28;
        int var3 = Statics.field4173;
        int var4 = 6116423;
        class484.method8296(var0, var1, var2, var3, var4);
        class484.method8296(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class484.method8300(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field109.method6634(class330.field4124, var0 + 3, var1 + 14, var4, -1);
        int var5 = class36.field251;
        int var6 = class36.field252;
        for (int var7 = 0; var7 < field651; var7++) {
            int var8 = (field651 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            Statics.field109.method6634(method7145(var7), var0 + 3, var8, var9, 0);
        }
        method65(Statics.field1589, Statics.field4336, Statics.field28, Statics.field4173);
    }

    @ObfuscatedName("ku.ib(I)Z")
    public static final boolean method5084() {
        return field650;
    }

    @ObfuscatedName("n.is(IIIIB)V")
    public static final void method65(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field724; var4++) {
            if (field731[var4] + field729[var4] > arg0 && field729[var4] < arg0 + arg2 && field640[var4] + field571[var4] > arg1 && field571[var4] < arg1 + arg3) {
                field679[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.ik(B)V")
    public final void method1487() {
        method2936();
        if (Statics.field2823 != null || field688 != null) {
            return;
        }
        int var1 = class36.field262;
        if (field650) {
            if (var1 != 1 && (Statics.field4559 || var1 != 4)) {
                int var2 = class36.field251;
                int var3 = class36.field252;
                if (var2 < Statics.field1589 - 10 || var2 > Statics.field28 + Statics.field1589 + 10 || var3 < Statics.field4336 - 10 || var3 > Statics.field4336 + Statics.field4173 + 10) {
                    field650 = false;
                    Statics.method6216(Statics.field1589, Statics.field4336, Statics.field28, Statics.field4173);
                }
            }
            if (var1 == 1 || !Statics.field4559 && var1 == 4) {
                int var4 = Statics.field1589;
                int var5 = Statics.field4336;
                int var6 = Statics.field28;
                int var7 = class36.field259;
                int var8 = class36.field260;
                int var9 = -1;
                for (int var10 = 0; var10 < field651; var10++) {
                    int var11 = (field651 - 1 - var10) * 15 + var5 + 31;
                    if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
                        var9 = var10;
                    }
                }
                if (var9 != -1) {
                    method3969(var9);
                }
                field650 = false;
                Statics.method6216(Statics.field1589, Statics.field4336, Statics.field28, Statics.field4173);
            }
            return;
        }
        int var12 = field651 - 1;
        if ((var1 == 1 || !Statics.field4559 && var1 == 4) && var12 >= 0) {
            int var14 = field654[var12];
            if (var14 == 39 || var14 == 40 || var14 == 41 || var14 == 42 || var14 == 43 || var14 == 33 || var14 == 34 || var14 == 35 || var14 == 36 || var14 == 37 || var14 == 38 || var14 == 1005) {
                int var15 = field652[var12];
                int var16 = field758[var12];
                class310 var17 = class310.method2952(var16);
                if (class311.method4460(method3252(var17)) || class311.method209(method3252(var17))) {
                    if (Statics.field2823 != null && !field625 && field651 > 0 && !this.method1168()) {
                        method5886(field622, field623);
                    }
                    field625 = false;
                    field626 = 0;
                    if (Statics.field2823 != null) {
                        method2361(Statics.field2823);
                    }
                    Statics.field2823 = class310.method2952(var16);
                    field728 = var15;
                    field622 = class36.field259;
                    field623 = class36.field260;
                    if (var12 >= 0) {
                        method485(var12);
                    }
                    method2361(Statics.field2823);
                    return;
                }
            }
        }
        if ((var1 == 1 || !Statics.field4559 && var1 == 4) && this.method1168()) {
            var1 = 2;
        }
        if ((var1 == 1 || !Statics.field4559 && var1 == 4) && field651 > 0) {
            method3969(var12);
        }
        if (var1 == 2 && field651 > 0) {
            this.method1282(class36.field259, class36.field260);
        }
    }

    @ObfuscatedName("client.iy(I)Z")
    public final boolean method1168() {
        int var1 = field651 - 1;
        return (field649 && field651 > 2 || method7211(var1)) && !field659[var1];
    }

    @ObfuscatedName("client.il(IIS)V")
    public final void method1282(int arg0, int arg1) {
        method5036(arg0, arg1);
        int var3 = arg0 - field496;
        int var4 = arg1 - field783;
        Statics.field3022.method4213(Statics.field1370, var3, var4, false);
        field650 = true;
    }

    @ObfuscatedName("jo.in(IIB)V")
    public static void method5036(int arg0, int arg1) {
        int var2 = Statics.field109.method6629(class330.field4124);
        for (int var3 = 0; var3 < field651; var3++) {
            int var4 = Statics.field109.method6629(method7145(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field651 * 15 + 22;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > Statics.field220) {
            var6 = Statics.field220 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > Statics.field1559) {
            var7 = Statics.field1559 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        Statics.field1589 = var6;
        Statics.field4336 = var7;
        Statics.field28 = var2;
        Statics.field4173 = field651 * 15 + 22;
    }

    @ObfuscatedName("oi.ie(IS)Z")
    public static final boolean method7211(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field654[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("hq.if(II)V")
    public static final void method3969(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field652[arg0];
        int var2 = field758[arg0];
        int var3 = field654[arg0];
        int var4 = field655[arg0];
        int var5 = field656[arg0];
        String var6 = field720[arg0];
        String var7 = field658[arg0];
        method3245(var1, var2, var3, var4, var5, var6, var7, class36.field259, class36.field260);
    }

    @ObfuscatedName("fw.im(IIIIILjava/lang/String;Ljava/lang/String;IIB)V")
    public static final void method3245(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, String arg6, int arg7, int arg8) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 12) {
            class96 var9 = field683[arg3];
            if (var9 != null) {
                field597 = arg7;
                field615 = arg8;
                field617 = 2;
                field616 = 0;
                field755 = arg0;
                field756 = arg1;
                class282 var10 = class282.method4287(class280.field3078, field689.field1390);
                var10.field3187.method7947(field703.method3820(82) ? 1 : 0);
                var10.field3187.method8002(arg3);
                field689.method2694(var10);
            }
        }
        if (arg2 == 1003) {
            field597 = arg7;
            field615 = arg8;
            field617 = 2;
            field616 = 0;
            class96 var11 = field683[arg3];
            if (var11 != null) {
                class191 var12 = var11.field1295;
                if (var12.field2023 != null) {
                    var12 = var12.method3427();
                }
                if (var12 != null) {
                    class282 var13 = class282.method4287(class280.field3082, field689.field1390);
                    var13.field3187.method8002(var12.field2028);
                    field689.method2694(var13);
                }
            }
        }
        if (arg2 == 2) {
            field597 = arg7;
            field615 = arg8;
            field617 = 2;
            field616 = 0;
            field755 = arg0;
            field756 = arg1;
            class282 var14 = class282.method4287(class280.field3104, field689.field1390);
            var14.field3187.method8002(Statics.field565 + arg1);
            var14.field3187.method8004(field515);
            var14.field3187.method8016(Statics.field45);
            var14.field3187.method7947(field703.method3820(82) ? 1 : 0);
            var14.field3187.method7950(Statics.field2118 + arg0);
            var14.field3187.method8002(arg3);
            var14.field3187.method7950(field573);
            field689.method2694(var14);
        }
        if (arg2 == 38) {
            method285();
            class310 var15 = class310.method2952(arg1);
            field668 = 1;
            Statics.field2917 = arg0;
            Statics.field2985 = arg1;
            Statics.field1593 = arg4;
            method2361(var15);
            field669 = class97.method3021(16748608) + class201.method2583(arg4).field2266 + class97.method3021(16777215);
            if (field669 == null) {
                field669 = class330.field3846;
            }
            return;
        }
        if (arg2 == 1) {
            field597 = arg7;
            field615 = arg8;
            field617 = 2;
            field616 = 0;
            field755 = arg0;
            field756 = arg1;
            class282 var16 = class282.method4287(class280.field3157, field689.field1390);
            var16.field3187.method8016(Statics.field2985);
            var16.field3187.method8003(Statics.field2118 + arg0);
            var16.field3187.method8085(field703.method3820(82) ? 1 : 0);
            var16.field3187.method8003(arg3);
            var16.field3187.method8003(Statics.field2917);
            var16.field3187.method8003(Statics.field1593);
            var16.field3187.method8004(Statics.field565 + arg1);
            field689.method2694(var16);
        }
        if (arg2 == 1004) {
            field597 = arg7;
            field615 = arg8;
            field617 = 2;
            field616 = 0;
            class282 var17 = class282.method4287(class280.field3162, field689.field1390);
            var17.field3187.method8002(arg3);
            var17.field3187.method7950(Statics.field2118 + arg0);
            var17.field3187.method8002(Statics.field565 + arg1);
            field689.method2694(var17);
        }
        if (arg2 == 30 && field697 == null) {
            method3814(arg1, arg0);
            field697 = class310.method2979(arg1, arg0);
            method2361(field697);
        }
        if (arg2 == 11) {
            class96 var18 = field683[arg3];
            if (var18 != null) {
                field597 = arg7;
                field615 = arg8;
                field617 = 2;
                field616 = 0;
                field755 = arg0;
                field756 = arg1;
                class282 var19 = class282.method4287(class280.field3132, field689.field1390);
                var19.field3187.method7993(field703.method3820(82) ? 1 : 0);
                var19.field3187.method7950(arg3);
                field689.method2694(var19);
            }
        }
        if (arg2 == 50) {
            class88 var20 = field621[arg3];
            if (var20 != null) {
                field597 = arg7;
                field615 = arg8;
                field617 = 2;
                field616 = 0;
                field755 = arg0;
                field756 = arg1;
                class282 var21 = class282.method4287(class280.field3071, field689.field1390);
                var21.field3187.method8004(arg3);
                var21.field3187.method7993(field703.method3820(82) ? 1 : 0);
                field689.method2694(var21);
            }
        }
        if (arg2 == 6) {
            field597 = arg7;
            field615 = arg8;
            field617 = 2;
            field616 = 0;
            field755 = arg0;
            field756 = arg1;
            class282 var22 = class282.method4287(class280.field3066, field689.field1390);
            var22.field3187.method8003(Statics.field2118 + arg0);
            var22.field3187.method7950(Statics.field565 + arg1);
            var22.field3187.method7950(arg3);
            var22.field3187.method8085(field703.method3820(82) ? 1 : 0);
            field689.method2694(var22);
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field4300.method7518(arg2, arg3, new class301(arg0), new class301(arg1));
        }
        if (arg2 == 22) {
            field597 = arg7;
            field615 = arg8;
            field617 = 2;
            field616 = 0;
            field755 = arg0;
            field756 = arg1;
            class282 var23 = class282.method4287(class280.field3063, field689.field1390);
            var23.field3187.method8002(Statics.field565 + arg1);
            var23.field3187.method7994(field703.method3820(82) ? 1 : 0);
            var23.field3187.method7950(arg3);
            var23.field3187.method8004(Statics.field2118 + arg0);
            field689.method2694(var23);
        }
        if (arg2 == 42) {
            class282 var24 = class282.method4287(class280.field3126, field689.field1390);
            var24.field3187.method7950(arg4);
            var24.field3187.method8002(arg0);
            var24.field3187.method7968(arg1);
            field689.method2694(var24);
            field744 = 0;
            Statics.field4438 = class310.method2952(arg1);
            field620 = arg0;
        }
        if (arg2 == 46) {
            class88 var25 = field621[arg3];
            if (var25 != null) {
                field597 = arg7;
                field615 = arg8;
                field617 = 2;
                field616 = 0;
                field755 = arg0;
                field756 = arg1;
                class282 var26 = class282.method4287(class280.field3158, field689.field1390);
                var26.field3187.method7947(field703.method3820(82) ? 1 : 0);
                var26.field3187.method8003(arg3);
                field689.method2694(var26);
            }
        }
        if (arg2 == 3) {
            field597 = arg7;
            field615 = arg8;
            field617 = 2;
            field616 = 0;
            field755 = arg0;
            field756 = arg1;
            class282 var27 = class282.method4287(class280.field3085, field689.field1390);
            var27.field3187.method7993(field703.method3820(82) ? 1 : 0);
            var27.field3187.method8003(Statics.field2118 + arg0);
            var27.field3187.method8002(arg3);
            var27.field3187.method7950(Statics.field565 + arg1);
            field689.method2694(var27);
        }
        if (arg2 == 43) {
            class282 var28 = class282.method4287(class280.field3106, field689.field1390);
            var28.field3187.method8004(arg4);
            var28.field3187.method8002(arg0);
            var28.field3187.method8048(arg1);
            field689.method2694(var28);
            field744 = 0;
            Statics.field4438 = class310.method2952(arg1);
            field620 = arg0;
        }
        if (arg2 == 33) {
            class282 var29 = class282.method4287(class280.field3139, field689.field1390);
            var29.field3187.method7950(arg0);
            var29.field3187.method8016(arg1);
            var29.field3187.method8004(arg4);
            field689.method2694(var29);
            field744 = 0;
            Statics.field4438 = class310.method2952(arg1);
            field620 = arg0;
        }
        if (arg2 == 14) {
            class88 var30 = field621[arg3];
            if (var30 != null) {
                field597 = arg7;
                field615 = arg8;
                field617 = 2;
                field616 = 0;
                field755 = arg0;
                field756 = arg1;
                class282 var31 = class282.method4287(class280.field3109, field689.field1390);
                var31.field3187.method8004(arg3);
                var31.field3187.method7950(Statics.field1593);
                var31.field3187.method8166(Statics.field2985);
                var31.field3187.method7994(field703.method3820(82) ? 1 : 0);
                var31.field3187.method8003(Statics.field2917);
                field689.method2694(var31);
            }
        }
        if (arg2 == 9) {
            class96 var32 = field683[arg3];
            if (var32 != null) {
                field597 = arg7;
                field615 = arg8;
                field617 = 2;
                field616 = 0;
                field755 = arg0;
                field756 = arg1;
                class282 var33 = class282.method4287(class280.field3146, field689.field1390);
                var33.field3187.method8085(field703.method3820(82) ? 1 : 0);
                var33.field3187.method8003(arg3);
                field689.method2694(var33);
            }
        }
        if (arg2 == 37) {
            class282 var34 = class282.method4287(class280.field3138, field689.field1390);
            var34.field3187.method7950(arg0);
            var34.field3187.method8048(arg1);
            var34.field3187.method8002(arg4);
            field689.method2694(var34);
            field744 = 0;
            Statics.field4438 = class310.method2952(arg1);
            field620 = arg0;
        }
        if (arg2 == 16) {
            field597 = arg7;
            field615 = arg8;
            field617 = 2;
            field616 = 0;
            field755 = arg0;
            field756 = arg1;
            class282 var35 = class282.method4287(class280.field3118, field689.field1390);
            var35.field3187.method8004(arg3);
            var35.field3187.method7993(field703.method3820(82) ? 1 : 0);
            var35.field3187.method8003(Statics.field2917);
            var35.field3187.method8003(Statics.field2118 + arg0);
            var35.field3187.method8016(Statics.field2985);
            var35.field3187.method8002(Statics.field565 + arg1);
            var35.field3187.method8002(Statics.field1593);
            field689.method2694(var35);
        }
        if (arg2 == 15) {
            class88 var36 = field621[arg3];
            if (var36 != null) {
                field597 = arg7;
                field615 = arg8;
                field617 = 2;
                field616 = 0;
                field755 = arg0;
                field756 = arg1;
                class282 var37 = class282.method4287(class280.field3122, field689.field1390);
                var37.field3187.method7993(field703.method3820(82) ? 1 : 0);
                var37.field3187.method8004(arg3);
                var37.field3187.method8048(Statics.field45);
                var37.field3187.method8004(field515);
                var37.field3187.method8003(field573);
                field689.method2694(var37);
            }
        }
        if (arg2 == 4) {
            field597 = arg7;
            field615 = arg8;
            field617 = 2;
            field616 = 0;
            field755 = arg0;
            field756 = arg1;
            class282 var38 = class282.method4287(class280.field3103, field689.field1390);
            var38.field3187.method8003(arg3);
            var38.field3187.method8003(Statics.field2118 + arg0);
            var38.field3187.method7950(Statics.field565 + arg1);
            var38.field3187.method7994(field703.method3820(82) ? 1 : 0);
            field689.method2694(var38);
        }
        if (arg2 == 47) {
            class88 var39 = field621[arg3];
            if (var39 != null) {
                field597 = arg7;
                field615 = arg8;
                field617 = 2;
                field616 = 0;
                field755 = arg0;
                field756 = arg1;
                class282 var40 = class282.method4287(class280.field3150, field689.field1390);
                var40.field3187.method7950(arg3);
                var40.field3187.method7994(field703.method3820(82) ? 1 : 0);
                field689.method2694(var40);
            }
        }
        if (arg2 == 48) {
            class88 var41 = field621[arg3];
            if (var41 != null) {
                field597 = arg7;
                field615 = arg8;
                field617 = 2;
                field616 = 0;
                field755 = arg0;
                field756 = arg1;
                class282 var42 = class282.method4287(class280.field3112, field689.field1390);
                var42.field3187.method7993(field703.method3820(82) ? 1 : 0);
                var42.field3187.method8002(arg3);
                field689.method2694(var42);
            }
        }
        if (arg2 == 21) {
            field597 = arg7;
            field615 = arg8;
            field617 = 2;
            field616 = 0;
            field755 = arg0;
            field756 = arg1;
            class282 var43 = class282.method4287(class280.field3077, field689.field1390);
            var43.field3187.method8004(arg3);
            var43.field3187.method7994(field703.method3820(82) ? 1 : 0);
            var43.field3187.method8003(Statics.field2118 + arg0);
            var43.field3187.method8004(Statics.field565 + arg1);
            field689.method2694(var43);
        }
        if (arg2 == 31) {
            class282 var44 = class282.method4287(class280.field3089, field689.field1390);
            var44.field3187.method8002(Statics.field2917);
            var44.field3187.method8003(arg4);
            var44.field3187.method8002(arg0);
            var44.field3187.method8166(Statics.field2985);
            var44.field3187.method8048(arg1);
            var44.field3187.method8004(Statics.field1593);
            field689.method2694(var44);
            field744 = 0;
            Statics.field4438 = class310.method2952(arg1);
            field620 = arg0;
        }
        if (arg2 == 41) {
            class282 var45 = class282.method4287(class280.field3100, field689.field1390);
            var45.field3187.method8166(arg1);
            var45.field3187.method7950(arg4);
            var45.field3187.method7950(arg0);
            field689.method2694(var45);
            field744 = 0;
            Statics.field4438 = class310.method2952(arg1);
            field620 = arg0;
        }
        if (arg2 == 39) {
            class282 var46 = class282.method4287(class280.field3107, field689.field1390);
            var46.field3187.method7950(arg4);
            var46.field3187.method7950(arg0);
            var46.field3187.method8048(arg1);
            field689.method2694(var46);
            field744 = 0;
            Statics.field4438 = class310.method2952(arg1);
            field620 = arg0;
        }
        if (arg2 == 13) {
            class96 var47 = field683[arg3];
            if (var47 != null) {
                field597 = arg7;
                field615 = arg8;
                field617 = 2;
                field616 = 0;
                field755 = arg0;
                field756 = arg1;
                class282 var48 = class282.method4287(class280.field3125, field689.field1390);
                var48.field3187.method8003(arg3);
                var48.field3187.method7994(field703.method3820(82) ? 1 : 0);
                field689.method2694(var48);
            }
        }
        if (arg2 == 51) {
            class88 var49 = field621[arg3];
            if (var49 != null) {
                field597 = arg7;
                field615 = arg8;
                field617 = 2;
                field616 = 0;
                field755 = arg0;
                field756 = arg1;
                class282 var50 = class282.method4287(class280.field3073, field689.field1390);
                var50.field3187.method7947(field703.method3820(82) ? 1 : 0);
                var50.field3187.method8003(arg3);
                field689.method2694(var50);
            }
        }
        if (arg2 == 49) {
            class88 var51 = field621[arg3];
            if (var51 != null) {
                field597 = arg7;
                field615 = arg8;
                field617 = 2;
                field616 = 0;
                field755 = arg0;
                field756 = arg1;
                class282 var52 = class282.method4287(class280.field3111, field689.field1390);
                var52.field3187.method7994(field703.method3820(82) ? 1 : 0);
                var52.field3187.method7950(arg3);
                field689.method2694(var52);
            }
        }
        if (arg2 == 24) {
            class310 var53 = class310.method2952(arg1);
            if (var53 != null) {
                boolean var54 = true;
                if (var53.field3556 > 0) {
                    var54 = method5039(var53);
                }
                if (var54) {
                    class282 var55 = class282.method4287(class280.field3164, field689.field1390);
                    var55.field3187.method8048(arg1);
                    field689.method2694(var55);
                }
            }
        }
        if (arg2 == 17) {
            field597 = arg7;
            field615 = arg8;
            field617 = 2;
            field616 = 0;
            field755 = arg0;
            field756 = arg1;
            class282 var56 = class282.method4287(class280.field3144, field689.field1390);
            var56.field3187.method7950(Statics.field2118 + arg0);
            var56.field3187.method7950(arg3);
            var56.field3187.method8085(field703.method3820(82) ? 1 : 0);
            var56.field3187.method8003(field515);
            var56.field3187.method8002(field573);
            var56.field3187.method7968(Statics.field45);
            var56.field3187.method8004(Statics.field565 + arg1);
            field689.method2694(var56);
        }
        if (arg2 == 10) {
            class96 var57 = field683[arg3];
            if (var57 != null) {
                field597 = arg7;
                field615 = arg8;
                field617 = 2;
                field616 = 0;
                field755 = arg0;
                field756 = arg1;
                class282 var58 = class282.method4287(class280.field3121, field689.field1390);
                var58.field3187.method7947(field703.method3820(82) ? 1 : 0);
                var58.field3187.method8004(arg3);
                field689.method2694(var58);
            }
        }
        if (arg2 == 25) {
            class310 var59 = class310.method2979(arg1, arg0);
            if (var59 != null) {
                method285();
                method3134(arg1, arg0, class311.method1993(method3252(var59)), arg4);
                field668 = 0;
                field673 = Statics.method5873(var59);
                if (field673 == null) {
                    field673 = class330.field3846;
                }
                if (var59.field3551) {
                    field605 = var59.field3637 + class97.method3021(16777215);
                } else {
                    field605 = class97.method3021(65280) + var59.field3686 + class97.method3021(16777215);
                }
            }
            return;
        }
        if (arg2 == 20) {
            field597 = arg7;
            field615 = arg8;
            field617 = 2;
            field616 = 0;
            field755 = arg0;
            field756 = arg1;
            class282 var60 = class282.method4287(class280.field3094, field689.field1390);
            var60.field3187.method8002(Statics.field2118 + arg0);
            var60.field3187.method8004(Statics.field565 + arg1);
            var60.field3187.method7993(field703.method3820(82) ? 1 : 0);
            var60.field3187.method8003(arg3);
            field689.method2694(var60);
        }
        if (arg2 == 7) {
            class96 var61 = field683[arg3];
            if (var61 != null) {
                field597 = arg7;
                field615 = arg8;
                field617 = 2;
                field616 = 0;
                field755 = arg0;
                field756 = arg1;
                class282 var62 = class282.method4287(class280.field3070, field689.field1390);
                var62.field3187.method8003(Statics.field2917);
                var62.field3187.method8085(field703.method3820(82) ? 1 : 0);
                var62.field3187.method7950(Statics.field1593);
                var62.field3187.method7968(Statics.field2985);
                var62.field3187.method8002(arg3);
                field689.method2694(var62);
            }
        }
        if (arg2 == 29) {
            class282 var63 = class282.method4287(class280.field3164, field689.field1390);
            var63.field3187.method8048(arg1);
            field689.method2694(var63);
            class310 var64 = class310.method2952(arg1);
            if (var64 != null && var64.field3682 != null && var64.field3682[0][0] == 5) {
                int var65 = var64.field3682[0][1];
                if (class300.field3459[var65] != var64.field3606[0]) {
                    class300.field3459[var65] = var64.field3606[0];
                    method690(var65);
                }
            }
        }
        if (arg2 == 34) {
            class282 var66 = class282.method4287(class280.field3153, field689.field1390);
            var66.field3187.method7968(arg1);
            var66.field3187.method8004(arg4);
            var66.field3187.method8004(arg0);
            field689.method2694(var66);
            field744 = 0;
            Statics.field4438 = class310.method2952(arg1);
            field620 = arg0;
        }
        if (arg2 == 1005) {
            class310 var67 = class310.method2952(arg1);
            if (var67 == null || var67.field3689[arg0] < 100000) {
                class282 var68 = class282.method4287(class280.field3093, field689.field1390);
                var68.field3187.method8004(arg4);
                field689.method2694(var68);
            } else {
                class106.method5047(27, "", var67.field3689[arg0] + " x " + class201.method2583(arg4).field2266);
            }
            field744 = 0;
            Statics.field4438 = class310.method2952(arg1);
            field620 = arg0;
        }
        if (arg2 == 36) {
            class282 var69 = class282.method4287(class280.field3163, field689.field1390);
            var69.field3187.method8016(arg1);
            var69.field3187.method8002(arg0);
            var69.field3187.method8002(arg4);
            field689.method2694(var69);
            field744 = 0;
            Statics.field4438 = class310.method2952(arg1);
            field620 = arg0;
        }
        if (arg2 == 1002) {
            field597 = arg7;
            field615 = arg8;
            field617 = 2;
            field616 = 0;
            class282 var70 = class282.method4287(class280.field3062, field689.field1390);
            var70.field3187.method8004(arg3);
            field689.method2694(var70);
        }
        if (arg2 == 28) {
            class282 var71 = class282.method4287(class280.field3164, field689.field1390);
            var71.field3187.method8048(arg1);
            field689.method2694(var71);
            class310 var72 = class310.method2952(arg1);
            if (var72 != null && var72.field3682 != null && var72.field3682[0][0] == 5) {
                int var73 = var72.field3682[0][1];
                class300.field3459[var73] = 1 - class300.field3459[var73];
                method690(var73);
            }
        }
        if (arg2 == 45) {
            class88 var74 = field621[arg3];
            if (var74 != null) {
                field597 = arg7;
                field615 = arg8;
                field617 = 2;
                field616 = 0;
                field755 = arg0;
                field756 = arg1;
                class282 var75 = class282.method4287(class280.field3154, field689.field1390);
                var75.field3187.method8003(arg3);
                var75.field3187.method7947(field703.method3820(82) ? 1 : 0);
                field689.method2694(var75);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class310 var76 = class310.method2979(arg1, arg0);
            if (var76 != null) {
                method212(arg3, arg1, arg0, arg4, arg6);
            }
        }
        if (arg2 == 18) {
            field597 = arg7;
            field615 = arg8;
            field617 = 2;
            field616 = 0;
            field755 = arg0;
            field756 = arg1;
            class282 var77 = class282.method4287(class280.field3166, field689.field1390);
            var77.field3187.method8003(Statics.field565 + arg1);
            var77.field3187.method7993(field703.method3820(82) ? 1 : 0);
            var77.field3187.method8004(Statics.field2118 + arg0);
            var77.field3187.method8002(arg3);
            field689.method2694(var77);
        }
        if (arg2 == 35) {
            class282 var78 = class282.method4287(class280.field3095, field689.field1390);
            var78.field3187.method8003(arg0);
            var78.field3187.method8004(arg4);
            var78.field3187.method8016(arg1);
            field689.method2694(var78);
            field744 = 0;
            Statics.field4438 = class310.method2952(arg1);
            field620 = arg0;
        }
        if (arg2 == 44) {
            class88 var79 = field621[arg3];
            if (var79 != null) {
                field597 = arg7;
                field615 = arg8;
                field617 = 2;
                field616 = 0;
                field755 = arg0;
                field756 = arg1;
                class282 var80 = class282.method4287(class280.field3083, field689.field1390);
                var80.field3187.method8004(arg3);
                var80.field3187.method8085(field703.method3820(82) ? 1 : 0);
                field689.method2694(var80);
            }
        }
        if (arg2 == 58) {
            class310 var81 = class310.method2979(arg1, arg0);
            if (var81 != null) {
                if (var81.field3665 != null) {
                    class84 var82 = new class84();
                    var82.field1073 = var81;
                    var82.field1060 = arg3;
                    var82.field1068 = arg6;
                    var82.field1062 = var81.field3665;
                    class67.method4946(var82);
                }
                class282 var83 = class282.method4287(class280.field3130, field689.field1390);
                var83.field3187.method8002(arg0);
                var83.field3187.method8004(field515);
                var83.field3187.method8016(Statics.field45);
                var83.field3187.method8002(arg4);
                var83.field3187.method8003(field573);
                var83.field3187.method8016(arg1);
                field689.method2694(var83);
            }
        }
        if (arg2 == 40) {
            class282 var84 = class282.method4287(class280.field3143, field689.field1390);
            var84.field3187.method8003(arg0);
            var84.field3187.method8003(arg4);
            var84.field3187.method8166(arg1);
            field689.method2694(var84);
            field744 = 0;
            Statics.field4438 = class310.method2952(arg1);
            field620 = arg0;
        }
        if (arg2 == 23) {
            if (field650) {
                Statics.field3022.method4150();
            } else {
                Statics.field3022.method4213(Statics.field1370, arg0, arg1, true);
            }
        }
        if (arg2 == 32) {
            class282 var85 = class282.method4287(class280.field3081, field689.field1390);
            var85.field3187.method8004(arg0);
            var85.field3187.method8048(arg1);
            var85.field3187.method8016(Statics.field45);
            var85.field3187.method8003(arg4);
            var85.field3187.method8002(field573);
            field689.method2694(var85);
            field744 = 0;
            Statics.field4438 = class310.method2952(arg1);
            field620 = arg0;
        }
        if (arg2 == 26) {
            method842();
        }
        if (arg2 == 1001) {
            field597 = arg7;
            field615 = arg8;
            field617 = 2;
            field616 = 0;
            field755 = arg0;
            field756 = arg1;
            class282 var86 = class282.method4287(class280.field3168, field689.field1390);
            var86.field3187.method8002(Statics.field565 + arg1);
            var86.field3187.method8002(Statics.field2118 + arg0);
            var86.field3187.method8003(arg3);
            var86.field3187.method7994(field703.method3820(82) ? 1 : 0);
            field689.method2694(var86);
        }
        if (arg2 == 19) {
            field597 = arg7;
            field615 = arg8;
            field617 = 2;
            field616 = 0;
            field755 = arg0;
            field756 = arg1;
            class282 var87 = class282.method4287(class280.field3108, field689.field1390);
            var87.field3187.method8004(arg3);
            var87.field3187.method8003(Statics.field565 + arg1);
            var87.field3187.method8085(field703.method3820(82) ? 1 : 0);
            var87.field3187.method8002(Statics.field2118 + arg0);
            field689.method2694(var87);
        }
        if (arg2 == 8) {
            class96 var88 = field683[arg3];
            if (var88 != null) {
                field597 = arg7;
                field615 = arg8;
                field617 = 2;
                field616 = 0;
                field755 = arg0;
                field756 = arg1;
                class282 var89 = class282.method4287(class280.field3169, field689.field1390);
                var89.field3187.method8016(Statics.field45);
                var89.field3187.method8002(field573);
                var89.field3187.method8003(field515);
                var89.field3187.method8085(field703.method3820(82) ? 1 : 0);
                var89.field3187.method8003(arg3);
                field689.method2694(var89);
            }
        }
        if (arg2 == 5) {
            field597 = arg7;
            field615 = arg8;
            field617 = 2;
            field616 = 0;
            field755 = arg0;
            field756 = arg1;
            class282 var90 = class282.method4287(class280.field3079, field689.field1390);
            var90.field3187.method7993(field703.method3820(82) ? 1 : 0);
            var90.field3187.method8004(Statics.field565 + arg1);
            var90.field3187.method8003(Statics.field2118 + arg0);
            var90.field3187.method8002(arg3);
            field689.method2694(var90);
        }
        if (field668 != 0) {
            field668 = 0;
            method2361(class310.method2952(Statics.field2985));
        }
        if (field670) {
            method285();
        }
        if (Statics.field4438 != null && field744 == 0) {
            method2361(Statics.field4438);
        }
    }

    @ObfuscatedName("ig.io(ILjava/lang/String;B)V")
    public static void method4860(int arg0, String arg1) {
        int var2 = class103.field1343;
        int[] var3 = class103.field1350;
        boolean var4 = false;
        class497 var5 = new class497(arg1, Statics.field3020);
        for (int var6 = 0; var6 < var2; var6++) {
            class88 var7 = field621[var3[var6]];
            if (var7 != null && Statics.field4508 != var7 && var7.field1115 != null && var7.field1115.equals(var5)) {
                if (arg0 == 1) {
                    class282 var8 = class282.method4287(class280.field3083, field689.field1390);
                    var8.field3187.method8004(var3[var6]);
                    var8.field3187.method8085(0);
                    field689.method2694(var8);
                } else if (arg0 == 4) {
                    class282 var9 = class282.method4287(class280.field3150, field689.field1390);
                    var9.field3187.method7950(var3[var6]);
                    var9.field3187.method7994(0);
                    field689.method2694(var9);
                } else if (arg0 == 6) {
                    class282 var10 = class282.method4287(class280.field3111, field689.field1390);
                    var10.field3187.method7994(0);
                    var10.field3187.method7950(var3[var6]);
                    field689.method2694(var10);
                } else if (arg0 == 7) {
                    class282 var11 = class282.method4287(class280.field3071, field689.field1390);
                    var11.field3187.method8004(var3[var6]);
                    var11.field3187.method7993(0);
                    field689.method2694(var11);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class106.method5047(4, "", class330.field4001 + arg1);
        }
    }

    @ObfuscatedName("fm.jt(IIIIB)V")
    public static void method3134(int arg0, int arg1, int arg2, int arg3) {
        class310 var4 = class310.method2979(arg0, arg1);
        if (var4 != null && var4.field3638 != null) {
            class84 var5 = new class84();
            var5.field1073 = var4;
            var5.field1062 = var4.field3638;
            class67.method4946(var5);
        }
        field515 = arg3;
        field670 = true;
        Statics.field45 = arg0;
        field573 = arg1;
        Statics.field1713 = arg2;
        method2361(var4);
    }

    @ObfuscatedName("u.jy(I)V")
    public static void method285() {
        if (!field670) {
            return;
        }
        class310 var0 = class310.method2979(Statics.field45, field573);
        if (var0 != null && var0.field3575 != null) {
            class84 var1 = new class84();
            var1.field1073 = var0;
            var1.field1062 = var0.field3575;
            class67.method4946(var1);
        }
        field515 = -1;
        field670 = false;
        method2361(var0);
    }

    @ObfuscatedName("gl.je(IIB)V")
    public static void method3814(int arg0, int arg1) {
        class282 var2 = class282.method4287(class280.field3156, field689.field1390);
        var2.field3187.method7950(arg1);
        var2.field3187.method8048(arg0);
        field689.method2694(var2);
    }

    @ObfuscatedName("p.jl(IIIILjava/lang/String;I)V")
    public static void method212(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class310 var5 = class310.method2979(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field3664 != null) {
            class84 var6 = new class84();
            var6.field1073 = var5;
            var6.field1060 = arg0;
            var6.field1068 = arg4;
            var6.field1062 = var5.field3664;
            class67.method4946(var6);
        }
        boolean var7 = true;
        if (var5.field3556 > 0) {
            var7 = method5039(var5);
        }
        if (!var7 || !class311.method3885(method3252(var5), arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            class282 var8 = class282.method4287(class280.field3124, field689.field1390);
            var8.field3187.method8048(arg1);
            var8.field3187.method7950(arg2);
            var8.field3187.method7950(arg3);
            field689.method2694(var8);
        }
        if (arg0 == 2) {
            class282 var9 = class282.method4287(class280.field3117, field689.field1390);
            var9.field3187.method8048(arg1);
            var9.field3187.method7950(arg2);
            var9.field3187.method7950(arg3);
            field689.method2694(var9);
        }
        if (arg0 == 3) {
            class282 var10 = class282.method4287(class280.field3080, field689.field1390);
            var10.field3187.method8048(arg1);
            var10.field3187.method7950(arg2);
            var10.field3187.method7950(arg3);
            field689.method2694(var10);
        }
        if (arg0 == 4) {
            class282 var11 = class282.method4287(class280.field3084, field689.field1390);
            var11.field3187.method8048(arg1);
            var11.field3187.method7950(arg2);
            var11.field3187.method7950(arg3);
            field689.method2694(var11);
        }
        if (arg0 == 5) {
            class282 var12 = class282.method4287(class280.field3151, field689.field1390);
            var12.field3187.method8048(arg1);
            var12.field3187.method7950(arg2);
            var12.field3187.method7950(arg3);
            field689.method2694(var12);
        }
        if (arg0 == 6) {
            class282 var13 = class282.method4287(class280.field3137, field689.field1390);
            var13.field3187.method8048(arg1);
            var13.field3187.method7950(arg2);
            var13.field3187.method7950(arg3);
            field689.method2694(var13);
        }
        if (arg0 == 7) {
            class282 var14 = class282.method4287(class280.field3140, field689.field1390);
            var14.field3187.method8048(arg1);
            var14.field3187.method7950(arg2);
            var14.field3187.method7950(arg3);
            field689.method2694(var14);
        }
        if (arg0 == 8) {
            class282 var15 = class282.method4287(class280.field3119, field689.field1390);
            var15.field3187.method8048(arg1);
            var15.field3187.method7950(arg2);
            var15.field3187.method7950(arg3);
            field689.method2694(var15);
        }
        if (arg0 == 9) {
            class282 var16 = class282.method4287(class280.field3113, field689.field1390);
            var16.field3187.method8048(arg1);
            var16.field3187.method7950(arg2);
            var16.field3187.method7950(arg3);
            field689.method2694(var16);
        }
        if (arg0 != 10) {
            return;
        }
        class282 var17 = class282.method4287(class280.field3142, field689.field1390);
        var17.field3187.method8048(arg1);
        var17.field3187.method7950(arg2);
        var17.field3187.method7950(arg3);
        field689.method2694(var17);
    }

    @ObfuscatedName("dx.jd(I)V")
    public static final void method2936() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field651 - 1; var1++) {
                if (field654[var1] < 1000 && field654[var1 + 1] > 1000) {
                    String var2 = field658[var1];
                    field658[var1] = field658[var1 + 1];
                    field658[var1 + 1] = var2;
                    String var3 = field720[var1];
                    field720[var1] = field720[var1 + 1];
                    field720[var1 + 1] = var3;
                    int var4 = field654[var1];
                    field654[var1] = field654[var1 + 1];
                    field654[var1 + 1] = var4;
                    int var5 = field652[var1];
                    field652[var1] = field652[var1 + 1];
                    field652[var1 + 1] = var5;
                    int var6 = field758[var1];
                    field758[var1] = field758[var1 + 1];
                    field758[var1 + 1] = var6;
                    int var7 = field655[var1];
                    field655[var1] = field655[var1 + 1];
                    field655[var1 + 1] = var7;
                    int var8 = field656[var1];
                    field656[var1] = field656[var1 + 1];
                    field656[var1 + 1] = var8;
                    boolean var9 = field659[var1];
                    field659[var1] = field659[var1 + 1];
                    field659[var1 + 1] = var9;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("ic.jn(Ljava/lang/String;Ljava/lang/String;IIIIS)V")
    public static final void method4803(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method5103(arg0, arg1, arg2, arg3, arg4, arg5, -1, false);
    }

    @ObfuscatedName("jk.jz(Ljava/lang/String;Ljava/lang/String;IIIIIS)V")
    public static final void method5075(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        method5103(arg0, arg1, arg2, arg3, arg4, arg5, arg6, false);
    }

    @ObfuscatedName("ks.ju(Ljava/lang/String;Ljava/lang/String;IIIIIZB)V")
    public static final void method5103(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        if (field650 || field651 >= 500) {
            return;
        }
        field720[field651] = arg0;
        field658[field651] = arg1;
        field654[field651] = arg2;
        field655[field651] = arg3;
        field652[field651] = arg4;
        field758[field651] = arg5;
        field656[field651] = arg6;
        field659[field651] = arg7;
        field651++;
    }

    @ObfuscatedName("ot.jj(IB)Ljava/lang/String;")
    public static String method7145(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (field658[arg0].length() > 0) {
            return field720[arg0] + class330.field3849 + field658[arg0];
        } else {
            return field720[arg0];
        }
    }

    @ObfuscatedName("cc.jb(IIIII)V")
    public static final void method2220(int arg0, int arg1, int arg2, int arg3) {
        if (field668 == 0 && !field670) {
            method4803(class330.field4007, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        long var4 = -1L;
        long var6 = -1L;
        int var8 = 0;
        while (true) {
            int var10 = class229.field2749;
            if (var8 >= var10) {
                if (var4 != -1L) {
                    int var11 = class229.method4494(var4);
                    int var12 = class229.method2993(var4);
                    class88 var13 = field621[field641];
                    method7168(var13, field641, var11, var12);
                }
                return;
            }
            long var14 = class229.method4491(var8);
            if (var6 != var14) {
                label309: {
                    var6 = var14;
                    int var16 = class229.method2597(var8);
                    int var17 = class229.method3333(var8);
                    int var18 = class229.method2847(class229.field2750[var8]);
                    int var20 = class229.method2897(class229.field2750[var8]);
                    int var21 = var20;
                    if (var18 == 2 && Statics.field3022.method4142(Statics.field1370, var16, var17, var14) >= 0) {
                        class200 var22 = class200.method7839(var20);
                        if (var22.field2180 != null) {
                            var22 = var22.method3612();
                        }
                        if (var22 == null) {
                            break label309;
                        }
                        class90 var23 = null;
                        for (class90 var24 = (class90) field643.method6241(); var24 != null; var24 = (class90) field643.method6248()) {
                            if (Statics.field1370 == var24.field1156 && var24.field1146 == var16 && var24.field1147 == var17 && var24.field1151 == var21) {
                                var23 = var24;
                                break;
                            }
                        }
                        if (field668 == 1) {
                            method4803(class330.field4002, field669 + " " + class97.field1299 + " " + class97.method3021(65535) + var22.field2154, 1, var21, var16, var17);
                        } else if (!field670) {
                            String[] var25 = var22.field2183;
                            if (var25 != null) {
                                for (int var26 = 4; var26 >= 0; var26--) {
                                    if ((var23 == null || var23.method2303(var26)) && var25[var26] != null) {
                                        short var27 = 0;
                                        if (var26 == 0) {
                                            var27 = 3;
                                        }
                                        if (var26 == 1) {
                                            var27 = 4;
                                        }
                                        if (var26 == 2) {
                                            var27 = 5;
                                        }
                                        if (var26 == 3) {
                                            var27 = 6;
                                        }
                                        if (var26 == 4) {
                                            var27 = 1001;
                                        }
                                        method4803(var25[var26], class97.method3021(65535) + var22.field2154, var27, var21, var16, var17);
                                    }
                                }
                            }
                            method4803(class330.field4003, class97.method3021(65535) + var22.field2154, 1002, var22.field2195, var16, var17);
                        } else if ((Statics.field1713 & 0x4) == 4) {
                            method4803(field673, field605 + " " + class97.field1299 + " " + class97.method3021(65535) + var22.field2154, 2, var21, var16, var17);
                        }
                    }
                    if (var18 == 1) {
                        class96 var28 = field683[var21];
                        if (var28 == null) {
                            break label309;
                        }
                        if (var28.field1295.field2030 == 1 && (var28.field1204 & 0x7F) == 64 && (var28.field1161 & 0x7F) == 64) {
                            for (int var29 = 0; var29 < field556; var29++) {
                                class96 var30 = field683[field557[var29]];
                                if (var30 != null && var28 != var30 && var30.field1295.field2030 == 1 && var28.field1204 == var30.field1204 && var28.field1161 == var30.field1161) {
                                    method3813(var30, field557[var29], var16, var17);
                                }
                            }
                            int var31 = class103.field1343;
                            int[] var32 = class103.field1350;
                            for (int var33 = 0; var33 < var31; var33++) {
                                class88 var34 = field621[var32[var33]];
                                if (var34 != null && var28.field1204 == var34.field1204 && var28.field1161 == var34.field1161) {
                                    method7168(var34, var32[var33], var16, var17);
                                }
                            }
                        }
                        method3813(var28, var21, var16, var17);
                    }
                    if (var18 == 0) {
                        class88 var35 = field621[var21];
                        if (var35 == null) {
                            break label309;
                        }
                        if ((var35.field1204 & 0x7F) == 64 && (var35.field1161 & 0x7F) == 64) {
                            for (int var36 = 0; var36 < field556; var36++) {
                                class96 var37 = field683[field557[var36]];
                                if (var37 != null && var37.field1295.field2030 == 1 && var35.field1204 == var37.field1204 && var35.field1161 == var37.field1161) {
                                    method3813(var37, field557[var36], var16, var17);
                                }
                            }
                            int var38 = class103.field1343;
                            int[] var39 = class103.field1350;
                            for (int var40 = 0; var40 < var38; var40++) {
                                class88 var41 = field621[var39[var40]];
                                if (var41 != null && var35 != var41 && var35.field1204 == var41.field1204 && var35.field1161 == var41.field1161) {
                                    method7168(var41, var39[var40], var16, var17);
                                }
                            }
                        }
                        if (field641 == var21) {
                            var4 = var14;
                        } else {
                            method7168(var35, var21, var16, var17);
                        }
                    }
                    if (var18 == 3) {
                        class356 var42 = field642[Statics.field1370][var16][var17];
                        if (var42 != null) {
                            for (class100 var43 = (class100) var42.method6238(); var43 != null; var43 = (class100) var42.method6243()) {
                                class201 var44 = class201.method2583(var43.field1326);
                                if (field668 == 1) {
                                    method4803(class330.field4002, field669 + " " + class97.field1299 + " " + class97.method3021(16748608) + var44.field2266, 16, var43.field1326, var16, var17);
                                } else if (!field670) {
                                    String[] var45 = var44.field2262;
                                    for (int var46 = 4; var46 >= 0; var46--) {
                                        if (var43.method2584(var46)) {
                                            if (var45 != null && var45[var46] != null) {
                                                byte var47 = 0;
                                                if (var46 == 0) {
                                                    var47 = 18;
                                                }
                                                if (var46 == 1) {
                                                    var47 = 19;
                                                }
                                                if (var46 == 2) {
                                                    var47 = 20;
                                                }
                                                if (var46 == 3) {
                                                    var47 = 21;
                                                }
                                                if (var46 == 4) {
                                                    var47 = 22;
                                                }
                                                method4803(var45[var46], class97.method3021(16748608) + var44.field2266, var47, var43.field1326, var16, var17);
                                            } else if (var46 == 2) {
                                                method4803(class330.field3839, class97.method3021(16748608) + var44.field2266, 20, var43.field1326, var16, var17);
                                            }
                                        }
                                    }
                                    method4803(class330.field4003, class97.method3021(16748608) + var44.field2266, 1004, var43.field1326, var16, var17);
                                } else if ((Statics.field1713 & 0x1) == 1) {
                                    method4803(field673, field605 + " " + class97.field1299 + " " + class97.method3021(16748608) + var44.field2266, 17, var43.field1326, var16, var17);
                                }
                            }
                        }
                    }
                }
            }
            var8++;
        }
    }

    @ObfuscatedName("gu.jp(Lcf;IIII)V")
    public static final void method3813(class96 arg0, int arg1, int arg2, int arg3) {
        class191 var4 = arg0.field1295;
        if (field651 >= 400) {
            return;
        }
        if (var4.field2023 != null) {
            var4 = var4.method3427();
        }
        if (var4 == null || !var4.field2064 || var4.field2036 && field791 != arg1) {
            return;
        }
        String var5 = arg0.method2500();
        if (var4.field2033 != 0 && arg0.field1221 != 0) {
            int var6 = arg0.field1221 == -1 ? var4.field2033 : arg0.field1221;
            int var8 = Statics.field4508.field1112;
            int var9 = var8 - var6;
            String var10;
            if (var9 < -9) {
                var10 = class97.method3021(16711680);
            } else if (var9 < -6) {
                var10 = class97.method3021(16723968);
            } else if (var9 < -3) {
                var10 = class97.method3021(16740352);
            } else if (var9 < 0) {
                var10 = class97.method3021(16756736);
            } else if (var9 > 9) {
                var10 = class97.method3021(65280);
            } else if (var9 > 6) {
                var10 = class97.method3021(4259584);
            } else if (var9 > 3) {
                var10 = class97.method3021(8453888);
            } else if (var9 > 0) {
                var10 = class97.method3021(12648192);
            } else {
                var10 = class97.method3021(16776960);
            }
            var5 = var5 + var10 + " " + class97.field1301 + class330.field3957 + var6 + class97.field1302;
        }
        if (var4.field2036 && field660) {
            method4803(class330.field4003, class97.method3021(16776960) + var5, 1003, arg1, arg2, arg3);
        }
        if (field668 == 1) {
            method4803(class330.field4002, field669 + " " + class97.field1299 + " " + class97.method3021(16776960) + var5, 7, arg1, arg2, arg3);
        } else if (!field670) {
            int var11 = var4.field2036 && field660 ? 2000 : 0;
            String[] var12 = var4.field2052;
            if (var12 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (arg0.method2499(var13) && var12[var13] != null && !var12[var13].equalsIgnoreCase(class330.field3959)) {
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
                        method4803(var12[var13], class97.method3021(16776960) + var5, var14, arg1, arg2, arg3);
                    }
                }
            }
            if (var12 != null) {
                for (int var15 = 4; var15 >= 0; var15--) {
                    if (arg0.method2499(var15) && var12[var15] != null && var12[var15].equalsIgnoreCase(class330.field3959)) {
                        short var16 = 0;
                        if (field527 != class99.field1318) {
                            if (field527 == class99.field1316 || field527 == class99.field1317 && var4.field2033 > Statics.field4508.field1112) {
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
                            method4803(var12[var15], class97.method3021(16776960) + var5, var17, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!var4.field2036 || !field660) {
                method4803(class330.field4003, class97.method3021(16776960) + var5, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field1713 & 0x2) == 2) {
            method4803(field673, field605 + " " + class97.field1299 + " " + class97.method3021(16776960) + var5, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ox.jh(Lcl;IIII)V")
    public static final void method7168(class88 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field4508 == arg0 || field651 >= 400) {
            return;
        }
        String var9;
        if (arg0.field1119 == 0) {
            String var4 = arg0.field1111[0] + arg0.field1115 + arg0.field1111[1];
            int var5 = arg0.field1112;
            int var6 = Statics.field4508.field1112;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class97.method3021(16711680);
            } else if (var7 < -6) {
                var8 = class97.method3021(16723968);
            } else if (var7 < -3) {
                var8 = class97.method3021(16740352);
            } else if (var7 < 0) {
                var8 = class97.method3021(16756736);
            } else if (var7 > 9) {
                var8 = class97.method3021(65280);
            } else if (var7 > 6) {
                var8 = class97.method3021(4259584);
            } else if (var7 > 3) {
                var8 = class97.method3021(8453888);
            } else if (var7 > 0) {
                var8 = class97.method3021(12648192);
            } else {
                var8 = class97.method3021(16776960);
            }
            var9 = var4 + var8 + " " + class97.field1301 + class330.field3957 + arg0.field1112 + class97.field1302 + arg0.field1111[2];
        } else {
            var9 = arg0.field1111[0] + arg0.field1115 + arg0.field1111[1] + " " + class97.field1301 + class330.field4009 + arg0.field1119 + class97.field1302 + arg0.field1111[2];
        }
        if (field668 == 1) {
            method4803(class330.field4002, field669 + " " + class97.field1299 + " " + class97.method3021(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field670) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field607[var10] != null) {
                    short var11 = 0;
                    if (field607[var10].equalsIgnoreCase(class330.field3959)) {
                        if (field777 == class99.field1318) {
                            continue;
                        }
                        if (field777 == class99.field1316 || field777 == class99.field1317 && arg0.field1112 > Statics.field4508.field1112) {
                            var11 = 2000;
                        }
                        if (Statics.field4508.field1126 == 0 || arg0.field1126 == 0) {
                            if (field777 == class99.field1319 && arg0.method2250()) {
                                var11 = 2000;
                            }
                        } else if (Statics.field4508.field1126 == arg0.field1126) {
                            var11 = 2000;
                        } else {
                            var11 = 0;
                        }
                    } else if (field639[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field716[var10] + var11;
                    method4803(field607[var10], class97.method3021(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1713 & 0x8) == 8) {
            method4803(field673, field605 + " " + class97.field1299 + " " + class97.method3021(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field651; var14++) {
            if (field654[var14] == 23) {
                field658[var14] = class97.method3021(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("ce.ja(IIIIIIIIB)V")
    public static final void method2578(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class310.method3100(arg0)) {
            Statics.field263 = null;
            method418(Statics.field2984[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field263 != null) {
                method418(Statics.field263, -1412584499, arg1, arg2, arg3, arg4, Statics.field3343, Statics.field4371, arg7);
                Statics.field263 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field726[var8] = true;
            }
        } else {
            field726[arg7] = true;
        }
    }

    @ObfuscatedName("aa.jc([Lkz;IIIIIIIIB)V")
    public static final void method418(class310[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class484.method8288(arg2, arg3, arg4, arg5);
        class217.method4023();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class310 var10 = arg0[var9];
            if (var10 != null && (var10.field3571 == arg1 || arg1 == -1412584499 && field688 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field729[field724] = var10.field3565 + arg6;
                    field571[field724] = var10.field3566 + arg7;
                    field731[field724] = var10.field3567;
                    field640[field724] = var10.field3568;
                    var11 = ++field724 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field3552 = var11;
                var10.field3702 = field511;
                if (!var10.field3551 || !method3138(var10)) {
                    if (var10.field3556 > 0) {
                        method7892(var10);
                    }
                    int var12 = var10.field3565 + arg6;
                    int var13 = var10.field3566 + arg7;
                    int var14 = var10.field3546;
                    if (field688 == var10) {
                        if (arg1 != -1412584499 && !var10.field3642) {
                            Statics.field263 = arg0;
                            Statics.field3343 = arg6;
                            Statics.field4371 = arg7;
                            continue;
                        }
                        if (field517 && field693) {
                            int var15 = class36.field251;
                            int var16 = class36.field252;
                            int var17 = var15 - field802;
                            int var18 = var16 - field691;
                            if (var17 < field796) {
                                var17 = field796;
                            }
                            if (var10.field3567 + var17 > field796 + field674.field3567) {
                                var17 = field796 + field674.field3567 - var10.field3567;
                            }
                            if (var18 < field804) {
                                var18 = field804;
                            }
                            if (var10.field3568 + var18 > field804 + field674.field3568) {
                                var18 = field804 + field674.field3568 - var10.field3568;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field3642) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field3657 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field3657 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field3567 + var12;
                        int var26 = var10.field3568 + var13;
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
                        int var29 = var10.field3567 + var12;
                        int var30 = var10.field3568 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field3551 || var19 < var21 && var20 < var22) {
                        if (var10.field3556 != 0) {
                            if (var10.field3556 == 1336) {
                                if (Statics.field1404.method2373()) {
                                    var13 += 15;
                                    Statics.field895.method6701("Fps:" + field213, var10.field3567 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 327680 && !field501) {
                                        var33 = 16711680;
                                    }
                                    Statics.field895.method6701("Mem:" + var32 + "k", var10.field3567 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field3556 == 1337) {
                                field664 = var12;
                                field604 = var13;
                                method3301(var12, var13, var10.field3567, var10.field3568);
                                field726[var10.field3552] = true;
                                class484.method8288(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3556 == 1338) {
                                Statics.method4867(var10, var12, var13, var11);
                                class484.method8288(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3556 == 1339) {
                                method3868(var10, var12, var13, var11);
                                class484.method8288(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3556 == 1400) {
                                Statics.field4300.method7645(var12, var13, var10.field3567, var10.field3568, field511);
                            }
                            if (var10.field3556 == 1401) {
                                Statics.field4300.method7484(var12, var13, var10.field3567, var10.field3568);
                            }
                            if (var10.field3556 == 1402) {
                                Statics.field3484.method2333(var12, field511);
                            }
                        }
                        if (var10.field3657 == 0) {
                            if (!var10.field3551 && method3138(var10) && Statics.field151 != var10) {
                                continue;
                            }
                            if (!var10.field3551) {
                                if (var10.field3574 > var10.field3543 - var10.field3568) {
                                    var10.field3574 = var10.field3543 - var10.field3568;
                                }
                                if (var10.field3574 < 0) {
                                    var10.field3574 = 0;
                                }
                            }
                            method418(arg0, var10.field3701, var19, var20, var21, var22, var12 - var10.field3573, var13 - var10.field3574, var11);
                            if (var10.field3694 != null) {
                                method418(var10.field3694, var10.field3701, var19, var20, var21, var22, var12 - var10.field3573, var13 - var10.field3574, var11);
                            }
                            class83 var34 = (class83) field676.method7706((long) var10.field3701);
                            if (var34 != null) {
                                method2578(var34.field1055, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class484.method8288(arg2, arg3, arg4, arg5);
                            class217.method4023();
                        } else if (var10.field3657 == 11) {
                            if (method3138(var10) && Statics.field151 != var10) {
                                continue;
                            }
                            if (var10.field3694 != null) {
                                method418(var10.field3694, var10.field3701, var19, var20, var21, var22, var12 - var10.field3573, var13 - var10.field3574, var11);
                            }
                            class484.method8288(arg2, arg3, arg4, arg5);
                            class217.method4023();
                        }
                        if (field735 || field561[var11] || field733 > 1) {
                            if (var10.field3657 == 0 && !var10.field3551 && var10.field3543 > var10.field3568) {
                                method3524(var10.field3567 + var12, var13, var10.field3574, var10.field3568, var10.field3543);
                            }
                            if (var10.field3657 != 1) {
                                if (var10.field3657 == 2) {
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < var10.field3564; var36++) {
                                        for (int var37 = 0; var37 < var10.field3563; var37++) {
                                            int var38 = (var10.field3620 + 32) * var37 + var12;
                                            int var39 = (var10.field3621 + 32) * var36 + var13;
                                            if (var35 < 20) {
                                                var38 += var10.field3622[var35];
                                                var39 += var10.field3554[var35];
                                            }
                                            if (var10.field3688[var35] > 0) {
                                                boolean var40 = false;
                                                boolean var41 = false;
                                                int var42 = var10.field3688[var35] - 1;
                                                if (var38 + 32 > arg2 && var38 < arg4 && var39 + 32 > arg3 && var39 < arg5 || Statics.field2823 == var10 && field728 == var35) {
                                                    class488 var43;
                                                    if (field668 == 1 && Statics.field2917 == var35 && Statics.field2985 == var10.field3701) {
                                                        var43 = class201.method4303(var42, var10.field3689[var35], 2, 0, 2, false);
                                                    } else {
                                                        var43 = class201.method4303(var42, var10.field3689[var35], 1, 3153952, 2, false);
                                                    }
                                                    if (var43 == null) {
                                                        method2361(var10);
                                                    } else if (Statics.field2823 == var10 && field728 == var35) {
                                                        int var44 = class36.field251 - field622;
                                                        int var45 = class36.field252 - field623;
                                                        if (var44 < 5 && var44 > -5) {
                                                            var44 = 0;
                                                        }
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (field626 < 5) {
                                                            var44 = 0;
                                                            var45 = 0;
                                                        }
                                                        var43.method8408(var38 + var44, var39 + var45, 128);
                                                        if (arg1 != -1) {
                                                            class310 var46 = arg0[arg1 & 0xFFFF];
                                                            if (var39 + var45 < class484.field5009 && var46.field3574 > 0) {
                                                                int var47 = field575 * (class484.field5009 - var39 - var45) / 3;
                                                                if (var47 > field575 * 10) {
                                                                    var47 = field575 * 10;
                                                                }
                                                                if (var47 > var46.field3574) {
                                                                    var47 = var46.field3574;
                                                                }
                                                                var46.field3574 -= var47;
                                                                field623 += var47;
                                                                method2361(var46);
                                                            }
                                                            if (var39 + var45 + 32 > class484.field5010 && var46.field3574 < var46.field3543 - var46.field3568) {
                                                                int var48 = field575 * (var39 + var45 + 32 - class484.field5010) / 3;
                                                                if (var48 > field575 * 10) {
                                                                    var48 = field575 * 10;
                                                                }
                                                                if (var48 > var46.field3543 - var46.field3568 - var46.field3574) {
                                                                    var48 = var46.field3543 - var46.field3568 - var46.field3574;
                                                                }
                                                                var46.field3574 += var48;
                                                                field623 -= var48;
                                                                method2361(var46);
                                                            }
                                                        }
                                                    } else if (Statics.field4438 == var10 && field620 == var35) {
                                                        var43.method8408(var38, var39, 128);
                                                    } else {
                                                        var43.method8402(var38, var39);
                                                    }
                                                }
                                            } else if (var10.field3624 != null && var35 < 20) {
                                                class488 var49 = var10.method5675(var35);
                                                if (var49 != null) {
                                                    var49.method8402(var38, var39);
                                                } else if (class310.field3580) {
                                                    method2361(var10);
                                                }
                                            }
                                            var35++;
                                        }
                                    }
                                } else if (var10.field3657 == 3) {
                                    int var50;
                                    if (method2793(var10)) {
                                        var50 = var10.field3578;
                                        if (Statics.field151 == var10 && var10.field3696 != 0) {
                                            var50 = var10.field3696;
                                        }
                                    } else {
                                        var50 = var10.field3577;
                                        if (Statics.field151 == var10 && var10.field3579 != 0) {
                                            var50 = var10.field3579;
                                        }
                                    }
                                    if (var10.field3608) {
                                        switch(var10.field3582.field5016) {
                                            case 1:
                                                class484.method8297(var12, var13, var10.field3567, var10.field3568, var10.field3577, var10.field3578);
                                                break;
                                            case 2:
                                                class484.method8298(var12, var13, var10.field3567, var10.field3568, var10.field3577, var10.field3578, 255 - (var10.field3546 & 0xFF), 255 - (var10.field3655 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class484.method8296(var12, var13, var10.field3567, var10.field3568, var50);
                                                } else {
                                                    class484.method8295(var12, var13, var10.field3567, var10.field3568, var50, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class484.method8300(var12, var13, var10.field3567, var10.field3568, var50);
                                    } else {
                                        class484.method8301(var12, var13, var10.field3567, var10.field3568, var50, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field3657 == 4) {
                                    class372 var51 = var10.method5674();
                                    if (var51 != null) {
                                        String var52 = var10.field3614;
                                        int var53;
                                        if (method2793(var10)) {
                                            var53 = var10.field3578;
                                            if (Statics.field151 == var10 && var10.field3696 != 0) {
                                                var53 = var10.field3696;
                                            }
                                            if (var10.field3703.length() > 0) {
                                                var52 = var10.field3703;
                                            }
                                        } else {
                                            var53 = var10.field3577;
                                            if (Statics.field151 == var10 && var10.field3579 != 0) {
                                                var53 = var10.field3579;
                                            }
                                        }
                                        if (var10.field3551 && var10.field3690 != -1) {
                                            class201 var54 = class201.method2583(var10.field3690);
                                            var52 = var54.field2266;
                                            if (var52 == null) {
                                                var52 = class330.field3846;
                                            }
                                            if ((var54.field2228 == 1 || var10.field3569 != 1) && var10.field3569 != -1) {
                                                var52 = class97.method3021(16748608) + var52 + class97.field1298 + " " + 'x' + method4939(var10.field3569);
                                            }
                                        }
                                        if (field697 == var10) {
                                            var52 = class330.field4123;
                                            var53 = var10.field3577;
                                        }
                                        if (!var10.field3551) {
                                            var52 = method3968(var52, var10);
                                        }
                                        var51.method6682(var52, var12, var13, var10.field3567, var10.field3568, var53, var10.field3584 ? 0 : -1, var10.field3539, var10.field3618, var10.field3616);
                                    } else if (class310.field3580) {
                                        method2361(var10);
                                    }
                                } else if (var10.field3657 == 5) {
                                    if (var10.field3551) {
                                        class488 var56;
                                        if (var10.field3690 == -1) {
                                            var56 = var10.method5666(false, Statics.field2910);
                                        } else {
                                            var56 = class201.method4303(var10.field3690, var10.field3569, var10.field3645, var10.field3593, var10.field3669, false);
                                        }
                                        if (var56 != null) {
                                            int var57 = var56.field5030;
                                            int var58 = var56.field5040;
                                            if (var10.field3591) {
                                                class484.method8289(var12, var13, var10.field3567 + var12, var10.field3568 + var13);
                                                int var59 = (var10.field3567 + (var57 - 1)) / var57;
                                                int var60 = (var10.field3568 + (var58 - 1)) / var58;
                                                for (int var61 = 0; var61 < var59; var61++) {
                                                    for (int var62 = 0; var62 < var60; var62++) {
                                                        if (var10.field3590 != 0) {
                                                            var56.method8437(var57 / 2 + var57 * var61 + var12, var58 / 2 + var58 * var62 + var13, var10.field3590, 4096);
                                                        } else if (var14 == 0) {
                                                            var56.method8402(var57 * var61 + var12, var58 * var62 + var13);
                                                        } else {
                                                            var56.method8408(var57 * var61 + var12, var58 * var62 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class484.method8288(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var63 = var10.field3567 * 4096 / var57;
                                                if (var10.field3590 != 0) {
                                                    var56.method8437(var10.field3567 / 2 + var12, var10.field3568 / 2 + var13, var10.field3590, var63);
                                                } else if (var14 != 0) {
                                                    var56.method8449(var12, var13, var10.field3567, var10.field3568, 256 - (var14 & 0xFF));
                                                } else if (var10.field3567 == var57 && var10.field3568 == var58) {
                                                    var56.method8402(var12, var13);
                                                } else {
                                                    var56.method8456(var12, var13, var10.field3567, var10.field3568);
                                                }
                                            }
                                        } else if (class310.field3580) {
                                            method2361(var10);
                                        }
                                    } else {
                                        class488 var55 = var10.method5666(method2793(var10), Statics.field2910);
                                        if (var55 != null) {
                                            var55.method8402(var12, var13);
                                        } else if (class310.field3580) {
                                            method2361(var10);
                                        }
                                    }
                                } else if (var10.field3657 == 6) {
                                    boolean var64 = method2793(var10);
                                    int var65;
                                    if (var64) {
                                        var65 = var10.field3601;
                                    } else {
                                        var65 = var10.field3704;
                                    }
                                    class228 var66 = null;
                                    int var67 = 0;
                                    if (var10.field3690 != -1) {
                                        class201 var68 = class201.method2583(var10.field3690);
                                        if (var68 != null) {
                                            class201 var69 = var68.method3697(var10.field3569);
                                            var66 = var69.method3656(1);
                                            if (var66 == null) {
                                                method2361(var10);
                                            } else {
                                                var66.method4338();
                                                var67 = var66.field2609 / 2;
                                            }
                                        }
                                    } else if (var10.field3596 != 5) {
                                        class191 var70 = null;
                                        class190 var71 = null;
                                        if (var10.field3596 == 6) {
                                            int var72 = var10.field3597;
                                            if (var72 >= 0 && var72 < field683.length) {
                                                class96 var73 = field683[var72];
                                                if (var73 != null) {
                                                    var70 = var73.field1295;
                                                    var71 = var73.method2511();
                                                }
                                            }
                                        }
                                        class203 var74 = null;
                                        int var75 = -1;
                                        if (var65 != -1) {
                                            var74 = class203.method2227(var65);
                                            var75 = var10.field3692;
                                        }
                                        var66 = var10.method5676(var74, var75, var64, Statics.field4508.field1107, var70, var71);
                                        if (var66 == null && class310.field3580) {
                                            method2361(var10);
                                        }
                                    } else if (var10.field3597 == 0) {
                                        var66 = field787.method5357((class203) null, -1, (class203) null, -1);
                                    } else {
                                        var66 = Statics.field4508.method1977();
                                    }
                                    class217.method4073(var10.field3567 / 2 + var12, var10.field3568 / 2 + var13);
                                    int var76 = var10.field3592 * class217.field2515[var10.field3604] >> 16;
                                    int var77 = var10.field3592 * class217.field2516[var10.field3604] >> 16;
                                    if (var66 != null) {
                                        if (var10.field3551) {
                                            var66.method4338();
                                            if (var10.field3598) {
                                                var66.method4441(0, var10.field3677, var10.field3667, var10.field3604, var10.field3602, var10.field3603 + var67 + var76, var10.field3603 + var77, var10.field3592);
                                            } else {
                                                var66.method4355(0, var10.field3677, var10.field3667, var10.field3604, var10.field3602, var10.field3603 + var67 + var76, var10.field3603 + var77);
                                            }
                                        } else {
                                            var66.method4355(0, var10.field3677, 0, var10.field3604, 0, var76, var77);
                                        }
                                    }
                                    class217.method3982();
                                } else {
                                    if (var10.field3657 == 7) {
                                        class372 var78 = var10.method5674();
                                        if (var78 == null) {
                                            if (class310.field3580) {
                                                method2361(var10);
                                            }
                                            continue;
                                        }
                                        int var79 = 0;
                                        for (int var80 = 0; var80 < var10.field3564; var80++) {
                                            for (int var81 = 0; var81 < var10.field3563; var81++) {
                                                if (var10.field3688[var79] > 0) {
                                                    class201 var82 = class201.method2583(var10.field3688[var79] - 1);
                                                    String var83;
                                                    if (var82.field2228 != 1 && var10.field3689[var79] == 1) {
                                                        var83 = class97.method3021(16748608) + var82.field2266 + class97.field1298;
                                                    } else {
                                                        var83 = class97.method3021(16748608) + var82.field2266 + class97.field1298 + " " + 'x' + method4939(var10.field3689[var79]);
                                                    }
                                                    int var84 = (var10.field3620 + 115) * var81 + var12;
                                                    int var85 = (var10.field3621 + 12) * var80 + var13;
                                                    if (var10.field3539 == 0) {
                                                        var78.method6634(var83, var84, var85, var10.field3577, var10.field3584 ? 0 : -1);
                                                    } else if (var10.field3539 == 1) {
                                                        var78.method6658(var83, var10.field3567 / 2 + var84, var85, var10.field3577, var10.field3584 ? 0 : -1);
                                                    } else {
                                                        var78.method6701(var83, var10.field3567 + var84 - 1, var85, var10.field3577, var10.field3584 ? 0 : -1);
                                                    }
                                                }
                                                var79++;
                                            }
                                        }
                                    }
                                    if (var10.field3657 == 8 && Statics.field103 == var10 && field667 == field666) {
                                        int var86 = 0;
                                        int var87 = 0;
                                        class372 var88 = Statics.field895;
                                        String var89 = var10.field3614;
                                        String var90 = method3968(var89, var10);
                                        while (var90.length() > 0) {
                                            int var91 = var90.indexOf(class97.field1303);
                                            String var92;
                                            if (var91 == -1) {
                                                var92 = var90;
                                                var90 = "";
                                            } else {
                                                var92 = var90.substring(0, var91);
                                                var90 = var90.substring(var91 + 4);
                                            }
                                            int var93 = var88.method6629(var92);
                                            if (var93 > var86) {
                                                var86 = var93;
                                            }
                                            var87 += var88.field4419 + 1;
                                        }
                                        var86 += 6;
                                        var87 += 7;
                                        int var94 = var10.field3567 + var12 - 5 - var86;
                                        int var95 = var10.field3568 + var13 + 5;
                                        if (var94 < var12 + 5) {
                                            var94 = var12 + 5;
                                        }
                                        if (var86 + var94 > arg4) {
                                            var94 = arg4 - var86;
                                        }
                                        if (var87 + var95 > arg5) {
                                            var95 = arg5 - var87;
                                        }
                                        class484.method8296(var94, var95, var86, var87, 16777120);
                                        class484.method8300(var94, var95, var86, var87, 0);
                                        String var96 = var10.field3614;
                                        int var97 = var88.field4419 + var95 + 2;
                                        String var98 = method3968(var96, var10);
                                        while (var98.length() > 0) {
                                            int var99 = var98.indexOf(class97.field1303);
                                            String var100;
                                            if (var99 == -1) {
                                                var100 = var98;
                                                var98 = "";
                                            } else {
                                                var100 = var98.substring(0, var99);
                                                var98 = var98.substring(var99 + 4);
                                            }
                                            var88.method6634(var100, var94 + 3, var97, 0, -1);
                                            var97 += var88.field4419 + 1;
                                        }
                                    }
                                    if (var10.field3657 == 9) {
                                        int var101;
                                        int var102;
                                        int var103;
                                        int var104;
                                        if (var10.field3607) {
                                            var101 = var12;
                                            var102 = var10.field3568 + var13;
                                            var103 = var10.field3567 + var12;
                                            var104 = var13;
                                        } else {
                                            var101 = var12;
                                            var102 = var13;
                                            var103 = var10.field3567 + var12;
                                            var104 = var10.field3568 + var13;
                                        }
                                        if (var10.field3585 == 1) {
                                            class484.method8306(var101, var102, var103, var104, var10.field3577);
                                        } else {
                                            method222(var101, var102, var103, var104, var10.field3577, var10.field3585);
                                        }
                                    } else if (var10.field3657 == 12) {
                                        class308 var105 = var10.method5705();
                                        class303 var106 = var10.method5696();
                                        if (var105 != null && var106 != null && var105.method5449()) {
                                            class372 var107 = var10.method5674();
                                            if (var107 != null) {
                                                field718.method8539(var12, var13, var10.field3567, var10.field3568, var105.method5450(), var105.method5511(), 0, 0, var105.method5615(), var105.method5448(), var105.method5446());
                                                int var108 = var10.field3584 ? var10.field3593 : -1;
                                                if (!var105.method5444() && var105.method5441().method6511()) {
                                                    field718.method8534(var106.field3468, var108, var106.field3466, var106.field3471);
                                                    field718.method8538(var105.method5598(), var107);
                                                } else {
                                                    field718.method8534(var10.field3577, var108, var106.field3466, var106.field3471);
                                                    field718.method8538(var105.method5441(), var107);
                                                }
                                                class484.method8288(arg2, arg3, arg4, arg5);
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

    @ObfuscatedName("o.jr(IIIIIII)V")
    public static final void method222(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class484.field5006;
        int var18 = arg1 - class484.field5009;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class217.method3990(var19, var20, var21);
        class217.method3995(var23, var24, var25, var19, var20, var21, arg4);
        class217.method3990(var19, var21, var22);
        class217.method3995(var23, var25, var26, var19, var21, var22, arg4);
    }

    @ObfuscatedName("hq.jo(Ljava/lang/String;Lkz;I)Ljava/lang/String;")
    public static String method3968(String arg0, class310 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method6217(arg1, var2 - 1);
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

    @ObfuscatedName("jt.jm(II)Ljava/lang/String;")
    public static final String method4939(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class97.field1300 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class97.method3021(65408) + var1.substring(0, var1.length() - 8) + class330.field4013 + " " + class97.field1301 + var1 + class97.field1302 + class97.field1298;
        } else if (var1.length() > 6) {
            return " " + class97.method3021(16777215) + var1.substring(0, var1.length() - 4) + class330.field4015 + " " + class97.field1301 + var1 + class97.field1302 + class97.field1298;
        } else {
            return " " + class97.method3021(16776960) + var1 + class97.field1298;
        }
    }

    @ObfuscatedName("client.jq(ZI)V")
    public final void method1210(boolean arg0) {
        int var2 = field675;
        int var3 = Statics.field220;
        int var4 = Statics.field1559;
        if (class310.method3100(var2)) {
            method6624(Statics.field2984[var2], -1, var3, var4, arg0);
        }
    }

    @ObfuscatedName("client.jf(Lkz;I)V")
    public void method1506(class310 arg0) {
        class310 var2 = arg0.field3571 == -1 ? null : class310.method2952(arg0.field3571);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field220;
            var4 = Statics.field1559;
        } else {
            var3 = var2.field3567;
            var4 = var2.field3568;
        }
        method1681(arg0, var3, var4, false);
        Statics.method1682(arg0, var3, var4);
    }

    @ObfuscatedName("ia.jv([Lkz;Lkz;ZB)V")
    public static void method4899(class310[] arg0, class310 arg1, boolean arg2) {
        int var3 = arg1.field3641 == 0 ? arg1.field3567 : arg1.field3641;
        int var4 = arg1.field3543 == 0 ? arg1.field3568 : arg1.field3543;
        method6624(arg0, arg1.field3701, var3, var4, arg2);
        if (arg1.field3694 != null) {
            method6624(arg1.field3694, arg1.field3701, var3, var4, arg2);
        }
        class83 var5 = (class83) field676.method7706((long) arg1.field3701);
        if (var5 != null) {
            int var6 = var5.field1055;
            if (class310.method3100(var6)) {
                method6624(Statics.field2984[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field3556 == 1337) {
        }
    }

    @ObfuscatedName("nq.js([Lkz;IIIZI)V")
    public static void method6624(class310[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class310 var6 = arg0[var5];
            if (var6 != null && var6.field3571 == arg1) {
                method1681(var6, arg2, arg3, arg4);
                Statics.method1682(var6, arg2, arg3);
                if (var6.field3573 > var6.field3641 - var6.field3567) {
                    var6.field3573 = var6.field3641 - var6.field3567;
                }
                if (var6.field3573 < 0) {
                    var6.field3573 = 0;
                }
                if (var6.field3574 > var6.field3543 - var6.field3568) {
                    var6.field3574 = var6.field3543 - var6.field3568;
                }
                if (var6.field3574 < 0) {
                    var6.field3574 = 0;
                }
                if (var6.field3657 == 0) {
                    method4899(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("client.ji(Lkz;IIZI)V")
    public static void method1681(class310 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field3567;
        int var5 = arg0.field3568;
        if (arg0.field3559 == 0) {
            arg0.field3567 = arg0.field3563;
        } else if (arg0.field3559 == 1) {
            arg0.field3567 = arg1 - arg0.field3563;
        } else if (arg0.field3559 == 2) {
            arg0.field3567 = arg0.field3563 * arg1 >> 14;
        }
        if (arg0.field3560 == 0) {
            arg0.field3568 = arg0.field3564;
        } else if (arg0.field3560 == 1) {
            arg0.field3568 = arg2 - arg0.field3564;
        } else if (arg0.field3560 == 2) {
            arg0.field3568 = arg0.field3564 * arg2 >> 14;
        }
        if (arg0.field3559 == 4) {
            arg0.field3567 = arg0.field3660 * arg0.field3568 / arg0.field3570;
        }
        if (arg0.field3560 == 4) {
            arg0.field3568 = arg0.field3570 * arg0.field3567 / arg0.field3660;
        }
        if (arg0.field3556 == 1337) {
            field687 = arg0;
        }
        if (arg0.field3657 == 12) {
            arg0.method5705().method5398(arg0.field3567, arg0.field3568);
        }
        if (arg3 && arg0.field3678 != null && (arg0.field3567 != var4 || arg0.field3568 != var5)) {
            class84 var6 = new class84();
            var6.field1073 = arg0;
            var6.field1062 = arg0.field3678;
            field719.method6236(var6);
        }
    }

    @ObfuscatedName("bw.jw(Lkz;IIIIIII)V")
    public static final void method1701(class310 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field682) {
            field579 = 32;
        } else {
            field579 = 0;
        }
        field682 = false;
        if (class36.field250 == 1 || !Statics.field4559 && class36.field250 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field3574 -= 4;
                method2361(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field3574 += 4;
                method2361(arg0);
            } else if (arg5 >= arg1 - field579 && arg5 < field579 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field3574 = (arg4 - arg3) * var8 / var9;
                method2361(arg0);
                field682 = true;
            }
        }
        if (field587 == 0) {
            return;
        }
        int var10 = arg0.field3567;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field3574 += field587 * 45;
            method2361(arg0);
        }
    }

    @ObfuscatedName("gy.jx(IIIIII)V")
    public static final void method3524(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field1925[0].method8374(arg0, arg1);
        Statics.field1925[1].method8374(arg0, arg1 + arg3 - 16);
        class484.method8296(arg0, arg1 + 16, 16, arg3 - 32, field576);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class484.method8296(arg0, arg1 + 16 + var6, 16, var5, field577);
        class484.method8304(arg0, arg1 + 16 + var6, var5, field637);
        class484.method8304(arg0 + 1, arg1 + 16 + var6, var5, field637);
        class484.method8328(arg0, arg1 + 16 + var6, 16, field637);
        class484.method8328(arg0, arg1 + 17 + var6, 16, field637);
        class484.method8304(arg0 + 15, arg1 + 16 + var6, var5, field657);
        class484.method8304(arg0 + 14, arg1 + 17 + var6, var5 - 1, field657);
        class484.method8328(arg0, arg1 + 15 + var6 + var5, 16, field657);
        class484.method8328(arg0 + 1, arg1 + 14 + var6 + var5, 15, field657);
    }

    @ObfuscatedName("dv.jk(Lkz;I)Z")
    public static final boolean method2793(class310 arg0) {
        if (arg0.field3683 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field3683.length; var1++) {
            int var2 = method6217(arg0, var1);
            int var3 = arg0.field3606[var1];
            if (arg0.field3683[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field3683[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field3683[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("mn.ki(Lkz;II)I")
    public static final int method6217(class310 arg0, int arg1) {
        if (arg0.field3682 == null || arg1 >= arg0.field3682.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field3682[arg1];
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
                    var7 = field646[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field712[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field648[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class310 var11 = class310.method2952(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class201.method2583(var12).field2235 || field500)) {
                        for (int var13 = 0; var13 < var11.field3688.length; var13++) {
                            if (var12 + 1 == var11.field3688[var13]) {
                                var7 += var11.field3689[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class300.field3459[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class320.field3770[field712[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class300.field3459[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field4508.field1112;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class320.field3771[var14]) {
                            var7 += field712[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class310 var17 = class310.method2952(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class201.method2583(var18).field2235 || field500)) {
                        for (int var19 = 0; var19 < var17.field3688.length; var19++) {
                            if (var18 + 1 == var17.field3688[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field497;
                }
                if (var6 == 12) {
                    var7 = field717;
                }
                if (var6 == 13) {
                    int var20 = class300.field3459[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class300.method2093(var22);
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
                    var7 = (Statics.field4508.field1204 >> 7) + Statics.field2118;
                }
                if (var6 == 19) {
                    var7 = (Statics.field4508.field1161 >> 7) + Statics.field565;
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

    @ObfuscatedName("id.ku(Lkz;Lgr;IIZI)V")
    public static final void method4687(class310 arg0, class201 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field2211;
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
            var7 = class330.field3995;
        }
        if (var6 != -1 && var7 != null) {
            method5103(var7, class97.method3021(16748608) + arg1.field2266, var6, 0, arg2, arg0.field3701, arg1.field2215, arg4);
        }
    }

    @ObfuscatedName("cw.kf(Lkz;IIB)V")
    public static final void method2615(class310 arg0, int arg1, int arg2) {
        if (arg0.field3555 == 1) {
            method5075(arg0.field3687, "", 24, 0, 0, arg0.field3701, arg0.field3690);
        }
        if (arg0.field3555 == 2 && !field670) {
            String var3 = Statics.method5873(arg0);
            if (var3 != null) {
                method5075(var3, class97.method3021(65280) + arg0.field3686, 25, 0, -1, arg0.field3701, arg0.field3690);
            }
        }
        if (arg0.field3555 == 3) {
            method4803(class330.field4011, "", 26, 0, 0, arg0.field3701);
        }
        if (arg0.field3555 == 4) {
            method4803(arg0.field3687, "", 28, 0, 0, arg0.field3701);
        }
        if (arg0.field3555 == 5) {
            method4803(arg0.field3687, "", 29, 0, 0, arg0.field3701);
        }
        if (arg0.field3555 == 6 && field697 == null) {
            method4803(arg0.field3687, "", 30, 0, -1, arg0.field3701);
        }
        if (arg0.field3657 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field3568; var5++) {
                for (int var6 = 0; var6 < arg0.field3567; var6++) {
                    int var7 = (arg0.field3620 + 32) * var6;
                    int var8 = (arg0.field3621 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field3622[var4];
                        var8 += arg0.field3554[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field708 = var4;
                        Statics.field1779 = arg0;
                        if (arg0.field3688[var4] > 0) {
                            label318: {
                                class201 var9 = class201.method2583(arg0.field3688[var4] - 1);
                                if (field668 == 1) {
                                    int var10 = method3252(arg0);
                                    boolean var11 = (var10 >> 30 & 0x1) != 0;
                                    if (var11) {
                                        if (Statics.field2985 != arg0.field3701 || Statics.field2917 != var4) {
                                            method5075(class330.field4002, field669 + " " + class97.field1299 + " " + class97.method3021(16748608) + var9.field2266, 31, 0, var4, arg0.field3701, var9.field2215);
                                        }
                                        break label318;
                                    }
                                }
                                if (field670) {
                                    int var12 = method3252(arg0);
                                    boolean var13 = (var12 >> 30 & 0x1) != 0;
                                    if (var13) {
                                        if ((Statics.field1713 & 0x10) == 16) {
                                            method5075(field673, field605 + " " + class97.field1299 + " " + class97.method3021(16748608) + var9.field2266, 32, 0, var4, arg0.field3701, var9.field2215);
                                        }
                                        break label318;
                                    }
                                }
                                String[] var14 = var9.field2211;
                                int var15 = -1;
                                if (field581) {
                                    boolean var16 = field619 || field703.method3820(81);
                                    if (var16) {
                                        var15 = var9.method3713();
                                    }
                                }
                                int var17 = method3252(arg0);
                                boolean var18 = (var17 >> 30 & 0x1) != 0;
                                if (var18) {
                                    for (int var19 = 4; var19 >= 3; var19--) {
                                        if (var15 != var19) {
                                            method4687(arg0, var9, var4, var19, false);
                                        }
                                    }
                                }
                                class311 var10000 = (class311) null;
                                if (class311.method5101(method3252(arg0))) {
                                    method5075(class330.field4002, class97.method3021(16748608) + var9.field2266, 38, 0, var4, arg0.field3701, var9.field2215);
                                }
                                int var20 = method3252(arg0);
                                boolean var21 = (var20 >> 30 & 0x1) != 0;
                                if (var21) {
                                    for (int var22 = 2; var22 >= 0; var22--) {
                                        if (var15 != var22) {
                                            method4687(arg0, var9, var4, var22, false);
                                        }
                                    }
                                    if (var15 >= 0) {
                                        method4687(arg0, var9, var4, var15, true);
                                    }
                                }
                                String[] var23 = arg0.field3625;
                                if (var23 != null) {
                                    for (int var24 = 4; var24 >= 0; var24--) {
                                        if (var23[var24] != null) {
                                            byte var25 = 0;
                                            if (var24 == 0) {
                                                var25 = 39;
                                            }
                                            if (var24 == 1) {
                                                var25 = 40;
                                            }
                                            if (var24 == 2) {
                                                var25 = 41;
                                            }
                                            if (var24 == 3) {
                                                var25 = 42;
                                            }
                                            if (var24 == 4) {
                                                var25 = 43;
                                            }
                                            method5075(var23[var24], class97.method3021(16748608) + var9.field2266, var25, 0, var4, arg0.field3701, var9.field2215);
                                        }
                                    }
                                }
                                method5075(class330.field4003, class97.method3021(16748608) + var9.field2266, 1005, 0, var4, arg0.field3701, var9.field2215);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field3551) {
            return;
        }
        if (field670) {
            int var26 = method3252(arg0);
            boolean var27 = (var26 >> 21 & 0x1) != 0;
            if (var27 && (Statics.field1713 & 0x20) == 32) {
                method5075(field673, field605 + " " + class97.field1299 + " " + arg0.field3637, 58, 0, arg0.field3558, arg0.field3701, arg0.field3690);
            }
            return;
        }
        for (int var28 = 9; var28 >= 5; var28--) {
            String var29;
            if (!class311.method3885(method3252(arg0), var28) && arg0.field3664 == null) {
                var29 = null;
            } else if (arg0.field3705 == null || arg0.field3705.length <= var28 || arg0.field3705[var28] == null || arg0.field3705[var28].trim().length() == 0) {
                var29 = null;
            } else {
                var29 = arg0.field3705[var28];
            }
            if (var29 != null) {
                method5075(var29, arg0.field3637, 1007, var28 + 1, arg0.field3558, arg0.field3701, arg0.field3690);
            }
        }
        String var31 = Statics.method5873(arg0);
        if (var31 != null) {
            method5075(var31, arg0.field3637, 25, 0, arg0.field3558, arg0.field3701, arg0.field3690);
        }
        for (int var32 = 4; var32 >= 0; var32--) {
            String var33;
            if (!class311.method3885(method3252(arg0), var32) && arg0.field3664 == null) {
                var33 = null;
            } else if (arg0.field3705 == null || arg0.field3705.length <= var32 || arg0.field3705[var32] == null || arg0.field3705[var32].trim().length() == 0) {
                var33 = null;
            } else {
                var33 = arg0.field3705[var32];
            }
            if (var33 != null) {
                method5103(var33, arg0.field3637, 57, var32 + 1, arg0.field3558, arg0.field3701, arg0.field3690, arg0.field3672);
            }
        }
        int var35 = method3252(arg0);
        boolean var36 = (var35 & 0x1) != 0;
        if (var36) {
            method4803(class330.field3844, "", 30, 0, arg0.field3558, arg0.field3701);
        }
    }

    @ObfuscatedName("ix.kq(ZB)V")
    public static void method4514(boolean arg0) {
        field619 = arg0;
    }

    @ObfuscatedName("mn.ks(B)Z")
    public static boolean method6220() {
        return field619;
    }

    @ObfuscatedName("ep.ky(IIIIIIII)V")
    public static final void method3005(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class310.method3100(arg0)) {
            method2234(Statics.field2984[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("ch.kj([Lkz;IIIIIIII)V")
    public static final void method2234(class310[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class310 var9 = arg0[var8];
            if (var9 != null && var9.field3571 == arg1 && (var9.method5679() || method3252(var9) != 0 || field674 == var9)) {
                if (var9.field3551) {
                    if (method3138(var9)) {
                        continue;
                    }
                } else if (var9.field3657 == 0 && Statics.field151 != var9 && method3138(var9)) {
                    continue;
                }
                if (var9.field3657 == 11) {
                    if (var9.method5692(Statics.field2910)) {
                        if (var9.method5821()) {
                            method2361(var9);
                            method4899(var9.field3694, var9, true);
                        }
                        if (var9.field3681 != null) {
                            class84 var10 = new class84();
                            var10.field1073 = var9;
                            var10.field1062 = var9.field3681;
                            field719.method6236(var10);
                        }
                    }
                } else if (var9.field3657 == 12 && var9.method5809()) {
                    method2361(var9);
                }
                int var11 = var9.field3565 + arg6;
                int var12 = var9.field3566 + arg7;
                int var13;
                int var14;
                int var15;
                int var16;
                if (var9.field3657 == 2) {
                    var13 = arg2;
                    var14 = arg3;
                    var15 = arg4;
                    var16 = arg5;
                } else if (var9.field3657 == 9) {
                    int var17 = var11;
                    int var18 = var12;
                    int var19 = var9.field3567 + var11;
                    int var20 = var9.field3568 + var12;
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
                    int var23 = var9.field3567 + var11;
                    int var24 = var9.field3568 + var12;
                    var13 = var11 > arg2 ? var11 : arg2;
                    var14 = var12 > arg3 ? var12 : arg3;
                    var15 = var23 < arg4 ? var23 : arg4;
                    var16 = var24 < arg5 ? var24 : arg5;
                }
                if (field688 == var9) {
                    field696 = true;
                    field736 = var11;
                    field555 = var12;
                }
                boolean var25 = false;
                if (var9.field3632) {
                    switch(field799) {
                        case 0:
                            var25 = true;
                        case 1:
                        default:
                            break;
                        case 2:
                            if (var9.field3701 >>> 16 == field678) {
                                var25 = true;
                            }
                            break;
                        case 3:
                            if (field678 == var9.field3701) {
                                var25 = true;
                            }
                    }
                }
                if (var25 || !var9.field3551 || var13 < var15 && var14 < var16) {
                    if (var9.field3551) {
                        if (var9.field3610) {
                            if (class36.field251 >= var13 && class36.field252 >= var14 && class36.field251 < var15 && class36.field252 < var16) {
                                for (class84 var26 = (class84) field719.method6241(); var26 != null; var26 = (class84) field719.method6248()) {
                                    if (var26.field1059) {
                                        var26.method7431();
                                        var26.field1073.field3553 = false;
                                    }
                                }
                                method5662();
                                if (Statics.field161 == 0) {
                                    field688 = null;
                                    field674 = null;
                                }
                                if (!field650) {
                                    method3259();
                                }
                            }
                        } else if (var9.field3684 && class36.field251 >= var13 && class36.field252 >= var14 && class36.field251 < var15 && class36.field252 < var16) {
                            for (class84 var27 = (class84) field719.method6241(); var27 != null; var27 = (class84) field719.method6248()) {
                                if (var27.field1059 && var27.field1073.field3666 == var27.field1062) {
                                    var27.method7431();
                                }
                            }
                        }
                    }
                    int var28 = class36.field251;
                    int var29 = class36.field252;
                    if (class36.field262 != 0) {
                        var28 = class36.field259;
                        var29 = class36.field260;
                    }
                    boolean var30 = var28 >= var13 && var29 >= var14 && var28 < var15 && var29 < var16;
                    if (var9.field3556 == 1337) {
                        if (!field510 && !field650 && var30) {
                            method2220(var28, var29, var13, var14);
                        }
                    } else if (var9.field3556 == 1338) {
                        method4298(var9, var11, var12);
                    } else {
                        if (var9.field3556 == 1400) {
                            Statics.field4300.method7521(class36.field251, class36.field252, var30, var11, var12, var9.field3567, var9.field3568);
                        }
                        if (!field650 && var30) {
                            if (var9.field3556 == 1400) {
                                Statics.field4300.method7516(var11, var12, var9.field3567, var9.field3568, var28, var29);
                            } else {
                                method2615(var9, var28 - var11, var29 - var12);
                            }
                        }
                        if (var25) {
                            for (int var31 = 0; var31 < var9.field3633.length; var31++) {
                                boolean var32 = false;
                                boolean var33 = false;
                                if (!var32 && var9.field3633[var31] != null) {
                                    for (int var34 = 0; var34 < var9.field3633[var31].length; var34++) {
                                        boolean var35 = false;
                                        if (var9.field3595 != null) {
                                            var35 = field703.method3820(var9.field3633[var31][var34]);
                                        }
                                        if (method3413(var9.field3633[var31][var34]) || var35) {
                                            var32 = true;
                                            if (var9.field3595 != null && var9.field3595[var31] > field511) {
                                                break;
                                            }
                                            byte var36 = var9.field3634[var31][var34];
                                            if (var36 == 0 || ((var36 & 0x8) == 0 || !field703.method3820(86) && !field703.method3820(82) && !field703.method3820(81)) && ((var36 & 0x2) == 0 || field703.method3820(86)) && ((var36 & 0x1) == 0 || field703.method3820(82)) && ((var36 & 0x4) == 0 || field703.method3820(81))) {
                                                var33 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (var33) {
                                    if (var31 < 10) {
                                        method212(var31 + 1, var9.field3701, var9.field3558, var9.field3690, "");
                                    } else if (var31 == 10) {
                                        method285();
                                        method3134(var9.field3701, var9.field3558, class311.method1993(method3252(var9)), var9.field3690);
                                        field673 = Statics.method5873(var9);
                                        if (field673 == null) {
                                            field673 = class330.field3846;
                                        }
                                        field605 = var9.field3637 + class97.method3021(16777215);
                                    }
                                    int var37 = var9.field3635[var31];
                                    if (var9.field3595 == null) {
                                        var9.field3595 = new int[var9.field3633.length];
                                    }
                                    if (var9.field3636 == null) {
                                        var9.field3636 = new int[var9.field3633.length];
                                    }
                                    if (var37 == 0) {
                                        var9.field3595[var31] = Integer.MAX_VALUE;
                                    } else if (var9.field3595[var31] == 0) {
                                        var9.field3595[var31] = field511 + var37 + var9.field3636[var31];
                                    } else {
                                        var9.field3595[var31] = field511 + var37;
                                    }
                                }
                                if (!var32 && var9.field3595 != null) {
                                    var9.field3595[var31] = 0;
                                }
                            }
                        }
                        if (var9.field3551) {
                            boolean var38;
                            if (class36.field251 >= var13 && class36.field252 >= var14 && class36.field251 < var15 && class36.field252 < var16) {
                                var38 = true;
                            } else {
                                var38 = false;
                            }
                            boolean var39 = false;
                            if ((class36.field250 == 1 || !Statics.field4559 && class36.field250 == 4) && var38) {
                                var39 = true;
                            }
                            boolean var40 = false;
                            if ((class36.field262 == 1 || !Statics.field4559 && class36.field262 == 4) && class36.field259 >= var13 && class36.field260 >= var14 && class36.field259 < var15 && class36.field260 < var16) {
                                var40 = true;
                            }
                            if (var40) {
                                method2807(var9, class36.field259 - var11, class36.field260 - var12);
                            }
                            if (var9.method5680()) {
                                if (var40) {
                                    field722.method6236(new class205(0, class36.field251 - var11, class36.field252 - var12, var9));
                                }
                                if (var39) {
                                    field722.method6236(new class205(1, class36.field251 - var11, class36.field252 - var12, var9));
                                }
                            }
                            if (var9.field3556 == 1400) {
                                Statics.field4300.method7465(var28, var29, var38 & var39, var38 & var40);
                            }
                            if (field688 != null && field688 != var9 && var38 && class311.method6061(method3252(var9))) {
                                field503 = var9;
                            }
                            if (field674 == var9) {
                                field693 = true;
                                field796 = var11;
                                field804 = var12;
                            }
                            if (var9.field3644) {
                                if (var38 && field587 != 0 && var9.field3666 != null) {
                                    class84 var41 = new class84();
                                    var41.field1059 = true;
                                    var41.field1073 = var9;
                                    var41.field1063 = field587;
                                    var41.field1062 = var9.field3666;
                                    field719.method6236(var41);
                                }
                                if (field688 != null || Statics.field2823 != null || field650) {
                                    var40 = false;
                                    var39 = false;
                                    var38 = false;
                                }
                                if (!var9.field3675 && var40) {
                                    var9.field3675 = true;
                                    if (var9.field3646 != null) {
                                        class84 var42 = new class84();
                                        var42.field1059 = true;
                                        var42.field1073 = var9;
                                        var42.field1069 = class36.field259 - var11;
                                        var42.field1063 = class36.field260 - var12;
                                        var42.field1062 = var9.field3646;
                                        field719.method6236(var42);
                                    }
                                }
                                if (var9.field3675 && var39 && var9.field3647 != null) {
                                    class84 var43 = new class84();
                                    var43.field1059 = true;
                                    var43.field1073 = var9;
                                    var43.field1069 = class36.field251 - var11;
                                    var43.field1063 = class36.field252 - var12;
                                    var43.field1062 = var9.field3647;
                                    field719.method6236(var43);
                                }
                                if (var9.field3675 && !var39) {
                                    var9.field3675 = false;
                                    if (var9.field3650 != null) {
                                        class84 var44 = new class84();
                                        var44.field1059 = true;
                                        var44.field1073 = var9;
                                        var44.field1069 = class36.field251 - var11;
                                        var44.field1063 = class36.field252 - var12;
                                        var44.field1062 = var9.field3650;
                                        field721.method6236(var44);
                                    }
                                }
                                if (var39 && var9.field3649 != null) {
                                    class84 var45 = new class84();
                                    var45.field1059 = true;
                                    var45.field1073 = var9;
                                    var45.field1069 = class36.field251 - var11;
                                    var45.field1063 = class36.field252 - var12;
                                    var45.field1062 = var9.field3649;
                                    field719.method6236(var45);
                                }
                                if (!var9.field3553 && var38) {
                                    var9.field3553 = true;
                                    if (var9.field3627 != null) {
                                        class84 var46 = new class84();
                                        var46.field1059 = true;
                                        var46.field1073 = var9;
                                        var46.field1069 = class36.field251 - var11;
                                        var46.field1063 = class36.field252 - var12;
                                        var46.field1062 = var9.field3627;
                                        field719.method6236(var46);
                                    }
                                }
                                if (var9.field3553 && var38 && var9.field3550 != null) {
                                    class84 var47 = new class84();
                                    var47.field1059 = true;
                                    var47.field1073 = var9;
                                    var47.field1069 = class36.field251 - var11;
                                    var47.field1063 = class36.field252 - var12;
                                    var47.field1062 = var9.field3550;
                                    field719.method6236(var47);
                                }
                                if (var9.field3553 && !var38) {
                                    var9.field3553 = false;
                                    if (var9.field3652 != null) {
                                        class84 var48 = new class84();
                                        var48.field1059 = true;
                                        var48.field1073 = var9;
                                        var48.field1069 = class36.field251 - var11;
                                        var48.field1063 = class36.field252 - var12;
                                        var48.field1062 = var9.field3652;
                                        field721.method6236(var48);
                                    }
                                }
                                if (var9.field3663 != null) {
                                    class84 var49 = new class84();
                                    var49.field1073 = var9;
                                    var49.field1062 = var9.field3663;
                                    field769.method6236(var49);
                                }
                                if (var9.field3600 != null && field505 > var9.field3698) {
                                    if (var9.field3658 == null || field505 - var9.field3698 > 32) {
                                        class84 var54 = new class84();
                                        var54.field1073 = var9;
                                        var54.field1062 = var9.field3600;
                                        field719.method6236(var54);
                                    } else {
                                        label654: for (int var50 = var9.field3698; var50 < field505; var50++) {
                                            int var51 = field701[var50 & 0x1F];
                                            for (int var52 = 0; var52 < var9.field3658.length; var52++) {
                                                if (var9.field3658[var52] == var51) {
                                                    class84 var53 = new class84();
                                                    var53.field1073 = var9;
                                                    var53.field1062 = var9.field3600;
                                                    field719.method6236(var53);
                                                    break label654;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3698 = field505;
                                }
                                if (var9.field3619 != null && field525 > var9.field3699) {
                                    if (var9.field3615 == null || field525 - var9.field3699 > 32) {
                                        class84 var59 = new class84();
                                        var59.field1073 = var9;
                                        var59.field1062 = var9.field3619;
                                        field719.method6236(var59);
                                    } else {
                                        label630: for (int var55 = var9.field3699; var55 < field525; var55++) {
                                            int var56 = field662[var55 & 0x1F];
                                            for (int var57 = 0; var57 < var9.field3615.length; var57++) {
                                                if (var9.field3615[var57] == var56) {
                                                    class84 var58 = new class84();
                                                    var58.field1073 = var9;
                                                    var58.field1062 = var9.field3619;
                                                    field719.method6236(var58);
                                                    break label630;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3699 = field525;
                                }
                                if (var9.field3661 != null && field706 > var9.field3700) {
                                    if (var9.field3662 == null || field706 - var9.field3700 > 32) {
                                        class84 var64 = new class84();
                                        var64.field1073 = var9;
                                        var64.field1062 = var9.field3661;
                                        field719.method6236(var64);
                                    } else {
                                        label606: for (int var60 = var9.field3700; var60 < field706; var60++) {
                                            int var61 = field705[var60 & 0x1F];
                                            for (int var62 = 0; var62 < var9.field3662.length; var62++) {
                                                if (var9.field3662[var62] == var61) {
                                                    class84 var63 = new class84();
                                                    var63.field1073 = var9;
                                                    var63.field1062 = var9.field3661;
                                                    field719.method6236(var63);
                                                    break label606;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3700 = field706;
                                }
                                if (field709 > var9.field3697 && var9.field3656 != null) {
                                    class84 var65 = new class84();
                                    var65.field1073 = var9;
                                    var65.field1062 = var9.field3656;
                                    field719.method6236(var65);
                                }
                                if (field710 > var9.field3697 && var9.field3671 != null) {
                                    class84 var66 = new class84();
                                    var66.field1073 = var9;
                                    var66.field1062 = var9.field3671;
                                    field719.method6236(var66);
                                }
                                if (field638 > var9.field3697 && var9.field3643 != null) {
                                    class84 var67 = new class84();
                                    var67.field1073 = var9;
                                    var67.field1062 = var9.field3643;
                                    field719.method6236(var67);
                                }
                                if (field695 > var9.field3697 && var9.field3673 != null) {
                                    class84 var68 = new class84();
                                    var68.field1073 = var9;
                                    var68.field1062 = var9.field3673;
                                    field719.method6236(var68);
                                }
                                if (field694 > var9.field3697 && var9.field3674 != null) {
                                    class84 var69 = new class84();
                                    var69.field1073 = var9;
                                    var69.field1062 = var9.field3674;
                                    field719.method6236(var69);
                                }
                                if (field714 > var9.field3697 && var9.field3679 != null) {
                                    class84 var70 = new class84();
                                    var70.field1073 = var9;
                                    var70.field1062 = var9.field3679;
                                    field719.method6236(var70);
                                }
                                if (field805 > var9.field3697 && var9.field3680 != null) {
                                    class84 var71 = new class84();
                                    var71.field1073 = var9;
                                    var71.field1062 = var9.field3680;
                                    field719.method6236(var71);
                                }
                                if (field762 > var9.field3697 && var9.field3581 != null) {
                                    class84 var72 = new class84();
                                    var72.field1073 = var9;
                                    var72.field1062 = var9.field3581;
                                    field719.method6236(var72);
                                }
                                var9.field3697 = field700;
                                if (var9.field3668 != null) {
                                    for (int var73 = 0; var73 < field760; var73++) {
                                        class84 var74 = new class84();
                                        var74.field1073 = var9;
                                        var74.field1066 = field746[var73];
                                        var74.field1067 = field754[var73];
                                        var74.field1062 = var9.field3668;
                                        field719.method6236(var74);
                                    }
                                }
                                if (var9.field3605 != null) {
                                    int[] var75 = field703.method3841();
                                    for (int var76 = 0; var76 < var75.length; var76++) {
                                        class84 var77 = new class84();
                                        var77.field1073 = var9;
                                        var77.field1066 = var75[var76];
                                        var77.field1062 = var9.field3605;
                                        field719.method6236(var77);
                                    }
                                }
                                if (var9.field3670 != null) {
                                    int[] var78 = field703.method3822();
                                    for (int var79 = 0; var79 < var78.length; var79++) {
                                        class84 var80 = new class84();
                                        var80.field1073 = var9;
                                        var80.field1066 = var78[var79];
                                        var80.field1062 = var9.field3670;
                                        field719.method6236(var80);
                                    }
                                }
                            }
                        }
                        if (!var9.field3551) {
                            if (field688 != null || Statics.field2823 != null || field650) {
                                continue;
                            }
                            if ((var9.field3659 >= 0 || var9.field3579 != 0) && class36.field251 >= var13 && class36.field252 >= var14 && class36.field251 < var15 && class36.field252 < var16) {
                                if (var9.field3659 >= 0) {
                                    Statics.field151 = arg0[var9.field3659];
                                } else {
                                    Statics.field151 = var9;
                                }
                            }
                            if (var9.field3657 == 8 && class36.field251 >= var13 && class36.field252 >= var14 && class36.field251 < var15 && class36.field252 < var16) {
                                Statics.field103 = var9;
                            }
                            if (var9.field3543 > var9.field3568) {
                                method1701(var9, var9.field3567 + var11, var12, var9.field3568, var9.field3543, class36.field251, class36.field252);
                            }
                        }
                        if (var9.field3657 == 0) {
                            method2234(arg0, var9.field3701, var13, var14, var15, var16, var11 - var9.field3573, var12 - var9.field3574);
                            if (var9.field3694 != null) {
                                method2234(var9.field3694, var9.field3701, var13, var14, var15, var16, var11 - var9.field3573, var12 - var9.field3574);
                            }
                            class83 var81 = (class83) field676.method7706((long) var9.field3701);
                            if (var81 != null) {
                                if (var81.field1054 == 0 && class36.field251 >= var13 && class36.field252 >= var14 && class36.field251 < var15 && class36.field252 < var16 && !field650) {
                                    for (class84 var82 = (class84) field719.method6241(); var82 != null; var82 = (class84) field719.method6248()) {
                                        if (var82.field1059) {
                                            var82.method7431();
                                            var82.field1073.field3553 = false;
                                        }
                                    }
                                    if (Statics.field161 == 0) {
                                        field688 = null;
                                        field674 = null;
                                    }
                                    if (!field650) {
                                        method3259();
                                    }
                                }
                                method3005(var81.field1055, var13, var14, var15, var16, var11, var12);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("gq.kk(II)Z")
    public static boolean method3413(int arg0) {
        for (int var1 = 0; var1 < field760; var1++) {
            if (field746[var1] == arg0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("eg.kt(IIB)V")
    public static final void method3017(int arg0, int arg1) {
        if (class310.method3100(arg0)) {
            method2980(Statics.field2984[arg0], arg1);
        }
    }

    @ObfuscatedName("eq.kd([Lkz;IB)V")
    public static final void method2980(class310[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class310 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field3657 == 0) {
                    if (var3.field3694 != null) {
                        method2980(var3.field3694, arg1);
                    }
                    class83 var4 = (class83) field676.method7706((long) var3.field3701);
                    if (var4 != null) {
                        method3017(var4.field1055, arg1);
                    }
                }
                if (arg1 == 0 && var3.field3685 != null) {
                    class84 var5 = new class84();
                    var5.field1073 = var3;
                    var5.field1062 = var3.field3685;
                    class67.method4946(var5);
                }
                if (arg1 == 1 && var3.field3651 != null) {
                    if (var3.field3558 >= 0) {
                        class310 var6 = class310.method2952(var3.field3701);
                        if (var6 == null || var6.field3694 == null || var3.field3558 >= var6.field3694.length || var6.field3694[var3.field3558] != var3) {
                            continue;
                        }
                    }
                    class84 var7 = new class84();
                    var7.field1073 = var3;
                    var7.field1062 = var3.field3651;
                    class67.method4946(var7);
                }
            }
        }
    }

    @ObfuscatedName("do.kv(Lkz;III)V")
    public static final void method2807(class310 arg0, int arg1, int arg2) {
        if (field688 != null || field650 || arg0 == null || method4495(arg0) == null) {
            return;
        }
        field688 = arg0;
        field674 = method4495(arg0);
        field802 = arg1;
        field691 = arg2;
        Statics.field161 = 0;
        field517 = false;
        int var3 = field651 - 1;
        if (var3 != -1) {
            method485(var3);
        }
    }

    @ObfuscatedName("client.kx(I)V")
    public final void method1641() {
        method2361(field688);
        Statics.field161++;
        if (field696 && field693) {
            int var1 = class36.field251;
            int var2 = class36.field252;
            int var3 = var1 - field802;
            int var4 = var2 - field691;
            if (var3 < field796) {
                var3 = field796;
            }
            if (field688.field3567 + var3 > field796 + field674.field3567) {
                var3 = field796 + field674.field3567 - field688.field3567;
            }
            if (var4 < field804) {
                var4 = field804;
            }
            if (field688.field3568 + var4 > field804 + field674.field3568) {
                var4 = field804 + field674.field3568 - field688.field3568;
            }
            int var5 = var3 - field736;
            int var6 = var4 - field555;
            int var7 = field688.field3640;
            if (Statics.field161 > field688.field3706 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field517 = true;
            }
            int var8 = field674.field3573 + (var3 - field796);
            int var9 = field674.field3574 + (var4 - field804);
            if (field688.field3653 != null && field517) {
                class84 var10 = new class84();
                var10.field1073 = field688;
                var10.field1069 = var8;
                var10.field1063 = var9;
                var10.field1062 = field688.field3653;
                class67.method4946(var10);
            }
            if (class36.field250 == 0) {
                if (field517) {
                    if (field688.field3654 != null) {
                        class84 var11 = new class84();
                        var11.field1073 = field688;
                        var11.field1069 = var8;
                        var11.field1063 = var9;
                        var11.field1065 = field503;
                        var11.field1062 = field688.field3654;
                        class67.method4946(var11);
                    }
                    if (field503 != null) {
                        class310 var12 = field688;
                        int var13 = class311.method3127(method3252(var12));
                        class310 var14;
                        if (var13 == 0) {
                            var14 = null;
                        } else {
                            int var15 = 0;
                            while (true) {
                                if (var15 >= var13) {
                                    var14 = var12;
                                    break;
                                }
                                var12 = class310.method2952(var12.field3571);
                                if (var12 == null) {
                                    var14 = null;
                                    break;
                                }
                                var15++;
                            }
                        }
                        if (var14 != null) {
                            class282 var16 = class282.method4287(class280.field3120, field689.field1390);
                            var16.field3187.method7950(field688.field3690);
                            var16.field3187.method8048(field503.field3701);
                            var16.field3187.method7950(field503.field3558);
                            var16.field3187.method8004(field503.field3690);
                            var16.field3187.method7950(field688.field3558);
                            var16.field3187.method7968(field688.field3701);
                            field689.method2694(var16);
                        }
                    }
                } else if (this.method1168()) {
                    this.method1282(field802 + field736, field691 + field555);
                } else if (field651 > 0) {
                    method5886(field802 + field736, field691 + field555);
                }
                field688 = null;
            }
        } else if (Statics.field161 > 1) {
            if (!field517 && field651 > 0) {
                method5886(field802 + field736, field691 + field555);
            }
            field688 = null;
        }
    }

    @ObfuscatedName("at.kb(IB)V")
    public static void method485(int arg0) {
        Statics.field1702 = new class70();
        Statics.field1702.field887 = field652[arg0];
        Statics.field1702.field888 = field758[arg0];
        Statics.field1702.field892 = field654[arg0];
        Statics.field1702.field890 = field655[arg0];
        Statics.field1702.field891 = field656[arg0];
        Statics.field1702.field894 = field720[arg0];
        Statics.field1702.field893 = field658[arg0];
    }

    @ObfuscatedName("ls.ke(III)V")
    public static void method5886(int arg0, int arg1) {
        class70 var2 = Statics.field1702;
        if (var2 != null) {
            method3245(var2.field887, var2.field888, var2.field892, var2.field890, var2.field891, var2.field894, var2.field893, arg0, arg1);
        }
        Statics.field1702 = null;
    }

    @ObfuscatedName("ca.ko(Lkz;I)V")
    public static void method2361(class310 arg0) {
        if (arg0 != null && field725 == arg0.field3702) {
            field726[arg0.field3552] = true;
        }
    }

    @ObfuscatedName("de.km(I)V")
    public static void method2892() {
        for (class83 var0 = (class83) field676.method7708(); var0 != null; var0 = (class83) field676.method7709()) {
            int var1 = var0.field1055;
            if (class310.method3100(var1)) {
                boolean var2 = true;
                class310[] var3 = Statics.field2984[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field3551;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field4711;
                    class310 var6 = class310.method2952(var5);
                    if (var6 != null) {
                        method2361(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ij.kr(Lkz;I)Lkz;")
    public static class310 method4495(class310 arg0) {
        class310 var1 = arg0;
        int var2 = class311.method3127(method3252(arg0));
        class310 var3;
        if (var2 == 0) {
            var3 = null;
        } else {
            int var4 = 0;
            while (true) {
                if (var4 >= var2) {
                    var3 = var1;
                    break;
                }
                var1 = class310.method2952(var1.field3571);
                if (var1 == null) {
                    var3 = null;
                    break;
                }
                var4++;
            }
        }
        class310 var5 = var3;
        if (var3 == null) {
            var5 = arg0.field3639;
        }
        return var5;
    }

    @ObfuscatedName("ek.kc(IB)V")
    public static final void method3104(int arg0) {
        if (!class310.method3100(arg0)) {
            return;
        }
        class310[] var1 = Statics.field2984[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class310 var3 = var1[var2];
            if (var3 != null) {
                var3.field3692 = 0;
                var3.field3693 = 0;
            }
        }
    }

    @ObfuscatedName("oq.kn([Lkz;II)V")
    public static final void method6908(class310[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class310 var3 = arg0[var2];
            if (var3 != null && var3.field3571 == arg1 && (!var3.field3551 || !method3138(var3))) {
                if (var3.field3657 == 0) {
                    if (!var3.field3551 && method3138(var3) && Statics.field151 != var3) {
                        continue;
                    }
                    method6908(arg0, var3.field3701);
                    if (var3.field3694 != null) {
                        method6908(var3.field3694, var3.field3701);
                    }
                    class83 var4 = (class83) field676.method7706((long) var3.field3701);
                    if (var4 != null) {
                        int var5 = var4.field1055;
                        if (class310.method3100(var5)) {
                            method6908(Statics.field2984[var5], -1);
                        }
                    }
                }
                if (var3.field3657 == 6) {
                    if (var3.field3704 != -1 || var3.field3601 != -1) {
                        boolean var6 = method2793(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field3601;
                        } else {
                            var7 = var3.field3704;
                        }
                        if (var7 != -1) {
                            class203 var8 = class203.method2227(var7);
                            if (var8.method3769()) {
                                var3.field3692 += field575;
                                int var9 = var8.method3754();
                                if (var3.field3692 >= var9) {
                                    var3.field3692 -= var8.field2282;
                                    if (var3.field3692 < 0 || var3.field3692 >= var9) {
                                        var3.field3692 = 0;
                                    }
                                }
                                method2361(var3);
                            } else {
                                var3.field3693 += field575;
                                while (var3.field3693 > var8.field2296[var3.field3692]) {
                                    var3.field3693 -= var8.field2296[var3.field3692];
                                    var3.field3692++;
                                    if (var3.field3692 >= var8.field2283.length) {
                                        var3.field3692 -= var8.field2282;
                                        if (var3.field3692 < 0 || var3.field3692 >= var8.field2283.length) {
                                            var3.field3692 = 0;
                                        }
                                    }
                                    method2361(var3);
                                }
                            }
                        }
                    }
                    if (var3.field3586 != 0 && !var3.field3551) {
                        int var10 = var3.field3586 >> 16;
                        int var11 = var3.field3586 << 16 >> 16;
                        int var12 = field575 * var10;
                        int var13 = field575 * var11;
                        var3.field3604 = var3.field3604 + var12 & 0x7FF;
                        var3.field3677 = var3.field3677 + var13 & 0x7FF;
                        method2361(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ca.kl(IS)V")
    public static final void method2347(int arg0) {
        int var1 = Math.max(Math.min(arg0, 100), 0);
        int var2 = 100 - var1;
        float var3 = (float) var2 / 200.0F + 0.5F;
        class217.method4070((double) var3);
        ((class226) Statics.field2512).method4309((double) var3);
        class201.field2214.method5033();
        Statics.field1404.method2467((double) var3);
    }

    @ObfuscatedName("qn.ka(I)I")
    public static final int method7836() {
        float var0 = 200.0F * ((float) Statics.field1404.method2441() - 0.5F);
        return 100 - Math.round(var0);
    }

    @ObfuscatedName("cb.kp(D)V")
    public static final void method2324(double arg0) {
        class217.method4070(arg0);
        ((class226) Statics.field2512).method4309(arg0);
        class201.field2214.method5033();
        Statics.field1404.method2467(arg0);
    }

    @ObfuscatedName("cl.kh(II)V")
    public static final void method2259(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 255);
        if (var1 == Statics.field1404.method2379()) {
            return;
        }
        if (Statics.field1404.method2379() == 0 && field723 != -1) {
            class291.method3020(Statics.field1761, field723, 0, var1, false);
            field672 = false;
        } else if (var1 == 0) {
            class291.method3262();
            field672 = false;
        } else if (class291.field3359 == 0) {
            Statics.field3361.method5197(var1);
        } else {
            Statics.field3358 = var1;
        }
        Statics.field1404.method2417(var1);
    }

    @ObfuscatedName("gm.kz(II)V")
    public static final void method3808(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field1404.method2461(var1);
    }

    @ObfuscatedName("cf.kw(II)V")
    public static final void method2552(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field1404.method2365(var1);
    }

    @ObfuscatedName("ap.kg(IB)V")
    public static final void method690(int arg0) {
        method2892();
        for (class66 var1 = (class66) class66.field847.method6241(); var1 != null; var1 = (class66) class66.field847.method6248()) {
            if (var1.field837 != null) {
                var1.method1822();
            }
        }
        int var2 = class182.method3231(arg0).field1929;
        if (var2 == 0) {
            return;
        }
        int var3 = class300.field3459[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class217.method4070(0.9D);
                ((class226) Statics.field2512).method4309(0.9D);
                class201.field2214.method5033();
                Statics.field1404.method2467(0.9D);
            }
            if (var3 == 2) {
                class217.method4070(0.8D);
                ((class226) Statics.field2512).method4309(0.8D);
                class201.field2214.method5033();
                Statics.field1404.method2467(0.8D);
            }
            if (var3 == 3) {
                class217.method4070(0.7D);
                ((class226) Statics.field2512).method4309(0.7D);
                class201.field2214.method5033();
                Statics.field1404.method2467(0.7D);
            }
            if (var3 == 4) {
                method2324(0.6D);
            }
        }
        if (var2 == 3) {
            if (var3 == 0) {
                method2259(255);
            }
            if (var3 == 1) {
                method2259(192);
            }
            if (var3 == 2) {
                method2259(128);
            }
            if (var3 == 3) {
                method2259(64);
            }
            if (var3 == 4) {
                method2259(0);
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                method3808(127);
            }
            if (var3 == 1) {
                method3808(96);
            }
            if (var3 == 2) {
                method3808(64);
            }
            if (var3 == 3) {
                method3808(32);
            }
            if (var3 == 4) {
                method3808(0);
            }
        }
        if (var2 == 5) {
            field649 = var3 == 1;
        }
        if (var2 == 6) {
            field538 = var3;
        }
        if (var2 == 9) {
            field680 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                method2552(127);
            }
            if (var3 == 1) {
                method2552(96);
            }
            if (var3 == 2) {
                method2552(64);
            }
            if (var3 == 3) {
                method2552(32);
            }
            if (var3 == 4) {
                method2552(0);
            }
        }
        if (var2 == 17) {
            field791 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            field777 = (class99) class351.method19(class99.method4643(), var3);
            if (field777 == null) {
                field777 = class99.field1317;
            }
        }
        if (var2 == 19) {
            if (var3 == -1) {
                field641 = -1;
            } else {
                field641 = var3 & 0x7FF;
            }
        }
        if (var2 == 22) {
            field527 = (class99) class351.method19(class99.method4643(), var3);
            if (field527 == null) {
                field527 = class99.field1317;
            }
        }
    }

    @ObfuscatedName("rn.lj(Lkz;I)V")
    public static final void method7892(class310 arg0) {
        int var1 = arg0.field3556;
        if (var1 == 324) {
            if (field788 == -1) {
                field788 = arg0.field3587;
                field789 = arg0.field3588;
            }
            if (field787.field3492 == 1) {
                arg0.field3587 = field788;
            } else {
                arg0.field3587 = field789;
            }
        } else if (var1 == 325) {
            if (field788 == -1) {
                field788 = arg0.field3587;
                field789 = arg0.field3588;
            }
            if (field787.field3492 == 1) {
                arg0.field3587 = field789;
            } else {
                arg0.field3587 = field788;
            }
        } else if (var1 == 327) {
            arg0.field3604 = 150;
            arg0.field3677 = (int) (Math.sin((double) field511 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3596 = 5;
            arg0.field3597 = 0;
        } else if (var1 == 328) {
            arg0.field3604 = 150;
            arg0.field3677 = (int) (Math.sin((double) field511 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3596 = 5;
            arg0.field3597 = 1;
        }
    }

    @ObfuscatedName("ah.lh(B)V")
    public static final void method842() {
        class282 var0 = class282.method4287(class280.field3098, field689.field1390);
        field689.method2694(var0);
        class67.field867 = true;
        for (class83 var1 = (class83) field676.method7708(); var1 != null; var1 = (class83) field676.method7709()) {
            if (var1.field1054 == 0 || var1.field1054 == 3) {
                method107(var1, true);
            }
        }
        if (field697 != null) {
            method2361(field697);
            field697 = null;
        }
        class67.field867 = false;
    }

    @ObfuscatedName("mm.lc(IIII)Lcq;")
    public static final class83 method6223(int arg0, int arg1, int arg2) {
        class83 var3 = new class83();
        var3.field1055 = arg1;
        var3.field1054 = arg2;
        field676.method7716(var3, (long) arg0);
        method3104(arg1);
        class310 var4 = class310.method2952(arg0);
        method2361(var4);
        if (field697 != null) {
            method2361(field697);
            field697 = null;
        }
        method4899(Statics.field2984[arg0 >> 16], var4, false);
        class67.method843(arg1);
        if (field675 != -1) {
            method3017(field675, 1);
        }
        return var3;
    }

    @ObfuscatedName("c.lw(Lcq;ZI)V")
    public static final void method107(class83 arg0, boolean arg1) {
        int var2 = arg0.field1055;
        int var3 = (int) arg0.field4711;
        arg0.method7431();
        if (arg1 && var2 != -1 && Statics.field4692[var2]) {
            Statics.field1433.method5973(var2);
            if (Statics.field2984[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2984[var2].length; var5++) {
                    if (Statics.field2984[var2][var5] != null) {
                        if (Statics.field2984[var2][var5].field3657 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2984[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2984[var2] = null;
                }
                Statics.field4692[var2] = false;
            }
        }
        method6086(var2);
        class310 var6 = class310.method2952(var3);
        if (var6 != null) {
            method2361(var6);
        }
        if (field675 != -1) {
            method3017(field675, 1);
        }
    }

    @ObfuscatedName("jm.lk(Lkz;I)Z")
    public static final boolean method5039(class310 arg0) {
        int var1 = arg0.field3556;
        if (var1 == 205) {
            field610 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field787.method5354(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field787.method5355(var4, var5 == 1);
        }
        if (var1 == 324) {
            field787.method5368(0);
        }
        if (var1 == 325) {
            field787.method5368(1);
        }
        if (var1 == 326) {
            class282 var6 = class282.method4287(class280.field3102, field689.field1390);
            field787.method5358(var6.field3187);
            field689.method2694(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("gv.lf(Lkz;IIII)V")
    public static final void method3868(class310 arg0, int arg1, int arg2, int arg3) {
        class299 var4 = arg0.method5677(false);
        if (var4 == null) {
            return;
        }
        if (field671 < 3) {
            Statics.field338.method8442(arg1, arg2, var4.field3454, var4.field3452, 25, 25, field583, 256, var4.field3451, var4.field3453);
        } else {
            class484.method8335(arg1, arg2, 0, var4.field3451, var4.field3453);
        }
    }

    @ObfuscatedName("mz.ls(IIIILrs;Lkb;I)V")
    public static final void method6401(int arg0, int arg1, int arg2, int arg3, class488 arg4, class299 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            Statics.method460(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field583 & 0x7FF;
        int var8 = class217.field2515[var7];
        int var9 = class217.field2516[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field3454 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field3192.method8419(arg5.field3454 / 2 + arg0 - var17 / 2 + var15, arg5.field3452 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("qy.lb(I)V")
    public static final void method7668() {
        Iterator var0 = class106.field1381.iterator();
        while (var0.hasNext()) {
            class61 var1 = (class61) var0.next();
            var1.method1095();
        }
        if (Statics.field4903 != null) {
            Statics.field4903.method6963();
        }
    }

    @ObfuscatedName("ji.lz(B)V")
    public static final void method5062() {
        for (int var0 = 0; var0 < class103.field1343; var0++) {
            class88 var1 = field621[class103.field1350[var0]];
            var1.method2266();
        }
    }

    @ObfuscatedName("df.la(I)V")
    public static final void method2786() {
        field710 = field700;
    }

    @ObfuscatedName("ew.lp(I)V")
    public static final void method2989() {
        field638 = field700;
        Statics.field2939 = true;
    }

    @ObfuscatedName("ah.le(I)V")
    public static final void method834() {
        field695 = field700;
        Statics.field2117 = true;
    }

    @ObfuscatedName("fe.lr(Ljava/lang/String;B)V")
    public static final void method3137(String arg0) {
        if (Statics.field4903 != null) {
            class282 var1 = class282.method4287(class280.field3067, field689.field1390);
            var1.field3187.method7947(class474.method2557(arg0));
            var1.field3187.method7954(arg0);
            field689.method2694(var1);
        }
    }

    @ObfuscatedName("eb.ll(Ljava/lang/String;B)V")
    public static final void method3071(String arg0) {
        if (!arg0.equals("")) {
            class282 var1 = class282.method4287(class280.field3161, field689.field1390);
            var1.field3187.method7947(class474.method2557(arg0));
            var1.field3187.method7954(arg0);
            field689.method2694(var1);
        }
    }

    @ObfuscatedName("mi.lt(I)V")
    public static final void method6168() {
        class282 var0 = class282.method4287(class280.field3161, field689.field1390);
        var0.field3187.method7947(0);
        field689.method2694(var0);
    }

    @ObfuscatedName("lh.lq(III)V")
    public static final void method5870(int arg0, int arg1) {
        class160 var2 = arg0 >= 0 ? field749[arg0] : Statics.field5003;
        if (var2 == null || arg1 < 0 || arg1 >= var2.method3120()) {
            return;
        }
        class142 var3 = (class142) var2.field1794.get(arg1);
        if (var3.field1657 != -1) {
            return;
        }
        String var4 = var3.field1656.method8556();
        class282 var5 = class282.method4287(class280.field3096, field689.field1390);
        var5.field3187.method7947(3 + class474.method2557(var4));
        var5.field3187.method7947(arg0);
        var5.field3187.method7950(arg1);
        var5.field3187.method7954(var4);
        field689.method2694(var5);
    }

    @ObfuscatedName("cl.lo(III)V")
    public static final void method2257(int arg0, int arg1) {
        if (field749[arg0] == null || arg1 < 0 || arg1 >= field749[arg0].method3120()) {
            return;
        }
        class142 var2 = (class142) field749[arg0].field1794.get(arg1);
        if (var2.field1657 != -1) {
            return;
        }
        class282 var3 = class282.method4287(class280.field3075, field689.field1390);
        var3.field3187.method7947(3 + class474.method2557(var2.field1656.method8556()));
        var3.field3187.method7947(arg0);
        var3.field3187.method7950(arg1);
        var3.field3187.method7954(var2.field1656.method8556());
        field689.method2694(var3);
    }

    @ObfuscatedName("df.lu(IIZI)V")
    public static final void method2787(int arg0, int arg1, boolean arg2) {
        if (field749[arg0] == null || arg1 < 0 || arg1 >= field749[arg0].method3120()) {
            return;
        }
        class142 var3 = (class142) field749[arg0].field1794.get(arg1);
        class282 var4 = class282.method4287(class280.field3086, field689.field1390);
        var4.field3187.method7947(4 + class474.method2557(var3.field1656.method8556()));
        var4.field3187.method7947(arg0);
        var4.field3187.method7950(arg1);
        var4.field3187.method7953(arg2);
        var4.field3187.method7954(var3.field1656.method8556());
        field689.method2694(var4);
    }

    @ObfuscatedName("mk.lx(IB)V")
    public static void method6086(int arg0) {
        for (class439 var1 = (class439) field690.method7708(); var1 != null; var1 = (class439) field690.method7709()) {
            if ((var1.field4711 >> 48 & 0xFFFFL) == (long) arg0) {
                var1.method7431();
            }
        }
    }

    @ObfuscatedName("fv.li(Lkz;I)I")
    public static int method3252(class310 arg0) {
        class439 var1 = (class439) field690.method7706(((long) arg0.field3701 << 32) + (long) arg0.field3558);
        return var1 == null ? arg0.field3631 : var1.field4708;
    }

    @ObfuscatedName("fe.lm(Lkz;I)Z")
    public static boolean method3138(class310 arg0) {
        return arg0.field3708;
    }

    @ObfuscatedName("kw.ln(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method5826(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field499 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field499 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field499 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field499 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field499 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field4624 != null) {
            var3 = "/p=" + Statics.field4624;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + Statics.field268 + "/a=" + Statics.field487 + var3 + "/";
    }

    @ObfuscatedName("gj.lv(Ljava/lang/String;I)V")
    public static void method3419(String arg0) {
        Statics.field4624 = arg0;
        try {
            String var1 = Statics.field427.getParameter(Integer.toString(18));
            String var2 = Statics.field427.getParameter(Integer.toString(13));
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                String var5 = var3 + "; Expires=";
                long var6 = class287.method3099() + 94608000000L;
                class315.field3730.setTime(new Date(var6));
                int var8 = class315.field3730.get(7);
                int var9 = class315.field3730.get(5);
                int var10 = class315.field3730.get(2);
                int var11 = class315.field3730.get(1);
                int var12 = class315.field3730.get(11);
                int var13 = class315.field3730.get(12);
                int var14 = class315.field3730.get(13);
                String var15 = class315.field3725[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + class315.field3724[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT";
                var4 = var5 + var15 + "; Max-Age=" + 94608000L;
            }
            class27.method380(Statics.field427, "document.cookie=\"" + var4 + "\"");
        } catch (Throwable var17) {
        }
    }

    @ObfuscatedName("nh.mk(Ljava/lang/String;ZI)V")
    public static void method6835(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field2240; var5++) {
            class201 var6 = class201.method2583(var5);
            if ((!arg1 || var6.field2261) && var6.field2205 == -1 && var6.field2266.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field4441 = -1;
                    Statics.field2116 = null;
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
        Statics.field2116 = var3;
        Statics.field2825 = 0;
        Statics.field4441 = var4;
        String[] var9 = new String[Statics.field4441];
        for (int var10 = 0; var10 < Statics.field4441; var10++) {
            var9[var10] = class201.method2583(var3[var10]).field2266;
        }
        short[] var11 = Statics.field2116;
        class471.method4940(var9, var11, 0, var9.length - 1);
    }

    @ObfuscatedName("c.mw(Lrd;II)V")
    public static void method88(class474 arg0, int arg1) {
        byte[] var2 = arg0.field4936;
        if (field554 == null) {
            field554 = new byte[24];
        }
        class378.method6754(var2, arg1, field554, 0, 24);
        class170.method6213(arg0, arg1);
    }

    @ObfuscatedName("dr.mp(Lrd;B)V")
    public static void method2801(class474 arg0) {
        if (field554 == null) {
            byte[] var1 = class170.method5889();
            arg0.method7957(var1, 0, var1.length);
        } else {
            arg0.method7957(field554, 0, field554.length);
        }
    }

    @ObfuscatedName("client.ma(I)Lsi;")
    public class497 method1173() {
        return Statics.field4508 == null ? null : Statics.field4508.field1115;
    }

    @ObfuscatedName("fq.mg(IIIZI)V")
    public static void method3232(int arg0, int arg1, int arg2, boolean arg3) {
        class282 var4 = class282.method4287(class280.field3091, field689.field1390);
        var4.field3187.method7994(arg2);
        var4.field3187.method8004(arg1);
        var4.field3187.method8003(arg0);
        var4.field3187.method8016(arg3 ? field595 : 0);
        field689.method2694(var4);
    }

    @ObfuscatedName("dg.ml(II)V")
    public static void method2759(int arg0) {
        field507 = arg0;
    }

    @ObfuscatedName("ae.mv(I)V")
    public static void method823() {
        if (field507 == 1) {
            field596 = true;
        }
    }

    @ObfuscatedName("bi.mi(B)V")
    public static void method1143() {
        if (!field596 || Statics.field4508 == null) {
            return;
        }
        int var0 = Statics.field4508.field1210[0];
        int var1 = Statics.field4508.field1232[0];
        if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) {
            return;
        }
        Statics.field2908 = Statics.field4508.field1204;
        int var2 = method6114(Statics.field4508.field1204, Statics.field4508.field1161, Statics.field1370) - field589;
        if (var2 < Statics.field4574) {
            Statics.field4574 = var2;
        }
        Statics.field1461 = Statics.field4508.field1161;
        field596 = false;
    }

    @ObfuscatedName("i.mx(Ljava/lang/String;B)Ljava/lang/String;")
    public static String method43(String arg0) {
        class332[] var1 = class332.method2185();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class332 var3 = var1[var2];
            if (var3.field4187 != -1 && arg0.startsWith(class97.method1829(var3.field4187))) {
                arg0 = arg0.substring(6 + Integer.toString(var3.field4187).length());
                break;
            }
        }
        return arg0;
    }

    @ObfuscatedName("iu.mu(B)V")
    public static void method4497() {
        if (Statics.field1634 == null) {
            return;
        }
        field797 = field511;
        Statics.field1634.method6200();
        for (int var0 = 0; var0 < field621.length; var0++) {
            if (field621[var0] != null) {
                Statics.field1634.method6185((field621[var0].field1204 >> 7) + Statics.field2118, (field621[var0].field1161 >> 7) + Statics.field565);
            }
        }
    }

    @ObfuscatedName("eb.md(B)Z")
    public static boolean method3092() {
        return Statics.field1404.method2387() >= field502;
    }

    @ObfuscatedName("on.mb(I)V")
    public static void method6984() {
        Statics.field1404.method2386(field502);
    }

    @ObfuscatedName("mm.mq(IB)V")
    public static void method6222(int arg0) {
        if (field743 != arg0) {
            field743 = arg0;
        }
    }

    @ObfuscatedName("gs.mn(ZI)V")
    public static void method3508(boolean arg0) {
        field649 = arg0;
    }

    @ObfuscatedName("bv.mm(IB)Lqc;")
    public static class468 method2174(int arg0) {
        class468 var1 = (class468) field513.method5028((long) arg0);
        if (var1 == null) {
            var1 = new class468(Statics.field133, class470.method4524(arg0), class470.method5217(arg0));
            field513.method5027(var1, (long) arg0);
        }
        return var1;
    }

    @ObfuscatedName("fb.ms(IB)Lqc;")
    public static class468 method3269(int arg0) {
        class468 var1 = (class468) field795.method5028((long) arg0);
        if (var1 == null) {
            var1 = new class468(Statics.field133, arg0);
        }
        return var1;
    }

    @ObfuscatedName("b.my(B)Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard method163() {
        return Statics.field427.method495();
    }

    @ObfuscatedName("lm.mo(II)V")
    public static void method5968(int arg0) {
        class203 var1 = class203.method2227(arg0);
        if (var1.method3769() && class203.method1997(var1.field2290) == 2) {
            field798.add(var1.field2290);
        }
    }
}
